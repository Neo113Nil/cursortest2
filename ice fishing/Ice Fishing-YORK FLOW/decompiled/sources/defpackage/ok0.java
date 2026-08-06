package defpackage;

/* loaded from: classes.dex */
public abstract class ok0 {
    public static final defpackage.ru WDYagTQQm9ns;
    public static final defpackage.ru oh71FJcDz6S2;
    public static final defpackage.ru ZpBGe2uQfcn8 = new defpackage.ru("RESUME_TOKEN", 1);
    public static final defpackage.nh giKS3J6vZuNy = new defpackage.nh(-100714188, false, new defpackage.b7(9, 0));
    public static final java.lang.Class[] fWTAfUmVKrZq = {java.io.Serializable.class, android.os.Parcelable.class, java.lang.String.class, android.util.SparseArray.class, android.os.Binder.class, android.util.Size.class, android.util.SizeF.class};
    public static final defpackage.i3 JhCgjQRTAOCT = new defpackage.i3(5);
    public static final defpackage.hc1[] QiMR8OkAhezm = new defpackage.hc1[0];
    public static final defpackage.l21 P05cfTpS5W5L = new defpackage.l21(6);
    public static final defpackage.l21 e6mdH7fiFuta = new defpackage.l21(7);
    public static final defpackage.l21 GE9mJIPrb8gP = new defpackage.l21(8);
    public static final java.lang.Object Ns0WNyEWdPsk = new java.lang.Object();

    static {
        int i = 1;
        WDYagTQQm9ns = new defpackage.ru("NULL", i);
        oh71FJcDz6S2 = new defpackage.ru("UNINITIALIZED", i);
    }

    public static final void BHfvd2J71qpO(defpackage.sm smVar, defpackage.yl0 yl0Var) {
        defpackage.cb0 cb0Var = (defpackage.cb0) smVar.QiMR8OkAhezm().XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
        if (cb0Var != null) {
            cb0Var.JhCgjQRTAOCT(yl0Var);
        } else {
            defpackage.h7.QiMR8OkAhezm(smVar, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final defpackage.x71 BXaznwstz2U0(defpackage.ru1 ru1Var) {
        defpackage.v71 v71Var = new defpackage.v71();
        defpackage.ym JhCgjQRTAOCT2 = ru1Var instanceof defpackage.y40 ? ((defpackage.y40) ru1Var).JhCgjQRTAOCT() : defpackage.xm.giKS3J6vZuNy;
        JhCgjQRTAOCT2.getClass();
        return (defpackage.x71) new defpackage.s81(ru1Var.WDYagTQQm9ns(), v71Var, JhCgjQRTAOCT2).WmetiUbpKU9I(defpackage.b41.ZpBGe2uQfcn8(defpackage.x71.class), "androidx.lifecycle.internal.SavedStateHandlesVM");
    }

    public static int CZa7MwI9IzLd(float f) {
        if (!java.lang.Float.isNaN(f)) {
            return java.lang.Math.round(f);
        }
        defpackage.h7.w7APNrr0aGRc("Cannot round NaN value.");
        return 0;
    }

    public static long EPEWHACkMcF1(double d) {
        if (!java.lang.Double.isNaN(d)) {
            return java.lang.Math.round(d);
        }
        defpackage.h7.w7APNrr0aGRc("Cannot round NaN value.");
        return 0L;
    }

    public static void Fu5WBEia9jBo(long j, defpackage.l6 l6Var, boolean z, defpackage.fNwYGHIYeJcR fnwyghiyejcr) {
        if (z) {
            int i = defpackage.in1.fWTAfUmVKrZq;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            int codePointBefore = i2 > 0 ? java.lang.Character.codePointBefore(l6Var, i2) : 10;
            int codePointAt = i3 < l6Var.oh71FJcDz6S2.length() ? java.lang.Character.codePointAt(l6Var, i3) : 10;
            if (defpackage.jr0.IBvW5fLsPuHy(codePointBefore) && (defpackage.jr0.KrtOTfE6jiS2(codePointAt) || defpackage.jr0.Mearx7yMn90V(codePointAt))) {
                do {
                    i2 -= java.lang.Character.charCount(codePointBefore);
                    if (i2 == 0) {
                        break;
                    } else {
                        codePointBefore = java.lang.Character.codePointBefore(l6Var, i2);
                    }
                } while (defpackage.jr0.IBvW5fLsPuHy(codePointBefore));
                j = defpackage.j80.JhCgjQRTAOCT(i2, i3);
            } else if (defpackage.jr0.IBvW5fLsPuHy(codePointAt) && (defpackage.jr0.KrtOTfE6jiS2(codePointBefore) || defpackage.jr0.Mearx7yMn90V(codePointBefore))) {
                do {
                    i3 += java.lang.Character.charCount(codePointAt);
                    if (i3 == l6Var.oh71FJcDz6S2.length()) {
                        break;
                    } else {
                        codePointAt = java.lang.Character.codePointAt(l6Var, i3);
                    }
                } while (defpackage.jr0.IBvW5fLsPuHy(codePointAt));
                j = defpackage.j80.JhCgjQRTAOCT(i2, i3);
            }
        }
        int i4 = (int) (4294967295L & j);
        fnwyghiyejcr.P05cfTpS5W5L(new defpackage.v40(new defpackage.bu[]{new defpackage.vc1(i4, i4), new defpackage.ep(defpackage.in1.JhCgjQRTAOCT(j), 0)}));
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long GE9mJIPrb8gP(float f, float f2, float f3, float f4, defpackage.xf xfVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if (xfVar.fWTAfUmVKrZq()) {
            long j = ((((((int) ((f4 * 255.0f) + 0.5f)) << 24) | (((int) ((f * 255.0f) + 0.5f)) << 16)) | (((int) ((f2 * 255.0f) + 0.5f)) << 8)) | ((int) ((255.0f * f3) + 0.5f))) << 32;
            int i10 = defpackage.pf.P05cfTpS5W5L;
            return j;
        }
        int floatToRawIntBits = java.lang.Float.floatToRawIntBits(f);
        int i11 = floatToRawIntBits >>> 31;
        int i12 = (floatToRawIntBits >>> 23) & 255;
        int i13 = floatToRawIntBits & 8388607;
        int i14 = 49;
        int i15 = 0;
        if (i12 == 255) {
            i2 = i13 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i12 - 112;
            if (i >= 31) {
                i = 49;
                i2 = 0;
            } else if (i > 0) {
                int i16 = i13 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i16) + 1) | (i11 << 15);
                    short s = (short) i3;
                    int floatToRawIntBits2 = java.lang.Float.floatToRawIntBits(f2);
                    int i17 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i18 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i18 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i5 = 49;
                            i6 = 0;
                        } else if (i5 > 0) {
                            int i19 = i18 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i19) + 1) | (i17 << 15);
                                short s2 = (short) i7;
                                int floatToRawIntBits3 = java.lang.Float.floatToRawIntBits(f3);
                                int i20 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i21 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i15 = i21 == 0 ? 0 : 512;
                                    i14 = 31;
                                } else {
                                    int i22 = i8 - 112;
                                    if (i22 < 31) {
                                        if (i22 > 0) {
                                            i15 = i21 >> 13;
                                            if ((floatToRawIntBits3 & 4096) != 0) {
                                                i9 = (((i22 << 10) | i15) + 1) | (i20 << 15);
                                                long max = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (xfVar.fWTAfUmVKrZq & 63);
                                                int i23 = defpackage.pf.P05cfTpS5W5L;
                                                return max;
                                            }
                                            i14 = i22;
                                        } else if (i22 >= -10) {
                                            int i24 = (i21 | 8388608) >> (1 - i22);
                                            if ((i24 & 4096) != 0) {
                                                i24 += 8192;
                                            }
                                            i14 = 0;
                                            i15 = i24 >> 13;
                                        } else {
                                            i14 = 0;
                                        }
                                    }
                                }
                                i9 = (i20 << 15) | (i14 << 10) | i15;
                                long max2 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (xfVar.fWTAfUmVKrZq & 63);
                                int i232 = defpackage.pf.P05cfTpS5W5L;
                                return max2;
                            }
                            i6 = i19;
                        } else if (i5 >= -10) {
                            int i25 = (i18 | 8388608) >> (1 - i5);
                            if ((i25 & 4096) != 0) {
                                i25 += 8192;
                            }
                            i6 = i25 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i17 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    int floatToRawIntBits32 = java.lang.Float.floatToRawIntBits(f3);
                    int i202 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i212 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i9 = (i202 << 15) | (i14 << 10) | i15;
                    long max22 = ((((short) i9) & 65535) << 16) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (xfVar.fWTAfUmVKrZq & 63);
                    int i2322 = defpackage.pf.P05cfTpS5W5L;
                    return max22;
                }
                i2 = i16;
            } else if (i >= -10) {
                int i26 = (i13 | 8388608) >> (1 - i);
                if ((i26 & 4096) != 0) {
                    i26 += 8192;
                }
                i2 = i26 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i11 << 15) | (i << 10);
        short s3 = (short) i3;
        int floatToRawIntBits22 = java.lang.Float.floatToRawIntBits(f2);
        int i172 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i182 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i172 << 15) | (i5 << 10);
        short s222 = (short) i7;
        int floatToRawIntBits322 = java.lang.Float.floatToRawIntBits(f3);
        int i2022 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2122 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i9 = (i2022 << 15) | (i14 << 10) | i15;
        long max222 = ((((short) i9) & 65535) << 16) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((((int) ((java.lang.Math.max(0.0f, java.lang.Math.min(f4, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6) | (xfVar.fWTAfUmVKrZq & 63);
        int i23222 = defpackage.pf.P05cfTpS5W5L;
        return max222;
    }

    public static final boolean GcLuU6pT9wO9(defpackage.sm smVar) {
        defpackage.cb0 cb0Var = (defpackage.cb0) smVar.QiMR8OkAhezm().XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8);
        if (cb0Var != null) {
            return cb0Var.giKS3J6vZuNy();
        }
        return true;
    }

    public static final boolean GoIRkIe1iwj6(java.lang.Throwable th, defpackage.n10 n10Var) {
        java.util.List asList;
        java.lang.Object invoke;
        th.getClass();
        java.lang.Integer num = defpackage.bb0.ZpBGe2uQfcn8;
        defpackage.xp xpVar = null;
        if (num == null || num.intValue() >= 19) {
            java.lang.Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            asList = java.util.Arrays.asList(suppressed);
            asList.getClass();
        } else {
            java.lang.reflect.Method method = defpackage.xy0.giKS3J6vZuNy;
            if (method == null || (invoke = method.invoke(th, null)) == null) {
                asList = defpackage.av.WDYagTQQm9ns;
            } else {
                asList = java.util.Arrays.asList((java.lang.Throwable[]) invoke);
                asList.getClass();
            }
        }
        int size = asList.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((java.lang.Throwable) asList.get(i)) instanceof defpackage.xp) {
                return false;
            }
        }
        try {
            defpackage.si siVar = (defpackage.si) n10Var.ZpBGe2uQfcn8();
            if (siVar != null) {
                boolean z2 = siVar.giKS3J6vZuNy;
                java.util.List list = siVar.ZpBGe2uQfcn8;
                if (z2) {
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        ((defpackage.ui) list.get(i2)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                siVar.getClass();
                xpVar = new defpackage.xp(siVar);
            }
        } catch (java.lang.Throwable th2) {
            xpVar = th2;
        }
        if (xpVar != null) {
            defpackage.i61.P05cfTpS5W5L(th, xpVar);
        }
        return z;
    }

    public static final defpackage.ig1 IBvW5fLsPuHy(defpackage.ff1 ff1Var) {
        defpackage.ig1 ig1Var = ff1Var.WDYagTQQm9ns;
        ig1Var.getClass();
        return (defpackage.ig1) defpackage.te1.ZVVdXbWmyCSK(ig1Var, ff1Var);
    }

    public static final java.lang.Object IJ0hOnjhPOri(defpackage.c20 c20Var, defpackage.kl klVar) {
        defpackage.r81 r81Var = new defpackage.r81(klVar, klVar.oh71FJcDz6S2());
        return defpackage.b80.frSwwKIlbUhK(r81Var, r81Var, c20Var);
    }

    public static final long JhCgjQRTAOCT(int i) {
        long j = i << 32;
        int i2 = defpackage.pf.P05cfTpS5W5L;
        return j;
    }

    public static final defpackage.vl0 Jkfc0NcwyPL8(defpackage.vl0 vl0Var, defpackage.y10 y10Var) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.uy(y10Var));
    }

    public static final long KrtOTfE6jiS2(defpackage.k0 k0Var) {
        android.view.DragEvent dragEvent = (android.view.DragEvent) k0Var.oh71FJcDz6S2;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (java.lang.Float.floatToRawIntBits(x) << 32) | (java.lang.Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final java.lang.String Mearx7yMn90V(defpackage.jb1 jb1Var, android.content.res.Resources resources) {
        defpackage.fb1 fb1Var = jb1Var.JhCgjQRTAOCT;
        defpackage.fb1 fb1Var2 = jb1Var.JhCgjQRTAOCT;
        java.lang.Object QiMR8OkAhezm2 = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.giKS3J6vZuNy);
        java.lang.String str = null;
        if (QiMR8OkAhezm2 == null) {
            QiMR8OkAhezm2 = null;
        }
        defpackage.yn0 yn0Var = fb1Var2.WDYagTQQm9ns;
        java.lang.Object QiMR8OkAhezm3 = yn0Var.QiMR8OkAhezm(defpackage.nb1.hH0RRJrNssvh);
        if (QiMR8OkAhezm3 == null) {
            QiMR8OkAhezm3 = null;
        }
        defpackage.ko1 ko1Var = (defpackage.ko1) QiMR8OkAhezm3;
        java.lang.Object QiMR8OkAhezm4 = yn0Var.QiMR8OkAhezm(defpackage.nb1.dG7RjM6DqYVL);
        if (QiMR8OkAhezm4 == null) {
            QiMR8OkAhezm4 = null;
        }
        defpackage.d61 d61Var = (defpackage.d61) QiMR8OkAhezm4;
        if (ko1Var != null) {
            int ordinal = ko1Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        defpackage.h7.T1fB7bDYiVJQ();
                        return null;
                    }
                    if (QiMR8OkAhezm2 == null) {
                        QiMR8OkAhezm2 = resources.getString(com.ice.fishing.wolberta.R.string.indeterminate);
                    }
                } else if (d61Var != null && d61Var.ZpBGe2uQfcn8 == 2 && QiMR8OkAhezm2 == null) {
                    QiMR8OkAhezm2 = resources.getString(com.ice.fishing.wolberta.R.string.state_off);
                }
            } else if (d61Var != null && d61Var.ZpBGe2uQfcn8 == 2 && QiMR8OkAhezm2 == null) {
                QiMR8OkAhezm2 = resources.getString(com.ice.fishing.wolberta.R.string.state_on);
            }
        }
        java.lang.Object QiMR8OkAhezm5 = yn0Var.QiMR8OkAhezm(defpackage.nb1.BXaznwstz2U0);
        if (QiMR8OkAhezm5 == null) {
            QiMR8OkAhezm5 = null;
        }
        java.lang.Boolean bool = (java.lang.Boolean) QiMR8OkAhezm5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if ((d61Var == null || d61Var.ZpBGe2uQfcn8 != 4) && QiMR8OkAhezm2 == null) {
                QiMR8OkAhezm2 = booleanValue ? resources.getString(com.ice.fishing.wolberta.R.string.selected) : resources.getString(com.ice.fishing.wolberta.R.string.not_selected);
            }
        }
        java.lang.Object QiMR8OkAhezm6 = yn0Var.QiMR8OkAhezm(defpackage.nb1.fWTAfUmVKrZq);
        if (QiMR8OkAhezm6 == null) {
            QiMR8OkAhezm6 = null;
        }
        defpackage.r21 r21Var = (defpackage.r21) QiMR8OkAhezm6;
        if (r21Var != null) {
            if (r21Var != defpackage.r21.giKS3J6vZuNy) {
                if (QiMR8OkAhezm2 == null) {
                    QiMR8OkAhezm2 = resources.getString(com.ice.fishing.wolberta.R.string.template_percent, 0);
                }
            } else if (QiMR8OkAhezm2 == null) {
                QiMR8OkAhezm2 = resources.getString(com.ice.fishing.wolberta.R.string.in_progress);
            }
        }
        defpackage.qb1 qb1Var = defpackage.nb1.frSwwKIlbUhK;
        if (yn0Var.fWTAfUmVKrZq(qb1Var)) {
            defpackage.yn0 yn0Var2 = new defpackage.jb1(jb1Var.ZpBGe2uQfcn8, true, jb1Var.fWTAfUmVKrZq, fb1Var2).Ns0WNyEWdPsk().WDYagTQQm9ns;
            java.lang.Object QiMR8OkAhezm7 = yn0Var2.QiMR8OkAhezm(defpackage.nb1.ZpBGe2uQfcn8);
            if (QiMR8OkAhezm7 == null) {
                QiMR8OkAhezm7 = null;
            }
            java.util.Collection collection = (java.util.Collection) QiMR8OkAhezm7;
            if (collection == null || collection.isEmpty()) {
                java.lang.Object QiMR8OkAhezm8 = yn0Var2.QiMR8OkAhezm(defpackage.nb1.UmgHb6n58gfG);
                if (QiMR8OkAhezm8 == null) {
                    QiMR8OkAhezm8 = null;
                }
                java.util.Collection collection2 = (java.util.Collection) QiMR8OkAhezm8;
                if (collection2 == null || collection2.isEmpty()) {
                    java.lang.Object QiMR8OkAhezm9 = yn0Var2.QiMR8OkAhezm(qb1Var);
                    if (QiMR8OkAhezm9 == null) {
                        QiMR8OkAhezm9 = null;
                    }
                    java.lang.CharSequence charSequence = (java.lang.CharSequence) QiMR8OkAhezm9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(com.ice.fishing.wolberta.R.string.state_empty);
                    }
                }
            }
            QiMR8OkAhezm2 = str;
        }
        return (java.lang.String) QiMR8OkAhezm2;
    }

    public static final void NkfcFfdaVTox(defpackage.ne neVar) {
        neVar.getClass();
        java.lang.String fWTAfUmVKrZq2 = neVar.fWTAfUmVKrZq();
        if (fWTAfUmVKrZq2 == null) {
            fWTAfUmVKrZq2 = "<local class name not available>";
        }
        throw new defpackage.nc1("Serializer for class '" + fWTAfUmVKrZq2 + "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final boolean Ns0WNyEWdPsk(defpackage.jb1 jb1Var) {
        defpackage.fb1 Ns0WNyEWdPsk2 = jb1Var.Ns0WNyEWdPsk();
        return !Ns0WNyEWdPsk2.WDYagTQQm9ns.fWTAfUmVKrZq(defpackage.nb1.GE9mJIPrb8gP);
    }

    public static final boolean OVwOqzUGHcCU(defpackage.ff1 ff1Var, defpackage.y10 y10Var) {
        int i;
        defpackage.blKFvluuDQOf blkfvluudqof;
        java.lang.Object P05cfTpS5W5L2;
        defpackage.me1 GE9mJIPrb8gP2;
        boolean gUjdnLbkVAaA;
        do {
            synchronized (Ns0WNyEWdPsk) {
                defpackage.ig1 ig1Var = ff1Var.WDYagTQQm9ns;
                ig1Var.getClass();
                defpackage.ig1 ig1Var2 = (defpackage.ig1) defpackage.te1.P05cfTpS5W5L(ig1Var);
                i = ig1Var2.JhCgjQRTAOCT;
                blkfvluudqof = ig1Var2.fWTAfUmVKrZq;
            }
            blkfvluudqof.getClass();
            defpackage.ly0 WDYagTQQm9ns2 = blkfvluudqof.WDYagTQQm9ns();
            P05cfTpS5W5L2 = y10Var.P05cfTpS5W5L(WDYagTQQm9ns2);
            defpackage.blKFvluuDQOf fWTAfUmVKrZq2 = WDYagTQQm9ns2.fWTAfUmVKrZq();
            if (defpackage.ma0.QiMR8OkAhezm(fWTAfUmVKrZq2, blkfvluudqof)) {
                break;
            }
            defpackage.ig1 ig1Var3 = ff1Var.WDYagTQQm9ns;
            ig1Var3.getClass();
            synchronized (defpackage.te1.fWTAfUmVKrZq) {
                GE9mJIPrb8gP2 = defpackage.te1.GE9mJIPrb8gP();
                gUjdnLbkVAaA = gUjdnLbkVAaA((defpackage.ig1) defpackage.te1.IJ0hOnjhPOri(ig1Var3, ff1Var, GE9mJIPrb8gP2), i, fWTAfUmVKrZq2, true);
            }
            defpackage.te1.gUjdnLbkVAaA(GE9mJIPrb8gP2, ff1Var);
        } while (!gUjdnLbkVAaA);
        return ((java.lang.Boolean) P05cfTpS5W5L2).booleanValue();
    }

    public static final void OcTWLQzke1i2(defpackage.b81 b81Var) {
        defpackage.pg0 pg0Var = b81Var.QiMR8OkAhezm().P05cfTpS5W5L;
        if (pg0Var != defpackage.pg0.oh71FJcDz6S2 && pg0Var != defpackage.pg0.QiMR8OkAhezm) {
            defpackage.h7.Ns0WNyEWdPsk("Failed to enable `SavedStateHandle` for `", b81Var, "`. The `Lifecycle.State` must be `INITIALIZED` or `CREATED`, but was `", pg0Var, "`. You must call `enableSavedStateHandles()` before the `Lifecycle.State` moves to `STARTED`.");
        } else if (b81Var.fWTAfUmVKrZq().maCixPsq4ml2("androidx.lifecycle.internal.SavedStateHandlesProvider") == null) {
            defpackage.w71 w71Var = new defpackage.w71(b81Var.fWTAfUmVKrZq(), (defpackage.ru1) b81Var);
            b81Var.fWTAfUmVKrZq().blKFvluuDQOf("androidx.lifecycle.internal.SavedStateHandlesProvider", w71Var);
            b81Var.QiMR8OkAhezm().ZpBGe2uQfcn8(new defpackage.r31(3, w71Var));
        }
    }

    public static defpackage.kp P05cfTpS5W5L() {
        return new defpackage.kp(1.0f, 1.0f);
    }

    public static final int PS16moFv2oLu(long j) {
        float[] fArr = defpackage.ag.ZpBGe2uQfcn8;
        return (int) (defpackage.pf.ZpBGe2uQfcn8(j, defpackage.ag.WDYagTQQm9ns) >>> 32);
    }

    public static final defpackage.jl QiMR8OkAhezm(defpackage.jm jmVar) {
        if (jmVar.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Jkfc0NcwyPL8) == null) {
            jmVar = jmVar.fNwYGHIYeJcR(new defpackage.eb0(null));
        }
        return new defpackage.jl(jmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x005a -> B:10:0x005d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object T1fB7bDYiVJQ(defpackage.ri1 ri1Var, defpackage.wz0 wz0Var, defpackage.m9 m9Var) {
        defpackage.z00 z00Var;
        int i;
        defpackage.tm tmVar;
        int size;
        int i2;
        if (m9Var instanceof defpackage.z00) {
            z00Var = (defpackage.z00) m9Var;
            int i3 = z00Var.Ns0WNyEWdPsk;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                z00Var.Ns0WNyEWdPsk = i3 - Integer.MIN_VALUE;
                java.lang.Object obj = z00Var.GE9mJIPrb8gP;
                i = z00Var.Ns0WNyEWdPsk;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    java.util.List list = ri1Var.GE9mJIPrb8gP.IJ0hOnjhPOri.ZpBGe2uQfcn8;
                    int size2 = list.size();
                    for (int i4 = 0; i4 < size2; i4++) {
                        if (((defpackage.c01) list.get(i4)).JhCgjQRTAOCT) {
                            z00Var.P05cfTpS5W5L = ri1Var;
                            z00Var.e6mdH7fiFuta = wz0Var;
                            z00Var.Ns0WNyEWdPsk = 1;
                            obj = ri1Var.ZpBGe2uQfcn8(wz0Var, z00Var);
                            tmVar = defpackage.tm.WDYagTQQm9ns;
                            if (obj == tmVar) {
                            }
                            java.util.List list2 = ((defpackage.vz0) obj).ZpBGe2uQfcn8;
                            size = list2.size();
                            i2 = 0;
                            while (i2 < size) {
                            }
                            return defpackage.gs1.ZpBGe2uQfcn8;
                        }
                    }
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
                if (i != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                defpackage.wz0 wz0Var2 = z00Var.e6mdH7fiFuta;
                defpackage.ri1 ri1Var2 = z00Var.P05cfTpS5W5L;
                defpackage.b80.KrtOTfE6jiS2(obj);
                wz0Var = wz0Var2;
                ri1Var = ri1Var2;
                java.util.List list22 = ((defpackage.vz0) obj).ZpBGe2uQfcn8;
                size = list22.size();
                i2 = 0;
                while (i2 < size) {
                    if (((defpackage.c01) list22.get(i2)).JhCgjQRTAOCT) {
                        z00Var.P05cfTpS5W5L = ri1Var;
                        z00Var.e6mdH7fiFuta = wz0Var;
                        z00Var.Ns0WNyEWdPsk = 1;
                        obj = ri1Var.ZpBGe2uQfcn8(wz0Var, z00Var);
                        tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (obj == tmVar) {
                            return tmVar;
                        }
                        java.util.List list222 = ((defpackage.vz0) obj).ZpBGe2uQfcn8;
                        size = list222.size();
                        i2 = 0;
                        while (i2 < size) {
                        }
                    } else {
                        i2++;
                    }
                }
                return defpackage.gs1.ZpBGe2uQfcn8;
            }
        }
        z00Var = new defpackage.z00(m9Var);
        java.lang.Object obj2 = z00Var.GE9mJIPrb8gP;
        i = z00Var.Ns0WNyEWdPsk;
        if (i != 0) {
        }
    }

    public static final defpackage.ne UmgHb6n58gfG(defpackage.hc1 hc1Var) {
        hc1Var.getClass();
        if (hc1Var instanceof defpackage.cl) {
            return ((defpackage.cl) hc1Var).giKS3J6vZuNy;
        }
        if (hc1Var instanceof defpackage.ic1) {
            return UmgHb6n58gfG(((defpackage.ic1) hc1Var).ZpBGe2uQfcn8);
        }
        return null;
    }

    public static final defpackage.s71 VFeft99leXEK(defpackage.ym ymVar) {
        defpackage.s71 s71Var;
        ymVar.getClass();
        defpackage.b81 b81Var = (defpackage.b81) ymVar.ZpBGe2uQfcn8(P05cfTpS5W5L);
        android.os.Bundle bundle = null;
        if (b81Var == null) {
            defpackage.h7.w7APNrr0aGRc("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
            return null;
        }
        defpackage.ru1 ru1Var = (defpackage.ru1) ymVar.ZpBGe2uQfcn8(e6mdH7fiFuta);
        if (ru1Var == null) {
            defpackage.h7.w7APNrr0aGRc("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
            return null;
        }
        android.os.Bundle bundle2 = (android.os.Bundle) ymVar.ZpBGe2uQfcn8(GE9mJIPrb8gP);
        java.lang.String str = (java.lang.String) ymVar.ZpBGe2uQfcn8(defpackage.ma0.pf0OXpZQoaz3);
        if (str == null) {
            defpackage.h7.w7APNrr0aGRc("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            return null;
        }
        defpackage.z71 maCixPsq4ml2 = b81Var.fWTAfUmVKrZq().maCixPsq4ml2("androidx.lifecycle.internal.SavedStateHandlesProvider");
        defpackage.w71 w71Var = maCixPsq4ml2 instanceof defpackage.w71 ? (defpackage.w71) maCixPsq4ml2 : null;
        if (w71Var == null) {
            defpackage.h7.P05cfTpS5W5L("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
            return null;
        }
        java.util.LinkedHashMap linkedHashMap = BXaznwstz2U0(ru1Var).giKS3J6vZuNy;
        defpackage.s71 s71Var2 = (defpackage.s71) linkedHashMap.get(str);
        if (s71Var2 != null) {
            return s71Var2;
        }
        w71Var.giKS3J6vZuNy();
        android.os.Bundle bundle3 = w71Var.fWTAfUmVKrZq;
        if (bundle3 != null && bundle3.containsKey(str)) {
            android.os.Bundle bundle4 = bundle3.getBundle(str);
            if (bundle4 == null) {
                bundle4 = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
            }
            bundle3.remove(str);
            if (bundle3.isEmpty()) {
                w71Var.fWTAfUmVKrZq = null;
            }
            bundle = bundle4;
        }
        if (bundle != null) {
            bundle2 = bundle;
        }
        if (bundle2 == null) {
            s71Var = new defpackage.s71();
        } else {
            java.lang.ClassLoader classLoader = defpackage.s71.class.getClassLoader();
            classLoader.getClass();
            bundle2.setClassLoader(classLoader);
            defpackage.ck0 ck0Var = new defpackage.ck0(bundle2.size());
            for (java.lang.String str2 : bundle2.keySet()) {
                str2.getClass();
                ck0Var.put(str2, bundle2.get(str2));
            }
            s71Var = new defpackage.s71(ck0Var.giKS3J6vZuNy());
        }
        linkedHashMap.put(str, s71Var);
        return s71Var;
    }

    public static final long WDYagTQQm9ns(long j) {
        long j2 = j << 32;
        int i = defpackage.pf.P05cfTpS5W5L;
        return j2;
    }

    public static final long Wc0TdmRSwbbi(float f, long j, long j2) {
        defpackage.bt0 bt0Var = defpackage.ag.VFeft99leXEK;
        long ZpBGe2uQfcn82 = defpackage.pf.ZpBGe2uQfcn8(j, bt0Var);
        long ZpBGe2uQfcn83 = defpackage.pf.ZpBGe2uQfcn8(j2, bt0Var);
        float JhCgjQRTAOCT2 = defpackage.pf.JhCgjQRTAOCT(ZpBGe2uQfcn82);
        float P05cfTpS5W5L2 = defpackage.pf.P05cfTpS5W5L(ZpBGe2uQfcn82);
        float QiMR8OkAhezm2 = defpackage.pf.QiMR8OkAhezm(ZpBGe2uQfcn82);
        float WDYagTQQm9ns2 = defpackage.pf.WDYagTQQm9ns(ZpBGe2uQfcn82);
        float JhCgjQRTAOCT3 = defpackage.pf.JhCgjQRTAOCT(ZpBGe2uQfcn83);
        float P05cfTpS5W5L3 = defpackage.pf.P05cfTpS5W5L(ZpBGe2uQfcn83);
        float QiMR8OkAhezm3 = defpackage.pf.QiMR8OkAhezm(ZpBGe2uQfcn83);
        float WDYagTQQm9ns3 = defpackage.pf.WDYagTQQm9ns(ZpBGe2uQfcn83);
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        return defpackage.pf.ZpBGe2uQfcn8(GE9mJIPrb8gP(defpackage.t80.OcTWLQzke1i2(P05cfTpS5W5L2, P05cfTpS5W5L3, f), defpackage.t80.OcTWLQzke1i2(QiMR8OkAhezm2, QiMR8OkAhezm3, f), defpackage.t80.OcTWLQzke1i2(WDYagTQQm9ns2, WDYagTQQm9ns3, f), defpackage.t80.OcTWLQzke1i2(JhCgjQRTAOCT2, JhCgjQRTAOCT3, f), bt0Var), defpackage.pf.oh71FJcDz6S2(j2));
    }

    public static final java.util.Set WmetiUbpKU9I(defpackage.hc1 hc1Var) {
        hc1Var.getClass();
        if (hc1Var instanceof defpackage.oc) {
            return ((defpackage.oc) hc1Var).WDYagTQQm9ns();
        }
        java.util.HashSet hashSet = new java.util.HashSet(hc1Var.fWTAfUmVKrZq());
        int fWTAfUmVKrZq2 = hc1Var.fWTAfUmVKrZq();
        for (int i = 0; i < fWTAfUmVKrZq2; i++) {
            hashSet.add(hc1Var.JhCgjQRTAOCT(i));
        }
        return hashSet;
    }

    public static final java.lang.Object XntWc4eZSQ8j(defpackage.g01 g01Var, defpackage.c20 c20Var, defpackage.kl klVar) {
        java.lang.Object YZh1E3mnTFwf = ((defpackage.si1) g01Var).YZh1E3mnTFwf(new defpackage.a10(klVar.oh71FJcDz6S2(), c20Var, null, 0), klVar);
        return YZh1E3mnTFwf == defpackage.tm.WDYagTQQm9ns ? YZh1E3mnTFwf : defpackage.gs1.ZpBGe2uQfcn8;
    }

    public static void ZVVdXbWmyCSK(int i, int i2, int i3) {
        if (i >= 0 && i2 <= i3) {
            if (i <= i2) {
                return;
            }
            defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.P05cfTpS5W5L(i, i2, "fromIndex: ", " > toIndex: "));
        } else {
            throw new java.lang.IndexOutOfBoundsException("fromIndex: " + i + ", toIndex: " + i2 + ", size: " + i3);
        }
    }

    public static final void ZpBGe2uQfcn8(defpackage.jp1 jp1Var, defpackage.vl0 vl0Var, defpackage.y10 y10Var, defpackage.iYH9ueRbBBFm iyh9uerbbbfm, defpackage.y10 y10Var2, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        int i2;
        defpackage.y10 y10Var3;
        defpackage.e30 e30Var2;
        defpackage.ti tiVar;
        defpackage.q5 q5Var;
        defpackage.ff1 ff1Var;
        defpackage.q5 q5Var2;
        defpackage.ep1 ep1Var;
        defpackage.y10 y10Var4 = y10Var;
        e30Var.PS16moFv2oLu(511725103);
        if ((i & 6) == 0) {
            i2 = (e30Var.oh71FJcDz6S2(jp1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(vl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(y10Var4) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(iyh9uerbbbfm) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(y10Var2) ? 16384 : 8192;
        }
        defpackage.nh nhVar2 = nhVar;
        if ((196608 & i) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(nhVar2) ? 131072 : 65536;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (74899 & i2) != 74898)) {
            int i3 = i2 & 14;
            boolean z = i3 == 4;
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj = defpackage.cj.ZpBGe2uQfcn8;
            if (z || GcLuU6pT9wO9 == obj) {
                GcLuU6pT9wO9 = new defpackage.q5(jp1Var, iyh9uerbbbfm);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.q5 q5Var3 = (defpackage.q5) GcLuU6pT9wO9;
            boolean z2 = i3 == 4;
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj2 = GcLuU6pT9wO92;
            if (z2 || GcLuU6pT9wO92 == obj) {
                java.lang.Object[] objArr = {jp1Var.ZpBGe2uQfcn8.oh71FJcDz6S2()};
                defpackage.ff1 ff1Var2 = new defpackage.ff1();
                ff1Var2.addAll(defpackage.y7.a6r05ZxsOP0A(objArr));
                e30Var.EgL5gQQnyJKX(ff1Var2);
                obj2 = ff1Var2;
            }
            defpackage.ff1 ff1Var3 = (defpackage.ff1) obj2;
            boolean z3 = i3 == 4;
            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            if (z3 || GcLuU6pT9wO93 == obj) {
                long[] jArr = defpackage.m81.ZpBGe2uQfcn8;
                GcLuU6pT9wO93 = new defpackage.yn0();
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
            }
            defpackage.yn0 yn0Var = (defpackage.yn0) GcLuU6pT9wO93;
            defpackage.ti tiVar2 = jp1Var.ZpBGe2uQfcn8;
            defpackage.pw0 pw0Var = jp1Var.JhCgjQRTAOCT;
            if (!ff1Var3.contains(tiVar2.oh71FJcDz6S2())) {
                ff1Var3.clear();
                ff1Var3.add(tiVar2.oh71FJcDz6S2());
            }
            if (defpackage.ma0.QiMR8OkAhezm(tiVar2.oh71FJcDz6S2(), pw0Var.getValue())) {
                if (ff1Var3.size() != 1 || !defpackage.ma0.QiMR8OkAhezm(ff1Var3.get(0), tiVar2.oh71FJcDz6S2())) {
                    ff1Var3.clear();
                    ff1Var3.add(tiVar2.oh71FJcDz6S2());
                }
                if (yn0Var.WDYagTQQm9ns != 1 || yn0Var.fWTAfUmVKrZq(tiVar2.oh71FJcDz6S2())) {
                    yn0Var.ZpBGe2uQfcn8();
                }
                q5Var3.giKS3J6vZuNy = iyh9uerbbbfm;
            }
            if (defpackage.ma0.QiMR8OkAhezm(tiVar2.oh71FJcDz6S2(), pw0Var.getValue()) || ff1Var3.contains(pw0Var.getValue())) {
                tiVar = tiVar2;
            } else {
                java.util.ListIterator listIterator = ff1Var3.listIterator();
                int i4 = 0;
                while (true) {
                    defpackage.i50 i50Var = (defpackage.i50) listIterator;
                    tiVar = tiVar2;
                    if (!i50Var.hasNext()) {
                        i4 = -1;
                        break;
                    } else {
                        if (defpackage.ma0.QiMR8OkAhezm(y10Var2.P05cfTpS5W5L(i50Var.next()), y10Var2.P05cfTpS5W5L(pw0Var.getValue()))) {
                            break;
                        }
                        i4++;
                        tiVar2 = tiVar;
                    }
                }
                if (i4 == -1) {
                    ff1Var3.add(pw0Var.getValue());
                } else {
                    ff1Var3.set(i4, pw0Var.getValue());
                }
            }
            if (yn0Var.fWTAfUmVKrZq(pw0Var.getValue()) && yn0Var.fWTAfUmVKrZq(tiVar.oh71FJcDz6S2())) {
                e30Var.NkfcFfdaVTox(1968995539);
                e30Var.XntWc4eZSQ8j(false);
                y10Var3 = y10Var4;
                q5Var = q5Var3;
            } else {
                e30Var.NkfcFfdaVTox(1966410449);
                yn0Var.ZpBGe2uQfcn8();
                int size = ff1Var3.size();
                int i5 = 0;
                while (i5 < size) {
                    java.lang.Object obj3 = ff1Var3.get(i5);
                    yn0Var.h3m55N1URyyK(obj3, defpackage.nn.OcTWLQzke1i2(-23915175, new defpackage.f5(jp1Var, obj3, y10Var4, q5Var3, ff1Var3, nhVar2), e30Var));
                    i5++;
                    y10Var4 = y10Var4;
                    nhVar2 = nhVar;
                }
                y10Var3 = y10Var4;
                q5Var = q5Var3;
                e30Var.XntWc4eZSQ8j(false);
            }
            boolean oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(jp1Var.oh71FJcDz6S2()) | e30Var.oh71FJcDz6S2(q5Var);
            java.lang.Object GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S22 || GcLuU6pT9wO94 == obj) {
                GcLuU6pT9wO94 = (defpackage.yk) y10Var3.P05cfTpS5W5L(q5Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO94);
            }
            defpackage.yk ykVar = (defpackage.yk) GcLuU6pT9wO94;
            defpackage.jp1 jp1Var2 = q5Var.ZpBGe2uQfcn8;
            boolean oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(q5Var);
            java.lang.Object GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S23 || GcLuU6pT9wO95 == obj) {
                GcLuU6pT9wO95 = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO95);
            }
            defpackage.fo0 fo0Var = (defpackage.fo0) GcLuU6pT9wO95;
            defpackage.fo0 w6IV1lieBIux = defpackage.w60.w6IV1lieBIux(ykVar.JhCgjQRTAOCT, e30Var);
            if (defpackage.ma0.QiMR8OkAhezm(jp1Var2.ZpBGe2uQfcn8.oh71FJcDz6S2(), jp1Var2.JhCgjQRTAOCT.getValue())) {
                fo0Var.setValue(java.lang.Boolean.FALSE);
            } else if (w6IV1lieBIux.getValue() != null) {
                fo0Var.setValue(java.lang.Boolean.TRUE);
            }
            boolean booleanValue = ((java.lang.Boolean) fo0Var.getValue()).booleanValue();
            defpackage.vl0 vl0Var2 = defpackage.sl0.ZpBGe2uQfcn8;
            if (booleanValue) {
                e30Var.NkfcFfdaVTox(1353077497);
                defpackage.q5 q5Var4 = q5Var;
                ff1Var = ff1Var3;
                q5Var2 = q5Var4;
                e30Var2 = e30Var;
                ep1Var = defpackage.vx1.WmetiUbpKU9I(q5Var4.ZpBGe2uQfcn8, defpackage.nn.OcTWLQzke1i2, null, e30Var2, 0, 2);
                boolean oh71FJcDz6S24 = e30Var2.oh71FJcDz6S2(ep1Var);
                java.lang.Object GcLuU6pT9wO96 = e30Var2.GcLuU6pT9wO9();
                if (oh71FJcDz6S24 || GcLuU6pT9wO96 == obj) {
                    GcLuU6pT9wO96 = defpackage.h0.s0TASMVLSWD5(vl0Var2);
                    e30Var2.EgL5gQQnyJKX(GcLuU6pT9wO96);
                }
                vl0Var2 = (defpackage.vl0) GcLuU6pT9wO96;
                e30Var2.XntWc4eZSQ8j(false);
            } else {
                ff1Var = ff1Var3;
                e30Var2 = e30Var;
                q5Var2 = q5Var;
                e30Var2.NkfcFfdaVTox(1353343539);
                e30Var2.XntWc4eZSQ8j(false);
                ep1Var = null;
            }
            defpackage.vl0 fWTAfUmVKrZq2 = vl0Var.fWTAfUmVKrZq(vl0Var2.fWTAfUmVKrZq(new defpackage.m5(ep1Var, w6IV1lieBIux, q5Var2)));
            java.lang.Object GcLuU6pT9wO97 = e30Var2.GcLuU6pT9wO9();
            if (GcLuU6pT9wO97 == obj) {
                GcLuU6pT9wO97 = new defpackage.j5(q5Var2);
                e30Var2.EgL5gQQnyJKX(GcLuU6pT9wO97);
            }
            defpackage.j5 j5Var = (defpackage.j5) GcLuU6pT9wO97;
            int hashCode = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR = e30Var2.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var2, fWTAfUmVKrZq2);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var2.fhbmYuu9J3cT();
            if (e30Var2.Fu5WBEia9jBo) {
                e30Var2.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var2.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var2, j5Var);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var2, fNwYGHIYeJcR);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
            defpackage.h5 h5Var = defpackage.vi.QiMR8OkAhezm;
            if (e30Var2.Fu5WBEia9jBo) {
                e30Var2.giKS3J6vZuNy(h5Var, valueOf);
            }
            defpackage.t80.Mearx7yMn90V(e30Var2, defpackage.vi.P05cfTpS5W5L);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var2, oCu53ZX2v4Ju);
            e30Var2.NkfcFfdaVTox(-860173498);
            int size2 = ff1Var.size();
            int i6 = 0;
            while (i6 < size2) {
                defpackage.ff1 ff1Var4 = ff1Var;
                java.lang.Object obj4 = ff1Var4.get(i6);
                e30Var2.Fu5WBEia9jBo(-2026002954, 0, y10Var2.P05cfTpS5W5L(obj4), null);
                defpackage.c20 c20Var = (defpackage.c20) yn0Var.QiMR8OkAhezm(obj4);
                if (c20Var == null) {
                    e30Var2.NkfcFfdaVTox(1618454323);
                } else {
                    e30Var2.NkfcFfdaVTox(-2026001778);
                    c20Var.QiMR8OkAhezm(e30Var2, 0);
                }
                e30Var2.XntWc4eZSQ8j(false);
                e30Var2.XntWc4eZSQ8j(false);
                i6++;
                ff1Var = ff1Var4;
            }
            e30Var2.XntWc4eZSQ8j(false);
            e30Var2.XntWc4eZSQ8j(true);
        } else {
            y10Var3 = y10Var4;
            e30Var2 = e30Var;
            e30Var2.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.g5(jp1Var, vl0Var, y10Var3, iyh9uerbbbfm, y10Var2, nhVar, i);
        }
    }

    public static int blKFvluuDQOf(android.view.inputmethod.HandwritingGesture handwritingGesture, defpackage.fNwYGHIYeJcR fnwyghiyejcr) {
        java.lang.String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        fnwyghiyejcr.P05cfTpS5W5L(new defpackage.og(fallbackText, 1));
        return 5;
    }

    public static final void dG7RjM6DqYVL(defpackage.wm0 wm0Var, defpackage.id idVar, defpackage.vb vbVar, float f, defpackage.zc1 zc1Var, defpackage.qk1 qk1Var, defpackage.dt dtVar) {
        java.util.ArrayList arrayList = wm0Var.P05cfTpS5W5L;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            defpackage.dw0 dw0Var = (defpackage.dw0) arrayList.get(i);
            dw0Var.ZpBGe2uQfcn8.QiMR8OkAhezm(idVar, vbVar, f, zc1Var, qk1Var, dtVar);
            idVar.oh71FJcDz6S2(0.0f, dw0Var.ZpBGe2uQfcn8.giKS3J6vZuNy());
        }
    }

    public static final void e6mdH7fiFuta(java.util.List list, defpackage.y10 y10Var, defpackage.vl0 vl0Var, defpackage.e30 e30Var, int i) {
        defpackage.vl0 vl0Var2;
        list.getClass();
        y10Var.getClass();
        e30Var.PS16moFv2oLu(-826745499);
        int i2 = (e30Var.oh71FJcDz6S2(list) ? 4 : 2) | i | (e30Var.P05cfTpS5W5L(y10Var) ? 32 : 16) | 384;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            defpackage.zw zwVar = defpackage.ce1.fWTAfUmVKrZq;
            defpackage.l7 l7Var = new defpackage.l7(12.0f, new defpackage.h7(r5));
            int i3 = ((i2 & 14) != 4 ? 0 : 1) | ((i2 & 112) == 32 ? 1 : 0);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (i3 != 0 || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.fWTAfUmVKrZq(18, list, y10Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.j80.ZpBGe2uQfcn8(zwVar, null, null, l7Var, null, null, false, null, (defpackage.y10) GcLuU6pT9wO9, e30Var, 24576);
            vl0Var2 = defpackage.sl0.ZpBGe2uQfcn8;
        } else {
            e30Var.Jkfc0NcwyPL8();
            vl0Var2 = vl0Var;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.p71(list, y10Var, vl0Var2, i, 5);
        }
    }

    public static final boolean fNwYGHIYeJcR(defpackage.jb1 jb1Var, android.content.res.Resources resources) {
        java.lang.Object QiMR8OkAhezm2 = jb1Var.JhCgjQRTAOCT.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.ZpBGe2uQfcn8);
        if (QiMR8OkAhezm2 == null) {
            QiMR8OkAhezm2 = null;
        }
        java.util.List list = (java.util.List) QiMR8OkAhezm2;
        return !defpackage.h0.IBvW5fLsPuHy(jb1Var) && (jb1Var.JhCgjQRTAOCT.QiMR8OkAhezm || (jb1Var.WmetiUbpKU9I() && ((list != null ? (java.lang.String) defpackage.hf.FhgBoOud6zyW(list) : null) != null || frSwwKIlbUhK(jb1Var) != null || Mearx7yMn90V(jb1Var, resources) != null || jjTN4uUnoyEn(jb1Var))));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long fWTAfUmVKrZq(float f, float f2, float f3, float f4, defpackage.xf xfVar) {
        int i;
        int i2;
        int i3;
        float giKS3J6vZuNy2;
        float ZpBGe2uQfcn82;
        int i4;
        int i5;
        int i6;
        int i7;
        float giKS3J6vZuNy3;
        float ZpBGe2uQfcn83;
        int i8;
        int i9;
        int i10;
        if (xfVar.fWTAfUmVKrZq()) {
            float f5 = f4 < 0.0f ? 0.0f : f4;
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            int i11 = ((int) ((f5 * 255.0f) + 0.5f)) << 24;
            float f6 = f < 0.0f ? 0.0f : f;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = i11 | (((int) ((f6 * 255.0f) + 0.5f)) << 16);
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 8);
            long j = (i13 | ((int) ((((f3 >= 0.0f ? f3 : 0.0f) <= 1.0f ? r6 : 1.0f) * 255.0f) + 0.5f))) << 32;
            int i14 = defpackage.pf.P05cfTpS5W5L;
            return j;
        }
        if (((int) (xfVar.giKS3J6vZuNy >> 32)) != 3) {
            defpackage.d80.ZpBGe2uQfcn8("Color only works with ColorSpaces with 3 components");
        }
        int i15 = xfVar.fWTAfUmVKrZq;
        if (i15 == -1) {
            defpackage.d80.ZpBGe2uQfcn8("Unknown color space, please use a color space in ColorSpaces");
        }
        float giKS3J6vZuNy4 = xfVar.giKS3J6vZuNy(0);
        float ZpBGe2uQfcn84 = xfVar.ZpBGe2uQfcn8(0);
        if (f >= giKS3J6vZuNy4) {
            giKS3J6vZuNy4 = f;
        }
        if (giKS3J6vZuNy4 <= ZpBGe2uQfcn84) {
            ZpBGe2uQfcn84 = giKS3J6vZuNy4;
        }
        int floatToRawIntBits = java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn84);
        int i16 = floatToRawIntBits >>> 31;
        int i17 = (floatToRawIntBits >>> 23) & 255;
        int i18 = floatToRawIntBits & 8388607;
        if (i17 == 255) {
            i2 = i18 != 0 ? 512 : 0;
            i = 31;
        } else {
            i = i17 - 112;
            if (i >= 31) {
                i2 = 0;
                i = 49;
            } else if (i > 0) {
                int i19 = i18 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i3 = (((i << 10) | i19) + 1) | (i16 << 15);
                    short s = (short) i3;
                    giKS3J6vZuNy2 = xfVar.giKS3J6vZuNy(1);
                    ZpBGe2uQfcn82 = xfVar.ZpBGe2uQfcn8(1);
                    if (f2 >= giKS3J6vZuNy2) {
                        giKS3J6vZuNy2 = f2;
                    }
                    if (giKS3J6vZuNy2 <= ZpBGe2uQfcn82) {
                        ZpBGe2uQfcn82 = giKS3J6vZuNy2;
                    }
                    int floatToRawIntBits2 = java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn82);
                    int i20 = floatToRawIntBits2 >>> 31;
                    i4 = (floatToRawIntBits2 >>> 23) & 255;
                    int i21 = floatToRawIntBits2 & 8388607;
                    if (i4 != 255) {
                        i6 = i21 != 0 ? 512 : 0;
                        i5 = 31;
                    } else {
                        i5 = i4 - 112;
                        if (i5 >= 31) {
                            i6 = 0;
                            i5 = 49;
                        } else if (i5 > 0) {
                            int i22 = i21 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i7 = (((i5 << 10) | i22) + 1) | (i20 << 15);
                                short s2 = (short) i7;
                                giKS3J6vZuNy3 = xfVar.giKS3J6vZuNy(2);
                                ZpBGe2uQfcn83 = xfVar.ZpBGe2uQfcn8(2);
                                if (f3 >= giKS3J6vZuNy3) {
                                    giKS3J6vZuNy3 = f3;
                                }
                                if (giKS3J6vZuNy3 <= ZpBGe2uQfcn83) {
                                    ZpBGe2uQfcn83 = giKS3J6vZuNy3;
                                }
                                int floatToRawIntBits3 = java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn83);
                                int i23 = floatToRawIntBits3 >>> 31;
                                i8 = (floatToRawIntBits3 >>> 23) & 255;
                                int i24 = 8388607 & floatToRawIntBits3;
                                if (i8 == 255) {
                                    i9 = i24 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i25 = i8 - 112;
                                    if (i25 >= 31) {
                                        i9 = 0;
                                        r7 = 49;
                                    } else if (i25 > 0) {
                                        int i26 = i24 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i10 = (((i25 << 10) | i26) + 1) | (i23 << 15);
                                            long j2 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            int i27 = defpackage.pf.P05cfTpS5W5L;
                                            return j2;
                                        }
                                        i9 = i26;
                                        r7 = i25;
                                    } else if (i25 >= -10) {
                                        int i28 = (i24 | 8388608) >> (1 - i25);
                                        if ((i28 & 4096) != 0) {
                                            i28 += 8192;
                                        }
                                        i9 = i28 >> 13;
                                    } else {
                                        i9 = 0;
                                    }
                                }
                                i10 = i9 | (i23 << 15) | (r7 << 10);
                                if (f4 >= 0.0f) {
                                }
                                long j22 = (i15 & 63) | ((s & 65535) << 48) | ((s2 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                int i272 = defpackage.pf.P05cfTpS5W5L;
                                return j22;
                            }
                            i6 = i22;
                        } else if (i5 >= -10) {
                            int i29 = (i21 | 8388608) >> (1 - i5);
                            if ((i29 & 4096) != 0) {
                                i29 += 8192;
                            }
                            i6 = i29 >> 13;
                            i5 = 0;
                        } else {
                            i6 = 0;
                            i5 = 0;
                        }
                    }
                    i7 = i6 | (i20 << 15) | (i5 << 10);
                    short s22 = (short) i7;
                    giKS3J6vZuNy3 = xfVar.giKS3J6vZuNy(2);
                    ZpBGe2uQfcn83 = xfVar.ZpBGe2uQfcn8(2);
                    if (f3 >= giKS3J6vZuNy3) {
                    }
                    if (giKS3J6vZuNy3 <= ZpBGe2uQfcn83) {
                    }
                    int floatToRawIntBits32 = java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn83);
                    int i232 = floatToRawIntBits32 >>> 31;
                    i8 = (floatToRawIntBits32 >>> 23) & 255;
                    int i242 = 8388607 & floatToRawIntBits32;
                    if (i8 == 255) {
                    }
                    i10 = i9 | (i232 << 15) | (r7 << 10);
                    if (f4 >= 0.0f) {
                    }
                    long j222 = (i15 & 63) | ((s & 65535) << 48) | ((s22 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    int i2722 = defpackage.pf.P05cfTpS5W5L;
                    return j222;
                }
                i2 = i19;
            } else if (i >= -10) {
                int i30 = (i18 | 8388608) >> (1 - i);
                if ((i30 & 4096) != 0) {
                    i30 += 8192;
                }
                i2 = i30 >> 13;
                i = 0;
            } else {
                i2 = 0;
                i = 0;
            }
        }
        i3 = i2 | (i16 << 15) | (i << 10);
        short s3 = (short) i3;
        giKS3J6vZuNy2 = xfVar.giKS3J6vZuNy(1);
        ZpBGe2uQfcn82 = xfVar.ZpBGe2uQfcn8(1);
        if (f2 >= giKS3J6vZuNy2) {
        }
        if (giKS3J6vZuNy2 <= ZpBGe2uQfcn82) {
        }
        int floatToRawIntBits22 = java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn82);
        int i202 = floatToRawIntBits22 >>> 31;
        i4 = (floatToRawIntBits22 >>> 23) & 255;
        int i212 = floatToRawIntBits22 & 8388607;
        if (i4 != 255) {
        }
        i7 = i6 | (i202 << 15) | (i5 << 10);
        short s222 = (short) i7;
        giKS3J6vZuNy3 = xfVar.giKS3J6vZuNy(2);
        ZpBGe2uQfcn83 = xfVar.ZpBGe2uQfcn8(2);
        if (f3 >= giKS3J6vZuNy3) {
        }
        if (giKS3J6vZuNy3 <= ZpBGe2uQfcn83) {
        }
        int floatToRawIntBits322 = java.lang.Float.floatToRawIntBits(ZpBGe2uQfcn83);
        int i2322 = floatToRawIntBits322 >>> 31;
        i8 = (floatToRawIntBits322 >>> 23) & 255;
        int i2422 = 8388607 & floatToRawIntBits322;
        if (i8 == 255) {
        }
        i10 = i9 | (i2322 << 15) | (r7 << 10);
        if (f4 >= 0.0f) {
        }
        long j2222 = (i15 & 63) | ((s3 & 65535) << 48) | ((s222 & 65535) << 32) | ((65535 & ((short) i10)) << 16) | ((((int) ((((f4 >= 0.0f ? f4 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        int i27222 = defpackage.pf.P05cfTpS5W5L;
        return j2222;
    }

    public static final java.lang.Object fhbmYuu9J3cT(defpackage.jm jmVar, defpackage.c20 c20Var, defpackage.kl klVar) {
        defpackage.jm oh71FJcDz6S22 = klVar.oh71FJcDz6S2();
        defpackage.jm fNwYGHIYeJcR = !((java.lang.Boolean) jmVar.BHfvd2J71qpO(new defpackage.b7(14, (byte) 0), java.lang.Boolean.FALSE)).booleanValue() ? oh71FJcDz6S22.fNwYGHIYeJcR(jmVar) : defpackage.nn.s0TASMVLSWD5(oh71FJcDz6S22, jmVar, false);
        defpackage.b80.h3m55N1URyyK(fNwYGHIYeJcR);
        if (fNwYGHIYeJcR == oh71FJcDz6S22) {
            defpackage.r81 r81Var = new defpackage.r81(klVar, fNwYGHIYeJcR);
            return defpackage.b80.frSwwKIlbUhK(r81Var, r81Var, c20Var);
        }
        defpackage.jVUAPb5NnIYW jvuapb5nniyw = defpackage.jVUAPb5NnIYW.OcTWLQzke1i2;
        if (defpackage.ma0.QiMR8OkAhezm(fNwYGHIYeJcR.XntWc4eZSQ8j(jvuapb5nniyw), oh71FJcDz6S22.XntWc4eZSQ8j(jvuapb5nniyw))) {
            defpackage.ds1 ds1Var = new defpackage.ds1(klVar, fNwYGHIYeJcR);
            defpackage.jm jmVar2 = ds1Var.e6mdH7fiFuta;
            java.lang.Object FhgBoOud6zyW = defpackage.nq1.FhgBoOud6zyW(jmVar2, null);
            try {
                return defpackage.b80.frSwwKIlbUhK(ds1Var, ds1Var, c20Var);
            } finally {
                defpackage.nq1.EPEWHACkMcF1(jmVar2, FhgBoOud6zyW);
            }
        }
        defpackage.pq pqVar = new defpackage.pq(klVar, fNwYGHIYeJcR);
        try {
            defpackage.ma0.jjTN4uUnoyEn(defpackage.q70.OcTWLQzke1i2(defpackage.q70.T1fB7bDYiVJQ(pqVar, pqVar, c20Var)), defpackage.gs1.ZpBGe2uQfcn8);
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = defpackage.pq.Ns0WNyEWdPsk;
            do {
                int i = atomicIntegerFieldUpdater.get(pqVar);
                if (i != 0) {
                    if (i != 2) {
                        defpackage.h7.P05cfTpS5W5L("Already suspended");
                        return null;
                    }
                    java.lang.Object z16KqenTjq8o = defpackage.jr0.z16KqenTjq8o(pqVar.Wc0TdmRSwbbi());
                    if (z16KqenTjq8o instanceof defpackage.ug) {
                        throw ((defpackage.ug) z16KqenTjq8o).ZpBGe2uQfcn8;
                    }
                    return z16KqenTjq8o;
                }
            } while (!atomicIntegerFieldUpdater.compareAndSet(pqVar, 0, 1));
            return defpackage.tm.WDYagTQQm9ns;
        } catch (java.lang.Throwable th) {
            pqVar.e6mdH7fiFuta(new defpackage.g51(th));
            throw th;
        }
    }

    public static final defpackage.l6 frSwwKIlbUhK(defpackage.jb1 jb1Var) {
        java.lang.Object QiMR8OkAhezm2 = jb1Var.JhCgjQRTAOCT.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.frSwwKIlbUhK);
        if (QiMR8OkAhezm2 == null) {
            QiMR8OkAhezm2 = null;
        }
        defpackage.l6 l6Var = (defpackage.l6) QiMR8OkAhezm2;
        java.lang.Object QiMR8OkAhezm3 = jb1Var.JhCgjQRTAOCT.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.UmgHb6n58gfG);
        if (QiMR8OkAhezm3 == null) {
            QiMR8OkAhezm3 = null;
        }
        java.util.List list = (java.util.List) QiMR8OkAhezm3;
        return l6Var == null ? list != null ? (defpackage.l6) defpackage.hf.FhgBoOud6zyW(list) : null : l6Var;
    }

    public static final boolean gUjdnLbkVAaA(defpackage.ig1 ig1Var, int i, defpackage.blKFvluuDQOf blkfvluudqof, boolean z) {
        boolean z2;
        synchronized (Ns0WNyEWdPsk) {
            try {
                int i2 = ig1Var.JhCgjQRTAOCT;
                if (i2 == i) {
                    ig1Var.fWTAfUmVKrZq = blkfvluudqof;
                    z2 = true;
                    if (z) {
                        ig1Var.WDYagTQQm9ns++;
                    }
                    ig1Var.JhCgjQRTAOCT = i2 + 1;
                } else {
                    z2 = false;
                }
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public static defpackage.dc giKS3J6vZuNy(int i, int i2, defpackage.zb zbVar) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        int i3 = i2 & 2;
        defpackage.zb zbVar2 = defpackage.zb.WDYagTQQm9ns;
        if (i3 != 0) {
            zbVar = zbVar2;
        }
        if (i == -2) {
            if (zbVar != zbVar2) {
                return new defpackage.xj(1, zbVar);
            }
            defpackage.pd.giKS3J6vZuNy.getClass();
            return new defpackage.dc(defpackage.od.giKS3J6vZuNy);
        }
        if (i != -1) {
            return i != 0 ? i != Integer.MAX_VALUE ? zbVar == zbVar2 ? new defpackage.dc(i) : new defpackage.xj(i, zbVar) : new defpackage.dc(Integer.MAX_VALUE) : zbVar == zbVar2 ? new defpackage.dc(0) : new defpackage.xj(1, zbVar);
        }
        if (zbVar == zbVar2) {
            return new defpackage.xj(1, defpackage.zb.oh71FJcDz6S2);
        }
        defpackage.h7.w7APNrr0aGRc("CONFLATED capacity cannot be used with non-default onBufferOverflow");
        return null;
    }

    public static final void h3m55N1URyyK(int i, int i2) {
        if (i < 0 || i >= i2) {
            throw new java.lang.IndexOutOfBoundsException("index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
    }

    public static final int hH0RRJrNssvh(defpackage.ff1 ff1Var) {
        defpackage.ig1 ig1Var = ff1Var.WDYagTQQm9ns;
        ig1Var.getClass();
        return ((defpackage.ig1) defpackage.te1.P05cfTpS5W5L(ig1Var)).WDYagTQQm9ns;
    }

    public static final boolean jjTN4uUnoyEn(defpackage.jb1 jb1Var) {
        java.lang.Object QiMR8OkAhezm2 = jb1Var.JhCgjQRTAOCT.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.nb1.hH0RRJrNssvh);
        if (QiMR8OkAhezm2 == null) {
            QiMR8OkAhezm2 = null;
        }
        defpackage.ko1 ko1Var = (defpackage.ko1) QiMR8OkAhezm2;
        defpackage.yn0 yn0Var = jb1Var.JhCgjQRTAOCT.WDYagTQQm9ns;
        java.lang.Object QiMR8OkAhezm3 = yn0Var.QiMR8OkAhezm(defpackage.nb1.dG7RjM6DqYVL);
        if (QiMR8OkAhezm3 == null) {
            QiMR8OkAhezm3 = null;
        }
        defpackage.d61 d61Var = (defpackage.d61) QiMR8OkAhezm3;
        boolean z = ko1Var != null;
        java.lang.Object QiMR8OkAhezm4 = yn0Var.QiMR8OkAhezm(defpackage.nb1.BXaznwstz2U0);
        if (((java.lang.Boolean) (QiMR8OkAhezm4 != null ? QiMR8OkAhezm4 : null)) == null || (d61Var != null && d61Var.ZpBGe2uQfcn8 == 4)) {
            return z;
        }
        return true;
    }

    public static final defpackage.g6 maCixPsq4ml2(defpackage.g6 g6Var) {
        defpackage.g6 fWTAfUmVKrZq2 = g6Var.fWTAfUmVKrZq();
        int giKS3J6vZuNy2 = fWTAfUmVKrZq2.giKS3J6vZuNy();
        for (int i = 0; i < giKS3J6vZuNy2; i++) {
            fWTAfUmVKrZq2.WDYagTQQm9ns(g6Var.ZpBGe2uQfcn8(i), i);
        }
        return fWTAfUmVKrZq2;
    }

    public static boolean oCu53ZX2v4Ju(java.io.File file) {
        if (!file.isDirectory()) {
            file.delete();
            return true;
        }
        java.io.File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return false;
        }
        boolean z = true;
        for (java.io.File file2 : listFiles) {
            z = oCu53ZX2v4Ju(file2) && z;
        }
        return z;
    }

    public static long oh71FJcDz6S2(int i, int i2, int i3) {
        return JhCgjQRTAOCT(((i & 255) << 16) | (-16777216) | ((i2 & 255) << 8) | (i3 & 255));
    }

    public static java.util.Set qjMheFZ0l9kA() {
        try {
            java.lang.Object invoke = java.lang.Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (invoke == null) {
                return java.util.Collections.EMPTY_SET;
            }
            java.util.Set set = (java.util.Set) invoke;
            java.util.Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return java.util.Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (java.lang.Throwable unused) {
            return java.util.Collections.EMPTY_SET;
        }
    }

    public static final boolean s0TASMVLSWD5(java.lang.Object obj) {
        if (obj instanceof defpackage.xe1) {
            defpackage.xe1 xe1Var = (defpackage.xe1) obj;
            if (xe1Var.WDYagTQQm9ns() == defpackage.jVUAPb5NnIYW.z16KqenTjq8o || xe1Var.WDYagTQQm9ns() == defpackage.pa1.Ns0WNyEWdPsk || xe1Var.WDYagTQQm9ns() == defpackage.jVUAPb5NnIYW.GoIRkIe1iwj6) {
                java.lang.Object value = xe1Var.getValue();
                if (value == null) {
                    return true;
                }
                return s0TASMVLSWD5(value);
            }
        } else if (!(obj instanceof defpackage.k20) || !(obj instanceof java.io.Serializable)) {
            for (int i = 0; i < 7; i++) {
                if (fWTAfUmVKrZq[i].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final defpackage.yf1 w6IV1lieBIux(defpackage.sm smVar, defpackage.jm jmVar, defpackage.vm vmVar, defpackage.c20 c20Var) {
        defpackage.jm s0TASMVLSWD5 = defpackage.nn.s0TASMVLSWD5(smVar.QiMR8OkAhezm(), jmVar, true);
        defpackage.jo joVar = defpackage.tq.ZpBGe2uQfcn8;
        if (s0TASMVLSWD5 != joVar && s0TASMVLSWD5.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.OcTWLQzke1i2) == null) {
            s0TASMVLSWD5 = s0TASMVLSWD5.fNwYGHIYeJcR(joVar);
        }
        vmVar.getClass();
        defpackage.yf1 xf0Var = vmVar == defpackage.vm.oh71FJcDz6S2 ? new defpackage.xf0(s0TASMVLSWD5, c20Var) : new defpackage.yf1(s0TASMVLSWD5, true);
        xf0Var.mnkwqFSfsWTC(vmVar, xf0Var, c20Var);
        return xf0Var;
    }

    public static final defpackage.hc1[] w7APNrr0aGRc(java.util.List list) {
        defpackage.hc1[] hc1VarArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (hc1VarArr = (defpackage.hc1[]) list.toArray(new defpackage.hc1[0])) == null) ? QiMR8OkAhezm : hc1VarArr;
    }

    public static final defpackage.ne xahdJg25P1Bv(defpackage.sb0 sb0Var) {
        defpackage.ne giKS3J6vZuNy2 = sb0Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8.giKS3J6vZuNy();
        if (giKS3J6vZuNy2 instanceof defpackage.ne) {
            return giKS3J6vZuNy2;
        }
        throw new java.lang.IllegalArgumentException("Only KClass supported as classifier, got " + giKS3J6vZuNy2);
    }

    public static final java.lang.Object z16KqenTjq8o(defpackage.jm jmVar, defpackage.c20 c20Var) {
        defpackage.vv vvVar;
        defpackage.jm s0TASMVLSWD5;
        java.lang.Thread currentThread = java.lang.Thread.currentThread();
        defpackage.im imVar = defpackage.jVUAPb5NnIYW.OcTWLQzke1i2;
        defpackage.lm lmVar = (defpackage.lm) jmVar.XntWc4eZSQ8j(imVar);
        defpackage.xu xuVar = defpackage.xu.WDYagTQQm9ns;
        if (lmVar == null) {
            vvVar = defpackage.xn1.ZpBGe2uQfcn8();
            s0TASMVLSWD5 = defpackage.nn.s0TASMVLSWD5(xuVar, jmVar.fNwYGHIYeJcR(vvVar), true);
            defpackage.jo joVar = defpackage.tq.ZpBGe2uQfcn8;
            if (s0TASMVLSWD5 != joVar && s0TASMVLSWD5.XntWc4eZSQ8j(imVar) == null) {
                s0TASMVLSWD5 = s0TASMVLSWD5.fNwYGHIYeJcR(joVar);
            }
        } else {
            vvVar = (defpackage.vv) defpackage.xn1.ZpBGe2uQfcn8.get();
            s0TASMVLSWD5 = defpackage.nn.s0TASMVLSWD5(xuVar, jmVar, true);
            defpackage.jo joVar2 = defpackage.tq.ZpBGe2uQfcn8;
            if (s0TASMVLSWD5 != joVar2 && s0TASMVLSWD5.XntWc4eZSQ8j(imVar) == null) {
                s0TASMVLSWD5 = s0TASMVLSWD5.fNwYGHIYeJcR(joVar2);
            }
        }
        defpackage.ja jaVar = new defpackage.ja(s0TASMVLSWD5, currentThread, vvVar);
        jaVar.mnkwqFSfsWTC(defpackage.vm.WDYagTQQm9ns, jaVar, c20Var);
        defpackage.vv vvVar2 = jaVar.Ns0WNyEWdPsk;
        if (vvVar2 != null) {
            int i = defpackage.vv.GE9mJIPrb8gP;
            vvVar2.hH0RRJrNssvh(false);
        }
        while (!java.lang.Thread.interrupted()) {
            try {
                long GcLuU6pT9wO9 = vvVar2 != null ? vvVar2.GcLuU6pT9wO9() : Long.MAX_VALUE;
                if (!(jaVar.Wc0TdmRSwbbi() instanceof defpackage.s60)) {
                    if (vvVar2 != null) {
                        int i2 = defpackage.vv.GE9mJIPrb8gP;
                        vvVar2.IBvW5fLsPuHy(false);
                    }
                    java.lang.Object z16KqenTjq8o = defpackage.jr0.z16KqenTjq8o(jaVar.Wc0TdmRSwbbi());
                    defpackage.ug ugVar = z16KqenTjq8o instanceof defpackage.ug ? (defpackage.ug) z16KqenTjq8o : null;
                    if (ugVar == null) {
                        return z16KqenTjq8o;
                    }
                    throw ugVar.ZpBGe2uQfcn8;
                }
                java.util.concurrent.locks.LockSupport.parkNanos(jaVar, GcLuU6pT9wO9);
            } catch (java.lang.Throwable th) {
                if (vvVar2 != null) {
                    int i3 = defpackage.vv.GE9mJIPrb8gP;
                    vvVar2.IBvW5fLsPuHy(false);
                }
                throw th;
            }
        }
        java.lang.InterruptedException interruptedException = new java.lang.InterruptedException();
        jaVar.dG7RjM6DqYVL(interruptedException);
        throw interruptedException;
    }

    public static /* synthetic */ defpackage.yf1 zJPqDeoF0Os1(defpackage.sm smVar, defpackage.jm jmVar, defpackage.c20 c20Var, int i) {
        if ((i & 1) != 0) {
            jmVar = defpackage.xu.WDYagTQQm9ns;
        }
        return w6IV1lieBIux(smVar, jmVar, (i & 2) != 0 ? defpackage.vm.WDYagTQQm9ns : defpackage.vm.P05cfTpS5W5L, c20Var);
    }
}
