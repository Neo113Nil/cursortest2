package defpackage;

import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class q80 {
    public final Object AvO7iQsrTN;
    public final int E7jCp8Ls;
    public final long EljAMC1QTz;
    public final int GWasM1elztuh;
    public int JFJ3QoxA;
    public final int OOA6hdeuvCS;
    public final int[] WIEu4Ya2g8;
    public final p6 X1lG3V04pd;
    public final int XnEVoBF0td1l;
    public final List Yi7zF1RB1;
    public final Object encWxUiV2;
    public int iwATDS1i01k = Integer.MIN_VALUE;
    public final m70 mOu10nynGul;
    public final int rQPn8YBR;
    public boolean uFEq9NpZ;
    public final p50 xqGvceK5x;

    public q80(int i, List list, p6 p6Var, p50 p50Var, int i2, int i3, int i4, long j, Object obj, Object obj2, m70 m70Var, long j2) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = list;
        this.X1lG3V04pd = p6Var;
        this.xqGvceK5x = p50Var;
        this.OOA6hdeuvCS = i4;
        this.EljAMC1QTz = j;
        this.AvO7iQsrTN = obj;
        this.encWxUiV2 = obj2;
        this.mOu10nynGul = m70Var;
        int size = list.size();
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < size; i7++) {
            up0 up0Var = (up0) list.get(i7);
            i5 += up0Var.EljAMC1QTz;
            i6 = Math.max(i6, up0Var.OOA6hdeuvCS);
        }
        this.rQPn8YBR = i5;
        int i8 = i5 + this.OOA6hdeuvCS;
        this.E7jCp8Ls = i8 >= 0 ? i8 : 0;
        this.XnEVoBF0td1l = i6;
        this.WIEu4Ya2g8 = new int[this.Yi7zF1RB1.size() * 2];
    }

    public final long GWasM1elztuh(int i) {
        if (i == 0 && this.Yi7zF1RB1.size() == 0) {
            return this.JFJ3QoxA & 4294967295L;
        }
        int[] iArr = this.WIEu4Ya2g8;
        return (iArr[r5 + 1] & 4294967295L) | (iArr[i * 2] << 32);
    }

    public final void X1lG3V04pd(int i, int i2, int i3) {
        this.JFJ3QoxA = i;
        this.iwATDS1i01k = i3;
        List list = this.Yi7zF1RB1;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            up0 up0Var = (up0) list.get(i4);
            int i5 = i4 * 2;
            p6 p6Var = this.X1lG3V04pd;
            if (p6Var == null) {
                w10.Yi7zF1RB1("null horizontalAlignment when isVertical == true");
                throw new vc();
            }
            int GWasM1elztuh = p6Var.GWasM1elztuh(up0Var.OOA6hdeuvCS, i2, this.xqGvceK5x);
            int[] iArr = this.WIEu4Ya2g8;
            iArr[i5] = GWasM1elztuh;
            iArr[i5 + 1] = i;
            i += up0Var.EljAMC1QTz;
        }
    }

    public final void Yi7zF1RB1(tp0 tp0Var) {
        XdwzlWIkSDqF xdwzlWIkSDqF = XdwzlWIkSDqF.A1EKNP6CxJ;
        if (this.iwATDS1i01k == Integer.MIN_VALUE) {
            w10.GWasM1elztuh("position() should be called first");
        }
        List list = this.Yi7zF1RB1;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            up0 up0Var = (up0) list.get(i);
            int i2 = up0Var.EljAMC1QTz;
            long GWasM1elztuh = GWasM1elztuh(i);
            mr0.WIEu4Ya2g8(this.mOu10nynGul.GWasM1elztuh.AvO7iQsrTN(this.AvO7iQsrTN));
            long X1lG3V04pd = u20.X1lG3V04pd(GWasM1elztuh, this.EljAMC1QTz);
            int i3 = vp0.Yi7zF1RB1;
            tp0Var.getClass();
            tp0.GWasM1elztuh(tp0Var, up0Var);
            up0Var.EDwNPVYuViP0(u20.X1lG3V04pd(X1lG3V04pd, up0Var.mOu10nynGul), 0.0f, xdwzlWIkSDqF);
        }
    }
}
