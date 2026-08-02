package com.squareup.cash.fidesmo.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ ServiceDeliveryClient $activeDeliveryClient;
    public final /* synthetic */ long $attemptId;
    public final /* synthetic */ ProducerScope $this_startPostDisconnectStabilityCheck;
    public /* synthetic */ int I$0;
    public /* synthetic */ int I$1;
    public int label;
    public final /* synthetic */ RealFidesmoClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1(long j, RealFidesmoClient realFidesmoClient, ServiceDeliveryClient serviceDeliveryClient, ProducerScope producerScope, Continuation continuation) {
        super(3, continuation);
        this.$attemptId = j;
        this.this$0 = realFidesmoClient;
        this.$activeDeliveryClient = serviceDeliveryClient;
        this.$this_startPostDisconnectStabilityCheck = producerScope;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        ServiceDeliveryClient serviceDeliveryClient = this.$activeDeliveryClient;
        ProducerScope producerScope = this.$this_startPostDisconnectStabilityCheck;
        RealFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1 realFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1 = new RealFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1(this.$attemptId, this.this$0, serviceDeliveryClient, producerScope, (Continuation) obj3);
        realFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1.I$0 = intValue;
        realFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1.I$1 = intValue2;
        return realFidesmoClient$startPostDisconnectStabilityCheck$1$isStable$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        int i2 = this.I$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            RealFidesmoClient realFidesmoClient = this.this$0;
            if (this.$attemptId == realFidesmoClient.activeDeliveryReconnectAttempt.get() && RealFidesmoClient.access$isActiveDelivery(realFidesmoClient, this.$activeDeliveryClient)) {
                FidesmoDeviceState.CheckingStability checkingStability = new FidesmoDeviceState.CheckingStability(i, i2);
                this.I$0 = i;
                this.I$1 = i2;
                this.label = 1;
                if (((ProducerCoroutine) this.$this_startPostDisconnectStabilityCheck)._channel.send(checkingStability, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
        } else {
            if (i3 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
