package defpackage;

import android.text.TextUtils;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class lf implements kf {
    public final String MdtA4re8;
    public final /* synthetic */ int NCTxEWno;

    public /* synthetic */ lf(String str, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = str;
    }

    @Override // defpackage.kf
    public boolean MdtA4re8(CharSequence charSequence, int i, int i2, te0 te0Var) {
        if (!TextUtils.equals(charSequence.subSequence(i, i2), this.MdtA4re8)) {
            return true;
        }
        te0Var.MdtA4re8 = (te0Var.MdtA4re8 & 3) | 4;
        return false;
    }

    public String toString() {
        switch (this.NCTxEWno) {
            case 1:
                return "<" + this.MdtA4re8 + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.kf
    public Object qoPGr6Ce() {
        return this;
    }
}
