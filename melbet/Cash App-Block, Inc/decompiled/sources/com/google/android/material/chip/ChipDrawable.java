package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.core.graphics.ColorUtils;
import androidx.media3.exoplayer.MediaSourceList;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.focus.FocusRingDrawable;
import com.google.android.material.internal.TextDrawableHelper;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.nimbusds.jose.jca.JCAContext;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class ChipDrawable extends MaterialShapeDrawable implements Drawable.Callback {
    public static final int[] DEFAULT_STATE = {R.attr.state_enabled};
    public static final ShapeDrawable closeIconRippleMask = new ShapeDrawable(new OvalShape());
    public int alpha;
    public boolean checkable;
    public Drawable checkedIcon;
    public ColorStateList checkedIconTint;
    public boolean checkedIconVisible;
    public ColorStateList chipBackgroundColor;
    public float chipCornerRadius;
    public float chipEndPadding;
    public Drawable chipIcon;
    public float chipIconSize;
    public ColorStateList chipIconTint;
    public boolean chipIconVisible;
    public float chipMinHeight;
    public final Paint chipPaint;
    public float chipStartPadding;
    public ColorStateList chipStrokeColor;
    public float chipStrokeWidth;
    public ColorStateList chipSurfaceColor;
    public Drawable closeIcon;
    public SpannableStringBuilder closeIconContentDescription;
    public float closeIconEndPadding;
    public RippleDrawable closeIconRipple;
    public float closeIconSize;
    public float closeIconStartPadding;
    public int[] closeIconStateSet;
    public ColorStateList closeIconTint;
    public boolean closeIconVisible;
    public ColorFilter colorFilter;
    public ColorStateList compatRippleColor;
    public final Context context;
    public boolean currentChecked;
    public int currentChipBackgroundColor;
    public int currentChipStrokeColor;
    public int currentChipSurfaceColor;
    public int currentCompatRippleColor;
    public int currentCompositeSurfaceBackgroundColor;
    public int currentTextColor;
    public int currentTint;
    public WeakReference delegate;
    public final Paint.FontMetrics fontMetrics;
    public boolean hasChipIconTint;
    public float iconEndPadding;
    public float iconStartPadding;
    public boolean isShapeThemingEnabled;
    public int maxWidth;
    public final PointF pointF;
    public final RectF rectF;
    public ColorStateList rippleColor;
    public final Path shapePath;
    public boolean shouldDrawText;
    public CharSequence text;
    public final TextDrawableHelper textDrawableHelper;
    public float textEndPadding;
    public float textStartPadding;
    public ColorStateList tint;
    public PorterDuffColorFilter tintFilter;
    public PorterDuff.Mode tintMode;
    public TextUtils.TruncateAt truncateAt;

    public ChipDrawable(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, com.squareup.cash.R.style.Widget_MaterialComponents_Chip_Action);
        this.chipCornerRadius = -1.0f;
        this.chipPaint = new Paint(1);
        this.fontMetrics = new Paint.FontMetrics();
        this.rectF = new RectF();
        this.pointF = new PointF();
        this.shapePath = new Path();
        this.alpha = 255;
        this.tintMode = PorterDuff.Mode.SRC_IN;
        this.delegate = new WeakReference(null);
        initializeElevationOverlay(context);
        this.context = context;
        TextDrawableHelper textDrawableHelper = new TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.text = "";
        textDrawableHelper.textPaint.density = context.getResources().getDisplayMetrics().density;
        int[] iArr = DEFAULT_STATE;
        setState(iArr);
        setCloseIconState(iArr);
        this.shouldDrawText = true;
        closeIconRippleMask.setTint(-1);
    }

    public static void unapplyChildDrawable(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public final void applyChildDrawable(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        drawable.setLayoutDirection(getLayoutDirection());
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.closeIcon) {
            drawable.setTintList(this.closeIconTint);
            if (drawable.isStateful()) {
                drawable.setState(this.closeIconStateSet);
                return;
            }
            return;
        }
        Drawable drawable2 = this.chipIcon;
        if (drawable == drawable2 && this.hasChipIconTint) {
            drawable2.setTintList(this.chipIconTint);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    public final void calculateChipIconBounds(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (showsChipIcon() || showsCheckedIcon()) {
            float f = this.chipStartPadding + this.iconStartPadding;
            Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
            float f2 = this.chipIconSize;
            if (f2 <= RecyclerView.DECELERATION_RATE && drawable != null) {
                f2 = drawable.getIntrinsicWidth();
            }
            if (getLayoutDirection() == 0) {
                float f3 = rect.left + f;
                rectF.left = f3;
                rectF.right = f3 + f2;
            } else {
                float f4 = rect.right - f;
                rectF.right = f4;
                rectF.left = f4 - f2;
            }
            Drawable drawable2 = this.currentChecked ? this.checkedIcon : this.chipIcon;
            float f5 = this.chipIconSize;
            if (f5 <= RecyclerView.DECELERATION_RATE && drawable2 != null) {
                f5 = (float) Math.ceil(ViewUtils.dpToPx(this.context, 24));
                if (drawable2.getIntrinsicHeight() <= f5) {
                    f5 = drawable2.getIntrinsicHeight();
                }
            }
            float exactCenterY = rect.exactCenterY() - (f5 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + f5;
        }
    }

    public final float calculateChipIconWidth() {
        if (!showsChipIcon() && !showsCheckedIcon()) {
            return RecyclerView.DECELERATION_RATE;
        }
        float f = this.iconStartPadding;
        Drawable drawable = this.currentChecked ? this.checkedIcon : this.chipIcon;
        float f2 = this.chipIconSize;
        if (f2 <= RecyclerView.DECELERATION_RATE && drawable != null) {
            f2 = drawable.getIntrinsicWidth();
        }
        return f2 + f + this.iconEndPadding;
    }

    public final float calculateCloseIconWidth() {
        return showsCloseIcon() ? this.closeIconStartPadding + this.closeIconSize + this.closeIconEndPadding : RecyclerView.DECELERATION_RATE;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        int i;
        Canvas canvas2;
        int i2;
        float f;
        int i3;
        Rect bounds = getBounds();
        if (bounds.isEmpty() || (i = this.alpha) == 0) {
            return;
        }
        if (i < 255) {
            canvas2 = canvas;
            i2 = canvas2.saveLayerAlpha(bounds.left, bounds.top, bounds.right, bounds.bottom, i);
        } else {
            canvas2 = canvas;
            i2 = 0;
        }
        boolean z = this.isShapeThemingEnabled;
        Paint paint = this.chipPaint;
        RectF rectF = this.rectF;
        if (!z) {
            paint.setColor(this.currentChipSurfaceColor);
            paint.setStyle(Paint.Style.FILL);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, getChipCornerRadius(), getChipCornerRadius(), paint);
        }
        if (!this.isShapeThemingEnabled) {
            paint.setColor(this.currentChipBackgroundColor);
            paint.setStyle(Paint.Style.FILL);
            ColorFilter colorFilter = this.colorFilter;
            if (colorFilter == null) {
                colorFilter = this.tintFilter;
            }
            paint.setColorFilter(colorFilter);
            rectF.set(bounds);
            canvas2.drawRoundRect(rectF, getChipCornerRadius(), getChipCornerRadius(), paint);
        }
        if (this.isShapeThemingEnabled) {
            super.draw(canvas);
        }
        if (this.chipStrokeWidth > RecyclerView.DECELERATION_RATE && !this.isShapeThemingEnabled) {
            paint.setColor(this.currentChipStrokeColor);
            paint.setStyle(Paint.Style.STROKE);
            if (!this.isShapeThemingEnabled) {
                ColorFilter colorFilter2 = this.colorFilter;
                if (colorFilter2 == null) {
                    colorFilter2 = this.tintFilter;
                }
                paint.setColorFilter(colorFilter2);
            }
            float f2 = bounds.left;
            float f3 = this.chipStrokeWidth / 2.0f;
            rectF.set(f2 + f3, bounds.top + f3, bounds.right - f3, bounds.bottom - f3);
            float f4 = this.chipCornerRadius - (this.chipStrokeWidth / 2.0f);
            canvas2.drawRoundRect(rectF, f4, f4, paint);
        }
        paint.setColor(this.currentCompatRippleColor);
        paint.setStyle(Paint.Style.FILL);
        rectF.set(bounds);
        if (this.isShapeThemingEnabled) {
            RectF rectF2 = new RectF(bounds);
            ShapeAppearanceModel defaultShape = this.drawableState.shapeAppearance.getDefaultShape();
            float[] fArr = this.springAnimatedCornerSizes;
            float f5 = this.drawableState.interpolation;
            JCAContext jCAContext = this.pathShadowListener;
            MediaSourceList mediaSourceList = this.pathProvider;
            f = 2.0f;
            Path path = this.shapePath;
            mediaSourceList.calculatePath(defaultShape, fArr, f5, rectF2, jCAContext, path);
            drawShape(canvas2, paint, path, this.drawableState.shapeAppearance.getDefaultShape(), this.springAnimatedCornerSizes, getBoundsAsRectF$1());
        } else {
            canvas2.drawRoundRect(rectF, getChipCornerRadius(), getChipCornerRadius(), paint);
            f = 2.0f;
        }
        if (showsChipIcon()) {
            calculateChipIconBounds(bounds, rectF);
            float f6 = rectF.left;
            float f7 = rectF.top;
            canvas2.translate(f6, f7);
            this.chipIcon.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.chipIcon.draw(canvas2);
            canvas2.translate(-f6, -f7);
        }
        if (showsCheckedIcon()) {
            calculateChipIconBounds(bounds, rectF);
            float f8 = rectF.left;
            float f9 = rectF.top;
            canvas2.translate(f8, f9);
            this.checkedIcon.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.checkedIcon.draw(canvas2);
            canvas2.translate(-f8, -f9);
        }
        if (this.shouldDrawText && this.text != null) {
            PointF pointF = this.pointF;
            pointF.set(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
            Paint.Align align = Paint.Align.LEFT;
            CharSequence charSequence = this.text;
            TextDrawableHelper textDrawableHelper = this.textDrawableHelper;
            if (charSequence != null) {
                float calculateChipIconWidth = calculateChipIconWidth() + this.chipStartPadding + this.textStartPadding;
                if (getLayoutDirection() == 0) {
                    pointF.x = bounds.left + calculateChipIconWidth;
                } else {
                    pointF.x = bounds.right - calculateChipIconWidth;
                    align = Paint.Align.RIGHT;
                }
                float centerY = bounds.centerY();
                TextPaint textPaint = textDrawableHelper.textPaint;
                Paint.FontMetrics fontMetrics = this.fontMetrics;
                textPaint.getFontMetrics(fontMetrics);
                pointF.y = centerY - ((fontMetrics.descent + fontMetrics.ascent) / f);
            }
            rectF.setEmpty();
            if (this.text != null) {
                float calculateChipIconWidth2 = calculateChipIconWidth() + this.chipStartPadding + this.textStartPadding;
                float calculateCloseIconWidth = calculateCloseIconWidth() + this.chipEndPadding + this.textEndPadding;
                int layoutDirection = getLayoutDirection();
                int i4 = bounds.left;
                if (layoutDirection == 0) {
                    rectF.left = i4 + calculateChipIconWidth2;
                    rectF.right = bounds.right - calculateCloseIconWidth;
                } else {
                    rectF.left = i4 + calculateCloseIconWidth;
                    rectF.right = bounds.right - calculateChipIconWidth2;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
            TextAppearance textAppearance = textDrawableHelper.textAppearance;
            TextPaint textPaint2 = textDrawableHelper.textPaint;
            if (textAppearance != null) {
                textPaint2.drawableState = getState();
                textDrawableHelper.textAppearance.updateDrawState(this.context, textPaint2, textDrawableHelper.fontCallback);
            }
            textPaint2.setTextAlign(align);
            boolean z2 = Math.round(textDrawableHelper.getTextWidth(this.text.toString())) > Math.round(rectF.width());
            if (z2) {
                int save = canvas2.save();
                canvas2.clipRect(rectF);
                i3 = save;
            } else {
                i3 = 0;
            }
            CharSequence charSequence2 = this.text;
            if (z2 && this.truncateAt != null) {
                charSequence2 = TextUtils.ellipsize(charSequence2, textPaint2, rectF.width(), this.truncateAt);
            }
            canvas.drawText(charSequence2, 0, charSequence2.length(), pointF.x, pointF.y, textPaint2);
            canvas2 = canvas;
            if (z2) {
                canvas2.restoreToCount(i3);
            }
        }
        if (showsCloseIcon()) {
            rectF.setEmpty();
            if (showsCloseIcon()) {
                float f10 = this.chipEndPadding + this.closeIconEndPadding;
                if (getLayoutDirection() == 0) {
                    float f11 = bounds.right - f10;
                    rectF.right = f11;
                    rectF.left = f11 - this.closeIconSize;
                } else {
                    float f12 = bounds.left + f10;
                    rectF.left = f12;
                    rectF.right = f12 + this.closeIconSize;
                }
                float exactCenterY = bounds.exactCenterY();
                float f13 = this.closeIconSize;
                float f14 = exactCenterY - (f13 / f);
                rectF.top = f14;
                rectF.bottom = f14 + f13;
            }
            float f15 = rectF.left;
            float f16 = rectF.top;
            canvas2.translate(f15, f16);
            this.closeIcon.setBounds(0, 0, (int) rectF.width(), (int) rectF.height());
            this.closeIconRipple.setBounds(this.closeIcon.getBounds());
            this.closeIconRipple.jumpToCurrentState();
            this.closeIconRipple.draw(canvas2);
            canvas2.translate(-f15, -f16);
        }
        if (this.alpha < 255) {
            canvas2.restoreToCount(i2);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.alpha;
    }

    public final float getChipCornerRadius() {
        return this.isShapeThemingEnabled ? getTopLeftCornerResolvedSize() : this.chipCornerRadius;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.colorFilter;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return (int) this.chipMinHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.min(Math.round(calculateCloseIconWidth() + this.textDrawableHelper.getTextWidth(this.text.toString()) + calculateChipIconWidth() + this.chipStartPadding + this.textStartPadding + this.textEndPadding + this.chipEndPadding), this.maxWidth);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Outline outline2;
        if (this.isShapeThemingEnabled) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (bounds.isEmpty()) {
            outline2 = outline;
            outline2.setRoundRect(0, 0, getIntrinsicWidth(), (int) this.chipMinHeight, this.chipCornerRadius);
        } else {
            outline.setRoundRect(bounds, this.chipCornerRadius);
            outline2 = outline;
        }
        outline2.setAlpha(this.alpha / 255.0f);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList;
        if (isStateful(this.chipSurfaceColor) || isStateful(this.chipBackgroundColor) || isStateful(this.chipStrokeColor)) {
            return true;
        }
        TextAppearance textAppearance = this.textDrawableHelper.textAppearance;
        if (textAppearance == null || (colorStateList = textAppearance.textColor) == null || !colorStateList.isStateful()) {
            return (this.checkedIconVisible && this.checkedIcon != null && this.checkable) || isStateful(this.chipIcon) || isStateful(this.checkedIcon) || isStateful(this.tint);
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i);
        if (showsChipIcon()) {
            onLayoutDirectionChanged |= this.chipIcon.setLayoutDirection(i);
        }
        if (showsCheckedIcon()) {
            onLayoutDirectionChanged |= this.checkedIcon.setLayoutDirection(i);
        }
        if (showsCloseIcon()) {
            onLayoutDirectionChanged |= this.closeIcon.setLayoutDirection(i);
        }
        if (!onLayoutDirectionChanged) {
            return true;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        boolean onLevelChange = super.onLevelChange(i);
        if (showsChipIcon()) {
            onLevelChange |= this.chipIcon.setLevel(i);
        }
        if (showsCheckedIcon()) {
            onLevelChange |= this.checkedIcon.setLevel(i);
        }
        if (showsCloseIcon()) {
            onLevelChange |= this.closeIcon.setLevel(i);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    public final void onSizeChange() {
        Chip chip = (Chip) this.delegate.get();
        if (chip != null) {
            chip.ensureAccessibleTouchTarget(chip.minTouchTargetSize);
            chip.requestLayout();
            chip.invalidateOutline();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onStateChange(int[] iArr, int[] iArr2) {
        int i;
        int colorForState;
        int[] state;
        boolean z;
        boolean z2;
        int colorForState2;
        ColorStateList colorStateList;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList2 = this.chipSurfaceColor;
        int compositeElevationOverlayIfNeeded = compositeElevationOverlayIfNeeded(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.currentChipSurfaceColor) : 0);
        boolean z3 = true;
        if (this.currentChipSurfaceColor != compositeElevationOverlayIfNeeded) {
            this.currentChipSurfaceColor = compositeElevationOverlayIfNeeded;
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.chipBackgroundColor;
        int compositeElevationOverlayIfNeeded2 = compositeElevationOverlayIfNeeded(colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.currentChipBackgroundColor) : 0);
        if (this.currentChipBackgroundColor != compositeElevationOverlayIfNeeded2) {
            this.currentChipBackgroundColor = compositeElevationOverlayIfNeeded2;
            onStateChange = true;
        }
        int compositeColors = ColorUtils.compositeColors(compositeElevationOverlayIfNeeded2, compositeElevationOverlayIfNeeded);
        if ((this.currentCompositeSurfaceBackgroundColor != compositeColors) | (this.drawableState.fillColor == null)) {
            this.currentCompositeSurfaceBackgroundColor = compositeColors;
            setFillColor(ColorStateList.valueOf(compositeColors));
            onStateChange = true;
        }
        ColorStateList colorStateList4 = this.chipStrokeColor;
        int colorForState3 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.currentChipStrokeColor) : 0;
        if (this.currentChipStrokeColor != colorForState3) {
            this.currentChipStrokeColor = colorForState3;
            onStateChange = true;
        }
        if (this.compatRippleColor != null) {
            boolean z4 = false;
            boolean z5 = false;
            for (int i2 : iArr) {
                if (i2 == 16842910) {
                    z4 = true;
                } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                    z5 = true;
                }
            }
            if (z4 && z5) {
                i = this.compatRippleColor.getColorForState(iArr, this.currentCompatRippleColor);
                if (this.currentCompatRippleColor != i) {
                    this.currentCompatRippleColor = i;
                }
                TextAppearance textAppearance = this.textDrawableHelper.textAppearance;
                colorForState = (textAppearance != null || (colorStateList = textAppearance.textColor) == null) ? 0 : colorStateList.getColorForState(iArr, this.currentTextColor);
                if (this.currentTextColor != colorForState) {
                    this.currentTextColor = colorForState;
                    onStateChange = true;
                }
                state = getState();
                if (state != null) {
                    int length = state.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            break;
                        }
                        if (state[i3] != 16842912) {
                            i3++;
                        } else if (this.checkable) {
                            z = true;
                        }
                    }
                }
                z = false;
                if (this.currentChecked != z || this.checkedIcon == null) {
                    z2 = false;
                } else {
                    float calculateChipIconWidth = calculateChipIconWidth();
                    this.currentChecked = z;
                    if (calculateChipIconWidth != calculateChipIconWidth()) {
                        onStateChange = true;
                        z2 = true;
                    } else {
                        z2 = false;
                        onStateChange = true;
                    }
                }
                ColorStateList colorStateList5 = this.tint;
                colorForState2 = colorStateList5 == null ? colorStateList5.getColorForState(iArr, this.currentTint) : 0;
                if (this.currentTint == colorForState2) {
                    this.currentTint = colorForState2;
                    ColorStateList colorStateList6 = this.tint;
                    PorterDuff.Mode mode = this.tintMode;
                    this.tintFilter = (colorStateList6 == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList6.getColorForState(getState(), 0), mode);
                } else {
                    z3 = onStateChange;
                }
                if (isStateful(this.chipIcon)) {
                    z3 |= this.chipIcon.setState(iArr);
                }
                if (isStateful(this.checkedIcon)) {
                    z3 |= this.checkedIcon.setState(iArr);
                }
                if (isStateful(this.closeIcon)) {
                    int[] iArr3 = new int[iArr.length + iArr2.length];
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                    System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
                    z3 |= this.closeIcon.setState(iArr3);
                }
                if (isStateful(this.closeIconRipple)) {
                    z3 |= this.closeIconRipple.setState(iArr2);
                }
                if (z3) {
                    invalidateSelf();
                }
                if (z2) {
                    onSizeChange();
                }
                return z3;
            }
        }
        i = 0;
        if (this.currentCompatRippleColor != i) {
        }
        TextAppearance textAppearance2 = this.textDrawableHelper.textAppearance;
        if (textAppearance2 != null) {
        }
        if (this.currentTextColor != colorForState) {
        }
        state = getState();
        if (state != null) {
        }
        z = false;
        if (this.currentChecked != z) {
        }
        z2 = false;
        ColorStateList colorStateList52 = this.tint;
        if (colorStateList52 == null) {
        }
        if (this.currentTint == colorForState2) {
        }
        if (isStateful(this.chipIcon)) {
        }
        if (isStateful(this.checkedIcon)) {
        }
        if (isStateful(this.closeIcon)) {
        }
        if (isStateful(this.closeIconRipple)) {
        }
        if (z3) {
        }
        if (z2) {
        }
        return z3;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j);
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (this.alpha != i) {
            this.alpha = i;
            invalidateSelf();
        }
    }

    public final void setCheckable(boolean z) {
        if (this.checkable != z) {
            this.checkable = z;
            float calculateChipIconWidth = calculateChipIconWidth();
            if (!z && this.currentChecked) {
                this.currentChecked = false;
            }
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public final void setCheckedIcon(Drawable drawable) {
        if (this.checkedIcon != drawable) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.checkedIcon = drawable;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(this.checkedIcon);
            applyChildDrawable(this.checkedIcon);
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public final void setCheckedIconTint(ColorStateList colorStateList) {
        Drawable drawable;
        if (this.checkedIconTint != colorStateList) {
            this.checkedIconTint = colorStateList;
            if (this.checkedIconVisible && (drawable = this.checkedIcon) != null && this.checkable) {
                drawable.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void setCheckedIconVisible(boolean z) {
        if (this.checkedIconVisible != z) {
            boolean showsCheckedIcon = showsCheckedIcon();
            this.checkedIconVisible = z;
            boolean showsCheckedIcon2 = showsCheckedIcon();
            if (showsCheckedIcon != showsCheckedIcon2) {
                Drawable drawable = this.checkedIcon;
                if (showsCheckedIcon2) {
                    applyChildDrawable(drawable);
                } else {
                    unapplyChildDrawable(drawable);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public final void setChipCornerRadius(float f) {
        if (this.chipCornerRadius != f) {
            this.chipCornerRadius = f;
            setShapeAppearanceModel(getShapeAppearanceModel().withCornerSize(f));
        }
    }

    public final void setChipIcon(Drawable drawable) {
        Drawable drawable2 = this.chipIcon;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.chipIcon = drawable != null ? drawable.mutate() : null;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            unapplyChildDrawable(drawable2);
            if (showsChipIcon()) {
                applyChildDrawable(this.chipIcon);
            }
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public final void setChipIconSize(float f) {
        if (this.chipIconSize != f) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.chipIconSize = f;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public final void setChipIconTint(ColorStateList colorStateList) {
        this.hasChipIconTint = true;
        if (this.chipIconTint != colorStateList) {
            this.chipIconTint = colorStateList;
            if (showsChipIcon()) {
                this.chipIcon.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void setChipIconVisible(boolean z) {
        if (this.chipIconVisible != z) {
            boolean showsChipIcon = showsChipIcon();
            this.chipIconVisible = z;
            boolean showsChipIcon2 = showsChipIcon();
            if (showsChipIcon != showsChipIcon2) {
                Drawable drawable = this.chipIcon;
                if (showsChipIcon2) {
                    applyChildDrawable(drawable);
                } else {
                    unapplyChildDrawable(drawable);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    public final void setChipStrokeColor(ColorStateList colorStateList) {
        if (this.chipStrokeColor != colorStateList) {
            this.chipStrokeColor = colorStateList;
            if (this.isShapeThemingEnabled) {
                setStrokeColor(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void setChipStrokeWidth(float f) {
        if (this.chipStrokeWidth != f) {
            this.chipStrokeWidth = f;
            this.chipPaint.setStrokeWidth(f);
            if (this.isShapeThemingEnabled) {
                this.drawableState.strokeWidth = f;
                invalidateSelf();
            }
            invalidateSelf();
        }
    }

    public final void setCloseIcon(Drawable drawable) {
        Drawable drawable2 = this.closeIcon;
        if (drawable2 == null) {
            drawable2 = null;
        }
        if (drawable2 != drawable) {
            float calculateCloseIconWidth = calculateCloseIconWidth();
            this.closeIcon = drawable != null ? drawable.mutate() : null;
            RippleDrawable rippleDrawable = new RippleDrawable(RippleUtils.sanitizeRippleDrawableColor(this.rippleColor), this.closeIcon, closeIconRippleMask);
            FocusRingDrawable.layer(this.context, rippleDrawable, null);
            this.closeIconRipple = rippleDrawable;
            float calculateCloseIconWidth2 = calculateCloseIconWidth();
            unapplyChildDrawable(drawable2);
            if (showsCloseIcon()) {
                applyChildDrawable(this.closeIcon);
            }
            invalidateSelf();
            if (calculateCloseIconWidth != calculateCloseIconWidth2) {
                onSizeChange();
            }
        }
    }

    public final void setCloseIconEndPadding(float f) {
        if (this.closeIconEndPadding != f) {
            this.closeIconEndPadding = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public final void setCloseIconSize(float f) {
        if (this.closeIconSize != f) {
            this.closeIconSize = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public final void setCloseIconStartPadding(float f) {
        if (this.closeIconStartPadding != f) {
            this.closeIconStartPadding = f;
            invalidateSelf();
            if (showsCloseIcon()) {
                onSizeChange();
            }
        }
    }

    public final boolean setCloseIconState(int[] iArr) {
        if (Arrays.equals(this.closeIconStateSet, iArr)) {
            return false;
        }
        this.closeIconStateSet = iArr;
        if (showsCloseIcon()) {
            return onStateChange(getState(), iArr);
        }
        return false;
    }

    public final void setCloseIconTint(ColorStateList colorStateList) {
        if (this.closeIconTint != colorStateList) {
            this.closeIconTint = colorStateList;
            if (showsCloseIcon()) {
                this.closeIcon.setTintList(colorStateList);
            }
            onStateChange(getState());
        }
    }

    public final void setCloseIconVisible(boolean z) {
        if (this.closeIconVisible != z) {
            boolean showsCloseIcon = showsCloseIcon();
            this.closeIconVisible = z;
            boolean showsCloseIcon2 = showsCloseIcon();
            if (showsCloseIcon != showsCloseIcon2) {
                Drawable drawable = this.closeIcon;
                if (showsCloseIcon2) {
                    applyChildDrawable(drawable);
                } else {
                    unapplyChildDrawable(drawable);
                }
                invalidateSelf();
                onSizeChange();
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        if (this.colorFilter != colorFilter) {
            this.colorFilter = colorFilter;
            invalidateSelf();
        }
    }

    public final void setIconEndPadding(float f) {
        if (this.iconEndPadding != f) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.iconEndPadding = f;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public final void setIconStartPadding(float f) {
        if (this.iconStartPadding != f) {
            float calculateChipIconWidth = calculateChipIconWidth();
            this.iconStartPadding = f;
            float calculateChipIconWidth2 = calculateChipIconWidth();
            invalidateSelf();
            if (calculateChipIconWidth != calculateChipIconWidth2) {
                onSizeChange();
            }
        }
    }

    public final void setRippleColor(ColorStateList colorStateList) {
        if (this.rippleColor != colorStateList) {
            this.rippleColor = colorStateList;
            this.compatRippleColor = null;
            onStateChange(getState());
        }
    }

    public final void setTextAppearance(TextAppearance textAppearance) {
        TextDrawableHelper textDrawableHelper = this.textDrawableHelper;
        Chip.AnonymousClass1 anonymousClass1 = textDrawableHelper.fontCallback;
        TextPaint textPaint = textDrawableHelper.textPaint;
        if (textDrawableHelper.textAppearance != textAppearance) {
            textDrawableHelper.textAppearance = textAppearance;
            if (textAppearance != null) {
                Context context = this.context;
                textAppearance.updateMeasureState(context, textPaint, anonymousClass1);
                ChipDrawable chipDrawable = (ChipDrawable) textDrawableHelper.delegate.get();
                if (chipDrawable != null) {
                    textPaint.drawableState = chipDrawable.getState();
                }
                textAppearance.updateDrawState(context, textPaint, anonymousClass1);
                textDrawableHelper.textSizeDirty = true;
            }
            ChipDrawable chipDrawable2 = (ChipDrawable) textDrawableHelper.delegate.get();
            if (chipDrawable2 != null) {
                chipDrawable2.onSizeChange();
                chipDrawable2.invalidateSelf();
                chipDrawable2.onStateChange(chipDrawable2.getState());
            }
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        if (this.tint != colorStateList) {
            this.tint = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        if (this.tintMode != mode) {
            this.tintMode = mode;
            ColorStateList colorStateList = this.tint;
            this.tintFilter = (colorStateList == null || mode == null) ? null : new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        if (showsChipIcon()) {
            visible |= this.chipIcon.setVisible(z, z2);
        }
        if (showsCheckedIcon()) {
            visible |= this.checkedIcon.setVisible(z, z2);
        }
        if (showsCloseIcon()) {
            visible |= this.closeIcon.setVisible(z, z2);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public final boolean showsCheckedIcon() {
        return this.checkedIconVisible && this.checkedIcon != null && this.currentChecked;
    }

    public final boolean showsChipIcon() {
        return this.chipIconVisible && this.chipIcon != null;
    }

    public final boolean showsCloseIcon() {
        return this.closeIconVisible && this.closeIcon != null;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    public static boolean isStateful(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    public static boolean isStateful(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        if (this.isShapeThemingEnabled) {
            super.onStateChange(iArr);
        }
        return onStateChange(iArr, this.closeIconStateSet);
    }
}
