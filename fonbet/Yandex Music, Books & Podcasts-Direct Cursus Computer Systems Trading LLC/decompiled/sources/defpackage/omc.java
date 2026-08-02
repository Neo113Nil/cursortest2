package defpackage;

/* loaded from: classes.dex */
public final class omc {
    public final int a;
    public final ymc b;
    public final long c;
    public final int d;
    public final int e;

    public omc(int i, ymc ymcVar, long j, int i2, int i3) {
        this.a = i;
        this.b = ymcVar;
        this.c = j;
        this.d = i2;
        this.e = i3;
    }

    public final sj2 a(lu6 lu6Var, boolean z, int i, int i2, int i3, int i4) {
        if (!lu6Var.b) {
            return null;
        }
        this.b.getClass();
        tmc tmcVar = tmc.a;
        return null;
    }

    public final lu6 b(boolean z, int i, long j, qpe qpeVar, int i2, int i3, int i4, boolean z2, boolean z3) {
        int i5 = i3 + i4;
        if (qpeVar == null) {
            return new lu6(true, true);
        }
        long j2 = qpeVar.a;
        this.b.getClass();
        tmc tmcVar = tmc.a;
        tmc tmcVar2 = tmc.a;
        if (i2 >= Integer.MAX_VALUE || ((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)) < 0) {
            return new lu6(true, true);
        }
        if (i != 0 && (i >= this.a || ((int) (j >> 32)) - ((int) (j2 >> 32)) < 0)) {
            return z2 ? new lu6(true, true) : new lu6(true, b(z, 0, qpe.a(ga6.i(this.c), (((int) (j & 4294967295L)) - this.e) - i4), new qpe(qpe.a(((int) (j2 >> 32)) - this.d, (int) (j2 & 4294967295L))), i2 + 1, i5, 0, true, false).b);
        }
        Math.max(i4, (int) (j2 & 4294967295L));
        return new lu6(false, false);
    }
}
