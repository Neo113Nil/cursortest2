package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.lC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3500lC extends RB {

    /* renamed from: x, reason: collision with root package name */
    public static final C3500lC f31745x = new C3500lC(new Object[0], 0);

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f31746v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f31747w;

    public C3500lC(Object[] objArr, int i) {
        this.f31746v = objArr;
        this.f31747w = i;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final Object[] c() {
        return this.f31746v;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int e() {
        return this.f31747w;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2772Sd.K(i, this.f31747w);
        Object obj = this.f31746v[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.RB, com.google.android.gms.internal.ads.NB
    public final int h(Object[] objArr, int i) {
        Object[] objArr2 = this.f31746v;
        int i6 = this.f31747w;
        System.arraycopy(objArr2, 0, objArr, i, i6);
        return i + i6;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f31747w;
    }
}
