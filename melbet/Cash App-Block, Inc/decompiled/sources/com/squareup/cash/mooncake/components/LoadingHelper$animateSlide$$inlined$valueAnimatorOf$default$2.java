package com.squareup.cash.mooncake.components;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.PausedCompositionImpl;
import com.squareup.cash.clientroutes.Matcher$$ExternalSyntheticOutline0;
import com.squareup.cash.ui.widget.text.FigmaTextView;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public final class LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2 implements Animator.AnimatorListener, ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ boolean $loading$inlined;
    public final /* synthetic */ boolean $loading$inlined$1;
    public final /* synthetic */ int $loadingStartTranslation$inlined;
    public final /* synthetic */ List $viewsToAnimate$inlined;
    public final /* synthetic */ PausedCompositionImpl this$0;

    public LoadingHelper$animateSlide$$inlined$valueAnimatorOf$default$2(boolean z, PausedCompositionImpl pausedCompositionImpl, List list, int i, boolean z2) {
        this.$loading$inlined = z;
        this.this$0 = pausedCompositionImpl;
        this.$viewsToAnimate$inlined = list;
        this.$loadingStartTranslation$inlined = i;
        this.$loading$inlined$1 = z2;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        PausedCompositionImpl pausedCompositionImpl = this.this$0;
        ViewGroup viewGroup = (ViewGroup) pausedCompositionImpl.composition;
        animator.getClass();
        if (this.$loading$inlined$1) {
            return;
        }
        viewGroup.getOverlay().remove((FigmaTextView) pausedCompositionImpl.lock);
        viewGroup.getOverlay().remove((MooncakeProgress) pausedCompositionImpl.state);
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        animator.getClass();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        PausedCompositionImpl pausedCompositionImpl = this.this$0;
        ViewGroup viewGroup = (ViewGroup) pausedCompositionImpl.composition;
        animator.getClass();
        if (this.$loading$inlined) {
            viewGroup.getOverlay().add((FigmaTextView) pausedCompositionImpl.lock);
            viewGroup.getOverlay().add((MooncakeProgress) pausedCompositionImpl.state);
        }
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) Matcher$$ExternalSyntheticOutline0.m(valueAnimator)).floatValue();
        Iterator it = this.$viewsToAnimate$inlined.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setTranslationX(floatValue);
        }
        PausedCompositionImpl pausedCompositionImpl = this.this$0;
        float f = this.$loadingStartTranslation$inlined + floatValue;
        ((FigmaTextView) pausedCompositionImpl.lock).setTranslationX(f);
        ((MooncakeProgress) pausedCompositionImpl.state).setTranslationX(f);
    }
}
