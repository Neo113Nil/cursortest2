package com.gamericefishpro.space.e;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.d.s;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class h {
    public final /* synthetic */ int a;
    public final /* synthetic */ com.gamericefishpro.space.f.b b;

    public /* synthetic */ h(com.gamericefishpro.space.a5.g gVar, com.gamericefishpro.space.f.b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    public final void a() {
        switch (this.a) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j jVar = (j) this.b;
                ((s) jVar.a).b(false);
                ((com.gamericefishpro.space.f.a) jVar.b).f(false);
                break;
            default:
                ((m) this.b).y(false);
                break;
        }
    }
}
