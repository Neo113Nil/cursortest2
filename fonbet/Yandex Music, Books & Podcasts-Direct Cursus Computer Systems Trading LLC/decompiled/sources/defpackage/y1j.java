package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class y1j {
    public static final String a = jsg.n("NetworkStateTracker");

    public static final q1j a(ConnectivityManager connectivityManager) {
        boolean z;
        NetworkCapabilities networkCapabilities;
        String str = a;
        connectivityManager.getClass();
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
            try {
                networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            } catch (SecurityException e) {
                jsg.j().h(str, "Unable to validate active network", e);
            }
            if (networkCapabilities != null) {
                z = networkCapabilities.hasCapability(16);
                return new q1j(z2, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
            }
            z = false;
            return new q1j(z2, z, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        } catch (SecurityException e2) {
            jsg.j().h(str, "Unable to get active network state", e2);
            return new q1j(false, false, false, true);
        }
    }
}
