package defpackage;

import kotlin.collections.builders.MapBuilder;

/* loaded from: classes8.dex */
public final class s7r {
    public final double a;
    public final double b;
    public final MapBuilder c;

    public s7r(double d, double d2) {
        this.a = d;
        this.b = d2;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("lat", Double.valueOf(d));
        this.c = x4e.w(d2, mapBuilder, "lon");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7r)) {
            return false;
        }
        s7r s7rVar = (s7r) obj;
        return Double.compare(this.a, s7rVar.a) == 0 && Double.compare(this.b, s7rVar.b) == 0;
    }

    public final int hashCode() {
        return unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "Coordinate(lat=", ", lon="), this.b, ", acc=null)");
    }
}
