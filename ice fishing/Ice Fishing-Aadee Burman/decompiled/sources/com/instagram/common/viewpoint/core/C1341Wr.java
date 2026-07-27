package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Wr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1341Wr extends AbstractRunnableC1327Wc {
    public final /* synthetic */ Wm A00;

    public C1341Wr(Wm wm) {
        this.A00 = wm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        long j6;
        long j9;
        Wm.A00(this.A00);
        j6 = this.A00.A01;
        if (j6 > 0) {
            try {
                j9 = this.A00.A01;
                Thread.sleep(j9);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
