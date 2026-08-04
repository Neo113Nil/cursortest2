package com.gamericefishpro.space.si;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements e {
    public final /* synthetic */ int d;
    public final /* synthetic */ e e;
    public final /* synthetic */ com.gamericefishpro.space.vh.i i;

    /* JADX WARN: Multi-variable type inference failed */
    public m(e eVar, Function2 function2, int i) {
        this.d = i;
        switch (i) {
            case 1:
                this.e = eVar;
                this.i = (com.gamericefishpro.space.vh.i) function2;
                break;
            default:
                this.e = eVar;
                this.i = (com.gamericefishpro.space.vh.i) function2;
                break;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.gamericefishpro.space.vh.i, kotlin.jvm.functions.Function2] */
    @Override // com.gamericefishpro.space.si.e
    public final Object a(f fVar, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object objA = this.e.a(new com.gamericefishpro.space.g5.v(new com.gamericefishpro.space.ei.w(), fVar, (Function2) this.i), aVar);
                return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
            default:
                Object objA2 = this.e.a(new com.gamericefishpro.space.b0.n(fVar, this.i), aVar);
                return objA2 == com.gamericefishpro.space.uh.a.d ? objA2 : Unit.a;
        }
    }
}
