package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
import t0.AbstractC5051n;

/* renamed from: com.google.android.gms.internal.consent_sdk.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4372p2 extends AbstractC4324d2 implements RandomAccess, InterfaceC4376q2 {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f35895w;

    /* renamed from: x, reason: collision with root package name */
    public static final C4372p2 f35896x;

    /* renamed from: u, reason: collision with root package name */
    public int[] f35897u;

    /* renamed from: v, reason: collision with root package name */
    public int f35898v;

    static {
        int[] iArr = new int[0];
        f35895w = iArr;
        f35896x = new C4372p2(iArr, 0, false);
    }

    public C4372p2(int[] iArr, int i, boolean z8) {
        super(z8);
        this.f35897u = iArr;
        this.f35898v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i4 = this.f35898v)) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, this.f35898v, "Index:", ", Size:"));
        }
        int i9 = i + 1;
        int[] iArr = this.f35897u;
        int length = iArr.length;
        if (i4 < length) {
            System.arraycopy(iArr, i, iArr, i9, i4 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f35897u, 0, iArr2, 0, i);
            System.arraycopy(this.f35897u, i, iArr2, i9, this.f35898v - i);
            this.f35897u = iArr2;
        }
        this.f35897u[i] = intValue;
        this.f35898v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4324d2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC4383s2.f35907a;
        collection.getClass();
        if (!(collection instanceof C4372p2)) {
            return super.addAll(collection);
        }
        C4372p2 c4372p2 = (C4372p2) collection;
        int i = c4372p2.f35898v;
        if (i == 0) {
            return false;
        }
        int i4 = this.f35898v;
        if (Integer.MAX_VALUE - i4 < i) {
            throw new OutOfMemoryError();
        }
        int i9 = i4 + i;
        int[] iArr = this.f35897u;
        if (i9 > iArr.length) {
            this.f35897u = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(c4372p2.f35897u, 0, this.f35897u, this.f35898v, c4372p2.f35898v);
        this.f35898v = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.InterfaceC4379r2
    public final /* bridge */ /* synthetic */ InterfaceC4379r2 b(int i) {
        if (i >= this.f35898v) {
            return new C4372p2(i == 0 ? f35895w : Arrays.copyOf(this.f35897u, i), this.f35898v, true);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i) {
        d(i);
        return this.f35897u[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f35898v) {
            throw new IndexOutOfBoundsException(AbstractC5051n.c(i, this.f35898v, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4324d2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4372p2)) {
            return super.equals(obj);
        }
        C4372p2 c4372p2 = (C4372p2) obj;
        if (this.f35898v != c4372p2.f35898v) {
            return false;
        }
        int[] iArr = c4372p2.f35897u;
        for (int i = 0; i < this.f35898v; i++) {
            if (this.f35897u[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        d(i);
        return Integer.valueOf(this.f35897u[i]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4324d2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i4 = 0; i4 < this.f35898v; i4++) {
            i = (i * 31) + this.f35897u[i4];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f35898v;
        for (int i4 = 0; i4 < i; i4++) {
            if (this.f35897u[i4] == intValue) {
                return i4;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4324d2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        d(i);
        int[] iArr = this.f35897u;
        int i4 = iArr[i];
        if (i < this.f35898v - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f35898v--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i4) {
        a();
        if (i4 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f35897u;
        System.arraycopy(iArr, i4, iArr, i, this.f35898v - i4);
        this.f35898v -= i4 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        d(i);
        int[] iArr = this.f35897u;
        int i4 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35898v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        int i = this.f35898v;
        int length = this.f35897u.length;
        if (i == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f35897u, 0, iArr, 0, this.f35898v);
            this.f35897u = iArr;
        }
        int[] iArr2 = this.f35897u;
        int i4 = this.f35898v;
        this.f35898v = i4 + 1;
        iArr2[i4] = intValue;
        return true;
    }
}
