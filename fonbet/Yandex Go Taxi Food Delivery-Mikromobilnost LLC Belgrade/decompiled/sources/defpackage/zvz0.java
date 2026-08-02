package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class zvz0 {
    public final wts0 a;
    public final ldc b;
    public final String c;

    public zvz0(wts0 wts0Var, ldc ldcVar, String str) {
        this.a = wts0Var;
        this.b = ldcVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zvz0)) {
            return false;
        }
        zvz0 zvz0Var = (zvz0) obj;
        return jl40.l(this.a, zvz0Var.a) && jl40.l(this.b, zvz0Var.b) && jl40.l(this.c, zvz0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        int hashCode2 = (hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a))) * 31;
        String str = this.c;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TopAccentBarModel(slot=");
        sb.append(this.a);
        sb.append(", backgroundColor=");
        sb.append(this.b);
        sb.append(", metricaLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
