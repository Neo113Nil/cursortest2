package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Runnable {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ long e;
    public final /* synthetic */ b0 i;

    public w(x xVar, long j) {
        this.e = j;
        Objects.requireNonNull(xVar);
        this.i = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                ((x) this.i).x(this.e);
                break;
            default:
                e3 e3Var = (e3) this.i;
                x xVar = ((r1) e3Var.d).G;
                r1.i(xVar);
                xVar.u(this.e);
                e3Var.w = null;
                break;
        }
    }

    public w(e3 e3Var, long j) {
        this.e = j;
        Objects.requireNonNull(e3Var);
        this.i = e3Var;
    }
}
