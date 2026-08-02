package defpackage;

import ru.CryptoPro.reprov.array.DerValue;

/* loaded from: classes7.dex */
public final class yn61 implements n771 {
    public final dz61 a = new dz61(null, 0);
    public final dl81 b = new dl81(2786);
    public boolean c;

    @Override // defpackage.n771
    public final void b(yg71 yg71Var) {
        dz61 dz61Var = this.a;
        dz61Var.getClass();
        dz61Var.e = "0";
        dz61Var.f = yg71Var.l(0, 1);
        yg71Var.mo495a();
        yg71Var.r(new w471(-9223372036854775807L, 0L));
    }

    @Override // defpackage.n771
    public final void c(long j, long j2) {
        this.c = false;
        this.a.a();
    }

    @Override // defpackage.n771
    public final int e(bb71 bb71Var, jp61 jp61Var) {
        dl81 dl81Var = this.b;
        int v = ((w971) bb71Var).v(0, 2786, dl81Var.a);
        if (v == -1) {
            return -1;
        }
        dl81Var.m(0);
        dl81Var.k(v);
        boolean z = this.c;
        dz61 dz61Var = this.a;
        if (!z) {
            dz61Var.c(4, 0L);
            this.c = true;
        }
        dz61Var.f(dl81Var);
        return 0;
    }

    @Override // defpackage.n771
    public final boolean f(bb71 bb71Var) {
        w971 w971Var;
        int a;
        dl81 dl81Var = new dl81(10);
        int i = 0;
        while (true) {
            w971Var = (w971) bb71Var;
            w971Var.I(dl81Var.a, 0, 10, false);
            dl81Var.m(0);
            if (dl81Var.u() != 4801587) {
                break;
            }
            dl81Var.m(dl81Var.b + 3);
            int r = dl81Var.r();
            i += r + 10;
            w971Var.c(r, false);
        }
        w971Var.y = 0;
        w971Var.c(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            w971Var.I(dl81Var.a, 0, 6, false);
            dl81Var.m(0);
            if (dl81Var.x() != 2935) {
                w971Var.y = 0;
                i3++;
                if (i3 - i >= 8192) {
                    break;
                }
                w971Var.c(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                byte[] bArr = dl81Var.a;
                if (bArr.length < 6) {
                    a = -1;
                } else if (((bArr[5] & 248) >> 3) > 10) {
                    a = ((((bArr[2] & 7) << 8) | (bArr[3] & 255)) + 1) * 2;
                } else {
                    byte b = bArr[4];
                    a = aba1.a((b & DerValue.TAG_PRIVATE) >> 6, b & 63);
                }
                if (a == -1) {
                    break;
                }
                w971Var.c(a - 6, false);
            }
        }
        return false;
    }
}
