package o6;

import android.os.Bundle;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q0 implements n6.f, n6.g {

    /* renamed from: d, reason: collision with root package name */
    public final n6.c f5319d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f5320e;

    /* renamed from: f, reason: collision with root package name */
    public y f5321f;

    public q0(n6.c cVar, boolean z10) {
        this.f5319d = cVar;
        this.f5320e = z10;
    }

    @Override // n6.f
    public final void onConnected(Bundle bundle) {
        p6.u.h(this.f5321f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f5321f.onConnected(bundle);
    }

    @Override // n6.g
    public final void onConnectionFailed(m6.b bVar) {
        n6.c cVar = this.f5319d;
        boolean z10 = this.f5320e;
        p6.u.h(this.f5321f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        y yVar = this.f5321f;
        yVar.f5373d.lock();
        try {
            yVar.f5383n.g(bVar, cVar, z10);
        } finally {
            yVar.f5373d.unlock();
        }
    }

    @Override // n6.f
    public final void onConnectionSuspended(int i10) {
        p6.u.h(this.f5321f, "Callbacks must be attached to a ClientConnectionHelper instance before connecting the client.");
        this.f5321f.onConnectionSuspended(i10);
    }
}
