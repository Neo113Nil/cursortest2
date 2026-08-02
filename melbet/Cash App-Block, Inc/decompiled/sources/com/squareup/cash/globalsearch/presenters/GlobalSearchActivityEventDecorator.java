package com.squareup.cash.globalsearch.presenters;

import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.cdf.SearchOrigin;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda5;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsContext;
import com.squareup.cash.globalsearch.analytics.real.RealGlobalSearchAnalyticsHelper;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;

/* loaded from: classes6.dex */
public final class GlobalSearchActivityEventDecorator implements ActivityItemEventDecorator {
    public final Analytics analytics;
    public final RealGlobalSearchAnalyticsContext analyticsContext;
    public final RealGlobalSearchAnalyticsHelper analyticsHelper;
    public final CaptureCheckFaceKt$$ExternalSyntheticLambda5 itemInteractedCallback;
    public final SearchOrigin searchOrigin;

    public GlobalSearchActivityEventDecorator(SearchOrigin searchOrigin, CaptureCheckFaceKt$$ExternalSyntheticLambda5 captureCheckFaceKt$$ExternalSyntheticLambda5, Analytics analytics, RealGlobalSearchAnalyticsHelper realGlobalSearchAnalyticsHelper, RealGlobalSearchAnalyticsContext realGlobalSearchAnalyticsContext) {
        searchOrigin.getClass();
        this.searchOrigin = searchOrigin;
        this.itemInteractedCallback = captureCheckFaceKt$$ExternalSyntheticLambda5;
        this.analytics = analytics;
        this.analyticsHelper = realGlobalSearchAnalyticsHelper;
        this.analyticsContext = realGlobalSearchAnalyticsContext;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventDecorator
    public final Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemEventHandler.getClass();
        if (activityItemViewEvent.equals(ActivityItemViewEvent.AvatarClicked.INSTANCE) || (activityItemViewEvent instanceof ActivityItemViewEvent.ButtonClicked) || activityItemViewEvent.equals(ActivityItemViewEvent.ItemClicked.INSTANCE)) {
            this.itemInteractedCallback.invoke(activityItem.getRowId());
        }
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem), new DbSessionManager$updateDb$2(this, activityItem, (Continuation) null, 5), 3);
    }
}
