package com.squareup.cash.activity.presenters;

import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public interface ActivityItemEventDecorator {
    Flow decorate(ActivityItemEventHandler activityItemEventHandler, ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem);
}
