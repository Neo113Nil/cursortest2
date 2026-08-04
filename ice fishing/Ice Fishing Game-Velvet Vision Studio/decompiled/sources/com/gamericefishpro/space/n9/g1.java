package com.gamericefishpro.space.n9;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements ServiceConnection {
    public final String d;
    public final /* synthetic */ h1 e;

    public g1(h1 h1Var, String str) {
        Objects.requireNonNull(h1Var);
        this.e = h1Var;
        this.d = str;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        h1 h1Var = this.e;
        if (iBinder == null) {
            v0 v0Var = h1Var.e.y;
            r1.l(v0Var);
            v0Var.B.a("Install Referrer connection returned with null binder");
            return;
        }
        try {
            int i = com.gamericefishpro.space.i9.a0.d;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            com.gamericefishpro.space.i9.b0 zVar = iInterfaceQueryLocalInterface instanceof com.gamericefishpro.space.i9.b0 ? (com.gamericefishpro.space.i9.b0) iInterfaceQueryLocalInterface : new com.gamericefishpro.space.i9.z(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 2);
            r1 r1Var = h1Var.e;
            v0 v0Var2 = r1Var.y;
            r1.l(v0Var2);
            v0Var2.G.a("Install Referrer Service connected");
            p1 p1Var = r1Var.z;
            r1.l(p1Var);
            p1Var.A(new com.gamericefishpro.space.va.a(this, zVar, this));
        } catch (RuntimeException e) {
            v0 v0Var3 = h1Var.e.y;
            r1.l(v0Var3);
            v0Var3.B.b(e, "Exception occurred while calling Install Referrer API");
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        v0 v0Var = this.e.e.y;
        r1.l(v0Var);
        v0Var.G.a("Install Referrer Service disconnected");
    }
}
