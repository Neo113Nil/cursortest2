package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class ub1 {
    public static final java.util.Comparator[] ZpBGe2uQfcn8;
    public static final defpackage.sb1 giKS3J6vZuNy;

    static {
        java.util.Comparator[] comparatorArr = new java.util.Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new defpackage.tb1(new defpackage.tb1(i == 0 ? defpackage.oz.WDYagTQQm9ns : defpackage.oz.fWTAfUmVKrZq));
            i++;
        }
        ZpBGe2uQfcn8 = comparatorArr;
        giKS3J6vZuNy = defpackage.sb1.QiMR8OkAhezm;
    }

    public static final void ZpBGe2uQfcn8(defpackage.jb1 jb1Var, java.util.ArrayList arrayList, defpackage.YjS0G3zEDWNX yjS0G3zEDWNX, defpackage.YjS0G3zEDWNX yjS0G3zEDWNX2, defpackage.gn0 gn0Var) {
        defpackage.fb1 fb1Var = jb1Var.JhCgjQRTAOCT;
        java.lang.Object QiMR8OkAhezm = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.gUjdnLbkVAaA);
        if (QiMR8OkAhezm == null) {
            QiMR8OkAhezm = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = ((java.lang.Boolean) QiMR8OkAhezm).booleanValue();
        if ((booleanValue || ((java.lang.Boolean) yjS0G3zEDWNX2.P05cfTpS5W5L(jb1Var)).booleanValue()) && ((java.lang.Boolean) yjS0G3zEDWNX.P05cfTpS5W5L(jb1Var)).booleanValue()) {
            arrayList.add(jb1Var);
        }
        if (booleanValue) {
            gn0Var.P05cfTpS5W5L(jb1Var.oh71FJcDz6S2, giKS3J6vZuNy(jb1Var, yjS0G3zEDWNX, yjS0G3zEDWNX2, defpackage.jb1.GE9mJIPrb8gP(7, jb1Var)));
            return;
        }
        java.util.List GE9mJIPrb8gP = defpackage.jb1.GE9mJIPrb8gP(7, jb1Var);
        int size = GE9mJIPrb8gP.size();
        for (int i = 0; i < size; i++) {
            ZpBGe2uQfcn8((defpackage.jb1) GE9mJIPrb8gP.get(i), arrayList, yjS0G3zEDWNX, yjS0G3zEDWNX2, gn0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.ArrayList giKS3J6vZuNy(defpackage.jb1 jb1Var, defpackage.YjS0G3zEDWNX yjS0G3zEDWNX, defpackage.YjS0G3zEDWNX yjS0G3zEDWNX2, java.util.List list) {
        int i;
        defpackage.gn0 gn0Var = defpackage.k90.ZpBGe2uQfcn8;
        defpackage.gn0 gn0Var2 = new defpackage.gn0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            ZpBGe2uQfcn8((defpackage.jb1) list.get(i2), arrayList, yjS0G3zEDWNX, yjS0G3zEDWNX2, gn0Var2);
        }
        int i3 = 1;
        char c = jb1Var.fWTAfUmVKrZq.UmgHb6n58gfG == defpackage.sc0.oh71FJcDz6S2 ? (char) 1 : (char) 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                defpackage.jb1 jb1Var2 = (defpackage.jb1) arrayList.get(i4);
                if (i4 != 0) {
                    float f = jb1Var2.P05cfTpS5W5L().giKS3J6vZuNy;
                    float f2 = jb1Var2.P05cfTpS5W5L().JhCgjQRTAOCT;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            defpackage.s31 s31Var = (defpackage.s31) ((defpackage.bw0) arrayList2.get(i6)).WDYagTQQm9ns;
                            float f3 = s31Var.giKS3J6vZuNy;
                            i = i3;
                            float f4 = s31Var.JhCgjQRTAOCT;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && java.lang.Math.max(f, f3) < java.lang.Math.min(f2, f4)) {
                                arrayList2.set(i6, new defpackage.bw0(new defpackage.s31(java.lang.Math.max(s31Var.ZpBGe2uQfcn8, 0.0f), java.lang.Math.max(s31Var.giKS3J6vZuNy, f), java.lang.Math.min(s31Var.fWTAfUmVKrZq, Float.POSITIVE_INFINITY), java.lang.Math.min(f4, f2)), ((defpackage.bw0) arrayList2.get(i6)).oh71FJcDz6S2));
                                ((java.util.List) ((defpackage.bw0) arrayList2.get(i6)).oh71FJcDz6S2).add(jb1Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                        arrayList2.add(new defpackage.bw0(jb1Var2.P05cfTpS5W5L(), defpackage.ma0.dG7RjM6DqYVL(jb1Var2)));
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                }
                i = i3;
                arrayList2.add(new defpackage.bw0(jb1Var2.P05cfTpS5W5L(), defpackage.ma0.dG7RjM6DqYVL(jb1Var2)));
                if (i4 != size2) {
                }
            }
        } else {
            i = 1;
        }
        defpackage.mf.OVwOqzUGHcCU(arrayList2, defpackage.oz.oh71FJcDz6S2);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Comparator comparator = ZpBGe2uQfcn8[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            defpackage.bw0 bw0Var = (defpackage.bw0) arrayList2.get(i8);
            defpackage.mf.OVwOqzUGHcCU((java.util.List) bw0Var.oh71FJcDz6S2, comparator);
            arrayList3.addAll((java.util.Collection) bw0Var.oh71FJcDz6S2);
        }
        int i9 = i;
        defpackage.mf.OVwOqzUGHcCU(arrayList3, new defpackage.qg(i9, giKS3J6vZuNy));
        int i10 = 0;
        while (i10 <= arrayList3.size() - i9) {
            java.util.List list2 = (java.util.List) gn0Var2.giKS3J6vZuNy(((defpackage.jb1) arrayList3.get(i10)).oh71FJcDz6S2);
            if (list2 != null) {
                if (((java.lang.Boolean) yjS0G3zEDWNX2.P05cfTpS5W5L(arrayList3.get(i10))).booleanValue()) {
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
