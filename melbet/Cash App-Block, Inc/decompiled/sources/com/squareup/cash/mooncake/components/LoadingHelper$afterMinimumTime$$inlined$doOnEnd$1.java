package com.squareup.cash.mooncake.components;

import android.animation.Animator;
import kotlin.jvm.functions.Function0;

/* loaded from: classes6.dex */
public final class LoadingHelper$afterMinimumTime$$inlined$doOnEnd$1 implements Animator.AnimatorListener {
    public final /* synthetic */ Function0 $func$inlined;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ LoadingHelper$afterMinimumTime$$inlined$doOnEnd$1(int i, Function0 function0) {
        this.$r8$classId = i;
        this.$func$inlined = function0;
    }

    private final void onAnimationCancel$com$squareup$cash$mooncake$components$LoadingHelper$afterMinimumTime$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationCancel$com$squareup$cash$mooncake$components$PushOnPressAnimator$createAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationEnd$com$squareup$cash$mooncake$components$PushOnPressAnimator$createAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$mooncake$components$LoadingHelper$afterMinimumTime$$inlined$doOnEnd$1(Animator animator) {
    }

    private final void onAnimationRepeat$com$squareup$cash$mooncake$components$PushOnPressAnimator$createAnimator$lambda$0$$inlined$doOnStart$1(Animator animator) {
    }

    private final void onAnimationStart$com$squareup$cash$mooncake$components$LoadingHelper$afterMinimumTime$$inlined$doOnEnd$1(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        int i = this.$r8$classId;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        switch (this.$r8$classId) {
            case 0:
                this.$func$inlined.invoke();
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
                break;
            default:
                this.$func$inlined.invoke();
                break;
        }
    }
}
