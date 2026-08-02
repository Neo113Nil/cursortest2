package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class tqm implements xqm {
    public final pa90 a;
    public final ldc b;

    public tqm(pa90 pa90Var, ldc ldcVar) {
        this.a = pa90Var;
        this.b = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tqm)) {
            return false;
        }
        tqm tqmVar = (tqm) obj;
        return jl40.l(this.a, tqmVar.a) && jl40.l(this.b, tqmVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 961;
        ldc ldcVar = this.b;
        return hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a));
    }

    public final String toString() {
        return "Icon(painter=" + this.a + ", contentDescription=null, tint=" + this.b + Extension.C_BRAKE;
    }
}
