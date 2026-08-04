package com.gamericefishpro.space.f0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.f1.z;
import com.gamericefishpro.space.f5.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;

    public /* synthetic */ i(int i, int i2, Object obj) {
        this.d = i2;
        this.i = obj;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j jVar = (j) this.i;
                com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    z zVar = jVar.b.b;
                    int i = this.e;
                    com.gamericefishpro.space.h0.j jVarD = zVar.d(i);
                    ((f) jVarD.c).c.c(jVar.c, Integer.valueOf(i - jVarD.a), rVar, 0);
                } else {
                    rVar.V();
                }
                break;
            case 1:
                com.gamericefishpro.space.g0.h hVar = (com.gamericefishpro.space.g0.h) this.i;
                com.gamericefishpro.space.t0.r rVar2 = (com.gamericefishpro.space.t0.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.S(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    z zVar2 = hVar.b.c;
                    int i2 = this.e;
                    com.gamericefishpro.space.h0.j jVarD2 = zVar2.d(i2);
                    ((com.gamericefishpro.space.g0.f) jVarD2.c).c.c(com.gamericefishpro.space.g0.i.a, Integer.valueOf(i2 - jVarD2.a), rVar2, 6);
                } else {
                    rVar2.V();
                }
                break;
            default:
                ((d0) this.i).b("level_complete/" + this.e + "/" + ((Integer) obj).intValue() + "/" + ((Integer) obj2).intValue(), new com.gamericefishpro.space.j7.c(11));
                break;
        }
        return Unit.a;
    }
}
