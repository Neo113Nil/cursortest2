package com.google.common.collect;

import androidx.tracing.Trace;
import java.util.Objects;

/* loaded from: classes.dex */
public final class RegularImmutableList extends ImmutableList {
    public static final RegularImmutableList EMPTY = new RegularImmutableList(0, new Object[0]);

    /* renamed from: array, reason: collision with root package name */
    public final transient Object[] f998array;
    public final transient int size;

    public RegularImmutableList(int i, Object[] objArr) {
        this.f998array = objArr;
        this.size = i;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    public final int copyIntoArray(int i, Object[] objArr) {
        Object[] objArr2 = this.f998array;
        int i2 = this.size;
        System.arraycopy(objArr2, 0, objArr, i, i2);
        return i + i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Trace.checkElementIndex(i, this.size);
        Object obj = this.f998array[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.ImmutableCollection
    public final Object[] internalArray() {
        return this.f998array;
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

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }
}
