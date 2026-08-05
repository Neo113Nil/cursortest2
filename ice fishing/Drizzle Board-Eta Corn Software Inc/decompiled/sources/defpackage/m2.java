package defpackage;

import com.kolosta.rejin.jilosa.data.local.BoardDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.ListIterator;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class m2 extends we {
    public final /* synthetic */ BoardDatabase_Impl wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m2(BoardDatabase_Impl boardDatabase_Impl) {
        super(1, "9bf1d7fba5d7dff92cf007531b405d37", "6b9c4be28b777c141ca86af6571c561f");
        this.wxUZMvaN = boardDatabase_Impl;
    }

    @Override // defpackage.we
    public final void Ey6iv0m0(f40 f40Var) {
        f40Var.getClass();
    }

    @Override // defpackage.we
    public final void I5GHvsYW(f40 f40Var) {
        f40Var.getClass();
        mp mpVar = new mp(10);
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (Ey6iv0m0.amk52bBQ()) {
            try {
                mpVar.add(Ey6iv0m0.wxUZMvaN(0));
            } finally {
            }
        }
        le0.eVhOlqcC(Ey6iv0m0, null);
        ListIterator listIterator = ra.P7K7Inc8(mpVar).listIterator(0);
        while (true) {
            kp kpVar = (kp) listIterator;
            if (!kpVar.hasNext()) {
                return;
            }
            String str = (String) kpVar.next();
            if (ja0.Ey6iv0m0(str, "room_fts_content_sync_")) {
                w30.KlHjfFWx(f40Var, "DROP TRIGGER IF EXISTS ".concat(str));
            }
        }
    }

    @Override // defpackage.we
    public final void KlHjfFWx(f40 f40Var) {
        f40Var.getClass();
        hn wxUZMvaN = this.wxUZMvaN.wxUZMvaN();
        ie0 ie0Var = wxUZMvaN.NCTxEWno;
        ie0Var.getClass();
        h40 Ey6iv0m0 = f40Var.Ey6iv0m0("PRAGMA query_only");
        try {
            Ey6iv0m0.amk52bBQ();
            boolean ygLcUYwZ = Ey6iv0m0.ygLcUYwZ();
            le0.eVhOlqcC(Ey6iv0m0, null);
            if (!ygLcUYwZ) {
                w30.KlHjfFWx(f40Var, "PRAGMA temp_store = MEMORY");
                w30.KlHjfFWx(f40Var, "PRAGMA recursive_triggers = 1");
                w30.KlHjfFWx(f40Var, "DROP TABLE IF EXISTS room_table_modification_log");
                if (ie0Var.wxUZMvaN) {
                    w30.KlHjfFWx(f40Var, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    w30.KlHjfFWx(f40Var, ja0.KlHjfFWx("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                nw nwVar = ie0Var.Qr9iLBAD;
                ReentrantLock reentrantLock = nwVar.qoPGr6Ce;
                reentrantLock.lock();
                try {
                    nwVar.wxUZMvaN = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (wxUZMvaN.b2ZJblxo) {
            }
        } finally {
        }
    }

    @Override // defpackage.we
    public final void MdtA4re8(f40 f40Var) {
        f40Var.getClass();
        w30.KlHjfFWx(f40Var, "DROP TABLE IF EXISTS `pairings`");
        w30.KlHjfFWx(f40Var, "DROP TABLE IF EXISTS `sprint_rounds`");
        w30.KlHjfFWx(f40Var, "DROP TABLE IF EXISTS `compares`");
        w30.KlHjfFWx(f40Var, "DROP TABLE IF EXISTS `mood_state`");
    }

    @Override // defpackage.we
    public final y30 RXQxj5Oe(f40 f40Var) {
        f40Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("id", new gb0("id", "INTEGER", true, 1, null, 1));
        linkedHashMap.put("name", new gb0("name", "TEXT", true, 0, null, 1));
        linkedHashMap.put("emoji", new gb0("emoji", "TEXT", true, 0, null, 1));
        linkedHashMap.put("subtitle", new gb0("subtitle", "TEXT", true, 0, null, 1));
        linkedHashMap.put("description", new gb0("description", "TEXT", true, 0, null, 1));
        linkedHashMap.put("sauceBase", new gb0("sauceBase", "TEXT", true, 0, null, 1));
        linkedHashMap.put("intensity", new gb0("intensity", "TEXT", true, 0, null, 1));
        linkedHashMap.put("intensityLevel", new gb0("intensityLevel", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("prepMinutes", new gb0("prepMinutes", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("cuisine", new gb0("cuisine", "TEXT", true, 0, null, 1));
        linkedHashMap.put("scope", new gb0("scope", "TEXT", true, 0, null, 1));
        linkedHashMap.put("tags", new gb0("tags", "TEXT", true, 0, null, 1));
        linkedHashMap.put("contextNote", new gb0("contextNote", "TEXT", true, 0, null, 1));
        linkedHashMap.put("flow", new gb0("flow", "TEXT", true, 0, null, 1));
        linkedHashMap.put("popularity", new gb0("popularity", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("novelty", new gb0("novelty", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("openedAt", new gb0("openedAt", "INTEGER", true, 0, null, 1));
        linkedHashMap.put("rating", new gb0("rating", "INTEGER", true, 0, null, 1));
        jb0 jb0Var = new jb0("pairings", linkedHashMap, new LinkedHashSet(), new LinkedHashSet());
        jb0 OnDfzHZD = e50.OnDfzHZD(f40Var, "pairings");
        if (!jb0Var.equals(OnDfzHZD)) {
            return new y30("pairings(com.kolosta.rejin.jilosa.data.local.entity.PairingEntity).\n Expected:\n" + jb0Var + "\n Found:\n" + OnDfzHZD, false);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("id", new gb0("id", "INTEGER", true, 1, null, 1));
        linkedHashMap2.put("traitKey", new gb0("traitKey", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("elapsedMillis", new gb0("elapsedMillis", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("accuracyPercent", new gb0("accuracyPercent", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("finishedAt", new gb0("finishedAt", "INTEGER", true, 0, null, 1));
        linkedHashMap2.put("correctOrder", new gb0("correctOrder", "TEXT", true, 0, null, 1));
        linkedHashMap2.put("userOrder", new gb0("userOrder", "TEXT", true, 0, null, 1));
        jb0 jb0Var2 = new jb0("sprint_rounds", linkedHashMap2, new LinkedHashSet(), new LinkedHashSet());
        jb0 OnDfzHZD2 = e50.OnDfzHZD(f40Var, "sprint_rounds");
        if (!jb0Var2.equals(OnDfzHZD2)) {
            return new y30("sprint_rounds(com.kolosta.rejin.jilosa.data.local.entity.SprintRoundEntity).\n Expected:\n" + jb0Var2 + "\n Found:\n" + OnDfzHZD2, false);
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        linkedHashMap3.put("id", new gb0("id", "INTEGER", true, 1, null, 1));
        linkedHashMap3.put("leftId", new gb0("leftId", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("rightId", new gb0("rightId", "INTEGER", true, 0, null, 1));
        linkedHashMap3.put("comparedAt", new gb0("comparedAt", "INTEGER", true, 0, null, 1));
        jb0 jb0Var3 = new jb0("compares", linkedHashMap3, new LinkedHashSet(), new LinkedHashSet());
        jb0 OnDfzHZD3 = e50.OnDfzHZD(f40Var, "compares");
        if (!jb0Var3.equals(OnDfzHZD3)) {
            return new y30("compares(com.kolosta.rejin.jilosa.data.local.entity.CompareEntity).\n Expected:\n" + jb0Var3 + "\n Found:\n" + OnDfzHZD3, false);
        }
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        linkedHashMap4.put("id", new gb0("id", "INTEGER", true, 1, null, 1));
        linkedHashMap4.put("moodKey", new gb0("moodKey", "TEXT", true, 0, null, 1));
        linkedHashMap4.put("introShown", new gb0("introShown", "INTEGER", true, 0, null, 1));
        linkedHashMap4.put("ratingDismissedFor", new gb0("ratingDismissedFor", "INTEGER", true, 0, null, 1));
        jb0 jb0Var4 = new jb0("mood_state", linkedHashMap4, new LinkedHashSet(), new LinkedHashSet());
        jb0 OnDfzHZD4 = e50.OnDfzHZD(f40Var, "mood_state");
        if (jb0Var4.equals(OnDfzHZD4)) {
            return new y30((String) null, true);
        }
        return new y30("mood_state(com.kolosta.rejin.jilosa.data.local.entity.MoodEntity).\n Expected:\n" + jb0Var4 + "\n Found:\n" + OnDfzHZD4, false);
    }

    @Override // defpackage.we
    public final void amk52bBQ(f40 f40Var) {
        f40Var.getClass();
    }

    @Override // defpackage.we
    public final void qoPGr6Ce(f40 f40Var) {
        f40Var.getClass();
        w30.KlHjfFWx(f40Var, "CREATE TABLE IF NOT EXISTS `pairings` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `name` TEXT NOT NULL, `emoji` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `description` TEXT NOT NULL, `sauceBase` TEXT NOT NULL, `intensity` TEXT NOT NULL, `intensityLevel` INTEGER NOT NULL, `prepMinutes` INTEGER NOT NULL, `cuisine` TEXT NOT NULL, `scope` TEXT NOT NULL, `tags` TEXT NOT NULL, `contextNote` TEXT NOT NULL, `flow` TEXT NOT NULL, `popularity` INTEGER NOT NULL, `novelty` INTEGER NOT NULL, `openedAt` INTEGER NOT NULL, `rating` INTEGER NOT NULL)");
        w30.KlHjfFWx(f40Var, "CREATE TABLE IF NOT EXISTS `sprint_rounds` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `traitKey` TEXT NOT NULL, `elapsedMillis` INTEGER NOT NULL, `accuracyPercent` INTEGER NOT NULL, `finishedAt` INTEGER NOT NULL, `correctOrder` TEXT NOT NULL, `userOrder` TEXT NOT NULL)");
        w30.KlHjfFWx(f40Var, "CREATE TABLE IF NOT EXISTS `compares` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `leftId` INTEGER NOT NULL, `rightId` INTEGER NOT NULL, `comparedAt` INTEGER NOT NULL)");
        w30.KlHjfFWx(f40Var, "CREATE TABLE IF NOT EXISTS `mood_state` (`id` INTEGER NOT NULL, `moodKey` TEXT NOT NULL, `introShown` INTEGER NOT NULL, `ratingDismissedFor` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        w30.KlHjfFWx(f40Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        w30.KlHjfFWx(f40Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9bf1d7fba5d7dff92cf007531b405d37')");
    }
}
