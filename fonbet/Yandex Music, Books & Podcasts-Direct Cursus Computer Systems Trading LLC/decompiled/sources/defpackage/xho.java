package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class xho implements nio {
    public final mio a;
    public final v94 b = new v94();
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public long g;
    public azs h;
    public long i;

    public xho(mio mioVar) {
        this.a = mioVar;
        this.c = mioVar.b;
        String str = (String) mioVar.d.get("mode");
        str.getClass();
        if (ltg.C(str, "AAC-hbr")) {
            this.d = 13;
            this.e = 3;
        } else {
            if (!ltg.C(str, "AAC-lbr")) {
                qq6.d("AAC mode not supported");
                throw null;
            }
            this.d = 6;
            this.e = 2;
        }
        this.f = this.e + this.d;
    }

    @Override // defpackage.nio
    public final void b(long j, long j2) {
        this.g = j;
        this.i = j2;
    }

    @Override // defpackage.nio
    public final void c(t2c t2cVar, int i) {
        azs M = t2cVar.M(i, 1);
        this.h = M;
        M.d(this.a.c);
    }

    @Override // defpackage.nio
    public final void d(long j) {
        this.g = j;
    }

    @Override // defpackage.nio
    public final void e(d7k d7kVar, long j, int i, boolean z) {
        this.h.getClass();
        short s = d7kVar.s();
        int i2 = s / this.f;
        long l0 = o2g.l0(this.i, j, this.c, this.g);
        v94 v94Var = this.b;
        v94Var.p(d7kVar);
        int i3 = this.e;
        int i4 = this.d;
        if (i2 == 1) {
            int i5 = v94Var.i(i4);
            v94Var.t(i3);
            this.h.b(d7kVar, d7kVar.a(), 0);
            if (z) {
                this.h.a(l0, 1, i5, 0, null);
                return;
            }
            return;
        }
        d7kVar.I((s + 7) / 8);
        long j2 = l0;
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = v94Var.i(i4);
            v94Var.t(i3);
            this.h.b(d7kVar, i7, 0);
            this.h.a(j2, 1, i7, 0, null);
            j2 += dvt.g0(i2, 1000000L, this.c, RoundingMode.DOWN);
        }
    }
}
