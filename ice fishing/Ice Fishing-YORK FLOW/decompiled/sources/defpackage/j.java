package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final /* synthetic */ class j extends defpackage.n20 implements defpackage.n10 {
    public final /* synthetic */ int fNwYGHIYeJcR;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(int i, java.lang.Object obj, java.lang.Class cls, java.lang.String str, java.lang.String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.fNwYGHIYeJcR = i4;
    }

    @Override // defpackage.n10
    public final java.lang.Object ZpBGe2uQfcn8() {
        android.view.contentcapture.ContentCaptureSession ZpBGe2uQfcn8;
        defpackage.zn0 zn0Var;
        defpackage.or0 or0Var;
        boolean JtSMNguZxnYf;
        int i = this.fNwYGHIYeJcR;
        defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
        java.lang.Object obj = this.oh71FJcDz6S2;
        switch (i) {
            case 0:
                android.view.View view = (android.view.View) obj;
                int i2 = android.os.Build.VERSION.SDK_INT;
                if (i2 >= 30) {
                    defpackage.omM9cAlgeGXx.oh71FJcDz6S2(view);
                }
                if (i2 < 29 || (ZpBGe2uQfcn8 = defpackage.rk.ZpBGe2uQfcn8(view)) == null) {
                    return null;
                }
                return new defpackage.n80(ZpBGe2uQfcn8, view);
            case 1:
                return ((defpackage.bk1) obj).Hx18F4M3RgD4();
            case 2:
                defpackage.bz bzVar = (defpackage.bz) obj;
                defpackage.zn0 zn0Var2 = bzVar.fWTAfUmVKrZq;
                defpackage.zn0 zn0Var3 = bzVar.JhCgjQRTAOCT;
                defpackage.gz gzVar = bzVar.ZpBGe2uQfcn8;
                defpackage.nz oh71FJcDz6S2 = gzVar.oh71FJcDz6S2();
                defpackage.mz mzVar = defpackage.mz.QiMR8OkAhezm;
                if (oh71FJcDz6S2 == null) {
                    java.lang.Object[] objArr = zn0Var3.giKS3J6vZuNy;
                    long[] jArr = zn0Var3.ZpBGe2uQfcn8;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i3 = 0;
                        while (true) {
                            long j = jArr[i3];
                            zn0Var = zn0Var3;
                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i4 = 8 - ((~(i3 - length)) >>> 31);
                                for (int i5 = 0; i5 < i4; i5++) {
                                    if ((j & 255) < 128) {
                                        ((defpackage.xy) objArr[(i3 << 3) + i5]).z16KqenTjq8o(mzVar);
                                    }
                                    j >>= 8;
                                }
                                if (i4 != 8) {
                                }
                            }
                            if (i3 != length) {
                                i3++;
                                zn0Var3 = zn0Var;
                            }
                        }
                    } else {
                        zn0Var = zn0Var3;
                    }
                } else {
                    zn0Var = zn0Var3;
                    if (oh71FJcDz6S2.s0TASMVLSWD5) {
                        if (zn0Var2.fWTAfUmVKrZq(oh71FJcDz6S2)) {
                            oh71FJcDz6S2.VpXebusPOq9I();
                        }
                        defpackage.mz iYH9ueRbBBFm = oh71FJcDz6S2.iYH9ueRbBBFm();
                        if (!oh71FJcDz6S2.WDYagTQQm9ns.s0TASMVLSWD5) {
                            defpackage.e80.giKS3J6vZuNy("visitAncestors called on an unattached node");
                        }
                        defpackage.ul0 ul0Var = oh71FJcDz6S2.WDYagTQQm9ns;
                        defpackage.jd0 UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(oh71FJcDz6S2);
                        int i6 = 0;
                        while (UmgHb6n58gfG != null) {
                            if ((UmgHb6n58gfG.IBvW5fLsPuHy.oh71FJcDz6S2.P05cfTpS5W5L & 5120) != 0) {
                                while (ul0Var != null) {
                                    int i7 = ul0Var.QiMR8OkAhezm;
                                    if ((i7 & 5120) != 0) {
                                        if ((i7 & 1024) != 0) {
                                            i6++;
                                        }
                                        if ((ul0Var instanceof defpackage.xy) && zn0Var.fWTAfUmVKrZq(ul0Var)) {
                                            if (i6 <= 1) {
                                                ((defpackage.xy) ul0Var).z16KqenTjq8o(iYH9ueRbBBFm);
                                            } else {
                                                ((defpackage.xy) ul0Var).z16KqenTjq8o(defpackage.mz.oh71FJcDz6S2);
                                            }
                                            zn0Var.fNwYGHIYeJcR(ul0Var);
                                        }
                                    }
                                    ul0Var = ul0Var.e6mdH7fiFuta;
                                }
                            }
                            UmgHb6n58gfG = UmgHb6n58gfG.w7APNrr0aGRc();
                            ul0Var = (UmgHb6n58gfG == null || (or0Var = UmgHb6n58gfG.IBvW5fLsPuHy) == null) ? null : or0Var.WDYagTQQm9ns;
                        }
                        java.lang.Object[] objArr2 = zn0Var.giKS3J6vZuNy;
                        long[] jArr2 = zn0Var.ZpBGe2uQfcn8;
                        int length2 = jArr2.length - 2;
                        if (length2 >= 0) {
                            int i8 = 0;
                            while (true) {
                                long j2 = jArr2[i8];
                                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                    for (int i10 = 0; i10 < i9; i10++) {
                                        if ((j2 & 255) < 128) {
                                            ((defpackage.xy) objArr2[(i8 << 3) + i10]).z16KqenTjq8o(mzVar);
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
                }
                if (gzVar.oh71FJcDz6S2() == null || gzVar.fWTAfUmVKrZq.iYH9ueRbBBFm() == mzVar) {
                    gzVar.fWTAfUmVKrZq();
                }
                zn0Var2.giKS3J6vZuNy();
                zn0Var.giKS3J6vZuNy();
                bzVar.WDYagTQQm9ns = false;
                return gs1Var;
            case 3:
                JtSMNguZxnYf = ((defpackage.rz) obj).dG7RjM6DqYVL.JtSMNguZxnYf(7);
                return java.lang.Boolean.valueOf(JtSMNguZxnYf);
            case 4:
                ((defpackage.z50) obj).JhCgjQRTAOCT.setValue(null);
                return gs1Var;
            case 5:
                ((defpackage.bi0) obj).QiMR8OkAhezm.setValue(null);
                return gs1Var;
            case 6:
                defpackage.h61 h61Var = (defpackage.h61) obj;
                defpackage.jl jlVar = h61Var.ZpBGe2uQfcn8;
                if (jlVar == null) {
                    defpackage.ma0.hH0RRJrNssvh("coroutineScope");
                    throw null;
                }
                defpackage.ok0.BHfvd2J71qpO(jlVar, null);
                h61Var.JhCgjQRTAOCT();
                defpackage.f61 f61Var = h61Var.WDYagTQQm9ns;
                if (f61Var == null) {
                    defpackage.ma0.hH0RRJrNssvh("connectionManager");
                    throw null;
                }
                f61Var.oh71FJcDz6S2.close();
                defpackage.yh1 yh1Var = f61Var.QiMR8OkAhezm;
                if (yh1Var != null) {
                    yh1Var.close();
                }
                return gs1Var;
            default:
                ((defpackage.r71) obj).QiMR8OkAhezm.setValue(null);
                return gs1Var;
        }
    }
}
