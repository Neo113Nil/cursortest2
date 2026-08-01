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
    public static final s1.g f41076n0 = new s1.g("glide_thread_priority_override", null, s1.g.f40452e);

    /* renamed from: A, reason: collision with root package name */
    public com.bumptech.glide.i f41077A;

    /* renamed from: B, reason: collision with root package name */
    public InterfaceC4970e f41078B;

    /* renamed from: C, reason: collision with root package name */
    public com.bumptech.glide.j f41079C;

    /* renamed from: D, reason: collision with root package name */
    public q f41080D;

    /* renamed from: E, reason: collision with root package name */
    public int f41081E;

    /* renamed from: F, reason: collision with root package name */
    public int f41082F;

    /* renamed from: G, reason: collision with root package name */
    public k f41083G;

    /* renamed from: H, reason: collision with root package name */
    public s1.h f41084H;

    /* renamed from: I, reason: collision with root package name */
    public p f41085I;
    public int J;

    /* renamed from: K, reason: collision with root package name */
    public long f41086K;

    /* renamed from: L, reason: collision with root package name */
    public Object f41087L;

    /* renamed from: M, reason: collision with root package name */
    public C4522b f41088M;

    /* renamed from: N, reason: collision with root package name */
    public Supplier f41089N;

    /* renamed from: O, reason: collision with root package name */
    public Thread f41090O;

    /* renamed from: P, reason: collision with root package name */
    public InterfaceC4970e f41091P;

    /* renamed from: Q, reason: collision with root package name */
    public InterfaceC4970e f41092Q;

    /* renamed from: R, reason: collision with root package name */
    public Object f41093R;

    /* renamed from: S, reason: collision with root package name */
    public com.bumptech.glide.load.data.d f41094S;

    /* renamed from: T, reason: collision with root package name */
    public volatile InterfaceC5067f f41095T;

    /* renamed from: U, reason: collision with root package name */
    public volatile boolean f41096U;

    /* renamed from: V, reason: collision with root package name */
    public volatile boolean f41097V;

    /* renamed from: W, reason: collision with root package name */
    public boolean f41098W;

    /* renamed from: X, reason: collision with root package name */
    public int f41099X;
    public int Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f41100Z;

    /* renamed from: w, reason: collision with root package name */
    public final N1.h f41104w;

    /* renamed from: x, reason: collision with root package name */
    public final Z2.e f41105x;

    /* renamed from: n, reason: collision with root package name */
    public final g f41101n = new g();

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f41102u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final O1.e f41103v = new O1.e();

    /* renamed from: y, reason: collision with root package name */
    public final j4.g f41106y = new j4.g(6);

    /* renamed from: z, reason: collision with root package name */
    public final I2 f41107z = new I2();

    public i(N1.h hVar, Z2.e eVar) {
        this.f41104w = hVar;
        this.f41105x = eVar;
    }

    @Override // u1.InterfaceC5066e
    public final void a(InterfaceC4970e interfaceC4970e, Object obj, com.bumptech.glide.load.data.d dVar, int i, InterfaceC4970e interfaceC4970e2) {
        this.f41091P = interfaceC4970e;
        this.f41093R = obj;
        this.f41094S = dVar;
        this.f41100Z = i;
        this.f41092Q = interfaceC4970e2;
        this.f41098W = interfaceC4970e != this.f41101n.a().get(0);
        if (Thread.currentThread() != this.f41090O) {
            l(3);
        } else {
            f();
        }
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41103v;
    }

    @Override // u1.InterfaceC5066e
    public final void c(InterfaceC4970e interfaceC4970e, Exception exc, com.bumptech.glide.load.data.d dVar, int i) {
        dVar.b();
        t tVar = new t("Fetching data failed", Collections.singletonList(exc));
        Class a9 = dVar.a();
        tVar.f41172u = interfaceC4970e;
        tVar.f41173v = i;
        tVar.f41174w = a9;
        this.f41102u.add(tVar);
        if (Thread.currentThread() != this.f41090O) {
            l(2);
        } else {
            n();
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        i iVar = (i) obj;
        int ordinal = this.f41079C.ordinal() - iVar.f41079C.ordinal();
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
        g gVar = this.f41101n;
        v c9 = gVar.c(cls);
        s1.h hVar = this.f41084H;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z3 = i == 4 || gVar.f41075r;
            s1.g gVar2 = B1.p.i;
            Boolean bool = (Boolean) hVar.c(gVar2);
            if (bool == null || (bool.booleanValue() && !z3)) {
                hVar = new s1.h();
                s1.h hVar2 = this.f41084H;
                N1.c cVar = hVar.f40457b;
                cVar.i(hVar2.f40457b);
                cVar.put(gVar2, Boolean.valueOf(z3));
            }
        }
        s1.h hVar3 = hVar;
        com.bumptech.glide.load.data.f g4 = this.f41077A.a().g(obj);
        try {
            return c9.a(this.f41081E, this.f41082F, new G1.a(this, i, 18), g4, hVar3);
        } finally {
            g4.b();
        }
    }

    public final void f() {
        x xVar;
        boolean a9;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            i("Retrieved data", "data: " + this.f41093R + ", cache key: " + this.f41091P + ", fetcher: " + this.f41094S, this.f41086K);
        }
        w wVar = null;
        if (((Map) this.f41088M.f37625u).containsKey(com.bumptech.glide.g.class) && (supplier = this.f41089N) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.f41089N.get()).intValue());
            } catch (IllegalArgumentException | SecurityException e9) {
                this.f41089N = null;
                if (Log.isLoggable("DecodeJob", 2)) {
                    Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e9);
                }
            }
        }
        try {
            xVar = d(this.f41094S, this.f41093R, this.f41100Z);
        } catch (t e10) {
            InterfaceC4970e interfaceC4970e = this.f41092Q;
            int i = this.f41100Z;
            e10.f41172u = interfaceC4970e;
            e10.f41173v = i;
            e10.f41174w = null;
            this.f41102u.add(e10);
            xVar = null;
        }
        if (xVar == null) {
            n();
            return;
        }
        int i6 = this.f41100Z;
        boolean z3 = this.f41098W;
        if (xVar instanceof u) {
            ((u) xVar).initialize();
        }
        if (((w) this.f41106y.f38406w) != null) {
            wVar = (w) w.f41179x.k();
            wVar.f41183w = false;
            wVar.f41182v = true;
            wVar.f41181u = xVar;
            xVar = wVar;
        }
        if (((Map) this.f41088M.f37625u).containsKey(com.bumptech.glide.g.class)) {
            m();
        }
        p();
        p pVar = this.f41085I;
        synchronized (pVar) {
            pVar.f41138G = xVar;
            pVar.f41139H = i6;
            pVar.f41145O = z3;
        }
        synchronized (pVar) {
            try {
                pVar.f41147u.a();
                if (pVar.f41144N) {
                    pVar.f41138G.a();
                    pVar.g();
                } else {
                    if (pVar.f41146n.f41130n.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (pVar.f41140I) {
                        throw new IllegalStateException("Already have resource");
                    }
                    a4.e eVar = pVar.f41150x;
                    x xVar2 = pVar.f41138G;
                    boolean z6 = pVar.f41136E;
                    q qVar = pVar.f41135D;
                    l lVar = pVar.f41148v;
                    eVar.getClass();
                    pVar.f41142L = new r(xVar2, z6, true, qVar, lVar);
                    pVar.f41140I = true;
                    o oVar = pVar.f41146n;
                    oVar.getClass();
                    ArrayList arrayList = new ArrayList(oVar.f41130n);
                    pVar.e(arrayList.size() + 1);
                    pVar.f41151y.d(pVar, pVar.f41135D, pVar.f41142L);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n nVar = (n) it.next();
                        nVar.f41129b.execute(new m(pVar, nVar.f41128a, 1));
                    }
                    pVar.d();
                }
            } finally {
            }
        }
        this.f41099X = 5;
        try {
            j4.g gVar = this.f41106y;
            if (((w) gVar.f38406w) != null) {
                N1.h hVar = this.f41104w;
                s1.h hVar2 = this.f41084H;
                gVar.getClass();
                try {
                    hVar.a().b((InterfaceC4970e) gVar.f38404u, new j4.g((s1.k) gVar.f38405v, (w) gVar.f38406w, hVar2));
                    ((w) gVar.f38406w).e();
                } catch (Throwable th) {
                    ((w) gVar.f38406w).e();
                    throw th;
                }
            }
            I2 i22 = this.f41107z;
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
        int d2 = AbstractC5049e.d(this.f41099X);
        g gVar = this.f41101n;
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
        throw new IllegalStateException("Unrecognized stage: ".concat(h.m(this.f41099X)));
    }

    public final int h(int i) {
        boolean z3;
        boolean z6;
        int d2 = AbstractC5049e.d(i);
        if (d2 == 0) {
            switch (this.f41083G.f41116a) {
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
        switch (this.f41083G.f41116a) {
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
        c9.append(this.f41080D);
        c9.append(str2 != null ? ", ".concat(str2) : "");
        c9.append(", thread: ");
        c9.append(Thread.currentThread().getName());
        Log.v("DecodeJob", c9.toString());
    }

    public final void j() {
        boolean a9;
        if (((Map) this.f41088M.f37625u).containsKey(com.bumptech.glide.g.class)) {
            m();
        }
        p();
        t tVar = new t("Failed to load resource", new ArrayList(this.f41102u));
        p pVar = this.f41085I;
        synchronized (pVar) {
            pVar.J = tVar;
        }
        synchronized (pVar) {
            try {
                pVar.f41147u.a();
                if (pVar.f41144N) {
                    pVar.g();
                } else {
                    if (pVar.f41146n.f41130n.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (pVar.f41141K) {
                        throw new IllegalStateException("Already failed once");
                    }
                    pVar.f41141K = true;
                    q qVar = pVar.f41135D;
                    o oVar = pVar.f41146n;
                    oVar.getClass();
                    ArrayList arrayList = new ArrayList(oVar.f41130n);
                    pVar.e(arrayList.size() + 1);
                    pVar.f41151y.d(pVar, qVar, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        n nVar = (n) it.next();
                        nVar.f41129b.execute(new m(pVar, nVar.f41128a, 0));
                    }
                    pVar.d();
                }
            } finally {
            }
        }
        I2 i22 = this.f41107z;
        synchronized (i22) {
            i22.f25435c = true;
            a9 = i22.a();
        }
        if (a9) {
            k();
        }
    }

    public final void k() {
        I2 i22 = this.f41107z;
        synchronized (i22) {
            i22.f25434b = false;
            i22.f25433a = false;
            i22.f25435c = false;
        }
        j4.g gVar = this.f41106y;
        gVar.f38404u = null;
        gVar.f38405v = null;
        gVar.f38406w = null;
        g gVar2 = this.f41101n;
        gVar2.f41061c = null;
        gVar2.f41062d = null;
        gVar2.f41071n = null;
        gVar2.f41065g = null;
        gVar2.f41068k = null;
        gVar2.i = null;
        gVar2.f41072o = null;
        gVar2.f41067j = null;
        gVar2.f41073p = null;
        gVar2.f41059a.clear();
        gVar2.f41069l = false;
        gVar2.f41060b.clear();
        gVar2.f41070m = false;
        this.f41096U = false;
        this.f41077A = null;
        this.f41078B = null;
        this.f41084H = null;
        this.f41079C = null;
        this.f41080D = null;
        this.f41085I = null;
        this.f41099X = 0;
        this.f41095T = null;
        this.f41090O = null;
        this.f41091P = null;
        this.f41093R = null;
        this.f41100Z = 0;
        this.f41094S = null;
        this.f41086K = 0L;
        this.f41097V = false;
        this.f41087L = null;
        this.f41102u.clear();
        this.f41105x.D(this);
    }

    public final void l(int i) {
        this.Y = i;
        p pVar = this.f41085I;
        (pVar.f41137F ? pVar.f41133B : pVar.f41132A).execute(this);
    }

    public final void m() {
        if (!((Map) this.f41088M.f37625u).containsKey(com.bumptech.glide.g.class)) {
            throw new IllegalStateException("OverrideGlideThreadPriority experiment is not enabled.");
        }
        Supplier supplier = this.f41089N;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException e9) {
            this.f41089N = null;
            if (Log.isLoggable("DecodeJob", 2)) {
                Log.v("DecodeJob", "Failed to set thread priority; using default priority for any subsequent jobs.", e9);
            }
        }
    }

    public final void n() {
        this.f41090O = Thread.currentThread();
        int i = N1.j.f1921b;
        this.f41086K = SystemClock.elapsedRealtimeNanos();
        boolean z3 = false;
        while (!this.f41097V && this.f41095T != null && !(z3 = this.f41095T.b())) {
            this.f41099X = h(this.f41099X);
            this.f41095T = g();
            if (this.f41099X == 4) {
                l(2);
                return;
            }
        }
        if ((this.f41099X == 6 || this.f41097V) && !z3) {
            j();
        }
    }

    public final void o() {
        int d2 = AbstractC5049e.d(this.Y);
        if (d2 == 0) {
            this.f41099X = h(1);
            this.f41095T = g();
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
        this.f41103v.a();
        if (!this.f41096U) {
            this.f41096U = true;
            return;
        }
        if (this.f41102u.isEmpty()) {
            th = null;
        } else {
            ArrayList arrayList = this.f41102u;
            th = (Throwable) arrayList.get(arrayList.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.bumptech.glide.load.data.d dVar = this.f41094S;
        try {
            try {
                if (this.f41097V) {
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
                Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f41097V + ", stage: " + h.m(this.f41099X), th2);
            }
            if (this.f41099X != 5) {
                this.f41102u.add(th2);
                j();
            }
            if (!this.f41097V) {
                throw th2;
            }
            throw th2;
        }
    }
}
