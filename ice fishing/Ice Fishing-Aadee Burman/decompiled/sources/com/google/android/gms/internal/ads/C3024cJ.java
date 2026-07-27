package com.google.android.gms.internal.ads;

import java.security.spec.ECPoint;

/* renamed from: com.google.android.gms.internal.ads.cJ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3024cJ extends AJ {

    /* renamed from: b, reason: collision with root package name */
    public final ZI f29441b;

    /* renamed from: c, reason: collision with root package name */
    public final ECPoint f29442c;

    /* renamed from: d, reason: collision with root package name */
    public final C3240gK f29443d;

    /* renamed from: e, reason: collision with root package name */
    public final Integer f29444e;

    public C3024cJ(ZI zi, ECPoint eCPoint, C3240gK c3240gK, Integer num) {
        this.f29441b = zi;
        this.f29442c = eCPoint;
        this.f29443d = c3240gK;
        this.f29444e = num;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final /* synthetic */ AbstractC3825rE b() {
        return this.f29441b;
    }

    @Override // com.google.android.gms.internal.ads.WC
    public final Integer e() {
        return this.f29444e;
    }

    @Override // com.google.android.gms.internal.ads.AJ
    public final C3240gK i() {
        return this.f29443d;
    }
}
