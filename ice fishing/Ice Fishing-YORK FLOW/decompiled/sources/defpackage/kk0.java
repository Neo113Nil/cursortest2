package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kk0 {
    public final java.lang.String ZpBGe2uQfcn8;
    public final defpackage.p90 giKS3J6vZuNy;

    public kk0(java.lang.String str, defpackage.p90 p90Var) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = p90Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kk0)) {
            return false;
        }
        defpackage.kk0 kk0Var = (defpackage.kk0) obj;
        return this.ZpBGe2uQfcn8.equals(kk0Var.ZpBGe2uQfcn8) && this.giKS3J6vZuNy.equals(kk0Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return this.giKS3J6vZuNy.hashCode() + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "MatchGroup(value=" + this.ZpBGe2uQfcn8 + ", range=" + this.giKS3J6vZuNy + ')';
    }
}
