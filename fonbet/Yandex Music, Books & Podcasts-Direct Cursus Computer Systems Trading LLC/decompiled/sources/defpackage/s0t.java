package defpackage;

import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class s0t {
    public static final String c;
    public static final String d;
    public final xvs a;
    public final yde b;

    static {
        int i = dvt.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public s0t(xvs xvsVar, List list) {
        if (!list.isEmpty() && (((Integer) Collections.min(list)).intValue() < 0 || ((Integer) Collections.max(list)).intValue() >= xvsVar.a)) {
            rj7.m();
            throw null;
        }
        this.a = xvsVar;
        this.b = yde.v(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s0t.class == obj.getClass()) {
            s0t s0tVar = (s0t) obj;
            if (this.a.equals(s0tVar.a) && this.b.equals(s0tVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }
}
