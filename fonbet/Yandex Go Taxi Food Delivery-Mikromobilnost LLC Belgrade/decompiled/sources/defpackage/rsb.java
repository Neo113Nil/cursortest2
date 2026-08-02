package defpackage;

import java.math.RoundingMode;

/* loaded from: classes10.dex */
public final class rsb {
    public final tb4 a;
    public final g001 b;
    public final int c;
    public final int d;
    public final long e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public long l;
    public long[] m;
    public int[] n;

    public rsb(int i, tb4 tb4Var, g001 g001Var) {
        int i2 = tb4Var.d;
        this.a = tb4Var;
        int a = tb4Var.a();
        boolean z = true;
        if (a != 1 && a != 2) {
            z = false;
        }
        d6z.l(z);
        int i3 = (((i % 10) + 48) << 8) | ((i / 10) + 48);
        this.c = (a == 2 ? 1667497984 : 1651965952) | i3;
        long j = tb4Var.b * 1000000;
        long j2 = tb4Var.c;
        int i4 = tw21.a;
        this.e = tw21.e0(i2, j, j2, RoundingMode.DOWN);
        this.b = g001Var;
        this.d = a == 2 ? i3 | 1650720768 : -1;
        this.l = -1L;
        this.m = new long[512];
        this.n = new int[512];
        this.f = i2;
    }

    public final h7q0 a(int i) {
        return new h7q0((this.e / this.f) * this.n[i], this.m[i]);
    }

    public final e7q0 b(long j) {
        if (this.k == 0) {
            h7q0 h7q0Var = new h7q0(0L, this.l);
            return new e7q0(h7q0Var, h7q0Var);
        }
        int i = (int) (j / (this.e / this.f));
        int d = tw21.d(this.n, i, true, true);
        if (this.n[d] == i) {
            h7q0 a = a(d);
            return new e7q0(a, a);
        }
        h7q0 a2 = a(d);
        int i2 = d + 1;
        return i2 < this.m.length ? new e7q0(a2, a(i2)) : new e7q0(a2, a2);
    }
}
