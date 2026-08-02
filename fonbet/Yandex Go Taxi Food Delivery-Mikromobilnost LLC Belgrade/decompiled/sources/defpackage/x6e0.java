package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class x6e0 {
    public final String a;
    public final List b;
    public final Map c;

    public x6e0(String str, Map map, List list) {
        this.a = str;
        this.b = list;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x6e0)) {
            return false;
        }
        x6e0 x6e0Var = (x6e0) obj;
        return jl40.l(this.a, x6e0Var.a) && jl40.l(this.b, x6e0Var.b) && jl40.l(this.c, x6e0Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.c;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AcquisitionPlatformSubscriptionProperties(page=");
        sb.append(this.a);
        sb.append(", places=");
        sb.append(this.b);
        sb.append(", restrictions=");
        return smw0.n(sb, this.c, ')');
    }
}
