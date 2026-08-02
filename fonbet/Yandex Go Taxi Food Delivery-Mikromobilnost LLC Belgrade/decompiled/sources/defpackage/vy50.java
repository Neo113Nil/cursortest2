package defpackage;

import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

@gsq0
/* loaded from: classes2.dex */
public final class vy50 {
    public static final uy50 Companion = new uy50();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new ew50(10))};
    public final int a;
    public final List b;

    public /* synthetic */ vy50(int i, int i2, List list) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ty50.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vy50)) {
            return false;
        }
        vy50 vy50Var = (vy50) obj;
        return this.a == vy50Var.a && jl40.l(this.b, vy50Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkPredicatesTreeModel(rootPredicateIndex=");
        sb.append(this.a);
        sb.append(", predicates=");
        return unr0.t(sb, this.b, ')');
    }
}
