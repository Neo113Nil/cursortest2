package com.google.android.material.textfield;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
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
import com.gamericefishpro.space.a8.b;
import com.gamericefishpro.space.bb.s;
import com.gamericefishpro.space.d4.l0;
import com.gamericefishpro.space.fa.c;
import com.gamericefishpro.space.fa.d;
import com.gamericefishpro.space.fa.l;
import com.gamericefishpro.space.i6.h;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.ka.f;
import com.gamericefishpro.space.ka.j;
import com.gamericefishpro.space.ka.m;
import com.gamericefishpro.space.ka.n;
import com.gamericefishpro.space.n.i0;
import com.gamericefishpro.space.n.q;
import com.gamericefishpro.space.n.q0;
import com.gamericefishpro.space.na.a0;
import com.gamericefishpro.space.na.g;
import com.gamericefishpro.space.na.o;
import com.gamericefishpro.space.na.p;
import com.gamericefishpro.space.na.t;
import com.gamericefishpro.space.na.v;
import com.gamericefishpro.space.na.w;
import com.gamericefishpro.space.na.x;
import com.gamericefishpro.space.na.y;
import com.gamericefishpro.space.na.z;
import com.gamericefishpro.space.oa.a;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {
    public static final int[][] W0 = {new int[]{R.attr.state_pressed}, new int[0]};
    public int A;
    public int A0;
    public int B;
    public Drawable B0;
    public int C;
    public ColorStateList C0;
    public final t D;
    public ColorStateList D0;
    public boolean E;
    public int E0;
    public int F;
    public int F0;
    public boolean G;
    public int G0;
    public z H;
    public ColorStateList H0;
    public i0 I;
    public int I0;
    public int J;
    public int J0;
    public int K;
    public int K0;
    public CharSequence L;
    public int L0;
    public boolean M;
    public int M0;
    public i0 N;
    public int N0;
    public ColorStateList O;
    public boolean O0;
    public int P;
    public final c P0;
    public h Q;
    public boolean Q0;
    public h R;
    public boolean R0;
    public ColorStateList S;
    public ValueAnimator S0;
    public ColorStateList T;
    public boolean T0;
    public ColorStateList U;
    public boolean U0;
    public ColorStateList V;
    public boolean V0;
    public boolean W;
    public CharSequence a0;
    public boolean b0;
    public j c0;
    public final FrameLayout d;
    public j d0;
    public final v e;
    public StateListDrawable e0;
    public boolean f0;
    public j g0;
    public j h0;
    public final p i;
    public n i0;
    public boolean j0;
    public final int k0;
    public int l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public final Rect s0;
    public final Rect t0;
    public final RectF u0;
    public final int v;
    public Typeface v0;
    public EditText w;
    public ColorDrawable w0;
    public int x0;
    public CharSequence y;
    public final LinkedHashSet y0;
    public int z;
    public ColorDrawable z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.gamericefishpro.space.R.attr.textInputStyle, com.gamericefishpro.space.R.style.Widget_Design_TextInputLayout), attributeSet, com.gamericefishpro.space.R.attr.textInputStyle);
        this.z = -1;
        this.A = -1;
        this.B = -1;
        this.C = -1;
        this.D = new t(this);
        this.H = new s(19);
        this.s0 = new Rect();
        this.t0 = new Rect();
        this.u0 = new RectF();
        this.y0 = new LinkedHashSet();
        c cVar = new c(this);
        this.P0 = cVar;
        this.V0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.d = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = com.gamericefishpro.space.t9.a.a;
        cVar.R = linearInterpolator;
        cVar.j(false);
        cVar.Q = linearInterpolator;
        cVar.j(false);
        if (cVar.g != 8388659) {
            cVar.g = 8388659;
            cVar.j(false);
        }
        l.a(context2, attributeSet, com.gamericefishpro.space.R.attr.textInputStyle, com.gamericefishpro.space.R.style.Widget_Design_TextInputLayout);
        int[] iArr = com.gamericefishpro.space.s9.a.x;
        l.b(context2, attributeSet, iArr, com.gamericefishpro.space.R.attr.textInputStyle, com.gamericefishpro.space.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 50);
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, com.gamericefishpro.space.R.attr.textInputStyle, com.gamericefishpro.space.R.style.Widget_Design_TextInputLayout);
        com.gamericefishpro.space.a8.c cVar2 = new com.gamericefishpro.space.a8.c(context2, typedArrayObtainStyledAttributes);
        v vVar = new v(this, cVar2);
        this.e = vVar;
        this.W = typedArrayObtainStyledAttributes.getBoolean(48, true);
        setHint(typedArrayObtainStyledAttributes.getText(4));
        this.R0 = typedArrayObtainStyledAttributes.getBoolean(47, true);
        this.Q0 = typedArrayObtainStyledAttributes.getBoolean(42, true);
        if (typedArrayObtainStyledAttributes.hasValue(6)) {
            setMinEms(typedArrayObtainStyledAttributes.getInt(6, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(3)) {
            setMinWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(3, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(5)) {
            setMaxEms(typedArrayObtainStyledAttributes.getInt(5, -1));
        } else if (typedArrayObtainStyledAttributes.hasValue(2)) {
            setMaxWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(2, -1));
        }
        this.i0 = n.b(context2, attributeSet, com.gamericefishpro.space.R.attr.textInputStyle, com.gamericefishpro.space.R.style.Widget_Design_TextInputLayout).a();
        this.k0 = context2.getResources().getDimensionPixelOffset(com.gamericefishpro.space.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.m0 = typedArrayObtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.v = getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.m3_multiline_hint_filled_text_extra_space);
        this.o0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.p0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.n0 = this.o0;
        float dimension = typedArrayObtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = typedArrayObtainStyledAttributes.getDimension(11, -1.0f);
        m mVarF = this.i0.f();
        if (dimension >= 0.0f) {
            mVarF.e = new com.gamericefishpro.space.ka.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            mVarF.f = new com.gamericefishpro.space.ka.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            mVarF.g = new com.gamericefishpro.space.ka.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            mVarF.h = new com.gamericefishpro.space.ka.a(dimension4);
        }
        this.i0 = mVarF.a();
        ColorStateList colorStateListW = com.gamericefishpro.space.hj.c.w(context2, cVar2, 7);
        if (colorStateListW != null) {
            int defaultColor = colorStateListW.getDefaultColor();
            this.I0 = defaultColor;
            this.r0 = defaultColor;
            if (colorStateListW.isStateful()) {
                this.J0 = colorStateListW.getColorForState(new int[]{-16842910}, -1);
                this.K0 = colorStateListW.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.L0 = colorStateListW.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.K0 = this.I0;
                ColorStateList colorStateListC = com.gamericefishpro.space.s3.a.c(context2, com.gamericefishpro.space.R.color.mtrl_filled_background_color);
                this.J0 = colorStateListC.getColorForState(new int[]{-16842910}, -1);
                this.L0 = colorStateListC.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.r0 = 0;
            this.I0 = 0;
            this.J0 = 0;
            this.K0 = 0;
            this.L0 = 0;
        }
        if (typedArrayObtainStyledAttributes.hasValue(1)) {
            ColorStateList colorStateListK = cVar2.k(1);
            this.D0 = colorStateListK;
            this.C0 = colorStateListK;
        }
        ColorStateList colorStateListW2 = com.gamericefishpro.space.hj.c.w(context2, cVar2, 14);
        this.G0 = typedArrayObtainStyledAttributes.getColor(14, 0);
        this.E0 = context2.getColor(com.gamericefishpro.space.R.color.mtrl_textinput_default_box_stroke_color);
        this.M0 = context2.getColor(com.gamericefishpro.space.R.color.mtrl_textinput_disabled_color);
        this.F0 = context2.getColor(com.gamericefishpro.space.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateListW2 != null) {
            setBoxStrokeColorStateList(colorStateListW2);
        }
        if (typedArrayObtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(com.gamericefishpro.space.hj.c.w(context2, cVar2, 15));
        }
        if (typedArrayObtainStyledAttributes.getResourceId(50, -1) != -1) {
            setHintTextAppearance(typedArrayObtainStyledAttributes.getResourceId(50, 0));
        }
        this.U = cVar2.k(24);
        this.V = cVar2.k(25);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = typedArrayObtainStyledAttributes.getText(35);
        int i = typedArrayObtainStyledAttributes.getInt(34, 1);
        boolean z = typedArrayObtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(45, 0);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(43);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(58, 0);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(57);
        boolean z3 = typedArrayObtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(typedArrayObtainStyledAttributes.getInt(19, -1));
        this.K = typedArrayObtainStyledAttributes.getResourceId(22, 0);
        this.J = typedArrayObtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(typedArrayObtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.J);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.K);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArrayObtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(cVar2.k(41));
        }
        if (typedArrayObtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(cVar2.k(46));
        }
        if (typedArrayObtainStyledAttributes.hasValue(51)) {
            setHintTextColor(cVar2.k(51));
        }
        if (typedArrayObtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(cVar2.k(23));
        }
        if (typedArrayObtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(cVar2.k(21));
        }
        if (typedArrayObtainStyledAttributes.hasValue(59)) {
            setPlaceholderTextColor(cVar2.k(59));
        }
        p pVar = new p(this, cVar2);
        this.i = pVar;
        boolean z4 = typedArrayObtainStyledAttributes.getBoolean(0, true);
        setHintMaxLines(typedArrayObtainStyledAttributes.getInt(49, 1));
        cVar2.u();
        setImportantForAccessibility(2);
        setImportantForAutofill(1);
        frameLayout.addView(vVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z4);
        setHelperTextEnabled(z2);
        setErrorEnabled(z);
        setCounterEnabled(z3);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.w;
        if (!(editText instanceof AutoCompleteTextView) || editText.getInputType() != 0) {
            return this.c0;
        }
        int iS = com.gamericefishpro.space.b9.a.s(this.w, com.gamericefishpro.space.R.attr.colorControlHighlight);
        int i = this.l0;
        int[][] iArr = W0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            j jVar = this.c0;
            int i2 = this.r0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{com.gamericefishpro.space.b9.a.z(0.1f, iS, i2), i2}), jVar, jVar);
        }
        Context context = getContext();
        j jVar2 = this.c0;
        TypedValue typedValueJ = com.gamericefishpro.space.d9.h.J(com.gamericefishpro.space.R.attr.colorSurface, context, "TextInputLayout");
        int i3 = typedValueJ.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : typedValueJ.data;
        j jVar3 = new j(jVar2.e.a);
        int iZ = com.gamericefishpro.space.b9.a.z(0.1f, iS, color);
        jVar3.n(new ColorStateList(iArr, new int[]{iZ, 0}));
        jVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{iZ, color});
        j jVar4 = new j(jVar2.e.a);
        jVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, jVar3, jVar4), jVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.e0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.e0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.e0.addState(new int[0], h(false));
        }
        return this.e0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.d0 == null) {
            this.d0 = h(true);
        }
        return this.d0;
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
        if (this.w != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        getEndIconMode();
        this.w = editText;
        int i = this.z;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.B);
        }
        int i2 = this.A;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.C);
        }
        this.f0 = false;
        k();
        setTextInputAccessibilityDelegate(new y(this));
        Typeface typeface = this.w.getTypeface();
        c cVar = this.P0;
        cVar.n(typeface);
        float textSize = this.w.getTextSize();
        if (cVar.h != textSize) {
            cVar.h = textSize;
            cVar.j(false);
        }
        float letterSpacing = this.w.getLetterSpacing();
        if (cVar.X != letterSpacing) {
            cVar.X = letterSpacing;
            cVar.j(false);
        }
        int gravity = this.w.getGravity();
        int i3 = (gravity & (-113)) | 48;
        if (cVar.g != i3) {
            cVar.g = i3;
            cVar.j(false);
        }
        if (cVar.f != gravity) {
            cVar.f = gravity;
            cVar.j(false);
        }
        this.N0 = editText.getMinimumHeight();
        this.w.addTextChangedListener(new w(this, editText));
        if (this.C0 == null) {
            this.C0 = this.w.getHintTextColors();
        }
        if (this.W) {
            if (TextUtils.isEmpty(this.a0)) {
                CharSequence hint = this.w.getHint();
                this.y = hint;
                setHint(hint);
                this.w.setHint((CharSequence) null);
            }
            this.b0 = true;
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        if (this.I != null) {
            p(this.w.getText());
        }
        t();
        this.D.b();
        this.e.bringToFront();
        p pVar = this.i;
        pVar.bringToFront();
        Iterator it = this.y0.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        w(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.a0)) {
            return;
        }
        this.a0 = charSequence;
        c cVar = this.P0;
        if (charSequence == null || !TextUtils.equals(cVar.B, charSequence)) {
            cVar.B = charSequence;
            cVar.C = null;
            cVar.j(false);
        }
        if (this.O0) {
            return;
        }
        l();
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.M == z) {
            return;
        }
        if (z) {
            i0 i0Var = this.N;
            if (i0Var != null) {
                this.d.addView(i0Var);
                this.N.setVisibility(0);
            }
        } else {
            i0 i0Var2 = this.N;
            if (i0Var2 != null) {
                i0Var2.setVisibility(8);
            }
            this.N = null;
        }
        this.M = z;
    }

    public final void a() {
        if (this.w == null || this.l0 != 1) {
            return;
        }
        if (getHintMaxLines() != 1) {
            EditText editText = this.w;
            editText.setPaddingRelative(editText.getPaddingStart(), (int) (this.P0.f() + this.v), this.w.getPaddingEnd(), getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
        } else if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
            EditText editText2 = this.w;
            editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.material_filled_edittext_font_2_0_padding_top), this.w.getPaddingEnd(), getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
        } else if (com.gamericefishpro.space.hj.c.E(getContext())) {
            EditText editText3 = this.w;
            editText3.setPaddingRelative(editText3.getPaddingStart(), getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.material_filled_edittext_font_1_3_padding_top), this.w.getPaddingEnd(), getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
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
        FrameLayout frameLayout = this.d;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        v();
        setEditText((EditText) view);
    }

    public final void b(float f) {
        c cVar = this.P0;
        if (cVar.b == f) {
            return;
        }
        int i = 0;
        if (this.S0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.S0 = valueAnimator;
            valueAnimator.setInterpolator(com.gamericefishpro.space.a.a.C(getContext(), com.gamericefishpro.space.R.attr.motionEasingEmphasizedInterpolator, com.gamericefishpro.space.t9.a.b));
            this.S0.setDuration(com.gamericefishpro.space.a.a.B(getContext(), com.gamericefishpro.space.R.attr.motionDurationMedium4, 167));
            this.S0.addUpdateListener(new x(i, this));
        }
        this.S0.setFloatValues(cVar.b, f);
        this.S0.start();
    }

    public final void c() {
        int i;
        int i2;
        j jVar = this.c0;
        if (jVar == null) {
            return;
        }
        n nVar = jVar.e.a;
        n nVar2 = this.i0;
        if (nVar != nVar2) {
            jVar.setShapeAppearanceModel(nVar2);
        }
        if (this.l0 == 2 && (i = this.n0) > -1 && (i2 = this.q0) != 0) {
            j jVar2 = this.c0;
            jVar2.e.k = i;
            jVar2.invalidateSelf();
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2);
            com.gamericefishpro.space.ka.h hVar = jVar2.e;
            if (hVar.e != colorStateListValueOf) {
                hVar.e = colorStateListValueOf;
                jVar2.onStateChange(jVar2.getState());
            }
        }
        int iB = this.r0;
        if (this.l0 == 1) {
            iB = com.gamericefishpro.space.u3.a.b(this.r0, com.gamericefishpro.space.b9.a.r(getContext(), com.gamericefishpro.space.R.attr.colorSurface, 0));
        }
        this.r0 = iB;
        this.c0.n(ColorStateList.valueOf(iB));
        j jVar3 = this.g0;
        if (jVar3 != null && this.h0 != null) {
            if (this.n0 > -1 && this.q0 != 0) {
                jVar3.n(this.w.isFocused() ? ColorStateList.valueOf(this.E0) : ColorStateList.valueOf(this.q0));
                this.h0.n(ColorStateList.valueOf(this.q0));
            }
            invalidate();
        }
        u();
    }

    public final Rect d(Rect rect) {
        if (this.w == null) {
            throw new IllegalStateException();
        }
        boolean z = getLayoutDirection() == 1;
        int i = rect.bottom;
        Rect rect2 = this.t0;
        rect2.bottom = i;
        int i2 = this.l0;
        if (i2 == 1) {
            rect2.left = i(rect.left, z);
            rect2.top = rect.top + this.m0;
            rect2.right = j(rect.right, z);
            return rect2;
        }
        if (i2 != 2) {
            rect2.left = i(rect.left, z);
            rect2.top = getPaddingTop();
            rect2.right = j(rect.right, z);
            return rect2;
        }
        rect2.left = this.w.getPaddingLeft() + rect.left;
        rect2.top = rect.top - e();
        rect2.right = rect.right - this.w.getPaddingRight();
        return rect2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.w;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.y != null) {
            boolean z = this.b0;
            this.b0 = false;
            CharSequence hint = editText.getHint();
            this.w.setHint(this.y);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.w.setHint(hint);
                this.b0 = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.d;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i);
            if (childAt == this.w) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.U0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.U0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        j jVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z = this.W;
        c cVar = this.P0;
        if (z) {
            TextPaint textPaint = cVar.O;
            RectF rectF = cVar.e;
            int iSave = canvas2.save();
            if (cVar.C != null && rectF.width() > 0.0f && rectF.height() > 0.0f) {
                textPaint.setTextSize(cVar.G);
                float f = cVar.q;
                float f2 = cVar.r;
                float f3 = cVar.F;
                if (f3 != 1.0f) {
                    canvas2.scale(f3, f3, f, f2);
                }
                if ((cVar.e0 > 1 || cVar.f0 > 1) && !cVar.D && cVar.o()) {
                    float lineStart = cVar.q - cVar.Z.getLineStart(0);
                    int alpha = textPaint.getAlpha();
                    canvas2.translate(lineStart, f2);
                    float f4 = alpha;
                    textPaint.setAlpha((int) (cVar.c0 * f4));
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 31) {
                        float f5 = cVar.H;
                        float f6 = cVar.I;
                        float f7 = cVar.J;
                        int i2 = cVar.K;
                        textPaint.setShadowLayer(f5, f6, f7, com.gamericefishpro.space.u3.a.d(i2, (textPaint.getAlpha() * Color.alpha(i2)) / 255));
                    }
                    cVar.Z.draw(canvas2);
                    textPaint.setAlpha((int) (cVar.b0 * f4));
                    if (i >= 31) {
                        float f8 = cVar.H;
                        float f9 = cVar.I;
                        float f10 = cVar.J;
                        int i3 = cVar.K;
                        textPaint.setShadowLayer(f8, f9, f10, com.gamericefishpro.space.u3.a.d(i3, (Color.alpha(i3) * textPaint.getAlpha()) / 255));
                    }
                    int lineBaseline = cVar.Z.getLineBaseline(0);
                    CharSequence charSequence = cVar.d0;
                    float f11 = lineBaseline;
                    canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f11, textPaint);
                    if (i >= 31) {
                        textPaint.setShadowLayer(cVar.H, cVar.I, cVar.J, cVar.K);
                    }
                    String strTrim = cVar.d0.toString().trim();
                    if (strTrim.endsWith("…")) {
                        strTrim = strTrim.substring(0, strTrim.length() - 1);
                    }
                    String str = strTrim;
                    textPaint.setAlpha(alpha);
                    canvas2 = canvas;
                    canvas2.drawText(str, 0, Math.min(cVar.Z.getLineEnd(0), str.length()), 0.0f, f11, (Paint) textPaint);
                } else {
                    canvas2.translate(f, f2);
                    cVar.Z.draw(canvas2);
                }
                canvas2.restoreToCount(iSave);
            }
        }
        if (this.h0 == null || (jVar = this.g0) == null) {
            return;
        }
        jVar.draw(canvas2);
        if (this.w.isFocused()) {
            Rect bounds = this.h0.getBounds();
            Rect bounds2 = this.g0.getBounds();
            float f12 = cVar.b;
            int iCenterX = bounds2.centerX();
            bounds.left = com.gamericefishpro.space.t9.a.c(f12, iCenterX, bounds2.left);
            bounds.right = com.gamericefishpro.space.t9.a.c(f12, iCenterX, bounds2.right);
            this.h0.draw(canvas2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002f  */
    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        boolean z;
        ColorStateList colorStateList;
        if (this.T0) {
            return;
        }
        this.T0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        c cVar = this.P0;
        if (cVar != null) {
            cVar.M = drawableState;
            ColorStateList colorStateList2 = cVar.k;
            if ((colorStateList2 == null || !colorStateList2.isStateful()) && ((colorStateList = cVar.j) == null || !colorStateList.isStateful())) {
                z = false;
            } else {
                cVar.j(false);
                z = true;
            }
        } else {
            z = false;
        }
        if (this.w != null) {
            w(isLaidOut() && isEnabled(), false);
        }
        t();
        z();
        if (z) {
            invalidate();
        }
        this.T0 = false;
    }

    public final int e() {
        if (this.W) {
            int i = this.l0;
            c cVar = this.P0;
            if (i == 0) {
                return (int) cVar.f();
            }
            if (i == 2) {
                if (getHintMaxLines() == 1) {
                    return (int) (cVar.f() / 2.0f);
                }
                float f = cVar.f();
                TextPaint textPaint = cVar.P;
                textPaint.setTextSize(cVar.i);
                textPaint.setTypeface(cVar.s);
                textPaint.setLetterSpacing(cVar.W);
                return Math.max(0, (int) (f - ((-textPaint.ascent()) / 2.0f)));
            }
        }
        return 0;
    }

    public final h f() {
        h hVar = new h();
        hVar.i = com.gamericefishpro.space.a.a.B(getContext(), com.gamericefishpro.space.R.attr.motionDurationShort2, 87);
        hVar.v = com.gamericefishpro.space.a.a.C(getContext(), com.gamericefishpro.space.R.attr.motionEasingLinearInterpolator, com.gamericefishpro.space.t9.a.a);
        return hVar;
    }

    public final boolean g() {
        return this.W && !TextUtils.isEmpty(this.a0) && (this.c0 instanceof com.gamericefishpro.space.na.h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.w;
        if (editText == null) {
            return super.getBaseline();
        }
        return e() + getPaddingTop() + editText.getBaseline();
    }

    public j getBoxBackground() {
        int i = this.l0;
        if (i == 1 || i == 2) {
            return this.c0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.r0;
    }

    public int getBoxBackgroundMode() {
        return this.l0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.m0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.u0;
        return layoutDirection == 1 ? this.i0.h.a(rectF) : this.i0.g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.u0;
        return layoutDirection == 1 ? this.i0.g.a(rectF) : this.i0.h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.u0;
        return layoutDirection == 1 ? this.i0.e.a(rectF) : this.i0.f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        int layoutDirection = getLayoutDirection();
        RectF rectF = this.u0;
        return layoutDirection == 1 ? this.i0.f.a(rectF) : this.i0.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.G0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.H0;
    }

    public int getBoxStrokeWidth() {
        return this.o0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.p0;
    }

    public int getCounterMaxLength() {
        return this.F;
    }

    public CharSequence getCounterOverflowDescription() {
        i0 i0Var;
        if (this.E && this.G && (i0Var = this.I) != null) {
            return i0Var.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.T;
    }

    public ColorStateList getCounterTextColor() {
        return this.S;
    }

    public ColorStateList getCursorColor() {
        return this.U;
    }

    public ColorStateList getCursorErrorColor() {
        return this.V;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.C0;
    }

    public EditText getEditText() {
        return this.w;
    }

    public CharSequence getEndIconContentDescription() {
        return this.i.z.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.i.z.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.i.F;
    }

    public int getEndIconMode() {
        return this.i.B;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.i.G;
    }

    public CheckableImageButton getEndIconView() {
        return this.i.z;
    }

    public CharSequence getError() {
        t tVar = this.D;
        if (tVar.q) {
            return tVar.p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.D.t;
    }

    public CharSequence getErrorContentDescription() {
        return this.D.s;
    }

    public int getErrorCurrentTextColors() {
        i0 i0Var = this.D.r;
        if (i0Var != null) {
            return i0Var.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.i.i.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.D;
        if (tVar.x) {
            return tVar.w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        i0 i0Var = this.D.y;
        if (i0Var != null) {
            return i0Var.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.W) {
            return this.a0;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.P0.f();
    }

    public final int getHintCurrentCollapsedTextColor() {
        c cVar = this.P0;
        return cVar.g(cVar.k);
    }

    public int getHintMaxLines() {
        return this.P0.e0;
    }

    public ColorStateList getHintTextColor() {
        return this.D0;
    }

    public z getLengthCounter() {
        return this.H;
    }

    public int getMaxEms() {
        return this.A;
    }

    public int getMaxWidth() {
        return this.C;
    }

    public int getMinEms() {
        return this.z;
    }

    public int getMinWidth() {
        return this.B;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.i.z.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.i.z.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.M) {
            return this.L;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.P;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.O;
    }

    public CharSequence getPrefixText() {
        return this.e.i;
    }

    public ColorStateList getPrefixTextColor() {
        return this.e.e.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.e.e;
    }

    public n getShapeAppearanceModel() {
        return this.i0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.e.v.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.e.v.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.e.z;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.e.A;
    }

    public CharSequence getSuffixText() {
        return this.i.I;
    }

    public ColorStateList getSuffixTextColor() {
        return this.i.J.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.i.J;
    }

    public Typeface getTypeface() {
        return this.v0;
    }

    public final j h(boolean z) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.gamericefishpro.space.R.dimen.mtrl_shape_corner_size_small_component);
        float f = z ? dimensionPixelOffset : 0.0f;
        float dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.gamericefishpro.space.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset3 = getResources().getDimensionPixelOffset(com.gamericefishpro.space.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        com.gamericefishpro.space.ka.l lVar = new com.gamericefishpro.space.ka.l();
        com.gamericefishpro.space.ka.l lVar2 = new com.gamericefishpro.space.ka.l();
        com.gamericefishpro.space.ka.l lVar3 = new com.gamericefishpro.space.ka.l();
        com.gamericefishpro.space.ka.l lVar4 = new com.gamericefishpro.space.ka.l();
        int i = 0;
        f fVar = new f(i);
        f fVar2 = new f(i);
        f fVar3 = new f(i);
        f fVar4 = new f(i);
        com.gamericefishpro.space.ka.a aVar = new com.gamericefishpro.space.ka.a(f);
        com.gamericefishpro.space.ka.a aVar2 = new com.gamericefishpro.space.ka.a(f);
        com.gamericefishpro.space.ka.a aVar3 = new com.gamericefishpro.space.ka.a(dimensionPixelOffset);
        com.gamericefishpro.space.ka.a aVar4 = new com.gamericefishpro.space.ka.a(dimensionPixelOffset);
        n nVar = new n();
        nVar.a = lVar;
        nVar.b = lVar2;
        nVar.c = lVar3;
        nVar.d = lVar4;
        nVar.e = aVar;
        nVar.f = aVar2;
        nVar.g = aVar4;
        nVar.h = aVar3;
        nVar.i = fVar;
        nVar.j = fVar2;
        nVar.k = fVar3;
        nVar.l = fVar4;
        Context context = getContext();
        Paint paint = j.X;
        TypedValue typedValueJ = com.gamericefishpro.space.d9.h.J(com.gamericefishpro.space.R.attr.colorSurface, context, j.class.getSimpleName());
        int i2 = typedValueJ.resourceId;
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : typedValueJ.data);
        j jVar = new j();
        jVar.k(context);
        jVar.n(colorStateListValueOf);
        jVar.m(dimensionPixelOffset2);
        jVar.setShapeAppearanceModel(nVar);
        com.gamericefishpro.space.ka.h hVar = jVar.e;
        if (hVar.h == null) {
            hVar.h = new Rect();
        }
        jVar.e.h.set(0, dimensionPixelOffset3, 0, dimensionPixelOffset3);
        jVar.invalidateSelf();
        return jVar;
    }

    public final int i(int i, boolean z) {
        int compoundPaddingLeft;
        if (z || getPrefixText() == null) {
            compoundPaddingLeft = (!z || getSuffixText() == null) ? this.w.getCompoundPaddingLeft() : this.i.c();
        } else {
            compoundPaddingLeft = this.e.a();
        }
        return compoundPaddingLeft + i;
    }

    public final int j(int i, boolean z) {
        int compoundPaddingRight;
        if (z || getSuffixText() == null) {
            compoundPaddingRight = (!z || getPrefixText() == null) ? this.w.getCompoundPaddingRight() : this.e.a();
        } else {
            compoundPaddingRight = this.i.c();
        }
        return i - compoundPaddingRight;
    }

    public final void k() {
        int i = this.l0;
        if (i == 0) {
            this.c0 = null;
            this.g0 = null;
            this.h0 = null;
        } else if (i == 1) {
            this.c0 = new j(this.i0);
            this.g0 = new j();
            this.h0 = new j();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.l0 + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.W || (this.c0 instanceof com.gamericefishpro.space.na.h)) {
                this.c0 = new j(this.i0);
            } else {
                n nVar = this.i0;
                int i2 = com.gamericefishpro.space.na.h.a0;
                if (nVar == null) {
                    nVar = new n();
                }
                g gVar = new g(nVar, new RectF());
                com.gamericefishpro.space.na.h hVar = new com.gamericefishpro.space.na.h(gVar);
                hVar.Z = gVar;
                this.c0 = hVar;
            }
            this.g0 = null;
            this.h0 = null;
        }
        u();
        z();
        if (this.l0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.m0 = getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (com.gamericefishpro.space.hj.c.E(getContext())) {
                this.m0 = getResources().getDimensionPixelSize(com.gamericefishpro.space.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        a();
        if (this.l0 != 0) {
            v();
        }
        EditText editText = this.w;
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.l0;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:52:0x00cb  */
    public final void l() {
        float f;
        float f2;
        float f3;
        RectF rectF;
        float f4;
        float lineWidth;
        int i;
        float f5;
        int i2;
        if (g()) {
            int width = this.w.getWidth();
            int gravity = this.w.getGravity();
            c cVar = this.P0;
            boolean zC = cVar.c(cVar.B);
            cVar.D = zC;
            Rect rect = cVar.d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (zC) {
                        i2 = rect.left;
                        f3 = i2;
                    } else {
                        f = rect.right;
                        f2 = cVar.a0;
                    }
                } else if (zC) {
                    f = rect.right;
                    f2 = cVar.a0;
                } else {
                    i2 = rect.left;
                    f3 = i2;
                }
                float fMax = Math.max(f3, rect.left);
                rectF = this.u0;
                rectF.left = fMax;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f4 = (width / 2.0f) + (cVar.a0 / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (cVar.D) {
                        f5 = cVar.a0;
                        f4 = f5 + fMax;
                    } else {
                        i = rect.right;
                        f4 = i;
                    }
                } else if (cVar.D) {
                    i = rect.right;
                    f4 = i;
                } else {
                    f5 = cVar.a0;
                    f4 = f5 + fMax;
                }
                rectF.right = Math.min(f4, rect.right);
                rectF.bottom = cVar.f() + rect.top;
                if (cVar.Z != null && !cVar.o()) {
                    StaticLayout staticLayout = cVar.Z;
                    lineWidth = (cVar.i / cVar.h) * staticLayout.getLineWidth(staticLayout.getLineCount() - 1);
                    if (cVar.D) {
                        rectF.left = rectF.right - lineWidth;
                    } else {
                        rectF.right = rectF.left + lineWidth;
                    }
                }
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f6 = rectF.left;
                float f7 = this.k0;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.n0);
                rectF.top = 0.0f;
                com.gamericefishpro.space.na.h hVar = (com.gamericefishpro.space.na.h) this.c0;
                hVar.getClass();
                hVar.t(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f = width / 2.0f;
            f2 = cVar.a0 / 2.0f;
            f3 = f - f2;
            float fMax2 = Math.max(f3, rect.left);
            rectF = this.u0;
            rectF.left = fMax2;
            rectF.top = rect.top;
            if (gravity != 17) {
                f4 = (width / 2.0f) + (cVar.a0 / 2.0f);
            } else {
                f4 = (width / 2.0f) + (cVar.a0 / 2.0f);
            }
            rectF.right = Math.min(f4, rect.right);
            rectF.bottom = cVar.f() + rect.top;
            if (cVar.Z != null) {
                StaticLayout staticLayout2 = cVar.Z;
                lineWidth = (cVar.i / cVar.h) * staticLayout2.getLineWidth(staticLayout2.getLineCount() - 1);
                if (cVar.D) {
                    rectF.left = rectF.right - lineWidth;
                } else {
                    rectF.right = rectF.left + lineWidth;
                }
            }
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void n(i0 i0Var, int i) {
        try {
            i0Var.setTextAppearance(i);
            if (i0Var.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        i0Var.setTextAppearance(com.gamericefishpro.space.R.style.TextAppearance_AppCompat_Caption);
        i0Var.setTextColor(getContext().getColor(com.gamericefishpro.space.R.color.design_error));
    }

    public final boolean o() {
        t tVar = this.D;
        return (tVar.o != 1 || tVar.r == null || TextUtils.isEmpty(tVar.p)) ? false : true;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.P0.i(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int iMax;
        p pVar = this.i;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z = false;
        this.V0 = false;
        if (this.w != null && this.w.getMeasuredHeight() < (iMax = Math.max(pVar.getMeasuredHeight(), this.e.getMeasuredHeight()))) {
            this.w.setMinimumHeight(iMax);
            z = true;
        }
        boolean zS = s();
        if (z || zS) {
            this.w.post(new com.appsflyer.a(14, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float fDescent;
        int i5;
        int compoundPaddingTop;
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.w;
        if (editText != null) {
            Rect rect = this.s0;
            d.a(this, editText, rect);
            j jVar = this.g0;
            if (jVar != null) {
                int i6 = rect.bottom;
                jVar.setBounds(rect.left, i6 - this.o0, rect.right, i6);
            }
            j jVar2 = this.h0;
            if (jVar2 != null) {
                int i7 = rect.bottom;
                jVar2.setBounds(rect.left, i7 - this.p0, rect.right, i7);
            }
            if (this.W) {
                float textSize = this.w.getTextSize();
                c cVar = this.P0;
                float f = cVar.h;
                TextPaint textPaint = cVar.P;
                if (f != textSize) {
                    cVar.h = textSize;
                    cVar.j(false);
                }
                int gravity = this.w.getGravity();
                int i8 = (gravity & (-113)) | 48;
                if (cVar.g != i8) {
                    cVar.g = i8;
                    cVar.j(false);
                }
                if (cVar.f != gravity) {
                    cVar.f = gravity;
                    cVar.j(false);
                }
                Rect rectD = d(rect);
                int i9 = rectD.left;
                int i10 = rectD.top;
                int i11 = rectD.right;
                int i12 = rectD.bottom;
                Rect rect2 = cVar.d;
                if (rect2.left != i9 || rect2.top != i10 || rect2.right != i11 || rect2.bottom != i12) {
                    rect2.set(i9, i10, i11, i12);
                    cVar.N = true;
                }
                if (this.w == null) {
                    throw new IllegalStateException();
                }
                if (getHintMaxLines() == 1) {
                    textPaint.setTextSize(cVar.h);
                    textPaint.setTypeface(cVar.v);
                    textPaint.setLetterSpacing(cVar.X);
                    fDescent = -textPaint.ascent();
                } else {
                    textPaint.setTextSize(cVar.h);
                    textPaint.setTypeface(cVar.v);
                    textPaint.setLetterSpacing(cVar.X);
                    fDescent = cVar.l * (textPaint.descent() + (-textPaint.ascent()));
                }
                int compoundPaddingLeft = this.w.getCompoundPaddingLeft() + rect.left;
                Rect rect3 = this.t0;
                rect3.left = compoundPaddingLeft;
                if (this.l0 != 1 || this.w.getMinLines() > 1) {
                    if (this.l0 != 0 || getHintMaxLines() == 1) {
                        i5 = 0;
                    } else {
                        textPaint.setTextSize(cVar.h);
                        textPaint.setTypeface(cVar.v);
                        textPaint.setLetterSpacing(cVar.X);
                        i5 = (int) ((-textPaint.ascent()) / 2.0f);
                    }
                    compoundPaddingTop = (this.w.getCompoundPaddingTop() + rect.top) - i5;
                } else {
                    compoundPaddingTop = (int) (rect.centerY() - (fDescent / 2.0f));
                }
                rect3.top = compoundPaddingTop;
                rect3.right = rect.right - this.w.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.l0 != 1 || this.w.getMinLines() > 1) ? rect.bottom - this.w.getCompoundPaddingBottom() : (int) (rect3.top + fDescent);
                rect3.bottom = compoundPaddingBottom;
                int i13 = rect3.left;
                int i14 = rect3.top;
                int i15 = rect3.right;
                Rect rect4 = cVar.c;
                if (rect4.left != i13 || rect4.top != i14 || rect4.right != i15 || rect4.bottom != compoundPaddingBottom || true != cVar.k0) {
                    rect4.set(i13, i14, i15, compoundPaddingBottom);
                    cVar.N = true;
                    cVar.k0 = true;
                }
                cVar.j(false);
                if (!g() || this.O0) {
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
        boolean z = this.V0;
        p pVar = this.i;
        if (!z) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.V0 = true;
        }
        if (this.N != null && (editText = this.w) != null) {
            this.N.setGravity(editText.getGravity());
            this.N.setPadding(this.w.getCompoundPaddingLeft(), this.w.getCompoundPaddingTop(), this.w.getCompoundPaddingRight(), this.w.getCompoundPaddingBottom());
        }
        pVar.m();
        if (getHintMaxLines() == 1) {
            return;
        }
        int measuredWidth = (this.w.getMeasuredWidth() - this.w.getCompoundPaddingLeft()) - this.w.getCompoundPaddingRight();
        c cVar = this.P0;
        TextPaint textPaint = cVar.P;
        textPaint.setTextSize(cVar.i);
        textPaint.setTypeface(cVar.s);
        textPaint.setLetterSpacing(cVar.W);
        float f2 = measuredWidth;
        cVar.i0 = cVar.e(cVar.f0, textPaint, cVar.B, (cVar.i / cVar.h) * f2, cVar.D).getHeight();
        textPaint.setTextSize(cVar.h);
        textPaint.setTypeface(cVar.v);
        textPaint.setLetterSpacing(cVar.X);
        cVar.j0 = cVar.e(cVar.e0, textPaint, cVar.B, f2, cVar.D).getHeight();
        EditText editText2 = this.w;
        Rect rect = this.s0;
        d.a(this, editText2, rect);
        Rect rectD = d(rect);
        int i3 = rectD.left;
        int i4 = rectD.top;
        int i5 = rectD.right;
        int i6 = rectD.bottom;
        Rect rect2 = cVar.d;
        if (rect2.left != i3 || rect2.top != i4 || rect2.right != i5 || rect2.bottom != i6) {
            rect2.set(i3, i4, i5, i6);
            cVar.N = true;
        }
        v();
        a();
        if (this.w == null) {
            return;
        }
        int i7 = cVar.j0;
        if (i7 != -1) {
            f = i7;
        } else {
            TextPaint textPaint2 = cVar.P;
            textPaint2.setTextSize(cVar.h);
            textPaint2.setTypeface(cVar.v);
            textPaint2.setLetterSpacing(cVar.X);
            f = -textPaint2.ascent();
        }
        float f3 = 0.0f;
        if (this.L != null) {
            TextPaint textPaint3 = new TextPaint(129);
            textPaint3.set(this.N.getPaint());
            textPaint3.setTextSize(this.N.getTextSize());
            textPaint3.setTypeface(this.N.getTypeface());
            textPaint3.setLetterSpacing(this.N.getLetterSpacing());
            com.gamericefishpro.space.fa.h hVar = new com.gamericefishpro.space.fa.h(this.L, textPaint3, measuredWidth);
            hVar.k = getLayoutDirection() == 1;
            hVar.j = true;
            float lineSpacingExtra = this.N.getLineSpacingExtra();
            float lineSpacingMultiplier = this.N.getLineSpacingMultiplier();
            hVar.g = lineSpacingExtra;
            hVar.h = lineSpacingMultiplier;
            hVar.m = new b(11, this);
            f3 = (this.l0 == 1 ? cVar.f() + this.m0 + this.v : 0.0f) + hVar.a().getHeight();
        }
        float fMax = Math.max(f, f3);
        if (this.w.getMeasuredHeight() < fMax) {
            this.w.setMinimumHeight(Math.round(fMax));
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a0)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a0 a0Var = (a0) parcelable;
        super.onRestoreInstanceState(a0Var.d);
        setError(a0Var.i);
        if (a0Var.v) {
            post(new com.gamericefishpro.space.h4.b(14, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z = i == 1;
        if (z != this.j0) {
            com.gamericefishpro.space.ka.d dVar = this.i0.e;
            RectF rectF = this.u0;
            float fA = dVar.a(rectF);
            float fA2 = this.i0.f.a(rectF);
            float fA3 = this.i0.h.a(rectF);
            float fA4 = this.i0.g.a(rectF);
            n nVar = this.i0;
            a4 a4Var = nVar.a;
            a4 a4Var2 = nVar.b;
            a4 a4Var3 = nVar.d;
            a4 a4Var4 = nVar.c;
            f fVar = new f(0);
            f fVar2 = new f(0);
            f fVar3 = new f(0);
            f fVar4 = new f(0);
            com.gamericefishpro.space.ka.a aVar = new com.gamericefishpro.space.ka.a(fA2);
            com.gamericefishpro.space.ka.a aVar2 = new com.gamericefishpro.space.ka.a(fA);
            com.gamericefishpro.space.ka.a aVar3 = new com.gamericefishpro.space.ka.a(fA4);
            com.gamericefishpro.space.ka.a aVar4 = new com.gamericefishpro.space.ka.a(fA3);
            n nVar2 = new n();
            nVar2.a = a4Var2;
            nVar2.b = a4Var;
            nVar2.c = a4Var3;
            nVar2.d = a4Var4;
            nVar2.e = aVar;
            nVar2.f = aVar2;
            nVar2.g = aVar4;
            nVar2.h = aVar3;
            nVar2.i = fVar;
            nVar2.j = fVar2;
            nVar2.k = fVar3;
            nVar2.l = fVar4;
            this.j0 = z;
            setShapeAppearanceModel(nVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        a0 a0Var = new a0(super.onSaveInstanceState());
        if (o()) {
            a0Var.i = getError();
        }
        p pVar = this.i;
        a0Var.v = pVar.B != 0 && pVar.z.v;
        return a0Var;
    }

    public final void p(Editable editable) {
        ((s) this.H).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z = this.G;
        int i = this.F;
        if (i == -1) {
            this.I.setText(String.valueOf(length));
            this.I.setContentDescription(null);
            this.G = false;
        } else {
            this.G = length > i;
            Context context = getContext();
            this.I.setContentDescription(context.getString(this.G ? com.gamericefishpro.space.R.string.character_counter_overflowed_content_description : com.gamericefishpro.space.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.F)));
            if (z != this.G) {
                q();
            }
            String str = com.gamericefishpro.space.b4.b.b;
            com.gamericefishpro.space.b4.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? com.gamericefishpro.space.b4.b.e : com.gamericefishpro.space.b4.b.d;
            i0 i0Var = this.I;
            String string = getContext().getString(com.gamericefishpro.space.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.F));
            bVar.getClass();
            com.gamericefishpro.space.b4.f fVar = com.gamericefishpro.space.b4.g.a;
            i0Var.setText(string != null ? bVar.c(string).toString() : null);
        }
        if (this.w == null || z == this.G) {
            return;
        }
        w(false, false);
        z();
        t();
    }

    public final void q() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        i0 i0Var = this.I;
        if (i0Var != null) {
            n(i0Var, this.G ? this.J : this.K);
            if (!this.G && (colorStateList2 = this.S) != null) {
                this.I.setTextColor(colorStateList2);
            }
            if (!this.G || (colorStateList = this.T) == null) {
                return;
            }
            this.I.setTextColor(colorStateList);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final void r() {
        ColorStateList colorStateList;
        ColorStateList colorStateListValueOf = this.U;
        if (colorStateListValueOf == null) {
            Context context = getContext();
            TypedValue typedValueI = com.gamericefishpro.space.d9.h.I(context, com.gamericefishpro.space.R.attr.colorControlActivated);
            if (typedValueI != null) {
                int i = typedValueI.resourceId;
                if (i != 0) {
                    colorStateListValueOf = com.gamericefishpro.space.s3.a.c(context, i);
                } else {
                    int i2 = typedValueI.data;
                    if (i2 != 0) {
                        colorStateListValueOf = ColorStateList.valueOf(i2);
                    } else {
                        colorStateListValueOf = null;
                    }
                }
            } else {
                colorStateListValueOf = null;
            }
        }
        EditText editText = this.w;
        if (editText == null || editText.getTextCursorDrawable() == null) {
            return;
        }
        Drawable drawableMutate = this.w.getTextCursorDrawable().mutate();
        if ((o() || (this.I != null && this.G)) && (colorStateList = this.V) != null) {
            colorStateListValueOf = colorStateList;
        }
        drawableMutate.setTintList(colorStateListValueOf);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005f  */
    /* JADX WARN: Code duplicated, block: B:23:0x0063  */
    /* JADX WARN: Code duplicated, block: B:25:0x0078  */
    public final boolean s() {
        boolean z;
        if (this.w == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z2 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            v vVar = this.e;
            if (vVar.getMeasuredWidth() > 0) {
                int measuredWidth = vVar.getMeasuredWidth() - this.w.getPaddingLeft();
                if (this.w0 == null || this.x0 != measuredWidth) {
                    ColorDrawable colorDrawable = new ColorDrawable();
                    this.w0 = colorDrawable;
                    this.x0 = measuredWidth;
                    colorDrawable.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative = this.w.getCompoundDrawablesRelative();
                Drawable drawable = compoundDrawablesRelative[0];
                ColorDrawable colorDrawable2 = this.w0;
                if (drawable != colorDrawable2) {
                    this.w.setCompoundDrawablesRelative(colorDrawable2, compoundDrawablesRelative[1], compoundDrawablesRelative[2], compoundDrawablesRelative[3]);
                    z = true;
                } else {
                    z = false;
                }
            } else if (this.w0 != null) {
                Drawable[] compoundDrawablesRelative2 = this.w.getCompoundDrawablesRelative();
                this.w.setCompoundDrawablesRelative(null, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                this.w0 = null;
                z = true;
            } else {
                z = false;
            }
        } else if (this.w0 != null) {
            Drawable[] compoundDrawablesRelative3 = this.w.getCompoundDrawablesRelative();
            this.w.setCompoundDrawablesRelative(null, compoundDrawablesRelative3[1], compoundDrawablesRelative3[2], compoundDrawablesRelative3[3]);
            this.w0 = null;
            z = true;
        } else {
            z = false;
        }
        p pVar = this.i;
        if ((pVar.e() || ((pVar.B != 0 && pVar.d()) || pVar.I != null)) && pVar.getMeasuredWidth() > 0) {
            int measuredWidth2 = pVar.J.getMeasuredWidth() - this.w.getPaddingRight();
            if (pVar.e()) {
                checkableImageButton = pVar.i;
            } else if (pVar.B != 0 && pVar.d()) {
                checkableImageButton = pVar.z;
            }
            if (checkableImageButton != null) {
                measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] compoundDrawablesRelative4 = this.w.getCompoundDrawablesRelative();
            ColorDrawable colorDrawable3 = this.z0;
            if (colorDrawable3 != null && this.A0 != measuredWidth2) {
                this.A0 = measuredWidth2;
                colorDrawable3.setBounds(0, 0, measuredWidth2, 1);
                this.w.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], this.z0, compoundDrawablesRelative4[3]);
                return true;
            }
            if (colorDrawable3 == null) {
                ColorDrawable colorDrawable4 = new ColorDrawable();
                this.z0 = colorDrawable4;
                this.A0 = measuredWidth2;
                colorDrawable4.setBounds(0, 0, measuredWidth2, 1);
            }
            Drawable drawable2 = compoundDrawablesRelative4[2];
            ColorDrawable colorDrawable5 = this.z0;
            if (drawable2 != colorDrawable5) {
                this.B0 = drawable2;
                this.w.setCompoundDrawablesRelative(compoundDrawablesRelative4[0], compoundDrawablesRelative4[1], colorDrawable5, compoundDrawablesRelative4[3]);
                return true;
            }
        } else if (this.z0 != null) {
            Drawable[] compoundDrawablesRelative5 = this.w.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative5[2] == this.z0) {
                this.w.setCompoundDrawablesRelative(compoundDrawablesRelative5[0], compoundDrawablesRelative5[1], this.B0, compoundDrawablesRelative5[3]);
            } else {
                z2 = z;
            }
            this.z0 = null;
            return z2;
        }
        return z;
    }

    public void setBoxBackgroundColor(int i) {
        if (this.r0 != i) {
            this.r0 = i;
            this.I0 = i;
            this.K0 = i;
            this.L0 = i;
            c();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.I0 = defaultColor;
        this.r0 = defaultColor;
        this.J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.K0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.L0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        c();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.l0) {
            return;
        }
        this.l0 = i;
        if (this.w != null) {
            k();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.m0 = i;
    }

    public void setBoxCornerFamily(int i) {
        m mVarF = this.i0.f();
        com.gamericefishpro.space.ka.d dVar = this.i0.e;
        mVarF.a = com.gamericefishpro.space.i.a.q(i);
        mVarF.e = dVar;
        com.gamericefishpro.space.ka.d dVar2 = this.i0.f;
        mVarF.b = com.gamericefishpro.space.i.a.q(i);
        mVarF.f = dVar2;
        com.gamericefishpro.space.ka.d dVar3 = this.i0.h;
        mVarF.d = com.gamericefishpro.space.i.a.q(i);
        mVarF.h = dVar3;
        com.gamericefishpro.space.ka.d dVar4 = this.i0.g;
        mVarF.c = com.gamericefishpro.space.i.a.q(i);
        mVarF.g = dVar4;
        this.i0 = mVarF.a();
        c();
    }

    public void setBoxStrokeColor(int i) {
        if (this.G0 != i) {
            this.G0 = i;
            z();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.E0 = colorStateList.getDefaultColor();
            this.M0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.F0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.G0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.G0 != colorStateList.getDefaultColor()) {
            this.G0 = colorStateList.getDefaultColor();
        }
        z();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.H0 != colorStateList) {
            this.H0 = colorStateList;
            z();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.o0 = i;
        z();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.p0 = i;
        z();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.E != z) {
            t tVar = this.D;
            if (z) {
                i0 i0Var = new i0(getContext(), null);
                this.I = i0Var;
                i0Var.setId(com.gamericefishpro.space.R.id.textinput_counter);
                Typeface typeface = this.v0;
                if (typeface != null) {
                    this.I.setTypeface(typeface);
                }
                this.I.setMaxLines(1);
                tVar.a(this.I, 2);
                ((ViewGroup.MarginLayoutParams) this.I.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.gamericefishpro.space.R.dimen.mtrl_textinput_counter_margin_start));
                q();
                if (this.I != null) {
                    EditText editText = this.w;
                    p(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.I, 2);
                this.I = null;
            }
            this.E = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.F != i) {
            if (i > 0) {
                this.F = i;
            } else {
                this.F = -1;
            }
            if (!this.E || this.I == null) {
                return;
            }
            EditText editText = this.w;
            p(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.J != i) {
            this.J = i;
            q();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.T != colorStateList) {
            this.T = colorStateList;
            q();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.K != i) {
            this.K = i;
            q();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.S != colorStateList) {
            this.S = colorStateList;
            q();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.U != colorStateList) {
            this.U = colorStateList;
            r();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.V != colorStateList) {
            this.V = colorStateList;
            if (o() || (this.I != null && this.G)) {
                r();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.C0 = colorStateList;
        this.D0 = colorStateList;
        if (this.w != null) {
            w(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.i.z.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.i.z.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.i;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.z;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.i;
        Drawable drawableX = i != 0 ? com.gamericefishpro.space.u6.f.x(pVar.getContext(), i) : null;
        TextInputLayout textInputLayout = pVar.d;
        CheckableImageButton checkableImageButton = pVar.z;
        checkableImageButton.setImageDrawable(drawableX);
        if (drawableX != null) {
            d5.j(textInputLayout, checkableImageButton, pVar.D, pVar.E);
            d5.S(textInputLayout, checkableImageButton, pVar.D);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.i;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.F) {
            pVar.F = i;
            CheckableImageButton checkableImageButton = pVar.z;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.i;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.i.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.i;
        CheckableImageButton checkableImageButton = pVar.z;
        View.OnLongClickListener onLongClickListener = pVar.H;
        checkableImageButton.setOnClickListener(onClickListener);
        d5.X(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.i;
        pVar.H = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d5.X(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.i;
        pVar.G = scaleType;
        pVar.z.setScaleType(scaleType);
        pVar.i.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.i;
        if (pVar.D != colorStateList) {
            pVar.D = colorStateList;
            d5.j(pVar.d, pVar.z, colorStateList, pVar.E);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.i;
        if (pVar.E != mode) {
            pVar.E = mode;
            d5.j(pVar.d, pVar.z, pVar.D, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        this.i.h(z);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.D;
        if (!tVar.q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            tVar.f();
            return;
        }
        tVar.c();
        tVar.p = charSequence;
        tVar.r.setText(charSequence);
        int i = tVar.n;
        if (i != 1) {
            tVar.o = 1;
        }
        tVar.i(i, tVar.o, tVar.h(tVar.r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.D;
        tVar.t = i;
        i0 i0Var = tVar.r;
        if (i0Var != null) {
            i0Var.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.D;
        tVar.s = charSequence;
        i0 i0Var = tVar.r;
        if (i0Var != null) {
            i0Var.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z) {
        t tVar = this.D;
        TextInputLayout textInputLayout = tVar.h;
        if (tVar.q == z) {
            return;
        }
        tVar.c();
        if (z) {
            i0 i0Var = new i0(tVar.g, null);
            tVar.r = i0Var;
            i0Var.setId(com.gamericefishpro.space.R.id.textinput_error);
            tVar.r.setTextAlignment(5);
            Typeface typeface = tVar.B;
            if (typeface != null) {
                tVar.r.setTypeface(typeface);
            }
            int i = tVar.u;
            tVar.u = i;
            i0 i0Var2 = tVar.r;
            if (i0Var2 != null) {
                tVar.h.n(i0Var2, i);
            }
            ColorStateList colorStateList = tVar.v;
            tVar.v = colorStateList;
            i0 i0Var3 = tVar.r;
            if (i0Var3 != null && colorStateList != null) {
                i0Var3.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.s;
            tVar.s = charSequence;
            i0 i0Var4 = tVar.r;
            if (i0Var4 != null) {
                i0Var4.setContentDescription(charSequence);
            }
            int i2 = tVar.t;
            tVar.t = i2;
            i0 i0Var5 = tVar.r;
            if (i0Var5 != null) {
                i0Var5.setAccessibilityLiveRegion(i2);
            }
            tVar.r.setVisibility(4);
            tVar.a(tVar.r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.r, 0);
            tVar.r = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        tVar.q = z;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.i;
        pVar.i(i != 0 ? com.gamericefishpro.space.u6.f.x(pVar.getContext(), i) : null);
        d5.S(pVar.d, pVar.i, pVar.v);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.i;
        CheckableImageButton checkableImageButton = pVar.i;
        View.OnLongClickListener onLongClickListener = pVar.y;
        checkableImageButton.setOnClickListener(onClickListener);
        d5.X(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.i;
        pVar.y = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.i;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d5.X(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.i;
        if (pVar.v != colorStateList) {
            pVar.v = colorStateList;
            d5.j(pVar.d, pVar.i, colorStateList, pVar.w);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.i;
        if (pVar.w != mode) {
            pVar.w = mode;
            d5.j(pVar.d, pVar.i, pVar.v, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.D;
        tVar.u = i;
        i0 i0Var = tVar.r;
        if (i0Var != null) {
            tVar.h.n(i0Var, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.D;
        tVar.v = colorStateList;
        i0 i0Var = tVar.r;
        if (i0Var == null || colorStateList == null) {
            return;
        }
        i0Var.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.Q0 != z) {
            this.Q0 = z;
            w(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean zIsEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.D;
        if (zIsEmpty) {
            if (tVar.x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.w = charSequence;
        tVar.y.setText(charSequence);
        int i = tVar.n;
        if (i != 2) {
            tVar.o = 2;
        }
        tVar.i(i, tVar.o, tVar.h(tVar.y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.D;
        tVar.A = colorStateList;
        i0 i0Var = tVar.y;
        if (i0Var == null || colorStateList == null) {
            return;
        }
        i0Var.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        t tVar = this.D;
        TextInputLayout textInputLayout = tVar.h;
        if (tVar.x == z) {
            return;
        }
        tVar.c();
        if (z) {
            i0 i0Var = new i0(tVar.g, null);
            tVar.y = i0Var;
            i0Var.setId(com.gamericefishpro.space.R.id.textinput_helper_text);
            tVar.y.setTextAlignment(5);
            Typeface typeface = tVar.B;
            if (typeface != null) {
                tVar.y.setTypeface(typeface);
            }
            tVar.y.setVisibility(4);
            tVar.y.setAccessibilityLiveRegion(1);
            int i = tVar.z;
            tVar.z = i;
            i0 i0Var2 = tVar.y;
            if (i0Var2 != null) {
                i0Var2.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.A;
            tVar.A = colorStateList;
            i0 i0Var3 = tVar.y;
            if (i0Var3 != null && colorStateList != null) {
                i0Var3.setTextColor(colorStateList);
            }
            tVar.a(tVar.y, 1);
            tVar.y.setAccessibilityDelegate(new com.gamericefishpro.space.na.s(tVar));
        } else {
            tVar.c();
            int i2 = tVar.n;
            if (i2 == 2) {
                tVar.o = 0;
            }
            tVar.i(i2, tVar.o, tVar.h(tVar.y, ""));
            tVar.g(tVar.y, 1);
            tVar.y = null;
            textInputLayout.t();
            textInputLayout.z();
        }
        tVar.x = z;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.D;
        tVar.z = i;
        i0 i0Var = tVar.y;
        if (i0Var != null) {
            i0Var.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.W) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.R0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.W) {
            this.W = z;
            if (z) {
                CharSequence hint = this.w.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.a0)) {
                        setHint(hint);
                    }
                    this.w.setHint((CharSequence) null);
                }
                this.b0 = true;
            } else {
                this.b0 = false;
                if (!TextUtils.isEmpty(this.a0) && TextUtils.isEmpty(this.w.getHint())) {
                    this.w.setHint(this.a0);
                }
                setHintInternal(null);
            }
            if (this.w != null) {
                v();
            }
        }
    }

    public void setHintMaxLines(int i) {
        c cVar = this.P0;
        if (i != cVar.f0) {
            cVar.f0 = i;
            cVar.j(false);
        }
        if (i != cVar.e0) {
            cVar.e0 = i;
            cVar.j(false);
        }
        requestLayout();
    }

    public void setHintTextAppearance(int i) {
        c cVar = this.P0;
        TextInputLayout textInputLayout = cVar.a;
        com.gamericefishpro.space.ha.d dVar = new com.gamericefishpro.space.ha.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.k;
        if (colorStateList != null) {
            cVar.k = colorStateList;
        }
        float f = dVar.l;
        if (f != 0.0f) {
            cVar.i = f;
        }
        ColorStateList colorStateList2 = dVar.a;
        if (colorStateList2 != null) {
            cVar.V = colorStateList2;
        }
        cVar.T = dVar.f;
        cVar.U = dVar.g;
        cVar.S = dVar.h;
        cVar.W = dVar.j;
        com.gamericefishpro.space.ha.a aVar = cVar.z;
        if (aVar != null) {
            aVar.f = true;
        }
        com.gamericefishpro.space.vb.c cVar2 = new com.gamericefishpro.space.vb.c(16, cVar);
        dVar.a();
        cVar.z = new com.gamericefishpro.space.ha.a(cVar2, dVar.p);
        dVar.b(textInputLayout.getContext(), cVar.z);
        cVar.j(false);
        this.D0 = cVar.k;
        if (this.w != null) {
            w(false, false);
            v();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.D0 != colorStateList) {
            if (this.C0 == null) {
                c cVar = this.P0;
                if (cVar.k != colorStateList) {
                    cVar.k = colorStateList;
                    cVar.j(false);
                }
            }
            this.D0 = colorStateList;
            if (this.w != null) {
                w(false, false);
            }
        }
    }

    public void setLengthCounter(z zVar) {
        this.H = zVar;
    }

    public void setMaxEms(int i) {
        this.A = i;
        EditText editText = this.w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.C = i;
        EditText editText = this.w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.z = i;
        EditText editText = this.w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.B = i;
        EditText editText = this.w;
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
        p pVar = this.i;
        pVar.z.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.i;
        pVar.z.setImageDrawable(i != 0 ? com.gamericefishpro.space.u6.f.x(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        p pVar = this.i;
        if (z && pVar.B != 1) {
            pVar.g(1);
        } else if (z) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.i;
        pVar.D = colorStateList;
        d5.j(pVar.d, pVar.z, colorStateList, pVar.E);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.i;
        pVar.E = mode;
        d5.j(pVar.d, pVar.z, pVar.D, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.N == null) {
            i0 i0Var = new i0(getContext(), null);
            this.N = i0Var;
            i0Var.setId(com.gamericefishpro.space.R.id.textinput_placeholder);
            this.N.setImportantForAccessibility(1);
            this.N.setAccessibilityLiveRegion(1);
            h hVarF = f();
            this.Q = hVarF;
            hVarF.e = 67L;
            this.R = f();
            setPlaceholderTextAppearance(this.P);
            setPlaceholderTextColor(this.O);
            l0.l(this.N, new com.gamericefishpro.space.ca.b(2));
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.M) {
                setPlaceholderTextEnabled(true);
            }
            this.L = charSequence;
        }
        EditText editText = this.w;
        x(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.P = i;
        i0 i0Var = this.N;
        if (i0Var != null) {
            i0Var.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            i0 i0Var = this.N;
            if (i0Var == null || colorStateList == null) {
                return;
            }
            i0Var.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        v vVar = this.e;
        vVar.getClass();
        vVar.i = TextUtils.isEmpty(charSequence) ? null : charSequence;
        vVar.e.setText(charSequence);
        vVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.e.e.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.e.e.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(n nVar) {
        j jVar = this.c0;
        if (jVar == null || jVar.e.a == nVar) {
            return;
        }
        this.i0 = nVar;
        c();
    }

    public void setStartIconCheckable(boolean z) {
        this.e.v.setCheckable(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? com.gamericefishpro.space.u6.f.x(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        v vVar = this.e;
        if (i < 0) {
            vVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != vVar.z) {
            vVar.z = i;
            CheckableImageButton checkableImageButton = vVar.v;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        v vVar = this.e;
        CheckableImageButton checkableImageButton = vVar.v;
        View.OnLongClickListener onLongClickListener = vVar.B;
        checkableImageButton.setOnClickListener(onClickListener);
        d5.X(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        v vVar = this.e;
        vVar.B = onLongClickListener;
        CheckableImageButton checkableImageButton = vVar.v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        d5.X(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        v vVar = this.e;
        vVar.A = scaleType;
        vVar.v.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        v vVar = this.e;
        if (vVar.w != colorStateList) {
            vVar.w = colorStateList;
            d5.j(vVar.d, vVar.v, colorStateList, vVar.y);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        v vVar = this.e;
        if (vVar.y != mode) {
            vVar.y = mode;
            d5.j(vVar.d, vVar.v, vVar.w, mode);
        }
    }

    public void setStartIconVisible(boolean z) {
        this.e.c(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.i;
        pVar.getClass();
        pVar.I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.J.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.i.J.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.i.J.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(y yVar) {
        EditText editText = this.w;
        if (editText != null) {
            l0.l(editText, yVar);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.v0) {
            this.v0 = typeface;
            this.P0.n(typeface);
            t tVar = this.D;
            if (typeface != tVar.B) {
                tVar.B = typeface;
                i0 i0Var = tVar.r;
                if (i0Var != null) {
                    i0Var.setTypeface(typeface);
                }
                i0 i0Var2 = tVar.y;
                if (i0Var2 != null) {
                    i0Var2.setTypeface(typeface);
                }
            }
            i0 i0Var3 = this.I;
            if (i0Var3 != null) {
                i0Var3.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        Drawable background;
        i0 i0Var;
        EditText editText = this.w;
        if (editText == null || this.l0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = q0.a;
        Drawable drawableMutate = background.mutate();
        if (o()) {
            drawableMutate.setColorFilter(q.b(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.G && (i0Var = this.I) != null) {
            drawableMutate.setColorFilter(q.b(i0Var.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            drawableMutate.clearColorFilter();
            this.w.refreshDrawableState();
        }
    }

    public final void u() {
        EditText editText = this.w;
        if (editText == null || this.c0 == null) {
            return;
        }
        if ((this.f0 || editText.getBackground() == null) && this.l0 != 0) {
            this.w.setBackground(getEditTextBoxBackground());
            this.f0 = true;
        }
    }

    public final void v() {
        if (this.l0 != 1) {
            FrameLayout frameLayout = this.d;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int iE = e();
            if (iE != layoutParams.topMargin) {
                layoutParams.topMargin = iE;
                frameLayout.requestLayout();
            }
        }
    }

    public final void w(boolean z, boolean z2) {
        ColorStateList colorStateList;
        i0 i0Var;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.w;
        boolean z3 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.w;
        boolean z4 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.C0;
        c cVar = this.P0;
        if (colorStateList2 != null) {
            cVar.k(colorStateList2);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList3 = this.C0;
            cVar.k(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.M0) : this.M0));
        } else if (o()) {
            i0 i0Var2 = this.D.r;
            cVar.k(i0Var2 != null ? i0Var2.getTextColors() : null);
        } else if (this.G && (i0Var = this.I) != null) {
            cVar.k(i0Var.getTextColors());
        } else if (z4 && (colorStateList = this.D0) != null && cVar.k != colorStateList) {
            cVar.k = colorStateList;
            cVar.j(false);
        }
        p pVar = this.i;
        v vVar = this.e;
        if (z3 || !this.Q0 || (isEnabled() && z4)) {
            if (z2 || this.O0) {
                ValueAnimator valueAnimator = this.S0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.S0.cancel();
                }
                if (z && this.R0) {
                    b(1.0f);
                } else {
                    cVar.m(1.0f);
                }
                this.O0 = false;
                if (g()) {
                    l();
                }
                EditText editText3 = this.w;
                x(editText3 != null ? editText3.getText() : null);
                vVar.C = false;
                vVar.e();
                pVar.K = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z2 || !this.O0) {
            ValueAnimator valueAnimator2 = this.S0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.S0.cancel();
            }
            if (z && this.R0) {
                b(0.0f);
            } else {
                cVar.m(0.0f);
            }
            if (g() && !((com.gamericefishpro.space.na.h) this.c0).Z.r.isEmpty() && g()) {
                ((com.gamericefishpro.space.na.h) this.c0).t(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.O0 = true;
            i0 i0Var3 = this.N;
            if (i0Var3 != null && this.M) {
                i0Var3.setText((CharSequence) null);
                com.gamericefishpro.space.i6.s.a(this.d, this.R);
                this.N.setVisibility(4);
            }
            vVar.C = true;
            vVar.e();
            pVar.K = true;
            pVar.n();
        }
    }

    public final void x(Editable editable) {
        ((s) this.H).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.d;
        if (length != 0 || this.O0) {
            i0 i0Var = this.N;
            if (i0Var == null || !this.M) {
                return;
            }
            i0Var.setText((CharSequence) null);
            com.gamericefishpro.space.i6.s.a(frameLayout, this.R);
            this.N.setVisibility(4);
            return;
        }
        if (this.N == null || !this.M || TextUtils.isEmpty(this.L)) {
            return;
        }
        this.N.setText(this.L);
        com.gamericefishpro.space.i6.s.a(frameLayout, this.Q);
        this.N.setVisibility(0);
        this.N.bringToFront();
    }

    public final void y(boolean z, boolean z2) {
        int defaultColor = this.H0.getDefaultColor();
        int colorForState = this.H0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.H0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z) {
            this.q0 = colorForState2;
        } else if (z2) {
            this.q0 = colorForState;
        } else {
            this.q0 = defaultColor;
        }
    }

    public final void z() {
        i0 i0Var;
        EditText editText;
        EditText editText2;
        if (this.c0 == null || this.l0 == 0) {
            return;
        }
        boolean z = false;
        boolean z2 = isFocused() || ((editText2 = this.w) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.w) != null && editText.isHovered())) {
            z = true;
        }
        if (!isEnabled()) {
            this.q0 = this.M0;
        } else if (o()) {
            if (this.H0 != null) {
                y(z2, z);
            } else {
                this.q0 = getErrorCurrentTextColors();
            }
        } else if (!this.G || (i0Var = this.I) == null) {
            if (z2) {
                this.q0 = this.G0;
            } else if (z) {
                this.q0 = this.F0;
            } else {
                this.q0 = this.E0;
            }
        } else if (this.H0 != null) {
            y(z2, z);
        } else {
            this.q0 = i0Var.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            r();
        }
        p pVar = this.i;
        TextInputLayout textInputLayout = pVar.d;
        CheckableImageButton checkableImageButton = pVar.z;
        TextInputLayout textInputLayout2 = pVar.d;
        pVar.l();
        d5.S(textInputLayout2, pVar.i, pVar.v);
        d5.S(textInputLayout2, checkableImageButton, pVar.D);
        if (pVar.b() instanceof com.gamericefishpro.space.na.m) {
            if (!textInputLayout.o() || checkableImageButton.getDrawable() == null) {
                d5.j(textInputLayout, checkableImageButton, pVar.D, pVar.E);
            } else {
                Drawable drawableMutate = checkableImageButton.getDrawable().mutate();
                drawableMutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton.setImageDrawable(drawableMutate);
            }
        }
        v vVar = this.e;
        d5.S(vVar.d, vVar.v, vVar.w);
        if (this.l0 == 2) {
            int i = this.n0;
            if (z2 && isEnabled()) {
                this.n0 = this.p0;
            } else {
                this.n0 = this.o0;
            }
            if (this.n0 != i && g() && !this.O0) {
                if (g()) {
                    ((com.gamericefishpro.space.na.h) this.c0).t(0.0f, 0.0f, 0.0f, 0.0f);
                }
                l();
            }
        }
        if (this.l0 == 1) {
            if (!isEnabled()) {
                this.r0 = this.J0;
            } else if (z && !z2) {
                this.r0 = this.L0;
            } else if (z2) {
                this.r0 = this.K0;
            } else {
                this.r0 = this.I0;
            }
        }
        c();
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.e.v;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.e.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.i.z.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.i.z.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.i.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.i.z;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.i;
        TextInputLayout textInputLayout = pVar.d;
        CheckableImageButton checkableImageButton = pVar.z;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            d5.j(textInputLayout, checkableImageButton, pVar.D, pVar.E);
            d5.S(textInputLayout, checkableImageButton, pVar.D);
        }
    }
}
