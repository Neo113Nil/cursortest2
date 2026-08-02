package defpackage;

import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class xf7 implements da7, Runnable, Comparable, r3c {
    public volatile boolean A;
    public boolean B;
    public int C;
    public int D;
    public int E;
    public final u76 d;
    public final chm e;
    public jld h;
    public daf i;
    public nsm j;
    public h8b k;
    public int l;
    public int m;
    public x68 n;
    public pwj o;
    public g8b p;
    public int q;
    public long r;
    public Object s;
    public Thread t;
    public daf u;
    public daf v;
    public Object w;
    public ca7 x;
    public volatile ea7 y;
    public volatile boolean z;
    public final wf7 a = new wf7();
    public final ArrayList b = new ArrayList();
    public final uer c = new uer();
    public final vx6 f = new vx6(1);
    public final hx1 g = new hx1();

    public xf7(u76 u76Var, vx6 vx6Var) {
        this.d = u76Var;
        this.e = vx6Var;
    }

    @Override // defpackage.da7
    public final void a(daf dafVar, Exception exc, ca7 ca7Var, int i) {
        ca7Var.b();
        lld lldVar = new lld("Fetching data failed", Collections.singletonList(exc));
        Class a = ca7Var.a();
        lldVar.b = dafVar;
        lldVar.c = i;
        lldVar.d = a;
        this.b.add(lldVar);
        if (Thread.currentThread() == this.t) {
            m();
            return;
        }
        this.D = 2;
        g8b g8bVar = this.p;
        (g8bVar.m ? g8bVar.i : g8bVar.h).execute(this);
    }

    @Override // defpackage.r3c
    public final uer b() {
        return this.c;
    }

    @Override // defpackage.da7
    public final void c(daf dafVar, Object obj, ca7 ca7Var, int i, daf dafVar2) {
        this.u = dafVar;
        this.w = obj;
        this.x = ca7Var;
        this.E = i;
        this.v = dafVar2;
        this.B = dafVar != this.a.a().get(0);
        if (Thread.currentThread() == this.t) {
            f();
            return;
        }
        this.D = 3;
        g8b g8bVar = this.p;
        (g8bVar.m ? g8bVar.i : g8bVar.h).execute(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        xf7 xf7Var = (xf7) obj;
        int ordinal = this.j.ordinal() - xf7Var.j.ordinal();
        return ordinal == 0 ? this.q - xf7Var.q : ordinal;
    }

    public final k2o d(ca7 ca7Var, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i2 = esg.b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            k2o e = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i(elapsedRealtimeNanos, "Decoded result " + e, null);
            }
            return e;
        } finally {
            ca7Var.b();
        }
    }

    public final k2o e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        wf7 wf7Var = this.a;
        dfg c = wf7Var.c(cls);
        pwj pwjVar = this.o;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = i == 4 || wf7Var.r;
            cvj cvjVar = zla.i;
            Boolean bool = (Boolean) pwjVar.c(cvjVar);
            if (bool == null || (bool.booleanValue() && !z)) {
                pwjVar = new pwj();
                er3 er3Var = this.o.b;
                er3 er3Var2 = pwjVar.b;
                er3Var2.g(er3Var);
                er3Var2.put(cvjVar, Boolean.valueOf(z));
            }
        }
        pwj pwjVar2 = pwjVar;
        oa7 g = this.h.a().g(obj);
        try {
            return c.a(this.l, this.m, g, pwjVar2, new j4x(this, i, 4));
        } finally {
            g.b();
        }
    }

    public final void f() {
        k2o k2oVar;
        boolean b;
        if (Log.isLoggable("DecodeJob", 2)) {
            i(this.r, "Retrieved data", "data: " + this.w + ", cache key: " + this.u + ", fetcher: " + this.x);
        }
        rqg rqgVar = null;
        try {
            k2oVar = d(this.x, this.w, this.E);
        } catch (lld e) {
            daf dafVar = this.v;
            int i = this.E;
            e.b = dafVar;
            e.c = i;
            e.d = null;
            this.b.add(e);
            k2oVar = null;
        }
        if (k2oVar == null) {
            m();
            return;
        }
        int i2 = this.E;
        if (k2oVar instanceof gme) {
            ((gme) k2oVar).a();
        }
        if (((rqg) this.f.d) != null) {
            rqgVar = (rqg) rqg.e.f();
            rqgVar.d = false;
            rqgVar.c = true;
            rqgVar.b = k2oVar;
            k2oVar = rqgVar;
        }
        o();
        g8b g8bVar = this.p;
        synchronized (g8bVar) {
            g8bVar.n = k2oVar;
            g8bVar.o = i2;
        }
        synchronized (g8bVar) {
            try {
                g8bVar.b.a();
                if (g8bVar.u) {
                    g8bVar.n.g();
                    g8bVar.f();
                } else {
                    if (g8bVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (g8bVar.p) {
                        throw new IllegalStateException("Already have resource");
                    }
                    bs4 bs4Var = g8bVar.e;
                    k2o k2oVar2 = g8bVar.n;
                    boolean z = g8bVar.l;
                    h8b h8bVar = g8bVar.k;
                    q7b q7bVar = g8bVar.c;
                    bs4Var.getClass();
                    g8bVar.s = new j8b(k2oVar2, z, true, h8bVar, q7bVar);
                    g8bVar.p = true;
                    f8b f8bVar = g8bVar.a;
                    f8bVar.getClass();
                    ArrayList arrayList = new ArrayList(f8bVar.a);
                    g8bVar.d(arrayList.size() + 1);
                    g8bVar.f.d(g8bVar, g8bVar.k, g8bVar.s);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e8b e8bVar = (e8b) it.next();
                        e8bVar.b.execute(new d8b(g8bVar, e8bVar.a, 1));
                    }
                    g8bVar.c();
                }
            } finally {
            }
        }
        this.C = 5;
        try {
            vx6 vx6Var = this.f;
            if (((rqg) vx6Var.d) != null) {
                try {
                    this.d.e().b((daf) vx6Var.b, new es6((r2o) vx6Var.c, (rqg) vx6Var.d, this.o));
                    ((rqg) vx6Var.d).a();
                } catch (Throwable th) {
                    ((rqg) vx6Var.d).a();
                    throw th;
                }
            }
            hx1 hx1Var = this.g;
            synchronized (hx1Var) {
                hx1Var.b = true;
                b = hx1Var.b();
            }
            if (b) {
                l();
            }
        } finally {
            if (rqgVar != null) {
                rqgVar.a();
            }
        }
    }

    public final ea7 g() {
        int D = ouj.D(this.C);
        wf7 wf7Var = this.a;
        if (D == 1) {
            return new l2o(wf7Var, this);
        }
        if (D == 2) {
            return new s97(wf7Var.a(), wf7Var, this);
        }
        if (D == 3) {
            return new o3r(wf7Var, this);
        }
        if (D == 5) {
            return null;
        }
        xq0.q("Unrecognized stage: ".concat(su4.A(this.C)));
        return null;
    }

    public final int h(int i) {
        boolean z;
        boolean z2;
        int D = ouj.D(i);
        if (D == 0) {
            switch (this.n.a) {
                case 0:
                case 1:
                    z = false;
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return h(2);
        }
        if (D != 1) {
            if (D == 2) {
                return 4;
            }
            if (D == 3 || D == 5) {
                return 6;
            }
            xq0.x("Unrecognized stage: ".concat(su4.A(i)));
            return 0;
        }
        switch (this.n.a) {
            case 0:
                z2 = false;
                break;
            case 1:
            default:
                z2 = true;
                break;
        }
        if (z2) {
            return 3;
        }
        return h(3);
    }

    public final void i(long j, String str, String str2) {
        StringBuilder m = tlm.m(str, " in ");
        m.append(esg.a(j));
        m.append(", load key: ");
        m.append(this.k);
        m.append(str2 != null ? ", ".concat(str2) : "");
        m.append(", thread: ");
        m.append(Thread.currentThread().getName());
        Log.v("DecodeJob", m.toString());
    }

    public final void k() {
        boolean b;
        o();
        lld lldVar = new lld("Failed to load resource", new ArrayList(this.b));
        g8b g8bVar = this.p;
        synchronized (g8bVar) {
            g8bVar.q = lldVar;
        }
        synchronized (g8bVar) {
            try {
                g8bVar.b.a();
                if (g8bVar.u) {
                    g8bVar.f();
                } else {
                    if (g8bVar.a.a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (g8bVar.r) {
                        throw new IllegalStateException("Already failed once");
                    }
                    g8bVar.r = true;
                    h8b h8bVar = g8bVar.k;
                    f8b f8bVar = g8bVar.a;
                    f8bVar.getClass();
                    ArrayList arrayList = new ArrayList(f8bVar.a);
                    g8bVar.d(arrayList.size() + 1);
                    g8bVar.f.d(g8bVar, h8bVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        e8b e8bVar = (e8b) it.next();
                        e8bVar.b.execute(new d8b(g8bVar, e8bVar.a, 0));
                    }
                    g8bVar.c();
                }
            } finally {
            }
        }
        hx1 hx1Var = this.g;
        synchronized (hx1Var) {
            hx1Var.c = true;
            b = hx1Var.b();
        }
        if (b) {
            l();
        }
    }

    public final void l() {
        hx1 hx1Var = this.g;
        synchronized (hx1Var) {
            hx1Var.b = false;
            hx1Var.a = false;
            hx1Var.c = false;
        }
        vx6 vx6Var = this.f;
        vx6Var.b = null;
        vx6Var.c = null;
        vx6Var.d = null;
        wf7 wf7Var = this.a;
        wf7Var.c = null;
        wf7Var.d = null;
        wf7Var.n = null;
        wf7Var.g = null;
        wf7Var.k = null;
        wf7Var.i = null;
        wf7Var.o = null;
        wf7Var.j = null;
        wf7Var.p = null;
        wf7Var.a.clear();
        wf7Var.l = false;
        wf7Var.b.clear();
        wf7Var.m = false;
        this.z = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.C = 0;
        this.y = null;
        this.t = null;
        this.u = null;
        this.w = null;
        this.E = 0;
        this.x = null;
        this.r = 0L;
        this.A = false;
        this.s = null;
        this.b.clear();
        this.e.c(this);
    }

    public final void m() {
        this.t = Thread.currentThread();
        int i = esg.b;
        this.r = SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.A && this.y != null && !(z = this.y.b())) {
            this.C = h(this.C);
            this.y = g();
            if (this.C == 4) {
                this.D = 2;
                g8b g8bVar = this.p;
                (g8bVar.m ? g8bVar.i : g8bVar.h).execute(this);
                return;
            }
        }
        if ((this.C == 6 || this.A) && !z) {
            k();
        }
    }

    public final void n() {
        int D = ouj.D(this.D);
        if (D == 0) {
            this.C = h(1);
            this.y = g();
            m();
        } else if (D == 1) {
            m();
        } else if (D == 2) {
            f();
        } else {
            int i = this.D;
            xq0.q("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    public final void o() {
        this.c.a();
        if (this.z) {
            b6e.o("Already notified", this.b.isEmpty() ? null : (Throwable) vz1.m(this.b, 1));
        } else {
            this.z = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        ca7 ca7Var = this.x;
        try {
            try {
                if (this.A) {
                    k();
                    if (ca7Var != null) {
                        ca7Var.b();
                        return;
                    }
                    return;
                }
                n();
                if (ca7Var != null) {
                    ca7Var.b();
                }
            } catch (Throwable th) {
                if (ca7Var != null) {
                    ca7Var.b();
                }
                throw th;
            }
        } catch (qs3 e) {
            throw e;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.A + ", stage: " + su4.A(this.C), th2);
            }
            if (this.C != 5) {
                this.b.add(th2);
                k();
            }
            if (!this.A) {
                throw th2;
            }
            throw th2;
        }
    }
}
