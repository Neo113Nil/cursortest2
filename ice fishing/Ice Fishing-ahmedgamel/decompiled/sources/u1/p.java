package u1;

import com.google.android.gms.internal.ads.I2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class p implements O1.b {

    /* renamed from: P, reason: collision with root package name */
    public static final a4.e f41131P = new a4.e();

    /* renamed from: A, reason: collision with root package name */
    public final x1.d f41132A;

    /* renamed from: B, reason: collision with root package name */
    public final x1.d f41133B;

    /* renamed from: C, reason: collision with root package name */
    public final AtomicInteger f41134C;

    /* renamed from: D, reason: collision with root package name */
    public q f41135D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f41136E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f41137F;

    /* renamed from: G, reason: collision with root package name */
    public x f41138G;

    /* renamed from: H, reason: collision with root package name */
    public int f41139H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f41140I;
    public t J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f41141K;

    /* renamed from: L, reason: collision with root package name */
    public r f41142L;

    /* renamed from: M, reason: collision with root package name */
    public i f41143M;

    /* renamed from: N, reason: collision with root package name */
    public volatile boolean f41144N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f41145O;

    /* renamed from: n, reason: collision with root package name */
    public final o f41146n;

    /* renamed from: u, reason: collision with root package name */
    public final O1.e f41147u;

    /* renamed from: v, reason: collision with root package name */
    public final l f41148v;

    /* renamed from: w, reason: collision with root package name */
    public final Z2.e f41149w;

    /* renamed from: x, reason: collision with root package name */
    public final a4.e f41150x;

    /* renamed from: y, reason: collision with root package name */
    public final l f41151y;

    /* renamed from: z, reason: collision with root package name */
    public final x1.d f41152z;

    public p(x1.d dVar, x1.d dVar2, x1.d dVar3, x1.d dVar4, l lVar, l lVar2, Z2.e eVar) {
        a4.e eVar2 = f41131P;
        this.f41146n = new o(new ArrayList(2));
        this.f41147u = new O1.e();
        this.f41134C = new AtomicInteger();
        this.f41152z = dVar;
        this.f41132A = dVar2;
        this.f41133B = dVar4;
        this.f41151y = lVar;
        this.f41148v = lVar2;
        this.f41149w = eVar;
        this.f41150x = eVar2;
    }

    public final synchronized void a(J1.f fVar, N1.f fVar2) {
        try {
            this.f41147u.a();
            o oVar = this.f41146n;
            oVar.getClass();
            oVar.f41130n.add(new n(fVar, fVar2));
            if (this.f41140I) {
                e(1);
                m mVar = new m(this, fVar, 1);
                fVar2.getClass();
                N1.p.j(mVar);
            } else if (this.f41141K) {
                e(1);
                m mVar2 = new m(this, fVar, 0);
                fVar2.getClass();
                N1.p.j(mVar2);
            } else {
                N1.g.a("Cannot add callbacks to a cancelled EngineJob", !this.f41144N);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41147u;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.f41144N = true;
        i iVar = this.f41143M;
        iVar.f41097V = true;
        InterfaceC5067f interfaceC5067f = iVar.f41095T;
        if (interfaceC5067f != null) {
            interfaceC5067f.cancel();
        }
        l lVar = this.f41151y;
        q qVar = this.f41135D;
        synchronized (lVar) {
            J0.g gVar = lVar.f41118a;
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
                this.f41147u.a();
                N1.g.a("Not yet complete!", f());
                int decrementAndGet = this.f41134C.decrementAndGet();
                N1.g.a("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    rVar = this.f41142L;
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
        if (this.f41134C.getAndAdd(i) == 0 && (rVar = this.f41142L) != null) {
            rVar.b();
        }
    }

    public final boolean f() {
        return this.f41141K || this.f41140I || this.f41144N;
    }

    public final synchronized void g() {
        boolean a9;
        if (this.f41135D == null) {
            throw new IllegalArgumentException();
        }
        this.f41146n.f41130n.clear();
        this.f41135D = null;
        this.f41142L = null;
        this.f41138G = null;
        this.f41141K = false;
        this.f41144N = false;
        this.f41140I = false;
        this.f41145O = false;
        i iVar = this.f41143M;
        I2 i22 = iVar.f41107z;
        synchronized (i22) {
            i22.f25433a = true;
            a9 = i22.a();
        }
        if (a9) {
            iVar.k();
        }
        this.f41143M = null;
        this.J = null;
        this.f41139H = 0;
        this.f41149w.D(this);
    }

    public final synchronized void h(J1.f fVar) {
        try {
            this.f41147u.a();
            o oVar = this.f41146n;
            oVar.f41130n.remove(new n(fVar, N1.g.f1917b));
            if (this.f41146n.f41130n.isEmpty()) {
                c();
                if (!this.f41140I) {
                    if (this.f41141K) {
                    }
                }
                if (this.f41134C.get() == 0) {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
