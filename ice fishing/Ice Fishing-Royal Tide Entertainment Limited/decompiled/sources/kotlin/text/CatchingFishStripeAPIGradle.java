package kotlin.text;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* loaded from: classes.dex */
public final class CatchingFishStripeAPIGradle extends AnimatorListenerAdapter {
    public boolean CatchingFishParcelableFAB = false;
    public final /* synthetic */ CatchingFishGsonNavigation CatchingFishSnackbar;

    public CatchingFishStripeAPIGradle(CatchingFishGsonNavigation catchingFishGsonNavigation) {
        this.CatchingFishSnackbar = catchingFishGsonNavigation;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.CatchingFishParcelableFAB = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.CatchingFishParcelableFAB) {
            this.CatchingFishParcelableFAB = false;
            return;
        }
        CatchingFishGsonNavigation catchingFishGsonNavigation = this.CatchingFishSnackbar;
        if (((Float) catchingFishGsonNavigation.CatchingFishCardViewRealm.getAnimatedValue()).floatValue() == 0.0f) {
            catchingFishGsonNavigation.CatchingFishPayPal = 0;
            catchingFishGsonNavigation.CatchingFishWorkManager(0);
        } else {
            catchingFishGsonNavigation.CatchingFishPayPal = 2;
            catchingFishGsonNavigation.CatchingFish.invalidate();
        }
    }
}
