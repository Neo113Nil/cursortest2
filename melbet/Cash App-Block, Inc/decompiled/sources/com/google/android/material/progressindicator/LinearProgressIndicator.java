package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import java.util.Objects;

/* loaded from: classes4.dex */
public class LinearProgressIndicator extends BaseProgressIndicator {
    public static final /* synthetic */ int $r8$clinit = 0;

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.spec;
        LinearDrawingDelegate linearDrawingDelegate = new LinearDrawingDelegate(linearProgressIndicatorSpec);
        linearDrawingDelegate.trackLength = 300.0f;
        linearDrawingDelegate.endPoints = new Pair(new DrawingDelegate$PathPoint(), new DrawingDelegate$PathPoint());
        Context context2 = getContext();
        setIndeterminateDrawable(new IndeterminateDrawable(context2, linearProgressIndicatorSpec, linearDrawingDelegate, linearProgressIndicatorSpec.indeterminateAnimationType == 0 ? new LinearIndeterminateContiguousAnimatorDelegate(linearProgressIndicatorSpec) : new LinearIndeterminateDisjointAnimatorDelegate(context2, linearProgressIndicatorSpec)));
        setProgressDrawable(new DeterminateDrawable(getContext(), linearProgressIndicatorSpec, linearDrawingDelegate));
        this.initialized = true;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final BaseProgressIndicatorSpec createSpec(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorDirection != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorDirection != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorDirection != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        IndeterminateDrawable indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        DeterminateDrawable progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateAnimationType == i) {
            return;
        }
        if (visibleToUser() && isIndeterminate()) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
            return;
        }
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateAnimationType = i;
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).validateSpec();
        if (i == 0) {
            IndeterminateDrawable indeterminateDrawable = getIndeterminateDrawable();
            LinearIndeterminateContiguousAnimatorDelegate linearIndeterminateContiguousAnimatorDelegate = new LinearIndeterminateContiguousAnimatorDelegate((LinearProgressIndicatorSpec) baseProgressIndicatorSpec);
            indeterminateDrawable.animatorDelegate = linearIndeterminateContiguousAnimatorDelegate;
            linearIndeterminateContiguousAnimatorDelegate.zza = indeterminateDrawable;
        } else {
            IndeterminateDrawable indeterminateDrawable2 = getIndeterminateDrawable();
            LinearIndeterminateDisjointAnimatorDelegate linearIndeterminateDisjointAnimatorDelegate = new LinearIndeterminateDisjointAnimatorDelegate(getContext(), (LinearProgressIndicatorSpec) baseProgressIndicatorSpec);
            indeterminateDrawable2.animatorDelegate = linearIndeterminateDisjointAnimatorDelegate;
            linearIndeterminateDisjointAnimatorDelegate.zza = indeterminateDrawable2;
        }
        registerSwitchIndeterminateModeCallback();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.spec).validateSpec();
    }

    public void setIndicatorDirection(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorDirection = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) baseProgressIndicatorSpec;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indicatorDirection != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.drawHorizontallyInverse = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i, boolean z) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (baseProgressIndicatorSpec != null && ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).indeterminateAnimationType == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i, z);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.spec).validateSpec();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackInnerCornerRadius != i) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackInnerCornerRadius = Math.round(Math.min(i, ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackThickness / 2.0f));
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).useRelativeTrackInnerCornerRadius = false;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).hasInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).validateSpec();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackInnerCornerRadiusFraction != f) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackInnerCornerRadiusFraction = Math.min(f, 0.5f);
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).useRelativeTrackInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).hasInnerCornerRadius = true;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).validateSpec();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (Objects.equals(((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackStopIndicatorPadding, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackStopIndicatorPadding = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        BaseProgressIndicatorSpec baseProgressIndicatorSpec = this.spec;
        if (((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackStopIndicatorSize != i) {
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).trackStopIndicatorSize = i;
            ((LinearProgressIndicatorSpec) baseProgressIndicatorSpec).validateSpec();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }
}
