package com.squareup.cash.eligibility.backend.real;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.eligibility.backend.api.EligibilityRefreshAnalyticsData;
import com.squareup.cash.eligibility.backend.real.RealFeatureEligibilityRepository;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;
import retrofit2.OkHttpCall;

/* loaded from: classes6.dex */
public final class RealEligibilityRefresher$refreshEligibility$2$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ EligibilityRefreshAnalyticsData $analyticsDataWithCurrentAttempt;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ OkHttpCall.AnonymousClass1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealEligibilityRefresher$refreshEligibility$2$1$1$1(int i, EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData, Continuation continuation, OkHttpCall.AnonymousClass1 anonymousClass1) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = anonymousClass1;
        this.$analyticsDataWithCurrentAttempt = eligibilityRefreshAnalyticsData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData = this.$analyticsDataWithCurrentAttempt;
        OkHttpCall.AnonymousClass1 anonymousClass1 = this.this$0;
        switch (i) {
            case 0:
                return new RealEligibilityRefresher$refreshEligibility$2$1$1$1(0, eligibilityRefreshAnalyticsData, continuation, anonymousClass1);
            default:
                return new RealEligibilityRefresher$refreshEligibility$2$1$1$1(1, eligibilityRefreshAnalyticsData, continuation, anonymousClass1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((RealEligibilityRefresher$refreshEligibility$2$1$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        EligibilityRefreshAnalyticsData eligibilityRefreshAnalyticsData = this.$analyticsDataWithCurrentAttempt;
        OkHttpCall.AnonymousClass1 anonymousClass1 = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealSettingsEligibilityManager realSettingsEligibilityManager = (RealSettingsEligibilityManager) anonymousClass1.val$callback;
                    this.label = 1;
                    if (realSettingsEligibilityManager.refresh(eligibilityRefreshAnalyticsData, this) == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealFeatureEligibilityRepository realFeatureEligibilityRepository = (RealFeatureEligibilityRepository) anonymousClass1.this$0;
                    this.label = 1;
                    Object withContext = JobKt.withContext(realFeatureEligibilityRepository.ioDispatcher, new EarningsHomePresenter$models$3$1(realFeatureEligibilityRepository, new RealFeatureEligibilityRepository.UpdateEligibilityRequest.Forced(eligibilityRefreshAnalyticsData), (Continuation) null), this);
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext != obj2) {
                        withContext = Unit.INSTANCE;
                    }
                    if (withContext == obj2) {
                        break;
                    }
                } else if (i3 != 1) {
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
