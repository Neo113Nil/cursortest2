package Q2;

import R2.InterfaceC0378d;
import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: Q2.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0367l implements InterfaceC0378d {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2574a;

    /* renamed from: b, reason: collision with root package name */
    public final P2.e f2575b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f2576c;

    public C0367l(C0373s c0373s, P2.e eVar, boolean z6) {
        this.f2574a = new WeakReference(c0373s);
        this.f2575b = eVar;
        this.f2576c = z6;
    }

    @Override // R2.InterfaceC0378d
    public final void a(O2.b bVar) {
        C0373s c0373s = (C0373s) this.f2574a.get();
        if (c0373s == null) {
            return;
        }
        R2.w.j("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == c0373s.f2601n.f2638F.f2631z);
        ReentrantLock reentrantLock = c0373s.f2602u;
        reentrantLock.lock();
        try {
            if (!c0373s.j(0)) {
                reentrantLock.unlock();
                return;
            }
            if (!bVar.b()) {
                c0373s.f(bVar, this.f2575b, this.f2576c);
            }
            if (c0373s.k()) {
                c0373s.h();
            }
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
