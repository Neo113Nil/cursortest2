package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qf0 {
    public int[] GWasM1elztuh;
    public int Yi7zF1RB1;

    public qf0(int i) {
        this.GWasM1elztuh = i == 0 ? a30.GWasM1elztuh : new int[i];
    }

    public final void GWasM1elztuh(int i) {
        int i2 = this.Yi7zF1RB1 + 1;
        int[] iArr = this.GWasM1elztuh;
        if (iArr.length < i2) {
            this.GWasM1elztuh = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
        }
        int[] iArr2 = this.GWasM1elztuh;
        int i3 = this.Yi7zF1RB1;
        iArr2[i3] = i;
        this.Yi7zF1RB1 = i3 + 1;
    }

    public final void X1lG3V04pd(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.Yi7zF1RB1)) {
            o4.uFEq9NpZ("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.GWasM1elztuh;
        int i3 = iArr[i];
        if (i != i2 - 1) {
            d5.MjxSquD6Av(iArr, iArr, i, i + 1, i2);
        }
        this.Yi7zF1RB1--;
    }

    public final int Yi7zF1RB1(int i) {
        if (i >= 0 && i < this.Yi7zF1RB1) {
            return this.GWasM1elztuh[i];
        }
        o4.uFEq9NpZ("Index must be between 0 and size");
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof qf0) {
            qf0 qf0Var = (qf0) obj;
            int i = qf0Var.Yi7zF1RB1;
            int i2 = this.Yi7zF1RB1;
            if (i == i2) {
                int[] iArr = this.GWasM1elztuh;
                int[] iArr2 = qf0Var.GWasM1elztuh;
                x20 MZhzXH72 = o50.MZhzXH72(0, i2);
                int i3 = MZhzXH72.OOA6hdeuvCS;
                int i4 = MZhzXH72.EljAMC1QTz;
                if (i3 > i4) {
                    return true;
                }
                while (iArr[i3] == iArr2[i3]) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.GWasM1elztuh;
        int i = this.Yi7zF1RB1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.GWasM1elztuh;
        int i = this.Yi7zF1RB1;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            int i3 = iArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(i3);
            i2++;
        }
        return sb.toString();
    }

    public final void xqGvceK5x(int i, int i2) {
        if (i < 0 || i >= this.Yi7zF1RB1) {
            o4.uFEq9NpZ("Index must be between 0 and size");
            return;
        }
        int[] iArr = this.GWasM1elztuh;
        int i3 = iArr[i];
        iArr[i] = i2;
    }

    public /* synthetic */ qf0() {
        this(16);
    }
}
