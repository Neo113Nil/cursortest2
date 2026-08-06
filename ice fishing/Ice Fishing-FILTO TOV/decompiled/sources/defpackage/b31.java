package defpackage;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class b31 {
    public static final void EljAMC1QTz() {
        throw new ConcurrentModificationException();
    }

    public static final int GWasM1elztuh(ArrayList arrayList, int i, int i2) {
        int OOA6hdeuvCS = OOA6hdeuvCS(arrayList, i, i2);
        return OOA6hdeuvCS >= 0 ? OOA6hdeuvCS : -(OOA6hdeuvCS + 1);
    }

    public static final int OOA6hdeuvCS(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int i5 = ((lx) arrayList.get(i4)).GWasM1elztuh;
            if (i5 < 0) {
                i5 += i2;
            }
            int uFEq9NpZ = o30.uFEq9NpZ(i5, i);
            if (uFEq9NpZ < 0) {
                i3 = i4 + 1;
            } else {
                if (uFEq9NpZ <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final void X1lG3V04pd(int[] iArr, int i, int i2) {
        if (i2 >= 0) {
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final int Yi7zF1RB1(int[] iArr, int i) {
        int i2 = i * 5;
        return Integer.bitCount(iArr[i2 + 1] >> 28) + iArr[i2 + 4];
    }

    public static final z21 xqGvceK5x(z21 z21Var) {
        if (!(z21Var instanceof z21)) {
            z21Var = null;
        }
        if (z21Var != null) {
            return z21Var;
        }
        we.Yi7zF1RB1("Inconsistent composition");
        throw new vc();
    }
}
