package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class qi11 {
    public final String a;
    public final String b;

    public qi11(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi11)) {
            return false;
        }
        qi11 qi11Var = (qi11) obj;
        return jl40.l(this.a, qi11Var.a) && jl40.l(this.b, qi11Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("TrustingContact(title=", this.a, ", phone=", this.b, Extension.C_BRAKE);
    }
}
