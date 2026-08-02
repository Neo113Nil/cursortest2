package com.google.android.gms.internal.ads;

import s2.C4969z0;

/* renamed from: com.google.android.gms.internal.ads.wf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4136wf extends AbstractBinderC3543lf {

    /* renamed from: n, reason: collision with root package name */
    public m2.m f35622n;

    /* renamed from: u, reason: collision with root package name */
    public m2.q f35623u;

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void D(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void d() {
        m2.m mVar = this.f35622n;
        if (mVar != null) {
            mVar.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void e() {
        m2.m mVar = this.f35622n;
        if (mVar != null) {
            mVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void j() {
        m2.m mVar = this.f35622n;
        if (mVar != null) {
            mVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void k() {
        m2.m mVar = this.f35622n;
        if (mVar != null) {
            mVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void n1(C4969z0 c4969z0) {
        m2.m mVar = this.f35622n;
        if (mVar != null) {
            mVar.onAdFailedToShowFullScreenContent(c4969z0.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3597mf
    public final void o1(InterfaceC3221ff interfaceC3221ff) {
        m2.q qVar = this.f35623u;
        if (qVar != null) {
            qVar.onUserEarnedReward(new Ux(12, interfaceC3221ff));
        }
    }
}
