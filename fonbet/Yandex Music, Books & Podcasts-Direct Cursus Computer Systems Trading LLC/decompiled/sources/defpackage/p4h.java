package defpackage;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes3.dex */
public final class p4h {
    public final o9w a;
    public final ConcurrentHashMap b = new ConcurrentHashMap();

    public p4h(i5h i5hVar, o9w o9wVar) {
        this.a = o9wVar;
    }

    public final ydh a(String str) {
        Object putIfAbsent;
        str.getClass();
        ConcurrentHashMap concurrentHashMap = this.b;
        Object obj = concurrentHashMap.get(str);
        if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new ydh(str, this.a)))) != null) {
            obj = putIfAbsent;
        }
        return (ydh) obj;
    }

    public final void b(rsr rsrVar, String str) {
        str.getClass();
        rsrVar.getClass();
        ydh a = a(str);
        Iterator it = u75.h(a.a, a.b, a.c, a.d).iterator();
        while (it.hasNext()) {
            ((tdh) it.next()).b(rsrVar);
        }
    }
}
