package v4;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import o4.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class g extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f7220a;

    public g(h hVar) {
        this.f7220a = hVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        pc.j.e(network, "network");
        pc.j.e(networkCapabilities, "capabilities");
        o.d().a(i.f7223a, "Network capabilities changed: " + networkCapabilities);
        h hVar = this.f7220a;
        hVar.c(i.a(hVar.f7221f));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        pc.j.e(network, "network");
        o.d().a(i.f7223a, "Network connection lost");
        h hVar = this.f7220a;
        hVar.c(i.a(hVar.f7221f));
    }
}
