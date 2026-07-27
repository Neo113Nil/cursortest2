package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ku, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1041Ku implements YI {
    public final /* synthetic */ C1515bR A00;

    public C1041Ku(C1515bR c1515bR) {
        this.A00 = c1515bR;
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AFx() {
        boolean z3;
        ViewOnClickListenerC1038Kr viewOnClickListenerC1038Kr;
        z3 = this.A00.A09;
        if (!z3) {
            return;
        }
        viewOnClickListenerC1038Kr = this.A00.A08;
        viewOnClickListenerC1038Kr.performClick();
    }

    @Override // com.instagram.common.viewpoint.core.YI
    public final void AG8() {
        this.A00.A04();
    }
}
