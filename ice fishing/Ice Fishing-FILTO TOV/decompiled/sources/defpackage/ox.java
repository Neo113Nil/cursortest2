package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class ox extends ye {
    public final /* synthetic */ qx AvO7iQsrTN;
    public final fo0 EljAMC1QTz;
    public final long GWasM1elztuh;
    public final ig0 OOA6hdeuvCS;
    public final boolean X1lG3V04pd;
    public final boolean Yi7zF1RB1;
    public HashSet xqGvceK5x;

    public ox(qx qxVar, long j, boolean z, boolean z2, j6IIN2O8eOU j6iin2o8eou) {
        this.AvO7iQsrTN = qxVar;
        this.GWasM1elztuh = j;
        this.Yi7zF1RB1 = z;
        this.X1lG3V04pd = z2;
        ig0 ig0Var = lx0.GWasM1elztuh;
        this.OOA6hdeuvCS = new ig0();
        this.EljAMC1QTz = new fo0(cp0.encWxUiV2, b9xEq24R1.Uxq83abb04);
    }

    @Override // defpackage.ye
    public final long AvO7iQsrTN() {
        return this.GWasM1elztuh;
    }

    @Override // defpackage.ye
    public final void E7jCp8Ls(df dfVar) {
        qx qxVar = this.AvO7iQsrTN;
        qxVar.Yi7zF1RB1.E7jCp8Ls(qxVar.encWxUiV2);
        qxVar.Yi7zF1RB1.E7jCp8Ls(dfVar);
    }

    @Override // defpackage.ye
    public final boolean EljAMC1QTz() {
        return this.X1lG3V04pd;
    }

    @Override // defpackage.ye
    public final void GWasM1elztuh(df dfVar, lv lvVar) {
        this.AvO7iQsrTN.Yi7zF1RB1.GWasM1elztuh(dfVar, lvVar);
    }

    @Override // defpackage.ye
    public final gh JFJ3QoxA() {
        return this.AvO7iQsrTN.Yi7zF1RB1.JFJ3QoxA();
    }

    @Override // defpackage.ye
    public final void Mjvvu5DE(df dfVar) {
        this.AvO7iQsrTN.Yi7zF1RB1.Mjvvu5DE(dfVar);
    }

    @Override // defpackage.ye
    public final boolean OOA6hdeuvCS() {
        return this.Yi7zF1RB1;
    }

    @Override // defpackage.ye
    public final void WIEu4Ya2g8(qx qxVar) {
        this.OOA6hdeuvCS.GWasM1elztuh(qxVar);
    }

    @Override // defpackage.ye
    public final void X1lG3V04pd() {
        qx qxVar = this.AvO7iQsrTN;
        qxVar.pog2g9KITJA--;
    }

    @Override // defpackage.ye
    public final ff0 XnEVoBF0td1l(gf0 gf0Var) {
        return this.AvO7iQsrTN.Yi7zF1RB1.XnEVoBF0td1l(gf0Var);
    }

    @Override // defpackage.ye
    public final void Y6hRI1cF8(qx qxVar) {
        HashSet hashSet = this.xqGvceK5x;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                qxVar.getClass();
                set.remove(qxVar.lv06NcmrQ());
            }
        }
        if (qxVar != null) {
            this.OOA6hdeuvCS.E7jCp8Ls(qxVar);
        }
    }

    @Override // defpackage.ye
    public final ig0 Yi7zF1RB1(df dfVar, l21 l21Var, lv lvVar) {
        return this.AvO7iQsrTN.Yi7zF1RB1.Yi7zF1RB1(dfVar, l21Var, lvVar);
    }

    @Override // defpackage.ye
    public final void YmKjaVtbfp5Z(at0 at0Var) {
        this.AvO7iQsrTN.Yi7zF1RB1.YmKjaVtbfp5Z(at0Var);
    }

    @Override // defpackage.ye
    public final void cilMamHF(df dfVar) {
        this.AvO7iQsrTN.Yi7zF1RB1.cilMamHF(dfVar);
    }

    @Override // defpackage.ye
    public final xe encWxUiV2() {
        return this.AvO7iQsrTN.encWxUiV2;
    }

    @Override // defpackage.ye
    public final void iwATDS1i01k(Set set) {
        HashSet hashSet = this.xqGvceK5x;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.xqGvceK5x = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.ye
    public final void jivtDDk9H() {
        this.AvO7iQsrTN.pog2g9KITJA++;
    }

    public final void lv06NcmrQ() {
        ig0 ig0Var = this.OOA6hdeuvCS;
        if (ig0Var.encWxUiV2()) {
            HashSet hashSet = this.xqGvceK5x;
            if (hashSet != null) {
                Object[] objArr = ig0Var.Yi7zF1RB1;
                long[] jArr = ig0Var.GWasM1elztuh;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    qx qxVar = (qx) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(qxVar.lv06NcmrQ());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
            ig0Var.Yi7zF1RB1();
        }
    }

    @Override // defpackage.ye
    public final p9 mE4lRynR(d3 d3Var) {
        return this.AvO7iQsrTN.Yi7zF1RB1.mE4lRynR(d3Var);
    }

    @Override // defpackage.ye
    public final cp0 mOu10nynGul() {
        return (cp0) this.EljAMC1QTz.getValue();
    }

    @Override // defpackage.ye
    public final boolean rQPn8YBR() {
        return this.AvO7iQsrTN.Yi7zF1RB1.rQPn8YBR();
    }

    @Override // defpackage.ye
    public final ig0 uFEq9NpZ(df dfVar, l21 l21Var, ig0 ig0Var) {
        return this.AvO7iQsrTN.Yi7zF1RB1.uFEq9NpZ(dfVar, l21Var, ig0Var);
    }

    @Override // defpackage.ye
    public final boolean xqGvceK5x() {
        return this.AvO7iQsrTN.Yi7zF1RB1.xqGvceK5x();
    }
}
