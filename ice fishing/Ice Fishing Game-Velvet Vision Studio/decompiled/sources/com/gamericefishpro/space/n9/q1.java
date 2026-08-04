package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ com.gamericefishpro.space.i9.l0 e;
    public final /* synthetic */ AppMeasurementDynamiteService i;

    public /* synthetic */ q1(AppMeasurementDynamiteService appMeasurementDynamiteService, com.gamericefishpro.space.i9.l0 l0Var, int i) {
        this.d = i;
        this.e = l0Var;
        this.i = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o3 o3VarO = this.i.d.o();
                com.gamericefishpro.space.i9.l0 l0Var = this.e;
                o3VarO.r();
                o3VarO.s();
                o3VarO.F(new com.gamericefishpro.space.m6.e((Object) o3VarO, (com.gamericefishpro.space.w8.a) o3VarO.H(false), (Object) l0Var, 7));
                break;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.i;
                r4 r4Var = appMeasurementDynamiteService.d.B;
                r1.j(r4Var);
                r1 r1Var = appMeasurementDynamiteService.d;
                r4Var.d0(this.e, r1Var.R != null && r1Var.R.booleanValue());
                break;
        }
    }
}
