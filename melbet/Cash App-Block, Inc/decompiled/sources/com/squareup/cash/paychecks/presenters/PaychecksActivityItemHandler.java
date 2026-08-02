package com.squareup.cash.paychecks.presenters;

import app.cash.broadway.navigation.Navigator;
import com.google.mlkit.vision.text.zza;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemViewEvent;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SafeFlow;

/* loaded from: classes6.dex */
public final class PaychecksActivityItemHandler implements ActivityItemEventHandler {
    public final Analytics analytics;
    public final Function1 feedCallback;
    public final Navigator navigator;

    public PaychecksActivityItemHandler(Navigator navigator, Function1 function1, Analytics analytics, zza zzaVar) {
        navigator.getClass();
        this.navigator = navigator;
        this.feedCallback = function1;
        this.analytics = analytics;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemEventHandler
    public final Flow handleEvent(ActivityItemViewModel activityItemViewModel, ActivityItemViewEvent activityItemViewEvent, ActivityItem activityItem) {
        activityItemViewModel.getClass();
        activityItemViewEvent.getClass();
        activityItem.getClass();
        return new SafeFlow(new RealKeyStoreProvider$setEntry$2(activityItem, activityItemViewEvent, this, (Continuation) null, 23));
    }
}
