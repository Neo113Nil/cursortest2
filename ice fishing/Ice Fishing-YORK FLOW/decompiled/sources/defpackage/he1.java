package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class he1 implements defpackage.ij, java.lang.Iterable, defpackage.nb0 {
    public final int QiMR8OkAhezm;
    public final defpackage.ge1 WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public he1(defpackage.ge1 ge1Var, int i, int i2) {
        this.WDYagTQQm9ns = ge1Var;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = i2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.he1)) {
            return false;
        }
        defpackage.he1 he1Var = (defpackage.he1) obj;
        return he1Var.oh71FJcDz6S2 == this.oh71FJcDz6S2 && he1Var.QiMR8OkAhezm == this.QiMR8OkAhezm && he1Var.WDYagTQQm9ns == this.WDYagTQQm9ns;
    }

    public final int hashCode() {
        return (this.WDYagTQQm9ns.hashCode() * 31) + this.oh71FJcDz6S2;
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        defpackage.ge1 ge1Var = this.WDYagTQQm9ns;
        if (ge1Var.fNwYGHIYeJcR != this.QiMR8OkAhezm) {
            defpackage.ie1.oh71FJcDz6S2();
        }
        int i = this.oh71FJcDz6S2;
        ge1Var.oh71FJcDz6S2(i);
        return new defpackage.n40(ge1Var, i + 1, ge1Var.WDYagTQQm9ns[(i * 5) + 3] + i);
    }
}
