package com.squareup.cash.phoneplans;

import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.franklin.api.PhonePlanESimCheckBlocker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes8.dex */
public final class PhonePlansEsimCheckPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ WorkHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhonePlansEsimCheckPresenter$models$1$1(WorkHomePresenter workHomePresenter, Continuation continuation) {
        super(2, continuation);
        this.this$0 = workHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PhonePlansEsimCheckPresenter$models$1$1(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((PhonePlansEsimCheckPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        WorkHomePresenter workHomePresenter = this.this$0;
        if (((PhonePlansEsimCheckBlockerScreen) workHomePresenter.shiftSection2Presenter).blocker.compatibility_check_method instanceof PhonePlanESimCheckBlocker.CompatibilityCheckMethod.IosDeviceModelPredicate) {
            ((ErrorReporter) workHomePresenter.titleBarPresenter).report(new IosDeviceModelPredicateOnAndroidError(), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        }
        return Unit.INSTANCE;
    }
}
