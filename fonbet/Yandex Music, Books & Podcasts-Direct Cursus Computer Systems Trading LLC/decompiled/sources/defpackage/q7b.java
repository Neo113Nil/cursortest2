package defpackage;

import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class q7b {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final h4b a;
    public final hs4 b;
    public final g0h c;
    public final jac d;
    public final bz2 e;
    public final x0 f;
    public final kkp g;

    public q7b(g0h g0hVar, cib cibVar, rdc rdcVar, rdc rdcVar2, rdc rdcVar3, rdc rdcVar4) {
        this.c = g0hVar;
        u76 u76Var = new u76(cibVar);
        kkp kkpVar = new kkp(8);
        this.g = kkpVar;
        synchronized (this) {
            try {
                try {
                    synchronized (kkpVar) {
                        try {
                            kkpVar.e = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    }
                    this.b = new hs4(22);
                    this.a = new h4b(11);
                    this.d = new jac(rdcVar, rdcVar2, rdcVar3, rdcVar4, this, this);
                    this.f = new x0(u76Var);
                    this.e = new bz2(16);
                    g0hVar.d = this;
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                throw th;
            }
        }
    }

    public static void c(String str, long j, h8b h8bVar) {
        StringBuilder m = tlm.m(str, " in ");
        m.append(esg.a(j));
        m.append("ms, key: ");
        m.append(h8bVar);
        Log.v("Engine", m.toString());
    }

    public static void f(k2o k2oVar) {
        if (k2oVar instanceof j8b) {
            ((j8b) k2oVar).b();
        } else {
            xq0.x("Cannot release anything but an EngineResource");
        }
    }

    public final es6 a(jld jldVar, Object obj, daf dafVar, int i, int i2, Class cls, Class cls2, nsm nsmVar, x68 x68Var, er3 er3Var, boolean z, boolean z2, pwj pwjVar, boolean z3, boolean z4, jlq jlqVar, f48 f48Var) {
        long j;
        if (h) {
            int i3 = esg.b;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        this.b.getClass();
        h8b h8bVar = new h8b(obj, dafVar, i, i2, er3Var, cls, cls2, pwjVar);
        synchronized (this) {
            try {
                j8b b = b(h8bVar, z3, j);
                if (b == null) {
                    return g(jldVar, obj, dafVar, i, i2, cls, cls2, nsmVar, x68Var, er3Var, z, z2, pwjVar, z3, z4, jlqVar, f48Var, h8bVar, j);
                }
                jlqVar.l(b, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    public final j8b b(h8b h8bVar, boolean z, long j) {
        Throwable th;
        j8b j8bVar;
        Object obj;
        q7b q7bVar;
        h8b h8bVar2;
        j8b j8bVar2;
        if (z) {
            kkp kkpVar = this.g;
            synchronized (kkpVar) {
                try {
                    jh jhVar = (jh) ((HashMap) kkpVar.c).get(h8bVar);
                    if (jhVar == null) {
                        j8bVar = null;
                    } else {
                        j8bVar = (j8b) jhVar.get();
                        if (j8bVar == null) {
                            try {
                                kkpVar.q(jhVar);
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
                    if (j8bVar != null) {
                        j8bVar.a();
                    }
                    if (j8bVar != null) {
                        if (h) {
                            c("Loaded resource from active resources", j, h8bVar);
                        }
                        return j8bVar;
                    }
                    g0h g0hVar = this.c;
                    synchronized (g0hVar) {
                        try {
                            d0h d0hVar = (d0h) ((LinkedHashMap) g0hVar.c).remove(h8bVar);
                            if (d0hVar == null) {
                                obj = null;
                            } else {
                                g0hVar.b -= d0hVar.b;
                                obj = d0hVar.a;
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
                    k2o k2oVar = (k2o) obj;
                    if (k2oVar == null) {
                        q7bVar = this;
                        h8bVar2 = h8bVar;
                        j8bVar2 = null;
                    } else if (k2oVar instanceof j8b) {
                        j8bVar2 = (j8b) k2oVar;
                        q7bVar = this;
                        h8bVar2 = h8bVar;
                    } else {
                        q7bVar = this;
                        h8bVar2 = h8bVar;
                        j8bVar2 = new j8b(k2oVar, true, true, h8bVar2, q7bVar);
                    }
                    if (j8bVar2 != null) {
                        j8bVar2.a();
                        q7bVar.g.k(h8bVar2, j8bVar2);
                    }
                    if (j8bVar2 != null) {
                        if (h) {
                            c("Loaded resource from cache", j, h8bVar2);
                        }
                        return j8bVar2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        return null;
    }

    public final synchronized void d(g8b g8bVar, h8b h8bVar, j8b j8bVar) {
        if (j8bVar != null) {
            try {
                if (j8bVar.a) {
                    this.g.k(h8bVar, j8bVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        h4b h4bVar = this.a;
        h4bVar.getClass();
        g8bVar.getClass();
        HashMap hashMap = (HashMap) h4bVar.a;
        if (g8bVar.equals(hashMap.get(h8bVar))) {
            hashMap.remove(h8bVar);
        }
    }

    public final void e(daf dafVar, j8b j8bVar) {
        kkp kkpVar = this.g;
        synchronized (kkpVar) {
            jh jhVar = (jh) ((HashMap) kkpVar.c).remove(dafVar);
            if (jhVar != null) {
                jhVar.c = null;
                jhVar.clear();
            }
        }
        if (j8bVar.a) {
        } else {
            this.e.H(j8bVar, false);
        }
    }

    public final es6 g(jld jldVar, Object obj, daf dafVar, int i, int i2, Class cls, Class cls2, nsm nsmVar, x68 x68Var, Map map, boolean z, boolean z2, pwj pwjVar, boolean z3, boolean z4, jlq jlqVar, Executor executor, h8b h8bVar, long j) {
        rdc rdcVar;
        g8b g8bVar = (g8b) ((HashMap) this.a.a).get(h8bVar);
        if (g8bVar != null) {
            g8bVar.a(jlqVar, executor);
            if (h) {
                c("Added to existing load", j, h8bVar);
            }
            return new es6(this, jlqVar, g8bVar);
        }
        g8b g8bVar2 = (g8b) ((vx6) this.d.g).f();
        synchronized (g8bVar2) {
            g8bVar2.k = h8bVar;
            g8bVar2.l = z3;
            g8bVar2.m = z4;
        }
        x0 x0Var = this.f;
        xf7 xf7Var = (xf7) ((vx6) x0Var.d).f();
        int i3 = x0Var.b;
        x0Var.b = i3 + 1;
        wf7 wf7Var = xf7Var.a;
        u76 u76Var = xf7Var.d;
        wf7Var.c = jldVar;
        wf7Var.d = obj;
        wf7Var.n = dafVar;
        wf7Var.e = i;
        wf7Var.f = i2;
        wf7Var.p = x68Var;
        wf7Var.g = cls;
        wf7Var.h = u76Var;
        wf7Var.k = cls2;
        wf7Var.o = nsmVar;
        wf7Var.i = pwjVar;
        wf7Var.j = map;
        wf7Var.q = z;
        wf7Var.r = z2;
        xf7Var.h = jldVar;
        xf7Var.i = dafVar;
        xf7Var.j = nsmVar;
        xf7Var.k = h8bVar;
        xf7Var.l = i;
        xf7Var.m = i2;
        xf7Var.n = x68Var;
        xf7Var.o = pwjVar;
        xf7Var.p = g8bVar2;
        xf7Var.q = i3;
        xf7Var.D = 1;
        xf7Var.s = obj;
        h4b h4bVar = this.a;
        h4bVar.getClass();
        ((HashMap) h4bVar.a).put(h8bVar, g8bVar2);
        g8bVar2.a(jlqVar, executor);
        synchronized (g8bVar2) {
            g8bVar2.t = xf7Var;
            int h2 = xf7Var.h(1);
            if (h2 != 2 && h2 != 3) {
                rdcVar = g8bVar2.m ? g8bVar2.i : g8bVar2.h;
                rdcVar.execute(xf7Var);
            }
            rdcVar = g8bVar2.g;
            rdcVar.execute(xf7Var);
        }
        if (h) {
            c("Started new load", j, h8bVar);
        }
        return new es6(this, jlqVar, g8bVar2);
    }
}
