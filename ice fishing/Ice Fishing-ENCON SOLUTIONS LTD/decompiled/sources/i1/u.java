package i1;

import a.AbstractC0083a;
import h1.C0234d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class u extends v {
    public static Map I(C0234d... c0234dArr) {
        if (c0234dArr.length <= 0) {
            return s.f3417a;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.G(c0234dArr.length));
        J(linkedHashMap, c0234dArr);
        return linkedHashMap;
    }

    public static final void J(LinkedHashMap linkedHashMap, C0234d[] c0234dArr) {
        for (C0234d c0234d : c0234dArr) {
            linkedHashMap.put(c0234d.f3386a, c0234d.f3387b);
        }
    }

    public static List K(Map map) {
        int size = map.size();
        r rVar = r.f3416a;
        if (size == 0) {
            return rVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return rVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return AbstractC0083a.m(new C0234d(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new C0234d(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new C0234d(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map L(ArrayList arrayList) {
        s sVar = s.f3417a;
        int size = arrayList.size();
        if (size == 0) {
            return sVar;
        }
        if (size == 1) {
            return v.H((C0234d) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(v.G(arrayList.size()));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0234d c0234d = (C0234d) it.next();
            linkedHashMap.put(c0234d.f3386a, c0234d.f3387b);
        }
        return linkedHashMap;
    }

    public static Map M(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return s.f3417a;
        }
        if (size != 1) {
            return N(map);
        }
        kotlin.jvm.internal.i.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        kotlin.jvm.internal.i.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap N(Map map) {
        kotlin.jvm.internal.i.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
