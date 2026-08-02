package androidx.datastore.core;

import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import androidx.room.ObservedTableVersions;
import app.cash.molecule.GatedFrameClock;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.contour.ContourLayout$geometry$1;
import curtains.WindowsKt$onNextDraw$1;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.ExceptionsKt__ExceptionsKt;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CompletableDeferredImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class DataStoreImpl implements DataStore {
    public int collectorCounter;
    public StandaloneCoroutine collectorJob;
    public final MutexImpl collectorMutex;
    public final Lazy coordinator$delegate;
    public final CorruptionHandler corruptionHandler;
    public final SafeFlow data;
    public final ObservedTableVersions inMemoryCache;
    public final SimpleActor readAndInit;
    public final CoroutineScope scope;
    public final FileStorage storage;
    public final Lazy storageConnectionDelegate;
    public final SimpleActor writeActor;

    public DataStoreImpl(FileStorage fileStorage, List list, CorruptionHandler corruptionHandler, CoroutineScope coroutineScope) {
        list.getClass();
        this.storage = fileStorage;
        this.corruptionHandler = corruptionHandler;
        this.scope = coroutineScope;
        Continuation continuation = null;
        final int i = 0;
        this.data = new SafeFlow(new DataStoreImpl$data$1(this, continuation, i));
        this.collectorMutex = new MutexImpl();
        this.inMemoryCache = new ObservedTableVersions();
        this.readAndInit = new SimpleActor(this, list);
        final int i2 = 1;
        this.storageConnectionDelegate = LazyKt.lazy(new Function0(this) { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            public final /* synthetic */ DataStoreImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i2) {
                    case 0:
                        return ((FileStorageConnection) this.this$0.storageConnectionDelegate.getValue()).coordinator;
                    default:
                        FileStorage fileStorage2 = this.this$0.storage;
                        File canonicalFile = ((File) fileStorage2.produceFile.invoke()).getCanonicalFile();
                        synchronized (FileStorage.activeFilesLock) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = FileStorage.activeFiles;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new FileStorageConnection(canonicalFile, fileStorage2.serializer, (SingleProcessCoordinator) fileStorage2.coordinatorProducer.invoke(canonicalFile), new ContourLayout$geometry$1(canonicalFile, 13));
                }
            }
        });
        this.coordinator$delegate = LazyKt.lazy(new Function0(this) { // from class: androidx.datastore.core.DataStoreImpl$coordinator$2
            public final /* synthetic */ DataStoreImpl this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
                this.this$0 = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                switch (i) {
                    case 0:
                        return ((FileStorageConnection) this.this$0.storageConnectionDelegate.getValue()).coordinator;
                    default:
                        FileStorage fileStorage2 = this.this$0.storage;
                        File canonicalFile = ((File) fileStorage2.produceFile.invoke()).getCanonicalFile();
                        synchronized (FileStorage.activeFilesLock) {
                            String absolutePath = canonicalFile.getAbsolutePath();
                            LinkedHashSet linkedHashSet = FileStorage.activeFiles;
                            if (linkedHashSet.contains(absolutePath)) {
                                throw new IllegalStateException(("There are multiple DataStores active for the same file: " + absolutePath + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                            }
                            absolutePath.getClass();
                            linkedHashSet.add(absolutePath);
                        }
                        return new FileStorageConnection(canonicalFile, fileStorage2.serializer, (SingleProcessCoordinator) fileStorage2.coordinatorProducer.invoke(canonicalFile), new ContourLayout$geometry$1(canonicalFile, 13));
                }
            }
        });
        int i3 = 14;
        this.writeActor = new SimpleActor(coroutineScope, new WindowsKt$onNextDraw$1(this, i3), new GatedFrameClock.AnonymousClass1(this, continuation, i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0056, TryCatch #0 {all -> 0x0056, blocks: (B:11:0x0046, B:13:0x004e, B:15:0x0052, B:16:0x0058), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$decrementCollector(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        DataStoreImpl$decrementCollector$1 dataStoreImpl$decrementCollector$1;
        int i;
        MutexImpl mutexImpl;
        int i2;
        try {
            if (continuationImpl instanceof DataStoreImpl$decrementCollector$1) {
                dataStoreImpl$decrementCollector$1 = (DataStoreImpl$decrementCollector$1) continuationImpl;
                int i3 = dataStoreImpl$decrementCollector$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    dataStoreImpl$decrementCollector$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = dataStoreImpl$decrementCollector$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreImpl$decrementCollector$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = dataStoreImpl.collectorMutex;
                        dataStoreImpl$decrementCollector$1.L$0 = dataStoreImpl;
                        dataStoreImpl$decrementCollector$1.L$1 = mutexImpl;
                        dataStoreImpl$decrementCollector$1.label = 1;
                        if (mutexImpl.lock(dataStoreImpl$decrementCollector$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = dataStoreImpl$decrementCollector$1.L$1;
                        DataStoreImpl dataStoreImpl2 = dataStoreImpl$decrementCollector$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        dataStoreImpl = dataStoreImpl2;
                    }
                    i2 = dataStoreImpl.collectorCounter - 1;
                    dataStoreImpl.collectorCounter = i2;
                    if (i2 == 0) {
                        StandaloneCoroutine standaloneCoroutine = dataStoreImpl.collectorJob;
                        if (standaloneCoroutine != null) {
                            standaloneCoroutine.cancel(null);
                        }
                        dataStoreImpl.collectorJob = null;
                    }
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            i2 = dataStoreImpl.collectorCounter - 1;
            dataStoreImpl.collectorCounter = i2;
            if (i2 == 0) {
            }
            mutexImpl.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        dataStoreImpl$decrementCollector$1 = new DataStoreImpl$decrementCollector$1(dataStoreImpl, continuationImpl);
        Object obj2 = dataStoreImpl$decrementCollector$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$decrementCollector$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(8:(1:(1:(2:12|13))(3:15|16|17))|37|38|23|24|(1:26)(1:29)|27|28)(5:39|40|41|(3:43|44|45)(3:49|(1:51)(1:66)|(2:53|(2:55|(1:57))(2:58|59))(2:60|(2:62|63)(2:64|65)))|31)|18|19|20))|69|6|7|(0)(0)|18|19|20|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b5, code lost:
    
        if (r9 != r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bb, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r9 == r1) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0033, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.DataStoreImpl] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleUpdate(DataStoreImpl dataStoreImpl, Message$Update message$Update, ContinuationImpl continuationImpl) {
        DataStoreImpl$handleUpdate$1 dataStoreImpl$handleUpdate$1;
        int i;
        CompletableDeferred completableDeferred;
        Throwable m4120exceptionOrNullimpl;
        CompletableDeferredImpl completableDeferredImpl;
        Object lock;
        DataStoreImpl dataStoreImpl2;
        if (continuationImpl instanceof DataStoreImpl$handleUpdate$1) {
            dataStoreImpl$handleUpdate$1 = (DataStoreImpl$handleUpdate$1) continuationImpl;
            int i2 = dataStoreImpl$handleUpdate$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dataStoreImpl$handleUpdate$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dataStoreImpl$handleUpdate$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreImpl$handleUpdate$1.label;
                boolean z = true;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            CompletableDeferredImpl completableDeferredImpl2 = dataStoreImpl$handleUpdate$1.L$2;
                            DataStoreImpl dataStoreImpl3 = dataStoreImpl$handleUpdate$1.L$1;
                            Message$Update message$Update2 = (Message$Update) dataStoreImpl$handleUpdate$1.L$0;
                            SafeTrace.throwOnFailure(obj);
                            completableDeferredImpl = completableDeferredImpl2;
                            dataStoreImpl2 = dataStoreImpl3;
                            message$Update = message$Update2;
                        } else if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    CompletableDeferred completableDeferred2 = (CompletableDeferred) dataStoreImpl$handleUpdate$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    dataStoreImpl = completableDeferred2;
                    Result.Companion companion = Result.Companion;
                    completableDeferred = dataStoreImpl;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
                    if (m4120exceptionOrNullimpl != null) {
                        completableDeferred.complete(obj);
                    } else {
                        completableDeferred.completeExceptionally(m4120exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
                SafeTrace.throwOnFailure(obj);
                completableDeferredImpl = message$Update.ack;
                try {
                    Result.Companion companion2 = Result.Companion;
                    State currentState = dataStoreImpl.inMemoryCache.getCurrentState();
                    if (currentState instanceof Data) {
                        Function2 function2 = message$Update.transform;
                        CoroutineContext coroutineContext = message$Update.callerContext;
                        dataStoreImpl$handleUpdate$1.L$0 = completableDeferredImpl;
                        dataStoreImpl$handleUpdate$1.label = 1;
                        try {
                            lock = dataStoreImpl.getCoordinator().lock(new DataStoreImpl$transformAndWrite$2(dataStoreImpl, coroutineContext, function2, null), dataStoreImpl$handleUpdate$1);
                        } catch (Throwable th) {
                            th = th;
                            th = th;
                            dataStoreImpl = completableDeferredImpl;
                            Result.Companion companion3 = Result.Companion;
                            obj = new Result.Failure(th);
                            completableDeferred = dataStoreImpl;
                            m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
                            if (m4120exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (!(currentState instanceof ReadException)) {
                            z = currentState instanceof UnInitialized;
                        }
                        if (!z) {
                            if (currentState instanceof Final) {
                                throw ((Final) currentState).getFinalException();
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                        if (currentState != message$Update.lastState) {
                            currentState.getClass();
                            throw ((ReadException) currentState).readException;
                        }
                        dataStoreImpl$handleUpdate$1.L$0 = message$Update;
                        dataStoreImpl$handleUpdate$1.L$1 = dataStoreImpl;
                        dataStoreImpl$handleUpdate$1.L$2 = completableDeferredImpl;
                        dataStoreImpl$handleUpdate$1.label = 2;
                        Object readAndInitOrPropagateAndThrowFailure = dataStoreImpl.readAndInitOrPropagateAndThrowFailure(dataStoreImpl$handleUpdate$1);
                        dataStoreImpl2 = dataStoreImpl;
                        if (readAndInitOrPropagateAndThrowFailure == coroutineSingletons) {
                        }
                    }
                    return coroutineSingletons;
                } catch (Throwable th2) {
                    th = th2;
                    dataStoreImpl = completableDeferredImpl;
                    Result.Companion companion32 = Result.Companion;
                    obj = new Result.Failure(th);
                    completableDeferred = dataStoreImpl;
                    m4120exceptionOrNullimpl = Result.m4120exceptionOrNullimpl(obj);
                    if (m4120exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                Function2 function22 = message$Update.transform;
                CoroutineContext coroutineContext2 = message$Update.callerContext;
                dataStoreImpl$handleUpdate$1.L$0 = completableDeferredImpl;
                dataStoreImpl$handleUpdate$1.L$1 = null;
                dataStoreImpl$handleUpdate$1.L$2 = null;
                dataStoreImpl$handleUpdate$1.label = 3;
                lock = dataStoreImpl2.getCoordinator().lock(new DataStoreImpl$transformAndWrite$2(dataStoreImpl2, coroutineContext2, function22, null), dataStoreImpl$handleUpdate$1);
            }
        }
        dataStoreImpl$handleUpdate$1 = new DataStoreImpl$handleUpdate$1(dataStoreImpl, continuationImpl);
        Object obj2 = dataStoreImpl$handleUpdate$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$handleUpdate$1.label;
        boolean z2 = true;
        if (i == 0) {
        }
        Function2 function222 = message$Update.transform;
        CoroutineContext coroutineContext22 = message$Update.callerContext;
        dataStoreImpl$handleUpdate$1.L$0 = completableDeferredImpl;
        dataStoreImpl$handleUpdate$1.L$1 = null;
        dataStoreImpl$handleUpdate$1.L$2 = null;
        dataStoreImpl$handleUpdate$1.label = 3;
        lock = dataStoreImpl2.getCoordinator().lock(new DataStoreImpl$transformAndWrite$2(dataStoreImpl2, coroutineContext22, function222, null), dataStoreImpl$handleUpdate$1);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004d A[Catch: all -> 0x005c, TRY_LEAVE, TryCatch #0 {all -> 0x005c, blocks: (B:11:0x0046, B:13:0x004d), top: B:10:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$incrementCollector(DataStoreImpl dataStoreImpl, ContinuationImpl continuationImpl) {
        DataStoreImpl$incrementCollector$1 dataStoreImpl$incrementCollector$1;
        int i;
        MutexImpl mutexImpl;
        int i2;
        try {
            if (continuationImpl instanceof DataStoreImpl$incrementCollector$1) {
                dataStoreImpl$incrementCollector$1 = (DataStoreImpl$incrementCollector$1) continuationImpl;
                int i3 = dataStoreImpl$incrementCollector$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    dataStoreImpl$incrementCollector$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = dataStoreImpl$incrementCollector$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreImpl$incrementCollector$1.label;
                    int i4 = 1;
                    Continuation continuation = null;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = dataStoreImpl.collectorMutex;
                        dataStoreImpl$incrementCollector$1.L$0 = dataStoreImpl;
                        dataStoreImpl$incrementCollector$1.L$1 = mutexImpl;
                        dataStoreImpl$incrementCollector$1.label = 1;
                        if (mutexImpl.lock(dataStoreImpl$incrementCollector$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = dataStoreImpl$incrementCollector$1.L$1;
                        DataStoreImpl dataStoreImpl2 = dataStoreImpl$incrementCollector$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        dataStoreImpl = dataStoreImpl2;
                    }
                    i2 = dataStoreImpl.collectorCounter + 1;
                    dataStoreImpl.collectorCounter = i2;
                    if (i2 == 1) {
                        dataStoreImpl.collectorJob = JobKt.launch$default(dataStoreImpl.scope, null, null, new DataStoreImpl$data$1.AnonymousClass1(dataStoreImpl, continuation, i4), 3);
                    }
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            i2 = dataStoreImpl.collectorCounter + 1;
            dataStoreImpl.collectorCounter = i2;
            if (i2 == 1) {
            }
            mutexImpl.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        dataStoreImpl$incrementCollector$1 = new DataStoreImpl$incrementCollector$1(dataStoreImpl, continuationImpl);
        Object obj2 = dataStoreImpl$incrementCollector$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$incrementCollector$1.label;
        int i42 = 1;
        Continuation continuation2 = null;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$readDataAndUpdateCache(DataStoreImpl dataStoreImpl, boolean z, Continuation continuation) {
        DataStoreImpl$readDataAndUpdateCache$1 dataStoreImpl$readDataAndUpdateCache$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        DataStoreImpl dataStoreImpl2;
        State state;
        boolean z2;
        DataStoreImpl dataStoreImpl3;
        Pair pair;
        if (continuation instanceof DataStoreImpl$readDataAndUpdateCache$1) {
            dataStoreImpl$readDataAndUpdateCache$1 = (DataStoreImpl$readDataAndUpdateCache$1) continuation;
            int i2 = dataStoreImpl$readDataAndUpdateCache$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dataStoreImpl$readDataAndUpdateCache$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = dataStoreImpl$readDataAndUpdateCache$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreImpl$readDataAndUpdateCache$1.label;
                Continuation continuation2 = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    State currentState = dataStoreImpl.inMemoryCache.getCurrentState();
                    if (currentState instanceof UnInitialized) {
                        a$$ExternalSyntheticBUOutline0.m$1("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                        return null;
                    }
                    SingleProcessCoordinator coordinator = dataStoreImpl.getCoordinator();
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = dataStoreImpl;
                    dataStoreImpl$readDataAndUpdateCache$1.L$1 = currentState;
                    dataStoreImpl$readDataAndUpdateCache$1.Z$0 = z;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 1;
                    Integer version = coordinator.getVersion();
                    if (version != coroutineSingletons) {
                        dataStoreImpl2 = dataStoreImpl;
                        state = currentState;
                        obj = version;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i == 2) {
                        dataStoreImpl3 = dataStoreImpl$readDataAndUpdateCache$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        pair = (Pair) obj;
                        State state2 = (State) pair.first;
                        if (((Boolean) pair.second).booleanValue()) {
                        }
                        return state2;
                    }
                    if (i != 3) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    dataStoreImpl3 = dataStoreImpl$readDataAndUpdateCache$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    pair = (Pair) obj;
                    State state22 = (State) pair.first;
                    if (((Boolean) pair.second).booleanValue()) {
                        dataStoreImpl3.inMemoryCache.tryUpdate(state22);
                    }
                    return state22;
                }
                z = dataStoreImpl$readDataAndUpdateCache$1.Z$0;
                state = dataStoreImpl$readDataAndUpdateCache$1.L$1;
                dataStoreImpl2 = dataStoreImpl$readDataAndUpdateCache$1.L$0;
                SafeTrace.throwOnFailure(obj);
                int intValue = ((Number) obj).intValue();
                z2 = state instanceof Data;
                int i3 = !z2 ? state.version : -1;
                if (!z2 && intValue == i3) {
                    return state;
                }
                if (z) {
                    SingleProcessCoordinator coordinator2 = dataStoreImpl2.getCoordinator();
                    DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(dataStoreImpl2, i3, continuation2, 0);
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = dataStoreImpl2;
                    dataStoreImpl$readDataAndUpdateCache$1.L$1 = null;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 3;
                    obj = coordinator2.tryLock(dataStoreImpl$readDataAndUpdateCache$4, dataStoreImpl$readDataAndUpdateCache$1);
                    if (obj != coroutineSingletons) {
                        dataStoreImpl3 = dataStoreImpl2;
                        pair = (Pair) obj;
                        State state222 = (State) pair.first;
                        if (((Boolean) pair.second).booleanValue()) {
                        }
                        return state222;
                    }
                } else {
                    SingleProcessCoordinator coordinator3 = dataStoreImpl2.getCoordinator();
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(dataStoreImpl2, continuation2, 7);
                    dataStoreImpl$readDataAndUpdateCache$1.L$0 = dataStoreImpl2;
                    dataStoreImpl$readDataAndUpdateCache$1.L$1 = null;
                    dataStoreImpl$readDataAndUpdateCache$1.label = 2;
                    obj = coordinator3.lock(pagingDataPresenter$collectFrom$2, dataStoreImpl$readDataAndUpdateCache$1);
                    if (obj != coroutineSingletons) {
                        dataStoreImpl3 = dataStoreImpl2;
                        pair = (Pair) obj;
                        State state2222 = (State) pair.first;
                        if (((Boolean) pair.second).booleanValue()) {
                        }
                        return state2222;
                    }
                }
                return coroutineSingletons;
            }
        }
        dataStoreImpl$readDataAndUpdateCache$1 = new DataStoreImpl$readDataAndUpdateCache$1(dataStoreImpl, continuation);
        Object obj2 = dataStoreImpl$readDataAndUpdateCache$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$readDataAndUpdateCache$1.label;
        Continuation continuation22 = null;
        if (i != 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z2 = state instanceof Data;
        if (!z2) {
        }
        if (!z2) {
        }
        if (z) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|8|9))|75|6|7|8|9|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0064, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0141 A[Catch: all -> 0x016f, TryCatch #3 {all -> 0x016f, blocks: (B:29:0x012e, B:31:0x0141, B:34:0x0149), top: B:28:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0149 A[Catch: all -> 0x016f, TRY_LEAVE, TryCatch #3 {all -> 0x016f, blocks: (B:29:0x012e, B:31:0x0141, B:34:0x0149), top: B:28:0x012e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a3 A[Catch: CorruptionException -> 0x0064, TryCatch #0 {CorruptionException -> 0x0064, blocks: (B:39:0x005f, B:40:0x0102, B:43:0x006d, B:44:0x00e4, B:59:0x008a, B:61:0x00a3, B:62:0x00a9, B:68:0x0093, B:71:0x00d1), top: B:8:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$readDataOrHandleCorruption(DataStoreImpl dataStoreImpl, boolean z, ContinuationImpl continuationImpl) {
        DataStoreImpl$readDataOrHandleCorruption$1 dataStoreImpl$readDataOrHandleCorruption$1;
        DataStoreImpl$readDataOrHandleCorruption$1 dataStoreImpl$readDataOrHandleCorruption$12;
        CorruptionException corruptionException;
        DataStoreImpl dataStoreImpl2;
        boolean z2;
        Ref$ObjectRef ref$ObjectRef;
        Ref$ObjectRef ref$ObjectRef2;
        Throwable th;
        CorruptionException corruptionException2;
        Object lock;
        Ref$ObjectRef ref$ObjectRef3;
        Ref$IntRef ref$IntRef;
        Integer version;
        DataStoreImpl dataStoreImpl3;
        int i;
        Object obj;
        if (continuationImpl instanceof DataStoreImpl$readDataOrHandleCorruption$1) {
            dataStoreImpl$readDataOrHandleCorruption$1 = (DataStoreImpl$readDataOrHandleCorruption$1) continuationImpl;
            int i2 = dataStoreImpl$readDataOrHandleCorruption$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dataStoreImpl$readDataOrHandleCorruption$1.label = i2 - PKIFailureInfo.systemUnavail;
                dataStoreImpl$readDataOrHandleCorruption$12 = dataStoreImpl$readDataOrHandleCorruption$1;
                Object obj2 = dataStoreImpl$readDataOrHandleCorruption$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = 1;
                Continuation continuation = null;
                switch (dataStoreImpl$readDataOrHandleCorruption$12.label) {
                    case 0:
                        SafeTrace.throwOnFailure(obj2);
                        if (!z) {
                            SingleProcessCoordinator coordinator = dataStoreImpl.getCoordinator();
                            dataStoreImpl$readDataOrHandleCorruption$12.L$0 = dataStoreImpl;
                            dataStoreImpl$readDataOrHandleCorruption$12.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$12.label = 3;
                            obj2 = coordinator.getVersion();
                            if (obj2 == obj3) {
                            }
                            int intValue = ((Number) obj2).intValue();
                            SingleProcessCoordinator coordinator2 = dataStoreImpl.getCoordinator();
                            DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4(dataStoreImpl, intValue, continuation, i3);
                            dataStoreImpl$readDataOrHandleCorruption$12.L$0 = dataStoreImpl;
                            dataStoreImpl$readDataOrHandleCorruption$12.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$12.label = 4;
                            obj2 = coordinator2.tryLock(dataStoreImpl$readDataAndUpdateCache$4, dataStoreImpl$readDataOrHandleCorruption$12);
                            if (obj2 == obj3) {
                            }
                            return (Data) obj2;
                        }
                        dataStoreImpl$readDataOrHandleCorruption$12.L$0 = dataStoreImpl;
                        dataStoreImpl$readDataOrHandleCorruption$12.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$12.label = 1;
                        obj2 = dataStoreImpl.readDataFromFileOrDefault(dataStoreImpl$readDataOrHandleCorruption$12);
                        if (obj2 == obj3) {
                        }
                        int hashCode = obj2 == null ? obj2.hashCode() : 0;
                        SingleProcessCoordinator coordinator3 = dataStoreImpl.getCoordinator();
                        dataStoreImpl$readDataOrHandleCorruption$12.L$0 = dataStoreImpl;
                        dataStoreImpl$readDataOrHandleCorruption$12.L$1 = obj2;
                        dataStoreImpl$readDataOrHandleCorruption$12.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$12.I$0 = hashCode;
                        dataStoreImpl$readDataOrHandleCorruption$12.label = 2;
                        version = coordinator3.getVersion();
                        if (version != obj3) {
                            dataStoreImpl3 = dataStoreImpl;
                            i = hashCode;
                            obj = obj2;
                            obj2 = version;
                            return new Data(obj, i, ((Number) obj2).intValue());
                        }
                        return obj3;
                    case 1:
                        z = dataStoreImpl$readDataOrHandleCorruption$12.Z$0;
                        dataStoreImpl = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$12.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        if (obj2 == null) {
                        }
                        SingleProcessCoordinator coordinator32 = dataStoreImpl.getCoordinator();
                        dataStoreImpl$readDataOrHandleCorruption$12.L$0 = dataStoreImpl;
                        dataStoreImpl$readDataOrHandleCorruption$12.L$1 = obj2;
                        dataStoreImpl$readDataOrHandleCorruption$12.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$12.I$0 = hashCode;
                        dataStoreImpl$readDataOrHandleCorruption$12.label = 2;
                        version = coordinator32.getVersion();
                        if (version != obj3) {
                        }
                        return obj3;
                    case 2:
                        i = dataStoreImpl$readDataOrHandleCorruption$12.I$0;
                        z = dataStoreImpl$readDataOrHandleCorruption$12.Z$0;
                        obj = dataStoreImpl$readDataOrHandleCorruption$12.L$1;
                        dataStoreImpl3 = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$12.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            return new Data(obj, i, ((Number) obj2).intValue());
                        } catch (CorruptionException e) {
                            e = e;
                            dataStoreImpl = dataStoreImpl3;
                            Ref$ObjectRef ref$ObjectRef4 = new Ref$ObjectRef();
                            CorruptionHandler corruptionHandler = dataStoreImpl.corruptionHandler;
                            dataStoreImpl$readDataOrHandleCorruption$12.L$0 = dataStoreImpl;
                            dataStoreImpl$readDataOrHandleCorruption$12.L$1 = e;
                            dataStoreImpl$readDataOrHandleCorruption$12.L$2 = ref$ObjectRef4;
                            dataStoreImpl$readDataOrHandleCorruption$12.L$3 = ref$ObjectRef4;
                            dataStoreImpl$readDataOrHandleCorruption$12.Z$0 = z;
                            dataStoreImpl$readDataOrHandleCorruption$12.label = 5;
                            Object handleCorruption = corruptionHandler.handleCorruption(e);
                            if (handleCorruption != obj3) {
                                corruptionException = e;
                                obj2 = handleCorruption;
                                dataStoreImpl2 = dataStoreImpl;
                                z2 = z;
                                ref$ObjectRef = ref$ObjectRef4;
                                ref$ObjectRef2 = ref$ObjectRef;
                                ref$ObjectRef.element = obj2;
                                Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                                try {
                                    DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$3 = new DataStoreImpl$readDataOrHandleCorruption$3(ref$ObjectRef2, dataStoreImpl2, ref$IntRef2, continuation, 0);
                                    dataStoreImpl$readDataOrHandleCorruption$12.L$0 = corruptionException;
                                    dataStoreImpl$readDataOrHandleCorruption$12.L$1 = ref$ObjectRef2;
                                    dataStoreImpl$readDataOrHandleCorruption$12.L$2 = ref$IntRef2;
                                    dataStoreImpl$readDataOrHandleCorruption$12.L$3 = null;
                                    dataStoreImpl$readDataOrHandleCorruption$12.label = 6;
                                    if (z2) {
                                    }
                                    if (lock != obj3) {
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    corruptionException2 = corruptionException;
                                    ExceptionsKt__ExceptionsKt.addSuppressed(corruptionException2, th);
                                    throw corruptionException2;
                                }
                            }
                            return obj3;
                        }
                    case 3:
                        z = dataStoreImpl$readDataOrHandleCorruption$12.Z$0;
                        dataStoreImpl = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$12.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        int intValue2 = ((Number) obj2).intValue();
                        SingleProcessCoordinator coordinator22 = dataStoreImpl.getCoordinator();
                        DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$42 = new DataStoreImpl$readDataAndUpdateCache$4(dataStoreImpl, intValue2, continuation, i3);
                        dataStoreImpl$readDataOrHandleCorruption$12.L$0 = dataStoreImpl;
                        dataStoreImpl$readDataOrHandleCorruption$12.Z$0 = z;
                        dataStoreImpl$readDataOrHandleCorruption$12.label = 4;
                        obj2 = coordinator22.tryLock(dataStoreImpl$readDataAndUpdateCache$42, dataStoreImpl$readDataOrHandleCorruption$12);
                        if (obj2 == obj3) {
                        }
                        return (Data) obj2;
                    case 4:
                        boolean z3 = dataStoreImpl$readDataOrHandleCorruption$12.Z$0;
                        SafeTrace.throwOnFailure(obj2);
                        return (Data) obj2;
                    case 5:
                        z2 = dataStoreImpl$readDataOrHandleCorruption$12.Z$0;
                        ref$ObjectRef = dataStoreImpl$readDataOrHandleCorruption$12.L$3;
                        Ref$ObjectRef ref$ObjectRef5 = (Ref$ObjectRef) dataStoreImpl$readDataOrHandleCorruption$12.L$2;
                        corruptionException = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$12.L$1;
                        DataStoreImpl dataStoreImpl4 = (DataStoreImpl) dataStoreImpl$readDataOrHandleCorruption$12.L$0;
                        SafeTrace.throwOnFailure(obj2);
                        ref$ObjectRef2 = ref$ObjectRef5;
                        dataStoreImpl2 = dataStoreImpl4;
                        ref$ObjectRef.element = obj2;
                        Ref$IntRef ref$IntRef22 = new Ref$IntRef();
                        DataStoreImpl$readDataOrHandleCorruption$3 dataStoreImpl$readDataOrHandleCorruption$32 = new DataStoreImpl$readDataOrHandleCorruption$3(ref$ObjectRef2, dataStoreImpl2, ref$IntRef22, continuation, 0);
                        dataStoreImpl$readDataOrHandleCorruption$12.L$0 = corruptionException;
                        dataStoreImpl$readDataOrHandleCorruption$12.L$1 = ref$ObjectRef2;
                        dataStoreImpl$readDataOrHandleCorruption$12.L$2 = ref$IntRef22;
                        dataStoreImpl$readDataOrHandleCorruption$12.L$3 = null;
                        dataStoreImpl$readDataOrHandleCorruption$12.label = 6;
                        if (z2) {
                            lock = dataStoreImpl2.getCoordinator().lock(new Scene.AnonymousClass1(dataStoreImpl$readDataOrHandleCorruption$32, continuation, 8), dataStoreImpl$readDataOrHandleCorruption$12);
                        } else {
                            dataStoreImpl2.getClass();
                            lock = dataStoreImpl$readDataOrHandleCorruption$32.invoke(dataStoreImpl$readDataOrHandleCorruption$12);
                        }
                        if (lock != obj3) {
                            ref$ObjectRef3 = ref$ObjectRef2;
                            ref$IntRef = ref$IntRef22;
                            Object obj4 = ref$ObjectRef3.element;
                            obj3 = new Data(obj4, obj4 != null ? obj4.hashCode() : 0, ref$IntRef.element);
                        }
                        return obj3;
                    case 6:
                        ref$IntRef = (Ref$IntRef) dataStoreImpl$readDataOrHandleCorruption$12.L$2;
                        ref$ObjectRef3 = (Ref$ObjectRef) dataStoreImpl$readDataOrHandleCorruption$12.L$1;
                        corruptionException2 = (CorruptionException) dataStoreImpl$readDataOrHandleCorruption$12.L$0;
                        try {
                            SafeTrace.throwOnFailure(obj2);
                            Object obj42 = ref$ObjectRef3.element;
                            obj3 = new Data(obj42, obj42 != null ? obj42.hashCode() : 0, ref$IntRef.element);
                            return obj3;
                        } catch (Throwable th3) {
                            th = th3;
                            ExceptionsKt__ExceptionsKt.addSuppressed(corruptionException2, th);
                            throw corruptionException2;
                        }
                    default:
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        dataStoreImpl$readDataOrHandleCorruption$1 = new DataStoreImpl$readDataOrHandleCorruption$1(dataStoreImpl, continuationImpl);
        dataStoreImpl$readDataOrHandleCorruption$12 = dataStoreImpl$readDataOrHandleCorruption$1;
        Object obj22 = dataStoreImpl$readDataOrHandleCorruption$12.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i32 = 1;
        Continuation continuation2 = null;
        switch (dataStoreImpl$readDataOrHandleCorruption$12.label) {
        }
    }

    public final SingleProcessCoordinator getCoordinator() {
        return (SingleProcessCoordinator) this.coordinator$delegate.getValue();
    }

    @Override // androidx.datastore.core.DataStore
    public final Flow getData() {
        return this.data;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0061, code lost:
    
        if (r2.runIfNeeded(r0) != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0063, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x004c, code lost:
    
        if (r7 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readAndInitOrPropagateAndThrowFailure(ContinuationImpl continuationImpl) {
        DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1;
        int i;
        int intValue;
        DataStoreImpl dataStoreImpl;
        int i2;
        Throwable th;
        try {
            if (continuationImpl instanceof DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) {
                dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = (DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1) continuationImpl;
                int i3 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.result;
                    Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        SingleProcessCoordinator coordinator = getCoordinator();
                        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
                        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 1;
                        obj = coordinator.getVersion();
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            i2 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0;
                            dataStoreImpl = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0;
                            try {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                dataStoreImpl.inMemoryCache.tryUpdate(new ReadException(th, i2));
                                throw th;
                            }
                        }
                        this = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    intValue = ((Number) obj).intValue();
                    SimpleActor simpleActor = this.readAndInit;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0 = intValue;
                    dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 2;
                }
            }
            SimpleActor simpleActor2 = this.readAndInit;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.L$0 = this;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.I$0 = intValue;
            dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label = 2;
        } catch (Throwable th3) {
            dataStoreImpl = this;
            i2 = intValue;
            th = th3;
            dataStoreImpl.inMemoryCache.tryUpdate(new ReadException(th, i2));
            throw th;
        }
        dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1 = new DataStoreImpl$readAndInitOrPropagateAndThrowFailure$1(this, continuationImpl);
        Object obj3 = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$readAndInitOrPropagateAndThrowFailure$1.label;
        if (i != 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object readDataFromFileOrDefault(ContinuationImpl continuationImpl) {
        return ((FileStorageConnection) this.storageConnectionDelegate.getValue()).readScope(new StorageConnectionKt$readData$2(3, null, 0), continuationImpl);
    }

    @Override // androidx.datastore.core.DataStore
    public final Object updateData(Function2 function2, ContinuationImpl continuationImpl) {
        UpdatingDataContextElement updatingDataContextElement = (UpdatingDataContextElement) continuationImpl.getContext().get(UpdatingDataContextElement$Companion$Key.INSTANCE);
        if (updatingDataContextElement != null) {
            updatingDataContextElement.checkNotUpdating(this);
        }
        return JobKt.withContext(new UpdatingDataContextElement(updatingDataContextElement, this), new DataStoreImpl$data$1(this, function2, (Continuation) null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object writeData$datastore_core_release(Object obj, boolean z, ContinuationImpl continuationImpl) {
        DataStoreImpl$writeData$1 dataStoreImpl$writeData$1;
        int i;
        Ref$IntRef ref$IntRef;
        if (continuationImpl instanceof DataStoreImpl$writeData$1) {
            dataStoreImpl$writeData$1 = (DataStoreImpl$writeData$1) continuationImpl;
            int i2 = dataStoreImpl$writeData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                dataStoreImpl$writeData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = dataStoreImpl$writeData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dataStoreImpl$writeData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    Ref$IntRef ref$IntRef2 = new Ref$IntRef();
                    FileStorageConnection fileStorageConnection = (FileStorageConnection) this.storageConnectionDelegate.getValue();
                    DataStoreImpl$writeData$2 dataStoreImpl$writeData$2 = new DataStoreImpl$writeData$2(ref$IntRef2, this, obj, z, null);
                    dataStoreImpl$writeData$1.L$0 = ref$IntRef2;
                    dataStoreImpl$writeData$1.label = 1;
                    if (fileStorageConnection.writeScope(dataStoreImpl$writeData$2, dataStoreImpl$writeData$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    ref$IntRef = ref$IntRef2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ref$IntRef = dataStoreImpl$writeData$1.L$0;
                    SafeTrace.throwOnFailure(obj2);
                }
                return new Integer(ref$IntRef.element);
            }
        }
        dataStoreImpl$writeData$1 = new DataStoreImpl$writeData$1(this, continuationImpl);
        Object obj22 = dataStoreImpl$writeData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dataStoreImpl$writeData$1.label;
        if (i != 0) {
        }
        return new Integer(ref$IntRef.element);
    }
}
