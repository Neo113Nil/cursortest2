package com.gamericefishpro.space.si;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements e {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ e e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ com.gamericefishpro.space.oh.d v;

    public y(y yVar, com.gamericefishpro.space.c7.e eVar, com.gamericefishpro.space.l4.n nVar) {
        this.i = yVar;
        this.e = eVar;
        this.v = nVar;
    }

    @Override // com.gamericefishpro.space.si.e
    public final Object a(f fVar, com.gamericefishpro.space.th.a aVar) {
        int i = this.d;
        com.gamericefishpro.space.oh.d dVar = this.v;
        Object obj = this.i;
        e eVar = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object objA = com.gamericefishpro.space.ti.c.a(new q((com.gamericefishpro.space.l4.n) dVar, (com.gamericefishpro.space.th.a) null), fVar, aVar, new e[]{(y) obj, eVar});
                return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
            default:
                Object objA2 = eVar.a(new com.gamericefishpro.space.g5.v(fVar, (com.gamericefishpro.space.s5.t) obj, (Function1) dVar, 3), aVar);
                return objA2 == com.gamericefishpro.space.uh.a.d ? objA2 : Unit.a;
        }
    }

    public y(e eVar, com.gamericefishpro.space.s5.t tVar, Function1 function1) {
        this.e = eVar;
        this.i = tVar;
        this.v = function1;
    }
}
