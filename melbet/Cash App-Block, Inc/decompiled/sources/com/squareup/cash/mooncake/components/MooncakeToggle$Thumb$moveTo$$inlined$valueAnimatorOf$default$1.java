package com.squareup.cash.mooncake.components;

import android.animation.Animator;
import android.animation.ValueAnimator;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.mooncake.components.MooncakeToggle;
import com.squareup.cash.ui.widget.text.AnimatedAmountTextView;

/* loaded from: classes6.dex */
public final class MooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1 implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ MooncakeToggle$Thumb$moveTo$$inlined$valueAnimatorOf$default$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.$r8$classId;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.$r8$classId;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        int i = this.$r8$classId;
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        int i = this.$r8$classId;
        animator.getClass();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.$r8$classId;
        Object obj = this.this$0;
        switch (i) {
            case 0:
                MooncakeToggle.Thumb thumb = (MooncakeToggle.Thumb) obj;
                thumb.xLocation = ((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue();
                thumb.recreatePathFromLocation();
                break;
            default:
                ((AnimatedAmountTextView) obj).invalidate();
                break;
        }
    }
}
