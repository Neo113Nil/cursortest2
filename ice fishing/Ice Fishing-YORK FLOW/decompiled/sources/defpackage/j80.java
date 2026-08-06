package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class j80 implements defpackage.bu1 {
    public static final float giKS3J6vZuNy = 24.0f;
    public final /* synthetic */ int ZpBGe2uQfcn8;

    public /* synthetic */ j80(int i) {
        this.ZpBGe2uQfcn8 = i;
    }

    public static final void BHfvd2J71qpO(defpackage.sp0 sp0Var, defpackage.ne neVar, defpackage.nh nhVar) {
        defpackage.zq0 zq0Var = sp0Var.QiMR8OkAhezm;
        zq0Var.getClass();
        sp0Var.e6mdH7fiFuta.add(new defpackage.hi((defpackage.gi) zq0Var.giKS3J6vZuNy(defpackage.t80.maCixPsq4ml2(defpackage.gi.class)), neVar, nhVar).ZpBGe2uQfcn8());
    }

    public static final void BXaznwstz2U0(android.text.Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new android.text.style.ForegroundColorSpan(defpackage.ok0.PS16moFv2oLu(j)), i, i2, 33);
        }
    }

    public static final boolean GE9mJIPrb8gP(defpackage.c01 c01Var) {
        return !c01Var.P05cfTpS5W5L && c01Var.JhCgjQRTAOCT;
    }

    public static final void GcLuU6pT9wO9(android.text.Spannable spannable, defpackage.oi0 oi0Var, int i, int i2) {
        if (oi0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(oi0Var, 10));
            java.util.Iterator it = oi0Var.WDYagTQQm9ns.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.ni0) it.next()).ZpBGe2uQfcn8);
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            spannable.setSpan(new android.text.style.LocaleSpan(new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final float IBvW5fLsPuHy(long j, float f, defpackage.hp hpVar) {
        float fWTAfUmVKrZq;
        long giKS3J6vZuNy2 = defpackage.tn1.giKS3J6vZuNy(j);
        if (defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy2, 4294967296L)) {
            if (hpVar.h3m55N1URyyK() <= 1.05d) {
                return hpVar.omM9cAlgeGXx(j);
            }
            fWTAfUmVKrZq = defpackage.tn1.fWTAfUmVKrZq(j) / defpackage.tn1.fWTAfUmVKrZq(hpVar.ULjnV488Y6RO(f));
        } else {
            if (!defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy2, 8589934592L)) {
                return Float.NaN;
            }
            fWTAfUmVKrZq = defpackage.tn1.fWTAfUmVKrZq(j);
        }
        return fWTAfUmVKrZq * f;
    }

    public static final int IJ0hOnjhPOri(defpackage.a71 a71Var, java.lang.String str) {
        a71Var.getClass();
        int s0TASMVLSWD5 = s0TASMVLSWD5(a71Var, str);
        if (s0TASMVLSWD5 >= 0) {
            return s0TASMVLSWD5;
        }
        int columnCount = a71Var.getColumnCount();
        java.util.ArrayList arrayList = new java.util.ArrayList(columnCount);
        for (int i = 0; i < columnCount; i++) {
            arrayList.add(a71Var.getColumnName(i));
        }
        throw new java.lang.IllegalArgumentException("Column '" + str + "' does not exist. Available columns: [" + defpackage.hf.m6iZQUu7XjoL(arrayList, null, null, null, null, 63) + ']');
    }

    public static final long JhCgjQRTAOCT(int i, int i2) {
        if (i < 0 || i2 < 0) {
            defpackage.f80.ZpBGe2uQfcn8("start and end cannot be negative. [start: " + i + ", end: " + i2 + ']');
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = defpackage.in1.fWTAfUmVKrZq;
        return j;
    }

    public static final void KrtOTfE6jiS2(defpackage.yn0 yn0Var, java.lang.Object obj) {
        boolean z;
        long[] jArr = yn0Var.ZpBGe2uQfcn8;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        java.lang.Object obj2 = yn0Var.giKS3J6vZuNy[i4];
                        java.lang.Object obj3 = yn0Var.fWTAfUmVKrZq[i4];
                        if (obj3 instanceof defpackage.zn0) {
                            defpackage.zn0 zn0Var = (defpackage.zn0) obj3;
                            zn0Var.fNwYGHIYeJcR(obj);
                            z = zn0Var.QiMR8OkAhezm();
                        } else {
                            z = obj3 == obj;
                        }
                        if (z) {
                            yn0Var.fNwYGHIYeJcR(i4);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public static final long Mearx7yMn90V(defpackage.c01 c01Var, boolean z) {
        long JhCgjQRTAOCT = defpackage.ws0.JhCgjQRTAOCT(c01Var.fWTAfUmVKrZq, c01Var.QiMR8OkAhezm);
        if (z || !c01Var.giKS3J6vZuNy()) {
            return JhCgjQRTAOCT;
        }
        return 0L;
    }

    public static final boolean Ns0WNyEWdPsk(defpackage.c01 c01Var) {
        return (c01Var.giKS3J6vZuNy() || !c01Var.P05cfTpS5W5L || c01Var.JhCgjQRTAOCT) ? false : true;
    }

    public static defpackage.p90 OVwOqzUGHcCU(int i, int i2) {
        if (i2 > Integer.MIN_VALUE) {
            return new defpackage.p90(i, i2 - 1, 1);
        }
        defpackage.p90 p90Var = defpackage.p90.P05cfTpS5W5L;
        return defpackage.p90.P05cfTpS5W5L;
    }

    public static defpackage.gr1 OcTWLQzke1i2(defpackage.e30 e30Var) {
        return (defpackage.gr1) e30Var.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8);
    }

    public static final void P05cfTpS5W5L(defpackage.iu1 iu1Var, defpackage.n80 n80Var, defpackage.zg0 zg0Var) {
        n80Var.getClass();
        zg0Var.getClass();
        defpackage.t71 t71Var = (defpackage.t71) iu1Var.fWTAfUmVKrZq("androidx.lifecycle.savedstate.vm.tag");
        if (t71Var == null || t71Var.QiMR8OkAhezm) {
            return;
        }
        t71Var.Ns0WNyEWdPsk(n80Var, zg0Var);
        defpackage.pg0 pg0Var = zg0Var.P05cfTpS5W5L;
        if (pg0Var == defpackage.pg0.oh71FJcDz6S2 || pg0Var.compareTo(defpackage.pg0.P05cfTpS5W5L) >= 0) {
            n80Var.UmgHb6n58gfG();
        } else {
            zg0Var.ZpBGe2uQfcn8(new defpackage.io(n80Var, zg0Var));
        }
    }

    public static float QiMR8OkAhezm(float[] fArr) {
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

    public static int T1fB7bDYiVJQ(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static boolean UmgHb6n58gfG(int i) {
        int type = java.lang.Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final defpackage.q4 VFeft99leXEK(defpackage.jm jmVar) {
        defpackage.q4 q4Var = (defpackage.q4) jmVar.XntWc4eZSQ8j(defpackage.jVUAPb5NnIYW.Fu5WBEia9jBo);
        if (q4Var != null) {
            return q4Var;
        }
        defpackage.h7.P05cfTpS5W5L("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
        return null;
    }

    public static final long WDYagTQQm9ns(float f, float f2) {
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(f2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(f) << 32);
        int i = defpackage.zo1.fWTAfUmVKrZq;
        return floatToRawIntBits;
    }

    public static final double Wc0TdmRSwbbi(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final long WmetiUbpKU9I(int i, long j) {
        int i2 = defpackage.in1.fWTAfUmVKrZq;
        int i3 = (int) (j >> 32);
        int i4 = i3 < 0 ? 0 : i3;
        if (i4 > i) {
            i4 = i;
        }
        int i5 = (int) (4294967295L & j);
        int i6 = i5 >= 0 ? i5 : 0;
        if (i6 <= i) {
            i = i6;
        }
        return (i4 == i3 && i == i5) ? j : JhCgjQRTAOCT(i4, i);
    }

    public static long XntWc4eZSQ8j(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static defpackage.yn0 ZVVdXbWmyCSK() {
        long[] jArr = defpackage.m81.ZpBGe2uQfcn8;
        return new defpackage.yn0();
    }

    public static final void ZpBGe2uQfcn8(final defpackage.vl0 vl0Var, defpackage.tf0 tf0Var, defpackage.wv0 wv0Var, final defpackage.m7 m7Var, defpackage.KN4muQto0Nd5 kN4muQto0Nd5, defpackage.xn xnVar, boolean z, defpackage.l1 l1Var, final defpackage.y10 y10Var, defpackage.e30 e30Var, final int i) {
        defpackage.vl0 vl0Var2;
        int i2;
        final defpackage.tf0 tf0Var2;
        final defpackage.wv0 wv0Var2;
        final defpackage.KN4muQto0Nd5 kN4muQto0Nd52;
        final defpackage.xn xnVar2;
        final boolean z2;
        final defpackage.l1 l1Var2;
        java.lang.Object l1Var3;
        defpackage.wv0 wv0Var3;
        defpackage.l1 l1Var4;
        defpackage.xn xnVar3;
        defpackage.l1 l1Var5;
        boolean z3;
        int i3;
        defpackage.tf0 tf0Var3;
        defpackage.wv0 wv0Var4;
        e30Var.PS16moFv2oLu(53695811);
        if ((i & 6) == 0) {
            vl0Var2 = vl0Var;
            i2 = i | (e30Var.oh71FJcDz6S2(vl0Var2) ? 4 : 2);
        } else {
            vl0Var2 = vl0Var;
            i2 = i;
        }
        int i4 = i2 | 46861712 | (e30Var.P05cfTpS5W5L(y10Var) ? 536870912 : 268435456);
        if (e30Var.zJPqDeoF0Os1(i4 & 1, (306783379 & i4) != 306783378)) {
            e30Var.CZa7MwI9IzLd();
            if ((i & 1) == 0 || e30Var.oCu53ZX2v4Ju()) {
                defpackage.of0 of0Var = defpackage.vf0.ZpBGe2uQfcn8;
                java.lang.Object[] objArr = new java.lang.Object[0];
                defpackage.n80 n80Var = defpackage.tf0.VFeft99leXEK;
                boolean JhCgjQRTAOCT = e30Var.JhCgjQRTAOCT(0) | e30Var.JhCgjQRTAOCT(0);
                java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                java.lang.Object obj = defpackage.cj.ZpBGe2uQfcn8;
                if (JhCgjQRTAOCT || GcLuU6pT9wO9 == obj) {
                    GcLuU6pT9wO9 = new defpackage.n8(25);
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
                }
                defpackage.tf0 tf0Var4 = (defpackage.tf0) defpackage.v70.jjTN4uUnoyEn(objArr, n80Var, (defpackage.n10) GcLuU6pT9wO9, e30Var, 0);
                defpackage.wv0 wv0Var5 = new defpackage.wv0(0.0f, 0.0f, 0.0f, 0.0f);
                defpackage.ca caVar = defpackage.jVUAPb5NnIYW.s0TASMVLSWD5;
                float f = defpackage.tf1.ZpBGe2uQfcn8;
                defpackage.hp hpVar = (defpackage.hp) e30Var.GE9mJIPrb8gP(defpackage.rj.P05cfTpS5W5L);
                boolean fWTAfUmVKrZq = e30Var.fWTAfUmVKrZq(hpVar.giKS3J6vZuNy());
                java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                if (fWTAfUmVKrZq || GcLuU6pT9wO92 == obj) {
                    GcLuU6pT9wO92 = new defpackage.pn(new defpackage.k0(hpVar));
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
                }
                defpackage.pn pnVar = (defpackage.pn) GcLuU6pT9wO92;
                boolean oh71FJcDz6S2 = e30Var.oh71FJcDz6S2(pnVar);
                java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
                if (oh71FJcDz6S2 || GcLuU6pT9wO93 == obj) {
                    GcLuU6pT9wO93 = new defpackage.xn(pnVar);
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
                }
                defpackage.xn xnVar4 = (defpackage.xn) GcLuU6pT9wO93;
                defpackage.sj sjVar = defpackage.mv0.ZpBGe2uQfcn8;
                e30Var.NkfcFfdaVTox(282942128);
                defpackage.m1 m1Var = (defpackage.m1) e30Var.GE9mJIPrb8gP(defpackage.mv0.ZpBGe2uQfcn8);
                if (m1Var == null) {
                    e30Var.XntWc4eZSQ8j(false);
                    l1Var4 = null;
                    wv0Var3 = wv0Var5;
                } else {
                    boolean oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(m1Var);
                    java.lang.Object GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
                    if (oh71FJcDz6S22 || GcLuU6pT9wO94 == obj) {
                        wv0Var3 = wv0Var5;
                        l1Var3 = new defpackage.l1(m1Var.ZpBGe2uQfcn8, m1Var.giKS3J6vZuNy, m1Var.fWTAfUmVKrZq, m1Var.JhCgjQRTAOCT);
                        e30Var.EgL5gQQnyJKX(l1Var3);
                    } else {
                        wv0Var3 = wv0Var5;
                        l1Var3 = GcLuU6pT9wO94;
                    }
                    l1Var4 = (defpackage.l1) l1Var3;
                    e30Var.XntWc4eZSQ8j(false);
                }
                kN4muQto0Nd52 = caVar;
                xnVar3 = xnVar4;
                l1Var5 = l1Var4;
                z3 = true;
                i3 = i4 & (-238551153);
                tf0Var3 = tf0Var4;
                wv0Var4 = wv0Var3;
            } else {
                e30Var.Jkfc0NcwyPL8();
                wv0Var4 = wv0Var;
                kN4muQto0Nd52 = kN4muQto0Nd5;
                xnVar3 = xnVar;
                z3 = z;
                l1Var5 = l1Var;
                i3 = i4 & (-238551153);
                tf0Var3 = tf0Var;
            }
            e30Var.WmetiUbpKU9I();
            defpackage.q70.ZpBGe2uQfcn8(vl0Var2, tf0Var3, wv0Var4, xnVar3, z3, l1Var5, kN4muQto0Nd52, m7Var, y10Var, e30Var, (i3 & 14) | 806907264, 6 | ((i3 >> 18) & 7168));
            xnVar2 = xnVar3;
            z2 = z3;
            l1Var2 = l1Var5;
            tf0Var2 = tf0Var3;
            wv0Var2 = wv0Var4;
        } else {
            e30Var.Jkfc0NcwyPL8();
            tf0Var2 = tf0Var;
            wv0Var2 = wv0Var;
            kN4muQto0Nd52 = kN4muQto0Nd5;
            xnVar2 = xnVar;
            z2 = z;
            l1Var2 = l1Var;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.c20() { // from class: ce0
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj2, java.lang.Object obj3) {
                    ((java.lang.Integer) obj3).getClass();
                    defpackage.j80.ZpBGe2uQfcn8(defpackage.vl0.this, tf0Var2, wv0Var2, m7Var, kN4muQto0Nd52, xnVar2, z2, l1Var2, y10Var, (defpackage.e30) obj2, defpackage.m90.IBvW5fLsPuHy(i | 1));
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final boolean blKFvluuDQOf(defpackage.c01 c01Var, long j, long j2) {
        int i = c01Var.e6mdH7fiFuta == 1 ? 1 : 0;
        long j3 = c01Var.fWTAfUmVKrZq;
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f = i;
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j2 >> 32)) * f;
        float f2 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j2 & 4294967295L)) * f;
        return (intBitsToFloat > f2) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }

    public static final defpackage.a51 dG7RjM6DqYVL(defpackage.bn1 bn1Var, int i) {
        defpackage.an1 an1Var = bn1Var.ZpBGe2uQfcn8;
        defpackage.wm0 wm0Var = bn1Var.giKS3J6vZuNy;
        if (an1Var.ZpBGe2uQfcn8.oh71FJcDz6S2.length() != 0) {
            int JhCgjQRTAOCT = wm0Var.JhCgjQRTAOCT(i);
            if ((i != 0 && JhCgjQRTAOCT == wm0Var.JhCgjQRTAOCT(i - 1)) || (i != an1Var.ZpBGe2uQfcn8.oh71FJcDz6S2.length() && JhCgjQRTAOCT == wm0Var.JhCgjQRTAOCT(i + 1))) {
                return bn1Var.ZpBGe2uQfcn8(i);
            }
        }
        return bn1Var.QiMR8OkAhezm(i);
    }

    public static final boolean e6mdH7fiFuta(defpackage.c01 c01Var) {
        return (c01Var.giKS3J6vZuNy() || c01Var.P05cfTpS5W5L || !c01Var.JhCgjQRTAOCT) ? false : true;
    }

    public static final boolean fNwYGHIYeJcR(defpackage.c01 c01Var) {
        return c01Var.P05cfTpS5W5L && !c01Var.JhCgjQRTAOCT;
    }

    public static final void fWTAfUmVKrZq(defpackage.dh1 dh1Var, defpackage.y10 y10Var, defpackage.vl0 vl0Var, boolean z, defpackage.e30 e30Var, int i) {
        boolean z2;
        y10Var.getClass();
        e30Var.PS16moFv2oLu(-696004564);
        int i2 = 4;
        int i3 = i | (e30Var.JhCgjQRTAOCT(dh1Var == null ? -1 : dh1Var.ordinal()) ? 4 : 2) | (e30Var.P05cfTpS5W5L(y10Var) ? 32 : 16) | 3072;
        int i4 = 0;
        if (e30Var.zJPqDeoF0Os1(i3 & 1, (i3 & 1171) != 1170)) {
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            defpackage.pa1 pa1Var = defpackage.cj.ZpBGe2uQfcn8;
            if (GcLuU6pT9wO9 == pa1Var) {
                GcLuU6pT9wO9 = defpackage.w60.hH0RRJrNssvh(java.lang.Boolean.FALSE);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.fo0 fo0Var = (defpackage.fo0) GcLuU6pT9wO9;
            java.lang.String xahdJg25P1Bv = defpackage.q70.xahdJg25P1Bv(com.ice.fishing.wolberta.R.string.filter_all, e30Var);
            java.util.List VFeft99leXEK = defpackage.ma0.VFeft99leXEK(xahdJg25P1Bv);
            defpackage.tv tvVar = defpackage.dh1.Ns0WNyEWdPsk;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.jf.Wc0TdmRSwbbi(tvVar, 10));
            defpackage.ZVVdXbWmyCSK zVVdXbWmyCSK = new defpackage.ZVVdXbWmyCSK(i4, tvVar);
            while (zVVdXbWmyCSK.hasNext()) {
                arrayList.add(((defpackage.dh1) zVVdXbWmyCSK.next()).WDYagTQQm9ns);
            }
            java.util.ArrayList ULjnV488Y6RO = defpackage.hf.ULjnV488Y6RO(VFeft99leXEK, arrayList);
            if (dh1Var != null) {
                xahdJg25P1Bv = dh1Var.WDYagTQQm9ns;
            }
            java.lang.String str = xahdJg25P1Bv;
            boolean booleanValue = ((java.lang.Boolean) fo0Var.getValue()).booleanValue();
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO92 == pa1Var) {
                GcLuU6pT9wO92 = new defpackage.h4(fo0Var, i2);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.vx1.WDYagTQQm9ns(booleanValue, (defpackage.y10) GcLuU6pT9wO92, defpackage.ce1.giKS3J6vZuNy(vl0Var, 1.0f), defpackage.nn.OcTWLQzke1i2(-766729258, new defpackage.eh1(str, fo0Var, ULjnV488Y6RO, y10Var, 0), e30Var), e30Var, 3072);
            z2 = true;
        } else {
            e30Var.Jkfc0NcwyPL8();
            z2 = z;
        }
        defpackage.f31 s0TASMVLSWD5 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD5 != null) {
            s0TASMVLSWD5.JhCgjQRTAOCT = new defpackage.ow(dh1Var, y10Var, vl0Var, z2, i, 1);
        }
    }

    public static final boolean frSwwKIlbUhK(defpackage.yn0 yn0Var, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.Object QiMR8OkAhezm = yn0Var.QiMR8OkAhezm(obj);
        if (QiMR8OkAhezm == null) {
            return false;
        }
        if (!(QiMR8OkAhezm instanceof defpackage.zn0)) {
            if (!QiMR8OkAhezm.equals(obj2)) {
                return false;
            }
            yn0Var.Ns0WNyEWdPsk(obj);
            return true;
        }
        defpackage.zn0 zn0Var = (defpackage.zn0) QiMR8OkAhezm;
        boolean fNwYGHIYeJcR = zn0Var.fNwYGHIYeJcR(obj2);
        if (fNwYGHIYeJcR && zn0Var.QiMR8OkAhezm()) {
            yn0Var.Ns0WNyEWdPsk(obj);
        }
        return fNwYGHIYeJcR;
    }

    public static float gUjdnLbkVAaA(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static final defpackage.pq0 giKS3J6vZuNy(android.window.BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        return new defpackage.pq0(swipeEdge, progress, touchX, touchY, android.os.Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
    }

    public static double h3m55N1URyyK(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new java.lang.IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static final void hH0RRJrNssvh(android.text.Spannable spannable, long j, defpackage.hp hpVar, int i, int i2) {
        long giKS3J6vZuNy2 = defpackage.tn1.giKS3J6vZuNy(j);
        if (defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy2, 4294967296L)) {
            spannable.setSpan(new android.text.style.AbsoluteSizeSpan(defpackage.ok0.CZa7MwI9IzLd(hpVar.omM9cAlgeGXx(j)), false), i, i2, 33);
        } else if (defpackage.un1.ZpBGe2uQfcn8(giKS3J6vZuNy2, 8589934592L)) {
            spannable.setSpan(new android.text.style.RelativeSizeSpan(defpackage.tn1.fWTAfUmVKrZq(j)), i, i2, 33);
        }
    }

    public static final java.lang.Object jjTN4uUnoyEn(java.lang.Object obj, java.lang.Object obj2) {
        if (obj == null) {
            return obj2;
        }
        if (obj instanceof java.util.ArrayList) {
            ((java.util.ArrayList) obj).add(obj2);
            return obj;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(4);
        arrayList.add(obj);
        arrayList.add(obj2);
        return arrayList;
    }

    public static defpackage.uf maCixPsq4ml2(defpackage.e30 e30Var) {
        return (defpackage.uf) e30Var.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8);
    }

    public static defpackage.gd1 oCu53ZX2v4Ju(defpackage.e30 e30Var) {
        return (defpackage.gd1) e30Var.GE9mJIPrb8gP(defpackage.id1.ZpBGe2uQfcn8);
    }

    public static final void oh71FJcDz6S2(defpackage.yn0 yn0Var, java.lang.Object obj, java.lang.Object obj2) {
        int oh71FJcDz6S2 = yn0Var.oh71FJcDz6S2(obj);
        boolean z = oh71FJcDz6S2 < 0;
        java.lang.Object obj3 = z ? null : yn0Var.fWTAfUmVKrZq[oh71FJcDz6S2];
        if (obj3 != null) {
            if (obj3 instanceof defpackage.zn0) {
                ((defpackage.zn0) obj3).ZpBGe2uQfcn8(obj2);
            } else if (obj3 != obj2) {
                defpackage.zn0 zn0Var = new defpackage.zn0();
                zn0Var.ZpBGe2uQfcn8(obj3);
                zn0Var.ZpBGe2uQfcn8(obj2);
                obj2 = zn0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            yn0Var.fWTAfUmVKrZq[oh71FJcDz6S2] = obj2;
            return;
        }
        int i = ~oh71FJcDz6S2;
        yn0Var.giKS3J6vZuNy[i] = obj;
        yn0Var.fWTAfUmVKrZq[i] = obj2;
    }

    public static void qjMheFZ0l9kA(defpackage.nm1 nm1Var, defpackage.sk1 sk1Var, defpackage.bn1 bn1Var, defpackage.rc0 rc0Var, defpackage.wm1 wm1Var, boolean z, defpackage.zs0 zs0Var) {
        long ZpBGe2uQfcn8;
        defpackage.s31 s31Var;
        if (z) {
            int QiMR8OkAhezm = zs0Var.QiMR8OkAhezm(defpackage.in1.WDYagTQQm9ns(nm1Var.giKS3J6vZuNy));
            java.lang.String str = defpackage.yk1.ZpBGe2uQfcn8;
            if (QiMR8OkAhezm < bn1Var.ZpBGe2uQfcn8.ZpBGe2uQfcn8.oh71FJcDz6S2.length()) {
                s31Var = bn1Var.giKS3J6vZuNy(QiMR8OkAhezm);
            } else if (QiMR8OkAhezm != 0) {
                s31Var = bn1Var.giKS3J6vZuNy(QiMR8OkAhezm - 1);
            } else {
                ZpBGe2uQfcn8 = defpackage.yk1.ZpBGe2uQfcn8(sk1Var.giKS3J6vZuNy, sk1Var.QiMR8OkAhezm, sk1Var.P05cfTpS5W5L, defpackage.yk1.ZpBGe2uQfcn8, 1);
                s31Var = new defpackage.s31(0.0f, 0.0f, 1.0f, (int) (ZpBGe2uQfcn8 & 4294967295L));
            }
            float f = s31Var.giKS3J6vZuNy;
            float f2 = s31Var.ZpBGe2uQfcn8;
            long w6IV1lieBIux = rc0Var.w6IV1lieBIux((java.lang.Float.floatToRawIntBits(f2) << 32) | (java.lang.Float.floatToRawIntBits(f) & 4294967295L));
            float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (w6IV1lieBIux >> 32));
            float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (w6IV1lieBIux & 4294967295L));
            long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32);
            float f3 = s31Var.fWTAfUmVKrZq - f2;
            float f4 = s31Var.JhCgjQRTAOCT - f;
            defpackage.s31 oh71FJcDz6S2 = defpackage.n70.oh71FJcDz6S2(floatToRawIntBits, (java.lang.Float.floatToRawIntBits(f3) << 32) | (java.lang.Float.floatToRawIntBits(f4) & 4294967295L));
            if (defpackage.ma0.QiMR8OkAhezm((defpackage.wm1) wm1Var.ZpBGe2uQfcn8.giKS3J6vZuNy.get(), wm1Var)) {
                wm1Var.giKS3J6vZuNy.P05cfTpS5W5L(oh71FJcDz6S2);
            }
        }
    }

    public static final int s0TASMVLSWD5(defpackage.a71 a71Var, java.lang.String str) {
        a71Var.getClass();
        int columnCount = a71Var.getColumnCount();
        int i = 0;
        while (true) {
            if (i >= columnCount) {
                i = -1;
                break;
            }
            if (str.equals(a71Var.getColumnName(i))) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        java.lang.String str2 = "`" + str + '`';
        int columnCount2 = a71Var.getColumnCount();
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount2) {
                i2 = -1;
                break;
            }
            if (str2.equals(a71Var.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        if (android.os.Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
            int columnCount3 = a71Var.getColumnCount();
            java.lang.String concat = ".".concat(str);
            java.lang.String str3 = "." + str + '`';
            for (int i3 = 0; i3 < columnCount3; i3++) {
                java.lang.String columnName = a71Var.getColumnName(i3);
                if (columnName.length() >= str.length() + 2 && (columnName.endsWith(concat) || (columnName.charAt(0) == '`' && columnName.endsWith(str3)))) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static defpackage.n90 w6IV1lieBIux(defpackage.p90 p90Var) {
        p90Var.getClass();
        return new defpackage.n90(p90Var.WDYagTQQm9ns, p90Var.oh71FJcDz6S2, p90Var.QiMR8OkAhezm > 0 ? 2 : -2);
    }

    public static final java.lang.String xahdJg25P1Bv(java.lang.Object obj) {
        return (obj.getClass().isAnonymousClass() ? obj.getClass().getName() : obj.getClass().getSimpleName()) + '@' + java.lang.String.format("%07x", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf(java.lang.System.identityHashCode(obj))}, 1));
    }

    public static java.lang.String zJPqDeoF0Os1(int i) {
        return i == 0 ? "Unspecified" : i == 1 ? "Text" : i == 2 ? "Ascii" : i == 3 ? "Number" : i == 4 ? "Phone" : i == 5 ? "Uri" : i == 6 ? "Email" : i == 7 ? "Password" : i == 8 ? "NumberPassword" : i == 9 ? "Decimal" : "Invalid";
    }

    public int hashCode() {
        switch (this.ZpBGe2uQfcn8) {
            case 16:
                return toString().hashCode();
            default:
                return super.hashCode();
        }
    }

    public java.lang.String toString() {
        switch (this.ZpBGe2uQfcn8) {
            case 16:
                java.lang.String fWTAfUmVKrZq = defpackage.b41.ZpBGe2uQfcn8(getClass()).fWTAfUmVKrZq();
                fWTAfUmVKrZq.getClass();
                return fWTAfUmVKrZq;
            default:
                return super.toString();
        }
    }

    public abstract defpackage.s31 w7APNrr0aGRc();
}
