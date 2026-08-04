package com.gamericefishpro.space.n7;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Function0 e;

    public /* synthetic */ z(Function0 function0, int i, int i2) {
        this.d = i2;
        this.e = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.d;
        com.gamericefishpro.space.t0.r rVar = (com.gamericefishpro.space.t0.r) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                com.gamericefishpro.space.i.a.e(this.e, rVar, com.gamericefishpro.space.t0.i.D(1));
                break;
            case 1:
                com.gamericefishpro.space.i.a.d(this.e, rVar, com.gamericefishpro.space.t0.i.D(1));
                break;
            default:
                com.gamericefishpro.space.p7.d.a(this.e, rVar, com.gamericefishpro.space.t0.i.D(1));
                break;
        }
        return Unit.a;
    }
}
