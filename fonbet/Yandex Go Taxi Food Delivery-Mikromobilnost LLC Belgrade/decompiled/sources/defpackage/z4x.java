package defpackage;

import java.util.List;

/* loaded from: classes13.dex */
public final class z4x {
    public final d6x a;
    public final List b;
    public final Object c;

    public z4x(d6x d6xVar, List list, Object obj) {
        this.a = d6xVar;
        this.b = list;
        this.c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z4x)) {
            return false;
        }
        z4x z4xVar = (z4x) obj;
        return jl40.l(this.a, z4xVar.a) && this.b.equals(z4xVar.b) && this.c.equals(z4xVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(state=");
        sb.append(this.a);
        sb.append(", events=");
        sb.append(this.b);
        sb.append(", returned=");
        return qv10.r(sb, this.c, ')');
    }
}
