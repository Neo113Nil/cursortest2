package defpackage;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class e0 implements bd0 {
    public final /* synthetic */ int GWasM1elztuh;
    public static final e0 Yi7zF1RB1 = new e0(0);
    public static final e0 X1lG3V04pd = new e0(1);
    public static final e0 xqGvceK5x = new e0(2);
    public static final bCsSzSHkbaQ OOA6hdeuvCS = new bCsSzSHkbaQ(10);
    public static final e0 EljAMC1QTz = new e0(3);

    public /* synthetic */ e0(int i) {
        this.GWasM1elztuh = i;
    }

    public static final void GWasM1elztuh(ArrayList arrayList, pt0 pt0Var, dd0 dd0Var, ArrayList arrayList2, ArrayList arrayList3, pt0 pt0Var2, ArrayList arrayList4, pt0 pt0Var3, pt0 pt0Var4) {
        if (!arrayList.isEmpty()) {
            pt0Var.OOA6hdeuvCS = dd0Var.rezfBrjOrqK(12.0f) + pt0Var.OOA6hdeuvCS;
        }
        arrayList.add(0, rb.gqMuANyCes(arrayList2));
        arrayList3.add(Integer.valueOf(pt0Var2.OOA6hdeuvCS));
        arrayList4.add(Integer.valueOf(pt0Var.OOA6hdeuvCS));
        pt0Var.OOA6hdeuvCS += pt0Var2.OOA6hdeuvCS;
        pt0Var3.OOA6hdeuvCS = Math.max(pt0Var3.OOA6hdeuvCS, pt0Var4.OOA6hdeuvCS);
        arrayList2.clear();
        pt0Var4.OOA6hdeuvCS = 0;
        pt0Var2.OOA6hdeuvCS = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:92:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01f8  */
    @Override // defpackage.bd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final cd0 AvO7iQsrTN(dd0 dd0Var, List list, long j) {
        ArrayList arrayList;
        int i;
        ArrayList arrayList2;
        ArrayList arrayList3;
        long j2;
        ArrayList arrayList4;
        Object obj;
        Object obj2;
        int rezfBrjOrqK;
        int max;
        int i2;
        int mqNvfisv7;
        long j3 = j;
        int i3 = this.GWasM1elztuh;
        yp ypVar = yp.OOA6hdeuvCS;
        switch (i3) {
            case 0:
                ArrayList arrayList5 = new ArrayList(list.size());
                int size = list.size();
                int i4 = 0;
                int i5 = 0;
                for (int i6 = 0; i6 < size; i6++) {
                    up0 OOA6hdeuvCS2 = ((wc0) list.get(i6)).OOA6hdeuvCS(j3);
                    i4 = Math.max(i4, OOA6hdeuvCS2.OOA6hdeuvCS);
                    i5 = Math.max(i5, OOA6hdeuvCS2.EljAMC1QTz);
                    arrayList5.add(OOA6hdeuvCS2);
                }
                if (list.isEmpty()) {
                    i4 = eg.JFJ3QoxA(j3);
                    i5 = eg.mOu10nynGul(j3);
                }
                return dd0Var.MjxSquD6Av(i4, i5, ypVar, new d0(0, arrayList5));
            case 1:
                return dd0Var.MjxSquD6Av(eg.JFJ3QoxA(j3), eg.mOu10nynGul(j3), ypVar, new bCsSzSHkbaQ(10));
            case 2:
                return dd0Var.MjxSquD6Av(eg.encWxUiV2(j3), eg.AvO7iQsrTN(j3), ypVar, OOA6hdeuvCS);
            case nr0.INTEGER_FIELD_NUMBER /* 3 */:
                return dd0Var.MjxSquD6Av(eg.EljAMC1QTz(j3) ? eg.encWxUiV2(j3) : 0, eg.OOA6hdeuvCS(j3) ? eg.AvO7iQsrTN(j3) : 0, ypVar, new bCsSzSHkbaQ(10));
            case 4:
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                pt0 pt0Var = new pt0();
                pt0 pt0Var2 = new pt0();
                ArrayList arrayList9 = new ArrayList();
                pt0 pt0Var3 = new pt0();
                ArrayList arrayList10 = arrayList7;
                pt0 pt0Var4 = new pt0();
                int i7 = 0;
                for (int size2 = list.size(); i7 < size2; size2 = i) {
                    up0 OOA6hdeuvCS3 = ((wc0) list.get(i7)).OOA6hdeuvCS(j3);
                    if (!arrayList9.isEmpty()) {
                        ArrayList arrayList11 = arrayList6;
                        pt0 pt0Var5 = pt0Var2;
                        if (dd0Var.rezfBrjOrqK(8.0f) + pt0Var3.OOA6hdeuvCS + OOA6hdeuvCS3.OOA6hdeuvCS <= eg.encWxUiV2(j3)) {
                            arrayList6 = arrayList11;
                            pt0Var2 = pt0Var5;
                        } else {
                            i = size2;
                            arrayList6 = arrayList11;
                            pt0Var2 = pt0Var5;
                            long j4 = j3;
                            arrayList2 = arrayList9;
                            arrayList3 = arrayList10;
                            j2 = j4;
                            GWasM1elztuh(arrayList6, pt0Var2, dd0Var, arrayList2, arrayList3, pt0Var4, arrayList8, pt0Var, pt0Var3);
                            if (arrayList2.isEmpty()) {
                                arrayList4 = arrayList6;
                                pt0Var3.OOA6hdeuvCS = dd0Var.rezfBrjOrqK(8.0f) + pt0Var3.OOA6hdeuvCS;
                            } else {
                                arrayList4 = arrayList6;
                            }
                            arrayList2.add(OOA6hdeuvCS3);
                            pt0Var3.OOA6hdeuvCS += OOA6hdeuvCS3.OOA6hdeuvCS;
                            pt0Var4.OOA6hdeuvCS = Math.max(pt0Var4.OOA6hdeuvCS, OOA6hdeuvCS3.EljAMC1QTz);
                            i7++;
                            arrayList9 = arrayList2;
                            arrayList6 = arrayList4;
                            long j5 = j2;
                            arrayList10 = arrayList3;
                            j3 = j5;
                        }
                    }
                    i = size2;
                    long j6 = j3;
                    arrayList2 = arrayList9;
                    arrayList3 = arrayList10;
                    j2 = j6;
                    if (arrayList2.isEmpty()) {
                    }
                    arrayList2.add(OOA6hdeuvCS3);
                    pt0Var3.OOA6hdeuvCS += OOA6hdeuvCS3.OOA6hdeuvCS;
                    pt0Var4.OOA6hdeuvCS = Math.max(pt0Var4.OOA6hdeuvCS, OOA6hdeuvCS3.EljAMC1QTz);
                    i7++;
                    arrayList9 = arrayList2;
                    arrayList6 = arrayList4;
                    long j52 = j2;
                    arrayList10 = arrayList3;
                    j3 = j52;
                }
                long j7 = j3;
                ArrayList arrayList12 = arrayList10;
                ArrayList arrayList13 = arrayList6;
                ArrayList arrayList14 = arrayList9;
                if (arrayList14.isEmpty()) {
                    arrayList = arrayList13;
                } else {
                    arrayList = arrayList13;
                    GWasM1elztuh(arrayList, pt0Var2, dd0Var, arrayList14, arrayList12, pt0Var4, arrayList8, pt0Var, pt0Var3);
                }
                int max2 = Math.max(pt0Var.OOA6hdeuvCS, eg.JFJ3QoxA(j7));
                return dd0Var.MjxSquD6Av(max2, Math.max(pt0Var2.OOA6hdeuvCS, eg.mOu10nynGul(j7)), ypVar, new d5idzIhj55b(arrayList, dd0Var, max2, arrayList8));
            default:
                int min = Math.min(eg.encWxUiV2(j3), dd0Var.rezfBrjOrqK(600.0f));
                int size3 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 < size3) {
                        obj = list.get(i8);
                        if (!o30.rQPn8YBR(qj.arNh8D4Z5gB((wc0) obj), "action")) {
                            i8++;
                        }
                    } else {
                        obj = null;
                    }
                }
                wc0 wc0Var = (wc0) obj;
                up0 OOA6hdeuvCS4 = wc0Var != null ? wc0Var.OOA6hdeuvCS(j3) : null;
                int size4 = list.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size4) {
                        obj2 = list.get(i9);
                        if (!o30.rQPn8YBR(qj.arNh8D4Z5gB((wc0) obj2), "dismissAction")) {
                            i9++;
                        }
                    } else {
                        obj2 = null;
                    }
                }
                wc0 wc0Var2 = (wc0) obj2;
                final up0 OOA6hdeuvCS5 = wc0Var2 != null ? wc0Var2.OOA6hdeuvCS(j3) : null;
                int i10 = OOA6hdeuvCS4 != null ? OOA6hdeuvCS4.OOA6hdeuvCS : 0;
                int i11 = OOA6hdeuvCS4 != null ? OOA6hdeuvCS4.EljAMC1QTz : 0;
                int i12 = OOA6hdeuvCS5 != null ? OOA6hdeuvCS5.OOA6hdeuvCS : 0;
                int i13 = OOA6hdeuvCS5 != null ? OOA6hdeuvCS5.EljAMC1QTz : 0;
                int rezfBrjOrqK2 = ((min - i10) - i12) - (i12 == 0 ? dd0Var.rezfBrjOrqK(8.0f) : 0);
                int JFJ3QoxA = eg.JFJ3QoxA(j3);
                if (rezfBrjOrqK2 >= JFJ3QoxA) {
                    JFJ3QoxA = rezfBrjOrqK2;
                }
                int size5 = list.size();
                int i14 = 0;
                while (i14 < size5) {
                    wc0 wc0Var3 = (wc0) list.get(i14);
                    if (o30.rQPn8YBR(qj.arNh8D4Z5gB(wc0Var3), "text")) {
                        int i15 = i13;
                        final up0 OOA6hdeuvCS6 = wc0Var3.OOA6hdeuvCS(eg.GWasM1elztuh(j, 0, JFJ3QoxA, 0, 0, 9));
                        qz qzVar = d6sfifL1.GWasM1elztuh;
                        int mqNvfisv72 = OOA6hdeuvCS6.mqNvfisv7(qzVar);
                        int mqNvfisv73 = OOA6hdeuvCS6.mqNvfisv7(d6sfifL1.Yi7zF1RB1);
                        boolean z = true;
                        boolean z2 = (mqNvfisv72 == Integer.MIN_VALUE || mqNvfisv73 == Integer.MIN_VALUE) ? false : true;
                        if (mqNvfisv72 != mqNvfisv73 && z2) {
                            z = false;
                        }
                        final int i16 = min - i12;
                        final int i17 = i16 - i10;
                        if (z) {
                            max = Math.max(dd0Var.rezfBrjOrqK(p.M3K9sHhK), Math.max(i11, i15));
                            rezfBrjOrqK = (max - OOA6hdeuvCS6.EljAMC1QTz) / 2;
                            if (OOA6hdeuvCS4 != null && (mqNvfisv7 = OOA6hdeuvCS4.mqNvfisv7(qzVar)) != Integer.MIN_VALUE) {
                                i2 = (mqNvfisv72 + rezfBrjOrqK) - mqNvfisv7;
                            }
                            i2 = 0;
                        } else {
                            rezfBrjOrqK = dd0Var.rezfBrjOrqK(30.0f) - mqNvfisv72;
                            max = Math.max(dd0Var.rezfBrjOrqK(p.k8h8IjolWQ), OOA6hdeuvCS6.EljAMC1QTz + rezfBrjOrqK);
                            if (OOA6hdeuvCS4 != null) {
                                i2 = (max - OOA6hdeuvCS4.EljAMC1QTz) / 2;
                            }
                            i2 = 0;
                        }
                        final int i18 = i2;
                        final int i19 = rezfBrjOrqK;
                        final int i20 = OOA6hdeuvCS5 != null ? (max - OOA6hdeuvCS5.EljAMC1QTz) / 2 : 0;
                        final up0 up0Var = OOA6hdeuvCS4;
                        return dd0Var.MjxSquD6Av(min, max, ypVar, new hv() { // from class: t31
                            @Override // defpackage.hv
                            public final Object mOu10nynGul(Object obj3) {
                                tp0 tp0Var = (tp0) obj3;
                                tp0.JFJ3QoxA(tp0Var, up0.this, 0, i19);
                                up0 up0Var2 = OOA6hdeuvCS5;
                                if (up0Var2 != null) {
                                    tp0.JFJ3QoxA(tp0Var, up0Var2, i16, i20);
                                }
                                up0 up0Var3 = up0Var;
                                if (up0Var3 != null) {
                                    tp0.JFJ3QoxA(tp0Var, up0Var3, i17, i18);
                                }
                                return kc1.GWasM1elztuh;
                            }
                        });
                    }
                    i14++;
                    JFJ3QoxA = JFJ3QoxA;
                    OOA6hdeuvCS4 = OOA6hdeuvCS4;
                }
                xa0.Yi7zF1RB1("Collection contains no element matching the predicate.");
                throw new vc();
        }
    }
}
