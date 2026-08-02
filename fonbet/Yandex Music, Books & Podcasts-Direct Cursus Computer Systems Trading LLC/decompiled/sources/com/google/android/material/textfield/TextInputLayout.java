package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Parcelable;
import android.text.Editable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.animation.LinearInterpolator;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.shape.a;
import defpackage.a7b;
import defpackage.aa5;
import defpackage.bcx;
import defpackage.bg3;
import defpackage.bhp;
import defpackage.bu4;
import defpackage.bz2;
import defpackage.cxb;
import defpackage.cy7;
import defpackage.e7o;
import defpackage.eb;
import defpackage.etn;
import defpackage.eup;
import defpackage.f1d;
import defpackage.fb;
import defpackage.ff7;
import defpackage.gas;
import defpackage.h1b;
import defpackage.h5;
import defpackage.h5n;
import defpackage.hcs;
import defpackage.ics;
import defpackage.ir0;
import defpackage.ivf;
import defpackage.iy6;
import defpackage.iz7;
import defpackage.jcs;
import defpackage.jy6;
import defpackage.kbr;
import defpackage.kcs;
import defpackage.ky6;
import defpackage.kz2;
import defpackage.l8t;
import defpackage.lch;
import defpackage.lum;
import defpackage.mdh;
import defpackage.ngg;
import defpackage.qgg;
import defpackage.re3;
import defpackage.rje;
import defpackage.rvf;
import defpackage.szf;
import defpackage.vdn;
import defpackage.vgo;
import defpackage.w3c;
import defpackage.wdu;
import defpackage.wm0;
import defpackage.wra;
import defpackage.xfr;
import defpackage.xpa;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.yyo;
import defpackage.z6b;
import defpackage.zl6;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] j1 = {new int[]{R.attr.state_pressed}, new int[0]};
    public ColorStateList A;
    public int A0;
    public ColorStateList B;
    public int B0;
    public ColorStateList C;
    public int C0;
    public boolean D;
    public int D0;
    public CharSequence E;
    public int E0;
    public boolean F;
    public final Rect F0;
    public a G;
    public final Rect G0;
    public a H;
    public final RectF H0;
    public StateListDrawable I;
    public Typeface I0;
    public boolean J;
    public ColorDrawable J0;
    public a K;
    public int K0;
    public a L;
    public final LinkedHashSet L0;
    public ColorDrawable M0;
    public int N0;
    public Drawable O0;
    public ColorStateList P0;
    public ColorStateList Q0;
    public int R0;
    public int S0;
    public int T0;
    public ColorStateList U0;
    public int V0;
    public int W0;
    public int X0;
    public int Y0;
    public int Z0;
    public final FrameLayout a;
    public int a1;
    public final kbr b;
    public boolean b1;
    public final a7b c;
    public final bu4 c1;
    public final int d;
    public boolean d1;
    public EditText e;
    public boolean e1;
    public CharSequence f;
    public ValueAnimator f1;
    public int g;
    public boolean g1;
    public int h;
    public boolean h1;
    public int i;
    public boolean i1;
    public int j;
    public final rje k;
    public boolean l;
    public int m;
    public boolean n;
    public jcs o;
    public AppCompatTextView p;
    public int q;
    public int r;
    public CharSequence s;
    public boolean t;
    public AppCompatTextView u;
    public ColorStateList v;
    public eup v0;
    public int w;
    public boolean w0;
    public w3c x;
    public final int x0;
    public w3c y;
    public int y0;
    public ColorStateList z;
    public int z0;

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(bg3.p0(context, attributeSet, i, ru.yandex.music.R.style.Widget_Design_TextInputLayout), attributeSet, i);
        this.g = -1;
        this.h = -1;
        this.i = -1;
        this.j = -1;
        this.k = new rje(this);
        this.o = new e7o(25);
        this.F0 = new Rect();
        this.G0 = new Rect();
        this.H0 = new RectF();
        this.L0 = new LinkedHashSet();
        bu4 bu4Var = new bu4(this);
        this.c1 = bu4Var;
        this.i1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = wm0.a;
        bu4Var.X = linearInterpolator;
        bu4Var.l(false);
        bu4Var.W = linearInterpolator;
        bu4Var.l(false);
        bu4Var.s(8388659);
        bcx.t(context2, attributeSet, i, ru.yandex.music.R.style.Widget_Design_TextInputLayout);
        int[] iArr = vdn.W;
        bcx.u(context2, attributeSet, iArr, i, ru.yandex.music.R.style.Widget_Design_TextInputLayout, 23, 21, 41, 46, 51);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, i, ru.yandex.music.R.style.Widget_Design_TextInputLayout);
        lum lumVar = new lum(context2, obtainStyledAttributes);
        kbr kbrVar = new kbr(this, lumVar);
        this.b = kbrVar;
        this.D = obtainStyledAttributes.getBoolean(49, true);
        setHint(obtainStyledAttributes.getText(4));
        this.e1 = obtainStyledAttributes.getBoolean(48, true);
        this.d1 = obtainStyledAttributes.getBoolean(43, true);
        if (obtainStyledAttributes.hasValue(6)) {
            setMinEms(obtainStyledAttributes.getInt(6, -1));
        } else if (obtainStyledAttributes.hasValue(3)) {
            setMinWidth(obtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (obtainStyledAttributes.hasValue(5)) {
            setMaxEms(obtainStyledAttributes.getInt(5, -1));
        } else if (obtainStyledAttributes.hasValue(2)) {
            setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.v0 = eup.c(context2, attributeSet, i, ru.yandex.music.R.style.Widget_Design_TextInputLayout).e();
        this.x0 = context2.getResources().getDimensionPixelOffset(ru.yandex.music.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.z0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.d = getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.B0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.C0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.A0 = this.B0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        iz7 h = this.v0.h();
        if (dimension >= 0.0f) {
            h.e = new h5(dimension);
        }
        if (dimension2 >= 0.0f) {
            h.f = new h5(dimension2);
        }
        if (dimension3 >= 0.0f) {
            h.g = new h5(dimension3);
        }
        if (dimension4 >= 0.0f) {
            h.h = new h5(dimension4);
        }
        this.v0 = h.e();
        ColorStateList C = ivf.C(context2, lumVar, 7);
        if (C != null) {
            int defaultColor = C.getDefaultColor();
            this.V0 = defaultColor;
            this.E0 = defaultColor;
            if (C.isStateful()) {
                this.W0 = C.getColorForState(new int[]{-16842910}, -1);
                this.X0 = C.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.Y0 = C.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.X0 = this.V0;
                ColorStateList E = etn.E(context2, ru.yandex.music.R.color.mtrl_filled_background_color);
                this.W0 = E.getColorForState(new int[]{-16842910}, -1);
                this.Y0 = E.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.E0 = 0;
            this.V0 = 0;
            this.W0 = 0;
            this.X0 = 0;
            this.Y0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList J = lumVar.J(1);
            this.Q0 = J;
            this.P0 = J;
        }
        ColorStateList C2 = ivf.C(context2, lumVar, 14);
        this.T0 = obtainStyledAttributes.getColor(14, 0);
        this.R0 = context2.getColor(ru.yandex.music.R.color.mtrl_textinput_default_box_stroke_color);
        this.Z0 = context2.getColor(ru.yandex.music.R.color.mtrl_textinput_disabled_color);
        this.S0 = context2.getColor(ru.yandex.music.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (C2 != null) {
            setBoxStrokeColorStateList(C2);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(ivf.C(context2, lumVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(51, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(51, 0));
        }
        this.B = lumVar.J(25);
        this.C = lumVar.J(26);
        int resourceId = obtainStyledAttributes.getResourceId(41, 0);
        CharSequence text = obtainStyledAttributes.getText(36);
        int i2 = obtainStyledAttributes.getInt(35, 1);
        boolean z = obtainStyledAttributes.getBoolean(37, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(46, 0);
        boolean z2 = obtainStyledAttributes.getBoolean(45, false);
        CharSequence text2 = obtainStyledAttributes.getText(44);
        int resourceId3 = obtainStyledAttributes.getResourceId(59, 0);
        CharSequence text3 = obtainStyledAttributes.getText(58);
        boolean z3 = obtainStyledAttributes.getBoolean(19, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(20, -1));
        this.r = obtainStyledAttributes.getResourceId(23, 0);
        this.q = obtainStyledAttributes.getResourceId(21, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i2);
        setCounterOverflowTextAppearance(this.q);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.r);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(42)) {
            setErrorTextColor(lumVar.J(42));
        }
        if (obtainStyledAttributes.hasValue(47)) {
            setHelperTextColor(lumVar.J(47));
        }
        if (obtainStyledAttributes.hasValue(52)) {
            setHintTextColor(lumVar.J(52));
        }
        if (obtainStyledAttributes.hasValue(24)) {
            setCounterTextColor(lumVar.J(24));
        }
        if (obtainStyledAttributes.hasValue(22)) {
            setCounterOverflowTextColor(lumVar.J(22));
        }
        if (obtainStyledAttributes.hasValue(60)) {
            setPlaceholderTextColor(lumVar.J(60));
        }
        a7b a7bVar = new a7b(this, lumVar);
        this.c = a7bVar;
        boolean z4 = obtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(obtainStyledAttributes.getInt(50, 1));
        lumVar.f0();
        setImportantForAccessibility(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setImportantForAutofill(1);
        }
        frameLayout.addView(kbrVar);
        frameLayout.addView(a7bVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.e;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.G;
        }
        int N = qgg.N(ru.yandex.music.R.attr.colorControlHighlight, this.e);
        int i = this.y0;
        int[][] iArr = j1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            a aVar = this.G;
            int i2 = this.E0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{qgg.W(N, 0.1f, i2), i2}), aVar, aVar);
        }
        Context context = getContext();
        a aVar2 = this.G;
        TypedValue E = ngg.E(context, "TextInputLayout", ru.yandex.music.R.attr.colorSurface);
        int i3 = E.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : E.data;
        a aVar3 = new a(aVar2.b.a);
        int W = qgg.W(N, 0.1f, color);
        aVar3.r(new ColorStateList(iArr, new int[]{W, 0}));
        aVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{W, color});
        a aVar4 = new a(aVar2.b.a);
        aVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, aVar3, aVar4), aVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.I == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.I = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.I.addState(new int[0], h(false));
        }
        return this.I;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.H == null) {
            this.H = h(true);
        }
        return this.H;
    }

    public static void m(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m((ViewGroup) childAt, z);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.e != null) {
            xq0.x("We already have an EditText, can only have one");
            return;
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.e = editText;
        int i = this.g;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.i);
        }
        int i2 = this.h;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.j);
        }
        this.J = false;
        k();
        setTextInputAccessibilityDelegate(new ics(this));
        Typeface typeface = this.e.getTypeface();
        bu4 bu4Var = this.c1;
        boolean t = bu4Var.t(typeface);
        boolean z = bu4Var.z(typeface);
        if (t || z) {
            bu4Var.l(false);
        }
        bu4Var.y(this.e.getTextSize());
        float letterSpacing = this.e.getLetterSpacing();
        if (bu4Var.h0 != letterSpacing) {
            bu4Var.h0 = letterSpacing;
            bu4Var.l(false);
        }
        int gravity = this.e.getGravity();
        bu4Var.s((gravity & (-113)) | 48);
        bu4Var.x(gravity);
        this.a1 = editText.getMinimumHeight();
        this.e.addTextChangedListener(new hcs(this, editText));
        if (this.P0 == null) {
            this.P0 = this.e.getHintTextColors();
        }
        if (this.D) {
            if (TextUtils.isEmpty(this.E)) {
                CharSequence hint = this.e.getHint();
                this.f = hint;
                setHint(hint);
                this.e.setHint((CharSequence) null);
            }
            this.F = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.p != null) {
            p(this.e.getText());
        }
        t();
        this.k.b();
        this.b.bringToFront();
        a7b a7bVar = this.c;
        a7bVar.bringToFront();
        Iterator it = this.L0.iterator();
        while (it.hasNext()) {
            ((z6b) it.next()).a(this);
        }
        a7bVar.l();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.E)) {
            return;
        }
        this.E = charSequence;
        this.c1.B(charSequence);
        if (this.b1) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.t == z) {
            return;
        }
        AppCompatTextView appCompatTextView = this.u;
        if (!z) {
            if (appCompatTextView != null) {
                appCompatTextView.setVisibility(8);
            }
            this.u = null;
        } else if (appCompatTextView != null) {
            this.a.addView(appCompatTextView);
            this.u.setVisibility(0);
        }
        this.t = z;
    }

    public final void a() {
        if (this.e == null || this.y0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.e;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.c1.g() + this.d), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.e;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.material_filled_edittext_font_2_0_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (ivf.H(getContext())) {
            EditText editText3 = this.e;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.material_filled_edittext_font_1_3_padding_top), this.e.getPaddingEnd(), getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        bu4 bu4Var = this.c1;
        if (bu4Var.b == f) {
            return;
        }
        if (this.f1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f1 = valueAnimator;
            valueAnimator.setInterpolator(szf.q0(getContext(), ru.yandex.music.R.attr.motionEasingEmphasizedInterpolator, wm0.b));
            this.f1.setDuration(szf.p0(getContext(), ru.yandex.music.R.attr.motionDurationMedium4, 167));
            this.f1.addUpdateListener(new re3(6, this));
        }
        this.f1.setFloatValues(bu4Var.b, f);
        this.f1.start();
    }

    public final void c() {
        int i;
        int i2;
        a aVar = this.G;
        if (aVar == null) {
            return;
        }
        eup eupVar = aVar.b.a;
        eup eupVar2 = this.v0;
        if (eupVar != eupVar2) {
            aVar.setShapeAppearanceModel(eupVar2);
        }
        if (this.y0 == 2 && (i = this.A0) > -1 && (i2 = this.D0) != 0) {
            a aVar2 = this.G;
            aVar2.b.k = i;
            aVar2.invalidateSelf();
            aVar2.x(ColorStateList.valueOf(i2));
        }
        int i3 = this.E0;
        if (this.y0 == 1) {
            i3 = aa5.i(this.E0, qgg.O(getContext(), ru.yandex.music.R.attr.colorSurface, 0));
        }
        this.E0 = i3;
        this.G.r(ColorStateList.valueOf(i3));
        a aVar3 = this.K;
        if (aVar3 != null && this.L != null) {
            if (this.A0 > -1 && this.D0 != 0) {
                aVar3.r(this.e.isFocused() ? ColorStateList.valueOf(this.R0) : ColorStateList.valueOf(this.D0));
                this.L.r(ColorStateList.valueOf(this.D0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.e == null) {
            e7o.n();
            return null;
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.G0;
        rect2.bottom = i;
        int i2 = this.y0;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.z0;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        int i3 = rect.left;
        if (i2 != 2) {
            rect2.left = i(i3, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.e.getPaddingLeft() + i3;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.e.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.e;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f != null) {
            boolean z = this.F;
            this.F = false;
            CharSequence hint = editText.getHint();
            this.e.setHint(this.f);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.e.setHint(hint);
                this.F = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.e) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.h1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.h1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        a aVar;
        super.draw(canvas);
        boolean z = this.D;
        bu4 bu4Var = this.c1;
        if (z) {
            bu4Var.f(canvas);
        }
        if (this.L == null || (aVar = this.K) == null) {
            return;
        }
        aVar.draw(canvas);
        if (this.e.isFocused()) {
            Rect bounds = this.L.getBounds();
            Rect bounds2 = this.K.getBounds();
            float f = bu4Var.b;
            int centerX = bounds2.centerX();
            bounds.left = wm0.c(centerX, f, bounds2.left);
            bounds.right = wm0.c(centerX, f, bounds2.right);
            this.L.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.g1) {
            return;
        }
        this.g1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        bu4 bu4Var = this.c1;
        if (bu4Var != null) {
            bu4Var.S = drawableState;
            ColorStateList colorStateList2 = bu4Var.p;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bu4Var.o) != null && colorStateList.isStateful())) {
                bu4Var.l(false);
                z = true;
                if (this.e != null) {
                    w(isLaidOut() && isEnabled(), false);
                }
                t();
                z();
                if (z) {
                    invalidate();
                }
                this.g1 = false;
            }
        }
        z = false;
        if (this.e != null) {
        }
        t();
        z();
        if (z) {
        }
        this.g1 = false;
    }

    public final int e() {
        if (this.D) {
            int i = this.y0;
            bu4 bu4Var = this.c1;
            if (i == 0) {
                return (int) bu4Var.g();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (bu4Var.g() / 2.0f);
                }
                float g = bu4Var.g();
                TextPaint textPaint = bu4Var.V;
                textPaint.setTextSize(bu4Var.n);
                textPaint.setTypeface(bu4Var.x);
                textPaint.setLetterSpacing(bu4Var.g0);
                return Math.max(0, (int) (g - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final w3c f() {
        w3c w3cVar = new w3c();
        w3cVar.c = szf.p0(getContext(), ru.yandex.music.R.attr.motionDurationShort2, 87);
        w3cVar.d = szf.q0(getContext(), ru.yandex.music.R.attr.motionEasingLinearInterpolator, wm0.a);
        return w3cVar;
    }

    public final boolean g() {
        return this.D && !TextUtils.isEmpty(this.E) && (this.G instanceof ky6);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.e;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    @NonNull
    public a getBoxBackground() {
        int i = this.y0;
        if (i == 1 || i == 2) {
            return this.G;
        }
        e7o.n();
        return null;
    }

    public int getBoxBackgroundColor() {
        return this.E0;
    }

    public int getBoxBackgroundMode() {
        return this.y0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.z0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        eup eupVar = this.v0;
        RectF rectF = this.H0;
        return layoutDirection == 1 ? eupVar.h.a(rectF) : eupVar.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        eup eupVar = this.v0;
        RectF rectF = this.H0;
        return layoutDirection == 1 ? eupVar.g.a(rectF) : eupVar.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        eup eupVar = this.v0;
        RectF rectF = this.H0;
        return layoutDirection == 1 ? eupVar.e.a(rectF) : eupVar.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        eup eupVar = this.v0;
        RectF rectF = this.H0;
        return layoutDirection == 1 ? eupVar.f.a(rectF) : eupVar.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.T0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.U0;
    }

    public int getBoxStrokeWidth() {
        return this.B0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.C0;
    }

    public int getCounterMaxLength() {
        return this.m;
    }

    public CharSequence getCounterOverflowDescription() {
        AppCompatTextView appCompatTextView;
        if (this.l && this.n && (appCompatTextView = this.p) != null) {
            return appCompatTextView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.A;
    }

    public ColorStateList getCounterTextColor() {
        return this.z;
    }

    public ColorStateList getCursorColor() {
        return this.B;
    }

    public ColorStateList getCursorErrorColor() {
        return this.C;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.P0;
    }

    public EditText getEditText() {
        return this.e;
    }

    public CharSequence getEndIconContentDescription() {
        return this.c.g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.c.g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.c.m;
    }

    public int getEndIconMode() {
        return this.c.i;
    }

    @NonNull
    public ImageView.ScaleType getEndIconScaleType() {
        return this.c.n;
    }

    @NonNull
    public CheckableImageButton getEndIconView() {
        return this.c.g;
    }

    public CharSequence getError() {
        rje rjeVar = this.k;
        if (rjeVar.q) {
            return rjeVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.k.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.k.s;
    }

    public int getErrorCurrentTextColors() {
        AppCompatTextView appCompatTextView = this.k.r;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.c.c.getDrawable();
    }

    public CharSequence getHelperText() {
        rje rjeVar = this.k;
        if (rjeVar.x) {
            return rjeVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        AppCompatTextView appCompatTextView = this.k.y;
        if (appCompatTextView != null) {
            return appCompatTextView.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.D) {
            return this.E;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.c1.g();
    }

    public final int getHintCurrentCollapsedTextColor() {
        bu4 bu4Var = this.c1;
        return bu4Var.h(bu4Var.p);
    }

    public int getHintMaxLines() {
        return this.c1.o0;
    }

    public ColorStateList getHintTextColor() {
        return this.Q0;
    }

    @NonNull
    public jcs getLengthCounter() {
        return this.o;
    }

    public int getMaxEms() {
        return this.h;
    }

    public int getMaxWidth() {
        return this.j;
    }

    public int getMinEms() {
        return this.g;
    }

    public int getMinWidth() {
        return this.i;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.c.g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.c.g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.t) {
            return this.s;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.w;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.v;
    }

    public CharSequence getPrefixText() {
        return this.b.c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.b.b.getTextColors();
    }

    @NonNull
    public TextView getPrefixTextView() {
        return this.b.b;
    }

    @NonNull
    public eup getShapeAppearanceModel() {
        return this.v0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.b.d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.b.d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.b.g;
    }

    @NonNull
    public ImageView.ScaleType getStartIconScaleType() {
        return this.b.h;
    }

    public CharSequence getSuffixText() {
        return this.c.p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.c.q.getTextColors();
    }

    @NonNull
    public TextView getSuffixTextView() {
        return this.c.q;
    }

    public Typeface getTypeface() {
        return this.I0;
    }

    public final a h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(ru.yandex.music.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        EditText editText = this.e;
        float popupElevation = editText instanceof lch ? ((lch) editText).getPopupElevation() : getResources().getDimensionPixelOffset(ru.yandex.music.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(ru.yandex.music.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        vgo vgoVar = new vgo();
        vgo vgoVar2 = new vgo();
        vgo vgoVar3 = new vgo();
        vgo vgoVar4 = new vgo();
        h1b h1bVar = new h1b();
        h1b h1bVar2 = new h1b();
        h1b h1bVar3 = new h1b();
        h1b h1bVar4 = new h1b();
        h5 h5Var = new h5(f);
        h5 h5Var2 = new h5(f);
        h5 h5Var3 = new h5(dimensionPixelOffset);
        h5 h5Var4 = new h5(dimensionPixelOffset);
        eup eupVar = new eup();
        eupVar.a = vgoVar;
        eupVar.b = vgoVar2;
        eupVar.c = vgoVar3;
        eupVar.d = vgoVar4;
        eupVar.e = h5Var;
        eupVar.f = h5Var2;
        eupVar.g = h5Var4;
        eupVar.h = h5Var3;
        eupVar.i = h1bVar;
        eupVar.j = h1bVar2;
        eupVar.k = h1bVar3;
        eupVar.l = h1bVar4;
        EditText editText2 = this.e;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof lch ? ((lch) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = a.F;
            TypedValue E = ngg.E(context, a.class.getSimpleName(), ru.yandex.music.R.attr.colorSurface);
            int i = E.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i != 0 ? context.getColor(i) : E.data);
        }
        a aVar = new a();
        aVar.n(context);
        aVar.r(dropDownBackgroundTintList);
        aVar.q(popupElevation);
        aVar.setShapeAppearanceModel(eupVar);
        mdh mdhVar = aVar.b;
        if (mdhVar.h == null) {
            mdhVar.h = new Rect();
        }
        aVar.b.h.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        aVar.invalidateSelf();
        return aVar;
    }

    public final int i(int i, boolean z) {
        return ((z || getPrefixText() == null) ? (!z || getSuffixText() == null) ? this.e.getCompoundPaddingLeft() : this.c.b() : this.b.a()) + i;
    }

    public final int j(int i, boolean z) {
        return i - ((z || getSuffixText() == null) ? (!z || getPrefixText() == null) ? this.e.getCompoundPaddingRight() : this.b.a() : this.c.b());
    }

    public final void k() {
        int i = this.y0;
        if (i == 0) {
            this.G = null;
            this.K = null;
            this.L = null;
        } else if (i == 1) {
            this.G = new a(this.v0);
            this.K = new a();
            this.L = new a();
        } else {
            if (i != 2) {
                xq0.x(f1d.i(new StringBuilder(), this.y0, " is illegal; only @BoxBackgroundMode constants are supported."));
                return;
            }
            if (!this.D || (this.G instanceof ky6)) {
                this.G = new a(this.v0);
            } else {
                eup eupVar = this.v0;
                int i2 = ky6.I;
                if (eupVar == null) {
                    eupVar = new eup();
                }
                iy6 iy6Var = new iy6(eupVar, new RectF());
                jy6 jy6Var = new jy6(iy6Var);
                jy6Var.H = iy6Var;
                this.G = jy6Var;
            }
            this.K = null;
            this.L = null;
        }
        u();
        z();
        if (this.y0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.z0 = getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (ivf.H(getContext())) {
                this.z0 = getResources().getDimensionPixelSize(ru.yandex.music.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.y0 != 0) {
            v();
        }
        EditText editText = this.e;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.y0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.e.getWidth();
            int gravity = this.e.getGravity();
            bu4 bu4Var = this.c1;
            boolean c = bu4Var.c(bu4Var.H);
            bu4Var.J = c;
            Rect rect = bu4Var.h;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = bu4Var.k0;
                    }
                } else if (c) {
                    f = rect.right;
                    f2 = bu4Var.k0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float max = Math.max(f3, rect.left);
                rectF = this.H0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (bu4Var.k0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bu4Var.J) {
                        f5 = bu4Var.k0;
                        f4 = f5 + max;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (bu4Var.J) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = bu4Var.k0;
                    f4 = f5 + max;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = bu4Var.g() + rect.top;
                if (bu4Var.j0 != null && !bu4Var.C()) {
                    StaticLayout staticLayout = bu4Var.j0;
                    float lineWidth = (bu4Var.n / bu4Var.m) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (bu4Var.J) {
                        rectF.right = rectF.left + lineWidth;
                    } else {
                        rectF.left = rectF.right - lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.x0;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.A0);
                rectF.top = 0.0f;
                ky6 ky6Var = (ky6) this.G;
                ky6Var.getClass();
                ky6Var.C(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = bu4Var.k0 / 2.0f;
            f3 = f - f2;
            float max2 = Math.max(f3, rect.left);
            rectF = this.H0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f4 = (width / 2.0f) + (bu4Var.k0 / 2.0f);
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = bu4Var.g() + rect.top;
            if (bu4Var.j0 != null) {
                StaticLayout staticLayout2 = bu4Var.j0;
                float lineWidth2 = (bu4Var.n / bu4Var.m) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (bu4Var.J) {
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(AppCompatTextView appCompatTextView, int i) {
        try {
            appCompatTextView.setTextAppearance(i);
            if (appCompatTextView.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        appCompatTextView.setTextAppearance(ru.yandex.music.R.style.TextAppearance_AppCompat_Caption);
        appCompatTextView.setTextColor(getContext().getColor(ru.yandex.music.R.color.design_error));
    }

    public final boolean o() {
        rje rjeVar = this.k;
        return (rjeVar.o != 1 || rjeVar.r == null || TextUtils.isEmpty(rjeVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.c1.k(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        a7b a7bVar = this.c;
        a7bVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.i1 = false;
        if (this.e != null && this.e.getMeasuredHeight() < (max = Math.max(a7bVar.getMeasuredHeight(), this.b.getMeasuredHeight()))) {
            this.e.setMinimumHeight(max);
            z = true;
        }
        boolean s = s();
        if (z || s) {
            this.e.post(new bhp(11, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float i5;
        int i6;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.e;
        if (editText != null) {
            Rect rect = this.F0;
            cy7.a(this, editText, rect);
            a aVar = this.K;
            if (aVar != null) {
                int i7 = rect.bottom;
                aVar.setBounds(rect.left, i7 - this.B0, rect.right, i7);
            }
            a aVar2 = this.L;
            if (aVar2 != null) {
                int i8 = rect.bottom;
                aVar2.setBounds(rect.left, i8 - this.C0, rect.right, i8);
            }
            if (this.D) {
                float textSize = this.e.getTextSize();
                bu4 bu4Var = this.c1;
                bu4Var.y(textSize);
                TextPaint textPaint = bu4Var.V;
                int gravity = this.e.getGravity();
                bu4Var.s((gravity & (-113)) | 48);
                bu4Var.x(gravity);
                Rect d = d(rect);
                bu4Var.o(d.left, d.top, d.right, d.bottom);
                if (this.e == null) {
                    e7o.n();
                    return;
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(bu4Var.m);
                    textPaint.setTypeface(bu4Var.A);
                    textPaint.setLetterSpacing(bu4Var.h0);
                    i5 = -textPaint.ascent();
                } else {
                    i5 = bu4Var.i() * bu4Var.q;
                }
                int compoundPaddingLeft = this.e.getCompoundPaddingLeft() + rect.left;
                Rect rect2 = this.G0;
                rect2.left = compoundPaddingLeft;
                if (this.y0 != 1 || this.e.getMinLines() > 1) {
                    if (this.y0 != 0 || getHintMaxLines() == 1) {
                        i6 = 0;
                    } else {
                        textPaint.setTextSize(bu4Var.m);
                        textPaint.setTypeface(bu4Var.A);
                        textPaint.setLetterSpacing(bu4Var.h0);
                        i6 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.e.getCompoundPaddingTop() + rect.top) - i6;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (i5 / 2.0f));
                }
                rect2.top = compoundPaddingTop;
                rect2.right = rect.right - this.e.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.y0 != 1 || this.e.getMinLines() > 1) ? rect.bottom - this.e.getCompoundPaddingBottom() : (int) (rect2.top + i5);
                rect2.bottom = compoundPaddingBottom;
                bu4Var.u(true, rect2.left, rect2.top, rect2.right, compoundPaddingBottom);
                bu4Var.l(false);
                if (!g() || this.b1) {
                    return;
                }
                l();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        float f;
        EditText editText;
        super.onMeasure(i, i2);
        boolean z = this.i1;
        a7b a7bVar = this.c;
        if (!z) {
            a7bVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.i1 = true;
        }
        if (this.u != null && (editText = this.e) != null) {
            this.u.setGravity(editText.getGravity());
            this.u.setPadding(this.e.getCompoundPaddingLeft(), this.e.getCompoundPaddingTop(), this.e.getCompoundPaddingRight(), this.e.getCompoundPaddingBottom());
        }
        a7bVar.l();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.e.getMeasuredWidth() - this.e.getCompoundPaddingLeft()) - this.e.getCompoundPaddingRight();
        bu4 bu4Var = this.c1;
        TextPaint textPaint = bu4Var.V;
        textPaint.setTextSize(bu4Var.n);
        textPaint.setTypeface(bu4Var.x);
        textPaint.setLetterSpacing(bu4Var.g0);
        float f2 = measuredWidth;
        bu4Var.t0 = bu4Var.e(bu4Var.p0, textPaint, bu4Var.H, (bu4Var.n / bu4Var.m) * f2, bu4Var.J).getHeight();
        textPaint.setTextSize(bu4Var.m);
        textPaint.setTypeface(bu4Var.A);
        textPaint.setLetterSpacing(bu4Var.h0);
        bu4Var.u0 = bu4Var.e(bu4Var.o0, textPaint, bu4Var.H, f2, bu4Var.J).getHeight();
        EditText editText2 = this.e;
        Rect rect = this.F0;
        cy7.a(this, editText2, rect);
        Rect d = d(rect);
        bu4Var.o(d.left, d.top, d.right, d.bottom);
        v();
        a();
        if (this.e == null) {
            return;
        }
        int i3 = bu4Var.u0;
        if (i3 != -1) {
            f = i3;
        } else {
            TextPaint textPaint2 = bu4Var.V;
            textPaint2.setTextSize(bu4Var.m);
            textPaint2.setTypeface(bu4Var.A);
            textPaint2.setLetterSpacing(bu4Var.h0);
            f = -textPaint2.ascent();
        }
        if (this.s != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.u.getPaint());
            textPaint3.setTextSize(this.u.getTextSize());
            textPaint3.setTypeface(this.u.getTypeface());
            textPaint3.setLetterSpacing(this.u.getLetterSpacing());
            xfr xfrVar = new xfr(this.s, textPaint3, measuredWidth);
            xfrVar.k = getLayoutDirection() == 1;
            xfrVar.j = true;
            float lineSpacingExtra = this.u.getLineSpacingExtra();
            float lineSpacingMultiplier = this.u.getLineSpacingMultiplier();
            xfrVar.g = lineSpacingExtra;
            xfrVar.h = lineSpacingMultiplier;
            xfrVar.m = new h5n(25, this);
            r3 = (this.y0 == 1 ? bu4Var.g() + this.z0 + this.d : 0.0f) + xfrVar.a().getHeight();
        }
        float max = Math.max(f, r3);
        if (this.e.getMeasuredHeight() < max) {
            this.e.setMinimumHeight(Math.round(max));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof kcs)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        kcs kcsVar = (kcs) parcelable;
        super.onRestoreInstanceState(kcsVar.a);
        setError(kcsVar.c);
        if (kcsVar.d) {
            post(new yyo(7, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.w0) {
            zl6 zl6Var = this.v0.e;
            RectF rectF = this.H0;
            float a = zl6Var.a(rectF);
            float a2 = this.v0.f.a(rectF);
            float a3 = this.v0.h.a(rectF);
            float a4 = this.v0.g.a(rectF);
            eup eupVar = this.v0;
            ff7 ff7Var = eupVar.a;
            ff7 ff7Var2 = eupVar.b;
            ff7 ff7Var3 = eupVar.d;
            ff7 ff7Var4 = eupVar.c;
            h1b h1bVar = new h1b();
            h1b h1bVar2 = new h1b();
            h1b h1bVar3 = new h1b();
            h1b h1bVar4 = new h1b();
            h5 h5Var = new h5(a2);
            h5 h5Var2 = new h5(a);
            h5 h5Var3 = new h5(a4);
            h5 h5Var4 = new h5(a3);
            eup eupVar2 = new eup();
            eupVar2.a = ff7Var2;
            eupVar2.b = ff7Var;
            eupVar2.c = ff7Var3;
            eupVar2.d = ff7Var4;
            eupVar2.e = h5Var;
            eupVar2.f = h5Var2;
            eupVar2.g = h5Var4;
            eupVar2.h = h5Var3;
            eupVar2.i = h1bVar;
            eupVar2.j = h1bVar2;
            eupVar2.k = h1bVar3;
            eupVar2.l = h1bVar4;
            this.w0 = z;
            setShapeAppearanceModel(eupVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        kcs kcsVar = new kcs(super.onSaveInstanceState());
        if (o()) {
            kcsVar.c = getError();
        }
        a7b a7bVar = this.c;
        kcsVar.d = a7bVar.i != 0 && a7bVar.g.d;
        return kcsVar;
    }

    public final void p(Editable editable) {
        ((e7o) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.n;
        int i = this.m;
        if (i == -1) {
            this.p.setText(String.valueOf(length));
            this.p.setContentDescription(null);
            this.n = false;
        } else {
            this.n = length > i;
            Context context = getContext();
            this.p.setContentDescription(context.getString(this.n ? ru.yandex.music.R.string.character_counter_overflowed_content_description : ru.yandex.music.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.m)));
            if (z != this.n) {
                q();
            }
            kz2 c = kz2.c();
            AppCompatTextView appCompatTextView = this.p;
            String string = getContext().getString(ru.yandex.music.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.m));
            c.getClass();
            bz2 bz2Var = gas.a;
            appCompatTextView.setText(string != null ? c.d(string).toString() : null);
        }
        if (this.e == null || z == this.n) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        AppCompatTextView appCompatTextView = this.p;
        if (appCompatTextView != null) {
            n(appCompatTextView, this.n ? this.q : this.r);
            if (!this.n && (colorStateList2 = this.z) != null) {
                this.p.setTextColor(colorStateList2);
            }
            if (!this.n || (colorStateList = this.A) == null) {
                return;
            }
            this.p.setTextColor(colorStateList);
        }
    }

    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.B;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue C = ngg.C(context, ru.yandex.music.R.attr.colorControlActivated);
            if (C != null) {
                int i = C.resourceId;
                if (i != 0) {
                    colorStateList2 = etn.E(context, i);
                } else {
                    int i2 = C.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.e;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable mutate = this.e.getTextCursorDrawable().mutate();
        if ((o() || (this.p != null && this.n)) && (colorStateList = this.C) != null) {
            colorStateList2 = colorStateList;
        }
        mutate.setTintList(colorStateList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean s() {
        boolean z;
        a7b a7bVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.e == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            kbr kbrVar = this.b;
            if (kbrVar.getMeasuredWidth() > 0) {
                int measuredWidth = kbrVar.getMeasuredWidth() - this.e.getPaddingLeft();
                if (this.J0 == null || this.K0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.J0 = colorDrawable3;
                    this.K0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.e.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.J0;
                if (drawable2 != colorDrawable4) {
                    this.e.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z = true;
                    a7bVar = this.c;
                    if ((!a7bVar.d() || ((a7bVar.i != 0 && a7bVar.c()) || a7bVar.p != null)) && a7bVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = a7bVar.q.getMeasuredWidth() - this.e.getPaddingRight();
                        if (!a7bVar.d()) {
                            checkableImageButton = a7bVar.c;
                        } else if (a7bVar.i != 0 && a7bVar.c()) {
                            checkableImageButton = a7bVar.g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
                        colorDrawable = this.M0;
                        if (colorDrawable == null && this.N0 != measuredWidth2) {
                            this.N0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.e.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.M0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.M0 = colorDrawable5;
                            this.N0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.M0;
                        if (drawable != colorDrawable2) {
                            this.O0 = drawable;
                            this.e.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.M0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.e.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.M0) {
                            this.e.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.O0, compoundDrawablesRelative3[3]);
                        } else {
                            z2 = z;
                        }
                        this.M0 = null;
                        return z2;
                    }
                    return z;
                }
                z = false;
                a7bVar = this.c;
                if (a7bVar.d()) {
                }
                int measuredWidth22 = a7bVar.q.getMeasuredWidth() - this.e.getPaddingRight();
                if (!a7bVar.d()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
                colorDrawable = this.M0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.M0;
                if (drawable != colorDrawable2) {
                }
                return z;
            }
        }
        if (this.J0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.e.getCompoundDrawablesRelative();
            this.e.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.J0 = null;
            z = true;
            a7bVar = this.c;
            if (a7bVar.d()) {
            }
            int measuredWidth222 = a7bVar.q.getMeasuredWidth() - this.e.getPaddingRight();
            if (!a7bVar.d()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
            colorDrawable = this.M0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.M0;
            if (drawable != colorDrawable2) {
            }
            return z;
        }
        z = false;
        a7bVar = this.c;
        if (a7bVar.d()) {
        }
        int measuredWidth2222 = a7bVar.q.getMeasuredWidth() - this.e.getPaddingRight();
        if (!a7bVar.d()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.e.getCompoundDrawablesRelative();
        colorDrawable = this.M0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.M0;
        if (drawable != colorDrawable2) {
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.E0 != i) {
            this.E0 = i;
            this.V0 = i;
            this.X0 = i;
            this.Y0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(@NonNull ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.V0 = defaultColor;
        this.E0 = defaultColor;
        this.W0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.X0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.Y0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.y0) {
            return;
        }
        this.y0 = i;
        if (this.e != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.z0 = i;
    }

    public void setBoxCornerFamily(int i) {
        iz7 h = this.v0.h();
        zl6 zl6Var = this.v0.e;
        h.a = rvf.y(i);
        h.e = zl6Var;
        zl6 zl6Var2 = this.v0.f;
        h.b = rvf.y(i);
        h.f = zl6Var2;
        zl6 zl6Var3 = this.v0.h;
        h.d = rvf.y(i);
        h.h = zl6Var3;
        zl6 zl6Var4 = this.v0.g;
        h.c = rvf.y(i);
        h.g = zl6Var4;
        this.v0 = h.e();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.T0 != i) {
            this.T0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(@NonNull ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.R0 = colorStateList.getDefaultColor();
            this.Z0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.S0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.T0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.T0 != colorStateList.getDefaultColor()) {
            this.T0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.U0 != colorStateList) {
            this.U0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.B0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.C0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.l != z) {
            rje rjeVar = this.k;
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.p = appCompatTextView;
                appCompatTextView.setId(ru.yandex.music.R.id.textinput_counter);
                Typeface typeface = this.I0;
                if (typeface != null) {
                    this.p.setTypeface(typeface);
                }
                this.p.setMaxLines(1);
                rjeVar.a(this.p, 2);
                ((ViewGroup.MarginLayoutParams) this.p.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(ru.yandex.music.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.p != null) {
                    EditText editText = this.e;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                rjeVar.g(this.p, 2);
                this.p = null;
            }
            this.l = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.m != i) {
            if (i > 0) {
                this.m = i;
            } else {
                this.m = -1;
            }
            if (!this.l || this.p == null) {
                return;
            }
            EditText editText = this.e;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.q != i) {
            this.q = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.A != colorStateList) {
            this.A = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.r != i) {
            this.r = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.z != colorStateList) {
            this.z = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.B != colorStateList) {
            this.B = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.C != colorStateList) {
            this.C = colorStateList;
            if (o() || (this.p != null && this.n)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.P0 = colorStateList;
        this.Q0 = colorStateList;
        if (this.e != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.c.g.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.c.g.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        a7b a7bVar = this.c;
        CharSequence text = i != 0 ? a7bVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = a7bVar.g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        a7b a7bVar = this.c;
        Drawable w = i != 0 ? y2x.w(a7bVar.getContext(), i) : null;
        TextInputLayout textInputLayout = a7bVar.a;
        CheckableImageButton checkableImageButton = a7bVar.g;
        checkableImageButton.setImageDrawable(w);
        if (w != null) {
            cxb.D(textInputLayout, checkableImageButton, a7bVar.k, a7bVar.l);
            cxb.d0(textInputLayout, checkableImageButton, a7bVar.k);
        }
    }

    public void setEndIconMinSize(int i) {
        a7b a7bVar = this.c;
        if (i < 0) {
            a7bVar.getClass();
            xq0.x("endIconSize cannot be less than 0");
        } else if (i != a7bVar.m) {
            a7bVar.m = i;
            CheckableImageButton checkableImageButton = a7bVar.g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = a7bVar.c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.c.f(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        a7b a7bVar = this.c;
        CheckableImageButton checkableImageButton = a7bVar.g;
        View.OnLongClickListener onLongClickListener = a7bVar.o;
        checkableImageButton.setOnClickListener(onClickListener);
        cxb.k0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        a7b a7bVar = this.c;
        a7bVar.o = onLongClickListener;
        CheckableImageButton checkableImageButton = a7bVar.g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        cxb.k0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        a7b a7bVar = this.c;
        a7bVar.n = scaleType;
        a7bVar.g.setScaleType(scaleType);
        a7bVar.c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        a7b a7bVar = this.c;
        if (a7bVar.k != colorStateList) {
            a7bVar.k = colorStateList;
            cxb.D(a7bVar.a, a7bVar.g, colorStateList, a7bVar.l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        a7b a7bVar = this.c;
        if (a7bVar.l != mode) {
            a7bVar.l = mode;
            cxb.D(a7bVar.a, a7bVar.g, a7bVar.k, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.c.g(z);
    }

    public void setError(CharSequence charSequence) {
        rje rjeVar = this.k;
        if (!rjeVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            rjeVar.f();
            return;
        }
        rjeVar.c();
        rjeVar.p = charSequence;
        rjeVar.r.setText(charSequence);
        int i = rjeVar.n;
        if (i != 1) {
            rjeVar.o = 1;
        }
        rjeVar.i(i, rjeVar.o, rjeVar.h(rjeVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        rje rjeVar = this.k;
        rjeVar.t = i;
        AppCompatTextView appCompatTextView = rjeVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        rje rjeVar = this.k;
        rjeVar.s = charSequence;
        AppCompatTextView appCompatTextView = rjeVar.r;
        if (appCompatTextView != null) {
            appCompatTextView.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        rje rjeVar = this.k;
        TextInputLayout textInputLayout = rjeVar.h;
        if (rjeVar.q == z) {
            return;
        }
        rjeVar.c();
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(rjeVar.g);
            rjeVar.r = appCompatTextView;
            appCompatTextView.setId(ru.yandex.music.R.id.textinput_error);
            rjeVar.r.setTextAlignment(5);
            Typeface typeface = rjeVar.B;
            if (typeface != null) {
                rjeVar.r.setTypeface(typeface);
            }
            int i = rjeVar.u;
            rjeVar.u = i;
            AppCompatTextView appCompatTextView2 = rjeVar.r;
            if (appCompatTextView2 != null) {
                rjeVar.h.n(appCompatTextView2, i);
            }
            ColorStateList colorStateList = rjeVar.v;
            rjeVar.v = colorStateList;
            AppCompatTextView appCompatTextView3 = rjeVar.r;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            CharSequence charSequence = rjeVar.s;
            rjeVar.s = charSequence;
            AppCompatTextView appCompatTextView4 = rjeVar.r;
            if (appCompatTextView4 != null) {
                appCompatTextView4.setContentDescription(charSequence);
            }
            int i2 = rjeVar.t;
            rjeVar.t = i2;
            AppCompatTextView appCompatTextView5 = rjeVar.r;
            if (appCompatTextView5 != null) {
                appCompatTextView5.setAccessibilityLiveRegion(i2);
            }
            rjeVar.r.setVisibility(4);
            rjeVar.a(rjeVar.r, 0);
        } else {
            rjeVar.f();
            rjeVar.g(rjeVar.r, 0);
            rjeVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        rjeVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        a7b a7bVar = this.c;
        a7bVar.h(i != 0 ? y2x.w(a7bVar.getContext(), i) : null);
        cxb.d0(a7bVar.a, a7bVar.c, a7bVar.d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        a7b a7bVar = this.c;
        CheckableImageButton checkableImageButton = a7bVar.c;
        View.OnLongClickListener onLongClickListener = a7bVar.f;
        checkableImageButton.setOnClickListener(onClickListener);
        cxb.k0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        a7b a7bVar = this.c;
        a7bVar.f = onLongClickListener;
        CheckableImageButton checkableImageButton = a7bVar.c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        cxb.k0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        a7b a7bVar = this.c;
        if (a7bVar.d != colorStateList) {
            a7bVar.d = colorStateList;
            cxb.D(a7bVar.a, a7bVar.c, colorStateList, a7bVar.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        a7b a7bVar = this.c;
        if (a7bVar.e != mode) {
            a7bVar.e = mode;
            cxb.D(a7bVar.a, a7bVar.c, a7bVar.d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        rje rjeVar = this.k;
        rjeVar.u = i;
        AppCompatTextView appCompatTextView = rjeVar.r;
        if (appCompatTextView != null) {
            rjeVar.h.n(appCompatTextView, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        rje rjeVar = this.k;
        rjeVar.v = colorStateList;
        AppCompatTextView appCompatTextView = rjeVar.r;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.d1 != z) {
            this.d1 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        rje rjeVar = this.k;
        if (isEmpty) {
            if (rjeVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!rjeVar.x) {
            setHelperTextEnabled(true);
        }
        rjeVar.c();
        rjeVar.w = charSequence;
        rjeVar.y.setText(charSequence);
        int i = rjeVar.n;
        if (i != 2) {
            rjeVar.o = 2;
        }
        rjeVar.i(i, rjeVar.o, rjeVar.h(rjeVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        rje rjeVar = this.k;
        rjeVar.A = colorStateList;
        AppCompatTextView appCompatTextView = rjeVar.y;
        if (appCompatTextView == null || colorStateList == null) {
            return;
        }
        appCompatTextView.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        rje rjeVar = this.k;
        TextInputLayout textInputLayout = rjeVar.h;
        if (rjeVar.x == z) {
            return;
        }
        rjeVar.c();
        int i = 1;
        if (z) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(rjeVar.g);
            rjeVar.y = appCompatTextView;
            appCompatTextView.setId(ru.yandex.music.R.id.textinput_helper_text);
            rjeVar.y.setTextAlignment(5);
            Typeface typeface = rjeVar.B;
            if (typeface != null) {
                rjeVar.y.setTypeface(typeface);
            }
            rjeVar.y.setVisibility(4);
            rjeVar.y.setAccessibilityLiveRegion(1);
            int i2 = rjeVar.z;
            rjeVar.z = i2;
            AppCompatTextView appCompatTextView2 = rjeVar.y;
            if (appCompatTextView2 != null) {
                appCompatTextView2.setTextAppearance(i2);
            }
            ColorStateList colorStateList = rjeVar.A;
            rjeVar.A = colorStateList;
            AppCompatTextView appCompatTextView3 = rjeVar.y;
            if (appCompatTextView3 != null && colorStateList != null) {
                appCompatTextView3.setTextColor(colorStateList);
            }
            rjeVar.a(rjeVar.y, 1);
            rjeVar.y.setAccessibilityDelegate(new fb(i, rjeVar));
        } else {
            rjeVar.c();
            int i3 = rjeVar.n;
            if (i3 == 2) {
                rjeVar.o = 0;
            }
            rjeVar.i(i3, rjeVar.o, rjeVar.h(rjeVar.y, ""));
            rjeVar.g(rjeVar.y, 1);
            rjeVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        rjeVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        rje rjeVar = this.k;
        rjeVar.z = i;
        AppCompatTextView appCompatTextView = rjeVar.y;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setHintAnimationEnabled(boolean z) {
        this.e1 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.D) {
            this.D = z;
            if (z) {
                CharSequence hint = this.e.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.E)) {
                        setHint(hint);
                    }
                    this.e.setHint((CharSequence) null);
                }
                this.F = true;
            } else {
                this.F = false;
                if (!TextUtils.isEmpty(this.E) && TextUtils.isEmpty(this.e.getHint())) {
                    this.e.setHint(this.E);
                }
                setHintInternal(null);
            }
            if (this.e != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        bu4 bu4Var = this.c1;
        if (i != bu4Var.p0) {
            bu4Var.p0 = i;
            bu4Var.l(false);
        }
        bu4Var.v(i);
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        bu4 bu4Var = this.c1;
        bu4Var.q(i);
        this.Q0 = bu4Var.p;
        if (this.e != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.Q0 != colorStateList) {
            if (this.P0 == null) {
                this.c1.r(colorStateList);
            }
            this.Q0 = colorStateList;
            if (this.e != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(@NonNull jcs jcsVar) {
        this.o = jcsVar;
    }

    public void setMaxEms(int i) {
        this.h = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.j = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.g = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.i = i;
        EditText editText = this.e;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinWidth(i);
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        a7b a7bVar = this.c;
        a7bVar.g.setContentDescription(i != 0 ? a7bVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        a7b a7bVar = this.c;
        a7bVar.g.setImageDrawable(i != 0 ? y2x.w(a7bVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        a7b a7bVar = this.c;
        if (z && a7bVar.i != 1) {
            a7bVar.f(1);
        } else if (z) {
            a7bVar.getClass();
        } else {
            a7bVar.f(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        a7b a7bVar = this.c;
        a7bVar.k = colorStateList;
        cxb.D(a7bVar.a, a7bVar.g, colorStateList, a7bVar.l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        a7b a7bVar = this.c;
        a7bVar.l = mode;
        cxb.D(a7bVar.a, a7bVar.g, a7bVar.k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.u == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.u = appCompatTextView;
            appCompatTextView.setId(ru.yandex.music.R.id.textinput_placeholder);
            this.u.setImportantForAccessibility(1);
            this.u.setAccessibilityLiveRegion(1);
            w3c f = f();
            this.x = f;
            f.b = 67L;
            this.y = f();
            setPlaceholderTextAppearance(this.w);
            setPlaceholderTextColor(this.v);
            wdu.q(this.u, new eb(6));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.t) {
                setPlaceholderTextEnabled(true);
            }
            this.s = charSequence;
        }
        EditText editText = this.e;
        x(editText == null ? null : editText.getText());
    }

    public void setPlaceholderTextAppearance(int i) {
        this.w = i;
        AppCompatTextView appCompatTextView = this.u;
        if (appCompatTextView != null) {
            appCompatTextView.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.v != colorStateList) {
            this.v = colorStateList;
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || colorStateList == null) {
                return;
            }
            appCompatTextView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        kbr kbrVar = this.b;
        kbrVar.getClass();
        kbrVar.c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        kbrVar.b.setText(charSequence);
        kbrVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.b.b.setTextAppearance(i);
    }

    public void setPrefixTextColor(@NonNull ColorStateList colorStateList) {
        this.b.b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(@NonNull eup eupVar) {
        a aVar = this.G;
        if (aVar == null || aVar.b.a == eupVar) {
            return;
        }
        this.v0 = eupVar;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.b.d.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? y2x.w(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        kbr kbrVar = this.b;
        if (i < 0) {
            kbrVar.getClass();
            xq0.x("startIconSize cannot be less than 0");
        } else if (i != kbrVar.g) {
            kbrVar.g = i;
            CheckableImageButton checkableImageButton = kbrVar.d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        kbr kbrVar = this.b;
        CheckableImageButton checkableImageButton = kbrVar.d;
        View.OnLongClickListener onLongClickListener = kbrVar.i;
        checkableImageButton.setOnClickListener(onClickListener);
        cxb.k0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        kbr kbrVar = this.b;
        kbrVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = kbrVar.d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        cxb.k0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(@NonNull ImageView.ScaleType scaleType) {
        kbr kbrVar = this.b;
        kbrVar.h = scaleType;
        kbrVar.d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        kbr kbrVar = this.b;
        if (kbrVar.e != colorStateList) {
            kbrVar.e = colorStateList;
            cxb.D(kbrVar.a, kbrVar.d, colorStateList, kbrVar.f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        kbr kbrVar = this.b;
        if (kbrVar.f != mode) {
            kbrVar.f = mode;
            cxb.D(kbrVar.a, kbrVar.d, kbrVar.e, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.b.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        a7b a7bVar = this.c;
        a7bVar.getClass();
        a7bVar.p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        a7bVar.q.setText(charSequence);
        a7bVar.m();
    }

    public void setSuffixTextAppearance(int i) {
        this.c.q.setTextAppearance(i);
    }

    public void setSuffixTextColor(@NonNull ColorStateList colorStateList) {
        this.c.q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(ics icsVar) {
        EditText editText = this.e;
        if (editText != null) {
            wdu.q(editText, icsVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.I0) {
            this.I0 = typeface;
            bu4 bu4Var = this.c1;
            boolean t = bu4Var.t(typeface);
            boolean z = bu4Var.z(typeface);
            if (t || z) {
                bu4Var.l(false);
            }
            rje rjeVar = this.k;
            if (typeface != rjeVar.B) {
                rjeVar.B = typeface;
                AppCompatTextView appCompatTextView = rjeVar.r;
                if (appCompatTextView != null) {
                    appCompatTextView.setTypeface(typeface);
                }
                AppCompatTextView appCompatTextView2 = rjeVar.y;
                if (appCompatTextView2 != null) {
                    appCompatTextView2.setTypeface(typeface);
                }
            }
            AppCompatTextView appCompatTextView3 = this.p;
            if (appCompatTextView3 != null) {
                appCompatTextView3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        AppCompatTextView appCompatTextView;
        EditText editText = this.e;
        if (editText == null || this.y0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = xpa.a;
        Drawable mutate = background.mutate();
        if (o()) {
            mutate.setColorFilter(ir0.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.n && (appCompatTextView = this.p) != null) {
            mutate.setColorFilter(ir0.c(appCompatTextView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.e.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.e;
        if (editText == null || this.G == null) {
            return;
        }
        if ((this.J || editText.getBackground() == null) && this.y0 != 0) {
            this.e.setBackground(getEditTextBoxBackground());
            this.J = true;
        }
    }

    public final void v() {
        if (this.y0 != 1) {
            FrameLayout frameLayout = this.a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int e = e();
            if (e != layoutParams.topMargin) {
                layoutParams.topMargin = e;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        AppCompatTextView appCompatTextView;
        boolean isEnabled = isEnabled();
        EditText editText = this.e;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.e;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.P0;
        bu4 bu4Var = this.c1;
        if (colorStateList2 != null) {
            bu4Var.n(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.P0;
            int i = this.Z0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, i);
            }
            bu4Var.n(ColorStateList.valueOf(i));
        } else if (o()) {
            AppCompatTextView appCompatTextView2 = this.k.r;
            bu4Var.n(appCompatTextView2 != null ? appCompatTextView2.getTextColors() : null);
        } else if (this.n && (appCompatTextView = this.p) != null) {
            bu4Var.n(appCompatTextView.getTextColors());
        } else if (z4 && (colorStateList = this.Q0) != null) {
            bu4Var.r(colorStateList);
        }
        a7b a7bVar = this.c;
        kbr kbrVar = this.b;
        if (z3 || !this.d1 || (isEnabled() && z4)) {
            if (z2 || this.b1) {
                ValueAnimator valueAnimator = this.f1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f1.cancel();
                }
                if (z && this.e1) {
                    b(1.0f);
                } else {
                    bu4Var.A(1.0f);
                }
                this.b1 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.e;
                x(editText3 != null ? editText3.getText() : null);
                kbrVar.j = false;
                kbrVar.e();
                a7bVar.r = false;
                a7bVar.m();
                return;
            }
            return;
        }
        if (z2 || !this.b1) {
            ValueAnimator valueAnimator2 = this.f1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f1.cancel();
            }
            if (z && this.e1) {
                b(0.0f);
            } else {
                bu4Var.A(0.0f);
            }
            if (g() && !((ky6) this.G).H.s.isEmpty() && g()) {
                ((ky6) this.G).C(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.b1 = true;
            AppCompatTextView appCompatTextView3 = this.u;
            if (appCompatTextView3 != null && this.t) {
                appCompatTextView3.setText((CharSequence) null);
                l8t.a(this.a, this.y);
                this.u.setVisibility(4);
            }
            kbrVar.j = true;
            kbrVar.e();
            a7bVar.r = true;
            a7bVar.m();
        }
    }

    public final void x(Editable editable) {
        ((e7o) this.o).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.a;
        if (length != 0 || this.b1) {
            AppCompatTextView appCompatTextView = this.u;
            if (appCompatTextView == null || !this.t) {
                return;
            }
            appCompatTextView.setText((CharSequence) null);
            l8t.a(frameLayout, this.y);
            this.u.setVisibility(4);
            return;
        }
        if (this.u == null || !this.t || TextUtils.isEmpty(this.s)) {
            return;
        }
        this.u.setText(this.s);
        l8t.a(frameLayout, this.x);
        this.u.setVisibility(0);
        this.u.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.U0.getDefaultColor();
        int colorForState = this.U0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.U0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.D0 = colorForState2;
        } else if (z2) {
            this.D0 = colorForState;
        } else {
            this.D0 = defaultColor;
        }
    }

    public final void z() {
        AppCompatTextView appCompatTextView;
        EditText editText;
        EditText editText2;
        if (this.G == null || this.y0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.e) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.e) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.D0 = this.Z0;
        } else if (o()) {
            if (this.U0 != null) {
                y(z2, z);
            } else {
                this.D0 = getErrorCurrentTextColors();
            }
        } else if (!this.n || (appCompatTextView = this.p) == null) {
            if (z2) {
                this.D0 = this.T0;
            } else if (z) {
                this.D0 = this.S0;
            } else {
                this.D0 = this.R0;
            }
        } else if (this.U0 != null) {
            y(z2, z);
        } else {
            this.D0 = appCompatTextView.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        a7b a7bVar = this.c;
        TextInputLayout textInputLayout = a7bVar.a;
        CheckableImageButton checkableImageButton = a7bVar.g;
        TextInputLayout textInputLayout2 = a7bVar.a;
        a7bVar.k();
        cxb.d0(textInputLayout2, a7bVar.c, a7bVar.d);
        cxb.d0(textInputLayout2, checkableImageButton, a7bVar.k);
        if (a7bVar.a() instanceof wra) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                cxb.D(textInputLayout, checkableImageButton, a7bVar.k, a7bVar.l);
            } else {
                Drawable mutate = checkableImageButton.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(mutate);
            }
        }
        kbr kbrVar = this.b;
        cxb.d0(kbrVar.a, kbrVar.d, kbrVar.e);
        if (this.y0 == 2) {
            int i = this.A0;
            if (z2 && isEnabled()) {
                this.A0 = this.C0;
            } else {
                this.A0 = this.B0;
            }
            if (this.A0 != i && g() && !this.b1) {
                if (g()) {
                    ((ky6) this.G).C(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.y0 == 1) {
            if (!isEnabled()) {
                this.E0 = this.W0;
            } else if (z && !z2) {
                this.E0 = this.Y0;
            } else if (z2) {
                this.E0 = this.X0;
            } else {
                this.E0 = this.V0;
            }
        }
        c();
    }

    public void setHint(CharSequence charSequence) {
        if (this.D) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.b.d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.b.b(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.c.g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.c.g.setImageDrawable(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.c.g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.c.h(drawable);
    }

    public void setEndIconDrawable(Drawable drawable) {
        a7b a7bVar = this.c;
        TextInputLayout textInputLayout = a7bVar.a;
        CheckableImageButton checkableImageButton = a7bVar.g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            cxb.D(textInputLayout, checkableImageButton, a7bVar.k, a7bVar.l);
            cxb.d0(textInputLayout, checkableImageButton, a7bVar.k);
        }
    }

    public TextInputLayout(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, ru.yandex.music.R.attr.textInputStyle);
    }

    public TextInputLayout(@NonNull Context context) {
        this(context, null);
    }
}
