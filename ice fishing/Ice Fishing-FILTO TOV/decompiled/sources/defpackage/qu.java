package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class qu {
    public int GWasM1elztuh;
    public Object Yi7zF1RB1;

    public qu(za1 za1Var, int i) {
        this.Yi7zF1RB1 = za1Var;
        this.GWasM1elztuh = i;
    }

    public void GWasM1elztuh(long j) {
        if (Yi7zF1RB1(j)) {
            return;
        }
        int i = this.GWasM1elztuh;
        long[] jArr = (long[]) this.Yi7zF1RB1;
        if (i >= jArr.length) {
            jArr = Arrays.copyOf(jArr, Math.max(i + 1, jArr.length * 2));
            this.Yi7zF1RB1 = jArr;
        }
        jArr[i] = j;
        if (i >= this.GWasM1elztuh) {
            this.GWasM1elztuh = i + 1;
        }
    }

    public void X1lG3V04pd(long j) {
        int i = this.GWasM1elztuh;
        int i2 = 0;
        while (i2 < i) {
            if (j == ((long[]) this.Yi7zF1RB1)[i2]) {
                int i3 = this.GWasM1elztuh - 1;
                while (i2 < i3) {
                    long[] jArr = (long[]) this.Yi7zF1RB1;
                    int i4 = i2 + 1;
                    jArr[i2] = jArr[i4];
                    i2 = i4;
                }
                this.GWasM1elztuh--;
                return;
            }
            i2++;
        }
    }

    public boolean Yi7zF1RB1(long j) {
        int i = this.GWasM1elztuh;
        for (int i2 = 0; i2 < i; i2++) {
            if (((long[]) this.Yi7zF1RB1)[i2] == j) {
                return true;
            }
        }
        return false;
    }
}
