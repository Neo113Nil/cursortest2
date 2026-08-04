package com.gamericefishpro.space.i9;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class t4 extends k {
    public final com.gamericefishpro.space.a8.c e;

    public t4(com.gamericefishpro.space.a8.c cVar) {
        this.e = cVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.gamericefishpro.space.i9.k, com.gamericefishpro.space.i9.n
    public final n l(String str, com.gamericefishpro.space.u6.n nVar, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        com.gamericefishpro.space.a8.c cVar = this.e;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    a4.K("getEventName", arrayList, 0);
                    return new q(((b) cVar.i).a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    a4.K("getTimestamp", arrayList, 0);
                    return new g(Double.valueOf(((b) cVar.i).b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    a4.K("getParamValue", arrayList, 1);
                    String strM = ((t) nVar.e).c(nVar, (n) arrayList.get(0)).m();
                    HashMap map = ((b) cVar.i).c;
                    return com.gamericefishpro.space.i.a.U(map.containsKey(strM) ? map.get(strM) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    a4.K("getParams", arrayList, 0);
                    HashMap map2 = ((b) cVar.i).c;
                    k kVar = new k();
                    for (String str2 : map2.keySet()) {
                        kVar.n(str2, com.gamericefishpro.space.i.a.U(map2.get(str2)));
                    }
                    return kVar;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    a4.K("setParamValue", arrayList, 2);
                    String strM2 = ((t) nVar.e).c(nVar, (n) arrayList.get(0)).m();
                    n nVarC = ((t) nVar.e).c(nVar, (n) arrayList.get(1));
                    b bVar = (b) cVar.i;
                    Object objS = a4.S(nVarC);
                    HashMap map3 = bVar.c;
                    if (objS == null) {
                        map3.remove(strM2);
                        return nVarC;
                    }
                    map3.put(strM2, b.b(strM2, map3.get(strM2), objS));
                    return nVarC;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    a4.K("setEventName", arrayList, 1);
                    n nVarC2 = ((t) nVar.e).c(nVar, (n) arrayList.get(0));
                    if (n.j.equals(nVarC2) || n.k.equals(nVarC2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    ((b) cVar.i).a = nVarC2.m();
                    return new q(nVarC2.m());
                }
                break;
        }
        return super.l(str, nVar, arrayList);
    }
}
