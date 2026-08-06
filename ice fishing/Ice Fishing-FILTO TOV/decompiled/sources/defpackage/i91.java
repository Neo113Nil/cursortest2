package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class i91 {
    public long AvO7iQsrTN = Long.MIN_VALUE;
    public long EljAMC1QTz;
    public final int GWasM1elztuh;
    public long OOA6hdeuvCS;
    public final X1lG3V04pd X1lG3V04pd;
    public final r5 Yi7zF1RB1;
    public final /* synthetic */ j91 encWxUiV2;
    public i91 xqGvceK5x;

    public i91(j91 j91Var, int i, r5 r5Var, X1lG3V04pd x1lG3V04pd) {
        this.encWxUiV2 = j91Var;
        this.GWasM1elztuh = i;
        this.Yi7zF1RB1 = r5Var;
        this.X1lG3V04pd = x1lG3V04pd;
    }

    public final void GWasM1elztuh(long j, long j2, long j3, long j4, float[] fArr) {
        xt0 xt0Var;
        xt0 xt0Var2;
        long j5 = this.encWxUiV2.EljAMC1QTz;
        r5 r5Var = this.Yi7zF1RB1;
        bk0 AEn1Rrio = vc0.AEn1Rrio(r5Var, 2);
        g60 eUH21U3apd = vc0.eUH21U3apd(r5Var);
        boolean A1EKNP6CxJ = eUH21U3apd.A1EKNP6CxJ();
        xj0 xj0Var = eUH21U3apd.A1EKNP6CxJ;
        if (A1EKNP6CxJ) {
            if (xj0Var.xqGvceK5x != AEn1Rrio) {
                long floatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = AEn1Rrio.AvO7iQsrTN;
                bk0 bk0Var = xj0Var.xqGvceK5x;
                bk0Var.getClass();
                xt0Var = new xt0(qj.dqB83aoLBB(bk0Var.YZjbz8VdP5(AEn1Rrio, floatToRawIntBits)), (4294967295L & (((int) (r3 & 4294967295L)) + ((int) (j6 & 4294967295L)))) | ((((int) (r3 >> 32)) + ((int) (j6 >> 32))) << 32), j3, j4, j5, fArr, r5Var);
            } else {
                xt0Var = new xt0(j, j2, j3, j4, j5, fArr, r5Var);
            }
            xt0Var2 = xt0Var;
        } else {
            xt0Var2 = null;
        }
        if (xt0Var2 == null) {
            return;
        }
        this.X1lG3V04pd.mOu10nynGul(xt0Var2);
    }

    public final void Yi7zF1RB1() {
        j91 j91Var = this.encWxUiV2;
        rf0 rf0Var = j91Var.GWasM1elztuh;
        int i = this.GWasM1elztuh;
        i91 i91Var = (i91) rf0Var.AvO7iQsrTN(i);
        if (i91Var != null) {
            if (i91Var == this) {
                i91 i91Var2 = this.xqGvceK5x;
                this.xqGvceK5x = null;
                if (i91Var2 == null) {
                    g60 eUH21U3apd = vc0.eUH21U3apd(this.Yi7zF1RB1.OOA6hdeuvCS);
                    if (eUH21U3apd.rQPn8YBR) {
                        ((c) j60.GWasM1elztuh(eUH21U3apd)).getRectManager().Yi7zF1RB1.OOA6hdeuvCS(eUH21U3apd.EljAMC1QTz, false);
                        return;
                    }
                    return;
                }
                int xqGvceK5x = rf0Var.xqGvceK5x(i);
                Object[] objArr = rf0Var.X1lG3V04pd;
                Object obj = objArr[xqGvceK5x];
                rf0Var.Yi7zF1RB1[xqGvceK5x] = i;
                objArr[xqGvceK5x] = i91Var2;
                return;
            }
            int xqGvceK5x2 = rf0Var.xqGvceK5x(i);
            Object[] objArr2 = rf0Var.X1lG3V04pd;
            Object obj2 = objArr2[xqGvceK5x2];
            rf0Var.Yi7zF1RB1[xqGvceK5x2] = i;
            objArr2[xqGvceK5x2] = i91Var;
            while (true) {
                i91 i91Var3 = i91Var.xqGvceK5x;
                if (i91Var3 == null) {
                    break;
                }
                if (i91Var3 == this) {
                    i91Var.xqGvceK5x = this.xqGvceK5x;
                    this.xqGvceK5x = null;
                    return;
                }
                i91Var = i91Var3;
            }
        }
        i91 i91Var4 = j91Var.Yi7zF1RB1;
        if (i91Var4 == this) {
            j91Var.Yi7zF1RB1 = i91Var4.xqGvceK5x;
            this.xqGvceK5x = null;
            return;
        }
        i91 i91Var5 = i91Var4 != null ? i91Var4.xqGvceK5x : null;
        while (true) {
            i91 i91Var6 = i91Var4;
            i91Var4 = i91Var5;
            if (i91Var4 == null) {
                return;
            }
            if (i91Var4 == this) {
                if (i91Var6 != null) {
                    i91Var6.xqGvceK5x = i91Var4.xqGvceK5x;
                }
                this.xqGvceK5x = null;
                return;
            }
            i91Var5 = i91Var4.xqGvceK5x;
        }
    }
}
