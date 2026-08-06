package defpackage;

/* loaded from: classes.dex */
public abstract class p71 {
    public static final java.util.Comparator[] IHQe1A4L2xu;
    public static final defpackage.g4 oh6vYeIP;

    static {
        java.util.Comparator[] comparatorArr = new java.util.Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new defpackage.o71(new defpackage.o71(i == 0 ? defpackage.hy.adDC3e2L : defpackage.hy.r1MBDhnF));
            i++;
        }
        IHQe1A4L2xu = comparatorArr;
        oh6vYeIP = defpackage.g4.wll2JLbTBC2;
    }

    public static final void IHQe1A4L2xu(defpackage.f71 f71Var, java.util.ArrayList arrayList, defpackage.s sVar, defpackage.s sVar2, defpackage.xk0 xk0Var) {
        defpackage.b71 b71Var = f71Var.F7NU4MC0GW;
        java.lang.Object AARZUJiTa = b71Var.adDC3e2L.AARZUJiTa(defpackage.j71.SyNS6RMn);
        if (AARZUJiTa == null) {
            AARZUJiTa = java.lang.Boolean.FALSE;
        }
        boolean booleanValue = ((java.lang.Boolean) AARZUJiTa).booleanValue();
        if ((booleanValue || ((java.lang.Boolean) sVar2.AARZUJiTa(f71Var)).booleanValue()) && ((java.lang.Boolean) sVar.AARZUJiTa(f71Var)).booleanValue()) {
            arrayList.add(f71Var);
        }
        if (booleanValue) {
            xk0Var.EXtogiMhuM(f71Var.xiZrDbcSW0, oh6vYeIP(f71Var, sVar, sVar2, defpackage.f71.SH1y5HwkJhh(7, f71Var)));
            return;
        }
        java.util.List SH1y5HwkJhh = defpackage.f71.SH1y5HwkJhh(7, f71Var);
        int size = SH1y5HwkJhh.size();
        for (int i = 0; i < size; i++) {
            IHQe1A4L2xu((defpackage.f71) SH1y5HwkJhh.get(i), arrayList, sVar, sVar2, xk0Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[LOOP:1: B:11:0x0046->B:29:0x00ed, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00f5 A[EDGE_INSN: B:30:0x00f5->B:31:0x00f5 BREAK  A[LOOP:1: B:11:0x0046->B:29:0x00ed], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.util.ArrayList oh6vYeIP(defpackage.f71 f71Var, defpackage.s sVar, defpackage.s sVar2, java.util.List list) {
        int i;
        defpackage.xk0 xk0Var = defpackage.y60.IHQe1A4L2xu;
        defpackage.xk0 xk0Var2 = new defpackage.xk0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            IHQe1A4L2xu((defpackage.f71) list.get(i2), arrayList, sVar, sVar2, xk0Var2);
        }
        int i3 = 1;
        char c = f71Var.r1MBDhnF.nBH8hAHy == defpackage.w90.xiZrDbcSW0 ? (char) 1 : (char) 0;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(arrayList.size() / 2);
        int size2 = arrayList.size() - 1;
        if (size2 >= 0) {
            int i4 = 0;
            while (true) {
                defpackage.f71 f71Var2 = (defpackage.f71) arrayList.get(i4);
                if (i4 != 0) {
                    float f = f71Var2.EXtogiMhuM().oh6vYeIP;
                    float f2 = f71Var2.EXtogiMhuM().F7NU4MC0GW;
                    int i5 = f >= f2 ? i3 : 0;
                    int size3 = arrayList2.size() - i3;
                    if (size3 >= 0) {
                        int i6 = 0;
                        while (true) {
                            defpackage.kz0 kz0Var = (defpackage.kz0) ((defpackage.et0) arrayList2.get(i6)).adDC3e2L;
                            float f3 = kz0Var.oh6vYeIP;
                            i = i3;
                            float f4 = kz0Var.F7NU4MC0GW;
                            int i7 = f3 >= f4 ? i : 0;
                            if (i5 == 0 && i7 == 0 && java.lang.Math.max(f, f3) < java.lang.Math.min(f2, f4)) {
                                arrayList2.set(i6, new defpackage.et0(new defpackage.kz0(java.lang.Math.max(kz0Var.IHQe1A4L2xu, 0.0f), java.lang.Math.max(kz0Var.oh6vYeIP, f), java.lang.Math.min(kz0Var.r1MBDhnF, Float.POSITIVE_INFINITY), java.lang.Math.min(f4, f2)), ((defpackage.et0) arrayList2.get(i6)).xiZrDbcSW0));
                                ((java.util.List) ((defpackage.et0) arrayList2.get(i6)).xiZrDbcSW0).add(f71Var2);
                                break;
                            }
                            if (i6 == size3) {
                                break;
                            }
                            i6++;
                            i3 = i;
                        }
                        arrayList2.add(new defpackage.et0(f71Var2.EXtogiMhuM(), defpackage.fm.wll2JLbTBC2(f71Var2)));
                        if (i4 != size2) {
                            break;
                        }
                        i4++;
                        i3 = i;
                    }
                }
                i = i3;
                arrayList2.add(new defpackage.et0(f71Var2.EXtogiMhuM(), defpackage.fm.wll2JLbTBC2(f71Var2)));
                if (i4 != size2) {
                }
            }
        } else {
            i = 1;
        }
        defpackage.xd.wKlPRKlRnfqr(arrayList2, defpackage.hy.xiZrDbcSW0);
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Comparator comparator = IHQe1A4L2xu[c ^ 1];
        int size4 = arrayList2.size();
        for (int i8 = 0; i8 < size4; i8++) {
            defpackage.et0 et0Var = (defpackage.et0) arrayList2.get(i8);
            defpackage.xd.wKlPRKlRnfqr((java.util.List) et0Var.xiZrDbcSW0, comparator);
            arrayList3.addAll((java.util.Collection) et0Var.xiZrDbcSW0);
        }
        int i9 = i;
        defpackage.xd.wKlPRKlRnfqr(arrayList3, new defpackage.xe(i9, oh6vYeIP));
        int i10 = 0;
        while (i10 <= arrayList3.size() - i9) {
            java.util.List list2 = (java.util.List) xk0Var2.oh6vYeIP(((defpackage.f71) arrayList3.get(i10)).xiZrDbcSW0);
            if (list2 != null) {
                if (((java.lang.Boolean) sVar2.AARZUJiTa(arrayList3.get(i10))).booleanValue()) {
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
