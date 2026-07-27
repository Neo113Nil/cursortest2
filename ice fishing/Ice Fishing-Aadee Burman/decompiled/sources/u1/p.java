package u1;

import com.google.android.gms.internal.ads.I2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class p implements O1.b {

    /* renamed from: P, reason: collision with root package name */
    public static final a4.e f41128P = new a4.e();

    /* renamed from: A, reason: collision with root package name */
    public final x1.d f41129A;

    /* renamed from: B, reason: collision with root package name */
    public final x1.d f41130B;

    /* renamed from: C, reason: collision with root package name */
    public final AtomicInteger f41131C;

    /* renamed from: D, reason: collision with root package name */
    public q f41132D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f41133E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f41134F;

    /* renamed from: G, reason: collision with root package name */
    public x f41135G;

    /* renamed from: H, reason: collision with root package name */
    public int f41136H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f41137I;
    public t J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f41138K;

    /* renamed from: L, reason: collision with root package name */
    public r f41139L;

    /* renamed from: M, reason: collision with root package name */
    public i f41140M;

    /* renamed from: N, reason: collision with root package name */
    public volatile boolean f41141N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f41142O;

    /* renamed from: n, reason: collision with root package name */
    public final o f41143n;

    /* renamed from: u, reason: collision with root package name */
    public final O1.e f41144u;

    /* renamed from: v, reason: collision with root package name */
    public final l f41145v;

    /* renamed from: w, reason: collision with root package name */
    public final Z2.e f41146w;

    /* renamed from: x, reason: collision with root package name */
    public final a4.e f41147x;

    /* renamed from: y, reason: collision with root package name */
    public final l f41148y;

    /* renamed from: z, reason: collision with root package name */
    public final x1.d f41149z;

    public p(x1.d dVar, x1.d dVar2, x1.d dVar3, x1.d dVar4, l lVar, l lVar2, Z2.e eVar) {
        a4.e eVar2 = f41128P;
        this.f41143n = new o(new ArrayList(2));
        this.f41144u = new O1.e();
        this.f41131C = new AtomicInteger();
        this.f41149z = dVar;
        this.f41129A = dVar2;
        this.f41130B = dVar4;
        this.f41148y = lVar;
        this.f41145v = lVar2;
        this.f41146w = eVar;
        this.f41147x = eVar2;
    }

    public final synchronized void a(J1.f fVar, N1.f fVar2) {
        try {
            this.f41144u.a();
            o oVar = this.f41143n;
            oVar.getClass();
            oVar.f41127n.add(new n(fVar, fVar2));
            if (this.f41137I) {
                e(1);
                m mVar = new m(this, fVar, 1);
                fVar2.getClass();
                N1.p.j(mVar);
            } else if (this.f41138K) {
                e(1);
                m mVar2 = new m(this, fVar, 0);
                fVar2.getClass();
                N1.p.j(mVar2);
            } else {
                N1.g.a("Cannot add callbacks to a cancelled EngineJob", !this.f41141N);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41144u;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.f41141N = true;
        i iVar = this.f41140M;
        iVar.f41094V = true;
        InterfaceC5067f interfaceC5067f = iVar.f41092T;
        if (interfaceC5067f != null) {
            interfaceC5067f.cancel();
        }
        l lVar = this.f41148y;
        q qVar = this.f41132D;
        synchronized (lVar) {
            J0.g gVar = lVar.f41115a;
            gVar.getClass();
            HashMap hashMap = gVar.f1388a;
            if (equals(hashMap.get(qVar))) {
                hashMap.remove(qVar);
            }
        }
    }

    public final void d() {
        r rVar;
        synchronized (this) {
            try {
                this.f41144u.a();
                N1.g.a("Not yet complete!", f());
                int decrementAndGet = this.f41131C.decrementAndGet();
                N1.g.a("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    rVar = this.f41139L;
                    g();
                } else {
                    rVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (rVar != null) {
            rVar.e();
        }
    }

    public final synchronized void e(int i) {
        r rVar;
        N1.g.a("Not yet complete!", f());
        if (this.f41131C.getAndAdd(i) == 0 && (rVar = this.f41139L) != null) {
            rVar.b();
        }
    }

    public final boolean f() {
        return this.f41138K || this.f41137I || this.f41141N;
    }

    public final synchronized void g() {
        boolean a9;
        if (this.f41132D == null) {
            throw new IllegalArgumentException();
        }
        this.f41143n.f41127n.clear();
        this.f41132D = null;
        this.f41139L = null;
        this.f41135G = null;
        this.f41138K = false;
        this.f41141N = false;
        this.f41137I = false;
        this.f41142O = false;
        i iVar = this.f41140M;
        I2 i22 = iVar.f41104z;
        synchronized (i22) {
            i22.f25433a = true;
            a9 = i22.a();
        }
        if (a9) {
            iVar.k();
        }
        this.f41140M = null;
        this.J = null;
        this.f41136H = 0;
        this.f41146w.D(this);
    }

    public final synchronized void h(J1.f fVar) {
        try {
            this.f41144u.a();
            o oVar = this.f41143n;
            oVar.f41127n.remove(new n(fVar, N1.g.f1917b));
            if (this.f41143n.f41127n.isEmpty()) {
                c();
                if (!this.f41137I) {
                    if (this.f41138K) {
                    }
                }
                if (this.f41131C.get() == 0) {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
