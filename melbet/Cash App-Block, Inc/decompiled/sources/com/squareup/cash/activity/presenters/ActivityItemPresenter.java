package com.squareup.cash.activity.presenters;

import androidx.compose.runtime.Composer;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public interface ActivityItemPresenter {

    /* loaded from: classes.dex */
    public interface Factory {
        ActivityItemPresenter create(Navigator navigator, ActivityItem activityItem, ActivityItemPresentationContext activityItemPresentationContext, ActivityItemEventHandler.Factory factory, Function1 function1);
    }

    UiCallbackModel models(Composer composer);
}
