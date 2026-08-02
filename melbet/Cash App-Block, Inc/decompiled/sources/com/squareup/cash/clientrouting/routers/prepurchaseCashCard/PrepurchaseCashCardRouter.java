package com.squareup.cash.clientrouting.routers.prepurchaseCashCard;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobilePrepurchaseCashCardPilot;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.prepurchasecashcard.screens.PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen;
import com.squareup.cash.wallet.screens.WalletHomeScreen;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PrepurchaseCashCardRouter {
    public final FeatureFlagManager featureFlagManager;
    public final Navigator navigator;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/clientrouting/routers/prepurchaseCashCard/PrepurchaseCashCardRouter$UnexpectedPrepurchaseCashCardAppletRoute", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class UnexpectedPrepurchaseCashCardAppletRoute extends ReportedError {
        public final Set features;
        public final String message;
        public final ClientRoute route;

        public UnexpectedPrepurchaseCashCardAppletRoute(ClientRoute.ViewPrepurchaseCashCardApplet viewPrepurchaseCashCardApplet) {
            viewPrepurchaseCashCardApplet.getClass();
            this.route = viewPrepurchaseCashCardApplet;
            this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.PrepurchaseCashCard.INSTANCE);
            this.message = "Routed to " + viewPrepurchaseCashCardApplet + " on an unsupported app version.";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnexpectedPrepurchaseCashCardAppletRoute) && Intrinsics.areEqual(this.route, ((UnexpectedPrepurchaseCashCardAppletRoute) obj).route);
        }

        @Override // com.squareup.cash.observability.types.FeatureError
        public final Set getFeatures() {
            return this.features;
        }

        @Override // java.lang.Throwable
        public final String getMessage() {
            return this.message;
        }

        public final int hashCode() {
            return this.route.hashCode();
        }

        @Override // java.lang.Throwable
        public final String toString() {
            return "UnexpectedPrepurchaseCashCardAppletRoute(route=" + this.route + ")";
        }
    }

    public PrepurchaseCashCardRouter(Navigator navigator, FeatureFlagManager featureFlagManager) {
        navigator.getClass();
        this.featureFlagManager = featureFlagManager;
        this.navigator = navigator;
    }

    public final void route(ClientRoute.ViewPrepurchaseCashCardApplet viewPrepurchaseCashCardApplet, RoutingParams routingParams) {
        viewPrepurchaseCashCardApplet.getClass();
        routingParams.getClass();
        Timber.Forest.v("route: %s", viewPrepurchaseCashCardApplet);
        if (!((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$MobilePrepurchaseCashCardPilot.INSTANCE)).enabled()) {
            UnexpectedPrepurchaseCashCardAppletRoute unexpectedPrepurchaseCashCardAppletRoute = new UnexpectedPrepurchaseCashCardAppletRoute(viewPrepurchaseCashCardApplet);
            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
            if (errorReporter != null) {
                errorReporter.report(unexpectedPrepurchaseCashCardAppletRoute, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                return;
            } else {
                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                return;
            }
        }
        Screen screen = routingParams.origin;
        boolean z = screen instanceof WalletHomeScreen;
        Navigator navigator = this.navigator;
        if (z) {
            navigator.goTo(new PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen(WalletHomeScreen.copy$default((WalletHomeScreen) screen, true)));
        } else if (screen instanceof AfterpayAppletScreen$AfterpayAppletHomeScreen) {
            navigator.goTo(new PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen((PrepurchaseCashCardScreen$PrepurchaseCashCardPlanningSheetScreen.Parent) screen));
        } else {
            navigator.goTo(new WalletHomeScreen(3, (Integer) null, (String) null));
        }
    }
}
