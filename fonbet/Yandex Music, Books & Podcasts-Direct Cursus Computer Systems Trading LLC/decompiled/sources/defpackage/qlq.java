package defpackage;

/* loaded from: classes.dex */
public final class qlq extends fs2 {
    public final int o;
    public final dsc p;
    public long q;
    public boolean r;

    public qlq(db7 db7Var, nb7 nb7Var, dsc dscVar, int i, Object obj, long j, long j2, long j3, int i2, dsc dscVar2) {
        super(db7Var, nb7Var, dscVar, i, obj, j, j2, -9223372036854775807L, -9223372036854775807L, j3);
        this.o = i2;
        this.p = dscVar2;
    }

    @Override // defpackage.jgg
    public final void a() {
        ngr ngrVar = this.i;
        le3 le3Var = this.m;
        vq1.B(le3Var);
        le3Var.n(0L);
        azs o = le3Var.o(this.o);
        o.d(this.p);
        try {
            long a = ngrVar.a(this.b.d(this.q));
            if (a != -1) {
                a += this.q;
            }
            gm7 gm7Var = new gm7(this.i, this.q, a);
            int i = 0;
            while (true) {
                long j = this.q;
                if (i == -1) {
                    o.a(this.g, 1, (int) j, 0, null);
                    hld.x(ngrVar);
                    this.r = true;
                    return;
                }
                this.q = j + i;
                i = o.c(gm7Var, Integer.MAX_VALUE, true);
            }
        } catch (Throwable th) {
            hld.x(ngrVar);
            throw th;
        }
    }

    @Override // defpackage.dih
    public final boolean c() {
        return this.r;
    }

    @Override // defpackage.jgg
    public final void f() {
    }
}
