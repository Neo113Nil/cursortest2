package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class d3 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ e3 e;

    public d3(e3 e3Var, int i) {
        this.d = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(e3Var);
                this.e = e3Var;
                break;
            default:
                Objects.requireNonNull(e3Var);
                this.e = e3Var;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                e3 e3Var = this.e;
                e3Var.w = e3Var.C;
                break;
            default:
                this.e.C = null;
                break;
        }
    }
}
