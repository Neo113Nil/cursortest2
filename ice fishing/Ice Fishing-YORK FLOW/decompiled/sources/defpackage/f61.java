package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class f61 {
    public final defpackage.gu JhCgjQRTAOCT;
    public defpackage.e10 P05cfTpS5W5L;
    public final defpackage.yh1 QiMR8OkAhezm;
    public final java.util.List WDYagTQQm9ns;
    public boolean ZpBGe2uQfcn8;
    public final defpackage.kn fWTAfUmVKrZq;
    public boolean giKS3J6vZuNy;
    public final defpackage.zj oh71FJcDz6S2;

    public f61(defpackage.kn knVar, defpackage.gu guVar, defpackage.qz qzVar) {
        int i;
        defpackage.zj dkVar;
        defpackage.g61 g61Var = knVar.oh71FJcDz6S2;
        defpackage.hu huVar = knVar.fWTAfUmVKrZq;
        defpackage.z61 z61Var = knVar.T1fB7bDYiVJQ;
        java.lang.String str = knVar.giKS3J6vZuNy;
        this.fWTAfUmVKrZq = knVar;
        this.JhCgjQRTAOCT = guVar;
        java.util.List list = knVar.WDYagTQQm9ns;
        this.WDYagTQQm9ns = list == null ? defpackage.av.WDYagTQQm9ns : list;
        if (z61Var != null) {
            this.QiMR8OkAhezm = null;
            if (z61Var.P05cfTpS5W5L()) {
                dkVar = new defpackage.yw0(new defpackage.n80(this, z61Var), str == null ? ":memory:" : str, qzVar);
            } else if (str == null) {
                dkVar = new defpackage.dk(new defpackage.n80(this, z61Var));
            } else {
                defpackage.n80 n80Var = new defpackage.n80(this, z61Var);
                int ordinal = g61Var.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        throw new java.lang.IllegalStateException(("Can't get max number of reader for journal mode '" + g61Var + '\'').toString());
                    }
                    i = 4;
                }
                int ordinal2 = g61Var.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new java.lang.IllegalStateException(("Can't get max number of writers for journal mode '" + g61Var + '\'').toString());
                }
                dkVar = new defpackage.dk(n80Var, str, i);
            }
            this.oh71FJcDz6S2 = dkVar;
        } else {
            if (huVar == null) {
                defpackage.h7.w7APNrr0aGRc("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            defpackage.j10 j10Var = new defpackage.j10(knVar.ZpBGe2uQfcn8, str, new defpackage.wg(this, guVar.ZpBGe2uQfcn8));
            this.QiMR8OkAhezm = j10Var;
            this.oh71FJcDz6S2 = new defpackage.yw0(new defpackage.k0(j10Var), str == null ? ":memory:" : str, qzVar);
        }
        boolean z = g61Var == defpackage.g61.oh71FJcDz6S2;
        defpackage.yh1 yh1Var = this.QiMR8OkAhezm;
        if (yh1Var != null) {
            yh1Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void ZpBGe2uQfcn8(defpackage.f61 f61Var, defpackage.y61 y61Var) {
        java.lang.Object g51Var;
        defpackage.gu guVar = f61Var.JhCgjQRTAOCT;
        giKS3J6vZuNy(y61Var);
        defpackage.kn knVar = f61Var.fWTAfUmVKrZq;
        defpackage.g61 g61Var = knVar.oh71FJcDz6S2;
        defpackage.g61 g61Var2 = defpackage.g61.oh71FJcDz6S2;
        if (g61Var == g61Var2) {
            defpackage.b80.T1fB7bDYiVJQ(y61Var, "PRAGMA journal_mode = WAL");
        } else {
            defpackage.b80.T1fB7bDYiVJQ(y61Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (knVar.oh71FJcDz6S2 == g61Var2) {
            defpackage.b80.T1fB7bDYiVJQ(y61Var, "PRAGMA synchronous = NORMAL");
        } else {
            defpackage.b80.T1fB7bDYiVJQ(y61Var, "PRAGMA synchronous = FULL");
        }
        defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG("PRAGMA user_version");
        try {
            UmgHb6n58gfG.oCu53ZX2v4Ju();
            int i = (int) UmgHb6n58gfG.getLong(0);
            defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
            int i2 = guVar.ZpBGe2uQfcn8;
            if (i != i2) {
                defpackage.b80.T1fB7bDYiVJQ(y61Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        f61Var.fWTAfUmVKrZq(y61Var);
                    } else {
                        f61Var.JhCgjQRTAOCT(y61Var, i, i2);
                    }
                    defpackage.b80.T1fB7bDYiVJQ(y61Var, "PRAGMA user_version = " + i2);
                    g51Var = defpackage.gs1.ZpBGe2uQfcn8;
                } catch (java.lang.Throwable th) {
                    g51Var = new defpackage.g51(th);
                }
                if (!(g51Var instanceof defpackage.g51)) {
                    defpackage.b80.T1fB7bDYiVJQ(y61Var, "END TRANSACTION");
                }
                java.lang.Throwable ZpBGe2uQfcn8 = defpackage.h51.ZpBGe2uQfcn8(g51Var);
                if (ZpBGe2uQfcn8 != null) {
                    defpackage.b80.T1fB7bDYiVJQ(y61Var, "ROLLBACK TRANSACTION");
                    throw ZpBGe2uQfcn8;
                }
            }
            f61Var.WDYagTQQm9ns(y61Var);
        } finally {
        }
    }

    public static void giKS3J6vZuNy(defpackage.y61 y61Var) {
        defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG("PRAGMA busy_timeout");
        try {
            UmgHb6n58gfG.oCu53ZX2v4Ju();
            long j = UmgHb6n58gfG.getLong(0);
            defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
            if (j < 3000) {
                defpackage.b80.T1fB7bDYiVJQ(y61Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0097 A[EDGE_INSN: B:130:0x0097->B:114:0x0097 BREAK  A[LOOP:3: B:92:0x001e->B:115:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void JhCgjQRTAOCT(defpackage.y61 y61Var, int i, int i2) {
        java.lang.Iterable iterable;
        defpackage.bw0 bw0Var;
        boolean z;
        boolean z2;
        y61Var.getClass();
        defpackage.kn knVar = this.fWTAfUmVKrZq;
        defpackage.y70 y70Var = knVar.JhCgjQRTAOCT;
        y70Var.getClass();
        if (i == i2) {
            iterable = defpackage.av.WDYagTQQm9ns;
        } else {
            boolean z3 = i2 > i;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i3 = i;
            do {
                if (z3) {
                    if (i3 >= i2) {
                        iterable = arrayList;
                        break;
                    }
                    java.util.LinkedHashMap linkedHashMap = y70Var.ZpBGe2uQfcn8;
                    if (z3) {
                        java.util.TreeMap treeMap = (java.util.TreeMap) linkedHashMap.get(java.lang.Integer.valueOf(i3));
                        if (treeMap != null) {
                            bw0Var = new defpackage.bw0(treeMap, treeMap.keySet());
                            if (bw0Var != null) {
                            }
                        }
                        bw0Var = null;
                        if (bw0Var != null) {
                        }
                    } else {
                        java.util.TreeMap treeMap2 = (java.util.TreeMap) linkedHashMap.get(java.lang.Integer.valueOf(i3));
                        if (treeMap2 != null) {
                            bw0Var = new defpackage.bw0(treeMap2, treeMap2.descendingKeySet());
                            if (bw0Var != null) {
                                break;
                            }
                            java.util.Map map = (java.util.Map) bw0Var.WDYagTQQm9ns;
                            java.util.Iterator it = ((java.lang.Iterable) bw0Var.oh71FJcDz6S2).iterator();
                            while (it.hasNext()) {
                                int intValue = ((java.lang.Number) it.next()).intValue();
                                if (!z3) {
                                    if (i2 <= intValue && intValue < i3) {
                                        java.lang.Object obj = map.get(java.lang.Integer.valueOf(intValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z = true;
                                        i3 = intValue;
                                        break;
                                        break;
                                    }
                                } else if (i3 + 1 <= intValue && intValue <= i2) {
                                    java.lang.Object obj2 = map.get(java.lang.Integer.valueOf(intValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z = true;
                                    i3 = intValue;
                                    break;
                                }
                            }
                            z = false;
                        }
                        bw0Var = null;
                        if (bw0Var != null) {
                        }
                    }
                } else {
                    if (i3 <= i2) {
                        iterable = arrayList;
                        break;
                    }
                    java.util.LinkedHashMap linkedHashMap2 = y70Var.ZpBGe2uQfcn8;
                    if (z3) {
                    }
                }
            } while (z);
            iterable = null;
        }
        defpackage.gu guVar = this.JhCgjQRTAOCT;
        if (iterable != null) {
            guVar.oh71FJcDz6S2(y61Var);
            java.util.Iterator it2 = iterable.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                defpackage.p81.ZpBGe2uQfcn8();
                return;
            }
            defpackage.j61 QiMR8OkAhezm = guVar.QiMR8OkAhezm(y61Var);
            if (!QiMR8OkAhezm.ZpBGe2uQfcn8) {
                defpackage.h7.maCixPsq4ml2((java.lang.String) QiMR8OkAhezm.giKS3J6vZuNy, "Migration didn't properly handle: ");
                return;
            } else {
                guVar.WDYagTQQm9ns(y61Var);
                oh71FJcDz6S2(y61Var);
                return;
            }
        }
        knVar.getClass();
        if (i <= i2 || !knVar.GE9mJIPrb8gP) {
            java.util.Set set = knVar.Ns0WNyEWdPsk;
            if (knVar.e6mdH7fiFuta && (set == null || !set.contains(java.lang.Integer.valueOf(i)))) {
                z2 = true;
                if (!z2) {
                    throw new java.lang.IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
                }
                if (knVar.gUjdnLbkVAaA) {
                    defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                    try {
                        defpackage.wh0 XntWc4eZSQ8j = defpackage.ma0.XntWc4eZSQ8j();
                        while (UmgHb6n58gfG.oCu53ZX2v4Ju()) {
                            java.lang.String oh71FJcDz6S2 = UmgHb6n58gfG.oh71FJcDz6S2(0);
                            if (!defpackage.ah1.OVwOqzUGHcCU(oh71FJcDz6S2, "sqlite_") && !oh71FJcDz6S2.equals("android_metadata")) {
                                XntWc4eZSQ8j.add(new defpackage.bw0(oh71FJcDz6S2, java.lang.Boolean.valueOf(defpackage.ma0.QiMR8OkAhezm(UmgHb6n58gfG.oh71FJcDz6S2(1), "view"))));
                            }
                        }
                        defpackage.wh0 GE9mJIPrb8gP = defpackage.ma0.GE9mJIPrb8gP(XntWc4eZSQ8j);
                        defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                        java.util.ListIterator listIterator = GE9mJIPrb8gP.listIterator(0);
                        while (true) {
                            defpackage.i50 i50Var = (defpackage.i50) listIterator;
                            if (!i50Var.hasNext()) {
                                break;
                            }
                            defpackage.bw0 bw0Var2 = (defpackage.bw0) i50Var.next();
                            java.lang.String str = (java.lang.String) bw0Var2.WDYagTQQm9ns;
                            if (((java.lang.Boolean) bw0Var2.oh71FJcDz6S2).booleanValue()) {
                                defpackage.b80.T1fB7bDYiVJQ(y61Var, "DROP VIEW IF EXISTS `" + str + '`');
                            } else {
                                defpackage.b80.T1fB7bDYiVJQ(y61Var, "DROP TABLE IF EXISTS `" + str + '`');
                            }
                        }
                    } finally {
                    }
                } else {
                    guVar.giKS3J6vZuNy(y61Var);
                }
                java.util.Iterator it3 = this.WDYagTQQm9ns.iterator();
                while (it3.hasNext()) {
                    ((defpackage.y6) it3.next()).getClass();
                    if (y61Var instanceof defpackage.xh1) {
                        ((defpackage.xh1) y61Var).WDYagTQQm9ns.getClass();
                    }
                }
                guVar.ZpBGe2uQfcn8(y61Var);
                return;
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void WDYagTQQm9ns(defpackage.y61 y61Var) {
        boolean z;
        java.lang.Object g51Var;
        defpackage.j61 QiMR8OkAhezm;
        y61Var.getClass();
        defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (UmgHb6n58gfG.oCu53ZX2v4Ju()) {
                if (UmgHb6n58gfG.getLong(0) != 0) {
                    z = true;
                    defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                    defpackage.gu guVar = this.JhCgjQRTAOCT;
                    if (z) {
                        defpackage.b80.T1fB7bDYiVJQ(y61Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            QiMR8OkAhezm = guVar.QiMR8OkAhezm(y61Var);
                        } catch (java.lang.Throwable th) {
                            g51Var = new defpackage.g51(th);
                        }
                        if (!QiMR8OkAhezm.ZpBGe2uQfcn8) {
                            throw new java.lang.IllegalStateException(("Pre-packaged database has an invalid schema: " + ((java.lang.String) QiMR8OkAhezm.giKS3J6vZuNy)).toString());
                        }
                        guVar.WDYagTQQm9ns(y61Var);
                        oh71FJcDz6S2(y61Var);
                        g51Var = defpackage.gs1.ZpBGe2uQfcn8;
                        if (!(g51Var instanceof defpackage.g51)) {
                            defpackage.b80.T1fB7bDYiVJQ(y61Var, "END TRANSACTION");
                        }
                        java.lang.Throwable ZpBGe2uQfcn8 = defpackage.h51.ZpBGe2uQfcn8(g51Var);
                        if (ZpBGe2uQfcn8 != null) {
                            defpackage.b80.T1fB7bDYiVJQ(y61Var, "ROLLBACK TRANSACTION");
                            throw ZpBGe2uQfcn8;
                        }
                    } else {
                        UmgHb6n58gfG = y61Var.UmgHb6n58gfG("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            java.lang.String oh71FJcDz6S2 = UmgHb6n58gfG.oCu53ZX2v4Ju() ? UmgHb6n58gfG.oh71FJcDz6S2(0) : null;
                            defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                            if (!((java.lang.String) guVar.giKS3J6vZuNy).equals(oh71FJcDz6S2) && !((java.lang.String) guVar.fWTAfUmVKrZq).equals(oh71FJcDz6S2)) {
                                throw new java.lang.IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((java.lang.String) guVar.giKS3J6vZuNy) + ", found: " + oh71FJcDz6S2).toString());
                            }
                        } finally {
                        }
                    }
                    guVar.JhCgjQRTAOCT(y61Var);
                    for (defpackage.y6 y6Var : this.WDYagTQQm9ns) {
                        y6Var.getClass();
                        if (y61Var instanceof defpackage.xh1) {
                            defpackage.e10 e10Var = ((defpackage.xh1) y61Var).WDYagTQQm9ns;
                            int i = y6Var.ZpBGe2uQfcn8;
                            e10Var.getClass();
                            switch (i) {
                                case 1:
                                    ((defpackage.fNwYGHIYeJcR) y6Var.giKS3J6vZuNy).P05cfTpS5W5L(e10Var);
                                    break;
                            }
                        }
                    }
                    this.ZpBGe2uQfcn8 = true;
                }
            }
            z = false;
            defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
            defpackage.gu guVar2 = this.JhCgjQRTAOCT;
            if (z) {
            }
            guVar2.JhCgjQRTAOCT(y61Var);
            while (r0.hasNext()) {
            }
            this.ZpBGe2uQfcn8 = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fWTAfUmVKrZq(defpackage.y61 y61Var) {
        boolean z;
        y61Var.getClass();
        defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            int i = 0;
            if (UmgHb6n58gfG.oCu53ZX2v4Ju()) {
                if (UmgHb6n58gfG.getLong(0) == 0) {
                    z = true;
                    defpackage.kl klVar = null;
                    defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                    defpackage.gu guVar = this.JhCgjQRTAOCT;
                    guVar.ZpBGe2uQfcn8(y61Var);
                    if (!z) {
                        defpackage.j61 QiMR8OkAhezm = guVar.QiMR8OkAhezm(y61Var);
                        if (!QiMR8OkAhezm.ZpBGe2uQfcn8) {
                            defpackage.h7.maCixPsq4ml2((java.lang.String) QiMR8OkAhezm.giKS3J6vZuNy, "Pre-packaged database has an invalid schema: ");
                            return;
                        }
                    }
                    oh71FJcDz6S2(y61Var);
                    guVar.fWTAfUmVKrZq(y61Var);
                    for (defpackage.y6 y6Var : this.WDYagTQQm9ns) {
                        y6Var.getClass();
                        if (y61Var instanceof defpackage.xh1) {
                            defpackage.e10 e10Var = ((defpackage.xh1) y61Var).WDYagTQQm9ns;
                            int i2 = y6Var.ZpBGe2uQfcn8;
                            e10Var.getClass();
                            switch (i2) {
                                case 0:
                                    defpackage.jo joVar = defpackage.tq.ZpBGe2uQfcn8;
                                    defpackage.ok0.zJPqDeoF0Os1(defpackage.ok0.QiMR8OkAhezm(defpackage.co.QiMR8OkAhezm), null, new defpackage.x6((android.content.Context) y6Var.giKS3J6vZuNy, klVar, i), 3);
                                    break;
                            }
                        }
                    }
                }
            }
            z = false;
            defpackage.kl klVar2 = null;
            defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
            defpackage.gu guVar2 = this.JhCgjQRTAOCT;
            guVar2.ZpBGe2uQfcn8(y61Var);
            if (!z) {
            }
            oh71FJcDz6S2(y61Var);
            guVar2.fWTAfUmVKrZq(y61Var);
            while (r7.hasNext()) {
            }
        } finally {
        }
    }

    public final void oh71FJcDz6S2(defpackage.y61 y61Var) {
        defpackage.b80.T1fB7bDYiVJQ(y61Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.b80.T1fB7bDYiVJQ(y61Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((java.lang.String) this.JhCgjQRTAOCT.giKS3J6vZuNy) + "')");
    }

    public f61(defpackage.kn knVar, defpackage.lp0 lp0Var, defpackage.qz qzVar) {
        this.fWTAfUmVKrZq = knVar;
        this.JhCgjQRTAOCT = new defpackage.e61(-1, "", "");
        java.util.List list = knVar.WDYagTQQm9ns;
        defpackage.av avVar = defpackage.av.WDYagTQQm9ns;
        this.WDYagTQQm9ns = list == null ? avVar : list;
        defpackage.hf.lXYSMswtzmix(list == null ? avVar : list, new defpackage.y6(1, new defpackage.fNwYGHIYeJcR(25, this)));
        knVar.JhCgjQRTAOCT.getClass();
        throw new defpackage.es0(0);
    }
}
