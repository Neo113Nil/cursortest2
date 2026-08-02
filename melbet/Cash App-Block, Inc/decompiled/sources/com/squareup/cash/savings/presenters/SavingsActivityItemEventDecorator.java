package com.squareup.cash.savings.presenters;

import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;

/* loaded from: classes6.dex */
public final class SavingsActivityItemEventDecorator implements ActivityItemEventDecorator {
    public final Analytics analytics;

    public SavingsActivityItemEventDecorator(Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventDecorator
    public final Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemEventHandler.getClass();
        return new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem), new AndroidFileSaver$save$2(this, activityItemViewModel, (Continuation) null, 23), 3);
    }
}
