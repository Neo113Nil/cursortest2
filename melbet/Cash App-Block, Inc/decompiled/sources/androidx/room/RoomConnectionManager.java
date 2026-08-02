package androidx.room;

import android.content.Context;
import android.content.Intent;
import androidx.collection.internal.LruHashMap;
import androidx.paging.CachedPageEventFlow$$ExternalSyntheticLambda0;
import androidx.room.RoomDatabase;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.ConnectionPoolImpl;
import androidx.room.coroutines.ConnectionPoolKt;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.driver.SupportSQLiteConnectionPool;
import androidx.room.migration.Migration;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Extras;
import coil3.svg.internal.AndroidSvg;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.util.Strings;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.Cache;
import okhttp3.internal.connection.Exchange;
import org.intellij.markdown.MarkdownElementType;

/* loaded from: classes.dex */
public final class RoomConnectionManager {
    public final List callbacks;
    public final DatabaseConfiguration configuration;
    public final ConnectionPool connectionPool;
    public boolean isConfigured;
    public boolean isInitializing;
    public final RoomOpenDelegate openDelegate;
    public SupportSQLiteDatabase supportDatabase;

    /* loaded from: classes3.dex */
    public final class NoOpOpenDelegate extends RoomOpenDelegate {
        public NoOpOpenDelegate() {
            super(-1, "", "");
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void createAllTables(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void dropAllTables(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void onCreate(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void onOpen(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void onPostMigrate(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public final void onPreMigrate(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }

        @Override // androidx.room.RoomOpenDelegate
        public final MarkdownElementType onValidateSchema(SQLiteConnection sQLiteConnection) {
            sQLiteConnection.getClass();
            throw new IllegalStateException("NOP delegate should never be called");
        }
    }

    public final class SupportOpenHelperCallback extends SupportSQLiteOpenHelper.Callback {
        public SupportOpenHelperCallback(int i) {
            super(i);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onCreate(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            RoomConnectionManager.this.onCreate(new SupportSQLiteConnection(frameworkSQLiteDatabase));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onDowngrade(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
            onUpgrade(frameworkSQLiteDatabase, i, i2);
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onOpen(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            SupportSQLiteConnection supportSQLiteConnection = new SupportSQLiteConnection(frameworkSQLiteDatabase);
            RoomConnectionManager roomConnectionManager = RoomConnectionManager.this;
            roomConnectionManager.onOpen(supportSQLiteConnection);
            roomConnectionManager.supportDatabase = frameworkSQLiteDatabase;
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onUpgrade(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
            RoomConnectionManager.this.onMigrate(new SupportSQLiteConnection(frameworkSQLiteDatabase), i, i2);
        }
    }

    public RoomConnectionManager(DatabaseConfiguration databaseConfiguration, CashApp$$ExternalSyntheticLambda2 cashApp$$ExternalSyntheticLambda2) {
        databaseConfiguration.getClass();
        RoomDatabase.JournalMode journalMode = databaseConfiguration.journalMode;
        this.configuration = databaseConfiguration;
        this.openDelegate = new NoOpOpenDelegate();
        List list = databaseConfiguration.callbacks;
        this.callbacks = list == null ? EmptyList.INSTANCE : list;
        final CachedPageEventFlow$$ExternalSyntheticLambda0 cachedPageEventFlow$$ExternalSyntheticLambda0 = new CachedPageEventFlow$$ExternalSyntheticLambda0(this, 15);
        ArrayList plus = CollectionsKt.plus((Collection) (list == null ? EmptyList.INSTANCE : list), (Object) new RoomDatabase.Callback() { // from class: androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            @Override // androidx.room.RoomDatabase.Callback
            public final void onOpen(SupportSQLiteDatabase supportSQLiteDatabase) {
                supportSQLiteDatabase.getClass();
                CachedPageEventFlow$$ExternalSyntheticLambda0.this.invoke(supportSQLiteDatabase);
            }
        });
        Context context = databaseConfiguration.context;
        String str = databaseConfiguration.name;
        SupportSQLiteOpenHelper.Factory factory = databaseConfiguration.sqliteOpenHelperFactory;
        LruHashMap lruHashMap = databaseConfiguration.migrationContainer;
        boolean z = databaseConfiguration.allowMainThreadQueries;
        Executor executor = databaseConfiguration.queryExecutor;
        Executor executor2 = databaseConfiguration.transactionExecutor;
        Intent intent = databaseConfiguration.multiInstanceInvalidationServiceIntent;
        boolean z2 = databaseConfiguration.requireMigration;
        boolean z3 = databaseConfiguration.allowDestructiveMigrationOnDowngrade;
        Set set = databaseConfiguration.migrationNotRequiredFrom;
        String str2 = databaseConfiguration.copyFromAssetPath;
        File file = databaseConfiguration.copyFromFile;
        Callable callable = databaseConfiguration.copyFromInputStream;
        List list2 = databaseConfiguration.typeConverters;
        List list3 = databaseConfiguration.autoMigrationSpecs;
        boolean z4 = databaseConfiguration.allowDestructiveMigrationForAllTables;
        SQLiteDriver sQLiteDriver = databaseConfiguration.sqliteDriver;
        CoroutineContext coroutineContext = databaseConfiguration.queryCoroutineContext;
        context.getClass();
        lruHashMap.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        this.connectionPool = new SupportSQLiteConnectionPool(new Extras.Key((SupportSQLiteOpenHelper) cashApp$$ExternalSyntheticLambda2.invoke(new DatabaseConfiguration(context, str, factory, lruHashMap, plus, z, journalMode, executor, executor2, intent, z2, z3, set, str2, file, callable, list2, list3, z4, sQLiteDriver, coroutineContext))));
        boolean z5 = journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            supportOpenHelper$room_runtime_release.setWriteAheadLoggingEnabled(z5);
        }
    }

    public static final void access$configureDatabase(RoomConnectionManager roomConnectionManager, SQLiteConnection sQLiteConnection) {
        Object failure;
        RoomOpenDelegate roomOpenDelegate = roomConnectionManager.openDelegate;
        DatabaseConfiguration databaseConfiguration = roomConnectionManager.configuration;
        RoomDatabase.JournalMode journalMode = databaseConfiguration.journalMode;
        RoomDatabase.JournalMode journalMode2 = RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        if (journalMode == journalMode2) {
            Room.execSQL(sQLiteConnection, "PRAGMA journal_mode = WAL");
        } else {
            Room.execSQL(sQLiteConnection, "PRAGMA journal_mode = TRUNCATE");
        }
        if (databaseConfiguration.journalMode == journalMode2) {
            Room.execSQL(sQLiteConnection, "PRAGMA synchronous = NORMAL");
        } else {
            Room.execSQL(sQLiteConnection, "PRAGMA synchronous = FULL");
        }
        configureBusyTimeout(sQLiteConnection);
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA user_version");
        try {
            prepare.step();
            int i = (int) prepare.getLong(0);
            Cache.Companion.closeFinally(prepare, null);
            int i2 = roomOpenDelegate.version;
            if (i != i2) {
                Room.execSQL(sQLiteConnection, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    Result.Companion companion = Result.Companion;
                    if (i == 0) {
                        roomConnectionManager.onCreate(sQLiteConnection);
                    } else {
                        roomConnectionManager.onMigrate(sQLiteConnection, i, i2);
                    }
                    Room.execSQL(sQLiteConnection, "PRAGMA user_version = " + i2);
                    failure = Unit.INSTANCE;
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.Companion;
                    failure = new Result.Failure(th);
                }
                if (!(failure instanceof Result.Failure)) {
                    Room.execSQL(sQLiteConnection, "END TRANSACTION");
                }
                Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                if (m4120exceptionOrNullimpl != null) {
                    Room.execSQL(sQLiteConnection, "ROLLBACK TRANSACTION");
                    throw m4120exceptionOrNullimpl;
                }
            }
            roomConnectionManager.onOpen(sQLiteConnection);
        } finally {
        }
    }

    public static void configureBusyTimeout(SQLiteConnection sQLiteConnection) {
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA busy_timeout");
        try {
            prepare.step();
            long j = prepare.getLong(0);
            Cache.Companion.closeFinally(prepare, null);
            if (j < 3000) {
                Room.execSQL(sQLiteConnection, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                Cache.Companion.closeFinally(prepare, th);
                throw th2;
            }
        }
    }

    public final SupportSQLiteOpenHelper getSupportOpenHelper$room_runtime_release() {
        ConnectionPool connectionPool = this.connectionPool;
        SupportSQLiteConnectionPool supportSQLiteConnectionPool = connectionPool instanceof SupportSQLiteConnectionPool ? (SupportSQLiteConnectionPool) connectionPool : null;
        if (supportSQLiteConnectionPool != null) {
            return (SupportSQLiteOpenHelper) supportSQLiteConnectionPool.supportDriver.f61default;
        }
        return null;
    }

    public final void onCreate(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (prepare.step()) {
                if (prepare.getLong(0) == 0) {
                    z = true;
                }
            }
            Cache.Companion.closeFinally(prepare, null);
            RoomOpenDelegate roomOpenDelegate = this.openDelegate;
            roomOpenDelegate.createAllTables(sQLiteConnection);
            if (!z) {
                MarkdownElementType onValidateSchema = roomOpenDelegate.onValidateSchema(sQLiteConnection);
                if (!onValidateSchema.isToken) {
                    a$$ExternalSyntheticBUOutline0.m(onValidateSchema.name, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            Room.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            Room.execSQL(sQLiteConnection, CoroutinesRoom.createInsertQuery(roomOpenDelegate.identityHash));
            roomOpenDelegate.onCreate(sQLiteConnection);
            Iterator it = this.callbacks.iterator();
            while (it.hasNext()) {
                ((RoomDatabase.Callback) it.next()).getClass();
                if (sQLiteConnection instanceof SupportSQLiteConnection) {
                    ((SupportSQLiteConnection) sQLiteConnection).db.getClass();
                }
            }
        } finally {
        }
    }

    public final void onMigrate(SQLiteConnection sQLiteConnection, int i, int i2) {
        sQLiteConnection.getClass();
        DatabaseConfiguration databaseConfiguration = this.configuration;
        List findMigrationPath = Strings.findMigrationPath(databaseConfiguration.migrationContainer, i, i2);
        RoomOpenDelegate roomOpenDelegate = this.openDelegate;
        if (findMigrationPath != null) {
            roomOpenDelegate.onPreMigrate(sQLiteConnection);
            Iterator it = findMigrationPath.iterator();
            while (it.hasNext()) {
                ((Migration) it.next()).migrate(sQLiteConnection);
            }
            MarkdownElementType onValidateSchema = roomOpenDelegate.onValidateSchema(sQLiteConnection);
            if (!onValidateSchema.isToken) {
                a$$ExternalSyntheticBUOutline0.m(onValidateSchema.name, "Migration didn't properly handle: ");
                return;
            }
            roomOpenDelegate.onPostMigrate(sQLiteConnection);
            Room.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            Room.execSQL(sQLiteConnection, CoroutinesRoom.createInsertQuery(roomOpenDelegate.identityHash));
            return;
        }
        if (Strings.isMigrationRequired(databaseConfiguration, i, i2)) {
            throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
        }
        if (databaseConfiguration.allowDestructiveMigrationForAllTables) {
            SQLiteStatement prepare = sQLiteConnection.prepare("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
            try {
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                while (prepare.step()) {
                    String text = prepare.getText(0);
                    if (!StringsKt__StringsJVMKt.startsWith(text, "sqlite_", false) && !text.equals("android_metadata")) {
                        createListBuilder.add(new Pair(text, Boolean.valueOf(Intrinsics.areEqual(prepare.getText(1), "view"))));
                    }
                }
                ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                Cache.Companion.closeFinally(prepare, null);
                ListIterator listIterator = build.listIterator(0);
                while (true) {
                    ListBuilder.Itr itr = (ListBuilder.Itr) listIterator;
                    if (!itr.hasNext()) {
                        break;
                    }
                    Pair pair = (Pair) itr.next();
                    String str = (String) pair.first;
                    if (((Boolean) pair.second).booleanValue()) {
                        Room.execSQL(sQLiteConnection, "DROP VIEW IF EXISTS " + str);
                    } else {
                        Room.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS " + str);
                    }
                }
            } finally {
            }
        } else {
            roomOpenDelegate.dropAllTables(sQLiteConnection);
        }
        Iterator it2 = this.callbacks.iterator();
        while (it2.hasNext()) {
            ((RoomDatabase.Callback) it2.next()).getClass();
            if (sQLiteConnection instanceof SupportSQLiteConnection) {
                ((SupportSQLiteConnection) sQLiteConnection).db.getClass();
            }
        }
        roomOpenDelegate.createAllTables(sQLiteConnection);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onOpen(SQLiteConnection sQLiteConnection) {
        boolean z;
        Object failure;
        MarkdownElementType onValidateSchema;
        sQLiteConnection.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (prepare.step()) {
                if (prepare.getLong(0) != 0) {
                    z = true;
                    Cache.Companion.closeFinally(prepare, null);
                    RoomOpenDelegate roomOpenDelegate = this.openDelegate;
                    if (z) {
                        Room.execSQL(sQLiteConnection, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                            Result.Companion companion = Result.Companion;
                            onValidateSchema = roomOpenDelegate.onValidateSchema(sQLiteConnection);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        if (!onValidateSchema.isToken) {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + onValidateSchema.name).toString());
                        }
                        roomOpenDelegate.onPostMigrate(sQLiteConnection);
                        Room.execSQL(sQLiteConnection, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                        Room.execSQL(sQLiteConnection, CoroutinesRoom.createInsertQuery(roomOpenDelegate.identityHash));
                        failure = Unit.INSTANCE;
                        if (!(failure instanceof Result.Failure)) {
                            Room.execSQL(sQLiteConnection, "END TRANSACTION");
                        }
                        Throwable m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(failure);
                        if (m4120exceptionOrNullimpl != null) {
                            Room.execSQL(sQLiteConnection, "ROLLBACK TRANSACTION");
                            throw m4120exceptionOrNullimpl;
                        }
                    } else {
                        prepare = sQLiteConnection.prepare("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            String text = prepare.step() ? prepare.getText(0) : null;
                            Cache.Companion.closeFinally(prepare, null);
                            if (!roomOpenDelegate.identityHash.equals(text) && !roomOpenDelegate.legacyIdentityHash.equals(text)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + roomOpenDelegate.identityHash + ", found: " + text).toString());
                            }
                        } finally {
                        }
                    }
                    roomOpenDelegate.onOpen(sQLiteConnection);
                    for (RoomDatabase.Callback callback : this.callbacks) {
                        callback.getClass();
                        if (sQLiteConnection instanceof SupportSQLiteConnection) {
                            callback.onOpen(((SupportSQLiteConnection) sQLiteConnection).db);
                        }
                    }
                    this.isConfigured = true;
                }
            }
            z = false;
            Cache.Companion.closeFinally(prepare, null);
            RoomOpenDelegate roomOpenDelegate2 = this.openDelegate;
            if (z) {
            }
            roomOpenDelegate2.onOpen(sQLiteConnection);
            while (r0.hasNext()) {
            }
            this.isConfigured = true;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public RoomConnectionManager(DatabaseConfiguration databaseConfiguration, RoomOpenDelegate roomOpenDelegate) {
        int i;
        ConnectionPoolImpl newConnectionPool;
        databaseConfiguration.getClass();
        this.configuration = databaseConfiguration;
        this.openDelegate = roomOpenDelegate;
        List list = databaseConfiguration.callbacks;
        RoomDatabase.JournalMode journalMode = databaseConfiguration.journalMode;
        SupportSQLiteOpenHelper.Factory factory = databaseConfiguration.sqliteOpenHelperFactory;
        String str = databaseConfiguration.name;
        this.callbacks = list == null ? EmptyList.INSTANCE : list;
        SQLiteDriver sQLiteDriver = databaseConfiguration.sqliteDriver;
        if (sQLiteDriver != null) {
            if (str == null) {
                newConnectionPool = ConnectionPoolKt.newSingleConnectionPool(new AndroidSvg(this, sQLiteDriver));
            } else {
                AndroidSvg androidSvg = new AndroidSvg(this, sQLiteDriver);
                int ordinal = journalMode.ordinal();
                if (ordinal == 1) {
                    i = 1;
                } else {
                    if (ordinal != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1(journalMode, "Can't get max number of reader for journal mode '");
                        throw null;
                    }
                    i = 4;
                }
                int ordinal2 = journalMode.ordinal();
                if (ordinal2 != 1 && ordinal2 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1(journalMode, "Can't get max number of writers for journal mode '");
                    throw null;
                }
                newConnectionPool = ConnectionPoolKt.newConnectionPool(androidSvg, str, i);
            }
            this.connectionPool = newConnectionPool;
        } else if (factory != null) {
            Context context = databaseConfiguration.context;
            context.getClass();
            this.connectionPool = new SupportSQLiteConnectionPool(new Extras.Key(factory.create(new Exchange(context, str, new SupportOpenHelperCallback(roomOpenDelegate.version), false, false))));
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("SQLiteManager was constructed with both null driver and open helper factory!");
            throw null;
        }
        boolean z = journalMode == RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING;
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            supportOpenHelper$room_runtime_release.setWriteAheadLoggingEnabled(z);
        }
    }
}
