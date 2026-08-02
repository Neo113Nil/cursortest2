package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.yL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4233yL extends AK implements RandomAccess {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f35934w;

    /* renamed from: x, reason: collision with root package name */
    public static final C4233yL f35935x;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f35936u;

    /* renamed from: v, reason: collision with root package name */
    public int f35937v;

    static {
        Object[] objArr = new Object[0];
        f35934w = objArr;
        f35935x = new C4233yL(objArr, 0, false);
    }

    public C4233yL(Object[] objArr, int i, boolean z6) {
        super(z6);
        this.f35936u = objArr;
        this.f35937v = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3049cL
    public final /* bridge */ /* synthetic */ InterfaceC3049cL D(int i) {
        if (i >= this.f35937v) {
            return new C4233yL(i == 0 ? f35934w : Arrays.copyOf(this.f35936u, i), this.f35937v, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        a();
        if (i < 0 || i > (i4 = this.f35937v)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        int i6 = i + 1;
        Object[] objArr = this.f35936u;
        int length = objArr.length;
        if (i4 < length) {
            System.arraycopy(objArr, i, objArr, i6, i4 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f35936u, 0, objArr2, 0, i);
            System.arraycopy(this.f35936u, i, objArr2, i6, this.f35937v - i);
            this.f35936u = objArr2;
        }
        this.f35936u[i] = obj;
        this.f35937v++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f35937v) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    public final String d(int i) {
        int i4 = this.f35937v;
        return D.x.o(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i4).length()), "Index:", i, ", Size:", i4);
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        if (!(obj instanceof RandomAccess)) {
            return super.equals(obj);
        }
        List list = (List) obj;
        int i = this.f35937v;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof C4233yL)) {
            for (int i4 = 0; i4 < i; i4++) {
                if (!this.f35936u[i4].equals(list.get(i4))) {
                    return false;
                }
            }
            return true;
        }
        C4233yL c4233yL = (C4233yL) obj;
        for (int i6 = 0; i6 < i; i6++) {
            if (!this.f35936u[i6].equals(c4233yL.f35936u[i6])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f35936u[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f35937v;
        int i4 = 1;
        for (int i6 = 0; i6 < i; i6++) {
            i4 = (i4 * 31) + this.f35936u[i6].hashCode();
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f35936u;
        Object obj = objArr[i];
        if (i < this.f35937v - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f35937v--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f35936u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35937v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f35937v;
        int length = this.f35936u.length;
        if (i == length) {
            this.f35936u = Arrays.copyOf(this.f35936u, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f35936u;
        int i4 = this.f35937v;
        this.f35937v = i4 + 1;
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
