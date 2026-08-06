package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class i6 {
    public final java.lang.String JhCgjQRTAOCT;
    public final java.lang.Object ZpBGe2uQfcn8;
    public final int fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public i6(int i, int i2, java.lang.Object obj, java.lang.String str) {
        this.ZpBGe2uQfcn8 = obj;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = i2;
        this.JhCgjQRTAOCT = str;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.i6)) {
            return false;
        }
        defpackage.i6 i6Var = (defpackage.i6) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, i6Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy == i6Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == i6Var.fWTAfUmVKrZq && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, i6Var.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        java.lang.Object obj = this.ZpBGe2uQfcn8;
        return this.JhCgjQRTAOCT.hashCode() + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.fWTAfUmVKrZq, defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.giKS3J6vZuNy, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("MutableRange(item=");
        sb.append(this.ZpBGe2uQfcn8);
        sb.append(", start=");
        sb.append(this.giKS3J6vZuNy);
        sb.append(", end=");
        sb.append(this.fWTAfUmVKrZq);
        sb.append(", tag=");
        return defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(sb, this.JhCgjQRTAOCT, ')');
    }
}
