package com.gamericefishpro.space.s5;

import android.content.Context;
import android.content.Intent;
import com.gamericefishpro.space.i9.y3;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public boolean a;
    public boolean b;
    public final a c;
    public final com.gamericefishpro.space.s4.f d;
    public final List e;
    public final com.gamericefishpro.space.u5.b f;
    public com.gamericefishpro.space.d6.b g;

    public p(a config, com.gamericefishpro.space.a7.c supportOpenHelperFactory) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(supportOpenHelperFactory, "supportOpenHelperFactory");
        this.c = config;
        this.d = new n(-1, "", "");
        List list = config.e;
        this.e = list == null ? com.gamericefishpro.space.ph.g0.d : list;
        ArrayList arrayListE = CollectionsKt.E(list == null ? com.gamericefishpro.space.ph.g0.d : list, new com.gamericefishpro.space.d7.h(1, new com.gamericefishpro.space.a7.c(21, this)));
        Context context = config.a;
        String str = config.b;
        com.gamericefishpro.space.d6.e eVar = config.c;
        com.gamericefishpro.space.c5.e migrationContainer = config.d;
        boolean z = config.f;
        s journalMode = config.g;
        Executor queryExecutor = config.h;
        Executor transactionExecutor = config.i;
        Intent intent = config.j;
        boolean z2 = config.k;
        boolean z3 = config.l;
        Set set = config.m;
        String str2 = config.n;
        File file = config.o;
        Callable callable = config.p;
        List typeConverters = config.q;
        List autoMigrationSpecs = config.r;
        boolean z4 = config.s;
        com.gamericefishpro.space.c6.b bVar = config.t;
        CoroutineContext coroutineContext = config.u;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.f = new com.gamericefishpro.space.v5.b(new com.gamericefishpro.space.tb.u((com.gamericefishpro.space.d6.f) supportOpenHelperFactory.invoke(new a(context, str, eVar, migrationContainer, arrayListE, z, journalMode, queryExecutor, transactionExecutor, intent, z2, z3, set, str2, file, callable, typeConverters, autoMigrationSpecs, z4, bVar, coroutineContext))));
        boolean z5 = config.g == s.i;
        com.gamericefishpro.space.d6.f fVarC = c();
        if (fVarC != null) {
            fVarC.setWriteAheadLoggingEnabled(z5);
        }
    }

    public static final void a(p pVar, com.gamericefishpro.space.c6.a aVar) throws Throwable {
        Object objQ;
        com.gamericefishpro.space.s4.f fVar = pVar.d;
        a aVar2 = pVar.c;
        s sVar = aVar2.g;
        s sVar2 = s.i;
        if (sVar == sVar2) {
            com.gamericefishpro.space.i.a.r(aVar, "PRAGMA journal_mode = WAL");
        } else {
            com.gamericefishpro.space.i.a.r(aVar, "PRAGMA journal_mode = TRUNCATE");
        }
        if (aVar2.g == sVar2) {
            com.gamericefishpro.space.i.a.r(aVar, "PRAGMA synchronous = NORMAL");
        } else {
            com.gamericefishpro.space.i.a.r(aVar, "PRAGMA synchronous = FULL");
        }
        b(aVar);
        com.gamericefishpro.space.c6.c cVarO = aVar.O("PRAGMA user_version");
        try {
            cVarO.H();
            int i = (int) cVarO.getLong(0);
            y3.r(cVarO, null);
            int i2 = fVar.a;
            if (i != i2) {
                com.gamericefishpro.space.i.a.r(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                    if (i == 0) {
                        pVar.d(aVar);
                    } else {
                        pVar.e(aVar, i, i2);
                    }
                    com.gamericefishpro.space.i.a.r(aVar, "PRAGMA user_version = " + i2);
                    objQ = Unit.a;
                } catch (Throwable th) {
                    com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                    objQ = com.gamericefishpro.space.wa.b.q(th);
                }
                if (!(objQ instanceof com.gamericefishpro.space.oh.o)) {
                    com.gamericefishpro.space.i.a.r(aVar, "END TRANSACTION");
                }
                Throwable thA = com.gamericefishpro.space.oh.p.a(objQ);
                if (thA != null) {
                    com.gamericefishpro.space.i.a.r(aVar, "ROLLBACK TRANSACTION");
                    throw thA;
                }
            }
            pVar.f(aVar);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                y3.r(cVarO, th2);
                throw th3;
            }
        }
    }

    public static void b(com.gamericefishpro.space.c6.a aVar) {
        com.gamericefishpro.space.c6.c cVarO = aVar.O("PRAGMA busy_timeout");
        try {
            cVarO.H();
            long j = cVarO.getLong(0);
            y3.r(cVarO, null);
            if (j < 3000) {
                com.gamericefishpro.space.i.a.r(aVar, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                y3.r(cVarO, th);
                throw th2;
            }
        }
    }

    public final com.gamericefishpro.space.d6.f c() {
        com.gamericefishpro.space.tb.u uVar;
        com.gamericefishpro.space.u5.b bVar = this.f;
        com.gamericefishpro.space.v5.b bVar2 = bVar instanceof com.gamericefishpro.space.v5.b ? (com.gamericefishpro.space.v5.b) bVar : null;
        if (bVar2 == null || (uVar = bVar2.d) == null) {
            return null;
        }
        return (com.gamericefishpro.space.d6.f) uVar.e;
    }

    public final void d(com.gamericefishpro.space.c6.a connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        com.gamericefishpro.space.c6.c cVarO = connection.O("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cVarO.H() && cVarO.getLong(0) == 0) {
                z = true;
            }
            y3.r(cVarO, null);
            com.gamericefishpro.space.s4.f fVar = this.d;
            fVar.a(connection);
            if (!z) {
                com.gamericefishpro.space.o8.a aVarG = fVar.g(connection);
                if (!aVarG.b) {
                    throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarG.c).toString());
                }
            }
            com.gamericefishpro.space.i.a.r(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            String hash = (String) fVar.b;
            Intrinsics.checkNotNullParameter(hash, "hash");
            com.gamericefishpro.space.i.a.r(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
            fVar.c(connection);
            for (r rVar : this.e) {
                rVar.getClass();
                Intrinsics.checkNotNullParameter(connection, "connection");
                if (connection instanceof com.gamericefishpro.space.v5.a) {
                    rVar.a(((com.gamericefishpro.space.v5.a) connection).d);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                y3.r(cVarO, th);
                throw th2;
            }
        }
    }

    public final void e(com.gamericefishpro.space.c6.a connection, int i, int i2) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        a aVar = this.c;
        List listV = y3.v(aVar.d, i, i2);
        com.gamericefishpro.space.s4.f fVar = this.d;
        if (listV != null) {
            fVar.f(connection);
            Iterator it = listV.iterator();
            while (it.hasNext()) {
                ((com.gamericefishpro.space.w5.a) it.next()).a(connection);
            }
            com.gamericefishpro.space.o8.a aVarG = fVar.g(connection);
            if (!aVarG.b) {
                throw new IllegalStateException(("Migration didn't properly handle: " + aVarG.c).toString());
            }
            fVar.e(connection);
            com.gamericefishpro.space.i.a.r(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            String hash = (String) fVar.b;
            Intrinsics.checkNotNullParameter(hash, "hash");
            com.gamericefishpro.space.i.a.r(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
            return;
        }
        if (y3.y(aVar, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (aVar.s) {
            com.gamericefishpro.space.c6.c cVarO = connection.O("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                com.gamericefishpro.space.qh.d dVarB = com.gamericefishpro.space.ph.w.b();
                while (cVarO.H()) {
                    String strG = cVarO.g(0);
                    if (!kotlin.text.d.j(strG, "sqlite_") && !strG.equals("android_metadata")) {
                        dVarB.add(new Pair(strG, Boolean.valueOf(Intrinsics.a(cVarO.g(1), "view"))));
                    }
                }
                com.gamericefishpro.space.qh.d dVarA = com.gamericefishpro.space.ph.w.a(dVarB);
                y3.r(cVarO, null);
                ListIterator listIterator = dVarA.listIterator(0);
                while (true) {
                    com.gamericefishpro.space.f1.a0 a0Var = (com.gamericefishpro.space.f1.a0) listIterator;
                    if (!a0Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) a0Var.next();
                    String str = (String) pair.d;
                    if (((Boolean) pair.e).booleanValue()) {
                        com.gamericefishpro.space.i.a.r(connection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        com.gamericefishpro.space.i.a.r(connection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    y3.r(cVarO, th);
                    throw th2;
                }
            }
        } else {
            fVar.b(connection);
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((r) it2.next()).getClass();
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof com.gamericefishpro.space.v5.a) {
                com.gamericefishpro.space.d6.b db = ((com.gamericefishpro.space.v5.a) connection).d;
                Intrinsics.checkNotNullParameter(db, "db");
            }
        }
        fVar.a(connection);
    }

    public final void f(com.gamericefishpro.space.c6.a connection) throws Throwable {
        Object objQ;
        Intrinsics.checkNotNullParameter(connection, "connection");
        com.gamericefishpro.space.c6.c cVarO = connection.O("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            boolean z = cVarO.H() && cVarO.getLong(0) != 0;
            y3.r(cVarO, null);
            com.gamericefishpro.space.s4.f fVar = this.d;
            if (z) {
                com.gamericefishpro.space.c6.c cVarO2 = connection.O("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                try {
                    String strG = cVarO2.H() ? cVarO2.g(0) : null;
                    y3.r(cVarO2, null);
                    if (!((String) fVar.b).equals(strG) && !((String) fVar.c).equals(strG)) {
                        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) fVar.b) + ", found: " + strG).toString());
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        y3.r(cVarO2, th);
                        throw th2;
                    }
                }
            } else {
                com.gamericefishpro.space.i.a.r(connection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    com.gamericefishpro.space.oh.n nVar = com.gamericefishpro.space.oh.p.d;
                    com.gamericefishpro.space.o8.a aVarG = fVar.g(connection);
                    if (!aVarG.b) {
                        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + aVarG.c).toString());
                    }
                    fVar.e(connection);
                    com.gamericefishpro.space.i.a.r(connection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    String hash = (String) fVar.b;
                    Intrinsics.checkNotNullParameter(hash, "hash");
                    com.gamericefishpro.space.i.a.r(connection, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + hash + "')");
                    objQ = Unit.a;
                    if (!(objQ instanceof com.gamericefishpro.space.oh.o)) {
                        com.gamericefishpro.space.i.a.r(connection, "END TRANSACTION");
                    }
                    Throwable thA = com.gamericefishpro.space.oh.p.a(objQ);
                    if (thA != null) {
                        com.gamericefishpro.space.i.a.r(connection, "ROLLBACK TRANSACTION");
                        throw thA;
                    }
                } catch (Throwable th3) {
                    com.gamericefishpro.space.oh.n nVar2 = com.gamericefishpro.space.oh.p.d;
                    objQ = com.gamericefishpro.space.wa.b.q(th3);
                }
            }
            fVar.d(connection);
            for (r rVar : this.e) {
                rVar.getClass();
                Intrinsics.checkNotNullParameter(connection, "connection");
                if (connection instanceof com.gamericefishpro.space.v5.a) {
                    rVar.b(((com.gamericefishpro.space.v5.a) connection).d);
                }
            }
            this.a = true;
        } catch (Throwable th4) {
            try {
                throw th4;
            } catch (Throwable th5) {
                y3.r(cVarO, th4);
                throw th5;
            }
        }
    }

    public p(a config, com.gamericefishpro.space.s4.f openDelegate) {
        int i;
        com.gamericefishpro.space.u5.e eVar;
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(openDelegate, "openDelegate");
        this.c = config;
        this.d = openDelegate;
        List list = config.e;
        s sVar = config.g;
        com.gamericefishpro.space.d6.e eVar2 = config.c;
        String fileName = config.b;
        this.e = list == null ? com.gamericefishpro.space.ph.g0.d : list;
        com.gamericefishpro.space.c6.b bVar = config.t;
        if (bVar != null) {
            if (fileName == null) {
                com.gamericefishpro.space.u6.s driver = new com.gamericefishpro.space.u6.s(this, bVar);
                Intrinsics.checkNotNullParameter(driver, "driver");
                Intrinsics.checkNotNullParameter(":memory:", "fileName");
                eVar = new com.gamericefishpro.space.u5.e(driver);
            } else {
                com.gamericefishpro.space.u6.s driver2 = new com.gamericefishpro.space.u6.s(this, bVar);
                Intrinsics.checkNotNullParameter(sVar, "<this>");
                int iOrdinal = sVar.ordinal();
                if (iOrdinal == 1) {
                    i = 1;
                } else {
                    if (iOrdinal != 2) {
                        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + sVar + '\'').toString());
                    }
                    i = 4;
                }
                Intrinsics.checkNotNullParameter(sVar, "<this>");
                int iOrdinal2 = sVar.ordinal();
                if (iOrdinal2 != 1 && iOrdinal2 != 2) {
                    throw new IllegalStateException(("Can't get max number of writers for journal mode '" + sVar + '\'').toString());
                }
                Intrinsics.checkNotNullParameter(driver2, "driver");
                Intrinsics.checkNotNullParameter(fileName, "fileName");
                eVar = new com.gamericefishpro.space.u5.e(driver2, fileName, i);
            }
            this.f = eVar;
        } else if (eVar2 != null) {
            Context context = config.a;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(context, "context");
            o callback = new o(this, openDelegate.a);
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f = new com.gamericefishpro.space.v5.b(new com.gamericefishpro.space.tb.u(eVar2.c(new com.gamericefishpro.space.d6.d(context, fileName, callback, false, false))));
        } else {
            throw new IllegalArgumentException("SQLiteManager was constructed with both null driver and open helper factory!");
        }
        boolean z = sVar == s.i;
        com.gamericefishpro.space.d6.f fVarC = c();
        if (fVarC != null) {
            fVarC.setWriteAheadLoggingEnabled(z);
        }
    }
}
