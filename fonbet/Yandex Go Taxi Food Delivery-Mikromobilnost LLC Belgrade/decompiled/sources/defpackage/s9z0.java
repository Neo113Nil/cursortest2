package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class s9z0 {
    public final String a;
    public final ldc b;
    public final ldc c;
    public final q9z0 d;

    public s9z0(String str, ldc ldcVar, ldc ldcVar2, q9z0 q9z0Var) {
        this.a = str;
        this.b = ldcVar;
        this.c = ldcVar2;
        this.d = q9z0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9z0)) {
            return false;
        }
        s9z0 s9z0Var = (s9z0) obj;
        return jl40.l(this.a, s9z0Var.a) && jl40.l(this.b, s9z0Var.b) && jl40.l(this.c, s9z0Var.c) && this.d.equals(s9z0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        ldc ldcVar2 = this.c;
        return this.d.hashCode() + ((hashCode2 + (ldcVar2 != null ? Long.hashCode(ldcVar2.a) : 0)) * 31);
    }

    public final String toString() {
        return "TimelineBubbleButtonState(title=" + this.a + ", textColor=" + this.b + ", backgroundColor=" + this.c + ", action=" + this.d + Extension.C_BRAKE;
    }
}
