package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class dc0 implements wu0 {
    public boolean AvO7iQsrTN;
    public boolean EljAMC1QTz;
    public boolean OOA6hdeuvCS = true;
    public final hg0 encWxUiV2 = new hg0();

    public final void GWasM1elztuh() {
        hg0 hg0Var = this.encWxUiV2;
        Object[] objArr = hg0Var.X1lG3V04pd;
        long[] jArr = hg0Var.GWasM1elztuh;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof ag0) {
                                ag0 ag0Var = (ag0) obj;
                                Object[] objArr2 = ag0Var.GWasM1elztuh;
                                int i4 = ag0Var.Yi7zF1RB1;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                }
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                }
                if (i == length) {
                    break;
                } else {
                    i++;
                }
            }
        }
        hg0Var.GWasM1elztuh();
    }
}
