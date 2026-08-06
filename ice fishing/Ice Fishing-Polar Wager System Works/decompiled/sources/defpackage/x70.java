package defpackage;

/* loaded from: classes.dex */
public abstract class x70 {
    public static final defpackage.et F7NU4MC0GW;
    public static final defpackage.et adDC3e2L;
    public static final java.lang.Object IHQe1A4L2xu = new java.lang.Object();
    public static final defpackage.tn oh6vYeIP = new defpackage.tn(1.0f, 1.0f);
    public static final defpackage.b3 r1MBDhnF = new defpackage.b3(2);
    public static final java.lang.StackTraceElement[] xiZrDbcSW0 = new java.lang.StackTraceElement[0];
    public static final defpackage.F7NU4MC0GW AARZUJiTa = new defpackage.F7NU4MC0GW(24, new defpackage.e6(18, 0), new defpackage.uc0(25));
    public static final long[] EXtogiMhuM = new long[0];
    public static final defpackage.et riuEU0zW4 = new defpackage.et("NO_THREAD_ELEMENTS", 1);
    public static final defpackage.n41 SH1y5HwkJhh = new defpackage.n41(26);
    public static final defpackage.n41 ez2rX8ReCYw = new defpackage.n41(27);
    public static final defpackage.n41 JlrlGoKF = new defpackage.n41(28);

    static {
        int i = 1;
        F7NU4MC0GW = new defpackage.et("NULL", i);
        adDC3e2L = new defpackage.et("UNINITIALIZED", i);
    }

    public static final long AARZUJiTa(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static final defpackage.mj0 AQHddgaEX(defpackage.mj0 mj0Var, defpackage.nn1 nn1Var) {
        return mj0Var.r1MBDhnF(new defpackage.n60(nn1Var));
    }

    public static java.lang.String AsxAYCCkb3Hi(long j) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (java.lang.Float.intBitsToFloat(i) == java.lang.Float.intBitsToFloat(i2)) {
            return "CornerRadius.circular(" + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat(i)) + ')';
        }
        return "CornerRadius.elliptical(" + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat(i)) + ", " + defpackage.s21.sJNB7mCer5(java.lang.Float.intBitsToFloat(i2)) + ')';
    }

    public static final boolean C0U8sNJm(long j, long j2) {
        return j == j2;
    }

    public static final boolean D2vUnMij(android.view.KeyEvent keyEvent) {
        long oh6vYeIP2 = defpackage.c80.oh6vYeIP(keyEvent.getKeyCode());
        return defpackage.l90.IHQe1A4L2xu(oh6vYeIP2, defpackage.l90.EXtogiMhuM) || defpackage.l90.IHQe1A4L2xu(oh6vYeIP2, defpackage.l90.ez2rX8ReCYw) || defpackage.l90.IHQe1A4L2xu(oh6vYeIP2, defpackage.l90.cnag84Bm) || defpackage.l90.IHQe1A4L2xu(oh6vYeIP2, defpackage.l90.SH1y5HwkJhh);
    }

    public static final void DFo87pBq1E5(java.util.List list, int i, int i2) {
        int UsuH8pd5P = UsuH8pd5P(i, list);
        if (UsuH8pd5P < 0) {
            UsuH8pd5P = -(UsuH8pd5P + 1);
        }
        while (UsuH8pd5P < list.size() && ((defpackage.i80) list.get(UsuH8pd5P)).oh6vYeIP < i2) {
        }
    }

    public static final void EXtogiMhuM(defpackage.mj0 mj0Var, defpackage.h6 h6Var, defpackage.j6 j6Var, defpackage.n nVar, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        int i2;
        java.lang.Object obj;
        boolean z;
        java.lang.Object obj2;
        java.lang.Object obj3 = defpackage.n.cnag84Bm;
        t10Var.QUKZkWRtw6(-1956591841);
        if ((i & 6) == 0) {
            i2 = (t10Var.xiZrDbcSW0(mj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= t10Var.xiZrDbcSW0(h6Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= t10Var.xiZrDbcSW0(j6Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= t10Var.xiZrDbcSW0(obj3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= t10Var.F7NU4MC0GW(Integer.MAX_VALUE) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= t10Var.F7NU4MC0GW(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            obj = nVar;
            i2 |= t10Var.xiZrDbcSW0(obj) ? 1048576 : 524288;
        } else {
            obj = nVar;
        }
        if ((i & 12582912) == 0) {
            i2 |= t10Var.EXtogiMhuM(sfVar) ? 8388608 : 4194304;
        }
        int i3 = i2;
        if (t10Var.lpprD5VAS(i3 & 1, (i3 & 4793491) != 4793490)) {
            int i4 = i3 & 3670016;
            boolean z2 = i4 == 1048576;
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj4 = defpackage.bh.IHQe1A4L2xu;
            if (z2 || mAr5m2L7gYDP == obj4) {
                obj.getClass();
                mAr5m2L7gYDP = new defpackage.nx();
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.nx nxVar = (defpackage.nx) mAr5m2L7gYDP;
            int i5 = i3 >> 3;
            int i6 = 6;
            boolean xiZrDbcSW02 = ((((i5 & 896) ^ 384) > 256 && t10Var.xiZrDbcSW0(obj3)) || (i5 & 384) == 256) | ((((i5 & 14) ^ 6) > 4 && t10Var.xiZrDbcSW0(h6Var)) || (i5 & 6) == 4) | ((((i5 & 112) ^ 48) > 32 && t10Var.xiZrDbcSW0(j6Var)) || (i5 & 48) == 32) | ((((i5 & 7168) ^ 3072) > 2048 && t10Var.F7NU4MC0GW(Integer.MAX_VALUE)) || (i5 & 3072) == 2048) | ((((57344 & i5) ^ 24576) > 16384 && t10Var.F7NU4MC0GW(Integer.MAX_VALUE)) || (i5 & 24576) == 16384) | t10Var.xiZrDbcSW0(nxVar);
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW02 || mAr5m2L7gYDP2 == obj4) {
                java.lang.Object pxVar = new defpackage.px(h6Var, j6Var, h6Var.IHQe1A4L2xu(), new defpackage.hk(), j6Var.IHQe1A4L2xu(), nxVar);
                t10Var.OtkytngK3Mr(pxVar);
                mAr5m2L7gYDP2 = pxVar;
            }
            defpackage.px pxVar2 = (defpackage.px) mAr5m2L7gYDP2;
            boolean z3 = (i4 == 1048576) | ((i3 & 29360128) == 8388608) | ((i3 & 458752) == 131072);
            java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
            if (z3 || mAr5m2L7gYDP3 == obj4) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                z = true;
                arrayList.add(new defpackage.sf(-1192950673, new defpackage.e(sfVar), true));
                nVar.getClass();
                t10Var.OtkytngK3Mr(arrayList);
                obj2 = arrayList;
            } else {
                z = true;
                obj2 = mAr5m2L7gYDP3;
            }
            defpackage.sf sfVar2 = new defpackage.sf(1271844412, new defpackage.QoRHpC4k(i6, (java.util.List) obj2), z);
            boolean xiZrDbcSW03 = t10Var.xiZrDbcSW0(pxVar2);
            java.lang.Object mAr5m2L7gYDP4 = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW03 || mAr5m2L7gYDP4 == obj4) {
                mAr5m2L7gYDP4 = new defpackage.kk0(pxVar2);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP4);
            }
            defpackage.ii0 ii0Var = (defpackage.ii0) mAr5m2L7gYDP4;
            int hashCode = java.lang.Long.hashCode(t10Var.Ye0N2xE9Hc);
            defpackage.gu0 JlrlGoKF2 = t10Var.JlrlGoKF();
            defpackage.mj0 yIx6ChFVk = defpackage.s21.yIx6ChFVk(t10Var, mj0Var);
            defpackage.vg.r1MBDhnF.getClass();
            defpackage.vz vzVar = defpackage.ug.oh6vYeIP;
            t10Var.AQHddgaEX();
            if (t10Var.QPwENk36pDC) {
                t10Var.ez2rX8ReCYw(vzVar);
            } else {
                t10Var.NWDBeGGF();
            }
            defpackage.f70.UsuH8pd5P(defpackage.ug.xiZrDbcSW0, t10Var, ii0Var);
            defpackage.f70.UsuH8pd5P(defpackage.ug.adDC3e2L, t10Var, JlrlGoKF2);
            defpackage.f70.kd6TUFXn(t10Var, java.lang.Integer.valueOf(hashCode), defpackage.ug.AARZUJiTa);
            defpackage.f70.PAEGRtP0bX(t10Var, defpackage.ug.EXtogiMhuM);
            defpackage.f70.UsuH8pd5P(defpackage.ug.F7NU4MC0GW, t10Var, yIx6ChFVk);
            sfVar2.adDC3e2L(t10Var, 0);
            t10Var.QoRHpC4k(true);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.kx(mj0Var, h6Var, j6Var, nVar, sfVar, i, 0);
        }
    }

    public static defpackage.mj0 EgCjBq0SZwJ(defpackage.mj0 mj0Var, boolean z, defpackage.vz vzVar) {
        return mj0Var.r1MBDhnF(new defpackage.bd(vzVar, null, null, true, z));
    }

    public static final android.graphics.Bitmap.Config EoOhNTTfIN7K(int i) {
        android.graphics.Bitmap.Config config;
        android.graphics.Bitmap.Config config2;
        if (i == 0) {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
        if (i == 1) {
            return android.graphics.Bitmap.Config.ALPHA_8;
        }
        if (i == 2) {
            return android.graphics.Bitmap.Config.RGB_565;
        }
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 26 && i == 3) {
            config2 = android.graphics.Bitmap.Config.RGBA_F16;
            return config2;
        }
        if (i2 < 26 || i != 4) {
            return android.graphics.Bitmap.Config.ARGB_8888;
        }
        config = android.graphics.Bitmap.Config.HARDWARE;
        return config;
    }

    public static final void F7NU4MC0GW(defpackage.li1 li1Var, defpackage.mj0 mj0Var, defpackage.tv tvVar, defpackage.g00 g00Var, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        defpackage.g00 g00Var2;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        int size;
        defpackage.sg sgVar = li1Var.IHQe1A4L2xu;
        t10Var.QUKZkWRtw6(-1877370462);
        int i3 = (i & 6) == 0 ? (t10Var.xiZrDbcSW0(li1Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= t10Var.xiZrDbcSW0(mj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= t10Var.EXtogiMhuM(tvVar) ? 256 : 128;
        }
        int i4 = i3 | 3072;
        if ((i & 24576) == 0) {
            i4 |= t10Var.EXtogiMhuM(sfVar) ? 16384 : 8192;
        }
        if (t10Var.lpprD5VAS(i4 & 1, (i4 & 9363) != 9362)) {
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj = defpackage.bh.IHQe1A4L2xu;
            if (mAr5m2L7gYDP == obj) {
                mAr5m2L7gYDP = defpackage.q0.cnag84Bm;
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.g00 g00Var3 = (defpackage.g00) mAr5m2L7gYDP;
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj2 = mAr5m2L7gYDP2;
            if (mAr5m2L7gYDP2 == obj) {
                defpackage.gb1 gb1Var = new defpackage.gb1();
                gb1Var.add(sgVar.xiZrDbcSW0());
                t10Var.OtkytngK3Mr(gb1Var);
                obj2 = gb1Var;
            }
            defpackage.gb1 gb1Var2 = (defpackage.gb1) obj2;
            java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
            if (mAr5m2L7gYDP3 == obj) {
                long[] jArr = defpackage.z41.IHQe1A4L2xu;
                mAr5m2L7gYDP3 = new defpackage.nl0();
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
            }
            defpackage.nl0 nl0Var = (defpackage.nl0) mAr5m2L7gYDP3;
            defpackage.qt0 qt0Var = li1Var.F7NU4MC0GW;
            if (QoRHpC4k(sgVar.xiZrDbcSW0(), qt0Var.getValue())) {
                t10Var.AsxAYCCkb3Hi(321145192);
                if (gb1Var2.size() == 1) {
                    z3 = true;
                    if (QoRHpC4k(gb1Var2.get(0), qt0Var.getValue())) {
                        t10Var.AsxAYCCkb3Hi(316295552);
                        t10Var.QoRHpC4k(false);
                        z = false;
                    }
                } else {
                    z3 = true;
                }
                t10Var.AsxAYCCkb3Hi(321279546);
                boolean z4 = (i4 & 14) == 4 ? z3 : false;
                java.lang.Object mAr5m2L7gYDP4 = t10Var.mAr5m2L7gYDP();
                if (z4 || mAr5m2L7gYDP4 == obj) {
                    mAr5m2L7gYDP4 = new defpackage.s(8, li1Var);
                    t10Var.OtkytngK3Mr(mAr5m2L7gYDP4);
                }
                defpackage.g00 g00Var4 = (defpackage.g00) mAr5m2L7gYDP4;
                g00Var4.getClass();
                int size2 = gb1Var2.size() - 1;
                if (size2 >= 0) {
                    int i5 = 0;
                    i2 = 0;
                    while (true) {
                        java.lang.Object obj3 = gb1Var2.get(i5);
                        if (((java.lang.Boolean) g00Var4.AARZUJiTa(obj3)).booleanValue() != z3) {
                            if (i2 != i5) {
                                gb1Var2.set(i2, obj3);
                            }
                            i2++;
                        }
                        if (i5 == size2) {
                            break;
                        }
                        i5++;
                        z3 = true;
                    }
                } else {
                    i2 = 0;
                }
                if (i2 < gb1Var2.size() && i2 <= gb1Var2.size() - 1) {
                    while (true) {
                        gb1Var2.remove(size);
                        if (size == i2) {
                            break;
                        } else {
                            size--;
                        }
                    }
                }
                nl0Var.IHQe1A4L2xu();
                z = false;
                t10Var.QoRHpC4k(false);
            } else {
                z = false;
                t10Var.AsxAYCCkb3Hi(316295552);
            }
            t10Var.QoRHpC4k(z);
            if (nl0Var.oh6vYeIP(qt0Var.getValue())) {
                z2 = false;
                t10Var.AsxAYCCkb3Hi(316295552);
            } else {
                t10Var.AsxAYCCkb3Hi(321536443);
                java.util.ListIterator listIterator = gb1Var2.listIterator();
                int i6 = 0;
                while (true) {
                    defpackage.b40 b40Var = (defpackage.b40) listIterator;
                    if (!b40Var.hasNext()) {
                        i6 = -1;
                        break;
                    } else if (QoRHpC4k(g00Var3.AARZUJiTa(b40Var.next()), g00Var3.AARZUJiTa(qt0Var.getValue()))) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 == -1) {
                    gb1Var2.add(qt0Var.getValue());
                } else {
                    gb1Var2.set(i6, qt0Var.getValue());
                }
                nl0Var.IHQe1A4L2xu();
                int size3 = gb1Var2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    java.lang.Object obj4 = gb1Var2.get(i7);
                    nl0Var.DFo87pBq1E5(obj4, defpackage.h1.XZx205DYe(-934471669, new defpackage.kk(li1Var, tvVar, obj4, sfVar), t10Var));
                }
                z2 = false;
            }
            t10Var.QoRHpC4k(z2);
            defpackage.ii0 F7NU4MC0GW2 = defpackage.z8.F7NU4MC0GW(defpackage.n.xiZrDbcSW0, z2);
            int hashCode = java.lang.Long.hashCode(t10Var.Ye0N2xE9Hc);
            defpackage.gu0 JlrlGoKF2 = t10Var.JlrlGoKF();
            defpackage.mj0 yIx6ChFVk = defpackage.s21.yIx6ChFVk(t10Var, mj0Var);
            defpackage.vg.r1MBDhnF.getClass();
            defpackage.vz vzVar = defpackage.ug.oh6vYeIP;
            t10Var.AQHddgaEX();
            if (t10Var.QPwENk36pDC) {
                t10Var.ez2rX8ReCYw(vzVar);
            } else {
                t10Var.NWDBeGGF();
            }
            defpackage.f70.UsuH8pd5P(defpackage.ug.xiZrDbcSW0, t10Var, F7NU4MC0GW2);
            defpackage.f70.UsuH8pd5P(defpackage.ug.adDC3e2L, t10Var, JlrlGoKF2);
            defpackage.f70.kd6TUFXn(t10Var, java.lang.Integer.valueOf(hashCode), defpackage.ug.AARZUJiTa);
            defpackage.f70.PAEGRtP0bX(t10Var, defpackage.ug.EXtogiMhuM);
            defpackage.f70.UsuH8pd5P(defpackage.ug.F7NU4MC0GW, t10Var, yIx6ChFVk);
            t10Var.AsxAYCCkb3Hi(-1312707512);
            int size4 = gb1Var2.size();
            for (int i8 = 0; i8 < size4; i8++) {
                java.lang.Object obj5 = gb1Var2.get(i8);
                t10Var.QPwENk36pDC(1171574969, 0, g00Var3.AARZUJiTa(obj5), null);
                defpackage.k00 k00Var = (defpackage.k00) nl0Var.AARZUJiTa(obj5);
                if (k00Var == null) {
                    t10Var.AsxAYCCkb3Hi(1959122128);
                } else {
                    t10Var.AsxAYCCkb3Hi(1171576145);
                    k00Var.adDC3e2L(t10Var, 0);
                }
                t10Var.QoRHpC4k(false);
                t10Var.QoRHpC4k(false);
            }
            t10Var.QoRHpC4k(false);
            t10Var.QoRHpC4k(true);
            g00Var2 = g00Var3;
        } else {
            t10Var.WLpAkxCo();
            g00Var2 = g00Var;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.lk(li1Var, mj0Var, tvVar, g00Var2, sfVar, i);
        }
    }

    public static void G3OKOH3wZRC(int i) {
        if (2 > i || i >= 37) {
            java.lang.StringBuilder JlrlGoKF2 = defpackage.fx0.JlrlGoKF(i, "radix ", " was not in valid range ");
            JlrlGoKF2.append(new defpackage.d70(2, 36, 1));
            throw new java.lang.IllegalArgumentException(JlrlGoKF2.toString());
        }
    }

    public static final void IHQe1A4L2xu(defpackage.li1 li1Var, defpackage.mj0 mj0Var, defpackage.g00 g00Var, defpackage.e8 e8Var, defpackage.g00 g00Var2, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        int i2;
        defpackage.g00 g00Var3;
        defpackage.t10 t10Var2;
        defpackage.sg sgVar;
        defpackage.p4 p4Var;
        defpackage.p4 p4Var2;
        defpackage.gb1 gb1Var;
        java.lang.Object obj;
        defpackage.g00 g00Var4 = g00Var;
        t10Var.QUKZkWRtw6(511725103);
        if ((i & 6) == 0) {
            i2 = (t10Var.xiZrDbcSW0(li1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= t10Var.xiZrDbcSW0(mj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= t10Var.EXtogiMhuM(g00Var4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= t10Var.xiZrDbcSW0(e8Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= t10Var.EXtogiMhuM(g00Var2) ? 16384 : 8192;
        }
        defpackage.sf sfVar2 = sfVar;
        if ((196608 & i) == 0) {
            i2 |= t10Var.EXtogiMhuM(sfVar2) ? 131072 : 65536;
        }
        if (t10Var.lpprD5VAS(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj2 = defpackage.bh.IHQe1A4L2xu;
            if (z || mAr5m2L7gYDP == obj2) {
                mAr5m2L7gYDP = new defpackage.p4(li1Var, e8Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.p4 p4Var3 = (defpackage.p4) mAr5m2L7gYDP;
            boolean z2 = i3 == 4;
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj3 = mAr5m2L7gYDP2;
            if (z2 || mAr5m2L7gYDP2 == obj2) {
                java.lang.Object[] objArr = {li1Var.IHQe1A4L2xu.xiZrDbcSW0()};
                defpackage.gb1 gb1Var2 = new defpackage.gb1();
                gb1Var2.addAll(defpackage.t6.gG5uWf3dqScO(objArr));
                t10Var.OtkytngK3Mr(gb1Var2);
                obj3 = gb1Var2;
            }
            defpackage.gb1 gb1Var3 = (defpackage.gb1) obj3;
            boolean z3 = i3 == 4;
            java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
            if (z3 || mAr5m2L7gYDP3 == obj2) {
                long[] jArr = defpackage.z41.IHQe1A4L2xu;
                mAr5m2L7gYDP3 = new defpackage.nl0();
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
            }
            defpackage.nl0 nl0Var = (defpackage.nl0) mAr5m2L7gYDP3;
            defpackage.sg sgVar2 = li1Var.IHQe1A4L2xu;
            defpackage.qt0 qt0Var = li1Var.F7NU4MC0GW;
            if (!gb1Var3.contains(sgVar2.xiZrDbcSW0())) {
                gb1Var3.clear();
                gb1Var3.add(sgVar2.xiZrDbcSW0());
            }
            if (QoRHpC4k(sgVar2.xiZrDbcSW0(), qt0Var.getValue())) {
                if (gb1Var3.size() != 1 || !QoRHpC4k(gb1Var3.get(0), sgVar2.xiZrDbcSW0())) {
                    gb1Var3.clear();
                    gb1Var3.add(sgVar2.xiZrDbcSW0());
                }
                if (nl0Var.adDC3e2L != 1 || nl0Var.r1MBDhnF(sgVar2.xiZrDbcSW0())) {
                    nl0Var.IHQe1A4L2xu();
                }
                p4Var3.oh6vYeIP = e8Var;
            }
            if (QoRHpC4k(sgVar2.xiZrDbcSW0(), qt0Var.getValue()) || gb1Var3.contains(qt0Var.getValue())) {
                sgVar = sgVar2;
            } else {
                java.util.ListIterator listIterator = gb1Var3.listIterator();
                int i4 = 0;
                while (true) {
                    defpackage.b40 b40Var = (defpackage.b40) listIterator;
                    sgVar = sgVar2;
                    if (!b40Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (QoRHpC4k(g00Var2.AARZUJiTa(b40Var.next()), g00Var2.AARZUJiTa(qt0Var.getValue()))) {
                            break;
                        }
                        i4++;
                        sgVar2 = sgVar;
                    }
                }
                if (i4 == -1) {
                    gb1Var3.add(qt0Var.getValue());
                } else {
                    gb1Var3.set(i4, qt0Var.getValue());
                }
            }
            if (nl0Var.r1MBDhnF(qt0Var.getValue()) && nl0Var.r1MBDhnF(sgVar.xiZrDbcSW0())) {
                t10Var.AsxAYCCkb3Hi(1925931827);
                t10Var.QoRHpC4k(false);
                g00Var3 = g00Var4;
                p4Var = p4Var3;
            } else {
                t10Var.AsxAYCCkb3Hi(1966410449);
                nl0Var.IHQe1A4L2xu();
                int size = gb1Var3.size();
                int i5 = 0;
                while (i5 < size) {
                    java.lang.Object obj4 = gb1Var3.get(i5);
                    nl0Var.DFo87pBq1E5(obj4, defpackage.h1.XZx205DYe(-23915175, new defpackage.e4(li1Var, obj4, g00Var4, p4Var3, gb1Var3, sfVar2), t10Var));
                    i5++;
                    g00Var4 = g00Var4;
                    sfVar2 = sfVar;
                }
                g00Var3 = g00Var4;
                p4Var = p4Var3;
                t10Var.QoRHpC4k(false);
            }
            boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(li1Var.xiZrDbcSW0()) | t10Var.xiZrDbcSW0(p4Var);
            java.lang.Object mAr5m2L7gYDP4 = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW02 || mAr5m2L7gYDP4 == obj2) {
                mAr5m2L7gYDP4 = (defpackage.zi) g00Var3.AARZUJiTa(p4Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP4);
            }
            defpackage.zi ziVar = (defpackage.zi) mAr5m2L7gYDP4;
            defpackage.li1 li1Var2 = p4Var.IHQe1A4L2xu;
            boolean xiZrDbcSW03 = t10Var.xiZrDbcSW0(p4Var);
            java.lang.Object mAr5m2L7gYDP5 = t10Var.mAr5m2L7gYDP();
            if (xiZrDbcSW03 || mAr5m2L7gYDP5 == obj2) {
                mAr5m2L7gYDP5 = defpackage.c80.nBH8hAHy(java.lang.Boolean.FALSE);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP5);
            }
            defpackage.sl0 sl0Var = (defpackage.sl0) mAr5m2L7gYDP5;
            defpackage.sl0 D2vUnMij = defpackage.c80.D2vUnMij(ziVar.F7NU4MC0GW, t10Var);
            if (QoRHpC4k(li1Var2.IHQe1A4L2xu.xiZrDbcSW0(), li1Var2.F7NU4MC0GW.getValue())) {
                sl0Var.setValue(java.lang.Boolean.FALSE);
            } else if (D2vUnMij.getValue() != null) {
                sl0Var.setValue(java.lang.Boolean.TRUE);
            }
            boolean booleanValue = ((java.lang.Boolean) sl0Var.getValue()).booleanValue();
            defpackage.mj0 mj0Var2 = defpackage.jj0.IHQe1A4L2xu;
            defpackage.gi1 gi1Var = null;
            if (booleanValue) {
                t10Var.AsxAYCCkb3Hi(1353077497);
                defpackage.p4 p4Var4 = p4Var;
                gb1Var = gb1Var3;
                p4Var2 = p4Var4;
                t10Var2 = t10Var;
                obj = null;
                gi1Var = defpackage.qi1.oh6vYeIP(p4Var4.IHQe1A4L2xu, defpackage.gq1.PAEGRtP0bX, null, t10Var2, 0, 2);
                boolean xiZrDbcSW04 = t10Var2.xiZrDbcSW0(gi1Var);
                java.lang.Object mAr5m2L7gYDP6 = t10Var2.mAr5m2L7gYDP();
                if (xiZrDbcSW04 || mAr5m2L7gYDP6 == obj2) {
                    mAr5m2L7gYDP6 = defpackage.ci0.p4kuH6PDtgom(mj0Var2, 0.0f, 0.0f, null, 520191);
                    t10Var2.OtkytngK3Mr(mAr5m2L7gYDP6);
                }
                mj0Var2 = (defpackage.mj0) mAr5m2L7gYDP6;
                t10Var2.QoRHpC4k(false);
            } else {
                p4Var2 = p4Var;
                gb1Var = gb1Var3;
                t10Var2 = t10Var;
                obj = null;
                t10Var2.AsxAYCCkb3Hi(1353343539);
                t10Var2.QoRHpC4k(false);
            }
            defpackage.p4 p4Var5 = p4Var2;
            defpackage.mj0 r1MBDhnF2 = mj0Var.r1MBDhnF(mj0Var2.r1MBDhnF(new defpackage.l4(gi1Var, D2vUnMij, p4Var5)));
            java.lang.Object mAr5m2L7gYDP7 = t10Var2.mAr5m2L7gYDP();
            if (mAr5m2L7gYDP7 == obj2) {
                mAr5m2L7gYDP7 = new defpackage.i4(p4Var5);
                t10Var2.OtkytngK3Mr(mAr5m2L7gYDP7);
            }
            defpackage.i4 i4Var = (defpackage.i4) mAr5m2L7gYDP7;
            int hashCode = java.lang.Long.hashCode(t10Var2.Ye0N2xE9Hc);
            defpackage.gu0 JlrlGoKF2 = t10Var2.JlrlGoKF();
            defpackage.mj0 yIx6ChFVk = defpackage.s21.yIx6ChFVk(t10Var2, r1MBDhnF2);
            defpackage.vg.r1MBDhnF.getClass();
            defpackage.vz vzVar = defpackage.ug.oh6vYeIP;
            t10Var2.AQHddgaEX();
            if (t10Var2.QPwENk36pDC) {
                t10Var2.ez2rX8ReCYw(vzVar);
            } else {
                t10Var2.NWDBeGGF();
            }
            defpackage.f70.UsuH8pd5P(defpackage.ug.xiZrDbcSW0, t10Var2, i4Var);
            defpackage.f70.UsuH8pd5P(defpackage.ug.adDC3e2L, t10Var2, JlrlGoKF2);
            defpackage.f70.kd6TUFXn(t10Var2, java.lang.Integer.valueOf(hashCode), defpackage.ug.AARZUJiTa);
            defpackage.f70.PAEGRtP0bX(t10Var2, defpackage.ug.EXtogiMhuM);
            defpackage.f70.UsuH8pd5P(defpackage.ug.F7NU4MC0GW, t10Var2, yIx6ChFVk);
            t10Var2.AsxAYCCkb3Hi(-860173498);
            int size2 = gb1Var.size();
            int i6 = 0;
            while (i6 < size2) {
                defpackage.gb1 gb1Var4 = gb1Var;
                java.lang.Object obj5 = gb1Var4.get(i6);
                t10Var2.QPwENk36pDC(-2026002954, 0, g00Var2.AARZUJiTa(obj5), obj);
                defpackage.k00 k00Var = (defpackage.k00) nl0Var.AARZUJiTa(obj5);
                if (k00Var == null) {
                    t10Var2.AsxAYCCkb3Hi(1618454323);
                } else {
                    t10Var2.AsxAYCCkb3Hi(-2026001778);
                    k00Var.adDC3e2L(t10Var2, 0);
                }
                t10Var2.QoRHpC4k(false);
                t10Var2.QoRHpC4k(false);
                i6++;
                gb1Var = gb1Var4;
            }
            t10Var2.QoRHpC4k(false);
            t10Var2.QoRHpC4k(true);
        } else {
            g00Var3 = g00Var4;
            t10Var2 = t10Var;
            t10Var2.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var2.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.f4(li1Var, mj0Var, g00Var3, e8Var, g00Var2, sfVar, i);
        }
    }

    public static final long JlrlGoKF(long j, long j2) {
        if (j != 4611686018427387903L && j != -4611686018427387903L) {
            return (j2 == 4611686018427387903L || j2 == -4611686018427387903L) ? j2 : defpackage.x80.DFo87pBq1E5(j + j2, -4611686018427387903L, 4611686018427387903L);
        }
        if ((-4611686018427387903L >= j2 || j2 >= 4611686018427387903L) && (j2 ^ j) < 0) {
            return 9223372036854759646L;
        }
        return j;
    }

    public static final long NHJTzaLwkd(long j) {
        long j2 = (j << 1) + 1;
        defpackage.zr.adDC3e2L.getClass();
        int i = defpackage.as.IHQe1A4L2xu;
        return j2;
    }

    public static final int PAEGRtP0bX(long j, long j2) {
        boolean SiPhmbmu = SiPhmbmu(j);
        if (SiPhmbmu != SiPhmbmu(j2)) {
            return SiPhmbmu ? -1 : 1;
        }
        return (java.lang.Math.min(nBH8hAHy(j), nBH8hAHy(j2)) >= 0.0f && frpfPPIgqM9O(j) != frpfPPIgqM9O(j2)) ? frpfPPIgqM9O(j) ? -1 : 1 : (int) java.lang.Math.signum(nBH8hAHy(j) - nBH8hAHy(j2));
    }

    public static final java.lang.Object QPwENk36pDC(defpackage.lj ljVar) {
        java.lang.Object EgCjBq0SZwJ = ljVar.EgCjBq0SZwJ(SH1y5HwkJhh, 0);
        EgCjBq0SZwJ.getClass();
        return EgCjBq0SZwJ;
    }

    public static final boolean QQUzIjv3iOC5(long j, long j2) {
        return j == j2;
    }

    public static java.util.Set QUKZkWRtw6(java.util.Map map) {
        map.getClass();
        java.util.List list = defpackage.p80.IHQe1A4L2xu;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (p4kuH6PDtgom((defpackage.o80) obj, map)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((defpackage.o80) obj2).IHQe1A4L2xu);
        }
        return defpackage.td.FisHbM7NmV(arrayList2);
    }

    public static boolean QoRHpC4k(java.lang.Object obj, java.lang.Object obj2) {
        return obj == null ? obj2 == null : obj.equals(obj2);
    }

    public static final boolean RmCzwkUxICV(java.lang.Throwable th, defpackage.vz vzVar) {
        java.util.List asList;
        java.lang.Object invoke;
        th.getClass();
        java.lang.Integer num = defpackage.r80.IHQe1A4L2xu;
        defpackage.co coVar = null;
        if (num == null || num.intValue() >= 19) {
            java.lang.Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = java.util.Arrays.asList(suppressed);
            asList.getClass();
        } else {
            java.lang.reflect.Method method = defpackage.fv0.oh6vYeIP;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = defpackage.nt.adDC3e2L;
            } else {
                asList = java.util.Arrays.asList((java.lang.Throwable[]) invoke);
                asList.getClass();
            }
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((java.lang.Throwable) asList.get(i)) instanceof defpackage.co) {
                return false;
            }
        }
        try {
            defpackage.rg rgVar = (defpackage.rg) vzVar.IHQe1A4L2xu();
            if (rgVar != null) {
                boolean z2 = rgVar.oh6vYeIP;
                java.util.List list = rgVar.IHQe1A4L2xu;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((defpackage.tg) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                rgVar.getClass();
                coVar = new defpackage.co(rgVar);
            }
        } catch (java.lang.Throwable th2) {
            coVar = th2;
        }
        if (coVar != null) {
            cnag84Bm(th, coVar);
        }
        return z;
    }

    public static final void SH1y5HwkJhh(final defpackage.vz vzVar, final defpackage.mj0 mj0Var, final boolean z, final defpackage.e91 e91Var, final defpackage.da daVar, defpackage.s8 s8Var, defpackage.at0 at0Var, final defpackage.sf sfVar, defpackage.t10 t10Var, final int i) {
        int i2;
        defpackage.mj0 mj0Var2;
        defpackage.e91 e91Var2;
        final defpackage.s8 s8Var2;
        final defpackage.at0 at0Var2;
        long oh6vYeIP2;
        int i3;
        defpackage.ge geVar = defpackage.ci0.EXtogiMhuM;
        t10Var.QUKZkWRtw6(399974542);
        if ((i & 6) == 0) {
            i2 = (t10Var.EXtogiMhuM(vzVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            mj0Var2 = mj0Var;
            i2 |= t10Var.xiZrDbcSW0(mj0Var2) ? 32 : 16;
        } else {
            mj0Var2 = mj0Var;
        }
        if ((i & 384) == 0) {
            i2 |= t10Var.AARZUJiTa(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            e91Var2 = e91Var;
            i2 |= t10Var.xiZrDbcSW0(e91Var2) ? 2048 : 1024;
        } else {
            e91Var2 = e91Var;
        }
        if ((i & 24576) == 0) {
            i2 |= t10Var.xiZrDbcSW0(daVar) ? 16384 : 8192;
        }
        int i4 = 196608 | i2;
        if ((1572864 & i) == 0) {
            i4 = 720896 | i2;
        }
        int i5 = 113246208 | i4;
        if ((805306368 & i) == 0) {
            i5 |= t10Var.EXtogiMhuM(sfVar) ? 536870912 : 268435456;
        }
        if (t10Var.lpprD5VAS(i5 & 1, (306783379 & i5) != 306783378)) {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) == 0 || t10Var.NHJTzaLwkd()) {
                defpackage.ct0 ct0Var = defpackage.ea.IHQe1A4L2xu;
                float f = defpackage.fm.oh6vYeIP;
                if (z) {
                    t10Var.AsxAYCCkb3Hi(-112346942);
                    oh6vYeIP2 = defpackage.he.F7NU4MC0GW(geVar, t10Var);
                    t10Var.QoRHpC4k(false);
                } else {
                    t10Var.AsxAYCCkb3Hi(-112259336);
                    oh6vYeIP2 = defpackage.ae.oh6vYeIP(defpackage.he.F7NU4MC0GW(geVar, t10Var), 0.1f);
                    t10Var.QoRHpC4k(false);
                }
                defpackage.s8 s8Var3 = new defpackage.s8(f, new defpackage.kb1(oh6vYeIP2));
                at0Var2 = defpackage.ea.IHQe1A4L2xu;
                s8Var2 = s8Var3;
                i3 = i5 & (-3670017);
            } else {
                t10Var.WLpAkxCo();
                i3 = i5 & (-3670017);
                s8Var2 = s8Var;
                at0Var2 = at0Var;
            }
            t10Var.G3OKOH3wZRC();
            r1MBDhnF(vzVar, mj0Var2, z, e91Var2, daVar, null, s8Var2, at0Var2, sfVar, t10Var, i3 & 2147483646, 0);
        } else {
            t10Var.WLpAkxCo();
            s8Var2 = s8Var;
            at0Var2 = at0Var;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00() { // from class: ja
                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    defpackage.x70.SH1y5HwkJhh(defpackage.vz.this, mj0Var, z, e91Var, daVar, s8Var2, at0Var2, sfVar, (defpackage.t10) obj, defpackage.a70.hyxIchWRW(i | 1));
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final boolean SiPhmbmu(long j) {
        return (j & 1) != 0;
    }

    public static int SyNS6RMn(defpackage.pm90rNzI5F pm90rnzi5f, defpackage.n10 n10Var) {
        n10Var.getClass();
        java.util.Map map = n10Var.EXtogiMhuM;
        defpackage.nv0 nv0Var = n10Var.xiZrDbcSW0;
        int i = 0;
        switch (pm90rnzi5f.ordinal()) {
            case 0:
                i = nv0Var.oh6vYeIP;
                break;
            case 1:
                i = nv0Var.IHQe1A4L2xu;
                break;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                i = n10Var.riuEU0zW4.size();
                break;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                i = nv0Var.r1MBDhnF;
                break;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                i = nv0Var.EXtogiMhuM;
                break;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                i = nv0Var.F7NU4MC0GW;
                break;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                i = nv0Var.adDC3e2L;
                break;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                i = nv0Var.xiZrDbcSW0;
                break;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                i = QUKZkWRtw6(map).size();
                break;
            case 9:
                if (!map.isEmpty()) {
                    java.util.Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        if (((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue() > 0) {
                            i++;
                        }
                    }
                    break;
                }
                break;
            default:
                defpackage.db.F7NU4MC0GW();
                return 0;
        }
        int i2 = pm90rnzi5f.EXtogiMhuM;
        return i > i2 ? i2 : i;
    }

    public static void TFRaUu83X3E(java.lang.RuntimeException runtimeException, java.lang.String str) {
        java.lang.StackTraceElement[] stackTrace = runtimeException.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        runtimeException.setStackTrace((java.lang.StackTraceElement[]) java.util.Arrays.copyOfRange(stackTrace, i + 1, length));
    }

    public static final int UsuH8pd5P(int i, java.util.List list) {
        int size = list.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            int kNAkVymC = kNAkVymC(((defpackage.i80) list.get(i3)).oh6vYeIP, i);
            if (kNAkVymC < 0) {
                i2 = i3 + 1;
            } else {
                if (kNAkVymC <= 0) {
                    return i3;
                }
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void Uv8CGu3G(defpackage.ia1 ia1Var, int i, java.lang.Object obj) {
        int EXtogiMhuM2 = ia1Var.EXtogiMhuM(i);
        java.lang.Object[] objArr = ia1Var.r1MBDhnF;
        java.lang.Object obj2 = objArr[EXtogiMhuM2];
        objArr[EXtogiMhuM2] = defpackage.bh.IHQe1A4L2xu;
        if (obj == obj2) {
            return;
        }
        defpackage.dh.IHQe1A4L2xu("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static int V7bD7b8KA(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final java.lang.Object WLpAkxCo(defpackage.gy gyVar, int i, defpackage.g00 g00Var) {
        int i2;
        int i3;
        java.lang.Object obj;
        defpackage.lj0 lj0Var;
        defpackage.mb0 uLnPvzwk;
        int size;
        int i4;
        defpackage.ep0 ep0Var;
        if (!gyVar.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
        }
        defpackage.lj0 lj0Var2 = gyVar.adDC3e2L.riuEU0zW4;
        defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(gyVar);
        loop0: while (true) {
            i2 = 0;
            i3 = 1;
            obj = null;
            if (D2vUnMij == null) {
                lj0Var = null;
                break;
            }
            if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 1024) != 0) {
                while (lj0Var2 != null) {
                    if ((lj0Var2.AARZUJiTa & 1024) != 0) {
                        lj0Var = lj0Var2;
                        defpackage.xl0 xl0Var = null;
                        while (lj0Var != null) {
                            if (lj0Var instanceof defpackage.gy) {
                                break loop0;
                            }
                            if ((lj0Var.AARZUJiTa & 1024) != 0 && (lj0Var instanceof defpackage.ln)) {
                                int i5 = 0;
                                for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                    if ((lj0Var3.AARZUJiTa & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            lj0Var = lj0Var3;
                                        } else {
                                            if (xl0Var == null) {
                                                xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lj0Var != null) {
                                                xl0Var.oh6vYeIP(lj0Var);
                                                lj0Var = null;
                                            }
                                            xl0Var.oh6vYeIP(lj0Var3);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            lj0Var = defpackage.w70.riuEU0zW4(xl0Var);
                        }
                    }
                    lj0Var2 = lj0Var2.riuEU0zW4;
                }
            }
            D2vUnMij = D2vUnMij.V7bD7b8KA();
            lj0Var2 = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
        }
        defpackage.gy gyVar2 = (defpackage.gy) lj0Var;
        if ((gyVar2 == null || !QoRHpC4k(gyVar2.uLnPvzwk(), gyVar.uLnPvzwk())) && (uLnPvzwk = gyVar.uLnPvzwk()) != null) {
            int i6 = 5;
            if (i != 5) {
                i6 = 6;
                if (i != 6) {
                    i6 = 3;
                    if (i != 3) {
                        i6 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i6 = 2;
                            } else if (i == 2) {
                                i6 = 1;
                            } else {
                                defpackage.db.AARZUJiTa("Unsupported direction for beyond bounds layout");
                            }
                        }
                    }
                }
            }
            if (uLnPvzwk.EgCjBq0SZwJ.IHQe1A4L2xu.AARZUJiTa().SyNS6RMn <= 0 || uLnPvzwk.EgCjBq0SZwJ.IHQe1A4L2xu.AARZUJiTa().ez2rX8ReCYw.isEmpty() || !uLnPvzwk.kd6TUFXn) {
                return g00Var.AARZUJiTa(defpackage.mb0.V7bD7b8KA);
            }
            boolean H6IrRhrpWoH = uLnPvzwk.H6IrRhrpWoH(i6);
            defpackage.lc0 lc0Var = uLnPvzwk.EgCjBq0SZwJ;
            int min = H6IrRhrpWoH ? java.lang.Math.min(lc0Var.IHQe1A4L2xu.AARZUJiTa().SyNS6RMn - 1, ((defpackage.tc0) defpackage.td.NWDBeGGF(lc0Var.IHQe1A4L2xu.AARZUJiTa().ez2rX8ReCYw)).IHQe1A4L2xu) : java.lang.Math.max(0, ((defpackage.nt0) lc0Var.IHQe1A4L2xu.adDC3e2L.oh6vYeIP).AARZUJiTa());
            defpackage.rz0 rz0Var = new defpackage.rz0();
            defpackage.f9 f9Var = uLnPvzwk.fnWB2E7cs;
            f9Var.getClass();
            defpackage.ib0 ib0Var = new defpackage.ib0(min, min);
            f9Var.IHQe1A4L2xu.oh6vYeIP(ib0Var);
            rz0Var.adDC3e2L = ib0Var;
            defpackage.yc0 yc0Var = uLnPvzwk.EgCjBq0SZwJ.IHQe1A4L2xu;
            if (yc0Var.AARZUJiTa().ez2rX8ReCYw.isEmpty()) {
                i3 = 0;
            } else {
                defpackage.sc0 AARZUJiTa2 = yc0Var.AARZUJiTa();
                int AARZUJiTa3 = (int) (AARZUJiTa2.cnag84Bm == defpackage.ks0.adDC3e2L ? AARZUJiTa2.AARZUJiTa() & 4294967295L : AARZUJiTa2.AARZUJiTa() >> 32);
                defpackage.sc0 AARZUJiTa4 = yc0Var.AARZUJiTa();
                java.util.List list = AARZUJiTa4.ez2rX8ReCYw;
                if (list.isEmpty()) {
                    size = 0;
                } else {
                    int size2 = list.size();
                    int i7 = 0;
                    for (int i8 = 0; i8 < size2; i8++) {
                        i7 += ((defpackage.tc0) list.get(i8)).ez2rX8ReCYw;
                    }
                    size = (i7 / list.size()) + AARZUJiTa4.G3OKOH3wZRC;
                }
                if (size != 0 && (i4 = AARZUJiTa3 / size) >= 1) {
                    i3 = i4;
                }
            }
            int i9 = i3 * 2;
            int i10 = uLnPvzwk.EgCjBq0SZwJ.IHQe1A4L2xu.AARZUJiTa().SyNS6RMn;
            if (i9 > i10) {
                i9 = i10;
            }
            while (obj == null && uLnPvzwk.UVjEelCZ((defpackage.ib0) rz0Var.adDC3e2L, i6) && i2 < i9) {
                defpackage.ib0 ib0Var2 = (defpackage.ib0) rz0Var.adDC3e2L;
                int i11 = ib0Var2.IHQe1A4L2xu;
                int i12 = ib0Var2.oh6vYeIP;
                if (uLnPvzwk.H6IrRhrpWoH(i6)) {
                    i12++;
                } else {
                    i11--;
                }
                defpackage.f9 f9Var2 = uLnPvzwk.fnWB2E7cs;
                f9Var2.getClass();
                defpackage.ib0 ib0Var3 = new defpackage.ib0(i11, i12);
                f9Var2.IHQe1A4L2xu.oh6vYeIP(ib0Var3);
                uLnPvzwk.fnWB2E7cs.IHQe1A4L2xu.SH1y5HwkJhh((defpackage.ib0) rz0Var.adDC3e2L);
                rz0Var.adDC3e2L = ib0Var3;
                i2++;
                defpackage.w70.D2vUnMij(uLnPvzwk).ez2rX8ReCYw();
                obj = g00Var.AARZUJiTa(new defpackage.lb0(uLnPvzwk, rz0Var, i6));
            }
            uLnPvzwk.fnWB2E7cs.IHQe1A4L2xu.SH1y5HwkJhh((defpackage.ib0) rz0Var.adDC3e2L);
            defpackage.w70.D2vUnMij(uLnPvzwk).ez2rX8ReCYw();
            return obj;
        }
        return null;
    }

    public static final void XZx205DYe(defpackage.di0 di0Var, defpackage.px pxVar, long j, defpackage.g00 g00Var) {
        if (defpackage.l80.EgCjBq0SZwJ(defpackage.l80.G3OKOH3wZRC(di0Var)) != 0.0f) {
            pxVar.getClass();
            di0Var.RmCzwkUxICV(di0Var.lpprD5VAS(Integer.MAX_VALUE));
            return;
        }
        defpackage.l80.G3OKOH3wZRC(di0Var);
        defpackage.bv0 xiZrDbcSW02 = di0Var.xiZrDbcSW0(j);
        g00Var.AARZUJiTa(xiZrDbcSW02);
        pxVar.getClass();
        xiZrDbcSW02.nVhUznk1t();
        xiZrDbcSW02.QUKZkWRtw6();
    }

    public static void Ye0N2xE9Hc(java.lang.String str) {
        defpackage.cf cfVar = new defpackage.cf(defpackage.fx0.ez2rX8ReCYw("lateinit property ", str, " has not been initialized"));
        TFRaUu83X3E(cfVar, defpackage.x70.class.getName());
        throw cfVar;
    }

    public static defpackage.d5 abhbClRa(defpackage.d5 d5Var, float f) {
        float f2 = ((defpackage.e5) d5Var.AARZUJiTa).IHQe1A4L2xu;
        return new defpackage.d5(d5Var.adDC3e2L, java.lang.Float.valueOf(f), new defpackage.e5(f2), d5Var.EXtogiMhuM, d5Var.riuEU0zW4, d5Var.SH1y5HwkJhh);
    }

    public static final void adDC3e2L(java.lang.Object obj, defpackage.mj0 mj0Var, defpackage.tv tvVar, java.lang.String str, defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        defpackage.mj0 mj0Var2;
        defpackage.tv tvVar2;
        t10Var.QUKZkWRtw6(-513216493);
        int i2 = (t10Var.xiZrDbcSW0(obj) ? 4 : 2) | i | 432;
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 9363) != 9362)) {
            defpackage.lj1 mAr5m2L7gYDP = defpackage.w70.mAr5m2L7gYDP(0, 7, null);
            defpackage.li1 r1MBDhnF2 = defpackage.qi1.r1MBDhnF(obj, str, t10Var, (i2 & 14) | 48);
            defpackage.jj0 jj0Var = defpackage.jj0.IHQe1A4L2xu;
            F7NU4MC0GW(r1MBDhnF2, jj0Var, mAr5m2L7gYDP, null, sfVar, t10Var, 25008);
            mj0Var2 = jj0Var;
            tvVar2 = mAr5m2L7gYDP;
        } else {
            t10Var.WLpAkxCo();
            mj0Var2 = mj0Var;
            tvVar2 = tvVar;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.ik(obj, mj0Var2, tvVar2, str, sfVar, i);
        }
    }

    public static void cnag84Bm(java.lang.Throwable th, java.lang.Throwable th2) {
        th.getClass();
        th2.getClass();
        if (th != th2) {
            java.lang.Integer num = defpackage.r80.IHQe1A4L2xu;
            if (num == null || num.intValue() >= 19) {
                th.addSuppressed(th2);
                return;
            }
            java.lang.reflect.Method method = defpackage.fv0.IHQe1A4L2xu;
            if (method != null) {
                method.invoke(th, th2);
            }
        }
    }

    public static final void ez2rX8ReCYw(final defpackage.vz vzVar, defpackage.mj0 mj0Var, boolean z, defpackage.e91 e91Var, defpackage.da daVar, defpackage.at0 at0Var, final defpackage.sf sfVar, defpackage.t10 t10Var, final int i, final int i2) {
        boolean z2;
        int i3;
        final defpackage.mj0 mj0Var2;
        final defpackage.e91 e91Var2;
        final defpackage.da daVar2;
        final defpackage.at0 at0Var2;
        final boolean z3;
        defpackage.da daVar3;
        int i4;
        boolean z4;
        defpackage.e91 e91Var3;
        defpackage.mj0 mj0Var3;
        defpackage.da daVar4;
        t10Var.QUKZkWRtw6(-1061374109);
        int i5 = i | (t10Var.EXtogiMhuM(vzVar) ? 4 : 2);
        int i6 = i5 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i5 | 432;
            z2 = z;
        } else {
            z2 = z;
            i3 = i6 | (t10Var.AARZUJiTa(z2) ? 256 : 128);
        }
        int i8 = i3 | 115024896;
        if (t10Var.lpprD5VAS(i8 & 1, (306783379 & i8) != 306783378)) {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) == 0 || t10Var.NHJTzaLwkd()) {
                boolean z5 = i7 == 0 ? z2 : true;
                defpackage.ct0 ct0Var = defpackage.ea.IHQe1A4L2xu;
                defpackage.e91 IHQe1A4L2xu2 = defpackage.j91.IHQe1A4L2xu(defpackage.fm.IHQe1A4L2xu, t10Var);
                defpackage.fe feVar = (defpackage.fe) t10Var.SH1y5HwkJhh(defpackage.he.IHQe1A4L2xu);
                defpackage.da daVar5 = feVar.QUKZkWRtw6;
                if (daVar5 == null) {
                    long j = defpackage.ae.adDC3e2L;
                    daVar3 = new defpackage.da(j, defpackage.he.r1MBDhnF(feVar, defpackage.ge.JlrlGoKF), j, defpackage.ae.oh6vYeIP(defpackage.he.r1MBDhnF(feVar, defpackage.w70.lpprD5VAS), defpackage.w70.hkbnNdmy));
                    feVar.QUKZkWRtw6 = daVar3;
                } else {
                    daVar3 = daVar5;
                }
                i4 = i8 & (-64513);
                at0Var2 = defpackage.ea.oh6vYeIP;
                z4 = z5;
                e91Var3 = IHQe1A4L2xu2;
                mj0Var3 = defpackage.jj0.IHQe1A4L2xu;
                daVar4 = daVar3;
            } else {
                t10Var.WLpAkxCo();
                e91Var3 = e91Var;
                daVar4 = daVar;
                at0Var2 = at0Var;
                i4 = i8 & (-64513);
                z4 = z2;
                mj0Var3 = mj0Var;
            }
            t10Var.G3OKOH3wZRC();
            r1MBDhnF(vzVar, mj0Var3, z4, e91Var3, daVar4, null, null, at0Var2, sfVar, t10Var, i4 & 2147483646, 0);
            e91Var2 = e91Var3;
            daVar2 = daVar4;
            mj0Var2 = mj0Var3;
            z3 = z4;
        } else {
            t10Var.WLpAkxCo();
            mj0Var2 = mj0Var;
            e91Var2 = e91Var;
            daVar2 = daVar;
            at0Var2 = at0Var;
            z3 = z2;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(mj0Var2, z3, e91Var2, daVar2, at0Var2, sfVar, i, i2) { // from class: la
                public final /* synthetic */ boolean AARZUJiTa;
                public final /* synthetic */ defpackage.e91 EXtogiMhuM;
                public final /* synthetic */ int JlrlGoKF;
                public final /* synthetic */ defpackage.at0 SH1y5HwkJhh;
                public final /* synthetic */ defpackage.sf ez2rX8ReCYw;
                public final /* synthetic */ defpackage.da riuEU0zW4;
                public final /* synthetic */ defpackage.mj0 xiZrDbcSW0;

                {
                    this.JlrlGoKF = i2;
                }

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(805306369);
                    defpackage.x70.ez2rX8ReCYw(defpackage.vz.this, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, this.riuEU0zW4, this.SH1y5HwkJhh, this.ez2rX8ReCYw, (defpackage.t10) obj, hyxIchWRW, this.JlrlGoKF);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final void fnWB2E7cs(defpackage.ea1 ea1Var, java.util.ArrayList arrayList, int i) {
        boolean JlrlGoKF2 = ea1Var.JlrlGoKF(i);
        int[] iArr = ea1Var.oh6vYeIP;
        if (JlrlGoKF2) {
            arrayList.add(ea1Var.SyNS6RMn(i));
            return;
        }
        int i2 = iArr[(i * 5) + 3] + i;
        for (int i3 = i + 1; i3 < i2; i3 += iArr[(i3 * 5) + 3]) {
            fnWB2E7cs(ea1Var, arrayList, i3);
        }
    }

    public static final boolean frpfPPIgqM9O(long j) {
        return (j & 2) != 0;
    }

    public static final void hkbnNdmy(defpackage.lj ljVar, java.lang.Object obj) {
        if (obj == riuEU0zW4) {
            return;
        }
        if (!(obj instanceof defpackage.pg1)) {
            java.lang.Object EgCjBq0SZwJ = ljVar.EgCjBq0SZwJ(ez2rX8ReCYw, null);
            EgCjBq0SZwJ.getClass();
            ((defpackage.kg1) EgCjBq0SZwJ).IHQe1A4L2xu(obj);
            return;
        }
        defpackage.pg1 pg1Var = (defpackage.pg1) obj;
        defpackage.kg1[] kg1VarArr = pg1Var.r1MBDhnF;
        int length = kg1VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            defpackage.kg1 kg1Var = kg1VarArr[length];
            kg1Var.getClass();
            kg1Var.IHQe1A4L2xu(pg1Var.oh6vYeIP[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    public static final defpackage.mj0 hyxIchWRW(defpackage.mj0 mj0Var, defpackage.g00 g00Var) {
        return mj0Var.r1MBDhnF(new defpackage.mi(g00Var));
    }

    public static int kNAkVymC(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static defpackage.mj0 kd6TUFXn(defpackage.mj0 mj0Var, defpackage.zk0 zk0Var, defpackage.k21 k21Var, boolean z, defpackage.vz vzVar) {
        return mj0Var.r1MBDhnF(k21Var != null ? new defpackage.bd(vzVar, k21Var, zk0Var, false, z) : k21Var == null ? new defpackage.bd(vzVar, null, zk0Var, false, z) : zk0Var != null ? defpackage.c50.IHQe1A4L2xu(defpackage.jj0.IHQe1A4L2xu, zk0Var, k21Var).r1MBDhnF(new defpackage.bd(vzVar, null, zk0Var, false, z)) : new defpackage.ah(new defpackage.cd(k21Var, z, vzVar)));
    }

    public static defpackage.j11 lpprD5VAS(int i, int i2, long j, long j2) {
        long min = java.lang.Math.min(j, j2);
        if (i >= i2) {
            return new defpackage.j11(i, j2, 0L);
        }
        int i3 = (int) ((j2 - min) / 240000);
        int i4 = i + i3;
        int i5 = i4 > i2 ? i2 : i4;
        if (i5 >= i2) {
            return new defpackage.j11(i5, j2, 0L);
        }
        long j3 = (i3 * 240000) + min;
        return new defpackage.j11(i5, j3, defpackage.x80.DFo87pBq1E5((240000 + j3) - j2, 0L, 240000L));
    }

    public static java.util.ArrayList mAr5m2L7gYDP(defpackage.n10 n10Var) {
        n10Var.getClass();
        java.util.List list = defpackage.p80.IHQe1A4L2xu;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            if (p4kuH6PDtgom((defpackage.o80) obj, n10Var.EXtogiMhuM)) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            java.lang.Object obj2 = arrayList.get(i);
            i++;
            arrayList2.add(((defpackage.o80) obj2).F7NU4MC0GW);
        }
        java.util.Set FisHbM7NmV = defpackage.td.FisHbM7NmV(arrayList2);
        java.util.List list2 = defpackage.d01.IHQe1A4L2xu;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj3 : list2) {
            defpackage.a01 a01Var = (defpackage.a01) obj3;
            if (FisHbM7NmV.contains(a01Var.r1MBDhnF) && n10Var.oh6vYeIP(a01Var.IHQe1A4L2xu) <= 0) {
                arrayList3.add(obj3);
            }
        }
        return arrayList3;
    }

    public static final float nBH8hAHy(long j) {
        return java.lang.Float.intBitsToFloat((int) (j >> 32));
    }

    public static final java.lang.Object nVhUznk1t(defpackage.lj ljVar, java.lang.Object obj) {
        if (obj == null) {
            obj = QPwENk36pDC(ljVar);
        }
        if (obj == 0) {
            return riuEU0zW4;
        }
        if (!(obj instanceof java.lang.Integer)) {
            return ((defpackage.kg1) obj).r1MBDhnF();
        }
        return ljVar.EgCjBq0SZwJ(JlrlGoKF, new defpackage.pg1(((java.lang.Number) obj).intValue(), ljVar));
    }

    public static defpackage.d5 oh6vYeIP(float f, int i) {
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        return new defpackage.d5(defpackage.gq1.QoRHpC4k, java.lang.Float.valueOf(0.0f), new defpackage.e5(f), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static boolean p4kuH6PDtgom(defpackage.o80 o80Var, java.util.Map map) {
        int i;
        o80Var.getClass();
        map.getClass();
        int i2 = o80Var.adDC3e2L;
        if (i2 != 0) {
            for (defpackage.o80 o80Var2 : defpackage.p80.IHQe1A4L2xu) {
                if (o80Var2.adDC3e2L == i2 - 1) {
                    java.util.List list = (java.util.List) defpackage.yh0.p4kuH6PDtgom(o80Var2.F7NU4MC0GW, defpackage.d01.r1MBDhnF);
                    if (list == null || !list.isEmpty()) {
                        java.util.Iterator it = list.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            java.lang.Integer num = (java.lang.Integer) map.get(((defpackage.a01) it.next()).IHQe1A4L2xu);
                            if ((num != null ? num.intValue() : 0) > 0 && (i = i + 1) < 0) {
                                defpackage.fm.lpprD5VAS();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    if (i < 6) {
                        return false;
                    }
                }
            }
            throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void r1MBDhnF(defpackage.vz vzVar, defpackage.mj0 mj0Var, boolean z, defpackage.e91 e91Var, defpackage.da daVar, defpackage.ia iaVar, defpackage.s8 s8Var, defpackage.at0 at0Var, defpackage.sf sfVar, defpackage.t10 t10Var, int i, int i2) {
        int i3;
        defpackage.ia iaVar2;
        int i4;
        defpackage.at0 at0Var2;
        int i5;
        int i6;
        defpackage.ia iaVar3;
        defpackage.at0 at0Var3;
        defpackage.s8 s8Var2;
        defpackage.az0 kd6TUFXn;
        int i7;
        defpackage.s8 s8Var3;
        defpackage.at0 at0Var4;
        defpackage.ia iaVar4;
        java.lang.Object mAr5m2L7gYDP;
        java.lang.Object obj;
        long j;
        defpackage.zk0 zk0Var;
        long j2;
        defpackage.w3 w3Var;
        java.lang.Object obj2;
        defpackage.at0 at0Var5;
        defpackage.s8 s8Var4;
        boolean z2;
        defpackage.ia iaVar5;
        defpackage.d5 d5Var;
        java.lang.Object mAr5m2L7gYDP2;
        defpackage.zk0 zk0Var2;
        int i8;
        t10Var.QUKZkWRtw6(-1310015664);
        if ((i & 6) == 0) {
            i3 = (t10Var.EXtogiMhuM(vzVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= t10Var.xiZrDbcSW0(mj0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= t10Var.AARZUJiTa(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= t10Var.xiZrDbcSW0(e91Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= t10Var.xiZrDbcSW0(daVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                iaVar2 = iaVar;
                if (t10Var.xiZrDbcSW0(iaVar2)) {
                    i8 = 131072;
                    i3 |= i8;
                }
            } else {
                iaVar2 = iaVar;
            }
            i8 = 65536;
            i3 |= i8;
        } else {
            iaVar2 = iaVar;
        }
        int i9 = i2 & 64;
        if (i9 != 0) {
            i3 |= 1572864;
        } else if ((1572864 & i) == 0) {
            i3 |= t10Var.xiZrDbcSW0(s8Var) ? 1048576 : 524288;
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
                at0Var2 = at0Var;
            } else {
                at0Var2 = at0Var;
                if ((i & 12582912) == 0) {
                    i3 |= t10Var.xiZrDbcSW0(at0Var2) ? 8388608 : 4194304;
                }
            }
            int i10 = i3;
            if ((i2 & 256) == 0) {
                i5 = i10 | 100663296;
            } else if ((i & 100663296) == 0) {
                i5 = i10 | (t10Var.xiZrDbcSW0(null) ? 67108864 : 33554432);
            } else {
                i5 = i10;
            }
            if ((i & 805306368) == 0) {
                i5 |= t10Var.EXtogiMhuM(sfVar) ? 536870912 : 268435456;
            }
            i6 = i5;
            boolean z3 = true;
            if (t10Var.lpprD5VAS(i6 & 1, (i5 & 306783379) == 306783378)) {
                t10Var.WLpAkxCo();
                iaVar3 = iaVar2;
                at0Var3 = at0Var2;
                s8Var2 = s8Var;
            } else {
                t10Var.Ye0N2xE9Hc();
                if ((i & 1) == 0 || t10Var.NHJTzaLwkd()) {
                    if ((i2 & 32) != 0) {
                        defpackage.ct0 ct0Var = defpackage.ea.IHQe1A4L2xu;
                        iaVar2 = new defpackage.ia(defpackage.h1.EgCjBq0SZwJ);
                        i7 = i6 & (-458753);
                    } else {
                        i7 = i6;
                    }
                    defpackage.s8 s8Var5 = i9 != 0 ? null : s8Var;
                    if (i4 != 0) {
                        at0Var2 = defpackage.ea.IHQe1A4L2xu;
                    }
                    s8Var3 = s8Var5;
                } else {
                    t10Var.WLpAkxCo();
                    if ((i2 & 32) != 0) {
                        i7 = i6 & (-458753);
                        s8Var3 = s8Var;
                    } else {
                        s8Var3 = s8Var;
                        at0Var4 = at0Var2;
                        i7 = i6;
                        iaVar4 = iaVar2;
                        t10Var.G3OKOH3wZRC();
                        t10Var.AsxAYCCkb3Hi(1691738187);
                        mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
                        obj = defpackage.bh.IHQe1A4L2xu;
                        if (mAr5m2L7gYDP == obj) {
                            mAr5m2L7gYDP = new defpackage.zk0();
                            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
                        }
                        defpackage.zk0 zk0Var3 = (defpackage.zk0) mAr5m2L7gYDP;
                        t10Var.QoRHpC4k(false);
                        long j3 = !z ? daVar.IHQe1A4L2xu : daVar.r1MBDhnF;
                        long j4 = !z ? daVar.oh6vYeIP : daVar.F7NU4MC0GW;
                        if (iaVar4 != null) {
                            t10Var.AsxAYCCkb3Hi(1691921830);
                            t10Var.QoRHpC4k(false);
                            at0Var5 = at0Var4;
                            zk0Var = zk0Var3;
                            iaVar5 = iaVar4;
                            j2 = j4;
                            s8Var4 = s8Var3;
                            d5Var = null;
                            z2 = false;
                            obj2 = obj;
                        } else {
                            t10Var.AsxAYCCkb3Hi(-499611205);
                            int i11 = ((i7 >> 6) & 14) | ((i7 >> 9) & 896);
                            java.lang.Object mAr5m2L7gYDP3 = t10Var.mAr5m2L7gYDP();
                            if (mAr5m2L7gYDP3 == obj) {
                                mAr5m2L7gYDP3 = new defpackage.gb1();
                                t10Var.OtkytngK3Mr(mAr5m2L7gYDP3);
                            }
                            defpackage.gb1 gb1Var = (defpackage.gb1) mAr5m2L7gYDP3;
                            boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(zk0Var3);
                            defpackage.at0 at0Var6 = at0Var4;
                            java.lang.Object mAr5m2L7gYDP4 = t10Var.mAr5m2L7gYDP();
                            if (xiZrDbcSW02 || mAr5m2L7gYDP4 == obj) {
                                j = j4;
                                mAr5m2L7gYDP4 = new defpackage.ga(zk0Var3, gb1Var, null, 0);
                                t10Var.OtkytngK3Mr(mAr5m2L7gYDP4);
                            } else {
                                j = j4;
                            }
                            defpackage.s21.AARZUJiTa((defpackage.k00) mAr5m2L7gYDP4, t10Var, zk0Var3);
                            defpackage.l70 l70Var = (defpackage.l70) defpackage.td.FyULxpbU8bu(gb1Var);
                            float f = (z && !(l70Var instanceof defpackage.px0) && (l70Var instanceof defpackage.l40)) ? iaVar4.IHQe1A4L2xu : 0.0f;
                            java.lang.Object mAr5m2L7gYDP5 = t10Var.mAr5m2L7gYDP();
                            if (mAr5m2L7gYDP5 == obj) {
                                zk0Var = zk0Var3;
                                mAr5m2L7gYDP5 = new defpackage.w3(new defpackage.uq(f), defpackage.gq1.kd6TUFXn, null, 12);
                                t10Var.OtkytngK3Mr(mAr5m2L7gYDP5);
                            } else {
                                zk0Var = zk0Var3;
                            }
                            defpackage.w3 w3Var2 = (defpackage.w3) mAr5m2L7gYDP5;
                            defpackage.uq uqVar = new defpackage.uq(f);
                            boolean EXtogiMhuM2 = t10Var.EXtogiMhuM(w3Var2) | t10Var.r1MBDhnF(f) | ((((i11 & 14) ^ 6) > 4 && t10Var.AARZUJiTa(z)) || (i11 & 6) == 4);
                            if ((((i11 & 896) ^ 384) <= 256 || !t10Var.xiZrDbcSW0(iaVar4)) && (i11 & 384) != 256) {
                                z3 = false;
                            }
                            boolean EXtogiMhuM3 = EXtogiMhuM2 | z3 | t10Var.EXtogiMhuM(l70Var);
                            java.lang.Object mAr5m2L7gYDP6 = t10Var.mAr5m2L7gYDP();
                            if (EXtogiMhuM3 || mAr5m2L7gYDP6 == obj) {
                                j2 = j;
                                float f2 = f;
                                w3Var = w3Var2;
                                obj2 = obj;
                                at0Var5 = at0Var6;
                                s8Var4 = s8Var3;
                                z2 = false;
                                java.lang.Object haVar = new defpackage.ha(w3Var, f2, z, iaVar4, l70Var, (defpackage.ej) null);
                                iaVar5 = iaVar4;
                                t10Var.OtkytngK3Mr(haVar);
                                mAr5m2L7gYDP6 = haVar;
                            } else {
                                at0Var5 = at0Var6;
                                j2 = j;
                                iaVar5 = iaVar4;
                                w3Var = w3Var2;
                                s8Var4 = s8Var3;
                                z2 = false;
                                obj2 = obj;
                            }
                            defpackage.s21.AARZUJiTa((defpackage.k00) mAr5m2L7gYDP6, t10Var, uqVar);
                            d5Var = w3Var.r1MBDhnF;
                            t10Var.QoRHpC4k(z2);
                        }
                        float f3 = d5Var == null ? ((defpackage.uq) d5Var.xiZrDbcSW0.getValue()).adDC3e2L : 0.0f;
                        mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
                        if (mAr5m2L7gYDP2 == obj2) {
                            mAr5m2L7gYDP2 = new defpackage.JX5fKip1C6(5);
                            t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
                        }
                        java.util.concurrent.atomic.AtomicInteger atomicInteger = defpackage.c71.IHQe1A4L2xu;
                        defpackage.mj0 r1MBDhnF2 = mj0Var.r1MBDhnF(new defpackage.y5((defpackage.g00) mAr5m2L7gYDP2, z2));
                        defpackage.sf XZx205DYe = defpackage.h1.XZx205DYe(-535639973, new defpackage.na(j2, at0Var5, sfVar), t10Var);
                        defpackage.qh qhVar = defpackage.xd1.IHQe1A4L2xu;
                        if (zk0Var != null) {
                            t10Var.AsxAYCCkb3Hi(-1701037204);
                            java.lang.Object mAr5m2L7gYDP7 = t10Var.mAr5m2L7gYDP();
                            if (mAr5m2L7gYDP7 == obj2) {
                                mAr5m2L7gYDP7 = new defpackage.zk0();
                                t10Var.OtkytngK3Mr(mAr5m2L7gYDP7);
                            }
                            t10Var.QoRHpC4k(z2);
                            zk0Var2 = (defpackage.zk0) mAr5m2L7gYDP7;
                        } else {
                            t10Var.AsxAYCCkb3Hi(2023337163);
                            t10Var.QoRHpC4k(z2);
                            zk0Var2 = zk0Var;
                        }
                        defpackage.ly0 ly0Var = defpackage.xd1.IHQe1A4L2xu;
                        float f4 = ((defpackage.uq) t10Var.SH1y5HwkJhh(ly0Var)).adDC3e2L + 0.0f;
                        defpackage.s8 s8Var6 = s8Var4;
                        defpackage.gq1.r1MBDhnF(new defpackage.ny0[]{defpackage.ti.IHQe1A4L2xu.IHQe1A4L2xu(new defpackage.ae(j2)), ly0Var.IHQe1A4L2xu(new defpackage.uq(f4))}, defpackage.h1.XZx205DYe(849208527, new defpackage.vd1(r1MBDhnF2, e91Var, j3, f4, s8Var6, zk0Var2, z, vzVar, f3, XZx205DYe), t10Var), t10Var, 56);
                        at0Var3 = at0Var5;
                        s8Var2 = s8Var6;
                        iaVar3 = iaVar5;
                    }
                }
                at0Var4 = at0Var2;
                iaVar4 = iaVar2;
                t10Var.G3OKOH3wZRC();
                t10Var.AsxAYCCkb3Hi(1691738187);
                mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
                obj = defpackage.bh.IHQe1A4L2xu;
                if (mAr5m2L7gYDP == obj) {
                }
                defpackage.zk0 zk0Var32 = (defpackage.zk0) mAr5m2L7gYDP;
                t10Var.QoRHpC4k(false);
                long j32 = !z ? daVar.IHQe1A4L2xu : daVar.r1MBDhnF;
                if (!z) {
                }
                if (iaVar4 != null) {
                }
                if (d5Var == null) {
                }
                mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
                if (mAr5m2L7gYDP2 == obj2) {
                }
                java.util.concurrent.atomic.AtomicInteger atomicInteger2 = defpackage.c71.IHQe1A4L2xu;
                defpackage.mj0 r1MBDhnF22 = mj0Var.r1MBDhnF(new defpackage.y5((defpackage.g00) mAr5m2L7gYDP2, z2));
                defpackage.sf XZx205DYe2 = defpackage.h1.XZx205DYe(-535639973, new defpackage.na(j2, at0Var5, sfVar), t10Var);
                defpackage.qh qhVar2 = defpackage.xd1.IHQe1A4L2xu;
                if (zk0Var != null) {
                }
                defpackage.ly0 ly0Var2 = defpackage.xd1.IHQe1A4L2xu;
                float f42 = ((defpackage.uq) t10Var.SH1y5HwkJhh(ly0Var2)).adDC3e2L + 0.0f;
                defpackage.s8 s8Var62 = s8Var4;
                defpackage.gq1.r1MBDhnF(new defpackage.ny0[]{defpackage.ti.IHQe1A4L2xu.IHQe1A4L2xu(new defpackage.ae(j2)), ly0Var2.IHQe1A4L2xu(new defpackage.uq(f42))}, defpackage.h1.XZx205DYe(849208527, new defpackage.vd1(r1MBDhnF22, e91Var, j32, f42, s8Var62, zk0Var2, z, vzVar, f3, XZx205DYe2), t10Var), t10Var, 56);
                at0Var3 = at0Var5;
                s8Var2 = s8Var62;
                iaVar3 = iaVar5;
            }
            kd6TUFXn = t10Var.kd6TUFXn();
            if (kd6TUFXn == null) {
                kd6TUFXn.F7NU4MC0GW = new defpackage.ka(vzVar, mj0Var, z, e91Var, daVar, iaVar3, s8Var2, at0Var3, sfVar, i, i2);
                return;
            }
            return;
        }
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        int i102 = i3;
        if ((i2 & 256) == 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i6 = i5;
        boolean z32 = true;
        if (t10Var.lpprD5VAS(i6 & 1, (i5 & 306783379) == 306783378)) {
        }
        kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn == null) {
        }
    }

    public static final void riuEU0zW4(final defpackage.mj0 mj0Var, final defpackage.h6 h6Var, final defpackage.j6 j6Var, defpackage.d8 d8Var, int i, int i2, final defpackage.sf sfVar, defpackage.t10 t10Var, final int i3) {
        final defpackage.d8 d8Var2;
        final int i4;
        final int i5;
        t10Var.QUKZkWRtw6(-1303174015);
        int i6 = i3 | 224256;
        if (t10Var.lpprD5VAS(i6 & 1, (599187 & i6) != 599186)) {
            defpackage.d8 d8Var3 = defpackage.n.cnag84Bm;
            EXtogiMhuM(mj0Var, h6Var, j6Var, defpackage.n.wll2JLbTBC2, sfVar, t10Var, 14380470);
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
            d8Var2 = d8Var3;
        } else {
            t10Var.WLpAkxCo();
            d8Var2 = d8Var;
            i4 = i;
            i5 = i2;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00(h6Var, j6Var, d8Var2, i4, i5, sfVar, i3) { // from class: jx
                public final /* synthetic */ defpackage.j6 AARZUJiTa;
                public final /* synthetic */ defpackage.d8 EXtogiMhuM;
                public final /* synthetic */ int SH1y5HwkJhh;
                public final /* synthetic */ defpackage.sf ez2rX8ReCYw;
                public final /* synthetic */ int riuEU0zW4;
                public final /* synthetic */ defpackage.h6 xiZrDbcSW0;

                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    int hyxIchWRW = defpackage.a70.hyxIchWRW(1573303);
                    defpackage.x70.riuEU0zW4(defpackage.mj0.this, this.xiZrDbcSW0, this.AARZUJiTa, this.EXtogiMhuM, this.riuEU0zW4, this.SH1y5HwkJhh, this.ez2rX8ReCYw, (defpackage.t10) obj, hyxIchWRW);
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static boolean v5iciZok() {
        try {
            if (defpackage.v0.GhHh9OOt4I == null) {
                defpackage.v0.GhHh9OOt4I = java.lang.Class.forName("android.os.SystemProperties");
            }
            if (defpackage.v0.lG6e1STSc2G == null) {
                java.lang.Class cls = defpackage.v0.GhHh9OOt4I;
                defpackage.v0.lG6e1STSc2G = cls != null ? cls.getDeclaredMethod("getBoolean", java.lang.String.class, java.lang.Boolean.TYPE) : null;
            }
            java.lang.reflect.Method method = defpackage.v0.lG6e1STSc2G;
            java.lang.Object invoke = method != null ? method.invoke(null, "debug.layout", java.lang.Boolean.FALSE) : null;
            return QoRHpC4k(invoke instanceof java.lang.Boolean ? (java.lang.Boolean) invoke : null, java.lang.Boolean.TRUE);
        } catch (java.lang.Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0085, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x009f, code lost:
    
        if (r8 > 4611686018427387903L) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long wKlPRKlRnfqr(long j, defpackage.bs bsVar) {
        long j2;
        java.util.concurrent.TimeUnit timeUnit = bsVar.adDC3e2L;
        java.util.concurrent.TimeUnit timeUnit2 = java.util.concurrent.TimeUnit.NANOSECONDS;
        long convert = timeUnit.convert(4611686018426999999L, timeUnit2);
        if ((-convert) <= j && j <= convert) {
            long convert2 = timeUnit2.convert(j, timeUnit);
            defpackage.ad1 ad1Var = defpackage.zr.adDC3e2L;
            long j3 = convert2 << 1;
            int i = defpackage.as.IHQe1A4L2xu;
            return j3;
        }
        if (bsVar.compareTo(defpackage.bs.MILLISECONDS) < 0) {
            return NHJTzaLwkd(defpackage.x80.DFo87pBq1E5(java.util.concurrent.TimeUnit.MILLISECONDS.convert(j, timeUnit), -4611686018427387903L, 4611686018427387903L));
        }
        long signum = java.lang.Long.signum(j);
        if (j < -9223372036854775807L) {
            j = -9223372036854775807L;
        }
        long abs = java.lang.Math.abs(j);
        int ordinal = bsVar.ordinal();
        long j4 = 0;
        if (ordinal == 2) {
            j2 = 1;
        } else if (ordinal == 3) {
            j2 = 1000;
        } else if (ordinal == 4) {
            j2 = 60000;
        } else if (ordinal == 5) {
            j2 = 3600000;
        } else {
            if (ordinal != 6) {
                defpackage.db.xiZrDbcSW0(bsVar, "Wrong unit for millisMultiplier: ");
                return 0L;
            }
            j2 = 86400000;
        }
        if (abs != 0) {
            j4 = 4611686018427387903L;
            if (abs == 1) {
                if (j2 <= 4611686018427387903L) {
                    abs = j2;
                    return NHJTzaLwkd(signum * abs);
                }
            } else if (j2 != 1) {
                int numberOfLeadingZeros = (128 - java.lang.Long.numberOfLeadingZeros(abs)) - java.lang.Long.numberOfLeadingZeros(j2);
                if (numberOfLeadingZeros < 63) {
                    abs *= j2;
                } else if (numberOfLeadingZeros <= 63) {
                    abs *= j2;
                }
                return NHJTzaLwkd(signum * abs);
            }
        }
        abs = j4;
        return NHJTzaLwkd(signum * abs);
    }

    public static final defpackage.mj0 wll2JLbTBC2(defpackage.lc0 lc0Var, defpackage.f9 f9Var, defpackage.ks0 ks0Var) {
        return new defpackage.jb0(lc0Var, f9Var, ks0Var);
    }

    public static defpackage.tn xiZrDbcSW0() {
        return new defpackage.tn(1.0f, 1.0f);
    }

    public static boolean yIx6ChFVk(char c) {
        return java.lang.Character.isWhitespace(c) || java.lang.Character.isSpaceChar(c);
    }
}
