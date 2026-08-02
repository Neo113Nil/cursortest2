package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class z9f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ baf b;

    public /* synthetic */ z9f(baf bafVar, int i) {
        this.a = i;
        this.b = bafVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        baf bafVar;
        boolean z;
        long nextLong;
        boolean z2 = true;
        switch (this.a) {
            case 0:
                synchronized (this.b) {
                    try {
                        bafVar = this.b;
                        if (bafVar.d != 6) {
                            bafVar.d = 6;
                        } else {
                            z2 = false;
                        }
                    } finally {
                    }
                }
                if (z2) {
                    ((noj) bafVar.c.a).c(sgr.o.i("Keepalive failed. The connection is likely gone"));
                    return;
                }
                return;
            default:
                synchronized (this.b) {
                    try {
                        baf bafVar2 = this.b;
                        bafVar2.f = null;
                        int i = bafVar2.d;
                        if (i == 2) {
                            bafVar2.d = 4;
                            bafVar2.e = bafVar2.a.schedule(bafVar2.g, bafVar2.j, TimeUnit.NANOSECONDS);
                            z = true;
                        } else {
                            if (i == 3) {
                                bafVar2.f = bafVar2.a.schedule(bafVar2.h, bafVar2.i - bafVar2.b.a(), TimeUnit.NANOSECONDS);
                                this.b.d = 2;
                            }
                            z = false;
                        }
                    } finally {
                    }
                }
                if (z) {
                    awc awcVar = this.b.c;
                    noj nojVar = (noj) awcVar.a;
                    aaf aafVar = new aaf(awcVar);
                    e48 e48Var = e48.a;
                    synchronized (nojVar.k) {
                        try {
                            o2g.V(nojVar.i != null);
                            if (nojVar.y) {
                                tgr l = nojVar.l();
                                Logger logger = r5e.g;
                                try {
                                    e48Var.execute(new q5e(aafVar, l));
                                } catch (Throwable th) {
                                    r5e.g.log(Level.SEVERE, "Failed to execute PingCallback", th);
                                }
                                return;
                            }
                            r5e r5eVar = nojVar.x;
                            if (r5eVar != null) {
                                nextLong = 0;
                                z2 = false;
                            } else {
                                nextLong = nojVar.d.nextLong();
                                hhr hhrVar = (hhr) nojVar.e.get();
                                hhrVar.b();
                                r5e r5eVar2 = new r5e(nextLong, hhrVar);
                                nojVar.x = r5eVar2;
                                nojVar.L.getClass();
                                r5eVar = r5eVar2;
                            }
                            if (z2) {
                                nojVar.i.g((int) (nextLong >>> 32), (int) nextLong, false);
                            }
                            synchronized (r5eVar) {
                                try {
                                    if (!r5eVar.d) {
                                        r5eVar.c.put(aafVar, e48Var);
                                        return;
                                    }
                                    tgr tgrVar = r5eVar.e;
                                    q5e q5eVar = tgrVar != null ? new q5e(aafVar, tgrVar) : new q5e(aafVar, r5eVar.f);
                                    try {
                                        e48Var.execute(q5eVar);
                                        return;
                                    } catch (Throwable th2) {
                                        r5e.g.log(Level.SEVERE, "Failed to execute PingCallback", th2);
                                        return;
                                    }
                                } finally {
                                }
                            }
                        } finally {
                        }
                    }
                }
                return;
        }
    }
}
