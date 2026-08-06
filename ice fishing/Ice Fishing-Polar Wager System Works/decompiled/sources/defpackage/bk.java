package defpackage;

/* loaded from: classes.dex */
public final class bk extends defpackage.ts {
    public final /* synthetic */ com.corsair.ledger.data.local.CorsairDatabase_Impl F7NU4MC0GW;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bk(com.corsair.ledger.data.local.CorsairDatabase_Impl corsairDatabase_Impl) {
        super(1, "a593909ea42f974709fd506e88f19777", "6e8438200876ea6fe46453ba78a89d6b");
        this.F7NU4MC0GW = corsairDatabase_Impl;
    }

    @Override // defpackage.ts
    public final defpackage.t21 AARZUJiTa(defpackage.i31 i31Var) {
        i31Var.getClass();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("id", new defpackage.pe1(1, 1, "id", "INTEGER", null, true));
        linkedHashMap.put("doubloons", new defpackage.pe1(0, 1, "doubloons", "INTEGER", null, true));
        linkedHashMap.put("storedEnergy", new defpackage.pe1(0, 1, "storedEnergy", "INTEGER", null, true));
        linkedHashMap.put("energyAnchorMs", new defpackage.pe1(0, 1, "energyAnchorMs", "INTEGER", null, true));
        linkedHashMap.put("lastChestMs", new defpackage.pe1(0, 1, "lastChestMs", "INTEGER", null, true));
        linkedHashMap.put("victorySeen", new defpackage.pe1(0, 1, "victorySeen", "INTEGER", null, true));
        linkedHashMap.put("cellsDug", new defpackage.pe1(0, 1, "cellsDug", "INTEGER", null, true));
        linkedHashMap.put("relicsFound", new defpackage.pe1(0, 1, "relicsFound", "INTEGER", null, true));
        linkedHashMap.put("legendariesFound", new defpackage.pe1(0, 1, "legendariesFound", "INTEGER", null, true));
        linkedHashMap.put("craftCount", new defpackage.pe1(0, 1, "craftCount", "INTEGER", null, true));
        linkedHashMap.put("cursedHits", new defpackage.pe1(0, 1, "cursedHits", "INTEGER", null, true));
        linkedHashMap.put("tradeCount", new defpackage.pe1(0, 1, "tradeCount", "INTEGER", null, true));
        linkedHashMap.put("duplicatesSold", new defpackage.pe1(0, 1, "duplicatesSold", "INTEGER", null, true));
        linkedHashMap.put("peakDoubloons", new defpackage.pe1(0, 1, "peakDoubloons", "INTEGER", null, true));
        defpackage.se1 se1Var = new defpackage.se1("player", linkedHashMap, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
        defpackage.se1 abhbClRa = defpackage.e90.abhbClRa(i31Var, "player");
        if (!se1Var.equals(abhbClRa)) {
            return new defpackage.t21("player(com.corsair.ledger.data.local.entity.PlayerEntity).\n Expected:\n" + se1Var + "\n Found:\n" + abhbClRa, false);
        }
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        linkedHashMap2.put("rarity", new defpackage.pe1(1, 1, "rarity", "TEXT", null, true));
        linkedHashMap2.put("amount", new defpackage.pe1(0, 1, "amount", "INTEGER", null, true));
        defpackage.se1 se1Var2 = new defpackage.se1("shards", linkedHashMap2, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
        defpackage.se1 abhbClRa2 = defpackage.e90.abhbClRa(i31Var, "shards");
        if (!se1Var2.equals(abhbClRa2)) {
            return new defpackage.t21("shards(com.corsair.ledger.data.local.entity.ShardEntity).\n Expected:\n" + se1Var2 + "\n Found:\n" + abhbClRa2, false);
        }
        java.util.LinkedHashMap linkedHashMap3 = new java.util.LinkedHashMap();
        linkedHashMap3.put("relicId", new defpackage.pe1(1, 1, "relicId", "TEXT", null, true));
        linkedHashMap3.put("count", new defpackage.pe1(0, 1, "count", "INTEGER", null, true));
        defpackage.se1 se1Var3 = new defpackage.se1("owned_relics", linkedHashMap3, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
        defpackage.se1 abhbClRa3 = defpackage.e90.abhbClRa(i31Var, "owned_relics");
        if (!se1Var3.equals(abhbClRa3)) {
            return new defpackage.t21("owned_relics(com.corsair.ledger.data.local.entity.OwnedRelicEntity).\n Expected:\n" + se1Var3 + "\n Found:\n" + abhbClRa3, false);
        }
        java.util.LinkedHashMap linkedHashMap4 = new java.util.LinkedHashMap();
        linkedHashMap4.put("setId", new defpackage.pe1(1, 1, "setId", "TEXT", null, true));
        defpackage.se1 se1Var4 = new defpackage.se1("claimed_sets", linkedHashMap4, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
        defpackage.se1 abhbClRa4 = defpackage.e90.abhbClRa(i31Var, "claimed_sets");
        if (!se1Var4.equals(abhbClRa4)) {
            return new defpackage.t21("claimed_sets(com.corsair.ledger.data.local.entity.ClaimedSetEntity).\n Expected:\n" + se1Var4 + "\n Found:\n" + abhbClRa4, false);
        }
        java.util.LinkedHashMap linkedHashMap5 = new java.util.LinkedHashMap();
        linkedHashMap5.put("id", new defpackage.pe1(1, 1, "id", "INTEGER", null, true));
        linkedHashMap5.put("islandId", new defpackage.pe1(0, 1, "islandId", "TEXT", null, true));
        linkedHashMap5.put("seed", new defpackage.pe1(0, 1, "seed", "INTEGER", null, true));
        linkedHashMap5.put("movesLeft", new defpackage.pe1(0, 1, "movesLeft", "INTEGER", null, true));
        linkedHashMap5.put("revealedCsv", new defpackage.pe1(0, 1, "revealedCsv", "TEXT", null, true));
        linkedHashMap5.put("finished", new defpackage.pe1(0, 1, "finished", "INTEGER", null, true));
        defpackage.se1 se1Var5 = new defpackage.se1("dig_session", linkedHashMap5, new java.util.LinkedHashSet(), new java.util.LinkedHashSet());
        defpackage.se1 abhbClRa5 = defpackage.e90.abhbClRa(i31Var, "dig_session");
        if (se1Var5.equals(abhbClRa5)) {
            return new defpackage.t21(null, true);
        }
        return new defpackage.t21("dig_session(com.corsair.ledger.data.local.entity.DigSessionEntity).\n Expected:\n" + se1Var5 + "\n Found:\n" + abhbClRa5, false);
    }

    @Override // defpackage.ts
    public final void F7NU4MC0GW(defpackage.i31 i31Var) {
        i31Var.getClass();
        defpackage.k80 adDC3e2L = this.F7NU4MC0GW.adDC3e2L();
        defpackage.kj1 kj1Var = adDC3e2L.oh6vYeIP;
        kj1Var.getClass();
        defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy("PRAGMA query_only");
        try {
            nBH8hAHy.NHJTzaLwkd();
            boolean QoRHpC4k = nBH8hAHy.QoRHpC4k();
            defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
            if (!QoRHpC4k) {
                defpackage.a70.JlrlGoKF(i31Var, "PRAGMA temp_store = MEMORY");
                defpackage.a70.JlrlGoKF(i31Var, "PRAGMA recursive_triggers = 1");
                defpackage.a70.JlrlGoKF(i31Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (kj1Var.F7NU4MC0GW) {
                    defpackage.a70.JlrlGoKF(i31Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    defpackage.a70.JlrlGoKF(i31Var, defpackage.yc1.EoOhNTTfIN7K("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                defpackage.bq0 bq0Var = kj1Var.EXtogiMhuM;
                java.util.concurrent.locks.ReentrantLock reentrantLock = bq0Var.IHQe1A4L2xu;
                reentrantLock.lock();
                try {
                    bq0Var.F7NU4MC0GW = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (adDC3e2L.AARZUJiTa) {
            }
        } finally {
        }
    }

    @Override // defpackage.ts
    public final void IHQe1A4L2xu(defpackage.i31 i31Var) {
        i31Var.getClass();
        defpackage.a70.JlrlGoKF(i31Var, "CREATE TABLE IF NOT EXISTS `player` (`id` INTEGER NOT NULL, `doubloons` INTEGER NOT NULL, `storedEnergy` INTEGER NOT NULL, `energyAnchorMs` INTEGER NOT NULL, `lastChestMs` INTEGER NOT NULL, `victorySeen` INTEGER NOT NULL, `cellsDug` INTEGER NOT NULL, `relicsFound` INTEGER NOT NULL, `legendariesFound` INTEGER NOT NULL, `craftCount` INTEGER NOT NULL, `cursedHits` INTEGER NOT NULL, `tradeCount` INTEGER NOT NULL, `duplicatesSold` INTEGER NOT NULL, `peakDoubloons` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        defpackage.a70.JlrlGoKF(i31Var, "CREATE TABLE IF NOT EXISTS `shards` (`rarity` TEXT NOT NULL, `amount` INTEGER NOT NULL, PRIMARY KEY(`rarity`))");
        defpackage.a70.JlrlGoKF(i31Var, "CREATE TABLE IF NOT EXISTS `owned_relics` (`relicId` TEXT NOT NULL, `count` INTEGER NOT NULL, PRIMARY KEY(`relicId`))");
        defpackage.a70.JlrlGoKF(i31Var, "CREATE TABLE IF NOT EXISTS `claimed_sets` (`setId` TEXT NOT NULL, PRIMARY KEY(`setId`))");
        defpackage.a70.JlrlGoKF(i31Var, "CREATE TABLE IF NOT EXISTS `dig_session` (`id` INTEGER NOT NULL, `islandId` TEXT NOT NULL, `seed` INTEGER NOT NULL, `movesLeft` INTEGER NOT NULL, `revealedCsv` TEXT NOT NULL, `finished` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        defpackage.a70.JlrlGoKF(i31Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        defpackage.a70.JlrlGoKF(i31Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a593909ea42f974709fd506e88f19777')");
    }

    @Override // defpackage.ts
    public final void adDC3e2L(defpackage.i31 i31Var) {
        i31Var.getClass();
    }

    @Override // defpackage.ts
    public final void oh6vYeIP(defpackage.i31 i31Var) {
        i31Var.getClass();
        defpackage.a70.JlrlGoKF(i31Var, "DROP TABLE IF EXISTS `player`");
        defpackage.a70.JlrlGoKF(i31Var, "DROP TABLE IF EXISTS `shards`");
        defpackage.a70.JlrlGoKF(i31Var, "DROP TABLE IF EXISTS `owned_relics`");
        defpackage.a70.JlrlGoKF(i31Var, "DROP TABLE IF EXISTS `claimed_sets`");
        defpackage.a70.JlrlGoKF(i31Var, "DROP TABLE IF EXISTS `dig_session`");
    }

    @Override // defpackage.ts
    public final void r1MBDhnF(defpackage.i31 i31Var) {
        i31Var.getClass();
    }

    @Override // defpackage.ts
    public final void xiZrDbcSW0(defpackage.i31 i31Var) {
        i31Var.getClass();
        defpackage.te0 kNAkVymC = defpackage.fm.kNAkVymC();
        defpackage.k31 nBH8hAHy = i31Var.nBH8hAHy("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (nBH8hAHy.NHJTzaLwkd()) {
            try {
                kNAkVymC.add(nBH8hAHy.xiZrDbcSW0(0));
            } finally {
            }
        }
        defpackage.gq1.JlrlGoKF(nBH8hAHy, null);
        java.util.ListIterator listIterator = defpackage.fm.fnWB2E7cs(kNAkVymC).listIterator(0);
        while (true) {
            defpackage.b40 b40Var = (defpackage.b40) listIterator;
            if (!b40Var.hasNext()) {
                return;
            }
            java.lang.String str = (java.lang.String) b40Var.next();
            if (defpackage.yc1.wKlPRKlRnfqr(str, "room_fts_content_sync_")) {
                defpackage.a70.JlrlGoKF(i31Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }
}
