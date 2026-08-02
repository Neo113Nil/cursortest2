package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class vs0 {
    public final CharSequence a;
    public final CharSequence b;
    public final ldc c;

    public vs0(CharSequence charSequence, CharSequence charSequence2, ldc ldcVar) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs0)) {
            return false;
        }
        vs0 vs0Var = (vs0) obj;
        return jl40.l(this.a, vs0Var.a) && jl40.l(this.b, vs0Var.b) && jl40.l(this.c, vs0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        CharSequence charSequence = this.b;
        int hashCode2 = (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31;
        ldc ldcVar = this.c;
        return hashCode2 + (ldcVar != null ? Long.hashCode(ldcVar.a) : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "AddressDetailsHeaderState(title=", ", subtitle=", ", backgroundColor=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
