package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class sk90 {
    public final double a;
    public final double b;
    public final float c;
    public final long d;

    public sk90(double d, double d2, float f, long j) {
        this.a = d;
        this.b = d2;
        this.c = f;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk90)) {
            return false;
        }
        sk90 sk90Var = (sk90) obj;
        return Double.compare(this.a, sk90Var.a) == 0 && Double.compare(this.b, sk90Var.b) == 0 && Float.compare(this.c, sk90Var.c) == 0 && this.d == sk90Var.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.d) + g8e.c(this.c, unr0.a(Double.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "PassengerDetectionLocation(latitude=", ", longitude=");
        u.append(this.b);
        u.append(", accuracy=");
        u.append(this.c);
        return g8e.l(this.d, ", timestamp=", Extension.C_BRAKE, u);
    }
}
