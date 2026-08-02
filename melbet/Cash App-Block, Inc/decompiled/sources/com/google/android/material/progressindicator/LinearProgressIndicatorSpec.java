package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ViewUtils;
import com.squareup.cash.R;

/* loaded from: classes4.dex */
public final class LinearProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public boolean drawHorizontallyInverse;
    public boolean hasInnerCornerRadius;
    public int indeterminateAnimationType;
    public int indicatorDirection;
    public int trackInnerCornerRadius;
    public float trackInnerCornerRadiusFraction;
    public Integer trackStopIndicatorPadding;
    public int trackStopIndicatorSize;
    public boolean useRelativeTrackInnerCornerRadius;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int i2 = LinearProgressIndicator.$r8$clinit;
        ViewUtils.checkCompatibleTheme(context, attributeSet, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        int[] iArr = R$styleable.LinearProgressIndicator;
        ViewUtils.checkTextAppearance(context, attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.linearProgressIndicatorStyle, R.style.Widget_MaterialComponents_LinearProgressIndicator);
        this.indeterminateAnimationType = obtainStyledAttributes.getInt(0, 1);
        this.indicatorDirection = obtainStyledAttributes.getInt(1, 0);
        this.trackStopIndicatorSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        if (obtainStyledAttributes.hasValue(3)) {
            this.trackStopIndicatorPadding = Integer.valueOf(obtainStyledAttributes.getDimensionPixelSize(3, 0));
        }
        TypedValue peekValue = obtainStyledAttributes.peekValue(2);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                this.trackInnerCornerRadius = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), this.trackThickness / 2);
                this.useRelativeTrackInnerCornerRadius = false;
                this.hasInnerCornerRadius = true;
            } else if (i3 == 6) {
                this.trackInnerCornerRadiusFraction = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.useRelativeTrackInnerCornerRadius = true;
                this.hasInnerCornerRadius = true;
            }
        }
        obtainStyledAttributes.recycle();
        validateSpec();
        this.drawHorizontallyInverse = this.indicatorDirection == 1;
    }

    public final int getTrackInnerCornerRadiusInPx() {
        return !this.hasInnerCornerRadius ? getTrackCornerRadiusInPx() : this.useRelativeTrackInnerCornerRadius ? (int) (this.trackThickness * this.trackInnerCornerRadiusFraction) : this.trackInnerCornerRadius;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public final boolean useStrokeCap() {
        return super.useStrokeCap() && getTrackInnerCornerRadiusInPx() == getTrackCornerRadiusInPx();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicatorSpec
    public final void validateSpec() {
        super.validateSpec();
        if (this.trackStopIndicatorSize < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("Stop indicator size must be >= 0.");
            return;
        }
        if (this.indeterminateAnimationType == 0) {
            if ((getTrackCornerRadiusInPx() > 0 || (this.hasInnerCornerRadius && getTrackInnerCornerRadiusInPx() > 0)) && this.indicatorTrackGapSize == 0) {
                a$$ExternalSyntheticBUOutline0.m$3("Rounded corners without gap are not supported in contiguous indeterminate animation.");
            } else {
                if (this.indicatorColors.length >= 3) {
                    return;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
            }
        }
    }

    public LinearProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.linearProgressIndicatorStyle);
    }
}
