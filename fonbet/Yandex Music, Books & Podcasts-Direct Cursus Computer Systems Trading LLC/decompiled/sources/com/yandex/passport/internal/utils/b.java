package com.yandex.passport.internal.utils;

import android.net.ConnectivityManager;
import android.net.Network;
import defpackage.ltm;
import defpackage.tf6;

/* loaded from: classes4.dex */
public final class b extends ConnectivityManager.NetworkCallback {
    public final /* synthetic */ ltm a;
    public final /* synthetic */ ConnectivityManager b;
    public final /* synthetic */ tf6 c;

    public b(ltm ltmVar, ConnectivityManager connectivityManager, tf6 tf6Var) {
        this.a = ltmVar;
        this.b = connectivityManager;
        this.c = tf6Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        com.yandex.plus.core.network.api.utils.a.l(this.a, com.yandex.plus.core.network.api.utils.a.s(this.b), this.c);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        com.yandex.plus.core.network.api.utils.a.l(this.a, com.yandex.plus.core.network.api.utils.a.s(this.b), this.c);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onUnavailable() {
        com.yandex.plus.core.network.api.utils.a.l(this.a, com.yandex.plus.core.network.api.utils.a.s(this.b), this.c);
    }
}
