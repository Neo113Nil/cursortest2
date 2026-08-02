package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes.dex */
public final class iww implements cr2 {
    public final WeakReference a;
    public final po0 b;
    public final boolean c;

    public iww(nww nwwVar, po0 po0Var, boolean z) {
        this.a = new WeakReference(nwwVar);
        this.b = po0Var;
        this.c = z;
    }

    @Override // defpackage.cr2
    public final void a(h66 h66Var) {
        nww nwwVar = (nww) this.a.get();
        if (nwwVar == null) {
            return;
        }
        Lock lock = nwwVar.b;
        y1g.I("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == nwwVar.a.s.g);
        lock.lock();
        try {
            if (nwwVar.i(0)) {
                if (!h66Var.e()) {
                    nwwVar.f(h66Var, this.b, this.c);
                }
                if (nwwVar.k()) {
                    nwwVar.g();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
