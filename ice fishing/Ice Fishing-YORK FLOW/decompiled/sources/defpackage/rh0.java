package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class rh0 extends defpackage.sh0 {
    public final java.lang.String ZpBGe2uQfcn8;
    public final defpackage.en1 giKS3J6vZuNy;

    public rh0(java.lang.String str, defpackage.en1 en1Var) {
        this.ZpBGe2uQfcn8 = str;
        this.giKS3J6vZuNy = en1Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.rh0)) {
            return false;
        }
        defpackage.rh0 rh0Var = (defpackage.rh0) obj;
        return this.ZpBGe2uQfcn8.equals(rh0Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, rh0Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        int hashCode = this.ZpBGe2uQfcn8.hashCode() * 31;
        defpackage.en1 en1Var = this.giKS3J6vZuNy;
        return (hashCode + (en1Var != null ? en1Var.hashCode() : 0)) * 31;
    }

    public final java.lang.String toString() {
        return defpackage.pVQOaWB9QMo4.fNwYGHIYeJcR(new java.lang.StringBuilder("LinkAnnotation.Url(url="), this.ZpBGe2uQfcn8, ')');
    }
}
