package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class WK extends AK implements RandomAccess, ZK, InterfaceC4125wL {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f29145w;

    /* renamed from: x, reason: collision with root package name */
    public static final WK f29146x;

    /* renamed from: u, reason: collision with root package name */
    public int[] f29147u;

    /* renamed from: v, reason: collision with root package name */
    public int f29148v;

    static {
        int[] iArr = new int[0];
        f29145w = iArr;
        f29146x = new WK(iArr, 0, false);
    }

    public WK(int[] iArr, int i, boolean z6) {
        super(z6);
        this.f29147u = iArr;
        this.f29148v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i4 = this.f29148v)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i6 = i + 1;
        int[] iArr = this.f29147u;
        int length = iArr.length;
        if (i4 < length) {
            System.arraycopy(iArr, i, iArr, i6, i4 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f29147u, 0, iArr2, 0, i);
            System.arraycopy(this.f29147u, i, iArr2, i6, this.f29148v - i);
            this.f29147u = iArr2;
        }
        this.f29147u[i] = intValue;
        this.f29148v++;
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
        int i = wk.f29148v;
        if (i == 0) {
            return false;
        }
        int i4 = this.f29148v;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        int[] iArr = this.f29147u;
        if (i6 > iArr.length) {
            this.f29147u = Arrays.copyOf(iArr, i6);
        }
        System.arraycopy(wk.f29147u, 0, this.f29147u, this.f29148v, wk.f29148v);
        this.f29148v = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3049cL
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final WK D(int i) {
        if (i >= this.f29148v) {
            return new WK(i == 0 ? f29145w : Arrays.copyOf(this.f29147u, i), this.f29148v, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int d(int i) {
        f(i);
        return this.f29147u[i];
    }

    public final void e(int i) {
        a();
        int i4 = this.f29148v;
        int length = this.f29147u.length;
        if (i4 == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f29147u, 0, iArr, 0, this.f29148v);
            this.f29147u = iArr;
        }
        int[] iArr2 = this.f29147u;
        int i6 = this.f29148v;
        this.f29148v = i6 + 1;
        iArr2[i6] = i;
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
        if (this.f29148v != wk.f29148v) {
            return false;
        }
        int[] iArr = wk.f29147u;
        for (int i = 0; i < this.f29148v; i++) {
            if (this.f29147u[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.f29148v) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public final String g(int i) {
        int i4 = this.f29148v;
        return D.x.o(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i4).length()), "Index:", i, ", Size:", i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Integer.valueOf(this.f29147u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f29148v; i4++) {
            i = (i * 31) + this.f29147u[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f29148v;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.f29147u[i4] == intValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        int[] iArr = this.f29147u;
        int i4 = iArr[i];
        if (i < this.f29148v - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f29148v--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        a();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f29147u;
        System.arraycopy(iArr, i4, iArr, i, this.f29148v - i4);
        this.f29148v -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        f(i);
        int[] iArr = this.f29147u;
        int i4 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f29148v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        e(((Integer) obj).intValue());
        return true;
    }
}
