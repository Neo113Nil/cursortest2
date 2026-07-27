package io.grpc.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes.dex */
class AndroidChannelBuilder$AndroidChannel$NetworkReceiver extends BroadcastReceiver {
    public boolean CatchingFishParcelableFAB;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        boolean z = this.CatchingFishParcelableFAB;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        this.CatchingFishParcelableFAB = z2;
        if (z2 && !z) {
            throw null;
        }
    }
}
