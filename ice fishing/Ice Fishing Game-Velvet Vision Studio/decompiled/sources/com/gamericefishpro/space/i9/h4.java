package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h4 extends h {
    public final /* synthetic */ int i = 0;
    public final Object v;

    public h4(com.gamericefishpro.space.a8.c cVar) {
        super("internal.eventLogger");
        this.v = cVar;
    }

    @Override // com.gamericefishpro.space.i9.h
    public final n a(com.gamericefishpro.space.u6.n nVar, List list) {
        TreeMap treeMap;
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                a4.K(this.d, list, 3);
                String strM = ((t) nVar.e).c(nVar, (n) list.get(0)).m();
                n nVar2 = (n) list.get(1);
                t tVar = (t) nVar.e;
                long jR = (long) a4.R(tVar.c(nVar, nVar2).c().doubleValue());
                n nVarC = tVar.c(nVar, (n) list.get(2));
                HashMap mapT = nVarC instanceof k ? a4.T((k) nVarC) : new HashMap();
                com.gamericefishpro.space.a8.c cVar = (com.gamericefishpro.space.a8.c) this.v;
                cVar.getClass();
                HashMap map = new HashMap();
                for (String str : mapT.keySet()) {
                    HashMap map2 = ((b) cVar.e).c;
                    map.put(str, b.b(str, map2.containsKey(str) ? map2.get(str) : null, mapT.get(str)));
                }
                ((ArrayList) cVar.v).add(new b(strM, jR, map));
                return n.j;
            case 1:
                a4.K("getValue", list, 2);
                n nVarC2 = ((t) nVar.e).c(nVar, (n) list.get(0));
                n nVarC3 = ((t) nVar.e).c(nVar, (n) list.get(1));
                String strM2 = nVarC2.m();
                com.gamericefishpro.space.u6.e eVar = (com.gamericefishpro.space.u6.e) this.v;
                Map map3 = (Map) ((com.gamericefishpro.space.n9.l1) eVar.c).v.get((String) eVar.b);
                String str2 = (map3 == null || !map3.containsKey(strM2)) ? null : (String) map3.get(strM2);
                return str2 != null ? new q(str2) : nVarC3;
            case 2:
                return n.j;
            case 3:
                try {
                    return com.gamericefishpro.space.i.a.U(((com.gamericefishpro.space.n9.j1) this.v).call());
                } catch (Exception unused) {
                    return n.j;
                }
            default:
                a4.K(this.d, list, 3);
                ((t) nVar.e).c(nVar, (n) list.get(0)).m();
                n nVar3 = (n) list.get(1);
                t tVar2 = (t) nVar.e;
                n nVarC4 = tVar2.c(nVar, nVar3);
                if (!(nVarC4 instanceof m)) {
                    throw new IllegalArgumentException("Invalid callback type");
                }
                n nVarC5 = tVar2.c(nVar, (n) list.get(2));
                if (!(nVarC5 instanceof k)) {
                    throw new IllegalArgumentException("Invalid callback params");
                }
                k kVar = (k) nVarC5;
                HashMap map4 = kVar.d;
                if (!map4.containsKey(com.gamericefishpro.space.vd.m.EVENT_TYPE_KEY)) {
                    throw new IllegalArgumentException("Undefined rule type");
                }
                String strM3 = kVar.f(com.gamericefishpro.space.vd.m.EVENT_TYPE_KEY).m();
                int iQ = map4.containsKey("priority") ? a4.Q(kVar.f("priority").c().doubleValue()) : 1000;
                t tVar3 = (t) this.v;
                m mVar = (m) nVarC4;
                tVar3.getClass();
                if ("create".equals(strM3)) {
                    treeMap = (TreeMap) tVar3.b;
                } else {
                    if (!"edit".equals(strM3)) {
                        throw new IllegalStateException("Unknown callback type: ".concat(String.valueOf(strM3)));
                    }
                    treeMap = (TreeMap) tVar3.a;
                }
                if (treeMap.containsKey(Integer.valueOf(iQ))) {
                    iQ = ((Integer) treeMap.lastKey()).intValue() + 1;
                }
                treeMap.put(Integer.valueOf(iQ), mVar);
                return n.j;
        }
    }

    public h4(t tVar) {
        super("internal.registerCallback");
        this.v = tVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(t5 t5Var, com.gamericefishpro.space.u6.e eVar) {
        super("getValue");
        this.v = eVar;
    }

    public h4(com.gamericefishpro.space.m.d dVar) {
        super("internal.logger");
        this.v = dVar;
        this.e.put("log", new v9(this, false, true));
        this.e.put("silent", new t5("silent", 1));
        ((h) this.e.get("silent")).n("log", new v9(this, true, true));
        this.e.put("unmonitored", new t5("unmonitored", 2));
        ((h) this.e.get("unmonitored")).n("log", new v9(this, false, false));
    }

    public h4(com.gamericefishpro.space.n9.j1 j1Var) {
        super("internal.appMetadata");
        this.v = j1Var;
    }
}
