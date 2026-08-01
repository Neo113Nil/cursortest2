package com.google.android.material.button;

import C0.a;
import C0.b;
import C0.c;
import L0.m;
import O.K;
import S0.j;
import S0.k;
import S0.v;
import a.AbstractC0078a;
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
import androidx.recyclerview.widget.RecyclerView;
import h0.f;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C0274q;
import u0.AbstractC0358a;

/* loaded from: classes.dex */
public class MaterialButton extends C0274q implements Checkable, v {

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f2419r = {R.attr.state_checkable};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f2420s = {R.attr.state_checked};

    /* renamed from: d, reason: collision with root package name */
    public final c f2421d;
    public final LinkedHashSet e;

    /* renamed from: f, reason: collision with root package name */
    public a f2422f;

    /* renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f2423g;

    /* renamed from: h, reason: collision with root package name */
    public ColorStateList f2424h;
    public Drawable i;
    public String j;

    /* renamed from: k, reason: collision with root package name */
    public int f2425k;

    /* renamed from: l, reason: collision with root package name */
    public int f2426l;

    /* renamed from: m, reason: collision with root package name */
    public int f2427m;

    /* renamed from: n, reason: collision with root package name */
    public int f2428n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f2429o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f2430p;

    /* renamed from: q, reason: collision with root package name */
    public int f2431q;

    public MaterialButton(Context context, AttributeSet attributeSet) {
        super(X0.a.a(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.materialButtonStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Button), attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.materialButtonStyle);
        this.e = new LinkedHashSet();
        this.f2429o = false;
        this.f2430p = false;
        Context context2 = getContext();
        TypedArray g2 = m.g(context2, attributeSet, AbstractC0358a.f4448m, com.lumenpath.harispro.hrnavigator.R.attr.materialButtonStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.f2428n = g2.getDimensionPixelSize(12, 0);
        int i = g2.getInt(15, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.f2423g = m.i(i, mode);
        this.f2424h = AbstractC0078a.B(getContext(), g2, 14);
        this.i = AbstractC0078a.E(getContext(), g2, 10);
        this.f2431q = g2.getInteger(11, 1);
        this.f2425k = g2.getDimensionPixelSize(13, 0);
        c cVar = new c(this, k.b(context2, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.materialButtonStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_MaterialComponents_Button).a());
        this.f2421d = cVar;
        cVar.f83c = g2.getDimensionPixelOffset(1, 0);
        cVar.f84d = g2.getDimensionPixelOffset(2, 0);
        cVar.e = g2.getDimensionPixelOffset(3, 0);
        cVar.f85f = g2.getDimensionPixelOffset(4, 0);
        if (g2.hasValue(8)) {
            int dimensionPixelSize = g2.getDimensionPixelSize(8, -1);
            cVar.f86g = dimensionPixelSize;
            float f2 = dimensionPixelSize;
            j e = cVar.f82b.e();
            e.e = new S0.a(f2);
            e.f1100f = new S0.a(f2);
            e.f1101g = new S0.a(f2);
            e.f1102h = new S0.a(f2);
            cVar.c(e.a());
            cVar.f93p = true;
        }
        cVar.f87h = g2.getDimensionPixelSize(20, 0);
        cVar.i = m.i(g2.getInt(7, -1), mode);
        cVar.j = AbstractC0078a.B(getContext(), g2, 6);
        cVar.f88k = AbstractC0078a.B(getContext(), g2, 19);
        cVar.f89l = AbstractC0078a.B(getContext(), g2, 16);
        cVar.f94q = g2.getBoolean(5, false);
        cVar.f97t = g2.getDimensionPixelSize(9, 0);
        cVar.f95r = g2.getBoolean(21, true);
        WeakHashMap weakHashMap = K.f747a;
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (g2.hasValue(0)) {
            cVar.f92o = true;
            setSupportBackgroundTintList(cVar.j);
            setSupportBackgroundTintMode(cVar.i);
        } else {
            cVar.e();
        }
        setPaddingRelative(paddingStart + cVar.f83c, paddingTop + cVar.e, paddingEnd + cVar.f84d, paddingBottom + cVar.f85f);
        g2.recycle();
        setCompoundDrawablePadding(this.f2428n);
        d(this.i != null);
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
        float f2 = RecyclerView.f2111C0;
        for (int i = 0; i < lineCount; i++) {
            f2 = Math.max(f2, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f2);
    }

    public final boolean a() {
        c cVar = this.f2421d;
        return cVar != null && cVar.f94q;
    }

    public final boolean b() {
        c cVar = this.f2421d;
        return (cVar == null || cVar.f92o) ? false : true;
    }

    public final void c() {
        int i = this.f2431q;
        boolean z2 = true;
        if (i != 1 && i != 2) {
            z2 = false;
        }
        if (z2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    public final void d(boolean z2) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            mutate.setTintList(this.f2424h);
            PorterDuff.Mode mode = this.f2423g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int i = this.f2425k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.f2425k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.f2426l;
            int i4 = this.f2427m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z2);
        }
        if (z2) {
            c();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.f2431q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            c();
        }
    }

    public final void e(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.f2431q;
        if (!(i3 == 1 || i3 == 2) && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.f2426l = 0;
                if (i3 == 16) {
                    this.f2427m = 0;
                    d(false);
                    return;
                }
                int i4 = this.f2425k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.f2428n) - getPaddingBottom()) / 2);
                if (this.f2427m != max) {
                    this.f2427m = max;
                    d(false);
                    return;
                }
                return;
            }
            return;
        }
        this.f2427m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.f2431q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.f2426l = 0;
            d(false);
            return;
        }
        int i6 = this.f2425k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = i - getTextLayoutWidth();
        WeakHashMap weakHashMap = K.f747a;
        int paddingEnd = (((textLayoutWidth - getPaddingEnd()) - i6) - this.f2428n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            paddingEnd /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.f2431q == 4)) {
            paddingEnd = -paddingEnd;
        }
        if (this.f2426l != paddingEnd) {
            this.f2426l = paddingEnd;
            d(false);
        }
    }

    public String getA11yClassName() {
        if (TextUtils.isEmpty(this.j)) {
            return (a() ? CompoundButton.class : Button.class).getName();
        }
        return this.j;
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
        if (b()) {
            return this.f2421d.f86g;
        }
        return 0;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.f2431q;
    }

    public int getIconPadding() {
        return this.f2428n;
    }

    public int getIconSize() {
        return this.f2425k;
    }

    public ColorStateList getIconTint() {
        return this.f2424h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.f2423g;
    }

    public int getInsetBottom() {
        return this.f2421d.f85f;
    }

    public int getInsetTop() {
        return this.f2421d.e;
    }

    public ColorStateList getRippleColor() {
        if (b()) {
            return this.f2421d.f89l;
        }
        return null;
    }

    public k getShapeAppearanceModel() {
        if (b()) {
            return this.f2421d.f82b;
        }
        throw new IllegalStateException("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
    }

    public ColorStateList getStrokeColor() {
        if (b()) {
            return this.f2421d.f88k;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (b()) {
            return this.f2421d.f87h;
        }
        return 0;
    }

    @Override // m.C0274q
    public ColorStateList getSupportBackgroundTintList() {
        return b() ? this.f2421d.j : super.getSupportBackgroundTintList();
    }

    @Override // m.C0274q
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return b() ? this.f2421d.i : super.getSupportBackgroundTintMode();
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.f2429o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (b()) {
            R.j.o0(this, this.f2421d.b(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (a()) {
            View.mergeDrawableStates(onCreateDrawableState, f2419r);
        }
        if (this.f2429o) {
            View.mergeDrawableStates(onCreateDrawableState, f2420s);
        }
        return onCreateDrawableState;
    }

    @Override // m.C0274q, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.f2429o);
    }

    @Override // m.C0274q, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        accessibilityNodeInfo.setCheckable(a());
        accessibilityNodeInfo.setChecked(this.f2429o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // m.C0274q, android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof b)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        b bVar = (b) parcelable;
        super.onRestoreInstanceState(bVar.f1147a);
        setChecked(bVar.f80c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        b bVar = new b(super.onSaveInstanceState());
        bVar.f80c = this.f2429o;
        return bVar;
    }

    @Override // m.C0274q, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (this.f2421d.f95r) {
            toggle();
        }
        return super.performClick();
    }

    @Override // android.view.View
    public final void refreshDrawableState() {
        super.refreshDrawableState();
        if (this.i != null) {
            if (this.i.setState(getDrawableState())) {
                invalidate();
            }
        }
    }

    public void setA11yClassName(String str) {
        this.j = str;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!b()) {
            super.setBackgroundColor(i);
            return;
        }
        c cVar = this.f2421d;
        if (cVar.b(false) != null) {
            cVar.b(false).setTint(i);
        }
    }

    @Override // m.C0274q, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (!b()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        c cVar = this.f2421d;
        cVar.f92o = true;
        ColorStateList colorStateList = cVar.j;
        MaterialButton materialButton = cVar.f81a;
        materialButton.setSupportBackgroundTintList(colorStateList);
        materialButton.setSupportBackgroundTintMode(cVar.i);
        super.setBackgroundDrawable(drawable);
    }

    @Override // m.C0274q, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? f.n(getContext(), i) : null);
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        setSupportBackgroundTintList(colorStateList);
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        setSupportBackgroundTintMode(mode);
    }

    public void setCheckable(boolean z2) {
        if (b()) {
            this.f2421d.f94q = z2;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z2) {
        if (a() && isEnabled() && this.f2429o != z2) {
            this.f2429o = z2;
            refreshDrawableState();
            if (getParent() instanceof MaterialButtonToggleGroup) {
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
                boolean z3 = this.f2429o;
                if (!materialButtonToggleGroup.f2437f) {
                    materialButtonToggleGroup.b(getId(), z3);
                }
            }
            if (this.f2430p) {
                return;
            }
            this.f2430p = true;
            Iterator it = this.e.iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            this.f2430p = false;
        }
    }

    public void setCornerRadius(int i) {
        if (b()) {
            c cVar = this.f2421d;
            if (cVar.f93p && cVar.f86g == i) {
                return;
            }
            cVar.f86g = i;
            cVar.f93p = true;
            float f2 = i;
            j e = cVar.f82b.e();
            e.e = new S0.a(f2);
            e.f1100f = new S0.a(f2);
            e.f1101g = new S0.a(f2);
            e.f1102h = new S0.a(f2);
            cVar.c(e.a());
        }
    }

    public void setCornerRadiusResource(int i) {
        if (b()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        super.setElevation(f2);
        if (b()) {
            this.f2421d.b(false).l(f2);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            d(true);
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.f2431q != i) {
            this.f2431q = i;
            e(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.f2428n != i) {
            this.f2428n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? f.n(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("iconSize cannot be less than 0");
        }
        if (this.f2425k != i) {
            this.f2425k = i;
            d(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.f2424h != colorStateList) {
            this.f2424h = colorStateList;
            d(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.f2423g != mode) {
            this.f2423g = mode;
            d(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(AbstractC0078a.z(getContext(), i));
    }

    public void setInsetBottom(int i) {
        c cVar = this.f2421d;
        cVar.d(cVar.e, i);
    }

    public void setInsetTop(int i) {
        c cVar = this.f2421d;
        cVar.d(i, cVar.f85f);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(a aVar) {
        this.f2422f = aVar;
    }

    @Override // android.view.View
    public void setPressed(boolean z2) {
        a aVar = this.f2422f;
        if (aVar != null) {
            ((MaterialButtonToggleGroup) ((B.b) aVar).f10b).invalidate();
        }
        super.setPressed(z2);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f2421d;
            if (cVar.f89l != colorStateList) {
                cVar.f89l = colorStateList;
                MaterialButton materialButton = cVar.f81a;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(Q0.a.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (b()) {
            setRippleColor(AbstractC0078a.z(getContext(), i));
        }
    }

    @Override // S0.v
    public void setShapeAppearanceModel(k kVar) {
        if (!b()) {
            throw new IllegalStateException("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
        }
        this.f2421d.c(kVar);
    }

    public void setShouldDrawSurfaceColorStroke(boolean z2) {
        if (b()) {
            c cVar = this.f2421d;
            cVar.f91n = z2;
            cVar.f();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (b()) {
            c cVar = this.f2421d;
            if (cVar.f88k != colorStateList) {
                cVar.f88k = colorStateList;
                cVar.f();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (b()) {
            setStrokeColor(AbstractC0078a.z(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (b()) {
            c cVar = this.f2421d;
            if (cVar.f87h != i) {
                cVar.f87h = i;
                cVar.f();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (b()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // m.C0274q
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!b()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        c cVar = this.f2421d;
        if (cVar.j != colorStateList) {
            cVar.j = colorStateList;
            if (cVar.b(false) != null) {
                cVar.b(false).setTintList(cVar.j);
            }
        }
    }

    @Override // m.C0274q
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!b()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        c cVar = this.f2421d;
        if (cVar.i != mode) {
            cVar.i = mode;
            if (cVar.b(false) == null || cVar.i == null) {
                return;
            }
            cVar.b(false).setTintMode(cVar.i);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        e(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z2) {
        this.f2421d.f95r = z2;
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.f2429o);
    }
}
