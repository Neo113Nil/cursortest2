package com.squareup.cash.afterpayapplet.presenters;

import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes5.dex */
public final class FilteredActivitiesManager implements ActivitiesManager {
    public final ActivitiesManager delegate;
    public final AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType orderActivityType;

    public FilteredActivitiesManager(ActivitiesManager activitiesManager, AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen.OrderActivityType orderActivityType) {
        activitiesManager.getClass();
        orderActivityType.getClass();
        this.delegate = activitiesManager;
        this.orderActivityType = orderActivityType;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Flow activities() {
        return new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(this.delegate.activities(), this, 16);
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final void clear() {
        this.delegate.clear();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Flow firstServerPages() {
        return this.delegate.firstServerPages();
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager
    public final Object load(ActivitiesManager.LoadMode loadMode, Continuation continuation) {
        return this.delegate.load(loadMode, continuation);
    }
}
