package O2;

import android.os.Bundle;
import h3.C4564a;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes.dex */
public final class r implements N2.i, N2.j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0369t f2269n;

    public /* synthetic */ r(C0369t c0369t) {
        this.f2269n = c0369t;
    }

    @Override // N2.i
    public final void onConnected(Bundle bundle) {
        C0369t c0369t = this.f2269n;
        P2.w.h(c0369t.f2281K);
        C4564a c4564a = c0369t.f2275D;
        P2.w.h(c4564a);
        c4564a.B(new BinderC0367q(c0369t));
    }

    @Override // N2.j
    public final void onConnectionFailed(M2.b bVar) {
        C0369t c0369t = this.f2269n;
        ReentrantLock reentrantLock = c0369t.f2286u;
        ReentrantLock reentrantLock2 = c0369t.f2286u;
        reentrantLock.lock();
        try {
            if (c0369t.f2276E && !bVar.a()) {
                c0369t.a();
                c0369t.f();
            } else {
                c0369t.d(bVar);
            }
            reentrantLock2.unlock();
        } catch (Throwable th) {
            reentrantLock2.unlock();
            throw th;
        }
    }

    @Override // N2.i
    public final void onConnectionSuspended(int i) {
    }
}
