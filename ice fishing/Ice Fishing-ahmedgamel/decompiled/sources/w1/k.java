package w1;

import A1.A;
import android.os.SystemClock;
import android.util.Log;
import h.C4543G;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.Supplier;
import m.c1;
import u.AbstractC5050e;
import u1.InterfaceC5066e;
import y1.C5202c;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f41500h = Log.isLoggable("Engine", 2);

    /* renamed from: a, reason: collision with root package name */
    public final A f41501a;

    /* renamed from: b, reason: collision with root package name */
    public final c4.e f41502b;

    /* renamed from: c, reason: collision with root package name */
    public final C5202c f41503c;

    /* renamed from: d, reason: collision with root package name */
    public final c1 f41504d;

    /* renamed from: e, reason: collision with root package name */
    public final M.h f41505e;

    /* renamed from: f, reason: collision with root package name */
    public final F.d f41506f;

    /* renamed from: g, reason: collision with root package name */
    public final S0.n f41507g;

    public k(C5202c c5202c, C4543G c4543g, z1.d dVar, z1.d dVar2, z1.d dVar3, z1.d dVar4) {
        this.f41503c = c5202c;
        P1.h hVar = new P1.h(c4543g);
        S0.n nVar = new S0.n(7);
        this.f41507g = nVar;
        synchronized (this) {
            synchronized (nVar) {
                nVar.f2934x = this;
            }
        }
        this.f41502b = new c4.e();
        this.f41501a = new A(2);
        c1 c1Var = new c1();
        c1Var.f39198z = Q1.d.a(150, new C4543G(c1Var));
        c1Var.f39192n = dVar;
        c1Var.f39193u = dVar2;
        c1Var.f39194v = dVar3;
        c1Var.f39195w = dVar4;
        c1Var.f39196x = this;
        c1Var.f39197y = this;
        this.f41504d = c1Var;
        this.f41506f = new F.d(hVar);
        this.f41505e = new M.h(9);
        c5202c.f41891w = this;
    }

    public static void c(String str, long j6, p pVar) {
        StringBuilder c9 = AbstractC5050e.c(str, " in ");
        c9.append(P1.j.a(j6));
        c9.append("ms, key: ");
        c9.append(pVar);
        Log.v("Engine", c9.toString());
    }

    public static void f(w wVar) {
        if (!(wVar instanceof q)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((q) wVar).e();
    }

    public final l4.g a(com.bumptech.glide.i iVar, Object obj, InterfaceC5066e interfaceC5066e, int i, int i4, Class cls, Class cls2, com.bumptech.glide.j jVar, j jVar2, P1.c cVar, boolean z6, boolean z9, u1.h hVar, boolean z10, boolean z11, L1.f fVar, P1.f fVar2) {
        long j6;
        if (f41500h) {
            int i6 = P1.j.f2365b;
            j6 = SystemClock.elapsedRealtimeNanos();
        } else {
            j6 = 0;
        }
        this.f41502b.getClass();
        p pVar = new p(obj, interfaceC5066e, i, i4, cVar, cls, cls2, hVar);
        synchronized (this) {
            try {
                q b9 = b(pVar, z10, j6);
                if (b9 == null) {
                    return g(iVar, obj, interfaceC5066e, i, i4, cls, cls2, jVar, jVar2, cVar, z6, z9, hVar, z10, z11, fVar, fVar2, pVar, j6);
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
    public final q b(p pVar, boolean z6, long j6) {
        Throwable th;
        q qVar;
        Object obj;
        k kVar;
        p pVar2;
        q qVar2;
        if (z6) {
            S0.n nVar = this.f41507g;
            synchronized (nVar) {
                try {
                    C5133a c5133a = (C5133a) ((HashMap) nVar.f2932v).get(pVar);
                    if (c5133a == null) {
                        qVar = null;
                    } else {
                        qVar = (q) c5133a.get();
                        if (qVar == null) {
                            try {
                                nVar.j(c5133a);
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
                        qVar.d();
                    }
                    if (qVar != null) {
                        if (f41500h) {
                            c("Loaded resource from active resources", j6, pVar);
                        }
                        return qVar;
                    }
                    C5202c c5202c = this.f41503c;
                    synchronized (c5202c) {
                        try {
                            P1.k kVar2 = (P1.k) ((LinkedHashMap) c5202c.f2370v).remove(pVar);
                            if (kVar2 == null) {
                                obj = null;
                            } else {
                                c5202c.f2369u -= kVar2.f2367b;
                                obj = kVar2.f2366a;
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
                    w wVar = (w) obj;
                    if (wVar == null) {
                        kVar = this;
                        pVar2 = pVar;
                        qVar2 = null;
                    } else if (wVar instanceof q) {
                        qVar2 = (q) wVar;
                        kVar = this;
                        pVar2 = pVar;
                    } else {
                        kVar = this;
                        pVar2 = pVar;
                        qVar2 = new q(wVar, true, true, pVar2, kVar);
                    }
                    if (qVar2 != null) {
                        qVar2.d();
                        kVar.f41507g.i(pVar2, qVar2);
                    }
                    if (qVar2 != null) {
                        if (f41500h) {
                            c("Loaded resource from cache", j6, pVar2);
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
                if (qVar.f41544n) {
                    this.f41507g.i(pVar, qVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        A a9 = this.f41501a;
        a9.getClass();
        oVar.getClass();
        HashMap hashMap = a9.f11a;
        if (oVar.equals(hashMap.get(pVar))) {
            hashMap.remove(pVar);
        }
    }

    public final void e(p pVar, q qVar) {
        S0.n nVar = this.f41507g;
        synchronized (nVar) {
            C5133a c5133a = (C5133a) ((HashMap) nVar.f2932v).remove(pVar);
            if (c5133a != null) {
                c5133a.f41430c = null;
                c5133a.clear();
            }
        }
        if (qVar.f41544n) {
        } else {
            this.f41505e.p(qVar, false);
        }
    }

    public final l4.g g(com.bumptech.glide.i iVar, Object obj, InterfaceC5066e interfaceC5066e, int i, int i4, Class cls, Class cls2, com.bumptech.glide.j jVar, j jVar2, P1.c cVar, boolean z6, boolean z9, u1.h hVar, boolean z10, boolean z11, L1.f fVar, P1.f fVar2, p pVar, long j6) {
        z1.d dVar;
        o oVar = (o) this.f41501a.f11a.get(pVar);
        if (oVar != null) {
            oVar.a(fVar, fVar2);
            if (f41500h) {
                c("Added to existing load", j6, pVar);
            }
            return new l4.g(this, fVar, oVar);
        }
        o oVar2 = (o) ((b3.e) this.f41504d.f39198z).k();
        synchronized (oVar2) {
            oVar2.f41518D = pVar;
            oVar2.f41519E = z10;
            oVar2.f41520F = z11;
        }
        F.d dVar2 = this.f41506f;
        h hVar2 = (h) ((b3.e) dVar2.f919d).k();
        int i6 = dVar2.f917b;
        dVar2.f917b = i6 + 1;
        g gVar = hVar2.f41484n;
        gVar.f41444c = iVar;
        gVar.f41445d = obj;
        gVar.f41454n = interfaceC5066e;
        gVar.f41446e = i;
        gVar.f41447f = i4;
        gVar.f41456p = jVar2;
        gVar.f41448g = cls;
        gVar.f41449h = hVar2.f41487w;
        gVar.f41451k = cls2;
        gVar.f41455o = jVar;
        gVar.i = hVar;
        gVar.f41450j = cVar;
        gVar.f41457q = z6;
        gVar.f41458r = z9;
        hVar2.f41460A = iVar;
        hVar2.f41461B = interfaceC5066e;
        hVar2.f41462C = jVar;
        hVar2.f41463D = pVar;
        hVar2.f41464E = i;
        hVar2.f41465F = i4;
        hVar2.f41466G = jVar2;
        hVar2.f41467H = hVar;
        hVar2.f41468I = oVar2;
        hVar2.J = i6;
        hVar2.Y = 1;
        hVar2.f41470L = obj;
        hVar2.f41471M = iVar.f24186h;
        hVar2.f41472N = (Supplier) hVar.c(h.f41459i0);
        A a9 = this.f41501a;
        a9.getClass();
        a9.f11a.put(pVar, oVar2);
        oVar2.a(fVar, fVar2);
        synchronized (oVar2) {
            oVar2.f41526M = hVar2;
            int h3 = hVar2.h(1);
            if (h3 != 2 && h3 != 3) {
                dVar = oVar2.f41520F ? oVar2.f41516B : oVar2.f41515A;
                dVar.execute(hVar2);
            }
            dVar = oVar2.f41535z;
            dVar.execute(hVar2);
        }
        if (f41500h) {
            c("Started new load", j6, pVar);
        }
        return new l4.g(this, fVar, oVar2);
    }
}
