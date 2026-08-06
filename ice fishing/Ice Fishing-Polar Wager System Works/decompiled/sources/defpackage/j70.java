package defpackage;

/* loaded from: classes.dex */
public abstract class j70 {
    public static final /* synthetic */ int F7NU4MC0GW = 0;
    public static boolean IHQe1A4L2xu = false;
    public static java.lang.reflect.Method oh6vYeIP;
    public static final /* synthetic */ int r1MBDhnF = 0;

    public static final void AARZUJiTa(defpackage.wk0 wk0Var, int i) {
        if (wk0Var.oh6vYeIP == 0 || !(wk0Var.oh6vYeIP(0) == i || wk0Var.oh6vYeIP(wk0Var.oh6vYeIP - 1) == i)) {
            int i2 = wk0Var.oh6vYeIP;
            wk0Var.IHQe1A4L2xu(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int oh6vYeIP2 = wk0Var.oh6vYeIP(i3);
                if (i <= oh6vYeIP2) {
                    break;
                }
                wk0Var.adDC3e2L(i2, oh6vYeIP2);
                i2 = i3;
            }
            wk0Var.adDC3e2L(i2, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean C0U8sNJm(defpackage.gy gyVar, defpackage.c4 c4Var) {
        defpackage.gy[] gyVarArr = new defpackage.gy[16];
        if (!gyVar.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitChildren called on an unattached node");
        }
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
        defpackage.lj0 lj0Var = gyVar.adDC3e2L;
        defpackage.lj0 lj0Var2 = lj0Var.SH1y5HwkJhh;
        if (lj0Var2 == null) {
            defpackage.w70.EXtogiMhuM(xl0Var, lj0Var);
        } else {
            xl0Var.oh6vYeIP(lj0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = xl0Var.AARZUJiTa;
            if (i2 == 0) {
                break;
            }
            defpackage.lj0 lj0Var3 = (defpackage.lj0) xl0Var.ez2rX8ReCYw(i2 - 1);
            if ((lj0Var3.EXtogiMhuM & 1024) == 0) {
                defpackage.w70.EXtogiMhuM(xl0Var, lj0Var3);
            } else {
                while (true) {
                    if (lj0Var3 == null) {
                        break;
                    }
                    if ((lj0Var3.AARZUJiTa & 1024) != 0) {
                        defpackage.xl0 xl0Var2 = null;
                        while (lj0Var3 != null) {
                            if (lj0Var3 instanceof defpackage.gy) {
                                defpackage.gy gyVar2 = (defpackage.gy) lj0Var3;
                                int i3 = i + 1;
                                if (gyVarArr.length < i3) {
                                    int length = gyVarArr.length;
                                    ?? r10 = new java.lang.Object[java.lang.Math.max(i3, length * 2)];
                                    java.lang.System.arraycopy(gyVarArr, 0, r10, 0, length);
                                    gyVarArr = r10;
                                }
                                gyVarArr[i] = gyVar2;
                                i = i3;
                            } else if ((lj0Var3.AARZUJiTa & 1024) != 0 && (lj0Var3 instanceof defpackage.ln)) {
                                int i4 = 0;
                                for (defpackage.lj0 lj0Var4 = ((defpackage.ln) lj0Var3).fnWB2E7cs; lj0Var4 != null; lj0Var4 = lj0Var4.SH1y5HwkJhh) {
                                    if ((lj0Var4.AARZUJiTa & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lj0Var3 = lj0Var4;
                                        } else {
                                            if (xl0Var2 == null) {
                                                xl0Var2 = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lj0Var3 != null) {
                                                xl0Var2.oh6vYeIP(lj0Var3);
                                                lj0Var3 = null;
                                            }
                                            xl0Var2.oh6vYeIP(lj0Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            lj0Var3 = defpackage.w70.riuEU0zW4(xl0Var2);
                        }
                    } else {
                        lj0Var3 = lj0Var3.SH1y5HwkJhh;
                    }
                }
            }
        }
        java.util.Arrays.sort(gyVarArr, 0, i, defpackage.hy.oh6vYeIP);
        for (int i5 = 0; i5 < i; i5++) {
            defpackage.gy gyVar3 = gyVarArr[i5];
            if (defpackage.mj1.wll2JLbTBC2(gyVar3) && QoRHpC4k(gyVar3, c4Var)) {
                return true;
            }
        }
        return false;
    }

    public static final int D2vUnMij(defpackage.wk0 wk0Var) {
        int oh6vYeIP2;
        int i = wk0Var.oh6vYeIP;
        int oh6vYeIP3 = wk0Var.oh6vYeIP(0);
        while (wk0Var.oh6vYeIP != 0 && wk0Var.oh6vYeIP(0) == oh6vYeIP3) {
            wk0Var.adDC3e2L(0, wk0Var.r1MBDhnF());
            wk0Var.F7NU4MC0GW(wk0Var.oh6vYeIP - 1);
            int i2 = wk0Var.oh6vYeIP;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int oh6vYeIP4 = wk0Var.oh6vYeIP(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int oh6vYeIP5 = wk0Var.oh6vYeIP(i6);
                if (i5 >= i2 || (oh6vYeIP2 = wk0Var.oh6vYeIP(i5)) <= oh6vYeIP5) {
                    if (oh6vYeIP5 > oh6vYeIP4) {
                        wk0Var.adDC3e2L(i4, oh6vYeIP5);
                        wk0Var.adDC3e2L(i6, oh6vYeIP4);
                        i4 = i6;
                    }
                } else if (oh6vYeIP2 > oh6vYeIP4) {
                    wk0Var.adDC3e2L(i4, oh6vYeIP2);
                    wk0Var.adDC3e2L(i5, oh6vYeIP4);
                    i4 = i5;
                }
            }
        }
        return oh6vYeIP3;
    }

    public static final long DFo87pBq1E5() {
        return java.lang.Thread.currentThread().getId();
    }

    public static float EXtogiMhuM(float[] fArr) {
        if (fArr.length < 6) {
            return 0.0f;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[2];
        float f4 = fArr[3];
        float f5 = fArr[4];
        float f6 = fArr[5];
        float f7 = (((((f3 * f6) + ((f2 * f5) + (f * f4))) - (f4 * f5)) - (f2 * f3)) - (f * f6)) * 0.5f;
        return f7 < 0.0f ? -f7 : f7;
    }

    public static defpackage.fe EgCjBq0SZwJ(defpackage.t10 t10Var) {
        return (defpackage.fe) t10Var.SH1y5HwkJhh(defpackage.he.IHQe1A4L2xu);
    }

    public static final java.lang.Object[] F7NU4MC0GW(java.lang.Object[] objArr, int i, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length + 2];
        defpackage.t6.RmCzwkUxICV(objArr, objArr2, 0, i, 6);
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr2, i + 2, i, objArr.length);
        objArr2[i] = obj;
        objArr2[i + 1] = obj2;
        return objArr2;
    }

    public static final boolean G3OKOH3wZRC(defpackage.gy gyVar, defpackage.gy gyVar2, int i, defpackage.c4 c4Var) {
        if (v5iciZok(gyVar, gyVar2, i, c4Var)) {
            return true;
        }
        java.lang.Boolean bool = (java.lang.Boolean) defpackage.x70.WLpAkxCo(gyVar, i, new defpackage.xq0(((defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(gyVar)).getFocusOwner()).xiZrDbcSW0(), gyVar, gyVar2, i, c4Var, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final void IHQe1A4L2xu(defpackage.sf sfVar, defpackage.t10 t10Var, int i) {
        t10Var.QUKZkWRtw6(-709502251);
        int i2 = 2;
        byte b = 0;
        if (t10Var.lpprD5VAS(i & 1, (i & 3) != 2)) {
            defpackage.nc1 nc1Var = defpackage.w31.IHQe1A4L2xu;
            defpackage.t31 t31Var = (defpackage.t31) t10Var.SH1y5HwkJhh(nc1Var);
            defpackage.s31 nBH8hAHy = nBH8hAHy(t10Var);
            java.lang.Object[] objArr = {t31Var};
            defpackage.F7NU4MC0GW f7nu4mc0gw = new defpackage.F7NU4MC0GW(24, new defpackage.e6(14, b), new defpackage.r1MBDhnF(11, t31Var, nBH8hAHy));
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(t31Var) | t10Var.EXtogiMhuM(nBH8hAHy);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
                mAr5m2L7gYDP = new defpackage.DSux0S2nxMSk(6, t31Var, nBH8hAHy);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.bd0 bd0Var = (defpackage.bd0) defpackage.e90.NHJTzaLwkd(objArr, f7nu4mc0gw, (defpackage.vz) mAr5m2L7gYDP, t10Var, 0);
            defpackage.gq1.oh6vYeIP(nc1Var.IHQe1A4L2xu(bd0Var), defpackage.h1.XZx205DYe(-412824043, new defpackage.oKqPTyA2(9, sfVar, bd0Var), t10Var), t10Var, 56);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.e(sfVar, i, i2);
        }
    }

    public static android.text.StaticLayout JlrlGoKF(java.lang.CharSequence charSequence, android.text.TextPaint textPaint, int i, int i2, android.text.TextDirectionHeuristic textDirectionHeuristic, android.text.Layout.Alignment alignment, int i3, android.text.TextUtils.TruncateAt truncateAt, int i4, int i5, boolean z, int i6, int i7, int i8, int i9) {
        android.graphics.text.LineBreakConfig.Builder lineBreakStyle;
        android.graphics.text.LineBreakConfig.Builder lineBreakWordStyle;
        android.graphics.text.LineBreakConfig build;
        if (i2 < 0) {
            defpackage.y50.IHQe1A4L2xu("invalid start value");
        }
        int length = charSequence.length();
        if (i2 < 0 || i2 > length) {
            defpackage.y50.IHQe1A4L2xu("invalid end value");
        }
        if (i3 < 0) {
            defpackage.y50.IHQe1A4L2xu("invalid maxLines value");
        }
        if (i < 0) {
            defpackage.y50.IHQe1A4L2xu("invalid width value");
        }
        if (i4 < 0) {
            defpackage.y50.IHQe1A4L2xu("invalid ellipsizedWidth value");
        }
        android.text.StaticLayout.Builder obtain = android.text.StaticLayout.Builder.obtain(charSequence, 0, i2, textPaint, i);
        obtain.setTextDirection(textDirectionHeuristic);
        obtain.setAlignment(alignment);
        obtain.setMaxLines(i3);
        obtain.setEllipsize(truncateAt);
        obtain.setEllipsizedWidth(i4);
        obtain.setLineSpacing(0.0f, 1.0f);
        obtain.setIncludePad(z);
        obtain.setBreakStrategy(i6);
        obtain.setHyphenationFrequency(i9);
        obtain.setIndents(null, null);
        int i10 = android.os.Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            obtain.setJustificationMode(i5);
        }
        if (i10 >= 28) {
            obtain.setUseLineSpacingFromFallbacks(true);
        }
        if (i10 >= 33) {
            lineBreakStyle = defpackage.sJNB7mCer5.IHQe1A4L2xu().setLineBreakStyle(i7);
            lineBreakWordStyle = lineBreakStyle.setLineBreakWordStyle(i8);
            build = lineBreakWordStyle.build();
            obtain.setLineBreakConfig(build);
        }
        if (i10 >= 35) {
            obtain.setUseBoundsForWidth(false);
        }
        return obtain.build();
    }

    public static final defpackage.co0 NHJTzaLwkd(defpackage.g00 g00Var) {
        defpackage.do0 do0Var = new defpackage.do0();
        g00Var.AARZUJiTa(do0Var);
        boolean z = do0Var.oh6vYeIP;
        java.lang.String str = do0Var.F7NU4MC0GW;
        defpackage.bo0 bo0Var = do0Var.IHQe1A4L2xu;
        if (str != null) {
            boolean z2 = do0Var.adDC3e2L;
            boolean z3 = do0Var.xiZrDbcSW0;
            bo0Var.oh6vYeIP = str;
            bo0Var.IHQe1A4L2xu = -1;
            bo0Var.r1MBDhnF = z2;
            bo0Var.F7NU4MC0GW = z3;
        } else {
            int i = do0Var.r1MBDhnF;
            boolean z4 = do0Var.adDC3e2L;
            boolean z5 = do0Var.xiZrDbcSW0;
            bo0Var.IHQe1A4L2xu = i;
            bo0Var.oh6vYeIP = null;
            bo0Var.r1MBDhnF = z4;
            bo0Var.F7NU4MC0GW = z5;
        }
        java.lang.String str2 = bo0Var.oh6vYeIP;
        if (str2 == null) {
            return new defpackage.co0(z, false, bo0Var.IHQe1A4L2xu, bo0Var.r1MBDhnF, bo0Var.F7NU4MC0GW, bo0Var.adDC3e2L, bo0Var.xiZrDbcSW0);
        }
        boolean z6 = bo0Var.r1MBDhnF;
        boolean z7 = bo0Var.F7NU4MC0GW;
        int i2 = bo0Var.adDC3e2L;
        int i3 = bo0Var.xiZrDbcSW0;
        int i4 = defpackage.gn0.riuEU0zW4;
        defpackage.co0 co0Var = new defpackage.co0(z, false, "android-app://androidx.navigation/".concat(str2).hashCode(), z6, z7, i2, i3);
        co0Var.EXtogiMhuM = str2;
        return co0Var;
    }

    public static defpackage.z71 PAEGRtP0bX(defpackage.k00 k00Var) {
        defpackage.z71 z71Var = new defpackage.z71();
        z71Var.AARZUJiTa = defpackage.c80.DFo87pBq1E5(z71Var, z71Var, k00Var);
        return z71Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean QQUzIjv3iOC5(defpackage.gy gyVar, defpackage.c4 c4Var) {
        defpackage.gy[] gyVarArr = new defpackage.gy[16];
        if (!gyVar.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitChildren called on an unattached node");
        }
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
        defpackage.lj0 lj0Var = gyVar.adDC3e2L;
        defpackage.lj0 lj0Var2 = lj0Var.SH1y5HwkJhh;
        if (lj0Var2 == null) {
            defpackage.w70.EXtogiMhuM(xl0Var, lj0Var);
        } else {
            xl0Var.oh6vYeIP(lj0Var2);
        }
        int i = 0;
        while (true) {
            int i2 = xl0Var.AARZUJiTa;
            if (i2 == 0) {
                break;
            }
            defpackage.lj0 lj0Var3 = (defpackage.lj0) xl0Var.ez2rX8ReCYw(i2 - 1);
            if ((lj0Var3.EXtogiMhuM & 1024) == 0) {
                defpackage.w70.EXtogiMhuM(xl0Var, lj0Var3);
            } else {
                while (true) {
                    if (lj0Var3 == null) {
                        break;
                    }
                    if ((lj0Var3.AARZUJiTa & 1024) != 0) {
                        defpackage.xl0 xl0Var2 = null;
                        while (lj0Var3 != null) {
                            if (lj0Var3 instanceof defpackage.gy) {
                                defpackage.gy gyVar2 = (defpackage.gy) lj0Var3;
                                int i3 = i + 1;
                                if (gyVarArr.length < i3) {
                                    int length = gyVarArr.length;
                                    ?? r10 = new java.lang.Object[java.lang.Math.max(i3, length * 2)];
                                    java.lang.System.arraycopy(gyVarArr, 0, r10, 0, length);
                                    gyVarArr = r10;
                                }
                                gyVarArr[i] = gyVar2;
                                i = i3;
                            } else if ((lj0Var3.AARZUJiTa & 1024) != 0 && (lj0Var3 instanceof defpackage.ln)) {
                                int i4 = 0;
                                for (defpackage.lj0 lj0Var4 = ((defpackage.ln) lj0Var3).fnWB2E7cs; lj0Var4 != null; lj0Var4 = lj0Var4.SH1y5HwkJhh) {
                                    if ((lj0Var4.AARZUJiTa & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            lj0Var3 = lj0Var4;
                                        } else {
                                            if (xl0Var2 == null) {
                                                xl0Var2 = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lj0Var3 != null) {
                                                xl0Var2.oh6vYeIP(lj0Var3);
                                                lj0Var3 = null;
                                            }
                                            xl0Var2.oh6vYeIP(lj0Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            lj0Var3 = defpackage.w70.riuEU0zW4(xl0Var2);
                        }
                    } else {
                        lj0Var3 = lj0Var3.SH1y5HwkJhh;
                    }
                }
            }
        }
        java.util.Arrays.sort(gyVarArr, 0, i, defpackage.hy.oh6vYeIP);
        int i5 = i - 1;
        if (i5 < gyVarArr.length) {
            while (i5 >= 0) {
                defpackage.gy gyVar3 = gyVarArr[i5];
                if (defpackage.mj1.wll2JLbTBC2(gyVar3) && riuEU0zW4(gyVar3, c4Var)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    public static final boolean QoRHpC4k(defpackage.gy gyVar, defpackage.c4 c4Var) {
        int ordinal = gyVar.fzubgBFo().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                defpackage.gy nBH8hAHy = defpackage.mj1.nBH8hAHy(gyVar);
                if (nBH8hAHy != null) {
                    return QoRHpC4k(nBH8hAHy, c4Var) || G3OKOH3wZRC(gyVar, nBH8hAHy, 1, c4Var);
                }
                defpackage.db.AARZUJiTa("ActiveParent must have a focusedChild");
                return false;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return gyVar.pm90rNzI5F().IHQe1A4L2xu ? ((java.lang.Boolean) c4Var.AARZUJiTa(gyVar)).booleanValue() : C0U8sNJm(gyVar, c4Var);
                }
                defpackage.db.F7NU4MC0GW();
                return false;
            }
        }
        return C0U8sNJm(gyVar, c4Var);
    }

    public static final int SH1y5HwkJhh(float f) {
        return java.lang.Math.round((float) java.lang.Math.ceil(f));
    }

    public static final void SiPhmbmu(defpackage.f71 f71Var, int i, defpackage.g51 g51Var) {
        defpackage.f71 f71Var2;
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.f71[16]);
        java.util.List riuEU0zW4 = f71Var.riuEU0zW4(false, false);
        while (true) {
            xl0Var.F7NU4MC0GW(xl0Var.AARZUJiTa, riuEU0zW4);
            while (true) {
                int i2 = xl0Var.AARZUJiTa;
                if (i2 == 0) {
                    return;
                }
                f71Var2 = (defpackage.f71) xl0Var.ez2rX8ReCYw(i2 - 1);
                boolean D2vUnMij = defpackage.h1.D2vUnMij(f71Var2);
                defpackage.b71 b71Var = f71Var2.F7NU4MC0GW;
                defpackage.nl0 nl0Var = b71Var.adDC3e2L;
                if (!D2vUnMij && !nl0Var.r1MBDhnF(defpackage.j71.SH1y5HwkJhh)) {
                    defpackage.ip0 F7NU4MC0GW2 = f71Var2.F7NU4MC0GW();
                    if (F7NU4MC0GW2 == null) {
                        throw defpackage.fx0.AARZUJiTa("Expected semantics node to have a coordinator.");
                    }
                    defpackage.e70 C0U8sNJm = defpackage.f70.C0U8sNJm(defpackage.x80.EXtogiMhuM(F7NU4MC0GW2, true));
                    if (C0U8sNJm.IHQe1A4L2xu < C0U8sNJm.r1MBDhnF && C0U8sNJm.oh6vYeIP < C0U8sNJm.F7NU4MC0GW) {
                        java.lang.Object AARZUJiTa = b71Var.adDC3e2L.AARZUJiTa(defpackage.a71.adDC3e2L);
                        if (AARZUJiTa == null) {
                            AARZUJiTa = null;
                        }
                        defpackage.k00 k00Var = (defpackage.k00) AARZUJiTa;
                        java.lang.Object AARZUJiTa2 = nl0Var.AARZUJiTa(defpackage.j71.PAEGRtP0bX);
                        defpackage.f51 f51Var = (defpackage.f51) (AARZUJiTa2 != null ? AARZUJiTa2 : null);
                        if (k00Var != null && f51Var != null && ((java.lang.Number) f51Var.oh6vYeIP.IHQe1A4L2xu()).floatValue() > 0.0f) {
                            int i3 = 1 + i;
                            g51Var.AARZUJiTa(new defpackage.h51(f71Var2, i3, C0U8sNJm, F7NU4MC0GW2));
                            SiPhmbmu(f71Var2, i3, g51Var);
                        }
                    }
                }
            }
            riuEU0zW4 = f71Var2.riuEU0zW4(false, false);
        }
    }

    public static boolean SyNS6RMn(android.view.View view, android.view.KeyEvent keyEvent) {
        java.util.ArrayList arrayList;
        int size;
        int indexOfKey;
        int i = defpackage.mm1.IHQe1A4L2xu;
        if (android.os.Build.VERSION.SDK_INT < 28) {
            java.util.ArrayList arrayList2 = defpackage.lm1.F7NU4MC0GW;
            defpackage.lm1 lm1Var = (defpackage.lm1) view.getTag(com.combinations.spin.balbi.R.id.tag_unhandled_key_event_manager);
            java.lang.ref.WeakReference weakReference = null;
            if (lm1Var == null) {
                lm1Var = new defpackage.lm1();
                lm1Var.IHQe1A4L2xu = null;
                lm1Var.oh6vYeIP = null;
                lm1Var.r1MBDhnF = null;
                view.setTag(com.combinations.spin.balbi.R.id.tag_unhandled_key_event_manager, lm1Var);
            }
            java.lang.ref.WeakReference weakReference2 = lm1Var.r1MBDhnF;
            if (weakReference2 == null || weakReference2.get() != keyEvent) {
                lm1Var.r1MBDhnF = new java.lang.ref.WeakReference(keyEvent);
                if (lm1Var.oh6vYeIP == null) {
                    lm1Var.oh6vYeIP = new android.util.SparseArray();
                }
                android.util.SparseArray sparseArray = lm1Var.oh6vYeIP;
                if (keyEvent.getAction() == 1 && (indexOfKey = sparseArray.indexOfKey(keyEvent.getKeyCode())) >= 0) {
                    weakReference = (java.lang.ref.WeakReference) sparseArray.valueAt(indexOfKey);
                    sparseArray.removeAt(indexOfKey);
                }
                if (weakReference == null) {
                    weakReference = (java.lang.ref.WeakReference) sparseArray.get(keyEvent.getKeyCode());
                }
                if (weakReference != null) {
                    android.view.View view2 = (android.view.View) weakReference.get();
                    if (view2 == null || !view2.isAttachedToWindow() || (arrayList = (java.util.ArrayList) view2.getTag(com.combinations.spin.balbi.R.id.tag_unhandled_key_listeners)) == null || (size = arrayList.size() - 1) < 0) {
                        return true;
                    }
                    arrayList.get(size).getClass();
                    defpackage.db.kd6TUFXn();
                    return false;
                }
            }
        }
        return false;
    }

    public static defpackage.dj0 UsuH8pd5P(java.nio.MappedByteBuffer mappedByteBuffer) {
        long j;
        java.nio.ByteBuffer duplicate = mappedByteBuffer.duplicate();
        duplicate.order(java.nio.ByteOrder.BIG_ENDIAN);
        duplicate.position(duplicate.position() + 4);
        int i = duplicate.getShort() & 65535;
        if (i > 100) {
            throw new java.io.IOException("Cannot read metadata.");
        }
        duplicate.position(duplicate.position() + 6);
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                j = -1;
                break;
            }
            int i3 = duplicate.getInt();
            duplicate.position(duplicate.position() + 4);
            j = duplicate.getInt() & 4294967295L;
            duplicate.position(duplicate.position() + 4);
            if (1835365473 == i3) {
                break;
            }
            i2++;
        }
        if (j != -1) {
            duplicate.position(duplicate.position() + ((int) (j - duplicate.position())));
            duplicate.position(duplicate.position() + 12);
            long j2 = duplicate.getInt() & 4294967295L;
            for (int i4 = 0; i4 < j2; i4++) {
                int i5 = duplicate.getInt();
                long j3 = duplicate.getInt() & 4294967295L;
                duplicate.getInt();
                if (1164798569 == i5 || 1701669481 == i5) {
                    duplicate.position((int) (j3 + j));
                    defpackage.dj0 dj0Var = new defpackage.dj0();
                    duplicate.order(java.nio.ByteOrder.LITTLE_ENDIAN);
                    int position = duplicate.position() + duplicate.getInt(duplicate.position());
                    dj0Var.EXtogiMhuM = duplicate;
                    dj0Var.adDC3e2L = position;
                    int i6 = position - duplicate.getInt(position);
                    dj0Var.xiZrDbcSW0 = i6;
                    dj0Var.AARZUJiTa = ((java.nio.ByteBuffer) dj0Var.EXtogiMhuM).getShort(i6);
                    return dj0Var;
                }
            }
        }
        throw new java.io.IOException("Cannot read metadata.");
    }

    public static boolean V7bD7b8KA(byte b) {
        return b > -65;
    }

    public static final java.util.ArrayList abhbClRa(java.util.Map map, defpackage.g00 g00Var) {
        map.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry entry : map.entrySet()) {
            defpackage.mm0 mm0Var = (defpackage.mm0) entry.getValue();
            java.lang.Boolean bool = mm0Var != null ? java.lang.Boolean.FALSE : null;
            bool.getClass();
            if (!bool.booleanValue() && !mm0Var.oh6vYeIP) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        java.util.Set keySet = linkedHashMap.keySet();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : keySet) {
            if (((java.lang.Boolean) g00Var.AARZUJiTa((java.lang.String) obj)).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final java.lang.Object[] adDC3e2L(int i, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 2];
        defpackage.t6.RmCzwkUxICV(objArr, objArr2, 0, i, 6);
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr2, i, i + 2, objArr.length);
        return objArr2;
    }

    public static final long cnag84Bm(long j, boolean z, int i, float f) {
        int EXtogiMhuM = ((z || i == 2 || i == 4 || i == 5) && defpackage.ki.F7NU4MC0GW(j)) ? defpackage.ki.EXtogiMhuM(j) : Integer.MAX_VALUE;
        if (defpackage.ki.SH1y5HwkJhh(j) != EXtogiMhuM) {
            EXtogiMhuM = defpackage.x80.JlrlGoKF(SH1y5HwkJhh(f), defpackage.ki.SH1y5HwkJhh(j), EXtogiMhuM);
        }
        return defpackage.fm.NHJTzaLwkd(0, EXtogiMhuM, 0, defpackage.ki.AARZUJiTa(j));
    }

    public static defpackage.bk1 fnWB2E7cs(defpackage.t10 t10Var) {
        return (defpackage.bk1) t10Var.SH1y5HwkJhh(defpackage.dk1.IHQe1A4L2xu);
    }

    public static final long frpfPPIgqM9O(long j) {
        return (java.lang.Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (java.lang.Float.floatToRawIntBits((int) (j >> 32)) << 32);
    }

    public static final int kNAkVymC(int i, int i2) {
        return (i >> i2) & 31;
    }

    public static final defpackage.cn1 kd6TUFXn(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(com.combinations.spin.balbi.R.id.view_tree_view_model_store_owner);
            defpackage.cn1 cn1Var = tag instanceof defpackage.cn1 ? (defpackage.cn1) tag : null;
            if (cn1Var != null) {
                return cn1Var;
            }
            java.lang.Object EgCjBq0SZwJ = defpackage.e90.EgCjBq0SZwJ(view);
            view = EgCjBq0SZwJ instanceof android.view.View ? (android.view.View) EgCjBq0SZwJ : null;
        }
        return null;
    }

    public static final defpackage.s31 nBH8hAHy(defpackage.t10 t10Var) {
        t10Var.AsxAYCCkb3Hi(1967007413);
        java.lang.Object[] objArr = new java.lang.Object[0];
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        if (mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
            mAr5m2L7gYDP = new defpackage.g(29);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
        defpackage.s31 s31Var = (defpackage.s31) defpackage.e90.NHJTzaLwkd(objArr, defpackage.s31.riuEU0zW4, (defpackage.vz) mAr5m2L7gYDP, t10Var, 384);
        s31Var.AARZUJiTa = (defpackage.t31) t10Var.SH1y5HwkJhh(defpackage.w31.IHQe1A4L2xu);
        t10Var.QoRHpC4k(false);
        return s31Var;
    }

    public static defpackage.t2 oh6vYeIP(java.lang.String str, defpackage.dg1 dg1Var, long j, defpackage.tn tnVar, defpackage.ny nyVar, int i) {
        defpackage.nt ntVar = defpackage.nt.adDC3e2L;
        return new defpackage.t2(new defpackage.x2(str, dg1Var, ntVar, ntVar, nyVar, tnVar), i, 1, j);
    }

    public static final defpackage.kz0 r1MBDhnF(long j, long j2) {
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        return new defpackage.kz0(java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat(i2), java.lang.Float.intBitsToFloat((int) (j2 >> 32)) + java.lang.Float.intBitsToFloat(i), java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) + java.lang.Float.intBitsToFloat(i2));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean riuEU0zW4(defpackage.gy gyVar, defpackage.c4 c4Var) {
        int ordinal = gyVar.fzubgBFo().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                defpackage.gy nBH8hAHy = defpackage.mj1.nBH8hAHy(gyVar);
                if (nBH8hAHy == null) {
                    defpackage.db.AARZUJiTa("ActiveParent must have a focusedChild");
                    return false;
                }
                int ordinal2 = nBH8hAHy.fzubgBFo().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                defpackage.db.F7NU4MC0GW();
                                return false;
                            }
                            defpackage.db.AARZUJiTa("ActiveParent must have a focusedChild");
                            return false;
                        }
                    } else if (riuEU0zW4(nBH8hAHy, c4Var) || G3OKOH3wZRC(gyVar, nBH8hAHy, 2, c4Var) || (nBH8hAHy.pm90rNzI5F().IHQe1A4L2xu && ((java.lang.Boolean) c4Var.AARZUJiTa(nBH8hAHy)).booleanValue())) {
                        return true;
                    }
                }
                return G3OKOH3wZRC(gyVar, nBH8hAHy, 2, c4Var);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    defpackage.db.F7NU4MC0GW();
                    return false;
                }
                if (!QQUzIjv3iOC5(gyVar, c4Var)) {
                    if (!(gyVar.pm90rNzI5F().IHQe1A4L2xu ? ((java.lang.Boolean) c4Var.AARZUJiTa(gyVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return QQUzIjv3iOC5(gyVar, c4Var);
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
    public static final boolean v5iciZok(defpackage.gy gyVar, defpackage.gy gyVar2, int i, defpackage.c4 c4Var) {
        defpackage.lj0 lj0Var;
        defpackage.ma0 D2vUnMij;
        defpackage.ep0 ep0Var;
        if (gyVar.fzubgBFo() != defpackage.fy.xiZrDbcSW0) {
            defpackage.db.AARZUJiTa("This function should only be used within a parent that has focus.");
            return false;
        }
        defpackage.gy[] gyVarArr = new defpackage.gy[16];
        if (!gyVar.adDC3e2L.kd6TUFXn) {
            defpackage.x50.oh6vYeIP("visitChildren called on an unattached node");
        }
        defpackage.xl0 xl0Var = new defpackage.xl0(new defpackage.lj0[16]);
        defpackage.lj0 lj0Var2 = gyVar.adDC3e2L;
        defpackage.lj0 lj0Var3 = lj0Var2.SH1y5HwkJhh;
        if (lj0Var3 == null) {
            defpackage.w70.EXtogiMhuM(xl0Var, lj0Var2);
        } else {
            xl0Var.oh6vYeIP(lj0Var3);
        }
        int i2 = 0;
        while (true) {
            int i3 = xl0Var.AARZUJiTa;
            lj0Var = null;
            if (i3 == 0) {
                break;
            }
            defpackage.lj0 lj0Var4 = (defpackage.lj0) xl0Var.ez2rX8ReCYw(i3 - 1);
            if ((lj0Var4.EXtogiMhuM & 1024) == 0) {
                defpackage.w70.EXtogiMhuM(xl0Var, lj0Var4);
            } else {
                while (true) {
                    if (lj0Var4 == null) {
                        break;
                    }
                    if ((lj0Var4.AARZUJiTa & 1024) != 0) {
                        defpackage.xl0 xl0Var2 = null;
                        while (lj0Var4 != null) {
                            if (lj0Var4 instanceof defpackage.gy) {
                                defpackage.gy gyVar3 = (defpackage.gy) lj0Var4;
                                int i4 = i2 + 1;
                                if (gyVarArr.length < i4) {
                                    int length = gyVarArr.length;
                                    ?? r11 = new java.lang.Object[java.lang.Math.max(i4, length * 2)];
                                    java.lang.System.arraycopy(gyVarArr, 0, r11, 0, length);
                                    gyVarArr = r11;
                                }
                                gyVarArr[i2] = gyVar3;
                                i2 = i4;
                            } else if ((lj0Var4.AARZUJiTa & 1024) != 0 && (lj0Var4 instanceof defpackage.ln)) {
                                int i5 = 0;
                                for (defpackage.lj0 lj0Var5 = ((defpackage.ln) lj0Var4).fnWB2E7cs; lj0Var5 != null; lj0Var5 = lj0Var5.SH1y5HwkJhh) {
                                    if ((lj0Var5.AARZUJiTa & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            lj0Var4 = lj0Var5;
                                        } else {
                                            if (xl0Var2 == null) {
                                                xl0Var2 = new defpackage.xl0(new defpackage.lj0[16]);
                                            }
                                            if (lj0Var4 != null) {
                                                xl0Var2.oh6vYeIP(lj0Var4);
                                                lj0Var4 = null;
                                            }
                                            xl0Var2.oh6vYeIP(lj0Var5);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            lj0Var4 = defpackage.w70.riuEU0zW4(xl0Var2);
                        }
                    } else {
                        lj0Var4 = lj0Var4.SH1y5HwkJhh;
                    }
                }
            }
        }
        java.util.Arrays.sort(gyVarArr, 0, i2, defpackage.hy.oh6vYeIP);
        if (i != 1) {
            if (i != 2) {
                defpackage.db.AARZUJiTa("This function should only be used for 1-D focus search");
                return false;
            }
            defpackage.d70 QPwENk36pDC = defpackage.x80.QPwENk36pDC(0, i2);
            int i6 = QPwENk36pDC.adDC3e2L;
            int i7 = QPwENk36pDC.xiZrDbcSW0;
            if (i6 <= i7) {
                boolean z = false;
                while (true) {
                    if (z) {
                        defpackage.gy gyVar4 = gyVarArr[i7];
                        if (defpackage.mj1.wll2JLbTBC2(gyVar4) && riuEU0zW4(gyVar4, c4Var)) {
                            break;
                        }
                    }
                    if (defpackage.x70.QoRHpC4k(gyVarArr[i7], gyVar2)) {
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
                if (!gyVar.adDC3e2L.kd6TUFXn) {
                }
                defpackage.lj0 lj0Var6 = gyVar.adDC3e2L.riuEU0zW4;
                D2vUnMij = defpackage.w70.D2vUnMij(gyVar);
                loop5: while (true) {
                    if (D2vUnMij == null) {
                    }
                }
                if (lj0Var != null) {
                }
            }
            return false;
        }
        defpackage.d70 QPwENk36pDC2 = defpackage.x80.QPwENk36pDC(0, i2);
        int i8 = QPwENk36pDC2.adDC3e2L;
        int i9 = QPwENk36pDC2.xiZrDbcSW0;
        if (i8 <= i9) {
            boolean z2 = false;
            while (true) {
                if (z2) {
                    defpackage.gy gyVar5 = gyVarArr[i8];
                    if (defpackage.mj1.wll2JLbTBC2(gyVar5) && QoRHpC4k(gyVar5, c4Var)) {
                        break;
                    }
                }
                if (defpackage.x70.QoRHpC4k(gyVarArr[i8], gyVar2)) {
                    z2 = true;
                }
                if (i8 == i9) {
                    break;
                }
                i8++;
            }
            return true;
        }
        if (i != 1 && gyVar.pm90rNzI5F().IHQe1A4L2xu) {
            if (!gyVar.adDC3e2L.kd6TUFXn) {
                defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
            }
            defpackage.lj0 lj0Var62 = gyVar.adDC3e2L.riuEU0zW4;
            D2vUnMij = defpackage.w70.D2vUnMij(gyVar);
            loop5: while (true) {
                if (D2vUnMij == null) {
                    break;
                }
                if ((D2vUnMij.yIx6ChFVk.xiZrDbcSW0.EXtogiMhuM & 1024) != 0) {
                    while (lj0Var62 != null) {
                        if ((lj0Var62.AARZUJiTa & 1024) != 0) {
                            defpackage.lj0 lj0Var7 = lj0Var62;
                            defpackage.xl0 xl0Var3 = null;
                            while (lj0Var7 != null) {
                                if (lj0Var7 instanceof defpackage.gy) {
                                    lj0Var = lj0Var7;
                                    break loop5;
                                }
                                if ((lj0Var7.AARZUJiTa & 1024) != 0 && (lj0Var7 instanceof defpackage.ln)) {
                                    int i10 = 0;
                                    for (defpackage.lj0 lj0Var8 = ((defpackage.ln) lj0Var7).fnWB2E7cs; lj0Var8 != null; lj0Var8 = lj0Var8.SH1y5HwkJhh) {
                                        if ((lj0Var8.AARZUJiTa & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                lj0Var7 = lj0Var8;
                                            } else {
                                                if (xl0Var3 == null) {
                                                    xl0Var3 = new defpackage.xl0(new defpackage.lj0[16]);
                                                }
                                                if (lj0Var7 != null) {
                                                    xl0Var3.oh6vYeIP(lj0Var7);
                                                    lj0Var7 = null;
                                                }
                                                xl0Var3.oh6vYeIP(lj0Var8);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                lj0Var7 = defpackage.w70.riuEU0zW4(xl0Var3);
                            }
                        }
                        lj0Var62 = lj0Var62.riuEU0zW4;
                    }
                }
                D2vUnMij = D2vUnMij.V7bD7b8KA();
                lj0Var62 = (D2vUnMij == null || (ep0Var = D2vUnMij.yIx6ChFVk) == null) ? null : ep0Var.adDC3e2L;
            }
            if (lj0Var != null) {
                return ((java.lang.Boolean) c4Var.AARZUJiTa(gyVar)).booleanValue();
            }
        }
        return false;
    }

    public static final java.lang.Object[] xiZrDbcSW0(int i, java.lang.Object[] objArr) {
        java.lang.Object[] objArr2 = new java.lang.Object[objArr.length - 1];
        defpackage.t6.RmCzwkUxICV(objArr, objArr2, 0, i, 6);
        defpackage.t6.wKlPRKlRnfqr(objArr, objArr2, i, i + 1, objArr.length);
        return objArr2;
    }

    public abstract void ez2rX8ReCYw();
}
