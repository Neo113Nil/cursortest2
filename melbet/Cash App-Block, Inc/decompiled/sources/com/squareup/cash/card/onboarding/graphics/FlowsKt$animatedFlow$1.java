package com.squareup.cash.card.onboarding.graphics;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class FlowsKt$animatedFlow$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ long $durationMs;
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ long J$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ FlowsKt$animatedFlow$1(long j, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$durationMs = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                FlowsKt$animatedFlow$1 flowsKt$animatedFlow$1 = new FlowsKt$animatedFlow$1(this.$durationMs, continuation, 0);
                flowsKt$animatedFlow$1.J$0 = ((Number) obj).longValue();
                return flowsKt$animatedFlow$1;
            default:
                FlowsKt$animatedFlow$1 flowsKt$animatedFlow$12 = new FlowsKt$animatedFlow$1(this.$durationMs, continuation, 1);
                flowsKt$animatedFlow$12.J$0 = ((Number) obj).longValue();
                return flowsKt$animatedFlow$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Number number = (Number) obj;
        switch (this.$r8$classId) {
            case 0:
                return ((FlowsKt$animatedFlow$1) create(Long.valueOf(number.longValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((FlowsKt$animatedFlow$1) create(Long.valueOf(number.longValue()), (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        long j = this.$durationMs;
        long j2 = this.J$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return Boolean.valueOf(j2 < j);
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                return new Float(j2 / j);
        }
    }
}
