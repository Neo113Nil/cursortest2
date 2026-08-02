package com.google.common.collect;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class SingletonImmutableSet extends ImmutableSet {
    public final transient Object element;

    public SingletonImmutableSet(Object obj) {
        obj.getClass();
        this.element = obj;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public final ImmutableList asList() {
        return ImmutableList.of(this.element);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.element.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(int i, Object[] objArr) {
        objArr[i] = this.element;
        return i + 1;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.element.hashCode();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final UnmodifiableIterator iterator() {
        return Maps.singletonIterator(this.element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.element.toString() + ']';
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return Maps.singletonIterator(this.element);
    }
}
