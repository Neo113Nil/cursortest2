package com.google.android.material.textfield;

import B0.d;
import L0.b;
import L0.c;
import L0.m;
import O.C0031g;
import O.E;
import O.K;
import S0.e;
import S0.f;
import S0.g;
import S0.i;
import S0.j;
import S0.k;
import V0.A;
import V0.B;
import V0.C;
import V0.p;
import V0.s;
import V0.t;
import V0.w;
import V0.y;
import V0.z;
import X0.a;
import a.AbstractC0078a;
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
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
import m.AbstractC0265l0;
import m.C0245b0;
import m.C0281u;
import p0.h;
import p0.q;
import u0.AbstractC0358a;
import v0.AbstractC0360a;

/* loaded from: classes.dex */
public class TextInputLayout extends LinearLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: C0, reason: collision with root package name */
    public static final int[][] f2590C0 = {new int[]{R.attr.state_pressed}, new int[0]};

    /* renamed from: A, reason: collision with root package name */
    public ColorStateList f2591A;

    /* renamed from: A0, reason: collision with root package name */
    public boolean f2592A0;

    /* renamed from: B, reason: collision with root package name */
    public ColorStateList f2593B;

    /* renamed from: B0, reason: collision with root package name */
    public boolean f2594B0;

    /* renamed from: C, reason: collision with root package name */
    public boolean f2595C;

    /* renamed from: D, reason: collision with root package name */
    public CharSequence f2596D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f2597E;

    /* renamed from: F, reason: collision with root package name */
    public g f2598F;

    /* renamed from: G, reason: collision with root package name */
    public g f2599G;

    /* renamed from: H, reason: collision with root package name */
    public StateListDrawable f2600H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f2601I;
    public g J;

    /* renamed from: K, reason: collision with root package name */
    public g f2602K;

    /* renamed from: L, reason: collision with root package name */
    public k f2603L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f2604M;

    /* renamed from: N, reason: collision with root package name */
    public final int f2605N;

    /* renamed from: O, reason: collision with root package name */
    public int f2606O;

    /* renamed from: P, reason: collision with root package name */
    public int f2607P;

    /* renamed from: Q, reason: collision with root package name */
    public int f2608Q;

    /* renamed from: R, reason: collision with root package name */
    public int f2609R;

    /* renamed from: S, reason: collision with root package name */
    public int f2610S;

    /* renamed from: T, reason: collision with root package name */
    public int f2611T;

    /* renamed from: U, reason: collision with root package name */
    public int f2612U;

    /* renamed from: V, reason: collision with root package name */
    public final Rect f2613V;

    /* renamed from: W, reason: collision with root package name */
    public final Rect f2614W;

    /* renamed from: a, reason: collision with root package name */
    public final FrameLayout f2615a;

    /* renamed from: a0, reason: collision with root package name */
    public final RectF f2616a0;

    /* renamed from: b, reason: collision with root package name */
    public final y f2617b;

    /* renamed from: b0, reason: collision with root package name */
    public Typeface f2618b0;

    /* renamed from: c, reason: collision with root package name */
    public final p f2619c;

    /* renamed from: c0, reason: collision with root package name */
    public ColorDrawable f2620c0;

    /* renamed from: d, reason: collision with root package name */
    public EditText f2621d;

    /* renamed from: d0, reason: collision with root package name */
    public int f2622d0;
    public CharSequence e;

    /* renamed from: e0, reason: collision with root package name */
    public final LinkedHashSet f2623e0;

    /* renamed from: f, reason: collision with root package name */
    public int f2624f;

    /* renamed from: f0, reason: collision with root package name */
    public ColorDrawable f2625f0;

    /* renamed from: g, reason: collision with root package name */
    public int f2626g;

    /* renamed from: g0, reason: collision with root package name */
    public int f2627g0;

    /* renamed from: h, reason: collision with root package name */
    public int f2628h;

    /* renamed from: h0, reason: collision with root package name */
    public Drawable f2629h0;
    public int i;

    /* renamed from: i0, reason: collision with root package name */
    public ColorStateList f2630i0;
    public final t j;

    /* renamed from: j0, reason: collision with root package name */
    public ColorStateList f2631j0;

    /* renamed from: k, reason: collision with root package name */
    public boolean f2632k;

    /* renamed from: k0, reason: collision with root package name */
    public int f2633k0;

    /* renamed from: l, reason: collision with root package name */
    public int f2634l;

    /* renamed from: l0, reason: collision with root package name */
    public int f2635l0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f2636m;

    /* renamed from: m0, reason: collision with root package name */
    public int f2637m0;

    /* renamed from: n, reason: collision with root package name */
    public B f2638n;

    /* renamed from: n0, reason: collision with root package name */
    public ColorStateList f2639n0;

    /* renamed from: o, reason: collision with root package name */
    public C0245b0 f2640o;

    /* renamed from: o0, reason: collision with root package name */
    public int f2641o0;

    /* renamed from: p, reason: collision with root package name */
    public int f2642p;

    /* renamed from: p0, reason: collision with root package name */
    public int f2643p0;

    /* renamed from: q, reason: collision with root package name */
    public int f2644q;

    /* renamed from: q0, reason: collision with root package name */
    public int f2645q0;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f2646r;

    /* renamed from: r0, reason: collision with root package name */
    public int f2647r0;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2648s;
    public int s0;

    /* renamed from: t, reason: collision with root package name */
    public C0245b0 f2649t;

    /* renamed from: t0, reason: collision with root package name */
    public int f2650t0;

    /* renamed from: u, reason: collision with root package name */
    public ColorStateList f2651u;

    /* renamed from: u0, reason: collision with root package name */
    public boolean f2652u0;

    /* renamed from: v, reason: collision with root package name */
    public int f2653v;

    /* renamed from: v0, reason: collision with root package name */
    public final b f2654v0;

    /* renamed from: w, reason: collision with root package name */
    public h f2655w;

    /* renamed from: w0, reason: collision with root package name */
    public boolean f2656w0;

    /* renamed from: x, reason: collision with root package name */
    public h f2657x;

    /* renamed from: x0, reason: collision with root package name */
    public boolean f2658x0;

    /* renamed from: y, reason: collision with root package name */
    public ColorStateList f2659y;

    /* renamed from: y0, reason: collision with root package name */
    public ValueAnimator f2660y0;

    /* renamed from: z, reason: collision with root package name */
    public ColorStateList f2661z;
    public boolean z0;

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.textInputStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_Design_TextInputLayout), attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.textInputStyle);
        this.f2624f = -1;
        this.f2626g = -1;
        this.f2628h = -1;
        this.i = -1;
        this.j = new t(this);
        this.f2638n = new C0031g(2);
        this.f2613V = new Rect();
        this.f2614W = new Rect();
        this.f2616a0 = new RectF();
        this.f2623e0 = new LinkedHashSet();
        b bVar = new b(this);
        this.f2654v0 = bVar;
        this.f2594B0 = false;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.f2615a = frameLayout;
        frameLayout.setAddStatesFromChildren(true);
        LinearInterpolator linearInterpolator = AbstractC0360a.f4480a;
        bVar.f456Q = linearInterpolator;
        bVar.h(false);
        bVar.f455P = linearInterpolator;
        bVar.h(false);
        if (bVar.f477g != 8388659) {
            bVar.f477g = 8388659;
            bVar.h(false);
        }
        M0.h h2 = m.h(context2, attributeSet, AbstractC0358a.f4437H, com.lumenpath.harispro.hrnavigator.R.attr.textInputStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_Design_TextInputLayout, 22, 20, 40, 45, 49);
        y yVar = new y(this, h2);
        this.f2617b = yVar;
        TypedArray typedArray = (TypedArray) h2.f617c;
        this.f2595C = typedArray.getBoolean(48, true);
        setHint(typedArray.getText(4));
        this.f2658x0 = typedArray.getBoolean(47, true);
        this.f2656w0 = typedArray.getBoolean(42, true);
        if (typedArray.hasValue(6)) {
            setMinEms(typedArray.getInt(6, -1));
        } else if (typedArray.hasValue(3)) {
            setMinWidth(typedArray.getDimensionPixelSize(3, -1));
        }
        if (typedArray.hasValue(5)) {
            setMaxEms(typedArray.getInt(5, -1));
        } else if (typedArray.hasValue(2)) {
            setMaxWidth(typedArray.getDimensionPixelSize(2, -1));
        }
        this.f2603L = k.b(context2, attributeSet, com.lumenpath.harispro.hrnavigator.R.attr.textInputStyle, com.lumenpath.harispro.hrnavigator.R.style.Widget_Design_TextInputLayout).a();
        this.f2605N = context2.getResources().getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.f2607P = typedArray.getDimensionPixelOffset(9, 0);
        this.f2609R = typedArray.getDimensionPixelSize(16, context2.getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_textinput_box_stroke_width_default));
        this.f2610S = typedArray.getDimensionPixelSize(17, context2.getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.f2608Q = this.f2609R;
        float dimension = typedArray.getDimension(13, -1.0f);
        float dimension2 = typedArray.getDimension(12, -1.0f);
        float dimension3 = typedArray.getDimension(10, -1.0f);
        float dimension4 = typedArray.getDimension(11, -1.0f);
        j e = this.f2603L.e();
        if (dimension >= RecyclerView.f2111C0) {
            e.e = new S0.a(dimension);
        }
        if (dimension2 >= RecyclerView.f2111C0) {
            e.f1100f = new S0.a(dimension2);
        }
        if (dimension3 >= RecyclerView.f2111C0) {
            e.f1101g = new S0.a(dimension3);
        }
        if (dimension4 >= RecyclerView.f2111C0) {
            e.f1102h = new S0.a(dimension4);
        }
        this.f2603L = e.a();
        ColorStateList A2 = AbstractC0078a.A(context2, h2, 7);
        if (A2 != null) {
            int defaultColor = A2.getDefaultColor();
            this.f2641o0 = defaultColor;
            this.f2612U = defaultColor;
            if (A2.isStateful()) {
                this.f2643p0 = A2.getColorForState(new int[]{-16842910}, -1);
                this.f2645q0 = A2.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
                this.f2647r0 = A2.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            } else {
                this.f2645q0 = this.f2641o0;
                ColorStateList z2 = AbstractC0078a.z(context2, com.lumenpath.harispro.hrnavigator.R.color.mtrl_filled_background_color);
                this.f2643p0 = z2.getColorForState(new int[]{-16842910}, -1);
                this.f2647r0 = z2.getColorForState(new int[]{R.attr.state_hovered}, -1);
            }
        } else {
            this.f2612U = 0;
            this.f2641o0 = 0;
            this.f2643p0 = 0;
            this.f2645q0 = 0;
            this.f2647r0 = 0;
        }
        if (typedArray.hasValue(1)) {
            ColorStateList b2 = h2.b(1);
            this.f2631j0 = b2;
            this.f2630i0 = b2;
        }
        ColorStateList A3 = AbstractC0078a.A(context2, h2, 14);
        this.f2637m0 = typedArray.getColor(14, 0);
        this.f2633k0 = context2.getColor(com.lumenpath.harispro.hrnavigator.R.color.mtrl_textinput_default_box_stroke_color);
        this.s0 = context2.getColor(com.lumenpath.harispro.hrnavigator.R.color.mtrl_textinput_disabled_color);
        this.f2635l0 = context2.getColor(com.lumenpath.harispro.hrnavigator.R.color.mtrl_textinput_hovered_box_stroke_color);
        if (A3 != null) {
            setBoxStrokeColorStateList(A3);
        }
        if (typedArray.hasValue(15)) {
            setBoxStrokeErrorColor(AbstractC0078a.A(context2, h2, 15));
        }
        if (typedArray.getResourceId(49, -1) != -1) {
            setHintTextAppearance(typedArray.getResourceId(49, 0));
        }
        this.f2591A = h2.b(24);
        this.f2593B = h2.b(25);
        int resourceId = typedArray.getResourceId(40, 0);
        CharSequence text = typedArray.getText(35);
        int i = typedArray.getInt(34, 1);
        boolean z3 = typedArray.getBoolean(36, false);
        int resourceId2 = typedArray.getResourceId(45, 0);
        boolean z4 = typedArray.getBoolean(44, false);
        CharSequence text2 = typedArray.getText(43);
        int resourceId3 = typedArray.getResourceId(57, 0);
        CharSequence text3 = typedArray.getText(56);
        boolean z5 = typedArray.getBoolean(18, false);
        setCounterMaxLength(typedArray.getInt(19, -1));
        this.f2644q = typedArray.getResourceId(22, 0);
        this.f2642p = typedArray.getResourceId(20, 0);
        setBoxBackgroundMode(typedArray.getInt(8, 0));
        setErrorContentDescription(text);
        setErrorAccessibilityLiveRegion(i);
        setCounterOverflowTextAppearance(this.f2642p);
        setHelperTextTextAppearance(resourceId2);
        setErrorTextAppearance(resourceId);
        setCounterTextAppearance(this.f2644q);
        setPlaceholderText(text3);
        setPlaceholderTextAppearance(resourceId3);
        if (typedArray.hasValue(41)) {
            setErrorTextColor(h2.b(41));
        }
        if (typedArray.hasValue(46)) {
            setHelperTextColor(h2.b(46));
        }
        if (typedArray.hasValue(50)) {
            setHintTextColor(h2.b(50));
        }
        if (typedArray.hasValue(23)) {
            setCounterTextColor(h2.b(23));
        }
        if (typedArray.hasValue(21)) {
            setCounterOverflowTextColor(h2.b(21));
        }
        if (typedArray.hasValue(58)) {
            setPlaceholderTextColor(h2.b(58));
        }
        p pVar = new p(this, h2);
        this.f2619c = pVar;
        boolean z6 = typedArray.getBoolean(0, true);
        h2.l();
        setImportantForAccessibility(2);
        E.b(this, 1);
        frameLayout.addView(yVar);
        frameLayout.addView(pVar);
        addView(frameLayout);
        setEnabled(z6);
        setHelperTextEnabled(z4);
        setErrorEnabled(z3);
        setCounterEnabled(z5);
        setHelperText(text2);
    }

    private Drawable getEditTextBoxBackground() {
        EditText editText = this.f2621d;
        if (!(editText instanceof AutoCompleteTextView) || R.j.M(editText)) {
            return this.f2598F;
        }
        int y2 = AbstractC0078a.y(this.f2621d, com.lumenpath.harispro.hrnavigator.R.attr.colorControlHighlight);
        int i = this.f2606O;
        int[][] iArr = f2590C0;
        if (i != 2) {
            if (i != 1) {
                return null;
            }
            g gVar = this.f2598F;
            int i2 = this.f2612U;
            return new RippleDrawable(new ColorStateList(iArr, new int[]{AbstractC0078a.O(y2, i2, 0.1f), i2}), gVar, gVar);
        }
        Context context = getContext();
        g gVar2 = this.f2598F;
        TypedValue Y2 = AbstractC0078a.Y(context, com.lumenpath.harispro.hrnavigator.R.attr.colorSurface, "TextInputLayout");
        int i3 = Y2.resourceId;
        int color = i3 != 0 ? context.getColor(i3) : Y2.data;
        g gVar3 = new g(gVar2.f1076a.f1062a);
        int O2 = AbstractC0078a.O(y2, color, 0.1f);
        gVar3.m(new ColorStateList(iArr, new int[]{O2, 0}));
        gVar3.setTint(color);
        ColorStateList colorStateList = new ColorStateList(iArr, new int[]{O2, color});
        g gVar4 = new g(gVar2.f1076a.f1062a);
        gVar4.setTint(-1);
        return new LayerDrawable(new Drawable[]{new RippleDrawable(colorStateList, gVar3, gVar4), gVar2});
    }

    private Drawable getOrCreateFilledDropDownMenuBackground() {
        if (this.f2600H == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            this.f2600H = stateListDrawable;
            stateListDrawable.addState(new int[]{R.attr.state_above_anchor}, getOrCreateOutlinedDropDownMenuBackground());
            this.f2600H.addState(new int[0], f(false));
        }
        return this.f2600H;
    }

    private Drawable getOrCreateOutlinedDropDownMenuBackground() {
        if (this.f2599G == null) {
            this.f2599G = f(true);
        }
        return this.f2599G;
    }

    public static void k(ViewGroup viewGroup, boolean z2) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z2);
            if (childAt instanceof ViewGroup) {
                k((ViewGroup) childAt, z2);
            }
        }
    }

    private void setEditText(EditText editText) {
        if (this.f2621d != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (getEndIconMode() != 3 && !(editText instanceof TextInputEditText)) {
            Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.f2621d = editText;
        int i = this.f2624f;
        if (i != -1) {
            setMinEms(i);
        } else {
            setMinWidth(this.f2628h);
        }
        int i2 = this.f2626g;
        if (i2 != -1) {
            setMaxEms(i2);
        } else {
            setMaxWidth(this.i);
        }
        this.f2601I = false;
        i();
        setTextInputAccessibilityDelegate(new A(this));
        Typeface typeface = this.f2621d.getTypeface();
        b bVar = this.f2654v0;
        bVar.m(typeface);
        float textSize = this.f2621d.getTextSize();
        if (bVar.f478h != textSize) {
            bVar.f478h = textSize;
            bVar.h(false);
        }
        int i3 = Build.VERSION.SDK_INT;
        float letterSpacing = this.f2621d.getLetterSpacing();
        if (bVar.f462W != letterSpacing) {
            bVar.f462W = letterSpacing;
            bVar.h(false);
        }
        int gravity = this.f2621d.getGravity();
        int i4 = (gravity & (-113)) | 48;
        if (bVar.f477g != i4) {
            bVar.f477g = i4;
            bVar.h(false);
        }
        if (bVar.f475f != gravity) {
            bVar.f475f = gravity;
            bVar.h(false);
        }
        WeakHashMap weakHashMap = K.f747a;
        this.f2650t0 = editText.getMinimumHeight();
        this.f2621d.addTextChangedListener(new z(this, editText));
        if (this.f2630i0 == null) {
            this.f2630i0 = this.f2621d.getHintTextColors();
        }
        if (this.f2595C) {
            if (TextUtils.isEmpty(this.f2596D)) {
                CharSequence hint = this.f2621d.getHint();
                this.e = hint;
                setHint(hint);
                this.f2621d.setHint((CharSequence) null);
            }
            this.f2597E = true;
        }
        if (i3 >= 29) {
            p();
        }
        if (this.f2640o != null) {
            n(this.f2621d.getText());
        }
        r();
        this.j.b();
        this.f2617b.bringToFront();
        p pVar = this.f2619c;
        pVar.bringToFront();
        Iterator it = this.f2623e0.iterator();
        while (it.hasNext()) {
            ((V0.m) it.next()).a(this);
        }
        pVar.m();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        u(false, true);
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.f2596D)) {
            return;
        }
        this.f2596D = charSequence;
        b bVar = this.f2654v0;
        if (charSequence == null || !TextUtils.equals(bVar.f441A, charSequence)) {
            bVar.f441A = charSequence;
            bVar.f442B = null;
            Bitmap bitmap = bVar.f445E;
            if (bitmap != null) {
                bitmap.recycle();
                bVar.f445E = null;
            }
            bVar.h(false);
        }
        if (this.f2652u0) {
            return;
        }
        j();
    }

    private void setPlaceholderTextEnabled(boolean z2) {
        if (this.f2648s == z2) {
            return;
        }
        if (z2) {
            C0245b0 c0245b0 = this.f2649t;
            if (c0245b0 != null) {
                this.f2615a.addView(c0245b0);
                this.f2649t.setVisibility(0);
            }
        } else {
            C0245b0 c0245b02 = this.f2649t;
            if (c0245b02 != null) {
                c0245b02.setVisibility(8);
            }
            this.f2649t = null;
        }
        this.f2648s = z2;
    }

    public final void a(float f2) {
        int i = 2;
        b bVar = this.f2654v0;
        if (bVar.f468b == f2) {
            return;
        }
        if (this.f2660y0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f2660y0 = valueAnimator;
            valueAnimator.setInterpolator(AbstractC0078a.X(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.motionEasingEmphasizedInterpolator, AbstractC0360a.f4481b));
            this.f2660y0.setDuration(AbstractC0078a.W(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.motionDurationMedium4, 167));
            this.f2660y0.addUpdateListener(new d(i, this));
        }
        this.f2660y0.setFloatValues(bVar.f468b, f2);
        this.f2660y0.start();
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        FrameLayout frameLayout = this.f2615a;
        frameLayout.addView(view, layoutParams2);
        frameLayout.setLayoutParams(layoutParams);
        t();
        setEditText((EditText) view);
    }

    public final void b() {
        int i;
        int i2;
        g gVar = this.f2598F;
        if (gVar == null) {
            return;
        }
        k kVar = gVar.f1076a.f1062a;
        k kVar2 = this.f2603L;
        if (kVar != kVar2) {
            gVar.setShapeAppearanceModel(kVar2);
        }
        if (this.f2606O == 2 && (i = this.f2608Q) > -1 && (i2 = this.f2611T) != 0) {
            g gVar2 = this.f2598F;
            gVar2.f1076a.j = i;
            gVar2.invalidateSelf();
            ColorStateList valueOf = ColorStateList.valueOf(i2);
            f fVar = gVar2.f1076a;
            if (fVar.f1065d != valueOf) {
                fVar.f1065d = valueOf;
                gVar2.onStateChange(gVar2.getState());
            }
        }
        int i3 = this.f2612U;
        if (this.f2606O == 1) {
            i3 = G.a.b(this.f2612U, AbstractC0078a.x(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.colorSurface, 0));
        }
        this.f2612U = i3;
        this.f2598F.m(ColorStateList.valueOf(i3));
        g gVar3 = this.J;
        if (gVar3 != null && this.f2602K != null) {
            if (this.f2608Q > -1 && this.f2611T != 0) {
                gVar3.m(this.f2621d.isFocused() ? ColorStateList.valueOf(this.f2633k0) : ColorStateList.valueOf(this.f2611T));
                this.f2602K.m(ColorStateList.valueOf(this.f2611T));
            }
            invalidate();
        }
        s();
    }

    public final int c() {
        float d2;
        if (!this.f2595C) {
            return 0;
        }
        int i = this.f2606O;
        b bVar = this.f2654v0;
        if (i == 0) {
            d2 = bVar.d();
        } else {
            if (i != 2) {
                return 0;
            }
            d2 = bVar.d() / 2.0f;
        }
        return (int) d2;
    }

    public final h d() {
        h hVar = new h();
        hVar.f4186c = AbstractC0078a.W(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.motionDurationShort2, 87);
        hVar.f4187d = AbstractC0078a.X(getContext(), com.lumenpath.harispro.hrnavigator.R.attr.motionEasingLinearInterpolator, AbstractC0360a.f4480a);
        return hVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f2621d;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.e != null) {
            boolean z2 = this.f2597E;
            this.f2597E = false;
            CharSequence hint = editText.getHint();
            this.f2621d.setHint(this.e);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f2621d.setHint(hint);
                this.f2597E = z2;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        FrameLayout frameLayout = this.f2615a;
        viewStructure.setChildCount(frameLayout.getChildCount());
        for (int i2 = 0; i2 < frameLayout.getChildCount(); i2++) {
            View childAt = frameLayout.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f2621d) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchRestoreInstanceState(SparseArray sparseArray) {
        this.f2592A0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f2592A0 = false;
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        g gVar;
        int i;
        super.draw(canvas);
        boolean z2 = this.f2595C;
        b bVar = this.f2654v0;
        if (z2) {
            bVar.getClass();
            int save = canvas.save();
            if (bVar.f442B != null) {
                RectF rectF = bVar.e;
                if (rectF.width() > RecyclerView.f2111C0 && rectF.height() > RecyclerView.f2111C0) {
                    TextPaint textPaint = bVar.f453N;
                    textPaint.setTextSize(bVar.f447G);
                    float f2 = bVar.f484p;
                    float f3 = bVar.f485q;
                    float f4 = bVar.f446F;
                    if (f4 != 1.0f) {
                        canvas.scale(f4, f4, f2, f3);
                    }
                    if (bVar.f473d0 <= 1 || bVar.f443C) {
                        canvas.translate(f2, f3);
                        bVar.f464Y.draw(canvas);
                    } else {
                        float lineStart = bVar.f484p - bVar.f464Y.getLineStart(0);
                        int alpha = textPaint.getAlpha();
                        canvas.translate(lineStart, f3);
                        float f5 = alpha;
                        textPaint.setAlpha((int) (bVar.f469b0 * f5));
                        int i2 = Build.VERSION.SDK_INT;
                        if (i2 >= 31) {
                            float f6 = bVar.f448H;
                            float f7 = bVar.f449I;
                            float f8 = bVar.J;
                            int i3 = bVar.f450K;
                            textPaint.setShadowLayer(f6, f7, f8, G.a.d(i3, (textPaint.getAlpha() * Color.alpha(i3)) / 255));
                        }
                        bVar.f464Y.draw(canvas);
                        textPaint.setAlpha((int) (bVar.f467a0 * f5));
                        if (i2 >= 31) {
                            float f9 = bVar.f448H;
                            float f10 = bVar.f449I;
                            float f11 = bVar.J;
                            int i4 = bVar.f450K;
                            textPaint.setShadowLayer(f9, f10, f11, G.a.d(i4, (Color.alpha(i4) * textPaint.getAlpha()) / 255));
                        }
                        int lineBaseline = bVar.f464Y.getLineBaseline(0);
                        CharSequence charSequence = bVar.f471c0;
                        float f12 = lineBaseline;
                        canvas.drawText(charSequence, 0, charSequence.length(), RecyclerView.f2111C0, f12, textPaint);
                        if (i2 >= 31) {
                            textPaint.setShadowLayer(bVar.f448H, bVar.f449I, bVar.J, bVar.f450K);
                        }
                        String trim = bVar.f471c0.toString().trim();
                        if (trim.endsWith("…")) {
                            i = 0;
                            trim = trim.substring(0, trim.length() - 1);
                        } else {
                            i = 0;
                        }
                        String str = trim;
                        textPaint.setAlpha(alpha);
                        canvas.drawText(str, 0, Math.min(bVar.f464Y.getLineEnd(i), str.length()), RecyclerView.f2111C0, f12, (Paint) textPaint);
                    }
                    canvas.restoreToCount(save);
                }
            }
        }
        if (this.f2602K == null || (gVar = this.J) == null) {
            return;
        }
        gVar.draw(canvas);
        if (this.f2621d.isFocused()) {
            Rect bounds = this.f2602K.getBounds();
            Rect bounds2 = this.J.getBounds();
            float f13 = bVar.f468b;
            int centerX = bounds2.centerX();
            bounds.left = AbstractC0360a.c(centerX, bounds2.left, f13);
            bounds.right = AbstractC0360a.c(centerX, bounds2.right, f13);
            this.f2602K.draw(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004f  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void drawableStateChanged() {
        boolean z2;
        ColorStateList colorStateList;
        if (this.z0) {
            return;
        }
        this.z0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        b bVar = this.f2654v0;
        if (bVar != null) {
            bVar.f451L = drawableState;
            ColorStateList colorStateList2 = bVar.f479k;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = bVar.j) != null && colorStateList.isStateful())) {
                bVar.h(false);
                z2 = true;
                if (this.f2621d != null) {
                    WeakHashMap weakHashMap = K.f747a;
                    u(isLaidOut() && isEnabled(), false);
                }
                r();
                x();
                if (z2) {
                    invalidate();
                }
                this.z0 = false;
            }
        }
        z2 = false;
        if (this.f2621d != null) {
        }
        r();
        x();
        if (z2) {
        }
        this.z0 = false;
    }

    public final boolean e() {
        return this.f2595C && !TextUtils.isEmpty(this.f2596D) && (this.f2598F instanceof V0.h);
    }

    public final g f(boolean z2) {
        int i = 0;
        float dimensionPixelOffset = getResources().getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_shape_corner_size_small_component);
        float f2 = z2 ? dimensionPixelOffset : RecyclerView.f2111C0;
        EditText editText = this.f2621d;
        float popupElevation = editText instanceof w ? ((w) editText).getPopupElevation() : getResources().getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.m3_comp_outlined_autocomplete_menu_container_elevation);
        int dimensionPixelOffset2 = getResources().getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_exposed_dropdown_menu_popup_vertical_padding);
        i iVar = new i();
        i iVar2 = new i();
        i iVar3 = new i();
        i iVar4 = new i();
        e eVar = new e(i);
        e eVar2 = new e(i);
        e eVar3 = new e(i);
        e eVar4 = new e(i);
        S0.a aVar = new S0.a(f2);
        S0.a aVar2 = new S0.a(f2);
        S0.a aVar3 = new S0.a(dimensionPixelOffset);
        S0.a aVar4 = new S0.a(dimensionPixelOffset);
        k kVar = new k();
        kVar.f1105a = iVar;
        kVar.f1106b = iVar2;
        kVar.f1107c = iVar3;
        kVar.f1108d = iVar4;
        kVar.e = aVar;
        kVar.f1109f = aVar2;
        kVar.f1110g = aVar4;
        kVar.f1111h = aVar3;
        kVar.i = eVar;
        kVar.j = eVar2;
        kVar.f1112k = eVar3;
        kVar.f1113l = eVar4;
        EditText editText2 = this.f2621d;
        ColorStateList dropDownBackgroundTintList = editText2 instanceof w ? ((w) editText2).getDropDownBackgroundTintList() : null;
        Context context = getContext();
        if (dropDownBackgroundTintList == null) {
            Paint paint = g.f1075w;
            TypedValue Y2 = AbstractC0078a.Y(context, com.lumenpath.harispro.hrnavigator.R.attr.colorSurface, g.class.getSimpleName());
            int i2 = Y2.resourceId;
            dropDownBackgroundTintList = ColorStateList.valueOf(i2 != 0 ? context.getColor(i2) : Y2.data);
        }
        g gVar = new g();
        gVar.j(context);
        gVar.m(dropDownBackgroundTintList);
        gVar.l(popupElevation);
        gVar.setShapeAppearanceModel(kVar);
        f fVar = gVar.f1076a;
        if (fVar.f1067g == null) {
            fVar.f1067g = new Rect();
        }
        gVar.f1076a.f1067g.set(0, dimensionPixelOffset2, 0, dimensionPixelOffset2);
        gVar.invalidateSelf();
        return gVar;
    }

    public final int g(int i, boolean z2) {
        return ((z2 || getPrefixText() == null) ? (!z2 || getSuffixText() == null) ? this.f2621d.getCompoundPaddingLeft() : this.f2619c.c() : this.f2617b.a()) + i;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f2621d;
        if (editText == null) {
            return super.getBaseline();
        }
        return c() + getPaddingTop() + editText.getBaseline();
    }

    public g getBoxBackground() {
        int i = this.f2606O;
        if (i == 1 || i == 2) {
            return this.f2598F;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.f2612U;
    }

    public int getBoxBackgroundMode() {
        return this.f2606O;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f2607P;
    }

    public float getBoxCornerRadiusBottomEnd() {
        boolean f2 = m.f(this);
        RectF rectF = this.f2616a0;
        return f2 ? this.f2603L.f1111h.a(rectF) : this.f2603L.f1110g.a(rectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        boolean f2 = m.f(this);
        RectF rectF = this.f2616a0;
        return f2 ? this.f2603L.f1110g.a(rectF) : this.f2603L.f1111h.a(rectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        boolean f2 = m.f(this);
        RectF rectF = this.f2616a0;
        return f2 ? this.f2603L.e.a(rectF) : this.f2603L.f1109f.a(rectF);
    }

    public float getBoxCornerRadiusTopStart() {
        boolean f2 = m.f(this);
        RectF rectF = this.f2616a0;
        return f2 ? this.f2603L.f1109f.a(rectF) : this.f2603L.e.a(rectF);
    }

    public int getBoxStrokeColor() {
        return this.f2637m0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f2639n0;
    }

    public int getBoxStrokeWidth() {
        return this.f2609R;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f2610S;
    }

    public int getCounterMaxLength() {
        return this.f2634l;
    }

    public CharSequence getCounterOverflowDescription() {
        C0245b0 c0245b0;
        if (this.f2632k && this.f2636m && (c0245b0 = this.f2640o) != null) {
            return c0245b0.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f2661z;
    }

    public ColorStateList getCounterTextColor() {
        return this.f2659y;
    }

    public ColorStateList getCursorColor() {
        return this.f2591A;
    }

    public ColorStateList getCursorErrorColor() {
        return this.f2593B;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f2630i0;
    }

    public EditText getEditText() {
        return this.f2621d;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f2619c.f1304g.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f2619c.f1304g.getDrawable();
    }

    public int getEndIconMinSize() {
        return this.f2619c.f1308m;
    }

    public int getEndIconMode() {
        return this.f2619c.i;
    }

    public ImageView.ScaleType getEndIconScaleType() {
        return this.f2619c.f1309n;
    }

    public CheckableImageButton getEndIconView() {
        return this.f2619c.f1304g;
    }

    public CharSequence getError() {
        t tVar = this.j;
        if (tVar.f1342q) {
            return tVar.f1341p;
        }
        return null;
    }

    public int getErrorAccessibilityLiveRegion() {
        return this.j.f1345t;
    }

    public CharSequence getErrorContentDescription() {
        return this.j.f1344s;
    }

    public int getErrorCurrentTextColors() {
        C0245b0 c0245b0 = this.j.f1343r;
        if (c0245b0 != null) {
            return c0245b0.getCurrentTextColor();
        }
        return -1;
    }

    public Drawable getErrorIconDrawable() {
        return this.f2619c.f1301c.getDrawable();
    }

    public CharSequence getHelperText() {
        t tVar = this.j;
        if (tVar.f1349x) {
            return tVar.f1348w;
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        C0245b0 c0245b0 = this.j.f1350y;
        if (c0245b0 != null) {
            return c0245b0.getCurrentTextColor();
        }
        return -1;
    }

    public CharSequence getHint() {
        if (this.f2595C) {
            return this.f2596D;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.f2654v0.d();
    }

    public final int getHintCurrentCollapsedTextColor() {
        b bVar = this.f2654v0;
        return bVar.e(bVar.f479k);
    }

    public ColorStateList getHintTextColor() {
        return this.f2631j0;
    }

    public B getLengthCounter() {
        return this.f2638n;
    }

    public int getMaxEms() {
        return this.f2626g;
    }

    public int getMaxWidth() {
        return this.i;
    }

    public int getMinEms() {
        return this.f2624f;
    }

    public int getMinWidth() {
        return this.f2628h;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f2619c.f1304g.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f2619c.f1304g.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f2648s) {
            return this.f2646r;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f2653v;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f2651u;
    }

    public CharSequence getPrefixText() {
        return this.f2617b.f1366c;
    }

    public ColorStateList getPrefixTextColor() {
        return this.f2617b.f1365b.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.f2617b.f1365b;
    }

    public k getShapeAppearanceModel() {
        return this.f2603L;
    }

    public CharSequence getStartIconContentDescription() {
        return this.f2617b.f1367d.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.f2617b.f1367d.getDrawable();
    }

    public int getStartIconMinSize() {
        return this.f2617b.f1369g;
    }

    public ImageView.ScaleType getStartIconScaleType() {
        return this.f2617b.f1370h;
    }

    public CharSequence getSuffixText() {
        return this.f2619c.f1311p;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f2619c.f1312q.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f2619c.f1312q;
    }

    public Typeface getTypeface() {
        return this.f2618b0;
    }

    public final int h(int i, boolean z2) {
        return i - ((z2 || getSuffixText() == null) ? (!z2 || getPrefixText() == null) ? this.f2621d.getCompoundPaddingRight() : this.f2617b.a() : this.f2619c.c());
    }

    public final void i() {
        int i = this.f2606O;
        if (i == 0) {
            this.f2598F = null;
            this.J = null;
            this.f2602K = null;
        } else if (i == 1) {
            this.f2598F = new g(this.f2603L);
            this.J = new g();
            this.f2602K = new g();
        } else {
            if (i != 2) {
                throw new IllegalArgumentException(this.f2606O + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            if (!this.f2595C || (this.f2598F instanceof V0.h)) {
                this.f2598F = new g(this.f2603L);
            } else {
                k kVar = this.f2603L;
                int i2 = V0.h.f1276y;
                if (kVar == null) {
                    kVar = new k();
                }
                V0.g gVar = new V0.g(kVar, new RectF());
                V0.h hVar = new V0.h(gVar);
                hVar.f1277x = gVar;
                this.f2598F = hVar;
            }
            this.J = null;
            this.f2602K = null;
        }
        s();
        x();
        if (this.f2606O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                this.f2607P = getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.material_font_2_0_box_collapsed_padding_top);
            } else if (AbstractC0078a.M(getContext())) {
                this.f2607P = getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.material_font_1_3_box_collapsed_padding_top);
            }
        }
        if (this.f2621d != null && this.f2606O == 1) {
            if (getContext().getResources().getConfiguration().fontScale >= 2.0f) {
                EditText editText = this.f2621d;
                WeakHashMap weakHashMap = K.f747a;
                editText.setPaddingRelative(editText.getPaddingStart(), getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.material_filled_edittext_font_2_0_padding_top), this.f2621d.getPaddingEnd(), getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.material_filled_edittext_font_2_0_padding_bottom));
            } else if (AbstractC0078a.M(getContext())) {
                EditText editText2 = this.f2621d;
                WeakHashMap weakHashMap2 = K.f747a;
                editText2.setPaddingRelative(editText2.getPaddingStart(), getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.material_filled_edittext_font_1_3_padding_top), this.f2621d.getPaddingEnd(), getResources().getDimensionPixelSize(com.lumenpath.harispro.hrnavigator.R.dimen.material_filled_edittext_font_1_3_padding_bottom));
            }
        }
        if (this.f2606O != 0) {
            t();
        }
        EditText editText3 = this.f2621d;
        if (editText3 instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText3;
            if (autoCompleteTextView.getDropDownBackground() == null) {
                int i3 = this.f2606O;
                if (i3 == 2) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateOutlinedDropDownMenuBackground());
                } else if (i3 == 1) {
                    autoCompleteTextView.setDropDownBackgroundDrawable(getOrCreateFilledDropDownMenuBackground());
                }
            }
        }
    }

    public final void j() {
        float f2;
        float f3;
        float f4;
        RectF rectF;
        float f5;
        int i;
        int i2;
        if (e()) {
            int width = this.f2621d.getWidth();
            int gravity = this.f2621d.getGravity();
            b bVar = this.f2654v0;
            boolean b2 = bVar.b(bVar.f441A);
            bVar.f443C = b2;
            Rect rect = bVar.f472d;
            if (gravity != 17 && (gravity & 7) != 1) {
                if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (b2) {
                        i2 = rect.left;
                        f4 = i2;
                    } else {
                        f2 = rect.right;
                        f3 = bVar.f465Z;
                    }
                } else if (b2) {
                    f2 = rect.right;
                    f3 = bVar.f465Z;
                } else {
                    i2 = rect.left;
                    f4 = i2;
                }
                float max = Math.max(f4, rect.left);
                rectF = this.f2616a0;
                rectF.left = max;
                rectF.top = rect.top;
                if (gravity != 17 || (gravity & 7) == 1) {
                    f5 = (width / 2.0f) + (bVar.f465Z / 2.0f);
                } else if ((gravity & 8388613) == 8388613 || (gravity & 5) == 5) {
                    if (bVar.f443C) {
                        f5 = max + bVar.f465Z;
                    } else {
                        i = rect.right;
                        f5 = i;
                    }
                } else if (bVar.f443C) {
                    i = rect.right;
                    f5 = i;
                } else {
                    f5 = bVar.f465Z + max;
                }
                rectF.right = Math.min(f5, rect.right);
                rectF.bottom = bVar.d() + rect.top;
                if (rectF.width() > RecyclerView.f2111C0 || rectF.height() <= RecyclerView.f2111C0) {
                }
                float f6 = rectF.left;
                float f7 = this.f2605N;
                rectF.left = f6 - f7;
                rectF.right += f7;
                rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f2608Q);
                V0.h hVar = (V0.h) this.f2598F;
                hVar.getClass();
                hVar.s(rectF.left, rectF.top, rectF.right, rectF.bottom);
                return;
            }
            f2 = width / 2.0f;
            f3 = bVar.f465Z / 2.0f;
            f4 = f2 - f3;
            float max2 = Math.max(f4, rect.left);
            rectF = this.f2616a0;
            rectF.left = max2;
            rectF.top = rect.top;
            if (gravity != 17) {
            }
            f5 = (width / 2.0f) + (bVar.f465Z / 2.0f);
            rectF.right = Math.min(f5, rect.right);
            rectF.bottom = bVar.d() + rect.top;
            if (rectF.width() > RecyclerView.f2111C0) {
            }
        }
    }

    public final void l(C0245b0 c0245b0, int i) {
        try {
            c0245b0.setTextAppearance(i);
            if (c0245b0.getTextColors().getDefaultColor() != -65281) {
                return;
            }
        } catch (Exception unused) {
        }
        c0245b0.setTextAppearance(com.lumenpath.harispro.hrnavigator.R.style.TextAppearance_AppCompat_Caption);
        c0245b0.setTextColor(getContext().getColor(com.lumenpath.harispro.hrnavigator.R.color.design_error));
    }

    public final boolean m() {
        t tVar = this.j;
        return (tVar.f1340o != 1 || tVar.f1343r == null || TextUtils.isEmpty(tVar.f1341p)) ? false : true;
    }

    public final void n(Editable editable) {
        ((C0031g) this.f2638n).getClass();
        int length = editable != null ? editable.length() : 0;
        boolean z2 = this.f2636m;
        int i = this.f2634l;
        String str = null;
        if (i == -1) {
            this.f2640o.setText(String.valueOf(length));
            this.f2640o.setContentDescription(null);
            this.f2636m = false;
        } else {
            this.f2636m = length > i;
            Context context = getContext();
            this.f2640o.setContentDescription(context.getString(this.f2636m ? com.lumenpath.harispro.hrnavigator.R.string.character_counter_overflowed_content_description : com.lumenpath.harispro.hrnavigator.R.string.character_counter_content_description, Integer.valueOf(length), Integer.valueOf(this.f2634l)));
            if (z2 != this.f2636m) {
                o();
            }
            String str2 = M.b.f592b;
            M.b bVar = TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1 ? M.b.e : M.b.f594d;
            C0245b0 c0245b0 = this.f2640o;
            String string = getContext().getString(com.lumenpath.harispro.hrnavigator.R.string.character_counter_pattern, Integer.valueOf(length), Integer.valueOf(this.f2634l));
            if (string == null) {
                bVar.getClass();
            } else {
                bVar.getClass();
                B0.e eVar = M.g.f601a;
                str = bVar.c(string).toString();
            }
            c0245b0.setText(str);
        }
        if (this.f2621d == null || z2 == this.f2636m) {
            return;
        }
        u(false, false);
        x();
        r();
    }

    public final void o() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        C0245b0 c0245b0 = this.f2640o;
        if (c0245b0 != null) {
            l(c0245b0, this.f2636m ? this.f2642p : this.f2644q);
            if (!this.f2636m && (colorStateList2 = this.f2659y) != null) {
                this.f2640o.setTextColor(colorStateList2);
            }
            if (!this.f2636m || (colorStateList = this.f2661z) == null) {
                return;
            }
            this.f2640o.setTextColor(colorStateList);
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f2654v0.g(configuration);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int max;
        p pVar = this.f2619c;
        pVar.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        boolean z2 = false;
        this.f2594B0 = false;
        if (this.f2621d != null && this.f2621d.getMeasuredHeight() < (max = Math.max(pVar.getMeasuredHeight(), this.f2617b.getMeasuredHeight()))) {
            this.f2621d.setMinimumHeight(max);
            z2 = true;
        }
        boolean q2 = q();
        if (z2 || q2) {
            this.f2621d.post(new D.a(7, this));
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        EditText editText = this.f2621d;
        if (editText != null) {
            ThreadLocal threadLocal = c.f495a;
            int width = editText.getWidth();
            int height = editText.getHeight();
            Rect rect = this.f2613V;
            rect.set(0, 0, width, height);
            ThreadLocal threadLocal2 = c.f495a;
            Matrix matrix = (Matrix) threadLocal2.get();
            if (matrix == null) {
                matrix = new Matrix();
                threadLocal2.set(matrix);
            } else {
                matrix.reset();
            }
            c.a(this, editText, matrix);
            ThreadLocal threadLocal3 = c.f496b;
            RectF rectF = (RectF) threadLocal3.get();
            if (rectF == null) {
                rectF = new RectF();
                threadLocal3.set(rectF);
            }
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
            g gVar = this.J;
            if (gVar != null) {
                int i5 = rect.bottom;
                gVar.setBounds(rect.left, i5 - this.f2609R, rect.right, i5);
            }
            g gVar2 = this.f2602K;
            if (gVar2 != null) {
                int i6 = rect.bottom;
                gVar2.setBounds(rect.left, i6 - this.f2610S, rect.right, i6);
            }
            if (this.f2595C) {
                float textSize = this.f2621d.getTextSize();
                b bVar = this.f2654v0;
                if (bVar.f478h != textSize) {
                    bVar.f478h = textSize;
                    bVar.h(false);
                }
                int gravity = this.f2621d.getGravity();
                int i7 = (gravity & (-113)) | 48;
                if (bVar.f477g != i7) {
                    bVar.f477g = i7;
                    bVar.h(false);
                }
                if (bVar.f475f != gravity) {
                    bVar.f475f = gravity;
                    bVar.h(false);
                }
                if (this.f2621d == null) {
                    throw new IllegalStateException();
                }
                boolean f2 = m.f(this);
                int i8 = rect.bottom;
                Rect rect2 = this.f2614W;
                rect2.bottom = i8;
                int i9 = this.f2606O;
                if (i9 == 1) {
                    rect2.left = g(rect.left, f2);
                    rect2.top = rect.top + this.f2607P;
                    rect2.right = h(rect.right, f2);
                } else if (i9 != 2) {
                    rect2.left = g(rect.left, f2);
                    rect2.top = getPaddingTop();
                    rect2.right = h(rect.right, f2);
                } else {
                    rect2.left = this.f2621d.getPaddingLeft() + rect.left;
                    rect2.top = rect.top - c();
                    rect2.right = rect.right - this.f2621d.getPaddingRight();
                }
                int i10 = rect2.left;
                int i11 = rect2.top;
                int i12 = rect2.right;
                int i13 = rect2.bottom;
                Rect rect3 = bVar.f472d;
                if (rect3.left != i10 || rect3.top != i11 || rect3.right != i12 || rect3.bottom != i13) {
                    rect3.set(i10, i11, i12, i13);
                    bVar.f452M = true;
                }
                if (this.f2621d == null) {
                    throw new IllegalStateException();
                }
                TextPaint textPaint = bVar.f454O;
                textPaint.setTextSize(bVar.f478h);
                textPaint.setTypeface(bVar.f489u);
                textPaint.setLetterSpacing(bVar.f462W);
                float f3 = -textPaint.ascent();
                rect2.left = this.f2621d.getCompoundPaddingLeft() + rect.left;
                rect2.top = (this.f2606O != 1 || this.f2621d.getMinLines() > 1) ? rect.top + this.f2621d.getCompoundPaddingTop() : (int) (rect.centerY() - (f3 / 2.0f));
                rect2.right = rect.right - this.f2621d.getCompoundPaddingRight();
                int compoundPaddingBottom = (this.f2606O != 1 || this.f2621d.getMinLines() > 1) ? rect.bottom - this.f2621d.getCompoundPaddingBottom() : (int) (rect2.top + f3);
                rect2.bottom = compoundPaddingBottom;
                int i14 = rect2.left;
                int i15 = rect2.top;
                int i16 = rect2.right;
                Rect rect4 = bVar.f470c;
                if (rect4.left != i14 || rect4.top != i15 || rect4.right != i16 || rect4.bottom != compoundPaddingBottom) {
                    rect4.set(i14, i15, i16, compoundPaddingBottom);
                    bVar.f452M = true;
                }
                bVar.h(false);
                if (!e() || this.f2652u0) {
                    return;
                }
                j();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        EditText editText;
        super.onMeasure(i, i2);
        boolean z2 = this.f2594B0;
        p pVar = this.f2619c;
        if (!z2) {
            pVar.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f2594B0 = true;
        }
        if (this.f2649t != null && (editText = this.f2621d) != null) {
            this.f2649t.setGravity(editText.getGravity());
            this.f2649t.setPadding(this.f2621d.getCompoundPaddingLeft(), this.f2621d.getCompoundPaddingTop(), this.f2621d.getCompoundPaddingRight(), this.f2621d.getCompoundPaddingBottom());
        }
        pVar.m();
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C c2 = (C) parcelable;
        super.onRestoreInstanceState(c2.f1147a);
        setError(c2.f1259c);
        if (c2.f1260d) {
            post(new B0.j(3, this));
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        boolean z2 = i == 1;
        if (z2 != this.f2604M) {
            S0.c cVar = this.f2603L.e;
            RectF rectF = this.f2616a0;
            float a2 = cVar.a(rectF);
            float a3 = this.f2603L.f1109f.a(rectF);
            float a4 = this.f2603L.f1111h.a(rectF);
            float a5 = this.f2603L.f1110g.a(rectF);
            k kVar = this.f2603L;
            R.j jVar = kVar.f1105a;
            R.j jVar2 = kVar.f1106b;
            R.j jVar3 = kVar.f1108d;
            R.j jVar4 = kVar.f1107c;
            e eVar = new e(0);
            e eVar2 = new e(0);
            e eVar3 = new e(0);
            e eVar4 = new e(0);
            j.b(jVar2);
            j.b(jVar);
            j.b(jVar4);
            j.b(jVar3);
            S0.a aVar = new S0.a(a3);
            S0.a aVar2 = new S0.a(a2);
            S0.a aVar3 = new S0.a(a5);
            S0.a aVar4 = new S0.a(a4);
            k kVar2 = new k();
            kVar2.f1105a = jVar2;
            kVar2.f1106b = jVar;
            kVar2.f1107c = jVar3;
            kVar2.f1108d = jVar4;
            kVar2.e = aVar;
            kVar2.f1109f = aVar2;
            kVar2.f1110g = aVar4;
            kVar2.f1111h = aVar3;
            kVar2.i = eVar;
            kVar2.j = eVar2;
            kVar2.f1112k = eVar3;
            kVar2.f1113l = eVar4;
            this.f2604M = z2;
            setShapeAppearanceModel(kVar2);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        C c2 = new C(super.onSaveInstanceState());
        if (m()) {
            c2.f1259c = getError();
        }
        p pVar = this.f2619c;
        c2.f1260d = pVar.i != 0 && pVar.f1304g.f2549d;
        return c2;
    }

    public final void p() {
        Drawable textCursorDrawable;
        Drawable textCursorDrawable2;
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2591A;
        if (colorStateList2 == null) {
            Context context = getContext();
            TypedValue U2 = AbstractC0078a.U(context, com.lumenpath.harispro.hrnavigator.R.attr.colorControlActivated);
            if (U2 != null) {
                int i = U2.resourceId;
                if (i != 0) {
                    colorStateList2 = AbstractC0078a.z(context, i);
                } else {
                    int i2 = U2.data;
                    if (i2 != 0) {
                        colorStateList2 = ColorStateList.valueOf(i2);
                    }
                }
            }
            colorStateList2 = null;
        }
        EditText editText = this.f2621d;
        if (editText != null) {
            textCursorDrawable = editText.getTextCursorDrawable();
            if (textCursorDrawable == null) {
                return;
            }
            textCursorDrawable2 = this.f2621d.getTextCursorDrawable();
            Drawable mutate = textCursorDrawable2.mutate();
            if ((m() || (this.f2640o != null && this.f2636m)) && (colorStateList = this.f2593B) != null) {
                colorStateList2 = colorStateList;
            }
            mutate.setTintList(colorStateList2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q() {
        boolean z2;
        p pVar;
        Drawable[] compoundDrawablesRelative;
        ColorDrawable colorDrawable;
        Drawable drawable;
        ColorDrawable colorDrawable2;
        if (this.f2621d == null) {
            return false;
        }
        CheckableImageButton checkableImageButton = null;
        boolean z3 = true;
        if (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) {
            y yVar = this.f2617b;
            if (yVar.getMeasuredWidth() > 0) {
                int measuredWidth = yVar.getMeasuredWidth() - this.f2621d.getPaddingLeft();
                if (this.f2620c0 == null || this.f2622d0 != measuredWidth) {
                    ColorDrawable colorDrawable3 = new ColorDrawable();
                    this.f2620c0 = colorDrawable3;
                    this.f2622d0 = measuredWidth;
                    colorDrawable3.setBounds(0, 0, measuredWidth, 1);
                }
                Drawable[] compoundDrawablesRelative2 = this.f2621d.getCompoundDrawablesRelative();
                Drawable drawable2 = compoundDrawablesRelative2[0];
                ColorDrawable colorDrawable4 = this.f2620c0;
                if (drawable2 != colorDrawable4) {
                    this.f2621d.setCompoundDrawablesRelative(colorDrawable4, compoundDrawablesRelative2[1], compoundDrawablesRelative2[2], compoundDrawablesRelative2[3]);
                    z2 = true;
                    pVar = this.f2619c;
                    if ((!pVar.e() || ((pVar.i != 0 && pVar.d()) || pVar.f1311p != null)) && pVar.getMeasuredWidth() > 0) {
                        int measuredWidth2 = pVar.f1312q.getMeasuredWidth() - this.f2621d.getPaddingRight();
                        if (!pVar.e()) {
                            checkableImageButton = pVar.f1301c;
                        } else if (pVar.i != 0 && pVar.d()) {
                            checkableImageButton = pVar.f1304g;
                        }
                        if (checkableImageButton != null) {
                            measuredWidth2 = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth() + measuredWidth2;
                        }
                        compoundDrawablesRelative = this.f2621d.getCompoundDrawablesRelative();
                        colorDrawable = this.f2625f0;
                        if (colorDrawable != null || this.f2627g0 == measuredWidth2) {
                            if (colorDrawable == null) {
                                ColorDrawable colorDrawable5 = new ColorDrawable();
                                this.f2625f0 = colorDrawable5;
                                this.f2627g0 = measuredWidth2;
                                colorDrawable5.setBounds(0, 0, measuredWidth2, 1);
                            }
                            drawable = compoundDrawablesRelative[2];
                            colorDrawable2 = this.f2625f0;
                            if (drawable == colorDrawable2) {
                                this.f2629h0 = drawable;
                                this.f2621d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], colorDrawable2, compoundDrawablesRelative[3]);
                            } else {
                                z3 = z2;
                            }
                        } else {
                            this.f2627g0 = measuredWidth2;
                            colorDrawable.setBounds(0, 0, measuredWidth2, 1);
                            this.f2621d.setCompoundDrawablesRelative(compoundDrawablesRelative[0], compoundDrawablesRelative[1], this.f2625f0, compoundDrawablesRelative[3]);
                        }
                    } else {
                        if (this.f2625f0 == null) {
                            return z2;
                        }
                        Drawable[] compoundDrawablesRelative3 = this.f2621d.getCompoundDrawablesRelative();
                        if (compoundDrawablesRelative3[2] == this.f2625f0) {
                            this.f2621d.setCompoundDrawablesRelative(compoundDrawablesRelative3[0], compoundDrawablesRelative3[1], this.f2629h0, compoundDrawablesRelative3[3]);
                        } else {
                            z3 = z2;
                        }
                        this.f2625f0 = null;
                    }
                    return z3;
                }
                z2 = false;
                pVar = this.f2619c;
                if (pVar.e()) {
                }
                int measuredWidth22 = pVar.f1312q.getMeasuredWidth() - this.f2621d.getPaddingRight();
                if (!pVar.e()) {
                }
                if (checkableImageButton != null) {
                }
                compoundDrawablesRelative = this.f2621d.getCompoundDrawablesRelative();
                colorDrawable = this.f2625f0;
                if (colorDrawable != null) {
                }
                if (colorDrawable == null) {
                }
                drawable = compoundDrawablesRelative[2];
                colorDrawable2 = this.f2625f0;
                if (drawable == colorDrawable2) {
                }
                return z3;
            }
        }
        if (this.f2620c0 != null) {
            Drawable[] compoundDrawablesRelative4 = this.f2621d.getCompoundDrawablesRelative();
            this.f2621d.setCompoundDrawablesRelative(null, compoundDrawablesRelative4[1], compoundDrawablesRelative4[2], compoundDrawablesRelative4[3]);
            this.f2620c0 = null;
            z2 = true;
            pVar = this.f2619c;
            if (pVar.e()) {
            }
            int measuredWidth222 = pVar.f1312q.getMeasuredWidth() - this.f2621d.getPaddingRight();
            if (!pVar.e()) {
            }
            if (checkableImageButton != null) {
            }
            compoundDrawablesRelative = this.f2621d.getCompoundDrawablesRelative();
            colorDrawable = this.f2625f0;
            if (colorDrawable != null) {
            }
            if (colorDrawable == null) {
            }
            drawable = compoundDrawablesRelative[2];
            colorDrawable2 = this.f2625f0;
            if (drawable == colorDrawable2) {
            }
            return z3;
        }
        z2 = false;
        pVar = this.f2619c;
        if (pVar.e()) {
        }
        int measuredWidth2222 = pVar.f1312q.getMeasuredWidth() - this.f2621d.getPaddingRight();
        if (!pVar.e()) {
        }
        if (checkableImageButton != null) {
        }
        compoundDrawablesRelative = this.f2621d.getCompoundDrawablesRelative();
        colorDrawable = this.f2625f0;
        if (colorDrawable != null) {
        }
        if (colorDrawable == null) {
        }
        drawable = compoundDrawablesRelative[2];
        colorDrawable2 = this.f2625f0;
        if (drawable == colorDrawable2) {
        }
        return z3;
    }

    public final void r() {
        Drawable background;
        C0245b0 c0245b0;
        EditText editText = this.f2621d;
        if (editText == null || this.f2606O != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = AbstractC0265l0.f3981a;
        Drawable mutate = background.mutate();
        if (m()) {
            mutate.setColorFilter(C0281u.c(getErrorCurrentTextColors(), PorterDuff.Mode.SRC_IN));
        } else if (this.f2636m && (c0245b0 = this.f2640o) != null) {
            mutate.setColorFilter(C0281u.c(c0245b0.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            mutate.clearColorFilter();
            this.f2621d.refreshDrawableState();
        }
    }

    public final void s() {
        EditText editText = this.f2621d;
        if (editText == null || this.f2598F == null) {
            return;
        }
        if ((this.f2601I || editText.getBackground() == null) && this.f2606O != 0) {
            Drawable editTextBoxBackground = getEditTextBoxBackground();
            EditText editText2 = this.f2621d;
            WeakHashMap weakHashMap = K.f747a;
            editText2.setBackground(editTextBoxBackground);
            this.f2601I = true;
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f2612U != i) {
            this.f2612U = i;
            this.f2641o0 = i;
            this.f2645q0 = i;
            this.f2647r0 = i;
            b();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(getContext().getColor(i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f2641o0 = defaultColor;
        this.f2612U = defaultColor;
        this.f2643p0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f2645q0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        this.f2647r0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
        b();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f2606O) {
            return;
        }
        this.f2606O = i;
        if (this.f2621d != null) {
            i();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f2607P = i;
    }

    public void setBoxCornerFamily(int i) {
        j e = this.f2603L.e();
        S0.c cVar = this.f2603L.e;
        R.j q2 = R.j.q(i);
        e.f1096a = q2;
        j.b(q2);
        e.e = cVar;
        S0.c cVar2 = this.f2603L.f1109f;
        R.j q3 = R.j.q(i);
        e.f1097b = q3;
        j.b(q3);
        e.f1100f = cVar2;
        S0.c cVar3 = this.f2603L.f1111h;
        R.j q4 = R.j.q(i);
        e.f1099d = q4;
        j.b(q4);
        e.f1102h = cVar3;
        S0.c cVar4 = this.f2603L.f1110g;
        R.j q5 = R.j.q(i);
        e.f1098c = q5;
        j.b(q5);
        e.f1101g = cVar4;
        this.f2603L = e.a();
        b();
    }

    public void setBoxStrokeColor(int i) {
        if (this.f2637m0 != i) {
            this.f2637m0 = i;
            x();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f2633k0 = colorStateList.getDefaultColor();
            this.s0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f2635l0 = colorStateList.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, -1);
            this.f2637m0 = colorStateList.getColorForState(new int[]{R.attr.state_focused, R.attr.state_enabled}, -1);
        } else if (this.f2637m0 != colorStateList.getDefaultColor()) {
            this.f2637m0 = colorStateList.getDefaultColor();
        }
        x();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f2639n0 != colorStateList) {
            this.f2639n0 = colorStateList;
            x();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f2609R = i;
        x();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f2610S = i;
        x();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z2) {
        if (this.f2632k != z2) {
            t tVar = this.j;
            if (z2) {
                C0245b0 c0245b0 = new C0245b0(getContext(), null);
                this.f2640o = c0245b0;
                c0245b0.setId(com.lumenpath.harispro.hrnavigator.R.id.textinput_counter);
                Typeface typeface = this.f2618b0;
                if (typeface != null) {
                    this.f2640o.setTypeface(typeface);
                }
                this.f2640o.setMaxLines(1);
                tVar.a(this.f2640o, 2);
                ((ViewGroup.MarginLayoutParams) this.f2640o.getLayoutParams()).setMarginStart(getResources().getDimensionPixelOffset(com.lumenpath.harispro.hrnavigator.R.dimen.mtrl_textinput_counter_margin_start));
                o();
                if (this.f2640o != null) {
                    EditText editText = this.f2621d;
                    n(editText != null ? editText.getText() : null);
                }
            } else {
                tVar.g(this.f2640o, 2);
                this.f2640o = null;
            }
            this.f2632k = z2;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f2634l != i) {
            if (i > 0) {
                this.f2634l = i;
            } else {
                this.f2634l = -1;
            }
            if (!this.f2632k || this.f2640o == null) {
                return;
            }
            EditText editText = this.f2621d;
            n(editText == null ? null : editText.getText());
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f2642p != i) {
            this.f2642p = i;
            o();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f2661z != colorStateList) {
            this.f2661z = colorStateList;
            o();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f2644q != i) {
            this.f2644q = i;
            o();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f2659y != colorStateList) {
            this.f2659y = colorStateList;
            o();
        }
    }

    public void setCursorColor(ColorStateList colorStateList) {
        if (this.f2591A != colorStateList) {
            this.f2591A = colorStateList;
            p();
        }
    }

    public void setCursorErrorColor(ColorStateList colorStateList) {
        if (this.f2593B != colorStateList) {
            this.f2593B = colorStateList;
            if (m() || (this.f2640o != null && this.f2636m)) {
                p();
            }
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f2630i0 = colorStateList;
        this.f2631j0 = colorStateList;
        if (this.f2621d != null) {
            u(false, false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z2) {
        k(this, z2);
        super.setEnabled(z2);
    }

    public void setEndIconActivated(boolean z2) {
        this.f2619c.f1304g.setActivated(z2);
    }

    public void setEndIconCheckable(boolean z2) {
        this.f2619c.f1304g.setCheckable(z2);
    }

    public void setEndIconContentDescription(int i) {
        p pVar = this.f2619c;
        CharSequence text = i != 0 ? pVar.getResources().getText(i) : null;
        CheckableImageButton checkableImageButton = pVar.f1304g;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
    }

    public void setEndIconDrawable(int i) {
        p pVar = this.f2619c;
        Drawable n2 = i != 0 ? h0.f.n(pVar.getContext(), i) : null;
        CheckableImageButton checkableImageButton = pVar.f1304g;
        checkableImageButton.setImageDrawable(n2);
        if (n2 != null) {
            ColorStateList colorStateList = pVar.f1306k;
            PorterDuff.Mode mode = pVar.f1307l;
            TextInputLayout textInputLayout = pVar.f1299a;
            R.j.e(textInputLayout, checkableImageButton, colorStateList, mode);
            R.j.g0(textInputLayout, checkableImageButton, pVar.f1306k);
        }
    }

    public void setEndIconMinSize(int i) {
        p pVar = this.f2619c;
        if (i < 0) {
            pVar.getClass();
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (i != pVar.f1308m) {
            pVar.f1308m = i;
            CheckableImageButton checkableImageButton = pVar.f1304g;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
            CheckableImageButton checkableImageButton2 = pVar.f1301c;
            checkableImageButton2.setMinimumWidth(i);
            checkableImageButton2.setMinimumHeight(i);
        }
    }

    public void setEndIconMode(int i) {
        this.f2619c.g(i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2619c;
        View.OnLongClickListener onLongClickListener = pVar.f1310o;
        CheckableImageButton checkableImageButton = pVar.f1304g;
        checkableImageButton.setOnClickListener(onClickListener);
        R.j.l0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2619c;
        pVar.f1310o = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f1304g;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        R.j.l0(checkableImageButton, onLongClickListener);
    }

    public void setEndIconScaleType(ImageView.ScaleType scaleType) {
        p pVar = this.f2619c;
        pVar.f1309n = scaleType;
        pVar.f1304g.setScaleType(scaleType);
        pVar.f1301c.setScaleType(scaleType);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2619c;
        if (pVar.f1306k != colorStateList) {
            pVar.f1306k = colorStateList;
            R.j.e(pVar.f1299a, pVar.f1304g, colorStateList, pVar.f1307l);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2619c;
        if (pVar.f1307l != mode) {
            pVar.f1307l = mode;
            R.j.e(pVar.f1299a, pVar.f1304g, pVar.f1306k, mode);
        }
    }

    public void setEndIconVisible(boolean z2) {
        this.f2619c.h(z2);
    }

    public void setError(CharSequence charSequence) {
        t tVar = this.j;
        if (!tVar.f1342q) {
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
        tVar.f1341p = charSequence;
        tVar.f1343r.setText(charSequence);
        int i = tVar.f1339n;
        if (i != 1) {
            tVar.f1340o = 1;
        }
        tVar.i(i, tVar.f1340o, tVar.h(tVar.f1343r, charSequence));
    }

    public void setErrorAccessibilityLiveRegion(int i) {
        t tVar = this.j;
        tVar.f1345t = i;
        C0245b0 c0245b0 = tVar.f1343r;
        if (c0245b0 != null) {
            WeakHashMap weakHashMap = K.f747a;
            c0245b0.setAccessibilityLiveRegion(i);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        t tVar = this.j;
        tVar.f1344s = charSequence;
        C0245b0 c0245b0 = tVar.f1343r;
        if (c0245b0 != null) {
            c0245b0.setContentDescription(charSequence);
        }
    }

    public void setErrorEnabled(boolean z2) {
        t tVar = this.j;
        if (tVar.f1342q == z2) {
            return;
        }
        tVar.c();
        TextInputLayout textInputLayout = tVar.f1335h;
        if (z2) {
            C0245b0 c0245b0 = new C0245b0(tVar.f1334g, null);
            tVar.f1343r = c0245b0;
            c0245b0.setId(com.lumenpath.harispro.hrnavigator.R.id.textinput_error);
            tVar.f1343r.setTextAlignment(5);
            Typeface typeface = tVar.f1328B;
            if (typeface != null) {
                tVar.f1343r.setTypeface(typeface);
            }
            int i = tVar.f1346u;
            tVar.f1346u = i;
            C0245b0 c0245b02 = tVar.f1343r;
            if (c0245b02 != null) {
                textInputLayout.l(c0245b02, i);
            }
            ColorStateList colorStateList = tVar.f1347v;
            tVar.f1347v = colorStateList;
            C0245b0 c0245b03 = tVar.f1343r;
            if (c0245b03 != null && colorStateList != null) {
                c0245b03.setTextColor(colorStateList);
            }
            CharSequence charSequence = tVar.f1344s;
            tVar.f1344s = charSequence;
            C0245b0 c0245b04 = tVar.f1343r;
            if (c0245b04 != null) {
                c0245b04.setContentDescription(charSequence);
            }
            int i2 = tVar.f1345t;
            tVar.f1345t = i2;
            C0245b0 c0245b05 = tVar.f1343r;
            if (c0245b05 != null) {
                WeakHashMap weakHashMap = K.f747a;
                c0245b05.setAccessibilityLiveRegion(i2);
            }
            tVar.f1343r.setVisibility(4);
            tVar.a(tVar.f1343r, 0);
        } else {
            tVar.f();
            tVar.g(tVar.f1343r, 0);
            tVar.f1343r = null;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f1342q = z2;
    }

    public void setErrorIconDrawable(int i) {
        p pVar = this.f2619c;
        pVar.i(i != 0 ? h0.f.n(pVar.getContext(), i) : null);
        R.j.g0(pVar.f1299a, pVar.f1301c, pVar.f1302d);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        p pVar = this.f2619c;
        CheckableImageButton checkableImageButton = pVar.f1301c;
        View.OnLongClickListener onLongClickListener = pVar.f1303f;
        checkableImageButton.setOnClickListener(onClickListener);
        R.j.l0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        p pVar = this.f2619c;
        pVar.f1303f = onLongClickListener;
        CheckableImageButton checkableImageButton = pVar.f1301c;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        R.j.l0(checkableImageButton, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        p pVar = this.f2619c;
        if (pVar.f1302d != colorStateList) {
            pVar.f1302d = colorStateList;
            R.j.e(pVar.f1299a, pVar.f1301c, colorStateList, pVar.e);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2619c;
        if (pVar.e != mode) {
            pVar.e = mode;
            R.j.e(pVar.f1299a, pVar.f1301c, pVar.f1302d, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        t tVar = this.j;
        tVar.f1346u = i;
        C0245b0 c0245b0 = tVar.f1343r;
        if (c0245b0 != null) {
            tVar.f1335h.l(c0245b0, i);
        }
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        t tVar = this.j;
        tVar.f1347v = colorStateList;
        C0245b0 c0245b0 = tVar.f1343r;
        if (c0245b0 == null || colorStateList == null) {
            return;
        }
        c0245b0.setTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z2) {
        if (this.f2656w0 != z2) {
            this.f2656w0 = z2;
            u(false, false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        t tVar = this.j;
        if (isEmpty) {
            if (tVar.f1349x) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!tVar.f1349x) {
            setHelperTextEnabled(true);
        }
        tVar.c();
        tVar.f1348w = charSequence;
        tVar.f1350y.setText(charSequence);
        int i = tVar.f1339n;
        if (i != 2) {
            tVar.f1340o = 2;
        }
        tVar.i(i, tVar.f1340o, tVar.h(tVar.f1350y, charSequence));
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        t tVar = this.j;
        tVar.f1327A = colorStateList;
        C0245b0 c0245b0 = tVar.f1350y;
        if (c0245b0 == null || colorStateList == null) {
            return;
        }
        c0245b0.setTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z2) {
        t tVar = this.j;
        if (tVar.f1349x == z2) {
            return;
        }
        tVar.c();
        if (z2) {
            C0245b0 c0245b0 = new C0245b0(tVar.f1334g, null);
            tVar.f1350y = c0245b0;
            c0245b0.setId(com.lumenpath.harispro.hrnavigator.R.id.textinput_helper_text);
            tVar.f1350y.setTextAlignment(5);
            Typeface typeface = tVar.f1328B;
            if (typeface != null) {
                tVar.f1350y.setTypeface(typeface);
            }
            tVar.f1350y.setVisibility(4);
            tVar.f1350y.setAccessibilityLiveRegion(1);
            int i = tVar.f1351z;
            tVar.f1351z = i;
            C0245b0 c0245b02 = tVar.f1350y;
            if (c0245b02 != null) {
                c0245b02.setTextAppearance(i);
            }
            ColorStateList colorStateList = tVar.f1327A;
            tVar.f1327A = colorStateList;
            C0245b0 c0245b03 = tVar.f1350y;
            if (c0245b03 != null && colorStateList != null) {
                c0245b03.setTextColor(colorStateList);
            }
            tVar.a(tVar.f1350y, 1);
            tVar.f1350y.setAccessibilityDelegate(new s(tVar));
        } else {
            tVar.c();
            int i2 = tVar.f1339n;
            if (i2 == 2) {
                tVar.f1340o = 0;
            }
            tVar.i(i2, tVar.f1340o, tVar.h(tVar.f1350y, ""));
            tVar.g(tVar.f1350y, 1);
            tVar.f1350y = null;
            TextInputLayout textInputLayout = tVar.f1335h;
            textInputLayout.r();
            textInputLayout.x();
        }
        tVar.f1349x = z2;
    }

    public void setHelperTextTextAppearance(int i) {
        t tVar = this.j;
        tVar.f1351z = i;
        C0245b0 c0245b0 = tVar.f1350y;
        if (c0245b0 != null) {
            c0245b0.setTextAppearance(i);
        }
    }

    public void setHint(CharSequence charSequence) {
        if (this.f2595C) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z2) {
        this.f2658x0 = z2;
    }

    public void setHintEnabled(boolean z2) {
        if (z2 != this.f2595C) {
            this.f2595C = z2;
            if (z2) {
                CharSequence hint = this.f2621d.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f2596D)) {
                        setHint(hint);
                    }
                    this.f2621d.setHint((CharSequence) null);
                }
                this.f2597E = true;
            } else {
                this.f2597E = false;
                if (!TextUtils.isEmpty(this.f2596D) && TextUtils.isEmpty(this.f2621d.getHint())) {
                    this.f2621d.setHint(this.f2596D);
                }
                setHintInternal(null);
            }
            if (this.f2621d != null) {
                t();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        b bVar = this.f2654v0;
        TextInputLayout textInputLayout = bVar.f466a;
        P0.d dVar = new P0.d(textInputLayout.getContext(), i);
        ColorStateList colorStateList = dVar.j;
        if (colorStateList != null) {
            bVar.f479k = colorStateList;
        }
        float f2 = dVar.f907k;
        if (f2 != RecyclerView.f2111C0) {
            bVar.i = f2;
        }
        ColorStateList colorStateList2 = dVar.f900a;
        if (colorStateList2 != null) {
            bVar.f460U = colorStateList2;
        }
        bVar.f458S = dVar.e;
        bVar.f459T = dVar.f904f;
        bVar.f457R = dVar.f905g;
        bVar.f461V = dVar.i;
        P0.a aVar = bVar.f493y;
        if (aVar != null) {
            aVar.f895g = true;
        }
        B.b bVar2 = new B.b(4, bVar);
        dVar.a();
        bVar.f493y = new P0.a(bVar2, dVar.f910n);
        dVar.c(textInputLayout.getContext(), bVar.f493y);
        bVar.h(false);
        this.f2631j0 = bVar.f479k;
        if (this.f2621d != null) {
            u(false, false);
            t();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f2631j0 != colorStateList) {
            if (this.f2630i0 == null) {
                b bVar = this.f2654v0;
                if (bVar.f479k != colorStateList) {
                    bVar.f479k = colorStateList;
                    bVar.h(false);
                }
            }
            this.f2631j0 = colorStateList;
            if (this.f2621d != null) {
                u(false, false);
            }
        }
    }

    public void setLengthCounter(B b2) {
        this.f2638n = b2;
    }

    public void setMaxEms(int i) {
        this.f2626g = i;
        EditText editText = this.f2621d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxEms(i);
    }

    public void setMaxWidth(int i) {
        this.i = i;
        EditText editText = this.f2621d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMaxWidth(i);
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f2624f = i;
        EditText editText = this.f2621d;
        if (editText == null || i == -1) {
            return;
        }
        editText.setMinEms(i);
    }

    public void setMinWidth(int i) {
        this.f2628h = i;
        EditText editText = this.f2621d;
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
        p pVar = this.f2619c;
        pVar.f1304g.setContentDescription(i != 0 ? pVar.getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        p pVar = this.f2619c;
        pVar.f1304g.setImageDrawable(i != 0 ? h0.f.n(pVar.getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z2) {
        p pVar = this.f2619c;
        if (z2 && pVar.i != 1) {
            pVar.g(1);
        } else if (z2) {
            pVar.getClass();
        } else {
            pVar.g(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        p pVar = this.f2619c;
        pVar.f1306k = colorStateList;
        R.j.e(pVar.f1299a, pVar.f1304g, colorStateList, pVar.f1307l);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        p pVar = this.f2619c;
        pVar.f1307l = mode;
        R.j.e(pVar.f1299a, pVar.f1304g, pVar.f1306k, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f2649t == null) {
            C0245b0 c0245b0 = new C0245b0(getContext(), null);
            this.f2649t = c0245b0;
            c0245b0.setId(com.lumenpath.harispro.hrnavigator.R.id.textinput_placeholder);
            this.f2649t.setImportantForAccessibility(2);
            h d2 = d();
            this.f2655w = d2;
            d2.f4185b = 67L;
            this.f2657x = d();
            setPlaceholderTextAppearance(this.f2653v);
            setPlaceholderTextColor(this.f2651u);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f2648s) {
                setPlaceholderTextEnabled(true);
            }
            this.f2646r = charSequence;
        }
        EditText editText = this.f2621d;
        v(editText != null ? editText.getText() : null);
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f2653v = i;
        C0245b0 c0245b0 = this.f2649t;
        if (c0245b0 != null) {
            c0245b0.setTextAppearance(i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f2651u != colorStateList) {
            this.f2651u = colorStateList;
            C0245b0 c0245b0 = this.f2649t;
            if (c0245b0 == null || colorStateList == null) {
                return;
            }
            c0245b0.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        y yVar = this.f2617b;
        yVar.getClass();
        yVar.f1366c = TextUtils.isEmpty(charSequence) ? null : charSequence;
        yVar.f1365b.setText(charSequence);
        yVar.e();
    }

    public void setPrefixTextAppearance(int i) {
        this.f2617b.f1365b.setTextAppearance(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f2617b.f1365b.setTextColor(colorStateList);
    }

    public void setShapeAppearanceModel(k kVar) {
        g gVar = this.f2598F;
        if (gVar == null || gVar.f1076a.f1062a == kVar) {
            return;
        }
        this.f2603L = kVar;
        b();
    }

    public void setStartIconCheckable(boolean z2) {
        this.f2617b.f1367d.setCheckable(z2);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2617b.f1367d;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? h0.f.n(getContext(), i) : null);
    }

    public void setStartIconMinSize(int i) {
        y yVar = this.f2617b;
        if (i < 0) {
            yVar.getClass();
            throw new IllegalArgumentException("startIconSize cannot be less than 0");
        }
        if (i != yVar.f1369g) {
            yVar.f1369g = i;
            CheckableImageButton checkableImageButton = yVar.f1367d;
            checkableImageButton.setMinimumWidth(i);
            checkableImageButton.setMinimumHeight(i);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        y yVar = this.f2617b;
        View.OnLongClickListener onLongClickListener = yVar.i;
        CheckableImageButton checkableImageButton = yVar.f1367d;
        checkableImageButton.setOnClickListener(onClickListener);
        R.j.l0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        y yVar = this.f2617b;
        yVar.i = onLongClickListener;
        CheckableImageButton checkableImageButton = yVar.f1367d;
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        R.j.l0(checkableImageButton, onLongClickListener);
    }

    public void setStartIconScaleType(ImageView.ScaleType scaleType) {
        y yVar = this.f2617b;
        yVar.f1370h = scaleType;
        yVar.f1367d.setScaleType(scaleType);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        y yVar = this.f2617b;
        if (yVar.e != colorStateList) {
            yVar.e = colorStateList;
            R.j.e(yVar.f1364a, yVar.f1367d, colorStateList, yVar.f1368f);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        y yVar = this.f2617b;
        if (yVar.f1368f != mode) {
            yVar.f1368f = mode;
            R.j.e(yVar.f1364a, yVar.f1367d, yVar.e, mode);
        }
    }

    public void setStartIconVisible(boolean z2) {
        this.f2617b.c(z2);
    }

    public void setSuffixText(CharSequence charSequence) {
        p pVar = this.f2619c;
        pVar.getClass();
        pVar.f1311p = TextUtils.isEmpty(charSequence) ? null : charSequence;
        pVar.f1312q.setText(charSequence);
        pVar.n();
    }

    public void setSuffixTextAppearance(int i) {
        this.f2619c.f1312q.setTextAppearance(i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f2619c.f1312q.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(A a2) {
        EditText editText = this.f2621d;
        if (editText != null) {
            K.l(editText, a2);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f2618b0) {
            this.f2618b0 = typeface;
            this.f2654v0.m(typeface);
            t tVar = this.j;
            if (typeface != tVar.f1328B) {
                tVar.f1328B = typeface;
                C0245b0 c0245b0 = tVar.f1343r;
                if (c0245b0 != null) {
                    c0245b0.setTypeface(typeface);
                }
                C0245b0 c0245b02 = tVar.f1350y;
                if (c0245b02 != null) {
                    c0245b02.setTypeface(typeface);
                }
            }
            C0245b0 c0245b03 = this.f2640o;
            if (c0245b03 != null) {
                c0245b03.setTypeface(typeface);
            }
        }
    }

    public final void t() {
        if (this.f2606O != 1) {
            FrameLayout frameLayout = this.f2615a;
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) frameLayout.getLayoutParams();
            int c2 = c();
            if (c2 != layoutParams.topMargin) {
                layoutParams.topMargin = c2;
                frameLayout.requestLayout();
            }
        }
    }

    public final void u(boolean z2, boolean z3) {
        ColorStateList colorStateList;
        C0245b0 c0245b0;
        boolean isEnabled = isEnabled();
        EditText editText = this.f2621d;
        boolean z4 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.f2621d;
        boolean z5 = editText2 != null && editText2.hasFocus();
        ColorStateList colorStateList2 = this.f2630i0;
        b bVar = this.f2654v0;
        if (colorStateList2 != null) {
            bVar.i(colorStateList2);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f2630i0;
            bVar.i(ColorStateList.valueOf(colorStateList3 != null ? colorStateList3.getColorForState(new int[]{-16842910}, this.s0) : this.s0));
        } else if (m()) {
            C0245b0 c0245b02 = this.j.f1343r;
            bVar.i(c0245b02 != null ? c0245b02.getTextColors() : null);
        } else if (this.f2636m && (c0245b0 = this.f2640o) != null) {
            bVar.i(c0245b0.getTextColors());
        } else if (z5 && (colorStateList = this.f2631j0) != null && bVar.f479k != colorStateList) {
            bVar.f479k = colorStateList;
            bVar.h(false);
        }
        p pVar = this.f2619c;
        y yVar = this.f2617b;
        if (z4 || !this.f2656w0 || (isEnabled() && z5)) {
            if (z3 || this.f2652u0) {
                ValueAnimator valueAnimator = this.f2660y0;
                if (valueAnimator != null && valueAnimator.isRunning()) {
                    this.f2660y0.cancel();
                }
                if (z2 && this.f2658x0) {
                    a(1.0f);
                } else {
                    bVar.k(1.0f);
                }
                this.f2652u0 = false;
                if (e()) {
                    j();
                }
                EditText editText3 = this.f2621d;
                v(editText3 != null ? editText3.getText() : null);
                yVar.j = false;
                yVar.e();
                pVar.f1313r = false;
                pVar.n();
                return;
            }
            return;
        }
        if (z3 || !this.f2652u0) {
            ValueAnimator valueAnimator2 = this.f2660y0;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f2660y0.cancel();
            }
            if (z2 && this.f2658x0) {
                a(RecyclerView.f2111C0);
            } else {
                bVar.k(RecyclerView.f2111C0);
            }
            if (e() && !((V0.h) this.f2598F).f1277x.f1275q.isEmpty() && e()) {
                ((V0.h) this.f2598F).s(RecyclerView.f2111C0, RecyclerView.f2111C0, RecyclerView.f2111C0, RecyclerView.f2111C0);
            }
            this.f2652u0 = true;
            C0245b0 c0245b03 = this.f2649t;
            if (c0245b03 != null && this.f2648s) {
                c0245b03.setText((CharSequence) null);
                q.a(this.f2615a, this.f2657x);
                this.f2649t.setVisibility(4);
            }
            yVar.j = true;
            yVar.e();
            pVar.f1313r = true;
            pVar.n();
        }
    }

    public final void v(Editable editable) {
        ((C0031g) this.f2638n).getClass();
        int length = editable != null ? editable.length() : 0;
        FrameLayout frameLayout = this.f2615a;
        if (length != 0 || this.f2652u0) {
            C0245b0 c0245b0 = this.f2649t;
            if (c0245b0 == null || !this.f2648s) {
                return;
            }
            c0245b0.setText((CharSequence) null);
            q.a(frameLayout, this.f2657x);
            this.f2649t.setVisibility(4);
            return;
        }
        if (this.f2649t == null || !this.f2648s || TextUtils.isEmpty(this.f2646r)) {
            return;
        }
        this.f2649t.setText(this.f2646r);
        q.a(frameLayout, this.f2655w);
        this.f2649t.setVisibility(0);
        this.f2649t.bringToFront();
        announceForAccessibility(this.f2646r);
    }

    public final void w(boolean z2, boolean z3) {
        int defaultColor = this.f2639n0.getDefaultColor();
        int colorForState = this.f2639n0.getColorForState(new int[]{R.attr.state_hovered, R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.f2639n0.getColorForState(new int[]{R.attr.state_activated, R.attr.state_enabled}, defaultColor);
        if (z2) {
            this.f2611T = colorForState2;
        } else if (z3) {
            this.f2611T = colorForState;
        } else {
            this.f2611T = defaultColor;
        }
    }

    public final void x() {
        C0245b0 c0245b0;
        EditText editText;
        EditText editText2;
        if (this.f2598F == null || this.f2606O == 0) {
            return;
        }
        boolean z2 = false;
        boolean z3 = isFocused() || ((editText2 = this.f2621d) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.f2621d) != null && editText.isHovered())) {
            z2 = true;
        }
        if (!isEnabled()) {
            this.f2611T = this.s0;
        } else if (m()) {
            if (this.f2639n0 != null) {
                w(z3, z2);
            } else {
                this.f2611T = getErrorCurrentTextColors();
            }
        } else if (!this.f2636m || (c0245b0 = this.f2640o) == null) {
            if (z3) {
                this.f2611T = this.f2637m0;
            } else if (z2) {
                this.f2611T = this.f2635l0;
            } else {
                this.f2611T = this.f2633k0;
            }
        } else if (this.f2639n0 != null) {
            w(z3, z2);
        } else {
            this.f2611T = c0245b0.getCurrentTextColor();
        }
        if (Build.VERSION.SDK_INT >= 29) {
            p();
        }
        p pVar = this.f2619c;
        pVar.l();
        CheckableImageButton checkableImageButton = pVar.f1301c;
        ColorStateList colorStateList = pVar.f1302d;
        TextInputLayout textInputLayout = pVar.f1299a;
        R.j.g0(textInputLayout, checkableImageButton, colorStateList);
        ColorStateList colorStateList2 = pVar.f1306k;
        CheckableImageButton checkableImageButton2 = pVar.f1304g;
        R.j.g0(textInputLayout, checkableImageButton2, colorStateList2);
        if (pVar.b() instanceof V0.k) {
            if (!textInputLayout.m() || checkableImageButton2.getDrawable() == null) {
                R.j.e(textInputLayout, checkableImageButton2, pVar.f1306k, pVar.f1307l);
            } else {
                Drawable mutate = checkableImageButton2.getDrawable().mutate();
                mutate.setTint(textInputLayout.getErrorCurrentTextColors());
                checkableImageButton2.setImageDrawable(mutate);
            }
        }
        y yVar = this.f2617b;
        R.j.g0(yVar.f1364a, yVar.f1367d, yVar.e);
        if (this.f2606O == 2) {
            int i = this.f2608Q;
            if (z3 && isEnabled()) {
                this.f2608Q = this.f2610S;
            } else {
                this.f2608Q = this.f2609R;
            }
            if (this.f2608Q != i && e() && !this.f2652u0) {
                if (e()) {
                    ((V0.h) this.f2598F).s(RecyclerView.f2111C0, RecyclerView.f2111C0, RecyclerView.f2111C0, RecyclerView.f2111C0);
                }
                j();
            }
        }
        if (this.f2606O == 1) {
            if (!isEnabled()) {
                this.f2612U = this.f2643p0;
            } else if (z2 && !z3) {
                this.f2612U = this.f2647r0;
            } else if (z3) {
                this.f2612U = this.f2645q0;
            } else {
                this.f2612U = this.f2641o0;
            }
        }
        b();
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f2617b.b(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f2619c.f1304g.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f2619c.f1304g.setImageDrawable(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f2619c.i(drawable);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        CheckableImageButton checkableImageButton = this.f2619c.f1304g;
        if (checkableImageButton.getContentDescription() != charSequence) {
            checkableImageButton.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        p pVar = this.f2619c;
        CheckableImageButton checkableImageButton = pVar.f1304g;
        checkableImageButton.setImageDrawable(drawable);
        if (drawable != null) {
            ColorStateList colorStateList = pVar.f1306k;
            PorterDuff.Mode mode = pVar.f1307l;
            TextInputLayout textInputLayout = pVar.f1299a;
            R.j.e(textInputLayout, checkableImageButton, colorStateList, mode);
            R.j.g0(textInputLayout, checkableImageButton, pVar.f1306k);
        }
    }
}
