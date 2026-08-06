package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class n7 {
    public static final hg0 GWasM1elztuh = X1lG3V04pd(true);
    public static final hg0 Yi7zF1RB1 = X1lG3V04pd(false);
    public static final e0 X1lG3V04pd = e0.X1lG3V04pd;

    public static final void GWasM1elztuh(ie0 ie0Var, qx qxVar, int i) {
        qxVar.Uxq83abb04(-211209833);
        int i2 = (qxVar.EljAMC1QTz(ie0Var) ? 4 : 2) | i;
        int i3 = 0;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 3) != 2)) {
            int hashCode = Long.hashCode(qxVar.qugwajBSa59j);
            ie0 MZhzXH72 = n30.MZhzXH72(qxVar, ie0Var);
            cp0 E7jCp8Ls = qxVar.E7jCp8Ls();
            oe.X1lG3V04pd.getClass();
            hf hfVar = ne.Yi7zF1RB1;
            qxVar.c4eaifQP();
            if (qxVar.CMh55RymNfS) {
                qxVar.rQPn8YBR(hfVar);
            } else {
                qxVar.K0ReC6MK();
            }
            l60.WRKkgoJXwDn(ne.OOA6hdeuvCS, qxVar, X1lG3V04pd);
            l60.WRKkgoJXwDn(ne.xqGvceK5x, qxVar, E7jCp8Ls);
            l60.WdrkLMV3xh(qxVar, ne.AvO7iQsrTN);
            l60.WRKkgoJXwDn(ne.X1lG3V04pd, qxVar, MZhzXH72);
            l60.WRKkgoJXwDn(ne.EljAMC1QTz, qxVar, Integer.valueOf(hashCode));
            qxVar.WIEu4Ya2g8(true);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new m7(ie0Var, i, i3);
        }
    }

    public static final hg0 X1lG3V04pd(boolean z) {
        hg0 hg0Var = new hg0(9);
        r6 r6Var = b9xEq24R1.EljAMC1QTz;
        hg0Var.XnEVoBF0td1l(r6Var, new q7(r6Var, z));
        r6 r6Var2 = b9xEq24R1.AvO7iQsrTN;
        hg0Var.XnEVoBF0td1l(r6Var2, new q7(r6Var2, z));
        r6 r6Var3 = b9xEq24R1.encWxUiV2;
        hg0Var.XnEVoBF0td1l(r6Var3, new q7(r6Var3, z));
        r6 r6Var4 = b9xEq24R1.mOu10nynGul;
        hg0Var.XnEVoBF0td1l(r6Var4, new q7(r6Var4, z));
        r6 r6Var5 = b9xEq24R1.JFJ3QoxA;
        hg0Var.XnEVoBF0td1l(r6Var5, new q7(r6Var5, z));
        r6 r6Var6 = b9xEq24R1.rQPn8YBR;
        hg0Var.XnEVoBF0td1l(r6Var6, new q7(r6Var6, z));
        r6 r6Var7 = b9xEq24R1.E7jCp8Ls;
        hg0Var.XnEVoBF0td1l(r6Var7, new q7(r6Var7, z));
        r6 r6Var8 = b9xEq24R1.XnEVoBF0td1l;
        hg0Var.XnEVoBF0td1l(r6Var8, new q7(r6Var8, z));
        r6 r6Var9 = b9xEq24R1.uFEq9NpZ;
        hg0Var.XnEVoBF0td1l(r6Var9, new q7(r6Var9, z));
        return hg0Var;
    }

    public static final void Yi7zF1RB1(tp0 tp0Var, up0 up0Var, wc0 wc0Var, p50 p50Var, int i, int i2, r6 r6Var) {
        r6 r6Var2;
        Object encWxUiV2 = wc0Var.encWxUiV2();
        l7 l7Var = encWxUiV2 instanceof l7 ? (l7) encWxUiV2 : null;
        tp0.encWxUiV2(tp0Var, up0Var, ((l7Var == null || (r6Var2 = l7Var.mE4lRynR) == null) ? r6Var : r6Var2).GWasM1elztuh((up0Var.OOA6hdeuvCS << 32) | (up0Var.EljAMC1QTz & 4294967295L), (i << 32) | (i2 & 4294967295L), p50Var));
    }

    public static final bd0 xqGvceK5x(r6 r6Var, boolean z) {
        bd0 bd0Var = (bd0) (z ? GWasM1elztuh : Yi7zF1RB1).AvO7iQsrTN(r6Var);
        return bd0Var == null ? new q7(r6Var, z) : bd0Var;
    }
}
