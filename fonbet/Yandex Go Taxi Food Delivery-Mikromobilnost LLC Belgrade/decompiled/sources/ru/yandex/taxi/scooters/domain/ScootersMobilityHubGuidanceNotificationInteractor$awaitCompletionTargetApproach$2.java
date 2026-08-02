package ru.yandex.taxi.scooters.domain;

import defpackage.cyn0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s0o0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ls0o0;", "guidanceData", "", "<anonymous>", "(Ls0o0;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.scooters.domain.ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2", f = "ScootersMobilityHubGuidanceNotificationInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2 extends SuspendLambda implements wls {
    final /* synthetic */ cyn0 $mobilityHubContext;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2(cyn0 cyn0Var, Continuation continuation) {
        super(2, continuation);
        this.$mobilityHubContext = cyn0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2 scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2 = new ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2(this.$mobilityHubContext, continuation);
        scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2.L$0 = obj;
        return scootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersMobilityHubGuidanceNotificationInteractor$awaitCompletionTargetApproach$2) create((s0o0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s0o0 s0o0Var = (s0o0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return Boolean.valueOf(s0o0Var.a <= ((double) this.$mobilityHubContext.d));
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
