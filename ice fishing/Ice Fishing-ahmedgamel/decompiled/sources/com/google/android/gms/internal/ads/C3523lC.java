package com.google.android.gms.internal.ads;

import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.lC, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3523lC extends RB {

    /* renamed from: x, reason: collision with root package name */
    public static final C3523lC f32525x = new C3523lC(new Object[0], 0);

    /* renamed from: v, reason: collision with root package name */
    public final transient Object[] f32526v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f32527w;

    public C3523lC(Object[] objArr, int i) {
        this.f32526v = objArr;
        this.f32527w = i;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final Object[] c() {
        return this.f32526v;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int d() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int e() {
        return this.f32527w;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2792Sd.K(i, this.f32527w);
        Object obj = this.f32526v[i];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.android.gms.internal.ads.RB, com.google.android.gms.internal.ads.NB
    public final int h(Object[] objArr, int i) {
        Object[] objArr2 = this.f32526v;
        int i4 = this.f32527w;
        System.arraycopy(objArr2, 0, objArr, i, i4);
        return i + i4;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f32527w;
    }
}
