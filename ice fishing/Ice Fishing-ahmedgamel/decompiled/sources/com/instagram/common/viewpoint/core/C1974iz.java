package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.iz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1974iz extends AbstractRunnableC1327Wc {
    public final /* synthetic */ C2027jz A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C07137j A02;

    public C1974iz(C07137j c07137j, O8 o82, C2027jz c2027jz) {
        this.A02 = c07137j;
        this.A01 = o82;
        this.A00 = c2027jz;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        C1312Vm A00 = C1312Vm.A00(AdErrorType.INTERSTITIAL_AD_TIMEOUT);
        this.A02.A0B.A0F().A5g(A00.A03().getErrorCode(), A00.A04());
        this.A02.A07.A0G(A00);
    }
}
