package H3;

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
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import com.icefishing.icefishingbigwin.AbstractC4404f;
import com.icefishing.icefishingbigwin.C5275R;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.Z;

/* loaded from: classes2.dex */
public final class r extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public final q f1150A;

    /* renamed from: B, reason: collision with root package name */
    public int f1151B;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashSet f1152C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f1153D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f1154E;

    /* renamed from: F, reason: collision with root package name */
    public int f1155F;

    /* renamed from: G, reason: collision with root package name */
    public ImageView.ScaleType f1156G;

    /* renamed from: H, reason: collision with root package name */
    public View.OnLongClickListener f1157H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f1158I;
    public final Z J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1159K;

    /* renamed from: L, reason: collision with root package name */
    public EditText f1160L;

    /* renamed from: M, reason: collision with root package name */
    public final AccessibilityManager f1161M;

    /* renamed from: N, reason: collision with root package name */
    public l f1162N;

    /* renamed from: O, reason: collision with root package name */
    public final n f1163O;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f1164n;

    /* renamed from: u, reason: collision with root package name */
    public final FrameLayout f1165u;

    /* renamed from: v, reason: collision with root package name */
    public final CheckableImageButton f1166v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f1167w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f1168x;

    /* renamed from: y, reason: collision with root package name */
    public View.OnLongClickListener f1169y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckableImageButton f1170z;

    public r(TextInputLayout textInputLayout, j4.g gVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.f1151B = 0;
        this.f1152C = new LinkedHashSet();
        this.f1163O = new n(this);
        o oVar = new o(this);
        this.f1161M = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1164n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1165u = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a9 = a(this, from, C5275R.id.text_input_error_icon);
        this.f1166v = a9;
        CheckableImageButton a10 = a(frameLayout, from, C5275R.id.text_input_end_icon);
        this.f1170z = a10;
        q qVar = new q();
        qVar.f1148c = new SparseArray();
        qVar.f1149d = this;
        TypedArray typedArray = (TypedArray) gVar.f38405v;
        qVar.f1146a = typedArray.getResourceId(28, 0);
        qVar.f1147b = typedArray.getResourceId(52, 0);
        this.f1150A = qVar;
        Z z3 = new Z(getContext(), null);
        this.J = z3;
        TypedArray typedArray2 = (TypedArray) gVar.f38405v;
        if (typedArray2.hasValue(38)) {
            this.f1167w = O3.b.n(getContext(), gVar, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f1168x = y3.k.g(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(gVar.i(37));
        }
        a9.setContentDescription(getResources().getText(C5275R.string.error_icon_content_description));
        WeakHashMap weakHashMap = X.f2054a;
        a9.setImportantForAccessibility(2);
        a9.setClickable(false);
        a9.setPressable(false);
        a9.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f1153D = O3.b.n(getContext(), gVar, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f1154E = y3.k.g(typedArray2.getInt(33, -1), null);
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
                this.f1153D = O3.b.n(getContext(), gVar, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f1154E = y3.k.g(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (a10.getContentDescription() != text2) {
                a10.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(C5275R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1155F) {
            this.f1155F = dimensionPixelSize;
            a10.setMinimumWidth(dimensionPixelSize);
            a10.setMinimumHeight(dimensionPixelSize);
            a9.setMinimumWidth(dimensionPixelSize);
            a9.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType e9 = t8.g.e(typedArray2.getInt(31, -1));
            this.f1156G = e9;
            a10.setScaleType(e9);
            a9.setScaleType(e9);
        }
        z3.setVisibility(8);
        z3.setId(C5275R.id.textinput_suffix_text);
        z3.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        z3.setAccessibilityLiveRegion(1);
        z3.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            z3.setTextColor(gVar.h(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f1158I = TextUtils.isEmpty(text3) ? null : text3;
        z3.setText(text3);
        n();
        frameLayout.addView(a10);
        addView(z3);
        addView(frameLayout);
        addView(a9);
        textInputLayout.f36085K0.add(oVar);
        if (textInputLayout.f36133w != null) {
            oVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new p(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C5275R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (O3.b.y(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final s b() {
        s c0313f;
        int i = this.f1151B;
        q qVar = this.f1150A;
        SparseArray sparseArray = (SparseArray) qVar.f1148c;
        s sVar = (s) sparseArray.get(i);
        if (sVar != null) {
            return sVar;
        }
        r rVar = (r) qVar.f1149d;
        if (i == -1) {
            c0313f = new C0313f(rVar, 0);
        } else if (i == 0) {
            c0313f = new C0313f(rVar, 1);
        } else if (i == 1) {
            c0313f = new z(rVar, qVar.f1147b);
        } else if (i == 2) {
            c0313f = new C0312e(rVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(AbstractC4404f.e(i, "Invalid end icon mode: "));
            }
            c0313f = new m(rVar);
        }
        sparseArray.append(i, c0313f);
        return c0313f;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f1170z;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = X.f2054a;
        return this.J.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f1165u.getVisibility() == 0 && this.f1170z.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f1166v.getVisibility() == 0;
    }

    public final void f(boolean z3) {
        boolean z6;
        boolean isActivated;
        boolean z9;
        s b9 = b();
        boolean k9 = b9.k();
        CheckableImageButton checkableImageButton = this.f1170z;
        boolean z10 = true;
        if (!k9 || (z9 = checkableImageButton.f36022w) == b9.l()) {
            z6 = false;
        } else {
            checkableImageButton.setChecked(!z9);
            z6 = true;
        }
        if (!(b9 instanceof m) || (isActivated = checkableImageButton.isActivated()) == b9.j()) {
            z10 = z6;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z3 || z10) {
            t8.g.C(this.f1164n, checkableImageButton, this.f1153D);
        }
    }

    public final void g(int i) {
        if (this.f1151B == i) {
            return;
        }
        s b9 = b();
        l lVar = this.f1162N;
        AccessibilityManager accessibilityManager = this.f1161M;
        if (lVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(lVar));
        }
        this.f1162N = null;
        b9.s();
        this.f1151B = i;
        Iterator it = this.f1152C.iterator();
        if (it.hasNext()) {
            throw D.y.j(it);
        }
        h(i != 0);
        s b10 = b();
        int i6 = this.f1150A.f1146a;
        if (i6 == 0) {
            i6 = b10.d();
        }
        Drawable e9 = i6 != 0 ? com.bumptech.glide.g.e(getContext(), i6) : null;
        CheckableImageButton checkableImageButton = this.f1170z;
        checkableImageButton.setImageDrawable(e9);
        TextInputLayout textInputLayout = this.f1164n;
        if (e9 != null) {
            t8.g.a(textInputLayout, checkableImageButton, this.f1153D, this.f1154E);
            t8.g.C(textInputLayout, checkableImageButton, this.f1153D);
        }
        int c9 = b10.c();
        CharSequence text = c9 != 0 ? getResources().getText(c9) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(b10.k());
        if (!b10.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        b10.r();
        l h9 = b10.h();
        this.f1162N = h9;
        if (h9 != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = X.f2054a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new P.b(this.f1162N));
            }
        }
        View.OnClickListener f3 = b10.f();
        View.OnLongClickListener onLongClickListener = this.f1157H;
        checkableImageButton.setOnClickListener(f3);
        t8.g.F(checkableImageButton, onLongClickListener);
        EditText editText = this.f1160L;
        if (editText != null) {
            b10.m(editText);
            j(b10);
        }
        t8.g.a(textInputLayout, checkableImageButton, this.f1153D, this.f1154E);
        f(true);
    }

    public final void h(boolean z3) {
        if (d() != z3) {
            this.f1170z.setVisibility(z3 ? 0 : 8);
            k();
            m();
            this.f1164n.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1166v;
        checkableImageButton.setImageDrawable(drawable);
        l();
        t8.g.a(this.f1164n, checkableImageButton, this.f1167w, this.f1168x);
    }

    public final void j(s sVar) {
        if (this.f1160L == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f1160L.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f1170z.setOnFocusChangeListener(sVar.g());
        }
    }

    public final void k() {
        this.f1165u.setVisibility((this.f1170z.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f1158I == null || this.f1159K) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f1166v;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1164n;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f36070C.f1198q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f1151B != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f1164n;
        if (textInputLayout.f36133w == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.f36133w;
            WeakHashMap weakHashMap = X.f2054a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C5275R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f36133w.getPaddingTop();
        int paddingBottom = textInputLayout.f36133w.getPaddingBottom();
        WeakHashMap weakHashMap2 = X.f2054a;
        this.J.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        Z z3 = this.J;
        int visibility = z3.getVisibility();
        int i = (this.f1158I == null || this.f1159K) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        z3.setVisibility(i);
        this.f1164n.q();
    }
}
