package m;

import a.AbstractC0422a;
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
import com.google.android.gms.internal.ads.C2712Ol;
import g1.C4523c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class Z extends TextView {

    /* renamed from: n, reason: collision with root package name */
    public final C2712Ol f39096n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39097u;

    /* renamed from: v, reason: collision with root package name */
    public final C4667A f39098v;

    /* renamed from: w, reason: collision with root package name */
    public C4716v f39099w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39100x;

    /* renamed from: y, reason: collision with root package name */
    public C4523c f39101y;

    /* renamed from: z, reason: collision with root package name */
    public Future f39102z;

    public Z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C4716v getEmojiTextViewHelper() {
        if (this.f39099w == null) {
            this.f39099w = new C4716v(this);
        }
        return this.f39099w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2712Ol c2712Ol = this.f39096n;
        if (c2712Ol != null) {
            c2712Ol.a();
        }
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (f1.f39148c) {
            return super.getAutoSizeMaxTextSize();
        }
        V v9 = this.f39097u;
        if (v9 != null) {
            return Math.round(v9.i.f39137e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (f1.f39148c) {
            return super.getAutoSizeMinTextSize();
        }
        V v9 = this.f39097u;
        if (v9 != null) {
            return Math.round(v9.i.f39136d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (f1.f39148c) {
            return super.getAutoSizeStepGranularity();
        }
        V v9 = this.f39097u;
        if (v9 != null) {
            return Math.round(v9.i.f39135c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (f1.f39148c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        V v9 = this.f39097u;
        return v9 != null ? v9.i.f39138f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (f1.f39148c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v9 = this.f39097u;
        if (v9 != null) {
            return v9.i.f39133a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.c.q(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public W getSuperCaller() {
        if (this.f39101y == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f39101y = new Y(this);
            } else if (i >= 28) {
                this.f39101y = new X(this);
            } else if (i >= 26) {
                this.f39101y = new C4523c(26, this);
            }
        }
        return this.f39101y;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2712Ol c2712Ol = this.f39096n;
        if (c2712Ol != null) {
            return c2712Ol.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2712Ol c2712Ol = this.f39096n;
        if (c2712Ol != null) {
            return c2712Ol.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39097u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39097u.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        i();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C4667A c4667a;
        if (Build.VERSION.SDK_INT >= 28 || (c4667a = this.f39098v) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c4667a.f38960c;
        return textClassifier == null ? P.a((TextView) c4667a.f38959b) : textClassifier;
    }

    public M.e getTextMetricsParamsCompat() {
        return d6.c.g(this);
    }

    public final void i() {
        Future future = this.f39102z;
        if (future == null) {
            return;
        }
        try {
            this.f39102z = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            d6.c.g(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f39097u.getClass();
        V.h(editorInfo, onCreateInputConnection, this);
        t8.g.r(editorInfo, onCreateInputConnection, this);
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
    public final void onLayout(boolean z3, int i, int i6, int i9, int i10) {
        super.onLayout(z3, i, i6, i9, i10);
        V v9 = this.f39097u;
        if (v9 == null || f1.f39148c) {
            return;
        }
        v9.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i6) {
        i();
        super.onMeasure(i, i6);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i6, int i9) {
        super.onTextChanged(charSequence, i, i6, i9);
        V v9 = this.f39097u;
        if (v9 == null || f1.f39148c) {
            return;
        }
        C4684e0 c4684e0 = v9.i;
        if (c4684e0.f()) {
            c4684e0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z3) {
        super.setAllCaps(z3);
        getEmojiTextViewHelper().b(z3);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i6, int i9, int i10) {
        if (f1.f39148c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i6, i9, i10);
            return;
        }
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.i(i, i6, i9, i10);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (f1.f39148c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (f1.f39148c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2712Ol c2712Ol = this.f39096n;
        if (c2712Ol != null) {
            c2712Ol.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2712Ol c2712Ol = this.f39096n;
        if (c2712Ol != null) {
            c2712Ol.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.c.r(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z3) {
        getEmojiTextViewHelper().c(z3);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((AbstractC0422a) getEmojiTextViewHelper().f39256b.f37625u).m(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().y(i);
        } else {
            d6.c.n(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().o(i);
        } else {
            d6.c.o(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        d6.c.p(this, i);
    }

    public void setPrecomputedText(M.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        d6.c.g(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2712Ol c2712Ol = this.f39096n;
        if (c2712Ol != null) {
            c2712Ol.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2712Ol c2712Ol = this.f39096n;
        if (c2712Ol != null) {
            c2712Ol.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39097u;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39097u;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C4667A c4667a;
        if (Build.VERSION.SDK_INT >= 28 || (c4667a = this.f39098v) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c4667a.f38960c = textClassifier;
        }
    }

    public void setTextFuture(Future<M.f> future) {
        this.f39102z = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(M.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f1771b;
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
        getPaint().set(eVar.f1770a);
        U.m.e(this, eVar.f1772c);
        U.m.h(this, eVar.f1773d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f3) {
        boolean z3 = f1.f39148c;
        if (z3) {
            super.setTextSize(i, f3);
            return;
        }
        V v9 = this.f39097u;
        if (v9 == null || z3) {
            return;
        }
        C4684e0 c4684e0 = v9.i;
        if (c4684e0.f()) {
            return;
        }
        c4684e0.g(f3, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f39100x) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            V2.a aVar = G.j.f1012a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f39100x = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f39100x = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        this.f39100x = false;
        this.f39101y = null;
        N0.a(getContext(), this);
        C2712Ol c2712Ol = new C2712Ol(this);
        this.f39096n = c2712Ol;
        c2712Ol.d(attributeSet, i);
        V v9 = new V(this);
        this.f39097u = v9;
        v9.f(attributeSet, i);
        v9.b();
        C4667A c4667a = new C4667A();
        c4667a.f38959b = this;
        this.f39098v = c4667a;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f3) {
        int i6 = Build.VERSION.SDK_INT;
        if (i6 >= 34) {
            getSuperCaller().z(i, f3);
        } else if (i6 >= 34) {
            U.p.a(this, i, f3);
        } else {
            d6.c.p(this, Math.round(TypedValue.applyDimension(i, f3, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i6, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? com.bumptech.glide.g.e(context, i) : null, i6 != 0 ? com.bumptech.glide.g.e(context, i6) : null, i9 != 0 ? com.bumptech.glide.g.e(context, i9) : null, i10 != 0 ? com.bumptech.glide.g.e(context, i10) : null);
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i6, int i9, int i10) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? com.bumptech.glide.g.e(context, i) : null, i6 != 0 ? com.bumptech.glide.g.e(context, i6) : null, i9 != 0 ? com.bumptech.glide.g.e(context, i9) : null, i10 != 0 ? com.bumptech.glide.g.e(context, i10) : null);
        V v9 = this.f39097u;
        if (v9 != null) {
            v9.b();
        }
    }
}
