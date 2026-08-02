package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.appsflyer.AFLogger;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.sequences.FilteringSequence$iterator$1;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt___SequencesKt;

/* loaded from: classes3.dex */
public final class AFi1tSDK extends AFi1qSDK {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFi1tSDK(Context context) {
        super(context);
        context.getClass();
    }

    private static boolean w_(NetworkCapabilities networkCapabilities) {
        return (networkCapabilities == null || !networkCapabilities.hasTransport(4) || networkCapabilities.hasCapability(15)) ? false : true;
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final String AFAdRevenueData() {
        Network[] allNetworks;
        Sequence asSequence;
        Object obj;
        ConnectivityManager connectivityManager = this.getMonetizationNetwork;
        if (connectivityManager == null || (allNetworks = connectivityManager.getAllNetworks()) == null || (asSequence = ArraysKt___ArraysKt.asSequence(allNetworks)) == null) {
            return "unknown";
        }
        FilteringSequence$iterator$1 filteringSequence$iterator$1 = new FilteringSequence$iterator$1(SequencesKt___SequencesKt.mapNotNull(asSequence, new Function1<Network, NetworkInfo>() { // from class: com.appsflyer.internal.AFi1tSDK.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: x_, reason: merged with bridge method [inline-methods] */
            public final NetworkInfo invoke(Network network) {
                ConnectivityManager connectivityManager2 = AFi1tSDK.this.getMonetizationNetwork;
                connectivityManager2.getClass();
                return connectivityManager2.getNetworkInfo(network);
            }
        }));
        while (true) {
            if (!filteringSequence$iterator$1.hasNext()) {
                obj = null;
                break;
            }
            obj = filteringSequence$iterator$1.next();
            if (AFi1qSDK.v_((NetworkInfo) obj)) {
                break;
            }
        }
        NetworkInfo networkInfo = (NetworkInfo) obj;
        if (networkInfo == null) {
            return "unknown";
        }
        int type2 = networkInfo.getType();
        return type2 != 0 ? type2 != 1 ? "unknown" : "WIFI" : "MOBILE";
    }

    @Override // com.appsflyer.internal.AFi1qSDK
    public final boolean getMediationNetwork() {
        Network[] allNetworks;
        try {
            ConnectivityManager connectivityManager = this.getMonetizationNetwork;
            if (connectivityManager != null && (allNetworks = connectivityManager.getAllNetworks()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Network network : allNetworks) {
                    ConnectivityManager connectivityManager2 = this.getMonetizationNetwork;
                    connectivityManager2.getClass();
                    NetworkCapabilities networkCapabilities = connectivityManager2.getNetworkCapabilities(network);
                    if (networkCapabilities != null) {
                        arrayList.add(networkCapabilities);
                    }
                }
                if (!arrayList.isEmpty()) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (w_((NetworkCapabilities) it.next())) {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Exception e) {
            AFLogger.afErrorLog("Failed collecting ivc data", e);
            return false;
        }
    }
}
