package m;

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
import com.google.android.gms.internal.ads.C2749Pl;
import i1.C4586c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class Z extends TextView {

    /* renamed from: n, reason: collision with root package name */
    public final C2749Pl f39165n;

    /* renamed from: u, reason: collision with root package name */
    public final V f39166u;

    /* renamed from: v, reason: collision with root package name */
    public final C4679A f39167v;

    /* renamed from: w, reason: collision with root package name */
    public C4729v f39168w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f39169x;

    /* renamed from: y, reason: collision with root package name */
    public C4586c f39170y;

    /* renamed from: z, reason: collision with root package name */
    public Future f39171z;

    public Z(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private C4729v getEmojiTextViewHelper() {
        if (this.f39168w == null) {
            this.f39168w = new C4729v(this);
        }
        return this.f39168w;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2749Pl c2749Pl = this.f39165n;
        if (c2749Pl != null) {
            c2749Pl.a();
        }
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (g1.f39219c) {
            return super.getAutoSizeMaxTextSize();
        }
        V v9 = this.f39166u;
        if (v9 != null) {
            return Math.round(v9.i.f39206e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (g1.f39219c) {
            return super.getAutoSizeMinTextSize();
        }
        V v9 = this.f39166u;
        if (v9 != null) {
            return Math.round(v9.i.f39205d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (g1.f39219c) {
            return super.getAutoSizeStepGranularity();
        }
        V v9 = this.f39166u;
        if (v9 != null) {
            return Math.round(v9.i.f39204c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (g1.f39219c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        V v9 = this.f39166u;
        return v9 != null ? v9.i.f39207f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (g1.f39219c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        V v9 = this.f39166u;
        if (v9 != null) {
            return v9.i.f39202a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return d6.c.n(super.getCustomSelectionActionModeCallback());
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
        if (this.f39170y == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f39170y = new Y(this);
            } else if (i >= 28) {
                this.f39170y = new X(this);
            } else if (i >= 26) {
                this.f39170y = new C4586c(27, this);
            }
        }
        return this.f39170y;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2749Pl c2749Pl = this.f39165n;
        if (c2749Pl != null) {
            return c2749Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2749Pl c2749Pl = this.f39165n;
        if (c2749Pl != null) {
            return c2749Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f39166u.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f39166u.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        i();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C4679A c4679a;
        if (Build.VERSION.SDK_INT >= 28 || (c4679a = this.f39167v) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) c4679a.f39028c;
        return textClassifier == null ? P.a((TextView) c4679a.f39027b) : textClassifier;
    }

    public M.e getTextMetricsParamsCompat() {
        return d6.c.f(this);
    }

    public final void i() {
        Future future = this.f39171z;
        if (future == null) {
            return;
        }
        try {
            this.f39171z = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            d6.c.f(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f39166u.getClass();
        V.h(editorInfo, onCreateInputConnection, this);
        t8.g.m(editorInfo, onCreateInputConnection, this);
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
    public final void onLayout(boolean z6, int i, int i4, int i6, int i9) {
        super.onLayout(z6, i, i4, i6, i9);
        V v9 = this.f39166u;
        if (v9 == null || g1.f39219c) {
            return;
        }
        v9.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i4) {
        i();
        super.onMeasure(i, i4);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i4, int i6) {
        super.onTextChanged(charSequence, i, i4, i6);
        V v9 = this.f39166u;
        if (v9 == null || g1.f39219c) {
            return;
        }
        C4697e0 c4697e0 = v9.i;
        if (c4697e0.f()) {
            c4697e0.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z6) {
        super.setAllCaps(z6);
        getEmojiTextViewHelper().b(z6);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i4, int i6, int i9) {
        if (g1.f39219c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i4, i6, i9);
            return;
        }
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.i(i, i4, i6, i9);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (g1.f39219c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.j(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (g1.f39219c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.k(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2749Pl c2749Pl = this.f39165n;
        if (c2749Pl != null) {
            c2749Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2749Pl c2749Pl = this.f39165n;
        if (c2749Pl != null) {
            c2749Pl.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(d6.c.o(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z6) {
        getEmojiTextViewHelper().c(z6);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((com.bumptech.glide.d) getEmojiTextViewHelper().f39325b.f1291u).s(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().l(i);
        } else {
            d6.c.k(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().k(i);
        } else {
            d6.c.l(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        d6.c.m(this, i);
    }

    public void setPrecomputedText(M.f fVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        d6.c.f(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2749Pl c2749Pl = this.f39165n;
        if (c2749Pl != null) {
            c2749Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2749Pl c2749Pl = this.f39165n;
        if (c2749Pl != null) {
            c2749Pl.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        V v9 = this.f39166u;
        v9.l(colorStateList);
        v9.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        V v9 = this.f39166u;
        v9.m(mode);
        v9.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C4679A c4679a;
        if (Build.VERSION.SDK_INT >= 28 || (c4679a = this.f39167v) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c4679a.f39028c = textClassifier;
        }
    }

    public void setTextFuture(Future<M.f> future) {
        this.f39171z = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(M.e eVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = eVar.f1802b;
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
        getPaint().set(eVar.f1801a);
        U.m.e(this, eVar.f1803c);
        U.m.h(this, eVar.f1804d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f2) {
        boolean z6 = g1.f39219c;
        if (z6) {
            super.setTextSize(i, f2);
            return;
        }
        V v9 = this.f39166u;
        if (v9 == null || z6) {
            return;
        }
        C4697e0 c4697e0 = v9.i;
        if (c4697e0.f()) {
            return;
        }
        c4697e0.g(f2, i);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.f39169x) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            Q3.b bVar = G.j.f1038a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.f39169x = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.f39169x = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        this.f39169x = false;
        this.f39170y = null;
        N0.a(getContext(), this);
        C2749Pl c2749Pl = new C2749Pl(this);
        this.f39165n = c2749Pl;
        c2749Pl.d(attributeSet, i);
        V v9 = new V(this);
        this.f39166u = v9;
        v9.f(attributeSet, i);
        v9.b();
        C4679A c4679a = new C4679A();
        c4679a.f39027b = this;
        this.f39167v = c4679a;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f2) {
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 34) {
            getSuperCaller().m(i, f2);
        } else if (i4 >= 34) {
            U.p.a(this, i, f2);
        } else {
            d6.c.m(this, Math.round(TypedValue.applyDimension(i, f2, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i4, int i6, int i9) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? com.bumptech.glide.g.h(context, i) : null, i4 != 0 ? com.bumptech.glide.g.h(context, i4) : null, i6 != 0 ? com.bumptech.glide.g.h(context, i6) : null, i9 != 0 ? com.bumptech.glide.g.h(context, i9) : null);
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i4, int i6, int i9) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? com.bumptech.glide.g.h(context, i) : null, i4 != 0 ? com.bumptech.glide.g.h(context, i4) : null, i6 != 0 ? com.bumptech.glide.g.h(context, i6) : null, i9 != 0 ? com.bumptech.glide.g.h(context, i9) : null);
        V v9 = this.f39166u;
        if (v9 != null) {
            v9.b();
        }
    }
}
