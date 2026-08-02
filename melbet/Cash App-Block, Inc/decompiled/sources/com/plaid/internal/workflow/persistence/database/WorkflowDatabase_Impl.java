package com.plaid.internal.workflow.persistence.database;

import android.content.Context;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.RoomOpenHelper;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.Migration;
import androidx.room.util.DBUtil__DBUtilKt;
import androidx.room.util.TableInfo;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.plaid.internal.C4;
import com.plaid.internal.H4;
import com.plaid.internal.I3;
import com.plaid.internal.P3;
import com.plaid.internal.Y7;
import com.plaid.internal.g8;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import okhttp3.internal.connection.Exchange;

/* loaded from: classes5.dex */
public final class WorkflowDatabase_Impl extends WorkflowDatabase {
    public volatile H4 a;
    public volatile P3 b;
    public volatile g8 c;

    public class a extends RoomOpenHelper.Delegate {
        public a() {
        }

        public final void createAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `workflow_pane` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `workflow_local_key_values` (`pane_id` TEXT NOT NULL, `key` TEXT NOT NULL, `string` TEXT, `byte_array` BLOB, PRIMARY KEY(`pane_id`, `key`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `workflow_analytics` (`workflow_id` TEXT NOT NULL, `id` TEXT NOT NULL, `analytics_model` BLOB NOT NULL, PRIMARY KEY(`workflow_id`, `id`))");
            supportSQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            supportSQLiteDatabase.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'bbbb42d6a8058409381c7dda80a54606')");
        }

        public final void dropAllTables(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `workflow_pane`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `workflow_local_key_values`");
            supportSQLiteDatabase.execSQL("DROP TABLE IF EXISTS `workflow_analytics`");
            List list = ((RoomDatabase) WorkflowDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).getClass();
                }
            }
        }

        public final void onCreate(SupportSQLiteDatabase supportSQLiteDatabase) {
            List list = ((RoomDatabase) WorkflowDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).getClass();
                    supportSQLiteDatabase.getClass();
                }
            }
        }

        public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
            ((RoomDatabase) WorkflowDatabase_Impl.this).mDatabase = supportSQLiteDatabase;
            WorkflowDatabase_Impl.this.internalInitInvalidationTracker(supportSQLiteDatabase);
            List list = ((RoomDatabase) WorkflowDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).onOpen(supportSQLiteDatabase);
                }
            }
        }

        public final void onPostMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
        }

        public final void onPreMigrate(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.getClass();
            DBUtil__DBUtilKt.dropFtsSyncTriggers(new SupportSQLiteConnection(supportSQLiteDatabase));
        }

        public final RoomOpenHelper.ValidationResult onValidateSchema(SupportSQLiteDatabase supportSQLiteDatabase) {
            HashMap hashMap = new HashMap(3);
            hashMap.put("workflow_id", new TableInfo.Column(1, 1, "workflow_id", "TEXT", null, true));
            hashMap.put("id", new TableInfo.Column(2, 1, "id", "TEXT", null, true));
            hashMap.put("model", new TableInfo.Column(0, 1, "model", "BLOB", null, true));
            TableInfo tableInfo = new TableInfo("workflow_pane", hashMap, new HashSet(0), new HashSet(0));
            TableInfo read = TableInfo.read(supportSQLiteDatabase, "workflow_pane");
            if (!tableInfo.equals(read)) {
                return new RoomOpenHelper.ValidationResult(false, "workflow_pane(com.plaid.internal.workflow.persistence.database.model.PaneEntity).\n Expected:\n" + tableInfo + "\n Found:\n" + read);
            }
            HashMap hashMap2 = new HashMap(4);
            hashMap2.put("pane_id", new TableInfo.Column(1, 1, "pane_id", "TEXT", null, true));
            hashMap2.put("key", new TableInfo.Column(2, 1, "key", "TEXT", null, true));
            hashMap2.put(InquiryField.StringField.TYPE, new TableInfo.Column(0, 1, InquiryField.StringField.TYPE, "TEXT", null, false));
            hashMap2.put("byte_array", new TableInfo.Column(0, 1, "byte_array", "BLOB", null, false));
            TableInfo tableInfo2 = new TableInfo("workflow_local_key_values", hashMap2, new HashSet(0), new HashSet(0));
            TableInfo read2 = TableInfo.read(supportSQLiteDatabase, "workflow_local_key_values");
            if (!tableInfo2.equals(read2)) {
                return new RoomOpenHelper.ValidationResult(false, "workflow_local_key_values(com.plaid.internal.workflow.persistence.database.model.LocalKeyValuesEntity).\n Expected:\n" + tableInfo2 + "\n Found:\n" + read2);
            }
            HashMap hashMap3 = new HashMap(3);
            hashMap3.put("workflow_id", new TableInfo.Column(1, 1, "workflow_id", "TEXT", null, true));
            hashMap3.put("id", new TableInfo.Column(2, 1, "id", "TEXT", null, true));
            hashMap3.put("analytics_model", new TableInfo.Column(0, 1, "analytics_model", "BLOB", null, true));
            TableInfo tableInfo3 = new TableInfo("workflow_analytics", hashMap3, new HashSet(0), new HashSet(0));
            TableInfo read3 = TableInfo.read(supportSQLiteDatabase, "workflow_analytics");
            if (tableInfo3.equals(read3)) {
                return new RoomOpenHelper.ValidationResult(true, null);
            }
            return new RoomOpenHelper.ValidationResult(false, "workflow_analytics(com.plaid.internal.workflow.persistence.database.model.WorkflowAnalyticsEntity).\n Expected:\n" + tableInfo3 + "\n Found:\n" + read3);
        }
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final I3 a() {
        P3 p3;
        if (this.b != null) {
            return this.b;
        }
        synchronized (this) {
            try {
                if (this.b == null) {
                    this.b = new P3(this);
                }
                p3 = this.b;
            } catch (Throwable th) {
                throw th;
            }
        }
        return p3;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final C4 b() {
        H4 h4;
        if (this.a != null) {
            return this.a;
        }
        synchronized (this) {
            try {
                if (this.a == null) {
                    this.a = new H4(this);
                }
                h4 = this.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return h4;
    }

    @Override // com.plaid.internal.workflow.persistence.database.WorkflowDatabase
    public final Y7 c() {
        g8 g8Var;
        if (this.c != null) {
            return this.c;
        }
        synchronized (this) {
            try {
                if (this.c == null) {
                    this.c = new g8(this);
                }
                g8Var = this.c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return g8Var;
    }

    @Override // androidx.room.RoomDatabase
    public final void clearAllTables() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        try {
            beginTransaction();
            writableDatabase.execSQL("DELETE FROM `workflow_pane`");
            writableDatabase.execSQL("DELETE FROM `workflow_local_key_values`");
            writableDatabase.execSQL("DELETE FROM `workflow_analytics`");
            setTransactionSuccessful();
        } finally {
            endTransaction();
            writableDatabase.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!writableDatabase.inTransaction()) {
                writableDatabase.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    public final InvalidationTracker createInvalidationTracker() {
        return new InvalidationTracker(this, new HashMap(0), new HashMap(0), "workflow_pane", "workflow_local_key_values", "workflow_analytics");
    }

    @Override // androidx.room.RoomDatabase
    public final SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        RoomOpenHelper roomOpenHelper = new RoomOpenHelper(databaseConfiguration, new a());
        Context context = databaseConfiguration.context;
        context.getClass();
        return databaseConfiguration.sqliteOpenHelperFactory.create(new Exchange(context, databaseConfiguration.name, roomOpenHelper, false, false));
    }

    @Override // androidx.room.RoomDatabase
    public final List<Migration> getAutoMigrations(Map<Class<Object>, Object> map) {
        return new ArrayList();
    }

    @Override // androidx.room.RoomDatabase
    public final Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    public final Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap hashMap = new HashMap();
        List list = Collections.EMPTY_LIST;
        hashMap.put(C4.class, list);
        hashMap.put(I3.class, list);
        hashMap.put(Y7.class, list);
        return hashMap;
    }
}
