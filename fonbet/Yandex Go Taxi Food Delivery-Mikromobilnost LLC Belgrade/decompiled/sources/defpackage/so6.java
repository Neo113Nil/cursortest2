package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class so6 {
    public final sp6 a;
    public final tp6 b;
    public final pp6 c;

    public so6(sp6 sp6Var, tp6 tp6Var, pp6 pp6Var) {
        this.a = sp6Var;
        this.b = tp6Var;
        this.c = pp6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so6)) {
            return false;
        }
        so6 so6Var = (so6) obj;
        return jl40.l(this.a, so6Var.a) && jl40.l(this.b, so6Var.b) && jl40.l(this.c, so6Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        pp6 pp6Var = this.c;
        return hashCode + (pp6Var == null ? 0 : pp6Var.hashCode());
    }

    public final String toString() {
        return "BudgetChargesEntity(header=" + this.a + ", searchSection=" + this.b + ", foundInvoicesSection=" + this.c + Extension.C_BRAKE;
    }
}
