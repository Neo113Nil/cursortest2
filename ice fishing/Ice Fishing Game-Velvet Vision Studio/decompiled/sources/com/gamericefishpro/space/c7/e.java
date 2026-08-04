package com.gamericefishpro.space.c7;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements com.gamericefishpro.space.si.e {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.gamericefishpro.space.si.e e;

    public /* synthetic */ e(com.gamericefishpro.space.si.e eVar, int i) {
        this.d = i;
        this.e = eVar;
    }

    @Override // com.gamericefishpro.space.si.e
    public final Object a(com.gamericefishpro.space.si.f fVar, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                Object objA = this.e.a(new d(fVar, 0), aVar);
                return objA == com.gamericefishpro.space.uh.a.d ? objA : Unit.a;
            case 1:
                Object objA2 = this.e.a(new d(fVar, 1), aVar);
                return objA2 == com.gamericefishpro.space.uh.a.d ? objA2 : Unit.a;
            case 2:
                Object objA3 = this.e.a(new d(fVar, 2), aVar);
                return objA3 == com.gamericefishpro.space.uh.a.d ? objA3 : Unit.a;
            case 3:
                Object objA4 = this.e.a(new d(fVar, 3), aVar);
                return objA4 == com.gamericefishpro.space.uh.a.d ? objA4 : Unit.a;
            default:
                Object objA5 = this.e.a(new d(fVar, 4), aVar);
                return objA5 == com.gamericefishpro.space.uh.a.d ? objA5 : Unit.a;
        }
    }
}
