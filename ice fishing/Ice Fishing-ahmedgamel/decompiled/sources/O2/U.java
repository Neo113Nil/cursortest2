package O2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class U implements N2.i, N2.j {

    /* renamed from: n, reason: collision with root package name */
    public final N2.e f2215n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2216u;

    /* renamed from: v, reason: collision with root package name */
    public z f2217v;

    public U(N2.e eVar, boolean z3) {
        this.f2215n = eVar;
        this.f2216u = z3;
    }

    @Override // N2.i
    public final void onConnected(Bundle bundle) {
        P2.w.i(this.f2217v, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f2217v.onConnected(bundle);
    }

    @Override // N2.j
    public final void onConnectionFailed(M2.b bVar) {
        P2.w.i(this.f2217v, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        z zVar = this.f2217v;
        N2.e eVar = this.f2215n;
        boolean z3 = this.f2216u;
        zVar.f2324n.lock();
        try {
            zVar.f2320D.s(bVar, eVar, z3);
        } finally {
            zVar.f2324n.unlock();
        }
    }

    @Override // N2.i
    public final void onConnectionSuspended(int i) {
        P2.w.i(this.f2217v, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f2217v.onConnectionSuspended(i);
    }
}
