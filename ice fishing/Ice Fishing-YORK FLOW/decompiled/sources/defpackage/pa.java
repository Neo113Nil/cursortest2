package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pa {
    public defpackage.w1 ZpBGe2uQfcn8 = null;
    public defpackage.DR1ov5IJDbR8 giKS3J6vZuNy = null;
    public defpackage.ld fWTAfUmVKrZq = null;
    public defpackage.s2 JhCgjQRTAOCT = null;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.pa)) {
            return false;
        }
        defpackage.pa paVar = (defpackage.pa) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, paVar.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, paVar.giKS3J6vZuNy) && defpackage.ma0.QiMR8OkAhezm(this.fWTAfUmVKrZq, paVar.fWTAfUmVKrZq) && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, paVar.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        defpackage.w1 w1Var = this.ZpBGe2uQfcn8;
        int hashCode = (w1Var == null ? 0 : w1Var.hashCode()) * 31;
        defpackage.DR1ov5IJDbR8 dR1ov5IJDbR8 = this.giKS3J6vZuNy;
        int hashCode2 = (hashCode + (dR1ov5IJDbR8 == null ? 0 : dR1ov5IJDbR8.hashCode())) * 31;
        defpackage.ld ldVar = this.fWTAfUmVKrZq;
        int hashCode3 = (hashCode2 + (ldVar == null ? 0 : ldVar.hashCode())) * 31;
        defpackage.s2 s2Var = this.JhCgjQRTAOCT;
        return hashCode3 + (s2Var != null ? s2Var.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "BorderCache(imageBitmap=" + this.ZpBGe2uQfcn8 + ", canvas=" + this.giKS3J6vZuNy + ", canvasDrawScope=" + this.fWTAfUmVKrZq + ", borderPath=" + this.JhCgjQRTAOCT + ')';
    }
}
