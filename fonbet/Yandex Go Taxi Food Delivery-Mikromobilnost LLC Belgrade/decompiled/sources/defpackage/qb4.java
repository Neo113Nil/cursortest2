package defpackage;

/* loaded from: classes10.dex */
public class qb4 implements f7q0 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public qb4(long j, long j2) {
        this.a = 2;
        this.b = j;
        h7q0 h7q0Var = j2 == 0 ? h7q0.c : new h7q0(0L, j2);
        this.c = new e7q0(h7q0Var, h7q0Var);
    }

    @Override // defpackage.f7q0
    public final e7q0 b(long j) {
        int i = this.a;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                rb4 rb4Var = (rb4) obj;
                e7q0 b = rb4Var.i[0].b(j);
                while (true) {
                    rsb[] rsbVarArr = rb4Var.i;
                    if (i2 >= rsbVarArr.length) {
                        return b;
                    }
                    e7q0 b2 = rsbVarArr[i2].b(j);
                    if (b2.a.b < b.a.b) {
                        b = b2;
                    }
                    i2++;
                }
            case 1:
                cfr cfrVar = (cfr) obj;
                d6z.z((bfr) cfrVar.k);
                bfr bfrVar = (bfr) cfrVar.k;
                long[] jArr = bfrVar.a;
                long[] jArr2 = bfrVar.b;
                int e = tw21.e(jArr, tw21.j((cfrVar.e * j) / 1000000, 0L, cfrVar.j - 1), false);
                long j2 = e == -1 ? 0L : jArr[e];
                long j3 = e != -1 ? jArr2[e] : 0L;
                int i3 = cfrVar.e;
                long j4 = (j2 * 1000000) / i3;
                long j5 = this.b;
                h7q0 h7q0Var = new h7q0(j4, j3 + j5);
                if (j4 == j || e == jArr.length - 1) {
                    return new e7q0(h7q0Var, h7q0Var);
                }
                int i4 = e + 1;
                return new e7q0(h7q0Var, new h7q0((jArr[i4] * 1000000) / i3, j5 + jArr2[i4]));
            default:
                return (e7q0) obj;
        }
    }

    @Override // defpackage.f7q0
    public final boolean c() {
        switch (this.a) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return false;
        }
    }

    @Override // defpackage.f7q0
    public final long k() {
        switch (this.a) {
            case 0:
                return this.b;
            case 1:
                return ((cfr) this.c).c();
            default:
                return this.b;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public qb4(long j) {
        this(j, 0L);
        this.a = 2;
    }

    public /* synthetic */ qb4(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
