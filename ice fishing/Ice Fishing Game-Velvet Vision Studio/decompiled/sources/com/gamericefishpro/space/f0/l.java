package com.gamericefishpro.space.f0;

import com.android.installreferrer.api.InstallReferrerClient;
import com.gamericefishpro.space.t0.s2;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l extends com.gamericefishpro.space.ei.q {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(int i, int i2, Class cls, Object obj, String str, String str2) {
        super(obj, cls, str, str2, i);
        this.A = i2;
    }

    @Override // com.gamericefishpro.space.ei.q
    public final Object j() {
        switch (this.A) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                return ((s2) this.e).getValue();
            case 1:
                return ((s2) this.e).getValue();
            default:
                return this.e.getClass().getSimpleName();
        }
    }
}
