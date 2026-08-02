package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class ydg {
    public final List a;
    public final xu1 b;
    public final Object c;

    public ydg(List list, xu1 xu1Var, Object obj) {
        o2g.O(list, "addresses");
        this.a = Collections.unmodifiableList(new ArrayList(list));
        o2g.O(xu1Var, "attributes");
        this.b = xu1Var;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ydg)) {
            return false;
        }
        ydg ydgVar = (ydg) obj;
        return hdg.S(this.a, ydgVar.a) && hdg.S(this.b, ydgVar.b) && hdg.S(this.c, ydgVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "addresses");
        Y.q(this.b, "attributes");
        Y.q(this.c, "loadBalancingPolicyConfig");
        return Y.toString();
    }
}
