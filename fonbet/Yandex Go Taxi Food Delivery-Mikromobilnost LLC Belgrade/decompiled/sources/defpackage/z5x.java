package defpackage;

import java.util.List;

/* loaded from: classes13.dex */
public final class z5x {
    public final d6x a;
    public final List b;

    public z5x(d6x d6xVar, List list) {
        this.a = d6xVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z5x)) {
            return false;
        }
        z5x z5xVar = (z5x) obj;
        return jl40.l(this.a, z5xVar.a) && this.b.equals(z5xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(state=");
        sb.append(this.a);
        sb.append(", events=");
        return unr0.t(sb, this.b, ')');
    }
}
