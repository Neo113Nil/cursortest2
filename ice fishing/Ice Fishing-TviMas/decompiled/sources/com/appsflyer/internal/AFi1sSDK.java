package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* loaded from: classes4.dex */
public final class AFi1sSDK extends AFi1rSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1sSDK(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "");
    }

    private static boolean y_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    protected final String getCurrencyIso4217Code() {
        Network[] allNetworks;
        Sequence asSequence;
        Sequence mapNotNull;
        Object obj;
        ConnectivityManager connectivityManager = this.getMediationNetwork;
        if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null && (asSequence = ArraysKt.asSequence(allNetworks)) != null && (mapNotNull = SequencesKt.mapNotNull(asSequence, new Function1<Network, NetworkInfo>() { // from class: com.appsflyer.internal.AFi1sSDK.4
            @Override // kotlin.jvm.functions.Function1
            /* renamed from: z_, reason: merged with bridge method [inline-methods] */
            public final NetworkInfo invoke(Network network) {
                ConnectivityManager connectivityManager2 = AFi1sSDK.this.getMediationNetwork;
                Intrinsics.checkNotNull(connectivityManager2);
                return connectivityManager2.getNetworkInfo(network);
            }

            {
                super(1);
            }
        })) != null) {
            Iterator it = mapNotNull.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (x_((NetworkInfo) obj)) {
                    break;
                }
            }
            NetworkInfo networkInfo = (NetworkInfo) obj;
            if (networkInfo != null) {
                int type = networkInfo.getType();
                if (type == 0) {
                    return "MOBILE";
                }
                if (type != 1) {
                    return "unknown";
                }
                return "WIFI";
            }
        }
        return "unknown";
    }

    @Override // com.appsflyer.internal.AFi1rSDK
    public final boolean getRevenue() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMediationNetwork;
            if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (Network network : allNetworks) {
                ConnectivityManager connectivityManager2 = this.getMediationNetwork;
                Intrinsics.checkNotNull(connectivityManager2);
                NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                if (networkCapabilities != null) {
                    arrayList.add(networkCapabilities);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                return false;
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (y_((NetworkCapabilities) it.next())) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }
}
