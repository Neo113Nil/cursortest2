package com.squareup.cash.activity.backend.loader;

import app.cash.api.ApiResult;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilter;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilterGroup;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchPageRequest;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchRequest;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchResponse;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.SearchOffset;
import com.squareup.protos.cash.activity.api.v1.SearchSort;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes7.dex */
public class DefaultSearchPageRequestHandler implements ActivitiesManager.ActivityPageHandler {
    public final List activitySearchFilters;
    public final EmptyList aggregations = EmptyList.INSTANCE;
    public final ActivityClientService appService;

    public DefaultSearchPageRequestHandler(ActivityClientService activityClientService, ActivitySearchFilter[] activitySearchFilterArr) {
        this.appService = activityClientService;
        this.activitySearchFilters = ArraysKt___ArraysKt.toList(activitySearchFilterArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00aa A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object requestPage$suspendImpl(DefaultSearchPageRequestHandler defaultSearchPageRequestHandler, ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, ContinuationImpl continuationImpl) {
        DefaultSearchPageRequestHandler$requestPage$1 defaultSearchPageRequestHandler$requestPage$1;
        int i;
        ActivitySearchResponse activitySearchResponse;
        DefaultSearchPageRequestHandler defaultSearchPageRequestHandler2 = defaultSearchPageRequestHandler;
        if (continuationImpl instanceof DefaultSearchPageRequestHandler$requestPage$1) {
            defaultSearchPageRequestHandler$requestPage$1 = (DefaultSearchPageRequestHandler$requestPage$1) continuationImpl;
            int i2 = defaultSearchPageRequestHandler$requestPage$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                defaultSearchPageRequestHandler$requestPage$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = defaultSearchPageRequestHandler$requestPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = defaultSearchPageRequestHandler$requestPage$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    defaultSearchPageRequestHandler2.getClass();
                    activityContext.getClass();
                    List filterGroups = defaultSearchPageRequestHandler2.getFilterGroups();
                    SearchOffset searchOffset = pageOffset != null ? new SearchOffset(pageOffset.offset) : null;
                    ActivityToken activityToken = activityContext.activityToken;
                    Function1 pageSize = defaultSearchPageRequestHandler2.getPageSize();
                    ActivitySearchRequest activitySearchRequest = new ActivitySearchRequest(null, filterGroups, new SearchSort(SearchSort.SortByField.SECTION_AND_DATE, SearchSort.Order.DESC, ByteString.EMPTY), searchOffset, pageSize != null ? (Integer) pageSize.invoke(pageOffset) : null, activityToken, null, 4033);
                    defaultSearchPageRequestHandler2.aggregations.getClass();
                    ActivitySearchPageRequest activitySearchPageRequest = new ActivitySearchPageRequest(activitySearchRequest, activityContext.activityScope, 24);
                    ActivityClientService activityClientService = defaultSearchPageRequestHandler2.appService;
                    defaultSearchPageRequestHandler$requestPage$1.L$0 = defaultSearchPageRequestHandler2;
                    defaultSearchPageRequestHandler$requestPage$1.label = 1;
                    obj = activityClientService.searchActivity(activitySearchPageRequest, defaultSearchPageRequestHandler$requestPage$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    defaultSearchPageRequestHandler2 = defaultSearchPageRequestHandler$requestPage$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                ApiResult apiResult = (ApiResult) obj;
                activitySearchResponse = (ActivitySearchResponse) (!(apiResult instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult).response : null);
                if (activitySearchResponse != null) {
                    return null;
                }
                defaultSearchPageRequestHandler2.getClass();
                return ActivitiesManager.ActivityPage.Companion.toActivityPage(activitySearchResponse);
            }
        }
        defaultSearchPageRequestHandler$requestPage$1 = new DefaultSearchPageRequestHandler$requestPage$1(defaultSearchPageRequestHandler2, continuationImpl);
        Object obj2 = defaultSearchPageRequestHandler$requestPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = defaultSearchPageRequestHandler$requestPage$1.label;
        if (i != 0) {
        }
        ApiResult apiResult2 = (ApiResult) obj2;
        activitySearchResponse = (ActivitySearchResponse) (!(apiResult2 instanceof ApiResult.Success) ? ((ApiResult.Success) apiResult2).response : null);
        if (activitySearchResponse != null) {
        }
    }

    public List getFilterGroups() {
        List list = this.activitySearchFilters;
        return !list.isEmpty() ? CollectionsKt__CollectionsJVMKt.listOf(new ActivitySearchFilterGroup(list)) : EmptyList.INSTANCE;
    }

    public Function1 getPageSize() {
        return null;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.ActivityPageHandler
    public Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        return requestPage$suspendImpl(this, activityContext, pageOffset, (ContinuationImpl) continuation);
    }
}
