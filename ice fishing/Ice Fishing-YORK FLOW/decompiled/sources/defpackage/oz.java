package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class oz implements java.util.Comparator {
    public final /* synthetic */ int ZpBGe2uQfcn8;
    public static final defpackage.oz giKS3J6vZuNy = new defpackage.oz(0);
    public static final defpackage.oz fWTAfUmVKrZq = new defpackage.oz(1);
    public static final defpackage.oz JhCgjQRTAOCT = new defpackage.oz(2);
    public static final defpackage.oz WDYagTQQm9ns = new defpackage.oz(3);
    public static final defpackage.oz oh71FJcDz6S2 = new defpackage.oz(4);

    public /* synthetic */ oz(int i) {
        this.ZpBGe2uQfcn8 = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.Object, java.lang.Object[]] */
    @Override // java.util.Comparator
    public final int compare(java.lang.Object obj, java.lang.Object obj2) {
        switch (this.ZpBGe2uQfcn8) {
            case 0:
                defpackage.nz nzVar = (defpackage.nz) obj;
                defpackage.nz nzVar2 = (defpackage.nz) obj2;
                if (!defpackage.h0.KrtOTfE6jiS2(nzVar) || !defpackage.h0.KrtOTfE6jiS2(nzVar2)) {
                    if (defpackage.h0.KrtOTfE6jiS2(nzVar)) {
                        return -1;
                    }
                    return defpackage.h0.KrtOTfE6jiS2(nzVar2) ? 1 : 0;
                }
                defpackage.jd0 UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(nzVar);
                defpackage.jd0 UmgHb6n58gfG2 = defpackage.la0.UmgHb6n58gfG(nzVar2);
                if (defpackage.ma0.QiMR8OkAhezm(UmgHb6n58gfG, UmgHb6n58gfG2)) {
                    return 0;
                }
                defpackage.jd0[] jd0VarArr = new defpackage.jd0[16];
                int i = 0;
                while (UmgHb6n58gfG != null) {
                    int i2 = i + 1;
                    if (jd0VarArr.length < i2) {
                        int length = jd0VarArr.length;
                        ?? r4 = new java.lang.Object[java.lang.Math.max(i2, length * 2)];
                        java.lang.System.arraycopy(jd0VarArr, 0, r4, 0, length);
                        jd0VarArr = r4;
                    }
                    if (i != 0) {
                        java.lang.System.arraycopy(jd0VarArr, 0, jd0VarArr, 0 + 1, i + 0);
                    }
                    jd0VarArr[0] = UmgHb6n58gfG;
                    i++;
                    UmgHb6n58gfG = UmgHb6n58gfG.w7APNrr0aGRc();
                }
                defpackage.jd0[] jd0VarArr2 = new defpackage.jd0[16];
                int i3 = 0;
                while (UmgHb6n58gfG2 != null) {
                    int i4 = i3 + 1;
                    if (jd0VarArr2.length < i4) {
                        int length2 = jd0VarArr2.length;
                        ?? r42 = new java.lang.Object[java.lang.Math.max(i4, length2 * 2)];
                        java.lang.System.arraycopy(jd0VarArr2, 0, r42, 0, length2);
                        jd0VarArr2 = r42;
                    }
                    if (i3 != 0) {
                        java.lang.System.arraycopy(jd0VarArr2, 0, jd0VarArr2, 0 + 1, i3 + 0);
                    }
                    jd0VarArr2[0] = UmgHb6n58gfG2;
                    i3++;
                    UmgHb6n58gfG2 = UmgHb6n58gfG2.w7APNrr0aGRc();
                }
                int min = java.lang.Math.min(i - 1, i3 - 1);
                if (min >= 0) {
                    int i5 = 0;
                    while (defpackage.ma0.QiMR8OkAhezm(jd0VarArr[i5], jd0VarArr2[i5])) {
                        if (i5 != min) {
                            i5++;
                        }
                    }
                    return defpackage.ma0.fNwYGHIYeJcR(jd0VarArr[i5].maCixPsq4ml2(), jd0VarArr2[i5].maCixPsq4ml2());
                }
                defpackage.h7.P05cfTpS5W5L("Could not find a common ancestor between the two FocusModifiers.");
                return 0;
            case 1:
                defpackage.s31 P05cfTpS5W5L = ((defpackage.jb1) obj).P05cfTpS5W5L();
                defpackage.s31 P05cfTpS5W5L2 = ((defpackage.jb1) obj2).P05cfTpS5W5L();
                int compare = java.lang.Float.compare(P05cfTpS5W5L.ZpBGe2uQfcn8, P05cfTpS5W5L2.ZpBGe2uQfcn8);
                if (compare != 0) {
                    return compare;
                }
                int compare2 = java.lang.Float.compare(P05cfTpS5W5L.giKS3J6vZuNy, P05cfTpS5W5L2.giKS3J6vZuNy);
                if (compare2 != 0) {
                    return compare2;
                }
                int compare3 = java.lang.Float.compare(P05cfTpS5W5L.JhCgjQRTAOCT, P05cfTpS5W5L2.JhCgjQRTAOCT);
                return compare3 != 0 ? compare3 : java.lang.Float.compare(P05cfTpS5W5L.fWTAfUmVKrZq, P05cfTpS5W5L2.fWTAfUmVKrZq);
            case 2:
                defpackage.jd0 jd0Var = (defpackage.jd0) obj;
                defpackage.jd0 jd0Var2 = (defpackage.jd0) obj2;
                int fNwYGHIYeJcR = defpackage.ma0.fNwYGHIYeJcR(jd0Var2.BHfvd2J71qpO, jd0Var.BHfvd2J71qpO);
                return fNwYGHIYeJcR != 0 ? fNwYGHIYeJcR : defpackage.ma0.fNwYGHIYeJcR(jd0Var.hashCode(), jd0Var2.hashCode());
            case 3:
                defpackage.s31 P05cfTpS5W5L3 = ((defpackage.jb1) obj).P05cfTpS5W5L();
                defpackage.s31 P05cfTpS5W5L4 = ((defpackage.jb1) obj2).P05cfTpS5W5L();
                int compare4 = java.lang.Float.compare(P05cfTpS5W5L4.fWTAfUmVKrZq, P05cfTpS5W5L3.fWTAfUmVKrZq);
                if (compare4 != 0) {
                    return compare4;
                }
                int compare5 = java.lang.Float.compare(P05cfTpS5W5L3.giKS3J6vZuNy, P05cfTpS5W5L4.giKS3J6vZuNy);
                if (compare5 != 0) {
                    return compare5;
                }
                int compare6 = java.lang.Float.compare(P05cfTpS5W5L3.JhCgjQRTAOCT, P05cfTpS5W5L4.JhCgjQRTAOCT);
                return compare6 != 0 ? compare6 : java.lang.Float.compare(P05cfTpS5W5L4.ZpBGe2uQfcn8, P05cfTpS5W5L3.ZpBGe2uQfcn8);
            case 4:
                defpackage.bw0 bw0Var = (defpackage.bw0) obj;
                defpackage.bw0 bw0Var2 = (defpackage.bw0) obj2;
                int compare7 = java.lang.Float.compare(((defpackage.s31) bw0Var.WDYagTQQm9ns).giKS3J6vZuNy, ((defpackage.s31) bw0Var2.WDYagTQQm9ns).giKS3J6vZuNy);
                return compare7 != 0 ? compare7 : java.lang.Float.compare(((defpackage.s31) bw0Var.WDYagTQQm9ns).JhCgjQRTAOCT, ((defpackage.s31) bw0Var2.WDYagTQQm9ns).JhCgjQRTAOCT);
            case 5:
                return java.lang.Integer.valueOf(((defpackage.k6) obj).giKS3J6vZuNy).compareTo(java.lang.Integer.valueOf(((defpackage.k6) obj2).giKS3J6vZuNy));
            case 6:
                return java.lang.Integer.valueOf(((defpackage.k6) obj).giKS3J6vZuNy).compareTo(java.lang.Integer.valueOf(((defpackage.k6) obj2).giKS3J6vZuNy));
            case 7:
                defpackage.jd0 jd0Var3 = (defpackage.jd0) obj;
                defpackage.jd0 jd0Var4 = (defpackage.jd0) obj2;
                int fNwYGHIYeJcR2 = defpackage.ma0.fNwYGHIYeJcR(jd0Var3.BHfvd2J71qpO, jd0Var4.BHfvd2J71qpO);
                return fNwYGHIYeJcR2 != 0 ? fNwYGHIYeJcR2 : defpackage.ma0.fNwYGHIYeJcR(jd0Var3.hashCode(), jd0Var4.hashCode());
            case 8:
                return defpackage.vx1.XntWc4eZSQ8j((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
            case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                return defpackage.vx1.XntWc4eZSQ8j((java.lang.Integer) ((java.util.Map.Entry) obj).getKey(), (java.lang.Integer) ((java.util.Map.Entry) obj2).getKey());
            case defpackage.n70.giKS3J6vZuNy /* 10 */:
                return defpackage.vx1.XntWc4eZSQ8j(((defpackage.yi1) obj).ZpBGe2uQfcn8, ((defpackage.yi1) obj2).ZpBGe2uQfcn8);
            default:
                return defpackage.vx1.XntWc4eZSQ8j(((defpackage.aj1) obj).ZpBGe2uQfcn8, ((defpackage.aj1) obj2).ZpBGe2uQfcn8);
        }
    }
}
