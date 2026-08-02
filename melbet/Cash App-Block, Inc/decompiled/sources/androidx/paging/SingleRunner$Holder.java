package androidx.paging;

import androidx.paging.LoadState;
import androidx.paging.internal.CopyOnWriteArrayList;
import bo.app.a$$ExternalSyntheticBUOutline0;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlowImpl;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SingleRunner$Holder {
    public Object mutex;
    public Object previous;
    public Object singleRunner;

    public SingleRunner$Holder(int i) {
        switch (i) {
            case 2:
                LoadState.NotLoading notLoading = LoadState.NotLoading.Incomplete;
                this.singleRunner = notLoading;
                this.mutex = notLoading;
                this.previous = notLoading;
                break;
            default:
                this.singleRunner = new CopyOnWriteArrayList();
                StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(null);
                this.mutex = MutableStateFlow;
                this.previous = FlowKt.asStateFlow(MutableStateFlow);
                break;
        }
    }

    public LoadState get(LoadType loadType) {
        loadType.getClass();
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return (LoadState) this.singleRunner;
        }
        if (ordinal == 1) {
            return (LoadState) this.mutex;
        }
        if (ordinal == 2) {
            return (LoadState) this.previous;
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x004e A[Catch: all -> 0x0051, TRY_LEAVE, TryCatch #0 {all -> 0x0051, blocks: (B:11:0x0048, B:13:0x004e), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object onFinish(Job job, ContinuationImpl continuationImpl) {
        SingleRunner$Holder$onFinish$1 singleRunner$Holder$onFinish$1;
        int i;
        MutexImpl mutexImpl;
        try {
            if (continuationImpl instanceof SingleRunner$Holder$onFinish$1) {
                singleRunner$Holder$onFinish$1 = (SingleRunner$Holder$onFinish$1) continuationImpl;
                int i2 = singleRunner$Holder$onFinish$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    singleRunner$Holder$onFinish$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = singleRunner$Holder$onFinish$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = singleRunner$Holder$onFinish$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = (MutexImpl) this.mutex;
                        singleRunner$Holder$onFinish$1.L$0 = job;
                        singleRunner$Holder$onFinish$1.L$1 = mutexImpl;
                        singleRunner$Holder$onFinish$1.label = 1;
                        if (mutexImpl.lock(singleRunner$Holder$onFinish$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        MutexImpl mutexImpl2 = singleRunner$Holder$onFinish$1.L$1;
                        Job job2 = singleRunner$Holder$onFinish$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        mutexImpl = mutexImpl2;
                        job = job2;
                    }
                    if (job == ((Job) this.previous)) {
                        this.previous = null;
                    }
                    mutexImpl.unlock(null);
                    return Unit.INSTANCE;
                }
            }
            if (job == ((Job) this.previous)) {
            }
            mutexImpl.unlock(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            mutexImpl.unlock(null);
            throw th;
        }
        singleRunner$Holder$onFinish$1 = new SingleRunner$Holder$onFinish$1(this, continuationImpl);
        Object obj2 = singleRunner$Holder$onFinish$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleRunner$Holder$onFinish$1.label;
        if (i != 0) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2, types: [androidx.paging.LoadState] */
    public void set(LoadStates loadStates, LoadStates loadStates2) {
        Object value;
        LoadState loadState;
        LoadState loadState2;
        CombinedLoadStates combinedLoadStates;
        ?? r11;
        loadStates.getClass();
        StateFlowImpl stateFlowImpl = (StateFlowImpl) this.mutex;
        do {
            value = stateFlowImpl.getValue();
            CombinedLoadStates combinedLoadStates2 = (CombinedLoadStates) value;
            loadStates.getClass();
            LoadState.NotLoading notLoading = LoadState.NotLoading.Incomplete;
            if (combinedLoadStates2 == null || (loadState = combinedLoadStates2.refresh) == null) {
                loadState = notLoading;
            }
            LoadState loadState3 = loadStates.refresh;
            LoadState computeHelperState = FlowExtKt.computeHelperState(loadState, loadState3, loadState3, loadStates2 != null ? loadStates2.refresh : null);
            if (combinedLoadStates2 == null || (loadState2 = combinedLoadStates2.prepend) == null) {
                loadState2 = notLoading;
            }
            LoadState computeHelperState2 = FlowExtKt.computeHelperState(loadState2, loadState3, loadStates.prepend, loadStates2 != null ? loadStates2.prepend : null);
            if (combinedLoadStates2 != null && (r11 = combinedLoadStates2.append) != 0) {
                notLoading = r11;
            }
            combinedLoadStates = new CombinedLoadStates(computeHelperState, computeHelperState2, FlowExtKt.computeHelperState(notLoading, loadState3, loadStates.append, loadStates2 != null ? loadStates2.append : null), loadStates, loadStates2);
            if (Intrinsics.areEqual(combinedLoadStates2, combinedLoadStates)) {
                return;
            }
        } while (!stateFlowImpl.compareAndSet(value, combinedLoadStates));
        Iterator it = ((CopyOnWriteArrayList) this.singleRunner).iterator();
        while (it.hasNext()) {
            ((Function1) it.next()).invoke(combinedLoadStates);
        }
    }

    public LoadStates snapshot() {
        return new LoadStates((LoadState) this.singleRunner, (LoadState) this.mutex, (LoadState) this.previous);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005b A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002b, B:14:0x007d, B:22:0x0055, B:24:0x005b, B:26:0x0060, B:28:0x006e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0060 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002b, B:14:0x007d, B:22:0x0055, B:24:0x005b, B:26:0x0060, B:28:0x006e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:12:0x002b, B:14:0x007d, B:22:0x0055, B:24:0x005b, B:26:0x0060, B:28:0x006e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlinx.coroutines.Job] */
    /* JADX WARN: Type inference failed for: r9v1, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v4, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object tryEnqueue(Job job, ContinuationImpl continuationImpl) {
        SingleRunner$Holder$tryEnqueue$1 singleRunner$Holder$tryEnqueue$1;
        int i;
        Job job2;
        Job job3;
        Job job4;
        try {
            if (continuationImpl instanceof SingleRunner$Holder$tryEnqueue$1) {
                singleRunner$Holder$tryEnqueue$1 = (SingleRunner$Holder$tryEnqueue$1) continuationImpl;
                int i2 = singleRunner$Holder$tryEnqueue$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    singleRunner$Holder$tryEnqueue$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = singleRunner$Holder$tryEnqueue$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = singleRunner$Holder$tryEnqueue$1.label;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        MutexImpl mutexImpl = (MutexImpl) this.mutex;
                        singleRunner$Holder$tryEnqueue$1.L$0 = job;
                        singleRunner$Holder$tryEnqueue$1.L$1 = mutexImpl;
                        singleRunner$Holder$tryEnqueue$1.label = 1;
                        if (mutexImpl.lock(singleRunner$Holder$tryEnqueue$1) != coroutineSingletons) {
                            job2 = job;
                            job = mutexImpl;
                        }
                        return coroutineSingletons;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        Mutex mutex = singleRunner$Holder$tryEnqueue$1.L$1;
                        job4 = singleRunner$Holder$tryEnqueue$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        job = mutex;
                        job2 = job4;
                        this.previous = job2;
                        return true;
                    }
                    Mutex mutex2 = singleRunner$Holder$tryEnqueue$1.L$1;
                    job2 = singleRunner$Holder$tryEnqueue$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    job = mutex2;
                    job3 = (Job) this.previous;
                    if (job3 != null) {
                        job3.isActive();
                    }
                    if (job3 != null) {
                        job3.cancel(new SingleRunner$CancelIsolatedRunnerException((HintHandler) this.singleRunner));
                    }
                    if (job3 != null) {
                        singleRunner$Holder$tryEnqueue$1.L$0 = job2;
                        singleRunner$Holder$tryEnqueue$1.L$1 = job;
                        singleRunner$Holder$tryEnqueue$1.label = 2;
                        if (job3.join(singleRunner$Holder$tryEnqueue$1) != coroutineSingletons) {
                            job4 = job2;
                            job = job;
                            job2 = job4;
                        }
                        return coroutineSingletons;
                    }
                    this.previous = job2;
                    return true;
                }
            }
            if (i != 0) {
            }
            job3 = (Job) this.previous;
            if (job3 != null) {
            }
            if (job3 != null) {
            }
            if (job3 != null) {
            }
            this.previous = job2;
            return true;
        } finally {
            job.unlock(null);
        }
        singleRunner$Holder$tryEnqueue$1 = new SingleRunner$Holder$tryEnqueue$1(this, continuationImpl);
        Object obj2 = singleRunner$Holder$tryEnqueue$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = singleRunner$Holder$tryEnqueue$1.label;
    }

    public void set(LoadType loadType, LoadState loadState) {
        loadType.getClass();
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            this.singleRunner = loadState;
            return;
        }
        if (ordinal == 1) {
            this.mutex = loadState;
        } else if (ordinal == 2) {
            this.previous = loadState;
        } else {
            Drop$$ExternalSyntheticBUOutline0.m1m();
        }
    }

    public void set(LoadStates loadStates) {
        loadStates.getClass();
        this.singleRunner = loadStates.refresh;
        this.previous = loadStates.append;
        this.mutex = loadStates.prepend;
    }
}
