package defpackage;

import defpackage.rf90;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedDeque;

/* loaded from: classes9.dex */
public final class sf90 {
    public volatile rf90 a = new rf90();
    public final ConcurrentLinkedDeque b = new ConcurrentLinkedDeque();

    public final void a() {
        boolean isEmpty = this.b.isEmpty();
        ConcurrentLinkedDeque concurrentLinkedDeque = this.b;
        if (!isEmpty) {
            concurrentLinkedDeque.addLast(new rf90());
        } else {
            concurrentLinkedDeque.addLast(this.a);
            this.a = new rf90();
        }
    }

    public final void b() {
        this.b.pollLast();
    }

    public final rf90.a c(g0c g0cVar) {
        rf90.a aVar;
        Iterator descendingIterator = this.b.descendingIterator();
        do {
            aVar = null;
            if (!descendingIterator.hasNext()) {
                Object obj = this.a.a.get(g0cVar);
                if (obj instanceof rf90.a) {
                    return (rf90.a) obj;
                }
                return null;
            }
            Object obj2 = ((rf90) descendingIterator.next()).a.get(g0cVar);
            if (obj2 instanceof rf90.a) {
                aVar = (rf90.a) obj2;
            }
        } while (aVar == null);
        return aVar;
    }

    public final void d(g0c g0cVar) {
        rf90 rf90Var = (rf90) this.b.peekLast();
        if (rf90Var == null) {
            rf90Var = this.a;
        }
        rf90Var.a.remove(g0cVar);
    }

    public final void e(rf90.a... aVarArr) {
        rf90 rf90Var = (rf90) this.b.peekLast();
        if (rf90Var == null) {
            rf90Var = this.a;
        }
        ConcurrentHashMap concurrentHashMap = rf90Var.a;
        int d = gw00.d(aVarArr.length);
        if (d < 16) {
            d = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(d);
        for (rf90.a aVar : aVarArr) {
            linkedHashMap.put(qoi0.a(aVar.getClass()), aVar);
        }
        concurrentHashMap.putAll(linkedHashMap);
    }
}
