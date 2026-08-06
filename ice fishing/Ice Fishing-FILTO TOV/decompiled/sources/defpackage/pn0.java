package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
final class pn0 extends me0 {
    public final rd1 GWasM1elztuh;
    public final s6 Yi7zF1RB1;

    public pn0(rd1 rd1Var, s6 s6Var) {
        this.GWasM1elztuh = rd1Var;
        this.Yi7zF1RB1 = s6Var;
    }

    @Override // defpackage.me0
    public final void OOA6hdeuvCS(he0 he0Var) {
        qn0 qn0Var = (qn0) he0Var;
        boolean z = qn0Var.jivtDDk9H;
        rd1 rd1Var = this.GWasM1elztuh;
        boolean z2 = (z && t21.GWasM1elztuh(qn0Var.mE4lRynR.Yi7zF1RB1(), rd1Var.Yi7zF1RB1())) ? false : true;
        qn0Var.mE4lRynR = rd1Var;
        qn0Var.jivtDDk9H = true;
        qn0Var.Y6hRI1cF8 = b9xEq24R1.JFJ3QoxA;
        qn0Var.cilMamHF = pg.GWasM1elztuh;
        qn0Var.lv06NcmrQ = 1.0f;
        qn0Var.WdrkLMV3xh = this.Yi7zF1RB1;
        if (z2) {
            n4.XnEVoBF0td1l(qn0Var);
        }
        p.uFEq9NpZ(qn0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pn0)) {
            return false;
        }
        pn0 pn0Var = (pn0) obj;
        if (!o30.rQPn8YBR(this.GWasM1elztuh, pn0Var.GWasM1elztuh)) {
            return false;
        }
        r6 r6Var = b9xEq24R1.JFJ3QoxA;
        return r6Var.equals(r6Var) && Float.compare(1.0f, 1.0f) == 0 && o30.rQPn8YBR(this.Yi7zF1RB1, pn0Var.Yi7zF1RB1);
    }

    public final int hashCode() {
        int GWasM1elztuh = mr0.GWasM1elztuh(1.0f, (pg.GWasM1elztuh.hashCode() + ((Float.hashCode(0.0f) + (Float.hashCode(0.0f) * 31) + mr0.xqGvceK5x(this.GWasM1elztuh.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        s6 s6Var = this.Yi7zF1RB1;
        return GWasM1elztuh + (s6Var == null ? 0 : s6Var.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.GWasM1elztuh + ", sizeToIntrinsics=true, alignment=" + b9xEq24R1.JFJ3QoxA + ", contentScale=" + pg.GWasM1elztuh + ", alpha=1.0, colorFilter=" + this.Yi7zF1RB1 + ')';
    }

    @Override // defpackage.me0
    public final he0 xqGvceK5x() {
        r6 r6Var = b9xEq24R1.JFJ3QoxA;
        qn0 qn0Var = new qn0();
        qn0Var.mE4lRynR = this.GWasM1elztuh;
        qn0Var.jivtDDk9H = true;
        qn0Var.Y6hRI1cF8 = r6Var;
        qn0Var.cilMamHF = pg.GWasM1elztuh;
        qn0Var.lv06NcmrQ = 1.0f;
        qn0Var.WdrkLMV3xh = this.Yi7zF1RB1;
        return qn0Var;
    }
}
