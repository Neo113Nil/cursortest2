package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class rdf0 {
    public final String a;
    public final qfc b;

    public rdf0(String str, qfc qfcVar) {
        this.a = str;
        this.b = qfcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdf0)) {
            return false;
        }
        rdf0 rdf0Var = (rdf0) obj;
        return jl40.l(this.a, rdf0Var.a) && jl40.l(this.b, rdf0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        qfc qfcVar = this.b;
        return hashCode + (qfcVar == null ? 0 : qfcVar.hashCode());
    }

    public final String toString() {
        return "ExistingProfileDescription(text=" + this.a + ", textColor=" + this.b + Extension.C_BRAKE;
    }
}
