package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class k60 {
    public boolean AvO7iQsrTN;
    public int E7jCp8Ls;
    public boolean EljAMC1QTz;
    public final g60 GWasM1elztuh;
    public boolean JFJ3QoxA;
    public boolean OOA6hdeuvCS;
    public boolean X1lG3V04pd;
    public boolean XnEVoBF0td1l;
    public boolean Yi7zF1RB1;
    public ac0 YmKjaVtbfp5Z;
    public int encWxUiV2;
    public int iwATDS1i01k;
    public int mOu10nynGul;
    public boolean rQPn8YBR;
    public boolean uFEq9NpZ;
    public c60 xqGvceK5x = c60.mOu10nynGul;
    public final ad0 WIEu4Ya2g8 = new ad0(this);

    public k60(g60 g60Var) {
        this.GWasM1elztuh = g60Var;
    }

    public final void AvO7iQsrTN(boolean z) {
        if (this.JFJ3QoxA != z) {
            this.JFJ3QoxA = z;
            if (z && !this.rQPn8YBR) {
                xqGvceK5x(this.E7jCp8Ls + 1);
            } else {
                if (z || this.rQPn8YBR) {
                    return;
                }
                xqGvceK5x(this.E7jCp8Ls - 1);
            }
        }
    }

    public final void EljAMC1QTz(boolean z) {
        if (this.rQPn8YBR != z) {
            this.rQPn8YBR = z;
            if (z && !this.JFJ3QoxA) {
                xqGvceK5x(this.E7jCp8Ls + 1);
            } else {
                if (z || this.JFJ3QoxA) {
                    return;
                }
                xqGvceK5x(this.E7jCp8Ls - 1);
            }
        }
    }

    public final bk0 GWasM1elztuh() {
        return this.GWasM1elztuh.A1EKNP6CxJ.xqGvceK5x;
    }

    public final void JFJ3QoxA() {
        ad0 ad0Var = this.WIEu4Ya2g8;
        k60 k60Var = ad0Var.JFJ3QoxA;
        Object obj = ad0Var.cilMamHF;
        g60 g60Var = this.GWasM1elztuh;
        if ((obj != null || k60Var.GWasM1elztuh().encWxUiV2() != null) && ad0Var.Y6hRI1cF8) {
            ad0Var.Y6hRI1cF8 = false;
            ad0Var.cilMamHF = k60Var.GWasM1elztuh().encWxUiV2();
            g60 cilMamHF = g60Var.cilMamHF();
            if (cilMamHF != null) {
                g60.MItybXapHX(cilMamHF, false, 7);
            }
        }
        ac0 ac0Var = this.YmKjaVtbfp5Z;
        if (ac0Var != null) {
            k60 k60Var2 = ac0Var.JFJ3QoxA;
            if (ac0Var.M3K9sHhK == null) {
                wb0 P4U4zqyW7wx = k60Var2.GWasM1elztuh().P4U4zqyW7wx();
                P4U4zqyW7wx.getClass();
                if (P4U4zqyW7wx.mE4lRynR.encWxUiV2() == null) {
                    return;
                }
            }
            if (ac0Var.pog2g9KITJA) {
                ac0Var.pog2g9KITJA = false;
                wb0 P4U4zqyW7wx2 = k60Var2.GWasM1elztuh().P4U4zqyW7wx();
                P4U4zqyW7wx2.getClass();
                ac0Var.M3K9sHhK = P4U4zqyW7wx2.mE4lRynR.encWxUiV2();
                if (l60.Mjvvu5DE(g60Var)) {
                    g60 cilMamHF2 = g60Var.cilMamHF();
                    if (cilMamHF2 != null) {
                        g60.MItybXapHX(cilMamHF2, false, 7);
                        return;
                    }
                    return;
                }
                g60 cilMamHF3 = g60Var.cilMamHF();
                if (cilMamHF3 != null) {
                    g60.qugwajBSa59j(cilMamHF3, false, 7);
                }
            }
        }
    }

    public final void OOA6hdeuvCS(int i) {
        int i2 = this.iwATDS1i01k;
        this.iwATDS1i01k = i;
        if ((i2 == 0) != (i == 0)) {
            g60 cilMamHF = this.GWasM1elztuh.cilMamHF();
            k60 k60Var = cilMamHF != null ? cilMamHF.MZhzXH72 : null;
            if (k60Var != null) {
                int i3 = k60Var.iwATDS1i01k;
                if (i == 0) {
                    k60Var.OOA6hdeuvCS(i3 - 1);
                } else {
                    k60Var.OOA6hdeuvCS(i3 + 1);
                }
            }
        }
    }

    public final void X1lG3V04pd(long j) {
        ac0 ac0Var = this.YmKjaVtbfp5Z;
        if (ac0Var != null) {
            k60 k60Var = ac0Var.JFJ3QoxA;
            k60Var.xqGvceK5x = c60.EljAMC1QTz;
            g60 g60Var = k60Var.GWasM1elztuh;
            k60Var.OOA6hdeuvCS = false;
            ac0Var.k8h8IjolWQ = j;
            in0 snapshotObserver = ((c) j60.GWasM1elztuh(g60Var)).getSnapshotObserver();
            zb0 zb0Var = ac0Var.EXrPz3p7hFb;
            snapshotObserver.GWasM1elztuh.X1lG3V04pd(g60Var, snapshotObserver.Yi7zF1RB1, zb0Var);
            k60Var.EljAMC1QTz = true;
            k60Var.AvO7iQsrTN = true;
            boolean Mjvvu5DE = l60.Mjvvu5DE(g60Var);
            ad0 ad0Var = k60Var.WIEu4Ya2g8;
            if (Mjvvu5DE) {
                ad0Var.arNh8D4Z5gB = true;
                ad0Var.pog2g9KITJA = true;
            } else {
                ad0Var.WRKkgoJXwDn = true;
            }
            k60Var.xqGvceK5x = c60.mOu10nynGul;
        }
    }

    public final void Yi7zF1RB1() {
        c60 c60Var = this.GWasM1elztuh.MZhzXH72.xqGvceK5x;
        c60 c60Var2 = c60.AvO7iQsrTN;
        c60 c60Var3 = c60.encWxUiV2;
        if (c60Var == c60Var2 || c60Var == c60Var3) {
            if (this.WIEu4Ya2g8.ozMwhSAI) {
                AvO7iQsrTN(true);
            } else {
                EljAMC1QTz(true);
            }
        }
        if (c60Var == c60Var3) {
            ac0 ac0Var = this.YmKjaVtbfp5Z;
            if (ac0Var == null || !ac0Var.WRKkgoJXwDn) {
                encWxUiV2(true);
            } else {
                mOu10nynGul(true);
            }
        }
    }

    public final void encWxUiV2(boolean z) {
        if (this.uFEq9NpZ != z) {
            this.uFEq9NpZ = z;
            if (z && !this.XnEVoBF0td1l) {
                OOA6hdeuvCS(this.iwATDS1i01k + 1);
            } else {
                if (z || this.XnEVoBF0td1l) {
                    return;
                }
                OOA6hdeuvCS(this.iwATDS1i01k - 1);
            }
        }
    }

    public final void mOu10nynGul(boolean z) {
        if (this.XnEVoBF0td1l != z) {
            this.XnEVoBF0td1l = z;
            if (z && !this.uFEq9NpZ) {
                OOA6hdeuvCS(this.iwATDS1i01k + 1);
            } else {
                if (z || this.uFEq9NpZ) {
                    return;
                }
                OOA6hdeuvCS(this.iwATDS1i01k - 1);
            }
        }
    }

    public final void xqGvceK5x(int i) {
        int i2 = this.E7jCp8Ls;
        this.E7jCp8Ls = i;
        if ((i2 == 0) != (i == 0)) {
            g60 cilMamHF = this.GWasM1elztuh.cilMamHF();
            k60 k60Var = cilMamHF != null ? cilMamHF.MZhzXH72 : null;
            if (k60Var != null) {
                int i3 = k60Var.E7jCp8Ls;
                if (i == 0) {
                    k60Var.xqGvceK5x(i3 - 1);
                } else {
                    k60Var.xqGvceK5x(i3 + 1);
                }
            }
        }
    }
}
