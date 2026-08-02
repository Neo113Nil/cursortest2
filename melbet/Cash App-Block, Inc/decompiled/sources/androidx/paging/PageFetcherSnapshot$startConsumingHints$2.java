package androidx.paging;

import androidx.paging.PageFetcherSnapshotState;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.sync.MutexImpl;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class PageFetcherSnapshot$startConsumingHints$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public PageFetcherSnapshotState.Holder L$0;
    public MutexImpl L$1;
    public PageFetcherSnapshot L$2;
    public int label;
    public final /* synthetic */ PageFetcherSnapshot this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PageFetcherSnapshot$startConsumingHints$2(PageFetcherSnapshot pageFetcherSnapshot, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new PageFetcherSnapshot$startConsumingHints$2(this.this$0, continuation, 0);
            default:
                return new PageFetcherSnapshot$startConsumingHints$2(this.this$0, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((PageFetcherSnapshot$startConsumingHints$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (androidx.paging.PageFetcherSnapshot.access$collectAsGenerationalViewportHints(r1, r9, r2, r8) == r0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c4, code lost:
    
        if (androidx.paging.PageFetcherSnapshot.access$collectAsGenerationalViewportHints(r1, r9, r2, r8) == r0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x009e, code lost:
    
        if (r2.lock(r8) == r0) goto L37;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        PageFetcherSnapshotState.Holder holder;
        MutexImpl mutexImpl;
        MutexImpl mutexImpl2;
        PageFetcherSnapshotState.Holder holder2;
        int i = this.$r8$classId;
        PageFetcherSnapshot pageFetcherSnapshot = this.this$0;
        int i2 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                try {
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        holder = pageFetcherSnapshot.stateHolder;
                        mutexImpl = holder.lock;
                        this.L$0 = holder;
                        this.L$1 = mutexImpl;
                        this.L$2 = pageFetcherSnapshot;
                        this.label = 1;
                        break;
                    } else {
                        if (i3 != 1) {
                            if (i3 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        pageFetcherSnapshot = this.L$2;
                        mutexImpl = this.L$1;
                        holder = this.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    PageFetcherSnapshotState pageFetcherSnapshotState = holder.state;
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(pageFetcherSnapshotState, continuation, i2), FlowKt.consumeAsFlow(pageFetcherSnapshotState.prependGenerationIdCh));
                    mutexImpl2.unlock(null);
                    LoadType loadType = LoadType.PREPEND;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    break;
                } finally {
                }
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                try {
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PageFetcherSnapshotState.Holder holder3 = pageFetcherSnapshot.stateHolder;
                        mutexImpl2 = holder3.lock;
                        this.L$0 = holder3;
                        this.L$1 = mutexImpl2;
                        this.L$2 = pageFetcherSnapshot;
                        this.label = 1;
                        if (mutexImpl2.lock(this) != coroutineSingletons2) {
                            holder2 = holder3;
                        }
                        return coroutineSingletons2;
                    }
                    if (i4 != 1) {
                        if (i4 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pageFetcherSnapshot = this.L$2;
                    mutexImpl2 = this.L$1;
                    holder2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    PageFetcherSnapshotState pageFetcherSnapshotState2 = holder2.state;
                    FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$12 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcherSnapshotState$consumeAppendGenerationIdAsFlow$1(pageFetcherSnapshotState2, continuation, 0), FlowKt.consumeAsFlow(pageFetcherSnapshotState2.appendGenerationIdCh));
                    mutexImpl2.unlock(null);
                    LoadType loadType2 = LoadType.APPEND;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    break;
                } finally {
                }
        }
    }
}
