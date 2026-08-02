package androidx.room.coroutines;

import android.database.SQLException;
import androidx.room.Room;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.concurrent.ThreadLocal_jvmAndroidKt;
import androidx.room.coroutines.ConnectionPool;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import bo.app.a$$ExternalSyntheticBUOutline0;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Cache;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PooledConnectionImpl implements Transactor, RawConnectionAccessor {
    public final AtomicBoolean _isRecycled;
    public final ConnectionWithLock delegate;
    public final boolean isReadOnly;
    public final ArrayDeque transactionStack;

    public final class StatementWrapper implements SQLiteStatement {
        public final SQLiteStatement delegate;
        public final /* synthetic */ PooledConnectionImpl this$0;
        public final long threadId;

        public StatementWrapper(PooledConnectionImpl pooledConnectionImpl, SQLiteStatement sQLiteStatement) {
            sQLiteStatement.getClass();
            this.this$0 = pooledConnectionImpl;
            this.delegate = sQLiteStatement;
            this.threadId = ThreadLocal_jvmAndroidKt.currentThreadId();
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindBlob(int i, byte[] bArr) {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.bindBlob(i, bArr);
            } else {
                Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindLong(int i, long j) {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.bindLong(i, j);
            } else {
                Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindNull(int i) {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.bindNull(i);
            } else {
                Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void bindText(int i, String str) {
            str.getClass();
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.bindText(i, str);
            } else {
                Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.close();
            } else {
                Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final byte[] getBlob(int i) {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getBlob(i);
            }
            Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final int getColumnCount() {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnCount();
            }
            Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getColumnName(int i) {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getColumnName(i);
            }
            Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final long getLong(int i) {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getLong(i);
            }
            Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final String getText(int i) {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.getText(i);
            }
            Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean isNull(int i) {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.isNull(i);
            }
            Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw null;
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final void reset() {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                this.delegate.reset();
            } else {
                Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
                throw null;
            }
        }

        @Override // androidx.sqlite.SQLiteStatement
        public final boolean step() {
            if (this.this$0._isRecycled.get()) {
                Room.throwSQLiteException(21, "Statement is recycled");
                throw null;
            }
            if (this.threadId == ThreadLocal_jvmAndroidKt.currentThreadId()) {
                return this.delegate.step();
            }
            Room.throwSQLiteException(21, "Attempted to use statement on a different thread");
            throw null;
        }
    }

    public final class TransactionImpl implements TransactionScope, RawConnectionAccessor {
        public TransactionImpl() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public final SQLiteConnection getRawConnection() {
            return PooledConnectionImpl.this.delegate;
        }

        @Override // androidx.room.PooledConnection
        public final Object usePrepared(String str, Function1 function1, ContinuationImpl continuationImpl) {
            return PooledConnectionImpl.this.usePrepared(str, function1, continuationImpl);
        }
    }

    public final class TransactionItem {
        public final int id;

        public TransactionItem(int i) {
            this.id = i;
        }
    }

    public PooledConnectionImpl(ConnectionWithLock connectionWithLock, boolean z) {
        connectionWithLock.getClass();
        this.delegate = connectionWithLock;
        this.isReadOnly = z;
        this.transactionStack = new ArrayDeque();
        this._isRecycled = new AtomicBoolean(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004e, B:13:0x005a, B:18:0x0065, B:19:0x0093, B:23:0x006d, B:24:0x0072, B:25:0x0073, B:26:0x0079, B:27:0x007f), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007f A[Catch: all -> 0x006b, TryCatch #0 {all -> 0x006b, blocks: (B:11:0x004e, B:13:0x005a, B:18:0x0065, B:19:0x0093, B:23:0x006d, B:24:0x0072, B:25:0x0073, B:26:0x0079, B:27:0x007f), top: B:10:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object beginTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$beginTransaction$1 pooledConnectionImpl$beginTransaction$1;
        int i;
        ConnectionWithLock connectionWithLock;
        ArrayDeque arrayDeque;
        try {
            if (continuationImpl instanceof PooledConnectionImpl$beginTransaction$1) {
                pooledConnectionImpl$beginTransaction$1 = (PooledConnectionImpl$beginTransaction$1) continuationImpl;
                int i2 = pooledConnectionImpl$beginTransaction$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    pooledConnectionImpl$beginTransaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = pooledConnectionImpl$beginTransaction$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pooledConnectionImpl$beginTransaction$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        pooledConnectionImpl$beginTransaction$1.L$0 = this;
                        pooledConnectionImpl$beginTransaction$1.L$1 = sQLiteTransactionType;
                        connectionWithLock = this.delegate;
                        pooledConnectionImpl$beginTransaction$1.L$2 = connectionWithLock;
                        pooledConnectionImpl$beginTransaction$1.label = 1;
                        if (connectionWithLock.lock.lock(pooledConnectionImpl$beginTransaction$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ConnectionWithLock connectionWithLock2 = pooledConnectionImpl$beginTransaction$1.L$2;
                        sQLiteTransactionType = pooledConnectionImpl$beginTransaction$1.L$1;
                        PooledConnectionImpl pooledConnectionImpl = pooledConnectionImpl$beginTransaction$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        connectionWithLock = connectionWithLock2;
                        this = pooledConnectionImpl;
                    }
                    arrayDeque = this.transactionStack;
                    ConnectionWithLock connectionWithLock3 = this.delegate;
                    int i3 = arrayDeque.size;
                    if (arrayDeque.isEmpty()) {
                        Room.execSQL(connectionWithLock3, "SAVEPOINT '" + i3 + '\'');
                    } else {
                        int ordinal = sQLiteTransactionType.ordinal();
                        if (ordinal == 0) {
                            Room.execSQL(connectionWithLock3, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            Room.execSQL(connectionWithLock3, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            Room.execSQL(connectionWithLock3, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    arrayDeque.addLast(new TransactionItem(i3));
                    Unit unit = Unit.INSTANCE;
                    connectionWithLock.unlock(null);
                    return unit;
                }
            }
            arrayDeque = this.transactionStack;
            ConnectionWithLock connectionWithLock32 = this.delegate;
            int i32 = arrayDeque.size;
            if (arrayDeque.isEmpty()) {
            }
            arrayDeque.addLast(new TransactionItem(i32));
            Unit unit2 = Unit.INSTANCE;
            connectionWithLock.unlock(null);
            return unit2;
        } catch (Throwable th) {
            connectionWithLock.unlock(null);
            throw th;
        }
        pooledConnectionImpl$beginTransaction$1 = new PooledConnectionImpl$beginTransaction$1(this, continuationImpl);
        Object obj2 = pooledConnectionImpl$beginTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pooledConnectionImpl$beginTransaction$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005a A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x0050, B:13:0x005a, B:15:0x0064, B:17:0x006d, B:18:0x00aa, B:22:0x0075, B:23:0x008a, B:25:0x0090, B:26:0x0096, B:27:0x00b0, B:28:0x00b7), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b0 A[Catch: all -> 0x0073, TRY_ENTER, TryCatch #0 {all -> 0x0073, blocks: (B:11:0x0050, B:13:0x005a, B:15:0x0064, B:17:0x006d, B:18:0x00aa, B:22:0x0075, B:23:0x008a, B:25:0x0090, B:26:0x0096, B:27:0x00b0, B:28:0x00b7), top: B:10:0x0050 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object endTransaction(boolean z, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$endTransaction$1 pooledConnectionImpl$endTransaction$1;
        int i;
        ConnectionWithLock connectionWithLock;
        ArrayDeque arrayDeque;
        try {
            if (continuationImpl instanceof PooledConnectionImpl$endTransaction$1) {
                pooledConnectionImpl$endTransaction$1 = (PooledConnectionImpl$endTransaction$1) continuationImpl;
                int i2 = pooledConnectionImpl$endTransaction$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    pooledConnectionImpl$endTransaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = pooledConnectionImpl$endTransaction$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = pooledConnectionImpl$endTransaction$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        pooledConnectionImpl$endTransaction$1.L$0 = this;
                        connectionWithLock = this.delegate;
                        pooledConnectionImpl$endTransaction$1.L$1 = connectionWithLock;
                        pooledConnectionImpl$endTransaction$1.Z$0 = z;
                        pooledConnectionImpl$endTransaction$1.label = 1;
                        if (connectionWithLock.lock.lock(pooledConnectionImpl$endTransaction$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = pooledConnectionImpl$endTransaction$1.Z$0;
                        ConnectionWithLock connectionWithLock2 = pooledConnectionImpl$endTransaction$1.L$1;
                        PooledConnectionImpl pooledConnectionImpl = pooledConnectionImpl$endTransaction$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        connectionWithLock = connectionWithLock2;
                        this = pooledConnectionImpl;
                    }
                    arrayDeque = this.transactionStack;
                    ConnectionWithLock connectionWithLock3 = this.delegate;
                    if (!arrayDeque.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    TransactionItem transactionItem = (TransactionItem) CollectionsKt__MutableCollectionsKt.removeLast(arrayDeque);
                    if (z) {
                        transactionItem.getClass();
                        if (arrayDeque.isEmpty()) {
                            Room.execSQL(connectionWithLock3, "END TRANSACTION");
                        } else {
                            Room.execSQL(connectionWithLock3, "RELEASE SAVEPOINT '" + transactionItem.id + '\'');
                        }
                    } else if (arrayDeque.isEmpty()) {
                        Room.execSQL(connectionWithLock3, "ROLLBACK TRANSACTION");
                    } else {
                        Room.execSQL(connectionWithLock3, "ROLLBACK TRANSACTION TO SAVEPOINT '" + transactionItem.id + '\'');
                    }
                    Unit unit = Unit.INSTANCE;
                    connectionWithLock.unlock(null);
                    return unit;
                }
            }
            arrayDeque = this.transactionStack;
            ConnectionWithLock connectionWithLock32 = this.delegate;
            if (!arrayDeque.isEmpty()) {
            }
        } catch (Throwable th) {
            connectionWithLock.unlock(null);
            throw th;
        }
        pooledConnectionImpl$endTransaction$1 = new PooledConnectionImpl$endTransaction$1(this, continuationImpl);
        Object obj2 = pooledConnectionImpl$endTransaction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pooledConnectionImpl$endTransaction$1.label;
        if (i != 0) {
        }
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public final SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    public final Object inTransaction(SuspendLambda suspendLambda) {
        if (this._isRecycled.get()) {
            Room.throwSQLiteException(21, "Connection is recycled");
            throw null;
        }
        ConnectionElement connectionElement = (ConnectionElement) suspendLambda.getContext().get(ConnectionElement.Key);
        if (connectionElement != null && connectionElement.connectionWrapper == this) {
            return Boolean.valueOf(!this.transactionStack.isEmpty());
        }
        Room.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|(1:(1:(1:(2:25|26)(1:(2:13|14)(4:16|17|18|19)))(6:27|28|29|(1:31)|32|(1:35)(1:34)))(1:57))(3:65|(1:67)|68)|58|59|(4:61|(0)|32|(0))|35))|70|6|(0)(0)|58|59|(0)|35|(2:(1:52)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00aa, code lost:
    
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00b4, code lost:
    
        if (r12.endTransaction(false, r0) == r1) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b7, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b8, code lost:
    
        throw r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00b9, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
    
        r9 = r11;
        r11 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00be, code lost:
    
        r0.L$0 = r9;
        r0.L$1 = r11;
        r0.label = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        if (r12.endTransaction(false, r0) != r1) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00cb, code lost:
    
        r13 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        r12 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a2, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00a3, code lost:
    
        r12 = r11;
        r11 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x007a, code lost:
    
        if (beginTransaction(r12, r0) == r1) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transaction$1(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$transaction$1 pooledConnectionImpl$transaction$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        PooledConnectionImpl pooledConnectionImpl;
        int i2;
        boolean z;
        if (continuationImpl instanceof PooledConnectionImpl$transaction$1) {
            pooledConnectionImpl$transaction$1 = (PooledConnectionImpl$transaction$1) continuationImpl;
            int i3 = pooledConnectionImpl$transaction$1.label;
            if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                pooledConnectionImpl$transaction$1.label = i3 - PKIFailureInfo.systemUnavail;
                obj = pooledConnectionImpl$transaction$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pooledConnectionImpl$transaction$1.label;
                Throwable th = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (sQLiteTransactionType == null) {
                        sQLiteTransactionType = Transactor.SQLiteTransactionType.DEFERRED;
                    }
                    pooledConnectionImpl$transaction$1.L$0 = this;
                    pooledConnectionImpl$transaction$1.L$1 = (Serializable) function2;
                    pooledConnectionImpl$transaction$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            i2 = pooledConnectionImpl$transaction$1.I$0;
                            pooledConnectionImpl = (PooledConnectionImpl) pooledConnectionImpl$transaction$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                z = i2 != 0;
                                pooledConnectionImpl$transaction$1.L$0 = obj;
                                pooledConnectionImpl$transaction$1.label = 3;
                            } catch (Throwable th2) {
                                Throwable th3 = th2;
                                try {
                                    if (!(th3 instanceof ConnectionPool.RollbackException)) {
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                }
                            }
                            return pooledConnectionImpl.endTransaction(z, pooledConnectionImpl$transaction$1) != coroutineSingletons ? coroutineSingletons : obj;
                        }
                        if (i == 3 || i == 4) {
                            Object obj2 = pooledConnectionImpl$transaction$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            return obj2;
                        }
                        if (i != 5) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = (Throwable) pooledConnectionImpl$transaction$1.L$1;
                        Throwable th5 = (Throwable) pooledConnectionImpl$transaction$1.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj);
                        } catch (SQLException e) {
                            e = e;
                            if (th5 != null) {
                                throw e;
                            }
                            ExceptionsKt__ExceptionsKt.addSuppressed(th5, e);
                            throw th;
                        }
                        throw th;
                    }
                    function2 = (Function2) pooledConnectionImpl$transaction$1.L$1;
                    this = (PooledConnectionImpl) pooledConnectionImpl$transaction$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                TransactionImpl transactionImpl = this.new TransactionImpl();
                pooledConnectionImpl$transaction$1.L$0 = this;
                pooledConnectionImpl$transaction$1.L$1 = null;
                pooledConnectionImpl$transaction$1.I$0 = 1;
                pooledConnectionImpl$transaction$1.label = 2;
                obj = function2.invoke(transactionImpl, pooledConnectionImpl$transaction$1);
                if (obj != coroutineSingletons) {
                    pooledConnectionImpl = this;
                    i2 = 1;
                    if (i2 != 0) {
                    }
                    pooledConnectionImpl$transaction$1.L$0 = obj;
                    pooledConnectionImpl$transaction$1.label = 3;
                    if (pooledConnectionImpl.endTransaction(z, pooledConnectionImpl$transaction$1) != coroutineSingletons) {
                    }
                }
            }
        }
        pooledConnectionImpl$transaction$1 = new PooledConnectionImpl$transaction$1(this, continuationImpl);
        obj = pooledConnectionImpl$transaction$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pooledConnectionImpl$transaction$1.label;
        Throwable th6 = null;
        if (i != 0) {
        }
        TransactionImpl transactionImpl2 = this.new TransactionImpl();
        pooledConnectionImpl$transaction$1.L$0 = this;
        pooledConnectionImpl$transaction$1.L$1 = null;
        pooledConnectionImpl$transaction$1.I$0 = 1;
        pooledConnectionImpl$transaction$1.label = 2;
        obj = function2.invoke(transactionImpl2, pooledConnectionImpl$transaction$1);
        if (obj != coroutineSingletons) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // androidx.room.PooledConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object usePrepared(String str, Function1 function1, ContinuationImpl continuationImpl) {
        PooledConnectionImpl$usePrepared$1 pooledConnectionImpl$usePrepared$1;
        int i;
        ConnectionWithLock connectionWithLock;
        try {
            try {
                if (continuationImpl instanceof PooledConnectionImpl$usePrepared$1) {
                    pooledConnectionImpl$usePrepared$1 = (PooledConnectionImpl$usePrepared$1) continuationImpl;
                    int i2 = pooledConnectionImpl$usePrepared$1.label;
                    if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                        pooledConnectionImpl$usePrepared$1.label = i2 - PKIFailureInfo.systemUnavail;
                        Object obj = pooledConnectionImpl$usePrepared$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = pooledConnectionImpl$usePrepared$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj);
                            if (this._isRecycled.get()) {
                                Room.throwSQLiteException(21, "Connection is recycled");
                                throw null;
                            }
                            ConnectionElement connectionElement = (ConnectionElement) pooledConnectionImpl$usePrepared$1.getContext().get(ConnectionElement.Key);
                            if (connectionElement == null || connectionElement.connectionWrapper != this) {
                                Room.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                            pooledConnectionImpl$usePrepared$1.L$0 = this;
                            pooledConnectionImpl$usePrepared$1.L$1 = str;
                            pooledConnectionImpl$usePrepared$1.L$2 = function1;
                            connectionWithLock = this.delegate;
                            pooledConnectionImpl$usePrepared$1.L$3 = connectionWithLock;
                            pooledConnectionImpl$usePrepared$1.label = 1;
                            if (connectionWithLock.lock.lock(pooledConnectionImpl$usePrepared$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        } else {
                            if (i != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            ConnectionWithLock connectionWithLock2 = pooledConnectionImpl$usePrepared$1.L$3;
                            function1 = pooledConnectionImpl$usePrepared$1.L$2;
                            str = pooledConnectionImpl$usePrepared$1.L$1;
                            PooledConnectionImpl pooledConnectionImpl = pooledConnectionImpl$usePrepared$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            connectionWithLock = connectionWithLock2;
                            this = pooledConnectionImpl;
                        }
                        StatementWrapper statementWrapper = new StatementWrapper(this, this.delegate.prepare(str));
                        Object invoke = function1.invoke(statementWrapper);
                        Cache.Companion.closeFinally(statementWrapper, null);
                        return invoke;
                    }
                }
                Object invoke2 = function1.invoke(statementWrapper);
                Cache.Companion.closeFinally(statementWrapper, null);
                return invoke2;
            } finally {
            }
            StatementWrapper statementWrapper2 = new StatementWrapper(this, this.delegate.prepare(str));
        } finally {
            connectionWithLock.unlock(null);
        }
        pooledConnectionImpl$usePrepared$1 = new PooledConnectionImpl$usePrepared$1(this, continuationImpl);
        Object obj2 = pooledConnectionImpl$usePrepared$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pooledConnectionImpl$usePrepared$1.label;
        if (i != 0) {
        }
    }

    @Override // androidx.room.Transactor
    public final Object withTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, SuspendLambda suspendLambda) {
        if (this._isRecycled.get()) {
            Room.throwSQLiteException(21, "Connection is recycled");
            throw null;
        }
        ConnectionElement connectionElement = (ConnectionElement) suspendLambda.getContext().get(ConnectionElement.Key);
        if (connectionElement != null && connectionElement.connectionWrapper == this) {
            return transaction$1(sQLiteTransactionType, function2, suspendLambda);
        }
        Room.throwSQLiteException(21, "Attempted to use connection on a different coroutine");
        throw null;
    }
}
