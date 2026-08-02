package com.google.android.material.progressindicator;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ViewUtils;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;

/* loaded from: classes4.dex */
public final class CircularProgressIndicatorSpec extends BaseProgressIndicatorSpec {
    public int indeterminateAnimationType;
    public final boolean indeterminateTrackVisible;
    public int indicatorDirection;
    public int indicatorInset;
    public int indicatorSize;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int i2 = CircularProgressIndicator.$r8$clinit;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_size_medium);
        int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_progress_circular_inset_medium);
        ViewUtils.checkCompatibleTheme(context, attributeSet, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        int[] iArr = R$styleable.CircularProgressIndicator;
        ViewUtils.checkTextAppearance(context, attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_MaterialComponents_CircularProgressIndicator);
        this.indeterminateAnimationType = obtainStyledAttributes.getInt(0, 0);
        this.indicatorSize = Math.max(ContextUtilsKt.getDimensionPixelSize(context, obtainStyledAttributes, 4, dimensionPixelSize), this.trackThickness * 2);
        this.indicatorInset = ContextUtilsKt.getDimensionPixelSize(context, obtainStyledAttributes, 3, dimensionPixelSize2);
        this.indicatorDirection = obtainStyledAttributes.getInt(2, 0);
        this.indeterminateTrackVisible = obtainStyledAttributes.getBoolean(1, true);
        obtainStyledAttributes.recycle();
        validateSpec();
    }

    public CircularProgressIndicatorSpec(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.circularProgressIndicatorStyle);
    }
}
