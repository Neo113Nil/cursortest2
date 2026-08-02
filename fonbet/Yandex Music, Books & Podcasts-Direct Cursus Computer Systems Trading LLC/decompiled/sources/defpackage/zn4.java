package defpackage;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class zn4 extends vn4 {
    public static final Logger q = Logger.getLogger(zn4.class.getName());
    public static final double r;
    public final k3i a;
    public final Executor b;
    public final boolean c;
    public final kkp d;
    public final we6 e;
    public volatile ScheduledFuture f;
    public final boolean g;
    public ks3 h;
    public mo4 i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public final u76 m;
    public final ScheduledExecutorService o;
    public final bnd n = new bnd(14, this);
    public ch7 p = ch7.d;

    static {
        "gzip".getBytes(Charset.forName("US-ASCII"));
        r = 1000000000 * 1.0d;
    }

    public zn4(k3i k3iVar, Executor executor, ks3 ks3Var, u76 u76Var, ScheduledExecutorService scheduledExecutorService, kkp kkpVar) {
        ms5 ms5Var = ms5.b;
        this.a = k3iVar;
        String str = k3iVar.b;
        System.identityHashCode(this);
        jkk.a.getClass();
        if (executor == e48.a) {
            this.b = new aip();
            this.c = true;
        } else {
            this.b = new sip(executor);
            this.c = false;
        }
        this.d = kkpVar;
        this.e = we6.z();
        j3i j3iVar = k3iVar.a;
        this.g = j3iVar == j3i.a || j3iVar == j3i.c;
        this.h = ks3Var;
        this.m = u76Var;
        this.o = scheduledExecutorService;
    }

    @Override // defpackage.vn4
    public final void a(String str, Throwable th) {
        jkk.c();
        try {
            jkk.a();
            g(str, th);
            jkk.a.getClass();
        } catch (Throwable th2) {
            try {
                jkk.a.getClass();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    @Override // defpackage.vn4
    public final void b() {
        jkk.c();
        try {
            jkk.a();
            o2g.U("Not started", this.i != null);
            o2g.U("call was cancelled", !this.k);
            o2g.U("call already half-closed", !this.l);
            this.l = true;
            this.i.l0();
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vn4
    public final boolean c() {
        if (this.l) {
            return false;
        }
        return this.i.p();
    }

    @Override // defpackage.vn4
    public final void d() {
        jkk.c();
        try {
            jkk.a();
            o2g.U("Not started", this.i != null);
            this.i.a();
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vn4
    public final void e(Object obj) {
        jkk.c();
        try {
            jkk.a();
            i(obj);
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.vn4
    public final void f(bg3 bg3Var, s2i s2iVar) {
        jkk.c();
        try {
            jkk.a();
            j(bg3Var, s2iVar);
            jkk.a.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void g(String str, Throwable th) {
        if (str == null && th == null) {
            th = new CancellationException("Cancelled without a message or cause");
            q.log(Level.WARNING, "Cancelling without a message or cause is suboptimal", th);
        }
        if (this.k) {
            return;
        }
        this.k = true;
        try {
            if (this.i != null) {
                sgr sgrVar = sgr.f;
                sgr i = str != null ? sgrVar.i(str) : sgrVar.i("Call cancelled without message");
                if (th != null) {
                    i = i.h(th);
                }
                this.i.f(i);
            }
            h();
        } catch (Throwable th2) {
            h();
            throw th2;
        }
    }

    public final void h() {
        this.e.N(this.n);
        ScheduledFuture scheduledFuture = this.f;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
    }

    public final void i(Object obj) {
        o2g.U("Not started", this.i != null);
        o2g.U("call was cancelled", !this.k);
        o2g.U("call was half-closed", !this.l);
        try {
            mo4 mo4Var = this.i;
            if (mo4Var instanceof x7h) {
                ((x7h) mo4Var).k(obj);
            } else {
                sym symVar = this.a.d;
                symVar.getClass();
                mo4Var.E(new rym((vzh) obj, symVar.a));
            }
            if (this.g) {
                return;
            }
            this.i.flush();
        } catch (Error e) {
            this.i.f(sgr.f.i("Client sendMessage() failed with Error"));
            throw e;
        } catch (RuntimeException e2) {
            this.i.f(sgr.f.h(e2).i("Failed to stream message"));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:132:0x017b, code lost:
    
        if (r2.c(r7) != false) goto L68;
     */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(bg3 bg3Var, s2i s2iVar) {
        ce7 ce7Var;
        ce7 ce7Var2;
        Logger logger;
        u76 u76Var;
        mo4 x7hVar;
        Integer num;
        Integer num2;
        ks3 ks3Var;
        e3s e3sVar = e3s.b;
        lej lejVar = lej.a;
        boolean z = true;
        o2g.U("Already started", this.i == null);
        o2g.U("call was cancelled", !this.k);
        if (this.e.I()) {
            this.i = lejVar;
            this.b.execute(new wn4(this, bg3Var));
            return;
        }
        ks3 ks3Var2 = this.h;
        js3 js3Var = o8h.g;
        o8h o8hVar = (o8h) ks3Var2.a(js3Var);
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        if (o8hVar != null) {
            Integer num3 = o8hVar.d;
            Integer num4 = o8hVar.c;
            Long l = o8hVar.a;
            if (l != null) {
                long longValue = l.longValue();
                fs7 fs7Var = ce7.d;
                if (timeUnit == null) {
                    jj4.j("units");
                    return;
                }
                ce7 ce7Var3 = new ce7(fs7Var, longValue);
                ce7 ce7Var4 = this.h.a;
                if (ce7Var4 == null || ce7Var3.compareTo(ce7Var4) < 0) {
                    ks3 ks3Var3 = this.h;
                    ks3Var3.getClass();
                    eps b = ks3.b(ks3Var3);
                    b.a = ce7Var3;
                    this.h = new ks3(b);
                }
            }
            Boolean bool = o8hVar.b;
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                ks3 ks3Var4 = this.h;
                ks3Var4.getClass();
                if (booleanValue) {
                    eps b2 = ks3.b(ks3Var4);
                    b2.e = Boolean.TRUE;
                    ks3Var = new ks3(b2);
                } else {
                    eps b3 = ks3.b(ks3Var4);
                    b3.e = Boolean.FALSE;
                    ks3Var = new ks3(b3);
                }
                this.h = ks3Var;
            }
            if (num4 != null) {
                ks3 ks3Var5 = this.h;
                Integer num5 = ks3Var5.f;
                if (num5 != null) {
                    int min = Math.min(num5.intValue(), num4.intValue());
                    o2g.G(min, "invalid maxsize %s", min >= 0);
                    eps b4 = ks3.b(ks3Var5);
                    b4.f = Integer.valueOf(min);
                    this.h = new ks3(b4);
                } else {
                    int intValue = num4.intValue();
                    o2g.G(intValue, "invalid maxsize %s", intValue >= 0);
                    eps b5 = ks3.b(ks3Var5);
                    b5.f = num4;
                    this.h = new ks3(b5);
                }
            }
            if (num3 != null) {
                ks3 ks3Var6 = this.h;
                Integer num6 = ks3Var6.g;
                if (num6 != null) {
                    int min2 = Math.min(num6.intValue(), num3.intValue());
                    o2g.G(min2, "invalid maxsize %s", min2 >= 0);
                    eps b6 = ks3.b(ks3Var6);
                    b6.g = Integer.valueOf(min2);
                    this.h = new ks3(b6);
                } else {
                    int intValue2 = num3.intValue();
                    o2g.G(intValue2, "invalid maxsize %s", intValue2 >= 0);
                    eps b7 = ks3.b(ks3Var6);
                    b7.g = num3;
                    this.h = new ks3(b7);
                }
            }
        }
        this.h.getClass();
        ch7 ch7Var = this.p;
        s2iVar.a(xqd.i);
        s2iVar.a(xqd.e);
        o2i o2iVar = xqd.f;
        s2iVar.a(o2iVar);
        byte[] bArr = ch7Var.b;
        if (bArr.length != 0) {
            s2iVar.g(o2iVar, bArr);
        }
        s2iVar.a(xqd.g);
        s2iVar.a(xqd.h);
        ce7 ce7Var5 = this.h.a;
        ce7 H = this.e.H();
        if (ce7Var5 != null) {
            if (H != null) {
                ce7Var5.a(H);
            }
            ce7Var = ce7Var5;
            if (ce7Var == null && ce7Var.d()) {
                qo4[] c = xqd.c(this.h, s2iVar, 0, false);
                ce7 ce7Var6 = this.h.a;
                ce7 H2 = this.e.H();
                if (ce7Var6 == null) {
                    z = false;
                } else if (H2 != null) {
                    z = ce7Var6.c(H2);
                }
                String str = z ? "CallOptions" : "Context";
                Long l2 = (Long) this.h.a(qo4.a);
                double e = ce7Var.e();
                double d = r;
                this.i = new r4c(sgr.i.i(String.format("ClientCall started after %s deadline was exceeded %.9f seconds ago. Name resolution delay %.9f seconds.", str, Double.valueOf(e / d), Double.valueOf(l2 == null ? 0.0d : l2.longValue() / d))), no4.a, c);
            } else {
                ce7 H3 = this.e.H();
                ce7Var2 = this.h.a;
                logger = q;
                if (logger.isLoggable(Level.FINE) && ce7Var != null && ce7Var.equals(H3)) {
                    long max = Math.max(0L, ce7Var.e());
                    Locale locale = Locale.US;
                    StringBuilder sb = new StringBuilder(dfi.e(max, "Call timeout set to '", "' ns, due to context deadline."));
                    if (ce7Var2 != null) {
                        sb.append(" Explicit call timeout was not set.");
                    } else {
                        sb.append(" Explicit call timeout was '" + ce7Var2.e() + "' ns.");
                    }
                    logger.fine(sb.toString());
                }
                u76Var = this.m;
                k3i k3iVar = this.a;
                ks3 ks3Var7 = this.h;
                we6 we6Var = this.e;
                if (((j8h) u76Var.a).W) {
                    ro4 h = u76Var.h(new dsk(k3iVar, s2iVar, ks3Var7));
                    we6 b8 = we6Var.b();
                    try {
                        x7hVar = h.f(k3iVar, s2iVar, ks3Var7, xqd.c(ks3Var7, s2iVar, 0, false));
                    } finally {
                        we6Var.D(b8);
                    }
                } else {
                    o8h o8hVar2 = (o8h) ks3Var7.a(js3Var);
                    x7hVar = new x7h(u76Var, k3iVar, s2iVar, ks3Var7, o8hVar2 == null ? null : o8hVar2.e, o8hVar2 != null ? o8hVar2.f : null, we6Var);
                }
                this.i = x7hVar;
            }
            if (this.c) {
                this.i.X();
            }
            this.h.getClass();
            num = this.h.f;
            if (num != null) {
                this.i.M(num.intValue());
            }
            num2 = this.h.g;
            if (num2 != null) {
                this.i.l(num2.intValue());
            }
            if (ce7Var != null) {
                this.i.h0(ce7Var);
            }
            this.i.r(e3sVar);
            this.i.a0(this.p);
            kkp kkpVar = this.d;
            ((uug) kkpVar.c).i();
            ((hs4) kkpVar.b).x();
            mo4 mo4Var = this.i;
            osh oshVar = new osh();
            oshVar.c = this;
            oshVar.a = bg3Var;
            mo4Var.v0(oshVar);
            this.e.a(this.n);
            if (ce7Var != null && !ce7Var.equals(this.e.H()) && this.o != null) {
                long e2 = ce7Var.e();
                this.f = this.o.schedule(new arg(new mh(this, e2)), e2, timeUnit);
            }
            if (this.j) {
                return;
            }
            h();
            return;
        }
        ce7Var = H;
        if (ce7Var == null) {
        }
        ce7 H32 = this.e.H();
        ce7Var2 = this.h.a;
        logger = q;
        if (logger.isLoggable(Level.FINE)) {
            long max2 = Math.max(0L, ce7Var.e());
            Locale locale2 = Locale.US;
            StringBuilder sb2 = new StringBuilder(dfi.e(max2, "Call timeout set to '", "' ns, due to context deadline."));
            if (ce7Var2 != null) {
            }
            logger.fine(sb2.toString());
        }
        u76Var = this.m;
        k3i k3iVar2 = this.a;
        ks3 ks3Var72 = this.h;
        we6 we6Var2 = this.e;
        if (((j8h) u76Var.a).W) {
        }
        this.i = x7hVar;
        if (this.c) {
        }
        this.h.getClass();
        num = this.h.f;
        if (num != null) {
        }
        num2 = this.h.g;
        if (num2 != null) {
        }
        if (ce7Var != null) {
        }
        this.i.r(e3sVar);
        this.i.a0(this.p);
        kkp kkpVar2 = this.d;
        ((uug) kkpVar2.c).i();
        ((hs4) kkpVar2.b).x();
        mo4 mo4Var2 = this.i;
        osh oshVar2 = new osh();
        oshVar2.c = this;
        oshVar2.a = bg3Var;
        mo4Var2.v0(oshVar2);
        this.e.a(this.n);
        if (ce7Var != null) {
            long e22 = ce7Var.e();
            this.f = this.o.schedule(new arg(new mh(this, e22)), e22, timeUnit);
        }
        if (this.j) {
        }
    }

    public final String toString() {
        z0j Y = ezf.Y(this);
        Y.q(this.a, "method");
        return Y.toString();
    }
}
