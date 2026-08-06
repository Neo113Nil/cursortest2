package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class lc1 {
    public static final lc1 EljAMC1QTz = new lc1(0, new int[0], new Object[0], false);
    public int GWasM1elztuh;
    public boolean OOA6hdeuvCS;
    public Object[] X1lG3V04pd;
    public int[] Yi7zF1RB1;
    public int xqGvceK5x = -1;

    public lc1(int i, int[] iArr, Object[] objArr, boolean z) {
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = iArr;
        this.X1lG3V04pd = objArr;
        this.OOA6hdeuvCS = z;
    }

    public final void GWasM1elztuh(int i) {
        int[] iArr = this.Yi7zF1RB1;
        if (i > iArr.length) {
            int i2 = this.GWasM1elztuh;
            int i3 = (i2 / 2) + i2;
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.Yi7zF1RB1 = Arrays.copyOf(iArr, i);
            this.X1lG3V04pd = Arrays.copyOf(this.X1lG3V04pd, i);
        }
    }

    public final void X1lG3V04pd(int i, Object obj) {
        if (!this.OOA6hdeuvCS) {
            throw new UnsupportedOperationException();
        }
        GWasM1elztuh(this.GWasM1elztuh + 1);
        int[] iArr = this.Yi7zF1RB1;
        int i2 = this.GWasM1elztuh;
        iArr[i2] = i;
        this.X1lG3V04pd[i2] = obj;
        this.GWasM1elztuh = i2 + 1;
    }

    public final int Yi7zF1RB1() {
        int encWxUiV2;
        int JFJ3QoxA;
        int encWxUiV22;
        int i = this.xqGvceK5x;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.GWasM1elztuh; i3++) {
            int i4 = this.Yi7zF1RB1[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.X1lG3V04pd[i3]).getClass();
                    encWxUiV22 = pb.encWxUiV2(i5) + 8;
                } else if (i6 == 2) {
                    encWxUiV22 = pb.EljAMC1QTz(i5, (c9) this.X1lG3V04pd[i3]);
                } else if (i6 == 3) {
                    encWxUiV2 = pb.encWxUiV2(i5) * 2;
                    JFJ3QoxA = ((lc1) this.X1lG3V04pd[i3]).Yi7zF1RB1();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(w30.Yi7zF1RB1());
                    }
                    ((Integer) this.X1lG3V04pd[i3]).getClass();
                    encWxUiV22 = pb.encWxUiV2(i5) + 4;
                }
                i2 = encWxUiV22 + i2;
            } else {
                long longValue = ((Long) this.X1lG3V04pd[i3]).longValue();
                encWxUiV2 = pb.encWxUiV2(i5);
                JFJ3QoxA = pb.JFJ3QoxA(longValue);
            }
            i2 = JFJ3QoxA + encWxUiV2 + i2;
        }
        this.xqGvceK5x = i2;
        return i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof lc1)) {
            return false;
        }
        lc1 lc1Var = (lc1) obj;
        int i = this.GWasM1elztuh;
        if (i == lc1Var.GWasM1elztuh) {
            int[] iArr = this.Yi7zF1RB1;
            int[] iArr2 = lc1Var.Yi7zF1RB1;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.X1lG3V04pd;
                    Object[] objArr2 = lc1Var.X1lG3V04pd;
                    int i3 = this.GWasM1elztuh;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                }
                if (iArr[i2] != iArr2[i2]) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.GWasM1elztuh;
        int i2 = (527 + i) * 31;
        int[] iArr = this.Yi7zF1RB1;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.X1lG3V04pd;
        int i7 = this.GWasM1elztuh;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final void xqGvceK5x(j6IIN2O8eOU j6iin2o8eou) {
        if (this.GWasM1elztuh == 0) {
            return;
        }
        j6iin2o8eou.getClass();
        pb pbVar = (pb) j6iin2o8eou.EljAMC1QTz;
        for (int i = 0; i < this.GWasM1elztuh; i++) {
            int i2 = this.Yi7zF1RB1[i];
            Object obj = this.X1lG3V04pd[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                pbVar.ozMwhSAI(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                pbVar.jivtDDk9H(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                pbVar.WIEu4Ya2g8(i3, (c9) obj);
            } else if (i4 == 3) {
                pbVar.M3K9sHhK(i3, 3);
                ((lc1) obj).xqGvceK5x(j6iin2o8eou);
                pbVar.M3K9sHhK(i3, 4);
            } else {
                if (i4 != 5) {
                    throw new RuntimeException(w30.Yi7zF1RB1());
                }
                pbVar.Mjvvu5DE(i3, ((Integer) obj).intValue());
            }
        }
    }
}
