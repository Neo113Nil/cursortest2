package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class ns1 extends defpackage.zl0 {
    public final float ZpBGe2uQfcn8;
    public final float giKS3J6vZuNy;

    public ns1(float f, float f2) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.os1 os1Var = new defpackage.os1();
        os1Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        os1Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        return os1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ns1)) {
            return false;
        }
        defpackage.ns1 ns1Var = (defpackage.ns1) obj;
        return defpackage.or.giKS3J6vZuNy(this.ZpBGe2uQfcn8, ns1Var.ZpBGe2uQfcn8) && defpackage.or.giKS3J6vZuNy(this.giKS3J6vZuNy, ns1Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.giKS3J6vZuNy) + (java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.os1 os1Var = (defpackage.os1) ul0Var;
        os1Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        os1Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
    }
}
