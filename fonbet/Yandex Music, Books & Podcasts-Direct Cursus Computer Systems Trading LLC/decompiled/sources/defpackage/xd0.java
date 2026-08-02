package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.yandex.passport.common.logger.a;
import com.yandex.passport.common.logger.b;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;

/* loaded from: classes5.dex */
public final class xd0 extends ConnectivityManager.NetworkCallback {
    public static final /* synthetic */ int c = 0;
    public final /* synthetic */ int a;
    public final Object b;

    public xd0(avi aviVar) {
        this.a = 1;
        this.b = aviVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        int i = this.a;
        Continuation continuation = null;
        int i2 = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((zd0) obj).a.h();
                break;
            case 1:
            case 3:
            default:
                super.onAvailable(network);
                break;
            case 2:
                network.getClass();
                n0j n0jVar = (n0j) obj;
                dwt.a(n0jVar.e, new ps(n0jVar, n0j.b(n0jVar.c.getNetworkCapabilities(network)), 6));
                break;
            case 4:
                lum.d((lum) obj, network, true);
                break;
            case 5:
                xut.f().post(new nq1(this, true, 3));
                break;
            case 6:
                super.onAvailable(network);
                e8h e8hVar = (e8h) obj;
                n3m n3mVar = (n3m) e8hVar.c;
                n3mVar.c = ((ConnectivityManager) n3mVar.d).getActiveNetworkInfo();
                NetworkInfo networkInfo = (NetworkInfo) n3mVar.c;
                if (networkInfo == null || !networkInfo.isConnected()) {
                    n3mVar.b = "";
                    break;
                } else {
                    n3mVar.b = ((WifiManager) ((Context) e8hVar.b).getApplicationContext().getSystemService("wifi")).getConnectionInfo().getBSSID();
                    if (((Boolean) ((tao) n3mVar.f).d).booleanValue()) {
                        ArrayList a = tao.a((tao) n3mVar.f);
                        for (int i3 = 0; i3 < a.size(); i3++) {
                            ((pwe) ((tao) n3mVar.f).c).onFound((vjp) a.get(i3));
                        }
                        break;
                    }
                }
                break;
            case 7:
                network.getClass();
                jp0 jp0Var = (jp0) obj;
                mm6 mm6Var = (mm6) jp0Var.b;
                dq7 dq7Var = ca8.a;
                x97.y(mm6Var, mn7.d, null, new fmt(jp0Var, continuation, i2), 2);
                break;
            case 8:
                network.getClass();
                awc awcVar = (awc) ((z6u) obj).c;
                if (awcVar != null) {
                    ((w3i) awcVar.a).b.b = System.currentTimeMillis();
                    break;
                }
                break;
            case 9:
                network.getClass();
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "NetworkWrapper onAvailable=" + network, 8);
                }
                ((Function0) obj).invoke();
                break;
            case 10:
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean z) {
        switch (this.a) {
            case 0:
                if (!z) {
                    ((zd0) this.b).a.h();
                    break;
                }
                break;
            default:
                super.onBlockedStatusChanged(network, z);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        switch (this.a) {
            case 1:
                network.getClass();
                networkCapabilities.getClass();
                jsg.j().e(r3w.a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
                ((avi) this.b).invoke(la6.a);
                break;
            case 2:
                network.getClass();
                networkCapabilities.getClass();
                n0j n0jVar = (n0j) this.b;
                dwt.a(n0jVar.e, new ps(n0jVar, n0j.b(networkCapabilities), 6));
                break;
            case 3:
                network.getClass();
                networkCapabilities.getClass();
                jsg.j().e(y1j.a, "Network capabilities changed: " + networkCapabilities);
                x1j x1jVar = (x1j) this.b;
                x1jVar.c(Build.VERSION.SDK_INT >= 28 ? new q1j(networkCapabilities.hasCapability(12), networkCapabilities.hasCapability(16), !networkCapabilities.hasCapability(11), networkCapabilities.hasCapability(18)) : y1j.a(x1jVar.f));
                break;
            case 9:
                network.getClass();
                networkCapabilities.getClass();
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "NetworkWrapper onCapabilitiesChanged=" + network, 8);
                }
                ((Function0) this.b).invoke();
                break;
            default:
                super.onCapabilitiesChanged(network, networkCapabilities);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        switch (this.a) {
            case 10:
                ((y7x) this.b).a(network, linkProperties);
                break;
            default:
                super.onLinkPropertiesChanged(network, linkProperties);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        switch (this.a) {
            case 1:
                network.getClass();
                jsg.j().e(r3w.a, "NetworkRequestConstraintController onLost callback");
                ((avi) this.b).invoke(new ma6(7));
                return;
            case 2:
                network.getClass();
                n0j n0jVar = (n0j) this.b;
                dwt.a(n0jVar.e, new ps((Object) n0jVar, false, 6));
                return;
            case 3:
                network.getClass();
                jsg.j().e(y1j.a, "Network connection lost");
                x1j x1jVar = (x1j) this.b;
                x1jVar.c(y1j.a(x1jVar.f));
                return;
            case 4:
                lum.d((lum) this.b, network, false);
                return;
            case 5:
                xut.f().post(new nq1(this, false, 3));
                return;
            case 6:
                super.onLost(network);
                n3m n3mVar = (n3m) ((e8h) this.b).c;
                ArrayList a = tao.a((tao) n3mVar.f);
                for (int i = 0; i < a.size(); i++) {
                    ((pwe) ((tao) n3mVar.f).c).onLost((vjp) a.get(i));
                }
                n3mVar.b = "";
                return;
            case 7:
                network.getClass();
                return;
            case 8:
                network.getClass();
                awc awcVar = (awc) ((z6u) this.b).c;
                if (awcVar != null) {
                    ((w3i) awcVar.a).b.b = System.currentTimeMillis();
                    return;
                }
                return;
            case 9:
                network.getClass();
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "NetworkWrapper onLost=" + network, 8);
                }
                ((Function0) this.b).invoke();
                return;
            case 10:
                y7x y7xVar = (y7x) this.b;
                synchronized (y7xVar.h) {
                    try {
                        if (y7xVar.d != null && y7xVar.e != null) {
                            y7x.j.b("the network is lost", new Object[0]);
                            if (y7xVar.e.remove(network)) {
                                y7xVar.d.remove(network);
                            }
                            y7xVar.b();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                super.onLost(network);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onUnavailable() {
        switch (this.a) {
            case 9:
                if (a.a.isEnabled()) {
                    a.c(b.b, null, "NetworkWrapper onUnavailable", 8);
                }
                ((Function0) this.b).invoke();
                return;
            case 10:
                y7x y7xVar = (y7x) this.b;
                synchronized (y7xVar.h) {
                    if (y7xVar.d != null && y7xVar.e != null) {
                        y7x.j.b("all networks are unavailable.", new Object[0]);
                        y7xVar.d.clear();
                        y7xVar.e.clear();
                        y7xVar.b();
                        return;
                    }
                    return;
                }
            default:
                super.onUnavailable();
                return;
        }
    }

    public /* synthetic */ xd0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void a(Network network) {
    }
}
