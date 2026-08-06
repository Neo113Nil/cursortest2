package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class jk0 extends defpackage.b80 {
    public static java.util.Map OVwOqzUGHcCU(java.util.Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return defpackage.bv.WDYagTQQm9ns;
        }
        if (size != 1) {
            return new java.util.LinkedHashMap(map);
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) map.entrySet().iterator().next();
        java.util.Map singletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static java.util.Map Wc0TdmRSwbbi(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return defpackage.bv.WDYagTQQm9ns;
        }
        int i = 0;
        if (size == 1) {
            defpackage.bw0 bw0Var = (defpackage.bw0) arrayList.get(0);
            bw0Var.getClass();
            java.util.Map singletonMap = java.util.Collections.singletonMap(bw0Var.WDYagTQQm9ns, bw0Var.oh71FJcDz6S2);
            singletonMap.getClass();
            return singletonMap;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(zJPqDeoF0Os1(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            defpackage.bw0 bw0Var2 = (defpackage.bw0) obj;
            linkedHashMap.put(bw0Var2.WDYagTQQm9ns, bw0Var2.oh71FJcDz6S2);
        }
        return linkedHashMap;
    }

    public static java.lang.Object w6IV1lieBIux(java.util.HashMap hashMap, java.lang.Object obj) {
        hashMap.getClass();
        java.lang.Object obj2 = hashMap.get(obj);
        if (obj2 != null || hashMap.containsKey(obj)) {
            return obj2;
        }
        throw new java.util.NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static int zJPqDeoF0Os1(int i) {
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
