package defpackage;

/* loaded from: classes.dex */
public final /* synthetic */ class e6 implements defpackage.k00 {
    public final /* synthetic */ int adDC3e2L;

    public /* synthetic */ e6(int i) {
        this.adDC3e2L = 12;
    }

    @Override // defpackage.k00
    public final java.lang.Object adDC3e2L(java.lang.Object obj, java.lang.Object obj2) {
        defpackage.ve veVar;
        int i = this.adDC3e2L;
        android.os.Bundle bundle = null;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        switch (i) {
            case 0:
                return java.lang.Integer.valueOf(java.lang.Math.round((1.0f + (((defpackage.w90) obj2) == defpackage.w90.adDC3e2L ? -1.0f : 1.0f)) * (((java.lang.Integer) obj).intValue() / 2.0f)));
            case 1:
                return java.lang.Integer.valueOf(java.lang.Math.round((1.0f + 0.0f) * ((((java.lang.Integer) obj).intValue() - 0) / 2.0f)));
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                java.lang.String str = (java.lang.String) obj;
                defpackage.jj jjVar = (defpackage.jj) obj2;
                str.getClass();
                jjVar.getClass();
                if (str.length() == 0) {
                    return jjVar.toString();
                }
                return str + ", " + jjVar;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.t10 t10Var = (defpackage.t10) obj;
                int intValue = ((java.lang.Integer) obj2).intValue();
                if (t10Var.lpprD5VAS(intValue & 1, (intValue & 3) != 2)) {
                    defpackage.fm.adDC3e2L(t10Var, 0);
                } else {
                    t10Var.WLpAkxCo();
                }
                return ok1Var;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.t10 t10Var2 = (defpackage.t10) obj;
                int intValue2 = ((java.lang.Integer) obj2).intValue();
                if (t10Var2.lpprD5VAS(intValue2 & 1, (intValue2 & 3) != 2)) {
                    defpackage.of1.oh6vYeIP("Scuttle the ledger?", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var2.SH1y5HwkJhh(defpackage.dk1.IHQe1A4L2xu)).AARZUJiTa, t10Var2, 6, 0, 131070);
                } else {
                    t10Var2.WLpAkxCo();
                }
                return ok1Var;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.t10 t10Var3 = (defpackage.t10) obj;
                int intValue3 = ((java.lang.Integer) obj2).intValue();
                if (t10Var3.lpprD5VAS(intValue3 & 1, (intValue3 & 3) != 2)) {
                    defpackage.of1.oh6vYeIP("Every relic, doubloon and shard you have gathered will be lost for good.", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var3.SH1y5HwkJhh(defpackage.dk1.IHQe1A4L2xu)).SH1y5HwkJhh, t10Var3, 6, 0, 131070);
                } else {
                    t10Var3.WLpAkxCo();
                }
                return ok1Var;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.t10 t10Var4 = (defpackage.t10) obj;
                int intValue4 = ((java.lang.Integer) obj2).intValue();
                if (t10Var4.lpprD5VAS(intValue4 & 1, (intValue4 & 3) != 2)) {
                    defpackage.of1.oh6vYeIP("Scuttle the ledger?", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var4.SH1y5HwkJhh(defpackage.dk1.IHQe1A4L2xu)).AARZUJiTa, t10Var4, 6, 0, 131070);
                } else {
                    t10Var4.WLpAkxCo();
                }
                return ok1Var;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.t10 t10Var5 = (defpackage.t10) obj;
                int intValue5 = ((java.lang.Integer) obj2).intValue();
                if (t10Var5.lpprD5VAS(intValue5 & 1, (intValue5 & 3) != 2)) {
                    defpackage.of1.oh6vYeIP("Every relic, doubloon and shard you have gathered will be lost for good.", null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, ((defpackage.bk1) t10Var5.SH1y5HwkJhh(defpackage.dk1.IHQe1A4L2xu)).SH1y5HwkJhh, t10Var5, 6, 0, 131070);
                } else {
                    t10Var5.WLpAkxCo();
                }
                return ok1Var;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.lj ljVar = (defpackage.lj) obj;
                defpackage.jj jjVar2 = (defpackage.jj) obj2;
                ljVar.getClass();
                jjVar2.getClass();
                defpackage.lj V7bD7b8KA = ljVar.V7bD7b8KA(jjVar2.getKey());
                defpackage.lt ltVar = defpackage.lt.adDC3e2L;
                if (V7bD7b8KA == ltVar) {
                    return jjVar2;
                }
                defpackage.n nVar = defpackage.n.QQUzIjv3iOC5;
                defpackage.nj njVar = (defpackage.nj) V7bD7b8KA.cnag84Bm(nVar);
                if (njVar == null) {
                    veVar = new defpackage.ve(jjVar2, V7bD7b8KA);
                } else {
                    defpackage.lj V7bD7b8KA2 = V7bD7b8KA.V7bD7b8KA(nVar);
                    if (V7bD7b8KA2 == ltVar) {
                        return new defpackage.ve(njVar, jjVar2);
                    }
                    veVar = new defpackage.ve(njVar, new defpackage.ve(jjVar2, V7bD7b8KA2));
                }
                return veVar;
            case 9:
                return ((defpackage.lj) obj).JlrlGoKF((defpackage.jj) obj2);
            case 10:
                return ((defpackage.lj) obj).JlrlGoKF((defpackage.jj) obj2);
            case 11:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                bool.booleanValue();
                return bool;
            case 12:
                ((java.lang.Integer) obj2).getClass();
                defpackage.fm.adDC3e2L((defpackage.t10) obj, defpackage.a70.hyxIchWRW(1));
                return ok1Var;
            case 13:
                defpackage.yc0 yc0Var = (defpackage.yc0) obj2;
                return defpackage.fm.yIx6ChFVk(java.lang.Integer.valueOf(((defpackage.nt0) yc0Var.adDC3e2L.oh6vYeIP).AARZUJiTa()), java.lang.Integer.valueOf(((defpackage.nt0) yc0Var.adDC3e2L.r1MBDhnF).AARZUJiTa()));
            case 14:
                java.util.Map adDC3e2L = ((defpackage.bd0) obj2).adDC3e2L();
                if (adDC3e2L.isEmpty()) {
                    return null;
                }
                return adDC3e2L;
            case 15:
                defpackage.qn0 qn0Var = (defpackage.qn0) obj2;
                defpackage.ym0 ym0Var = qn0Var.oh6vYeIP;
                java.util.LinkedHashMap linkedHashMap = ym0Var.DFo87pBq1E5;
                defpackage.l6 l6Var = ym0Var.xiZrDbcSW0;
                java.util.LinkedHashMap linkedHashMap2 = ym0Var.JlrlGoKF;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                android.os.Bundle SyNS6RMn = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                for (java.util.Map.Entry entry : defpackage.yh0.XZx205DYe(ym0Var.EgCjBq0SZwJ.IHQe1A4L2xu).entrySet()) {
                    ((defpackage.oo0) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundle = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                    defpackage.l80.abhbClRa(SyNS6RMn, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundle.putBundle("android-support-nav:controller:navigatorState", SyNS6RMn);
                }
                if (!l6Var.isEmpty()) {
                    if (bundle == null) {
                        bundle = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                    }
                    java.util.ArrayList<? extends android.os.Parcelable> arrayList2 = new java.util.ArrayList<>();
                    java.util.Iterator<E> it = l6Var.iterator();
                    while (it.hasNext()) {
                        defpackage.nm0 nm0Var = (defpackage.nm0) it.next();
                        nm0Var.getClass();
                        int i2 = nm0Var.xiZrDbcSW0.xiZrDbcSW0.IHQe1A4L2xu;
                        java.lang.String str2 = nm0Var.SH1y5HwkJhh;
                        defpackage.pm0 pm0Var = nm0Var.JlrlGoKF;
                        android.os.Bundle IHQe1A4L2xu = pm0Var.IHQe1A4L2xu();
                        android.os.Bundle SyNS6RMn2 = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                        pm0Var.EXtogiMhuM.abhbClRa(SyNS6RMn2);
                        android.os.Bundle SyNS6RMn3 = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                        str2.getClass();
                        SyNS6RMn3.putString("nav-entry-state:id", str2);
                        SyNS6RMn3.putInt("nav-entry-state:destination-id", i2);
                        if (IHQe1A4L2xu == null) {
                            IHQe1A4L2xu = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                        }
                        SyNS6RMn3.putBundle("nav-entry-state:args", IHQe1A4L2xu);
                        SyNS6RMn3.putBundle("nav-entry-state:saved-state", SyNS6RMn2);
                        arrayList2.add(SyNS6RMn3);
                    }
                    bundle.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap2.isEmpty()) {
                    if (bundle == null) {
                        bundle = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap2.size()];
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    int i3 = 0;
                    for (java.util.Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        int intValue6 = ((java.lang.Number) entry2.getKey()).intValue();
                        java.lang.String str3 = (java.lang.String) entry2.getValue();
                        int i4 = i3 + 1;
                        iArr[i3] = intValue6;
                        if (str3 == null) {
                            str3 = "";
                        }
                        arrayList3.add(str3);
                        i3 = i4;
                    }
                    bundle.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    defpackage.l80.abhbClRa(bundle, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundle == null) {
                        bundle = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                    }
                    java.util.ArrayList arrayList4 = new java.util.ArrayList();
                    for (java.util.Map.Entry entry3 : linkedHashMap.entrySet()) {
                        java.lang.String str4 = (java.lang.String) entry3.getKey();
                        defpackage.l6 l6Var2 = (defpackage.l6) entry3.getValue();
                        arrayList4.add(str4);
                        java.util.ArrayList<? extends android.os.Parcelable> arrayList5 = new java.util.ArrayList<>();
                        java.util.Iterator it2 = l6Var2.iterator();
                        while (it2.hasNext()) {
                            defpackage.r2 r2Var = ((defpackage.rm0) it2.next()).IHQe1A4L2xu;
                            r2Var.getClass();
                            android.os.Bundle SyNS6RMn4 = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                            java.lang.String str5 = (java.lang.String) r2Var.oh6vYeIP;
                            str5.getClass();
                            SyNS6RMn4.putString("nav-entry-state:id", str5);
                            SyNS6RMn4.putInt("nav-entry-state:destination-id", r2Var.IHQe1A4L2xu);
                            android.os.Bundle bundle2 = (android.os.Bundle) r2Var.r1MBDhnF;
                            if (bundle2 == null) {
                                bundle2 = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                            }
                            SyNS6RMn4.putBundle("nav-entry-state:args", bundle2);
                            android.os.Bundle bundle3 = (android.os.Bundle) r2Var.F7NU4MC0GW;
                            bundle3.getClass();
                            SyNS6RMn4.putBundle("nav-entry-state:saved-state", bundle3);
                            arrayList5.add(SyNS6RMn4);
                        }
                        bundle.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str4, arrayList5);
                    }
                    defpackage.l80.abhbClRa(bundle, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (qn0Var.adDC3e2L) {
                    if (bundle == null) {
                        bundle = defpackage.w70.SyNS6RMn((defpackage.et0[]) java.util.Arrays.copyOf(new defpackage.et0[0], 0));
                    }
                    bundle.putBoolean("android-support-nav:controller:deepLinkHandled", qn0Var.adDC3e2L);
                }
                return bundle;
            case 16:
                return java.lang.Integer.valueOf(((java.lang.Integer) obj).intValue() + 1);
            case 17:
                defpackage.s31 s31Var = (defpackage.s31) obj2;
                java.util.Map map = s31Var.adDC3e2L;
                defpackage.nl0 nl0Var = s31Var.xiZrDbcSW0;
                java.lang.Object[] objArr = nl0Var.oh6vYeIP;
                java.lang.Object[] objArr2 = nl0Var.r1MBDhnF;
                long[] jArr = nl0Var.IHQe1A4L2xu;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j = jArr[i5];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i6 = 8 - ((~(i5 - length)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((255 & j) < 128) {
                                    int i8 = (i5 << 3) + i7;
                                    java.lang.Object obj3 = objArr[i8];
                                    java.util.Map adDC3e2L2 = ((defpackage.t31) objArr2[i8]).adDC3e2L();
                                    if (adDC3e2L2.isEmpty()) {
                                        map.remove(obj3);
                                    } else {
                                        map.put(obj3, adDC3e2L2);
                                    }
                                }
                                j >>= 8;
                            }
                            if (i6 != 8) {
                            }
                        }
                        if (i5 != length) {
                            i5++;
                        }
                    }
                }
                if (map.isEmpty()) {
                    return null;
                }
                return map;
            case 18:
                return obj2;
            case 19:
                defpackage.l5 l5Var = (defpackage.l5) obj2;
                return defpackage.fm.QoRHpC4k(l5Var.xiZrDbcSW0, defpackage.q41.IHQe1A4L2xu(l5Var.adDC3e2L, defpackage.q41.IHQe1A4L2xu, (defpackage.q31) obj));
            case 20:
                return java.lang.Integer.valueOf(((defpackage.ff1) obj2).IHQe1A4L2xu);
            case 21:
                defpackage.jf1 jf1Var = (defpackage.jf1) obj2;
                return defpackage.fm.QoRHpC4k(java.lang.Float.valueOf(jf1Var.IHQe1A4L2xu), java.lang.Float.valueOf(jf1Var.oh6vYeIP));
            case 22:
                defpackage.q31 q31Var = (defpackage.q31) obj;
                defpackage.kf1 kf1Var = (defpackage.kf1) obj2;
                defpackage.fg1 fg1Var = new defpackage.fg1(kf1Var.IHQe1A4L2xu);
                defpackage.p41 p41Var = defpackage.q41.V7bD7b8KA;
                return defpackage.fm.QoRHpC4k(defpackage.q41.IHQe1A4L2xu(fg1Var, p41Var, q31Var), defpackage.q41.IHQe1A4L2xu(new defpackage.fg1(kf1Var.oh6vYeIP), p41Var, q31Var));
            case 23:
                return java.lang.Integer.valueOf(((defpackage.dz) obj2).adDC3e2L);
            case 24:
                defpackage.pe0 pe0Var = (defpackage.pe0) obj2;
                return defpackage.fm.QoRHpC4k(pe0Var.IHQe1A4L2xu, defpackage.q41.IHQe1A4L2xu(pe0Var.oh6vYeIP, defpackage.q41.riuEU0zW4, (defpackage.q31) obj));
            case 25:
                return java.lang.Float.valueOf(((defpackage.w7) obj2).IHQe1A4L2xu);
            case 26:
                defpackage.q31 q31Var2 = (defpackage.q31) obj;
                java.util.List list = (java.util.List) obj2;
                java.util.ArrayList arrayList6 = new java.util.ArrayList(list.size());
                int size = list.size();
                for (int i9 = 0; i9 < size; i9++) {
                    arrayList6.add(defpackage.q41.IHQe1A4L2xu((defpackage.k5) list.get(i9), defpackage.q41.oh6vYeIP, q31Var2));
                }
                return arrayList6;
            case 27:
                defpackage.wf1 wf1Var = (defpackage.wf1) obj2;
                return defpackage.fm.QoRHpC4k(java.lang.Integer.valueOf((int) (wf1Var.IHQe1A4L2xu >> 32)), java.lang.Integer.valueOf((int) (wf1Var.IHQe1A4L2xu & 4294967295L)));
            case 28:
                defpackage.q31 q31Var3 = (defpackage.q31) obj;
                defpackage.c91 c91Var = (defpackage.c91) obj2;
                return defpackage.fm.QoRHpC4k(defpackage.q41.IHQe1A4L2xu(new defpackage.ae(c91Var.IHQe1A4L2xu), defpackage.q41.QoRHpC4k, q31Var3), defpackage.q41.IHQe1A4L2xu(new defpackage.gq0(c91Var.oh6vYeIP), defpackage.q41.abhbClRa, q31Var3), java.lang.Float.valueOf(c91Var.r1MBDhnF));
            default:
                return java.lang.Integer.valueOf(((defpackage.cf1) obj2).IHQe1A4L2xu);
        }
    }

    public /* synthetic */ e6(int i, byte b) {
        this.adDC3e2L = i;
    }
}
