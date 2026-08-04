package com.gamericefishpro.space.q4;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends b implements RandomAccess {
    public static final r0 v = new r0(new Object[0], 0, false);
    public Object[] e;
    public int i;

    public r0(Object[] objArr, int i, boolean z) {
        this.d = z;
        this.e = objArr;
        this.i = i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
        int i = this.i;
        Object[] objArr = this.e;
        if (i == objArr.length) {
            this.e = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.e;
        int i2 = this.i;
        this.i = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.i) {
            StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "Index:", ", Size:");
            sbK.append(this.i);
            throw new IndexOutOfBoundsException(sbK.toString());
        }
    }

    public final r0 d(int i) {
        if (i >= this.i) {
            return new r0(Arrays.copyOf(this.e, i), this.i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.e[i];
    }

    @Override // com.gamericefishpro.space.q4.b, java.util.AbstractList, java.util.List
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

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i >= 0 && i <= (i2 = this.i)) {
            Object[] objArr = this.e;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.e, i, objArr2, i + 1, this.i - i);
                this.e = objArr2;
            }
            this.e[i] = obj;
            this.i++;
            ((AbstractList) this).modCount++;
            return;
        }
        StringBuilder sbK = com.gamericefishpro.space.m5.a.k(i, "Index:", ", Size:");
        sbK.append(this.i);
        throw new IndexOutOfBoundsException(sbK.toString());
    }
}
