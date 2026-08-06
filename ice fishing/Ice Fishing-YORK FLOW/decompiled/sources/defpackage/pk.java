package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class pk {
    public final defpackage.ci1 JhCgjQRTAOCT;
    public final int ZpBGe2uQfcn8;
    public final defpackage.qk fWTAfUmVKrZq;
    public final long giKS3J6vZuNy;

    public pk(int i, long j, defpackage.qk qkVar, defpackage.ci1 ci1Var) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = j;
        this.fWTAfUmVKrZq = qkVar;
        this.JhCgjQRTAOCT = ci1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.pk)) {
            return false;
        }
        defpackage.pk pkVar = (defpackage.pk) obj;
        return this.ZpBGe2uQfcn8 == pkVar.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == pkVar.giKS3J6vZuNy && this.fWTAfUmVKrZq == pkVar.fWTAfUmVKrZq && defpackage.ma0.QiMR8OkAhezm(this.JhCgjQRTAOCT, pkVar.JhCgjQRTAOCT);
    }

    public final int hashCode() {
        int hashCode = (this.fWTAfUmVKrZq.hashCode() + defpackage.pVQOaWB9QMo4.fWTAfUmVKrZq(java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31, 31, this.giKS3J6vZuNy)) * 31;
        defpackage.ci1 ci1Var = this.JhCgjQRTAOCT;
        return hashCode + (ci1Var == null ? 0 : ci1Var.hashCode());
    }

    public final java.lang.String toString() {
        return "ContentCaptureEvent(id=" + this.ZpBGe2uQfcn8 + ", timestamp=" + this.giKS3J6vZuNy + ", type=" + this.fWTAfUmVKrZq + ", structureCompat=" + this.JhCgjQRTAOCT + ')';
    }
}
