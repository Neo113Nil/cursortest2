package Q0;

import J0.s;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final String f2641a;

    static {
        String f3 = s.f("NetworkStateTracker");
        kotlin.jvm.internal.h.d(f3, "tagWithPrefix(\"NetworkStateTracker\")");
        f2641a = f3;
    }

    public static final O0.a a(ConnectivityManager connectivityManager) {
        boolean z3;
        NetworkCapabilities a9;
        kotlin.jvm.internal.h.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z6 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a9 = T0.g.a(connectivityManager, T0.h.a(connectivityManager));
        } catch (SecurityException e9) {
            s.d().c(f2641a, "Unable to validate active network", e9);
        }
        if (a9 != null) {
            z3 = T0.g.b(a9, 16);
            return new O0.a(z6, z3, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z3 = false;
        return new O0.a(z6, z3, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
