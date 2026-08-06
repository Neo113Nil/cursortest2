package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class ag1 implements defpackage.ft1 {
    public final defpackage.ft1 WDYagTQQm9ns;
    public final long oh71FJcDz6S2;

    public ag1(defpackage.ft1 ft1Var, long j) {
        this.WDYagTQQm9ns = ft1Var;
        this.oh71FJcDz6S2 = j;
    }

    @Override // defpackage.ft1
    public final defpackage.g6 T1fB7bDYiVJQ(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        long j2 = this.oh71FJcDz6S2;
        return j < j2 ? g6Var : this.WDYagTQQm9ns.T1fB7bDYiVJQ(j - j2, g6Var, g6Var2, g6Var3);
    }

    @Override // defpackage.ft1
    public final boolean ZpBGe2uQfcn8() {
        return this.WDYagTQQm9ns.ZpBGe2uQfcn8();
    }

    public final boolean equals(java.lang.Object obj) {
        if (!(obj instanceof defpackage.ag1)) {
            return false;
        }
        defpackage.ag1 ag1Var = (defpackage.ag1) obj;
        return ag1Var.oh71FJcDz6S2 == this.oh71FJcDz6S2 && defpackage.ma0.QiMR8OkAhezm(ag1Var.WDYagTQQm9ns, this.WDYagTQQm9ns);
    }

    @Override // defpackage.ft1
    public final defpackage.g6 fNwYGHIYeJcR(long j, defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        long j2 = this.oh71FJcDz6S2;
        return j < j2 ? g6Var3 : this.WDYagTQQm9ns.fNwYGHIYeJcR(j - j2, g6Var, g6Var2, g6Var3);
    }

    @Override // defpackage.ft1
    public final long giKS3J6vZuNy(defpackage.g6 g6Var, defpackage.g6 g6Var2, defpackage.g6 g6Var3) {
        return this.WDYagTQQm9ns.giKS3J6vZuNy(g6Var, g6Var2, g6Var3) + this.oh71FJcDz6S2;
    }

    public final int hashCode() {
        return java.lang.Long.hashCode(this.oh71FJcDz6S2) + (this.WDYagTQQm9ns.hashCode() * 31);
    }
}
