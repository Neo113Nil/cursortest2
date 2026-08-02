package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class sc1 {
    public final String a;
    public final String b;

    public sc1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sc1)) {
            return false;
        }
        sc1 sc1Var = (sc1) obj;
        return jl40.l(this.a, sc1Var.a) && jl40.l(this.b, sc1Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("Overrides(path=", this.a, ", experiments=", this.b, Extension.C_BRAKE);
    }
}
