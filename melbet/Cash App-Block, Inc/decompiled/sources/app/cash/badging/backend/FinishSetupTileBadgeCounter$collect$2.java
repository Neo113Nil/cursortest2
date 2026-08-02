package app.cash.badging.backend;

import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function3;
import papa.SafeTrace;

/* loaded from: classes.dex */
public final class FinishSetupTileBadgeCounter$collect$2 extends SuspendLambda implements Function3 {
    public /* synthetic */ long J$0;
    public /* synthetic */ FeatureFlag$EnabledDisabledAmplitudeExperiment$Options L$0;

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long longValue = ((Number) obj2).longValue();
        FinishSetupTileBadgeCounter$collect$2 finishSetupTileBadgeCounter$collect$2 = new FinishSetupTileBadgeCounter$collect$2(3, (Continuation) obj3);
        finishSetupTileBadgeCounter$collect$2.L$0 = (FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) obj;
        finishSetupTileBadgeCounter$collect$2.J$0 = longValue;
        return finishSetupTileBadgeCounter$collect$2.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = this.L$0;
        long j = this.J$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        if (!featureFlag$EnabledDisabledAmplitudeExperiment$Options.enabled()) {
            j = 0;
        }
        return new Long(j);
    }
}
