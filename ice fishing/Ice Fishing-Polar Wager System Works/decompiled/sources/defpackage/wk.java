package defpackage;

/* loaded from: classes.dex */
public final class wk implements defpackage.oy0 {
    public final /* synthetic */ int IHQe1A4L2xu;
    public final int oh6vYeIP;
    public final defpackage.z10 r1MBDhnF;

    public /* synthetic */ wk(defpackage.z10 z10Var, int i, int i2) {
        this.IHQe1A4L2xu = i2;
        this.r1MBDhnF = z10Var;
        this.oh6vYeIP = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x038b, code lost:
    
        defpackage.db.fnWB2E7cs("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:?, code lost:
    
        return null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03fa A[LOOP:5: B:111:0x03d0->B:123:0x03fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x040a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04c4  */
    /* JADX WARN: Type inference failed for: r7v0, types: [ej] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v6 */
    @Override // defpackage.oy0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object get() {
        java.lang.String str;
        defpackage.ts tsVar;
        defpackage.o21 o21Var;
        java.lang.Object spVar;
        int i = this.IHQe1A4L2xu;
        int i2 = this.oh6vYeIP;
        defpackage.z10 z10Var = this.r1MBDhnF;
        int i3 = 4;
        int i4 = 0;
        switch (i) {
            case 0:
                defpackage.xk xkVar = (defpackage.xk) z10Var;
                defpackage.a6 a6Var = xkVar.IHQe1A4L2xu;
                ?? r7 = 0;
                r7 = 0;
                switch (i2) {
                    case 0:
                        return new defpackage.b10(a6Var.IHQe1A4L2xu, (defpackage.uj) xkVar.r1MBDhnF.get(), (defpackage.t81) xkVar.adDC3e2L.get());
                    case 1:
                        defpackage.bn bnVar = defpackage.bq.IHQe1A4L2xu;
                        defpackage.vm vmVar = defpackage.vm.AARZUJiTa;
                        defpackage.e90.SH1y5HwkJhh(vmVar);
                        return defpackage.h1.oh6vYeIP(defpackage.ci0.hkbnNdmy(defpackage.c80.SH1y5HwkJhh(), vmVar));
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        return new defpackage.t81((defpackage.el) xkVar.F7NU4MC0GW.get());
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        defpackage.w5 w5Var = new defpackage.w5(a6Var.IHQe1A4L2xu, i4);
                        defpackage.bn bnVar2 = defpackage.bq.IHQe1A4L2xu;
                        defpackage.vm vmVar2 = defpackage.vm.AARZUJiTa;
                        defpackage.ld1 SH1y5HwkJhh = defpackage.c80.SH1y5HwkJhh();
                        vmVar2.getClass();
                        int i5 = 12;
                        return new defpackage.vw0(new defpackage.vw0(new defpackage.bm(new defpackage.hv(new defpackage.s4(10, w5Var)), defpackage.fm.p4kuH6PDtgom(new defpackage.adDC3e2L(defpackage.nt.adDC3e2L, (defpackage.ej) r7, i5)), new defpackage.ky(i5), defpackage.h1.oh6vYeIP(defpackage.ci0.hkbnNdmy(vmVar2, SH1y5HwkJhh)))));
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        com.corsair.ledger.data.local.CorsairDatabase corsairDatabase = (com.corsair.ledger.data.local.CorsairDatabase) xkVar.AARZUJiTa.get();
                        com.corsair.ledger.data.local.CorsairDatabase corsairDatabase2 = (com.corsair.ledger.data.local.CorsairDatabase) xkVar.AARZUJiTa.get();
                        corsairDatabase2.getClass();
                        defpackage.a10 DFo87pBq1E5 = corsairDatabase2.DFo87pBq1E5();
                        defpackage.e90.SH1y5HwkJhh(DFo87pBq1E5);
                        defpackage.x5 x5Var = (defpackage.x5) xkVar.EXtogiMhuM.get();
                        defpackage.bn bnVar3 = defpackage.bq.IHQe1A4L2xu;
                        defpackage.vm vmVar3 = defpackage.vm.AARZUJiTa;
                        defpackage.e90.SH1y5HwkJhh(vmVar3);
                        return new defpackage.l10(corsairDatabase, DFo87pBq1E5, x5Var, vmVar3);
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        android.content.Context context = a6Var.IHQe1A4L2xu;
                        if (defpackage.rc1.AQHddgaEX("corsair_ledger.db")) {
                            defpackage.db.fnWB2E7cs("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
                            return null;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        defpackage.u50 u50Var = new defpackage.u50(2);
                        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
                        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        defpackage.xc IHQe1A4L2xu = defpackage.sz0.IHQe1A4L2xu(com.corsair.ledger.data.local.CorsairDatabase.class);
                        if (!linkedHashSet2.isEmpty()) {
                            java.util.Iterator it = linkedHashSet2.iterator();
                            while (it.hasNext()) {
                                int intValue = ((java.lang.Number) it.next()).intValue();
                                if (linkedHashSet.contains(java.lang.Integer.valueOf(intValue))) {
                                    defpackage.db.adDC3e2L(defpackage.fx0.SH1y5HwkJhh("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", intValue));
                                    return null;
                                }
                            }
                        }
                        defpackage.ky kyVar = new defpackage.ky(i3);
                        java.lang.Object systemService = context.getSystemService("activity");
                        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
                        defpackage.p21 p21Var = (activityManager == null || activityManager.isLowRamDevice()) ? defpackage.p21.adDC3e2L : defpackage.p21.xiZrDbcSW0;
                        defpackage.c6 c6Var = defpackage.d6.AARZUJiTa;
                        defpackage.dm dmVar = new defpackage.dm(context, "corsair_ledger.db", kyVar, u50Var, arrayList, false, p21Var, c6Var, c6Var, null, true, false, linkedHashSet, null, null, null, arrayList2, arrayList3, false, null, null);
                        java.lang.Class QoRHpC4k = defpackage.a70.QoRHpC4k(IHQe1A4L2xu);
                        java.lang.Package r0 = QoRHpC4k.getPackage();
                        if (r0 == null || (str = r0.getName()) == null) {
                            str = "";
                        }
                        java.lang.String canonicalName = QoRHpC4k.getCanonicalName();
                        canonicalName.getClass();
                        if (str.length() != 0) {
                            canonicalName = canonicalName.substring(str.length() + 1);
                        }
                        java.lang.String replace = canonicalName.replace('.', '_');
                        replace.getClass();
                        java.lang.String concat = replace.concat("_Impl");
                        try {
                            java.lang.Class<?> cls = java.lang.Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, QoRHpC4k.getClassLoader());
                            cls.getClass();
                            defpackage.q21 q21Var = (defpackage.q21) cls.getDeclaredConstructor(null).newInstance(null);
                            q21Var.getClass();
                            q21Var.ez2rX8ReCYw = true;
                            try {
                                tsVar = q21Var.F7NU4MC0GW();
                                tsVar.getClass();
                            } catch (defpackage.sp0 unused) {
                                tsVar = null;
                            }
                            if (tsVar == null) {
                                new defpackage.o21(dmVar, new defpackage.uc0(q21Var), new defpackage.iy(2, q21Var, defpackage.s21.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 1));
                                throw null;
                            }
                            q21Var.adDC3e2L = new defpackage.o21(dmVar, tsVar, new defpackage.iy(2, q21Var, defpackage.s21.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 2));
                            q21Var.xiZrDbcSW0 = q21Var.r1MBDhnF();
                            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                            java.util.Set AARZUJiTa = q21Var.AARZUJiTa();
                            java.util.List list = dmVar.SyNS6RMn;
                            int size = list.size();
                            boolean[] zArr = new boolean[size];
                            java.util.Iterator it2 = AARZUJiTa.iterator();
                            while (true) {
                                int i6 = -1;
                                if (it2.hasNext()) {
                                    defpackage.xc xcVar = (defpackage.xc) it2.next();
                                    int size2 = list.size() - 1;
                                    if (size2 >= 0) {
                                        while (true) {
                                            int i7 = size2 - 1;
                                            if (xcVar.F7NU4MC0GW(list.get(size2))) {
                                                zArr[size2] = true;
                                                i6 = size2;
                                            } else if (i7 >= 0) {
                                                size2 = i7;
                                            }
                                        }
                                    }
                                    if (i6 < 0) {
                                        defpackage.db.QoRHpC4k("A required auto migration spec (", xcVar.oh6vYeIP(), ") is missing in the database configuration.");
                                        return null;
                                    }
                                    linkedHashMap.put(xcVar, list.get(i6));
                                } else {
                                    int size3 = list.size() - 1;
                                    if (size3 >= 0) {
                                        while (true) {
                                            int i8 = size3 - 1;
                                            if (size3 < size && zArr[size3]) {
                                                if (i8 >= 0) {
                                                    size3 = i8;
                                                }
                                            }
                                        }
                                    }
                                    java.util.Iterator it3 = q21Var.oh6vYeIP(linkedHashMap).iterator();
                                    if (it3.hasNext()) {
                                        it3.next().getClass();
                                        defpackage.db.kd6TUFXn();
                                        return null;
                                    }
                                    java.util.LinkedHashMap EXtogiMhuM = q21Var.EXtogiMhuM();
                                    java.util.List list2 = dmVar.DFo87pBq1E5;
                                    boolean[] zArr2 = new boolean[list2.size()];
                                    for (java.util.Map.Entry entry : EXtogiMhuM.entrySet()) {
                                        defpackage.xc xcVar2 = (defpackage.xc) entry.getKey();
                                        for (defpackage.xc xcVar3 : (java.util.List) entry.getValue()) {
                                            int size4 = list2.size() - 1;
                                            if (size4 >= 0) {
                                                while (true) {
                                                    int i9 = size4 - 1;
                                                    if (xcVar3.F7NU4MC0GW(list2.get(size4))) {
                                                        zArr2[size4] = true;
                                                    } else if (i9 >= 0) {
                                                        size4 = i9;
                                                    }
                                                }
                                                if (size4 >= 0) {
                                                    defpackage.db.ez2rX8ReCYw("A required type converter (", xcVar3.oh6vYeIP(), ") for ", xcVar2.oh6vYeIP(), " is missing in the database configuration.");
                                                    return null;
                                                }
                                                java.lang.Object obj = list2.get(size4);
                                                xcVar3.getClass();
                                                obj.getClass();
                                                q21Var.SH1y5HwkJhh.put(xcVar3, obj);
                                            }
                                            size4 = -1;
                                            if (size4 >= 0) {
                                            }
                                        }
                                    }
                                    int size5 = list2.size() - 1;
                                    if (size5 >= 0) {
                                        while (true) {
                                            int i10 = size5 - 1;
                                            if (!zArr2[size5]) {
                                                throw new java.lang.IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                                            }
                                            if (i10 >= 0) {
                                                size5 = i10;
                                            }
                                        }
                                    }
                                    q21Var.r1MBDhnF = dmVar.EXtogiMhuM;
                                    q21Var.F7NU4MC0GW = new defpackage.yh1(dmVar.riuEU0zW4);
                                    java.util.concurrent.Executor executor = q21Var.r1MBDhnF;
                                    if (executor == null) {
                                        defpackage.x70.Ye0N2xE9Hc("internalQueryExecutor");
                                        throw null;
                                    }
                                    defpackage.dj oh6vYeIP = defpackage.h1.oh6vYeIP(defpackage.ci0.hkbnNdmy(new defpackage.ru(executor), defpackage.c80.SH1y5HwkJhh()));
                                    q21Var.IHQe1A4L2xu = oh6vYeIP;
                                    defpackage.lj ljVar = oh6vYeIP.adDC3e2L;
                                    defpackage.yh1 yh1Var = q21Var.F7NU4MC0GW;
                                    if (yh1Var == null) {
                                        defpackage.x70.Ye0N2xE9Hc("internalTransactionExecutor");
                                        throw null;
                                    }
                                    q21Var.oh6vYeIP = ljVar.JlrlGoKF(new defpackage.ru(yh1Var));
                                    q21Var.EXtogiMhuM = dmVar.xiZrDbcSW0;
                                    defpackage.o21 o21Var2 = q21Var.adDC3e2L;
                                    if (o21Var2 == null) {
                                        defpackage.x70.Ye0N2xE9Hc("connectionManager");
                                        throw null;
                                    }
                                    defpackage.nd1 nd1Var = o21Var2.AARZUJiTa;
                                    if (nd1Var != null) {
                                        while (!(nd1Var instanceof defpackage.mw0)) {
                                            if (nd1Var instanceof defpackage.mn) {
                                                nd1Var = ((defpackage.mn) nd1Var).oh6vYeIP();
                                            }
                                        }
                                        o21Var = q21Var.adDC3e2L;
                                        if (o21Var != null) {
                                            defpackage.x70.Ye0N2xE9Hc("connectionManager");
                                            throw null;
                                        }
                                        defpackage.nd1 nd1Var2 = o21Var.AARZUJiTa;
                                        if (nd1Var2 != null) {
                                            while (true) {
                                                if (nd1Var2 instanceof defpackage.a7) {
                                                    r7 = nd1Var2;
                                                } else if (nd1Var2 instanceof defpackage.mn) {
                                                    nd1Var2 = ((defpackage.mn) nd1Var2).oh6vYeIP();
                                                }
                                            }
                                        }
                                        return (com.corsair.ledger.data.local.CorsairDatabase) q21Var;
                                    }
                                    nd1Var = null;
                                    o21Var = q21Var.adDC3e2L;
                                    if (o21Var != null) {
                                    }
                                }
                            }
                        } catch (java.lang.ClassNotFoundException e) {
                            throw new java.lang.RuntimeException("Cannot find implementation for " + QoRHpC4k.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
                        } catch (java.lang.IllegalAccessException e2) {
                            throw new java.lang.RuntimeException("Cannot access the constructor " + QoRHpC4k.getCanonicalName(), e2);
                        } catch (java.lang.InstantiationException e3) {
                            throw new java.lang.RuntimeException("Failed to create an instance of " + QoRHpC4k.getCanonicalName(), e3);
                        }
                        break;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        return new defpackage.x5();
                    default:
                        throw new java.lang.AssertionError(i2);
                }
            default:
                defpackage.yk ykVar = (defpackage.yk) z10Var;
                switch (i2) {
                    case 0:
                        defpackage.oa IHQe1A4L2xu2 = ykVar.IHQe1A4L2xu();
                        defpackage.xk xkVar2 = ykVar.oh6vYeIP;
                        return new defpackage.b(IHQe1A4L2xu2, new defpackage.vc((defpackage.l10) xkVar2.riuEU0zW4.get(), 1), new defpackage.vc((defpackage.l10) xkVar2.riuEU0zW4.get(), 0));
                    case 1:
                        spVar = new defpackage.sp(new defpackage.vc((defpackage.l10) ykVar.oh6vYeIP.riuEU0zW4.get(), 5), new defpackage.vc((defpackage.l10) ykVar.oh6vYeIP.riuEU0zW4.get(), 6));
                        break;
                    case defpackage.gx0.FLOAT_FIELD_NUMBER /* 2 */:
                        spVar = new defpackage.s30(new defpackage.vc((defpackage.l10) ykVar.oh6vYeIP.riuEU0zW4.get(), 5), new defpackage.vc((defpackage.l10) ykVar.oh6vYeIP.riuEU0zW4.get(), 2));
                        break;
                    case defpackage.gx0.INTEGER_FIELD_NUMBER /* 3 */:
                        return new defpackage.sf0(ykVar.IHQe1A4L2xu());
                    case defpackage.gx0.LONG_FIELD_NUMBER /* 4 */:
                        return new defpackage.lg0(new defpackage.zp0((defpackage.t81) ykVar.oh6vYeIP.adDC3e2L.get(), 0));
                    case defpackage.gx0.STRING_FIELD_NUMBER /* 5 */:
                        defpackage.oa IHQe1A4L2xu3 = ykVar.IHQe1A4L2xu();
                        defpackage.xk xkVar3 = ykVar.oh6vYeIP;
                        spVar = new defpackage.wh0(IHQe1A4L2xu3, new defpackage.oa((defpackage.l10) xkVar3.riuEU0zW4.get(), (defpackage.x5) xkVar3.EXtogiMhuM.get(), 5), new defpackage.oa((defpackage.l10) xkVar3.riuEU0zW4.get(), (defpackage.x5) xkVar3.EXtogiMhuM.get(), 2));
                        break;
                    case defpackage.gx0.STRING_SET_FIELD_NUMBER /* 6 */:
                        defpackage.oa IHQe1A4L2xu4 = ykVar.IHQe1A4L2xu();
                        defpackage.xk xkVar4 = ykVar.oh6vYeIP;
                        return new defpackage.wi0(IHQe1A4L2xu4, new defpackage.oa((defpackage.l10) xkVar4.riuEU0zW4.get(), (defpackage.x5) xkVar4.EXtogiMhuM.get(), 4));
                    case defpackage.gx0.DOUBLE_FIELD_NUMBER /* 7 */:
                        defpackage.y31 y31Var = ykVar.IHQe1A4L2xu;
                        defpackage.xk xkVar5 = ykVar.oh6vYeIP;
                        return new defpackage.u01(y31Var, ykVar.IHQe1A4L2xu(), new defpackage.vc((defpackage.l10) xkVar5.riuEU0zW4.get(), 1), new defpackage.vc((defpackage.l10) xkVar5.riuEU0zW4.get(), 7), new defpackage.vc((defpackage.l10) xkVar5.riuEU0zW4.get(), 8));
                    case defpackage.gx0.BYTES_FIELD_NUMBER /* 8 */:
                        defpackage.xk xkVar6 = ykVar.oh6vYeIP;
                        defpackage.xk xkVar7 = ykVar.oh6vYeIP;
                        return new defpackage.z81(new defpackage.zp0((defpackage.t81) xkVar6.adDC3e2L.get(), 0), new defpackage.zp0((defpackage.t81) xkVar7.adDC3e2L.get(), 1), new defpackage.oa((defpackage.l10) xkVar7.riuEU0zW4.get(), (defpackage.x5) xkVar7.EXtogiMhuM.get(), 4));
                    case 9:
                        defpackage.oa IHQe1A4L2xu5 = ykVar.IHQe1A4L2xu();
                        defpackage.xk xkVar8 = ykVar.oh6vYeIP;
                        return new defpackage.wh1(IHQe1A4L2xu5, new defpackage.oa((defpackage.l10) xkVar8.riuEU0zW4.get(), (defpackage.x5) xkVar8.EXtogiMhuM.get(), 1), new defpackage.vc((defpackage.l10) xkVar8.riuEU0zW4.get(), 3), new defpackage.oa((defpackage.l10) xkVar8.riuEU0zW4.get(), (defpackage.x5) xkVar8.EXtogiMhuM.get(), 0));
                    case 10:
                        return new defpackage.fm1(ykVar.IHQe1A4L2xu(), new defpackage.vc((defpackage.l10) ykVar.oh6vYeIP.riuEU0zW4.get(), 4));
                    default:
                        throw new java.lang.AssertionError(i2);
                }
                return spVar;
        }
    }
}
