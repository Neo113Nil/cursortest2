package defpackage;

/* loaded from: classes.dex */
public abstract class yh0 extends defpackage.f70 {
    public static java.util.Map XZx205DYe(java.util.Map map) {
        map.getClass();
        int size = map.size();
        if (size == 0) {
            return defpackage.ot.adDC3e2L;
        }
        if (size != 1) {
            return new java.util.LinkedHashMap(map);
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) map.entrySet().iterator().next();
        java.util.Map singletonMap = java.util.Collections.singletonMap(entry.getKey(), entry.getValue());
        singletonMap.getClass();
        return singletonMap;
    }

    public static java.lang.Object p4kuH6PDtgom(java.lang.Object obj, java.util.Map map) {
        map.getClass();
        java.lang.Object obj2 = map.get(obj);
        if (obj2 != null || map.containsKey(obj)) {
            return obj2;
        }
        throw new java.util.NoSuchElementException("Key " + obj + " is missing in the map.");
    }

    public static java.util.Map wll2JLbTBC2(java.util.ArrayList arrayList) {
        int size = arrayList.size();
        if (size == 0) {
            return defpackage.ot.adDC3e2L;
        }
        int i = 0;
        if (size == 1) {
            defpackage.et0 et0Var = (defpackage.et0) arrayList.get(0);
            et0Var.getClass();
            java.util.Map singletonMap = java.util.Collections.singletonMap(et0Var.adDC3e2L, et0Var.xiZrDbcSW0);
            singletonMap.getClass();
            return singletonMap;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(yIx6ChFVk(arrayList.size()));
        int size2 = arrayList.size();
        while (i < size2) {
            java.lang.Object obj = arrayList.get(i);
            i++;
            defpackage.et0 et0Var2 = (defpackage.et0) obj;
            linkedHashMap.put(et0Var2.adDC3e2L, et0Var2.xiZrDbcSW0);
        }
        return linkedHashMap;
    }

    public static int yIx6ChFVk(int i) {
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
