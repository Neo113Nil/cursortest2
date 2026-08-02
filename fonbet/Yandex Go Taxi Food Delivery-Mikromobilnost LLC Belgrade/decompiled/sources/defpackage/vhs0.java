package defpackage;

/* loaded from: classes10.dex */
public final class vhs0 implements b5p {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public int e;
    public d5p f;
    public g001 g;

    public vhs0(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    @Override // defpackage.b5p
    public final void a(long j, long j2) {
        if (j == 0 || this.e == 1) {
            this.e = 1;
            this.d = 0;
        }
    }

    @Override // defpackage.b5p
    public final void e(d5p d5pVar) {
        this.f = d5pVar;
        g001 B = d5pVar.B(1024, 4);
        this.g = B;
        f7s f7sVar = new f7s();
        String str = this.c;
        f7sVar.l = eh20.q(str);
        f7sVar.m = eh20.q(str);
        smw0.u(f7sVar, B);
        this.f.A();
        this.f.w(new cis0());
        this.e = 1;
    }

    @Override // defpackage.b5p
    public final int g(c5p c5pVar, xde0 xde0Var) {
        int i = this.e;
        if (i != 1) {
            if (i == 2) {
                return -1;
            }
            ny61.k();
            return 0;
        }
        g001 g001Var = this.g;
        g001Var.getClass();
        int b = g001Var.b(c5pVar, 1024, true);
        if (b != -1) {
            this.d += b;
            return 0;
        }
        this.e = 2;
        this.g.c(0L, 1, this.d, 0, null);
        this.d = 0;
        return 0;
    }

    @Override // defpackage.b5p
    public final boolean h(c5p c5pVar) {
        int i = this.b;
        int i2 = this.a;
        d6z.x((i2 == -1 || i == -1) ? false : true);
        ef90 ef90Var = new ef90(i);
        ((kbh) c5pVar).H(ef90Var.a, 0, i, false);
        return ef90Var.E() == i2;
    }

    @Override // defpackage.b5p
    public final void release() {
    }
}
