package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ht0 implements m4 {
    public final Object AvO7iQsrTN;
    public final qf0 OOA6hdeuvCS = new qf0();
    public final ag0 EljAMC1QTz = new ag0();

    public ht0(Object obj) {
        this.AvO7iQsrTN = obj;
    }

    @Override // defpackage.m4
    public final void EljAMC1QTz(int i, Object obj) {
        qf0 qf0Var = this.OOA6hdeuvCS;
        qf0Var.GWasM1elztuh(6);
        qf0Var.GWasM1elztuh(i);
        this.EljAMC1QTz.GWasM1elztuh(obj);
    }

    public final void GWasM1elztuh(ac1 ac1Var, au0 au0Var) {
        Exception exc;
        qf0 qf0Var = this.OOA6hdeuvCS;
        int i = qf0Var.Yi7zF1RB1;
        ag0 ag0Var = new ag0();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            ag0 ag0Var2 = this.EljAMC1QTz;
            if (i2 >= i) {
                if (i3 != ag0Var2.Yi7zF1RB1) {
                    we.GWasM1elztuh("Applier operation size mismatch");
                }
                ag0Var2.xqGvceK5x();
                qf0Var.Yi7zF1RB1 = 0;
                ac1Var.AvO7iQsrTN();
                return;
            }
            int i4 = i2 + 1;
            try {
                try {
                    switch (qf0Var.Yi7zF1RB1(i2)) {
                        case 0:
                            ac1Var.YmKjaVtbfp5Z();
                            i2 = i4;
                        case 1:
                            int i5 = i3 + 1;
                            ac1Var.xqGvceK5x(ag0Var2.EljAMC1QTz(i3));
                            i3 = i5;
                            i2 = i4;
                        case 2:
                            int i6 = i2 + 2;
                            i2 += 3;
                            ac1Var.JFJ3QoxA(qf0Var.Yi7zF1RB1(i4), qf0Var.Yi7zF1RB1(i6));
                        case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                            int i7 = i2 + 2;
                            try {
                                int i8 = i2 + 3;
                                try {
                                    i2 += 4;
                                    ac1Var.encWxUiV2(qf0Var.Yi7zF1RB1(i4), qf0Var.Yi7zF1RB1(i7), qf0Var.Yi7zF1RB1(i8));
                                } catch (Exception e) {
                                    exc = e;
                                    i2 = i8;
                                    break;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i2 = i7;
                                break;
                            }
                        case 4:
                            ac1Var.GWasM1elztuh();
                            i2 = i4;
                        case 5:
                            i2 += 2;
                            int i9 = i3 + 1;
                            ac1Var.X1lG3V04pd(qf0Var.Yi7zF1RB1(i4), ag0Var2.EljAMC1QTz(i3));
                            i3 = i9;
                        case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                            i2 += 2;
                            try {
                                qf0Var.Yi7zF1RB1(i4);
                                int i10 = i3 + 1;
                                i3 = i10;
                            } catch (Exception e3) {
                                exc = e3;
                                break;
                            }
                        case nr0.DOUBLE_FIELD_NUMBER /* 7 */:
                            int i11 = i3 + 1;
                            Object EljAMC1QTz = ag0Var2.EljAMC1QTz(i3);
                            EljAMC1QTz.getClass();
                            fb1.XnEVoBF0td1l(2, EljAMC1QTz);
                            i3 += 2;
                            ac1Var.XnEVoBF0td1l((lv) EljAMC1QTz, ag0Var2.EljAMC1QTz(i11));
                            i2 = i4;
                        case 8:
                            Object obj = ac1Var.AvO7iQsrTN;
                            if (obj instanceof be) {
                                be beVar = (be) obj;
                                if (au0Var.EljAMC1QTz.JFJ3QoxA(beVar)) {
                                    beVar.Yi7zF1RB1();
                                }
                            }
                            ag0Var.GWasM1elztuh(obj);
                            ac1Var.OOA6hdeuvCS();
                            i2 = i4;
                        default:
                            i2 = i4;
                    }
                } catch (Throwable th) {
                    ac1Var.AvO7iQsrTN();
                    throw th;
                }
            } catch (Exception e4) {
                exc = e4;
                i2 = i4;
            }
            exc = e3;
            throw new de(ag0Var2, ag0Var, qf0Var, i2 - 1, exc);
        }
    }

    @Override // defpackage.m4
    public final void JFJ3QoxA(int i, int i2) {
        qf0 qf0Var = this.OOA6hdeuvCS;
        qf0Var.GWasM1elztuh(2);
        qf0Var.GWasM1elztuh(i);
        qf0Var.GWasM1elztuh(i2);
    }

    @Override // defpackage.m4
    public final void OOA6hdeuvCS() {
        this.OOA6hdeuvCS.GWasM1elztuh(8);
    }

    @Override // defpackage.m4
    public final void X1lG3V04pd(int i, Object obj) {
        qf0 qf0Var = this.OOA6hdeuvCS;
        qf0Var.GWasM1elztuh(5);
        qf0Var.GWasM1elztuh(i);
        this.EljAMC1QTz.GWasM1elztuh(obj);
    }

    @Override // defpackage.m4
    public final void XnEVoBF0td1l(lv lvVar, Object obj) {
        this.OOA6hdeuvCS.GWasM1elztuh(7);
        ag0 ag0Var = this.EljAMC1QTz;
        ag0Var.GWasM1elztuh(lvVar);
        ag0Var.GWasM1elztuh(obj);
    }

    @Override // defpackage.m4
    public final void YmKjaVtbfp5Z() {
        this.OOA6hdeuvCS.GWasM1elztuh(0);
    }

    @Override // defpackage.m4
    public final void encWxUiV2(int i, int i2, int i3) {
        qf0 qf0Var = this.OOA6hdeuvCS;
        qf0Var.GWasM1elztuh(3);
        qf0Var.GWasM1elztuh(i);
        qf0Var.GWasM1elztuh(i2);
        qf0Var.GWasM1elztuh(i3);
    }

    @Override // defpackage.m4
    public final Object mOu10nynGul() {
        return this.AvO7iQsrTN;
    }

    @Override // defpackage.m4
    public final void xqGvceK5x(Object obj) {
        this.OOA6hdeuvCS.GWasM1elztuh(1);
        this.EljAMC1QTz.GWasM1elztuh(obj);
    }
}
