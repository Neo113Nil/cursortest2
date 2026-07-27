package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1036Kq extends AbstractRunnableC1326Wc {
    public final /* synthetic */ AbstractC1524bb A00;

    public C1036Kq(AbstractC1524bb abstractC1524bb) {
        this.A00 = abstractC1524bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC1524bb abstractC1524bb = this.A00;
            i = this.A00.A08;
            abstractC1524bb.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC1524bb abstractC1524bb2 = this.A00;
            runnable = this.A00.A0A;
            abstractC1524bb2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
