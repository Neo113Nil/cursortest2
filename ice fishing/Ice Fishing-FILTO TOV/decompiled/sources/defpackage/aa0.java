package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class aa0 extends we1 {
    public final rf0 Yi7zF1RB1;

    public aa0() {
        rf0 rf0Var = t20.GWasM1elztuh;
        this.Yi7zF1RB1 = new rf0();
    }

    @Override // defpackage.we1
    public final void xqGvceK5x() {
        rf0 rf0Var = this.Yi7zF1RB1;
        int[] iArr = rf0Var.Yi7zF1RB1;
        Object[] objArr = rf0Var.X1lG3V04pd;
        long[] jArr = rf0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        ag0 ag0Var = (ag0) objArr[i4];
                        Object[] objArr2 = ag0Var.GWasM1elztuh;
                        int i6 = ag0Var.Yi7zF1RB1;
                        for (int i7 = 0; i7 < i6; i7++) {
                            z90 z90Var = (z90) objArr2[i7];
                            p9 p9Var = z90Var.xqGvceK5x;
                            if (p9Var != null) {
                                p9Var.cancel();
                            }
                            z90Var.xqGvceK5x = null;
                            dc0 dc0Var = (dc0) z90Var.GWasM1elztuh.EljAMC1QTz;
                            dc0Var.EljAMC1QTz = true;
                            dc0Var.OOA6hdeuvCS = false;
                            dc0Var.GWasM1elztuh();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
