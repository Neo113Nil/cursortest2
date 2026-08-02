package io.appmetrica.analytics.locationinternal.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.g8e;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.CloseableUtils;
import io.appmetrica.analytics.modulesapi.internal.common.ModulePreferences;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.common.clid.ClidProvider;

/* renamed from: io.appmetrica.analytics.locationinternal.impl.g, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0948g {
    public final SQLiteOpenHelper a;
    public final ModulePreferences b;
    public final String c;
    public final String d;
    public final ContentValues h = new ContentValues();
    public final AtomicLong e = new AtomicLong(c());
    public final AtomicLong f = new AtomicLong(b());
    public final AtomicLong g = new AtomicLong(a());

    public C0948g(SQLiteOpenHelper sQLiteOpenHelper, ModulePreferences modulePreferences, String str, String str2) {
        this.a = sQLiteOpenHelper;
        this.b = modulePreferences;
        this.d = str2;
        this.c = str;
    }

    public final synchronized LinkedHashMap a(int i) {
        LinkedHashMap linkedHashMap;
        linkedHashMap = new LinkedHashMap();
        Cursor cursor = null;
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            if (writableDatabase != null) {
                cursor = writableDatabase.query(this.c, new String[]{"incremental_id", Constants.KEY_DATA}, null, null, null, null, "incremental_id ASC", String.valueOf(i));
                while (cursor.moveToNext()) {
                    this.h.clear();
                    DBUtils.cursorRowToContentValues(cursor, this.h);
                    CollectionUtils.putOpt(linkedHashMap, this.h.getAsLong("incremental_id"), this.h.getAsString(Constants.KEY_DATA));
                }
            }
        } catch (Throwable unused) {
        }
        CloseableUtils.closeSafely(cursor);
        return linkedHashMap;
    }

    public final synchronized void b(int i) {
        int delete;
        if (i < 1) {
            return;
        }
        String format = String.format(Locale.US, "%1$s <= (select max(%1$s) from (select %1$s from %2$s order by %1$s limit ?))", "incremental_id", this.c);
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            if (writableDatabase != null && (delete = writableDatabase.delete(this.c, format, new String[]{String.valueOf(i)})) > 0) {
                this.e.getAndAdd(-delete);
                this.f.set(b());
            }
        } catch (Throwable unused) {
        }
    }

    public final long c() {
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            if (writableDatabase != null) {
                return DBUtils.queryRowsCount(writableDatabase, this.c);
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }

    public final ContentValues b(long j, String str) {
        this.h.clear();
        this.h.put("incremental_id", Long.valueOf(this.g.get() + 1));
        this.h.put(ClidProvider.TIMESTAMP, Long.valueOf(j));
        this.h.put(Constants.KEY_DATA, str);
        return this.h;
    }

    public final long b() {
        Locale locale = Locale.US;
        String o = g8e.o("Select min(timestamp) from ", this.c);
        long j = ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        Cursor cursor = null;
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            if (writableDatabase != null) {
                cursor = writableDatabase.rawQuery(o, null);
                if (cursor.moveToFirst()) {
                    long j2 = cursor.getLong(0);
                    if (j2 != 0) {
                        j = j2;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        CloseableUtils.closeSafely(cursor);
        return j;
    }

    public final synchronized void a(long j, String str) {
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            if (writableDatabase != null) {
                if (writableDatabase.insert(this.c, null, b(j, str)) != -1) {
                    this.e.incrementAndGet();
                    this.g.incrementAndGet();
                    this.b.putLong(this.d, this.g.get());
                    if (this.f.get() > j) {
                        this.f.set(j);
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final synchronized void a(long j) {
        int delete;
        Locale locale = Locale.US;
        try {
            SQLiteDatabase writableDatabase = this.a.getWritableDatabase();
            if (writableDatabase != null && (delete = writableDatabase.delete(this.c, "incremental_id <= ?", new String[]{String.valueOf(j)})) > 0) {
                this.e.getAndAdd(-delete);
                this.f.set(b());
            }
        } catch (Throwable unused) {
        }
    }

    public final long a() {
        return this.b.getLong(this.d, -1L);
    }
}
