package app.cash.sqldelight.driver.android;

import android.content.Context;
import androidx.compose.runtime.snapshots.SnapshotKt$$ExternalSyntheticLambda3;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.framework.FrameworkSQLiteDatabase;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelper;
import app.cash.sqldelight.Query;
import app.cash.sqldelight.TransactionCallbacks;
import app.cash.sqldelight.db.AfterVersion;
import app.cash.sqldelight.db.QueryResult;
import app.cash.sqldelight.db.SqlDriver;
import app.cash.sqldelight.db.SqlSchema;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry$Builder$$ExternalSyntheticLambda3;
import coil3.svg.SvgDecoder$$ExternalSyntheticLambda0;
import com.squareup.cash.clientsync.database.AndroidDatabaseFactory$createDriver$1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class AndroidSqliteDriver implements SqlDriver {
    public final Lazy database$delegate;
    public final LinkedHashMap listeners;
    public final SupportSQLiteOpenHelper openHelper;
    public final AndroidSqliteDriver$statements$1 statements;
    public final ThreadLocal transactions;

    public class Callback extends SupportSQLiteOpenHelper.Callback {
        public final AfterVersion[] callbacks;
        public final SqlSchema schema;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Callback(SqlSchema sqlSchema, AfterVersion... afterVersionArr) {
            super((int) sqlSchema.getVersion());
            if (sqlSchema.getVersion() <= 2147483647L) {
                this.schema = sqlSchema;
                this.callbacks = afterVersionArr;
            } else {
                throw new IllegalStateException(("Schema version is larger than Int.MAX_VALUE: " + sqlSchema.getVersion() + '.').toString());
            }
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onCreate(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
            this.schema.create(new AndroidSqliteDriver(frameworkSQLiteDatabase));
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public final void onUpgrade(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i, int i2) {
            AfterVersion[] afterVersionArr = this.callbacks;
            this.schema.migrate(new AndroidSqliteDriver(frameworkSQLiteDatabase), i, i2, (AfterVersion[]) Arrays.copyOf(afterVersionArr, afterVersionArr.length));
        }
    }

    public final class Transaction implements TransactionCallbacks {
        public final Transaction enclosingTransaction;
        public boolean successful;
        public final long ownerThreadId = Thread.currentThread().getId();
        public final ArrayList postCommitHooks = new ArrayList();
        public final ArrayList postRollbackHooks = new ArrayList();
        public final LinkedHashSet registeredQueries = new LinkedHashSet();
        public final LinkedHashSet pendingTables = new LinkedHashSet();
        public boolean childrenSuccessful = true;

        public Transaction(Transaction transaction) {
            this.enclosingTransaction = transaction;
        }

        public final void endTransaction$runtime() {
            if (this.ownerThreadId != Thread.currentThread().getId()) {
                a$$ExternalSyntheticBUOutline0.m$1("Transaction objects (`TransactionWithReturn` and `TransactionWithoutReturn`) must be used\nonly within the transaction lambda scope.");
                return;
            }
            boolean z = this.successful && this.childrenSuccessful;
            AndroidSqliteDriver androidSqliteDriver = AndroidSqliteDriver.this;
            Transaction transaction = this.enclosingTransaction;
            if (transaction == null) {
                if (z) {
                    androidSqliteDriver.getDatabase().setTransactionSuccessful();
                    androidSqliteDriver.getDatabase().endTransaction();
                } else {
                    androidSqliteDriver.getDatabase().endTransaction();
                }
            }
            androidSqliteDriver.transactions.set(transaction);
            QueryResult.Companion.getClass();
            QueryResult.Companion companion = QueryResult.Companion.$$INSTANCE;
        }
    }

    public AndroidSqliteDriver(SupportSQLiteOpenHelper supportSQLiteOpenHelper, FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i) {
        this.openHelper = supportSQLiteOpenHelper;
        if (!((supportSQLiteOpenHelper != null) ^ (frameworkSQLiteDatabase != null))) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            throw null;
        }
        this.transactions = new ThreadLocal();
        this.database$delegate = LazyKt.lazy(new ComponentRegistry$Builder$$ExternalSyntheticLambda3(14, this, frameworkSQLiteDatabase));
        this.statements = new AndroidSqliteDriver$statements$1(i);
        this.listeners = new LinkedHashMap();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void addListener(String[] strArr, Query.Listener listener) {
        listener.getClass();
        synchronized (this.listeners) {
            try {
                for (String str : strArr) {
                    LinkedHashMap linkedHashMap = this.listeners;
                    Object obj = linkedHashMap.get(str);
                    if (obj == null) {
                        obj = new LinkedHashSet();
                        linkedHashMap.put(str, obj);
                    }
                    ((Set) obj).add(listener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.statements.evictAll();
        SupportSQLiteOpenHelper supportSQLiteOpenHelper = this.openHelper;
        if (supportSQLiteOpenHelper != null) {
            supportSQLiteOpenHelper.close();
        } else {
            getDatabase().close();
        }
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final Transaction currentTransaction() {
        return (Transaction) this.transactions.get();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult execute(Integer num, String str, Function1 function1) {
        return new QueryResult.Value(m1423executezeHU3Mk(num, new ComponentRegistry$Builder$$ExternalSyntheticLambda3(15, this, str), function1, new SvgDecoder$$ExternalSyntheticLambda0(4)));
    }

    /* renamed from: execute-zeHU3Mk, reason: not valid java name */
    public final Object m1423executezeHU3Mk(Integer num, Function0 function0, Function1 function1, Function1 function12) {
        AndroidSqliteDriver$statements$1 androidSqliteDriver$statements$1 = this.statements;
        AndroidStatement androidStatement = num != null ? (AndroidStatement) androidSqliteDriver$statements$1.remove(num) : null;
        if (androidStatement == null) {
            androidStatement = (AndroidStatement) function0.invoke();
        }
        if (function1 != null) {
            try {
                function1.invoke(androidStatement);
            } catch (Throwable th) {
                if (num != null) {
                    AndroidStatement androidStatement2 = (AndroidStatement) androidSqliteDriver$statements$1.put(num, androidStatement);
                    if (androidStatement2 != null) {
                        androidStatement2.close();
                    }
                } else {
                    androidStatement.close();
                }
                throw th;
            }
        }
        Object invoke = function12.invoke(androidStatement);
        if (num == null) {
            androidStatement.close();
            return invoke;
        }
        AndroidStatement androidStatement3 = (AndroidStatement) androidSqliteDriver$statements$1.put(num, androidStatement);
        if (androidStatement3 != null) {
            androidStatement3.close();
        }
        return invoke;
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult executeQuery(Integer num, final String str, Function1 function1, final int i, Function1 function12) {
        str.getClass();
        function1.getClass();
        return new QueryResult.Value(m1423executezeHU3Mk(num, new Function0() { // from class: app.cash.sqldelight.driver.android.AndroidSqliteDriver$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return new AndroidQuery(str, this.getDatabase(), i);
            }
        }, function12, new SnapshotKt$$ExternalSyntheticLambda3(2, function1)));
    }

    public final SupportSQLiteDatabase getDatabase() {
        return (SupportSQLiteDatabase) this.database$delegate.getValue();
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final QueryResult newTransaction() {
        ThreadLocal threadLocal = this.transactions;
        Transaction transaction = (Transaction) threadLocal.get();
        Transaction transaction2 = new Transaction(transaction);
        threadLocal.set(transaction2);
        if (transaction == null) {
            getDatabase().beginTransactionNonExclusive();
        }
        return new QueryResult.Value(transaction2);
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void notifyListeners(String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.listeners) {
            for (String str : strArr) {
                Set set = (Set) this.listeners.get(str);
                if (set != null) {
                    linkedHashSet.addAll(set);
                }
            }
        }
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            ((Query.Listener) it.next()).queryResultsChanged();
        }
    }

    @Override // app.cash.sqldelight.db.SqlDriver
    public final void removeListener(String[] strArr, Query.Listener listener) {
        listener.getClass();
        synchronized (this.listeners) {
            for (String str : strArr) {
                Set set = (Set) this.listeners.get(str);
                if (set != null) {
                    set.remove(listener);
                }
            }
        }
    }

    public /* synthetic */ AndroidSqliteDriver(FrameworkSQLiteDatabase frameworkSQLiteDatabase) {
        this(null, frameworkSQLiteDatabase, 1);
    }

    public AndroidSqliteDriver(SqlSchema sqlSchema, Context context, String str, AndroidDatabaseFactory$createDriver$1 androidDatabaseFactory$createDriver$1, int i) {
        this(new FrameworkSQLiteOpenHelper(context, str, (i & 16) != 0 ? new Callback(sqlSchema, new AfterVersion[0]) : androidDatabaseFactory$createDriver$1, false, false), null, 20);
    }

    public AndroidSqliteDriver(FrameworkSQLiteDatabase frameworkSQLiteDatabase, int i) {
        this(null, frameworkSQLiteDatabase, 20);
    }
}
