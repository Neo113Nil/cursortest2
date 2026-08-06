package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class c50 extends defpackage.zl0 {
    public final defpackage.pn1 ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public c50(defpackage.pn1 pn1Var, int i, int i2) {
        this.ZpBGe2uQfcn8 = pn1Var;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = i2;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.e50 e50Var = new defpackage.e50();
        e50Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        e50Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        e50Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
        e50Var.IJ0hOnjhPOri = -1;
        e50Var.VFeft99leXEK = -1;
        return e50Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.c50)) {
            return false;
        }
        defpackage.c50 c50Var = (defpackage.c50) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, c50Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == c50Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == c50Var.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        return (((this.ZpBGe2uQfcn8.hashCode() * 31) + this.giKS3J6vZuNy) * 31) + this.fWTAfUmVKrZq;
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.e50 e50Var = (defpackage.e50) ul0Var;
        defpackage.pn1 pn1Var = e50Var.BHfvd2J71qpO;
        defpackage.pn1 pn1Var2 = this.ZpBGe2uQfcn8;
        boolean QiMR8OkAhezm = defpackage.ma0.QiMR8OkAhezm(pn1Var, pn1Var2);
        int i = this.giKS3J6vZuNy;
        int i2 = this.fWTAfUmVKrZq;
        if (QiMR8OkAhezm && e50Var.ZVVdXbWmyCSK == i && e50Var.w7APNrr0aGRc == i2) {
            return;
        }
        e50Var.BHfvd2J71qpO = pn1Var2;
        e50Var.ZVVdXbWmyCSK = i;
        e50Var.w7APNrr0aGRc = i2;
        e50Var.oCu53ZX2v4Ju = defpackage.t80.KrtOTfE6jiS2(pn1Var2, defpackage.la0.UmgHb6n58gfG(e50Var).UmgHb6n58gfG);
        e50Var.maCixPsq4ml2 = true;
        defpackage.n70.maCixPsq4ml2(e50Var);
    }
}
