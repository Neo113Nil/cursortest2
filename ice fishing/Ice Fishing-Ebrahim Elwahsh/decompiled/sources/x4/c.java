package x4;

import E7.l;
import M7.q;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import com.onesignal.session.internal.outcomes.impl.o;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.e;
import kotlin.jvm.internal.h;

/* loaded from: classes2.dex */
public class c extends SQLiteOpenHelper implements w4.c {
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

    public static final class a {
        public /* synthetic */ a(e eVar) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ c(o oVar, Context context, int i, int i4, e eVar) {
        this(oVar, context, (i4 & 4) != 0 ? 9 : i);
    }

    private final SQLiteDatabase getSQLiteDatabase() {
        SQLiteDatabase writableDatabase;
        synchronized (LOCK) {
            try {
                writableDatabase = getWritableDatabase();
                h.b(writableDatabase);
            } catch (SQLiteCantOpenDatabaseException e6) {
                throw e6;
            } catch (SQLiteDatabaseLockedException e9) {
                throw e9;
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
                } catch (SQLiteCantOpenDatabaseException e6) {
                    i++;
                    if (i >= 5) {
                        throw e6;
                    }
                    SystemClock.sleep(i * DB_OPEN_RETRY_BACKOFF);
                } catch (SQLiteDatabaseLockedException e9) {
                    i++;
                    if (i >= 5) {
                        throw e9;
                    }
                    SystemClock.sleep(i * DB_OPEN_RETRY_BACKOFF);
                }
            }
        }
        return sQLiteDatabase;
    }

    private final synchronized void internalOnUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i4) {
        if (i < 2 && i4 >= 2) {
            try {
                upgradeToV2(sQLiteDatabase);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (i < 3 && i4 >= 3) {
            upgradeToV3(sQLiteDatabase);
        }
        if (i < 4 && i4 >= 4) {
            upgradeToV4(sQLiteDatabase);
        }
        if (i < 5 && i4 >= 5) {
            upgradeToV5(sQLiteDatabase);
        }
        if (i == 5 && i4 >= 6) {
            upgradeFromV5ToV6(sQLiteDatabase);
        }
        if (i < 7 && i4 >= 7) {
            upgradeToV7(sQLiteDatabase);
        }
        if (i < 8 && i4 >= 8) {
            upgradeToV8(sQLiteDatabase);
        }
        if (i < 9 && i4 >= 9) {
            upgradeToV9(sQLiteDatabase);
        }
    }

    private final void safeExecSQL(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e6) {
            e6.printStackTrace();
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

    @Override // w4.c
    public void delete(String table, String str, String[] strArr) {
        String str2;
        String str3;
        h.e(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.delete(table, str, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e6) {
                com.onesignal.debug.internal.logging.b.error("Error deleting on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e6);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e9) {
                    e = e9;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e10) {
                    e = e10;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            } catch (IllegalStateException e11) {
                com.onesignal.debug.internal.logging.b.error("Error under delete transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e11);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e12) {
                    e = e12;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e13) {
                    e = e13;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e14) {
                e = e14;
                str3 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str3, e);
            } catch (IllegalStateException e15) {
                e = e15;
                str2 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str2, e);
            }
        }
    }

    @Override // w4.c
    public void insert(String table, String str, ContentValues contentValues) {
        String str2;
        String str3;
        h.e(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insert(table, str, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e6) {
                com.onesignal.debug.internal.logging.b.error("Error inserting on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e6);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e9) {
                    e = e9;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e10) {
                    e = e10;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            } catch (IllegalStateException e11) {
                com.onesignal.debug.internal.logging.b.error("Error under inserting transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e11);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e12) {
                    e = e12;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e13) {
                    e = e13;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e14) {
                e = e14;
                str3 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str3, e);
            } catch (IllegalStateException e15) {
                e = e15;
                str2 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str2, e);
            }
        }
    }

    @Override // w4.c
    public void insertOrThrow(String table, String str, ContentValues contentValues) {
        String str2;
        String str3;
        h.e(table, "table");
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    sQLiteDatabaseWithRetries.insertOrThrow(table, str, contentValues);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                } finally {
                }
            } catch (SQLiteException e6) {
                com.onesignal.debug.internal.logging.b.error("Error inserting or throw on table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e6);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e9) {
                    e = e9;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e10) {
                    e = e10;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            } catch (IllegalStateException e11) {
                com.onesignal.debug.internal.logging.b.error("Error under inserting or throw transaction under table: " + table + " with nullColumnHack: " + str + " and values: " + contentValues, e11);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e12) {
                    e = e12;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                } catch (IllegalStateException e13) {
                    e = e13;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                }
            }
            try {
                sQLiteDatabaseWithRetries.endTransaction();
            } catch (SQLiteException e14) {
                e = e14;
                str3 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str3, e);
            } catch (IllegalStateException e15) {
                e = e15;
                str2 = "Error closing transaction! ";
                com.onesignal.debug.internal.logging.b.error(str2, e);
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase db) {
        h.e(db, "db");
        db.execSQL(SQL_CREATE_ENTRIES);
        db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT,session_time INTEGER);");
        db.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
        db.execSQL(SQL_CREATE_IN_APP_MESSAGE_ENTRIES);
        for (String str : SQL_INDEX_ENTRIES) {
            db.execSQL(str);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase db, int i, int i4) {
        h.e(db, "db");
        com.onesignal.debug.internal.logging.b.warn$default("SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.", null, 2, null);
        Cursor rawQuery = db.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
        try {
            ArrayList arrayList = new ArrayList(rawQuery.getCount());
            while (rawQuery.moveToNext()) {
                String string = rawQuery.getString(0);
                h.d(string, "getString(...)");
                arrayList.add(string);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!q.I(str, "sqlite_")) {
                    db.execSQL("DROP TABLE IF EXISTS " + str);
                }
            }
            rawQuery.close();
            onCreate(db);
        } finally {
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int i, int i4) {
        h.e(db, "db");
        com.onesignal.debug.internal.logging.b.debug$default("OneSignal Database onUpgrade from: " + i + " to: " + i4, null, 2, null);
        try {
            internalOnUpgrade(db, i, i4);
        } catch (SQLiteException e6) {
            com.onesignal.debug.internal.logging.b.error("Error in upgrade, migration may have already run! Skipping!", e6);
        }
    }

    @Override // w4.c
    public void query(String table, String[] strArr, String str, String[] strArr2, String str2, String str3, String str4, String str5, l action) {
        Cursor query;
        h.e(table, "table");
        h.e(action, "action");
        synchronized (LOCK) {
            try {
                if (str5 == null) {
                    query = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4);
                    h.d(query, "query(...)");
                } else {
                    query = getSQLiteDatabaseWithRetries().query(table, strArr, str, strArr2, str2, str3, str4, str5);
                    h.d(query, "query(...)");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            action.invoke(new C5212a(query));
            query.close();
        } finally {
        }
    }

    @Override // w4.c
    public int update(String table, ContentValues values, String str, String[] strArr) {
        String str2;
        String str3;
        h.e(table, "table");
        h.e(values, "values");
        String contentValues = values.toString();
        h.d(contentValues, "toString(...)");
        int i = 0;
        if (contentValues.length() == 0) {
            return 0;
        }
        synchronized (LOCK) {
            SQLiteDatabase sQLiteDatabaseWithRetries = getSQLiteDatabaseWithRetries();
            try {
                try {
                    sQLiteDatabaseWithRetries.beginTransaction();
                    i = sQLiteDatabaseWithRetries.update(table, values, str, strArr);
                    sQLiteDatabaseWithRetries.setTransactionSuccessful();
                    try {
                        sQLiteDatabaseWithRetries.endTransaction();
                    } catch (SQLiteException e6) {
                        e = e6;
                        str3 = "Error closing transaction! ";
                        com.onesignal.debug.internal.logging.b.error(str3, e);
                        return i;
                    } catch (IllegalStateException e9) {
                        e = e9;
                        str2 = "Error closing transaction! ";
                        com.onesignal.debug.internal.logging.b.error(str2, e);
                        return i;
                    }
                } finally {
                }
            } catch (SQLiteException e10) {
                com.onesignal.debug.internal.logging.b.error("Error updating on table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e10);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    return i;
                } catch (IllegalStateException e12) {
                    e = e12;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    return i;
                }
            } catch (IllegalStateException e13) {
                com.onesignal.debug.internal.logging.b.error("Error under update transaction under table: " + table + " with whereClause: " + str + " and whereArgs: " + strArr, e13);
                try {
                    sQLiteDatabaseWithRetries.endTransaction();
                } catch (SQLiteException e14) {
                    e = e14;
                    str3 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str3, e);
                    return i;
                } catch (IllegalStateException e15) {
                    e = e15;
                    str2 = "Error closing transaction! ";
                    com.onesignal.debug.internal.logging.b.error(str2, e);
                    return i;
                }
            }
        }
        return i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(o _outcomeTableProvider, Context context, int i) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, i);
        h.e(_outcomeTableProvider, "_outcomeTableProvider");
        this._outcomeTableProvider = _outcomeTableProvider;
    }
}
