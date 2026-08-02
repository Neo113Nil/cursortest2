package androidx.room;

import android.database.SQLException;
import androidx.compose.runtime.Latch;
import androidx.room.Transactor;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class TriggerBasedInvalidationTracker$syncTriggers$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;
    public final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* renamed from: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ Transactor $connection;
        public final /* synthetic */ ObservedTableStates$ObserveOp[] $tablesToSync;
        public int I$0;
        public int I$1;
        public int I$2;
        public ObservedTableStates$ObserveOp[] L$0;
        public TriggerBasedInvalidationTracker L$1;
        public Transactor L$2;
        public int label;
        public final /* synthetic */ TriggerBasedInvalidationTracker this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr, TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Transactor transactor, Continuation continuation) {
            super(2, continuation);
            this.$tablesToSync = observedTableStates$ObserveOpArr;
            this.this$0 = triggerBasedInvalidationTracker;
            this.$connection = transactor;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$tablesToSync, this.this$0, this.$connection, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((TransactionScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
        
            if (androidx.room.TriggerBasedInvalidationTracker.access$startTrackingTable(r8, r7, r12, r11) == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
        
            r6 = r10;
         */
        /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0072 -> B:10:0x0073). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int length;
            int i;
            Transactor transactor;
            ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr;
            int i2;
            TriggerBasedInvalidationTracker triggerBasedInvalidationTracker;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            if (i3 == 0) {
                SafeTrace.throwOnFailure(obj);
                ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr2 = this.$tablesToSync;
                length = observedTableStates$ObserveOpArr2.length;
                i = 0;
                TriggerBasedInvalidationTracker triggerBasedInvalidationTracker2 = this.this$0;
                transactor = this.$connection;
                observedTableStates$ObserveOpArr = observedTableStates$ObserveOpArr2;
                i2 = 0;
                triggerBasedInvalidationTracker = triggerBasedInvalidationTracker2;
                if (i >= length) {
                }
            } else {
                if (i3 != 1 && i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                length = this.I$2;
                i = this.I$1;
                int i4 = this.I$0;
                transactor = this.L$2;
                triggerBasedInvalidationTracker = this.L$1;
                observedTableStates$ObserveOpArr = this.L$0;
                SafeTrace.throwOnFailure(obj);
                i2 = i4;
                i++;
                if (i >= length) {
                    int i5 = i2 + 1;
                    int ordinal = observedTableStates$ObserveOpArr[i].ordinal();
                    if (ordinal == 0) {
                        i2 = i5;
                        i++;
                        if (i >= length) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            this.L$0 = observedTableStates$ObserveOpArr;
                            this.L$1 = triggerBasedInvalidationTracker;
                            this.L$2 = transactor;
                            this.I$0 = i5;
                            this.I$1 = i;
                            this.I$2 = length;
                            this.label = 2;
                            if (TriggerBasedInvalidationTracker.access$stopTrackingTable(triggerBasedInvalidationTracker, transactor, i2, this) != coroutineSingletons) {
                                i4 = i5;
                                i2 = i4;
                            }
                            return coroutineSingletons;
                        }
                        this.L$0 = observedTableStates$ObserveOpArr;
                        this.L$1 = triggerBasedInvalidationTracker;
                        this.L$2 = transactor;
                        this.I$0 = i5;
                        this.I$1 = i;
                        this.I$2 = length;
                        this.label = 1;
                        i++;
                        if (i >= length) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TriggerBasedInvalidationTracker$syncTriggers$2$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.this$0;
        switch (i) {
            case 0:
                TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(triggerBasedInvalidationTracker, continuation, 0);
                triggerBasedInvalidationTracker$syncTriggers$2$1.L$0 = obj;
                return triggerBasedInvalidationTracker$syncTriggers$2$1;
            case 1:
                TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$12 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(triggerBasedInvalidationTracker, continuation, 1);
                triggerBasedInvalidationTracker$syncTriggers$2$12.L$0 = obj;
                return triggerBasedInvalidationTracker$syncTriggers$2$12;
            default:
                TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$13 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(triggerBasedInvalidationTracker, continuation, 2);
                triggerBasedInvalidationTracker$syncTriggers$2$13.L$0 = obj;
                return triggerBasedInvalidationTracker$syncTriggers$2$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((TriggerBasedInvalidationTracker$syncTriggers$2$1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((TriggerBasedInvalidationTracker$syncTriggers$2$1) create((TransactionScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((TriggerBasedInvalidationTracker$syncTriggers$2$1) create((Transactor) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0058, code lost:
    
        if (r0 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x003b, code lost:
    
        if (r7 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0125, code lost:
    
        if (r4.withTransaction(r5, r7, r19) == r1) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x00b4, code lost:
    
        if (r7 == r1) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Transactor transactor;
        Object inTransaction;
        ObservedTableStates$ObserveOp[] observedTableStates$ObserveOpArr;
        ObservedTableStates$ObserveOp observedTableStates$ObserveOp;
        Transactor transactor2;
        Object inTransaction2;
        Object withTransaction;
        int i = this.$r8$classId;
        TriggerBasedInvalidationTracker triggerBasedInvalidationTracker = this.this$0;
        boolean z = true;
        char c = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    transactor = (Transactor) this.L$0;
                    this.L$0 = transactor;
                    this.label = 1;
                    inTransaction = transactor.inTransaction(this);
                    break;
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    transactor = (Transactor) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    inTransaction = obj;
                }
                if (((Boolean) inTransaction).booleanValue()) {
                    return Unit.INSTANCE;
                }
                Latch latch = triggerBasedInvalidationTracker.observedTableStates;
                long[] jArr = (long[]) latch.awaiters;
                ReentrantLock reentrantLock = (ReentrantLock) latch.lock;
                reentrantLock.lock();
                try {
                    if (latch._isOpen) {
                        boolean z2 = false;
                        latch._isOpen = false;
                        int length = jArr.length;
                        observedTableStates$ObserveOpArr = new ObservedTableStates$ObserveOp[length];
                        int i3 = 0;
                        boolean z3 = false;
                        while (i3 < length) {
                            boolean z4 = jArr[i3] > 0 ? z : z2;
                            boolean[] zArr = (boolean[]) latch.spareList;
                            if (z4 != zArr[i3]) {
                                zArr[i3] = z4;
                                observedTableStates$ObserveOp = z4 ? ObservedTableStates$ObserveOp.ADD : ObservedTableStates$ObserveOp.REMOVE;
                                z3 = true;
                            } else {
                                observedTableStates$ObserveOp = ObservedTableStates$ObserveOp.NO_OP;
                            }
                            observedTableStates$ObserveOpArr[i3] = observedTableStates$ObserveOp;
                            i3++;
                            z = true;
                            z2 = false;
                        }
                        if (!z3) {
                            observedTableStates$ObserveOpArr = null;
                        }
                        reentrantLock.unlock();
                    } else {
                        reentrantLock.unlock();
                        observedTableStates$ObserveOpArr = null;
                    }
                    if (observedTableStates$ObserveOpArr != null) {
                        Transactor.SQLiteTransactionType sQLiteTransactionType = Transactor.SQLiteTransactionType.IMMEDIATE;
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(observedTableStates$ObserveOpArr, triggerBasedInvalidationTracker, transactor, null);
                        this.L$0 = null;
                        this.label = 2;
                        break;
                    }
                    return Unit.INSTANCE;
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 != 0) {
                    if (i4 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                TransactionScope transactionScope = (TransactionScope) this.L$0;
                this.label = 1;
                Object access$checkInvalidatedTables = TriggerBasedInvalidationTracker.access$checkInvalidatedTables(triggerBasedInvalidationTracker, transactionScope, this);
                return access$checkInvalidatedTables == coroutineSingletons2 ? coroutineSingletons2 : access$checkInvalidatedTables;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                try {
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        transactor2 = (Transactor) this.L$0;
                        this.L$0 = transactor2;
                        this.label = 1;
                        inTransaction2 = transactor2.inTransaction(this);
                        break;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            withTransaction = obj;
                            return (Set) withTransaction;
                        }
                        transactor2 = (Transactor) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        inTransaction2 = obj;
                    }
                    if (!((Boolean) inTransaction2).booleanValue()) {
                        Transactor.SQLiteTransactionType sQLiteTransactionType2 = Transactor.SQLiteTransactionType.IMMEDIATE;
                        TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(triggerBasedInvalidationTracker, continuation, c == true ? 1 : 0);
                        this.L$0 = null;
                        this.label = 2;
                        withTransaction = transactor2.withTransaction(sQLiteTransactionType2, triggerBasedInvalidationTracker$syncTriggers$2$1, this);
                        break;
                    } else {
                        return EmptySet.INSTANCE;
                    }
                } catch (SQLException unused) {
                    return EmptySet.INSTANCE;
                }
        }
    }
}
