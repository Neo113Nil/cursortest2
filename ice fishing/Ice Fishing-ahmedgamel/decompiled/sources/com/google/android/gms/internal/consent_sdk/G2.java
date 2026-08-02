package com.google.android.gms.internal.consent_sdk;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public final class G2 extends AbstractC4334d2 implements RandomAccess {

    /* renamed from: w, reason: collision with root package name */
    public static final Object[] f36287w;

    /* renamed from: x, reason: collision with root package name */
    public static final G2 f36288x;

    /* renamed from: u, reason: collision with root package name */
    public Object[] f36289u;

    /* renamed from: v, reason: collision with root package name */
    public int f36290v;

    static {
        Object[] objArr = new Object[0];
        f36287w = objArr;
        f36288x = new G2(objArr, 0, false);
    }

    public G2(Object[] objArr, int i, boolean z6) {
        super(z6);
        this.f36289u = objArr;
        this.f36290v = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i4;
        a();
        if (i < 0 || i > (i4 = this.f36290v)) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, this.f36290v, "Index:", ", Size:"));
        }
        int i6 = i + 1;
        Object[] objArr = this.f36289u;
        int length = objArr.length;
        if (i4 < length) {
            System.arraycopy(objArr, i, objArr, i6, i4 - i);
        } else {
            Object[] objArr2 = new Object[Math.max(((length * 3) / 2) + 1, 10)];
            System.arraycopy(this.f36289u, 0, objArr2, 0, i);
            System.arraycopy(this.f36289u, i, objArr2, i6, this.f36290v - i);
            this.f36289u = objArr2;
        }
        this.f36289u[i] = obj;
        this.f36290v++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.consent_sdk.InterfaceC4389r2
    public final /* bridge */ /* synthetic */ InterfaceC4389r2 b(int i) {
        if (i >= this.f36290v) {
            return new G2(i == 0 ? f36287w : Arrays.copyOf(this.f36289u, i), this.f36290v, true);
        }
        throw new IllegalArgumentException();
    }

    public final void c(int i) {
        if (i < 0 || i >= this.f36290v) {
            throw new IndexOutOfBoundsException(AbstractC5128c.c(i, this.f36290v, "Index:", ", Size:"));
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.f36289u[i];
    }

    @Override // com.google.android.gms.internal.consent_sdk.AbstractC4334d2, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        a();
        c(i);
        Object[] objArr = this.f36289u;
        Object obj = objArr[i];
        if (i < this.f36290v - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (r2 - i) - 1);
        }
        this.f36290v--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        c(i);
        Object[] objArr = this.f36289u;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f36290v;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.f36290v;
        int length = this.f36289u.length;
        if (i == length) {
            this.f36289u = Arrays.copyOf(this.f36289u, Math.max(((length * 3) / 2) + 1, 10));
        }
        Object[] objArr = this.f36289u;
        int i4 = this.f36290v;
        this.f36290v = i4 + 1;
        objArr[i4] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
