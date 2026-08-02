package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class t09 {
    public final lvi0 a;
    public final ldc b;
    public final y7m c;
    public final qj4 d;

    public t09(lvi0 lvi0Var, ldc ldcVar, y7m y7mVar, qj4 qj4Var) {
        this.a = lvi0Var;
        this.b = ldcVar;
        this.c = y7mVar;
        this.d = qj4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t09)) {
            return false;
        }
        t09 t09Var = (t09) obj;
        return this.a.equals(t09Var.a) && jl40.l(this.b, t09Var.b) && jl40.l(this.c, t09Var.c) && jl40.l(this.d, t09Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        y7m y7mVar = this.c;
        int hashCode3 = (hashCode2 + (y7mVar == null ? 0 : Float.hashCode(y7mVar.a))) * 31;
        qj4 qj4Var = this.d;
        return hashCode3 + (qj4Var != null ? qj4Var.hashCode() : 0);
    }

    public final String toString() {
        return "CartLead(image=" + this.a + ", backgroundColor=" + this.b + ", cornerRadius=" + this.c + ", badge=" + this.d + Extension.C_BRAKE;
    }
}
