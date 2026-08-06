package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public abstract class h0 implements defpackage.la1 {
    public static defpackage.j60 BHfvd2J71qpO;
    public static final defpackage.ba ZpBGe2uQfcn8 = new defpackage.ba(-1.0f);
    public static final defpackage.ba giKS3J6vZuNy = new defpackage.ba(1.0f);
    public static final defpackage.aa fWTAfUmVKrZq = new defpackage.aa(-1.0f);
    public static final defpackage.aa JhCgjQRTAOCT = new defpackage.aa(1.0f);
    public static final defpackage.nh WDYagTQQm9ns = new defpackage.nh(636288403, false, new defpackage.uh(0));
    public static final defpackage.nh oh71FJcDz6S2 = new defpackage.nh(-1357803046, false, new defpackage.uh(1));
    public static final defpackage.av1 QiMR8OkAhezm = new defpackage.av1(0.31006f, 0.31616f);
    public static final defpackage.av1 P05cfTpS5W5L = new defpackage.av1(0.34567f, 0.3585f);
    public static final defpackage.av1 e6mdH7fiFuta = new defpackage.av1(0.32168f, 0.33767f);
    public static final defpackage.av1 GE9mJIPrb8gP = new defpackage.av1(0.31271f, 0.32902f);
    public static final float[] Ns0WNyEWdPsk = {0.964212f, 1.0f, 0.825188f};
    public static final java.lang.StackTraceElement[] fNwYGHIYeJcR = new java.lang.StackTraceElement[0];
    public static final byte[] h3m55N1URyyK = {112, 114, 111, 0};
    public static final byte[] gUjdnLbkVAaA = {112, 114, 109, 0};
    public static final defpackage.s31 T1fB7bDYiVJQ = new defpackage.s31(0.0f, 0.0f, 10.0f, 10.0f);
    public static final defpackage.l21 XntWc4eZSQ8j = new defpackage.l21(13);
    public static final java.lang.Object WmetiUbpKU9I = new java.lang.Object();
    public static final defpackage.iq0 s0TASMVLSWD5 = new defpackage.iq0(0, 0);

    /* JADX WARN: Removed duplicated region for block: B:19:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static defpackage.g00 BHfvd2J71qpO(android.content.Context context) {
        android.content.pm.ProviderInfo providerInfo;
        defpackage.e00 e00Var;
        android.content.pm.ApplicationInfo applicationInfo;
        int i = 28;
        defpackage.pa1 tnVar = android.os.Build.VERSION.SDK_INT >= 28 ? new defpackage.tn(i) : new defpackage.pa1(i);
        android.content.pm.PackageManager packageManager = context.getPackageManager();
        defpackage.w60.GE9mJIPrb8gP(packageManager, "Package manager required to locate emoji font provider");
        java.util.Iterator<android.content.pm.ResolveInfo> it = packageManager.queryIntentContentProviders(new android.content.Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo != null) {
            try {
                java.lang.String str = providerInfo.authority;
                java.lang.String str2 = providerInfo.packageName;
                android.content.pm.Signature[] XntWc4eZSQ8j2 = tnVar.XntWc4eZSQ8j(packageManager, str2);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (android.content.pm.Signature signature : XntWc4eZSQ8j2) {
                    arrayList.add(signature.toByteArray());
                }
                e00Var = new defpackage.e00(str, str2, "emojicompat-emoji-font", java.util.Collections.singletonList(arrayList), null, null);
            } catch (android.content.pm.PackageManager.NameNotFoundException e) {
                android.util.Log.wtf("emoji2.text.DefaultEmojiConfig", e);
            }
            if (e00Var != null) {
                return null;
            }
            return new defpackage.g00(new defpackage.f00(context, e00Var));
        }
        e00Var = null;
        if (e00Var != null) {
        }
    }

    public static final boolean BXaznwstz2U0(defpackage.jb1 jb1Var) {
        if (!IBvW5fLsPuHy(jb1Var)) {
            defpackage.fb1 fb1Var = jb1Var.JhCgjQRTAOCT;
            if (fb1Var.QiMR8OkAhezm) {
                return true;
            }
            defpackage.yn0 yn0Var = fb1Var.WDYagTQQm9ns;
            java.lang.Object[] objArr = yn0Var.giKS3J6vZuNy;
            java.lang.Object[] objArr2 = yn0Var.fWTAfUmVKrZq;
            long[] jArr = yn0Var.ZpBGe2uQfcn8;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                int i4 = (i << 3) + i3;
                                java.lang.Object obj = objArr[i4];
                                java.lang.Object obj2 = objArr2[i4];
                                if (((defpackage.qb1) obj).fWTAfUmVKrZq) {
                                    return true;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        }
                    }
                    if (i == length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }

    public static defpackage.wp[] CZa7MwI9IzLd(java.io.FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, defpackage.wp[] wpVarArr) {
        byte[] bArr3 = defpackage.nn.XntWc4eZSQ8j;
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            if (!java.util.Arrays.equals(bArr, defpackage.nn.WmetiUbpKU9I)) {
                defpackage.h7.P05cfTpS5W5L("Unsupported meta version");
                return null;
            }
            int Jkfc0NcwyPL8 = (int) defpackage.jr0.Jkfc0NcwyPL8(fileInputStream, 2);
            byte[] OVwOqzUGHcCU = defpackage.jr0.OVwOqzUGHcCU(fileInputStream, (int) defpackage.jr0.Jkfc0NcwyPL8(fileInputStream, 4), (int) defpackage.jr0.Jkfc0NcwyPL8(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                defpackage.h7.P05cfTpS5W5L("Content found after the end of file");
                return null;
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(OVwOqzUGHcCU);
            try {
                defpackage.wp[] z16KqenTjq8o = z16KqenTjq8o(byteArrayInputStream, bArr2, Jkfc0NcwyPL8, wpVarArr);
                byteArrayInputStream.close();
                return z16KqenTjq8o;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (java.util.Arrays.equals(defpackage.nn.Ns0WNyEWdPsk, bArr2)) {
            defpackage.h7.P05cfTpS5W5L("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            defpackage.h7.P05cfTpS5W5L("Unsupported meta version");
            return null;
        }
        int Jkfc0NcwyPL82 = (int) defpackage.jr0.Jkfc0NcwyPL8(fileInputStream, 1);
        byte[] OVwOqzUGHcCU2 = defpackage.jr0.OVwOqzUGHcCU(fileInputStream, (int) defpackage.jr0.Jkfc0NcwyPL8(fileInputStream, 4), (int) defpackage.jr0.Jkfc0NcwyPL8(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            defpackage.h7.P05cfTpS5W5L("Content found after the end of file");
            return null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(OVwOqzUGHcCU2);
        try {
            defpackage.wp[] EPEWHACkMcF1 = EPEWHACkMcF1(byteArrayInputStream2, Jkfc0NcwyPL82, wpVarArr);
            byteArrayInputStream2.close();
            return EPEWHACkMcF1;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static defpackage.wp[] EPEWHACkMcF1(java.io.ByteArrayInputStream byteArrayInputStream, int i, defpackage.wp[] wpVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new defpackage.wp[0];
        }
        if (i != wpVarArr.length) {
            defpackage.h7.P05cfTpS5W5L("Mismatched number of dex files found in metadata");
            return null;
        }
        java.lang.String[] strArr = new java.lang.String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int Jkfc0NcwyPL8 = (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
            iArr[i2] = (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
            strArr[i2] = new java.lang.String(defpackage.jr0.Wc0TdmRSwbbi(byteArrayInputStream, Jkfc0NcwyPL8), java.nio.charset.StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            defpackage.wp wpVar = wpVarArr[i3];
            if (!wpVar.giKS3J6vZuNy.equals(strArr[i3])) {
                defpackage.h7.P05cfTpS5W5L("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            wpVar.WDYagTQQm9ns = i4;
            wpVar.P05cfTpS5W5L = Fu5WBEia9jBo(byteArrayInputStream, i4);
        }
        return wpVarArr;
    }

    public static void EgL5gQQnyJKX(java.io.ByteArrayOutputStream byteArrayOutputStream, defpackage.wp wpVar) {
        lXYSMswtzmix(byteArrayOutputStream, wpVar);
        int i = wpVar.QiMR8OkAhezm;
        int[] iArr = wpVar.P05cfTpS5W5L;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (java.util.Map.Entry entry : wpVar.e6mdH7fiFuta.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i5 = intValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i6 = intValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final android.graphics.BlendMode FhgBoOud6zyW(int i) {
        android.graphics.BlendMode blendMode;
        android.graphics.BlendMode blendMode2;
        android.graphics.BlendMode blendMode3;
        android.graphics.BlendMode blendMode4;
        android.graphics.BlendMode blendMode5;
        android.graphics.BlendMode blendMode6;
        android.graphics.BlendMode blendMode7;
        android.graphics.BlendMode blendMode8;
        android.graphics.BlendMode blendMode9;
        android.graphics.BlendMode blendMode10;
        android.graphics.BlendMode blendMode11;
        android.graphics.BlendMode blendMode12;
        android.graphics.BlendMode blendMode13;
        android.graphics.BlendMode blendMode14;
        android.graphics.BlendMode blendMode15;
        android.graphics.BlendMode blendMode16;
        android.graphics.BlendMode blendMode17;
        android.graphics.BlendMode blendMode18;
        android.graphics.BlendMode blendMode19;
        android.graphics.BlendMode blendMode20;
        android.graphics.BlendMode blendMode21;
        android.graphics.BlendMode blendMode22;
        android.graphics.BlendMode blendMode23;
        android.graphics.BlendMode blendMode24;
        android.graphics.BlendMode blendMode25;
        android.graphics.BlendMode blendMode26;
        android.graphics.BlendMode blendMode27;
        android.graphics.BlendMode blendMode28;
        android.graphics.BlendMode blendMode29;
        android.graphics.BlendMode blendMode30;
        if (i == 0) {
            blendMode30 = android.graphics.BlendMode.CLEAR;
            return blendMode30;
        }
        if (i == 1) {
            blendMode29 = android.graphics.BlendMode.SRC;
            return blendMode29;
        }
        if (i == 2) {
            blendMode28 = android.graphics.BlendMode.DST;
            return blendMode28;
        }
        if (i == 3) {
            blendMode27 = android.graphics.BlendMode.SRC_OVER;
            return blendMode27;
        }
        if (i == 4) {
            blendMode26 = android.graphics.BlendMode.DST_OVER;
            return blendMode26;
        }
        if (i == 5) {
            blendMode25 = android.graphics.BlendMode.SRC_IN;
            return blendMode25;
        }
        if (i == 6) {
            blendMode24 = android.graphics.BlendMode.DST_IN;
            return blendMode24;
        }
        if (i == 7) {
            blendMode23 = android.graphics.BlendMode.SRC_OUT;
            return blendMode23;
        }
        if (i == 8) {
            blendMode22 = android.graphics.BlendMode.DST_OUT;
            return blendMode22;
        }
        if (i == 9) {
            blendMode21 = android.graphics.BlendMode.SRC_ATOP;
            return blendMode21;
        }
        if (i == 10) {
            blendMode20 = android.graphics.BlendMode.DST_ATOP;
            return blendMode20;
        }
        if (i == 11) {
            blendMode19 = android.graphics.BlendMode.XOR;
            return blendMode19;
        }
        if (i == 12) {
            blendMode18 = android.graphics.BlendMode.PLUS;
            return blendMode18;
        }
        if (i == 13) {
            blendMode17 = android.graphics.BlendMode.MODULATE;
            return blendMode17;
        }
        if (i == 14) {
            blendMode16 = android.graphics.BlendMode.SCREEN;
            return blendMode16;
        }
        if (i == 15) {
            blendMode15 = android.graphics.BlendMode.OVERLAY;
            return blendMode15;
        }
        if (i == 16) {
            blendMode14 = android.graphics.BlendMode.DARKEN;
            return blendMode14;
        }
        if (i == 17) {
            blendMode13 = android.graphics.BlendMode.LIGHTEN;
            return blendMode13;
        }
        if (i == 18) {
            blendMode12 = android.graphics.BlendMode.COLOR_DODGE;
            return blendMode12;
        }
        if (i == 19) {
            blendMode11 = android.graphics.BlendMode.COLOR_BURN;
            return blendMode11;
        }
        if (i == 20) {
            blendMode10 = android.graphics.BlendMode.HARD_LIGHT;
            return blendMode10;
        }
        if (i == 21) {
            blendMode9 = android.graphics.BlendMode.SOFT_LIGHT;
            return blendMode9;
        }
        if (i == 22) {
            blendMode8 = android.graphics.BlendMode.DIFFERENCE;
            return blendMode8;
        }
        if (i == 23) {
            blendMode7 = android.graphics.BlendMode.EXCLUSION;
            return blendMode7;
        }
        if (i == 24) {
            blendMode6 = android.graphics.BlendMode.MULTIPLY;
            return blendMode6;
        }
        if (i == 25) {
            blendMode5 = android.graphics.BlendMode.HUE;
            return blendMode5;
        }
        if (i == 26) {
            blendMode4 = android.graphics.BlendMode.SATURATION;
            return blendMode4;
        }
        if (i == 27) {
            blendMode3 = android.graphics.BlendMode.COLOR;
            return blendMode3;
        }
        if (i == 28) {
            blendMode2 = android.graphics.BlendMode.LUMINOSITY;
            return blendMode2;
        }
        blendMode = android.graphics.BlendMode.SRC_OVER;
        return blendMode;
    }

    public static int[] Fu5WBEia9jBo(java.io.ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static final void GE9mJIPrb8gP(defpackage.n10 n10Var, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(-1646555525);
        if ((i & 6) == 0) {
            i2 = (e30Var.P05cfTpS5W5L(n10Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 3) != 2)) {
            Ns0WNyEWdPsk((android.view.View) e30Var.GE9mJIPrb8gP(defpackage.j0.oh71FJcDz6S2), (defpackage.hp) e30Var.GE9mJIPrb8gP(defpackage.rj.P05cfTpS5W5L), n10Var, e30Var, (i2 << 6) & 896);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.s0(i, i3, n10Var);
        }
    }

    public static final defpackage.vl0 GcLuU6pT9wO9(defpackage.vl0 vl0Var, java.lang.String str) {
        return vl0Var.fWTAfUmVKrZq(new defpackage.vc0(str));
    }

    public static final java.lang.Object GoIRkIe1iwj6(java.lang.Object obj) {
        return obj instanceof defpackage.ug ? defpackage.b80.fNwYGHIYeJcR(((defpackage.ug) obj).ZpBGe2uQfcn8) : obj;
    }

    public static void I5Vdbaz9SDkL(java.io.ByteArrayOutputStream byteArrayOutputStream, int i, defpackage.wp wpVar) {
        int i2 = wpVar.QiMR8OkAhezm;
        byte[] bArr = new byte[(((java.lang.Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (java.util.Map.Entry entry : wpVar.e6mdH7fiFuta.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            int intValue2 = ((java.lang.Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & intValue2) == i4) {
                        int i5 = (i3 * i2) + intValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static final boolean IBvW5fLsPuHy(defpackage.jb1 jb1Var) {
        defpackage.sr0 JhCgjQRTAOCT2 = jb1Var.JhCgjQRTAOCT();
        defpackage.yn0 yn0Var = jb1Var.JhCgjQRTAOCT.WDYagTQQm9ns;
        return (JhCgjQRTAOCT2 != null ? JhCgjQRTAOCT2.fOrlzjnNBRYQ() : false) || yn0Var.fWTAfUmVKrZq(defpackage.nb1.WmetiUbpKU9I) || yn0Var.fWTAfUmVKrZq(defpackage.nb1.XntWc4eZSQ8j);
    }

    public static final defpackage.nz IJ0hOnjhPOri(defpackage.nz nzVar) {
        defpackage.nz oh71FJcDz6S22 = ((defpackage.gz) ((defpackage.u) defpackage.la0.qjMheFZ0l9kA(nzVar)).getFocusOwner()).oh71FJcDz6S2();
        if (oh71FJcDz6S22 == null || !oh71FJcDz6S22.s0TASMVLSWD5) {
            return null;
        }
        return oh71FJcDz6S22;
    }

    public static final java.lang.Object Jkfc0NcwyPL8(defpackage.ay0 ay0Var, defpackage.t21 t21Var) {
        t21Var.getClass();
        java.lang.Object obj = ay0Var.get(t21Var);
        if (obj == null) {
            obj = t21Var.giKS3J6vZuNy();
        }
        return ((defpackage.vs1) obj).ZpBGe2uQfcn8(ay0Var);
    }

    public static final boolean KrtOTfE6jiS2(defpackage.nz nzVar) {
        defpackage.jd0 jd0Var;
        defpackage.sr0 sr0Var;
        defpackage.jd0 jd0Var2;
        defpackage.sr0 sr0Var2 = nzVar.fNwYGHIYeJcR;
        return (sr0Var2 == null || (jd0Var = sr0Var2.BHfvd2J71qpO) == null || !jd0Var.IBvW5fLsPuHy() || (sr0Var = nzVar.fNwYGHIYeJcR) == null || (jd0Var2 = sr0Var.BHfvd2J71qpO) == null || !jd0Var2.KrtOTfE6jiS2()) ? false : true;
    }

    public static void LCK4GGEwbWAr(java.io.ByteArrayOutputStream byteArrayOutputStream, defpackage.wp wpVar, java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, str.getBytes(charset).length);
        defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, wpVar.WDYagTQQm9ns);
        defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, wpVar.oh71FJcDz6S2, 4);
        defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, wpVar.fWTAfUmVKrZq, 4);
        defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, wpVar.QiMR8OkAhezm, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final java.lang.Object Mearx7yMn90V(defpackage.qk0 qk0Var) {
        java.lang.Object GE9mJIPrb8gP2 = qk0Var.GE9mJIPrb8gP();
        defpackage.wc0 wc0Var = GE9mJIPrb8gP2 instanceof defpackage.wc0 ? (defpackage.wc0) GE9mJIPrb8gP2 : null;
        if (wc0Var != null) {
            return wc0Var.BHfvd2J71qpO;
        }
        return null;
    }

    public static defpackage.wp[] NkfcFfdaVTox(java.io.FileInputStream fileInputStream, byte[] bArr, java.lang.String str) {
        if (!java.util.Arrays.equals(bArr, defpackage.nn.fNwYGHIYeJcR)) {
            defpackage.h7.P05cfTpS5W5L("Unsupported version");
            return null;
        }
        int Jkfc0NcwyPL8 = (int) defpackage.jr0.Jkfc0NcwyPL8(fileInputStream, 1);
        byte[] OVwOqzUGHcCU = defpackage.jr0.OVwOqzUGHcCU(fileInputStream, (int) defpackage.jr0.Jkfc0NcwyPL8(fileInputStream, 4), (int) defpackage.jr0.Jkfc0NcwyPL8(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            defpackage.h7.P05cfTpS5W5L("Content found after the end of file");
            return null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(OVwOqzUGHcCU);
        try {
            defpackage.wp[] PS16moFv2oLu = PS16moFv2oLu(byteArrayInputStream, str, Jkfc0NcwyPL8);
            byteArrayInputStream.close();
            return PS16moFv2oLu;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static final void Ns0WNyEWdPsk(android.view.View view, defpackage.hp hpVar, defpackage.n10 n10Var, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(-1319522472);
        if ((i & 6) == 0) {
            i2 = (e30Var.P05cfTpS5W5L(view) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(hpVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(n10Var) ? 256 : 128;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(view) | ((i2 & 896) == 256);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.fWTAfUmVKrZq(11, view, n10Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.nq1.QiMR8OkAhezm(view, hpVar, (defpackage.y10) GcLuU6pT9wO9, e30Var);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.n3(view, hpVar, n10Var, i, 9);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.nz OcTWLQzke1i2(defpackage.nz nzVar) {
        boolean z = nzVar.WDYagTQQm9ns.s0TASMVLSWD5;
        if (z) {
            if (!z) {
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
            loop0: while (true) {
                int i = ho0Var.QiMR8OkAhezm;
                if (i == 0) {
                    break;
                }
                defpackage.ul0 ul0Var3 = (defpackage.ul0) ho0Var.Ns0WNyEWdPsk(i - 1);
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
                                    if (nzVar2.WDYagTQQm9ns.s0TASMVLSWD5) {
                                        int ordinal = nzVar2.iYH9ueRbBBFm().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            defpackage.h7.T1fB7bDYiVJQ();
                                            return null;
                                        }
                                    }
                                } else if ((ul0Var3.QiMR8OkAhezm & 1024) != 0 && (ul0Var3 instanceof defpackage.xo)) {
                                    int i2 = 0;
                                    for (defpackage.ul0 ul0Var4 = ((defpackage.xo) ul0Var3).ZVVdXbWmyCSK; ul0Var4 != null; ul0Var4 = ul0Var4.GE9mJIPrb8gP) {
                                        if ((ul0Var4.QiMR8OkAhezm & 1024) != 0) {
                                            i2++;
                                            if (i2 == 1) {
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
                                    if (i2 == 1) {
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
        }
        return null;
    }

    public static final void P05cfTpS5W5L(java.lang.String str, defpackage.vl0 vl0Var, defpackage.e30 e30Var, int i) {
        defpackage.vl0 vl0Var2;
        defpackage.e30 e30Var2 = e30Var;
        str.getClass();
        e30Var2.PS16moFv2oLu(951313285);
        int i2 = i | (e30Var2.oh71FJcDz6S2(str) ? 4 : 2) | 48;
        if (e30Var2.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            defpackage.zw zwVar = defpackage.ce1.fWTAfUmVKrZq;
            defpackage.gg ZpBGe2uQfcn82 = defpackage.eg.ZpBGe2uQfcn8(defpackage.vx1.fWTAfUmVKrZq, defpackage.jVUAPb5NnIYW.BHfvd2J71qpO, e30Var2, 54);
            int hashCode = java.lang.Long.hashCode(e30Var2.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR2 = e30Var2.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var2, zwVar);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var2.fhbmYuu9J3cT();
            if (e30Var2.Fu5WBEia9jBo) {
                e30Var2.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var2.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(defpackage.vi.oh71FJcDz6S2, e30Var2, ZpBGe2uQfcn82);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var2, fNwYGHIYeJcR2);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var2, java.lang.Integer.valueOf(hashCode));
            defpackage.t80.Mearx7yMn90V(e30Var2, defpackage.vi.P05cfTpS5W5L);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var2, oCu53ZX2v4Ju);
            defpackage.j60 j60Var = defpackage.n70.JhCgjQRTAOCT;
            if (j60Var == null) {
                defpackage.i60 i60Var = new defpackage.i60("Filled.SearchOff", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                int i3 = defpackage.bt1.ZpBGe2uQfcn8;
                long j = defpackage.pf.giKS3J6vZuNy;
                defpackage.lf1 lf1Var = new defpackage.lf1(j);
                defpackage.k0 k0Var = new defpackage.k0(16, (byte) 0);
                java.util.ArrayList arrayList = (java.util.ArrayList) k0Var.oh71FJcDz6S2;
                k0Var.WmetiUbpKU9I(15.5f, 14.0f);
                arrayList.add(new defpackage.lx0(-0.79f));
                k0Var.XntWc4eZSQ8j(-0.28f, -0.27f);
                k0Var.GE9mJIPrb8gP(15.41f, 12.59f, 16.0f, 11.11f, 16.0f, 9.5f);
                k0Var.GE9mJIPrb8gP(16.0f, 5.91f, 13.09f, 3.0f, 9.5f, 3.0f);
                k0Var.GE9mJIPrb8gP(6.08f, 3.0f, 3.28f, 5.64f, 3.03f, 9.0f);
                arrayList.add(new defpackage.lx0(2.02f));
                k0Var.GE9mJIPrb8gP(5.3f, 6.75f, 7.18f, 5.0f, 9.5f, 5.0f);
                k0Var.GE9mJIPrb8gP(11.99f, 5.0f, 14.0f, 7.01f, 14.0f, 9.5f);
                k0Var.ZVVdXbWmyCSK(11.99f, 14.0f, 9.5f, 14.0f);
                k0Var.Ns0WNyEWdPsk(-0.17f, 0.0f, -0.33f, -0.03f, -0.5f, -0.05f);
                arrayList.add(new defpackage.rx0(2.02f));
                k0Var.GE9mJIPrb8gP(9.17f, 15.99f, 9.33f, 16.0f, 9.5f, 16.0f);
                k0Var.Ns0WNyEWdPsk(1.61f, 0.0f, 3.09f, -0.59f, 4.23f, -1.57f);
                k0Var.T1fB7bDYiVJQ(14.0f, 14.71f);
                arrayList.add(new defpackage.rx0(0.79f));
                k0Var.XntWc4eZSQ8j(5.0f, 4.99f);
                k0Var.T1fB7bDYiVJQ(20.49f, 19.0f);
                k0Var.T1fB7bDYiVJQ(15.5f, 14.0f);
                k0Var.oh71FJcDz6S2();
                defpackage.i60.ZpBGe2uQfcn8(i60Var, arrayList, lf1Var);
                defpackage.lf1 lf1Var2 = new defpackage.lf1(j);
                defpackage.k0 k0Var2 = new defpackage.k0(16, (byte) 0);
                k0Var2.WmetiUbpKU9I(6.47f, 10.82f);
                k0Var2.XntWc4eZSQ8j(-2.47f, 2.47f);
                k0Var2.XntWc4eZSQ8j(-2.47f, -2.47f);
                k0Var2.XntWc4eZSQ8j(-0.71f, 0.71f);
                k0Var2.XntWc4eZSQ8j(2.47f, 2.47f);
                k0Var2.XntWc4eZSQ8j(-2.47f, 2.47f);
                k0Var2.XntWc4eZSQ8j(0.71f, 0.71f);
                k0Var2.XntWc4eZSQ8j(2.47f, -2.47f);
                k0Var2.XntWc4eZSQ8j(2.47f, 2.47f);
                k0Var2.XntWc4eZSQ8j(0.71f, -0.71f);
                k0Var2.XntWc4eZSQ8j(-2.47f, -2.47f);
                k0Var2.XntWc4eZSQ8j(2.47f, -2.47f);
                k0Var2.oh71FJcDz6S2();
                defpackage.i60.ZpBGe2uQfcn8(i60Var, (java.util.ArrayList) k0Var2.oh71FJcDz6S2, lf1Var2);
                j60Var = i60Var.giKS3J6vZuNy();
                defpackage.n70.JhCgjQRTAOCT = j60Var;
            }
            defpackage.ng1 ng1Var = defpackage.wf.ZpBGe2uQfcn8;
            defpackage.f60.ZpBGe2uQfcn8(j60Var, defpackage.ce1.oh71FJcDz6S2(64.0f), ((defpackage.uf) e30Var2.GE9mJIPrb8gP(ng1Var)).ZpBGe2uQfcn8, e30Var2, 432, 0);
            defpackage.pn1 pn1Var = ((defpackage.gr1) e30Var2.GE9mJIPrb8gP(defpackage.hr1.ZpBGe2uQfcn8)).P05cfTpS5W5L;
            long j2 = ((defpackage.uf) e30Var2.GE9mJIPrb8gP(ng1Var)).ZpBGe2uQfcn8;
            defpackage.sl0 sl0Var = defpackage.sl0.ZpBGe2uQfcn8;
            defpackage.ym1.giKS3J6vZuNy(str, defpackage.nq1.OVwOqzUGHcCU(sl0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), j2, 0L, 0L, new defpackage.tj1(3), 0L, 0, false, 0, 0, pn1Var, e30Var, (i2 & 14) | 48, 0, 130040);
            e30Var2 = e30Var;
            e30Var2.XntWc4eZSQ8j(true);
            vl0Var2 = sl0Var;
        } else {
            e30Var2.Jkfc0NcwyPL8();
            vl0Var2 = vl0Var;
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.zu(str, vl0Var2, i, 0);
        }
    }

    public static defpackage.wp[] PS16moFv2oLu(java.io.ByteArrayInputStream byteArrayInputStream, java.lang.String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new defpackage.wp[0];
        }
        defpackage.wp[] wpVarArr = new defpackage.wp[i];
        for (int i3 = 0; i3 < i; i3++) {
            int Jkfc0NcwyPL8 = (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
            int Jkfc0NcwyPL82 = (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
            wpVarArr[i3] = new defpackage.wp(str, new java.lang.String(defpackage.jr0.Wc0TdmRSwbbi(byteArrayInputStream, Jkfc0NcwyPL8), java.nio.charset.StandardCharsets.UTF_8), defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 4), Jkfc0NcwyPL82, (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 4), (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 4), new int[Jkfc0NcwyPL82], new java.util.TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            defpackage.wp wpVar = wpVarArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = wpVar.oh71FJcDz6S2;
            int i6 = wpVar.QiMR8OkAhezm;
            java.util.TreeMap treeMap = wpVar.e6mdH7fiFuta;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
                treeMap.put(java.lang.Integer.valueOf(i8), 1);
                int Jkfc0NcwyPL83 = (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
                while (Jkfc0NcwyPL83 > 0) {
                    defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
                    int Jkfc0NcwyPL84 = (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 1);
                    if (Jkfc0NcwyPL84 != 6 && Jkfc0NcwyPL84 != 7) {
                        while (Jkfc0NcwyPL84 > 0) {
                            defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int Jkfc0NcwyPL85 = (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 1); Jkfc0NcwyPL85 > 0; Jkfc0NcwyPL85--) {
                                defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
                            }
                            Jkfc0NcwyPL84--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    Jkfc0NcwyPL83--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                defpackage.h7.P05cfTpS5W5L("Read too much data during profile line parse");
                return null;
            }
            wpVar.P05cfTpS5W5L = Fu5WBEia9jBo(byteArrayInputStream, wpVar.WDYagTQQm9ns);
            java.util.BitSet valueOf = java.util.BitSet.valueOf(defpackage.jr0.Wc0TdmRSwbbi(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i13 = i11; i13 < i6; i13++) {
                int i14 = valueOf.get(i13) ? 2 : i11;
                if (valueOf.get(i13 + i6)) {
                    i14 |= 4;
                }
                if (i14 != 0) {
                    java.lang.Integer num = (java.lang.Integer) treeMap.get(java.lang.Integer.valueOf(i13));
                    if (num == null) {
                        num = java.lang.Integer.valueOf(i11);
                    }
                    treeMap.put(java.lang.Integer.valueOf(i13), java.lang.Integer.valueOf(i14 | num.intValue()));
                }
            }
            i4 = i12 + 1;
            i2 = i11;
        }
        return wpVarArr;
    }

    public static final void QiMR8OkAhezm(final defpackage.vl0 vl0Var, final long j, final boolean z, final defpackage.nh nhVar, defpackage.e30 e30Var, final int i) {
        int i2;
        float f;
        e30Var.PS16moFv2oLu(1355047526);
        if ((i & 6) == 0) {
            i2 = (e30Var.oh71FJcDz6S2(vl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.WDYagTQQm9ns(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.QiMR8OkAhezm(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(nhVar) ? 2048 : 1024;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 1171) != 1170)) {
            e30Var.CZa7MwI9IzLd();
            if ((i & 1) != 0 && !e30Var.oCu53ZX2v4Ju()) {
                e30Var.Jkfc0NcwyPL8();
            }
            e30Var.WmetiUbpKU9I();
            float f2 = (int) (((android.content.res.Configuration) e30Var.GE9mJIPrb8gP(defpackage.j0.ZpBGe2uQfcn8)).screenWidthDp * 0.05f);
            java.util.WeakHashMap weakHashMap = defpackage.rw1.maCixPsq4ml2;
            defpackage.v4 v4Var = defpackage.l21.e6mdH7fiFuta(e30Var).oh71FJcDz6S2;
            defpackage.ng1 ng1Var = defpackage.rj.P05cfTpS5W5L;
            defpackage.hp hpVar = (defpackage.hp) e30Var.GE9mJIPrb8gP(ng1Var);
            float pf0OXpZQoaz3 = hpVar.pf0OXpZQoaz3(v4Var.giKS3J6vZuNy(hpVar)) + 10.0f;
            if (z) {
                e30Var.NkfcFfdaVTox(-176317761);
                defpackage.v4 v4Var2 = defpackage.l21.e6mdH7fiFuta(e30Var).WDYagTQQm9ns;
                defpackage.hp hpVar2 = (defpackage.hp) e30Var.GE9mJIPrb8gP(ng1Var);
                f = hpVar2.pf0OXpZQoaz3(v4Var2.ZpBGe2uQfcn8(hpVar2)) + 2.0f;
                e30Var.XntWc4eZSQ8j(false);
            } else {
                e30Var.NkfcFfdaVTox(-176221816);
                e30Var.XntWc4eZSQ8j(false);
                f = 0.0f;
            }
            defpackage.zw zwVar = defpackage.ce1.fWTAfUmVKrZq;
            defpackage.vl0 JhCgjQRTAOCT2 = defpackage.nn.JhCgjQRTAOCT(vl0Var.fWTAfUmVKrZq(zwVar), j, defpackage.la0.blKFvluuDQOf);
            defpackage.vk0 JhCgjQRTAOCT3 = defpackage.ab.JhCgjQRTAOCT(defpackage.jVUAPb5NnIYW.oh71FJcDz6S2, false);
            int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR2 = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, JhCgjQRTAOCT2);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.h5 h5Var = defpackage.vi.oh71FJcDz6S2;
            defpackage.t80.w6IV1lieBIux(h5Var, e30Var, JhCgjQRTAOCT3);
            defpackage.h5 h5Var2 = defpackage.vi.WDYagTQQm9ns;
            defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, fNwYGHIYeJcR2);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
            defpackage.h5 h5Var3 = defpackage.vi.QiMR8OkAhezm;
            defpackage.t80.w6IV1lieBIux(h5Var3, e30Var, valueOf);
            defpackage.n nVar = defpackage.vi.P05cfTpS5W5L;
            defpackage.t80.Mearx7yMn90V(e30Var, nVar);
            defpackage.h5 h5Var4 = defpackage.vi.JhCgjQRTAOCT;
            defpackage.t80.w6IV1lieBIux(h5Var4, e30Var, oCu53ZX2v4Ju);
            defpackage.vl0 Wc0TdmRSwbbi = defpackage.nq1.Wc0TdmRSwbbi(zwVar, f2, pf0OXpZQoaz3, f2, f);
            defpackage.vk0 JhCgjQRTAOCT4 = defpackage.ab.JhCgjQRTAOCT(defpackage.jVUAPb5NnIYW.QiMR8OkAhezm, false);
            int hashCode2 = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR3 = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju2 = defpackage.i61.oCu53ZX2v4Ju(e30Var, Wc0TdmRSwbbi);
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(h5Var, e30Var, JhCgjQRTAOCT4);
            defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, fNwYGHIYeJcR3);
            defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode2, e30Var, h5Var3, e30Var, nVar);
            defpackage.t80.w6IV1lieBIux(h5Var4, e30Var, oCu53ZX2v4Ju2);
            nhVar.QiMR8OkAhezm(e30Var, java.lang.Integer.valueOf((i2 >> 9) & 14));
            e30Var.XntWc4eZSQ8j(true);
            e30Var.XntWc4eZSQ8j(true);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.c20() { // from class: ok
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    defpackage.h0.QiMR8OkAhezm(defpackage.vl0.this, j, z, nhVar, (defpackage.e30) obj, defpackage.m90.IBvW5fLsPuHy(i | 1));
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final android.graphics.PorterDuff.Mode Rl68HURFBtL3(int i) {
        return i == 0 ? android.graphics.PorterDuff.Mode.CLEAR : i == 1 ? android.graphics.PorterDuff.Mode.SRC : i == 2 ? android.graphics.PorterDuff.Mode.DST : i == 3 ? android.graphics.PorterDuff.Mode.SRC_OVER : i == 4 ? android.graphics.PorterDuff.Mode.DST_OVER : i == 5 ? android.graphics.PorterDuff.Mode.SRC_IN : i == 6 ? android.graphics.PorterDuff.Mode.DST_IN : i == 7 ? android.graphics.PorterDuff.Mode.SRC_OUT : i == 8 ? android.graphics.PorterDuff.Mode.DST_OUT : i == 9 ? android.graphics.PorterDuff.Mode.SRC_ATOP : i == 10 ? android.graphics.PorterDuff.Mode.DST_ATOP : i == 11 ? android.graphics.PorterDuff.Mode.XOR : i == 12 ? android.graphics.PorterDuff.Mode.ADD : i == 14 ? android.graphics.PorterDuff.Mode.SCREEN : i == 15 ? android.graphics.PorterDuff.Mode.OVERLAY : i == 16 ? android.graphics.PorterDuff.Mode.DARKEN : i == 17 ? android.graphics.PorterDuff.Mode.LIGHTEN : i == 13 ? android.graphics.PorterDuff.Mode.MULTIPLY : android.graphics.PorterDuff.Mode.SRC_OVER;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final android.graphics.Typeface T1fB7bDYiVJQ(defpackage.b51 b51Var, android.content.Context context) {
        int i = defpackage.d51.ZpBGe2uQfcn8;
        android.graphics.Typeface typeface = null;
        if (!context.isRestricted()) {
            android.util.TypedValue typedValue = new android.util.TypedValue();
            android.content.res.Resources resources = context.getResources();
            resources.getValue(com.ice.fishing.wolberta.R.font.grandstander, typedValue, true);
            java.lang.CharSequence charSequence = typedValue.string;
            if (charSequence == null) {
                throw new android.content.res.Resources.NotFoundException("Resource \"" + resources.getResourceName(com.ice.fishing.wolberta.R.font.grandstander) + "\" (" + java.lang.Integer.toHexString(com.ice.fishing.wolberta.R.font.grandstander) + ") is not a Font: " + typedValue);
            }
            java.lang.String charSequence2 = charSequence.toString();
            if (charSequence2.startsWith("res/")) {
                int i2 = typedValue.assetCookie;
                defpackage.rj0 rj0Var = defpackage.rq1.giKS3J6vZuNy;
                android.graphics.Typeface typeface2 = (android.graphics.Typeface) rj0Var.fWTAfUmVKrZq(defpackage.rq1.giKS3J6vZuNy(resources, charSequence2, i2));
                if (typeface2 != null) {
                    typeface = typeface2;
                } else {
                    try {
                        if (charSequence2.toLowerCase().endsWith(".xml")) {
                            defpackage.l00 IJ0hOnjhPOri = defpackage.la0.IJ0hOnjhPOri(resources.getXml(com.ice.fishing.wolberta.R.font.grandstander), resources);
                            if (IJ0hOnjhPOri == null) {
                                android.util.Log.e("ResourcesCompat", "Failed to find font-family tag");
                            } else {
                                typeface = defpackage.rq1.ZpBGe2uQfcn8(context, IJ0hOnjhPOri, resources, charSequence2, typedValue.assetCookie, null);
                            }
                        } else {
                            int i3 = typedValue.assetCookie;
                            android.graphics.Typeface BHfvd2J71qpO2 = defpackage.rq1.ZpBGe2uQfcn8.BHfvd2J71qpO(context, resources, charSequence2);
                            if (BHfvd2J71qpO2 != null) {
                                rj0Var.JhCgjQRTAOCT(defpackage.rq1.giKS3J6vZuNy(resources, charSequence2, i3), BHfvd2J71qpO2);
                            }
                            typeface = BHfvd2J71qpO2;
                        }
                    } catch (java.io.IOException e) {
                        android.util.Log.e("ResourcesCompat", "Failed to read xml resource ".concat(charSequence2), e);
                    } catch (org.xmlpull.v1.XmlPullParserException e2) {
                        android.util.Log.e("ResourcesCompat", "Failed to parse xml resource ".concat(charSequence2), e2);
                    }
                }
                if (typeface == null) {
                    throw new android.content.res.Resources.NotFoundException("Font resource ID #0x" + java.lang.Integer.toHexString(com.ice.fishing.wolberta.R.font.grandstander) + " could not be retrieved.");
                }
            }
            typeface = null;
            if (typeface == null) {
            }
        }
        typeface.getClass();
        return typeface;
    }

    public static final void UmgHb6n58gfG(defpackage.k0 k0Var, defpackage.k0 k0Var2, defpackage.y10 y10Var, defpackage.gn0 gn0Var, defpackage.jb1 jb1Var, defpackage.jb1 jb1Var2) {
        defpackage.k0 k0Var3 = k0Var;
        android.graphics.Region region = (android.graphics.Region) k0Var3.oh71FJcDz6S2;
        defpackage.k0 k0Var4 = k0Var2;
        android.graphics.Region region2 = (android.graphics.Region) k0Var4.oh71FJcDz6S2;
        defpackage.jd0 jd0Var = jb1Var2.fWTAfUmVKrZq;
        defpackage.jd0 jd0Var2 = jb1Var2.fWTAfUmVKrZq;
        if (!jd0Var.IBvW5fLsPuHy() || !jd0Var2.KrtOTfE6jiS2() || region2.isEmpty()) {
            if (jb1Var2.T1fB7bDYiVJQ()) {
                qjMheFZ0l9kA(gn0Var, jb1Var, jb1Var2);
                return;
            }
            return;
        }
        defpackage.s31 h3m55N1URyyK2 = jb1Var2.h3m55N1URyyK();
        if (h3m55N1URyyK2.oh71FJcDz6S2()) {
            defpackage.wo oh71FJcDz6S22 = jb1Var2.oh71FJcDz6S2();
            if (oh71FJcDz6S22 == null) {
                defpackage.l80 l80Var = jd0Var2.IBvW5fLsPuHy.fWTAfUmVKrZq;
                h3m55N1URyyK2 = defpackage.wc1.UmgHb6n58gfG(l80Var).hH0RRJrNssvh(l80Var, false);
            } else {
                defpackage.ul0 ul0Var = ((defpackage.ul0) oh71FJcDz6S22).WDYagTQQm9ns;
                java.lang.Object QiMR8OkAhezm2 = jb1Var2.JhCgjQRTAOCT.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.eb1.giKS3J6vZuNy);
                if (QiMR8OkAhezm2 == null) {
                    QiMR8OkAhezm2 = null;
                }
                h3m55N1URyyK2 = defpackage.wc1.w7APNrr0aGRc(ul0Var, QiMR8OkAhezm2 != null, false);
            }
        }
        defpackage.q90 PS16moFv2oLu = defpackage.wc1.PS16moFv2oLu(h3m55N1URyyK2);
        k0Var3.oCu53ZX2v4Ju(PS16moFv2oLu);
        if (region.op(region2, android.graphics.Region.Op.INTERSECT)) {
            int i = jb1Var2.oh71FJcDz6S2;
            defpackage.jb1 jb1Var3 = jb1Var;
            if (i == jb1Var3.oh71FJcDz6S2) {
                i = -1;
            }
            android.graphics.Rect bounds = region.getBounds();
            defpackage.lb1 lb1Var = new defpackage.lb1(jb1Var2, new defpackage.q90(bounds.left, bounds.top, bounds.right, bounds.bottom));
            defpackage.gn0 gn0Var2 = gn0Var;
            gn0Var2.P05cfTpS5W5L(i, lb1Var);
            java.util.List GE9mJIPrb8gP2 = defpackage.jb1.GE9mJIPrb8gP(4, jb1Var2);
            int size = GE9mJIPrb8gP2.size() - 1;
            while (-1 < size) {
                if (!((java.lang.Boolean) y10Var.P05cfTpS5W5L(GE9mJIPrb8gP2.get(size))).booleanValue()) {
                    UmgHb6n58gfG(k0Var3, k0Var4, y10Var, gn0Var2, jb1Var3, (defpackage.jb1) GE9mJIPrb8gP2.get(size));
                }
                size--;
                k0Var3 = k0Var;
                k0Var4 = k0Var2;
                gn0Var2 = gn0Var;
                jb1Var3 = jb1Var;
            }
            if (BXaznwstz2U0(jb1Var2)) {
                region2.op(PS16moFv2oLu.ZpBGe2uQfcn8, PS16moFv2oLu.giKS3J6vZuNy, PS16moFv2oLu.fWTAfUmVKrZq, PS16moFv2oLu.JhCgjQRTAOCT, android.graphics.Region.Op.DIFFERENCE);
            }
        }
    }

    public static final defpackage.s31 VFeft99leXEK(defpackage.nz nzVar) {
        defpackage.sr0 sr0Var;
        if (nzVar.s0TASMVLSWD5 && (sr0Var = nzVar.fNwYGHIYeJcR) != null) {
            defpackage.rc0 UmgHb6n58gfG = defpackage.wc1.UmgHb6n58gfG(sr0Var);
            if (!UmgHb6n58gfG.blKFvluuDQOf()) {
                UmgHb6n58gfG = null;
            }
            if (UmgHb6n58gfG != null) {
                return nzVar.jVUAPb5NnIYW(UmgHb6n58gfG);
            }
        }
        return defpackage.s31.WDYagTQQm9ns;
    }

    public static final void WDYagTQQm9ns(boolean z, final defpackage.n10 n10Var, defpackage.e30 e30Var, final int i, final int i2) {
        final boolean z2;
        int i3;
        e30Var.PS16moFv2oLu(-361453782);
        int i4 = i2 & 1;
        int i5 = 4;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 6) == 0) {
            z2 = z;
            i3 = (e30Var.QiMR8OkAhezm(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= e30Var.P05cfTpS5W5L(n10Var) ? 32 : 16;
        }
        if (e30Var.zJPqDeoF0Os1(i3 & 1, (i3 & 19) != 18)) {
            boolean z3 = i4 != 0 ? true : z2;
            java.lang.Object ZpBGe2uQfcn82 = defpackage.hi0.ZpBGe2uQfcn8(e30Var);
            if (ZpBGe2uQfcn82 == null) {
                e30Var.NkfcFfdaVTox(535274673);
                ZpBGe2uQfcn82 = defpackage.ii0.ZpBGe2uQfcn8(e30Var);
            } else {
                e30Var.NkfcFfdaVTox(535271790);
            }
            e30Var.XntWc4eZSQ8j(false);
            if (ZpBGe2uQfcn82 == null) {
                defpackage.h7.P05cfTpS5W5L("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(ZpBGe2uQfcn82);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj = defpackage.cj.ZpBGe2uQfcn8;
            if (oh71FJcDz6S22 || GcLuU6pT9wO9 == obj) {
                defpackage.qq0 qq0Var = ZpBGe2uQfcn82 instanceof defpackage.qq0 ? (defpackage.qq0) ZpBGe2uQfcn82 : null;
                defpackage.s81 ZpBGe2uQfcn83 = qq0Var != null ? qq0Var.ZpBGe2uQfcn8() : null;
                defpackage.mt0 mt0Var = ZpBGe2uQfcn82 instanceof defpackage.mt0 ? (defpackage.mt0) ZpBGe2uQfcn82 : null;
                GcLuU6pT9wO9 = new defpackage.b9(ZpBGe2uQfcn83, mt0Var != null ? mt0Var.giKS3J6vZuNy() : null);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            java.lang.Object obj2 = (defpackage.b9) GcLuU6pT9wO9;
            long j = e30Var.CZa7MwI9IzLd;
            boolean oh71FJcDz6S23 = e30Var.oh71FJcDz6S2(obj2) | e30Var.WDYagTQQm9ns(j);
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj3 = GcLuU6pT9wO92;
            if (oh71FJcDz6S23 || GcLuU6pT9wO92 == obj) {
                defpackage.ai aiVar = new defpackage.ai(new defpackage.c9(j, ZpBGe2uQfcn82));
                aiVar.fWTAfUmVKrZq = new defpackage.n8(i5);
                e30Var.EgL5gQQnyJKX(aiVar);
                obj3 = aiVar;
            }
            defpackage.ai aiVar2 = (defpackage.ai) obj3;
            e30Var.NkfcFfdaVTox(-585307852);
            boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(aiVar2) | ((i3 & 112) == 32);
            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            int i6 = 3;
            if (P05cfTpS5W5L2 || GcLuU6pT9wO93 == obj) {
                GcLuU6pT9wO93 = new defpackage.S0YpfprlOYIn(i6, aiVar2, n10Var);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
            }
            defpackage.nq1.WmetiUbpKU9I((defpackage.n10) GcLuU6pT9wO93, e30Var);
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z3);
            int i7 = i3 & 14;
            boolean P05cfTpS5W5L3 = e30Var.P05cfTpS5W5L(aiVar2) | (i7 == 4);
            java.lang.Object GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L3 || GcLuU6pT9wO94 == obj) {
                GcLuU6pT9wO94 = new defpackage.d9(aiVar2, z3, 0);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO94);
            }
            defpackage.t80.ZpBGe2uQfcn8(valueOf, aiVar2, null, (defpackage.y10) GcLuU6pT9wO94, e30Var, i7);
            boolean P05cfTpS5W5L4 = e30Var.P05cfTpS5W5L(obj2) | e30Var.P05cfTpS5W5L(aiVar2);
            java.lang.Object GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L4 || GcLuU6pT9wO95 == obj) {
                GcLuU6pT9wO95 = new defpackage.fWTAfUmVKrZq(i6, obj2, aiVar2);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO95);
            }
            defpackage.nq1.QiMR8OkAhezm(obj2, aiVar2, (defpackage.y10) GcLuU6pT9wO95, e30Var);
            e30Var.XntWc4eZSQ8j(false);
            z2 = z3;
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.c20() { // from class: e9
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj4, java.lang.Object obj5) {
                    ((java.lang.Integer) obj5).getClass();
                    int IBvW5fLsPuHy = defpackage.m90.IBvW5fLsPuHy(i | 1);
                    defpackage.h0.WDYagTQQm9ns(z2, n10Var, (defpackage.e30) obj4, IBvW5fLsPuHy, i2);
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public static final void Wc0TdmRSwbbi(float[] fArr, float[] fArr2) {
        float w7APNrr0aGRc = w7APNrr0aGRc(fArr2, 0, fArr, 0);
        float w7APNrr0aGRc2 = w7APNrr0aGRc(fArr2, 0, fArr, 1);
        float w7APNrr0aGRc3 = w7APNrr0aGRc(fArr2, 0, fArr, 2);
        float w7APNrr0aGRc4 = w7APNrr0aGRc(fArr2, 0, fArr, 3);
        float w7APNrr0aGRc5 = w7APNrr0aGRc(fArr2, 1, fArr, 0);
        float w7APNrr0aGRc6 = w7APNrr0aGRc(fArr2, 1, fArr, 1);
        float w7APNrr0aGRc7 = w7APNrr0aGRc(fArr2, 1, fArr, 2);
        float w7APNrr0aGRc8 = w7APNrr0aGRc(fArr2, 1, fArr, 3);
        float w7APNrr0aGRc9 = w7APNrr0aGRc(fArr2, 2, fArr, 0);
        float w7APNrr0aGRc10 = w7APNrr0aGRc(fArr2, 2, fArr, 1);
        float w7APNrr0aGRc11 = w7APNrr0aGRc(fArr2, 2, fArr, 2);
        float w7APNrr0aGRc12 = w7APNrr0aGRc(fArr2, 2, fArr, 3);
        float w7APNrr0aGRc13 = w7APNrr0aGRc(fArr2, 3, fArr, 0);
        float w7APNrr0aGRc14 = w7APNrr0aGRc(fArr2, 3, fArr, 1);
        float w7APNrr0aGRc15 = w7APNrr0aGRc(fArr2, 3, fArr, 2);
        float w7APNrr0aGRc16 = w7APNrr0aGRc(fArr2, 3, fArr, 3);
        fArr[0] = w7APNrr0aGRc;
        fArr[1] = w7APNrr0aGRc2;
        fArr[2] = w7APNrr0aGRc3;
        fArr[3] = w7APNrr0aGRc4;
        fArr[4] = w7APNrr0aGRc5;
        fArr[5] = w7APNrr0aGRc6;
        fArr[6] = w7APNrr0aGRc7;
        fArr[7] = w7APNrr0aGRc8;
        fArr[8] = w7APNrr0aGRc9;
        fArr[9] = w7APNrr0aGRc10;
        fArr[10] = w7APNrr0aGRc11;
        fArr[11] = w7APNrr0aGRc12;
        fArr[12] = w7APNrr0aGRc13;
        fArr[13] = w7APNrr0aGRc14;
        fArr[14] = w7APNrr0aGRc15;
        fArr[15] = w7APNrr0aGRc16;
    }

    public static final defpackage.vl0 WmetiUbpKU9I(defpackage.vl0 vl0Var, defpackage.cd1 cd1Var) {
        return defpackage.vx1.IJ0hOnjhPOri(vl0Var, 0.0f, 0.0f, cd1Var, 518143);
    }

    public static defpackage.vl0 XntWc4eZSQ8j(defpackage.zd0 zd0Var) {
        return zd0Var.fWTAfUmVKrZq(new defpackage.z7());
    }

    public static byte[] ZVVdXbWmyCSK(defpackage.wp[] wpVarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (defpackage.wp wpVar : wpVarArr) {
            i2 += ((((wpVar.QiMR8OkAhezm * 2) + 7) & (-8)) / 8) + (wpVar.WDYagTQQm9ns * 2) + oCu53ZX2v4Ju(wpVar.ZpBGe2uQfcn8, wpVar.giKS3J6vZuNy, bArr).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 16 + wpVar.oh71FJcDz6S2;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i2);
        if (java.util.Arrays.equals(bArr, defpackage.nn.h3m55N1URyyK)) {
            int length = wpVarArr.length;
            while (i < length) {
                defpackage.wp wpVar2 = wpVarArr[i];
                LCK4GGEwbWAr(byteArrayOutputStream, wpVar2, oCu53ZX2v4Ju(wpVar2.ZpBGe2uQfcn8, wpVar2.giKS3J6vZuNy, bArr));
                EgL5gQQnyJKX(byteArrayOutputStream, wpVar2);
                i++;
            }
        } else {
            for (defpackage.wp wpVar3 : wpVarArr) {
                LCK4GGEwbWAr(byteArrayOutputStream, wpVar3, oCu53ZX2v4Ju(wpVar3.ZpBGe2uQfcn8, wpVar3.giKS3J6vZuNy, bArr));
            }
            int length2 = wpVarArr.length;
            while (i < length2) {
                EgL5gQQnyJKX(byteArrayOutputStream, wpVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new java.lang.IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static final defpackage.gn0 blKFvluuDQOf(defpackage.mb1 mb1Var, defpackage.y10 y10Var) {
        android.os.Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            defpackage.jb1 ZpBGe2uQfcn82 = mb1Var.ZpBGe2uQfcn8();
            defpackage.jd0 jd0Var = ZpBGe2uQfcn82.fWTAfUmVKrZq;
            if (jd0Var.IBvW5fLsPuHy() && jd0Var.KrtOTfE6jiS2()) {
                defpackage.s31 QiMR8OkAhezm2 = ZpBGe2uQfcn82.QiMR8OkAhezm();
                defpackage.gn0 gn0Var = new defpackage.gn0(48);
                defpackage.k0 k0Var = new defpackage.k0(23, (byte) 0);
                k0Var.oCu53ZX2v4Ju(defpackage.wc1.PS16moFv2oLu(QiMR8OkAhezm2));
                jjTN4uUnoyEn(new defpackage.k0(23, (byte) 0), k0Var, y10Var, gn0Var, ZpBGe2uQfcn82, ZpBGe2uQfcn82);
                return gn0Var;
            }
            defpackage.gn0 gn0Var2 = defpackage.k90.ZpBGe2uQfcn8;
            gn0Var2.getClass();
            return gn0Var2;
        } finally {
            android.os.Trace.endSection();
        }
    }

    /* JADX WARN: Finally extract failed */
    public static boolean cCeDCHgnx5OL(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, defpackage.wp[] wpVarArr) {
        int i;
        long j;
        int length;
        byte[] bArr2 = defpackage.nn.T1fB7bDYiVJQ;
        byte[] bArr3 = defpackage.nn.gUjdnLbkVAaA;
        byte[] bArr4 = defpackage.nn.Ns0WNyEWdPsk;
        int i2 = 0;
        if (!java.util.Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = defpackage.nn.fNwYGHIYeJcR;
            if (java.util.Arrays.equals(bArr, bArr5)) {
                byte[] ZVVdXbWmyCSK = ZVVdXbWmyCSK(wpVarArr, bArr5);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, wpVarArr.length, 1);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, ZVVdXbWmyCSK.length, 4);
                byte[] BHfvd2J71qpO2 = defpackage.jr0.BHfvd2J71qpO(ZVVdXbWmyCSK);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, BHfvd2J71qpO2.length, 4);
                byteArrayOutputStream.write(BHfvd2J71qpO2);
                return true;
            }
            if (java.util.Arrays.equals(bArr, bArr3)) {
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, wpVarArr.length, 1);
                for (defpackage.wp wpVar : wpVarArr) {
                    int size = wpVar.e6mdH7fiFuta.size() * 4;
                    java.lang.String oCu53ZX2v4Ju = oCu53ZX2v4Ju(wpVar.ZpBGe2uQfcn8, wpVar.giKS3J6vZuNy, bArr3);
                    java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                    defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, oCu53ZX2v4Ju.getBytes(charset).length);
                    defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, wpVar.P05cfTpS5W5L.length);
                    defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, size, 4);
                    defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, wpVar.fWTAfUmVKrZq, 4);
                    byteArrayOutputStream.write(oCu53ZX2v4Ju.getBytes(charset));
                    java.util.Iterator it = wpVar.e6mdH7fiFuta.keySet().iterator();
                    while (it.hasNext()) {
                        defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, ((java.lang.Integer) it.next()).intValue());
                        defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, 0);
                    }
                    for (int i3 : wpVar.P05cfTpS5W5L) {
                        defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = defpackage.nn.h3m55N1URyyK;
            if (java.util.Arrays.equals(bArr, bArr6)) {
                byte[] ZVVdXbWmyCSK2 = ZVVdXbWmyCSK(wpVarArr, bArr6);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, wpVarArr.length, 1);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, ZVVdXbWmyCSK2.length, 4);
                byte[] BHfvd2J71qpO3 = defpackage.jr0.BHfvd2J71qpO(ZVVdXbWmyCSK2);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, BHfvd2J71qpO3.length, 4);
                byteArrayOutputStream.write(BHfvd2J71qpO3);
                return true;
            }
            if (!java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
            defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, wpVarArr.length);
            for (defpackage.wp wpVar2 : wpVarArr) {
                java.lang.String str = wpVar2.ZpBGe2uQfcn8;
                java.util.TreeMap treeMap = wpVar2.e6mdH7fiFuta;
                java.lang.String oCu53ZX2v4Ju2 = oCu53ZX2v4Ju(str, wpVar2.giKS3J6vZuNy, bArr2);
                java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.UTF_8;
                defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, oCu53ZX2v4Ju2.getBytes(charset2).length);
                defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, treeMap.size());
                defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, wpVar2.P05cfTpS5W5L.length);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, wpVar2.fWTAfUmVKrZq, 4);
                byteArrayOutputStream.write(oCu53ZX2v4Ju2.getBytes(charset2));
                java.util.Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, ((java.lang.Integer) it2.next()).intValue());
                }
                for (int i4 : wpVar2.P05cfTpS5W5L) {
                    defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        try {
            defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream2, wpVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (defpackage.wp wpVar3 : wpVarArr) {
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream2, wpVar3.fWTAfUmVKrZq, 4);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream2, wpVar3.JhCgjQRTAOCT, 4);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream2, wpVar3.QiMR8OkAhezm, 4);
                java.lang.String oCu53ZX2v4Ju3 = oCu53ZX2v4Ju(wpVar3.ZpBGe2uQfcn8, wpVar3.giKS3J6vZuNy, bArr4);
                java.nio.charset.Charset charset3 = java.nio.charset.StandardCharsets.UTF_8;
                int length2 = oCu53ZX2v4Ju3.getBytes(charset3).length;
                defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(oCu53ZX2v4Ju3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new java.lang.IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            defpackage.tx1 tx1Var = new defpackage.tx1(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(tx1Var);
            java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < wpVarArr.length) {
                try {
                    defpackage.wp wpVar4 = wpVarArr[i7];
                    defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream3, i7);
                    defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream3, wpVar4.WDYagTQQm9ns);
                    i8 = i8 + 4 + (wpVar4.WDYagTQQm9ns * i5);
                    int[] iArr = wpVar4.P05cfTpS5W5L;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (java.lang.Throwable th) {
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new java.lang.IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            defpackage.tx1 tx1Var2 = new defpackage.tx1(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(tx1Var2);
            byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < wpVarArr.length; i13++) {
                try {
                    defpackage.wp wpVar5 = wpVarArr[i13];
                    java.util.Iterator it3 = wpVar5.e6mdH7fiFuta.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((java.lang.Integer) ((java.util.Map.Entry) it3.next()).getValue()).intValue();
                    }
                    java.io.ByteArrayOutputStream byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                    try {
                        I5Vdbaz9SDkL(byteArrayOutputStream4, i14, wpVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                        try {
                            lXYSMswtzmix(byteArrayOutputStream4, wpVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i12 + 6;
                            defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream3, length4, 4);
                            defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream3, i14);
                            byteArrayOutputStream3.write(byteArray3);
                            byteArrayOutputStream3.write(byteArray4);
                            i12 = i15 + length4;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            }
            byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
            if (i12 != byteArray5.length) {
                throw new java.lang.IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray5.length);
            }
            defpackage.tx1 tx1Var3 = new defpackage.tx1(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(tx1Var3);
            long size2 = 12 + (arrayList.size() * 16);
            defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                defpackage.tx1 tx1Var4 = (defpackage.tx1) arrayList.get(i16);
                int i17 = tx1Var4.ZpBGe2uQfcn8;
                byte[] bArr7 = tx1Var4.giKS3J6vZuNy;
                if (i17 != 1) {
                    i = i11;
                    if (i17 == i) {
                        j = 1;
                    } else if (i17 == 3) {
                        j = 2;
                    } else if (i17 == 4) {
                        j = 3;
                    } else {
                        if (i17 != 5) {
                            throw null;
                        }
                        j = 4;
                    }
                } else {
                    i = i11;
                    j = 0;
                }
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, j, 4);
                defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, size2, 4);
                if (tx1Var4.fWTAfUmVKrZq) {
                    long length5 = bArr7.length;
                    byte[] BHfvd2J71qpO4 = defpackage.jr0.BHfvd2J71qpO(bArr7);
                    arrayList2.add(BHfvd2J71qpO4);
                    defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, BHfvd2J71qpO4.length, 4);
                    defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, length5, 4);
                    length = BHfvd2J71qpO4.length;
                } else {
                    arrayList2.add(bArr7);
                    defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, bArr7.length, 4);
                    defpackage.jr0.NkfcFfdaVTox(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += length;
                i16++;
                i11 = i;
            }
            for (int i18 = 0; i18 < arrayList2.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList2.get(i18));
            }
            return true;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayOutputStream2.close();
                throw th3;
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
                throw th3;
            }
        }
    }

    public static defpackage.hm dG7RjM6DqYVL(defpackage.hm hmVar, defpackage.im imVar) {
        imVar.getClass();
        if (defpackage.ma0.QiMR8OkAhezm(hmVar.getKey(), imVar)) {
            return hmVar;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e6mdH7fiFuta(int i, defpackage.e30 e30Var) {
        boolean z;
        boolean QiMR8OkAhezm2;
        java.lang.Object GcLuU6pT9wO9;
        java.lang.Object GcLuU6pT9wO92;
        defpackage.np0 np0Var;
        defpackage.e30 e30Var2 = e30Var;
        e30Var2.PS16moFv2oLu(-342950245);
        byte b = 0;
        int i2 = 1;
        if (e30Var2.zJPqDeoF0Os1(i & 1, i != 0)) {
            android.content.Context context = (android.content.Context) e30Var2.GE9mJIPrb8gP(defpackage.j0.giKS3J6vZuNy);
            java.lang.Object[] copyOf = java.util.Arrays.copyOf(new defpackage.yq0[0], 0);
            int i3 = 19;
            defpackage.n80 n80Var = new defpackage.n80(29, new defpackage.b7(i3, b), new defpackage.gc0(context, i2));
            boolean P05cfTpS5W5L2 = e30Var2.P05cfTpS5W5L(context);
            java.lang.Object GcLuU6pT9wO93 = e30Var2.GcLuU6pT9wO9();
            java.lang.Object obj = defpackage.cj.ZpBGe2uQfcn8;
            if (P05cfTpS5W5L2 || GcLuU6pT9wO93 == obj) {
                GcLuU6pT9wO93 = new defpackage.l3(i3, context);
                e30Var2.EgL5gQQnyJKX(GcLuU6pT9wO93);
            }
            defpackage.xp0 xp0Var = (defpackage.xp0) defpackage.v70.Mearx7yMn90V(copyOf, n80Var, (defpackage.n10) GcLuU6pT9wO93, e30Var2, 0, 4);
            defpackage.xo0 xo0Var = (defpackage.xo0) defpackage.w60.Ns0WNyEWdPsk(new defpackage.a31(xp0Var.giKS3J6vZuNy.dG7RjM6DqYVL), null, null, e30Var, 48, 2).getValue();
            if (xo0Var != null && (np0Var = xo0Var.oh71FJcDz6S2) != null) {
                int i4 = defpackage.np0.e6mdH7fiFuta;
                if (defpackage.b80.VFeft99leXEK(np0Var, defpackage.b41.ZpBGe2uQfcn8(defpackage.v50.class))) {
                    z = true;
                    QiMR8OkAhezm2 = e30Var.QiMR8OkAhezm(z) | e30Var.P05cfTpS5W5L(xp0Var);
                    GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                    if (!QiMR8OkAhezm2 || GcLuU6pT9wO9 == obj) {
                        GcLuU6pT9wO9 = new defpackage.bk(z, xp0Var, 4);
                        e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
                    }
                    WDYagTQQm9ns(false, (defpackage.n10) GcLuU6pT9wO9, e30Var, 0, 1);
                    defpackage.zw zwVar = defpackage.ce1.fWTAfUmVKrZq;
                    defpackage.gg ZpBGe2uQfcn82 = defpackage.eg.ZpBGe2uQfcn8(defpackage.vx1.giKS3J6vZuNy, defpackage.jVUAPb5NnIYW.s0TASMVLSWD5, e30Var, 0);
                    int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
                    defpackage.ay0 fNwYGHIYeJcR2 = e30Var.fNwYGHIYeJcR();
                    defpackage.vl0 oCu53ZX2v4Ju = defpackage.i61.oCu53ZX2v4Ju(e30Var, zwVar);
                    defpackage.wi.fWTAfUmVKrZq.getClass();
                    defpackage.pj pjVar = defpackage.vi.giKS3J6vZuNy;
                    e30Var.fhbmYuu9J3cT();
                    if (e30Var.Fu5WBEia9jBo) {
                        e30Var.lXYSMswtzmix();
                    } else {
                        e30Var.Ns0WNyEWdPsk(pjVar);
                    }
                    defpackage.h5 h5Var = defpackage.vi.oh71FJcDz6S2;
                    defpackage.t80.w6IV1lieBIux(h5Var, e30Var, ZpBGe2uQfcn82);
                    defpackage.h5 h5Var2 = defpackage.vi.WDYagTQQm9ns;
                    defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, fNwYGHIYeJcR2);
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
                    defpackage.h5 h5Var3 = defpackage.vi.QiMR8OkAhezm;
                    defpackage.t80.w6IV1lieBIux(h5Var3, e30Var, valueOf);
                    defpackage.n nVar = defpackage.vi.P05cfTpS5W5L;
                    defpackage.t80.Mearx7yMn90V(e30Var, nVar);
                    defpackage.h5 h5Var4 = defpackage.vi.JhCgjQRTAOCT;
                    defpackage.t80.w6IV1lieBIux(h5Var4, e30Var, oCu53ZX2v4Ju);
                    defpackage.zd0 zd0Var = new defpackage.zd0(1.0f, true);
                    defpackage.vk0 JhCgjQRTAOCT2 = defpackage.ab.JhCgjQRTAOCT(defpackage.jVUAPb5NnIYW.oh71FJcDz6S2, false);
                    int hashCode2 = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
                    defpackage.ay0 fNwYGHIYeJcR3 = e30Var.fNwYGHIYeJcR();
                    defpackage.vl0 oCu53ZX2v4Ju2 = defpackage.i61.oCu53ZX2v4Ju(e30Var, zd0Var);
                    e30Var.fhbmYuu9J3cT();
                    if (e30Var.Fu5WBEia9jBo) {
                        e30Var.lXYSMswtzmix();
                    } else {
                        e30Var.Ns0WNyEWdPsk(pjVar);
                    }
                    defpackage.t80.w6IV1lieBIux(h5Var, e30Var, JhCgjQRTAOCT2);
                    defpackage.t80.w6IV1lieBIux(h5Var2, e30Var, fNwYGHIYeJcR3);
                    defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode2, e30Var, h5Var3, e30Var, nVar);
                    defpackage.t80.w6IV1lieBIux(h5Var4, e30Var, oCu53ZX2v4Ju2);
                    defpackage.v50 v50Var = defpackage.v50.INSTANCE;
                    GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
                    if (GcLuU6pT9wO92 == obj) {
                        GcLuU6pT9wO92 = new defpackage.awuGf4qH8HFd(20);
                        e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
                    }
                    defpackage.m90.WDYagTQQm9ns(xp0Var, v50Var, zwVar, null, null, null, null, null, null, (defpackage.y10) GcLuU6pT9wO92, e30Var, 432);
                    e30Var2 = e30Var;
                    e30Var2.XntWc4eZSQ8j(true);
                    defpackage.wc1.oh71FJcDz6S2(xp0Var, e30Var2, 0);
                    e30Var2.XntWc4eZSQ8j(true);
                }
            }
            z = false;
            QiMR8OkAhezm2 = e30Var.QiMR8OkAhezm(z) | e30Var.P05cfTpS5W5L(xp0Var);
            GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (!QiMR8OkAhezm2) {
            }
            GcLuU6pT9wO9 = new defpackage.bk(z, xp0Var, 4);
            e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            WDYagTQQm9ns(false, (defpackage.n10) GcLuU6pT9wO9, e30Var, 0, 1);
            defpackage.zw zwVar2 = defpackage.ce1.fWTAfUmVKrZq;
            defpackage.gg ZpBGe2uQfcn822 = defpackage.eg.ZpBGe2uQfcn8(defpackage.vx1.giKS3J6vZuNy, defpackage.jVUAPb5NnIYW.s0TASMVLSWD5, e30Var, 0);
            int hashCode3 = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR22 = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju3 = defpackage.i61.oCu53ZX2v4Ju(e30Var, zwVar2);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.pj pjVar2 = defpackage.vi.giKS3J6vZuNy;
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
            }
            defpackage.h5 h5Var5 = defpackage.vi.oh71FJcDz6S2;
            defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, ZpBGe2uQfcn822);
            defpackage.h5 h5Var22 = defpackage.vi.WDYagTQQm9ns;
            defpackage.t80.w6IV1lieBIux(h5Var22, e30Var, fNwYGHIYeJcR22);
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(hashCode3);
            defpackage.h5 h5Var32 = defpackage.vi.QiMR8OkAhezm;
            defpackage.t80.w6IV1lieBIux(h5Var32, e30Var, valueOf2);
            defpackage.n nVar2 = defpackage.vi.P05cfTpS5W5L;
            defpackage.t80.Mearx7yMn90V(e30Var, nVar2);
            defpackage.h5 h5Var42 = defpackage.vi.JhCgjQRTAOCT;
            defpackage.t80.w6IV1lieBIux(h5Var42, e30Var, oCu53ZX2v4Ju3);
            defpackage.zd0 zd0Var2 = new defpackage.zd0(1.0f, true);
            defpackage.vk0 JhCgjQRTAOCT22 = defpackage.ab.JhCgjQRTAOCT(defpackage.jVUAPb5NnIYW.oh71FJcDz6S2, false);
            int hashCode22 = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.ay0 fNwYGHIYeJcR32 = e30Var.fNwYGHIYeJcR();
            defpackage.vl0 oCu53ZX2v4Ju22 = defpackage.i61.oCu53ZX2v4Ju(e30Var, zd0Var2);
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
            }
            defpackage.t80.w6IV1lieBIux(h5Var5, e30Var, JhCgjQRTAOCT22);
            defpackage.t80.w6IV1lieBIux(h5Var22, e30Var, fNwYGHIYeJcR32);
            defpackage.pVQOaWB9QMo4.XntWc4eZSQ8j(hashCode22, e30Var, h5Var32, e30Var, nVar2);
            defpackage.t80.w6IV1lieBIux(h5Var42, e30Var, oCu53ZX2v4Ju22);
            defpackage.v50 v50Var2 = defpackage.v50.INSTANCE;
            GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO92 == obj) {
            }
            defpackage.m90.WDYagTQQm9ns(xp0Var, v50Var2, zwVar2, null, null, null, null, null, null, (defpackage.y10) GcLuU6pT9wO92, e30Var, 432);
            e30Var2 = e30Var;
            e30Var2.XntWc4eZSQ8j(true);
            defpackage.wc1.oh71FJcDz6S2(xp0Var, e30Var2, 0);
            e30Var2.XntWc4eZSQ8j(true);
        } else {
            e30Var2.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var2.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.b7(i);
        }
    }

    public static final void fNwYGHIYeJcR(defpackage.vl0 vl0Var, defpackage.c20 c20Var, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(-1298353104);
        if ((i & 6) == 0) {
            i2 = (e30Var.oh71FJcDz6S2(vl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(c20Var) ? 32 : 16;
        }
        int i3 = 1;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.qh1(defpackage.jVUAPb5NnIYW.NkfcFfdaVTox);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            h3m55N1URyyK((defpackage.qh1) GcLuU6pT9wO9, vl0Var, c20Var, e30Var, (i2 << 3) & 1008);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.e1(vl0Var, c20Var, i, i3);
        }
    }

    public static final void fhbmYuu9J3cT(android.text.TextPaint textPaint, float f) {
        if (java.lang.Float.isNaN(f)) {
            return;
        }
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        textPaint.setAlpha(java.lang.Math.round(f * 255.0f));
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r3 = r3.getRoundedCorner(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static defpackage.o61 frSwwKIlbUhK(android.view.Display display, int i) {
        android.view.RoundedCorner roundedCorner;
        int position;
        int i2;
        int radius;
        android.graphics.Point center;
        if (android.os.Build.VERSION.SDK_INT < 31 || roundedCorner == null) {
            return null;
        }
        position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        defpackage.h7.w7APNrr0aGRc(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Invalid position: ", position));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        radius = roundedCorner.getRadius();
        center = roundedCorner.getCenter();
        return new defpackage.o61(i2, radius, center);
    }

    public static float gUjdnLbkVAaA(android.widget.EdgeEffect edgeEffect, float f, float f2, defpackage.hp hpVar) {
        float f3 = defpackage.qt.ZpBGe2uQfcn8;
        double giKS3J6vZuNy2 = hpVar.giKS3J6vZuNy() * 386.0878f * 160.0f * 0.84f;
        double d = defpackage.qt.ZpBGe2uQfcn8 * giKS3J6vZuNy2;
        float exp = (float) (java.lang.Math.exp((defpackage.qt.giKS3J6vZuNy / defpackage.qt.fWTAfUmVKrZq) * java.lang.Math.log((java.lang.Math.abs(f) * 0.35f) / d)) * d);
        int i = android.os.Build.VERSION.SDK_INT;
        if (exp > (i >= 31 ? defpackage.s6.fWTAfUmVKrZq(edgeEffect) : 0.0f) * f2) {
            return 0.0f;
        }
        int CZa7MwI9IzLd = defpackage.ok0.CZa7MwI9IzLd(f);
        if (i >= 31) {
            edgeEffect.onAbsorb(CZa7MwI9IzLd);
            return f;
        }
        if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(CZa7MwI9IzLd);
        }
        return f;
    }

    public static final void h3m55N1URyyK(defpackage.qh1 qh1Var, defpackage.vl0 vl0Var, defpackage.c20 c20Var, defpackage.e30 e30Var, int i) {
        int i2;
        e30Var.PS16moFv2oLu(-511989831);
        if ((i & 6) == 0) {
            i2 = (e30Var.P05cfTpS5W5L(qh1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(vl0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(c20Var) ? 256 : 128;
        }
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 147) != 146)) {
            int hashCode = java.lang.Long.hashCode(e30Var.CZa7MwI9IzLd);
            defpackage.c30 oCu53ZX2v4Ju = defpackage.la0.oCu53ZX2v4Ju(e30Var);
            defpackage.vl0 oCu53ZX2v4Ju2 = defpackage.i61.oCu53ZX2v4Ju(e30Var, vl0Var);
            defpackage.ay0 fNwYGHIYeJcR2 = e30Var.fNwYGHIYeJcR();
            defpackage.pj pjVar = defpackage.pj.T1fB7bDYiVJQ;
            e30Var.fhbmYuu9J3cT();
            if (e30Var.Fu5WBEia9jBo) {
                e30Var.Ns0WNyEWdPsk(pjVar);
            } else {
                e30Var.lXYSMswtzmix();
            }
            defpackage.t80.w6IV1lieBIux(qh1Var.fWTAfUmVKrZq, e30Var, qh1Var);
            defpackage.t80.w6IV1lieBIux(qh1Var.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju);
            defpackage.t80.w6IV1lieBIux(qh1Var.WDYagTQQm9ns, e30Var, c20Var);
            defpackage.wi.fWTAfUmVKrZq.getClass();
            defpackage.t80.w6IV1lieBIux(defpackage.vi.WDYagTQQm9ns, e30Var, fNwYGHIYeJcR2);
            defpackage.t80.Mearx7yMn90V(e30Var, defpackage.vi.P05cfTpS5W5L);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.JhCgjQRTAOCT, e30Var, oCu53ZX2v4Ju2);
            defpackage.t80.w6IV1lieBIux(defpackage.vi.QiMR8OkAhezm, e30Var, java.lang.Integer.valueOf(hashCode));
            e30Var.XntWc4eZSQ8j(true);
            if (e30Var.OcTWLQzke1i2()) {
                e30Var.NkfcFfdaVTox(-1259187287);
                e30Var.XntWc4eZSQ8j(false);
            } else {
                e30Var.NkfcFfdaVTox(-1259245908);
                boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(qh1Var);
                java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
                if (P05cfTpS5W5L2 || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                    GcLuU6pT9wO9 = new defpackage.w2(13, qh1Var);
                    e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
                }
                defpackage.nq1.WmetiUbpKU9I((defpackage.n10) GcLuU6pT9wO9, e30Var);
                e30Var.XntWc4eZSQ8j(false);
            }
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.b1(qh1Var, vl0Var, c20Var, i, 1);
        }
    }

    public static final boolean hH0RRJrNssvh(int i, int i2, long j) {
        int GE9mJIPrb8gP2 = defpackage.mk.GE9mJIPrb8gP(j);
        if (i > defpackage.mk.P05cfTpS5W5L(j) || GE9mJIPrb8gP2 > i) {
            return false;
        }
        return i2 <= defpackage.mk.QiMR8OkAhezm(j) && defpackage.mk.e6mdH7fiFuta(j) <= i2;
    }

    public static final void hwoZxnIesQBZ(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        defpackage.h80.fWTAfUmVKrZq("OffsetMapping.originalToTransformed returned invalid mapping: " + i3 + " -> " + i + " is not in range of transformed text [0, " + i2 + ']');
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ab, code lost:
    
        if (r5 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00bf, code lost:
    
        if (r0 != null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void jjTN4uUnoyEn(defpackage.k0 k0Var, defpackage.k0 k0Var2, defpackage.y10 y10Var, defpackage.gn0 gn0Var, defpackage.jb1 jb1Var, defpackage.jb1 jb1Var2) {
        boolean z;
        defpackage.s31 w7APNrr0aGRc;
        defpackage.gn0 gn0Var2 = gn0Var;
        defpackage.jb1 jb1Var3 = jb1Var;
        int i = jb1Var3.oh71FJcDz6S2;
        android.graphics.Region region = (android.graphics.Region) k0Var.oh71FJcDz6S2;
        defpackage.k0 k0Var3 = k0Var2;
        android.graphics.Region region2 = (android.graphics.Region) k0Var3.oh71FJcDz6S2;
        defpackage.jd0 jd0Var = jb1Var2.fWTAfUmVKrZq;
        defpackage.fb1 fb1Var = jb1Var2.JhCgjQRTAOCT;
        defpackage.jd0 jd0Var2 = jb1Var2.fWTAfUmVKrZq;
        int i2 = jb1Var2.oh71FJcDz6S2;
        boolean z2 = (jd0Var.IBvW5fLsPuHy() && jd0Var2.KrtOTfE6jiS2()) ? false : true;
        if (region2.isEmpty() && i2 != i) {
            return;
        }
        if (z2 && !jb1Var2.T1fB7bDYiVJQ()) {
            return;
        }
        defpackage.q90 PS16moFv2oLu = defpackage.wc1.PS16moFv2oLu(jb1Var2.h3m55N1URyyK());
        k0Var.oCu53ZX2v4Ju(PS16moFv2oLu);
        if (i2 == i) {
            i2 = -1;
        }
        if (!region.op(region2, android.graphics.Region.Op.INTERSECT)) {
            if (jb1Var2.T1fB7bDYiVJQ()) {
                qjMheFZ0l9kA(gn0Var, jb1Var, jb1Var2);
                return;
            } else {
                if (i2 == -1) {
                    android.graphics.Rect bounds = region.getBounds();
                    gn0Var2.P05cfTpS5W5L(i2, new defpackage.lb1(jb1Var2, new defpackage.q90(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                    return;
                }
                return;
            }
        }
        android.graphics.Rect bounds2 = region.getBounds();
        gn0Var2.P05cfTpS5W5L(i2, new defpackage.lb1(jb1Var2, new defpackage.q90(bounds2.left, bounds2.top, bounds2.right, bounds2.bottom)));
        java.util.List GE9mJIPrb8gP2 = defpackage.jb1.GE9mJIPrb8gP(4, jb1Var2);
        if (fb1Var.QiMR8OkAhezm) {
            defpackage.jb1 fNwYGHIYeJcR2 = jb1Var2.fNwYGHIYeJcR();
            while (true) {
                if (fNwYGHIYeJcR2 == null) {
                    fNwYGHIYeJcR2 = null;
                    break;
                }
                defpackage.yn0 yn0Var = fNwYGHIYeJcR2.JhCgjQRTAOCT.WDYagTQQm9ns;
                if (yn0Var.fWTAfUmVKrZq(defpackage.nb1.IJ0hOnjhPOri) || yn0Var.fWTAfUmVKrZq(defpackage.nb1.maCixPsq4ml2)) {
                    break;
                } else {
                    fNwYGHIYeJcR2 = fNwYGHIYeJcR2.fNwYGHIYeJcR();
                }
            }
            if (fNwYGHIYeJcR2 != null) {
                defpackage.sr0 JhCgjQRTAOCT2 = jb1Var2.JhCgjQRTAOCT();
                if (JhCgjQRTAOCT2 != null) {
                    if (!JhCgjQRTAOCT2.vgZvSmsixr00().s0TASMVLSWD5) {
                        JhCgjQRTAOCT2 = null;
                    }
                }
                JhCgjQRTAOCT2 = null;
                defpackage.sr0 JhCgjQRTAOCT3 = fNwYGHIYeJcR2.JhCgjQRTAOCT();
                if (JhCgjQRTAOCT3 != null) {
                    if (!JhCgjQRTAOCT3.vgZvSmsixr00().s0TASMVLSWD5) {
                        JhCgjQRTAOCT3 = null;
                    }
                }
                JhCgjQRTAOCT3 = null;
                if (JhCgjQRTAOCT2 != null && JhCgjQRTAOCT3 != null) {
                    defpackage.s31 hH0RRJrNssvh = JhCgjQRTAOCT3.hH0RRJrNssvh(JhCgjQRTAOCT2, false);
                    z = !hH0RRJrNssvh.equals(hH0RRJrNssvh.WDYagTQQm9ns(defpackage.n70.oh71FJcDz6S2(0L, defpackage.w60.EPEWHACkMcF1(JhCgjQRTAOCT3.QiMR8OkAhezm))));
                    if (z) {
                        defpackage.k0 k0Var4 = new defpackage.k0(23, (byte) 0);
                        defpackage.wo oh71FJcDz6S22 = jb1Var2.oh71FJcDz6S2();
                        if (oh71FJcDz6S22 == null) {
                            defpackage.l80 l80Var = jd0Var2.IBvW5fLsPuHy.fWTAfUmVKrZq;
                            w7APNrr0aGRc = defpackage.wc1.UmgHb6n58gfG(l80Var).hH0RRJrNssvh(l80Var, false);
                        } else {
                            defpackage.ul0 ul0Var = ((defpackage.ul0) oh71FJcDz6S22).WDYagTQQm9ns;
                            java.lang.Object QiMR8OkAhezm2 = fb1Var.WDYagTQQm9ns.QiMR8OkAhezm(defpackage.eb1.giKS3J6vZuNy);
                            w7APNrr0aGRc = defpackage.wc1.w7APNrr0aGRc(ul0Var, (QiMR8OkAhezm2 == null ? null : QiMR8OkAhezm2) != null, false);
                        }
                        k0Var4.oCu53ZX2v4Ju(defpackage.wc1.PS16moFv2oLu(w7APNrr0aGRc));
                        int size = GE9mJIPrb8gP2.size() - 1;
                        while (-1 < size) {
                            if (!((java.lang.Boolean) y10Var.P05cfTpS5W5L(GE9mJIPrb8gP2.get(size))).booleanValue()) {
                                UmgHb6n58gfG(new defpackage.k0(23, (byte) 0), k0Var4, y10Var, gn0Var2, jb1Var3, (defpackage.jb1) GE9mJIPrb8gP2.get(size));
                            }
                            size--;
                            gn0Var2 = gn0Var;
                            jb1Var3 = jb1Var;
                        }
                        if (BXaznwstz2U0(jb1Var2)) {
                            return;
                        }
                        region2.op(PS16moFv2oLu.ZpBGe2uQfcn8, PS16moFv2oLu.giKS3J6vZuNy, PS16moFv2oLu.fWTAfUmVKrZq, PS16moFv2oLu.JhCgjQRTAOCT, android.graphics.Region.Op.DIFFERENCE);
                        return;
                    }
                }
            }
            z = false;
            if (z) {
            }
        }
        defpackage.y10 y10Var2 = y10Var;
        int size2 = GE9mJIPrb8gP2.size() - 1;
        while (-1 < size2) {
            if (!((java.lang.Boolean) y10Var2.P05cfTpS5W5L(GE9mJIPrb8gP2.get(size2))).booleanValue()) {
                jjTN4uUnoyEn(k0Var, k0Var3, y10Var2, gn0Var, jb1Var, (defpackage.jb1) GE9mJIPrb8gP2.get(size2));
            }
            size2--;
            k0Var3 = k0Var2;
            y10Var2 = y10Var;
        }
        if (BXaznwstz2U0(jb1Var2)) {
        }
    }

    public static void lXYSMswtzmix(java.io.ByteArrayOutputStream byteArrayOutputStream, defpackage.wp wpVar) {
        int i = 0;
        for (java.util.Map.Entry entry : wpVar.e6mdH7fiFuta.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            if ((((java.lang.Integer) entry.getValue()).intValue() & 1) != 0) {
                defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, intValue - i);
                defpackage.jr0.PS16moFv2oLu(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static final void m6iZQUu7XjoL(int i, int i2, int i3) {
        boolean z = false;
        if (i >= 0 && i <= i2) {
            z = true;
        }
        if (z) {
            return;
        }
        defpackage.h80.fWTAfUmVKrZq("OffsetMapping.transformedToOriginal returned invalid mapping: " + i3 + " -> " + i + " is not in range of original text [0, " + i2 + ']');
    }

    public static final defpackage.ap1 maCixPsq4ml2(defpackage.p81 p81Var, defpackage.l6 l6Var) {
        p81Var.getClass();
        int length = l6Var.oh71FJcDz6S2.length();
        int length2 = l6Var.oh71FJcDz6S2.length();
        int min = java.lang.Math.min(length, 100);
        for (int i = 0; i < min; i++) {
            hwoZxnIesQBZ(i, length2, i);
        }
        hwoZxnIesQBZ(length, length2, length);
        int min2 = java.lang.Math.min(length2, 100);
        for (int i2 = 0; i2 < min2; i2++) {
            m6iZQUu7XjoL(i2, length, i2);
        }
        m6iZQUu7XjoL(length2, length, length2);
        return new defpackage.ap1(l6Var, new defpackage.iq0(l6Var.oh71FJcDz6S2.length(), l6Var.oh71FJcDz6S2.length()));
    }

    public static java.lang.String oCu53ZX2v4Ju(java.lang.String str, java.lang.String str2, byte[] bArr) {
        byte[] bArr2 = defpackage.nn.gUjdnLbkVAaA;
        byte[] bArr3 = defpackage.nn.T1fB7bDYiVJQ;
        java.lang.String str3 = (java.util.Arrays.equals(bArr, bArr3) || java.util.Arrays.equals(bArr, bArr2)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(str3)) {
                return str2.replace(":", "!");
            }
            if (":".equals(str3)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(str3)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(str3)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                java.lang.StringBuilder sb = new java.lang.StringBuilder();
                sb.append(str);
                sb.append((java.util.Arrays.equals(bArr, bArr3) || java.util.Arrays.equals(bArr, bArr2)) ? ":" : "!");
                sb.append(str2);
                return sb.toString();
            }
        }
        return str2;
    }

    public static final void oh71FJcDz6S2(defpackage.vl0 vl0Var, defpackage.y10 y10Var, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(-932836462);
        int i2 = (e30Var.P05cfTpS5W5L(y10Var) ? 32 : 16) | i;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            defpackage.b80.fWTAfUmVKrZq(e30Var, defpackage.i61.s0TASMVLSWD5(vl0Var, y10Var));
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.yh0(i, 3, vl0Var, y10Var);
        }
    }

    public static final defpackage.ay0 omM9cAlgeGXx(defpackage.v21[] v21VarArr, defpackage.ay0 ay0Var, defpackage.ay0 ay0Var2) {
        defpackage.zx0 zx0Var = new defpackage.zx0(defpackage.ay0.P05cfTpS5W5L);
        for (defpackage.v21 v21Var : v21VarArr) {
            defpackage.t21 t21Var = v21Var.ZpBGe2uQfcn8;
            if (v21Var.oh71FJcDz6S2 || !ay0Var.containsKey(t21Var)) {
                zx0Var.put(t21Var, t21Var.fWTAfUmVKrZq(v21Var, (defpackage.vs1) ay0Var2.get(t21Var)));
            }
        }
        return zx0Var.ZpBGe2uQfcn8();
    }

    public static final void qjMheFZ0l9kA(defpackage.gn0 gn0Var, defpackage.jb1 jb1Var, defpackage.jb1 jb1Var2) {
        defpackage.jd0 jd0Var;
        defpackage.jb1 fNwYGHIYeJcR2 = jb1Var2.fNwYGHIYeJcR();
        defpackage.s31 QiMR8OkAhezm2 = (fNwYGHIYeJcR2 == null || (jd0Var = fNwYGHIYeJcR2.fWTAfUmVKrZq) == null || !jd0Var.IBvW5fLsPuHy()) ? T1fB7bDYiVJQ : fNwYGHIYeJcR2.QiMR8OkAhezm();
        int i = jb1Var2.oh71FJcDz6S2;
        if (i == jb1Var.oh71FJcDz6S2) {
            i = -1;
        }
        gn0Var.P05cfTpS5W5L(i, new defpackage.lb1(jb1Var2, defpackage.wc1.PS16moFv2oLu(QiMR8OkAhezm2)));
    }

    public static final defpackage.vl0 s0TASMVLSWD5(defpackage.vl0 vl0Var) {
        return defpackage.vx1.IJ0hOnjhPOri(vl0Var, 0.0f, 0.0f, null, 520191);
    }

    public static final float w7APNrr0aGRc(float[] fArr, int i, float[] fArr2, int i2) {
        int i3 = i * 4;
        return (fArr[i3 + 3] * fArr2[12 + i2]) + (fArr[i3 + 2] * fArr2[8 + i2]) + (fArr[i3 + 1] * fArr2[4 + i2]) + (fArr[i3] * fArr2[i2]);
    }

    public static defpackage.jm xahdJg25P1Bv(defpackage.hm hmVar, defpackage.im imVar) {
        imVar.getClass();
        return defpackage.ma0.QiMR8OkAhezm(hmVar.getKey(), imVar) ? defpackage.xu.WDYagTQQm9ns : hmVar;
    }

    public static defpackage.wp[] z16KqenTjq8o(java.io.ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, defpackage.wp[] wpVarArr) {
        defpackage.wp wpVar;
        if (byteArrayInputStream.available() == 0) {
            return new defpackage.wp[0];
        }
        if (i != wpVarArr.length) {
            defpackage.h7.P05cfTpS5W5L("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
            java.lang.String str = new java.lang.String(defpackage.jr0.Wc0TdmRSwbbi(byteArrayInputStream, (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2)), java.nio.charset.StandardCharsets.UTF_8);
            long Jkfc0NcwyPL8 = defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 4);
            int Jkfc0NcwyPL82 = (int) defpackage.jr0.Jkfc0NcwyPL8(byteArrayInputStream, 2);
            if (wpVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                java.lang.String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < wpVarArr.length; i3++) {
                    if (wpVarArr[i3].giKS3J6vZuNy.equals(substring)) {
                        wpVar = wpVarArr[i3];
                        break;
                    }
                }
            }
            wpVar = null;
            if (wpVar == null) {
                defpackage.h7.P05cfTpS5W5L("Missing profile key: ".concat(str));
                return null;
            }
            wpVar.JhCgjQRTAOCT = Jkfc0NcwyPL8;
            int[] Fu5WBEia9jBo = Fu5WBEia9jBo(byteArrayInputStream, Jkfc0NcwyPL82);
            if (java.util.Arrays.equals(bArr, defpackage.nn.T1fB7bDYiVJQ)) {
                wpVar.WDYagTQQm9ns = Jkfc0NcwyPL82;
                wpVar.P05cfTpS5W5L = Fu5WBEia9jBo;
            }
        }
        return wpVarArr;
    }

    public static defpackage.jm zJPqDeoF0Os1(defpackage.hm hmVar, defpackage.jm jmVar) {
        jmVar.getClass();
        return jmVar == defpackage.xu.WDYagTQQm9ns ? hmVar : (defpackage.jm) jmVar.BHfvd2J71qpO(new defpackage.b7(11, (byte) 0), hmVar);
    }

    @Override // defpackage.la1
    public int JhCgjQRTAOCT(int i) {
        int OVwOqzUGHcCU = OVwOqzUGHcCU(i);
        if (OVwOqzUGHcCU == -1 || OVwOqzUGHcCU(OVwOqzUGHcCU) == -1) {
            return -1;
        }
        return OVwOqzUGHcCU;
    }

    public abstract int OVwOqzUGHcCU(int i);

    @Override // defpackage.la1
    public int ZpBGe2uQfcn8(int i) {
        return OVwOqzUGHcCU(i);
    }

    @Override // defpackage.la1
    public int fWTAfUmVKrZq(int i) {
        int w6IV1lieBIux = w6IV1lieBIux(i);
        if (w6IV1lieBIux == -1 || w6IV1lieBIux(w6IV1lieBIux) == -1) {
            return -1;
        }
        return w6IV1lieBIux;
    }

    @Override // defpackage.la1
    public int giKS3J6vZuNy(int i) {
        return w6IV1lieBIux(i);
    }

    public abstract int w6IV1lieBIux(int i);
}
