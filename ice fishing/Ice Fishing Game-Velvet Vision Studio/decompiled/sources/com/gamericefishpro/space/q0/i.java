package com.gamericefishpro.space.q0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements Function2 {
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ long v;
    public final /* synthetic */ int w;
    public final /* synthetic */ Object y;

    public /* synthetic */ i(Object obj, String str, com.gamericefishpro.space.h1.m mVar, long j, int i, int i2) {
        this.d = i2;
        this.y = obj;
        this.e = str;
        this.i = mVar;
        this.v = j;
        this.w = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                j.b((com.gamericefishpro.space.u1.f) this.y, this.e, (com.gamericefishpro.space.h1.m) this.i, this.v, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(this.w | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                j.a((com.gamericefishpro.space.t1.b) this.y, this.e, (com.gamericefishpro.space.h1.m) this.i, this.v, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(this.w | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.hj.c.d(this.e, (com.gamericefishpro.space.u1.f) this.y, this.v, (Function0) this.i, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(this.w | 1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ i(String str, com.gamericefishpro.space.u1.f fVar, long j, Function0 function0, int i) {
        this.d = 2;
        this.e = str;
        this.y = fVar;
        this.v = j;
        this.i = function0;
        this.w = i;
    }
}
