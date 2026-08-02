package com.datadog.android.core.internal.net.info;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import androidx.room.util.DBUtil;
import com.datadog.android.api.InternalLogger;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.plaid.internal.EnumC0170g;

/* loaded from: classes4.dex */
public final class CallbackNetworkInfoProvider extends ConnectivityManager.NetworkCallback implements NetworkInfoProvider {
    public final BuildSdkVersionProvider buildSdkVersionProvider;
    public final InternalLogger internalLogger;
    public NetworkInfo lastNetworkInfo;

    public CallbackNetworkInfoProvider(InternalLogger internalLogger) {
        BuildSdkVersionProvider.Companion.getClass();
        BuildSdkVersionProvider$Companion$DEFAULT$1 buildSdkVersionProvider$Companion$DEFAULT$1 = BuildSdkVersionProvider.Companion.DEFAULT;
        internalLogger.getClass();
        this.buildSdkVersionProvider = buildSdkVersionProvider$Companion$DEFAULT$1;
        this.internalLogger = internalLogger;
        this.lastNetworkInfo = new NetworkInfo(0, null, null, null, null, null, null, 127);
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final NetworkInfo getLatestNetworkInfo() {
        return this.lastNetworkInfo;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        super.onCapabilitiesChanged(network, networkCapabilities);
        int i = 3;
        if (!networkCapabilities.hasTransport(1)) {
            i = 2;
            if (!networkCapabilities.hasTransport(3)) {
                i = networkCapabilities.hasTransport(0) ? 11 : networkCapabilities.hasTransport(2) ? 5 : 12;
            }
        }
        Long l = null;
        Long valueOf = networkCapabilities.getLinkUpstreamBandwidthKbps() > 0 ? Long.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps()) : null;
        Long valueOf2 = networkCapabilities.getLinkDownstreamBandwidthKbps() > 0 ? Long.valueOf(networkCapabilities.getLinkDownstreamBandwidthKbps()) : null;
        if (((BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider).isAtLeastQ && networkCapabilities.getSignalStrength() != Integer.MIN_VALUE) {
            l = Long.valueOf(networkCapabilities.getSignalStrength());
        }
        this.lastNetworkInfo = new NetworkInfo(i, null, null, valueOf, valueOf2, l, null, 70);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        this.lastNetworkInfo = new NetworkInfo(1, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void register(Context context) {
        int i;
        SecurityException securityException;
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (connectivityManager == null) {
            DBUtil.log$default(this.internalLogger, 5, target, CallbackNetworkInfoProvider$register$1.INSTANCE, null, false, 56);
            return;
        }
        try {
            try {
                connectivityManager.registerDefaultNetworkCallback(this);
                try {
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
                    if (activeNetwork == null || networkCapabilities == null) {
                        return;
                    }
                    onCapabilitiesChanged(activeNetwork, networkCapabilities);
                } catch (SecurityException e) {
                    securityException = e;
                    i = 12;
                    DBUtil.log$default(this.internalLogger, 5, target, CallbackNetworkInfoProvider$register$1.INSTANCE$1, securityException, false, 48);
                    this.lastNetworkInfo = new NetworkInfo(i, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                }
            } catch (Exception e2) {
                DBUtil.log$default(this.internalLogger, 5, target, CallbackNetworkInfoProvider$register$1.INSTANCE$2, e2, false, 48);
                this.lastNetworkInfo = new NetworkInfo(12, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            }
        } catch (SecurityException e3) {
            i = 12;
            securityException = e3;
        }
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void unregister(Context context) {
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        InternalLogger.Target target = InternalLogger.Target.USER;
        if (connectivityManager == null) {
            DBUtil.log$default(this.internalLogger, 5, target, CallbackNetworkInfoProvider$register$1.INSTANCE$3, null, false, 56);
            return;
        }
        try {
            connectivityManager.unregisterNetworkCallback(this);
        } catch (SecurityException e) {
            DBUtil.log$default(this.internalLogger, 5, target, CallbackNetworkInfoProvider$register$1.INSTANCE$4, e, false, 48);
        } catch (RuntimeException e2) {
            DBUtil.log$default(this.internalLogger, 5, target, CallbackNetworkInfoProvider$register$1.INSTANCE$5, e2, false, 48);
        }
    }
}
