package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class y8h implements d1d {
    public final LinkedHashMap a = new LinkedHashMap();

    public final y8h a(Class cls, Object obj) {
        this.a.put(cls.getName(), obj);
        return this;
    }

    public final Object b(Class cls) {
        String name = cls.getName();
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(name);
        if (obj == null) {
            Iterator it = linkedHashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (cls.isInstance(obj)) {
                    break;
                }
            }
        }
        if (!cls.isInstance(obj)) {
            obj = null;
        }
        if (obj != null) {
            return obj;
        }
        ny61.g(oyr.p("No component for class \"", cls.getSimpleName(), "\" was found"));
        return null;
    }
}
