package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ViewUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.mlkit.vision.text.Text;
import java.util.ArrayList;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class CircularIndeterminateAdvanceAnimatorDelegate extends Text.TextBase {
    public static final ViewUtils.AnonymousClass1 ANIMATION_FRACTION;
    public static final ViewUtils.AnonymousClass1 COMPLETE_END_FRACTION;
    public float animationFraction;
    public ObjectAnimator animator;
    public Animatable2Compat$AnimationCallback animatorCompleteCallback;
    public final CircularProgressIndicatorSpec baseSpec;
    public ObjectAnimator completeEndAnimator;
    public float completeEndFraction;
    public int indicatorColorIndexOffset;
    public final FastOutSlowInInterpolator interpolator;
    public static final int[] DELAY_TO_EXPAND_IN_MS = {0, 1350, 2700, 4050};
    public static final int[] DELAY_TO_COLLAPSE_IN_MS = {667, 2017, 3367, 4717};
    public static final int[] DELAY_TO_FADE_IN_MS = {IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 2350, 3700, 5050};

    static {
        Class<Float> cls = Float.class;
        ANIMATION_FRACTION = new ViewUtils.AnonymousClass1(14, cls, "animationFraction");
        COMPLETE_END_FRACTION = new ViewUtils.AnonymousClass1(15, cls, "completeEndFraction");
    }

    public CircularIndeterminateAdvanceAnimatorDelegate(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.indicatorColorIndexOffset = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = circularProgressIndicatorSpec;
        this.interpolator = new FastOutSlowInInterpolator(0);
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void cancelAnimatorImmediately() {
        ObjectAnimator objectAnimator = this.animator;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void invalidateSpecValues() {
        maybeInitializeAnimators();
        ObjectAnimator objectAnimator = this.animator;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.baseSpec;
        objectAnimator.setDuration((long) (circularProgressIndicatorSpec.indeterminateAnimatorDurationScale * 5400.0f));
        this.completeEndAnimator.setDuration((long) (circularProgressIndicatorSpec.indeterminateAnimatorDurationScale * 333.0f));
        this.indicatorColorIndexOffset = 0;
        ((DrawingDelegate$ActiveIndicator) ((ArrayList) this.zzd).get(0)).color = circularProgressIndicatorSpec.indicatorColors[0];
        this.completeEndFraction = RecyclerView.DECELERATION_RATE;
    }

    public final void maybeInitializeAnimators() {
        ObjectAnimator objectAnimator = this.animator;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.baseSpec;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, RecyclerView.DECELERATION_RATE, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration((long) (circularProgressIndicatorSpec.indeterminateAnimatorDurationScale * 5400.0f));
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            final int i = 0;
            this.animator.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.1
                public final /* synthetic */ CircularIndeterminateAdvanceAnimatorDelegate this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 1:
                            super.onAnimationEnd(animator);
                            CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = this.this$0;
                            circularIndeterminateAdvanceAnimatorDelegate.cancelAnimatorImmediately();
                            Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback = circularIndeterminateAdvanceAnimatorDelegate.animatorCompleteCallback;
                            if (animatable2Compat$AnimationCallback != null) {
                                animatable2Compat$AnimationCallback.onAnimationEnd((IndeterminateDrawable) circularIndeterminateAdvanceAnimatorDelegate.zza);
                                break;
                            }
                            break;
                        default:
                            super.onAnimationEnd(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    switch (i) {
                        case 0:
                            super.onAnimationRepeat(animator);
                            CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = this.this$0;
                            circularIndeterminateAdvanceAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateAdvanceAnimatorDelegate.indicatorColorIndexOffset + 4) % circularIndeterminateAdvanceAnimatorDelegate.baseSpec.indicatorColors.length;
                            break;
                        default:
                            super.onAnimationRepeat(animator);
                            break;
                    }
                }
            });
        }
        if (this.completeEndAnimator == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, COMPLETE_END_FRACTION, RecyclerView.DECELERATION_RATE, 1.0f);
            this.completeEndAnimator = ofFloat2;
            ofFloat2.setDuration((long) (circularProgressIndicatorSpec.indeterminateAnimatorDurationScale * 333.0f));
            this.completeEndAnimator.setInterpolator(this.interpolator);
            final int i2 = 1;
            this.completeEndAnimator.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.progressindicator.CircularIndeterminateAdvanceAnimatorDelegate.1
                public final /* synthetic */ CircularIndeterminateAdvanceAnimatorDelegate this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (i2) {
                        case 1:
                            super.onAnimationEnd(animator);
                            CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = this.this$0;
                            circularIndeterminateAdvanceAnimatorDelegate.cancelAnimatorImmediately();
                            Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback = circularIndeterminateAdvanceAnimatorDelegate.animatorCompleteCallback;
                            if (animatable2Compat$AnimationCallback != null) {
                                animatable2Compat$AnimationCallback.onAnimationEnd((IndeterminateDrawable) circularIndeterminateAdvanceAnimatorDelegate.zza);
                                break;
                            }
                            break;
                        default:
                            super.onAnimationEnd(animator);
                            break;
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationRepeat(Animator animator) {
                    switch (i2) {
                        case 0:
                            super.onAnimationRepeat(animator);
                            CircularIndeterminateAdvanceAnimatorDelegate circularIndeterminateAdvanceAnimatorDelegate = this.this$0;
                            circularIndeterminateAdvanceAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateAdvanceAnimatorDelegate.indicatorColorIndexOffset + 4) % circularIndeterminateAdvanceAnimatorDelegate.baseSpec.indicatorColors.length;
                            break;
                        default:
                            super.onAnimationRepeat(animator);
                            break;
                    }
                }
            });
        }
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void registerAnimatorsCompleteCallback(MaterialCheckBox.AnonymousClass1 anonymousClass1) {
        this.animatorCompleteCallback = anonymousClass1;
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void requestCancelAnimatorAfterCurrentCycle() {
        ObjectAnimator objectAnimator = this.completeEndAnimator;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (((IndeterminateDrawable) this.zza).isVisible()) {
            this.completeEndAnimator.start();
        } else {
            cancelAnimatorImmediately();
        }
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void startAnimator() {
        maybeInitializeAnimators();
        this.indicatorColorIndexOffset = 0;
        ((DrawingDelegate$ActiveIndicator) ((ArrayList) this.zzd).get(0)).color = this.baseSpec.indicatorColors[0];
        this.completeEndFraction = RecyclerView.DECELERATION_RATE;
        this.animator.start();
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void unregisterAnimatorsCompleteCallback() {
        this.animatorCompleteCallback = null;
    }
}
