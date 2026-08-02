package defpackage;

import android.database.Cursor;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import ru.yandex.video.sessionlogger.table.LogDatabase_Impl;

/* loaded from: classes.dex */
public final class zeo extends ssr {
    public jc7 b;
    public final List c;
    public final mka d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zeo(jc7 jc7Var, mka mkaVar) {
        super(1);
        jc7Var.getClass();
        this.c = jc7Var.e;
        this.b = jc7Var;
        this.d = mkaVar;
    }

    @Override // defpackage.ssr
    public final void b(rsr rsrVar) {
        rsrVar.getClass();
        rsrVar.getClass();
    }

    @Override // defpackage.ssr
    public final void d(rsr rsrVar) {
        rsrVar.getClass();
        Cursor query = rsrVar.query("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            Cursor cursor = query;
            boolean z = false;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) == 0) {
                    z = true;
                }
            }
            yd5.q(query, null);
            rsrVar.execSQL("CREATE TABLE IF NOT EXISTS `LogSession` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` TEXT NOT NULL, `name` TEXT NOT NULL, `data` TEXT NOT NULL)");
            rsrVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            rsrVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f9ad144e8a06d9407ed2ed9e68655ed4')");
            if (!z) {
                c7f z2 = mka.z(rsrVar);
                if (!z2.b) {
                    b6e.w(z2.c, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            rsrVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            rsrVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f9ad144e8a06d9407ed2ed9e68655ed4')");
            List list = this.c;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((wm4) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                yd5.q(query, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.ssr
    public final void e(rsr rsrVar, int i, int i2) {
        rsrVar.getClass();
        g(rsrVar, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0069  */
    @Override // defpackage.ssr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f(rsr rsrVar) {
        boolean z;
        List list;
        rsrVar.getClass();
        Cursor query = rsrVar.query("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            Cursor cursor = query;
            if (cursor.moveToFirst()) {
                if (cursor.getInt(0) != 0) {
                    z = true;
                    yd5.q(query, null);
                    if (z) {
                        c7f z2 = mka.z(rsrVar);
                        if (!z2.b) {
                            b6e.w(z2.c, "Pre-packaged database has an invalid schema: ");
                            return;
                        } else {
                            rsrVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                            rsrVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f9ad144e8a06d9407ed2ed9e68655ed4')");
                        }
                    } else {
                        query = rsrVar.query(new atn("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (Object[]) null));
                        try {
                            Cursor cursor2 = query;
                            String string = cursor2.moveToFirst() ? cursor2.getString(0) : null;
                            yd5.q(query, null);
                            if (!"f9ad144e8a06d9407ed2ed9e68655ed4".equals(string) && !"3dc0033144a7d3dbcae71b8725e6e2df".equals(string)) {
                                xq0.q(f1d.g("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: f9ad144e8a06d9407ed2ed9e68655ed4, found: ", string));
                                return;
                            }
                        } finally {
                        }
                    }
                    mka mkaVar = this.d;
                    ((LogDatabase_Impl) mkaVar.a).a = rsrVar;
                    ((LogDatabase_Impl) mkaVar.a).q(new qsr(rsrVar));
                    list = this.c;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((wm4) it.next()).a(rsrVar);
                        }
                    }
                    this.b = null;
                }
            }
            z = false;
            yd5.q(query, null);
            if (z) {
            }
            mka mkaVar2 = this.d;
            ((LogDatabase_Impl) mkaVar2.a).a = rsrVar;
            ((LogDatabase_Impl) mkaVar2.a).q(new qsr(rsrVar));
            list = this.c;
            if (list != null) {
            }
            this.b = null;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.ssr
    public final void g(rsr rsrVar, int i, int i2) {
        rsrVar.getClass();
        jc7 jc7Var = this.b;
        if (jc7Var != null) {
            p97 p97Var = jc7Var.d;
            p97Var.getClass();
            List z = c9g.z(p97Var, i, i2);
            if (z != null) {
                up6.r(new qsr(rsrVar));
                Iterator it = z.iterator();
                while (it.hasNext()) {
                    ((i5i) it.next()).a(new qsr(rsrVar));
                }
                c7f z2 = mka.z(rsrVar);
                if (!z2.b) {
                    b6e.w(z2.c, "Migration didn't properly handle: ");
                    return;
                } else {
                    rsrVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                    rsrVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f9ad144e8a06d9407ed2ed9e68655ed4')");
                    return;
                }
            }
        }
        jc7 jc7Var2 = this.b;
        if (jc7Var2 == null || c9g.K(jc7Var2, i, i2)) {
            xq0.q(dfi.f("A migration from ", i, i2, " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (jc7Var2.s) {
            Cursor query = rsrVar.query("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                Cursor cursor = query;
                n8g b = t75.b();
                while (cursor.moveToNext()) {
                    String string = cursor.getString(0);
                    string.getClass();
                    if (!c.v(string, "sqlite_", false) && !string.equals("android_metadata")) {
                        b.add(new Pair(string, Boolean.valueOf(Intrinsics.d(cursor.getString(1), "view"))));
                    }
                }
                n8g a = t75.a(b);
                yd5.q(query, null);
                ListIterator listIterator = a.listIterator(0);
                while (true) {
                    ezd ezdVar = (ezd) listIterator;
                    if (!ezdVar.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) ezdVar.next();
                    String str = (String) pair.a;
                    if (((Boolean) pair.b).booleanValue()) {
                        rsrVar.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        rsrVar.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            rsrVar.execSQL("DROP TABLE IF EXISTS `LogSession`");
        }
        List list = this.c;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((wm4) it2.next()).getClass();
            }
        }
        rsrVar.execSQL("CREATE TABLE IF NOT EXISTS `LogSession` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `time` TEXT NOT NULL, `name` TEXT NOT NULL, `data` TEXT NOT NULL)");
        rsrVar.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        rsrVar.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'f9ad144e8a06d9407ed2ed9e68655ed4')");
    }
}
