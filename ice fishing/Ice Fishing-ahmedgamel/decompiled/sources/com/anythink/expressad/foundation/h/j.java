package com.anythink.expressad.foundation.h;

import android.net.ConnectivityManager;

/* loaded from: classes.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static final String f20415a = "NetManager";

    /* renamed from: b, reason: collision with root package name */
    private static ConnectivityManager f20416b;

    private j() {
    }

    private static synchronized ConnectivityManager a() {
        ConnectivityManager connectivityManager;
        synchronized (j.class) {
            try {
                if (f20416b == null && com.anythink.core.common.d.t.b().g() != null) {
                    f20416b = (ConnectivityManager) com.anythink.core.common.d.t.b().g().getSystemService("connectivity");
                }
            } catch (Exception e9) {
                e9.getMessage();
            }
            connectivityManager = f20416b;
        }
        return connectivityManager;
    }
}
