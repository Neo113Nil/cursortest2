package ru.yandex.common.clid;

import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import defpackage.aez;
import defpackage.ny61;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

/* loaded from: classes9.dex */
class ClidProvider {
    public static final String APPLICATION = "application";
    public static final String APPS_TABLE_NAME = "apps";
    public static final String APP_ACTIVE = "active";
    public static final String APP_INACTIVE = "inactive";
    public static final String APP_UNTRUSTED = "untrusted";
    public static final String CLID = "clid";
    public static final String CLID_TABLE_NAME = "clids";
    public static final String DATABASE_NAME = "ru.yandex.searchlib.clids.db";
    public static final int DATABASE_VERSION = 1;
    public static final String IDENTITY = "identity";
    public static final String STATE = "state";
    public static final String TAG = "[YClidLib:ClidProvider]";
    public static final String TIMESTAMP = "timestamp";
    public static final String TYPE = "type";
    public static final String VERSION = "version";
    public static final String _ID = "_id";
    private SQLiteDatabase db;
    private ClidDatabaseHelper dbHelper;
    private Context sContext;

    public static class ClidDatabaseHelper extends SQLiteOpenHelper {
        public ClidDatabaseHelper(Context context) {
            super(context, ClidProvider.DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            aez.c();
            sQLiteDatabase.execSQL("CREATE TABLE clids (_id INTEGER PRIMARY KEY,identity TEXT,type TEXT,application TEXT,version INTEGER,timestamp INTEGER,clid TEXT);");
            sQLiteDatabase.execSQL("CREATE TABLE apps (application TEXT PRIMARY KEY,state TEXT);");
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            aez.c();
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS clids");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS apps");
            onCreate(sQLiteDatabase);
        }
    }

    public static class ClidProviderHolder {
        private static final ClidProvider INSTANCE = new ClidProvider();

        private ClidProviderHolder() {
        }
    }

    private synchronized void addClid(ClidItem clidItem) {
        openDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(IDENTITY, clidItem.identity);
        contentValues.put("type", clidItem.type);
        contentValues.put(APPLICATION, clidItem.application);
        contentValues.put("version", Integer.valueOf(clidItem.version));
        contentValues.put(TIMESTAMP, Long.valueOf(clidItem.time));
        contentValues.put("clid", clidItem.clid);
        try {
            this.db.insert(CLID_TABLE_NAME, null, contentValues);
        } catch (Exception unused) {
            aez.c();
        }
    }

    public static long getInstallationTime(PackageManager packageManager, String str) {
        try {
            long j = PackageInfo.class.getField("firstInstallTime").getLong(packageManager.getPackageInfo(str, 0));
            aez.c();
            return j;
        } catch (PackageManager.NameNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchFieldException | SecurityException unused) {
            return ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED;
        }
    }

    public static ClidProvider getInstance() {
        return ClidProviderHolder.INSTANCE;
    }

    private synchronized void updateClid(ClidItem clidItem) {
        openDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put("version", Integer.valueOf(clidItem.version));
        contentValues.put("clid", clidItem.clid);
        try {
            this.db.update(CLID_TABLE_NAME, contentValues, "identity=? AND type=? AND application=?", new String[]{clidItem.identity, clidItem.type, clidItem.application});
        } catch (Exception unused) {
            aez.c();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0062, code lost:
    
        if (r1 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void addOrUpdateClid(ClidItem clidItem) {
        getInstance().sContext.getPackageName();
        clidItem.toLog();
        aez.c();
        ClidItem checkTime = checkTime(clidItem);
        openDatabase();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase writableDatabase = this.dbHelper.getWritableDatabase();
                this.db = writableDatabase;
                cursor = writableDatabase.query(CLID_TABLE_NAME, new String[]{TIMESTAMP, "version"}, "identity=? AND type=? AND application=? ", new String[]{checkTime.identity, checkTime.type, checkTime.application}, null, null, null, "1");
                if (!cursor.moveToFirst()) {
                    addClid(checkTime);
                } else if (cursor.getInt(1) != checkTime.version) {
                    updateClid(checkTime);
                }
            } catch (Exception unused) {
                aez.c();
            }
            cursor.close();
        } finally {
        }
    }

    public boolean checkDatabase() {
        boolean isDatabaseOpen = isDatabaseOpen();
        if (isDatabaseOpen) {
            return isDatabaseOpen;
        }
        ny61.f("Error: Clid Database closed! Call ClidProvider.openDatabase() first");
        return false;
    }

    public ClidItem checkTime(ClidItem clidItem) {
        long installationTime = getInstallationTime(this.sContext.getPackageManager(), clidItem.application);
        if (installationTime < ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED && installationTime != clidItem.time) {
            this.sContext.getPackageName();
            aez.c();
            clidItem.time = installationTime;
        }
        return clidItem;
    }

    public void closeDatabase() {
        if (isDatabaseOpen()) {
            this.db.close();
        }
        this.db = null;
    }

    public synchronized ClidItem getActiveClid(String str, String str2) {
        openDatabase();
        try {
            Cursor query = this.db.query(CLID_TABLE_NAME, new String[]{IDENTITY, "type", APPLICATION, "version", TIMESTAMP, "clid"}, "identity=? AND type=?", new String[]{str, str2}, null, null, TIMESTAMP, "1");
            if (query != null && query.moveToFirst()) {
                ClidItem clidItem = new ClidItem(query.getString(0), query.getString(1), query.getString(2), query.getInt(3), query.getLong(4), query.getString(5));
                query.close();
                return clidItem;
            }
            ClidItem localClidItem = ClidManager.getInstance().getLocalClidItem(str, str2);
            if (query != null) {
                query.close();
            }
            return localClidItem;
        } finally {
        }
    }

    public synchronized String getActiveClidApplication(String str, String str2) {
        openDatabase();
        try {
            SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
            this.db = readableDatabase;
            Cursor query = readableDatabase.query("apps LEFT OUTER JOIN clids ON ( apps.application == clids.application )", new String[]{"clids.application"}, "identity=? AND type=? AND state=? ", new String[]{str, str2, APP_ACTIVE}, null, null, TIMESTAMP, "1");
            if (query != null && query.moveToFirst()) {
                String string = query.getString(0);
                query.close();
                return string;
            }
            String packageName = this.sContext.getPackageName();
            if (query != null) {
                query.close();
            }
            return packageName;
        } finally {
        }
    }

    public synchronized List<ClidItem> getApplicationClids(String str) {
        ArrayList arrayList = new ArrayList();
        openDatabase();
        try {
            SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
            this.db = readableDatabase;
            Cursor query = readableDatabase.query(CLID_TABLE_NAME, new String[]{IDENTITY, "type", APPLICATION, "version", TIMESTAMP, "clid"}, "application=? ", new String[]{str}, null, null, null, null);
            if (query == null) {
                if (query != null) {
                    query.close();
                }
                return arrayList;
            }
            if (!query.moveToFirst()) {
                query.close();
                return arrayList;
            }
            do {
                arrayList.add(new ClidItem(query.getString(0), query.getString(1), query.getString(2), query.getInt(3), query.getLong(4), query.getString(5)));
            } while (query.moveToNext());
            query.close();
            return arrayList;
        } finally {
        }
    }

    public synchronized List<String> getApplications() {
        ArrayList arrayList = new ArrayList();
        openDatabase();
        Cursor cursor = null;
        try {
            Cursor query = this.db.query(APPS_TABLE_NAME, new String[]{APPLICATION}, null, null, null, null, null, null);
            if (query == null) {
                if (query != null) {
                    query.close();
                }
                return arrayList;
            }
            if (!query.moveToFirst()) {
                query.close();
                return arrayList;
            }
            do {
                arrayList.add(query.getString(0));
            } while (query.moveToNext());
            query.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public long getApplicationsCount() {
        openDatabase();
        return DatabaseUtils.queryNumEntries(this.db, APPS_TABLE_NAME);
    }

    public synchronized ClidItem getClid(String str, String str2, String str3) {
        Throwable th;
        openDatabase();
        Cursor cursor = null;
        try {
            SQLiteDatabase readableDatabase = this.dbHelper.getReadableDatabase();
            this.db = readableDatabase;
            Cursor query = readableDatabase.query(CLID_TABLE_NAME, new String[]{"version", TIMESTAMP, "clid"}, "identity=? AND type=? AND application=? ", new String[]{str, str2, str3}, null, null, null, "1");
            if (query == null) {
                if (query != null) {
                    query.close();
                }
                return null;
            }
            try {
                if (!query.moveToFirst()) {
                    query.close();
                    return null;
                }
                ClidItem clidItem = new ClidItem(str, str2, str3, query.getInt(0), query.getLong(1), query.getString(2));
                query.close();
                return clidItem;
            } catch (Throwable th2) {
                th = th2;
                cursor = query;
                if (cursor == null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public synchronized String getMaxVersionApplication(String str, String str2) {
        openDatabase();
        try {
            Cursor query = this.db.query("apps LEFT OUTER JOIN clids ON ( apps.application == clids.application )", new String[]{"clids.application"}, "identity=? AND type=? AND state=? ", new String[]{str, str2, APP_ACTIVE}, null, null, "version DESC, timestamp ASC", "1");
            if (query != null && query.moveToFirst()) {
                String string = query.getString(0);
                query.close();
                return string;
            }
            String valueOf = String.valueOf(this.sContext.getPackageName());
            if (query != null) {
                query.close();
            }
            return valueOf;
        } finally {
        }
    }

    public synchronized List<String> getTrustedApplications() {
        ArrayList arrayList = new ArrayList();
        openDatabase();
        Cursor cursor = null;
        try {
            Cursor query = this.db.query(APPS_TABLE_NAME, new String[]{APPLICATION}, "state <> ? ", new String[]{APP_UNTRUSTED}, null, null, null, null);
            if (query == null) {
                if (query != null) {
                    query.close();
                }
                return arrayList;
            }
            if (!query.moveToFirst()) {
                query.close();
                return arrayList;
            }
            do {
                arrayList.add(query.getString(0));
            } while (query.moveToNext());
            query.close();
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public void initContext(Context context) {
        this.sContext = context;
        this.dbHelper = new ClidDatabaseHelper(this.sContext);
    }

    public synchronized void insertClid(ClidItem clidItem) {
        openDatabase();
        aez.c();
        try {
            this.db.rawQuery("INSERT OR REPLACE INTO clids (identity,type,application,version,timestamp,clid) VALUES ('" + clidItem.identity + "','" + clidItem.type + "','" + clidItem.application + "'," + clidItem.version + ",coalesce((SELECT timestamp FROM clids WHERE identity = '" + clidItem.identity + "' AND type = '" + clidItem.type + "' AND application = '" + clidItem.application + "')," + clidItem.time + "),'" + clidItem.clid + "');", null);
        } catch (Exception unused) {
            aez.c();
        }
    }

    public synchronized boolean isApplicationTrusted(String str) {
        if (str == null) {
            return false;
        }
        openDatabase();
        try {
            Cursor query = this.db.query(APPS_TABLE_NAME, new String[]{APPLICATION}, "application = ? AND state <> ? ", new String[]{str, APP_UNTRUSTED}, null, null, null, "1");
            if (query != null && query.moveToFirst()) {
                this.sContext.getPackageName();
                aez.c();
                query.close();
                return true;
            }
            this.sContext.getPackageName();
            aez.c();
            if (query != null) {
                query.close();
            }
            return false;
        } finally {
        }
    }

    public boolean isDatabaseOpen() {
        SQLiteDatabase sQLiteDatabase = this.db;
        return sQLiteDatabase != null && sQLiteDatabase.isOpen();
    }

    public void logDatabase() {
        logTable(APPS_TABLE_NAME);
        logTable(CLID_TABLE_NAME);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0109, code lost:
    
        r1.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0111, code lost:
    
        if (r1 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void logTable(String str) {
        Cursor cursor;
        try {
            openDatabase();
            cursor = null;
            try {
                aez.b(TAG, str + " ----------------------------------------------------------------------------------------------");
                aez.b(TAG, str + " -----     " + getInstance().sContext.getPackageName() + "     -----");
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" ----------------------------------------------------------------------------------------------");
                aez.b(TAG, sb.toString());
                cursor = this.db.query(str, null, null, null, null, null, null);
            } catch (Exception unused) {
                aez.c();
            }
            if (cursor != null && cursor.moveToFirst()) {
                StringBuilder sb2 = new StringBuilder();
                for (String str2 : cursor.getColumnNames()) {
                    sb2.append(" | ");
                    sb2.append(str2);
                }
                aez.b(TAG, str + Extension.COLON_SPACE + sb2.toString());
                do {
                    StringBuilder sb3 = new StringBuilder();
                    for (int i = 0; i < cursor.getColumnCount(); i++) {
                        sb3.append(" | ");
                        sb3.append(cursor.getString(i));
                    }
                    aez.b(TAG, str + Extension.COLON_SPACE + sb3.toString());
                } while (cursor.moveToNext());
                aez.b(TAG, str + " ----------------------------------------------------------------------------------------------");
                cursor.close();
            }
        } catch (Throwable th) {
            if (cursor == null) {
                throw th;
            }
            cursor.close();
            throw th;
        } finally {
        }
    }

    public void openDatabase() {
        if (isDatabaseOpen()) {
            return;
        }
        try {
            this.db = this.dbHelper.getWritableDatabase();
        } catch (Exception e) {
            String str = "unable to open writable database: " + e.getMessage();
            if (aez.c()) {
                Log.e(TAG, str);
            }
            try {
                this.db = this.dbHelper.getReadableDatabase();
            } catch (Exception e2) {
                String str2 = "unable to open readable database: " + e2.getMessage();
                if (aez.c()) {
                    Log.e(TAG, str2);
                }
            }
        }
    }

    public synchronized void removeApplication(String str) {
        openDatabase();
        try {
            this.db.delete(APPS_TABLE_NAME, "application=?", new String[]{str});
        } catch (Exception unused) {
            aez.c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.String] */
    public synchronized void setApplicationState(String str, String str2) {
        Throwable th;
        Cursor cursor;
        Cursor query;
        if (str2 == null) {
            return;
        }
        openDatabase();
        Cursor cursor2 = null;
        Cursor cursor3 = null;
        Cursor cursor4 = null;
        try {
            try {
                query = this.db.query(APPS_TABLE_NAME, new String[]{STATE}, "application=? ", new String[]{str}, null, null, null, "1");
            } catch (Throwable th2) {
                th = th2;
                cursor = cursor2;
            }
        } catch (Exception unused) {
        }
        try {
            if (!query.moveToFirst()) {
                ContentValues contentValues = new ContentValues();
                contentValues.put(APPLICATION, str);
                contentValues.put(STATE, str2);
                this.db.insert(APPS_TABLE_NAME, null, contentValues);
            } else {
                if (str2.equals(query.getString(0))) {
                    query.close();
                    return;
                }
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put(STATE, str2);
                SQLiteDatabase sQLiteDatabase = this.db;
                ?? r1 = APPS_TABLE_NAME;
                sQLiteDatabase.update(APPS_TABLE_NAME, contentValues2, "application=? ", new String[]{str});
                cursor3 = r1;
            }
            query.close();
            cursor2 = cursor3;
        } catch (Exception unused2) {
            cursor4 = query;
            aez.c();
            cursor2 = cursor4;
            if (cursor4 != null) {
                cursor4.close();
                cursor2 = cursor4;
            }
        } catch (Throwable th3) {
            th = th3;
            cursor = query;
            if (cursor == null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    private ClidProvider() {
    }
}
