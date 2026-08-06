package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class uc0 {
    public final int ZpBGe2uQfcn8;
    public final boolean fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public uc0(int i, int i2, boolean z) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = i2;
        this.fWTAfUmVKrZq = z;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.uc0)) {
            return false;
        }
        defpackage.uc0 uc0Var = (defpackage.uc0) obj;
        return this.ZpBGe2uQfcn8 == uc0Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == uc0Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == uc0Var.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        return java.lang.Boolean.hashCode(this.fWTAfUmVKrZq) + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.giKS3J6vZuNy, java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31, 31);
    }

    public final java.lang.String toString() {
        return "BidiRun(start=" + this.ZpBGe2uQfcn8 + ", end=" + this.giKS3J6vZuNy + ", isRtl=" + this.fWTAfUmVKrZq + ')';
    }
}
