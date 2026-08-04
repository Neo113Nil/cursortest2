package com.gamericefishpro.space.n9;

import android.os.Bundle;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 implements Callable {
    public final /* synthetic */ int d;
    public final /* synthetic */ t4 e;
    public final /* synthetic */ Bundle i;
    public final /* synthetic */ y1 v;

    public /* synthetic */ w1(y1 y1Var, t4 t4Var, Bundle bundle, int i) {
        this.d = i;
        this.e = t4Var;
        this.i = bundle;
        this.v = y1Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y1 y1Var = this.v;
                y1Var.d.B();
                return y1Var.d.c0(this.i, this.e);
            default:
                y1 y1Var2 = this.v;
                y1Var2.d.B();
                return y1Var2.d.c0(this.i, this.e);
        }
    }
}
