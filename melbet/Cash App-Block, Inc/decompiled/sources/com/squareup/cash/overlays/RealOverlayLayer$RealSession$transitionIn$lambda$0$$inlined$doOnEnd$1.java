package com.squareup.cash.overlays;

import android.animation.Animator;
import com.squareup.cash.overlays.RealOverlayLayer;

/* loaded from: classes6.dex */
public final class RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ RealOverlayLayer this$0;
    public final /* synthetic */ RealOverlayLayer.RealSession this$1$inlined;

    public /* synthetic */ RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1(RealOverlayLayer realOverlayLayer, RealOverlayLayer.RealSession realSession, int i) {
        this.$r8$classId = i;
        this.this$0 = realOverlayLayer;
        this.this$1$inlined = realSession;
    }

    private final void onAnimationCancel$com$squareup$cash$overlays$RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationCancel$com$squareup$cash$overlays$RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationCancel$com$squareup$cash$overlays$RealOverlayLayer$RealSession$transitionOut$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationEnd$com$squareup$cash$overlays$RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$overlays$RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$overlays$RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$overlays$RealOverlayLayer$RealSession$transitionOut$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$overlays$RealOverlayLayer$RealSession$transitionIn$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$overlays$RealOverlayLayer$RealSession$transitionOut$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.$r8$classId;
        RealOverlayLayer.RealSession realSession = this.this$1$inlined;
        RealOverlayLayer realOverlayLayer = this.this$0;
        switch (i) {
            case 0:
                RealOverlayLayer.access$updateSiblingAccessibility(realOverlayLayer);
                realSession.overlay.onEnterDone();
                break;
            case 1:
                break;
            default:
                realOverlayLayer.removeView(realSession.view);
                RealOverlayLayer.access$updateSiblingAccessibility(realOverlayLayer);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$r8$classId) {
            case 1:
                this.this$0.addView(this.this$1$inlined.view);
                break;
        }
    }
}
