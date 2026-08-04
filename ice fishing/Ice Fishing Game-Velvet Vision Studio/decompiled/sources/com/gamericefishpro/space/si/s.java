package com.gamericefishpro.space.si;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements f {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.gamericefishpro.space.ei.a0 e;

    public /* synthetic */ s(com.gamericefishpro.space.ei.a0 a0Var, int i) {
        this.d = i;
        this.e = a0Var;
    }

    @Override // com.gamericefishpro.space.si.f
    public final Object d(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.d = obj;
                throw new com.gamericefishpro.space.ti.a(this);
            default:
                this.e.d = obj;
                throw new com.gamericefishpro.space.ti.a(this);
        }
    }
}
