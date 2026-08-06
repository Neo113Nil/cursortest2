package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class p80 implements cd0 {
    public final boolean AvO7iQsrTN;
    public final int E7jCp8Ls;
    public final float EljAMC1QTz;
    public final q80 GWasM1elztuh;
    public final long JFJ3QoxA;
    public final cd0 OOA6hdeuvCS;
    public final int WIEu4Ya2g8;
    public final boolean X1lG3V04pd;
    public final int XnEVoBF0td1l;
    public final int Yi7zF1RB1;
    public final int YmKjaVtbfp5Z;
    public final ph encWxUiV2;
    public final xm0 iwATDS1i01k;
    public final el mOu10nynGul;
    public final List rQPn8YBR;
    public final int uFEq9NpZ;
    public final float xqGvceK5x;

    public p80(q80 q80Var, int i, boolean z, float f, cd0 cd0Var, float f2, boolean z2, ph phVar, el elVar, long j, List list, int i2, int i3, int i4, xm0 xm0Var, int i5, int i6) {
        this.GWasM1elztuh = q80Var;
        this.Yi7zF1RB1 = i;
        this.X1lG3V04pd = z;
        this.xqGvceK5x = f;
        this.OOA6hdeuvCS = cd0Var;
        this.EljAMC1QTz = f2;
        this.AvO7iQsrTN = z2;
        this.encWxUiV2 = phVar;
        this.mOu10nynGul = elVar;
        this.JFJ3QoxA = j;
        this.rQPn8YBR = list;
        this.E7jCp8Ls = i2;
        this.XnEVoBF0td1l = i3;
        this.uFEq9NpZ = i4;
        this.iwATDS1i01k = xm0Var;
        this.WIEu4Ya2g8 = i5;
        this.YmKjaVtbfp5Z = i6;
    }

    public final long AvO7iQsrTN() {
        cd0 cd0Var = this.OOA6hdeuvCS;
        return (cd0Var.OOA6hdeuvCS() << 32) | (cd0Var.X1lG3V04pd() & 4294967295L);
    }

    public final p80 EljAMC1QTz(int i, boolean z) {
        q80 q80Var;
        if (this.AvO7iQsrTN) {
            return null;
        }
        List list = this.rQPn8YBR;
        if (list.isEmpty() || (q80Var = this.GWasM1elztuh) == null) {
            return null;
        }
        int i2 = q80Var.E7jCp8Ls;
        int i3 = this.Yi7zF1RB1 - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        q80 q80Var2 = (q80) rb.jed7WnvkLvFq(list);
        q80 q80Var3 = (q80) rb.vaTCmWUgXF(list);
        if (q80Var2.uFEq9NpZ || q80Var3.uFEq9NpZ) {
            return null;
        }
        int i4 = q80Var2.JFJ3QoxA;
        int i5 = this.XnEVoBF0td1l;
        int i6 = this.E7jCp8Ls;
        if (i < 0) {
            if (Math.min((i4 + q80Var2.E7jCp8Ls) - i6, (q80Var3.JFJ3QoxA + q80Var3.E7jCp8Ls) - i5) <= (-i)) {
                return null;
            }
        } else if (Math.min(i6 - i4, i5 - q80Var3.JFJ3QoxA) <= i) {
            return null;
        }
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            q80 q80Var4 = (q80) list.get(i7);
            q80Var4.getClass();
            int[] iArr = q80Var4.WIEu4Ya2g8;
            if (!q80Var4.uFEq9NpZ) {
                q80Var4.JFJ3QoxA += i;
                int length = iArr.length;
                for (int i8 = 0; i8 < length; i8++) {
                    if ((i8 & 1) != 0) {
                        iArr[i8] = iArr[i8] + i;
                    }
                }
                if (z) {
                    int size2 = q80Var4.Yi7zF1RB1.size();
                    for (int i9 = 0; i9 < size2; i9++) {
                        mr0.WIEu4Ya2g8(q80Var4.mOu10nynGul.GWasM1elztuh.AvO7iQsrTN(q80Var4.AvO7iQsrTN));
                    }
                }
            }
        }
        return new p80(this.GWasM1elztuh, i3, this.X1lG3V04pd || i > 0, i, this.OOA6hdeuvCS, this.EljAMC1QTz, this.AvO7iQsrTN, this.encWxUiV2, this.mOu10nynGul, this.JFJ3QoxA, list, this.E7jCp8Ls, this.XnEVoBF0td1l, this.uFEq9NpZ, this.iwATDS1i01k, this.WIEu4Ya2g8, this.YmKjaVtbfp5Z);
    }

    @Override // defpackage.cd0
    public final Map GWasM1elztuh() {
        return this.OOA6hdeuvCS.GWasM1elztuh();
    }

    @Override // defpackage.cd0
    public final int OOA6hdeuvCS() {
        return this.OOA6hdeuvCS.OOA6hdeuvCS();
    }

    @Override // defpackage.cd0
    public final int X1lG3V04pd() {
        return this.OOA6hdeuvCS.X1lG3V04pd();
    }

    @Override // defpackage.cd0
    public final void Yi7zF1RB1() {
        this.OOA6hdeuvCS.Yi7zF1RB1();
    }

    @Override // defpackage.cd0
    public final hv xqGvceK5x() {
        return this.OOA6hdeuvCS.xqGvceK5x();
    }
}
