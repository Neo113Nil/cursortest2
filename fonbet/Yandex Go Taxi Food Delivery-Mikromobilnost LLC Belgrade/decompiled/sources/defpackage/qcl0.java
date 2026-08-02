package defpackage;

import com.yandex.go.navigator.route_stops.RouteStopsItemType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qcl0 extends xta1 {
    public final ne50 a;
    public final boolean b;

    public qcl0(ne50 ne50Var, boolean z) {
        RouteStopsItemType routeStopsItemType = RouteStopsItemType.HEADER;
        this.a = ne50Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcl0)) {
            return false;
        }
        qcl0 qcl0Var = (qcl0) obj;
        return jl40.l(this.a, qcl0Var.a) && this.b == qcl0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RouteStopsItem(stop=" + this.a + ", isSingle=" + this.b + Extension.C_BRAKE;
    }
}
