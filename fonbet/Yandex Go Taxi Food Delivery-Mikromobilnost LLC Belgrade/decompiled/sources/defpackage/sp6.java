package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sp6 {
    public final String a;
    public final rp6 b;

    public sp6(String str, rp6 rp6Var) {
        this.a = str;
        this.b = rp6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sp6)) {
            return false;
        }
        sp6 sp6Var = (sp6) obj;
        return jl40.l(this.a, sp6Var.a) && this.b.equals(sp6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BudgetHeaderEntity(title=" + this.a + ", button=" + this.b + Extension.C_BRAKE;
    }
}
