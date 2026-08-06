package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class xy0 {
    public final long GWasM1elztuh;
    public final long OOA6hdeuvCS;
    public final long X1lG3V04pd;
    public final long Yi7zF1RB1;
    public final long xqGvceK5x;

    public xy0(long j, long j2, long j3, long j4, long j5) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
        this.X1lG3V04pd = j3;
        this.xqGvceK5x = j4;
        this.OOA6hdeuvCS = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xy0)) {
            return false;
        }
        xy0 xy0Var = (xy0) obj;
        return yb.X1lG3V04pd(this.GWasM1elztuh, xy0Var.GWasM1elztuh) && yb.X1lG3V04pd(this.Yi7zF1RB1, xy0Var.Yi7zF1RB1) && yb.X1lG3V04pd(this.X1lG3V04pd, xy0Var.X1lG3V04pd) && yb.X1lG3V04pd(this.xqGvceK5x, xy0Var.xqGvceK5x) && yb.X1lG3V04pd(this.OOA6hdeuvCS, xy0Var.OOA6hdeuvCS);
    }

    public final int hashCode() {
        int i = yb.encWxUiV2;
        return Long.hashCode(this.OOA6hdeuvCS) + mr0.X1lG3V04pd(mr0.X1lG3V04pd(mr0.X1lG3V04pd(Long.hashCode(this.GWasM1elztuh) * 31, 31, this.Yi7zF1RB1), 31, this.X1lG3V04pd), 31, this.xqGvceK5x);
    }

    public final String toString() {
        return "SectorPalette(conduit=" + yb.mOu10nynGul(this.GWasM1elztuh) + ", glow=" + yb.mOu10nynGul(this.Yi7zF1RB1) + ", core=" + yb.mOu10nynGul(this.X1lG3V04pd) + ", boardTop=" + yb.mOu10nynGul(this.xqGvceK5x) + ", boardBottom=" + yb.mOu10nynGul(this.OOA6hdeuvCS) + ")";
    }
}
