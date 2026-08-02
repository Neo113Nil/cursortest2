package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.Transition;
import androidx.transition.ViewUtils;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.mlkit.vision.text.Text;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes4.dex */
public final class LinearIndeterminateContiguousAnimatorDelegate extends Text.TextBase {
    public static final ViewUtils.AnonymousClass1 ANIMATION_FRACTION = new ViewUtils.AnonymousClass1(19, Float.class, "animationFraction");
    public float animationFraction;
    public ObjectAnimator animator;
    public final LinearProgressIndicatorSpec baseSpec;
    public boolean dirtyColors;
    public final FastOutSlowInInterpolator interpolator;
    public int newIndicatorColorIndex;

    public LinearIndeterminateContiguousAnimatorDelegate(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.newIndicatorColorIndex = 1;
        this.baseSpec = linearProgressIndicatorSpec;
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
        maybeInitializeAnimators$2();
        this.animator.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 333.0f));
        resetPropertiesForNewStart();
    }

    public final void maybeInitializeAnimators$2() {
        if (this.animator == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ANIMATION_FRACTION, RecyclerView.DECELERATION_RATE, 1.0f);
            this.animator = ofFloat;
            ofFloat.setDuration((long) (this.baseSpec.indeterminateAnimatorDurationScale * 333.0f));
            this.animator.setInterpolator(null);
            this.animator.setRepeatCount(-1);
            this.animator.addListener(new Transition.AnonymousClass3(this, 9));
        }
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void registerAnimatorsCompleteCallback(MaterialCheckBox.AnonymousClass1 anonymousClass1) {
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void requestCancelAnimatorAfterCurrentCycle() {
    }

    public final void resetPropertiesForNewStart() {
        this.dirtyColors = true;
        this.newIndicatorColorIndex = 1;
        Iterator it = ((ArrayList) this.zzd).iterator();
        while (it.hasNext()) {
            DrawingDelegate$ActiveIndicator drawingDelegate$ActiveIndicator = (DrawingDelegate$ActiveIndicator) it.next();
            LinearProgressIndicatorSpec linearProgressIndicatorSpec = this.baseSpec;
            drawingDelegate$ActiveIndicator.color = linearProgressIndicatorSpec.indicatorColors[0];
            drawingDelegate$ActiveIndicator.gapSize = linearProgressIndicatorSpec.indicatorTrackGapSize / 2;
        }
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void startAnimator() {
        maybeInitializeAnimators$2();
        resetPropertiesForNewStart();
        this.animator.start();
    }

    @Override // com.google.mlkit.vision.text.Text.TextBase
    public final void unregisterAnimatorsCompleteCallback() {
    }
}
