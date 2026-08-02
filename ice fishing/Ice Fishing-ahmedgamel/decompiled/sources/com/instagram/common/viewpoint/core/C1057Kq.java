package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1057Kq extends AbstractRunnableC1347Wc {
    public final /* synthetic */ AbstractC1545bb A00;

    public C1057Kq(AbstractC1545bb abstractC1545bb) {
        this.A00 = abstractC1545bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC1545bb abstractC1545bb = this.A00;
            i = this.A00.A08;
            abstractC1545bb.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC1545bb abstractC1545bb2 = this.A00;
            runnable = this.A00.A0A;
            abstractC1545bb2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
