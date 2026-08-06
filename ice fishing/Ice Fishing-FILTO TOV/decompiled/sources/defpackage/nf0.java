package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nf0 {
    public final hg0 GWasM1elztuh;

    public static final Object GWasM1elztuh(hg0 hg0Var) {
        Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(null);
        if (AvO7iQsrTN == null) {
            return null;
        }
        if (!(AvO7iQsrTN instanceof ag0)) {
            hg0Var.rQPn8YBR(null);
            return AvO7iQsrTN;
        }
        ag0 ag0Var = (ag0) AvO7iQsrTN;
        if (ag0Var.encWxUiV2()) {
            o4.AvO7iQsrTN("List is empty.");
            return null;
        }
        int i = ag0Var.Yi7zF1RB1 - 1;
        Object EljAMC1QTz = ag0Var.EljAMC1QTz(i);
        ag0Var.rQPn8YBR(i);
        EljAMC1QTz.getClass();
        if (ag0Var.encWxUiV2()) {
            hg0Var.rQPn8YBR(null);
        }
        if (ag0Var.Yi7zF1RB1 == 1) {
            hg0Var.XnEVoBF0td1l(null, ag0Var.OOA6hdeuvCS());
        }
        return EljAMC1QTz;
    }

    public static final ag0 Yi7zF1RB1(hg0 hg0Var) {
        if (hg0Var.mOu10nynGul()) {
            ag0 ag0Var = qk0.Yi7zF1RB1;
            ag0Var.getClass();
            return ag0Var;
        }
        ag0 ag0Var2 = new ag0();
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
                                ag0Var2.Yi7zF1RB1((ag0) obj);
                            } else {
                                obj.getClass();
                                ag0Var2.GWasM1elztuh(obj);
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
                }
                i++;
            }
        }
        return ag0Var2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nf0) {
            return this.GWasM1elztuh.equals(((nf0) obj).GWasM1elztuh);
        }
        return false;
    }

    public final int hashCode() {
        return this.GWasM1elztuh.hashCode();
    }

    public final String toString() {
        return "MultiValueMap(map=" + this.GWasM1elztuh + ')';
    }
}
