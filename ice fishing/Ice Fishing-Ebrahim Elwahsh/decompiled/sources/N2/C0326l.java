package N2;

import O2.InterfaceC0367d;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: N2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0326l implements InterfaceC0367d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2073a;

    /* renamed from: b, reason: collision with root package name */
    public final M2.e f2074b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2075c;

    public C0326l(C0332s c0332s, M2.e eVar, boolean z8) {
        this.f2073a = new WeakReference(c0332s);
        this.f2074b = eVar;
        this.f2075c = z8;
    }

    @Override // O2.InterfaceC0367d
    public final void a(L2.b bVar) {
        C0332s c0332s = (C0332s) this.f2073a.get();
        if (c0332s == null) {
            return;
        }
        O2.w.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c0332s.f2100n.f2137F.f2130z);
        ReentrantLock reentrantLock = c0332s.f2101u;
        reentrantLock.lock();
        try {
            if (!c0332s.i(0)) {
                reentrantLock.unlock();
                return;
            }
            if (!bVar.b()) {
                c0332s.g(bVar, this.f2074b, this.f2075c);
            }
            if (c0332s.j()) {
                c0332s.h();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
