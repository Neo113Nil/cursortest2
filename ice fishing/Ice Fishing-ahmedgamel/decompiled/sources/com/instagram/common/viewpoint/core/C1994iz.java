package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1994iz extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C2047jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C07337j A02;

    public C1994iz(C07337j c07337j, O8 o82, C2047jz c2047jz) {
        this.A02 = c07337j;
        this.A01 = o82;
        this.A00 = c2047jz;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C1332Vm A00 = C1332Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
