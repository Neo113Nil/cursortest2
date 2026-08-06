package h;

import android.R;
import android.annotation.SuppressLint;
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
import d.AbstractC0142a;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import u0.AbstractC1050a;
import w.AbstractC1057c;
import w.C1056b;

/* renamed from: h.t, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0223t extends TextView implements C.c {

    /* renamed from: a, reason: collision with root package name */
    public final C0218n f3351a;

    /* renamed from: b, reason: collision with root package name */
    public final C0222s f3352b;

    /* renamed from: c, reason: collision with root package name */
    public final x0.e f3353c;

    /* renamed from: d, reason: collision with root package name */
    public Future f3354d;

    public C0223t(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public final void d() {
        Future future = this.f3354d;
        if (future == null) {
            return;
        }
        try {
            this.f3354d = null;
            if (future.get() != null) {
                throw new ClassCastException();
            }
            if (Build.VERSION.SDK_INT >= 29) {
                throw null;
            }
            R1.l.q(this);
            throw null;
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0218n c0218n = this.f3351a;
        if (c0218n != null) {
            c0218n.a();
        }
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            c0222s.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (C.c.f104M) {
            return super.getAutoSizeMaxTextSize();
        }
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            return Math.round(c0222s.f3346i.f3362e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (C.c.f104M) {
            return super.getAutoSizeMinTextSize();
        }
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            return Math.round(c0222s.f3346i.f3361d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (C.c.f104M) {
            return super.getAutoSizeStepGranularity();
        }
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            return Math.round(c0222s.f3346i.f3360c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (C.c.f104M) {
            return super.getAutoSizeTextAvailableSizes();
        }
        C0222s c0222s = this.f3352b;
        return c0222s != null ? c0222s.f3346i.f3363f : new int[0];
    }

    @Override // android.widget.TextView
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (C.c.f104M) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            return c0222s.f3346i.f3358a;
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
        J1.h hVar;
        C0218n c0218n = this.f3351a;
        if (c0218n == null || (hVar = c0218n.f3295e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f868c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J1.h hVar;
        C0218n c0218n = this.f3351a;
        if (c0218n == null || (hVar = c0218n.f3295e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f869d;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        J1.h hVar = this.f3352b.f3345h;
        if (hVar != null) {
            return (ColorStateList) hVar.f868c;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        J1.h hVar = this.f3352b.f3345h;
        if (hVar != null) {
            return (PorterDuff.Mode) hVar.f869d;
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
        x0.e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f3353c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) eVar.f8531c;
        if (textClassifier != null) {
            return textClassifier;
        }
        TextClassificationManager textClassificationManager = (TextClassificationManager) ((C0223t) eVar.f8530b).getContext().getSystemService(TextClassificationManager.class);
        return textClassificationManager != null ? textClassificationManager.getTextClassifier() : TextClassifier.NO_OP;
    }

    public C1056b getTextMetricsParamsCompat() {
        return R1.l.q(this);
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
        C0222s c0222s = this.f3352b;
        if (c0222s == null || C.c.f104M) {
            return;
        }
        c0222s.f3346i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i2, int i3) {
        d();
        super.onMeasure(i2, i3);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
        super.onTextChanged(charSequence, i2, i3, i4);
        C0222s c0222s = this.f3352b;
        if (c0222s == null || C.c.f104M) {
            return;
        }
        C0224u c0224u = c0222s.f3346i;
        if (c0224u.f3358a != 0) {
            c0224u.a();
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) {
        if (C.c.f104M) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i2, i3, i4, i5);
            return;
        }
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            C0224u c0224u = c0222s.f3346i;
            DisplayMetrics displayMetrics = c0224u.f3367j.getResources().getDisplayMetrics();
            c0224u.i(TypedValue.applyDimension(i5, i2, displayMetrics), TypedValue.applyDimension(i5, i3, displayMetrics), TypedValue.applyDimension(i5, i4, displayMetrics));
            if (c0224u.g()) {
                c0224u.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i2) {
        if (C.c.f104M) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i2);
            return;
        }
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            C0224u c0224u = c0222s.f3346i;
            c0224u.getClass();
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i2 == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0224u.f3367j.getResources().getDisplayMetrics();
                    for (int i3 = 0; i3 < length; i3++) {
                        iArr2[i3] = Math.round(TypedValue.applyDimension(i2, iArr[i3], displayMetrics));
                    }
                }
                c0224u.f3363f = C0224u.b(iArr2);
                if (!c0224u.h()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0224u.f3364g = false;
            }
            if (c0224u.g()) {
                c0224u.a();
            }
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i2) {
        if (C.c.f104M) {
            super.setAutoSizeTextTypeWithDefaults(i2);
            return;
        }
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            C0224u c0224u = c0222s.f3346i;
            if (i2 == 0) {
                c0224u.f3358a = 0;
                c0224u.f3361d = -1.0f;
                c0224u.f3362e = -1.0f;
                c0224u.f3360c = -1.0f;
                c0224u.f3363f = new int[0];
                c0224u.f3359b = false;
                return;
            }
            if (i2 != 1) {
                c0224u.getClass();
                throw new IllegalArgumentException(C1.a.f(i2, "Unknown auto-size text type: "));
            }
            DisplayMetrics displayMetrics = c0224u.f3367j.getResources().getDisplayMetrics();
            c0224u.i(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (c0224u.g()) {
                c0224u.a();
            }
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0218n c0218n = this.f3351a;
        if (c0218n != null) {
            c0218n.f3293c = -1;
            c0218n.d(null);
            c0218n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0218n c0218n = this.f3351a;
        if (c0218n != null) {
            c0218n.c(i2);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            c0222s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            c0222s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            c0222s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            c0222s.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(R1.l.I(callback, this));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i2);
        } else {
            R1.l.C(this, i2);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i2) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i2);
        } else {
            R1.l.D(this, i2);
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

    public void setPrecomputedText(AbstractC1057c abstractC1057c) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        R1.l.q(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218n c0218n = this.f3351a;
        if (c0218n != null) {
            c0218n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218n c0218n = this.f3351a;
        if (c0218n != null) {
            c0218n.f(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        C0222s c0222s = this.f3352b;
        if (c0222s.f3345h == null) {
            c0222s.f3345h = new J1.h();
        }
        J1.h hVar = c0222s.f3345h;
        hVar.f868c = colorStateList;
        hVar.f867b = colorStateList != null;
        c0222s.f3339b = hVar;
        c0222s.f3340c = hVar;
        c0222s.f3341d = hVar;
        c0222s.f3342e = hVar;
        c0222s.f3343f = hVar;
        c0222s.f3344g = hVar;
        c0222s.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        C0222s c0222s = this.f3352b;
        if (c0222s.f3345h == null) {
            c0222s.f3345h = new J1.h();
        }
        J1.h hVar = c0222s.f3345h;
        hVar.f869d = mode;
        hVar.f866a = mode != null;
        c0222s.f3339b = hVar;
        c0222s.f3340c = hVar;
        c0222s.f3341d = hVar;
        c0222s.f3342e = hVar;
        c0222s.f3343f = hVar;
        c0222s.f3344g = hVar;
        c0222s.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i2) {
        super.setTextAppearance(context, i2);
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            c0222s.e(context, i2);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        x0.e eVar;
        if (Build.VERSION.SDK_INT >= 28 || (eVar = this.f3353c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            eVar.f8531c = textClassifier;
        }
    }

    public void setTextFuture(Future<AbstractC1057c> future) {
        this.f3354d = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(C1056b c1056b) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c1056b.f8510b;
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
        getPaint().set(c1056b.f8509a);
        C.o.e(this, c1056b.f8511c);
        C.o.h(this, c1056b.f8512d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i2, float f2) {
        boolean z2 = C.c.f104M;
        if (z2) {
            super.setTextSize(i2, f2);
            return;
        }
        C0222s c0222s = this.f3352b;
        if (c0222s == null || z2) {
            return;
        }
        C0224u c0224u = c0222s.f3346i;
        if (c0224u.f3358a != 0) {
            return;
        }
        c0224u.f(i2, f2);
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i2) {
        Typeface typeface2;
        if (typeface == null || i2 <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            AbstractC1050a abstractC1050a = r.d.f8452a;
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
    public C0223t(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        g0.a(context);
        C0218n c0218n = new C0218n(this);
        this.f3351a = c0218n;
        c0218n.b(attributeSet, i2);
        C0222s c0222s = new C0222s(this);
        this.f3352b = c0222s;
        c0222s.d(attributeSet, i2);
        c0222s.b();
        x0.e eVar = new x0.e(25, false);
        eVar.f8530b = this;
        this.f3353c = eVar;
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i2 != 0 ? AbstractC0142a.a(context, i2) : null, i3 != 0 ? AbstractC0142a.a(context, i3) : null, i4 != 0 ? AbstractC0142a.a(context, i4) : null, i5 != 0 ? AbstractC0142a.a(context, i5) : null);
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            c0222s.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i2, int i3, int i4, int i5) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i2 != 0 ? AbstractC0142a.a(context, i2) : null, i3 != 0 ? AbstractC0142a.a(context, i3) : null, i4 != 0 ? AbstractC0142a.a(context, i4) : null, i5 != 0 ? AbstractC0142a.a(context, i5) : null);
        C0222s c0222s = this.f3352b;
        if (c0222s != null) {
            c0222s.b();
        }
    }
}
