package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class N1Rc84Tm extends CheckedTextView {
    public final VM67d7Sv MdtA4re8;
    public final a8QeOjEL NCTxEWno;
    public qoZa66xm VgvYg0wo;
    public final s wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0086 A[Catch: all -> 0x0065, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0094 A[Catch: all -> 0x0065, TRY_LEAVE, TryCatch #1 {all -> 0x0065, blocks: (B:3:0x004c, B:5:0x0053, B:8:0x0059, B:9:0x007f, B:11:0x0086, B:12:0x008d, B:14:0x0094, B:21:0x0068, B:23:0x006e, B:25:0x0074), top: B:2:0x004c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public N1Rc84Tm(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        qc0.qoPGr6Ce(context);
        ic0.qoPGr6Ce(this, getContext());
        s sVar = new s(this);
        this.wxUZMvaN = sVar;
        sVar.P7K7Inc8(attributeSet, R.attr.checkedTextViewStyle);
        sVar.NCTxEWno();
        VM67d7Sv vM67d7Sv = new VM67d7Sv(this);
        this.MdtA4re8 = vM67d7Sv;
        vM67d7Sv.eVhOlqcC(attributeSet, R.attr.checkedTextViewStyle);
        this.NCTxEWno = new a8QeOjEL(this);
        Context context2 = getContext();
        int[] iArr = z00.ow5vqvCr;
        f0 Mq3SeTnW = f0.Mq3SeTnW(context2, attributeSet, iArr, R.attr.checkedTextViewStyle);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        hg0.jb9XjC4I(this, getContext(), iArr, attributeSet, (TypedArray) Mq3SeTnW.MdtA4re8, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(ra.Ey6iv0m0(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(Mq3SeTnW.sjUBp5pO(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(ud.NCTxEWno(typedArray.getInt(3, -1), null));
                }
                Mq3SeTnW.SgZGMMPL();
                getEmojiTextViewHelper().qoPGr6Ce(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(ra.Ey6iv0m0(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            Mq3SeTnW.SgZGMMPL();
            getEmojiTextViewHelper().qoPGr6Ce(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th) {
            Mq3SeTnW.SgZGMMPL();
            throw th;
        }
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

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        s sVar = this.wxUZMvaN;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
        VM67d7Sv vM67d7Sv = this.MdtA4re8;
        if (vM67d7Sv != null) {
            vM67d7Sv.qoPGr6Ce();
        }
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            a8qeojel.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return f50.KlHjfFWx(super.getCustomSelectionActionModeCallback());
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

    public ColorStateList getSupportCheckMarkTintList() {
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            return a8qeojel.qoPGr6Ce;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
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

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        ej0.SgZGMMPL(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
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

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            if (a8qeojel.VgvYg0wo) {
                a8qeojel.VgvYg0wo = false;
            } else {
                a8qeojel.VgvYg0wo = true;
                a8qeojel.NCTxEWno();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        s sVar = this.wxUZMvaN;
        if (sVar != null) {
            sVar.NCTxEWno();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        s sVar = this.wxUZMvaN;
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

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            a8qeojel.qoPGr6Ce = colorStateList;
            a8qeojel.MdtA4re8 = true;
            a8qeojel.NCTxEWno();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        a8QeOjEL a8qeojel = this.NCTxEWno;
        if (a8qeojel != null) {
            a8qeojel.NCTxEWno = mode;
            a8qeojel.wxUZMvaN = true;
            a8qeojel.NCTxEWno();
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

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        s sVar = this.wxUZMvaN;
        if (sVar != null) {
            sVar.b2ZJblxo(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(ra.Ey6iv0m0(getContext(), i));
    }
}
