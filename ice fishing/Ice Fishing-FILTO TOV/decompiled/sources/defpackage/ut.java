package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ut extends yk implements b01, gy, ef, sk0, va1 {
    public static final k61 pog2g9KITJA = new k61(29);
    public bk0 WRKkgoJXwDn;
    public u70 WdrkLMV3xh;
    public tf0 Y6hRI1cF8;
    public final rt arNh8D4Z5gB;
    public final OOA6hdeuvCS cilMamHF;
    public et lv06NcmrQ;

    public ut(tf0 tf0Var, OOA6hdeuvCS oOA6hdeuvCS) {
        this.Y6hRI1cF8 = tf0Var;
        this.cilMamHF = oOA6hdeuvCS;
        rt rtVar = new rt(0, new tt(2, this, ut.class, "onFocusStateChange", "onFocusStateChange(Landroidx/compose/ui/focus/FocusState;Landroidx/compose/ui/focus/FocusState;)V", 0, 0), 10);
        gqMuANyCes(rtVar);
        this.arNh8D4Z5gB = rtVar;
    }

    @Override // defpackage.va1
    public final Object E7jCp8Ls() {
        return pog2g9KITJA;
    }

    public final void Hc2GqxcqBiX(tf0 tf0Var, d30 d30Var) {
        if (!this.Mjvvu5DE) {
            tf0Var.Yi7zF1RB1(d30Var);
        } else {
            f40 f40Var = (f40) ((ug) oFzb77RX3H8t()).OOA6hdeuvCS.E7jCp8Ls(b9xEq24R1.VeqTn1PQw7);
            fb1.MZhzXH72(oFzb77RX3H8t(), null, new EljAMC1QTz(tf0Var, d30Var, f40Var != null ? f40Var.Mjvvu5DE(new X1lG3V04pd(7, tf0Var, d30Var)) : null, null, 10), 3);
        }
    }

    public final void OGdJP42E(tf0 tf0Var) {
        et etVar;
        if (o30.rQPn8YBR(this.Y6hRI1cF8, tf0Var)) {
            return;
        }
        tf0 tf0Var2 = this.Y6hRI1cF8;
        if (tf0Var2 != null && (etVar = this.lv06NcmrQ) != null) {
            tf0Var2.Yi7zF1RB1(new ft(etVar));
        }
        this.lv06NcmrQ = null;
        this.Y6hRI1cF8 = tf0Var;
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    @Override // defpackage.b01
    public final void Uxq83abb04(l01 l01Var) {
        boolean GWasM1elztuh = this.arNh8D4Z5gB.bfDgRvRIg().GWasM1elztuh();
        u40[] u40VarArr = j01.GWasM1elztuh;
        k01 k01Var = h01.E7jCp8Ls;
        u40 u40Var = j01.GWasM1elztuh[4];
        l01Var.GWasM1elztuh(k01Var, Boolean.valueOf(GWasM1elztuh));
        l01Var.GWasM1elztuh(yz0.cilMamHF, new VeqTn1PQw7(null, new wDCmwMuMZmB(0, this, ut.class, "requestFocus", "requestFocus()Z", 0, 0, 2)));
    }

    @Override // defpackage.sk0
    public final void YZjbz8VdP5() {
        rt0 rt0Var = new rt0();
        w60.cilMamHF(this, new h2(4, rt0Var, this));
        u70 u70Var = (u70) rt0Var.OOA6hdeuvCS;
        if (this.arNh8D4Z5gB.bfDgRvRIg().GWasM1elztuh()) {
            u70 u70Var2 = this.WdrkLMV3xh;
            if (u70Var2 != null) {
                u70Var2.Yi7zF1RB1();
            }
            if (u70Var != null) {
                u70Var.GWasM1elztuh();
            } else {
                u70Var = null;
            }
            this.WdrkLMV3xh = u70Var;
        }
    }

    @Override // defpackage.he0
    public final void gHe2tSmr6w() {
        u70 u70Var = this.WdrkLMV3xh;
        if (u70Var != null) {
            u70Var.Yi7zF1RB1();
        }
        this.WdrkLMV3xh = null;
    }

    @Override // defpackage.gy
    public final void iwATDS1i01k(bk0 bk0Var) {
        this.WRKkgoJXwDn = bk0Var;
        if (this.arNh8D4Z5gB.bfDgRvRIg().GWasM1elztuh()) {
            boolean z = bk0Var.iK7aQfvhG().Mjvvu5DE;
            vt vtVar = wt.mE4lRynR;
            if (!z) {
                if (this.Mjvvu5DE) {
                    w60.E7jCp8Ls(this, vtVar);
                }
            } else {
                bk0 bk0Var2 = this.WRKkgoJXwDn;
                if (bk0Var2 != null && bk0Var2.iK7aQfvhG().Mjvvu5DE && this.Mjvvu5DE) {
                    w60.E7jCp8Ls(this, vtVar);
                }
            }
        }
    }
}
