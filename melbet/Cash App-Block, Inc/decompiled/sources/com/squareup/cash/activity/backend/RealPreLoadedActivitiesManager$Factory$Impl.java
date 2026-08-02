package com.squareup.cash.activity.backend;

import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.DefaultGetRequestHandler$Factory;
import com.squareup.cash.storage.RealSessionedLink;

/* loaded from: classes.dex */
public final class RealPreLoadedActivitiesManager$Factory$Impl implements ActivitiesManager.Factory {
    public final RealSessionedLink.MetroFactory delegateFactory;

    public RealPreLoadedActivitiesManager$Factory$Impl(RealSessionedLink.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.Factory
    public final RealPreLoadedActivitiesManager create(ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache) {
        activityContext.getClass();
        activitiesCache.getClass();
        DefaultGetRequestHandler$Factory defaultGetRequestHandler$Factory = (DefaultGetRequestHandler$Factory) this.delegateFactory.sandboxer.invoke();
        defaultGetRequestHandler$Factory.getClass();
        return new RealPreLoadedActivitiesManager(defaultGetRequestHandler$Factory, activityContext, activitiesCache);
    }
}
