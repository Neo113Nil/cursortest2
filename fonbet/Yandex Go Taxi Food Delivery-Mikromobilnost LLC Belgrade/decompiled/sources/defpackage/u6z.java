package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class u6z {
    public final double a;
    public final double b;
    public final Double c;
    public final Float d;
    public final Long e;

    public u6z(double d, double d2, Double d3, Float f, Long l) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = f;
        this.e = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u6z)) {
            return false;
        }
        u6z u6zVar = (u6z) obj;
        return Double.compare(this.a, u6zVar.a) == 0 && Double.compare(this.b, u6zVar.b) == 0 && this.c.equals(u6zVar.c) && this.d.equals(u6zVar.d) && this.e.equals(u6zVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + unr0.a(Double.hashCode(this.a) * 31, 31, this.b)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "Location(lat=", ", lon=");
        u.append(this.b);
        u.append(", altitude=");
        u.append(this.c);
        u.append(", accuracy=");
        u.append(this.d);
        u.append(", timestamp=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
