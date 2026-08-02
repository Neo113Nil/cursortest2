package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C1023Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C1023Ji c1023Ji, boolean z6) {
        this.A00 = c1023Ji;
        this.A01 = z6;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        C1577c7 c1577c7;
        c1577c7 = this.A00.A0b;
        AbstractC1395Yb A0B = c1577c7.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A01 || A0B.A0E()) ? false : true);
        A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
