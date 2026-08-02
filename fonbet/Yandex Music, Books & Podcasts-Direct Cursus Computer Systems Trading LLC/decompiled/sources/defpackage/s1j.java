package defpackage;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.util.LinkedHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes4.dex */
public final class s1j implements v1j {
    public final ConnectivityManager a;
    public final ReentrantLock b;
    public final ovn c;
    public Network d;
    public final LinkedHashMap e;

    public s1j(ConnectivityManager connectivityManager) {
        connectivityManager.getClass();
        this.a = connectivityManager;
        this.b = new ReentrantLock();
        this.c = new ovn();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.e = linkedHashMap;
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork != null) {
            this.d = activeNetwork;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            if (networkCapabilities != null) {
                linkedHashMap.put(activeNetwork, networkCapabilities);
            }
        }
    }

    @Override // defpackage.v1j
    public final zzi a() {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            return f();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.v1j
    public final zzi b(Network network, NetworkCapabilities networkCapabilities) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.e.put(network, networkCapabilities);
            return f();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.v1j
    public final zzi c(Network network) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d = this.a.getActiveNetwork();
            this.e.remove(network);
            return f();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.v1j
    public final zzi d(Network network, LinkProperties linkProperties) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            return f();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // defpackage.v1j
    public final zzi e(Network network) {
        ReentrantLock reentrantLock = this.b;
        reentrantLock.lock();
        try {
            this.d = this.a.getActiveNetwork();
            return f();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final zzi f() {
        NetworkCapabilities networkCapabilities = (NetworkCapabilities) this.e.get(this.d);
        this.c.getClass();
        return ovn.H(networkCapabilities);
    }
}
