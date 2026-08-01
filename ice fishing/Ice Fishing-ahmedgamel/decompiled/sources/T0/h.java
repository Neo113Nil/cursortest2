package T0;

import android.net.ConnectivityManager;
import android.net.Network;

/* loaded from: classes.dex */
public abstract class h {
    public static final Network a(ConnectivityManager connectivityManager) {
        kotlin.jvm.internal.h.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
