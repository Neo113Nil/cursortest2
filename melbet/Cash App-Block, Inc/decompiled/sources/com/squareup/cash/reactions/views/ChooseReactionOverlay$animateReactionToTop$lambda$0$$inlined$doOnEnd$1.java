package com.squareup.cash.reactions.views;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public final class ChooseReactionOverlay$animateReactionToTop$lambda$0$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    public final /* synthetic */ ReactionView $animatedReaction$inlined;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ ChooseReactionOverlay this$0;

    public /* synthetic */ ChooseReactionOverlay$animateReactionToTop$lambda$0$$inlined$doOnEnd$1(ChooseReactionOverlay chooseReactionOverlay, ReactionView reactionView, int i) {
        this.$r8$classId = i;
        this.this$0 = chooseReactionOverlay;
        this.$animatedReaction$inlined = reactionView;
    }

    private final void onAnimationCancel$com$squareup$cash$reactions$views$ChooseReactionOverlay$animateReactionToHover$lambda$1$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationCancel$com$squareup$cash$reactions$views$ChooseReactionOverlay$animateReactionToTop$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$reactions$views$ChooseReactionOverlay$animateReactionToHover$lambda$1$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$reactions$views$ChooseReactionOverlay$animateReactionToTop$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$reactions$views$ChooseReactionOverlay$animateReactionToHover$lambda$1$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$reactions$views$ChooseReactionOverlay$animateReactionToTop$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        ValueAnimator valueAnimator;
        int i = this.$r8$classId;
        ReactionView reactionView = this.$animatedReaction$inlined;
        ChooseReactionOverlay chooseReactionOverlay = this.this$0;
        switch (i) {
            case 0:
                chooseReactionOverlay.reactionViews.remove(reactionView);
                chooseReactionOverlay.removeView(reactionView);
                int i2 = chooseReactionOverlay.activeReactionAnimations - 1;
                chooseReactionOverlay.activeReactionAnimations = i2;
                if (i2 == 0 && (valueAnimator = chooseReactionOverlay.pendingAnimation) != null) {
                    valueAnimator.start();
                    break;
                }
                break;
            default:
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setStartDelay(500L);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(reactionView, "y", RecyclerView.DECELERATION_RATE);
                ofFloat.setInterpolator(new OvershootInterpolator(1.5f));
                animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(reactionView, "scaleX", RecyclerView.DECELERATION_RATE), ObjectAnimator.ofFloat(reactionView, "scaleY", RecyclerView.DECELERATION_RATE));
                animatorSet.addListener(new ChooseReactionOverlay$animateReactionToTop$lambda$0$$inlined$doOnEnd$1(chooseReactionOverlay, reactionView, 0));
                animatorSet.start();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.$r8$classId;
    }
}
