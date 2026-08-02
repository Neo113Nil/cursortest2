package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.material.R$styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;

/* loaded from: classes4.dex */
public abstract class BaseProgressIndicatorSpec {
    public int hideAnimationBehavior;
    public float indeterminateAnimatorDurationScale;
    public int[] indicatorColors;
    public int indicatorTrackGapSize;
    public int showAnimationBehavior;
    public int trackColor;
    public int trackCornerRadius;
    public float trackCornerRadiusFraction;
    public int trackThickness;
    public boolean useRelativeTrackCornerRadius;
    public int waveAmplitude;
    public float waveAmplitudeRampProgressMax;
    public float waveAmplitudeRampProgressMin;
    public int waveSpeed;
    public int wavelengthDeterminate;
    public int wavelengthIndeterminate;

    public BaseProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i, int i2) {
        this.indicatorColors = new int[0];
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_track_thickness);
        ViewUtils.checkCompatibleTheme(context, attributeSet, i, i2);
        int[] iArr = R$styleable.BaseProgressIndicator;
        ViewUtils.checkTextAppearance(context, attributeSet, iArr, i, i2, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        this.trackThickness = ContextUtilsKt.getDimensionPixelSize(context, obtainStyledAttributes, 10, dimensionPixelSize);
        TypedValue peekValue = obtainStyledAttributes.peekValue(9);
        if (peekValue != null) {
            int i3 = peekValue.type;
            if (i3 == 5) {
                this.trackCornerRadius = Math.min(TypedValue.complexToDimensionPixelSize(peekValue.data, obtainStyledAttributes.getResources().getDisplayMetrics()), this.trackThickness / 2);
                this.useRelativeTrackCornerRadius = false;
            } else if (i3 == 6) {
                this.trackCornerRadiusFraction = Math.min(peekValue.getFraction(1.0f, 1.0f), 0.5f);
                this.useRelativeTrackCornerRadius = true;
            }
        }
        this.showAnimationBehavior = obtainStyledAttributes.getInt(6, 0);
        this.hideAnimationBehavior = obtainStyledAttributes.getInt(1, 0);
        this.indicatorTrackGapSize = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        int abs = Math.abs(obtainStyledAttributes.getDimensionPixelSize(15, 0));
        this.wavelengthDeterminate = Math.abs(obtainStyledAttributes.getDimensionPixelSize(16, abs));
        this.wavelengthIndeterminate = Math.abs(obtainStyledAttributes.getDimensionPixelSize(17, abs));
        this.waveAmplitude = Math.abs(obtainStyledAttributes.getDimensionPixelSize(11, 0));
        this.waveSpeed = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.indeterminateAnimatorDurationScale = obtainStyledAttributes.getFloat(2, 1.0f);
        this.waveAmplitudeRampProgressMin = obtainStyledAttributes.getFloat(13, 0.1f);
        this.waveAmplitudeRampProgressMax = obtainStyledAttributes.getFloat(12, 0.9f);
        if (!obtainStyledAttributes.hasValue(3)) {
            Integer colorOrNull = MaterialColors.getColorOrNull(context, R.attr.colorPrimary);
            this.indicatorColors = new int[]{colorOrNull != null ? colorOrNull.intValue() : -1};
        } else if (obtainStyledAttributes.peekValue(3).type != 1) {
            this.indicatorColors = new int[]{obtainStyledAttributes.getColor(3, -1)};
        } else {
            int[] intArray = context.getResources().getIntArray(obtainStyledAttributes.getResourceId(3, -1));
            this.indicatorColors = intArray;
            if (intArray.length == 0) {
                a$$ExternalSyntheticBUOutline0.m$3("indicatorColors cannot be empty when indicatorColor is not used.");
                throw null;
            }
        }
        if (obtainStyledAttributes.hasValue(8)) {
            this.trackColor = obtainStyledAttributes.getColor(8, -1);
        } else {
            this.trackColor = this.indicatorColors[0];
            TypedArray obtainStyledAttributes2 = context.getTheme().obtainStyledAttributes(new int[]{android.R.attr.disabledAlpha});
            float f = obtainStyledAttributes2.getFloat(0, 0.2f);
            obtainStyledAttributes2.recycle();
            this.trackColor = MaterialColors.compositeARGBWithAlpha(this.trackColor, (int) (f * 255.0f));
        }
        obtainStyledAttributes.recycle();
    }

    public final int getTrackCornerRadiusInPx() {
        return this.useRelativeTrackCornerRadius ? (int) (this.trackThickness * this.trackCornerRadiusFraction) : this.trackCornerRadius;
    }

    public final boolean hasWavyEffect(boolean z) {
        if (this.waveAmplitude <= 0) {
            return false;
        }
        if (z || this.wavelengthIndeterminate <= 0) {
            return z && this.wavelengthDeterminate > 0;
        }
        return true;
    }

    public boolean useStrokeCap() {
        return this.useRelativeTrackCornerRadius && this.trackCornerRadiusFraction == 0.5f;
    }

    public void validateSpec() {
        if (this.indicatorTrackGapSize >= 0) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$3("indicatorTrackGapSize must be >= 0.");
    }
}
