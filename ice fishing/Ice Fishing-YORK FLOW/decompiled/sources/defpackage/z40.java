package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class z40 implements defpackage.hc1 {
    public final java.lang.String ZpBGe2uQfcn8;
    public final defpackage.hc1 fWTAfUmVKrZq;
    public final defpackage.hc1 giKS3J6vZuNy;

    public z40(java.lang.String str, defpackage.hc1 hc1Var, defpackage.hc1 hc1Var2) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = hc1Var;
        this.fWTAfUmVKrZq = hc1Var2;
    }

    @Override // defpackage.hc1
    public final java.lang.String JhCgjQRTAOCT(int i) {
        return java.lang.String.valueOf(i);
    }

    @Override // defpackage.hc1
    public final boolean P05cfTpS5W5L(int i) {
        if (i >= 0) {
            return false;
        }
        defpackage.h7.gUjdnLbkVAaA(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Illegal index ", ", "), this.ZpBGe2uQfcn8, " expects only non-negative indices");
        return false;
    }

    @Override // defpackage.hc1
    public final defpackage.hc1 QiMR8OkAhezm(int i) {
        if (i < 0) {
            defpackage.h7.gUjdnLbkVAaA(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Illegal index ", ", "), this.ZpBGe2uQfcn8, " expects only non-negative indices");
            return null;
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.giKS3J6vZuNy;
        }
        if (i2 == 1) {
            return this.fWTAfUmVKrZq;
        }
        defpackage.h7.P05cfTpS5W5L("Unreached");
        return null;
    }

    @Override // defpackage.hc1
    public final java.lang.String ZpBGe2uQfcn8() {
        return this.ZpBGe2uQfcn8;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.z40)) {
            return false;
        }
        defpackage.z40 z40Var = (defpackage.z40) obj;
        return this.ZpBGe2uQfcn8.equals(z40Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy.equals(z40Var.giKS3J6vZuNy) && this.fWTAfUmVKrZq.equals(z40Var.fWTAfUmVKrZq);
    }

    @Override // defpackage.hc1
    public final int fWTAfUmVKrZq() {
        return 2;
    }

    @Override // defpackage.hc1
    public final defpackage.j80 giKS3J6vZuNy() {
        return defpackage.ch1.WDYagTQQm9ns;
    }

    public final int hashCode() {
        return this.fWTAfUmVKrZq.hashCode() + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31);
    }

    public final java.lang.String toString() {
        return this.ZpBGe2uQfcn8 + '(' + this.giKS3J6vZuNy + ", " + this.fWTAfUmVKrZq + ')';
    }
}
