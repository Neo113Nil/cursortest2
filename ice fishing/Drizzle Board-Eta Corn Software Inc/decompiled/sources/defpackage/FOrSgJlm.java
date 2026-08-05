package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class FOrSgJlm extends CheckBox implements tc0 {
    public final VM67d7Sv MdtA4re8;
    public final a8QeOjEL NCTxEWno;
    public qoZa66xm VgvYg0wo;
    public final s wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FOrSgJlm(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qc0.qoPGr6Ce(context);
        ic0.qoPGr6Ce(this, getContext());
        a8QeOjEL a8qeojel = new a8QeOjEL(this);
        this.NCTxEWno = a8qeojel;
        a8qeojel.MdtA4re8(attributeSet, i);
        VM67d7Sv vM67d7Sv = new VM67d7Sv(this);
        this.MdtA4re8 = vM67d7Sv;
        vM67d7Sv.eVhOlqcC(attributeSet, i);
        s sVar = new s(this);
        this.wxUZMvaN = sVar;
        sVar.P7K7Inc8(attributeSet, i);
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

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        if (vM67d7Sv != null) {
            vM67d7Sv.qoPGr6Ce();
        }
        s sVar = this.wxUZMvaN;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        if (vM67d7Sv != null) {
            return vM67d7Sv.Qr9iLBAD();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        if (vM67d7Sv != null) {
            return vM67d7Sv.jb9XjC4I();
        }
        return null;
    }

    @Override // defpackage.tc0
    public ColorStateList getSupportButtonTintList() {
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            return a8qeojel.qoPGr6Ce;
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            return a8qeojel.NCTxEWno;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.wxUZMvaN.wxUZMvaN();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.wxUZMvaN.VgvYg0wo();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().NCTxEWno(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        if (vM67d7Sv != null) {
            vM67d7Sv.ow5vqvCr();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        if (vM67d7Sv != null) {
            vM67d7Sv.OnDfzHZD(i);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            if (a8qeojel.VgvYg0wo) {
                a8qeojel.VgvYg0wo = false;
            } else {
                a8qeojel.VgvYg0wo = true;
                a8qeojel.qoPGr6Ce();
            }
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s sVar = this.wxUZMvaN;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s sVar = this.wxUZMvaN;
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
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        if (vM67d7Sv != null) {
            vM67d7Sv.amk52bBQ(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        if (vM67d7Sv != null) {
            vM67d7Sv.KlHjfFWx(mode);
        }
    }

    @Override // defpackage.tc0
    public void setSupportButtonTintList(ColorStateList colorStateList) {
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            a8qeojel.qoPGr6Ce = colorStateList;
            a8qeojel.MdtA4re8 = true;
            a8qeojel.qoPGr6Ce();
        }
    }

    @Override // defpackage.tc0
    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            a8qeojel.NCTxEWno = mode;
            a8qeojel.wxUZMvaN = true;
            a8qeojel.qoPGr6Ce();
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        s sVar = this.wxUZMvaN;
        sVar.ow5vqvCr(colorStateList);
        sVar.NCTxEWno();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        s sVar = this.wxUZMvaN;
        sVar.OnDfzHZD(mode);
        sVar.NCTxEWno();
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i) {
        setButtonDrawable(ra.Ey6iv0m0(getContext(), i));
    }
}
