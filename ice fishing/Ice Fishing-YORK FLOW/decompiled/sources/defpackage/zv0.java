package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class zv0 extends defpackage.zl0 {
    public final defpackage.yv0 ZpBGe2uQfcn8;
    public final defpackage.ga giKS3J6vZuNy;

    public zv0(defpackage.yv0 yv0Var, defpackage.ga gaVar) {
        this.ZpBGe2uQfcn8 = yv0Var;
        this.giKS3J6vZuNy = gaVar;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.ea eaVar = defpackage.jVUAPb5NnIYW.GE9mJIPrb8gP;
        defpackage.aw0 aw0Var = new defpackage.aw0();
        aw0Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        aw0Var.ZVVdXbWmyCSK = true;
        aw0Var.w7APNrr0aGRc = eaVar;
        aw0Var.maCixPsq4ml2 = defpackage.xk.ZpBGe2uQfcn8;
        aw0Var.IJ0hOnjhPOri = 1.0f;
        aw0Var.VFeft99leXEK = this.giKS3J6vZuNy;
        return aw0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.zv0)) {
            return false;
        }
        defpackage.zv0 zv0Var = (defpackage.zv0) obj;
        if (!defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, zv0Var.ZpBGe2uQfcn8)) {
            return false;
        }
        defpackage.ea eaVar = defpackage.jVUAPb5NnIYW.GE9mJIPrb8gP;
        return eaVar.equals(eaVar) && java.lang.Float.compare(1.0f, 1.0f) == 0 && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, zv0Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        int ZpBGe2uQfcn8 = defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(1.0f, (defpackage.xk.ZpBGe2uQfcn8.hashCode() + ((java.lang.Float.hashCode(0.0f) + (java.lang.Float.hashCode(0.0f) * 31) + defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(this.ZpBGe2uQfcn8.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        defpackage.ga gaVar = this.giKS3J6vZuNy;
        return ZpBGe2uQfcn8 + (gaVar == null ? 0 : gaVar.hashCode());
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.aw0 aw0Var = (defpackage.aw0) ul0Var;
        boolean z = aw0Var.ZVVdXbWmyCSK;
        defpackage.yv0 yv0Var = this.ZpBGe2uQfcn8;
        boolean z2 = (z && defpackage.ae1.ZpBGe2uQfcn8(aw0Var.BHfvd2J71qpO.JhCgjQRTAOCT(), yv0Var.JhCgjQRTAOCT())) ? false : true;
        aw0Var.BHfvd2J71qpO = yv0Var;
        aw0Var.ZVVdXbWmyCSK = true;
        aw0Var.w7APNrr0aGRc = defpackage.jVUAPb5NnIYW.GE9mJIPrb8gP;
        aw0Var.maCixPsq4ml2 = defpackage.xk.ZpBGe2uQfcn8;
        aw0Var.IJ0hOnjhPOri = 1.0f;
        aw0Var.VFeft99leXEK = this.giKS3J6vZuNy;
        if (z2) {
            defpackage.n70.maCixPsq4ml2(aw0Var);
        }
        defpackage.nq1.KrtOTfE6jiS2(aw0Var);
    }

    public final java.lang.String toString() {
        return "PainterElement(painter=" + this.ZpBGe2uQfcn8 + ", sizeToIntrinsics=true, alignment=" + defpackage.jVUAPb5NnIYW.GE9mJIPrb8gP + ", contentScale=" + defpackage.xk.ZpBGe2uQfcn8 + ", alpha=1.0, colorFilter=" + this.giKS3J6vZuNy + ')';
    }
}
