package com.instagram.common.viewpoint.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* loaded from: assets/audience_network/classes2.dex */
public class GX extends AbstractRunnableC1347Wc {
    public final /* synthetic */ InterfaceC1682dp A00;
    public final /* synthetic */ C1683dq A01;

    public GX(C1683dq c1683dq, InterfaceC1682dp interfaceC1682dp) {
        this.A01 = c1683dq;
        this.A00 = interfaceC1682dp;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1347Wc
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new GY(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
