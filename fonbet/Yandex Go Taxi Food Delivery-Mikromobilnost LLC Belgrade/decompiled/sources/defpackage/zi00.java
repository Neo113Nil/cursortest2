package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zi00 extends bj00 {
    public final lvi0 a;
    public final ldc b;

    public zi00(lvi0 lvi0Var, ldc ldcVar) {
        this.a = lvi0Var;
        this.b = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zi00)) {
            return false;
        }
        zi00 zi00Var = (zi00) obj;
        return this.a.equals(zi00Var.a) && jl40.l(this.b, zi00Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        return hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a));
    }

    public final String toString() {
        return "PinCustom(icon=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
