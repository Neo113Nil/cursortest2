package defpackage;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

/* loaded from: classes10.dex */
public final class xoh {
    public final LinkedHashMap a;
    public final LinkedHashMap b;
    public final LinkedHashSet c;
    public final LinkedHashSet d;
    public boolean e;
    public boolean f;

    public xoh() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        this.b = linkedHashMap;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.c = linkedHashSet;
        this.d = linkedHashSet;
        this.e = true;
    }

    public static void a(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            Object value = entry.getValue();
            if (map.containsKey(str) && ym11.h(map.get(str))) {
                Map c = ym11.c(map.get(str));
                Map map3 = value instanceof Map ? (Map) value : null;
                if (map3 == null) {
                    w511.j("'", str, "' is an object in destination but not in map");
                    return;
                }
                a(c, map3);
            } else {
                map.put(str, value);
            }
        }
    }
}
