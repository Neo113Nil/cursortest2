package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class v1l0 {
    public final Route a;
    public final Route b;
    public final List c;

    public v1l0(Route route, Route route2, List list) {
        this.a = route;
        this.b = route2;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1l0)) {
            return false;
        }
        v1l0 v1l0Var = (v1l0) obj;
        return jl40.l(this.a, v1l0Var.a) && jl40.l(this.b, v1l0Var.b) && jl40.l(this.c, v1l0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteData(fullRoute=");
        sb.append(this.a);
        sb.append(", filteredFromTaxiRoute=");
        sb.append(this.b);
        sb.append(", fullRouteAddresses=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
