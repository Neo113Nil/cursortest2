package com.gamericefishpro.space.i9;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h5 extends q4 implements RandomAccess, k5, e6 {
    public static final int[] v;
    public static final h5 w;
    public int[] e;
    public int i;

    static {
        int[] iArr = new int[0];
        v = iArr;
        w = new h5(iArr, 0, false);
    }

    public h5(int[] iArr, int i, boolean z) {
        super(z);
        this.e = iArr;
        this.i = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        int iIntValue = ((Integer) obj).intValue();
        b();
        if (i < 0 || i > (i2 = this.i)) {
            throw new IndexOutOfBoundsException(s4.a(this.i, i, (byte) 13, "Index:", ", Size:"));
        }
        int i3 = i + 1;
        int[] iArr = this.e;
        int length = iArr.length;
        if (i2 < length) {
            System.arraycopy(iArr, i, iArr, i3, i2 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.e, 0, iArr2, 0, i);
            System.arraycopy(this.e, i, iArr2, i3, this.i - i);
            this.e = iArr2;
        }
        this.e[i] = iIntValue;
        this.i++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.gamericefishpro.space.i9.q4, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        b();
        Charset charset = n5.a;
        collection.getClass();
        if (!(collection instanceof h5)) {
            return super.addAll(collection);
        }
        h5 h5Var = (h5) collection;
        int i = h5Var.i;
        if (i == 0) {
            return false;
        }
        int i2 = this.i;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.e;
        if (i3 > iArr.length) {
            this.e = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(h5Var.e, 0, this.e, this.i, h5Var.i);
        this.i = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.gamericefishpro.space.i9.m5
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h5 j(int i) {
        if (i >= this.i) {
            return new h5(i == 0 ? v : Arrays.copyOf(this.e, i), this.i, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        h(i);
        return this.e[i];
    }

    @Override // com.gamericefishpro.space.i9.q4, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5)) {
            return super.equals(obj);
        }
        h5 h5Var = (h5) obj;
        if (this.i != h5Var.i) {
            return false;
        }
        int[] iArr = h5Var.e;
        for (int i = 0; i < this.i; i++) {
            if (this.e[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        b();
        int i2 = this.i;
        int length = this.e.length;
        if (i2 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.e, 0, iArr, 0, this.i);
            this.e = iArr;
        }
        int[] iArr2 = this.e;
        int i3 = this.i;
        this.i = i3 + 1;
        iArr2[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        h(i);
        return Integer.valueOf(this.e[i]);
    }

    public final void h(int i) {
        if (i < 0 || i >= this.i) {
            throw new IndexOutOfBoundsException(s4.a(this.i, i, (byte) 13, "Index:", ", Size:"));
        }
    }

    @Override // com.gamericefishpro.space.i9.q4, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.i; i2++) {
            i = (i * 31) + this.e[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.e[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.gamericefishpro.space.i9.q4, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        b();
        h(i);
        int[] iArr = this.e;
        int i2 = iArr[i];
        int i3 = this.i;
        if (i < i3 - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i3 - i) - 1);
        }
        this.i--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        b();
        if (i2 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.e;
        System.arraycopy(iArr, i2, iArr, i, this.i - i2);
        this.i -= i2 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        b();
        h(i);
        int[] iArr = this.e;
        int i2 = iArr[i];
        iArr[i] = iIntValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.i;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}
