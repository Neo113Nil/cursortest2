package androidx.room.driver;

import androidx.room.TransactionScope;
import androidx.room.Transactor;
import androidx.room.coroutines.ConnectionPool;
import androidx.room.coroutines.RawConnectionAccessor;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.db.SupportSQLiteDatabase;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.Cache;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SupportSQLitePooledConnection implements Transactor, RawConnectionAccessor {
    public final SupportSQLiteConnection delegate;

    public final class SupportSQLiteTransactor implements TransactionScope, RawConnectionAccessor {
        public SupportSQLiteTransactor() {
        }

        @Override // androidx.room.coroutines.RawConnectionAccessor
        public final SQLiteConnection getRawConnection() {
            return SupportSQLitePooledConnection.this.delegate;
        }

        @Override // androidx.room.PooledConnection
        public final Object usePrepared(String str, Function1 function1, ContinuationImpl continuationImpl) {
            return SupportSQLitePooledConnection.this.usePrepared(str, function1, continuationImpl);
        }
    }

    public SupportSQLitePooledConnection(SupportSQLiteConnection supportSQLiteConnection) {
        this.delegate = supportSQLiteConnection;
    }

    @Override // androidx.room.coroutines.RawConnectionAccessor
    public final SQLiteConnection getRawConnection() {
        return this.delegate;
    }

    @Override // androidx.room.Transactor
    public final Object inTransaction(SuspendLambda suspendLambda) {
        return Boolean.valueOf(this.delegate.db.inTransaction());
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object transaction$2(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, ContinuationImpl continuationImpl) {
        SupportSQLitePooledConnection$transaction$1 supportSQLitePooledConnection$transaction$1;
        int i;
        SupportSQLitePooledConnection supportSQLitePooledConnection;
        SupportSQLiteDatabase supportSQLiteDatabase;
        if (continuationImpl instanceof SupportSQLitePooledConnection$transaction$1) {
            supportSQLitePooledConnection$transaction$1 = (SupportSQLitePooledConnection$transaction$1) continuationImpl;
            int i2 = supportSQLitePooledConnection$transaction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                supportSQLitePooledConnection$transaction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = supportSQLitePooledConnection$transaction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = supportSQLitePooledConnection$transaction$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SupportSQLiteDatabase supportSQLiteDatabase2 = this.delegate.db;
                    supportSQLiteDatabase2.inTransaction();
                    int ordinal = sQLiteTransactionType.ordinal();
                    if (ordinal == 0) {
                        supportSQLiteDatabase2.beginTransactionReadOnly();
                    } else if (ordinal == 1) {
                        supportSQLiteDatabase2.beginTransactionNonExclusive();
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        supportSQLiteDatabase2.beginTransaction();
                    }
                    try {
                        Object supportSQLiteTransactor = new SupportSQLiteTransactor();
                        supportSQLitePooledConnection$transaction$1.L$0 = this;
                        supportSQLitePooledConnection$transaction$1.L$1 = supportSQLiteDatabase2;
                        supportSQLitePooledConnection$transaction$1.label = 1;
                        Object invoke = function2.invoke(supportSQLiteTransactor, supportSQLitePooledConnection$transaction$1);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        supportSQLitePooledConnection = this;
                        supportSQLiteDatabase = supportSQLiteDatabase2;
                        obj = invoke;
                    } catch (ConnectionPool.RollbackException unused) {
                        supportSQLitePooledConnection = this;
                        supportSQLiteDatabase = supportSQLiteDatabase2;
                        supportSQLiteDatabase.endTransaction();
                        if (!supportSQLiteDatabase.inTransaction()) {
                            supportSQLitePooledConnection.getClass();
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        supportSQLitePooledConnection = this;
                        supportSQLiteDatabase = supportSQLiteDatabase2;
                        supportSQLiteDatabase.endTransaction();
                        if (!supportSQLiteDatabase.inTransaction()) {
                            supportSQLitePooledConnection.getClass();
                        }
                        throw th;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    supportSQLiteDatabase = supportSQLitePooledConnection$transaction$1.L$1;
                    supportSQLitePooledConnection = supportSQLitePooledConnection$transaction$1.L$0;
                    try {
                        SafeTrace.throwOnFailure(obj);
                    } catch (ConnectionPool.RollbackException unused2) {
                        supportSQLiteDatabase.endTransaction();
                        if (!supportSQLiteDatabase.inTransaction()) {
                        }
                        return null;
                    } catch (Throwable th2) {
                        th = th2;
                        supportSQLiteDatabase.endTransaction();
                        if (!supportSQLiteDatabase.inTransaction()) {
                        }
                        throw th;
                    }
                }
                supportSQLiteDatabase.setTransactionSuccessful();
                supportSQLiteDatabase.endTransaction();
                if (!supportSQLiteDatabase.inTransaction()) {
                    supportSQLitePooledConnection.getClass();
                }
                return obj;
            }
        }
        supportSQLitePooledConnection$transaction$1 = new SupportSQLitePooledConnection$transaction$1(this, continuationImpl);
        Object obj3 = supportSQLitePooledConnection$transaction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = supportSQLitePooledConnection$transaction$1.label;
        if (i != 0) {
        }
        supportSQLiteDatabase.setTransactionSuccessful();
        supportSQLiteDatabase.endTransaction();
        if (!supportSQLiteDatabase.inTransaction()) {
        }
        return obj3;
    }

    @Override // androidx.room.PooledConnection
    public final Object usePrepared(String str, Function1 function1, ContinuationImpl continuationImpl) {
        SupportSQLiteStatement prepare = this.delegate.prepare(str);
        try {
            Object invoke = function1.invoke(prepare);
            Cache.Companion.closeFinally(prepare, null);
            return invoke;
        } finally {
        }
    }

    @Override // androidx.room.Transactor
    public final Object withTransaction(Transactor.SQLiteTransactionType sQLiteTransactionType, Function2 function2, SuspendLambda suspendLambda) {
        return transaction$2(sQLiteTransactionType, function2, suspendLambda);
    }
}
