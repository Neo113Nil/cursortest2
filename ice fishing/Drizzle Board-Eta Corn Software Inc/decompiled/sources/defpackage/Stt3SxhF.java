package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class Stt3SxhF extends MultiAutoCompleteTextView {
    public static final int[] VgvYg0wo = {R.attr.popupBackground};
    public final s MdtA4re8;
    public final VM67d7Sv NCTxEWno;
    public final mcXgUFR8 wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Stt3SxhF(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.kolosta.rejin.jilosa.R.attr.autoCompleteTextViewStyle);
        qc0.qoPGr6Ce(context);
        ic0.qoPGr6Ce(this, getContext());
        f0 Mq3SeTnW = f0.Mq3SeTnW(getContext(), attributeSet, VgvYg0wo, com.kolosta.rejin.jilosa.R.attr.autoCompleteTextViewStyle);
        if (((TypedArray) Mq3SeTnW.MdtA4re8).hasValue(0)) {
            setDropDownBackgroundDrawable(Mq3SeTnW.OxcuoDLp(0));
        }
        Mq3SeTnW.SgZGMMPL();
        VM67d7Sv vM67d7Sv = new VM67d7Sv(this);
        this.NCTxEWno = vM67d7Sv;
        vM67d7Sv.eVhOlqcC(attributeSet, com.kolosta.rejin.jilosa.R.attr.autoCompleteTextViewStyle);
        s sVar = new s(this);
        this.MdtA4re8 = sVar;
        sVar.P7K7Inc8(attributeSet, com.kolosta.rejin.jilosa.R.attr.autoCompleteTextViewStyle);
        sVar.NCTxEWno();
        mcXgUFR8 mcxgufr8 = new mcXgUFR8(this, 5);
        this.wxUZMvaN = mcxgufr8;
        mcxgufr8.lwWCatUu(attributeSet, com.kolosta.rejin.jilosa.R.attr.autoCompleteTextViewStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = isFocusable();
        boolean isClickable = isClickable();
        boolean isLongClickable = isLongClickable();
        int inputType = getInputType();
        KeyListener FySoLYna = mcxgufr8.FySoLYna(keyListener);
        if (FySoLYna == keyListener) {
            return;
        }
        super.setKeyListener(FySoLYna);
        setRawInputType(inputType);
        setFocusable(isFocusable);
        setClickable(isClickable);
        setLongClickable(isLongClickable);
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ej0.SgZGMMPL(editorInfo, onCreateInputConnection, this);
        return this.wxUZMvaN.i7xS8jrb(onCreateInputConnection, editorInfo);
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

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i) {
        setDropDownBackgroundDrawable(ra.Ey6iv0m0(getContext(), i));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.wxUZMvaN.VhgXwMj9(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.wxUZMvaN.FySoLYna(keyListener));
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
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.b2ZJblxo(context, i);
        }
    }
}
