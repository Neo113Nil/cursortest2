package v7;

import a.AbstractC0426a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import u7.C5081g;

/* loaded from: classes2.dex */
public abstract class t extends AbstractC0426a {
    public static Object s(Object obj, Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int t(int i) {
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

    public static Map u(C5081g pair) {
        kotlin.jvm.internal.h.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f41052n, pair.f41053u);
        kotlin.jvm.internal.h.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final void v(LinkedHashMap linkedHashMap, C5081g[] c5081gArr) {
        for (C5081g c5081g : c5081gArr) {
            linkedHashMap.put(c5081g.f41052n, c5081g.f41053u);
        }
    }

    public static List w(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        int size = map.size();
        C5125p c5125p = C5125p.f41221n;
        if (size == 0) {
            return c5125p;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c5125p;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return Z2.d.n(new C5081g(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C5081g(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C5081g(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map x(ArrayList arrayList) {
        q qVar = q.f41222n;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size == 1) {
            return u((C5081g) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(t(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5081g c5081g = (C5081g) it.next();
            linkedHashMap.put(c5081g.f41052n, c5081g.f41053u);
        }
        return linkedHashMap;
    }

    public static Map y(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return q.f41222n;
        }
        if (size != 1) {
            return z(map);
        }
        kotlin.jvm.internal.h.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.h.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap z(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
