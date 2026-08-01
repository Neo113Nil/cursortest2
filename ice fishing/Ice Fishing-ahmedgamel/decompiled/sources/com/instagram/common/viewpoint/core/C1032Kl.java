package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1032Kl extends AbstractRunnableC1327Wc {
    public final /* synthetic */ AbstractC1525bb A00;

    public C1032Kl(AbstractC1525bb abstractC1525bb) {
        this.A00 = abstractC1525bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        Runnable runnable;
        int i;
        this.A00.setPressed(false);
        AbstractC1525bb abstractC1525bb = this.A00;
        runnable = this.A00.A09;
        i = this.A00.A08;
        abstractC1525bb.postOnAnimationDelayed(runnable, i);
    }
}
