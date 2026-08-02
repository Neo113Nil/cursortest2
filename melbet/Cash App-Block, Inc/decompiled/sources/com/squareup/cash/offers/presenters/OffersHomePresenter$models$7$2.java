package com.squareup.cash.offers.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersHomePresenter$models$7$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ OffersHomePresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OffersHomePresenter$models$7$2(OffersHomePresenter offersHomePresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = offersHomePresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        OffersHomePresenter offersHomePresenter = this.this$0;
        switch (i) {
            case 0:
                return new OffersHomePresenter$models$7$2(offersHomePresenter, continuation, 0);
            case 1:
                return new OffersHomePresenter$models$7$2(offersHomePresenter, continuation, 1);
            case 2:
                return new OffersHomePresenter$models$7$2(offersHomePresenter, continuation, 2);
            default:
                return new OffersHomePresenter$models$7$2(offersHomePresenter, continuation, 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((OffersHomePresenter$models$7$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        OffersHomePresenter offersHomePresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersSearchPresenter realOffersSearchPresenter = offersHomePresenter.offersSearchPresenter;
                    this.label = 1;
                    realOffersSearchPresenter.isSearchMode$delegate.setValue(Boolean.FALSE);
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper = realOffersSearchPresenter.analyticsHelper;
                    realOffersAnalyticsHelper.searchSourceScreen = "";
                    realOffersAnalyticsHelper.searchSourceSection = "";
                    realOffersAnalyticsHelper.searchSourceFilter = "";
                    if (Unit.INSTANCE == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 1:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersTabRefresher realOffersTabRefresher = offersHomePresenter.offersTabRefresher;
                    OffersTabRepository$SearchSource offersTabRepository$SearchSource = OffersTabRepository$SearchSource.FROM_CACHE;
                    this.label = 1;
                    if (realOffersTabRefresher.refreshSearchNullState(null, offersTabRepository$SearchSource, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.label = 1;
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper2 = offersHomePresenter.analyticsHelper;
                    Object collectLatest = FlowKt.collectLatest(FlowKt.distinctUntilChanged(FlowKt.merge(realOffersAnalyticsHelper2.flowTokenUpdates(OffersAnalyticsHelper$Flow.SHOP), realOffersAnalyticsHelper2.flowTokenUpdates(OffersAnalyticsHelper$Flow.BROWSE))), new OffersHomePresenter$models$1$1$1(offersHomePresenter, null, 1), this);
                    if (collectLatest != obj2) {
                        collectLatest = Unit.INSTANCE;
                    }
                    if (collectLatest == obj2) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealOffersSearchPresenter realOffersSearchPresenter2 = offersHomePresenter.offersSearchPresenter;
                    this.label = 1;
                    realOffersSearchPresenter2.isSearchMode$delegate.setValue(Boolean.FALSE);
                    RealOffersAnalyticsHelper realOffersAnalyticsHelper3 = realOffersSearchPresenter2.analyticsHelper;
                    realOffersAnalyticsHelper3.searchSourceScreen = "";
                    realOffersAnalyticsHelper3.searchSourceSection = "";
                    realOffersAnalyticsHelper3.searchSourceFilter = "";
                    if (Unit.INSTANCE == coroutineSingletons3) {
                        break;
                    }
                } else if (i5 != 1) {
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
