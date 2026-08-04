package com.gamericefishpro.space.t0;

import com.android.installreferrer.api.InstallReferrerClient;
import kotlin.Unit;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements com.gamericefishpro.space.si.f {
    public final /* synthetic */ int d;
    public final /* synthetic */ n1 e;

    public /* synthetic */ p2(n1 n1Var, int i) {
        this.d = i;
        this.e = n1Var;
    }

    @Override // com.gamericefishpro.space.si.f
    public final Object d(Object obj, com.gamericefishpro.space.th.a aVar) {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.setValue(obj);
                break;
            default:
                this.e.setValue(obj);
                break;
        }
        return Unit.a;
    }
}
