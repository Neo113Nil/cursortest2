package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.lL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3532lL extends AK implements RandomAccess, InterfaceC2996bL, InterfaceC4125wL {

    /* renamed from: w, reason: collision with root package name */
    public static final long[] f32538w;

    /* renamed from: x, reason: collision with root package name */
    public static final C3532lL f32539x;

    /* renamed from: u, reason: collision with root package name */
    public long[] f32540u;

    /* renamed from: v, reason: collision with root package name */
    public int f32541v;

    static {
        long[] jArr = new long[0];
        f32538w = jArr;
        f32539x = new C3532lL(jArr, 0, false);
    }

    public C3532lL(long[] jArr, int i, boolean z6) {
        super(z6);
        this.f32540u = jArr;
        this.f32541v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i4 = this.f32541v)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        int i6 = i + 1;
        long[] jArr = this.f32540u;
        int length = jArr.length;
        if (i4 < length) {
            System.arraycopy(jArr, i, jArr, i6, i4 - i);
        } else {
            long[] jArr2 = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f32540u, 0, jArr2, 0, i);
            System.arraycopy(this.f32540u, i, jArr2, i6, this.f32541v - i);
            this.f32540u = jArr2;
        }
        this.f32540u[i] = longValue;
        this.f32541v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        collection.getClass();
        if (!(collection instanceof C3532lL)) {
            return super.addAll(collection);
        }
        C3532lL c3532lL = (C3532lL) collection;
        int i = c3532lL.f32541v;
        if (i == 0) {
            return false;
        }
        int i4 = this.f32541v;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i6 = i4 + i;
        long[] jArr = this.f32540u;
        if (i6 > jArr.length) {
            this.f32540u = Arrays.copyOf(jArr, i6);
        }
        System.arraycopy(c3532lL.f32540u, 0, this.f32540u, this.f32541v, c3532lL.f32541v);
        this.f32541v = i6;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final long c(int i) {
        f(i);
        return this.f32540u[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(long j6) {
        a();
        int i = this.f32541v;
        int length = this.f32540u.length;
        if (i == length) {
            long[] jArr = new long[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f32540u, 0, jArr, 0, this.f32541v);
            this.f32540u = jArr;
        }
        long[] jArr2 = this.f32540u;
        int i4 = this.f32541v;
        this.f32541v = i4 + 1;
        jArr2[i4] = j6;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3049cL
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final C3532lL D(int i) {
        if (i >= this.f32541v) {
            return new C3532lL(i == 0 ? f32538w : Arrays.copyOf(this.f32540u, i), this.f32541v, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3532lL)) {
            return super.equals(obj);
        }
        C3532lL c3532lL = (C3532lL) obj;
        if (this.f32541v != c3532lL.f32541v) {
            return false;
        }
        long[] jArr = c3532lL.f32540u;
        for (int i = 0; i < this.f32541v; i++) {
            if (this.f32540u[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i) {
        if (i < 0 || i >= this.f32541v) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    public final String g(int i) {
        int i4 = this.f32541v;
        return D.x.o(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i4).length()), "Index:", i, ", Size:", i4);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        f(i);
        return Long.valueOf(this.f32540u[i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f32541v; i4++) {
            long j6 = this.f32540u[i4];
            byte[] bArr = AbstractC3103dL.f30518a;
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
        int i = this.f32541v;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.f32540u[i4] == longValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        f(i);
        long[] jArr = this.f32540u;
        long j6 = jArr[i];
        if (i < this.f32541v - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (r3 - i) - 1);
        }
        this.f32541v--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        a();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f32540u;
        System.arraycopy(jArr, i4, jArr, i, this.f32541v - i4);
        this.f32541v -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        f(i);
        long[] jArr = this.f32540u;
        long j6 = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32541v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }
}
