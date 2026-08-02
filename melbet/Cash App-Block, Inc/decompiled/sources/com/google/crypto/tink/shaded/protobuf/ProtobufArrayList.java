package com.google.crypto.tink.shaded.protobuf;

import bo.app.re$$ExternalSyntheticOutline0;
import com.google.crypto.tink.shaded.protobuf.Internal;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public final class ProtobufArrayList extends AbstractProtobufList implements RandomAccess {
    public static final Object[] EMPTY_ARRAY;
    public static final ProtobufArrayList EMPTY_LIST;

    /* renamed from: array, reason: collision with root package name */
    public Object[] f1002array;
    public int size;

    static {
        Object[] objArr = new Object[0];
        EMPTY_ARRAY = objArr;
        EMPTY_LIST = new ProtobufArrayList(objArr, 0, false);
    }

    public ProtobufArrayList(Object[] objArr, int i, boolean z) {
        this.isMutable = z;
        this.f1002array = objArr;
        this.size = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        ensureIsMutable();
        if (i < 0 || i > (i2 = this.size)) {
            Path$$ExternalSyntheticBUOutline0.m(this.size, JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index:", ", Size:"));
            return;
        }
        Object[] objArr = this.f1002array;
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[re$$ExternalSyntheticOutline0.m(objArr.length, 3, 2, 1, 10)];
            System.arraycopy(this.f1002array, 0, objArr2, 0, i);
            System.arraycopy(this.f1002array, i, objArr2, i + 1, this.size - i);
            this.f1002array = objArr2;
        }
        this.f1002array[i] = obj;
        this.size++;
        ((AbstractList) this).modCount++;
    }

    public final void ensureIndexInRange$5(int i) {
        if (i < 0 || i >= this.size) {
            Path$$ExternalSyntheticBUOutline0.m(this.size, JsonLogicResult$Success$$ExternalSyntheticOutline0.m2m(i, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        ensureIndexInRange$5(i);
        return this.f1002array[i];
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Internal.ProtobufList
    public final Internal.ProtobufList mutableCopyWithCapacity(int i) {
        if (i >= this.size) {
            return new ProtobufArrayList(i == 0 ? EMPTY_ARRAY : Arrays.copyOf(this.f1002array, i), this.size, true);
        }
        Path$$ExternalSyntheticBUOutline0.m$3();
        return null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractProtobufList, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ensureIsMutable();
        ensureIndexInRange$5(i);
        Object[] objArr = this.f1002array;
        Object obj = objArr[i];
        if (i < this.size - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.size--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        ensureIsMutable();
        ensureIndexInRange$5(i);
        Object[] objArr = this.f1002array;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.size;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ensureIsMutable();
        int i = this.size;
        Object[] objArr = this.f1002array;
        if (i == objArr.length) {
            this.f1002array = Arrays.copyOf(this.f1002array, re$$ExternalSyntheticOutline0.m(objArr.length, 3, 2, 1, 10));
        }
        Object[] objArr2 = this.f1002array;
        int i2 = this.size;
        this.size = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
