package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes.dex */
public final class wyq0 {
    public static final vyq0 Companion = new vyq0();
    public static final KSerializer[] d = {null, null, new k8u(auu0.a, m5f0.a, 1)};
    public final gzq0 a;
    public final w5z0 b;
    public final Map c;

    public /* synthetic */ wyq0(int i, gzq0 gzq0Var, w5z0 w5z0Var, Map map) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, uyq0.a.getDescriptor());
            throw null;
        }
        this.a = gzq0Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = w5z0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = map;
        }
    }

    public static wyq0 a(wyq0 wyq0Var, gzq0 gzq0Var, w5z0 w5z0Var, Map map, int i) {
        if ((i & 1) != 0) {
            gzq0Var = wyq0Var.a;
        }
        if ((i & 2) != 0) {
            w5z0Var = wyq0Var.b;
        }
        if ((i & 4) != 0) {
            map = wyq0Var.c;
        }
        wyq0Var.getClass();
        return new wyq0(gzq0Var, w5z0Var, map);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wyq0)) {
            return false;
        }
        wyq0 wyq0Var = (wyq0) obj;
        return jl40.l(this.a, wyq0Var.a) && jl40.l(this.b, wyq0Var.b) && jl40.l(this.c, wyq0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        w5z0 w5z0Var = this.b;
        int hashCode2 = (hashCode + (w5z0Var == null ? 0 : Long.hashCode(w5z0Var.a))) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SessionData(sessionDetails=");
        sb.append(this.a);
        sb.append(", backgroundTime=");
        sb.append(this.b);
        sb.append(", processDataMap=");
        return smw0.n(sb, this.c, ')');
    }

    public wyq0(gzq0 gzq0Var, w5z0 w5z0Var, Map map) {
        this.a = gzq0Var;
        this.b = w5z0Var;
        this.c = map;
    }
}
