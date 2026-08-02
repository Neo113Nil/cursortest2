package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class wni extends ConnectivityManager.NetworkCallback {
    public final w1j a;
    public final y66 b;

    public wni(w1j w1jVar, y66 y66Var) {
        this.a = w1jVar;
        this.b = y66Var;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        network.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        w1j w1jVar = this.a;
        w1jVar.getClass();
        this.b.invoke(((v1j) w1jVar.a.getValue()).e(network));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        w1j w1jVar = this.a;
        w1jVar.getClass();
        this.b.invoke(((v1j) w1jVar.a.getValue()).b(network, networkCapabilities));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        network.getClass();
        linkProperties.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        w1j w1jVar = this.a;
        w1jVar.getClass();
        this.b.invoke(((v1j) w1jVar.a.getValue()).d(network, linkProperties));
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        w1j w1jVar = this.a;
        w1jVar.getClass();
        this.b.invoke(((v1j) w1jVar.a.getValue()).c(network));
    }
}
