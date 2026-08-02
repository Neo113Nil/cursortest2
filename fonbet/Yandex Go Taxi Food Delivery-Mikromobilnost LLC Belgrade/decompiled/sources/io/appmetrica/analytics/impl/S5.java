package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes9.dex */
public class S5 implements InterfaceC0562nc, InterfaceC0302ec, Wj {
    public final Context a;
    public final K5 b;
    public final Ih c;
    public final Lh d;
    public final I7 e;
    public final C0513ll f;
    public final C0531ma g;
    public final C0608p0 h;
    public final C0637q0 i;
    public final C0574no j;
    public final C0916zj k;
    public final C0214ba l;
    public final PublicLogger m;
    public final C0907za n;
    public final M5 o;
    public final Fa p;
    public final C0323f4 q;
    public final TimePassedChecker r;
    public final C0337fi s;
    public final as t;
    public final Cdo u;
    public final C0265d3 v;

    public S5(Context context, K5 k5, C0637q0 c0637q0, TimePassedChecker timePassedChecker, X5 x5, C0439j5 c0439j5) {
        this.a = context.getApplicationContext();
        this.b = k5;
        this.i = c0637q0;
        this.r = timePassedChecker;
        as f = x5.f();
        this.t = f;
        this.s = Jb.k().t();
        Ih a = x5.e().a();
        this.c = a;
        this.v = x5.a(a);
        C0916zj a2 = x5.a(this);
        this.k = a2;
        PublicLogger a3 = x5.d().a();
        this.m = a3;
        this.d = Jb.k().y();
        C0608p0 a4 = c0637q0.a(k5, a3, a);
        this.h = a4;
        this.l = x5.a();
        I7 b = x5.b(this);
        this.e = b;
        C0571nl d = x5.d(this);
        this.o = X5.b();
        x();
        C0574no a5 = X5.a(this, f, new R5(this));
        this.j = a5;
        a3.info("Read app environment for component %s. Value: %s", k5.toString(), a4.a().a);
        Cdo c = x5.c();
        this.u = c;
        this.n = x5.a(a, f, a5, b, a4, c, d);
        C0531ma c2 = X5.c(this);
        this.g = c2;
        this.f = X5.a(this, c2);
        this.q = x5.b(a);
        this.p = x5.a(d, b, a2, c0439j5, k5, a);
    }

    public final void A() {
        C0916zj c0916zj = this.k;
        synchronized (c0916zj) {
            c0916zj.a = null;
        }
    }

    public final boolean B() {
        Xj xj = (Xj) this.k.a();
        return xj.n && this.r.didTimePassSeconds(this.n.k, xj.t, "should force send permissions");
    }

    public final boolean C() {
        Bp bp;
        C0337fi c0337fi = this.s;
        c0337fi.h.a(c0337fi.a);
        boolean z = ((C0251ci) c0337fi.c()).d;
        C0916zj c0916zj = this.k;
        synchronized (c0916zj) {
            bp = c0916zj.c.a;
        }
        return !(z && bp.r);
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0562nc
    public synchronized void a(C0439j5 c0439j5) {
        long j;
        try {
            this.k.a(c0439j5);
            boolean z = false;
            if (Boolean.TRUE.equals(c0439j5.h)) {
                this.m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c0439j5.h)) {
                    this.m.setEnabled(false);
                }
            }
            C0265d3 c0265d3 = this.v;
            Set<String> set = c0439j5.o;
            long currentTimeMillis = c0265d3.d.currentTimeMillis();
            boolean z2 = false;
            for (String str : set) {
                Long l = (Long) c0265d3.e.get(str);
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                    z2 = true;
                }
                if (currentTimeMillis - j > c0265d3.b) {
                    c0265d3.e.put(str, Long.valueOf(currentTimeMillis));
                    z = true;
                }
            }
            if (z) {
                c0265d3.a(c0265d3.e);
                c0265d3.a.a(c0265d3.e);
            }
            if (z2) {
                this.k.e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(K6 k6) {
        this.h.a(k6.f);
        C0579o0 a = this.h.a();
        C0637q0 c0637q0 = this.i;
        Ih ih = this.c;
        synchronized (c0637q0) {
            if (a.b > ih.d().b) {
                ih.a(a);
                this.m.info("Save new app environment for %s. Value: %s", this.b, a.a);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void e() {
        C0608p0 c0608p0 = this.h;
        synchronized (c0608p0) {
            c0608p0.a = new Ae();
        }
        this.i.a(this.h.a(), this.c);
    }

    public final synchronized void f() {
        ((C0325f6) this.p).d();
    }

    public final C0265d3 g() {
        return this.v;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final Context getContext() {
        return this.a;
    }

    public final C0323f4 h() {
        return this.q;
    }

    public final Ih i() {
        return this.c;
    }

    public final I7 j() {
        return this.e;
    }

    public final C0214ba k() {
        return this.l;
    }

    public final C0531ma l() {
        return this.g;
    }

    public final C0907za m() {
        return this.n;
    }

    public final Fa n() {
        return this.p;
    }

    public final Xj o() {
        return (Xj) this.k.a();
    }

    public final String p() {
        return this.c.j();
    }

    public final PublicLogger q() {
        return this.m;
    }

    public final Lh r() {
        return this.d;
    }

    public final Cdo s() {
        return this.u;
    }

    public final C0574no t() {
        return this.j;
    }

    public final Bp u() {
        Bp bp;
        C0916zj c0916zj = this.k;
        synchronized (c0916zj) {
            bp = c0916zj.c.a;
        }
        return bp;
    }

    public final as v() {
        return this.t;
    }

    public final void w() {
        C0907za c0907za = this.n;
        int i = c0907za.j;
        c0907za.l = i;
        c0907za.a.a(i);
    }

    public final void x() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        as asVar = this.t;
        synchronized (asVar) {
            optInt = asVar.a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.o.getClass();
            Iterator it = Collections.singletonList(new O5(this)).iterator();
            while (it.hasNext()) {
                ((N5) it.next()).a(optInt);
            }
            this.t.c(libraryApiLevel);
        }
    }

    public final boolean y() {
        Xj xj = (Xj) this.k.a();
        return xj.n && xj.isIdentifiersValid() && this.r.didTimePassSeconds(this.n.k, xj.s, "need to check permissions");
    }

    public final boolean z() {
        C0907za c0907za = this.n;
        return c0907za.l < c0907za.j && ((Xj) this.k.a()).o && ((Xj) this.k.a()).isIdentifiersValid();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final void b() {
        bs bsVar = this.t.a;
        bs.a(bsVar.a);
        bs.a(bsVar.b);
        this.e.j.b.flushAsync();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0562nc
    public final void a(K6 k6) {
        String a = Ei.a("Event received on service", Hc.a(k6.d), k6.getName(), k6.getValue());
        if (a != null) {
            this.m.info(a, new Object[0]);
        }
        String str = this.b.b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f.a(k6, new C0484kl());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0562nc, io.appmetrica.analytics.impl.InterfaceC0517lp
    public final void a(EnumC0315ep enumC0315ep, Bp bp) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0302ec
    public final K5 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0562nc, io.appmetrica.analytics.impl.InterfaceC0517lp
    public final synchronized void a(Bp bp) {
        this.k.a(bp);
        ((C0325f6) this.p).e();
    }

    public final void a(String str) {
        this.c.j(str).a.flushAsync();
    }

    public S5(Context context, Bp bp, K5 k5, C0439j5 c0439j5, Uj uj, Q5 q5) {
        this(context, k5, new C0637q0(), new TimePassedChecker(), new X5(context, k5, c0439j5, q5, bp, uj, Jb.k().w().e(), PackageManagerUtils.getAppVersionCodeInt(context), Jb.k().l(), new J5()), c0439j5);
    }
}
