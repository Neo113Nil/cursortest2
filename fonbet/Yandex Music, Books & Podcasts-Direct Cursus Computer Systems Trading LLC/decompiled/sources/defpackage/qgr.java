package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes5.dex */
public final class qgr {
    public static final qgr c = new qgr(new qo4[0]);
    public final qo4[] a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public qgr(qo4[] qo4VarArr) {
        this.a = qo4VarArr;
    }

    public final void a(long j) {
        for (qo4 qo4Var : this.a) {
            qo4Var.f(j);
        }
    }

    public final void b(long j) {
        for (qo4 qo4Var : this.a) {
            qo4Var.g(j);
        }
    }

    public final void c(int i) {
        for (qo4 qo4Var : this.a) {
            qo4Var.i(i);
        }
    }

    public final void d(int i, long j, long j2) {
        for (qo4 qo4Var : this.a) {
            qo4Var.j(i, j, j2);
        }
    }

    public final void e(long j) {
        for (qo4 qo4Var : this.a) {
            qo4Var.k(j);
        }
    }

    public final void f(long j) {
        for (qo4 qo4Var : this.a) {
            qo4Var.l(j);
        }
    }

    public final void g(sgr sgrVar) {
        if (this.b.compareAndSet(false, true)) {
            for (qo4 qo4Var : this.a) {
                qo4Var.m(sgrVar);
            }
        }
    }
}
