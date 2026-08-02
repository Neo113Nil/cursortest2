package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class vtm0 {
    public final String a;
    public final String b;

    public vtm0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vtm0)) {
            return false;
        }
        vtm0 vtm0Var = (vtm0) obj;
        return this.a.equals(vtm0Var.a) && jl40.l(this.b, vtm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("LegalTerms(text=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
