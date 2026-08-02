package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.ClipOp;
import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.cdf.offers.OfferRequestStatus;
import com.squareup.cash.cdf.offers.OffersSearchQueryComplete;
import com.squareup.cash.cdf.offers.OffersSearchQueryStart;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersTabRepository$SearchSource;
import com.squareup.cash.offers.backend.api.TrackingAction;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealSearchTrackingManager;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersCommonOfferRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealOffersSearchPresenter$models$2$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ State $activeBoostToken$delegate;
    public final /* synthetic */ MutableState $currentIsLoadingFullscreenEnabled$delegate;
    public final /* synthetic */ MutableState $filterTokens$delegate;
    public final /* synthetic */ MutableState $isLastSearchRequestSuccessful$delegate;
    public final /* synthetic */ MutableState $lastResponse$delegate;
    public final /* synthetic */ MutableState $lastTrackedSessionId$delegate;
    public final /* synthetic */ MutableState $listViewModel$delegate;
    public final /* synthetic */ MutableState $previousSearchText$delegate;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $responseId$delegate;
    public final /* synthetic */ MutableState $searchText$delegate;
    public final /* synthetic */ MutableState $searchWithoutDelay$delegate;
    public final /* synthetic */ MutableState $useResultsFromCache$delegate;
    public int I$0;
    public String L$0;
    public OffersTabRepository$SearchSource L$1;
    public boolean Z$0;
    public int label;
    public final /* synthetic */ RealOffersSearchPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealOffersSearchPresenter$models$2$1(RealOffersSearchPresenter realOffersSearchPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8, MutableState mutableState9, MutableState mutableState10, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, State state, Continuation continuation) {
        super(2, continuation);
        this.this$0 = realOffersSearchPresenter;
        this.$searchText$delegate = mutableState;
        this.$filterTokens$delegate = mutableState2;
        this.$useResultsFromCache$delegate = mutableState3;
        this.$lastResponse$delegate = mutableState4;
        this.$searchWithoutDelay$delegate = mutableState5;
        this.$previousSearchText$delegate = mutableState6;
        this.$currentIsLoadingFullscreenEnabled$delegate = mutableState7;
        this.$listViewModel$delegate = mutableState8;
        this.$isLastSearchRequestSuccessful$delegate = mutableState9;
        this.$lastTrackedSessionId$delegate = mutableState10;
        this.$responseId$delegate = parcelableSnapshotMutableIntState;
        this.$activeBoostToken$delegate = state;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RealOffersSearchPresenter$models$2$1(this.this$0, this.$searchText$delegate, this.$filterTokens$delegate, this.$useResultsFromCache$delegate, this.$lastResponse$delegate, this.$searchWithoutDelay$delegate, this.$previousSearchText$delegate, this.$currentIsLoadingFullscreenEnabled$delegate, this.$listViewModel$delegate, this.$isLastSearchRequestSuccessful$delegate, this.$lastTrackedSessionId$delegate, this.$responseId$delegate, this.$activeBoostToken$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((RealOffersSearchPresenter$models$2$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x01d6, code lost:
    
        if (r0 == r12) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x014f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        int i;
        MutableState mutableState;
        MutableState mutableState2;
        MutableState mutableState3;
        OffersTabRepository$SearchSource offersTabRepository$SearchSource;
        boolean z;
        int i2;
        boolean z2;
        RealOffersSearchPresenter$$ExternalSyntheticLambda4 realOffersSearchPresenter$$ExternalSyntheticLambda4;
        ApiResult.Failure failure;
        String str2;
        Object search;
        Object constructSearchErrorViewModel;
        Long l;
        OfferRequestStatus offerRequestStatus;
        OfferRequestStatus offerRequestStatus2;
        ListBuilder.Itr itr;
        RealOffersSearchPresenter$Companion$SearchResult realOffersSearchPresenter$Companion$SearchResult;
        ListBuilder.Itr itr2;
        RealOffersSearchPresenter realOffersSearchPresenter = this.this$0;
        ParcelableSnapshotMutableState parcelableSnapshotMutableState = realOffersSearchPresenter.isLoadingSearchResults$delegate;
        RealSearchTrackingManager realSearchTrackingManager = realOffersSearchPresenter.trackingManager;
        RealOffersAnalytics realOffersAnalytics = realOffersSearchPresenter.analytics;
        RealOffersAnalyticsHelper realOffersAnalyticsHelper = realOffersSearchPresenter.analyticsHelper;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        MutableState mutableState4 = this.$searchWithoutDelay$delegate;
        MutableState mutableState5 = this.$listViewModel$delegate;
        MutableState mutableState6 = this.$useResultsFromCache$delegate;
        MutableState mutableState7 = this.$lastResponse$delegate;
        MutableState mutableState8 = this.$filterTokens$delegate;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            str = (String) this.$searchText$delegate.getValue();
            if (str == null) {
                return Unit.INSTANCE;
            }
            i = (str.length() == 0 && ((Set) mutableState8.getValue()).isEmpty()) ? 1 : 0;
            boolean booleanValue = ((Boolean) parcelableSnapshotMutableState.getValue()).booleanValue();
            OffersTabRepository$SearchSource offersTabRepository$SearchSource2 = (i != 0 || ((Boolean) mutableState6.getValue()).booleanValue()) ? OffersTabRepository$SearchSource.FROM_CACHE : OffersTabRepository$SearchSource.ALWAYS_REMOTE;
            mutableState = mutableState8;
            mutableState7.setValue(null);
            parcelableSnapshotMutableState.setValue(Boolean.TRUE);
            if (str.length() > 0 && !((Boolean) mutableState4.getValue()).booleanValue() && !((Boolean) mutableState6.getValue()).booleanValue()) {
                mutableState2 = mutableState6;
                mutableState3 = mutableState7;
                long j = realOffersSearchPresenter.searchInputDelay;
                this.L$0 = str;
                this.L$1 = offersTabRepository$SearchSource2;
                this.I$0 = i;
                this.Z$0 = booleanValue;
                this.label = 1;
                if (JobKt.delay(j, this) != coroutineSingletons) {
                    i2 = i;
                    z2 = booleanValue;
                    offersTabRepository$SearchSource = offersTabRepository$SearchSource2;
                }
                return coroutineSingletons;
            }
            mutableState2 = mutableState6;
            mutableState3 = mutableState7;
            offersTabRepository$SearchSource = offersTabRepository$SearchSource2;
            z = booleanValue;
            MutableState mutableState9 = this.$previousSearchText$delegate;
            if (z) {
                realOffersAnalytics.track(new OffersSearchQueryComplete(realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP), null, realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SEARCH), (String) mutableState9.getValue(), null, realOffersSearchPresenter.getSearchFilterTokens(), OfferRequestStatus.CANCELLED, 77), null);
            }
            mutableState9.setValue(str);
            realOffersAnalytics.track(new OffersSearchQueryStart(realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP), null, realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SEARCH), str, null, realOffersSearchPresenter.getSearchFilterTokens(), 77), null);
            if (((Set) mutableState.getValue()).isEmpty()) {
                realSearchTrackingManager.onAction(new TrackingAction.StartTracking((Set) mutableState.getValue()));
                realOffersSearchPresenter$$ExternalSyntheticLambda4 = realOffersSearchPresenter.trackingAction;
            } else {
                realOffersSearchPresenter$$ExternalSyntheticLambda4 = null;
            }
            mutableState4.setValue(Boolean.FALSE);
            realOffersSearchPresenter.spanTracking = (str.length() <= 0 && ((Set) mutableState.getValue()).isEmpty()) ? null : RealObservabilityManager.startTrackingSpan$default(realOffersSearchPresenter.observabilityManager, null, "offers_search_queryOfferSearch", null, null, 12);
            RealOffersSearchPresenter$$ExternalSyntheticLambda4 realOffersSearchPresenter$$ExternalSyntheticLambda42 = realOffersSearchPresenter$$ExternalSyntheticLambda4;
            ScoreSummaryKt$$ExternalSyntheticLambda1 scoreSummaryKt$$ExternalSyntheticLambda1 = new ScoreSummaryKt$$ExternalSyntheticLambda1(this.$currentIsLoadingFullscreenEnabled$delegate, mutableState5, 7);
            this.L$0 = str;
            this.L$1 = null;
            this.I$0 = i;
            this.Z$0 = z;
            this.label = 2;
            failure = null;
            str2 = str;
            search = realOffersSearchPresenter.offersTabRepository.search(str2, CollectionsKt.joinToString$default((Set) mutableState.getValue(), ",", null, null, 0, null, null, 62), offersTabRepository$SearchSource, scoreSummaryKt$$ExternalSyntheticLambda1, realOffersSearchPresenter$$ExternalSyntheticLambda42, this);
        } else {
            if (i3 != 1) {
                if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                String str3 = this.L$0;
                SafeTrace.throwOnFailure(obj);
                str2 = str3;
                mutableState = mutableState8;
                mutableState2 = mutableState6;
                mutableState3 = mutableState7;
                search = obj;
                failure = null;
                ApiResult apiResult = (ApiResult) search;
                Boolean bool = Boolean.FALSE;
                MutableState mutableState10 = this.$isLastSearchRequestSuccessful$delegate;
                mutableState10.setValue(bool);
                mutableState2.setValue(bool);
                realSearchTrackingManager.onAction(TrackingAction.StartMapping.INSTANCE);
                boolean z3 = apiResult instanceof ApiResult.Success;
                if (z3) {
                    realOffersAnalytics.clearCache();
                    OffersTabSearchResponse offersTabSearchResponse = (OffersTabSearchResponse) ((ApiResult.Success) apiResult).response;
                    MutableState mutableState11 = mutableState3;
                    mutableState11.setValue(offersTabSearchResponse);
                    MutableState mutableState12 = this.$lastTrackedSessionId$delegate;
                    ApiResult.Failure failure2 = failure;
                    if (!Intrinsics.areEqual((String) mutableState12.getValue(), realOffersAnalyticsHelper.activeShopSessionId())) {
                        AnalyticsEvent analyticsEvent = offersTabSearchResponse.analytics_view_event;
                        if (analyticsEvent == null) {
                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: OffersSearchTabResponse.analytics_view_event == null");
                            return failure2;
                        }
                        RealOffersAnalytics.trackGenericAnalyticsEvent$default(realOffersAnalytics, ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent));
                        mutableState12.setValue(realOffersAnalyticsHelper.activeShopSessionId());
                    }
                    AnalyticsEvent analyticsEvent2 = offersTabSearchResponse.analytics_view_query_event;
                    if (analyticsEvent2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: OffersSearchTabResponse.analytics_view_query_event == null");
                        return failure2;
                    }
                    RealOffersAnalytics.trackGenericAnalyticsEvent$default(realOffersAnalytics, ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent2));
                    OffersTabSearchResponse offersTabSearchResponse2 = (OffersTabSearchResponse) mutableState11.getValue();
                    this.$responseId$delegate.setIntValue(offersTabSearchResponse2 != null ? offersTabSearchResponse2.hashCode() : 0);
                    ListBuilder searchListItems = ClipOp.toSearchListItems(offersTabSearchResponse, (String) this.$activeBoostToken$delegate.getValue());
                    if (!((Set) mutableState.getValue()).isEmpty()) {
                        if (str2 != null && str2.length() != 0) {
                            if (searchListItems == null || !searchListItems.isEmpty()) {
                                ListIterator listIterator = searchListItems.listIterator(0);
                                do {
                                    itr2 = (ListBuilder.Itr) listIterator;
                                    if (itr2.hasNext()) {
                                    }
                                } while (!(((OffersSearchListItemViewModel) itr2.next()) instanceof OffersCommonOfferRowViewModel));
                                realOffersSearchPresenter$Companion$SearchResult = RealOffersSearchPresenter$Companion$SearchResult.FILTERED_NON_EMPTY;
                            }
                            realOffersSearchPresenter$Companion$SearchResult = RealOffersSearchPresenter$Companion$SearchResult.FILTERED_EMPTY;
                            break;
                        } else {
                            realOffersSearchPresenter$Companion$SearchResult = RealOffersSearchPresenter$Companion$SearchResult.FILTERED_NULL_STATE;
                        }
                    } else {
                        if (searchListItems == null || !searchListItems.isEmpty()) {
                            ListIterator listIterator2 = searchListItems.listIterator(0);
                            do {
                                itr = (ListBuilder.Itr) listIterator2;
                                if (itr.hasNext()) {
                                }
                            } while (!(((OffersSearchListItemViewModel) itr.next()) instanceof OffersCommonOfferRowViewModel));
                            realOffersSearchPresenter$Companion$SearchResult = RealOffersSearchPresenter$Companion$SearchResult.NON_EMPTY;
                        }
                        realOffersSearchPresenter$Companion$SearchResult = RealOffersSearchPresenter$Companion$SearchResult.EMPTY;
                        break;
                    }
                    RealOffersSearchPresenter.access$recordSearchSpan(realOffersSearchPresenter, str2, realOffersSearchPresenter$Companion$SearchResult);
                    if (searchListItems.isEmpty()) {
                        constructSearchErrorViewModel = realOffersSearchPresenter.constructSearchErrorViewModel(failure2);
                    } else {
                        mutableState10.setValue(Boolean.TRUE);
                        constructSearchErrorViewModel = new OffersSearchViewModel.OffersSearchListViewModel.Loaded(searchListItems);
                    }
                } else {
                    MutableState mutableState13 = mutableState3;
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return failure;
                    }
                    RealOffersSearchPresenter.access$recordSearchSpan(realOffersSearchPresenter, str2, RealOffersSearchPresenter$Companion$SearchResult.FAILURE);
                    mutableState13.setValue(failure);
                    constructSearchErrorViewModel = realOffersSearchPresenter.constructSearchErrorViewModel((ApiResult.Failure) apiResult);
                }
                mutableState5.setValue(constructSearchErrorViewModel);
                realSearchTrackingManager.onAction(TrackingAction.EndMapping.INSTANCE);
                String flowToken = realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP);
                String flowToken2 = realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SEARCH);
                String searchFilterTokens = realOffersSearchPresenter.getSearchFilterTokens();
                if (((OffersSearchViewModel.OffersSearchListViewModel) mutableState5.getValue()) instanceof OffersSearchViewModel.OffersSearchListViewModel.Loaded) {
                    offerRequestStatus2 = OfferRequestStatus.SUCCESS;
                } else {
                    if (!(apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                        if (!(apiResult instanceof ApiResult.Failure.HttpFailure) && !z3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        l = null;
                        offerRequestStatus = OfferRequestStatus.LOGICAL_ERROR;
                        realOffersAnalytics.track(new OffersSearchQueryComplete(flowToken, null, flowToken2, str2, null, searchFilterTokens, offerRequestStatus, 77), l);
                        Boolean bool2 = Boolean.FALSE;
                        parcelableSnapshotMutableState.setValue(bool2);
                        realOffersSearchPresenter.isLoadingFullscreen$delegate.setValue(bool2);
                        realSearchTrackingManager.onAction(TrackingAction.EndTracking.INSTANCE);
                        return Unit.INSTANCE;
                    }
                    offerRequestStatus2 = OfferRequestStatus.NETWORK_ERROR;
                }
                offerRequestStatus = offerRequestStatus2;
                l = null;
                realOffersAnalytics.track(new OffersSearchQueryComplete(flowToken, null, flowToken2, str2, null, searchFilterTokens, offerRequestStatus, 77), l);
                Boolean bool22 = Boolean.FALSE;
                parcelableSnapshotMutableState.setValue(bool22);
                realOffersSearchPresenter.isLoadingFullscreen$delegate.setValue(bool22);
                realSearchTrackingManager.onAction(TrackingAction.EndTracking.INSTANCE);
                return Unit.INSTANCE;
            }
            z2 = this.Z$0;
            i2 = this.I$0;
            offersTabRepository$SearchSource = this.L$1;
            str = this.L$0;
            SafeTrace.throwOnFailure(obj);
            mutableState = mutableState8;
            mutableState2 = mutableState6;
            mutableState3 = mutableState7;
        }
        int i4 = i2;
        z = z2;
        i = i4;
        MutableState mutableState92 = this.$previousSearchText$delegate;
        if (z) {
        }
        mutableState92.setValue(str);
        realOffersAnalytics.track(new OffersSearchQueryStart(realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SHOP), null, realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.SEARCH), str, null, realOffersSearchPresenter.getSearchFilterTokens(), 77), null);
        if (((Set) mutableState.getValue()).isEmpty()) {
        }
        mutableState4.setValue(Boolean.FALSE);
        if (str.length() <= 0) {
            realOffersSearchPresenter.spanTracking = (str.length() <= 0 && ((Set) mutableState.getValue()).isEmpty()) ? null : RealObservabilityManager.startTrackingSpan$default(realOffersSearchPresenter.observabilityManager, null, "offers_search_queryOfferSearch", null, null, 12);
            RealOffersSearchPresenter$$ExternalSyntheticLambda4 realOffersSearchPresenter$$ExternalSyntheticLambda422 = realOffersSearchPresenter$$ExternalSyntheticLambda4;
            ScoreSummaryKt$$ExternalSyntheticLambda1 scoreSummaryKt$$ExternalSyntheticLambda12 = new ScoreSummaryKt$$ExternalSyntheticLambda1(this.$currentIsLoadingFullscreenEnabled$delegate, mutableState5, 7);
            this.L$0 = str;
            this.L$1 = null;
            this.I$0 = i;
            this.Z$0 = z;
            this.label = 2;
            failure = null;
            str2 = str;
            search = realOffersSearchPresenter.offersTabRepository.search(str2, CollectionsKt.joinToString$default((Set) mutableState.getValue(), ",", null, null, 0, null, null, 62), offersTabRepository$SearchSource, scoreSummaryKt$$ExternalSyntheticLambda12, realOffersSearchPresenter$$ExternalSyntheticLambda422, this);
        }
        realOffersSearchPresenter.spanTracking = (str.length() <= 0 && ((Set) mutableState.getValue()).isEmpty()) ? null : RealObservabilityManager.startTrackingSpan$default(realOffersSearchPresenter.observabilityManager, null, "offers_search_queryOfferSearch", null, null, 12);
        RealOffersSearchPresenter$$ExternalSyntheticLambda4 realOffersSearchPresenter$$ExternalSyntheticLambda4222 = realOffersSearchPresenter$$ExternalSyntheticLambda4;
        ScoreSummaryKt$$ExternalSyntheticLambda1 scoreSummaryKt$$ExternalSyntheticLambda122 = new ScoreSummaryKt$$ExternalSyntheticLambda1(this.$currentIsLoadingFullscreenEnabled$delegate, mutableState5, 7);
        this.L$0 = str;
        this.L$1 = null;
        this.I$0 = i;
        this.Z$0 = z;
        this.label = 2;
        failure = null;
        str2 = str;
        search = realOffersSearchPresenter.offersTabRepository.search(str2, CollectionsKt.joinToString$default((Set) mutableState.getValue(), ",", null, null, 0, null, null, 62), offersTabRepository$SearchSource, scoreSummaryKt$$ExternalSyntheticLambda122, realOffersSearchPresenter$$ExternalSyntheticLambda4222, this);
    }
}
