package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0902Ep extends AbstractRunnableC1347Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0897Ek A02;

    public C0902Ep(C0897Ek c0897Ek, int i, int i4) {
        this.A02 = c0897Ek;
        this.A00 = i;
        this.A01 = i4;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        UM um;
        um = this.A02.A0C;
        um.A02(new C0885Dy(this.A00, this.A01));
    }
}
