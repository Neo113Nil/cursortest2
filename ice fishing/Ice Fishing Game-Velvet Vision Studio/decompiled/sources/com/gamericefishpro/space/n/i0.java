package com.gamericefishpro.space.n;

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
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import com.gamericefishpro.space.i9.y3;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class i0 extends TextView {
    public final com.gamericefishpro.space.h2.w1 d;
    public final e0 e;
    public final com.gamericefishpro.space.u6.s i;
    public t v;
    public boolean w;
    public com.gamericefishpro.space.m.d y;
    public Future z;

    public i0(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    private t getEmojiTextViewHelper() {
        if (this.v == null) {
            this.v = new t(this);
        }
        return this.v;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.a();
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (k2.a) {
            return super.getAutoSizeMaxTextSize();
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            return Math.round(e0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (k2.a) {
            return super.getAutoSizeMinTextSize();
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            return Math.round(e0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (k2.a) {
            return super.getAutoSizeStepGranularity();
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            return Math.round(e0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (k2.a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        e0 e0Var = this.e;
        return e0Var != null ? e0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (k2.a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            return e0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        ActionMode.Callback customSelectionActionModeCallback = super.getCustomSelectionActionModeCallback();
        return customSelectionActionModeCallback instanceof com.gamericefishpro.space.h4.i ? ((com.gamericefishpro.space.h4.i) customSelectionActionModeCallback).a : customSelectionActionModeCallback;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public f0 getSuperCaller() {
        if (this.y == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.y = new h0(this);
            } else if (i >= 28) {
                this.y = new g0(this);
            } else {
                this.y = new com.gamericefishpro.space.m.d(7, this);
            }
        }
        return this.y;
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        w1 w1Var = this.e.h;
        if (w1Var != null) {
            return w1Var.a;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        w1 w1Var = this.e.h;
        if (w1Var != null) {
            return w1Var.b;
        }
        return null;
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.z;
        if (future != null) {
            try {
                this.z = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.gamericefishpro.space.i.a.x(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        com.gamericefishpro.space.u6.s sVar;
        if (Build.VERSION.SDK_INT >= 28 || (sVar = this.i) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) sVar.i;
        return textClassifier == null ? y.a((TextView) sVar.e) : textClassifier;
    }

    public com.gamericefishpro.space.b4.c getTextMetricsParamsCompat() {
        return com.gamericefishpro.space.i.a.x(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.e.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && inputConnectionOnCreateInputConnection != null) {
            CharSequence text = getText();
            if (i2 >= 30) {
                com.gamericefishpro.space.d4.i.g(editorInfo, text);
            } else {
                text.getClass();
                if (i2 >= 30) {
                    com.gamericefishpro.space.d4.i.g(editorInfo, text);
                } else {
                    int i3 = editorInfo.initialSelStart;
                    int i4 = editorInfo.initialSelEnd;
                    int i5 = i3 > i4 ? i4 : i3;
                    if (i3 <= i4) {
                        i3 = i4;
                    }
                    int length = text.length();
                    if (i5 < 0 || i3 > length || (i = editorInfo.inputType & 4095) == 129 || i == 225 || i == 18) {
                        y3.M(editorInfo, null, 0, 0);
                    } else if (length <= 2048) {
                        y3.M(editorInfo, text, i5, i3);
                    } else {
                        int i6 = i3 - i5;
                        int i7 = i6 > 1024 ? 0 : i6;
                        int i8 = 2048 - i7;
                        int iMin = Math.min(text.length() - i3, i8 - Math.min(i5, (int) (((double) i8) * 0.8d)));
                        int iMin2 = Math.min(i5, i8 - iMin);
                        int i9 = i5 - iMin2;
                        if (Character.isLowSurrogate(text.charAt(i9))) {
                            i9++;
                            iMin2--;
                        }
                        if (Character.isHighSurrogate(text.charAt((i3 + iMin) - 1))) {
                            iMin--;
                        }
                        int i10 = iMin2 + i7;
                        y3.M(editorInfo, i7 != i6 ? TextUtils.concat(text.subSequence(i9, i9 + iMin2), text.subSequence(i3, iMin + i3)) : text.subSequence(i9, i10 + iMin + i9), iMin2, i10);
                    }
                }
            }
        }
        y3.z(inputConnectionOnCreateInputConnection, editorInfo, this);
        return inputConnectionOnCreateInputConnection;
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        e0 e0Var = this.e;
        if (e0Var == null || k2.a) {
            return;
        }
        e0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.z;
        if (future != null) {
            try {
                this.z = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                com.gamericefishpro.space.i.a.x(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        e0 e0Var = this.e;
        if (e0Var != null) {
            n0 n0Var = e0Var.i;
            if (k2.a || !n0Var.f()) {
                return;
            }
            n0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        ((com.gamericefishpro.space.d9.h) getEmojiTextViewHelper().b.e).L(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (k2.a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.f(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (k2.a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.g(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (k2.a) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.h(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.g(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.gamericefishpro.space.i.a.T(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        ((com.gamericefishpro.space.d9.h) getEmojiTextViewHelper().b.e).M(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((com.gamericefishpro.space.d9.h) getEmojiTextViewHelper().b.e).z(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().h(i);
        } else {
            com.gamericefishpro.space.i.a.J(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().e(i);
        } else {
            com.gamericefishpro.space.i.a.K(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        com.gamericefishpro.space.i.a.L(this, i);
    }

    public void setPrecomputedText(com.gamericefishpro.space.b4.d dVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        com.gamericefishpro.space.i.a.x(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        e0 e0Var = this.e;
        e0Var.i(colorStateList);
        e0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        e0 e0Var = this.e;
        e0Var.j(mode);
        e0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.e(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        com.gamericefishpro.space.u6.s sVar;
        if (Build.VERSION.SDK_INT >= 28 || (sVar = this.i) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            sVar.i = textClassifier;
        }
    }

    public void setTextFuture(Future<com.gamericefishpro.space.b4.d> future) {
        this.z = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(com.gamericefishpro.space.b4.c cVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = cVar.b;
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
        getPaint().set(cVar.a);
        setBreakStrategy(cVar.c);
        setHyphenationFrequency(cVar.d);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = k2.a;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        e0 e0Var = this.e;
        if (e0Var != null) {
            n0 n0Var = e0Var.i;
            if (z || n0Var.f()) {
                return;
            }
            n0Var.g(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typefaceCreate;
        if (this.w) {
            return;
        }
        if (typeface == null || i <= 0) {
            typefaceCreate = null;
        } else {
            Context context = getContext();
            com.gamericefishpro.space.a.a aVar = com.gamericefishpro.space.u3.f.a;
            if (context == null) {
                throw new IllegalArgumentException("Context cannot be null");
            }
            typefaceCreate = Typeface.create(typeface, i);
        }
        this.w = true;
        if (typefaceCreate != null) {
            typeface = typefaceCreate;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.w = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        v1.a(context);
        this.w = false;
        this.y = null;
        u1.a(this, getContext());
        com.gamericefishpro.space.h2.w1 w1Var = new com.gamericefishpro.space.h2.w1(this);
        this.d = w1Var;
        w1Var.d(attributeSet, i);
        e0 e0Var = new e0(this);
        this.e = e0Var;
        e0Var.d(attributeSet, i);
        e0Var.b();
        com.gamericefishpro.space.u6.s sVar = new com.gamericefishpro.space.u6.s(6, false);
        sVar.e = this;
        this.i = sVar;
        getEmojiTextViewHelper().a(attributeSet, i);
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().i(i, f);
        } else if (i2 >= 34) {
            com.gamericefishpro.space.d4.v.k(this, i, f);
        } else {
            com.gamericefishpro.space.i.a.L(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? com.gamericefishpro.space.u6.f.x(context, i) : null, i2 != 0 ? com.gamericefishpro.space.u6.f.x(context, i2) : null, i3 != 0 ? com.gamericefishpro.space.u6.f.x(context, i3) : null, i4 != 0 ? com.gamericefishpro.space.u6.f.x(context, i4) : null);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? com.gamericefishpro.space.u6.f.x(context, i) : null, i2 != 0 ? com.gamericefishpro.space.u6.f.x(context, i2) : null, i3 != 0 ? com.gamericefishpro.space.u6.f.x(context, i3) : null, i4 != 0 ? com.gamericefishpro.space.u6.f.x(context, i4) : null);
        e0 e0Var = this.e;
        if (e0Var != null) {
            e0Var.b();
        }
    }
}
