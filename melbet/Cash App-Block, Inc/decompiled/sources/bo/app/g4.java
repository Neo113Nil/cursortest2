package bo.app;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes3.dex */
public final class g4 extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ k4 a;

    public g4(k4 k4Var) {
        this.a = k4Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        super.onCapabilitiesChanged(network, networkCapabilities);
        this.a.a(networkCapabilities);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        Network activeNetwork = this.a.i.getActiveNetwork();
        k4 k4Var = this.a;
        k4Var.a(k4Var.i.getNetworkCapabilities(activeNetwork));
    }
}
