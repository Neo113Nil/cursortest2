package Q2;

import android.os.Bundle;
import j3.C4612a;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: Q2.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0372q implements P2.i, P2.j {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ C0373s f2585n;

    public /* synthetic */ C0372q(C0373s c0373s) {
        this.f2585n = c0373s;
    }

    @Override // P2.i
    public final void onConnected(Bundle bundle) {
        C0373s c0373s = this.f2585n;
        R2.w.h(c0373s.f2597K);
        C4612a c4612a = c0373s.f2591D;
        R2.w.h(c4612a);
        c4612a.B(new BinderC0371p(c0373s));
    }

    @Override // P2.j
    public final void onConnectionFailed(O2.b bVar) {
        C0373s c0373s = this.f2585n;
        ReentrantLock reentrantLock = c0373s.f2602u;
        ReentrantLock reentrantLock2 = c0373s.f2602u;
        reentrantLock.lock();
        try {
            if (c0373s.f2592E && !bVar.a()) {
                c0373s.a();
                c0373s.h();
            } else {
                c0373s.e(bVar);
            }
            reentrantLock2.unlock();
        } catch (Throwable th) {
            reentrantLock2.unlock();
            throw th;
        }
    }

    @Override // P2.i
    public final void onConnectionSuspended(int i) {
    }
}
