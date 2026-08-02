package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.R$styleable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.squareup.cash.R;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.util.ArrayList;
import java.util.Collections;

/* loaded from: classes4.dex */
public class MaterialToolbar extends Toolbar {
    public static final ImageView.ScaleType[] LOGO_SCALE_TYPE_ARRAY = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};
    public Boolean logoAdjustViewBounds;
    public ImageView.ScaleType logoScaleType;
    public Integer navigationIconTint;
    public boolean subtitleCentered;
    public boolean titleCentered;

    public MaterialToolbar(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar), attributeSet, i);
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.MaterialToolbar, i, R.style.Widget_MaterialComponents_Toolbar, new int[0]);
        if (obtainStyledAttributes.hasValue(2)) {
            setNavigationIconTint(obtainStyledAttributes.getColor(2, -1));
        }
        this.titleCentered = obtainStyledAttributes.getBoolean(6, false);
        this.subtitleCentered = obtainStyledAttributes.getBoolean(5, false);
        int i2 = obtainStyledAttributes.getInt(1, -1);
        if (i2 >= 0) {
            ImageView.ScaleType[] scaleTypeArr = LOGO_SCALE_TYPE_ARRAY;
            if (i2 < scaleTypeArr.length) {
                this.logoScaleType = scaleTypeArr[i2];
            }
        }
        if (obtainStyledAttributes.hasValue(0)) {
            this.logoAdjustViewBounds = Boolean.valueOf(obtainStyledAttributes.getBoolean(0, false));
        }
        obtainStyledAttributes.recycle();
        ShapeAppearanceModel build = ShapeAppearanceModel.builder(context2, attributeSet, i, R.style.Widget_MaterialComponents_Toolbar).build();
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : SelfieUtilsKt.getColorStateListOrNull(background);
        if (valueOf != null) {
            MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(build);
            materialShapeDrawable.setFillColor(valueOf);
            materialShapeDrawable.initializeElevationOverlay(context2);
            materialShapeDrawable.setElevation(getElevation());
            setBackground(materialShapeDrawable);
        }
    }

    public final void layoutTitleCenteredHorizontally(TextView textView, Pair pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = textView.getMeasuredWidth();
        int i = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i2 = measuredWidth2 + i;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i, 0), Math.max(i2 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i += max;
            i2 -= max;
            textView.measure(View.MeasureSpec.makeMeasureSpec(i2 - i, 1073741824), textView.getMeasuredHeightAndState());
        }
        textView.layout(i, textView.getTop(), i2, textView.getBottom());
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        RetryKt.setParentAbsoluteElevation(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ImageView imageView;
        Drawable drawable;
        super.onLayout(z, i, i2, i3, i4);
        ViewPager.AnonymousClass1 anonymousClass1 = ViewUtils.VIEW_TOP_COMPARATOR;
        int i5 = 0;
        ImageView imageView2 = null;
        if (this.titleCentered || this.subtitleCentered) {
            ArrayList textViewsWithText = ViewUtils.getTextViewsWithText(this, this.mTitleText);
            TextView textView = textViewsWithText.isEmpty() ? null : (TextView) Collections.min(textViewsWithText, anonymousClass1);
            ArrayList textViewsWithText2 = ViewUtils.getTextViewsWithText(this, this.mSubtitleText);
            TextView textView2 = textViewsWithText2.isEmpty() ? null : (TextView) Collections.max(textViewsWithText2, anonymousClass1);
            if (textView != null || textView2 != null) {
                int measuredWidth = getMeasuredWidth();
                int i6 = measuredWidth / 2;
                int paddingLeft = getPaddingLeft();
                int paddingRight = measuredWidth - getPaddingRight();
                for (int i7 = 0; i7 < getChildCount(); i7++) {
                    View childAt = getChildAt(i7);
                    if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                        if (childAt.getRight() < i6 && childAt.getRight() > paddingLeft) {
                            paddingLeft = childAt.getRight();
                        }
                        if (childAt.getLeft() > i6 && childAt.getLeft() < paddingRight) {
                            paddingRight = childAt.getLeft();
                        }
                    }
                }
                Pair pair = new Pair(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
                if (this.titleCentered && textView != null) {
                    layoutTitleCenteredHorizontally(textView, pair);
                }
                if (this.subtitleCentered && textView2 != null) {
                    layoutTitleCenteredHorizontally(textView2, pair);
                }
            }
        }
        AppCompatImageView appCompatImageView = this.mLogoView;
        Drawable drawable2 = appCompatImageView != null ? appCompatImageView.getDrawable() : null;
        if (drawable2 != null) {
            while (true) {
                if (i5 >= getChildCount()) {
                    break;
                }
                View childAt2 = getChildAt(i5);
                if ((childAt2 instanceof ImageView) && (drawable = (imageView = (ImageView) childAt2).getDrawable()) != null && drawable.getConstantState() != null && drawable.getConstantState().equals(drawable2.getConstantState())) {
                    imageView2 = imageView;
                    break;
                }
                i5++;
            }
        }
        if (imageView2 != null) {
            Boolean bool = this.logoAdjustViewBounds;
            if (bool != null) {
                imageView2.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.logoScaleType;
            if (scaleType != null) {
                imageView2.setScaleType(scaleType);
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        Drawable background = getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f);
        }
    }

    public void setLogoAdjustViewBounds(boolean z) {
        Boolean bool = this.logoAdjustViewBounds;
        if (bool == null || bool.booleanValue() != z) {
            this.logoAdjustViewBounds = Boolean.valueOf(z);
            requestLayout();
        }
    }

    public void setLogoScaleType(ImageView.ScaleType scaleType) {
        if (this.logoScaleType != scaleType) {
            this.logoScaleType = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null && this.navigationIconTint != null) {
            drawable = drawable.mutate();
            drawable.setTint(this.navigationIconTint.intValue());
        }
        super.setNavigationIcon(drawable);
    }

    public void setNavigationIconTint(int i) {
        this.navigationIconTint = Integer.valueOf(i);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z) {
        if (this.subtitleCentered != z) {
            this.subtitleCentered = z;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z) {
        if (this.titleCentered != z) {
            this.titleCentered = z;
            requestLayout();
        }
    }

    public MaterialToolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public MaterialToolbar(Context context) {
        this(context, null);
    }
}
