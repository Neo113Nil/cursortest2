package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final /* synthetic */ class t5 implements wu {
    public final /* synthetic */ Object AvO7iQsrTN;
    public final /* synthetic */ Object EljAMC1QTz;
    public final /* synthetic */ int OOA6hdeuvCS;
    public final /* synthetic */ Object encWxUiV2;

    public /* synthetic */ t5(qx qxVar, x9 x9Var, y21 y21Var, gf0 gf0Var) {
        this.OOA6hdeuvCS = 3;
        this.EljAMC1QTz = qxVar;
        this.AvO7iQsrTN = x9Var;
        this.encWxUiV2 = y21Var;
    }

    @Override // defpackage.wu
    public final Object GWasM1elztuh() {
        int i;
        og ogVar;
        kt0 kt0Var;
        int i2;
        int i3;
        List list;
        int i4 = this.OOA6hdeuvCS;
        kc1 kc1Var = kc1.GWasM1elztuh;
        int i5 = 1;
        Object obj = this.encWxUiV2;
        Object obj2 = this.AvO7iQsrTN;
        Object obj3 = this.EljAMC1QTz;
        switch (i4) {
            case 0:
                ((u5) obj3).GWasM1elztuh();
                i5 i5Var = (i5) ((v5) obj2).X1lG3V04pd;
                int i6 = ((pt0) obj).OOA6hdeuvCS;
                do {
                    i = i5Var.get();
                } while (!i5Var.compareAndSet(i, ((i >>> 27) & 15) == i6 ? i - 1 : i));
                return kc1Var;
            case 1:
                a8 a8Var = (a8) obj3;
                kt0 gqMuANyCes = a8.gqMuANyCes(a8Var, (bk0) obj2, (psOJLYhIz) obj);
                if (gqMuANyCes == null) {
                    return null;
                }
                og ogVar2 = a8Var.mE4lRynR;
                if (b30.GWasM1elztuh(ogVar2.WRKkgoJXwDn, -1L)) {
                    w10.X1lG3V04pd("Expected BringIntoViewRequester to not be used before parents are placed.");
                }
                return gqMuANyCes.OOA6hdeuvCS(ogVar2.OGdJP42E(gqMuANyCes, ogVar2.sb9fmtV8A(), 0L) ^ (-9223372034707292160L));
            case 2:
                og ogVar3 = (og) obj3;
                bd1 bd1Var = (bd1) obj2;
                d8 d8Var = (d8) obj;
                x7 x7Var = ogVar3.lv06NcmrQ;
                while (true) {
                    rg0 rg0Var = x7Var.GWasM1elztuh;
                    int i7 = rg0Var.AvO7iQsrTN;
                    if (i7 != 0) {
                        if (i7 == 0) {
                            o4.AvO7iQsrTN("MutableVector is empty.");
                            return null;
                        }
                        kt0 kt0Var2 = (kt0) ((lg) rg0Var.OOA6hdeuvCS[i7 - 1]).GWasM1elztuh.GWasM1elztuh();
                        if (kt0Var2 == null ? true : og.XmVeRDAr(ogVar3, kt0Var2, 0L, 0L, 3)) {
                            ((lg) x7Var.GWasM1elztuh.rQPn8YBR(r5.AvO7iQsrTN - 1)).Yi7zF1RB1.AvO7iQsrTN(kc1Var);
                        }
                    }
                }
                if (!ogVar3.WdrkLMV3xh || (kt0Var = (kt0) ogVar3.cilMamHF.GWasM1elztuh()) == null) {
                    ogVar = ogVar3;
                } else {
                    ogVar = ogVar3;
                    if (og.XmVeRDAr(ogVar, kt0Var, 0L, 0L, 3)) {
                        ogVar.WdrkLMV3xh = false;
                    }
                }
                bd1Var.OOA6hdeuvCS = og.gqMuANyCes(ogVar, d8Var, 0L);
                return kc1Var;
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                qx qxVar = (qx) obj3;
                x9 x9Var = (x9) obj2;
                y21 y21Var = (y21) obj;
                ve veVar = qxVar.rezfBrjOrqK;
                x9 x9Var2 = veVar.Yi7zF1RB1;
                try {
                    veVar.Yi7zF1RB1 = x9Var;
                    y21 y21Var2 = qxVar.YZjbz8VdP5;
                    int[] iArr = qxVar.iwATDS1i01k;
                    rf0 rf0Var = qxVar.cilMamHF;
                    qxVar.iwATDS1i01k = null;
                    qxVar.cilMamHF = null;
                    try {
                        qxVar.YZjbz8VdP5 = y21Var;
                        boolean z = veVar.OOA6hdeuvCS;
                        try {
                            veVar.OOA6hdeuvCS = false;
                            throw null;
                        } catch (Throwable th) {
                            veVar.OOA6hdeuvCS = z;
                            throw th;
                        }
                    } catch (Throwable th2) {
                        qxVar.YZjbz8VdP5 = y21Var2;
                        qxVar.iwATDS1i01k = iArr;
                        qxVar.cilMamHF = rf0Var;
                        throw th2;
                    }
                } catch (Throwable th3) {
                    veVar.Yi7zF1RB1 = x9Var2;
                    throw th3;
                }
            case 4:
                u80 u80Var = (u80) obj2;
                c70 c70Var = (c70) obj;
                i80 i80Var = (i80) ((ml) obj3).getValue();
                x20 x20Var = (x20) ((t70) u80Var.OOA6hdeuvCS.OOA6hdeuvCS).getValue();
                x0 x0Var = new x0();
                x0 x0Var2 = i80Var.GWasM1elztuh;
                int i8 = x20Var.OOA6hdeuvCS;
                if (i8 < 0) {
                    w10.X1lG3V04pd("negative nearestRange.first");
                }
                int min = Math.min(x20Var.EljAMC1QTz, x0Var2.GWasM1elztuh - 1);
                if (min < i8) {
                    zf0 zf0Var = pk0.GWasM1elztuh;
                    zf0Var.getClass();
                    x0Var.Yi7zF1RB1 = zf0Var;
                    x0Var.X1lG3V04pd = new Object[0];
                    x0Var.GWasM1elztuh = 0;
                } else {
                    int i9 = (min - i8) + 1;
                    x0Var.X1lG3V04pd = new Object[i9];
                    x0Var.GWasM1elztuh = i8;
                    zf0 zf0Var2 = new zf0(i9);
                    rg0 rg0Var2 = (rg0) x0Var2.Yi7zF1RB1;
                    if (i8 < 0 || i8 >= x0Var2.GWasM1elztuh) {
                        StringBuilder rQPn8YBR = mr0.rQPn8YBR("Index ", i8, ", size ");
                        rQPn8YBR.append(x0Var2.GWasM1elztuh);
                        w10.xqGvceK5x(rQPn8YBR.toString());
                    }
                    if (min < 0 || min >= x0Var2.GWasM1elztuh) {
                        StringBuilder rQPn8YBR2 = mr0.rQPn8YBR("Index ", min, ", size ");
                        rQPn8YBR2.append(x0Var2.GWasM1elztuh);
                        w10.xqGvceK5x(rQPn8YBR2.toString());
                    }
                    if (min < i8) {
                        w10.GWasM1elztuh("toIndex (" + min + ") should be not smaller than fromIndex (" + i8 + ')');
                    }
                    int JFJ3QoxA = vc0.JFJ3QoxA(i8, rg0Var2);
                    int i10 = ((j30) rg0Var2.OOA6hdeuvCS[JFJ3QoxA]).GWasM1elztuh;
                    while (i10 <= min) {
                        j30 j30Var = (j30) rg0Var2.OOA6hdeuvCS[JFJ3QoxA];
                        iy iyVar = (iy) j30Var.X1lG3V04pd.Yi7zF1RB1;
                        int i11 = j30Var.GWasM1elztuh;
                        int max = Math.max(i8, i11);
                        int min2 = Math.min(min, (j30Var.Yi7zF1RB1 + i11) - i5);
                        if (max <= min2) {
                            while (true) {
                                i3 = i5;
                                Object mOu10nynGul = iyVar.mOu10nynGul(Integer.valueOf(max - i11));
                                zf0Var2.AvO7iQsrTN(max, mOu10nynGul);
                                i2 = min;
                                ((Object[]) x0Var.X1lG3V04pd)[max - x0Var.GWasM1elztuh] = mOu10nynGul;
                                if (max != min2) {
                                    max++;
                                    min = i2;
                                    i5 = i3;
                                }
                            }
                        } else {
                            i2 = min;
                            i3 = i5;
                        }
                        i10 += j30Var.Yi7zF1RB1;
                        JFJ3QoxA++;
                        min = i2;
                        i5 = i3;
                    }
                    x0Var.Yi7zF1RB1 = zf0Var2;
                }
                return new k80(u80Var, i80Var, c70Var, x0Var);
            default:
                lx lxVar = (lx) obj3;
                c31 c31Var = (c31) obj2;
                um0 um0Var = (um0) obj;
                if (lxVar != null) {
                    c31Var.GWasM1elztuh(c31Var.X1lG3V04pd(lxVar) - c31Var.jivtDDk9H);
                }
                List mE4lRynR = ki1.mE4lRynR(c31Var, null, c31Var.jivtDDk9H, null);
                me meVar = (me) rb.cTIXpaxc(mE4lRynR);
                Integer num = meVar != null ? meVar.Yi7zF1RB1 : null;
                List X1lG3V04pd = um0Var.X1lG3V04pd(num);
                if (num != null && !X1lG3V04pd.isEmpty()) {
                    me meVar2 = (me) rb.jed7WnvkLvFq(X1lG3V04pd);
                    int size = X1lG3V04pd.size() - 1;
                    if (size <= 0) {
                        list = xp.OOA6hdeuvCS;
                    } else if (size == 1) {
                        list = fb1.HFYAaqMd6(rb.vaTCmWUgXF(X1lG3V04pd));
                    } else {
                        ArrayList arrayList = new ArrayList(size);
                        if (X1lG3V04pd instanceof RandomAccess) {
                            int size2 = X1lG3V04pd.size();
                            while (i5 < size2) {
                                arrayList.add(X1lG3V04pd.get(i5));
                                i5++;
                            }
                        } else {
                            ListIterator listIterator = X1lG3V04pd.listIterator(1);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        list = arrayList;
                    }
                    X1lG3V04pd = rb.hOpoc9RpANL(fb1.HFYAaqMd6(new me(meVar2.GWasM1elztuh, null, num)), list);
                }
                return new ke(rb.hOpoc9RpANL(mE4lRynR, X1lG3V04pd), um0Var.EljAMC1QTz());
        }
    }

    public /* synthetic */ t5(Object obj, Object obj2, Object obj3, int i) {
        this.OOA6hdeuvCS = i;
        this.EljAMC1QTz = obj;
        this.AvO7iQsrTN = obj2;
        this.encWxUiV2 = obj3;
    }
}
