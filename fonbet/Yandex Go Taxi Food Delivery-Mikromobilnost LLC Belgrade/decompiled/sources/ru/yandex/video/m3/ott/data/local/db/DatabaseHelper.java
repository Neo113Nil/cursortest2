package ru.yandex.video.m3.ott.data.local.db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import defpackage.ooc;
import defpackage.tcc;
import defpackage.tls;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\t\b\u0000\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001d\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\b2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\f0\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u001a\u001a\u00020\u0013¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lru/yandex/video/m3/ott/data/local/db/DatabaseHelper;", "Landroid/database/sqlite/SQLiteOpenHelper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/database/sqlite/SQLiteDatabase;", "database", "Lzy11;", "onCreate", "(Landroid/database/sqlite/SQLiteDatabase;)V", "db", "", "oldVersion", "newVersion", "onUpgrade", "(Landroid/database/sqlite/SQLiteDatabase;II)V", "limit", "", "", "getOttTrackingEvents", "(I)Ljava/util/Map;", "", "ids", "removeOttTrackingEvents", "(Ljava/util/Set;)V", OttTrackingTable.COLUMN_EVENT, "insertOttTrackingEvents", "(Ljava/lang/String;)V", "Companion", "OttTrackingTable", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class DatabaseHelper extends SQLiteOpenHelper {
    public static final int $stable = 0;
    private static final String DATABASE_NAME = "YandexPlayer.db";
    private static final int DATABASE_VERSION = 1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0007\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0019\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0007¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/yandex/video/m3/ott/data/local/db/DatabaseHelper$OttTrackingTable;", "", "()V", "COLUMN_EVENT", "", "COLUMN_ID", "PROJECTION", "", "getPROJECTION", "()[Ljava/lang/String;", "[Ljava/lang/String;", "SQL_CREATE_TABLE", "SQL_INSERT", "TABLE_NAME", "video-player_internalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class OttTrackingTable {
        public static final String COLUMN_ID = "id";
        public static final String SQL_CREATE_TABLE = "CREATE TABLE IF NOT EXISTS `OttTracking` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `event` TEXT NOT NULL)";
        public static final String SQL_INSERT = "INSERT INTO `OttTracking`(`event`) VALUES (?)";
        public static final String TABLE_NAME = "OttTracking";
        public static final OttTrackingTable INSTANCE = new OttTrackingTable();
        public static final String COLUMN_EVENT = "event";
        private static final String[] PROJECTION = {"id", COLUMN_EVENT};

        private OttTrackingTable() {
        }

        public final String[] getPROJECTION() {
            return PROJECTION;
        }
    }

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public final Map<Integer, String> getOttTrackingEvents(int limit) {
        LinkedHashMap linkedHashMap;
        OttTrackingTable ottTrackingTable = OttTrackingTable.INSTANCE;
        synchronized (ottTrackingTable) {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            try {
                Cursor query = readableDatabase.query(OttTrackingTable.TABLE_NAME, ottTrackingTable.getPROJECTION(), null, null, null, null, null, String.valueOf(limit));
                try {
                    Cursor cursor = query;
                    linkedHashMap = new LinkedHashMap();
                    int columnIndex = cursor.getColumnIndex("id");
                    int columnIndex2 = cursor.getColumnIndex(OttTrackingTable.COLUMN_EVENT);
                    while (cursor.moveToNext()) {
                        linkedHashMap.put(Integer.valueOf(cursor.getInt(columnIndex)), cursor.getString(columnIndex2));
                    }
                    ooc.g(query, null);
                    ooc.g(readableDatabase, null);
                } finally {
                }
            } finally {
            }
        }
        return linkedHashMap;
    }

    public final synchronized void insertOttTrackingEvents(String event) {
        synchronized (OttTrackingTable.INSTANCE) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            try {
                writableDatabase.beginTransaction();
                writableDatabase.execSQL(OttTrackingTable.SQL_INSERT, new String[]{event});
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
                writableDatabase.close();
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase database) {
        database.execSQL(OttTrackingTable.SQL_CREATE_TABLE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public final synchronized void removeOttTrackingEvents(Set<Integer> ids) {
        synchronized (OttTrackingTable.INSTANCE) {
            try {
                if (!ids.isEmpty()) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    try {
                        writableDatabase.beginTransaction();
                        String X = a.X(ids, null, "`id` IN(", Extension.C_BRAKE, new tls() { // from class: ru.yandex.video.m3.ott.data.local.db.DatabaseHelper$removeOttTrackingEvents$1$1
                            @Override // defpackage.tls
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                return invoke(((Number) obj).intValue());
                            }

                            public final CharSequence invoke(int i) {
                                return "?";
                            }
                        }, 25);
                        Set<Integer> set = ids;
                        ArrayList arrayList = new ArrayList(tcc.n(set, 10));
                        Iterator<T> it = set.iterator();
                        while (it.hasNext()) {
                            arrayList.add(String.valueOf(((Number) it.next()).intValue()));
                        }
                        writableDatabase.delete(OttTrackingTable.TABLE_NAME, X, (String[]) arrayList.toArray(new String[0]));
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                        writableDatabase.close();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        writableDatabase.close();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
