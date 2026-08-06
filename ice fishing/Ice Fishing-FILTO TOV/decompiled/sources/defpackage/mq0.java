package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class mq0 {
    public final int AvO7iQsrTN;
    public final long E7jCp8Ls;
    public final float EljAMC1QTz;
    public final long GWasM1elztuh;
    public final long JFJ3QoxA;
    public final boolean OOA6hdeuvCS;
    public final long X1lG3V04pd;
    public final long XnEVoBF0td1l;
    public final long Yi7zF1RB1;
    public final boolean encWxUiV2;
    public final ArrayList mOu10nynGul;
    public final float rQPn8YBR;
    public final long xqGvceK5x;

    public mq0(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5, float f2, long j6, long j7) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
        this.X1lG3V04pd = j3;
        this.xqGvceK5x = j4;
        this.OOA6hdeuvCS = z;
        this.EljAMC1QTz = f;
        this.AvO7iQsrTN = i;
        this.encWxUiV2 = z2;
        this.mOu10nynGul = arrayList;
        this.JFJ3QoxA = j5;
        this.rQPn8YBR = f2;
        this.E7jCp8Ls = j6;
        this.XnEVoBF0td1l = j7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq0)) {
            return false;
        }
        mq0 mq0Var = (mq0) obj;
        return q70.XnEVoBF0td1l(this.GWasM1elztuh, mq0Var.GWasM1elztuh) && this.Yi7zF1RB1 == mq0Var.Yi7zF1RB1 && uk0.Yi7zF1RB1(this.X1lG3V04pd, mq0Var.X1lG3V04pd) && uk0.Yi7zF1RB1(this.xqGvceK5x, mq0Var.xqGvceK5x) && this.OOA6hdeuvCS == mq0Var.OOA6hdeuvCS && Float.compare(this.EljAMC1QTz, mq0Var.EljAMC1QTz) == 0 && this.AvO7iQsrTN == mq0Var.AvO7iQsrTN && this.encWxUiV2 == mq0Var.encWxUiV2 && this.mOu10nynGul.equals(mq0Var.mOu10nynGul) && uk0.Yi7zF1RB1(this.JFJ3QoxA, mq0Var.JFJ3QoxA) && Float.compare(this.rQPn8YBR, mq0Var.rQPn8YBR) == 0 && uk0.Yi7zF1RB1(this.E7jCp8Ls, mq0Var.E7jCp8Ls) && uk0.Yi7zF1RB1(this.XnEVoBF0td1l, mq0Var.XnEVoBF0td1l);
    }

    public final int hashCode() {
        return Long.hashCode(this.XnEVoBF0td1l) + mr0.X1lG3V04pd(mr0.GWasM1elztuh(this.rQPn8YBR, mr0.X1lG3V04pd((this.mOu10nynGul.hashCode() + mr0.xqGvceK5x(mr0.Yi7zF1RB1(this.AvO7iQsrTN, mr0.GWasM1elztuh(this.EljAMC1QTz, mr0.xqGvceK5x(mr0.X1lG3V04pd(mr0.X1lG3V04pd(mr0.X1lG3V04pd(Long.hashCode(this.GWasM1elztuh) * 31, 31, this.Yi7zF1RB1), 31, this.X1lG3V04pd), 31, this.xqGvceK5x), 31, this.OOA6hdeuvCS), 31), 31), 31, this.encWxUiV2)) * 31, 31, this.JFJ3QoxA), 31), 31, this.E7jCp8Ls);
    }

    public final String toString() {
        return "PointerInputEventData(id=" + ((Object) q70.pog2g9KITJA(this.GWasM1elztuh)) + ", uptime=" + this.Yi7zF1RB1 + ", positionOnScreen=" + ((Object) uk0.AvO7iQsrTN(this.X1lG3V04pd)) + ", position=" + ((Object) uk0.AvO7iQsrTN(this.xqGvceK5x)) + ", down=" + this.OOA6hdeuvCS + ", pressure=" + this.EljAMC1QTz + ", type=" + ((Object) qq0.GWasM1elztuh(this.AvO7iQsrTN)) + ", activeHover=" + this.encWxUiV2 + ", historical=" + this.mOu10nynGul + ", scrollDelta=" + ((Object) uk0.AvO7iQsrTN(this.JFJ3QoxA)) + ", scaleGestureFactor=" + this.rQPn8YBR + ", panGestureOffset=" + ((Object) uk0.AvO7iQsrTN(this.E7jCp8Ls)) + ", originalEventPosition=" + ((Object) uk0.AvO7iQsrTN(this.XnEVoBF0td1l)) + ')';
    }
}
