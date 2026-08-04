package com.gamericefishpro.space.i9;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g6 extends q4 implements RandomAccess {
    public static final Object[] v;
    public static final g6 w;
    public Object[] e;
    public int i;

    static {
        Object[] objArr = new Object[0];
        v = objArr;
        w = new g6(objArr, 0, false);
    }

    public g6(Object[] objArr, int i, boolean z) {
        super(z);
        this.e = objArr;
        this.i = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i < 0 || i > (i2 = this.i)) {
            throw new IndexOutOfBoundsException(s4.a(this.i, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        Object[] objArr = this.e;
        int length = objArr.length;
        if (i2 < length) {
            System.arraycopy(objArr, i, objArr, i3, i2 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.e, 0, objArr2, 0, i);
            System.arraycopy(this.e, i, objArr2, i3, this.i - i);
            this.e = objArr2;
        }
        this.e[i] = obj;
        this.i++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.i) {
            throw new IndexOutOfBoundsException(s4.a(this.i, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.e[i];
    }

    @Override // com.gamericefishpro.space.i9.m5
    public final /* bridge */ /* synthetic */ m5 j(int i) {
        if (i >= this.i) {
            return new g6(i == 0 ? v : Arrays.copyOf(this.e, i), this.i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.gamericefishpro.space.i9.q4, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        b();
        c(i);
        Object[] objArr = this.e;
        Object obj = objArr[i];
        int i2 = this.i;
        if (i < i2 - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.i--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        b();
        c(i);
        Object[] objArr = this.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.i;
        int length = this.e.length;
        if (i == length) {
            this.e = Arrays.copyOf(this.e, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.e;
        int i2 = this.i;
        this.i = i2 + 1;
        objArr[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
