package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.yandex.messaging.internal.net.NetworkManager29$callback$1;
import defpackage.ww50;

/* loaded from: classes15.dex */
public final class ww50 extends xw50 {
    public final NetworkManager29$callback$1 y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.net.ConnectivityManager$NetworkCallback, com.yandex.messaging.internal.net.NetworkManager29$callback$1] */
    public ww50(Context context, wff0 wff0Var, x22 x22Var) {
        super(context, wff0Var, x22Var);
        ?? r1 = new ConnectivityManager.NetworkCallback() { // from class: com.yandex.messaging.internal.net.NetworkManager29$callback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                ww50 ww50Var = ww50.this;
                ww50Var.c(ww50.d(ww50Var.c.getNetworkCapabilities(network)));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
                ww50 ww50Var = ww50.this;
                ww50Var.getClass();
                ww50Var.c(ww50.d(capabilities));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                ww50.this.c(false);
            }
        };
        this.y = r1;
        try {
            this.c.registerDefaultNetworkCallback(r1, this.w);
        } catch (SecurityException unused) {
        }
    }

    public static boolean d(NetworkCapabilities networkCapabilities) {
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    @Override // defpackage.xw50
    public final boolean a() {
        try {
            ConnectivityManager connectivityManager = this.c;
            return d(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()));
        } catch (SecurityException unused) {
            return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.unregisterNetworkCallback(this.y);
    }
}
