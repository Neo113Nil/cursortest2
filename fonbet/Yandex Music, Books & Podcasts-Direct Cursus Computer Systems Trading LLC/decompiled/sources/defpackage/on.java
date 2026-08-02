package defpackage;

/* loaded from: classes.dex */
public final class on implements r2c {
    public final d7k c;
    public final v94 d;
    public t2c e;
    public long f;
    public boolean h;
    public boolean i;
    public final pn a = new pn(0, null, "audio/mp4a-latm", true);
    public final d7k b = new d7k(2048);
    public long g = -1;

    public on(int i) {
        d7k d7kVar = new d7k(10);
        this.c = d7kVar;
        byte[] bArr = d7kVar.a;
        this.d = new v94(bArr, bArr.length);
    }

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        this.h = false;
        this.a.c();
        this.f = j2;
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        int i = 0;
        while (true) {
            d7k d7kVar = this.c;
            s2cVar.A(d7kVar.a, 0, 10);
            d7kVar.H(0);
            if (d7kVar.y() != 4801587) {
                break;
            }
            d7kVar.I(3);
            int u = d7kVar.u();
            i += u + 10;
            s2cVar.u(u);
        }
        s2cVar.n();
        s2cVar.u(i);
        if (this.g == -1) {
            this.g = i;
        }
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        do {
            d7k d7kVar2 = this.c;
            gm7 gm7Var = (gm7) s2cVar;
            gm7Var.l(d7kVar2.a, 0, 2, false);
            d7kVar2.H(0);
            if ((d7kVar2.B() & 65526) == 65520) {
                i3++;
                if (i3 >= 4 && i4 > 188) {
                    return true;
                }
                gm7Var.l(d7kVar2.a, 0, 4, false);
                v94 v94Var = this.d;
                v94Var.q(14);
                int i5 = v94Var.i(13);
                if (i5 <= 6) {
                    i2++;
                    gm7Var.f = 0;
                    gm7Var.c(i2, false);
                } else {
                    gm7Var.c(i5 - 6, false);
                    i4 += i5;
                }
            } else {
                i2++;
                gm7Var.f = 0;
                gm7Var.c(i2, false);
            }
            i3 = 0;
            i4 = 0;
        } while (i2 - i < 8192);
        return false;
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        vq1.B(this.e);
        s2cVar.getLength();
        d7k d7kVar = this.b;
        int read = s2cVar.read(d7kVar.a, 0, 2048);
        boolean z = read == -1;
        if (!this.i) {
            this.e.E(new zg2(-9223372036854775807L));
            this.i = true;
        }
        if (z) {
            return -1;
        }
        d7kVar.H(0);
        d7kVar.G(read);
        boolean z2 = this.h;
        pn pnVar = this.a;
        if (!z2) {
            pnVar.u = this.f;
            this.h = true;
        }
        pnVar.b(d7kVar);
        return 0;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.e = t2cVar;
        this.a.e(t2cVar, new cp2(0, 1));
        t2cVar.K();
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
