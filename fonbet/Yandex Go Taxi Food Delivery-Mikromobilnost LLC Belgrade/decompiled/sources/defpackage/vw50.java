package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.yandex.messenger.websdk.internal.NetworkManager29$callback$1;
import defpackage.vw50;
import defpackage.vx21;
import defpackage.zo1;

/* loaded from: classes15.dex */
public final class vw50 extends sw50 {
    public final NetworkManager29$callback$1 y;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.net.ConnectivityManager$NetworkCallback, com.yandex.messenger.websdk.internal.NetworkManager29$callback$1] */
    public vw50(Context context, ew2 ew2Var) {
        super(context, ew2Var);
        ?? r1 = new ConnectivityManager.NetworkCallback() { // from class: com.yandex.messenger.websdk.internal.NetworkManager29$callback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                vw50 vw50Var = vw50.this;
                vx21.a(vw50Var.x, new zo1(vw50Var, vw50.c(vw50Var.c.getNetworkCapabilities(network)), 12));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
                vw50 vw50Var = vw50.this;
                vw50Var.getClass();
                vx21.a(vw50Var.x, new zo1(vw50Var, vw50.c(capabilities), 12));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(Network network) {
                vw50 vw50Var = vw50.this;
                vx21.a(vw50Var.x, new zo1((Object) vw50Var, false, 12));
            }
        };
        this.y = r1;
        try {
            this.c.registerDefaultNetworkCallback(r1, this.x);
        } catch (SecurityException unused) {
        }
    }

    public static boolean c(NetworkCapabilities networkCapabilities) {
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    @Override // defpackage.sw50
    public final boolean a() {
        try {
            ConnectivityManager connectivityManager = this.c;
            return c(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()));
        } catch (SecurityException unused) {
            return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.unregisterNetworkCallback(this.y);
    }
}
