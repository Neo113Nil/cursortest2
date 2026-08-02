package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class xz2 {
    public final double a;
    public final double b;
    public final double c;
    public final MapBuilder d;

    public xz2(double d, double d2, double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("lat", Double.valueOf(d));
        mapBuilder.put("lon", Double.valueOf(d2));
        this.d = x4e.w(d3, mapBuilder, "acc");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xz2)) {
            return false;
        }
        xz2 xz2Var = (xz2) obj;
        return Double.compare(this.a, xz2Var.a) == 0 && Double.compare(this.b, xz2Var.b) == 0 && Double.compare(this.c, xz2Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "Mylocation(lat=", ", lon=");
        u.append(this.b);
        u.append(", acc=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
