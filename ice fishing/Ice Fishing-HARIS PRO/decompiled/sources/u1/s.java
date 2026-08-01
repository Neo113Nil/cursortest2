package u1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class s extends h0.f {
    public static int E(int i) {
        if (i < 0) {
            return i;
        }
        if (i < 3) {
            return i + 1;
        }
        if (i < 1073741824) {
            return (int) ((i / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static Map F(ArrayList arrayList) {
        p pVar = p.f4474a;
        int size = arrayList.size();
        if (size == 0) {
            return pVar;
        }
        if (size == 1) {
            t1.d dVar = (t1.d) arrayList.get(0);
            D1.i.e(dVar, "pair");
            Map singletonMap = Collections.singletonMap(dVar.f4378a, dVar.f4379b);
            D1.i.d(singletonMap, "singletonMap(...)");
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(E(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            t1.d dVar2 = (t1.d) it.next();
            linkedHashMap.put(dVar2.f4378a, dVar2.f4379b);
        }
        return linkedHashMap;
    }

    public static Map G(Map map) {
        D1.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return p.f4474a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        D1.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        D1.i.d(singletonMap, "with(...)");
        return singletonMap;
    }
}
