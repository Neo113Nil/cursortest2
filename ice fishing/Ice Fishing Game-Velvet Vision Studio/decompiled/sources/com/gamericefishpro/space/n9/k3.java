package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class k3 extends n {
    public final /* synthetic */ int e;
    public final /* synthetic */ o3 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k3(o3 o3Var, r1 r1Var, int i) {
        super(r1Var);
        this.e = i;
        this.f = o3Var;
    }

    @Override // com.gamericefishpro.space.n9.n
    public final void a() {
        switch (this.e) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o3 o3Var = this.f;
                o3Var.r();
                if (o3Var.I()) {
                    v0 v0Var = ((r1) o3Var.d).y;
                    r1.l(v0Var);
                    v0Var.G.a("Inactivity, disconnecting from the service");
                    o3Var.z();
                    break;
                }
                break;
            default:
                v0 v0Var2 = ((r1) this.f.d).y;
                r1.l(v0Var2);
                v0Var2.B.a("Tasks have been queued for a long time");
                break;
        }
    }
}
