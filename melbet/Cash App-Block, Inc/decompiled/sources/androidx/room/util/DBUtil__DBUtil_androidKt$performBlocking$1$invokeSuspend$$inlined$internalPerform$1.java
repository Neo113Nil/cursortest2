package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import androidx.room.coroutines.RawConnectionAccessor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.datastorage.JavaDataStorage$editSync$1$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $block$inlined;
    public final /* synthetic */ boolean $inTransaction;
    public final /* synthetic */ boolean $isReadOnly;
    public final /* synthetic */ RoomDatabase $this_internalPerform;
    public /* synthetic */ Object L$0;
    public Transactor.SQLiteTransactionType L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1(RoomDatabase roomDatabase, Continuation continuation, Function1 function1, boolean z, boolean z2) {
        super(2, continuation);
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1(this.$this_internalPerform, continuation, this.$block$inlined, this.$inTransaction, this.$isReadOnly);
        dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1.L$0 = obj;
        return dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r12 != r0) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor.SQLiteTransactionType sQLiteTransactionType;
        Transactor transactor;
        Transactor.SQLiteTransactionType sQLiteTransactionType2;
        Transactor transactor2;
        Transactor transactor3;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Function1 function1 = this.$block$inlined;
        RoomDatabase roomDatabase = this.$this_internalPerform;
        boolean z = this.$isReadOnly;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Transactor transactor4 = (Transactor) this.L$0;
            if (!this.$inTransaction) {
                transactor4.getClass();
                return function1.invoke(((RawConnectionAccessor) transactor4).getRawConnection());
            }
            sQLiteTransactionType = z ? Transactor.SQLiteTransactionType.DEFERRED : Transactor.SQLiteTransactionType.IMMEDIATE;
            if (!z) {
                this.L$0 = transactor4;
                this.L$1 = sQLiteTransactionType;
                this.label = 1;
                Object inTransaction = transactor4.inTransaction(this);
                if (inTransaction != coroutineSingletons) {
                    transactor2 = transactor4;
                    obj = inTransaction;
                }
                return coroutineSingletons;
            }
            Transactor.SQLiteTransactionType sQLiteTransactionType3 = sQLiteTransactionType;
            transactor = transactor4;
            sQLiteTransactionType2 = sQLiteTransactionType3;
            JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$1 = new JavaDataStorage$editSync$1$1((Continuation) null, function1);
            this.L$0 = transactor;
            this.L$1 = null;
            this.label = 3;
            obj = transactor.withTransaction(sQLiteTransactionType2, javaDataStorage$editSync$1$1, this);
        } else if (i == 1) {
            sQLiteTransactionType = this.L$1;
            transactor2 = (Transactor) this.L$0;
            SafeTrace.throwOnFailure(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    if (!((Boolean) obj).booleanValue()) {
                        InvalidationTracker invalidationTracker = roomDatabase.getInvalidationTracker();
                        invalidationTracker.implementation.refreshInvalidationAsync$room_runtime_release(invalidationTracker.onRefreshScheduled, invalidationTracker.onRefreshCompleted);
                    }
                    return obj2;
                }
                transactor = (Transactor) this.L$0;
                SafeTrace.throwOnFailure(obj);
                if (z) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 4;
                Object inTransaction2 = transactor.inTransaction(this);
                if (inTransaction2 != coroutineSingletons) {
                    Object obj3 = obj;
                    obj = inTransaction2;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return coroutineSingletons;
            }
            sQLiteTransactionType = this.L$1;
            transactor3 = (Transactor) this.L$0;
            SafeTrace.throwOnFailure(obj);
            sQLiteTransactionType2 = sQLiteTransactionType;
            transactor = transactor3;
            JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$12 = new JavaDataStorage$editSync$1$1((Continuation) null, function1);
            this.L$0 = transactor;
            this.L$1 = null;
            this.label = 3;
            obj = transactor.withTransaction(sQLiteTransactionType2, javaDataStorage$editSync$1$12, this);
        }
        if (!((Boolean) obj).booleanValue()) {
            InvalidationTracker invalidationTracker2 = roomDatabase.getInvalidationTracker();
            this.L$0 = transactor2;
            this.L$1 = sQLiteTransactionType;
            this.label = 2;
            if (invalidationTracker2.sync$room_runtime_release(this) != coroutineSingletons) {
                transactor3 = transactor2;
                sQLiteTransactionType2 = sQLiteTransactionType;
                transactor = transactor3;
                JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$122 = new JavaDataStorage$editSync$1$1((Continuation) null, function1);
                this.L$0 = transactor;
                this.L$1 = null;
                this.label = 3;
                obj = transactor.withTransaction(sQLiteTransactionType2, javaDataStorage$editSync$1$122, this);
            }
            return coroutineSingletons;
        }
        sQLiteTransactionType2 = sQLiteTransactionType;
        transactor = transactor2;
        JavaDataStorage$editSync$1$1 javaDataStorage$editSync$1$1222 = new JavaDataStorage$editSync$1$1((Continuation) null, function1);
        this.L$0 = transactor;
        this.L$1 = null;
        this.label = 3;
        obj = transactor.withTransaction(sQLiteTransactionType2, javaDataStorage$editSync$1$1222, this);
    }
}
