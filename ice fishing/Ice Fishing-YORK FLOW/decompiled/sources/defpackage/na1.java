package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class na1 {
    public final defpackage.a51 ZpBGe2uQfcn8;
    public final long fWTAfUmVKrZq;
    public final int giKS3J6vZuNy;

    public na1(defpackage.a51 a51Var, int i, long j) {
        this.ZpBGe2uQfcn8 = a51Var;
        this.giKS3J6vZuNy = i;
        this.fWTAfUmVKrZq = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.na1)) {
            return false;
        }
        defpackage.na1 na1Var = (defpackage.na1) obj;
        return this.ZpBGe2uQfcn8 == na1Var.ZpBGe2uQfcn8 && this.giKS3J6vZuNy == na1Var.giKS3J6vZuNy && this.fWTAfUmVKrZq == na1Var.fWTAfUmVKrZq;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.fWTAfUmVKrZq) + defpackage.pVQOaWB9QMo4.giKS3J6vZuNy(this.giKS3J6vZuNy, this.ZpBGe2uQfcn8.hashCode() * 31, 31);
    }

    public final java.lang.String toString() {
        return "AnchorInfo(direction=" + this.ZpBGe2uQfcn8 + ", offset=" + this.giKS3J6vZuNy + ", selectableId=" + this.fWTAfUmVKrZq + ')';
    }
}
