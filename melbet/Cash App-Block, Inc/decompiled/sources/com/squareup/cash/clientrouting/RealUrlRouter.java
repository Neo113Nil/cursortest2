package com.squareup.cash.clientrouting;

import app.cash.broadway.navigation.Navigator;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.clientrouting.ClientRouteRouter;
import com.squareup.cash.clientrouting.fallback.RealSelectiveUnrecognizedURLNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealUrlLocalizer;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;

/* loaded from: classes.dex */
public final class RealUrlRouter {
    public final Analytics analytics;
    public final String applicationId;
    public final ClientRouteRouter clientRouteRouter;
    public final DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkEmitter;
    public final ErrorReporter errorReporter;
    public final IntentLauncher launcher;
    public final Navigator navigator;
    public final RealSelectiveUnrecognizedURLNavigator selectiveUnrecognizedURLNavigator;
    public final RealUrlLocalizer urlLocalizer;
    public final KeysetHandle urlParser;
    public final UserJourneyTracker userJourneyTracker;

    public RealUrlRouter(RealUrlLocalizer realUrlLocalizer, KeysetHandle keysetHandle, ErrorReporter errorReporter, DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0, ClientRouteRouter.Factory factory, IntentLauncher intentLauncher, String str, Analytics analytics, RealSelectiveUnrecognizedURLNavigator realSelectiveUnrecognizedURLNavigator, UserJourneyTracker userJourneyTracker, Navigator navigator) {
        navigator.getClass();
        this.urlLocalizer = realUrlLocalizer;
        this.urlParser = keysetHandle;
        this.errorReporter = errorReporter;
        this.deferredDeepLinkEmitter = deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
        this.launcher = intentLauncher;
        this.applicationId = str;
        this.analytics = analytics;
        this.selectiveUnrecognizedURLNavigator = realSelectiveUnrecognizedURLNavigator;
        this.userJourneyTracker = userJourneyTracker;
        this.navigator = navigator;
        this.clientRouteRouter = factory.create(navigator);
    }
}
