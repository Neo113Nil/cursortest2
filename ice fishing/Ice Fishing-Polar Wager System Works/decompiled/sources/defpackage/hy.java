package defpackage;

/* loaded from: classes.dex */
public final class hy implements java.util.Comparator {
    public final /* synthetic */ int IHQe1A4L2xu;
    public static final defpackage.hy oh6vYeIP = new defpackage.hy(0);
    public static final defpackage.hy r1MBDhnF = new defpackage.hy(1);
    public static final defpackage.hy F7NU4MC0GW = new defpackage.hy(2);
    public static final defpackage.hy adDC3e2L = new defpackage.hy(3);
    public static final defpackage.hy xiZrDbcSW0 = new defpackage.hy(4);

    public /* synthetic */ hy(int i) {
        this.IHQe1A4L2xu = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.IHQe1A4L2xu) {
            case 0:
                defpackage.gy gyVar = (defpackage.gy) obj;
                defpackage.gy gyVar2 = (defpackage.gy) obj2;
                if (!defpackage.mj1.wll2JLbTBC2(gyVar) || !defpackage.mj1.wll2JLbTBC2(gyVar2)) {
                    if (defpackage.mj1.wll2JLbTBC2(gyVar)) {
                        return -1;
                    }
                    return defpackage.mj1.wll2JLbTBC2(gyVar2) ? 1 : 0;
                }
                defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(gyVar);
                defpackage.ma0 D2vUnMij2 = defpackage.w70.D2vUnMij(gyVar2);
                if (defpackage.x70.QoRHpC4k(D2vUnMij, D2vUnMij2)) {
                    return 0;
                }
                defpackage.ma0[] ma0VarArr = new defpackage.ma0[16];
                int i = 0;
                while (D2vUnMij != null) {
                    int i2 = i + 1;
                    if (ma0VarArr.length < i2) {
                        int length = ma0VarArr.length;
                        ?? r4 = new java.lang.Object[java.lang.Math.max(i2, length * 2)];
                        java.lang.System.arraycopy(ma0VarArr, 0, r4, 0, length);
                        ma0VarArr = r4;
                    }
                    if (i != 0) {
                        java.lang.System.arraycopy(ma0VarArr, 0, ma0VarArr, 0 + 1, i + 0);
                    }
                    ma0VarArr[0] = D2vUnMij;
                    i++;
                    D2vUnMij = D2vUnMij.V7bD7b8KA();
                }
                defpackage.ma0[] ma0VarArr2 = new defpackage.ma0[16];
                int i3 = 0;
                while (D2vUnMij2 != null) {
                    int i4 = i3 + 1;
                    if (ma0VarArr2.length < i4) {
                        int length2 = ma0VarArr2.length;
                        ?? r42 = new java.lang.Object[java.lang.Math.max(i4, length2 * 2)];
                        java.lang.System.arraycopy(ma0VarArr2, 0, r42, 0, length2);
                        ma0VarArr2 = r42;
                    }
                    if (i3 != 0) {
                        java.lang.System.arraycopy(ma0VarArr2, 0, ma0VarArr2, 0 + 1, i3 + 0);
                    }
                    ma0VarArr2[0] = D2vUnMij2;
                    i3++;
                    D2vUnMij2 = D2vUnMij2.V7bD7b8KA();
                }
                int min = java.lang.Math.min(i - 1, i3 - 1);
                if (min >= 0) {
                    int i5 = 0;
                    while (defpackage.x70.QoRHpC4k(ma0VarArr[i5], ma0VarArr2[i5])) {
                        if (i5 != min) {
                            i5++;
                        }
                    }
                    return defpackage.x70.kNAkVymC(ma0VarArr[i5].PAEGRtP0bX(), ma0VarArr2[i5].PAEGRtP0bX());
                }
                defpackage.db.AARZUJiTa("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                defpackage.kz0 EXtogiMhuM = ((defpackage.f71) obj).EXtogiMhuM();
                defpackage.kz0 EXtogiMhuM2 = ((defpackage.f71) obj2).EXtogiMhuM();
                int compare = java.lang.Float.compare(EXtogiMhuM.IHQe1A4L2xu, EXtogiMhuM2.IHQe1A4L2xu);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = java.lang.Float.compare(EXtogiMhuM.oh6vYeIP, EXtogiMhuM2.oh6vYeIP);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = java.lang.Float.compare(EXtogiMhuM.F7NU4MC0GW, EXtogiMhuM2.F7NU4MC0GW);
                return compare3 != 0 ? compare3 : java.lang.Float.compare(EXtogiMhuM.r1MBDhnF, EXtogiMhuM2.r1MBDhnF);
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ma0 ma0Var = (defpackage.ma0) obj;
                defpackage.ma0 ma0Var2 = (defpackage.ma0) obj2;
                int kNAkVymC = defpackage.x70.kNAkVymC(ma0Var2.EgCjBq0SZwJ, ma0Var.EgCjBq0SZwJ);
                return kNAkVymC != 0 ? kNAkVymC : defpackage.x70.kNAkVymC(ma0Var.hashCode(), ma0Var2.hashCode());
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.kz0 EXtogiMhuM3 = ((defpackage.f71) obj).EXtogiMhuM();
                defpackage.kz0 EXtogiMhuM4 = ((defpackage.f71) obj2).EXtogiMhuM();
                int compare4 = java.lang.Float.compare(EXtogiMhuM4.r1MBDhnF, EXtogiMhuM3.r1MBDhnF);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = java.lang.Float.compare(EXtogiMhuM3.oh6vYeIP, EXtogiMhuM4.oh6vYeIP);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = java.lang.Float.compare(EXtogiMhuM3.F7NU4MC0GW, EXtogiMhuM4.F7NU4MC0GW);
                return compare6 != 0 ? compare6 : java.lang.Float.compare(EXtogiMhuM4.IHQe1A4L2xu, EXtogiMhuM3.IHQe1A4L2xu);
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.et0 et0Var = (defpackage.et0) obj;
                defpackage.et0 et0Var2 = (defpackage.et0) obj2;
                int compare7 = java.lang.Float.compare(((defpackage.kz0) et0Var.adDC3e2L).oh6vYeIP, ((defpackage.kz0) et0Var2.adDC3e2L).oh6vYeIP);
                return compare7 != 0 ? compare7 : java.lang.Float.compare(((defpackage.kz0) et0Var.adDC3e2L).F7NU4MC0GW, ((defpackage.kz0) et0Var2.adDC3e2L).F7NU4MC0GW);
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.s21.abhbClRa(java.lang.Integer.valueOf(((defpackage.k5) obj).oh6vYeIP), java.lang.Integer.valueOf(((defpackage.k5) obj2).oh6vYeIP));
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.s21.abhbClRa(java.lang.Integer.valueOf(((defpackage.k5) obj).oh6vYeIP), java.lang.Integer.valueOf(((defpackage.k5) obj2).oh6vYeIP));
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ma0 ma0Var3 = (defpackage.ma0) obj;
                defpackage.ma0 ma0Var4 = (defpackage.ma0) obj2;
                int kNAkVymC2 = defpackage.x70.kNAkVymC(ma0Var3.EgCjBq0SZwJ, ma0Var4.EgCjBq0SZwJ);
                return kNAkVymC2 != 0 ? kNAkVymC2 : defpackage.x70.kNAkVymC(ma0Var3.hashCode(), ma0Var4.hashCode());
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.s21.abhbClRa((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
            case 9:
                return defpackage.s21.abhbClRa((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
            case 10:
                return defpackage.s21.abhbClRa(((defpackage.pe1) obj).IHQe1A4L2xu, ((defpackage.pe1) obj2).IHQe1A4L2xu);
            default:
                return defpackage.s21.abhbClRa(((defpackage.re1) obj).IHQe1A4L2xu, ((defpackage.re1) obj2).IHQe1A4L2xu);
        }
    }
}
