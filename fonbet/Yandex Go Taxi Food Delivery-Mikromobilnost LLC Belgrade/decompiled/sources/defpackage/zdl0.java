package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class zdl0 {
    public final String a;
    public final jf61 b;
    public final n4m c;
    public final dfl0 d;

    public zdl0(String str, jf61 jf61Var, n4m n4mVar, dfl0 dfl0Var) {
        this.a = str;
        this.b = jf61Var;
        this.c = n4mVar;
        this.d = dfl0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zdl0)) {
            return false;
        }
        zdl0 zdl0Var = (zdl0) obj;
        return jl40.l(this.a, zdl0Var.a) && jl40.l(this.b, zdl0Var.b) && this.c.equals(zdl0Var.c) && jl40.l(this.d, zdl0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b.a)) * 31);
    }

    public final String toString() {
        return "RouteStopsV2UiState(title=" + this.a + ", zoomRouteButtonUiState=" + this.b + ", doneButtonUiState=" + this.c + ", routeUiState=" + this.d + Extension.C_BRAKE;
    }
}
