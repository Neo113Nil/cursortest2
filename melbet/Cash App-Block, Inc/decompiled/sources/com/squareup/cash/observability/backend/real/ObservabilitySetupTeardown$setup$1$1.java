package com.squareup.cash.observability.backend.real;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class ObservabilitySetupTeardown$setup$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ ObservabilitySetupTeardown this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ObservabilitySetupTeardown$setup$1$1(ObservabilitySetupTeardown observabilitySetupTeardown, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = observabilitySetupTeardown;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        ObservabilitySetupTeardown observabilitySetupTeardown = this.this$0;
        switch (i) {
            case 0:
                return new ObservabilitySetupTeardown$setup$1$1(observabilitySetupTeardown, continuation, 0);
            default:
                return new ObservabilitySetupTeardown$setup$1$1(observabilitySetupTeardown, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
            case 0:
                return ((ObservabilitySetupTeardown$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            default:
                ((ObservabilitySetupTeardown$setup$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        ObservabilitySetupTeardown observabilitySetupTeardown = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    Object collect = FlowKt.distinctUntilChanged(new FinishSetupTileBadgeCounter(25, new Flow[]{observabilitySetupTeardown.mobileObservabilityEnabledFlow, observabilitySetupTeardown.mobileObservabilityConfigFlow, observabilitySetupTeardown.mobileVitalEnabledFlow, observabilitySetupTeardown.sessionCustomerToken, observabilitySetupTeardown.sessionAppToken}, ObservabilitySetupTeardown$manageDatadogLifecycle$4.INSTANCE)).collect(new ObservabilitySetupTeardown$manageDatadogLifecycle$5(observabilitySetupTeardown, 0), this);
                    if (collect != coroutineSingletons) {
                        collect = Unit.INSTANCE;
                    }
                    if (collect == coroutineSingletons) {
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
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 != 0) {
                    if (i3 == 1) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                SafeTrace.throwOnFailure(obj);
                this.label = 1;
                ObservabilitySetupTeardown.access$populateInteractivitySessionId(observabilitySetupTeardown, this);
                return coroutineSingletons2;
        }
    }
}
