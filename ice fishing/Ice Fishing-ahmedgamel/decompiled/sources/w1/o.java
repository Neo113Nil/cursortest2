package w1;

import A1.A;
import com.google.android.gms.internal.ads.I2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o implements Q1.b {

    /* renamed from: P, reason: collision with root package name */
    public static final O2.i f41514P = new O2.i(28);

    /* renamed from: A, reason: collision with root package name */
    public final z1.d f41515A;

    /* renamed from: B, reason: collision with root package name */
    public final z1.d f41516B;

    /* renamed from: C, reason: collision with root package name */
    public final AtomicInteger f41517C;

    /* renamed from: D, reason: collision with root package name */
    public p f41518D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f41519E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f41520F;

    /* renamed from: G, reason: collision with root package name */
    public w f41521G;

    /* renamed from: H, reason: collision with root package name */
    public int f41522H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f41523I;
    public s J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f41524K;

    /* renamed from: L, reason: collision with root package name */
    public q f41525L;

    /* renamed from: M, reason: collision with root package name */
    public h f41526M;

    /* renamed from: N, reason: collision with root package name */
    public volatile boolean f41527N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f41528O;

    /* renamed from: n, reason: collision with root package name */
    public final n f41529n;

    /* renamed from: u, reason: collision with root package name */
    public final Q1.e f41530u;

    /* renamed from: v, reason: collision with root package name */
    public final k f41531v;

    /* renamed from: w, reason: collision with root package name */
    public final b3.e f41532w;

    /* renamed from: x, reason: collision with root package name */
    public final O2.i f41533x;

    /* renamed from: y, reason: collision with root package name */
    public final k f41534y;

    /* renamed from: z, reason: collision with root package name */
    public final z1.d f41535z;

    public o(z1.d dVar, z1.d dVar2, z1.d dVar3, z1.d dVar4, k kVar, k kVar2, b3.e eVar) {
        O2.i iVar = f41514P;
        this.f41529n = new n(new ArrayList(2));
        this.f41530u = new Q1.e();
        this.f41517C = new AtomicInteger();
        this.f41535z = dVar;
        this.f41515A = dVar2;
        this.f41516B = dVar4;
        this.f41534y = kVar;
        this.f41531v = kVar2;
        this.f41532w = eVar;
        this.f41533x = iVar;
    }

    public final synchronized void a(L1.f fVar, P1.f fVar2) {
        try {
            this.f41530u.a();
            n nVar = this.f41529n;
            nVar.getClass();
            nVar.f41513n.add(new m(fVar, fVar2));
            if (this.f41523I) {
                e(1);
                l lVar = new l(this, fVar, 1);
                fVar2.getClass();
                P1.p.j(lVar);
            } else if (this.f41524K) {
                e(1);
                l lVar2 = new l(this, fVar, 0);
                fVar2.getClass();
                P1.p.j(lVar2);
            } else {
                P1.g.a("Cannot add callbacks to a cancelled EngineJob", !this.f41527N);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.f41527N = true;
        h hVar = this.f41526M;
        hVar.f41480V = true;
        InterfaceC5138f interfaceC5138f = hVar.f41478T;
        if (interfaceC5138f != null) {
            interfaceC5138f.cancel();
        }
        k kVar = this.f41534y;
        p pVar = this.f41518D;
        synchronized (kVar) {
            A a9 = kVar.f41501a;
            a9.getClass();
            HashMap hashMap = a9.f11a;
            if (equals(hashMap.get(pVar))) {
                hashMap.remove(pVar);
            }
        }
    }

    public final void c() {
        q qVar;
        synchronized (this) {
            try {
                this.f41530u.a();
                P1.g.a("Not yet complete!", f());
                int decrementAndGet = this.f41517C.decrementAndGet();
                P1.g.a("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    qVar = this.f41525L;
                    g();
                } else {
                    qVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (qVar != null) {
            qVar.e();
        }
    }

    @Override // Q1.b
    public final Q1.e d() {
        return this.f41530u;
    }

    public final synchronized void e(int i) {
        q qVar;
        P1.g.a("Not yet complete!", f());
        if (this.f41517C.getAndAdd(i) == 0 && (qVar = this.f41525L) != null) {
            qVar.d();
        }
    }

    public final boolean f() {
        return this.f41524K || this.f41523I || this.f41527N;
    }

    public final synchronized void g() {
        boolean a9;
        if (this.f41518D == null) {
            throw new IllegalArgumentException();
        }
        this.f41529n.f41513n.clear();
        this.f41518D = null;
        this.f41525L = null;
        this.f41521G = null;
        this.f41524K = false;
        this.f41527N = false;
        this.f41523I = false;
        this.f41528O = false;
        h hVar = this.f41526M;
        I2 i22 = hVar.f41490z;
        synchronized (i22) {
            i22.f26176a = true;
            a9 = i22.a();
        }
        if (a9) {
            hVar.k();
        }
        this.f41526M = null;
        this.J = null;
        this.f41522H = 0;
        this.f41532w.D(this);
    }

    public final synchronized void h(L1.f fVar) {
        try {
            this.f41530u.a();
            n nVar = this.f41529n;
            nVar.f41513n.remove(new m(fVar, P1.g.f2361b));
            if (this.f41529n.f41513n.isEmpty()) {
                b();
                if (!this.f41523I) {
                    if (this.f41524K) {
                    }
                }
                if (this.f41517C.get() == 0) {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
