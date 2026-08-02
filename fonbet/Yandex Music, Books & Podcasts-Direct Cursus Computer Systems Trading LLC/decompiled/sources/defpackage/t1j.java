package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class t1j implements v1j {
    public final AtomicReference a;

    public t1j(ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        AtomicReference atomicReference = new AtomicReference(zzi.d);
        this.a = atomicReference;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null) {
            atomicReference.set(ovn.H(connectivityManager.getNetworkCapabilities(activeNetwork)));
        }
    }

    @Override // defpackage.v1j
    public final zzi a() {
        Object obj = this.a.get();
        obj.getClass();
        return (zzi) obj;
    }

    @Override // defpackage.v1j
    public final zzi b(Network network, NetworkCapabilities networkCapabilities) {
        zzi H = ovn.H(networkCapabilities);
        this.a.set(H);
        return H;
    }

    @Override // defpackage.v1j
    public final zzi c(Network network) {
        zzi zziVar = zzi.d;
        this.a.set(zziVar);
        return zziVar;
    }

    @Override // defpackage.v1j
    public final zzi d(Network network, LinkProperties linkProperties) {
        Object obj = this.a.get();
        obj.getClass();
        return (zzi) obj;
    }

    @Override // defpackage.v1j
    public final zzi e(Network network) {
        Object obj = this.a.get();
        obj.getClass();
        return (zzi) obj;
    }
}
