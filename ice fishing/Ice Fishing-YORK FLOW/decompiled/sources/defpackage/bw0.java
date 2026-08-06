package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class bw0 implements java.io.Serializable {
    public final java.lang.Object WDYagTQQm9ns;
    public final java.lang.Object oh71FJcDz6S2;

    public bw0(java.lang.Object obj, java.lang.Object obj2) {
        this.WDYagTQQm9ns = obj;
        this.oh71FJcDz6S2 = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.bw0)) {
            return false;
        }
        defpackage.bw0 bw0Var = (defpackage.bw0) obj;
        return defpackage.ma0.QiMR8OkAhezm(this.WDYagTQQm9ns, bw0Var.WDYagTQQm9ns) && defpackage.ma0.QiMR8OkAhezm(this.oh71FJcDz6S2, bw0Var.oh71FJcDz6S2);
    }

    public final int hashCode() {
        java.lang.Object obj = this.WDYagTQQm9ns;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.oh71FJcDz6S2;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final java.lang.String toString() {
        return "(" + this.WDYagTQQm9ns + ", " + this.oh71FJcDz6S2 + ')';
    }
}
