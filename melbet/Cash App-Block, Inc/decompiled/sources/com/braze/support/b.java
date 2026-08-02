package com.braze.support;

import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import bo.app.cb;
import com.braze.support.BrazeLogger;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.functions.Function0;

/* loaded from: classes4.dex */
public final class b {
    public static final b a = new b();

    public static final cb a(Intent intent, ConnectivityManager connectivityManager) {
        intent.getClass();
        connectivityManager.getClass();
        String action = intent.getAction();
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.W, (Throwable) null, false, (Function0) new b$$ExternalSyntheticLambda1(action, 0), 6, (Object) null);
            return cb.NONE;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            boolean booleanExtra = intent.getBooleanExtra("noConnectivity", false);
            if (activeNetworkInfo == null || booleanExtra) {
                return cb.NONE;
            }
            int type2 = activeNetworkInfo.getType();
            if (type2 != 0) {
                return (type2 == 1 || type2 == 6) ? cb.GREAT : type2 != 9 ? cb.NONE : cb.GOOD;
            }
            int subtype = activeNetworkInfo.getSubtype();
            return subtype != 3 ? (subtype == 13 || subtype == 20) ? cb.GREAT : cb.BAD : cb.GOOD;
        } catch (SecurityException e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) a, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new b$$ExternalSyntheticLambda0(0), 4, (Object) null);
            return cb.NONE;
        }
    }

    public static final String a() {
        return "Failed to get active network information. Ensure the permission android.permission.ACCESS_NETWORK_STATE is defined in your AndroidManifest.xml";
    }

    public static final String a(String str) {
        return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unexpected system broadcast received [", str, "]");
    }

    public static final cb a(NetworkCapabilities networkCapabilities) {
        if (networkCapabilities == null) {
            return cb.NONE;
        }
        int min = Math.min(networkCapabilities.getLinkDownstreamBandwidthKbps(), networkCapabilities.getLinkUpstreamBandwidthKbps());
        if (min > 14000) {
            return cb.GREAT;
        }
        if (min > 4000) {
            return cb.GOOD;
        }
        return cb.BAD;
    }
}
