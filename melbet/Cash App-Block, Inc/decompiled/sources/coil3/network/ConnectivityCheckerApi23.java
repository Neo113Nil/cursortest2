package coil3.network;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes3.dex */
public final class ConnectivityCheckerApi23 implements ConnectivityChecker {
    public final ConnectivityManager connectivityManager;

    public ConnectivityCheckerApi23(ConnectivityManager connectivityManager) {
        this.connectivityManager = connectivityManager;
    }

    @Override // coil3.network.ConnectivityChecker
    public final boolean isOnline() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
