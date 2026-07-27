package r7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import q7.C4938g;

/* loaded from: classes2.dex */
public abstract class t extends w8.a {
    public static Map A(C4938g pair) {
        kotlin.jvm.internal.h.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f40162n, pair.f40163u);
        kotlin.jvm.internal.h.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final void B(LinkedHashMap linkedHashMap, C4938g[] c4938gArr) {
        for (C4938g c4938g : c4938gArr) {
            linkedHashMap.put(c4938g.f40162n, c4938g.f40163u);
        }
    }

    public static List C(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        int size = map.size();
        C4985p c4985p = C4985p.f40358n;
        if (size == 0) {
            return c4985p;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c4985p;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return p8.g.k(new C4938g(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C4938g(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C4938g(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map D(ArrayList arrayList) {
        q qVar = q.f40359n;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size == 1) {
            return A((C4938g) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(z(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C4938g c4938g = (C4938g) it.next();
            linkedHashMap.put(c4938g.f40162n, c4938g.f40163u);
        }
        return linkedHashMap;
    }

    public static Map E(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return q.f40359n;
        }
        if (size != 1) {
            return F(map);
        }
        kotlin.jvm.internal.h.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.h.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap F(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        return new LinkedHashMap(map);
    }

    public static Object y(Object obj, Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int z(int i) {
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
}
