package com.squareup.cash.clientrouting;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientrouting.ClientRouteRouter;
import com.squareup.cash.clientrouting.RealRouter;

/* loaded from: classes.dex */
public final class RealRouter$Factory$Impl {
    public final RealRouter.MetroFactory delegateFactory;

    public RealRouter$Factory$Impl(RealRouter.MetroFactory metroFactory) {
        this.delegateFactory = metroFactory;
    }

    public final RealRouter create$1(Navigator navigator) {
        navigator.getClass();
        RealRouter.MetroFactory metroFactory = this.delegateFactory;
        RealUrlRouter$Factory$Impl realUrlRouter$Factory$Impl = (RealUrlRouter$Factory$Impl) metroFactory.urlRouterFactory.value;
        ClientRouteRouter.Factory factory = (ClientRouteRouter.Factory) metroFactory.clientRouteRouterFactory.invoke();
        realUrlRouter$Factory$Impl.getClass();
        factory.getClass();
        return new RealRouter(realUrlRouter$Factory$Impl, factory, navigator);
    }
}
