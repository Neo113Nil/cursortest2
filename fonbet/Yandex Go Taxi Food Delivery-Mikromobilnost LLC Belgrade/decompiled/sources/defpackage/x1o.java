package defpackage;

import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.load.engine.b;
import com.bumptech.glide.load.engine.c;
import com.bumptech.glide.load.engine.d;
import com.bumptech.glide.request.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes10.dex */
public final class x1o implements x7p {
    public static final m501 P = new m501(22);
    public final yht A;
    public final yht B;
    public y1o D;
    public boolean E;
    public boolean F;
    public otj0 G;
    public DataSource H;
    public boolean I;
    public GlideException J;
    public boolean K;
    public b2o L;
    public b M;
    public volatile boolean N;
    public boolean O;
    public final c c;
    public final l6e0 w;
    public final c y;
    public final yht z;
    public final w1o a = new w1o(new ArrayList(2));
    public final c6u0 b = new c6u0();
    public final AtomicInteger C = new AtomicInteger();
    public final m501 x = P;

    public x1o(yht yhtVar, yht yhtVar2, yht yhtVar3, yht yhtVar4, c cVar, c cVar2, jdj jdjVar) {
        this.z = yhtVar;
        this.A = yhtVar2;
        this.B = yhtVar4;
        this.y = cVar;
        this.c = cVar2;
        this.w = jdjVar;
    }

    public final synchronized void a(a aVar, Executor executor) {
        try {
            this.b.a();
            this.a.a.add(new v1o(aVar, executor));
            int i = 1;
            if (this.I) {
                c(1);
                executor.execute(new d(this, aVar, i));
            } else if (this.K) {
                c(1);
                executor.execute(new d(this, aVar, 0));
            } else {
                z2a1.c("Cannot add callbacks to a cancelled EngineJob", !this.N);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void b() {
        b2o b2oVar;
        synchronized (this) {
            try {
                this.b.a();
                z2a1.c("Not yet complete!", e());
                int decrementAndGet = this.C.decrementAndGet();
                z2a1.c("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    b2oVar = this.L;
                    f();
                } else {
                    b2oVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (b2oVar != null) {
            b2oVar.d();
        }
    }

    public final synchronized void c(int i) {
        b2o b2oVar;
        z2a1.c("Not yet complete!", e());
        if (this.C.getAndAdd(i) == 0 && (b2oVar = this.L) != null) {
            b2oVar.c();
        }
    }

    @Override // defpackage.x7p
    public final c6u0 d() {
        return this.b;
    }

    public final boolean e() {
        return this.K || this.I || this.N;
    }

    public final synchronized void f() {
        boolean a;
        if (this.D == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.D = null;
        this.L = null;
        this.G = null;
        this.K = false;
        this.N = false;
        this.I = false;
        this.O = false;
        b bVar = this.M;
        xi6 xi6Var = bVar.z;
        synchronized (xi6Var) {
            xi6Var.a = true;
            a = xi6Var.a();
        }
        if (a) {
            bVar.j();
        }
        this.M = null;
        this.J = null;
        this.H = null;
        this.w.a0(this);
    }

    public final synchronized void g(a aVar) {
        try {
            this.b.a();
            this.a.a.remove(new v1o(aVar, ph91.b));
            if (this.a.a.isEmpty()) {
                if (!e()) {
                    this.N = true;
                    b bVar = this.M;
                    bVar.V = true;
                    iog iogVar = bVar.T;
                    if (iogVar != null) {
                        iogVar.cancel();
                    }
                    c cVar = this.y;
                    y1o y1oVar = this.D;
                    synchronized (cVar) {
                        bsr bsrVar = cVar.a;
                        bsrVar.getClass();
                        HashMap hashMap = bsrVar.a;
                        if (this == hashMap.get(y1oVar)) {
                            hashMap.remove(y1oVar);
                        }
                    }
                }
                if (!this.I) {
                    if (this.K) {
                    }
                }
                if (this.C.get() == 0) {
                    f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
