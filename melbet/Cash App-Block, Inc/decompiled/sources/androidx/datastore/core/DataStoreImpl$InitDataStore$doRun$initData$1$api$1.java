package androidx.datastore.core;

import androidx.compose.animation.core.MutatorMutex$mutate$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.sync.Mutex;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DataStoreImpl$InitDataStore$doRun$initData$1$api$1 {
    public final /* synthetic */ Ref$ObjectRef $currentData;
    public final /* synthetic */ Ref$BooleanRef $initializationComplete;
    public final /* synthetic */ Mutex $updateLock;
    public final /* synthetic */ DataStoreImpl this$0;

    public DataStoreImpl$InitDataStore$doRun$initData$1$api$1(Mutex mutex, Ref$BooleanRef ref$BooleanRef, Ref$ObjectRef ref$ObjectRef, DataStoreImpl dataStoreImpl) {
        this.$updateLock = mutex;
        this.$initializationComplete = ref$BooleanRef;
        this.$currentData = ref$ObjectRef;
        this.this$0 = dataStoreImpl;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0089, code lost:
    
        if (r10.lock(r0) == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0 A[Catch: all -> 0x0052, TRY_LEAVE, TryCatch #0 {all -> 0x0052, blocks: (B:27:0x004e, B:28:0x00a8, B:30:0x00b0), top: B:26:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0090 A[Catch: all -> 0x00cc, TRY_LEAVE, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cf A[Catch: all -> 0x00cc, TRY_ENTER, TryCatch #2 {all -> 0x00cc, blocks: (B:40:0x008c, B:42:0x0090, B:45:0x00cf, B:46:0x00d6), top: B:39:0x008c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object updateData(MutatorMutex$mutate$2 mutatorMutex$mutate$2, ContinuationImpl continuationImpl) {
        DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1;
        int i;
        Mutex mutex;
        Ref$BooleanRef ref$BooleanRef;
        Ref$ObjectRef ref$ObjectRef;
        DataStoreImpl dataStoreImpl;
        Function2 function2;
        Mutex mutex2;
        Mutex mutex3;
        Ref$ObjectRef ref$ObjectRef2;
        Object obj;
        try {
            if (continuationImpl instanceof DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) {
                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = (DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) continuationImpl;
                int i2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj2 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj2);
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = mutatorMutex$mutate$2;
                        mutex = this.$updateLock;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = mutex;
                        ref$BooleanRef = this.$initializationComplete;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = ref$BooleanRef;
                        ref$ObjectRef = this.$currentData;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = ref$ObjectRef;
                        dataStoreImpl = this.this$0;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = dataStoreImpl;
                        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 1;
                        function2 = mutatorMutex$mutate$2;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                if (i != 3) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                obj = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                                ref$ObjectRef2 = (Ref$ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                                mutex2 = (Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                                try {
                                    SafeTrace.throwOnFailure(obj2);
                                    ref$ObjectRef2.element = obj;
                                    Object obj3 = ref$ObjectRef2.element;
                                    mutex2.unlock(null);
                                    return obj3;
                                } catch (Throwable th) {
                                    th = th;
                                    mutex2.unlock(null);
                                    throw th;
                                }
                            }
                            dataStoreImpl = (DataStoreImpl) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                            ref$ObjectRef2 = (Ref$ObjectRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                            mutex3 = (Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj2);
                                if (!Intrinsics.areEqual(obj2, ref$ObjectRef2.element)) {
                                    mutex2 = mutex3;
                                    Object obj32 = ref$ObjectRef2.element;
                                    mutex2.unlock(null);
                                    return obj32;
                                }
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = mutex3;
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = ref$ObjectRef2;
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = obj2;
                                dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 3;
                                if (dataStoreImpl.writeData$datastore_core_release(obj2, false, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1) != coroutineSingletons) {
                                    obj = obj2;
                                    mutex2 = mutex3;
                                    ref$ObjectRef2.element = obj;
                                    Object obj322 = ref$ObjectRef2.element;
                                    mutex2.unlock(null);
                                    return obj322;
                                }
                                return coroutineSingletons;
                            } catch (Throwable th2) {
                                th = th2;
                                mutex2 = mutex3;
                                mutex2.unlock(null);
                                throw th;
                            }
                        }
                        dataStoreImpl = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4;
                        Ref$ObjectRef ref$ObjectRef3 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3;
                        ref$BooleanRef = (Ref$BooleanRef) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2;
                        Mutex mutex4 = (Mutex) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1;
                        Function2 function22 = (Function2) dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        ref$ObjectRef = ref$ObjectRef3;
                        function2 = function22;
                        mutex = mutex4;
                    }
                    if (!ref$BooleanRef.element) {
                        throw new IllegalStateException("InitializerApi.updateData should not be called after initialization is complete.");
                    }
                    Object obj4 = ref$ObjectRef.element;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$0 = mutex;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$1 = ref$ObjectRef;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$2 = dataStoreImpl;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$3 = null;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.L$4 = null;
                    dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label = 2;
                    Object invoke = function2.invoke(obj4, dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1);
                    if (invoke != coroutineSingletons) {
                        mutex3 = mutex;
                        obj2 = invoke;
                        ref$ObjectRef2 = ref$ObjectRef;
                        if (!Intrinsics.areEqual(obj2, ref$ObjectRef2.element)) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            if (!ref$BooleanRef.element) {
            }
        } catch (Throwable th3) {
            th = th3;
            mutex2 = mutex;
            mutex2.unlock(null);
            throw th;
        }
        dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1 = new DataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1(this, continuationImpl);
        Object obj22 = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$InitDataStore$doRun$initData$1$api$1$updateData$1.label;
        if (i != 0) {
        }
    }
}
