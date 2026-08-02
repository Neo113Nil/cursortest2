package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public final class web {
    public final String a;
    public final List b;
    public final List c;
    public final Map d;
    public final Map e;

    public web(String str, List list, List list2, Map map, LinkedHashMap linkedHashMap) {
        this.a = str;
        this.b = list;
        this.c = list2;
        this.d = map;
        this.e = linkedHashMap;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(message = ");
        sb.append(this.a);
        sb.append(", locations = ");
        sb.append(this.b);
        sb.append(", path=");
        sb.append(this.c);
        sb.append(", extensions = ");
        sb.append(this.d);
        sb.append(", nonStandardFields = ");
        return k5r.p(sb, this.e, ')');
    }
}
