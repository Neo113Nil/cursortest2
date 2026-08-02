package com.squareup.cash.globalsearch.backend.real;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.RealPreLoadedActivitiesManager;
import com.squareup.cash.activity.backend.RealPreLoadedActivitiesManager$Factory$Impl;
import com.squareup.cash.activity.backend.loader.Activities;
import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.LoadingState;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.clientroutes.RealClientRouteFormatter;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.globalsearch.backend.api.LoadMoreResult$Error;
import com.squareup.cash.globalsearch.backend.api.LoadMoreResult$Success;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchResponseSectionModel;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$filter$1;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.recipients.backend.api.RecipientSuggestionsProvider$RecipientWithAnalyticsData;
import com.squareup.cash.recipients.backend.real.RealRecipientSuggestionsProvider;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.discover.api.app.v2.api.SearchRequest;
import com.squareup.protos.cash.discover.api.app.v2.api.SectionPageRequest;
import com.squareup.protos.cash.discover.api.app.v2.api.SectionPageResponse;
import com.squareup.protos.cash.discover.api.app.v2.api.SectionPageResponse$Page$RowSection;
import com.squareup.protos.cash.discover.api.app.v2.model.RowSection;
import com.squareup.protos.cash.discover.api.app.v2.service.GlobalSearchService;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StateFlowImpl;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class RealGlobalSearchRepository {
    public final RealActivityTokenFactory activityTokenFactory;
    public final GlobalSearchService api;
    public String cacheKey;
    public final SharedFlowImpl cachedData = FlowKt.MutableSharedFlow(1, 1, BufferOverflow.DROP_OLDEST);
    public final RealClientRouteFormatter clientRouteFormatter;
    public final FeatureFlagManager featureFlagManager;
    public final RealPreLoadedActivitiesManager$Factory$Impl preLoadedActivitiesManagerFactory;
    public final RealRecipientSuggestionsProvider recipientProvider;
    public final AndroidStringManager stringManager;

    public final class RealSectionHandle {
        public final StateFlowImpl _section;
        public final RealPreLoadedActivitiesManager activitiesManager;
        public final DerivedStateFlow section;
        public final /* synthetic */ RealGlobalSearchRepository this$0;

        public RealSectionHandle(RealGlobalSearchRepository realGlobalSearchRepository, GlobalSearchResponseSectionModel globalSearchResponseSectionModel) {
            globalSearchResponseSectionModel.getClass();
            this.this$0 = realGlobalSearchRepository;
            RealPreLoadedActivitiesManager realPreLoadedActivitiesManager = null;
            if (globalSearchResponseSectionModel instanceof GlobalSearchResponseSectionModel.Activities) {
                realPreLoadedActivitiesManager = realGlobalSearchRepository.preLoadedActivitiesManagerFactory.create(new ActivitiesManager.ActivityContext(RealActivityTokenFactory.create$default(realGlobalSearchRepository.activityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN), ActivityScope.DISCOVER_GLOBAL_SEARCH, (ActivitiesManager.ActivityPageHandler) null, 12), (ActivitiesCache) new ActivitiesCache.InMemory());
                Activities activities = new Activities(((GlobalSearchResponseSectionModel.Activities) globalSearchResponseSectionModel).items, LoadingState.LOADED, 14);
                StateFlowKt.emitOrThrow(realPreLoadedActivitiesManager.activities, activities);
                realPreLoadedActivitiesManager.cache.set(activities);
            }
            this.activitiesManager = realPreLoadedActivitiesManager;
            StateFlowImpl MutableStateFlow = FlowKt.MutableStateFlow(new SectionHandleState(3, globalSearchResponseSectionModel));
            this._section = MutableStateFlow;
            this.section = StateFlowKt.mapState(FlowKt.asStateFlow(MutableStateFlow), new GpsConfigQueries$$ExternalSyntheticLambda1(21));
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:18:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0075  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object loadMore(ContinuationImpl continuationImpl) {
            RealGlobalSearchRepository$RealSectionHandle$loadMore$1 realGlobalSearchRepository$RealSectionHandle$loadMore$1;
            int i;
            GlobalSearchResponseSectionModel globalSearchResponseSectionModel;
            int i2;
            SectionPageResponse sectionPageResponse;
            GlobalSearchResponseSectionModel copy$default;
            RowSection.Page page;
            if (continuationImpl instanceof RealGlobalSearchRepository$RealSectionHandle$loadMore$1) {
                realGlobalSearchRepository$RealSectionHandle$loadMore$1 = (RealGlobalSearchRepository$RealSectionHandle$loadMore$1) continuationImpl;
                int i3 = realGlobalSearchRepository$RealSectionHandle$loadMore$1.label;
                if ((i3 & PKIFailureInfo.systemUnavail) != 0) {
                    realGlobalSearchRepository$RealSectionHandle$loadMore$1.label = i3 - PKIFailureInfo.systemUnavail;
                    Object obj = realGlobalSearchRepository$RealSectionHandle$loadMore$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realGlobalSearchRepository$RealSectionHandle$loadMore$1.label;
                    StateFlowImpl stateFlowImpl = this._section;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        SectionHandleState sectionHandleState = (SectionHandleState) stateFlowImpl.getValue();
                        int i4 = sectionHandleState.itemLimit;
                        GlobalSearchResponseSectionModel globalSearchResponseSectionModel2 = sectionHandleState.model;
                        if (i4 < globalSearchResponseSectionModel2.getItems().size()) {
                            SectionHandleState sectionHandleState2 = new SectionHandleState(Math.min(globalSearchResponseSectionModel2.getItems().size(), i4 + 9), globalSearchResponseSectionModel2);
                            stateFlowImpl.getClass();
                            stateFlowImpl.updateState(null, sectionHandleState2);
                            return LoadMoreResult$Success.INSTANCE;
                        }
                        GlobalSearchService globalSearchService = this.this$0.api;
                        SectionPageRequest sectionPageRequest = new SectionPageRequest(globalSearchResponseSectionModel2.getPaginationCursor(), ByteString.EMPTY);
                        realGlobalSearchRepository$RealSectionHandle$loadMore$1.L$0 = globalSearchResponseSectionModel2;
                        realGlobalSearchRepository$RealSectionHandle$loadMore$1.I$0 = i4;
                        realGlobalSearchRepository$RealSectionHandle$loadMore$1.label = 1;
                        Object sectionPage = globalSearchService.sectionPage(sectionPageRequest, realGlobalSearchRepository$RealSectionHandle$loadMore$1);
                        if (sectionPage == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        globalSearchResponseSectionModel = globalSearchResponseSectionModel2;
                        obj = sectionPage;
                        i2 = i4;
                    } else {
                        if (i != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i2 = realGlobalSearchRepository$RealSectionHandle$loadMore$1.I$0;
                        globalSearchResponseSectionModel = realGlobalSearchRepository$RealSectionHandle$loadMore$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                    }
                    ApiResult apiResult = (ApiResult) obj;
                    sectionPageResponse = (SectionPageResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                    if (sectionPageResponse != null) {
                        return LoadMoreResult$Error.INSTANCE;
                    }
                    SectionPageResponse$Page$RowSection sectionPageResponse$Page$RowSection = sectionPageResponse.page;
                    GlobalSearchResponseSectionModel mapToResponseModel = (sectionPageResponse$Page$RowSection == null || (page = sectionPageResponse$Page$RowSection.value) == null) ? null : GlobalSearchResponseMappingKt.mapToResponseModel(page, globalSearchResponseSectionModel.getId(), globalSearchResponseSectionModel.getTitle());
                    if (globalSearchResponseSectionModel instanceof GlobalSearchResponseSectionModel.Activities) {
                        if (!(mapToResponseModel instanceof GlobalSearchResponseSectionModel.Activities)) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return null;
                        }
                        GlobalSearchResponseSectionModel.Activities activities = (GlobalSearchResponseSectionModel.Activities) mapToResponseModel;
                        copy$default = GlobalSearchResponseSectionModel.Activities.copy$default(activities, CollectionsKt.plus((Iterable) activities.items, (Collection) ((GlobalSearchResponseSectionModel.Activities) globalSearchResponseSectionModel).items), 59);
                    } else {
                        if (!(globalSearchResponseSectionModel instanceof GlobalSearchResponseSectionModel.Rows)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        if (!(mapToResponseModel instanceof GlobalSearchResponseSectionModel.Rows)) {
                            a$$ExternalSyntheticBUOutline0.m$1("Check failed.");
                            return null;
                        }
                        GlobalSearchResponseSectionModel.Rows rows = (GlobalSearchResponseSectionModel.Rows) mapToResponseModel;
                        copy$default = GlobalSearchResponseSectionModel.Rows.copy$default(rows, null, CollectionsKt.plus((Iterable) rows.items, (Collection) ((GlobalSearchResponseSectionModel.Rows) globalSearchResponseSectionModel).items), false, 59);
                    }
                    SectionHandleState sectionHandleState3 = new SectionHandleState(i2, copy$default);
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, sectionHandleState3);
                    return LoadMoreResult$Success.INSTANCE;
                }
            }
            realGlobalSearchRepository$RealSectionHandle$loadMore$1 = new RealGlobalSearchRepository$RealSectionHandle$loadMore$1(this, continuationImpl);
            Object obj2 = realGlobalSearchRepository$RealSectionHandle$loadMore$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realGlobalSearchRepository$RealSectionHandle$loadMore$1.label;
            StateFlowImpl stateFlowImpl2 = this._section;
            if (i != 0) {
            }
            ApiResult apiResult2 = (ApiResult) obj2;
            sectionPageResponse = (SectionPageResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
            if (sectionPageResponse != null) {
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x0068  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0062  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object tryUpdateItem(String str, ContinuationImpl continuationImpl) {
            RealGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1 realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1;
            int i;
            FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem;
            if (continuationImpl instanceof RealGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1) {
                realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1 = (RealGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1) continuationImpl;
                int i2 = realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1.label;
                if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                    realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1.label = i2 - PKIFailureInfo.systemUnavail;
                    Object obj = realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1.label;
                    RealPreLoadedActivitiesManager realPreLoadedActivitiesManager = this.activitiesManager;
                    if (i != 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (realPreLoadedActivitiesManager != null) {
                            str.getClass();
                            ActivityItem activityItem = realPreLoadedActivitiesManager.cache.get(str);
                            if (activityItem != null) {
                                realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1.L$0 = str;
                                realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1.label = 1;
                                if (realPreLoadedActivitiesManager.fetch(activityItem, realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1) == coroutineSingletons) {
                                    return coroutineSingletons;
                                }
                            }
                        }
                        return Unit.INSTANCE;
                    }
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    realPreLoadedActivitiesManager.getClass();
                    str.getClass();
                    ActivityItem activityItem2 = realPreLoadedActivitiesManager.cache.get(str);
                    formattedPaymentHistoryActivityItem = !(activityItem2 instanceof FormattedPaymentHistoryActivityItem) ? (FormattedPaymentHistoryActivityItem) activityItem2 : null;
                    if (formattedPaymentHistoryActivityItem != null) {
                        return Unit.INSTANCE;
                    }
                    StateFlowImpl stateFlowImpl = this._section;
                    GlobalSearchResponseSectionModel globalSearchResponseSectionModel = ((SectionHandleState) stateFlowImpl.getValue()).model;
                    globalSearchResponseSectionModel.getClass();
                    GlobalSearchResponseSectionModel.Activities activities = (GlobalSearchResponseSectionModel.Activities) globalSearchResponseSectionModel;
                    List<GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel> list = activities.items;
                    ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                    for (GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel : list) {
                        if (Intrinsics.areEqual(globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel.delegate.getRowId(), formattedPaymentHistoryActivityItem.getRowId())) {
                            globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel = new GlobalSearchResponseItemModel$GlobalSearchResponseActivityRowModel(formattedPaymentHistoryActivityItem);
                        }
                        arrayList.add(globalSearchResponseItemModel$GlobalSearchResponseActivityRowModel);
                    }
                    SectionHandleState sectionHandleState = new SectionHandleState(((SectionHandleState) stateFlowImpl.getValue()).itemLimit, GlobalSearchResponseSectionModel.Activities.copy$default(activities, arrayList, 59));
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, sectionHandleState);
                    return Unit.INSTANCE;
                }
            }
            realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1 = new RealGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1(this, continuationImpl);
            Object obj2 = realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = realGlobalSearchRepository$RealSectionHandle$tryUpdateItem$1.label;
            RealPreLoadedActivitiesManager realPreLoadedActivitiesManager2 = this.activitiesManager;
            if (i != 0) {
            }
            realPreLoadedActivitiesManager2.getClass();
            str.getClass();
            ActivityItem activityItem22 = realPreLoadedActivitiesManager2.cache.get(str);
            if (!(activityItem22 instanceof FormattedPaymentHistoryActivityItem)) {
            }
            if (formattedPaymentHistoryActivityItem != null) {
            }
        }
    }

    public final class SectionHandleState {
        public final int itemLimit;
        public final GlobalSearchResponseSectionModel model;

        public SectionHandleState(int i, GlobalSearchResponseSectionModel globalSearchResponseSectionModel) {
            globalSearchResponseSectionModel.getClass();
            this.itemLimit = i;
            this.model = globalSearchResponseSectionModel;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SectionHandleState)) {
                return false;
            }
            SectionHandleState sectionHandleState = (SectionHandleState) obj;
            return this.itemLimit == sectionHandleState.itemLimit && Intrinsics.areEqual(this.model, sectionHandleState.model);
        }

        public final int hashCode() {
            return this.model.hashCode() + (Integer.hashCode(this.itemLimit) * 31);
        }

        public final String toString() {
            return "SectionHandleState(itemLimit=" + this.itemLimit + ", model=" + this.model + ")";
        }
    }

    public RealGlobalSearchRepository(GlobalSearchService globalSearchService, RealRecipientSuggestionsProvider realRecipientSuggestionsProvider, RealClientRouteFormatter realClientRouteFormatter, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, RealPreLoadedActivitiesManager$Factory$Impl realPreLoadedActivitiesManager$Factory$Impl, RealActivityTokenFactory realActivityTokenFactory) {
        this.api = globalSearchService;
        this.recipientProvider = realRecipientSuggestionsProvider;
        this.clientRouteFormatter = realClientRouteFormatter;
        this.stringManager = androidStringManager;
        this.featureFlagManager = featureFlagManager;
        this.preLoadedActivitiesManagerFactory = realPreLoadedActivitiesManager$Factory$Impl;
        this.activityTokenFactory = realActivityTokenFactory;
    }

    public static final ListBuilder access$buildLocalSections(RealGlobalSearchRepository realGlobalSearchRepository, List list, List list2, String str) {
        RealClientRouteFormatter realClientRouteFormatter = realGlobalSearchRepository.clientRouteFormatter;
        AndroidStringManager androidStringManager = realGlobalSearchRepository.stringManager;
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (!list2.isEmpty()) {
            String str2 = androidStringManager.get(R.string.global_search_section_people_title);
            ArrayList arrayList = new ArrayList();
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel globalSearchResponseItemModel = GlobalSearchResponseMappingKt.toGlobalSearchResponseItemModel((RecipientSuggestionsProvider$RecipientWithAnalyticsData) it.next(), realClientRouteFormatter, androidStringManager, "CUSTOMER", str);
                if (globalSearchResponseItemModel != null) {
                    arrayList.add(globalSearchResponseItemModel);
                }
            }
            createListBuilder.add(new GlobalSearchResponseSectionModel.Rows("people", str2, arrayList, null, false, null));
        }
        if (!list.isEmpty()) {
            String str3 = androidStringManager.get(R.string.global_search_section_businesses_title);
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                GlobalSearchResponseItemModel$GlobalSearchResponseSearchRowModel globalSearchResponseItemModel2 = GlobalSearchResponseMappingKt.toGlobalSearchResponseItemModel((RecipientSuggestionsProvider$RecipientWithAnalyticsData) it2.next(), realClientRouteFormatter, androidStringManager, "BUSINESS", str);
                if (globalSearchResponseItemModel2 != null) {
                    arrayList2.add(globalSearchResponseItemModel2);
                }
            }
            createListBuilder.add(new GlobalSearchResponseSectionModel.Rows("businesses", str3, arrayList2, null, false, null));
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object search(String str, SearchRequest.Origin origin, String str2, String str3, ContinuationImpl continuationImpl) {
        RealGlobalSearchRepository$search$1 realGlobalSearchRepository$search$1;
        int i;
        String str4;
        SearchRequest.Origin origin2;
        String str5;
        String str6;
        Object firstOrNull;
        String str7;
        SearchRequest.Origin origin3;
        String str8;
        if (continuationImpl instanceof RealGlobalSearchRepository$search$1) {
            realGlobalSearchRepository$search$1 = (RealGlobalSearchRepository$search$1) continuationImpl;
            int i2 = realGlobalSearchRepository$search$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realGlobalSearchRepository$search$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realGlobalSearchRepository$search$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realGlobalSearchRepository$search$1.label;
                Continuation continuation = null;
                SharedFlowImpl sharedFlowImpl = this.cachedData;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (!Intrinsics.areEqual(this.cacheKey, str)) {
                        str4 = str;
                        origin2 = origin;
                        str5 = str2;
                        str6 = str3;
                        this.cacheKey = str4;
                        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.channelFlow(new MoneybotChatPresenter$models$6$1(this, str4, str6, str5, origin2, (Continuation) null)), new FormCashtag.AnonymousClass8.AnonymousClass2(this, continuation, 22), 3);
                    }
                    realGlobalSearchRepository$search$1.L$0 = str;
                    realGlobalSearchRepository$search$1.L$1 = origin;
                    realGlobalSearchRepository$search$1.L$2 = str2;
                    realGlobalSearchRepository$search$1.L$3 = str3;
                    realGlobalSearchRepository$search$1.label = 1;
                    firstOrNull = FlowKt.firstOrNull(sharedFlowImpl, realGlobalSearchRepository$search$1);
                    if (firstOrNull == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str7 = str;
                    origin3 = origin;
                    str5 = str2;
                    str8 = str3;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str9 = realGlobalSearchRepository$search$1.L$3;
                    str5 = realGlobalSearchRepository$search$1.L$2;
                    SearchRequest.Origin origin4 = realGlobalSearchRepository$search$1.L$1;
                    String str10 = realGlobalSearchRepository$search$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str8 = str9;
                    str7 = str10;
                    firstOrNull = obj;
                    origin3 = origin4;
                }
                if (firstOrNull == null) {
                    return new RealGooglePayer$createWallet$$inlined$filter$1(sharedFlowImpl, 26);
                }
                origin2 = origin3;
                str6 = str8;
                str4 = str7;
                this.cacheKey = str4;
                return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.channelFlow(new MoneybotChatPresenter$models$6$1(this, str4, str6, str5, origin2, (Continuation) null)), new FormCashtag.AnonymousClass8.AnonymousClass2(this, continuation, 22), 3);
            }
        }
        realGlobalSearchRepository$search$1 = new RealGlobalSearchRepository$search$1(this, continuationImpl);
        Object obj2 = realGlobalSearchRepository$search$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realGlobalSearchRepository$search$1.label;
        Continuation continuation2 = null;
        SharedFlowImpl sharedFlowImpl2 = this.cachedData;
        if (i != 0) {
        }
        if (firstOrNull == null) {
        }
    }
}
