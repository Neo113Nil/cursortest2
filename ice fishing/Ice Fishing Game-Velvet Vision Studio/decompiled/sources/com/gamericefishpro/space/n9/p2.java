package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ e2 e;
    public final /* synthetic */ long i;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ t2 w;

    public /* synthetic */ p2(t2 t2Var, e2 e2Var, long j, boolean z, int i) {
        this.d = i;
        this.e = e2Var;
        this.i = j;
        this.v = z;
        this.w = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                t2 t2Var = this.w;
                e2 e2Var = this.e;
                t2Var.v(e2Var);
                t2Var.H(e2Var, this.i, this.v);
                break;
            default:
                t2 t2Var2 = this.w;
                e2 e2Var2 = this.e;
                t2Var2.v(e2Var2);
                t2Var2.H(e2Var2, this.i, this.v);
                break;
        }
    }
}
