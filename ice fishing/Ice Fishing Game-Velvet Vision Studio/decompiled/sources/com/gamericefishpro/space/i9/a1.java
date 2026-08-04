package com.gamericefishpro.space.i9;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a1 extends g1 {
    public final /* synthetic */ int w;
    public final /* synthetic */ String y;
    public final /* synthetic */ j1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a1(j1 j1Var, String str, int i) {
        super(j1Var, true);
        this.w = i;
        this.y = str;
        this.z = j1Var;
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void a() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0 j0Var = this.z.e;
                com.gamericefishpro.space.v8.c0.g(j0Var);
                j0Var.beginAdUnitExposure(this.y, this.e);
                break;
            default:
                j0 j0Var2 = this.z.e;
                com.gamericefishpro.space.v8.c0.g(j0Var2);
                j0Var2.endAdUnitExposure(this.y, this.e);
                break;
        }
    }
}
