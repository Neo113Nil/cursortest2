package com.squareup.cash.activity.presenters;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public interface ActivityItemEventHandler {

    /* loaded from: classes.dex */
    public interface Factory {
        ActivityItemEventHandler create(Navigator navigator, Function1 function1);
    }

    Flow handleEvent(ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem);
}
