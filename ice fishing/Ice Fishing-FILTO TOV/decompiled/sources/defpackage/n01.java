package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public abstract class n01 {
    public static final Comparator[] GWasM1elztuh;
    public static final r2 Yi7zF1RB1;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new m01(new m01(i == 0 ? st.OOA6hdeuvCS : st.X1lG3V04pd));
            i++;
        }
        GWasM1elztuh = comparatorArr;
        Yi7zF1RB1 = r2.A1EKNP6CxJ;
    }

    public static final void GWasM1elztuh(d01 d01Var, ArrayList arrayList, NWXxPwoOUSX9 nWXxPwoOUSX9, NWXxPwoOUSX9 nWXxPwoOUSX92, rf0 rf0Var) {
        zz0 zz0Var = d01Var.xqGvceK5x;
        Object AvO7iQsrTN = zz0Var.OOA6hdeuvCS.AvO7iQsrTN(h01.uFEq9NpZ);
        if (AvO7iQsrTN == null) {
            AvO7iQsrTN = Boolean.FALSE;
        }
        boolean booleanValue = ((Boolean) AvO7iQsrTN).booleanValue();
        if ((booleanValue || ((Boolean) nWXxPwoOUSX92.mOu10nynGul(d01Var)).booleanValue()) && ((Boolean) nWXxPwoOUSX9.mOu10nynGul(d01Var)).booleanValue()) {
            arrayList.add(d01Var);
        }
        if (booleanValue) {
            rf0Var.encWxUiV2(d01Var.EljAMC1QTz, Yi7zF1RB1(d01Var, nWXxPwoOUSX9, nWXxPwoOUSX92, d01.JFJ3QoxA(7, d01Var)));
            return;
        }
        List JFJ3QoxA = d01.JFJ3QoxA(7, d01Var);
        int size = JFJ3QoxA.size();
        for (int i = 0; i < size; i++) {
            GWasM1elztuh((d01) JFJ3QoxA.get(i), arrayList, nWXxPwoOUSX9, nWXxPwoOUSX92, rf0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ArrayList Yi7zF1RB1(d01 d01Var, NWXxPwoOUSX9 nWXxPwoOUSX9, NWXxPwoOUSX9 nWXxPwoOUSX92, List list) {
        int i;
        rf0 rf0Var = t20.GWasM1elztuh;
        rf0 rf0Var2 = new rf0();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            GWasM1elztuh((d01) list.get(i2), arrayList, nWXxPwoOUSX9, nWXxPwoOUSX92, rf0Var2);
        }
        int i3 = 1;
        char c = d01Var.X1lG3V04pd.k8h8IjolWQ == p50.EljAMC1QTz ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                d01 d01Var2 = (d01) arrayList.get(i4);
                if (i4 != 0) {
                    float f = d01Var2.encWxUiV2().Yi7zF1RB1;
                    float f2 = d01Var2.encWxUiV2().xqGvceK5x;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            kt0 kt0Var = (kt0) ((rn0) arrayList2.get(i6)).OOA6hdeuvCS;
                            float f3 = kt0Var.Yi7zF1RB1;
                            i = i3;
                            float f4 = kt0Var.xqGvceK5x;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && Math.max(f, f3) < Math.min(f2, f4)) {
                                arrayList2.set(i6, new rn0(new kt0(Math.max(kt0Var.GWasM1elztuh, 0.0f), Math.max(kt0Var.Yi7zF1RB1, f), Math.min(kt0Var.X1lG3V04pd, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((rn0) arrayList2.get(i6)).EljAMC1QTz));
                                ((List) ((rn0) arrayList2.get(i6)).EljAMC1QTz).add(d01Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                        arrayList2.add(new rn0(d01Var2.encWxUiV2(), fb1.TpUsjqg3bxO(d01Var2)));
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                }
                i = i3;
                arrayList2.add(new rn0(d01Var2.encWxUiV2(), fb1.TpUsjqg3bxO(d01Var2)));
                if (i4 != size2) {
                }
            }
        } else {
            i = 1;
        }
        vb.Qd9Q8OZgvOo4(arrayList2, st.EljAMC1QTz);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = GWasM1elztuh[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            rn0 rn0Var = (rn0) arrayList2.get(i8);
            vb.Qd9Q8OZgvOo4((List) rn0Var.EljAMC1QTz, comparator);
            arrayList3.addAll((Collection) rn0Var.EljAMC1QTz);
        }
        int i9 = i;
        vb.Qd9Q8OZgvOo4(arrayList3, new qc(i9, Yi7zF1RB1));
        int i10 = 0;
        while (i10 <= arrayList3.size() - i9) {
            List list2 = (List) rf0Var2.Yi7zF1RB1(((d01) arrayList3.get(i10)).EljAMC1QTz);
            if (list2 != null) {
                if (((Boolean) nWXxPwoOUSX92.mOu10nynGul(arrayList3.get(i10))).booleanValue()) {
                    i10++;
                } else {
                    arrayList3.remove(i10);
                }
                arrayList3.addAll(i10, list2);
                i10 += list2.size();
            } else {
                i10++;
            }
        }
        return arrayList3;
    }
}
