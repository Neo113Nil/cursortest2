package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qr0 {
    public final double a;
    public final double b;
    public final MapBuilder c;

    public qr0(double d, double d2) {
        this.a = d;
        this.b = d2;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("lon", Double.valueOf(d));
        this.c = x4e.w(d2, mapBuilder, "lat");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qr0)) {
            return false;
        }
        qr0 qr0Var = (qr0) obj;
        return Double.compare(this.a, qr0Var.a) == 0 && Double.compare(this.b, qr0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "Position(lon=", ", lat="), this.b, Extension.C_BRAKE);
    }
}
