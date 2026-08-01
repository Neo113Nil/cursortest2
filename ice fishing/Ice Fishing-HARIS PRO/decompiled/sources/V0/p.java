package V0;

import O.K;
import a.AbstractC0078a;
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
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.C0245b0;

/* loaded from: classes.dex */
public final class p extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    public final TextInputLayout f1299a;

    /* renamed from: b, reason: collision with root package name */
    public final FrameLayout f1300b;

    /* renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f1301c;

    /* renamed from: d, reason: collision with root package name */
    public ColorStateList f1302d;
    public PorterDuff.Mode e;

    /* renamed from: f, reason: collision with root package name */
    public View.OnLongClickListener f1303f;

    /* renamed from: g, reason: collision with root package name */
    public final CheckableImageButton f1304g;

    /* renamed from: h, reason: collision with root package name */
    public final o f1305h;
    public int i;
    public final LinkedHashSet j;

    /* renamed from: k, reason: collision with root package name */
    public ColorStateList f1306k;

    /* renamed from: l, reason: collision with root package name */
    public PorterDuff.Mode f1307l;

    /* renamed from: m, reason: collision with root package name */
    public int f1308m;

    /* renamed from: n, reason: collision with root package name */
    public ImageView.ScaleType f1309n;

    /* renamed from: o, reason: collision with root package name */
    public View.OnLongClickListener f1310o;

    /* renamed from: p, reason: collision with root package name */
    public CharSequence f1311p;

    /* renamed from: q, reason: collision with root package name */
    public final C0245b0 f1312q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f1313r;

    /* renamed from: s, reason: collision with root package name */
    public EditText f1314s;

    /* renamed from: t, reason: collision with root package name */
    public final AccessibilityManager f1315t;

    /* renamed from: u, reason: collision with root package name */
    public Q.a f1316u;

    /* renamed from: v, reason: collision with root package name */
    public final l f1317v;

    public p(TextInputLayout textInputLayout, M0.h hVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.i = 0;
        this.j = new LinkedHashSet();
        this.f1317v = new l(this);
        m mVar = new m(this);
        this.f1315t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1299a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1300b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a2 = a(this, from, R.id.text_input_error_icon);
        this.f1301c = a2;
        CheckableImageButton a3 = a(frameLayout, from, R.id.text_input_end_icon);
        this.f1304g = a3;
        this.f1305h = new o(this, hVar);
        C0245b0 c0245b0 = new C0245b0(getContext(), null);
        this.f1312q = c0245b0;
        TypedArray typedArray = (TypedArray) hVar.f617c;
        if (typedArray.hasValue(38)) {
            this.f1302d = AbstractC0078a.A(getContext(), hVar, 38);
        }
        if (typedArray.hasValue(39)) {
            this.e = L0.m.i(typedArray.getInt(39, -1), null);
        }
        if (typedArray.hasValue(37)) {
            i(hVar.c(37));
        }
        a2.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap weakHashMap = K.f747a;
        a2.setImportantForAccessibility(2);
        a2.setClickable(false);
        a2.setPressable(false);
        a2.setFocusable(false);
        if (!typedArray.hasValue(53)) {
            if (typedArray.hasValue(32)) {
                this.f1306k = AbstractC0078a.A(getContext(), hVar, 32);
            }
            if (typedArray.hasValue(33)) {
                this.f1307l = L0.m.i(typedArray.getInt(33, -1), null);
            }
        }
        if (typedArray.hasValue(30)) {
            g(typedArray.getInt(30, 0));
            if (typedArray.hasValue(27) && a3.getContentDescription() != (text = typedArray.getText(27))) {
                a3.setContentDescription(text);
            }
            a3.setCheckable(typedArray.getBoolean(26, true));
        } else if (typedArray.hasValue(53)) {
            if (typedArray.hasValue(54)) {
                this.f1306k = AbstractC0078a.A(getContext(), hVar, 54);
            }
            if (typedArray.hasValue(55)) {
                this.f1307l = L0.m.i(typedArray.getInt(55, -1), null);
            }
            g(typedArray.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(51);
            if (a3.getContentDescription() != text2) {
                a3.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(29, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1308m) {
            this.f1308m = dimensionPixelSize;
            a3.setMinimumWidth(dimensionPixelSize);
            a3.setMinimumHeight(dimensionPixelSize);
            a2.setMinimumWidth(dimensionPixelSize);
            a2.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(31)) {
            ImageView.ScaleType o2 = R.j.o(typedArray.getInt(31, -1));
            this.f1309n = o2;
            a3.setScaleType(o2);
            a2.setScaleType(o2);
        }
        c0245b0.setVisibility(8);
        c0245b0.setId(R.id.textinput_suffix_text);
        c0245b0.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        c0245b0.setAccessibilityLiveRegion(1);
        c0245b0.setTextAppearance(typedArray.getResourceId(72, 0));
        if (typedArray.hasValue(73)) {
            c0245b0.setTextColor(hVar.b(73));
        }
        CharSequence text3 = typedArray.getText(71);
        this.f1311p = TextUtils.isEmpty(text3) ? null : text3;
        c0245b0.setText(text3);
        n();
        frameLayout.addView(a3);
        addView(c0245b0);
        addView(frameLayout);
        addView(a2);
        textInputLayout.f2623e0.add(mVar);
        if (textInputLayout.f2621d != null) {
            mVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new n(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (AbstractC0078a.M(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final q b() {
        q fVar;
        int i = this.i;
        o oVar = this.f1305h;
        SparseArray sparseArray = oVar.f1295a;
        q qVar = (q) sparseArray.get(i);
        if (qVar == null) {
            p pVar = oVar.f1296b;
            if (i == -1) {
                fVar = new f(pVar, 0);
            } else if (i == 0) {
                fVar = new f(pVar, 1);
            } else if (i == 1) {
                qVar = new x(pVar, oVar.f1298d);
                sparseArray.append(i, qVar);
            } else if (i == 2) {
                fVar = new e(pVar);
            } else {
                if (i != 3) {
                    throw new IllegalArgumentException(D1.h.e("Invalid end icon mode: ", i));
                }
                fVar = new k(pVar);
            }
            qVar = fVar;
            sparseArray.append(i, qVar);
        }
        return qVar;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f1304g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = K.f747a;
        return this.f1312q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f1300b.getVisibility() == 0 && this.f1304g.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f1301c.getVisibility() == 0;
    }

    public final void f(boolean z2) {
        boolean z3;
        boolean isActivated;
        boolean z4;
        q b2 = b();
        boolean k2 = b2.k();
        CheckableImageButton checkableImageButton = this.f1304g;
        boolean z5 = true;
        if (!k2 || (z4 = checkableImageButton.f2549d) == b2.l()) {
            z3 = false;
        } else {
            checkableImageButton.setChecked(!z4);
            z3 = true;
        }
        if (!(b2 instanceof k) || (isActivated = checkableImageButton.isActivated()) == b2.j()) {
            z5 = z3;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z2 || z5) {
            R.j.g0(this.f1299a, checkableImageButton, this.f1306k);
        }
    }

    public final void g(int i) {
        if (this.i == i) {
            return;
        }
        q b2 = b();
        Q.a aVar = this.f1316u;
        AccessibilityManager accessibilityManager = this.f1315t;
        if (aVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(aVar));
        }
        this.f1316u = null;
        b2.s();
        this.i = i;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            it.next().getClass();
            throw new ClassCastException();
        }
        h(i != 0);
        q b3 = b();
        int i2 = this.f1305h.f1297c;
        if (i2 == 0) {
            i2 = b3.d();
        }
        Drawable n2 = i2 != 0 ? h0.f.n(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.f1304g;
        checkableImageButton.setImageDrawable(n2);
        TextInputLayout textInputLayout = this.f1299a;
        if (n2 != null) {
            R.j.e(textInputLayout, checkableImageButton, this.f1306k, this.f1307l);
            R.j.g0(textInputLayout, checkableImageButton, this.f1306k);
        }
        int c2 = b3.c();
        CharSequence text = c2 != 0 ? getResources().getText(c2) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b3.k());
        if (!b3.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b3.r();
        Q.a h2 = b3.h();
        this.f1316u = h2;
        if (h2 != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = K.f747a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new P.b(this.f1316u));
            }
        }
        View.OnClickListener f2 = b3.f();
        View.OnLongClickListener onLongClickListener = this.f1310o;
        checkableImageButton.setOnClickListener(f2);
        R.j.l0(checkableImageButton, onLongClickListener);
        EditText editText = this.f1314s;
        if (editText != null) {
            b3.m(editText);
            j(b3);
        }
        R.j.e(textInputLayout, checkableImageButton, this.f1306k, this.f1307l);
        f(true);
    }

    public final void h(boolean z2) {
        if (d() != z2) {
            this.f1304g.setVisibility(z2 ? 0 : 8);
            k();
            m();
            this.f1299a.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1301c;
        checkableImageButton.setImageDrawable(drawable);
        l();
        R.j.e(this.f1299a, checkableImageButton, this.f1302d, this.e);
    }

    public final void j(q qVar) {
        if (this.f1314s == null) {
            return;
        }
        if (qVar.e() != null) {
            this.f1314s.setOnFocusChangeListener(qVar.e());
        }
        if (qVar.g() != null) {
            this.f1304g.setOnFocusChangeListener(qVar.g());
        }
    }

    public final void k() {
        this.f1300b.setVisibility((this.f1304g.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f1311p == null || this.f1313r) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f1301c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1299a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.j.f1342q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.i != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f1299a;
        if (textInputLayout.f2621d == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.f2621d;
            WeakHashMap weakHashMap = K.f747a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f2621d.getPaddingTop();
        int paddingBottom = textInputLayout.f2621d.getPaddingBottom();
        WeakHashMap weakHashMap2 = K.f747a;
        this.f1312q.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        C0245b0 c0245b0 = this.f1312q;
        int visibility = c0245b0.getVisibility();
        int i = (this.f1311p == null || this.f1313r) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        c0245b0.setVisibility(i);
        this.f1299a.q();
    }
}
