package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class d01 {
    public final int EljAMC1QTz;
    public final he0 GWasM1elztuh;
    public d01 OOA6hdeuvCS;
    public final g60 X1lG3V04pd;
    public final boolean Yi7zF1RB1;
    public final zz0 xqGvceK5x;

    public d01(he0 he0Var, boolean z, g60 g60Var, zz0 zz0Var) {
        this.GWasM1elztuh = he0Var;
        this.Yi7zF1RB1 = z;
        this.X1lG3V04pd = g60Var;
        this.xqGvceK5x = zz0Var;
        this.EljAMC1QTz = g60Var.EljAMC1QTz;
    }

    public static /* synthetic */ List JFJ3QoxA(int i, d01 d01Var) {
        return d01Var.mOu10nynGul((i & 1) != 0 ? !d01Var.Yi7zF1RB1 : false, (i & 2) == 0);
    }

    public final kt0 AvO7iQsrTN() {
        bk0 xqGvceK5x = xqGvceK5x();
        if (xqGvceK5x != null) {
            if (!xqGvceK5x.iK7aQfvhG().Mjvvu5DE) {
                xqGvceK5x = null;
            }
            if (xqGvceK5x != null) {
                return o50.iwATDS1i01k(xqGvceK5x).eUH21U3apd(xqGvceK5x, true);
            }
        }
        return kt0.OOA6hdeuvCS;
    }

    public final d01 E7jCp8Ls() {
        g60 g60Var;
        d01 d01Var = this.OOA6hdeuvCS;
        if (d01Var != null) {
            return d01Var;
        }
        g60 g60Var2 = this.X1lG3V04pd;
        boolean z = this.Yi7zF1RB1;
        if (z) {
            g60Var = g60Var2.cilMamHF();
            while (g60Var != null) {
                zz0 WdrkLMV3xh = g60Var.WdrkLMV3xh();
                if (WdrkLMV3xh != null && WdrkLMV3xh.AvO7iQsrTN) {
                    break;
                }
                g60Var = g60Var.cilMamHF();
            }
        }
        g60Var = null;
        if (g60Var == null) {
            g60 cilMamHF = g60Var2.cilMamHF();
            while (true) {
                if (cilMamHF == null) {
                    g60Var = null;
                    break;
                }
                if (cilMamHF.A1EKNP6CxJ.xqGvceK5x(8)) {
                    g60Var = cilMamHF;
                    break;
                }
                cilMamHF = cilMamHF.cilMamHF();
            }
        }
        if (g60Var == null) {
            return null;
        }
        return w60.AvO7iQsrTN(g60Var, z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final b01 EljAMC1QTz() {
        he0 he0Var;
        boolean z;
        boolean z2 = this.xqGvceK5x.AvO7iQsrTN;
        Object obj = null;
        g60 g60Var = this.X1lG3V04pd;
        if (!z2) {
            he0 he0Var2 = g60Var.A1EKNP6CxJ.EljAMC1QTz;
            if ((he0Var2.encWxUiV2 & 8) != 0) {
                loop3: while (he0Var2 != null) {
                    if ((he0Var2.AvO7iQsrTN & 8) != 0) {
                        he0Var = he0Var2;
                        rg0 rg0Var = null;
                        while (he0Var != null) {
                            if (he0Var instanceof b01) {
                                if (((b01) he0Var).AvO7iQsrTN()) {
                                    obj = he0Var;
                                }
                            } else if ((he0Var.AvO7iQsrTN & 8) != 0 && (he0Var instanceof yk)) {
                                int i = 0;
                                for (he0 he0Var3 = ((yk) he0Var).jivtDDk9H; he0Var3 != null; he0Var3 = he0Var3.JFJ3QoxA) {
                                    if ((he0Var3.AvO7iQsrTN & 8) != 0) {
                                        i++;
                                        if (i == 1) {
                                            he0Var = he0Var3;
                                        } else {
                                            if (rg0Var == null) {
                                                rg0Var = new rg0(new he0[16]);
                                            }
                                            if (he0Var != null) {
                                                rg0Var.Yi7zF1RB1(he0Var);
                                                he0Var = null;
                                            }
                                            rg0Var.Yi7zF1RB1(he0Var3);
                                        }
                                    }
                                }
                                if (i == 1) {
                                }
                            }
                            he0Var = vc0.E7jCp8Ls(rg0Var);
                        }
                    }
                    if ((he0Var2.encWxUiV2 & 8) == 0) {
                        break;
                    }
                    he0Var2 = he0Var2.JFJ3QoxA;
                }
            }
            return (b01) obj;
        }
        he0 he0Var4 = g60Var.A1EKNP6CxJ.EljAMC1QTz;
        if ((he0Var4.encWxUiV2 & 8) != 0) {
            he0Var = null;
            while (he0Var4 != null) {
                if ((he0Var4.AvO7iQsrTN & 8) != 0) {
                    he0 he0Var5 = he0Var4;
                    rg0 rg0Var2 = null;
                    while (he0Var5 != null) {
                        if (he0Var5 instanceof b01) {
                            b01 b01Var = (b01) he0Var5;
                            if (b01Var.AvO7iQsrTN()) {
                                if (b01Var.JFXS9W1rB5s4()) {
                                    return b01Var;
                                }
                                if (he0Var == null) {
                                    he0Var = b01Var;
                                }
                            }
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z && (he0Var5.AvO7iQsrTN & 8) != 0 && (he0Var5 instanceof yk)) {
                            int i2 = 0;
                            for (he0 he0Var6 = ((yk) he0Var5).jivtDDk9H; he0Var6 != null; he0Var6 = he0Var6.JFJ3QoxA) {
                                if ((he0Var6.AvO7iQsrTN & 8) != 0) {
                                    i2++;
                                    if (i2 == 1) {
                                        he0Var5 = he0Var6;
                                    } else {
                                        if (rg0Var2 == null) {
                                            rg0Var2 = new rg0(new he0[16]);
                                        }
                                        if (he0Var5 != null) {
                                            rg0Var2.Yi7zF1RB1(he0Var5);
                                            he0Var5 = null;
                                        }
                                        rg0Var2.Yi7zF1RB1(he0Var6);
                                    }
                                }
                            }
                            if (i2 == 1) {
                            }
                        }
                        he0Var5 = vc0.E7jCp8Ls(rg0Var2);
                    }
                }
                if ((he0Var4.encWxUiV2 & 8) == 0) {
                    break;
                }
                he0Var4 = he0Var4.JFJ3QoxA;
            }
            obj = he0Var;
        }
        return (b01) obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10, types: [he0] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [he0] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [rg0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [rg0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final kt0 GWasM1elztuh(bk0 bk0Var) {
        yk ykVar;
        d01 E7jCp8Ls = E7jCp8Ls();
        if (E7jCp8Ls == null) {
            return kt0.OOA6hdeuvCS;
        }
        he0 he0Var = E7jCp8Ls.X1lG3V04pd.A1EKNP6CxJ.EljAMC1QTz;
        if ((he0Var.encWxUiV2 & 8) != 0) {
            loop0: while (he0Var != null) {
                if ((he0Var.AvO7iQsrTN & 8) != 0) {
                    ykVar = he0Var;
                    ?? r5 = 0;
                    while (ykVar != 0) {
                        if (ykVar instanceof b01) {
                            if (ykVar.AvO7iQsrTN()) {
                                break loop0;
                            }
                        } else if ((ykVar.AvO7iQsrTN & 8) != 0 && (ykVar instanceof yk)) {
                            he0 he0Var2 = ykVar.jivtDDk9H;
                            int i = 0;
                            ykVar = ykVar;
                            r5 = r5;
                            while (he0Var2 != null) {
                                if ((he0Var2.AvO7iQsrTN & 8) != 0) {
                                    i++;
                                    r5 = r5;
                                    if (i == 1) {
                                        ykVar = he0Var2;
                                    } else {
                                        if (r5 == 0) {
                                            r5 = new rg0(new he0[16]);
                                        }
                                        if (ykVar != 0) {
                                            r5.Yi7zF1RB1(ykVar);
                                            ykVar = 0;
                                        }
                                        r5.Yi7zF1RB1(he0Var2);
                                    }
                                }
                                he0Var2 = he0Var2.JFJ3QoxA;
                                ykVar = ykVar;
                                r5 = r5;
                            }
                            if (i == 1) {
                            }
                        }
                        ykVar = vc0.E7jCp8Ls(r5);
                    }
                }
                if ((he0Var.encWxUiV2 & 8) == 0) {
                    break;
                }
                he0Var = he0Var.JFJ3QoxA;
            }
        }
        ykVar = 0;
        b01 b01Var = (b01) ykVar;
        bk0 AEn1Rrio = b01Var != null ? vc0.AEn1Rrio(b01Var, 8) : null;
        return AEn1Rrio == null ? E7jCp8Ls.GWasM1elztuh(bk0Var) : AEn1Rrio.eUH21U3apd(bk0Var, true);
    }

    public final void Mjvvu5DE(ArrayList arrayList, zz0 zz0Var) {
        if (this.xqGvceK5x.encWxUiV2) {
            return;
        }
        mE4lRynR(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            d01 d01Var = (d01) arrayList.get(size2);
            if (!d01Var.WIEu4Ya2g8()) {
                zz0Var.OOA6hdeuvCS(d01Var.xqGvceK5x);
                d01Var.Mjvvu5DE(arrayList, zz0Var);
            }
        }
    }

    public final void OOA6hdeuvCS(ArrayList arrayList, ArrayList arrayList2) {
        mE4lRynR(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            d01 d01Var = (d01) arrayList.get(size2);
            if (d01Var.WIEu4Ya2g8()) {
                arrayList2.add(d01Var);
            } else if (!d01Var.xqGvceK5x.encWxUiV2) {
                d01Var.OOA6hdeuvCS(arrayList, arrayList2);
            }
        }
    }

    public final boolean WIEu4Ya2g8() {
        return this.Yi7zF1RB1 && this.xqGvceK5x.AvO7iQsrTN;
    }

    public final void X1lG3V04pd(g60 g60Var, ArrayList arrayList) {
        rg0 WRKkgoJXwDn = g60Var.WRKkgoJXwDn();
        Object[] objArr = WRKkgoJXwDn.OOA6hdeuvCS;
        int i = WRKkgoJXwDn.AvO7iQsrTN;
        for (int i2 = 0; i2 < i; i2++) {
            g60 g60Var2 = (g60) objArr[i2];
            if (g60Var2.eUH21U3apd() && !g60Var2.YXi2hvwn7WL) {
                if (g60Var2.A1EKNP6CxJ.xqGvceK5x(8)) {
                    arrayList.add(w60.AvO7iQsrTN(g60Var2, this.Yi7zF1RB1));
                } else {
                    X1lG3V04pd(g60Var2, arrayList);
                }
            }
        }
    }

    public final kt0 XnEVoBF0td1l() {
        xk EljAMC1QTz = EljAMC1QTz();
        if (EljAMC1QTz == null) {
            return this.X1lG3V04pd.A1EKNP6CxJ.X1lG3V04pd.o9oGstcVt9();
        }
        he0 he0Var = ((he0) EljAMC1QTz).OOA6hdeuvCS;
        Object AvO7iQsrTN = this.xqGvceK5x.OOA6hdeuvCS.AvO7iQsrTN(yz0.Yi7zF1RB1);
        if (AvO7iQsrTN == null) {
            AvO7iQsrTN = null;
        }
        return l60.E7jCp8Ls(he0Var, AvO7iQsrTN != null, true);
    }

    public final d01 Yi7zF1RB1(ov0 ov0Var, hv hvVar) {
        zz0 zz0Var = new zz0();
        zz0Var.AvO7iQsrTN = false;
        zz0Var.encWxUiV2 = false;
        hvVar.mOu10nynGul(zz0Var);
        d01 d01Var = new d01(new c01(hvVar), false, new g60(this.EljAMC1QTz + (ov0Var != null ? 1000000000 : 2000000000), true), zz0Var);
        d01Var.OOA6hdeuvCS = this;
        return d01Var;
    }

    public final boolean YmKjaVtbfp5Z() {
        if (iwATDS1i01k() || !JFJ3QoxA(4, this).isEmpty()) {
            return false;
        }
        g60 cilMamHF = this.X1lG3V04pd.cilMamHF();
        while (true) {
            if (cilMamHF == null) {
                cilMamHF = null;
                break;
            }
            zz0 WdrkLMV3xh = cilMamHF.WdrkLMV3xh();
            if (WdrkLMV3xh != null && WdrkLMV3xh.AvO7iQsrTN) {
                break;
            }
            cilMamHF = cilMamHF.cilMamHF();
        }
        return cilMamHF == null;
    }

    public final kt0 encWxUiV2() {
        bk0 xqGvceK5x = xqGvceK5x();
        if (xqGvceK5x != null) {
            if (!xqGvceK5x.iK7aQfvhG().Mjvvu5DE) {
                xqGvceK5x = null;
            }
            if (xqGvceK5x != null) {
                return o50.OOA6hdeuvCS(xqGvceK5x, true);
            }
        }
        return kt0.OOA6hdeuvCS;
    }

    public final boolean iwATDS1i01k() {
        return this.OOA6hdeuvCS != null;
    }

    public final List mE4lRynR(ArrayList arrayList, boolean z) {
        if (iwATDS1i01k()) {
            return xp.OOA6hdeuvCS;
        }
        X1lG3V04pd(this.X1lG3V04pd, arrayList);
        if (z) {
            zz0 zz0Var = this.xqGvceK5x;
            hg0 hg0Var = zz0Var.OOA6hdeuvCS;
            Object AvO7iQsrTN = hg0Var.AvO7iQsrTN(h01.WRKkgoJXwDn);
            if (AvO7iQsrTN == null) {
                AvO7iQsrTN = null;
            }
            ov0 ov0Var = (ov0) AvO7iQsrTN;
            if (ov0Var != null && zz0Var.AvO7iQsrTN && !arrayList.isEmpty()) {
                arrayList.add(Yi7zF1RB1(ov0Var, new NWXxPwoOUSX9(16, ov0Var)));
            }
            k01 k01Var = h01.GWasM1elztuh;
            if (hg0Var.X1lG3V04pd(k01Var) && !arrayList.isEmpty() && zz0Var.AvO7iQsrTN) {
                Object AvO7iQsrTN2 = hg0Var.AvO7iQsrTN(k01Var);
                if (AvO7iQsrTN2 == null) {
                    AvO7iQsrTN2 = null;
                }
                List list = (List) AvO7iQsrTN2;
                String str = list != null ? (String) rb.YTyqgZhdF(list) : null;
                if (str != null) {
                    arrayList.add(0, Yi7zF1RB1(null, new NWXxPwoOUSX9(17, str)));
                }
            }
        }
        return arrayList;
    }

    public final List mOu10nynGul(boolean z, boolean z2) {
        if (!z && this.xqGvceK5x.encWxUiV2) {
            return xp.OOA6hdeuvCS;
        }
        ArrayList arrayList = new ArrayList();
        if (!WIEu4Ya2g8()) {
            return mE4lRynR(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        OOA6hdeuvCS(arrayList, arrayList2);
        return arrayList2;
    }

    public final zz0 rQPn8YBR() {
        boolean WIEu4Ya2g8 = WIEu4Ya2g8();
        zz0 zz0Var = this.xqGvceK5x;
        if (!WIEu4Ya2g8) {
            return zz0Var;
        }
        zz0 Yi7zF1RB1 = zz0Var.Yi7zF1RB1();
        Mjvvu5DE(new ArrayList(), Yi7zF1RB1);
        return Yi7zF1RB1;
    }

    public final zz0 uFEq9NpZ() {
        return this.xqGvceK5x;
    }

    public final bk0 xqGvceK5x() {
        if (!iwATDS1i01k()) {
            b01 EljAMC1QTz = EljAMC1QTz();
            return EljAMC1QTz != null ? vc0.AEn1Rrio(EljAMC1QTz, 8) : this.X1lG3V04pd.A1EKNP6CxJ.X1lG3V04pd;
        }
        d01 E7jCp8Ls = E7jCp8Ls();
        if (E7jCp8Ls != null) {
            return E7jCp8Ls.xqGvceK5x();
        }
        return null;
    }
}
