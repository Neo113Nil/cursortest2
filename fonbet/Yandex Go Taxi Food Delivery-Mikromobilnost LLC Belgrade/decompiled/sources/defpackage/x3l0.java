package defpackage;

import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.model.RouteType;

/* loaded from: classes6.dex */
public final class x3l0 {
    public final RouteType a;
    public final String b;
    public final ArrayList c;
    public final Integer d;
    public final List e;
    public final String f;
    public final List g;

    public x3l0(RouteType routeType, String str, ArrayList arrayList, Integer num, List list, String str2, List list2) {
        this.a = routeType;
        this.b = str;
        this.c = arrayList;
        this.d = num;
        this.e = list;
        this.f = str2;
        this.g = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x3l0)) {
            return false;
        }
        x3l0 x3l0Var = (x3l0) obj;
        return this.a == x3l0Var.a && jl40.l(this.b, x3l0Var.b) && this.c.equals(x3l0Var.c) && jl40.l(this.d, x3l0Var.d) && jl40.l(this.e, x3l0Var.e) && jl40.l(this.f, x3l0Var.f) && jl40.l(this.g, x3l0Var.g);
    }

    public final int hashCode() {
        int b = ly3.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Integer num = this.d;
        int c = unr0.c((b + (num == null ? 0 : num.hashCode())) * 31, 31, this.e);
        String str = this.f;
        return this.g.hashCode() + ((c + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RouteInfo(transportType=");
        sb.append(this.a);
        sb.append(", transportName=");
        sb.append(this.b);
        sb.append(", stops=");
        sb.append(this.c);
        sb.append(", mapkitColor=");
        sb.append(this.d);
        sb.append(", stages=");
        oyr.D(", vehicleId=", this.f, ", allVehicleRouteIds=", sb, this.e);
        return ly3.s(sb, this.g, Extension.C_BRAKE);
    }
}
