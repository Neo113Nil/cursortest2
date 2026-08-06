package defpackage;

/* loaded from: classes.dex */
public final class et implements defpackage.dt {
    public final /* synthetic */ int adDC3e2L;
    public final java.lang.String xiZrDbcSW0;

    public /* synthetic */ et(java.lang.String str, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = str;
    }

    @Override // defpackage.dt
    public boolean EXtogiMhuM(java.lang.CharSequence charSequence, int i, int i2, defpackage.wj1 wj1Var) {
        if (!android.text.TextUtils.equals(charSequence.subSequence(i, i2), this.xiZrDbcSW0)) {
            return true;
        }
        wj1Var.r1MBDhnF = (wj1Var.r1MBDhnF & 3) | 4;
        return false;
    }

    public java.lang.String toString() {
        switch (this.adDC3e2L) {
            case 1:
                return "<" + this.xiZrDbcSW0 + '>';
            default:
                return super.toString();
        }
    }

    @Override // defpackage.dt
    public java.lang.Object IHQe1A4L2xu() {
        return this;
    }
}
