package F3;

import O.X;
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
import com.google.android.gms.internal.ads.CL;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.icefishing.icefishingliveapp.C5284R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.Q0;
import m.Z;

/* loaded from: classes2.dex */
public final class r extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public final q f1063A;

    /* renamed from: B, reason: collision with root package name */
    public int f1064B;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashSet f1065C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f1066D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f1067E;

    /* renamed from: F, reason: collision with root package name */
    public int f1068F;

    /* renamed from: G, reason: collision with root package name */
    public ImageView.ScaleType f1069G;

    /* renamed from: H, reason: collision with root package name */
    public View.OnLongClickListener f1070H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f1071I;
    public final Z J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1072K;

    /* renamed from: L, reason: collision with root package name */
    public EditText f1073L;

    /* renamed from: M, reason: collision with root package name */
    public final AccessibilityManager f1074M;

    /* renamed from: N, reason: collision with root package name */
    public l f1075N;

    /* renamed from: O, reason: collision with root package name */
    public final n f1076O;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f1077n;

    /* renamed from: u, reason: collision with root package name */
    public final FrameLayout f1078u;

    /* renamed from: v, reason: collision with root package name */
    public final CheckableImageButton f1079v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f1080w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f1081x;

    /* renamed from: y, reason: collision with root package name */
    public View.OnLongClickListener f1082y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckableImageButton f1083z;

    public r(TextInputLayout textInputLayout, Q0 q02) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.f1064B = 0;
        this.f1065C = new LinkedHashSet();
        this.f1076O = new n(this);
        o oVar = new o(this);
        this.f1074M = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1077n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1078u = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a9 = a(this, from, C5284R.id.text_input_error_icon);
        this.f1079v = a9;
        CheckableImageButton a10 = a(frameLayout, from, C5284R.id.text_input_end_icon);
        this.f1083z = a10;
        q qVar = new q();
        qVar.f1061c = new SparseArray();
        qVar.f1062d = this;
        TypedArray typedArray = (TypedArray) q02.f39326c;
        qVar.f1059a = typedArray.getResourceId(28, 0);
        qVar.f1060b = typedArray.getResourceId(52, 0);
        this.f1063A = qVar;
        Z z8 = new Z(getContext(), null);
        this.J = z8;
        TypedArray typedArray2 = (TypedArray) q02.f39326c;
        if (typedArray2.hasValue(38)) {
            this.f1080w = com.bumptech.glide.d.p(getContext(), q02, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f1081x = w3.k.g(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(q02.g(37));
        }
        a9.setContentDescription(getResources().getText(C5284R.string.error_icon_content_description));
        WeakHashMap weakHashMap = X.f2240a;
        a9.setImportantForAccessibility(2);
        a9.setClickable(false);
        a9.setPressable(false);
        a9.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f1066D = com.bumptech.glide.d.p(getContext(), q02, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f1067E = w3.k.g(typedArray2.getInt(33, -1), null);
            }
        }
        if (typedArray2.hasValue(30)) {
            g(typedArray2.getInt(30, 0));
            if (typedArray2.hasValue(27) && a10.getContentDescription() != (text = typedArray2.getText(27))) {
                a10.setContentDescription(text);
            }
            a10.setCheckable(typedArray2.getBoolean(26, true));
        } else if (typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(54)) {
                this.f1066D = com.bumptech.glide.d.p(getContext(), q02, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f1067E = w3.k.g(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (a10.getContentDescription() != text2) {
                a10.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(C5284R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1068F) {
            this.f1068F = dimensionPixelSize;
            a10.setMinimumWidth(dimensionPixelSize);
            a10.setMinimumHeight(dimensionPixelSize);
            a9.setMinimumWidth(dimensionPixelSize);
            a9.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType d2 = Z5.c.d(typedArray2.getInt(31, -1));
            this.f1069G = d2;
            a10.setScaleType(d2);
            a9.setScaleType(d2);
        }
        z8.setVisibility(8);
        z8.setId(C5284R.id.textinput_suffix_text);
        z8.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        z8.setAccessibilityLiveRegion(1);
        z8.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            z8.setTextColor(q02.f(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f1071I = TextUtils.isEmpty(text3) ? null : text3;
        z8.setText(text3);
        n();
        frameLayout.addView(a10);
        addView(z8);
        addView(frameLayout);
        addView(a9);
        textInputLayout.f36250K0.add(oVar);
        if (textInputLayout.f36298w != null) {
            oVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new p(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C5284R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (com.bumptech.glide.d.u(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final s b() {
        s c0312f;
        int i = this.f1064B;
        q qVar = this.f1063A;
        SparseArray sparseArray = (SparseArray) qVar.f1061c;
        s sVar = (s) sparseArray.get(i);
        if (sVar != null) {
            return sVar;
        }
        r rVar = (r) qVar.f1062d;
        if (i == -1) {
            c0312f = new C0312f(rVar, 0);
        } else if (i == 0) {
            c0312f = new C0312f(rVar, 1);
        } else if (i == 1) {
            c0312f = new z(rVar, qVar.f1060b);
        } else if (i == 2) {
            c0312f = new C0311e(rVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(CL.i(i, "Invalid end icon mode: "));
            }
            c0312f = new m(rVar);
        }
        sparseArray.append(i, c0312f);
        return c0312f;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f1083z;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = X.f2240a;
        return this.J.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f1078u.getVisibility() == 0 && this.f1083z.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f1079v.getVisibility() == 0;
    }

    public final void f(boolean z8) {
        boolean z9;
        boolean isActivated;
        boolean z10;
        s b9 = b();
        boolean k6 = b9.k();
        CheckableImageButton checkableImageButton = this.f1083z;
        boolean z11 = true;
        if (!k6 || (z10 = checkableImageButton.f36187w) == b9.l()) {
            z9 = false;
        } else {
            checkableImageButton.setChecked(!z10);
            z9 = true;
        }
        if (!(b9 instanceof m) || (isActivated = checkableImageButton.isActivated()) == b9.j()) {
            z11 = z9;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z8 || z11) {
            Z5.c.n(this.f1077n, checkableImageButton, this.f1066D);
        }
    }

    public final void g(int i) {
        if (this.f1064B == i) {
            return;
        }
        s b9 = b();
        l lVar = this.f1075N;
        AccessibilityManager accessibilityManager = this.f1074M;
        if (lVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(lVar));
        }
        this.f1075N = null;
        b9.s();
        this.f1064B = i;
        Iterator it = this.f1065C.iterator();
        if (it.hasNext()) {
            throw D.y.h(it);
        }
        h(i != 0);
        s b10 = b();
        int i4 = this.f1063A.f1059a;
        if (i4 == 0) {
            i4 = b10.d();
        }
        Drawable h9 = i4 != 0 ? com.bumptech.glide.f.h(getContext(), i4) : null;
        CheckableImageButton checkableImageButton = this.f1083z;
        checkableImageButton.setImageDrawable(h9);
        TextInputLayout textInputLayout = this.f1077n;
        if (h9 != null) {
            Z5.c.a(textInputLayout, checkableImageButton, this.f1066D, this.f1067E);
            Z5.c.n(textInputLayout, checkableImageButton, this.f1066D);
        }
        int c4 = b10.c();
        CharSequence text = c4 != 0 ? getResources().getText(c4) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b10.k());
        if (!b10.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b10.r();
        l h10 = b10.h();
        this.f1075N = h10;
        if (h10 != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = X.f2240a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new P.b(this.f1075N));
            }
        }
        View.OnClickListener f6 = b10.f();
        View.OnLongClickListener onLongClickListener = this.f1070H;
        checkableImageButton.setOnClickListener(f6);
        Z5.c.o(checkableImageButton, onLongClickListener);
        EditText editText = this.f1073L;
        if (editText != null) {
            b10.m(editText);
            j(b10);
        }
        Z5.c.a(textInputLayout, checkableImageButton, this.f1066D, this.f1067E);
        f(true);
    }

    public final void h(boolean z8) {
        if (d() != z8) {
            this.f1083z.setVisibility(z8 ? 0 : 8);
            k();
            m();
            this.f1077n.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1079v;
        checkableImageButton.setImageDrawable(drawable);
        l();
        Z5.c.a(this.f1077n, checkableImageButton, this.f1080w, this.f1081x);
    }

    public final void j(s sVar) {
        if (this.f1073L == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f1073L.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f1083z.setOnFocusChangeListener(sVar.g());
        }
    }

    public final void k() {
        this.f1078u.setVisibility((this.f1083z.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f1071I == null || this.f1072K) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f1079v;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1077n;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f36235C.f1111q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f1064B != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f1077n;
        if (textInputLayout.f36298w == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.f36298w;
            WeakHashMap weakHashMap = X.f2240a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C5284R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f36298w.getPaddingTop();
        int paddingBottom = textInputLayout.f36298w.getPaddingBottom();
        WeakHashMap weakHashMap2 = X.f2240a;
        this.J.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        Z z8 = this.J;
        int visibility = z8.getVisibility();
        int i = (this.f1071I == null || this.f1072K) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        z8.setVisibility(i);
        this.f1077n.q();
    }
}
