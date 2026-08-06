package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class leBOUblNrHZh implements defpackage.hl0 {
    public final defpackage.ca ZpBGe2uQfcn8;
    public final defpackage.ca giKS3J6vZuNy;

    public leBOUblNrHZh(defpackage.ca caVar, defpackage.ca caVar2) {
        this.ZpBGe2uQfcn8 = caVar;
        this.giKS3J6vZuNy = caVar2;
    }

    @Override // defpackage.hl0
    public final int ZpBGe2uQfcn8(defpackage.q90 q90Var, long j, int i, defpackage.sc0 sc0Var) {
        int ZpBGe2uQfcn8 = this.giKS3J6vZuNy.ZpBGe2uQfcn8(0, q90Var.fWTAfUmVKrZq(), sc0Var);
        return q90Var.ZpBGe2uQfcn8 + ZpBGe2uQfcn8 + (-this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(0, i, sc0Var));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.leBOUblNrHZh)) {
            return false;
        }
        defpackage.leBOUblNrHZh leboublnrhzh = (defpackage.leBOUblNrHZh) obj;
        return this.ZpBGe2uQfcn8.equals(leboublnrhzh.ZpBGe2uQfcn8) && this.giKS3J6vZuNy.equals(leboublnrhzh.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return java.lang.Integer.hashCode(0) + defpackage.pVQOaWB9QMo4.ZpBGe2uQfcn8(this.giKS3J6vZuNy.ZpBGe2uQfcn8, java.lang.Float.hashCode(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8) * 31, 31);
    }

    public final java.lang.String toString() {
        return "Horizontal(menuAlignment=" + this.ZpBGe2uQfcn8 + ", anchorAlignment=" + this.giKS3J6vZuNy + ", offset=0)";
    }
}
