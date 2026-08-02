package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes4.dex */
public final class rk7 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a(Class cls, Object obj) {
        obj.getClass();
        this.a.put(cls.getName(), obj);
    }

    public final Object b(Class cls) {
        String name = cls.getName();
        LinkedHashMap linkedHashMap = this.a;
        Object obj = linkedHashMap.get(name);
        Object obj2 = null;
        if (obj == null) {
            Iterator it = linkedHashMap.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                Object next = it.next();
                if (cls.isInstance(next)) {
                    obj = next;
                    break;
                }
            }
        }
        if (cls.isInstance(obj)) {
            obj.getClass();
            obj2 = obj;
        }
        if (obj2 != null) {
            return obj2;
        }
        xq0.x(hrg.q("No component for class \"", cls.getSimpleName(), "\" was found"));
        return null;
    }
}
