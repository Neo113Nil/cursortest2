package com.squareup.cash.clientrouting.routers.merchant;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.knot.backend.api.KnotLauncher;
import com.squareup.cash.knot.backend.real.RealKnotLauncher;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes6.dex */
public final class LinkedMerchantsRouter {
    public final KnotLauncher knotLauncher;

    public LinkedMerchantsRouter(KnotLauncher knotLauncher, Navigator navigator) {
        navigator.getClass();
        this.knotLauncher = knotLauncher;
    }

    public final Object route(ClientRoute.ViewKnotMerchantList viewKnotMerchantList, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object launch = ((RealKnotLauncher) this.knotLauncher).launch(viewKnotMerchantList.entryPoint, realClientRouteRouter$route$1);
        return launch == CoroutineSingletons.COROUTINE_SUSPENDED ? launch : Unit.INSTANCE;
    }
}
