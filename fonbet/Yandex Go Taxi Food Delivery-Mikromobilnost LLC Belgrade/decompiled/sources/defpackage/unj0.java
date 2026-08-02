package defpackage;

import defpackage.pnj0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public final class unj0 implements en11 {
    public final /* synthetic */ en11 a;
    public final k7x0 b;

    public unj0(rqo rqoVar, k7x0 k7x0Var) {
        this.a = ((jbh) rqoVar).b(new pnj0(0));
        this.b = k7x0Var;
    }

    @Override // defpackage.qqo
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.qqo
    public final Object b() {
        return (pnj0) this.a.b();
    }

    @Override // defpackage.en11
    public final tpr c() {
        return this.a.c();
    }

    public final LinkedHashMap d(pnj0 pnj0Var, String str) {
        Map map = (Map) pnj0Var.c.get(str);
        if (map == null) {
            hst hstVar = jst.e;
            Map map2 = pnj0Var.c;
            ArrayList arrayList = new ArrayList(map2.size());
            Iterator it = map2.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) ((Map.Entry) it.next()).getKey());
            }
            hstVar.a(20, "RequirementsCarouselOverrideExperimentRepository", null, "Not found override " + str + " from overrides: " + arrayList);
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(gw00.d(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            pnj0.b bVar = (pnj0.b) entry.getValue();
            String str2 = bVar.a;
            String a = str2 != null ? ((m7x0) this.b).a(str2) : null;
            Map map3 = bVar.b;
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(gw00.d(map3.size()));
            for (Map.Entry entry2 : map3.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), new az8(((pnj0.a) entry2.getValue()).a));
            }
            linkedHashMap.put(key, new cz8(a, linkedHashMap2));
        }
        return linkedHashMap;
    }

    @Override // defpackage.en11
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }
}
