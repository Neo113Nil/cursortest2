package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1871hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1870hC A01;

    public C1871hD(C1870hC c1870hC, int i) {
        this.A01 = c1870hC;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        C1840gi c1840gi;
        c1840gi = this.A01.A0C;
        c1840gi.A0F().ABa();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f3) {
        C1521bX c1521bX;
        C1521bX c1521bX2;
        float f9 = 1.0f - (f3 / this.A00);
        c1521bX = this.A01.A0G;
        if (c1521bX != null) {
            c1521bX2 = this.A01.A0G;
            c1521bX2.setProgressWithAnimation(100.0f * f9);
        }
    }
}
