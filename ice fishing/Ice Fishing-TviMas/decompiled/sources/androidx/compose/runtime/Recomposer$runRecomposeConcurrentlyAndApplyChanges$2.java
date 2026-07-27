package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "parentFrameClock", "Landroidx/compose/runtime/MonotonicFrameClock;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$runRecomposeConcurrentlyAndApplyChanges$2", f = "Recomposer.kt", i = {0, 0, 0, 1}, l = {840, 860, 861}, m = "invokeSuspend", n = {"recomposeCoroutineScope", "frameSignal", "frameLoop", "frameLoop"}, s = {"L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes.dex */
final class Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 extends SuspendLambda implements Function3<CoroutineScope, MonotonicFrameClock, Continuation<? super Unit>, Object> {
    final /* synthetic */ CoroutineContext $recomposeCoroutineContext;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(CoroutineContext coroutineContext, Recomposer recomposer, Continuation<? super Recomposer$runRecomposeConcurrentlyAndApplyChanges$2> continuation) {
        super(3, continuation);
        this.$recomposeCoroutineContext = coroutineContext;
        this.this$0 = recomposer;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(CoroutineScope coroutineScope, MonotonicFrameClock monotonicFrameClock, Continuation<? super Unit> continuation) {
        Recomposer$runRecomposeConcurrentlyAndApplyChanges$2 recomposer$runRecomposeConcurrentlyAndApplyChanges$2 = new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2(this.$recomposeCoroutineContext, this.this$0, continuation);
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$0 = coroutineScope;
        recomposer$runRecomposeConcurrentlyAndApplyChanges$2.L$1 = monotonicFrameClock;
        return recomposer$runRecomposeConcurrentlyAndApplyChanges$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0196 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0162  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x00ae -> B:17:0x003a). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Job launch$default;
        CoroutineScope coroutineScope;
        ProduceFrameSignal produceFrameSignal;
        boolean shouldKeepRecomposing;
        Object awaitWorkAvailable;
        boolean hasConcurrentFrameWorkLocked;
        Continuation<Unit> requestFrameLocked;
        int i;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = this.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            MonotonicFrameClock monotonicFrameClock = (MonotonicFrameClock) this.L$1;
            boolean z = this.$recomposeCoroutineContext.get(Job.INSTANCE) == null;
            CoroutineContext coroutineContext = this.$recomposeCoroutineContext;
            if (!z) {
                throw new IllegalArgumentException(("recomposeCoroutineContext may not contain a Job; found " + coroutineContext.get(Job.INSTANCE)).toString());
            }
            CoroutineScope CoroutineScope = CoroutineScopeKt.CoroutineScope(coroutineScope2.getCoroutineContext().plus(this.$recomposeCoroutineContext).plus(JobKt.Job(JobKt.getJob(coroutineScope2.getCoroutineContext()))));
            ProduceFrameSignal produceFrameSignal2 = new ProduceFrameSignal();
            launch$default = BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$frameLoop$1(this.this$0, monotonicFrameClock, produceFrameSignal2, null), 3, null);
            coroutineScope = CoroutineScope;
            produceFrameSignal = produceFrameSignal2;
            shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
            if (!shouldKeepRecomposing) {
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                launch$default = (Job) this.L$0;
                ResultKt.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 3;
                if (JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            }
            launch$default = (Job) this.L$2;
            produceFrameSignal = (ProduceFrameSignal) this.L$1;
            coroutineScope = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope3 = coroutineScope;
            Recomposer recomposer = this.this$0;
            IdentityArraySet identityArraySet = recomposer.snapshotInvalidations;
            if (identityArraySet.isNotEmpty()) {
                List knownCompositions = recomposer.getKnownCompositions();
                int size = knownCompositions.size();
                for (int i3 = 0; i3 < size; i3++) {
                    ((ControlledComposition) knownCompositions.get(i3)).recordModificationsOf(identityArraySet);
                }
                recomposer.snapshotInvalidations = new IdentityArraySet();
            }
            List list = recomposer.compositionInvalidations;
            int size2 = list.size();
            int i4 = 0;
            while (i4 < size2) {
                ControlledComposition controlledComposition = (ControlledComposition) list.get(i4);
                synchronized (recomposer.stateLock) {
                    i = recomposer.concurrentCompositionsOutstanding;
                    recomposer.concurrentCompositionsOutstanding = i + 1;
                }
                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, CompositionKt.getRecomposeCoroutineContext(controlledComposition), null, new Recomposer$runRecomposeConcurrentlyAndApplyChanges$2$2$2(recomposer, controlledComposition, null), 2, null);
                i4++;
                size2 = size2;
                recomposer = recomposer;
            }
            Recomposer recomposer2 = recomposer;
            recomposer2.compositionInvalidations.clear();
            if (recomposer2.deriveStateLocked() != null) {
                Object obj2 = this.this$0.stateLock;
                Recomposer recomposer3 = this.this$0;
                synchronized (obj2) {
                    hasConcurrentFrameWorkLocked = recomposer3.getHasConcurrentFrameWorkLocked();
                    requestFrameLocked = hasConcurrentFrameWorkLocked ? produceFrameSignal.requestFrameLocked() : null;
                }
                if (requestFrameLocked != null) {
                    Result.Companion companion = Result.INSTANCE;
                    requestFrameLocked.resumeWith(Result.m6239constructorimpl(Unit.INSTANCE));
                }
                coroutineScope = coroutineScope3;
                shouldKeepRecomposing = this.this$0.getShouldKeepRecomposing();
                if (!shouldKeepRecomposing) {
                    this.L$0 = coroutineScope;
                    this.L$1 = produceFrameSignal;
                    this.L$2 = launch$default;
                    this.label = 1;
                    awaitWorkAvailable = this.this$0.awaitWorkAvailable(this);
                    if (awaitWorkAvailable == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    CoroutineScope coroutineScope32 = coroutineScope;
                    Recomposer recomposer4 = this.this$0;
                    IdentityArraySet identityArraySet2 = recomposer4.snapshotInvalidations;
                    if (identityArraySet2.isNotEmpty()) {
                    }
                    List list2 = recomposer4.compositionInvalidations;
                    int size22 = list2.size();
                    int i42 = 0;
                    while (i42 < size22) {
                    }
                    Recomposer recomposer22 = recomposer4;
                    recomposer22.compositionInvalidations.clear();
                    if (recomposer22.deriveStateLocked() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges".toString());
                    }
                } else {
                    this.L$0 = launch$default;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 2;
                    if (JobKt.cancelAndJoin(JobKt.getJob(coroutineScope.getCoroutineContext()), this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    this.L$0 = null;
                    this.label = 3;
                    if (JobKt.cancelAndJoin(launch$default, this) == coroutine_suspended) {
                    }
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
