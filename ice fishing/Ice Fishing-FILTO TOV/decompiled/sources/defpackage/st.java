package defpackage;

import java.util.Comparator;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class st implements Comparator {
    public final /* synthetic */ int GWasM1elztuh;
    public static final st Yi7zF1RB1 = new st(0);
    public static final st X1lG3V04pd = new st(1);
    public static final st xqGvceK5x = new st(2);
    public static final st OOA6hdeuvCS = new st(3);
    public static final st EljAMC1QTz = new st(4);

    public /* synthetic */ st(int i) {
        this.GWasM1elztuh = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.GWasM1elztuh) {
            case 0:
                rt rtVar = (rt) obj;
                rt rtVar2 = (rt) obj2;
                if (!qj.YZjbz8VdP5(rtVar) || !qj.YZjbz8VdP5(rtVar2)) {
                    if (qj.YZjbz8VdP5(rtVar)) {
                        return -1;
                    }
                    return qj.YZjbz8VdP5(rtVar2) ? 1 : 0;
                }
                g60 eUH21U3apd = vc0.eUH21U3apd(rtVar);
                g60 eUH21U3apd2 = vc0.eUH21U3apd(rtVar2);
                if (o30.rQPn8YBR(eUH21U3apd, eUH21U3apd2)) {
                    return 0;
                }
                g60[] g60VarArr = new g60[16];
                int i = 0;
                while (eUH21U3apd != null) {
                    int i2 = i + 1;
                    if (g60VarArr.length < i2) {
                        int length = g60VarArr.length;
                        ?? r4 = new Object[Math.max(i2, length * 2)];
                        System.arraycopy(g60VarArr, 0, r4, 0, length);
                        g60VarArr = r4;
                    }
                    if (i != 0) {
                        System.arraycopy(g60VarArr, 0, g60VarArr, 0 + 1, i + 0);
                    }
                    g60VarArr[0] = eUH21U3apd;
                    i++;
                    eUH21U3apd = eUH21U3apd.cilMamHF();
                }
                g60[] g60VarArr2 = new g60[16];
                int i3 = 0;
                while (eUH21U3apd2 != null) {
                    int i4 = i3 + 1;
                    if (g60VarArr2.length < i4) {
                        int length2 = g60VarArr2.length;
                        ?? r42 = new Object[Math.max(i4, length2 * 2)];
                        System.arraycopy(g60VarArr2, 0, r42, 0, length2);
                        g60VarArr2 = r42;
                    }
                    if (i3 != 0) {
                        System.arraycopy(g60VarArr2, 0, g60VarArr2, 0 + 1, i3 + 0);
                    }
                    g60VarArr2[0] = eUH21U3apd2;
                    i3++;
                    eUH21U3apd2 = eUH21U3apd2.cilMamHF();
                }
                int min = Math.min(i - 1, i3 - 1);
                if (min >= 0) {
                    int i5 = 0;
                    while (o30.rQPn8YBR(g60VarArr[i5], g60VarArr2[i5])) {
                        if (i5 != min) {
                            i5++;
                        }
                    }
                    return o30.uFEq9NpZ(g60VarArr[i5].lv06NcmrQ(), g60VarArr2[i5].lv06NcmrQ());
                }
                o4.jivtDDk9H("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                kt0 encWxUiV2 = ((d01) obj).encWxUiV2();
                kt0 encWxUiV22 = ((d01) obj2).encWxUiV2();
                int compare = Float.compare(encWxUiV2.GWasM1elztuh, encWxUiV22.GWasM1elztuh);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = Float.compare(encWxUiV2.Yi7zF1RB1, encWxUiV22.Yi7zF1RB1);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = Float.compare(encWxUiV2.xqGvceK5x, encWxUiV22.xqGvceK5x);
                return compare3 != 0 ? compare3 : Float.compare(encWxUiV2.X1lG3V04pd, encWxUiV22.X1lG3V04pd);
            case 2:
                g60 g60Var = (g60) obj;
                g60 g60Var2 = (g60) obj2;
                int uFEq9NpZ = o30.uFEq9NpZ(g60Var2.mE4lRynR, g60Var.mE4lRynR);
                return uFEq9NpZ != 0 ? uFEq9NpZ : o30.uFEq9NpZ(g60Var.hashCode(), g60Var2.hashCode());
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                kt0 encWxUiV23 = ((d01) obj).encWxUiV2();
                kt0 encWxUiV24 = ((d01) obj2).encWxUiV2();
                int compare4 = Float.compare(encWxUiV24.X1lG3V04pd, encWxUiV23.X1lG3V04pd);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = Float.compare(encWxUiV23.Yi7zF1RB1, encWxUiV24.Yi7zF1RB1);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = Float.compare(encWxUiV23.xqGvceK5x, encWxUiV24.xqGvceK5x);
                return compare6 != 0 ? compare6 : Float.compare(encWxUiV24.GWasM1elztuh, encWxUiV23.GWasM1elztuh);
            case 4:
                rn0 rn0Var = (rn0) obj;
                rn0 rn0Var2 = (rn0) obj2;
                int compare7 = Float.compare(((kt0) rn0Var.OOA6hdeuvCS).Yi7zF1RB1, ((kt0) rn0Var2.OOA6hdeuvCS).Yi7zF1RB1);
                return compare7 != 0 ? compare7 : Float.compare(((kt0) rn0Var.OOA6hdeuvCS).xqGvceK5x, ((kt0) rn0Var2.OOA6hdeuvCS).xqGvceK5x);
            case 5:
                return n30.Mjvvu5DE(Integer.valueOf(((t3) obj).Yi7zF1RB1), Integer.valueOf(((t3) obj2).Yi7zF1RB1));
            case nr0.STRING_SET_FIELD_NUMBER /* 6 */:
                return n30.Mjvvu5DE(Integer.valueOf(((t3) obj).Yi7zF1RB1), Integer.valueOf(((t3) obj2).Yi7zF1RB1));
            default:
                g60 g60Var3 = (g60) obj;
                g60 g60Var4 = (g60) obj2;
                int uFEq9NpZ2 = o30.uFEq9NpZ(g60Var3.mE4lRynR, g60Var4.mE4lRynR);
                return uFEq9NpZ2 != 0 ? uFEq9NpZ2 : o30.uFEq9NpZ(g60Var3.hashCode(), g60Var4.hashCode());
        }
    }
}
