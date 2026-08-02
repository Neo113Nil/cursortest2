package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1891hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1890hC A01;

    public C1891hD(C1890hC c1890hC, int i) {
        this.A01 = c1890hC;
        this.A00 = i;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        C1860gi c1860gi;
        c1860gi = this.A01.A0C;
        c1860gi.A0F().ABa();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f2) {
        C1541bX c1541bX;
        C1541bX c1541bX2;
        float f9 = 1.0f - (f2 / this.A00);
        c1541bX = this.A01.A0G;
        if (c1541bX != null) {
            c1541bX2 = this.A01.A0G;
            c1541bX2.setProgressWithAnimation(100.0f * f9);
        }
    }
}
