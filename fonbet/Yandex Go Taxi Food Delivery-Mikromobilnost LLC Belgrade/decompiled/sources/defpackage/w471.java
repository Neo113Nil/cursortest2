package defpackage;

/* loaded from: classes7.dex */
public class w471 implements a871 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public w471(long j, long j2) {
        this.a = 1;
        this.b = j;
        oe71 oe71Var = j2 == 0 ? oe71.c : new oe71(0L, j2);
        this.c = new v171(oe71Var, oe71Var);
    }

    @Override // defpackage.a871
    public final boolean b() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.a871
    public final long c() {
        int i = this.a;
        long j = this.b;
        switch (i) {
            case 0:
                long j2 = ((cfr) this.c).j;
                if (j2 == 0) {
                    return -9223372036854775807L;
                }
                return (j2 * 1000000) / r4.e;
            case 1:
            default:
                return j;
        }
    }

    @Override // defpackage.a871
    public final v171 d(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                cfr cfrVar = (cfr) obj;
                bfr bfrVar = (bfr) cfrVar.k;
                int i3 = cfrVar.e;
                if (bfrVar == null) {
                    ny61.k();
                    return null;
                }
                long[] jArr = bfrVar.a;
                long[] jArr2 = bfrVar.b;
                long j2 = cfrVar.j - 1;
                int i4 = rf71.a;
                int t = rf71.t(jArr, Math.max(0L, Math.min((i3 * j) / 1000000, j2)), false);
                long j3 = t == -1 ? 0L : jArr[t];
                long j4 = t != -1 ? jArr2[t] : 0L;
                long j5 = i3;
                long j6 = (j3 * 1000000) / j5;
                long j7 = this.b;
                oe71 oe71Var = new oe71(j6, j4 + j7);
                if (j6 == j || t == jArr.length - 1) {
                    return new v171(oe71Var, oe71Var);
                }
                int i5 = t + 1;
                return new v171(oe71Var, new oe71((jArr[i5] * 1000000) / j5, j7 + jArr2[i5]));
            case 1:
                return (v171) obj;
            default:
                pc81 pc81Var = (pc81) obj;
                v171 a = pc81Var.g[0].a(j);
                while (true) {
                    zv81[] zv81VarArr = pc81Var.g;
                    if (i2 >= zv81VarArr.length) {
                        return a;
                    }
                    v171 a2 = zv81VarArr[i2].a(j);
                    if (a2.a.b < a.a.b) {
                        a = a2;
                    }
                    i2++;
                }
        }
    }

    public /* synthetic */ w471(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
