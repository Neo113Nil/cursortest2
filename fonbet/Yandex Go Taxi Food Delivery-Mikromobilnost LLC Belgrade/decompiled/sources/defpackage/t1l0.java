package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class t1l0 {
    public final double a;
    public final double b;
    public final int c;
    public final List d;

    public t1l0(double d, double d2, int i, List list) {
        this.a = d;
        this.b = d2;
        this.c = i;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1l0)) {
            return false;
        }
        t1l0 t1l0Var = (t1l0) obj;
        return Double.compare(this.a, t1l0Var.a) == 0 && Double.compare(this.b, t1l0Var.b) == 0 && this.c == t1l0Var.c && jl40.l(this.d, t1l0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, unr0.a(Double.hashCode(this.a) * 31, 31, this.b), 31);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "RouteData(remainingDistance=", ", timeToFinish=");
        u.append(this.b);
        u.append(", segmentIndex=");
        u.append(this.c);
        u.append(", jamSegments=");
        u.append(this.d);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
