package com.anythink.expressad.foundation.h;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f19628a = "NetManager";

    /* renamed from: b, reason: collision with root package name */
    private static ConnectivityManager f19629b;

    private j() {
    }

    private static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (j.class) {
            try {
                if (f19629b == null && com.anythink.core.common.d.t.b().g() != null) {
                    f19629b = (ConnectivityManager) com.anythink.core.common.d.t.b().g().getSystemService("connectivity");
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
            connectivityManager = f19629b;
        }
        return connectivityManager;
    }
}
