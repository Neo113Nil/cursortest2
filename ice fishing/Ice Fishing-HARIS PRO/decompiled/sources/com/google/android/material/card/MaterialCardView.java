package com.google.android.material.card;

import D0.d;
import L0.m;
import R.j;
import S0.f;
import S0.g;
import S0.k;
import S0.v;
import X0.a;
import a.AbstractC0078a;
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
import q.AbstractC0330a;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public class MaterialCardView extends AbstractC0330a implements Checkable, v {

    /* renamed from: l, reason: collision with root package name */
    public static final int[] f2440l = {R.attr.state_checkable};

    /* renamed from: m, reason: collision with root package name */
    public static final int[] f2441m = {R.attr.state_checked};

    /* renamed from: n, reason: collision with root package name */
    public static final int[] f2442n = {com.lumenpath.harispro.hrnavigator.R.attr.state_dragged};

    /* renamed from: h, reason: collision with root package name */
    public final d f2443h;
    public final boolean i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2444k;

    public MaterialCardView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.materialCardViewStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_CardView), attributeSet);
        this.j = false;
        this.f2444k = false;
        this.i = true;
        TypedArray g2 = m.g(getContext(), attributeSet, AbstractC0358a.f4452q, com.lumenpath.harispro.hrnavigator.R.attr.materialCardViewStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_CardView, new int[0]);
        d dVar = new d(this, attributeSet);
        this.f2443h = dVar;
        ColorStateList cardBackgroundColor = super.getCardBackgroundColor();
        g gVar = dVar.f130c;
        gVar.m(cardBackgroundColor);
        dVar.f129b.set(super.getContentPaddingLeft(), super.getContentPaddingTop(), super.getContentPaddingRight(), super.getContentPaddingBottom());
        dVar.l();
        MaterialCardView materialCardView = dVar.f128a;
        ColorStateList B2 = AbstractC0078a.B(materialCardView.getContext(), g2, 11);
        dVar.f138n = B2;
        if (B2 == null) {
            dVar.f138n = ColorStateList.valueOf(-1);
        }
        dVar.f134h = g2.getDimensionPixelSize(12, 0);
        boolean z2 = g2.getBoolean(0, false);
        dVar.f143s = z2;
        materialCardView.setLongClickable(z2);
        dVar.f136l = AbstractC0078a.B(materialCardView.getContext(), g2, 6);
        dVar.g(AbstractC0078a.E(materialCardView.getContext(), g2, 2));
        dVar.f132f = g2.getDimensionPixelSize(5, 0);
        dVar.e = g2.getDimensionPixelSize(4, 0);
        dVar.f133g = g2.getInteger(3, 8388661);
        ColorStateList B3 = AbstractC0078a.B(materialCardView.getContext(), g2, 7);
        dVar.f135k = B3;
        if (B3 == null) {
            dVar.f135k = ColorStateList.valueOf(AbstractC0078a.y(materialCardView, com.lumenpath.harispro.hrnavigator.R.attr.colorControlHighlight));
        }
        ColorStateList B4 = AbstractC0078a.B(materialCardView.getContext(), g2, 1);
        g gVar2 = dVar.f131d;
        gVar2.m(B4 == null ? ColorStateList.valueOf(0) : B4);
        int[] iArr = Q0.a.f928a;
        RippleDrawable rippleDrawable = dVar.f139o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(dVar.f135k);
        }
        gVar.l(materialCardView.getCardElevation());
        float f2 = dVar.f134h;
        ColorStateList colorStateList = dVar.f138n;
        gVar2.f1076a.j = f2;
        gVar2.invalidateSelf();
        f fVar = gVar2.f1076a;
        if (fVar.f1065d != colorStateList) {
            fVar.f1065d = colorStateList;
            gVar2.onStateChange(gVar2.getState());
        }
        materialCardView.setBackgroundInternal(dVar.d(gVar));
        Drawable c2 = dVar.j() ? dVar.c() : gVar2;
        dVar.i = c2;
        materialCardView.setForeground(dVar.d(c2));
        g2.recycle();
    }

    private RectF getBoundsAsRectF() {
        RectF rectF = new RectF();
        rectF.set(this.f2443h.f130c.getBounds());
        return rectF;
    }

    public final void b() {
        d dVar;
        RippleDrawable rippleDrawable;
        if (Build.VERSION.SDK_INT <= 26 || (rippleDrawable = (dVar = this.f2443h).f139o) == null) {
            return;
        }
        Rect bounds = rippleDrawable.getBounds();
        int i = bounds.bottom;
        dVar.f139o.setBounds(bounds.left, bounds.top, bounds.right, i - 1);
        dVar.f139o.setBounds(bounds.left, bounds.top, bounds.right, i);
    }

    @Override // q.AbstractC0330a
    public ColorStateList getCardBackgroundColor() {
        return this.f2443h.f130c.f1076a.f1064c;
    }

    public ColorStateList getCardForegroundColor() {
        return this.f2443h.f131d.f1076a.f1064c;
    }

    public float getCardViewRadius() {
        return super.getRadius();
    }

    public Drawable getCheckedIcon() {
        return this.f2443h.j;
    }

    public int getCheckedIconGravity() {
        return this.f2443h.f133g;
    }

    public int getCheckedIconMargin() {
        return this.f2443h.e;
    }

    public int getCheckedIconSize() {
        return this.f2443h.f132f;
    }

    public ColorStateList getCheckedIconTint() {
        return this.f2443h.f136l;
    }

    @Override // q.AbstractC0330a
    public int getContentPaddingBottom() {
        return this.f2443h.f129b.bottom;
    }

    @Override // q.AbstractC0330a
    public int getContentPaddingLeft() {
        return this.f2443h.f129b.left;
    }

    @Override // q.AbstractC0330a
    public int getContentPaddingRight() {
        return this.f2443h.f129b.right;
    }

    @Override // q.AbstractC0330a
    public int getContentPaddingTop() {
        return this.f2443h.f129b.top;
    }

    public float getProgress() {
        return this.f2443h.f130c.f1076a.i;
    }

    @Override // q.AbstractC0330a
    public float getRadius() {
        return this.f2443h.f130c.h();
    }

    public ColorStateList getRippleColor() {
        return this.f2443h.f135k;
    }

    public k getShapeAppearanceModel() {
        return this.f2443h.f137m;
    }

    @Deprecated
    public int getStrokeColor() {
        ColorStateList colorStateList = this.f2443h.f138n;
        if (colorStateList == null) {
            return -1;
        }
        return colorStateList.getDefaultColor();
    }

    public ColorStateList getStrokeColorStateList() {
        return this.f2443h.f138n;
    }

    public int getStrokeWidth() {
        return this.f2443h.f134h;
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.j;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d dVar = this.f2443h;
        dVar.k();
        j.o0(this, dVar.f130c);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 3);
        d dVar = this.f2443h;
        if (dVar != null && dVar.f143s) {
            View.mergeDrawableStates(onCreateDrawableState, f2440l);
        }
        if (this.j) {
            View.mergeDrawableStates(onCreateDrawableState, f2441m);
        }
        if (this.f2444k) {
            View.mergeDrawableStates(onCreateDrawableState, f2442n);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.cardview.widget.CardView");
        accessibilityEvent.setChecked(this.j);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.cardview.widget.CardView");
        d dVar = this.f2443h;
        accessibilityNodeInfo.setCheckable(dVar != null && dVar.f143s);
        accessibilityNodeInfo.setClickable(isClickable());
        accessibilityNodeInfo.setChecked(this.j);
    }

    @Override // q.AbstractC0330a, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f2443h.e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (this.i) {
            d dVar = this.f2443h;
            if (!dVar.f142r) {
                Log.i("MaterialCardView", "Setting a custom background is not supported.");
                dVar.f142r = true;
            }
            super.setBackgroundDrawable(drawable);
        }
    }

    public void setBackgroundInternal(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    @Override // q.AbstractC0330a
    public void setCardBackgroundColor(ColorStateList colorStateList) {
        this.f2443h.f130c.m(colorStateList);
    }

    @Override // q.AbstractC0330a
    public void setCardElevation(float f2) {
        super.setCardElevation(f2);
        d dVar = this.f2443h;
        dVar.f130c.l(dVar.f128a.getCardElevation());
    }

    public void setCardForegroundColor(ColorStateList colorStateList) {
        g gVar = this.f2443h.f131d;
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        gVar.m(colorStateList);
    }

    public void setCheckable(boolean z2) {
        this.f2443h.f143s = z2;
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (this.j != z2) {
            toggle();
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        this.f2443h.g(drawable);
    }

    public void setCheckedIconGravity(int i) {
        d dVar = this.f2443h;
        if (dVar.f133g != i) {
            dVar.f133g = i;
            MaterialCardView materialCardView = dVar.f128a;
            dVar.e(materialCardView.getMeasuredWidth(), materialCardView.getMeasuredHeight());
        }
    }

    public void setCheckedIconMargin(int i) {
        this.f2443h.e = i;
    }

    public void setCheckedIconMarginResource(int i) {
        if (i != -1) {
            this.f2443h.e = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconResource(int i) {
        this.f2443h.g(h0.f.n(getContext(), i));
    }

    public void setCheckedIconSize(int i) {
        this.f2443h.f132f = i;
    }

    public void setCheckedIconSizeResource(int i) {
        if (i != 0) {
            this.f2443h.f132f = getResources().getDimensionPixelSize(i);
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        d dVar = this.f2443h;
        dVar.f136l = colorStateList;
        Drawable drawable = dVar.j;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
    }

    @Override // android.view.View
    public void setClickable(boolean z2) {
        super.setClickable(z2);
        d dVar = this.f2443h;
        if (dVar != null) {
            dVar.k();
        }
    }

    public void setDragged(boolean z2) {
        if (this.f2444k != z2) {
            this.f2444k = z2;
            refreshDrawableState();
            b();
            invalidate();
        }
    }

    @Override // q.AbstractC0330a
    public void setMaxCardElevation(float f2) {
        super.setMaxCardElevation(f2);
        this.f2443h.m();
    }

    public void setOnCheckedChangeListener(D0.a aVar) {
    }

    @Override // q.AbstractC0330a
    public void setPreventCornerOverlap(boolean z2) {
        super.setPreventCornerOverlap(z2);
        d dVar = this.f2443h;
        dVar.m();
        dVar.l();
    }

    public void setProgress(float f2) {
        d dVar = this.f2443h;
        dVar.f130c.n(f2);
        g gVar = dVar.f131d;
        if (gVar != null) {
            gVar.n(f2);
        }
        g gVar2 = dVar.f141q;
        if (gVar2 != null) {
            gVar2.n(f2);
        }
    }

    @Override // q.AbstractC0330a
    public void setRadius(float f2) {
        super.setRadius(f2);
        d dVar = this.f2443h;
        S0.j e = dVar.f137m.e();
        e.e = new S0.a(f2);
        e.f1100f = new S0.a(f2);
        e.f1101g = new S0.a(f2);
        e.f1102h = new S0.a(f2);
        dVar.h(e.a());
        dVar.i.invalidateSelf();
        if (dVar.i() || (dVar.f128a.getPreventCornerOverlap() && !dVar.f130c.k())) {
            dVar.l();
        }
        if (dVar.i()) {
            dVar.m();
        }
    }

    public void setRippleColor(ColorStateList colorStateList) {
        d dVar = this.f2443h;
        dVar.f135k = colorStateList;
        int[] iArr = Q0.a.f928a;
        RippleDrawable rippleDrawable = dVar.f139o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(colorStateList);
        }
    }

    public void setRippleColorResource(int i) {
        ColorStateList z2 = AbstractC0078a.z(getContext(), i);
        d dVar = this.f2443h;
        dVar.f135k = z2;
        int[] iArr = Q0.a.f928a;
        RippleDrawable rippleDrawable = dVar.f139o;
        if (rippleDrawable != null) {
            rippleDrawable.setColor(z2);
        }
    }

    @Override // S0.v
    public void setShapeAppearanceModel(k kVar) {
        setClipToOutline(kVar.d(getBoundsAsRectF()));
        this.f2443h.h(kVar);
    }

    public void setStrokeColor(int i) {
        setStrokeColor(ColorStateList.valueOf(i));
    }

    public void setStrokeWidth(int i) {
        d dVar = this.f2443h;
        if (i != dVar.f134h) {
            dVar.f134h = i;
            g gVar = dVar.f131d;
            ColorStateList colorStateList = dVar.f138n;
            gVar.f1076a.j = i;
            gVar.invalidateSelf();
            f fVar = gVar.f1076a;
            if (fVar.f1065d != colorStateList) {
                fVar.f1065d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    @Override // q.AbstractC0330a
    public void setUseCompatPadding(boolean z2) {
        super.setUseCompatPadding(z2);
        d dVar = this.f2443h;
        dVar.m();
        dVar.l();
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        d dVar = this.f2443h;
        if (dVar != null && dVar.f143s && isEnabled()) {
            this.j = !this.j;
            refreshDrawableState();
            b();
            dVar.f(this.j, true);
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        d dVar = this.f2443h;
        if (dVar.f138n != colorStateList) {
            dVar.f138n = colorStateList;
            g gVar = dVar.f131d;
            gVar.f1076a.j = dVar.f134h;
            gVar.invalidateSelf();
            f fVar = gVar.f1076a;
            if (fVar.f1065d != colorStateList) {
                fVar.f1065d = colorStateList;
                gVar.onStateChange(gVar.getState());
            }
        }
        invalidate();
    }

    @Override // q.AbstractC0330a
    public void setCardBackgroundColor(int i) {
        this.f2443h.f130c.m(ColorStateList.valueOf(i));
    }
}
