package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.ads.yL, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4210yL extends AK implements RandomAccess {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f35148w;

    /* renamed from: x, reason: collision with root package name */
    public static final C4210yL f35149x;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f35150u;

    /* renamed from: v, reason: collision with root package name */
    public int f35151v;

    static {
        Object[] objArr = new Object[0];
        f35148w = objArr;
        f35149x = new C4210yL(objArr, 0, false);
    }

    public C4210yL(Object[] objArr, int i, boolean z3) {
        super(z3);
        this.f35150u = objArr;
        this.f35151v = i;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3026cL
    public final /* bridge */ /* synthetic */ InterfaceC3026cL D(int i) {
        if (i >= this.f35151v) {
            return new C4210yL(i == 0 ? f35148w : Arrays.copyOf(this.f35150u, i), this.f35151v, true);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i6;
        a();
        if (i < 0 || i > (i6 = this.f35151v)) {
            throw new IndexOutOfBoundsException(d(i));
        }
        int i9 = i + 1;
        Object[] objArr = this.f35150u;
        int length = objArr.length;
        if (i6 < length) {
            System.arraycopy(objArr, i, objArr, i9, i6 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f35150u, 0, objArr2, 0, i);
            System.arraycopy(this.f35150u, i, objArr2, i9, this.f35151v - i);
            this.f35150u = objArr2;
        }
        this.f35150u[i] = obj;
        this.f35151v++;
        ((AbstractList) this).modCount++;
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f35151v) {
            throw new IndexOutOfBoundsException(d(i));
        }
    }

    public final String d(int i) {
        int i6 = this.f35151v;
        return D.y.r(new StringBuilder(String.valueOf(i).length() + 13 + String.valueOf(i6).length()), "Index:", i, ", Size:", i6);
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
        int i = this.f35151v;
        if (i != list.size()) {
            return false;
        }
        if (!(obj instanceof C4210yL)) {
            for (int i6 = 0; i6 < i; i6++) {
                if (!this.f35150u[i6].equals(list.get(i6))) {
                    return false;
                }
            }
            return true;
        }
        C4210yL c4210yL = (C4210yL) obj;
        for (int i9 = 0; i9 < i; i9++) {
            if (!this.f35150u[i9].equals(c4210yL.f35150u[i9])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f35150u[i];
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = this.f35151v;
        int i6 = 1;
        for (int i9 = 0; i9 < i; i9++) {
            i6 = (i6 * 31) + this.f35150u[i9].hashCode();
        }
        return i6;
    }

    @Override // com.google.android.gms.internal.ads.AK, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f35150u;
        Object obj = objArr[i];
        if (i < this.f35151v - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f35151v--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f35150u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35151v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f35151v;
        int length = this.f35150u.length;
        if (i == length) {
            this.f35150u = Arrays.copyOf(this.f35150u, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f35150u;
        int i6 = this.f35151v;
        this.f35151v = i6 + 1;
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
