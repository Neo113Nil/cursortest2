package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class ok1 extends defpackage.zl0 {
    public final defpackage.vl JhCgjQRTAOCT;
    public final defpackage.pd1 ZpBGe2uQfcn8;
    public final defpackage.yl1 fWTAfUmVKrZq;
    public final defpackage.xl1 giKS3J6vZuNy;

    public ok1(defpackage.pd1 pd1Var, defpackage.xl1 xl1Var, defpackage.yl1 yl1Var, defpackage.vl vlVar) {
        this.ZpBGe2uQfcn8 = pd1Var;
        this.giKS3J6vZuNy = xl1Var;
        this.fWTAfUmVKrZq = yl1Var;
        this.JhCgjQRTAOCT = vlVar;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        return new defpackage.pk1(this.ZpBGe2uQfcn8, this.giKS3J6vZuNy, this.fWTAfUmVKrZq, this.JhCgjQRTAOCT);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ok1)) {
            return false;
        }
        defpackage.ok1 ok1Var = (defpackage.ok1) obj;
        return this.ZpBGe2uQfcn8 == ok1Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == ok1Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == ok1Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == ok1Var.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return this.JhCgjQRTAOCT.hashCode() + ((this.fWTAfUmVKrZq.hashCode() + ((this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31)) * 31)) * 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.pk1 pk1Var = (defpackage.pk1) ul0Var;
        pk1Var.w7APNrr0aGRc.giKS3J6vZuNy = null;
        defpackage.pd1 pd1Var = this.ZpBGe2uQfcn8;
        pk1Var.w7APNrr0aGRc = pd1Var;
        pd1Var.giKS3J6vZuNy = pk1Var;
        pd1Var.fWTAfUmVKrZq = pk1Var.s0TASMVLSWD5 ? defpackage.lo1.QiMR8OkAhezm : defpackage.lo1.oh71FJcDz6S2;
        pk1Var.maCixPsq4ml2 = this.giKS3J6vZuNy;
        pk1Var.IJ0hOnjhPOri = this.fWTAfUmVKrZq;
        pk1Var.VFeft99leXEK = this.JhCgjQRTAOCT;
    }
}
