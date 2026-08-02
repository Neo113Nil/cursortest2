package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.e;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class fc5 implements yk2, t6t {
    public static final dc5 e = new dc5();
    public static fc5 f;
    public static final tf6 g;
    public final xzi a;
    public final num b;
    public final k5 c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    static {
        b43 b43Var = new b43(rre.f, 1);
        wqr n = a4g.n();
        dq7 dq7Var = ca8.a;
        g = gld.e(e.c(n, mn7.d).plus(b43Var));
    }

    public fc5(ujl ujlVar, xzi xziVar, num numVar, k5 k5Var) {
        this.a = xziVar;
        this.b = numVar;
        this.c = k5Var;
    }

    @Override // defpackage.t6t
    public final void C(db7 db7Var, nb7 nb7Var, boolean z) {
        db7Var.getClass();
        nb7Var.getClass();
        if (z) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            ec5 ec5Var = new ec5();
            ec5Var.a = 0L;
            ec5Var.b = elapsedRealtime;
            ec5Var.c = elapsedRealtime2;
            this.d.put(Integer.valueOf(db7Var.hashCode()), ec5Var);
            this.b.k();
        }
    }

    @Override // defpackage.t6t
    public final void a(lq2 lq2Var, nb7 nb7Var, boolean z, int i) {
        nb7Var.getClass();
        if (z) {
            ec5 ec5Var = (ec5) this.d.get(Integer.valueOf(lq2Var.hashCode()));
            if (ec5Var == null) {
                Timber.INSTANCE.w("Didn't find transfer for source '" + lq2Var.getUri() + "'. Ignoring onBytesTransferred", new Object[0]);
                return;
            }
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.b.A(new vk2(elapsedRealtime - ec5Var.c, i));
            ec5Var.a += i;
            ec5Var.c = elapsedRealtime;
        }
    }

    @Override // defpackage.yk2
    public final long d() {
        return ((Number) this.c.invoke()).longValue();
    }

    @Override // defpackage.yk2
    public final void e(Handler handler, xk2 xk2Var) {
        handler.getClass();
        xk2Var.getClass();
        this.a.Q(handler, xk2Var);
    }

    @Override // defpackage.yk2
    public final void f(xk2 xk2Var) {
        xk2Var.getClass();
        this.a.c0(xk2Var);
    }

    @Override // defpackage.t6t
    public final void h(db7 db7Var, nb7 nb7Var, boolean z) {
        db7Var.getClass();
        nb7Var.getClass();
    }

    @Override // defpackage.t6t
    public final void z(db7 db7Var, nb7 nb7Var, boolean z) {
        nb7Var.getClass();
        if (z) {
            int hashCode = db7Var.hashCode();
            Integer valueOf = Integer.valueOf(hashCode);
            ConcurrentHashMap concurrentHashMap = this.d;
            ec5 ec5Var = (ec5) concurrentHashMap.get(valueOf);
            if (ec5Var == null) {
                Timber.INSTANCE.w("Didn't find transfer for source '" + db7Var.getUri() + "'. Ignoring onTransferEnd", new Object[0]);
                return;
            }
            this.b.f();
            concurrentHashMap.remove(Integer.valueOf(hashCode));
            long j = ec5Var.c - ec5Var.b;
            long j2 = ec5Var.a;
            if (j2 <= 0 || j <= 0) {
                return;
            }
            this.a.T((int) j, j2, ((Number) this.c.invoke()).longValue());
        }
    }

    @Override // defpackage.yk2
    public final t6t c() {
        return this;
    }
}
