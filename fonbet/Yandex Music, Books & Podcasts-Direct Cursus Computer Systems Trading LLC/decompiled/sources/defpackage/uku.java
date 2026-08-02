package defpackage;

import java.math.RoundingMode;

/* loaded from: classes.dex */
public final class uku implements tku {
    public final t2c a;
    public final azs b;
    public final bh3 c;
    public final dsc d;
    public final int e;
    public long f;
    public int g;
    public long h;

    public uku(t2c t2cVar, azs azsVar, bh3 bh3Var, String str, int i) {
        this.a = t2cVar;
        this.b = azsVar;
        this.c = bh3Var;
        int i2 = bh3Var.b;
        int i3 = bh3Var.c;
        int i4 = (bh3Var.e * i2) / 8;
        int i5 = bh3Var.d;
        if (i5 != i4) {
            throw r7k.a(null, "Expected block size: " + i4 + "; got: " + i5);
        }
        int i6 = i3 * i4;
        int i7 = i6 * 8;
        int max = Math.max(i4, i6 / 10);
        this.e = max;
        bsc bscVar = new bsc();
        bscVar.l = l5i.p("audio/wav");
        bscVar.m = l5i.p(str);
        bscVar.h = i7;
        bscVar.i = i7;
        bscVar.n = max;
        bscVar.C = i2;
        bscVar.D = i3;
        bscVar.E = i;
        this.d = new dsc(bscVar);
    }

    @Override // defpackage.tku
    public final void a(int i, long j) {
        this.a.E(new wku(this.c, 1, i, j));
        this.b.d(this.d);
    }

    @Override // defpackage.tku
    public final void b(long j) {
        this.f = j;
        this.g = 0;
        this.h = 0L;
    }

    @Override // defpackage.tku
    public final boolean c(s2c s2cVar, long j) {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.g) < (i2 = this.e)) {
            int c = this.b.c(s2cVar, (int) Math.min(i2 - i, j2), true);
            if (c == -1) {
                j2 = 0;
            } else {
                this.g += c;
                j2 -= c;
            }
        }
        bh3 bh3Var = this.c;
        int i3 = bh3Var.d;
        int i4 = this.g / i3;
        if (i4 > 0) {
            long j3 = this.f;
            long j4 = this.h;
            long j5 = bh3Var.c;
            int i5 = dvt.a;
            long g0 = j3 + dvt.g0(j4, 1000000L, j5, RoundingMode.DOWN);
            int i6 = i4 * i3;
            int i7 = this.g - i6;
            this.b.a(g0, 1, i6, i7, null);
            this.h += i4;
            this.g = i7;
        }
        return j2 <= 0;
    }
}
