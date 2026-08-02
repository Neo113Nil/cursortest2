package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1061Ku implements YI {
    public final /* synthetic */ C1535bR A00;

    public C1061Ku(C1535bR c1535bR) {
        this.A00 = c1535bR;
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AFx() {
        boolean z6;
        ViewOnClickListenerC1058Kr viewOnClickListenerC1058Kr;
        z6 = this.A00.A09;
        if (!z6) {
            return;
        }
        viewOnClickListenerC1058Kr = this.A00.A08;
        viewOnClickListenerC1058Kr.performClick();
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AG8() {
        this.A00.A04();
    }
}
