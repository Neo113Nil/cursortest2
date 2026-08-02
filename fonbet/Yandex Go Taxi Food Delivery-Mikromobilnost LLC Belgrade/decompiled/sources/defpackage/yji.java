package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class yji {
    public final double a;
    public final double b;
    public final ha91 c;
    public final boolean d;

    public yji(double d, double d2, ha91 ha91Var, boolean z) {
        this.a = d;
        this.b = d2;
        this.c = ha91Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yji)) {
            return false;
        }
        yji yjiVar = (yji) obj;
        return Double.compare(this.a, yjiVar.a) == 0 && Double.compare(this.b, yjiVar.b) == 0 && this.c.equals(yjiVar.c) && this.d == yjiVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + unr0.a(Double.hashCode(this.a) * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "DeliveryPinVo(latitude=", ", longitude=");
        u.append(this.b);
        u.append(", pinStyle=");
        u.append(this.c);
        return xra1.a(u, ", isActive=", this.d, Extension.C_BRAKE);
    }
}
