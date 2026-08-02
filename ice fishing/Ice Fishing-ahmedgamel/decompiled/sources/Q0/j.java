package Q0;

import J0.r;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2476a;

    static {
        String f2 = r.f("NetworkStateTracker");
        kotlin.jvm.internal.h.d(f2, "tagWithPrefix(\"NetworkStateTracker\")");
        f2476a = f2;
    }

    public static final O0.a a(ConnectivityManager connectivityManager) {
        boolean z6;
        NetworkCapabilities a9;
        kotlin.jvm.internal.h.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z9 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a9 = T0.g.a(connectivityManager, T0.h.a(connectivityManager));
        } catch (SecurityException e9) {
            r.d().c(f2476a, "Unable to validate active network", e9);
        }
        if (a9 != null) {
            z6 = T0.g.b(a9, 16);
            return new O0.a(z9, z6, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z6 = false;
        return new O0.a(z9, z6, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
