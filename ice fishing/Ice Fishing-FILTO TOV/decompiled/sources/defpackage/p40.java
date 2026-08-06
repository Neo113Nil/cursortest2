package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class p40 {
    public static final ConcurrentHashMap GWasM1elztuh = new ConcurrentHashMap();

    public static final String GWasM1elztuh(va vaVar) {
        vaVar.getClass();
        ConcurrentHashMap concurrentHashMap = GWasM1elztuh;
        String str = (String) concurrentHashMap.get(vaVar);
        if (str != null) {
            return str;
        }
        Class cls = vaVar.GWasM1elztuh;
        cls.getClass();
        String name = cls.getName();
        concurrentHashMap.put(vaVar, name);
        return name;
    }
}
