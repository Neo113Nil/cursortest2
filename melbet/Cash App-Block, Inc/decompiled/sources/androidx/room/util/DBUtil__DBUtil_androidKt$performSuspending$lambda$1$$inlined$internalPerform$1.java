package androidx.room.util;

import androidx.room.InvalidationTracker;
import androidx.room.RoomDatabase;
import androidx.room.Transactor;
import androidx.room.coroutines.RawConnectionAccessor;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function1 $block$inlined;
    public final /* synthetic */ boolean $isReadOnly;
    public final /* synthetic */ RoomDatabase $this_internalPerform;
    public /* synthetic */ Object L$0;
    public Transactor.SQLiteTransactionType L$1;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(RoomDatabase roomDatabase, Continuation continuation, Function1 function1, boolean z) {
        super(2, continuation);
        this.$isReadOnly = z;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(this.$this_internalPerform, continuation, this.$block$inlined, this.$isReadOnly);
        dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1.L$0 = obj;
        return dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        if (r11 != r0) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x008a  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor.SQLiteTransactionType sQLiteTransactionType;
        Transactor.SQLiteTransactionType sQLiteTransactionType2;
        Transactor transactor;
        Transactor transactor2;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Function1 function1 = this.$block$inlined;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Transactor transactor3 = (Transactor) this.L$0;
            transactor3.getClass();
            return function1.invoke(((RawConnectionAccessor) transactor3).getRawConnection());
        }
        RoomDatabase roomDatabase = this.$this_internalPerform;
        if (i == 1) {
            sQLiteTransactionType = this.L$1;
            Transactor transactor4 = (Transactor) this.L$0;
            SafeTrace.throwOnFailure(obj);
            if (!((Boolean) obj).booleanValue()) {
                InvalidationTracker invalidationTracker = roomDatabase.getInvalidationTracker();
                this.L$0 = transactor4;
                this.L$1 = sQLiteTransactionType;
                this.label = 2;
                if (invalidationTracker.sync$room_runtime_release(this) != coroutineSingletons) {
                    transactor2 = transactor4;
                }
                return coroutineSingletons;
            }
            sQLiteTransactionType2 = sQLiteTransactionType;
            transactor = transactor4;
            LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(null, function1);
            this.L$0 = transactor;
            this.L$1 = null;
            this.label = 3;
            obj = transactor.withTransaction(sQLiteTransactionType2, localAddBrandsViewKt$LocalAddBrandsView$1$2$1$2, this);
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
                        InvalidationTracker invalidationTracker2 = roomDatabase.getInvalidationTracker();
                        invalidationTracker2.implementation.refreshInvalidationAsync$room_runtime_release(invalidationTracker2.onRefreshScheduled, invalidationTracker2.onRefreshCompleted);
                    }
                    return obj2;
                }
                transactor = (Transactor) this.L$0;
                SafeTrace.throwOnFailure(obj);
                if (this.$isReadOnly) {
                    return obj;
                }
                this.L$0 = obj;
                this.label = 4;
                Object inTransaction = transactor.inTransaction(this);
                if (inTransaction != coroutineSingletons) {
                    Object obj3 = obj;
                    obj = inTransaction;
                    obj2 = obj3;
                    if (!((Boolean) obj).booleanValue()) {
                    }
                    return obj2;
                }
                return coroutineSingletons;
            }
            sQLiteTransactionType = this.L$1;
            transactor2 = (Transactor) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        sQLiteTransactionType2 = sQLiteTransactionType;
        transactor = transactor2;
        LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2 localAddBrandsViewKt$LocalAddBrandsView$1$2$1$22 = new LocalAddBrandsViewKt$LocalAddBrandsView$1$2$1$2(null, function1);
        this.L$0 = transactor;
        this.L$1 = null;
        this.label = 3;
        obj = transactor.withTransaction(sQLiteTransactionType2, localAddBrandsViewKt$LocalAddBrandsView$1$2$1$22, this);
    }
}
