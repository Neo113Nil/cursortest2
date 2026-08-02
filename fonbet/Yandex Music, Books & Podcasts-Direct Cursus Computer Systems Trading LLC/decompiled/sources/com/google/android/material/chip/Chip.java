package com.google.android.material.chip;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Checkable;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.bz2;
import defpackage.etn;
import defpackage.eup;
import defpackage.fvp;
import defpackage.gas;
import defpackage.gdh;
import defpackage.ivf;
import defpackage.kz2;
import defpackage.las;
import defpackage.leo;
import defpackage.lq0;
import defpackage.mj4;
import defpackage.ngg;
import defpackage.nj4;
import defpackage.oj4;
import defpackage.pj4;
import defpackage.qj4;
import defpackage.qq6;
import defpackage.rvf;
import defpackage.ub;
import defpackage.vdn;
import defpackage.vj4;
import defpackage.wdu;
import defpackage.x9s;
import defpackage.y2x;
import defpackage.zei;
import io.appmetrica.analytics.impl.C0479n3;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class Chip extends lq0 implements fvp, Checkable {
    public static final Rect x = new Rect();
    public static final int[] y = {R.attr.state_selected};
    public static final int[] z = {R.attr.state_checkable};
    public qj4 e;
    public InsetDrawable f;
    public RippleDrawable g;
    public View.OnClickListener h;
    public CompoundButton.OnCheckedChangeListener i;
    public gdh j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public int q;
    public CharSequence r;
    public final pj4 s;
    public boolean t;
    public final Rect u;
    public final RectF v;
    public final nj4 w;

    public Chip(Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_Chip_Action), attributeSet, i);
        int resourceId;
        this.u = new Rect();
        this.v = new RectF();
        int i2 = 0;
        this.w = new nj4(i2, this);
        Context context2 = getContext();
        if (attributeSet != null) {
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", C0479n3.g) != null) {
                Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableLeft") != null) {
                qq6.d("Please set left drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableStart") != null) {
                qq6.d("Please set start drawable using R.attr#chipIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableEnd") != null) {
                qq6.d("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (attributeSet.getAttributeValue("http://schemas.android.com/apk/res/android", "drawableRight") != null) {
                qq6.d("Please set end drawable using R.attr#closeIcon.");
                throw null;
            }
            if (!attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res/android", "singleLine", true) || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "lines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "minLines", 1) != 1 || attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "maxLines", 1) != 1) {
                qq6.d("Chip does not support multi-line text");
                throw null;
            }
            if (attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 8388627) != 8388627) {
                Log.w("Chip", "Chip text must be vertically center and start aligned");
            }
        }
        qj4 qj4Var = new qj4(context2, attributeSet, i);
        Context context3 = qj4Var.U0;
        int[] iArr = vdn.h;
        TypedArray B = bcx.B(context3, attributeSet, iArr, i, ru.yandex.music.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        qj4Var.u1 = B.hasValue(37);
        Context context4 = qj4Var.U0;
        ColorStateList D = ivf.D(context4, B, 24);
        if (qj4Var.H != D) {
            qj4Var.H = D;
            qj4Var.onStateChange(qj4Var.getState());
        }
        ColorStateList D2 = ivf.D(context4, B, 11);
        if (qj4Var.I != D2) {
            qj4Var.I = D2;
            qj4Var.onStateChange(qj4Var.getState());
        }
        float dimension = B.getDimension(19, 0.0f);
        if (qj4Var.J != dimension) {
            qj4Var.J = dimension;
            qj4Var.invalidateSelf();
            qj4Var.J();
        }
        if (B.hasValue(12)) {
            qj4Var.P(B.getDimension(12, 0.0f));
        }
        qj4Var.U(ivf.D(context4, B, 22));
        qj4Var.V(B.getDimension(23, 0.0f));
        qj4Var.f0(ivf.D(context4, B, 36));
        String text = B.getText(5);
        text = text == null ? "" : text;
        boolean equals = TextUtils.equals(qj4Var.Z, text);
        las lasVar = qj4Var.a1;
        if (!equals) {
            qj4Var.Z = text;
            lasVar.e = true;
            qj4Var.invalidateSelf();
            qj4Var.J();
        }
        x9s x9sVar = (!B.hasValue(0) || (resourceId = B.getResourceId(0, 0)) == 0) ? null : new x9s(context4, resourceId);
        x9sVar.l = B.getDimension(1, x9sVar.l);
        lasVar.b(x9sVar, context4);
        int i3 = B.getInt(3, 0);
        if (i3 == 1) {
            qj4Var.r1 = TextUtils.TruncateAt.START;
        } else if (i3 == 2) {
            qj4Var.r1 = TextUtils.TruncateAt.MIDDLE;
        } else if (i3 == 3) {
            qj4Var.r1 = TextUtils.TruncateAt.END;
        }
        qj4Var.T(B.getBoolean(18, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            qj4Var.T(B.getBoolean(15, false));
        }
        qj4Var.Q(ivf.F(context4, B, 14));
        if (B.hasValue(17)) {
            qj4Var.S(ivf.D(context4, B, 17));
        }
        qj4Var.R(B.getDimension(16, -1.0f));
        qj4Var.c0(B.getBoolean(31, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            qj4Var.c0(B.getBoolean(26, false));
        }
        qj4Var.W(ivf.F(context4, B, 25));
        qj4Var.b0(ivf.D(context4, B, 30));
        qj4Var.Y(B.getDimension(28, 0.0f));
        qj4Var.L(B.getBoolean(6, false));
        qj4Var.O(B.getBoolean(10, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            qj4Var.O(B.getBoolean(8, false));
        }
        qj4Var.M(ivf.F(context4, B, 7));
        if (B.hasValue(9)) {
            qj4Var.N(ivf.D(context4, B, 9));
        }
        qj4Var.K0 = zei.a(context4, B, 39);
        qj4Var.L0 = zei.a(context4, B, 33);
        float dimension2 = B.getDimension(21, 0.0f);
        if (qj4Var.M0 != dimension2) {
            qj4Var.M0 = dimension2;
            qj4Var.invalidateSelf();
            qj4Var.J();
        }
        qj4Var.e0(B.getDimension(35, 0.0f));
        qj4Var.d0(B.getDimension(34, 0.0f));
        float dimension3 = B.getDimension(41, 0.0f);
        if (qj4Var.P0 != dimension3) {
            qj4Var.P0 = dimension3;
            qj4Var.invalidateSelf();
            qj4Var.J();
        }
        float dimension4 = B.getDimension(40, 0.0f);
        if (qj4Var.Q0 != dimension4) {
            qj4Var.Q0 = dimension4;
            qj4Var.invalidateSelf();
            qj4Var.J();
        }
        qj4Var.Z(B.getDimension(29, 0.0f));
        qj4Var.X(B.getDimension(27, 0.0f));
        float dimension5 = B.getDimension(13, 0.0f);
        if (qj4Var.T0 != dimension5) {
            qj4Var.T0 = dimension5;
            qj4Var.invalidateSelf();
            qj4Var.J();
        }
        qj4Var.t1 = B.getDimensionPixelSize(4, Integer.MAX_VALUE);
        B.recycle();
        bcx.t(context2, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_Chip_Action);
        bcx.u(context2, attributeSet, iArr, i, ru.yandex.music.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, ru.yandex.music.R.style.Widget_MaterialComponents_Chip_Action);
        this.o = obtainStyledAttributes.getBoolean(32, false);
        TypedValue C = ngg.C(context2, ru.yandex.music.R.attr.minTouchTargetSize);
        this.q = (int) Math.ceil(obtainStyledAttributes.getDimension(20, (int) ((C == null || C.type != 5) ? context2.getResources().getDimension(ru.yandex.music.R.dimen.mtrl_min_touch_target_size) : C.getDimension(context2.getResources().getDisplayMetrics()))));
        obtainStyledAttributes.recycle();
        setChipDrawable(qj4Var);
        qj4Var.q(getElevation());
        bcx.t(context2, attributeSet, i, ru.yandex.music.R.style.Widget_MaterialComponents_Chip_Action);
        bcx.u(context2, attributeSet, iArr, i, ru.yandex.music.R.style.Widget_MaterialComponents_Chip_Action, new int[0]);
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet, iArr, i, ru.yandex.music.R.style.Widget_MaterialComponents_Chip_Action);
        boolean hasValue = obtainStyledAttributes2.hasValue(37);
        obtainStyledAttributes2.recycle();
        this.s = new pj4(this, this);
        e();
        if (!hasValue) {
            setOutlineProvider(new oj4(i2, this));
        }
        setChecked(this.k);
        setText(qj4Var.Z);
        setEllipsize(qj4Var.r1);
        h();
        if (!this.e.s1) {
            setLines(1);
            setHorizontallyScrolling(true);
        }
        setGravity(8388627);
        g();
        if (this.o) {
            setMinHeight(this.q);
        }
        this.p = getLayoutDirection();
        super.setOnCheckedChangeListener(new mj4(i2, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public RectF getCloseIconTouchBounds() {
        RectF rectF = this.v;
        rectF.setEmpty();
        if (d() && this.h != null) {
            qj4 qj4Var = this.e;
            Rect bounds = qj4Var.getBounds();
            rectF.setEmpty();
            if (qj4Var.i0()) {
                float f = qj4Var.T0 + qj4Var.S0 + qj4Var.E0 + qj4Var.R0 + qj4Var.Q0;
                if (qj4Var.getLayoutDirection() == 0) {
                    float f2 = bounds.right;
                    rectF.right = f2;
                    rectF.left = f2 - f;
                } else {
                    float f3 = bounds.left;
                    rectF.left = f3;
                    rectF.right = f3 + f;
                }
                rectF.top = bounds.top;
                rectF.bottom = bounds.bottom;
            }
        }
        return rectF;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public Rect getCloseIconTouchBoundsInt() {
        RectF closeIconTouchBounds = getCloseIconTouchBounds();
        int i = (int) closeIconTouchBounds.left;
        int i2 = (int) closeIconTouchBounds.top;
        int i3 = (int) closeIconTouchBounds.right;
        int i4 = (int) closeIconTouchBounds.bottom;
        Rect rect = this.u;
        rect.set(i, i2, i3, i4);
        return rect;
    }

    private x9s getTextAppearance() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.a1.g;
        }
        return null;
    }

    private void setCloseIconHovered(boolean z2) {
        if (this.m != z2) {
            this.m = z2;
            refreshDrawableState();
        }
    }

    private void setCloseIconPressed(boolean z2) {
        if (this.l != z2) {
            this.l = z2;
            refreshDrawableState();
        }
    }

    public final void c(int i) {
        this.q = i;
        if (!this.o) {
            InsetDrawable insetDrawable = this.f;
            if (insetDrawable == null) {
                f();
                return;
            } else {
                if (insetDrawable != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int max = Math.max(0, i - ((int) this.e.J));
        int max2 = Math.max(0, i - this.e.getIntrinsicWidth());
        if (max2 <= 0 && max <= 0) {
            InsetDrawable insetDrawable2 = this.f;
            if (insetDrawable2 == null) {
                f();
                return;
            } else {
                if (insetDrawable2 != null) {
                    this.f = null;
                    setMinWidth(0);
                    setMinHeight((int) getChipMinHeight());
                    f();
                    return;
                }
                return;
            }
        }
        int i2 = max2 > 0 ? max2 / 2 : 0;
        int i3 = max > 0 ? max / 2 : 0;
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            if (rect.top == i3 && rect.bottom == i3 && rect.left == i2 && rect.right == i2) {
                f();
                return;
            }
        }
        if (getMinHeight() != i) {
            setMinHeight(i);
        }
        if (getMinWidth() != i) {
            setMinWidth(i);
        }
        this.f = new InsetDrawable((Drawable) this.e, i2, i3, i2, i3);
        f();
    }

    public final boolean d() {
        qj4 qj4Var = this.e;
        if (qj4Var == null) {
            return false;
        }
        Drawable drawable = qj4Var.B0;
        if (drawable == null) {
            drawable = null;
        }
        return drawable != null;
    }

    @Override // android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return !this.t ? super.dispatchHoverEvent(motionEvent) : this.s.m(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.t) {
            return super.dispatchKeyEvent(keyEvent);
        }
        pj4 pj4Var = this.s;
        if (!pj4Var.n(keyEvent) || pj4Var.l == Integer.MIN_VALUE) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [boolean, int] */
    @Override // defpackage.lq0, android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        qj4 qj4Var = this.e;
        boolean z2 = false;
        int i = 0;
        z2 = false;
        if (qj4Var != null && qj4.I(qj4Var.B0)) {
            qj4 qj4Var2 = this.e;
            ?? isEnabled = isEnabled();
            int i2 = isEnabled;
            if (this.n) {
                i2 = isEnabled + 1;
            }
            int i3 = i2;
            if (this.m) {
                i3 = i2 + 1;
            }
            int i4 = i3;
            if (this.l) {
                i4 = i3 + 1;
            }
            int i5 = i4;
            if (isChecked()) {
                i5 = i4 + 1;
            }
            int[] iArr = new int[i5];
            if (isEnabled()) {
                iArr[0] = 16842910;
                i = 1;
            }
            if (this.n) {
                iArr[i] = 16842908;
                i++;
            }
            if (this.m) {
                iArr[i] = 16843623;
                i++;
            }
            if (this.l) {
                iArr[i] = 16842919;
                i++;
            }
            if (isChecked()) {
                iArr[i] = 16842913;
            }
            z2 = qj4Var2.a0(iArr);
        }
        if (z2) {
            invalidate();
        }
    }

    public final void e() {
        qj4 qj4Var;
        if (!d() || (qj4Var = this.e) == null || !qj4Var.A0 || this.h == null) {
            wdu.q(this, null);
            this.t = false;
        } else {
            wdu.q(this, this.s);
            this.t = true;
        }
    }

    public final void f() {
        this.g = new RippleDrawable(leo.b(this.e.Y), getBackgroundDrawable(), null);
        this.e.getClass();
        setBackground(this.g);
        g();
    }

    public final void g() {
        qj4 qj4Var;
        if (TextUtils.isEmpty(getText()) || (qj4Var = this.e) == null) {
            return;
        }
        int F = (int) (qj4Var.F() + qj4Var.T0 + qj4Var.Q0);
        qj4 qj4Var2 = this.e;
        int E = (int) (qj4Var2.E() + qj4Var2.M0 + qj4Var2.P0);
        if (this.f != null) {
            Rect rect = new Rect();
            this.f.getPadding(rect);
            E += rect.left;
            F += rect.right;
        }
        setPaddingRelative(E, getPaddingTop(), F, getPaddingBottom());
    }

    @Override // android.widget.CheckBox, android.widget.CompoundButton, android.widget.Button, android.widget.TextView, android.view.View
    @NonNull
    public CharSequence getAccessibilityClassName() {
        if (!TextUtils.isEmpty(this.r)) {
            return this.r;
        }
        qj4 qj4Var = this.e;
        if (qj4Var == null || !qj4Var.G0) {
            return isClickable() ? "android.widget.Button" : "android.view.View";
        }
        ViewParent parent = getParent();
        return ((parent instanceof vj4) && ((vj4) parent).h.a) ? "android.widget.RadioButton" : "android.widget.Button";
    }

    public Drawable getBackgroundDrawable() {
        InsetDrawable insetDrawable = this.f;
        return insetDrawable == null ? this.e : insetDrawable;
    }

    public Drawable getCheckedIcon() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.I0;
        }
        return null;
    }

    public ColorStateList getCheckedIconTint() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.J0;
        }
        return null;
    }

    public ColorStateList getChipBackgroundColor() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.I;
        }
        return null;
    }

    public float getChipCornerRadius() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return Math.max(0.0f, qj4Var.G());
        }
        return 0.0f;
    }

    public Drawable getChipDrawable() {
        return this.e;
    }

    public float getChipEndPadding() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.T0;
        }
        return 0.0f;
    }

    public Drawable getChipIcon() {
        Drawable drawable;
        qj4 qj4Var = this.e;
        if (qj4Var == null || (drawable = qj4Var.w0) == null) {
            return null;
        }
        return drawable;
    }

    public float getChipIconSize() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.y0;
        }
        return 0.0f;
    }

    public ColorStateList getChipIconTint() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.x0;
        }
        return null;
    }

    public float getChipMinHeight() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.J;
        }
        return 0.0f;
    }

    public float getChipStartPadding() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.M0;
        }
        return 0.0f;
    }

    public ColorStateList getChipStrokeColor() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.L;
        }
        return null;
    }

    public float getChipStrokeWidth() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.X;
        }
        return 0.0f;
    }

    @Deprecated
    public CharSequence getChipText() {
        return getText();
    }

    public Drawable getCloseIcon() {
        Drawable drawable;
        qj4 qj4Var = this.e;
        if (qj4Var == null || (drawable = qj4Var.B0) == null) {
            return null;
        }
        return drawable;
    }

    public CharSequence getCloseIconContentDescription() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.F0;
        }
        return null;
    }

    public float getCloseIconEndPadding() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.S0;
        }
        return 0.0f;
    }

    public float getCloseIconSize() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.E0;
        }
        return 0.0f;
    }

    public float getCloseIconStartPadding() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.R0;
        }
        return 0.0f;
    }

    public ColorStateList getCloseIconTint() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.D0;
        }
        return null;
    }

    @Override // android.widget.TextView
    public TextUtils.TruncateAt getEllipsize() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.r1;
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        if (this.t) {
            pj4 pj4Var = this.s;
            if (pj4Var.l == 1 || pj4Var.k == 1) {
                rect.set(getCloseIconTouchBoundsInt());
                return;
            }
        }
        super.getFocusedRect(rect);
    }

    public zei getHideMotionSpec() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.L0;
        }
        return null;
    }

    public float getIconEndPadding() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.O0;
        }
        return 0.0f;
    }

    public float getIconStartPadding() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.N0;
        }
        return 0.0f;
    }

    public ColorStateList getRippleColor() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.Y;
        }
        return null;
    }

    @NonNull
    public eup getShapeAppearanceModel() {
        return this.e.b.a;
    }

    public zei getShowMotionSpec() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.K0;
        }
        return null;
    }

    public float getTextEndPadding() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.Q0;
        }
        return 0.0f;
    }

    public float getTextStartPadding() {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            return qj4Var.P0;
        }
        return 0.0f;
    }

    public final void h() {
        TextPaint paint = getPaint();
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            paint.drawableState = qj4Var.getState();
        }
        x9s textAppearance = getTextAppearance();
        if (textAppearance != null) {
            textAppearance.d(getContext(), paint, this.w);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        rvf.K(this, this.e);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, y);
        }
        qj4 qj4Var = this.e;
        if (qj4Var != null && qj4Var.G0) {
            View.mergeDrawableStates(onCreateDrawableState, z);
        }
        return onCreateDrawableState;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z2, int i, Rect rect) {
        super.onFocusChanged(z2, i, rect);
        if (this.t) {
            this.s.t(z2, i, rect);
        }
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 7) {
            setCloseIconHovered(getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()));
        } else if (actionMasked == 10) {
            setCloseIconHovered(false);
        }
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(getAccessibilityClassName());
        qj4 qj4Var = this.e;
        accessibilityNodeInfo.setCheckable(qj4Var != null && qj4Var.G0);
        accessibilityNodeInfo.setClickable(isClickable());
        if (getParent() instanceof vj4) {
            vj4 vj4Var = (vj4) getParent();
            if (vj4Var.c) {
                i = 0;
                for (int i2 = 0; i2 < vj4Var.getChildCount(); i2++) {
                    View childAt = vj4Var.getChildAt(i2);
                    if ((childAt instanceof Chip) && vj4Var.getChildAt(i2).getVisibility() == 0) {
                        if (((Chip) childAt) == this) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            i = -1;
            Object tag = getTag(ru.yandex.music.R.id.row_index_key);
            accessibilityNodeInfo.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ub.d(isChecked(), tag instanceof Integer ? ((Integer) tag).intValue() : -1, 1, i, 1).a);
        }
    }

    @Override // android.widget.Button, android.widget.TextView, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i) {
        return (getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY()) && isEnabled()) ? PointerIcon.getSystemIcon(getContext(), 1002) : super.onResolvePointerIcon(motionEvent, i);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        if (this.p != i) {
            this.p = i;
            g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r0 != 3) goto L28;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        boolean contains = getCloseIconTouchBounds().contains(motionEvent.getX(), motionEvent.getY());
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (this.l) {
                        if (!contains) {
                            setCloseIconPressed(false);
                        }
                        z2 = true;
                    }
                }
                z2 = false;
            } else if (this.l) {
                playSoundEffect(0);
                View.OnClickListener onClickListener = this.h;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                if (this.t) {
                    this.s.z(1, 1);
                }
                z2 = true;
                setCloseIconPressed(false);
            }
            z2 = false;
            setCloseIconPressed(false);
        } else {
            if (contains) {
                setCloseIconPressed(true);
                z2 = true;
            }
            z2 = false;
        }
        return z2 || super.onTouchEvent(motionEvent);
    }

    public void setAccessibilityClassName(CharSequence charSequence) {
        this.r = charSequence;
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackground(drawable);
        } else {
            Log.w("Chip", "Do not set the background; Chip manages its own background drawable.");
        }
    }

    @Override // android.view.View
    public void setBackgroundColor(int i) {
        Log.w("Chip", "Do not set the background color; Chip manages its own background drawable.");
    }

    @Override // defpackage.lq0, android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        if (drawable == getBackgroundDrawable() || drawable == this.g) {
            super.setBackgroundDrawable(drawable);
        } else {
            Log.w("Chip", "Do not set the background drawable; Chip manages its own background drawable.");
        }
    }

    @Override // defpackage.lq0, android.view.View
    public void setBackgroundResource(int i) {
        Log.w("Chip", "Do not set the background resource; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintList(ColorStateList colorStateList) {
        Log.w("Chip", "Do not set the background tint list; Chip manages its own background drawable.");
    }

    @Override // android.view.View
    public void setBackgroundTintMode(PorterDuff.Mode mode) {
        Log.w("Chip", "Do not set the background tint mode; Chip manages its own background drawable.");
    }

    public void setCheckable(boolean z2) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.L(z2);
        }
    }

    public void setCheckableResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.L(qj4Var.U0.getResources().getBoolean(i));
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(boolean z2) {
        qj4 qj4Var = this.e;
        if (qj4Var == null) {
            this.k = z2;
        } else if (qj4Var.G0) {
            super.setChecked(z2);
        }
    }

    public void setCheckedIcon(Drawable drawable) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.M(drawable);
        }
    }

    @Deprecated
    public void setCheckedIconEnabled(boolean z2) {
        setCheckedIconVisible(z2);
    }

    @Deprecated
    public void setCheckedIconEnabledResource(int i) {
        setCheckedIconVisible(i);
    }

    public void setCheckedIconResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.M(y2x.w(qj4Var.U0, i));
        }
    }

    public void setCheckedIconTint(ColorStateList colorStateList) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.N(colorStateList);
        }
    }

    public void setCheckedIconTintResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.N(etn.E(qj4Var.U0, i));
        }
    }

    public void setCheckedIconVisible(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.O(qj4Var.U0.getResources().getBoolean(i));
        }
    }

    public void setChipBackgroundColor(ColorStateList colorStateList) {
        qj4 qj4Var = this.e;
        if (qj4Var == null || qj4Var.I == colorStateList) {
            return;
        }
        qj4Var.I = colorStateList;
        qj4Var.onStateChange(qj4Var.getState());
    }

    public void setChipBackgroundColorResource(int i) {
        ColorStateList E;
        qj4 qj4Var = this.e;
        if (qj4Var == null || qj4Var.I == (E = etn.E(qj4Var.U0, i))) {
            return;
        }
        qj4Var.I = E;
        qj4Var.onStateChange(qj4Var.getState());
    }

    @Deprecated
    public void setChipCornerRadius(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.P(f);
        }
    }

    @Deprecated
    public void setChipCornerRadiusResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.P(qj4Var.U0.getResources().getDimension(i));
        }
    }

    public void setChipDrawable(@NonNull qj4 qj4Var) {
        qj4 qj4Var2 = this.e;
        if (qj4Var2 != qj4Var) {
            if (qj4Var2 != null) {
                qj4Var2.q1 = new WeakReference(null);
            }
            this.e = qj4Var;
            qj4Var.s1 = false;
            qj4Var.q1 = new WeakReference(this);
            c(this.q);
        }
    }

    public void setChipEndPadding(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var == null || qj4Var.T0 == f) {
            return;
        }
        qj4Var.T0 = f;
        qj4Var.invalidateSelf();
        qj4Var.J();
    }

    public void setChipEndPaddingResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            float dimension = qj4Var.U0.getResources().getDimension(i);
            if (qj4Var.T0 != dimension) {
                qj4Var.T0 = dimension;
                qj4Var.invalidateSelf();
                qj4Var.J();
            }
        }
    }

    public void setChipIcon(Drawable drawable) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.Q(drawable);
        }
    }

    @Deprecated
    public void setChipIconEnabled(boolean z2) {
        setChipIconVisible(z2);
    }

    @Deprecated
    public void setChipIconEnabledResource(int i) {
        setChipIconVisible(i);
    }

    public void setChipIconResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.Q(y2x.w(qj4Var.U0, i));
        }
    }

    public void setChipIconSize(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.R(f);
        }
    }

    public void setChipIconSizeResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.R(qj4Var.U0.getResources().getDimension(i));
        }
    }

    public void setChipIconTint(ColorStateList colorStateList) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.S(colorStateList);
        }
    }

    public void setChipIconTintResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.S(etn.E(qj4Var.U0, i));
        }
    }

    public void setChipIconVisible(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.T(qj4Var.U0.getResources().getBoolean(i));
        }
    }

    public void setChipMinHeight(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var == null || qj4Var.J == f) {
            return;
        }
        qj4Var.J = f;
        qj4Var.invalidateSelf();
        qj4Var.J();
    }

    public void setChipMinHeightResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            float dimension = qj4Var.U0.getResources().getDimension(i);
            if (qj4Var.J != dimension) {
                qj4Var.J = dimension;
                qj4Var.invalidateSelf();
                qj4Var.J();
            }
        }
    }

    public void setChipStartPadding(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var == null || qj4Var.M0 == f) {
            return;
        }
        qj4Var.M0 = f;
        qj4Var.invalidateSelf();
        qj4Var.J();
    }

    public void setChipStartPaddingResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            float dimension = qj4Var.U0.getResources().getDimension(i);
            if (qj4Var.M0 != dimension) {
                qj4Var.M0 = dimension;
                qj4Var.invalidateSelf();
                qj4Var.J();
            }
        }
    }

    public void setChipStrokeColor(ColorStateList colorStateList) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.U(colorStateList);
        }
    }

    public void setChipStrokeColorResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.U(etn.E(qj4Var.U0, i));
        }
    }

    public void setChipStrokeWidth(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.V(f);
        }
    }

    public void setChipStrokeWidthResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.V(qj4Var.U0.getResources().getDimension(i));
        }
    }

    @Deprecated
    public void setChipText(CharSequence charSequence) {
        setText(charSequence);
    }

    @Deprecated
    public void setChipTextResource(int i) {
        setText(getResources().getString(i));
    }

    public void setCloseIcon(Drawable drawable) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.W(drawable);
        }
        e();
    }

    public void setCloseIconContentDescription(CharSequence charSequence) {
        qj4 qj4Var = this.e;
        if (qj4Var == null || qj4Var.F0 == charSequence) {
            return;
        }
        kz2 c = kz2.c();
        c.getClass();
        bz2 bz2Var = gas.a;
        qj4Var.F0 = c.d(charSequence);
        qj4Var.invalidateSelf();
    }

    @Deprecated
    public void setCloseIconEnabled(boolean z2) {
        setCloseIconVisible(z2);
    }

    @Deprecated
    public void setCloseIconEnabledResource(int i) {
        setCloseIconVisible(i);
    }

    public void setCloseIconEndPadding(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.X(f);
        }
    }

    public void setCloseIconEndPaddingResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.X(qj4Var.U0.getResources().getDimension(i));
        }
    }

    public void setCloseIconResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.W(y2x.w(qj4Var.U0, i));
        }
        e();
    }

    public void setCloseIconSize(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.Y(f);
        }
    }

    public void setCloseIconSizeResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.Y(qj4Var.U0.getResources().getDimension(i));
        }
    }

    public void setCloseIconStartPadding(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.Z(f);
        }
    }

    public void setCloseIconStartPaddingResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.Z(qj4Var.U0.getResources().getDimension(i));
        }
    }

    public void setCloseIconTint(ColorStateList colorStateList) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.b0(colorStateList);
        }
    }

    public void setCloseIconTintResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.b0(etn.E(qj4Var.U0, i));
        }
    }

    public void setCloseIconVisible(int i) {
        setCloseIconVisible(getResources().getBoolean(i));
    }

    @Override // defpackage.lq0, android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            qq6.d("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        } else {
            qq6.d("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // defpackage.lq0, android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            qq6.d("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        } else {
            qq6.d("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            qq6.d("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            qq6.d("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        if (i != 0) {
            qq6.d("Please set start drawable using R.attr#chipIcon.");
        } else if (i3 == 0) {
            super.setCompoundDrawablesWithIntrinsicBounds(i, i2, i3, i4);
        } else {
            qq6.d("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.q(f);
        }
    }

    @Override // android.widget.TextView
    public void setEllipsize(TextUtils.TruncateAt truncateAt) {
        if (this.e == null) {
            return;
        }
        if (truncateAt == TextUtils.TruncateAt.MARQUEE) {
            qq6.d("Text within a chip are not allowed to scroll.");
            return;
        }
        super.setEllipsize(truncateAt);
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.r1 = truncateAt;
        }
    }

    public void setEnsureMinTouchTargetSize(boolean z2) {
        this.o = z2;
        c(this.q);
    }

    @Override // android.widget.TextView
    public void setGravity(int i) {
        if (i != 8388627) {
            Log.w("Chip", "Chip text must be vertically center and start aligned");
        } else {
            super.setGravity(i);
        }
    }

    public void setHideMotionSpec(zei zeiVar) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.L0 = zeiVar;
        }
    }

    public void setHideMotionSpecResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.L0 = zei.b(qj4Var.U0, i);
        }
    }

    public void setIconEndPadding(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.d0(f);
        }
    }

    public void setIconEndPaddingResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.d0(qj4Var.U0.getResources().getDimension(i));
        }
    }

    public void setIconStartPadding(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.e0(f);
        }
    }

    public void setIconStartPaddingResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.e0(qj4Var.U0.getResources().getDimension(i));
        }
    }

    public void setInternalOnCheckedChangeListener(gdh gdhVar) {
        this.j = gdhVar;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i) {
        if (this.e == null) {
            return;
        }
        super.setLayoutDirection(i);
    }

    @Override // android.widget.TextView
    public void setLines(int i) {
        if (i <= 1) {
            super.setLines(i);
        } else {
            qq6.d("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxLines(int i) {
        if (i <= 1) {
            super.setMaxLines(i);
        } else {
            qq6.d("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public void setMaxWidth(int i) {
        super.setMaxWidth(i);
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.t1 = i;
        }
    }

    @Override // android.widget.TextView
    public void setMinLines(int i) {
        if (i <= 1) {
            super.setMinLines(i);
        } else {
            qq6.d("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        this.i = onCheckedChangeListener;
    }

    public void setOnCloseIconClickListener(View.OnClickListener onClickListener) {
        this.h = onClickListener;
        e();
    }

    public void setRippleColor(ColorStateList colorStateList) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.f0(colorStateList);
        }
        this.e.getClass();
        f();
    }

    public void setRippleColorResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.f0(etn.E(qj4Var.U0, i));
            this.e.getClass();
            f();
        }
    }

    @Override // defpackage.fvp
    public void setShapeAppearanceModel(@NonNull eup eupVar) {
        this.e.setShapeAppearanceModel(eupVar);
    }

    public void setShowMotionSpec(zei zeiVar) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.K0 = zeiVar;
        }
    }

    public void setShowMotionSpecResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.K0 = zei.b(qj4Var.U0, i);
        }
    }

    @Override // android.widget.TextView
    public void setSingleLine(boolean z2) {
        if (z2) {
            super.setSingleLine(z2);
        } else {
            qq6.d("Chip does not support multi-line text");
        }
    }

    @Override // android.widget.TextView
    public final void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        qj4 qj4Var = this.e;
        if (qj4Var == null) {
            return;
        }
        if (charSequence == null) {
            charSequence = "";
        }
        super.setText(qj4Var.s1 ? null : charSequence, bufferType);
        qj4 qj4Var2 = this.e;
        if (qj4Var2 == null || TextUtils.equals(qj4Var2.Z, charSequence)) {
            return;
        }
        qj4Var2.Z = charSequence;
        qj4Var2.a1.e = true;
        qj4Var2.invalidateSelf();
        qj4Var2.J();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            Context context2 = qj4Var.U0;
            qj4Var.a1.b(new x9s(context2, i), context2);
        }
        h();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(getContext(), i);
    }

    public void setTextEndPadding(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var == null || qj4Var.Q0 == f) {
            return;
        }
        qj4Var.Q0 = f;
        qj4Var.invalidateSelf();
        qj4Var.J();
    }

    public void setTextEndPaddingResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            float dimension = qj4Var.U0.getResources().getDimension(i);
            if (qj4Var.Q0 != dimension) {
                qj4Var.Q0 = dimension;
                qj4Var.invalidateSelf();
                qj4Var.J();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        super.setTextSize(i, f);
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            float applyDimension = TypedValue.applyDimension(i, f, getResources().getDisplayMetrics());
            las lasVar = qj4Var.a1;
            x9s x9sVar = lasVar.g;
            if (x9sVar != null) {
                x9sVar.l = applyDimension;
                lasVar.a.setTextSize(applyDimension);
                qj4Var.a();
            }
        }
        h();
    }

    public void setTextStartPadding(float f) {
        qj4 qj4Var = this.e;
        if (qj4Var == null || qj4Var.P0 == f) {
            return;
        }
        qj4Var.P0 = f;
        qj4Var.invalidateSelf();
        qj4Var.J();
    }

    public void setTextStartPaddingResource(int i) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            float dimension = qj4Var.U0.getResources().getDimension(i);
            if (qj4Var.P0 != dimension) {
                qj4Var.P0 = dimension;
                qj4Var.invalidateSelf();
                qj4Var.J();
            }
        }
    }

    public void setCloseIconVisible(boolean z2) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.c0(z2);
        }
        e();
    }

    public void setCheckedIconVisible(boolean z2) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.O(z2);
        }
    }

    public void setChipIconVisible(boolean z2) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.T(z2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            qq6.d("Please set start drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            qq6.d("Please set end drawable using R.attr#closeIcon.");
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        if (drawable != null) {
            qq6.d("Please set left drawable using R.attr#chipIcon.");
        } else if (drawable3 == null) {
            super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        } else {
            qq6.d("Please set right drawable using R.attr#closeIcon.");
        }
    }

    public void setTextAppearance(x9s x9sVar) {
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            qj4Var.a1.b(x9sVar, qj4Var.U0);
        }
        h();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(int i) {
        super.setTextAppearance(i);
        qj4 qj4Var = this.e;
        if (qj4Var != null) {
            Context context = qj4Var.U0;
            qj4Var.a1.b(new x9s(context, i), context);
        }
        h();
    }

    public Chip(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.chipStyle);
    }

    public Chip(Context context) {
        this(context, null);
    }
}
