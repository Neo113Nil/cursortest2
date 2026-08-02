package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class xsm {
    public final pa90 a;
    public final ldc b;

    public xsm(pa90 pa90Var, ldc ldcVar) {
        this.a = pa90Var;
        this.b = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsm)) {
            return false;
        }
        xsm xsmVar = (xsm) obj;
        return jl40.l(this.a, xsmVar.a) && jl40.l(this.b, xsmVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        return hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a));
    }

    public final String toString() {
        return "Icon(painter=" + this.a + ", tint=" + this.b + Extension.C_BRAKE;
    }
}
