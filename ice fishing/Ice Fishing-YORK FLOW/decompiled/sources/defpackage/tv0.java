package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class tv0 extends defpackage.zl0 {
    public final float JhCgjQRTAOCT;
    public final float ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;

    public tv0(float f, float f2, float f3, float f4) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = f3;
        this.JhCgjQRTAOCT = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || java.lang.Float.isNaN(f)) & (f2 >= 0.0f || java.lang.Float.isNaN(f2)) & (f3 >= 0.0f || java.lang.Float.isNaN(f3));
        if (f4 < 0.0f && !java.lang.Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            defpackage.c80.ZpBGe2uQfcn8("Padding must be non-negative");
        }
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.uv0 uv0Var = new defpackage.uv0();
        uv0Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        uv0Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        uv0Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
        uv0Var.maCixPsq4ml2 = this.JhCgjQRTAOCT;
        uv0Var.IJ0hOnjhPOri = true;
        return uv0Var;
    }

    public final boolean equals(java.lang.Object obj) {
        defpackage.tv0 tv0Var = obj instanceof defpackage.tv0 ? (defpackage.tv0) obj : null;
        return tv0Var != null && defpackage.or.giKS3J6vZuNy(this.ZpBGe2uQfcn8, tv0Var.ZpBGe2uQfcn8) && defpackage.or.giKS3J6vZuNy(this.giKS3J6vZuNy, tv0Var.giKS3J6vZuNy) && defpackage.or.giKS3J6vZuNy(this.fWTAfUmVKrZq, tv0Var.fWTAfUmVKrZq) && defpackage.or.giKS3J6vZuNy(this.JhCgjQRTAOCT, tv0Var.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(true) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31), 31), 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.uv0 uv0Var = (defpackage.uv0) ul0Var;
        uv0Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        uv0Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        uv0Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
        uv0Var.maCixPsq4ml2 = this.JhCgjQRTAOCT;
        uv0Var.IJ0hOnjhPOri = true;
    }
}
