package defpackage;

/* loaded from: classes.dex */
public final class hb6 extends fs2 {
    public final int o;
    public final long p;
    public final xk3 q;
    public long r;
    public volatile boolean s;
    public boolean t;

    public hb6(db7 db7Var, nb7 nb7Var, dsc dscVar, int i, Object obj, long j, long j2, long j3, long j4, long j5, int i2, long j6, xk3 xk3Var) {
        super(db7Var, nb7Var, dscVar, i, obj, j, j2, j3, j4, j5);
        this.o = i2;
        this.p = j6;
        this.q = xk3Var;
    }

    @Override // defpackage.jgg
    public final void a() {
        le3 le3Var = this.m;
        vq1.B(le3Var);
        if (this.r == 0) {
            le3Var.n(this.p);
            xk3 xk3Var = this.q;
            long j = this.k;
            long j2 = j == -9223372036854775807L ? -9223372036854775807L : j - this.p;
            long j3 = this.l;
            xk3Var.b(le3Var, j2, j3 != -9223372036854775807L ? j3 - this.p : -9223372036854775807L);
        }
        try {
            nb7 d = this.b.d(this.r);
            ngr ngrVar = this.i;
            gm7 gm7Var = new gm7(ngrVar, d.f, ngrVar.a(d));
            do {
                try {
                    if (this.s) {
                        break;
                    }
                } finally {
                    this.r = gm7Var.d - this.b.f;
                }
            } while (this.q.c(gm7Var));
            dsc dscVar = this.d;
            String str = dscVar.m;
            int i = dscVar.K;
            int i2 = dscVar.L;
            if (l5i.m(str) && ((i > 1 || i2 > 1) && i != -1 && i2 != -1)) {
                azs o = le3Var.o(4);
                int i3 = i * i2;
                long j4 = (this.h - this.g) / i3;
                for (int i4 = 1; i4 < i3; i4++) {
                    o.b(new d7k(), 0, 0);
                    o.a(i4 * j4, 0, 0, 0, null);
                }
            }
            hld.x(this.i);
            this.t = !this.s;
        } catch (Throwable th) {
            hld.x(this.i);
            throw th;
        }
    }

    @Override // defpackage.dih
    public final long b() {
        return this.j + this.o;
    }

    @Override // defpackage.dih
    public final boolean c() {
        return this.t;
    }

    @Override // defpackage.jgg
    public final void f() {
        this.s = true;
    }
}
