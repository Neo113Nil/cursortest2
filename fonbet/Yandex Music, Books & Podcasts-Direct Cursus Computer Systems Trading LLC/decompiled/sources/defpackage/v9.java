package defpackage;

/* loaded from: classes.dex */
public final class v9 implements r2c {
    public final w9 a = new w9("audio/ac3");
    public final d7k b = new d7k(2786);
    public boolean c;

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.r2c
    public final boolean d(s2c s2cVar) {
        gm7 gm7Var;
        int D;
        d7k d7kVar = new d7k(10);
        int i = 0;
        while (true) {
            gm7Var = (gm7) s2cVar;
            gm7Var.l(d7kVar.a, 0, 10, false);
            d7kVar.H(0);
            if (d7kVar.y() != 4801587) {
                break;
            }
            d7kVar.I(3);
            int u = d7kVar.u();
            i += u + 10;
            gm7Var.c(u, false);
        }
        gm7Var.f = 0;
        gm7Var.c(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            gm7Var.l(d7kVar.a, 0, 6, false);
            d7kVar.H(0);
            if (d7kVar.B() != 2935) {
                gm7Var.f = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                gm7Var.c(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = d7kVar.a;
                if (bArr.length < 6) {
                    D = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    D = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    D = nt0.D((b & 192) >> 6, b & 63);
                }
                if (D == -1) {
                    break;
                }
                gm7Var.c(D - 6, false);
            }
        }
        return false;
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        d7k d7kVar = this.b;
        int read = s2cVar.read(d7kVar.a, 0, 2786);
        if (read == -1) {
            return -1;
        }
        d7kVar.H(0);
        d7kVar.G(read);
        boolean z = this.c;
        w9 w9Var = this.a;
        if (!z) {
            w9Var.o = 0L;
            this.c = true;
        }
        w9Var.b(d7kVar);
        return 0;
    }

    @Override // defpackage.r2c
    public final void l(t2c t2cVar) {
        this.a.e(t2cVar, new cp2(0, 1));
        t2cVar.K();
        t2cVar.E(new zg2(-9223372036854775807L));
    }

    @Override // defpackage.r2c
    public final void a() {
    }
}
