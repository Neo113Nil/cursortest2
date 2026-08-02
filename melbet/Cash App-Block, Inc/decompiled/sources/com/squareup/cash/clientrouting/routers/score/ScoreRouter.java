package com.squareup.cash.clientrouting.routers.score;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileCashCreditScoreApplet;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.score.screens.ScoreHomeScreen;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class ScoreRouter {
    public final FeatureFlagManager featureFlagManager;
    public final Navigator navigator;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/clientrouting/routers/score/ScoreRouter$UnexpectedScoreRoute", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class UnexpectedScoreRoute extends ReportedError {
        public final Set features;
        public final String message;
        public final ClientRoute route;

        public UnexpectedScoreRoute(ClientRoute.ViewCashAppScore viewCashAppScore) {
            viewCashAppScore.getClass();
            this.route = viewCashAppScore;
            this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.CashCreditScore.INSTANCE);
            this.message = "Routed to " + viewCashAppScore + " when the feature flag was disabled.";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnexpectedScoreRoute) && Intrinsics.areEqual(this.route, ((UnexpectedScoreRoute) obj).route);
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
            return "UnexpectedScoreRoute(route=" + this.route + ")";
        }
    }

    public ScoreRouter(Navigator navigator, FeatureFlagManager featureFlagManager) {
        navigator.getClass();
        this.navigator = navigator;
        this.featureFlagManager = featureFlagManager;
    }

    public final void route(ClientRoute.ViewCashAppScore viewCashAppScore) {
        viewCashAppScore.getClass();
        if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(AmplitudeExperiments$MobileCashCreditScoreApplet.INSTANCE)).enabled()) {
            this.navigator.goTo(ScoreHomeScreen.INSTANCE);
            return;
        }
        UnexpectedScoreRoute unexpectedScoreRoute = new UnexpectedScoreRoute(viewCashAppScore);
        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
        if (errorReporter != null) {
            errorReporter.report(unexpectedScoreRoute, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        } else {
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
        }
    }
}
