package com.gamericefishpro.space.n9;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements Runnable {
    public final /* synthetic */ int d;
    public final /* synthetic */ t4 e;
    public final /* synthetic */ o3 i;

    public /* synthetic */ j3(o3 o3Var, t4 t4Var, int i) {
        this.d = i;
        this.e = t4Var;
        this.i = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.d) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                o3 o3Var = this.i;
                h0 h0Var = o3Var.v;
                r1 r1Var = (r1) o3Var.d;
                if (h0Var != null) {
                    try {
                        h0Var.l(this.e);
                    } catch (RemoteException e) {
                        v0 v0Var = r1Var.y;
                        r1.l(v0Var);
                        v0Var.y.b(e, "Failed to reset data on the service: remote exception");
                    }
                    o3Var.E();
                } else {
                    v0 v0Var2 = r1Var.y;
                    r1.l(v0Var2);
                    v0Var2.y.a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                o3 o3Var2 = this.i;
                h0 h0Var2 = o3Var2.v;
                r1 r1Var2 = (r1) o3Var2.d;
                if (h0Var2 == null) {
                    v0 v0Var3 = r1Var2.y;
                    r1.l(v0Var3);
                    v0Var3.y.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        t4 t4Var = this.e;
                        g gVar = r1Var2.v;
                        d0 d0Var = e0.b1;
                        if (gVar.B(null, d0Var)) {
                            o3Var2.J(h0Var2, null, t4Var);
                        }
                        h0Var2.o(t4Var);
                        r1Var2.n().w();
                        r1Var2.v.B(null, d0Var);
                        o3Var2.J(h0Var2, null, t4Var);
                        o3Var2.E();
                    } catch (RemoteException e2) {
                        v0 v0Var4 = r1Var2.y;
                        r1.l(v0Var4);
                        v0Var4.y.b(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                o3 o3Var3 = this.i;
                h0 h0Var3 = o3Var3.v;
                r1 r1Var3 = (r1) o3Var3.d;
                if (h0Var3 == null) {
                    v0 v0Var5 = r1Var3.y;
                    r1.l(v0Var5);
                    v0Var5.B.a("Failed to send app backgrounded");
                } else {
                    try {
                        h0Var3.n(this.e);
                        o3Var3.E();
                    } catch (RemoteException e3) {
                        v0 v0Var6 = r1Var3.y;
                        r1.l(v0Var6);
                        v0Var6.y.b(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case 3:
                o3 o3Var4 = this.i;
                h0 h0Var4 = o3Var4.v;
                r1 r1Var4 = (r1) o3Var4.d;
                if (h0Var4 == null) {
                    v0 v0Var7 = r1Var4.y;
                    r1.l(v0Var7);
                    v0Var7.y.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        h0Var4.B(this.e);
                        o3Var4.E();
                    } catch (RemoteException e4) {
                        v0 v0Var8 = r1Var4.y;
                        r1.l(v0Var8);
                        v0Var8.y.b(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                o3 o3Var5 = this.i;
                h0 h0Var5 = o3Var5.v;
                r1 r1Var5 = (r1) o3Var5.d;
                if (h0Var5 == null) {
                    v0 v0Var9 = r1Var5.y;
                    r1.l(v0Var9);
                    v0Var9.y.a("Failed to send consent settings to service");
                } else {
                    try {
                        h0Var5.D(this.e);
                        o3Var5.E();
                    } catch (RemoteException e5) {
                        v0 v0Var10 = r1Var5.y;
                        r1.l(v0Var10);
                        v0Var10.y.b(e5, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public j3(o3 o3Var, t4 t4Var) {
        this.d = 4;
        this.e = t4Var;
        Objects.requireNonNull(o3Var);
        this.i = o3Var;
    }
}
