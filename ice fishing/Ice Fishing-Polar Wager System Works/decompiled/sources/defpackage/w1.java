package defpackage;

/* loaded from: classes.dex */
public final class w1 implements defpackage.ii0 {
    public final /* synthetic */ int IHQe1A4L2xu;
    public static final defpackage.w1 oh6vYeIP = new defpackage.w1(0);
    public static final defpackage.w1 r1MBDhnF = new defpackage.w1(1);
    public static final defpackage.w1 F7NU4MC0GW = new defpackage.w1(2);
    public static final defpackage.JX5fKip1C6 adDC3e2L = new defpackage.JX5fKip1C6(3);
    public static final defpackage.w1 xiZrDbcSW0 = new defpackage.w1(3);

    public /* synthetic */ w1(int i) {
        this.IHQe1A4L2xu = i;
    }

    public static final void oh6vYeIP(java.util.ArrayList arrayList, defpackage.pz0 pz0Var, defpackage.ki0 ki0Var, java.util.ArrayList arrayList2, java.util.ArrayList arrayList3, defpackage.pz0 pz0Var2, java.util.ArrayList arrayList4, defpackage.pz0 pz0Var3, defpackage.pz0 pz0Var4) {
        if (!arrayList.isEmpty()) {
            pz0Var.adDC3e2L = ki0Var.yIx6ChFVk(12.0f) + pz0Var.adDC3e2L;
        }
        arrayList.add(0, defpackage.td.boH8X4DXyc4(arrayList2));
        arrayList3.add(java.lang.Integer.valueOf(pz0Var2.adDC3e2L));
        arrayList4.add(java.lang.Integer.valueOf(pz0Var.adDC3e2L));
        pz0Var.adDC3e2L += pz0Var2.adDC3e2L;
        pz0Var3.adDC3e2L = java.lang.Math.max(pz0Var3.adDC3e2L, pz0Var4.adDC3e2L);
        arrayList2.clear();
        pz0Var4.adDC3e2L = 0;
        pz0Var2.adDC3e2L = 0;
    }

    @Override // defpackage.ii0
    public final defpackage.ji0 xiZrDbcSW0(defpackage.ki0 ki0Var, java.util.List list, long j) {
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        int i = this.IHQe1A4L2xu;
        defpackage.ot otVar = defpackage.ot.adDC3e2L;
        switch (i) {
            case 0:
                java.util.ArrayList arrayList3 = new java.util.ArrayList(list.size());
                int size = list.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    defpackage.bv0 xiZrDbcSW02 = ((defpackage.di0) list.get(i4)).xiZrDbcSW0(j);
                    i2 = java.lang.Math.max(i2, xiZrDbcSW02.adDC3e2L);
                    i3 = java.lang.Math.max(i3, xiZrDbcSW02.xiZrDbcSW0);
                    arrayList3.add(xiZrDbcSW02);
                }
                if (list.isEmpty()) {
                    i2 = defpackage.ki.SH1y5HwkJhh(j);
                    i3 = defpackage.ki.riuEU0zW4(j);
                }
                return ki0Var.EoOhNTTfIN7K(i2, i3, otVar, new defpackage.v1(0, arrayList3));
            case 1:
                return ki0Var.EoOhNTTfIN7K(defpackage.ki.SH1y5HwkJhh(j), defpackage.ki.riuEU0zW4(j), otVar, new defpackage.JX5fKip1C6(3));
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return ki0Var.EoOhNTTfIN7K(defpackage.ki.EXtogiMhuM(j), defpackage.ki.AARZUJiTa(j), otVar, adDC3e2L);
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                return ki0Var.EoOhNTTfIN7K(defpackage.ki.xiZrDbcSW0(j) ? defpackage.ki.EXtogiMhuM(j) : 0, defpackage.ki.adDC3e2L(j) ? defpackage.ki.AARZUJiTa(j) : 0, otVar, new defpackage.JX5fKip1C6(3));
            default:
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                java.util.ArrayList arrayList5 = new java.util.ArrayList();
                java.util.ArrayList arrayList6 = new java.util.ArrayList();
                defpackage.pz0 pz0Var = new defpackage.pz0();
                defpackage.pz0 pz0Var2 = new defpackage.pz0();
                java.util.ArrayList arrayList7 = new java.util.ArrayList();
                defpackage.pz0 pz0Var3 = new defpackage.pz0();
                int i5 = 0;
                defpackage.pz0 pz0Var4 = new defpackage.pz0();
                int size2 = list.size();
                while (i5 < size2) {
                    defpackage.bv0 xiZrDbcSW03 = ((defpackage.di0) list.get(i5)).xiZrDbcSW0(j);
                    int i6 = i5;
                    if (!arrayList7.isEmpty()) {
                        java.util.ArrayList arrayList8 = arrayList4;
                        if (ki0Var.yIx6ChFVk(8.0f) + pz0Var3.adDC3e2L + xiZrDbcSW03.adDC3e2L <= defpackage.ki.EXtogiMhuM(j)) {
                            arrayList4 = arrayList8;
                        } else {
                            arrayList4 = arrayList8;
                            oh6vYeIP(arrayList4, pz0Var2, ki0Var, arrayList7, arrayList5, pz0Var4, arrayList6, pz0Var, pz0Var3);
                        }
                    }
                    if (arrayList7.isEmpty()) {
                        arrayList2 = arrayList4;
                    } else {
                        arrayList2 = arrayList4;
                        pz0Var3.adDC3e2L = ki0Var.yIx6ChFVk(8.0f) + pz0Var3.adDC3e2L;
                    }
                    arrayList7.add(xiZrDbcSW03);
                    pz0Var3.adDC3e2L += xiZrDbcSW03.adDC3e2L;
                    pz0Var4.adDC3e2L = java.lang.Math.max(pz0Var4.adDC3e2L, xiZrDbcSW03.xiZrDbcSW0);
                    i5 = i6 + 1;
                    arrayList4 = arrayList2;
                }
                java.util.ArrayList arrayList9 = arrayList4;
                if (arrayList7.isEmpty()) {
                    arrayList = arrayList9;
                } else {
                    arrayList = arrayList9;
                    oh6vYeIP(arrayList, pz0Var2, ki0Var, arrayList7, arrayList5, pz0Var4, arrayList6, pz0Var, pz0Var3);
                }
                int max = java.lang.Math.max(pz0Var.adDC3e2L, defpackage.ki.SH1y5HwkJhh(j));
                return ki0Var.EoOhNTTfIN7K(max, java.lang.Math.max(pz0Var2.adDC3e2L, defpackage.ki.riuEU0zW4(j)), otVar, new defpackage.j(arrayList, ki0Var, max, arrayList6));
        }
    }
}
