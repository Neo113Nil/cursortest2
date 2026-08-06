package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xd1 implements td1 {
    public final long AvO7iQsrTN;
    public final iu0 EljAMC1QTz;
    public final vd1 OOA6hdeuvCS;
    public final long encWxUiV2 = 0;

    public xd1(vd1 vd1Var, iu0 iu0Var) {
        this.OOA6hdeuvCS = vd1Var;
        this.EljAMC1QTz = iu0Var;
        this.AvO7iQsrTN = (vd1Var.uFEq9NpZ() + vd1Var.rQPn8YBR()) * 1000000;
    }

    @Override // defpackage.td1
    public final r3 E7jCp8Ls(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return this.OOA6hdeuvCS.E7jCp8Ls(X1lG3V04pd(j), r3Var, r3Var2, xqGvceK5x(j, r3Var, r3Var3, r3Var2));
    }

    @Override // defpackage.td1
    public final boolean GWasM1elztuh() {
        return true;
    }

    public final long X1lG3V04pd(long j) {
        long j2 = j + this.encWxUiV2;
        if (j2 <= 0) {
            return 0L;
        }
        long j3 = this.AvO7iQsrTN;
        long j4 = j2 / j3;
        return (this.EljAMC1QTz == iu0.OOA6hdeuvCS || j4 % 2 == 0) ? j2 - (j4 * j3) : ((j4 + 1) * j3) - j2;
    }

    @Override // defpackage.td1
    public final long Yi7zF1RB1(r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return Long.MAX_VALUE;
    }

    @Override // defpackage.td1
    public final r3 iwATDS1i01k(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        return this.OOA6hdeuvCS.iwATDS1i01k(X1lG3V04pd(j), r3Var, r3Var2, xqGvceK5x(j, r3Var, r3Var3, r3Var2));
    }

    public final r3 xqGvceK5x(long j, r3 r3Var, r3 r3Var2, r3 r3Var3) {
        long j2 = this.encWxUiV2;
        long j3 = j + j2;
        long j4 = this.AvO7iQsrTN;
        return j3 > j4 ? this.OOA6hdeuvCS.E7jCp8Ls(j4 - j2, r3Var, r3Var3, r3Var2) : r3Var2;
    }
}
