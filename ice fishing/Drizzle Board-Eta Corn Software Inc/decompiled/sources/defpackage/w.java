package defpackage;

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

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class w extends TextView {
    public final s MdtA4re8;
    public final VM67d7Sv NCTxEWno;
    public boolean P7K7Inc8;
    public Future Qr9iLBAD;
    public qoZa66xm VgvYg0wo;
    public tg0 b2ZJblxo;
    public final mcXgUFR8 wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qc0.qoPGr6Ce(context);
        this.P7K7Inc8 = false;
        this.b2ZJblxo = null;
        ic0.qoPGr6Ce(this, getContext());
        VM67d7Sv vM67d7Sv = new VM67d7Sv(this);
        this.NCTxEWno = vM67d7Sv;
        vM67d7Sv.eVhOlqcC(attributeSet, i);
        s sVar = new s(this);
        this.MdtA4re8 = sVar;
        sVar.P7K7Inc8(attributeSet, i);
        sVar.NCTxEWno();
        mcXgUFR8 mcxgufr8 = new mcXgUFR8(6, false);
        mcxgufr8.MdtA4re8 = this;
        this.wxUZMvaN = mcxgufr8;
        getEmojiTextViewHelper().qoPGr6Ce(attributeSet, i);
    }

    private qoZa66xm getEmojiTextViewHelper() {
        qoZa66xm qoza66xm = this.VgvYg0wo;
        if (qoza66xm != null) {
            return qoza66xm;
        }
        qoZa66xm qoza66xm2 = new qoZa66xm(this);
        this.VgvYg0wo = qoza66xm2;
        return qoza66xm2;
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.qoPGr6Ce();
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (fh0.MdtA4re8) {
            return super.getAutoSizeMaxTextSize();
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            return Math.round(sVar.jb9XjC4I.VgvYg0wo);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (fh0.MdtA4re8) {
            return super.getAutoSizeMinTextSize();
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            return Math.round(sVar.jb9XjC4I.wxUZMvaN);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (fh0.MdtA4re8) {
            return super.getAutoSizeStepGranularity();
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            return Math.round(sVar.jb9XjC4I.MdtA4re8);
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (fh0.MdtA4re8) {
            return super.getAutoSizeTextAvailableSizes();
        }
        s sVar = this.MdtA4re8;
        return sVar != null ? sVar.jb9XjC4I.P7K7Inc8 : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (fh0.MdtA4re8) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            return sVar.jb9XjC4I.qoPGr6Ce;
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return f50.KlHjfFWx(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return getPaddingTop() - getPaint().getFontMetricsInt().top;
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return getPaddingBottom() + getPaint().getFontMetricsInt().bottom;
    }

    public t getSuperCaller() {
        tg0 tg0Var = this.b2ZJblxo;
        if (tg0Var != null) {
            return tg0Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            v vVar = new v(this);
            this.b2ZJblxo = vVar;
            return vVar;
        }
        if (i >= 28) {
            u uVar = new u(this);
            this.b2ZJblxo = uVar;
            return uVar;
        }
        if (i < 26) {
            return tg0Var;
        }
        tg0 tg0Var2 = new tg0(6, this);
        this.b2ZJblxo = tg0Var2;
        return tg0Var2;
    }

    public ColorStateList getSupportBackgroundTintList() {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            return vM67d7Sv.Qr9iLBAD();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            return vM67d7Sv.jb9XjC4I();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.MdtA4re8.wxUZMvaN();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.MdtA4re8.VgvYg0wo();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        Future future = this.Qr9iLBAD;
        if (future != null) {
            try {
                this.Qr9iLBAD = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                f50.eVhOlqcC(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        mcXgUFR8 mcxgufr8;
        if (Build.VERSION.SDK_INT >= 28 || (mcxgufr8 = this.wxUZMvaN) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) mcxgufr8.wxUZMvaN;
        return textClassifier == null ? m.qoPGr6Ce((TextView) mcxgufr8.MdtA4re8) : textClassifier;
    }

    public c00 getTextMetricsParamsCompat() {
        return f50.eVhOlqcC(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.MdtA4re8.getClass();
        s.Qr9iLBAD(editorInfo, onCreateInputConnection, this);
        ej0.SgZGMMPL(editorInfo, onCreateInputConnection, this);
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
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        s sVar = this.MdtA4re8;
        if (sVar == null || fh0.MdtA4re8) {
            return;
        }
        sVar.jb9XjC4I.qoPGr6Ce();
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i, int i2) {
        Future future = this.Qr9iLBAD;
        if (future != null) {
            try {
                this.Qr9iLBAD = null;
                if (future.get() != null) {
                    throw new ClassCastException();
                }
                if (Build.VERSION.SDK_INT >= 29) {
                    throw null;
                }
                f50.eVhOlqcC(this);
                throw null;
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
        super.onMeasure(i, i2);
    }

    @Override // android.widget.TextView
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        super.onTextChanged(charSequence, i, i2, i3);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            b0 b0Var = sVar.jb9XjC4I;
            if (fh0.MdtA4re8 || !b0Var.P7K7Inc8()) {
                return;
            }
            b0Var.qoPGr6Ce();
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().NCTxEWno(z);
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithConfiguration(int i, int i2, int i3, int i4) {
        if (fh0.MdtA4re8) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i, i2, i3, i4);
            return;
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.jb9XjC4I(i, i2, i3, i4);
        }
    }

    @Override // android.widget.TextView
    public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i) {
        if (fh0.MdtA4re8) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i);
            return;
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.eVhOlqcC(iArr, i);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i) {
        if (fh0.MdtA4re8) {
            super.setAutoSizeTextTypeWithDefaults(i);
            return;
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.k3x7lurq(i);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.ow5vqvCr();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.OnDfzHZD(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i != 0 ? ra.Ey6iv0m0(context, i) : null, i2 != 0 ? ra.Ey6iv0m0(context, i2) : null, i3 != 0 ? ra.Ey6iv0m0(context, i3) : null, i4 != 0 ? ra.Ey6iv0m0(context, i4) : null);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(int i, int i2, int i3, int i4) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i != 0 ? ra.Ey6iv0m0(context, i) : null, i2 != 0 ? ra.Ey6iv0m0(context, i2) : null, i3 != 0 ? ra.Ey6iv0m0(context, i3) : null, i4 != 0 ? ra.Ey6iv0m0(context, i4) : null);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(f50.Ey6iv0m0(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().MdtA4re8(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((w30) getEmojiTextViewHelper().NCTxEWno.MdtA4re8).lwWCatUu(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().lDXGDhIF(i);
        } else {
            f50.sjUBp5pO(this, i);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().P7K7Inc8(i);
        } else {
            f50.OxcuoDLp(this, i);
        }
    }

    @Override // android.widget.TextView
    public final void setLineHeight(int i, float f) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34) {
            getSuperCaller().KlHjfFWx(i, f);
        } else if (i2 >= 34) {
            hzgxAD8d.Qr9iLBAD(this, i, f);
        } else {
            f50.amk52bBQ(this, Math.round(TypedValue.applyDimension(i, f, getResources().getDisplayMetrics())));
        }
    }

    public void setPrecomputedText(d00 d00Var) {
        if (Build.VERSION.SDK_INT >= 29) {
            throw null;
        }
        f50.eVhOlqcC(this);
        throw null;
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.amk52bBQ(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.KlHjfFWx(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        s sVar = this.MdtA4re8;
        sVar.ow5vqvCr(colorStateList);
        sVar.NCTxEWno();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        s sVar = this.MdtA4re8;
        sVar.OnDfzHZD(mode);
        sVar.NCTxEWno();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.b2ZJblxo(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        mcXgUFR8 mcxgufr8;
        if (Build.VERSION.SDK_INT >= 28 || (mcxgufr8 = this.wxUZMvaN) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            mcxgufr8.wxUZMvaN = textClassifier;
        }
    }

    public void setTextFuture(Future<d00> future) {
        this.Qr9iLBAD = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(c00 c00Var) {
        TextDirectionHeuristic textDirectionHeuristic;
        TextDirectionHeuristic textDirectionHeuristic2 = c00Var.NCTxEWno;
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
        getPaint().set(c00Var.qoPGr6Ce);
        setBreakStrategy(c00Var.MdtA4re8);
        setHyphenationFrequency(c00Var.wxUZMvaN);
    }

    @Override // android.widget.TextView
    public final void setTextSize(int i, float f) {
        boolean z = fh0.MdtA4re8;
        if (z) {
            super.setTextSize(i, f);
            return;
        }
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            b0 b0Var = sVar.jb9XjC4I;
            if (z || b0Var.P7K7Inc8()) {
                return;
            }
            b0Var.b2ZJblxo(i, f);
        }
    }

    @Override // android.widget.TextView
    public final void setTypeface(Typeface typeface, int i) {
        Typeface typeface2;
        if (this.P7K7Inc8) {
            return;
        }
        if (typeface == null || i <= 0) {
            typeface2 = null;
        } else {
            Context context = getContext();
            e50 e50Var = me0.qoPGr6Ce;
            if (context == null) {
                m1.sjUBp5pO("Context cannot be null");
                return;
            }
            typeface2 = Typeface.create(typeface, i);
        }
        this.P7K7Inc8 = true;
        if (typeface2 != null) {
            typeface = typeface2;
        }
        try {
            super.setTypeface(typeface, i);
        } finally {
            this.P7K7Inc8 = false;
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i) {
        f50.amk52bBQ(this, i);
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    public w(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }
}
