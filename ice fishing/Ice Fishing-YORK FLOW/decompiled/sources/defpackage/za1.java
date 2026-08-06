package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class za1 {
    public final boolean JhCgjQRTAOCT;
    public final defpackage.o40 ZpBGe2uQfcn8;
    public final defpackage.ya1 fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public za1(defpackage.o40 o40Var, long j, defpackage.ya1 ya1Var, boolean z) {
        this.ZpBGe2uQfcn8 = o40Var;
        this.giKS3J6vZuNy = j;
        this.fWTAfUmVKrZq = ya1Var;
        this.JhCgjQRTAOCT = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.za1)) {
            return false;
        }
        defpackage.za1 za1Var = (defpackage.za1) obj;
        return this.ZpBGe2uQfcn8 == za1Var.ZpBGe2uQfcn8 && defpackage.ws0.giKS3J6vZuNy(this.giKS3J6vZuNy, za1Var.giKS3J6vZuNy) && this.fWTAfUmVKrZq == za1Var.fWTAfUmVKrZq && this.JhCgjQRTAOCT == za1Var.JhCgjQRTAOCT;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.JhCgjQRTAOCT) + ((this.fWTAfUmVKrZq.hashCode() + defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(this.ZpBGe2uQfcn8.hashCode() * 31, 31, this.giKS3J6vZuNy)) * 31);
    }

    public final java.lang.String toString() {
        return "SelectionHandleInfo(handle=" + this.ZpBGe2uQfcn8 + ", position=" + ((java.lang.Object) defpackage.ws0.QiMR8OkAhezm(this.giKS3J6vZuNy)) + ", anchor=" + this.fWTAfUmVKrZq + ", visible=" + this.JhCgjQRTAOCT + ')';
    }
}
