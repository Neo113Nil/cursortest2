package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes11.dex */
public final class ssb1 extends nya1 {
    public final wl91 b = new wl91();

    @Override // defpackage.nya1
    public final void d(Throwable th, Throwable th2) {
        if (th2 == th) {
            yci0.p("Self suppression is not allowed.", th2);
            return;
        }
        wl91 wl91Var = this.b;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) wl91Var.a;
        ReferenceQueue referenceQueue = (ReferenceQueue) wl91Var.b;
        for (Reference poll = referenceQueue.poll(); poll != null; poll = referenceQueue.poll()) {
            concurrentHashMap.remove(poll);
        }
        List list = (List) concurrentHashMap.get(new lqb1(th, null));
        if (list == null) {
            list = new Vector(2);
            List list2 = (List) concurrentHashMap.putIfAbsent(new lqb1(th, referenceQueue), list);
            if (list2 != null) {
                list = list2;
            }
        }
        list.add(th2);
    }
}
