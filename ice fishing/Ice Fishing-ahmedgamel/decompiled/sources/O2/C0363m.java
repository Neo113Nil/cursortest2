package O2;

import P2.InterfaceC0374d;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: O2.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0363m implements InterfaceC0374d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2258a;

    /* renamed from: b, reason: collision with root package name */
    public final N2.e f2259b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2260c;

    public C0363m(C0369t c0369t, N2.e eVar, boolean z3) {
        this.f2258a = new WeakReference(c0369t);
        this.f2259b = eVar;
        this.f2260c = z3;
    }

    @Override // P2.InterfaceC0374d
    public final void a(M2.b bVar) {
        C0369t c0369t = (C0369t) this.f2258a.get();
        if (c0369t == null) {
            return;
        }
        P2.w.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c0369t.f2285n.f2322F.f2315z);
        ReentrantLock reentrantLock = c0369t.f2286u;
        reentrantLock.lock();
        try {
            if (!c0369t.h(0)) {
                reentrantLock.unlock();
                return;
            }
            if (!bVar.b()) {
                c0369t.e(bVar, this.f2259b, this.f2260c);
            }
            if (c0369t.j()) {
                c0369t.f();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
