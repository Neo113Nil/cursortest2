package com.gamericefishpro.space.s5;

import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.gamericefishpro.space.i9.y3;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.gamericefishpro.space.d6.c {
    public a b;
    public final List c;
    public final com.gamericefishpro.space.m.d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(a configuration, com.gamericefishpro.space.m.d delegate) {
        super(16);
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter("5181942b9ebc31ce68dacb56c16fd79f", "identityHash");
        Intrinsics.checkNotNullParameter("ae2044fb577e65ee8bb576ca48a2f06e", "legacyHash");
        this.c = configuration.e;
        this.b = configuration;
        this.d = delegate;
    }

    @Override // com.gamericefishpro.space.d6.c
    public final void f(com.gamericefishpro.space.e6.c db) {
        Intrinsics.checkNotNullParameter(db, "db");
        super.f(db);
    }

    @Override // com.gamericefishpro.space.d6.c
    public final void g(com.gamericefishpro.space.e6.c db) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor cursorB = db.b("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (cursorB.moveToFirst() && cursorB.getInt(0) == 0) {
                z = true;
            }
            cursorB.close();
            com.gamericefishpro.space.m.d.n(db);
            if (!z) {
                com.gamericefishpro.space.o8.a aVarY = com.gamericefishpro.space.m.d.y(db);
                if (!aVarY.b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + aVarY.c);
                }
            }
            db.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            Intrinsics.checkNotNullParameter("5181942b9ebc31ce68dacb56c16fd79f", "hash");
            db.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            List list = this.c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).a(db);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                y3.s(cursorB, th);
                throw th2;
            }
        }
    }

    @Override // com.gamericefishpro.space.d6.c
    public final void h(com.gamericefishpro.space.e6.c db, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        j(db, i, i2);
    }

    @Override // com.gamericefishpro.space.d6.c
    public final void i(com.gamericefishpro.space.e6.c db) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Intrinsics.checkNotNullParameter(db, "db");
        Cursor cursorB = db.b("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z = cursorB.moveToFirst() && cursorB.getInt(0) != 0;
            cursorB.close();
            if (z) {
                Cursor cursorF = db.f(new com.gamericefishpro.space.d6.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
                try {
                    String string = cursorF.moveToFirst() ? cursorF.getString(0) : null;
                    cursorF.close();
                    if (!"5181942b9ebc31ce68dacb56c16fd79f".equals(string) && !"ae2044fb577e65ee8bb576ca48a2f06e".equals(string)) {
                        throw new IllegalStateException(com.gamericefishpro.space.m5.a.u("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 5181942b9ebc31ce68dacb56c16fd79f, found: ", string));
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        y3.s(cursorF, th);
                        throw th2;
                    }
                }
            } else {
                com.gamericefishpro.space.o8.a aVarY = com.gamericefishpro.space.m.d.y(db);
                if (!aVarY.b) {
                    throw new IllegalStateException("Pre-packaged database has an invalid schema: " + aVarY.c);
                }
                db.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                Intrinsics.checkNotNullParameter("5181942b9ebc31ce68dacb56c16fd79f", "hash");
                db.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
            }
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) this.d.e;
            db.h("PRAGMA foreign_keys = ON");
            Intrinsics.checkNotNullParameter(db, "db");
            workDatabase_Impl.r(new com.gamericefishpro.space.v5.a(db));
            List list = this.c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((r) it.next()).b(db);
                }
            }
            this.b = null;
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                y3.s(cursorB, th3);
                throw th4;
            }
        }
    }

    @Override // com.gamericefishpro.space.d6.c
    public final void j(com.gamericefishpro.space.e6.c db, int i, int i2) throws IOException {
        Intrinsics.checkNotNullParameter(db, "db");
        a aVar = this.b;
        if (aVar != null) {
            com.gamericefishpro.space.c5.e eVar = aVar.d;
            eVar.getClass();
            List listV = y3.v(eVar, i, i2);
            if (listV != null) {
                Intrinsics.checkNotNullParameter(db, "db");
                com.gamericefishpro.space.hj.c.t(new com.gamericefishpro.space.v5.a(db));
                Iterator it = listV.iterator();
                while (it.hasNext()) {
                    ((com.gamericefishpro.space.w5.a) it.next()).a(new com.gamericefishpro.space.v5.a(db));
                }
                com.gamericefishpro.space.o8.a aVarY = com.gamericefishpro.space.m.d.y(db);
                if (!aVarY.b) {
                    throw new IllegalStateException("Migration didn't properly handle: " + aVarY.c);
                }
                db.h("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                Intrinsics.checkNotNullParameter("5181942b9ebc31ce68dacb56c16fd79f", "hash");
                db.h("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '5181942b9ebc31ce68dacb56c16fd79f')");
                return;
            }
        }
        a aVar2 = this.b;
        if (aVar2 == null || y3.y(aVar2, i, i2)) {
            throw new IllegalStateException("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        if (aVar2.s) {
            Intrinsics.checkNotNullParameter(db, "db");
            Cursor cursorB = db.b("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                com.gamericefishpro.space.qh.d dVarB = com.gamericefishpro.space.ph.w.b();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    Intrinsics.b(string);
                    if (!kotlin.text.d.j(string, "sqlite_") && !string.equals("android_metadata")) {
                        dVarB.add(new Pair(string, Boolean.valueOf(Intrinsics.a(cursorB.getString(1), "view"))));
                    }
                }
                com.gamericefishpro.space.qh.d dVarA = com.gamericefishpro.space.ph.w.a(dVarB);
                cursorB.close();
                ListIterator listIterator = dVarA.listIterator(0);
                while (true) {
                    com.gamericefishpro.space.f1.a0 a0Var = (com.gamericefishpro.space.f1.a0) listIterator;
                    if (!a0Var.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) a0Var.next();
                    String str = (String) pair.d;
                    if (((Boolean) pair.e).booleanValue()) {
                        db.h("DROP VIEW IF EXISTS " + str);
                    } else {
                        db.h("DROP TABLE IF EXISTS " + str);
                    }
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    y3.s(cursorB, th);
                    throw th2;
                }
            }
        } else {
            db.h("DROP TABLE IF EXISTS `Dependency`");
            db.h("DROP TABLE IF EXISTS `WorkSpec`");
            db.h("DROP TABLE IF EXISTS `WorkTag`");
            db.h("DROP TABLE IF EXISTS `SystemIdInfo`");
            db.h("DROP TABLE IF EXISTS `WorkName`");
            db.h("DROP TABLE IF EXISTS `WorkProgress`");
            db.h("DROP TABLE IF EXISTS `Preference`");
        }
        List list = this.c;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((r) it2.next()).getClass();
                Intrinsics.checkNotNullParameter(db, "db");
            }
        }
        com.gamericefishpro.space.m.d.n(db);
    }
}
