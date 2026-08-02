package com.squareup.cash.clientrouting;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.R;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.ClientRouteRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.errors.RoutingError;
import com.squareup.cash.clientrouting.validation.CashAppLiteRouteAllowlistProvider;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.resource.text.AndroidStringManager;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.Set;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class LiteClientRouteRouter implements ClientRouteRouter {
    public final CashAppLiteRouteAllowlistProvider allowlistProvider;
    public final ClientRouteRouter delegate;
    public final ErrorReporter errorReporter;
    public final Navigator navigator;
    public final AndroidStringManager stringManager;

    public LiteClientRouteRouter(CashAppLiteRouteAllowlistProvider cashAppLiteRouteAllowlistProvider, ErrorReporter errorReporter, AndroidStringManager androidStringManager, ClientRouteRouter.Factory factory, Navigator navigator) {
        navigator.getClass();
        this.allowlistProvider = cashAppLiteRouteAllowlistProvider;
        this.errorReporter = errorReporter;
        this.stringManager = androidStringManager;
        this.navigator = navigator;
        this.delegate = factory.create(navigator);
    }

    @Override // com.squareup.cash.clientrouting.ClientRouteRouter
    public final boolean route(ClientRoute clientRoute, RoutingParams routingParams) {
        clientRoute.getClass();
        routingParams.getClass();
        String str = clientRoute.getSpec().name;
        Set set = (Set) this.allowlistProvider.allowedSpecNames.$$delegate_0.getValue();
        if (set == null || set.contains(str)) {
            return this.delegate.route(clientRoute, routingParams);
        }
        Timber.Forest.i("Cash Lite blocked route '%s': not in client_routes_allowlist", clientRoute.getSpec().name);
        this.errorReporter.report(new RoutingError.CashLiteBlockedRoute(clientRoute, routingParams), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        String str2 = this.stringManager.get(R.string.cash_lite_route_not_supported);
        Screen screen = routingParams.origin;
        if (screen == null) {
            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
        }
        this.navigator.goTo(new FailureMessageScreen(null, str2, null, screen, null, 21));
        return true;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final Provider allowlistProvider;
        public final Provider errorReporter;
        public final Provider stringManager;
        public final InstanceFactory wrappedFactory;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Provider provider3, InstanceFactory instanceFactory) {
            this.allowlistProvider = provider;
            this.errorReporter = provider2;
            this.stringManager = provider3;
            this.wrappedFactory = instanceFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealMoneyNavigatorHelper.MetroFactory metroFactory, InstanceFactory instanceFactory, ArcadeModule$ProvideHapticVibratorMetroFactory arcadeModule$ProvideHapticVibratorMetroFactory) {
            this.allowlistProvider = doubleCheck;
            this.errorReporter = metroFactory;
            this.wrappedFactory = instanceFactory;
            this.stringManager = arcadeModule$ProvideHapticVibratorMetroFactory;
        }

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, Provider provider, Provider provider2, LambdaProvider lambdaProvider) {
            this.wrappedFactory = instanceFactory;
            this.allowlistProvider = provider;
            this.errorReporter = provider2;
            this.stringManager = lambdaProvider;
        }
    }
}
