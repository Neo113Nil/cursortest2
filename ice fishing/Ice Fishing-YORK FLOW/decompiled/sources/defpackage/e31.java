package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class e31 implements defpackage.y10 {
    public final /* synthetic */ java.lang.Object P05cfTpS5W5L;
    public final /* synthetic */ java.lang.Object QiMR8OkAhezm;
    public final /* synthetic */ int WDYagTQQm9ns;
    public final /* synthetic */ int oh71FJcDz6S2;

    public /* synthetic */ e31(defpackage.st1 st1Var, defpackage.ry0 ry0Var, int i) {
        this.WDYagTQQm9ns = 2;
        this.QiMR8OkAhezm = st1Var;
        this.P05cfTpS5W5L = ry0Var;
        this.oh71FJcDz6S2 = i;
    }

    @Override // defpackage.y10
    public final java.lang.Object P05cfTpS5W5L(java.lang.Object obj) {
        defpackage.fj fjVar;
        defpackage.gs1 gs1Var;
        defpackage.fj fjVar2;
        defpackage.gs1 gs1Var2;
        int i;
        int i2 = this.WDYagTQQm9ns;
        defpackage.gs1 gs1Var3 = defpackage.gs1.ZpBGe2uQfcn8;
        int i3 = 0;
        int i4 = this.oh71FJcDz6S2;
        java.lang.Object obj2 = this.P05cfTpS5W5L;
        java.lang.Object obj3 = this.QiMR8OkAhezm;
        switch (i2) {
            case 0:
                defpackage.f31 f31Var = (defpackage.f31) obj3;
                defpackage.on0 on0Var = (defpackage.on0) obj2;
                defpackage.fj fjVar3 = (defpackage.fj) obj;
                if (f31Var.WDYagTQQm9ns == i4 && defpackage.ma0.QiMR8OkAhezm(on0Var, f31Var.oh71FJcDz6S2) && (fjVar3 instanceof defpackage.lj)) {
                    long[] jArr = on0Var.ZpBGe2uQfcn8;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j = jArr[i5];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i6 = 8;
                                int i7 = 8 - ((~(i5 - length)) >>> 31);
                                int i8 = i3;
                                while (i8 < i7) {
                                    if ((255 & j) < 128) {
                                        int i9 = (i5 << 3) + i8;
                                        java.lang.Object obj4 = on0Var.giKS3J6vZuNy[i9];
                                        boolean z = on0Var.fWTAfUmVKrZq[i9] != i4;
                                        if (z) {
                                            i = i6;
                                            defpackage.lj ljVar = (defpackage.lj) fjVar3;
                                            fjVar2 = fjVar3;
                                            defpackage.yn0 yn0Var = ljVar.Ns0WNyEWdPsk;
                                            defpackage.j80.frSwwKIlbUhK(yn0Var, obj4, f31Var);
                                            gs1Var2 = gs1Var3;
                                            if (obj4 instanceof defpackage.qp) {
                                                defpackage.qp qpVar = (defpackage.qp) obj4;
                                                if (!yn0Var.fWTAfUmVKrZq(qpVar)) {
                                                    defpackage.j80.KrtOTfE6jiS2(ljVar.gUjdnLbkVAaA, qpVar);
                                                }
                                                defpackage.yn0 yn0Var2 = f31Var.QiMR8OkAhezm;
                                                if (yn0Var2 != null) {
                                                    yn0Var2.Ns0WNyEWdPsk(obj4);
                                                }
                                            }
                                        } else {
                                            fjVar2 = fjVar3;
                                            gs1Var2 = gs1Var3;
                                            i = i6;
                                        }
                                        if (z) {
                                            on0Var.oh71FJcDz6S2(i9);
                                        }
                                    } else {
                                        fjVar2 = fjVar3;
                                        gs1Var2 = gs1Var3;
                                        i = i6;
                                    }
                                    j >>= i;
                                    i8++;
                                    i6 = i;
                                    fjVar3 = fjVar2;
                                    gs1Var3 = gs1Var2;
                                }
                                fjVar = fjVar3;
                                gs1Var = gs1Var3;
                                if (i7 != i6) {
                                    break;
                                }
                            } else {
                                fjVar = fjVar3;
                                gs1Var = gs1Var3;
                            }
                            if (i5 == length) {
                                break;
                            } else {
                                i5++;
                                fjVar3 = fjVar;
                                gs1Var3 = gs1Var;
                                i3 = 0;
                            }
                        }
                    }
                }
                break;
            case 1:
                defpackage.y81 y81Var = (defpackage.y81) obj3;
                defpackage.ry0 ry0Var = (defpackage.ry0) obj2;
                defpackage.qy0 qy0Var = (defpackage.qy0) obj;
                int P05cfTpS5W5L = y81Var.BHfvd2J71qpO.ZpBGe2uQfcn8.P05cfTpS5W5L();
                if (P05cfTpS5W5L < 0) {
                    P05cfTpS5W5L = 0;
                }
                if (P05cfTpS5W5L <= i4) {
                    i4 = P05cfTpS5W5L;
                }
                int i10 = -i4;
                boolean z2 = y81Var.ZVVdXbWmyCSK;
                int i11 = z2 ? 0 : i10;
                if (!z2) {
                    i10 = 0;
                }
                qy0Var.WDYagTQQm9ns = true;
                defpackage.qy0.Ns0WNyEWdPsk(qy0Var, ry0Var, i11, i10);
                qy0Var.WDYagTQQm9ns = false;
                break;
            default:
                defpackage.st1 st1Var = (defpackage.st1) obj3;
                defpackage.ry0 ry0Var2 = (defpackage.ry0) obj2;
                defpackage.qy0 qy0Var2 = (defpackage.qy0) obj;
                int i12 = st1Var.giKS3J6vZuNy;
                defpackage.vl1 vl1Var = st1Var.ZpBGe2uQfcn8;
                defpackage.ap1 ap1Var = st1Var.fWTAfUmVKrZq;
                defpackage.cn1 cn1Var = (defpackage.cn1) st1Var.JhCgjQRTAOCT.ZpBGe2uQfcn8();
                vl1Var.ZpBGe2uQfcn8(defpackage.fv0.WDYagTQQm9ns, defpackage.w60.P05cfTpS5W5L(qy0Var2, i12, ap1Var, cn1Var != null ? cn1Var.ZpBGe2uQfcn8 : null, false, ry0Var2.WDYagTQQm9ns), i4, ry0Var2.oh71FJcDz6S2);
                defpackage.qy0.GE9mJIPrb8gP(qy0Var2, ry0Var2, 0, java.lang.Math.round(-vl1Var.ZpBGe2uQfcn8.P05cfTpS5W5L()));
                break;
        }
        return gs1Var3;
    }

    public /* synthetic */ e31(int i, int i2, java.lang.Object obj, java.lang.Object obj2) {
        this.WDYagTQQm9ns = i2;
        this.QiMR8OkAhezm = obj;
        this.oh71FJcDz6S2 = i;
        this.P05cfTpS5W5L = obj2;
    }
}
