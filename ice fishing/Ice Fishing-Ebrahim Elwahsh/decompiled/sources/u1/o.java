package u1;

import com.google.android.gms.internal.ads.G2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class o implements O1.b {

    /* renamed from: P, reason: collision with root package name */
    public static final C3.e f41145P = new C3.e();

    /* renamed from: A, reason: collision with root package name */
    public final x1.d f41146A;

    /* renamed from: B, reason: collision with root package name */
    public final x1.d f41147B;

    /* renamed from: C, reason: collision with root package name */
    public final AtomicInteger f41148C;

    /* renamed from: D, reason: collision with root package name */
    public p f41149D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f41150E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f41151F;

    /* renamed from: G, reason: collision with root package name */
    public x f41152G;

    /* renamed from: H, reason: collision with root package name */
    public int f41153H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f41154I;
    public s J;

    /* renamed from: K, reason: collision with root package name */
    public boolean f41155K;

    /* renamed from: L, reason: collision with root package name */
    public q f41156L;

    /* renamed from: M, reason: collision with root package name */
    public h f41157M;

    /* renamed from: N, reason: collision with root package name */
    public volatile boolean f41158N;

    /* renamed from: O, reason: collision with root package name */
    public boolean f41159O;

    /* renamed from: n, reason: collision with root package name */
    public final n f41160n;

    /* renamed from: u, reason: collision with root package name */
    public final O1.e f41161u;

    /* renamed from: v, reason: collision with root package name */
    public final k f41162v;

    /* renamed from: w, reason: collision with root package name */
    public final Y2.e f41163w;

    /* renamed from: x, reason: collision with root package name */
    public final C3.e f41164x;

    /* renamed from: y, reason: collision with root package name */
    public final k f41165y;

    /* renamed from: z, reason: collision with root package name */
    public final x1.d f41166z;

    public o(x1.d dVar, x1.d dVar2, x1.d dVar3, x1.d dVar4, k kVar, k kVar2, Y2.e eVar) {
        C3.e eVar2 = f41145P;
        this.f41160n = new n(new ArrayList(2));
        this.f41161u = new O1.e();
        this.f41148C = new AtomicInteger();
        this.f41166z = dVar;
        this.f41146A = dVar2;
        this.f41147B = dVar4;
        this.f41165y = kVar;
        this.f41162v = kVar2;
        this.f41163w = eVar;
        this.f41164x = eVar2;
    }

    public final synchronized void a(J1.f fVar, N1.f fVar2) {
        try {
            this.f41161u.a();
            n nVar = this.f41160n;
            nVar.getClass();
            nVar.f41144n.add(new m(fVar, fVar2));
            if (this.f41154I) {
                e(1);
                l lVar = new l(this, fVar, 1);
                fVar2.getClass();
                N1.p.j(lVar);
            } else if (this.f41155K) {
                e(1);
                l lVar2 = new l(this, fVar, 0);
                fVar2.getClass();
                N1.p.j(lVar2);
            } else {
                N1.g.a("Cannot add callbacks to a cancelled EngineJob", !this.f41158N);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // O1.b
    public final O1.e b() {
        return this.f41161u;
    }

    public final void c() {
        if (f()) {
            return;
        }
        this.f41158N = true;
        h hVar = this.f41157M;
        hVar.f41111V = true;
        InterfaceC5106f interfaceC5106f = hVar.f41109T;
        if (interfaceC5106f != null) {
            interfaceC5106f.cancel();
        }
        k kVar = this.f41165y;
        p pVar = this.f41149D;
        synchronized (kVar) {
            u uVar = kVar.f41132a;
            uVar.getClass();
            HashMap hashMap = (HashMap) uVar.f41190n;
            if (equals(hashMap.get(pVar))) {
                hashMap.remove(pVar);
            }
        }
    }

    public final void d() {
        q qVar;
        synchronized (this) {
            try {
                this.f41161u.a();
                N1.g.a("Not yet complete!", f());
                int decrementAndGet = this.f41148C.decrementAndGet();
                N1.g.a("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    qVar = this.f41156L;
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

    public final synchronized void e(int i) {
        q qVar;
        N1.g.a("Not yet complete!", f());
        if (this.f41148C.getAndAdd(i) == 0 && (qVar = this.f41156L) != null) {
            qVar.b();
        }
    }

    public final boolean f() {
        return this.f41155K || this.f41154I || this.f41158N;
    }

    public final synchronized void g() {
        boolean a9;
        if (this.f41149D == null) {
            throw new IllegalArgumentException();
        }
        this.f41160n.f41144n.clear();
        this.f41149D = null;
        this.f41156L = null;
        this.f41152G = null;
        this.f41155K = false;
        this.f41158N = false;
        this.f41154I = false;
        this.f41159O = false;
        h hVar = this.f41157M;
        G2 g22 = hVar.f41121z;
        synchronized (g22) {
            g22.f25091a = true;
            a9 = g22.a();
        }
        if (a9) {
            hVar.k();
        }
        this.f41157M = null;
        this.J = null;
        this.f41153H = 0;
        this.f41163w.G(this);
    }

    public final synchronized void h(J1.f fVar) {
        try {
            this.f41161u.a();
            n nVar = this.f41160n;
            nVar.f41144n.remove(new m(fVar, N1.g.f1961b));
            if (this.f41160n.f41144n.isEmpty()) {
                c();
                if (!this.f41154I) {
                    if (this.f41155K) {
                    }
                }
                if (this.f41148C.get() == 0) {
                    g();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
