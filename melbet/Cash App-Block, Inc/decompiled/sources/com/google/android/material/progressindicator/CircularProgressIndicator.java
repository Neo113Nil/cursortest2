package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.core.content.res.ResourcesCompat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.mlkit.vision.text.Text;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public class CircularProgressIndicator extends BaseProgressIndicator {
    public static final /* synthetic */ int $r8$clinit = 0;

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.spec;
        CircularDrawingDelegate circularDrawingDelegate = new CircularDrawingDelegate(circularProgressIndicatorSpec);
        Context context2 = getContext();
        IndeterminateDrawable indeterminateDrawable = new IndeterminateDrawable(context2, circularProgressIndicatorSpec, circularDrawingDelegate, circularProgressIndicatorSpec.indeterminateAnimationType == 1 ? new CircularIndeterminateRetreatAnimatorDelegate(context2, circularProgressIndicatorSpec) : new CircularIndeterminateAdvanceAnimatorDelegate(circularProgressIndicatorSpec));
        Resources resources = context2.getResources();
        VectorDrawableCompat vectorDrawableCompat = new VectorDrawableCompat();
        vectorDrawableCompat.mDelegateDrawable = ResourcesCompat.getDrawable(resources, R.drawable.ic_mtrl_arrow_circle, null);
        indeterminateDrawable.staticDummyDrawable = vectorDrawableCompat;
        setIndeterminateDrawable(indeterminateDrawable);
        setProgressDrawable(new DeterminateDrawable(getContext(), circularProgressIndicatorSpec, circularDrawingDelegate));
        this.initialized = true;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec createSpec(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public void setIndeterminateAnimationType(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateAnimationType == i) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateAnimationType = i;
        ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).validateSpec();
        Text.TextBase circularIndeterminateRetreatAnimatorDelegate = i == 1 ? new CircularIndeterminateRetreatAnimatorDelegate(getContext(), (CircularProgressIndicatorSpec) baseProgressIndicatorSpec) : new CircularIndeterminateAdvanceAnimatorDelegate((CircularProgressIndicatorSpec) baseProgressIndicatorSpec);
        IndeterminateDrawable indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.animatorDelegate = circularIndeterminateRetreatAnimatorDelegate;
        circularIndeterminateRetreatAnimatorDelegate.zza = indeterminateDrawable;
        registerSwitchIndeterminateModeCallback();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.spec).indicatorDirection = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset != i) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorInset = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        int max = Math.max(i, baseProgressIndicatorSpec.trackThickness * 2);
        if (((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize != max) {
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorSize = max;
            ((CircularProgressIndicatorSpec) baseProgressIndicatorSpec).validateSpec();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.spec).validateSpec();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }
}
