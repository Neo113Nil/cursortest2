package com.icefishing.icefishingmoneygame11.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;

/* loaded from: classes2.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {
    public static NetworkStatusReceiverListener connectivityReceiverListener;

    public interface NetworkStatusReceiverListener {
        void onNetworkConnectionChanged(boolean z);
    }

    public static boolean isConnected() {
        ConnectivityManager connectivityManager = (ConnectivityManager) AppController.getInstance().getApplicationContext().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnectedOrConnecting();
        NetworkStatusReceiverListener networkStatusReceiverListener = connectivityReceiverListener;
        if (networkStatusReceiverListener != null) {
            networkStatusReceiverListener.onNetworkConnectionChanged(z);
        }
    }
}
