package com.instagram.common.viewpoint.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* loaded from: assets/audience_network/classes2.dex */
public class GX extends AbstractRunnableC1327Wc {
    public final /* synthetic */ InterfaceC1662dp A00;
    public final /* synthetic */ C1663dq A01;

    public GX(C1663dq c1663dq, InterfaceC1662dp interfaceC1662dp) {
        this.A01 = c1663dq;
        this.A00 = interfaceC1662dp;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1327Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
