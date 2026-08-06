package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
final class be1 extends defpackage.zl0 {
    public final float JhCgjQRTAOCT;
    public final boolean WDYagTQQm9ns;
    public final float ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;

    public be1(float f, float f2, float f3, float f4, boolean z) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = f3;
        this.JhCgjQRTAOCT = f4;
        this.WDYagTQQm9ns = z;
    }

    @Override // defpackage.zl0
    public final defpackage.ul0 JhCgjQRTAOCT() {
        defpackage.de1 de1Var = new defpackage.de1();
        de1Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        de1Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        de1Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
        de1Var.maCixPsq4ml2 = this.JhCgjQRTAOCT;
        de1Var.IJ0hOnjhPOri = this.WDYagTQQm9ns;
        return de1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.be1)) {
            return false;
        }
        defpackage.be1 be1Var = (defpackage.be1) obj;
        return defpackage.or.giKS3J6vZuNy(this.ZpBGe2uQfcn8, be1Var.ZpBGe2uQfcn8) && defpackage.or.giKS3J6vZuNy(this.giKS3J6vZuNy, be1Var.giKS3J6vZuNy) && defpackage.or.giKS3J6vZuNy(this.fWTAfUmVKrZq, be1Var.fWTAfUmVKrZq) && defpackage.or.giKS3J6vZuNy(this.JhCgjQRTAOCT, be1Var.JhCgjQRTAOCT) && this.WDYagTQQm9ns == be1Var.WDYagTQQm9ns;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.WDYagTQQm9ns) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.JhCgjQRTAOCT, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31), 31), 31);
    }

    @Override // defpackage.zl0
    public final void oh71FJcDz6S2(defpackage.ul0 ul0Var) {
        defpackage.de1 de1Var = (defpackage.de1) ul0Var;
        de1Var.BHfvd2J71qpO = this.ZpBGe2uQfcn8;
        de1Var.ZVVdXbWmyCSK = this.giKS3J6vZuNy;
        de1Var.w7APNrr0aGRc = this.fWTAfUmVKrZq;
        de1Var.maCixPsq4ml2 = this.JhCgjQRTAOCT;
        de1Var.IJ0hOnjhPOri = this.WDYagTQQm9ns;
    }

    public /* synthetic */ be1(float f, float f2) {
        this(Float.NaN, f, Float.NaN, f2, true);
    }
}
