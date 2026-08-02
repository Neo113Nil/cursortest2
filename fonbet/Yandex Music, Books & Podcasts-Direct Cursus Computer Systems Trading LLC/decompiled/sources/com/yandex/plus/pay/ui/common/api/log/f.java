package com.yandex.plus.pay.ui.common.api.log;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.xz0;
import kotlin.collections.CollectionsKt;

/* loaded from: classes5.dex */
public final class f extends ConnectivityManager.NetworkCallback {
    public final String a;
    public final com.yandex.plus.pay.log.impl.b b;
    public final ConnectivityManager c;

    public f(String str, com.yandex.plus.pay.log.impl.b bVar, ConnectivityManager connectivityManager) {
        bVar.getClass();
        connectivityManager.getClass();
        this.a = str;
        this.b = bVar;
        this.c = connectivityManager;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        String str;
        network.getClass();
        super.onAvailable(network);
        NetworkCapabilities networkCapabilities = this.c.getNetworkCapabilities(network);
        if (networkCapabilities != null) {
            str = CollectionsKt.X(xz0.w(new String[]{networkCapabilities.hasTransport(1) ? "WiFi" : null, networkCapabilities.hasTransport(0) ? "Cellular" : null, networkCapabilities.hasTransport(3) ? "Ethernet" : null, networkCapabilities.hasTransport(4) ? "VPN" : null}), " + ", null, null, null, 62);
        } else {
            str = "Unknown";
        }
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.pay.log.impl.b bVar = this.b;
        bVar.getClass();
        bVar.c(aVar, this.a, "Network connection is available with type ".concat(str));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        super.onLost(network);
        com.yandex.plus.log.api.a aVar = com.yandex.plus.log.api.a.c;
        com.yandex.plus.pay.log.impl.b bVar = this.b;
        bVar.getClass();
        bVar.c(aVar, this.a, "Network connection is lost");
    }
}
