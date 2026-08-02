package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.transition.ViewUtils;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat$AnimationCallback;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.mlkit.vision.text.Text;
import com.squareup.cash.R;
import java.util.ArrayList;
import java.util.Iterator;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public final class LinearIndeterminateDisjointAnimatorDelegate extends Text.TextBase {
    public float animationFraction;
    public ObjectAnimator animator;
    public Animatable2Compat$AnimationCallback animatorCompleteCallback;
    public final LinearProgressIndicatorSpec baseSpec;
    public ObjectAnimator completeEndAnimator;
    public boolean dirtyColors;
    public int indicatorColorIndex;
    public final Interpolator[] interpolatorArray;
    public static final int[] DURATION_TO_MOVE_SEGMENT_ENDS = {533, 567, 850, 750};
    public static final int[] DELAY_TO_MOVE_SEGMENT_ENDS = {1267, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO, 333, 0};
    public static final ViewUtils.AnonymousClass1 ANIMATION_FRACTION = new ViewUtils.AnonymousClass1(20, Float.class, "animationFraction");

    public LinearIndeterminateDisjointAnimatorDelegate(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(2);
        this.indicatorColorIndex = 0;
        this.animatorCompleteCallback = null;
        this.baseSpec = linearProgressIndicatorSpec;
        Interpolator loadInterpolator = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_head_interpolator);
        Room.requireNonNull(loadInterpolator, "Failed to parse interpolator, no start tag found");
        Interpolator loadInterpolator2 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line1_tail_interpolator);
        Room.requireNonNull(loadInterpolator2, "Failed to parse interpolator, no start tag found");
        Interpolator loadInterpolator3 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_head_interpolator);
        Room.requireNonNull(loadInterpolator3, "Failed to parse interpolator, no start tag found");
        Interpolator loadInterpolator4 = AnimationUtils.loadInterpolator(context, R.anim.linear_indeterminate_line2_tail_interpolator);
        Room.requireNonNull(loadInterpolator4, "Failed to parse interpolator, no start tag found");
        this.interpolatorArray = new Interpolator[]{loadInterpolator, loadInterpolator2, loadInterpolator3, loadInterpolator4};
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
        maybeInitializeAnimators$3();
        ObjectAnimator objectAnimator = this.animator;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.baseSpec;
        objectAnimator.setDuration((long) (linearProgressIndicatorSpec.indeterminateAnimatorDurationScale * 1800.0f));
        this.completeEndAnimator.setDuration((long) (linearProgressIndicatorSpec.indeterminateAnimatorDurationScale * 1800.0f));
        resetPropertiesForNewStart();
    }

    public final void maybeInitializeAnimators$3() {
        ObjectAnimator objectAnimator = this.animator;
        final int i = 0;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.baseSpec;
        ViewUtils.AnonymousClass1 anonymousClass1 = ANIMATION_FRACTION;
        if (objectAnimator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, anonymousClass1, RecyclerView.DECELERATION_RATE, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration((long) (linearProgressIndicatorSpec.indeterminateAnimatorDurationScale * 1800.0f));
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                public final /* synthetic */ LinearIndeterminateDisjointAnimatorDelegate this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (i) {
                        case 1:
                            super.onAnimationEnd(animator);
                            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = this.this$0;
                            linearIndeterminateDisjointAnimatorDelegate.cancelAnimatorImmediately();
                            Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback = linearIndeterminateDisjointAnimatorDelegate.animatorCompleteCallback;
                            if (animatable2Compat$AnimationCallback != null) {
                                animatable2Compat$AnimationCallback.onAnimationEnd((IndeterminateDrawable) linearIndeterminateDisjointAnimatorDelegate.zza);
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
                            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = this.this$0;
                            linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex = (linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex + 1) % linearIndeterminateDisjointAnimatorDelegate.baseSpec.indicatorColors.length;
                            linearIndeterminateDisjointAnimatorDelegate.dirtyColors = true;
                            break;
                        default:
                            super.onAnimationRepeat(animator);
                            break;
                    }
                }
            });
        }
        if (this.completeEndAnimator == null) {
            final int i2 = 1;
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, anonymousClass1, 1.0f);
            this.completeEndAnimator = ofFloat2;
            ofFloat2.setDuration((long) (linearProgressIndicatorSpec.indeterminateAnimatorDurationScale * 1800.0f));
            this.completeEndAnimator.setInterpolator(null);
            this.completeEndAnimator.addListener(new AnimatorListenerAdapter(this) { // from class: com.google.android.material.progressindicator.LinearIndeterminateDisjointAnimatorDelegate.1
                public final /* synthetic */ LinearIndeterminateDisjointAnimatorDelegate this$0;

                {
                    this.this$0 = this;
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(Animator animator) {
                    switch (i2) {
                        case 1:
                            super.onAnimationEnd(animator);
                            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = this.this$0;
                            linearIndeterminateDisjointAnimatorDelegate.cancelAnimatorImmediately();
                            Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback = linearIndeterminateDisjointAnimatorDelegate.animatorCompleteCallback;
                            if (animatable2Compat$AnimationCallback != null) {
                                animatable2Compat$AnimationCallback.onAnimationEnd((IndeterminateDrawable) linearIndeterminateDisjointAnimatorDelegate.zza);
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
                            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = this.this$0;
                            linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex = (linearIndeterminateDisjointAnimatorDelegate.indicatorColorIndex + 1) % linearIndeterminateDisjointAnimatorDelegate.baseSpec.indicatorColors.length;
                            linearIndeterminateDisjointAnimatorDelegate.dirtyColors = true;
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
        cancelAnimatorImmediately();
        if (((IndeterminateDrawable) this.zza).isVisible()) {
            this.completeEndAnimator.setFloatValues(this.animationFraction, 1.0f);
            this.completeEndAnimator.setDuration((long) ((1.0f - this.animationFraction) * 1800.0f));
            this.completeEndAnimator.start();
        }
    }

    public final void resetPropertiesForNewStart() {
        this.indicatorColorIndex = 0;
        Iterator it = ((ArrayList) this.zzd).iterator();
        while (it.hasNext()) {
            ((DrawingDelegate$ActiveIndicator) it.next()).color = this.baseSpec.indicatorColors[0];
        }
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void startAnimator() {
        maybeInitializeAnimators$3();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void unregisterAnimatorsCompleteCallback() {
        this.animatorCompleteCallback = null;
    }
}
