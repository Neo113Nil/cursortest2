package bc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public abstract class z extends a0 {
    public static Object N(HashMap hashMap, Object obj) {
        pc.j.e(hashMap, "<this>");
        Object obj2 = hashMap.get(obj);
        if (obj2 != null || hashMap.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static final void O(HashMap hashMap, ac.i[] iVarArr) {
        for (ac.i iVar : iVarArr) {
            hashMap.put(iVar.f270g, iVar.f271h);
        }
    }

    public static List P(Map map) {
        pc.j.e(map, "<this>");
        int size = map.size();
        v vVar = v.f1067g;
        if (size == 0) {
            return vVar;
        }
        Iterator it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return vVar;
        }
        Map.Entry entry = (Map.Entry) it.next();
        if (!it.hasNext()) {
            return i7.b.z(new ac.i(entry.getKey(), entry.getValue()));
        }
        ArrayList arrayList = new ArrayList(map.size());
        arrayList.add(new ac.i(entry.getKey(), entry.getValue()));
        do {
            Map.Entry entry2 = (Map.Entry) it.next();
            arrayList.add(new ac.i(entry2.getKey(), entry2.getValue()));
        } while (it.hasNext());
        return arrayList;
    }

    public static Map Q(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return w.f1068g;
        }
        if (size == 1) {
            return a0.C((ac.i) arrayList.get(0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(a0.B(arrayList.size()));
        int size2 = arrayList.size();
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList.get(i10);
            i10++;
            ac.i iVar = (ac.i) obj;
            linkedHashMap.put(iVar.f270g, iVar.f271h);
        }
        return linkedHashMap;
    }

    public static Map R(Map map) {
        pc.j.e(map, "<this>");
        int size = map.size();
        if (size == 0) {
            return w.f1068g;
        }
        if (size != 1) {
            return S(map);
        }
        pc.j.e(map, "<this>");
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        pc.j.d(singletonMap, "with(...)");
        return singletonMap;
    }

    public static LinkedHashMap S(Map map) {
        pc.j.e(map, "<this>");
        return new LinkedHashMap(map);
    }
}
