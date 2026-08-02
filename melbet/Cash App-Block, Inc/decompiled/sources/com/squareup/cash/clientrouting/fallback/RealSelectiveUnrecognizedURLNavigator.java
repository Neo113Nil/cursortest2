package com.squareup.cash.clientrouting.fallback;

import android.net.Uri;
import androidx.room.TransactorKt;
import app.cash.broadway.navigation.Navigator;
import com.miteksystems.misnap.camera.a.n;
import com.squareup.cash.appupdate.backend.real.RealPlayAppUpdateManager;
import com.squareup.cash.appupdate.navigation.real.RealAppUpdateInboundNavigator$Factory$Impl;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.cdf.clientroute.ClientRouteDeepLinkHandleKnownUnsupported;
import com.squareup.cash.cdf.clientroute.ClientRouteInteractHandleKnownUnsupported;
import com.squareup.cash.clientroutes.Matcher;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.ClientRouteParserKt;
import com.squareup.cash.clientrouting.DeepLinkParserKt;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.db2.ClientRoutingConfig;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$UnsupportedUrlGracefulDegradation;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.history.analytics.LoadTimeClock;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.userjourneys.tracker.RealUserJourneyTracker;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction$OpenDeepLink$BrowserFallback;
import com.squareup.cash.userjourneys.tracker.UserJourney$Friction$OpenDeepLink$UpdateRequired;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourney$Outcome;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.protos.franklin.common.ClientRoutingConfig;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.Teardown;
import com.squareup.util.coroutines.UiSetupTeardown;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2;

/* loaded from: classes.dex */
public final class RealSelectiveUnrecognizedURLNavigator implements UiSetupTeardown {
    public final Analytics analytics;
    public final AppConfigManager appConfig;
    public final RealAppUpdateInboundNavigator$Factory$Impl appUpdateNavigatorFactory;
    public final RealClientRouteParser clientRouteParser;
    public ClientRoutingConfig clientRoutingConfig;
    public final RealDeepLinkParser deepLinkParser;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineScope scope;
    public final UserJourneyTracker userJourneyTracker;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class RecognizedUnhandledPathType {
        public static final /* synthetic */ RecognizedUnhandledPathType[] $VALUES;
        public static final RecognizedUnhandledPathType REQUEST_APP_UPDATE;
        public static final RecognizedUnhandledPathType WEB_FALLBACK;

        static {
            RecognizedUnhandledPathType recognizedUnhandledPathType = new RecognizedUnhandledPathType("WEB_FALLBACK", 0);
            WEB_FALLBACK = recognizedUnhandledPathType;
            RecognizedUnhandledPathType recognizedUnhandledPathType2 = new RecognizedUnhandledPathType("REQUEST_APP_UPDATE", 1);
            REQUEST_APP_UPDATE = recognizedUnhandledPathType2;
            $VALUES = new RecognizedUnhandledPathType[]{recognizedUnhandledPathType, recognizedUnhandledPathType2};
        }

        public static RecognizedUnhandledPathType valueOf(String str) {
            return (RecognizedUnhandledPathType) Enum.valueOf(RecognizedUnhandledPathType.class, str);
        }

        public static RecognizedUnhandledPathType[] values() {
            return (RecognizedUnhandledPathType[]) $VALUES.clone();
        }
    }

    /* loaded from: classes6.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[RecognizedUnhandledPathType.values().length];
            try {
                RecognizedUnhandledPathType recognizedUnhandledPathType = RecognizedUnhandledPathType.WEB_FALLBACK;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                RecognizedUnhandledPathType recognizedUnhandledPathType2 = RecognizedUnhandledPathType.WEB_FALLBACK;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealSelectiveUnrecognizedURLNavigator(Analytics analytics, AppConfigManager appConfigManager, RealAppUpdateInboundNavigator$Factory$Impl realAppUpdateInboundNavigator$Factory$Impl, RealClientRouteParser realClientRouteParser, RealDeepLinkParser realDeepLinkParser, FeatureFlagManager featureFlagManager, UserJourneyTracker userJourneyTracker, CoroutineScope coroutineScope) {
        this.analytics = analytics;
        this.appConfig = appConfigManager;
        this.appUpdateNavigatorFactory = realAppUpdateInboundNavigator$Factory$Impl;
        this.clientRouteParser = realClientRouteParser;
        this.deepLinkParser = realDeepLinkParser;
        this.featureFlagManager = featureFlagManager;
        this.userJourneyTracker = userJourneyTracker;
        this.scope = coroutineScope;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0169 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean navigateSelectiveUnrecognizedPath(Navigator navigator, IntentLauncher intentLauncher, String str) {
        Object obj;
        RecognizedUnhandledPathType recognizedUnhandledPathType;
        Object obj2;
        int i;
        str.getClass();
        navigator.getClass();
        Continuation continuation = null;
        if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$UnsupportedUrlGracefulDegradation.INSTANCE)).enabled()) {
            boolean tryIsDeepLinkCandidate = DeepLinkParserKt.tryIsDeepLinkCandidate(this.deepLinkParser, str);
            Analytics analytics = this.analytics;
            if (tryIsDeepLinkCandidate) {
                ClientRoutingConfig clientRoutingConfig = this.clientRoutingConfig;
                if (clientRoutingConfig == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("clientRoutingConfig");
                    throw null;
                }
                List list = clientRoutingConfig.deep_link_rules;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        ClientRoutingConfig.DeepLinkRule deepLinkRule = (ClientRoutingConfig.DeepLinkRule) obj2;
                        Boolean bool = deepLinkRule.external_browser_fallback;
                        String str2 = deepLinkRule.path_regex;
                        Boolean bool2 = Boolean.TRUE;
                        if (Intrinsics.areEqual(bool, bool2) || Intrinsics.areEqual(deepLinkRule.is_supported_on_latest_version, bool2)) {
                            if (str2 == null) {
                                continue;
                            } else {
                                Matcher matcher = Matcher.treehouseAppLinkClientRoute;
                                if (TransactorKt.matchWithAllParameters(Uri.parse(str), str2, Intrinsics.areEqual(deepLinkRule.include_raw_query_params, bool2), deepLinkRule.required_parameter_names) != null) {
                                    break;
                                }
                            }
                        }
                    }
                    ClientRoutingConfig.DeepLinkRule deepLinkRule2 = (ClientRoutingConfig.DeepLinkRule) obj2;
                    if (deepLinkRule2 != null) {
                        String str3 = deepLinkRule2.spec_name;
                        Boolean bool3 = deepLinkRule2.is_supported_on_latest_version;
                        Boolean bool4 = deepLinkRule2.external_browser_fallback;
                        Boolean bool5 = Boolean.TRUE;
                        if (Intrinsics.areEqual(bool4, bool5)) {
                            analytics.track(new ClientRouteDeepLinkHandleKnownUnsupported(str3, bool3, bool4), null);
                            recognizedUnhandledPathType = RecognizedUnhandledPathType.WEB_FALLBACK;
                        } else if (Intrinsics.areEqual(bool3, bool5)) {
                            analytics.track(new ClientRouteDeepLinkHandleKnownUnsupported(str3, bool3, bool4), null);
                            recognizedUnhandledPathType = RecognizedUnhandledPathType.REQUEST_APP_UPDATE;
                        }
                        i = recognizedUnhandledPathType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[recognizedUnhandledPathType.ordinal()];
                        if (i == -1) {
                            return false;
                        }
                        UserJourney$Outcome.Succeeded succeeded = UserJourney$Outcome.Succeeded.INSTANCE;
                        UserJourneyTracker userJourneyTracker = this.userJourneyTracker;
                        if (i == 1) {
                            UserJourney$Name userJourney$Name = UserJourney$Name.OPEN_DEEP_LINK;
                            RealUserJourneyTracker realUserJourneyTracker = (RealUserJourneyTracker) userJourneyTracker;
                            realUserJourneyTracker.addFrictionSignal(userJourney$Name, UserJourney$Friction$OpenDeepLink$BrowserFallback.INSTANCE);
                            realUserJourneyTracker.endJourney(userJourney$Name, succeeded);
                            intentLauncher.launchUrlInExternalBrowser(str);
                            return true;
                        }
                        if (i != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return false;
                        }
                        UserJourney$Name userJourney$Name2 = UserJourney$Name.OPEN_DEEP_LINK;
                        RealUserJourneyTracker realUserJourneyTracker2 = (RealUserJourneyTracker) userJourneyTracker;
                        realUserJourneyTracker2.addFrictionSignal(userJourney$Name2, UserJourney$Friction$OpenDeepLink$UpdateRequired.INSTANCE);
                        realUserJourneyTracker2.endJourney(userJourney$Name2, succeeded);
                        LoadTimeClock.MetroFactory metroFactory = this.appUpdateNavigatorFactory.delegateFactory;
                        RealPlayAppUpdateManager realPlayAppUpdateManager = (RealPlayAppUpdateManager) metroFactory.clock.invoke();
                        FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.observabilityManager.invoke();
                        realPlayAppUpdateManager.getClass();
                        featureFlagManager.getClass();
                        JobKt.launch$default(this.scope, null, null, new CardModelView.AnonymousClass1.C00581(new n(realPlayAppUpdateManager, featureFlagManager, navigator), continuation, 21), 3);
                        return true;
                    }
                }
            } else if (ClientRouteParserKt.tryIsClientRouteCandidate(this.clientRouteParser, str)) {
                com.squareup.cash.db2.ClientRoutingConfig clientRoutingConfig2 = this.clientRoutingConfig;
                if (clientRoutingConfig2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("clientRoutingConfig");
                    throw null;
                }
                List list2 = clientRoutingConfig2.client_route_rules;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        ClientRoutingConfig.ClientRouteRule clientRouteRule = (ClientRoutingConfig.ClientRouteRule) obj;
                        Boolean bool6 = clientRouteRule.is_supported_on_latest_version;
                        String str4 = clientRouteRule.path_regex;
                        Boolean bool7 = Boolean.TRUE;
                        if (Intrinsics.areEqual(bool6, bool7) && str4 != null) {
                            Matcher matcher2 = Matcher.treehouseAppLinkClientRoute;
                            if (TransactorKt.matchWithAllParameters(Uri.parse(str), str4, Intrinsics.areEqual(clientRouteRule.include_raw_query_params, bool7), clientRouteRule.required_parameter_names) != null) {
                                break;
                            }
                        }
                    }
                    ClientRoutingConfig.ClientRouteRule clientRouteRule2 = (ClientRoutingConfig.ClientRouteRule) obj;
                    if (clientRouteRule2 != null) {
                        analytics.track(new ClientRouteInteractHandleKnownUnsupported(clientRouteRule2.spec_name, clientRouteRule2.is_supported_on_latest_version), null);
                        recognizedUnhandledPathType = RecognizedUnhandledPathType.REQUEST_APP_UPDATE;
                        if (recognizedUnhandledPathType == null) {
                        }
                        if (i == -1) {
                        }
                    }
                }
            }
        }
        recognizedUnhandledPathType = null;
        if (recognizedUnhandledPathType == null) {
        }
        if (i == -1) {
        }
    }

    @Override // com.squareup.util.coroutines.UnitSetupTeardown
    public final Teardown setup(CoroutineScope coroutineScope) {
        coroutineScope.getClass();
        JobKt.launch$default(coroutineScope, null, CoroutineStart.DEFAULT, new CombineKt$combineInternal$2.AnonymousClass1(null, this), 1);
        return StateFlowKt.noOpTeardown;
    }
}
