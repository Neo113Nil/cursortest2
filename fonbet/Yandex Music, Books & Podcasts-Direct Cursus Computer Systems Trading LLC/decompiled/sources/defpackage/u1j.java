package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;

/* loaded from: classes4.dex */
public final class u1j implements v1j {
    public final ConnectivityManager a;
    public final r1j b;

    public u1j(ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        this.a = connectivityManager;
        r1j r1jVar = new r1j();
        r1jVar.a = u75.h(NetworkInfo.DetailedState.CONNECTED, NetworkInfo.DetailedState.CONNECTING);
        this.b = r1jVar;
    }

    @Override // defpackage.v1j
    public final zzi a() {
        return f();
    }

    @Override // defpackage.v1j
    public final zzi b(Network network, NetworkCapabilities networkCapabilities) {
        return f();
    }

    @Override // defpackage.v1j
    public final zzi c(Network network) {
        return f();
    }

    @Override // defpackage.v1j
    public final zzi d(Network network, LinkProperties linkProperties) {
        return f();
    }

    @Override // defpackage.v1j
    public final zzi e(Network network) {
        return f();
    }

    public final zzi f() {
        NetworkInfo activeNetworkInfo = this.a.getActiveNetworkInfo();
        r1j r1jVar = this.b;
        r1jVar.getClass();
        if (activeNetworkInfo == null) {
            return zzi.d;
        }
        boolean contains = r1jVar.a.contains(activeNetworkInfo.getDetailedState());
        int type = activeNetworkInfo.getType();
        return new zzi(contains, type != 0 ? type != 1 ? yzi.c : yzi.a : yzi.b, -1);
    }
}
