package com.google.android.material.button;

import D.y;
import E.e;
import E3.j;
import E3.v;
import J3.a;
import L3.F;
import O.X;
import O3.b;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Parcelable;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import com.bumptech.glide.g;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import g1.C4523c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import m.C4705p;
import q3.C4922b;
import q3.C4923c;
import q3.InterfaceC4921a;
import y3.k;

/* loaded from: classes2.dex */
public class MaterialButton extends C4705p implements Checkable, v {

    /* renamed from: K, reason: collision with root package name */
    public static final int[] f35883K = {R.attr.state_checkable};

    /* renamed from: L, reason: collision with root package name */
    public static final int[] f35884L = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f35885A;

    /* renamed from: B, reason: collision with root package name */
    public Drawable f35886B;

    /* renamed from: C, reason: collision with root package name */
    public String f35887C;

    /* renamed from: D, reason: collision with root package name */
    public int f35888D;

    /* renamed from: E, reason: collision with root package name */
    public int f35889E;

    /* renamed from: F, reason: collision with root package name */
    public int f35890F;

    /* renamed from: G, reason: collision with root package name */
    public int f35891G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f35892H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f35893I;
    public int J;

    /* renamed from: w, reason: collision with root package name */
    public final C4923c f35894w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f35895x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC4921a f35896y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuff.Mode f35897z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5275R.attr.materialButtonStyle, C5275R.style.Widget_MaterialComponents_Button), attributeSet, C5275R.attr.materialButtonStyle);
        this.f35895x = new LinkedHashSet();
        this.f35892H = false;
        this.f35893I = false;
        Context context2 = getContext();
        TypedArray f3 = k.f(context2, attributeSet, AbstractC4632a.f38637j, C5275R.attr.materialButtonStyle, C5275R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f35891G = f3.getDimensionPixelSize(12, 0);
        int i = f3.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f35897z = k.g(i, mode);
        this.f35885A = b.m(getContext(), f3, 14);
        this.f35886B = b.o(getContext(), f3, 10);
        this.J = f3.getInteger(11, 1);
        this.f35888D = f3.getDimensionPixelSize(13, 0);
        C4923c c4923c = new C4923c(this, E3.k.b(context2, attributeSet, C5275R.attr.materialButtonStyle, C5275R.style.Widget_MaterialComponents_Button).a());
        this.f35894w = c4923c;
        c4923c.f40221c = f3.getDimensionPixelOffset(1, 0);
        c4923c.f40222d = f3.getDimensionPixelOffset(2, 0);
        c4923c.f40223e = f3.getDimensionPixelOffset(3, 0);
        c4923c.f40224f = f3.getDimensionPixelOffset(4, 0);
        if (f3.hasValue(8)) {
            int dimensionPixelSize = f3.getDimensionPixelSize(8, -1);
            c4923c.f40225g = dimensionPixelSize;
            float f9 = dimensionPixelSize;
            j e9 = c4923c.f40220b.e();
            e9.f778e = new E3.a(f9);
            e9.f779f = new E3.a(f9);
            e9.f780g = new E3.a(f9);
            e9.f781h = new E3.a(f9);
            c4923c.c(e9.a());
            c4923c.f40233p = true;
        }
        c4923c.f40226h = f3.getDimensionPixelSize(20, 0);
        c4923c.i = k.g(f3.getInt(7, -1), mode);
        c4923c.f40227j = b.m(getContext(), f3, 6);
        c4923c.f40228k = b.m(getContext(), f3, 19);
        c4923c.f40229l = b.m(getContext(), f3, 16);
        c4923c.f40234q = f3.getBoolean(5, false);
        c4923c.f40237t = f3.getDimensionPixelSize(9, 0);
        c4923c.f40235r = f3.getBoolean(21, true);
        WeakHashMap weakHashMap = X.f2054a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f3.hasValue(0)) {
            c4923c.f40232o = true;
            setSupportBackgroundTintList(c4923c.f40227j);
            setSupportBackgroundTintMode(c4923c.i);
        } else {
            c4923c.e();
        }
        setPaddingRelative(paddingStart + c4923c.f40221c, paddingTop + c4923c.f40223e, paddingEnd + c4923c.f40222d, paddingBottom + c4923c.f40224f);
        f3.recycle();
        setCompoundDrawablePadding(this.f35891G);
        c(this.f35886B != null);
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getTextHeight() {
        if (getLineCount() > 1) {
            return getLayout().getHeight();
        }
        TextPaint paint = getPaint();
        String charSequence = getText().toString();
        if (getTransformationMethod() != null) {
            charSequence = getTransformationMethod().getTransformation(charSequence, this).toString();
        }
        Rect rect = new Rect();
        paint.getTextBounds(charSequence, 0, charSequence.length(), rect);
        return Math.min(rect.height(), getLayout().getHeight());
    }

    private int getTextLayoutWidth() {
        int lineCount = getLineCount();
        float f3 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f3 = Math.max(f3, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f3);
    }

    public final boolean a() {
        C4923c c4923c = this.f35894w;
        return (c4923c == null || c4923c.f40232o) ? false : true;
    }

    public final void b() {
        int i = this.J;
        boolean z3 = true;
        if (i != 1 && i != 2) {
            z3 = false;
        }
        if (z3) {
            setCompoundDrawablesRelative(this.f35886B, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f35886B, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f35886B, null, null);
        }
    }

    public final void c(boolean z3) {
        Drawable drawable = this.f35886B;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f35886B = mutate;
            H.a.h(mutate, this.f35885A);
            PorterDuff.Mode mode = this.f35897z;
            if (mode != null) {
                H.a.i(this.f35886B, mode);
            }
            int i = this.f35888D;
            if (i == 0) {
                i = this.f35886B.getIntrinsicWidth();
            }
            int i6 = this.f35888D;
            if (i6 == 0) {
                i6 = this.f35886B.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f35886B;
            int i9 = this.f35889E;
            int i10 = this.f35890F;
            drawable2.setBounds(i9, i10, i + i9, i6 + i10);
            this.f35886B.setVisible(true, z3);
        }
        if (z3) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i11 = this.J;
        if (((i11 == 1 || i11 == 2) && drawable3 != this.f35886B) || (((i11 == 3 || i11 == 4) && drawable5 != this.f35886B) || ((i11 == 16 || i11 == 32) && drawable4 != this.f35886B))) {
            b();
        }
    }

    public final void d(int i, int i6) {
        if (this.f35886B == null || getLayout() == null) {
            return;
        }
        int i9 = this.J;
        if (!(i9 == 1 || i9 == 2) && i9 != 3 && i9 != 4) {
            if (i9 == 16 || i9 == 32) {
                this.f35889E = 0;
                if (i9 == 16) {
                    this.f35890F = 0;
                    c(false);
                    return;
                }
                int i10 = this.f35888D;
                if (i10 == 0) {
                    i10 = this.f35886B.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i6 - getTextHeight()) - getPaddingTop()) - i10) - this.f35891G) - getPaddingBottom()) / 2);
                if (this.f35890F != max) {
                    this.f35890F = max;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f35890F = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i11 = this.J;
        if (i11 == 1 || i11 == 3 || ((i11 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i11 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f35889E = 0;
            c(false);
            return;
        }
        int i12 = this.f35888D;
        if (i12 == 0) {
            i12 = this.f35886B.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = X.f2054a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i12) - this.f35891G) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.J == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f35889E != paddingEnd) {
            this.f35889E = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f35887C)) {
            return this.f35887C;
        }
        C4923c c4923c = this.f35894w;
        return ((c4923c == null || !c4923c.f40234q) ? Button.class : CompoundButton.class).getName();
    }

    @Override // android.view.View
    public ColorStateList getBackgroundTintList() {
        return getSupportBackgroundTintList();
    }

    @Override // android.view.View
    public PorterDuff.Mode getBackgroundTintMode() {
        return getSupportBackgroundTintMode();
    }

    public int getCornerRadius() {
        if (a()) {
            return this.f35894w.f40225g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f35886B;
    }

    public int getIconGravity() {
        return this.J;
    }

    public int getIconPadding() {
        return this.f35891G;
    }

    public int getIconSize() {
        return this.f35888D;
    }

    public ColorStateList getIconTint() {
        return this.f35885A;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f35897z;
    }

    public int getInsetBottom() {
        return this.f35894w.f40224f;
    }

    public int getInsetTop() {
        return this.f35894w.f40223e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f35894w.f40229l;
        }
        return null;
    }

    public E3.k getShapeAppearanceModel() {
        if (a()) {
            return this.f35894w.f40220b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f35894w.f40228k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f35894w.f40226h;
        }
        return 0;
    }

    @Override // m.C4705p
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f35894w.f40227j : super.getSupportBackgroundTintList();
    }

    @Override // m.C4705p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f35894w.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f35892H;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            F.s(this, this.f35894w.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C4923c c4923c = this.f35894w;
        if (c4923c != null && c4923c.f40234q) {
            View.mergeDrawableStates(onCreateDrawableState, f35883K);
        }
        if (this.f35892H) {
            View.mergeDrawableStates(onCreateDrawableState, f35884L);
        }
        return onCreateDrawableState;
    }

    @Override // m.C4705p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f35892H);
    }

    @Override // m.C4705p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C4923c c4923c = this.f35894w;
        accessibilityNodeInfo.setCheckable(c4923c != null && c4923c.f40234q);
        accessibilityNodeInfo.setChecked(this.f35892H);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // m.C4705p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4922b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4922b c4922b = (C4922b) parcelable;
        super.onRestoreInstanceState(c4922b.f3267n);
        setChecked(c4922b.f40218v);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C4922b c4922b = new C4922b(super.onSaveInstanceState());
        c4922b.f40218v = this.f35892H;
        return c4922b;
    }

    @Override // m.C4705p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i6, int i9) {
        super.onTextChanged(charSequence, i, i6, i9);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f35894w.f40235r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f35886B != null) {
            if (this.f35886B.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f35887C = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!a()) {
            super.setBackgroundColor(i);
            return;
        }
        C4923c c4923c = this.f35894w;
        if (c4923c.b(false) != null) {
            c4923c.b(false).setTint(i);
        }
    }

    @Override // m.C4705p, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!a()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        C4923c c4923c = this.f35894w;
        c4923c.f40232o = true;
        ColorStateList colorStateList = c4923c.f40227j;
        MaterialButton materialButton = c4923c.f40219a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c4923c.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // m.C4705p, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? g.e(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z3) {
        if (a()) {
            this.f35894w.f40234q = z3;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z3) {
        C4923c c4923c = this.f35894w;
        if (c4923c == null || !c4923c.f40234q || !isEnabled() || this.f35892H == z3) {
            return;
        }
        this.f35892H = z3;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z6 = this.f35892H;
            if (!materialButtonToggleGroup.f35907y) {
                materialButtonToggleGroup.b(getId(), z6);
            }
        }
        if (this.f35893I) {
            return;
        }
        this.f35893I = true;
        Iterator it = this.f35895x.iterator();
        if (it.hasNext()) {
            throw y.j(it);
        }
        this.f35893I = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            C4923c c4923c = this.f35894w;
            if (c4923c.f40233p && c4923c.f40225g == i) {
                return;
            }
            c4923c.f40225g = i;
            c4923c.f40233p = true;
            float f3 = i;
            j e9 = c4923c.f40220b.e();
            e9.f778e = new E3.a(f3);
            e9.f779f = new E3.a(f3);
            e9.f780g = new E3.a(f3);
            e9.f781h = new E3.a(f3);
            c4923c.c(e9.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f3) {
        super.setElevation(f3);
        if (a()) {
            this.f35894w.b(false).i(f3);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f35886B != drawable) {
            this.f35886B = drawable;
            c(true);
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.J != i) {
            this.J = i;
            d(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f35891G != i) {
            this.f35891G = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? g.e(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f35888D != i) {
            this.f35888D = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f35885A != colorStateList) {
            this.f35885A = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f35897z != mode) {
            this.f35897z = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(e.c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C4923c c4923c = this.f35894w;
        c4923c.d(c4923c.f40223e, i);
    }

    public void setInsetTop(int i) {
        C4923c c4923c = this.f35894w;
        c4923c.d(i, c4923c.f40224f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC4921a interfaceC4921a) {
        this.f35896y = interfaceC4921a;
    }

    @Override // android.view.View
    public void setPressed(boolean z3) {
        InterfaceC4921a interfaceC4921a = this.f35896y;
        if (interfaceC4921a != null) {
            ((MaterialButtonToggleGroup) ((C4523c) interfaceC4921a).f37627u).invalidate();
        }
        super.setPressed(z3);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            C4923c c4923c = this.f35894w;
            if (c4923c.f40229l != colorStateList) {
                c4923c.f40229l = colorStateList;
                MaterialButton materialButton = c4923c.f40219a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(C3.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(e.c(getContext(), i));
        }
    }

    @Override // E3.v
    public void setShapeAppearanceModel(E3.k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f35894w.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z3) {
        if (a()) {
            C4923c c4923c = this.f35894w;
            c4923c.f40231n = z3;
            c4923c.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            C4923c c4923c = this.f35894w;
            if (c4923c.f40228k != colorStateList) {
                c4923c.f40228k = colorStateList;
                c4923c.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (a()) {
            setStrokeColor(e.c(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (a()) {
            C4923c c4923c = this.f35894w;
            if (c4923c.f40226h != i) {
                c4923c.f40226h = i;
                c4923c.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // m.C4705p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C4923c c4923c = this.f35894w;
        if (c4923c.f40227j != colorStateList) {
            c4923c.f40227j = colorStateList;
            if (c4923c.b(false) != null) {
                H.a.h(c4923c.b(false), c4923c.f40227j);
            }
        }
    }

    @Override // m.C4705p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C4923c c4923c = this.f35894w;
        if (c4923c.i != mode) {
            c4923c.i = mode;
            if (c4923c.b(false) == null || c4923c.i == null) {
                return;
            }
            H.a.i(c4923c.b(false), c4923c.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z3) {
        this.f35894w.f40235r = z3;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f35892H);
    }
}
