package defpackage;

import com.yandex.mapkit.transport.masstransit.Route;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class u341 {
    public final n541 a;
    public final Route b;
    public final k4u c;
    public final Long d;
    public final Long e;
    public final double f;

    public u341(n541 n541Var, Route route, k4u k4uVar, Long l, Long l2, double d) {
        this.a = n541Var;
        this.b = route;
        this.c = k4uVar;
        this.d = l;
        this.e = l2;
        this.f = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u341)) {
            return false;
        }
        u341 u341Var = (u341) obj;
        return jl40.l(this.a, u341Var.a) && jl40.l(this.b, u341Var.b) && jl40.l(this.c, u341Var.c) && jl40.l(this.d, u341Var.d) && jl40.l(this.e, u341Var.e) && Double.compare(this.f, u341Var.f) == 0;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        k4u k4uVar = this.c;
        int hashCode2 = (hashCode + (k4uVar == null ? 0 : k4uVar.hashCode())) * 31;
        Long l = this.d;
        int hashCode3 = (hashCode2 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        return Double.hashCode(this.f) + ((hashCode3 + (l2 != null ? l2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "OrderData(routeAddresses=" + this.a + ", route=" + this.b + ", guidanceProgress=" + this.c + ", startTimestamp=" + this.d + ", finishTimestamp=" + this.e + ", passedDistance=" + this.f + Extension.C_BRAKE;
    }
}
