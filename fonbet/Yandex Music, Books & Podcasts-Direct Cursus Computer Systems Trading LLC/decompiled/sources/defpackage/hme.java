package defpackage;

/* loaded from: classes.dex */
public final class hme extends sk4 {
    public final xk3 j;
    public le3 k;
    public long l;
    public volatile boolean m;

    public hme(db7 db7Var, nb7 nb7Var, dsc dscVar, int i, Object obj, xk3 xk3Var) {
        super(db7Var, nb7Var, 2, dscVar, i, obj, -9223372036854775807L, -9223372036854775807L);
        this.j = xk3Var;
    }

    @Override // defpackage.jgg
    public final void a() {
        if (this.l == 0) {
            this.j.b(this.k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            nb7 d = this.b.d(this.l);
            ngr ngrVar = this.i;
            gm7 gm7Var = new gm7(ngrVar, d.f, ngrVar.a(d));
            while (!this.m && this.j.c(gm7Var)) {
                try {
                } finally {
                    this.l = gm7Var.d - this.b.f;
                    this.j.a();
                }
            }
        } finally {
            hld.x(this.i);
        }
    }

    @Override // defpackage.jgg
    public final void f() {
        this.m = true;
    }
}
