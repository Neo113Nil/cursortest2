package com.google.android.material.button;

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
import android.util.StateSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.material.shape.a;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.dyg;
import defpackage.etn;
import defpackage.eup;
import defpackage.fvp;
import defpackage.fxf;
import defpackage.her;
import defpackage.hrg;
import defpackage.ier;
import defpackage.ivf;
import defpackage.jz7;
import defpackage.kwf;
import defpackage.leo;
import defpackage.n7b;
import defpackage.ngg;
import defpackage.rvf;
import defpackage.sch;
import defpackage.tch;
import defpackage.uch;
import defpackage.uvg;
import defpackage.vch;
import defpackage.vdn;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.y8r;
import defpackage.z8r;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class MaterialButton extends AppCompatButton implements Checkable, fvp {
    public static final int[] F = {R.attr.state_checkable};
    public static final int[] G = {R.attr.state_checked};
    public static final jz7 H = new jz7(1);
    public ier A;
    public int B;
    public float C;
    public float D;
    public y8r E;
    public final vch d;
    public final LinkedHashSet e;
    public sch f;
    public PorterDuff.Mode g;
    public ColorStateList h;
    public Drawable i;
    public String j;
    public int k;
    public int l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public int q;
    public int r;
    public float s;
    public int t;
    public int u;
    public LinearLayout.LayoutParams v;
    public boolean w;
    public int x;
    public boolean y;
    public int z;

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.q0(context, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_Button, new int[]{ru.yandex.music.R.attr.materialSizeOverlay}), attributeSet, i);
        this.e = new LinkedHashSet();
        this.o = false;
        this.p = false;
        this.r = -1;
        this.s = -1.0f;
        this.t = -1;
        this.u = -1;
        this.z = -1;
        Context context2 = getContext();
        TypedArray B = bcx.B(context2, attributeSet, vdn.w, i, ru.yandex.music.R.style.Widget_MaterialComponents_Button, new int[0]);
        this.n = B.getDimensionPixelSize(13, 0);
        int i2 = B.getInt(16, -1);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        this.g = fxf.L(i2, mode);
        this.h = ivf.D(getContext(), B, 15);
        this.i = ivf.F(getContext(), B, 11);
        this.q = B.getInteger(12, 1);
        this.k = B.getDimensionPixelSize(14, 0);
        her b = her.b(context2, B, 19);
        eup c = b != null ? b.c() : eup.c(context2, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_Button).e();
        boolean z = B.getBoolean(17, false);
        vch vchVar = new vch(this, c);
        this.d = vchVar;
        vchVar.f = B.getDimensionPixelOffset(2, 0);
        vchVar.g = B.getDimensionPixelOffset(3, 0);
        vchVar.h = B.getDimensionPixelOffset(4, 0);
        vchVar.i = B.getDimensionPixelOffset(5, 0);
        if (B.hasValue(9)) {
            int dimensionPixelSize = B.getDimensionPixelSize(9, -1);
            vchVar.j = dimensionPixelSize;
            vchVar.b = vchVar.b.i(dimensionPixelSize);
            vchVar.c = null;
            vchVar.d();
            vchVar.s = true;
        }
        vchVar.k = B.getDimensionPixelSize(22, 0);
        vchVar.l = fxf.L(B.getInt(8, -1), mode);
        vchVar.m = ivf.D(getContext(), B, 7);
        vchVar.n = ivf.D(getContext(), B, 21);
        vchVar.o = ivf.D(getContext(), B, 18);
        vchVar.t = B.getBoolean(6, false);
        vchVar.w = B.getDimensionPixelSize(10, 0);
        vchVar.u = B.getBoolean(23, true);
        int paddingStart = getPaddingStart();
        int paddingTop = getPaddingTop();
        int paddingEnd = getPaddingEnd();
        int paddingBottom = getPaddingBottom();
        if (B.hasValue(0)) {
            vchVar.r = true;
            setSupportBackgroundTintList(vchVar.m);
            setSupportBackgroundTintMode(vchVar.l);
        } else {
            vchVar.c();
        }
        setPaddingRelative(paddingStart + vchVar.f, paddingTop + vchVar.h, paddingEnd + vchVar.g, paddingBottom + vchVar.i);
        setCheckedInternal(B.getBoolean(1, false));
        if (b != null) {
            vchVar.d = d();
            if (vchVar.c != null) {
                vchVar.d();
            }
            vchVar.c = b;
            vchVar.d();
        }
        setOpticalCenterEnabled(z);
        B.recycle();
        setCompoundDrawablePadding(this.n);
        h(this.i != null);
    }

    public static /* synthetic */ void a(MaterialButton materialButton) {
        materialButton.x = materialButton.getOpticalCenterShift();
        materialButton.j();
        materialButton.invalidate();
    }

    private Layout.Alignment getActualTextAlignment() {
        int textAlignment = getTextAlignment();
        return textAlignment != 1 ? (textAlignment == 6 || textAlignment == 3) ? Layout.Alignment.ALIGN_OPPOSITE : textAlignment != 4 ? Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER : getGravityTextAlignment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getDisplayedWidthIncrease() {
        return this.C;
    }

    private Layout.Alignment getGravityTextAlignment() {
        int gravity = getGravity() & 8388615;
        return gravity != 1 ? (gravity == 5 || gravity == 8388613) ? Layout.Alignment.ALIGN_OPPOSITE : Layout.Alignment.ALIGN_NORMAL : Layout.Alignment.ALIGN_CENTER;
    }

    private int getOpticalCenterShift() {
        a a;
        if (this.w && this.y && (a = this.d.a(false)) != null) {
            return (int) (a.i() * 0.11f);
        }
        return 0;
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
        float f = 0.0f;
        for (int i = 0; i < lineCount; i++) {
            f = Math.max(f, getLayout().getLineWidth(i));
        }
        return (int) Math.ceil(f);
    }

    private void setCheckedInternal(boolean z) {
        vch vchVar = this.d;
        if (vchVar == null || !vchVar.t || this.o == z) {
            return;
        }
        this.o = z;
        refreshDrawableState();
        if (getParent() instanceof MaterialButtonToggleGroup) {
            MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) getParent();
            boolean z2 = this.o;
            if (!materialButtonToggleGroup.m) {
                materialButtonToggleGroup.f(getId(), z2);
            }
        }
        if (this.p) {
            return;
        }
        this.p = true;
        Iterator it = this.e.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
        this.p = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayedWidthIncrease(float f) {
        MaterialButton materialButton;
        MaterialButton materialButton2;
        if (this.C != f) {
            this.C = f;
            j();
            invalidate();
            if (getParent() instanceof uch) {
                uch uchVar = (uch) getParent();
                int i = (int) this.C;
                int indexOfChild = uchVar.indexOfChild(this);
                if (indexOfChild < 0) {
                    return;
                }
                int i2 = indexOfChild - 1;
                while (true) {
                    materialButton = null;
                    if (i2 < 0) {
                        materialButton2 = null;
                        break;
                    } else {
                        if (uchVar.c(i2)) {
                            materialButton2 = (MaterialButton) uchVar.getChildAt(i2);
                            break;
                        }
                        i2--;
                    }
                }
                int childCount = uchVar.getChildCount();
                while (true) {
                    indexOfChild++;
                    if (indexOfChild >= childCount) {
                        break;
                    } else if (uchVar.c(indexOfChild)) {
                        materialButton = (MaterialButton) uchVar.getChildAt(indexOfChild);
                        break;
                    }
                }
                if (materialButton2 == null && materialButton == null) {
                    return;
                }
                if (materialButton2 == null) {
                    materialButton.setDisplayedWidthDecrease(i);
                }
                if (materialButton == null) {
                    materialButton2.setDisplayedWidthDecrease(i);
                }
                if (materialButton2 == null || materialButton == null) {
                    return;
                }
                materialButton2.setDisplayedWidthDecrease(i / 2);
                materialButton.setDisplayedWidthDecrease((i + 1) / 2);
            }
        }
    }

    public final z8r d() {
        Context context = getContext();
        TypedValue C = ngg.C(context, ru.yandex.music.R.attr.motionSpringFastSpatial);
        int[] iArr = vdn.F;
        TypedArray obtainStyledAttributes = C == null ? context.obtainStyledAttributes(null, iArr, 0, ru.yandex.music.R.style.Motion_Material3_Spring_Standard_Fast_Spatial) : context.obtainStyledAttributes(C.resourceId, iArr);
        z8r z8rVar = new z8r();
        try {
            float f = obtainStyledAttributes.getFloat(1, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = obtainStyledAttributes.getFloat(0, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            z8rVar.b(f);
            z8rVar.a(f2);
            return z8rVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final boolean e() {
        vch vchVar = this.d;
        return (vchVar == null || vchVar.r) ? false : true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0071, code lost:
    
        if (r1 == 2) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(boolean z) {
        int i;
        if (this.A == null) {
            return;
        }
        if (this.E == null) {
            y8r y8rVar = new y8r(this, H);
            this.E = y8rVar;
            y8rVar.m = d();
        }
        if (this.y) {
            int i2 = this.B;
            ier ierVar = this.A;
            int[] drawableState = getDrawableState();
            int[][] iArr = ierVar.c;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                i = -1;
                if (i4 >= ierVar.a) {
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
                int[][] iArr3 = ierVar.c;
                int i5 = 0;
                while (true) {
                    if (i5 >= ierVar.a) {
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
            kwf kwfVar = (kwf) (i4 < 0 ? ierVar.b : ierVar.d[i4]).b;
            int width = getWidth();
            float f = kwfVar.c;
            int i6 = kwfVar.b;
            if (i6 == 1) {
                f *= width;
            }
            i3 = (int) f;
            this.E.a(Math.min(i2, i3));
            if (z) {
                this.E.d();
            }
        }
    }

    public final void g() {
        int i = this.q;
        if (i == 1 || i == 2) {
            setCompoundDrawablesRelative(this.i, null, null, null);
            return;
        }
        if (i == 3 || i == 4) {
            setCompoundDrawablesRelative(null, null, this.i, null);
        } else if (i == 16 || i == 32) {
            setCompoundDrawablesRelative(null, this.i, null, null);
        }
    }

    @NonNull
    public String getA11yClassName() {
        if (!TextUtils.isEmpty(this.j)) {
            return this.j;
        }
        vch vchVar = this.d;
        return ((vchVar == null || !vchVar.t) ? Button.class : CompoundButton.class).getName();
    }

    public int getAllowedWidthDecrease() {
        return this.z;
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
        if (e()) {
            return this.d.j;
        }
        return 0;
    }

    public z8r getCornerSpringForce() {
        return this.d.d;
    }

    public Drawable getIcon() {
        return this.i;
    }

    public int getIconGravity() {
        return this.q;
    }

    public int getIconPadding() {
        return this.n;
    }

    public int getIconSize() {
        return this.k;
    }

    public ColorStateList getIconTint() {
        return this.h;
    }

    public PorterDuff.Mode getIconTintMode() {
        return this.g;
    }

    public int getInsetBottom() {
        return this.d.i;
    }

    public int getInsetTop() {
        return this.d.h;
    }

    public ColorStateList getRippleColor() {
        if (e()) {
            return this.d.o;
        }
        return null;
    }

    @NonNull
    public eup getShapeAppearanceModel() {
        if (e()) {
            return this.d.b;
        }
        xq0.q("Attempted to get ShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public her getStateListShapeAppearanceModel() {
        if (e()) {
            return this.d.c;
        }
        xq0.q("Attempted to get StateListShapeAppearanceModel from a MaterialButton which has an overwritten background.");
        return null;
    }

    public ColorStateList getStrokeColor() {
        if (e()) {
            return this.d.n;
        }
        return null;
    }

    public int getStrokeWidth() {
        if (e()) {
            return this.d.k;
        }
        return 0;
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public ColorStateList getSupportBackgroundTintList() {
        return e() ? this.d.m : super.getSupportBackgroundTintList();
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return e() ? this.d.l : super.getSupportBackgroundTintMode();
    }

    public final void h(boolean z) {
        Drawable drawable = this.i;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.i = mutate;
            mutate.setTintList(this.h);
            PorterDuff.Mode mode = this.g;
            if (mode != null) {
                this.i.setTintMode(mode);
            }
            int i = this.k;
            if (i == 0) {
                i = this.i.getIntrinsicWidth();
            }
            int i2 = this.k;
            if (i2 == 0) {
                i2 = this.i.getIntrinsicHeight();
            }
            Drawable drawable2 = this.i;
            int i3 = this.l;
            int i4 = this.m;
            drawable2.setBounds(i3, i4, i + i3, i2 + i4);
            this.i.setVisible(true, z);
        }
        if (z) {
            g();
            return;
        }
        Drawable[] compoundDrawablesRelative = getCompoundDrawablesRelative();
        Drawable drawable3 = compoundDrawablesRelative[0];
        Drawable drawable4 = compoundDrawablesRelative[1];
        Drawable drawable5 = compoundDrawablesRelative[2];
        int i5 = this.q;
        if (((i5 == 1 || i5 == 2) && drawable3 != this.i) || (((i5 == 3 || i5 == 4) && drawable5 != this.i) || ((i5 == 16 || i5 == 32) && drawable4 != this.i))) {
            g();
        }
    }

    public final void i(int i, int i2) {
        if (this.i == null || getLayout() == null) {
            return;
        }
        int i3 = this.q;
        if (i3 != 1 && i3 != 2 && i3 != 3 && i3 != 4) {
            if (i3 == 16 || i3 == 32) {
                this.l = 0;
                if (i3 == 16) {
                    this.m = 0;
                    h(false);
                    return;
                }
                int i4 = this.k;
                if (i4 == 0) {
                    i4 = this.i.getIntrinsicHeight();
                }
                int max = Math.max(0, (((((i2 - getTextHeight()) - getPaddingTop()) - i4) - this.n) - getPaddingBottom()) / 2);
                if (this.m != max) {
                    this.m = max;
                    h(false);
                    return;
                }
                return;
            }
            return;
        }
        this.m = 0;
        Layout.Alignment actualTextAlignment = getActualTextAlignment();
        int i5 = this.q;
        if (i5 == 1 || i5 == 3 || ((i5 == 2 && actualTextAlignment == Layout.Alignment.ALIGN_NORMAL) || (i5 == 4 && actualTextAlignment == Layout.Alignment.ALIGN_OPPOSITE))) {
            this.l = 0;
            h(false);
            return;
        }
        int i6 = this.k;
        if (i6 == 0) {
            i6 = this.i.getIntrinsicWidth();
        }
        int textLayoutWidth = ((((i - getTextLayoutWidth()) - getPaddingEnd()) - i6) - this.n) - getPaddingStart();
        if (actualTextAlignment == Layout.Alignment.ALIGN_CENTER) {
            textLayoutWidth /= 2;
        }
        if ((getLayoutDirection() == 1) != (this.q == 4)) {
            textLayoutWidth = -textLayoutWidth;
        }
        if (this.l != textLayoutWidth) {
            this.l = textLayoutWidth;
            h(false);
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.o;
    }

    public final void j() {
        int i = (int) (this.C - this.D);
        int i2 = (i / 2) + this.x;
        getLayoutParams().width = (int) (this.s + i);
        setPaddingRelative(this.t + i2, getPaddingTop(), (this.u + i) - i2, getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (e()) {
            rvf.K(this, this.d.a(false));
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        vch vchVar = this.d;
        if (vchVar != null && vchVar.t) {
            View.mergeDrawableStates(onCreateDrawableState, F);
        }
        if (this.o) {
            View.mergeDrawableStates(onCreateDrawableState, G);
        }
        return onCreateDrawableState;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(getA11yClassName());
        accessibilityEvent.setChecked(this.o);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getA11yClassName());
        vch vchVar = this.d;
        accessibilityNodeInfo.setCheckable(vchVar != null && vchVar.t);
        accessibilityNodeInfo.setChecked(this.o);
        accessibilityNodeInfo.setClickable(isClickable());
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        super.onLayout(z, i, i2, i3, i4);
        i(getMeasuredWidth(), getMeasuredHeight());
        int i6 = getResources().getConfiguration().orientation;
        if (this.r != i6) {
            this.r = i6;
            this.s = -1.0f;
        }
        if (this.s == -1.0f) {
            this.s = getMeasuredWidth();
            if (this.v == null && (getParent() instanceof uch) && ((uch) getParent()).getButtonSizeChange() != null) {
                this.v = (LinearLayout.LayoutParams) getLayoutParams();
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.v);
                layoutParams.width = (int) this.s;
                setLayoutParams(layoutParams);
            }
        }
        boolean z2 = false;
        if (this.z == -1) {
            if (this.i == null) {
                i5 = 0;
            } else {
                int iconPadding = getIconPadding();
                int i7 = this.k;
                if (i7 == 0) {
                    i7 = this.i.getIntrinsicWidth();
                }
                i5 = iconPadding + i7;
            }
            this.z = (getMeasuredWidth() - getTextLayoutWidth()) - i5;
        }
        if (this.t == -1) {
            this.t = getPaddingStart();
        }
        if (this.u == -1) {
            this.u = getPaddingEnd();
        }
        if ((getParent() instanceof uch) && ((uch) getParent()).getOrientation() == 0) {
            z2 = true;
        }
        this.y = z2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof tch)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        tch tchVar = (tch) parcelable;
        super.onRestoreInstanceState(tchVar.a);
        setChecked(tchVar.c);
    }

    @Override // android.widget.TextView, android.view.View
    public final Parcelable onSaveInstanceState() {
        tch tchVar = new tch(super.onSaveInstanceState());
        tchVar.c = this.o;
        return tchVar;
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.View
    public final boolean performClick() {
        if (isEnabled() && this.d.u) {
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
    public void setBackground(@NonNull Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        if (!e()) {
            super.setBackgroundColor(i);
            return;
        }
        vch vchVar = this.d;
        if (vchVar.a(false) != null) {
            vchVar.a(false).setTint(i);
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundDrawable(@NonNull Drawable drawable) {
        if (!e()) {
            super.setBackgroundDrawable(drawable);
            return;
        }
        if (drawable == getBackground()) {
            getBackground().setState(drawable.getState());
            return;
        }
        Log.w("MaterialButton", "MaterialButton manages its own background to control elevation, shape, color and states. Consider using backgroundTint, shapeAppearance and other attributes where available. A custom background will ignore these attributes and you should consider handling interaction states such as pressed, focused and disabled");
        vch vchVar = this.d;
        vchVar.r = true;
        MaterialButton materialButton = vchVar.a;
        materialButton.setSupportBackgroundTintList(vchVar.m);
        materialButton.setSupportBackgroundTintMode(vchVar.l);
        super.setBackgroundDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatButton, android.view.View
    public void setBackgroundResource(int i) {
        setBackgroundDrawable(i != 0 ? y2x.w(getContext(), i) : null);
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
        if (e()) {
            this.d.t = z;
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        setCheckedInternal(z);
    }

    public void setCornerRadius(int i) {
        if (e()) {
            vch vchVar = this.d;
            if (vchVar.s && vchVar.j == i) {
                return;
            }
            vchVar.j = i;
            vchVar.s = true;
            vchVar.b = vchVar.b.i(i);
            vchVar.c = null;
            vchVar.d();
        }
    }

    public void setCornerRadiusResource(int i) {
        if (e()) {
            setCornerRadius(getResources().getDimensionPixelSize(i));
        }
    }

    public void setCornerSpringForce(@NonNull z8r z8rVar) {
        vch vchVar = this.d;
        vchVar.d = z8rVar;
        if (vchVar.c != null) {
            vchVar.d();
        }
    }

    public void setDisplayedWidthDecrease(int i) {
        this.D = Math.min(i, this.z);
        j();
        invalidate();
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        if (e()) {
            this.d.a(false).q(f);
        }
    }

    public void setIcon(Drawable drawable) {
        if (this.i != drawable) {
            this.i = drawable;
            h(true);
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconGravity(int i) {
        if (this.q != i) {
            this.q = i;
            i(getMeasuredWidth(), getMeasuredHeight());
        }
    }

    public void setIconPadding(int i) {
        if (this.n != i) {
            this.n = i;
            setCompoundDrawablePadding(i);
        }
    }

    public void setIconResource(int i) {
        setIcon(i != 0 ? y2x.w(getContext(), i) : null);
    }

    public void setIconSize(int i) {
        if (i < 0) {
            xq0.x("iconSize cannot be less than 0");
        } else if (this.k != i) {
            this.k = i;
            h(true);
        }
    }

    public void setIconTint(ColorStateList colorStateList) {
        if (this.h != colorStateList) {
            this.h = colorStateList;
            h(false);
        }
    }

    public void setIconTintMode(PorterDuff.Mode mode) {
        if (this.g != mode) {
            this.g = mode;
            h(false);
        }
    }

    public void setIconTintResource(int i) {
        setIconTint(etn.E(getContext(), i));
    }

    public void setInsetBottom(int i) {
        vch vchVar = this.d;
        vchVar.b(vchVar.h, i);
    }

    public void setInsetTop(int i) {
        vch vchVar = this.d;
        vchVar.b(i, vchVar.i);
    }

    public void setInternalBackground(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
    }

    public void setOnPressedChangeListenerInternal(sch schVar) {
        this.f = schVar;
    }

    public void setOpticalCenterEnabled(boolean z) {
        if (this.w != z) {
            this.w = z;
            vch vchVar = this.d;
            if (z) {
                uvg uvgVar = new uvg(3, this);
                vchVar.e = uvgVar;
                a a = vchVar.a(false);
                if (a != null) {
                    a.E = uvgVar;
                }
            } else {
                vchVar.e = null;
                a a2 = vchVar.a(false);
                if (a2 != null) {
                    a2.E = null;
                }
            }
            post(new dyg(2, this));
        }
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        sch schVar = this.f;
        if (schVar != null) {
            ((uch) ((n7b) schVar).a).invalidate();
        }
        super.setPressed(z);
        f(false);
    }

    public void setRippleColor(ColorStateList colorStateList) {
        if (e()) {
            vch vchVar = this.d;
            MaterialButton materialButton = vchVar.a;
            if (vchVar.o != colorStateList) {
                vchVar.o = colorStateList;
                if (materialButton.getBackground() instanceof RippleDrawable) {
                    ((RippleDrawable) materialButton.getBackground()).setColor(leo.b(colorStateList));
                }
            }
        }
    }

    public void setRippleColorResource(int i) {
        if (e()) {
            setRippleColor(etn.E(getContext(), i));
        }
    }

    @Override // defpackage.fvp
    public void setShapeAppearanceModel(@NonNull eup eupVar) {
        if (!e()) {
            xq0.q("Attempted to set ShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        vch vchVar = this.d;
        vchVar.b = eupVar;
        vchVar.c = null;
        vchVar.d();
    }

    public void setShouldDrawSurfaceColorStroke(boolean z) {
        if (e()) {
            vch vchVar = this.d;
            vchVar.q = z;
            vchVar.e();
        }
    }

    public void setSizeChange(@NonNull ier ierVar) {
        if (this.A != ierVar) {
            this.A = ierVar;
            f(true);
        }
    }

    public void setStateListShapeAppearanceModel(@NonNull her herVar) {
        if (!e()) {
            xq0.q("Attempted to set StateListShapeAppearanceModel on a MaterialButton which has an overwritten background.");
            return;
        }
        vch vchVar = this.d;
        if (vchVar.d == null && herVar.d()) {
            vchVar.d = d();
            if (vchVar.c != null) {
                vchVar.d();
            }
        }
        vchVar.c = herVar;
        vchVar.d();
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        if (e()) {
            vch vchVar = this.d;
            if (vchVar.n != colorStateList) {
                vchVar.n = colorStateList;
                vchVar.e();
            }
        }
    }

    public void setStrokeColorResource(int i) {
        if (e()) {
            setStrokeColor(etn.E(getContext(), i));
        }
    }

    public void setStrokeWidth(int i) {
        if (e()) {
            vch vchVar = this.d;
            if (vchVar.k != i) {
                vchVar.k = i;
                vchVar.e();
            }
        }
    }

    public void setStrokeWidthResource(int i) {
        if (e()) {
            setStrokeWidth(getResources().getDimensionPixelSize(i));
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        if (!e()) {
            super.setSupportBackgroundTintList(colorStateList);
            return;
        }
        vch vchVar = this.d;
        if (vchVar.m != colorStateList) {
            vchVar.m = colorStateList;
            if (vchVar.a(false) != null) {
                vchVar.a(false).setTintList(vchVar.m);
            }
        }
    }

    @Override // androidx.appcompat.widget.AppCompatButton
    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        if (!e()) {
            super.setSupportBackgroundTintMode(mode);
            return;
        }
        vch vchVar = this.d;
        if (vchVar.l != mode) {
            vchVar.l = mode;
            if (vchVar.a(false) == null || vchVar.l == null) {
                return;
            }
            vchVar.a(false).setTintMode(vchVar.l);
        }
    }

    @Override // android.view.View
    public void setTextAlignment(int i) {
        super.setTextAlignment(i);
        i(getMeasuredWidth(), getMeasuredHeight());
    }

    public void setToggleCheckedStateOnClick(boolean z) {
        this.d.u = z;
    }

    @Override // android.widget.TextView
    public void setWidth(int i) {
        this.s = -1.0f;
        super.setWidth(i);
    }

    public void setWidthChangeMax(int i) {
        if (this.B != i) {
            this.B = i;
            f(true);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.o);
    }

    public MaterialButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.materialButtonStyle);
    }

    public MaterialButton(@NonNull Context context) {
        this(context, null);
    }
}
