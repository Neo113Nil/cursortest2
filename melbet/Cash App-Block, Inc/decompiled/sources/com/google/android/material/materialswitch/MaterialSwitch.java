package com.google.android.material.materialswitch;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.graphics.ColorUtils;
import coil3.size.DimensionKt;
import com.google.android.material.R$styleable;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import com.squareup.cash.R;
import com.squareup.wire.GrpcMethod;
import com.withpersona.sdk2.inquiry.selfie.SelfieUtilsKt;

/* loaded from: classes4.dex */
public class MaterialSwitch extends SwitchCompat {
    public static final int[] STATE_SET_WITH_ICON = {R.attr.state_with_icon};
    public int[] currentStateChecked;
    public int[] currentStateUnchecked;
    public Drawable thumbDrawable;
    public Drawable thumbIconDrawable;
    public int thumbIconSize;
    public ColorStateList thumbIconTintList;
    public PorterDuff.Mode thumbIconTintMode;
    public ColorStateList thumbTintList;
    public Drawable trackDecorationDrawable;
    public ColorStateList trackDecorationTintList;
    public PorterDuff.Mode trackDecorationTintMode;
    public Drawable trackDrawable;
    public ColorStateList trackTintList;

    public MaterialSwitch(Context context, AttributeSet attributeSet, int i) {
        super(MaterialThemeOverlay.wrap(context, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch), attributeSet, i);
        this.thumbIconSize = -1;
        Context context2 = getContext();
        this.thumbDrawable = this.mThumbDrawable;
        this.thumbTintList = this.mThumbTintList;
        super.setThumbTintList(null);
        this.trackDrawable = this.mTrackDrawable;
        this.trackTintList = this.mTrackTintList;
        super.setTrackTintList(null);
        ViewUtils.checkCompatibleTheme(context2, attributeSet, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch);
        int[] iArr = R$styleable.MaterialSwitch;
        ViewUtils.checkTextAppearance(context2, attributeSet, iArr, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, R.style.Widget_Material3_CompoundButton_MaterialSwitch);
        GrpcMethod grpcMethod = new GrpcMethod(context2, obtainStyledAttributes);
        this.thumbIconDrawable = grpcMethod.getDrawable(0);
        this.thumbIconSize = obtainStyledAttributes.getDimensionPixelSize(1, -1);
        this.thumbIconTintList = grpcMethod.getColorStateList(2);
        int i2 = obtainStyledAttributes.getInt(3, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.thumbIconTintMode = ViewUtils.parseTintMode(i2, mode);
        this.trackDecorationDrawable = grpcMethod.getDrawable(4);
        this.trackDecorationTintList = grpcMethod.getColorStateList(5);
        this.trackDecorationTintMode = ViewUtils.parseTintMode(obtainStyledAttributes.getInt(6, -1), mode);
        grpcMethod.recycle();
        this.mEnforceSwitchWidth = false;
        invalidate();
        refreshThumbDrawable();
        refreshTrackDrawable();
    }

    public static void setInterpolatedDrawableTintIfPossible(Drawable drawable, ColorStateList colorStateList, int[] iArr, int[] iArr2, float f) {
        if (drawable == null || colorStateList == null) {
            return;
        }
        drawable.setTint(ColorUtils.blendARGB(f, colorStateList.getColorForState(iArr, 0), colorStateList.getColorForState(iArr2, 0)));
    }

    @Override // android.view.View
    public final void invalidate() {
        updateDrawableTints();
        super.invalidate();
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (this.thumbIconDrawable != null) {
            View.mergeDrawableStates(onCreateDrawableState, STATE_SET_WITH_ICON);
        }
        int[] iArr = new int[onCreateDrawableState.length];
        int i2 = 0;
        for (int i3 : onCreateDrawableState) {
            if (i3 != 16842912) {
                iArr[i2] = i3;
                i2++;
            }
        }
        this.currentStateUnchecked = iArr;
        this.currentStateChecked = SelfieUtilsKt.getCheckedState(onCreateDrawableState);
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.SwitchCompat, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        FocusRingDrawable find;
        super.onLayout(z, i, i2, i3, i4);
        if (this.trackDrawable == null || (find = FocusRingDrawable.find(getBackground())) == null) {
            return;
        }
        find.mutate();
        find.state.ringCustomBounds = this.trackDrawable.getBounds();
    }

    public final void refreshThumbDrawable() {
        this.thumbDrawable = SelfieUtilsKt.createTintableMutatedDrawableIfNeeded$1(this.thumbDrawable, this.thumbTintList, this.mThumbTintMode);
        this.thumbIconDrawable = SelfieUtilsKt.createTintableMutatedDrawableIfNeeded$1(this.thumbIconDrawable, this.thumbIconTintList, this.thumbIconTintMode);
        updateDrawableTints();
        Drawable drawable = this.thumbDrawable;
        Drawable drawable2 = this.thumbIconDrawable;
        int i = this.thumbIconSize;
        super.setThumbDrawable(SelfieUtilsKt.compositeTwoLayeredDrawable(drawable, drawable2, i, i));
        refreshDrawableState();
    }

    public final void refreshTrackDrawable() {
        this.trackDrawable = SelfieUtilsKt.createTintableMutatedDrawableIfNeeded$1(this.trackDrawable, this.trackTintList, this.mTrackTintMode);
        this.trackDecorationDrawable = SelfieUtilsKt.createTintableMutatedDrawableIfNeeded$1(this.trackDecorationDrawable, this.trackDecorationTintList, this.trackDecorationTintMode);
        updateDrawableTints();
        Drawable drawable = this.trackDrawable;
        if (drawable != null && this.trackDecorationDrawable != null) {
            drawable = new LayerDrawable(new Drawable[]{this.trackDrawable, this.trackDecorationDrawable});
        } else if (drawable == null) {
            drawable = this.trackDecorationDrawable;
        }
        if (drawable != null) {
            setSwitchMinWidth(drawable.getIntrinsicWidth());
        }
        super.setTrackDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbDrawable(Drawable drawable) {
        this.thumbDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconDrawable(Drawable drawable) {
        this.thumbIconDrawable = drawable;
        refreshThumbDrawable();
    }

    public void setThumbIconResource(int i) {
        setThumbIconDrawable(DimensionKt.getDrawable(getContext(), i));
    }

    public void setThumbIconSize(int i) {
        if (this.thumbIconSize != i) {
            this.thumbIconSize = i;
            refreshThumbDrawable();
        }
    }

    public void setThumbIconTintList(ColorStateList colorStateList) {
        this.thumbIconTintList = colorStateList;
        refreshThumbDrawable();
    }

    public void setThumbIconTintMode(PorterDuff.Mode mode) {
        this.thumbIconTintMode = mode;
        refreshThumbDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintList(ColorStateList colorStateList) {
        this.thumbTintList = colorStateList;
        refreshThumbDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setThumbTintMode(PorterDuff.Mode mode) {
        super.setThumbTintMode(mode);
        refreshThumbDrawable();
    }

    public void setTrackDecorationDrawable(Drawable drawable) {
        this.trackDecorationDrawable = drawable;
        refreshTrackDrawable();
    }

    public void setTrackDecorationResource(int i) {
        setTrackDecorationDrawable(DimensionKt.getDrawable(getContext(), i));
    }

    public void setTrackDecorationTintList(ColorStateList colorStateList) {
        this.trackDecorationTintList = colorStateList;
        refreshTrackDrawable();
    }

    public void setTrackDecorationTintMode(PorterDuff.Mode mode) {
        this.trackDecorationTintMode = mode;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackDrawable(Drawable drawable) {
        this.trackDrawable = drawable;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintList(ColorStateList colorStateList) {
        this.trackTintList = colorStateList;
        refreshTrackDrawable();
    }

    @Override // androidx.appcompat.widget.SwitchCompat
    public void setTrackTintMode(PorterDuff.Mode mode) {
        super.setTrackTintMode(mode);
        refreshTrackDrawable();
    }

    public final void updateDrawableTints() {
        ColorStateList colorStateList = this.thumbTintList;
        if (colorStateList == null && this.thumbIconTintList == null && this.trackTintList == null && this.trackDecorationTintList == null) {
            return;
        }
        float f = this.mThumbPosition;
        if (colorStateList != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbDrawable, colorStateList, this.currentStateUnchecked, this.currentStateChecked, f);
        }
        ColorStateList colorStateList2 = this.thumbIconTintList;
        if (colorStateList2 != null) {
            setInterpolatedDrawableTintIfPossible(this.thumbIconDrawable, colorStateList2, this.currentStateUnchecked, this.currentStateChecked, f);
        }
        ColorStateList colorStateList3 = this.trackTintList;
        if (colorStateList3 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDrawable, colorStateList3, this.currentStateUnchecked, this.currentStateChecked, f);
        }
        ColorStateList colorStateList4 = this.trackDecorationTintList;
        if (colorStateList4 != null) {
            setInterpolatedDrawableTintIfPossible(this.trackDecorationDrawable, colorStateList4, this.currentStateUnchecked, this.currentStateChecked, f);
        }
    }

    public MaterialSwitch(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.materialSwitchStyle);
    }

    public MaterialSwitch(Context context) {
        this(context, null);
    }
}
