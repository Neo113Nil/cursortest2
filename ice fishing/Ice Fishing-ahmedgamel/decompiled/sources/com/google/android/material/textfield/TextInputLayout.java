package com.google.android.material.textfield;

import B1.x;
import B3.d;
import D.RunnableC0282a;
import D0.C0307h;
import D0.s;
import E.e;
import E3.f;
import E3.g;
import E3.i;
import E3.j;
import E3.k;
import H3.A;
import H3.B;
import H3.C;
import H3.D;
import H3.E;
import H3.h;
import H3.m;
import H3.o;
import H3.r;
import H3.u;
import H3.v;
import H3.y;
import J3.a;
import L3.F;
import O.N;
import O.X;
import O3.b;
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
import com.google.android.material.internal.CheckableImageButton;
import com.icefishinggame.icefishinggamemultigames.C5275R;
import d6.c;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import k3.AbstractC4632a;
import l3.AbstractC4661a;
import m.AbstractC4694j0;
import m.C4710s;
import m.Z;
import t2.n;
import y3.AbstractC5235c;
import y3.C5234b;

/* loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: i1, reason: collision with root package name */
    public static final int[][] f36065i1 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public int f36066A;

    /* renamed from: A0, reason: collision with root package name */
    public int f36067A0;

    /* renamed from: B, reason: collision with root package name */
    public int f36068B;

    /* renamed from: B0, reason: collision with root package name */
    public int f36069B0;

    /* renamed from: C, reason: collision with root package name */
    public final v f36070C;
    public int C0;

    /* renamed from: D, reason: collision with root package name */
    public boolean f36071D;

    /* renamed from: D0, reason: collision with root package name */
    public int f36072D0;

    /* renamed from: E, reason: collision with root package name */
    public int f36073E;

    /* renamed from: E0, reason: collision with root package name */
    public final Rect f36074E0;

    /* renamed from: F, reason: collision with root package name */
    public boolean f36075F;

    /* renamed from: F0, reason: collision with root package name */
    public final Rect f36076F0;

    /* renamed from: G, reason: collision with root package name */
    public E f36077G;

    /* renamed from: G0, reason: collision with root package name */
    public final RectF f36078G0;

    /* renamed from: H, reason: collision with root package name */
    public Z f36079H;

    /* renamed from: H0, reason: collision with root package name */
    public Typeface f36080H0;

    /* renamed from: I, reason: collision with root package name */
    public int f36081I;

    /* renamed from: I0, reason: collision with root package name */
    public ColorDrawable f36082I0;
    public int J;

    /* renamed from: J0, reason: collision with root package name */
    public int f36083J0;

    /* renamed from: K, reason: collision with root package name */
    public CharSequence f36084K;

    /* renamed from: K0, reason: collision with root package name */
    public final LinkedHashSet f36085K0;

    /* renamed from: L, reason: collision with root package name */
    public boolean f36086L;

    /* renamed from: L0, reason: collision with root package name */
    public ColorDrawable f36087L0;

    /* renamed from: M, reason: collision with root package name */
    public Z f36088M;

    /* renamed from: M0, reason: collision with root package name */
    public int f36089M0;

    /* renamed from: N, reason: collision with root package name */
    public ColorStateList f36090N;

    /* renamed from: N0, reason: collision with root package name */
    public Drawable f36091N0;

    /* renamed from: O, reason: collision with root package name */
    public int f36092O;

    /* renamed from: O0, reason: collision with root package name */
    public ColorStateList f36093O0;

    /* renamed from: P, reason: collision with root package name */
    public C0307h f36094P;

    /* renamed from: P0, reason: collision with root package name */
    public ColorStateList f36095P0;

    /* renamed from: Q, reason: collision with root package name */
    public C0307h f36096Q;

    /* renamed from: Q0, reason: collision with root package name */
    public int f36097Q0;

    /* renamed from: R, reason: collision with root package name */
    public ColorStateList f36098R;

    /* renamed from: R0, reason: collision with root package name */
    public int f36099R0;

    /* renamed from: S, reason: collision with root package name */
    public ColorStateList f36100S;

    /* renamed from: S0, reason: collision with root package name */
    public int f36101S0;

    /* renamed from: T, reason: collision with root package name */
    public ColorStateList f36102T;

    /* renamed from: T0, reason: collision with root package name */
    public ColorStateList f36103T0;

    /* renamed from: U, reason: collision with root package name */
    public ColorStateList f36104U;

    /* renamed from: U0, reason: collision with root package name */
    public int f36105U0;

    /* renamed from: V, reason: collision with root package name */
    public boolean f36106V;

    /* renamed from: V0, reason: collision with root package name */
    public int f36107V0;

    /* renamed from: W, reason: collision with root package name */
    public CharSequence f36108W;

    /* renamed from: W0, reason: collision with root package name */
    public int f36109W0;

    /* renamed from: X0, reason: collision with root package name */
    public int f36110X0;

    /* renamed from: Y0, reason: collision with root package name */
    public int f36111Y0;

    /* renamed from: Z0, reason: collision with root package name */
    public int f36112Z0;

    /* renamed from: a1, reason: collision with root package name */
    public boolean f36113a1;

    /* renamed from: b1, reason: collision with root package name */
    public final C5234b f36114b1;

    /* renamed from: c1, reason: collision with root package name */
    public boolean f36115c1;

    /* renamed from: d1, reason: collision with root package name */
    public boolean f36116d1;

    /* renamed from: e1, reason: collision with root package name */
    public ValueAnimator f36117e1;

    /* renamed from: f1, reason: collision with root package name */
    public boolean f36118f1;

    /* renamed from: g1, reason: collision with root package name */
    public boolean f36119g1;

    /* renamed from: h1, reason: collision with root package name */
    public boolean f36120h1;

    /* renamed from: n, reason: collision with root package name */
    public final FrameLayout f36121n;

    /* renamed from: n0, reason: collision with root package name */
    public boolean f36122n0;

    /* renamed from: o0, reason: collision with root package name */
    public g f36123o0;

    /* renamed from: p0, reason: collision with root package name */
    public g f36124p0;

    /* renamed from: q0, reason: collision with root package name */
    public StateListDrawable f36125q0;

    /* renamed from: r0, reason: collision with root package name */
    public boolean f36126r0;

    /* renamed from: s0, reason: collision with root package name */
    public g f36127s0;

    /* renamed from: t0, reason: collision with root package name */
    public g f36128t0;

    /* renamed from: u, reason: collision with root package name */
    public final A f36129u;

    /* renamed from: u0, reason: collision with root package name */
    public k f36130u0;

    /* renamed from: v, reason: collision with root package name */
    public final r f36131v;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f36132v0;

    /* renamed from: w, reason: collision with root package name */
    public EditText f36133w;

    /* renamed from: w0, reason: collision with root package name */
    public final int f36134w0;

    /* renamed from: x, reason: collision with root package name */
    public CharSequence f36135x;

    /* renamed from: x0, reason: collision with root package name */
    public int f36136x0;

    /* renamed from: y, reason: collision with root package name */
    public int f36137y;

    /* renamed from: y0, reason: collision with root package name */
    public int f36138y0;

    /* renamed from: z, reason: collision with root package name */
    public int f36139z;

    /* renamed from: z0, reason: collision with root package name */
    public int f36140z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, C5275R.attr.textInputStyle, C5275R.style.Widget_Design_TextInputLayout), attributeSet, C5275R.attr.textInputStyle);
        this.f36137y = -1;
        this.f36139z = -1;
        this.f36066A = -1;
        this.f36068B = -1;
        this.f36070C = new v(this);
        this.f36077G = new x(6);
        this.f36074E0 = new Rect();
        this.f36076F0 = new Rect();
        this.f36078G0 = new RectF();
        this.f36085K0 = new LinkedHashSet();
        C5234b c5234b = new C5234b(this);
        this.f36114b1 = c5234b;
        this.f36120h1 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f36121n = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC4661a.f38903a;
        c5234b.f41862Q = linearInterpolator;
        c5234b.h(false);
        c5234b.f41861P = linearInterpolator;
        c5234b.h(false);
        if (c5234b.f41883g != 8388659) {
            c5234b.f41883g = 8388659;
            c5234b.h(false);
        }
        int[] iArr = AbstractC4632a.f38627A;
        y3.k.a(context2, attributeSet, C5275R.attr.textInputStyle, C5275R.style.Widget_Design_TextInputLayout);
        y3.k.b(context2, attributeSet, iArr, C5275R.attr.textInputStyle, C5275R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, C5275R.attr.textInputStyle, C5275R.style.Widget_Design_TextInputLayout);
        j4.g gVar = new j4.g(context2, obtainStyledAttributes);
        A a9 = new A(this, gVar);
        this.f36129u = a9;
        this.f36106V = obtainStyledAttributes.getBoolean(48, true);
        setHint(obtainStyledAttributes.getText(4));
        this.f36116d1 = obtainStyledAttributes.getBoolean(47, true);
        this.f36115c1 = obtainStyledAttributes.getBoolean(42, true);
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
        this.f36130u0 = k.b(context2, attributeSet, C5275R.attr.textInputStyle, C5275R.style.Widget_Design_TextInputLayout).a();
        this.f36134w0 = context2.getResources().getDimensionPixelOffset(C5275R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f36138y0 = obtainStyledAttributes.getDimensionPixelOffset(9, 0);
        this.f36067A0 = obtainStyledAttributes.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(C5275R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f36069B0 = obtainStyledAttributes.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(C5275R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f36140z0 = this.f36067A0;
        float dimension = obtainStyledAttributes.getDimension(13, -1.0f);
        float dimension2 = obtainStyledAttributes.getDimension(12, -1.0f);
        float dimension3 = obtainStyledAttributes.getDimension(10, -1.0f);
        float dimension4 = obtainStyledAttributes.getDimension(11, -1.0f);
        j e9 = this.f36130u0.e();
        if (dimension >= 0.0f) {
            e9.f778e = new E3.a(dimension);
        }
        if (dimension2 >= 0.0f) {
            e9.f779f = new E3.a(dimension2);
        }
        if (dimension3 >= 0.0f) {
            e9.f780g = new E3.a(dimension3);
        }
        if (dimension4 >= 0.0f) {
            e9.f781h = new E3.a(dimension4);
        }
        this.f36130u0 = e9.a();
        ColorStateList n9 = b.n(context2, gVar, 7);
        if (n9 != null) {
            int defaultColor = n9.getDefaultColor();
            this.f36105U0 = defaultColor;
            this.f36072D0 = defaultColor;
            if (n9.isStateful()) {
                this.f36107V0 = n9.getColorForState(new int[]{-16842910}, -1);
                this.f36109W0 = n9.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f36110X0 = n9.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f36109W0 = this.f36105U0;
                ColorStateList c9 = e.c(context2, C5275R.color.mtrl_filled_background_color);
                this.f36107V0 = c9.getColorForState(new int[]{-16842910}, -1);
                this.f36110X0 = c9.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f36072D0 = 0;
            this.f36105U0 = 0;
            this.f36107V0 = 0;
            this.f36109W0 = 0;
            this.f36110X0 = 0;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            ColorStateList h9 = gVar.h(1);
            this.f36095P0 = h9;
            this.f36093O0 = h9;
        }
        ColorStateList n10 = b.n(context2, gVar, 14);
        this.f36101S0 = obtainStyledAttributes.getColor(14, 0);
        this.f36097Q0 = E.b.a(context2, C5275R.color.mtrl_textinput_default_box_stroke_color);
        this.f36111Y0 = E.b.a(context2, C5275R.color.mtrl_textinput_disabled_color);
        this.f36099R0 = E.b.a(context2, C5275R.color.mtrl_textinput_hovered_box_stroke_color);
        if (n10 != null) {
            setBoxStrokeColorStateList(n10);
        }
        if (obtainStyledAttributes.hasValue(15)) {
            setBoxStrokeErrorColor(b.n(context2, gVar, 15));
        }
        if (obtainStyledAttributes.getResourceId(49, -1) != -1) {
            setHintTextAppearance(obtainStyledAttributes.getResourceId(49, 0));
        }
        this.f36102T = gVar.h(24);
        this.f36104U = gVar.h(25);
        int resourceId = obtainStyledAttributes.getResourceId(40, 0);
        CharSequence text = obtainStyledAttributes.getText(35);
        int i = obtainStyledAttributes.getInt(34, 1);
        boolean z3 = obtainStyledAttributes.getBoolean(36, false);
        int resourceId2 = obtainStyledAttributes.getResourceId(45, 0);
        boolean z6 = obtainStyledAttributes.getBoolean(44, false);
        CharSequence text2 = obtainStyledAttributes.getText(43);
        int resourceId3 = obtainStyledAttributes.getResourceId(57, 0);
        CharSequence text3 = obtainStyledAttributes.getText(56);
        boolean z9 = obtainStyledAttributes.getBoolean(18, false);
        setCounterMaxLength(obtainStyledAttributes.getInt(19, -1));
        this.J = obtainStyledAttributes.getResourceId(22, 0);
        this.f36081I = obtainStyledAttributes.getResourceId(20, 0);
        setBoxBackgroundMode(obtainStyledAttributes.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f36081I);
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
        this.f36131v = rVar;
        boolean z10 = obtainStyledAttributes.getBoolean(0, true);
        gVar.t();
        setImportantForAccessibility(2);
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 26 && i6 >= 26) {
            N.m(this, 1);
        }
        frameLayout.addView(a9);
        frameLayout.addView(rVar);
        addView(frameLayout);
        setEnabled(z10);
        setHelperTextEnabled(z6);
        setErrorEnabled(z3);
        setCounterEnabled(z9);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f36133w;
        if (!(editText instanceof AutoCompleteTextView) || c.j(editText)) {
            return this.f36123o0;
        }
        int l9 = V2.a.l(C5275R.attr.colorControlHighlight, this.f36133w);
        int i = this.f36136x0;
        int[][] iArr = f36065i1;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f36123o0;
            int i6 = this.f36072D0;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{V2.a.r(l9, i6, 0.1f), i6}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f36123o0;
        TypedValue r9 = F.r(context, "TextInputLayout", C5275R.attr.colorSurface);
        int i9 = r9.resourceId;
        int a9 = i9 != 0 ? E.b.a(context, i9) : r9.data;
        g gVar3 = new g(gVar2.f766n.f736a);
        int r10 = V2.a.r(l9, a9, 0.1f);
        gVar3.j(new ColorStateList(iArr, new int[]{r10, 0}));
        gVar3.setTint(a9);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{r10, a9});
        g gVar4 = new g(gVar2.f766n.f736a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f36125q0 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f36125q0 = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f36125q0.addState(new int[0], f(false));
        }
        return this.f36125q0;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f36124p0 == null) {
            this.f36124p0 = f(true);
        }
        return this.f36124p0;
    }

    public static void k(ViewGroup viewGroup, boolean z3) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z3);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z3);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f36133w != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f36133w = editText;
        int i = this.f36137y;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f36066A);
        }
        int i6 = this.f36139z;
        if (i6 != -1) {
            setMaxEms(i6);
        } else {
            setMaxWidth(this.f36068B);
        }
        this.f36126r0 = false;
        i();
        setTextInputAccessibilityDelegate(new D(this));
        Typeface typeface = this.f36133w.getTypeface();
        C5234b c5234b = this.f36114b1;
        c5234b.m(typeface);
        float textSize = this.f36133w.getTextSize();
        if (c5234b.f41884h != textSize) {
            c5234b.f41884h = textSize;
            c5234b.h(false);
        }
        int i9 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f36133w.getLetterSpacing();
        if (c5234b.f41868W != letterSpacing) {
            c5234b.f41868W = letterSpacing;
            c5234b.h(false);
        }
        int gravity = this.f36133w.getGravity();
        int i10 = (gravity & (-113)) | 48;
        if (c5234b.f41883g != i10) {
            c5234b.f41883g = i10;
            c5234b.h(false);
        }
        if (c5234b.f41881f != gravity) {
            c5234b.f41881f = gravity;
            c5234b.h(false);
        }
        WeakHashMap weakHashMap = X.f2054a;
        this.f36112Z0 = editText.getMinimumHeight();
        this.f36133w.addTextChangedListener(new B(this, editText));
        if (this.f36093O0 == null) {
            this.f36093O0 = this.f36133w.getHintTextColors();
        }
        if (this.f36106V) {
            if (TextUtils.isEmpty(this.f36108W)) {
                CharSequence hint = this.f36133w.getHint();
                this.f36135x = hint;
                setHint(hint);
                this.f36133w.setHint((CharSequence) null);
            }
            this.f36122n0 = true;
        }
        if (i9 >= 29) {
            p();
        }
        if (this.f36079H != null) {
            n(this.f36133w.getText());
        }
        r();
        this.f36070C.b();
        this.f36129u.bringToFront();
        r rVar = this.f36131v;
        rVar.bringToFront();
        Iterator it = this.f36085K0.iterator();
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
        if (TextUtils.equals(charSequence, this.f36108W)) {
            return;
        }
        this.f36108W = charSequence;
        C5234b c5234b = this.f36114b1;
        if (charSequence == null || !TextUtils.equals(c5234b.f41847A, charSequence)) {
            c5234b.f41847A = charSequence;
            c5234b.f41848B = null;
            Bitmap bitmap = c5234b.f41851E;
            if (bitmap != null) {
                bitmap.recycle();
                c5234b.f41851E = null;
            }
            c5234b.h(false);
        }
        if (this.f36113a1) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z3) {
        if (this.f36086L == z3) {
            return;
        }
        if (z3) {
            Z z6 = this.f36088M;
            if (z6 != null) {
                this.f36121n.addView(z6);
                this.f36088M.setVisibility(0);
            }
        } else {
            Z z9 = this.f36088M;
            if (z9 != null) {
                z9.setVisibility(8);
            }
            this.f36088M = null;
        }
        this.f36086L = z3;
    }

    public final void a(float f3) {
        int i = 0;
        C5234b c5234b = this.f36114b1;
        if (c5234b.f41873b == f3) {
            return;
        }
        if (this.f36117e1 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f36117e1 = valueAnimator;
            valueAnimator.setInterpolator(t8.g.E(getContext(), C5275R.attr.motionEasingEmphasizedInterpolator, AbstractC4661a.f38904b));
            this.f36117e1.setDuration(t8.g.D(getContext(), C5275R.attr.motionDurationMedium4, 167));
            this.f36117e1.addUpdateListener(new C(i, this));
        }
        this.f36117e1.setFloatValues(c5234b.f41873b, f3);
        this.f36117e1.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f36121n;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i6;
        g gVar = this.f36123o0;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f766n.f736a;
        k kVar2 = this.f36130u0;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f36136x0 == 2 && (i = this.f36140z0) > -1 && (i6 = this.C0) != 0) {
            g gVar2 = this.f36123o0;
            gVar2.f766n.f744j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i6);
            f fVar = gVar2.f766n;
            if (fVar.f739d != valueOf) {
                fVar.f739d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i9 = this.f36072D0;
        if (this.f36136x0 == 1) {
            i9 = G.c.b(this.f36072D0, V2.a.m(getContext(), C5275R.attr.colorSurface, 0));
        }
        this.f36072D0 = i9;
        this.f36123o0.j(ColorStateList.valueOf(i9));
        g gVar3 = this.f36127s0;
        if (gVar3 != null && this.f36128t0 != null) {
            if (this.f36140z0 > -1 && this.C0 != 0) {
                gVar3.j(this.f36133w.isFocused() ? ColorStateList.valueOf(this.f36097Q0) : ColorStateList.valueOf(this.C0));
                this.f36128t0.j(ColorStateList.valueOf(this.C0));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d2;
        if (!this.f36106V) {
            return 0;
        }
        int i = this.f36136x0;
        C5234b c5234b = this.f36114b1;
        if (i == 0) {
            d2 = c5234b.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d2 = c5234b.d() / 2.0f;
        }
        return (int) d2;
    }

    public final C0307h d() {
        C0307h c0307h = new C0307h();
        c0307h.f601v = t8.g.D(getContext(), C5275R.attr.motionDurationShort2, 87);
        c0307h.f602w = t8.g.E(getContext(), C5275R.attr.motionEasingLinearInterpolator, AbstractC4661a.f38903a);
        return c0307h;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f36133w;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f36135x != null) {
            boolean z3 = this.f36122n0;
            this.f36122n0 = false;
            CharSequence hint = editText.getHint();
            this.f36133w.setHint(this.f36135x);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f36133w.setHint(hint);
                this.f36122n0 = z3;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f36121n;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i6 = 0; i6 < frameLayout.getChildCount(); i6++) {
            View childAt = frameLayout.getChildAt(i6);
            ViewStructure newChild = viewStructure.newChild(i6);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f36133w) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f36119g1 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f36119g1 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        Canvas canvas2 = canvas;
        super.draw(canvas);
        boolean z3 = this.f36106V;
        C5234b c5234b = this.f36114b1;
        if (z3) {
            c5234b.getClass();
            int save = canvas2.save();
            if (c5234b.f41848B != null) {
                RectF rectF = c5234b.f41879e;
                if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
                    TextPaint textPaint = c5234b.f41859N;
                    textPaint.setTextSize(c5234b.f41853G);
                    float f3 = c5234b.f41891p;
                    float f9 = c5234b.f41892q;
                    float f10 = c5234b.f41852F;
                    if (f10 != 1.0f) {
                        canvas2.scale(f10, f10, f3, f9);
                    }
                    if (c5234b.f41878d0 <= 1 || c5234b.f41849C) {
                        canvas2.translate(f3, f9);
                        c5234b.Y.draw(canvas2);
                    } else {
                        float lineStart = c5234b.f41891p - c5234b.Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas2.translate(lineStart, f9);
                        float f11 = alpha;
                        textPaint.setAlpha((int) (c5234b.f41874b0 * f11));
                        int i = Build.VERSION.SDK_INT;
                        if (i >= 31) {
                            float f12 = c5234b.f41854H;
                            float f13 = c5234b.f41855I;
                            float f14 = c5234b.J;
                            int i6 = c5234b.f41856K;
                            textPaint.setShadowLayer(f12, f13, f14, G.c.d(i6, (textPaint.getAlpha() * Color.alpha(i6)) / p.f8473b));
                        }
                        c5234b.Y.draw(canvas2);
                        textPaint.setAlpha((int) (c5234b.f41872a0 * f11));
                        if (i >= 31) {
                            float f15 = c5234b.f41854H;
                            float f16 = c5234b.f41855I;
                            float f17 = c5234b.J;
                            int i9 = c5234b.f41856K;
                            textPaint.setShadowLayer(f15, f16, f17, G.c.d(i9, (Color.alpha(i9) * textPaint.getAlpha()) / p.f8473b));
                        }
                        int lineBaseline = c5234b.Y.getLineBaseline(0);
                        CharSequence charSequence = c5234b.f41876c0;
                        float f18 = lineBaseline;
                        canvas2.drawText(charSequence, 0, charSequence.length(), 0.0f, f18, textPaint);
                        if (i >= 31) {
                            textPaint.setShadowLayer(c5234b.f41854H, c5234b.f41855I, c5234b.J, c5234b.f41856K);
                        }
                        String trim = c5234b.f41876c0.toString().trim();
                        if (trim.endsWith("…")) {
                            trim = trim.substring(0, trim.length() - 1);
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas2 = canvas;
                        canvas2.drawText(str, 0, Math.min(c5234b.Y.getLineEnd(0), str.length()), 0.0f, f18, (Paint) textPaint);
                    }
                    canvas2.restoreToCount(save);
                }
            }
        }
        if (this.f36128t0 == null || (gVar = this.f36127s0) == null) {
            return;
        }
        gVar.draw(canvas2);
        if (this.f36133w.isFocused()) {
            Rect bounds = this.f36128t0.getBounds();
            Rect bounds2 = this.f36127s0.getBounds();
            float f19 = c5234b.f41873b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC4661a.c(centerX, bounds2.left, f19);
            bounds.right = AbstractC4661a.c(centerX, bounds2.right, f19);
            this.f36128t0.draw(canvas2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z3;
        ColorStateList colorStateList;
        if (this.f36118f1) {
            return;
        }
        this.f36118f1 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C5234b c5234b = this.f36114b1;
        if (c5234b != null) {
            c5234b.f41857L = drawableState;
            ColorStateList colorStateList2 = c5234b.f41886k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = c5234b.f41885j) != null && colorStateList.isStateful())) {
                c5234b.h(false);
                z3 = true;
                if (this.f36133w != null) {
                    WeakHashMap weakHashMap = X.f2054a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z3) {
                    invalidate();
                }
                this.f36118f1 = false;
            }
        }
        z3 = false;
        if (this.f36133w != null) {
        }
        r();
        x();
        if (z3) {
        }
        this.f36118f1 = false;
    }

    public final boolean e() {
        return this.f36106V && !TextUtils.isEmpty(this.f36108W) && (this.f36123o0 instanceof h);
    }

    public final g f(boolean z3) {
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(C5275R.dimen.mtrl_shape_corner_size_small_component);
        float f3 = z3 ? dimensionPixelOffset : 0.0f;
        EditText editText = this.f36133w;
        float popupElevation = editText instanceof y ? ((y) editText).getPopupElevation() : getResources().getDimensionPixelOffset(C5275R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(C5275R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        E3.e eVar = new E3.e();
        E3.e eVar2 = new E3.e();
        E3.e eVar3 = new E3.e();
        E3.e eVar4 = new E3.e();
        E3.a aVar = new E3.a(f3);
        E3.a aVar2 = new E3.a(f3);
        E3.a aVar3 = new E3.a(dimensionPixelOffset);
        E3.a aVar4 = new E3.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f785a = iVar;
        kVar.f786b = iVar2;
        kVar.f787c = iVar3;
        kVar.f788d = iVar4;
        kVar.f789e = aVar;
        kVar.f790f = aVar2;
        kVar.f791g = aVar4;
        kVar.f792h = aVar3;
        kVar.i = eVar;
        kVar.f793j = eVar2;
        kVar.f794k = eVar3;
        kVar.f795l = eVar4;
        EditText editText2 = this.f36133w;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof y ? ((y) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f751P;
            TypedValue r9 = F.r(context, g.class.getSimpleName(), C5275R.attr.colorSurface);
            int i = r9.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i != 0 ? E.b.a(context, i) : r9.data);
        }
        g gVar = new g();
        gVar.h(context);
        gVar.j(dropDownBackgroundTintList);
        gVar.i(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f766n;
        if (fVar.f742g == null) {
            fVar.f742g = new Rect();
        }
        gVar.f766n.f742g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z3) {
        return ((z3 || getPrefixText() == null) ? (!z3 || getSuffixText() == null) ? this.f36133w.getCompoundPaddingLeft() : this.f36131v.c() : this.f36129u.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f36133w;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f36136x0;
        if (i == 1 || i == 2) {
            return this.f36123o0;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f36072D0;
    }

    public int getBoxBackgroundMode() {
        return this.f36136x0;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f36138y0;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean e9 = y3.k.e(this);
        RectF rectF = this.f36078G0;
        return e9 ? this.f36130u0.f792h.a(rectF) : this.f36130u0.f791g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean e9 = y3.k.e(this);
        RectF rectF = this.f36078G0;
        return e9 ? this.f36130u0.f791g.a(rectF) : this.f36130u0.f792h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean e9 = y3.k.e(this);
        RectF rectF = this.f36078G0;
        return e9 ? this.f36130u0.f789e.a(rectF) : this.f36130u0.f790f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean e9 = y3.k.e(this);
        RectF rectF = this.f36078G0;
        return e9 ? this.f36130u0.f790f.a(rectF) : this.f36130u0.f789e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f36101S0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f36103T0;
    }

    public int getBoxStrokeWidth() {
        return this.f36067A0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f36069B0;
    }

    public int getCounterMaxLength() {
        return this.f36073E;
    }

    public CharSequence getCounterOverflowDescription() {
        Z z3;
        if (this.f36071D && this.f36075F && (z3 = this.f36079H) != null) {
            return z3.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f36100S;
    }

    public ColorStateList getCounterTextColor() {
        return this.f36098R;
    }

    public ColorStateList getCursorColor() {
        return this.f36102T;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f36104U;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f36093O0;
    }

    public EditText getEditText() {
        return this.f36133w;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f36131v.f1170z.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f36131v.f1170z.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f36131v.f1155F;
    }

    public int getEndIconMode() {
        return this.f36131v.f1151B;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f36131v.f1156G;
    }

    public CheckableImageButton getEndIconView() {
        return this.f36131v.f1170z;
    }

    public CharSequence getError() {
        v vVar = this.f36070C;
        if (vVar.f1198q) {
            return vVar.f1197p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.f36070C.f1201t;
    }

    public CharSequence getErrorContentDescription() {
        return this.f36070C.f1200s;
    }

    public int getErrorCurrentTextColors() {
        Z z3 = this.f36070C.f1199r;
        if (z3 != null) {
            return z3.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f36131v.f1166v.getDrawable();
    }

    public CharSequence getHelperText() {
        v vVar = this.f36070C;
        if (vVar.f1205x) {
            return vVar.f1204w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        Z z3 = this.f36070C.f1206y;
        if (z3 != null) {
            return z3.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f36106V) {
            return this.f36108W;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f36114b1.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        C5234b c5234b = this.f36114b1;
        return c5234b.e(c5234b.f41886k);
    }

    public ColorStateList getHintTextColor() {
        return this.f36095P0;
    }

    public E getLengthCounter() {
        return this.f36077G;
    }

    public int getMaxEms() {
        return this.f36139z;
    }

    public int getMaxWidth() {
        return this.f36068B;
    }

    public int getMinEms() {
        return this.f36137y;
    }

    public int getMinWidth() {
        return this.f36066A;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f36131v.f1170z.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f36131v.f1170z.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f36086L) {
            return this.f36084K;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f36092O;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f36090N;
    }

    public CharSequence getPrefixText() {
        return this.f36129u.f1090v;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f36129u.f1089u.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f36129u.f1089u;
    }

    public k getShapeAppearanceModel() {
        return this.f36130u0;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f36129u.f1091w.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f36129u.f1091w.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f36129u.f1094z;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f36129u.f1085A;
    }

    public CharSequence getSuffixText() {
        return this.f36131v.f1158I;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f36131v.J.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f36131v.J;
    }

    public Typeface getTypeface() {
        return this.f36080H0;
    }

    public final int h(int i, boolean z3) {
        return i - ((z3 || getSuffixText() == null) ? (!z3 || getPrefixText() == null) ? this.f36133w.getCompoundPaddingRight() : this.f36129u.a() : this.f36131v.c());
    }

    public final void i() {
        int i = this.f36136x0;
        if (i == 0) {
            this.f36123o0 = null;
            this.f36127s0 = null;
            this.f36128t0 = null;
        } else if (i == 1) {
            this.f36123o0 = new g(this.f36130u0);
            this.f36127s0 = new g();
            this.f36128t0 = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(u1.h.e(this.f36136x0, " is illegal; only @BoxBackgroundMode constants are supported.", new StringBuilder()));
            }
            if (!this.f36106V || (this.f36123o0 instanceof h)) {
                this.f36123o0 = new g(this.f36130u0);
            } else {
                k kVar = this.f36130u0;
                int i6 = h.f1121R;
                if (kVar == null) {
                    kVar = new k();
                }
                H3.g gVar = new H3.g(kVar, new RectF());
                h hVar = new h(gVar);
                hVar.f1122Q = gVar;
                this.f36123o0 = hVar;
            }
            this.f36127s0 = null;
            this.f36128t0 = null;
        }
        s();
        x();
        if (this.f36136x0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f36138y0 = getResources().getDimensionPixelSize(C5275R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (b.y(getContext())) {
                this.f36138y0 = getResources().getDimensionPixelSize(C5275R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f36133w != null && this.f36136x0 == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f36133w;
                WeakHashMap weakHashMap = X.f2054a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(C5275R.dimen.material_filled_edittext_font_2_0_padding_top), this.f36133w.getPaddingEnd(), getResources().getDimensionPixelSize(C5275R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (b.y(getContext())) {
                EditText editText2 = this.f36133w;
                WeakHashMap weakHashMap2 = X.f2054a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(C5275R.dimen.material_filled_edittext_font_1_3_padding_top), this.f36133w.getPaddingEnd(), getResources().getDimensionPixelSize(C5275R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f36136x0 != 0) {
            t();
        }
        EditText editText3 = this.f36133w;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i9 = this.f36136x0;
                if (i9 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i9 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f3;
        float f9;
        float f10;
        RectF rectF;
        float f11;
        int i;
        float f12;
        int i6;
        if (e()) {
            int width = this.f36133w.getWidth();
            int gravity = this.f36133w.getGravity();
            C5234b c5234b = this.f36114b1;
            boolean b9 = c5234b.b(c5234b.f41847A);
            c5234b.f41849C = b9;
            Rect rect = c5234b.f41877d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b9) {
                        i6 = rect.left;
                        f10 = i6;
                    } else {
                        f3 = rect.right;
                        f9 = c5234b.f41870Z;
                    }
                } else if (b9) {
                    f3 = rect.right;
                    f9 = c5234b.f41870Z;
                } else {
                    i6 = rect.left;
                    f10 = i6;
                }
                float max = Math.max(f10, rect.left);
                rectF = this.f36078G0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f11 = (width / 2.0f) + (c5234b.f41870Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (c5234b.f41849C) {
                        f12 = c5234b.f41870Z;
                        f11 = f12 + max;
                    } else {
                        i = rect.right;
                        f11 = i;
                    }
                } else if (c5234b.f41849C) {
                    i = rect.right;
                    f11 = i;
                } else {
                    f12 = c5234b.f41870Z;
                    f11 = f12 + max;
                }
                rectF.right = Math.min(f11, rect.right);
                rectF.bottom = c5234b.d() + rect.top;
                if (rectF.width() > 0.0f || rectF.height() <= 0.0f) {
                }
                float f13 = rectF.left;
                float f14 = this.f36134w0;
                rectF.left = f13 - f14;
                rectF.right += f14;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f36140z0);
                h hVar = (h) this.f36123o0;
                hVar.getClass();
                hVar.n(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f3 = width / 2.0f;
            f9 = c5234b.f41870Z / 2.0f;
            f10 = f3 - f9;
            float max2 = Math.max(f10, rect.left);
            rectF = this.f36078G0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f11 = (width / 2.0f) + (c5234b.f41870Z / 2.0f);
            rectF.right = Math.min(f11, rect.right);
            rectF.bottom = c5234b.d() + rect.top;
            if (rectF.width() > 0.0f) {
            }
        }
    }

    public final void l(Z z3, int i) {
        try {
            z3.setTextAppearance(i);
            if (z3.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        z3.setTextAppearance(C5275R.style.TextAppearance_AppCompat_Caption);
        z3.setTextColor(E.b.a(getContext(), C5275R.color.design_error));
    }

    public final boolean m() {
        v vVar = this.f36070C;
        return (vVar.f1196o != 1 || vVar.f1199r == null || TextUtils.isEmpty(vVar.f1197p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((x) this.f36077G).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z3 = this.f36075F;
        int i = this.f36073E;
        String str = null;
        if (i == -1) {
            this.f36079H.setText(String.valueOf(length));
            this.f36079H.setContentDescription(null);
            this.f36075F = false;
        } else {
            this.f36075F = length > i;
            Context context = getContext();
            this.f36079H.setContentDescription(context.getString(this.f36075F ? C5275R.string.character_counter_overflowed_content_description : C5275R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f36073E)));
            if (z3 != this.f36075F) {
                o();
            }
            String str2 = M.b.f1765b;
            M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.f1768e : M.b.f1767d;
            Z z6 = this.f36079H;
            String string = getContext().getString(C5275R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f36073E));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                L3.h hVar = M.h.f1775a;
                str = bVar.c(string).toString();
            }
            z6.setText(str);
        }
        if (this.f36133w == null || z3 == this.f36075F) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        Z z3 = this.f36079H;
        if (z3 != null) {
            l(z3, this.f36075F ? this.f36081I : this.J);
            if (!this.f36075F && (colorStateList2 = this.f36098R) != null) {
                this.f36079H.setTextColor(colorStateList2);
            }
            if (!this.f36075F || (colorStateList = this.f36100S) == null) {
                return;
            }
            this.f36079H.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f36114b1.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        r rVar = this.f36131v;
        rVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z3 = false;
        this.f36120h1 = false;
        if (this.f36133w != null && this.f36133w.getMeasuredHeight() < (max = Math.max(rVar.getMeasuredHeight(), this.f36129u.getMeasuredHeight()))) {
            this.f36133w.setMinimumHeight(max);
            z3 = true;
        }
        boolean q8 = q();
        if (z3 || q8) {
            this.f36133w.post(new RunnableC0282a(4, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        EditText editText = this.f36133w;
        if (editText != null) {
            ThreadLocal threadLocal = AbstractC5235c.f41902a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f36074E0;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = AbstractC5235c.f41902a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            AbstractC5235c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = AbstractC5235c.f41903b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.f36127s0;
            if (gVar != null) {
                int i11 = rect.bottom;
                gVar.setBounds(rect.left, i11 - this.f36067A0, rect.right, i11);
            }
            g gVar2 = this.f36128t0;
            if (gVar2 != null) {
                int i12 = rect.bottom;
                gVar2.setBounds(rect.left, i12 - this.f36069B0, rect.right, i12);
            }
            if (this.f36106V) {
                float textSize = this.f36133w.getTextSize();
                C5234b c5234b = this.f36114b1;
                if (c5234b.f41884h != textSize) {
                    c5234b.f41884h = textSize;
                    c5234b.h(false);
                }
                int gravity = this.f36133w.getGravity();
                int i13 = (gravity & (-113)) | 48;
                if (c5234b.f41883g != i13) {
                    c5234b.f41883g = i13;
                    c5234b.h(false);
                }
                if (c5234b.f41881f != gravity) {
                    c5234b.f41881f = gravity;
                    c5234b.h(false);
                }
                if (this.f36133w == null) {
                    throw new IllegalStateException();
                }
                boolean e9 = y3.k.e(this);
                int i14 = rect.bottom;
                Rect rect2 = this.f36076F0;
                rect2.bottom = i14;
                int i15 = this.f36136x0;
                if (i15 == 1) {
                    rect2.left = g(rect.left, e9);
                    rect2.top = rect.top + this.f36138y0;
                    rect2.right = h(rect.right, e9);
                } else if (i15 != 2) {
                    rect2.left = g(rect.left, e9);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, e9);
                } else {
                    rect2.left = this.f36133w.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f36133w.getPaddingRight();
                }
                int i16 = rect2.left;
                int i17 = rect2.top;
                int i18 = rect2.right;
                int i19 = rect2.bottom;
                Rect rect3 = c5234b.f41877d;
                if (rect3.left != i16 || rect3.top != i17 || rect3.right != i18 || rect3.bottom != i19) {
                    rect3.set(i16, i17, i18, i19);
                    c5234b.f41858M = true;
                }
                if (this.f36133w == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = c5234b.f41860O;
                textPaint.setTextSize(c5234b.f41884h);
                textPaint.setTypeface(c5234b.f41896u);
                textPaint.setLetterSpacing(c5234b.f41868W);
                float f3 = -textPaint.ascent();
                rect2.left = this.f36133w.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f36136x0 != 1 || this.f36133w.getMinLines() > 1) ? rect.top + this.f36133w.getCompoundPaddingTop() : (int) (rect.centerY() - (f3 / 2.0f));
                rect2.right = rect.right - this.f36133w.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f36136x0 != 1 || this.f36133w.getMinLines() > 1) ? rect.bottom - this.f36133w.getCompoundPaddingBottom() : (int) (rect2.top + f3);
                rect2.bottom = compoundPaddingBottom;
                int i20 = rect2.left;
                int i21 = rect2.top;
                int i22 = rect2.right;
                Rect rect4 = c5234b.f41875c;
                if (rect4.left != i20 || rect4.top != i21 || rect4.right != i22 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i20, i21, i22, compoundPaddingBottom);
                    c5234b.f41858M = true;
                }
                c5234b.h(false);
                if (!e() || this.f36113a1) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i6) {
        EditText editText;
        super.onMeasure(i, i6);
        boolean z3 = this.f36120h1;
        r rVar = this.f36131v;
        if (!z3) {
            rVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f36120h1 = true;
        }
        if (this.f36088M != null && (editText = this.f36133w) != null) {
            this.f36088M.setGravity(editText.getGravity());
            this.f36088M.setPadding(this.f36133w.getCompoundPaddingLeft(), this.f36133w.getCompoundPaddingTop(), this.f36133w.getCompoundPaddingRight(), this.f36133w.getCompoundPaddingBottom());
        }
        rVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof H3.F)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        H3.F f3 = (H3.F) parcelable;
        super.onRestoreInstanceState(f3.f3267n);
        setError(f3.f1101v);
        if (f3.f1102w) {
            post(new G0.c(1, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z3 = i == 1;
        if (z3 != this.f36132v0) {
            E3.c cVar = this.f36130u0.f789e;
            RectF rectF = this.f36078G0;
            float a9 = cVar.a(rectF);
            float a10 = this.f36130u0.f790f.a(rectF);
            float a11 = this.f36130u0.f792h.a(rectF);
            float a12 = this.f36130u0.f791g.a(rectF);
            k kVar = this.f36130u0;
            A8.b bVar = kVar.f785a;
            A8.b bVar2 = kVar.f786b;
            A8.b bVar3 = kVar.f788d;
            A8.b bVar4 = kVar.f787c;
            E3.e eVar = new E3.e();
            E3.e eVar2 = new E3.e();
            E3.e eVar3 = new E3.e();
            E3.e eVar4 = new E3.e();
            j.b(bVar2);
            j.b(bVar);
            j.b(bVar4);
            j.b(bVar3);
            E3.a aVar = new E3.a(a10);
            E3.a aVar2 = new E3.a(a9);
            E3.a aVar3 = new E3.a(a12);
            E3.a aVar4 = new E3.a(a11);
            k kVar2 = new k();
            kVar2.f785a = bVar2;
            kVar2.f786b = bVar;
            kVar2.f787c = bVar3;
            kVar2.f788d = bVar4;
            kVar2.f789e = aVar;
            kVar2.f790f = aVar2;
            kVar2.f791g = aVar4;
            kVar2.f792h = aVar3;
            kVar2.i = eVar;
            kVar2.f793j = eVar2;
            kVar2.f794k = eVar3;
            kVar2.f795l = eVar4;
            this.f36132v0 = z3;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        H3.F f3 = new H3.F(super.onSaveInstanceState());
        if (m()) {
            f3.f1101v = getError();
        }
        r rVar = this.f36131v;
        f3.f1102w = rVar.f1151B != 0 && rVar.f1170z.f36022w;
        return f3;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f36102T;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue p9 = F.p(context, C5275R.attr.colorControlActivated);
            if (p9 != null) {
                int i = p9.resourceId;
                if (i != 0) {
                    colorStateList2 = e.c(context, i);
                } else {
                    int i6 = p9.data;
                    if (i6 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i6);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f36133w;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f36133w.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f36079H != null && this.f36075F)) && (colorStateList = this.f36104U) != null) {
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
        boolean z3;
        r rVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f36133w == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z6 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            A a9 = this.f36129u;
            if (a9.getMeasuredWidth() > 0) {
                int measuredWidth = a9.getMeasuredWidth() - this.f36133w.getPaddingLeft();
                if (this.f36082I0 == null || this.f36083J0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f36082I0 = colorDrawable3;
                    this.f36083J0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f36133w.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f36082I0;
                if (drawable2 != colorDrawable4) {
                    this.f36133w.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z3 = true;
                    rVar = this.f36131v;
                    if ((!rVar.e() || ((rVar.f1151B != 0 && rVar.d()) || rVar.f1158I != null)) && rVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = rVar.J.getMeasuredWidth() - this.f36133w.getPaddingRight();
                        if (!rVar.e()) {
                            checkableImageButton = rVar.f1166v;
                        } else if (rVar.f1151B != 0 && rVar.d()) {
                            checkableImageButton = rVar.f1170z;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f36133w.getCompoundDrawablesRelative();
                        colorDrawable = this.f36087L0;
                        if (colorDrawable == null && this.f36089M0 != measuredWidth2) {
                            this.f36089M0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f36133w.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f36087L0, compoundDrawablesRelative[3]);
                            return true;
                        }
                        if (colorDrawable == null) {
                            ColorDrawable colorDrawable5 = new ColorDrawable();
                            this.f36087L0 = colorDrawable5;
                            this.f36089M0 = measuredWidth2;
                            colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                        }
                        drawable = compoundDrawablesRelative[2];
                        colorDrawable2 = this.f36087L0;
                        if (drawable != colorDrawable2) {
                            this.f36091N0 = drawable;
                            this.f36133w.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            return true;
                        }
                    } else if (this.f36087L0 != null) {
                        Drawable[] compoundDrawablesRelative3 = this.f36133w.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f36087L0) {
                            this.f36133w.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f36091N0, compoundDrawablesRelative3[3]);
                        } else {
                            z6 = z3;
                        }
                        this.f36087L0 = null;
                        return z6;
                    }
                    return z3;
                }
                z3 = false;
                rVar = this.f36131v;
                if (rVar.e()) {
                }
                int measuredWidth22 = rVar.J.getMeasuredWidth() - this.f36133w.getPaddingRight();
                if (!rVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f36133w.getCompoundDrawablesRelative();
                colorDrawable = this.f36087L0;
                if (colorDrawable == null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f36087L0;
                if (drawable != colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f36082I0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f36133w.getCompoundDrawablesRelative();
            this.f36133w.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f36082I0 = null;
            z3 = true;
            rVar = this.f36131v;
            if (rVar.e()) {
            }
            int measuredWidth222 = rVar.J.getMeasuredWidth() - this.f36133w.getPaddingRight();
            if (!rVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f36133w.getCompoundDrawablesRelative();
            colorDrawable = this.f36087L0;
            if (colorDrawable == null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f36087L0;
            if (drawable != colorDrawable2) {
            }
            return z3;
        }
        z3 = false;
        rVar = this.f36131v;
        if (rVar.e()) {
        }
        int measuredWidth2222 = rVar.J.getMeasuredWidth() - this.f36133w.getPaddingRight();
        if (!rVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f36133w.getCompoundDrawablesRelative();
        colorDrawable = this.f36087L0;
        if (colorDrawable == null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f36087L0;
        if (drawable != colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        Z z3;
        EditText editText = this.f36133w;
        if (editText == null || this.f36136x0 != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC4694j0.f39155a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C4710s.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f36075F && (z3 = this.f36079H) != null) {
            mutate.setColorFilter(C4710s.c(z3.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f36133w.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f36133w;
        if (editText == null || this.f36123o0 == null) {
            return;
        }
        if ((this.f36126r0 || editText.getBackground() == null) && this.f36136x0 != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f36133w;
            WeakHashMap weakHashMap = X.f2054a;
            editText2.setBackground(editTextBoxBackground);
            this.f36126r0 = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f36072D0 != i) {
            this.f36072D0 = i;
            this.f36105U0 = i;
            this.f36109W0 = i;
            this.f36110X0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(E.b.a(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f36105U0 = defaultColor;
        this.f36072D0 = defaultColor;
        this.f36107V0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f36109W0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f36110X0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f36136x0) {
            return;
        }
        this.f36136x0 = i;
        if (this.f36133w != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f36138y0 = i;
    }

    public void setBoxCornerFamily(int i) {
        j e9 = this.f36130u0.e();
        E3.c cVar = this.f36130u0.f789e;
        A8.b j6 = F.j(i);
        e9.f774a = j6;
        j.b(j6);
        e9.f778e = cVar;
        E3.c cVar2 = this.f36130u0.f790f;
        A8.b j9 = F.j(i);
        e9.f775b = j9;
        j.b(j9);
        e9.f779f = cVar2;
        E3.c cVar3 = this.f36130u0.f792h;
        A8.b j10 = F.j(i);
        e9.f777d = j10;
        j.b(j10);
        e9.f781h = cVar3;
        E3.c cVar4 = this.f36130u0.f791g;
        A8.b j11 = F.j(i);
        e9.f776c = j11;
        j.b(j11);
        e9.f780g = cVar4;
        this.f36130u0 = e9.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f36101S0 != i) {
            this.f36101S0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f36097Q0 = colorStateList.getDefaultColor();
            this.f36111Y0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f36099R0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f36101S0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f36101S0 != colorStateList.getDefaultColor()) {
            this.f36101S0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f36103T0 != colorStateList) {
            this.f36103T0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f36067A0 = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f36069B0 = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z3) {
        if (this.f36071D != z3) {
            v vVar = this.f36070C;
            if (z3) {
                Z z6 = new Z(getContext(), null);
                this.f36079H = z6;
                z6.setId(C5275R.id.textinput_counter);
                Typeface typeface = this.f36080H0;
                if (typeface != null) {
                    this.f36079H.setTypeface(typeface);
                }
                this.f36079H.setMaxLines(1);
                vVar.a(this.f36079H, 2);
                ((ViewGroup.MarginLayoutParams) this.f36079H.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(C5275R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f36079H != null) {
                    EditText editText = this.f36133w;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                vVar.g(this.f36079H, 2);
                this.f36079H = null;
            }
            this.f36071D = z3;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f36073E != i) {
            if (i > 0) {
                this.f36073E = i;
            } else {
                this.f36073E = -1;
            }
            if (!this.f36071D || this.f36079H == null) {
                return;
            }
            EditText editText = this.f36133w;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f36081I != i) {
            this.f36081I = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f36100S != colorStateList) {
            this.f36100S = colorStateList;
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
        if (this.f36098R != colorStateList) {
            this.f36098R = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f36102T != colorStateList) {
            this.f36102T = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f36104U != colorStateList) {
            this.f36104U = colorStateList;
            if (m() || (this.f36079H != null && this.f36075F)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f36093O0 = colorStateList;
        this.f36095P0 = colorStateList;
        if (this.f36133w != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z3) {
        k(this, z3);
        super.setEnabled(z3);
    }

    public void setEndIconActivated(boolean z3) {
        this.f36131v.f1170z.setActivated(z3);
    }

    public void setEndIconCheckable(boolean z3) {
        this.f36131v.f1170z.setCheckable(z3);
    }

    public void setEndIconContentDescription(int i) {
        r rVar = this.f36131v;
        CharSequence text = i != 0 ? rVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = rVar.f1170z;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        r rVar = this.f36131v;
        Drawable e9 = i != 0 ? com.bumptech.glide.g.e(rVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = rVar.f1170z;
        checkableImageButton.setImageDrawable(e9);
        if (e9 != null) {
            ColorStateList colorStateList = rVar.f1153D;
            PorterDuff.Mode mode = rVar.f1154E;
            TextInputLayout textInputLayout = rVar.f1164n;
            t8.g.a(textInputLayout, checkableImageButton, colorStateList, mode);
            t8.g.C(textInputLayout, checkableImageButton, rVar.f1153D);
        }
    }

    public void setEndIconMinSize(int i) {
        r rVar = this.f36131v;
        if (i < 0) {
            rVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != rVar.f1155F) {
            rVar.f1155F = i;
            CheckableImageButton checkableImageButton = rVar.f1170z;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = rVar.f1166v;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f36131v.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.f36131v;
        View.OnLongClickListener onLongClickListener = rVar.f1157H;
        CheckableImageButton checkableImageButton = rVar.f1170z;
        checkableImageButton.setOnClickListener(onClickListener);
        t8.g.F(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.f36131v;
        rVar.f1157H = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f1170z;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t8.g.F(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        r rVar = this.f36131v;
        rVar.f1156G = scaleType;
        rVar.f1170z.setScaleType(scaleType);
        rVar.f1166v.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        r rVar = this.f36131v;
        if (rVar.f1153D != colorStateList) {
            rVar.f1153D = colorStateList;
            t8.g.a(rVar.f1164n, rVar.f1170z, colorStateList, rVar.f1154E);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.f36131v;
        if (rVar.f1154E != mode) {
            rVar.f1154E = mode;
            t8.g.a(rVar.f1164n, rVar.f1170z, rVar.f1153D, mode);
        }
    }

    public void setEndIconVisible(boolean z3) {
        this.f36131v.h(z3);
    }

    public void setError(CharSequence charSequence) {
        v vVar = this.f36070C;
        if (!vVar.f1198q) {
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
        vVar.f1197p = charSequence;
        vVar.f1199r.setText(charSequence);
        int i = vVar.f1195n;
        if (i != 1) {
            vVar.f1196o = 1;
        }
        vVar.i(i, vVar.f1196o, vVar.h(vVar.f1199r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        v vVar = this.f36070C;
        vVar.f1201t = i;
        Z z3 = vVar.f1199r;
        if (z3 != null) {
            WeakHashMap weakHashMap = X.f2054a;
            z3.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        v vVar = this.f36070C;
        vVar.f1200s = charSequence;
        Z z3 = vVar.f1199r;
        if (z3 != null) {
            z3.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z3) {
        v vVar = this.f36070C;
        if (vVar.f1198q == z3) {
            return;
        }
        vVar.c();
        TextInputLayout textInputLayout = vVar.f1190h;
        if (z3) {
            Z z6 = new Z(vVar.f1189g, null);
            vVar.f1199r = z6;
            z6.setId(C5275R.id.textinput_error);
            vVar.f1199r.setTextAlignment(5);
            Typeface typeface = vVar.f1182B;
            if (typeface != null) {
                vVar.f1199r.setTypeface(typeface);
            }
            int i = vVar.f1202u;
            vVar.f1202u = i;
            Z z9 = vVar.f1199r;
            if (z9 != null) {
                textInputLayout.l(z9, i);
            }
            ColorStateList colorStateList = vVar.f1203v;
            vVar.f1203v = colorStateList;
            Z z10 = vVar.f1199r;
            if (z10 != null && colorStateList != null) {
                z10.setTextColor(colorStateList);
            }
            CharSequence charSequence = vVar.f1200s;
            vVar.f1200s = charSequence;
            Z z11 = vVar.f1199r;
            if (z11 != null) {
                z11.setContentDescription(charSequence);
            }
            int i6 = vVar.f1201t;
            vVar.f1201t = i6;
            Z z12 = vVar.f1199r;
            if (z12 != null) {
                WeakHashMap weakHashMap = X.f2054a;
                z12.setAccessibilityLiveRegion(i6);
            }
            vVar.f1199r.setVisibility(4);
            vVar.a(vVar.f1199r, 0);
        } else {
            vVar.f();
            vVar.g(vVar.f1199r, 0);
            vVar.f1199r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        vVar.f1198q = z3;
    }

    public void setErrorIconDrawable(int i) {
        r rVar = this.f36131v;
        rVar.i(i != 0 ? com.bumptech.glide.g.e(rVar.getContext(), i) : null);
        t8.g.C(rVar.f1164n, rVar.f1166v, rVar.f1167w);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        r rVar = this.f36131v;
        CheckableImageButton checkableImageButton = rVar.f1166v;
        View.OnLongClickListener onLongClickListener = rVar.f1169y;
        checkableImageButton.setOnClickListener(onClickListener);
        t8.g.F(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        r rVar = this.f36131v;
        rVar.f1169y = onLongClickListener;
        CheckableImageButton checkableImageButton = rVar.f1166v;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t8.g.F(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        r rVar = this.f36131v;
        if (rVar.f1167w != colorStateList) {
            rVar.f1167w = colorStateList;
            t8.g.a(rVar.f1164n, rVar.f1166v, colorStateList, rVar.f1168x);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        r rVar = this.f36131v;
        if (rVar.f1168x != mode) {
            rVar.f1168x = mode;
            t8.g.a(rVar.f1164n, rVar.f1166v, rVar.f1167w, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        v vVar = this.f36070C;
        vVar.f1202u = i;
        Z z3 = vVar.f1199r;
        if (z3 != null) {
            vVar.f1190h.l(z3, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        v vVar = this.f36070C;
        vVar.f1203v = colorStateList;
        Z z3 = vVar.f1199r;
        if (z3 == null || colorStateList == null) {
            return;
        }
        z3.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z3) {
        if (this.f36115c1 != z3) {
            this.f36115c1 = z3;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        v vVar = this.f36070C;
        if (isEmpty) {
            if (vVar.f1205x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!vVar.f1205x) {
            setHelperTextEnabled(true);
        }
        vVar.c();
        vVar.f1204w = charSequence;
        vVar.f1206y.setText(charSequence);
        int i = vVar.f1195n;
        if (i != 2) {
            vVar.f1196o = 2;
        }
        vVar.i(i, vVar.f1196o, vVar.h(vVar.f1206y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        v vVar = this.f36070C;
        vVar.f1181A = colorStateList;
        Z z3 = vVar.f1206y;
        if (z3 == null || colorStateList == null) {
            return;
        }
        z3.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z3) {
        v vVar = this.f36070C;
        if (vVar.f1205x == z3) {
            return;
        }
        vVar.c();
        if (z3) {
            Z z6 = new Z(vVar.f1189g, null);
            vVar.f1206y = z6;
            z6.setId(C5275R.id.textinput_helper_text);
            vVar.f1206y.setTextAlignment(5);
            Typeface typeface = vVar.f1182B;
            if (typeface != null) {
                vVar.f1206y.setTypeface(typeface);
            }
            vVar.f1206y.setVisibility(4);
            vVar.f1206y.setAccessibilityLiveRegion(1);
            int i = vVar.f1207z;
            vVar.f1207z = i;
            Z z9 = vVar.f1206y;
            if (z9 != null) {
                z9.setTextAppearance(i);
            }
            ColorStateList colorStateList = vVar.f1181A;
            vVar.f1181A = colorStateList;
            Z z10 = vVar.f1206y;
            if (z10 != null && colorStateList != null) {
                z10.setTextColor(colorStateList);
            }
            vVar.a(vVar.f1206y, 1);
            vVar.f1206y.setAccessibilityDelegate(new u(vVar));
        } else {
            vVar.c();
            int i6 = vVar.f1195n;
            if (i6 == 2) {
                vVar.f1196o = 0;
            }
            vVar.i(i6, vVar.f1196o, vVar.h(vVar.f1206y, ""));
            vVar.g(vVar.f1206y, 1);
            vVar.f1206y = null;
            TextInputLayout textInputLayout = vVar.f1190h;
            textInputLayout.r();
            textInputLayout.x();
        }
        vVar.f1205x = z3;
    }

    public void setHelperTextTextAppearance(int i) {
        v vVar = this.f36070C;
        vVar.f1207z = i;
        Z z3 = vVar.f1206y;
        if (z3 != null) {
            z3.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f36106V) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z3) {
        this.f36116d1 = z3;
    }

    public void setHintEnabled(boolean z3) {
        if (z3 != this.f36106V) {
            this.f36106V = z3;
            if (z3) {
                CharSequence hint = this.f36133w.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f36108W)) {
                        setHint(hint);
                    }
                    this.f36133w.setHint((CharSequence) null);
                }
                this.f36122n0 = true;
            } else {
                this.f36122n0 = false;
                if (!TextUtils.isEmpty(this.f36108W) && TextUtils.isEmpty(this.f36133w.getHint())) {
                    this.f36133w.setHint(this.f36108W);
                }
                setHintInternal(null);
            }
            if (this.f36133w != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        C5234b c5234b = this.f36114b1;
        TextInputLayout textInputLayout = c5234b.f41871a;
        d dVar = new d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.f202j;
        if (colorStateList != null) {
            c5234b.f41886k = colorStateList;
        }
        float f3 = dVar.f203k;
        if (f3 != 0.0f) {
            c5234b.i = f3;
        }
        ColorStateList colorStateList2 = dVar.f194a;
        if (colorStateList2 != null) {
            c5234b.f41866U = colorStateList2;
        }
        c5234b.f41864S = dVar.f198e;
        c5234b.f41865T = dVar.f199f;
        c5234b.f41863R = dVar.f200g;
        c5234b.f41867V = dVar.i;
        B3.a aVar = c5234b.f41900y;
        if (aVar != null) {
            aVar.f188v = true;
        }
        n nVar = new n(c5234b);
        dVar.a();
        c5234b.f41900y = new B3.a(nVar, dVar.f206n);
        dVar.c(textInputLayout.getContext(), c5234b.f41900y);
        c5234b.h(false);
        this.f36095P0 = c5234b.f41886k;
        if (this.f36133w != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f36095P0 != colorStateList) {
            if (this.f36093O0 == null) {
                C5234b c5234b = this.f36114b1;
                if (c5234b.f41886k != colorStateList) {
                    c5234b.f41886k = colorStateList;
                    c5234b.h(false);
                }
            }
            this.f36095P0 = colorStateList;
            if (this.f36133w != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(E e9) {
        this.f36077G = e9;
    }

    public void setMaxEms(int i) {
        this.f36139z = i;
        EditText editText = this.f36133w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.f36068B = i;
        EditText editText = this.f36133w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f36137y = i;
        EditText editText = this.f36133w;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f36066A = i;
        EditText editText = this.f36133w;
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
        r rVar = this.f36131v;
        rVar.f1170z.setContentDescription(i != 0 ? rVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        r rVar = this.f36131v;
        rVar.f1170z.setImageDrawable(i != 0 ? com.bumptech.glide.g.e(rVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z3) {
        r rVar = this.f36131v;
        if (z3 && rVar.f1151B != 1) {
            rVar.g(1);
        } else if (z3) {
            rVar.getClass();
        } else {
            rVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        r rVar = this.f36131v;
        rVar.f1153D = colorStateList;
        t8.g.a(rVar.f1164n, rVar.f1170z, colorStateList, rVar.f1154E);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        r rVar = this.f36131v;
        rVar.f1154E = mode;
        t8.g.a(rVar.f1164n, rVar.f1170z, rVar.f1153D, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f36088M == null) {
            Z z3 = new Z(getContext(), null);
            this.f36088M = z3;
            z3.setId(C5275R.id.textinput_placeholder);
            this.f36088M.setImportantForAccessibility(2);
            C0307h d2 = d();
            this.f36094P = d2;
            d2.f600u = 67L;
            this.f36096Q = d();
            setPlaceholderTextAppearance(this.f36092O);
            setPlaceholderTextColor(this.f36090N);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f36086L) {
                setPlaceholderTextEnabled(true);
            }
            this.f36084K = charSequence;
        }
        EditText editText = this.f36133w;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f36092O = i;
        Z z3 = this.f36088M;
        if (z3 != null) {
            z3.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f36090N != colorStateList) {
            this.f36090N = colorStateList;
            Z z3 = this.f36088M;
            if (z3 == null || colorStateList == null) {
                return;
            }
            z3.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        A a9 = this.f36129u;
        a9.getClass();
        a9.f1090v = TextUtils.isEmpty(charSequence) ? null : charSequence;
        a9.f1089u.setText(charSequence);
        a9.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f36129u.f1089u.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f36129u.f1089u.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f36123o0;
        if (gVar == null || gVar.f766n.f736a == kVar) {
            return;
        }
        this.f36130u0 = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z3) {
        this.f36129u.f1091w.setCheckable(z3);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f36129u.f1091w;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? com.bumptech.glide.g.e(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        A a9 = this.f36129u;
        if (i < 0) {
            a9.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != a9.f1094z) {
            a9.f1094z = i;
            CheckableImageButton checkableImageButton = a9.f1091w;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        A a9 = this.f36129u;
        View.OnLongClickListener onLongClickListener = a9.f1086B;
        CheckableImageButton checkableImageButton = a9.f1091w;
        checkableImageButton.setOnClickListener(onClickListener);
        t8.g.F(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        A a9 = this.f36129u;
        a9.f1086B = onLongClickListener;
        CheckableImageButton checkableImageButton = a9.f1091w;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        t8.g.F(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        A a9 = this.f36129u;
        a9.f1085A = scaleType;
        a9.f1091w.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        A a9 = this.f36129u;
        if (a9.f1092x != colorStateList) {
            a9.f1092x = colorStateList;
            t8.g.a(a9.f1088n, a9.f1091w, colorStateList, a9.f1093y);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        A a9 = this.f36129u;
        if (a9.f1093y != mode) {
            a9.f1093y = mode;
            t8.g.a(a9.f1088n, a9.f1091w, a9.f1092x, mode);
        }
    }

    public void setStartIconVisible(boolean z3) {
        this.f36129u.c(z3);
    }

    public void setSuffixText(CharSequence charSequence) {
        r rVar = this.f36131v;
        rVar.getClass();
        rVar.f1158I = TextUtils.isEmpty(charSequence) ? null : charSequence;
        rVar.J.setText(charSequence);
        rVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f36131v.J.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f36131v.J.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(D d2) {
        EditText editText = this.f36133w;
        if (editText != null) {
            X.o(editText, d2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f36080H0) {
            this.f36080H0 = typeface;
            this.f36114b1.m(typeface);
            v vVar = this.f36070C;
            if (typeface != vVar.f1182B) {
                vVar.f1182B = typeface;
                Z z3 = vVar.f1199r;
                if (z3 != null) {
                    z3.setTypeface(typeface);
                }
                Z z6 = vVar.f1206y;
                if (z6 != null) {
                    z6.setTypeface(typeface);
                }
            }
            Z z9 = this.f36079H;
            if (z9 != null) {
                z9.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f36136x0 != 1) {
            FrameLayout frameLayout = this.f36121n;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c9 = c();
            if (c9 != layoutParams.topMargin) {
                layoutParams.topMargin = c9;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z3, boolean z6) {
        ColorStateList colorStateList;
        Z z9;
        boolean isEnabled = isEnabled();
        EditText editText = this.f36133w;
        boolean z10 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f36133w;
        boolean z11 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f36093O0;
        C5234b c5234b = this.f36114b1;
        if (colorStateList2 != null) {
            c5234b.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f36093O0;
            c5234b.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.f36111Y0) : this.f36111Y0));
        } else if (m()) {
            Z z12 = this.f36070C.f1199r;
            c5234b.i(z12 != null ? z12.getTextColors() : null);
        } else if (this.f36075F && (z9 = this.f36079H) != null) {
            c5234b.i(z9.getTextColors());
        } else if (z11 && (colorStateList = this.f36095P0) != null && c5234b.f41886k != colorStateList) {
            c5234b.f41886k = colorStateList;
            c5234b.h(false);
        }
        r rVar = this.f36131v;
        A a9 = this.f36129u;
        if (z10 || !this.f36115c1 || (isEnabled() && z11)) {
            if (z6 || this.f36113a1) {
                ValueAnimator valueAnimator = this.f36117e1;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f36117e1.cancel();
                }
                if (z3 && this.f36116d1) {
                    a(1.0f);
                } else {
                    c5234b.k(1.0f);
                }
                this.f36113a1 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f36133w;
                v(editText3 != null ? editText3.getText() : null);
                a9.f1087C = false;
                a9.e();
                rVar.f1159K = false;
                rVar.n();
                return;
            }
            return;
        }
        if (z6 || !this.f36113a1) {
            ValueAnimator valueAnimator2 = this.f36117e1;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f36117e1.cancel();
            }
            if (z3 && this.f36116d1) {
                a(0.0f);
            } else {
                c5234b.k(0.0f);
            }
            if (e() && !((h) this.f36123o0).f1122Q.f1120q.isEmpty() && e()) {
                ((h) this.f36123o0).n(0.0f, 0.0f, 0.0f, 0.0f);
            }
            this.f36113a1 = true;
            Z z13 = this.f36088M;
            if (z13 != null && this.f36086L) {
                z13.setText((CharSequence) null);
                s.a(this.f36121n, this.f36096Q);
                this.f36088M.setVisibility(4);
            }
            a9.f1087C = true;
            a9.e();
            rVar.f1159K = true;
            rVar.n();
        }
    }

    public final void v(Editable editable) {
        ((x) this.f36077G).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f36121n;
        if (length != 0 || this.f36113a1) {
            Z z3 = this.f36088M;
            if (z3 == null || !this.f36086L) {
                return;
            }
            z3.setText((CharSequence) null);
            s.a(frameLayout, this.f36096Q);
            this.f36088M.setVisibility(4);
            return;
        }
        if (this.f36088M == null || !this.f36086L || TextUtils.isEmpty(this.f36084K)) {
            return;
        }
        this.f36088M.setText(this.f36084K);
        s.a(frameLayout, this.f36094P);
        this.f36088M.setVisibility(0);
        this.f36088M.bringToFront();
        announceForAccessibility(this.f36084K);
    }

    public final void w(boolean z3, boolean z6) {
        int defaultColor = this.f36103T0.getDefaultColor();
        int colorForState = this.f36103T0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f36103T0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z3) {
            this.C0 = colorForState2;
        } else if (z6) {
            this.C0 = colorForState;
        } else {
            this.C0 = defaultColor;
        }
    }

    public final void x() {
        Z z3;
        EditText editText;
        EditText editText2;
        if (this.f36123o0 == null || this.f36136x0 == 0) {
            return;
        }
        boolean z6 = false;
        boolean z9 = isFocused() || ((editText2 = this.f36133w) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f36133w) != null && editText.isHovered())) {
            z6 = true;
        }
        if (!isEnabled()) {
            this.C0 = this.f36111Y0;
        } else if (m()) {
            if (this.f36103T0 != null) {
                w(z9, z6);
            } else {
                this.C0 = getErrorCurrentTextColors();
            }
        } else if (!this.f36075F || (z3 = this.f36079H) == null) {
            if (z9) {
                this.C0 = this.f36101S0;
            } else if (z6) {
                this.C0 = this.f36099R0;
            } else {
                this.C0 = this.f36097Q0;
            }
        } else if (this.f36103T0 != null) {
            w(z9, z6);
        } else {
            this.C0 = z3.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        r rVar = this.f36131v;
        rVar.l();
        CheckableImageButton checkableImageButton = rVar.f1166v;
        ColorStateList colorStateList = rVar.f1167w;
        TextInputLayout textInputLayout = rVar.f1164n;
        t8.g.C(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = rVar.f1153D;
        CheckableImageButton checkableImageButton2 = rVar.f1170z;
        t8.g.C(textInputLayout, checkableImageButton2, colorStateList2);
        if (rVar.b() instanceof m) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                t8.g.a(textInputLayout, checkableImageButton2, rVar.f1153D, rVar.f1154E);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                H.a.g(mutate, textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        A a9 = this.f36129u;
        t8.g.C(a9.f1088n, a9.f1091w, a9.f1092x);
        if (this.f36136x0 == 2) {
            int i = this.f36140z0;
            if (z9 && isEnabled()) {
                this.f36140z0 = this.f36069B0;
            } else {
                this.f36140z0 = this.f36067A0;
            }
            if (this.f36140z0 != i && e() && !this.f36113a1) {
                if (e()) {
                    ((h) this.f36123o0).n(0.0f, 0.0f, 0.0f, 0.0f);
                }
                j();
            }
        }
        if (this.f36136x0 == 1) {
            if (!isEnabled()) {
                this.f36072D0 = this.f36107V0;
            } else if (z6 && !z9) {
                this.f36072D0 = this.f36110X0;
            } else if (z9) {
                this.f36072D0 = this.f36109W0;
            } else {
                this.f36072D0 = this.f36105U0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f36129u.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f36131v.f1170z.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f36131v.f1170z.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f36131v.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f36131v.f1170z;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        r rVar = this.f36131v;
        CheckableImageButton checkableImageButton = rVar.f1170z;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = rVar.f1153D;
            PorterDuff.Mode mode = rVar.f1154E;
            TextInputLayout textInputLayout = rVar.f1164n;
            t8.g.a(textInputLayout, checkableImageButton, colorStateList, mode);
            t8.g.C(textInputLayout, checkableImageButton, rVar.f1153D);
        }
    }
}
