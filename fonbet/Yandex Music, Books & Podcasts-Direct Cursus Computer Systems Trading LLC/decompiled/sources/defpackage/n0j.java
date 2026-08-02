package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes3.dex */
public final class n0j extends o0j {
    public final xd0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0j(Context context, qdc qdcVar) {
        super(context, qdcVar);
        qdcVar.getClass();
        xd0 xd0Var = new xd0(2, this);
        this.f = xd0Var;
        try {
            this.c.registerDefaultNetworkCallback(xd0Var, this.e);
        } catch (SecurityException unused) {
        }
    }

    public static boolean b(NetworkCapabilities networkCapabilities) {
        return networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16);
    }

    @Override // defpackage.o0j
    public final boolean a() {
        try {
            ConnectivityManager connectivityManager = this.c;
            return b(connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork()));
        } catch (SecurityException unused) {
            return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.unregisterNetworkCallback(this.f);
    }
}
