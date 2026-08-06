package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class m0 extends defpackage.v00 implements defpackage.vz {
    public final /* synthetic */ int JlrlGoKF;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.JlrlGoKF = i4;
    }

    @Override // defpackage.vz
    public final java.lang.Object IHQe1A4L2xu() {
        android.view.contentcapture.ContentCaptureSession IHQe1A4L2xu;
        defpackage.ep0 ep0Var;
        int i = this.JlrlGoKF;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj = this.xiZrDbcSW0;
        switch (i) {
            case 0:
                android.view.View view = (android.view.View) obj;
                int i2 = android.os.Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    defpackage.OtkytngK3Mr.xiZrDbcSW0(view);
                }
                if (i2 < 29 || (IHQe1A4L2xu = defpackage.ri.IHQe1A4L2xu(view)) == null) {
                    return null;
                }
                return new defpackage.F7NU4MC0GW(5, IHQe1A4L2xu, view);
            case 1:
                defpackage.wx wxVar = (defpackage.wx) obj;
                defpackage.ol0 ol0Var = wxVar.r1MBDhnF;
                defpackage.ol0 ol0Var2 = wxVar.F7NU4MC0GW;
                defpackage.cy cyVar = wxVar.IHQe1A4L2xu;
                defpackage.gy xiZrDbcSW0 = cyVar.xiZrDbcSW0();
                if (xiZrDbcSW0 == null) {
                    java.lang.Object[] objArr = ol0Var2.oh6vYeIP;
                    long[] jArr = ol0Var2.IHQe1A4L2xu;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((defpackage.u7) objArr[(i3 << 3) + i5]).H6IrRhrpWoH();
                                        throw null;
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                            }
                        }
                    }
                } else if (xiZrDbcSW0.kd6TUFXn) {
                    if (ol0Var.r1MBDhnF(xiZrDbcSW0)) {
                        xiZrDbcSW0.xp7x2U2iUl();
                    }
                    xiZrDbcSW0.fzubgBFo();
                    if (!xiZrDbcSW0.adDC3e2L.kd6TUFXn) {
                        defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
                    }
                    defpackage.lj0 lj0Var = xiZrDbcSW0.adDC3e2L;
                    defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(xiZrDbcSW0);
                    int i6 = 0;
                    while (D2vUnMij != null) {
                        if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 5120) != 0) {
                            while (lj0Var != null) {
                                int i7 = lj0Var.AARZUJiTa;
                                if ((i7 & 5120) != 0) {
                                    if ((i7 & 1024) != 0) {
                                        i6++;
                                    }
                                    if ((lj0Var instanceof defpackage.u7) && ol0Var2.r1MBDhnF(lj0Var)) {
                                        if (i6 <= 1) {
                                            ((defpackage.u7) lj0Var).H6IrRhrpWoH();
                                            throw null;
                                        }
                                        ((defpackage.u7) lj0Var).H6IrRhrpWoH();
                                        throw null;
                                    }
                                }
                                lj0Var = lj0Var.riuEU0zW4;
                            }
                        }
                        D2vUnMij = D2vUnMij.V7bD7b8KA();
                        lj0Var = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
                    }
                    java.lang.Object[] objArr2 = ol0Var2.oh6vYeIP;
                    long[] jArr2 = ol0Var2.IHQe1A4L2xu;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i8 = 0;
                        while (true) {
                            long j2 = jArr2[i8];
                            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                for (int i10 = 0; i10 < i9; i10++) {
                                    if ((j2 & 255) < 128) {
                                        ((defpackage.u7) objArr2[(i8 << 3) + i10]).H6IrRhrpWoH();
                                        throw null;
                                    }
                                    j2 >>= 8;
                                }
                                if (i9 != 8) {
                                }
                            }
                            if (i8 != length2) {
                                i8++;
                            }
                        }
                    }
                }
                if (cyVar.xiZrDbcSW0() == null || cyVar.r1MBDhnF.fzubgBFo() == defpackage.fy.AARZUJiTa) {
                    cyVar.r1MBDhnF();
                }
                ol0Var.oh6vYeIP();
                ol0Var2.oh6vYeIP();
                wxVar.adDC3e2L = false;
                return ok1Var;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                return java.lang.Boolean.valueOf(((defpackage.jy) obj).QQUzIjv3iOC5.XkvoyZRg(7));
            default:
                defpackage.q21 q21Var = (defpackage.q21) obj;
                defpackage.dj djVar = q21Var.IHQe1A4L2xu;
                if (djVar == null) {
                    defpackage.x70.Ye0N2xE9Hc("coroutineScope");
                    throw null;
                }
                defpackage.h1.G3OKOH3wZRC(djVar, null);
                q21Var.adDC3e2L();
                defpackage.o21 o21Var = q21Var.adDC3e2L;
                if (o21Var == null) {
                    defpackage.x70.Ye0N2xE9Hc("connectionManager");
                    throw null;
                }
                o21Var.xiZrDbcSW0.close();
                defpackage.nd1 nd1Var = o21Var.AARZUJiTa;
                if (nd1Var != null) {
                    nd1Var.close();
                }
                return ok1Var;
        }
    }
}
