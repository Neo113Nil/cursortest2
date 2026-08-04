package com.gamericefishpro.space.n9;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends BroadcastReceiver {
    public final m4 a;
    public boolean b;
    public boolean c;

    public b1(m4 m4Var) {
        com.gamericefishpro.space.v8.c0.g(m4Var);
        this.a = m4Var;
    }

    public final void a() {
        m4 m4Var = this.a;
        m4Var.k0();
        m4Var.c().r();
        m4Var.c().r();
        if (this.b) {
            m4Var.a().G.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                m4Var.E.d.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                m4Var.a().y.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        m4 m4Var = this.a;
        m4Var.k0();
        String action = intent.getAction();
        m4Var.a().G.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            m4Var.a().B.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        z0 z0Var = m4Var.e;
        m4.T(z0Var);
        boolean zL = z0Var.L();
        if (this.c != zL) {
            this.c = zL;
            m4Var.c().A(new com.gamericefishpro.space.h4.b(this, zL));
        }
    }
}
