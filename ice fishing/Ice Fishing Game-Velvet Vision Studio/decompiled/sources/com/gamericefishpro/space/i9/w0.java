package com.gamericefishpro.space.i9;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 extends g1 {
    public final /* synthetic */ int w;
    public final /* synthetic */ j1 y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(j1 j1Var, Object obj, int i) {
        super(j1Var, true);
        this.w = i;
        this.z = obj;
        this.y = j1Var;
    }

    @Override // com.gamericefishpro.space.i9.g1
    public final void a() {
        switch (this.w) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                j0 j0Var = this.y.e;
                com.gamericefishpro.space.v8.c0.g(j0Var);
                j0Var.setUserProperty("fcm", "_ln", new com.gamericefishpro.space.c9.b(this.z), true, this.d);
                break;
            case 1:
                j0 j0Var2 = this.y.e;
                com.gamericefishpro.space.v8.c0.g(j0Var2);
                j0Var2.setConditionalUserProperty((Bundle) this.z, this.d);
                break;
            default:
                j0 j0Var3 = this.y.e;
                com.gamericefishpro.space.v8.c0.g(j0Var3);
                j0Var3.retrieveAndUploadBatches(new b1(this, (com.gamericefishpro.space.va.a) this.z));
                break;
        }
    }
}
