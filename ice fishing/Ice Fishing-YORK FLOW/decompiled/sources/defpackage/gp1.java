package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class gp1 implements defpackage.fp1 {
    public final java.lang.Object ZpBGe2uQfcn8;
    public final java.lang.Object giKS3J6vZuNy;

    public gp1(java.lang.Object obj, java.lang.Object obj2) {
        this.ZpBGe2uQfcn8 = obj;
        this.giKS3J6vZuNy = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.fp1)) {
            return false;
        }
        defpackage.fp1 fp1Var = (defpackage.fp1) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.ZpBGe2uQfcn8, fp1Var.giKS3J6vZuNy()) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, fp1Var.fWTAfUmVKrZq());
    }

    @Override // defpackage.fp1
    public final java.lang.Object fWTAfUmVKrZq() {
        return this.giKS3J6vZuNy;
    }

    @Override // defpackage.fp1
    public final java.lang.Object giKS3J6vZuNy() {
        return this.ZpBGe2uQfcn8;
    }

    public final int hashCode() {
        java.lang.Object obj = this.ZpBGe2uQfcn8;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.giKS3J6vZuNy;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
