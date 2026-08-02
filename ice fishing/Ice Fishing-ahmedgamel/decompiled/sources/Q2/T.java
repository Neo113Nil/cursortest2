package Q2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class T implements P2.i, P2.j {

    /* renamed from: n, reason: collision with root package name */
    public final P2.e f2533n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2534u;

    /* renamed from: v, reason: collision with root package name */
    public y f2535v;

    public T(P2.e eVar, boolean z6) {
        this.f2533n = eVar;
        this.f2534u = z6;
    }

    @Override // P2.i
    public final void onConnected(Bundle bundle) {
        R2.w.i(this.f2535v, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f2535v.onConnected(bundle);
    }

    @Override // P2.j
    public final void onConnectionFailed(O2.b bVar) {
        R2.w.i(this.f2535v, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        y yVar = this.f2535v;
        P2.e eVar = this.f2533n;
        boolean z6 = this.f2534u;
        yVar.f2640n.lock();
        try {
            yVar.f2636D.b(bVar, eVar, z6);
        } finally {
            yVar.f2640n.unlock();
        }
    }

    @Override // P2.i
    public final void onConnectionSuspended(int i) {
        R2.w.i(this.f2535v, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f2535v.onConnectionSuspended(i);
    }
}
