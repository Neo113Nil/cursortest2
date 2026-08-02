package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sk80 {
    public final double a;
    public final double b;

    public sk80(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk80)) {
            return false;
        }
        sk80 sk80Var = (sk80) obj;
        return Double.compare(this.a, sk80Var.a) == 0 && Double.compare(this.b, sk80Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "OrganizationWalkingRouteConfig(maxWalkTimeSeconds=", ", maxDirectDistanceMeters="), this.b, Extension.C_BRAKE);
    }
}
