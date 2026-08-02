package defpackage;

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

/* loaded from: classes11.dex */
public final class vx81 implements b25 {
    public final WeakReference a;
    public final zm2 b;
    public final boolean c;

    public vx81(yx81 yx81Var, zm2 zm2Var, boolean z) {
        this.a = new WeakReference(yx81Var);
        this.b = zm2Var;
        this.c = z;
    }

    @Override // defpackage.b25
    public final void a(ConnectionResult connectionResult) {
        yx81 yx81Var = (yx81) this.a.get();
        if (yx81Var == null) {
            return;
        }
        Lock lock = yx81Var.b;
        cvw.n("onReportServiceBinding must be called on the GoogleApiClient handler thread", Looper.myLooper() == yx81Var.a.F.z);
        lock.lock();
        try {
            if (yx81Var.g(0)) {
                if (!connectionResult.isSuccess()) {
                    yx81Var.e(connectionResult, this.b, this.c);
                }
                if (yx81Var.k()) {
                    yx81Var.f();
                }
            }
        } finally {
            lock.unlock();
        }
    }
}
