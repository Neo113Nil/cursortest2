package androidx.room;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.LruHashMap;
import androidx.room.RoomDatabase;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.Migration;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.workflow.persistence.database.WorkflowDatabase_Impl;
import com.squareup.util.Strings;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Deprecated;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okio.Utf8;

/* loaded from: classes3.dex */
public final class RoomOpenHelper extends SupportSQLiteOpenHelper.Callback {
    public final List callbacks;
    public DatabaseConfiguration configuration;
    public final WorkflowDatabase_Impl.a delegate;

    public abstract class Delegate {
        public final int version = 3;

        @Deprecated
        public void validateMigration(SupportSQLiteDatabase supportSQLiteDatabase) {
            supportSQLiteDatabase.getClass();
            throw new UnsupportedOperationException("validateMigration is deprecated");
        }
    }

    public final class ValidationResult {
        public final String expectedFoundMsg;
        public final boolean isValid;

        public ValidationResult(boolean z, String str) {
            this.isValid = z;
            this.expectedFoundMsg = str;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomOpenHelper(DatabaseConfiguration databaseConfiguration, WorkflowDatabase_Impl.a aVar) {
        super(aVar.version);
        databaseConfiguration.getClass();
        this.callbacks = databaseConfiguration.callbacks;
        this.configuration = databaseConfiguration;
        this.delegate = aVar;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onConfigure(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onCreate(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        Cursor query = frameworkSQLiteDatabase.query(new CallResult("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        try {
            boolean z = false;
            if (query.moveToFirst()) {
                if (query.getInt(0) == 0) {
                    z = true;
                }
            }
            query.close();
            WorkflowDatabase_Impl.a aVar = this.delegate;
            aVar.createAllTables(frameworkSQLiteDatabase);
            if (!z) {
                ValidationResult onValidateSchema = aVar.onValidateSchema(frameworkSQLiteDatabase);
                if (!onValidateSchema.isValid) {
                    a$$ExternalSyntheticBUOutline0.m$2(onValidateSchema.expectedFoundMsg, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.delegate;
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            sQLiteDatabase.execSQL(CoroutinesRoom.createInsertQuery("bbbb42d6a8058409381c7dda80a54606"));
            aVar.onCreate(frameworkSQLiteDatabase);
            List list = this.callbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.Callback) it.next()).getClass();
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Utf8.closeFinally(query, th);
                throw th2;
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onDowngrade(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
        onUpgrade(frameworkSQLiteDatabase, i, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0063  */
    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOpen(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        boolean z;
        List list;
        Cursor query = frameworkSQLiteDatabase.query(new CallResult("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
        try {
            if (query.moveToFirst()) {
                if (query.getInt(0) != 0) {
                    z = true;
                    query.close();
                    WorkflowDatabase_Impl.a aVar = this.delegate;
                    if (z) {
                        ValidationResult onValidateSchema = aVar.onValidateSchema(frameworkSQLiteDatabase);
                        if (!onValidateSchema.isValid) {
                            a$$ExternalSyntheticBUOutline0.m$2(onValidateSchema.expectedFoundMsg, "Pre-packaged database has an invalid schema: ");
                            return;
                        }
                        aVar.onPostMigrate(frameworkSQLiteDatabase);
                        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.delegate;
                        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        sQLiteDatabase.execSQL(CoroutinesRoom.createInsertQuery("bbbb42d6a8058409381c7dda80a54606"));
                    } else {
                        query = frameworkSQLiteDatabase.query(new CallResult("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1", (Object[]) null));
                        try {
                            String string2 = query.moveToFirst() ? query.getString(0) : null;
                            query.close();
                            if (!"bbbb42d6a8058409381c7dda80a54606".equals(string2) && !"b05e367cc67e6caaadf5a14d5c557670".equals(string2)) {
                                a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: bbbb42d6a8058409381c7dda80a54606, found: ", string2));
                                return;
                            }
                        } finally {
                        }
                    }
                    aVar.onOpen(frameworkSQLiteDatabase);
                    list = this.callbacks;
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            ((RoomDatabase.Callback) it.next()).onOpen(frameworkSQLiteDatabase);
                        }
                    }
                    this.configuration = null;
                }
            }
            z = false;
            query.close();
            WorkflowDatabase_Impl.a aVar2 = this.delegate;
            if (z) {
            }
            aVar2.onOpen(frameworkSQLiteDatabase);
            list = this.callbacks;
            if (list != null) {
            }
            this.configuration = null;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
    public final void onUpgrade(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
        SQLiteDatabase sQLiteDatabase = frameworkSQLiteDatabase.delegate;
        DatabaseConfiguration databaseConfiguration = this.configuration;
        WorkflowDatabase_Impl.a aVar = this.delegate;
        if (databaseConfiguration != null) {
            LruHashMap lruHashMap = databaseConfiguration.migrationContainer;
            lruHashMap.getClass();
            List findMigrationPath = Strings.findMigrationPath(lruHashMap, i, i2);
            if (findMigrationPath != null) {
                aVar.onPreMigrate(frameworkSQLiteDatabase);
                Iterator it = findMigrationPath.iterator();
                while (it.hasNext()) {
                    ((Migration) it.next()).migrate(new SupportSQLiteConnection(frameworkSQLiteDatabase));
                }
                ValidationResult onValidateSchema = aVar.onValidateSchema(frameworkSQLiteDatabase);
                if (!onValidateSchema.isValid) {
                    a$$ExternalSyntheticBUOutline0.m$2(onValidateSchema.expectedFoundMsg, "Migration didn't properly handle: ");
                    return;
                }
                aVar.onPostMigrate(frameworkSQLiteDatabase);
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                sQLiteDatabase.execSQL(CoroutinesRoom.createInsertQuery("bbbb42d6a8058409381c7dda80a54606"));
                return;
            }
        }
        DatabaseConfiguration databaseConfiguration2 = this.configuration;
        if (databaseConfiguration2 == null || Strings.isMigrationRequired(databaseConfiguration2, i, i2)) {
            a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m(i, i2, "A migration from ", " to ", " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
            return;
        }
        if (databaseConfiguration2.allowDestructiveMigrationForAllTables) {
            Cursor query = frameworkSQLiteDatabase.query(new CallResult("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
            try {
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                while (query.moveToNext()) {
                    String string2 = query.getString(0);
                    string2.getClass();
                    if (!StringsKt__StringsJVMKt.startsWith(string2, "sqlite_", false) && !string2.equals("android_metadata")) {
                        createListBuilder.add(new Pair(string2, Boolean.valueOf(Intrinsics.areEqual(query.getString(1), "view"))));
                    }
                }
                ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                query.close();
                ListIterator listIterator = build.listIterator(0);
                while (true) {
                    ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
                    if (!itr.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) itr.next();
                    String str = (String) pair.first;
                    if (((Boolean) pair.second).booleanValue()) {
                        sQLiteDatabase.execSQL("DROP VIEW IF EXISTS " + str);
                    } else {
                        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            aVar.dropAllTables(frameworkSQLiteDatabase);
        }
        List list = this.callbacks;
        if (list != null) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ((RoomDatabase.Callback) it2.next()).getClass();
            }
        }
        aVar.createAllTables(frameworkSQLiteDatabase);
    }
}
