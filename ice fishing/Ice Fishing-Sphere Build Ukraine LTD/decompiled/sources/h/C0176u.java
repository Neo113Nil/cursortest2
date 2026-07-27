package h;

import a.AbstractC0069a;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import d.AbstractC0110a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import u.AbstractC0255c;
import u.C0254b;

/* renamed from: h.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0176u extends TextView implements A.c {

    /* renamed from: e, reason: collision with root package name */
    public final C0170n f2301e;

    /* renamed from: f, reason: collision with root package name */
    public final C0175t f2302f;

    /* renamed from: g, reason: collision with root package name */
    public final L.Q f2303g;

    /* renamed from: h, reason: collision with root package name */
    public Future f2304h;

    public C0176u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void d() {
        Future future = this.f2304h;
        if (future == null) {
            return;
        }
        try {
            this.f2304h = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            AbstractC0069a.q(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0170n c0170n = this.f2301e;
        if (c0170n != null) {
            c0170n.a();
        }
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            c0175t.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (A.c.f11a) {
            return super.getAutoSizeMaxTextSize();
        }
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            return Math.round(c0175t.f2289i.f2312e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (A.c.f11a) {
            return super.getAutoSizeMinTextSize();
        }
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            return Math.round(c0175t.f2289i.f2311d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (A.c.f11a) {
            return super.getAutoSizeStepGranularity();
        }
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            return Math.round(c0175t.f2289i.f2310c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (A.c.f11a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0175t c0175t = this.f2302f;
        return c0175t != null ? c0175t.f2289i.f2313f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (A.c.f11a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            return c0175t.f2289i.f2308a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0170n c0170n = this.f2301e;
        if (c0170n == null || (j0Var = c0170n.f2239e) == null) {
            return null;
        }
        return j0Var.f2217a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0170n c0170n = this.f2301e;
        if (c0170n == null || (j0Var = c0170n.f2239e) == null) {
            return null;
        }
        return j0Var.f2218b;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        j0 j0Var = this.f2302f.f2288h;
        if (j0Var != null) {
            return j0Var.f2217a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        j0 j0Var = this.f2302f.f2288h;
        if (j0Var != null) {
            return j0Var.f2218b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        d();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        L.Q q2;
        if (Build.VERSION.SDK_INT >= 28 || (q2 = this.f2303g) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) q2.f520g;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0176u) q2.f519f).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public C0254b getTextMetricsParamsCompat() {
        return AbstractC0069a.q(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        C0175t c0175t = this.f2302f;
        if (c0175t == null || A.c.f11a) {
            return;
        }
        c0175t.f2289i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        d();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0175t c0175t = this.f2302f;
        if (c0175t == null || A.c.f11a) {
            return;
        }
        C0177v c0177v = c0175t.f2289i;
        if (c0177v.f2308a != 0) {
            c0177v.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (A.c.f11a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            C0177v c0177v = c0175t.f2289i;
            DisplayMetrics displayMetrics = c0177v.f2317j.getResources().getDisplayMetrics();
            c0177v.i(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0177v.g()) {
                c0177v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (A.c.f11a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            C0177v c0177v = c0175t.f2289i;
            c0177v.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0177v.f2317j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0177v.f2313f = C0177v.b(iArr2);
                if (!c0177v.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0177v.f2314g = false;
            }
            if (c0177v.g()) {
                c0177v.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (A.c.f11a) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            C0177v c0177v = c0175t.f2289i;
            if (i2 == 0) {
                c0177v.f2308a = 0;
                c0177v.f2311d = -1.0f;
                c0177v.f2312e = -1.0f;
                c0177v.f2310c = -1.0f;
                c0177v.f2313f = new int[0];
                c0177v.f2309b = false;
                return;
            }
            if (i2 != 1) {
                c0177v.getClass();
                throw new IllegalArgumentException(E0.h.e("Unknown auto-size text type: ", i2));
            }
            DisplayMetrics displayMetrics = c0177v.f2317j.getResources().getDisplayMetrics();
            c0177v.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0177v.g()) {
                c0177v.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170n c0170n = this.f2301e;
        if (c0170n != null) {
            c0170n.f2237c = -1;
            c0170n.d(null);
            c0170n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0170n c0170n = this.f2301e;
        if (c0170n != null) {
            c0170n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            c0175t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            c0175t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            c0175t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            c0175t.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC0069a.N(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            AbstractC0069a.D(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            AbstractC0069a.E(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        if (i2 != getPaint().getFontMetricsInt(null)) {
            setLineSpacing(i2 - r0, 1.0f);
        }
    }

    public void setPrecomputedText(AbstractC0255c abstractC0255c) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        AbstractC0069a.q(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170n c0170n = this.f2301e;
        if (c0170n != null) {
            c0170n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170n c0170n = this.f2301e;
        if (c0170n != null) {
            c0170n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0175t c0175t = this.f2302f;
        if (c0175t.f2288h == null) {
            c0175t.f2288h = new j0();
        }
        j0 j0Var = c0175t.f2288h;
        j0Var.f2217a = colorStateList;
        j0Var.f2220d = colorStateList != null;
        c0175t.f2282b = j0Var;
        c0175t.f2283c = j0Var;
        c0175t.f2284d = j0Var;
        c0175t.f2285e = j0Var;
        c0175t.f2286f = j0Var;
        c0175t.f2287g = j0Var;
        c0175t.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0175t c0175t = this.f2302f;
        if (c0175t.f2288h == null) {
            c0175t.f2288h = new j0();
        }
        j0 j0Var = c0175t.f2288h;
        j0Var.f2218b = mode;
        j0Var.f2219c = mode != null;
        c0175t.f2282b = j0Var;
        c0175t.f2283c = j0Var;
        c0175t.f2284d = j0Var;
        c0175t.f2285e = j0Var;
        c0175t.f2286f = j0Var;
        c0175t.f2287g = j0Var;
        c0175t.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            c0175t.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        L.Q q2;
        if (Build.VERSION.SDK_INT >= 28 || (q2 = this.f2303g) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            q2.f520g = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC0255c> future) {
        this.f2304h = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C0254b c0254b) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c0254b.f2996b;
        TextDirectionHeuristic textDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
        int i2 = 1;
        if (textDirectionHeuristic2 != textDirectionHeuristic3 && textDirectionHeuristic2 != (textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR)) {
            if (textDirectionHeuristic2 == TextDirectionHeuristics.ANYRTL_LTR) {
                i2 = 2;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LTR) {
                i2 = 3;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.RTL) {
                i2 = 4;
            } else if (textDirectionHeuristic2 == TextDirectionHeuristics.LOCALE) {
                i2 = 5;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic) {
                i2 = 6;
            } else if (textDirectionHeuristic2 == textDirectionHeuristic3) {
                i2 = 7;
            }
        }
        setTextDirection(i2);
        getPaint().set(c0254b.f2995a);
        A.o.e(this, c0254b.f2997c);
        A.o.h(this, c0254b.f2998d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        boolean z2 = A.c.f11a;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0175t c0175t = this.f2302f;
        if (c0175t == null || z2) {
            return;
        }
        C0177v c0177v = c0175t.f2289i;
        if (c0177v.f2308a != 0) {
            return;
        }
        c0177v.f(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            o.g gVar = p.d.f2805a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typeface2 = Typeface.create(typeface, i2);
        }
        if (typeface2 != null) {
            typeface = typeface2;
        }
        super.setTypeface(typeface, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0176u(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        i0.a(context);
        C0170n c0170n = new C0170n(this);
        this.f2301e = c0170n;
        c0170n.b(attributeSet, i2);
        C0175t c0175t = new C0175t(this);
        this.f2302f = c0175t;
        c0175t.d(attributeSet, i2);
        c0175t.b();
        L.Q q2 = new L.Q(10, false);
        q2.f519f = this;
        this.f2303g = q2;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0110a.a(context, i2) : null, i3 != 0 ? AbstractC0110a.a(context, i3) : null, i4 != 0 ? AbstractC0110a.a(context, i4) : null, i5 != 0 ? AbstractC0110a.a(context, i5) : null);
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            c0175t.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0110a.a(context, i2) : null, i3 != 0 ? AbstractC0110a.a(context, i3) : null, i4 != 0 ? AbstractC0110a.a(context, i4) : null, i5 != 0 ? AbstractC0110a.a(context, i5) : null);
        C0175t c0175t = this.f2302f;
        if (c0175t != null) {
            c0175t.b();
        }
    }
}
