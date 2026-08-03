package o6;

import android.os.Bundle;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class q implements n6.f, n6.g {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s f5318d;

    public /* synthetic */ q(s sVar) {
        this.f5318d = sVar;
    }

    @Override // n6.f
    public final void onConnected(Bundle bundle) {
        s sVar = this.f5318d;
        p6.u.g(sVar.f5343x);
        e7.a aVar = sVar.f5336q;
        p6.u.g(aVar);
        aVar.y(new p(sVar));
    }

    @Override // n6.g
    public final void onConnectionFailed(m6.b bVar) {
        s sVar = this.f5318d;
        Lock lock = sVar.f5327h;
        lock.lock();
        try {
            if (sVar.f5337r && !bVar.a()) {
                sVar.a();
                sVar.l();
            } else {
                sVar.j(bVar);
            }
            lock.unlock();
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    @Override // n6.f
    public final void onConnectionSuspended(int i10) {
    }
}
