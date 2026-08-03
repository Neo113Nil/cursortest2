package y4;

import android.net.ConnectivityManager;
import android.net.Network;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class h {
    public static final Network a(ConnectivityManager connectivityManager) {
        pc.j.e(connectivityManager, "<this>");
        return connectivityManager.getActiveNetwork();
    }
}
