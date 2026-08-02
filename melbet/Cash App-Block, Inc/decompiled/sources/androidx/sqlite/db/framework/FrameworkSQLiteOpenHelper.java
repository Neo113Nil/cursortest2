package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.TransactorKt;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import androidx.sqlite.util.ProcessLock;
import coil3.Extras;
import coil3.ImageLoader$Builder$$ExternalSyntheticLambda1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;

/* loaded from: classes.dex */
public final class FrameworkSQLiteOpenHelper implements SupportSQLiteOpenHelper {
    public final boolean allowDataLossOnRecovery;
    public final SupportSQLiteOpenHelper.Callback callback;
    public final Context context;
    public final Lazy lazyDelegate;
    public final String name;
    public final boolean useNoBackupDirectory;
    public boolean writeAheadLoggingEnabled;

    public final class OpenHelper extends SQLiteOpenHelper {
        public static final /* synthetic */ int $r8$clinit = 0;
        public final boolean allowDataLossOnRecovery;
        public final SupportSQLiteOpenHelper.Callback callback;
        public final Context context;
        public final Extras.Key dbRef;
        public final ProcessLock lock;
        public boolean migrated;
        public boolean opened;

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002¨\u0006\u0003"}, d2 = {"androidx/sqlite/db/framework/FrameworkSQLiteOpenHelper$OpenHelper$CallbackException", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "sqlite-framework"}, k = 1, mv = {2, 1, 0}, xi = 48)
        final class CallbackException extends RuntimeException {
            public final CallbackName callbackName;
            public final Throwable cause;

            public CallbackException(CallbackName callbackName, Throwable th) {
                super(th);
                this.callbackName = callbackName;
                this.cause = th;
            }

            @Override // java.lang.Throwable
            public final Throwable getCause() {
                return this.cause;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* loaded from: classes3.dex */
        public final class CallbackName {
            public static final /* synthetic */ CallbackName[] $VALUES;
            public static final CallbackName ON_CONFIGURE;
            public static final CallbackName ON_CREATE;
            public static final CallbackName ON_DOWNGRADE;
            public static final CallbackName ON_OPEN;
            public static final CallbackName ON_UPGRADE;

            static {
                CallbackName callbackName = new CallbackName("ON_CONFIGURE", 0);
                ON_CONFIGURE = callbackName;
                CallbackName callbackName2 = new CallbackName("ON_CREATE", 1);
                ON_CREATE = callbackName2;
                CallbackName callbackName3 = new CallbackName("ON_UPGRADE", 2);
                ON_UPGRADE = callbackName3;
                CallbackName callbackName4 = new CallbackName("ON_DOWNGRADE", 3);
                ON_DOWNGRADE = callbackName4;
                CallbackName callbackName5 = new CallbackName("ON_OPEN", 4);
                ON_OPEN = callbackName5;
                $VALUES = new CallbackName[]{callbackName, callbackName2, callbackName3, callbackName4, callbackName5};
            }

            public static CallbackName valueOf(String str) {
                return (CallbackName) Enum.valueOf(CallbackName.class, str);
            }

            public static CallbackName[] values() {
                return (CallbackName[]) $VALUES.clone();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public OpenHelper(Context context, String str, final Extras.Key key, final SupportSQLiteOpenHelper.Callback callback, boolean z) {
            super(context, str, null, callback.version, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper$OpenHelper$$ExternalSyntheticLambda1
                @Override // android.database.DatabaseErrorHandler
                public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                    int i = FrameworkSQLiteOpenHelper.OpenHelper.$r8$clinit;
                    sQLiteDatabase.getClass();
                    FrameworkSQLiteDatabase wrappedDb = TransactorKt.getWrappedDb(key, sQLiteDatabase);
                    SupportSQLiteOpenHelper.Callback.this.getClass();
                    Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + wrappedDb + ".path");
                    SQLiteDatabase sQLiteDatabase2 = wrappedDb.delegate;
                    if (!sQLiteDatabase2.isOpen()) {
                        String path = sQLiteDatabase2.getPath();
                        if (path != null) {
                            SupportSQLiteOpenHelper.Callback.deleteDatabaseFile(path);
                            return;
                        }
                        return;
                    }
                    List<Pair<String, String>> list = null;
                    try {
                        try {
                            list = sQLiteDatabase2.getAttachedDbs();
                        } finally {
                            if (list != null) {
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    Object obj = ((Pair) it.next()).second;
                                    obj.getClass();
                                    SupportSQLiteOpenHelper.Callback.deleteDatabaseFile((String) obj);
                                }
                            } else {
                                String path2 = sQLiteDatabase2.getPath();
                                if (path2 != null) {
                                    SupportSQLiteOpenHelper.Callback.deleteDatabaseFile(path2);
                                }
                            }
                        }
                    } catch (SQLiteException unused) {
                    }
                    try {
                        wrappedDb.close();
                    } catch (IOException unused2) {
                    }
                    if (list != null) {
                        return;
                    }
                }
            });
            context.getClass();
            callback.getClass();
            this.context = context;
            this.dbRef = key;
            this.callback = callback;
            this.allowDataLossOnRecovery = z;
            this.lock = new ProcessLock(str == null ? Boxes$$ExternalSyntheticOutline1.m() : str, context.getCacheDir(), false);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public final void close() {
            ProcessLock processLock = this.lock;
            try {
                processLock.lock(processLock.processLock);
                super.close();
                this.dbRef.f61default = null;
                this.opened = false;
            } finally {
                processLock.unlock();
            }
        }

        public final SupportSQLiteDatabase getSupportDatabase(boolean z) {
            ProcessLock processLock = this.lock;
            try {
                processLock.lock((this.opened || getDatabaseName() == null) ? false : true);
                this.migrated = false;
                SQLiteDatabase innerGetDatabase = innerGetDatabase(z);
                if (!this.migrated) {
                    FrameworkSQLiteDatabase wrappedDb = TransactorKt.getWrappedDb(this.dbRef, innerGetDatabase);
                    processLock.unlock();
                    return wrappedDb;
                }
                close();
                SupportSQLiteDatabase supportDatabase = getSupportDatabase(z);
                processLock.unlock();
                return supportDatabase;
            } catch (Throwable th) {
                processLock.unlock();
                throw th;
            }
        }

        public final SQLiteDatabase innerGetDatabase(boolean z) {
            SQLiteDatabase readableDatabase;
            SQLiteDatabase readableDatabase2;
            File parentFile;
            String databaseName = getDatabaseName();
            boolean z2 = this.opened;
            Context context = this.context;
            if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
                parentFile.mkdirs();
                if (!parentFile.isDirectory()) {
                    Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
                }
            }
            try {
                if (z) {
                    SQLiteDatabase writableDatabase = getWritableDatabase();
                    writableDatabase.getClass();
                    return writableDatabase;
                }
                SQLiteDatabase readableDatabase3 = getReadableDatabase();
                readableDatabase3.getClass();
                return readableDatabase3;
            } catch (Throwable unused) {
                try {
                    Thread.sleep(500L);
                } catch (InterruptedException unused2) {
                }
                try {
                    if (z) {
                        readableDatabase2 = getWritableDatabase();
                        readableDatabase2.getClass();
                    } else {
                        readableDatabase2 = getReadableDatabase();
                        readableDatabase2.getClass();
                    }
                    return readableDatabase2;
                } catch (Throwable th) {
                    th = th;
                    if (th instanceof CallbackException) {
                        CallbackException callbackException = (CallbackException) th;
                        int ordinal = callbackException.callbackName.ordinal();
                        th = callbackException.cause;
                        if (ordinal == 0 || ordinal == 1 || ordinal == 2 || ordinal == 3) {
                            throw th;
                        }
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (!(th instanceof SQLiteException)) {
                            throw th;
                        }
                    }
                    if (!(th instanceof SQLiteException) || databaseName == null || !this.allowDataLossOnRecovery) {
                        throw th;
                    }
                    context.deleteDatabase(databaseName);
                    try {
                        if (z) {
                            readableDatabase = getWritableDatabase();
                            readableDatabase.getClass();
                        } else {
                            readableDatabase = getReadableDatabase();
                            readableDatabase.getClass();
                        }
                        return readableDatabase;
                    } catch (CallbackException e) {
                        throw e.cause;
                    }
                }
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            boolean z = this.migrated;
            SupportSQLiteOpenHelper.Callback callback = this.callback;
            if (!z && callback.version != sQLiteDatabase.getVersion()) {
                sQLiteDatabase.setMaxSqlCacheSize(1);
            }
            try {
                callback.onConfigure(TransactorKt.getWrappedDb(this.dbRef, sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CONFIGURE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            try {
                this.callback.onCreate(TransactorKt.getWrappedDb(this.dbRef, sQLiteDatabase));
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_CREATE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.getClass();
            this.migrated = true;
            try {
                this.callback.onDowngrade(TransactorKt.getWrappedDb(this.dbRef, sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_DOWNGRADE, th);
            }
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onOpen(SQLiteDatabase sQLiteDatabase) {
            sQLiteDatabase.getClass();
            if (!this.migrated) {
                try {
                    this.callback.onOpen(TransactorKt.getWrappedDb(this.dbRef, sQLiteDatabase));
                } catch (Throwable th) {
                    throw new CallbackException(CallbackName.ON_OPEN, th);
                }
            }
            this.opened = true;
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
            sQLiteDatabase.getClass();
            this.migrated = true;
            try {
                this.callback.onUpgrade(TransactorKt.getWrappedDb(this.dbRef, sQLiteDatabase), i, i2);
            } catch (Throwable th) {
                throw new CallbackException(CallbackName.ON_UPGRADE, th);
            }
        }
    }

    public FrameworkSQLiteOpenHelper(Context context, String str, SupportSQLiteOpenHelper.Callback callback, boolean z, boolean z2) {
        context.getClass();
        callback.getClass();
        this.context = context;
        this.name = str;
        this.callback = callback;
        this.useNoBackupDirectory = z;
        this.allowDataLossOnRecovery = z2;
        this.lazyDelegate = LazyKt.lazy(new ImageLoader$Builder$$ExternalSyntheticLambda1(this, 19));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Lazy lazy = this.lazyDelegate;
        if (lazy.isInitialized()) {
            ((OpenHelper) lazy.getValue()).close();
        }
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final String getDatabaseName() {
        return this.name;
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final SupportSQLiteDatabase getWritableDatabase() {
        return ((OpenHelper) this.lazyDelegate.getValue()).getSupportDatabase(true);
    }

    @Override // androidx.sqlite.db.SupportSQLiteOpenHelper
    public final void setWriteAheadLoggingEnabled(boolean z) {
        Lazy lazy = this.lazyDelegate;
        if (lazy.isInitialized()) {
            ((OpenHelper) lazy.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.writeAheadLoggingEnabled = z;
    }
}
