package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.lL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3509lL extends AK implements RandomAccess, InterfaceC2973bL, InterfaceC4102wL {

    /* renamed from: w, reason: collision with root package name */
    public static final long[] f31758w;

    /* renamed from: x, reason: collision with root package name */
    public static final C3509lL f31759x;

    /* renamed from: u, reason: collision with root package name */
    public long[] f31760u;

    /* renamed from: v, reason: collision with root package name */
    public int f31761v;

    static {
        long[] jArr = new long[0];
        f31758w = jArr;
        f31759x = new C3509lL(jArr, 0, false);
    }

    public C3509lL(long[] jArr, int i, boolean z3) {
        super(z3);
        this.f31760u = jArr;
        this.f31761v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i6;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i6 = this.f31761v)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i9 = i + 1;
        long[] jArr = this.f31760u;
        int length = jArr.length;
        if (i6 < length) {
            System.arraycopy(jArr, i, jArr, i9, i6 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f31760u, 0, jArr2, 0, i);
            System.arraycopy(this.f31760u, i, jArr2, i9, this.f31761v - i);
            this.f31760u = jArr2;
        }
        this.f31760u[i] = longValue;
        this.f31761v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof C3509lL)) {
            return super.addAll(collection);
        }
        C3509lL c3509lL = (C3509lL) collection;
        int i = c3509lL.f31761v;
        if (i == 0) {
            return false;
        }
        int i6 = this.f31761v;
        if (Integer.MAX_VALUE - i6 < i) {
            throw new OutOfMemoryError();
        }
        int i9 = i6 + i;
        long[] jArr = this.f31760u;
        if (i9 > jArr.length) {
            this.f31760u = Arrays.copyOf(jArr, i9);
        }
        System.arraycopy(c3509lL.f31760u, 0, this.f31760u, this.f31761v, c3509lL.f31761v);
        this.f31761v = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i) {
        f(i);
        return this.f31760u[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j6) {
        a();
        int i = this.f31761v;
        int length = this.f31760u.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f31760u, 0, jArr, 0, this.f31761v);
            this.f31760u = jArr;
        }
        long[] jArr2 = this.f31760u;
        int i6 = this.f31761v;
        this.f31761v = i6 + 1;
        jArr2[i6] = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3026cL
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C3509lL D(int i) {
        if (i >= this.f31761v) {
            return new C3509lL(i == 0 ? f31758w : Arrays.copyOf(this.f31760u, i), this.f31761v, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3509lL)) {
            return super.equals(obj);
        }
        C3509lL c3509lL = (C3509lL) obj;
        if (this.f31761v != c3509lL.f31761v) {
            return false;
        }
        long[] jArr = c3509lL.f31760u;
        for (int i = 0; i < this.f31761v; i++) {
            if (this.f31760u[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.f31761v) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public final String g(int i) {
        int i6 = this.f31761v;
        return D.y.r(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i6).length()), "Index:", i, ", Size:", i6);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Long.valueOf(this.f31760u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i6 = 0; i6 < this.f31761v; i6++) {
            long j6 = this.f31760u[i6];
            byte[] bArr = AbstractC3080dL.f29746a;
            i = (i * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.f31761v;
        for (int i6 = 0; i6 < i; i6++) {
            if (this.f31760u[i6] == longValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        long[] jArr = this.f31760u;
        long j6 = jArr[i];
        if (i < this.f31761v - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f31761v--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i6) {
        a();
        if (i6 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f31760u;
        System.arraycopy(jArr, i6, jArr, i, this.f31761v - i6);
        this.f31761v -= i6 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        f(i);
        long[] jArr = this.f31760u;
        long j6 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31761v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
