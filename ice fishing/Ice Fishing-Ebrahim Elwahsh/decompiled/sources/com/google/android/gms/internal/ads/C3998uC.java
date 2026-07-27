package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.uC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3998uC extends AbstractC2917aC {

    /* renamed from: B, reason: collision with root package name */
    public static final Object[] f34562B;

    /* renamed from: C, reason: collision with root package name */
    public static final C3998uC f34563C;

    /* renamed from: A, reason: collision with root package name */
    public final transient int f34564A;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f34565w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f34566x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f34567y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f34568z;

    static {
        Object[] objArr = new Object[0];
        f34562B = objArr;
        f34563C = new C3998uC(0, 0, 0, objArr, objArr);
    }

    public C3998uC(int i, int i4, int i9, Object[] objArr, Object[] objArr2) {
        this.f34565w = objArr;
        this.f34566x = i;
        this.f34567y = objArr2;
        this.f34568z = i4;
        this.f34564A = i9;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final CC a() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final Object[] c() {
        return this.f34565w;
    }

    @Override // com.google.android.gms.internal.ads.QB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f34567y;
            if (objArr.length != 0) {
                int p6 = AbstractC3194fG.p(obj);
                while (true) {
                    int i = p6 & this.f34568z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    p6 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int e() {
        return this.f34564A;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int h(Object[] objArr, int i) {
        Object[] objArr2 = this.f34565w;
        int i4 = this.f34564A;
        System.arraycopy(objArr2, 0, objArr, i, i4);
        return i + i4;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2917aC, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f34566x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2917aC
    public final UB m() {
        return UB.p(this.f34565w, this.f34564A);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f34564A;
    }
}
