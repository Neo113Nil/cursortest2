package com.instagram.common.viewpoint.core;

import android.R;

/* loaded from: assets/audience_network/classes2.dex */
public class PQ extends AbstractRunnableC1326Wc {
    public final /* synthetic */ AnimationAnimationListenerC1393Yu A00;

    public PQ(AnimationAnimationListenerC1393Yu animationAnimationListenerC1393Yu) {
        this.A00 = animationAnimationListenerC1393Yu;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1326Wc
    public final void A07() {
        this.A00.A00.finish(3);
        this.A00.A00.A05().overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
    }
}
