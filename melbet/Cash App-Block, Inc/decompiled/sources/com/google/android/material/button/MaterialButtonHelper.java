package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import androidx.dynamicanimation.animation.SpringForce;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.resources.MaterialAttributes;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearance;
import com.google.android.material.shape.Shapeable;
import com.squareup.cash.R;
import java.lang.ref.WeakReference;

/* loaded from: classes4.dex */
public final class MaterialButtonHelper {
    public ColorStateList backgroundTint;
    public PorterDuff.Mode backgroundTintMode;
    public boolean checkable;
    public int cornerRadius;
    public SpringForce cornerSpringForce;
    public int elevation;
    public int insetBottom;
    public int insetLeft;
    public int insetRight;
    public int insetTop;
    public MaterialShapeDrawable maskDrawable;
    public final MaterialButton materialButton;
    public MaterialButton$$ExternalSyntheticLambda3 onCornerSizeChangeListener;
    public ColorStateList rippleColor;
    public RippleDrawable rippleDrawable;
    public ShapeAppearance shapeAppearance;
    public ColorStateList strokeColor;
    public int strokeWidth;
    public boolean shouldDrawSurfaceColorStroke = false;
    public boolean backgroundOverwritten = false;
    public boolean cornerRadiusSet = false;
    public boolean toggleCheckedStateOnClick = true;

    public MaterialButtonHelper(MaterialButton materialButton, ShapeAppearance shapeAppearance) {
        this.materialButton = materialButton;
        this.shapeAppearance = shapeAppearance;
    }

    public final MaterialShapeDrawable getMaterialShapeDrawable(boolean z) {
        RippleDrawable rippleDrawable = this.rippleDrawable;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (MaterialShapeDrawable) ((LayerDrawable) ((InsetDrawable) this.rippleDrawable.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void setInsets(int i, int i2, int i3, int i4) {
        MaterialButton materialButton = this.materialButton;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i5 = this.insetLeft;
        int i6 = this.insetTop;
        int i7 = this.insetRight;
        int i8 = this.insetBottom;
        this.insetLeft = i;
        this.insetTop = i2;
        this.insetRight = i3;
        this.insetBottom = i4;
        if (!this.backgroundOverwritten) {
            updateBackground();
        }
        materialButton.setPaddingRelative((paddingStart + i) - i5, (paddingTop + i2) - i6, (paddingEnd + i3) - i7, (paddingBottom + i4) - i8);
    }

    public final void updateBackground() {
        MaterialShapeDrawable materialShapeDrawable = new MaterialShapeDrawable(this.shapeAppearance);
        SpringForce springForce = this.cornerSpringForce;
        if (springForce != null) {
            materialShapeDrawable.setCornerSpringForce(springForce);
        }
        MaterialButton$$ExternalSyntheticLambda3 materialButton$$ExternalSyntheticLambda3 = this.onCornerSizeChangeListener;
        if (materialButton$$ExternalSyntheticLambda3 != null) {
            materialShapeDrawable.onCornerSizeChangeListener = materialButton$$ExternalSyntheticLambda3;
        }
        MaterialButton materialButton = this.materialButton;
        Context context = materialButton.getContext();
        materialShapeDrawable.initializeElevationOverlay(context);
        materialShapeDrawable.setTintList(this.backgroundTint);
        PorterDuff.Mode mode = this.backgroundTintMode;
        if (mode != null) {
            materialShapeDrawable.setTintMode(mode);
        }
        float f = this.strokeWidth;
        ColorStateList colorStateList = this.strokeColor;
        materialShapeDrawable.drawableState.strokeWidth = f;
        materialShapeDrawable.invalidateSelf();
        materialShapeDrawable.setStrokeColor(colorStateList);
        MaterialShapeDrawable materialShapeDrawable2 = new MaterialShapeDrawable(this.shapeAppearance);
        SpringForce springForce2 = this.cornerSpringForce;
        if (springForce2 != null) {
            materialShapeDrawable2.setCornerSpringForce(springForce2);
        }
        materialShapeDrawable2.setTint(0);
        float f2 = this.strokeWidth;
        int resolveColor = this.shouldDrawSurfaceColorStroke ? MaterialColors.resolveColor(materialButton.getContext(), MaterialAttributes.resolveTypedValueOrThrow(materialButton, R.attr.colorSurface)) : 0;
        materialShapeDrawable2.drawableState.strokeWidth = f2;
        materialShapeDrawable2.invalidateSelf();
        materialShapeDrawable2.setStrokeColor(ColorStateList.valueOf(resolveColor));
        MaterialShapeDrawable materialShapeDrawable3 = new MaterialShapeDrawable(this.shapeAppearance);
        this.maskDrawable = materialShapeDrawable3;
        SpringForce springForce3 = this.cornerSpringForce;
        if (springForce3 != null) {
            materialShapeDrawable3.setCornerSpringForce(springForce3);
        }
        this.maskDrawable.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.rippleColor), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{materialShapeDrawable2, materialShapeDrawable}), this.insetLeft, this.insetTop, this.insetRight, this.insetBottom), this.maskDrawable);
        this.rippleDrawable = rippleDrawable;
        FocusRingDrawable.layer(context, rippleDrawable, null);
        materialButton.setInternalBackground(this.rippleDrawable);
        MaterialShapeDrawable materialShapeDrawable4 = getMaterialShapeDrawable(false);
        if (materialShapeDrawable4 != null) {
            materialShapeDrawable4.setElevation(this.elevation);
            materialShapeDrawable4.setState(materialButton.getDrawableState());
        }
        FocusRingDrawable find = FocusRingDrawable.find(materialButton.getBackground());
        if (find != null) {
            find.materialShapeDrawable = new WeakReference(materialShapeDrawable4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void updateButtonShape() {
        Shapeable shapeable;
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable(false);
        if (materialShapeDrawable != null) {
            materialShapeDrawable.setShapeAppearance(this.shapeAppearance);
            SpringForce springForce = this.cornerSpringForce;
            if (springForce != null) {
                materialShapeDrawable.setCornerSpringForce(springForce);
            }
        }
        MaterialShapeDrawable materialShapeDrawable2 = getMaterialShapeDrawable(true);
        if (materialShapeDrawable2 != null) {
            materialShapeDrawable2.setShapeAppearance(this.shapeAppearance);
            SpringForce springForce2 = this.cornerSpringForce;
            if (springForce2 != null) {
                materialShapeDrawable2.setCornerSpringForce(springForce2);
            }
        }
        RippleDrawable rippleDrawable = this.rippleDrawable;
        if (rippleDrawable != null) {
            Object findDrawableByLayerId = rippleDrawable.findDrawableByLayerId(android.R.id.mask);
            if (findDrawableByLayerId instanceof Shapeable) {
                shapeable = (Shapeable) findDrawableByLayerId;
                if (shapeable == null) {
                    boolean z = shapeable instanceof MaterialShapeDrawable;
                    ShapeAppearance shapeAppearance = this.shapeAppearance;
                    if (!z) {
                        shapeable.setShapeAppearanceModel(shapeAppearance.getDefaultShape());
                        return;
                    }
                    MaterialShapeDrawable materialShapeDrawable3 = (MaterialShapeDrawable) shapeable;
                    materialShapeDrawable3.setShapeAppearance(shapeAppearance);
                    SpringForce springForce3 = this.cornerSpringForce;
                    if (springForce3 != null) {
                        materialShapeDrawable3.setCornerSpringForce(springForce3);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        shapeable = null;
        if (shapeable == null) {
        }
    }

    public final void updateStroke() {
        int i = 0;
        MaterialShapeDrawable materialShapeDrawable = getMaterialShapeDrawable(false);
        MaterialShapeDrawable materialShapeDrawable2 = getMaterialShapeDrawable(true);
        if (materialShapeDrawable != null) {
            float f = this.strokeWidth;
            ColorStateList colorStateList = this.strokeColor;
            materialShapeDrawable.drawableState.strokeWidth = f;
            materialShapeDrawable.invalidateSelf();
            materialShapeDrawable.setStrokeColor(colorStateList);
            if (materialShapeDrawable2 != null) {
                float f2 = this.strokeWidth;
                if (this.shouldDrawSurfaceColorStroke) {
                    MaterialButton materialButton = this.materialButton;
                    i = MaterialColors.resolveColor(materialButton.getContext(), MaterialAttributes.resolveTypedValueOrThrow(materialButton, R.attr.colorSurface));
                }
                materialShapeDrawable2.drawableState.strokeWidth = f2;
                materialShapeDrawable2.invalidateSelf();
                materialShapeDrawable2.setStrokeColor(ColorStateList.valueOf(i));
            }
        }
    }
}
