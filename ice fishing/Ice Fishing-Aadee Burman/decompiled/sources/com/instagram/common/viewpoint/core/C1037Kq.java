package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1037Kq extends AbstractRunnableC1327Wc {
    public final /* synthetic */ AbstractC1525bb A00;

    public C1037Kq(AbstractC1525bb abstractC1525bb) {
        this.A00 = abstractC1525bb;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        Runnable runnable;
        int i;
        if (this.A00.isPressed()) {
            AbstractC1525bb abstractC1525bb = this.A00;
            i = this.A00.A08;
            abstractC1525bb.postDelayed(this, i);
        } else {
            this.A00.setPressed(true);
            AbstractC1525bb abstractC1525bb2 = this.A00;
            runnable = this.A00.A0A;
            abstractC1525bb2.postOnAnimationDelayed(runnable, 250L);
        }
    }
}
