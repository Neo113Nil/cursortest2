package com.gamericefishpro.space.uc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.gamericefishpro.space.i9.y3;
import com.gamericefishpro.space.pg.o;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class c extends SQLiteOpenHelper implements com.gamericefishpro.space.tc.c {
    private static final String COMMA_SEP = ",";
    private static final String DATABASE_NAME = "OneSignal.db";
    private static final int DB_OPEN_RETRY_BACKOFF = 400;
    private static final int DB_OPEN_RETRY_MAX = 5;
    private static final int DB_VERSION = 9;
    public static final int DEFAULT_TTL_IF_NOT_IN_PAYLOAD = 259200;
    private static final String FLOAT_TYPE = " FLOAT";
    private static final String INTEGER_PRIMARY_KEY_TYPE = " INTEGER PRIMARY KEY";
    private static final String INT_TYPE = " INTEGER";
    private static final String SQL_CREATE_ENTRIES = "CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);";
    private static final String SQL_CREATE_IN_APP_MESSAGE_ENTRIES = "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);";
    private static final String TEXT_TYPE = " TEXT";
    private static final String TIMESTAMP_TYPE = " TIMESTAMP";
    private final o _outcomeTableProvider;
    public static final a Companion = new a(null);
    private static final Object LOCK = new Object();
    private static final String[] SQL_INDEX_ENTRIES = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(o oVar, Context context, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(oVar, context, (i2 & 4) != 0 ? DB_VERSION : i);
    }

    private final SQLiteDatabase getSQLiteDatabase() {
        SQLiteDatabase writableDatabase;
        synchronized (LOCK) {
            try {
                writableDatabase = getWritableDatabase();
                Intrinsics.b(writableDatabase);
            } catch (SQLiteCantOpenDatabaseException e) {
                throw e;
            } catch (SQLiteDatabaseLockedException e2) {
                throw e2;
            }
        }
        return writableDatabase;
    }

    private final SQLiteDatabase getSQLiteDatabaseWithRetries() {
        SQLiteDatabase sQLiteDatabase;
        synchronized (LOCK) {
            int i = 0;
            while (true) {
                try {
                    sQLiteDatabase = getSQLiteDatabase();
                } catch (SQLiteCantOpenDatabaseException e) {
                    i++;
                    if (i >= 5) {
                        throw e;
                    }
                    SystemClock.sleep(i * DB_OPEN_RETRY_BACKOFF);
                } catch (SQLiteDatabaseLockedException e2) {
                    i++;
                    if (i >= 5) {
                        throw e2;
                    }
                    SystemClock.sleep(i * DB_OPEN_RETRY_BACKOFF);
                }
            }
        }
        return sQLiteDatabase;
    }

    private final synchronized void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i < 2 && i2 >= 2) {
            try {
                upgradeToV2(sQLiteDatabase);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i < 3 && i2 >= 3) {
            upgradeToV3(sQLiteDatabase);
        }
        if (i < 4 && i2 >= 4) {
            upgradeToV4(sQLiteDatabase);
        }
        if (i < 5 && i2 >= 5) {
            upgradeToV5(sQLiteDatabase);
        }
        if (i == 5 && i2 >= 6) {
            upgradeFromV5ToV6(sQLiteDatabase);
        }
        if (i < 7 && i2 >= 7) {
            upgradeToV7(sQLiteDatabase);
        }
        if (i < 8 && i2 >= 8) {
            upgradeToV8(sQLiteDatabase);
        }
        if (i < DB_VERSION && i2 >= DB_VERSION) {
            upgradeToV9(sQLiteDatabase);
        }
    }

    private final void safeExecSQL(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e) {
            e.printStackTrace();
        }
    }

    private final void upgradeFromV5ToV6(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV2(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    private final void upgradeToV3(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        safeExecSQL(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        safeExecSQL(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    private final void upgradeToV4(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    private final void upgradeToV5(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        upgradeFromV5ToV6(sQLiteDatabase);
    }

    private final void upgradeToV7(SQLiteDatabase sQLiteDatabase) {
        safeExecSQL(sQLiteDatabase, SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
    }

    private final synchronized void upgradeToV8(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision2To3(sQLiteDatabase);
        this._outcomeTableProvider.upgradeCacheOutcomeTableRevision1To2(sQLiteDatabase);
    }

    private final void upgradeToV9(SQLiteDatabase sQLiteDatabase) {
        this._outcomeTableProvider.upgradeOutcomeTableRevision3To4(sQLiteDatabase);
    }

    @Override // com.gamericefishpro.space.tc.c
    public void delete(String table, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        synchronized (LOCK) {
            try {
                SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        sQLiteDatabaseWithRetries.delete(table, str, strArr);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    } catch (Throwable th) {
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e) {
                            com.gamericefishpro.space.od.b.error("Error closing transaction! ", e);
                        } catch (IllegalStateException e2) {
                            com.gamericefishpro.space.od.b.error("Error closing transaction! ", e2);
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    com.gamericefishpro.space.od.b.error("Error deleting on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e3);
                } catch (IllegalStateException e4) {
                    com.gamericefishpro.space.od.b.error("Error under delete transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e4);
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e5) {
                    com.gamericefishpro.space.od.b.error("Error closing transaction! ", e5);
                } catch (IllegalStateException e6) {
                    com.gamericefishpro.space.od.b.error("Error closing transaction! ", e6);
                }
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.gamericefishpro.space.tc.c
    public void insert(String table, String str, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(table, "table");
        synchronized (LOCK) {
            try {
                SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        sQLiteDatabaseWithRetries.insert(table, str, contentValues);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    } catch (Throwable th) {
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e) {
                            com.gamericefishpro.space.od.b.error("Error closing transaction! ", e);
                        } catch (IllegalStateException e2) {
                            com.gamericefishpro.space.od.b.error("Error closing transaction! ", e2);
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    com.gamericefishpro.space.od.b.error("Error inserting on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e3);
                } catch (IllegalStateException e4) {
                    com.gamericefishpro.space.od.b.error("Error under inserting transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e4);
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e5) {
                    com.gamericefishpro.space.od.b.error("Error closing transaction! ", e5);
                } catch (IllegalStateException e6) {
                    com.gamericefishpro.space.od.b.error("Error closing transaction! ", e6);
                }
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.gamericefishpro.space.tc.c
    public void insertOrThrow(String table, String str, ContentValues contentValues) {
        Intrinsics.checkNotNullParameter(table, "table");
        synchronized (LOCK) {
            try {
                SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        sQLiteDatabaseWithRetries.insertOrThrow(table, str, contentValues);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    } catch (Throwable th) {
                        try {
                            sQLiteDatabaseWithRetries.endTransaction();
                        } catch (SQLiteException e) {
                            com.gamericefishpro.space.od.b.error("Error closing transaction! ", e);
                        } catch (IllegalStateException e2) {
                            com.gamericefishpro.space.od.b.error("Error closing transaction! ", e2);
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    com.gamericefishpro.space.od.b.error("Error inserting or throw on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e3);
                } catch (IllegalStateException e4) {
                    com.gamericefishpro.space.od.b.error("Error under inserting or throw transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e4);
                }
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e5) {
                    com.gamericefishpro.space.od.b.error("Error closing transaction! ", e5);
                } catch (IllegalStateException e6) {
                    com.gamericefishpro.space.od.b.error("Error closing transaction! ", e6);
                }
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        Intrinsics.checkNotNullParameter(db, "db");
        db.execSQL(SQL_CREATE_ENTRIES);
        db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT,session_time INTEGER);");
        db.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
        db.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        for (String str : SQL_INDEX_ENTRIES) {
            db.execSQL(str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int i, int i2) throws IOException {
        int i3;
        Intrinsics.checkNotNullParameter(db, "db");
        com.gamericefishpro.space.od.b.warn$default("SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null, 2, null);
        Cursor cursorRawQuery = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        try {
            ArrayList arrayList = new ArrayList(cursorRawQuery.getCount());
            while (true) {
                i3 = 0;
                if (!cursorRawQuery.moveToNext()) {
                    break;
                }
                String string = cursorRawQuery.getString(0);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                arrayList.add(string);
            }
            int size = arrayList.size();
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                String str = (String) obj;
                if (!d.j(str, "sqlite_")) {
                    db.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            Unit unit = Unit.a;
            cursorRawQuery.close();
            onCreate(db);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                y3.s(cursorRawQuery, th);
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int i, int i2) {
        Intrinsics.checkNotNullParameter(db, "db");
        com.gamericefishpro.space.od.b.debug$default("OneSignal Database onUpgrade from: " + i + " to: " + i2, null, 2, null);
        try {
            internalOnUpgrade(db, i, i2);
        } catch (SQLiteException e) {
            com.gamericefishpro.space.od.b.error("Error in upgrade, migration may have already run! Skipping!", e);
        }
    }

    @Override // com.gamericefishpro.space.tc.c
    public void query(String table, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, Function1<? super com.gamericefishpro.space.tc.a, Unit> action) {
        Cursor cursorQuery;
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(action, "action");
        synchronized (LOCK) {
            try {
                if (str5 == null) {
                    cursorQuery = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4);
                    Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
                } else {
                    cursorQuery = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4, str5);
                    Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            action.invoke(new com.gamericefishpro.space.uc.a(cursorQuery));
            y3.s(cursorQuery, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                y3.s(cursorQuery, th2);
                throw th3;
            }
        }
    }

    @Override // com.gamericefishpro.space.tc.c
    public int update(String table, ContentValues values, String str, String[] strArr) {
        Intrinsics.checkNotNullParameter(table, "table");
        Intrinsics.checkNotNullParameter(values, "values");
        String string = values.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        int iUpdate = 0;
        if (string.length() == 0) {
            return 0;
        }
        synchronized (LOCK) {
            try {
                SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
                try {
                    try {
                        sQLiteDatabaseWithRetries.beginTransaction();
                        iUpdate = sQLiteDatabaseWithRetries.update(table, values, str, strArr);
                        sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    } catch (Throwable th) {
                        try {
                            try {
                                sQLiteDatabaseWithRetries.endTransaction();
                            } catch (SQLiteException e) {
                                com.gamericefishpro.space.od.b.error("Error closing transaction! ", e);
                            }
                        } catch (IllegalStateException e2) {
                            com.gamericefishpro.space.od.b.error("Error closing transaction! ", e2);
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    com.gamericefishpro.space.od.b.error("Error updating on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e3);
                } catch (IllegalStateException e4) {
                    com.gamericefishpro.space.od.b.error("Error under update transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e4);
                }
                try {
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e5) {
                        com.gamericefishpro.space.od.b.error("Error closing transaction! ", e5);
                    }
                } catch (IllegalStateException e6) {
                    com.gamericefishpro.space.od.b.error("Error closing transaction! ", e6);
                }
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iUpdate;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o _outcomeTableProvider, Context context, int i) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i);
        Intrinsics.checkNotNullParameter(_outcomeTableProvider, "_outcomeTableProvider");
        this._outcomeTableProvider = _outcomeTableProvider;
    }
}
