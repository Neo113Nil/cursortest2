package Q0;

import J0.s;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2711a;

    static {
        String f6 = s.f("NetworkStateTracker");
        kotlin.jvm.internal.h.d(f6, "tagWithPrefix(\"NetworkStateTracker\")");
        f2711a = f6;
    }

    public static final O0.a a(ConnectivityManager connectivityManager) {
        boolean z8;
        NetworkCapabilities a9;
        kotlin.jvm.internal.h.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z9 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a9 = T0.g.a(connectivityManager, T0.h.a(connectivityManager));
        } catch (SecurityException e6) {
            s.d().c(f2711a, "Unable to validate active network", e6);
        }
        if (a9 != null) {
            z8 = T0.g.b(a9, 16);
            return new O0.a(z9, z8, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z8 = false;
        return new O0.a(z9, z8, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
