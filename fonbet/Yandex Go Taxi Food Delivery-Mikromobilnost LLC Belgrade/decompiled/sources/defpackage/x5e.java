package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes.dex */
public final class x5e implements w5e {
    public final ConnectivityManager b;

    public x5e(ConnectivityManager connectivityManager) {
        this.b = connectivityManager;
    }

    @Override // defpackage.w5e
    public final boolean a() {
        ConnectivityManager connectivityManager = this.b;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        return networkCapabilities != null && networkCapabilities.hasCapability(12);
    }
}
