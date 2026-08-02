package defpackage;

/* loaded from: classes8.dex */
public final class t6z {
    public final double a;
    public final double b;
    public final double c;

    public t6z(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t6z)) {
            return false;
        }
        t6z t6zVar = (t6z) obj;
        return Double.compare(this.a, t6zVar.a) == 0 && Double.compare(this.b, t6zVar.b) == 0 && Double.compare(0.0d, 0.0d) == 0 && Double.compare(this.c, t6zVar.c) == 0 && Double.compare(0.0d, 0.0d) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(0.0d) + unr0.a(unr0.a(unr0.a(Double.hashCode(this.a) * 31, 31, this.b), 31, 0.0d), 31, this.c);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "Location(latitude=", ", longitude=");
        u.append(this.b);
        u.append(", recencyMs=0.0, accuracy=");
        u.append(this.c);
        u.append(", speed=0.0)");
        return u.toString();
    }
}
