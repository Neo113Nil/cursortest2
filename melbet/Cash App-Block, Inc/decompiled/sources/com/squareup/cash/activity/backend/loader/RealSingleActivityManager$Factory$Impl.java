package com.squareup.cash.activity.backend.loader;

import app.cash.badging.api.Badger2;
import com.squareup.cash.activity.backend.ZiplineActivityItemFormatter;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.clientrouting.LiteClientRouteRouter;
import com.squareup.protos.cash.activity.api.v1.ActivityItemGlobalId;
import java.util.Locale;
import kotlin.coroutines.CoroutineContext;

/* loaded from: classes.dex */
public final class RealSingleActivityManager$Factory$Impl {
    public final LiteClientRouteRouter.MetroFactory delegateFactory;

    public RealSingleActivityManager$Factory$Impl(LiteClientRouteRouter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final RealSingleActivityManager create(ActivitiesManager.ActivityContext activityContext, ActivityItemGlobalId activityItemGlobalId, SingleActivityCache$InMemory singleActivityCache$InMemory, Locale locale) {
        activityItemGlobalId.getClass();
        singleActivityCache$InMemory.getClass();
        LiteClientRouteRouter.MetroFactory metroFactory = this.delegateFactory;
        Badger2 badger2 = (Badger2) metroFactory.allowlistProvider.invoke();
        CoroutineContext coroutineContext = (CoroutineContext) metroFactory.errorReporter.invoke();
        ZiplineActivityItemFormatter ziplineActivityItemFormatter = (ZiplineActivityItemFormatter) metroFactory.stringManager.invoke();
        DefaultGetRequestHandler$Factory defaultGetRequestHandler$Factory = (DefaultGetRequestHandler$Factory) metroFactory.wrappedFactory.value;
        badger2.getClass();
        coroutineContext.getClass();
        ziplineActivityItemFormatter.getClass();
        defaultGetRequestHandler$Factory.getClass();
        return new RealSingleActivityManager(activityContext, activityItemGlobalId, singleActivityCache$InMemory, locale, badger2, coroutineContext, ziplineActivityItemFormatter, defaultGetRequestHandler$Factory);
    }
}
