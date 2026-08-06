package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class y21 {
    public int AvO7iQsrTN;
    public int E7jCp8Ls;
    public boolean EljAMC1QTz;
    public final z21 GWasM1elztuh;
    public final c30 JFJ3QoxA;
    public final int OOA6hdeuvCS;
    public final int X1lG3V04pd;
    public int XnEVoBF0td1l;
    public final int[] Yi7zF1RB1;
    public int encWxUiV2;
    public int mOu10nynGul;
    public int rQPn8YBR;
    public boolean uFEq9NpZ;
    public Object[] xqGvceK5x;

    public y21(z21 z21Var) {
        this.GWasM1elztuh = z21Var;
        this.Yi7zF1RB1 = z21Var.OOA6hdeuvCS;
        int i = z21Var.EljAMC1QTz;
        this.X1lG3V04pd = i;
        this.xqGvceK5x = z21Var.AvO7iQsrTN;
        this.OOA6hdeuvCS = z21Var.encWxUiV2;
        this.encWxUiV2 = i;
        this.mOu10nynGul = -1;
        this.JFJ3QoxA = new c30();
    }

    public final int AvO7iQsrTN() {
        int i = this.AvO7iQsrTN;
        if (i >= this.encWxUiV2) {
            return 0;
        }
        return this.Yi7zF1RB1[i * 5];
    }

    public final boolean E7jCp8Ls(int i) {
        return (this.Yi7zF1RB1[(i * 5) + 1] & 1073741824) != 0;
    }

    public final Object EljAMC1QTz() {
        int i = this.AvO7iQsrTN;
        if (i < this.encWxUiV2) {
            return Yi7zF1RB1(this.Yi7zF1RB1, i);
        }
        return 0;
    }

    public final lx GWasM1elztuh(int i) {
        ArrayList arrayList = this.GWasM1elztuh.XnEVoBF0td1l;
        int OOA6hdeuvCS = b31.OOA6hdeuvCS(arrayList, i, this.X1lG3V04pd);
        if (OOA6hdeuvCS >= 0) {
            return (lx) arrayList.get(OOA6hdeuvCS);
        }
        lx lxVar = new lx(i);
        arrayList.add(-(OOA6hdeuvCS + 1), lxVar);
        return lxVar;
    }

    public final boolean JFJ3QoxA(int i) {
        return (this.Yi7zF1RB1[(i * 5) + 1] & 134217728) != 0;
    }

    public final void Mjvvu5DE(int i) {
        if (this.rQPn8YBR != 0) {
            we.GWasM1elztuh("Cannot reposition while in an empty region");
        }
        this.AvO7iQsrTN = i;
        int[] iArr = this.Yi7zF1RB1;
        int i2 = this.X1lG3V04pd;
        int i3 = i < i2 ? iArr[(i * 5) + 2] : -1;
        if (i3 != this.mOu10nynGul) {
            this.mOu10nynGul = i3;
            if (i3 < 0) {
                this.encWxUiV2 = i2;
            } else {
                this.encWxUiV2 = iArr[(i3 * 5) + 3] + i3;
            }
            this.E7jCp8Ls = 0;
            this.XnEVoBF0td1l = 0;
        }
    }

    public final void OOA6hdeuvCS() {
        if (this.rQPn8YBR == 0) {
            if (this.AvO7iQsrTN != this.encWxUiV2) {
                we.GWasM1elztuh("endGroup() not called at the end of a group");
            }
            int i = (this.mOu10nynGul * 5) + 2;
            int[] iArr = this.Yi7zF1RB1;
            int i2 = iArr[i];
            this.mOu10nynGul = i2;
            int i3 = this.X1lG3V04pd;
            this.encWxUiV2 = i2 < 0 ? i3 : iArr[(i2 * 5) + 3] + i2;
            int Yi7zF1RB1 = this.JFJ3QoxA.Yi7zF1RB1();
            if (Yi7zF1RB1 < 0) {
                this.E7jCp8Ls = 0;
                this.XnEVoBF0td1l = 0;
            } else {
                this.E7jCp8Ls = Yi7zF1RB1;
                this.XnEVoBF0td1l = i2 >= i3 + (-1) ? this.OOA6hdeuvCS : iArr[((i2 + 1) * 5) + 4];
            }
        }
    }

    public final Object WIEu4Ya2g8(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            return null;
        }
        return this.xqGvceK5x[Integer.bitCount(i3 >> 30) + iArr[i2 + 4]];
    }

    public final void X1lG3V04pd() {
        this.EljAMC1QTz = true;
        if (this.GWasM1elztuh.mOu10nynGul <= 0) {
            we.GWasM1elztuh("Unexpected reader close()");
        }
        r0.mOu10nynGul--;
        this.xqGvceK5x = new Object[0];
    }

    public final Object XnEVoBF0td1l() {
        int i;
        if (this.rQPn8YBR > 0 || (i = this.E7jCp8Ls) >= this.XnEVoBF0td1l) {
            this.uFEq9NpZ = false;
            return ue.GWasM1elztuh;
        }
        this.uFEq9NpZ = true;
        Object[] objArr = this.xqGvceK5x;
        this.E7jCp8Ls = i + 1;
        return objArr[i];
    }

    public final void Y6hRI1cF8() {
        if (this.rQPn8YBR <= 0) {
            int i = this.mOu10nynGul;
            int i2 = this.AvO7iQsrTN;
            int i3 = i2 * 5;
            int[] iArr = this.Yi7zF1RB1;
            if (iArr[i3 + 2] != i) {
                tq0.GWasM1elztuh("Invalid slot table detected");
            }
            int i4 = this.E7jCp8Ls;
            int i5 = this.XnEVoBF0td1l;
            c30 c30Var = this.JFJ3QoxA;
            if (i4 == 0 && i5 == 0) {
                c30Var.X1lG3V04pd(-1);
            } else {
                c30Var.X1lG3V04pd(i4);
            }
            this.mOu10nynGul = i2;
            this.encWxUiV2 = iArr[i3 + 3] + i2;
            int i6 = i2 + 1;
            this.AvO7iQsrTN = i6;
            this.E7jCp8Ls = b31.Yi7zF1RB1(iArr, i2);
            this.XnEVoBF0td1l = i2 >= this.X1lG3V04pd + (-1) ? this.OOA6hdeuvCS : iArr[(i6 * 5) + 4];
        }
    }

    public final Object Yi7zF1RB1(int[] iArr, int i) {
        int i2 = i * 5;
        int i3 = iArr[i2 + 1];
        if ((268435456 & i3) != 0) {
            return this.xqGvceK5x[i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + Integer.bitCount(i3 >> 29)];
        }
        return ue.GWasM1elztuh;
    }

    public final int YmKjaVtbfp5Z(int i) {
        return this.Yi7zF1RB1[(i * 5) + 2];
    }

    public final Object encWxUiV2(int i, int i2) {
        int[] iArr = this.Yi7zF1RB1;
        int Yi7zF1RB1 = b31.Yi7zF1RB1(iArr, i);
        int i3 = i + 1;
        int i4 = Yi7zF1RB1 + i2;
        return i4 < (i3 < this.X1lG3V04pd ? iArr[(i3 * 5) + 4] : this.OOA6hdeuvCS) ? this.xqGvceK5x[i4] : ue.GWasM1elztuh;
    }

    public final int iwATDS1i01k(int i) {
        return this.Yi7zF1RB1[(i * 5) + 1] & 67108863;
    }

    public final void jivtDDk9H() {
        if (!(this.rQPn8YBR == 0)) {
            we.GWasM1elztuh("Cannot skip the enclosing group while in an empty region");
        }
        this.AvO7iQsrTN = this.encWxUiV2;
        this.E7jCp8Ls = 0;
        this.XnEVoBF0td1l = 0;
    }

    public final int mE4lRynR() {
        if (this.rQPn8YBR != 0) {
            we.GWasM1elztuh("Cannot skip while in an empty region");
        }
        int i = this.AvO7iQsrTN;
        int i2 = i * 5;
        int[] iArr = this.Yi7zF1RB1;
        int i3 = iArr[i2 + 1];
        int i4 = (1073741824 & i3) != 0 ? 1 : i3 & 67108863;
        this.AvO7iQsrTN = iArr[i2 + 3] + i;
        return i4;
    }

    public final int mOu10nynGul(int i) {
        return this.Yi7zF1RB1[i * 5];
    }

    public final boolean rQPn8YBR(int i) {
        return (this.Yi7zF1RB1[(i * 5) + 1] & 536870912) != 0;
    }

    public final String toString() {
        return "SlotReader(current=" + this.AvO7iQsrTN + ", key=" + AvO7iQsrTN() + ", parent=" + this.mOu10nynGul + ", end=" + this.encWxUiV2 + ')';
    }

    public final Object uFEq9NpZ(int i) {
        int i2 = i * 5;
        int[] iArr = this.Yi7zF1RB1;
        int i3 = iArr[i2 + 1] & 1073741824;
        if (i3 != 0) {
            return i3 != 0 ? this.xqGvceK5x[iArr[i2 + 4]] : ue.GWasM1elztuh;
        }
        return null;
    }

    public final boolean xqGvceK5x(int i) {
        return (this.Yi7zF1RB1[(i * 5) + 1] & 67108864) != 0;
    }
}
