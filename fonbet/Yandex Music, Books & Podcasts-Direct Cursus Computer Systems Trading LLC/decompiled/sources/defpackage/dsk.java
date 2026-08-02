package defpackage;

import java.util.Arrays;

/* loaded from: classes5.dex */
public final class dsk {
    public final ks3 a;
    public final s2i b;
    public final k3i c;

    public dsk(k3i k3iVar, s2i s2iVar, ks3 ks3Var) {
        o2g.O(k3iVar, "method");
        this.c = k3iVar;
        o2g.O(s2iVar, "headers");
        this.b = s2iVar;
        o2g.O(ks3Var, "callOptions");
        this.a = ks3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dsk.class == obj.getClass()) {
            dsk dskVar = (dsk) obj;
            if (hdg.S(this.a, dskVar.a) && hdg.S(this.b, dskVar.b) && hdg.S(this.c, dskVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        return "[method=" + this.c + " headers=" + this.b + " callOptions=" + this.a + "]";
    }
}
