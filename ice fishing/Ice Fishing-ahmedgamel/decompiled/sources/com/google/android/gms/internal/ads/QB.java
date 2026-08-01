package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class QB extends RB {

    /* renamed from: v, reason: collision with root package name */
    public final transient int f27000v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f27001w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RB f27002x;

    public QB(RB rb, int i, int i6) {
        Objects.requireNonNull(rb);
        this.f27002x = rb;
        this.f27000v = i;
        this.f27001w = i6;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final Object[] c() {
        return this.f27002x.c();
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int d() {
        return this.f27002x.d() + this.f27000v;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int e() {
        return this.f27002x.d() + this.f27000v + this.f27001w;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2772Sd.K(i, this.f27001w);
        return this.f27002x.get(i + this.f27000v);
    }

    @Override // com.google.android.gms.internal.ads.RB, java.util.List
    /* renamed from: i */
    public final RB subList(int i, int i6) {
        AbstractC2772Sd.M(i, i6, this.f27001w);
        int i9 = this.f27000v;
        return this.f27002x.subList(i + i9, i6 + i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27001w;
    }
}
