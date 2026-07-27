package Q0;

import C2.C;
import J0.s;
import N1.p;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3038cg;
import com.google.android.gms.internal.ads.C3657o7;
import com.google.android.gms.internal.ads.C3660oA;
import com.google.android.gms.internal.ads.Ev;
import com.google.android.gms.internal.ads.Kv;
import java.util.Objects;
import q2.r;

/* loaded from: classes.dex */
public final class h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2638b;

    public /* synthetic */ h(int i, Object obj) {
        this.f2637a = i;
        this.f2638b = obj;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onAvailable(Network network) {
        switch (this.f2637a) {
            case 1:
                p.f().post(new C(1, this, true));
                break;
            case 2:
            default:
                super.onAvailable(network);
                break;
            case 3:
                ((C3038cg) this.f2638b).f29531p.set(true);
                break;
            case 4:
                Ev ev = (Ev) this.f2638b;
                ev.getClass();
                if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.f31988C)).booleanValue()) {
                    ev.a(true);
                    break;
                }
                break;
            case 5:
                ((Kv) this.f2638b).b(true);
                break;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
        switch (this.f2637a) {
            case 0:
                kotlin.jvm.internal.h.e(network, "network");
                kotlin.jvm.internal.h.e(capabilities, "capabilities");
                s.d().a(j.f2641a, "Network capabilities changed: " + capabilities);
                i iVar = (i) this.f2638b;
                iVar.c(j.a(iVar.f2639f));
                return;
            case 2:
                synchronized (C3657o7.class) {
                    ((C3657o7) this.f2638b).f32862u = capabilities;
                }
                return;
            case 6:
                C3660oA c3660oA = (C3660oA) this.f2638b;
                synchronized (c3660oA) {
                    c3660oA.f32865c = capabilities;
                }
                return;
            default:
                super.onCapabilitiesChanged(network, capabilities);
                return;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        switch (this.f2637a) {
            case 0:
                kotlin.jvm.internal.h.e(network, "network");
                s.d().a(j.f2641a, "Network connection lost");
                i iVar = (i) this.f2638b;
                iVar.c(j.a(iVar.f2639f));
                return;
            case 1:
                p.f().post(new C(1, this, false));
                return;
            case 2:
                synchronized (C3657o7.class) {
                    ((C3657o7) this.f2638b).f32862u = null;
                }
                return;
            case 3:
                ((C3038cg) this.f2638b).f29531p.set(false);
                return;
            case 4:
                Ev ev = (Ev) this.f2638b;
                ev.getClass();
                if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.f31988C)).booleanValue()) {
                    ev.a(false);
                    return;
                }
                return;
            case 5:
                ((Kv) this.f2638b).b(false);
                return;
            default:
                C3660oA c3660oA = (C3660oA) this.f2638b;
                synchronized (c3660oA) {
                    c3660oA.f32865c = null;
                }
                return;
        }
    }

    public h(C3038cg c3038cg) {
        this.f2637a = 3;
        Objects.requireNonNull(c3038cg);
        this.f2638b = c3038cg;
    }

    public h(Ev ev) {
        this.f2637a = 4;
        Objects.requireNonNull(ev);
        this.f2638b = ev;
    }

    public h(Kv kv) {
        this.f2637a = 5;
        Objects.requireNonNull(kv);
        this.f2638b = kv;
    }

    public h(C3660oA c3660oA) {
        this.f2637a = 6;
        Objects.requireNonNull(c3660oA);
        this.f2638b = c3660oA;
    }
}
