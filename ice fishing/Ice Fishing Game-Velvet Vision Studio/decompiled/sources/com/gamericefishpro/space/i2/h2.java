package com.gamericefishpro.space.i2;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements com.gamericefishpro.space.si.f {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ h2(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.gamericefishpro.space.si.f
    public final Object d(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((p1) this.e).d.h(((Number) obj).floatValue());
                return Unit.a;
            default:
                com.gamericefishpro.space.l4.c0 c0Var = (com.gamericefishpro.space.l4.c0) this.e;
                if (c0Var.A.b() instanceof com.gamericefishpro.space.l4.n0) {
                    return Unit.a;
                }
                Object objD = com.gamericefishpro.space.l4.c0.d(c0Var, true, aVar);
                return objD == com.gamericefishpro.space.uh.a.d ? objD : Unit.a;
        }
    }
}
