package u1;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Supplier;
import l.C4648e;
import m.b1;
import s1.InterfaceC4970e;
import t0.C4988C;
import u.AbstractC5049e;
import w1.C5145c;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f41117h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final J0.g f41118a;

    /* renamed from: b, reason: collision with root package name */
    public final E3.e f41119b;

    /* renamed from: c, reason: collision with root package name */
    public final C5145c f41120c;

    /* renamed from: d, reason: collision with root package name */
    public final b1 f41121d;

    /* renamed from: e, reason: collision with root package name */
    public final L3.h f41122e;

    /* renamed from: f, reason: collision with root package name */
    public final F.d f41123f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.n f41124g;

    public l(C5145c c5145c, C4988C c4988c, x1.d dVar, x1.d dVar2, x1.d dVar3, x1.d dVar4) {
        this.f41120c = c5145c;
        N1.h hVar = new N1.h(c4988c);
        S0.n nVar = new S0.n(7);
        this.f41124g = nVar;
        synchronized (this) {
            synchronized (nVar) {
                nVar.f2805x = this;
            }
        }
        this.f41119b = new E3.e();
        this.f41118a = new J0.g(1);
        b1 b1Var = new b1();
        b1Var.f39127z = O1.d.a(150, new C4648e(8, b1Var));
        b1Var.f39121n = dVar;
        b1Var.f39122u = dVar2;
        b1Var.f39123v = dVar3;
        b1Var.f39124w = dVar4;
        b1Var.f39125x = this;
        b1Var.f39126y = this;
        this.f41121d = b1Var;
        this.f41123f = new F.d(hVar);
        this.f41122e = new L3.h(9);
        c5145c.f41651w = this;
    }

    public static void c(String str, long j6, q qVar) {
        StringBuilder c9 = AbstractC5049e.c(str, " in ");
        c9.append(N1.j.a(j6));
        c9.append("ms, key: ");
        c9.append(qVar);
        Log.v("Engine", c9.toString());
    }

    public static void f(x xVar) {
        if (!(xVar instanceof r)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((r) xVar).e();
    }

    public final j4.g a(com.bumptech.glide.i iVar, Object obj, InterfaceC4970e interfaceC4970e, int i, int i6, Class cls, Class cls2, com.bumptech.glide.j jVar, k kVar, N1.c cVar, boolean z3, boolean z6, s1.h hVar, boolean z9, boolean z10, J1.f fVar, N1.f fVar2) {
        long j6;
        if (f41117h) {
            int i9 = N1.j.f1921b;
            j6 = SystemClock.elapsedRealtimeNanos();
        } else {
            j6 = 0;
        }
        this.f41119b.getClass();
        q qVar = new q(obj, interfaceC4970e, i, i6, cVar, cls, cls2, hVar);
        synchronized (this) {
            try {
                r b9 = b(qVar, z9, j6);
                if (b9 == null) {
                    return g(iVar, obj, interfaceC4970e, i, i6, cls, cls2, jVar, kVar, cVar, z3, z6, hVar, z9, z10, fVar, fVar2, qVar, j6);
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
    public final r b(q qVar, boolean z3, long j6) {
        Throwable th;
        r rVar;
        Object obj;
        l lVar;
        q qVar2;
        r rVar2;
        if (z3) {
            S0.n nVar = this.f41124g;
            synchronized (nVar) {
                try {
                    C5062a c5062a = (C5062a) ((HashMap) nVar.f2803v).get(qVar);
                    if (c5062a == null) {
                        rVar = null;
                    } else {
                        rVar = (r) c5062a.get();
                        if (rVar == null) {
                            try {
                                nVar.g(c5062a);
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
                    if (rVar != null) {
                        rVar.b();
                    }
                    if (rVar != null) {
                        if (f41117h) {
                            c("Loaded resource from active resources", j6, qVar);
                        }
                        return rVar;
                    }
                    C5145c c5145c = this.f41120c;
                    synchronized (c5145c) {
                        try {
                            N1.k kVar = (N1.k) ((LinkedHashMap) c5145c.f1926v).remove(qVar);
                            if (kVar == null) {
                                obj = null;
                            } else {
                                c5145c.f1925u -= kVar.f1923b;
                                obj = kVar.f1922a;
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
                        lVar = this;
                        qVar2 = qVar;
                        rVar2 = null;
                    } else if (xVar instanceof r) {
                        rVar2 = (r) xVar;
                        lVar = this;
                        qVar2 = qVar;
                    } else {
                        lVar = this;
                        qVar2 = qVar;
                        rVar2 = new r(xVar, true, true, qVar2, lVar);
                    }
                    if (rVar2 != null) {
                        rVar2.b();
                        lVar.f41124g.b(qVar2, rVar2);
                    }
                    if (rVar2 != null) {
                        if (f41117h) {
                            c("Loaded resource from cache", j6, qVar2);
                        }
                        return rVar2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        return null;
    }

    public final synchronized void d(p pVar, q qVar, r rVar) {
        if (rVar != null) {
            try {
                if (rVar.f41161n) {
                    this.f41124g.b(qVar, rVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        J0.g gVar = this.f41118a;
        gVar.getClass();
        pVar.getClass();
        HashMap hashMap = gVar.f1388a;
        if (pVar.equals(hashMap.get(qVar))) {
            hashMap.remove(qVar);
        }
    }

    public final void e(q qVar, r rVar) {
        S0.n nVar = this.f41124g;
        synchronized (nVar) {
            C5062a c5062a = (C5062a) ((HashMap) nVar.f2803v).remove(qVar);
            if (c5062a != null) {
                c5062a.f41047c = null;
                c5062a.clear();
            }
        }
        if (rVar.f41161n) {
        } else {
            this.f41122e.p(rVar, false);
        }
    }

    public final j4.g g(com.bumptech.glide.i iVar, Object obj, InterfaceC4970e interfaceC4970e, int i, int i6, Class cls, Class cls2, com.bumptech.glide.j jVar, k kVar, N1.c cVar, boolean z3, boolean z6, s1.h hVar, boolean z9, boolean z10, J1.f fVar, N1.f fVar2, q qVar, long j6) {
        x1.d dVar;
        p pVar = (p) this.f41118a.f1388a.get(qVar);
        if (pVar != null) {
            pVar.a(fVar, fVar2);
            if (f41117h) {
                c("Added to existing load", j6, qVar);
            }
            return new j4.g(this, fVar, pVar);
        }
        p pVar2 = (p) ((Z2.e) this.f41121d.f39127z).k();
        synchronized (pVar2) {
            pVar2.f41135D = qVar;
            pVar2.f41136E = z9;
            pVar2.f41137F = z10;
        }
        F.d dVar2 = this.f41123f;
        i iVar2 = (i) ((Z2.e) dVar2.f856d).k();
        int i9 = dVar2.f854b;
        dVar2.f854b = i9 + 1;
        g gVar = iVar2.f41101n;
        gVar.f41061c = iVar;
        gVar.f41062d = obj;
        gVar.f41071n = interfaceC4970e;
        gVar.f41063e = i;
        gVar.f41064f = i6;
        gVar.f41073p = kVar;
        gVar.f41065g = cls;
        gVar.f41066h = iVar2.f41104w;
        gVar.f41068k = cls2;
        gVar.f41072o = jVar;
        gVar.i = hVar;
        gVar.f41067j = cVar;
        gVar.f41074q = z3;
        gVar.f41075r = z6;
        iVar2.f41077A = iVar;
        iVar2.f41078B = interfaceC4970e;
        iVar2.f41079C = jVar;
        iVar2.f41080D = qVar;
        iVar2.f41081E = i;
        iVar2.f41082F = i6;
        iVar2.f41083G = kVar;
        iVar2.f41084H = hVar;
        iVar2.f41085I = pVar2;
        iVar2.J = i9;
        iVar2.Y = 1;
        iVar2.f41087L = obj;
        iVar2.f41088M = iVar.f23399h;
        iVar2.f41089N = (Supplier) hVar.c(i.f41076n0);
        J0.g gVar2 = this.f41118a;
        gVar2.getClass();
        gVar2.f1388a.put(qVar, pVar2);
        pVar2.a(fVar, fVar2);
        synchronized (pVar2) {
            pVar2.f41143M = iVar2;
            int h9 = iVar2.h(1);
            if (h9 != 2 && h9 != 3) {
                dVar = pVar2.f41137F ? pVar2.f41133B : pVar2.f41132A;
                dVar.execute(iVar2);
            }
            dVar = pVar2.f41152z;
            dVar.execute(iVar2);
        }
        if (f41117h) {
            c("Started new load", j6, qVar);
        }
        return new j4.g(this, fVar, pVar2);
    }
}
