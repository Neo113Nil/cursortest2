package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class sbo {
    public final String a;
    public final String b;

    public sbo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sbo)) {
            return false;
        }
        sbo sboVar = (sbo) obj;
        return jl40.l(this.a, sboVar.a) && jl40.l(this.b, sboVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("EsiaUrls(passportUrl=", this.a, ", destinationUrl=", this.b, Extension.C_BRAKE);
    }
}
