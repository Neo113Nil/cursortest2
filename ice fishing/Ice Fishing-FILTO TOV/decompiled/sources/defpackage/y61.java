package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class y61 {
    public static final lf GWasM1elztuh = new lf(new mw0(4));

    public static final void GWasM1elztuh(ie0 ie0Var, z11 z11Var, long j, long j2, float f, f7 f7Var, jd jdVar, qx qxVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            z11Var = vc0.EljAMC1QTz;
        }
        z11 z11Var2 = z11Var;
        long GWasM1elztuh2 = (i2 & 8) != 0 ? fc.GWasM1elztuh(j, qxVar) : j2;
        float f2 = (i2 & 32) != 0 ? 0.0f : f;
        f7 f7Var2 = (i2 & 64) != 0 ? null : f7Var;
        lf lfVar = GWasM1elztuh;
        float f3 = ((cn) qxVar.JFJ3QoxA(lfVar)).OOA6hdeuvCS + 0.0f;
        vc0.xqGvceK5x(new qs0[]{kg.GWasM1elztuh.GWasM1elztuh(new yb(GWasM1elztuh2)), lfVar.GWasM1elztuh(new cn(f3))}, rj0.YZjbz8VdP5(421772006, new w61(ie0Var, z11Var2, j, f3, f7Var2, f2, jdVar), qxVar), qxVar, 56);
    }

    public static final ie0 X1lG3V04pd(ie0 ie0Var, z11 z11Var, long j, f7 f7Var, float f) {
        z11 z11Var2;
        ie0 ie0Var2;
        ie0 ie0Var3 = fe0.GWasM1elztuh;
        if (f > 0.0f) {
            z11Var2 = z11Var;
            ie0Var2 = vc0.WdrkLMV3xh(0.0f, 0.0f, 0.0f, f, z11Var2, 124895);
        } else {
            z11Var2 = z11Var;
            ie0Var2 = ie0Var3;
        }
        ie0 X1lG3V04pd = ie0Var.X1lG3V04pd(ie0Var2);
        if (f7Var != null) {
            ie0Var3 = new e7(1.0f, f7Var.GWasM1elztuh, z11Var2);
        }
        return n30.WIEu4Ya2g8(p.EljAMC1QTz(X1lG3V04pd.X1lG3V04pd(ie0Var3), j, z11Var2), z11Var2);
    }

    public static final void Yi7zF1RB1(wu wuVar, ie0 ie0Var, boolean z, z11 z11Var, long j, long j2, float f, tf0 tf0Var, jd jdVar, qx qxVar, int i, int i2) {
        tf0 tf0Var2;
        long GWasM1elztuh2 = (i2 & 32) != 0 ? fc.GWasM1elztuh(j, qxVar) : j2;
        float f2 = (i2 & 128) != 0 ? 0.0f : f;
        if (tf0Var == null) {
            qxVar.MjxSquD6Av(-1701037204);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new tf0();
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            qxVar.WIEu4Ya2g8(false);
            tf0Var2 = (tf0) HFYAaqMd6;
        } else {
            qxVar.MjxSquD6Av(2023337163);
            qxVar.WIEu4Ya2g8(false);
            tf0Var2 = tf0Var;
        }
        lf lfVar = GWasM1elztuh;
        float f3 = ((cn) qxVar.JFJ3QoxA(lfVar)).OOA6hdeuvCS + 0.0f;
        vc0.xqGvceK5x(new qs0[]{kg.GWasM1elztuh.GWasM1elztuh(new yb(GWasM1elztuh2)), lfVar.GWasM1elztuh(new cn(f3))}, rj0.YZjbz8VdP5(849208527, new x61(ie0Var, z11Var, j, f3, null, tf0Var2, z, wuVar, f2, jdVar), qxVar), qxVar, 56);
    }

    public static final long xqGvceK5x(long j, float f, qx qxVar) {
        dc dcVar = (dc) qxVar.JFJ3QoxA(fc.GWasM1elztuh);
        boolean booleanValue = ((Boolean) qxVar.JFJ3QoxA(fc.Yi7zF1RB1)).booleanValue();
        long j2 = dcVar.WIEu4Ya2g8;
        return (yb.X1lG3V04pd(j, j2) && booleanValue) ? cn.Yi7zF1RB1(f, 0.0f) ? j2 : ki1.cilMamHF(yb.Yi7zF1RB1(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, dcVar.jivtDDk9H), j2) : j;
    }
}
