package com.gamericefishpro.space.n9;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import com.gamericefishpro.space.i9.v5;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class r1 implements a2 {
    public static volatile r1 X;
    public final w3 A;
    public final r4 B;
    public final p0 C;
    public final com.gamericefishpro.space.z8.a D;
    public final e3 E;
    public final t2 F;
    public final x G;
    public final x2 H;
    public final String I;
    public o0 J;
    public o3 K;
    public p L;
    public m0 M;
    public y2 N;
    public Boolean P;
    public long Q;
    public volatile Boolean R;
    public volatile boolean S;
    public int T;
    public int U;
    public final long W;
    public final Context d;
    public final boolean e;
    public final com.gamericefishpro.space.lb.e i;
    public final g v;
    public final f1 w;
    public final v0 y;
    public final p1 z;
    public boolean O = false;
    public final AtomicInteger V = new AtomicInteger(0);

    public r1(g2 g2Var) {
        com.gamericefishpro.space.ta.d eVar;
        Context context;
        Context context2 = g2Var.a;
        com.gamericefishpro.space.lb.e eVar2 = new com.gamericefishpro.space.lb.e(10);
        this.i = eVar2;
        f2.k = eVar2;
        this.d = context2;
        this.e = g2Var.e;
        this.R = g2Var.b;
        this.I = g2Var.g;
        this.S = true;
        if (com.gamericefishpro.space.i9.k4.h == null && context2 != null) {
            Object obj = com.gamericefishpro.space.i9.k4.g;
            synchronized (obj) {
                try {
                    if (com.gamericefishpro.space.i9.k4.h == null) {
                        synchronized (obj) {
                            try {
                                com.gamericefishpro.space.i9.b4 b4Var = com.gamericefishpro.space.i9.k4.h;
                                Context applicationContext = context2.getApplicationContext();
                                if (applicationContext == null) {
                                    applicationContext = context2;
                                }
                                if (b4Var == null || b4Var.a != applicationContext) {
                                    if (b4Var != null) {
                                        com.gamericefishpro.space.i9.d4.c();
                                        com.gamericefishpro.space.i9.m4.a();
                                        synchronized (com.gamericefishpro.space.i9.g4.class) {
                                            try {
                                                com.gamericefishpro.space.i9.g4 g4Var = com.gamericefishpro.space.i9.g4.d;
                                                if (g4Var != null && (context = (Context) g4Var.b) != null && ((com.gamericefishpro.space.i9.f4) g4Var.c) != null && g4Var.a) {
                                                    context.getContentResolver().unregisterContentObserver((com.gamericefishpro.space.i9.f4) com.gamericefishpro.space.i9.g4.d.c);
                                                }
                                                com.gamericefishpro.space.i9.g4.d = null;
                                            } catch (Throwable th) {
                                                throw th;
                                            }
                                        }
                                    }
                                    v5 v5Var = new v5(applicationContext);
                                    if (v5Var instanceof Serializable) {
                                        eVar = new com.gamericefishpro.space.ta.e(v5Var);
                                    } else {
                                        com.gamericefishpro.space.ta.f fVar = new com.gamericefishpro.space.ta.f();
                                        fVar.d = v5Var;
                                        eVar = fVar;
                                    }
                                    com.gamericefishpro.space.i9.k4.h = new com.gamericefishpro.space.i9.b4(applicationContext, eVar);
                                    com.gamericefishpro.space.i9.k4.i.incrementAndGet();
                                }
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        this.D = com.gamericefishpro.space.z8.a.a;
        Long l = g2Var.f;
        this.W = l != null ? l.longValue() : System.currentTimeMillis();
        g gVar = new g(this);
        gVar.v = com.gamericefishpro.space.v8.l.i;
        this.v = gVar;
        f1 f1Var = new f1(this);
        f1Var.u();
        this.w = f1Var;
        v0 v0Var = new v0(this);
        v0Var.u();
        this.y = v0Var;
        r4 r4Var = new r4(this);
        r4Var.u();
        this.B = r4Var;
        this.C = new p0(new h1(g2Var, this));
        this.G = new x(this);
        e3 e3Var = new e3(this);
        e3Var.t();
        this.E = e3Var;
        t2 t2Var = new t2(this);
        t2Var.t();
        this.F = t2Var;
        w3 w3Var = new w3(this);
        w3Var.t();
        this.A = w3Var;
        x2 x2Var = new x2(this);
        x2Var.u();
        this.H = x2Var;
        p1 p1Var = new p1(this);
        p1Var.u();
        this.z = p1Var;
        com.gamericefishpro.space.i9.t0 t0Var = g2Var.d;
        boolean z = t0Var == null || t0Var.e == 0;
        if (context2.getApplicationContext() instanceof Application) {
            k(t2Var);
            if (((r1) t2Var.d).d.getApplicationContext() instanceof Application) {
                Application application = (Application) ((r1) t2Var.d).d.getApplicationContext();
                if (t2Var.i == null) {
                    t2Var.i = new q2(t2Var);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(t2Var.i);
                    application.registerActivityLifecycleCallbacks(t2Var.i);
                    v0 v0Var2 = ((r1) t2Var.d).y;
                    l(v0Var2);
                    v0Var2.G.a("Registered activity lifecycle callback");
                }
            }
        } else {
            l(v0Var);
            v0Var.B.a("Application context is not an Application");
        }
        p1Var.A(new com.gamericefishpro.space.va.a(10, this, g2Var, false));
    }

    public static final void i(b0 b0Var) {
        if (b0Var == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void j(com.gamericefishpro.space.g1.b bVar) {
        if (bVar == null) {
            throw new IllegalStateException("Component not created");
        }
    }

    public static final void k(g0 g0Var) {
        if (g0Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!g0Var.e) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(g0Var.getClass())));
        }
    }

    public static final void l(z1 z1Var) {
        if (z1Var == null) {
            throw new IllegalStateException("Component not created");
        }
        if (!z1Var.e) {
            throw new IllegalStateException("Component not initialized: ".concat(String.valueOf(z1Var.getClass())));
        }
    }

    public static r1 r(Context context, com.gamericefishpro.space.i9.t0 t0Var, Long l) {
        Bundle bundle;
        if (t0Var != null) {
            Bundle bundle2 = t0Var.v;
            t0Var = new com.gamericefishpro.space.i9.t0(t0Var.d, t0Var.e, t0Var.i, bundle2, null);
        }
        com.gamericefishpro.space.v8.c0.g(context);
        com.gamericefishpro.space.v8.c0.g(context.getApplicationContext());
        if (X == null) {
            synchronized (r1.class) {
                try {
                    if (X == null) {
                        X = new r1(new g2(context, t0Var, l));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } else if (t0Var != null && (bundle = t0Var.v) != null && bundle.containsKey("dataCollectionDefaultEnabled")) {
            com.gamericefishpro.space.v8.c0.g(X);
            X.R = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled"));
        }
        com.gamericefishpro.space.v8.c0.g(X);
        return X;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final v0 a() {
        v0 v0Var = this.y;
        l(v0Var);
        return v0Var;
    }

    public final boolean b() {
        return g() == 0;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final p1 c() {
        p1 p1Var = this.z;
        l(p1Var);
        return p1Var;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final Context d() {
        return this.d;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final com.gamericefishpro.space.z8.a e() {
        return this.D;
    }

    @Override // com.gamericefishpro.space.n9.a2
    public final com.gamericefishpro.space.lb.e f() {
        return this.i;
    }

    public final int g() {
        p1 p1Var = this.z;
        l(p1Var);
        p1Var.r();
        g gVar = this.v;
        if (gVar.E()) {
            return 1;
        }
        l(p1Var);
        p1Var.r();
        if (!this.S) {
            return 8;
        }
        f1 f1Var = this.w;
        j(f1Var);
        f1Var.r();
        Boolean boolValueOf = f1Var.v().contains("measurement_enabled") ? Boolean.valueOf(f1Var.v().getBoolean("measurement_enabled", true)) : null;
        if (boolValueOf != null) {
            return boolValueOf.booleanValue() ? 0 : 3;
        }
        com.gamericefishpro.space.lb.e eVar = ((r1) gVar.d).i;
        Boolean boolD = gVar.D("firebase_analytics_collection_enabled");
        if (boolD != null) {
            return boolD.booleanValue() ? 0 : 4;
        }
        return (this.R == null || this.R.booleanValue()) ? 0 : 7;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0034  */
    /* JADX WARN: Code duplicated, block: B:24:0x0074  */
    /* JADX WARN: Code duplicated, block: B:27:0x007d  */
    public final boolean h() {
        r4 r4Var;
        boolean z;
        Context context;
        if (!this.O) {
            throw new IllegalStateException("AppMeasurement is not initialized");
        }
        p1 p1Var = this.z;
        l(p1Var);
        p1Var.r();
        Boolean bool = this.P;
        com.gamericefishpro.space.z8.a aVar = this.D;
        if (bool == null || this.Q == 0) {
            aVar.getClass();
            this.Q = SystemClock.elapsedRealtime();
            r4Var = this.B;
            j(r4Var);
            z = false;
            if (r4Var.O("android.permission.INTERNET") && r4Var.O("android.permission.ACCESS_NETWORK_STATE")) {
                context = this.d;
                if (com.gamericefishpro.space.b9.c.a(context).f() || this.v.u() || (r4.h0(context) && r4.K(context))) {
                    z = true;
                }
            }
            this.P = Boolean.valueOf(z);
            if (z) {
                this.P = Boolean.valueOf(r4Var.v(q().y()));
            }
        } else if (!bool.booleanValue()) {
            aVar.getClass();
            if (Math.abs(SystemClock.elapsedRealtime() - this.Q) > 1000) {
                aVar.getClass();
                this.Q = SystemClock.elapsedRealtime();
                r4Var = this.B;
                j(r4Var);
                z = false;
                if (r4Var.O("android.permission.INTERNET")) {
                    context = this.d;
                    if (com.gamericefishpro.space.b9.c.a(context).f()) {
                        z = true;
                    } else {
                        z = true;
                    }
                }
                this.P = Boolean.valueOf(z);
                if (z) {
                    this.P = Boolean.valueOf(r4Var.v(q().y()));
                }
            }
        }
        return this.P.booleanValue();
    }

    public final p0 m() {
        return this.C;
    }

    public final o0 n() {
        k(this.J);
        return this.J;
    }

    public final o3 o() {
        k(this.K);
        return this.K;
    }

    public final p p() {
        l(this.L);
        return this.L;
    }

    public final m0 q() {
        k(this.M);
        return this.M;
    }
}
