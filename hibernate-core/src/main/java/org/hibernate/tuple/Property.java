/*
 * Hibernate, Relational Persistence for Idiomatic Java
 *
 * Copyright (c) 2008, Red Hat Middleware LLC or third-party contributors as
 * indicated by the @author tags or express copyright attribution
 * statements applied by the authors.  All third-party contributions are
 * distributed under license by Red Hat Middleware LLC.
 *
 * This copyrighted material is made available to anyone wishing to use, modify,
 * copy, or redistribute it subject to the terms and conditions of the GNU
 * Lesser General Public License, as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY
 * or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this distribution; if not, write to:
 * Free Software Foundation, Inc.
 * 51 Franklin Street, Fifth Floor
 * Boston, MA  02110-1301  USA
 *
 */
package org.hibernate.tuple;
import java.io.Serializable;
import org.hibernate.type.Type;

/**
 * Defines the basic contract of a Property within the runtime metamodel.
 *
 * @author Steve Ebersole
 */
public abstract class Property implements Serializable {
	private String name;
	private String node;
	private Type type;

	/**
	 * Constructor for Property instances.
	 *
	 * @param name The name by which the property can be referenced within
	 * its owner.
	 * @param node The node name to use for XML-based representation of this
	 * property.
	 * @param type The Hibernate Type of this property.
	 */
	protected Property(String name, String node, Type type) {
		this.name = name;
		this.node = node;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public String getNode() {
		return node;
	}

	public Type getType() {
		return type;
	}
	
	public String toString() {
		return "Property(" + name + ':' + type.getName() + ')';
	}

}
