package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: classes5.dex */
public final class qv7 implements oo4, s8e {
    public volatile boolean a;
    public final Object b;
    public Collection c;

    public qv7() {
        this.a = false;
        this.b = new ConcurrentHashMap();
        this.c = new LinkedBlockingQueue();
    }

    public void a(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.a) {
                    runnable.run();
                } else {
                    ((List) this.c).add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.s8e
    public synchronized nsg c(String str) {
        gpr gprVar;
        gprVar = (gpr) ((ConcurrentHashMap) this.b).get(str);
        if (gprVar == null) {
            gprVar = new gpr(str, (LinkedBlockingQueue) this.c, this.a);
            ((ConcurrentHashMap) this.b).put(str, gprVar);
        }
        return gprVar;
    }

    @Override // defpackage.oo4
    public void d(s2i s2iVar) {
        a(new pv7(1, this, s2iVar));
    }

    @Override // defpackage.oo4
    public void n(sgr sgrVar, no4 no4Var, s2i s2iVar) {
        a(new t5(this, sgrVar, no4Var, s2iVar, 4));
    }

    @Override // defpackage.mjr
    public void onReady() {
        if (this.a) {
            ((oo4) this.b).onReady();
        } else {
            a(new q9(17, this));
        }
    }

    @Override // defpackage.mjr
    public void t(ljr ljrVar) {
        if (this.a) {
            ((oo4) this.b).t(ljrVar);
        } else {
            a(new pv7(0, this, ljrVar));
        }
    }

    public qv7(oo4 oo4Var) {
        this.c = new ArrayList();
        this.b = oo4Var;
    }
}
