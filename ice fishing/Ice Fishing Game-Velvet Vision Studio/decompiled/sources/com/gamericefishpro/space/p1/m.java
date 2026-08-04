package com.gamericefishpro.space.p1;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m implements i {
    public final /* synthetic */ int d;
    public final /* synthetic */ q e;

    public /* synthetic */ m(q qVar, int i) {
        this.d = i;
        this.e = qVar;
    }

    @Override // com.gamericefishpro.space.p1.i
    public final double d(double d) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                q qVar = this.e;
                return com.gamericefishpro.space.ji.f.a(qVar.k.d(d), qVar.e, qVar.f);
            default:
                q qVar2 = this.e;
                return qVar2.n.d(com.gamericefishpro.space.ji.f.a(d, qVar2.e, qVar2.f));
        }
    }
}
