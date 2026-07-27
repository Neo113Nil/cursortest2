package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC1326Wc {
    public final /* synthetic */ C1002Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C1002Ji c1002Ji, boolean z8) {
        this.A00 = c1002Ji;
        this.A01 = z8;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        C1556c7 c1556c7;
        c1556c7 = this.A00.A0b;
        AbstractC1374Yb A0B = c1556c7.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A01 || A0B.A0E()) ? false : true);
        A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
