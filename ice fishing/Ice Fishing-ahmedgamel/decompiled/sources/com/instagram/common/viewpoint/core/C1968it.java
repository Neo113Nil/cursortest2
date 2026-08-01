package com.instagram.common.viewpoint.core;

import com.facebook.ads.internal.protocol.AdErrorType;

/* renamed from: com.facebook.ads.redexgen.X.it, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1968it extends AbstractRunnableC1327Wc {
    public final /* synthetic */ C07267w A00;
    public final /* synthetic */ O8 A01;
    public final /* synthetic */ C07047a A02;

    public C1968it(C07047a c07047a, O8 o82, C07267w c07267w) {
        this.A02 = c07047a;
        this.A01 = o82;
        this.A00 = c07267w;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        this.A02.A0T(this.A01);
        this.A02.A0Q(this.A00);
        this.A02.A00 = null;
        AdErrorType adErrorType = AdErrorType.RV_AD_TIMEOUT;
        this.A02.A0B.A0F().A5g(adErrorType.getErrorCode(), adErrorType.getDefaultErrorMessage());
        this.A02.A07.A0G(new C1312Vm(adErrorType, ""));
    }
}
