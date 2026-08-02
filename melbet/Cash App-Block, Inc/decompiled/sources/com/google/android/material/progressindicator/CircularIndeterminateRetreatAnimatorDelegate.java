package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ViewUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.motion.MotionUtils;
import com.google.mlkit.vision.text.Text;
import com.squareup.cash.R;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class CircularIndeterminateRetreatAnimatorDelegate extends Text.TextBase {
    public static final ViewUtils.AnonymousClass1 ANIMATION_FRACTION;
    public static final ViewUtils.AnonymousClass1 COMPLETE_END_FRACTION;
    public static final FastOutSlowInInterpolator DEFAULT_INTERPOLATOR = AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR;
    public static final int[] DELAY_SPINS_IN_MS = {0, 1500, 3000, 4500};
    public static final float[] END_FRACTION_RANGE = {0.1f, 0.87f};
    public float animationFraction;
    public ObjectAnimator animator;
    public Animatable2Compat$AnimationCallback animatorCompleteCallback;
    public final CircularProgressIndicatorSpec baseSpec;
    public ObjectAnimator completeEndAnimator;
    public float completeEndFraction;
    public int indicatorColorIndexOffset;
    public final TimeInterpolator standardInterpolator;

    static {
        Class<Float> cls = Float.class;
        ANIMATION_FRACTION = new ViewUtils.AnonymousClass1(16, cls, "animationFraction");
        COMPLETE_END_FRACTION = new ViewUtils.AnonymousClass1(17, cls, "completeEndFraction");
    }

    public CircularIndeterminateRetreatAnimatorDelegate(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.indicatorColorIndexOffset = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = circularProgressIndicatorSpec;
        this.standardInterpolator = MotionUtils.resolveThemeInterpolator(context, R.attr.motionEasingStandardInterpolator, DEFAULT_INTERPOLATOR);
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
        maybeInitializeAnimators$1();
        ObjectAnimator objectAnimator = this.animator;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.baseSpec;
        objectAnimator.setDuration((long) (circularProgressIndicatorSpec.indeterminateAnimatorDurationScale * 6000.0f));
        this.completeEndAnimator.setDuration((long) (circularProgressIndicatorSpec.indeterminateAnimatorDurationScale * 500.0f));
        this.indicatorColorIndexOffset = 0;
        ((DrawingDelegate$ActiveIndicator) ((ArrayList) this.zzd).get(0)).color = circularProgressIndicatorSpec.indicatorColors[0];
        this.completeEndFraction = RecyclerView.DECELERATION_RATE;
    }

    public final void maybeInitializeAnimators$1() {
        ObjectAnimator objectAnimator = this.animator;
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = this.baseSpec;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, RecyclerView.DECELERATION_RATE, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration((long) (circularProgressIndicatorSpec.indeterminateAnimatorDurationScale * 6000.0f));
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            final int i = 0;
            this.animator.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate.1
                public final /* synthetic */ CircularIndeterminateRetreatAnimatorDelegate this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 1:
                            super.onAnimationEnd(animator);
                            CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = this.this$0;
                            circularIndeterminateRetreatAnimatorDelegate.cancelAnimatorImmediately();
                            Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback = circularIndeterminateRetreatAnimatorDelegate.animatorCompleteCallback;
                            if (animatable2Compat$AnimationCallback != null) {
                                animatable2Compat$AnimationCallback.onAnimationEnd((IndeterminateDrawable) circularIndeterminateRetreatAnimatorDelegate.zza);
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
                            CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = this.this$0;
                            circularIndeterminateRetreatAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateRetreatAnimatorDelegate.indicatorColorIndexOffset + CircularIndeterminateRetreatAnimatorDelegate.DELAY_SPINS_IN_MS.length) % circularIndeterminateRetreatAnimatorDelegate.baseSpec.indicatorColors.length;
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
            ofFloat2.setDuration((long) (circularProgressIndicatorSpec.indeterminateAnimatorDurationScale * 500.0f));
            final int i2 = 1;
            this.completeEndAnimator.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.progressindicator.CircularIndeterminateRetreatAnimatorDelegate.1
                public final /* synthetic */ CircularIndeterminateRetreatAnimatorDelegate this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (i2) {
                        case 1:
                            super.onAnimationEnd(animator);
                            CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = this.this$0;
                            circularIndeterminateRetreatAnimatorDelegate.cancelAnimatorImmediately();
                            Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback = circularIndeterminateRetreatAnimatorDelegate.animatorCompleteCallback;
                            if (animatable2Compat$AnimationCallback != null) {
                                animatable2Compat$AnimationCallback.onAnimationEnd((IndeterminateDrawable) circularIndeterminateRetreatAnimatorDelegate.zza);
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
                            CircularIndeterminateRetreatAnimatorDelegate circularIndeterminateRetreatAnimatorDelegate = this.this$0;
                            circularIndeterminateRetreatAnimatorDelegate.indicatorColorIndexOffset = (circularIndeterminateRetreatAnimatorDelegate.indicatorColorIndexOffset + CircularIndeterminateRetreatAnimatorDelegate.DELAY_SPINS_IN_MS.length) % circularIndeterminateRetreatAnimatorDelegate.baseSpec.indicatorColors.length;
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
        maybeInitializeAnimators$1();
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
