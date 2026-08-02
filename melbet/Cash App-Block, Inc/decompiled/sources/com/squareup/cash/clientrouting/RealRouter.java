package com.squareup.cash.clientrouting;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.ui.node.NodeChain;
import androidx.room.TransactorKt;
import app.cash.broadway.navigation.Navigator;
import com.google.crypto.tink.KeysetHandle;
import com.squareup.cash.attribution.DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0;
import com.squareup.cash.attribution.deeplink.DeepLink;
import com.squareup.cash.cdf.clientroute.ClientRouteDeepLinkHandle;
import com.squareup.cash.cdf.clientroute.ClientRouteDeepLinkHandleDeferred;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.ClientRouteRouter;
import com.squareup.cash.clientrouting.URLParser$Result;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.errors.RoutingError;
import com.squareup.cash.clientrouting.fallback.RealSelectiveUnrecognizedURLNavigator;
import com.squareup.cash.data.TemporaryStorage;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.keystore.RealMessageSigner;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.localization.RealUrlLocalizer;
import com.squareup.cash.money.views.MoneyUiFactory;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import okhttp3.HttpUrl;
import okio.Path$$ExternalSyntheticBUOutline0;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealRouter {
    public final ClientRouteRouter clientRouteRouter;
    public final RealUrlRouter urlRouter;

    public RealRouter(RealUrlRouter$Factory$Impl realUrlRouter$Factory$Impl, ClientRouteRouter.Factory factory, Navigator navigator) {
        navigator.getClass();
        NodeChain nodeChain = realUrlRouter$Factory$Impl.delegateFactory;
        RealUrlLocalizer realUrlLocalizer = (RealUrlLocalizer) ((RealMessageSigner.MetroFactory) nodeChain.layoutNode).invoke();
        KeysetHandle keysetHandle = (KeysetHandle) ((TemporaryStorage.MetroFactory) nodeChain.sentinelHead).invoke();
        ErrorReporter errorReporter = (ErrorReporter) ((Provider) nodeChain.innerCoordinator).invoke();
        DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0 = (DeferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0) ((Provider) nodeChain.outerCoordinator).invoke();
        ClientRouteRouter.Factory factory2 = (ClientRouteRouter.Factory) ((Provider) nodeChain.tail).invoke();
        IntentLauncher intentLauncher = (IntentLauncher) ((Provider) nodeChain.head).invoke();
        String str = (String) ((Provider) nodeChain.current).invoke();
        Analytics analytics = (Analytics) ((Provider) nodeChain.buffer).invoke();
        RealSelectiveUnrecognizedURLNavigator realSelectiveUnrecognizedURLNavigator = (RealSelectiveUnrecognizedURLNavigator) ((Provider) nodeChain.stack).invoke();
        UserJourneyTracker userJourneyTracker = (UserJourneyTracker) ((Provider) nodeChain.cachedDiffer).invoke();
        errorReporter.getClass();
        deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0.getClass();
        factory2.getClass();
        intentLauncher.getClass();
        str.getClass();
        analytics.getClass();
        realSelectiveUnrecognizedURLNavigator.getClass();
        userJourneyTracker.getClass();
        this.urlRouter = new RealUrlRouter(realUrlLocalizer, keysetHandle, errorReporter, deferredDeepLinkStateModule$Companion$$ExternalSyntheticLambda0, factory2, intentLauncher, str, analytics, realSelectiveUnrecognizedURLNavigator, userJourneyTracker, navigator);
        this.clientRouteRouter = factory.create(navigator);
    }

    public static void route$default(RealRouter realRouter, ClientRoute clientRoute) {
        RoutingParams routingParams = new RoutingParams(null, null, null, null, null, null, 511);
        realRouter.getClass();
        realRouter.clientRouteRouter.route(clientRoute, routingParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean route(RoutingParams routingParams, String str) {
        URLParser$Result uRLParser$Result;
        String str2 = str;
        routingParams.getClass();
        RealUrlRouter realUrlRouter = this.urlRouter;
        ErrorReporter errorReporter = realUrlRouter.errorReporter;
        IntentLauncher intentLauncher = realUrlRouter.launcher;
        KeysetHandle keysetHandle = realUrlRouter.urlParser;
        UserJourneyTracker userJourneyTracker = realUrlRouter.userJourneyTracker;
        if (str2 == null || str2.length() == 0) {
            Timber.Forest.i("Nothing to route", new Object[0]);
            return false;
        }
        String redactUrl = TransactorKt.redactUrl(str2);
        Timber.Forest forest = Timber.Forest;
        forest.i("Routing " + redactUrl + " with origin: " + routingParams.getOrigin() + " and exit screen: " + routingParams.getExitScreen(), new Object[0]);
        RealClientRouteParser realClientRouteParser = (RealClientRouteParser) keysetHandle.entries;
        RealDeepLinkParser realDeepLinkParser = (RealDeepLinkParser) keysetHandle.annotationsMap;
        if (DeepLinkParserKt.tryIsDeepLinkCandidate(realDeepLinkParser, str2)) {
            forest.i("DeepLink candidate found: ".concat(str2), new Object[0]);
            final ClientRoute tryParse = DeepLinkParserKt.tryParse(realDeepLinkParser, str2);
            if (tryParse != null) {
                final URLParser$Result.URLFormat uRLFormat = URLParser$Result.URLFormat.DEEP_LINK;
                uRLParser$Result = new Object(tryParse, uRLFormat) { // from class: com.squareup.cash.clientrouting.URLParser$Result
                    public final ClientRoute route;
                    public final URLFormat urlFormat;

                    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                    public final class URLFormat {
                        public static final /* synthetic */ URLFormat[] $VALUES;
                        public static final URLFormat CLIENT_ROUTE;
                        public static final URLFormat DEEP_LINK;

                        static {
                            URLFormat uRLFormat = new URLFormat("DEEP_LINK", 0);
                            DEEP_LINK = uRLFormat;
                            URLFormat uRLFormat2 = new URLFormat("CLIENT_ROUTE", 1);
                            CLIENT_ROUTE = uRLFormat2;
                            $VALUES = new URLFormat[]{uRLFormat, uRLFormat2};
                        }

                        public static URLFormat valueOf(String str) {
                            return (URLFormat) Enum.valueOf(URLFormat.class, str);
                        }

                        public static URLFormat[] values() {
                            return (URLFormat[]) $VALUES.clone();
                        }
                    }

                    {
                        this.route = tryParse;
                        this.urlFormat = uRLFormat;
                    }

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof URLParser$Result)) {
                            return false;
                        }
                        URLParser$Result uRLParser$Result2 = (URLParser$Result) obj;
                        return this.route.equals(uRLParser$Result2.route) && this.urlFormat == uRLParser$Result2.urlFormat;
                    }

                    public final ClientRoute getRoute() {
                        return this.route;
                    }

                    public final int hashCode() {
                        return this.urlFormat.hashCode() + (this.route.hashCode() * 31);
                    }

                    public final boolean isDeepLinkFormat() {
                        return this.urlFormat == URLFormat.DEEP_LINK;
                    }

                    public final String toString() {
                        return "Result(route=" + this.route + ", urlFormat=" + this.urlFormat + ")";
                    }
                };
                UserJourney$Outcome.Succeeded succeeded = UserJourney$Outcome.Succeeded.INSTANCE;
                if (uRLParser$Result == null) {
                    boolean route = realUrlRouter.clientRouteRouter.route(uRLParser$Result.getRoute(), routingParams);
                    if (uRLParser$Result.isDeepLinkFormat()) {
                        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.getDeepLinkMetadata();
                        String deepLinkSource = deepLinkMetadata != null ? deepLinkMetadata.getDeepLinkSource() : null;
                        RoutingParams.DeepLinkMetadata deepLinkMetadata2 = routingParams.getDeepLinkMetadata();
                        realUrlRouter.analytics.track(Intrinsics.areEqual(deepLinkSource, "DEFERRED_DEEP_LINK") ? new ClientRouteDeepLinkHandleDeferred(redactUrl, deepLinkSource, String.valueOf(route), deepLinkMetadata2 != null ? deepLinkMetadata2.getAppsFlyerId() : null) : new ClientRouteDeepLinkHandle(Boolean.valueOf(!route), Boolean.valueOf(route), redactUrl, deepLinkSource), null);
                    }
                    if (!route) {
                        forest.i(Recorder$$ExternalSyntheticOutline2.m("Deep link candidate wasn't handled and is deferred until sign in as a result: ", redactUrl), new Object[0]);
                        realUrlRouter.deferredDeepLinkEmitter.defer(new DeepLink(str2, null, null));
                    }
                    ((RealUserJourneyTracker) userJourneyTracker).endJourney(UserJourney$Name.OPEN_DEEP_LINK, succeeded);
                    return route;
                }
                if (realUrlRouter.selectiveUnrecognizedURLNavigator.navigateSelectiveUnrecognizedPath(realUrlRouter.navigator, intentLauncher, str2)) {
                    return true;
                }
                boolean tryIsDeepLinkCandidate = DeepLinkParserKt.tryIsDeepLinkCandidate(realDeepLinkParser, str2);
                ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                if (tryIsDeepLinkCandidate) {
                    RoutingParams.DeepLinkMetadata deepLinkMetadata3 = routingParams.getDeepLinkMetadata();
                    if (Intrinsics.areEqual(deepLinkMetadata3 != null ? deepLinkMetadata3.getReferrer() : null, "android-app://".concat(realUrlRouter.applicationId))) {
                        errorReporter.report(new RoutingError.InvalidDeeplinkCandidate(routingParams, str2), defaultSamplingStrategy);
                        return true;
                    }
                }
                RealUrlLocalizer realUrlLocalizer = realUrlRouter.urlLocalizer;
                if (StringsKt__StringsJVMKt.startsWith(str2, "https://cash.app/legal", false)) {
                    HttpUrl.Builder builder = new HttpUrl.Builder();
                    builder.parse$okhttp(null, str2);
                    HttpUrl build = builder.build();
                    ArrayList arrayList = build.pathSegments;
                    Object orNull = CollectionsKt.getOrNull(1, arrayList);
                    String str3 = (String) orNull;
                    if (str3 == null || !RealUrlLocalizer.REGEX_COUNTRY.matches(str3)) {
                        orNull = null;
                    }
                    String str4 = (String) orNull;
                    Object orNull2 = CollectionsKt.getOrNull(str4 == null ? 1 : 2, arrayList);
                    String str5 = (String) orNull2;
                    String str6 = (String) ((str5 == null || !RealUrlLocalizer.REGEX_LOCALE.matches(str5)) ? null : orNull2);
                    List drop = CollectionsKt.drop(CollectionsKt.drop(CollectionsKt.drop(arrayList, 1), str4 == null ? 0 : 1), str6 == null ? 0 : 1);
                    Locale locale = (Locale) realUrlLocalizer.localeManager.resolvedLocale.$$delegate_0.getValue();
                    HttpUrl.Builder newBuilder = build.newBuilder();
                    newBuilder.encodedPath("/");
                    newBuilder.addPathSegment("legal");
                    if (str4 != null) {
                        newBuilder.addPathSegment(str4);
                    }
                    if (str6 == null) {
                        String languageTag = locale.toLanguageTag();
                        languageTag.getClass();
                        str6 = languageTag.toLowerCase(Locale.ROOT);
                        str6.getClass();
                    }
                    newBuilder.addPathSegment(str6);
                    Iterator it = drop.iterator();
                    while (it.hasNext()) {
                        newBuilder.addPathSegment((String) it.next());
                    }
                    if (Intrinsics.areEqual(locale.getLanguage(), "es")) {
                        newBuilder.addQueryParameter("cash-frontend-marketing-show-spanish", "true");
                    }
                    str2 = newBuilder.build().url;
                }
                boolean launchUrlInInternalBrowser = intentLauncher.launchUrlInInternalBrowser(str2);
                if (launchUrlInInternalBrowser) {
                    Timber.Forest.i(Recorder$$ExternalSyntheticOutline2.m("Launched as URL to internal browser: ", redactUrl), new Object[0]);
                    ((RealUserJourneyTracker) userJourneyTracker).endJourney(UserJourney$Name.OPEN_DEEP_LINK, succeeded);
                    return launchUrlInInternalBrowser;
                }
                errorReporter.report(new RoutingError.ActivityNotFound(routingParams, redactUrl), defaultSamplingStrategy);
                ((RealUserJourneyTracker) userJourneyTracker).endJourney(UserJourney$Name.OPEN_DEEP_LINK, UserJourney$Outcome.Failed.INSTANCE);
                return launchUrlInInternalBrowser;
            }
            forest.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Attempted to parse ", TransactorKt.redactUrl(str2), " as deep link, but it's invalid. Continuing."), new Object[0]);
        }
        if (ClientRouteParserKt.tryIsClientRouteCandidate(realClientRouteParser, str2)) {
            forest.i("ClientRoute candidate found: ".concat(str2), new Object[0]);
            final ClientRoute tryParse2 = ClientRouteParserKt.tryParse(realClientRouteParser, str2);
            if (tryParse2 == null) {
                Path$$ExternalSyntheticBUOutline0.m$1((Object) Recorder$$ExternalSyntheticOutline2.m("Attempted to route unsupported client route: ", TransactorKt.redactUrl(str2)));
                return false;
            }
            final URLParser$Result.URLFormat uRLFormat2 = URLParser$Result.URLFormat.CLIENT_ROUTE;
            uRLParser$Result = new Object(tryParse2, uRLFormat2) { // from class: com.squareup.cash.clientrouting.URLParser$Result
                public final ClientRoute route;
                public final URLFormat urlFormat;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class URLFormat {
                    public static final /* synthetic */ URLFormat[] $VALUES;
                    public static final URLFormat CLIENT_ROUTE;
                    public static final URLFormat DEEP_LINK;

                    static {
                        URLFormat uRLFormat = new URLFormat("DEEP_LINK", 0);
                        DEEP_LINK = uRLFormat;
                        URLFormat uRLFormat2 = new URLFormat("CLIENT_ROUTE", 1);
                        CLIENT_ROUTE = uRLFormat2;
                        $VALUES = new URLFormat[]{uRLFormat, uRLFormat2};
                    }

                    public static URLFormat valueOf(String str) {
                        return (URLFormat) Enum.valueOf(URLFormat.class, str);
                    }

                    public static URLFormat[] values() {
                        return (URLFormat[]) $VALUES.clone();
                    }
                }

                {
                    this.route = tryParse2;
                    this.urlFormat = uRLFormat2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof URLParser$Result)) {
                        return false;
                    }
                    URLParser$Result uRLParser$Result2 = (URLParser$Result) obj;
                    return this.route.equals(uRLParser$Result2.route) && this.urlFormat == uRLParser$Result2.urlFormat;
                }

                public final ClientRoute getRoute() {
                    return this.route;
                }

                public final int hashCode() {
                    return this.urlFormat.hashCode() + (this.route.hashCode() * 31);
                }

                public final boolean isDeepLinkFormat() {
                    return this.urlFormat == URLFormat.DEEP_LINK;
                }

                public final String toString() {
                    return "Result(route=" + this.route + ", urlFormat=" + this.urlFormat + ")";
                }
            };
        } else {
            uRLParser$Result = null;
        }
        UserJourney$Outcome.Succeeded succeeded2 = UserJourney$Outcome.Succeeded.INSTANCE;
        if (uRLParser$Result == null) {
        }
    }

    public final class MetroFactory {
        public final Provider clientRouteRouterFactory;
        public final InstanceFactory urlRouterFactory;

        public /* synthetic */ MetroFactory(MoneyUiFactory.MetroFactory metroFactory, InstanceFactory instanceFactory) {
            this.clientRouteRouterFactory = metroFactory;
            this.urlRouterFactory = instanceFactory;
        }

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, Provider provider) {
            this.urlRouterFactory = instanceFactory;
            this.clientRouteRouterFactory = provider;
        }
    }

    public final boolean route(ClientRoute clientRoute, RoutingParams routingParams) {
        clientRoute.getClass();
        return this.clientRouteRouter.route(clientRoute, routingParams);
    }
}
