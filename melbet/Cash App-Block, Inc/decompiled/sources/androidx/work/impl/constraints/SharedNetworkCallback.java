package androidx.work.impl.constraints;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import androidx.work.Logger$LogcatLogger;
import androidx.work.impl.constraints.ConstraintsState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class SharedNetworkCallback extends ConnectivityManager.NetworkCallback {
    public static NetworkCapabilities cachedCapabilities;
    public static boolean capabilitiesInitialized;
    public static Boolean isBlocked;
    public static final SharedNetworkCallback INSTANCE = new SharedNetworkCallback();
    public static final Object requestsLock = new Object();
    public static final LinkedHashMap requests = new LinkedHashMap();

    public static boolean areNetworkConstraintsSatisfied(NetworkRequest networkRequest, NetworkCapabilities networkCapabilities) {
        Boolean bool = isBlocked;
        bool.getClass();
        return !bool.booleanValue() && networkRequest.canBeSatisfiedBy(networkCapabilities);
    }

    public static void dispatchOnConstraintState() {
        ArrayList arrayList = new ArrayList();
        synchronized (requestsLock) {
            try {
                if (capabilitiesInitialized && isBlocked != null) {
                    for (Map.Entry entry : requests.entrySet()) {
                        Function1 function1 = (Function1) entry.getKey();
                        NetworkRequest networkRequest = (NetworkRequest) entry.getValue();
                        SharedNetworkCallback sharedNetworkCallback = INSTANCE;
                        NetworkCapabilities networkCapabilities = cachedCapabilities;
                        sharedNetworkCallback.getClass();
                        arrayList.add(new Pair(function1, areNetworkConstraintsSatisfied(networkRequest, networkCapabilities) ? ConstraintsState.ConstraintsMet.INSTANCE : new ConstraintsState.ConstraintsNotMet(7)));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Pair pair = (Pair) it.next();
                        ((Function1) pair.first).invoke((ConstraintsState) pair.second);
                    }
                    return;
                }
                Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "Not dispatching constraint state yet: isBlocked=" + isBlocked + ", capabilitiesInitialized=" + capabilitiesInitialized);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onBlockedStatusChanged(Network network, boolean z) {
        network.getClass();
        Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onBlockedStatusChanged callback " + z);
        synchronized (requestsLock) {
            if (Intrinsics.areEqual(isBlocked, Boolean.valueOf(z))) {
                return;
            }
            isBlocked = Boolean.valueOf(z);
            dispatchOnConstraintState();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        network.getClass();
        networkCapabilities.getClass();
        Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            cachedCapabilities = networkCapabilities;
            capabilitiesInitialized = true;
        }
        dispatchOnConstraintState();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        network.getClass();
        Logger$LogcatLogger.get().debug(WorkConstraintsTrackerKt.TAG, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            cachedCapabilities = null;
            Iterator it = requests.keySet().iterator();
            while (it.hasNext()) {
                ((Function1) it.next()).invoke(new ConstraintsState.ConstraintsNotMet(7));
            }
        }
    }
}
