package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class uc0 {
    public static final v51 GWasM1elztuh;

    static {
        d70.pog2g9KITJA(new sb9fmtV8A(23));
        GWasM1elztuh = new v51(new sb9fmtV8A(24));
    }

    public static final void GWasM1elztuh(dc dcVar, we0 we0Var, d21 d21Var, vb1 vb1Var, qx qxVar, int i) {
        int i2;
        jd jdVar = qj.JFJ3QoxA;
        qxVar.Uxq83abb04(904511636);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(dcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= qxVar.EljAMC1QTz(we0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.EljAMC1QTz(d21Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qxVar.EljAMC1QTz(vb1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= qxVar.encWxUiV2(jdVar) ? 16384 : 8192;
        }
        int i3 = 1;
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 9363) != 9362)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) != 0 && !qxVar.WRKkgoJXwDn()) {
                qxVar.YXi2hvwn7WL();
            }
            qxVar.YmKjaVtbfp5Z();
            nv0 GWasM1elztuh2 = lv0.GWasM1elztuh(0.0f, 7);
            long j = dcVar.GWasM1elztuh;
            boolean OOA6hdeuvCS = qxVar.OOA6hdeuvCS(j);
            Object HFYAaqMd6 = qxVar.HFYAaqMd6();
            if (OOA6hdeuvCS || HFYAaqMd6 == ue.GWasM1elztuh) {
                HFYAaqMd6 = new s81(j, yb.Yi7zF1RB1(0.4f, j));
                qxVar.dcDmLGVhzWm(HFYAaqMd6);
            }
            vc0.xqGvceK5x(new qs0[]{fc.GWasM1elztuh.GWasM1elztuh(dcVar), GWasM1elztuh.GWasM1elztuh(we0Var), t00.GWasM1elztuh.GWasM1elztuh(GWasM1elztuh2), e21.GWasM1elztuh.GWasM1elztuh(d21Var), t81.GWasM1elztuh.GWasM1elztuh((s81) HFYAaqMd6), xb1.GWasM1elztuh.GWasM1elztuh(vb1Var)}, rj0.YZjbz8VdP5(-1750539308, new uj(i3, vb1Var), qxVar), qxVar, 56);
        } else {
            qxVar.YXi2hvwn7WL();
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new Hc2GqxcqBiX(dcVar, we0Var, d21Var, vb1Var, i, 3);
        }
    }

    public static final void Yi7zF1RB1(dc dcVar, d21 d21Var, vb1 vb1Var, qx qxVar, int i) {
        int i2;
        d21 d21Var2;
        int i3;
        jd jdVar = qj.JFJ3QoxA;
        qxVar.Uxq83abb04(-449719819);
        if ((i & 6) == 0) {
            i2 = (qxVar.EljAMC1QTz(dcVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= qxVar.EljAMC1QTz(vb1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= qxVar.encWxUiV2(jdVar) ? 2048 : 1024;
        }
        if (qxVar.dqB83aoLBB(i2 & 1, (i2 & 1171) != 1170)) {
            qxVar.qugwajBSa59j();
            if ((i & 1) == 0 || qxVar.WRKkgoJXwDn()) {
                int i4 = i2 & (-113);
                d21Var2 = (d21) qxVar.JFJ3QoxA(e21.GWasM1elztuh);
                i3 = i4;
            } else {
                qxVar.YXi2hvwn7WL();
                i3 = i2 & (-113);
                d21Var2 = d21Var;
            }
            qxVar.YmKjaVtbfp5Z();
            int i5 = i3 & 14;
            int i6 = i3 << 3;
            GWasM1elztuh(dcVar, (we0) qxVar.JFJ3QoxA(GWasM1elztuh), d21Var2, vb1Var, qxVar, (i6 & 57344) | i5 | (i6 & 7168));
        } else {
            qxVar.YXi2hvwn7WL();
            d21Var2 = d21Var;
        }
        at0 Mjvvu5DE = qxVar.Mjvvu5DE();
        if (Mjvvu5DE != null) {
            Mjvvu5DE.xqGvceK5x = new u7(dcVar, d21Var2, vb1Var, i, 6);
        }
    }
}
