package Q0;

import E2.B;
import P1.p;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.internal.ads.AbstractC3592ma;
import com.google.android.gms.internal.ads.C3061cg;
import com.google.android.gms.internal.ads.C3680o7;
import com.google.android.gms.internal.ads.C3683oA;
import com.google.android.gms.internal.ads.Ev;
import com.google.android.gms.internal.ads.Kv;
import java.util.Objects;
import s2.r;

/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2473b;

    public /* synthetic */ h(int i, Object obj) {
        this.f2472a = i;
        this.f2473b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f2472a) {
            case 1:
                p.f().post(new B(1, this, true));
                break;
            case 2:
            default:
                super.onAvailable(network);
                break;
            case 3:
                ((C3061cg) this.f2473b).f30316p.set(true);
                break;
            case 4:
                Ev ev = (Ev) this.f2473b;
                ev.getClass();
                if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32768C)).booleanValue()) {
                    ev.a(true);
                    break;
                }
                break;
            case 5:
                ((Kv) this.f2473b).b(true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        switch (this.f2472a) {
            case 0:
                kotlin.jvm.internal.h.e(network, "network");
                kotlin.jvm.internal.h.e(capabilities, "capabilities");
                J0.r.d().a(j.f2476a, "Network capabilities changed: " + capabilities);
                i iVar = (i) this.f2473b;
                iVar.c(j.a(iVar.f2474f));
                return;
            case 2:
                synchronized (C3680o7.class) {
                    ((C3680o7) this.f2473b).f33649u = capabilities;
                }
                return;
            case 6:
                C3683oA c3683oA = (C3683oA) this.f2473b;
                synchronized (c3683oA) {
                    c3683oA.f33652c = capabilities;
                }
                return;
            default:
                super.onCapabilitiesChanged(network, capabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f2472a) {
            case 0:
                kotlin.jvm.internal.h.e(network, "network");
                J0.r.d().a(j.f2476a, "Network connection lost");
                i iVar = (i) this.f2473b;
                iVar.c(j.a(iVar.f2474f));
                return;
            case 1:
                p.f().post(new B(1, this, false));
                return;
            case 2:
                synchronized (C3680o7.class) {
                    ((C3680o7) this.f2473b).f33649u = null;
                }
                return;
            case 3:
                ((C3061cg) this.f2473b).f30316p.set(false);
                return;
            case 4:
                Ev ev = (Ev) this.f2473b;
                ev.getClass();
                if (((Boolean) r.f40506e.f40509c.a(AbstractC3592ma.f32768C)).booleanValue()) {
                    ev.a(false);
                    return;
                }
                return;
            case 5:
                ((Kv) this.f2473b).b(false);
                return;
            default:
                C3683oA c3683oA = (C3683oA) this.f2473b;
                synchronized (c3683oA) {
                    c3683oA.f33652c = null;
                }
                return;
        }
    }

    public h(C3061cg c3061cg) {
        this.f2472a = 3;
        Objects.requireNonNull(c3061cg);
        this.f2473b = c3061cg;
    }

    public h(Ev ev) {
        this.f2472a = 4;
        Objects.requireNonNull(ev);
        this.f2473b = ev;
    }

    public h(Kv kv) {
        this.f2472a = 5;
        Objects.requireNonNull(kv);
        this.f2473b = kv;
    }

    public h(C3683oA c3683oA) {
        this.f2472a = 6;
        Objects.requireNonNull(c3683oA);
        this.f2473b = c3683oA;
    }
}
