package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1052Kl extends AbstractRunnableC1347Wc {
    public final /* synthetic */ AbstractC1545bb A00;

    public C1052Kl(AbstractC1545bb abstractC1545bb) {
        this.A00 = abstractC1545bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC1545bb abstractC1545bb = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC1545bb.postOnAnimationDelayed(runnable, i);
    }
}
