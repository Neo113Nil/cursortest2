package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0918Ga extends AbstractRunnableC1327Wc {
    public final /* synthetic */ C06494x A00;

    public C0918Ga(C06494x c06494x) {
        this.A00 = c06494x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        AbstractC1553c3 abstractC1553c3;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC1553c3 abstractC1553c32;
        abstractC1553c3 = this.A00.A00;
        if (abstractC1553c3 != null) {
            abstractC1553c32 = this.A00.A00;
            abstractC1553c32.A1F();
        }
        AbstractC1375Yb abstractC1375Yb = this.A00.A09;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC1375Yb.setToolbarActionMode(closeButtonStyle);
        this.A00.A09.A0A();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
