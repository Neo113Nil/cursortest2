package defpackage;

/* loaded from: classes.dex */
public final class olq implements r2c {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public t2c f;
    public azs g;

    public olq(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        int i = this.b;
        int i2 = this.a;
        vq1.A((i2 == -1 || i == -1) ? false : true);
        d7k d7kVar = new d7k(i);
        ((gm7) s2cVar).l(d7kVar.a, 0, i, false);
        return d7kVar.B() == i2;
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            e7o.n();
            return 0;
        }
        azs azsVar = this.g;
        azsVar.getClass();
        int c = azsVar.c(s2cVar, 1024, true);
        if (c != -1) {
            this.d += c;
            return 0;
        }
        this.e = 2;
        this.g.a(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.f = t2cVar;
        azs M = t2cVar.M(1024, 4);
        this.g = M;
        bsc bscVar = new bsc();
        String str = this.c;
        bscVar.l = l5i.p(str);
        bscVar.m = l5i.p(str);
        eta.o(bscVar, M);
        this.f.K();
        this.f.E(new vlq());
        this.e = 1;
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
