package v4;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import o4.o;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f7223a;

    static {
        String f10 = o.f("NetworkStateTracker");
        pc.j.d(f10, "tagWithPrefix(\"NetworkStateTracker\")");
        f7223a = f10;
    }

    public static final t4.a a(ConnectivityManager connectivityManager) {
        boolean z10;
        NetworkCapabilities a6;
        pc.j.e(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z11 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        try {
            a6 = y4.g.a(connectivityManager, y4.h.a(connectivityManager));
        } catch (SecurityException e10) {
            o.d().c(f7223a, "Unable to validate active network", e10);
        }
        if (a6 != null) {
            z10 = y4.g.b(a6, 16);
            return new t4.a(z11, z10, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
        }
        z10 = false;
        return new t4.a(z11, z10, connectivityManager.isActiveNetworkMetered(), activeNetworkInfo == null && !activeNetworkInfo.isRoaming());
    }
}
