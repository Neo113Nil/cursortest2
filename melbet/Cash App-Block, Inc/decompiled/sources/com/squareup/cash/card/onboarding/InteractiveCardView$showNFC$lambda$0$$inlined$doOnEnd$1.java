package com.squareup.cash.card.onboarding;

import android.animation.Animator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.filament.View;

/* loaded from: classes6.dex */
public final class InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ InteractiveCardView this$0;

    public /* synthetic */ InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1(InteractiveCardView interactiveCardView, int i) {
        this.$r8$classId = i;
        this.this$0 = interactiveCardView;
    }

    private final void onAnimationCancel$com$squareup$cash$card$onboarding$InteractiveCardView$animateNFC$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationCancel$com$squareup$cash$card$onboarding$InteractiveCardView$animateNFC$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationCancel$com$squareup$cash$card$onboarding$InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationEnd$com$squareup$cash$card$onboarding$InteractiveCardView$animateNFC$lambda$0$$inlined$doOnCancel$1(Animator animator) {
    }

    private final void onAnimationEnd$com$squareup$cash$card$onboarding$InteractiveCardView$animateNFC$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$card$onboarding$InteractiveCardView$animateNFC$lambda$0$$inlined$doOnCancel$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$card$onboarding$InteractiveCardView$animateNFC$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$card$onboarding$InteractiveCardView$animateNFC$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$card$onboarding$InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$card$onboarding$InteractiveCardView$animateNFC$lambda$0$$inlined$doOnCancel$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$card$onboarding$InteractiveCardView$animateNFC$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$card$onboarding$InteractiveCardView$showNFC$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$r8$classId) {
            case 1:
                InteractiveCardView interactiveCardView = this.this$0;
                interactiveCardView.setEnabled(true);
                interactiveCardView.startWobble(true);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.$r8$classId;
        InteractiveCardView interactiveCardView = this.this$0;
        switch (i) {
            case 0:
                View.FogOptions fogOptions = interactiveCardView.fogOptions;
                fogOptions.maximumOpacity = RecyclerView.DECELERATION_RATE;
                interactiveCardView.setFogOptions(fogOptions);
                break;
            case 2:
                interactiveCardView.setEnabled(true);
                InteractiveCardView.access$continueWobble(interactiveCardView, true);
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
            case 0:
            case 1:
            case 2:
                break;
            default:
                this.this$0.setEnabled(false);
                break;
        }
    }
}
