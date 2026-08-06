package defpackage;

import android.os.Trace;
import android.view.KeyEvent;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class nt implements kt {
    public wf0 EljAMC1QTz;
    public final c GWasM1elztuh;
    public final c Yi7zF1RB1;
    public rt encWxUiV2;
    public final ht xqGvceK5x;
    public final rt X1lG3V04pd = new rt(2, null, 14);
    public final lt OOA6hdeuvCS = new lt(this);
    public final ag0 AvO7iQsrTN = new ag0(1);

    public nt(c cVar, c cVar2) {
        this.GWasM1elztuh = cVar;
        this.Yi7zF1RB1 = cVar2;
        this.xqGvceK5x = new ht(this, cVar2);
    }

    public final boolean AvO7iQsrTN(int i) {
        if (!Yi7zF1RB1(i, false, false)) {
            return false;
        }
        Boolean OOA6hdeuvCS = OOA6hdeuvCS(i, null, new LkTGMga05DQy(i, 2));
        boolean booleanValue = OOA6hdeuvCS != null ? OOA6hdeuvCS.booleanValue() : false;
        if (!booleanValue) {
            X1lG3V04pd();
        }
        return booleanValue;
    }

    public final rt EljAMC1QTz() {
        rt rtVar = this.encWxUiV2;
        if (rtVar == null || !rtVar.Mjvvu5DE) {
            return null;
        }
        return rtVar;
    }

    public final boolean GWasM1elztuh(boolean z) {
        xj0 xj0Var;
        if (EljAMC1QTz() != null) {
            rt EljAMC1QTz = EljAMC1QTz();
            encWxUiV2(null);
            if (EljAMC1QTz != null) {
                qt qtVar = qt.OOA6hdeuvCS;
                qt qtVar2 = qt.AvO7iQsrTN;
                EljAMC1QTz.sb9fmtV8A(qtVar, qtVar2);
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
                                        ((rt) he0Var2).sb9fmtV8A(qt.EljAMC1QTz, qtVar2);
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
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x010e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean OOA6hdeuvCS(int i, kt0 kt0Var, hv hvVar) {
        boolean iwATDS1i01k;
        rt rtVar;
        xj0 xj0Var;
        rt rtVar2 = this.X1lG3V04pd;
        rt Mjvvu5DE = qj.Mjvvu5DE(rtVar2);
        int i2 = 4;
        c cVar = this.Yi7zF1RB1;
        boolean z = false;
        if (Mjvvu5DE != null) {
            p50 layoutDirection = cVar.getLayoutDirection();
            ot XmVeRDAr = Mjvvu5DE.XmVeRDAr();
            pt ptVar = XmVeRDAr.encWxUiV2;
            pt ptVar2 = XmVeRDAr.mOu10nynGul;
            if (i == 1) {
                ptVar = XmVeRDAr.Yi7zF1RB1;
            } else if (i == 2) {
                ptVar = XmVeRDAr.X1lG3V04pd;
            } else if (i == 5) {
                ptVar = XmVeRDAr.xqGvceK5x;
            } else if (i == 6) {
                ptVar = XmVeRDAr.OOA6hdeuvCS;
            } else if (i == 3) {
                int ordinal = layoutDirection.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        o4.xqGvceK5x();
                        return null;
                    }
                    ptVar = ptVar2;
                }
                if (ptVar == pt.Yi7zF1RB1) {
                    ptVar = null;
                }
                if (ptVar == null) {
                    ptVar = XmVeRDAr.EljAMC1QTz;
                }
            } else if (i == 4) {
                int ordinal2 = layoutDirection.ordinal();
                if (ordinal2 == 0) {
                    ptVar = ptVar2;
                } else if (ordinal2 != 1) {
                    o4.xqGvceK5x();
                    return null;
                }
                if (ptVar == pt.Yi7zF1RB1) {
                    ptVar = null;
                }
                if (ptVar == null) {
                    ptVar = XmVeRDAr.AvO7iQsrTN;
                }
            } else {
                if (i != 7 && i != 8) {
                    o4.jivtDDk9H("invalid FocusDirection");
                    return null;
                }
                nt ntVar = (nt) ((c) vc0.A1EKNP6CxJ(Mjvvu5DE)).getFocusOwner();
                rt EljAMC1QTz = ntVar.EljAMC1QTz();
                if (i == 7) {
                    XmVeRDAr.JFJ3QoxA.getClass();
                } else {
                    XmVeRDAr.rQPn8YBR.getClass();
                }
                ptVar = EljAMC1QTz != ntVar.EljAMC1QTz() ? pt.xqGvceK5x : pt.Yi7zF1RB1;
            }
            pt ptVar3 = pt.X1lG3V04pd;
            if (!o30.rQPn8YBR(ptVar, ptVar3)) {
                if (o30.rQPn8YBR(ptVar, pt.xqGvceK5x)) {
                    rt Mjvvu5DE2 = qj.Mjvvu5DE(rtVar2);
                    if (Mjvvu5DE2 != null) {
                        return (Boolean) hvVar.mOu10nynGul(Mjvvu5DE2);
                    }
                } else {
                    pt ptVar4 = pt.Yi7zF1RB1;
                    if (!o30.rQPn8YBR(ptVar, ptVar4)) {
                        if (ptVar == ptVar4) {
                            o4.jivtDDk9H("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        if (ptVar == ptVar3) {
                            o4.jivtDDk9H("\n    Please check whether the focusRequester is FocusRequester.Cancel or FocusRequester.Default\n    before invoking any functions on the focusRequester.\n");
                            return null;
                        }
                        rg0 rg0Var = ptVar.GWasM1elztuh;
                        int i3 = rg0Var.AvO7iQsrTN;
                        if (i3 == 0) {
                            System.out.println((Object) "FocusRelatedWarning: \n   FocusRequester is not initialized. Here are some possible fixes:\n\n   1. Remember the FocusRequester: val focusRequester = remember { FocusRequester() }\n   2. Did you forget to add a Modifier.focusRequester() ?\n   3. Are you attempting to request focus during composition? Focus requests should be made in\n   response to some event. Eg Modifier.clickable { focusRequester.requestFocus() }\n");
                        } else {
                            Object[] objArr = rg0Var.OOA6hdeuvCS;
                            boolean z2 = false;
                            for (int i4 = 0; i4 < i3; i4++) {
                                g6 g6Var = (g6) objArr[i4];
                                if (!g6Var.OOA6hdeuvCS.Mjvvu5DE) {
                                    t10.Yi7zF1RB1("visitChildren called on an unattached node");
                                }
                                rg0 rg0Var2 = new rg0(new he0[16]);
                                he0 he0Var = g6Var.OOA6hdeuvCS;
                                he0 he0Var2 = he0Var.JFJ3QoxA;
                                if (he0Var2 == null) {
                                    vc0.mOu10nynGul(rg0Var2, he0Var);
                                } else {
                                    rg0Var2.Yi7zF1RB1(he0Var2);
                                }
                                while (true) {
                                    int i5 = rg0Var2.AvO7iQsrTN;
                                    if (i5 != 0) {
                                        he0 he0Var3 = (he0) rg0Var2.rQPn8YBR(i5 - 1);
                                        if ((he0Var3.encWxUiV2 & 1024) == 0) {
                                            vc0.mOu10nynGul(rg0Var2, he0Var3);
                                        } else {
                                            while (true) {
                                                if (he0Var3 == null) {
                                                    break;
                                                }
                                                if ((he0Var3.AvO7iQsrTN & 1024) != 0) {
                                                    rg0 rg0Var3 = null;
                                                    while (he0Var3 != null) {
                                                        if (he0Var3 instanceof rt) {
                                                            if (((Boolean) hvVar.mOu10nynGul((rt) he0Var3)).booleanValue()) {
                                                                z2 = true;
                                                                break;
                                                            }
                                                        } else if ((he0Var3.AvO7iQsrTN & 1024) != 0 && (he0Var3 instanceof yk)) {
                                                            int i6 = 0;
                                                            for (he0 he0Var4 = ((yk) he0Var3).jivtDDk9H; he0Var4 != null; he0Var4 = he0Var4.JFJ3QoxA) {
                                                                if ((he0Var4.AvO7iQsrTN & 1024) != 0) {
                                                                    i6++;
                                                                    if (i6 == 1) {
                                                                        he0Var3 = he0Var4;
                                                                    } else {
                                                                        if (rg0Var3 == null) {
                                                                            rg0Var3 = new rg0(new he0[16]);
                                                                        }
                                                                        if (he0Var3 != null) {
                                                                            rg0Var3.Yi7zF1RB1(he0Var3);
                                                                            he0Var3 = null;
                                                                        }
                                                                        rg0Var3.Yi7zF1RB1(he0Var4);
                                                                    }
                                                                }
                                                            }
                                                            if (i6 == 1) {
                                                            }
                                                        }
                                                        he0Var3 = vc0.E7jCp8Ls(rg0Var3);
                                                    }
                                                } else {
                                                    he0Var3 = he0Var3.JFJ3QoxA;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            z = z2;
                        }
                        return Boolean.valueOf(z);
                    }
                }
            }
            return null;
        }
        Mjvvu5DE = null;
        p50 layoutDirection2 = cVar.getLayoutDirection();
        n2 n2Var = new n2(Mjvvu5DE, this, hvVar, i2);
        if (i == 1 || i == 2) {
            if (i == 1) {
                iwATDS1i01k = b70.jivtDDk9H(rtVar2, n2Var);
            } else {
                if (i != 2) {
                    o4.jivtDDk9H("This function should only be used for 1-D focus search");
                    return null;
                }
                iwATDS1i01k = b70.iwATDS1i01k(rtVar2, n2Var);
            }
            return Boolean.valueOf(iwATDS1i01k);
        }
        if (i == 3 || i == 4 || i == 5 || i == 6) {
            return d70.dqB83aoLBB(i, n2Var, rtVar2, kt0Var);
        }
        if (i == 7) {
            int ordinal3 = layoutDirection2.ordinal();
            if (ordinal3 != 0) {
                if (ordinal3 != 1) {
                    o4.xqGvceK5x();
                    return null;
                }
                i2 = 3;
            }
            rt Mjvvu5DE3 = qj.Mjvvu5DE(rtVar2);
            if (Mjvvu5DE3 != null) {
                return d70.dqB83aoLBB(i2, n2Var, Mjvvu5DE3, kt0Var);
            }
            return null;
        }
        if (i != 8) {
            throw new IllegalStateException(("Focus search invoked with invalid FocusDirection " + ((Object) dt.GWasM1elztuh(i))).toString());
        }
        rt Mjvvu5DE4 = qj.Mjvvu5DE(rtVar2);
        if (Mjvvu5DE4 != null) {
            if (!Mjvvu5DE4.OOA6hdeuvCS.Mjvvu5DE) {
                t10.Yi7zF1RB1("visitAncestors called on an unattached node");
            }
            he0 he0Var5 = Mjvvu5DE4.OOA6hdeuvCS.mOu10nynGul;
            g60 eUH21U3apd = vc0.eUH21U3apd(Mjvvu5DE4);
            loop5: while (eUH21U3apd != null) {
                if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 1024) != 0) {
                    while (he0Var5 != null) {
                        if ((he0Var5.AvO7iQsrTN & 1024) != 0) {
                            he0 he0Var6 = he0Var5;
                            rg0 rg0Var4 = null;
                            while (he0Var6 != null) {
                                if (he0Var6 instanceof rt) {
                                    rt rtVar3 = (rt) he0Var6;
                                    if (rtVar3.XmVeRDAr().GWasM1elztuh) {
                                        rtVar = rtVar3;
                                        break loop5;
                                    }
                                } else if ((he0Var6.AvO7iQsrTN & 1024) != 0 && (he0Var6 instanceof yk)) {
                                    int i7 = 0;
                                    for (he0 he0Var7 = ((yk) he0Var6).jivtDDk9H; he0Var7 != null; he0Var7 = he0Var7.JFJ3QoxA) {
                                        if ((he0Var7.AvO7iQsrTN & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                he0Var6 = he0Var7;
                                            } else {
                                                if (rg0Var4 == null) {
                                                    rg0Var4 = new rg0(new he0[16]);
                                                }
                                                if (he0Var6 != null) {
                                                    rg0Var4.Yi7zF1RB1(he0Var6);
                                                    he0Var6 = null;
                                                }
                                                rg0Var4.Yi7zF1RB1(he0Var7);
                                            }
                                        }
                                    }
                                    if (i7 != 1) {
                                        he0Var6 = vc0.E7jCp8Ls(rg0Var4);
                                    }
                                }
                                he0Var6 = vc0.E7jCp8Ls(rg0Var4);
                            }
                        }
                        he0Var5 = he0Var5.mOu10nynGul;
                    }
                }
                eUH21U3apd = eUH21U3apd.cilMamHF();
                he0Var5 = (eUH21U3apd == null || (xj0Var = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
            }
        }
        rtVar = null;
        if (rtVar != null && rtVar != rtVar2) {
            z = ((Boolean) n2Var.mOu10nynGul(rtVar)).booleanValue();
        }
        return Boolean.valueOf(z);
    }

    public final void X1lG3V04pd() {
        c cVar = this.GWasM1elztuh;
        if (cVar.isFocused() || cVar.hasFocus()) {
            cVar.clearFocus();
        } else if (cVar.hasFocus()) {
            View findFocus = cVar.findFocus();
            if (findFocus != null) {
                findFocus.clearFocus();
            }
            cVar.clearFocus();
        }
    }

    public final boolean Yi7zF1RB1(int i, boolean z, boolean z2) {
        boolean z3 = true;
        if (z) {
            GWasM1elztuh(z);
        } else {
            int ordinal = p.iwATDS1i01k(this.X1lG3V04pd).ordinal();
            if (ordinal == 0) {
                GWasM1elztuh(z);
            } else {
                if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                    o4.xqGvceK5x();
                    return false;
                }
                z3 = false;
            }
        }
        if (z3 && z2) {
            X1lG3V04pd();
        }
        return z3;
    }

    public final void encWxUiV2(rt rtVar) {
        rt rtVar2 = this.encWxUiV2;
        this.encWxUiV2 = rtVar;
        ag0 ag0Var = this.AvO7iQsrTN;
        Object[] objArr = ag0Var.GWasM1elztuh;
        int i = ag0Var.Yi7zF1RB1;
        for (int i2 = 0; i2 < i; i2++) {
            ((jt) objArr[i2]).xqGvceK5x(rtVar2, rtVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x0352, code lost:
    
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x009d, code lost:
    
        r33 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (((r8 & ((~r8) << 6)) & (-9187201950435737472L)) == r33) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00a9, code lost:
    
        r0 = r4.Yi7zF1RB1(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00af, code lost:
    
        if (r4.OOA6hdeuvCS != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c0, code lost:
    
        if (((r4.GWasM1elztuh[r0 >> 3] >> ((r0 & 7) << 3)) & 255) != 254) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c8, code lost:
    
        r0 = r4.X1lG3V04pd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ca, code lost:
    
        if (r0 <= 8) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00e1, code lost:
    
        if (java.lang.Long.compare((r4.xqGvceK5x * 32) ^ Long.MIN_VALUE, (r0 * 25) ^ Long.MIN_VALUE) > 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e3, code lost:
    
        r0 = r4.GWasM1elztuh;
        r6 = r4.X1lG3V04pd;
        r12 = r4.Yi7zF1RB1;
        r13 = (r6 + 7) >> 3;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ef, code lost:
    
        if (r14 >= r13) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00f1, code lost:
    
        r8 = r0[r14] & (-9187201950435737472L);
        r0[r14] = ((~r8) + (r8 >>> 7)) & (-72340172838076674L);
        r14 = r14 + 1;
        r5 = r5;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010c, code lost:
    
        r15 = r5;
        r18 = r6;
        r39 = 128;
        r5 = defpackage.d5.EDwNPVYuViP0(r0);
        r6 = r5 - 1;
        r13 = 72057594037927935L;
        r0[r6] = (r0[r6] & 72057594037927935L) | (-72057594037927936L);
        r0[r5] = r0[0];
        r5 = r18;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012d, code lost:
    
        if (r6 == r5) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x012f, code lost:
    
        r8 = r6 >> 3;
        r9 = (r6 & 7) << 3;
        r22 = (r0[r8] >> r9) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013d, code lost:
    
        if (r22 != 128) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0144, code lost:
    
        if (r22 == 254) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0147, code lost:
    
        r18 = java.lang.Long.hashCode(r12[r6]) * r28;
        r22 = r13;
        r13 = (r18 ^ (r18 << 16)) >>> 7;
        r14 = r4.Yi7zF1RB1(r13);
        r13 = r13 & r5;
        r29 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0169, code lost:
    
        if ((((r14 - r13) & r5) / 8) != (((r6 - r13) & r5) / 8)) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x018e, code lost:
    
        r15 = r7;
        r7 = r14 >> 3;
        r25 = r0[r7];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x019f, code lost:
    
        if (((r25 >> r8) & 255) != 128) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x01a1, code lost:
    
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | ((r18 & 127) << r8);
        r0[r8] = (r0[r8] & (~(255 << r9))) | (128 << r9);
        r12[r14] = r12[r36];
        r12[r36] = r33;
        r6 = r36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01e6, code lost:
    
        r0[r0.length - r15] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + r15;
        r7 = r15;
        r13 = r22;
        r15 = r29;
        r5 = r35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01c9, code lost:
    
        r35 = r5;
        r36 = r6;
        r0[r7] = (r25 & (~(255 << r8))) | ((r18 & 127) << r8);
        r5 = r12[r14];
        r12[r14] = r12[r36];
        r12[r36] = r5;
        r6 = r36 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x016b, code lost:
    
        r15 = r7;
        r0[r8] = (r0[r8] & (~(255 << r9))) | ((r18 & 127) << r9);
        r0[r0.length - r15] = (r0[0] & r22) | Long.MIN_VALUE;
        r6 = r6 + 1;
        r7 = r15;
        r13 = r22;
        r15 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x013f, code lost:
    
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01fa, code lost:
    
        r15 = r7;
        r4.OOA6hdeuvCS = defpackage.kx0.GWasM1elztuh(r4.X1lG3V04pd) - r4.xqGvceK5x;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0206, code lost:
    
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0289, code lost:
    
        r0 = r4.Yi7zF1RB1(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x028d, code lost:
    
        r14 = r0;
        r4.xqGvceK5x++;
        r0 = r4.OOA6hdeuvCS;
        r3 = r4.GWasM1elztuh;
        r5 = r14 >> 3;
        r6 = r3[r5];
        r8 = (r14 & 7) << 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02a6, code lost:
    
        if (((r6 >> r8) & 255) != r39) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x02a8, code lost:
    
        r21 = r37 == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x02aa, code lost:
    
        r4.OOA6hdeuvCS = r0 - r21;
        r0 = r4.X1lG3V04pd;
        r6 = (r6 & (~(255 << r8))) | (r10 << r8);
        r3[r5] = r6;
        r3[(((r14 - 7) & r0) + (r0 & 7)) >> 3] = r6;
        r37 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x020a, code lost:
    
        r15 = 1;
        r39 = 128;
        r0 = defpackage.kx0.Yi7zF1RB1(r4.X1lG3V04pd);
        r5 = r4.GWasM1elztuh;
        r6 = r4.Yi7zF1RB1;
        r7 = r4.X1lG3V04pd;
        r4.X1lG3V04pd(r0);
        r0 = r4.GWasM1elztuh;
        r8 = r4.Yi7zF1RB1;
        r9 = r4.X1lG3V04pd;
        r12 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0224, code lost:
    
        if (r12 >= r7) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0234, code lost:
    
        if (((r5[r12 >> 3] >> ((r12 & 7) << 3)) & 255) >= 128) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0236, code lost:
    
        r13 = r6[r12];
        r16 = java.lang.Long.hashCode(r13) * r28;
        r16 = r16 ^ (r16 << 16);
        r37 = r15;
        r15 = r4.Yi7zF1RB1(r16 >>> 7);
        r17 = r0;
        r0 = r16 & 127;
        r16 = r5;
        r18 = r6;
        r5 = r0;
        r0 = r15 >> 3;
        r19 = (r15 & 7) << 3;
        r5 = (r17[r0] & (~(255 << r19))) | (r5 << r19);
        r17[r0] = r5;
        r17[(((r15 - 7) & r9) + (r9 & 7)) >> 3] = r5;
        r8[r15] = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x027e, code lost:
    
        r12 = r12 + 1;
        r5 = r16;
        r0 = r17;
        r6 = r18;
        r15 = r37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0276, code lost:
    
        r17 = r0;
        r16 = r5;
        r18 = r6;
        r37 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c2, code lost:
    
        r37 = 1;
        r39 = 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0350, code lost:
    
        if (((r6 & ((~r6) << 6)) & (-9187201950435737472L)) == 0) goto L85;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean mOu10nynGul(KeyEvent keyEvent) {
        int i;
        long j;
        int i2;
        boolean z;
        long OOA6hdeuvCS = rj0.OOA6hdeuvCS(keyEvent.getKeyCode());
        int lv06NcmrQ = vc0.lv06NcmrQ(keyEvent);
        int i3 = -862048943;
        long j2 = 0;
        char c = '\b';
        int i4 = 0;
        int i5 = 1;
        if (lv06NcmrQ == 2) {
            wf0 wf0Var = this.EljAMC1QTz;
            if (wf0Var == null) {
                wf0Var = new wf0(3);
                this.EljAMC1QTz = wf0Var;
            }
            wf0 wf0Var2 = wf0Var;
            int hashCode = Long.hashCode(OOA6hdeuvCS) * (-862048943);
            int i6 = hashCode ^ (hashCode << 16);
            int i7 = i6 >>> 7;
            int i8 = i6 & 127;
            int i9 = wf0Var2.X1lG3V04pd;
            int i10 = i7 & i9;
            int i11 = 0;
            loop0: while (true) {
                long[] jArr = wf0Var2.GWasM1elztuh;
                int i12 = i10 >> 3;
                int i13 = (i10 & 7) << 3;
                long j3 = (jArr[i12] >>> i13) | ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63));
                int i14 = i3;
                long j4 = i8;
                long j5 = j3 ^ (j4 * 72340172838076673L);
                long j6 = (j5 - 72340172838076673L) & (~j5) & (-9187201950435737472L);
                while (true) {
                    if (j6 == j2) {
                        break;
                    }
                    i2 = (i10 + (Long.numberOfTrailingZeros(j6) >> 3)) & i9;
                    long j7 = j2;
                    if (wf0Var2.Yi7zF1RB1[i2] == OOA6hdeuvCS) {
                        z = 1;
                        break loop0;
                    }
                    j6 &= j6 - 1;
                    j2 = j7;
                }
                i11 += 8;
                i10 = (i10 + i11) & i9;
                i3 = i14;
                j2 = j;
            }
            wf0Var2.Yi7zF1RB1[i2] = OOA6hdeuvCS;
            return z;
        }
        if (lv06NcmrQ != 1) {
            return true;
        }
        wf0 wf0Var3 = this.EljAMC1QTz;
        if (wf0Var3 == null || !wf0Var3.GWasM1elztuh(OOA6hdeuvCS)) {
            return false;
        }
        wf0 wf0Var4 = this.EljAMC1QTz;
        if (wf0Var4 != null) {
            int hashCode2 = Long.hashCode(OOA6hdeuvCS) * (-862048943);
            int i15 = hashCode2 ^ (hashCode2 << 16);
            int i16 = i15 & 127;
            int i17 = wf0Var4.X1lG3V04pd;
            int i18 = i15 >>> 7;
            loop5: while (true) {
                int i19 = i18 & i17;
                long[] jArr2 = wf0Var4.GWasM1elztuh;
                int i20 = i19 >> 3;
                int i21 = (i19 & 7) << 3;
                long j8 = ((jArr2[i20 + 1] << (64 - i21)) & ((-i21) >> 63)) | (jArr2[i20] >>> i21);
                long j9 = (i16 * 72340172838076673L) ^ j8;
                long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L);
                while (true) {
                    if (j10 == 0) {
                        break;
                    }
                    i = ((Long.numberOfTrailingZeros(j10) >> 3) + i19) & i17;
                    if (wf0Var4.Yi7zF1RB1[i] == OOA6hdeuvCS) {
                        break loop5;
                    }
                    j10 &= j10 - 1;
                }
                i4 += 8;
                i18 = i19 + i4;
            }
            if (i >= 0) {
                wf0Var4.xqGvceK5x--;
                long[] jArr3 = wf0Var4.GWasM1elztuh;
                int i22 = wf0Var4.X1lG3V04pd;
                int i23 = i >> 3;
                int i24 = (i & 7) << 3;
                long j11 = (jArr3[i23] & (~(255 << i24))) | (254 << i24);
                jArr3[i23] = j11;
                jArr3[(((i - 7) & i22) + (i22 & 7)) >> 3] = j11;
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0057, code lost:
    
        if (r7 == null) goto L31;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0167 A[Catch: all -> 0x02d2, TryCatch #0 {all -> 0x02d2, blocks: (B:3:0x0007, B:5:0x000e, B:9:0x0019, B:13:0x0023, B:16:0x002f, B:18:0x0035, B:19:0x003a, B:21:0x0042, B:23:0x0047, B:25:0x004d, B:29:0x0053, B:34:0x0167, B:36:0x016d, B:37:0x0170, B:39:0x017b, B:42:0x0187, B:46:0x0191, B:49:0x0197, B:50:0x019c, B:52:0x01a4, B:54:0x01aa, B:56:0x01ae, B:58:0x01b6, B:60:0x01bc, B:66:0x01c4, B:68:0x01cd, B:69:0x01d1, B:64:0x01d4, B:75:0x01da, B:86:0x01df, B:89:0x01e2, B:91:0x01e8, B:98:0x01ec, B:103:0x01f3, B:105:0x01fb, B:110:0x020b, B:112:0x0210, B:146:0x0214, B:141:0x024d, B:114:0x0217, B:116:0x021d, B:118:0x0221, B:120:0x0229, B:122:0x022f, B:128:0x0237, B:130:0x0240, B:131:0x0244, B:126:0x0247, B:148:0x0252, B:152:0x0262, B:154:0x0267, B:188:0x026b, B:183:0x02ad, B:156:0x0277, B:158:0x027d, B:160:0x0281, B:162:0x0289, B:164:0x028f, B:170:0x0297, B:172:0x02a0, B:173:0x02a4, B:168:0x02a7, B:195:0x02b4, B:197:0x02bb, B:210:0x005b, B:212:0x0061, B:213:0x0064, B:215:0x006c, B:218:0x0078, B:222:0x0082, B:257:0x00d5, B:259:0x00d9, B:224:0x0087, B:226:0x008d, B:228:0x0091, B:230:0x0099, B:232:0x009f, B:238:0x00a7, B:240:0x00b0, B:241:0x00b4, B:236:0x00b7, B:247:0x00bd, B:261:0x00c2, B:264:0x00c5, B:266:0x00cb, B:273:0x00cf, B:278:0x00df, B:280:0x00e5, B:281:0x00e8, B:283:0x00f2, B:286:0x00fe, B:290:0x0108, B:325:0x015b, B:327:0x015f, B:292:0x010d, B:294:0x0113, B:296:0x0117, B:298:0x011f, B:300:0x0125, B:306:0x012d, B:308:0x0136, B:309:0x013a, B:304:0x013d, B:315:0x0143, B:330:0x0148, B:333:0x014b, B:335:0x0151, B:342:0x0155), top: B:2:0x0007 }] */
    /* JADX WARN: Type inference failed for: r0v20, types: [rg0] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24, types: [rg0] */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v29 */
    /* JADX WARN: Type inference failed for: r0v30 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r12v23, types: [he0] */
    /* JADX WARN: Type inference failed for: r12v24, types: [he0] */
    /* JADX WARN: Type inference failed for: r12v28, types: [he0] */
    /* JADX WARN: Type inference failed for: r12v29, types: [he0] */
    /* JADX WARN: Type inference failed for: r12v33, types: [he0] */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v36 */
    /* JADX WARN: Type inference failed for: r12v37 */
    /* JADX WARN: Type inference failed for: r12v38 */
    /* JADX WARN: Type inference failed for: r12v39 */
    /* JADX WARN: Type inference failed for: r12v41, types: [he0] */
    /* JADX WARN: Type inference failed for: r12v42 */
    /* JADX WARN: Type inference failed for: r12v43, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v44 */
    /* JADX WARN: Type inference failed for: r12v45 */
    /* JADX WARN: Type inference failed for: r12v46 */
    /* JADX WARN: Type inference failed for: r12v47 */
    /* JADX WARN: Type inference failed for: r12v60 */
    /* JADX WARN: Type inference failed for: r12v61 */
    /* JADX WARN: Type inference failed for: r12v62 */
    /* JADX WARN: Type inference failed for: r12v63 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10, types: [rg0] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean xqGvceK5x(KeyEvent keyEvent, wu wuVar) {
        xk xkVar;
        he0 he0Var;
        xj0 xj0Var;
        xk xkVar2;
        xj0 xj0Var2;
        int size;
        xj0 xj0Var3;
        boolean z;
        rt rtVar = this.X1lG3V04pd;
        Trace.beginSection("FocusOwnerImpl:dispatchKeyEvent");
        try {
            if (this.xqGvceK5x.OOA6hdeuvCS) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching key event while focus system is invalidated.");
                return false;
            }
            if (!mOu10nynGul(keyEvent)) {
                return false;
            }
            rt Mjvvu5DE = qj.Mjvvu5DE(rtVar);
            if (Mjvvu5DE != null) {
                if (!Mjvvu5DE.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1("visitLocalDescendants called on an unattached node");
                }
                he0 he0Var2 = Mjvvu5DE.OOA6hdeuvCS;
                if ((he0Var2.encWxUiV2 & 9216) != 0) {
                    he0Var = null;
                    for (he0 he0Var3 = he0Var2.JFJ3QoxA; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                        int i = he0Var3.AvO7iQsrTN;
                        if ((i & 9216) != 0) {
                            if ((i & 1024) != 0) {
                                break;
                            }
                            he0Var = he0Var3;
                        }
                    }
                } else {
                    he0Var = null;
                }
            }
            if (Mjvvu5DE != null) {
                if (!Mjvvu5DE.OOA6hdeuvCS.Mjvvu5DE) {
                    t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                }
                he0 he0Var4 = Mjvvu5DE.OOA6hdeuvCS;
                g60 eUH21U3apd = vc0.eUH21U3apd(Mjvvu5DE);
                loop11: while (true) {
                    if (eUH21U3apd == null) {
                        xkVar2 = null;
                        break;
                    }
                    if ((eUH21U3apd.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 8192) != 0) {
                        while (he0Var4 != null) {
                            if ((he0Var4.AvO7iQsrTN & 8192) != 0) {
                                rg0 rg0Var = null;
                                he0 he0Var5 = he0Var4;
                                while (he0Var5 != null) {
                                    if (he0Var5 instanceof y40) {
                                        xkVar2 = he0Var5;
                                        break loop11;
                                    }
                                    if ((he0Var5.AvO7iQsrTN & 8192) != 0 && (he0Var5 instanceof yk)) {
                                        he0 he0Var6 = ((yk) he0Var5).jivtDDk9H;
                                        int i2 = 0;
                                        he0Var5 = he0Var5;
                                        rg0Var = rg0Var;
                                        while (he0Var6 != null) {
                                            if ((he0Var6.AvO7iQsrTN & 8192) != 0) {
                                                i2++;
                                                rg0Var = rg0Var;
                                                if (i2 == 1) {
                                                    he0Var5 = he0Var6;
                                                } else {
                                                    if (rg0Var == null) {
                                                        rg0Var = new rg0(new he0[16]);
                                                    }
                                                    if (he0Var5 != null) {
                                                        rg0Var.Yi7zF1RB1(he0Var5);
                                                        he0Var5 = null;
                                                    }
                                                    rg0Var.Yi7zF1RB1(he0Var6);
                                                }
                                            }
                                            he0Var6 = he0Var6.JFJ3QoxA;
                                            he0Var5 = he0Var5;
                                            rg0Var = rg0Var;
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    he0Var5 = vc0.E7jCp8Ls(rg0Var);
                                }
                            }
                            he0Var4 = he0Var4.mOu10nynGul;
                        }
                    }
                    eUH21U3apd = eUH21U3apd.cilMamHF();
                    he0Var4 = (eUH21U3apd == null || (xj0Var2 = eUH21U3apd.A1EKNP6CxJ) == null) ? null : xj0Var2.OOA6hdeuvCS;
                }
                xk xkVar3 = (y40) xkVar2;
                if (xkVar3 != null) {
                    he0Var = ((he0) xkVar3).OOA6hdeuvCS;
                    if (he0Var != null) {
                        if (!he0Var.OOA6hdeuvCS.Mjvvu5DE) {
                            t10.Yi7zF1RB1("visitAncestors called on an unattached node");
                        }
                        he0 he0Var7 = he0Var.OOA6hdeuvCS.mOu10nynGul;
                        g60 eUH21U3apd2 = vc0.eUH21U3apd(he0Var);
                        ArrayList arrayList = null;
                        while (eUH21U3apd2 != null) {
                            if ((eUH21U3apd2.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 8192) != 0) {
                                while (he0Var7 != null) {
                                    if ((he0Var7.AvO7iQsrTN & 8192) != 0) {
                                        he0 he0Var8 = he0Var7;
                                        rg0 rg0Var2 = null;
                                        while (he0Var8 != null) {
                                            if (he0Var8 instanceof y40) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(he0Var8);
                                                z = false;
                                            } else {
                                                z = true;
                                            }
                                            if (z && (he0Var8.AvO7iQsrTN & 8192) != 0 && (he0Var8 instanceof yk)) {
                                                int i3 = 0;
                                                for (he0 he0Var9 = ((yk) he0Var8).jivtDDk9H; he0Var9 != null; he0Var9 = he0Var9.JFJ3QoxA) {
                                                    if ((he0Var9.AvO7iQsrTN & 8192) != 0) {
                                                        i3++;
                                                        if (i3 == 1) {
                                                            he0Var8 = he0Var9;
                                                        } else {
                                                            if (rg0Var2 == null) {
                                                                rg0Var2 = new rg0(new he0[16]);
                                                            }
                                                            if (he0Var8 != null) {
                                                                rg0Var2.Yi7zF1RB1(he0Var8);
                                                                he0Var8 = null;
                                                            }
                                                            rg0Var2.Yi7zF1RB1(he0Var9);
                                                        }
                                                    }
                                                }
                                                if (i3 == 1) {
                                                }
                                            }
                                            he0Var8 = vc0.E7jCp8Ls(rg0Var2);
                                        }
                                    }
                                    he0Var7 = he0Var7.mOu10nynGul;
                                }
                            }
                            eUH21U3apd2 = eUH21U3apd2.cilMamHF();
                            he0Var7 = (eUH21U3apd2 == null || (xj0Var3 = eUH21U3apd2.A1EKNP6CxJ) == null) ? null : xj0Var3.OOA6hdeuvCS;
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i4 = size - 1;
                                ((y40) arrayList.get(size)).getClass();
                                if (i4 < 0) {
                                    break;
                                }
                                size = i4;
                            }
                        }
                        yk ykVar = he0Var.OOA6hdeuvCS;
                        ?? r0 = 0;
                        while (ykVar != 0) {
                            if (ykVar instanceof y40) {
                            } else if ((ykVar.AvO7iQsrTN & 8192) != 0 && (ykVar instanceof yk)) {
                                he0 he0Var10 = ykVar.jivtDDk9H;
                                int i5 = 0;
                                r0 = r0;
                                ykVar = ykVar;
                                while (he0Var10 != null) {
                                    if ((he0Var10.AvO7iQsrTN & 8192) != 0) {
                                        i5++;
                                        r0 = r0;
                                        if (i5 == 1) {
                                            ykVar = he0Var10;
                                        } else {
                                            if (r0 == 0) {
                                                r0 = new rg0(new he0[16]);
                                            }
                                            if (ykVar != 0) {
                                                r0.Yi7zF1RB1(ykVar);
                                                ykVar = 0;
                                            }
                                            r0.Yi7zF1RB1(he0Var10);
                                        }
                                    }
                                    he0Var10 = he0Var10.JFJ3QoxA;
                                    r0 = r0;
                                    ykVar = ykVar;
                                }
                                if (i5 == 1) {
                                }
                            }
                            ykVar = vc0.E7jCp8Ls(r0);
                        }
                        if (((Boolean) wuVar.GWasM1elztuh()).booleanValue()) {
                            return true;
                        }
                        yk ykVar2 = he0Var.OOA6hdeuvCS;
                        ?? r14 = 0;
                        while (ykVar2 != 0) {
                            if (ykVar2 instanceof y40) {
                                if (((y40) ykVar2).VeqTn1PQw7(keyEvent)) {
                                    return true;
                                }
                            } else if ((ykVar2.AvO7iQsrTN & 8192) != 0 && (ykVar2 instanceof yk)) {
                                he0 he0Var11 = ykVar2.jivtDDk9H;
                                int i6 = 0;
                                ykVar2 = ykVar2;
                                r14 = r14;
                                while (he0Var11 != null) {
                                    if ((he0Var11.AvO7iQsrTN & 8192) != 0) {
                                        i6++;
                                        r14 = r14;
                                        if (i6 == 1) {
                                            ykVar2 = he0Var11;
                                        } else {
                                            if (r14 == 0) {
                                                r14 = new rg0(new he0[16]);
                                            }
                                            if (ykVar2 != 0) {
                                                r14.Yi7zF1RB1(ykVar2);
                                                ykVar2 = 0;
                                            }
                                            r14.Yi7zF1RB1(he0Var11);
                                        }
                                    }
                                    he0Var11 = he0Var11.JFJ3QoxA;
                                    ykVar2 = ykVar2;
                                    r14 = r14;
                                }
                                if (i6 == 1) {
                                }
                            }
                            ykVar2 = vc0.E7jCp8Ls(r14);
                        }
                        if (arrayList != null) {
                            int size2 = arrayList.size();
                            for (int i7 = 0; i7 < size2; i7++) {
                                if (((y40) arrayList.get(i7)).VeqTn1PQw7(keyEvent)) {
                                    return true;
                                }
                            }
                        }
                    }
                    return false;
                }
            }
            if (!rtVar.OOA6hdeuvCS.Mjvvu5DE) {
                t10.Yi7zF1RB1("visitAncestors called on an unattached node");
            }
            he0 he0Var12 = rtVar.OOA6hdeuvCS.mOu10nynGul;
            g60 eUH21U3apd3 = vc0.eUH21U3apd(rtVar);
            loop15: while (true) {
                if (eUH21U3apd3 == null) {
                    xkVar = null;
                    break;
                }
                if ((eUH21U3apd3.A1EKNP6CxJ.EljAMC1QTz.encWxUiV2 & 8192) != 0) {
                    while (he0Var12 != null) {
                        if ((he0Var12.AvO7iQsrTN & 8192) != 0) {
                            he0 he0Var13 = he0Var12;
                            rg0 rg0Var3 = null;
                            while (he0Var13 != null) {
                                if (he0Var13 instanceof y40) {
                                    xkVar = he0Var13;
                                    break loop15;
                                }
                                if ((he0Var13.AvO7iQsrTN & 8192) != 0 && (he0Var13 instanceof yk)) {
                                    he0 he0Var14 = ((yk) he0Var13).jivtDDk9H;
                                    int i8 = 0;
                                    he0Var13 = he0Var13;
                                    rg0Var3 = rg0Var3;
                                    while (he0Var14 != null) {
                                        if ((he0Var14.AvO7iQsrTN & 8192) != 0) {
                                            i8++;
                                            rg0Var3 = rg0Var3;
                                            if (i8 == 1) {
                                                he0Var13 = he0Var14;
                                            } else {
                                                if (rg0Var3 == null) {
                                                    rg0Var3 = new rg0(new he0[16]);
                                                }
                                                if (he0Var13 != null) {
                                                    rg0Var3.Yi7zF1RB1(he0Var13);
                                                    he0Var13 = null;
                                                }
                                                rg0Var3.Yi7zF1RB1(he0Var14);
                                            }
                                        }
                                        he0Var14 = he0Var14.JFJ3QoxA;
                                        he0Var13 = he0Var13;
                                        rg0Var3 = rg0Var3;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                he0Var13 = vc0.E7jCp8Ls(rg0Var3);
                            }
                        }
                        he0Var12 = he0Var12.mOu10nynGul;
                    }
                }
                eUH21U3apd3 = eUH21U3apd3.cilMamHF();
                he0Var12 = (eUH21U3apd3 == null || (xj0Var = eUH21U3apd3.A1EKNP6CxJ) == null) ? null : xj0Var.OOA6hdeuvCS;
            }
            xk xkVar4 = (y40) xkVar;
            he0Var = xkVar4 != null ? ((he0) xkVar4).OOA6hdeuvCS : null;
            if (he0Var != null) {
            }
            return false;
        } finally {
            Trace.endSection();
        }
    }
}
