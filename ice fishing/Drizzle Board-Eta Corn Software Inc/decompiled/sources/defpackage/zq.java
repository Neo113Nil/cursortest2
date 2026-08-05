package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public abstract class zq extends ej0 {
    public static int ESscZ9M1(int i) {
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

    public static Map LfKQckgD(Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return xf.NCTxEWno;
        }
        if (size != 1) {
            return new LinkedHashMap(map);
        }
        Map.Entry entry = (Map.Entry) map.entrySet().iterator().next();
        Map singletonMap = Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static Map VGmz0ccI(ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return xf.NCTxEWno;
        }
        int i = 0;
        if (size == 1) {
            hx hxVar = (hx) arrayList.get(0);
            hxVar.getClass();
            Map singletonMap = Collections.singletonMap(hxVar.NCTxEWno, hxVar.MdtA4re8);
            singletonMap.getClass();
            return singletonMap;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(ESscZ9M1(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            Object obj = arrayList.get(i);
            i++;
            hx hxVar2 = (hx) obj;
            linkedHashMap.put(hxVar2.NCTxEWno, hxVar2.MdtA4re8);
        }
        return linkedHashMap;
    }

    public static Object g2aRJUAd(LinkedHashMap linkedHashMap, Object obj) {
        linkedHashMap.getClass();
        Object obj2 = linkedHashMap.get(obj);
        if (obj2 != null || linkedHashMap.containsKey(obj)) {
            return obj2;
        }
        throw new NoSuchElementException("Key " + obj + " is missing in the map.");
    }
}
