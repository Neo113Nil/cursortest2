package com.squareup.cash.history.backend.real;

import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.DefaultSearchPageRequestHandler;
import com.squareup.cash.history.backend.api.PendingInvestingActivityPageHandler;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityProductClassifier;
import com.squareup.protos.cash.activity.api.v1.ActivityRowSection;
import com.squareup.protos.cash.activity.api.v1.ActivitySearchFilter;
import com.squareup.protos.cash.activity.api.v1.ProductClassifierSearchFilter;
import com.squareup.protos.cash.activity.api.v1.SearchFilterContains;
import com.squareup.protos.cash.activity.api.v1.SectionSearchFilter;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class RealPendingInvestingActivityPageHandler implements PendingInvestingActivityPageHandler, ActivitiesManager.ActivityPageHandler {
    public final /* synthetic */ DefaultSearchPageRequestHandler $$delegate_0;

    public RealPendingInvestingActivityPageHandler(ActivityClientService activityClientService) {
        this.$$delegate_0 = new DefaultSearchPageRequestHandler(activityClientService, new ActivitySearchFilter[]{new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.ProductClassifier(new ProductClassifierSearchFilter(ActivityProductClassifier.APC_INVEST_ORDER, (SearchFilterContains) null, 6))), new ActivitySearchFilter(new ActivitySearchFilter.SearchFilter.Section(new SectionSearchFilter(ActivityRowSection.PENDING, null, ByteString.EMPTY)))});
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.ActivityPageHandler
    public final Object requestPage(ActivitiesManager.ActivityContext activityContext, ActivitiesManager.ActivityPage.PageOffset pageOffset, Continuation continuation) {
        DefaultSearchPageRequestHandler defaultSearchPageRequestHandler = this.$$delegate_0;
        defaultSearchPageRequestHandler.getClass();
        return DefaultSearchPageRequestHandler.requestPage$suspendImpl(defaultSearchPageRequestHandler, activityContext, pageOffset, (ContinuationImpl) continuation);
    }
}
