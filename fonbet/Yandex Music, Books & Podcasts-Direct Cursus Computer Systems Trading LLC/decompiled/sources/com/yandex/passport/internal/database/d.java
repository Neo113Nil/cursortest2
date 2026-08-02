package com.yandex.passport.internal.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.yandex.passport.common.network.n;
import com.yandex.passport.data.network.c4;
import com.yandex.passport.internal.flags.i;
import com.yandex.passport.internal.flags.o;
import com.yandex.passport.internal.usecase.m;
import defpackage.evw;
import defpackage.v75;
import defpackage.xq0;
import defpackage.yd5;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class d extends SQLiteOpenHelper {
    public final Context a;
    public final h b;
    public final n c;
    public final a d;
    public final n e;
    public final n f;

    public d(Context context, com.yandex.passport.internal.usecase.n nVar, m mVar, com.yandex.passport.internal.network.mappers.d dVar, i iVar) {
        super(context, "PassportInternal.db", (SQLiteDatabase.CursorFactory) null, 13);
        this.a = context;
        int i = 0;
        int i2 = 0;
        h hVar = new h(new evw(i2, this, d.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i, 21), new evw(i2, this, d.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i, 22));
        this.b = hVar;
        n nVar2 = new n(6, new evw(i2, this, d.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i, 15), new evw(i2, this, d.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i, 16));
        this.c = nVar2;
        int i3 = 0;
        this.d = new a(new evw(i3, this, d.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i, 11), new evw(i3, this, d.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i, 12), hVar, nVar2, nVar, mVar, dVar, iVar);
        int i4 = 0;
        this.e = new n(7, new evw(i3, this, d.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i4, 19), new evw(i3, this, d.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i4, 20));
        int i5 = 0;
        this.f = new n(5, new evw(i5, this, d.class, "getReadableDatabase", "getReadableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i4, 13), new evw(i5, this, d.class, "getWritableDatabase", "getWritableDatabase()Landroid/database/sqlite/SQLiteDatabase;", i4, 14));
    }

    public final void D(String str, List list) {
        str.getClass();
        n nVar = this.f;
        nVar.getClass();
        evw evwVar = (evw) nVar.c;
        String str2 = str;
        ((SQLiteDatabase) evwVar.invoke()).delete("children", "parent_name  = ? AND is_deleted = ?", new String[]{str2, CommonUrlParts.Values.FALSE_INTEGER});
        List<c4> list2 = list;
        ArrayList arrayList = new ArrayList(v75.o(list2, 10));
        for (c4 c4Var : list2) {
            c4Var.getClass();
            arrayList.add(new c(c4Var.a, str2, true, c4Var.b, c4Var.c, c4Var.d, c4Var.e, c4Var.f, false));
            str2 = str;
        }
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) evwVar.invoke();
        sQLiteDatabase.beginTransaction();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                g.d(sQLiteDatabase, "children", ((c) it.next()).a());
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0058 A[Catch: all -> 0x005f, TryCatch #2 {all -> 0x005f, blocks: (B:3:0x0014, B:5:0x001a, B:7:0x0023, B:10:0x002b, B:12:0x0034, B:16:0x003f, B:17:0x004f, B:19:0x0058, B:21:0x0063, B:23:0x0077, B:24:0x0079, B:26:0x0081, B:28:0x0085, B:29:0x00a9, B:30:0x0092, B:31:0x00ae, B:37:0x004d), top: B:2:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063 A[Catch: all -> 0x005f, TryCatch #2 {all -> 0x005f, blocks: (B:3:0x0014, B:5:0x001a, B:7:0x0023, B:10:0x002b, B:12:0x0034, B:16:0x003f, B:17:0x004f, B:19:0x0058, B:21:0x0063, B:23:0x0077, B:24:0x0079, B:26:0x0081, B:28:0x0085, B:29:0x00a9, B:30:0x0092, B:31:0x00ae, B:37:0x004d), top: B:2:0x0014, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void H(com.yandex.passport.internal.b bVar) {
        com.yandex.passport.common.core.f fVar;
        String str;
        int R;
        long parseLong;
        com.yandex.passport.common.core.b bVar2;
        a aVar = this.d;
        aVar.getClass();
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) aVar.b.invoke();
        sQLiteDatabase.beginTransaction();
        try {
            String str2 = bVar.c;
            if (str2 != null && (R = StringsKt.R(str2, ':', 0, false)) >= 1 && R != str2.length() - 1) {
                String substring = str2.substring(0, R);
                try {
                    parseLong = Long.parseLong(str2.substring(R + 1));
                } catch (NumberFormatException unused) {
                }
                if (parseLong > 0) {
                    try {
                        com.yandex.passport.common.core.a aVar2 = com.yandex.passport.common.core.b.b;
                        int parseInt = Integer.parseInt(substring);
                        aVar2.getClass();
                        bVar2 = com.yandex.passport.common.core.a.b(parseInt);
                    } catch (Exception unused2) {
                        bVar2 = com.yandex.passport.common.core.b.c;
                    }
                    fVar = new com.yandex.passport.common.core.f(bVar2, parseLong);
                    if (fVar != null ? aVar.d.G(fVar) : false) {
                        int update = sQLiteDatabase.update("accounts", aVar.c(bVar), "name = ?", new String[]{bVar.a});
                        if (update > 0) {
                            aVar.j = null;
                        }
                        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                            com.yandex.passport.common.logger.b bVar3 = com.yandex.passport.common.logger.b.b;
                            if (update == 0) {
                                str = "updateLocalAccount: can't update " + bVar;
                            } else {
                                str = "updateLocalAccount: updated rowId " + update + ' ' + bVar + ' ';
                            }
                            com.yandex.passport.common.logger.a.c(bVar3, null, str, 8);
                        }
                    }
                    sQLiteDatabase.setTransactionSuccessful();
                    sQLiteDatabase.endTransaction();
                }
            }
            fVar = null;
            if (fVar != null ? aVar.d.G(fVar) : false) {
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final int a(com.yandex.passport.common.core.f fVar) {
        fVar.getClass();
        n nVar = this.c;
        nVar.getClass();
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) ((evw) nVar.c).invoke();
        sQLiteDatabase.beginTransaction();
        try {
            int delete = sQLiteDatabase.delete("local_uids", "uid = ?", new String[]{String.valueOf(fVar.b)});
            sQLiteDatabase.setTransactionSuccessful();
            return delete;
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }

    public final ArrayList b() {
        a aVar = this.d;
        if (!((Boolean) aVar.h.b(o.u0)).booleanValue()) {
            return aVar.b();
        }
        ArrayList arrayList = aVar.j;
        if (arrayList != null) {
            return arrayList;
        }
        synchronized (aVar.i) {
            ArrayList arrayList2 = aVar.j;
            if (arrayList2 != null) {
                return arrayList2;
            }
            ArrayList b = aVar.b();
            aVar.j = b;
            return b;
        }
    }

    public final ArrayList g() {
        n nVar = this.c;
        nVar.getClass();
        ArrayList arrayList = new ArrayList();
        Cursor query = ((SQLiteDatabase) ((evw) nVar.b).invoke()).query("local_uids", com.yandex.passport.internal.database.tables.a.d, null, null, null, null, null);
        try {
            Cursor cursor = query;
            while (true) {
                if (!cursor.moveToNext()) {
                    yd5.q(query, null);
                    return arrayList;
                }
                String string = cursor.getString(cursor.getColumnIndexOrThrow("uid"));
                Long valueOf = string != null ? Long.valueOf(Long.parseLong(string)) : null;
                int i = cursor.getInt(cursor.getColumnIndexOrThrow("environment"));
                if (valueOf != null) {
                    com.yandex.passport.common.core.b.b.getClass();
                    arrayList.add(new com.yandex.passport.common.core.f(com.yandex.passport.common.core.a.b(i), valueOf.longValue()));
                }
            }
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getReadableDatabase() {
        SQLiteDatabase readableDatabase = super.getReadableDatabase();
        File parentFile = this.a.getDatabasePath("PassportInternal.db").getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        readableDatabase.getClass();
        return readableDatabase;
    }

    public final void o(com.yandex.passport.common.core.f fVar, com.yandex.passport.internal.b bVar) {
        fVar.getClass();
        a aVar = this.d;
        aVar.getClass();
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) aVar.b.invoke();
        sQLiteDatabase.beginTransaction();
        try {
            long d = g.d(sQLiteDatabase, "accounts", aVar.c(bVar));
            ContentValues contentValues = new ContentValues();
            contentValues.put("uid", String.valueOf(fVar.b));
            contentValues.put("environment", Integer.valueOf(fVar.a.a));
            g.d(sQLiteDatabase, "local_uids", contentValues);
            if (d != -1) {
                aVar.j = null;
            }
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onCreate: database=" + sQLiteDatabase, 8);
        }
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS tokens (uid TEXT, client_id TEXT, client_token TEXT, PRIMARY KEY (uid,client_id))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS accounts (name TEXT, master_token_value TEXT, uid TEXT, user_info_body TEXT, user_info_meta TEXT, stash_body TEXT, legacy_account_type TEXT, legacy_affinity TEXT, legacy_extra_data_body TEXT, secure_blob TEXT, PRIMARY KEY (name))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS gcm_subscriptions (uid TEXT, gcm_token_hash TEXT, PRIMARY KEY (uid))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS accounts_last_action (uid TEXT, timestamp INTEGER, last_action TEXT, local_timestamp INTEGER, PRIMARY KEY (uid))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS children (uid TEXT, parent_name TEXT, is_child BOOLEAN, has_plus BOOLEAN, display_login TEXT, display_name TEXT, public_name TEXT, avatar_url TEXT, is_deleted BOOLEAN, PRIMARY KEY (uid), FOREIGN KEY (parent_name) REFERENCES accounts(name))");
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS local_uids (uid TEXT, environment INTEGER, PRIMARY KEY (uid))");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onDowngrade: database=" + sQLiteDatabase + " oldVersion=" + i + " newVersion=" + i2, 8);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.getClass();
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "onUpgrade: database=" + sQLiteDatabase + " oldVersion=" + i + " newVersion=" + i2, 8);
        }
        if (i == 4) {
            i++;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS gcm_subscriptions (uid TEXT, gcm_token_hash TEXT, PRIMARY KEY (uid))");
        }
        if (i == 5) {
            i++;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS accounts_last_action (uid TEXT, timestamp INTEGER, last_action TEXT, local_timestamp INTEGER, PRIMARY KEY (uid))");
        }
        if (i == 6) {
            i++;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS children (uid TEXT, parent_name TEXT, is_child BOOLEAN, has_plus BOOLEAN, display_login TEXT, display_name TEXT, public_name TEXT, avatar_url TEXT, is_deleted BOOLEAN, PRIMARY KEY (uid), FOREIGN KEY (parent_name) REFERENCES accounts(name))");
        }
        if (i == 7) {
            i++;
            sQLiteDatabase.execSQL("    CREATE TABLE new_tokens (\n    uid TEXT,\n    client_id TEXT,\n    client_token TEXT,\n    PRIMARY KEY (uid,  client_id)\n)");
            sQLiteDatabase.execSQL("    INSERT INTO new_tokens (uid, client_id, client_token)\nSELECT uid, client_id, client_token FROM tokens");
            sQLiteDatabase.execSQL("DROP TABLE tokens");
            sQLiteDatabase.execSQL("ALTER TABLE new_tokens RENAME TO tokens");
        }
        if (i == 8) {
            i++;
        }
        if (i == 9) {
            i++;
            try {
                try {
                    Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM children WHERE is_deleted = ?", new String[]{CommonUrlParts.Values.FALSE_INTEGER});
                    try {
                        Cursor cursor = rawQuery;
                        yd5.q(rawQuery, null);
                    } finally {
                    }
                } catch (SQLiteException e) {
                    com.yandex.passport.common.logger.d dVar = com.yandex.passport.common.logger.a.a;
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "", e);
                    }
                }
            } catch (SQLiteException unused) {
                sQLiteDatabase.execSQL("ALTER TABLE children ADD COLUMN is_deleted BOOLEAN NOT NULL DEFAULT \"0\"");
            }
        }
        if (i == 10) {
            i++;
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS extra_uids_for_subscription");
        }
        if (i == 11) {
            i++;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS local_uids (uid TEXT, environment INTEGER, PRIMARY KEY (uid))");
        }
        if (i == 12) {
            i++;
            try {
                sQLiteDatabase.execSQL("ALTER TABLE accounts ADD COLUMN secure_blob TEXT");
            } catch (SQLiteException e2) {
                com.yandex.passport.common.logger.d dVar2 = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(com.yandex.passport.common.logger.b.e, null, "", e2);
                }
            }
        }
        if (i2 == i) {
            return;
        }
        xq0.q("Database migration failed");
    }

    public final void z(com.yandex.passport.common.core.f fVar, com.yandex.passport.internal.entities.e eVar) {
        fVar.getClass();
        eVar.getClass();
        h hVar = this.b;
        hVar.getClass();
        String str = eVar.a;
        String str2 = eVar.b;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "putClientToken: uid=" + fVar + " clientId=" + str2 + " token.length=" + str.length(), 8);
        }
        ContentValues contentValues = new ContentValues();
        StringBuilder sb = new StringBuilder();
        sb.append(fVar.a.a);
        sb.append(':');
        sb.append(fVar.b);
        contentValues.put("uid", sb.toString());
        contentValues.put("client_id", str2);
        contentValues.put("client_token", str);
        long e = g.e((SQLiteDatabase) hVar.b.invoke(), "tokens", contentValues);
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "putClientToken: uid=" + fVar + " rowid=" + e, 8);
        }
    }
}
