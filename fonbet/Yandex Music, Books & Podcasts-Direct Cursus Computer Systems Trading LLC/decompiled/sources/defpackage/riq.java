package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class riq implements fg7 {
    public final l2f a;
    public final qg7[] e;
    public final rg7[] f;
    public int g;
    public int h;
    public qg7 i;
    public og7 j;
    public boolean k;
    public boolean l;
    public int m;
    public final Object b = new Object();
    public long n = -9223372036854775807L;
    public final ArrayDeque c = new ArrayDeque();
    public final ArrayDeque d = new ArrayDeque();

    public riq(qg7[] qg7VarArr, rg7[] rg7VarArr) {
        this.e = qg7VarArr;
        this.g = qg7VarArr.length;
        for (int i = 0; i < this.g; i++) {
            this.e[i] = c();
        }
        this.f = rg7VarArr;
        this.h = rg7VarArr.length;
        for (int i2 = 0; i2 < this.h; i2++) {
            this.f[i2] = d();
        }
        l2f l2fVar = new l2f(this);
        this.a = l2fVar;
        l2fVar.start();
    }

    @Override // defpackage.fg7
    public void a() {
        synchronized (this.b) {
            this.l = true;
            this.b.notify();
        }
        try {
            this.a.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    public abstract qg7 c();

    public abstract rg7 d();

    public abstract og7 e(Throwable th);

    @Override // defpackage.fg7
    public final Object f() {
        qg7 qg7Var;
        synchronized (this.b) {
            try {
                og7 og7Var = this.j;
                if (og7Var != null) {
                    throw og7Var;
                }
                vq1.A(this.i == null);
                int i = this.g;
                if (i == 0) {
                    qg7Var = null;
                } else {
                    qg7[] qg7VarArr = this.e;
                    int i2 = i - 1;
                    this.g = i2;
                    qg7Var = qg7VarArr[i2];
                }
                this.i = qg7Var;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qg7Var;
    }

    @Override // defpackage.fg7
    public final void flush() {
        synchronized (this.b) {
            try {
                this.k = true;
                this.m = 0;
                qg7 qg7Var = this.i;
                if (qg7Var != null) {
                    qg7Var.z();
                    qg7[] qg7VarArr = this.e;
                    int i = this.g;
                    this.g = i + 1;
                    qg7VarArr[i] = qg7Var;
                    this.i = null;
                }
                while (!this.c.isEmpty()) {
                    qg7 qg7Var2 = (qg7) this.c.removeFirst();
                    qg7Var2.z();
                    qg7[] qg7VarArr2 = this.e;
                    int i2 = this.g;
                    this.g = i2 + 1;
                    qg7VarArr2[i2] = qg7Var2;
                }
                while (!this.d.isEmpty()) {
                    ((rg7) this.d.removeFirst()).A();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fg7
    public final void i(long j) {
        boolean z;
        synchronized (this.b) {
            try {
                if (this.g != this.e.length && !this.k) {
                    z = false;
                    vq1.A(z);
                    this.n = j;
                }
                z = true;
                vq1.A(z);
                this.n = j;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract og7 j(qg7 qg7Var, rg7 rg7Var, boolean z);

    public final boolean k() {
        boolean z;
        og7 e;
        synchronized (this.b) {
            while (!this.l) {
                try {
                    if (!this.c.isEmpty() && this.h > 0) {
                        break;
                    }
                    this.b.wait();
                } finally {
                }
            }
            if (this.l) {
                return false;
            }
            qg7 qg7Var = (qg7) this.c.removeFirst();
            rg7[] rg7VarArr = this.f;
            int i = this.h - 1;
            this.h = i;
            rg7 rg7Var = rg7VarArr[i];
            boolean z2 = this.k;
            this.k = false;
            if (qg7Var.f(4)) {
                rg7Var.b(4);
            } else {
                rg7Var.g = qg7Var.k;
                if (qg7Var.f(134217728)) {
                    rg7Var.b(134217728);
                }
                long j = qg7Var.k;
                synchronized (this.b) {
                    long j2 = this.n;
                    if (j2 != -9223372036854775807L && j < j2) {
                        z = false;
                    }
                    z = true;
                }
                if (!z) {
                    rg7Var.i = true;
                }
                try {
                    e = j(qg7Var, rg7Var, z2);
                } catch (OutOfMemoryError e2) {
                    e = e(e2);
                } catch (RuntimeException e3) {
                    e = e(e3);
                }
                if (e != null) {
                    synchronized (this.b) {
                        this.j = e;
                    }
                    return false;
                }
            }
            synchronized (this.b) {
                try {
                    if (this.k) {
                        rg7Var.A();
                    } else {
                        boolean z3 = rg7Var.i;
                        int i2 = this.m;
                        if (z3) {
                            this.m = i2 + 1;
                            rg7Var.A();
                        } else {
                            rg7Var.h = i2;
                            this.m = 0;
                            this.d.addLast(rg7Var);
                        }
                    }
                    qg7Var.z();
                    qg7[] qg7VarArr = this.e;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    qg7VarArr[i3] = qg7Var;
                } finally {
                }
            }
            return true;
        }
    }

    @Override // defpackage.fg7
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final rg7 g() {
        synchronized (this.b) {
            try {
                og7 og7Var = this.j;
                if (og7Var != null) {
                    throw og7Var;
                }
                if (this.d.isEmpty()) {
                    return null;
                }
                return (rg7) this.d.removeFirst();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.fg7
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void h(qg7 qg7Var) {
        synchronized (this.b) {
            try {
                og7 og7Var = this.j;
                if (og7Var != null) {
                    throw og7Var;
                }
                vq1.v(qg7Var == this.i);
                this.c.addLast(qg7Var);
                if (!this.c.isEmpty() && this.h > 0) {
                    this.b.notify();
                }
                this.i = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void n(rg7 rg7Var) {
        synchronized (this.b) {
            rg7Var.z();
            rg7[] rg7VarArr = this.f;
            int i = this.h;
            this.h = i + 1;
            rg7VarArr[i] = rg7Var;
            if (!this.c.isEmpty() && this.h > 0) {
                this.b.notify();
            }
        }
    }
}
