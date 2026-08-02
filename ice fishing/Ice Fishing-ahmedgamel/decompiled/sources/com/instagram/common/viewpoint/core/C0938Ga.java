package com.instagram.common.viewpoint.core;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0938Ga extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C06694x A00;

    public C0938Ga(C06694x c06694x) {
        this.A00 = c06694x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        AbstractC1573c3 abstractC1573c3;
        int closeButtonStyle;
        AtomicBoolean atomicBoolean;
        AbstractC1573c3 abstractC1573c32;
        abstractC1573c3 = this.A00.A00;
        if (abstractC1573c3 != null) {
            abstractC1573c32 = this.A00.A00;
            abstractC1573c32.A1F();
        }
        AbstractC1395Yb abstractC1395Yb = this.A00.A09;
        closeButtonStyle = this.A00.getCloseButtonStyle();
        abstractC1395Yb.setToolbarActionMode(closeButtonStyle);
        this.A00.A09.A0A();
        atomicBoolean = this.A00.A06;
        atomicBoolean.set(true);
    }
}
