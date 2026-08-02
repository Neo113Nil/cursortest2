package J3;

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
import com.IceFishing.LiveIceFishing.C5248R;
import com.google.android.gms.internal.ads.Wv;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import m.Z;

/* loaded from: classes2.dex */
public final class r extends LinearLayout {

    /* renamed from: A, reason: collision with root package name */
    public final q f1506A;

    /* renamed from: B, reason: collision with root package name */
    public int f1507B;

    /* renamed from: C, reason: collision with root package name */
    public final LinkedHashSet f1508C;

    /* renamed from: D, reason: collision with root package name */
    public ColorStateList f1509D;

    /* renamed from: E, reason: collision with root package name */
    public PorterDuff.Mode f1510E;

    /* renamed from: F, reason: collision with root package name */
    public int f1511F;

    /* renamed from: G, reason: collision with root package name */
    public ImageView.ScaleType f1512G;

    /* renamed from: H, reason: collision with root package name */
    public View.OnLongClickListener f1513H;

    /* renamed from: I, reason: collision with root package name */
    public CharSequence f1514I;
    public final Z J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f1515K;

    /* renamed from: L, reason: collision with root package name */
    public EditText f1516L;

    /* renamed from: M, reason: collision with root package name */
    public final AccessibilityManager f1517M;

    /* renamed from: N, reason: collision with root package name */
    public l f1518N;

    /* renamed from: O, reason: collision with root package name */
    public final n f1519O;

    /* renamed from: n, reason: collision with root package name */
    public final TextInputLayout f1520n;

    /* renamed from: u, reason: collision with root package name */
    public final FrameLayout f1521u;

    /* renamed from: v, reason: collision with root package name */
    public final CheckableImageButton f1522v;

    /* renamed from: w, reason: collision with root package name */
    public ColorStateList f1523w;

    /* renamed from: x, reason: collision with root package name */
    public PorterDuff.Mode f1524x;

    /* renamed from: y, reason: collision with root package name */
    public View.OnLongClickListener f1525y;

    /* renamed from: z, reason: collision with root package name */
    public final CheckableImageButton f1526z;

    public r(TextInputLayout textInputLayout, l4.g gVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        int i = 0;
        this.f1507B = 0;
        this.f1508C = new LinkedHashSet();
        this.f1519O = new n(this);
        o oVar = new o(this);
        this.f1517M = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.f1520n = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.f1521u = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton a9 = a(this, from, C5248R.id.text_input_error_icon);
        this.f1522v = a9;
        CheckableImageButton a10 = a(frameLayout, from, C5248R.id.text_input_end_icon);
        this.f1526z = a10;
        q qVar = new q();
        qVar.f1504c = new SparseArray();
        qVar.f1505d = this;
        TypedArray typedArray = (TypedArray) gVar.f38917v;
        qVar.f1502a = typedArray.getResourceId(28, 0);
        qVar.f1503b = typedArray.getResourceId(52, 0);
        this.f1506A = qVar;
        Z z6 = new Z(getContext(), null);
        this.J = z6;
        TypedArray typedArray2 = (TypedArray) gVar.f38917v;
        if (typedArray2.hasValue(38)) {
            this.f1523w = com.bumptech.glide.f.k(getContext(), gVar, 38);
        }
        if (typedArray2.hasValue(39)) {
            this.f1524x = A3.n.g(typedArray2.getInt(39, -1), null);
        }
        if (typedArray2.hasValue(37)) {
            i(gVar.i(37));
        }
        a9.setContentDescription(getResources().getText(C5248R.string.error_icon_content_description));
        WeakHashMap weakHashMap = X.f2142a;
        a9.setImportantForAccessibility(2);
        a9.setClickable(false);
        a9.setPressable(false);
        a9.setFocusable(false);
        if (!typedArray2.hasValue(53)) {
            if (typedArray2.hasValue(32)) {
                this.f1509D = com.bumptech.glide.f.k(getContext(), gVar, 32);
            }
            if (typedArray2.hasValue(33)) {
                this.f1510E = A3.n.g(typedArray2.getInt(33, -1), null);
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
                this.f1509D = com.bumptech.glide.f.k(getContext(), gVar, 54);
            }
            if (typedArray2.hasValue(55)) {
                this.f1510E = A3.n.g(typedArray2.getInt(55, -1), null);
            }
            g(typedArray2.getBoolean(53, false) ? 1 : 0);
            CharSequence text2 = typedArray2.getText(51);
            if (a10.getContentDescription() != text2) {
                a10.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray2.getDimensionPixelSize(29, getResources().getDimensionPixelSize(C5248R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            throw new IllegalArgumentException("endIconSize cannot be less than 0");
        }
        if (dimensionPixelSize != this.f1511F) {
            this.f1511F = dimensionPixelSize;
            a10.setMinimumWidth(dimensionPixelSize);
            a10.setMinimumHeight(dimensionPixelSize);
            a9.setMinimumWidth(dimensionPixelSize);
            a9.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray2.hasValue(31)) {
            ImageView.ScaleType f2 = com.bumptech.glide.f.f(typedArray2.getInt(31, -1));
            this.f1512G = f2;
            a10.setScaleType(f2);
            a9.setScaleType(f2);
        }
        z6.setVisibility(8);
        z6.setId(C5248R.id.textinput_suffix_text);
        z6.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        z6.setAccessibilityLiveRegion(1);
        z6.setTextAppearance(typedArray2.getResourceId(72, 0));
        if (typedArray2.hasValue(73)) {
            z6.setTextColor(gVar.h(73));
        }
        CharSequence text3 = typedArray2.getText(71);
        this.f1514I = TextUtils.isEmpty(text3) ? null : text3;
        z6.setText(text3);
        n();
        frameLayout.addView(a10);
        addView(z6);
        addView(frameLayout);
        addView(a9);
        textInputLayout.f36844F0.add(oVar);
        if (textInputLayout.f36900w != null) {
            oVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new p(i, this));
    }

    public final CheckableImageButton a(ViewGroup viewGroup, LayoutInflater layoutInflater, int i) {
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflater.inflate(C5248R.layout.design_text_input_end_icon, viewGroup, false);
        checkableImageButton.setId(i);
        if (com.bumptech.glide.f.n(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        return checkableImageButton;
    }

    public final s b() {
        s c0322f;
        int i = this.f1507B;
        q qVar = this.f1506A;
        SparseArray sparseArray = (SparseArray) qVar.f1504c;
        s sVar = (s) sparseArray.get(i);
        if (sVar != null) {
            return sVar;
        }
        r rVar = (r) qVar.f1505d;
        if (i == -1) {
            c0322f = new C0322f(rVar, 0);
        } else if (i == 0) {
            c0322f = new C0322f(rVar, 1);
        } else if (i == 1) {
            c0322f = new z(rVar, qVar.f1503b);
        } else if (i == 2) {
            c0322f = new C0321e(rVar);
        } else {
            if (i != 3) {
                throw new IllegalArgumentException(Wv.f(i, "Invalid end icon mode: "));
            }
            c0322f = new m(rVar);
        }
        sparseArray.append(i, c0322f);
        return c0322f;
    }

    public final int c() {
        int marginStart;
        if (d() || e()) {
            CheckableImageButton checkableImageButton = this.f1526z;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        WeakHashMap weakHashMap = X.f2142a;
        return this.J.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean d() {
        return this.f1521u.getVisibility() == 0 && this.f1526z.getVisibility() == 0;
    }

    public final boolean e() {
        return this.f1522v.getVisibility() == 0;
    }

    public final void f(boolean z6) {
        boolean z9;
        boolean isActivated;
        boolean z10;
        s b9 = b();
        boolean k9 = b9.k();
        CheckableImageButton checkableImageButton = this.f1526z;
        boolean z11 = true;
        if (!k9 || (z10 = checkableImageButton.f36790w) == b9.l()) {
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
        if (z6 || z11) {
            com.bumptech.glide.f.s(this.f1520n, checkableImageButton, this.f1509D);
        }
    }

    public final void g(int i) {
        if (this.f1507B == i) {
            return;
        }
        s b9 = b();
        l lVar = this.f1518N;
        AccessibilityManager accessibilityManager = this.f1517M;
        if (lVar != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(new P.b(lVar));
        }
        this.f1518N = null;
        b9.s();
        this.f1507B = i;
        Iterator it = this.f1508C.iterator();
        if (it.hasNext()) {
            throw D.x.i(it);
        }
        h(i != 0);
        s b10 = b();
        int i4 = this.f1506A.f1502a;
        if (i4 == 0) {
            i4 = b10.d();
        }
        Drawable h3 = i4 != 0 ? com.bumptech.glide.g.h(getContext(), i4) : null;
        CheckableImageButton checkableImageButton = this.f1526z;
        checkableImageButton.setImageDrawable(h3);
        TextInputLayout textInputLayout = this.f1520n;
        if (h3 != null) {
            com.bumptech.glide.f.b(textInputLayout, checkableImageButton, this.f1509D, this.f1510E);
            com.bumptech.glide.f.s(textInputLayout, checkableImageButton, this.f1509D);
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
        this.f1518N = h9;
        if (h9 != null && accessibilityManager != null) {
            WeakHashMap weakHashMap = X.f2142a;
            if (isAttachedToWindow()) {
                accessibilityManager.addTouchExplorationStateChangeListener(new P.b(this.f1518N));
            }
        }
        View.OnClickListener f2 = b10.f();
        View.OnLongClickListener onLongClickListener = this.f1513H;
        checkableImageButton.setOnClickListener(f2);
        com.bumptech.glide.f.t(checkableImageButton, onLongClickListener);
        EditText editText = this.f1516L;
        if (editText != null) {
            b10.m(editText);
            j(b10);
        }
        com.bumptech.glide.f.b(textInputLayout, checkableImageButton, this.f1509D, this.f1510E);
        f(true);
    }

    public final void h(boolean z6) {
        if (d() != z6) {
            this.f1526z.setVisibility(z6 ? 0 : 8);
            k();
            m();
            this.f1520n.q();
        }
    }

    public final void i(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.f1522v;
        checkableImageButton.setImageDrawable(drawable);
        l();
        com.bumptech.glide.f.b(this.f1520n, checkableImageButton, this.f1523w, this.f1524x);
    }

    public final void j(s sVar) {
        if (this.f1516L == null) {
            return;
        }
        if (sVar.e() != null) {
            this.f1516L.setOnFocusChangeListener(sVar.e());
        }
        if (sVar.g() != null) {
            this.f1526z.setOnFocusChangeListener(sVar.g());
        }
    }

    public final void k() {
        this.f1521u.setVisibility((this.f1526z.getVisibility() != 0 || e()) ? 8 : 0);
        setVisibility((d() || e() || !((this.f1514I == null || this.f1515K) ? 8 : false)) ? 0 : 8);
    }

    public final void l() {
        CheckableImageButton checkableImageButton = this.f1522v;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.f1520n;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.f36838C.f1554q && textInputLayout.m()) ? 0 : 8);
        k();
        m();
        if (this.f1507B != 0) {
            return;
        }
        textInputLayout.q();
    }

    public final void m() {
        int i;
        TextInputLayout textInputLayout = this.f1520n;
        if (textInputLayout.f36900w == null) {
            return;
        }
        if (d() || e()) {
            i = 0;
        } else {
            EditText editText = textInputLayout.f36900w;
            WeakHashMap weakHashMap = X.f2142a;
            i = editText.getPaddingEnd();
        }
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C5248R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = textInputLayout.f36900w.getPaddingTop();
        int paddingBottom = textInputLayout.f36900w.getPaddingBottom();
        WeakHashMap weakHashMap2 = X.f2142a;
        this.J.setPaddingRelative(dimensionPixelSize, paddingTop, i, paddingBottom);
    }

    public final void n() {
        Z z6 = this.J;
        int visibility = z6.getVisibility();
        int i = (this.f1514I == null || this.f1515K) ? 8 : 0;
        if (visibility != i) {
            b().p(i == 0);
        }
        k();
        z6.setVisibility(i);
        this.f1520n.q();
    }
}
