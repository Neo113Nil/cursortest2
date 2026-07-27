package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Wr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1340Wr extends AbstractRunnableC1326Wc {
    public final /* synthetic */ Wm A00;

    public C1340Wr(Wm wm) {
        this.A00 = wm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        long j9;
        long j10;
        Wm.A00(this.A00);
        j9 = this.A00.A01;
        if (j9 > 0) {
            try {
                j10 = this.A00.A01;
                Thread.sleep(j10);
            } catch (InterruptedException unused) {
            }
        }
        this.A00.A0B();
    }
}
