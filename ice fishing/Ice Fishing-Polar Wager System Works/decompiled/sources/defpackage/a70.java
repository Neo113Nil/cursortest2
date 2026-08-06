package defpackage;

/* loaded from: classes.dex */
public abstract class a70 {
    public static final /* synthetic */ int IHQe1A4L2xu = 0;

    public static final defpackage.qn0 AARZUJiTa(android.content.Context context) {
        context.getClass();
        defpackage.qn0 qn0Var = new defpackage.qn0(context);
        defpackage.ym0 ym0Var = qn0Var.oh6vYeIP;
        defpackage.po0 po0Var = ym0Var.EgCjBq0SZwJ;
        po0Var.IHQe1A4L2xu(new defpackage.eg(po0Var));
        defpackage.po0 po0Var2 = ym0Var.EgCjBq0SZwJ;
        po0Var2.IHQe1A4L2xu(new defpackage.gg());
        po0Var2.IHQe1A4L2xu(new defpackage.no());
        return qn0Var;
    }

    public static final float C0U8sNJm(long j, float f, defpackage.qn qnVar) {
        float r1MBDhnF;
        long oh6vYeIP = defpackage.fg1.oh6vYeIP(j);
        if (defpackage.gg1.IHQe1A4L2xu(oh6vYeIP, 4294967296L)) {
            if (qnVar.EXtogiMhuM() <= 1.05d) {
                return qnVar.QPwENk36pDC(j);
            }
            r1MBDhnF = defpackage.fg1.r1MBDhnF(j) / defpackage.fg1.r1MBDhnF(qnVar.AQHddgaEX(f));
        } else {
            if (!defpackage.gg1.IHQe1A4L2xu(oh6vYeIP, 8589934592L)) {
                return Float.NaN;
            }
            r1MBDhnF = defpackage.fg1.r1MBDhnF(j);
        }
        return r1MBDhnF * f;
    }

    public static final void D2vUnMij(android.text.Spannable spannable, long j, defpackage.qn qnVar, int i, int i2) {
        long oh6vYeIP = defpackage.fg1.oh6vYeIP(j);
        if (defpackage.gg1.IHQe1A4L2xu(oh6vYeIP, 4294967296L)) {
            spannable.setSpan(new android.text.style.AbsoluteSizeSpan(defpackage.ci0.TFRaUu83X3E(qnVar.QPwENk36pDC(j)), false), i, i2, 33);
        } else if (defpackage.gg1.IHQe1A4L2xu(oh6vYeIP, 8589934592L)) {
            spannable.setSpan(new android.text.style.RelativeSizeSpan(defpackage.fg1.r1MBDhnF(j)), i, i2, 33);
        }
    }

    public static final java.lang.String DFo87pBq1E5(java.util.Collection collection) {
        collection.getClass();
        return !collection.isEmpty() ? defpackage.sc1.QPwENk36pDC(defpackage.td.cSNyPqwud(collection, ",\n", "\n", "\n", null, 56)).concat("},") : " }";
    }

    public static final long EXtogiMhuM() {
        return java.lang.Thread.currentThread().getId();
    }

    public static final void EgCjBq0SZwJ(defpackage.da0 da0Var) {
        defpackage.w70.D2vUnMij(da0Var).D2vUnMij();
    }

    public static final boolean F7NU4MC0GW(float f) {
        return java.lang.Float.isNaN(f) || java.lang.Math.abs(f) < 0.5f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public static final java.lang.Class G3OKOH3wZRC(defpackage.xc xcVar) {
        xcVar.getClass();
        java.lang.Class IHQe1A4L2xu2 = xcVar.IHQe1A4L2xu();
        if (IHQe1A4L2xu2.isPrimitive()) {
            java.lang.String name = IHQe1A4L2xu2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return java.lang.Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return java.lang.Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return java.lang.Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return java.lang.Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return java.lang.Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return java.lang.Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return java.lang.Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return java.lang.Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return java.lang.Short.class;
                    }
                    break;
            }
        }
        return IHQe1A4L2xu2;
    }

    public static final void IHQe1A4L2xu(final java.lang.Object obj, final int i, final defpackage.bc0 bc0Var, final defpackage.sf sfVar, defpackage.t10 t10Var, final int i2) {
        int i3;
        t10Var.QUKZkWRtw6(872548579);
        if ((i2 & 6) == 0) {
            i3 = (t10Var.EXtogiMhuM(obj) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= t10Var.F7NU4MC0GW(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= t10Var.EXtogiMhuM(bc0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= t10Var.EXtogiMhuM(sfVar) ? 2048 : 1024;
        }
        if (t10Var.lpprD5VAS(i3 & 1, (i3 & 1171) != 1170)) {
            boolean xiZrDbcSW0 = t10Var.xiZrDbcSW0(obj) | t10Var.xiZrDbcSW0(bc0Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            java.lang.Object obj2 = defpackage.bh.IHQe1A4L2xu;
            if (xiZrDbcSW0 || mAr5m2L7gYDP == obj2) {
                mAr5m2L7gYDP = new defpackage.zb0(obj, bc0Var);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.zb0 zb0Var = (defpackage.zb0) mAr5m2L7gYDP;
            zb0Var.r1MBDhnF = i;
            defpackage.qt0 qt0Var = zb0Var.AARZUJiTa;
            defpackage.ly0 ly0Var = defpackage.wu0.IHQe1A4L2xu;
            defpackage.zb0 zb0Var2 = (defpackage.zb0) t10Var.SH1y5HwkJhh(ly0Var);
            defpackage.oa1 QoRHpC4k = defpackage.f70.QoRHpC4k();
            defpackage.g00 adDC3e2L = QoRHpC4k != null ? QoRHpC4k.adDC3e2L() : null;
            defpackage.oa1 fnWB2E7cs = defpackage.f70.fnWB2E7cs(QoRHpC4k);
            try {
                if (zb0Var2 != ((defpackage.zb0) qt0Var.getValue())) {
                    qt0Var.setValue(zb0Var2);
                    if (zb0Var.F7NU4MC0GW > 0) {
                        defpackage.zb0 zb0Var3 = zb0Var.adDC3e2L;
                        if (zb0Var3 != null) {
                            zb0Var3.oh6vYeIP();
                        }
                        if (zb0Var2 != null) {
                            zb0Var2.IHQe1A4L2xu();
                        } else {
                            zb0Var2 = null;
                        }
                        zb0Var.adDC3e2L = zb0Var2;
                    }
                }
                defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
                boolean xiZrDbcSW02 = t10Var.xiZrDbcSW0(zb0Var);
                java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
                if (xiZrDbcSW02 || mAr5m2L7gYDP2 == obj2) {
                    mAr5m2L7gYDP2 = new defpackage.DFo87pBq1E5(10, zb0Var);
                    t10Var.OtkytngK3Mr(mAr5m2L7gYDP2);
                }
                defpackage.s21.oh6vYeIP(zb0Var, (defpackage.g00) mAr5m2L7gYDP2, t10Var);
                defpackage.gq1.oh6vYeIP(ly0Var.IHQe1A4L2xu(zb0Var), sfVar, t10Var, ((i3 >> 6) & 112) | 8);
            } catch (java.lang.Throwable th) {
                defpackage.f70.QQUzIjv3iOC5(QoRHpC4k, fnWB2E7cs, adDC3e2L);
                throw th;
            }
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.k00() { // from class: ac0
                @Override // defpackage.k00
                public final java.lang.Object adDC3e2L(java.lang.Object obj3, java.lang.Object obj4) {
                    ((java.lang.Integer) obj4).getClass();
                    defpackage.a70.IHQe1A4L2xu(obj, i, bc0Var, sfVar, (defpackage.t10) obj3, defpackage.a70.hyxIchWRW(i2 | 1));
                    return defpackage.ok1.IHQe1A4L2xu;
                }
            };
        }
    }

    public static final void JlrlGoKF(defpackage.i31 i31Var, java.lang.String str) {
        i31Var.getClass();
        defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy(str);
        try {
            nBH8hAHy.NHJTzaLwkd();
            defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
        } finally {
        }
    }

    public static final defpackage.re1 NHJTzaLwkd(defpackage.i31 i31Var, java.lang.String str, boolean z) {
        defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int AARZUJiTa = defpackage.f70.AARZUJiTa(nBH8hAHy, "seqno");
            int AARZUJiTa2 = defpackage.f70.AARZUJiTa(nBH8hAHy, "cid");
            int AARZUJiTa3 = defpackage.f70.AARZUJiTa(nBH8hAHy, "name");
            int AARZUJiTa4 = defpackage.f70.AARZUJiTa(nBH8hAHy, "desc");
            if (AARZUJiTa != -1 && AARZUJiTa2 != -1 && AARZUJiTa3 != -1 && AARZUJiTa4 != -1) {
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
                while (nBH8hAHy.NHJTzaLwkd()) {
                    if (((int) nBH8hAHy.getLong(AARZUJiTa2)) >= 0) {
                        int i = (int) nBH8hAHy.getLong(AARZUJiTa);
                        java.lang.String xiZrDbcSW0 = nBH8hAHy.xiZrDbcSW0(AARZUJiTa3);
                        java.lang.String str2 = nBH8hAHy.getLong(AARZUJiTa4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(java.lang.Integer.valueOf(i), xiZrDbcSW0);
                        linkedHashMap2.put(java.lang.Integer.valueOf(i), str2);
                    }
                }
                java.util.List yUiIS9dG7NYk = defpackage.td.yUiIS9dG7NYk(linkedHashMap.entrySet(), new defpackage.hy(8));
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(yUiIS9dG7NYk, 10));
                java.util.Iterator it = yUiIS9dG7NYk.iterator();
                while (it.hasNext()) {
                    arrayList.add((java.lang.String) ((java.util.Map.Entry) it.next()).getValue());
                }
                java.util.List boH8X4DXyc4 = defpackage.td.boH8X4DXyc4(arrayList);
                java.util.List yUiIS9dG7NYk2 = defpackage.td.yUiIS9dG7NYk(linkedHashMap2.entrySet(), new defpackage.hy(9));
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(yUiIS9dG7NYk2, 10));
                java.util.Iterator it2 = yUiIS9dG7NYk2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((java.lang.String) ((java.util.Map.Entry) it2.next()).getValue());
                }
                defpackage.re1 re1Var = new defpackage.re1(str, z, boH8X4DXyc4, defpackage.td.boH8X4DXyc4(arrayList2));
                defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
                return re1Var;
            }
            defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
            return null;
        } finally {
        }
    }

    public static final long PAEGRtP0bX(long j, long j2) {
        float intBitsToFloat = java.lang.Float.intBitsToFloat((int) (j >> 32)) + ((int) (j2 >> 32));
        float intBitsToFloat2 = java.lang.Float.intBitsToFloat((int) (j & 4294967295L)) + ((int) (j2 & 4294967295L));
        return (java.lang.Float.floatToRawIntBits(intBitsToFloat) << 32) | (java.lang.Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L);
    }

    public static final java.lang.Object QQUzIjv3iOC5(defpackage.xd0 xd0Var, defpackage.nd0 nd0Var, defpackage.k00 k00Var, defpackage.ce1 ce1Var) {
        java.lang.Object kd6TUFXn;
        if (nd0Var != defpackage.nd0.xiZrDbcSW0) {
            return (xd0Var.EXtogiMhuM != defpackage.nd0.adDC3e2L && (kd6TUFXn = defpackage.h1.kd6TUFXn(new defpackage.x3(xd0Var, nd0Var, k00Var, (defpackage.ej) null, 6), ce1Var)) == defpackage.vj.adDC3e2L) ? kd6TUFXn : defpackage.ok1.IHQe1A4L2xu;
        }
        defpackage.db.fnWB2E7cs("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
        return null;
    }

    public static final java.lang.Class QoRHpC4k(defpackage.xc xcVar) {
        xcVar.getClass();
        java.lang.Class IHQe1A4L2xu2 = xcVar.IHQe1A4L2xu();
        IHQe1A4L2xu2.getClass();
        return IHQe1A4L2xu2;
    }

    public static final boolean SH1y5HwkJhh(java.lang.String str, java.lang.String str2) {
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
                    return defpackage.x70.QoRHpC4k(defpackage.rc1.gG5uWf3dqScO(str.substring(1, str.length() - 1)).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final void SiPhmbmu(java.lang.String str, int i) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("Error code: " + i);
        sb.append(", message: ".concat(str));
        throw new android.database.SQLException(sb.toString());
    }

    public static final defpackage.ud0 SyNS6RMn(android.view.View view) {
        view.getClass();
        while (view != null) {
            java.lang.Object tag = view.getTag(com.combinations.spin.balbi.R.id.view_tree_lifecycle_owner);
            defpackage.ud0 ud0Var = tag instanceof defpackage.ud0 ? (defpackage.ud0) tag : null;
            if (ud0Var != null) {
                return ud0Var;
            }
            java.lang.Object EgCjBq0SZwJ = defpackage.e90.EgCjBq0SZwJ(view);
            view = EgCjBq0SZwJ instanceof android.view.View ? (android.view.View) EgCjBq0SZwJ : null;
        }
        return null;
    }

    public static final long UsuH8pd5P(long j) {
        return (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j & 4294967295L))) & 4294967295L) | (java.lang.Math.round(java.lang.Float.intBitsToFloat((int) (j >> 32))) << 32);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.util.List V7bD7b8KA(defpackage.ia1 ia1Var, int i, defpackage.ia1 ia1Var2, boolean z, boolean z2, boolean z3) {
        defpackage.nt ntVar;
        boolean z4;
        int i2;
        int i3;
        int kNAkVymC = ia1Var.kNAkVymC(i);
        int i4 = i + kNAkVymC;
        int xiZrDbcSW0 = ia1Var.xiZrDbcSW0(i);
        int xiZrDbcSW02 = ia1Var.xiZrDbcSW0(i4);
        int i5 = xiZrDbcSW02 - xiZrDbcSW0;
        boolean z5 = i >= 0 && (ia1Var.oh6vYeIP[(ia1Var.kd6TUFXn(i) * 5) + 1] & 201326592) != 0;
        ia1Var2.PAEGRtP0bX(kNAkVymC);
        ia1Var2.abhbClRa(i5, ia1Var2.fnWB2E7cs);
        if (ia1Var.AARZUJiTa < i4) {
            ia1Var.UsuH8pd5P(i4);
        }
        if (ia1Var.ez2rX8ReCYw < xiZrDbcSW02) {
            ia1Var.nBH8hAHy(xiZrDbcSW02, i4);
        }
        int[] iArr = ia1Var2.oh6vYeIP;
        int i6 = ia1Var2.fnWB2E7cs;
        int i7 = i6 * 5;
        defpackage.t6.Ye0N2xE9Hc(ia1Var.oh6vYeIP, iArr, i7, i * 5, i4 * 5);
        java.lang.Object[] objArr = ia1Var2.r1MBDhnF;
        int i8 = ia1Var2.riuEU0zW4;
        java.lang.System.arraycopy(ia1Var.r1MBDhnF, xiZrDbcSW0, objArr, i8, i5);
        int i9 = ia1Var2.V7bD7b8KA;
        iArr[i7 + 2] = i9;
        int i10 = i6 - i;
        int i11 = i6 + kNAkVymC;
        int AARZUJiTa = i8 - ia1Var2.AARZUJiTa(iArr, i6);
        int i12 = ia1Var2.DFo87pBq1E5;
        int i13 = ia1Var2.JlrlGoKF;
        int length = objArr.length;
        boolean z6 = z5;
        int i14 = i12;
        int i15 = i6;
        while (i15 < i11) {
            if (i15 != i6) {
                int i16 = (i15 * 5) + 2;
                iArr[i16] = iArr[i16] + i10;
            }
            int[] iArr2 = iArr;
            int AARZUJiTa2 = ia1Var2.AARZUJiTa(iArr, i15) + AARZUJiTa;
            if (i14 < i15) {
                i2 = i6;
                i3 = 0;
            } else {
                i2 = i6;
                i3 = ia1Var2.ez2rX8ReCYw;
            }
            iArr2[(i15 * 5) + 4] = defpackage.ia1.riuEU0zW4(AARZUJiTa2, i3, i13, length);
            if (i15 == i14) {
                i14++;
            }
            i15++;
            i6 = i2;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        ia1Var2.DFo87pBq1E5 = i14;
        int IHQe1A4L2xu2 = defpackage.ha1.IHQe1A4L2xu(ia1Var.F7NU4MC0GW, i, ia1Var.QoRHpC4k());
        int IHQe1A4L2xu3 = defpackage.ha1.IHQe1A4L2xu(ia1Var.F7NU4MC0GW, i4, ia1Var.QoRHpC4k());
        if (IHQe1A4L2xu2 < IHQe1A4L2xu3) {
            java.util.ArrayList arrayList = ia1Var.F7NU4MC0GW;
            java.util.ArrayList arrayList2 = new java.util.ArrayList(IHQe1A4L2xu3 - IHQe1A4L2xu2);
            for (int i17 = IHQe1A4L2xu2; i17 < IHQe1A4L2xu3; i17++) {
                defpackage.o10 o10Var = (defpackage.o10) arrayList.get(i17);
                o10Var.IHQe1A4L2xu += i10;
                arrayList2.add(o10Var);
            }
            ia1Var2.F7NU4MC0GW.addAll(defpackage.ha1.IHQe1A4L2xu(ia1Var2.F7NU4MC0GW, ia1Var2.fnWB2E7cs, ia1Var2.QoRHpC4k()), arrayList2);
            arrayList.subList(IHQe1A4L2xu2, IHQe1A4L2xu3).clear();
            ntVar = arrayList2;
        } else {
            ntVar = defpackage.nt.adDC3e2L;
        }
        if (!ntVar.isEmpty()) {
            java.util.HashMap hashMap = ia1Var.adDC3e2L;
            java.util.HashMap hashMap2 = ia1Var2.adDC3e2L;
            if (hashMap != null && hashMap2 != null) {
                int size = ntVar.size();
                for (int i18 = 0; i18 < size; i18++) {
                }
            }
        }
        int i19 = ia1Var2.V7bD7b8KA;
        ia1Var2.lpprD5VAS(i9);
        int D2vUnMij = ia1Var.D2vUnMij(ia1Var.oh6vYeIP, i);
        if (!z3) {
            z4 = false;
        } else if (z) {
            boolean z7 = D2vUnMij >= 0;
            if (z7) {
                ia1Var.hkbnNdmy();
                ia1Var.IHQe1A4L2xu(D2vUnMij - ia1Var.fnWB2E7cs);
                ia1Var.hkbnNdmy();
            }
            ia1Var.IHQe1A4L2xu(i - ia1Var.fnWB2E7cs);
            boolean p4kuH6PDtgom = ia1Var.p4kuH6PDtgom();
            if (z7) {
                ia1Var.hyxIchWRW();
                ia1Var.SH1y5HwkJhh();
                ia1Var.hyxIchWRW();
                ia1Var.SH1y5HwkJhh();
            }
            z4 = p4kuH6PDtgom;
        } else {
            boolean yIx6ChFVk = ia1Var.yIx6ChFVk(i, kNAkVymC);
            ia1Var.wll2JLbTBC2(xiZrDbcSW0, i5, i - 1);
            z4 = yIx6ChFVk;
        }
        if (z4) {
            defpackage.dh.IHQe1A4L2xu("Unexpectedly removed anchors");
        }
        int i20 = ia1Var2.cnag84Bm;
        int i21 = iArr3[i7 + 1];
        ia1Var2.cnag84Bm = i20 + ((1073741824 & i21) != 0 ? 1 : i21 & 67108863);
        if (z2) {
            ia1Var2.fnWB2E7cs = i11;
            ia1Var2.riuEU0zW4 = i8 + i5;
        }
        if (z6) {
            ia1Var2.Ye0N2xE9Hc(i9);
        }
        return ntVar;
    }

    public static final defpackage.nv0 XZx205DYe(com.corsair.ledger.data.local.entity.PlayerEntity playerEntity) {
        playerEntity.getClass();
        return new defpackage.nv0(playerEntity.getCellsDug(), playerEntity.getRelicsFound(), playerEntity.getLegendariesFound(), playerEntity.getCraftCount(), playerEntity.getCursedHits(), playerEntity.getTradeCount(), playerEntity.getDuplicatesSold(), playerEntity.getPeakDoubloons());
    }

    public static final java.util.List abhbClRa(defpackage.k31 k31Var) {
        int AARZUJiTa = defpackage.f70.AARZUJiTa(k31Var, "id");
        int AARZUJiTa2 = defpackage.f70.AARZUJiTa(k31Var, "seq");
        int AARZUJiTa3 = defpackage.f70.AARZUJiTa(k31Var, "from");
        int AARZUJiTa4 = defpackage.f70.AARZUJiTa(k31Var, "to");
        defpackage.te0 kNAkVymC = defpackage.fm.kNAkVymC();
        while (k31Var.NHJTzaLwkd()) {
            kNAkVymC.add(new defpackage.jz((int) k31Var.getLong(AARZUJiTa), (int) k31Var.getLong(AARZUJiTa2), k31Var.xiZrDbcSW0(AARZUJiTa3), k31Var.xiZrDbcSW0(AARZUJiTa4)));
        }
        return defpackage.td.JX5fKip1C6(defpackage.fm.fnWB2E7cs(kNAkVymC));
    }

    public static final defpackage.lj0 adDC3e2L(defpackage.kn knVar, int i) {
        defpackage.lj0 lj0Var = ((defpackage.lj0) knVar).adDC3e2L.SH1y5HwkJhh;
        if (lj0Var == null || (lj0Var.EXtogiMhuM & i) == 0) {
            return null;
        }
        while (lj0Var != null) {
            int i2 = lj0Var.AARZUJiTa;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return lj0Var;
            }
            lj0Var = lj0Var.SH1y5HwkJhh;
        }
        return null;
    }

    public static defpackage.ff0 cnag84Bm() {
        defpackage.v5 v5Var = defpackage.gv0.IHQe1A4L2xu;
        v5Var.getClass();
        android.os.LocaleList localeList = android.os.LocaleList.getDefault();
        synchronized (((defpackage.c41) v5Var.F7NU4MC0GW)) {
            try {
                defpackage.ff0 ff0Var = (defpackage.ff0) v5Var.r1MBDhnF;
                if (ff0Var != null && localeList == ((android.os.LocaleList) v5Var.oh6vYeIP)) {
                    return ff0Var;
                }
                int size = localeList.size();
                java.util.ArrayList arrayList = new java.util.ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new defpackage.ef0(localeList.get(i)));
                }
                defpackage.ff0 ff0Var2 = new defpackage.ff0(arrayList);
                v5Var.oh6vYeIP = localeList;
                v5Var.r1MBDhnF = ff0Var2;
                return ff0Var2;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    public static final java.lang.Object ez2rX8ReCYw(defpackage.cw0 cw0Var, java.lang.String str, defpackage.fj fjVar) {
        java.lang.Object F7NU4MC0GW = cw0Var.F7NU4MC0GW(str, new defpackage.r41(9), fjVar);
        return F7NU4MC0GW == defpackage.vj.adDC3e2L ? F7NU4MC0GW : defpackage.ok1.IHQe1A4L2xu;
    }

    public static final java.lang.String fnWB2E7cs(java.util.Collection collection) {
        return defpackage.sc1.QPwENk36pDC(defpackage.td.cSNyPqwud(collection, ",", null, null, null, 62)).concat(defpackage.sc1.QPwENk36pDC(" }"));
    }

    public static final void frpfPPIgqM9O(android.text.Spannable spannable, defpackage.ff0 ff0Var, int i, int i2) {
        if (ff0Var != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(ff0Var, 10));
            java.util.Iterator it = ff0Var.adDC3e2L.iterator();
            while (it.hasNext()) {
                arrayList.add(((defpackage.ef0) it.next()).IHQe1A4L2xu);
            }
            java.util.Locale[] localeArr = (java.util.Locale[]) arrayList.toArray(new java.util.Locale[0]);
            spannable.setSpan(new android.text.style.LocaleSpan(new android.os.LocaleList((java.util.Locale[]) java.util.Arrays.copyOf(localeArr, localeArr.length))), i, i2, 33);
        }
    }

    public static final int hyxIchWRW(int i) {
        int i2 = 306783378 & i;
        int i3 = 613566756 & i;
        return (i & (-920350135)) | (i3 >> 1) | i2 | ((i2 << 1) & i3);
    }

    public static final java.lang.String kNAkVymC(java.util.Collection collection) {
        return defpackage.sc1.QPwENk36pDC(defpackage.td.cSNyPqwud(collection, ",", null, null, null, 62)).concat(defpackage.sc1.QPwENk36pDC("},"));
    }

    public static final defpackage.rf1 kd6TUFXn(defpackage.b71 b71Var) {
        defpackage.g00 g00Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.Object AARZUJiTa = b71Var.adDC3e2L.AARZUJiTa(defpackage.a71.IHQe1A4L2xu);
        if (AARZUJiTa == null) {
            AARZUJiTa = null;
        }
        defpackage.TFRaUu83X3E tFRaUu83X3E = (defpackage.TFRaUu83X3E) AARZUJiTa;
        if (tFRaUu83X3E == null || (g00Var = (defpackage.g00) tFRaUu83X3E.oh6vYeIP) == null || !((java.lang.Boolean) g00Var.AARZUJiTa(arrayList)).booleanValue()) {
            return null;
        }
        return (defpackage.rf1) arrayList.get(0);
    }

    public static final double mAr5m2L7gYDP(long j) {
        return ((j >>> 11) * 2048.0d) + (j & 2047);
    }

    public static final void nBH8hAHy(defpackage.r3 r3Var, int i) {
        java.lang.Object obj;
        java.util.Iterator<T> it = r3Var.getLayoutNodeToHolder().entrySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((defpackage.ma0) ((java.util.Map.Entry) obj).getKey()).xiZrDbcSW0 == i) {
                    break;
                }
            }
        }
        java.util.Map.Entry entry = (java.util.Map.Entry) obj;
        if (entry == null || entry.getValue() == null) {
            return;
        }
        defpackage.db.kd6TUFXn();
    }

    public static final void oh6vYeIP(defpackage.qn0 qn0Var, defpackage.fm1 fm1Var, defpackage.t10 t10Var, int i) {
        defpackage.fm1 fm1Var2;
        qn0Var.getClass();
        t10Var.QUKZkWRtw6(-895030085);
        int i2 = (t10Var.EXtogiMhuM(qn0Var) ? 4 : 2) | i | 16;
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
                defpackage.vm1 v5iciZok = defpackage.l80.v5iciZok(defpackage.fm1.class, IHQe1A4L2xu2, G3OKOH3wZRC, IHQe1A4L2xu2 instanceof defpackage.h30 ? ((defpackage.h30) IHQe1A4L2xu2).xiZrDbcSW0() : defpackage.dk.oh6vYeIP, t10Var);
                t10Var.QoRHpC4k(false);
                t10Var.QoRHpC4k(false);
                fm1Var2 = (defpackage.fm1) v5iciZok;
            } else {
                t10Var.WLpAkxCo();
                fm1Var2 = fm1Var;
            }
            t10Var.G3OKOH3wZRC();
            defpackage.sl0 PAEGRtP0bX = defpackage.mj1.PAEGRtP0bX(fm1Var2.F7NU4MC0GW, t10Var);
            defpackage.tb tbVar = fm1Var2.xiZrDbcSW0;
            boolean EXtogiMhuM = t10Var.EXtogiMhuM(qn0Var);
            java.lang.Object mAr5m2L7gYDP = t10Var.mAr5m2L7gYDP();
            defpackage.ad1 ad1Var = defpackage.bh.IHQe1A4L2xu;
            if (EXtogiMhuM || mAr5m2L7gYDP == ad1Var) {
                mAr5m2L7gYDP = new defpackage.o30(qn0Var, null, 3);
                t10Var.OtkytngK3Mr(mAr5m2L7gYDP);
            }
            defpackage.x80.IHQe1A4L2xu(tbVar, (defpackage.k00) mAr5m2L7gYDP, t10Var, 0);
            defpackage.em1 em1Var = (defpackage.em1) PAEGRtP0bX.getValue();
            boolean EXtogiMhuM2 = t10Var.EXtogiMhuM(fm1Var2);
            java.lang.Object mAr5m2L7gYDP2 = t10Var.mAr5m2L7gYDP();
            if (EXtogiMhuM2 || mAr5m2L7gYDP2 == ad1Var) {
                defpackage.xiZrDbcSW0 xizrdbcsw0 = new defpackage.xiZrDbcSW0(1, fm1Var2, defpackage.fm1.class, "onEvent", "onEvent(Lcom/corsair/ledger/presentation/victory/VictoryEvent;)V", 0, 0, 12);
                t10Var.OtkytngK3Mr(xizrdbcsw0);
                mAr5m2L7gYDP2 = xizrdbcsw0;
            }
            r1MBDhnF(em1Var, (defpackage.g00) ((defpackage.v00) mAr5m2L7gYDP2), t10Var, 0);
        } else {
            t10Var.WLpAkxCo();
            fm1Var2 = fm1Var;
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.oKqPTyA2(i, 25, qn0Var, fm1Var2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00eb  */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v6, types: [nt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final defpackage.op p4kuH6PDtgom(com.corsair.ledger.data.local.entity.DigSessionEntity digSessionEntity) {
        java.util.List list;
        ?? arrayList;
        java.lang.Integer num;
        int i;
        int i2;
        int i3;
        digSessionEntity.getClass();
        java.lang.String islandId = digSessionEntity.getIslandId();
        long seed = digSessionEntity.getSeed();
        int movesLeft = digSessionEntity.getMovesLeft();
        java.lang.String revealedCsv = digSessionEntity.getRevealedCsv();
        if (defpackage.rc1.AQHddgaEX(revealedCsv)) {
            arrayList = defpackage.nt.adDC3e2L;
        } else {
            int i4 = 1;
            int i5 = 0;
            java.lang.String valueOf = java.lang.String.valueOf(new char[]{','}[0]);
            int RmCzwkUxICV = defpackage.rc1.RmCzwkUxICV(0, revealedCsv, valueOf, false);
            int i6 = 10;
            if (RmCzwkUxICV != -1) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(10);
                int i7 = 0;
                do {
                    arrayList2.add(revealedCsv.subSequence(i7, RmCzwkUxICV).toString());
                    i7 = valueOf.length() + RmCzwkUxICV;
                    RmCzwkUxICV = revealedCsv.indexOf(valueOf, i7);
                } while (RmCzwkUxICV != -1);
                arrayList2.add(revealedCsv.subSequence(i7, revealedCsv.length()).toString());
                list = arrayList2;
            } else {
                list = defpackage.fm.p4kuH6PDtgom(revealedCsv.toString());
            }
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                java.lang.String obj = defpackage.rc1.gG5uWf3dqScO((java.lang.String) it.next()).toString();
                obj.getClass();
                defpackage.x70.G3OKOH3wZRC(i6);
                int length = obj.length();
                if (length != 0) {
                    char charAt = obj.charAt(i5);
                    int i8 = -2147483647;
                    if (defpackage.x70.kNAkVymC(charAt, 48) >= 0) {
                        i = i5;
                    } else if (length != i4) {
                        if (charAt == '+') {
                            i = i4;
                            i2 = i5;
                            int i9 = i5;
                            int i10 = -59652323;
                            while (i < length) {
                                int digit = java.lang.Character.digit((int) obj.charAt(i), i6);
                                if (digit >= 0 && ((i9 >= i10 || (i10 == -59652323 && i9 >= (i10 = i8 / 10))) && (i3 = i9 * 10) >= i8 + digit)) {
                                    i9 = i3 - digit;
                                    i++;
                                    i6 = 10;
                                }
                            }
                            if (i2 == 0) {
                                i9 = -i9;
                            }
                            num = java.lang.Integer.valueOf(i9);
                            if (num != null) {
                                arrayList.add(num);
                            }
                            i4 = 1;
                            i5 = 0;
                            i6 = 10;
                        } else if (charAt == '-') {
                            i8 = Integer.MIN_VALUE;
                            i = i4;
                        }
                    }
                    i2 = i;
                    int i92 = i5;
                    int i102 = -59652323;
                    while (i < length) {
                    }
                    if (i2 == 0) {
                    }
                    num = java.lang.Integer.valueOf(i92);
                    if (num != null) {
                    }
                    i4 = 1;
                    i5 = 0;
                    i6 = 10;
                }
                num = null;
                if (num != null) {
                }
                i4 = 1;
                i5 = 0;
                i6 = 10;
            }
        }
        return new defpackage.op(islandId, seed, movesLeft, arrayList, digSessionEntity.getFinished());
    }

    public static final void r1MBDhnF(defpackage.em1 em1Var, defpackage.g00 g00Var, defpackage.t10 t10Var, int i) {
        em1Var.getClass();
        g00Var.getClass();
        t10Var.QUKZkWRtw6(887553133);
        int i2 = (t10Var.EXtogiMhuM(em1Var) ? 4 : 2) | i | (t10Var.EXtogiMhuM(g00Var) ? 32 : 16);
        int i3 = 1;
        if (t10Var.lpprD5VAS(i2 & 1, (i2 & 19) != 18)) {
            defpackage.mj1.riuEU0zW4(null, defpackage.h1.XZx205DYe(20624569, new defpackage.cm1(em1Var, g00Var, i3), t10Var), t10Var, 48);
        } else {
            t10Var.WLpAkxCo();
        }
        defpackage.az0 kd6TUFXn = t10Var.kd6TUFXn();
        if (kd6TUFXn != null) {
            kd6TUFXn.F7NU4MC0GW = new defpackage.oKqPTyA2(i, 26, em1Var, g00Var);
        }
    }

    public static final com.corsair.ledger.data.local.entity.PlayerEntity riuEU0zW4(long j) {
        return new com.corsair.ledger.data.local.entity.PlayerEntity(0, 0, 10, j, 0L, false, 0, 0, 0, 0, 0, 0, 0, 0);
    }

    public static final void v5iciZok(android.text.Spannable spannable, long j, int i, int i2) {
        if (j != 16) {
            spannable.setSpan(new android.text.style.ForegroundColorSpan(defpackage.w70.yIx6ChFVk(j)), i, i2, 33);
        }
    }

    public static final com.corsair.ledger.data.local.entity.PlayerEntity wll2JLbTBC2(defpackage.n10 n10Var) {
        n10Var.getClass();
        int i = n10Var.IHQe1A4L2xu;
        int i2 = n10Var.oh6vYeIP;
        long j = n10Var.r1MBDhnF;
        long j2 = n10Var.F7NU4MC0GW;
        boolean z = n10Var.adDC3e2L;
        defpackage.nv0 nv0Var = n10Var.xiZrDbcSW0;
        return new com.corsair.ledger.data.local.entity.PlayerEntity(0, i, i2, j, j2, z, nv0Var.IHQe1A4L2xu, nv0Var.oh6vYeIP, nv0Var.r1MBDhnF, nv0Var.F7NU4MC0GW, nv0Var.adDC3e2L, nv0Var.xiZrDbcSW0, nv0Var.AARZUJiTa, nv0Var.EXtogiMhuM);
    }

    public static void xiZrDbcSW0(java.lang.Object obj, java.lang.String str) {
        if (obj == null) {
            throw new java.lang.NullPointerException(str);
        }
    }

    public static final java.lang.String yIx6ChFVk(int i) {
        if (i == 0) {
            return "android.widget.Button";
        }
        if (i == 1) {
            return "android.widget.CheckBox";
        }
        if (i == 3) {
            return "android.widget.RadioButton";
        }
        if (i == 5) {
            return "android.widget.ImageView";
        }
        if (i == 6) {
            return "android.widget.Spinner";
        }
        if (i == 7) {
            return "android.widget.NumberPicker";
        }
        return null;
    }
}
