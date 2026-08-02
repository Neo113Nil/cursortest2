package defpackage;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class p2q extends ConnectivityManager.NetworkCallback {
    public static final p2q a = new p2q();
    public static final Object b = new Object();
    public static final LinkedHashMap c = new LinkedHashMap();
    public static NetworkCapabilities d;
    public static boolean e;

    public static rln a(ConnectivityManager connectivityManager, NetworkRequest networkRequest, avi aviVar) {
        NetworkCapabilities networkCapabilities;
        synchronized (b) {
            try {
                LinkedHashMap linkedHashMap = c;
                boolean isEmpty = linkedHashMap.isEmpty();
                linkedHashMap.put(aviVar, networkRequest);
                if (isEmpty) {
                    jsg.j().e(r3w.a, "NetworkRequestConstraintController register shared callback");
                    connectivityManager.registerDefaultNetworkCallback(a);
                }
                jsg.j().e(r3w.a, "NetworkRequestConstraintController send initial capabilities");
                a.getClass();
                if (e) {
                    networkCapabilities = d;
                } else {
                    networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                    d = networkCapabilities;
                    e = true;
                }
                aviVar.invoke(networkRequest.canBeSatisfiedBy(networkCapabilities) ? la6.a : new ma6(7));
            } catch (Throwable th) {
                throw th;
            }
        }
        return new rln(18, aviVar, connectivityManager);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        jsg.j().e(r3w.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (b) {
            try {
                d = networkCapabilities;
                for (Map.Entry entry : c.entrySet()) {
                    ((Function1) entry.getKey()).invoke(((NetworkRequest) entry.getValue()).canBeSatisfiedBy(networkCapabilities) ? la6.a : new ma6(7));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        jsg.j().e(r3w.a, "NetworkRequestConstraintController onLost callback");
        synchronized (b) {
            d = null;
            Iterator it = c.keySet().iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(new ma6(7));
            }
        }
    }
}
