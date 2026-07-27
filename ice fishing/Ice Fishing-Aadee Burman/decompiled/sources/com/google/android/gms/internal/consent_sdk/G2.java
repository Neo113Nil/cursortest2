package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* loaded from: classes2.dex */
public final class G2 extends AbstractC4311d2 implements RandomAccess {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f35518w;

    /* renamed from: x, reason: collision with root package name */
    public static final G2 f35519x;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f35520u;

    /* renamed from: v, reason: collision with root package name */
    public int f35521v;

    static {
        Object[] objArr = new Object[0];
        f35518w = objArr;
        f35519x = new G2(objArr, 0, false);
    }

    public G2(Object[] objArr, int i, boolean z3) {
        super(z3);
        this.f35520u = objArr;
        this.f35521v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i6;
        a();
        if (i < 0 || i > (i6 = this.f35521v)) {
            throw new IndexOutOfBoundsException(u1.h.c(i, this.f35521v, "Index:", ", Size:"));
        }
        int i9 = i + 1;
        Object[] objArr = this.f35520u;
        int length = objArr.length;
        if (i6 < length) {
            System.arraycopy(objArr, i, objArr, i9, i6 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f35520u, 0, objArr2, 0, i);
            System.arraycopy(this.f35520u, i, objArr2, i9, this.f35521v - i);
            this.f35520u = objArr2;
        }
        this.f35520u[i] = obj;
        this.f35521v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.InterfaceC4366r2
    public final /* bridge */ /* synthetic */ InterfaceC4366r2 b(int i) {
        if (i >= this.f35521v) {
            return new G2(i == 0 ? f35518w : Arrays.copyOf(this.f35520u, i), this.f35521v, true);
        }
        throw new IllegalArgumentException();
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f35521v) {
            throw new IndexOutOfBoundsException(u1.h.c(i, this.f35521v, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f35520u[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4311d2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f35520u;
        Object obj = objArr[i];
        if (i < this.f35521v - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f35521v--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f35520u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f35521v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f35521v;
        int length = this.f35520u.length;
        if (i == length) {
            this.f35520u = Arrays.copyOf(this.f35520u, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f35520u;
        int i6 = this.f35521v;
        this.f35521v = i6 + 1;
        objArr[i6] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
