package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes14.dex */
public final class v9w {
    public final pj a;

    public v9w(pj pjVar) {
        this.a = pjVar;
    }

    public static LinkedHashMap a(String str) {
        Map map = (Map) sbx.d.b(c.Companion.serializer(), str);
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), (b) entry.getValue());
        }
        return linkedHashMap;
    }
}
