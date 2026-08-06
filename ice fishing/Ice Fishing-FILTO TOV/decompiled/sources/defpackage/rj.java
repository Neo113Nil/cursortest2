package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rj implements h3 {
    public final Object AvO7iQsrTN;
    public final r3 EljAMC1QTz;
    public final rx0 GWasM1elztuh;
    public final r3 OOA6hdeuvCS;
    public final Object X1lG3V04pd;
    public final eb1 Yi7zF1RB1;
    public final long encWxUiV2;
    public final r3 xqGvceK5x;

    public rj(sj sjVar, eb1 eb1Var, Object obj, r3 r3Var) {
        rx0 rx0Var = new rx0(sjVar.GWasM1elztuh);
        this.GWasM1elztuh = rx0Var;
        this.Yi7zF1RB1 = eb1Var;
        this.X1lG3V04pd = obj;
        r3 r3Var2 = (r3) eb1Var.GWasM1elztuh.mOu10nynGul(obj);
        this.xqGvceK5x = r3Var2;
        this.OOA6hdeuvCS = p.mOu10nynGul(r3Var);
        hv hvVar = eb1Var.Yi7zF1RB1;
        if (((r3) rx0Var.encWxUiV2) == null) {
            rx0Var.encWxUiV2 = r3Var2.X1lG3V04pd();
        }
        r3 r3Var3 = (r3) rx0Var.encWxUiV2;
        if (r3Var3 == null) {
            o30.YXi2hvwn7WL("targetVector");
            throw null;
        }
        int Yi7zF1RB1 = r3Var3.Yi7zF1RB1();
        int i = 0;
        while (true) {
            r3 r3Var4 = (r3) rx0Var.encWxUiV2;
            if (i >= Yi7zF1RB1) {
                if (r3Var4 == null) {
                    o30.YXi2hvwn7WL("targetVector");
                    throw null;
                }
                this.AvO7iQsrTN = hvVar.mOu10nynGul(r3Var4);
                rx0 rx0Var2 = this.GWasM1elztuh;
                r3 r3Var5 = this.xqGvceK5x;
                if (((r3) rx0Var2.AvO7iQsrTN) == null) {
                    rx0Var2.AvO7iQsrTN = r3Var5.X1lG3V04pd();
                }
                r3 r3Var6 = (r3) rx0Var2.AvO7iQsrTN;
                if (r3Var6 == null) {
                    o30.YXi2hvwn7WL("velocityVector");
                    throw null;
                }
                int Yi7zF1RB12 = r3Var6.Yi7zF1RB1();
                long j = 0;
                for (int i2 = 0; i2 < Yi7zF1RB12; i2++) {
                    j6IIN2O8eOU j6iin2o8eou = (j6IIN2O8eOU) rx0Var2.OOA6hdeuvCS;
                    r3Var5.getClass();
                    j = Math.max(j, ((long) (Math.exp(((cs) j6iin2o8eou.EljAMC1QTz).Yi7zF1RB1(r3Var.GWasM1elztuh(i2)) / (ds.GWasM1elztuh - 1.0d)) * 1000.0d)) * 1000000);
                }
                this.encWxUiV2 = j;
                r3 mOu10nynGul = p.mOu10nynGul(this.GWasM1elztuh.XnEVoBF0td1l(j, this.xqGvceK5x, r3Var));
                this.EljAMC1QTz = mOu10nynGul;
                int Yi7zF1RB13 = mOu10nynGul.Yi7zF1RB1();
                for (int i3 = 0; i3 < Yi7zF1RB13; i3++) {
                    r3 r3Var7 = this.EljAMC1QTz;
                    float GWasM1elztuh = r3Var7.GWasM1elztuh(i3);
                    this.GWasM1elztuh.getClass();
                    this.GWasM1elztuh.getClass();
                    r3Var7.OOA6hdeuvCS(o50.AvO7iQsrTN(GWasM1elztuh, -0.0f, 0.0f), i3);
                }
                return;
            }
            if (r3Var4 == null) {
                o30.YXi2hvwn7WL("targetVector");
                throw null;
            }
            j6IIN2O8eOU j6iin2o8eou2 = (j6IIN2O8eOU) rx0Var.OOA6hdeuvCS;
            float GWasM1elztuh2 = r3Var2.GWasM1elztuh(i);
            float GWasM1elztuh3 = r3Var.GWasM1elztuh(i);
            double Yi7zF1RB14 = ((cs) j6iin2o8eou2.EljAMC1QTz).Yi7zF1RB1(GWasM1elztuh3);
            double d = ds.GWasM1elztuh;
            int i4 = i;
            r3Var4.OOA6hdeuvCS((Math.signum(GWasM1elztuh3) * ((float) (Math.exp((d / (d - 1.0d)) * Yi7zF1RB14) * r13.GWasM1elztuh * r13.Yi7zF1RB1))) + GWasM1elztuh2, i4);
            i = i4 + 1;
        }
    }

    @Override // defpackage.h3
    public final r3 EljAMC1QTz(long j) {
        if (AvO7iQsrTN(j)) {
            return this.EljAMC1QTz;
        }
        return this.GWasM1elztuh.XnEVoBF0td1l(j, this.xqGvceK5x, this.OOA6hdeuvCS);
    }

    @Override // defpackage.h3
    public final boolean GWasM1elztuh() {
        return false;
    }

    @Override // defpackage.h3
    public final Object OOA6hdeuvCS() {
        return this.AvO7iQsrTN;
    }

    @Override // defpackage.h3
    public final long X1lG3V04pd() {
        return this.encWxUiV2;
    }

    @Override // defpackage.h3
    public final Object Yi7zF1RB1(long j) {
        if (AvO7iQsrTN(j)) {
            return this.AvO7iQsrTN;
        }
        hv hvVar = this.Yi7zF1RB1.Yi7zF1RB1;
        rx0 rx0Var = this.GWasM1elztuh;
        r3 r3Var = (r3) rx0Var.EljAMC1QTz;
        r3 r3Var2 = this.xqGvceK5x;
        if (r3Var == null) {
            rx0Var.EljAMC1QTz = r3Var2.X1lG3V04pd();
        }
        r3 r3Var3 = (r3) rx0Var.EljAMC1QTz;
        if (r3Var3 == null) {
            o30.YXi2hvwn7WL("valueVector");
            throw null;
        }
        int Yi7zF1RB1 = r3Var3.Yi7zF1RB1();
        int i = 0;
        while (true) {
            r3 r3Var4 = (r3) rx0Var.EljAMC1QTz;
            if (i >= Yi7zF1RB1) {
                if (r3Var4 != null) {
                    return hvVar.mOu10nynGul(r3Var4);
                }
                o30.YXi2hvwn7WL("valueVector");
                throw null;
            }
            if (r3Var4 == null) {
                o30.YXi2hvwn7WL("valueVector");
                throw null;
            }
            j6IIN2O8eOU j6iin2o8eou = (j6IIN2O8eOU) rx0Var.OOA6hdeuvCS;
            float GWasM1elztuh = r3Var2.GWasM1elztuh(i);
            long j2 = j / 1000000;
            bs GWasM1elztuh2 = ((cs) j6iin2o8eou.EljAMC1QTz).GWasM1elztuh(this.OOA6hdeuvCS.GWasM1elztuh(i));
            long j3 = GWasM1elztuh2.X1lG3V04pd;
            r3Var4.OOA6hdeuvCS((Math.signum(GWasM1elztuh2.GWasM1elztuh) * GWasM1elztuh2.Yi7zF1RB1 * r0.GWasM1elztuh(j3 > 0 ? j2 / j3 : 1.0f).GWasM1elztuh) + GWasM1elztuh, i);
            i++;
        }
    }

    @Override // defpackage.h3
    public final eb1 xqGvceK5x() {
        return this.Yi7zF1RB1;
    }
}
