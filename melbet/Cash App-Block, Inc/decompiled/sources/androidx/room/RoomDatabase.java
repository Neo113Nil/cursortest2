package androidx.room;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.arch.core.executor.ArchTaskExecutor$$ExternalSyntheticLambda0;
import androidx.camera.video.VideoEncoderSession;
import androidx.collection.internal.LruHashMap;
import androidx.compose.runtime.Latch;
import androidx.room.concurrent.CloseBarrier;
import androidx.room.driver.SupportSQLiteConnection;
import androidx.room.migration.Migration;
import androidx.room.support.AutoCloser;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.room.support.PrePackagedCopyOpenHelper;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.tracing.Trace;
import app.cash.zipline.CallResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.dynamite.zzf;
import com.squareup.cash.CashApp$$ExternalSyntheticLambda2;
import com.squareup.cash.CashApp$onCreate$4$1$1;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Deprecated;
import kotlin.NotImplementedError;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptyMap;
import kotlin.collections.EmptySet;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt__StringsJVMKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DispatcherExecutor;
import kotlinx.coroutines.ExecutorCoroutineDispatcher;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorJobImpl;
import kotlinx.coroutines.internal.ContextScope;
import okhttp3.Cache;
import okio.Path$$ExternalSyntheticBUOutline0;
import papa.PapaEvent;

/* loaded from: classes.dex */
public abstract class RoomDatabase {
    public static final Companion Companion = new Companion();
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;
    private AutoCloser autoCloser;
    private RoomConnectionManager connectionManager;
    private CoroutineScope coroutineScope;
    private Executor internalQueryExecutor;
    private InvalidationTracker internalTracker;
    private Executor internalTransactionExecutor;
    protected List<? extends Callback> mCallbacks;
    protected volatile SupportSQLiteDatabase mDatabase;
    private CoroutineContext transactionContext;
    private final CloseBarrier closeBarrier = new CloseBarrier(new RoomDatabase$closeBarrier$1(0, this, RoomDatabase.class, "onClosed", "onClosed()V", 0, 0));
    private final ThreadLocal<Integer> suspendingTransactionId = new ThreadLocal<>();
    private final Map<KClass, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    public final class Builder {
        public boolean allowDestructiveMigrationForAllTables;
        public boolean allowDestructiveMigrationOnDowngrade;
        public boolean allowMainThreadQueries;
        public final long autoCloseTimeout;
        public final ArrayList autoMigrationSpecs;
        public final ArrayList callbacks;
        public final Context context;
        public final boolean inMemoryTrackingTableMode;
        public final JournalMode journalMode;
        public final KClass klass;
        public final LruHashMap migrationContainer;
        public final LinkedHashSet migrationStartAndEndVersions;
        public final LinkedHashSet migrationsNotRequiredFrom;
        public final String name;
        public Executor queryExecutor;
        public boolean requireMigration;
        public OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0 supportOpenHelperFactory;
        public Executor transactionExecutor;
        public final ArrayList typeConverters;

        public Builder(Context context, Class cls, String str) {
            context.getClass();
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new LruHashMap(1);
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = Reflection.factory.getOrCreateKotlinClass(cls);
            this.context = context;
            this.name = str;
        }

        public final void addMigrations(Migration... migrationArr) {
            for (Migration migration : migrationArr) {
                Integer valueOf = Integer.valueOf(migration.startVersion);
                LinkedHashSet linkedHashSet = this.migrationStartAndEndVersions;
                linkedHashSet.add(valueOf);
                linkedHashSet.add(Integer.valueOf(migration.endVersion));
            }
            Migration[] migrationArr2 = (Migration[]) Arrays.copyOf(migrationArr, migrationArr.length);
            LruHashMap lruHashMap = this.migrationContainer;
            lruHashMap.getClass();
            for (Migration migration2 : migrationArr2) {
                lruHashMap.addMigration(migration2);
            }
        }

        public final RoomDatabase build() {
            String str;
            RoomDatabase roomDatabase;
            String str2;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                ArchTaskExecutor$$ExternalSyntheticLambda0 archTaskExecutor$$ExternalSyntheticLambda0 = ArchTaskExecutor.sIOThreadExecutor;
                this.transactionExecutor = archTaskExecutor$$ExternalSyntheticLambda0;
                this.queryExecutor = archTaskExecutor$$ExternalSyntheticLambda0;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            LinkedHashSet linkedHashSet = this.migrationStartAndEndVersions;
            linkedHashSet.getClass();
            LinkedHashSet linkedHashSet2 = this.migrationsNotRequiredFrom;
            linkedHashSet2.getClass();
            if (!linkedHashSet.isEmpty()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    int intValue = ((Number) it.next()).intValue();
                    if (linkedHashSet2.contains(Integer.valueOf(intValue))) {
                        Path$$ExternalSyntheticBUOutline0.m$1((Object) JsonLogicResult$Success$$ExternalSyntheticOutline0.m(intValue, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
                        return null;
                    }
                }
            }
            SupportSQLiteOpenHelper.Factory factory = this.supportOpenHelperFactory;
            if (factory == null) {
                factory = new zzf(8);
            }
            SupportSQLiteOpenHelper.Factory factory2 = factory;
            if (this.autoCloseTimeout > 0) {
                if (this.name != null) {
                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                    return null;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Cannot create auto-closing database for an in-memory database.");
                return null;
            }
            boolean z = this.allowMainThreadQueries;
            JournalMode journalMode = this.journalMode;
            journalMode.getClass();
            Context context = this.context;
            context.getClass();
            if (journalMode == JournalMode.AUTOMATIC) {
                Object systemService = context.getSystemService("activity");
                ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
                journalMode = (activityManager == null || activityManager.isLowRamDevice()) ? JournalMode.TRUNCATE : JournalMode.WRITE_AHEAD_LOGGING;
            }
            Executor executor2 = this.queryExecutor;
            if (executor2 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            Executor executor3 = this.transactionExecutor;
            if (executor3 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                return null;
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, this.name, factory2, this.migrationContainer, this.callbacks, z, journalMode, executor2, executor3, null, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, linkedHashSet2, null, null, null, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, null, null);
            databaseConfiguration.useTempTrackingTable = this.inMemoryTrackingTableMode;
            Class javaClass = PapaEvent.getJavaClass(this.klass);
            Package r0 = javaClass.getPackage();
            if (r0 == null || (str = r0.getName()) == null) {
                str = "";
            }
            String canonicalName = javaClass.getCanonicalName();
            canonicalName.getClass();
            if (str.length() != 0) {
                canonicalName = canonicalName.substring(str.length() + 1);
            }
            String concat = StringsKt__StringsJVMKt.replace(canonicalName, '.', '_', false).concat("_Impl");
            try {
                try {
                    if (str.length() == 0) {
                        str2 = concat;
                    } else {
                        str2 = str + '.' + concat;
                    }
                    Class<?> cls = Class.forName(str2, true, javaClass.getClassLoader());
                    cls.getClass();
                    roomDatabase = null;
                    try {
                        RoomDatabase roomDatabase2 = (RoomDatabase) cls.getDeclaredConstructor(null).newInstance(null);
                        roomDatabase2.init(databaseConfiguration);
                        return roomDatabase2;
                    } catch (IllegalAccessException e) {
                        e = e;
                        a$$ExternalSyntheticBUOutline0.m("Cannot access the constructor ", (Object) javaClass.getCanonicalName(), (Throwable) e);
                        return roomDatabase;
                    } catch (InstantiationException e2) {
                        e = e2;
                        a$$ExternalSyntheticBUOutline0.m("Failed to create an instance of ", (Object) javaClass.getCanonicalName(), (Throwable) e);
                        return roomDatabase;
                    }
                } catch (ClassNotFoundException e3) {
                    throw new RuntimeException("Cannot find implementation for " + javaClass.getCanonicalName() + ". " + concat + " does not exist. Is Room annotation processor correctly configured?", e3);
                }
            } catch (IllegalAccessException e4) {
                e = e4;
                roomDatabase = null;
            } catch (InstantiationException e5) {
                e = e5;
                roomDatabase = null;
            }
        }
    }

    public abstract class Callback {
        public abstract void onOpen(SupportSQLiteDatabase supportSQLiteDatabase);
    }

    public final class Companion {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class JournalMode {
        public static final /* synthetic */ JournalMode[] $VALUES;
        public static final JournalMode AUTOMATIC;
        public static final JournalMode TRUNCATE;
        public static final JournalMode WRITE_AHEAD_LOGGING;

        static {
            JournalMode journalMode = new JournalMode("AUTOMATIC", 0);
            AUTOMATIC = journalMode;
            JournalMode journalMode2 = new JournalMode("TRUNCATE", 1);
            TRUNCATE = journalMode2;
            JournalMode journalMode3 = new JournalMode("WRITE_AHEAD_LOGGING", 2);
            WRITE_AHEAD_LOGGING = journalMode3;
            $VALUES = new JournalMode[]{journalMode, journalMode2, journalMode3};
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) $VALUES.clone();
        }
    }

    public static final void access$onClosed(RoomDatabase roomDatabase) {
        CoroutineScope coroutineScope = roomDatabase.coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            throw null;
        }
        JobKt.cancel(coroutineScope, (CancellationException) null);
        VideoEncoderSession videoEncoderSession = roomDatabase.getInvalidationTracker().multiInstanceInvalidationClient;
        if (videoEncoderSession != null) {
            videoEncoderSession.stop();
        }
        RoomConnectionManager roomConnectionManager = roomDatabase.connectionManager;
        if (roomConnectionManager != null) {
            roomConnectionManager.connectionPool.close();
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            throw null;
        }
    }

    @Deprecated
    public static /* synthetic */ void getMCallbacks$annotations() {
    }

    @Deprecated
    public static /* synthetic */ void getMDatabase$annotations() {
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i, Object obj) {
        if (obj != null) {
            a$$ExternalSyntheticBUOutline0.m("Super calls with default arguments not supported in this target, function: query");
            return null;
        }
        if ((i & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    public final void addTypeConverter$room_runtime_release(KClass kClass, Object obj) {
        kClass.getClass();
        obj.getClass();
        this.typeConverters.put(kClass, obj);
    }

    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime_release()) {
            a$$ExternalSyntheticBUOutline0.m$1("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void assertNotSuspendingTransaction() {
        if (!inCompatibilityMode$room_runtime_release() || inTransaction() || this.suspendingTransactionId.get() == null) {
            return;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot access database on a different coroutine context inherited from a suspending transaction.");
    }

    @Deprecated
    public void beginTransaction() {
        assertNotMainThread();
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            InvalidationTracker invalidationTracker = getInvalidationTracker();
            invalidationTracker.getClass();
            Trace.runBlockingUninterruptible(new CashApp$onCreate$4$1$1(invalidationTracker, null, 4));
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    public abstract void clearAllTables();

    public void close() {
        CloseBarrier closeBarrier = this.closeBarrier;
        synchronized (closeBarrier) {
            if (closeBarrier.closeInitiated.compareAndSet(false, true)) {
                while (closeBarrier.blockers.get() != 0) {
                }
                closeBarrier.closeAction.invoke();
            }
        }
    }

    public SupportSQLiteStatement compileStatement(String str) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(str);
    }

    public List<Migration> createAutoMigrations(Map<KClass, Object> map) {
        map.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt__MapsJVMKt.mapCapacity(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(PapaEvent.getJavaClass((KClass) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    public final RoomConnectionManager createConnectionManager$room_runtime_release(DatabaseConfiguration databaseConfiguration) {
        RoomOpenDelegate roomOpenDelegate;
        databaseConfiguration.getClass();
        try {
            RoomOpenDelegateMarker createOpenDelegate = createOpenDelegate();
            createOpenDelegate.getClass();
            roomOpenDelegate = (RoomOpenDelegate) createOpenDelegate;
        } catch (NotImplementedError unused) {
            roomOpenDelegate = null;
        }
        return roomOpenDelegate == null ? new RoomConnectionManager(databaseConfiguration, new CashApp$$ExternalSyntheticLambda2(this, 17)) : new RoomConnectionManager(databaseConfiguration, roomOpenDelegate);
    }

    public abstract InvalidationTracker createInvalidationTracker();

    public RoomOpenDelegateMarker createOpenDelegate() {
        throw new NotImplementedError(null, 1, null);
    }

    @Deprecated
    public SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration databaseConfiguration) {
        databaseConfiguration.getClass();
        throw new NotImplementedError(null, 1, null);
    }

    @Deprecated
    public void endTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        InvalidationTracker invalidationTracker = getInvalidationTracker();
        invalidationTracker.implementation.refreshInvalidationAsync$room_runtime_release(invalidationTracker.onRefreshScheduled, invalidationTracker.onRefreshCompleted);
    }

    @Deprecated
    public List<Migration> getAutoMigrations(Map<Class<Object>, Object> map) {
        map.getClass();
        return EmptyList.INSTANCE;
    }

    public final CloseBarrier getCloseBarrier$room_runtime_release() {
        return this.closeBarrier;
    }

    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        throw null;
    }

    public InvalidationTracker getInvalidationTracker() {
        InvalidationTracker invalidationTracker = this.internalTracker;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTracker");
        throw null;
    }

    public SupportSQLiteOpenHelper getOpenHelper() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            throw null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = roomConnectionManager.getSupportOpenHelper$room_runtime_release();
        if (supportOpenHelper$room_runtime_release != null) {
            return supportOpenHelper$room_runtime_release;
        }
        a$$ExternalSyntheticBUOutline0.m$1("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
        return null;
    }

    public final CoroutineContext getQueryContext() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope.getCoroutineContext();
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        throw null;
    }

    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        throw null;
    }

    public Set<KClass> getRequiredAutoMigrationSpecClasses() {
        Set<Class<Object>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(PapaEvent.getKotlinClass((Class) it.next()));
        }
        return CollectionsKt.toSet(arrayList);
    }

    @Deprecated
    public Set<Class<Object>> getRequiredAutoMigrationSpecs() {
        return EmptySet.INSTANCE;
    }

    public Map<KClass, List<KClass>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> entrySet = getRequiredTypeConverters().entrySet();
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            KClass kotlinClass = PapaEvent.getKotlinClass(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(PapaEvent.getKotlinClass((Class) it2.next()));
            }
            linkedHashMap.put(kotlinClass, arrayList);
        }
        return linkedHashMap;
    }

    public final Map<KClass, List<KClass>> getRequiredTypeConverterClassesMap$room_runtime_release() {
        return getRequiredTypeConverterClasses();
    }

    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        return emptyMap;
    }

    public final ThreadLocal<Integer> getSuspendingTransactionId() {
        return this.suspendingTransactionId;
    }

    public final CoroutineContext getTransactionContext$room_runtime_release() {
        CoroutineContext coroutineContext = this.transactionContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionContext");
        throw null;
    }

    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        throw null;
    }

    @Deprecated
    public <T> T getTypeConverter(Class<T> cls) {
        cls.getClass();
        return (T) this.typeConverters.get(Reflection.factory.getOrCreateKotlinClass(cls));
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
        return this.useTempTrackingTable;
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager != null) {
            return roomConnectionManager.getSupportOpenHelper$room_runtime_release() != null;
        }
        Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
        throw null;
    }

    public boolean inTransaction() {
        return isOpenInternal() && getOpenHelper().getWritableDatabase().inTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x008d, code lost:
    
        bo.app.a$$ExternalSyntheticBUOutline0.m$3("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0092, code lost:
    
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0282  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void init(DatabaseConfiguration databaseConfiguration) {
        RoomConnectionManager roomConnectionManager;
        Executor dispatcherExecutor;
        CoroutineContext coroutineContext;
        int i;
        databaseConfiguration.getClass();
        boolean z = databaseConfiguration.useTempTrackingTable;
        String str = databaseConfiguration.name;
        Intent intent = databaseConfiguration.multiInstanceInvalidationServiceIntent;
        CoroutineContext coroutineContext2 = databaseConfiguration.queryCoroutineContext;
        this.useTempTrackingTable = z;
        this.connectionManager = createConnectionManager$room_runtime_release(databaseConfiguration);
        this.internalTracker = createInvalidationTracker();
        List list = databaseConfiguration.autoMigrationSpecs;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Set<KClass> requiredAutoMigrationSpecClasses = getRequiredAutoMigrationSpecClasses();
        int size = requiredAutoMigrationSpecClasses.size();
        boolean[] zArr = new boolean[size];
        Iterator<KClass> it = requiredAutoMigrationSpecClasses.iterator();
        while (true) {
            int i2 = -1;
            if (it.hasNext()) {
                KClass next = it.next();
                int size2 = list.size() - 1;
                if (size2 >= 0) {
                    while (true) {
                        int i3 = size2 - 1;
                        if (next.isInstance(list.get(size2))) {
                            zArr[size2] = true;
                            i2 = size2;
                            break;
                        } else if (i3 < 0) {
                            break;
                        } else {
                            size2 = i3;
                        }
                    }
                }
                if (i2 < 0) {
                    a$$ExternalSyntheticBUOutline0.m("A required auto migration spec (", next.getQualifiedName(), ") is missing in the database configuration.");
                    return;
                }
                linkedHashMap.put(next, list.get(i2));
            } else {
                LruHashMap lruHashMap = databaseConfiguration.migrationContainer;
                int size3 = list.size() - 1;
                if (size3 >= 0) {
                    while (true) {
                        int i4 = size3 - 1;
                        if (size3 >= size || !zArr[size3]) {
                            break;
                        } else if (i4 < 0) {
                            break;
                        } else {
                            size3 = i4;
                        }
                    }
                }
                Iterator<Migration> it2 = createAutoMigrations(linkedHashMap).iterator();
                while (true) {
                    boolean z2 = false;
                    if (!it2.hasNext()) {
                        break;
                    }
                    Migration next2 = it2.next();
                    int i5 = next2.startVersion;
                    int i6 = next2.endVersion;
                    LinkedHashMap linkedHashMap2 = lruHashMap.map;
                    if (linkedHashMap2.containsKey(Integer.valueOf(i5))) {
                        Map map = (Map) linkedHashMap2.get(Integer.valueOf(i5));
                        if (map == null) {
                            map = EmptyMap.INSTANCE;
                            map.getClass();
                        }
                        z2 = map.containsKey(Integer.valueOf(i6));
                    }
                    if (!z2) {
                        lruHashMap.addMigration(next2);
                    }
                }
                List list2 = databaseConfiguration.typeConverters;
                Map<KClass, List<KClass>> requiredTypeConverterClassesMap$room_runtime_release = getRequiredTypeConverterClassesMap$room_runtime_release();
                boolean[] zArr2 = new boolean[requiredTypeConverterClassesMap$room_runtime_release.size()];
                for (Map.Entry<KClass, List<KClass>> entry : requiredTypeConverterClassesMap$room_runtime_release.entrySet()) {
                    KClass key = entry.getKey();
                    for (KClass kClass : entry.getValue()) {
                        int size4 = list2.size() + i2;
                        if (size4 >= 0) {
                            while (true) {
                                int i7 = size4 - 1;
                                i = i2;
                                if (kClass.isInstance(list2.get(size4))) {
                                    zArr2[size4] = true;
                                    break;
                                } else {
                                    if (i7 < 0) {
                                        break;
                                    }
                                    size4 = i7;
                                    i2 = i;
                                }
                            }
                        } else {
                            i = i2;
                        }
                        size4 = i;
                        if (size4 < 0) {
                            a$$ExternalSyntheticBUOutline0.m(kClass.getQualifiedName(), ") for ", key.getQualifiedName(), " is missing in the database configuration.", "A required type converter (");
                            return;
                        } else {
                            addTypeConverter$room_runtime_release(kClass, list2.get(size4));
                            i2 = i;
                        }
                    }
                }
                int size5 = list2.size() - 1;
                if (size5 >= 0) {
                    while (true) {
                        int i8 = size5 - 1;
                        if (!zArr2[size5]) {
                            a$$ExternalSyntheticBUOutline0.m$3(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Unexpected type converter ", ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", list2.get(size5)));
                            return;
                        } else if (i8 < 0) {
                            break;
                        } else {
                            size5 = i8;
                        }
                    }
                }
                SupportSQLiteOpenHelper supportSQLiteOpenHelper = null;
                if (coroutineContext2 != null) {
                    CoroutineContext.Element element = coroutineContext2.get(ContinuationInterceptor.Key);
                    element.getClass();
                    CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) element;
                    ExecutorCoroutineDispatcher executorCoroutineDispatcher = coroutineDispatcher instanceof ExecutorCoroutineDispatcher ? (ExecutorCoroutineDispatcher) coroutineDispatcher : null;
                    if (executorCoroutineDispatcher == null || (dispatcherExecutor = executorCoroutineDispatcher.getExecutor()) == null) {
                        dispatcherExecutor = new DispatcherExecutor(coroutineDispatcher);
                    }
                    this.internalQueryExecutor = dispatcherExecutor;
                    this.internalTransactionExecutor = new TransactionExecutor(dispatcherExecutor, 0);
                    this.coroutineScope = JobKt.CoroutineScope(coroutineContext2.plus(new SupervisorJobImpl((Job) coroutineContext2.get(Job.Key.$$INSTANCE))));
                    boolean inCompatibilityMode$room_runtime_release = inCompatibilityMode$room_runtime_release();
                    CoroutineScope coroutineScope = this.coroutineScope;
                    if (inCompatibilityMode$room_runtime_release) {
                        if (coroutineScope == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                            throw null;
                        }
                        coroutineContext = coroutineScope.getCoroutineContext().plus(coroutineDispatcher.limitedParallelism(1));
                    } else {
                        if (coroutineScope == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                            throw null;
                        }
                        coroutineContext = coroutineScope.getCoroutineContext();
                    }
                    this.transactionContext = coroutineContext;
                } else {
                    this.internalQueryExecutor = databaseConfiguration.queryExecutor;
                    this.internalTransactionExecutor = new TransactionExecutor(databaseConfiguration.transactionExecutor, 0);
                    Executor executor = this.internalQueryExecutor;
                    if (executor == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                        throw null;
                    }
                    ContextScope CoroutineScope = JobKt.CoroutineScope(JobKt.from(executor).plus(JobKt.SupervisorJob$default()));
                    this.coroutineScope = CoroutineScope;
                    CoroutineContext coroutineContext3 = CoroutineScope.coroutineContext;
                    Executor executor2 = this.internalTransactionExecutor;
                    if (executor2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                        throw null;
                    }
                    this.transactionContext = coroutineContext3.plus(JobKt.from(executor2));
                }
                this.allowMainThreadQueries = databaseConfiguration.allowMainThreadQueries;
                RoomConnectionManager roomConnectionManager2 = this.connectionManager;
                if (roomConnectionManager2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
                    throw null;
                }
                SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release = roomConnectionManager2.getSupportOpenHelper$room_runtime_release();
                if (supportOpenHelper$room_runtime_release != null) {
                    while (!(supportOpenHelper$room_runtime_release instanceof PrePackagedCopyOpenHelper)) {
                        if (supportOpenHelper$room_runtime_release instanceof DelegatingOpenHelper) {
                            supportOpenHelper$room_runtime_release = ((DelegatingOpenHelper) supportOpenHelper$room_runtime_release).getDelegate();
                        }
                    }
                    roomConnectionManager = this.connectionManager;
                    if (roomConnectionManager != null) {
                        Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
                        throw null;
                    }
                    SupportSQLiteOpenHelper supportOpenHelper$room_runtime_release2 = roomConnectionManager.getSupportOpenHelper$room_runtime_release();
                    if (supportOpenHelper$room_runtime_release2 != null) {
                        while (true) {
                            if (supportOpenHelper$room_runtime_release2 instanceof AutoClosingRoomOpenHelper) {
                                supportSQLiteOpenHelper = supportOpenHelper$room_runtime_release2;
                                break;
                            } else if (!(supportOpenHelper$room_runtime_release2 instanceof DelegatingOpenHelper)) {
                                break;
                            } else {
                                supportOpenHelper$room_runtime_release2 = ((DelegatingOpenHelper) supportOpenHelper$room_runtime_release2).getDelegate();
                            }
                        }
                    }
                    if (intent != null) {
                        if (str == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                            return;
                        }
                        InvalidationTracker invalidationTracker = getInvalidationTracker();
                        Context context = databaseConfiguration.context;
                        invalidationTracker.getClass();
                        context.getClass();
                        invalidationTracker.multiInstanceInvalidationIntent = intent;
                        invalidationTracker.multiInstanceInvalidationClient = new VideoEncoderSession(context, str, invalidationTracker);
                        return;
                    }
                    return;
                }
                supportOpenHelper$room_runtime_release = null;
                roomConnectionManager = this.connectionManager;
                if (roomConnectionManager != null) {
                }
            }
        }
    }

    public final void internalInitInvalidationTracker(SQLiteConnection sQLiteConnection) {
        sQLiteConnection.getClass();
        InvalidationTracker invalidationTracker = getInvalidationTracker();
        invalidationTracker.getClass();
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = invalidationTracker.implementation;
        triggerBasedInvalidationTracker.getClass();
        SQLiteStatement prepare = sQLiteConnection.prepare("PRAGMA query_only");
        try {
            prepare.step();
            boolean z = prepare.getLong(0) != 0;
            Cache.Companion.closeFinally(prepare, null);
            if (!z) {
                Room.execSQL(sQLiteConnection, "PRAGMA temp_store = MEMORY");
                Room.execSQL(sQLiteConnection, "PRAGMA recursive_triggers = 1");
                Room.execSQL(sQLiteConnection, "DROP TABLE IF EXISTS room_table_modification_log");
                if (triggerBasedInvalidationTracker.useTempTable) {
                    Room.execSQL(sQLiteConnection, "CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                } else {
                    Room.execSQL(sQLiteConnection, StringsKt__StringsJVMKt.replace$default("CREATE TEMP TABLE IF NOT EXISTS room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)", "TEMP", ""));
                }
                Latch latch = triggerBasedInvalidationTracker.observedTableStates;
                ReentrantLock reentrantLock = (ReentrantLock) latch.lock;
                reentrantLock.lock();
                try {
                    latch._isOpen = true;
                } finally {
                    reentrantLock.unlock();
                }
            }
            synchronized (invalidationTracker.trackerLock) {
                try {
                    VideoEncoderSession videoEncoderSession = invalidationTracker.multiInstanceInvalidationClient;
                    if (videoEncoderSession != null) {
                        Intent intent = invalidationTracker.multiInstanceInvalidationIntent;
                        if (intent == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        videoEncoderSession.start(intent);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
        }
    }

    public final boolean isMainThread$room_runtime_release() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            throw null;
        }
        SupportSQLiteDatabase supportSQLiteDatabase = roomConnectionManager.supportDatabase;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    public final boolean isOpenInternal() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            throw null;
        }
        SupportSQLiteDatabase supportSQLiteDatabase = roomConnectionManager.supportDatabase;
        if (supportSQLiteDatabase != null) {
            return supportSQLiteDatabase.isOpen();
        }
        return false;
    }

    public final void performClear(boolean z, String... strArr) {
        strArr.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        Trace.runBlockingUninterruptible(new RoomDatabase$performClear$1(this, z, strArr, (Continuation) null, 0));
    }

    public Cursor query(SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal) {
        supportSQLiteQuery.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return cancellationSignal != null ? getOpenHelper().getWritableDatabase().query(supportSQLiteQuery, cancellationSignal) : getOpenHelper().getWritableDatabase().query(supportSQLiteQuery);
    }

    public <V> V runInTransaction(Callable<V> callable) {
        callable.getClass();
        beginTransaction();
        try {
            V call = callable.call();
            setTransactionSuccessful();
            return call;
        } finally {
            endTransaction();
        }
    }

    @Deprecated
    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean z) {
        this.useTempTrackingTable = z;
    }

    public final <R> Object useConnection$room_runtime_release(boolean z, Function2<? super Transactor, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super R> continuation) {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager != null) {
            return roomConnectionManager.connectionPool.useConnection(z, function2, continuation);
        }
        Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
        throw null;
    }

    public final <T> T getTypeConverter(KClass kClass) {
        kClass.getClass();
        T t = (T) this.typeConverters.get(kClass);
        t.getClass();
        return t;
    }

    public void runInTransaction(Runnable runnable) {
        runnable.getClass();
        beginTransaction();
        try {
            runnable.run();
            setTransactionSuccessful();
        } finally {
            endTransaction();
        }
    }

    public Cursor query(String str, Object[] objArr) {
        str.getClass();
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().query(new CallResult(str, objArr));
    }

    public final Cursor query(SupportSQLiteQuery supportSQLiteQuery) {
        supportSQLiteQuery.getClass();
        return query$default(this, supportSQLiteQuery, null, 2, null);
    }

    @Deprecated
    public void internalInitInvalidationTracker(SupportSQLiteDatabase supportSQLiteDatabase) {
        supportSQLiteDatabase.getClass();
        internalInitInvalidationTracker(new SupportSQLiteConnection(supportSQLiteDatabase));
    }
}
