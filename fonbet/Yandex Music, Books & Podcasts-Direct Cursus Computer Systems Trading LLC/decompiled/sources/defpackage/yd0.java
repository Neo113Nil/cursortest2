package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes5.dex */
public final class yd0 extends BroadcastReceiver {
    public boolean a = false;
    public final /* synthetic */ zd0 b;

    public yd0(zd0 zd0Var) {
        this.b = zd0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.a;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        this.a = z2;
        if (!z2 || z) {
            return;
        }
        this.b.a.h();
    }
}
