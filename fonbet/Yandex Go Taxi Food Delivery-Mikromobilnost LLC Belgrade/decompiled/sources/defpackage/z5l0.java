package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class z5l0 {
    public final String a;
    public final List b;
    public final String c;

    public z5l0(String str, List list, String str2) {
        this.a = str;
        this.b = list;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5l0)) {
            return false;
        }
        z5l0 z5l0Var = (z5l0) obj;
        return this.a.equals(z5l0Var.a) && this.b.equals(z5l0Var.b) && this.c.equals(z5l0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(xvz.r("RouteListState(header=", this.a, ", routeStops=", this.b, ", doneButtonTitle="), this.c, Extension.C_BRAKE);
    }
}
