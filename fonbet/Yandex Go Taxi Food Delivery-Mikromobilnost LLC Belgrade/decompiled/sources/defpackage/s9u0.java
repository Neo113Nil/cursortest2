package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class s9u0 {
    public final String a;
    public final String b;

    public s9u0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s9u0)) {
            return false;
        }
        s9u0 s9u0Var = (s9u0) obj;
        return jl40.l(this.a, s9u0Var.a) && jl40.l(this.b, s9u0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("StatusWithActionEntity(status=", this.a, ", action=", this.b, Extension.C_BRAKE);
    }
}
