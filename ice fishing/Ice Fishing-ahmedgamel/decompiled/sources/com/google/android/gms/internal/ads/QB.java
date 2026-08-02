package com.google.android.gms.internal.ads;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class QB extends RB {

    /* renamed from: v, reason: collision with root package name */
    public final transient int f27787v;

    /* renamed from: w, reason: collision with root package name */
    public final transient int f27788w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ RB f27789x;

    public QB(RB rb, int i, int i4) {
        Objects.requireNonNull(rb);
        this.f27789x = rb;
        this.f27787v = i;
        this.f27788w = i4;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final Object[] c() {
        return this.f27789x.c();
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int d() {
        return this.f27789x.d() + this.f27787v;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final int e() {
        return this.f27789x.d() + this.f27787v + this.f27788w;
    }

    @Override // com.google.android.gms.internal.ads.NB
    public final boolean g() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        AbstractC2792Sd.K(i, this.f27788w);
        return this.f27789x.get(i + this.f27787v);
    }

    @Override // com.google.android.gms.internal.ads.RB, java.util.List
    /* renamed from: i */
    public final RB subList(int i, int i4) {
        AbstractC2792Sd.M(i, i4, this.f27788w);
        int i6 = this.f27787v;
        return this.f27789x.subList(i + i6, i4 + i6);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f27788w;
    }
}
