package v7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import u7.C5089g;

/* loaded from: classes2.dex */
public abstract class t extends t8.g {
    public static Object O(Object obj, Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int P(int i) {
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

    public static Map Q(C5089g pair) {
        kotlin.jvm.internal.h.e(pair, "pair");
        Map singletonMap = Collections.singletonMap(pair.f41332n, pair.f41333u);
        kotlin.jvm.internal.h.d(singletonMap, "singletonMap(...)");
        return singletonMap;
    }

    public static final void R(LinkedHashMap linkedHashMap, C5089g[] c5089gArr) {
        for (C5089g c5089g : c5089gArr) {
            linkedHashMap.put(c5089g.f41332n, c5089g.f41333u);
        }
    }

    public static List S(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        int size = map.size();
        C5135p c5135p = C5135p.f41442n;
        if (size == 0) {
            return c5135p;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return c5135p;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return d6.c.k(new C5089g(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C5089g(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C5089g(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map T(ArrayList arrayList) {
        q qVar = q.f41443n;
        int size = arrayList.size();
        if (size == 0) {
            return qVar;
        }
        if (size == 1) {
            return Q((C5089g) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(P(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C5089g c5089g = (C5089g) it.next();
            linkedHashMap.put(c5089g.f41332n, c5089g.f41333u);
        }
        return linkedHashMap;
    }

    public static Map U(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return q.f41443n;
        }
        if (size != 1) {
            return V(map);
        }
        kotlin.jvm.internal.h.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.h.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap V(Map map) {
        kotlin.jvm.internal.h.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
