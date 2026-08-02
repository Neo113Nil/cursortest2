package kotlin.collections;

import defpackage.bu00;
import defpackage.cu00;
import defpackage.gw00;
import defpackage.qv10;
import defpackage.s5r;
import defpackage.t5r;
import defpackage.w511;
import defpackage.ycc;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* loaded from: classes9.dex */
public class b extends gw00 {
    public static Map f() {
        return EmptyMap.a;
    }

    public static Object g(Object obj, Map map) {
        if (map instanceof bu00) {
            return ((cu00) ((bu00) map)).b(obj);
        }
        Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        w511.i(qv10.p("Key ", " is missing in the map.", obj));
        return null;
    }

    public static HashMap h(Pair... pairArr) {
        HashMap hashMap = new HashMap(gw00.d(pairArr.length));
        q(hashMap, pairArr);
        return hashMap;
    }

    public static Map i(Pair... pairArr) {
        if (pairArr.length <= 0) {
            return EmptyMap.a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(pairArr.length));
        q(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static Map j(Object obj, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.remove(obj);
        return m(linkedHashMap);
    }

    public static Map k(Map map, Iterable iterable) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.keySet().removeAll(ycc.u(iterable));
        return m(linkedHashMap);
    }

    public static LinkedHashMap l(Pair... pairArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(pairArr.length));
        q(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static final Map m(LinkedHashMap linkedHashMap) {
        int size = linkedHashMap.size();
        if (size == 0) {
            return EmptyMap.a;
        }
        if (size != 1) {
            return linkedHashMap;
        }
        Map.Entry entry = (Map.Entry) linkedHashMap.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static LinkedHashMap n(Map map, Map map2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.putAll(map2);
        return linkedHashMap;
    }

    public static Map o(Map map, Pair pair) {
        if (map.isEmpty()) {
            return gw00.e(pair);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        linkedHashMap.put(pair.c(), pair.f());
        return linkedHashMap;
    }

    public static void p(AbstractMap abstractMap, Iterable iterable) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            abstractMap.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static final void q(AbstractMap abstractMap, Pair[] pairArr) {
        for (Pair pair : pairArr) {
            abstractMap.put(pair.getFirst(), pair.getSecond());
        }
    }

    public static Map r(t5r t5rVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        s5r s5rVar = new s5r(t5rVar);
        while (s5rVar.hasNext()) {
            Pair pair = (Pair) s5rVar.next();
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return m(linkedHashMap);
    }

    public static Map s(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            p(linkedHashMap, iterable);
            return m(linkedHashMap);
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return EmptyMap.a;
        }
        if (size == 1) {
            return gw00.e((Pair) (iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next()));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(collection.size()));
        p(linkedHashMap2, iterable);
        return linkedHashMap2;
    }

    public static Map t(Map map) {
        int size = map.size();
        if (size == 0) {
            return EmptyMap.a;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        return Collections.singletonMap(entry.getKey(), entry.getValue());
    }

    public static Map u(Pair[] pairArr) {
        int length = pairArr.length;
        if (length == 0) {
            return EmptyMap.a;
        }
        if (length == 1) {
            return gw00.e(pairArr[0]);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(pairArr.length));
        q(linkedHashMap, pairArr);
        return linkedHashMap;
    }

    public static LinkedHashMap v(LinkedHashMap linkedHashMap) {
        return new LinkedHashMap(linkedHashMap);
    }
}
