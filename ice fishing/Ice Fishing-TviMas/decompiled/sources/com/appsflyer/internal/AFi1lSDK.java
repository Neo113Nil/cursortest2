package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import com.appsflyer.AFLogger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class AFi1lSDK extends AFi1rSDK {
    private Network getMediationNetwork;
    private String getMonetizationNetwork;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1lSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
        this.getMonetizationNetwork = "unknown";
        AFa1vSDK aFa1vSDK = new AFa1vSDK();
        try {
            ConnectivityManager connectivityManager = this.getMediationNetwork;
            if (connectivityManager != null) {
                connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().build(), aFa1vSDK);
            }
        } catch (Throwable th) {
            AFh1uSDK.e$default(AFLogger.INSTANCE, AFh1vSDK.DEVICE_DATA, "Error at attempt to register network callback with ConnectivityManager", th, true, false, false, false, 96, null);
        }
    }

    public static final class AFa1vSDK extends ConnectivityManager.NetworkCallback {
        AFa1vSDK() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onAvailable(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1lSDK.this.getMediationNetwork = network;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public final void onLost(Network network) {
            Intrinsics.checkNotNullParameter(network, "");
            AFi1lSDK.this.getMediationNetwork = network;
            AFi1lSDK.this.getMonetizationNetwork = "NetworkLost";
        }
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    protected final String getCurrencyIso4217Code() {
        Network network = this.getMediationNetwork;
        if (network != null) {
            ConnectivityManager connectivityManager = this.getMediationNetwork;
            NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
            if (networkCapabilities != null && networkCapabilities != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return "WIFI";
                }
                if (networkCapabilities.hasTransport(0)) {
                    return "MOBILE";
                }
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final boolean getRevenue() {
        Network network = this.getMediationNetwork;
        if (network == null) {
            return false;
        }
        if (!(!Intrinsics.areEqual(this.getMonetizationNetwork, "NetworkLost"))) {
            network = null;
        }
        if (network == null) {
            return false;
        }
        ConnectivityManager connectivityManager = this.getMediationNetwork;
        NetworkCapabilities networkCapabilities = connectivityManager != null ? connectivityManager.getNetworkCapabilities(network) : null;
        if (networkCapabilities != null) {
            return A_(networkCapabilities);
        }
        return false;
    }

    private static boolean A_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }
}
