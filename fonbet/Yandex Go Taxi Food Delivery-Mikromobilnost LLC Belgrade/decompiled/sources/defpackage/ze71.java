package defpackage;

/* loaded from: classes7.dex */
public final class ze71 implements gz71 {
    public fb81 b;
    public boolean c;
    public int e;
    public int f;
    public final dl81 a = new dl81(10);
    public long d = -9223372036854775807L;

    @Override // defpackage.gz71
    public final void a(yg71 yg71Var, xi11 xi11Var) {
        xi11Var.a();
        xi11Var.b();
        fb81 l = yg71Var.l(xi11Var.d, 5);
        this.b = l;
        da81 da81Var = new da81();
        xi11Var.b();
        da81Var.a = xi11Var.e;
        da81Var.k = "application/id3";
        l.k(new qd81(da81Var));
    }

    @Override // defpackage.gz71
    public final void b() {
        int i;
        fb81 fb81Var = this.b;
        if (fb81Var == null) {
            ny61.k();
            return;
        }
        if (this.c && (i = this.e) != 0 && this.f == i) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                fb81Var.b(j, 1, i, 0, null);
            }
            this.c = false;
        }
    }

    @Override // defpackage.gz71
    public final void c(int i, long j) {
        if ((i & 4) == 0) {
            return;
        }
        this.c = true;
        if (j != -9223372036854775807L) {
            this.d = j;
        }
        this.e = 0;
        this.f = 0;
    }

    @Override // defpackage.gz71
    public final void f(dl81 dl81Var) {
        if (this.b == null) {
            ny61.k();
            return;
        }
        if (this.c) {
            int i = dl81Var.c - dl81Var.b;
            int i2 = this.f;
            if (i2 < 10) {
                int min = Math.min(i, 10 - i2);
                byte[] bArr = dl81Var.a;
                int i3 = dl81Var.b;
                dl81 dl81Var2 = this.a;
                System.arraycopy(bArr, i3, dl81Var2.a, this.f, min);
                if (this.f + min == 10) {
                    dl81Var2.m(0);
                    if (73 != dl81Var2.s() || 68 != dl81Var2.s() || 51 != dl81Var2.s()) {
                        nba1.e();
                        this.c = false;
                        return;
                    } else {
                        dl81Var2.m(dl81Var2.b + 3);
                        this.e = dl81Var2.r() + 10;
                    }
                }
            }
            int min2 = Math.min(i, this.e - this.f);
            this.b.a(min2, dl81Var);
            this.f += min2;
        }
    }

    @Override // defpackage.gz71
    public final void a() {
        this.c = false;
        this.d = -9223372036854775807L;
    }
}
