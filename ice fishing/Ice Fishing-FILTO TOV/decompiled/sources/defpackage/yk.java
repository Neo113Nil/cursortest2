package defpackage;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class yk extends he0 {
    public he0 jivtDDk9H;
    public final int mE4lRynR = ck0.OOA6hdeuvCS(this);

    @Override // defpackage.he0
    public final void FhVkB11j() {
        super.FhVkB11j();
        for (he0 he0Var = this.jivtDDk9H; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
            he0Var.FhVkB11j();
        }
    }

    @Override // defpackage.he0
    public final void WkXHDbKiD() {
        super.WkXHDbKiD();
        for (he0 he0Var = this.jivtDDk9H; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
            he0Var.xtv4Xm13vGi(this.E7jCp8Ls);
            if (!he0Var.Mjvvu5DE) {
                he0Var.WkXHDbKiD();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [he0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void XmVeRDAr(int i, boolean z) {
        he0 he0Var;
        int i2 = this.AvO7iQsrTN;
        this.AvO7iQsrTN = i;
        if (i2 != i) {
            he0 he0Var2 = this.OOA6hdeuvCS;
            if (he0Var2 == this) {
                this.encWxUiV2 = i;
            }
            boolean z2 = this.Mjvvu5DE;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.AvO7iQsrTN;
                    r2.AvO7iQsrTN = i;
                    if (r2 == he0Var2) {
                        break;
                    } else {
                        r2 = r2.mOu10nynGul;
                    }
                }
                if (z && r2 == he0Var2) {
                    i = ck0.EljAMC1QTz(he0Var2);
                    he0Var2.AvO7iQsrTN = i;
                }
                int i3 = i | ((r2 == 0 || (he0Var = r2.JFJ3QoxA) == null) ? 0 : he0Var.encWxUiV2);
                for (he0 he0Var3 = r2; he0Var3 != null; he0Var3 = he0Var3.mOu10nynGul) {
                    i3 |= he0Var3.AvO7iQsrTN;
                    he0Var3.encWxUiV2 = i3;
                }
            }
        }
    }

    public final xk gqMuANyCes(xk xkVar) {
        he0 he0Var = ((he0) xkVar).OOA6hdeuvCS;
        if (he0Var != xkVar) {
            he0 he0Var2 = xkVar instanceof he0 ? (he0) xkVar : null;
            he0 he0Var3 = he0Var2 != null ? he0Var2.mOu10nynGul : null;
            if (he0Var != this.OOA6hdeuvCS || !o30.rQPn8YBR(he0Var3, this)) {
                o4.jivtDDk9H("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (he0Var.Mjvvu5DE) {
                t10.Yi7zF1RB1("Cannot delegate to an already attached node");
            }
            he0Var.j6IIN2O8eOU(this.OOA6hdeuvCS);
            int i = this.AvO7iQsrTN;
            int EljAMC1QTz = ck0.EljAMC1QTz(he0Var);
            he0Var.AvO7iQsrTN = EljAMC1QTz;
            int i2 = this.AvO7iQsrTN;
            int i3 = EljAMC1QTz & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof w50)) {
                t10.Yi7zF1RB1("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + he0Var);
            }
            he0Var.JFJ3QoxA = this.jivtDDk9H;
            this.jivtDDk9H = he0Var;
            he0Var.mOu10nynGul = this;
            XmVeRDAr(EljAMC1QTz | this.AvO7iQsrTN, false);
            if (this.Mjvvu5DE) {
                if (i3 == 0 || (i & 2) != 0) {
                    xtv4Xm13vGi(this.E7jCp8Ls);
                } else {
                    xj0 xj0Var = vc0.eUH21U3apd(this).A1EKNP6CxJ;
                    this.OOA6hdeuvCS.xtv4Xm13vGi(null);
                    xj0Var.AvO7iQsrTN();
                }
                he0Var.WkXHDbKiD();
                he0Var.kbVzROOfKK();
                if (!he0Var.Mjvvu5DE) {
                    t10.Yi7zF1RB1("autoInvalidateInsertedNode called on unattached node");
                }
                ck0.GWasM1elztuh(he0Var, -1, 1);
            }
        }
        return xkVar;
    }

    @Override // defpackage.he0
    public final void hOpoc9RpANL() {
        super.hOpoc9RpANL();
        for (he0 he0Var = this.jivtDDk9H; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
            he0Var.hOpoc9RpANL();
        }
    }

    @Override // defpackage.he0
    public final void j6IIN2O8eOU(he0 he0Var) {
        this.OOA6hdeuvCS = he0Var;
        for (he0 he0Var2 = this.jivtDDk9H; he0Var2 != null; he0Var2 = he0Var2.JFJ3QoxA) {
            he0Var2.j6IIN2O8eOU(he0Var);
        }
    }

    @Override // defpackage.he0
    public final void kbVzROOfKK() {
        for (he0 he0Var = this.jivtDDk9H; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
            he0Var.kbVzROOfKK();
        }
        super.kbVzROOfKK();
    }

    public final void sb9fmtV8A(xk xkVar) {
        he0 he0Var = null;
        for (he0 he0Var2 = this.jivtDDk9H; he0Var2 != null; he0Var2 = he0Var2.JFJ3QoxA) {
            if (he0Var2 == xkVar) {
                boolean z = he0Var2.Mjvvu5DE;
                if (z) {
                    zf0 zf0Var = ck0.GWasM1elztuh;
                    if (!z) {
                        t10.Yi7zF1RB1("autoInvalidateRemovedNode called on unattached node");
                    }
                    ck0.GWasM1elztuh(he0Var2, -1, 2);
                    he0Var2.FhVkB11j();
                    he0Var2.vaTCmWUgXF();
                }
                he0Var2.j6IIN2O8eOU(he0Var2);
                he0Var2.encWxUiV2 = 0;
                he0 he0Var3 = he0Var2.JFJ3QoxA;
                if (he0Var == null) {
                    this.jivtDDk9H = he0Var3;
                } else {
                    he0Var.JFJ3QoxA = he0Var3;
                }
                he0Var2.JFJ3QoxA = null;
                he0Var2.mOu10nynGul = null;
                int i = this.AvO7iQsrTN;
                int EljAMC1QTz = ck0.EljAMC1QTz(this);
                XmVeRDAr(EljAMC1QTz, true);
                if (this.Mjvvu5DE && (i & 2) != 0 && (EljAMC1QTz & 2) == 0) {
                    xj0 xj0Var = vc0.eUH21U3apd(this).A1EKNP6CxJ;
                    this.OOA6hdeuvCS.xtv4Xm13vGi(null);
                    xj0Var.AvO7iQsrTN();
                    return;
                }
                return;
            }
            he0Var = he0Var2;
        }
        o4.EljAMC1QTz(xkVar, "Could not find delegate: ");
    }

    @Override // defpackage.he0
    public final void vaTCmWUgXF() {
        for (he0 he0Var = this.jivtDDk9H; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
            he0Var.vaTCmWUgXF();
        }
        super.vaTCmWUgXF();
    }

    @Override // defpackage.he0
    public final void xtv4Xm13vGi(bk0 bk0Var) {
        this.E7jCp8Ls = bk0Var;
        for (he0 he0Var = this.jivtDDk9H; he0Var != null; he0Var = he0Var.JFJ3QoxA) {
            he0Var.xtv4Xm13vGi(bk0Var);
        }
    }
}
