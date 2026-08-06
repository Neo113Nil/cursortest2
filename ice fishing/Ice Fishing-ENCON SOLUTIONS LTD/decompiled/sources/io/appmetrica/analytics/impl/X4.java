package io.appmetrica.analytics.impl;

import a.AbstractC0083a;
import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class X4 implements Pa, Ea, InterfaceC0513jh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f5346a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f5347b;

    /* renamed from: c, reason: collision with root package name */
    public final We f5348c;

    /* renamed from: d, reason: collision with root package name */
    public final Ze f5349d;

    /* renamed from: e, reason: collision with root package name */
    public final L6 f5350e;

    /* renamed from: f, reason: collision with root package name */
    public final C0773ti f5351f;

    /* renamed from: g, reason: collision with root package name */
    public final X8 f5352g;

    /* renamed from: h, reason: collision with root package name */
    public final C0496j0 f5353h;

    /* renamed from: i, reason: collision with root package name */
    public final C0522k0 f5354i;

    /* renamed from: j, reason: collision with root package name */
    public final Rk f5355j;

    /* renamed from: k, reason: collision with root package name */
    public final Qg f5356k;

    /* renamed from: l, reason: collision with root package name */
    public final M8 f5357l;

    /* renamed from: m, reason: collision with root package name */
    public final PublicLogger f5358m;

    /* renamed from: n, reason: collision with root package name */
    public final C0531k9 f5359n;

    /* renamed from: o, reason: collision with root package name */
    public final S4 f5360o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0687q9 f5361p;

    /* renamed from: q, reason: collision with root package name */
    public final C0577m3 f5362q;

    /* renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f5363r;

    /* renamed from: s, reason: collision with root package name */
    public final C0770tf f5364s;
    public final C0883xo t;

    /* renamed from: u, reason: collision with root package name */
    public final Jk f5365u;

    /* renamed from: v, reason: collision with root package name */
    public final C0654p2 f5366v;

    public X4(Context context, C0415fm c0415fm, Q4 q4, C0630o4 c0630o4, InterfaceC0462hh interfaceC0462hh, V4 v4) {
        this(context, q4, new C0522k0(), new TimePassedChecker(), new C0321c5(context, q4, c0630o4, v4, c0415fm, interfaceC0462hh, C0610na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0610na.k().l(), new P4()), c0630o4);
    }

    public final boolean A() {
        C0539kh c0539kh = (C0539kh) this.f5356k.a();
        return c0539kh.f6385n && this.f5363r.didTimePassSeconds(this.f5359n.f6365k, c0539kh.t, "should force send permissions");
    }

    public final boolean B() {
        C0415fm c0415fm;
        C0770tf c0770tf = this.f5364s;
        c0770tf.f4927h.a(c0770tf.f4920a);
        boolean z2 = ((C0693qf) c0770tf.c()).f6781d;
        Qg qg = this.f5356k;
        synchronized (qg) {
            c0415fm = qg.f6661c.f4671a;
        }
        return !(z2 && c0415fm.f6018q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ql
    public final void a(Jl jl, C0415fm c0415fm) {
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Q4 b() {
        return this.f5347b;
    }

    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C0496j0 c0496j0 = this.f5353h;
        synchronized (c0496j0) {
            c0496j0.f6234a = new Fc();
        }
        this.f5354i.a(this.f5353h.a(), this.f5348c);
    }

    public final synchronized void e() {
        ((C0527k5) this.f5361p).d();
    }

    public final C0654p2 f() {
        return this.f5366v;
    }

    public final C0577m3 g() {
        return this.f5362q;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Context getContext() {
        return this.f5346a;
    }

    public final We h() {
        return this.f5348c;
    }

    public final L6 i() {
        return this.f5350e;
    }

    public final M8 j() {
        return this.f5357l;
    }

    public final X8 k() {
        return this.f5352g;
    }

    public final C0531k9 l() {
        return this.f5359n;
    }

    public final InterfaceC0687q9 m() {
        return this.f5361p;
    }

    public final C0539kh n() {
        return (C0539kh) this.f5356k.a();
    }

    public final String o() {
        return this.f5348c.j();
    }

    public final PublicLogger p() {
        return this.f5358m;
    }

    public final Ze q() {
        return this.f5349d;
    }

    public final Jk r() {
        return this.f5365u;
    }

    public final Rk s() {
        return this.f5355j;
    }

    public final C0415fm t() {
        C0415fm c0415fm;
        Qg qg = this.f5356k;
        synchronized (qg) {
            c0415fm = qg.f6661c.f4671a;
        }
        return c0415fm;
    }

    public final C0883xo u() {
        return this.t;
    }

    public final void v() {
        C0531k9 c0531k9 = this.f5359n;
        int i2 = c0531k9.f6364j;
        c0531k9.f6366l = i2;
        c0531k9.f6355a.a(i2).b();
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        C0883xo c0883xo = this.t;
        synchronized (c0883xo) {
            optInt = c0883xo.f7214a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.f5360o.getClass();
            Iterator it = AbstractC0083a.m(new U4(this)).iterator();
            while (it.hasNext()) {
                ((T4) it.next()).a(optInt);
            }
            this.t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C0539kh c0539kh = (C0539kh) this.f5356k.a();
        return c0539kh.f6385n && c0539kh.isIdentifiersValid() && this.f5363r.didTimePassSeconds(this.f5359n.f6365k, c0539kh.f6390s, "need to check permissions");
    }

    public final boolean y() {
        C0531k9 c0531k9 = this.f5359n;
        return c0531k9.f6366l < c0531k9.f6364j && ((C0539kh) this.f5356k.a()).f6386o && ((C0539kh) this.f5356k.a()).isIdentifiersValid();
    }

    public final void z() {
        Qg qg = this.f5356k;
        synchronized (qg) {
            qg.f6659a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(P5 p5) {
        String a2 = Qf.a("Event received on service", EnumC0301bb.a(p5.f4907d), p5.getName(), p5.getValue());
        if (a2 != null) {
            this.f5358m.info(a2, new Object[0]);
        }
        String str = this.f5347b.f4951b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f5351f.a(p5, new C0747si());
    }

    public final void b(P5 p5) {
        this.f5353h.a(p5.f4909f);
        C0471i0 a2 = this.f5353h.a();
        C0522k0 c0522k0 = this.f5354i;
        We we = this.f5348c;
        synchronized (c0522k0) {
            if (a2.f6159b > we.d().f6159b) {
                we.a(a2).b();
                this.f5358m.info("Save new app environment for %s. Value: %s", this.f5347b, a2.f6158a);
            }
        }
    }

    public X4(Context context, Q4 q4, C0522k0 c0522k0, TimePassedChecker timePassedChecker, C0321c5 c0321c5, C0630o4 c0630o4) {
        this.f5346a = context.getApplicationContext();
        this.f5347b = q4;
        this.f5354i = c0522k0;
        this.f5363r = timePassedChecker;
        C0883xo f2 = c0321c5.f();
        this.t = f2;
        this.f5364s = C0610na.k().t();
        We a2 = c0321c5.e().a();
        this.f5348c = a2;
        this.f5366v = c0321c5.a(a2);
        Qg a3 = c0321c5.a(this);
        this.f5356k = a3;
        PublicLogger a4 = c0321c5.d().a();
        this.f5358m = a4;
        this.f5349d = C0610na.k().y();
        C0496j0 a5 = c0522k0.a(q4, a4, a2);
        this.f5353h = a5;
        this.f5357l = c0321c5.a();
        L6 b2 = c0321c5.b(this);
        this.f5350e = b2;
        C0825vi d2 = c0321c5.d(this);
        this.f5360o = C0321c5.b();
        w();
        Rk a6 = C0321c5.a(this, f2, new W4(this));
        this.f5355j = a6;
        a4.info("Read app environment for component %s. Value: %s", q4.toString(), a5.a().f6158a);
        Jk c2 = c0321c5.c();
        this.f5365u = c2;
        this.f5359n = c0321c5.a(a2, f2, a6, b2, a5, c2, d2);
        X8 c3 = C0321c5.c(this);
        this.f5352g = c3;
        this.f5351f = C0321c5.a(this, c3);
        this.f5362q = c0321c5.b(a2);
        this.f5361p = c0321c5.a(d2, b2, a3, c0630o4, q4, a2);
        b2.d();
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public synchronized void a(C0630o4 c0630o4) {
        long j2;
        try {
            this.f5356k.a(c0630o4);
            boolean z2 = false;
            if (Boolean.TRUE.equals(c0630o4.f6651h)) {
                this.f5358m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c0630o4.f6651h)) {
                    this.f5358m.setEnabled(false);
                }
            }
            C0654p2 c0654p2 = this.f5366v;
            Set<String> set = c0630o4.f6658o;
            long currentTimeMillis = c0654p2.f6718d.currentTimeMillis();
            boolean z3 = false;
            for (String str : set) {
                Long l2 = (Long) c0654p2.f6719e.get(str);
                if (l2 != null) {
                    j2 = l2.longValue();
                } else {
                    j2 = -1;
                    z3 = true;
                }
                if (currentTimeMillis - j2 > c0654p2.f6716b) {
                    c0654p2.f6719e.put(str, Long.valueOf(currentTimeMillis));
                    z2 = true;
                }
            }
            if (z2) {
                c0654p2.a(c0654p2.f6719e);
                c0654p2.f6715a.a(c0654p2.f6719e);
            }
            if (z3) {
                this.f5356k.e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ql
    public final synchronized void a(C0415fm c0415fm) {
        this.f5356k.a(c0415fm);
        ((C0527k5) this.f5361p).e();
    }

    public final void a(String str) {
        this.f5348c.j(str).b();
    }
}
