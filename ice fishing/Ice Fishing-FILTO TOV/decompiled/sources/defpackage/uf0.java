package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class uf0 {
    public long[] GWasM1elztuh;
    public int Yi7zF1RB1;

    public uf0(int i) {
        this.GWasM1elztuh = i == 0 ? pb0.GWasM1elztuh : new long[i];
    }

    public final void GWasM1elztuh(long j) {
        int i = this.Yi7zF1RB1 + 1;
        long[] jArr = this.GWasM1elztuh;
        if (jArr.length < i) {
            this.GWasM1elztuh = Arrays.copyOf(jArr, Math.max(i, (jArr.length * 3) / 2));
        }
        long[] jArr2 = this.GWasM1elztuh;
        int i2 = this.Yi7zF1RB1;
        jArr2[i2] = j;
        this.Yi7zF1RB1 = i2 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof uf0) {
            uf0 uf0Var = (uf0) obj;
            int i = uf0Var.Yi7zF1RB1;
            int i2 = this.Yi7zF1RB1;
            if (i == i2) {
                long[] jArr = this.GWasM1elztuh;
                long[] jArr2 = uf0Var.GWasM1elztuh;
                x20 MZhzXH72 = o50.MZhzXH72(0, i2);
                int i3 = MZhzXH72.OOA6hdeuvCS;
                int i4 = MZhzXH72.EljAMC1QTz;
                if (i3 > i4) {
                    return true;
                }
                while (jArr[i3] == jArr2[i3]) {
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
        long[] jArr = this.GWasM1elztuh;
        int i = this.Yi7zF1RB1;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Long.hashCode(jArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        long[] jArr = this.GWasM1elztuh;
        int i = this.Yi7zF1RB1;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            long j = jArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append(j);
            i2++;
        }
        return sb.toString();
    }

    public /* synthetic */ uf0() {
        this(16);
    }
}
