package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i00 {
    public static final vt E7jCp8Ls = new vt(4);
    public static int rQPn8YBR;
    public final long AvO7iQsrTN;
    public final od1 EljAMC1QTz;
    public final String GWasM1elztuh;
    public final int JFJ3QoxA;
    public final float OOA6hdeuvCS;
    public final float X1lG3V04pd;
    public final float Yi7zF1RB1;
    public final int encWxUiV2;
    public final boolean mOu10nynGul;
    public final float xqGvceK5x;

    public i00(String str, float f, float f2, float f3, float f4, od1 od1Var, long j, int i, boolean z) {
        int i2;
        synchronized (E7jCp8Ls) {
            i2 = rQPn8YBR;
            rQPn8YBR = i2 + 1;
        }
        this.GWasM1elztuh = str;
        this.Yi7zF1RB1 = f;
        this.X1lG3V04pd = f2;
        this.xqGvceK5x = f3;
        this.OOA6hdeuvCS = f4;
        this.EljAMC1QTz = od1Var;
        this.AvO7iQsrTN = j;
        this.encWxUiV2 = i;
        this.mOu10nynGul = z;
        this.JFJ3QoxA = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i00)) {
            return false;
        }
        i00 i00Var = (i00) obj;
        return o30.rQPn8YBR(this.GWasM1elztuh, i00Var.GWasM1elztuh) && cn.Yi7zF1RB1(this.Yi7zF1RB1, i00Var.Yi7zF1RB1) && cn.Yi7zF1RB1(this.X1lG3V04pd, i00Var.X1lG3V04pd) && this.xqGvceK5x == i00Var.xqGvceK5x && this.OOA6hdeuvCS == i00Var.OOA6hdeuvCS && this.EljAMC1QTz.equals(i00Var.EljAMC1QTz) && yb.X1lG3V04pd(this.AvO7iQsrTN, i00Var.AvO7iQsrTN) && this.encWxUiV2 == i00Var.encWxUiV2 && this.mOu10nynGul == i00Var.mOu10nynGul;
    }

    public final int hashCode() {
        int hashCode = (this.EljAMC1QTz.hashCode() + mr0.GWasM1elztuh(this.OOA6hdeuvCS, mr0.GWasM1elztuh(this.xqGvceK5x, mr0.GWasM1elztuh(this.X1lG3V04pd, mr0.GWasM1elztuh(this.Yi7zF1RB1, this.GWasM1elztuh.hashCode() * 31, 31), 31), 31), 31)) * 31;
        int i = yb.encWxUiV2;
        return Boolean.hashCode(this.mOu10nynGul) + mr0.Yi7zF1RB1(this.encWxUiV2, mr0.X1lG3V04pd(hashCode, 31, this.AvO7iQsrTN), 31);
    }
}
