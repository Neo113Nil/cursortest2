package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class j implements defpackage.g00 {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int adDC3e2L = 0;
    public final /* synthetic */ java.lang.Object riuEU0zW4;
    public final /* synthetic */ int xiZrDbcSW0;

    public /* synthetic */ j(defpackage.yn ynVar, defpackage.g70 g70Var, defpackage.fl0 fl0Var, int i) {
        this.AARZUJiTa = ynVar;
        this.EXtogiMhuM = g70Var;
        this.riuEU0zW4 = fl0Var;
        this.xiZrDbcSW0 = i;
    }

    @Override // defpackage.g00
    public final java.lang.Object AARZUJiTa(java.lang.Object obj) {
        int i = this.adDC3e2L;
        defpackage.w90 w90Var = defpackage.w90.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj2 = this.riuEU0zW4;
        int i2 = this.xiZrDbcSW0;
        java.lang.Object obj3 = this.EXtogiMhuM;
        java.lang.Object obj4 = this.AARZUJiTa;
        switch (i) {
            case 0:
                java.util.ArrayList arrayList = (java.util.ArrayList) obj4;
                defpackage.ki0 ki0Var = (defpackage.ki0) obj2;
                java.util.ArrayList arrayList2 = (java.util.ArrayList) obj3;
                defpackage.av0 av0Var = (defpackage.av0) obj;
                int size = arrayList.size();
                for (int i3 = 0; i3 < size; i3++) {
                    java.util.List list = (java.util.List) arrayList.get(i3);
                    int size2 = list.size();
                    int[] iArr = new int[size2];
                    int i4 = 0;
                    while (i4 < size2) {
                        iArr[i4] = ((defpackage.bv0) list.get(i4)).adDC3e2L + (i4 < list.size() + (-1) ? ki0Var.yIx6ChFVk(8.0f) : 0);
                        i4++;
                    }
                    int[] iArr2 = new int[size2];
                    if (ki0Var.getLayoutDirection() == w90Var) {
                        int i5 = 0;
                        for (int i6 = 0; i6 < size2; i6++) {
                            i5 += iArr[i6];
                        }
                        int i7 = i2 - i5;
                        int i8 = 0;
                        int i9 = 0;
                        while (i8 < size2) {
                            int i10 = iArr[i8];
                            iArr2[i9] = i7;
                            i7 += i10;
                            i8++;
                            i9++;
                        }
                    } else {
                        int i11 = 0;
                        for (int i12 = size2 - 1; -1 < i12; i12--) {
                            int i13 = iArr[i12];
                            iArr2[i12] = i11;
                            i11 += i13;
                        }
                    }
                    int size3 = list.size();
                    for (int i14 = 0; i14 < size3; i14++) {
                        defpackage.av0.SH1y5HwkJhh(av0Var, (defpackage.bv0) list.get(i14), iArr2[i14], ((java.lang.Number) arrayList2.get(i3)).intValue());
                    }
                }
                return ok1Var;
            case 1:
                defpackage.g70 g70Var = (defpackage.g70) obj3;
                defpackage.fl0 fl0Var = (defpackage.fl0) obj2;
                if (obj == ((defpackage.yn) obj4)) {
                    defpackage.db.AARZUJiTa("A derived state calculation cannot read itself");
                    return null;
                }
                if (obj instanceof defpackage.kc1) {
                    int i15 = g70Var.IHQe1A4L2xu - i2;
                    int F7NU4MC0GW = fl0Var.F7NU4MC0GW(obj);
                    fl0Var.AARZUJiTa(java.lang.Math.min(i15, F7NU4MC0GW >= 0 ? fl0Var.r1MBDhnF[F7NU4MC0GW] : Integer.MAX_VALUE), obj);
                }
                return ok1Var;
            default:
                defpackage.bv0[] bv0VarArr = (defpackage.bv0[]) obj4;
                defpackage.e31 e31Var = (defpackage.e31) obj3;
                int[] iArr3 = (int[]) obj2;
                defpackage.av0 av0Var2 = (defpackage.av0) obj;
                int length = bv0VarArr.length;
                int i16 = 0;
                int i17 = 0;
                while (i16 < length) {
                    defpackage.bv0 bv0Var = bv0VarArr[i16];
                    int i18 = i17 + 1;
                    bv0Var.getClass();
                    java.lang.Object ez2rX8ReCYw = bv0Var.ez2rX8ReCYw();
                    defpackage.c31 c31Var = ez2rX8ReCYw instanceof defpackage.c31 ? (defpackage.c31) ez2rX8ReCYw : null;
                    defpackage.gk gkVar = c31Var != null ? c31Var.r1MBDhnF : null;
                    defpackage.av0.SH1y5HwkJhh(av0Var2, bv0Var, iArr3[i17], gkVar != null ? gkVar.WLpAkxCo.IHQe1A4L2xu(bv0Var.xiZrDbcSW0, i2, w90Var) : java.lang.Math.round((1.0f + e31Var.oh6vYeIP.IHQe1A4L2xu) * ((i2 - bv0Var.xiZrDbcSW0) / 2.0f)));
                    i16++;
                    i17 = i18;
                }
                return ok1Var;
        }
    }

    public /* synthetic */ j(java.util.ArrayList arrayList, defpackage.ki0 ki0Var, int i, java.util.ArrayList arrayList2) {
        this.AARZUJiTa = arrayList;
        this.riuEU0zW4 = ki0Var;
        this.xiZrDbcSW0 = i;
        this.EXtogiMhuM = arrayList2;
    }

    public /* synthetic */ j(defpackage.bv0[] bv0VarArr, defpackage.e31 e31Var, int i, int[] iArr) {
        this.AARZUJiTa = bv0VarArr;
        this.EXtogiMhuM = e31Var;
        this.xiZrDbcSW0 = i;
        this.riuEU0zW4 = iArr;
    }
}
