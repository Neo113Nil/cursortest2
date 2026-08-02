package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.util.Log;

/* loaded from: classes5.dex */
public final class zd0 extends t7h {
    public final t7h a;
    public final Context b;
    public final ConnectivityManager c;
    public final Object d = new Object();
    public Runnable e;

    public zd0(t7h t7hVar, Context context) {
        this.a = t7hVar;
        this.b = context;
        if (context == null) {
            this.c = null;
            return;
        }
        this.c = (ConnectivityManager) context.getSystemService("connectivity");
        try {
            o();
        } catch (SecurityException e) {
            Log.w("AndroidChannelBuilder", "Failed to configure network monitoring. Does app have ACCESS_NETWORK_STATE permission?", e);
        }
    }

    @Override // defpackage.mc4
    public final String e() {
        return this.a.e();
    }

    @Override // defpackage.mc4
    public final vn4 g(k3i k3iVar, ks3 ks3Var) {
        return this.a.g(k3iVar, ks3Var);
    }

    @Override // defpackage.t7h
    public final void h() {
        this.a.h();
    }

    @Override // defpackage.t7h
    public final r76 i(boolean z) {
        return this.a.i(z);
    }

    @Override // defpackage.t7h
    public final boolean j() {
        return this.a.j();
    }

    @Override // defpackage.t7h
    public final boolean k() {
        return this.a.k();
    }

    @Override // defpackage.t7h
    public final void l(r76 r76Var, e8h e8hVar) {
        this.a.l(r76Var, e8hVar);
    }

    @Override // defpackage.t7h
    public final void m() {
        this.a.m();
    }

    @Override // defpackage.t7h
    public final t7h n() {
        synchronized (this.d) {
            try {
                Runnable runnable = this.e;
                if (runnable != null) {
                    runnable.run();
                    this.e = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.a.n();
    }

    public final void o() {
        ConnectivityManager connectivityManager = this.c;
        if (connectivityManager != null) {
            xd0 xd0Var = new xd0(0, this);
            connectivityManager.registerDefaultNetworkCallback(xd0Var);
            this.e = new x8x(this, xd0Var, false, 3);
            return;
        }
        yd0 yd0Var = new yd0(this);
        this.b.registerReceiver(yd0Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.e = new x8x(this, yd0Var, false, 4);
    }
}
