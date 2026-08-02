package defpackage;

import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes.dex */
public final class sas0 {
    public final LinkedHashMap a;

    public sas0(Set set) {
        Set set2 = set;
        int d = gw00.d(tcc.n(set2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(d < 16 ? 16 : d);
        for (Object obj : set2) {
            linkedHashMap.put(((b941) obj).c, obj);
        }
        this.a = linkedHashMap;
    }
}
