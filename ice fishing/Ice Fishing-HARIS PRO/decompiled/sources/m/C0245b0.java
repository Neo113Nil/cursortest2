package m;

import O.AbstractC0042s;
import a.AbstractC0078a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import k0.C0188b;

/* renamed from: m.b0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0245b0 extends TextView {

    /* renamed from: a, reason: collision with root package name */
    public final C0188b f3913a;

    /* renamed from: b, reason: collision with root package name */
    public final X f3914b;

    /* renamed from: c, reason: collision with root package name */
    public final C0237C f3915c;

    /* renamed from: d, reason: collision with root package name */
    public C0287x f3916d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public B.b f3917f;

    /* renamed from: g, reason: collision with root package name */
    public Future f3918g;

    public C0245b0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C0287x getEmojiTextViewHelper() {
        if (this.f3916d == null) {
            this.f3916d = new C0287x(this);
        }
        return this.f3916d;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0188b c0188b = this.f3913a;
        if (c0188b != null) {
            c0188b.a();
        }
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.b();
        }
    }

    public final void g() {
        Future future = this.f3918g;
        if (future == null) {
            return;
        }
        try {
            this.f3918g = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            R.j.I(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (h1.f3954c) {
            return super.getAutoSizeMaxTextSize();
        }
        X x2 = this.f3914b;
        if (x2 != null) {
            return Math.round(x2.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (h1.f3954c) {
            return super.getAutoSizeMinTextSize();
        }
        X x2 = this.f3914b;
        if (x2 != null) {
            return Math.round(x2.i.f3943d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (h1.f3954c) {
            return super.getAutoSizeStepGranularity();
        }
        X x2 = this.f3914b;
        if (x2 != null) {
            return Math.round(x2.i.f3942c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (h1.f3954c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        X x2 = this.f3914b;
        return x2 != null ? x2.i.f3944f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (h1.f3954c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        X x2 = this.f3914b;
        if (x2 != null) {
            return x2.i.f3940a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof R.i ? ((R.i) customSelectionActionModeCallback).f1005a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public Y getSuperCaller() {
        if (this.f3917f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f3917f = new C0243a0(this);
            } else if (i >= 28) {
                this.f3917f = new Z(this);
            } else {
                this.f3917f = new B.b(29, this);
            }
        }
        return this.f3917f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0188b c0188b = this.f3913a;
        if (c0188b != null) {
            return c0188b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0188b c0188b = this.f3913a;
        if (c0188b != null) {
            return c0188b.i();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f3914b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f3914b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        g();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0237C c0237c;
        if (Build.VERSION.SDK_INT >= 28 || (c0237c = this.f3915c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c0237c.f3796c;
        return textClassifier == null ? S.a((TextView) c0237c.f3795b) : textClassifier;
    }

    public M.d getTextMetricsParamsCompat() {
        return R.j.I(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f3914b.getClass();
        X.h(editorInfo, onCreateInputConnection, this);
        h0.f.u(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        super.onLayout(z2, i, i2, i3, i4);
        X x2 = this.f3914b;
        if (x2 == null || h1.f3954c) {
            return;
        }
        x2.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        g();
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        X x2 = this.f3914b;
        if (x2 == null || h1.f3954c) {
            return;
        }
        C0255g0 c0255g0 = x2.i;
        if (c0255g0.f()) {
            c0255g0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z2) {
        super.setAllCaps(z2);
        getEmojiTextViewHelper().b(z2);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (h1.f3954c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.i(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (h1.f3954c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (h1.f3954c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0188b c0188b = this.f3913a;
        if (c0188b != null) {
            c0188b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0188b c0188b = this.f3913a;
        if (c0188b != null) {
            c0188b.n(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R.j.u0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z2) {
        getEmojiTextViewHelper().c(z2);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((R.j) getEmojiTextViewHelper().f4055b.f10b).z(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().c(i);
        } else {
            R.j.k0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().x(i);
        } else {
            R.j.m0(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        R.j.n0(this, i);
    }

    public void setPrecomputedText(M.e eVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        R.j.I(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0188b c0188b = this.f3913a;
        if (c0188b != null) {
            c0188b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0188b c0188b = this.f3913a;
        if (c0188b != null) {
            c0188b.t(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        X x2 = this.f3914b;
        x2.l(colorStateList);
        x2.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        X x2 = this.f3914b;
        x2.m(mode);
        x2.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0237C c0237c;
        if (Build.VERSION.SDK_INT >= 28 || (c0237c = this.f3915c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0237c.f3796c = textClassifier;
        }
    }

    public void setTextFuture(Future<M.e> future) {
        this.f3918g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(M.d dVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = dVar.f597b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i = 7;
            }
        }
        setTextDirection(i);
        getPaint().set(dVar.f596a);
        setBreakStrategy(dVar.f598c);
        setHyphenationFrequency(dVar.f599d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z2 = h1.f3954c;
        if (z2) {
            super.setTextSize(i, f2);
            return;
        }
        X x2 = this.f3914b;
        if (x2 == null || z2) {
            return;
        }
        C0255g0 c0255g0 = x2.i;
        if (c0255g0.f()) {
            return;
        }
        c0255g0.g(i, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.e) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC0078a abstractC0078a = G.f.f268a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.e = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.e = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0245b0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        this.e = false;
        this.f3917f = null;
        Q0.a(this, getContext());
        C0188b c0188b = new C0188b(this);
        this.f3913a = c0188b;
        c0188b.k(attributeSet, i);
        X x2 = new X(this);
        this.f3914b = x2;
        x2.f(attributeSet, i);
        x2.b();
        C0237C c0237c = new C0237C();
        c0237c.f3795b = this;
        this.f3915c = c0237c;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().o(i, f2);
        } else if (i2 >= 34) {
            AbstractC0042s.h(this, i, f2);
        } else {
            R.j.n0(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? h0.f.n(context, i) : null, i2 != 0 ? h0.f.n(context, i2) : null, i3 != 0 ? h0.f.n(context, i3) : null, i4 != 0 ? h0.f.n(context, i4) : null);
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? h0.f.n(context, i) : null, i2 != 0 ? h0.f.n(context, i2) : null, i3 != 0 ? h0.f.n(context, i3) : null, i4 != 0 ? h0.f.n(context, i4) : null);
        X x2 = this.f3914b;
        if (x2 != null) {
            x2.b();
        }
    }
}
