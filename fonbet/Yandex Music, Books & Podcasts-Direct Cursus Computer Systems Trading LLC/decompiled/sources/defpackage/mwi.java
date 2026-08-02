package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class mwi {
    public final List a;
    public final xu1 b;
    public final lwi c;

    public mwi(List list, xu1 xu1Var, lwi lwiVar) {
        this.a = Collections.unmodifiableList(new ArrayList(list));
        o2g.O(xu1Var, "attributes");
        this.b = xu1Var;
        this.c = lwiVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof mwi)) {
            return false;
        }
        mwi mwiVar = (mwi) obj;
        return hdg.S(this.a, mwiVar.a) && hdg.S(this.b, mwiVar.b) && hdg.S(this.c, mwiVar.c);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c});
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "addresses");
        Y.q(this.b, "attributes");
        Y.q(this.c, "serviceConfig");
        return Y.toString();
    }
}
