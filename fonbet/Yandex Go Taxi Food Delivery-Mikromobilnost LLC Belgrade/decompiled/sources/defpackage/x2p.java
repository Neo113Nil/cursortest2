package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes8.dex */
public final class x2p {
    public final tt2 a;
    public final r0 b = bvf0.c(b.f());

    public x2p(tt2 tt2Var) {
        this.a = tt2Var;
    }

    public final LinkedHashMap a() {
        Map map = (Map) this.b.getValue();
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Iterable iterable = (Iterable) entry.getValue();
            ArrayList arrayList = new ArrayList(tcc.n(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((ren) it.next()).g());
            }
            linkedHashMap.put(key, a.N0(arrayList));
        }
        return linkedHashMap;
    }

    public final void b(List list) {
        List list2 = list;
        r0 r0Var = this.b;
        if (list2 == null || list2.isEmpty()) {
            Map f = b.f();
            r0Var.getClass();
            r0Var.m(null, f);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ren renVar = (ren) it.next();
            ((Set) linkedHashMap.computeIfAbsent(renVar.m(), new dxd(2, new dsg(17)))).add(renVar);
        }
        r0Var.getClass();
        r0Var.m(null, linkedHashMap);
    }
}
