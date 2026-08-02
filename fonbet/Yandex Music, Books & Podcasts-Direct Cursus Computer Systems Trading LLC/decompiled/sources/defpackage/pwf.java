package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class pwf extends BroadcastReceiver implements a0j {
    public final ConnectivityManager a;
    public final y66 b;
    public zzi c;

    public pwf(ConnectivityManager connectivityManager, y66 y66Var) {
        this.a = connectivityManager;
        this.b = y66Var;
    }

    public static zzi b(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            return zzi.d;
        }
        int type = networkInfo.getType();
        return type != 0 ? type != 1 ? new zzi(true, yzi.c, -1) : new zzi(true, yzi.a, -1) : new zzi(true, yzi.b, -1);
    }

    @Override // defpackage.a0j
    public final zzi a() {
        zzi zziVar = this.c;
        if (zziVar != null) {
            return zziVar;
        }
        zzi b = b(this.a.getActiveNetworkInfo());
        this.c = b;
        return b;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0093  */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(Context context, Intent intent) {
        zzi b;
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        boolean equals = "android.net.wifi.STATE_CHANGE".equals(action);
        ConnectivityManager connectivityManager = this.a;
        zzi zziVar = null;
        if (!equals) {
            if (intent.getBooleanExtra("noConnectivity", false)) {
                ssg.a(3, "LegacyConnectivityPublisher", "generic loose of connectivity", null);
                zziVar = zzi.d;
            } else if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                b = b(connectivityManager.getActiveNetworkInfo());
                ssg.a(3, "LegacyConnectivityPublisher", "connectivity changed to " + b, null);
            } else {
                dfi.r("unhandled connectivity case", "LegacyConnectivityPublisher");
            }
            if (zziVar == null) {
                this.c = zziVar;
                this.b.invoke(zziVar);
                return;
            }
            return;
        }
        b = b((NetworkInfo) intent.getParcelableExtra("networkInfo"));
        if (Intrinsics.d(b, zzi.d)) {
            b = b(connectivityManager.getActiveNetworkInfo());
            ssg.a(3, "LegacyConnectivityPublisher", "no connectivity on wifi, active is: " + b, null);
        } else {
            ssg.a(3, "LegacyConnectivityPublisher", "type on wifi: " + b, null);
        }
        zziVar = b;
        if (zziVar == null) {
        }
    }
}
