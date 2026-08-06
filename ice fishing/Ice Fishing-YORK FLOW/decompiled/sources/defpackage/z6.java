package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class z6 extends defpackage.gu {
    public final /* synthetic */ com.ice.fishing.wolberta.data.local.AppDatabase_Impl JhCgjQRTAOCT;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6(com.ice.fishing.wolberta.data.local.AppDatabase_Impl appDatabase_Impl) {
        super(1, "d93997a042e58e40a24d9f14784df6d6", "08349b895bfbf8a4f2b915feaff16531");
        this.JhCgjQRTAOCT = appDatabase_Impl;
    }

    @Override // defpackage.gu
    public final void JhCgjQRTAOCT(defpackage.y61 y61Var) {
        y61Var.getClass();
        defpackage.wa0 JhCgjQRTAOCT = this.JhCgjQRTAOCT.JhCgjQRTAOCT();
        defpackage.hq1 hq1Var = JhCgjQRTAOCT.giKS3J6vZuNy;
        hq1Var.getClass();
        defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG("PRAGMA query_only");
        try {
            UmgHb6n58gfG.oCu53ZX2v4Ju();
            boolean T1fB7bDYiVJQ = UmgHb6n58gfG.T1fB7bDYiVJQ();
            defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
            if (!T1fB7bDYiVJQ) {
                defpackage.b80.T1fB7bDYiVJQ(y61Var, "PRAGMA temp_store = MEMORY");
                defpackage.b80.T1fB7bDYiVJQ(y61Var, "PRAGMA recursive_triggers = 1");
                defpackage.b80.T1fB7bDYiVJQ(y61Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (hq1Var.JhCgjQRTAOCT) {
                    defpackage.b80.T1fB7bDYiVJQ(y61Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    defpackage.b80.T1fB7bDYiVJQ(y61Var, defpackage.ah1.Wc0TdmRSwbbi("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                defpackage.rs0 rs0Var = hq1Var.P05cfTpS5W5L;
                java.util.concurrent.locks.ReentrantLock reentrantLock = rs0Var.ZpBGe2uQfcn8;
                reentrantLock.lock();
                try {
                    rs0Var.JhCgjQRTAOCT = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (JhCgjQRTAOCT.QiMR8OkAhezm) {
            }
        } finally {
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x02aa  */
    @Override // defpackage.gu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final defpackage.j61 QiMR8OkAhezm(defpackage.y61 y61Var) {
        long j;
        java.util.Map giKS3J6vZuNy;
        defpackage.sc1 sc1Var;
        defpackage.bj1 bj1Var;
        y61Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("id", new defpackage.yi1("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("name", new defpackage.yi1("name", "TEXT", true, 0, null, 1));
        linkedHashMap.put("marked", new defpackage.yi1("marked", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("type", new defpackage.yi1("type", "TEXT", true, 0, null, 1));
        linkedHashMap.put("icon", new defpackage.yi1("icon", "TEXT", true, 0, null, 1));
        linkedHashMap.put("heat", new defpackage.yi1("heat", "TEXT", true, 0, null, 1));
        linkedHashMap.put("veggie", new defpackage.yi1("veggie", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("time", new defpackage.yi1("time", "TEXT", true, 0, null, 1));
        linkedHashMap.put("score", new defpackage.yi1("score", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("style", new defpackage.yi1("style", "TEXT", true, 0, null, 1));
        defpackage.bj1 bj1Var2 = new defpackage.bj1(linkedHashMap, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
        defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG("PRAGMA table_info(`items`)");
        try {
            long j2 = 0;
            if (UmgHb6n58gfG.oCu53ZX2v4Ju()) {
                int s0TASMVLSWD5 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "name");
                int s0TASMVLSWD52 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "type");
                int s0TASMVLSWD53 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "notnull");
                int s0TASMVLSWD54 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "pk");
                int s0TASMVLSWD55 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "dflt_value");
                defpackage.ck0 ck0Var = new defpackage.ck0();
                while (true) {
                    java.lang.String oh71FJcDz6S2 = UmgHb6n58gfG.oh71FJcDz6S2(s0TASMVLSWD5);
                    j = j2;
                    ck0Var.put(oh71FJcDz6S2, new defpackage.yi1(oh71FJcDz6S2, UmgHb6n58gfG.oh71FJcDz6S2(s0TASMVLSWD52), UmgHb6n58gfG.getLong(s0TASMVLSWD53) != j2, (int) UmgHb6n58gfG.getLong(s0TASMVLSWD54), UmgHb6n58gfG.isNull(s0TASMVLSWD55) ? null : UmgHb6n58gfG.oh71FJcDz6S2(s0TASMVLSWD55), 2));
                    if (!UmgHb6n58gfG.oCu53ZX2v4Ju()) {
                        break;
                    }
                    bj1Var2 = bj1Var2;
                    j2 = j;
                }
                giKS3J6vZuNy = ck0Var.giKS3J6vZuNy();
                defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
            } else {
                giKS3J6vZuNy = defpackage.bv.WDYagTQQm9ns;
                defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                j = 0;
            }
            UmgHb6n58gfG = y61Var.UmgHb6n58gfG("PRAGMA foreign_key_list(`items`)");
            try {
                int s0TASMVLSWD56 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "id");
                int s0TASMVLSWD57 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "seq");
                int s0TASMVLSWD58 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "table");
                int s0TASMVLSWD59 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "on_delete");
                int s0TASMVLSWD510 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "on_update");
                java.util.List jjTN4uUnoyEn = defpackage.b80.jjTN4uUnoyEn(UmgHb6n58gfG);
                UmgHb6n58gfG.qjMheFZ0l9kA();
                defpackage.sc1 sc1Var2 = new defpackage.sc1();
                while (UmgHb6n58gfG.oCu53ZX2v4Ju()) {
                    if (UmgHb6n58gfG.getLong(s0TASMVLSWD57) == j) {
                        defpackage.bj1 bj1Var3 = bj1Var2;
                        int i = (int) UmgHb6n58gfG.getLong(s0TASMVLSWD56);
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.ArrayList arrayList3 = new java.util.ArrayList();
                        for (java.lang.Object obj : jjTN4uUnoyEn) {
                            int i2 = s0TASMVLSWD56;
                            if (((defpackage.b10) obj).WDYagTQQm9ns == i) {
                                arrayList3.add(obj);
                            }
                            s0TASMVLSWD56 = i2;
                        }
                        int i3 = s0TASMVLSWD56;
                        int i4 = 0;
                        for (int size = arrayList3.size(); i4 < size; size = size) {
                            java.lang.Object obj2 = arrayList3.get(i4);
                            i4++;
                            defpackage.b10 b10Var = (defpackage.b10) obj2;
                            arrayList.add(b10Var.QiMR8OkAhezm);
                            arrayList2.add(b10Var.P05cfTpS5W5L);
                        }
                        sc1Var2.add(new defpackage.zi1(UmgHb6n58gfG.oh71FJcDz6S2(s0TASMVLSWD58), UmgHb6n58gfG.oh71FJcDz6S2(s0TASMVLSWD59), UmgHb6n58gfG.oh71FJcDz6S2(s0TASMVLSWD510), arrayList, arrayList2));
                        bj1Var2 = bj1Var3;
                        s0TASMVLSWD56 = i3;
                    }
                }
                defpackage.bj1 bj1Var4 = bj1Var2;
                defpackage.sc1 XntWc4eZSQ8j = defpackage.wc1.XntWc4eZSQ8j(sc1Var2);
                defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                UmgHb6n58gfG = y61Var.UmgHb6n58gfG("PRAGMA index_list(`items`)");
                try {
                    int s0TASMVLSWD511 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "name");
                    int s0TASMVLSWD512 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "origin");
                    int s0TASMVLSWD513 = defpackage.j80.s0TASMVLSWD5(UmgHb6n58gfG, "unique");
                    if (s0TASMVLSWD511 != -1 && s0TASMVLSWD512 != -1 && s0TASMVLSWD513 != -1) {
                        defpackage.sc1 sc1Var3 = new defpackage.sc1();
                        while (UmgHb6n58gfG.oCu53ZX2v4Ju()) {
                            if ("c".equals(UmgHb6n58gfG.oh71FJcDz6S2(s0TASMVLSWD512))) {
                                defpackage.aj1 Mearx7yMn90V = defpackage.b80.Mearx7yMn90V(y61Var, UmgHb6n58gfG.oh71FJcDz6S2(s0TASMVLSWD511), UmgHb6n58gfG.getLong(s0TASMVLSWD513) == 1);
                                if (Mearx7yMn90V == null) {
                                    defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                                } else {
                                    sc1Var3.add(Mearx7yMn90V);
                                }
                            }
                        }
                        defpackage.sc1 XntWc4eZSQ8j2 = defpackage.wc1.XntWc4eZSQ8j(sc1Var3);
                        defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                        sc1Var = XntWc4eZSQ8j2;
                        bj1Var = new defpackage.bj1(giKS3J6vZuNy, XntWc4eZSQ8j, sc1Var);
                        if (!bj1Var4.equals(bj1Var)) {
                            return new defpackage.j61((java.lang.String) null, true);
                        }
                        return new defpackage.j61("items(com.ice.fishing.wolberta.data.local.Item).\n Expected:\n" + bj1Var4 + "\n Found:\n" + bj1Var, false);
                    }
                    defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
                    sc1Var = null;
                    bj1Var = new defpackage.bj1(giKS3J6vZuNy, XntWc4eZSQ8j, sc1Var);
                    if (!bj1Var4.equals(bj1Var)) {
                    }
                } finally {
                }
            } catch (java.lang.Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.gu
    public final void WDYagTQQm9ns(defpackage.y61 y61Var) {
        y61Var.getClass();
    }

    @Override // defpackage.gu
    public final void ZpBGe2uQfcn8(defpackage.y61 y61Var) {
        y61Var.getClass();
        defpackage.b80.T1fB7bDYiVJQ(y61Var, "CREATE TABLE IF NOT EXISTS `items` (`id` INTEGER NOT NULL, `name` TEXT NOT NULL, `marked` INTEGER NOT NULL, `type` TEXT NOT NULL, `icon` TEXT NOT NULL, `heat` TEXT NOT NULL, `veggie` INTEGER NOT NULL, `time` TEXT NOT NULL, `score` INTEGER NOT NULL, `style` TEXT NOT NULL, PRIMARY KEY(`id`))");
        defpackage.b80.T1fB7bDYiVJQ(y61Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.b80.T1fB7bDYiVJQ(y61Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'd93997a042e58e40a24d9f14784df6d6')");
    }

    @Override // defpackage.gu
    public final void fWTAfUmVKrZq(defpackage.y61 y61Var) {
        y61Var.getClass();
    }

    @Override // defpackage.gu
    public final void giKS3J6vZuNy(defpackage.y61 y61Var) {
        y61Var.getClass();
        defpackage.b80.T1fB7bDYiVJQ(y61Var, "DROP TABLE IF EXISTS `items`");
    }

    @Override // defpackage.gu
    public final void oh71FJcDz6S2(defpackage.y61 y61Var) {
        y61Var.getClass();
        defpackage.wh0 XntWc4eZSQ8j = defpackage.ma0.XntWc4eZSQ8j();
        defpackage.a71 UmgHb6n58gfG = y61Var.UmgHb6n58gfG("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (UmgHb6n58gfG.oCu53ZX2v4Ju()) {
            try {
                XntWc4eZSQ8j.add(UmgHb6n58gfG.oh71FJcDz6S2(0));
            } finally {
            }
        }
        defpackage.vx1.T1fB7bDYiVJQ(UmgHb6n58gfG, null);
        java.util.ListIterator listIterator = defpackage.ma0.GE9mJIPrb8gP(XntWc4eZSQ8j).listIterator(0);
        while (true) {
            defpackage.i50 i50Var = (defpackage.i50) listIterator;
            if (!i50Var.hasNext()) {
                return;
            }
            java.lang.String str = (java.lang.String) i50Var.next();
            if (defpackage.ah1.OVwOqzUGHcCU(str, "room_fts_content_sync_")) {
                defpackage.b80.T1fB7bDYiVJQ(y61Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }
}
