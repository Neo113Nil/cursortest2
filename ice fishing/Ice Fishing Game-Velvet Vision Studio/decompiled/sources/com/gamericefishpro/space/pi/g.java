package com.gamericefishpro.space.pi;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements com.gamericefishpro.space.di.c {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ g(int i, Object obj) {
        this.d = i;
        this.e = obj;
    }

    @Override // com.gamericefishpro.space.di.c
    public final Object a(Object obj, Object obj2, Object obj3) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((com.gamericefishpro.space.w.m1) this.e).invoke((Throwable) obj);
                break;
            case 1:
                com.gamericefishpro.space.xi.c cVar = (com.gamericefishpro.space.xi.c) this.e;
                com.gamericefishpro.space.xi.c.A.set(cVar, null);
                cVar.b(null);
                break;
            default:
                ((com.gamericefishpro.space.xi.g) this.e).d();
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ g(com.gamericefishpro.space.xi.c cVar, com.gamericefishpro.space.xi.b bVar) {
        this.d = 1;
        this.e = cVar;
    }
}
