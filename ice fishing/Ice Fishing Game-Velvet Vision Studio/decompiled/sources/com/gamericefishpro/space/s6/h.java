package com.gamericefishpro.space.s6;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import com.gamericefishpro.space.l6.q;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final String a;

    static {
        String strD = q.d("NetworkStateTracker");
        Intrinsics.checkNotNullExpressionValue(strD, "tagWithPrefix(\"NetworkStateTracker\")");
        a = strD;
    }

    public static final com.gamericefishpro.space.q6.a a(ConnectivityManager connectivityManager) {
        boolean zB;
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        boolean z = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        Intrinsics.checkNotNullParameter(connectivityManager, "<this>");
        try {
            NetworkCapabilities networkCapabilitiesA = com.gamericefishpro.space.v6.g.a(connectivityManager, com.gamericefishpro.space.v6.h.a(connectivityManager));
            zB = networkCapabilitiesA != null ? com.gamericefishpro.space.v6.g.b(networkCapabilitiesA, 16) : false;
        } catch (SecurityException e) {
            q.c().b(a, "Unable to validate active network", e);
        }
        return new com.gamericefishpro.space.q6.a(z, zB, connectivityManager.isActiveNetworkMetered(), (activeNetworkInfo == null || activeNetworkInfo.isRoaming()) ? false : true);
    }
}
