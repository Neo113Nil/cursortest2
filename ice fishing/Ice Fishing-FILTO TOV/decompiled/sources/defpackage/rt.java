package defpackage;

import android.os.Trace;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class rt extends he0 implements ef, l50, sk0, ke0, xk {
    public boolean Y6hRI1cF8;
    public final int cilMamHF;
    public boolean jivtDDk9H;
    public final lv mE4lRynR;

    public rt(int i, lv lvVar, int i2) {
        this.mE4lRynR = (i2 & 4) != 0 ? null : lvVar;
        this.cilMamHF = i;
    }

    public final kt0 Hc2GqxcqBiX(n50 n50Var) {
        kt0 kt0Var = XmVeRDAr().E7jCp8Ls;
        return kt0Var != b9xEq24R1.MZhzXH72 ? n50Var == null ? kt0Var : kt0Var.OOA6hdeuvCS(n50Var.YZjbz8VdP5(vc0.YZjbz8VdP5(this), 0L)) : n50Var != null ? n50Var.eUH21U3apd(vc0.YZjbz8VdP5(this), false) : w60.EljAMC1QTz(0L, o30.CMh55RymNfS(vc0.YZjbz8VdP5(this).AvO7iQsrTN));
    }

    public final i70 OGdJP42E() {
        xj0 xj0Var;
        Object obj;
        if (!this.OOA6hdeuvCS.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitAncestors called on an unattached node");
        }
        he0 he0Var = this.OOA6hdeuvCS.mOu10nynGul;
        g60 eUH21U3apd = vc0.eUH21U3apd(this);
        while (true) {
            if (eUH21U3apd == null) {
                break;
            }
            if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 8388640) != 0) {
                while (he0Var != null) {
                    int i = he0Var.AvO7iQsrTN;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(he0Var instanceof i70)) {
                                if (he0Var instanceof yk) {
                                    he0Var = null;
                                    for (he0 he0Var2 = ((yk) he0Var).jivtDDk9H; he0Var2 != null; he0Var2 = he0Var2.JFJ3QoxA) {
                                        if (he0Var2 instanceof i70) {
                                            he0Var = he0Var2;
                                        }
                                    }
                                } else {
                                    he0Var = null;
                                }
                            }
                            i70 i70Var = (i70) he0Var;
                            if (i70Var != null) {
                                return i70Var;
                            }
                        } else if ((i & 32) != 0) {
                            if (he0Var instanceof ke0) {
                                obj = he0Var;
                            } else if (he0Var instanceof yk) {
                                obj = null;
                                for (he0 he0Var3 = ((yk) he0Var).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                    if (he0Var3 instanceof ke0) {
                                        obj = he0Var3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            ke0 ke0Var = (ke0) obj;
                            if (ke0Var != null) {
                                ke0Var.encWxUiV2();
                            }
                        }
                    }
                    he0Var = he0Var.mOu10nynGul;
                }
            }
            eUH21U3apd = eUH21U3apd.cilMamHF();
            he0Var = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
        }
        return null;
    }

    @Override // defpackage.he0
    public final boolean UjhVk5crk() {
        return false;
    }

    public final ot XmVeRDAr() {
        boolean z;
        xj0 xj0Var;
        ot otVar = new ot();
        otVar.GWasM1elztuh = true;
        pt ptVar = pt.Yi7zF1RB1;
        otVar.Yi7zF1RB1 = ptVar;
        otVar.X1lG3V04pd = ptVar;
        otVar.xqGvceK5x = ptVar;
        otVar.OOA6hdeuvCS = ptVar;
        otVar.EljAMC1QTz = ptVar;
        otVar.AvO7iQsrTN = ptVar;
        otVar.encWxUiV2 = ptVar;
        otVar.mOu10nynGul = ptVar;
        otVar.JFJ3QoxA = XdwzlWIkSDqF.jivtDDk9H;
        otVar.rQPn8YBR = XdwzlWIkSDqF.Y6hRI1cF8;
        otVar.E7jCp8Ls = b9xEq24R1.MZhzXH72;
        int i = this.cilMamHF;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((b20) ((d20) ((c20) o30.Mjvvu5DE(this, kf.XnEVoBF0td1l))).GWasM1elztuh.getValue()).GWasM1elztuh == 1);
        } else {
            if (i != 2) {
                o4.jivtDDk9H("Unknown Focusability");
                return null;
            }
            z = false;
        }
        otVar.GWasM1elztuh = z;
        he0 he0Var = this.OOA6hdeuvCS;
        if (!he0Var.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitAncestors called on an unattached node");
        }
        he0 he0Var2 = this.OOA6hdeuvCS;
        g60 eUH21U3apd = vc0.eUH21U3apd(this);
        loop0: while (eUH21U3apd != null) {
            if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 3072) != 0) {
                while (he0Var2 != null) {
                    int i2 = he0Var2.AvO7iQsrTN;
                    if ((i2 & 3072) != 0) {
                        if (he0Var2 != he0Var && (i2 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            rg0 rg0Var = null;
                            he0 he0Var3 = he0Var2;
                            while (he0Var3 != null) {
                                if (he0Var3 instanceof g6) {
                                    ge0 ge0Var = ((g6) he0Var3).mE4lRynR;
                                    t10.Yi7zF1RB1("applyFocusProperties called on wrong node");
                                    ge0Var.getClass();
                                    o4.YmKjaVtbfp5Z();
                                    return null;
                                }
                                if ((he0Var3.AvO7iQsrTN & 2048) != 0 && (he0Var3 instanceof yk)) {
                                    int i3 = 0;
                                    for (he0 he0Var4 = ((yk) he0Var3).jivtDDk9H; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
                                        if ((he0Var4.AvO7iQsrTN & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                he0Var3 = he0Var4;
                                            } else {
                                                if (rg0Var == null) {
                                                    rg0Var = new rg0(new he0[16]);
                                                }
                                                if (he0Var3 != null) {
                                                    rg0Var.Yi7zF1RB1(he0Var3);
                                                    he0Var3 = null;
                                                }
                                                rg0Var.Yi7zF1RB1(he0Var4);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                he0Var3 = vc0.E7jCp8Ls(rg0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    he0Var2 = he0Var2.mOu10nynGul;
                }
            }
            eUH21U3apd = eUH21U3apd.cilMamHF();
            he0Var2 = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
        }
        return otVar;
    }

    @Override // defpackage.sk0
    public final void YZjbz8VdP5() {
        fX9rg6CD();
    }

    @Override // defpackage.he0
    public final void bCsSzSHkbaQ() {
        int ordinal = bfDgRvRIg().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                ((c) vc0.A1EKNP6CxJ(this)).getFocusOwner();
                qj.Mjvvu5DE(this);
                return;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                o4.xqGvceK5x();
                return;
            }
        }
        nt ntVar = (nt) ((c) vc0.A1EKNP6CxJ(this)).getFocusOwner();
        ntVar.Yi7zF1RB1(8, true, false);
        ntVar.xqGvceK5x.GWasM1elztuh();
    }

    public final qt bfDgRvRIg() {
        xj0 xj0Var;
        boolean z = this.Mjvvu5DE;
        qt qtVar = qt.AvO7iQsrTN;
        if (!z) {
            return qtVar;
        }
        rt EljAMC1QTz = ((nt) ((c) vc0.A1EKNP6CxJ(this)).getFocusOwner()).EljAMC1QTz();
        if (EljAMC1QTz == null) {
            return qtVar;
        }
        if (this == EljAMC1QTz) {
            return qt.OOA6hdeuvCS;
        }
        if (EljAMC1QTz.Mjvvu5DE) {
            if (!EljAMC1QTz.OOA6hdeuvCS.Mjvvu5DE) {
                t10.Yi7zF1RB1("visitAncestors called on an unattached node");
            }
            he0 he0Var = EljAMC1QTz.OOA6hdeuvCS.mOu10nynGul;
            g60 eUH21U3apd = vc0.eUH21U3apd(EljAMC1QTz);
            while (eUH21U3apd != null) {
                if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 1024) != 0) {
                    while (he0Var != null) {
                        if ((he0Var.AvO7iQsrTN & 1024) != 0) {
                            he0 he0Var2 = he0Var;
                            rg0 rg0Var = null;
                            while (he0Var2 != null) {
                                if (he0Var2 instanceof rt) {
                                    if (this == ((rt) he0Var2)) {
                                        return qt.EljAMC1QTz;
                                    }
                                } else if ((he0Var2.AvO7iQsrTN & 1024) != 0 && (he0Var2 instanceof yk)) {
                                    int i = 0;
                                    for (he0 he0Var3 = ((yk) he0Var2).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                        if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                he0Var2 = he0Var3;
                                            } else {
                                                if (rg0Var == null) {
                                                    rg0Var = new rg0(new he0[16]);
                                                }
                                                if (he0Var2 != null) {
                                                    rg0Var.Yi7zF1RB1(he0Var2);
                                                    he0Var2 = null;
                                                }
                                                rg0Var.Yi7zF1RB1(he0Var3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                he0Var2 = vc0.E7jCp8Ls(rg0Var);
                            }
                        }
                        he0Var = he0Var.mOu10nynGul;
                    }
                }
                eUH21U3apd = eUH21U3apd.cilMamHF();
                he0Var = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
            }
        }
        return qtVar;
    }

    public final boolean d5idzIhj55b(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return XmVeRDAr().GWasM1elztuh ? gqMuANyCes() : d70.iwATDS1i01k(this, i, new ux0(i));
        } finally {
            Trace.endSection();
        }
    }

    public final void fX9rg6CD() {
        int ordinal = bfDgRvRIg().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                o4.xqGvceK5x();
                return;
            }
        }
        rt0 rt0Var = new rt0();
        w60.cilMamHF(this, new psOJLYhIz(4, rt0Var, this));
        Object obj = rt0Var.OOA6hdeuvCS;
        if (obj == null) {
            o30.YXi2hvwn7WL("focusProperties");
            throw null;
        }
        if (((ot) obj).GWasM1elztuh) {
            return;
        }
        ((nt) ((c) vc0.A1EKNP6CxJ(this)).getFocusOwner()).Yi7zF1RB1(8, true, true);
    }

    @Override // defpackage.he0
    public final void gHe2tSmr6w() {
        if (bfDgRvRIg().GWasM1elztuh()) {
            ((nt) ((c) vc0.A1EKNP6CxJ(this)).getFocusOwner()).Yi7zF1RB1(8, true, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v12 */
    /* JADX WARN: Type inference failed for: r15v13 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [he0] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9, types: [he0] */
    /* JADX WARN: Type inference failed for: r1v44, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [rg0] */
    /* JADX WARN: Type inference failed for: r5v23, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v27 */
    public final boolean gqMuANyCes() {
        rg0 rg0Var;
        xj0 xj0Var;
        nt ntVar;
        boolean z;
        int i;
        ?? r5;
        int i2;
        int i3;
        xj0 xj0Var2;
        int ordinal = p.YmKjaVtbfp5Z(this).ordinal();
        if (ordinal == 0) {
            nt ntVar2 = (nt) ((c) vc0.A1EKNP6CxJ(this)).getFocusOwner();
            rt EljAMC1QTz = ntVar2.EljAMC1QTz();
            qt bfDgRvRIg = bfDgRvRIg();
            if (EljAMC1QTz == this) {
                sb9fmtV8A(bfDgRvRIg, bfDgRvRIg);
                return true;
            }
            if (EljAMC1QTz != null || ((nt) ((c) vc0.A1EKNP6CxJ(this)).getFocusOwner()).GWasM1elztuh.EXrPz3p7hFb()) {
                if (EljAMC1QTz != null) {
                    rg0Var = new rg0(new rt[16]);
                    if (!EljAMC1QTz.OOA6hdeuvCS.Mjvvu5DE) {
                        t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                    }
                    he0 he0Var = EljAMC1QTz.OOA6hdeuvCS.mOu10nynGul;
                    g60 eUH21U3apd = vc0.eUH21U3apd(EljAMC1QTz);
                    while (eUH21U3apd != null) {
                        if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 1024) != 0) {
                            while (he0Var != null) {
                                if ((he0Var.AvO7iQsrTN & 1024) != 0) {
                                    he0 he0Var2 = he0Var;
                                    rg0 rg0Var2 = null;
                                    while (he0Var2 != null) {
                                        if (he0Var2 instanceof rt) {
                                            rg0Var.Yi7zF1RB1((rt) he0Var2);
                                        } else if ((he0Var2.AvO7iQsrTN & 1024) != 0 && (he0Var2 instanceof yk)) {
                                            int i4 = 0;
                                            for (he0 he0Var3 = ((yk) he0Var2).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                                if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                                                    i4++;
                                                    if (i4 == 1) {
                                                        he0Var2 = he0Var3;
                                                    } else {
                                                        if (rg0Var2 == null) {
                                                            rg0Var2 = new rg0(new he0[16]);
                                                        }
                                                        if (he0Var2 != null) {
                                                            rg0Var2.Yi7zF1RB1(he0Var2);
                                                            he0Var2 = null;
                                                        }
                                                        rg0Var2.Yi7zF1RB1(he0Var3);
                                                    }
                                                }
                                            }
                                            if (i4 == 1) {
                                            }
                                        }
                                        he0Var2 = vc0.E7jCp8Ls(rg0Var2);
                                    }
                                }
                                he0Var = he0Var.mOu10nynGul;
                            }
                        }
                        eUH21U3apd = eUH21U3apd.cilMamHF();
                        he0Var = (eUH21U3apd == null || (xj0Var2 = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var2.OOA6hdeuvCS;
                    }
                } else {
                    rg0Var = null;
                }
                rt[] rtVarArr = new rt[16];
                rt[] rtVarArr2 = new rt[16];
                if (!this.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                }
                he0 he0Var4 = this.OOA6hdeuvCS.mOu10nynGul;
                g60 eUH21U3apd2 = vc0.eUH21U3apd(this);
                int i5 = 0;
                int i6 = 0;
                boolean z2 = true;
                while (eUH21U3apd2 != null) {
                    if ((eUH21U3apd2.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 1024) != 0) {
                        while (he0Var4 != null) {
                            if ((he0Var4.AvO7iQsrTN & 1024) != 0) {
                                rt rtVar = he0Var4;
                                rg0 rg0Var3 = null;
                                while (rtVar != 0) {
                                    if (rtVar instanceof rt) {
                                        rt rtVar2 = rtVar;
                                        if (o30.rQPn8YBR(rg0Var != null ? Boolean.valueOf(rg0Var.JFJ3QoxA(rtVar2)) : null, Boolean.TRUE)) {
                                            int i7 = i5 + 1;
                                            if (rtVarArr.length < i7) {
                                                int length = rtVarArr.length;
                                                ntVar = ntVar2;
                                                ?? r1 = new Object[Math.max(i7, length * 2)];
                                                i3 = i7;
                                                System.arraycopy(rtVarArr, 0, r1, 0, length);
                                                rtVarArr = r1;
                                            } else {
                                                ntVar = ntVar2;
                                                i3 = i7;
                                            }
                                            rtVarArr[i5] = rtVar2;
                                            i5 = i3;
                                        } else {
                                            ntVar = ntVar2;
                                            int i8 = i6 + 1;
                                            if (rtVarArr2.length < i8) {
                                                int length2 = rtVarArr2.length;
                                                ?? r52 = new Object[Math.max(i8, length2 * 2)];
                                                i2 = i8;
                                                System.arraycopy(rtVarArr2, 0, r52, 0, length2);
                                                rtVarArr2 = r52;
                                            } else {
                                                i2 = i8;
                                            }
                                            rtVarArr2[i6] = rtVar2;
                                            i6 = i2;
                                        }
                                        if (rtVar2 == EljAMC1QTz) {
                                            z2 = false;
                                        }
                                        z = false;
                                    } else {
                                        ntVar = ntVar2;
                                        z = true;
                                    }
                                    if (z && (rtVar.AvO7iQsrTN & 1024) != 0 && (rtVar instanceof yk)) {
                                        he0 he0Var5 = rtVar.jivtDDk9H;
                                        int i9 = 0;
                                        rtVar = rtVar;
                                        while (he0Var5 != null) {
                                            if ((he0Var5.AvO7iQsrTN & 1024) != 0) {
                                                int i10 = i9 + 1;
                                                if (i10 == 1) {
                                                    rtVar = he0Var5;
                                                    i = i10;
                                                } else {
                                                    if (rg0Var3 == null) {
                                                        i = i10;
                                                        r5 = new rg0(new he0[16]);
                                                    } else {
                                                        i = i10;
                                                        r5 = rg0Var3;
                                                    }
                                                    if (rtVar != 0) {
                                                        r5.Yi7zF1RB1(rtVar);
                                                        rtVar = 0;
                                                    }
                                                    r5.Yi7zF1RB1(he0Var5);
                                                    rg0Var3 = r5;
                                                    rtVar = rtVar;
                                                }
                                                i9 = i;
                                            }
                                            he0Var5 = he0Var5.JFJ3QoxA;
                                            rtVar = rtVar;
                                        }
                                        if (i9 == 1) {
                                            ntVar2 = ntVar;
                                        }
                                    }
                                    rtVar = vc0.E7jCp8Ls(rg0Var3);
                                    ntVar2 = ntVar;
                                }
                            }
                            he0Var4 = he0Var4.mOu10nynGul;
                            ntVar2 = ntVar2;
                        }
                    }
                    nt ntVar3 = ntVar2;
                    eUH21U3apd2 = eUH21U3apd2.cilMamHF();
                    he0Var4 = (eUH21U3apd2 == null || (xj0Var = eUH21U3apd2.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
                    ntVar2 = ntVar3;
                }
                nt ntVar4 = ntVar2;
                if (!z2 || EljAMC1QTz == null || p.encWxUiV2(EljAMC1QTz, false)) {
                    w60.cilMamHF(this, new d3(2, this));
                    int ordinal2 = bfDgRvRIg().ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 != 1) {
                            if (ordinal2 != 2) {
                                if (ordinal2 != 3) {
                                    o4.xqGvceK5x();
                                    return false;
                                }
                            }
                        }
                        ((nt) ((c) vc0.A1EKNP6CxJ(this)).getFocusOwner()).encWxUiV2(this);
                    }
                    qt qtVar = qt.AvO7iQsrTN;
                    qt qtVar2 = qt.OOA6hdeuvCS;
                    if (z2 && EljAMC1QTz != null) {
                        EljAMC1QTz.sb9fmtV8A(qtVar2, qtVar);
                    }
                    qt qtVar3 = qt.EljAMC1QTz;
                    if (rg0Var != null) {
                        int i11 = rg0Var.AvO7iQsrTN - 1;
                        Object[] objArr = rg0Var.OOA6hdeuvCS;
                        if (i11 < objArr.length) {
                            while (i11 >= 0) {
                                rt rtVar3 = (rt) objArr[i11];
                                if (ntVar4.EljAMC1QTz() != this) {
                                    break;
                                }
                                rtVar3.sb9fmtV8A(qtVar3, qtVar);
                                i11--;
                            }
                        }
                    }
                    int i12 = i6 - 1;
                    if (i12 < rtVarArr2.length) {
                        while (i12 >= 0) {
                            rt rtVar4 = rtVarArr2[i12];
                            if (ntVar4.EljAMC1QTz() != this) {
                                break;
                            }
                            rtVar4.sb9fmtV8A(rtVar4 == EljAMC1QTz ? qtVar2 : qtVar, qtVar3);
                            i12--;
                        }
                    }
                    if (ntVar4.EljAMC1QTz() == this) {
                        sb9fmtV8A(bfDgRvRIg, qtVar2);
                        if (ntVar4.EljAMC1QTz() != this) {
                            break;
                        }
                        return true;
                    }
                }
                return false;
            }
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return true;
            }
            if (ordinal != 3) {
                o4.xqGvceK5x();
                return false;
            }
        }
        return false;
    }

    public final void sb9fmtV8A(qt qtVar, qt qtVar2) {
        xj0 xj0Var;
        lv lvVar;
        nt ntVar = (nt) ((c) vc0.A1EKNP6CxJ(this)).getFocusOwner();
        rt EljAMC1QTz = ntVar.EljAMC1QTz();
        if (!qtVar.equals(qtVar2) && (lvVar = this.mE4lRynR) != null) {
            lvVar.EljAMC1QTz(qtVar, qtVar2);
        }
        he0 he0Var = this.OOA6hdeuvCS;
        if (!he0Var.Mjvvu5DE) {
            t10.Yi7zF1RB1("visitAncestors called on an unattached node");
        }
        he0 he0Var2 = this.OOA6hdeuvCS;
        g60 eUH21U3apd = vc0.eUH21U3apd(this);
        while (eUH21U3apd != null) {
            if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 5120) != 0) {
                while (he0Var2 != null) {
                    int i = he0Var2.AvO7iQsrTN;
                    if ((i & 5120) != 0) {
                        if (he0Var2 != he0Var && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            he0 he0Var3 = he0Var2;
                            rg0 rg0Var = null;
                            while (he0Var3 != null) {
                                if (he0Var3 instanceof g6) {
                                    g6 g6Var = (g6) he0Var3;
                                    if (EljAMC1QTz == ntVar.EljAMC1QTz()) {
                                        g6Var.sb9fmtV8A();
                                        throw null;
                                    }
                                } else if ((he0Var3.AvO7iQsrTN & 4096) != 0 && (he0Var3 instanceof yk)) {
                                    int i2 = 0;
                                    for (he0 he0Var4 = ((yk) he0Var3).jivtDDk9H; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
                                        if ((he0Var4.AvO7iQsrTN & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                he0Var3 = he0Var4;
                                            } else {
                                                if (rg0Var == null) {
                                                    rg0Var = new rg0(new he0[16]);
                                                }
                                                if (he0Var3 != null) {
                                                    rg0Var.Yi7zF1RB1(he0Var3);
                                                    he0Var3 = null;
                                                }
                                                rg0Var.Yi7zF1RB1(he0Var4);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                he0Var3 = vc0.E7jCp8Ls(rg0Var);
                            }
                        } else {
                            continue;
                        }
                    }
                    he0Var2 = he0Var2.mOu10nynGul;
                }
            }
            eUH21U3apd = eUH21U3apd.cilMamHF();
            he0Var2 = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
        }
    }

    @Override // defpackage.l50
    public final void rQPn8YBR(n50 n50Var) {
    }
}
