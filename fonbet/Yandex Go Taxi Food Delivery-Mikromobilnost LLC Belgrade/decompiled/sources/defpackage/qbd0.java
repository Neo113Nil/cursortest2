package defpackage;

import java.util.Map;

/* loaded from: classes8.dex */
public final class qbd0 implements sbd0 {
    public final Map a;

    public qbd0(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qbd0) && jl40.l(this.a, ((qbd0) obj).a);
    }

    public final int hashCode() {
        Map map = this.a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    public final String toString() {
        return smw0.n(new StringBuilder("Params(params="), this.a, ')');
    }
}
