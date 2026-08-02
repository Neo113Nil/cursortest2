package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class x60 implements g0c {
    public final ArrayList a;
    public final wm b;

    public x60(ArrayList arrayList, wm wmVar) {
        this.a = arrayList;
        this.b = wmVar;
    }

    public final void a(qne qneVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        w1g.n((LinkedHashMap) qneVar.b, new u60(linkedHashMap, 2));
        ci0 ci0Var = qjb.a;
        linkedHashMap.put("timestamp", Long.valueOf(qee.n()));
        linkedHashMap.put("version", 1);
        w1g.n(uah.q(this.b.b), new u60(linkedHashMap, 0));
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((wib) it.next()).a(new nnd(7, "EVENTUS_".concat((String) qneVar.a), linkedHashMap));
        }
    }

    public final mif b(qne qneVar, s8 s8Var) {
        ci0 ci0Var = qjb.a;
        int i = 0;
        w60 w60Var = new w60(qee.n(), i);
        a(qneVar);
        mif.b(mif.b(s8Var, new v60(this, qneVar, w60Var, i), null, 5), lhb.x0, new v60(this, qneVar, w60Var, 1), 1);
        return s8Var;
    }
}
