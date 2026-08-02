package com.google.android.material.button;

import A3.n;
import D.x;
import E.e;
import G3.j;
import G3.k;
import G3.v;
import L3.a;
import O.X;
import Z2.d;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.bumptech.glide.f;
import com.bumptech.glide.g;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C4718p;
import m3.AbstractC4742a;
import r2.C4900e;
import s3.C4971b;
import s3.C4972c;
import s3.InterfaceC4970a;

/* loaded from: classes2.dex */
public class MaterialButton extends C4718p implements Checkable, v {

    /* renamed from: K, reason: collision with root package name */
    public static final int[] f36651K = {R.attr.state_checkable};

    /* renamed from: L, reason: collision with root package name */
    public static final int[] f36652L = {R.attr.state_checked};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f36653A;

    /* renamed from: B, reason: collision with root package name */
    public Drawable f36654B;

    /* renamed from: C, reason: collision with root package name */
    public String f36655C;

    /* renamed from: D, reason: collision with root package name */
    public int f36656D;

    /* renamed from: E, reason: collision with root package name */
    public int f36657E;

    /* renamed from: F, reason: collision with root package name */
    public int f36658F;

    /* renamed from: G, reason: collision with root package name */
    public int f36659G;

    /* renamed from: H, reason: collision with root package name */
    public boolean f36660H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f36661I;
    public int J;

    /* renamed from: w, reason: collision with root package name */
    public final C4972c f36662w;

    /* renamed from: x, reason: collision with root package name */
    public final LinkedHashSet f36663x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC4970a f36664y;

    /* renamed from: z, reason: collision with root package name */
    public PorterDuff.Mode f36665z;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5248R.attr.materialButtonStyle, C5248R.style.Widget_MaterialComponents_Button), attributeSet, C5248R.attr.materialButtonStyle);
        this.f36663x = new LinkedHashSet();
        this.f36660H = false;
        this.f36661I = false;
        Context context2 = getContext();
        TypedArray f2 = n.f(context2, attributeSet, AbstractC4742a.f39426j, C5248R.attr.materialButtonStyle, C5248R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f36659G = f2.getDimensionPixelSize(12, 0);
        int i = f2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f36665z = n.g(i, mode);
        this.f36653A = f.j(getContext(), f2, 14);
        this.f36654B = f.l(getContext(), f2, 10);
        this.J = f2.getInteger(11, 1);
        this.f36656D = f2.getDimensionPixelSize(13, 0);
        C4972c c4972c = new C4972c(this, k.b(context2, attributeSet, C5248R.attr.materialButtonStyle, C5248R.style.Widget_MaterialComponents_Button).a());
        this.f36662w = c4972c;
        c4972c.f40520c = f2.getDimensionPixelOffset(1, 0);
        c4972c.f40521d = f2.getDimensionPixelOffset(2, 0);
        c4972c.f40522e = f2.getDimensionPixelOffset(3, 0);
        c4972c.f40523f = f2.getDimensionPixelOffset(4, 0);
        if (f2.hasValue(8)) {
            int dimensionPixelSize = f2.getDimensionPixelSize(8, -1);
            c4972c.f40524g = dimensionPixelSize;
            float f9 = dimensionPixelSize;
            j e9 = c4972c.f40519b.e();
            e9.f1120e = new G3.a(f9);
            e9.f1121f = new G3.a(f9);
            e9.f1122g = new G3.a(f9);
            e9.f1123h = new G3.a(f9);
            c4972c.c(e9.a());
            c4972c.f40532p = true;
        }
        c4972c.f40525h = f2.getDimensionPixelSize(20, 0);
        c4972c.i = n.g(f2.getInt(7, -1), mode);
        c4972c.f40526j = f.j(getContext(), f2, 6);
        c4972c.f40527k = f.j(getContext(), f2, 19);
        c4972c.f40528l = f.j(getContext(), f2, 16);
        c4972c.f40533q = f2.getBoolean(5, false);
        c4972c.f40536t = f2.getDimensionPixelSize(9, 0);
        c4972c.f40534r = f2.getBoolean(21, true);
        WeakHashMap weakHashMap = X.f2142a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (f2.hasValue(0)) {
            c4972c.f40531o = true;
            setSupportBackgroundTintList(c4972c.f40526j);
            setSupportBackgroundTintMode(c4972c.i);
        } else {
            c4972c.e();
        }
        setPaddingRelative(paddingStart + c4972c.f40520c, paddingTop + c4972c.f40522e, paddingEnd + c4972c.f40521d, paddingBottom + c4972c.f40523f);
        f2.recycle();
        setCompoundDrawablePadding(this.f36659G);
        c(this.f36654B != null);
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
        float f2 = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    public final boolean a() {
        C4972c c4972c = this.f36662w;
        return (c4972c == null || c4972c.f40531o) ? false : true;
    }

    public final void b() {
        int i = this.J;
        boolean z6 = true;
        if (i != 1 && i != 2) {
            z6 = false;
        }
        if (z6) {
            setCompoundDrawablesRelative(this.f36654B, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.f36654B, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.f36654B, null, null);
        }
    }

    public final void c(boolean z6) {
        Drawable drawable = this.f36654B;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.f36654B = mutate;
            H.a.h(mutate, this.f36653A);
            PorterDuff.Mode mode = this.f36665z;
            if (mode != null) {
                H.a.i(this.f36654B, mode);
            }
            int i = this.f36656D;
            if (i == 0) {
                i = this.f36654B.getIntrinsicWidth();
            }
            int i4 = this.f36656D;
            if (i4 == 0) {
                i4 = this.f36654B.getIntrinsicHeight();
            }
            Drawable drawable2 = this.f36654B;
            int i6 = this.f36657E;
            int i9 = this.f36658F;
            drawable2.setBounds(i6, i9, i + i6, i4 + i9);
            this.f36654B.setVisible(true, z6);
        }
        if (z6) {
            b();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i10 = this.J;
        if (((i10 == 1 || i10 == 2) && drawable3 != this.f36654B) || (((i10 == 3 || i10 == 4) && drawable5 != this.f36654B) || ((i10 == 16 || i10 == 32) && drawable4 != this.f36654B))) {
            b();
        }
    }

    public final void d(int i, int i4) {
        if (this.f36654B == null || getLayout() == null) {
            return;
        }
        int i6 = this.J;
        if (!(i6 == 1 || i6 == 2) && i6 != 3 && i6 != 4) {
            if (i6 == 16 || i6 == 32) {
                this.f36657E = 0;
                if (i6 == 16) {
                    this.f36658F = 0;
                    c(false);
                    return;
                }
                int i9 = this.f36656D;
                if (i9 == 0) {
                    i9 = this.f36654B.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i4 - getTextHeight()) - getPaddingTop()) - i9) - this.f36659G) - getPaddingBottom()) / 2);
                if (this.f36658F != max) {
                    this.f36658F = max;
                    c(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f36658F = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i10 = this.J;
        if (i10 == 1 || i10 == 3 || ((i10 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i10 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f36657E = 0;
            c(false);
            return;
        }
        int i11 = this.f36656D;
        if (i11 == 0) {
            i11 = this.f36654B.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = X.f2142a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i11) - this.f36659G) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.J == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f36657E != paddingEnd) {
            this.f36657E = paddingEnd;
            c(false);
        }
    }

    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.f36655C)) {
            return this.f36655C;
        }
        C4972c c4972c = this.f36662w;
        return ((c4972c == null || !c4972c.f40533q) ? Button.class : CompoundButton.class).getName();
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
            return this.f36662w.f40524g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.f36654B;
    }

    public int getIconGravity() {
        return this.J;
    }

    public int getIconPadding() {
        return this.f36659G;
    }

    public int getIconSize() {
        return this.f36656D;
    }

    public ColorStateList getIconTint() {
        return this.f36653A;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f36665z;
    }

    public int getInsetBottom() {
        return this.f36662w.f40523f;
    }

    public int getInsetTop() {
        return this.f36662w.f40522e;
    }

    public ColorStateList getRippleColor() {
        if (a()) {
            return this.f36662w.f40528l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (a()) {
            return this.f36662w.f40519b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (a()) {
            return this.f36662w.f40527k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (a()) {
            return this.f36662w.f40525h;
        }
        return 0;
    }

    @Override // m.C4718p
    public ColorStateList getSupportBackgroundTintList() {
        return a() ? this.f36662w.f40526j : super.getSupportBackgroundTintList();
    }

    @Override // m.C4718p
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return a() ? this.f36662w.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f36660H;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (a()) {
            d.q(this, this.f36662w.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        C4972c c4972c = this.f36662w;
        if (c4972c != null && c4972c.f40533q) {
            View.mergeDrawableStates(onCreateDrawableState, f36651K);
        }
        if (this.f36660H) {
            View.mergeDrawableStates(onCreateDrawableState, f36652L);
        }
        return onCreateDrawableState;
    }

    @Override // m.C4718p, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f36660H);
    }

    @Override // m.C4718p, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        C4972c c4972c = this.f36662w;
        accessibilityNodeInfo.setCheckable(c4972c != null && c4972c.f40533q);
        accessibilityNodeInfo.setChecked(this.f36660H);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // m.C4718p, android.widget.TextView, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4971b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4971b c4971b = (C4971b) parcelable;
        super.onRestoreInstanceState(c4971b.f3390n);
        setChecked(c4971b.f40517v);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        C4971b c4971b = new C4971b(super.onSaveInstanceState());
        c4971b.f40517v = this.f36660H;
        return c4971b;
    }

    @Override // m.C4718p, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        super.onTextChanged(charSequence, i, i4, i6);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f36662w.f40534r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.f36654B != null) {
            if (this.f36654B.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.f36655C = str;
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
        C4972c c4972c = this.f36662w;
        if (c4972c.b(false) != null) {
            c4972c.b(false).setTint(i);
        }
    }

    @Override // m.C4718p, android.view.View
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
        C4972c c4972c = this.f36662w;
        c4972c.f40531o = true;
        ColorStateList colorStateList = c4972c.f40526j;
        MaterialButton materialButton = c4972c.f40518a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(c4972c.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // m.C4718p, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? g.h(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z6) {
        if (a()) {
            this.f36662w.f40533q = z6;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z6) {
        C4972c c4972c = this.f36662w;
        if (c4972c == null || !c4972c.f40533q || !isEnabled() || this.f36660H == z6) {
            return;
        }
        this.f36660H = z6;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z9 = this.f36660H;
            if (!materialButtonToggleGroup.f36675y) {
                materialButtonToggleGroup.b(getId(), z9);
            }
        }
        if (this.f36661I) {
            return;
        }
        this.f36661I = true;
        Iterator it = this.f36663x.iterator();
        if (it.hasNext()) {
            throw x.i(it);
        }
        this.f36661I = false;
    }

    public void setCornerRadius(int i) {
        if (a()) {
            C4972c c4972c = this.f36662w;
            if (c4972c.f40532p && c4972c.f40524g == i) {
                return;
            }
            c4972c.f40524g = i;
            c4972c.f40532p = true;
            float f2 = i;
            j e9 = c4972c.f40519b.e();
            e9.f1120e = new G3.a(f2);
            e9.f1121f = new G3.a(f2);
            e9.f1122g = new G3.a(f2);
            e9.f1123h = new G3.a(f2);
            c4972c.c(e9.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (a()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (a()) {
            this.f36662w.b(false).i(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.f36654B != drawable) {
            this.f36654B = drawable;
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
        if (this.f36659G != i) {
            this.f36659G = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? g.h(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f36656D != i) {
            this.f36656D = i;
            c(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f36653A != colorStateList) {
            this.f36653A = colorStateList;
            c(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f36665z != mode) {
            this.f36665z = mode;
            c(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(e.c(getContext(), i));
    }

    public void setInsetBottom(int i) {
        C4972c c4972c = this.f36662w;
        c4972c.d(c4972c.f40522e, i);
    }

    public void setInsetTop(int i) {
        C4972c c4972c = this.f36662w;
        c4972c.d(i, c4972c.f40523f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(InterfaceC4970a interfaceC4970a) {
        this.f36664y = interfaceC4970a;
    }

    @Override // android.view.View
    public void setPressed(boolean z6) {
        InterfaceC4970a interfaceC4970a = this.f36664y;
        if (interfaceC4970a != null) {
            ((MaterialButtonToggleGroup) ((C4900e) interfaceC4970a).f40152n).invalidate();
        }
        super.setPressed(z6);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (a()) {
            C4972c c4972c = this.f36662w;
            if (c4972c.f40528l != colorStateList) {
                c4972c.f40528l = colorStateList;
                MaterialButton materialButton = c4972c.f40518a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(E3.a.a(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (a()) {
            setRippleColor(e.c(getContext(), i));
        }
    }

    @Override // G3.v
    public void setShapeAppearanceModel(k kVar) {
        if (!a()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f36662w.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z6) {
        if (a()) {
            C4972c c4972c = this.f36662w;
            c4972c.f40530n = z6;
            c4972c.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (a()) {
            C4972c c4972c = this.f36662w;
            if (c4972c.f40527k != colorStateList) {
                c4972c.f40527k = colorStateList;
                c4972c.f();
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
            C4972c c4972c = this.f36662w;
            if (c4972c.f40525h != i) {
                c4972c.f40525h = i;
                c4972c.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (a()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // m.C4718p
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!a()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        C4972c c4972c = this.f36662w;
        if (c4972c.f40526j != colorStateList) {
            c4972c.f40526j = colorStateList;
            if (c4972c.b(false) != null) {
                H.a.h(c4972c.b(false), c4972c.f40526j);
            }
        }
    }

    @Override // m.C4718p
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!a()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        C4972c c4972c = this.f36662w;
        if (c4972c.i != mode) {
            c4972c.i = mode;
            if (c4972c.b(false) == null || c4972c.i == null) {
                return;
            }
            H.a.i(c4972c.b(false), c4972c.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        d(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z6) {
        this.f36662w.f40534r = z6;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f36660H);
    }
}
