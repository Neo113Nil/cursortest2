package defpackage;

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
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashSet;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class a7b extends LinearLayout {
    public final TextInputLayout a;
    public final FrameLayout b;
    public final CheckableImageButton c;
    public ColorStateList d;
    public PorterDuff.Mode e;
    public View.OnLongClickListener f;
    public final CheckableImageButton g;
    public final ah3 h;
    public int i;
    public final LinkedHashSet j;
    public ColorStateList k;
    public PorterDuff.Mode l;
    public int m;
    public ImageView.ScaleType n;
    public View.OnLongClickListener o;
    public CharSequence p;
    public final AppCompatTextView q;
    public boolean r;
    public EditText s;
    public final AccessibilityManager t;
    public AccessibilityManager.TouchExplorationStateChangeListener u;
    public final xj4 v;

    public a7b(TextInputLayout textInputLayout, lum lumVar) {
        super(textInputLayout.getContext());
        CharSequence text;
        this.i = 0;
        this.j = new LinkedHashSet();
        this.v = new xj4(this, 1);
        z6b z6bVar = new z6b(this);
        this.t = (AccessibilityManager) getContext().getSystemService("accessibility");
        this.a = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.b = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -1));
        LayoutInflater from = LayoutInflater.from(getContext());
        CheckableImageButton checkableImageButton = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) this, false);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (ivf.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).setMarginStart(0);
        }
        this.c = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) from.inflate(R.layout.design_text_input_end_icon, (ViewGroup) frameLayout, false);
        checkableImageButton2.setId(R.id.text_input_end_icon);
        if (ivf.H(getContext())) {
            ((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams()).setMarginStart(0);
        }
        this.g = checkableImageButton2;
        this.h = new ah3(this, lumVar);
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.q = appCompatTextView;
        TypedArray typedArray = (TypedArray) lumVar.b;
        if (typedArray.hasValue(39)) {
            this.d = ivf.C(getContext(), lumVar, 39);
        }
        if (typedArray.hasValue(40)) {
            this.e = fxf.L(typedArray.getInt(40, -1), null);
        }
        if (typedArray.hasValue(38)) {
            h(lumVar.M(38));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        checkableImageButton.setImportantForAccessibility(2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setCheckable(false);
        checkableImageButton.setFocusable(false);
        if (!typedArray.hasValue(55)) {
            if (typedArray.hasValue(33)) {
                this.k = ivf.C(getContext(), lumVar, 33);
            }
            if (typedArray.hasValue(34)) {
                this.l = fxf.L(typedArray.getInt(34, -1), null);
            }
        }
        if (typedArray.hasValue(31)) {
            f(typedArray.getInt(31, 0));
            if (typedArray.hasValue(28) && checkableImageButton2.getContentDescription() != (text = typedArray.getText(28))) {
                checkableImageButton2.setContentDescription(text);
            }
            checkableImageButton2.setCheckable(typedArray.getBoolean(27, true));
        } else if (typedArray.hasValue(55)) {
            if (typedArray.hasValue(56)) {
                this.k = ivf.C(getContext(), lumVar, 56);
            }
            if (typedArray.hasValue(57)) {
                this.l = fxf.L(typedArray.getInt(57, -1), null);
            }
            f(typedArray.getBoolean(55, false) ? 1 : 0);
            CharSequence text2 = typedArray.getText(53);
            if (checkableImageButton2.getContentDescription() != text2) {
                checkableImageButton2.setContentDescription(text2);
            }
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(30, getResources().getDimensionPixelSize(R.dimen.mtrl_min_touch_target_size));
        if (dimensionPixelSize < 0) {
            xq0.x("endIconSize cannot be less than 0");
            throw null;
        }
        if (dimensionPixelSize != this.m) {
            this.m = dimensionPixelSize;
            checkableImageButton2.setMinimumWidth(dimensionPixelSize);
            checkableImageButton2.setMinimumHeight(dimensionPixelSize);
            checkableImageButton.setMinimumWidth(dimensionPixelSize);
            checkableImageButton.setMinimumHeight(dimensionPixelSize);
        }
        if (typedArray.hasValue(32)) {
            ImageView.ScaleType M = cxb.M(typedArray.getInt(32, -1));
            this.n = M;
            checkableImageButton2.setScaleType(M);
            checkableImageButton.setScaleType(M);
        }
        appCompatTextView.setVisibility(8);
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2, 80.0f));
        appCompatTextView.setAccessibilityLiveRegion(1);
        appCompatTextView.setTextAppearance(typedArray.getResourceId(74, 0));
        if (typedArray.hasValue(75)) {
            appCompatTextView.setTextColor(lumVar.J(75));
        }
        CharSequence text3 = typedArray.getText(73);
        this.p = TextUtils.isEmpty(text3) ? null : text3;
        appCompatTextView.setText(text3);
        m();
        frameLayout.addView(checkableImageButton2);
        addView(appCompatTextView);
        addView(frameLayout);
        addView(checkableImageButton);
        textInputLayout.L0.add(z6bVar);
        if (textInputLayout.e != null) {
            z6bVar.a(textInputLayout);
        }
        addOnAttachStateChangeListener(new jb(5, this));
    }

    public final g7b a() {
        g7b yw6Var;
        int i = this.i;
        ah3 ah3Var = this.h;
        SparseArray sparseArray = (SparseArray) ah3Var.d;
        g7b g7bVar = (g7b) sparseArray.get(i);
        if (g7bVar != null) {
            return g7bVar;
        }
        a7b a7bVar = (a7b) ah3Var.e;
        if (i == -1) {
            yw6Var = new yw6(a7bVar, 0);
        } else if (i == 0) {
            yw6Var = new yw6(a7bVar, 1);
        } else if (i == 1) {
            yw6Var = new aak(a7bVar, ah3Var.c);
        } else if (i == 2) {
            yw6Var = new dn4(a7bVar);
        } else {
            if (i != 3) {
                xq0.x(k5r.i(i, "Invalid end icon mode: "));
                return null;
            }
            yw6Var = new wra(a7bVar);
        }
        sparseArray.append(i, yw6Var);
        return yw6Var;
    }

    public final int b() {
        int marginStart;
        if (c() || d()) {
            CheckableImageButton checkableImageButton = this.g;
            marginStart = ((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams()).getMarginStart() + checkableImageButton.getMeasuredWidth();
        } else {
            marginStart = 0;
        }
        return this.q.getPaddingEnd() + getPaddingEnd() + marginStart;
    }

    public final boolean c() {
        return this.b.getVisibility() == 0 && this.g.getVisibility() == 0;
    }

    public final boolean d() {
        return this.c.getVisibility() == 0;
    }

    public final void e(boolean z) {
        boolean z2;
        boolean isActivated;
        boolean z3;
        g7b a = a();
        boolean j = a.j();
        CheckableImageButton checkableImageButton = this.g;
        boolean z4 = true;
        if (!j || (z3 = checkableImageButton.d) == a.k()) {
            z2 = false;
        } else {
            checkableImageButton.setChecked(!z3);
            z2 = true;
        }
        if (!(a instanceof wra) || (isActivated = checkableImageButton.isActivated()) == ((wra) a).l) {
            z4 = z2;
        } else {
            checkableImageButton.setActivated(!isActivated);
        }
        if (z || z4) {
            cxb.d0(this.a, checkableImageButton, this.k);
        }
    }

    public final void f(int i) {
        if (this.i == i) {
            return;
        }
        g7b a = a();
        AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = this.u;
        AccessibilityManager accessibilityManager = this.t;
        if (touchExplorationStateChangeListener != null && accessibilityManager != null) {
            accessibilityManager.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
        }
        this.u = null;
        a.r();
        this.i = i;
        Iterator it = this.j.iterator();
        if (it.hasNext()) {
            throw hrg.j(it);
        }
        g(i != 0);
        g7b a2 = a();
        int i2 = this.h.b;
        if (i2 == 0) {
            i2 = a2.d();
        }
        Drawable w = i2 != 0 ? y2x.w(getContext(), i2) : null;
        CheckableImageButton checkableImageButton = this.g;
        checkableImageButton.setImageDrawable(w);
        TextInputLayout textInputLayout = this.a;
        if (w != null) {
            cxb.D(textInputLayout, checkableImageButton, this.k, this.l);
            cxb.d0(textInputLayout, checkableImageButton, this.k);
        }
        int c = a2.c();
        CharSequence text = c != 0 ? getResources().getText(c) : null;
        if (checkableImageButton.getContentDescription() != text) {
            checkableImageButton.setContentDescription(text);
        }
        checkableImageButton.setCheckable(a2.j());
        if (!a2.i(textInputLayout.getBoxBackgroundMode())) {
            throw new IllegalStateException("The current box background mode " + textInputLayout.getBoxBackgroundMode() + " is not supported by the end icon mode " + i);
        }
        a2.q();
        AccessibilityManager.TouchExplorationStateChangeListener h = a2.h();
        this.u = h;
        if (h != null && accessibilityManager != null && isAttachedToWindow()) {
            accessibilityManager.addTouchExplorationStateChangeListener(this.u);
        }
        View.OnClickListener f = a2.f();
        View.OnLongClickListener onLongClickListener = this.o;
        checkableImageButton.setOnClickListener(f);
        cxb.k0(checkableImageButton, onLongClickListener);
        EditText editText = this.s;
        if (editText != null) {
            a2.l(editText);
            i(a2);
        }
        cxb.D(textInputLayout, checkableImageButton, this.k, this.l);
        e(true);
    }

    public final void g(boolean z) {
        if (c() != z) {
            this.g.setVisibility(z ? 0 : 8);
            j();
            l();
            this.a.s();
        }
    }

    public final void h(Drawable drawable) {
        CheckableImageButton checkableImageButton = this.c;
        checkableImageButton.setImageDrawable(drawable);
        k();
        cxb.D(this.a, checkableImageButton, this.d, this.e);
    }

    public final void i(g7b g7bVar) {
        if (this.s == null) {
            return;
        }
        if (g7bVar.e() != null) {
            this.s.setOnFocusChangeListener(g7bVar.e());
        }
        if (g7bVar.g() != null) {
            this.g.setOnFocusChangeListener(g7bVar.g());
        }
    }

    public final void j() {
        this.b.setVisibility((this.g.getVisibility() != 0 || d()) ? 8 : 0);
        setVisibility((c() || d() || !((this.p == null || this.r) ? 8 : false)) ? 0 : 8);
    }

    public final void k() {
        CheckableImageButton checkableImageButton = this.c;
        Drawable drawable = checkableImageButton.getDrawable();
        TextInputLayout textInputLayout = this.a;
        checkableImageButton.setVisibility((drawable != null && textInputLayout.k.q && textInputLayout.o()) ? 0 : 8);
        j();
        l();
        if (this.i != 0) {
            return;
        }
        textInputLayout.s();
    }

    public final void l() {
        TextInputLayout textInputLayout = this.a;
        if (textInputLayout.e == null) {
            return;
        }
        this.q.setPaddingRelative(getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding), textInputLayout.e.getPaddingTop(), (c() || d()) ? 0 : textInputLayout.e.getPaddingEnd(), textInputLayout.e.getPaddingBottom());
    }

    public final void m() {
        AppCompatTextView appCompatTextView = this.q;
        int visibility = appCompatTextView.getVisibility();
        int i = (this.p == null || this.r) ? 8 : 0;
        if (visibility != i) {
            a().o(i == 0);
        }
        j();
        appCompatTextView.setVisibility(i);
        this.a.s();
    }
}
