package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class s6z {
    public final double a;
    public final double b;

    public s6z(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s6z)) {
            return false;
        }
        s6z s6zVar = (s6z) obj;
        return Double.compare(this.a, s6zVar.a) == 0 && Double.compare(this.b, s6zVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "Location(longitude=", ", latitude="), this.b, Extension.C_BRAKE);
    }
}
