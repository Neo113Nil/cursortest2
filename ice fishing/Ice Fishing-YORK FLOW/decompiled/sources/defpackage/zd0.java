package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class zd0 extends defpackage.zl0 {
    public final float ZpBGe2uQfcn8;
    public final boolean giKS3J6vZuNy;

    public zd0(float f, boolean z) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = z;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.ae0 ae0Var = new defpackage.ae0();
        ae0Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        ae0Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        return ae0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        defpackage.zd0 zd0Var = obj instanceof defpackage.zd0 ? (defpackage.zd0) obj : null;
        return zd0Var != null && this.ZpBGe2uQfcn8 == zd0Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == zd0Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.giKS3J6vZuNy) + (java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.ae0 ae0Var = (defpackage.ae0) ul0Var;
        ae0Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        ae0Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
    }
}
