package defpackage;

/* loaded from: classes.dex */
public final class zb implements defpackage.iw {
    public final /* synthetic */ java.lang.Object AARZUJiTa;
    public final /* synthetic */ java.lang.Object EXtogiMhuM;
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object riuEU0zW4;
    public final /* synthetic */ java.io.Serializable xiZrDbcSW0;

    public zb(defpackage.rz0 rz0Var, defpackage.iw iwVar, java.lang.String[] strArr, int[] iArr) {
        this.adDC3e2L = 2;
        this.xiZrDbcSW0 = rz0Var;
        this.riuEU0zW4 = iwVar;
        this.AARZUJiTa = strArr;
        this.EXtogiMhuM = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00cc  */
    @Override // defpackage.iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EXtogiMhuM(java.lang.Object obj, defpackage.ej ejVar) {
        defpackage.yb ybVar;
        int i;
        int i2 = this.adDC3e2L;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        boolean z = true;
        java.io.Serializable serializable = this.xiZrDbcSW0;
        switch (i2) {
            case 0:
                if (ejVar instanceof defpackage.yb) {
                    ybVar = (defpackage.yb) ejVar;
                    int i3 = ybVar.JlrlGoKF;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        ybVar.JlrlGoKF = i3 - Integer.MIN_VALUE;
                        java.lang.Object obj2 = ybVar.SH1y5HwkJhh;
                        i = ybVar.JlrlGoKF;
                        if (i != 0) {
                            defpackage.f70.nBH8hAHy(obj2);
                            defpackage.u80 u80Var = (defpackage.u80) ((defpackage.rz0) serializable).adDC3e2L;
                            if (u80Var != null) {
                                u80Var.F7NU4MC0GW(new defpackage.gc("Child of the scoped flow was cancelled"));
                                ybVar.EXtogiMhuM = this;
                                ybVar.riuEU0zW4 = obj;
                                ybVar.JlrlGoKF = 1;
                                java.lang.Object C0U8sNJm = u80Var.C0U8sNJm(ybVar);
                                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                                if (C0U8sNJm == vjVar) {
                                    return vjVar;
                                }
                            }
                        } else {
                            if (i != 1) {
                                defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            obj = ybVar.riuEU0zW4;
                            this = ybVar.EXtogiMhuM;
                            defpackage.f70.nBH8hAHy(obj2);
                        }
                        ((defpackage.rz0) this.xiZrDbcSW0).adDC3e2L = defpackage.fm.SiPhmbmu((defpackage.uj) this.AARZUJiTa, null, new defpackage.xb((defpackage.ac) this.EXtogiMhuM, (defpackage.iw) this.riuEU0zW4, obj, null), 1);
                        return ok1Var;
                    }
                }
                ybVar = new defpackage.yb(this, ejVar);
                java.lang.Object obj22 = ybVar.SH1y5HwkJhh;
                i = ybVar.JlrlGoKF;
                if (i != 0) {
                }
                ((defpackage.rz0) this.xiZrDbcSW0).adDC3e2L = defpackage.fm.SiPhmbmu((defpackage.uj) this.AARZUJiTa, null, new defpackage.xb((defpackage.ac) this.EXtogiMhuM, (defpackage.iw) this.riuEU0zW4, obj, null), 1);
                return ok1Var;
            case 1:
                defpackage.l70 l70Var = (defpackage.l70) obj;
                defpackage.pz0 pz0Var = (defpackage.pz0) this.EXtogiMhuM;
                defpackage.pz0 pz0Var2 = (defpackage.pz0) this.AARZUJiTa;
                defpackage.pz0 pz0Var3 = (defpackage.pz0) serializable;
                if (l70Var instanceof defpackage.px0) {
                    pz0Var3.adDC3e2L++;
                } else if (l70Var instanceof defpackage.qx0) {
                    pz0Var3.adDC3e2L--;
                } else if (l70Var instanceof defpackage.ox0) {
                    pz0Var3.adDC3e2L--;
                } else if (l70Var instanceof defpackage.l40) {
                    pz0Var2.adDC3e2L++;
                } else if (l70Var instanceof defpackage.m40) {
                    pz0Var2.adDC3e2L--;
                } else if (l70Var instanceof defpackage.tx) {
                    pz0Var.adDC3e2L++;
                } else if (l70Var instanceof defpackage.ux) {
                    pz0Var.adDC3e2L--;
                }
                int i4 = pz0Var3.adDC3e2L;
                boolean z2 = false;
                boolean z3 = i4 > 0;
                boolean z4 = pz0Var2.adDC3e2L > 0;
                boolean z5 = pz0Var.adDC3e2L > 0;
                defpackage.km kmVar = (defpackage.km) this.riuEU0zW4;
                if (kmVar.fnWB2E7cs != z3) {
                    kmVar.fnWB2E7cs = z3;
                    z2 = true;
                }
                if (kmVar.kNAkVymC != z4) {
                    kmVar.kNAkVymC = z4;
                    z2 = true;
                }
                if (kmVar.V7bD7b8KA != z5) {
                    kmVar.V7bD7b8KA = z5;
                } else {
                    z = z2;
                }
                if (z) {
                    defpackage.fm.D2vUnMij(kmVar);
                }
                return ok1Var;
            default:
                return IHQe1A4L2xu((int[]) obj, ejVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
    
        if (r1.EXtogiMhuM(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0097, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0095, code lost:
    
        if (r1.EXtogiMhuM(r13, r3) == r4) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public java.lang.Object IHQe1A4L2xu(int[] iArr, defpackage.ej ejVar) {
        defpackage.dj1 dj1Var;
        int i;
        java.lang.String[] strArr = (java.lang.String[]) this.AARZUJiTa;
        defpackage.iw iwVar = (defpackage.iw) this.riuEU0zW4;
        defpackage.rz0 rz0Var = (defpackage.rz0) this.xiZrDbcSW0;
        if (ejVar instanceof defpackage.dj1) {
            dj1Var = (defpackage.dj1) ejVar;
            int i2 = dj1Var.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                dj1Var.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = dj1Var.riuEU0zW4;
                i = dj1Var.ez2rX8ReCYw;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    java.lang.Object obj2 = rz0Var.adDC3e2L;
                    defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                    if (obj2 == null) {
                        java.util.Set sJNB7mCer5 = defpackage.t6.sJNB7mCer5(strArr);
                        dj1Var.EXtogiMhuM = iArr;
                        dj1Var.ez2rX8ReCYw = 1;
                    } else {
                        int[] iArr2 = (int[]) this.EXtogiMhuM;
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        int length = strArr.length;
                        int i3 = 0;
                        int i4 = 0;
                        while (i3 < length) {
                            java.lang.String str = strArr[i3];
                            int i5 = i4 + 1;
                            java.lang.Object obj3 = rz0Var.adDC3e2L;
                            if (obj3 == null) {
                                defpackage.db.AARZUJiTa("Required value was null.");
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
                            java.util.Set FisHbM7NmV = defpackage.td.FisHbM7NmV(arrayList);
                            dj1Var.EXtogiMhuM = iArr;
                            dj1Var.ez2rX8ReCYw = 2;
                        }
                    }
                } else {
                    if (i != 1 && i != 2) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    iArr = dj1Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                }
                rz0Var.adDC3e2L = iArr;
                return defpackage.ok1.IHQe1A4L2xu;
            }
        }
        dj1Var = new defpackage.dj1(this, ejVar);
        java.lang.Object obj4 = dj1Var.riuEU0zW4;
        i = dj1Var.ez2rX8ReCYw;
        if (i != 0) {
        }
        rz0Var.adDC3e2L = iArr;
        return defpackage.ok1.IHQe1A4L2xu;
    }

    public /* synthetic */ zb(java.io.Serializable serializable, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, int i) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = serializable;
        this.AARZUJiTa = obj;
        this.EXtogiMhuM = obj2;
        this.riuEU0zW4 = obj3;
    }
}
