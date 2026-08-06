package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class zh0 implements defpackage.hc1 {
    public final defpackage.hc1 ZpBGe2uQfcn8;

    public zh0(defpackage.hc1 hc1Var) {
        this.ZpBGe2uQfcn8 = hc1Var;
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
        defpackage.h7.gUjdnLbkVAaA(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Illegal index ", ", "), ZpBGe2uQfcn8(), " expects only non-negative indices");
        return false;
    }

    @Override // defpackage.hc1
    public final defpackage.hc1 QiMR8OkAhezm(int i) {
        if (i >= 0) {
            return this.ZpBGe2uQfcn8;
        }
        defpackage.h7.gUjdnLbkVAaA(defpackage.pVQOaWB9QMo4.h3m55N1URyyK(i, "Illegal index ", ", "), ZpBGe2uQfcn8(), " expects only non-negative indices");
        return null;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.zh0)) {
            return false;
        }
        defpackage.zh0 zh0Var = (defpackage.zh0) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, zh0Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(ZpBGe2uQfcn8(), zh0Var.ZpBGe2uQfcn8());
    }

    @Override // defpackage.hc1
    public final int fWTAfUmVKrZq() {
        return 1;
    }

    @Override // defpackage.hc1
    public final defpackage.j80 giKS3J6vZuNy() {
        return defpackage.ch1.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return ZpBGe2uQfcn8().hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return ZpBGe2uQfcn8() + '(' + this.ZpBGe2uQfcn8 + ')';
    }
}
