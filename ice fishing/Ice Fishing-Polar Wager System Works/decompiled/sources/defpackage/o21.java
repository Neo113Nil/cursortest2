package defpackage;

/* loaded from: classes.dex */
public final class o21 {
    public final defpackage.nd1 AARZUJiTa;
    public defpackage.mz EXtogiMhuM;
    public final defpackage.ts F7NU4MC0GW;
    public boolean IHQe1A4L2xu;
    public final java.util.List adDC3e2L;
    public boolean oh6vYeIP;
    public final defpackage.dm r1MBDhnF;
    public final defpackage.xh xiZrDbcSW0;

    public o21(defpackage.dm dmVar, defpackage.ts tsVar, defpackage.iy iyVar) {
        int i;
        defpackage.xh biVar;
        defpackage.p21 p21Var = dmVar.AARZUJiTa;
        defpackage.ky kyVar = dmVar.r1MBDhnF;
        defpackage.j31 j31Var = dmVar.QoRHpC4k;
        java.lang.String str = dmVar.oh6vYeIP;
        this.r1MBDhnF = dmVar;
        this.F7NU4MC0GW = tsVar;
        java.util.List list = dmVar.adDC3e2L;
        this.adDC3e2L = list == null ? defpackage.nt.adDC3e2L : list;
        if (j31Var != null) {
            this.AARZUJiTa = null;
            if (j31Var.riuEU0zW4()) {
                biVar = new defpackage.zt0(new defpackage.F7NU4MC0GW(this, j31Var), str == null ? ":memory:" : str, iyVar);
            } else if (str == null) {
                biVar = new defpackage.bi(new defpackage.F7NU4MC0GW(this, j31Var));
            } else {
                defpackage.F7NU4MC0GW f7nu4mc0gw = new defpackage.F7NU4MC0GW(this, j31Var);
                int ordinal = p21Var.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        throw new java.lang.IllegalStateException(("Can't get max number of reader for journal mode '" + p21Var + '\'').toString());
                    }
                    i = 4;
                }
                int ordinal2 = p21Var.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    throw new java.lang.IllegalStateException(("Can't get max number of writers for journal mode '" + p21Var + '\'').toString());
                }
                biVar = new defpackage.bi(f7nu4mc0gw, str, i);
            }
            this.xiZrDbcSW0 = biVar;
        } else {
            if (kyVar == null) {
                defpackage.db.fnWB2E7cs("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
            defpackage.rz rzVar = new defpackage.rz(dmVar.IHQe1A4L2xu, str, new defpackage.fz(this, tsVar.IHQe1A4L2xu));
            this.AARZUJiTa = rzVar;
            this.xiZrDbcSW0 = new defpackage.zt0(new defpackage.sa1(rzVar), str == null ? ":memory:" : str, iyVar);
        }
        boolean z = p21Var == defpackage.p21.xiZrDbcSW0;
        defpackage.nd1 nd1Var = this.AARZUJiTa;
        if (nd1Var != null) {
            nd1Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void IHQe1A4L2xu(defpackage.o21 o21Var, defpackage.i31 i31Var) {
        java.lang.Object p11Var;
        defpackage.ts tsVar = o21Var.F7NU4MC0GW;
        oh6vYeIP(i31Var);
        defpackage.dm dmVar = o21Var.r1MBDhnF;
        defpackage.p21 p21Var = dmVar.AARZUJiTa;
        defpackage.p21 p21Var2 = defpackage.p21.xiZrDbcSW0;
        if (p21Var == p21Var2) {
            defpackage.a70.JlrlGoKF(i31Var, "PRAGMA journal_mode = WAL");
        } else {
            defpackage.a70.JlrlGoKF(i31Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (dmVar.AARZUJiTa == p21Var2) {
            defpackage.a70.JlrlGoKF(i31Var, "PRAGMA synchronous = NORMAL");
        } else {
            defpackage.a70.JlrlGoKF(i31Var, "PRAGMA synchronous = FULL");
        }
        defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy("PRAGMA user_version");
        try {
            nBH8hAHy.NHJTzaLwkd();
            int i = (int) nBH8hAHy.getLong(0);
            defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
            int i2 = tsVar.IHQe1A4L2xu;
            if (i != i2) {
                defpackage.a70.JlrlGoKF(i31Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        o21Var.r1MBDhnF(i31Var);
                    } else {
                        o21Var.F7NU4MC0GW(i31Var, i, i2);
                    }
                    defpackage.a70.JlrlGoKF(i31Var, "PRAGMA user_version = " + i2);
                    p11Var = defpackage.ok1.IHQe1A4L2xu;
                } catch (java.lang.Throwable th) {
                    p11Var = new defpackage.p11(th);
                }
                if (!(p11Var instanceof defpackage.p11)) {
                    defpackage.a70.JlrlGoKF(i31Var, "END TRANSACTION");
                }
                java.lang.Throwable IHQe1A4L2xu = defpackage.q11.IHQe1A4L2xu(p11Var);
                if (IHQe1A4L2xu != null) {
                    defpackage.a70.JlrlGoKF(i31Var, "ROLLBACK TRANSACTION");
                    throw IHQe1A4L2xu;
                }
            }
            o21Var.adDC3e2L(i31Var);
        } finally {
        }
    }

    public static void oh6vYeIP(defpackage.i31 i31Var) {
        defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy("PRAGMA busy_timeout");
        try {
            nBH8hAHy.NHJTzaLwkd();
            long j = nBH8hAHy.getLong(0);
            defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
            if (j < 3000) {
                defpackage.a70.JlrlGoKF(i31Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (java.lang.Throwable th) {
            try {
                throw th;
            } catch (java.lang.Throwable th2) {
                defpackage.gq1.JlrlGoKF(nBH8hAHy, th);
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
    public final void F7NU4MC0GW(defpackage.i31 i31Var, int i, int i2) {
        java.lang.Iterable iterable;
        defpackage.et0 et0Var;
        boolean z;
        boolean z2;
        i31Var.getClass();
        defpackage.dm dmVar = this.r1MBDhnF;
        defpackage.u50 u50Var = dmVar.F7NU4MC0GW;
        u50Var.getClass();
        if (i == i2) {
            iterable = defpackage.nt.adDC3e2L;
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
                    java.util.LinkedHashMap linkedHashMap = u50Var.IHQe1A4L2xu;
                    if (z3) {
                        java.util.TreeMap treeMap = (java.util.TreeMap) linkedHashMap.get(java.lang.Integer.valueOf(i3));
                        if (treeMap != null) {
                            et0Var = new defpackage.et0(treeMap, treeMap.keySet());
                            if (et0Var != null) {
                            }
                        }
                        et0Var = null;
                        if (et0Var != null) {
                        }
                    } else {
                        java.util.TreeMap treeMap2 = (java.util.TreeMap) linkedHashMap.get(java.lang.Integer.valueOf(i3));
                        if (treeMap2 != null) {
                            et0Var = new defpackage.et0(treeMap2, treeMap2.descendingKeySet());
                            if (et0Var != null) {
                                break;
                            }
                            java.util.Map map = (java.util.Map) et0Var.adDC3e2L;
                            java.util.Iterator it = ((java.lang.Iterable) et0Var.xiZrDbcSW0).iterator();
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
                        et0Var = null;
                        if (et0Var != null) {
                        }
                    }
                } else {
                    if (i3 <= i2) {
                        iterable = arrayList;
                        break;
                    }
                    java.util.LinkedHashMap linkedHashMap2 = u50Var.IHQe1A4L2xu;
                    if (z3) {
                    }
                }
            } while (z);
            iterable = null;
        }
        defpackage.ts tsVar = this.F7NU4MC0GW;
        if (iterable != null) {
            tsVar.xiZrDbcSW0(i31Var);
            java.util.Iterator it2 = iterable.iterator();
            if (it2.hasNext()) {
                it2.next().getClass();
                defpackage.db.kd6TUFXn();
                return;
            }
            defpackage.t21 AARZUJiTa = tsVar.AARZUJiTa(i31Var);
            if (!AARZUJiTa.IHQe1A4L2xu) {
                defpackage.db.kNAkVymC((java.lang.String) AARZUJiTa.oh6vYeIP, "Migration didn't properly handle: ");
                return;
            } else {
                tsVar.adDC3e2L(i31Var);
                xiZrDbcSW0(i31Var);
                return;
            }
        }
        dmVar.getClass();
        if (i <= i2 || !dmVar.ez2rX8ReCYw) {
            java.util.Set set = dmVar.JlrlGoKF;
            if (dmVar.SH1y5HwkJhh && (set == null || !set.contains(java.lang.Integer.valueOf(i)))) {
                z2 = true;
                if (!z2) {
                    throw new java.lang.IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
                }
                if (dmVar.cnag84Bm) {
                    defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                    try {
                        defpackage.te0 kNAkVymC = defpackage.fm.kNAkVymC();
                        while (nBH8hAHy.NHJTzaLwkd()) {
                            java.lang.String xiZrDbcSW0 = nBH8hAHy.xiZrDbcSW0(0);
                            if (!defpackage.yc1.wKlPRKlRnfqr(xiZrDbcSW0, "sqlite_") && !xiZrDbcSW0.equals("android_metadata")) {
                                kNAkVymC.add(new defpackage.et0(xiZrDbcSW0, java.lang.Boolean.valueOf(defpackage.x70.QoRHpC4k(nBH8hAHy.xiZrDbcSW0(1), "view"))));
                            }
                        }
                        defpackage.te0 fnWB2E7cs = defpackage.fm.fnWB2E7cs(kNAkVymC);
                        defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
                        java.util.ListIterator listIterator = fnWB2E7cs.listIterator(0);
                        while (true) {
                            defpackage.b40 b40Var = (defpackage.b40) listIterator;
                            if (!b40Var.hasNext()) {
                                break;
                            }
                            defpackage.et0 et0Var2 = (defpackage.et0) b40Var.next();
                            java.lang.String str = (java.lang.String) et0Var2.adDC3e2L;
                            if (((java.lang.Boolean) et0Var2.xiZrDbcSW0).booleanValue()) {
                                defpackage.a70.JlrlGoKF(i31Var, "DROP VIEW IF EXISTS `" + str + '`');
                            } else {
                                defpackage.a70.JlrlGoKF(i31Var, "DROP TABLE IF EXISTS `" + str + '`');
                            }
                        }
                    } finally {
                    }
                } else {
                    tsVar.oh6vYeIP(i31Var);
                }
                java.util.Iterator it3 = this.adDC3e2L.iterator();
                while (it3.hasNext()) {
                    ((defpackage.n21) it3.next()).getClass();
                    if (i31Var instanceof defpackage.md1) {
                        ((defpackage.md1) i31Var).adDC3e2L.getClass();
                    }
                }
                tsVar.IHQe1A4L2xu(i31Var);
                return;
            }
        }
        z2 = false;
        if (!z2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void adDC3e2L(defpackage.i31 i31Var) {
        boolean z;
        java.lang.Object p11Var;
        defpackage.t21 AARZUJiTa;
        i31Var.getClass();
        defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (nBH8hAHy.NHJTzaLwkd()) {
                if (nBH8hAHy.getLong(0) != 0) {
                    z = true;
                    defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
                    defpackage.ts tsVar = this.F7NU4MC0GW;
                    if (z) {
                        defpackage.a70.JlrlGoKF(i31Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            AARZUJiTa = tsVar.AARZUJiTa(i31Var);
                        } catch (java.lang.Throwable th) {
                            p11Var = new defpackage.p11(th);
                        }
                        if (!AARZUJiTa.IHQe1A4L2xu) {
                            throw new java.lang.IllegalStateException(("Pre-packaged database has an invalid schema: " + ((java.lang.String) AARZUJiTa.oh6vYeIP)).toString());
                        }
                        tsVar.adDC3e2L(i31Var);
                        xiZrDbcSW0(i31Var);
                        p11Var = defpackage.ok1.IHQe1A4L2xu;
                        if (!(p11Var instanceof defpackage.p11)) {
                            defpackage.a70.JlrlGoKF(i31Var, "END TRANSACTION");
                        }
                        java.lang.Throwable IHQe1A4L2xu = defpackage.q11.IHQe1A4L2xu(p11Var);
                        if (IHQe1A4L2xu != null) {
                            defpackage.a70.JlrlGoKF(i31Var, "ROLLBACK TRANSACTION");
                            throw IHQe1A4L2xu;
                        }
                    } else {
                        nBH8hAHy = i31Var.nBH8hAHy("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            java.lang.String xiZrDbcSW0 = nBH8hAHy.NHJTzaLwkd() ? nBH8hAHy.xiZrDbcSW0(0) : null;
                            defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
                            if (!((java.lang.String) tsVar.oh6vYeIP).equals(xiZrDbcSW0) && !((java.lang.String) tsVar.r1MBDhnF).equals(xiZrDbcSW0)) {
                                throw new java.lang.IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((java.lang.String) tsVar.oh6vYeIP) + ", found: " + xiZrDbcSW0).toString());
                            }
                        } finally {
                        }
                    }
                    tsVar.F7NU4MC0GW(i31Var);
                    for (defpackage.n21 n21Var : this.adDC3e2L) {
                        n21Var.getClass();
                        if (i31Var instanceof defpackage.md1) {
                            defpackage.mz mzVar = ((defpackage.md1) i31Var).adDC3e2L;
                            mzVar.getClass();
                            n21Var.IHQe1A4L2xu.AARZUJiTa(mzVar);
                        }
                    }
                    this.IHQe1A4L2xu = true;
                }
            }
            z = false;
            defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
            defpackage.ts tsVar2 = this.F7NU4MC0GW;
            if (z) {
            }
            tsVar2.F7NU4MC0GW(i31Var);
            while (r0.hasNext()) {
            }
            this.IHQe1A4L2xu = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final void r1MBDhnF(defpackage.i31 i31Var) {
        i31Var.getClass();
        defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (nBH8hAHy.NHJTzaLwkd()) {
                if (nBH8hAHy.getLong(0) == 0) {
                    z = true;
                }
            }
            defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
            defpackage.ts tsVar = this.F7NU4MC0GW;
            tsVar.IHQe1A4L2xu(i31Var);
            if (!z) {
                defpackage.t21 AARZUJiTa = tsVar.AARZUJiTa(i31Var);
                if (!AARZUJiTa.IHQe1A4L2xu) {
                    defpackage.db.kNAkVymC((java.lang.String) AARZUJiTa.oh6vYeIP, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            xiZrDbcSW0(i31Var);
            tsVar.r1MBDhnF(i31Var);
            java.util.Iterator it = this.adDC3e2L.iterator();
            while (it.hasNext()) {
                ((defpackage.n21) it.next()).getClass();
                if (i31Var instanceof defpackage.md1) {
                    ((defpackage.md1) i31Var).adDC3e2L.getClass();
                }
            }
        } finally {
        }
    }

    public final void xiZrDbcSW0(defpackage.i31 i31Var) {
        defpackage.a70.JlrlGoKF(i31Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.a70.JlrlGoKF(i31Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((java.lang.String) this.F7NU4MC0GW.oh6vYeIP) + "')");
    }

    public o21(defpackage.dm dmVar, defpackage.uc0 uc0Var, defpackage.iy iyVar) {
        this.r1MBDhnF = dmVar;
        this.F7NU4MC0GW = new defpackage.m21(-1, "", "");
        java.util.List list = dmVar.adDC3e2L;
        defpackage.nt ntVar = defpackage.nt.adDC3e2L;
        this.adDC3e2L = list == null ? ntVar : list;
        defpackage.td.ZNF7fheNE(list == null ? ntVar : list, new defpackage.n21(new defpackage.DFo87pBq1E5(22, this)));
        dmVar.F7NU4MC0GW.getClass();
        throw new defpackage.sp0(0);
    }
}
