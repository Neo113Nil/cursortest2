package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class c0 extends ToggleButton {
    public final s MdtA4re8;
    public final VM67d7Sv NCTxEWno;
    public qoZa66xm wxUZMvaN;

    public c0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.buttonStyleToggle);
        ic0.qoPGr6Ce(this, getContext());
        VM67d7Sv vM67d7Sv = new VM67d7Sv(this);
        this.NCTxEWno = vM67d7Sv;
        vM67d7Sv.eVhOlqcC(attributeSet, R.attr.buttonStyleToggle);
        s sVar = new s(this);
        this.MdtA4re8 = sVar;
        sVar.P7K7Inc8(attributeSet, R.attr.buttonStyleToggle);
        getEmojiTextViewHelper().qoPGr6Ce(attributeSet, R.attr.buttonStyleToggle);
    }

    private qoZa66xm getEmojiTextViewHelper() {
        qoZa66xm qoza66xm = this.wxUZMvaN;
        if (qoza66xm != null) {
            return qoza66xm;
        }
        qoZa66xm qoza66xm2 = new qoZa66xm(this);
        this.wxUZMvaN = qoza66xm2;
        return qoza66xm2;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
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

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().NCTxEWno(z);
    }

    @Override // android.widget.ToggleButton, android.view.View
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

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().MdtA4re8(z);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(((w30) getEmojiTextViewHelper().NCTxEWno.MdtA4re8).lwWCatUu(inputFilterArr));
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
}
