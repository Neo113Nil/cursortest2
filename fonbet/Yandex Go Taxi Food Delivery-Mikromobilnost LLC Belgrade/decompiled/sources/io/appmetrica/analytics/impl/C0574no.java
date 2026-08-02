package io.appmetrica.analytics.impl;

import defpackage.jl40;
import defpackage.scc;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.no, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0574no {
    public final S5 a;
    public final R5 b;
    public final InterfaceC0706sc c;
    public final InterfaceC0706sc d;
    public final InterfaceC0706sc e;
    public Wn f;
    public int g = 0;
    public Long h = null;

    public C0574no(S5 s5, R5 r5, Ab ab, C0553n3 c0553n3, C0487ko c0487ko) {
        this.a = s5;
        this.b = r5;
        this.c = ab;
        this.d = c0553n3;
        this.e = c0487ko;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0104 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Wn wn, K6 k6) {
        boolean z;
        boolean z2;
        boolean z3;
        if (wn == null) {
            return false;
        }
        long j = k6.i;
        long j2 = wn.d;
        boolean z4 = j2 >= 0;
        C0603oo a = wn.a.e.a(j2, wn.c.a);
        if (a != null) {
            Xj xj = (Xj) wn.a.k.a();
            List g = scc.g(Boolean.valueOf(jl40.l(xj.getAnalyticsSdkVersionName(), a.n)), Boolean.valueOf(jl40.l(xj.getAnalyticsSdkBuildNumber(), a.o)), Boolean.valueOf(jl40.l(xj.getAppVersion(), a.d)), Boolean.valueOf(jl40.l(xj.getAppBuildNumber(), a.e)), Boolean.valueOf(jl40.l(xj.getOsVersion(), a.g)), Boolean.valueOf(a.h == xj.getOsApiLevel()), Boolean.valueOf(a.m == xj.r));
            if (!(g instanceof Collection) || !g.isEmpty()) {
                Iterator it = g.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z = true;
            long elapsedRealtime = wn.l.elapsedRealtime();
            long j3 = wn.i;
            z2 = elapsedRealtime >= j3;
            long j4 = j - j3;
            long j5 = j - wn.e;
            if (!z2) {
                Zn zn = wn.c;
                int i = ((Xj) wn.a.k.a()).f;
                Integer num = zn.e;
                if (num != null) {
                    i = num.intValue();
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (j4 < timeUnit.toMillis(i) && j5 < timeUnit.toMillis(AbstractC0199ao.a)) {
                    z3 = false;
                    if (!z4 && z && !z3 && !wn.k) {
                        return true;
                    }
                    b(wn, k6);
                    return false;
                }
            }
            z3 = true;
            if (!z4) {
            }
            b(wn, k6);
            return false;
        }
        z = false;
        long elapsedRealtime2 = wn.l.elapsedRealtime();
        long j32 = wn.i;
        if (elapsedRealtime2 >= j32) {
        }
        long j42 = j - j32;
        long j52 = j - wn.e;
        if (!z2) {
        }
        z3 = true;
        if (!z4) {
        }
        b(wn, k6);
        return false;
    }

    public final synchronized Wn b(K6 k6) {
        try {
            d(k6);
            if (this.g != 1 && !a(this.f, k6)) {
                this.g = 1;
                this.f = null;
            }
            int a = I8.a(this.g);
            if (a == 1) {
                Wn wn = this.f;
                long j = k6.i;
                wn.i = j;
                C0689ro c0689ro = wn.b;
                c0689ro.a(C0689ro.d, Long.valueOf(j));
                c0689ro.a();
                return this.f;
            }
            if (a == 2) {
                return this.f;
            }
            this.a.m.info("Start background session", new Object[0]);
            this.g = 2;
            long j2 = k6.i;
            Wn a2 = this.d.a(new Xn(j2, k6.j, null));
            a(a2.d);
            if (this.a.t.c()) {
                R5 r5 = this.b;
                r5.a.n.a(K6.a(k6, Jb.I.i()), a(a2, k6.i));
            } else {
                int i = k6.d;
                Hc hc = Hc.EVENT_TYPE_UNDEFINED;
                if (i == 6145) {
                    R5 r52 = this.b;
                    r52.a.n.a(k6, a(a2, j2));
                    R5 r53 = this.b;
                    r53.a.n.a(K6.a(k6, Jb.I.i()), a(a2, j2));
                }
            }
            this.f = a2;
            return a2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(K6 k6) {
        try {
            d(k6);
            int a = I8.a(this.g);
            if (a == 0) {
                this.f = a(k6);
            } else if (a == 1) {
                b(this.f, k6);
                this.f = a(k6);
            } else if (a == 2) {
                if (a(this.f, k6)) {
                    Wn wn = this.f;
                    long j = k6.i;
                    wn.i = j;
                    C0689ro c0689ro = wn.b;
                    c0689ro.a(C0689ro.d, Long.valueOf(j));
                    c0689ro.a();
                } else {
                    this.f = a(k6);
                }
            }
        } finally {
        }
    }

    public final void d(K6 k6) {
        if (this.g == 0) {
            Wn a = this.c.a();
            if (a != null) {
                a(a.d);
            }
            if (a(a, k6)) {
                this.f = a;
                this.g = 3;
                return;
            }
            Wn a2 = this.d.a();
            if (a2 != null) {
                a(a2.d);
            }
            if (a(a2, k6)) {
                this.f = a2;
                this.g = 2;
            } else {
                this.f = null;
                this.g = 1;
            }
        }
    }

    public final void b(Wn wn, K6 k6) {
        if (wn.h && wn.d > 0) {
            R5 r5 = this.b;
            K6 a = K6.a(k6, Hc.EVENT_TYPE_ALIVE);
            C0661qo c0661qo = new C0661qo();
            c0661qo.a = wn.d;
            c0661qo.d = wn.c.a;
            long andIncrement = wn.g.getAndIncrement();
            C0689ro c0689ro = wn.b;
            c0689ro.a(C0689ro.g, Long.valueOf(wn.g.get()));
            c0689ro.a();
            c0661qo.b = andIncrement;
            c0661qo.c = Math.max(wn.i - wn.e, wn.j) / 1000;
            r5.a.n.a(a, c0661qo);
            if (wn.h) {
                wn.h = false;
                C0689ro c0689ro2 = wn.b;
                c0689ro2.a(C0689ro.j, Boolean.FALSE);
                c0689ro2.a();
            }
        }
        PublicLogger publicLogger = this.a.m;
        int ordinal = wn.c.a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (wn) {
            C0689ro c0689ro3 = wn.b;
            c0689ro3.getClass();
            c0689ro3.c = new Uc();
            c0689ro3.a();
        }
    }

    public final void a(long j) {
        Long l = this.h;
        if (l == null || j < l.longValue()) {
            this.h = Long.valueOf(j);
        }
    }

    public final Wn a(K6 k6) {
        this.a.m.info("Start foreground session", new Object[0]);
        long j = k6.i;
        Wn a = this.c.a(new Xn(j, k6.j, null));
        a(a.d);
        this.g = 3;
        ((C0325f6) this.a.p).e();
        R5 r5 = this.b;
        r5.a.n.a(K6.a(k6, Jb.I.i()), a(a, j));
        return a;
    }

    public final synchronized long a() {
        Long l;
        l = this.h;
        return l != null ? l.longValue() : 10000000000L;
    }

    public static C0661qo a(Wn wn, long j) {
        C0661qo c0661qo = new C0661qo();
        c0661qo.a = wn.d;
        long andIncrement = wn.g.getAndIncrement();
        C0689ro c0689ro = wn.b;
        c0689ro.a(C0689ro.g, Long.valueOf(wn.g.get()));
        c0689ro.a();
        c0661qo.b = andIncrement;
        C0689ro c0689ro2 = wn.b;
        long j2 = j - wn.e;
        wn.j = j2;
        c0689ro2.a(C0689ro.e, Long.valueOf(j2));
        c0689ro2.a();
        c0661qo.c = wn.j / 1000;
        c0661qo.d = wn.c.a;
        return c0661qo;
    }
}
