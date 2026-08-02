package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.f4, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1758f4 extends AbstractRunnableC1347Wc {
    public final /* synthetic */ C1856ge A00;

    public C1758f4(C1856ge c1856ge) {
        this.A00 = c1856ge;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        for (TY ty : TX.A02()) {
            TX.A0A(this.A00, ty.A02(), ty.A00(), ty.A01(), false);
        }
        TX.A02().clear();
    }
}
