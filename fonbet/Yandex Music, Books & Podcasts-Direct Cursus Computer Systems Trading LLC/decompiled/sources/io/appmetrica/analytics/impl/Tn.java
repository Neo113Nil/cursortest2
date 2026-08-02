package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import defpackage.u75;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class Tn {
    public final P5 a;
    public final Rn b;
    public final O5 c;
    public final AbstractC0273g d;
    public final AbstractC0273g e;
    public En f;
    public int g = 0;

    public Tn(P5 p5, Rn rn, O5 o5, C0574qb c0574qb, C0479n3 c0479n3) {
        this.a = p5;
        this.c = o5;
        this.d = c0574qb;
        this.e = c0479n3;
        this.b = rn;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x012e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00f4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(En en, H6 h6) {
        boolean z;
        boolean z2;
        boolean z3;
        if (en == null) {
            return false;
        }
        long j = h6.i;
        boolean z4 = en.d >= 0;
        if (en.h == null) {
            synchronized (en) {
                if (en.h == null) {
                    try {
                        String asString = en.a.e.a(en.d, en.c.a).getAsString("report_request_parameters");
                        if (!TextUtils.isEmpty(asString)) {
                            en.h = new Un(new JSONObject(asString));
                        }
                    } catch (Throwable unused) {
                    }
                }
            }
        }
        Un un = en.h;
        if (un != null) {
            Nj nj = (Nj) en.a.k.a();
            List h = u75.h(Boolean.valueOf(TextUtils.equals(nj.getAnalyticsSdkVersionName(), un.a)), Boolean.valueOf(TextUtils.equals(nj.getAnalyticsSdkBuildNumber(), un.b)), Boolean.valueOf(TextUtils.equals(nj.getAppVersion(), un.c)), Boolean.valueOf(TextUtils.equals(nj.getAppBuildNumber(), un.d)), Boolean.valueOf(TextUtils.equals(nj.getOsVersion(), un.e)), Boolean.valueOf(un.f == nj.getOsApiLevel()), Boolean.valueOf(un.g == nj.r));
            if (!(h instanceof Collection) || !h.isEmpty()) {
                Iterator it = h.iterator();
                while (it.hasNext()) {
                    if (!((Boolean) it.next()).booleanValue()) {
                    }
                }
            }
            z = true;
            long elapsedRealtime = en.k.elapsedRealtime();
            long j2 = en.i;
            z2 = elapsedRealtime >= j2;
            long j3 = j - j2;
            long j4 = j - en.e;
            if (!z2) {
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Hn hn = en.c;
                int i = ((Nj) en.a.k.a()).f;
                Integer num = hn.d;
                if (num != null) {
                    i = num.intValue();
                }
                if (j3 < timeUnit.toMillis(i) && j4 < timeUnit.toMillis(In.a)) {
                    z3 = false;
                    if (!z4 && z && !z3) {
                        return true;
                    }
                    b(en, h6);
                    return false;
                }
            }
            z3 = true;
            if (!z4) {
            }
            b(en, h6);
            return false;
        }
        z = false;
        long elapsedRealtime2 = en.k.elapsedRealtime();
        long j22 = en.i;
        if (elapsedRealtime2 >= j22) {
        }
        long j32 = j - j22;
        long j42 = j - en.e;
        if (!z2) {
        }
        z3 = true;
        if (!z4) {
        }
        b(en, h6);
        return false;
    }

    public final synchronized En b(H6 h6) {
        try {
            if (this.g == 0) {
                En b = this.d.b();
                if (a(b, h6)) {
                    this.f = b;
                    this.g = 3;
                } else {
                    En b2 = this.e.b();
                    if (a(b2, h6)) {
                        this.f = b2;
                        this.g = 2;
                    } else {
                        this.f = null;
                        this.g = 1;
                    }
                }
            }
            if (this.g != 1 && !a(this.f, h6)) {
                this.g = 1;
                this.f = null;
            }
            int a = D8.a(this.g);
            if (a == 1) {
                En en = this.f;
                long j = h6.i;
                en.i = j;
                Wn wn = en.b;
                wn.a(Wn.d, Long.valueOf(j));
                wn.b();
                return this.f;
            }
            if (a == 2) {
                return this.f;
            }
            this.a.m.info("Start background session", new Object[0]);
            this.g = 2;
            long j2 = h6.i;
            AbstractC0273g abstractC0273g = this.e;
            Fn fn = new Fn(j2, h6.j);
            abstractC0273g.getClass();
            En a2 = abstractC0273g.a(fn);
            if (this.a.t.c()) {
                O5 o5 = this.c;
                o5.a.n.a(H6.a(h6, C0747wb.I.i()), a(a2, h6.i));
            } else {
                int i = h6.d;
                EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_UNDEFINED;
                if (i == 6145) {
                    O5 o52 = this.c;
                    o52.a.n.a(h6, a(a2, j2));
                    O5 o53 = this.c;
                    o53.a.n.a(H6.a(h6, C0747wb.I.i()), a(a2, j2));
                }
            }
            this.f = a2;
            return a2;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void c(H6 h6) {
        try {
            if (this.g == 0) {
                En b = this.d.b();
                if (a(b, h6)) {
                    this.f = b;
                    this.g = 3;
                } else {
                    En b2 = this.e.b();
                    if (a(b2, h6)) {
                        this.f = b2;
                        this.g = 2;
                    } else {
                        this.f = null;
                        this.g = 1;
                    }
                }
            }
            int a = D8.a(this.g);
            if (a == 0) {
                this.f = a(h6);
            } else if (a == 1) {
                b(this.f, h6);
                this.f = a(h6);
            } else if (a == 2) {
                if (a(this.f, h6)) {
                    En en = this.f;
                    long j = h6.i;
                    en.i = j;
                    Wn wn = en.b;
                    wn.a(Wn.d, Long.valueOf(j));
                    wn.b();
                } else {
                    this.f = a(h6);
                }
            }
        } finally {
        }
    }

    public final void b(En en, H6 h6) {
        if (en.g && en.d > 0) {
            O5 o5 = this.c;
            H6 a = H6.a(h6, EnumC0603rc.EVENT_TYPE_ALIVE);
            Vn vn = new Vn();
            vn.a = en.d;
            vn.d = en.c.a;
            long andIncrement = en.f.getAndIncrement();
            Wn wn = en.b;
            wn.a(Wn.g, Long.valueOf(en.f.get()));
            wn.b();
            vn.b = andIncrement;
            vn.c = Math.max(en.i - en.e, en.j) / 1000;
            o5.a.n.a(a, vn);
            if (en.g) {
                en.g = false;
                Wn wn2 = en.b;
                wn2.a(Wn.i, Boolean.FALSE);
                wn2.b();
            }
        }
        PublicLogger publicLogger = this.a.m;
        int ordinal = en.c.a.ordinal();
        if (ordinal == 0) {
            publicLogger.info("Finish foreground session", new Object[0]);
        } else if (ordinal == 1) {
            publicLogger.info("Finish background session", new Object[0]);
        }
        synchronized (en) {
            Wn wn3 = en.b;
            wn3.getClass();
            wn3.c = new Ec();
            wn3.b();
            en.h = null;
        }
    }

    public final En a(H6 h6) {
        this.a.m.info("Start foreground session", new Object[0]);
        long j = h6.i;
        AbstractC0273g abstractC0273g = this.d;
        Fn fn = new Fn(j, h6.j);
        abstractC0273g.getClass();
        En a = abstractC0273g.a(fn);
        this.g = 3;
        ((C0165c6) this.a.p).e();
        O5 o5 = this.c;
        o5.a.n.a(H6.a(h6, C0747wb.I.i()), a(a, j));
        return a;
    }

    public static Vn a(En en, long j) {
        Vn vn = new Vn();
        vn.a = en.d;
        long andIncrement = en.f.getAndIncrement();
        Wn wn = en.b;
        wn.a(Wn.g, Long.valueOf(en.f.get()));
        wn.b();
        vn.b = andIncrement;
        Wn wn2 = en.b;
        long j2 = j - en.e;
        en.j = j2;
        wn2.a(Wn.e, Long.valueOf(j2));
        vn.c = en.j / 1000;
        vn.d = en.c.a;
        return vn;
    }

    public final synchronized long a() {
        En en;
        en = this.f;
        return en == null ? 10000000000L : en.d - 1;
    }
}
