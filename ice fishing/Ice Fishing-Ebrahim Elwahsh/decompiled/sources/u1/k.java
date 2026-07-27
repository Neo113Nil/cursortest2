package u1;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Supplier;
import m.Q0;
import m.c1;
import s1.InterfaceC4992e;
import u.AbstractC5088e;
import w1.C5150c;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f41131h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final u f41132a;

    /* renamed from: b, reason: collision with root package name */
    public final L2.i f41133b;

    /* renamed from: c, reason: collision with root package name */
    public final C5150c f41134c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f41135d;

    /* renamed from: e, reason: collision with root package name */
    public final M.h f41136e;

    /* renamed from: f, reason: collision with root package name */
    public final F.d f41137f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.n f41138g;

    public k(C5150c c5150c, t2.w wVar, x1.d dVar, x1.d dVar2, x1.d dVar3, x1.d dVar4) {
        this.f41134c = c5150c;
        N1.h hVar = new N1.h(wVar);
        S0.n nVar = new S0.n(7);
        this.f41138g = nVar;
        synchronized (this) {
            synchronized (nVar) {
                nVar.f2917w = this;
            }
        }
        this.f41133b = new L2.i(27);
        this.f41132a = new u(0);
        c1 c1Var = new c1();
        c1Var.f39400z = O1.d.a(150, new t2.w(1, c1Var));
        c1Var.f39394n = dVar;
        c1Var.f39395u = dVar2;
        c1Var.f39396v = dVar3;
        c1Var.f39397w = dVar4;
        c1Var.f39398x = this;
        c1Var.f39399y = this;
        this.f41135d = c1Var;
        this.f41137f = new F.d(hVar);
        this.f41136e = new M.h(8);
        c5150c.f41586w = this;
    }

    public static void c(String str, long j9, p pVar) {
        StringBuilder c4 = AbstractC5088e.c(str, " in ");
        c4.append(N1.j.a(j9));
        c4.append("ms, key: ");
        c4.append(pVar);
        Log.v("Engine", c4.toString());
    }

    public static void f(x xVar) {
        if (!(xVar instanceof q)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((q) xVar).e();
    }

    public final Q0 a(com.bumptech.glide.i iVar, Object obj, InterfaceC4992e interfaceC4992e, int i, int i4, Class cls, Class cls2, com.bumptech.glide.j jVar, j jVar2, N1.c cVar, boolean z8, boolean z9, s1.h hVar, boolean z10, boolean z11, J1.f fVar, N1.f fVar2) {
        long j9;
        if (f41131h) {
            int i9 = N1.j.f1965b;
            j9 = SystemClock.elapsedRealtimeNanos();
        } else {
            j9 = 0;
        }
        this.f41133b.getClass();
        p pVar = new p(obj, interfaceC4992e, i, i4, cVar, cls, cls2, hVar);
        synchronized (this) {
            try {
                q b9 = b(pVar, z10, j9);
                if (b9 == null) {
                    return g(iVar, obj, interfaceC4992e, i, i4, cls, cls2, jVar, jVar2, cVar, z8, z9, hVar, z10, z11, fVar, fVar2, pVar, j9);
                }
                fVar.g(b9, 5, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public final q b(p pVar, boolean z8, long j9) {
        Throwable th;
        q qVar;
        Object obj;
        k kVar;
        p pVar2;
        q qVar2;
        if (z8) {
            S0.n nVar = this.f41138g;
            synchronized (nVar) {
                try {
                    C5101a c5101a = (C5101a) ((HashMap) nVar.f2915u).get(pVar);
                    if (c5101a == null) {
                        qVar = null;
                    } else {
                        qVar = (q) c5101a.get();
                        if (qVar == null) {
                            try {
                                nVar.b(c5101a);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (qVar != null) {
                        qVar.b();
                    }
                    if (qVar != null) {
                        if (f41131h) {
                            c("Loaded resource from active resources", j9, pVar);
                        }
                        return qVar;
                    }
                    C5150c c5150c = this.f41134c;
                    synchronized (c5150c) {
                        try {
                            N1.k kVar2 = (N1.k) ((LinkedHashMap) c5150c.f1970v).remove(pVar);
                            if (kVar2 == null) {
                                obj = null;
                            } else {
                                c5150c.f1969u -= kVar2.f1967b;
                                obj = kVar2.f1966a;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        }
                    }
                    x xVar = (x) obj;
                    if (xVar == null) {
                        kVar = this;
                        pVar2 = pVar;
                        qVar2 = null;
                    } else if (xVar instanceof q) {
                        qVar2 = (q) xVar;
                        kVar = this;
                        pVar2 = pVar;
                    } else {
                        kVar = this;
                        pVar2 = pVar;
                        qVar2 = new q(xVar, true, true, pVar2, kVar);
                    }
                    if (qVar2 != null) {
                        qVar2.b();
                        kVar.f41138g.a(pVar2, qVar2);
                    }
                    if (qVar2 != null) {
                        if (f41131h) {
                            c("Loaded resource from cache", j9, pVar2);
                        }
                        return qVar2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        return null;
    }

    public final synchronized void d(o oVar, p pVar, q qVar) {
        if (qVar != null) {
            try {
                if (qVar.f41175n) {
                    this.f41138g.a(pVar, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        u uVar = this.f41132a;
        uVar.getClass();
        oVar.getClass();
        HashMap hashMap = (HashMap) uVar.f41190n;
        if (oVar.equals(hashMap.get(pVar))) {
            hashMap.remove(pVar);
        }
    }

    public final void e(p pVar, q qVar) {
        S0.n nVar = this.f41138g;
        synchronized (nVar) {
            C5101a c5101a = (C5101a) ((HashMap) nVar.f2915u).remove(pVar);
            if (c5101a != null) {
                c5101a.f41061c = null;
                c5101a.clear();
            }
        }
        if (qVar.f41175n) {
        } else {
            this.f41136e.o(qVar, false);
        }
    }

    public final Q0 g(com.bumptech.glide.i iVar, Object obj, InterfaceC4992e interfaceC4992e, int i, int i4, Class cls, Class cls2, com.bumptech.glide.j jVar, j jVar2, N1.c cVar, boolean z8, boolean z9, s1.h hVar, boolean z10, boolean z11, J1.f fVar, N1.f fVar2, p pVar, long j9) {
        x1.d dVar;
        o oVar = (o) ((HashMap) this.f41132a.f41190n).get(pVar);
        if (oVar != null) {
            oVar.a(fVar, fVar2);
            if (f41131h) {
                c("Added to existing load", j9, pVar);
            }
            return new Q0(this, fVar, oVar);
        }
        o oVar2 = (o) ((Y2.e) this.f41135d.f39400z).l();
        synchronized (oVar2) {
            oVar2.f41149D = pVar;
            oVar2.f41150E = z10;
            oVar2.f41151F = z11;
        }
        F.d dVar2 = this.f41137f;
        h hVar2 = (h) ((Y2.e) dVar2.f910d).l();
        int i9 = dVar2.f908b;
        dVar2.f908b = i9 + 1;
        g gVar = hVar2.f41115n;
        gVar.f41075c = iVar;
        gVar.f41076d = obj;
        gVar.f41085n = interfaceC4992e;
        gVar.f41077e = i;
        gVar.f41078f = i4;
        gVar.f41087p = jVar2;
        gVar.f41079g = cls;
        gVar.f41080h = hVar2.f41118w;
        gVar.f41082k = cls2;
        gVar.f41086o = jVar;
        gVar.i = hVar;
        gVar.f41081j = cVar;
        gVar.f41088q = z8;
        gVar.f41089r = z9;
        hVar2.f41091A = iVar;
        hVar2.f41092B = interfaceC4992e;
        hVar2.f41093C = jVar;
        hVar2.f41094D = pVar;
        hVar2.f41095E = i;
        hVar2.f41096F = i4;
        hVar2.f41097G = jVar2;
        hVar2.f41098H = hVar;
        hVar2.f41099I = oVar2;
        hVar2.J = i9;
        hVar2.Y = 1;
        hVar2.f41101L = obj;
        hVar2.f41102M = iVar.f23555h;
        hVar2.f41103N = (Supplier) hVar.c(h.f41090n0);
        u uVar = this.f41132a;
        uVar.getClass();
        ((HashMap) uVar.f41190n).put(pVar, oVar2);
        oVar2.a(fVar, fVar2);
        synchronized (oVar2) {
            oVar2.f41157M = hVar2;
            int h9 = hVar2.h(1);
            if (h9 != 2 && h9 != 3) {
                dVar = oVar2.f41151F ? oVar2.f41147B : oVar2.f41146A;
                dVar.execute(hVar2);
            }
            dVar = oVar2.f41166z;
            dVar.execute(hVar2);
        }
        if (f41131h) {
            c("Started new load", j9, pVar);
        }
        return new Q0(this, fVar, oVar2);
    }
}
