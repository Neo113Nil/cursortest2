package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public class pa1 implements defpackage.va, defpackage.ze1, defpackage.ax1, defpackage.tz, defpackage.k7, defpackage.m7, defpackage.im {
    public final /* synthetic */ int WDYagTQQm9ns;
    public static final defpackage.pa1 oh71FJcDz6S2 = new defpackage.pa1(0);
    public static final defpackage.p81 QiMR8OkAhezm = new defpackage.p81(1);
    public static final defpackage.p81 P05cfTpS5W5L = new defpackage.p81(2);
    public static final defpackage.p81 e6mdH7fiFuta = new defpackage.p81(3);
    public static final defpackage.p81 GE9mJIPrb8gP = new defpackage.p81(4);
    public static final defpackage.pa1 Ns0WNyEWdPsk = new defpackage.pa1(2);
    public static final defpackage.pa1 fNwYGHIYeJcR = new defpackage.pa1(3);
    public static final defpackage.pa1 h3m55N1URyyK = new defpackage.pa1(4);
    public static final defpackage.pa1 gUjdnLbkVAaA = new defpackage.pa1(5);
    public static final defpackage.p81 T1fB7bDYiVJQ = new defpackage.p81(8);
    public static final defpackage.p81 XntWc4eZSQ8j = new defpackage.p81(9);
    public static final defpackage.pa1 WmetiUbpKU9I = new defpackage.pa1(7);
    public static final defpackage.p81 s0TASMVLSWD5 = new defpackage.p81(11);
    public static final defpackage.pa1 BHfvd2J71qpO = new defpackage.pa1(9);
    public static final defpackage.bx1 ZVVdXbWmyCSK = new defpackage.bx1();

    public /* synthetic */ pa1(int i) {
        this.WDYagTQQm9ns = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b0, code lost:
    
        defpackage.h7.w7APNrr0aGRc("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x01b5, code lost:
    
        return null;
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.ice.fishing.wolberta.data.local.AppDatabase Ns0WNyEWdPsk(android.content.Context context) {
        java.lang.String str;
        defpackage.gu guVar;
        defpackage.yh1 yh1Var;
        defpackage.f61 f61Var;
        defpackage.yh1 yh1Var2;
        android.content.Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        if (defpackage.tg1.PS16moFv2oLu("app_db")) {
            defpackage.h7.w7APNrr0aGRc("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        defpackage.y70 y70Var = new defpackage.y70(2);
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        java.util.LinkedHashSet linkedHashSet2 = new java.util.LinkedHashSet();
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        defpackage.ne ZpBGe2uQfcn8 = defpackage.b41.ZpBGe2uQfcn8(com.ice.fishing.wolberta.data.local.AppDatabase.class);
        arrayList.add(new defpackage.y6(0, context));
        if (!linkedHashSet2.isEmpty()) {
            java.util.Iterator it = linkedHashSet2.iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                if (linkedHashSet.contains(java.lang.Integer.valueOf(intValue))) {
                    defpackage.h7.WDYagTQQm9ns(defpackage.pVQOaWB9QMo4.e6mdH7fiFuta("Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: ", intValue));
                    return null;
                }
            }
        }
        defpackage.hu huVar = new defpackage.hu(8);
        java.lang.Object systemService = applicationContext.getSystemService("activity");
        android.app.ActivityManager activityManager = systemService instanceof android.app.ActivityManager ? (android.app.ActivityManager) systemService : null;
        defpackage.g61 g61Var = (activityManager == null || activityManager.isLowRamDevice()) ? defpackage.g61.WDYagTQQm9ns : defpackage.g61.oh71FJcDz6S2;
        defpackage.f7 f7Var = defpackage.g7.QiMR8OkAhezm;
        defpackage.kn knVar = new defpackage.kn(applicationContext, "app_db", huVar, y70Var, arrayList, false, g61Var, f7Var, f7Var, null, true, false, linkedHashSet, null, null, null, arrayList2, arrayList3, false, null, null);
        java.lang.Class ZpBGe2uQfcn82 = ZpBGe2uQfcn8.ZpBGe2uQfcn8();
        ZpBGe2uQfcn82.getClass();
        java.lang.Package r2 = ZpBGe2uQfcn82.getPackage();
        if (r2 == null || (str = r2.getName()) == null) {
            str = "";
        }
        java.lang.String canonicalName = ZpBGe2uQfcn82.getCanonicalName();
        canonicalName.getClass();
        if (str.length() != 0) {
            canonicalName = canonicalName.substring(str.length() + 1);
        }
        java.lang.String replace = canonicalName.replace('.', '_');
        replace.getClass();
        java.lang.String concat = replace.concat("_Impl");
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str.length() == 0 ? concat : str + '.' + concat, true, ZpBGe2uQfcn82.getClassLoader());
            cls.getClass();
            defpackage.h61 h61Var = (defpackage.h61) cls.getDeclaredConstructor(null).newInstance(null);
            h61Var.getClass();
            h61Var.GE9mJIPrb8gP = true;
            try {
                guVar = h61Var.fWTAfUmVKrZq();
                guVar.getClass();
            } catch (defpackage.es0 unused) {
                guVar = null;
            }
            if (guVar == null) {
                new defpackage.f61(knVar, new defpackage.lp0(10, h61Var), new defpackage.qz(2, h61Var, defpackage.i61.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 1));
                throw null;
            }
            h61Var.WDYagTQQm9ns = new defpackage.f61(knVar, guVar, new defpackage.qz(2, h61Var, defpackage.i61.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1, 0, 2));
            h61Var.oh71FJcDz6S2 = h61Var.giKS3J6vZuNy();
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            java.util.Set WDYagTQQm9ns = h61Var.WDYagTQQm9ns();
            java.util.List list = knVar.h3m55N1URyyK;
            int size = list.size();
            boolean[] zArr = new boolean[size];
            java.util.Iterator it2 = WDYagTQQm9ns.iterator();
            while (true) {
                int i = -1;
                if (it2.hasNext()) {
                    defpackage.ne neVar = (defpackage.ne) it2.next();
                    int size2 = list.size() - 1;
                    if (size2 >= 0) {
                        while (true) {
                            int i2 = size2 - 1;
                            if (neVar.JhCgjQRTAOCT(list.get(size2))) {
                                zArr[size2] = true;
                                i = size2;
                                break;
                            }
                            if (i2 < 0) {
                                break;
                            }
                            size2 = i2;
                        }
                    }
                    if (i < 0) {
                        defpackage.p81.JhCgjQRTAOCT("A required auto migration spec (", neVar.giKS3J6vZuNy(), ") is missing in the database configuration.");
                        return null;
                    }
                    linkedHashMap.put(neVar, list.get(i));
                } else {
                    int size3 = list.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i3 = size3 - 1;
                            if (size3 >= size || !zArr[size3]) {
                                break;
                            }
                            if (i3 < 0) {
                                break;
                            }
                            size3 = i3;
                        }
                    }
                    java.util.Iterator it3 = h61Var.ZpBGe2uQfcn8(linkedHashMap).iterator();
                    if (it3.hasNext()) {
                        it3.next().getClass();
                        defpackage.p81.ZpBGe2uQfcn8();
                        return null;
                    }
                    java.util.LinkedHashMap oh71FJcDz6S22 = h61Var.oh71FJcDz6S2();
                    java.util.List list2 = knVar.fNwYGHIYeJcR;
                    boolean[] zArr2 = new boolean[list2.size()];
                    for (java.util.Map.Entry entry : oh71FJcDz6S22.entrySet()) {
                        defpackage.ne neVar2 = (defpackage.ne) entry.getKey();
                        for (defpackage.ne neVar3 : (java.util.List) entry.getValue()) {
                            int size4 = list2.size() - 1;
                            if (size4 >= 0) {
                                while (true) {
                                    int i4 = size4 - 1;
                                    if (neVar3.JhCgjQRTAOCT(list2.get(size4))) {
                                        zArr2[size4] = true;
                                        break;
                                    }
                                    if (i4 < 0) {
                                        break;
                                    }
                                    size4 = i4;
                                }
                            }
                            size4 = -1;
                            if (size4 < 0) {
                                defpackage.h7.Ns0WNyEWdPsk("A required type converter (", neVar3.giKS3J6vZuNy(), ") for ", neVar2.giKS3J6vZuNy(), " is missing in the database configuration.");
                                return null;
                            }
                            java.lang.Object obj = list2.get(size4);
                            neVar3.getClass();
                            obj.getClass();
                            h61Var.e6mdH7fiFuta.put(neVar3, obj);
                        }
                    }
                    int size5 = list2.size() - 1;
                    if (size5 >= 0) {
                        while (true) {
                            int i5 = size5 - 1;
                            if (!zArr2[size5]) {
                                throw new java.lang.IllegalArgumentException("Unexpected type converter " + list2.get(size5) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                            }
                            if (i5 < 0) {
                                break;
                            }
                            size5 = i5;
                        }
                    }
                    h61Var.fWTAfUmVKrZq = knVar.QiMR8OkAhezm;
                    h61Var.JhCgjQRTAOCT = new defpackage.vo1(knVar.P05cfTpS5W5L);
                    java.util.concurrent.Executor executor = h61Var.fWTAfUmVKrZq;
                    if (executor == null) {
                        defpackage.ma0.hH0RRJrNssvh("internalQueryExecutor");
                        throw null;
                    }
                    defpackage.jl QiMR8OkAhezm2 = defpackage.ok0.QiMR8OkAhezm(defpackage.h0.zJPqDeoF0Os1(new defpackage.dw(executor), new defpackage.wh1(null)));
                    h61Var.ZpBGe2uQfcn8 = QiMR8OkAhezm2;
                    defpackage.jm jmVar = QiMR8OkAhezm2.WDYagTQQm9ns;
                    defpackage.vo1 vo1Var = h61Var.JhCgjQRTAOCT;
                    if (vo1Var == null) {
                        defpackage.ma0.hH0RRJrNssvh("internalTransactionExecutor");
                        throw null;
                    }
                    h61Var.giKS3J6vZuNy = jmVar.fNwYGHIYeJcR(new defpackage.dw(vo1Var));
                    defpackage.f61 f61Var2 = h61Var.WDYagTQQm9ns;
                    if (f61Var2 == null) {
                        defpackage.ma0.hH0RRJrNssvh("connectionManager");
                        throw null;
                    }
                    defpackage.yh1 yh1Var3 = f61Var2.QiMR8OkAhezm;
                    if (yh1Var3 != null) {
                        yh1Var = yh1Var3;
                        while (!(yh1Var instanceof defpackage.f11)) {
                            if (yh1Var instanceof defpackage.yo) {
                                yh1Var = ((defpackage.yo) yh1Var).giKS3J6vZuNy();
                            }
                        }
                        f61Var = h61Var.WDYagTQQm9ns;
                        if (f61Var != null) {
                            defpackage.ma0.hH0RRJrNssvh("connectionManager");
                            throw null;
                        }
                        defpackage.yh1 yh1Var4 = f61Var.QiMR8OkAhezm;
                        if (yh1Var4 != null) {
                            yh1Var2 = yh1Var4;
                            while (!(yh1Var2 instanceof defpackage.j8)) {
                                if (yh1Var2 instanceof defpackage.yo) {
                                    yh1Var2 = ((defpackage.yo) yh1Var2).giKS3J6vZuNy();
                                }
                            }
                            return (com.ice.fishing.wolberta.data.local.AppDatabase) h61Var;
                        }
                        yh1Var2 = null;
                        return (com.ice.fishing.wolberta.data.local.AppDatabase) h61Var;
                    }
                    yh1Var = null;
                    f61Var = h61Var.WDYagTQQm9ns;
                    if (f61Var != null) {
                    }
                }
            }
        } catch (java.lang.ClassNotFoundException e) {
            throw new java.lang.RuntimeException("Cannot find implementation for " + ZpBGe2uQfcn82.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e);
        } catch (java.lang.IllegalAccessException e2) {
            throw new java.lang.RuntimeException("Cannot access the constructor " + ZpBGe2uQfcn82.getCanonicalName(), e2);
        } catch (java.lang.InstantiationException e3) {
            throw new java.lang.RuntimeException("Failed to create an instance of " + ZpBGe2uQfcn82.getCanonicalName(), e3);
        }
    }

    public static defpackage.oh0 WmetiUbpKU9I(java.util.List list) {
        return new defpackage.oh0(list, (java.lang.Float.floatToRawIntBits(0.0f) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L), (java.lang.Float.floatToRawIntBits(Float.POSITIVE_INFINITY) << 32) | (java.lang.Float.floatToRawIntBits(0.0f) & 4294967295L));
    }

    public static defpackage.vk1 fNwYGHIYeJcR(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, defpackage.e30 e30Var) {
        long j13 = defpackage.pf.QiMR8OkAhezm;
        return gUjdnLbkVAaA((defpackage.uf) e30Var.GE9mJIPrb8gP(defpackage.wf.ZpBGe2uQfcn8), (defpackage.jn1) e30Var.GE9mJIPrb8gP(defpackage.kn1.ZpBGe2uQfcn8)).ZpBGe2uQfcn8(j, j2, j3, j13, j4, j5, j6, j13, j13, j13, null, j7, j8, j9, j13, j13, j13, j13, j13, j13, j13, j13, j13, j10, j11, j12, j13, j13, j13, j13, j13, j13, j13, j13, j13, j13, j13, j13, j13, j13, j13, j13, j13);
    }

    public static defpackage.vk1 gUjdnLbkVAaA(defpackage.uf ufVar, defpackage.jn1 jn1Var) {
        defpackage.vk1 vk1Var = ufVar.PS16moFv2oLu;
        if (vk1Var != null) {
            if (defpackage.ma0.QiMR8OkAhezm(vk1Var.Ns0WNyEWdPsk, jn1Var)) {
                return vk1Var;
            }
            defpackage.vk1 ZpBGe2uQfcn8 = vk1Var.ZpBGe2uQfcn8(vk1Var.ZpBGe2uQfcn8, vk1Var.giKS3J6vZuNy, vk1Var.fWTAfUmVKrZq, vk1Var.JhCgjQRTAOCT, vk1Var.WDYagTQQm9ns, vk1Var.oh71FJcDz6S2, vk1Var.QiMR8OkAhezm, vk1Var.P05cfTpS5W5L, vk1Var.e6mdH7fiFuta, vk1Var.GE9mJIPrb8gP, jn1Var, vk1Var.fNwYGHIYeJcR, vk1Var.h3m55N1URyyK, vk1Var.gUjdnLbkVAaA, vk1Var.T1fB7bDYiVJQ, vk1Var.XntWc4eZSQ8j, vk1Var.WmetiUbpKU9I, vk1Var.s0TASMVLSWD5, vk1Var.BHfvd2J71qpO, vk1Var.ZVVdXbWmyCSK, vk1Var.w7APNrr0aGRc, vk1Var.maCixPsq4ml2, vk1Var.IJ0hOnjhPOri, vk1Var.VFeft99leXEK, vk1Var.oCu53ZX2v4Ju, vk1Var.dG7RjM6DqYVL, vk1Var.OcTWLQzke1i2, vk1Var.blKFvluuDQOf, vk1Var.UmgHb6n58gfG, vk1Var.qjMheFZ0l9kA, vk1Var.jjTN4uUnoyEn, vk1Var.Mearx7yMn90V, vk1Var.frSwwKIlbUhK, vk1Var.KrtOTfE6jiS2, vk1Var.IBvW5fLsPuHy, vk1Var.BXaznwstz2U0, vk1Var.hH0RRJrNssvh, vk1Var.GcLuU6pT9wO9, vk1Var.xahdJg25P1Bv, vk1Var.w6IV1lieBIux, vk1Var.zJPqDeoF0Os1, vk1Var.Wc0TdmRSwbbi, vk1Var.OVwOqzUGHcCU);
            ufVar.PS16moFv2oLu = ZpBGe2uQfcn8;
            return ZpBGe2uQfcn8;
        }
        long ZpBGe2uQfcn82 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.Fu5WBEia9jBo);
        long ZpBGe2uQfcn83 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.PS16moFv2oLu);
        defpackage.vf vfVar = defpackage.ma0.OcTWLQzke1i2;
        long ZpBGe2uQfcn84 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar);
        float f = defpackage.ma0.blKFvluuDQOf;
        long giKS3J6vZuNy = defpackage.pf.giKS3J6vZuNy(ZpBGe2uQfcn84, f);
        long ZpBGe2uQfcn85 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.xahdJg25P1Bv);
        defpackage.vf vfVar2 = defpackage.ma0.IJ0hOnjhPOri;
        long ZpBGe2uQfcn86 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar2);
        long ZpBGe2uQfcn87 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar2);
        long ZpBGe2uQfcn88 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar2);
        long ZpBGe2uQfcn89 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar2);
        long ZpBGe2uQfcn810 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.maCixPsq4ml2);
        long ZpBGe2uQfcn811 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.GcLuU6pT9wO9);
        long ZpBGe2uQfcn812 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.Jkfc0NcwyPL8);
        long ZpBGe2uQfcn813 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.w7APNrr0aGRc);
        long giKS3J6vZuNy2 = defpackage.pf.giKS3J6vZuNy(defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.oCu53ZX2v4Ju), defpackage.ma0.dG7RjM6DqYVL);
        long ZpBGe2uQfcn814 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.hH0RRJrNssvh);
        long ZpBGe2uQfcn815 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.EPEWHACkMcF1);
        long ZpBGe2uQfcn816 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.cCeDCHgnx5OL);
        long giKS3J6vZuNy3 = defpackage.pf.giKS3J6vZuNy(defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.jjTN4uUnoyEn), defpackage.ma0.Mearx7yMn90V);
        long ZpBGe2uQfcn817 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.zJPqDeoF0Os1);
        long ZpBGe2uQfcn818 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.NkfcFfdaVTox);
        long ZpBGe2uQfcn819 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.hwoZxnIesQBZ);
        long giKS3J6vZuNy4 = defpackage.pf.giKS3J6vZuNy(defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.IBvW5fLsPuHy), defpackage.ma0.BXaznwstz2U0);
        long ZpBGe2uQfcn820 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.OVwOqzUGHcCU);
        long ZpBGe2uQfcn821 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.CZa7MwI9IzLd);
        long ZpBGe2uQfcn822 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.Rl68HURFBtL3);
        long giKS3J6vZuNy5 = defpackage.pf.giKS3J6vZuNy(defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.UmgHb6n58gfG), defpackage.ma0.qjMheFZ0l9kA);
        long ZpBGe2uQfcn823 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.w6IV1lieBIux);
        defpackage.vf vfVar3 = defpackage.ma0.GoIRkIe1iwj6;
        long ZpBGe2uQfcn824 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar3);
        long ZpBGe2uQfcn825 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar3);
        long giKS3J6vZuNy6 = defpackage.pf.giKS3J6vZuNy(defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar), f);
        long ZpBGe2uQfcn826 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar3);
        long ZpBGe2uQfcn827 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.z16KqenTjq8o);
        long ZpBGe2uQfcn828 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.omM9cAlgeGXx);
        long giKS3J6vZuNy7 = defpackage.pf.giKS3J6vZuNy(defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.frSwwKIlbUhK), defpackage.ma0.KrtOTfE6jiS2);
        long ZpBGe2uQfcn829 = defpackage.wf.ZpBGe2uQfcn8(ufVar, defpackage.ma0.Wc0TdmRSwbbi);
        defpackage.vf vfVar4 = defpackage.ma0.fhbmYuu9J3cT;
        long ZpBGe2uQfcn830 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar4);
        long ZpBGe2uQfcn831 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar4);
        long giKS3J6vZuNy8 = defpackage.pf.giKS3J6vZuNy(defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar4), f);
        long ZpBGe2uQfcn832 = defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar4);
        defpackage.vf vfVar5 = defpackage.ma0.FhgBoOud6zyW;
        defpackage.vk1 vk1Var2 = new defpackage.vk1(ZpBGe2uQfcn82, ZpBGe2uQfcn83, giKS3J6vZuNy, ZpBGe2uQfcn85, ZpBGe2uQfcn86, ZpBGe2uQfcn87, ZpBGe2uQfcn88, ZpBGe2uQfcn89, ZpBGe2uQfcn810, ZpBGe2uQfcn811, jn1Var, ZpBGe2uQfcn812, ZpBGe2uQfcn813, giKS3J6vZuNy2, ZpBGe2uQfcn814, ZpBGe2uQfcn815, ZpBGe2uQfcn816, giKS3J6vZuNy3, ZpBGe2uQfcn817, ZpBGe2uQfcn818, ZpBGe2uQfcn819, giKS3J6vZuNy4, ZpBGe2uQfcn820, ZpBGe2uQfcn821, ZpBGe2uQfcn822, giKS3J6vZuNy5, ZpBGe2uQfcn823, ZpBGe2uQfcn824, ZpBGe2uQfcn825, giKS3J6vZuNy6, ZpBGe2uQfcn826, ZpBGe2uQfcn827, ZpBGe2uQfcn828, giKS3J6vZuNy7, ZpBGe2uQfcn829, ZpBGe2uQfcn830, ZpBGe2uQfcn831, giKS3J6vZuNy8, ZpBGe2uQfcn832, defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar5), defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar5), defpackage.pf.giKS3J6vZuNy(defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar5), f), defpackage.wf.ZpBGe2uQfcn8(ufVar, vfVar5));
        ufVar.PS16moFv2oLu = vk1Var2;
        return vk1Var2;
    }

    public void GE9mJIPrb8gP(final android.graphics.drawable.Icon icon, defpackage.e30 e30Var, final int i) {
        defpackage.f31 s0TASMVLSWD52;
        defpackage.c20 c20Var;
        e30Var.PS16moFv2oLu(2116504409);
        int i2 = (e30Var.P05cfTpS5W5L(icon) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, (i2 & 19) != 18)) {
            android.content.Context context = (android.content.Context) e30Var.GE9mJIPrb8gP(defpackage.j0.giKS3J6vZuNy);
            boolean oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(icon) | e30Var.oh71FJcDz6S2(context);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (oh71FJcDz6S22 || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = icon.loadDrawable(context);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            android.graphics.drawable.Drawable drawable = (android.graphics.drawable.Drawable) GcLuU6pT9wO9;
            if (drawable == null) {
                s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
                if (s0TASMVLSWD52 != null) {
                    c20Var = new defpackage.c20(this, icon, i, i3) { // from class: gk1
                        public final /* synthetic */ android.graphics.drawable.Icon QiMR8OkAhezm;
                        public final /* synthetic */ int WDYagTQQm9ns;
                        public final /* synthetic */ defpackage.pa1 oh71FJcDz6S2;

                        {
                            this.WDYagTQQm9ns = i3;
                            this.oh71FJcDz6S2 = this;
                        }

                        @Override // defpackage.c20
                        public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                            int i5 = this.WDYagTQQm9ns;
                            defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                            android.graphics.drawable.Icon icon2 = this.QiMR8OkAhezm;
                            defpackage.pa1 pa1Var = this.oh71FJcDz6S2;
                            defpackage.e30 e30Var2 = (defpackage.e30) obj;
                            ((java.lang.Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    pa1Var.GE9mJIPrb8gP(icon2, e30Var2, defpackage.m90.IBvW5fLsPuHy(49));
                                    break;
                                default:
                                    pa1Var.GE9mJIPrb8gP(icon2, e30Var2, defpackage.m90.IBvW5fLsPuHy(49));
                                    break;
                            }
                            return gs1Var;
                        }
                    };
                    s0TASMVLSWD52.JhCgjQRTAOCT = c20Var;
                }
                return;
            }
            e6mdH7fiFuta(drawable, e30Var, 48);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            c20Var = new defpackage.c20(this, icon, i, i4) { // from class: gk1
                public final /* synthetic */ android.graphics.drawable.Icon QiMR8OkAhezm;
                public final /* synthetic */ int WDYagTQQm9ns;
                public final /* synthetic */ defpackage.pa1 oh71FJcDz6S2;

                {
                    this.WDYagTQQm9ns = i4;
                    this.oh71FJcDz6S2 = this;
                }

                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                    int i5 = this.WDYagTQQm9ns;
                    defpackage.gs1 gs1Var = defpackage.gs1.ZpBGe2uQfcn8;
                    android.graphics.drawable.Icon icon2 = this.QiMR8OkAhezm;
                    defpackage.pa1 pa1Var = this.oh71FJcDz6S2;
                    defpackage.e30 e30Var2 = (defpackage.e30) obj;
                    ((java.lang.Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            pa1Var.GE9mJIPrb8gP(icon2, e30Var2, defpackage.m90.IBvW5fLsPuHy(49));
                            break;
                        default:
                            pa1Var.GE9mJIPrb8gP(icon2, e30Var2, defpackage.m90.IBvW5fLsPuHy(49));
                            break;
                    }
                    return gs1Var;
                }
            };
            s0TASMVLSWD52.JhCgjQRTAOCT = c20Var;
        }
    }

    @Override // defpackage.k7
    public void JhCgjQRTAOCT(defpackage.hp hpVar, int i, int[] iArr, defpackage.sc0 sc0Var, int[] iArr2) {
        int i2 = this.WDYagTQQm9ns;
        defpackage.sc0 sc0Var2 = defpackage.sc0.WDYagTQQm9ns;
        switch (i2) {
            case 16:
                if (sc0Var != sc0Var2) {
                    defpackage.vx1.jjTN4uUnoyEn(i, iArr, iArr2, true);
                    break;
                } else {
                    defpackage.vx1.jjTN4uUnoyEn(i, iArr, iArr2, false);
                    break;
                }
            case 17:
                if (sc0Var != sc0Var2) {
                    defpackage.vx1.Mearx7yMn90V(i, iArr, iArr2, true);
                    break;
                } else {
                    defpackage.vx1.Mearx7yMn90V(i, iArr, iArr2, false);
                    break;
                }
            default:
                if (sc0Var != sc0Var2) {
                    defpackage.vx1.frSwwKIlbUhK(i, iArr, iArr2, true);
                    break;
                } else {
                    defpackage.vx1.frSwwKIlbUhK(i, iArr, iArr2, false);
                    break;
                }
        }
    }

    public void P05cfTpS5W5L(final java.lang.String str, final defpackage.c20 c20Var, final defpackage.p81 p81Var, final defpackage.in0 in0Var, final defpackage.c20 c20Var2, final defpackage.c20 c20Var3, final defpackage.cd1 cd1Var, final defpackage.vk1 vk1Var, defpackage.wv0 wv0Var, defpackage.c20 c20Var4, defpackage.e30 e30Var, final int i) {
        int i2;
        final defpackage.wv0 wv0Var2;
        final defpackage.c20 c20Var5;
        int i3;
        defpackage.wv0 wv0Var3;
        int i4;
        defpackage.nh OcTWLQzke1i2;
        e30Var.PS16moFv2oLu(1806980801);
        if ((i & 6) == 0) {
            i2 = (e30Var.oh71FJcDz6S2(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(c20Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= e30Var.QiMR8OkAhezm(true) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= e30Var.QiMR8OkAhezm(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(p81Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= e30Var.oh71FJcDz6S2(in0Var) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= e30Var.QiMR8OkAhezm(false) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(c20Var2) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(null) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= e30Var.P05cfTpS5W5L(null) ? 536870912 : 268435456;
        }
        int i5 = 100663296 | (e30Var.P05cfTpS5W5L(c20Var3) ? 4 : 2) | (e30Var.P05cfTpS5W5L(null) ? 32 : 16) | (e30Var.P05cfTpS5W5L(null) ? 256 : 128) | (e30Var.P05cfTpS5W5L(null) ? 2048 : 1024) | (e30Var.oh71FJcDz6S2(cd1Var) ? 16384 : 8192) | (e30Var.oh71FJcDz6S2(vk1Var) ? 131072 : 65536) | 13107200;
        if (e30Var.zJPqDeoF0Os1(i2 & 1, ((i2 & 306783379) == 306783378 && (38347923 & i5) == 38347922) ? false : true)) {
            e30Var.CZa7MwI9IzLd();
            if ((i & 1) == 0 || e30Var.oCu53ZX2v4Ju()) {
                if (c20Var2 == null) {
                    i3 = -3670017;
                    wv0Var3 = new defpackage.wv0(16.0f, 16.0f, 16.0f, 16.0f);
                } else {
                    i3 = -3670017;
                    wv0Var3 = new defpackage.wv0(16.0f, 8.0f, 16.0f, 8.0f);
                }
                i4 = i5 & i3;
                c20Var5 = defpackage.nn.OcTWLQzke1i2(417908150, new defpackage.fl0(in0Var, vk1Var, cd1Var, r13), e30Var);
            } else {
                e30Var.Jkfc0NcwyPL8();
                i4 = i5 & (-3670017);
                wv0Var3 = wv0Var;
                c20Var5 = c20Var4;
            }
            e30Var.WmetiUbpKU9I();
            int i6 = ((i2 & 14) == 4 ? 1 : 0) | ((i2 & 57344) != 16384 ? 0 : 1);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (i6 != 0 || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                defpackage.l6 l6Var = new defpackage.l6(str);
                p81Var.getClass();
                GcLuU6pT9wO9 = new defpackage.ap1(l6Var, defpackage.ys0.ZpBGe2uQfcn8);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            java.lang.String str2 = ((defpackage.ap1) GcLuU6pT9wO9).ZpBGe2uQfcn8.oh71FJcDz6S2;
            defpackage.ll1 ll1Var = new defpackage.ll1();
            int i7 = 3;
            if (c20Var2 == null) {
                e30Var.NkfcFfdaVTox(-1353131191);
                e30Var.XntWc4eZSQ8j(false);
                OcTWLQzke1i2 = null;
            } else {
                e30Var.NkfcFfdaVTox(-1353131190);
                OcTWLQzke1i2 = defpackage.nn.OcTWLQzke1i2(1110058497, new defpackage.po(i7, c20Var2), e30Var);
                e30Var.XntWc4eZSQ8j(false);
            }
            int i8 = i2 >> 9;
            int i9 = i4 << 21;
            int i10 = ((i2 << 3) & 896) | 6 | (i8 & 458752) | (i8 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192);
            int i11 = ((i4 >> 9) & 14) | ((i2 >> 6) & 112) | (i2 & 896) | (i8 & 7168) | ((i2 >> 3) & 57344) | ((i4 << 3) & 3670016) | 12582912;
            defpackage.wv0 wv0Var4 = wv0Var3;
            defpackage.m90.ZpBGe2uQfcn8(str2, c20Var, ll1Var, OcTWLQzke1i2, c20Var3, in0Var, wv0Var4, vk1Var, c20Var5, e30Var, i10, i11);
            wv0Var2 = wv0Var4;
        } else {
            e30Var.Jkfc0NcwyPL8();
            wv0Var2 = wv0Var;
            c20Var5 = c20Var4;
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.c20() { // from class: wk1
                @Override // defpackage.c20
                public final java.lang.Object QiMR8OkAhezm(java.lang.Object obj, java.lang.Object obj2) {
                    ((java.lang.Integer) obj2).getClass();
                    defpackage.pa1.this.P05cfTpS5W5L(str, c20Var, p81Var, in0Var, c20Var2, c20Var3, cd1Var, vk1Var, wv0Var2, c20Var5, (defpackage.e30) obj, defpackage.m90.IBvW5fLsPuHy(i | 1));
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
            };
        }
    }

    public void QiMR8OkAhezm(defpackage.in0 in0Var, defpackage.vl0 vl0Var, defpackage.vk1 vk1Var, defpackage.cd1 cd1Var, defpackage.e30 e30Var, int i) {
        defpackage.vl0 vl0Var2;
        defpackage.pd pdVar;
        e30Var.PS16moFv2oLu(-818661242);
        int i2 = 1;
        int i3 = 2;
        int i4 = i | (e30Var.QiMR8OkAhezm(true) ? 4 : 2) | (e30Var.QiMR8OkAhezm(false) ? 32 : 16) | (e30Var.oh71FJcDz6S2(in0Var) ? 256 : 128) | (e30Var.oh71FJcDz6S2(vk1Var) ? 16384 : 8192) | (e30Var.oh71FJcDz6S2(cd1Var) ? 131072 : 65536);
        if (e30Var.zJPqDeoF0Os1(i4 & 1, (38347923 & i4) != 38347922)) {
            e30Var.CZa7MwI9IzLd();
            if ((i & 1) != 0 && !e30Var.oCu53ZX2v4Ju()) {
                e30Var.Jkfc0NcwyPL8();
            }
            e30Var.WmetiUbpKU9I();
            long j = ((java.lang.Boolean) defpackage.nq1.VFeft99leXEK(in0Var, e30Var, (i4 >> 6) & 14).getValue()).booleanValue() ? vk1Var.WDYagTQQm9ns : vk1Var.oh71FJcDz6S2;
            defpackage.vf1 z16KqenTjq8o = defpackage.t80.z16KqenTjq8o(defpackage.jm0.oh71FJcDz6S2, e30Var);
            boolean oh71FJcDz6S22 = e30Var.oh71FJcDz6S2(defpackage.pf.oh71FJcDz6S2(j));
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            java.lang.Object obj = defpackage.cj.ZpBGe2uQfcn8;
            if (oh71FJcDz6S22 || GcLuU6pT9wO9 == obj) {
                java.lang.Object lq1Var = new defpackage.lq1(defpackage.n.XntWc4eZSQ8j, new defpackage.YjS0G3zEDWNX(7, defpackage.pf.oh71FJcDz6S2(j)));
                e30Var.EgL5gQQnyJKX(lq1Var);
                GcLuU6pT9wO9 = lq1Var;
            }
            defpackage.lq1 lq1Var2 = (defpackage.lq1) GcLuU6pT9wO9;
            java.lang.Object pfVar = new defpackage.pf(j);
            int i5 = defpackage.b5.ZpBGe2uQfcn8;
            java.lang.Object GcLuU6pT9wO92 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO92 == obj) {
                GcLuU6pT9wO92 = defpackage.w60.hH0RRJrNssvh(null);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO92);
            }
            defpackage.fo0 fo0Var = (defpackage.fo0) GcLuU6pT9wO92;
            java.lang.Object GcLuU6pT9wO93 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO93 == obj) {
                GcLuU6pT9wO93 = new defpackage.z4(pfVar, lq1Var2, null);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO93);
            }
            defpackage.z4 z4Var = (defpackage.z4) GcLuU6pT9wO93;
            defpackage.fo0 w6IV1lieBIux = defpackage.w60.w6IV1lieBIux(null, e30Var);
            defpackage.fo0 w6IV1lieBIux2 = defpackage.w60.w6IV1lieBIux(z16KqenTjq8o, e30Var);
            java.lang.Object GcLuU6pT9wO94 = e30Var.GcLuU6pT9wO9();
            if (GcLuU6pT9wO94 == obj) {
                GcLuU6pT9wO94 = defpackage.ok0.giKS3J6vZuNy(-1, 6, null);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO94);
            }
            defpackage.pd pdVar2 = (defpackage.pd) GcLuU6pT9wO94;
            boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(pdVar2) | e30Var.P05cfTpS5W5L(pfVar);
            java.lang.Object GcLuU6pT9wO95 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO95 == obj) {
                GcLuU6pT9wO95 = new defpackage.S0YpfprlOYIn(i3, pdVar2, pfVar);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO95);
            }
            defpackage.nq1.WmetiUbpKU9I((defpackage.n10) GcLuU6pT9wO95, e30Var);
            boolean P05cfTpS5W5L3 = e30Var.P05cfTpS5W5L(pdVar2) | e30Var.P05cfTpS5W5L(z4Var) | e30Var.oh71FJcDz6S2(w6IV1lieBIux2) | e30Var.oh71FJcDz6S2(w6IV1lieBIux);
            java.lang.Object GcLuU6pT9wO96 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L3 || GcLuU6pT9wO96 == obj) {
                java.lang.Object a5Var = new defpackage.a5(pdVar2, z4Var, w6IV1lieBIux2, w6IV1lieBIux, null);
                pdVar = pdVar2;
                e30Var.EgL5gQQnyJKX(a5Var);
                GcLuU6pT9wO96 = a5Var;
            } else {
                pdVar = pdVar2;
            }
            defpackage.nq1.GE9mJIPrb8gP((defpackage.c20) GcLuU6pT9wO96, e30Var, pdVar);
            java.lang.Object obj2 = (defpackage.dg1) fo0Var.getValue();
            if (obj2 == null) {
                obj2 = z4Var.fWTAfUmVKrZq;
            }
            defpackage.m91 m91Var = new defpackage.m91(i2, cd1Var, new defpackage.xk1(new defpackage.kf0(0, 2, defpackage.dg1.class, obj2, "value", "getValue()Ljava/lang/Object;")));
            vl0Var2 = vl0Var;
            defpackage.ab.ZpBGe2uQfcn8(defpackage.i61.BHfvd2J71qpO(vl0Var2, m91Var).fWTAfUmVKrZq(new defpackage.d70(in0Var, vk1Var, cd1Var)), e30Var, 0);
        } else {
            vl0Var2 = vl0Var;
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.vy0(this, in0Var, vl0Var2, vk1Var, cd1Var, i);
        }
    }

    public com.ice.fishing.wolberta.data.local.AppDatabase T1fB7bDYiVJQ(android.content.Context context) {
        com.ice.fishing.wolberta.data.local.AppDatabase appDatabase;
        com.ice.fishing.wolberta.data.local.AppDatabase appDatabase2 = com.ice.fishing.wolberta.data.local.AppDatabase.fNwYGHIYeJcR;
        if (appDatabase2 != null) {
            return appDatabase2;
        }
        synchronized (this) {
            appDatabase = com.ice.fishing.wolberta.data.local.AppDatabase.fNwYGHIYeJcR;
            if (appDatabase == null) {
                appDatabase = Ns0WNyEWdPsk(context);
                com.ice.fishing.wolberta.data.local.AppDatabase.fNwYGHIYeJcR = appDatabase;
            }
        }
        return appDatabase;
    }

    @Override // defpackage.m7
    public void WDYagTQQm9ns(int i, defpackage.xk0 xk0Var, int[] iArr, int[] iArr2) {
        switch (this.WDYagTQQm9ns) {
            case 16:
                defpackage.vx1.jjTN4uUnoyEn(i, iArr, iArr2, false);
                break;
            case 17:
                defpackage.vx1.Mearx7yMn90V(i, iArr, iArr2, false);
                break;
            default:
                defpackage.vx1.frSwwKIlbUhK(i, iArr, iArr2, false);
                break;
        }
    }

    public android.content.pm.Signature[] XntWc4eZSQ8j(android.content.pm.PackageManager packageManager, java.lang.String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override // defpackage.k7, defpackage.m7
    public float ZpBGe2uQfcn8() {
        switch (this.WDYagTQQm9ns) {
        }
        return 0.0f;
    }

    public void e6mdH7fiFuta(android.graphics.drawable.Drawable drawable, defpackage.e30 e30Var, int i) {
        e30Var.PS16moFv2oLu(257732500);
        int i2 = 4;
        int i3 = (e30Var.P05cfTpS5W5L(drawable) ? 4 : 2) | i;
        if (e30Var.zJPqDeoF0Os1(i3 & 1, (i3 & 3) != 2)) {
            defpackage.vl0 oh71FJcDz6S22 = defpackage.ce1.oh71FJcDz6S2(defpackage.fl.WDYagTQQm9ns);
            boolean P05cfTpS5W5L2 = e30Var.P05cfTpS5W5L(drawable);
            java.lang.Object GcLuU6pT9wO9 = e30Var.GcLuU6pT9wO9();
            if (P05cfTpS5W5L2 || GcLuU6pT9wO9 == defpackage.cj.ZpBGe2uQfcn8) {
                GcLuU6pT9wO9 = new defpackage.wd1(i2, drawable);
                e30Var.EgL5gQQnyJKX(GcLuU6pT9wO9);
            }
            defpackage.ab.ZpBGe2uQfcn8(defpackage.i61.s0TASMVLSWD5(oh71FJcDz6S22, (defpackage.y10) GcLuU6pT9wO9), e30Var, 0);
        } else {
            e30Var.Jkfc0NcwyPL8();
        }
        defpackage.f31 s0TASMVLSWD52 = e30Var.s0TASMVLSWD5();
        if (s0TASMVLSWD52 != null) {
            s0TASMVLSWD52.JhCgjQRTAOCT = new defpackage.yh0(i, 13, this, drawable);
        }
    }

    @Override // defpackage.ze1
    public boolean fWTAfUmVKrZq(java.lang.Object obj, java.lang.Object obj2) {
        return defpackage.ma0.QiMR8OkAhezm(obj, obj2);
    }

    @Override // defpackage.ax1
    public defpackage.ww1 giKS3J6vZuNy(android.content.ContextWrapper contextWrapper, defpackage.ip ipVar) {
        ipVar.getClass();
        android.content.Context context = contextWrapper;
        while (true) {
            if (!(context instanceof android.content.ContextWrapper)) {
                context = contextWrapper;
                break;
            }
            if ((context instanceof android.app.Activity) || (context instanceof android.inputmethodservice.InputMethodService)) {
                break;
            }
            android.content.ContextWrapper contextWrapper2 = (android.content.ContextWrapper) context;
            if (contextWrapper2.getBaseContext() == null) {
                break;
            }
            context = contextWrapper2.getBaseContext();
            context.getClass();
        }
        if (context instanceof android.app.Activity) {
            android.app.Activity activity = (android.app.Activity) context;
            defpackage.ya.ZpBGe2uQfcn8.getClass();
            int i = android.os.Build.VERSION.SDK_INT;
            return new defpackage.ww1(new defpackage.wa((i >= 30 ? defpackage.za.WDYagTQQm9ns : i >= 29 ? defpackage.jVUAPb5NnIYW.IJ0hOnjhPOri : i >= 28 ? defpackage.jVUAPb5NnIYW.maCixPsq4ml2 : defpackage.jVUAPb5NnIYW.w7APNrr0aGRc).QiMR8OkAhezm(activity)), ipVar.P05cfTpS5W5L(activity));
        }
        if (!(context instanceof android.inputmethodservice.InputMethodService) && !(context instanceof android.app.Application)) {
            defpackage.h7.w7APNrr0aGRc("Must provide a UiContext or Application Context");
            return null;
        }
        java.lang.Object systemService = contextWrapper.getSystemService("window");
        systemService.getClass();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        android.graphics.Point point = new android.graphics.Point();
        defaultDisplay.getRealSize(point);
        return new defpackage.ww1(new android.graphics.Rect(0, 0, point.x, point.y), ipVar.P05cfTpS5W5L(contextWrapper));
    }

    public long h3m55N1URyyK(long j, long j2) {
        float QiMR8OkAhezm2 = defpackage.la0.QiMR8OkAhezm(j, j2);
        long floatToRawIntBits = (java.lang.Float.floatToRawIntBits(QiMR8OkAhezm2) << 32) | (java.lang.Float.floatToRawIntBits(QiMR8OkAhezm2) & 4294967295L);
        int i = defpackage.l81.ZpBGe2uQfcn8;
        return floatToRawIntBits;
    }

    @Override // defpackage.va
    public long oh71FJcDz6S2(defpackage.z20 z20Var, int i) {
        return ((defpackage.bn1) z20Var.WDYagTQQm9ns).e6mdH7fiFuta(i);
    }

    public java.lang.String toString() {
        switch (this.WDYagTQQm9ns) {
            case 2:
                return "StructuralEqualityPolicy";
            case 16:
                return "Arrangement#Center";
            case 17:
                return "Arrangement#SpaceBetween";
            case 18:
                return "Arrangement#SpaceEvenly";
            case 21:
                return "Empty";
            case 22:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }
}
