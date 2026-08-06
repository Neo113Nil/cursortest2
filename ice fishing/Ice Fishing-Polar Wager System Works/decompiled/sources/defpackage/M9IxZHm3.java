package defpackage;

/* loaded from: classes.dex */
public final class M9IxZHm3 implements defpackage.iw {
    public final /* synthetic */ int adDC3e2L;
    public final /* synthetic */ java.lang.Object xiZrDbcSW0;

    public /* synthetic */ M9IxZHm3(int i, java.lang.Object obj) {
        this.adDC3e2L = i;
        this.xiZrDbcSW0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x03b9, code lost:
    
        if (r0 == r13) goto L155;
     */
    @Override // defpackage.iw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object EXtogiMhuM(java.lang.Object obj, defpackage.ej ejVar) {
        int i;
        java.lang.Object xiZrDbcSW0;
        java.lang.String str;
        int i2;
        int i3;
        boolean z;
        defpackage.ap apVar;
        java.lang.Object value;
        boolean z2;
        defpackage.j30 j30Var;
        java.lang.Object obj2;
        boolean z3;
        int i4;
        java.lang.Object obj3;
        int i5;
        java.lang.Object value2;
        java.lang.Object value3;
        defpackage.nu nuVar;
        int i6 = this.adDC3e2L;
        defpackage.vo voVar = defpackage.vo.IHQe1A4L2xu;
        defpackage.to toVar = defpackage.to.IHQe1A4L2xu;
        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
        int i7 = 10;
        defpackage.nu nuVar2 = null;
        defpackage.ok1 ok1Var = defpackage.ok1.IHQe1A4L2xu;
        java.lang.Object obj4 = this.xiZrDbcSW0;
        switch (i6) {
            case 0:
                boolean z4 = true;
                defpackage.k11 k11Var = (defpackage.k11) obj;
                defpackage.hc1 hc1Var = ((defpackage.b) obj4).F7NU4MC0GW;
                boolean z5 = ((defpackage.X7qitFj8) hc1Var.getValue()).AARZUJiTa;
                defpackage.n10 n10Var = k11Var.IHQe1A4L2xu;
                int i8 = n10Var.IHQe1A4L2xu;
                defpackage.fu<com.corsair.ledger.domain.model.Rarity> oh6vYeIP = com.corsair.ledger.domain.model.Rarity.oh6vYeIP();
                java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(oh6vYeIP, 10));
                for (com.corsair.ledger.domain.model.Rarity rarity : oh6vYeIP) {
                    arrayList.add(new defpackage.et0(rarity, java.lang.Integer.valueOf(n10Var.r1MBDhnF(rarity))));
                }
                int IHQe1A4L2xu = k11Var.IHQe1A4L2xu();
                int i9 = defpackage.d01.F7NU4MC0GW;
                defpackage.gu guVar = defpackage.o01.QoRHpC4k;
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(guVar, 10));
                java.util.Iterator it = guVar.iterator();
                while (it.hasNext()) {
                    defpackage.o01 o01Var = (defpackage.o01) it.next();
                    java.util.Map map = n10Var.EXtogiMhuM;
                    map.getClass();
                    o01Var.getClass();
                    java.util.List list = (java.util.List) defpackage.yh0.p4kuH6PDtgom(o01Var, defpackage.d01.r1MBDhnF);
                    if (list == null || !list.isEmpty()) {
                        java.util.Iterator it2 = list.iterator();
                        i = 0;
                        while (it2.hasNext()) {
                            java.lang.Integer num = (java.lang.Integer) map.get(((defpackage.a01) it2.next()).IHQe1A4L2xu);
                            if ((num != null ? num.intValue() : 0) > 0 && (i = i + 1) < 0) {
                                defpackage.fm.lpprD5VAS();
                                throw null;
                            }
                        }
                    } else {
                        i = 0;
                    }
                    boolean contains = n10Var.riuEU0zW4.contains(o01Var);
                    java.lang.String str2 = o01Var.adDC3e2L;
                    java.lang.String str3 = o01Var.xiZrDbcSW0;
                    int i10 = o01Var.AARZUJiTa;
                    boolean z6 = (contains || i != 8) ? false : z4;
                    java.util.List<defpackage.a01> list2 = (java.util.List) defpackage.yh0.p4kuH6PDtgom(o01Var, defpackage.d01.r1MBDhnF);
                    java.util.ArrayList arrayList3 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(list2, i7));
                    for (defpackage.a01 a01Var : list2) {
                        java.lang.String str4 = a01Var.IHQe1A4L2xu;
                        com.corsair.ledger.domain.model.Rarity rarity2 = a01Var.F7NU4MC0GW;
                        int oh6vYeIP2 = n10Var.oh6vYeIP(str4);
                        arrayList3.add(new defpackage.p01(a01Var, oh6vYeIP2 > 0, oh6vYeIP2, rarity2.IHQe1A4L2xu(), oh6vYeIP2 == 0 && n10Var.r1MBDhnF(rarity2) >= rarity2.IHQe1A4L2xu()));
                    }
                    arrayList2.add(new defpackage.d81(str2, str3, i, i10, contains, z6, arrayList3));
                    z4 = true;
                    i7 = 10;
                }
                hc1Var.ez2rX8ReCYw(null, new defpackage.X7qitFj8(false, i8, arrayList, arrayList2, IHQe1A4L2xu, i9, z5));
                return ok1Var;
            case 1:
                defpackage.bm bmVar = (defpackage.bm) obj4;
                return ((bmVar.EXtogiMhuM.oh6vYeIP() instanceof defpackage.sv) || (xiZrDbcSW0 = defpackage.bm.xiZrDbcSW0(bmVar, true, ejVar)) != vjVar) ? ok1Var : xiZrDbcSW0;
            case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ro roVar = (defpackage.ro) obj;
                defpackage.sp spVar = (defpackage.sp) obj4;
                defpackage.x9 x9Var = spVar.adDC3e2L;
                defpackage.hc1 hc1Var2 = spVar.r1MBDhnF;
                if (roVar == null) {
                    do {
                        value = hc1Var2.getValue();
                    } while (!hc1Var2.riuEU0zW4(value, defpackage.pp.IHQe1A4L2xu((defpackage.pp) value, false, 508)));
                    if (!spVar.riuEU0zW4) {
                        spVar.riuEU0zW4 = true;
                        java.lang.Object IHQe1A4L2xu2 = x9Var.IHQe1A4L2xu(ejVar, defpackage.dp.IHQe1A4L2xu);
                        if (IHQe1A4L2xu2 == vjVar) {
                            return IHQe1A4L2xu2;
                        }
                    }
                } else {
                    boolean z7 = ((defpackage.pp) hc1Var2.getValue()).riuEU0zW4;
                    defpackage.o80 o80Var = roVar.IHQe1A4L2xu;
                    java.lang.String str5 = o80Var.oh6vYeIP;
                    java.lang.String str6 = o80Var.r1MBDhnF;
                    int i11 = roVar.r1MBDhnF;
                    int i12 = o80Var.AARZUJiTa;
                    boolean z8 = roVar.F7NU4MC0GW;
                    java.util.ArrayList arrayList4 = roVar.oh6vYeIP;
                    java.util.ArrayList arrayList5 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(arrayList4, 10));
                    int size = arrayList4.size();
                    int i13 = 0;
                    while (i13 < size) {
                        java.lang.Object obj5 = arrayList4.get(i13);
                        int i14 = i13 + 1;
                        java.util.ArrayList arrayList6 = arrayList4;
                        defpackage.so soVar = (defpackage.so) obj5;
                        boolean z9 = soVar.r1MBDhnF;
                        int i15 = soVar.IHQe1A4L2xu;
                        if (z9) {
                            str = str6;
                            i2 = i11;
                            i3 = size;
                            defpackage.yo yoVar = soVar.oh6vYeIP;
                            if (yoVar instanceof defpackage.wo) {
                                java.util.List list3 = defpackage.d01.IHQe1A4L2xu;
                                java.lang.String str7 = ((defpackage.wo) yoVar).IHQe1A4L2xu;
                                apVar = new defpackage.ap(i15, defpackage.zo.xiZrDbcSW0, defpackage.d01.oh6vYeIP(str7).oh6vYeIP, defpackage.d01.oh6vYeIP(str7));
                                z = z8;
                            } else if (yoVar instanceof defpackage.uo) {
                                apVar = new defpackage.ap(i15, defpackage.zo.AARZUJiTa, defpackage.fx0.SH1y5HwkJhh("+", ((defpackage.uo) yoVar).IHQe1A4L2xu), null);
                            } else if (yoVar instanceof defpackage.xo) {
                                defpackage.xo xoVar = (defpackage.xo) yoVar;
                                int i16 = xoVar.oh6vYeIP;
                                java.lang.String r1MBDhnF = xoVar.IHQe1A4L2xu.r1MBDhnF();
                                r1MBDhnF.getClass();
                                if (r1MBDhnF.length() == 0) {
                                    throw new java.util.NoSuchElementException("Char sequence is empty.");
                                }
                                z = z8;
                                apVar = new defpackage.ap(i15, defpackage.zo.EXtogiMhuM, "+" + i16 + " " + r1MBDhnF.charAt(0), null);
                            } else {
                                z = z8;
                                if (defpackage.x70.QoRHpC4k(yoVar, toVar)) {
                                    apVar = new defpackage.ap(i15, defpackage.zo.SH1y5HwkJhh, "Cursed", null);
                                } else {
                                    if (!defpackage.x70.QoRHpC4k(yoVar, voVar)) {
                                        defpackage.db.F7NU4MC0GW();
                                        return null;
                                    }
                                    apVar = new defpackage.ap(i15, defpackage.zo.riuEU0zW4, "Sand", null);
                                }
                            }
                            arrayList5.add(apVar);
                            i13 = i14;
                            size = i3;
                            arrayList4 = arrayList6;
                            str6 = str;
                            i11 = i2;
                            z8 = z;
                        } else {
                            str = str6;
                            i2 = i11;
                            i3 = size;
                            apVar = new defpackage.ap(i15, defpackage.zo.adDC3e2L, "", null);
                        }
                        z = z8;
                        arrayList5.add(apVar);
                        i13 = i14;
                        size = i3;
                        arrayList4 = arrayList6;
                        str6 = str;
                        i11 = i2;
                        z8 = z;
                    }
                    hc1Var2.ez2rX8ReCYw(null, new defpackage.pp(false, true, str5, str6, i11, i12, arrayList5, z8, z7));
                    if (roVar.F7NU4MC0GW && !spVar.EXtogiMhuM) {
                        spVar.EXtogiMhuM = true;
                        java.lang.Object IHQe1A4L2xu3 = x9Var.IHQe1A4L2xu(ejVar, defpackage.ep.IHQe1A4L2xu);
                        if (IHQe1A4L2xu3 == vjVar) {
                            return IHQe1A4L2xu3;
                        }
                    }
                }
                return ok1Var;
            case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.ro roVar2 = (defpackage.ro) obj;
                defpackage.s30 s30Var = (defpackage.s30) obj4;
                if (roVar2 != null) {
                    defpackage.hc1 hc1Var3 = s30Var.r1MBDhnF;
                    boolean z10 = ((defpackage.r30) hc1Var3.getValue()).EXtogiMhuM;
                    java.util.ArrayList arrayList7 = roVar2.oh6vYeIP;
                    java.util.ArrayList arrayList8 = new java.util.ArrayList();
                    int size2 = arrayList7.size();
                    int i17 = 0;
                    while (i17 < size2) {
                        java.lang.Object obj6 = arrayList7.get(i17);
                        i17++;
                        if (((defpackage.so) obj6).r1MBDhnF) {
                            arrayList8.add(obj6);
                        }
                    }
                    java.util.ArrayList arrayList9 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(arrayList8, 10));
                    int size3 = arrayList8.size();
                    int i18 = 0;
                    int i19 = 0;
                    int i20 = 0;
                    int i21 = 0;
                    int i22 = 0;
                    while (i18 < size3) {
                        java.lang.Object obj7 = arrayList8.get(i18);
                        i18++;
                        defpackage.so soVar2 = (defpackage.so) obj7;
                        defpackage.yo yoVar2 = soVar2.oh6vYeIP;
                        int i23 = soVar2.IHQe1A4L2xu;
                        if (yoVar2 instanceof defpackage.wo) {
                            i19++;
                            java.util.List list4 = defpackage.d01.IHQe1A4L2xu;
                            defpackage.a01 oh6vYeIP3 = defpackage.d01.oh6vYeIP(((defpackage.wo) yoVar2).IHQe1A4L2xu);
                            z2 = z10;
                            j30Var = new defpackage.j30(defpackage.fx0.SH1y5HwkJhh("cell_", i23), oh6vYeIP3.oh6vYeIP, oh6vYeIP3.F7NU4MC0GW.r1MBDhnF() + " · " + oh6vYeIP3.r1MBDhnF.xiZrDbcSW0, oh6vYeIP3);
                        } else {
                            z2 = z10;
                            if (yoVar2 instanceof defpackage.uo) {
                                int i24 = ((defpackage.uo) yoVar2).IHQe1A4L2xu;
                                i20 += i24;
                                j30Var = new defpackage.j30(defpackage.fx0.SH1y5HwkJhh("cell_", i23), i24 + " doubloons", "Loose coin", null);
                            } else if (yoVar2 instanceof defpackage.xo) {
                                defpackage.xo xoVar2 = (defpackage.xo) yoVar2;
                                int i25 = xoVar2.oh6vYeIP;
                                i21 += i25;
                                java.lang.String SH1y5HwkJhh = defpackage.fx0.SH1y5HwkJhh("cell_", i23);
                                java.lang.String lowerCase = xoVar2.IHQe1A4L2xu.r1MBDhnF().toLowerCase(java.util.Locale.ROOT);
                                lowerCase.getClass();
                                j30Var = new defpackage.j30(SH1y5HwkJhh, i25 + " " + lowerCase + " shards", "For the forge", null);
                            } else if (defpackage.x70.QoRHpC4k(yoVar2, toVar)) {
                                i22++;
                                j30Var = new defpackage.j30(defpackage.fx0.SH1y5HwkJhh("cell_", i23), "Cursed sand", "Cost you a move", null);
                            } else {
                                if (!defpackage.x70.QoRHpC4k(yoVar2, voVar)) {
                                    defpackage.db.F7NU4MC0GW();
                                    return null;
                                }
                                j30Var = new defpackage.j30(defpackage.fx0.SH1y5HwkJhh("cell_", i23), "Nothing but sand", "It happens", null);
                            }
                        }
                        arrayList9.add(j30Var);
                        z10 = z2;
                    }
                    hc1Var3.ez2rX8ReCYw(null, new defpackage.r30(false, roVar2.IHQe1A4L2xu.oh6vYeIP, arrayList9, i19, i20, i21, i22, z10));
                } else if (!s30Var.EXtogiMhuM) {
                    s30Var.EXtogiMhuM = true;
                    java.lang.Object IHQe1A4L2xu4 = s30Var.adDC3e2L.IHQe1A4L2xu(ejVar, defpackage.i30.IHQe1A4L2xu);
                    if (IHQe1A4L2xu4 == vjVar) {
                        return IHQe1A4L2xu4;
                    }
                }
                return ok1Var;
            case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                defpackage.k11 k11Var2 = (defpackage.k11) obj;
                defpackage.hc1 hc1Var4 = ((defpackage.sf0) obj4).oh6vYeIP;
                defpackage.n10 n10Var2 = k11Var2.IHQe1A4L2xu;
                defpackage.nv0 nv0Var = n10Var2.xiZrDbcSW0;
                java.util.Set set = k11Var2.riuEU0zW4;
                int size4 = set.size();
                defpackage.gu guVar2 = defpackage.pm90rNzI5F.SH1y5HwkJhh;
                java.util.ArrayList arrayList10 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(guVar2, 10));
                java.util.Iterator it3 = guVar2.iterator();
                while (it3.hasNext()) {
                    defpackage.pm90rNzI5F pm90rnzi5f = (defpackage.pm90rNzI5F) it3.next();
                    arrayList10.add(new defpackage.WnQbjbWuMR(defpackage.x70.SyNS6RMn(pm90rnzi5f, n10Var2), pm90rnzi5f.EXtogiMhuM, pm90rnzi5f.adDC3e2L, pm90rnzi5f.xiZrDbcSW0, pm90rnzi5f.AARZUJiTa, set.contains(pm90rnzi5f)));
                    k11Var2 = k11Var2;
                }
                defpackage.rf0 rf0Var = new defpackage.rf0(false, arrayList10, defpackage.fm.yIx6ChFVk(new defpackage.et0("Relics in the ledger", k11Var2.IHQe1A4L2xu() + " / " + defpackage.d01.F7NU4MC0GW), new defpackage.et0("Squares dug", java.lang.String.valueOf(nv0Var.IHQe1A4L2xu)), new defpackage.et0("Relics recovered", java.lang.String.valueOf(nv0Var.oh6vYeIP)), new defpackage.et0("Legendaries found", java.lang.String.valueOf(nv0Var.r1MBDhnF)), new defpackage.et0("Relics forged", java.lang.String.valueOf(nv0Var.F7NU4MC0GW)), new defpackage.et0("Cursed squares", java.lang.String.valueOf(nv0Var.adDC3e2L)), new defpackage.et0("Bargains struck", java.lang.String.valueOf(nv0Var.xiZrDbcSW0)), new defpackage.et0("Spares sold", java.lang.String.valueOf(nv0Var.AARZUJiTa)), new defpackage.et0("Largest purse", java.lang.String.valueOf(nv0Var.EXtogiMhuM)), new defpackage.et0("Pages banked", n10Var2.riuEU0zW4.size() + " / 6")), size4);
                hc1Var4.getClass();
                hc1Var4.ez2rX8ReCYw(null, rf0Var);
                return ok1Var;
            case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                defpackage.k11 k11Var3 = (defpackage.k11) obj;
                defpackage.wh0 wh0Var = (defpackage.wh0) obj4;
                defpackage.hc1 hc1Var5 = wh0Var.F7NU4MC0GW;
                boolean z11 = ((defpackage.rh0) hc1Var5.getValue()).ez2rX8ReCYw;
                defpackage.n10 n10Var3 = k11Var3.IHQe1A4L2xu;
                int i26 = n10Var3.IHQe1A4L2xu;
                int i27 = k11Var3.r1MBDhnF;
                int i28 = k11Var3.F7NU4MC0GW;
                long j = k11Var3.adDC3e2L;
                java.lang.String fnWB2E7cs = j > 0 ? defpackage.x80.fnWB2E7cs(j) : null;
                java.util.List<defpackage.o80> list5 = defpackage.p80.IHQe1A4L2xu;
                java.util.ArrayList arrayList11 = new java.util.ArrayList(defpackage.ud.EoOhNTTfIN7K(list5, 10));
                for (defpackage.o80 o80Var2 : list5) {
                    java.util.Set set2 = k11Var3.xiZrDbcSW0;
                    java.lang.String str8 = o80Var2.IHQe1A4L2xu;
                    java.lang.String str9 = o80Var2.IHQe1A4L2xu;
                    boolean contains2 = set2.contains(str8);
                    defpackage.op opVar = n10Var3.SH1y5HwkJhh;
                    boolean QoRHpC4k = defpackage.x70.QoRHpC4k(opVar != null ? opVar.IHQe1A4L2xu : null, str9);
                    java.util.Iterator it4 = defpackage.p80.IHQe1A4L2xu.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            obj3 = it4.next();
                            z3 = z11;
                            i4 = i26;
                            if (((defpackage.o80) obj3).adDC3e2L != o80Var2.adDC3e2L - 1) {
                                i26 = i4;
                                z11 = z3;
                            }
                        } else {
                            z3 = z11;
                            i4 = i26;
                            obj3 = null;
                        }
                    }
                    defpackage.o80 o80Var3 = (defpackage.o80) obj3;
                    java.lang.String str10 = o80Var2.oh6vYeIP;
                    java.lang.String str11 = o80Var2.r1MBDhnF;
                    defpackage.o01 o01Var2 = o80Var2.F7NU4MC0GW;
                    int i29 = i27;
                    java.lang.String str12 = o01Var2.xiZrDbcSW0;
                    int i30 = o80Var2.xiZrDbcSW0;
                    java.util.Map map2 = n10Var3.EXtogiMhuM;
                    map2.getClass();
                    defpackage.n10 n10Var4 = n10Var3;
                    java.util.List list6 = (java.util.List) defpackage.yh0.p4kuH6PDtgom(o01Var2, defpackage.d01.r1MBDhnF);
                    if (list6 == null || !list6.isEmpty()) {
                        java.util.Iterator it5 = list6.iterator();
                        int i31 = 0;
                        while (it5.hasNext()) {
                            java.util.Iterator it6 = it5;
                            java.lang.Integer num2 = (java.lang.Integer) map2.get(((defpackage.a01) it5.next()).IHQe1A4L2xu);
                            if ((num2 != null ? num2.intValue() : 0) > 0 && (i31 = i31 + 1) < 0) {
                                defpackage.fm.lpprD5VAS();
                                throw null;
                            }
                            it5 = it6;
                        }
                        i5 = i31;
                    } else {
                        i5 = 0;
                    }
                    arrayList11.add(new defpackage.q80(str9, str10, str11, str12, i30, i5, contains2, k11Var3.r1MBDhnF >= o80Var2.xiZrDbcSW0, QoRHpC4k, QoRHpC4k && opVar != null && opVar.adDC3e2L, (opVar == null || QoRHpC4k) ? false : true, (contains2 || o80Var3 == null) ? null : defpackage.fx0.ez2rX8ReCYw("Gather 6 of 8 in ", o80Var3.F7NU4MC0GW.xiZrDbcSW0, " to sail on.")));
                    n10Var3 = n10Var4;
                    i26 = i4;
                    i27 = i29;
                    z11 = z3;
                }
                hc1Var5.ez2rX8ReCYw(null, new defpackage.rh0(false, i26, i27, i28, fnWB2E7cs, arrayList11, k11Var3.AARZUJiTa, defpackage.x80.fnWB2E7cs(k11Var3.EXtogiMhuM), k11Var3.IHQe1A4L2xu(), defpackage.d01.F7NU4MC0GW, z11));
                if (k11Var3.SH1y5HwkJhh && !k11Var3.IHQe1A4L2xu.adDC3e2L && !wh0Var.riuEU0zW4) {
                    wh0Var.riuEU0zW4 = true;
                    obj2 = wh0Var.xiZrDbcSW0.IHQe1A4L2xu(ejVar, new defpackage.vg0("victory"));
                    break;
                }
                obj2 = ok1Var;
                return obj2 == vjVar ? obj2 : ok1Var;
            case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.n10 n10Var5 = ((defpackage.k11) obj).IHQe1A4L2xu;
                boolean z12 = n10Var5.xiZrDbcSW0.IHQe1A4L2xu > 0 || !n10Var5.EXtogiMhuM.isEmpty();
                defpackage.hc1 hc1Var6 = ((defpackage.wi0) obj4).r1MBDhnF;
                do {
                    value2 = hc1Var6.getValue();
                } while (!hc1Var6.riuEU0zW4(value2, defpackage.vi0.IHQe1A4L2xu((defpackage.vi0) value2, z12, false, false, 6)));
                return ok1Var;
            case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                ((defpackage.tj0) obj4).AARZUJiTa.EXtogiMhuM(((java.lang.Number) obj).floatValue());
                return ok1Var;
            case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.k11 k11Var4 = (defpackage.k11) obj;
                defpackage.u01 u01Var = (defpackage.u01) obj4;
                defpackage.hc1 hc1Var7 = u01Var.xiZrDbcSW0;
                boolean z13 = ((defpackage.q01) hc1Var7.getValue()).SH1y5HwkJhh;
                java.util.List list7 = defpackage.d01.IHQe1A4L2xu;
                java.lang.String str13 = u01Var.adDC3e2L;
                defpackage.a01 oh6vYeIP4 = defpackage.d01.oh6vYeIP(str13);
                int oh6vYeIP5 = k11Var4.IHQe1A4L2xu.oh6vYeIP(str13);
                defpackage.n10 n10Var6 = k11Var4.IHQe1A4L2xu;
                com.corsair.ledger.domain.model.Rarity rarity3 = oh6vYeIP4.F7NU4MC0GW;
                int r1MBDhnF2 = n10Var6.r1MBDhnF(rarity3);
                hc1Var7.ez2rX8ReCYw(null, new defpackage.q01(false, oh6vYeIP4, oh6vYeIP5, r1MBDhnF2, rarity3.IHQe1A4L2xu(), rarity3.xiZrDbcSW0(), rarity3.AARZUJiTa(), oh6vYeIP5 == 0 && r1MBDhnF2 >= rarity3.IHQe1A4L2xu(), oh6vYeIP5 > 1, z13));
                return ok1Var;
            case 9:
                defpackage.m10 m10Var = (defpackage.m10) obj;
                defpackage.hc1 hc1Var8 = ((defpackage.z81) obj4).F7NU4MC0GW;
                do {
                    value3 = hc1Var8.getValue();
                } while (!hc1Var8.riuEU0zW4(value3, defpackage.w81.IHQe1A4L2xu((defpackage.w81) value3, m10Var.IHQe1A4L2xu, m10Var.oh6vYeIP, m10Var.r1MBDhnF, false, false, 24)));
                return ok1Var;
            case 10:
                defpackage.k11 k11Var5 = (defpackage.k11) obj;
                defpackage.hc1 hc1Var9 = ((defpackage.wh1) obj4).adDC3e2L;
                boolean z14 = ((defpackage.uh1) hc1Var9.getValue()).SyNS6RMn;
                defpackage.n10 n10Var7 = k11Var5.IHQe1A4L2xu;
                java.util.ArrayList mAr5m2L7gYDP = defpackage.x70.mAr5m2L7gYDP(n10Var7);
                int i32 = k11Var5.r1MBDhnF;
                int i33 = k11Var5.F7NU4MC0GW;
                boolean z15 = i32 >= i33;
                int i34 = n10Var7.IHQe1A4L2xu;
                long j2 = k11Var5.adDC3e2L;
                java.lang.String fnWB2E7cs2 = j2 > 0 ? defpackage.x80.fnWB2E7cs(j2) : null;
                boolean z16 = (z15 || i34 < 60 || z14) ? false : true;
                java.lang.String riuEU0zW4 = z15 ? "Your hold is already full." : i34 < 60 ? defpackage.fx0.riuEU0zW4(60 - i34, "You are ", " doubloons short.") : "Coin is endless if you keep digging — the sea is not.";
                defpackage.fu<com.corsair.ledger.domain.model.Rarity> oh6vYeIP6 = com.corsair.ledger.domain.model.Rarity.oh6vYeIP();
                java.util.ArrayList arrayList12 = new java.util.ArrayList();
                for (com.corsair.ledger.domain.model.Rarity rarity4 : oh6vYeIP6) {
                    com.corsair.ledger.domain.model.Rarity adDC3e2L = rarity4.adDC3e2L();
                    if (adDC3e2L == null) {
                        nuVar = nuVar2;
                    } else {
                        int r1MBDhnF3 = n10Var7.r1MBDhnF(rarity4);
                        nuVar = new defpackage.nu(rarity4, adDC3e2L, r1MBDhnF3, r1MBDhnF3 >= 5 && !z14);
                    }
                    if (nuVar != null) {
                        arrayList12.add(nuVar);
                    }
                    nuVar2 = null;
                }
                hc1Var9.ez2rX8ReCYw(null, new defpackage.uh1(false, i34, i32, i33, fnWB2E7cs2, 60, 5, z16, riuEU0zW4, arrayList12, 500, (mAr5m2L7gYDP.isEmpty() || i34 < 500 || z14) ? false : true, mAr5m2L7gYDP.isEmpty() ? "You already own every relic the trader can point you to." : i34 < 500 ? defpackage.fx0.riuEU0zW4(500 - i34, "You are ", " doubloons short.") : defpackage.fx0.riuEU0zW4(mAr5m2L7gYDP.size(), "Leads to one of the ", " relics still missing from your ledger."), z14));
                return ok1Var;
            default:
                defpackage.k11 k11Var6 = (defpackage.k11) obj;
                defpackage.hc1 hc1Var10 = ((defpackage.fm1) obj4).r1MBDhnF;
                boolean z17 = ((defpackage.em1) hc1Var10.getValue()).adDC3e2L;
                int IHQe1A4L2xu5 = k11Var6.IHQe1A4L2xu();
                int i35 = defpackage.d01.F7NU4MC0GW;
                defpackage.n10 n10Var8 = k11Var6.IHQe1A4L2xu;
                defpackage.et0 et0Var = new defpackage.et0("Squares dug", java.lang.String.valueOf(n10Var8.xiZrDbcSW0.IHQe1A4L2xu));
                defpackage.nv0 nv0Var2 = n10Var8.xiZrDbcSW0;
                hc1Var10.ez2rX8ReCYw(null, new defpackage.em1(false, IHQe1A4L2xu5, i35, defpackage.fm.yIx6ChFVk(et0Var, new defpackage.et0("Relics recovered", java.lang.String.valueOf(nv0Var2.oh6vYeIP)), new defpackage.et0("Relics forged", java.lang.String.valueOf(nv0Var2.F7NU4MC0GW)), new defpackage.et0("Legendaries", java.lang.String.valueOf(nv0Var2.r1MBDhnF)), new defpackage.et0("Cursed squares", java.lang.String.valueOf(nv0Var2.adDC3e2L)), new defpackage.et0("Largest purse", java.lang.String.valueOf(nv0Var2.EXtogiMhuM))), z17));
                return ok1Var;
        }
    }
}
