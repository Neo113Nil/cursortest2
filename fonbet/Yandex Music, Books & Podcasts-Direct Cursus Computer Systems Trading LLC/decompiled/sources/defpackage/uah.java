package defpackage;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes5.dex */
public class uah extends tah {
    public static Object c(Object obj, Map map) {
        map.getClass();
        if (map instanceof iah) {
            return ((iah) map).n();
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        wvs.h(dfi.g("Key ", " is missing in the map.", obj));
        return null;
    }

    public static HashMap d(Pair... pairArr) {
        HashMap hashMap = new HashMap(tah.a(pairArr.length));
        k(hashMap, pairArr);
        return hashMap;
    }

    public static Map e(Pair... pairArr) {
        if (pairArr.length > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(pairArr.length));
            k(linkedHashMap, pairArr);
            return linkedHashMap;
        }
        e5b e5bVar = e5b.a;
        e5bVar.getClass();
        return e5bVar;
    }

    public static Map f(Object obj, Map map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return h(linkedHashMap);
    }

    public static LinkedHashMap g(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(pairArr.length));
        k(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final Map h(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static LinkedHashMap i(Map map, Map map2) {
        map.getClass();
        map2.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map j(Map map, Pair pair) {
        map.getClass();
        if (map.isEmpty()) {
            return tah.b(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.a, pair.b);
        return linkedHashMap;
    }

    public static final void k(AbstractMap abstractMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            abstractMap.put(pair.a, pair.b);
        }
    }

    public static final void l(LinkedHashMap linkedHashMap, Iterable iterable) {
        iterable.getClass();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            linkedHashMap.put(pair.a, pair.b);
        }
    }

    public static Map m(lcc lccVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        kcc kccVar = new kcc(lccVar);
        while (kccVar.hasNext()) {
            Pair pair = (Pair) kccVar.next();
            linkedHashMap.put(pair.a, pair.b);
        }
        return h(linkedHashMap);
    }

    public static Map n(Iterable iterable) {
        iterable.getClass();
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            l(linkedHashMap, iterable);
            return h(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        if (size == 1) {
            return tah.b((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(tah.a(collection.size()));
        l(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static Map o(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map p(Pair[] pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            e5b e5bVar = e5b.a;
            e5bVar.getClass();
            return e5bVar;
        }
        if (length == 1) {
            return tah.b(pairArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(tah.a(pairArr.length));
        k(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap q(Map map) {
        map.getClass();
        return new LinkedHashMap(map);
    }
}
