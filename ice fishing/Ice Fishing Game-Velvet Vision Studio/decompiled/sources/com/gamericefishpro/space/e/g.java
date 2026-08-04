package com.gamericefishpro.space.e;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.i9.a4;
import com.gamericefishpro.space.i9.y3;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int i;
    public final /* synthetic */ com.gamericefishpro.space.oh.d v;

    public /* synthetic */ g(boolean z, com.gamericefishpro.space.oh.d dVar, int i, int i2) {
        this.d = i2;
        this.e = z;
        this.v = dVar;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                int iD = com.gamericefishpro.space.t0.i.D(this.i | 1);
                y3.a(this.e, (Function0) this.v, (com.gamericefishpro.space.t0.r) obj, iD);
                break;
            default:
                ((Integer) obj2).getClass();
                int iD2 = com.gamericefishpro.space.t0.i.D(this.i | 1);
                a4.j(this.e, (Function2) this.v, (com.gamericefishpro.space.t0.r) obj, iD2);
                break;
        }
        return Unit.a;
    }
}
