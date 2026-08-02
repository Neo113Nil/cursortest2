package com.squareup.cash.history.backend.real;

import com.squareup.cash.activity.backend.loader.ActivitiesCache;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealInvestingActivitiesManager$Factory$Impl implements ActivitiesManager.Factory {
    public final LiteActivityPresenter.MetroFactory delegateFactory;

    public RealInvestingActivitiesManager$Factory$Impl(LiteActivityPresenter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    @Override // com.squareup.cash.activity.backend.loader.ActivitiesManager.Factory
    public final RealInvestingActivitiesManager create(ActivitiesManager.ActivityContext activityContext, ActivitiesCache activitiesCache) {
        activityContext.getClass();
        activitiesCache.getClass();
        LiteActivityPresenter.MetroFactory metroFactory = this.delegateFactory;
        ActivitiesManager.Factory factory = (ActivitiesManager.Factory) metroFactory.activityEmbeddedPresenterFactory.invoke();
        AndroidClock androidClock = (AndroidClock) metroFactory.sessionManager.lambda.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.stringManager.lambda.invoke();
        factory.getClass();
        androidClock.getClass();
        coroutineContext.getClass();
        return new RealInvestingActivitiesManager(activityContext, activitiesCache, factory, androidClock, coroutineContext);
    }
}
