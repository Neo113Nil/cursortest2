package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ui {
    public final int ZpBGe2uQfcn8;
    public final java.lang.Integer giKS3J6vZuNy;

    public ui(int i, defpackage.q70 q70Var, java.lang.Integer num) {
        this.ZpBGe2uQfcn8 = i;
        this.giKS3J6vZuNy = num;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.ui)) {
            return false;
        }
        defpackage.ui uiVar = (defpackage.ui) obj;
        return this.ZpBGe2uQfcn8 == uiVar.ZpBGe2uQfcn8 && defpackage.ma0.QiMR8OkAhezm(null, null) && defpackage.ma0.QiMR8OkAhezm(this.giKS3J6vZuNy, uiVar.giKS3J6vZuNy);
    }

    public final int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.ZpBGe2uQfcn8) * 31) + 0) * 31;
        java.lang.Integer num = this.giKS3J6vZuNy;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "ComposeStackTraceFrame(groupKey=" + this.ZpBGe2uQfcn8 + ", sourceInfo=" + ((java.lang.Object) null) + ", groupOffset=" + this.giKS3J6vZuNy + ')';
    }
}
