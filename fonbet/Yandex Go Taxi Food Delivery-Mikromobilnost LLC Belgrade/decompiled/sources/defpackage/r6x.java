package defpackage;

import java.util.Map;

/* loaded from: classes9.dex */
public final class r6x implements q6x {
    public final Map a;

    public r6x(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r6x) && jl40.l(this.a, ((r6x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("Tree(content="), this.a, ')');
    }
}
