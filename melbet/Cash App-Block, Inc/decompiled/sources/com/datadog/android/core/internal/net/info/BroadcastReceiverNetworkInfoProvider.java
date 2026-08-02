package com.datadog.android.core.internal.net.info;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.telephony.TelephonyManager;
import com.datadog.android.api.context.NetworkInfo;
import com.datadog.android.core.internal.receiver.ThreadSafeReceiver;
import com.datadog.android.internal.system.BuildSdkVersionProvider;
import com.datadog.android.internal.system.BuildSdkVersionProvider$Companion$DEFAULT$1;
import com.plaid.internal.EnumC0170g;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes4.dex */
public final class BroadcastReceiverNetworkInfoProvider extends ThreadSafeReceiver implements NetworkInfoProvider {
    public final BuildSdkVersionProvider buildSdkVersionProvider;
    public NetworkInfo networkInfo;
    public static final Set knownMobileTypes = ArraysKt___ArraysKt.toSet(new Integer[]{0, 4, 5, 2, 3});
    public static final Set known2GSubtypes = ArraysKt___ArraysKt.toSet(new Integer[]{1, 2, 4, 7, 11, 16});
    public static final Set known3GSubtypes = ArraysKt___ArraysKt.toSet(new Integer[]{3, 5, 6, 8, 9, 10, 12, 14, 15, 17});
    public static final Set known4GSubtypes = ArraysKt___ArraysKt.toSet(new Integer[]{13, 18, 19});
    public static final Set known5GSubtypes = SetsKt__SetsJVMKt.setOf(20);

    public BroadcastReceiverNetworkInfoProvider() {
        BuildSdkVersionProvider.Companion.getClass();
        this.buildSdkVersionProvider = BuildSdkVersionProvider.Companion.DEFAULT;
        this.networkInfo = new NetworkInfo(0, null, null, null, null, null, null, 127);
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final NetworkInfo getLatestNetworkInfo() {
        return this.networkInfo;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        NetworkInfo networkInfo;
        String str;
        String str2;
        CharSequence charSequence;
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        ConnectivityManager connectivityManager = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        android.net.NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            networkInfo = new NetworkInfo(1, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else if (activeNetworkInfo.getType() == 1) {
            networkInfo = new NetworkInfo(3, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
        } else {
            int i = 9;
            if (activeNetworkInfo.getType() == 9) {
                networkInfo = new NetworkInfo(2, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            } else if (knownMobileTypes.contains(Integer.valueOf(activeNetworkInfo.getType()))) {
                int subtype = activeNetworkInfo.getSubtype();
                if (known2GSubtypes.contains(Integer.valueOf(subtype))) {
                    i = 6;
                } else if (known3GSubtypes.contains(Integer.valueOf(subtype))) {
                    i = 7;
                } else if (known4GSubtypes.contains(Integer.valueOf(subtype))) {
                    i = 8;
                } else if (!known5GSubtypes.contains(Integer.valueOf(subtype))) {
                    i = 10;
                }
                int i2 = i;
                switch (subtype) {
                    case 1:
                        str = "GPRS";
                        str2 = str;
                        break;
                    case 2:
                        str = "Edge";
                        str2 = str;
                        break;
                    case 3:
                        str = "UMTS";
                        str2 = str;
                        break;
                    case 4:
                        str = "CDMA";
                        str2 = str;
                        break;
                    case 5:
                        str = "CDMAEVDORev0";
                        str2 = str;
                        break;
                    case 6:
                        str = "CDMAEVDORevA";
                        str2 = str;
                        break;
                    case 7:
                        str = "CDMA1x";
                        str2 = str;
                        break;
                    case 8:
                        str = "HSDPA";
                        str2 = str;
                        break;
                    case 9:
                        str = "HSUPA";
                        str2 = str;
                        break;
                    case 10:
                        str = "HSPA";
                        str2 = str;
                        break;
                    case 11:
                        str = "iDen";
                        str2 = str;
                        break;
                    case 12:
                        str = "CDMAEVDORevB";
                        str2 = str;
                        break;
                    case 13:
                        str = "LTE";
                        str2 = str;
                        break;
                    case 14:
                        str = "eHRPD";
                        str2 = str;
                        break;
                    case 15:
                        str = "HSPA+";
                        str2 = str;
                        break;
                    case 16:
                        str = "GSM";
                        str2 = str;
                        break;
                    case 17:
                        str = "TD_SCDMA";
                        str2 = str;
                        break;
                    case 18:
                        str = "IWLAN";
                        str2 = str;
                        break;
                    case 19:
                        str = "LTE_CA";
                        str2 = str;
                        break;
                    case 20:
                        str = "New Radio";
                        str2 = str;
                        break;
                    default:
                        str2 = null;
                        break;
                }
                if (((BuildSdkVersionProvider$Companion$DEFAULT$1) this.buildSdkVersionProvider).isAtLeastP) {
                    Object systemService2 = context.getSystemService("phone");
                    TelephonyManager telephonyManager = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
                    if (telephonyManager == null || (charSequence = telephonyManager.getSimCarrierIdName()) == null) {
                        charSequence = "Unknown Carrier Name";
                    }
                    networkInfo = new NetworkInfo(i2, charSequence.toString(), telephonyManager != null ? Long.valueOf(telephonyManager.getSimCarrierId()) : null, null, null, null, str2, 56);
                } else {
                    networkInfo = new NetworkInfo(i2, null, null, null, null, null, str2, 62);
                }
            } else {
                networkInfo = new NetworkInfo(12, null, null, null, null, null, null, EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            }
        }
        this.networkInfo = networkInfo;
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void register(Context context) {
        context.getClass();
        onReceive(context, registerReceiver(context, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE")));
    }

    @Override // com.datadog.android.core.internal.net.info.NetworkInfoProvider
    public final void unregister(Context context) {
        if (this.isRegistered.compareAndSet(true, false)) {
            context.unregisterReceiver(this);
        }
    }
}
