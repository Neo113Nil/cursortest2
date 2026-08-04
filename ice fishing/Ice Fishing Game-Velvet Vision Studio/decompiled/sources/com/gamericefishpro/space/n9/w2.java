package com.gamericefishpro.space.n9;

import android.app.Service;
import android.content.Intent;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w2 implements Runnable {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Cloneable w;

    public /* synthetic */ w2(com.gamericefishpro.space.m.d dVar, int i, v0 v0Var, Intent intent) {
        this.i = dVar;
        this.e = i;
        this.v = v0Var;
        this.w = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                y0 y0Var = (y0) this.i;
                ((v2) y0Var.y).a(this.e, (Exception) this.v, (byte[]) this.w);
                break;
            default:
                com.gamericefishpro.space.m.d dVar = (com.gamericefishpro.space.m.d) this.i;
                v0 v0Var = (v0) this.v;
                Intent intent = (Intent) this.w;
                Service service = (Service) dVar.e;
                r3 r3Var = (r3) service;
                int i = this.e;
                if (r3Var.a(i)) {
                    v0Var.G.b(Integer.valueOf(i), "Local AppMeasurementService processed last upload request. StartId");
                    v0 v0Var2 = r1.r(service, null, null).y;
                    r1.l(v0Var2);
                    v0Var2.G.a("Completed wakeful intent.");
                    r3Var.b(intent);
                }
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ w2(y0 y0Var, int i, Exception exc, byte[] bArr, Map map) {
        this.i = y0Var;
        this.e = i;
        this.v = exc;
        this.w = bArr;
    }
}
