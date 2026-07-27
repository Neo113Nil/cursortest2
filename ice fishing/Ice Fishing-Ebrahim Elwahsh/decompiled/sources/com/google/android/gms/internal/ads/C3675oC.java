package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.oC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3675oC extends UB {

    /* renamed from: x, reason: collision with root package name */
    public static final C3675oC f33115x = new C3675oC(new Object[0], 0);

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f33116v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f33117w;

    public C3675oC(Object[] objArr, int i) {
        this.f33116v = objArr;
        this.f33117w = i;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final Object[] c() {
        return this.f33116v;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final int e() {
        return this.f33117w;
    }

    @Override // com.google.android.gms.internal.ads.QB
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        PA.a0(i, this.f33117w);
        Object obj = this.f33116v[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.UB, com.google.android.gms.internal.ads.QB
    public final int h(Object[] objArr, int i) {
        Object[] objArr2 = this.f33116v;
        int i4 = this.f33117w;
        System.arraycopy(objArr2, 0, objArr, i, i4);
        return i + i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f33117w;
    }
}
