package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class f8h extends vn4 {
    public static final Logger o = Logger.getLogger(f8h.class.getName());
    public static final hv7 p = new hv7(0);
    public final ScheduledFuture a;
    public final Executor b;
    public final we6 c;
    public volatile boolean d;
    public bg3 e;
    public vn4 f;
    public sgr g;
    public List h;
    public jv7 i;
    public final we6 j;
    public final k3i k;
    public final ks3 l;
    public final long m;
    public final /* synthetic */ g8h n;

    public f8h(g8h g8hVar, we6 we6Var, k3i k3iVar, ks3 ks3Var) {
        ScheduledFuture<?> schedule;
        this.n = g8hVar;
        j8h j8hVar = g8hVar.d;
        Logger logger = j8h.c0;
        Executor executor = ks3Var.b;
        executor = executor == null ? j8hVar.h : executor;
        h8h h8hVar = j8hVar.g;
        ce7 ce7Var = ks3Var.a;
        this.h = new ArrayList();
        o2g.O(executor, "callExecutor");
        this.b = executor;
        o2g.O(h8hVar, "scheduler");
        we6 z = we6.z();
        this.c = z;
        ce7 H = z.H();
        if (ce7Var == null && H == null) {
            schedule = null;
        } else {
            long e = ce7Var != null ? ce7Var.e() : Long.MAX_VALUE;
            if (H != null && H.e() < e) {
                e = H.e();
                Level level = Level.FINE;
                Logger logger2 = o;
                if (logger2.isLoggable(level)) {
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(dfi.e(e, "Call timeout set to '", "' ns, due to context deadline."));
                    if (ce7Var == null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(" Explicit call timeout was '" + ce7Var.e() + "' ns.");
                    }
                    logger2.fine(sb.toString());
                }
            }
            long abs = Math.abs(e) / 1000000000;
            long abs2 = Math.abs(e) % 1000000000;
            StringBuilder sb2 = new StringBuilder();
            String str = ce7Var == null ? true : H == null ? false : H.c(ce7Var) ? "Context" : "CallOptions";
            if (e < 0) {
                sb2.append("ClientCall started after ");
                sb2.append(str);
                sb2.append(" deadline was exceeded. Deadline has been exceeded for ");
            } else {
                sb2.append("Deadline ");
                sb2.append(str);
                sb2.append(" will be exceeded in ");
            }
            sb2.append(abs);
            sb2.append(String.format(Locale.US, ".%09d", Long.valueOf(abs2)));
            sb2.append("s. ");
            schedule = h8hVar.a.schedule(new x8x(this, sb2, false, 19), e, TimeUnit.NANOSECONDS);
        }
        this.a = schedule;
        this.j = we6Var;
        this.k = k3iVar;
        this.l = ks3Var;
        j8hVar.X.getClass();
        this.m = System.nanoTime();
    }

    @Override // defpackage.vn4
    public final void a(String str, Throwable th) {
        sgr sgrVar = sgr.f;
        sgr i = str != null ? sgrVar.i(str) : sgrVar.i("Call cancelled without message");
        if (th != null) {
            i = i.h(th);
        }
        g(i, false);
    }

    @Override // defpackage.vn4
    public final void b() {
        h(new gv7(this, 1));
    }

    @Override // defpackage.vn4
    public final boolean c() {
        if (this.d) {
            return this.f.c();
        }
        return false;
    }

    @Override // defpackage.vn4
    public final void d() {
        if (this.d) {
            this.f.d();
        } else {
            h(new gv7(this, 0));
        }
    }

    @Override // defpackage.vn4
    public final void e(Object obj) {
        if (this.d) {
            this.f.e(obj);
        } else {
            h(new x8x(this, obj, false, 21));
        }
    }

    @Override // defpackage.vn4
    public final void f(bg3 bg3Var, s2i s2iVar) {
        sgr sgrVar;
        boolean z;
        o2g.U("already started", this.e == null);
        synchronized (this) {
            try {
                this.e = bg3Var;
                sgrVar = this.g;
                z = this.d;
                if (!z) {
                    jv7 jv7Var = new jv7(bg3Var);
                    this.i = jv7Var;
                    bg3Var = jv7Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sgrVar != null) {
            this.b.execute(new iv7(this, bg3Var, sgrVar));
        } else if (z) {
            this.f.f(bg3Var, s2iVar);
        } else {
            h(new nud(3, this, bg3Var, s2iVar));
        }
    }

    public final void g(sgr sgrVar, boolean z) {
        bg3 bg3Var;
        synchronized (this) {
            try {
                vn4 vn4Var = this.f;
                boolean z2 = true;
                if (vn4Var == null) {
                    hv7 hv7Var = p;
                    if (vn4Var != null) {
                        z2 = false;
                    }
                    o2g.S(vn4Var, "realCall already set to %s", z2);
                    ScheduledFuture scheduledFuture = this.a;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.f = hv7Var;
                    bg3Var = this.e;
                    this.g = sgrVar;
                    z2 = false;
                } else if (z) {
                    return;
                } else {
                    bg3Var = null;
                }
                if (z2) {
                    h(new x8x(this, sgrVar, false, 20));
                } else {
                    if (bg3Var != null) {
                        this.b.execute(new iv7(this, bg3Var, sgrVar));
                    }
                    i();
                }
                this.n.d.m.execute(new gv7(this, 2));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Runnable runnable) {
        synchronized (this) {
            try {
                if (this.d) {
                    runnable.run();
                } else {
                    this.h.add(runnable);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        jv7 jv7Var;
        List list;
        List arrayList = new ArrayList();
        while (true) {
            synchronized (this) {
                if (this.h.isEmpty()) {
                    break;
                }
                list = this.h;
                this.h = arrayList;
            }
            if (jv7Var == null) {
                this.b.execute(new yn4(this, jv7Var));
                return;
            }
            return;
            list.clear();
            arrayList = list;
        }
        this.h = null;
        this.d = true;
        jv7Var = this.i;
        if (jv7Var == null) {
        }
    }

    public final void j() {
        yn4 yn4Var;
        we6 b = this.j.b();
        try {
            ks3 ks3Var = this.l;
            js3 js3Var = qo4.a;
            this.n.d.X.getClass();
            vn4 h = this.n.h(this.k, ks3Var.c(js3Var, Long.valueOf(System.nanoTime() - this.m)));
            synchronized (this) {
                try {
                    vn4 vn4Var = this.f;
                    if (vn4Var != null) {
                        yn4Var = null;
                    } else {
                        o2g.S(vn4Var, "realCall already set to %s", vn4Var == null);
                        ScheduledFuture scheduledFuture = this.a;
                        if (scheduledFuture != null) {
                            scheduledFuture.cancel(false);
                        }
                        this.f = h;
                        yn4Var = new yn4(this, this.c);
                    }
                } finally {
                }
            }
            j8h j8hVar = this.n.d;
            if (yn4Var == null) {
                j8hVar.m.execute(new gv7(this, 2));
                return;
            }
            Executor executor = this.l.b;
            if (executor == null) {
                executor = j8hVar.h;
            }
            executor.execute(new e8h(this, yn4Var, false, 1));
        } finally {
            this.j.D(b);
        }
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.f, "realCall");
        return Y.toString();
    }
}
