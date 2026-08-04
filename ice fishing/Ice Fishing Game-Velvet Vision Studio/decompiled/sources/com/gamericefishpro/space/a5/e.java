package com.gamericefishpro.space.a5;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.ei.a0;
import com.gamericefishpro.space.f5.k;
import com.gamericefishpro.space.g5.p;
import com.gamericefishpro.space.t.h0;
import com.gamericefishpro.space.t0.f0;
import com.gamericefishpro.space.v.q;
import com.gamericefishpro.space.z4.u;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // com.gamericefishpro.space.t0.f0
    public final void a() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((u) this.b).g().f((d) this.c);
                com.gamericefishpro.space.e.h hVar = (com.gamericefishpro.space.e.h) ((a0) this.d).d;
                if (hVar != null) {
                    hVar.a();
                }
                break;
            case 1:
                com.gamericefishpro.space.e1.d dVar = (com.gamericefishpro.space.e1.d) this.b;
                h0 h0Var = dVar.e;
                Object obj = this.c;
                Object objK = h0Var.k(obj);
                com.gamericefishpro.space.e1.i iVar = (com.gamericefishpro.space.e1.i) this.d;
                if (objK == iVar) {
                    Map map = dVar.d;
                    Map mapD = iVar.d();
                    if (!mapD.isEmpty()) {
                        map.put(obj, mapD);
                    } else {
                        map.remove(obj);
                    }
                }
                break;
            case 2:
                p pVar = (p) this.b;
                k kVar = (k) this.c;
                pVar.b().c(kVar);
                ((com.gamericefishpro.space.f1.u) this.d).remove(kVar);
                break;
            default:
                com.gamericefishpro.space.f1.u uVar = (com.gamericefishpro.space.f1.u) this.b;
                Object obj2 = this.c;
                uVar.remove(obj2);
                ((q) this.d).d.k(obj2);
                break;
        }
    }
}
