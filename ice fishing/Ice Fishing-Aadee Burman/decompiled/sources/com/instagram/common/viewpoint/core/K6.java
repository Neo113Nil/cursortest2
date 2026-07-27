package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public class K6 extends AbstractRunnableC1327Wc {
    public final /* synthetic */ C1003Ji A00;
    public final /* synthetic */ boolean A01;

    public K6(C1003Ji c1003Ji, boolean z3) {
        this.A00 = c1003Ji;
        this.A01 = z3;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        C1557c7 c1557c7;
        c1557c7 = this.A00.A0b;
        AbstractC1375Yb A0B = c1557c7.A0B();
        if (A0B == null) {
            return;
        }
        A0B.setPageDetailsVisible((this.A01 || A0B.A0E()) ? false : true);
        A0B.setToolbarActionMode(this.A00.getCloseButtonStyle());
    }
}
