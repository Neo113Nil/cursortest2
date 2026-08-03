package o6;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class l implements p6.b {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f5293a;

    /* renamed from: b, reason: collision with root package name */
    public final n6.c f5294b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f5295c;

    public l(s sVar, n6.c cVar, boolean z10) {
        this.f5293a = new WeakReference(sVar);
        this.f5294b = cVar;
        this.f5295c = z10;
    }

    @Override // p6.b
    public final void a(m6.b bVar) {
        s sVar = (s) this.f5293a.get();
        if (sVar == null) {
            return;
        }
        Lock lock = sVar.f5327h;
        p6.u.i("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == sVar.f5326g.f5385p.f5355g);
        lock.lock();
        try {
            if (sVar.m(0)) {
                if (!bVar.b()) {
                    sVar.k(bVar, this.f5294b, this.f5295c);
                }
                if (sVar.n()) {
                    sVar.l();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
