package defpackage;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class w1e {
    public final String a;
    public final List b;
    public final Map c;

    public w1e(String str, Map map, List list) {
        this.a = str;
        this.b = list;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w1e)) {
            return false;
        }
        w1e w1eVar = (w1e) obj;
        return jl40.l(this.a, w1eVar.a) && jl40.l(this.b, w1eVar.b) && jl40.l(this.c, w1eVar.c);
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
