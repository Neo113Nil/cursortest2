package com.squareup.cash.history.payments.presenters;

import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventDecorator;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.EmptyFlow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;

/* loaded from: classes6.dex */
public final class ProfileActivityItemEventDecorator implements ActivityItemEventDecorator {
    public final Analytics analytics;

    public ProfileActivityItemEventDecorator(Analytics analytics) {
        this.analytics = analytics;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventDecorator
    public final Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemEventHandler.getClass();
        return activityItemViewEvent instanceof ActivityItemViewEvent.AvatarClicked ? EmptyFlow.INSTANCE : new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(activityItemEventHandler.handleEvent(activityItemViewModel, activityItemViewEvent, activityItem), new DotGridKt$DotGrid$3$1(activityItem, this, activityItemViewModel, (Continuation) null, 9), 3);
    }
}
