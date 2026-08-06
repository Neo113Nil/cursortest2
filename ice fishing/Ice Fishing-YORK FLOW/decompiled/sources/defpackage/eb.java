package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class eb {
    public final defpackage.hp ZpBGe2uQfcn8;
    public final long giKS3J6vZuNy;

    public eb(defpackage.rh1 rh1Var, long j) {
        this.ZpBGe2uQfcn8 = rh1Var;
        this.giKS3J6vZuNy = j;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.eb)) {
            return false;
        }
        defpackage.eb ebVar = (defpackage.eb) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, ebVar.ZpBGe2uQfcn8) && defpackage.mk.giKS3J6vZuNy(this.giKS3J6vZuNy, ebVar.giKS3J6vZuNy);
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.giKS3J6vZuNy) + (this.ZpBGe2uQfcn8.hashCode() * 31);
    }

    public final java.lang.String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.ZpBGe2uQfcn8 + ", constraints=" + ((java.lang.Object) defpackage.mk.Ns0WNyEWdPsk(this.giKS3J6vZuNy)) + ')';
    }
}
