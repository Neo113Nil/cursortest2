package com.gamericefishpro.space.na;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.gamericefishpro.space.R;
import com.gamericefishpro.space.i2.x1;
import com.gamericefishpro.space.i9.d5;
import com.gamericefishpro.space.n.i0;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends LinearLayout {
    public final com.gamericefishpro.space.i7.c A;
    public int B;
    public final LinkedHashSet C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public int F;
    public ImageView.ScaleType G;
    public View.OnLongClickListener H;
    public CharSequence I;
    public final i0 J;
    public boolean K;
    public EditText L;
    public final AccessibilityManager M;
    public AccessibilityManager.TouchExplorationStateChangeListener N;
    public final n O;
    public final TextInputLayout d;
    public final FrameLayout e;
    public final CheckableImageButton i;
    public ColorStateList v;
    public PorterDuff.Mode w;
    public View.OnLongClickListener y;
    public final CheckableImageButton z;

    public p(TextInputLayout textInputLayout, com.gamericefishpro.space.a8.c cVar) {
        CharSequence text;
        super(textInputLayout.getContext());
        this.B = 0;
        this.C = new LinkedHashSet();
        this.O = new n(this);
        o oVar = new o(this);
        this.M = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.d = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.e = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButtonA = a(this, layoutInflaterFrom, R.id.text_input_error_icon);
        this.i = checkableImageButtonA;
        CheckableImageButton checkableImageButtonA2 = a(frameLayout, layoutInflaterFrom, R.id.text_input_end_icon);
        this.z = checkableImageButtonA2;
        this.A = new com.gamericefishpro.space.i7.c(this, cVar);
        i0 i0Var = new i0(getContext(), null);
        this.J = i0Var;
        TypedArray typedArray = (TypedArray) cVar.i;
        if (typedArray.hasValue(38)) {
            this.v = com.gamericefishpro.space.hj.c.w(getContext(), cVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.w = com.gamericefishpro.space.fa.l.f(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(cVar.l(37));
        }
        checkableImageButtonA.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButtonA.setImportantForAccessibility(2);
        checkableImageButtonA.setClickable(false);
        checkableImageButtonA.setPressable(false);
        checkableImageButtonA.setCheckable(false);
        checkableImageButtonA.setFocusable(false);
        if (!typedArray.hasValue(54)) {
            if (typedArray.hasValue(32)) {
                this.D = com.gamericefishpro.space.hj.c.w(getContext(), cVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.E = com.gamericefishpro.space.fa.l.f(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && checkableImageButtonA2.getContentDescription() != (text = typedArray.getText(27))) {
                checkableImageButtonA2.setContentDescription(text);
            }
            checkableImageButtonA2.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(54)) {
            if (typedArray.hasValue(55)) {
                this.D = com.gamericefishpro.space.hj.c.w(getContext(), cVar, 55);
            }
            if (typedArray.hasValue(56)) {
                this.E = com.gamericefishpro.space.fa.l.f(typedArray.getInt(56, -1), null);
            }
            g(typedArray.getBoolean(54, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(52);
            if (checkableImageButtonA2.getContentDescription() != text2) {
                checkableImageButtonA2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.F) {
            this.F = dimensionPixelSize;
            checkableImageButtonA2.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA2.setMinimumHeight(dimensionPixelSize);
            checkableImageButtonA.setMinimumWidth(dimensionPixelSize);
            checkableImageButtonA.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType scaleTypeS = d5.s(typedArray.getInt(31, -1));
            this.G = scaleTypeS;
            checkableImageButtonA2.setScaleType(scaleTypeS);
            checkableImageButtonA.setScaleType(scaleTypeS);
        }
        i0Var.setVisibility(8);
        i0Var.setId(R.id.textinput_suffix_text);
        i0Var.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        i0Var.setAccessibilityLiveRegion(1);
        i0Var.setTextAppearance(typedArray.getResourceId(73, 0));
        if (typedArray.hasValue(74)) {
            i0Var.setTextColor(cVar.k(74));
        }
        CharSequence text3 = typedArray.getText(72);
        this.I = TextUtils.isEmpty(text3) ? null : text3;
        i0Var.setText(text3);
        n();
        frameLayout.addView(checkableImageButtonA2);
        addView(i0Var);
        addView(frameLayout);
        addView(checkableImageButtonA);
        textInputLayout.y0.add(oVar);
        if (textInputLayout.w != null) {
            oVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new x1(4, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (com.gamericefishpro.space.hj.c.E(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q fVar;
        int i = this.B;
        com.gamericefishpro.space.i7.c cVar = this.A;
        SparseArray sparseArray = (SparseArray) cVar.c;
        q qVar = (q) sparseArray.get(i);
        if (qVar != null) {
            return qVar;
        }
        p pVar = (p) cVar.d;
        if (i == -1) {
            fVar = new f(pVar, 0);
        } else if (i == 0) {
            fVar = new f(pVar, 1);
        } else if (i == 1) {
            fVar = new u(pVar, cVar.b);
        } else if (i == 2) {
            fVar = new e(pVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(com.gamericefishpro.space.m5.a.g(i, "Invalid end icon mode: "));
            }
            fVar = new m(pVar);
        }
        sparseArray.append(i, fVar);
        return fVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.z;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.J.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.e.getVisibility() == 0 && this.z.getVisibility() == 0;
    }

    public final boolean e() {
        return this.i.getVisibility() == 0;
    }

    public final void f(boolean z) {
        boolean z2;
        boolean zIsActivated;
        boolean z3;
        q qVarB = b();
        boolean zJ = qVarB.j();
        CheckableImageButton checkableImageButton = this.z;
        boolean z4 = true;
        if (!zJ || (z3 = checkableImageButton.v) == qVarB.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(qVarB instanceof m) || (zIsActivated = checkableImageButton.isActivated()) == ((m) qVarB).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!zIsActivated);
        }
        if (z || z4) {
            d5.S(this.d, checkableImageButton, this.D);
        }
    }

    public final void g(int i) {
        if (this.B == i) {
            return;
        }
        q qVarB = b();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.N;
        AccessibilityManager accessibilityManager = this.M;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.N = null;
        qVarB.r();
        this.B = i;
        Iterator it = this.C.iterator();
        if (it.hasNext()) {
            throw com.gamericefishpro.space.m5.a.f(it);
        }
        h(i != 0);
        q qVarB2 = b();
        int iD = this.A.a;
        if (iD == 0) {
            iD = qVarB2.d();
        }
        Drawable drawableX = iD != 0 ? com.gamericefishpro.space.u6.f.x(getContext(), iD) : null;
        CheckableImageButton checkableImageButton = this.z;
        checkableImageButton.setImageDrawable(drawableX);
        TextInputLayout textInputLayout = this.d;
        if (drawableX != null) {
            d5.j(textInputLayout, checkableImageButton, this.D, this.E);
            d5.S(textInputLayout, checkableImageButton, this.D);
        }
        int iC = qVarB2.c();
        CharSequence text = iC != 0 ? getResources().getText(iC) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(qVarB2.j());
        if (!qVarB2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        qVarB2.q();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListenerH = qVarB2.h();
        this.N = touchExplorationStateChangeListenerH;
        if (touchExplorationStateChangeListenerH != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.N);
        }
        View.OnClickListener onClickListenerF = qVarB2.f();
        View.OnLongClickListener onLongClickListener = this.H;
        checkableImageButton.setOnClickListener(onClickListenerF);
        d5.X(checkableImageButton, onLongClickListener);
        EditText editText = this.L;
        if (editText != null) {
            qVarB2.l(editText);
            j(qVarB2);
        }
        d5.j(textInputLayout, checkableImageButton, this.D, this.E);
        f(true);
    }

    public final void h(boolean z) {
        if (d() != z) {
            this.z.setVisibility(z ? 0 : 8);
            k();
            m();
            this.d.s();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.i;
        checkableImageButton.setImageDrawable(drawable);
        l();
        d5.j(this.d, checkableImageButton, this.v, this.w);
    }

    public final void j(q qVar) {
        if (this.L == null) {
            return;
        }
        if (qVar.e() != null) {
            this.L.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.z.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.e.setVisibility((this.z.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || ((this.I == null || this.K) ? '\b' : (char) 0) == 0) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.i;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.d;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.D.q && textInputLayout.o()) ? 0 : 8);
        k();
        m();
        if (this.B != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void m() {
        TextInputLayout textInputLayout = this.d;
        if (textInputLayout.w == null) {
            return;
        }
        this.J.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.w.getPaddingTop(), (d() || e()) ? 0 : textInputLayout.w.getPaddingEnd(), textInputLayout.w.getPaddingBottom());
    }

    public final void n() {
        i0 i0Var = this.J;
        int visibility = i0Var.getVisibility();
        int i = (this.I == null || this.K) ? 8 : 0;
        if (visibility != i) {
            b().o(i == 0);
        }
        k();
        i0Var.setVisibility(i);
        this.d.s();
    }
}
