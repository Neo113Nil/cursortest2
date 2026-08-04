package com.gamericefishpro.space.u8;

import android.content.Context;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends q {
    public final /* synthetic */ int i;
    public final /* synthetic */ r v;
    public final Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, Object obj, int i) {
        super(rVar);
        this.i = i;
        this.v = rVar;
        this.w = obj;
    }

    @Override // com.gamericefishpro.space.u8.q
    public final void c() {
        com.gamericefishpro.space.p9.a aVar;
        Set set;
        switch (this.i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                r rVar = this.v;
                x xVar = rVar.d;
                Context context = rVar.i;
                com.gamericefishpro.space.u6.e eVar = new com.gamericefishpro.space.u6.e(rVar.v);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                HashMap map = (HashMap) this.w;
                for (com.gamericefishpro.space.t8.a aVar2 : map.keySet()) {
                    aVar2.getClass();
                    if (((k) map.get(aVar2)).c) {
                        arrayList2.add(aVar2);
                    } else {
                        arrayList.add(aVar2);
                    }
                }
                int i = 0;
                int iN = -1;
                if (arrayList.isEmpty()) {
                    int size = arrayList2.size();
                    while (i < size) {
                        iN = eVar.n(context, (com.gamericefishpro.space.t8.a) arrayList2.get(i));
                        i++;
                        if (iN == 0) {
                        }
                    }
                } else {
                    int size2 = arrayList.size();
                    while (i < size2) {
                        iN = eVar.n(context, (com.gamericefishpro.space.t8.a) arrayList.get(i));
                        i++;
                        if (iN != 0) {
                        }
                    }
                }
                if (iN != 0) {
                    l lVar = new l(this, rVar, new com.gamericefishpro.space.s8.b(iN, null, null));
                    s sVar = xVar.h;
                    sVar.sendMessage(sVar.obtainMessage(1, lVar));
                    return;
                }
                if (rVar.F && (aVar = rVar.D) != null) {
                    aVar.A();
                }
                for (com.gamericefishpro.space.t8.a aVar3 : map.keySet()) {
                    com.gamericefishpro.space.v8.d dVar = (com.gamericefishpro.space.v8.d) map.get(aVar3);
                    aVar3.getClass();
                    if (eVar.n(context, aVar3) != 0) {
                        m mVar = new m(rVar, dVar);
                        s sVar2 = xVar.h;
                        sVar2.sendMessage(sVar2.obtainMessage(1, mVar));
                    } else {
                        aVar3.d(dVar);
                    }
                }
                return;
            default:
                r rVar2 = this.v;
                x xVar2 = rVar2.d;
                u uVar = xVar2.p;
                com.gamericefishpro.space.b8.k kVar = rVar2.K;
                if (kVar == null) {
                    set = Collections.EMPTY_SET;
                } else {
                    HashSet hashSet = new HashSet((Set) kVar.d);
                    Map map2 = (Map) kVar.i;
                    for (com.gamericefishpro.space.t8.c cVar : map2.keySet()) {
                        if (!xVar2.j.containsKey(cVar.b)) {
                            map2.get(cVar).getClass();
                            throw new ClassCastException();
                        }
                    }
                    set = hashSet;
                }
                uVar.p = set;
                ArrayList arrayList3 = (ArrayList) this.w;
                int size3 = arrayList3.size();
                for (int i2 = 0; i2 < size3; i2++) {
                    ((com.gamericefishpro.space.t8.a) arrayList3.get(i2)).e(rVar2.H, xVar2.p.p);
                }
                return;
        }
    }
}
