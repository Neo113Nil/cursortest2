package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class j9 extends defpackage.zl0 {
    public final defpackage.cd1 JhCgjQRTAOCT;
    public final long ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final defpackage.vb giKS3J6vZuNy;

    public j9(long j, defpackage.oh0 oh0Var, defpackage.cd1 cd1Var, int i) {
        j = (i & 1) != 0 ? defpackage.pf.QiMR8OkAhezm : j;
        oh0Var = (i & 2) != 0 ? null : oh0Var;
        this.ZpBGe2uQfcn8 = j;
        this.giKS3J6vZuNy = oh0Var;
        this.fWTAfUmVKrZq = 1.0f;
        this.JhCgjQRTAOCT = cd1Var;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.k9 k9Var = new defpackage.k9();
        k9Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        k9Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        k9Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
        k9Var.maCixPsq4ml2 = this.JhCgjQRTAOCT;
        k9Var.IJ0hOnjhPOri = 9205357640488583168L;
        return k9Var;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.j9 j9Var = obj instanceof defpackage.j9 ? (defpackage.j9) obj : null;
        return j9Var != null && defpackage.pf.fWTAfUmVKrZq(this.ZpBGe2uQfcn8, j9Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, j9Var.giKS3J6vZuNy) && this.fWTAfUmVKrZq == j9Var.fWTAfUmVKrZq && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, j9Var.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        int i = defpackage.pf.P05cfTpS5W5L;
        int hashCode = java.lang.Long.hashCode(this.ZpBGe2uQfcn8) * 31;
        defpackage.vb vbVar = this.giKS3J6vZuNy;
        return this.JhCgjQRTAOCT.hashCode() + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, (hashCode + (vbVar != null ? vbVar.hashCode() : 0)) * 31, 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.k9 k9Var = (defpackage.k9) ul0Var;
        k9Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        k9Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        k9Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
        defpackage.cd1 cd1Var = k9Var.maCixPsq4ml2;
        defpackage.cd1 cd1Var2 = this.JhCgjQRTAOCT;
        if (!defpackage.ma0.QiMR8OkAhezm(cd1Var, cd1Var2)) {
            k9Var.maCixPsq4ml2 = cd1Var2;
            defpackage.wc1.GcLuU6pT9wO9(k9Var);
        }
        defpackage.nq1.KrtOTfE6jiS2(k9Var);
    }
}
