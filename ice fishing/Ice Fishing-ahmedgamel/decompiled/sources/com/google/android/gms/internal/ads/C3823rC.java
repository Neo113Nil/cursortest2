package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.rC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3823rC extends XB {

    /* renamed from: B, reason: collision with root package name */
    public static final Object[] f33536B;

    /* renamed from: C, reason: collision with root package name */
    public static final C3823rC f33537C;

    /* renamed from: A, reason: collision with root package name */
    public final transient int f33538A;

    /* renamed from: w, reason: collision with root package name */
    public final transient Object[] f33539w;

    /* renamed from: x, reason: collision with root package name */
    public final transient int f33540x;

    /* renamed from: y, reason: collision with root package name */
    public final transient Object[] f33541y;

    /* renamed from: z, reason: collision with root package name */
    public final transient int f33542z;

    static {
        Object[] objArr = new Object[0];
        f33536B = objArr;
        f33537C = new C3823rC(0, 0, 0, objArr, objArr);
    }

    public C3823rC(int i, int i6, int i9, Object[] objArr, Object[] objArr2) {
        this.f33539w = objArr;
        this.f33540x = i;
        this.f33541y = objArr2;
        this.f33542z = i6;
        this.f33538A = i9;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final AbstractC4255zC a() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final Object[] c() {
        return this.f33539w;
    }

    @Override // com.google.android.gms.internal.ads.NB, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj != null) {
            Object[] objArr = this.f33541y;
            if (objArr.length != 0) {
                int o6 = AbstractC2639Kg.o(obj);
                while (true) {
                    int i = o6 & this.f33542z;
                    Object obj2 = objArr[i];
                    if (obj2 == null) {
                        return false;
                    }
                    if (obj2.equals(obj)) {
                        return true;
                    }
                    o6 = i + 1;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int e() {
        return this.f33538A;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int h(Object[] objArr, int i) {
        Object[] objArr2 = this.f33539w;
        int i6 = this.f33538A;
        System.arraycopy(objArr2, 0, objArr, i, i6);
        return i + i6;
    }

    @Override // com.google.android.gms.internal.ads.XB, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f33540x;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return f().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.XB
    public final RB m() {
        return RB.p(this.f33539w, this.f33538A);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.f33538A;
    }
}
