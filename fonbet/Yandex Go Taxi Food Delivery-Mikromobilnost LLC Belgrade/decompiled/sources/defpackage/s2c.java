package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class s2c {
    public static final s2c c = new s2c("", "");
    public final String a;
    public final String b;

    public s2c(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2c)) {
            return false;
        }
        s2c s2cVar = (s2c) obj;
        return jl40.l(this.a, s2cVar.a) && jl40.l(this.b, s2cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PlusTariffVertical(tariff=", this.a, ", vertical=", this.b, Extension.C_BRAKE);
    }
}
