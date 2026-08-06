package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class t61 {
    public float ZpBGe2uQfcn8;
    public boolean giKS3J6vZuNy;

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.t61)) {
            return false;
        }
        defpackage.t61 t61Var = (defpackage.t61) obj;
        return java.lang.Float.compare(this.ZpBGe2uQfcn8, t61Var.ZpBGe2uQfcn8) == 0 && this.giKS3J6vZuNy == t61Var.giKS3J6vZuNy;
    }

    public final int hashCode() {
        return defpackage.pVQOaWB9QMo4.JhCgjQRTAOCT(java.lang.Float.hashCode(this.ZpBGe2uQfcn8) * 31, 961, this.giKS3J6vZuNy);
    }

    public final java.lang.String toString() {
        return "RowColumnParentData(weight=" + this.ZpBGe2uQfcn8 + ", fill=" + this.giKS3J6vZuNy + ", crossAxisAlignment=null, flowLayoutData=null)";
    }
}
