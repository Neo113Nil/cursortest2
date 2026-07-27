package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1040Ku implements YI {
    public final /* synthetic */ C1514bR A00;

    public C1040Ku(C1514bR c1514bR) {
        this.A00 = c1514bR;
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AFx() {
        boolean z8;
        ViewOnClickListenerC1037Kr viewOnClickListenerC1037Kr;
        z8 = this.A00.A09;
        if (!z8) {
            return;
        }
        viewOnClickListenerC1037Kr = this.A00.A08;
        viewOnClickListenerC1037Kr.performClick();
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AG8() {
        this.A00.A04();
    }
}
