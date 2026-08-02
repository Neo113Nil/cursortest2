package com.squareup.cash.card.onboarding;

import android.animation.Animator;
import androidx.compose.runtime.MutableState;

/* loaded from: classes6.dex */
public final class InteractiveCardView$startWobble$lambda$0$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    public final /* synthetic */ boolean $front$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object this$0;

    public InteractiveCardView$startWobble$lambda$0$$inlined$doOnEnd$1(MutableState mutableState, boolean z) {
        this.$front$inlined = z;
        this.this$0 = mutableState;
    }

    private final void onAnimationCancel$com$squareup$cash$card$onboarding$InteractiveCardView$startWobble$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$card$onboarding$InteractiveCardView$startWobble$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$card$onboarding$InteractiveCardView$startWobble$lambda$0$$inlined$doOnEnd$1(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        boolean z = this.$front$inlined;
        switch (i) {
            case 0:
                InteractiveCardView.access$continueWobble((InteractiveCardView) obj, z);
                break;
            default:
                animator.getClass();
                if (!z) {
                    ((MutableState) obj).setValue(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                animator.getClass();
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                break;
            default:
                animator.getClass();
                break;
        }
    }

    public InteractiveCardView$startWobble$lambda$0$$inlined$doOnEnd$1(InteractiveCardView interactiveCardView, boolean z) {
        this.this$0 = interactiveCardView;
        this.$front$inlined = z;
    }
}
