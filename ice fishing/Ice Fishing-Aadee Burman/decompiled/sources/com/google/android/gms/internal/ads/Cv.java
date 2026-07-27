package com.google.android.gms.internal.ads;

import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import u2.C5069B;

/* loaded from: classes2.dex */
public final class Cv {

    /* renamed from: a, reason: collision with root package name */
    public final C5069B f24264a;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f24266c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f24269f;

    /* renamed from: g, reason: collision with root package name */
    public final C3534lt f24270g;

    /* renamed from: h, reason: collision with root package name */
    public final T2.a f24271h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f24265b = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f24267d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f24268e = new AtomicBoolean(false);

    public Cv(C5069B c5069b, ScheduledExecutorService scheduledExecutorService, C3534lt c3534lt, T2.a aVar) {
        this.f24264a = c5069b;
        this.f24269f = scheduledExecutorService;
        this.f24270g = c3534lt;
        this.f24271h = aVar;
    }

    public static String g(String str, k2.b bVar) {
        return str + ":" + bVar;
    }

    public final void a(Fv fv) {
        int i = 1;
        if (fv.t() <= 0 && !fv.f24877m.get()) {
            i = 0;
        }
        c(fv, i);
    }

    public final void b(Fv fv, boolean z3) {
        this.f24271h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        k2.b q8 = fv.q();
        String r9 = fv.r();
        S0.e a9 = ((C3153eo) this.f24270g.f31863u).a();
        a9.v("poaca_ts", Long.toString(currentTimeMillis));
        a9.v(NativeAdvancedJsUtils.f17906p, true != z3 ? "poac" : "poact");
        a9.v("ad_unit_id", r9);
        a9.v(com.anythink.expressad.f.a.b.aB, fv.f24876l);
        if (q8 != null) {
            a9.v(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, q8.name().toLowerCase(Locale.ENGLISH));
        }
        a9.y();
        this.f24265b.set(false);
        l();
    }

    public final void c(Fv fv, int i) {
        if (i(fv)) {
            return;
        }
        if (i > 0) {
            this.f24269f.execute(new Av(this, fv, i));
        }
        if (this.f24265b.get() || fv.t() != 0 || !fv.u()) {
            k(0L);
            return;
        }
        fv.k();
        k(((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32223d0)).longValue());
    }

    public final void d(Fv fv) {
        k2.b q8 = fv.q();
        if (q8 == null) {
            return;
        }
        String g4 = g(fv.f24876l, q8);
        LinkedHashMap linkedHashMap = this.f24267d;
        synchronized (linkedHashMap) {
            if (linkedHashMap.containsKey(g4)) {
                linkedHashMap.remove(g4);
                int t6 = fv.t();
                int i = t6 - 1;
                if (!fv.f24877m.get()) {
                    t6 = i;
                }
                this.f24269f.execute(new Av(this, Math.max(t6, 0), fv));
            }
        }
    }

    public final int e() {
        RB n9;
        LinkedHashMap linkedHashMap = this.f24267d;
        synchronized (linkedHashMap) {
            n9 = RB.n(linkedHashMap.values());
        }
        int size = n9.size();
        int i = 0;
        for (int i6 = 0; i6 < size; i6++) {
            Fv fv = (Fv) n9.get(i6);
            int t6 = fv.t();
            int i9 = t6 - 1;
            if (!fv.f24877m.get()) {
                t6 = i9;
            }
            i += Math.max(t6, 0);
        }
        return i;
    }

    public final int f() {
        int i;
        C5069B c5069b = this.f24264a;
        c5069b.i();
        synchronized (c5069b.f41206a) {
            i = c5069b.f41204F;
        }
        C3301ha c3301ha = AbstractC3569ma.f32123S;
        q2.r rVar = q2.r.f40204e;
        if (!((Boolean) rVar.f40207c.a(c3301ha)).booleanValue() && i > 0) {
            return i;
        }
        return ((Integer) rVar.f40207c.a(AbstractC3569ma.f32213c0)).intValue();
    }

    public final void h(Fv fv) {
        if (fv.t() > 0 || fv.f24877m.get()) {
            this.f24269f.execute(new RunnableC4291zv(this, fv, 0));
        }
        this.f24265b.set(true);
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.f24266c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f24266c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f24268e.set(true);
    }

    public final boolean i(Fv fv) {
        boolean z3;
        k2.b q8 = fv.q();
        if (q8 == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f24267d;
        synchronized (linkedHashMap) {
            z3 = !linkedHashMap.containsKey(g(fv.f24876l, q8));
        }
        return z3;
    }

    public final boolean j() {
        RB n9;
        LinkedHashMap linkedHashMap = this.f24267d;
        synchronized (linkedHashMap) {
            n9 = RB.n(linkedHashMap.values());
        }
        int size = n9.size();
        for (int i = 0; i < size; i++) {
            Fv fv = (Fv) n9.get(i);
            if (fv.t() == 0 && fv.u()) {
                return true;
            }
        }
        return false;
    }

    public final void k(long j6) {
        if (this.f24268e.compareAndSet(false, true)) {
            synchronized (this) {
                try {
                    if (j6 > 0) {
                        this.f24266c = this.f24269f.schedule(new Bv(this, 1), j6, TimeUnit.MILLISECONDS);
                    } else {
                        this.f24269f.execute(new Bv(this, 0));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void l() {
        Fv fv;
        RB n9;
        if (this.f24265b.get()) {
            return;
        }
        synchronized (this) {
            fv = null;
            this.f24266c = null;
        }
        int f3 = f();
        if (e() < f3 || j()) {
            LinkedHashMap linkedHashMap = this.f24267d;
            synchronized (linkedHashMap) {
                n9 = RB.n(linkedHashMap.values());
            }
            int size = n9.size();
            double d2 = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                Fv fv2 = (Fv) n9.get(i);
                if (fv2.u()) {
                    double t6 = fv2.t() / fv2.s();
                    if (t6 < d2) {
                        d2 = t6;
                    }
                    if (t6 < d2) {
                        fv = fv2;
                    }
                }
            }
            if (fv != null) {
                fv.k();
                if (fv.t() > 0) {
                    C3534lt c3534lt = this.f24270g;
                    this.f24271h.getClass();
                    c3534lt.B("acmpa", System.currentTimeMillis(), fv.f24876l, fv.r(), fv.q(), fv.s(), fv.t(), 0, e(), f3);
                }
            }
            if (e() >= f3) {
                m();
            }
            if (e() < f3 || j()) {
                if (j()) {
                    this.f24269f.execute(new Bv(this, 2));
                    return;
                }
                synchronized (this) {
                    this.f24266c = this.f24269f.schedule(new Bv(this, 3), ((Long) q2.r.f40204e.f40207c.a(AbstractC3569ma.f32232e0)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            m();
        }
        this.f24268e.set(false);
    }

    public final void m() {
        int size;
        LinkedHashMap linkedHashMap = this.f24267d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        C3534lt c3534lt = this.f24270g;
        this.f24271h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int f3 = f();
        S0.e a9 = ((C3153eo) c3534lt.f31863u).a();
        a9.v(NativeAdvancedJsUtils.f17906p, "acmlr");
        a9.v("pat", Long.toString(currentTimeMillis));
        a9.v("mpl", Integer.toString(f3));
        a9.v("pas", Integer.toString(size));
        a9.y();
    }

    public final void n(Fv fv, int i) {
        this.f24271h.getClass();
        this.f24270g.B("acmpr", System.currentTimeMillis(), fv.f24876l, fv.r(), fv.q(), fv.s(), fv.t(), i, e(), f());
    }
}
