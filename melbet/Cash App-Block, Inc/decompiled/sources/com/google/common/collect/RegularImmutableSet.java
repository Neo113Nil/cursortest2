package com.google.common.collect;

import androidx.core.os.BundleKt;

/* loaded from: classes.dex */
public final class RegularImmutableSet extends ImmutableSet {
    public static final RegularImmutableSet EMPTY;
    public static final Object[] EMPTY_ARRAY;
    public final transient Object[] elements;
    public final transient int hashCode;
    public final transient int mask;
    public final transient int size;
    public final transient Object[] table;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY = new RegularImmutableSet(0, 0, 0, objArr, objArr);
    }

    public RegularImmutableSet(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        this.elements = objArr;
        this.hashCode = i;
        this.table = objArr2;
        this.mask = i2;
        this.size = i3;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.table;
            if (objArr.length != 0) {
                int smearedHash = BundleKt.smearedHash(obj);
                while (true) {
                    int i = smearedHash & this.mask;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    smearedHash = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(int i, Object[] objArr) {
        Object[] objArr2 = this.elements;
        int i2 = this.size;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // com.google.common.collect.ImmutableSet
    public final ImmutableList createAsList() {
        return ImmutableList.asImmutableList(this.size, this.elements);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.hashCode;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] internalArray() {
        return this.elements;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayEnd() {
        return this.size;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final UnmodifiableIterator iterator() {
        return asList().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.size;
    }
}
