package com.google.android.material.button;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatBackgroundHelper;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.TintInfo;
import androidx.camera.core.CameraSelector$$ExternalSyntheticOutline0;
import androidx.camera.video.Recorder$$ExternalSyntheticLambda14;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.customview.view.AbsSavedState;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.media3.ui.DefaultTimeBar$$ExternalSyntheticLambda1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.q4$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.google.android.material.R$styleable;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.motion.MotionUtils;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DeterminateDrawable;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearance;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;
import com.google.android.material.shape.StateListShapeAppearanceModel;
import com.google.android.material.shape.StateListSizeChange;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.google.mlkit.vision.text.internal.zzr;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.squareup.util.Strings;
import com.withpersona.sdk2.inquiry.shared.ContextUtilsKt;
import com.withpersona.sdk2.inquiry.shared.RetryKt;
import java.util.Iterator;
import java.util.LinkedHashSet;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public class MaterialButton extends AppCompatButton implements Checkable, Shapeable {
    public static final int[] CHECKABLE_STATE_SET = {R.attr.state_checkable};
    public static final int[] CHECKED_STATE_SET = {R.attr.state_checked};
    public static final AnonymousClass1 WIDTH_INCREASE = new AnonymousClass1(0);
    public String accessibilityClassName;
    public int allowedWidthDecrease;
    public boolean broadcasting;
    public boolean checked;
    public float displayedWidthDecrease;
    public float displayedWidthIncrease;
    public Drawable icon;
    public int iconGravity;
    public int iconLeft;
    public int iconPadding;
    public int iconSize;
    public ColorStateList iconTint;
    public PorterDuff.Mode iconTintMode;
    public int iconTop;
    public boolean isInHorizontalButtonGroup;
    public final MaterialButtonHelper materialButtonHelper;
    public final LinkedHashSet onCheckedChangeListeners;
    public zzr onPressedChangeListenerInternal;
    public boolean opticalCenterEnabled;
    public int opticalCenterShift;
    public int orientation;
    public LinearLayout.LayoutParams originalLayoutParams;
    public int originalPaddingEnd;
    public int originalPaddingStart;
    public float originalWidth;
    public Drawable secondaryIcon;
    public int secondaryIconGravity;
    public int secondaryIconLeft;
    public ColorStateList secondaryIconTint;
    public PorterDuff.Mode secondaryIconTintMode;
    public int secondaryIconTop;
    public StateListSizeChange sizeChange;
    public boolean stopNullSecondaryIconUpdate;
    public int widthChangeDirection;
    public int widthChangeMax;
    public SpringAnimation widthIncreaseSpringAnimation;

    public final class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new AbsSavedState.AnonymousClass2(11);
        public boolean checked;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            if (classLoader == null) {
                SavedState.class.getClassLoader();
            }
            this.checked = parcel.readInt() == 1;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.checked ? 1 : 0);
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(i, com.squareup.cash.R.style.Widget_MaterialComponents_Button, context, attributeSet, new int[]{com.squareup.cash.R.attr.materialSizeOverlay}), attributeSet, i);
        this.onCheckedChangeListeners = new LinkedHashSet();
        this.checked = false;
        this.broadcasting = false;
        this.orientation = PKIFailureInfo.systemUnavail;
        this.originalWidth = -2.1474836E9f;
        this.originalPaddingStart = PKIFailureInfo.systemUnavail;
        this.originalPaddingEnd = PKIFailureInfo.systemUnavail;
        this.allowedWidthDecrease = PKIFailureInfo.systemUnavail;
        this.widthChangeDirection = 4;
        Context context2 = getContext();
        TypedArray obtainStyledAttributes = ViewUtils.obtainStyledAttributes(context2, attributeSet, R$styleable.MaterialButton, i, com.squareup.cash.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.iconPadding = obtainStyledAttributes.getDimensionPixelSize(13, 0);
        int i2 = obtainStyledAttributes.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.iconTintMode = ViewUtils.parseTintMode(i2, mode);
        this.iconTint = ContextUtilsKt.getColorStateList(getContext(), obtainStyledAttributes, 15);
        this.icon = ContextUtilsKt.getDrawable(getContext(), obtainStyledAttributes, 11);
        this.iconGravity = obtainStyledAttributes.getInteger(12, 1);
        this.iconSize = obtainStyledAttributes.getDimensionPixelSize(14, 0);
        this.secondaryIconTintMode = ViewUtils.parseTintMode(obtainStyledAttributes.getInt(22, -1), mode);
        this.secondaryIconTint = obtainStyledAttributes.hasValue(21) ? ContextUtilsKt.getColorStateList(getContext(), obtainStyledAttributes, 21) : this.iconTint;
        this.secondaryIconGravity = obtainStyledAttributes.getInteger(20, 3);
        Drawable drawable = ContextUtilsKt.getDrawable(getContext(), obtainStyledAttributes, 19);
        this.secondaryIcon = drawable;
        this.stopNullSecondaryIconUpdate = drawable == null;
        ShapeAppearance create = StateListShapeAppearanceModel.create(context2, obtainStyledAttributes, 23);
        create = create == null ? ShapeAppearanceModel.builder(context2, attributeSet, i, com.squareup.cash.R.style.Widget_MaterialComponents_Button).build() : create;
        boolean z = obtainStyledAttributes.getBoolean(17, false);
        MaterialButtonHelper materialButtonHelper = new MaterialButtonHelper(this, create);
        this.materialButtonHelper = materialButtonHelper;
        materialButtonHelper.insetLeft = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        materialButtonHelper.insetRight = obtainStyledAttributes.getDimensionPixelOffset(3, 0);
        materialButtonHelper.insetTop = obtainStyledAttributes.getDimensionPixelOffset(4, 0);
        materialButtonHelper.insetBottom = obtainStyledAttributes.getDimensionPixelOffset(5, 0);
        if (obtainStyledAttributes.hasValue(9)) {
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(9, -1);
            materialButtonHelper.cornerRadius = dimensionPixelSize;
            materialButtonHelper.shapeAppearance = materialButtonHelper.shapeAppearance.withCornerSize(dimensionPixelSize);
            materialButtonHelper.updateButtonShape();
            materialButtonHelper.cornerRadiusSet = true;
        }
        materialButtonHelper.strokeWidth = obtainStyledAttributes.getDimensionPixelSize(26, 0);
        materialButtonHelper.backgroundTintMode = ViewUtils.parseTintMode(obtainStyledAttributes.getInt(8, -1), mode);
        materialButtonHelper.backgroundTint = ContextUtilsKt.getColorStateList(getContext(), obtainStyledAttributes, 7);
        materialButtonHelper.strokeColor = ContextUtilsKt.getColorStateList(getContext(), obtainStyledAttributes, 25);
        materialButtonHelper.rippleColor = ContextUtilsKt.getColorStateList(getContext(), obtainStyledAttributes, 18);
        materialButtonHelper.checkable = obtainStyledAttributes.getBoolean(6, false);
        materialButtonHelper.elevation = obtainStyledAttributes.getDimensionPixelSize(10, 0);
        materialButtonHelper.toggleCheckedStateOnClick = obtainStyledAttributes.getBoolean(27, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (obtainStyledAttributes.hasValue(0)) {
            materialButtonHelper.backgroundOverwritten = true;
            setSupportBackgroundTintList(materialButtonHelper.backgroundTint);
            setSupportBackgroundTintMode(materialButtonHelper.backgroundTintMode);
        } else {
            materialButtonHelper.updateBackground();
        }
        setPaddingRelative(paddingStart + materialButtonHelper.insetLeft, paddingTop + materialButtonHelper.insetTop, paddingEnd + materialButtonHelper.insetRight, paddingBottom + materialButtonHelper.insetBottom);
        setCheckedInternal(obtainStyledAttributes.getBoolean(1, false));
        if (create instanceof StateListShapeAppearanceModel) {
            materialButtonHelper.cornerSpringForce = MotionUtils.resolveThemeSpringForce(getContext(), com.squareup.cash.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (materialButtonHelper.shapeAppearance instanceof StateListShapeAppearanceModel) {
                materialButtonHelper.updateButtonShape();
            }
        }
        setOpticalCenterEnabled(z);
        obtainStyledAttributes.recycle();
        setCompoundDrawablePadding(this.iconPadding);
        updateIcon(this.icon != null);
        updateSecondaryIcon(this.secondaryIcon != null);
    }

    public final boolean areIconsGravitySameAlignment() {
        if (isIconStart() && isSecondaryIconStart()) {
            return true;
        }
        if (isIconEnd() && isSecondaryIconEnd()) {
            return true;
        }
        return isIconTop() && isSecondaryIconTop();
    }

    public final boolean canUpdateWithoutTextAlignment(int i) {
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        return i == 1 || i == 3 || (i == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE);
    }

    public final Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        if (textAlignment != 1) {
            return (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
        }
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    @Override // android.view.View
    public final ColorStateList getBackgroundTintList() {
        TintInfo tintInfo;
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.backgroundTint;
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper == null || (tintInfo = appCompatBackgroundHelper.mBackgroundTint) == null) {
            return null;
        }
        return (ColorStateList) tintInfo.mTintList;
    }

    @Override // android.view.View
    public final PorterDuff.Mode getBackgroundTintMode() {
        TintInfo tintInfo;
        if (isUsingOriginalBackground()) {
            return this.materialButtonHelper.backgroundTintMode;
        }
        AppCompatBackgroundHelper appCompatBackgroundHelper = this.mBackgroundTintHelper;
        if (appCompatBackgroundHelper == null || (tintInfo = appCompatBackgroundHelper.mBackgroundTint) == null) {
            return null;
        }
        return (PorterDuff.Mode) tintInfo.mTintMode;
    }

    public final int getIconLeft(int i, int i2) {
        int i3;
        int i4;
        Drawable drawable = this.icon;
        if (drawable != null) {
            i3 = this.iconSize;
            if (i3 == 0) {
                i3 = drawable.getIntrinsicWidth();
            }
        } else {
            i3 = 0;
        }
        Drawable drawable2 = this.secondaryIcon;
        if (drawable2 != null) {
            i4 = this.iconSize;
            if (i4 == 0) {
                i4 = drawable2.getIntrinsicWidth();
            }
        } else {
            i4 = 0;
        }
        int textLayoutWidth = (((((i - getTextLayoutWidth()) - getPaddingEnd()) - i3) - i4) - this.iconPadding) - getPaddingStart();
        if (getActualTextAlignment() == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        return (getLayoutDirection() == 1) != (i2 == 4) ? -textLayoutWidth : textLayoutWidth;
    }

    public final int getIconTop(int i, int i2) {
        int min;
        if (getLineCount() > 1) {
            min = getLayout().getHeight();
        } else {
            TextPaint paint = getPaint();
            String charSequence = getText().toString();
            if (getTransformationMethod() != null) {
                charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
            }
            Rect rect = new Rect();
            paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
            min = Math.min(rect.height(), getLayout().getHeight());
        }
        return Math.max(0, (((((i - min) - getPaddingTop()) - i2) - this.iconPadding) - getPaddingBottom()) / 2);
    }

    public final int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f = RecyclerView.DECELERATION_RATE;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    public final Drawable getUpdatedIconFor(int i) {
        if (i == 0) {
            if (this.secondaryIcon == null || !isSecondaryIconStart()) {
                return null;
            }
            return this.secondaryIcon;
        }
        if (i == 1) {
            if (this.secondaryIcon == null || !isSecondaryIconTop()) {
                return null;
            }
            return this.secondaryIcon;
        }
        if (i == 2 && this.secondaryIcon != null && isSecondaryIconEnd()) {
            return this.secondaryIcon;
        }
        return null;
    }

    public final Drawable getUpdatedSecondaryIconFor(int i) {
        if (i == 0) {
            if (this.icon == null || !isIconStart()) {
                return null;
            }
            return this.icon;
        }
        if (i == 1) {
            if (this.icon == null || !isIconEnd()) {
                return null;
            }
            return this.icon;
        }
        if (i == 2 && this.icon != null && isIconEnd()) {
            return this.icon;
        }
        return null;
    }

    public final boolean isCheckable() {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        return materialButtonHelper != null && materialButtonHelper.checkable;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.checked;
    }

    public final boolean isIconEnd() {
        int i = this.iconGravity;
        return i == 3 || i == 4;
    }

    public final boolean isIconStart() {
        int i = this.iconGravity;
        return i == 1 || i == 2;
    }

    public final boolean isIconTop() {
        int i = this.iconGravity;
        return i == 16 || i == 32;
    }

    public final boolean isSecondaryIconEnd() {
        int i = this.secondaryIconGravity;
        return i == 3 || i == 4;
    }

    public final boolean isSecondaryIconStart() {
        int i = this.secondaryIconGravity;
        return i == 1 || i == 2;
    }

    public final boolean isSecondaryIconTop() {
        int i = this.secondaryIconGravity;
        return i == 16 || i == 32;
    }

    public final boolean isUsingOriginalBackground() {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        return (materialButtonHelper == null || materialButtonHelper.backgroundOverwritten) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x008b, code lost:
    
        if (r4 == 2) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void maybeAnimateSize(boolean z) {
        int i;
        if (this.sizeChange == null) {
            return;
        }
        if (this.widthIncreaseSpringAnimation == null) {
            SpringAnimation springAnimation = new SpringAnimation(this, WIDTH_INCREASE);
            this.widthIncreaseSpringAnimation = springAnimation;
            springAnimation.mSpring = MotionUtils.resolveThemeSpringForce(getContext(), com.squareup.cash.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
        }
        if (this.isInHorizontalButtonGroup) {
            int ordinal = CameraSelector$$ExternalSyntheticOutline0.ordinal(this.widthChangeDirection);
            int i2 = 0;
            int i3 = (ordinal == 1 || ordinal == 2) ? this.widthChangeMax / 2 : ordinal != 3 ? 0 : this.widthChangeMax;
            StateListSizeChange stateListSizeChange = this.sizeChange;
            int[] drawableState = getDrawableState();
            int[][] iArr = stateListSizeChange.stateSpecs;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= stateListSizeChange.stateCount) {
                    i4 = -1;
                    break;
                } else if (StateSet.stateSetMatches(iArr[i4], drawableState)) {
                    break;
                } else {
                    i4++;
                }
            }
            if (i4 < 0) {
                int[] iArr2 = StateSet.WILD_CARD;
                int[][] iArr3 = stateListSizeChange.stateSpecs;
                int i5 = 0;
                while (true) {
                    if (i5 >= stateListSizeChange.stateCount) {
                        break;
                    }
                    if (StateSet.stateSetMatches(iArr3[i5], iArr2)) {
                        i = i5;
                        break;
                    }
                    i5++;
                }
                i4 = i;
            }
            StateListSizeChange.SizeChangeAmount sizeChangeAmount = (StateListSizeChange.SizeChangeAmount) (i4 < 0 ? stateListSizeChange.defaultSizeChange : stateListSizeChange.sizeChanges[i4]).zza;
            int width = getWidth();
            float f = sizeChangeAmount.amount;
            int i6 = sizeChangeAmount.f996type;
            if (i6 == 1) {
                f *= width;
            }
            i2 = (int) f;
            this.widthIncreaseSpringAnimation.animateToFinalPosition(Math.min(i3, i2));
            if (z) {
                this.widthIncreaseSpringAnimation.skipToEnd();
            }
        }
    }

    public final boolean maybeRunAfterWidthAnimation(Runnable runnable) {
        SpringAnimation springAnimation = this.widthIncreaseSpringAnimation;
        if (springAnimation == null || !springAnimation.mRunning) {
            return false;
        }
        post(new q4$$ExternalSyntheticLambda0(26, this, runnable));
        return true;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isUsingOriginalBackground()) {
            RetryKt.setParentAbsoluteElevation(this, this.materialButtonHelper.getMaterialShapeDrawable(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isCheckable()) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKABLE_STATE_SET);
        }
        if (this.checked) {
            View.mergeDrawableStates(onCreateDrawableState, CHECKED_STATE_SET);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        String name;
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (TextUtils.isEmpty(this.accessibilityClassName)) {
            name = (isCheckable() ? CompoundButton.class : Button.class).getName();
        } else {
            name = this.accessibilityClassName;
        }
        accessibilityEvent.setClassName(name);
        accessibilityEvent.setChecked(this.checked);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String name;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        if (TextUtils.isEmpty(this.accessibilityClassName)) {
            name = (isCheckable() ? CompoundButton.class : Button.class).getName();
        } else {
            name = this.accessibilityClassName;
        }
        accessibilityNodeInfo.setClassName(name);
        accessibilityNodeInfo.setCheckable(isCheckable());
        accessibilityNodeInfo.setChecked(this.checked);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.orientation != i6) {
            this.orientation = i6;
            this.originalWidth = -2.1474836E9f;
        }
        if (this.originalWidth == -2.1474836E9f) {
            this.originalWidth = getMeasuredWidth();
            if (this.originalLayoutParams == null && (getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).buttonSizeChange != null) {
                this.originalLayoutParams = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.originalLayoutParams);
                layoutParams.width = (int) this.originalWidth;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.allowedWidthDecrease == Integer.MIN_VALUE) {
            Drawable drawable = this.icon;
            if (drawable == null) {
                i5 = 0;
            } else {
                int i7 = this.iconPadding;
                int i8 = this.iconSize;
                if (i8 == 0) {
                    i8 = drawable.getIntrinsicWidth();
                }
                i5 = i7 + i8;
            }
            this.allowedWidthDecrease = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.originalPaddingStart == Integer.MIN_VALUE) {
            this.originalPaddingStart = getPaddingStart();
        }
        if (this.originalPaddingEnd == Integer.MIN_VALUE) {
            this.originalPaddingEnd = getPaddingEnd();
        }
        if ((getParent() instanceof MaterialButtonGroup) && ((MaterialButtonGroup) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.isInHorizontalButtonGroup = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mSuperState);
        setChecked(savedState.checked);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.checked = this.checked;
        return savedState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        boolean z;
        if (isEnabled() && this.materialButtonHelper.toggleCheckedStateOnClick) {
            toggle();
            z = true;
        } else {
            z = false;
        }
        boolean performClick = super.performClick();
        if (z && !performClick) {
            playSoundEffect(0);
        }
        return performClick;
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.icon != null) {
            if (this.icon.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.accessibilityClassName = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!isUsingOriginalBackground()) {
            super.setBackgroundColor(i);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        if (materialButtonHelper.getMaterialShapeDrawable(false) != null) {
            materialButtonHelper.getMaterialShapeDrawable(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!isUsingOriginalBackground()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        materialButtonHelper.backgroundOverwritten = true;
        MaterialButton materialButton = materialButtonHelper.materialButton;
        materialButton.setSupportBackgroundTintList(materialButtonHelper.backgroundTint);
        materialButton.setSupportBackgroundTintMode(materialButtonHelper.backgroundTintMode);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? DimensionKt.getDrawable(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z) {
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.checkable = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public final void setCheckedInternal(boolean z) {
        if (!isCheckable() || this.checked == z) {
            return;
        }
        this.checked = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.checked;
            if (!materialButtonToggleGroup.skipCheckedStateTracker) {
                materialButtonToggleGroup.checkInternal(getId(), z2);
            }
        }
        if (this.broadcasting) {
            return;
        }
        this.broadcasting = true;
        Iterator it = this.onCheckedChangeListeners.iterator();
        if (it.hasNext()) {
            throw Recorder$$ExternalSyntheticOutline2.m(it);
        }
        this.broadcasting = false;
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablePadding(int i) {
        if (getCompoundDrawablePadding() != i) {
            this.originalWidth = -2.1474836E9f;
        }
        super.setCompoundDrawablePadding(i);
    }

    public void setCornerRadius(int i) {
        if (isUsingOriginalBackground()) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            if (materialButtonHelper.cornerRadiusSet && materialButtonHelper.cornerRadius == i) {
                return;
            }
            materialButtonHelper.cornerRadius = i;
            materialButtonHelper.cornerRadiusSet = true;
            materialButtonHelper.shapeAppearance = materialButtonHelper.shapeAppearance.withCornerSize(i);
            materialButtonHelper.updateButtonShape();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (isUsingOriginalBackground()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(SpringForce springForce) {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        materialButtonHelper.cornerSpringForce = springForce;
        if (materialButtonHelper.shapeAppearance instanceof StateListShapeAppearanceModel) {
            materialButtonHelper.updateButtonShape();
        }
    }

    public final void setDisplayedWidthDecrease(int i) {
        this.displayedWidthDecrease = Math.min(i, this.allowedWidthDecrease);
        updatePaddingsAndSizeForWidthAnimation();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (isUsingOriginalBackground()) {
            this.materialButtonHelper.getMaterialShapeDrawable(false).setElevation(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.icon == drawable || maybeRunAfterWidthAnimation(new MaterialButton$$ExternalSyntheticLambda0(this, drawable, 1))) {
            return;
        }
        this.originalWidth = -2.1474836E9f;
        this.icon = drawable;
        updateIcon(true);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setIconGravity(int i) {
        if (this.iconGravity != i) {
            if (this.icon != null && this.secondaryIcon != null && areIconsGravitySameAlignment()) {
                a$$ExternalSyntheticBUOutline0.m$3("iconGravity cannot have the same alignment as secondaryIconGravity");
            } else {
                this.iconGravity = i;
                updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setIconPadding(int i) {
        if (this.iconPadding != i) {
            this.iconPadding = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? DimensionKt.getDrawable(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$3("iconSize cannot be less than 0");
            return;
        }
        if (this.iconSize == i || maybeRunAfterWidthAnimation(new Recorder$$ExternalSyntheticLambda14(this, i, 10))) {
            return;
        }
        this.originalWidth = -2.1474836E9f;
        this.iconSize = i;
        updateIcon(true);
        updateSecondaryIcon(true);
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.iconTint != colorStateList) {
            this.iconTint = colorStateList;
            updateIcon(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.iconTintMode != mode) {
            this.iconTintMode = mode;
            updateIcon(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(Strings.getColorStateList(getContext(), i));
    }

    public void setInsetBottom(int i) {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        materialButtonHelper.setInsets(materialButtonHelper.insetLeft, materialButtonHelper.insetTop, materialButtonHelper.insetRight, i);
    }

    public void setInsetLeft(int i) {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        materialButtonHelper.setInsets(i, materialButtonHelper.insetTop, materialButtonHelper.insetRight, materialButtonHelper.insetBottom);
    }

    public void setInsetRight(int i) {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        materialButtonHelper.setInsets(materialButtonHelper.insetLeft, materialButtonHelper.insetTop, i, materialButtonHelper.insetBottom);
    }

    public void setInsetTop(int i) {
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        materialButtonHelper.setInsets(materialButtonHelper.insetLeft, i, materialButtonHelper.insetRight, materialButtonHelper.insetBottom);
    }

    public final void setInternalBackground(RippleDrawable rippleDrawable) {
        super.setBackgroundDrawable(rippleDrawable);
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.opticalCenterEnabled != z) {
            this.opticalCenterEnabled = z;
            int i = 0;
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            if (z) {
                MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3 = new MaterialButton$$ExternalSyntheticLambda3(this, i);
                materialButtonHelper.onCornerSizeChangeListener = materialButton$$ExternalSyntheticLambda3;
                MaterialShapeDrawable materialShapeDrawable = materialButtonHelper.getMaterialShapeDrawable(false);
                if (materialShapeDrawable != null) {
                    materialShapeDrawable.onCornerSizeChangeListener = materialButton$$ExternalSyntheticLambda3;
                }
            } else {
                materialButtonHelper.onCornerSizeChangeListener = null;
                MaterialShapeDrawable materialShapeDrawable2 = materialButtonHelper.getMaterialShapeDrawable(false);
                if (materialShapeDrawable2 != null) {
                    materialShapeDrawable2.onCornerSizeChangeListener = null;
                }
            }
            post(new KnotView$$ExternalSyntheticLambda1(this, 2));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        zzr zzrVar = this.onPressedChangeListenerInternal;
        if (zzrVar != null) {
            ((MaterialButtonGroup) zzrVar.zza).invalidate();
        }
        super.setPressed(z);
        maybeAnimateSize(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            MaterialButton materialButton = materialButtonHelper.materialButton;
            if (materialButtonHelper.rippleColor != colorStateList) {
                materialButtonHelper.rippleColor = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(RippleUtils.sanitizeRippleDrawableColor(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (isUsingOriginalBackground()) {
            setRippleColor(Strings.getColorStateList(getContext(), i));
        }
    }

    public void setSecondaryIcon(Drawable drawable) {
        if (this.secondaryIcon == drawable || maybeRunAfterWidthAnimation(new MaterialButton$$ExternalSyntheticLambda0(this, drawable, 0))) {
            return;
        }
        this.originalWidth = -2.1474836E9f;
        this.secondaryIcon = drawable;
        this.stopNullSecondaryIconUpdate = false;
        updateSecondaryIcon(true);
        updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setSecondaryIconGravity(int i) {
        if (this.secondaryIconGravity != i) {
            if (this.secondaryIcon != null && this.icon != null && areIconsGravitySameAlignment()) {
                a$$ExternalSyntheticBUOutline0.m$3("secondaryIconGravity cannot have the same alignment as iconGravity");
            } else {
                this.secondaryIconGravity = i;
                updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void setSecondaryIconResource(int i) {
        setSecondaryIcon(i != 0 ? DimensionKt.getDrawable(getContext(), i) : null);
    }

    public void setSecondaryIconTint(ColorStateList colorStateList) {
        if (this.secondaryIconTint != colorStateList) {
            this.secondaryIconTint = colorStateList;
            updateSecondaryIcon(false);
        }
    }

    public void setSecondaryIconTintMode(PorterDuff.Mode mode) {
        if (this.secondaryIconTintMode != mode) {
            this.secondaryIconTintMode = mode;
            updateSecondaryIcon(false);
        }
    }

    public void setSecondaryIconTintResource(int i) {
        setSecondaryIconTint(Strings.getColorStateList(getContext(), i));
    }

    public void setShapeAppearance(ShapeAppearance shapeAppearance) {
        if (!isUsingOriginalBackground()) {
            a$$ExternalSyntheticBUOutline0.m$1("Attempted to set ShapeAppearance on a MaterialButton which has an overwritten background.");
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        if (materialButtonHelper.cornerSpringForce == null && shapeAppearance.isStateful()) {
            materialButtonHelper.cornerSpringForce = MotionUtils.resolveThemeSpringForce(getContext(), com.squareup.cash.R.style.Motion_Material3_Spring_Standard_Fast_Spatial);
            if (materialButtonHelper.shapeAppearance instanceof StateListShapeAppearanceModel) {
                materialButtonHelper.updateButtonShape();
            }
        }
        materialButtonHelper.shapeAppearance = shapeAppearance;
        materialButtonHelper.updateButtonShape();
    }

    @Override // com.google.android.material.shape.Shapeable
    public void setShapeAppearanceModel(ShapeAppearanceModel shapeAppearanceModel) {
        if (!isUsingOriginalBackground()) {
            a$$ExternalSyntheticBUOutline0.m$1("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        materialButtonHelper.shapeAppearance = shapeAppearanceModel;
        materialButtonHelper.updateButtonShape();
    }

    public final void setShouldDrawSurfaceColorStroke(boolean z) {
        if (isUsingOriginalBackground()) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            materialButtonHelper.shouldDrawSurfaceColorStroke = z;
            materialButtonHelper.updateStroke();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (isUsingOriginalBackground()) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            if (materialButtonHelper.strokeColor != colorStateList) {
                materialButtonHelper.strokeColor = colorStateList;
                materialButtonHelper.updateStroke();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (isUsingOriginalBackground()) {
            setStrokeColor(Strings.getColorStateList(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (isUsingOriginalBackground()) {
            MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
            if (materialButtonHelper.strokeWidth != i) {
                materialButtonHelper.strokeWidth = i;
                materialButtonHelper.updateStroke();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (isUsingOriginalBackground()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!isUsingOriginalBackground()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        if (materialButtonHelper.backgroundTint != colorStateList) {
            materialButtonHelper.backgroundTint = colorStateList;
            if (materialButtonHelper.getMaterialShapeDrawable(false) != null) {
                materialButtonHelper.getMaterialShapeDrawable(false).setTintList(materialButtonHelper.backgroundTint);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!isUsingOriginalBackground()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        MaterialButtonHelper materialButtonHelper = this.materialButtonHelper;
        if (materialButtonHelper.backgroundTintMode != mode) {
            materialButtonHelper.backgroundTintMode = mode;
            if (materialButtonHelper.getMaterialShapeDrawable(false) == null || materialButtonHelper.backgroundTintMode == null) {
                return;
            }
            materialButtonHelper.getMaterialShapeDrawable(false).setTintMode(materialButtonHelper.backgroundTintMode);
        }
    }

    @Override // android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        this.originalWidth = -2.1474836E9f;
        super.setText(charSequence, bufferType);
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        updateIconPosition(getMeasuredWidth(), getMeasuredHeight());
        updateSecondaryIconPosition(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        this.originalWidth = -2.1474836E9f;
        super.setTextAppearance(context, i);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public void setTextSize(int i, float f) {
        this.originalWidth = -2.1474836E9f;
        super.setTextSize(i, f);
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.materialButtonHelper.toggleCheckedStateOnClick = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.originalWidth = -2.1474836E9f;
        super.setWidth(i);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.checked);
    }

    public final void updateIcon(boolean z) {
        Drawable drawable = this.icon;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.icon = mutate;
            mutate.setTintList(this.iconTint);
            PorterDuff.Mode mode = this.iconTintMode;
            if (mode != null) {
                this.icon.setTintMode(mode);
            }
            int i = this.iconSize;
            if (i == 0) {
                i = this.icon.getIntrinsicWidth();
            }
            int i2 = this.iconSize;
            if (i2 == 0) {
                i2 = this.icon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.icon;
            int i3 = this.iconLeft;
            int i4 = this.iconTop;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.icon.setVisible(true, z);
        }
        if (this.icon != null && this.secondaryIcon != null && areIconsGravitySameAlignment()) {
            a$$ExternalSyntheticBUOutline0.m$3("iconGravity cannot have the same alignment as secondaryIconGravity");
            return;
        }
        if (this.icon == null && this.secondaryIcon != null && areIconsGravitySameAlignment()) {
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (isIconStart() && compoundDrawablesRelative[0] != this.icon) || (isIconEnd() && compoundDrawablesRelative[2] != this.icon) || (isIconTop() && compoundDrawablesRelative[1] != this.icon);
        if (z || z2) {
            if (isIconStart()) {
                setCompoundDrawablesRelative(this.icon, getUpdatedIconFor(1), getUpdatedIconFor(2), null);
            } else if (isIconEnd()) {
                setCompoundDrawablesRelative(getUpdatedIconFor(0), getUpdatedIconFor(1), this.icon, null);
            } else if (isIconTop()) {
                setCompoundDrawablesRelative(getUpdatedIconFor(0), this.icon, getUpdatedIconFor(2), null);
            }
        }
    }

    public final void updateIconPosition(int i, int i2) {
        if (this.icon == null || getLayout() == null) {
            return;
        }
        if (isIconStart() || isIconEnd()) {
            this.iconTop = 0;
            if (canUpdateWithoutTextAlignment(this.iconGravity)) {
                this.iconLeft = 0;
                updateIcon(false);
                return;
            }
            int iconLeft = getIconLeft(i, this.iconGravity);
            if (this.iconLeft != iconLeft) {
                this.iconLeft = iconLeft;
                updateIcon(false);
                return;
            }
            return;
        }
        if (isIconTop()) {
            this.iconLeft = 0;
            if (this.iconGravity == 16) {
                this.iconTop = 0;
                updateIcon(false);
                return;
            }
            int i3 = this.iconSize;
            if (i3 == 0) {
                i3 = this.icon.getIntrinsicHeight();
            }
            int iconTop = getIconTop(i2, i3);
            if (this.iconTop != iconTop) {
                this.iconTop = iconTop;
                updateIcon(false);
            }
        }
    }

    public final void updatePaddingsAndSizeForWidthAnimation() {
        int i = (int) (this.displayedWidthIncrease - this.displayedWidthDecrease);
        boolean z = getLayoutDirection() == 1;
        int i2 = this.opticalCenterShift;
        if (z) {
            i2 = -i2;
        }
        int i3 = (i / 2) + i2;
        if (getLayoutParams() != null) {
            getLayoutParams().width = (int) (this.originalWidth + i);
        }
        setPaddingRelative(this.originalPaddingStart + i3, getPaddingTop(), (this.originalPaddingEnd + i) - i3, getPaddingBottom());
    }

    public final void updateSecondaryIcon(boolean z) {
        Drawable drawable = this.secondaryIcon;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.secondaryIcon = mutate;
            mutate.setTintList(this.secondaryIconTint);
            PorterDuff.Mode mode = this.secondaryIconTintMode;
            if (mode != null) {
                this.secondaryIcon.setTintMode(mode);
            }
            int i = this.iconSize;
            if (i == 0) {
                i = this.secondaryIcon.getIntrinsicWidth();
            }
            int i2 = this.iconSize;
            if (i2 == 0) {
                i2 = this.secondaryIcon.getIntrinsicHeight();
            }
            Drawable drawable2 = this.secondaryIcon;
            int i3 = this.secondaryIconLeft;
            int i4 = this.secondaryIconTop;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.secondaryIcon.setVisible(true, z);
        }
        if (this.secondaryIcon != null && this.icon != null && areIconsGravitySameAlignment()) {
            a$$ExternalSyntheticBUOutline0.m$3("secondaryIconGravity cannot have the same alignment as iconGravity");
            return;
        }
        if (this.secondaryIcon == null) {
            if (this.stopNullSecondaryIconUpdate) {
                return;
            }
            if (this.icon != null && areIconsGravitySameAlignment()) {
                return;
            }
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        boolean z2 = (isSecondaryIconStart() && compoundDrawablesRelative[0] != this.secondaryIcon) || (isSecondaryIconEnd() && compoundDrawablesRelative[2] != this.secondaryIcon) || (isSecondaryIconTop() && compoundDrawablesRelative[1] != this.secondaryIcon);
        if (z || z2) {
            if (isSecondaryIconStart()) {
                setCompoundDrawablesRelative(this.secondaryIcon, getUpdatedSecondaryIconFor(1), getUpdatedSecondaryIconFor(2), null);
            } else if (isSecondaryIconEnd()) {
                setCompoundDrawablesRelative(getUpdatedSecondaryIconFor(0), getUpdatedSecondaryIconFor(1), this.secondaryIcon, null);
            } else if (isSecondaryIconTop()) {
                setCompoundDrawablesRelative(getUpdatedSecondaryIconFor(0), this.secondaryIcon, getUpdatedSecondaryIconFor(2), null);
            }
        }
    }

    public final void updateSecondaryIconPosition(int i, int i2) {
        if (this.secondaryIcon == null || getLayout() == null) {
            return;
        }
        if (isSecondaryIconStart() || isSecondaryIconEnd()) {
            this.secondaryIconTop = 0;
            if (canUpdateWithoutTextAlignment(this.secondaryIconGravity)) {
                this.secondaryIconLeft = 0;
                updateSecondaryIcon(false);
                return;
            }
            int iconLeft = getIconLeft(i, this.secondaryIconGravity);
            if (this.secondaryIconLeft != iconLeft) {
                this.secondaryIconLeft = iconLeft;
                updateSecondaryIcon(false);
                return;
            }
            return;
        }
        if (isSecondaryIconTop()) {
            this.secondaryIconLeft = 0;
            if (this.secondaryIconGravity == 16) {
                this.secondaryIconTop = 0;
                updateSecondaryIcon(false);
                return;
            }
            int i3 = this.iconSize;
            if (i3 == 0) {
                i3 = this.secondaryIcon.getIntrinsicHeight();
            }
            int iconTop = getIconTop(i2, i3);
            if (this.secondaryIconTop != iconTop) {
                this.secondaryIconTop = iconTop;
                updateSecondaryIcon(false);
            }
        }
    }

    /* renamed from: com.google.android.material.button.MaterialButton$1, reason: invalid class name */
    public final class AnonymousClass1 extends PlatformKt {
        public final /* synthetic */ int $r8$classId;

        public AnonymousClass1(zzr zzrVar) {
            this.$r8$classId = 2;
        }

        @Override // app.cash.molecule.PlatformKt
        public final float getValue(Object obj) {
            switch (this.$r8$classId) {
                case 0:
                    return ((MaterialButton) obj).displayedWidthIncrease;
                case 1:
                    return ((DeterminateDrawable) obj).activeIndicator.endFraction * 10000.0f;
                default:
                    return ((View) obj).getWidth();
            }
        }

        @Override // app.cash.molecule.PlatformKt
        public final void setValue(Object obj, float f) {
            switch (this.$r8$classId) {
                case 0:
                    MaterialButton materialButton = (MaterialButton) obj;
                    if (materialButton.displayedWidthIncrease != f) {
                        materialButton.displayedWidthIncrease = f;
                        materialButton.updatePaddingsAndSizeForWidthAnimation();
                        materialButton.invalidate();
                        if (materialButton.getParent() instanceof MaterialButtonGroup) {
                            MaterialButtonGroup materialButtonGroup = (MaterialButtonGroup) materialButton.getParent();
                            int i = (int) materialButton.displayedWidthIncrease;
                            int indexOfChild = materialButtonGroup.indexOfChild(materialButton);
                            if (indexOfChild >= 0) {
                                MaterialButton prevVisibleChildButton = materialButtonGroup.getPrevVisibleChildButton(indexOfChild);
                                MaterialButton nextVisibleChildButton = materialButtonGroup.getNextVisibleChildButton(indexOfChild);
                                if (prevVisibleChildButton != null || nextVisibleChildButton != null) {
                                    if (prevVisibleChildButton == null) {
                                        nextVisibleChildButton.setDisplayedWidthDecrease(i);
                                    }
                                    if (nextVisibleChildButton == null) {
                                        prevVisibleChildButton.setDisplayedWidthDecrease(i);
                                    }
                                    if (prevVisibleChildButton != null && nextVisibleChildButton != null) {
                                        prevVisibleChildButton.setDisplayedWidthDecrease(i / 2);
                                        nextVisibleChildButton.setDisplayedWidthDecrease((i + 1) / 2);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 1:
                    DeterminateDrawable determinateDrawable = (DeterminateDrawable) obj;
                    determinateDrawable.activeIndicator.endFraction = f / 10000.0f;
                    determinateDrawable.invalidateSelf();
                    int i2 = (int) f;
                    BaseProgressIndicatorSpec baseProgressIndicatorSpec = determinateDrawable.baseSpec;
                    if (baseProgressIndicatorSpec.hasWavyEffect(true)) {
                        Context context = determinateDrawable.context;
                        if (determinateDrawable.amplitudeAnimator == null) {
                            LinearInterpolator linearInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
                            determinateDrawable.amplitudeOnInterpolator = MotionUtils.resolveThemeInterpolator(context, com.squareup.cash.R.attr.motionEasingStandardInterpolator, linearInterpolator);
                            determinateDrawable.amplitudeOffInterpolator = MotionUtils.resolveThemeInterpolator(context, com.squareup.cash.R.attr.motionEasingEmphasizedAccelerateInterpolator, linearInterpolator);
                            ValueAnimator valueAnimator = new ValueAnimator();
                            determinateDrawable.amplitudeAnimator = valueAnimator;
                            valueAnimator.setDuration(500L);
                            determinateDrawable.amplitudeAnimator.setFloatValues(RecyclerView.DECELERATION_RATE, 1.0f);
                            determinateDrawable.amplitudeAnimator.setInterpolator(null);
                            determinateDrawable.amplitudeAnimator.addUpdateListener(new DefaultTimeBar$$ExternalSyntheticLambda1(determinateDrawable, 4));
                        }
                        float f2 = i2;
                        float f3 = (f2 < baseProgressIndicatorSpec.waveAmplitudeRampProgressMin * 10000.0f || f2 > baseProgressIndicatorSpec.waveAmplitudeRampProgressMax * 10000.0f) ? RecyclerView.DECELERATION_RATE : 1.0f;
                        float f4 = determinateDrawable.targetAmplitudeFraction;
                        ValueAnimator valueAnimator2 = determinateDrawable.amplitudeAnimator;
                        if (f3 == f4) {
                            if (!valueAnimator2.isRunning()) {
                                determinateDrawable.activeIndicator.amplitudeFraction = f3;
                                determinateDrawable.invalidateSelf();
                                break;
                            }
                        } else {
                            if (valueAnimator2.isRunning()) {
                                determinateDrawable.amplitudeAnimator.cancel();
                            }
                            determinateDrawable.targetAmplitudeFraction = f3;
                            if (f3 != 1.0f) {
                                determinateDrawable.amplitudeInterpolator = determinateDrawable.amplitudeOffInterpolator;
                                determinateDrawable.amplitudeAnimator.reverse();
                                break;
                            } else {
                                determinateDrawable.amplitudeInterpolator = determinateDrawable.amplitudeOnInterpolator;
                                determinateDrawable.amplitudeAnimator.start();
                                break;
                            }
                        }
                    }
                    break;
                default:
                    View view = (View) obj;
                    int i3 = (int) f;
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    layoutParams.width = i3;
                    view.setLayoutParams(layoutParams);
                    break;
            }
        }

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }
    }

    public MaterialButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, com.squareup.cash.R.attr.materialButtonStyle);
    }

    public MaterialButton(Context context) {
        this(context, null);
    }
}
