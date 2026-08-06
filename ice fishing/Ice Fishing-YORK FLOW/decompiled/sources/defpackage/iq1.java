package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class iq1 implements java.io.Serializable {
    public final java.lang.Object QiMR8OkAhezm;
    public final java.lang.Integer WDYagTQQm9ns;
    public final java.lang.Object oh71FJcDz6S2;

    public iq1(java.lang.Integer num, java.lang.Object obj, java.lang.Object obj2) {
        this.WDYagTQQm9ns = num;
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = obj2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof defpackage.iq1)) {
            return false;
        }
        defpackage.iq1 iq1Var = (defpackage.iq1) obj;
        return this.WDYagTQQm9ns.equals(iq1Var.WDYagTQQm9ns) && this.oh71FJcDz6S2.equals(iq1Var.oh71FJcDz6S2) && defpackage.ma0.QiMR8OkAhezm(this.QiMR8OkAhezm, iq1Var.QiMR8OkAhezm);
    }

    public final int hashCode() {
        int hashCode = (this.oh71FJcDz6S2.hashCode() + (this.WDYagTQQm9ns.hashCode() * 31)) * 31;
        java.lang.Object obj = this.QiMR8OkAhezm;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public final java.lang.String toString() {
        return "(" + this.WDYagTQQm9ns + ", " + this.oh71FJcDz6S2 + ", " + this.QiMR8OkAhezm + ')';
    }
}
