package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.ads.cJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3047cJ extends AJ {

    /* renamed from: b, reason: collision with root package name */
    public final ZI f30224b;

    /* renamed from: c, reason: collision with root package name */
    public final ECPoint f30225c;

    /* renamed from: d, reason: collision with root package name */
    public final C3263gK f30226d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f30227e;

    public C3047cJ(ZI zi, ECPoint eCPoint, C3263gK c3263gK, Integer num) {
        this.f30224b = zi;
        this.f30225c = eCPoint;
        this.f30226d = c3263gK;
        this.f30227e = num;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3848rE b() {
        return this.f30224b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f30227e;
    }

    @Override // com.google.android.gms.internal.ads.AJ
    public final C3263gK i() {
        return this.f30226d;
    }
}
