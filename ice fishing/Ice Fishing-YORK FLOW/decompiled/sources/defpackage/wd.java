package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class wd implements defpackage.ux {
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ java.lang.Object e6mdH7fiFuta;
    public final /* synthetic */ java.lang.Object oh71FJcDz6S2;

    public wd(defpackage.z31 z31Var, defpackage.ux uxVar, java.lang.String[] strArr, int[] iArr) {
        this.WDYagTQQm9ns = 3;
        this.oh71FJcDz6S2 = z31Var;
        this.e6mdH7fiFuta = uxVar;
        this.QiMR8OkAhezm = strArr;
        this.P05cfTpS5W5L = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.fNwYGHIYeJcR(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r1.fNwYGHIYeJcR(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object ZpBGe2uQfcn8(int[] iArr, defpackage.kl klVar) {
        defpackage.aq1 aq1Var;
        int i;
        java.lang.String[] strArr = (java.lang.String[]) this.QiMR8OkAhezm;
        defpackage.ux uxVar = (defpackage.ux) this.e6mdH7fiFuta;
        defpackage.z31 z31Var = (defpackage.z31) this.oh71FJcDz6S2;
        if (klVar instanceof defpackage.aq1) {
            aq1Var = (defpackage.aq1) klVar;
            int i2 = aq1Var.Ns0WNyEWdPsk;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aq1Var.Ns0WNyEWdPsk = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = aq1Var.e6mdH7fiFuta;
                i = aq1Var.Ns0WNyEWdPsk;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    java.lang.Object obj2 = z31Var.WDYagTQQm9ns;
                    defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                    if (obj2 == null) {
                        java.util.Set XuMcJunjB8iA = defpackage.y7.XuMcJunjB8iA(strArr);
                        aq1Var.P05cfTpS5W5L = iArr;
                        aq1Var.Ns0WNyEWdPsk = 1;
                    } else {
                        int[] iArr2 = (int[]) this.P05cfTpS5W5L;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            java.lang.String str = strArr[i3];
                            int i5 = i4 + 1;
                            java.lang.Object obj3 = z31Var.WDYagTQQm9ns;
                            if (obj3 == null) {
                                defpackage.h7.P05cfTpS5W5L("Required value was null.");
                                return null;
                            }
                            int i6 = iArr2[i4];
                            if (((int[]) obj3)[i6] != iArr[i6]) {
                                arrayList.add(str);
                            }
                            i3++;
                            i4 = i5;
                        }
                        if (!arrayList.isEmpty()) {
                            java.util.Set RIHPIrzkudeW = defpackage.hf.RIHPIrzkudeW(arrayList);
                            aq1Var.P05cfTpS5W5L = iArr;
                            aq1Var.Ns0WNyEWdPsk = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iArr = aq1Var.P05cfTpS5W5L;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                z31Var.WDYagTQQm9ns = iArr;
                return defpackage.gs1.ZpBGe2uQfcn8;
            }
        }
        aq1Var = new defpackage.aq1(this, klVar);
        java.lang.Object obj4 = aq1Var.e6mdH7fiFuta;
        i = aq1Var.Ns0WNyEWdPsk;
        if (i != 0) {
        }
        z31Var.WDYagTQQm9ns = iArr;
        return defpackage.gs1.ZpBGe2uQfcn8;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f0  */
    @Override // defpackage.ux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object fNwYGHIYeJcR(java.lang.Object obj, defpackage.kl klVar) {
        defpackage.vd vdVar;
        int i;
        int i2 = this.WDYagTQQm9ns;
        java.lang.Object obj2 = this.e6mdH7fiFuta;
        boolean z = true;
        java.lang.Object obj3 = this.QiMR8OkAhezm;
        java.lang.Object obj4 = this.P05cfTpS5W5L;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj5 = this.oh71FJcDz6S2;
        switch (i2) {
            case 0:
                if (klVar instanceof defpackage.vd) {
                    vdVar = (defpackage.vd) klVar;
                    int i3 = vdVar.fNwYGHIYeJcR;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        vdVar.fNwYGHIYeJcR = i3 - Integer.MIN_VALUE;
                        java.lang.Object obj6 = vdVar.GE9mJIPrb8gP;
                        i = vdVar.fNwYGHIYeJcR;
                        if (i != 0) {
                            defpackage.b80.KrtOTfE6jiS2(obj6);
                            defpackage.cb0 cb0Var = (defpackage.cb0) ((defpackage.z31) obj5).WDYagTQQm9ns;
                            if (cb0Var != null) {
                                cb0Var.JhCgjQRTAOCT(new defpackage.ge("Child of the scoped flow was cancelled"));
                                vdVar.P05cfTpS5W5L = this;
                                vdVar.e6mdH7fiFuta = obj;
                                vdVar.fNwYGHIYeJcR = 1;
                                java.lang.Object OcTWLQzke1i2 = cb0Var.OcTWLQzke1i2(vdVar);
                                defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                                if (OcTWLQzke1i2 == tmVar) {
                                    return tmVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = vdVar.e6mdH7fiFuta;
                            this = vdVar.P05cfTpS5W5L;
                            defpackage.b80.KrtOTfE6jiS2(obj6);
                        }
                        ((defpackage.z31) this.oh71FJcDz6S2).WDYagTQQm9ns = defpackage.ok0.zJPqDeoF0Os1((defpackage.sm) this.QiMR8OkAhezm, null, new defpackage.ud((defpackage.xd) this.P05cfTpS5W5L, (defpackage.ux) this.e6mdH7fiFuta, obj, null), 1);
                        return gs1Var;
                    }
                }
                vdVar = new defpackage.vd(this, klVar);
                java.lang.Object obj62 = vdVar.GE9mJIPrb8gP;
                i = vdVar.fNwYGHIYeJcR;
                if (i != 0) {
                }
                ((defpackage.z31) this.oh71FJcDz6S2).WDYagTQQm9ns = defpackage.ok0.zJPqDeoF0Os1((defpackage.sm) this.QiMR8OkAhezm, null, new defpackage.ud((defpackage.xd) this.P05cfTpS5W5L, (defpackage.ux) this.e6mdH7fiFuta, obj, null), 1);
                return gs1Var;
            case 1:
                defpackage.em1 em1Var = (defpackage.em1) obj4;
                defpackage.hg0 hg0Var = (defpackage.hg0) obj5;
                if (((java.lang.Boolean) obj).booleanValue() && hg0Var.giKS3J6vZuNy()) {
                    defpackage.nq1.z16KqenTjq8o((defpackage.sm1) obj3, hg0Var, em1Var.gUjdnLbkVAaA(), (defpackage.o60) obj2, em1Var.giKS3J6vZuNy);
                } else {
                    defpackage.nq1.UmgHb6n58gfG(hg0Var);
                }
                return gs1Var;
            case 2:
                defpackage.w90 w90Var = (defpackage.w90) obj;
                defpackage.x31 x31Var = (defpackage.x31) obj4;
                defpackage.x31 x31Var2 = (defpackage.x31) obj3;
                defpackage.x31 x31Var3 = (defpackage.x31) obj5;
                if (w90Var instanceof defpackage.u11) {
                    x31Var3.WDYagTQQm9ns++;
                } else if (w90Var instanceof defpackage.v11) {
                    x31Var3.WDYagTQQm9ns--;
                } else if (w90Var instanceof defpackage.t11) {
                    x31Var3.WDYagTQQm9ns--;
                } else if (w90Var instanceof defpackage.t50) {
                    x31Var2.WDYagTQQm9ns++;
                } else if (w90Var instanceof defpackage.u50) {
                    x31Var2.WDYagTQQm9ns--;
                } else if (w90Var instanceof defpackage.yy) {
                    x31Var.WDYagTQQm9ns++;
                } else if (w90Var instanceof defpackage.zy) {
                    x31Var.WDYagTQQm9ns--;
                }
                boolean z2 = false;
                boolean z3 = x31Var3.WDYagTQQm9ns > 0;
                boolean z4 = x31Var2.WDYagTQQm9ns > 0;
                boolean z5 = x31Var.WDYagTQQm9ns > 0;
                defpackage.rn rnVar = (defpackage.rn) obj2;
                if (rnVar.ZVVdXbWmyCSK != z3) {
                    rnVar.ZVVdXbWmyCSK = z3;
                    z2 = true;
                }
                if (rnVar.w7APNrr0aGRc != z4) {
                    rnVar.w7APNrr0aGRc = z4;
                    z2 = true;
                }
                if (rnVar.maCixPsq4ml2 != z5) {
                    rnVar.maCixPsq4ml2 = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    defpackage.nq1.KrtOTfE6jiS2(rnVar);
                }
                return gs1Var;
            default:
                return ZpBGe2uQfcn8((int[]) obj, klVar);
        }
    }

    public /* synthetic */ wd(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4, int i) {
        this.WDYagTQQm9ns = i;
        this.oh71FJcDz6S2 = obj;
        this.QiMR8OkAhezm = obj2;
        this.P05cfTpS5W5L = obj3;
        this.e6mdH7fiFuta = obj4;
    }
}
