package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rv extends defpackage.uz0 {
    public final defpackage.lc1 fNwYGHIYeJcR;
    public final defpackage.ti1 h3m55N1URyyK;

    public rv(java.lang.String str, int i) {
        super(str, null, i);
        this.fNwYGHIYeJcR = defpackage.lc1.fWTAfUmVKrZq;
        this.h3m55N1URyyK = new defpackage.ti1(new defpackage.hh1(i, str, this));
    }

    @Override // defpackage.uz0, defpackage.hc1
    public final defpackage.hc1 QiMR8OkAhezm(int i) {
        return ((defpackage.hc1[]) this.h3m55N1URyyK.getValue())[i];
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof defpackage.hc1)) {
            return false;
        }
        defpackage.hc1 hc1Var = (defpackage.hc1) obj;
        return hc1Var.giKS3J6vZuNy() == defpackage.lc1.fWTAfUmVKrZq && this.ZpBGe2uQfcn8.equals(hc1Var.ZpBGe2uQfcn8()) && defpackage.ma0.QiMR8OkAhezm(defpackage.ok0.WmetiUbpKU9I(this), defpackage.ok0.WmetiUbpKU9I(hc1Var));
    }

    @Override // defpackage.uz0, defpackage.hc1
    public final defpackage.j80 giKS3J6vZuNy() {
        return this.fNwYGHIYeJcR;
    }

    @Override // defpackage.uz0
    public final int hashCode() {
        int hashCode = this.ZpBGe2uQfcn8.hashCode();
        defpackage.ZVVdXbWmyCSK zVVdXbWmyCSK = new defpackage.ZVVdXbWmyCSK(this);
        int i = 1;
        while (zVVdXbWmyCSK.hasNext()) {
            int i2 = i * 31;
            java.lang.String str = (java.lang.String) zVVdXbWmyCSK.next();
            i = i2 + (str != null ? str.hashCode() : 0);
        }
        return (hashCode * 31) + i;
    }

    @Override // defpackage.uz0
    public final java.lang.String toString() {
        return defpackage.hf.m6iZQUu7XjoL(new defpackage.y60(1, this), ", ", this.ZpBGe2uQfcn8.concat("("), ")", null, 56);
    }
}
