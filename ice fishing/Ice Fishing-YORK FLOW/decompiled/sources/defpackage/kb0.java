package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class kb0 {
    public final java.lang.Integer ZpBGe2uQfcn8;
    public final java.lang.Object giKS3J6vZuNy;

    public kb0(java.lang.Integer num, java.lang.Object obj) {
        this.ZpBGe2uQfcn8 = num;
        this.giKS3J6vZuNy = obj;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.kb0)) {
            return false;
        }
        defpackage.kb0 kb0Var = (defpackage.kb0) obj;
        return this.ZpBGe2uQfcn8.equals(kb0Var.ZpBGe2uQfcn8) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, kb0Var.giKS3J6vZuNy);
    }

    public final int hashCode() {
        int hashCode = this.ZpBGe2uQfcn8.hashCode() * 31;
        java.lang.Object obj = this.giKS3J6vZuNy;
        return (obj instanceof java.lang.Enum ? ((java.lang.Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) + hashCode;
    }

    public final java.lang.String toString() {
        return "JoinedKey(left=" + this.ZpBGe2uQfcn8 + ", right=" + this.giKS3J6vZuNy + ')';
    }
}
