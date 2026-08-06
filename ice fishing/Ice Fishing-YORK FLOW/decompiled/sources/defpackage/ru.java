package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ru implements defpackage.pu {
    public final /* synthetic */ int WDYagTQQm9ns;
    public final java.lang.String oh71FJcDz6S2;

    public /* synthetic */ ru(java.lang.String str, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = str;
    }

    @Override // defpackage.pu
    public boolean QiMR8OkAhezm(java.lang.CharSequence charSequence, int i, int i2, defpackage.zq1 zq1Var) {
        if (!android.text.TextUtils.equals(charSequence.subSequence(i, i2), this.oh71FJcDz6S2)) {
            return true;
        }
        zq1Var.fWTAfUmVKrZq = (zq1Var.fWTAfUmVKrZq & 3) | 4;
        return false;
    }

    public java.lang.String toString() {
        switch (this.WDYagTQQm9ns) {
            case 1:
                return defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(new java.lang.StringBuilder("<"), this.oh71FJcDz6S2, '>');
            default:
                return super.toString();
        }
    }

    @Override // defpackage.pu
    public java.lang.Object ZpBGe2uQfcn8() {
        return this;
    }
}
