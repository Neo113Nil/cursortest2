package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class y31 {
    public c41 GWasM1elztuh;
    public boolean X1lG3V04pd;
    public long Yi7zF1RB1;
    public int xqGvceK5x;

    public y31(long j, c41 c41Var) {
        int i;
        int numberOfTrailingZeros;
        this.GWasM1elztuh = c41Var;
        this.Yi7zF1RB1 = j;
        dx0 dx0Var = e41.GWasM1elztuh;
        if (j != 0) {
            c41 xqGvceK5x = xqGvceK5x();
            long j2 = xqGvceK5x.AvO7iQsrTN;
            long[] jArr = xqGvceK5x.encWxUiV2;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = xqGvceK5x.EljAMC1QTz;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = xqGvceK5x.OOA6hdeuvCS;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (e41.X1lG3V04pd) {
                i = e41.EljAMC1QTz.GWasM1elztuh(j);
            }
        } else {
            i = -1;
        }
        this.xqGvceK5x = i;
    }

    public static void YmKjaVtbfp5Z(y31 y31Var) {
        e41.Yi7zF1RB1.WIEu4Ya2g8(y31Var);
    }

    public long AvO7iQsrTN() {
        return this.Yi7zF1RB1;
    }

    public abstract void E7jCp8Ls();

    public abstract boolean EljAMC1QTz();

    public final void GWasM1elztuh() {
        synchronized (e41.X1lG3V04pd) {
            Yi7zF1RB1();
            WIEu4Ya2g8();
        }
    }

    public final y31 JFJ3QoxA() {
        f4 f4Var = e41.Yi7zF1RB1;
        y31 y31Var = (y31) f4Var.OOA6hdeuvCS();
        f4Var.WIEu4Ya2g8(this);
        return y31Var;
    }

    public void Mjvvu5DE(c41 c41Var) {
        this.GWasM1elztuh = c41Var;
    }

    public abstract hv OOA6hdeuvCS();

    public void WIEu4Ya2g8() {
        iwATDS1i01k();
    }

    public abstract void X1lG3V04pd();

    public abstract void XnEVoBF0td1l();

    public abstract y31 Y6hRI1cF8(hv hvVar);

    public void Yi7zF1RB1() {
        e41.xqGvceK5x = e41.xqGvceK5x.Yi7zF1RB1(AvO7iQsrTN());
    }

    public int encWxUiV2() {
        return 0;
    }

    public final void iwATDS1i01k() {
        int i = this.xqGvceK5x;
        if (i >= 0) {
            e41.Y6hRI1cF8(i);
            this.xqGvceK5x = -1;
        }
    }

    public void jivtDDk9H(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public void mE4lRynR(long j) {
        this.Yi7zF1RB1 = j;
    }

    public abstract hv mOu10nynGul();

    public abstract void rQPn8YBR();

    public abstract void uFEq9NpZ(s51 s51Var);

    public c41 xqGvceK5x() {
        return this.GWasM1elztuh;
    }
}
