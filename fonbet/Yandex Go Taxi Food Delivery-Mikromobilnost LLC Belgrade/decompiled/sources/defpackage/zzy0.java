package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.collections.b;

/* loaded from: classes9.dex */
public final class zzy0 implements dw {
    public final sls a;
    public final LinkedHashMap b = new LinkedHashMap();

    public zzy0(sls slsVar) {
        this.a = slsVar;
    }

    @Override // defpackage.dw
    public final void handle(kr krVar, n6u n6uVar) {
        xzy0 xzy0Var = (xzy0) krVar;
        sls slsVar = this.a;
        long longValue = ((Number) slsVar.invoke()).longValue();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashMap linkedHashMap = this.b;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((yzy0) entry.getKey()).a.b < longValue - ((Number) b.g(entry.getKey(), linkedHashMap)).longValue()) {
                linkedHashSet.add(entry.getKey());
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            linkedHashMap.remove((yzy0) it.next());
        }
        yzy0 yzy0Var = new yzy0(xzy0Var, xzy0Var.c);
        if (linkedHashMap.containsKey(yzy0Var)) {
            return;
        }
        linkedHashMap.put(yzy0Var, slsVar.invoke());
        n6uVar.c.b(xzy0Var.a, n6uVar.b, n6uVar.e);
    }
}
