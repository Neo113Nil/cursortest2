package com.gamericefishpro.space.g0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d0.u0;
import com.gamericefishpro.space.i9.a4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements Function2 {
    public final /* synthetic */ com.gamericefishpro.space.d0.g A;
    public final /* synthetic */ com.gamericefishpro.space.d0.d B;
    public final /* synthetic */ Function1 C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ com.gamericefishpro.space.h1.m e;
    public final /* synthetic */ v i;
    public final /* synthetic */ u0 v;
    public final /* synthetic */ com.gamericefishpro.space.z.k w;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ com.gamericefishpro.space.y.l z;

    public /* synthetic */ e(a aVar, com.gamericefishpro.space.h1.m mVar, v vVar, u0 u0Var, com.gamericefishpro.space.d0.g gVar, com.gamericefishpro.space.d0.d dVar, com.gamericefishpro.space.z.k kVar, boolean z, com.gamericefishpro.space.y.l lVar, Function1 function1, int i, int i2) {
        this.F = aVar;
        this.e = mVar;
        this.i = vVar;
        this.v = u0Var;
        this.A = gVar;
        this.B = dVar;
        this.w = kVar;
        this.y = z;
        this.z = lVar;
        this.C = function1;
        this.D = i;
        this.E = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((Integer) obj2).getClass();
                a4.h((a) this.F, this.e, this.i, this.v, this.A, this.B, this.w, this.y, this.z, this.C, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(this.D | 1), this.E);
                break;
            default:
                ((Integer) obj2).getClass();
                com.gamericefishpro.space.i.a.i(this.e, this.i, (c) this.F, this.v, this.w, this.y, this.z, this.A, this.B, this.C, (com.gamericefishpro.space.t0.r) obj, com.gamericefishpro.space.t0.i.D(this.D | 1), com.gamericefishpro.space.t0.i.D(this.E));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ e(com.gamericefishpro.space.h1.m mVar, v vVar, c cVar, u0 u0Var, com.gamericefishpro.space.z.k kVar, boolean z, com.gamericefishpro.space.y.l lVar, com.gamericefishpro.space.d0.g gVar, com.gamericefishpro.space.d0.d dVar, Function1 function1, int i, int i2) {
        this.e = mVar;
        this.i = vVar;
        this.F = cVar;
        this.v = u0Var;
        this.w = kVar;
        this.y = z;
        this.z = lVar;
        this.A = gVar;
        this.B = dVar;
        this.C = function1;
        this.D = i;
        this.E = i2;
    }
}
