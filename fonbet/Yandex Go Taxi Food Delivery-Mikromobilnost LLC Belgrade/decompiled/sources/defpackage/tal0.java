package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.geo.PolylineIndex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class tal0 {
    public final ool0 a;
    public final Point b;
    public final PolylineIndex c;
    public final Double d;

    public tal0(ool0 ool0Var, Point point, PolylineIndex polylineIndex, Double d) {
        this.a = ool0Var;
        this.b = point;
        this.c = polylineIndex;
        this.d = d;
    }

    public static tal0 a(tal0 tal0Var, ool0 ool0Var, Point point, PolylineIndex polylineIndex, Double d, int i) {
        if ((i & 1) != 0) {
            ool0Var = tal0Var.a;
        }
        if ((i & 2) != 0) {
            point = tal0Var.b;
        }
        if ((i & 4) != 0) {
            polylineIndex = tal0Var.c;
        }
        if ((i & 8) != 0) {
            d = tal0Var.d;
        }
        tal0Var.getClass();
        return new tal0(ool0Var, point, polylineIndex, d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tal0)) {
            return false;
        }
        tal0 tal0Var = (tal0) obj;
        return jl40.l(this.a, tal0Var.a) && jl40.l(this.b, tal0Var.b) && jl40.l(this.c, tal0Var.c) && jl40.l(this.d, tal0Var.d);
    }

    public final int hashCode() {
        ool0 ool0Var = this.a;
        int hashCode = (ool0Var == null ? 0 : ool0Var.hashCode()) * 31;
        Point point = this.b;
        int hashCode2 = (hashCode + (point == null ? 0 : point.hashCode())) * 31;
        PolylineIndex polylineIndex = this.c;
        int hashCode3 = (hashCode2 + (polylineIndex == null ? 0 : polylineIndex.hashCode())) * 31;
        Double d = this.d;
        return hashCode3 + (d != null ? d.hashCode() : 0);
    }

    public final String toString() {
        return "RouteState(route=" + this.a + ", position=" + this.b + ", polylineIndex=" + this.c + ", distanceLeftInMeters=" + this.d + Extension.C_BRAKE;
    }

    public tal0() {
        this(null, null, null, null);
    }
}
