package com.instagram.common.viewpoint.core;

import android.os.Handler;
import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Yl, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class AnimationAnimationListenerC1405Yl implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnClickListenerC07216x A00;

    public AnimationAnimationListenerC1405Yl(ViewOnClickListenerC07216x viewOnClickListenerC07216x) {
        this.A00 = viewOnClickListenerC07216x;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        int i;
        Handler handler;
        Runnable runnable;
        int i4;
        this.A00.A06();
        i = this.A00.A04;
        if (i > 0) {
            handler = this.A00.A05;
            runnable = this.A00.A07;
            i4 = this.A00.A04;
            handler.postDelayed(runnable, i4);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
    }
}
