package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class q70 {
    public q70() {
        new java.util.concurrent.ConcurrentHashMap();
    }

    public static final long BXaznwstz2U0(long j, long j2) {
        long j3 = j - j2;
        long j4 = (j3 ^ j) & (~(j3 ^ j2));
        defpackage.mt mtVar = defpackage.mt.NANOSECONDS;
        if (j4 >= 0) {
            return defpackage.vx1.zJPqDeoF0Os1(j3, mtVar);
        }
        defpackage.mt mtVar2 = defpackage.mt.MILLISECONDS;
        if (mtVar.compareTo(mtVar2) >= 0) {
            return defpackage.jt.JhCgjQRTAOCT(dG7RjM6DqYVL(j3));
        }
        long j5 = (j / 1000000) - (j2 / 1000000);
        long j6 = (j % 1000000) - (j2 % 1000000);
        defpackage.pa1 pa1Var = defpackage.jt.WDYagTQQm9ns;
        return defpackage.jt.giKS3J6vZuNy(defpackage.vx1.zJPqDeoF0Os1(j5, mtVar2), defpackage.vx1.zJPqDeoF0Os1(j6, mtVar));
    }

    public static final void GE9mJIPrb8gP(defpackage.fn0 fn0Var, int i) {
        if (fn0Var.giKS3J6vZuNy == 0 || !(fn0Var.giKS3J6vZuNy(0) == i || fn0Var.giKS3J6vZuNy(fn0Var.giKS3J6vZuNy - 1) == i)) {
            int i2 = fn0Var.giKS3J6vZuNy;
            fn0Var.ZpBGe2uQfcn8(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int giKS3J6vZuNy = fn0Var.giKS3J6vZuNy(i3);
                if (i <= giKS3J6vZuNy) {
                    break;
                }
                fn0Var.WDYagTQQm9ns(i2, giKS3J6vZuNy);
                i2 = i3;
            }
            fn0Var.WDYagTQQm9ns(i2, i);
        }
    }

    public static final void GcLuU6pT9wO9(defpackage.dv0 dv0Var, int i, java.lang.Object obj, int i2, java.lang.Object obj2) {
        int i3 = dv0Var.P05cfTpS5W5L - dv0Var.fWTAfUmVKrZq[dv0Var.JhCgjQRTAOCT - 1].giKS3J6vZuNy;
        java.lang.Object[] objArr = dv0Var.QiMR8OkAhezm;
        objArr[i + i3] = obj;
        objArr[i3 + i2] = obj2;
    }

    public static final long IBvW5fLsPuHy(defpackage.h70 h70Var, defpackage.fv0 fv0Var, defpackage.g70 g70Var) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        if (fv0Var == null) {
            return h70Var.fWTAfUmVKrZq;
        }
        int i = g70Var.ZpBGe2uQfcn8;
        if (i == 1) {
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (h70Var.fWTAfUmVKrZq >> 32));
        } else {
            if (i != 2) {
                return h70Var.fWTAfUmVKrZq;
            }
            intBitsToFloat = java.lang.Float.intBitsToFloat((int) (h70Var.fWTAfUmVKrZq & 4294967295L));
        }
        if (fv0Var == defpackage.fv0.oh71FJcDz6S2) {
            long floatToRawIntBits2 = java.lang.Float.floatToRawIntBits(intBitsToFloat);
            floatToRawIntBits = java.lang.Float.floatToRawIntBits(0.0f);
            j = floatToRawIntBits2 << 32;
        } else {
            long floatToRawIntBits3 = java.lang.Float.floatToRawIntBits(0.0f);
            floatToRawIntBits = java.lang.Float.floatToRawIntBits(intBitsToFloat);
            j = floatToRawIntBits3 << 32;
        }
        return j | (4294967295L & floatToRawIntBits);
    }

    public static java.lang.String IJ0hOnjhPOri(android.content.Context context, android.content.ComponentName componentName) {
        java.lang.String string;
        android.content.pm.ActivityInfo activityInfo = context.getPackageManager().getActivityInfo(componentName, android.os.Build.VERSION.SDK_INT >= 29 ? 269222528 : 787072);
        java.lang.String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        android.os.Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) != '.') {
            return string;
        }
        return context.getPackageName() + string;
    }

    public static final void JhCgjQRTAOCT(java.lang.String str, defpackage.vl0 vl0Var, defpackage.e30 e30Var, int i) {
        defpackage.vl0 vl0Var2;
        str.getClass();
        e30Var.PS16moFv2oLu(-201289124);
        int i2 = i | (e30Var.oh71FJcDz6S2(str) ? 4 : 2) | 48;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            defpackage.pn1 pn1Var = ((defpackage.gr1) e30Var.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8)).P05cfTpS5W5L;
            vl0Var2 = defpackage.sl0.ZpBGe2uQfcn8;
            defpackage.ym1.giKS3J6vZuNy(str, vl0Var2, ((defpackage.uf) e30Var.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8, 0L, 0L, null, 0L, 0, false, 0, 0, pn1Var, e30Var, i2 & 126, 0, 131064);
        } else {
            e30Var.Jkfc0NcwyPL8();
            vl0Var2 = vl0Var;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.zu(str, vl0Var2, i, 1);
        }
    }

    public static final long KrtOTfE6jiS2(defpackage.h70 h70Var, defpackage.fv0 fv0Var, defpackage.g70 g70Var, boolean z) {
        float intBitsToFloat;
        long floatToRawIntBits;
        long j;
        long j2 = h70Var.QiMR8OkAhezm;
        if (fv0Var != null) {
            int i = g70Var.ZpBGe2uQfcn8;
            if (i == 1) {
                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 >> 32));
            } else if (i == 2) {
                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L));
            }
            if (fv0Var == defpackage.fv0.oh71FJcDz6S2) {
                long floatToRawIntBits2 = java.lang.Float.floatToRawIntBits(intBitsToFloat);
                floatToRawIntBits = java.lang.Float.floatToRawIntBits(0.0f);
                j = floatToRawIntBits2 << 32;
            } else {
                long floatToRawIntBits3 = java.lang.Float.floatToRawIntBits(0.0f);
                floatToRawIntBits = java.lang.Float.floatToRawIntBits(intBitsToFloat);
                j = floatToRawIntBits3 << 32;
            }
            j2 = j | (floatToRawIntBits & 4294967295L);
        }
        long JhCgjQRTAOCT = defpackage.ws0.JhCgjQRTAOCT(IBvW5fLsPuHy(h70Var, fv0Var, g70Var), j2);
        if (z || !h70Var.e6mdH7fiFuta) {
            return JhCgjQRTAOCT;
        }
        return 0L;
    }

    public static final boolean Mearx7yMn90V(defpackage.em1 em1Var, boolean z) {
        defpackage.rc0 fWTAfUmVKrZq;
        defpackage.hg0 hg0Var = em1Var.JhCgjQRTAOCT;
        if (hg0Var == null || (fWTAfUmVKrZq = hg0Var.fWTAfUmVKrZq()) == null) {
            return false;
        }
        defpackage.s31 NkfcFfdaVTox = defpackage.t80.NkfcFfdaVTox(fWTAfUmVKrZq);
        long fNwYGHIYeJcR = em1Var.fNwYGHIYeJcR(z);
        float f = NkfcFfdaVTox.ZpBGe2uQfcn8;
        float f2 = NkfcFfdaVTox.fWTAfUmVKrZq;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (fNwYGHIYeJcR >> 32));
        if (f > intBitsToFloat || intBitsToFloat > f2) {
            return false;
        }
        float f3 = NkfcFfdaVTox.giKS3J6vZuNy;
        float f4 = NkfcFfdaVTox.JhCgjQRTAOCT;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (fNwYGHIYeJcR & 4294967295L));
        return f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4;
    }

    public static final boolean Ns0WNyEWdPsk(defpackage.h70 h70Var) {
        return !h70Var.P05cfTpS5W5L && h70Var.JhCgjQRTAOCT;
    }

    public static defpackage.kl OcTWLQzke1i2(defpackage.kl klVar) {
        klVar.getClass();
        defpackage.ll llVar = klVar instanceof defpackage.ll ? (defpackage.ll) klVar : null;
        if (llVar == null || (klVar = llVar.QiMR8OkAhezm) != null) {
            return klVar;
        }
        defpackage.lm lmVar = (defpackage.lm) llVar.oh71FJcDz6S2().XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.OcTWLQzke1i2);
        defpackage.kl oqVar = lmVar != null ? new defpackage.oq(lmVar, llVar) : llVar;
        llVar.QiMR8OkAhezm = oqVar;
        return oqVar;
    }

    public static final boolean P05cfTpS5W5L(defpackage.h70 h70Var) {
        return h70Var.P05cfTpS5W5L && !h70Var.JhCgjQRTAOCT;
    }

    public static final void QiMR8OkAhezm(defpackage.ci1 ci1Var, defpackage.h70 h70Var, defpackage.fv0 fv0Var, defpackage.g70 g70Var, defpackage.wg wgVar, long j) {
        float intBitsToFloat;
        defpackage.sn0 sn0Var = (defpackage.sn0) wgVar.giKS3J6vZuNy;
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (h70Var.fWTAfUmVKrZq >> 32));
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (h70Var.fWTAfUmVKrZq & 4294967295L));
        if (Ns0WNyEWdPsk(h70Var)) {
            wgVar.ZpBGe2uQfcn8 = 0;
            sn0Var.JhCgjQRTAOCT();
        }
        if (!P05cfTpS5W5L(h70Var) && !Ns0WNyEWdPsk(h70Var)) {
            if (sn0Var.giKS3J6vZuNy == 3) {
                int i = wgVar.ZpBGe2uQfcn8;
                wgVar.ZpBGe2uQfcn8 = i + 1;
                sn0Var.gUjdnLbkVAaA(i, h70Var);
            } else {
                sn0Var.ZpBGe2uQfcn8(h70Var);
            }
            if (wgVar.ZpBGe2uQfcn8 == 3) {
                wgVar.ZpBGe2uQfcn8 = 0;
            }
            java.lang.Object[] objArr = sn0Var.ZpBGe2uQfcn8;
            int i2 = sn0Var.giKS3J6vZuNy;
            float f = 0.0f;
            for (int i3 = 0; i3 < i2; i3++) {
                f += java.lang.Float.intBitsToFloat((int) (((defpackage.h70) objArr[i3]).fWTAfUmVKrZq >> 32));
            }
            int i4 = sn0Var.giKS3J6vZuNy;
            intBitsToFloat2 = f / i4;
            java.lang.Object[] objArr2 = sn0Var.ZpBGe2uQfcn8;
            float f2 = 0.0f;
            for (int i5 = 0; i5 < i4; i5++) {
                f2 += java.lang.Float.intBitsToFloat((int) (((defpackage.h70) objArr2[i5]).fWTAfUmVKrZq & 4294967295L));
            }
            intBitsToFloat3 = f2 / sn0Var.giKS3J6vZuNy;
        }
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat2) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat3) & 4294967295L);
        if (fv0Var != null) {
            int i6 = g70Var.ZpBGe2uQfcn8;
            if (i6 == 1) {
                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
            } else if (i6 == 2) {
                intBitsToFloat = java.lang.Float.intBitsToFloat((int) (floatToRawIntBits & 4294967295L));
            }
            floatToRawIntBits = fv0Var == defpackage.fv0.oh71FJcDz6S2 ? (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L) : (java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) & 4294967295L);
        }
        ((defpackage.so) ci1Var.oh71FJcDz6S2).ZpBGe2uQfcn8(h70Var.giKS3J6vZuNy, defpackage.ws0.WDYagTQQm9ns(floatToRawIntBits, j));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static defpackage.kl T1fB7bDYiVJQ(defpackage.kl klVar, defpackage.kl klVar2, defpackage.c20 c20Var) {
        c20Var.getClass();
        if (c20Var instanceof defpackage.m9) {
            return ((defpackage.m9) c20Var).XntWc4eZSQ8j(klVar2, klVar);
        }
        defpackage.jm oh71FJcDz6S2 = klVar2.oh71FJcDz6S2();
        return oh71FJcDz6S2 == defpackage.xu.WDYagTQQm9ns ? new defpackage.na0(klVar2, klVar, c20Var) : new defpackage.oa0(klVar2, oh71FJcDz6S2, c20Var, klVar);
    }

    public static final boolean UmgHb6n58gfG(java.lang.Object obj) {
        return obj == defpackage.nq1.JhCgjQRTAOCT;
    }

    public static final defpackage.ka1 VFeft99leXEK(java.lang.Object obj) {
        if (obj != defpackage.nq1.JhCgjQRTAOCT) {
            return (defpackage.ka1) obj;
        }
        defpackage.h7.P05cfTpS5W5L("Does not contain segment");
        return null;
    }

    public static final void WDYagTQQm9ns(defpackage.vl0 vl0Var, defpackage.nh nhVar, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(-1854833411);
        int i2 = (e30Var.oh71FJcDz6S2(vl0Var) ? 4 : 2) | i;
        int i3 = 1;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = defpackage.d1.QiMR8OkAhezm;
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.vk0 vk0Var = (defpackage.vk0) GcLuU6pT9wO9;
            int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, vl0Var);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var, vk0Var);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var, fNwYGHIYeJcR);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var, java.lang.Integer.valueOf(hashCode));
            defpackage.t80.Mearx7yMn90V(e30Var, defpackage.vi.P05cfTpS5W5L);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju);
            nhVar.QiMR8OkAhezm(e30Var, 6);
            e30Var.XntWc4eZSQ8j(true);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.t81(vl0Var, nhVar, i, i3);
        }
    }

    public static java.lang.Object Wc0TdmRSwbbi(defpackage.c20 c20Var, java.lang.Object obj, defpackage.kl klVar) {
        c20Var.getClass();
        defpackage.jm oh71FJcDz6S2 = klVar.oh71FJcDz6S2();
        java.lang.Object pa0Var = oh71FJcDz6S2 == defpackage.xu.WDYagTQQm9ns ? new defpackage.pa0(klVar) : new defpackage.qa0(klVar, oh71FJcDz6S2);
        defpackage.nq1.IJ0hOnjhPOri(2, c20Var);
        return c20Var.QiMR8OkAhezm(obj, pa0Var);
    }

    public static defpackage.y00 ZVVdXbWmyCSK(defpackage.y00[] y00VarArr) {
        defpackage.y00 y00Var = null;
        int i = Integer.MAX_VALUE;
        for (defpackage.y00 y00Var2 : y00VarArr) {
            int abs = (java.lang.Math.abs(y00Var2.fWTAfUmVKrZq - 400) * 2) + (y00Var2.JhCgjQRTAOCT ? 1 : 0);
            if (y00Var == null || i > abs) {
                y00Var = y00Var2;
                i = abs;
            }
        }
        return y00Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0295, code lost:
    
        if (r48.QiMR8OkAhezm(true) != false) goto L173;
     */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0314 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0379  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ZpBGe2uQfcn8(final defpackage.vl0 vl0Var, defpackage.tf0 tf0Var, final defpackage.wv0 wv0Var, final defpackage.xn xnVar, final boolean z, final defpackage.l1 l1Var, final defpackage.KN4muQto0Nd5 kN4muQto0Nd5, final defpackage.m7 m7Var, defpackage.y10 y10Var, defpackage.e30 e30Var, final int i, final int i2) {
        int i3;
        int i4;
        defpackage.y10 y10Var2;
        defpackage.tf0 tf0Var2;
        int i5;
        boolean z2;
        boolean z3;
        boolean oh71FJcDz6S2;
        java.lang.Object nf0Var;
        defpackage.tf0 tf0Var3;
        boolean z4;
        defpackage.kf0 kf0Var;
        defpackage.vl0 vl0Var2;
        e30Var.PS16moFv2oLu(924924659);
        if ((i & 6) == 0) {
            i3 = (e30Var.oh71FJcDz6S2(vl0Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e30Var.oh71FJcDz6S2(tf0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= e30Var.oh71FJcDz6S2(wv0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= e30Var.QiMR8OkAhezm(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= e30Var.QiMR8OkAhezm(true) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= e30Var.oh71FJcDz6S2(xnVar) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= e30Var.QiMR8OkAhezm(z) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= e30Var.oh71FJcDz6S2(l1Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= e30Var.oh71FJcDz6S2(kN4muQto0Nd5) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (e30Var.oh71FJcDz6S2(m7Var) ? 4 : 2);
        } else {
            i4 = i2;
        }
        int i6 = i4 | 432;
        if ((i2 & 3072) == 0) {
            y10Var2 = y10Var;
            i6 |= e30Var.P05cfTpS5W5L(y10Var2) ? 2048 : 1024;
        } else {
            y10Var2 = y10Var;
        }
        if (e30Var.zJPqDeoF0Os1(i3 & 1, ((i3 & 306783379) == 306783378 && (i6 & 1171) == 1170) ? false : true)) {
            e30Var.CZa7MwI9IzLd();
            if ((i & 1) != 0 && !e30Var.oCu53ZX2v4Ju()) {
                e30Var.Jkfc0NcwyPL8();
            }
            int i7 = i3 & (-234881025);
            e30Var.WmetiUbpKU9I();
            int i8 = i7 >> 3;
            int i9 = i8 & 14;
            int i10 = i9 | ((i6 >> 6) & 112);
            defpackage.fo0 w6IV1lieBIux = defpackage.w60.w6IV1lieBIux(y10Var, e30Var);
            int i11 = 6;
            boolean z5 = (((i10 & 14) ^ 6) > 4 && e30Var.oh71FJcDz6S2(tf0Var)) || (i10 & 6) == 4;
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj = defpackage.cj.ZpBGe2uQfcn8;
            if (z5 || GcLuU6pT9wO9 == obj) {
                defpackage.de0 de0Var = new defpackage.de0();
                de0Var.ZpBGe2uQfcn8 = new defpackage.mw0(Integer.MAX_VALUE);
                de0Var.giKS3J6vZuNy = new defpackage.mw0(Integer.MAX_VALUE);
                defpackage.jVUAPb5NnIYW jvuapb5nniyw = defpackage.jVUAPb5NnIYW.GoIRkIe1iwj6;
                i5 = i9;
                defpackage.g4 g4Var = new defpackage.g4(w6IV1lieBIux, i11);
                defpackage.a7 a7Var = defpackage.af1.ZpBGe2uQfcn8;
                GcLuU6pT9wO9 = new defpackage.kf0(0, 0, defpackage.dg1.class, new defpackage.qp(new defpackage.v8(new defpackage.qp(g4Var, jvuapb5nniyw), tf0Var, de0Var, 4), jvuapb5nniyw), "value", "getValue()Ljava/lang/Object;");
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            } else {
                i5 = i9;
            }
            defpackage.kf0 kf0Var2 = (defpackage.kf0) GcLuU6pT9wO9;
            int i12 = i7 >> 9;
            int i13 = i5 | (i12 & 112);
            boolean z6 = ((((i13 & 112) ^ 48) > 32 && e30Var.QiMR8OkAhezm(true)) || (i13 & 48) == 32) | ((((i13 & 14) ^ 6) > 4 && e30Var.oh71FJcDz6S2(tf0Var)) || (i13 & 6) == 4);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (z6 || GcLuU6pT9wO92 == obj) {
                GcLuU6pT9wO92 = new defpackage.af0(tf0Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.af0 af0Var = (defpackage.af0) GcLuU6pT9wO92;
            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO93 == obj) {
                GcLuU6pT9wO93 = defpackage.nq1.dG7RjM6DqYVL(e30Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
            }
            defpackage.sm smVar = (defpackage.sm) GcLuU6pT9wO93;
            defpackage.a40 a40Var = (defpackage.a40) e30Var.GE9mJIPrb8gP(defpackage.rj.QiMR8OkAhezm);
            defpackage.l21 l21Var = !((java.lang.Boolean) e30Var.GE9mJIPrb8gP(defpackage.rj.IJ0hOnjhPOri)).booleanValue() ? defpackage.pg1.ZpBGe2uQfcn8 : null;
            int i14 = i6 << 18;
            int i15 = (i7 & 65520) | (i12 & 3670016) | (i14 & 29360128) | (i14 & 234881024) | ((i6 << 27) & 1879048192);
            boolean z7 = ((((i15 & 112) ^ 48) > 32 && e30Var.oh71FJcDz6S2(tf0Var)) || (i15 & 48) == 32) | ((((i15 & 896) ^ 384) > 256 && e30Var.oh71FJcDz6S2(wv0Var)) || (i15 & 384) == 256) | ((((i15 & 7168) ^ 3072) > 2048 && e30Var.QiMR8OkAhezm(false)) || (i15 & 3072) == 2048);
            if (((57344 & i15) ^ 24576) <= 16384) {
            }
            if ((i15 & 24576) != 16384) {
                z2 = false;
                boolean JhCgjQRTAOCT = z7 | z2 | e30Var.JhCgjQRTAOCT(0) | ((((i15 & 3670016) ^ 1572864) <= 1048576 && e30Var.oh71FJcDz6S2(kN4muQto0Nd5)) || (i15 & 1572864) == 1048576);
                if (((i15 & 29360128) ^ 12582912) > 8388608 && e30Var.oh71FJcDz6S2(null)) {
                    z3 = true;
                    oh71FJcDz6S2 = (((i15 & 234881024) ^ 100663296) <= 67108864 && e30Var.oh71FJcDz6S2(null)) | JhCgjQRTAOCT | z3 | ((((i15 & 1879048192) ^ 805306368) <= 536870912 && e30Var.oh71FJcDz6S2(m7Var)) || (i15 & 805306368) == 536870912) | e30Var.oh71FJcDz6S2(a40Var) | e30Var.oh71FJcDz6S2(l21Var);
                    java.lang.Object GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                    if (!oh71FJcDz6S2 || GcLuU6pT9wO94 == obj) {
                        tf0Var3 = tf0Var;
                        z4 = true;
                        nf0Var = new defpackage.nf0(tf0Var3, wv0Var, kf0Var2, m7Var, smVar, a40Var, l21Var, kN4muQto0Nd5);
                        kf0Var = kf0Var2;
                        e30Var.EgL5gQQnyJKX(nf0Var);
                    } else {
                        nf0Var = GcLuU6pT9wO94;
                        kf0Var = kf0Var2;
                        z4 = true;
                        tf0Var3 = tf0Var;
                    }
                    defpackage.nf0 nf0Var2 = (defpackage.nf0) nf0Var;
                    defpackage.fv0 fv0Var = defpackage.fv0.WDYagTQQm9ns;
                    if (z) {
                        e30Var.NkfcFfdaVTox(-2076718545);
                        e30Var.XntWc4eZSQ8j(false);
                        vl0Var2 = defpackage.sl0.ZpBGe2uQfcn8;
                    } else {
                        e30Var.NkfcFfdaVTox(-2077147368);
                        if ((((i8 & 14) ^ 6) <= 4 || !e30Var.oh71FJcDz6S2(tf0Var3)) && (i8 & 6) != 4) {
                            z4 = false;
                        }
                        boolean JhCgjQRTAOCT2 = z4 | e30Var.JhCgjQRTAOCT(0);
                        java.lang.Object GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
                        if (JhCgjQRTAOCT2 || GcLuU6pT9wO95 == obj) {
                            GcLuU6pT9wO95 = new defpackage.gf0(tf0Var3);
                            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO95);
                        }
                        vl0Var2 = defpackage.ma0.maCixPsq4ml2((defpackage.gf0) GcLuU6pT9wO95, tf0Var3.T1fB7bDYiVJQ, fv0Var);
                        e30Var.XntWc4eZSQ8j(false);
                    }
                    tf0Var2 = tf0Var3;
                    defpackage.w60.fWTAfUmVKrZq(kf0Var, defpackage.vx1.GcLuU6pT9wO9(defpackage.jr0.hH0RRJrNssvh(vl0Var.fWTAfUmVKrZq(tf0Var3.fNwYGHIYeJcR).fWTAfUmVKrZq(tf0Var3.h3m55N1URyyK), kf0Var, af0Var, fv0Var, z).fWTAfUmVKrZq(vl0Var2).fWTAfUmVKrZq(tf0Var3.gUjdnLbkVAaA.e6mdH7fiFuta), tf0Var3, fv0Var, l1Var, z, xnVar, tf0Var3.QiMR8OkAhezm), tf0Var2.XntWc4eZSQ8j, nf0Var2, e30Var, 0);
                }
                z3 = false;
                oh71FJcDz6S2 = (((i15 & 234881024) ^ 100663296) <= 67108864 && e30Var.oh71FJcDz6S2(null)) | JhCgjQRTAOCT | z3 | ((((i15 & 1879048192) ^ 805306368) <= 536870912 && e30Var.oh71FJcDz6S2(m7Var)) || (i15 & 805306368) == 536870912) | e30Var.oh71FJcDz6S2(a40Var) | e30Var.oh71FJcDz6S2(l21Var);
                java.lang.Object GcLuU6pT9wO942 = e30Var.GcLuU6pT9wO9();
                if (oh71FJcDz6S2) {
                }
                tf0Var3 = tf0Var;
                z4 = true;
                nf0Var = new defpackage.nf0(tf0Var3, wv0Var, kf0Var2, m7Var, smVar, a40Var, l21Var, kN4muQto0Nd5);
                kf0Var = kf0Var2;
                e30Var.EgL5gQQnyJKX(nf0Var);
                defpackage.nf0 nf0Var22 = (defpackage.nf0) nf0Var;
                defpackage.fv0 fv0Var2 = defpackage.fv0.WDYagTQQm9ns;
                if (z) {
                }
                tf0Var2 = tf0Var3;
                defpackage.w60.fWTAfUmVKrZq(kf0Var, defpackage.vx1.GcLuU6pT9wO9(defpackage.jr0.hH0RRJrNssvh(vl0Var.fWTAfUmVKrZq(tf0Var3.fNwYGHIYeJcR).fWTAfUmVKrZq(tf0Var3.h3m55N1URyyK), kf0Var, af0Var, fv0Var2, z).fWTAfUmVKrZq(vl0Var2).fWTAfUmVKrZq(tf0Var3.gUjdnLbkVAaA.e6mdH7fiFuta), tf0Var3, fv0Var2, l1Var, z, xnVar, tf0Var3.QiMR8OkAhezm), tf0Var2.XntWc4eZSQ8j, nf0Var22, e30Var, 0);
            }
            z2 = true;
            boolean JhCgjQRTAOCT3 = z7 | z2 | e30Var.JhCgjQRTAOCT(0) | ((((i15 & 3670016) ^ 1572864) <= 1048576 && e30Var.oh71FJcDz6S2(kN4muQto0Nd5)) || (i15 & 1572864) == 1048576);
            if (((i15 & 29360128) ^ 12582912) > 8388608) {
                z3 = true;
                oh71FJcDz6S2 = (((i15 & 234881024) ^ 100663296) <= 67108864 && e30Var.oh71FJcDz6S2(null)) | JhCgjQRTAOCT3 | z3 | ((((i15 & 1879048192) ^ 805306368) <= 536870912 && e30Var.oh71FJcDz6S2(m7Var)) || (i15 & 805306368) == 536870912) | e30Var.oh71FJcDz6S2(a40Var) | e30Var.oh71FJcDz6S2(l21Var);
                java.lang.Object GcLuU6pT9wO9422 = e30Var.GcLuU6pT9wO9();
                if (oh71FJcDz6S2) {
                }
                tf0Var3 = tf0Var;
                z4 = true;
                nf0Var = new defpackage.nf0(tf0Var3, wv0Var, kf0Var2, m7Var, smVar, a40Var, l21Var, kN4muQto0Nd5);
                kf0Var = kf0Var2;
                e30Var.EgL5gQQnyJKX(nf0Var);
                defpackage.nf0 nf0Var222 = (defpackage.nf0) nf0Var;
                defpackage.fv0 fv0Var22 = defpackage.fv0.WDYagTQQm9ns;
                if (z) {
                }
                tf0Var2 = tf0Var3;
                defpackage.w60.fWTAfUmVKrZq(kf0Var, defpackage.vx1.GcLuU6pT9wO9(defpackage.jr0.hH0RRJrNssvh(vl0Var.fWTAfUmVKrZq(tf0Var3.fNwYGHIYeJcR).fWTAfUmVKrZq(tf0Var3.h3m55N1URyyK), kf0Var, af0Var, fv0Var22, z).fWTAfUmVKrZq(vl0Var2).fWTAfUmVKrZq(tf0Var3.gUjdnLbkVAaA.e6mdH7fiFuta), tf0Var3, fv0Var22, l1Var, z, xnVar, tf0Var3.QiMR8OkAhezm), tf0Var2.XntWc4eZSQ8j, nf0Var222, e30Var, 0);
            }
            z3 = false;
            oh71FJcDz6S2 = (((i15 & 234881024) ^ 100663296) <= 67108864 && e30Var.oh71FJcDz6S2(null)) | JhCgjQRTAOCT3 | z3 | ((((i15 & 1879048192) ^ 805306368) <= 536870912 && e30Var.oh71FJcDz6S2(m7Var)) || (i15 & 805306368) == 536870912) | e30Var.oh71FJcDz6S2(a40Var) | e30Var.oh71FJcDz6S2(l21Var);
            java.lang.Object GcLuU6pT9wO94222 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S2) {
            }
            tf0Var3 = tf0Var;
            z4 = true;
            nf0Var = new defpackage.nf0(tf0Var3, wv0Var, kf0Var2, m7Var, smVar, a40Var, l21Var, kN4muQto0Nd5);
            kf0Var = kf0Var2;
            e30Var.EgL5gQQnyJKX(nf0Var);
            defpackage.nf0 nf0Var2222 = (defpackage.nf0) nf0Var;
            defpackage.fv0 fv0Var222 = defpackage.fv0.WDYagTQQm9ns;
            if (z) {
            }
            tf0Var2 = tf0Var3;
            defpackage.w60.fWTAfUmVKrZq(kf0Var, defpackage.vx1.GcLuU6pT9wO9(defpackage.jr0.hH0RRJrNssvh(vl0Var.fWTAfUmVKrZq(tf0Var3.fNwYGHIYeJcR).fWTAfUmVKrZq(tf0Var3.h3m55N1URyyK), kf0Var, af0Var, fv0Var222, z).fWTAfUmVKrZq(vl0Var2).fWTAfUmVKrZq(tf0Var3.gUjdnLbkVAaA.e6mdH7fiFuta), tf0Var3, fv0Var222, l1Var, z, xnVar, tf0Var3.QiMR8OkAhezm), tf0Var2.XntWc4eZSQ8j, nf0Var2222, e30Var, 0);
        } else {
            tf0Var2 = tf0Var;
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            final defpackage.tf0 tf0Var4 = tf0Var2;
            final defpackage.y10 y10Var3 = y10Var2;
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.c20() { // from class: lf0
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    defpackage.q70.ZpBGe2uQfcn8(defpackage.vl0.this, tf0Var4, wv0Var, xnVar, z, l1Var, kN4muQto0Nd5, m7Var, y10Var3, (defpackage.e30) obj2, defpackage.m90.IBvW5fLsPuHy(i | 1), defpackage.m90.IBvW5fLsPuHy(i2));
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final defpackage.rb0 blKFvluuDQOf(java.lang.Object obj, defpackage.rb0... rb0VarArr) {
        java.lang.Class[] clsArr;
        try {
            if (rb0VarArr.length == 0) {
                clsArr = new java.lang.Class[0];
            } else {
                int length = rb0VarArr.length;
                java.lang.Class[] clsArr2 = new java.lang.Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = defpackage.rb0.class;
                }
                clsArr = clsArr2;
            }
            java.lang.Object invoke = obj.getClass().getDeclaredMethod("serializer", (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, java.util.Arrays.copyOf(rb0VarArr, rb0VarArr.length));
            if (invoke instanceof defpackage.rb0) {
                return (defpackage.rb0) invoke;
            }
            return null;
        } catch (java.lang.NoSuchMethodException unused) {
            return null;
        } catch (java.lang.reflect.InvocationTargetException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            java.lang.String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new java.lang.reflect.InvocationTargetException(cause, message);
        }
    }

    public static final long dG7RjM6DqYVL(long j) {
        if (j < 0) {
            defpackage.pa1 pa1Var = defpackage.jt.WDYagTQQm9ns;
            return defpackage.jt.QiMR8OkAhezm;
        }
        defpackage.pa1 pa1Var2 = defpackage.jt.WDYagTQQm9ns;
        return defpackage.jt.oh71FJcDz6S2;
    }

    public static final defpackage.a7 e6mdH7fiFuta(java.util.regex.Matcher matcher, int i, java.lang.CharSequence charSequence) {
        if (matcher.find(i)) {
            return new defpackage.a7(matcher, charSequence);
        }
        return null;
    }

    public static void fNwYGHIYeJcR(defpackage.dc dcVar) {
        dcVar.e6mdH7fiFuta(null, false);
    }

    public static final void fWTAfUmVKrZq(java.lang.String str, defpackage.e30 e30Var, int i) {
        str.getClass();
        e30Var.PS16moFv2oLu(668245980);
        int i2 = i | (e30Var.oh71FJcDz6S2(str) ? 4 : 2);
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            defpackage.ym1.giKS3J6vZuNy(str, defpackage.nq1.OVwOqzUGHcCU(defpackage.sl0.ZpBGe2uQfcn8, 0.0f, 0.0f, 0.0f, 12.0f, 7), ((defpackage.uf) e30Var.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8)).ZpBGe2uQfcn8, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.gr1) e30Var.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8)).QiMR8OkAhezm, e30Var, (i2 & 14) | 48, 0, 131064);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.gh1(str, i);
        }
    }

    public static final defpackage.wk0 frSwwKIlbUhK(defpackage.s61 s61Var, int i, int i2, int i3, int i4, int i5, defpackage.xk0 xk0Var, java.util.List list, defpackage.ry0[] ry0VarArr, int i6, int i7, int[] iArr, int i8) {
        int i9;
        float f;
        long j;
        int i10;
        int i11;
        int i12;
        java.util.List list2 = list;
        long j2 = i5;
        int i13 = i7 - i6;
        int[] iArr2 = new int[i13];
        int i14 = i6;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        float f2 = 0.0f;
        while (i14 < i7) {
            defpackage.qk0 qk0Var = (defpackage.qk0) list2.get(i14);
            float ZVVdXbWmyCSK = defpackage.n70.ZVVdXbWmyCSK(defpackage.n70.s0TASMVLSWD5(qk0Var));
            if (ZVVdXbWmyCSK > 0.0f) {
                f2 += ZVVdXbWmyCSK;
                i16++;
                j = j2;
                i10 = i14;
            } else {
                int i19 = i3 - i17;
                defpackage.ry0 ry0Var = ry0VarArr[i14];
                j = j2;
                if (ry0Var == null) {
                    if (i3 == Integer.MAX_VALUE) {
                        i10 = i14;
                        i11 = i16;
                        i12 = Integer.MAX_VALUE;
                    } else {
                        i10 = i14;
                        i11 = i16;
                        i12 = i19 < 0 ? 0 : i19;
                    }
                    ry0Var = qk0Var.WDYagTQQm9ns(s61Var.JhCgjQRTAOCT(0, i12, i4, false));
                } else {
                    i10 = i14;
                    i11 = i16;
                }
                defpackage.ry0 ry0Var2 = ry0Var;
                int P05cfTpS5W5L = s61Var.P05cfTpS5W5L(ry0Var2);
                int WDYagTQQm9ns = s61Var.WDYagTQQm9ns(ry0Var2);
                iArr2[i10 - i6] = P05cfTpS5W5L;
                int i20 = i19 - P05cfTpS5W5L;
                if (i20 < 0) {
                    i20 = 0;
                }
                i18 = java.lang.Math.min(i5, i20);
                i17 += P05cfTpS5W5L + i18;
                i15 = java.lang.Math.max(i15, WDYagTQQm9ns);
                ry0VarArr[i10] = ry0Var2;
                i16 = i11;
            }
            i14 = i10 + 1;
            j2 = j;
        }
        long j3 = j2;
        if (i16 == 0) {
            i17 -= i18;
            i9 = 0;
        } else {
            long j4 = (r22 - 1) * j3;
            long j5 = ((i3 != Integer.MAX_VALUE ? i3 : i) - i17) - j4;
            if (j5 < 0) {
                j5 = 0;
            }
            float f3 = j5 / f2;
            for (int i21 = i6; i21 < i7; i21++) {
                j5 -= java.lang.Math.round(defpackage.n70.ZVVdXbWmyCSK(defpackage.n70.s0TASMVLSWD5((defpackage.qk0) list2.get(i21))) * f3);
            }
            int i22 = i6;
            int i23 = i15;
            int i24 = 0;
            while (i22 < i7) {
                if (ry0VarArr[i22] == null) {
                    defpackage.qk0 qk0Var2 = (defpackage.qk0) list2.get(i22);
                    f = f3;
                    defpackage.t61 s0TASMVLSWD5 = defpackage.n70.s0TASMVLSWD5(qk0Var2);
                    float ZVVdXbWmyCSK2 = defpackage.n70.ZVVdXbWmyCSK(s0TASMVLSWD5);
                    if (ZVVdXbWmyCSK2 <= 0.0f) {
                        defpackage.c80.giKS3J6vZuNy("All weights <= 0 should have placeables");
                    }
                    int signum = java.lang.Long.signum(j5);
                    long j6 = j5 - signum;
                    int max = java.lang.Math.max(0, java.lang.Math.round(ZVVdXbWmyCSK2 * f) + signum);
                    defpackage.ry0 WDYagTQQm9ns2 = qk0Var2.WDYagTQQm9ns(s61Var.JhCgjQRTAOCT((!(s0TASMVLSWD5 != null ? s0TASMVLSWD5.giKS3J6vZuNy : true) || max == Integer.MAX_VALUE) ? 0 : max, max, i4, true));
                    int P05cfTpS5W5L2 = s61Var.P05cfTpS5W5L(WDYagTQQm9ns2);
                    int WDYagTQQm9ns3 = s61Var.WDYagTQQm9ns(WDYagTQQm9ns2);
                    iArr2[i22 - i6] = P05cfTpS5W5L2;
                    i24 += P05cfTpS5W5L2;
                    int max2 = java.lang.Math.max(i23, WDYagTQQm9ns3);
                    ry0VarArr[i22] = WDYagTQQm9ns2;
                    i23 = max2;
                    j5 = j6;
                } else {
                    f = f3;
                }
                i22++;
                list2 = list;
                f3 = f;
            }
            i9 = (int) (i24 + j4);
            int i25 = i3 - i17;
            if (i9 < 0) {
                i9 = 0;
            }
            if (i9 > i25) {
                i9 = i25;
            }
            i15 = i23;
        }
        int i26 = i9 + i17;
        if (i26 < 0) {
            i26 = 0;
        }
        int max3 = java.lang.Math.max(i26, i);
        int max4 = java.lang.Math.max(i15, java.lang.Math.max(i2, 0));
        int[] iArr3 = new int[i13];
        s61Var.giKS3J6vZuNy(max3, xk0Var, iArr2, iArr3);
        return s61Var.GE9mJIPrb8gP(ry0VarArr, xk0Var, iArr3, max3, max4, iArr, i8, i6, i7);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:56|(1:(2:58|(1:111)(1:62))(2:113|114))|(5:106|107|(8:80|81|(1:(3:83|(1:101)(1:(1:89)(2:86|87))|88)(2:102|(1:104)))|90|(1:100)(1:94)|95|(1:97)|99)|68|(1:79)(4:70|(1:78)|76|77))|64|(1:66)|80|81|(2:(0)(0)|88)|90|(1:92)|100|95|(0)|99|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x00fe, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x00b9, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0181 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x016a A[Catch: NoSuchFieldException -> 0x0199, TryCatch #0 {NoSuchFieldException -> 0x0199, blocks: (B:81:0x015d, B:83:0x016a, B:92:0x0186, B:94:0x018c, B:95:0x0192, B:97:0x0196, B:88:0x017e), top: B:80:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0196 A[Catch: NoSuchFieldException -> 0x0199, TRY_LEAVE, TryCatch #0 {NoSuchFieldException -> 0x0199, blocks: (B:81:0x015d, B:83:0x016a, B:92:0x0186, B:94:0x018c, B:95:0x0192, B:97:0x0196, B:88:0x017e), top: B:80:0x015d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.rb0 gUjdnLbkVAaA(defpackage.ne neVar, defpackage.rb0... rb0VarArr) {
        java.lang.Object obj;
        defpackage.rb0 rb0Var;
        java.lang.reflect.Field field;
        java.lang.Object obj2;
        defpackage.rb0 rb0Var2;
        int length;
        int i;
        java.lang.Object obj3;
        java.lang.reflect.Field field2;
        defpackage.rb0 rb0Var3;
        defpackage.mc1 mc1Var;
        neVar.getClass();
        java.lang.Class cls = neVar.ZpBGe2uQfcn8;
        cls.getClass();
        defpackage.rb0[] rb0VarArr2 = (defpackage.rb0[]) java.util.Arrays.copyOf(rb0VarArr, rb0VarArr.length);
        if (cls.isEnum() && cls.getAnnotation(defpackage.mc1.class) == null && cls.getAnnotation(defpackage.j01.class) == null) {
            java.lang.Object[] enumConstants = cls.getEnumConstants();
            java.lang.String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new defpackage.uv(canonicalName, (java.lang.Enum[]) enumConstants);
        }
        defpackage.rb0[] rb0VarArr3 = (defpackage.rb0[]) java.util.Arrays.copyOf(rb0VarArr2, rb0VarArr2.length);
        defpackage.l01 l01Var = null;
        try {
            java.lang.reflect.Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (java.lang.Throwable unused) {
            obj = null;
        }
        defpackage.rb0 blKFvluuDQOf = obj == null ? null : blKFvluuDQOf(obj, (defpackage.rb0[]) java.util.Arrays.copyOf(rb0VarArr3, rb0VarArr3.length));
        if (blKFvluuDQOf != null) {
            return blKFvluuDQOf;
        }
        java.lang.String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 != null && !canonicalName2.startsWith("java.") && !canonicalName2.startsWith("kotlin.")) {
            java.lang.reflect.Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length2 = declaredFields.length;
            java.lang.reflect.Field field3 = null;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 < length2) {
                    java.lang.reflect.Field field4 = declaredFields[i2];
                    if (defpackage.ma0.QiMR8OkAhezm(field4.getName(), "INSTANCE") && defpackage.ma0.QiMR8OkAhezm(field4.getType(), cls) && java.lang.reflect.Modifier.isStatic(field4.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field3 = field4;
                    }
                    i2++;
                }
            }
            field3 = null;
            if (field3 != null) {
                java.lang.Object obj4 = field3.get(null);
                java.lang.reflect.Method[] methods = cls.getMethods();
                methods.getClass();
                int length3 = methods.length;
                java.lang.reflect.Method method = null;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    if (i3 < length3) {
                        java.lang.reflect.Method method2 = methods[i3];
                        if (defpackage.ma0.QiMR8OkAhezm(method2.getName(), "serializer")) {
                            java.lang.Class<?>[] parameterTypes = method2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && defpackage.ma0.QiMR8OkAhezm(method2.getReturnType(), defpackage.rb0.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i3++;
                    }
                }
                method = null;
                if (method != null) {
                    java.lang.Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof defpackage.rb0) {
                        rb0Var = (defpackage.rb0) invoke;
                        if (rb0Var == null) {
                            return rb0Var;
                        }
                        defpackage.rb0[] rb0VarArr4 = (defpackage.rb0[]) java.util.Arrays.copyOf(rb0VarArr2, rb0VarArr2.length);
                        java.lang.reflect.Field[] declaredFields2 = cls.getDeclaredFields();
                        declaredFields2.getClass();
                        int length4 = declaredFields2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length4) {
                                field = null;
                                break;
                            }
                            field = declaredFields2[i4];
                            if (java.lang.reflect.Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(defpackage.uo0.class) != null) {
                                break;
                            }
                            i4++;
                        }
                        if (field != null) {
                            try {
                                field.setAccessible(true);
                                obj2 = field.get(null);
                            } catch (java.lang.Throwable unused2) {
                            }
                            if (obj2 != null || (rb0Var2 = blKFvluuDQOf(obj2, (defpackage.rb0[]) java.util.Arrays.copyOf(rb0VarArr4, rb0VarArr4.length))) == null) {
                                java.lang.Class<?>[] declaredClasses = cls.getDeclaredClasses();
                                declaredClasses.getClass();
                                length = declaredClasses.length;
                                java.lang.Class<?> cls2 = null;
                                i = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i >= length) {
                                        java.lang.Class<?> cls3 = declaredClasses[i];
                                        if (cls3.getSimpleName().equals("$serializer")) {
                                            if (z3) {
                                                break;
                                            }
                                            z3 = true;
                                            cls2 = cls3;
                                        }
                                        i++;
                                    } else if (!z3) {
                                    }
                                }
                                cls2 = null;
                                obj3 = (cls2 != null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                                if (obj3 instanceof defpackage.rb0) {
                                    rb0Var2 = (defpackage.rb0) obj3;
                                }
                                rb0Var2 = null;
                            }
                            rb0Var3 = rb0Var2;
                            if (rb0Var3 == null) {
                                return rb0Var3;
                            }
                            if (cls.getAnnotation(defpackage.j01.class) != null || ((mc1Var = (defpackage.mc1) cls.getAnnotation(defpackage.mc1.class)) != null && defpackage.b41.ZpBGe2uQfcn8(mc1Var.with()).equals(defpackage.b41.ZpBGe2uQfcn8(defpackage.l01.class)))) {
                                l01Var = new defpackage.l01(defpackage.b41.ZpBGe2uQfcn8(cls));
                            }
                            return l01Var;
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        java.lang.Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                        declaredClasses2.getClass();
                        length = declaredClasses2.length;
                        java.lang.Class<?> cls22 = null;
                        i = 0;
                        boolean z32 = false;
                        while (true) {
                            if (i >= length) {
                            }
                            i++;
                        }
                        cls22 = null;
                        if (cls22 != null) {
                        }
                        if (obj3 instanceof defpackage.rb0) {
                        }
                        rb0Var2 = null;
                        rb0Var3 = rb0Var2;
                        if (rb0Var3 == null) {
                        }
                    }
                }
            }
        }
        rb0Var = null;
        if (rb0Var == null) {
        }
    }

    public static final void giKS3J6vZuNy(boolean z, defpackage.c20 c20Var, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(1818896922);
        int i2 = (e30Var.QiMR8OkAhezm(z) ? 4 : 2) | i | (e30Var.P05cfTpS5W5L(c20Var) ? 32 : 16);
        if ((i2 & 19) == 18 && e30Var.OcTWLQzke1i2()) {
            e30Var.Jkfc0NcwyPL8();
        } else {
            defpackage.n70.fWTAfUmVKrZq(z, c20Var, e30Var, i2 & 126);
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.pl(z, c20Var, i);
        }
    }

    public static final defpackage.ak1 h3m55N1URyyK(defpackage.wo woVar) {
        defpackage.lk1 lk1Var;
        defpackage.yj1 yj1Var = new defpackage.yj1();
        defpackage.t80.Jkfc0NcwyPL8(woVar, defpackage.ck1.ZpBGe2uQfcn8, new defpackage.wd1(new defpackage.wd1(5, yj1Var), new defpackage.WDYagTQQm9ns(1, yj1Var, defpackage.yj1.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 0, 12)));
        defpackage.sn0 sn0Var = new defpackage.sn0();
        defpackage.sn0 sn0Var2 = yj1Var.ZpBGe2uQfcn8;
        java.lang.Object[] objArr = sn0Var2.ZpBGe2uQfcn8;
        int i = sn0Var2.giKS3J6vZuNy;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        defpackage.zj1 zj1Var = null;
        while (true) {
            lk1Var = defpackage.lk1.giKS3J6vZuNy;
            if (i3 >= i) {
                break;
            }
            defpackage.zj1 zj1Var2 = (defpackage.zj1) objArr[i3];
            if (!z || zj1Var2 != lk1Var) {
                if (zj1Var2 != lk1Var || zj1Var != lk1Var) {
                    if (zj1Var2 != lk1Var) {
                        defpackage.sn0 sn0Var3 = yj1Var.giKS3J6vZuNy;
                        java.lang.Object[] objArr2 = sn0Var3.ZpBGe2uQfcn8;
                        int i4 = sn0Var3.giKS3J6vZuNy;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (((java.lang.Boolean) ((defpackage.y10) objArr2[i5]).P05cfTpS5W5L(zj1Var2)).booleanValue()) {
                            }
                        }
                    }
                    sn0Var.ZpBGe2uQfcn8(zj1Var2);
                    z = false;
                    zj1Var = zj1Var2;
                }
                z = false;
                break;
            }
            i3++;
        }
        if (((defpackage.zj1) (sn0Var.P05cfTpS5W5L() ? null : sn0Var.ZpBGe2uQfcn8[sn0Var.giKS3J6vZuNy - 1])) == lk1Var) {
            sn0Var.Ns0WNyEWdPsk(sn0Var.giKS3J6vZuNy - 1);
        }
        defpackage.qn0 qn0Var = sn0Var.fWTAfUmVKrZq;
        if (qn0Var == null) {
            qn0Var = new defpackage.qn0(i2, sn0Var);
            sn0Var.fWTAfUmVKrZq = qn0Var;
        }
        return new defpackage.ak1(qn0Var);
    }

    public static final void hH0RRJrNssvh(defpackage.dv0 dv0Var, int i, java.lang.Object obj) {
        dv0Var.QiMR8OkAhezm[(dv0Var.P05cfTpS5W5L - dv0Var.fWTAfUmVKrZq[dv0Var.JhCgjQRTAOCT - 1].giKS3J6vZuNy) + i] = obj;
    }

    public static final boolean jjTN4uUnoyEn(defpackage.jd0 jd0Var) {
        if (jd0Var.fNwYGHIYeJcR == null) {
            return false;
        }
        defpackage.jd0 w7APNrr0aGRc = jd0Var.w7APNrr0aGRc();
        return (w7APNrr0aGRc != null ? w7APNrr0aGRc.fNwYGHIYeJcR : null) == null || jd0Var.BXaznwstz2U0.giKS3J6vZuNy;
    }

    public static android.content.Intent maCixPsq4ml2(android.content.Context context, android.content.ComponentName componentName) {
        java.lang.String IJ0hOnjhPOri = IJ0hOnjhPOri(context, componentName);
        if (IJ0hOnjhPOri == null) {
            return null;
        }
        android.content.ComponentName componentName2 = new android.content.ComponentName(componentName.getPackageName(), IJ0hOnjhPOri);
        return IJ0hOnjhPOri(context, componentName2) == null ? android.content.Intent.makeMainActivity(componentName2) : new android.content.Intent().setComponent(componentName2);
    }

    public static int oCu53ZX2v4Ju(int i) {
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 4) {
            return 2;
        }
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 4;
        }
        if (i == 32) {
            return 5;
        }
        if (i == 64) {
            return 6;
        }
        if (i == 128) {
            return 7;
        }
        if (i == 256) {
            return 8;
        }
        if (i == 512) {
            return 9;
        }
        defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("type needs to be >= FIRST and <= LAST, type=", i));
        return 0;
    }

    public static final long oh71FJcDz6S2(float f, float f2) {
        return (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
    }

    public static final boolean qjMheFZ0l9kA(defpackage.ne neVar) {
        neVar.getClass();
        java.lang.Class ZpBGe2uQfcn8 = neVar.ZpBGe2uQfcn8();
        ZpBGe2uQfcn8.getClass();
        return ZpBGe2uQfcn8.isInterface();
    }

    public static final java.lang.String w6IV1lieBIux(int i, java.lang.Object[] objArr, defpackage.e30 e30Var) {
        return ((android.content.res.Resources) e30Var.GE9mJIPrb8gP(defpackage.j0.fWTAfUmVKrZq)).getString(i, java.util.Arrays.copyOf(objArr, objArr.length));
    }

    public static final int w7APNrr0aGRc(android.view.KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final java.lang.String xahdJg25P1Bv(int i, defpackage.e30 e30Var) {
        return ((android.content.res.Resources) e30Var.GE9mJIPrb8gP(defpackage.j0.fWTAfUmVKrZq)).getString(i);
    }

    public static final int zJPqDeoF0Os1(defpackage.fn0 fn0Var) {
        int giKS3J6vZuNy;
        int i = fn0Var.giKS3J6vZuNy;
        int giKS3J6vZuNy2 = fn0Var.giKS3J6vZuNy(0);
        while (fn0Var.giKS3J6vZuNy != 0 && fn0Var.giKS3J6vZuNy(0) == giKS3J6vZuNy2) {
            fn0Var.WDYagTQQm9ns(0, fn0Var.fWTAfUmVKrZq());
            fn0Var.JhCgjQRTAOCT(fn0Var.giKS3J6vZuNy - 1);
            int i2 = fn0Var.giKS3J6vZuNy;
            int i3 = i2 >>> 1;
            int i4 = 0;
            while (i4 < i3) {
                int giKS3J6vZuNy3 = fn0Var.giKS3J6vZuNy(i4);
                int i5 = (i4 + 1) * 2;
                int i6 = i5 - 1;
                int giKS3J6vZuNy4 = fn0Var.giKS3J6vZuNy(i6);
                if (i5 >= i2 || (giKS3J6vZuNy = fn0Var.giKS3J6vZuNy(i5)) <= giKS3J6vZuNy4) {
                    if (giKS3J6vZuNy4 > giKS3J6vZuNy3) {
                        fn0Var.WDYagTQQm9ns(i4, giKS3J6vZuNy4);
                        fn0Var.WDYagTQQm9ns(i6, giKS3J6vZuNy3);
                        i4 = i6;
                    }
                } else if (giKS3J6vZuNy > giKS3J6vZuNy3) {
                    fn0Var.WDYagTQQm9ns(i4, giKS3J6vZuNy);
                    fn0Var.WDYagTQQm9ns(i5, giKS3J6vZuNy3);
                    i4 = i5;
                }
            }
        }
        return giKS3J6vZuNy2;
    }

    public android.graphics.Typeface BHfvd2J71qpO(android.content.Context context, android.content.res.Resources resources, java.lang.String str) {
        java.io.File IJ0hOnjhPOri = defpackage.v70.IJ0hOnjhPOri(context);
        if (IJ0hOnjhPOri == null) {
            return null;
        }
        try {
            if (defpackage.v70.gUjdnLbkVAaA(IJ0hOnjhPOri, resources, com.ice.fishing.wolberta.R.font.grandstander)) {
                return android.graphics.Typeface.createFromFile(IJ0hOnjhPOri.getPath());
            }
            return null;
        } catch (java.lang.RuntimeException unused) {
            return null;
        } finally {
            IJ0hOnjhPOri.delete();
        }
    }

    public abstract android.graphics.Typeface WmetiUbpKU9I(android.content.Context context, defpackage.y00[] y00VarArr);

    public abstract android.graphics.Typeface XntWc4eZSQ8j(android.content.Context context, defpackage.m00 m00Var, android.content.res.Resources resources);

    public android.graphics.Typeface s0TASMVLSWD5(android.content.Context context, java.util.List list) {
        throw new java.lang.IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
    }
}
