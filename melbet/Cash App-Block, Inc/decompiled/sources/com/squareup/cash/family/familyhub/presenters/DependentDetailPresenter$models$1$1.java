package com.squareup.cash.family.familyhub.presenters;

import app.cash.molecule.PlatformKt;
import com.squareup.cash.activity.presenters.ActivityItemCallbackEvent;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountManageStart;
import com.squareup.cash.cdf.sponsoredaccount.SponsoredAccountReviewActivityTapSeeAll;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.savings.presenters.SavingsScreenPresenter;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class DependentDetailPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ SavingsScreenPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DependentDetailPresenter$models$1$1(SavingsScreenPresenter savingsScreenPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = savingsScreenPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        SavingsScreenPresenter savingsScreenPresenter = this.this$0;
        switch (i) {
            case 0:
                DependentDetailPresenter$models$1$1 dependentDetailPresenter$models$1$1 = new DependentDetailPresenter$models$1$1(savingsScreenPresenter, continuation, 0);
                dependentDetailPresenter$models$1$1.L$0 = obj;
                return dependentDetailPresenter$models$1$1;
            default:
                DependentDetailPresenter$models$1$1 dependentDetailPresenter$models$1$12 = new DependentDetailPresenter$models$1$1(savingsScreenPresenter, continuation, 1);
                dependentDetailPresenter$models$1$12.L$0 = obj;
                return dependentDetailPresenter$models$1$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((DependentDetailPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((DependentDetailPresenter$models$1$1) create((ActivityItemCallbackEvent) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        Continuation continuation = null;
        SavingsScreenPresenter savingsScreenPresenter = this.this$0;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                CoroutineScope coroutineScope = (CoroutineScope) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                savingsScreenPresenter.analytics.track(new SponsoredAccountManageStart(PlatformKt.activeAccountToken(savingsScreenPresenter.sessionManager), ((DependentDetailScreen) savingsScreenPresenter.oneErrorPerAppSessionStrategy).dependentCustomerToken), null);
                JobKt.launch$default(coroutineScope, null, null, new DependentDetailPresenter$models$3$1(savingsScreenPresenter, continuation, 1), 3);
                JobKt.launch$default(coroutineScope, null, null, new DependentDetailPresenter$models$3$1(savingsScreenPresenter, continuation, 2), 3);
                break;
            default:
                ActivityItemCallbackEvent activityItemCallbackEvent = (ActivityItemCallbackEvent) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (activityItemCallbackEvent == ActivityItemCallbackEvent.AnalyticsEvent.ItemTapped) {
                    savingsScreenPresenter.analytics.track(new SponsoredAccountReviewActivityTapSeeAll(PlatformKt.activeAccountToken(savingsScreenPresenter.sessionManager), ((DependentDetailScreen) savingsScreenPresenter.oneErrorPerAppSessionStrategy).dependentCustomerToken), null);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
