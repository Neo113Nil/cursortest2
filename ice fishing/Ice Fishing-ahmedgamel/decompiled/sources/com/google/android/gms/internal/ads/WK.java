package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class WK extends AK implements RandomAccess, ZK, InterfaceC4102wL {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f28347w;

    /* renamed from: x, reason: collision with root package name */
    public static final WK f28348x;

    /* renamed from: u, reason: collision with root package name */
    public int[] f28349u;

    /* renamed from: v, reason: collision with root package name */
    public int f28350v;

    static {
        int[] iArr = new int[0];
        f28347w = iArr;
        f28348x = new WK(iArr, 0, false);
    }

    public WK(int[] iArr, int i, boolean z3) {
        super(z3);
        this.f28349u = iArr;
        this.f28350v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i6;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i6 = this.f28350v)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i9 = i + 1;
        int[] iArr = this.f28349u;
        int length = iArr.length;
        if (i6 < length) {
            System.arraycopy(iArr, i, iArr, i9, i6 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f28349u, 0, iArr2, 0, i);
            System.arraycopy(this.f28349u, i, iArr2, i9, this.f28350v - i);
            this.f28349u = iArr2;
        }
        this.f28349u[i] = intValue;
        this.f28350v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof WK)) {
            return super.addAll(collection);
        }
        WK wk = (WK) collection;
        int i = wk.f28350v;
        if (i == 0) {
            return false;
        }
        int i6 = this.f28350v;
        if (Integer.MAX_VALUE - i6 < i) {
            throw new OutOfMemoryError();
        }
        int i9 = i6 + i;
        int[] iArr = this.f28349u;
        if (i9 > iArr.length) {
            this.f28349u = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(wk.f28349u, 0, this.f28349u, this.f28350v, wk.f28350v);
        this.f28350v = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3026cL
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final WK D(int i) {
        if (i >= this.f28350v) {
            return new WK(i == 0 ? f28347w : Arrays.copyOf(this.f28349u, i), this.f28350v, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        f(i);
        return this.f28349u[i];
    }

    public final void e(int i) {
        a();
        int i6 = this.f28350v;
        int length = this.f28349u.length;
        if (i6 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f28349u, 0, iArr, 0, this.f28350v);
            this.f28349u = iArr;
        }
        int[] iArr2 = this.f28349u;
        int i9 = this.f28350v;
        this.f28350v = i9 + 1;
        iArr2[i9] = i;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof WK)) {
            return super.equals(obj);
        }
        WK wk = (WK) obj;
        if (this.f28350v != wk.f28350v) {
            return false;
        }
        int[] iArr = wk.f28349u;
        for (int i = 0; i < this.f28350v; i++) {
            if (this.f28349u[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.f28350v) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public final String g(int i) {
        int i6 = this.f28350v;
        return D.y.r(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i6).length()), "Index:", i, ", Size:", i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Integer.valueOf(this.f28349u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i6 = 0; i6 < this.f28350v; i6++) {
            i = (i * 31) + this.f28349u[i6];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f28350v;
        for (int i6 = 0; i6 < i; i6++) {
            if (this.f28349u[i6] == intValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        int[] iArr = this.f28349u;
        int i6 = iArr[i];
        if (i < this.f28350v - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f28350v--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i6) {
        a();
        if (i6 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f28349u;
        System.arraycopy(iArr, i6, iArr, i, this.f28350v - i6);
        this.f28350v -= i6 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        f(i);
        int[] iArr = this.f28349u;
        int i6 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f28350v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
