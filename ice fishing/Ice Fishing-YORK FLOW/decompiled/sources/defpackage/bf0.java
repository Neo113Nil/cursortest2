package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class bf0 extends defpackage.zl0 {
    public final boolean JhCgjQRTAOCT;
    public final defpackage.n10 ZpBGe2uQfcn8;
    public final defpackage.fv0 fWTAfUmVKrZq;
    public final defpackage.af0 giKS3J6vZuNy;

    public bf0(defpackage.n10 n10Var, defpackage.af0 af0Var, defpackage.fv0 fv0Var, boolean z) {
        this.ZpBGe2uQfcn8 = n10Var;
        this.giKS3J6vZuNy = af0Var;
        this.fWTAfUmVKrZq = fv0Var;
        this.JhCgjQRTAOCT = z;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        return new defpackage.ff0(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq, this.JhCgjQRTAOCT);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bf0)) {
            return false;
        }
        defpackage.bf0 bf0Var = (defpackage.bf0) obj;
        return this.ZpBGe2uQfcn8 == bf0Var.ZpBGe2uQfcn8 && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, bf0Var.giKS3J6vZuNy) && this.fWTAfUmVKrZq == bf0Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == bf0Var.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(false) + defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT((this.fWTAfUmVKrZq.hashCode() + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31)) * 31, 31, this.JhCgjQRTAOCT);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.ff0 ff0Var = (defpackage.ff0) ul0Var;
        ff0Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        ff0Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        defpackage.fv0 fv0Var = ff0Var.w7APNrr0aGRc;
        defpackage.fv0 fv0Var2 = this.fWTAfUmVKrZq;
        if (fv0Var != fv0Var2) {
            ff0Var.w7APNrr0aGRc = fv0Var2;
            defpackage.wc1.GcLuU6pT9wO9(ff0Var);
        }
        boolean z = ff0Var.maCixPsq4ml2;
        boolean z2 = this.JhCgjQRTAOCT;
        if (z == z2) {
            return;
        }
        ff0Var.maCixPsq4ml2 = z2;
        ff0Var.YZh1E3mnTFwf();
        defpackage.wc1.GcLuU6pT9wO9(ff0Var);
    }
}
