package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class fs1 implements defpackage.gv1 {
    public final defpackage.gv1 ZpBGe2uQfcn8;
    public final defpackage.gv1 giKS3J6vZuNy;

    public fs1(defpackage.gv1 gv1Var, defpackage.gv1 gv1Var2) {
        this.ZpBGe2uQfcn8 = gv1Var;
        this.giKS3J6vZuNy = gv1Var2;
    }

    @Override // defpackage.gv1
    public final int ZpBGe2uQfcn8(defpackage.hp hpVar) {
        return java.lang.Math.max(this.ZpBGe2uQfcn8.ZpBGe2uQfcn8(hpVar), this.giKS3J6vZuNy.ZpBGe2uQfcn8(hpVar));
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.fs1)) {
            return false;
        }
        defpackage.fs1 fs1Var = (defpackage.fs1) obj;
        return fs1Var.ZpBGe2uQfcn8.equals(this.ZpBGe2uQfcn8) && fs1Var.giKS3J6vZuNy.equals(this.giKS3J6vZuNy);
    }

    @Override // defpackage.gv1
    public final int giKS3J6vZuNy(defpackage.hp hpVar) {
        return java.lang.Math.max(this.ZpBGe2uQfcn8.giKS3J6vZuNy(hpVar), this.giKS3J6vZuNy.giKS3J6vZuNy(hpVar));
    }

    public final int hashCode() {
        return (this.giKS3J6vZuNy.hashCode() * 31) + this.ZpBGe2uQfcn8.hashCode();
    }

    public final java.lang.String toString() {
        return "(" + this.ZpBGe2uQfcn8 + " ∪ " + this.giKS3J6vZuNy + ')';
    }
}
