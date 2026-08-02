package com.google.android.gms.internal.ads;

import com.anythink.core.api.ATAdConst;
import com.anythink.expressad.advanced.js.NativeAdvancedJsUtils;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import w2.C5140B;

/* loaded from: classes2.dex */
public final class Cv {

    /* renamed from: a, reason: collision with root package name */
    public final C5140B f25009a;

    /* renamed from: c, reason: collision with root package name */
    public ScheduledFuture f25011c;

    /* renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f25014f;

    /* renamed from: g, reason: collision with root package name */
    public final C3557lt f25015g;

    /* renamed from: h, reason: collision with root package name */
    public final V2.a f25016h;

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f25010b = new AtomicBoolean(false);

    /* renamed from: d, reason: collision with root package name */
    public final LinkedHashMap f25012d = new LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f25013e = new AtomicBoolean(false);

    public Cv(C5140B c5140b, ScheduledExecutorService scheduledExecutorService, C3557lt c3557lt, V2.a aVar) {
        this.f25009a = c5140b;
        this.f25014f = scheduledExecutorService;
        this.f25015g = c3557lt;
        this.f25016h = aVar;
    }

    public static String g(String str, m2.b bVar) {
        return str + ":" + bVar;
    }

    public final void a(Fv fv) {
        int i = 1;
        if (fv.t() <= 0 && !fv.f25667m.get()) {
            i = 0;
        }
        c(fv, i);
    }

    public final void b(Fv fv, boolean z6) {
        this.f25016h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        m2.b q8 = fv.q();
        String r9 = fv.r();
        S0.e a9 = ((C3230fo) this.f25015g.f32643u).a();
        a9.M("poaca_ts", Long.toString(currentTimeMillis));
        a9.M(NativeAdvancedJsUtils.f18693p, true != z6 ? "poac" : "poact");
        a9.M("ad_unit_id", r9);
        a9.M(com.anythink.expressad.f.a.b.aB, fv.f25666l);
        if (q8 != null) {
            a9.M(ATAdConst.NETWORK_REQUEST_PARAMS_KEY.FORMAT, q8.name().toLowerCase(Locale.ENGLISH));
        }
        a9.N();
        this.f25010b.set(false);
        l();
    }

    public final void c(Fv fv, int i) {
        if (i(fv)) {
            return;
        }
        if (i > 0) {
            this.f25014f.execute(new Av(this, fv, i));
        }
        if (this.f25010b.get() || fv.t() != 0 || !fv.u()) {
            k(0L);
            return;
        }
        fv.k();
        k(((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33002d0)).longValue());
    }

    public final void d(Fv fv) {
        m2.b q8 = fv.q();
        if (q8 == null) {
            return;
        }
        String g9 = g(fv.f25666l, q8);
        LinkedHashMap linkedHashMap = this.f25012d;
        synchronized (linkedHashMap) {
            if (linkedHashMap.containsKey(g9)) {
                linkedHashMap.remove(g9);
                int t6 = fv.t();
                int i = t6 - 1;
                if (!fv.f25667m.get()) {
                    t6 = i;
                }
                this.f25014f.execute(new Av(this, Math.max(t6, 0), fv));
            }
        }
    }

    public final int e() {
        RB n9;
        LinkedHashMap linkedHashMap = this.f25012d;
        synchronized (linkedHashMap) {
            n9 = RB.n(linkedHashMap.values());
        }
        int size = n9.size();
        int i = 0;
        for (int i4 = 0; i4 < size; i4++) {
            Fv fv = (Fv) n9.get(i4);
            int t6 = fv.t();
            int i6 = t6 - 1;
            if (!fv.f25667m.get()) {
                t6 = i6;
            }
            i += Math.max(t6, 0);
        }
        return i;
    }

    public final int f() {
        int i;
        C5140B c5140b = this.f25009a;
        c5140b.i();
        synchronized (c5140b.f41599a) {
            i = c5140b.f41597F;
        }
        C3324ha c3324ha = AbstractC3592ma.f32902S;
        s2.r rVar = s2.r.f40506e;
        if (!((Boolean) rVar.f40509c.a(c3324ha)).booleanValue() && i > 0) {
            return i;
        }
        return ((Integer) rVar.f40509c.a(AbstractC3592ma.f32992c0)).intValue();
    }

    public final void h(Fv fv) {
        if (fv.t() > 0 || fv.f25667m.get()) {
            this.f25014f.execute(new RunnableC4314zv(this, fv, 0));
        }
        this.f25010b.set(true);
        synchronized (this) {
            try {
                ScheduledFuture scheduledFuture = this.f25011c;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                this.f25011c = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f25013e.set(true);
    }

    public final boolean i(Fv fv) {
        boolean z6;
        m2.b q8 = fv.q();
        if (q8 == null) {
            return true;
        }
        LinkedHashMap linkedHashMap = this.f25012d;
        synchronized (linkedHashMap) {
            z6 = !linkedHashMap.containsKey(g(fv.f25666l, q8));
        }
        return z6;
    }

    public final boolean j() {
        RB n9;
        LinkedHashMap linkedHashMap = this.f25012d;
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
        if (this.f25013e.compareAndSet(false, true)) {
            synchronized (this) {
                try {
                    if (j6 > 0) {
                        this.f25011c = this.f25014f.schedule(new Bv(this, 1), j6, TimeUnit.MILLISECONDS);
                    } else {
                        this.f25014f.execute(new Bv(this, 0));
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
        if (this.f25010b.get()) {
            return;
        }
        synchronized (this) {
            fv = null;
            this.f25011c = null;
        }
        int f2 = f();
        if (e() < f2 || j()) {
            LinkedHashMap linkedHashMap = this.f25012d;
            synchronized (linkedHashMap) {
                n9 = RB.n(linkedHashMap.values());
            }
            int size = n9.size();
            double d9 = Double.MAX_VALUE;
            for (int i = 0; i < size; i++) {
                Fv fv2 = (Fv) n9.get(i);
                if (fv2.u()) {
                    double t6 = fv2.t() / fv2.s();
                    if (t6 < d9) {
                        d9 = t6;
                    }
                    if (t6 < d9) {
                        fv = fv2;
                    }
                }
            }
            if (fv != null) {
                fv.k();
                if (fv.t() > 0) {
                    C3557lt c3557lt = this.f25015g;
                    this.f25016h.getClass();
                    c3557lt.B("acmpa", System.currentTimeMillis(), fv.f25666l, fv.r(), fv.q(), fv.s(), fv.t(), 0, e(), f2);
                }
            }
            if (e() >= f2) {
                m();
            }
            if (e() < f2 || j()) {
                if (j()) {
                    this.f25014f.execute(new Bv(this, 2));
                    return;
                }
                synchronized (this) {
                    this.f25011c = this.f25014f.schedule(new Bv(this, 3), ((Long) s2.r.f40506e.f40509c.a(AbstractC3592ma.f33012e0)).longValue(), TimeUnit.MILLISECONDS);
                }
                return;
            }
        } else {
            m();
        }
        this.f25013e.set(false);
    }

    public final void m() {
        int size;
        LinkedHashMap linkedHashMap = this.f25012d;
        synchronized (linkedHashMap) {
            size = linkedHashMap.size();
        }
        C3557lt c3557lt = this.f25015g;
        this.f25016h.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        int f2 = f();
        S0.e a9 = ((C3230fo) c3557lt.f32643u).a();
        a9.M(NativeAdvancedJsUtils.f18693p, "acmlr");
        a9.M("pat", Long.toString(currentTimeMillis));
        a9.M("mpl", Integer.toString(f2));
        a9.M("pas", Integer.toString(size));
        a9.N();
    }

    public final void n(Fv fv, int i) {
        this.f25016h.getClass();
        this.f25015g.B("acmpr", System.currentTimeMillis(), fv.f25666l, fv.r(), fv.q(), fv.s(), fv.t(), i, e(), f());
    }
}
