package com.gamericefishpro.space.l4;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements com.gamericefishpro.space.si.e {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public p(com.gamericefishpro.space.si.m mVar) {
        this.e = mVar;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Type inference failed for: r6v6, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.si.e
    public final Object a(com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a aVar) throws Throwable {
        com.gamericefishpro.space.si.a aVar2;
        Throwable th;
        com.gamericefishpro.space.ti.t tVar;
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object objA = ((com.gamericefishpro.space.si.m) this.e).a(new com.gamericefishpro.space.c7.d(fVar, 5), aVar);
                return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
            default:
                if (aVar instanceof com.gamericefishpro.space.si.a) {
                    aVar2 = (com.gamericefishpro.space.si.a) aVar;
                    int i = aVar2.v;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        aVar2.v = i - Integer.MIN_VALUE;
                    } else {
                        aVar2 = new com.gamericefishpro.space.si.a(this, aVar);
                    }
                } else {
                    aVar2 = new com.gamericefishpro.space.si.a(this, aVar);
                }
                Object obj = aVar2.e;
                Object obj2 = com.gamericefishpro.space.uh.a.d;
                int i2 = aVar2.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    tVar = aVar2.d;
                    try {
                        com.gamericefishpro.space.wa.b.P(obj);
                        tVar.releaseIntercepted();
                        return Unit.a;
                    } catch (Throwable th2) {
                        th = th2;
                        tVar.releaseIntercepted();
                        throw th;
                    }
                }
                com.gamericefishpro.space.wa.b.P(obj);
                com.gamericefishpro.space.ti.t tVar2 = new com.gamericefishpro.space.ti.t(fVar, aVar2.getContext());
                try {
                    aVar2.d = tVar2;
                    aVar2.v = 1;
                    Object objInvoke = ((com.gamericefishpro.space.vh.i) this.e).invoke(tVar2, aVar2);
                    if (objInvoke != obj2) {
                        objInvoke = Unit.a;
                        break;
                    }
                    if (objInvoke == obj2) {
                        return obj2;
                    }
                    tVar = tVar2;
                    tVar.releaseIntercepted();
                    return Unit.a;
                } catch (Throwable th3) {
                    th = th3;
                    tVar = tVar2;
                    tVar.releaseIntercepted();
                    throw th;
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p(Function2 function2) {
        this.e = (com.gamericefishpro.space.vh.i) function2;
    }
}
