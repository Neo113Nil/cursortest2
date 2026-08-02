package androidx.compose.runtime;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class SnapshotStateKt__ProduceStateKt$produceState$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function2 $producer;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $result;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SnapshotStateKt__ProduceStateKt$produceState$1$1(Function2 function2, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$producer = function2;
        this.$result = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                SnapshotStateKt__ProduceStateKt$produceState$1$1 snapshotStateKt__ProduceStateKt$produceState$1$1 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(this.$producer, this.$result, continuation, 0);
                snapshotStateKt__ProduceStateKt$produceState$1$1.L$0 = obj;
                return snapshotStateKt__ProduceStateKt$produceState$1$1;
            case 1:
                SnapshotStateKt__ProduceStateKt$produceState$1$1 snapshotStateKt__ProduceStateKt$produceState$1$12 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(this.$producer, this.$result, continuation, 1);
                snapshotStateKt__ProduceStateKt$produceState$1$12.L$0 = obj;
                return snapshotStateKt__ProduceStateKt$produceState$1$12;
            default:
                SnapshotStateKt__ProduceStateKt$produceState$1$1 snapshotStateKt__ProduceStateKt$produceState$1$13 = new SnapshotStateKt__ProduceStateKt$produceState$1$1(this.$producer, this.$result, continuation, 2);
                snapshotStateKt__ProduceStateKt$produceState$1$13.L$0 = obj;
                return snapshotStateKt__ProduceStateKt$produceState$1$13;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SnapshotStateKt__ProduceStateKt$produceState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$result;
        Function2 function2 = this.$producer;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProduceStateScopeImpl produceStateScopeImpl = new ProduceStateScopeImpl(mutableState, ((CoroutineScope) this.L$0).getCoroutineContext());
                    this.label = 1;
                    if (function2.invoke(produceStateScopeImpl, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProduceStateScopeImpl produceStateScopeImpl2 = new ProduceStateScopeImpl(mutableState, ((CoroutineScope) this.L$0).getCoroutineContext());
                    this.label = 1;
                    if (function2.invoke(produceStateScopeImpl2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ProduceStateScopeImpl produceStateScopeImpl3 = new ProduceStateScopeImpl(mutableState, ((CoroutineScope) this.L$0).getCoroutineContext());
                    this.label = 1;
                    if (function2.invoke(produceStateScopeImpl3, this) == coroutineSingletons3) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
