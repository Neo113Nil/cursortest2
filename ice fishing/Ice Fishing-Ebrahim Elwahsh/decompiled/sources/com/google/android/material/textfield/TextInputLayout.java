package com.google.android.material.textfield;

import B1.w;
import C3.f;
import C3.g;
import C3.i;
import C3.j;
import C3.k;
import D.RunnableC0281a;
import D0.C0306h;
import D0.s;
import E.b;
import E.e;
import F3.A;
import F3.B;
import F3.C;
import F3.C0313g;
import F3.D;
import F3.E;
import F3.F;
import F3.G;
import F3.h;
import F3.m;
import F3.o;
import F3.r;
import F3.u;
import F3.v;
import F3.y;
import G.c;
import H3.a;
import O.N;
import O.X;
import a.AbstractC0415a;
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
import com.anythink.basead.exoplayer.k.p;
import com.bumptech.glide.d;
import com.google.android.material.internal.CheckableImageButton;
import com.icefishing.icefishingliveapp.C5284R;
import i3.AbstractC4576a;
import j3.AbstractC4596a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.AbstractC4742j0;
import m.C4758s;
import m.Q0;
import m.Z;
import t0.AbstractC5051n;
import w3.AbstractC5164c;
import w3.C5163b;
import z3.C5274a;
import z3.C5277d;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: i1, reason: collision with root package name */
    public static final int[][] f36230i1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public int f36231A;

    /* renamed from: A0, reason: collision with root package name */
    public int f36232A0;

    /* renamed from: B, reason: collision with root package name */
    public int f36233B;

    /* renamed from: B0, reason: collision with root package name */
    public int f36234B0;

    /* renamed from: C, reason: collision with root package name */
    public final v f36235C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f36236D;

    /* renamed from: D0, reason: collision with root package name */
    public int f36237D0;

    /* renamed from: E, reason: collision with root package name */
    public int f36238E;

    /* renamed from: E0, reason: collision with root package name */
    public final Rect f36239E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f36240F;

    /* renamed from: F0, reason: collision with root package name */
    public final Rect f36241F0;

    /* renamed from: G, reason: collision with root package name */
    public F f36242G;

    /* renamed from: G0, reason: collision with root package name */
    public final RectF f36243G0;

    /* renamed from: H, reason: collision with root package name */
    public Z f36244H;

    /* renamed from: H0, reason: collision with root package name */
    public Typeface f36245H0;

    /* renamed from: I, reason: collision with root package name */
    public int f36246I;

    /* renamed from: I0, reason: collision with root package name */
    public ColorDrawable f36247I0;
    public int J;

    /* renamed from: J0, reason: collision with root package name */
    public int f36248J0;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f36249K;

    /* renamed from: K0, reason: collision with root package name */
    public final LinkedHashSet f36250K0;

    /* renamed from: L, reason: collision with root package name */
    public boolean f36251L;

    /* renamed from: L0, reason: collision with root package name */
    public ColorDrawable f36252L0;

    /* renamed from: M, reason: collision with root package name */
    public Z f36253M;

    /* renamed from: M0, reason: collision with root package name */
    public int f36254M0;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f36255N;

    /* renamed from: N0, reason: collision with root package name */
    public Drawable f36256N0;

    /* renamed from: O, reason: collision with root package name */
    public int f36257O;

    /* renamed from: O0, reason: collision with root package name */
    public ColorStateList f36258O0;

    /* renamed from: P, reason: collision with root package name */
    public C0306h f36259P;

    /* renamed from: P0, reason: collision with root package name */
    public ColorStateList f36260P0;

    /* renamed from: Q, reason: collision with root package name */
    public C0306h f36261Q;

    /* renamed from: Q0, reason: collision with root package name */
    public int f36262Q0;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f36263R;

    /* renamed from: R0, reason: collision with root package name */
    public int f36264R0;

    /* renamed from: S, reason: collision with root package name */
    public ColorStateList f36265S;

    /* renamed from: S0, reason: collision with root package name */
    public int f36266S0;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f36267T;

    /* renamed from: T0, reason: collision with root package name */
    public ColorStateList f36268T0;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f36269U;

    /* renamed from: U0, reason: collision with root package name */
    public int f36270U0;

    /* renamed from: V, reason: collision with root package name */
    public boolean f36271V;

    /* renamed from: V0, reason: collision with root package name */
    public int f36272V0;

    /* renamed from: W, reason: collision with root package name */
    public CharSequence f36273W;

    /* renamed from: W0, reason: collision with root package name */
    public int f36274W0;

    /* renamed from: X0, reason: collision with root package name */
    public int f36275X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f36276Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f36277Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f36278a1;

    /* renamed from: b1, reason: collision with root package name */
    public final C5163b f36279b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f36280c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f36281d1;

    /* renamed from: e1, reason: collision with root package name */
    public ValueAnimator f36282e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f36283f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f36284g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f36285h1;

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f36286n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f36287n0;

    /* renamed from: o0, reason: collision with root package name */
    public g f36288o0;

    /* renamed from: p0, reason: collision with root package name */
    public g f36289p0;

    /* renamed from: q0, reason: collision with root package name */
    public StateListDrawable f36290q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f36291r0;

    /* renamed from: s0, reason: collision with root package name */
    public g f36292s0;

    /* renamed from: t0, reason: collision with root package name */
    public g f36293t0;

    /* renamed from: u, reason: collision with root package name */
    public final A f36294u;

    /* renamed from: u0, reason: collision with root package name */
    public k f36295u0;

    /* renamed from: v, reason: collision with root package name */
    public final r f36296v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f36297v0;

    /* renamed from: w, reason: collision with root package name */
    public EditText f36298w;

    /* renamed from: w0, reason: collision with root package name */
    public final int f36299w0;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f36300x;

    /* renamed from: x0, reason: collision with root package name */
    public int f36301x0;

    /* renamed from: y, reason: collision with root package name */
    public int f36302y;

    /* renamed from: y0, reason: collision with root package name */
    public int f36303y0;

    /* renamed from: z, reason: collision with root package name */
    public int f36304z;

    /* renamed from: z0, reason: collision with root package name */
    public int f36305z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5284R.attr.textInputStyle, C5284R.style.Widget_Design_TextInputLayout), attributeSet, C5284R.attr.textInputStyle);
        this.f36302y = -1;
        this.f36304z = -1;
        this.f36231A = -1;
        this.f36233B = -1;
        this.f36235C = new v(this);
        this.f36242G = new w(6);
        this.f36239E0 = new Rect();
        this.f36241F0 = new Rect();
        this.f36243G0 = new RectF();
        this.f36250K0 = new LinkedHashSet();
        C5163b c5163b = new C5163b(this);
        this.f36279b1 = c5163b;
        this.f36285h1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f36286n = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC4596a.f38541a;
        c5163b.f41610Q = linearInterpolator;
        c5163b.h(false);
        c5163b.f41609P = linearInterpolator;
        c5163b.h(false);
        if (c5163b.f41631g != 8388659) {
            c5163b.f41631g = 8388659;
            c5163b.h(false);
        }
        int[] iArr = AbstractC4576a.f38290A;
        w3.k.a(context2, attributeSet, C5284R.attr.textInputStyle, C5284R.style.Widget_Design_TextInputLayout);
        w3.k.b(context2, attributeSet, iArr, C5284R.attr.textInputStyle, C5284R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C5284R.attr.textInputStyle, C5284R.style.Widget_Design_TextInputLayout);
        Q0 q02 = new Q0(context2, obtainStyledAttributes);
        A a9 = new A(this, q02);
        this.f36294u = a9;
        this.f36271V = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f36281d1 = obtainStyledAttributes.getBoolean(47, true);
        this.f36280c1 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f36295u0 = k.b(context2, attributeSet, C5284R.attr.textInputStyle, C5284R.style.Widget_Design_TextInputLayout).a();
        this.f36299w0 = context2.getResources().getDimensionPixelOffset(C5284R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f36303y0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f36232A0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(C5284R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f36234B0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(C5284R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f36305z0 = this.f36232A0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e6 = this.f36295u0.e();
        if (dimension >= 0.0f) {
            e6.f425e = new C3.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e6.f426f = new C3.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e6.f427g = new C3.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e6.f428h = new C3.a(dimension4);
        }
        this.f36295u0 = e6.a();
        ColorStateList p6 = d.p(context2, q02, 7);
        if (p6 != null) {
            int defaultColor = p6.getDefaultColor();
            this.f36270U0 = defaultColor;
            this.f36237D0 = defaultColor;
            if (p6.isStateful()) {
                this.f36272V0 = p6.getColorForState(new int[]{-16842910}, -1);
                this.f36274W0 = p6.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f36275X0 = p6.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f36274W0 = this.f36270U0;
                ColorStateList c4 = e.c(context2, C5284R.color.mtrl_filled_background_color);
                this.f36272V0 = c4.getColorForState(new int[]{-16842910}, -1);
                this.f36275X0 = c4.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f36237D0 = 0;
            this.f36270U0 = 0;
            this.f36272V0 = 0;
            this.f36274W0 = 0;
            this.f36275X0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList f6 = q02.f(1);
            this.f36260P0 = f6;
            this.f36258O0 = f6;
        }
        ColorStateList p9 = d.p(context2, q02, 14);
        this.f36266S0 = obtainStyledAttributes.getColor(14, 0);
        this.f36262Q0 = b.a(context2, C5284R.color.mtrl_textinput_default_box_stroke_color);
        this.f36276Y0 = b.a(context2, C5284R.color.mtrl_textinput_disabled_color);
        this.f36264R0 = b.a(context2, C5284R.color.mtrl_textinput_hovered_box_stroke_color);
        if (p9 != null) {
            setBoxStrokeColorStateList(p9);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(d.p(context2, q02, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f36267T = q02.f(24);
        this.f36269U = q02.f(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z8 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z9 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z10 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.J = obtainStyledAttributes.getResourceId(22, 0);
        this.f36246I = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f36246I);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.J);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (obtainStyledAttributes.hasValue(41)) {
            setErrorTextColor(q02.f(41));
        }
        if (obtainStyledAttributes.hasValue(46)) {
            setHelperTextColor(q02.f(46));
        }
        if (obtainStyledAttributes.hasValue(50)) {
            setHintTextColor(q02.f(50));
        }
        if (obtainStyledAttributes.hasValue(23)) {
            setCounterTextColor(q02.f(23));
        }
        if (obtainStyledAttributes.hasValue(21)) {
            setCounterOverflowTextColor(q02.f(21));
        }
        if (obtainStyledAttributes.hasValue(58)) {
            setPlaceholderTextColor(q02.f(58));
        }
        r rVar = new r(this, q02);
        this.f36296v = rVar;
        boolean z11 = obtainStyledAttributes.getBoolean(0, true);
        q02.q();
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
        setErrorEnabled(z8);
        setCounterEnabled(z10);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f36298w;
        if (!(editText instanceof AutoCompleteTextView) || W2.e.l(editText)) {
            return this.f36288o0;
        }
        int f6 = U2.a.f(C5284R.attr.colorControlHighlight, this.f36298w);
        int i = this.f36301x0;
        int[][] iArr = f36230i1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f36288o0;
            int i4 = this.f36237D0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{U2.a.n(f6, i4, 0.1f), i4}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f36288o0;
        TypedValue B8 = AbstractC0415a.B(context, "TextInputLayout", C5284R.attr.colorSurface);
        int i9 = B8.resourceId;
        int a9 = i9 != 0 ? b.a(context, i9) : B8.data;
        g gVar3 = new g(gVar2.f413n.f383a);
        int n9 = U2.a.n(f6, a9, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{n9, 0}));
        gVar3.setTint(a9);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{n9, a9});
        g gVar4 = new g(gVar2.f413n.f383a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f36290q0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f36290q0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f36290q0.addState(new int[0], f(false));
        }
        return this.f36290q0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f36289p0 == null) {
            this.f36289p0 = f(true);
        }
        return this.f36289p0;
    }

    public static void k(ViewGroup viewGroup, boolean z8) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z8);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z8);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f36298w != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f36298w = editText;
        int i = this.f36302y;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f36231A);
        }
        int i4 = this.f36304z;
        if (i4 != -1) {
            setMaxEms(i4);
        } else {
            setMaxWidth(this.f36233B);
        }
        this.f36291r0 = false;
        i();
        setTextInputAccessibilityDelegate(new E(this));
        Typeface typeface = this.f36298w.getTypeface();
        C5163b c5163b = this.f36279b1;
        c5163b.m(typeface);
        float textSize = this.f36298w.getTextSize();
        if (c5163b.f41632h != textSize) {
            c5163b.f41632h = textSize;
            c5163b.h(false);
        }
        int i9 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f36298w.getLetterSpacing();
        if (c5163b.f41616W != letterSpacing) {
            c5163b.f41616W = letterSpacing;
            c5163b.h(false);
        }
        int gravity = this.f36298w.getGravity();
        int i10 = (gravity & (-113)) | 48;
        if (c5163b.f41631g != i10) {
            c5163b.f41631g = i10;
            c5163b.h(false);
        }
        if (c5163b.f41629f != gravity) {
            c5163b.f41629f = gravity;
            c5163b.h(false);
        }
        WeakHashMap weakHashMap = X.f2240a;
        this.f36277Z0 = editText.getMinimumHeight();
        this.f36298w.addTextChangedListener(new B(this, editText));
        if (this.f36258O0 == null) {
            this.f36258O0 = this.f36298w.getHintTextColors();
        }
        if (this.f36271V) {
            if (TextUtils.isEmpty(this.f36273W)) {
                CharSequence hint = this.f36298w.getHint();
                this.f36300x = hint;
                setHint(hint);
                this.f36298w.setHint((CharSequence) null);
            }
            this.f36287n0 = true;
        }
        if (i9 >= 29) {
            p();
        }
        if (this.f36244H != null) {
            n(this.f36298w.getText());
        }
        r();
        this.f36235C.b();
        this.f36294u.bringToFront();
        r rVar = this.f36296v;
        rVar.bringToFront();
        Iterator it = this.f36250K0.iterator();
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
        if (TextUtils.equals(charSequence, this.f36273W)) {
            return;
        }
        this.f36273W = charSequence;
        C5163b c5163b = this.f36279b1;
        if (charSequence == null || !TextUtils.equals(c5163b.f41595A, charSequence)) {
            c5163b.f41595A = charSequence;
            c5163b.f41596B = null;
            Bitmap bitmap = c5163b.f41599E;
            if (bitmap != null) {
                bitmap.recycle();
                c5163b.f41599E = null;
            }
            c5163b.h(false);
        }
        if (this.f36278a1) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z8) {
        if (this.f36251L == z8) {
            return;
        }
        if (z8) {
            Z z9 = this.f36253M;
            if (z9 != null) {
                this.f36286n.addView(z9);
                this.f36253M.setVisibility(0);
            }
        } else {
            Z z10 = this.f36253M;
            if (z10 != null) {
                z10.setVisibility(8);
            }
            this.f36253M = null;
        }
        this.f36251L = z8;
    }

    public final void a(float f6) {
        int i = 0;
        C5163b c5163b = this.f36279b1;
        if (c5163b.f41621b == f6) {
            return;
        }
        if (this.f36282e1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f36282e1 = valueAnimator;
            valueAnimator.setInterpolator(K3.b.z(getContext(), C5284R.attr.motionEasingEmphasizedInterpolator, AbstractC4596a.f38542b));
            this.f36282e1.setDuration(K3.b.y(getContext(), C5284R.attr.motionDurationMedium4, 167));
            this.f36282e1.addUpdateListener(new D(i, this));
        }
        this.f36282e1.setFloatValues(c5163b.f41621b, f6);
        this.f36282e1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f36286n;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i4;
        g gVar = this.f36288o0;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f413n.f383a;
        k kVar2 = this.f36295u0;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f36301x0 == 2 && (i = this.f36305z0) > -1 && (i4 = this.C0) != 0) {
            g gVar2 = this.f36288o0;
            gVar2.f413n.f391j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i4);
            f fVar = gVar2.f413n;
            if (fVar.f386d != valueOf) {
                fVar.f386d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i9 = this.f36237D0;
        if (this.f36301x0 == 1) {
            i9 = c.b(this.f36237D0, U2.a.g(getContext(), C5284R.attr.colorSurface, 0));
        }
        this.f36237D0 = i9;
        this.f36288o0.j(ColorStateList.valueOf(i9));
        g gVar3 = this.f36292s0;
        if (gVar3 != null && this.f36293t0 != null) {
            if (this.f36305z0 > -1 && this.C0 != 0) {
                gVar3.j(this.f36298w.isFocused() ? ColorStateList.valueOf(this.f36262Q0) : ColorStateList.valueOf(this.C0));
                this.f36293t0.j(ColorStateList.valueOf(this.C0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d2;
        if (!this.f36271V) {
            return 0;
        }
        int i = this.f36301x0;
        C5163b c5163b = this.f36279b1;
        if (i == 0) {
            d2 = c5163b.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d2 = c5163b.d() / 2.0f;
        }
        return (int) d2;
    }

    public final C0306h d() {
        C0306h c0306h = new C0306h();
        c0306h.f656v = K3.b.y(getContext(), C5284R.attr.motionDurationShort2, 87);
        c0306h.f657w = K3.b.z(getContext(), C5284R.attr.motionEasingLinearInterpolator, AbstractC4596a.f38541a);
        return c0306h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f36298w;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f36300x != null) {
            boolean z8 = this.f36287n0;
            this.f36287n0 = false;
            CharSequence hint = editText.getHint();
            this.f36298w.setHint(this.f36300x);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f36298w.setHint(hint);
                this.f36287n0 = z8;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f36286n;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i4 = 0; i4 < frameLayout.getChildCount(); i4++) {
            View childAt = frameLayout.getChildAt(i4);
            ViewStructure newChild = viewStructure.newChild(i4);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f36298w) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f36284g1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f36284g1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z8 = this.f36271V;
        C5163b c5163b = this.f36279b1;
        if (z8) {
            c5163b.getClass();
            int save = canvas2.save();
            if (c5163b.f41596B != null) {
                RectF rectF = c5163b.f41627e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c5163b.f41607N;
                    textPaint.setTextSize(c5163b.f41601G);
                    float f6 = c5163b.f41639p;
                    float f9 = c5163b.f41640q;
                    float f10 = c5163b.f41600F;
                    if (f10 != 1.0f) {
                        canvas2.scale(f10, f10, f6, f9);
                    }
                    if (c5163b.f41626d0 <= 1 || c5163b.f41597C) {
                        canvas2.translate(f6, f9);
                        c5163b.Y.draw(canvas2);
                    } else {
                        float lineStart = c5163b.f41639p - c5163b.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f9);
                        float f11 = alpha;
                        textPaint.setAlpha((int) (c5163b.f41622b0 * f11));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f12 = c5163b.f41602H;
                            float f13 = c5163b.f41603I;
                            float f14 = c5163b.J;
                            int i4 = c5163b.f41604K;
                            textPaint.setShadowLayer(f12, f13, f14, c.d(i4, (textPaint.getAlpha() * Color.alpha(i4)) / p.f8630b));
                        }
                        c5163b.Y.draw(canvas2);
                        textPaint.setAlpha((int) (c5163b.f41620a0 * f11));
                        if (i >= 31) {
                            float f15 = c5163b.f41602H;
                            float f16 = c5163b.f41603I;
                            float f17 = c5163b.J;
                            int i9 = c5163b.f41604K;
                            textPaint.setShadowLayer(f15, f16, f17, c.d(i9, (Color.alpha(i9) * textPaint.getAlpha()) / p.f8630b));
                        }
                        int lineBaseline = c5163b.Y.getLineBaseline(0);
                        CharSequence charSequence = c5163b.f41624c0;
                        float f18 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f18, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(c5163b.f41602H, c5163b.f41603I, c5163b.J, c5163b.f41604K);
                        }
                        String trim = c5163b.f41624c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(c5163b.Y.getLineEnd(0), str.length()), 0.0f, f18, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f36293t0 == null || (gVar = this.f36292s0) == null) {
            return;
        }
        gVar.draw(canvas2);
        if (this.f36298w.isFocused()) {
            Rect bounds = this.f36293t0.getBounds();
            Rect bounds2 = this.f36292s0.getBounds();
            float f19 = c5163b.f41621b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC4596a.c(centerX, bounds2.left, f19);
            bounds.right = AbstractC4596a.c(centerX, bounds2.right, f19);
            this.f36293t0.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z8;
        ColorStateList colorStateList;
        if (this.f36283f1) {
            return;
        }
        this.f36283f1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C5163b c5163b = this.f36279b1;
        if (c5163b != null) {
            c5163b.f41605L = drawableState;
            ColorStateList colorStateList2 = c5163b.f41634k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c5163b.f41633j) != null && colorStateList.isStateful())) {
                c5163b.h(false);
                z8 = true;
                if (this.f36298w != null) {
                    WeakHashMap weakHashMap = X.f2240a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z8) {
                    invalidate();
                }
                this.f36283f1 = false;
            }
        }
        z8 = false;
        if (this.f36298w != null) {
        }
        r();
        x();
        if (z8) {
        }
        this.f36283f1 = false;
    }

    public final boolean e() {
        return this.f36271V && !TextUtils.isEmpty(this.f36273W) && (this.f36288o0 instanceof h);
    }

    public final g f(boolean z8) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C5284R.dimen.mtrl_shape_corner_size_small_component);
        float f6 = z8 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f36298w;
        float popupElevation = editText instanceof y ? ((y) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C5284R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C5284R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        C3.e eVar = new C3.e();
        C3.e eVar2 = new C3.e();
        C3.e eVar3 = new C3.e();
        C3.e eVar4 = new C3.e();
        C3.a aVar = new C3.a(f6);
        C3.a aVar2 = new C3.a(f6);
        C3.a aVar3 = new C3.a(dimensionPixelOffset);
        C3.a aVar4 = new C3.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f432a = iVar;
        kVar.f433b = iVar2;
        kVar.f434c = iVar3;
        kVar.f435d = iVar4;
        kVar.f436e = aVar;
        kVar.f437f = aVar2;
        kVar.f438g = aVar4;
        kVar.f439h = aVar3;
        kVar.i = eVar;
        kVar.f440j = eVar2;
        kVar.f441k = eVar3;
        kVar.f442l = eVar4;
        EditText editText2 = this.f36298w;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof y ? ((y) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f398P;
            TypedValue B8 = AbstractC0415a.B(context, g.class.getSimpleName(), C5284R.attr.colorSurface);
            int i = B8.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i != 0 ? b.a(context, i) : B8.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f413n;
        if (fVar.f389g == null) {
            fVar.f389g = new Rect();
        }
        gVar.f413n.f389g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z8) {
        return ((z8 || getPrefixText() == null) ? (!z8 || getSuffixText() == null) ? this.f36298w.getCompoundPaddingLeft() : this.f36296v.c() : this.f36294u.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f36298w;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f36301x0;
        if (i == 1 || i == 2) {
            return this.f36288o0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f36237D0;
    }

    public int getBoxBackgroundMode() {
        return this.f36301x0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f36303y0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e6 = w3.k.e(this);
        RectF rectF = this.f36243G0;
        return e6 ? this.f36295u0.f439h.a(rectF) : this.f36295u0.f438g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e6 = w3.k.e(this);
        RectF rectF = this.f36243G0;
        return e6 ? this.f36295u0.f438g.a(rectF) : this.f36295u0.f439h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e6 = w3.k.e(this);
        RectF rectF = this.f36243G0;
        return e6 ? this.f36295u0.f436e.a(rectF) : this.f36295u0.f437f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e6 = w3.k.e(this);
        RectF rectF = this.f36243G0;
        return e6 ? this.f36295u0.f437f.a(rectF) : this.f36295u0.f436e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f36266S0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f36268T0;
    }

    public int getBoxStrokeWidth() {
        return this.f36232A0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f36234B0;
    }

    public int getCounterMaxLength() {
        return this.f36238E;
    }

    public CharSequence getCounterOverflowDescription() {
        Z z8;
        if (this.f36236D && this.f36240F && (z8 = this.f36244H) != null) {
            return z8.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f36265S;
    }

    public ColorStateList getCounterTextColor() {
        return this.f36263R;
    }

    public ColorStateList getCursorColor() {
        return this.f36267T;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f36269U;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f36258O0;
    }

    public EditText getEditText() {
        return this.f36298w;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f36296v.f1083z.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f36296v.f1083z.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f36296v.f1068F;
    }

    public int getEndIconMode() {
        return this.f36296v.f1064B;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f36296v.f1069G;
    }

    public CheckableImageButton getEndIconView() {
        return this.f36296v.f1083z;
    }

    public CharSequence getError() {
        v vVar = this.f36235C;
        if (vVar.f1111q) {
            return vVar.f1110p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f36235C.f1114t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f36235C.f1113s;
    }

    public int getErrorCurrentTextColors() {
        Z z8 = this.f36235C.f1112r;
        if (z8 != null) {
            return z8.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f36296v.f1079v.getDrawable();
    }

    public CharSequence getHelperText() {
        v vVar = this.f36235C;
        if (vVar.f1118x) {
            return vVar.f1117w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        Z z8 = this.f36235C.f1119y;
        if (z8 != null) {
            return z8.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f36271V) {
            return this.f36273W;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f36279b1.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C5163b c5163b = this.f36279b1;
        return c5163b.e(c5163b.f41634k);
    }

    public ColorStateList getHintTextColor() {
        return this.f36260P0;
    }

    public F getLengthCounter() {
        return this.f36242G;
    }

    public int getMaxEms() {
        return this.f36304z;
    }

    public int getMaxWidth() {
        return this.f36233B;
    }

    public int getMinEms() {
        return this.f36302y;
    }

    public int getMinWidth() {
        return this.f36231A;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f36296v.f1083z.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f36296v.f1083z.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f36251L) {
            return this.f36249K;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f36257O;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f36255N;
    }

    public CharSequence getPrefixText() {
        return this.f36294u.f1001v;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f36294u.f1000u.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f36294u.f1000u;
    }

    public k getShapeAppearanceModel() {
        return this.f36295u0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f36294u.f1002w.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f36294u.f1002w.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f36294u.f1005z;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f36294u.f996A;
    }

    public CharSequence getSuffixText() {
        return this.f36296v.f1071I;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f36296v.J.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f36296v.J;
    }

    public Typeface getTypeface() {
        return this.f36245H0;
    }

    public final int h(int i, boolean z8) {
        return i - ((z8 || getSuffixText() == null) ? (!z8 || getPrefixText() == null) ? this.f36298w.getCompoundPaddingRight() : this.f36294u.a() : this.f36296v.c());
    }

    public final void i() {
        int i = this.f36301x0;
        if (i == 0) {
            this.f36288o0 = null;
            this.f36292s0 = null;
            this.f36293t0 = null;
        } else if (i == 1) {
            this.f36288o0 = new g(this.f36295u0);
            this.f36292s0 = new g();
            this.f36293t0 = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(AbstractC5051n.e(this.f36301x0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.f36271V || (this.f36288o0 instanceof h)) {
                this.f36288o0 = new g(this.f36295u0);
            } else {
                k kVar = this.f36295u0;
                int i4 = h.f1034R;
                if (kVar == null) {
                    kVar = new k();
                }
                C0313g c0313g = new C0313g(kVar, new RectF());
                h hVar = new h(c0313g);
                hVar.f1035Q = c0313g;
                this.f36288o0 = hVar;
            }
            this.f36292s0 = null;
            this.f36293t0 = null;
        }
        s();
        x();
        if (this.f36301x0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f36303y0 = getResources().getDimensionPixelSize(C5284R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (d.u(getContext())) {
                this.f36303y0 = getResources().getDimensionPixelSize(C5284R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f36298w != null && this.f36301x0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f36298w;
                WeakHashMap weakHashMap = X.f2240a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(C5284R.dimen.material_filled_edittext_font_2_0_padding_top), this.f36298w.getPaddingEnd(), getResources().getDimensionPixelSize(C5284R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (d.u(getContext())) {
                EditText editText2 = this.f36298w;
                WeakHashMap weakHashMap2 = X.f2240a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(C5284R.dimen.material_filled_edittext_font_1_3_padding_top), this.f36298w.getPaddingEnd(), getResources().getDimensionPixelSize(C5284R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f36301x0 != 0) {
            t();
        }
        EditText editText3 = this.f36298w;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i9 = this.f36301x0;
                if (i9 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i9 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f6;
        float f9;
        float f10;
        RectF rectF;
        float f11;
        int i;
        float f12;
        int i4;
        if (e()) {
            int width = this.f36298w.getWidth();
            int gravity = this.f36298w.getGravity();
            C5163b c5163b = this.f36279b1;
            boolean b9 = c5163b.b(c5163b.f41595A);
            c5163b.f41597C = b9;
            Rect rect = c5163b.f41625d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b9) {
                        i4 = rect.left;
                        f10 = i4;
                    } else {
                        f6 = rect.right;
                        f9 = c5163b.f41618Z;
                    }
                } else if (b9) {
                    f6 = rect.right;
                    f9 = c5163b.f41618Z;
                } else {
                    i4 = rect.left;
                    f10 = i4;
                }
                float max = Math.max(f10, rect.left);
                rectF = this.f36243G0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f11 = (width / 2.0f) + (c5163b.f41618Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c5163b.f41597C) {
                        f12 = c5163b.f41618Z;
                        f11 = f12 + max;
                    } else {
                        i = rect.right;
                        f11 = i;
                    }
                } else if (c5163b.f41597C) {
                    i = rect.right;
                    f11 = i;
                } else {
                    f12 = c5163b.f41618Z;
                    f11 = f12 + max;
                }
                rectF.right = Math.min(f11, rect.right);
                rectF.bottom = c5163b.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f13 = rectF.left;
                float f14 = this.f36299w0;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f36305z0);
                h hVar = (h) this.f36288o0;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f6 = width / 2.0f;
            f9 = c5163b.f41618Z / 2.0f;
            f10 = f6 - f9;
            float max2 = Math.max(f10, rect.left);
            rectF = this.f36243G0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f11 = (width / 2.0f) + (c5163b.f41618Z / 2.0f);
            rectF.right = Math.min(f11, rect.right);
            rectF.bottom = c5163b.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(Z z8, int i) {
        try {
            z8.setTextAppearance(i);
            if (z8.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        z8.setTextAppearance(C5284R.style.TextAppearance_AppCompat_Caption);
        z8.setTextColor(b.a(getContext(), C5284R.color.design_error));
    }

    public final boolean m() {
        v vVar = this.f36235C;
        return (vVar.f1109o != 1 || vVar.f1112r == null || TextUtils.isEmpty(vVar.f1110p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((w) this.f36242G).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z8 = this.f36240F;
        int i = this.f36238E;
        String str = null;
        if (i == -1) {
            this.f36244H.setText(String.valueOf(length));
            this.f36244H.setContentDescription(null);
            this.f36240F = false;
        } else {
            this.f36240F = length > i;
            Context context = getContext();
            this.f36244H.setContentDescription(context.getString(this.f36240F ? C5284R.string.character_counter_overflowed_content_description : C5284R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f36238E)));
            if (z8 != this.f36240F) {
                o();
            }
            String str2 = M.b.f1817b;
            M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.f1820e : M.b.f1819d;
            Z z9 = this.f36244H;
            String string = getContext().getString(C5284R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f36238E));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                M.h hVar = M.i.f1829a;
                str = bVar.c(string).toString();
            }
            z9.setText(str);
        }
        if (this.f36298w == null || z8 == this.f36240F) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Z z8 = this.f36244H;
        if (z8 != null) {
            l(z8, this.f36240F ? this.f36246I : this.J);
            if (!this.f36240F && (colorStateList2 = this.f36263R) != null) {
                this.f36244H.setTextColor(colorStateList2);
            }
            if (!this.f36240F || (colorStateList = this.f36265S) == null) {
                return;
            }
            this.f36244H.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f36279b1.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        r rVar = this.f36296v;
        rVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z8 = false;
        this.f36285h1 = false;
        if (this.f36298w != null && this.f36298w.getMeasuredHeight() < (max = Math.max(rVar.getMeasuredHeight(), this.f36294u.getMeasuredHeight()))) {
            this.f36298w.setMinimumHeight(max);
            z8 = true;
        }
        boolean q6 = q();
        if (z8 || q6) {
            this.f36298w.post(new RunnableC0281a(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z8, int i, int i4, int i9, int i10) {
        super.onLayout(z8, i, i4, i9, i10);
        EditText editText = this.f36298w;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC5164c.f41650a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f36239E0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC5164c.f41650a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC5164c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC5164c.f41651b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f36292s0;
            if (gVar != null) {
                int i11 = rect.bottom;
                gVar.setBounds(rect.left, i11 - this.f36232A0, rect.right, i11);
            }
            g gVar2 = this.f36293t0;
            if (gVar2 != null) {
                int i12 = rect.bottom;
                gVar2.setBounds(rect.left, i12 - this.f36234B0, rect.right, i12);
            }
            if (this.f36271V) {
                float textSize = this.f36298w.getTextSize();
                C5163b c5163b = this.f36279b1;
                if (c5163b.f41632h != textSize) {
                    c5163b.f41632h = textSize;
                    c5163b.h(false);
                }
                int gravity = this.f36298w.getGravity();
                int i13 = (gravity & (-113)) | 48;
                if (c5163b.f41631g != i13) {
                    c5163b.f41631g = i13;
                    c5163b.h(false);
                }
                if (c5163b.f41629f != gravity) {
                    c5163b.f41629f = gravity;
                    c5163b.h(false);
                }
                if (this.f36298w == null) {
                    throw new IllegalStateException();
                }
                boolean e6 = w3.k.e(this);
                int i14 = rect.bottom;
                Rect rect2 = this.f36241F0;
                rect2.bottom = i14;
                int i15 = this.f36301x0;
                if (i15 == 1) {
                    rect2.left = g(rect.left, e6);
                    rect2.top = rect.top + this.f36303y0;
                    rect2.right = h(rect.right, e6);
                } else if (i15 != 2) {
                    rect2.left = g(rect.left, e6);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e6);
                } else {
                    rect2.left = this.f36298w.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f36298w.getPaddingRight();
                }
                int i16 = rect2.left;
                int i17 = rect2.top;
                int i18 = rect2.right;
                int i19 = rect2.bottom;
                Rect rect3 = c5163b.f41625d;
                if (rect3.left != i16 || rect3.top != i17 || rect3.right != i18 || rect3.bottom != i19) {
                    rect3.set(i16, i17, i18, i19);
                    c5163b.f41606M = true;
                }
                if (this.f36298w == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c5163b.f41608O;
                textPaint.setTextSize(c5163b.f41632h);
                textPaint.setTypeface(c5163b.f41644u);
                textPaint.setLetterSpacing(c5163b.f41616W);
                float f6 = -textPaint.ascent();
                rect2.left = this.f36298w.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f36301x0 != 1 || this.f36298w.getMinLines() > 1) ? rect.top + this.f36298w.getCompoundPaddingTop() : (int) (rect.centerY() - (f6 / 2.0f));
                rect2.right = rect.right - this.f36298w.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f36301x0 != 1 || this.f36298w.getMinLines() > 1) ? rect.bottom - this.f36298w.getCompoundPaddingBottom() : (int) (rect2.top + f6);
                rect2.bottom = compoundPaddingBottom;
                int i20 = rect2.left;
                int i21 = rect2.top;
                int i22 = rect2.right;
                Rect rect4 = c5163b.f41623c;
                if (rect4.left != i20 || rect4.top != i21 || rect4.right != i22 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i20, i21, i22, compoundPaddingBottom);
                    c5163b.f41606M = true;
                }
                c5163b.h(false);
                if (!e() || this.f36278a1) {
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
        boolean z8 = this.f36285h1;
        r rVar = this.f36296v;
        if (!z8) {
            rVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f36285h1 = true;
        }
        if (this.f36253M != null && (editText = this.f36298w) != null) {
            this.f36253M.setGravity(editText.getGravity());
            this.f36253M.setPadding(this.f36298w.getCompoundPaddingLeft(), this.f36298w.getCompoundPaddingTop(), this.f36298w.getCompoundPaddingRight(), this.f36298w.getCompoundPaddingBottom());
        }
        rVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof G)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        G g9 = (G) parcelable;
        super.onRestoreInstanceState(g9.f3318n);
        setError(g9.f1014v);
        if (g9.f1015w) {
            post(new C(0, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z8 = i == 1;
        if (z8 != this.f36297v0) {
            C3.c cVar = this.f36295u0.f436e;
            RectF rectF = this.f36243G0;
            float a9 = cVar.a(rectF);
            float a10 = this.f36295u0.f437f.a(rectF);
            float a11 = this.f36295u0.f439h.a(rectF);
            float a12 = this.f36295u0.f438g.a(rectF);
            k kVar = this.f36295u0;
            U2.a aVar = kVar.f432a;
            U2.a aVar2 = kVar.f433b;
            U2.a aVar3 = kVar.f435d;
            U2.a aVar4 = kVar.f434c;
            C3.e eVar = new C3.e();
            C3.e eVar2 = new C3.e();
            C3.e eVar3 = new C3.e();
            C3.e eVar4 = new C3.e();
            j.b(aVar2);
            j.b(aVar);
            j.b(aVar4);
            j.b(aVar3);
            C3.a aVar5 = new C3.a(a10);
            C3.a aVar6 = new C3.a(a9);
            C3.a aVar7 = new C3.a(a12);
            C3.a aVar8 = new C3.a(a11);
            k kVar2 = new k();
            kVar2.f432a = aVar2;
            kVar2.f433b = aVar;
            kVar2.f434c = aVar3;
            kVar2.f435d = aVar4;
            kVar2.f436e = aVar5;
            kVar2.f437f = aVar6;
            kVar2.f438g = aVar8;
            kVar2.f439h = aVar7;
            kVar2.i = eVar;
            kVar2.f440j = eVar2;
            kVar2.f441k = eVar3;
            kVar2.f442l = eVar4;
            this.f36297v0 = z8;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        G g9 = new G(super.onSaveInstanceState());
        if (m()) {
            g9.f1014v = getError();
        }
        r rVar = this.f36296v;
        g9.f1015w = rVar.f1064B != 0 && rVar.f1083z.f36187w;
        return g9;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f36267T;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue z8 = AbstractC0415a.z(context, C5284R.attr.colorControlActivated);
            if (z8 != null) {
                int i = z8.resourceId;
                if (i != 0) {
                    colorStateList2 = e.c(context, i);
                } else {
                    int i4 = z8.data;
                    if (i4 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i4);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f36298w;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f36298w.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f36244H != null && this.f36240F)) && (colorStateList = this.f36269U) != null) {
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
        boolean z8;
        r rVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f36298w == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z9 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            A a9 = this.f36294u;
            if (a9.getMeasuredWidth() > 0) {
                int measuredWidth = a9.getMeasuredWidth() - this.f36298w.getPaddingLeft();
                if (this.f36247I0 == null || this.f36248J0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f36247I0 = colorDrawable3;
                    this.f36248J0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f36298w.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f36247I0;
                if (drawable2 != colorDrawable4) {
                    this.f36298w.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z8 = true;
                    rVar = this.f36296v;
                    if ((!rVar.e() || ((rVar.f1064B != 0 && rVar.d()) || rVar.f1071I != null)) && rVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = rVar.J.getMeasuredWidth() - this.f36298w.getPaddingRight();
                        if (!rVar.e()) {
                            checkableImageButton = rVar.f1079v;
                        } else if (rVar.f1064B != 0 && rVar.d()) {
                            checkableImageButton = rVar.f1083z;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f36298w.getCompoundDrawablesRelative();
                        colorDrawable = this.f36252L0;
                        if (colorDrawable == null && this.f36254M0 != measuredWidth2) {
                            this.f36254M0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f36298w.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f36252L0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.f36252L0 = colorDrawable5;
                            this.f36254M0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.f36252L0;
                        if (drawable != colorDrawable2) {
                            this.f36256N0 = drawable;
                            this.f36298w.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.f36252L0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.f36298w.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f36252L0) {
                            this.f36298w.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f36256N0, compoundDrawablesRelative3[3]);
                        } else {
                            z9 = z8;
                        }
                        this.f36252L0 = null;
                        return z9;
                    }
                    return z8;
                }
                z8 = false;
                rVar = this.f36296v;
                if (rVar.e()) {
                }
                int measuredWidth22 = rVar.J.getMeasuredWidth() - this.f36298w.getPaddingRight();
                if (!rVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f36298w.getCompoundDrawablesRelative();
                colorDrawable = this.f36252L0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f36252L0;
                if (drawable != colorDrawable2) {
                }
                return z8;
            }
        }
        if (this.f36247I0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f36298w.getCompoundDrawablesRelative();
            this.f36298w.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f36247I0 = null;
            z8 = true;
            rVar = this.f36296v;
            if (rVar.e()) {
            }
            int measuredWidth222 = rVar.J.getMeasuredWidth() - this.f36298w.getPaddingRight();
            if (!rVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f36298w.getCompoundDrawablesRelative();
            colorDrawable = this.f36252L0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f36252L0;
            if (drawable != colorDrawable2) {
            }
            return z8;
        }
        z8 = false;
        rVar = this.f36296v;
        if (rVar.e()) {
        }
        int measuredWidth2222 = rVar.J.getMeasuredWidth() - this.f36298w.getPaddingRight();
        if (!rVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f36298w.getCompoundDrawablesRelative();
        colorDrawable = this.f36252L0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f36252L0;
        if (drawable != colorDrawable2) {
        }
        return z8;
    }

    public final void r() {
        Drawable background;
        Z z8;
        EditText editText = this.f36298w;
        if (editText == null || this.f36301x0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC4742j0.f39426a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C4758s.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f36240F && (z8 = this.f36244H) != null) {
            mutate.setColorFilter(C4758s.c(z8.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f36298w.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f36298w;
        if (editText == null || this.f36288o0 == null) {
            return;
        }
        if ((this.f36291r0 || editText.getBackground() == null) && this.f36301x0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f36298w;
            WeakHashMap weakHashMap = X.f2240a;
            editText2.setBackground(editTextBoxBackground);
            this.f36291r0 = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f36237D0 != i) {
            this.f36237D0 = i;
            this.f36270U0 = i;
            this.f36274W0 = i;
            this.f36275X0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f36270U0 = defaultColor;
        this.f36237D0 = defaultColor;
        this.f36272V0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f36274W0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f36275X0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f36301x0) {
            return;
        }
        this.f36301x0 = i;
        if (this.f36298w != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f36303y0 = i;
    }

    public void setBoxCornerFamily(int i) {
        j e6 = this.f36295u0.e();
        C3.c cVar = this.f36295u0.f436e;
        U2.a b9 = W2.e.b(i);
        e6.f421a = b9;
        j.b(b9);
        e6.f425e = cVar;
        C3.c cVar2 = this.f36295u0.f437f;
        U2.a b10 = W2.e.b(i);
        e6.f422b = b10;
        j.b(b10);
        e6.f426f = cVar2;
        C3.c cVar3 = this.f36295u0.f439h;
        U2.a b11 = W2.e.b(i);
        e6.f424d = b11;
        j.b(b11);
        e6.f428h = cVar3;
        C3.c cVar4 = this.f36295u0.f438g;
        U2.a b12 = W2.e.b(i);
        e6.f423c = b12;
        j.b(b12);
        e6.f427g = cVar4;
        this.f36295u0 = e6.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f36266S0 != i) {
            this.f36266S0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f36262Q0 = colorStateList.getDefaultColor();
            this.f36276Y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f36264R0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f36266S0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f36266S0 != colorStateList.getDefaultColor()) {
            this.f36266S0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f36268T0 != colorStateList) {
            this.f36268T0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f36232A0 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f36234B0 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z8) {
        if (this.f36236D != z8) {
            v vVar = this.f36235C;
            if (z8) {
                Z z9 = new Z(getContext(), null);
                this.f36244H = z9;
                z9.setId(C5284R.id.textinput_counter);
                Typeface typeface = this.f36245H0;
                if (typeface != null) {
                    this.f36244H.setTypeface(typeface);
                }
                this.f36244H.setMaxLines(1);
                vVar.a(this.f36244H, 2);
                ((ViewGroup.MarginLayoutParams) this.f36244H.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C5284R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f36244H != null) {
                    EditText editText = this.f36298w;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                vVar.g(this.f36244H, 2);
                this.f36244H = null;
            }
            this.f36236D = z8;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f36238E != i) {
            if (i > 0) {
                this.f36238E = i;
            } else {
                this.f36238E = -1;
            }
            if (!this.f36236D || this.f36244H == null) {
                return;
            }
            EditText editText = this.f36298w;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f36246I != i) {
            this.f36246I = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f36265S != colorStateList) {
            this.f36265S = colorStateList;
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
        if (this.f36263R != colorStateList) {
            this.f36263R = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f36267T != colorStateList) {
            this.f36267T = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f36269U != colorStateList) {
            this.f36269U = colorStateList;
            if (m() || (this.f36244H != null && this.f36240F)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f36258O0 = colorStateList;
        this.f36260P0 = colorStateList;
        if (this.f36298w != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z8) {
        k(this, z8);
        super.setEnabled(z8);
    }

    public void setEndIconActivated(boolean z8) {
        this.f36296v.f1083z.setActivated(z8);
    }

    public void setEndIconCheckable(boolean z8) {
        this.f36296v.f1083z.setCheckable(z8);
    }

    public void setEndIconContentDescription(int i) {
        r rVar = this.f36296v;
        CharSequence text = i != 0 ? rVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = rVar.f1083z;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        r rVar = this.f36296v;
        Drawable h9 = i != 0 ? com.bumptech.glide.f.h(rVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = rVar.f1083z;
        checkableImageButton.setImageDrawable(h9);
        if (h9 != null) {
            ColorStateList colorStateList = rVar.f1066D;
            PorterDuff.Mode mode = rVar.f1067E;
            TextInputLayout textInputLayout = rVar.f1077n;
            Z5.c.a(textInputLayout, checkableImageButton, colorStateList, mode);
            Z5.c.n(textInputLayout, checkableImageButton, rVar.f1066D);
        }
    }

    public void setEndIconMinSize(int i) {
        r rVar = this.f36296v;
        if (i < 0) {
            rVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != rVar.f1068F) {
            rVar.f1068F = i;
            CheckableImageButton checkableImageButton = rVar.f1083z;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = rVar.f1079v;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f36296v.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.f36296v;
        View.OnLongClickListener onLongClickListener = rVar.f1070H;
        CheckableImageButton checkableImageButton = rVar.f1083z;
        checkableImageButton.setOnClickListener(onClickListener);
        Z5.c.o(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.f36296v;
        rVar.f1070H = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f1083z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Z5.c.o(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        r rVar = this.f36296v;
        rVar.f1069G = scaleType;
        rVar.f1083z.setScaleType(scaleType);
        rVar.f1079v.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        r rVar = this.f36296v;
        if (rVar.f1066D != colorStateList) {
            rVar.f1066D = colorStateList;
            Z5.c.a(rVar.f1077n, rVar.f1083z, colorStateList, rVar.f1067E);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.f36296v;
        if (rVar.f1067E != mode) {
            rVar.f1067E = mode;
            Z5.c.a(rVar.f1077n, rVar.f1083z, rVar.f1066D, mode);
        }
    }

    public void setEndIconVisible(boolean z8) {
        this.f36296v.h(z8);
    }

    public void setError(CharSequence charSequence) {
        v vVar = this.f36235C;
        if (!vVar.f1111q) {
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
        vVar.f1110p = charSequence;
        vVar.f1112r.setText(charSequence);
        int i = vVar.f1108n;
        if (i != 1) {
            vVar.f1109o = 1;
        }
        vVar.i(i, vVar.f1109o, vVar.h(vVar.f1112r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        v vVar = this.f36235C;
        vVar.f1114t = i;
        Z z8 = vVar.f1112r;
        if (z8 != null) {
            WeakHashMap weakHashMap = X.f2240a;
            z8.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        v vVar = this.f36235C;
        vVar.f1113s = charSequence;
        Z z8 = vVar.f1112r;
        if (z8 != null) {
            z8.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z8) {
        v vVar = this.f36235C;
        if (vVar.f1111q == z8) {
            return;
        }
        vVar.c();
        TextInputLayout textInputLayout = vVar.f1103h;
        if (z8) {
            Z z9 = new Z(vVar.f1102g, null);
            vVar.f1112r = z9;
            z9.setId(C5284R.id.textinput_error);
            vVar.f1112r.setTextAlignment(5);
            Typeface typeface = vVar.f1095B;
            if (typeface != null) {
                vVar.f1112r.setTypeface(typeface);
            }
            int i = vVar.f1115u;
            vVar.f1115u = i;
            Z z10 = vVar.f1112r;
            if (z10 != null) {
                textInputLayout.l(z10, i);
            }
            ColorStateList colorStateList = vVar.f1116v;
            vVar.f1116v = colorStateList;
            Z z11 = vVar.f1112r;
            if (z11 != null && colorStateList != null) {
                z11.setTextColor(colorStateList);
            }
            CharSequence charSequence = vVar.f1113s;
            vVar.f1113s = charSequence;
            Z z12 = vVar.f1112r;
            if (z12 != null) {
                z12.setContentDescription(charSequence);
            }
            int i4 = vVar.f1114t;
            vVar.f1114t = i4;
            Z z13 = vVar.f1112r;
            if (z13 != null) {
                WeakHashMap weakHashMap = X.f2240a;
                z13.setAccessibilityLiveRegion(i4);
            }
            vVar.f1112r.setVisibility(4);
            vVar.a(vVar.f1112r, 0);
        } else {
            vVar.f();
            vVar.g(vVar.f1112r, 0);
            vVar.f1112r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        vVar.f1111q = z8;
    }

    public void setErrorIconDrawable(int i) {
        r rVar = this.f36296v;
        rVar.i(i != 0 ? com.bumptech.glide.f.h(rVar.getContext(), i) : null);
        Z5.c.n(rVar.f1077n, rVar.f1079v, rVar.f1080w);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.f36296v;
        CheckableImageButton checkableImageButton = rVar.f1079v;
        View.OnLongClickListener onLongClickListener = rVar.f1082y;
        checkableImageButton.setOnClickListener(onClickListener);
        Z5.c.o(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.f36296v;
        rVar.f1082y = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f1079v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Z5.c.o(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        r rVar = this.f36296v;
        if (rVar.f1080w != colorStateList) {
            rVar.f1080w = colorStateList;
            Z5.c.a(rVar.f1077n, rVar.f1079v, colorStateList, rVar.f1081x);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.f36296v;
        if (rVar.f1081x != mode) {
            rVar.f1081x = mode;
            Z5.c.a(rVar.f1077n, rVar.f1079v, rVar.f1080w, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        v vVar = this.f36235C;
        vVar.f1115u = i;
        Z z8 = vVar.f1112r;
        if (z8 != null) {
            vVar.f1103h.l(z8, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        v vVar = this.f36235C;
        vVar.f1116v = colorStateList;
        Z z8 = vVar.f1112r;
        if (z8 == null || colorStateList == null) {
            return;
        }
        z8.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z8) {
        if (this.f36280c1 != z8) {
            this.f36280c1 = z8;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        v vVar = this.f36235C;
        if (isEmpty) {
            if (vVar.f1118x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!vVar.f1118x) {
            setHelperTextEnabled(true);
        }
        vVar.c();
        vVar.f1117w = charSequence;
        vVar.f1119y.setText(charSequence);
        int i = vVar.f1108n;
        if (i != 2) {
            vVar.f1109o = 2;
        }
        vVar.i(i, vVar.f1109o, vVar.h(vVar.f1119y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        v vVar = this.f36235C;
        vVar.f1094A = colorStateList;
        Z z8 = vVar.f1119y;
        if (z8 == null || colorStateList == null) {
            return;
        }
        z8.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z8) {
        v vVar = this.f36235C;
        if (vVar.f1118x == z8) {
            return;
        }
        vVar.c();
        if (z8) {
            Z z9 = new Z(vVar.f1102g, null);
            vVar.f1119y = z9;
            z9.setId(C5284R.id.textinput_helper_text);
            vVar.f1119y.setTextAlignment(5);
            Typeface typeface = vVar.f1095B;
            if (typeface != null) {
                vVar.f1119y.setTypeface(typeface);
            }
            vVar.f1119y.setVisibility(4);
            vVar.f1119y.setAccessibilityLiveRegion(1);
            int i = vVar.f1120z;
            vVar.f1120z = i;
            Z z10 = vVar.f1119y;
            if (z10 != null) {
                z10.setTextAppearance(i);
            }
            ColorStateList colorStateList = vVar.f1094A;
            vVar.f1094A = colorStateList;
            Z z11 = vVar.f1119y;
            if (z11 != null && colorStateList != null) {
                z11.setTextColor(colorStateList);
            }
            vVar.a(vVar.f1119y, 1);
            vVar.f1119y.setAccessibilityDelegate(new u(vVar));
        } else {
            vVar.c();
            int i4 = vVar.f1108n;
            if (i4 == 2) {
                vVar.f1109o = 0;
            }
            vVar.i(i4, vVar.f1109o, vVar.h(vVar.f1119y, ""));
            vVar.g(vVar.f1119y, 1);
            vVar.f1119y = null;
            TextInputLayout textInputLayout = vVar.f1103h;
            textInputLayout.r();
            textInputLayout.x();
        }
        vVar.f1118x = z8;
    }

    public void setHelperTextTextAppearance(int i) {
        v vVar = this.f36235C;
        vVar.f1120z = i;
        Z z8 = vVar.f1119y;
        if (z8 != null) {
            z8.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f36271V) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z8) {
        this.f36281d1 = z8;
    }

    public void setHintEnabled(boolean z8) {
        if (z8 != this.f36271V) {
            this.f36271V = z8;
            if (z8) {
                CharSequence hint = this.f36298w.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f36273W)) {
                        setHint(hint);
                    }
                    this.f36298w.setHint((CharSequence) null);
                }
                this.f36287n0 = true;
            } else {
                this.f36287n0 = false;
                if (!TextUtils.isEmpty(this.f36273W) && TextUtils.isEmpty(this.f36298w.getHint())) {
                    this.f36298w.setHint(this.f36273W);
                }
                setHintInternal(null);
            }
            if (this.f36298w != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C5163b c5163b = this.f36279b1;
        TextInputLayout textInputLayout = c5163b.f41619a;
        C5277d c5277d = new C5277d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = c5277d.f42171j;
        if (colorStateList != null) {
            c5163b.f41634k = colorStateList;
        }
        float f6 = c5277d.f42172k;
        if (f6 != 0.0f) {
            c5163b.i = f6;
        }
        ColorStateList colorStateList2 = c5277d.f42163a;
        if (colorStateList2 != null) {
            c5163b.f41614U = colorStateList2;
        }
        c5163b.f41612S = c5277d.f42167e;
        c5163b.f41613T = c5277d.f42168f;
        c5163b.f41611R = c5277d.f42169g;
        c5163b.f41615V = c5277d.i;
        C5274a c5274a = c5163b.f41648y;
        if (c5274a != null) {
            c5274a.i = true;
        }
        h8.d dVar = new h8.d(12, c5163b);
        c5277d.a();
        c5163b.f41648y = new C5274a(dVar, c5277d.f42175n);
        c5277d.c(textInputLayout.getContext(), c5163b.f41648y);
        c5163b.h(false);
        this.f36260P0 = c5163b.f41634k;
        if (this.f36298w != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f36260P0 != colorStateList) {
            if (this.f36258O0 == null) {
                C5163b c5163b = this.f36279b1;
                if (c5163b.f41634k != colorStateList) {
                    c5163b.f41634k = colorStateList;
                    c5163b.h(false);
                }
            }
            this.f36260P0 = colorStateList;
            if (this.f36298w != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(F f6) {
        this.f36242G = f6;
    }

    public void setMaxEms(int i) {
        this.f36304z = i;
        EditText editText = this.f36298w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f36233B = i;
        EditText editText = this.f36298w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f36302y = i;
        EditText editText = this.f36298w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f36231A = i;
        EditText editText = this.f36298w;
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
        r rVar = this.f36296v;
        rVar.f1083z.setContentDescription(i != 0 ? rVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        r rVar = this.f36296v;
        rVar.f1083z.setImageDrawable(i != 0 ? com.bumptech.glide.f.h(rVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z8) {
        r rVar = this.f36296v;
        if (z8 && rVar.f1064B != 1) {
            rVar.g(1);
        } else if (z8) {
            rVar.getClass();
        } else {
            rVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        r rVar = this.f36296v;
        rVar.f1066D = colorStateList;
        Z5.c.a(rVar.f1077n, rVar.f1083z, colorStateList, rVar.f1067E);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        r rVar = this.f36296v;
        rVar.f1067E = mode;
        Z5.c.a(rVar.f1077n, rVar.f1083z, rVar.f1066D, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f36253M == null) {
            Z z8 = new Z(getContext(), null);
            this.f36253M = z8;
            z8.setId(C5284R.id.textinput_placeholder);
            this.f36253M.setImportantForAccessibility(2);
            C0306h d2 = d();
            this.f36259P = d2;
            d2.f655u = 67L;
            this.f36261Q = d();
            setPlaceholderTextAppearance(this.f36257O);
            setPlaceholderTextColor(this.f36255N);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f36251L) {
                setPlaceholderTextEnabled(true);
            }
            this.f36249K = charSequence;
        }
        EditText editText = this.f36298w;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f36257O = i;
        Z z8 = this.f36253M;
        if (z8 != null) {
            z8.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f36255N != colorStateList) {
            this.f36255N = colorStateList;
            Z z8 = this.f36253M;
            if (z8 == null || colorStateList == null) {
                return;
            }
            z8.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        A a9 = this.f36294u;
        a9.getClass();
        a9.f1001v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        a9.f1000u.setText(charSequence);
        a9.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f36294u.f1000u.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f36294u.f1000u.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f36288o0;
        if (gVar == null || gVar.f413n.f383a == kVar) {
            return;
        }
        this.f36295u0 = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z8) {
        this.f36294u.f1002w.setCheckable(z8);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f36294u.f1002w;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? com.bumptech.glide.f.h(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        A a9 = this.f36294u;
        if (i < 0) {
            a9.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != a9.f1005z) {
            a9.f1005z = i;
            CheckableImageButton checkableImageButton = a9.f1002w;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        A a9 = this.f36294u;
        View.OnLongClickListener onLongClickListener = a9.f997B;
        CheckableImageButton checkableImageButton = a9.f1002w;
        checkableImageButton.setOnClickListener(onClickListener);
        Z5.c.o(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        A a9 = this.f36294u;
        a9.f997B = onLongClickListener;
        CheckableImageButton checkableImageButton = a9.f1002w;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        Z5.c.o(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        A a9 = this.f36294u;
        a9.f996A = scaleType;
        a9.f1002w.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        A a9 = this.f36294u;
        if (a9.f1003x != colorStateList) {
            a9.f1003x = colorStateList;
            Z5.c.a(a9.f999n, a9.f1002w, colorStateList, a9.f1004y);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        A a9 = this.f36294u;
        if (a9.f1004y != mode) {
            a9.f1004y = mode;
            Z5.c.a(a9.f999n, a9.f1002w, a9.f1003x, mode);
        }
    }

    public void setStartIconVisible(boolean z8) {
        this.f36294u.c(z8);
    }

    public void setSuffixText(CharSequence charSequence) {
        r rVar = this.f36296v;
        rVar.getClass();
        rVar.f1071I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        rVar.J.setText(charSequence);
        rVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f36296v.J.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f36296v.J.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(E e6) {
        EditText editText = this.f36298w;
        if (editText != null) {
            X.o(editText, e6);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f36245H0) {
            this.f36245H0 = typeface;
            this.f36279b1.m(typeface);
            v vVar = this.f36235C;
            if (typeface != vVar.f1095B) {
                vVar.f1095B = typeface;
                Z z8 = vVar.f1112r;
                if (z8 != null) {
                    z8.setTypeface(typeface);
                }
                Z z9 = vVar.f1119y;
                if (z9 != null) {
                    z9.setTypeface(typeface);
                }
            }
            Z z10 = this.f36244H;
            if (z10 != null) {
                z10.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f36301x0 != 1) {
            FrameLayout frameLayout = this.f36286n;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c4 = c();
            if (c4 != layoutParams.topMargin) {
                layoutParams.topMargin = c4;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z8, boolean z9) {
        ColorStateList colorStateList;
        Z z10;
        boolean isEnabled = isEnabled();
        EditText editText = this.f36298w;
        boolean z11 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f36298w;
        boolean z12 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f36258O0;
        C5163b c5163b = this.f36279b1;
        if (colorStateList2 != null) {
            c5163b.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f36258O0;
            c5163b.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f36276Y0) : this.f36276Y0));
        } else if (m()) {
            Z z13 = this.f36235C.f1112r;
            c5163b.i(z13 != null ? z13.getTextColors() : null);
        } else if (this.f36240F && (z10 = this.f36244H) != null) {
            c5163b.i(z10.getTextColors());
        } else if (z12 && (colorStateList = this.f36260P0) != null && c5163b.f41634k != colorStateList) {
            c5163b.f41634k = colorStateList;
            c5163b.h(false);
        }
        r rVar = this.f36296v;
        A a9 = this.f36294u;
        if (z11 || !this.f36280c1 || (isEnabled() && z12)) {
            if (z9 || this.f36278a1) {
                ValueAnimator valueAnimator = this.f36282e1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f36282e1.cancel();
                }
                if (z8 && this.f36281d1) {
                    a(1.0f);
                } else {
                    c5163b.k(1.0f);
                }
                this.f36278a1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f36298w;
                v(editText3 != null ? editText3.getText() : null);
                a9.f998C = false;
                a9.e();
                rVar.f1072K = false;
                rVar.n();
                return;
            }
            return;
        }
        if (z9 || !this.f36278a1) {
            ValueAnimator valueAnimator2 = this.f36282e1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f36282e1.cancel();
            }
            if (z8 && this.f36281d1) {
                a(0.0f);
            } else {
                c5163b.k(0.0f);
            }
            if (e() && !((h) this.f36288o0).f1035Q.f1033q.isEmpty() && e()) {
                ((h) this.f36288o0).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f36278a1 = true;
            Z z14 = this.f36253M;
            if (z14 != null && this.f36251L) {
                z14.setText((CharSequence) null);
                s.a(this.f36286n, this.f36261Q);
                this.f36253M.setVisibility(4);
            }
            a9.f998C = true;
            a9.e();
            rVar.f1072K = true;
            rVar.n();
        }
    }

    public final void v(Editable editable) {
        ((w) this.f36242G).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f36286n;
        if (length != 0 || this.f36278a1) {
            Z z8 = this.f36253M;
            if (z8 == null || !this.f36251L) {
                return;
            }
            z8.setText((CharSequence) null);
            s.a(frameLayout, this.f36261Q);
            this.f36253M.setVisibility(4);
            return;
        }
        if (this.f36253M == null || !this.f36251L || TextUtils.isEmpty(this.f36249K)) {
            return;
        }
        this.f36253M.setText(this.f36249K);
        s.a(frameLayout, this.f36259P);
        this.f36253M.setVisibility(0);
        this.f36253M.bringToFront();
        announceForAccessibility(this.f36249K);
    }

    public final void w(boolean z8, boolean z9) {
        int defaultColor = this.f36268T0.getDefaultColor();
        int colorForState = this.f36268T0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f36268T0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z8) {
            this.C0 = colorForState2;
        } else if (z9) {
            this.C0 = colorForState;
        } else {
            this.C0 = defaultColor;
        }
    }

    public final void x() {
        Z z8;
        EditText editText;
        EditText editText2;
        if (this.f36288o0 == null || this.f36301x0 == 0) {
            return;
        }
        boolean z9 = false;
        boolean z10 = isFocused() || ((editText2 = this.f36298w) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f36298w) != null && editText.isHovered())) {
            z9 = true;
        }
        if (!isEnabled()) {
            this.C0 = this.f36276Y0;
        } else if (m()) {
            if (this.f36268T0 != null) {
                w(z10, z9);
            } else {
                this.C0 = getErrorCurrentTextColors();
            }
        } else if (!this.f36240F || (z8 = this.f36244H) == null) {
            if (z10) {
                this.C0 = this.f36266S0;
            } else if (z9) {
                this.C0 = this.f36264R0;
            } else {
                this.C0 = this.f36262Q0;
            }
        } else if (this.f36268T0 != null) {
            w(z10, z9);
        } else {
            this.C0 = z8.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        r rVar = this.f36296v;
        rVar.l();
        CheckableImageButton checkableImageButton = rVar.f1079v;
        ColorStateList colorStateList = rVar.f1080w;
        TextInputLayout textInputLayout = rVar.f1077n;
        Z5.c.n(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = rVar.f1066D;
        CheckableImageButton checkableImageButton2 = rVar.f1083z;
        Z5.c.n(textInputLayout, checkableImageButton2, colorStateList2);
        if (rVar.b() instanceof m) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                Z5.c.a(textInputLayout, checkableImageButton2, rVar.f1066D, rVar.f1067E);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                H.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        A a9 = this.f36294u;
        Z5.c.n(a9.f999n, a9.f1002w, a9.f1003x);
        if (this.f36301x0 == 2) {
            int i = this.f36305z0;
            if (z10 && isEnabled()) {
                this.f36305z0 = this.f36234B0;
            } else {
                this.f36305z0 = this.f36232A0;
            }
            if (this.f36305z0 != i && e() && !this.f36278a1) {
                if (e()) {
                    ((h) this.f36288o0).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f36301x0 == 1) {
            if (!isEnabled()) {
                this.f36237D0 = this.f36272V0;
            } else if (z9 && !z10) {
                this.f36237D0 = this.f36275X0;
            } else if (z10) {
                this.f36237D0 = this.f36274W0;
            } else {
                this.f36237D0 = this.f36270U0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f36294u.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f36296v.f1083z.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f36296v.f1083z.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f36296v.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f36296v.f1083z;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        r rVar = this.f36296v;
        CheckableImageButton checkableImageButton = rVar.f1083z;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = rVar.f1066D;
            PorterDuff.Mode mode = rVar.f1067E;
            TextInputLayout textInputLayout = rVar.f1077n;
            Z5.c.a(textInputLayout, checkableImageButton, colorStateList, mode);
            Z5.c.n(textInputLayout, checkableImageButton, rVar.f1066D);
        }
    }
}
