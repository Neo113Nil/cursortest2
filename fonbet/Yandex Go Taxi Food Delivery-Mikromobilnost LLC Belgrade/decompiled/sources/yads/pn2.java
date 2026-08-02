package yads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.a681;
import defpackage.b381;
import defpackage.jy31;

/* loaded from: classes7.dex */
public final class pn2 extends ConnectivityManager.NetworkCallback {
    public boolean a;
    public boolean b;
    public final /* synthetic */ a681 c;

    public pn2(a681 a681Var) {
        this.c = a681Var;
    }

    public final void a() {
        a681 a681Var = this.c;
        if (a681Var.f != null) {
            a681Var.g.post(new jy31(29, a681Var));
        }
    }

    public final void b() {
        a681 a681Var = this.c;
        if (a681Var.f == null || (a681Var.e & 3) == 0) {
            return;
        }
        a681Var.g.post(new jy31(29, a681Var));
    }

    public final void c() {
        this.c.d.post(new b381(this, 1));
    }

    public final void d() {
        this.c.d.post(new b381(this, 0));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        c();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        if (z) {
            return;
        }
        d();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        boolean hasCapability = networkCapabilities.hasCapability(16);
        if (this.a && this.b == hasCapability) {
            if (hasCapability) {
                d();
            }
        } else {
            this.a = true;
            this.b = hasCapability;
            c();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        c();
    }
}
