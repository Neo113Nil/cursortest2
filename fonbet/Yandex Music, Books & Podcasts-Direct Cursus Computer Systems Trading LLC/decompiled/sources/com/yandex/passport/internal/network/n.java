package com.yandex.passport.internal.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.voi;
import defpackage.z7o;

/* loaded from: classes4.dex */
public final class n extends voi {
    public final ConnectivityManager l;
    public final NetworkRequest m;
    public final m n;

    public n(Context context) {
        context.getClass();
        Object systemService = context.getSystemService("connectivity");
        this.l = systemService instanceof ConnectivityManager ? (ConnectivityManager) systemService : null;
        this.m = new NetworkRequest.Builder().build();
        this.n = new m(this);
    }

    @Override // defpackage.qdg
    public final void h() {
        ConnectivityManager connectivityManager = this.l;
        if (connectivityManager != null) {
            connectivityManager.registerNetworkCallback(this.m, this.n);
        }
        m(Boolean.valueOf(n()));
    }

    @Override // defpackage.qdg
    public final void i() {
        ConnectivityManager connectivityManager = this.l;
        if (connectivityManager != null) {
            connectivityManager.unregisterNetworkCallback(this.n);
        }
    }

    public final boolean n() {
        Object t7oVar;
        try {
            r7o r7oVar = z7o.b;
            ConnectivityManager connectivityManager = this.l;
            t7oVar = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            r7o r7oVar2 = z7o.b;
            t7oVar = new t7o(th);
        }
        NetworkInfo networkInfo = (NetworkInfo) (t7oVar instanceof t7o ? null : t7oVar);
        if (networkInfo != null) {
            return networkInfo.isConnected();
        }
        return false;
    }
}
