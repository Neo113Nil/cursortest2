package com.google.android.material.textfield;

import A3.d;
import D0.C0295h;
import D0.n;
import D0.s;
import E.b;
import E.e;
import G.c;
import G3.g;
import G3.i;
import G3.j;
import G3.k;
import J3.A;
import J3.B;
import J3.D;
import J3.E;
import J3.F;
import J3.h;
import J3.m;
import J3.o;
import J3.r;
import J3.u;
import J3.v;
import J3.y;
import L3.a;
import N3.C;
import O.N;
import O.X;
import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
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
import com.IceFishing.LiveIceFishing.C5248R;
import com.anythink.basead.exoplayer.k.p;
import com.bumptech.glide.f;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.AbstractC4707j0;
import m.C4723s;
import m.Z;
import m3.AbstractC4742a;
import n3.AbstractC4770a;
import w.AbstractC5128c;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d1, reason: collision with root package name */
    public static final int[][] f36833d1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public int f36834A;

    /* renamed from: A0, reason: collision with root package name */
    public final Rect f36835A0;

    /* renamed from: B, reason: collision with root package name */
    public int f36836B;

    /* renamed from: B0, reason: collision with root package name */
    public final RectF f36837B0;

    /* renamed from: C, reason: collision with root package name */
    public final v f36838C;
    public Typeface C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f36839D;

    /* renamed from: D0, reason: collision with root package name */
    public ColorDrawable f36840D0;

    /* renamed from: E, reason: collision with root package name */
    public int f36841E;

    /* renamed from: E0, reason: collision with root package name */
    public int f36842E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f36843F;

    /* renamed from: F0, reason: collision with root package name */
    public final LinkedHashSet f36844F0;

    /* renamed from: G, reason: collision with root package name */
    public E f36845G;

    /* renamed from: G0, reason: collision with root package name */
    public ColorDrawable f36846G0;

    /* renamed from: H, reason: collision with root package name */
    public Z f36847H;

    /* renamed from: H0, reason: collision with root package name */
    public int f36848H0;

    /* renamed from: I, reason: collision with root package name */
    public int f36849I;

    /* renamed from: I0, reason: collision with root package name */
    public Drawable f36850I0;
    public int J;

    /* renamed from: J0, reason: collision with root package name */
    public ColorStateList f36851J0;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f36852K;

    /* renamed from: K0, reason: collision with root package name */
    public ColorStateList f36853K0;

    /* renamed from: L, reason: collision with root package name */
    public boolean f36854L;

    /* renamed from: L0, reason: collision with root package name */
    public int f36855L0;

    /* renamed from: M, reason: collision with root package name */
    public Z f36856M;

    /* renamed from: M0, reason: collision with root package name */
    public int f36857M0;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f36858N;

    /* renamed from: N0, reason: collision with root package name */
    public int f36859N0;

    /* renamed from: O, reason: collision with root package name */
    public int f36860O;

    /* renamed from: O0, reason: collision with root package name */
    public ColorStateList f36861O0;

    /* renamed from: P, reason: collision with root package name */
    public C0295h f36862P;

    /* renamed from: P0, reason: collision with root package name */
    public int f36863P0;

    /* renamed from: Q, reason: collision with root package name */
    public C0295h f36864Q;

    /* renamed from: Q0, reason: collision with root package name */
    public int f36865Q0;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f36866R;

    /* renamed from: R0, reason: collision with root package name */
    public int f36867R0;

    /* renamed from: S, reason: collision with root package name */
    public ColorStateList f36868S;

    /* renamed from: S0, reason: collision with root package name */
    public int f36869S0;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f36870T;

    /* renamed from: T0, reason: collision with root package name */
    public int f36871T0;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f36872U;

    /* renamed from: U0, reason: collision with root package name */
    public int f36873U0;

    /* renamed from: V, reason: collision with root package name */
    public boolean f36874V;

    /* renamed from: V0, reason: collision with root package name */
    public boolean f36875V0;

    /* renamed from: W, reason: collision with root package name */
    public CharSequence f36876W;

    /* renamed from: W0, reason: collision with root package name */
    public final d f36877W0;

    /* renamed from: X0, reason: collision with root package name */
    public boolean f36878X0;

    /* renamed from: Y0, reason: collision with root package name */
    public boolean f36879Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public ValueAnimator f36880Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f36881a1;

    /* renamed from: b1, reason: collision with root package name */
    public boolean f36882b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f36883c1;

    /* renamed from: i0, reason: collision with root package name */
    public boolean f36884i0;

    /* renamed from: j0, reason: collision with root package name */
    public g f36885j0;

    /* renamed from: k0, reason: collision with root package name */
    public g f36886k0;

    /* renamed from: l0, reason: collision with root package name */
    public StateListDrawable f36887l0;
    public boolean m0;

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f36888n;

    /* renamed from: n0, reason: collision with root package name */
    public g f36889n0;

    /* renamed from: o0, reason: collision with root package name */
    public g f36890o0;

    /* renamed from: p0, reason: collision with root package name */
    public k f36891p0;

    /* renamed from: q0, reason: collision with root package name */
    public boolean f36892q0;

    /* renamed from: r0, reason: collision with root package name */
    public final int f36893r0;

    /* renamed from: s0, reason: collision with root package name */
    public int f36894s0;

    /* renamed from: t0, reason: collision with root package name */
    public int f36895t0;

    /* renamed from: u, reason: collision with root package name */
    public final A f36896u;

    /* renamed from: u0, reason: collision with root package name */
    public int f36897u0;

    /* renamed from: v, reason: collision with root package name */
    public final r f36898v;

    /* renamed from: v0, reason: collision with root package name */
    public int f36899v0;

    /* renamed from: w, reason: collision with root package name */
    public EditText f36900w;

    /* renamed from: w0, reason: collision with root package name */
    public int f36901w0;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f36902x;

    /* renamed from: x0, reason: collision with root package name */
    public int f36903x0;

    /* renamed from: y, reason: collision with root package name */
    public int f36904y;

    /* renamed from: y0, reason: collision with root package name */
    public int f36905y0;

    /* renamed from: z, reason: collision with root package name */
    public int f36906z;

    /* renamed from: z0, reason: collision with root package name */
    public final Rect f36907z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5248R.attr.textInputStyle, C5248R.style.Widget_Design_TextInputLayout), attributeSet, C5248R.attr.textInputStyle);
        this.f36904y = -1;
        this.f36906z = -1;
        this.f36834A = -1;
        this.f36836B = -1;
        this.f36838C = new v(this);
        this.f36845G = new n(6);
        this.f36907z0 = new Rect();
        this.f36835A0 = new Rect();
        this.f36837B0 = new RectF();
        this.f36844F0 = new LinkedHashSet();
        d dVar = new d(this);
        this.f36877W0 = dVar;
        this.f36883c1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f36888n = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC4770a.f39641a;
        dVar.f113Q = linearInterpolator;
        dVar.h(false);
        dVar.f112P = linearInterpolator;
        dVar.h(false);
        if (dVar.f134g != 8388659) {
            dVar.f134g = 8388659;
            dVar.h(false);
        }
        int[] iArr = AbstractC4742a.f39416A;
        A3.n.a(context2, attributeSet, C5248R.attr.textInputStyle, C5248R.style.Widget_Design_TextInputLayout);
        A3.n.b(context2, attributeSet, iArr, C5248R.attr.textInputStyle, C5248R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C5248R.attr.textInputStyle, C5248R.style.Widget_Design_TextInputLayout);
        l4.g gVar = new l4.g(context2, obtainStyledAttributes);
        A a9 = new A(this, gVar);
        this.f36896u = a9;
        this.f36874V = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f36879Y0 = obtainStyledAttributes.getBoolean(47, true);
        this.f36878X0 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f36891p0 = k.b(context2, attributeSet, C5248R.attr.textInputStyle, C5248R.style.Widget_Design_TextInputLayout).a();
        this.f36893r0 = context2.getResources().getDimensionPixelOffset(C5248R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f36895t0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f36899v0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(C5248R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f36901w0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(C5248R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f36897u0 = this.f36899v0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e9 = this.f36891p0.e();
        if (dimension >= 0.0f) {
            e9.f1120e = new G3.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e9.f1121f = new G3.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e9.f1122g = new G3.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e9.f1123h = new G3.a(dimension4);
        }
        this.f36891p0 = e9.a();
        ColorStateList k9 = f.k(context2, gVar, 7);
        if (k9 != null) {
            int defaultColor = k9.getDefaultColor();
            this.f36863P0 = defaultColor;
            this.f36905y0 = defaultColor;
            if (k9.isStateful()) {
                this.f36865Q0 = k9.getColorForState(new int[]{-16842910}, -1);
                this.f36867R0 = k9.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f36869S0 = k9.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f36867R0 = this.f36863P0;
                ColorStateList c9 = e.c(context2, C5248R.color.mtrl_filled_background_color);
                this.f36865Q0 = c9.getColorForState(new int[]{-16842910}, -1);
                this.f36869S0 = c9.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f36905y0 = 0;
            this.f36863P0 = 0;
            this.f36865Q0 = 0;
            this.f36867R0 = 0;
            this.f36869S0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList h3 = gVar.h(1);
            this.f36853K0 = h3;
            this.f36851J0 = h3;
        }
        ColorStateList k10 = f.k(context2, gVar, 14);
        this.f36859N0 = obtainStyledAttributes.getColor(14, 0);
        this.f36855L0 = b.a(context2, C5248R.color.mtrl_textinput_default_box_stroke_color);
        this.f36871T0 = b.a(context2, C5248R.color.mtrl_textinput_disabled_color);
        this.f36857M0 = b.a(context2, C5248R.color.mtrl_textinput_hovered_box_stroke_color);
        if (k10 != null) {
            setBoxStrokeColorStateList(k10);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(f.k(context2, gVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f36870T = gVar.h(24);
        this.f36872U = gVar.h(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z6 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z9 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z10 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.J = obtainStyledAttributes.getResourceId(22, 0);
        this.f36849I = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f36849I);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.J);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(gVar.h(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(gVar.h(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(gVar.h(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(gVar.h(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(gVar.h(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(gVar.h(58));
        }
        r rVar = new r(this, gVar);
        this.f36898v = rVar;
        boolean z11 = obtainStyledAttributes.getBoolean(0, true);
        gVar.t();
        setImportantForAccessibility(2);
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26 && i4 >= 26) {
            N.m(this, 1);
        }
        frameLayout.addView(a9);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(z11);
        setHelperTextEnabled(z9);
        setErrorEnabled(z6);
        setCounterEnabled(z10);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f36900w;
        if (!(editText instanceof AutoCompleteTextView) || com.bumptech.glide.e.e(editText)) {
            return this.f36885j0;
        }
        int h3 = Q3.b.h(C5248R.attr.colorControlHighlight, this.f36900w);
        int i = this.f36894s0;
        int[][] iArr = f36833d1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f36885j0;
            int i4 = this.f36905y0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{Q3.b.l(h3, i4, 0.1f), i4}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f36885j0;
        TypedValue h9 = com.bumptech.glide.e.h(context, "TextInputLayout", C5248R.attr.colorSurface);
        int i6 = h9.resourceId;
        int a9 = i6 != 0 ? b.a(context, i6) : h9.data;
        g gVar3 = new g(gVar2.f1108n.f1078a);
        int l9 = Q3.b.l(h3, a9, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{l9, 0}));
        gVar3.setTint(a9);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{l9, a9});
        g gVar4 = new g(gVar2.f1108n.f1078a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f36887l0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f36887l0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f36887l0.addState(new int[0], f(false));
        }
        return this.f36887l0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f36886k0 == null) {
            this.f36886k0 = f(true);
        }
        return this.f36886k0;
    }

    public static void k(ViewGroup viewGroup, boolean z6) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z6);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z6);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f36900w != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f36900w = editText;
        int i = this.f36904y;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f36834A);
        }
        int i4 = this.f36906z;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.f36836B);
        }
        this.m0 = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.f36900w.getTypeface();
        d dVar = this.f36877W0;
        dVar.m(typeface);
        float textSize = this.f36900w.getTextSize();
        if (dVar.f135h != textSize) {
            dVar.f135h = textSize;
            dVar.h(false);
        }
        int i6 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f36900w.getLetterSpacing();
        if (dVar.f119W != letterSpacing) {
            dVar.f119W = letterSpacing;
            dVar.h(false);
        }
        int gravity = this.f36900w.getGravity();
        int i9 = (gravity & (-113)) | 48;
        if (dVar.f134g != i9) {
            dVar.f134g = i9;
            dVar.h(false);
        }
        if (dVar.f132f != gravity) {
            dVar.f132f = gravity;
            dVar.h(false);
        }
        WeakHashMap weakHashMap = X.f2142a;
        this.f36873U0 = editText.getMinimumHeight();
        this.f36900w.addTextChangedListener(new B(this, editText));
        if (this.f36851J0 == null) {
            this.f36851J0 = this.f36900w.getHintTextColors();
        }
        if (this.f36874V) {
            if (TextUtils.isEmpty(this.f36876W)) {
                CharSequence hint = this.f36900w.getHint();
                this.f36902x = hint;
                setHint(hint);
                this.f36900w.setHint((CharSequence) null);
            }
            this.f36884i0 = true;
        }
        if (i6 >= 29) {
            p();
        }
        if (this.f36847H != null) {
            n(this.f36900w.getText());
        }
        r();
        this.f36838C.b();
        this.f36896u.bringToFront();
        r rVar = this.f36898v;
        rVar.bringToFront();
        Iterator it = this.f36844F0.iterator();
        while (it.hasNext()) {
            ((o) it.next()).a(this);
        }
        rVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f36876W)) {
            return;
        }
        this.f36876W = charSequence;
        d dVar = this.f36877W0;
        if (charSequence == null || !TextUtils.equals(dVar.f98A, charSequence)) {
            dVar.f98A = charSequence;
            dVar.f99B = null;
            Bitmap bitmap = dVar.f102E;
            if (bitmap != null) {
                bitmap.recycle();
                dVar.f102E = null;
            }
            dVar.h(false);
        }
        if (this.f36875V0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z6) {
        if (this.f36854L == z6) {
            return;
        }
        if (z6) {
            Z z9 = this.f36856M;
            if (z9 != null) {
                this.f36888n.addView(z9);
                this.f36856M.setVisibility(0);
            }
        } else {
            Z z10 = this.f36856M;
            if (z10 != null) {
                z10.setVisibility(8);
            }
            this.f36856M = null;
        }
        this.f36854L = z6;
    }

    public final void a(float f2) {
        int i = 0;
        d dVar = this.f36877W0;
        if (dVar.f124b == f2) {
            return;
        }
        if (this.f36880Z0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f36880Z0 = valueAnimator;
            valueAnimator.setInterpolator(C.S(getContext(), C5248R.attr.motionEasingEmphasizedInterpolator, AbstractC4770a.f39642b));
            this.f36880Z0.setDuration(C.R(getContext(), C5248R.attr.motionDurationMedium4, 167));
            this.f36880Z0.addUpdateListener(new J3.C(i, this));
        }
        this.f36880Z0.setFloatValues(dVar.f124b, f2);
        this.f36880Z0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f36888n;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i4;
        g gVar = this.f36885j0;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f1108n.f1078a;
        k kVar2 = this.f36891p0;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f36894s0 == 2 && (i = this.f36897u0) > -1 && (i4 = this.f36903x0) != 0) {
            g gVar2 = this.f36885j0;
            gVar2.f1108n.f1086j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i4);
            G3.f fVar = gVar2.f1108n;
            if (fVar.f1081d != valueOf) {
                fVar.f1081d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i6 = this.f36905y0;
        if (this.f36894s0 == 1) {
            i6 = c.b(this.f36905y0, Q3.b.i(getContext(), C5248R.attr.colorSurface, 0));
        }
        this.f36905y0 = i6;
        this.f36885j0.j(ColorStateList.valueOf(i6));
        g gVar3 = this.f36889n0;
        if (gVar3 != null && this.f36890o0 != null) {
            if (this.f36897u0 > -1 && this.f36903x0 != 0) {
                gVar3.j(this.f36900w.isFocused() ? ColorStateList.valueOf(this.f36855L0) : ColorStateList.valueOf(this.f36903x0));
                this.f36890o0.j(ColorStateList.valueOf(this.f36903x0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d9;
        if (!this.f36874V) {
            return 0;
        }
        int i = this.f36894s0;
        d dVar = this.f36877W0;
        if (i == 0) {
            d9 = dVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d9 = dVar.d() / 2.0f;
        }
        return (int) d9;
    }

    public final C0295h d() {
        C0295h c0295h = new C0295h();
        c0295h.f497v = C.R(getContext(), C5248R.attr.motionDurationShort2, 87);
        c0295h.f498w = C.S(getContext(), C5248R.attr.motionEasingLinearInterpolator, AbstractC4770a.f39641a);
        return c0295h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f36900w;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f36902x != null) {
            boolean z6 = this.f36884i0;
            this.f36884i0 = false;
            CharSequence hint = editText.getHint();
            this.f36900w.setHint(this.f36902x);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f36900w.setHint(hint);
                this.f36884i0 = z6;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f36888n;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i4 = 0; i4 < frameLayout.getChildCount(); i4++) {
            View childAt = frameLayout.getChildAt(i4);
            ViewStructure newChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f36900w) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f36882b1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f36882b1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z6 = this.f36874V;
        d dVar = this.f36877W0;
        if (z6) {
            dVar.getClass();
            int save = canvas2.save();
            if (dVar.f99B != null) {
                RectF rectF = dVar.f130e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = dVar.f110N;
                    textPaint.setTextSize(dVar.f104G);
                    float f2 = dVar.f142p;
                    float f9 = dVar.f143q;
                    float f10 = dVar.f103F;
                    if (f10 != 1.0f) {
                        canvas2.scale(f10, f10, f2, f9);
                    }
                    if (dVar.f129d0 <= 1 || dVar.f100C) {
                        canvas2.translate(f2, f9);
                        dVar.Y.draw(canvas2);
                    } else {
                        float lineStart = dVar.f142p - dVar.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f9);
                        float f11 = alpha;
                        textPaint.setAlpha((int) (dVar.f125b0 * f11));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f12 = dVar.f105H;
                            float f13 = dVar.f106I;
                            float f14 = dVar.J;
                            int i4 = dVar.f107K;
                            textPaint.setShadowLayer(f12, f13, f14, c.d(i4, (textPaint.getAlpha() * Color.alpha(i4)) / p.f9259b));
                        }
                        dVar.Y.draw(canvas2);
                        textPaint.setAlpha((int) (dVar.f123a0 * f11));
                        if (i >= 31) {
                            float f15 = dVar.f105H;
                            float f16 = dVar.f106I;
                            float f17 = dVar.J;
                            int i6 = dVar.f107K;
                            textPaint.setShadowLayer(f15, f16, f17, c.d(i6, (Color.alpha(i6) * textPaint.getAlpha()) / p.f9259b));
                        }
                        int lineBaseline = dVar.Y.getLineBaseline(0);
                        CharSequence charSequence = dVar.f127c0;
                        float f18 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f18, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(dVar.f105H, dVar.f106I, dVar.J, dVar.f107K);
                        }
                        String trim = dVar.f127c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(dVar.Y.getLineEnd(0), str.length()), 0.0f, f18, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f36890o0 == null || (gVar = this.f36889n0) == null) {
            return;
        }
        gVar.draw(canvas2);
        if (this.f36900w.isFocused()) {
            Rect bounds = this.f36890o0.getBounds();
            Rect bounds2 = this.f36889n0.getBounds();
            float f19 = dVar.f124b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC4770a.c(centerX, bounds2.left, f19);
            bounds.right = AbstractC4770a.c(centerX, bounds2.right, f19);
            this.f36890o0.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z6;
        ColorStateList colorStateList;
        if (this.f36881a1) {
            return;
        }
        this.f36881a1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        d dVar = this.f36877W0;
        if (dVar != null) {
            dVar.f108L = drawableState;
            ColorStateList colorStateList2 = dVar.f137k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = dVar.f136j) != null && colorStateList.isStateful())) {
                dVar.h(false);
                z6 = true;
                if (this.f36900w != null) {
                    WeakHashMap weakHashMap = X.f2142a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z6) {
                    invalidate();
                }
                this.f36881a1 = false;
            }
        }
        z6 = false;
        if (this.f36900w != null) {
        }
        r();
        x();
        if (z6) {
        }
        this.f36881a1 = false;
    }

    public final boolean e() {
        return this.f36874V && !TextUtils.isEmpty(this.f36876W) && (this.f36885j0 instanceof h);
    }

    public final g f(boolean z6) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C5248R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z6 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f36900w;
        float popupElevation = editText instanceof y ? ((y) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C5248R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C5248R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        G3.e eVar = new G3.e(i);
        G3.e eVar2 = new G3.e(i);
        G3.e eVar3 = new G3.e(i);
        G3.e eVar4 = new G3.e(i);
        G3.a aVar = new G3.a(f2);
        G3.a aVar2 = new G3.a(f2);
        G3.a aVar3 = new G3.a(dimensionPixelOffset);
        G3.a aVar4 = new G3.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f1127a = iVar;
        kVar.f1128b = iVar2;
        kVar.f1129c = iVar3;
        kVar.f1130d = iVar4;
        kVar.f1131e = aVar;
        kVar.f1132f = aVar2;
        kVar.f1133g = aVar4;
        kVar.f1134h = aVar3;
        kVar.i = eVar;
        kVar.f1135j = eVar2;
        kVar.f1136k = eVar3;
        kVar.f1137l = eVar4;
        EditText editText2 = this.f36900w;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof y ? ((y) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f1093P;
            TypedValue h3 = com.bumptech.glide.e.h(context, g.class.getSimpleName(), C5248R.attr.colorSurface);
            int i4 = h3.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i4 != 0 ? b.a(context, i4) : h3.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        G3.f fVar = gVar.f1108n;
        if (fVar.f1084g == null) {
            fVar.f1084g = new Rect();
        }
        gVar.f1108n.f1084g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z6) {
        return ((z6 || getPrefixText() == null) ? (!z6 || getSuffixText() == null) ? this.f36900w.getCompoundPaddingLeft() : this.f36898v.c() : this.f36896u.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f36900w;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f36894s0;
        if (i == 1 || i == 2) {
            return this.f36885j0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f36905y0;
    }

    public int getBoxBackgroundMode() {
        return this.f36894s0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f36895t0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e9 = A3.n.e(this);
        RectF rectF = this.f36837B0;
        return e9 ? this.f36891p0.f1134h.a(rectF) : this.f36891p0.f1133g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e9 = A3.n.e(this);
        RectF rectF = this.f36837B0;
        return e9 ? this.f36891p0.f1133g.a(rectF) : this.f36891p0.f1134h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e9 = A3.n.e(this);
        RectF rectF = this.f36837B0;
        return e9 ? this.f36891p0.f1131e.a(rectF) : this.f36891p0.f1132f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e9 = A3.n.e(this);
        RectF rectF = this.f36837B0;
        return e9 ? this.f36891p0.f1132f.a(rectF) : this.f36891p0.f1131e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f36859N0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f36861O0;
    }

    public int getBoxStrokeWidth() {
        return this.f36899v0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f36901w0;
    }

    public int getCounterMaxLength() {
        return this.f36841E;
    }

    public CharSequence getCounterOverflowDescription() {
        Z z6;
        if (this.f36839D && this.f36843F && (z6 = this.f36847H) != null) {
            return z6.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f36868S;
    }

    public ColorStateList getCounterTextColor() {
        return this.f36866R;
    }

    public ColorStateList getCursorColor() {
        return this.f36870T;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f36872U;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f36851J0;
    }

    public EditText getEditText() {
        return this.f36900w;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f36898v.f1526z.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f36898v.f1526z.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f36898v.f1511F;
    }

    public int getEndIconMode() {
        return this.f36898v.f1507B;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f36898v.f1512G;
    }

    public CheckableImageButton getEndIconView() {
        return this.f36898v.f1526z;
    }

    public CharSequence getError() {
        v vVar = this.f36838C;
        if (vVar.f1554q) {
            return vVar.f1553p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f36838C.f1557t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f36838C.f1556s;
    }

    public int getErrorCurrentTextColors() {
        Z z6 = this.f36838C.f1555r;
        if (z6 != null) {
            return z6.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f36898v.f1522v.getDrawable();
    }

    public CharSequence getHelperText() {
        v vVar = this.f36838C;
        if (vVar.f1561x) {
            return vVar.f1560w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        Z z6 = this.f36838C.f1562y;
        if (z6 != null) {
            return z6.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f36874V) {
            return this.f36876W;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f36877W0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        d dVar = this.f36877W0;
        return dVar.e(dVar.f137k);
    }

    public ColorStateList getHintTextColor() {
        return this.f36853K0;
    }

    public E getLengthCounter() {
        return this.f36845G;
    }

    public int getMaxEms() {
        return this.f36906z;
    }

    public int getMaxWidth() {
        return this.f36836B;
    }

    public int getMinEms() {
        return this.f36904y;
    }

    public int getMinWidth() {
        return this.f36834A;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f36898v.f1526z.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f36898v.f1526z.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f36854L) {
            return this.f36852K;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f36860O;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f36858N;
    }

    public CharSequence getPrefixText() {
        return this.f36896u.f1446v;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f36896u.f1445u.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f36896u.f1445u;
    }

    public k getShapeAppearanceModel() {
        return this.f36891p0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f36896u.f1447w.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f36896u.f1447w.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f36896u.f1450z;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f36896u.f1441A;
    }

    public CharSequence getSuffixText() {
        return this.f36898v.f1514I;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f36898v.J.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f36898v.J;
    }

    public Typeface getTypeface() {
        return this.C0;
    }

    public final int h(int i, boolean z6) {
        return i - ((z6 || getSuffixText() == null) ? (!z6 || getPrefixText() == null) ? this.f36900w.getCompoundPaddingRight() : this.f36896u.a() : this.f36898v.c());
    }

    public final void i() {
        int i = this.f36894s0;
        if (i == 0) {
            this.f36885j0 = null;
            this.f36889n0 = null;
            this.f36890o0 = null;
        } else if (i == 1) {
            this.f36885j0 = new g(this.f36891p0);
            this.f36889n0 = new g();
            this.f36890o0 = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC5128c.e(this.f36894s0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.f36874V || (this.f36885j0 instanceof h)) {
                this.f36885j0 = new g(this.f36891p0);
            } else {
                k kVar = this.f36891p0;
                int i4 = h.f1477R;
                if (kVar == null) {
                    kVar = new k();
                }
                J3.g gVar = new J3.g(kVar, new RectF());
                h hVar = new h(gVar);
                hVar.f1478Q = gVar;
                this.f36885j0 = hVar;
            }
            this.f36889n0 = null;
            this.f36890o0 = null;
        }
        s();
        x();
        if (this.f36894s0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f36895t0 = getResources().getDimensionPixelSize(C5248R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (f.n(getContext())) {
                this.f36895t0 = getResources().getDimensionPixelSize(C5248R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f36900w != null && this.f36894s0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f36900w;
                WeakHashMap weakHashMap = X.f2142a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(C5248R.dimen.material_filled_edittext_font_2_0_padding_top), this.f36900w.getPaddingEnd(), getResources().getDimensionPixelSize(C5248R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (f.n(getContext())) {
                EditText editText2 = this.f36900w;
                WeakHashMap weakHashMap2 = X.f2142a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(C5248R.dimen.material_filled_edittext_font_1_3_padding_top), this.f36900w.getPaddingEnd(), getResources().getDimensionPixelSize(C5248R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f36894s0 != 0) {
            t();
        }
        EditText editText3 = this.f36900w;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i6 = this.f36894s0;
                if (i6 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i6 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f2;
        float f9;
        float f10;
        RectF rectF;
        float f11;
        int i;
        float f12;
        int i4;
        if (e()) {
            int width = this.f36900w.getWidth();
            int gravity = this.f36900w.getGravity();
            d dVar = this.f36877W0;
            boolean b9 = dVar.b(dVar.f98A);
            dVar.f100C = b9;
            Rect rect = dVar.f128d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b9) {
                        i4 = rect.left;
                        f10 = i4;
                    } else {
                        f2 = rect.right;
                        f9 = dVar.f121Z;
                    }
                } else if (b9) {
                    f2 = rect.right;
                    f9 = dVar.f121Z;
                } else {
                    i4 = rect.left;
                    f10 = i4;
                }
                float max = Math.max(f10, rect.left);
                rectF = this.f36837B0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f11 = (width / 2.0f) + (dVar.f121Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (dVar.f100C) {
                        f12 = dVar.f121Z;
                        f11 = f12 + max;
                    } else {
                        i = rect.right;
                        f11 = i;
                    }
                } else if (dVar.f100C) {
                    i = rect.right;
                    f11 = i;
                } else {
                    f12 = dVar.f121Z;
                    f11 = f12 + max;
                }
                rectF.right = Math.min(f11, rect.right);
                rectF.bottom = dVar.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f13 = rectF.left;
                float f14 = this.f36893r0;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f36897u0);
                h hVar = (h) this.f36885j0;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f9 = dVar.f121Z / 2.0f;
            f10 = f2 - f9;
            float max2 = Math.max(f10, rect.left);
            rectF = this.f36837B0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f11 = (width / 2.0f) + (dVar.f121Z / 2.0f);
            rectF.right = Math.min(f11, rect.right);
            rectF.bottom = dVar.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(Z z6, int i) {
        try {
            z6.setTextAppearance(i);
            if (z6.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        z6.setTextAppearance(C5248R.style.TextAppearance_AppCompat_Caption);
        z6.setTextColor(b.a(getContext(), C5248R.color.design_error));
    }

    public final boolean m() {
        v vVar = this.f36838C;
        return (vVar.f1552o != 1 || vVar.f1555r == null || TextUtils.isEmpty(vVar.f1553p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((n) this.f36845G).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z6 = this.f36843F;
        int i = this.f36841E;
        String str = null;
        if (i == -1) {
            this.f36847H.setText(String.valueOf(length));
            this.f36847H.setContentDescription(null);
            this.f36843F = false;
        } else {
            this.f36843F = length > i;
            Context context = getContext();
            this.f36847H.setContentDescription(context.getString(this.f36843F ? C5248R.string.character_counter_overflowed_content_description : C5248R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f36841E)));
            if (z6 != this.f36843F) {
                o();
            }
            String str2 = M.b.f1796b;
            M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.f1799e : M.b.f1798d;
            Z z9 = this.f36847H;
            String string = getContext().getString(C5248R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f36841E));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                M.h hVar = M.i.f1808a;
                str = bVar.c(string).toString();
            }
            z9.setText(str);
        }
        if (this.f36900w == null || z6 == this.f36843F) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Z z6 = this.f36847H;
        if (z6 != null) {
            l(z6, this.f36843F ? this.f36849I : this.J);
            if (!this.f36843F && (colorStateList2 = this.f36866R) != null) {
                this.f36847H.setTextColor(colorStateList2);
            }
            if (!this.f36843F || (colorStateList = this.f36868S) == null) {
                return;
            }
            this.f36847H.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f36877W0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        r rVar = this.f36898v;
        rVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z6 = false;
        this.f36883c1 = false;
        if (this.f36900w != null && this.f36900w.getMeasuredHeight() < (max = Math.max(rVar.getMeasuredHeight(), this.f36896u.getMeasuredHeight()))) {
            this.f36900w.setMinimumHeight(max);
            z6 = true;
        }
        boolean q8 = q();
        if (z6 || q8) {
            this.f36900w.post(new A3.p(6, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        EditText editText = this.f36900w;
        if (editText != null) {
            ThreadLocal threadLocal = A3.e.f153a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f36907z0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = A3.e.f153a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            A3.e.a(this, editText, matrix);
            ThreadLocal threadLocal3 = A3.e.f154b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f36889n0;
            if (gVar != null) {
                int i10 = rect.bottom;
                gVar.setBounds(rect.left, i10 - this.f36899v0, rect.right, i10);
            }
            g gVar2 = this.f36890o0;
            if (gVar2 != null) {
                int i11 = rect.bottom;
                gVar2.setBounds(rect.left, i11 - this.f36901w0, rect.right, i11);
            }
            if (this.f36874V) {
                float textSize = this.f36900w.getTextSize();
                d dVar = this.f36877W0;
                if (dVar.f135h != textSize) {
                    dVar.f135h = textSize;
                    dVar.h(false);
                }
                int gravity = this.f36900w.getGravity();
                int i12 = (gravity & (-113)) | 48;
                if (dVar.f134g != i12) {
                    dVar.f134g = i12;
                    dVar.h(false);
                }
                if (dVar.f132f != gravity) {
                    dVar.f132f = gravity;
                    dVar.h(false);
                }
                if (this.f36900w == null) {
                    throw new IllegalStateException();
                }
                boolean e9 = A3.n.e(this);
                int i13 = rect.bottom;
                Rect rect2 = this.f36835A0;
                rect2.bottom = i13;
                int i14 = this.f36894s0;
                if (i14 == 1) {
                    rect2.left = g(rect.left, e9);
                    rect2.top = rect.top + this.f36895t0;
                    rect2.right = h(rect.right, e9);
                } else if (i14 != 2) {
                    rect2.left = g(rect.left, e9);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e9);
                } else {
                    rect2.left = this.f36900w.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f36900w.getPaddingRight();
                }
                int i15 = rect2.left;
                int i16 = rect2.top;
                int i17 = rect2.right;
                int i18 = rect2.bottom;
                Rect rect3 = dVar.f128d;
                if (rect3.left != i15 || rect3.top != i16 || rect3.right != i17 || rect3.bottom != i18) {
                    rect3.set(i15, i16, i17, i18);
                    dVar.f109M = true;
                }
                if (this.f36900w == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = dVar.f111O;
                textPaint.setTextSize(dVar.f135h);
                textPaint.setTypeface(dVar.f147u);
                textPaint.setLetterSpacing(dVar.f119W);
                float f2 = -textPaint.ascent();
                rect2.left = this.f36900w.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f36894s0 != 1 || this.f36900w.getMinLines() > 1) ? rect.top + this.f36900w.getCompoundPaddingTop() : (int) (rect.centerY() - (f2 / 2.0f));
                rect2.right = rect.right - this.f36900w.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f36894s0 != 1 || this.f36900w.getMinLines() > 1) ? rect.bottom - this.f36900w.getCompoundPaddingBottom() : (int) (rect2.top + f2);
                rect2.bottom = compoundPaddingBottom;
                int i19 = rect2.left;
                int i20 = rect2.top;
                int i21 = rect2.right;
                Rect rect4 = dVar.f126c;
                if (rect4.left != i19 || rect4.top != i20 || rect4.right != i21 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i19, i20, i21, compoundPaddingBottom);
                    dVar.f109M = true;
                }
                dVar.h(false);
                if (!e() || this.f36875V0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i4) {
        EditText editText;
        super.onMeasure(i, i4);
        boolean z6 = this.f36883c1;
        r rVar = this.f36898v;
        if (!z6) {
            rVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f36883c1 = true;
        }
        if (this.f36856M != null && (editText = this.f36900w) != null) {
            this.f36856M.setGravity(editText.getGravity());
            this.f36856M.setPadding(this.f36900w.getCompoundPaddingLeft(), this.f36900w.getCompoundPaddingTop(), this.f36900w.getCompoundPaddingRight(), this.f36900w.getCompoundPaddingBottom());
        }
        rVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof F)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        F f2 = (F) parcelable;
        super.onRestoreInstanceState(f2.f3390n);
        setError(f2.f1457v);
        if (f2.f1458w) {
            post(new G0.c(2, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z6 = i == 1;
        if (z6 != this.f36892q0) {
            G3.c cVar = this.f36891p0.f1131e;
            RectF rectF = this.f36837B0;
            float a9 = cVar.a(rectF);
            float a10 = this.f36891p0.f1132f.a(rectF);
            float a11 = this.f36891p0.f1134h.a(rectF);
            float a12 = this.f36891p0.f1133g.a(rectF);
            k kVar = this.f36891p0;
            X2.a aVar = kVar.f1127a;
            X2.a aVar2 = kVar.f1128b;
            X2.a aVar3 = kVar.f1130d;
            X2.a aVar4 = kVar.f1129c;
            G3.e eVar = new G3.e(0);
            G3.e eVar2 = new G3.e(0);
            G3.e eVar3 = new G3.e(0);
            G3.e eVar4 = new G3.e(0);
            j.b(aVar2);
            j.b(aVar);
            j.b(aVar4);
            j.b(aVar3);
            G3.a aVar5 = new G3.a(a10);
            G3.a aVar6 = new G3.a(a9);
            G3.a aVar7 = new G3.a(a12);
            G3.a aVar8 = new G3.a(a11);
            k kVar2 = new k();
            kVar2.f1127a = aVar2;
            kVar2.f1128b = aVar;
            kVar2.f1129c = aVar3;
            kVar2.f1130d = aVar4;
            kVar2.f1131e = aVar5;
            kVar2.f1132f = aVar6;
            kVar2.f1133g = aVar8;
            kVar2.f1134h = aVar7;
            kVar2.i = eVar;
            kVar2.f1135j = eVar2;
            kVar2.f1136k = eVar3;
            kVar2.f1137l = eVar4;
            this.f36892q0 = z6;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        F f2 = new F(super.onSaveInstanceState());
        if (m()) {
            f2.f1457v = getError();
        }
        r rVar = this.f36898v;
        f2.f1458w = rVar.f1507B != 0 && rVar.f1526z.f36790w;
        return f2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f36870T;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue f2 = com.bumptech.glide.e.f(context, C5248R.attr.colorControlActivated);
            if (f2 != null) {
                int i = f2.resourceId;
                if (i != 0) {
                    colorStateList2 = e.c(context, i);
                } else {
                    int i4 = f2.data;
                    if (i4 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i4);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f36900w;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f36900w.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f36847H != null && this.f36843F)) && (colorStateList = this.f36872U) != null) {
                colorStateList2 = colorStateList;
            }
            H.a.h(mutate, colorStateList2);
        }
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
    public final boolean q() {
        boolean z6;
        r rVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f36900w == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z9 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            A a9 = this.f36896u;
            if (a9.getMeasuredWidth() > 0) {
                int measuredWidth = a9.getMeasuredWidth() - this.f36900w.getPaddingLeft();
                if (this.f36840D0 == null || this.f36842E0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f36840D0 = colorDrawable3;
                    this.f36842E0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f36900w.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f36840D0;
                if (drawable2 != colorDrawable4) {
                    this.f36900w.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z6 = true;
                    rVar = this.f36898v;
                    if ((!rVar.e() || ((rVar.f1507B != 0 && rVar.d()) || rVar.f1514I != null)) && rVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = rVar.J.getMeasuredWidth() - this.f36900w.getPaddingRight();
                        if (!rVar.e()) {
                            checkableImageButton = rVar.f1522v;
                        } else if (rVar.f1507B != 0 && rVar.d()) {
                            checkableImageButton = rVar.f1526z;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f36900w.getCompoundDrawablesRelative();
                        colorDrawable = this.f36846G0;
                        if (colorDrawable == null && this.f36848H0 != measuredWidth2) {
                            this.f36848H0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f36900w.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f36846G0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.f36846G0 = colorDrawable5;
                            this.f36848H0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.f36846G0;
                        if (drawable != colorDrawable2) {
                            this.f36850I0 = drawable;
                            this.f36900w.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.f36846G0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.f36900w.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f36846G0) {
                            this.f36900w.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f36850I0, compoundDrawablesRelative3[3]);
                        } else {
                            z9 = z6;
                        }
                        this.f36846G0 = null;
                        return z9;
                    }
                    return z6;
                }
                z6 = false;
                rVar = this.f36898v;
                if (rVar.e()) {
                }
                int measuredWidth22 = rVar.J.getMeasuredWidth() - this.f36900w.getPaddingRight();
                if (!rVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f36900w.getCompoundDrawablesRelative();
                colorDrawable = this.f36846G0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f36846G0;
                if (drawable != colorDrawable2) {
                }
                return z6;
            }
        }
        if (this.f36840D0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f36900w.getCompoundDrawablesRelative();
            this.f36900w.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f36840D0 = null;
            z6 = true;
            rVar = this.f36898v;
            if (rVar.e()) {
            }
            int measuredWidth222 = rVar.J.getMeasuredWidth() - this.f36900w.getPaddingRight();
            if (!rVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f36900w.getCompoundDrawablesRelative();
            colorDrawable = this.f36846G0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f36846G0;
            if (drawable != colorDrawable2) {
            }
            return z6;
        }
        z6 = false;
        rVar = this.f36898v;
        if (rVar.e()) {
        }
        int measuredWidth2222 = rVar.J.getMeasuredWidth() - this.f36900w.getPaddingRight();
        if (!rVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f36900w.getCompoundDrawablesRelative();
        colorDrawable = this.f36846G0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f36846G0;
        if (drawable != colorDrawable2) {
        }
        return z6;
    }

    public final void r() {
        Drawable background;
        Z z6;
        EditText editText = this.f36900w;
        if (editText == null || this.f36894s0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC4707j0.f39224a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C4723s.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f36843F && (z6 = this.f36847H) != null) {
            mutate.setColorFilter(C4723s.c(z6.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f36900w.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f36900w;
        if (editText == null || this.f36885j0 == null) {
            return;
        }
        if ((this.m0 || editText.getBackground() == null) && this.f36894s0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f36900w;
            WeakHashMap weakHashMap = X.f2142a;
            editText2.setBackground(editTextBoxBackground);
            this.m0 = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f36905y0 != i) {
            this.f36905y0 = i;
            this.f36863P0 = i;
            this.f36867R0 = i;
            this.f36869S0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f36863P0 = defaultColor;
        this.f36905y0 = defaultColor;
        this.f36865Q0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f36867R0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f36869S0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f36894s0) {
            return;
        }
        this.f36894s0 = i;
        if (this.f36900w != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f36895t0 = i;
    }

    public void setBoxCornerFamily(int i) {
        j e9 = this.f36891p0.e();
        G3.c cVar = this.f36891p0.f1131e;
        X2.a h3 = Z2.d.h(i);
        e9.f1116a = h3;
        j.b(h3);
        e9.f1120e = cVar;
        G3.c cVar2 = this.f36891p0.f1132f;
        X2.a h9 = Z2.d.h(i);
        e9.f1117b = h9;
        j.b(h9);
        e9.f1121f = cVar2;
        G3.c cVar3 = this.f36891p0.f1134h;
        X2.a h10 = Z2.d.h(i);
        e9.f1119d = h10;
        j.b(h10);
        e9.f1123h = cVar3;
        G3.c cVar4 = this.f36891p0.f1133g;
        X2.a h11 = Z2.d.h(i);
        e9.f1118c = h11;
        j.b(h11);
        e9.f1122g = cVar4;
        this.f36891p0 = e9.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f36859N0 != i) {
            this.f36859N0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f36855L0 = colorStateList.getDefaultColor();
            this.f36871T0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f36857M0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f36859N0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f36859N0 != colorStateList.getDefaultColor()) {
            this.f36859N0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f36861O0 != colorStateList) {
            this.f36861O0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f36899v0 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f36901w0 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z6) {
        if (this.f36839D != z6) {
            v vVar = this.f36838C;
            if (z6) {
                Z z9 = new Z(getContext(), null);
                this.f36847H = z9;
                z9.setId(C5248R.id.textinput_counter);
                Typeface typeface = this.C0;
                if (typeface != null) {
                    this.f36847H.setTypeface(typeface);
                }
                this.f36847H.setMaxLines(1);
                vVar.a(this.f36847H, 2);
                ((ViewGroup.MarginLayoutParams) this.f36847H.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C5248R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f36847H != null) {
                    EditText editText = this.f36900w;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                vVar.g(this.f36847H, 2);
                this.f36847H = null;
            }
            this.f36839D = z6;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f36841E != i) {
            if (i > 0) {
                this.f36841E = i;
            } else {
                this.f36841E = -1;
            }
            if (!this.f36839D || this.f36847H == null) {
                return;
            }
            EditText editText = this.f36900w;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f36849I != i) {
            this.f36849I = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f36868S != colorStateList) {
            this.f36868S = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.J != i) {
            this.J = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f36866R != colorStateList) {
            this.f36866R = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f36870T != colorStateList) {
            this.f36870T = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f36872U != colorStateList) {
            this.f36872U = colorStateList;
            if (m() || (this.f36847H != null && this.f36843F)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f36851J0 = colorStateList;
        this.f36853K0 = colorStateList;
        if (this.f36900w != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z6) {
        k(this, z6);
        super.setEnabled(z6);
    }

    public void setEndIconActivated(boolean z6) {
        this.f36898v.f1526z.setActivated(z6);
    }

    public void setEndIconCheckable(boolean z6) {
        this.f36898v.f1526z.setCheckable(z6);
    }

    public void setEndIconContentDescription(int i) {
        r rVar = this.f36898v;
        CharSequence text = i != 0 ? rVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = rVar.f1526z;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        r rVar = this.f36898v;
        Drawable h3 = i != 0 ? com.bumptech.glide.g.h(rVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = rVar.f1526z;
        checkableImageButton.setImageDrawable(h3);
        if (h3 != null) {
            ColorStateList colorStateList = rVar.f1509D;
            PorterDuff.Mode mode = rVar.f1510E;
            TextInputLayout textInputLayout = rVar.f1520n;
            f.b(textInputLayout, checkableImageButton, colorStateList, mode);
            f.s(textInputLayout, checkableImageButton, rVar.f1509D);
        }
    }

    public void setEndIconMinSize(int i) {
        r rVar = this.f36898v;
        if (i < 0) {
            rVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != rVar.f1511F) {
            rVar.f1511F = i;
            CheckableImageButton checkableImageButton = rVar.f1526z;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = rVar.f1522v;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f36898v.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.f36898v;
        View.OnLongClickListener onLongClickListener = rVar.f1513H;
        CheckableImageButton checkableImageButton = rVar.f1526z;
        checkableImageButton.setOnClickListener(onClickListener);
        f.t(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.f36898v;
        rVar.f1513H = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f1526z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f.t(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        r rVar = this.f36898v;
        rVar.f1512G = scaleType;
        rVar.f1526z.setScaleType(scaleType);
        rVar.f1522v.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        r rVar = this.f36898v;
        if (rVar.f1509D != colorStateList) {
            rVar.f1509D = colorStateList;
            f.b(rVar.f1520n, rVar.f1526z, colorStateList, rVar.f1510E);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.f36898v;
        if (rVar.f1510E != mode) {
            rVar.f1510E = mode;
            f.b(rVar.f1520n, rVar.f1526z, rVar.f1509D, mode);
        }
    }

    public void setEndIconVisible(boolean z6) {
        this.f36898v.h(z6);
    }

    public void setError(CharSequence charSequence) {
        v vVar = this.f36838C;
        if (!vVar.f1554q) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            vVar.f();
            return;
        }
        vVar.c();
        vVar.f1553p = charSequence;
        vVar.f1555r.setText(charSequence);
        int i = vVar.f1551n;
        if (i != 1) {
            vVar.f1552o = 1;
        }
        vVar.i(i, vVar.f1552o, vVar.h(vVar.f1555r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        v vVar = this.f36838C;
        vVar.f1557t = i;
        Z z6 = vVar.f1555r;
        if (z6 != null) {
            WeakHashMap weakHashMap = X.f2142a;
            z6.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        v vVar = this.f36838C;
        vVar.f1556s = charSequence;
        Z z6 = vVar.f1555r;
        if (z6 != null) {
            z6.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z6) {
        v vVar = this.f36838C;
        if (vVar.f1554q == z6) {
            return;
        }
        vVar.c();
        TextInputLayout textInputLayout = vVar.f1546h;
        if (z6) {
            Z z9 = new Z(vVar.f1545g, null);
            vVar.f1555r = z9;
            z9.setId(C5248R.id.textinput_error);
            vVar.f1555r.setTextAlignment(5);
            Typeface typeface = vVar.f1538B;
            if (typeface != null) {
                vVar.f1555r.setTypeface(typeface);
            }
            int i = vVar.f1558u;
            vVar.f1558u = i;
            Z z10 = vVar.f1555r;
            if (z10 != null) {
                textInputLayout.l(z10, i);
            }
            ColorStateList colorStateList = vVar.f1559v;
            vVar.f1559v = colorStateList;
            Z z11 = vVar.f1555r;
            if (z11 != null && colorStateList != null) {
                z11.setTextColor(colorStateList);
            }
            CharSequence charSequence = vVar.f1556s;
            vVar.f1556s = charSequence;
            Z z12 = vVar.f1555r;
            if (z12 != null) {
                z12.setContentDescription(charSequence);
            }
            int i4 = vVar.f1557t;
            vVar.f1557t = i4;
            Z z13 = vVar.f1555r;
            if (z13 != null) {
                WeakHashMap weakHashMap = X.f2142a;
                z13.setAccessibilityLiveRegion(i4);
            }
            vVar.f1555r.setVisibility(4);
            vVar.a(vVar.f1555r, 0);
        } else {
            vVar.f();
            vVar.g(vVar.f1555r, 0);
            vVar.f1555r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        vVar.f1554q = z6;
    }

    public void setErrorIconDrawable(int i) {
        r rVar = this.f36898v;
        rVar.i(i != 0 ? com.bumptech.glide.g.h(rVar.getContext(), i) : null);
        f.s(rVar.f1520n, rVar.f1522v, rVar.f1523w);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.f36898v;
        CheckableImageButton checkableImageButton = rVar.f1522v;
        View.OnLongClickListener onLongClickListener = rVar.f1525y;
        checkableImageButton.setOnClickListener(onClickListener);
        f.t(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.f36898v;
        rVar.f1525y = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f1522v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f.t(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        r rVar = this.f36898v;
        if (rVar.f1523w != colorStateList) {
            rVar.f1523w = colorStateList;
            f.b(rVar.f1520n, rVar.f1522v, colorStateList, rVar.f1524x);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.f36898v;
        if (rVar.f1524x != mode) {
            rVar.f1524x = mode;
            f.b(rVar.f1520n, rVar.f1522v, rVar.f1523w, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        v vVar = this.f36838C;
        vVar.f1558u = i;
        Z z6 = vVar.f1555r;
        if (z6 != null) {
            vVar.f1546h.l(z6, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        v vVar = this.f36838C;
        vVar.f1559v = colorStateList;
        Z z6 = vVar.f1555r;
        if (z6 == null || colorStateList == null) {
            return;
        }
        z6.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z6) {
        if (this.f36878X0 != z6) {
            this.f36878X0 = z6;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        v vVar = this.f36838C;
        if (isEmpty) {
            if (vVar.f1561x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!vVar.f1561x) {
            setHelperTextEnabled(true);
        }
        vVar.c();
        vVar.f1560w = charSequence;
        vVar.f1562y.setText(charSequence);
        int i = vVar.f1551n;
        if (i != 2) {
            vVar.f1552o = 2;
        }
        vVar.i(i, vVar.f1552o, vVar.h(vVar.f1562y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        v vVar = this.f36838C;
        vVar.f1537A = colorStateList;
        Z z6 = vVar.f1562y;
        if (z6 == null || colorStateList == null) {
            return;
        }
        z6.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z6) {
        v vVar = this.f36838C;
        if (vVar.f1561x == z6) {
            return;
        }
        vVar.c();
        if (z6) {
            Z z9 = new Z(vVar.f1545g, null);
            vVar.f1562y = z9;
            z9.setId(C5248R.id.textinput_helper_text);
            vVar.f1562y.setTextAlignment(5);
            Typeface typeface = vVar.f1538B;
            if (typeface != null) {
                vVar.f1562y.setTypeface(typeface);
            }
            vVar.f1562y.setVisibility(4);
            vVar.f1562y.setAccessibilityLiveRegion(1);
            int i = vVar.f1563z;
            vVar.f1563z = i;
            Z z10 = vVar.f1562y;
            if (z10 != null) {
                z10.setTextAppearance(i);
            }
            ColorStateList colorStateList = vVar.f1537A;
            vVar.f1537A = colorStateList;
            Z z11 = vVar.f1562y;
            if (z11 != null && colorStateList != null) {
                z11.setTextColor(colorStateList);
            }
            vVar.a(vVar.f1562y, 1);
            vVar.f1562y.setAccessibilityDelegate(new u(vVar));
        } else {
            vVar.c();
            int i4 = vVar.f1551n;
            if (i4 == 2) {
                vVar.f1552o = 0;
            }
            vVar.i(i4, vVar.f1552o, vVar.h(vVar.f1562y, ""));
            vVar.g(vVar.f1562y, 1);
            vVar.f1562y = null;
            TextInputLayout textInputLayout = vVar.f1546h;
            textInputLayout.r();
            textInputLayout.x();
        }
        vVar.f1561x = z6;
    }

    public void setHelperTextTextAppearance(int i) {
        v vVar = this.f36838C;
        vVar.f1563z = i;
        Z z6 = vVar.f1562y;
        if (z6 != null) {
            z6.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f36874V) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z6) {
        this.f36879Y0 = z6;
    }

    public void setHintEnabled(boolean z6) {
        if (z6 != this.f36874V) {
            this.f36874V = z6;
            if (z6) {
                CharSequence hint = this.f36900w.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f36876W)) {
                        setHint(hint);
                    }
                    this.f36900w.setHint((CharSequence) null);
                }
                this.f36884i0 = true;
            } else {
                this.f36884i0 = false;
                if (!TextUtils.isEmpty(this.f36876W) && TextUtils.isEmpty(this.f36900w.getHint())) {
                    this.f36900w.setHint(this.f36876W);
                }
                setHintInternal(null);
            }
            if (this.f36900w != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        d dVar = this.f36877W0;
        TextInputLayout textInputLayout = dVar.f122a;
        D3.d dVar2 = new D3.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar2.f621j;
        if (colorStateList != null) {
            dVar.f137k = colorStateList;
        }
        float f2 = dVar2.f622k;
        if (f2 != 0.0f) {
            dVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar2.f613a;
        if (colorStateList2 != null) {
            dVar.f117U = colorStateList2;
        }
        dVar.f115S = dVar2.f617e;
        dVar.f116T = dVar2.f618f;
        dVar.f114R = dVar2.f619g;
        dVar.f118V = dVar2.i;
        D3.a aVar = dVar.f151y;
        if (aVar != null) {
            aVar.f607c = true;
        }
        n4.c cVar = new n4.c(3, dVar);
        dVar2.a();
        dVar.f151y = new D3.a(cVar, dVar2.f625n);
        dVar2.c(textInputLayout.getContext(), dVar.f151y);
        dVar.h(false);
        this.f36853K0 = dVar.f137k;
        if (this.f36900w != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f36853K0 != colorStateList) {
            if (this.f36851J0 == null) {
                d dVar = this.f36877W0;
                if (dVar.f137k != colorStateList) {
                    dVar.f137k = colorStateList;
                    dVar.h(false);
                }
            }
            this.f36853K0 = colorStateList;
            if (this.f36900w != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e9) {
        this.f36845G = e9;
    }

    public void setMaxEms(int i) {
        this.f36906z = i;
        EditText editText = this.f36900w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f36836B = i;
        EditText editText = this.f36900w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f36904y = i;
        EditText editText = this.f36900w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f36834A = i;
        EditText editText = this.f36900w;
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
        r rVar = this.f36898v;
        rVar.f1526z.setContentDescription(i != 0 ? rVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        r rVar = this.f36898v;
        rVar.f1526z.setImageDrawable(i != 0 ? com.bumptech.glide.g.h(rVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z6) {
        r rVar = this.f36898v;
        if (z6 && rVar.f1507B != 1) {
            rVar.g(1);
        } else if (z6) {
            rVar.getClass();
        } else {
            rVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        r rVar = this.f36898v;
        rVar.f1509D = colorStateList;
        f.b(rVar.f1520n, rVar.f1526z, colorStateList, rVar.f1510E);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        r rVar = this.f36898v;
        rVar.f1510E = mode;
        f.b(rVar.f1520n, rVar.f1526z, rVar.f1509D, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f36856M == null) {
            Z z6 = new Z(getContext(), null);
            this.f36856M = z6;
            z6.setId(C5248R.id.textinput_placeholder);
            this.f36856M.setImportantForAccessibility(2);
            C0295h d9 = d();
            this.f36862P = d9;
            d9.f496u = 67L;
            this.f36864Q = d();
            setPlaceholderTextAppearance(this.f36860O);
            setPlaceholderTextColor(this.f36858N);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f36854L) {
                setPlaceholderTextEnabled(true);
            }
            this.f36852K = charSequence;
        }
        EditText editText = this.f36900w;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f36860O = i;
        Z z6 = this.f36856M;
        if (z6 != null) {
            z6.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f36858N != colorStateList) {
            this.f36858N = colorStateList;
            Z z6 = this.f36856M;
            if (z6 == null || colorStateList == null) {
                return;
            }
            z6.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        A a9 = this.f36896u;
        a9.getClass();
        a9.f1446v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        a9.f1445u.setText(charSequence);
        a9.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f36896u.f1445u.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f36896u.f1445u.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f36885j0;
        if (gVar == null || gVar.f1108n.f1078a == kVar) {
            return;
        }
        this.f36891p0 = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z6) {
        this.f36896u.f1447w.setCheckable(z6);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f36896u.f1447w;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? com.bumptech.glide.g.h(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        A a9 = this.f36896u;
        if (i < 0) {
            a9.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != a9.f1450z) {
            a9.f1450z = i;
            CheckableImageButton checkableImageButton = a9.f1447w;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        A a9 = this.f36896u;
        View.OnLongClickListener onLongClickListener = a9.f1442B;
        CheckableImageButton checkableImageButton = a9.f1447w;
        checkableImageButton.setOnClickListener(onClickListener);
        f.t(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        A a9 = this.f36896u;
        a9.f1442B = onLongClickListener;
        CheckableImageButton checkableImageButton = a9.f1447w;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        f.t(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        A a9 = this.f36896u;
        a9.f1441A = scaleType;
        a9.f1447w.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        A a9 = this.f36896u;
        if (a9.f1448x != colorStateList) {
            a9.f1448x = colorStateList;
            f.b(a9.f1444n, a9.f1447w, colorStateList, a9.f1449y);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        A a9 = this.f36896u;
        if (a9.f1449y != mode) {
            a9.f1449y = mode;
            f.b(a9.f1444n, a9.f1447w, a9.f1448x, mode);
        }
    }

    public void setStartIconVisible(boolean z6) {
        this.f36896u.c(z6);
    }

    public void setSuffixText(CharSequence charSequence) {
        r rVar = this.f36898v;
        rVar.getClass();
        rVar.f1514I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        rVar.J.setText(charSequence);
        rVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f36898v.J.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f36898v.J.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d9) {
        EditText editText = this.f36900w;
        if (editText != null) {
            X.o(editText, d9);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.C0) {
            this.C0 = typeface;
            this.f36877W0.m(typeface);
            v vVar = this.f36838C;
            if (typeface != vVar.f1538B) {
                vVar.f1538B = typeface;
                Z z6 = vVar.f1555r;
                if (z6 != null) {
                    z6.setTypeface(typeface);
                }
                Z z9 = vVar.f1562y;
                if (z9 != null) {
                    z9.setTypeface(typeface);
                }
            }
            Z z10 = this.f36847H;
            if (z10 != null) {
                z10.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f36894s0 != 1) {
            FrameLayout frameLayout = this.f36888n;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c9 = c();
            if (c9 != layoutParams.topMargin) {
                layoutParams.topMargin = c9;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z6, boolean z9) {
        ColorStateList colorStateList;
        Z z10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f36900w;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f36900w;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f36851J0;
        d dVar = this.f36877W0;
        if (colorStateList2 != null) {
            dVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f36851J0;
            dVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f36871T0) : this.f36871T0));
        } else if (m()) {
            Z z13 = this.f36838C.f1555r;
            dVar.i(z13 != null ? z13.getTextColors() : null);
        } else if (this.f36843F && (z10 = this.f36847H) != null) {
            dVar.i(z10.getTextColors());
        } else if (z12 && (colorStateList = this.f36853K0) != null && dVar.f137k != colorStateList) {
            dVar.f137k = colorStateList;
            dVar.h(false);
        }
        r rVar = this.f36898v;
        A a9 = this.f36896u;
        if (z11 || !this.f36878X0 || (isEnabled() && z12)) {
            if (z9 || this.f36875V0) {
                ValueAnimator valueAnimator = this.f36880Z0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f36880Z0.cancel();
                }
                if (z6 && this.f36879Y0) {
                    a(1.0f);
                } else {
                    dVar.k(1.0f);
                }
                this.f36875V0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f36900w;
                v(editText3 != null ? editText3.getText() : null);
                a9.f1443C = false;
                a9.e();
                rVar.f1515K = false;
                rVar.n();
                return;
            }
            return;
        }
        if (z9 || !this.f36875V0) {
            ValueAnimator valueAnimator2 = this.f36880Z0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f36880Z0.cancel();
            }
            if (z6 && this.f36879Y0) {
                a(0.0f);
            } else {
                dVar.k(0.0f);
            }
            if (e() && !((h) this.f36885j0).f1478Q.f1476q.isEmpty() && e()) {
                ((h) this.f36885j0).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f36875V0 = true;
            Z z14 = this.f36856M;
            if (z14 != null && this.f36854L) {
                z14.setText((CharSequence) null);
                s.a(this.f36888n, this.f36864Q);
                this.f36856M.setVisibility(4);
            }
            a9.f1443C = true;
            a9.e();
            rVar.f1515K = true;
            rVar.n();
        }
    }

    public final void v(Editable editable) {
        ((n) this.f36845G).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f36888n;
        if (length != 0 || this.f36875V0) {
            Z z6 = this.f36856M;
            if (z6 == null || !this.f36854L) {
                return;
            }
            z6.setText((CharSequence) null);
            s.a(frameLayout, this.f36864Q);
            this.f36856M.setVisibility(4);
            return;
        }
        if (this.f36856M == null || !this.f36854L || TextUtils.isEmpty(this.f36852K)) {
            return;
        }
        this.f36856M.setText(this.f36852K);
        s.a(frameLayout, this.f36862P);
        this.f36856M.setVisibility(0);
        this.f36856M.bringToFront();
        announceForAccessibility(this.f36852K);
    }

    public final void w(boolean z6, boolean z9) {
        int defaultColor = this.f36861O0.getDefaultColor();
        int colorForState = this.f36861O0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f36861O0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z6) {
            this.f36903x0 = colorForState2;
        } else if (z9) {
            this.f36903x0 = colorForState;
        } else {
            this.f36903x0 = defaultColor;
        }
    }

    public final void x() {
        Z z6;
        EditText editText;
        EditText editText2;
        if (this.f36885j0 == null || this.f36894s0 == 0) {
            return;
        }
        boolean z9 = false;
        boolean z10 = isFocused() || ((editText2 = this.f36900w) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f36900w) != null && editText.isHovered())) {
            z9 = true;
        }
        if (!isEnabled()) {
            this.f36903x0 = this.f36871T0;
        } else if (m()) {
            if (this.f36861O0 != null) {
                w(z10, z9);
            } else {
                this.f36903x0 = getErrorCurrentTextColors();
            }
        } else if (!this.f36843F || (z6 = this.f36847H) == null) {
            if (z10) {
                this.f36903x0 = this.f36859N0;
            } else if (z9) {
                this.f36903x0 = this.f36857M0;
            } else {
                this.f36903x0 = this.f36855L0;
            }
        } else if (this.f36861O0 != null) {
            w(z10, z9);
        } else {
            this.f36903x0 = z6.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        r rVar = this.f36898v;
        rVar.l();
        CheckableImageButton checkableImageButton = rVar.f1522v;
        ColorStateList colorStateList = rVar.f1523w;
        TextInputLayout textInputLayout = rVar.f1520n;
        f.s(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = rVar.f1509D;
        CheckableImageButton checkableImageButton2 = rVar.f1526z;
        f.s(textInputLayout, checkableImageButton2, colorStateList2);
        if (rVar.b() instanceof m) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                f.b(textInputLayout, checkableImageButton2, rVar.f1509D, rVar.f1510E);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                H.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        A a9 = this.f36896u;
        f.s(a9.f1444n, a9.f1447w, a9.f1448x);
        if (this.f36894s0 == 2) {
            int i = this.f36897u0;
            if (z10 && isEnabled()) {
                this.f36897u0 = this.f36901w0;
            } else {
                this.f36897u0 = this.f36899v0;
            }
            if (this.f36897u0 != i && e() && !this.f36875V0) {
                if (e()) {
                    ((h) this.f36885j0).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f36894s0 == 1) {
            if (!isEnabled()) {
                this.f36905y0 = this.f36865Q0;
            } else if (z9 && !z10) {
                this.f36905y0 = this.f36869S0;
            } else if (z10) {
                this.f36905y0 = this.f36867R0;
            } else {
                this.f36905y0 = this.f36863P0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f36896u.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f36898v.f1526z.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f36898v.f1526z.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f36898v.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f36898v.f1526z;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        r rVar = this.f36898v;
        CheckableImageButton checkableImageButton = rVar.f1526z;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = rVar.f1509D;
            PorterDuff.Mode mode = rVar.f1510E;
            TextInputLayout textInputLayout = rVar.f1520n;
            f.b(textInputLayout, checkableImageButton, colorStateList, mode);
            f.s(textInputLayout, checkableImageButton, rVar.f1509D);
        }
    }
}
