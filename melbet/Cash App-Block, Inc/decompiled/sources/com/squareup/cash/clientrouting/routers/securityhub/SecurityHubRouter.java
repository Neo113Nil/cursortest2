package com.squareup.cash.clientrouting.routers.securityhub;

import app.cash.broadway.navigation.Navigator;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.featureflags.AmplitudeExperiments$ClientAccessTrustHub;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.securityhub.screens.SecurityHubScreen;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class SecurityHubRouter {
    public final FeatureFlagManager featureFlagManager;
    public final Navigator navigator;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/squareup/cash/clientrouting/routers/securityhub/SecurityHubRouter$UnexpectedSecurityHubRoute", "Lcom/squareup/cash/observability/types/ReportedError;", "real"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public final /* data */ class UnexpectedSecurityHubRoute extends ReportedError {
        public final Set features;
        public final String message;
        public final ClientRoute route;

        public UnexpectedSecurityHubRoute(ClientRoute.ViewSecurityHub viewSecurityHub) {
            viewSecurityHub.getClass();
            this.route = viewSecurityHub;
            this.features = SetsKt__SetsJVMKt.setOf(ErrorFeature.Security.INSTANCE);
            this.message = "Routed to " + viewSecurityHub + " when the feature flag was disabled.";
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof UnexpectedSecurityHubRoute) && Intrinsics.areEqual(this.route, ((UnexpectedSecurityHubRoute) obj).route);
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
            return "UnexpectedSecurityHubRoute(route=" + this.route + ")";
        }
    }

    public SecurityHubRouter(Navigator navigator, FeatureFlagManager featureFlagManager) {
        navigator.getClass();
        this.navigator = navigator;
        this.featureFlagManager = featureFlagManager;
    }

    public final void route(ClientRoute.ViewSecurityHub viewSecurityHub) {
        viewSecurityHub.getClass();
        if (((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$ClientAccessTrustHub.INSTANCE)).enabled()) {
            this.navigator.goTo(new SecurityHubScreen(null));
            return;
        }
        UnexpectedSecurityHubRoute unexpectedSecurityHubRoute = new UnexpectedSecurityHubRoute(viewSecurityHub);
        ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
        if (errorReporter != null) {
            errorReporter.report(unexpectedSecurityHubRoute, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
        } else {
            WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
        }
    }
}
