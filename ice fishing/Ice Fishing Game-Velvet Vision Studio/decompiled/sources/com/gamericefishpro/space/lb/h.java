package com.gamericefishpro.space.lb;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.oh.n;
import com.gamericefishpro.space.oh.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Function1 {
    public final /* synthetic */ int d;
    public final /* synthetic */ long e;

    public /* synthetic */ h(int i, long j) {
        this.d = i;
        this.e = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        com.gamericefishpro.space.pi.h hVar;
        Object objQ;
        int i = this.d;
        long j = this.e;
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((com.gamericefishpro.space.p4.b) obj).e(i.b, Long.valueOf(j));
                return null;
            default:
                com.gamericefishpro.space.t0.d dVar = (com.gamericefishpro.space.t0.d) obj;
                Function1 function1 = dVar.b;
                if (function1 != null && (hVar = dVar.a) != null) {
                    try {
                        n nVar = p.d;
                        objQ = function1.invoke(Long.valueOf(j));
                    } catch (Throwable th) {
                        n nVar2 = p.d;
                        objQ = com.gamericefishpro.space.wa.b.q(th);
                    }
                    hVar.resumeWith(objQ);
                    break;
                }
                return Unit.a;
        }
    }
}
