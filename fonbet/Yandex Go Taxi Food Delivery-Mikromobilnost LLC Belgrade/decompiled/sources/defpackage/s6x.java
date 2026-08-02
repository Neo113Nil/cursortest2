package defpackage;

import java.util.Map;

/* loaded from: classes9.dex */
public final class s6x {
    public final Map a;

    public s6x(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s6x) && jl40.l(this.a, ((s6x) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("JasonTags(tags="), this.a, ')');
    }
}
