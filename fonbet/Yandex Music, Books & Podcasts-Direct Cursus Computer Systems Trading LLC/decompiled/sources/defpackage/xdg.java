package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class xdg {
    public static final xdg e = new xdg(null, null, sgr.e, false);
    public final zdg a;
    public final po4 b;
    public final sgr c;
    public final boolean d;

    public xdg(zdg zdgVar, po4 po4Var, sgr sgrVar, boolean z) {
        this.a = zdgVar;
        this.b = po4Var;
        o2g.O(sgrVar, "status");
        this.c = sgrVar;
        this.d = z;
    }

    public static xdg a(sgr sgrVar) {
        o2g.J("error status shouldn't be OK", !sgrVar.g());
        return new xdg(null, null, sgrVar, false);
    }

    public static xdg b(zdg zdgVar, wxj wxjVar) {
        o2g.O(zdgVar, "subchannel");
        return new xdg(zdgVar, wxjVar, sgr.e, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof xdg)) {
            return false;
        }
        xdg xdgVar = (xdg) obj;
        return hdg.S(this.a, xdgVar.a) && hdg.S(this.c, xdgVar.c) && hdg.S(this.b, xdgVar.b) && this.d == xdgVar.d;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.c, this.b, Boolean.valueOf(this.d)});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "subchannel");
        Y.q(this.b, "streamTracerFactory");
        Y.q(this.c, "status");
        Y.t("drop", this.d);
        return Y.toString();
    }
}
