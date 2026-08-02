package com.squareup.cash.activity.presenters;

import androidx.datastore.core.SimpleActor;
import app.cash.broadway.navigation.Navigator;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import com.squareup.cash.activity.backend.ActivityItem;
import com.squareup.cash.activity.presenters.ActivityItemEventHandler;
import com.squareup.cash.activity.presenters.ActivityItemPresenter;
import com.squareup.cash.activity.viewmodels.ActivityItemPresentationContext;
import com.squareup.cash.reactions.real.RealSharedReactionState;
import com.squareup.cash.resource.text.AndroidStringManager;
import dev.zacsweers.metro.Provider;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class PaymentHistoryActivityItemPresenter$Factory$Impl implements ActivityItemPresenter.Factory {
    public final SimpleActor delegateFactory;

    public PaymentHistoryActivityItemPresenter$Factory$Impl(SimpleActor simpleActor) {
        this.delegateFactory = simpleActor;
    }

    @Override // com.squareup.cash.activity.presenters.ActivityItemPresenter.Factory
    public final PaymentHistoryActivityItemPresenter create(Navigator navigator, ActivityItem activityItem, ActivityItemPresentationContext activityItemPresentationContext, ActivityItemEventHandler.Factory factory, Function1 function1) {
        navigator.getClass();
        activityItem.getClass();
        SimpleActor simpleActor = this.delegateFactory;
        DefaultActivityItemEventHandler$Factory$Impl defaultActivityItemEventHandler$Factory$Impl = (DefaultActivityItemEventHandler$Factory$Impl) ((Provider) simpleActor.scope).invoke();
        AndroidStringManager androidStringManager = (AndroidStringManager) ((Provider) simpleActor.consumeMessage).invoke();
        RealSharedReactionState realSharedReactionState = (RealSharedReactionState) ((Provider) simpleActor.messageQueue).invoke();
        PaymentHistoryAvatarFactory paymentHistoryAvatarFactory = (PaymentHistoryAvatarFactory) ((RealPasscodeFlowStarter.MetroFactory) simpleActor.remainingMessages).invoke();
        defaultActivityItemEventHandler$Factory$Impl.getClass();
        androidStringManager.getClass();
        realSharedReactionState.getClass();
        return new PaymentHistoryActivityItemPresenter(navigator, activityItem, activityItemPresentationContext, factory, function1, defaultActivityItemEventHandler$Factory$Impl, androidStringManager, realSharedReactionState, paymentHistoryAvatarFactory);
    }
}
