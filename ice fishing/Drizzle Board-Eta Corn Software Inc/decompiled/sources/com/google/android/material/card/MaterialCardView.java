package com.google.android.material.card;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.FrameLayout;
import defpackage.e70;
import defpackage.fn;
import defpackage.g80;
import defpackage.jr;
import defpackage.le0;
import defpackage.lr;
import defpackage.r3;
import defpackage.ra;
import defpackage.rr;
import defpackage.t60;
import defpackage.tr;
import defpackage.w30;
import defpackage.y00;
import defpackage.z90;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class MaterialCardView extends r3 implements Checkable, e70 {
    public final lr Qr9iLBAD;
    public boolean eVhOlqcC;
    public final boolean jb9XjC4I;
    public boolean k3x7lurq;
    public static final int[] ow5vqvCr = {R.attr.state_checkable};
    public static final int[] OnDfzHZD = {R.attr.state_checked};
    public static final int[] ygLcUYwZ = {com.kolosta.rejin.jilosa.R.attr.state_dragged};
    public static final int[] lDXGDhIF = {R.attr.state_hovered};

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(le0.nSmgoSB5(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.materialCardViewStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_CardView), attributeSet);
        z90 P7K7Inc8;
        this.eVhOlqcC = false;
        this.k3x7lurq = false;
        this.jb9XjC4I = true;
        TypedArray FySoLYna = fn.FySoLYna(getContext(), attributeSet, y00.OnDfzHZD, com.kolosta.rejin.jilosa.R.attr.materialCardViewStyle, com.kolosta.rejin.jilosa.R.style.Widget_MaterialComponents_CardView, new int[0]);
        lr lrVar = new lr(this, attributeSet);
        this.Qr9iLBAD = lrVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        tr trVar = lrVar.MdtA4re8;
        trVar.OxcuoDLp(cardBackgroundColor);
        lrVar.NCTxEWno.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        lrVar.ow5vqvCr();
        MaterialCardView materialCardView = lrVar.qoPGr6Ce;
        ColorStateList gjV1z5T1 = w30.gjV1z5T1(materialCardView.getContext(), FySoLYna, 11);
        lrVar.lDXGDhIF = gjV1z5T1;
        if (gjV1z5T1 == null) {
            lrVar.lDXGDhIF = ColorStateList.valueOf(-1);
        }
        lrVar.jb9XjC4I = FySoLYna.getDimensionPixelSize(12, 0);
        boolean z = FySoLYna.getBoolean(0, false);
        lrVar.Ey6iv0m0 = z;
        materialCardView.setLongClickable(z);
        lrVar.OnDfzHZD = w30.gjV1z5T1(materialCardView.getContext(), FySoLYna, 6);
        lrVar.b2ZJblxo(w30.DK9slbsy(materialCardView.getContext(), FySoLYna, 2));
        lrVar.b2ZJblxo = FySoLYna.getDimensionPixelSize(5, 0);
        lrVar.P7K7Inc8 = FySoLYna.getDimensionPixelSize(4, 0);
        lrVar.Qr9iLBAD = FySoLYna.getInteger(3, 8388661);
        ColorStateList gjV1z5T12 = w30.gjV1z5T1(materialCardView.getContext(), FySoLYna, 7);
        lrVar.ow5vqvCr = gjV1z5T12;
        if (gjV1z5T12 == null) {
            lrVar.ow5vqvCr = ColorStateList.valueOf(fn.ygLcUYwZ(materialCardView, com.kolosta.rejin.jilosa.R.attr.colorControlHighlight));
        }
        ColorStateList gjV1z5T13 = w30.gjV1z5T1(materialCardView.getContext(), FySoLYna, 1);
        gjV1z5T13 = gjV1z5T13 == null ? ColorStateList.valueOf(0) : gjV1z5T13;
        tr trVar2 = lrVar.wxUZMvaN;
        trVar2.OxcuoDLp(gjV1z5T13);
        RippleDrawable rippleDrawable = lrVar.sjUBp5pO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(lrVar.ow5vqvCr);
        }
        trVar.sjUBp5pO(materialCardView.getCardElevation());
        float f = lrVar.jb9XjC4I;
        ColorStateList colorStateList = lrVar.lDXGDhIF;
        trVar2.MdtA4re8.eVhOlqcC = f;
        trVar2.invalidateSelf();
        rr rrVar = trVar2.MdtA4re8;
        if (rrVar.wxUZMvaN != colorStateList) {
            rrVar.wxUZMvaN = colorStateList;
            trVar2.onStateChange(trVar2.getState());
        }
        materialCardView.setBackgroundInternal(lrVar.wxUZMvaN(trVar));
        Drawable MdtA4re8 = lrVar.eVhOlqcC() ? lrVar.MdtA4re8() : trVar2;
        lrVar.eVhOlqcC = MdtA4re8;
        materialCardView.setForeground(lrVar.wxUZMvaN(MdtA4re8));
        if (lrVar.VgvYg0wo == -1.0f && (P7K7Inc8 = z90.P7K7Inc8(materialCardView.getContext(), FySoLYna, 8)) != null) {
            g80 zCflySGU = w30.zCflySGU(materialCardView.getContext());
            trVar.lDXGDhIF(zCflySGU);
            trVar2.lDXGDhIF(zCflySGU);
            tr trVar3 = lrVar.amk52bBQ;
            if (trVar3 != null) {
                trVar3.lDXGDhIF(zCflySGU);
            }
            lrVar.Qr9iLBAD(P7K7Inc8);
        }
        FySoLYna.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.Qr9iLBAD.MdtA4re8.getBounds());
        return rectF;
    }

    public final void NCTxEWno() {
        lr lrVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (lrVar = this.Qr9iLBAD).sjUBp5pO) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        lrVar.sjUBp5pO.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        lrVar.sjUBp5pO.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // defpackage.r3
    public ColorStateList getCardBackgroundColor() {
        return this.Qr9iLBAD.MdtA4re8.MdtA4re8.MdtA4re8;
    }

    public ColorStateList getCardForegroundColor() {
        return this.Qr9iLBAD.wxUZMvaN.MdtA4re8.MdtA4re8;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.Qr9iLBAD.k3x7lurq;
    }

    public int getCheckedIconGravity() {
        return this.Qr9iLBAD.Qr9iLBAD;
    }

    public int getCheckedIconMargin() {
        return this.Qr9iLBAD.P7K7Inc8;
    }

    public int getCheckedIconSize() {
        return this.Qr9iLBAD.b2ZJblxo;
    }

    public ColorStateList getCheckedIconTint() {
        return this.Qr9iLBAD.OnDfzHZD;
    }

    @Override // defpackage.r3
    public int getContentPaddingBottom() {
        return this.Qr9iLBAD.NCTxEWno.bottom;
    }

    @Override // defpackage.r3
    public int getContentPaddingLeft() {
        return this.Qr9iLBAD.NCTxEWno.left;
    }

    @Override // defpackage.r3
    public int getContentPaddingRight() {
        return this.Qr9iLBAD.NCTxEWno.right;
    }

    @Override // defpackage.r3
    public int getContentPaddingTop() {
        return this.Qr9iLBAD.NCTxEWno.top;
    }

    public float getProgress() {
        return this.Qr9iLBAD.MdtA4re8.MdtA4re8.jb9XjC4I;
    }

    @Override // defpackage.r3
    public float getRadius() {
        return this.Qr9iLBAD.MdtA4re8.eVhOlqcC();
    }

    public ColorStateList getRippleColor() {
        return this.Qr9iLBAD.ow5vqvCr;
    }

    public t60 getShapeAppearanceModel() {
        return this.Qr9iLBAD.ygLcUYwZ.wxUZMvaN();
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.Qr9iLBAD.lDXGDhIF;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.Qr9iLBAD.lDXGDhIF;
    }

    public int getStrokeWidth() {
        return this.Qr9iLBAD.jb9XjC4I;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.eVhOlqcC;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lr lrVar = this.Qr9iLBAD;
        lrVar.k3x7lurq();
        le0.Xkz7p5xa(this, lrVar.MdtA4re8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 8);
        lr lrVar = this.Qr9iLBAD;
        if (lrVar != null && lrVar.Ey6iv0m0) {
            View.mergeDrawableStates(onCreateDrawableState, ow5vqvCr);
        }
        if (this.eVhOlqcC) {
            View.mergeDrawableStates(onCreateDrawableState, OnDfzHZD);
        }
        if (this.k3x7lurq) {
            View.mergeDrawableStates(onCreateDrawableState, ygLcUYwZ);
        }
        if (isDuplicateParentStateEnabled()) {
            if (isPressed()) {
                View.mergeDrawableStates(onCreateDrawableState, FrameLayout.PRESSED_STATE_SET);
            }
            if (isHovered()) {
                View.mergeDrawableStates(onCreateDrawableState, lDXGDhIF);
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
        accessibilityEvent.setChecked(this.eVhOlqcC);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        lr lrVar = this.Qr9iLBAD;
        accessibilityNodeInfo.setCheckable(lrVar != null && lrVar.Ey6iv0m0);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.eVhOlqcC);
    }

    @Override // defpackage.r3, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.Qr9iLBAD.VgvYg0wo(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.jb9XjC4I) {
            lr lrVar = this.Qr9iLBAD;
            if (!lrVar.KlHjfFWx) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                lrVar.KlHjfFWx = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // defpackage.r3
    public void setCardBackgroundColor(int i) {
        this.Qr9iLBAD.MdtA4re8.OxcuoDLp(ColorStateList.valueOf(i));
    }

    @Override // defpackage.r3
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        lr lrVar = this.Qr9iLBAD;
        lrVar.MdtA4re8.sjUBp5pO(lrVar.qoPGr6Ce.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        tr trVar = this.Qr9iLBAD.wxUZMvaN;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        trVar.OxcuoDLp(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.Qr9iLBAD.Ey6iv0m0 = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.eVhOlqcC != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.Qr9iLBAD.b2ZJblxo(drawable);
    }

    public void setCheckedIconGravity(int i) {
        lr lrVar = this.Qr9iLBAD;
        if (lrVar.Qr9iLBAD != i) {
            lrVar.Qr9iLBAD = i;
            MaterialCardView materialCardView = lrVar.qoPGr6Ce;
            lrVar.VgvYg0wo(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.Qr9iLBAD.P7K7Inc8 = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.Qr9iLBAD.P7K7Inc8 = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.Qr9iLBAD.b2ZJblxo(ra.Ey6iv0m0(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.Qr9iLBAD.b2ZJblxo = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.Qr9iLBAD.b2ZJblxo = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        lr lrVar = this.Qr9iLBAD;
        lrVar.OnDfzHZD = colorStateList;
        Drawable drawable = lrVar.k3x7lurq;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        lr lrVar = this.Qr9iLBAD;
        if (lrVar != null) {
            lrVar.k3x7lurq();
        }
    }

    public void setDragged(boolean z) {
        if (this.k3x7lurq != z) {
            this.k3x7lurq = z;
            refreshDrawableState();
            NCTxEWno();
            invalidate();
        }
    }

    @Override // defpackage.r3
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.Qr9iLBAD.OnDfzHZD();
    }

    @Override // defpackage.r3
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        lr lrVar = this.Qr9iLBAD;
        lrVar.OnDfzHZD();
        lrVar.ow5vqvCr();
    }

    public void setProgress(float f) {
        lr lrVar = this.Qr9iLBAD;
        lrVar.MdtA4re8.amk52bBQ(f);
        tr trVar = lrVar.wxUZMvaN;
        if (trVar != null) {
            trVar.amk52bBQ(f);
        }
        tr trVar2 = lrVar.amk52bBQ;
        if (trVar2 != null) {
            trVar2.amk52bBQ(f);
        }
    }

    @Override // defpackage.r3
    public void setRadius(float f) {
        super.setRadius(f);
        lr lrVar = this.Qr9iLBAD;
        lrVar.VgvYg0wo = f;
        lrVar.Qr9iLBAD(lrVar.ygLcUYwZ.wxUZMvaN().qoPGr6Ce(f));
        lrVar.eVhOlqcC.invalidateSelf();
        if (lrVar.jb9XjC4I() || (lrVar.qoPGr6Ce.getPreventCornerOverlap() && !lrVar.MdtA4re8.ygLcUYwZ())) {
            lrVar.ow5vqvCr();
        }
        if (lrVar.jb9XjC4I()) {
            lrVar.OnDfzHZD();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        lr lrVar = this.Qr9iLBAD;
        lrVar.ow5vqvCr = colorStateList;
        RippleDrawable rippleDrawable = lrVar.sjUBp5pO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList RXQxj5Oe = w30.RXQxj5Oe(getContext(), i);
        lr lrVar = this.Qr9iLBAD;
        lrVar.ow5vqvCr = RXQxj5Oe;
        RippleDrawable rippleDrawable = lrVar.sjUBp5pO;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(RXQxj5Oe);
        }
    }

    @Override // defpackage.e70
    public void setShapeAppearanceModel(t60 t60Var) {
        setClipToOutline(t60Var.jb9XjC4I(getBoundsAsRectF()));
        this.Qr9iLBAD.Qr9iLBAD(t60Var);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        lr lrVar = this.Qr9iLBAD;
        if (lrVar.lDXGDhIF != colorStateList) {
            lrVar.lDXGDhIF = colorStateList;
            tr trVar = lrVar.wxUZMvaN;
            trVar.MdtA4re8.eVhOlqcC = lrVar.jb9XjC4I;
            trVar.invalidateSelf();
            rr rrVar = trVar.MdtA4re8;
            if (rrVar.wxUZMvaN != colorStateList) {
                rrVar.wxUZMvaN = colorStateList;
                trVar.onStateChange(trVar.getState());
            }
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        lr lrVar = this.Qr9iLBAD;
        if (i != lrVar.jb9XjC4I) {
            lrVar.jb9XjC4I = i;
            tr trVar = lrVar.wxUZMvaN;
            ColorStateList colorStateList = lrVar.lDXGDhIF;
            trVar.MdtA4re8.eVhOlqcC = i;
            trVar.invalidateSelf();
            rr rrVar = trVar.MdtA4re8;
            if (rrVar.wxUZMvaN != colorStateList) {
                rrVar.wxUZMvaN = colorStateList;
                trVar.onStateChange(trVar.getState());
            }
        }
        invalidate();
    }

    @Override // defpackage.r3
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        lr lrVar = this.Qr9iLBAD;
        lrVar.OnDfzHZD();
        lrVar.ow5vqvCr();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        lr lrVar = this.Qr9iLBAD;
        if (lrVar != null && lrVar.Ey6iv0m0 && isEnabled()) {
            this.eVhOlqcC = !this.eVhOlqcC;
            refreshDrawableState();
            NCTxEWno();
            lrVar.P7K7Inc8(this.eVhOlqcC, true);
        }
    }

    @Override // defpackage.r3
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.Qr9iLBAD.MdtA4re8.OxcuoDLp(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(jr jrVar) {
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
