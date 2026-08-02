package androidx.appcompat.widget;

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
import androidx.annotation.NonNull;
import defpackage.asq;
import defpackage.cdt;
import defpackage.fs0;
import defpackage.gfs;
import defpackage.hdg;
import defpackage.jlm;
import defpackage.jq0;
import defpackage.klm;
import defpackage.l1b;
import defpackage.lr0;
import defpackage.ls0;
import defpackage.ms0;
import defpackage.ns0;
import defpackage.oa2;
import defpackage.os0;
import defpackage.pt0;
import defpackage.sb;
import defpackage.sjs;
import defpackage.sld;
import defpackage.ts0;
import defpackage.u2x;
import defpackage.xq0;
import defpackage.y2x;
import defpackage.zhu;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements oa2 {
    public final jq0 a;
    public final ls0 b;
    public final pt0 c;
    public lr0 d;
    public boolean e;
    public sld f;
    public Future g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sjs.a(context);
        this.e = false;
        this.f = null;
        gfs.a(getContext(), this);
        jq0 jq0Var = new jq0(this);
        this.a = jq0Var;
        jq0Var.d(attributeSet, i);
        ls0 ls0Var = new ls0(this);
        this.b = ls0Var;
        ls0Var.f(attributeSet, i);
        ls0Var.b();
        pt0 pt0Var = new pt0();
        pt0Var.a = this;
        this.c = pt0Var;
        getEmojiTextViewHelper().b(attributeSet, i);
    }

    @NonNull
    private lr0 getEmojiTextViewHelper() {
        if (this.d == null) {
            this.d = new lr0(this);
        }
        return this.d;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.a();
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (zhu.c) {
            return super.getAutoSizeMaxTextSize();
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            return Math.round(ls0Var.i.e);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (zhu.c) {
            return super.getAutoSizeMinTextSize();
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            return Math.round(ls0Var.i.d);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (zhu.c) {
            return super.getAutoSizeStepGranularity();
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            return Math.round(ls0Var.i.c);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (zhu.c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        ls0 ls0Var = this.b;
        return ls0Var != null ? ls0Var.i.f : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (zhu.c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            return ls0Var.i.a;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return asq.W(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public ms0 getSuperCaller() {
        if (this.f == null) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 34) {
                this.f = new os0(this);
            } else if (i >= 28) {
                this.f = new ns0(this);
            } else if (i >= 26) {
                this.f = new sld(6, this);
            }
        }
        return this.f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            return jq0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                asq.F(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        pt0 pt0Var;
        if (Build.VERSION.SDK_INT >= 28 || (pt0Var = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) pt0Var.b;
        return textClassifier == null ? fs0.a((TextView) pt0Var.a) : textClassifier;
    }

    @NonNull
    public jlm getTextMetricsParamsCompat() {
        return asq.F(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        if (Build.VERSION.SDK_INT < 30 && onCreateInputConnection != null) {
            l1b.l(editorInfo, getText());
        }
        u2x.N(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33 || !onCheckIsTextEditor()) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        ls0 ls0Var = this.b;
        if (ls0Var == null || zhu.c) {
            return;
        }
        ls0Var.i.a();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.g;
        if (future != null) {
            try {
                this.g = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                asq.F(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ts0 ts0Var = ls0Var.i;
            if (zhu.c || !ts0Var.f()) {
                return;
            }
            ts0Var.a();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().c(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (zhu.c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.h(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (zhu.c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.i(iArr, i);
        }
    }

    @Override // android.widget.TextView, defpackage.oa2
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (zhu.c) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.j(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? y2x.w(context, i) : null, i2 != 0 ? y2x.w(context, i2) : null, i3 != 0 ? y2x.w(context, i3) : null, i4 != 0 ? y2x.w(context, i4) : null);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? y2x.w(context, i) : null, i2 != 0 ? y2x.w(context, i2) : null, i3 != 0 ? y2x.w(context, i3) : null, i4 != 0 ? y2x.w(context, i4) : null);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(asq.Z(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().d(z);
    }

    @Override // android.widget.TextView
    public void setFilters(@NonNull InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().B(i);
        } else {
            asq.O(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i);
        } else {
            asq.P(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().s(i, f);
        } else if (i2 >= 34) {
            sb.y(this, i, f);
        } else {
            asq.Q(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(@NonNull klm klmVar) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        asq.F(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jq0 jq0Var = this.a;
        if (jq0Var != null) {
            jq0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        ls0 ls0Var = this.b;
        ls0Var.k(colorStateList);
        ls0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        ls0 ls0Var = this.b;
        ls0Var.l(mode);
        ls0Var.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.g(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        pt0 pt0Var;
        if (Build.VERSION.SDK_INT >= 28 || (pt0Var = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            pt0Var.b = textClassifier;
        }
    }

    public void setTextFuture(Future<klm> future) {
        this.g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@NonNull jlm jlmVar) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = jlmVar.b;
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
        getPaint().set(jlmVar.a);
        setBreakStrategy(jlmVar.c);
        setHyphenationFrequency(jlmVar.d);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i, float f) {
        boolean z = zhu.c;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ts0 ts0Var = ls0Var.i;
            if (z || ts0Var.f()) {
                return;
            }
            ts0Var.g(i, f);
        }
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
            hdg hdgVar = cdt.a;
            if (context == null) {
                xq0.x("Context cannot be null");
                return;
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

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        asq.Q(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        ls0 ls0Var = this.b;
        if (ls0Var != null) {
            ls0Var.b();
        }
    }

    public AppCompatTextView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(@NonNull Context context) {
        this(context, null);
    }
}
