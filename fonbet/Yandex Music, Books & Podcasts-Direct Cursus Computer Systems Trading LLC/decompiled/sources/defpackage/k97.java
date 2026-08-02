package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final class k97 extends sis {
    public final long e;
    public final long f;
    public final long g;
    public final int h;
    public final long i;
    public final long j;
    public final long k;
    public final d97 l;
    public final onh m;
    public final fnh n;

    public k97(long j, long j2, long j3, int i, long j4, long j5, long j6, d97 d97Var, onh onhVar, fnh fnhVar) {
        vq1.A(d97Var.d == (fnhVar != null));
        this.e = j;
        this.f = j2;
        this.g = j3;
        this.h = i;
        this.i = j4;
        this.j = j5;
        this.k = j6;
        this.l = d97Var;
        this.m = onhVar;
        this.n = fnhVar;
    }

    @Override // defpackage.sis
    public final int b(Object obj) {
        int intValue;
        if ((obj instanceof Integer) && (intValue = ((Integer) obj).intValue() - this.h) >= 0 && intValue < h()) {
            return intValue;
        }
        return -1;
    }

    @Override // defpackage.sis
    public final ois f(int i, ois oisVar, boolean z) {
        vq1.w(i, h());
        d97 d97Var = this.l;
        oisVar.i(0, d97Var.d(i), dvt.Y(d97Var.b(i).b - d97Var.b(0).b) - this.i, z ? d97Var.b(i).a : null, z ? Integer.valueOf(this.h + i) : null);
        return oisVar;
    }

    @Override // defpackage.sis
    public final int h() {
        return this.l.m.size();
    }

    @Override // defpackage.sis
    public final Object l(int i) {
        vq1.w(i, h());
        return Integer.valueOf(this.h + i);
    }

    @Override // defpackage.sis
    public final ris m(int i, ris risVar, long j) {
        boolean z;
        long j2;
        boolean z2;
        long j3;
        o97 b;
        vq1.w(i, 1);
        d97 d97Var = this.l;
        boolean z3 = d97Var.d;
        long j4 = this.k;
        if (z3 && d97Var.e != -9223372036854775807L && d97Var.b == -9223372036854775807L) {
            long j5 = 0;
            if (j > 0) {
                j4 += j;
                if (j4 > this.j) {
                    z = true;
                    z2 = false;
                    j4 = -9223372036854775807L;
                    j2 = -9223372036854775807L;
                    risVar.b(ris.q, this.m, d97Var, this.e, this.f, this.g, true, (d97Var.d || d97Var.e == j2 || d97Var.b != j2) ? z2 : z, this.n, j4, this.j, 0, h() - 1, this.i);
                    return risVar;
                }
            }
            long j6 = this.i + j4;
            long d = d97Var.d(0);
            int i2 = 0;
            while (i2 < d97Var.m.size() - 1 && j6 >= d) {
                j6 -= d;
                i2++;
                d = d97Var.d(i2);
            }
            pkk b2 = d97Var.b(i2);
            List list = b2.c;
            z = true;
            int size = list.size();
            j2 = -9223372036854775807L;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    j3 = j5;
                    i3 = -1;
                    break;
                }
                j3 = j5;
                if (((nj) list.get(i3)).b == 2) {
                    break;
                }
                i3++;
                j5 = j3;
            }
            if (i3 != -1 && (b = ((a0o) ((nj) b2.c.get(i3)).c.get(0)).b()) != null && b.z(d) != j3) {
                j4 = (b.c(b.p(j6, d)) + j4) - j6;
            }
        } else {
            z = true;
            j2 = -9223372036854775807L;
        }
        z2 = false;
        risVar.b(ris.q, this.m, d97Var, this.e, this.f, this.g, true, (d97Var.d || d97Var.e == j2 || d97Var.b != j2) ? z2 : z, this.n, j4, this.j, 0, h() - 1, this.i);
        return risVar;
    }

    @Override // defpackage.sis
    public final int o() {
        return 1;
    }
}
