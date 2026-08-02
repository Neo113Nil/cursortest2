package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.cardview.widget.RoundRectDrawable;
import androidx.dynamicanimation.animation.SpringForce;
import coil3.size.DimensionKt;
import com.google.android.material.R$styleable;
import com.google.android.material.card.MaterialCardViewHelper;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;

/* loaded from: classes4.dex */
public class MaterialCardView extends CardView implements Checkable, Shapeable {
    public static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final int[] DRAGGED_STATE_SET = {com.squareup.cash.R.attr.state_dragged};
    public static final int[] HOVERED_STATE_SET = {R.attr.state_hovered};
    public final MaterialCardViewHelper cardViewHelper;
    public boolean checked;
    public boolean dragged;
    public final boolean isParentCardViewDoneInitializing;

    public interface OnCheckedChangeListener {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, com.squareup.cash.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        StateListShapeAppearanceModel create;
        this.checked = false;
        this.dragged = false;
        this.isParentCardViewDoneInitializing = true;
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(getContext(), attributeSet, R$styleable.MaterialCardView, i, com.squareup.cash.R.style.Widget_MaterialComponents_CardView, new int[0]);
        MaterialCardViewHelper materialCardViewHelper = new MaterialCardViewHelper(this, attributeSet, i);
        this.cardViewHelper = materialCardViewHelper;
        ColorStateList colorStateList = ((RoundRectDrawable) this.mCardViewDelegate.val$videoEncoderSession).mBackground;
        MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.bgDrawable;
        materialShapeDrawable.setFillColor(colorStateList);
        Rect rect = this.mContentPadding;
        materialCardViewHelper.userContentPadding.set(rect.left, rect.top, rect.right, rect.bottom);
        materialCardViewHelper.updateContentPadding();
        MaterialCardView materialCardView = materialCardViewHelper.materialCardView;
        ColorStateList colorStateList2 = ContextUtilsKt.getColorStateList(materialCardView.getContext(), obtainStyledAttributes, 11);
        materialCardViewHelper.strokeColor = colorStateList2;
        if (colorStateList2 == null) {
            materialCardViewHelper.strokeColor = ColorStateList.valueOf(-1);
        }
        materialCardViewHelper.strokeWidth = obtainStyledAttributes.getDimensionPixelSize(12, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        materialCardViewHelper.checkable = z;
        materialCardView.setLongClickable(z);
        materialCardViewHelper.checkedIconTint = ContextUtilsKt.getColorStateList(materialCardView.getContext(), obtainStyledAttributes, 6);
        materialCardViewHelper.setCheckedIcon(ContextUtilsKt.getDrawable(materialCardView.getContext(), obtainStyledAttributes, 2));
        materialCardViewHelper.checkedIconSize = obtainStyledAttributes.getDimensionPixelSize(5, 0);
        materialCardViewHelper.checkedIconMargin = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        materialCardViewHelper.checkedIconGravity = obtainStyledAttributes.getInteger(3, 8388661);
        ColorStateList colorStateList3 = ContextUtilsKt.getColorStateList(materialCardView.getContext(), obtainStyledAttributes, 7);
        materialCardViewHelper.rippleColor = colorStateList3;
        if (colorStateList3 == null) {
            materialCardViewHelper.rippleColor = ColorStateList.valueOf(MaterialColors.resolveColor(materialCardView.getContext(), MaterialAttributes.resolveTypedValueOrThrow(materialCardView, com.squareup.cash.R.attr.colorControlHighlight)));
        }
        ColorStateList colorStateList4 = ContextUtilsKt.getColorStateList(materialCardView.getContext(), obtainStyledAttributes, 1);
        colorStateList4 = colorStateList4 == null ? ColorStateList.valueOf(0) : colorStateList4;
        MaterialShapeDrawable materialShapeDrawable2 = materialCardViewHelper.foregroundContentDrawable;
        materialShapeDrawable2.setFillColor(colorStateList4);
        RippleDrawable rippleDrawable = materialCardViewHelper.rippleDrawable;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(materialCardViewHelper.rippleColor);
        }
        materialShapeDrawable.setElevation(((CardView) materialCardView.mCardViewDelegate.this$0).getElevation());
        float f = materialCardViewHelper.strokeWidth;
        ColorStateList colorStateList5 = materialCardViewHelper.strokeColor;
        materialShapeDrawable2.drawableState.strokeWidth = f;
        materialShapeDrawable2.invalidateSelf();
        materialShapeDrawable2.setStrokeColor(colorStateList5);
        super.setBackgroundDrawable(materialCardViewHelper.insetDrawable(materialShapeDrawable));
        Drawable clickableForeground = materialCardViewHelper.shouldUseClickableForeground() ? materialCardViewHelper.getClickableForeground() : materialShapeDrawable2;
        materialCardViewHelper.fgDrawable = clickableForeground;
        materialCardView.setForeground(materialCardViewHelper.insetDrawable(clickableForeground));
        if (materialCardViewHelper.cardCornerRadius == -1.0f && (create = StateListShapeAppearanceModel.create(materialCardView.getContext(), obtainStyledAttributes, 8)) != null) {
            SpringForce resolveThemeSpringForce = MotionUtils.resolveThemeSpringForce(materialCardView.getContext(), com.squareup.cash.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
            materialShapeDrawable.setCornerSpringForce(resolveThemeSpringForce);
            materialShapeDrawable2.setCornerSpringForce(resolveThemeSpringForce);
            MaterialShapeDrawable materialShapeDrawable3 = materialCardViewHelper.foregroundShapeDrawable;
            if (materialShapeDrawable3 != null) {
                materialShapeDrawable3.setCornerSpringForce(resolveThemeSpringForce);
            }
            materialCardViewHelper.setShapeAppearance(create);
        }
        obtainStyledAttributes.recycle();
    }

    public final void forceRippleRedrawIfNeeded() {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        RippleDrawable rippleDrawable = materialCardViewHelper.rippleDrawable;
        if (rippleDrawable != null) {
            Rect bounds = rippleDrawable.getBounds();
            int i = bounds.bottom;
            materialCardViewHelper.rippleDrawable.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
            materialCardViewHelper.rippleDrawable.setBounds(bounds.left, bounds.top, bounds.right, i);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.checked;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.updateClickable();
        RetryKt.setParentAbsoluteElevation(this, materialCardViewHelper.bgDrawable);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper != null && materialCardViewHelper.checkable) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (this.checked) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        if (this.dragged) {
            View.mergeDrawableStates(onCreateDrawableState, DRAGGED_STATE_SET);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(onCreateDrawableState, HOVERED_STATE_SET);
            }
            if (isEnabled()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.ENABLED_STATE_SET);
            }
            if (isFocused()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.FOCUSED_STATE_SET);
            }
            if (isSelected()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.SELECTED_STATE_SET);
            }
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.checked);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        accessibilityNodeInfo.setCheckable(materialCardViewHelper != null && materialCardViewHelper.checkable);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.checked);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.cardViewHelper.recalculateCheckedIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public final void setAncestorContentPadding(int i, int i2, int i3, int i4) {
        super.setContentPadding(i, i2, i3, i4);
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.isParentCardViewDoneInitializing) {
            MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
            if (!materialCardViewHelper.isBackgroundOverwritten) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                materialCardViewHelper.isBackgroundOverwritten = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public final void setBackgroundInternal(MaterialCardViewHelper.AnonymousClass1 anonymousClass1) {
        super.setBackgroundDrawable(anonymousClass1);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.cardViewHelper.bgDrawable.setFillColor(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.bgDrawable.setElevation(((CardView) materialCardViewHelper.materialCardView.mCardViewDelegate.this$0).getElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        MaterialShapeDrawable materialShapeDrawable = this.cardViewHelper.foregroundContentDrawable;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        materialShapeDrawable.setFillColor(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.cardViewHelper.checkable = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.checked != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.cardViewHelper.setCheckedIcon(drawable);
    }

    public void setCheckedIconGravity(int i) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper.checkedIconGravity != i) {
            materialCardViewHelper.checkedIconGravity = i;
            MaterialCardView materialCardView = materialCardViewHelper.materialCardView;
            materialCardViewHelper.recalculateCheckedIconPosition(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.cardViewHelper.checkedIconMargin = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.cardViewHelper.checkedIconMargin = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.cardViewHelper.setCheckedIcon(DimensionKt.getDrawable(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.cardViewHelper.checkedIconSize = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.cardViewHelper.checkedIconSize = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.checkedIconTint = colorStateList;
        Drawable drawable = materialCardViewHelper.checkedIcon;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper != null) {
            materialCardViewHelper.updateClickable();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setContentPadding(int i, int i2, int i3, int i4) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.userContentPadding.set(i, i2, i3, i4);
        materialCardViewHelper.updateContentPadding();
    }

    public void setDragged(boolean z) {
        if (this.dragged != z) {
            this.dragged = z;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.cardViewHelper.updateInsets();
    }

    public void setOnCheckedChangeListener(OnCheckedChangeListener onCheckedChangeListener) {
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.updateInsets();
        materialCardViewHelper.updateContentPadding();
    }

    public void setProgress(float f) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.bgDrawable.setInterpolation(f);
        MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.foregroundContentDrawable;
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setInterpolation(f);
        }
        MaterialShapeDrawable materialShapeDrawable2 = materialCardViewHelper.foregroundShapeDrawable;
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setInterpolation(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.cardCornerRadius = f;
        materialCardViewHelper.setShapeAppearance(materialCardViewHelper.shapeAppearanceModel.getDefaultShape().withCornerSize(f));
        materialCardViewHelper.fgDrawable.invalidateSelf();
        if (materialCardViewHelper.shouldAddCornerPaddingOutsideCardBackground() || (materialCardViewHelper.materialCardView.mPreventCornerOverlap && !materialCardViewHelper.bgDrawable.isRoundRect())) {
            materialCardViewHelper.updateContentPadding();
        }
        if (materialCardViewHelper.shouldAddCornerPaddingOutsideCardBackground()) {
            materialCardViewHelper.updateInsets();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.rippleColor = colorStateList;
        RippleDrawable rippleDrawable = materialCardViewHelper.rippleDrawable;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList colorStateList = Strings.getColorStateList(getContext(), i);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.rippleColor = colorStateList;
        RippleDrawable rippleDrawable = materialCardViewHelper.rippleDrawable;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        RectF rectF = new RectF();
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        rectF.set(materialCardViewHelper.bgDrawable.getBounds());
        setClipToOutline(shapeAppearanceModel.isRoundRect(rectF));
        materialCardViewHelper.setShapeAppearance(shapeAppearanceModel);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper.strokeColor != colorStateList) {
            materialCardViewHelper.strokeColor = colorStateList;
            MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.foregroundContentDrawable;
            materialShapeDrawable.drawableState.strokeWidth = materialCardViewHelper.strokeWidth;
            materialShapeDrawable.invalidateSelf();
            materialShapeDrawable.setStrokeColor(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (i != materialCardViewHelper.strokeWidth) {
            materialCardViewHelper.strokeWidth = i;
            MaterialShapeDrawable materialShapeDrawable = materialCardViewHelper.foregroundContentDrawable;
            ColorStateList colorStateList = materialCardViewHelper.strokeColor;
            materialShapeDrawable.drawableState.strokeWidth = i;
            materialShapeDrawable.invalidateSelf();
            materialShapeDrawable.setStrokeColor(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        materialCardViewHelper.updateInsets();
        materialCardViewHelper.updateContentPadding();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        MaterialCardViewHelper materialCardViewHelper = this.cardViewHelper;
        if (materialCardViewHelper != null && materialCardViewHelper.checkable && isEnabled()) {
            this.checked = !this.checked;
            refreshDrawableState();
            forceRippleRedrawIfNeeded();
            materialCardViewHelper.setChecked(this.checked, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.cardViewHelper.bgDrawable.setFillColor(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
