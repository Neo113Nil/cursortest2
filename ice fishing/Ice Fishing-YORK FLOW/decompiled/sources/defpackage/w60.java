package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class w60 {
    public static defpackage.j60 ZpBGe2uQfcn8;

    public static final boolean BHfvd2J71qpO(long j, long j2) {
        return j == j2;
    }

    public static final java.util.ArrayList BXaznwstz2U0(java.util.Map map, defpackage.y10 y10Var) {
        map.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.wo0 wo0Var = (defpackage.wo0) entry.getValue();
            java.lang.Boolean valueOf = wo0Var != null ? java.lang.Boolean.valueOf(wo0Var.giKS3J6vZuNy) : null;
            valueOf.getClass();
            if (!valueOf.booleanValue() && !wo0Var.fWTAfUmVKrZq) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : keySet) {
            if (((java.lang.Boolean) y10Var.P05cfTpS5W5L((java.lang.String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final void CZa7MwI9IzLd(java.util.List list, defpackage.s2 s2Var) {
        android.graphics.Path path;
        int i;
        float f;
        int i2;
        defpackage.tx0 tx0Var;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        java.util.List list2 = list;
        android.graphics.Path path2 = s2Var.ZpBGe2uQfcn8;
        android.graphics.Path path3 = s2Var.ZpBGe2uQfcn8;
        android.graphics.Path.FillType fillType = path2.getFillType();
        android.graphics.Path.FillType fillType2 = android.graphics.Path.FillType.EVEN_ODD;
        boolean z = fillType == fillType2;
        path3.rewind();
        if (!z) {
            fillType2 = android.graphics.Path.FillType.WINDING;
        }
        path3.setFillType(fillType2);
        defpackage.tx0 tx0Var2 = list2.isEmpty() ? defpackage.bx0.fWTAfUmVKrZq : (defpackage.tx0) list2.get(0);
        int size = list2.size();
        float f10 = 0.0f;
        int i3 = 0;
        float f11 = 0.0f;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i3 < size) {
            defpackage.tx0 tx0Var3 = (defpackage.tx0) list2.get(i3);
            if (tx0Var3 instanceof defpackage.bx0) {
                path3.close();
                path = path3;
                i = size;
                f = f10;
                i2 = i3;
                tx0Var = tx0Var3;
                f11 = f15;
                f13 = f11;
                f12 = f16;
                f14 = f12;
            } else {
                if (tx0Var3 instanceof defpackage.nx0) {
                    defpackage.nx0 nx0Var = (defpackage.nx0) tx0Var3;
                    float f17 = nx0Var.fWTAfUmVKrZq;
                    f13 += f17;
                    float f18 = nx0Var.JhCgjQRTAOCT;
                    f14 += f18;
                    path3.rMoveTo(f17, f18);
                    path = path3;
                    i = size;
                    f = f10;
                    i2 = i3;
                    f15 = f13;
                    f16 = f14;
                } else {
                    if (tx0Var3 instanceof defpackage.fx0) {
                        defpackage.fx0 fx0Var = (defpackage.fx0) tx0Var3;
                        float f19 = fx0Var.fWTAfUmVKrZq;
                        float f20 = fx0Var.JhCgjQRTAOCT;
                        path3.moveTo(f19, f20);
                        f14 = f20;
                        f16 = f14;
                        path = path3;
                        f13 = f19;
                        f15 = f13;
                    } else {
                        if (tx0Var3 instanceof defpackage.mx0) {
                            defpackage.mx0 mx0Var = (defpackage.mx0) tx0Var3;
                            float f21 = mx0Var.JhCgjQRTAOCT;
                            float f22 = mx0Var.fWTAfUmVKrZq;
                            path3.rLineTo(f22, f21);
                            f13 += f22;
                            f14 += f21;
                        } else if (tx0Var3 instanceof defpackage.ex0) {
                            defpackage.ex0 ex0Var = (defpackage.ex0) tx0Var3;
                            float f23 = ex0Var.JhCgjQRTAOCT;
                            float f24 = ex0Var.fWTAfUmVKrZq;
                            path3.lineTo(f24, f23);
                            f13 = f24;
                            path = path3;
                            f14 = f23;
                        } else if (tx0Var3 instanceof defpackage.lx0) {
                            float f25 = ((defpackage.lx0) tx0Var3).fWTAfUmVKrZq;
                            path3.rLineTo(f25, f10);
                            f13 += f25;
                        } else if (tx0Var3 instanceof defpackage.dx0) {
                            float f26 = ((defpackage.dx0) tx0Var3).fWTAfUmVKrZq;
                            path3.lineTo(f26, f14);
                            f13 = f26;
                        } else {
                            if (tx0Var3 instanceof defpackage.rx0) {
                                f9 = ((defpackage.rx0) tx0Var3).fWTAfUmVKrZq;
                                path3.rLineTo(f10, f9);
                            } else if (tx0Var3 instanceof defpackage.sx0) {
                                float f27 = ((defpackage.sx0) tx0Var3).fWTAfUmVKrZq;
                                path3.lineTo(f13, f27);
                                f14 = f27;
                            } else if (tx0Var3 instanceof defpackage.kx0) {
                                defpackage.kx0 kx0Var = (defpackage.kx0) tx0Var3;
                                path3.rCubicTo(kx0Var.fWTAfUmVKrZq, kx0Var.JhCgjQRTAOCT, kx0Var.WDYagTQQm9ns, kx0Var.oh71FJcDz6S2, kx0Var.QiMR8OkAhezm, kx0Var.P05cfTpS5W5L);
                                f11 = kx0Var.WDYagTQQm9ns + f13;
                                f12 = kx0Var.oh71FJcDz6S2 + f14;
                                f13 += kx0Var.QiMR8OkAhezm;
                                f9 = kx0Var.P05cfTpS5W5L;
                            } else {
                                if (tx0Var3 instanceof defpackage.cx0) {
                                    defpackage.cx0 cx0Var = (defpackage.cx0) tx0Var3;
                                    path3.cubicTo(cx0Var.fWTAfUmVKrZq, cx0Var.JhCgjQRTAOCT, cx0Var.WDYagTQQm9ns, cx0Var.oh71FJcDz6S2, cx0Var.QiMR8OkAhezm, cx0Var.P05cfTpS5W5L);
                                    f11 = cx0Var.WDYagTQQm9ns;
                                    f12 = cx0Var.oh71FJcDz6S2;
                                    f5 = cx0Var.QiMR8OkAhezm;
                                    f6 = cx0Var.P05cfTpS5W5L;
                                } else if (tx0Var3 instanceof defpackage.px0) {
                                    if (tx0Var2.ZpBGe2uQfcn8) {
                                        f8 = f14 - f12;
                                        f7 = f13 - f11;
                                    } else {
                                        f7 = f10;
                                        f8 = f7;
                                    }
                                    defpackage.px0 px0Var = (defpackage.px0) tx0Var3;
                                    path3.rCubicTo(f7, f8, px0Var.fWTAfUmVKrZq, px0Var.JhCgjQRTAOCT, px0Var.WDYagTQQm9ns, px0Var.oh71FJcDz6S2);
                                    f11 = px0Var.fWTAfUmVKrZq + f13;
                                    f12 = px0Var.JhCgjQRTAOCT + f14;
                                    f13 += px0Var.WDYagTQQm9ns;
                                    f9 = px0Var.oh71FJcDz6S2;
                                } else if (tx0Var3 instanceof defpackage.hx0) {
                                    if (tx0Var2.ZpBGe2uQfcn8) {
                                        f13 = (f13 * 2.0f) - f11;
                                        f14 = (2.0f * f14) - f12;
                                    }
                                    defpackage.hx0 hx0Var = (defpackage.hx0) tx0Var3;
                                    path3.cubicTo(f13, f14, hx0Var.fWTAfUmVKrZq, hx0Var.JhCgjQRTAOCT, hx0Var.WDYagTQQm9ns, hx0Var.oh71FJcDz6S2);
                                    f11 = hx0Var.fWTAfUmVKrZq;
                                    f12 = hx0Var.JhCgjQRTAOCT;
                                    f5 = hx0Var.WDYagTQQm9ns;
                                    f6 = hx0Var.oh71FJcDz6S2;
                                } else if (tx0Var3 instanceof defpackage.ox0) {
                                    defpackage.ox0 ox0Var = (defpackage.ox0) tx0Var3;
                                    float f28 = ox0Var.oh71FJcDz6S2;
                                    float f29 = ox0Var.WDYagTQQm9ns;
                                    float f30 = ox0Var.JhCgjQRTAOCT;
                                    float f31 = ox0Var.fWTAfUmVKrZq;
                                    path3.rQuadTo(f31, f30, f29, f28);
                                    float f32 = f31 + f13;
                                    float f33 = f30 + f14;
                                    f13 += f29;
                                    f14 += f28;
                                    f11 = f32;
                                    path = path3;
                                    f12 = f33;
                                } else {
                                    if (tx0Var3 instanceof defpackage.gx0) {
                                        defpackage.gx0 gx0Var = (defpackage.gx0) tx0Var3;
                                        float f34 = gx0Var.oh71FJcDz6S2;
                                        float f35 = gx0Var.WDYagTQQm9ns;
                                        float f36 = gx0Var.JhCgjQRTAOCT;
                                        f4 = gx0Var.fWTAfUmVKrZq;
                                        path3.quadTo(f4, f36, f35, f34);
                                        path = path3;
                                        f14 = f34;
                                        f13 = f35;
                                        f12 = f36;
                                    } else if (tx0Var3 instanceof defpackage.qx0) {
                                        if (tx0Var2.giKS3J6vZuNy) {
                                            f2 = f13 - f11;
                                            f3 = f14 - f12;
                                        } else {
                                            f2 = f10;
                                            f3 = f2;
                                        }
                                        defpackage.qx0 qx0Var = (defpackage.qx0) tx0Var3;
                                        float f37 = qx0Var.JhCgjQRTAOCT;
                                        float f38 = qx0Var.fWTAfUmVKrZq;
                                        path3.rQuadTo(f2, f3, f38, f37);
                                        f4 = f2 + f13;
                                        float f39 = f3 + f14;
                                        f13 += f38;
                                        f14 += f37;
                                        path = path3;
                                        f12 = f39;
                                    } else if (tx0Var3 instanceof defpackage.ix0) {
                                        if (tx0Var2.giKS3J6vZuNy) {
                                            f13 = (f13 * 2.0f) - f11;
                                            f14 = (2.0f * f14) - f12;
                                        }
                                        defpackage.ix0 ix0Var = (defpackage.ix0) tx0Var3;
                                        float f40 = ix0Var.JhCgjQRTAOCT;
                                        float f41 = ix0Var.fWTAfUmVKrZq;
                                        path3.quadTo(f13, f14, f41, f40);
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        f12 = f14;
                                        tx0Var = tx0Var3;
                                        f14 = f40;
                                        f11 = f13;
                                        f13 = f41;
                                    } else if (tx0Var3 instanceof defpackage.jx0) {
                                        defpackage.jx0 jx0Var = (defpackage.jx0) tx0Var3;
                                        float f42 = jx0Var.P05cfTpS5W5L + f13;
                                        float f43 = jx0Var.e6mdH7fiFuta + f14;
                                        i = size;
                                        f = 0.0f;
                                        path = path3;
                                        i2 = i3;
                                        s0TASMVLSWD5(s2Var, f13, f14, f42, f43, jx0Var.fWTAfUmVKrZq, jx0Var.JhCgjQRTAOCT, jx0Var.WDYagTQQm9ns, jx0Var.oh71FJcDz6S2, jx0Var.QiMR8OkAhezm);
                                        f11 = f42;
                                        f13 = f11;
                                        f12 = f43;
                                        f14 = f12;
                                        tx0Var = tx0Var3;
                                    } else {
                                        path = path3;
                                        i = size;
                                        f = f10;
                                        i2 = i3;
                                        if (!(tx0Var3 instanceof defpackage.ax0)) {
                                            defpackage.h7.T1fB7bDYiVJQ();
                                            return;
                                        }
                                        defpackage.ax0 ax0Var = (defpackage.ax0) tx0Var3;
                                        float f44 = ax0Var.e6mdH7fiFuta;
                                        float f45 = ax0Var.P05cfTpS5W5L;
                                        tx0Var = tx0Var3;
                                        s0TASMVLSWD5(s2Var, f13, f14, f45, f44, ax0Var.fWTAfUmVKrZq, ax0Var.JhCgjQRTAOCT, ax0Var.WDYagTQQm9ns, ax0Var.oh71FJcDz6S2, ax0Var.QiMR8OkAhezm);
                                        f12 = f44;
                                        f14 = f12;
                                        f11 = f45;
                                        f13 = f11;
                                    }
                                    i = size;
                                    f = f10;
                                    i2 = i3;
                                    tx0Var = tx0Var3;
                                    f11 = f4;
                                }
                                f14 = f6;
                                path = path3;
                                f13 = f5;
                            }
                            f14 += f9;
                        }
                        path = path3;
                    }
                    i = size;
                    f = f10;
                    i2 = i3;
                }
                tx0Var = tx0Var3;
            }
            i3 = i2 + 1;
            list2 = list;
            size = i;
            path3 = path;
            tx0Var2 = tx0Var;
            f10 = f;
        }
    }

    public static final long EPEWHACkMcF1(long j) {
        return (java.lang.Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final defpackage.da0 Fu5WBEia9jBo(defpackage.hc1 hc1Var) {
        java.lang.String Wc0TdmRSwbbi = defpackage.ah1.Wc0TdmRSwbbi(hc1Var.ZpBGe2uQfcn8(), "?", "");
        return defpackage.ma0.QiMR8OkAhezm(hc1Var.giKS3J6vZuNy(), defpackage.lc1.fWTAfUmVKrZq) ? hc1Var.oh71FJcDz6S2() ? defpackage.da0.oCu53ZX2v4Ju : defpackage.da0.VFeft99leXEK : Wc0TdmRSwbbi.equals("kotlin.Int") ? hc1Var.oh71FJcDz6S2() ? defpackage.da0.oh71FJcDz6S2 : defpackage.da0.WDYagTQQm9ns : Wc0TdmRSwbbi.equals("kotlin.Boolean") ? hc1Var.oh71FJcDz6S2() ? defpackage.da0.P05cfTpS5W5L : defpackage.da0.QiMR8OkAhezm : Wc0TdmRSwbbi.equals("kotlin.Double") ? hc1Var.oh71FJcDz6S2() ? defpackage.da0.GE9mJIPrb8gP : defpackage.da0.e6mdH7fiFuta : Wc0TdmRSwbbi.equals("kotlin.Float") ? hc1Var.oh71FJcDz6S2() ? defpackage.da0.fNwYGHIYeJcR : defpackage.da0.Ns0WNyEWdPsk : Wc0TdmRSwbbi.equals("kotlin.Long") ? hc1Var.oh71FJcDz6S2() ? defpackage.da0.gUjdnLbkVAaA : defpackage.da0.h3m55N1URyyK : Wc0TdmRSwbbi.equals("kotlin.String") ? hc1Var.oh71FJcDz6S2() ? defpackage.da0.XntWc4eZSQ8j : defpackage.da0.T1fB7bDYiVJQ : Wc0TdmRSwbbi.equals("kotlin.IntArray") ? defpackage.da0.WmetiUbpKU9I : Wc0TdmRSwbbi.equals("kotlin.DoubleArray") ? defpackage.da0.BHfvd2J71qpO : Wc0TdmRSwbbi.equals("kotlin.BooleanArray") ? defpackage.da0.s0TASMVLSWD5 : Wc0TdmRSwbbi.equals("kotlin.FloatArray") ? defpackage.da0.ZVVdXbWmyCSK : Wc0TdmRSwbbi.equals("kotlin.LongArray") ? defpackage.da0.w7APNrr0aGRc : Wc0TdmRSwbbi.equals("kotlin.Array") ? defpackage.da0.maCixPsq4ml2 : Wc0TdmRSwbbi.startsWith("kotlin.collections.ArrayList") ? defpackage.da0.IJ0hOnjhPOri : defpackage.da0.dG7RjM6DqYVL;
    }

    public static void GE9mJIPrb8gP(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean GcLuU6pT9wO9(defpackage.nz nzVar, defpackage.d5 d5Var) {
        defpackage.nz[] nzVarArr = new defpackage.nz[16];
        if (!nzVar.WDYagTQQm9ns.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitChildren called on an unattached node");
        }
        defpackage.ho0 ho0Var = new defpackage.ho0(new defpackage.ul0[16]);
        defpackage.ul0 ul0Var = nzVar.WDYagTQQm9ns;
        defpackage.ul0 ul0Var2 = ul0Var.GE9mJIPrb8gP;
        if (ul0Var2 == null) {
            defpackage.la0.oh71FJcDz6S2(ho0Var, ul0Var);
        } else {
            ho0Var.giKS3J6vZuNy(ul0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = ho0Var.QiMR8OkAhezm;
            if (i2 == 0) {
                break;
            }
            defpackage.ul0 ul0Var3 = (defpackage.ul0) ho0Var.Ns0WNyEWdPsk(i2 - 1);
            if ((ul0Var3.P05cfTpS5W5L & 1024) == 0) {
                defpackage.la0.oh71FJcDz6S2(ho0Var, ul0Var3);
            } else {
                while (true) {
                    if (ul0Var3 == null) {
                        break;
                    }
                    if ((ul0Var3.QiMR8OkAhezm & 1024) != 0) {
                        defpackage.ho0 ho0Var2 = null;
                        while (ul0Var3 != null) {
                            if (ul0Var3 instanceof defpackage.nz) {
                                defpackage.nz nzVar2 = (defpackage.nz) ul0Var3;
                                int i3 = i + 1;
                                if (nzVarArr.length < i3) {
                                    int length = nzVarArr.length;
                                    ?? r10 = new java.lang.Object[java.lang.Math.max(i3, length * 2)];
                                    java.lang.System.arraycopy(nzVarArr, 0, r10, 0, length);
                                    nzVarArr = r10;
                                }
                                nzVarArr[i] = nzVar2;
                                i = i3;
                            } else if ((ul0Var3.QiMR8OkAhezm & 1024) != 0 && (ul0Var3 instanceof defpackage.xo)) {
                                int i4 = 0;
                                for (defpackage.ul0 ul0Var4 = ((defpackage.xo) ul0Var3).ZVVdXbWmyCSK; ul0Var4 != null; ul0Var4 = ul0Var4.GE9mJIPrb8gP) {
                                    if ((ul0Var4.QiMR8OkAhezm & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            ul0Var3 = ul0Var4;
                                        } else {
                                            if (ho0Var2 == null) {
                                                ho0Var2 = new defpackage.ho0(new defpackage.ul0[16]);
                                            }
                                            if (ul0Var3 != null) {
                                                ho0Var2.giKS3J6vZuNy(ul0Var3);
                                                ul0Var3 = null;
                                            }
                                            ho0Var2.giKS3J6vZuNy(ul0Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            ul0Var3 = defpackage.la0.P05cfTpS5W5L(ho0Var2);
                        }
                    } else {
                        ul0Var3 = ul0Var3.GE9mJIPrb8gP;
                    }
                }
            }
        }
        java.util.Arrays.sort(nzVarArr, 0, i, defpackage.oz.giKS3J6vZuNy);
        int i5 = i - 1;
        if (i5 < nzVarArr.length) {
            while (i5 >= 0) {
                defpackage.nz nzVar3 = nzVarArr[i5];
                if (defpackage.h0.KrtOTfE6jiS2(nzVar3) && e6mdH7fiFuta(nzVar3, d5Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final defpackage.zc1 IBvW5fLsPuHy(defpackage.zc1 zc1Var, defpackage.zc1 zc1Var2, float f) {
        long Wc0TdmRSwbbi = defpackage.ok0.Wc0TdmRSwbbi(f, zc1Var.ZpBGe2uQfcn8, zc1Var2.ZpBGe2uQfcn8);
        long j = zc1Var.giKS3J6vZuNy;
        long j2 = zc1Var2.giKS3J6vZuNy;
        float OcTWLQzke1i2 = defpackage.t80.OcTWLQzke1i2(java.lang.Float.intBitsToFloat((int) (j >> 32)), java.lang.Float.intBitsToFloat((int) (j2 >> 32)), f);
        float OcTWLQzke1i22 = defpackage.t80.OcTWLQzke1i2(java.lang.Float.intBitsToFloat((int) (j & 4294967295L)), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)), f);
        return new defpackage.zc1(defpackage.t80.OcTWLQzke1i2(zc1Var.fWTAfUmVKrZq, zc1Var2.fWTAfUmVKrZq, f), Wc0TdmRSwbbi, (java.lang.Float.floatToRawIntBits(OcTWLQzke1i2) << 32) | (java.lang.Float.floatToRawIntBits(OcTWLQzke1i22) & 4294967295L));
    }

    public static final boolean IJ0hOnjhPOri(defpackage.nz nzVar, defpackage.d5 d5Var) {
        int ordinal = nzVar.iYH9ueRbBBFm().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                defpackage.nz OcTWLQzke1i2 = defpackage.h0.OcTWLQzke1i2(nzVar);
                if (OcTWLQzke1i2 != null) {
                    return IJ0hOnjhPOri(OcTWLQzke1i2, d5Var) || VFeft99leXEK(nzVar, OcTWLQzke1i2, 1, d5Var);
                }
                defpackage.h7.P05cfTpS5W5L("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return nzVar.I9id0xDxCgYV().ZpBGe2uQfcn8 ? ((java.lang.Boolean) d5Var.P05cfTpS5W5L(nzVar)).booleanValue() : xahdJg25P1Bv(nzVar, d5Var);
                }
                defpackage.h7.T1fB7bDYiVJQ();
                return false;
            }
        }
        return xahdJg25P1Bv(nzVar, d5Var);
    }

    public static final void JhCgjQRTAOCT(defpackage.bi0 bi0Var, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(678424877);
        int i2 = i | 2;
        int i3 = 0;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            e30Var.CZa7MwI9IzLd();
            if ((i & 1) == 0 || e30Var.oCu53ZX2v4Ju()) {
                defpackage.ru1 ZpBGe2uQfcn82 = defpackage.mi0.ZpBGe2uQfcn8(e30Var);
                if (ZpBGe2uQfcn82 == null) {
                    defpackage.h7.P05cfTpS5W5L("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                bi0Var = (defpackage.bi0) defpackage.vx1.BXaznwstz2U0(defpackage.b41.ZpBGe2uQfcn8(defpackage.bi0.class), ZpBGe2uQfcn82.WDYagTQQm9ns(), defpackage.jr0.ZVVdXbWmyCSK(ZpBGe2uQfcn82), defpackage.fc0.ZpBGe2uQfcn8(e30Var));
            } else {
                e30Var.Jkfc0NcwyPL8();
            }
            defpackage.bi0 bi0Var2 = bi0Var;
            e30Var.WmetiUbpKU9I();
            defpackage.t80.fWTAfUmVKrZq(null, defpackage.nn.OcTWLQzke1i2(552292054, new defpackage.yh0(i3, bi0Var2, Ns0WNyEWdPsk(bi0Var2.P05cfTpS5W5L, defpackage.av.WDYagTQQm9ns, null, e30Var, 48, 2)), e30Var), e30Var, 48);
            com.ice.fishing.wolberta.data.local.Item item = (com.ice.fishing.wolberta.data.local.Item) bi0Var2.QiMR8OkAhezm.getValue();
            boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(bi0Var2);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (P05cfTpS5W5L || GcLuU6pT9wO9 == pa1Var) {
                defpackage.j jVar = new defpackage.j(0, bi0Var2, defpackage.bi0.class, "dismiss", "dismiss()V", 0, 0, 5);
                e30Var.EgL5gQQnyJKX(jVar);
                GcLuU6pT9wO9 = jVar;
            }
            defpackage.n10 n10Var = (defpackage.n10) ((defpackage.n20) GcLuU6pT9wO9);
            boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(bi0Var2);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO92 == pa1Var) {
                defpackage.WDYagTQQm9ns wDYagTQQm9ns = new defpackage.WDYagTQQm9ns(1, bi0Var2, defpackage.bi0.class, "toggleMark", "toggleMark(Lcom/ice/fishing/wolberta/data/local/Item;)V", 0, 0, 7);
                e30Var.EgL5gQQnyJKX(wDYagTQQm9ns);
                GcLuU6pT9wO92 = wDYagTQQm9ns;
            }
            defpackage.jr0.giKS3J6vZuNy(item, n10Var, (defpackage.y10) ((defpackage.n20) GcLuU6pT9wO92), e30Var, com.ice.fishing.wolberta.data.local.Item.$stable);
            bi0Var = bi0Var2;
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.l2(i, 9, bi0Var);
        }
    }

    public static final defpackage.s31 Jkfc0NcwyPL8(android.graphics.RectF rectF) {
        return new defpackage.s31(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final void KrtOTfE6jiS2(java.lang.String str) {
        str.getClass();
        throw new java.lang.IllegalArgumentException("No valid saved state was found for the key '" + str + "'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly.");
    }

    public static final java.lang.String Mearx7yMn90V(java.util.Collection collection) {
        return defpackage.ug1.hH0RRJrNssvh(defpackage.hf.m6iZQUu7XjoL(collection, ",", null, null, null, 62)).concat(defpackage.ug1.hH0RRJrNssvh(" }"));
    }

    public static final defpackage.fo0 Ns0WNyEWdPsk(defpackage.tx txVar, java.lang.Object obj, defpackage.jm jmVar, defpackage.e30 e30Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            jmVar = defpackage.xu.WDYagTQQm9ns;
        }
        boolean P05cfTpS5W5L = e30Var.P05cfTpS5W5L(jmVar) | e30Var.P05cfTpS5W5L(txVar);
        java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
        defpackage.kl klVar = null;
        java.lang.Object obj2 = defpackage.cj.ZpBGe2uQfcn8;
        if (P05cfTpS5W5L || GcLuU6pT9wO9 == obj2) {
            GcLuU6pT9wO9 = new defpackage.oh71FJcDz6S2(jmVar, txVar, klVar, 17);
            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
        }
        defpackage.c20 c20Var = (defpackage.c20) GcLuU6pT9wO9;
        java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
        if (GcLuU6pT9wO92 == obj2) {
            GcLuU6pT9wO92 = hH0RRJrNssvh(obj);
            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
        }
        defpackage.fo0 fo0Var = (defpackage.fo0) GcLuU6pT9wO92;
        boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(c20Var);
        java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
        if (P05cfTpS5W5L2 || GcLuU6pT9wO93 == obj2) {
            GcLuU6pT9wO93 = new defpackage.bf1(c20Var, fo0Var, klVar, 1);
            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
        }
        defpackage.nq1.Ns0WNyEWdPsk(txVar, jmVar, (defpackage.c20) GcLuU6pT9wO93, e30Var);
        return fo0Var;
    }

    public static final android.graphics.RectF OVwOqzUGHcCU(defpackage.s31 s31Var) {
        return new android.graphics.RectF(s31Var.ZpBGe2uQfcn8, s31Var.giKS3J6vZuNy, s31Var.fWTAfUmVKrZq, s31Var.JhCgjQRTAOCT);
    }

    public static final defpackage.ru1 OcTWLQzke1i2(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(com.ice.fishing.wolberta.R.id.view_tree_view_model_store_owner);
            defpackage.ru1 ru1Var = tag instanceof defpackage.ru1 ? (defpackage.ru1) tag : null;
            if (ru1Var != null) {
                return ru1Var;
            }
            java.lang.Object IJ0hOnjhPOri = defpackage.t80.IJ0hOnjhPOri(view);
            view = IJ0hOnjhPOri instanceof android.view.View ? (android.view.View) IJ0hOnjhPOri : null;
        }
        return null;
    }

    public static final defpackage.s31 P05cfTpS5W5L(defpackage.qy0 qy0Var, int i, defpackage.ap1 ap1Var, defpackage.bn1 bn1Var, boolean z, int i2) {
        defpackage.s31 fWTAfUmVKrZq = bn1Var != null ? bn1Var.fWTAfUmVKrZq(ap1Var.giKS3J6vZuNy.QiMR8OkAhezm(i)) : defpackage.s31.WDYagTQQm9ns;
        float f = fWTAfUmVKrZq.ZpBGe2uQfcn8;
        int OVwOqzUGHcCU = qy0Var.OVwOqzUGHcCU(2.0f);
        return new defpackage.s31(z ? (i2 - f) - OVwOqzUGHcCU : f, fWTAfUmVKrZq.giKS3J6vZuNy, z ? i2 - f : OVwOqzUGHcCU + f, fWTAfUmVKrZq.JhCgjQRTAOCT);
    }

    public static final int QiMR8OkAhezm(defpackage.kj0 kj0Var, defpackage.VpXebusPOq9I vpXebusPOq9I) {
        defpackage.kj0 RIHPIrzkudeW = kj0Var.RIHPIrzkudeW();
        if (RIHPIrzkudeW == null) {
            defpackage.e80.giKS3J6vZuNy("Child of " + kj0Var + " cannot be null when calculating alignment line");
        }
        if (kj0Var.awuGf4qH8HFd().ZpBGe2uQfcn8().containsKey(vpXebusPOq9I)) {
            java.lang.Integer num = (java.lang.Integer) kj0Var.awuGf4qH8HFd().ZpBGe2uQfcn8().get(vpXebusPOq9I);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int XuMcJunjB8iA = RIHPIrzkudeW.XuMcJunjB8iA(vpXebusPOq9I);
            if (XuMcJunjB8iA != Integer.MIN_VALUE) {
                RIHPIrzkudeW.gUjdnLbkVAaA = true;
                kj0Var.T1fB7bDYiVJQ = true;
                kj0Var.SJaTq1YjP6B8();
                RIHPIrzkudeW.gUjdnLbkVAaA = false;
                kj0Var.T1fB7bDYiVJQ = false;
                return XuMcJunjB8iA + ((int) (vpXebusPOq9I instanceof defpackage.l50 ? RIHPIrzkudeW.ZdAZC2JJ1p6Z() & 4294967295L : RIHPIrzkudeW.ZdAZC2JJ1p6Z() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean T1fB7bDYiVJQ(java.lang.String str, java.lang.String str2) {
        str.getClass();
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    return defpackage.ma0.QiMR8OkAhezm(defpackage.tg1.omM9cAlgeGXx(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final float UmgHb6n58gfG(android.text.Layout layout, int i, android.graphics.Paint paint) {
        float width;
        float width2;
        java.lang.ThreadLocal threadLocal = defpackage.dn1.ZpBGe2uQfcn8;
        if (layout.getEllipsisCount(i) <= 0) {
            return 0.0f;
        }
        if (layout.getParagraphDirection(i) != -1 || layout.getWidth() >= layout.getLineRight(i)) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getLineRight(i) - layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)));
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment != null ? defpackage.v60.ZpBGe2uQfcn8[paragraphAlignment.ordinal()] : -1) == 1) {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = (layout.getWidth() - measureText) / 2.0f;
        } else {
            width = layout.getWidth() - layout.getLineRight(i);
            width2 = layout.getWidth() - measureText;
        }
        return width - width2;
    }

    public static final boolean VFeft99leXEK(defpackage.nz nzVar, defpackage.nz nzVar2, int i, defpackage.d5 d5Var) {
        if (zJPqDeoF0Os1(nzVar, nzVar2, i, d5Var)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) defpackage.jr0.Fu5WBEia9jBo(nzVar, i, new defpackage.st0(((defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(nzVar)).getFocusOwner()).oh71FJcDz6S2(), nzVar, nzVar2, i, d5Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final defpackage.jb1 WDYagTQQm9ns(defpackage.jd0 jd0Var, boolean z) {
        defpackage.ul0 ul0Var = jd0Var.IBvW5fLsPuHy.oh71FJcDz6S2;
        defpackage.wo woVar = null;
        if ((ul0Var.P05cfTpS5W5L & 8) != 0) {
            loop0: while (true) {
                if (ul0Var == null) {
                    break;
                }
                if ((ul0Var.QiMR8OkAhezm & 8) != 0) {
                    defpackage.ul0 ul0Var2 = ul0Var;
                    defpackage.ho0 ho0Var = null;
                    while (ul0Var2 != null) {
                        if (ul0Var2 instanceof defpackage.hb1) {
                            woVar = ul0Var2;
                            break loop0;
                        }
                        if ((ul0Var2.QiMR8OkAhezm & 8) != 0 && (ul0Var2 instanceof defpackage.xo)) {
                            int i = 0;
                            for (defpackage.ul0 ul0Var3 = ((defpackage.xo) ul0Var2).ZVVdXbWmyCSK; ul0Var3 != null; ul0Var3 = ul0Var3.GE9mJIPrb8gP) {
                                if ((ul0Var3.QiMR8OkAhezm & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        ul0Var2 = ul0Var3;
                                    } else {
                                        if (ho0Var == null) {
                                            ho0Var = new defpackage.ho0(new defpackage.ul0[16]);
                                        }
                                        if (ul0Var2 != null) {
                                            ho0Var.giKS3J6vZuNy(ul0Var2);
                                            ul0Var2 = null;
                                        }
                                        ho0Var.giKS3J6vZuNy(ul0Var3);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        ul0Var2 = defpackage.la0.P05cfTpS5W5L(ho0Var);
                    }
                }
                if ((ul0Var.P05cfTpS5W5L & 8) == 0) {
                    break;
                }
                ul0Var = ul0Var.GE9mJIPrb8gP;
            }
        }
        woVar.getClass();
        defpackage.ul0 ul0Var4 = ((defpackage.ul0) ((defpackage.hb1) woVar)).WDYagTQQm9ns;
        defpackage.fb1 IJ0hOnjhPOri = jd0Var.IJ0hOnjhPOri();
        if (IJ0hOnjhPOri == null) {
            IJ0hOnjhPOri = new defpackage.fb1();
        }
        return new defpackage.jb1(ul0Var4, z, jd0Var, IJ0hOnjhPOri);
    }

    public static final android.graphics.Rect Wc0TdmRSwbbi(defpackage.q90 q90Var) {
        return new android.graphics.Rect(q90Var.ZpBGe2uQfcn8, q90Var.giKS3J6vZuNy, q90Var.fWTAfUmVKrZq, q90Var.JhCgjQRTAOCT);
    }

    public static final defpackage.qp WmetiUbpKU9I(defpackage.n10 n10Var) {
        defpackage.a7 a7Var = defpackage.af1.ZpBGe2uQfcn8;
        return new defpackage.qp(n10Var, null);
    }

    public static final defpackage.ho0 XntWc4eZSQ8j() {
        defpackage.a7 a7Var = defpackage.af1.giKS3J6vZuNy;
        defpackage.ho0 ho0Var = (defpackage.ho0) a7Var.WDYagTQQm9ns();
        if (ho0Var != null) {
            return ho0Var;
        }
        defpackage.ho0 ho0Var2 = new defpackage.ho0(new defpackage.d30[0]);
        a7Var.BHfvd2J71qpO(ho0Var2);
        return ho0Var2;
    }

    public static final int ZVVdXbWmyCSK(java.lang.CharSequence charSequence, int i) {
        int length = charSequence.length();
        while (i < length) {
            if (charSequence.charAt(i) == '\n') {
                return i;
            }
            i++;
        }
        return charSequence.length();
    }

    public static final void ZpBGe2uQfcn8(final defpackage.vl0 vl0Var, final defpackage.go0 go0Var, final defpackage.fo0 fo0Var, final defpackage.c91 c91Var, final defpackage.cd1 cd1Var, final long j, final float f, final defpackage.nh nhVar, defpackage.e30 e30Var, final int i) {
        defpackage.e30 e30Var2;
        int i2;
        float f2;
        e30Var.PS16moFv2oLu(848986741);
        int i3 = i | (e30Var.oh71FJcDz6S2(vl0Var) ? 4 : 2) | (e30Var.oh71FJcDz6S2(go0Var) ? 32 : 16) | (e30Var.oh71FJcDz6S2(c91Var) ? 2048 : 1024) | (e30Var.oh71FJcDz6S2(cd1Var) ? 16384 : 8192) | (e30Var.WDYagTQQm9ns(j) ? 131072 : 65536) | (e30Var.fWTAfUmVKrZq(0.0f) ? 1048576 : 524288) | (e30Var.fWTAfUmVKrZq(f) ? 8388608 : 4194304) | (e30Var.oh71FJcDz6S2(null) ? 67108864 : 33554432) | (e30Var.P05cfTpS5W5L(nhVar) ? 536870912 : 268435456);
        if (e30Var.zJPqDeoF0Os1(i3 & 1, (306783379 & i3) != 306783378)) {
            defpackage.jp1 IBvW5fLsPuHy = defpackage.vx1.IBvW5fLsPuHy(go0Var, "DropDownMenu", e30Var, (((i3 >> 3) & 14) | 48) & 126);
            defpackage.vf1 z16KqenTjq8o = defpackage.t80.z16KqenTjq8o(defpackage.jm0.WDYagTQQm9ns, e30Var);
            defpackage.vf1 z16KqenTjq8o2 = defpackage.t80.z16KqenTjq8o(defpackage.jm0.oh71FJcDz6S2, e30Var);
            defpackage.lq1 lq1Var = defpackage.nn.ZVVdXbWmyCSK;
            defpackage.ti tiVar = IBvW5fLsPuHy.ZpBGe2uQfcn8;
            defpackage.pw0 pw0Var = IBvW5fLsPuHy.JhCgjQRTAOCT;
            boolean booleanValue = ((java.lang.Boolean) tiVar.oh71FJcDz6S2()).booleanValue();
            e30Var.NkfcFfdaVTox(143964305);
            float f3 = booleanValue ? 1.0f : 0.8f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf = java.lang.Float.valueOf(f3);
            boolean booleanValue2 = ((java.lang.Boolean) pw0Var.getValue()).booleanValue();
            e30Var.NkfcFfdaVTox(143964305);
            float f4 = booleanValue2 ? 1.0f : 0.8f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf2 = java.lang.Float.valueOf(f4);
            IBvW5fLsPuHy.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(-745957716);
            e30Var.XntWc4eZSQ8j(false);
            defpackage.hp1 s0TASMVLSWD5 = defpackage.vx1.s0TASMVLSWD5(IBvW5fLsPuHy, valueOf, valueOf2, z16KqenTjq8o, lq1Var, e30Var, 0);
            boolean booleanValue3 = ((java.lang.Boolean) IBvW5fLsPuHy.ZpBGe2uQfcn8.oh71FJcDz6S2()).booleanValue();
            e30Var.NkfcFfdaVTox(892761509);
            float f5 = booleanValue3 ? 1.0f : 0.0f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf3 = java.lang.Float.valueOf(f5);
            boolean booleanValue4 = ((java.lang.Boolean) pw0Var.getValue()).booleanValue();
            e30Var.NkfcFfdaVTox(892761509);
            float f6 = booleanValue4 ? 1.0f : 0.0f;
            e30Var.XntWc4eZSQ8j(false);
            java.lang.Float valueOf4 = java.lang.Float.valueOf(f6);
            IBvW5fLsPuHy.oh71FJcDz6S2();
            e30Var.NkfcFfdaVTox(2839488);
            e30Var.XntWc4eZSQ8j(false);
            defpackage.hp1 s0TASMVLSWD52 = defpackage.vx1.s0TASMVLSWD5(IBvW5fLsPuHy, valueOf3, valueOf4, z16KqenTjq8o2, lq1Var, e30Var, 0);
            e30Var2 = e30Var;
            boolean booleanValue5 = ((java.lang.Boolean) e30Var2.GE9mJIPrb8gP(defpackage.z80.ZpBGe2uQfcn8)).booleanValue();
            boolean QiMR8OkAhezm = e30Var2.QiMR8OkAhezm(booleanValue5) | e30Var2.oh71FJcDz6S2(s0TASMVLSWD5) | ((i3 & 112) == 32) | e30Var2.oh71FJcDz6S2(s0TASMVLSWD52);
            java.lang.Object GcLuU6pT9wO9 = e30Var2.GcLuU6pT9wO9();
            if (QiMR8OkAhezm || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                i2 = 0;
                f2 = 0.0f;
                defpackage.dl0 dl0Var = new defpackage.dl0(booleanValue5, go0Var, fo0Var, s0TASMVLSWD5, s0TASMVLSWD52);
                e30Var2.EgL5gQQnyJKX(dl0Var);
                GcLuU6pT9wO9 = dl0Var;
            } else {
                i2 = 0;
                f2 = 0.0f;
            }
            defpackage.vl0 w7APNrr0aGRc = defpackage.vx1.w7APNrr0aGRc(defpackage.sl0.ZpBGe2uQfcn8, (defpackage.y10) GcLuU6pT9wO9);
            defpackage.nh OcTWLQzke1i2 = defpackage.nn.OcTWLQzke1i2(-1463404422, new defpackage.fl0(vl0Var, c91Var, nhVar, i2), e30Var2);
            defpackage.sj sjVar = defpackage.hi1.ZpBGe2uQfcn8;
            defpackage.ng1 ng1Var = defpackage.wf.ZpBGe2uQfcn8;
            e30Var2.NkfcFfdaVTox(89374938);
            defpackage.uf ufVar = (defpackage.uf) e30Var2.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8);
            long j2 = ufVar.ZpBGe2uQfcn8;
            long j3 = ufVar.EPEWHACkMcF1;
            long j4 = ufVar.OVwOqzUGHcCU;
            long j5 = ufVar.xahdJg25P1Bv;
            long j6 = ufVar.WmetiUbpKU9I;
            if (defpackage.pf.fWTAfUmVKrZq(j, j2)) {
                j3 = ufVar.giKS3J6vZuNy;
            } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.oh71FJcDz6S2)) {
                j3 = ufVar.QiMR8OkAhezm;
            } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.GE9mJIPrb8gP)) {
                j3 = ufVar.Ns0WNyEWdPsk;
            } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.gUjdnLbkVAaA)) {
                j3 = ufVar.T1fB7bDYiVJQ;
            } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.IJ0hOnjhPOri)) {
                j3 = ufVar.VFeft99leXEK;
            } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.fWTAfUmVKrZq)) {
                j3 = ufVar.JhCgjQRTAOCT;
            } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.P05cfTpS5W5L)) {
                j3 = ufVar.e6mdH7fiFuta;
            } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.fNwYGHIYeJcR)) {
                j3 = ufVar.h3m55N1URyyK;
            } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.oCu53ZX2v4Ju)) {
                j3 = ufVar.dG7RjM6DqYVL;
            } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.w7APNrr0aGRc)) {
                j3 = ufVar.maCixPsq4ml2;
            } else {
                if (!defpackage.pf.fWTAfUmVKrZq(j, ufVar.XntWc4eZSQ8j)) {
                    if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.s0TASMVLSWD5)) {
                        j3 = ufVar.BHfvd2J71qpO;
                    } else if (!defpackage.pf.fWTAfUmVKrZq(j, ufVar.qjMheFZ0l9kA) && !defpackage.pf.fWTAfUmVKrZq(j, ufVar.Mearx7yMn90V) && !defpackage.pf.fWTAfUmVKrZq(j, ufVar.frSwwKIlbUhK) && !defpackage.pf.fWTAfUmVKrZq(j, ufVar.KrtOTfE6jiS2) && !defpackage.pf.fWTAfUmVKrZq(j, ufVar.IBvW5fLsPuHy) && !defpackage.pf.fWTAfUmVKrZq(j, ufVar.BXaznwstz2U0) && !defpackage.pf.fWTAfUmVKrZq(j, ufVar.jjTN4uUnoyEn)) {
                        if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.hH0RRJrNssvh) || defpackage.pf.fWTAfUmVKrZq(j, ufVar.GcLuU6pT9wO9)) {
                            j3 = j5;
                        } else if (defpackage.pf.fWTAfUmVKrZq(j, ufVar.zJPqDeoF0Os1) || defpackage.pf.fWTAfUmVKrZq(j, ufVar.Wc0TdmRSwbbi)) {
                            j3 = j4;
                        } else if (!defpackage.pf.fWTAfUmVKrZq(j, ufVar.Fu5WBEia9jBo) && !defpackage.pf.fWTAfUmVKrZq(j, ufVar.CZa7MwI9IzLd)) {
                            j3 = defpackage.pf.QiMR8OkAhezm;
                        }
                    }
                }
                j3 = j6;
            }
            if (j3 == 16) {
                j3 = ((defpackage.pf) e30Var2.GE9mJIPrb8gP(defpackage.sk.ZpBGe2uQfcn8)).ZpBGe2uQfcn8;
            }
            e30Var2.XntWc4eZSQ8j(false);
            defpackage.sj sjVar2 = defpackage.hi1.ZpBGe2uQfcn8;
            float f7 = ((defpackage.or) e30Var2.GE9mJIPrb8gP(sjVar2)).WDYagTQQm9ns + f2;
            defpackage.vx1.JhCgjQRTAOCT(new defpackage.v21[]{defpackage.sk.ZpBGe2uQfcn8.ZpBGe2uQfcn8(new defpackage.pf(j3)), sjVar2.ZpBGe2uQfcn8(new defpackage.or(f7))}, defpackage.nn.OcTWLQzke1i2(421772006, new defpackage.gi1(w7APNrr0aGRc, cd1Var, j, f7, f, OcTWLQzke1i2), e30Var2), e30Var2, 56);
        } else {
            e30Var2 = e30Var;
            e30Var2.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD53 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD53 != null) {
            s0TASMVLSWD53.JhCgjQRTAOCT = new defpackage.c20(go0Var, fo0Var, c91Var, cd1Var, j, f, nhVar, i) { // from class: el0
                public final /* synthetic */ long GE9mJIPrb8gP;
                public final /* synthetic */ float Ns0WNyEWdPsk;
                public final /* synthetic */ defpackage.c91 P05cfTpS5W5L;
                public final /* synthetic */ defpackage.fo0 QiMR8OkAhezm;
                public final /* synthetic */ defpackage.cd1 e6mdH7fiFuta;
                public final /* synthetic */ defpackage.nh fNwYGHIYeJcR;
                public final /* synthetic */ defpackage.go0 oh71FJcDz6S2;

                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int IBvW5fLsPuHy2 = defpackage.m90.IBvW5fLsPuHy(385);
                    defpackage.w60.ZpBGe2uQfcn8(defpackage.vl0.this, this.oh71FJcDz6S2, this.QiMR8OkAhezm, this.P05cfTpS5W5L, this.e6mdH7fiFuta, this.GE9mJIPrb8gP, this.Ns0WNyEWdPsk, this.fNwYGHIYeJcR, (defpackage.e30) obj, IBvW5fLsPuHy2);
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final float blKFvluuDQOf(android.text.Layout layout, int i, android.graphics.Paint paint) {
        float abs;
        float width;
        float lineLeft = layout.getLineLeft(i);
        java.lang.ThreadLocal threadLocal = defpackage.dn1.ZpBGe2uQfcn8;
        if (layout.getEllipsisCount(i) <= 0 || layout.getParagraphDirection(i) != 1 || lineLeft >= 0.0f) {
            return 0.0f;
        }
        float measureText = paint.measureText("…") + (layout.getPrimaryHorizontal(layout.getEllipsisStart(i) + layout.getLineStart(i)) - lineLeft);
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(i);
        if ((paragraphAlignment == null ? -1 : defpackage.v60.ZpBGe2uQfcn8[paragraphAlignment.ordinal()]) == 1) {
            abs = java.lang.Math.abs(lineLeft);
            width = (layout.getWidth() - measureText) / 2.0f;
        } else {
            abs = java.lang.Math.abs(lineLeft);
            width = layout.getWidth() - measureText;
        }
        return width + abs;
    }

    public static final java.lang.String dG7RjM6DqYVL(java.lang.Object obj, java.util.LinkedHashMap linkedHashMap) {
        obj.getClass();
        defpackage.rb0 BXaznwstz2U0 = defpackage.t80.BXaznwstz2U0(defpackage.b41.ZpBGe2uQfcn8(obj.getClass()));
        defpackage.up0 up0Var = new defpackage.up0(BXaznwstz2U0, linkedHashMap);
        BXaznwstz2U0.ZpBGe2uQfcn8(up0Var, obj);
        java.util.Map OVwOqzUGHcCU = defpackage.jk0.OVwOqzUGHcCU((java.util.LinkedHashMap) up0Var.WDYagTQQm9ns);
        defpackage.s81 s81Var = new defpackage.s81(BXaznwstz2U0);
        defpackage.gl glVar = new defpackage.gl(3, OVwOqzUGHcCU, s81Var);
        int fWTAfUmVKrZq = BXaznwstz2U0.giKS3J6vZuNy().fWTAfUmVKrZq();
        for (int i = 0; i < fWTAfUmVKrZq; i++) {
            java.lang.String JhCgjQRTAOCT = BXaznwstz2U0.giKS3J6vZuNy().JhCgjQRTAOCT(i);
            defpackage.oq0 oq0Var = (defpackage.oq0) linkedHashMap.get(JhCgjQRTAOCT);
            if (oq0Var == null) {
                throw new java.lang.IllegalStateException(("Cannot locate NavType for argument [" + JhCgjQRTAOCT + ']').toString());
            }
            glVar.JhCgjQRTAOCT(java.lang.Integer.valueOf(i), JhCgjQRTAOCT, oq0Var);
        }
        return ((java.lang.String) s81Var.oh71FJcDz6S2) + ((java.lang.String) s81Var.QiMR8OkAhezm) + ((java.lang.String) s81Var.P05cfTpS5W5L);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean e6mdH7fiFuta(defpackage.nz nzVar, defpackage.d5 d5Var) {
        int ordinal = nzVar.iYH9ueRbBBFm().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                defpackage.nz OcTWLQzke1i2 = defpackage.h0.OcTWLQzke1i2(nzVar);
                if (OcTWLQzke1i2 == null) {
                    defpackage.h7.P05cfTpS5W5L("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = OcTWLQzke1i2.iYH9ueRbBBFm().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                defpackage.h7.T1fB7bDYiVJQ();
                                return false;
                            }
                            defpackage.h7.P05cfTpS5W5L("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (e6mdH7fiFuta(OcTWLQzke1i2, d5Var) || VFeft99leXEK(nzVar, OcTWLQzke1i2, 2, d5Var) || (OcTWLQzke1i2.I9id0xDxCgYV().ZpBGe2uQfcn8 && ((java.lang.Boolean) d5Var.P05cfTpS5W5L(OcTWLQzke1i2)).booleanValue())) {
                        return true;
                    }
                }
                return VFeft99leXEK(nzVar, OcTWLQzke1i2, 2, d5Var);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    defpackage.h7.T1fB7bDYiVJQ();
                    return false;
                }
                if (!GcLuU6pT9wO9(nzVar, d5Var)) {
                    if (!(nzVar.I9id0xDxCgYV().ZpBGe2uQfcn8 ? ((java.lang.Boolean) d5Var.P05cfTpS5W5L(nzVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return GcLuU6pT9wO9(nzVar, d5Var);
    }

    public static final defpackage.fo0 fNwYGHIYeJcR(defpackage.eg1 eg1Var, defpackage.e30 e30Var) {
        return Ns0WNyEWdPsk(eg1Var, eg1Var.getValue(), defpackage.xu.WDYagTQQm9ns, e30Var, 0, 0);
    }

    public static final void fWTAfUmVKrZq(defpackage.n10 n10Var, defpackage.vl0 vl0Var, defpackage.ye0 ye0Var, defpackage.nf0 nf0Var, defpackage.e30 e30Var, int i) {
        defpackage.nf0 nf0Var2;
        defpackage.ye0 ye0Var2;
        defpackage.vl0 vl0Var2;
        e30Var.PS16moFv2oLu(1055276397);
        int i2 = (e30Var.P05cfTpS5W5L(n10Var) ? 4 : 2) | i | (e30Var.oh71FJcDz6S2(vl0Var) ? 32 : 16) | (e30Var.oh71FJcDz6S2(ye0Var) ? 256 : 128) | (e30Var.oh71FJcDz6S2(nf0Var) ? 2048 : 1024);
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 1171) != 1170)) {
            nf0Var2 = nf0Var;
            defpackage.qe0 qe0Var = new defpackage.qe0(ye0Var, vl0Var, nf0Var2, w6IV1lieBIux(n10Var, e30Var), 0);
            ye0Var2 = ye0Var;
            vl0Var2 = vl0Var;
            defpackage.v70.fWTAfUmVKrZq(defpackage.nn.OcTWLQzke1i2(-933153643, qe0Var, e30Var), e30Var, 6);
        } else {
            nf0Var2 = nf0Var;
            ye0Var2 = ye0Var;
            vl0Var2 = vl0Var;
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.s9(n10Var, vl0Var2, ye0Var2, nf0Var2, i);
        }
    }

    public static final java.lang.String frSwwKIlbUhK(java.util.Collection collection) {
        return defpackage.ug1.hH0RRJrNssvh(defpackage.hf.m6iZQUu7XjoL(collection, ",", null, null, null, 62)).concat(defpackage.ug1.hH0RRJrNssvh("},"));
    }

    public static final long gUjdnLbkVAaA() {
        return java.lang.Thread.currentThread().getId();
    }

    public static final void giKS3J6vZuNy(defpackage.nh nhVar, defpackage.n10 n10Var, defpackage.vl0 vl0Var, boolean z, defpackage.cl0 cl0Var, defpackage.wv0 wv0Var, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(-1325192924);
        if ((i & 6) == 0) {
            i2 = (e30Var.P05cfTpS5W5L(nhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(n10Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(vl0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(null) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(null) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= e30Var.QiMR8OkAhezm(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(cl0Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(wv0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(null) ? 67108864 : 33554432;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (38347923 & i2) != 38347922)) {
            defpackage.vl0 GcLuU6pT9wO9 = defpackage.nq1.GcLuU6pT9wO9(defpackage.ce1.P05cfTpS5W5L(defpackage.ce1.giKS3J6vZuNy(defpackage.jr0.WmetiUbpKU9I(vl0Var, null, defpackage.a61.ZpBGe2uQfcn8(6), z, n10Var), 1.0f), Float.NaN), wv0Var);
            defpackage.v61 ZpBGe2uQfcn82 = defpackage.u61.ZpBGe2uQfcn8(defpackage.vx1.ZpBGe2uQfcn8, defpackage.jVUAPb5NnIYW.XntWc4eZSQ8j, e30Var, 48);
            int s0TASMVLSWD5 = defpackage.la0.s0TASMVLSWD5(e30Var);
            defpackage.ay0 fNwYGHIYeJcR = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, GcLuU6pT9wO9);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var, ZpBGe2uQfcn82);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var, fNwYGHIYeJcR);
            defpackage.h5 h5Var = defpackage.vi.QiMR8OkAhezm;
            if (e30Var.Fu5WBEia9jBo || !defpackage.ma0.QiMR8OkAhezm(e30Var.GcLuU6pT9wO9(), java.lang.Integer.valueOf(s0TASMVLSWD5))) {
                defpackage.pVQOaWB9QMo4.T1fB7bDYiVJQ(s0TASMVLSWD5, e30Var, s0TASMVLSWD5, h5Var);
            }
            defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju);
            defpackage.ym1.ZpBGe2uQfcn8(((defpackage.gr1) e30Var.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8)).h3m55N1URyyK, defpackage.nn.OcTWLQzke1i2(865999929, new defpackage.gl0(cl0Var, z, nhVar), e30Var), e30Var, 48);
            e30Var.XntWc4eZSQ8j(true);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.hl(nhVar, n10Var, vl0Var, z, cl0Var, wv0Var, i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00b8, code lost:
    
        if (r8 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.oq0 h3m55N1URyyK(defpackage.hc1 hc1Var, java.util.Map map) {
        java.lang.Object obj;
        defpackage.oq0 oq0Var;
        boolean equals;
        java.util.Iterator it = map.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            defpackage.sb0 sb0Var = (defpackage.sb0) obj;
            hc1Var.getClass();
            sb0Var.getClass();
            if (hc1Var.oh71FJcDz6S2() != sb0Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8.fWTAfUmVKrZq()) {
                equals = false;
            } else {
                defpackage.rb0 GcLuU6pT9wO9 = defpackage.t80.GcLuU6pT9wO9(defpackage.nn.s0TASMVLSWD5, sb0Var);
                if (GcLuU6pT9wO9 == null) {
                    defpackage.h7.e6mdH7fiFuta("Cannot find KSerializer for [", hc1Var.ZpBGe2uQfcn8(), "]. If applicable, custom KSerializers for custom and third-party KType is currently not supported when declared directly on a class field via @Serializable(with = ...). Please use @Serializable or @Serializable(with = ...) on the class or object declaration.");
                    return null;
                }
                equals = hc1Var.equals(GcLuU6pT9wO9.giKS3J6vZuNy());
            }
            if (equals) {
                break;
            }
        }
        defpackage.sb0 sb0Var2 = (defpackage.sb0) obj;
        defpackage.oq0 oq0Var2 = sb0Var2 != null ? (defpackage.oq0) map.get(sb0Var2) : null;
        if (oq0Var2 == null) {
            oq0Var2 = null;
        }
        defpackage.wr1 wr1Var = defpackage.wr1.s0TASMVLSWD5;
        if (oq0Var2 == null) {
            hc1Var.getClass();
            switch (Fu5WBEia9jBo(hc1Var).ordinal()) {
                case 0:
                    oq0Var = defpackage.oq0.giKS3J6vZuNy;
                    oq0Var2 = oq0Var;
                    break;
                case 1:
                    oq0Var = defpackage.la0.gUjdnLbkVAaA;
                    oq0Var2 = oq0Var;
                    break;
                case 2:
                    oq0Var = defpackage.oq0.Ns0WNyEWdPsk;
                    oq0Var2 = oq0Var;
                    break;
                case 3:
                    oq0Var = defpackage.la0.T1fB7bDYiVJQ;
                    oq0Var2 = oq0Var;
                    break;
                case 4:
                    oq0Var = defpackage.la0.XntWc4eZSQ8j;
                    oq0Var2 = oq0Var;
                    break;
                case 5:
                    oq0Var = defpackage.la0.WmetiUbpKU9I;
                    oq0Var2 = oq0Var;
                    break;
                case 6:
                    oq0Var = defpackage.oq0.P05cfTpS5W5L;
                    oq0Var2 = oq0Var;
                    break;
                case 7:
                    oq0Var = defpackage.la0.s0TASMVLSWD5;
                    oq0Var2 = oq0Var;
                    break;
                case 8:
                    oq0Var = defpackage.oq0.WDYagTQQm9ns;
                    oq0Var2 = oq0Var;
                    break;
                case defpackage.n70.ZpBGe2uQfcn8 /* 9 */:
                    oq0Var = defpackage.la0.BHfvd2J71qpO;
                    oq0Var2 = oq0Var;
                    break;
                case defpackage.n70.giKS3J6vZuNy /* 10 */:
                    oq0Var = defpackage.la0.ZVVdXbWmyCSK;
                    oq0Var2 = oq0Var;
                    break;
                case 11:
                    oq0Var = defpackage.oq0.gUjdnLbkVAaA;
                    oq0Var2 = oq0Var;
                    break;
                case defpackage.n70.fWTAfUmVKrZq /* 12 */:
                    oq0Var = defpackage.oq0.fWTAfUmVKrZq;
                    oq0Var2 = oq0Var;
                    break;
                case 13:
                    oq0Var = defpackage.oq0.fNwYGHIYeJcR;
                    oq0Var2 = oq0Var;
                    break;
                case 14:
                    oq0Var = defpackage.la0.IJ0hOnjhPOri;
                    oq0Var2 = oq0Var;
                    break;
                case 15:
                    oq0Var = defpackage.oq0.e6mdH7fiFuta;
                    oq0Var2 = oq0Var;
                    break;
                case 16:
                    oq0Var = defpackage.oq0.oh71FJcDz6S2;
                    oq0Var2 = oq0Var;
                    break;
                case 17:
                    int ordinal = Fu5WBEia9jBo(hc1Var.QiMR8OkAhezm(0)).ordinal();
                    if (ordinal != 10) {
                        if (ordinal == 11) {
                            oq0Var = defpackage.la0.w7APNrr0aGRc;
                        }
                        oq0Var2 = wr1Var;
                        break;
                    } else {
                        oq0Var = defpackage.oq0.T1fB7bDYiVJQ;
                    }
                    oq0Var2 = oq0Var;
                    break;
                case 18:
                    int ordinal2 = Fu5WBEia9jBo(hc1Var.QiMR8OkAhezm(0)).ordinal();
                    if (ordinal2 == 0) {
                        oq0Var = defpackage.oq0.JhCgjQRTAOCT;
                    } else if (ordinal2 == 2) {
                        oq0Var = defpackage.oq0.h3m55N1URyyK;
                    } else if (ordinal2 == 4) {
                        oq0Var = defpackage.la0.VFeft99leXEK;
                    } else if (ordinal2 == 6) {
                        oq0Var = defpackage.oq0.GE9mJIPrb8gP;
                    } else if (ordinal2 == 8) {
                        oq0Var = defpackage.oq0.QiMR8OkAhezm;
                    } else if (ordinal2 == 19) {
                        oq0Var2 = new defpackage.aa0(defpackage.n70.XntWc4eZSQ8j(hc1Var.QiMR8OkAhezm(0)));
                        break;
                    } else if (ordinal2 != 10) {
                        if (ordinal2 == 11) {
                            oq0Var = defpackage.la0.maCixPsq4ml2;
                        }
                        oq0Var2 = wr1Var;
                        break;
                    } else {
                        oq0Var = defpackage.oq0.XntWc4eZSQ8j;
                    }
                    oq0Var2 = oq0Var;
                    break;
                case 19:
                    java.lang.Class XntWc4eZSQ8j = defpackage.n70.XntWc4eZSQ8j(hc1Var);
                    if (!android.os.Parcelable.class.isAssignableFrom(XntWc4eZSQ8j)) {
                        if (!java.lang.Enum.class.isAssignableFrom(XntWc4eZSQ8j)) {
                            if (!java.io.Serializable.class.isAssignableFrom(XntWc4eZSQ8j)) {
                                oq0Var2 = null;
                                break;
                            } else {
                                oq0Var2 = new defpackage.nq0(XntWc4eZSQ8j);
                                break;
                            }
                        } else {
                            oq0Var2 = new defpackage.lq0(XntWc4eZSQ8j);
                            break;
                        }
                    } else {
                        oq0Var2 = new defpackage.mq0(XntWc4eZSQ8j);
                        break;
                    }
                case 20:
                    java.lang.Class XntWc4eZSQ8j2 = defpackage.n70.XntWc4eZSQ8j(hc1Var);
                    if (java.lang.Enum.class.isAssignableFrom(XntWc4eZSQ8j2)) {
                        oq0Var2 = new defpackage.ba0(XntWc4eZSQ8j2);
                        break;
                    }
                    oq0Var2 = wr1Var;
                    break;
                default:
                    oq0Var2 = wr1Var;
                    break;
            }
        }
        if (oq0Var2.equals(wr1Var)) {
            return null;
        }
        return oq0Var2;
    }

    public static defpackage.pw0 hH0RRJrNssvh(java.lang.Object obj) {
        return new defpackage.pw0(obj, defpackage.pa1.Ns0WNyEWdPsk);
    }

    public static final int jjTN4uUnoyEn(android.view.KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        if (action != 0) {
            return action != 1 ? 0 : 1;
        }
        return 2;
    }

    public static final java.lang.String maCixPsq4ml2(java.util.Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? defpackage.ug1.hH0RRJrNssvh(defpackage.hf.m6iZQUu7XjoL(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final int oCu53ZX2v4Ju(defpackage.rb0 rb0Var) {
        int hashCode = rb0Var.giKS3J6vZuNy().ZpBGe2uQfcn8().hashCode();
        int fWTAfUmVKrZq = rb0Var.giKS3J6vZuNy().fWTAfUmVKrZq();
        for (int i = 0; i < fWTAfUmVKrZq; i++) {
            hashCode = (hashCode * 31) + rb0Var.giKS3J6vZuNy().JhCgjQRTAOCT(i).hashCode();
        }
        return hashCode;
    }

    public static final void oh71FJcDz6S2(defpackage.mq1 mq1Var, defpackage.y10 y10Var, defpackage.vl0 vl0Var, boolean z, defpackage.e30 e30Var, int i) {
        boolean z2;
        y10Var.getClass();
        e30Var.PS16moFv2oLu(-698785919);
        int i2 = i | (e30Var.JhCgjQRTAOCT(mq1Var == null ? -1 : mq1Var.ordinal()) ? 4 : 2) | (e30Var.P05cfTpS5W5L(y10Var) ? 32 : 16) | 3072;
        int i3 = 0;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 1171) != 1170)) {
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (GcLuU6pT9wO9 == pa1Var) {
                GcLuU6pT9wO9 = hH0RRJrNssvh(java.lang.Boolean.FALSE);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.fo0 fo0Var = (defpackage.fo0) GcLuU6pT9wO9;
            java.lang.String xahdJg25P1Bv = defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.filter_all, e30Var);
            java.util.List VFeft99leXEK = defpackage.ma0.VFeft99leXEK(xahdJg25P1Bv);
            defpackage.tv tvVar = defpackage.mq1.h3m55N1URyyK;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(tvVar, 10));
            defpackage.ZVVdXbWmyCSK zVVdXbWmyCSK = new defpackage.ZVVdXbWmyCSK(i3, tvVar);
            while (zVVdXbWmyCSK.hasNext()) {
                arrayList.add(((defpackage.mq1) zVVdXbWmyCSK.next()).WDYagTQQm9ns);
            }
            java.util.ArrayList ULjnV488Y6RO = defpackage.hf.ULjnV488Y6RO(VFeft99leXEK, arrayList);
            if (mq1Var != null) {
                xahdJg25P1Bv = mq1Var.WDYagTQQm9ns;
            }
            java.lang.String str = xahdJg25P1Bv;
            boolean booleanValue = ((java.lang.Boolean) fo0Var.getValue()).booleanValue();
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO92 == pa1Var) {
                GcLuU6pT9wO92 = new defpackage.h4(fo0Var, 6);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.vx1.WDYagTQQm9ns(booleanValue, (defpackage.y10) GcLuU6pT9wO92, defpackage.ce1.giKS3J6vZuNy(vl0Var, 1.0f), defpackage.nn.OcTWLQzke1i2(632765463, new defpackage.eh1(str, fo0Var, ULjnV488Y6RO, y10Var, 1), e30Var), e30Var, 3072);
            z2 = true;
        } else {
            e30Var.Jkfc0NcwyPL8();
            z2 = z;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.ow(mq1Var, y10Var, vl0Var, z2, i, 2);
        }
    }

    public static final long qjMheFZ0l9kA(android.view.KeyEvent keyEvent) {
        return defpackage.v70.giKS3J6vZuNy(keyEvent.getKeyCode());
    }

    public static final void s0TASMVLSWD5(defpackage.s2 s2Var, double d, double d2, double d3, double d4, double d5, double d6, double d7, boolean z, boolean z2) {
        double d8;
        double d9;
        double d10 = d5;
        double d11 = (d7 / 180.0d) * 3.141592653589793d;
        double cos = java.lang.Math.cos(d11);
        double sin = java.lang.Math.sin(d11);
        double d12 = ((d2 * sin) + (d * cos)) / d10;
        double d13 = ((d2 * cos) + ((-d) * sin)) / d6;
        double d14 = ((d4 * sin) + (d3 * cos)) / d10;
        double d15 = ((d4 * cos) + ((-d3) * sin)) / d6;
        double d16 = d12 - d14;
        double d17 = d13 - d15;
        double d18 = (d12 + d14) / 2.0d;
        double d19 = (d13 + d15) / 2.0d;
        double d20 = (d17 * d17) + (d16 * d16);
        if (d20 == 0.0d) {
            return;
        }
        double d21 = (1.0d / d20) - 0.25d;
        if (d21 < 0.0d) {
            double sqrt = (float) (java.lang.Math.sqrt(d20) / 1.99999d);
            s0TASMVLSWD5(s2Var, d, d2, d3, d4, d10 * sqrt, d6 * sqrt, d7, z, z2);
            return;
        }
        double sqrt2 = java.lang.Math.sqrt(d21);
        double d22 = d16 * sqrt2;
        double d23 = sqrt2 * d17;
        if (z == z2) {
            d8 = d18 - d23;
            d9 = d19 + d22;
        } else {
            d8 = d18 + d23;
            d9 = d19 - d22;
        }
        double atan2 = java.lang.Math.atan2(d13 - d9, d12 - d8);
        double atan22 = java.lang.Math.atan2(d15 - d9, d14 - d8) - atan2;
        if (z2 != (atan22 >= 0.0d)) {
            atan22 = atan22 > 0.0d ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d24 = d8 * d10;
        double d25 = d9 * d6;
        double d26 = (d24 * cos) - (d25 * sin);
        double d27 = (d25 * cos) + (d24 * sin);
        int ceil = (int) java.lang.Math.ceil(java.lang.Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = java.lang.Math.cos(d11);
        double sin2 = java.lang.Math.sin(d11);
        double cos3 = java.lang.Math.cos(atan2);
        double sin3 = java.lang.Math.sin(atan2);
        double d28 = -d10;
        double d29 = d28 * cos2;
        double d30 = d6 * sin2;
        double d31 = (d29 * sin3) - (d30 * cos3);
        double d32 = d28 * sin2;
        double d33 = d6 * cos2;
        double d34 = (cos3 * d33) + (sin3 * d32);
        double d35 = atan22 / ceil;
        double d36 = atan2;
        double d37 = d31;
        int i = 0;
        double d38 = d34;
        double d39 = d2;
        while (i < ceil) {
            double d40 = d36 + d35;
            double sin4 = java.lang.Math.sin(d40);
            double cos4 = java.lang.Math.cos(d40);
            int i2 = ceil;
            double d41 = (((d10 * cos2) * cos4) + d26) - (d30 * sin4);
            double d42 = (d33 * sin4) + (d10 * sin2 * cos4) + d27;
            double d43 = (d29 * sin4) - (d30 * cos4);
            double d44 = (cos4 * d33) + (sin4 * d32);
            double d45 = d40 - d36;
            double tan = java.lang.Math.tan(d45 / 2.0d);
            double sqrt3 = ((java.lang.Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * java.lang.Math.sin(d45)) / 3.0d;
            s2Var.ZpBGe2uQfcn8.cubicTo((float) ((d37 * sqrt3) + d), (float) ((d38 * sqrt3) + d39), (float) (d41 - (sqrt3 * d43)), (float) (d42 - (sqrt3 * d44)), (float) d41, (float) d42);
            d35 = d35;
            sin2 = sin2;
            d26 = d26;
            d = d41;
            i++;
            d32 = d32;
            d36 = d40;
            d38 = d44;
            d37 = d43;
            ceil = i2;
            d39 = d42;
            d10 = d5;
        }
    }

    public static final defpackage.fo0 w6IV1lieBIux(java.lang.Object obj, defpackage.e30 e30Var) {
        java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
        if (GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
            GcLuU6pT9wO9 = hH0RRJrNssvh(obj);
            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
        }
        defpackage.fo0 fo0Var = (defpackage.fo0) GcLuU6pT9wO9;
        fo0Var.setValue(obj);
        return fo0Var;
    }

    public static final int w7APNrr0aGRc(java.lang.CharSequence charSequence, int i) {
        while (i > 0) {
            if (charSequence.charAt(i - 1) == '\n') {
                return i;
            }
            i--;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean xahdJg25P1Bv(defpackage.nz nzVar, defpackage.d5 d5Var) {
        defpackage.nz[] nzVarArr = new defpackage.nz[16];
        if (!nzVar.WDYagTQQm9ns.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitChildren called on an unattached node");
        }
        defpackage.ho0 ho0Var = new defpackage.ho0(new defpackage.ul0[16]);
        defpackage.ul0 ul0Var = nzVar.WDYagTQQm9ns;
        defpackage.ul0 ul0Var2 = ul0Var.GE9mJIPrb8gP;
        if (ul0Var2 == null) {
            defpackage.la0.oh71FJcDz6S2(ho0Var, ul0Var);
        } else {
            ho0Var.giKS3J6vZuNy(ul0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = ho0Var.QiMR8OkAhezm;
            if (i2 == 0) {
                break;
            }
            defpackage.ul0 ul0Var3 = (defpackage.ul0) ho0Var.Ns0WNyEWdPsk(i2 - 1);
            if ((ul0Var3.P05cfTpS5W5L & 1024) == 0) {
                defpackage.la0.oh71FJcDz6S2(ho0Var, ul0Var3);
            } else {
                while (true) {
                    if (ul0Var3 == null) {
                        break;
                    }
                    if ((ul0Var3.QiMR8OkAhezm & 1024) != 0) {
                        defpackage.ho0 ho0Var2 = null;
                        while (ul0Var3 != null) {
                            if (ul0Var3 instanceof defpackage.nz) {
                                defpackage.nz nzVar2 = (defpackage.nz) ul0Var3;
                                int i3 = i + 1;
                                if (nzVarArr.length < i3) {
                                    int length = nzVarArr.length;
                                    ?? r10 = new java.lang.Object[java.lang.Math.max(i3, length * 2)];
                                    java.lang.System.arraycopy(nzVarArr, 0, r10, 0, length);
                                    nzVarArr = r10;
                                }
                                nzVarArr[i] = nzVar2;
                                i = i3;
                            } else if ((ul0Var3.QiMR8OkAhezm & 1024) != 0 && (ul0Var3 instanceof defpackage.xo)) {
                                int i4 = 0;
                                for (defpackage.ul0 ul0Var4 = ((defpackage.xo) ul0Var3).ZVVdXbWmyCSK; ul0Var4 != null; ul0Var4 = ul0Var4.GE9mJIPrb8gP) {
                                    if ((ul0Var4.QiMR8OkAhezm & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            ul0Var3 = ul0Var4;
                                        } else {
                                            if (ho0Var2 == null) {
                                                ho0Var2 = new defpackage.ho0(new defpackage.ul0[16]);
                                            }
                                            if (ul0Var3 != null) {
                                                ho0Var2.giKS3J6vZuNy(ul0Var3);
                                                ul0Var3 = null;
                                            }
                                            ho0Var2.giKS3J6vZuNy(ul0Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            ul0Var3 = defpackage.la0.P05cfTpS5W5L(ho0Var2);
                        }
                    } else {
                        ul0Var3 = ul0Var3.GE9mJIPrb8gP;
                    }
                }
            }
        }
        java.util.Arrays.sort(nzVarArr, 0, i, defpackage.oz.giKS3J6vZuNy);
        for (int i5 = 0; i5 < i; i5++) {
            defpackage.nz nzVar3 = nzVarArr[i5];
            if (defpackage.h0.KrtOTfE6jiS2(nzVar3) && IJ0hOnjhPOri(nzVar3, d5Var)) {
                return true;
            }
        }
        return false;
    }

    public static final java.lang.String z16KqenTjq8o(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        return "Route " + str3 + " could not find any NavType for argument " + str + " of type " + str2 + " - typeMap received was " + str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean zJPqDeoF0Os1(defpackage.nz nzVar, defpackage.nz nzVar2, int i, defpackage.d5 d5Var) {
        defpackage.ul0 ul0Var;
        defpackage.jd0 UmgHb6n58gfG;
        defpackage.or0 or0Var;
        if (nzVar.iYH9ueRbBBFm() != defpackage.mz.oh71FJcDz6S2) {
            defpackage.h7.P05cfTpS5W5L("This function should only be used within a parent that has focus.");
            return false;
        }
        defpackage.nz[] nzVarArr = new defpackage.nz[16];
        if (!nzVar.WDYagTQQm9ns.s0TASMVLSWD5) {
            defpackage.e80.giKS3J6vZuNy("visitChildren called on an unattached node");
        }
        defpackage.ho0 ho0Var = new defpackage.ho0(new defpackage.ul0[16]);
        defpackage.ul0 ul0Var2 = nzVar.WDYagTQQm9ns;
        defpackage.ul0 ul0Var3 = ul0Var2.GE9mJIPrb8gP;
        if (ul0Var3 == null) {
            defpackage.la0.oh71FJcDz6S2(ho0Var, ul0Var2);
        } else {
            ho0Var.giKS3J6vZuNy(ul0Var3);
        }
        int i2 = 0;
        while (true) {
            int i3 = ho0Var.QiMR8OkAhezm;
            ul0Var = null;
            if (i3 == 0) {
                break;
            }
            defpackage.ul0 ul0Var4 = (defpackage.ul0) ho0Var.Ns0WNyEWdPsk(i3 - 1);
            if ((ul0Var4.P05cfTpS5W5L & 1024) == 0) {
                defpackage.la0.oh71FJcDz6S2(ho0Var, ul0Var4);
            } else {
                while (true) {
                    if (ul0Var4 == null) {
                        break;
                    }
                    if ((ul0Var4.QiMR8OkAhezm & 1024) != 0) {
                        defpackage.ho0 ho0Var2 = null;
                        while (ul0Var4 != null) {
                            if (ul0Var4 instanceof defpackage.nz) {
                                defpackage.nz nzVar3 = (defpackage.nz) ul0Var4;
                                int i4 = i2 + 1;
                                if (nzVarArr.length < i4) {
                                    int length = nzVarArr.length;
                                    ?? r11 = new java.lang.Object[java.lang.Math.max(i4, length * 2)];
                                    java.lang.System.arraycopy(nzVarArr, 0, r11, 0, length);
                                    nzVarArr = r11;
                                }
                                nzVarArr[i2] = nzVar3;
                                i2 = i4;
                            } else if ((ul0Var4.QiMR8OkAhezm & 1024) != 0 && (ul0Var4 instanceof defpackage.xo)) {
                                int i5 = 0;
                                for (defpackage.ul0 ul0Var5 = ((defpackage.xo) ul0Var4).ZVVdXbWmyCSK; ul0Var5 != null; ul0Var5 = ul0Var5.GE9mJIPrb8gP) {
                                    if ((ul0Var5.QiMR8OkAhezm & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            ul0Var4 = ul0Var5;
                                        } else {
                                            if (ho0Var2 == null) {
                                                ho0Var2 = new defpackage.ho0(new defpackage.ul0[16]);
                                            }
                                            if (ul0Var4 != null) {
                                                ho0Var2.giKS3J6vZuNy(ul0Var4);
                                                ul0Var4 = null;
                                            }
                                            ho0Var2.giKS3J6vZuNy(ul0Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            ul0Var4 = defpackage.la0.P05cfTpS5W5L(ho0Var2);
                        }
                    } else {
                        ul0Var4 = ul0Var4.GE9mJIPrb8gP;
                    }
                }
            }
        }
        java.util.Arrays.sort(nzVarArr, 0, i2, defpackage.oz.giKS3J6vZuNy);
        if (i != 1) {
            if (i != 2) {
                defpackage.h7.P05cfTpS5W5L("This function should only be used for 1-D focus search");
                return false;
            }
            defpackage.p90 OVwOqzUGHcCU = defpackage.j80.OVwOqzUGHcCU(0, i2);
            int i6 = OVwOqzUGHcCU.WDYagTQQm9ns;
            int i7 = OVwOqzUGHcCU.oh71FJcDz6S2;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        defpackage.nz nzVar4 = nzVarArr[i7];
                        if (defpackage.h0.KrtOTfE6jiS2(nzVar4) && e6mdH7fiFuta(nzVar4, d5Var)) {
                            break;
                        }
                    }
                    if (defpackage.ma0.QiMR8OkAhezm(nzVarArr[i7], nzVar2)) {
                        z = true;
                    }
                    if (i7 == i6) {
                        break;
                    }
                    i7--;
                }
                return true;
            }
            if (i != 1) {
                if (!nzVar.WDYagTQQm9ns.s0TASMVLSWD5) {
                }
                defpackage.ul0 ul0Var6 = nzVar.WDYagTQQm9ns.e6mdH7fiFuta;
                UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(nzVar);
                loop5: while (true) {
                    if (UmgHb6n58gfG == null) {
                    }
                }
                if (ul0Var != null) {
                }
            }
            return false;
        }
        defpackage.p90 OVwOqzUGHcCU2 = defpackage.j80.OVwOqzUGHcCU(0, i2);
        int i8 = OVwOqzUGHcCU2.WDYagTQQm9ns;
        int i9 = OVwOqzUGHcCU2.oh71FJcDz6S2;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    defpackage.nz nzVar5 = nzVarArr[i8];
                    if (defpackage.h0.KrtOTfE6jiS2(nzVar5) && IJ0hOnjhPOri(nzVar5, d5Var)) {
                        break;
                    }
                }
                if (defpackage.ma0.QiMR8OkAhezm(nzVarArr[i8], nzVar2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && nzVar.I9id0xDxCgYV().ZpBGe2uQfcn8) {
            if (!nzVar.WDYagTQQm9ns.s0TASMVLSWD5) {
                defpackage.e80.giKS3J6vZuNy("visitAncestors called on an unattached node");
            }
            defpackage.ul0 ul0Var62 = nzVar.WDYagTQQm9ns.e6mdH7fiFuta;
            UmgHb6n58gfG = defpackage.la0.UmgHb6n58gfG(nzVar);
            loop5: while (true) {
                if (UmgHb6n58gfG == null) {
                    break;
                }
                if ((UmgHb6n58gfG.IBvW5fLsPuHy.oh71FJcDz6S2.P05cfTpS5W5L & 1024) != 0) {
                    while (ul0Var62 != null) {
                        if ((ul0Var62.QiMR8OkAhezm & 1024) != 0) {
                            defpackage.ul0 ul0Var7 = ul0Var62;
                            defpackage.ho0 ho0Var3 = null;
                            while (ul0Var7 != null) {
                                if (ul0Var7 instanceof defpackage.nz) {
                                    ul0Var = ul0Var7;
                                    break loop5;
                                }
                                if ((ul0Var7.QiMR8OkAhezm & 1024) != 0 && (ul0Var7 instanceof defpackage.xo)) {
                                    int i10 = 0;
                                    for (defpackage.ul0 ul0Var8 = ((defpackage.xo) ul0Var7).ZVVdXbWmyCSK; ul0Var8 != null; ul0Var8 = ul0Var8.GE9mJIPrb8gP) {
                                        if ((ul0Var8.QiMR8OkAhezm & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                ul0Var7 = ul0Var8;
                                            } else {
                                                if (ho0Var3 == null) {
                                                    ho0Var3 = new defpackage.ho0(new defpackage.ul0[16]);
                                                }
                                                if (ul0Var7 != null) {
                                                    ho0Var3.giKS3J6vZuNy(ul0Var7);
                                                    ul0Var7 = null;
                                                }
                                                ho0Var3.giKS3J6vZuNy(ul0Var8);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                ul0Var7 = defpackage.la0.P05cfTpS5W5L(ho0Var3);
                            }
                        }
                        ul0Var62 = ul0Var62.e6mdH7fiFuta;
                    }
                }
                UmgHb6n58gfG = UmgHb6n58gfG.w7APNrr0aGRc();
                ul0Var62 = (UmgHb6n58gfG == null || (or0Var = UmgHb6n58gfG.IBvW5fLsPuHy) == null) ? null : or0Var.WDYagTQQm9ns;
            }
            if (ul0Var != null) {
                return ((java.lang.Boolean) d5Var.P05cfTpS5W5L(nzVar)).booleanValue();
            }
        }
        return false;
    }
}
