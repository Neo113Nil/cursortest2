package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class a8QeOjEL {
    public final TextView P7K7Inc8;
    public boolean VgvYg0wo;
    public ColorStateList qoPGr6Ce = null;
    public PorterDuff.Mode NCTxEWno = null;
    public boolean MdtA4re8 = false;
    public boolean wxUZMvaN = false;

    public /* synthetic */ a8QeOjEL(TextView textView) {
        this.P7K7Inc8 = textView;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005d A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006b A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0023, B:5:0x002a, B:8:0x0030, B:9:0x0056, B:11:0x005d, B:12:0x0064, B:14:0x006b, B:21:0x003f, B:23:0x0045, B:25:0x004b), top: B:2:0x0023 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void MdtA4re8(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.P7K7Inc8;
        Context context = compoundButton.getContext();
        int[] iArr = z00.OnDfzHZD;
        f0 Mq3SeTnW = f0.Mq3SeTnW(context, attributeSet, iArr, i);
        TypedArray typedArray = (TypedArray) Mq3SeTnW.MdtA4re8;
        hg0.jb9XjC4I(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) Mq3SeTnW.MdtA4re8, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(ra.Ey6iv0m0(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(Mq3SeTnW.sjUBp5pO(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(ud.NCTxEWno(typedArray.getInt(3, -1), null));
                }
                Mq3SeTnW.SgZGMMPL();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(ra.Ey6iv0m0(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            Mq3SeTnW.SgZGMMPL();
        } catch (Throwable th) {
            Mq3SeTnW.SgZGMMPL();
            throw th;
        }
    }

    public void NCTxEWno() {
        N1Rc84Tm n1Rc84Tm = (N1Rc84Tm) this.P7K7Inc8;
        Drawable checkMarkDrawable = n1Rc84Tm.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.MdtA4re8 || this.wxUZMvaN) {
                Drawable mutate = checkMarkDrawable.mutate();
                if (this.MdtA4re8) {
                    mutate.setTintList(this.qoPGr6Ce);
                }
                if (this.wxUZMvaN) {
                    mutate.setTintMode(this.NCTxEWno);
                }
                if (mutate.isStateful()) {
                    mutate.setState(n1Rc84Tm.getDrawableState());
                }
                n1Rc84Tm.setCheckMarkDrawable(mutate);
            }
        }
    }

    public void qoPGr6Ce() {
        CompoundButton compoundButton = (CompoundButton) this.P7K7Inc8;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.MdtA4re8 || this.wxUZMvaN) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.MdtA4re8) {
                    mutate.setTintList(this.qoPGr6Ce);
                }
                if (this.wxUZMvaN) {
                    mutate.setTintMode(this.NCTxEWno);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }
}
