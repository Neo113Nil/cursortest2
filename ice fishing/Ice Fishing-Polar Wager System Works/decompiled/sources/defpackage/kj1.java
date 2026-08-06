package defpackage;

/* loaded from: classes.dex */
public final class kj1 {
    public static final java.lang.String[] JlrlGoKF = {"INSERT", "UPDATE", "DELETE"};
    public final java.lang.String[] AARZUJiTa;
    public final defpackage.bq0 EXtogiMhuM;
    public final boolean F7NU4MC0GW;
    public final com.corsair.ledger.data.local.CorsairDatabase_Impl IHQe1A4L2xu;
    public final defpackage.xiZrDbcSW0 adDC3e2L;
    public final java.util.LinkedHashMap oh6vYeIP;
    public final java.util.LinkedHashMap r1MBDhnF;
    public final defpackage.cm riuEU0zW4;
    public final java.util.concurrent.atomic.AtomicBoolean SH1y5HwkJhh = new java.util.concurrent.atomic.AtomicBoolean(false);
    public defpackage.vz ez2rX8ReCYw = new defpackage.v31(8);
    public final java.util.LinkedHashMap xiZrDbcSW0 = new java.util.LinkedHashMap();

    public kj1(com.corsair.ledger.data.local.CorsairDatabase_Impl corsairDatabase_Impl, java.util.LinkedHashMap linkedHashMap, java.util.LinkedHashMap linkedHashMap2, java.lang.String[] strArr, boolean z, defpackage.xiZrDbcSW0 xizrdbcsw0) {
        java.lang.String str;
        this.IHQe1A4L2xu = corsairDatabase_Impl;
        this.oh6vYeIP = linkedHashMap;
        this.r1MBDhnF = linkedHashMap2;
        this.F7NU4MC0GW = z;
        this.adDC3e2L = xizrdbcsw0;
        int length = strArr.length;
        java.lang.String[] strArr2 = new java.lang.String[length];
        for (int i = 0; i < length; i++) {
            java.lang.String str2 = strArr[i];
            java.util.Locale locale = java.util.Locale.ROOT;
            java.lang.String lowerCase = str2.toLowerCase(locale);
            lowerCase.getClass();
            this.xiZrDbcSW0.put(lowerCase, java.lang.Integer.valueOf(i));
            java.lang.String str3 = (java.lang.String) this.oh6vYeIP.get(strArr[i]);
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
        this.AARZUJiTa = strArr2;
        for (java.util.Map.Entry entry : this.oh6vYeIP.entrySet()) {
            java.lang.String str4 = (java.lang.String) entry.getValue();
            java.util.Locale locale2 = java.util.Locale.ROOT;
            java.lang.String lowerCase2 = str4.toLowerCase(locale2);
            lowerCase2.getClass();
            if (this.xiZrDbcSW0.containsKey(lowerCase2)) {
                java.lang.String lowerCase3 = ((java.lang.String) entry.getKey()).toLowerCase(locale2);
                lowerCase3.getClass();
                java.util.LinkedHashMap linkedHashMap3 = this.xiZrDbcSW0;
                linkedHashMap3.put(lowerCase3, defpackage.yh0.p4kuH6PDtgom(lowerCase2, linkedHashMap3));
            }
        }
        this.EXtogiMhuM = new defpackage.bq0(this.AARZUJiTa.length);
        this.riuEU0zW4 = new defpackage.cm(this.AARZUJiTa.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r3v5, types: [cw0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x008c -> B:10:0x008f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object F7NU4MC0GW(defpackage.kj1 kj1Var, defpackage.ai1 ai1Var, int i, defpackage.fj fjVar) {
        defpackage.hj1 hj1Var;
        int i2;
        java.lang.String str;
        int i3;
        defpackage.ai1 ai1Var2;
        int i4;
        java.lang.String[] strArr;
        kj1Var.getClass();
        if (fjVar instanceof defpackage.hj1) {
            hj1Var = (defpackage.hj1) fjVar;
            int i5 = hj1Var.cnag84Bm;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                hj1Var.cnag84Bm = i5 - Integer.MIN_VALUE;
                java.lang.Object obj = hj1Var.DFo87pBq1E5;
                i2 = hj1Var.cnag84Bm;
                if (i2 != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    str = kj1Var.AARZUJiTa[i];
                    i3 = 3;
                    ai1Var2 = ai1Var;
                    i4 = 0;
                    strArr = JlrlGoKF;
                    if (i4 < i3) {
                    }
                } else {
                    if (i2 != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i3 = hj1Var.JlrlGoKF;
                    i4 = hj1Var.ez2rX8ReCYw;
                    java.lang.String[] strArr2 = hj1Var.SH1y5HwkJhh;
                    str = hj1Var.riuEU0zW4;
                    ?? r3 = hj1Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    strArr = strArr2;
                    ai1Var2 = r3;
                    i4++;
                    if (i4 < i3) {
                        java.lang.String str2 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + str + '_' + strArr[i4]) + '`';
                        hj1Var.EXtogiMhuM = ai1Var2;
                        hj1Var.riuEU0zW4 = str;
                        hj1Var.SH1y5HwkJhh = strArr;
                        hj1Var.ez2rX8ReCYw = i4;
                        hj1Var.JlrlGoKF = i3;
                        hj1Var.cnag84Bm = 1;
                        java.lang.Object ez2rX8ReCYw = defpackage.a70.ez2rX8ReCYw(ai1Var2, str2, hj1Var);
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        if (ez2rX8ReCYw == vjVar) {
                            return vjVar;
                        }
                        i4++;
                        if (i4 < i3) {
                            return defpackage.ok1.IHQe1A4L2xu;
                        }
                    }
                }
            }
        }
        hj1Var = new defpackage.hj1(kj1Var, fjVar);
        java.lang.Object obj2 = hj1Var.DFo87pBq1E5;
        i2 = hj1Var.cnag84Bm;
        if (i2 != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r3) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object IHQe1A4L2xu(defpackage.kj1 kj1Var, defpackage.cw0 cw0Var, defpackage.fj fjVar) {
        defpackage.cj1 cj1Var;
        int i;
        java.util.Set set;
        if (fjVar instanceof defpackage.cj1) {
            cj1Var = (defpackage.cj1) fjVar;
            int i2 = cj1Var.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cj1Var.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = cj1Var.riuEU0zW4;
                i = cj1Var.ez2rX8ReCYw;
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.r41 r41Var = new defpackage.r41(12);
                    cj1Var.EXtogiMhuM = cw0Var;
                    cj1Var.ez2rX8ReCYw = 1;
                    obj = cw0Var.F7NU4MC0GW("SELECT * FROM room_table_modification_log WHERE invalidated = 1", r41Var, cj1Var);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        java.util.Set set2 = (java.util.Set) cj1Var.EXtogiMhuM;
                        defpackage.f70.nBH8hAHy(obj);
                        return set2;
                    }
                    cw0Var = (defpackage.cw0) cj1Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                }
                set = (java.util.Set) obj;
                if (!set.isEmpty()) {
                    cj1Var.EXtogiMhuM = set;
                    cj1Var.ez2rX8ReCYw = 2;
                    if (defpackage.a70.ez2rX8ReCYw(cw0Var, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", cj1Var) == vjVar) {
                        return vjVar;
                    }
                }
                return set;
            }
        }
        cj1Var = new defpackage.cj1(kj1Var, fjVar);
        java.lang.Object obj2 = cj1Var.riuEU0zW4;
        i = cj1Var.ez2rX8ReCYw;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        if (i != 0) {
        }
        set = (java.util.Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007f A[Catch: all -> 0x002b, TryCatch #1 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0074, B:14:0x007f, B:17:0x00b8, B:19:0x008e, B:20:0x0090, B:22:0x009d, B:24:0x00a7, B:26:0x00ad, B:27:0x00ab, B:30:0x00b2), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object oh6vYeIP(defpackage.kj1 kj1Var, defpackage.fj fjVar) {
        defpackage.ej1 ej1Var;
        int i;
        defpackage.F7NU4MC0GW f7nu4mc0gw;
        java.util.Set set;
        java.lang.Object value;
        int[] iArr;
        com.corsair.ledger.data.local.CorsairDatabase_Impl corsairDatabase_Impl = kj1Var.IHQe1A4L2xu;
        if (fjVar instanceof defpackage.ej1) {
            ej1Var = (defpackage.ej1) fjVar;
            int i2 = ej1Var.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ej1Var.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ej1Var.riuEU0zW4;
                i = ej1Var.ez2rX8ReCYw;
                defpackage.ej ejVar = null;
                int i3 = 1;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    defpackage.F7NU4MC0GW f7nu4mc0gw2 = corsairDatabase_Impl.AARZUJiTa;
                    boolean DFo87pBq1E5 = f7nu4mc0gw2.DFo87pBq1E5();
                    defpackage.rt rtVar = defpackage.rt.adDC3e2L;
                    if (!DFo87pBq1E5) {
                        return rtVar;
                    }
                    try {
                        if (!kj1Var.SH1y5HwkJhh.compareAndSet(true, false)) {
                            f7nu4mc0gw2.nBH8hAHy();
                            return rtVar;
                        }
                        if (!((java.lang.Boolean) kj1Var.ez2rX8ReCYw.IHQe1A4L2xu()).booleanValue()) {
                            f7nu4mc0gw2.nBH8hAHy();
                            return rtVar;
                        }
                        defpackage.fj1 fj1Var = new defpackage.fj1(kj1Var, ejVar, i3);
                        ej1Var.EXtogiMhuM = f7nu4mc0gw2;
                        ej1Var.ez2rX8ReCYw = 1;
                        java.lang.Object JlrlGoKF2 = corsairDatabase_Impl.JlrlGoKF(false, fj1Var, ej1Var);
                        defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                        if (JlrlGoKF2 == vjVar) {
                            return vjVar;
                        }
                        f7nu4mc0gw = f7nu4mc0gw2;
                        obj = JlrlGoKF2;
                    } catch (java.lang.Throwable th) {
                        th = th;
                        f7nu4mc0gw = f7nu4mc0gw2;
                        f7nu4mc0gw.nBH8hAHy();
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    f7nu4mc0gw = ej1Var.EXtogiMhuM;
                    try {
                        defpackage.f70.nBH8hAHy(obj);
                    } catch (java.lang.Throwable th2) {
                        th = th2;
                        f7nu4mc0gw.nBH8hAHy();
                        throw th;
                    }
                }
                set = (java.util.Set) obj;
                if (!set.isEmpty()) {
                    defpackage.cm cmVar = kj1Var.riuEU0zW4;
                    cmVar.getClass();
                    set.getClass();
                    if (!set.isEmpty()) {
                        defpackage.hc1 hc1Var = cmVar.IHQe1A4L2xu;
                        do {
                            value = hc1Var.getValue();
                            int[] iArr2 = (int[]) value;
                            int length = iArr2.length;
                            iArr = new int[length];
                            for (int i4 = 0; i4 < length; i4++) {
                                iArr[i4] = set.contains(java.lang.Integer.valueOf(i4)) ? iArr2[i4] + 1 : iArr2[i4];
                            }
                        } while (!hc1Var.riuEU0zW4(value, iArr));
                    }
                    kj1Var.adDC3e2L.AARZUJiTa(set);
                }
                f7nu4mc0gw.nBH8hAHy();
                return set;
            }
        }
        ej1Var = new defpackage.ej1(kj1Var, fjVar);
        java.lang.Object obj2 = ej1Var.riuEU0zW4;
        i = ej1Var.ez2rX8ReCYw;
        defpackage.ej ejVar2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        set = (java.util.Set) obj2;
        if (!set.isEmpty()) {
        }
        f7nu4mc0gw.nBH8hAHy();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00e4, code lost:
    
        if (defpackage.a70.ez2rX8ReCYw(r7, r15, r0) == r4) goto L27;
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
    /* JADX WARN: Type inference failed for: r13v5, types: [cw0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00e4 -> B:11:0x00e7). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final java.lang.Object r1MBDhnF(defpackage.kj1 kj1Var, defpackage.ai1 ai1Var, int i, defpackage.fj fjVar) {
        defpackage.gj1 gj1Var;
        int i2;
        defpackage.ai1 ai1Var2;
        int i3;
        int i4;
        java.lang.String[] strArr;
        defpackage.cw0 cw0Var;
        int i5;
        java.lang.String str;
        kj1Var.getClass();
        if (fjVar instanceof defpackage.gj1) {
            gj1Var = (defpackage.gj1) fjVar;
            int i6 = gj1Var.QoRHpC4k;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                gj1Var.QoRHpC4k = i6 - Integer.MIN_VALUE;
                java.lang.Object obj = gj1Var.SyNS6RMn;
                i2 = gj1Var.QoRHpC4k;
                defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                if (i2 != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    gj1Var.EXtogiMhuM = ai1Var;
                    gj1Var.ez2rX8ReCYw = i;
                    gj1Var.QoRHpC4k = 1;
                    java.lang.Object ez2rX8ReCYw = defpackage.a70.ez2rX8ReCYw(ai1Var, "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i + ", 0)", gj1Var);
                    ai1Var2 = ai1Var;
                } else if (i2 == 1) {
                    i = gj1Var.ez2rX8ReCYw;
                    ?? r13 = gj1Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    ai1Var2 = r13;
                } else {
                    if (i2 != 2) {
                        defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i5 = gj1Var.DFo87pBq1E5;
                    i4 = gj1Var.JlrlGoKF;
                    i3 = gj1Var.ez2rX8ReCYw;
                    strArr = gj1Var.SH1y5HwkJhh;
                    str = gj1Var.riuEU0zW4;
                    cw0Var = gj1Var.EXtogiMhuM;
                    defpackage.f70.nBH8hAHy(obj);
                    i4++;
                    if (i4 >= i5) {
                        return defpackage.ok1.IHQe1A4L2xu;
                    }
                    java.lang.String str2 = strArr[i4];
                    java.lang.String str3 = "CREATE " + (kj1Var.F7NU4MC0GW ? "TEMP" : "") + " TRIGGER IF NOT EXISTS `" + ("room_table_modification_trigger_" + str + '_' + str2) + "` AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i3 + " AND invalidated = 0; END";
                    gj1Var.EXtogiMhuM = cw0Var;
                    gj1Var.riuEU0zW4 = str;
                    gj1Var.SH1y5HwkJhh = strArr;
                    gj1Var.ez2rX8ReCYw = i3;
                    gj1Var.JlrlGoKF = i4;
                    gj1Var.DFo87pBq1E5 = i5;
                    gj1Var.QoRHpC4k = 2;
                }
                java.lang.String str4 = kj1Var.AARZUJiTa[i];
                i3 = i;
                i4 = 0;
                strArr = JlrlGoKF;
                cw0Var = ai1Var2;
                i5 = 3;
                str = str4;
                if (i4 >= i5) {
                }
            }
        }
        gj1Var = new defpackage.gj1(kj1Var, fjVar);
        java.lang.Object obj2 = gj1Var.SyNS6RMn;
        i2 = gj1Var.QoRHpC4k;
        defpackage.vj vjVar2 = defpackage.vj.adDC3e2L;
        if (i2 != 0) {
        }
        java.lang.String str42 = kj1Var.AARZUJiTa[i];
        i3 = i;
        i4 = 0;
        strArr = JlrlGoKF;
        cw0Var = ai1Var2;
        i5 = 3;
        str = str42;
        if (i4 >= i5) {
        }
    }

    public final void adDC3e2L(defpackage.vz vzVar, defpackage.vz vzVar2) {
        vzVar.getClass();
        vzVar2.getClass();
        if (this.SH1y5HwkJhh.compareAndSet(false, true)) {
            vzVar.IHQe1A4L2xu();
            defpackage.dj djVar = this.IHQe1A4L2xu.IHQe1A4L2xu;
            defpackage.ej ejVar = null;
            if (djVar != null) {
                defpackage.fm.SiPhmbmu(djVar, new defpackage.qj(), new defpackage.t01(this, vzVar2, ejVar, 10), 2);
            } else {
                defpackage.x70.Ye0N2xE9Hc("coroutineScope");
                throw null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object xiZrDbcSW0(defpackage.fj fjVar) {
        defpackage.ij1 ij1Var;
        int i;
        defpackage.F7NU4MC0GW f7nu4mc0gw;
        if (fjVar instanceof defpackage.ij1) {
            ij1Var = (defpackage.ij1) fjVar;
            int i2 = ij1Var.ez2rX8ReCYw;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ij1Var.ez2rX8ReCYw = i2 - Integer.MIN_VALUE;
                java.lang.Object obj = ij1Var.riuEU0zW4;
                i = ij1Var.ez2rX8ReCYw;
                defpackage.ej ejVar = null;
                if (i != 0) {
                    defpackage.f70.nBH8hAHy(obj);
                    com.corsair.ledger.data.local.CorsairDatabase_Impl corsairDatabase_Impl = this.IHQe1A4L2xu;
                    defpackage.F7NU4MC0GW f7nu4mc0gw2 = corsairDatabase_Impl.AARZUJiTa;
                    if (f7nu4mc0gw2.DFo87pBq1E5()) {
                        try {
                            defpackage.AARZUJiTa aARZUJiTa = new defpackage.AARZUJiTa(this, ejVar, 19);
                            ij1Var.EXtogiMhuM = f7nu4mc0gw2;
                            ij1Var.ez2rX8ReCYw = 1;
                            java.lang.Object JlrlGoKF2 = corsairDatabase_Impl.JlrlGoKF(false, aARZUJiTa, ij1Var);
                            defpackage.vj vjVar = defpackage.vj.adDC3e2L;
                            if (JlrlGoKF2 == vjVar) {
                                return vjVar;
                            }
                            f7nu4mc0gw = f7nu4mc0gw2;
                        } catch (java.lang.Throwable th) {
                            th = th;
                            f7nu4mc0gw = f7nu4mc0gw2;
                            f7nu4mc0gw.nBH8hAHy();
                            throw th;
                        }
                    }
                    return defpackage.ok1.IHQe1A4L2xu;
                }
                if (i != 1) {
                    defpackage.db.AARZUJiTa("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                f7nu4mc0gw = ij1Var.EXtogiMhuM;
                try {
                    defpackage.f70.nBH8hAHy(obj);
                } catch (java.lang.Throwable th2) {
                    th = th2;
                    f7nu4mc0gw.nBH8hAHy();
                    throw th;
                }
                f7nu4mc0gw.nBH8hAHy();
                return defpackage.ok1.IHQe1A4L2xu;
            }
        }
        ij1Var = new defpackage.ij1(this, fjVar);
        java.lang.Object obj2 = ij1Var.riuEU0zW4;
        i = ij1Var.ez2rX8ReCYw;
        defpackage.ej ejVar2 = null;
        if (i != 0) {
        }
        f7nu4mc0gw.nBH8hAHy();
        return defpackage.ok1.IHQe1A4L2xu;
    }
}
