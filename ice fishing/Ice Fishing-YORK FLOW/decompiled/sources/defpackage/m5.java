package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class m5<S> extends defpackage.zl0 {
    public final defpackage.ep1 ZpBGe2uQfcn8;
    public final defpackage.q5 fWTAfUmVKrZq;
    public final defpackage.fo0 giKS3J6vZuNy;

    public m5(defpackage.ep1 ep1Var, defpackage.fo0 fo0Var, defpackage.q5 q5Var) {
        this.ZpBGe2uQfcn8 = ep1Var;
        this.giKS3J6vZuNy = fo0Var;
        this.fWTAfUmVKrZq = q5Var;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.p5 p5Var = new defpackage.p5();
        p5Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        p5Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        p5Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
        p5Var.maCixPsq4ml2 = -9223372034707292160L;
        return p5Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.m5)) {
            return false;
        }
        defpackage.m5 m5Var = (defpackage.m5) obj;
        return defpackage.ma0.QiMR8OkAhezm(m5Var.ZpBGe2uQfcn8, this.ZpBGe2uQfcn8) && m5Var.giKS3J6vZuNy.equals(this.giKS3J6vZuNy);
    }

    public final int hashCode() {
        int hashCode = this.fWTAfUmVKrZq.hashCode() * 31;
        defpackage.ep1 ep1Var = this.ZpBGe2uQfcn8;
        return this.giKS3J6vZuNy.hashCode() + ((hashCode + (ep1Var != null ? ep1Var.hashCode() : 0)) * 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.p5 p5Var = (defpackage.p5) ul0Var;
        p5Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        p5Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        p5Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
    }
}
