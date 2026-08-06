package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class kq0 {
    public final long AvO7iQsrTN;
    public final long E7jCp8Ls;
    public final long EljAMC1QTz;
    public final long GWasM1elztuh;
    public final long JFJ3QoxA;
    public final float OOA6hdeuvCS;
    public boolean WIEu4Ya2g8;
    public final long X1lG3V04pd;
    public final ArrayList XnEVoBF0td1l;
    public final long Yi7zF1RB1;
    public kq0 YmKjaVtbfp5Z;
    public final boolean encWxUiV2;
    public boolean iwATDS1i01k;
    public final int mOu10nynGul;
    public final float rQPn8YBR;
    public final long uFEq9NpZ;
    public final boolean xqGvceK5x;

    public kq0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6, float f2, long j7) {
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = j2;
        this.X1lG3V04pd = j3;
        this.xqGvceK5x = z;
        this.OOA6hdeuvCS = f;
        this.EljAMC1QTz = j4;
        this.AvO7iQsrTN = j5;
        this.encWxUiV2 = z2;
        this.mOu10nynGul = i;
        this.JFJ3QoxA = j6;
        this.rQPn8YBR = f2;
        this.E7jCp8Ls = j7;
        this.uFEq9NpZ = 0L;
        this.iwATDS1i01k = z3;
        this.WIEu4Ya2g8 = z3;
    }

    public final void GWasM1elztuh() {
        kq0 kq0Var = this.YmKjaVtbfp5Z;
        if (kq0Var == null) {
            this.iwATDS1i01k = true;
            this.WIEu4Ya2g8 = true;
        } else if (kq0Var != null) {
            kq0Var.GWasM1elztuh();
        }
    }

    public final boolean Yi7zF1RB1() {
        kq0 kq0Var = this.YmKjaVtbfp5Z;
        return kq0Var != null ? kq0Var.Yi7zF1RB1() : this.iwATDS1i01k || this.WIEu4Ya2g8;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) q70.pog2g9KITJA(this.GWasM1elztuh));
        sb.append(", uptimeMillis=");
        sb.append(this.Yi7zF1RB1);
        sb.append(", position=");
        sb.append((Object) uk0.AvO7iQsrTN(this.X1lG3V04pd));
        sb.append(", pressed=");
        sb.append(this.xqGvceK5x);
        sb.append(", pressure=");
        sb.append(this.OOA6hdeuvCS);
        sb.append(", previousUptimeMillis=");
        sb.append(this.EljAMC1QTz);
        sb.append(", previousPosition=");
        sb.append((Object) uk0.AvO7iQsrTN(this.AvO7iQsrTN));
        sb.append(", previousPressed=");
        sb.append(this.encWxUiV2);
        sb.append(", isConsumed=");
        sb.append(Yi7zF1RB1());
        sb.append(", type=");
        sb.append((Object) qq0.GWasM1elztuh(this.mOu10nynGul));
        sb.append(", historical=");
        Object obj = this.XnEVoBF0td1l;
        if (obj == null) {
            obj = xp.OOA6hdeuvCS;
        }
        sb.append(obj);
        sb.append(", scrollDelta=");
        sb.append((Object) uk0.AvO7iQsrTN(this.JFJ3QoxA));
        sb.append(", scaleFactor=");
        sb.append(this.rQPn8YBR);
        sb.append(", panOffset=");
        sb.append((Object) uk0.AvO7iQsrTN(this.E7jCp8Ls));
        sb.append(')');
        return sb.toString();
    }

    public kq0(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, ArrayList arrayList, long j6, float f2, long j7, long j8) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6, f2, j7);
        this.XnEVoBF0td1l = arrayList;
        this.uFEq9NpZ = j8;
    }
}
