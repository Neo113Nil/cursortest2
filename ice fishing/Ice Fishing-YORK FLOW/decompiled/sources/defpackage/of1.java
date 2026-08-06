package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class of1 implements defpackage.ij, java.lang.Iterable, defpackage.nb0 {
    public final defpackage.f41 QiMR8OkAhezm;
    public final defpackage.ge1 WDYagTQQm9ns;
    public final int oh71FJcDz6S2;

    public of1(defpackage.ge1 ge1Var, int i, defpackage.g30 g30Var, defpackage.f41 f41Var) {
        this.WDYagTQQm9ns = ge1Var;
        this.oh71FJcDz6S2 = i;
        this.QiMR8OkAhezm = f41Var;
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.of1)) {
            return false;
        }
        defpackage.of1 of1Var = (defpackage.of1) obj;
        return of1Var.oh71FJcDz6S2 == this.oh71FJcDz6S2 && of1Var.WDYagTQQm9ns == this.WDYagTQQm9ns && of1Var.QiMR8OkAhezm.equals(this.QiMR8OkAhezm);
    }

    public final int hashCode() {
        return this.QiMR8OkAhezm.hashCode() + ((this.WDYagTQQm9ns.hashCode() + (this.oh71FJcDz6S2 * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final java.util.Iterator iterator() {
        return new defpackage.nf1(this.WDYagTQQm9ns, this.oh71FJcDz6S2, null, this.QiMR8OkAhezm);
    }
}
