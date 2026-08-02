package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class x1j extends r96 {
    public final ConnectivityManager f;
    public final xd0 g;

    public x1j(Context context, j4w j4wVar) {
        super(context, j4wVar);
        Object systemService = ((Context) this.b).getSystemService("connectivity");
        systemService.getClass();
        this.f = (ConnectivityManager) systemService;
        this.g = new xd0(3, this);
    }

    @Override // defpackage.r96
    public final Object b() {
        return y1j.a(this.f);
    }

    @Override // defpackage.r96
    public final void d() {
        try {
            jsg.j().e(y1j.a, "Registering network callback");
            ConnectivityManager connectivityManager = this.f;
            xd0 xd0Var = this.g;
            connectivityManager.getClass();
            xd0Var.getClass();
            connectivityManager.registerDefaultNetworkCallback(xd0Var);
        } catch (IllegalArgumentException e) {
            jsg.j().h(y1j.a, "Received exception while registering network callback", e);
        } catch (SecurityException e2) {
            jsg.j().h(y1j.a, "Received exception while registering network callback", e2);
        }
    }

    @Override // defpackage.r96
    public final void e() {
        try {
            jsg.j().e(y1j.a, "Unregistering network callback");
            this.f.unregisterNetworkCallback(this.g);
        } catch (IllegalArgumentException e) {
            jsg.j().h(y1j.a, "Received exception while unregistering network callback", e);
        } catch (SecurityException e2) {
            jsg.j().h(y1j.a, "Received exception while unregistering network callback", e2);
        }
    }
}
