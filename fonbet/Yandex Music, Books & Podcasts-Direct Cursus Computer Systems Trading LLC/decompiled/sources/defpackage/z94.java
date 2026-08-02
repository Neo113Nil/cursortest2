package defpackage;

import java.util.ArrayDeque;

/* loaded from: classes.dex */
public abstract class z94 implements jpr {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public x94 d;
    public long e;
    public long f;
    public long g;

    public z94() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new x94(1));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            n nVar = new n(8, this);
            y94 y94Var = new y94(1);
            y94Var.l = nVar;
            arrayDeque.add(y94Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // defpackage.jpr
    public final void b(long j) {
        this.e = j;
    }

    public abstract rp7 c();

    public abstract void d(x94 x94Var);

    @Override // defpackage.fg7
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public qpr g() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            x94 x94Var = (x94) arrayDeque2.peek();
            int i = dvt.a;
            if (x94Var.k > this.e) {
                return null;
            }
            x94 x94Var2 = (x94) arrayDeque2.poll();
            boolean f = x94Var2.f(4);
            ArrayDeque arrayDeque3 = this.a;
            if (f) {
                qpr qprVar = (qpr) arrayDeque.pollFirst();
                qprVar.b(4);
                x94Var2.z();
                arrayDeque3.add(x94Var2);
                return qprVar;
            }
            d(x94Var2);
            if (j()) {
                rp7 c = c();
                qpr qprVar2 = (qpr) arrayDeque.pollFirst();
                long j = x94Var2.k;
                qprVar2.g = j;
                qprVar2.j = c;
                qprVar2.k = j;
                x94Var2.z();
                arrayDeque3.add(x94Var2);
                return qprVar2;
            }
            x94Var2.z();
            arrayDeque3.add(x94Var2);
        }
    }

    @Override // defpackage.fg7
    public final Object f() {
        vq1.A(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        x94 x94Var = (x94) arrayDeque.pollFirst();
        this.d = x94Var;
        return x94Var;
    }

    @Override // defpackage.fg7
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            x94 x94Var = (x94) arrayDeque2.poll();
            int i = dvt.a;
            x94Var.z();
            arrayDeque.add(x94Var);
        }
        x94 x94Var2 = this.d;
        if (x94Var2 != null) {
            x94Var2.z();
            arrayDeque.add(x94Var2);
            this.d = null;
        }
    }

    @Override // defpackage.fg7
    public final void h(ppr pprVar) {
        vq1.v(pprVar == this.d);
        x94 x94Var = (x94) pprVar;
        if (!x94Var.f(4)) {
            long j = x94Var.k;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    x94Var.z();
                    this.a.add(x94Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        x94Var.o = j3;
        this.c.add(x94Var);
        this.d = null;
    }

    @Override // defpackage.fg7
    public final void i(long j) {
        this.g = j;
    }

    public abstract boolean j();

    @Override // defpackage.fg7
    public void a() {
    }
}
