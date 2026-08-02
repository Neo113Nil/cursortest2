package com.squareup.cash.fidesmo.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.channels.ProducerScope;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1 extends SuspendLambda implements Function3 {
    public final /* synthetic */ ProducerScope $$this$callbackFlow;
    public final /* synthetic */ long $connectionId;
    public /* synthetic */ int I$0;
    public /* synthetic */ int I$1;
    public int label;
    public final /* synthetic */ RealFidesmoClient this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1(ProducerScope producerScope, long j, RealFidesmoClient realFidesmoClient, Continuation continuation) {
        super(3, continuation);
        this.$$this$callbackFlow = producerScope;
        this.$connectionId = j;
        this.this$0 = realFidesmoClient;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        long j = this.$connectionId;
        RealFidesmoClient realFidesmoClient = this.this$0;
        RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1 realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1 = new RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1(this.$$this$callbackFlow, j, realFidesmoClient, (Continuation) obj3);
        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1.I$0 = intValue;
        realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1.I$1 = intValue2;
        return realFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1$isConnectionStable$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.I$0;
        int i2 = this.I$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            FidesmoDeviceState.CheckingStability checkingStability = new FidesmoDeviceState.CheckingStability(i, i2);
            this.I$0 = i;
            this.I$1 = i2;
            this.label = 1;
            if (RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1.invokeSuspend$sendIfCurrent(this.$$this$callbackFlow, this.$connectionId, this.this$0, checkingStability, this) == coroutineSingletons) {
                return coroutineSingletons;
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
