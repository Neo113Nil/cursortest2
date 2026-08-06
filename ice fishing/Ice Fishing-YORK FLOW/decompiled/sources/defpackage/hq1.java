package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class hq1 {
    public static final java.lang.String[] fNwYGHIYeJcR = {"INSERT", "UPDATE", "DELETE"};
    public final boolean JhCgjQRTAOCT;
    public final defpackage.rs0 P05cfTpS5W5L;
    public final java.lang.String[] QiMR8OkAhezm;
    public final defpackage.WDYagTQQm9ns WDYagTQQm9ns;
    public final com.ice.fishing.wolberta.data.local.AppDatabase_Impl ZpBGe2uQfcn8;
    public final defpackage.k0 e6mdH7fiFuta;
    public final java.util.LinkedHashMap fWTAfUmVKrZq;
    public final java.util.LinkedHashMap giKS3J6vZuNy;
    public final java.util.concurrent.atomic.AtomicBoolean GE9mJIPrb8gP = new java.util.concurrent.atomic.AtomicBoolean(false);
    public defpackage.n10 Ns0WNyEWdPsk = new defpackage.ji0(19);
    public final java.util.LinkedHashMap oh71FJcDz6S2 = new java.util.LinkedHashMap();

    public hq1(com.ice.fishing.wolberta.data.local.AppDatabase_Impl appDatabase_Impl, java.util.LinkedHashMap linkedHashMap, java.util.LinkedHashMap linkedHashMap2, java.lang.String[] strArr, boolean z, defpackage.WDYagTQQm9ns wDYagTQQm9ns) {
        java.lang.String str;
        this.ZpBGe2uQfcn8 = appDatabase_Impl;
        this.giKS3J6vZuNy = linkedHashMap;
        this.fWTAfUmVKrZq = linkedHashMap2;
        this.JhCgjQRTAOCT = z;
        this.WDYagTQQm9ns = wDYagTQQm9ns;
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            java.lang.String str2 = strArr[i];
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.oh71FJcDz6S2.put(lowerCase, java.lang.Integer.valueOf(i));
            java.lang.String str3 = (java.lang.String) this.giKS3J6vZuNy.get(strArr[i]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                str.getClass();
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i] = lowerCase;
        }
        this.QiMR8OkAhezm = strArr2;
        for (java.util.Map.Entry entry : this.giKS3J6vZuNy.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry.getValue();
            java.util.Locale locale2 = java.util.Locale.ROOT;
            java.lang.String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.oh71FJcDz6S2.containsKey(lowerCase2)) {
                java.lang.String lowerCase3 = ((java.lang.String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                java.util.LinkedHashMap linkedHashMap3 = this.oh71FJcDz6S2;
                linkedHashMap3.put(lowerCase3, defpackage.jk0.w6IV1lieBIux(linkedHashMap3, lowerCase2));
            }
        }
        this.P05cfTpS5W5L = new defpackage.rs0(this.QiMR8OkAhezm.length);
        this.e6mdH7fiFuta = new defpackage.k0(this.QiMR8OkAhezm.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v5, types: [p01] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008c -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object JhCgjQRTAOCT(defpackage.hq1 hq1Var, defpackage.xo1 xo1Var, int i, defpackage.ll llVar) {
        defpackage.eq1 eq1Var;
        int i2;
        java.lang.String str;
        int i3;
        defpackage.xo1 xo1Var2;
        int i4;
        java.lang.String[] strArr;
        hq1Var.getClass();
        if (llVar instanceof defpackage.eq1) {
            eq1Var = (defpackage.eq1) llVar;
            int i5 = eq1Var.T1fB7bDYiVJQ;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                eq1Var.T1fB7bDYiVJQ = i5 - Integer.MIN_VALUE;
                java.lang.Object obj = eq1Var.h3m55N1URyyK;
                i2 = eq1Var.T1fB7bDYiVJQ;
                if (i2 != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    str = hq1Var.QiMR8OkAhezm[i];
                    i3 = 3;
                    xo1Var2 = xo1Var;
                    i4 = 0;
                    strArr = fNwYGHIYeJcR;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = eq1Var.fNwYGHIYeJcR;
                    i4 = eq1Var.Ns0WNyEWdPsk;
                    java.lang.String[] strArr2 = eq1Var.GE9mJIPrb8gP;
                    str = eq1Var.e6mdH7fiFuta;
                    ?? r3 = eq1Var.P05cfTpS5W5L;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    strArr = strArr2;
                    xo1Var2 = r3;
                    i4++;
                    if (i4 < i3) {
                        java.lang.String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i4]) + '`';
                        eq1Var.P05cfTpS5W5L = xo1Var2;
                        eq1Var.e6mdH7fiFuta = str;
                        eq1Var.GE9mJIPrb8gP = strArr;
                        eq1Var.Ns0WNyEWdPsk = i4;
                        eq1Var.fNwYGHIYeJcR = i3;
                        eq1Var.T1fB7bDYiVJQ = 1;
                        java.lang.Object gUjdnLbkVAaA = defpackage.b80.gUjdnLbkVAaA(xo1Var2, str2, eq1Var);
                        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (gUjdnLbkVAaA == tmVar) {
                            return tmVar;
                        }
                        i4++;
                        if (i4 < i3) {
                            return defpackage.gs1.ZpBGe2uQfcn8;
                        }
                    }
                }
            }
        }
        eq1Var = new defpackage.eq1(hq1Var, llVar);
        java.lang.Object obj2 = eq1Var.h3m55N1URyyK;
        i2 = eq1Var.T1fB7bDYiVJQ;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object ZpBGe2uQfcn8(defpackage.hq1 hq1Var, defpackage.p01 p01Var, defpackage.ll llVar) {
        defpackage.zp1 zp1Var;
        int i;
        java.util.Set set;
        hq1Var.getClass();
        if (llVar instanceof defpackage.zp1) {
            zp1Var = (defpackage.zp1) llVar;
            int i2 = zp1Var.Ns0WNyEWdPsk;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zp1Var.Ns0WNyEWdPsk = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = zp1Var.e6mdH7fiFuta;
                i = zp1Var.Ns0WNyEWdPsk;
                defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.ui1 ui1Var = new defpackage.ui1(11);
                    zp1Var.P05cfTpS5W5L = p01Var;
                    zp1Var.Ns0WNyEWdPsk = 1;
                    obj = p01Var.JhCgjQRTAOCT("SELECT * FROM room_table_modification_log WHERE invalidated = 1", ui1Var, zp1Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        java.util.Set set2 = (java.util.Set) zp1Var.P05cfTpS5W5L;
                        defpackage.b80.KrtOTfE6jiS2(obj);
                        return set2;
                    }
                    p01Var = (defpackage.p01) zp1Var.P05cfTpS5W5L;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                }
                set = (java.util.Set) obj;
                if (!set.isEmpty()) {
                    zp1Var.P05cfTpS5W5L = set;
                    zp1Var.Ns0WNyEWdPsk = 2;
                    if (defpackage.b80.gUjdnLbkVAaA(p01Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", zp1Var) == tmVar) {
                        return tmVar;
                    }
                }
                return set;
            }
        }
        zp1Var = new defpackage.zp1(hq1Var, llVar);
        java.lang.Object obj2 = zp1Var.e6mdH7fiFuta;
        i = zp1Var.Ns0WNyEWdPsk;
        defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
        if (i != 0) {
        }
        set = (java.util.Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e4, code lost:
    
        if (defpackage.b80.gUjdnLbkVAaA(r7, r15, r0) == r4) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e6, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0069, code lost:
    
        if (r15 == r4) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Type inference failed for: r13v5, types: [p01] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e4 -> B:11:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object fWTAfUmVKrZq(defpackage.hq1 hq1Var, defpackage.xo1 xo1Var, int i, defpackage.ll llVar) {
        defpackage.dq1 dq1Var;
        int i2;
        defpackage.xo1 xo1Var2;
        int i3;
        int i4;
        java.lang.String[] strArr;
        defpackage.p01 p01Var;
        int i5;
        java.lang.String str;
        hq1Var.getClass();
        if (llVar instanceof defpackage.dq1) {
            dq1Var = (defpackage.dq1) llVar;
            int i6 = dq1Var.XntWc4eZSQ8j;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dq1Var.XntWc4eZSQ8j = i6 - Integer.MIN_VALUE;
                java.lang.Object obj = dq1Var.gUjdnLbkVAaA;
                i2 = dq1Var.XntWc4eZSQ8j;
                defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                if (i2 != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    dq1Var.P05cfTpS5W5L = xo1Var;
                    dq1Var.Ns0WNyEWdPsk = i;
                    dq1Var.XntWc4eZSQ8j = 1;
                    java.lang.Object gUjdnLbkVAaA = defpackage.b80.gUjdnLbkVAaA(xo1Var, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)", dq1Var);
                    xo1Var2 = xo1Var;
                } else if (i2 == 1) {
                    i = dq1Var.Ns0WNyEWdPsk;
                    ?? r13 = dq1Var.P05cfTpS5W5L;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    xo1Var2 = r13;
                } else {
                    if (i2 != 2) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = dq1Var.h3m55N1URyyK;
                    i4 = dq1Var.fNwYGHIYeJcR;
                    i3 = dq1Var.Ns0WNyEWdPsk;
                    strArr = dq1Var.GE9mJIPrb8gP;
                    str = dq1Var.e6mdH7fiFuta;
                    p01Var = dq1Var.P05cfTpS5W5L;
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    i4++;
                    if (i4 >= i5) {
                        return defpackage.gs1.ZpBGe2uQfcn8;
                    }
                    java.lang.String str2 = strArr[i4];
                    java.lang.String str3 = "CREATE " + (hq1Var.JhCgjQRTAOCT ? "TEMP" : "") + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str2) + "` AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i3 + " AND invalidated = 0; END";
                    dq1Var.P05cfTpS5W5L = p01Var;
                    dq1Var.e6mdH7fiFuta = str;
                    dq1Var.GE9mJIPrb8gP = strArr;
                    dq1Var.Ns0WNyEWdPsk = i3;
                    dq1Var.fNwYGHIYeJcR = i4;
                    dq1Var.h3m55N1URyyK = i5;
                    dq1Var.XntWc4eZSQ8j = 2;
                }
                java.lang.String str4 = hq1Var.QiMR8OkAhezm[i];
                i3 = i;
                i4 = 0;
                strArr = fNwYGHIYeJcR;
                p01Var = xo1Var2;
                i5 = 3;
                str = str4;
                if (i4 >= i5) {
                }
            }
        }
        dq1Var = new defpackage.dq1(hq1Var, llVar);
        java.lang.Object obj2 = dq1Var.gUjdnLbkVAaA;
        i2 = dq1Var.XntWc4eZSQ8j;
        defpackage.tm tmVar2 = defpackage.tm.WDYagTQQm9ns;
        if (i2 != 0) {
        }
        java.lang.String str42 = hq1Var.QiMR8OkAhezm[i];
        i3 = i;
        i4 = 0;
        strArr = fNwYGHIYeJcR;
        p01Var = xo1Var2;
        i5 = 3;
        str = str42;
        if (i4 >= i5) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0074, B:14:0x007f, B:17:0x00ba, B:19:0x008e, B:20:0x0092, B:22:0x009f, B:24:0x00a9, B:26:0x00af, B:27:0x00ad, B:30:0x00b4), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object giKS3J6vZuNy(defpackage.hq1 hq1Var, defpackage.ll llVar) {
        defpackage.bq1 bq1Var;
        int i;
        defpackage.n80 n80Var;
        java.util.Set set;
        java.lang.Object value;
        int[] iArr;
        com.ice.fishing.wolberta.data.local.AppDatabase_Impl appDatabase_Impl = hq1Var.ZpBGe2uQfcn8;
        if (llVar instanceof defpackage.bq1) {
            bq1Var = (defpackage.bq1) llVar;
            int i2 = bq1Var.Ns0WNyEWdPsk;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bq1Var.Ns0WNyEWdPsk = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = bq1Var.e6mdH7fiFuta;
                i = bq1Var.Ns0WNyEWdPsk;
                defpackage.kl klVar = null;
                int i3 = 1;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    defpackage.n80 n80Var2 = appDatabase_Impl.QiMR8OkAhezm;
                    boolean h3m55N1URyyK = n80Var2.h3m55N1URyyK();
                    defpackage.ev evVar = defpackage.ev.WDYagTQQm9ns;
                    if (!h3m55N1URyyK) {
                        return evVar;
                    }
                    try {
                        if (!hq1Var.GE9mJIPrb8gP.compareAndSet(true, false)) {
                            n80Var2.qjMheFZ0l9kA();
                            return evVar;
                        }
                        if (!((java.lang.Boolean) hq1Var.Ns0WNyEWdPsk.ZpBGe2uQfcn8()).booleanValue()) {
                            n80Var2.qjMheFZ0l9kA();
                            return evVar;
                        }
                        defpackage.cq1 cq1Var = new defpackage.cq1(hq1Var, klVar, i3);
                        bq1Var.P05cfTpS5W5L = n80Var2;
                        bq1Var.Ns0WNyEWdPsk = 1;
                        java.lang.Object GE9mJIPrb8gP = appDatabase_Impl.GE9mJIPrb8gP(false, cq1Var, bq1Var);
                        defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                        if (GE9mJIPrb8gP == tmVar) {
                            return tmVar;
                        }
                        n80Var = n80Var2;
                        obj = GE9mJIPrb8gP;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        n80Var = n80Var2;
                        n80Var.qjMheFZ0l9kA();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n80Var = bq1Var.P05cfTpS5W5L;
                    try {
                        defpackage.b80.KrtOTfE6jiS2(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        n80Var.qjMheFZ0l9kA();
                        throw th;
                    }
                }
                set = (java.util.Set) obj;
                if (!set.isEmpty()) {
                    defpackage.k0 k0Var = hq1Var.e6mdH7fiFuta;
                    k0Var.getClass();
                    set.getClass();
                    if (!set.isEmpty()) {
                        defpackage.gg1 gg1Var = (defpackage.gg1) k0Var.oh71FJcDz6S2;
                        do {
                            value = gg1Var.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                iArr[i4] = set.contains(java.lang.Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                            }
                        } while (!gg1Var.P05cfTpS5W5L(value, iArr));
                    }
                    hq1Var.WDYagTQQm9ns.P05cfTpS5W5L(set);
                }
                n80Var.qjMheFZ0l9kA();
                return set;
            }
        }
        bq1Var = new defpackage.bq1(hq1Var, llVar);
        java.lang.Object obj2 = bq1Var.e6mdH7fiFuta;
        i = bq1Var.Ns0WNyEWdPsk;
        defpackage.kl klVar2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        set = (java.util.Set) obj2;
        if (!set.isEmpty()) {
        }
        n80Var.qjMheFZ0l9kA();
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object WDYagTQQm9ns(defpackage.ll llVar) {
        defpackage.fq1 fq1Var;
        int i;
        defpackage.n80 n80Var;
        if (llVar instanceof defpackage.fq1) {
            fq1Var = (defpackage.fq1) llVar;
            int i2 = fq1Var.Ns0WNyEWdPsk;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fq1Var.Ns0WNyEWdPsk = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = fq1Var.e6mdH7fiFuta;
                i = fq1Var.Ns0WNyEWdPsk;
                defpackage.kl klVar = null;
                if (i != 0) {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                    com.ice.fishing.wolberta.data.local.AppDatabase_Impl appDatabase_Impl = this.ZpBGe2uQfcn8;
                    defpackage.n80 n80Var2 = appDatabase_Impl.QiMR8OkAhezm;
                    if (n80Var2.h3m55N1URyyK()) {
                        try {
                            defpackage.oh71FJcDz6S2 oh71fjcdz6s2 = new defpackage.oh71FJcDz6S2(this, klVar, 22);
                            fq1Var.P05cfTpS5W5L = n80Var2;
                            fq1Var.Ns0WNyEWdPsk = 1;
                            java.lang.Object GE9mJIPrb8gP = appDatabase_Impl.GE9mJIPrb8gP(false, oh71fjcdz6s2, fq1Var);
                            defpackage.tm tmVar = defpackage.tm.WDYagTQQm9ns;
                            if (GE9mJIPrb8gP == tmVar) {
                                return tmVar;
                            }
                            n80Var = n80Var2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            n80Var = n80Var2;
                            n80Var.qjMheFZ0l9kA();
                            throw th;
                        }
                    }
                    return defpackage.gs1.ZpBGe2uQfcn8;
                }
                if (i != 1) {
                    defpackage.h7.P05cfTpS5W5L("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                n80Var = fq1Var.P05cfTpS5W5L;
                try {
                    defpackage.b80.KrtOTfE6jiS2(obj);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    n80Var.qjMheFZ0l9kA();
                    throw th;
                }
                n80Var.qjMheFZ0l9kA();
                return defpackage.gs1.ZpBGe2uQfcn8;
            }
        }
        fq1Var = new defpackage.fq1(this, llVar);
        java.lang.Object obj2 = fq1Var.e6mdH7fiFuta;
        i = fq1Var.Ns0WNyEWdPsk;
        defpackage.kl klVar2 = null;
        if (i != 0) {
        }
        n80Var.qjMheFZ0l9kA();
        return defpackage.gs1.ZpBGe2uQfcn8;
    }
}
