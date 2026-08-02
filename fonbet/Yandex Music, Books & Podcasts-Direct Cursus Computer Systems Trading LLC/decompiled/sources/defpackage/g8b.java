package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class g8b implements r3c {
    public static final bs4 v = new bs4(22);
    public final q7b c;
    public final chm d;
    public final q7b f;
    public final rdc g;
    public final rdc h;
    public final rdc i;
    public h8b k;
    public boolean l;
    public boolean m;
    public k2o n;
    public int o;
    public boolean p;
    public lld q;
    public boolean r;
    public j8b s;
    public xf7 t;
    public volatile boolean u;
    public final f8b a = new f8b(new ArrayList(2));
    public final uer b = new uer();
    public final AtomicInteger j = new AtomicInteger();
    public final bs4 e = v;

    public g8b(rdc rdcVar, rdc rdcVar2, rdc rdcVar3, rdc rdcVar4, q7b q7bVar, q7b q7bVar2, vx6 vx6Var) {
        this.g = rdcVar;
        this.h = rdcVar2;
        this.i = rdcVar4;
        this.f = q7bVar;
        this.c = q7bVar2;
        this.d = vx6Var;
    }

    public final synchronized void a(jlq jlqVar, Executor executor) {
        try {
            this.b.a();
            this.a.a.add(new e8b(jlqVar, executor));
            if (this.p) {
                d(1);
                executor.execute(new d8b(this, jlqVar, 1));
            } else if (this.r) {
                d(1);
                executor.execute(new d8b(this, jlqVar, 0));
            } else {
                w1g.q("Cannot add callbacks to a cancelled EngineJob", !this.u);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.r3c
    public final uer b() {
        return this.b;
    }

    public final void c() {
        j8b j8bVar;
        synchronized (this) {
            try {
                this.b.a();
                w1g.q("Not yet complete!", e());
                int decrementAndGet = this.j.decrementAndGet();
                w1g.q("Can't decrement below 0", decrementAndGet >= 0);
                if (decrementAndGet == 0) {
                    j8bVar = this.s;
                    f();
                } else {
                    j8bVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (j8bVar != null) {
            j8bVar.b();
        }
    }

    public final synchronized void d(int i) {
        j8b j8bVar;
        w1g.q("Not yet complete!", e());
        if (this.j.getAndAdd(i) == 0 && (j8bVar = this.s) != null) {
            j8bVar.a();
        }
    }

    public final boolean e() {
        return this.r || this.p || this.u;
    }

    public final synchronized void f() {
        boolean b;
        if (this.k == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.k = null;
        this.s = null;
        this.n = null;
        this.r = false;
        this.u = false;
        this.p = false;
        xf7 xf7Var = this.t;
        hx1 hx1Var = xf7Var.g;
        synchronized (hx1Var) {
            hx1Var.a = true;
            b = hx1Var.b();
        }
        if (b) {
            xf7Var.l();
        }
        this.t = null;
        this.q = null;
        this.o = 0;
        this.d.c(this);
    }

    public final synchronized void g(jlq jlqVar) {
        try {
            this.b.a();
            this.a.a.remove(new e8b(jlqVar, saf.k));
            if (this.a.a.isEmpty()) {
                if (!e()) {
                    this.u = true;
                    xf7 xf7Var = this.t;
                    xf7Var.A = true;
                    ea7 ea7Var = xf7Var.y;
                    if (ea7Var != null) {
                        ea7Var.cancel();
                    }
                    q7b q7bVar = this.f;
                    h8b h8bVar = this.k;
                    synchronized (q7bVar) {
                        h4b h4bVar = q7bVar.a;
                        h4bVar.getClass();
                        HashMap hashMap = (HashMap) h4bVar.a;
                        if (equals(hashMap.get(h8bVar))) {
                            hashMap.remove(h8bVar);
                        }
                    }
                }
                if (!this.p) {
                    if (this.r) {
                    }
                }
                if (this.j.get() == 0) {
                    f();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
