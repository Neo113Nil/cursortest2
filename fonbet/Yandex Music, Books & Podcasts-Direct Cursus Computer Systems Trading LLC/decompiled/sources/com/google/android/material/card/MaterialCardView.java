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
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import com.google.android.material.shape.a;
import defpackage.bcx;
import defpackage.bdh;
import defpackage.bg3;
import defpackage.ddh;
import defpackage.etn;
import defpackage.eup;
import defpackage.fvp;
import defpackage.ivf;
import defpackage.qgg;
import defpackage.rvf;
import defpackage.vdn;
import defpackage.y2x;

/* loaded from: classes3.dex */
public class MaterialCardView extends CardView implements Checkable, fvp {
    public static final int[] k = {R.attr.state_checkable};
    public static final int[] l = {R.attr.state_checked};
    public static final int[] m = {ru.yandex.music.R.attr.state_dragged};
    public final ddh g;
    public final boolean h;
    public boolean i;
    public boolean j;

    public MaterialCardView(Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_CardView), attributeSet, i);
        this.i = false;
        this.j = false;
        this.h = true;
        TypedArray B = bcx.B(getContext(), attributeSet, vdn.B, i, ru.yandex.music.R.style.Widget_MaterialComponents_CardView, new int[0]);
        ddh ddhVar = new ddh(this, attributeSet, i);
        this.g = ddhVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        a aVar = ddhVar.c;
        aVar.r(cardBackgroundColor);
        ddhVar.b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        ddhVar.l();
        MaterialCardView materialCardView = ddhVar.a;
        ColorStateList D = ivf.D(materialCardView.getContext(), B, 11);
        ddhVar.n = D;
        if (D == null) {
            ddhVar.n = ColorStateList.valueOf(-1);
        }
        ddhVar.h = B.getDimensionPixelSize(12, 0);
        boolean z = B.getBoolean(0, false);
        ddhVar.s = z;
        materialCardView.setLongClickable(z);
        ddhVar.l = ivf.D(materialCardView.getContext(), B, 6);
        ddhVar.g(ivf.F(materialCardView.getContext(), B, 2));
        ddhVar.f = B.getDimensionPixelSize(5, 0);
        ddhVar.e = B.getDimensionPixelSize(4, 0);
        ddhVar.g = B.getInteger(3, 8388661);
        ColorStateList D2 = ivf.D(materialCardView.getContext(), B, 7);
        ddhVar.k = D2;
        if (D2 == null) {
            ddhVar.k = ColorStateList.valueOf(qgg.N(ru.yandex.music.R.attr.colorControlHighlight, materialCardView));
        }
        ColorStateList D3 = ivf.D(materialCardView.getContext(), B, 1);
        D3 = D3 == null ? ColorStateList.valueOf(0) : D3;
        a aVar2 = ddhVar.d;
        aVar2.r(D3);
        RippleDrawable rippleDrawable = ddhVar.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(ddhVar.k);
        }
        aVar.q(materialCardView.getCardElevation());
        float f = ddhVar.h;
        ColorStateList colorStateList = ddhVar.n;
        aVar2.b.k = f;
        aVar2.invalidateSelf();
        aVar2.x(colorStateList);
        materialCardView.setBackgroundInternal(ddhVar.d(aVar));
        Drawable c = ddhVar.j() ? ddhVar.c() : aVar2;
        ddhVar.i = c;
        materialCardView.setForeground(ddhVar.d(c));
        B.recycle();
    }

    @NonNull
    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.g.c.getBounds());
        return rectF;
    }

    @Override // androidx.cardview.widget.CardView
    public final void f(int i, int i2, int i3, int i4) {
        ddh ddhVar = this.g;
        ddhVar.b.set(i, i2, i3, i4);
        ddhVar.l();
    }

    public final void g() {
        ddh ddhVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (ddhVar = this.g).o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        ddhVar.o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        ddhVar.o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // androidx.cardview.widget.CardView
    @NonNull
    public ColorStateList getCardBackgroundColor() {
        return this.g.c.b.d;
    }

    @NonNull
    public ColorStateList getCardForegroundColor() {
        return this.g.d.b.d;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.g.j;
    }

    public int getCheckedIconGravity() {
        return this.g.g;
    }

    public int getCheckedIconMargin() {
        return this.g.e;
    }

    public int getCheckedIconSize() {
        return this.g.f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.g.l;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingBottom() {
        return this.g.b.bottom;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingLeft() {
        return this.g.b.left;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingRight() {
        return this.g.b.right;
    }

    @Override // androidx.cardview.widget.CardView
    public int getContentPaddingTop() {
        return this.g.b.top;
    }

    public float getProgress() {
        return this.g.c.b.j;
    }

    @Override // androidx.cardview.widget.CardView
    public float getRadius() {
        return this.g.c.l();
    }

    public ColorStateList getRippleColor() {
        return this.g.k;
    }

    @NonNull
    public eup getShapeAppearanceModel() {
        return this.g.m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.g.n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.g.n;
    }

    public int getStrokeWidth() {
        return this.g.h;
    }

    public final void h(int i, int i2, int i3, int i4) {
        super.f(i, i2, i3, i4);
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.i;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ddh ddhVar = this.g;
        ddhVar.k();
        rvf.K(this, ddhVar.c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        ddh ddhVar = this.g;
        if (ddhVar != null && ddhVar.s) {
            View.mergeDrawableStates(onCreateDrawableState, k);
        }
        if (this.i) {
            View.mergeDrawableStates(onCreateDrawableState, l);
        }
        if (this.j) {
            View.mergeDrawableStates(onCreateDrawableState, m);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.i);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        ddh ddhVar = this.g;
        accessibilityNodeInfo.setCheckable(ddhVar != null && ddhVar.s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.i);
    }

    @Override // androidx.cardview.widget.CardView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.g.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.h) {
            ddh ddhVar = this.g;
            if (!ddhVar.r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                ddhVar.r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(int i) {
        this.g.c.r(ColorStateList.valueOf(i));
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardElevation(float f) {
        super.setCardElevation(f);
        ddh ddhVar = this.g;
        ddhVar.c.q(ddhVar.a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        a aVar = this.g.d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        aVar.r(colorStateList);
    }

    public void setCheckable(boolean z) {
        this.g.s = z;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.i != z) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.g.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        ddh ddhVar = this.g;
        if (ddhVar.g != i) {
            ddhVar.g = i;
            MaterialCardView materialCardView = ddhVar.a;
            ddhVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.g.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.g.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.g.g(y2x.w(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.g.f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.g.f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        ddh ddhVar = this.g;
        ddhVar.l = colorStateList;
        Drawable drawable = ddhVar.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z) {
        super.setClickable(z);
        ddh ddhVar = this.g;
        if (ddhVar != null) {
            ddhVar.k();
        }
    }

    public void setDragged(boolean z) {
        if (this.j != z) {
            this.j = z;
            refreshDrawableState();
            g();
            invalidate();
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setMaxCardElevation(float f) {
        super.setMaxCardElevation(f);
        this.g.m();
    }

    @Override // androidx.cardview.widget.CardView
    public void setPreventCornerOverlap(boolean z) {
        super.setPreventCornerOverlap(z);
        ddh ddhVar = this.g;
        ddhVar.m();
        ddhVar.l();
    }

    public void setProgress(float f) {
        ddh ddhVar = this.g;
        ddhVar.c.s(f);
        a aVar = ddhVar.d;
        if (aVar != null) {
            aVar.s(f);
        }
        a aVar2 = ddhVar.q;
        if (aVar2 != null) {
            aVar2.s(f);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setRadius(float f) {
        super.setRadius(f);
        ddh ddhVar = this.g;
        ddhVar.h(ddhVar.m.i(f));
        ddhVar.i.invalidateSelf();
        if (ddhVar.i() || (ddhVar.a.getPreventCornerOverlap() && !ddhVar.c.o())) {
            ddhVar.l();
        }
        if (ddhVar.i()) {
            ddhVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        ddh ddhVar = this.g;
        ddhVar.k = colorStateList;
        RippleDrawable rippleDrawable = ddhVar.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList E = etn.E(getContext(), i);
        ddh ddhVar = this.g;
        ddhVar.k = E;
        RippleDrawable rippleDrawable = ddhVar.o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(E);
        }
    }

    @Override // defpackage.fvp
    public void setShapeAppearanceModel(@NonNull eup eupVar) {
        setClipToOutline(eupVar.g(getBoundsAsRectF()));
        this.g.h(eupVar);
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        ddh ddhVar = this.g;
        if (ddhVar.n != colorStateList) {
            ddhVar.n = colorStateList;
            a aVar = ddhVar.d;
            aVar.b.k = ddhVar.h;
            aVar.invalidateSelf();
            aVar.x(colorStateList);
        }
        invalidate();
    }

    public void setStrokeWidth(int i) {
        ddh ddhVar = this.g;
        if (i != ddhVar.h) {
            ddhVar.h = i;
            a aVar = ddhVar.d;
            ColorStateList colorStateList = ddhVar.n;
            aVar.b.k = i;
            aVar.invalidateSelf();
            aVar.x(colorStateList);
        }
        invalidate();
    }

    @Override // androidx.cardview.widget.CardView
    public void setUseCompatPadding(boolean z) {
        super.setUseCompatPadding(z);
        ddh ddhVar = this.g;
        ddhVar.m();
        ddhVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        ddh ddhVar = this.g;
        if (ddhVar != null && ddhVar.s && isEnabled()) {
            this.i = !this.i;
            refreshDrawableState();
            g();
            ddhVar.f(this.i, true);
        }
    }

    @Override // androidx.cardview.widget.CardView
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.g.c.r(colorStateList);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setOnCheckedChangeListener(bdh bdhVar) {
    }

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.materialCardViewStyle);
    }

    public MaterialCardView(Context context) {
        this(context, null);
    }
}
