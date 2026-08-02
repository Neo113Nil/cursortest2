package androidx.paging;

import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class SimpleChannelFlowKt$simpleChannelFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Function2 $block;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleChannelFlowKt$simpleChannelFlow$1(Function2 function2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Function2 function2 = this.$block;
        switch (i) {
            case 0:
                SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(function2, continuation, 0);
                simpleChannelFlowKt$simpleChannelFlow$1.L$0 = obj;
                return simpleChannelFlowKt$simpleChannelFlow$1;
            case 1:
                SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$12 = new SimpleChannelFlowKt$simpleChannelFlow$1(function2, continuation, 1);
                simpleChannelFlowKt$simpleChannelFlow$12.L$0 = obj;
                return simpleChannelFlowKt$simpleChannelFlow$12;
            case 2:
                SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$13 = new SimpleChannelFlowKt$simpleChannelFlow$1(function2, continuation, 2);
                simpleChannelFlowKt$simpleChannelFlow$13.L$0 = obj;
                return simpleChannelFlowKt$simpleChannelFlow$13;
            case 3:
                SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$14 = new SimpleChannelFlowKt$simpleChannelFlow$1(function2, continuation, 3);
                simpleChannelFlowKt$simpleChannelFlow$14.L$0 = obj;
                return simpleChannelFlowKt$simpleChannelFlow$14;
            default:
                SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$15 = new SimpleChannelFlowKt$simpleChannelFlow$1(function2, continuation, 4);
                simpleChannelFlowKt$simpleChannelFlow$15.L$0 = obj;
                return simpleChannelFlowKt$simpleChannelFlow$15;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((SimpleChannelFlowKt$simpleChannelFlow$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((SimpleChannelFlowKt$simpleChannelFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((SimpleChannelFlowKt$simpleChannelFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((SimpleChannelFlowKt$simpleChannelFlow$1) create(obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((SimpleChannelFlowKt$simpleChannelFlow$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Function2 function2 = this.$block;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    FlowExtKt$simpleScan$1 flowExtKt$simpleScan$1 = new FlowExtKt$simpleScan$1((FlowCollector) this.L$0, function2, continuation, 27);
                    this.label = 1;
                    if (JobKt.coroutineScope(flowExtKt$simpleScan$1, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (function2.invoke(coroutineScope, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    obj = function2.invoke(coroutineScope2, this);
                    if (obj == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return CollectionsKt__CollectionsJVMKt.listOf(obj);
            case 3:
                Object obj2 = this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 != 0) {
                    if (i5 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        return obj;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.L$0 = null;
                this.label = 1;
                Object invoke = function2.invoke(obj2, this);
                return invoke == coroutineSingletons4 ? coroutineSingletons4 : invoke;
            default:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = null;
                    this.label = 1;
                    if (function2.invoke(coroutineScope3, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }
}
