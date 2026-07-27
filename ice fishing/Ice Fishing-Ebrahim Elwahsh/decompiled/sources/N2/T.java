package N2;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class T implements M2.i, M2.j {

    /* renamed from: n, reason: collision with root package name */
    public final M2.e f2032n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2033u;

    /* renamed from: v, reason: collision with root package name */
    public y f2034v;

    public T(M2.e eVar, boolean z8) {
        this.f2032n = eVar;
        this.f2033u = z8;
    }

    @Override // M2.i
    public final void onConnected(Bundle bundle) {
        O2.w.i(this.f2034v, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f2034v.onConnected(bundle);
    }

    @Override // M2.j
    public final void onConnectionFailed(L2.b bVar) {
        O2.w.i(this.f2034v, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        y yVar = this.f2034v;
        M2.e eVar = this.f2032n;
        boolean z8 = this.f2033u;
        yVar.f2139n.lock();
        try {
            yVar.f2135D.y(bVar, eVar, z8);
        } finally {
            yVar.f2139n.unlock();
        }
    }

    @Override // M2.i
    public final void onConnectionSuspended(int i) {
        O2.w.i(this.f2034v, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f2034v.onConnectionSuspended(i);
    }
}
