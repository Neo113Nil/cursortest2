package com.gamericefishpro.space.n9;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ h0 e;
    public final /* synthetic */ n3 i;

    public /* synthetic */ l3(n3 n3Var, h0 h0Var, int i) {
        this.d = i;
        this.e = h0Var;
        this.i = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                n3 n3Var = this.i;
                synchronized (n3Var) {
                    try {
                        n3Var.d = false;
                        o3 o3Var = n3Var.i;
                        if (!o3Var.I()) {
                            v0 v0Var = ((r1) o3Var.d).y;
                            r1.l(v0Var);
                            v0Var.G.a("Connected to service");
                            h0 h0Var = this.e;
                            o3Var.r();
                            o3Var.v = h0Var;
                            o3Var.E();
                            o3Var.G();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                n3 n3Var2 = this.i;
                synchronized (n3Var2) {
                    try {
                        n3Var2.d = false;
                        o3 o3Var2 = n3Var2.i;
                        if (!o3Var2.I()) {
                            v0 v0Var2 = ((r1) o3Var2.d).y;
                            r1.l(v0Var2);
                            v0Var2.F.a("Connected to remote service");
                            h0 h0Var2 = this.e;
                            o3Var2.r();
                            o3Var2.v = h0Var2;
                            o3Var2.E();
                            o3Var2.G();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                o3 o3Var3 = this.i.i;
                ScheduledExecutorService scheduledExecutorService = o3Var3.z;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    o3Var3.z = null;
                    return;
                }
                return;
        }
    }
}
