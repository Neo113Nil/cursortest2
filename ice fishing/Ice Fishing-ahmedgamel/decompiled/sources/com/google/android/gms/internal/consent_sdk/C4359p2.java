package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.consent_sdk.p2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4359p2 extends AbstractC4311d2 implements RandomAccess, InterfaceC4363q2 {

    /* renamed from: w, reason: collision with root package name */
    public static final int[] f35732w;

    /* renamed from: x, reason: collision with root package name */
    public static final C4359p2 f35733x;

    /* renamed from: u, reason: collision with root package name */
    public int[] f35734u;

    /* renamed from: v, reason: collision with root package name */
    public int f35735v;

    static {
        int[] iArr = new int[0];
        f35732w = iArr;
        f35733x = new C4359p2(iArr, 0, false);
    }

    public C4359p2(int[] iArr, int i, boolean z3) {
        super(z3);
        this.f35734u = iArr;
        this.f35735v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i6;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i6 = this.f35735v)) {
            throw new IndexOutOfBoundsException(u1.h.c(i, this.f35735v, "Index:", ", Size:"));
        }
        int i9 = i + 1;
        int[] iArr = this.f35734u;
        int length = iArr.length;
        if (i6 < length) {
            System.arraycopy(iArr, i, iArr, i9, i6 - i);
        } else {
            int[] iArr2 = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f35734u, 0, iArr2, 0, i);
            System.arraycopy(this.f35734u, i, iArr2, i9, this.f35735v - i);
            this.f35734u = iArr2;
        }
        this.f35734u[i] = intValue;
        this.f35735v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4311d2, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        a();
        Charset charset = AbstractC4370s2.f35744a;
        collection.getClass();
        if (!(collection instanceof C4359p2)) {
            return super.addAll(collection);
        }
        C4359p2 c4359p2 = (C4359p2) collection;
        int i = c4359p2.f35735v;
        if (i == 0) {
            return false;
        }
        int i6 = this.f35735v;
        if (Integer.MAX_VALUE - i6 < i) {
            throw new OutOfMemoryError();
        }
        int i9 = i6 + i;
        int[] iArr = this.f35734u;
        if (i9 > iArr.length) {
            this.f35734u = Arrays.copyOf(iArr, i9);
        }
        System.arraycopy(c4359p2.f35734u, 0, this.f35734u, this.f35735v, c4359p2.f35735v);
        this.f35735v = i9;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.google.android.gms.internal.consent_sdk.InterfaceC4366r2
    public final /* bridge */ /* synthetic */ InterfaceC4366r2 b(int i) {
        if (i >= this.f35735v) {
            return new C4359p2(i == 0 ? f35732w : Arrays.copyOf(this.f35734u, i), this.f35735v, true);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i) {
        d(i);
        return this.f35734u[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        if (i < 0 || i >= this.f35735v) {
            throw new IndexOutOfBoundsException(u1.h.c(i, this.f35735v, "Index:", ", Size:"));
        }
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4311d2, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4359p2)) {
            return super.equals(obj);
        }
        C4359p2 c4359p2 = (C4359p2) obj;
        if (this.f35735v != c4359p2.f35735v) {
            return false;
        }
        int[] iArr = c4359p2.f35734u;
        for (int i = 0; i < this.f35735v; i++) {
            if (this.f35734u[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        d(i);
        return Integer.valueOf(this.f35734u[i]);
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4311d2, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i6 = 0; i6 < this.f35735v; i6++) {
            i = (i * 31) + this.f35734u[i6];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.f35735v;
        for (int i6 = 0; i6 < i; i6++) {
            if (this.f35734u[i6] == intValue) {
                return i6;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4311d2, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        a();
        d(i);
        int[] iArr = this.f35734u;
        int i6 = iArr[i];
        if (i < this.f35735v - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (r2 - i) - 1);
        }
        this.f35735v--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i6) {
        a();
        if (i6 < i) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f35734u;
        System.arraycopy(iArr, i6, iArr, i, this.f35735v - i6);
        this.f35735v -= i6 - i;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        d(i);
        int[] iArr = this.f35734u;
        int i6 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35735v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        int i = this.f35735v;
        int length = this.f35734u.length;
        if (i == length) {
            int[] iArr = new int[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f35734u, 0, iArr, 0, this.f35735v);
            this.f35734u = iArr;
        }
        int[] iArr2 = this.f35734u;
        int i6 = this.f35735v;
        this.f35735v = i6 + 1;
        iArr2[i6] = intValue;
        return true;
    }
}
