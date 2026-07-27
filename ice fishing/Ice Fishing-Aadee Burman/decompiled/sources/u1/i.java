package u1;

import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.internal.ads.I2;
import g1.C4522b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.function.Supplier;
import s1.InterfaceC4970e;
import u.AbstractC5049e;

/* loaded from: classes.dex */
public final class i implements InterfaceC5066e, Runnable, Comparable, O1.b {

    /* renamed from: n0, reason: collision with root package name */
    public static final s1.g f41073n0 = new s1.g("glide_thread_priority_override", null, s1.g.f40449e);

    /* renamed from: A, reason: collision with root package name */
    public com.bumptech.glide.i f41074A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC4970e f41075B;

    /* renamed from: C, reason: collision with root package name */
    public com.bumptech.glide.j f41076C;

    /* renamed from: D, reason: collision with root package name */
    public q f41077D;

    /* renamed from: E, reason: collision with root package name */
    public int f41078E;

    /* renamed from: F, reason: collision with root package name */
    public int f41079F;

    /* renamed from: G, reason: collision with root package name */
    public k f41080G;

    /* renamed from: H, reason: collision with root package name */
    public s1.h f41081H;

    /* renamed from: I, reason: collision with root package name */
    public p f41082I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public long f41083K;

    /* renamed from: L, reason: collision with root package name */
    public Object f41084L;

    /* renamed from: M, reason: collision with root package name */
    public C4522b f41085M;

    /* renamed from: N, reason: collision with root package name */
    public Supplier f41086N;

    /* renamed from: O, reason: collision with root package name */
    public Thread f41087O;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC4970e f41088P;

    /* renamed from: Q, reason: collision with root package name */
    public InterfaceC4970e f41089Q;

    /* renamed from: R, reason: collision with root package name */
    public Object f41090R;

    /* renamed from: S, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f41091S;

    /* renamed from: T, reason: collision with root package name */
    public volatile InterfaceC5067f f41092T;

    /* renamed from: U, reason: collision with root package name */
    public volatile boolean f41093U;

    /* renamed from: V, reason: collision with root package name */
    public volatile boolean f41094V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f41095W;

    /* renamed from: X, reason: collision with root package name */
    public int f41096X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f41097Z;

    /* renamed from: w, reason: collision with root package name */
    public final N1.h f41101w;

    /* renamed from: x, reason: collision with root package name */
    public final Z2.e f41102x;

    /* renamed from: n, reason: collision with root package name */
    public final g f41098n = new g();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f41099u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final O1.e f41100v = new O1.e();

    /* renamed from: y, reason: collision with root package name */
    public final j4.g f41103y = new j4.g(6);

    /* renamed from: z, reason: collision with root package name */
    public final I2 f41104z = new I2();

    public i(N1.h hVar, Z2.e eVar) {
        this.f41101w = hVar;
        this.f41102x = eVar;
    }

    @Override // u1.InterfaceC5066e
    public final void a(InterfaceC4970e interfaceC4970e, Object obj, com.bumptech.glide.load.data.d dVar, int i, InterfaceC4970e interfaceC4970e2) {
        this.f41088P = interfaceC4970e;
        this.f41090R = obj;
        this.f41091S = dVar;
        this.f41097Z = i;
        this.f41089Q = interfaceC4970e2;
        this.f41095W = interfaceC4970e != this.f41098n.a().get(0);
        if (Thread.currentThread() != this.f41087O) {
            l(3);
        } else {
            f();
        }
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41100v;
    }

    @Override // u1.InterfaceC5066e
    public final void c(InterfaceC4970e interfaceC4970e, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        dVar.b();
        t tVar = new t("Fetching data failed", Collections.singletonList(exc));
        Class a9 = dVar.a();
        tVar.f41169u = interfaceC4970e;
        tVar.f41170v = i;
        tVar.f41171w = a9;
        this.f41099u.add(tVar);
        if (Thread.currentThread() != this.f41087O) {
            l(2);
        } else {
            n();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        int ordinal = this.f41076C.ordinal() - iVar.f41076C.ordinal();
        return ordinal == 0 ? this.J - iVar.J : ordinal;
    }

    public final x d(com.bumptech.glide.load.data.d dVar, Object obj, int i) {
        if (obj == null) {
            return null;
        }
        try {
            int i6 = N1.j.f1921b;
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            x e9 = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                i("Decoded result " + e9, null, elapsedRealtimeNanos);
            }
            return e9;
        } finally {
            dVar.b();
        }
    }

    public final x e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        g gVar = this.f41098n;
        v c9 = gVar.c(cls);
        s1.h hVar = this.f41081H;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z3 = i == 4 || gVar.f41072r;
            s1.g gVar2 = B1.p.i;
            Boolean bool = (Boolean) hVar.c(gVar2);
            if (bool == null || (bool.booleanValue() && !z3)) {
                hVar = new s1.h();
                s1.h hVar2 = this.f41081H;
                N1.c cVar = hVar.f40454b;
                cVar.i(hVar2.f40454b);
                cVar.put(gVar2, Boolean.valueOf(z3));
            }
        }
        s1.h hVar3 = hVar;
        com.bumptech.glide.load.data.f g4 = this.f41074A.a().g(obj);
        try {
            return c9.a(this.f41078E, this.f41079F, new G1.a(this, i, 18), g4, hVar3);
        } finally {
            g4.b();
        }
    }

    public final void f() {
        x xVar;
        boolean a9;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", "data: " + this.f41090R + ", cache key: " + this.f41088P + ", fetcher: " + this.f41091S, this.f41083K);
        }
        w wVar = null;
        if (((Map) this.f41085M.f37625u).containsKey(com.bumptech.glide.g.class) && (supplier = this.f41086N) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f41086N.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e9) {
                this.f41086N = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e9);
                }
            }
        }
        try {
            xVar = d(this.f41091S, this.f41090R, this.f41097Z);
        } catch (t e10) {
            InterfaceC4970e interfaceC4970e = this.f41089Q;
            int i = this.f41097Z;
            e10.f41169u = interfaceC4970e;
            e10.f41170v = i;
            e10.f41171w = null;
            this.f41099u.add(e10);
            xVar = null;
        }
        if (xVar == null) {
            n();
            return;
        }
        int i6 = this.f41097Z;
        boolean z3 = this.f41095W;
        if (xVar instanceof u) {
            ((u) xVar).initialize();
        }
        if (((w) this.f41103y.f38406w) != null) {
            wVar = (w) w.f41176x.k();
            wVar.f41180w = false;
            wVar.f41179v = true;
            wVar.f41178u = xVar;
            xVar = wVar;
        }
        if (((Map) this.f41085M.f37625u).containsKey(com.bumptech.glide.g.class)) {
            m();
        }
        p();
        p pVar = this.f41082I;
        synchronized (pVar) {
            pVar.f41135G = xVar;
            pVar.f41136H = i6;
            pVar.f41142O = z3;
        }
        synchronized (pVar) {
            try {
                pVar.f41144u.a();
                if (pVar.f41141N) {
                    pVar.f41135G.a();
                    pVar.g();
                } else {
                    if (pVar.f41143n.f41127n.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (pVar.f41137I) {
                        throw new IllegalStateException("Already have resource");
                    }
                    a4.e eVar = pVar.f41147x;
                    x xVar2 = pVar.f41135G;
                    boolean z6 = pVar.f41133E;
                    q qVar = pVar.f41132D;
                    l lVar = pVar.f41145v;
                    eVar.getClass();
                    pVar.f41139L = new r(xVar2, z6, true, qVar, lVar);
                    pVar.f41137I = true;
                    o oVar = pVar.f41143n;
                    oVar.getClass();
                    ArrayList arrayList = new ArrayList(oVar.f41127n);
                    pVar.e(arrayList.size() + 1);
                    pVar.f41148y.d(pVar, pVar.f41132D, pVar.f41139L);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n nVar = (n) it.next();
                        nVar.f41126b.execute(new m(pVar, nVar.f41125a, 1));
                    }
                    pVar.d();
                }
            } finally {
            }
        }
        this.f41096X = 5;
        try {
            j4.g gVar = this.f41103y;
            if (((w) gVar.f38406w) != null) {
                N1.h hVar = this.f41101w;
                s1.h hVar2 = this.f41081H;
                gVar.getClass();
                try {
                    hVar.a().b((InterfaceC4970e) gVar.f38404u, new j4.g((s1.k) gVar.f38405v, (w) gVar.f38406w, hVar2));
                    ((w) gVar.f38406w).e();
                } catch (Throwable th) {
                    ((w) gVar.f38406w).e();
                    throw th;
                }
            }
            I2 i22 = this.f41104z;
            synchronized (i22) {
                i22.f25434b = true;
                a9 = i22.a();
            }
            if (a9) {
                k();
            }
        } finally {
            if (wVar != null) {
                wVar.e();
            }
        }
    }

    public final InterfaceC5067f g() {
        int d2 = AbstractC5049e.d(this.f41096X);
        g gVar = this.f41098n;
        if (d2 == 1) {
            return new y(gVar, this);
        }
        if (d2 == 2) {
            return new C5064c(gVar.a(), gVar, this);
        }
        if (d2 == 3) {
            return new C5061A(gVar, this);
        }
        if (d2 == 5) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: ".concat(h.m(this.f41096X)));
    }

    public final int h(int i) {
        boolean z3;
        boolean z6;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            switch (this.f41080G.f41113a) {
                case 0:
                case 1:
                    z3 = false;
                    break;
                default:
                    z3 = true;
                    break;
            }
            if (z3) {
                return 2;
            }
            return h(2);
        }
        if (d2 != 1) {
            if (d2 == 2) {
                return 4;
            }
            if (d2 == 3 || d2 == 5) {
                return 6;
            }
            throw new IllegalArgumentException("Unrecognized stage: ".concat(h.m(i)));
        }
        switch (this.f41080G.f41113a) {
            case 0:
                z6 = false;
                break;
            case 1:
            default:
                z6 = true;
                break;
        }
        if (z6) {
            return 3;
        }
        return h(3);
    }

    public final void i(String str, String str2, long j6) {
        StringBuilder c9 = AbstractC5049e.c(str, " in ");
        c9.append(N1.j.a(j6));
        c9.append(", load key: ");
        c9.append(this.f41077D);
        c9.append(str2 != null ? ", ".concat(str2) : "");
        c9.append(", thread: ");
        c9.append(Thread.currentThread().getName());
        Log.v("DecodeJob", c9.toString());
    }

    public final void j() {
        boolean a9;
        if (((Map) this.f41085M.f37625u).containsKey(com.bumptech.glide.g.class)) {
            m();
        }
        p();
        t tVar = new t("Failed to load resource", new ArrayList(this.f41099u));
        p pVar = this.f41082I;
        synchronized (pVar) {
            pVar.J = tVar;
        }
        synchronized (pVar) {
            try {
                pVar.f41144u.a();
                if (pVar.f41141N) {
                    pVar.g();
                } else {
                    if (pVar.f41143n.f41127n.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (pVar.f41138K) {
                        throw new IllegalStateException("Already failed once");
                    }
                    pVar.f41138K = true;
                    q qVar = pVar.f41132D;
                    o oVar = pVar.f41143n;
                    oVar.getClass();
                    ArrayList arrayList = new ArrayList(oVar.f41127n);
                    pVar.e(arrayList.size() + 1);
                    pVar.f41148y.d(pVar, qVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n nVar = (n) it.next();
                        nVar.f41126b.execute(new m(pVar, nVar.f41125a, 0));
                    }
                    pVar.d();
                }
            } finally {
            }
        }
        I2 i22 = this.f41104z;
        synchronized (i22) {
            i22.f25435c = true;
            a9 = i22.a();
        }
        if (a9) {
            k();
        }
    }

    public final void k() {
        I2 i22 = this.f41104z;
        synchronized (i22) {
            i22.f25434b = false;
            i22.f25433a = false;
            i22.f25435c = false;
        }
        j4.g gVar = this.f41103y;
        gVar.f38404u = null;
        gVar.f38405v = null;
        gVar.f38406w = null;
        g gVar2 = this.f41098n;
        gVar2.f41058c = null;
        gVar2.f41059d = null;
        gVar2.f41068n = null;
        gVar2.f41062g = null;
        gVar2.f41065k = null;
        gVar2.i = null;
        gVar2.f41069o = null;
        gVar2.f41064j = null;
        gVar2.f41070p = null;
        gVar2.f41056a.clear();
        gVar2.f41066l = false;
        gVar2.f41057b.clear();
        gVar2.f41067m = false;
        this.f41093U = false;
        this.f41074A = null;
        this.f41075B = null;
        this.f41081H = null;
        this.f41076C = null;
        this.f41077D = null;
        this.f41082I = null;
        this.f41096X = 0;
        this.f41092T = null;
        this.f41087O = null;
        this.f41088P = null;
        this.f41090R = null;
        this.f41097Z = 0;
        this.f41091S = null;
        this.f41083K = 0L;
        this.f41094V = false;
        this.f41084L = null;
        this.f41099u.clear();
        this.f41102x.D(this);
    }

    public final void l(int i) {
        this.Y = i;
        p pVar = this.f41082I;
        (pVar.f41134F ? pVar.f41130B : pVar.f41129A).execute(this);
    }

    public final void m() {
        if (!((Map) this.f41085M.f37625u).containsKey(com.bumptech.glide.g.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f41086N;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e9) {
            this.f41086N = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e9);
            }
        }
    }

    public final void n() {
        this.f41087O = Thread.currentThread();
        int i = N1.j.f1921b;
        this.f41083K = SystemClock.elapsedRealtimeNanos();
        boolean z3 = false;
        while (!this.f41094V && this.f41092T != null && !(z3 = this.f41092T.b())) {
            this.f41096X = h(this.f41096X);
            this.f41092T = g();
            if (this.f41096X == 4) {
                l(2);
                return;
            }
        }
        if ((this.f41096X == 6 || this.f41094V) && !z3) {
            j();
        }
    }

    public final void o() {
        int d2 = AbstractC5049e.d(this.Y);
        if (d2 == 0) {
            this.f41096X = h(1);
            this.f41092T = g();
            n();
        } else if (d2 == 1) {
            n();
        } else if (d2 == 2) {
            f();
        } else {
            int i = this.Y;
            throw new IllegalStateException("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    public final void p() {
        Throwable th;
        this.f41100v.a();
        if (!this.f41093U) {
            this.f41093U = true;
            return;
        }
        if (this.f41099u.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f41099u;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d dVar = this.f41091S;
        try {
            try {
                if (this.f41094V) {
                    j();
                    if (dVar != null) {
                        dVar.b();
                        return;
                    }
                    return;
                }
                o();
                if (dVar != null) {
                    dVar.b();
                }
            } catch (Throwable th) {
                if (dVar != null) {
                    dVar.b();
                }
                throw th;
            }
        } catch (C5063b e9) {
            throw e9;
        } catch (Throwable th2) {
            if (Log.isLoggable("DecodeJob", 3)) {
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f41094V + ", stage: " + h.m(this.f41096X), th2);
            }
            if (this.f41096X != 5) {
                this.f41099u.add(th2);
                j();
            }
            if (!this.f41094V) {
                throw th2;
            }
            throw th2;
        }
    }
}
