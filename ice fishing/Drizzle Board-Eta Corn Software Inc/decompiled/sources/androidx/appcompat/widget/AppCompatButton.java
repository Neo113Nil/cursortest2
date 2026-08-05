package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.kolosta.rejin.jilosa.R;
import defpackage.VM67d7Sv;
import defpackage.b0;
import defpackage.f50;
import defpackage.fh0;
import defpackage.ic0;
import defpackage.qc0;
import defpackage.qoZa66xm;
import defpackage.s;
import defpackage.w30;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class AppCompatButton extends Button {
    public final s MdtA4re8;
    public final VM67d7Sv NCTxEWno;
    public qoZa66xm wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qc0.qoPGr6Ce(context);
        ic0.qoPGr6Ce(this, getContext());
        VM67d7Sv vM67d7Sv = new VM67d7Sv(this);
        this.NCTxEWno = vM67d7Sv;
        vM67d7Sv.eVhOlqcC(attributeSet, i);
        s sVar = new s(this);
        this.MdtA4re8 = sVar;
        sVar.P7K7Inc8(attributeSet, i);
        sVar.NCTxEWno();
        getEmojiTextViewHelper().qoPGr6Ce(attributeSet, i);
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

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        s sVar = this.MdtA4re8;
        if (sVar == null || fh0.MdtA4re8) {
            return;
        }
        sVar.jb9XjC4I.qoPGr6Ce();
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
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

    public void setSupportAllCaps(boolean z) {
        s sVar = this.MdtA4re8;
        if (sVar != null) {
            sVar.qoPGr6Ce.setAllCaps(z);
        }
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
    public void setTextSize(int i, float f) {
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

    public AppCompatButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyle);
    }

    public AppCompatButton(Context context) {
        this(context, null);
    }
}
