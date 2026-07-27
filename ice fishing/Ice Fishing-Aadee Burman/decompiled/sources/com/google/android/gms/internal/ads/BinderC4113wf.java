package com.google.android.gms.internal.ads;

import q2.C4920z0;

/* renamed from: com.google.android.gms.internal.ads.wf, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class BinderC4113wf extends AbstractBinderC3520lf {

    /* renamed from: n, reason: collision with root package name */
    public k2.m f34845n;

    /* renamed from: u, reason: collision with root package name */
    public k2.q f34846u;

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void D(int i) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void K0(C4920z0 c4920z0) {
        k2.m mVar = this.f34845n;
        if (mVar != null) {
            mVar.onAdFailedToShowFullScreenContent(c4920z0.a());
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void d() {
        k2.m mVar = this.f34845n;
        if (mVar != null) {
            mVar.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void e() {
        k2.m mVar = this.f34845n;
        if (mVar != null) {
            mVar.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void j() {
        k2.m mVar = this.f34845n;
        if (mVar != null) {
            mVar.onAdImpression();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void k() {
        k2.m mVar = this.f34845n;
        if (mVar != null) {
            mVar.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3574mf
    public final void o1(InterfaceC3198ff interfaceC3198ff) {
        k2.q qVar = this.f34846u;
        if (qVar != null) {
            qVar.onUserEarnedReward(new Ux(12, interfaceC3198ff));
        }
    }
}
