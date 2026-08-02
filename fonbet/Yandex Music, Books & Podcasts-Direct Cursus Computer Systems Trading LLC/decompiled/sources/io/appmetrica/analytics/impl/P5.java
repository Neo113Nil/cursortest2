package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import defpackage.t75;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes5.dex */
public class P5 implements InterfaceC0171cc, Pb, Mj {
    public final Context a;
    public final H5 b;
    public final C0637sh c;
    public final C0724vh d;
    public final E7 e;
    public final C0151bl f;
    public final C0255fa g;
    public final C0476n0 h;
    public final C0505o0 i;
    public final Tn j;
    public final C0668tj k;
    public final U9 l;
    public final PublicLogger m;
    public final C0630sa n;
    public final J5 o;
    public final InterfaceC0803ya p;
    public final C0134b4 q;
    public final TimePassedChecker r;
    public final Ph s;
    public final Hr t;
    public final Kn u;
    public final C0191d3 v;

    public P5(Context context, H5 h5, C0505o0 c0505o0, TimePassedChecker timePassedChecker, U5 u5, C0250f5 c0250f5) {
        this.a = context.getApplicationContext();
        this.b = h5;
        this.i = c0505o0;
        this.r = timePassedChecker;
        Hr f = u5.f();
        this.t = f;
        this.s = C0747wb.k().t();
        C0637sh a = u5.e().a();
        this.c = a;
        this.v = u5.a(a);
        C0668tj a2 = u5.a(this);
        this.k = a2;
        PublicLogger a3 = u5.d().a();
        this.m = a3;
        this.d = C0747wb.k().y();
        C0476n0 a4 = c0505o0.a(h5, a3, a);
        this.h = a4;
        this.l = u5.a();
        E7 b = u5.b(this);
        this.e = b;
        C0209dl d = u5.d(this);
        this.o = U5.b();
        x();
        Tn a5 = U5.a(this, f, new O5(this));
        this.j = a5;
        a3.info("Read app environment for component %s. Value: %s", h5.toString(), a4.a().a);
        Kn c = u5.c();
        this.u = c;
        this.n = u5.a(a, f, a5, b, a4, c, d);
        C0255fa c2 = U5.c(this);
        this.g = c2;
        this.f = U5.a(this, c2);
        this.q = u5.b(a);
        this.p = u5.a(d, b, a2, c0250f5, h5, a);
        b.d();
    }

    public final void A() {
        C0668tj c0668tj = this.k;
        synchronized (c0668tj) {
            c0668tj.a = null;
        }
    }

    public final boolean B() {
        Nj nj = (Nj) this.k.a();
        return nj.n && this.r.didTimePassSeconds(this.n.k, nj.t, "should force send permissions");
    }

    public final boolean C() {
        C0385jp c0385jp;
        Ph ph = this.s;
        ph.h.a(ph.a);
        boolean z = ((Mh) ph.c()).d;
        C0668tj c0668tj = this.k;
        synchronized (c0668tj) {
            c0385jp = c0668tj.c.a;
        }
        return !(z && c0385jp.r);
    }

    public void D() {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0171cc
    public synchronized void a(@NonNull C0250f5 c0250f5) {
        long j;
        try {
            this.k.a(c0250f5);
            boolean z = false;
            if (Boolean.TRUE.equals(c0250f5.h)) {
                this.m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c0250f5.h)) {
                    this.m.setEnabled(false);
                }
            }
            C0191d3 c0191d3 = this.v;
            Set<String> set = c0250f5.o;
            long currentTimeMillis = c0191d3.d.currentTimeMillis();
            boolean z2 = false;
            for (String str : set) {
                Long l = (Long) c0191d3.e.get(str);
                if (l != null) {
                    j = l.longValue();
                } else {
                    j = -1;
                    z2 = true;
                }
                if (currentTimeMillis - j > c0191d3.b) {
                    c0191d3.e.put(str, Long.valueOf(currentTimeMillis));
                    z = true;
                }
            }
            if (z) {
                c0191d3.a(c0191d3.e);
                c0191d3.a.a(c0191d3.e);
            }
            if (z2) {
                this.k.e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b(H6 h6) {
        this.h.a(h6.f);
        C0447m0 a = this.h.a();
        C0505o0 c0505o0 = this.i;
        C0637sh c0637sh = this.c;
        synchronized (c0505o0) {
            if (a.b > c0637sh.d().b) {
                c0637sh.a(a).b();
                this.m.info("Save new app environment for %s. Value: %s", this.b, a.a);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Pb
    @NonNull
    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void e() {
        C0476n0 c0476n0 = this.h;
        synchronized (c0476n0) {
            c0476n0.a = new C0432le();
        }
        this.i.a(this.h.a(), this.c);
    }

    public final synchronized void f() {
        ((C0165c6) this.p).d();
    }

    @NonNull
    public final C0191d3 g() {
        return this.v;
    }

    @Override // io.appmetrica.analytics.impl.Pb
    @NonNull
    public final Context getContext() {
        return this.a;
    }

    @NonNull
    public final C0134b4 h() {
        return this.q;
    }

    @NonNull
    public final C0637sh i() {
        return this.c;
    }

    @NonNull
    public final E7 j() {
        return this.e;
    }

    @NonNull
    public final U9 k() {
        return this.l;
    }

    @NonNull
    public final C0255fa l() {
        return this.g;
    }

    @NonNull
    public final C0630sa m() {
        return this.n;
    }

    @NonNull
    public final InterfaceC0803ya n() {
        return this.p;
    }

    @NonNull
    public final Nj o() {
        return (Nj) this.k.a();
    }

    public final String p() {
        return this.c.j();
    }

    @NonNull
    public final PublicLogger q() {
        return this.m;
    }

    @NonNull
    public final C0724vh r() {
        return this.d;
    }

    @NonNull
    public final Kn s() {
        return this.u;
    }

    @NonNull
    public final Tn t() {
        return this.j;
    }

    @NonNull
    public final C0385jp u() {
        C0385jp c0385jp;
        C0668tj c0668tj = this.k;
        synchronized (c0668tj) {
            c0385jp = c0668tj.c.a;
        }
        return c0385jp;
    }

    @NonNull
    public final Hr v() {
        return this.t;
    }

    public final void w() {
        C0630sa c0630sa = this.n;
        int i = c0630sa.j;
        c0630sa.l = i;
        c0630sa.a.a(i).b();
    }

    public final void x() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        Hr hr = this.t;
        synchronized (hr) {
            optInt = hr.a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.o.getClass();
            Iterator it = t75.c(new L5(this)).iterator();
            while (it.hasNext()) {
                ((K5) it.next()).a(optInt);
            }
            this.t.c(libraryApiLevel);
        }
    }

    public final boolean y() {
        Nj nj = (Nj) this.k.a();
        return nj.n && nj.isIdentifiersValid() && this.r.didTimePassSeconds(this.n.k, nj.s, "need to check permissions");
    }

    public final boolean z() {
        C0630sa c0630sa = this.n;
        return c0630sa.l < c0630sa.j && ((Nj) this.k.a()).o && ((Nj) this.k.a()).isIdentifiersValid();
    }

    @Override // io.appmetrica.analytics.impl.Pb
    @NonNull
    public final H5 b() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0171cc
    public final void a(@NonNull H6 h6) {
        String a = AbstractC0494ni.a("Event received on service", EnumC0603rc.a(h6.d), h6.getName(), h6.getValue());
        if (a != null) {
            this.m.info(a, new Object[0]);
        }
        String str = this.b.b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f.a(h6, new C0122al());
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0171cc, io.appmetrica.analytics.impl.To
    public final void a(@NonNull Mo mo, C0385jp c0385jp) {
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0171cc, io.appmetrica.analytics.impl.To
    public final synchronized void a(@NonNull C0385jp c0385jp) {
        this.k.a(c0385jp);
        ((C0165c6) this.p).e();
    }

    public final void a(String str) {
        this.c.j(str).b();
    }

    public P5(@NonNull Context context, @NonNull C0385jp c0385jp, @NonNull H5 h5, @NonNull C0250f5 c0250f5, @NonNull Kj kj, @NonNull N5 n5) {
        this(context, h5, new C0505o0(), new TimePassedChecker(), new U5(context, h5, c0250f5, n5, c0385jp, kj, C0747wb.k().w().e(), PackageManagerUtils.getAppVersionCodeInt(context), C0747wb.k().l(), new G5()), c0250f5);
    }
}
