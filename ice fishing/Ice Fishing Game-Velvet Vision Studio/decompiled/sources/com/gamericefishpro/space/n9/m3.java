package com.gamericefishpro.space.n9;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ o3 e;

    public /* synthetic */ m3(o3 o3Var, int i) {
        this.d = i;
        this.e = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                this.e.x();
                break;
            case 1:
                o3 o3Var = this.e;
                r1 r1Var = (r1) o3Var.d;
                h0 h0Var = o3Var.v;
                if (h0Var == null) {
                    v0 v0Var = r1Var.y;
                    r1.l(v0Var);
                    v0Var.y.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        h0Var.z(o3Var.H(false));
                        o3Var.E();
                    } catch (RemoteException e) {
                        v0 v0Var2 = r1Var.y;
                        r1.l(v0Var2);
                        v0Var2.y.b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                o3 o3Var2 = this.e;
                r1 r1Var2 = (r1) o3Var2.d;
                h0 h0Var2 = o3Var2.v;
                if (h0Var2 == null) {
                    v0 v0Var3 = r1Var2.y;
                    r1.l(v0Var3);
                    v0Var3.y.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        h0Var2.d(o3Var2.H(false));
                        o3Var2.E();
                    } catch (RemoteException e2) {
                        v0 v0Var4 = r1Var2.y;
                        r1.l(v0Var4);
                        v0Var4.y.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
