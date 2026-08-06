package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wv0 {
    public final float JhCgjQRTAOCT;
    public final float ZpBGe2uQfcn8;
    public final float fWTAfUmVKrZq;
    public final float giKS3J6vZuNy;

    public wv0(float f, float f2, float f3, float f4) {
        this.ZpBGe2uQfcn8 = f;
        this.giKS3J6vZuNy = f2;
        this.fWTAfUmVKrZq = f3;
        this.JhCgjQRTAOCT = f4;
        if (!((f >= 0.0f) & (f2 >= 0.0f) & (f3 >= 0.0f)) || !(f4 >= 0.0f)) {
            defpackage.c80.ZpBGe2uQfcn8("Padding must be non-negative");
        }
    }

    public final float JhCgjQRTAOCT() {
        return this.giKS3J6vZuNy;
    }

    public final float ZpBGe2uQfcn8() {
        return this.JhCgjQRTAOCT;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.wv0)) {
            return false;
        }
        defpackage.wv0 wv0Var = (defpackage.wv0) obj;
        return defpackage.or.giKS3J6vZuNy(this.ZpBGe2uQfcn8, wv0Var.ZpBGe2uQfcn8) && defpackage.or.giKS3J6vZuNy(this.giKS3J6vZuNy, wv0Var.giKS3J6vZuNy) && defpackage.or.giKS3J6vZuNy(this.fWTAfUmVKrZq, wv0Var.fWTAfUmVKrZq) && defpackage.or.giKS3J6vZuNy(this.JhCgjQRTAOCT, wv0Var.JhCgjQRTAOCT);
    }

    public final float fWTAfUmVKrZq(defpackage.sc0 sc0Var) {
        return sc0Var == defpackage.sc0.WDYagTQQm9ns ? this.fWTAfUmVKrZq : this.ZpBGe2uQfcn8;
    }

    public final float giKS3J6vZuNy(defpackage.sc0 sc0Var) {
        return sc0Var == defpackage.sc0.WDYagTQQm9ns ? this.ZpBGe2uQfcn8 : this.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        return java.lang.Float.hashCode(this.JhCgjQRTAOCT) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy, java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        return "PaddingValues(start=" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(this.ZpBGe2uQfcn8)) + ", top=" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(this.giKS3J6vZuNy)) + ", end=" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(this.fWTAfUmVKrZq)) + ", bottom=" + ((java.lang.Object) defpackage.or.fWTAfUmVKrZq(this.JhCgjQRTAOCT)) + ')';
    }
}
