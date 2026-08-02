package com.squareup.cash.clientrouting.routers.spendingInsights;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.card.spendinginsights.screens.RecurringPaymentInfoScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightDetailScreen;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightsHomeScreen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;

/* loaded from: classes6.dex */
public final class SpendingInsightsRouter {
    public final Navigator navigator;

    public SpendingInsightsRouter(Navigator navigator) {
        navigator.getClass();
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewCardSpendingInsight viewCardSpendingInsight) {
        viewCardSpendingInsight.getClass();
        this.navigator.goTo(new SpendingInsightDetailScreen(viewCardSpendingInsight.f1111type, viewCardSpendingInsight.context));
    }

    public final void route(ClientRoute.ViewCardSpendingInsightsHome viewCardSpendingInsightsHome, RoutingParams routingParams) {
        viewCardSpendingInsightsHome.getClass();
        routingParams.getClass();
        this.navigator.goTo(SpendingInsightsHomeScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewCardSpendingRecurringPaymentsInfo viewCardSpendingRecurringPaymentsInfo) {
        viewCardSpendingRecurringPaymentsInfo.getClass();
        this.navigator.goTo(RecurringPaymentInfoScreen.INSTANCE);
    }
}
