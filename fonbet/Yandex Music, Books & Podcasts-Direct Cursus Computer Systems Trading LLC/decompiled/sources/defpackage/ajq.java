package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public final class ajq {
    public final int a;
    public final LinkedHashMap b = new LinkedHashMap();

    public ajq(int i) {
        this.a = i;
    }

    public final void a(Object obj, Object obj2) {
        Object obj3;
        pp3 pp3Var = new pp3(obj2);
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(obj, pp3Var);
        while (linkedHashMap.size() > this.a) {
            Iterator it = linkedHashMap.entrySet().iterator();
            if (it.hasNext()) {
                Object next = it.next();
                if (it.hasNext()) {
                    long j = ((pp3) ((Map.Entry) next).getValue()).b;
                    do {
                        Object next2 = it.next();
                        long j2 = ((pp3) ((Map.Entry) next2).getValue()).b;
                        if (j > j2) {
                            next = next2;
                            j = j2;
                        }
                    } while (it.hasNext());
                }
                obj3 = next;
            } else {
                obj3 = null;
            }
            Map.Entry entry = (Map.Entry) obj3;
            if (entry != null) {
                linkedHashMap.remove(entry.getKey());
            }
        }
    }
}
