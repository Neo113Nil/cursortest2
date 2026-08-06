package defpackage;

/* loaded from: classes.dex */
public abstract /* synthetic */ class s21 {
    public static final float JlrlGoKF = 32.0f;
    public static final long SH1y5HwkJhh = Long.MIN_VALUE;
    public static final /* synthetic */ int ez2rX8ReCYw = 0;
    public static final float[] IHQe1A4L2xu = new float[91];
    public static final defpackage.sf oh6vYeIP = new defpackage.sf(-1242955591, new defpackage.k3hcgHS3MP(2), false);
    public static final int[] r1MBDhnF = new int[0];
    public static final long[] F7NU4MC0GW = new long[0];
    public static final java.lang.Object[] adDC3e2L = new java.lang.Object[0];
    public static final defpackage.iq xiZrDbcSW0 = new defpackage.iq();
    public static final byte[] AARZUJiTa = {112, 114, 111, 0};
    public static final byte[] EXtogiMhuM = {112, 114, 109, 0};
    public static final defpackage.ng1 riuEU0zW4 = new defpackage.ng1(0, new long[0], new java.lang.Object[0]);

    public static final void AARZUJiTa(defpackage.k00 k00Var, defpackage.t10 t10Var, java.lang.Object obj) {
        defpackage.lj ljVar = t10Var.WLpAkxCo;
        boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(obj);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        if (xiZrDbcSW02 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
            mAr5m2L7gYDP = new defpackage.r90(ljVar, k00Var);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
    }

    public static defpackage.bo[] AQHddgaEX(java.io.FileInputStream fileInputStream, byte[] bArr, java.lang.String str) {
        if (!java.util.Arrays.equals(bArr, defpackage.mj1.SyNS6RMn)) {
            defpackage.db.AARZUJiTa("Unsupported version");
            return null;
        }
        int UsuH8pd5P = (int) defpackage.gq1.UsuH8pd5P(fileInputStream, 1);
        byte[] C0U8sNJm = defpackage.gq1.C0U8sNJm(fileInputStream, (int) defpackage.gq1.UsuH8pd5P(fileInputStream, 4), (int) defpackage.gq1.UsuH8pd5P(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            defpackage.db.AARZUJiTa("Content found after the end of file");
            return null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(C0U8sNJm);
        try {
            defpackage.bo[] CGXpA9s3RjIa = CGXpA9s3RjIa(byteArrayInputStream, str, UsuH8pd5P);
            byteArrayInputStream.close();
            return CGXpA9s3RjIa;
        } catch (java.lang.Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (java.lang.Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static int[] AsxAYCCkb3Hi(java.io.ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
            iArr[i3] = i2;
        }
        return iArr;
    }

    public static final defpackage.lj C0U8sNJm(defpackage.lj ljVar, defpackage.lj ljVar2, boolean z) {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        int i = 11;
        byte b = 0;
        boolean booleanValue = ((java.lang.Boolean) ljVar.EgCjBq0SZwJ(new defpackage.e6(i, b), bool)).booleanValue();
        boolean booleanValue2 = ((java.lang.Boolean) ljVar2.EgCjBq0SZwJ(new defpackage.e6(i, b), bool)).booleanValue();
        if (!booleanValue && !booleanValue2) {
            return ljVar.JlrlGoKF(ljVar2);
        }
        defpackage.e6 e6Var = new defpackage.e6(9, b);
        defpackage.lt ltVar = defpackage.lt.adDC3e2L;
        defpackage.lj ljVar3 = (defpackage.lj) ljVar.EgCjBq0SZwJ(e6Var, ltVar);
        java.lang.Object obj = ljVar2;
        if (booleanValue2) {
            obj = ljVar2.EgCjBq0SZwJ(new defpackage.e6(10, b), ltVar);
        }
        return ljVar3.JlrlGoKF((defpackage.lj) obj);
    }

    public static defpackage.bo[] CGXpA9s3RjIa(java.io.ByteArrayInputStream byteArrayInputStream, java.lang.String str, int i) {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new defpackage.bo[0];
        }
        defpackage.bo[] boVarArr = new defpackage.bo[i];
        for (int i3 = 0; i3 < i; i3++) {
            int UsuH8pd5P = (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
            int UsuH8pd5P2 = (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
            boVarArr[i3] = new defpackage.bo(str, new java.lang.String(defpackage.gq1.QQUzIjv3iOC5(byteArrayInputStream, UsuH8pd5P), java.nio.charset.StandardCharsets.UTF_8), defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 4), UsuH8pd5P2, (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 4), (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 4), new int[UsuH8pd5P2], new java.util.TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            defpackage.bo boVar = boVarArr[i4];
            int available = byteArrayInputStream.available();
            int i5 = boVar.xiZrDbcSW0;
            int i6 = boVar.AARZUJiTa;
            java.util.TreeMap treeMap = boVar.riuEU0zW4;
            int i7 = available - i5;
            int i8 = i2;
            while (byteArrayInputStream.available() > i7) {
                i8 += (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
                treeMap.put(java.lang.Integer.valueOf(i8), 1);
                int UsuH8pd5P3 = (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
                while (UsuH8pd5P3 > 0) {
                    defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
                    int UsuH8pd5P4 = (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 1);
                    if (UsuH8pd5P4 != 6 && UsuH8pd5P4 != 7) {
                        while (UsuH8pd5P4 > 0) {
                            defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 1);
                            int i9 = i2;
                            int i10 = i4;
                            for (int UsuH8pd5P5 = (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 1); UsuH8pd5P5 > 0; UsuH8pd5P5--) {
                                defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
                            }
                            UsuH8pd5P4--;
                            i2 = i9;
                            i4 = i10;
                        }
                    }
                    UsuH8pd5P3--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i11 = i2;
            int i12 = i4;
            if (byteArrayInputStream.available() != i7) {
                defpackage.db.AARZUJiTa("Read too much data during profile line parse");
                return null;
            }
            boVar.EXtogiMhuM = AsxAYCCkb3Hi(byteArrayInputStream, boVar.adDC3e2L);
            java.util.BitSet valueOf = java.util.BitSet.valueOf(defpackage.gq1.QQUzIjv3iOC5(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
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
        return boVarArr;
    }

    public static final android.graphics.Paint D2vUnMij(defpackage.r2 r2Var) {
        if (r2Var == null) {
            defpackage.w50.IHQe1A4L2xu("Extracting native reference is only supported from androidx.compose.ui.graphics.AndroidPaint instances but received " + defpackage.sz0.IHQe1A4L2xu(r2Var.getClass()).oh6vYeIP());
        }
        return (android.graphics.Paint) r2Var.oh6vYeIP;
    }

    public static final void DFo87pBq1E5(defpackage.vz vzVar, defpackage.t10 t10Var) {
        defpackage.is0 is0Var = t10Var.hyxIchWRW.oh6vYeIP.C0U8sNJm;
        is0Var.p4kuH6PDtgom(defpackage.yr0.r1MBDhnF);
        defpackage.c80.SiPhmbmu(is0Var, 0, vzVar);
    }

    public static final void EXtogiMhuM(java.lang.Object obj, java.lang.Object obj2, defpackage.k00 k00Var, defpackage.t10 t10Var) {
        defpackage.lj ljVar = t10Var.WLpAkxCo;
        boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(obj) | t10Var.xiZrDbcSW0(obj2);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        if (xiZrDbcSW02 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
            mAr5m2L7gYDP = new defpackage.r90(ljVar, k00Var);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
    }

    public static final void F7NU4MC0GW(defpackage.qn0 qn0Var, defpackage.s30 s30Var, defpackage.t10 t10Var, int i) {
        defpackage.s30 s30Var2;
        qn0Var.getClass();
        t10Var.QUKZkWRtw6(-751461361);
        int i2 = (t10Var.EXtogiMhuM(qn0Var) ? 4 : 2) | i | 16;
        int i3 = 0;
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
            t10Var.Ye0N2xE9Hc();
            if ((i & 1) == 0 || t10Var.NHJTzaLwkd()) {
                t10Var.RmCzwkUxICV(1890788296);
                defpackage.cn1 IHQe1A4L2xu2 = defpackage.df0.IHQe1A4L2xu(t10Var);
                if (IHQe1A4L2xu2 == null) {
                    defpackage.db.AARZUJiTa("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                defpackage.w30 G3OKOH3wZRC = defpackage.w70.G3OKOH3wZRC(IHQe1A4L2xu2, t10Var);
                t10Var.RmCzwkUxICV(1729797275);
                defpackage.vm1 v5iciZok = defpackage.l80.v5iciZok(defpackage.s30.class, IHQe1A4L2xu2, G3OKOH3wZRC, IHQe1A4L2xu2 instanceof defpackage.h30 ? ((defpackage.h30) IHQe1A4L2xu2).xiZrDbcSW0() : defpackage.dk.oh6vYeIP, t10Var);
                t10Var.QoRHpC4k(false);
                t10Var.QoRHpC4k(false);
                s30Var2 = (defpackage.s30) v5iciZok;
            } else {
                t10Var.WLpAkxCo();
                s30Var2 = s30Var;
            }
            t10Var.G3OKOH3wZRC();
            defpackage.sl0 PAEGRtP0bX = defpackage.mj1.PAEGRtP0bX(s30Var2.F7NU4MC0GW, t10Var);
            defpackage.tb tbVar = s30Var2.xiZrDbcSW0;
            boolean EXtogiMhuM2 = t10Var.EXtogiMhuM(qn0Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
            if (EXtogiMhuM2 || mAr5m2L7gYDP == ad1Var) {
                mAr5m2L7gYDP = new defpackage.o30(qn0Var, null, i3);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.x80.IHQe1A4L2xu(tbVar, (defpackage.k00) mAr5m2L7gYDP, t10Var, 0);
            defpackage.r30 r30Var = (defpackage.r30) PAEGRtP0bX.getValue();
            boolean EXtogiMhuM3 = t10Var.EXtogiMhuM(s30Var2);
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM3 || mAr5m2L7gYDP2 == ad1Var) {
                defpackage.xiZrDbcSW0 xizrdbcsw0 = new defpackage.xiZrDbcSW0(1, s30Var2, defpackage.s30.class, "onEvent", "onEvent(Lcom/corsair/ledger/presentation/haul/HaulEvent;)V", 0, 0, 3);
                t10Var.OtkytngK3Mr(xizrdbcsw0);
                mAr5m2L7gYDP2 = xizrdbcsw0;
            }
            xiZrDbcSW0(r30Var, (defpackage.g00) ((defpackage.v00) mAr5m2L7gYDP2), t10Var, 0);
        } else {
            t10Var.WLpAkxCo();
            s30Var2 = s30Var;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.oKqPTyA2(i, 5, qn0Var, s30Var2);
        }
    }

    public static void FyULxpbU8bu(java.io.ByteArrayOutputStream byteArrayOutputStream, int i, defpackage.bo boVar) {
        int i2 = boVar.AARZUJiTa;
        byte[] bArr = new byte[(((java.lang.Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (java.util.Map.Entry entry : boVar.riuEU0zW4.entrySet()) {
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

    public static final int G3OKOH3wZRC(int[] iArr, int i, int i2) {
        iArr.getClass();
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void IHQe1A4L2xu(defpackage.mj0 mj0Var, defpackage.g00 g00Var, defpackage.t10 t10Var, int i) {
        int i2;
        t10Var.QUKZkWRtw6(-932836462);
        if ((i & 6) == 0) {
            i2 = (t10Var.xiZrDbcSW0(mj0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (t10Var.EXtogiMhuM(g00Var) ? 32 : 16);
        int i4 = 1;
        if (t10Var.lpprD5VAS(i3 & 1, (i3 & 19) != 18)) {
            defpackage.mj0 kNAkVymC = defpackage.ci0.kNAkVymC(mj0Var, g00Var);
            defpackage.w1 w1Var = defpackage.w1.xiZrDbcSW0;
            int hashCode = java.lang.Long.hashCode(t10Var.Ye0N2xE9Hc);
            defpackage.mj0 yIx6ChFVk = yIx6ChFVk(t10Var, kNAkVymC);
            defpackage.gu0 JlrlGoKF2 = t10Var.JlrlGoKF();
            defpackage.vg.r1MBDhnF.getClass();
            defpackage.oh ohVar = defpackage.ug.oh6vYeIP;
            t10Var.AQHddgaEX();
            if (t10Var.QPwENk36pDC) {
                t10Var.ez2rX8ReCYw(ohVar);
            } else {
                t10Var.NWDBeGGF();
            }
            defpackage.f70.UsuH8pd5P(defpackage.ug.xiZrDbcSW0, t10Var, w1Var);
            defpackage.f70.UsuH8pd5P(defpackage.ug.adDC3e2L, t10Var, JlrlGoKF2);
            defpackage.f70.PAEGRtP0bX(t10Var, defpackage.ug.EXtogiMhuM);
            defpackage.f70.UsuH8pd5P(defpackage.ug.F7NU4MC0GW, t10Var, yIx6ChFVk);
            defpackage.f70.kd6TUFXn(t10Var, java.lang.Integer.valueOf(hashCode), defpackage.ug.AARZUJiTa);
            t10Var.QoRHpC4k(true);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.KaQkzhFJpl(i, i4, mj0Var, g00Var);
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static java.lang.String JcqDrWrgMf(java.lang.String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final defpackage.r2 JlrlGoKF() {
        return new defpackage.r2(new android.graphics.Paint(7));
    }

    public static final defpackage.uj NHJTzaLwkd(defpackage.t10 t10Var) {
        return new defpackage.z01(t10Var.WLpAkxCo);
    }

    public static void NWDBeGGF(java.io.ByteArrayOutputStream byteArrayOutputStream, defpackage.bo boVar, java.lang.String str) {
        java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
        defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, str.getBytes(charset).length);
        defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, boVar.adDC3e2L);
        defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, boVar.xiZrDbcSW0, 4);
        defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, boVar.r1MBDhnF, 4);
        defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, boVar.AARZUJiTa, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static final defpackage.lk1 OtkytngK3Mr(defpackage.ej ejVar, defpackage.lj ljVar, java.lang.Object obj) {
        defpackage.lk1 lk1Var = null;
        if ((ejVar instanceof defpackage.wj) && ljVar.cnag84Bm(defpackage.gb.EXtogiMhuM) != null) {
            defpackage.wj wjVar = (defpackage.wj) ejVar;
            while (true) {
                if ((wjVar instanceof defpackage.xp) || (wjVar = wjVar.r1MBDhnF()) == null) {
                    break;
                }
                if (wjVar instanceof defpackage.lk1) {
                    lk1Var = (defpackage.lk1) wjVar;
                    break;
                }
            }
            if (lk1Var != null) {
                lk1Var.JX5fKip1C6(ljVar, obj);
            }
        }
        return lk1Var;
    }

    public static final boolean PAEGRtP0bX(defpackage.gy gyVar, boolean z) {
        int ordinal = gyVar.fzubgBFo().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                defpackage.gy nBH8hAHy = defpackage.mj1.nBH8hAHy(gyVar);
                if (!(nBH8hAHy != null ? PAEGRtP0bX(nBH8hAHy, z) : true)) {
                    return false;
                }
                gyVar.H6IrRhrpWoH(defpackage.fy.xiZrDbcSW0, defpackage.fy.AARZUJiTa);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                defpackage.db.F7NU4MC0GW();
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object QPwENk36pDC(defpackage.ej ejVar, defpackage.g00 g00Var, defpackage.q21 q21Var, boolean z, boolean z2) {
        defpackage.qk qkVar;
        int i;
        boolean z3;
        defpackage.g00 g00Var2;
        defpackage.q21 q21Var2;
        boolean z4;
        if (ejVar instanceof defpackage.qk) {
            qkVar = (defpackage.qk) ejVar;
            int i2 = qkVar.DFo87pBq1E5;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qkVar.DFo87pBq1E5 = i2 - Integer.MIN_VALUE;
                defpackage.qk qkVar2 = qkVar;
                java.lang.Object obj = qkVar2.JlrlGoKF;
                i = qkVar2.DFo87pBq1E5;
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    if (q21Var.riuEU0zW4() && q21Var.ez2rX8ReCYw() && q21Var.SH1y5HwkJhh()) {
                        defpackage.sk skVar = new defpackage.sk(null, g00Var, q21Var, z2, z);
                        qkVar2.DFo87pBq1E5 = 1;
                        java.lang.Object JlrlGoKF2 = q21Var.JlrlGoKF(z, skVar, qkVar2);
                        if (JlrlGoKF2 != vjVar) {
                            return JlrlGoKF2;
                        }
                    } else {
                        z3 = z2;
                        qkVar2.EXtogiMhuM = q21Var;
                        qkVar2.riuEU0zW4 = g00Var;
                        qkVar2.SH1y5HwkJhh = z;
                        qkVar2.ez2rX8ReCYw = z3;
                        qkVar2.DFo87pBq1E5 = 2;
                        defpackage.lj v5iciZok = v5iciZok(q21Var, z3, qkVar2);
                        if (v5iciZok != vjVar) {
                            g00Var2 = g00Var;
                            q21Var2 = q21Var;
                            obj = v5iciZok;
                            z4 = z;
                        }
                    }
                }
                if (i == 1) {
                    defpackage.f70.nBH8hAHy(obj);
                    return obj;
                }
                if (i != 2) {
                    if (i == 3) {
                        defpackage.f70.nBH8hAHy(obj);
                        return obj;
                    }
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z3 = qkVar2.ez2rX8ReCYw;
                boolean z5 = qkVar2.SH1y5HwkJhh;
                defpackage.g00 g00Var3 = qkVar2.riuEU0zW4;
                defpackage.q21 q21Var3 = qkVar2.EXtogiMhuM;
                defpackage.f70.nBH8hAHy(obj);
                z4 = z5;
                g00Var2 = g00Var3;
                q21Var2 = q21Var3;
                defpackage.pk pkVar = new defpackage.pk(null, g00Var2, q21Var2, z4, z3);
                qkVar2.EXtogiMhuM = null;
                qkVar2.riuEU0zW4 = null;
                qkVar2.DFo87pBq1E5 = 3;
                java.lang.Object QPwENk36pDC = defpackage.fm.QPwENk36pDC((defpackage.lj) obj, pkVar, qkVar2);
                return QPwENk36pDC != vjVar ? vjVar : QPwENk36pDC;
            }
        }
        qkVar = new defpackage.qk(ejVar);
        defpackage.qk qkVar22 = qkVar;
        java.lang.Object obj2 = qkVar22.JlrlGoKF;
        i = qkVar22.DFo87pBq1E5;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        if (i != 0) {
        }
        defpackage.pk pkVar2 = new defpackage.pk(null, g00Var2, q21Var2, z4, z3);
        qkVar22.EXtogiMhuM = null;
        qkVar22.riuEU0zW4 = null;
        qkVar22.DFo87pBq1E5 = 3;
        java.lang.Object QPwENk36pDC2 = defpackage.fm.QPwENk36pDC((defpackage.lj) obj2, pkVar2, qkVar22);
        if (QPwENk36pDC2 != vjVar2) {
        }
    }

    public static byte[] QQUzIjv3iOC5(defpackage.bo[] boVarArr, byte[] bArr) {
        int i = 0;
        int i2 = 0;
        for (defpackage.bo boVar : boVarArr) {
            i2 += ((((boVar.AARZUJiTa * 2) + 7) & (-8)) / 8) + (boVar.adDC3e2L * 2) + nBH8hAHy(boVar.IHQe1A4L2xu, boVar.oh6vYeIP, bArr).getBytes(java.nio.charset.StandardCharsets.UTF_8).length + 16 + boVar.xiZrDbcSW0;
        }
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream(i2);
        if (java.util.Arrays.equals(bArr, defpackage.mj1.cnag84Bm)) {
            int length = boVarArr.length;
            while (i < length) {
                defpackage.bo boVar2 = boVarArr[i];
                NWDBeGGF(byteArrayOutputStream, boVar2, nBH8hAHy(boVar2.IHQe1A4L2xu, boVar2.oh6vYeIP, bArr));
                cSNyPqwud(byteArrayOutputStream, boVar2);
                i++;
            }
        } else {
            for (defpackage.bo boVar3 : boVarArr) {
                NWDBeGGF(byteArrayOutputStream, boVar3, nBH8hAHy(boVar3.IHQe1A4L2xu, boVar3.oh6vYeIP, bArr));
            }
            int length2 = boVarArr.length;
            while (i < length2) {
                cSNyPqwud(byteArrayOutputStream, boVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == i2) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new java.lang.IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i2);
    }

    public static defpackage.bo[] QUKZkWRtw6(java.io.ByteArrayInputStream byteArrayInputStream, int i, defpackage.bo[] boVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new defpackage.bo[0];
        }
        if (i != boVarArr.length) {
            defpackage.db.AARZUJiTa("Mismatched number of dex files found in metadata");
            return null;
        }
        java.lang.String[] strArr = new java.lang.String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int UsuH8pd5P = (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
            iArr[i2] = (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
            strArr[i2] = new java.lang.String(defpackage.gq1.QQUzIjv3iOC5(byteArrayInputStream, UsuH8pd5P), java.nio.charset.StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            defpackage.bo boVar = boVarArr[i3];
            if (!boVar.oh6vYeIP.equals(strArr[i3])) {
                defpackage.db.AARZUJiTa("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            boVar.adDC3e2L = i4;
            boVar.EXtogiMhuM = AsxAYCCkb3Hi(byteArrayInputStream, i4);
        }
        return boVarArr;
    }

    public static final void QoRHpC4k(defpackage.dOmtpLcqqI1y domtplcqqi1y, defpackage.f71 f71Var) {
        defpackage.b71 b71Var = f71Var.F7NU4MC0GW;
        defpackage.nl0 nl0Var = b71Var.adDC3e2L;
        java.lang.Object AARZUJiTa2 = b71Var.adDC3e2L.AARZUJiTa(defpackage.j71.NHJTzaLwkd);
        if (AARZUJiTa2 == null) {
            AARZUJiTa2 = null;
        }
        defpackage.l21 l21Var = (defpackage.l21) AARZUJiTa2;
        if (defpackage.mj1.cnag84Bm(f71Var)) {
            if (l21Var != null && l21Var.IHQe1A4L2xu == 8) {
                return;
            }
            java.lang.Object AARZUJiTa3 = nl0Var.AARZUJiTa(defpackage.a71.abhbClRa);
            if (AARZUJiTa3 == null) {
                AARZUJiTa3 = null;
            }
            defpackage.TFRaUu83X3E tFRaUu83X3E = (defpackage.TFRaUu83X3E) AARZUJiTa3;
            if (tFRaUu83X3E != null) {
                domtplcqqi1y.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(null, android.R.id.accessibilityActionPageUp, tFRaUu83X3E.IHQe1A4L2xu, null));
            }
            java.lang.Object AARZUJiTa4 = nl0Var.AARZUJiTa(defpackage.a71.QQUzIjv3iOC5);
            if (AARZUJiTa4 == null) {
                AARZUJiTa4 = null;
            }
            defpackage.TFRaUu83X3E tFRaUu83X3E2 = (defpackage.TFRaUu83X3E) AARZUJiTa4;
            if (tFRaUu83X3E2 != null) {
                domtplcqqi1y.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(null, android.R.id.accessibilityActionPageDown, tFRaUu83X3E2.IHQe1A4L2xu, null));
            }
            java.lang.Object AARZUJiTa5 = nl0Var.AARZUJiTa(defpackage.a71.NHJTzaLwkd);
            if (AARZUJiTa5 == null) {
                AARZUJiTa5 = null;
            }
            defpackage.TFRaUu83X3E tFRaUu83X3E3 = (defpackage.TFRaUu83X3E) AARZUJiTa5;
            if (tFRaUu83X3E3 != null) {
                domtplcqqi1y.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(null, android.R.id.accessibilityActionPageLeft, tFRaUu83X3E3.IHQe1A4L2xu, null));
            }
            java.lang.Object AARZUJiTa6 = nl0Var.AARZUJiTa(defpackage.a71.C0U8sNJm);
            if (AARZUJiTa6 == null) {
                AARZUJiTa6 = null;
            }
            defpackage.TFRaUu83X3E tFRaUu83X3E4 = (defpackage.TFRaUu83X3E) AARZUJiTa6;
            if (tFRaUu83X3E4 != null) {
                domtplcqqi1y.IHQe1A4L2xu(new defpackage.d6FAb9xVJ8GU(null, android.R.id.accessibilityActionPageRight, tFRaUu83X3E4.IHQe1A4L2xu, null));
            }
        }
    }

    public static defpackage.bo[] RmCzwkUxICV(java.io.FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, defpackage.bo[] boVarArr) {
        byte[] bArr3 = defpackage.mj1.kd6TUFXn;
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            if (!java.util.Arrays.equals(bArr, defpackage.mj1.EgCjBq0SZwJ)) {
                defpackage.db.AARZUJiTa("Unsupported meta version");
                return null;
            }
            int UsuH8pd5P = (int) defpackage.gq1.UsuH8pd5P(fileInputStream, 2);
            byte[] C0U8sNJm = defpackage.gq1.C0U8sNJm(fileInputStream, (int) defpackage.gq1.UsuH8pd5P(fileInputStream, 4), (int) defpackage.gq1.UsuH8pd5P(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                defpackage.db.AARZUJiTa("Content found after the end of file");
                return null;
            }
            java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(C0U8sNJm);
            try {
                defpackage.bo[] nVhUznk1t = nVhUznk1t(byteArrayInputStream, bArr2, UsuH8pd5P, boVarArr);
                byteArrayInputStream.close();
                return nVhUznk1t;
            } catch (java.lang.Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (java.util.Arrays.equals(defpackage.mj1.DFo87pBq1E5, bArr2)) {
            defpackage.db.AARZUJiTa("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!java.util.Arrays.equals(bArr, bArr3)) {
            defpackage.db.AARZUJiTa("Unsupported meta version");
            return null;
        }
        int UsuH8pd5P2 = (int) defpackage.gq1.UsuH8pd5P(fileInputStream, 1);
        byte[] C0U8sNJm2 = defpackage.gq1.C0U8sNJm(fileInputStream, (int) defpackage.gq1.UsuH8pd5P(fileInputStream, 4), (int) defpackage.gq1.UsuH8pd5P(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            defpackage.db.AARZUJiTa("Content found after the end of file");
            return null;
        }
        java.io.ByteArrayInputStream byteArrayInputStream2 = new java.io.ByteArrayInputStream(C0U8sNJm2);
        try {
            defpackage.bo[] QUKZkWRtw6 = QUKZkWRtw6(byteArrayInputStream2, UsuH8pd5P2, boVarArr);
            byteArrayInputStream2.close();
            return QUKZkWRtw6;
        } catch (java.lang.Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (java.lang.Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static final defpackage.ct0 SH1y5HwkJhh(float f, float f2, float f3, float f4) {
        return new defpackage.ct0(f, f2, f3, f4);
    }

    public static final defpackage.mj0 SiPhmbmu(defpackage.mj0 mj0Var, defpackage.pc0 pc0Var, defpackage.gc0 gc0Var, defpackage.ks0 ks0Var, boolean z) {
        return mj0Var.r1MBDhnF(new defpackage.hc0(pc0Var, gc0Var, ks0Var, z));
    }

    public static final void SyNS6RMn(java.lang.String str, java.lang.String str2, defpackage.t10 t10Var, int i) {
        java.lang.String str3 = str2;
        defpackage.t10 t10Var2 = t10Var;
        t10Var2.QUKZkWRtw6(-1256213261);
        int i2 = i | (t10Var2.xiZrDbcSW0(str3) ? 32 : 16);
        if (t10Var2.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
            defpackage.ov ovVar = defpackage.ba1.IHQe1A4L2xu;
            defpackage.e31 IHQe1A4L2xu2 = defpackage.d31.IHQe1A4L2xu(defpackage.mj1.F7NU4MC0GW, defpackage.n.cnag84Bm, t10Var2, 6);
            int hashCode = java.lang.Long.hashCode(t10Var2.Ye0N2xE9Hc);
            defpackage.gu0 JlrlGoKF2 = t10Var2.JlrlGoKF();
            defpackage.mj0 yIx6ChFVk = yIx6ChFVk(t10Var2, ovVar);
            defpackage.vg.r1MBDhnF.getClass();
            defpackage.oh ohVar = defpackage.ug.oh6vYeIP;
            t10Var2.AQHddgaEX();
            if (t10Var2.QPwENk36pDC) {
                t10Var2.ez2rX8ReCYw(ohVar);
            } else {
                t10Var2.NWDBeGGF();
            }
            defpackage.f70.UsuH8pd5P(defpackage.ug.xiZrDbcSW0, t10Var2, IHQe1A4L2xu2);
            defpackage.f70.UsuH8pd5P(defpackage.ug.adDC3e2L, t10Var2, JlrlGoKF2);
            defpackage.f70.kd6TUFXn(t10Var2, java.lang.Integer.valueOf(hashCode), defpackage.ug.AARZUJiTa);
            defpackage.f70.PAEGRtP0bX(t10Var2, defpackage.ug.EXtogiMhuM);
            defpackage.f70.UsuH8pd5P(defpackage.ug.F7NU4MC0GW, t10Var2, yIx6ChFVk);
            defpackage.nc1 nc1Var = defpackage.dk1.IHQe1A4L2xu;
            defpackage.dg1 dg1Var = ((defpackage.bk1) t10Var2.SH1y5HwkJhh(nc1Var)).SH1y5HwkJhh;
            defpackage.nc1 nc1Var2 = defpackage.he.IHQe1A4L2xu;
            defpackage.of1.oh6vYeIP(str, null, ((defpackage.fe) t10Var2.SH1y5HwkJhh(nc1Var2)).EgCjBq0SZwJ, 0L, 0L, null, 0L, 0, false, 0, 0, dg1Var, t10Var2, 6, 0, 131066);
            str3 = str2;
            defpackage.of1.oh6vYeIP(str3, null, ((defpackage.fe) t10Var2.SH1y5HwkJhh(nc1Var2)).IHQe1A4L2xu, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var2.SH1y5HwkJhh(nc1Var)).EXtogiMhuM, t10Var, (i2 >> 3) & 14, 0, 131066);
            t10Var2 = t10Var;
            t10Var2.QoRHpC4k(true);
        } else {
            t10Var2.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var2.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.m30(i, 0, str, str3);
        }
    }

    public static final defpackage.nk TFRaUu83X3E(defpackage.gy gyVar) {
        if (!gyVar.kNAkVymC) {
            gyVar.kNAkVymC = true;
            try {
                defpackage.dy pm90rNzI5F = gyVar.pm90rNzI5F();
                defpackage.cy cyVar = (defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(gyVar)).getFocusOwner();
                defpackage.gy xiZrDbcSW02 = cyVar.xiZrDbcSW0();
                pm90rNzI5F.SH1y5HwkJhh.getClass();
                defpackage.gy xiZrDbcSW03 = cyVar.xiZrDbcSW0();
                if (xiZrDbcSW02 != xiZrDbcSW03 && xiZrDbcSW03 != null) {
                    return defpackage.ey.F7NU4MC0GW == defpackage.ey.r1MBDhnF ? defpackage.nk.xiZrDbcSW0 : defpackage.nk.AARZUJiTa;
                }
            } finally {
                gyVar.kNAkVymC = false;
            }
        }
        return defpackage.nk.adDC3e2L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List] */
    public static java.util.List UsuH8pd5P(defpackage.o80 o80Var, long j) {
        defpackage.eq1 IHQe1A4L2xu2 = defpackage.l80.IHQe1A4L2xu(j);
        java.util.ArrayList arrayList = new java.util.ArrayList(16);
        for (int i = 0; i < 5; i++) {
            defpackage.o01 o01Var = o80Var.F7NU4MC0GW;
            com.corsair.ledger.domain.model.Rarity Ye0N2xE9Hc = Ye0N2xE9Hc(IHQe1A4L2xu2);
            java.util.List list = defpackage.d01.IHQe1A4L2xu;
            Ye0N2xE9Hc.getClass();
            java.util.List list2 = (java.util.List) defpackage.yh0.p4kuH6PDtgom(o01Var, defpackage.d01.r1MBDhnF);
            ?? arrayList2 = new java.util.ArrayList();
            for (java.lang.Object obj : list2) {
                if (((defpackage.a01) obj).F7NU4MC0GW == Ye0N2xE9Hc) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                arrayList2 = (java.util.List) defpackage.yh0.p4kuH6PDtgom(o01Var, defpackage.d01.r1MBDhnF);
            }
            arrayList.add(new defpackage.wo(((defpackage.a01) arrayList2.get(IHQe1A4L2xu2.r1MBDhnF(0, arrayList2.size()))).IHQe1A4L2xu));
        }
        int i2 = o80Var.ez2rX8ReCYw;
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(new defpackage.uo(IHQe1A4L2xu2.r1MBDhnF(o80Var.EXtogiMhuM, o80Var.riuEU0zW4 + 1)));
        }
        for (int i4 = 0; i4 < 3; i4++) {
            arrayList.add(new defpackage.xo(Ye0N2xE9Hc(IHQe1A4L2xu2), o80Var.SH1y5HwkJhh));
        }
        int i5 = o80Var.JlrlGoKF;
        for (int i6 = 0; i6 < i5; i6++) {
            arrayList.add(defpackage.to.IHQe1A4L2xu);
        }
        while (arrayList.size() < 16) {
            arrayList.add(defpackage.vo.IHQe1A4L2xu);
        }
        if (arrayList.size() == 16) {
            java.util.List Ay906ovssqgN = defpackage.td.Ay906ovssqgN(arrayList);
            java.util.ArrayList arrayList3 = (java.util.ArrayList) Ay906ovssqgN;
            for (int size = arrayList3.size() - 1; size > 0; size--) {
                int r1MBDhnF2 = IHQe1A4L2xu2.r1MBDhnF(0, size + 1);
                arrayList3.set(r1MBDhnF2, arrayList3.set(size, arrayList3.get(r1MBDhnF2)));
            }
            return Ay906ovssqgN;
        }
        throw new java.lang.IllegalStateException(("Island " + o80Var.IHQe1A4L2xu + " defines " + arrayList.size() + " cells, expected 16").toString());
    }

    public static final defpackage.mj0 Uv8CGu3G(defpackage.mj0 mj0Var, float f, float f2) {
        return mj0Var.r1MBDhnF(new defpackage.ys0(f, f2, f, f2));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static java.lang.String V7bD7b8KA(java.lang.String str) {
        int hashCode = str.hashCode();
        switch (hashCode) {
            case -2061550653:
                if (str.equals("kotlin.jvm.internal.DoubleCompanionObject")) {
                    return "kotlin.Double.Companion";
                }
                return null;
            case -2056817302:
                if (str.equals("java.lang.Integer")) {
                    return "kotlin.Int";
                }
                return null;
            case -2034166429:
                if (str.equals("java.lang.Cloneable")) {
                    return "kotlin.Cloneable";
                }
                return null;
            case -1979556166:
                if (str.equals("java.lang.annotation.Annotation")) {
                    return "kotlin.Annotation";
                }
                return null;
            case -1571515090:
                if (str.equals("java.lang.Comparable")) {
                    return "kotlin.Comparable";
                }
                return null;
            case -1383349348:
                if (str.equals("java.util.Map")) {
                    return "kotlin.collections.Map";
                }
                return null;
            case -1383343454:
                if (str.equals("java.util.Set")) {
                    return "kotlin.collections.Set";
                }
                return null;
            case -1325958191:
                if (str.equals("double")) {
                    return "kotlin.Double";
                }
                return null;
            case -1182275604:
                if (str.equals("kotlin.jvm.internal.ByteCompanionObject")) {
                    return "kotlin.Byte.Companion";
                }
                return null;
            case -1062240117:
                if (str.equals("java.lang.CharSequence")) {
                    return "kotlin.CharSequence";
                }
                return null;
            case -688322466:
                if (str.equals("java.util.Collection")) {
                    return "kotlin.collections.Collection";
                }
                return null;
            case -527879800:
                if (str.equals("java.lang.Float")) {
                    return "kotlin.Float";
                }
                return null;
            case -515992664:
                if (str.equals("java.lang.Short")) {
                    return "kotlin.Short";
                }
                return null;
            case -246476834:
                if (str.equals("kotlin.jvm.internal.CharCompanionObject")) {
                    return "kotlin.Char.Companion";
                }
                return null;
            case -207262728:
                if (str.equals("kotlin.jvm.internal.LongCompanionObject")) {
                    return "kotlin.Long.Companion";
                }
                return null;
            case -165139126:
                if (str.equals("java.util.Map$Entry")) {
                    return "kotlin.collections.Map.Entry";
                }
                return null;
            case 104431:
                if (str.equals("int")) {
                    return "kotlin.Int";
                }
                return null;
            case 3039496:
                if (str.equals("byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 3052374:
                if (str.equals("char")) {
                    return "kotlin.Char";
                }
                return null;
            case 3327612:
                if (str.equals("long")) {
                    return "kotlin.Long";
                }
                return null;
            case 64711720:
                if (str.equals("boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 65821278:
                if (str.equals("java.util.List")) {
                    return "kotlin.collections.List";
                }
                return null;
            case 77230534:
                if (str.equals("kotlin.jvm.internal.ShortCompanionObject")) {
                    return "kotlin.Short.Companion";
                }
                return null;
            case 97526364:
                if (str.equals("float")) {
                    return "kotlin.Float";
                }
                return null;
            case 109413500:
                if (str.equals("short")) {
                    return "kotlin.Short";
                }
                return null;
            case 155276373:
                if (str.equals("java.lang.Character")) {
                    return "kotlin.Char";
                }
                return null;
            case 226173651:
                if (str.equals("kotlin.jvm.internal.EnumCompanionObject")) {
                    return "kotlin.Enum.Companion";
                }
                return null;
            case 344809556:
                if (str.equals("java.lang.Boolean")) {
                    return "kotlin.Boolean";
                }
                return null;
            case 398507100:
                if (str.equals("java.lang.Byte")) {
                    return "kotlin.Byte";
                }
                return null;
            case 398585941:
                if (str.equals("java.lang.Enum")) {
                    return "kotlin.Enum";
                }
                return null;
            case 398795216:
                if (str.equals("java.lang.Long")) {
                    return "kotlin.Long";
                }
                return null;
            case 482629606:
                if (str.equals("kotlin.jvm.internal.FloatCompanionObject")) {
                    return "kotlin.Float.Companion";
                }
                return null;
            case 499831342:
                if (str.equals("java.util.Iterator")) {
                    return "kotlin.collections.Iterator";
                }
                return null;
            case 577341676:
                if (str.equals("java.util.ListIterator")) {
                    return "kotlin.collections.ListIterator";
                }
                return null;
            case 599019395:
                if (str.equals("kotlin.jvm.internal.StringCompanionObject")) {
                    return "kotlin.String.Companion";
                }
                return null;
            case 761287205:
                if (str.equals("java.lang.Double")) {
                    return "kotlin.Double";
                }
                return null;
            case 1052881309:
                if (str.equals("java.lang.Number")) {
                    return "kotlin.Number";
                }
                return null;
            case 1063877011:
                if (str.equals("java.lang.Object")) {
                    return "kotlin.Any";
                }
                return null;
            case 1195259493:
                if (str.equals("java.lang.String")) {
                    return "kotlin.String";
                }
                return null;
            case 1275614662:
                if (str.equals("java.lang.Iterable")) {
                    return "kotlin.collections.Iterable";
                }
                return null;
            case 1383693018:
                if (str.equals("kotlin.jvm.internal.BooleanCompanionObject")) {
                    return "kotlin.Boolean.Companion";
                }
                return null;
            case 1630335596:
                if (str.equals("java.lang.Throwable")) {
                    return "kotlin.Throwable";
                }
                return null;
            case 1877171123:
                if (str.equals("kotlin.jvm.internal.IntCompanionObject")) {
                    return "kotlin.Int.Companion";
                }
                return null;
            default:
                switch (hashCode) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (hashCode) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (hashCode) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final defpackage.nk WLpAkxCo(defpackage.gy gyVar) {
        defpackage.lj0 lj0Var;
        defpackage.ep0 ep0Var;
        int ordinal = gyVar.fzubgBFo().ordinal();
        defpackage.nk nkVar = defpackage.nk.adDC3e2L;
        if (ordinal != 0) {
            if (ordinal == 1) {
                defpackage.gy nBH8hAHy = defpackage.mj1.nBH8hAHy(gyVar);
                if (nBH8hAHy != null) {
                    return hkbnNdmy(nBH8hAHy);
                }
                defpackage.db.fnWB2E7cs("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    defpackage.db.F7NU4MC0GW();
                    return null;
                }
                if (!gyVar.adDC3e2L.kd6TUFXn) {
                    defpackage.x50.oh6vYeIP("visitAncestors called on an unattached node");
                }
                defpackage.lj0 lj0Var2 = gyVar.adDC3e2L.riuEU0zW4;
                defpackage.ma0 D2vUnMij = defpackage.w70.D2vUnMij(gyVar);
                loop0: while (true) {
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
                                        int i = 0;
                                        for (defpackage.lj0 lj0Var3 = ((defpackage.ln) lj0Var).fnWB2E7cs; lj0Var3 != null; lj0Var3 = lj0Var3.SH1y5HwkJhh) {
                                            if ((lj0Var3.AARZUJiTa & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
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
                                        if (i == 1) {
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
                if (gyVar2 == null) {
                    return nkVar;
                }
                int ordinal2 = gyVar2.fzubgBFo().ordinal();
                if (ordinal2 == 0) {
                    return TFRaUu83X3E(gyVar2);
                }
                if (ordinal2 == 1) {
                    return WLpAkxCo(gyVar2);
                }
                if (ordinal2 == 2) {
                    return defpackage.nk.xiZrDbcSW0;
                }
                if (ordinal2 != 3) {
                    defpackage.db.F7NU4MC0GW();
                    return null;
                }
                defpackage.nk WLpAkxCo = WLpAkxCo(gyVar2);
                defpackage.nk nkVar2 = WLpAkxCo != nkVar ? WLpAkxCo : null;
                return nkVar2 == null ? TFRaUu83X3E(gyVar2) : nkVar2;
            }
        }
        return nkVar;
    }

    public static com.corsair.ledger.domain.model.Rarity Ye0N2xE9Hc(defpackage.eq1 eq1Var) {
        java.util.Iterator<E> it = com.corsair.ledger.domain.model.Rarity.oh6vYeIP().iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            i2 += ((com.corsair.ledger.domain.model.Rarity) it.next()).F7NU4MC0GW();
        }
        int r1MBDhnF2 = eq1Var.r1MBDhnF(0, i2);
        defpackage.abhbClRa abhbclra = (defpackage.abhbClRa) com.corsair.ledger.domain.model.Rarity.oh6vYeIP();
        abhbclra.getClass();
        defpackage.kNAkVymC knakvymc = new defpackage.kNAkVymC(i, abhbclra);
        while (knakvymc.hasNext()) {
            com.corsair.ledger.domain.model.Rarity rarity = (com.corsair.ledger.domain.model.Rarity) knakvymc.next();
            r1MBDhnF2 -= rarity.F7NU4MC0GW();
            if (r1MBDhnF2 < 0) {
                return rarity;
            }
        }
        return com.corsair.ledger.domain.model.Rarity.COMMON;
    }

    public static int abhbClRa(java.lang.Comparable comparable, java.lang.Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static final void adDC3e2L(defpackage.j30 j30Var, defpackage.t10 t10Var, int i) {
        defpackage.g4 g4Var;
        defpackage.jj0 jj0Var;
        boolean z;
        defpackage.j30 j30Var2 = j30Var;
        defpackage.t10 t10Var2 = t10Var;
        defpackage.c8 c8Var = defpackage.n.G3OKOH3wZRC;
        defpackage.f6 f6Var = defpackage.mj1.oh6vYeIP;
        t10Var2.QUKZkWRtw6(-268714717);
        int i2 = i | (t10Var2.xiZrDbcSW0(j30Var2) ? 4 : 2);
        byte b = 0;
        if (t10Var2.lpprD5VAS(i2 & 1, (i2 & 3) != 2)) {
            defpackage.ov ovVar = defpackage.ba1.IHQe1A4L2xu;
            defpackage.e31 IHQe1A4L2xu2 = defpackage.d31.IHQe1A4L2xu(new defpackage.i6(12.0f, true, new defpackage.e6(b, b)), defpackage.n.QoRHpC4k, t10Var2, 54);
            int hashCode = java.lang.Long.hashCode(t10Var2.Ye0N2xE9Hc);
            defpackage.gu0 JlrlGoKF2 = t10Var2.JlrlGoKF();
            defpackage.mj0 yIx6ChFVk = yIx6ChFVk(t10Var2, ovVar);
            defpackage.vg.r1MBDhnF.getClass();
            defpackage.oh ohVar = defpackage.ug.oh6vYeIP;
            t10Var2.AQHddgaEX();
            if (t10Var2.QPwENk36pDC) {
                t10Var2.ez2rX8ReCYw(ohVar);
            } else {
                t10Var2.NWDBeGGF();
            }
            defpackage.g4 g4Var2 = defpackage.ug.xiZrDbcSW0;
            defpackage.f70.UsuH8pd5P(g4Var2, t10Var2, IHQe1A4L2xu2);
            defpackage.g4 g4Var3 = defpackage.ug.adDC3e2L;
            defpackage.f70.UsuH8pd5P(g4Var3, t10Var2, JlrlGoKF2);
            java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode);
            defpackage.g4 g4Var4 = defpackage.ug.AARZUJiTa;
            defpackage.f70.kd6TUFXn(t10Var2, valueOf, g4Var4);
            defpackage.q0 q0Var = defpackage.ug.EXtogiMhuM;
            defpackage.f70.PAEGRtP0bX(t10Var2, q0Var);
            defpackage.g4 g4Var5 = defpackage.ug.F7NU4MC0GW;
            defpackage.f70.UsuH8pd5P(g4Var5, t10Var2, yIx6ChFVk);
            defpackage.a01 a01Var = j30Var2.F7NU4MC0GW;
            defpackage.jj0 jj0Var2 = defpackage.jj0.IHQe1A4L2xu;
            if (a01Var != null) {
                t10Var2.AsxAYCCkb3Hi(-1619417491);
                g4Var = g4Var5;
                jj0Var = jj0Var2;
                defpackage.s70.r1MBDhnF(j30Var2.F7NU4MC0GW, defpackage.ba1.r1MBDhnF(jj0Var2, 44.0f), false, t10Var2, 48, 4);
                t10Var2.QoRHpC4k(false);
                z = true;
            } else {
                g4Var = g4Var5;
                jj0Var = jj0Var2;
                t10Var2.AsxAYCCkb3Hi(-1619326847);
                defpackage.mj0 r1MBDhnF2 = defpackage.ba1.r1MBDhnF(jj0Var, 44.0f);
                defpackage.pe IHQe1A4L2xu3 = defpackage.ne.IHQe1A4L2xu(f6Var, c8Var, t10Var2, 0);
                int hashCode2 = java.lang.Long.hashCode(t10Var2.Ye0N2xE9Hc);
                defpackage.gu0 JlrlGoKF3 = t10Var2.JlrlGoKF();
                defpackage.mj0 yIx6ChFVk2 = yIx6ChFVk(t10Var2, r1MBDhnF2);
                t10Var2.AQHddgaEX();
                if (t10Var2.QPwENk36pDC) {
                    t10Var2.ez2rX8ReCYw(ohVar);
                } else {
                    t10Var2.NWDBeGGF();
                }
                defpackage.f70.UsuH8pd5P(g4Var2, t10Var2, IHQe1A4L2xu3);
                defpackage.f70.UsuH8pd5P(g4Var3, t10Var2, JlrlGoKF3);
                defpackage.f70.kd6TUFXn(t10Var2, java.lang.Integer.valueOf(hashCode2), g4Var4);
                defpackage.f70.PAEGRtP0bX(t10Var2, q0Var);
                defpackage.f70.UsuH8pd5P(g4Var, t10Var2, yIx6ChFVk2);
                z = true;
                t10Var2.QoRHpC4k(true);
                t10Var2.QoRHpC4k(false);
            }
            defpackage.pe IHQe1A4L2xu4 = defpackage.ne.IHQe1A4L2xu(f6Var, c8Var, t10Var2, 0);
            int hashCode3 = java.lang.Long.hashCode(t10Var2.Ye0N2xE9Hc);
            defpackage.gu0 JlrlGoKF4 = t10Var2.JlrlGoKF();
            defpackage.mj0 yIx6ChFVk3 = yIx6ChFVk(t10Var2, jj0Var);
            t10Var2.AQHddgaEX();
            if (t10Var2.QPwENk36pDC) {
                t10Var2.ez2rX8ReCYw(ohVar);
            } else {
                t10Var2.NWDBeGGF();
            }
            defpackage.f70.UsuH8pd5P(g4Var2, t10Var2, IHQe1A4L2xu4);
            defpackage.f70.UsuH8pd5P(g4Var3, t10Var2, JlrlGoKF4);
            defpackage.f70.kd6TUFXn(t10Var2, java.lang.Integer.valueOf(hashCode3), g4Var4);
            defpackage.f70.PAEGRtP0bX(t10Var2, q0Var);
            defpackage.f70.UsuH8pd5P(g4Var, t10Var2, yIx6ChFVk3);
            j30Var2 = j30Var;
            java.lang.String str = j30Var2.oh6vYeIP;
            defpackage.nc1 nc1Var = defpackage.dk1.IHQe1A4L2xu;
            defpackage.dg1 dg1Var = ((defpackage.bk1) t10Var2.SH1y5HwkJhh(nc1Var)).EXtogiMhuM;
            defpackage.nc1 nc1Var2 = defpackage.he.IHQe1A4L2xu;
            defpackage.of1.oh6vYeIP(str, null, ((defpackage.fe) t10Var2.SH1y5HwkJhh(nc1Var2)).G3OKOH3wZRC, 0L, 0L, null, 0L, 0, false, 0, 0, dg1Var, t10Var, 0, 0, 131066);
            defpackage.of1.oh6vYeIP(j30Var2.r1MBDhnF, null, ((defpackage.fe) t10Var.SH1y5HwkJhh(nc1Var2)).EgCjBq0SZwJ, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var.SH1y5HwkJhh(nc1Var)).ez2rX8ReCYw, t10Var, 0, 0, 131066);
            t10Var2 = t10Var;
            t10Var2.QoRHpC4k(true);
            t10Var2.QoRHpC4k(true);
        } else {
            t10Var2.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var2.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.t2LXIqmbaC5(i, 5, j30Var2);
        }
    }

    public static void cSNyPqwud(java.io.ByteArrayOutputStream byteArrayOutputStream, defpackage.bo boVar) {
        dOmtpLcqqI1y(byteArrayOutputStream, boVar);
        int i = boVar.AARZUJiTa;
        int[] iArr = boVar.EXtogiMhuM;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (java.util.Map.Entry entry : boVar.riuEU0zW4.entrySet()) {
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

    public static final boolean cnag84Bm(defpackage.yq yqVar, long j) {
        if (!yqVar.adDC3e2L.kd6TUFXn) {
            return false;
        }
        defpackage.d60 d60Var = defpackage.w70.D2vUnMij(yqVar).yIx6ChFVk.r1MBDhnF;
        if (!d60Var.EoOhNTTfIN7K.kd6TUFXn) {
            return false;
        }
        long wcsMeQWq = d60Var.wcsMeQWq(0L);
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (wcsMeQWq >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (wcsMeQWq & 4294967295L));
        long j2 = yqVar.kNAkVymC;
        float f = ((int) (j2 >> 32)) + intBitsToFloat;
        float f2 = ((int) (j2 & 4294967295L)) + intBitsToFloat2;
        float intBitsToFloat3 = java.lang.Float.intBitsToFloat((int) (j >> 32));
        if (intBitsToFloat > intBitsToFloat3 || intBitsToFloat3 > f) {
            return false;
        }
        float intBitsToFloat4 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L));
        return intBitsToFloat2 <= intBitsToFloat4 && intBitsToFloat4 <= f2;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean d6FAb9xVJ8GU(java.io.ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, defpackage.bo[] boVarArr) {
        int i;
        long j;
        int length;
        byte[] bArr2 = defpackage.mj1.G3OKOH3wZRC;
        byte[] bArr3 = defpackage.mj1.QoRHpC4k;
        byte[] bArr4 = defpackage.mj1.DFo87pBq1E5;
        int i2 = 0;
        if (!java.util.Arrays.equals(bArr, bArr4)) {
            byte[] bArr5 = defpackage.mj1.SyNS6RMn;
            if (java.util.Arrays.equals(bArr, bArr5)) {
                byte[] QQUzIjv3iOC5 = QQUzIjv3iOC5(boVarArr, bArr5);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, boVarArr.length, 1);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, QQUzIjv3iOC5.length, 4);
                byte[] SyNS6RMn = defpackage.gq1.SyNS6RMn(QQUzIjv3iOC5);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, SyNS6RMn.length, 4);
                byteArrayOutputStream.write(SyNS6RMn);
                return true;
            }
            if (java.util.Arrays.equals(bArr, bArr3)) {
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, boVarArr.length, 1);
                for (defpackage.bo boVar : boVarArr) {
                    int size = boVar.riuEU0zW4.size() * 4;
                    java.lang.String nBH8hAHy = nBH8hAHy(boVar.IHQe1A4L2xu, boVar.oh6vYeIP, bArr3);
                    java.nio.charset.Charset charset = java.nio.charset.StandardCharsets.UTF_8;
                    defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, nBH8hAHy.getBytes(charset).length);
                    defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, boVar.EXtogiMhuM.length);
                    defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, size, 4);
                    defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, boVar.r1MBDhnF, 4);
                    byteArrayOutputStream.write(nBH8hAHy.getBytes(charset));
                    java.util.Iterator it = boVar.riuEU0zW4.keySet().iterator();
                    while (it.hasNext()) {
                        defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, ((java.lang.Integer) it.next()).intValue());
                        defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, 0);
                    }
                    for (int i3 : boVar.EXtogiMhuM) {
                        defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr6 = defpackage.mj1.cnag84Bm;
            if (java.util.Arrays.equals(bArr, bArr6)) {
                byte[] QQUzIjv3iOC52 = QQUzIjv3iOC5(boVarArr, bArr6);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, boVarArr.length, 1);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, QQUzIjv3iOC52.length, 4);
                byte[] SyNS6RMn2 = defpackage.gq1.SyNS6RMn(QQUzIjv3iOC52);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, SyNS6RMn2.length, 4);
                byteArrayOutputStream.write(SyNS6RMn2);
                return true;
            }
            if (!java.util.Arrays.equals(bArr, bArr2)) {
                return false;
            }
            defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, boVarArr.length);
            for (defpackage.bo boVar2 : boVarArr) {
                java.lang.String str = boVar2.IHQe1A4L2xu;
                java.util.TreeMap treeMap = boVar2.riuEU0zW4;
                java.lang.String nBH8hAHy2 = nBH8hAHy(str, boVar2.oh6vYeIP, bArr2);
                java.nio.charset.Charset charset2 = java.nio.charset.StandardCharsets.UTF_8;
                defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, nBH8hAHy2.getBytes(charset2).length);
                defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, treeMap.size());
                defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, boVar2.EXtogiMhuM.length);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, boVar2.r1MBDhnF, 4);
                byteArrayOutputStream.write(nBH8hAHy2.getBytes(charset2));
                java.util.Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, ((java.lang.Integer) it2.next()).intValue());
                }
                for (int i4 : boVar2.EXtogiMhuM) {
                    defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList(3);
        java.io.ByteArrayOutputStream byteArrayOutputStream2 = new java.io.ByteArrayOutputStream();
        try {
            defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream2, boVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (defpackage.bo boVar3 : boVarArr) {
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream2, boVar3.r1MBDhnF, 4);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream2, boVar3.F7NU4MC0GW, 4);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream2, boVar3.AARZUJiTa, 4);
                java.lang.String nBH8hAHy3 = nBH8hAHy(boVar3.IHQe1A4L2xu, boVar3.oh6vYeIP, bArr4);
                java.nio.charset.Charset charset3 = java.nio.charset.StandardCharsets.UTF_8;
                int length2 = nBH8hAHy3.getBytes(charset3).length;
                defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(nBH8hAHy3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new java.lang.IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            defpackage.dq1 dq1Var = new defpackage.dq1(1, byteArray, false);
            byteArrayOutputStream2.close();
            arrayList.add(dq1Var);
            java.io.ByteArrayOutputStream byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < boVarArr.length) {
                try {
                    defpackage.bo boVar4 = boVarArr[i7];
                    defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream3, i7);
                    defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream3, boVar4.adDC3e2L);
                    i8 = i8 + 4 + (boVar4.adDC3e2L * i5);
                    int[] iArr = boVar4.EXtogiMhuM;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream3, i10 - i9);
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
            defpackage.dq1 dq1Var2 = new defpackage.dq1(3, byteArray2, true);
            byteArrayOutputStream3.close();
            arrayList.add(dq1Var2);
            byteArrayOutputStream3 = new java.io.ByteArrayOutputStream();
            int i12 = 0;
            for (int i13 = 0; i13 < boVarArr.length; i13++) {
                try {
                    defpackage.bo boVar5 = boVarArr[i13];
                    java.util.Iterator it3 = boVar5.riuEU0zW4.entrySet().iterator();
                    int i14 = 0;
                    while (it3.hasNext()) {
                        i14 |= ((java.lang.Integer) ((java.util.Map.Entry) it3.next()).getValue()).intValue();
                    }
                    java.io.ByteArrayOutputStream byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                    try {
                        FyULxpbU8bu(byteArrayOutputStream4, i14, boVar5);
                        byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                        byteArrayOutputStream4.close();
                        byteArrayOutputStream4 = new java.io.ByteArrayOutputStream();
                        try {
                            dOmtpLcqqI1y(byteArrayOutputStream4, boVar5);
                            byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                            byteArrayOutputStream4.close();
                            defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream3, i13);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i15 = i12 + 6;
                            defpackage.gq1.yIx6ChFVk(byteArrayOutputStream3, length4, 4);
                            defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream3, i14);
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
            defpackage.dq1 dq1Var3 = new defpackage.dq1(4, byteArray5, true);
            byteArrayOutputStream3.close();
            arrayList.add(dq1Var3);
            long size2 = 12 + (arrayList.size() * 16);
            defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, arrayList.size(), 4);
            int i16 = 0;
            while (i16 < arrayList.size()) {
                defpackage.dq1 dq1Var4 = (defpackage.dq1) arrayList.get(i16);
                int i17 = dq1Var4.IHQe1A4L2xu;
                byte[] bArr7 = dq1Var4.oh6vYeIP;
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
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, j, 4);
                defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, size2, 4);
                if (dq1Var4.r1MBDhnF) {
                    long length5 = bArr7.length;
                    byte[] SyNS6RMn3 = defpackage.gq1.SyNS6RMn(bArr7);
                    arrayList2.add(SyNS6RMn3);
                    defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, SyNS6RMn3.length, 4);
                    defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, length5, 4);
                    length = SyNS6RMn3.length;
                } else {
                    arrayList2.add(bArr7);
                    defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, bArr7.length, 4);
                    defpackage.gq1.yIx6ChFVk(byteArrayOutputStream, 0L, 4);
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

    public static void dOmtpLcqqI1y(java.io.ByteArrayOutputStream byteArrayOutputStream, defpackage.bo boVar) {
        int i = 0;
        for (java.util.Map.Entry entry : boVar.riuEU0zW4.entrySet()) {
            int intValue = ((java.lang.Integer) entry.getKey()).intValue();
            if ((((java.lang.Integer) entry.getValue()).intValue() & 1) != 0) {
                defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, intValue - i);
                defpackage.gq1.wll2JLbTBC2(byteArrayOutputStream, 0);
                i = intValue;
            }
        }
    }

    public static defpackage.ct0 ez2rX8ReCYw(float f) {
        return new defpackage.ct0(0.0f, 0.0f, 0.0f, f);
    }

    public static final int frpfPPIgqM9O(defpackage.s6 s6Var, java.lang.Object obj, int i) {
        int i2 = s6Var.AARZUJiTa;
        if (i2 == 0) {
            return -1;
        }
        try {
            int G3OKOH3wZRC = G3OKOH3wZRC(s6Var.adDC3e2L, i2, i);
            if (G3OKOH3wZRC < 0 || defpackage.x70.QoRHpC4k(obj, s6Var.xiZrDbcSW0[G3OKOH3wZRC])) {
                return G3OKOH3wZRC;
            }
            int i3 = G3OKOH3wZRC + 1;
            while (i3 < i2 && s6Var.adDC3e2L[i3] == i) {
                if (defpackage.x70.QoRHpC4k(obj, s6Var.xiZrDbcSW0[i3])) {
                    return i3;
                }
                i3++;
            }
            for (int i4 = G3OKOH3wZRC - 1; i4 >= 0 && s6Var.adDC3e2L[i4] == i; i4--) {
                if (defpackage.x70.QoRHpC4k(obj, s6Var.xiZrDbcSW0[i4])) {
                    return i4;
                }
            }
            return ~i3;
        } catch (java.lang.IndexOutOfBoundsException unused) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public static java.lang.String gG5uWf3dqScO(int i) {
        return i == 0 ? "Clear" : i == 1 ? "Src" : i == 2 ? "Dst" : i == 3 ? "SrcOver" : i == 4 ? "DstOver" : i == 5 ? "SrcIn" : i == 6 ? "DstIn" : i == 7 ? "SrcOut" : i == 8 ? "DstOut" : i == 9 ? "SrcAtop" : i == 10 ? "DstAtop" : i == 11 ? "Xor" : i == 12 ? "Plus" : i == 13 ? "Modulate" : i == 14 ? "Screen" : i == 15 ? "Overlay" : i == 16 ? "Darken" : i == 17 ? "Lighten" : i == 18 ? "ColorDodge" : i == 19 ? "ColorBurn" : i == 20 ? "HardLight" : i == 21 ? "Softlight" : i == 22 ? "Difference" : i == 23 ? "Exclusion" : i == 24 ? "Multiply" : i == 25 ? "Hue" : i == 26 ? "Saturation" : i == 27 ? "Color" : i == 28 ? "Luminosity" : "Unknown";
    }

    public static final defpackage.nk hkbnNdmy(defpackage.gy gyVar) {
        int ordinal = gyVar.fzubgBFo().ordinal();
        defpackage.nk nkVar = defpackage.nk.adDC3e2L;
        if (ordinal != 0) {
            defpackage.nk nkVar2 = defpackage.nk.xiZrDbcSW0;
            if (ordinal == 1) {
                defpackage.gy nBH8hAHy = defpackage.mj1.nBH8hAHy(gyVar);
                if (nBH8hAHy == null) {
                    defpackage.db.fnWB2E7cs("ActiveParent with no focused child");
                    return null;
                }
                defpackage.nk hkbnNdmy = hkbnNdmy(nBH8hAHy);
                defpackage.nk nkVar3 = hkbnNdmy != nkVar ? hkbnNdmy : null;
                if (nkVar3 != null) {
                    return nkVar3;
                }
                if (gyVar.fnWB2E7cs) {
                    return nkVar;
                }
                gyVar.fnWB2E7cs = true;
                try {
                    defpackage.dy pm90rNzI5F = gyVar.pm90rNzI5F();
                    defpackage.cy cyVar = (defpackage.cy) ((defpackage.v0) defpackage.w70.frpfPPIgqM9O(gyVar)).getFocusOwner();
                    defpackage.gy xiZrDbcSW02 = cyVar.xiZrDbcSW0();
                    pm90rNzI5F.ez2rX8ReCYw.getClass();
                    defpackage.gy xiZrDbcSW03 = cyVar.xiZrDbcSW0();
                    return (xiZrDbcSW02 == xiZrDbcSW03 || xiZrDbcSW03 == null) ? nkVar : defpackage.ey.F7NU4MC0GW == defpackage.ey.r1MBDhnF ? nkVar2 : defpackage.nk.AARZUJiTa;
                } finally {
                    gyVar.fnWB2E7cs = false;
                }
            }
            if (ordinal == 2) {
                return nkVar2;
            }
            if (ordinal != 3) {
                defpackage.db.F7NU4MC0GW();
                return null;
            }
        }
        return nkVar;
    }

    public static final defpackage.mj0 hyxIchWRW(defpackage.mj0 mj0Var, float f) {
        return mj0Var.r1MBDhnF(new defpackage.ys0(f, f, f, f));
    }

    public static final int kd6TUFXn(long[] jArr, int i, long j) {
        jArr.getClass();
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            long j2 = jArr[i4];
            if (j2 < j) {
                i3 = i4 + 1;
            } else {
                if (j2 <= j) {
                    return i4;
                }
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static defpackage.mj0 lpprD5VAS(defpackage.mj0 mj0Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return Uv8CGu3G(mj0Var, f, f2);
    }

    public static final defpackage.mj0 mAr5m2L7gYDP(defpackage.mj0 mj0Var, defpackage.at0 at0Var) {
        return mj0Var.r1MBDhnF(new defpackage.bt0(at0Var));
    }

    public static final defpackage.n51 mL9sMlGfef(defpackage.t10 t10Var) {
        java.lang.Object[] objArr = new java.lang.Object[0];
        boolean F7NU4MC0GW2 = t10Var.F7NU4MC0GW(0);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        if (F7NU4MC0GW2 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
            mAr5m2L7gYDP = new defpackage.v31(1);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
        return (defpackage.n51) defpackage.e90.NHJTzaLwkd(objArr, defpackage.n51.SH1y5HwkJhh, (defpackage.vz) mAr5m2L7gYDP, t10Var, 0);
    }

    public static java.lang.String nBH8hAHy(java.lang.String str, java.lang.String str2, byte[] bArr) {
        byte[] bArr2 = defpackage.mj1.QoRHpC4k;
        byte[] bArr3 = defpackage.mj1.G3OKOH3wZRC;
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

    public static defpackage.bo[] nVhUznk1t(java.io.ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, defpackage.bo[] boVarArr) {
        defpackage.bo boVar;
        if (byteArrayInputStream.available() == 0) {
            return new defpackage.bo[0];
        }
        if (i != boVarArr.length) {
            defpackage.db.AARZUJiTa("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
            java.lang.String str = new java.lang.String(defpackage.gq1.QQUzIjv3iOC5(byteArrayInputStream, (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2)), java.nio.charset.StandardCharsets.UTF_8);
            long UsuH8pd5P = defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 4);
            int UsuH8pd5P2 = (int) defpackage.gq1.UsuH8pd5P(byteArrayInputStream, 2);
            if (boVarArr.length > 0) {
                int indexOf = str.indexOf("!");
                if (indexOf < 0) {
                    indexOf = str.indexOf(":");
                }
                java.lang.String substring = indexOf > 0 ? str.substring(indexOf + 1) : str;
                for (int i3 = 0; i3 < boVarArr.length; i3++) {
                    if (boVarArr[i3].oh6vYeIP.equals(substring)) {
                        boVar = boVarArr[i3];
                        break;
                    }
                }
            }
            boVar = null;
            if (boVar == null) {
                defpackage.db.AARZUJiTa("Missing profile key: ".concat(str));
                return null;
            }
            boVar.F7NU4MC0GW = UsuH8pd5P;
            int[] AsxAYCCkb3Hi = AsxAYCCkb3Hi(byteArrayInputStream, UsuH8pd5P2);
            if (java.util.Arrays.equals(bArr, defpackage.mj1.G3OKOH3wZRC)) {
                boVar.adDC3e2L = UsuH8pd5P2;
                boVar.EXtogiMhuM = AsxAYCCkb3Hi;
            }
        }
        return boVarArr;
    }

    public static final void oh6vYeIP(java.lang.Object obj, defpackage.g00 g00Var, defpackage.t10 t10Var) {
        boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(obj);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        if (xiZrDbcSW02 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
            mAr5m2L7gYDP = new defpackage.gq(g00Var);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
    }

    public static final defpackage.mj0 p4kuH6PDtgom(defpackage.t10 t10Var, defpackage.mj0 mj0Var) {
        if (mj0Var.oh6vYeIP(defpackage.q0.SyNS6RMn)) {
            return mj0Var;
        }
        t10Var.RmCzwkUxICV(1219399079);
        defpackage.mj0 mj0Var2 = (defpackage.mj0) mj0Var.IHQe1A4L2xu(new defpackage.QoRHpC4k(4, t10Var), defpackage.jj0.IHQe1A4L2xu);
        t10Var.QoRHpC4k(false);
        return mj0Var2;
    }

    public static defpackage.mj0 qvFH3dnF(defpackage.mj0 mj0Var, defpackage.n51 n51Var) {
        return mj0Var.r1MBDhnF(defpackage.mj1.V7bD7b8KA(defpackage.jj0.IHQe1A4L2xu, defpackage.j40.r1MBDhnF)).r1MBDhnF(new defpackage.o51(null, null, n51Var.F7NU4MC0GW, defpackage.ks0.adDC3e2L, n51Var, true, true)).r1MBDhnF(new defpackage.c61(n51Var));
    }

    public static final void r1MBDhnF(java.lang.Object obj, java.lang.Object obj2, defpackage.g00 g00Var, defpackage.t10 t10Var) {
        boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(obj) | t10Var.xiZrDbcSW0(obj2);
        java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
        if (xiZrDbcSW02 || mAr5m2L7gYDP == defpackage.bh.IHQe1A4L2xu) {
            mAr5m2L7gYDP = new defpackage.gq(g00Var);
            t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
        }
    }

    public static defpackage.ct0 riuEU0zW4(int i) {
        float f = (i & 1) != 0 ? 0.0f : 8.0f;
        return new defpackage.ct0(f, 0.0f, f, 0.0f);
    }

    public static final java.lang.String sJNB7mCer5(float f) {
        if (java.lang.Float.isNaN(f)) {
            return "NaN";
        }
        if (java.lang.Float.isInfinite(f)) {
            return f < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = java.lang.Math.max(1, 0);
        float pow = (float) java.lang.Math.pow(10.0d, max);
        float f2 = f * pow;
        int i = (int) f2;
        if (f2 - i >= 0.5f) {
            i++;
        }
        float f3 = i / pow;
        return max > 0 ? java.lang.String.valueOf(f3) : java.lang.String.valueOf((int) f3);
    }

    public static final defpackage.lj v5iciZok(defpackage.q21 q21Var, boolean z, defpackage.fj fjVar) {
        defpackage.xh1 xh1Var = (defpackage.xh1) fjVar.xiZrDbcSW0().cnag84Bm(defpackage.xh1.xiZrDbcSW0);
        defpackage.lj ljVar = xh1Var != null ? xh1Var.adDC3e2L : null;
        if (!q21Var.riuEU0zW4()) {
            defpackage.dj djVar = q21Var.IHQe1A4L2xu;
            if (djVar == null) {
                defpackage.x70.Ye0N2xE9Hc("coroutineScope");
                throw null;
            }
            defpackage.lj ljVar2 = djVar.adDC3e2L;
            if (ljVar == null) {
                ljVar = defpackage.lt.adDC3e2L;
            }
            return ljVar2.JlrlGoKF(ljVar);
        }
        if (ljVar != null) {
            defpackage.dj djVar2 = q21Var.IHQe1A4L2xu;
            if (djVar2 != null) {
                return djVar2.adDC3e2L.JlrlGoKF(ljVar);
            }
            defpackage.x70.Ye0N2xE9Hc("coroutineScope");
            throw null;
        }
        if (z) {
            defpackage.lj ljVar3 = q21Var.oh6vYeIP;
            if (ljVar3 != null) {
                return ljVar3;
            }
            defpackage.x70.Ye0N2xE9Hc("transactionContext");
            throw null;
        }
        defpackage.dj djVar3 = q21Var.IHQe1A4L2xu;
        if (djVar3 != null) {
            return djVar3.adDC3e2L;
        }
        defpackage.x70.Ye0N2xE9Hc("coroutineScope");
        throw null;
    }

    public static final void xiZrDbcSW0(defpackage.r30 r30Var, defpackage.g00 g00Var, defpackage.t10 t10Var, int i) {
        r30Var.getClass();
        g00Var.getClass();
        t10Var.QUKZkWRtw6(156985629);
        int i2 = (t10Var.EXtogiMhuM(r30Var) ? 4 : 2) | i | (t10Var.EXtogiMhuM(g00Var) ? 32 : 16);
        int i3 = 1;
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
            defpackage.mj1.riuEU0zW4(null, defpackage.h1.XZx205DYe(-1247267991, new defpackage.n30(r30Var, g00Var, i3), t10Var), t10Var, 48);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.oKqPTyA2(i, 6, r30Var, g00Var);
        }
    }

    public static final defpackage.mj0 yIx6ChFVk(defpackage.t10 t10Var, defpackage.mj0 mj0Var) {
        t10Var.AsxAYCCkb3Hi(439770924);
        defpackage.mj0 p4kuH6PDtgom = p4kuH6PDtgom(t10Var, mj0Var);
        t10Var.QoRHpC4k(false);
        return p4kuH6PDtgom;
    }

    public abstract boolean EgCjBq0SZwJ(defpackage.hyxIchWRW hyxichwrw, defpackage.yIx6ChFVk yix6chfvk);

    public abstract void EoOhNTTfIN7K(defpackage.mAr5m2L7gYDP mar5m2l7gydp, defpackage.mAr5m2L7gYDP mar5m2l7gydp2);

    public abstract void XZx205DYe(defpackage.y yVar);

    public abstract boolean fnWB2E7cs(defpackage.hyxIchWRW hyxichwrw, java.lang.Object obj, java.lang.Object obj2);

    public abstract boolean kNAkVymC(defpackage.hyxIchWRW hyxichwrw, defpackage.mAr5m2L7gYDP mar5m2l7gydp, defpackage.mAr5m2L7gYDP mar5m2l7gydp2);

    public abstract void wKlPRKlRnfqr(defpackage.mAr5m2L7gYDP mar5m2l7gydp, java.lang.Thread thread);

    public abstract void wll2JLbTBC2(java.lang.Throwable th);
}
