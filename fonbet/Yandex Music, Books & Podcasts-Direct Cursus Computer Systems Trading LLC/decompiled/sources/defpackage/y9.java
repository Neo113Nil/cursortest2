package defpackage;

/* loaded from: classes.dex */
public final class y9 implements r2c {
    public final w9 a = new w9(0, 1, null, "audio/ac4");
    public final d7k b = new d7k(16384);
    public boolean c;

    @Override // defpackage.r2c
    public final void b(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        return false;
     */
    @Override // defpackage.r2c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(s2c s2cVar) {
        gm7 gm7Var;
        int i;
        d7k d7kVar = new d7k(10);
        int i2 = 0;
        while (true) {
            gm7Var = (gm7) s2cVar;
            gm7Var.l(d7kVar.a, 0, 10, false);
            d7kVar.H(0);
            if (d7kVar.y() != 4801587) {
                break;
            }
            d7kVar.I(3);
            int u = d7kVar.u();
            i2 += u + 10;
            gm7Var.c(u, false);
        }
        gm7Var.f = 0;
        gm7Var.c(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            gm7Var.l(d7kVar.a, 0, 7, false);
            d7kVar.H(0);
            int B = d7kVar.B();
            if (B == 44096 || B == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArr = d7kVar.a;
                if (bArr.length < 7) {
                    i = -1;
                } else {
                    int i6 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
                    if (i6 == 65535) {
                        i6 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (B == 44097) {
                        i5 += 2;
                    }
                    i = i6 + i5;
                }
                if (i == -1) {
                    break;
                }
                gm7Var.c(i - 7, false);
            } else {
                gm7Var.f = 0;
                i4++;
                if (i4 - i2 >= 8192) {
                    break;
                }
                gm7Var.c(i4, false);
                i3 = 0;
            }
        }
    }

    @Override // defpackage.r2c
    public final int h(s2c s2cVar, ci0 ci0Var) {
        d7k d7kVar = this.b;
        int read = s2cVar.read(d7kVar.a, 0, 16384);
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
