package com.squareup.cash.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.room.TransactorKt;
import app.cash.badging.backend.RealBadger2;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.maps.android.compose.MapEffectKt;
import com.google.maps.android.compose.MarkerKt;
import com.squareup.cash.account.types.SignedInStateManager;
import com.squareup.cash.activity.screens.ActivityScreen;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.ArcadeModule$ProvideHapticVibratorMetroFactory;
import com.squareup.cash.attribution.wrappers.AppsFlyerClient;
import com.squareup.cash.attribution.wrappers.ProductionAppsFlyerClient;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.applet.stackingtools.BitcoinStackingToolsPresenter;
import com.squareup.cash.bitcoin.presenters.investing.RealBitcoinSponsoredStateRepo;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.RealPaidInBitcoinStateManager;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator$Factory$Impl;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.cdf.NotificationType;
import com.squareup.cash.cdf.clientroute.ClientRouteDeepLinkLaunch;
import com.squareup.cash.cdf.customerengagement.Channel;
import com.squareup.cash.cdf.customerengagement.CustomerEngagementClickReport;
import com.squareup.cash.cdf.customerprofile.CustomerProfileViewOpen;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientroutes.RealDeepLinkParser;
import com.squareup.cash.clientrouting.DeepLinkParserKt;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.crypto.address.RealCryptoInvoiceParser;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.receiveasbitcoin.RealReceiveP2PAsBitcoinRepo;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.crypto.navigation.CryptoPayment;
import com.squareup.cash.crypto.navigation.CryptoPaymentSource;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringFeatureFlag$Value;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$CustomerEngagementDeeplinkIsLoggingWithMetadataEnabled;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$IntentUrlDecoding;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.gcl.RealGlobalConfigManager;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.integration.analytics.Action;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.integration.api.CashApiInterceptor;
import com.squareup.cash.integration.api.RealRequestSigner;
import com.squareup.cash.investing.backend.real.autoinvest.RealAutoInvestRepo$Factory$Impl;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.observability.types.ErrorFeature;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.ReportedError;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.profile.screens.ProfileLauncher;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.support.presenters.ArticlePresenter$Factory$Impl;
import com.squareup.cash.support.presenters.ContactSupportEmailInputPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.ContactSupportEmailMessagePresenter$Factory$Impl;
import com.squareup.cash.support.presenters.PhoneVerificationPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.ScreenshotConfirmPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.ScreenshotReviewPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportActivityPickerPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportArticleIncidentsSheetPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportDisputeTrackerPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportFlowCheckConnectionPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportHomeContactOptionsSheetPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportHomePresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportIncidentDetailsPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportLoadClientScenarioPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportPhoneStatusPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportSearchPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.SupportTransactionConfirmationPresenter$Factory$Impl;
import com.squareup.cash.support.presenters.UnauthenticatedArticlePresenter$Factory$Impl;
import com.squareup.cash.userjourneys.tracker.UserJourney$Name;
import com.squareup.cash.userjourneys.tracker.UserJourneyTracker;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.verification.AppVerification;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.views.WalletUiFactory$MetroFactory;
import com.squareup.cash.work.presenters.WorkPresenterFactory;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashface.api.GetProfileDetailsContext;
import com.squareup.protos.cash.nearby.api.v1.BLEPayload;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.ScenarioInitiatorType;
import com.squareup.protos.franklin.common.appmessaging.AppMessageAction;
import com.squareup.util.ForcedLazyKt$forcedLazy$1;
import com.squareup.util.android.AndroidAccountManager;
import com.squareup.util.android.AndroidDeviceInfo;
import com.squareup.util.android.AndroidPackageManager;
import com.squareup.util.cash.ProtoDefaults;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.collections.SetsKt__SetsJVMKt;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlinx.coroutines.JobKt;
import okhttp3.ConnectionPool;
import okio.internal.DefaultSocket;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes.dex */
public final class RealIntentHandler implements IntentHandler {
    public final Activity activity;
    public final Analytics analytics;
    public final String applicationId;
    public final AppsFlyerClient appsFlyerClient;
    public final RealBitcoinInboundNavigator$Factory$Impl bitcoinInboundNavigatorFactory;
    public final RealCryptoInvoiceParser cryptoInvoiceParser;
    public final RealDeepLinkParser deepLinkParser;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final FlowStarter flowStarter;
    public final ConnectionPool googlePaymentAuthInitiator;
    public final AndroidPackageManager packageManager;
    public final RealRouter$Factory$Impl routerFactory;
    public final SessionManager sessionManager;
    public final RealSupportNavigator supportNavigator;
    public final UserJourneyTracker userJourneyTracker;

    /* loaded from: classes4.dex */
    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AppMessageAction.Action.values().length];
            try {
                iArr[AppMessageAction.Action.SHOW_ACTIVITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppMessageAction.Action.START_SUPPORT_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RealIntentHandler(Analytics analytics, ErrorReporter errorReporter, FlowStarter flowStarter, SessionManager sessionManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, Activity activity, RealRouter$Factory$Impl realRouter$Factory$Impl, FeatureFlagManager featureFlagManager, RealSupportNavigator realSupportNavigator, RealUuidGenerator realUuidGenerator, RealDeepLinkParser realDeepLinkParser, RealCryptoInvoiceParser realCryptoInvoiceParser, RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl, UserJourneyTracker userJourneyTracker, String str, AppsFlyerClient appsFlyerClient, ConnectionPool connectionPool, AndroidPackageManager androidPackageManager) {
        this.analytics = analytics;
        this.errorReporter = errorReporter;
        this.flowStarter = flowStarter;
        this.sessionManager = sessionManager;
        this.activity = activity;
        this.routerFactory = realRouter$Factory$Impl;
        this.featureFlagManager = featureFlagManager;
        this.supportNavigator = realSupportNavigator;
        this.deepLinkParser = realDeepLinkParser;
        this.cryptoInvoiceParser = realCryptoInvoiceParser;
        this.bitcoinInboundNavigatorFactory = realBitcoinInboundNavigator$Factory$Impl;
        this.userJourneyTracker = userJourneyTracker;
        this.applicationId = str;
        this.appsFlyerClient = appsFlyerClient;
        this.googlePaymentAuthInitiator = connectionPool;
        this.packageManager = androidPackageManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleCryptoIntent(RealIntentHandler realIntentHandler, Navigator navigator, Intent intent, ContinuationImpl continuationImpl) {
        RealIntentHandler$handleCryptoIntent$1 realIntentHandler$handleCryptoIntent$1;
        int i;
        String uri;
        BitcoinPayments bitcoinPayments;
        if (continuationImpl instanceof RealIntentHandler$handleCryptoIntent$1) {
            realIntentHandler$handleCryptoIntent$1 = (RealIntentHandler$handleCryptoIntent$1) continuationImpl;
            int i2 = realIntentHandler$handleCryptoIntent$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realIntentHandler$handleCryptoIntent$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realIntentHandler$handleCryptoIntent$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realIntentHandler$handleCryptoIntent$1.label;
                boolean z = false;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    Uri data = intent.getData();
                    if (data == null || (uri = data.toString()) == null) {
                        return Boolean.FALSE;
                    }
                    RealCryptoInvoiceParser realCryptoInvoiceParser = realIntentHandler.cryptoInvoiceParser;
                    realIntentHandler$handleCryptoIntent$1.L$0 = navigator;
                    realIntentHandler$handleCryptoIntent$1.L$1 = intent;
                    realIntentHandler$handleCryptoIntent$1.label = 1;
                    obj = realCryptoInvoiceParser.parse(uri, false, realIntentHandler$handleCryptoIntent$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    intent = realIntentHandler$handleCryptoIntent$1.L$1;
                    navigator = realIntentHandler$handleCryptoIntent$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                bitcoinPayments = (BitcoinPayments) obj;
                if (bitcoinPayments != null) {
                    realIntentHandler.bitcoinInboundNavigatorFactory.create(navigator).viewBitcoinInvoice(new CryptoPayment.InvoicePayment(bitcoinPayments, Intrinsics.areEqual(intent.getAction(), "android.nfc.action.NDEF_DISCOVERED") ? CryptoPaymentSource.NFC_SCAN : CryptoPaymentSource.DEEP_LINK, (Money) null, 12));
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }
        realIntentHandler$handleCryptoIntent$1 = new RealIntentHandler$handleCryptoIntent$1(realIntentHandler, continuationImpl);
        Object obj2 = realIntentHandler$handleCryptoIntent$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realIntentHandler$handleCryptoIntent$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
        bitcoinPayments = (BitcoinPayments) obj2;
        if (bitcoinPayments != null) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00df, code lost:
    
        if ((r5 != null ? kotlin.text.StringsKt.contains((java.lang.CharSequence) r5, (java.lang.CharSequence) "metadata_id", false) : false) != false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Boolean handleDeepLink(Intent intent, Navigator navigator, String str, boolean z) {
        if (intent.getData() != null) {
            if (!intent.getBooleanExtra("deep_link_consumed", false)) {
                UserJourneyTracker.m3788startJourneycrs4WS4$default(this.userJourneyTracker, UserJourney$Name.OPEN_DEEP_LINK);
                Uri data = intent.getData();
                data.getClass();
                final String uri = data.toString();
                uri.getClass();
                final String stringExtra = intent.getStringExtra("rawUrl");
                FeatureFlagManager featureFlagManager = this.featureFlagManager;
                RealDeepLinkParser realDeepLinkParser = this.deepLinkParser;
                if (stringExtra != null) {
                    boolean z2 = !uri.equals(stringExtra) && DeepLinkParserKt.tryIsDeepLinkCandidate(realDeepLinkParser, uri) && DeepLinkParserKt.tryIsDeepLinkCandidate(realDeepLinkParser, stringExtra);
                    String str2 = ((FeatureFlag$StringFeatureFlag$Value) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$IntentUrlDecoding.INSTANCE)).value;
                    if (z2 && (Intrinsics.areEqual(str2, "LegacyWithValidation") || Intrinsics.areEqual(str2, "ModernWithValidation"))) {
                        final ClientRoute tryParse = DeepLinkParserKt.tryParse(realDeepLinkParser, uri);
                        final ClientRoute tryParse2 = DeepLinkParserKt.tryParse(realDeepLinkParser, stringExtra);
                        if (!Intrinsics.areEqual(tryParse, tryParse2)) {
                            ReportedError reportedError = new ReportedError(uri, tryParse, stringExtra, tryParse2) { // from class: com.squareup.cash.intent.RealIntentHandler$handleUrl$1
                                public final String groupingDescriptor = "Intent url differs from the raw url received";
                                public final Map metadata;

                                {
                                    this.metadata = BalanceFeedKt$$ExternalSyntheticOutline0.m("metadata", MapsKt__MapsKt.mapOf(new Pair("intentUrl", uri), new Pair("intentUrlRoute", tryParse != null ? tryParse.toString() : null), new Pair("rawUrl", stringExtra), new Pair("rawUrlRoute", tryParse2 != null ? tryParse2.toString() : null)));
                                }

                                @Override // com.squareup.cash.observability.types.FeatureError
                                public final Set getFeatures() {
                                    return SetsKt__SetsJVMKt.setOf(ErrorFeature.DeepLinking.INSTANCE);
                                }

                                @Override // com.squareup.cash.observability.types.ReportedError
                                public final String getGroupingDescriptor() {
                                    return this.groupingDescriptor;
                                }

                                @Override // com.squareup.cash.observability.types.ReportedError
                                public final Map getMetadata() {
                                    return this.metadata;
                                }
                            };
                            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                            if (errorReporter == null) {
                                throw new ErrorReporter.Companion.ErrorReporterInstanceNotSetError();
                            }
                            errorReporter.report(reportedError, ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                        }
                    }
                    if (Intrinsics.areEqual(str2, "Modern") || Intrinsics.areEqual(str2, "ModernWithValidation")) {
                        uri = stringExtra;
                    }
                }
                intent.putExtra("deeplink_url", uri);
                Uri parse = Uri.parse(uri);
                if (!parse.isOpaque()) {
                    intent.putExtra("deeplink_metadata_id", parse.getQueryParameter("metadata_id"));
                }
                Analytics analytics = this.analytics;
                if (!z) {
                    boolean enabled = ((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$CustomerEngagementDeeplinkIsLoggingWithMetadataEnabled.INSTANCE)).enabled();
                    String stringExtra2 = intent.getStringExtra("deeplink_url");
                    String stringExtra3 = intent.getStringExtra("deeplink_metadata_id");
                    if (stringExtra3 == null && enabled) {
                    }
                    analytics.track(new CustomerEngagementClickReport(stringExtra3, stringExtra2, 9), null);
                }
                AppsFlyerClient.Companion.getClass();
                List hosts = AppsFlyerClient.Companion.getHOSTS();
                Uri data2 = intent.getData();
                data2.getClass();
                boolean contains = CollectionsKt.contains(hosts, data2.getHost());
                AppsFlyerClient appsFlyerClient = this.appsFlyerClient;
                if (contains) {
                    ((ProductionAppsFlyerClient) appsFlyerClient).onIncomingIntentForDeepLink(intent);
                    return Boolean.valueOf(PlatformKt.getCurrentSessionState(this.sessionManager) instanceof SessionState.Initiated);
                }
                if (DeepLinkParserKt.tryIsDeepLinkCandidate(realDeepLinkParser, uri)) {
                    analytics.track(new ClientRouteDeepLinkLaunch(TransactorKt.redactUrl(uri), intent.getStringExtra("deeplink-source")), null);
                    Bundle extras = intent.getExtras();
                    return Boolean.valueOf(this.routerFactory.create$1(navigator).route(new RoutingParams(PaymentScreens$HomeScreens$Home.INSTANCE, (extras == null || !extras.getBoolean("is-push-notification")) ? BlockersData.AnalyticsData.Source.DEEP_LINK.getAnalyticsName() : BlockersData.AnalyticsData.Source.PUSH_NOTIFICATION.getAnalyticsName(), (Screen) intent.getParcelableExtra("deeplink-exit-screen"), new RoutingParams.DeepLinkMetadata(intent.getStringExtra("deeplink-source"), uri, str, ((ProductionAppsFlyerClient) appsFlyerClient).appsFlyerId), null, null, 484), uri));
                }
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean handleIntent(Intent intent, Navigator navigator, boolean z) {
        PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home;
        boolean z2;
        Screen profileFor;
        Set<String> keySet;
        Uri referrer;
        intent.getClass();
        navigator.getClass();
        if (PlatformKt.hasOnboardedAccount(this.sessionManager)) {
            Activity activity = this.activity;
            Object[] objArr = 0;
            String uri = (activity.getIntent() == null || (referrer = activity.getReferrer()) == null) ? null : referrer.toString();
            boolean booleanExtra = intent.getBooleanExtra("is-push-notification", false);
            String stringExtra = intent.getStringExtra("engagement-reporting-id");
            Analytics analytics = this.analytics;
            if (booleanExtra && stringExtra != null) {
                String stringExtra2 = intent.getStringExtra("url-notification");
                Channel channel = Channel.PUSH;
                analytics.track(new CustomerEngagementClickReport(stringExtra, stringExtra2, 8), null);
            }
            if (intent.hasCategory("android.intent.category.NOTIFICATION_PREFERENCES")) {
                navigator.goTo(ProfileScreens.NotificationsScreen.INSTANCE);
                return true;
            }
            Serializable serializableExtra = intent.getSerializableExtra("event-type");
            NotificationType notificationType = serializableExtra instanceof NotificationType ? (NotificationType) serializableExtra : null;
            Serializable serializableExtra2 = intent.getSerializableExtra("event-action");
            Action action = serializableExtra2 instanceof Action ? (Action) serializableExtra2 : null;
            String stringExtra3 = intent.getStringExtra("payment-token");
            if (notificationType != null && action != null) {
                analytics.track(action.build(notificationType, stringExtra3), null);
            }
            if (((Boolean) JobKt.runBlockingK(EmptyCoroutineContext.INSTANCE, new PasscodeDialogPresenter$models$1$1(this, navigator, intent, objArr == true ? 1 : 0, 26))).booleanValue()) {
                return true;
            }
            MapEffectKt access$asPushNotification = MarkerKt.access$asPushNotification(intent);
            boolean z3 = access$asPushNotification instanceof InboundPushNotification$DoAppMessageAction;
            PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home2 = PaymentScreens$HomeScreens$Home.INSTANCE;
            if (z3) {
                AppMessageAction action2 = ((InboundPushNotification$DoAppMessageAction) access$asPushNotification).getAction();
                AppMessageAction.Action action3 = action2.action;
                if (action3 == null) {
                    action3 = ProtoDefaults.APP_MESSAGE_ACTION_ACTION;
                }
                int i = WhenMappings.$EnumSwitchMapping$0[action3.ordinal()];
                if (i == 1) {
                    navigator.goTo(ActivityScreen.INSTANCE);
                    return true;
                }
                if (i != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1(Recorder$$ExternalSyntheticOutline2.m("Unknown App Action ", action2.action_identifier));
                    return false;
                }
                String str = action2.action_argument;
                str.getClass();
                navigator.goTo(RealSupportNavigator.startSupportFlow$default(this.supportNavigator, str, null, paymentScreens$HomeScreens$Home2, SupportNavigator$Source.NOTIFICATION, null, null, 102));
                return true;
            }
            if (access$asPushNotification instanceof InboundPushNotification$GoHome) {
                navigator.goTo(paymentScreens$HomeScreens$Home2);
                z2 = z;
                paymentScreens$HomeScreens$Home = paymentScreens$HomeScreens$Home2;
            } else {
                if (access$asPushNotification instanceof InboundPushNotification$Payment) {
                    navigator.goTo(new HistoryScreens.PaymentReceipt(((InboundPushNotification$Payment) access$asPushNotification).getPaymentToken(), null, null, null, null, 62));
                    return true;
                }
                if (access$asPushNotification instanceof InboundPushNotification$Profile) {
                    LinkedHashMap linkedHashMap = ProfileLauncher.launchedScreens;
                    profileFor = ProfileLauncher.profileFor(new ProfileScreens.ProfileScreen.Customer.CashCustomer(((InboundPushNotification$Profile) access$asPushNotification).getCustomerToken()), new ProfileScreens.ProfileScreen.Action(ProfileScreens.ProfileScreen.Action.ActionType.PAY_OR_REQUEST), (r22 & 4) != 0 ? ProfileScreens.ProfileScreen.BackNavigationAction.CLOSE : ProfileScreens.ProfileScreen.BackNavigationAction.BACK, RealUuidGenerator.generate(), GetProfileDetailsContext.LAUNCHER, CustomerProfileViewOpen.EntryPoint.LAUNCHER_SHORTCUT, paymentScreens$HomeScreens$Home2, (r22 & 128) == 0, (r22 & 256) != 0 ? null : null, (String) null, (r22 & 1024) == 0, (BlockersData.MoneybotContext) null);
                    navigator.goTo(profileFor);
                    return true;
                }
                paymentScreens$HomeScreens$Home = paymentScreens$HomeScreens$Home2;
                if (access$asPushNotification instanceof InboundPushNotification$Route) {
                    this.routerFactory.create$1(navigator).route(new RoutingParams(null, BlockersData.AnalyticsData.Source.PUSH_NOTIFICATION.getAnalyticsName(), paymentScreens$HomeScreens$Home, null, null, null, 501), ((InboundPushNotification$Route) access$asPushNotification).getUrl());
                    return true;
                }
                if (!(access$asPushNotification instanceof InboundPushNotification$Url) && !(access$asPushNotification instanceof InboundPushNotification$Other) && access$asPushNotification != null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return false;
                }
                z2 = z;
            }
            Boolean handleDeepLink = handleDeepLink(intent, navigator, uri, z2);
            if (handleDeepLink != null) {
                return handleDeepLink.booleanValue();
            }
            if (Intrinsics.areEqual(intent.getAction(), "com.google.android.payments.standard.AUTHENTICATE_V1")) {
                ComponentName callingActivity = activity.getCallingActivity();
                String packageName = callingActivity != null ? callingActivity.getPackageName() : null;
                Timber.Forest forest = Timber.Forest;
                forest.d(Recorder$$ExternalSyntheticOutline2.m("Handling Google Payments Intent from ", packageName), new Object[0]);
                if (!new AppVerification(analytics, this.errorReporter).validateAppSignature(intent, activity.getCallingActivity(), this.packageManager)) {
                    forest.e(new Exception(Recorder$$ExternalSyntheticOutline2.m("App Verification Failed. Caller Package Name: ", packageName)));
                    activity.finish();
                }
                BLEPayload.Builder builder = new BLEPayload.Builder(21);
                builder.advertisement_data = packageName;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                Bundle extras = intent.getExtras();
                if (extras != null && (keySet = extras.keySet()) != null) {
                    for (String str2 : keySet) {
                        Bundle extras2 = intent.getExtras();
                        extras2.getClass();
                        linkedHashMap2.put(str2, String.valueOf(extras2.get(str2)));
                    }
                }
                builder.frequency = linkedHashMap2;
                navigator.goTo(FlowStarter.startPlasmaFlowWithParams$default((FlowStarter) this.googlePaymentAuthInitiator.delegate, Recorder$$ExternalSyntheticOutline2.m("MANAGED_CUSTOMER_REQUEST?params=", builder.build().encodeByteString().base64()), paymentScreens$HomeScreens$Home, ScenarioInitiatorType.ANDROID_INTENT, uri, null, null, true, null, 368));
                return true;
            }
            boolean equals = "com.google.android.gms".equals(activity.getCallingPackage());
            if (Intrinsics.areEqual(intent.getAction(), this.applicationId.concat(".a2a")) && equals) {
                String stringExtra4 = intent.getStringExtra("android.intent.extra.TEXT");
                stringExtra4.getClass();
                navigator.goTo(new BlockersScreens.GooglePayActivationScreen(FlowStarter.startFlow$default((RealFlowStarter) this.flowStarter, BlockersData.Flow.CLIENT_SCENARIO, new BlockersScreens.GooglePayProvisioningExitScreen(false), null, ClientScenario.GOOGLE_PAY_PROVISIONING, null, null, null, null, null, IptcConstants.IMAGE_RESOURCE_BLOCK_BW_HALFTONING_INFO), stringExtra4));
                return true;
            }
        }
        return false;
    }

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider activity;
        public final Provider analytics;
        public final Provider applicationId;
        public final Provider appsFlyerClient;
        public final Provider bitcoinInboundNavigatorFactory;
        public final Provider cashDatabase;
        public final Provider cryptoInvoiceParser;
        public final Provider deepLinkParser;
        public final Provider errorReporter;
        public final Provider featureFlagManager;
        public final Provider flowStarter;
        public final Provider googlePaymentAuthInitiator;
        public final Provider packageManager;
        public final Provider routerFactory;
        public final Provider sessionManager;
        public final Provider supportNavigator;
        public final Provider userJourneyTracker;
        public final Provider uuidGenerator;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, Object obj, Object obj2, Provider provider3, Provider provider4, Provider provider5, Provider provider6, Provider provider7, Provider provider8, LambdaProvider lambdaProvider, Object obj3, DoubleCheck doubleCheck, Provider provider9, Provider provider10, DoubleCheck doubleCheck2, Provider provider11, Factory factory, int i) {
            this.$r8$classId = i;
            this.analytics = provider;
            this.errorReporter = provider2;
            this.flowStarter = (Provider) obj;
            this.sessionManager = (Provider) obj2;
            this.cashDatabase = provider3;
            this.routerFactory = provider4;
            this.featureFlagManager = provider5;
            this.supportNavigator = provider6;
            this.uuidGenerator = provider7;
            this.deepLinkParser = provider8;
            this.bitcoinInboundNavigatorFactory = lambdaProvider;
            this.userJourneyTracker = (Provider) obj3;
            this.applicationId = doubleCheck;
            this.appsFlyerClient = provider9;
            this.packageManager = provider10;
            this.activity = doubleCheck2;
            this.cryptoInvoiceParser = provider11;
            this.googlePaymentAuthInitiator = factory;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            Provider provider = this.googlePaymentAuthInitiator;
            Provider provider2 = this.cryptoInvoiceParser;
            Provider provider3 = this.packageManager;
            Provider provider4 = this.appsFlyerClient;
            Provider provider5 = this.applicationId;
            Provider provider6 = this.userJourneyTracker;
            Provider provider7 = this.bitcoinInboundNavigatorFactory;
            Provider provider8 = this.deepLinkParser;
            Provider provider9 = this.uuidGenerator;
            Provider provider10 = this.supportNavigator;
            Provider provider11 = this.featureFlagManager;
            Provider provider12 = this.routerFactory;
            Provider provider13 = this.cashDatabase;
            Provider provider14 = this.sessionManager;
            Provider provider15 = this.flowStarter;
            Provider provider16 = this.errorReporter;
            Provider provider17 = this.analytics;
            Provider provider18 = this.activity;
            switch (i) {
                case 0:
                    Analytics analytics = (Analytics) provider17.invoke();
                    ErrorReporter errorReporter = (ErrorReporter) provider16.invoke();
                    FlowStarter flowStarter = (FlowStarter) provider15.invoke();
                    SessionManager sessionManager = (SessionManager) provider14.invoke();
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider13.invoke();
                    Activity activity = (Activity) ((InstanceFactory) provider18).value;
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) provider12.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider11.invoke();
                    RealSupportNavigator realSupportNavigator = (RealSupportNavigator) provider10.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider9.invoke();
                    RealDeepLinkParser realDeepLinkParser = (RealDeepLinkParser) provider8.invoke();
                    RealCryptoInvoiceParser realCryptoInvoiceParser = (RealCryptoInvoiceParser) ((RealGlobalConfigManager.MetroFactory) provider2).invoke();
                    RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) provider7.invoke();
                    UserJourneyTracker userJourneyTracker = (UserJourneyTracker) provider6.invoke();
                    String str = (String) provider5.invoke();
                    AppsFlyerClient appsFlyerClient = (AppsFlyerClient) provider4.invoke();
                    ConnectionPool connectionPool = (ConnectionPool) ((MusicViewFactory$MetroFactory) provider).invoke();
                    AndroidPackageManager androidPackageManager = (AndroidPackageManager) provider3.invoke();
                    analytics.getClass();
                    errorReporter.getClass();
                    flowStarter.getClass();
                    sessionManager.getClass();
                    cashAccountDatabaseImpl.getClass();
                    activity.getClass();
                    realRouter$Factory$Impl.getClass();
                    featureFlagManager.getClass();
                    realSupportNavigator.getClass();
                    realUuidGenerator.getClass();
                    realDeepLinkParser.getClass();
                    realBitcoinInboundNavigator$Factory$Impl.getClass();
                    userJourneyTracker.getClass();
                    str.getClass();
                    appsFlyerClient.getClass();
                    androidPackageManager.getClass();
                    return new RealIntentHandler(analytics, errorReporter, flowStarter, sessionManager, cashAccountDatabaseImpl, activity, realRouter$Factory$Impl, featureFlagManager, realSupportNavigator, realUuidGenerator, realDeepLinkParser, realCryptoInvoiceParser, realBitcoinInboundNavigator$Factory$Impl, userJourneyTracker, str, appsFlyerClient, connectionPool, androidPackageManager);
                case 1:
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider17.invoke();
                    RealPaidInBitcoinStateManager realPaidInBitcoinStateManager = (RealPaidInBitcoinStateManager) provider16.invoke();
                    RealPaidInBitcoinNavigator$Factory$Impl realPaidInBitcoinNavigator$Factory$Impl = (RealPaidInBitcoinNavigator$Factory$Impl) provider15.invoke();
                    RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl2 = (RealBitcoinInboundNavigator$Factory$Impl) provider14.invoke();
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider13.invoke();
                    RealBitcoinSponsoredStateRepo realBitcoinSponsoredStateRepo = (RealBitcoinSponsoredStateRepo) provider12.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider11.invoke();
                    CryptoAutoInvestRepo cryptoAutoInvestRepo = (CryptoAutoInvestRepo) provider10.invoke();
                    RealAutoInvestRepo$Factory$Impl realAutoInvestRepo$Factory$Impl = (RealAutoInvestRepo$Factory$Impl) provider9.invoke();
                    RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo = (RealBitcoinRoundUpsRepo) provider8.invoke();
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) provider7.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) provider6.invoke();
                    Analytics analytics2 = (Analytics) provider5.invoke();
                    RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker = (RealGrowToolsManagerViewAppearanceTracker) provider4.invoke();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) provider3.invoke();
                    RealReceiveP2PAsBitcoinRepo realReceiveP2PAsBitcoinRepo = (RealReceiveP2PAsBitcoinRepo) provider18.invoke();
                    KeyValue keyValue = (KeyValue) ((ArcadeModule$ProvideHapticVibratorMetroFactory) provider2).invoke();
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) provider.invoke();
                    androidStringManager.getClass();
                    realPaidInBitcoinStateManager.getClass();
                    realPaidInBitcoinNavigator$Factory$Impl.getClass();
                    realBitcoinInboundNavigator$Factory$Impl2.getClass();
                    realBitcoinCapabilityProvider.getClass();
                    realBitcoinSponsoredStateRepo.getClass();
                    featureFlagManager2.getClass();
                    cryptoAutoInvestRepo.getClass();
                    realAutoInvestRepo$Factory$Impl.getClass();
                    realBitcoinRoundUpsRepo.getClass();
                    androidDateFormatManager.getClass();
                    realRouter$Factory$Impl2.getClass();
                    analytics2.getClass();
                    realGrowToolsManagerViewAppearanceTracker.getClass();
                    issuedCardManager.getClass();
                    realReceiveP2PAsBitcoinRepo.getClass();
                    factory.getClass();
                    return new BitcoinStackingToolsPresenter(androidStringManager, realPaidInBitcoinStateManager, realPaidInBitcoinNavigator$Factory$Impl, realBitcoinInboundNavigator$Factory$Impl2, realBitcoinCapabilityProvider, realBitcoinSponsoredStateRepo, featureFlagManager2, cryptoAutoInvestRepo, realAutoInvestRepo$Factory$Impl, realBitcoinRoundUpsRepo, androidDateFormatManager, realRouter$Factory$Impl2, analytics2, realGrowToolsManagerViewAppearanceTracker, issuedCardManager, realReceiveP2PAsBitcoinRepo, keyValue, factory);
                case 2:
                    ForcedLazyKt$forcedLazy$1 forcedLazyKt$forcedLazy$1 = (ForcedLazyKt$forcedLazy$1) provider17.invoke();
                    String str2 = (String) provider16.invoke();
                    String str3 = (String) provider15.invoke();
                    String str4 = (String) provider14.invoke();
                    SessionManager sessionManager2 = (SessionManager) provider13.invoke();
                    AndroidClock androidClock = (AndroidClock) provider12.invoke();
                    AndroidAccountManager androidAccountManager = (AndroidAccountManager) provider11.invoke();
                    SignedInStateManager signedInStateManager = (SignedInStateManager) provider10.invoke();
                    AndroidDeviceInfo androidDeviceInfo = (AndroidDeviceInfo) provider9.invoke();
                    String str5 = (String) provider8.invoke();
                    String str6 = (String) provider7.invoke();
                    RealRequestSigner realRequestSigner = (RealRequestSigner) provider6.invoke();
                    String str7 = (String) provider5.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider4.invoke();
                    ErrorReporter errorReporter2 = (ErrorReporter) provider3.invoke();
                    Random random = (Random) provider18.invoke();
                    RealLocaleManager realLocaleManager = (RealLocaleManager) provider2.invoke();
                    DefaultSocket defaultSocket = (DefaultSocket) ((WalletUiFactory$MetroFactory) provider).invoke();
                    forcedLazyKt$forcedLazy$1.getClass();
                    str3.getClass();
                    str4.getClass();
                    sessionManager2.getClass();
                    androidClock.getClass();
                    androidAccountManager.getClass();
                    signedInStateManager.getClass();
                    androidDeviceInfo.getClass();
                    str6.getClass();
                    realRequestSigner.getClass();
                    featureFlagManager3.getClass();
                    errorReporter2.getClass();
                    random.getClass();
                    realLocaleManager.getClass();
                    return new CashApiInterceptor(forcedLazyKt$forcedLazy$1, str2, str3, str4, sessionManager2, androidClock, androidAccountManager, signedInStateManager, androidDeviceInfo, str5, str6, realRequestSigner, str7, featureFlagManager3, errorReporter2, random, realLocaleManager, defaultSocket);
                default:
                    ArticlePresenter$Factory$Impl articlePresenter$Factory$Impl = (ArticlePresenter$Factory$Impl) ((InstanceFactory) provider18).value;
                    ContactSupportEmailInputPresenter$Factory$Impl contactSupportEmailInputPresenter$Factory$Impl = (ContactSupportEmailInputPresenter$Factory$Impl) ((InstanceFactory) provider17).value;
                    ContactSupportEmailMessagePresenter$Factory$Impl contactSupportEmailMessagePresenter$Factory$Impl = (ContactSupportEmailMessagePresenter$Factory$Impl) ((InstanceFactory) provider16).value;
                    SupportHomePresenter$Factory$Impl supportHomePresenter$Factory$Impl = (SupportHomePresenter$Factory$Impl) ((InstanceFactory) provider15).value;
                    PhoneVerificationPresenter$Factory$Impl phoneVerificationPresenter$Factory$Impl = (PhoneVerificationPresenter$Factory$Impl) ((InstanceFactory) provider14).value;
                    SupportSearchPresenter$Factory$Impl supportSearchPresenter$Factory$Impl = (SupportSearchPresenter$Factory$Impl) ((InstanceFactory) provider13).value;
                    SupportIncidentDetailsPresenter$Factory$Impl supportIncidentDetailsPresenter$Factory$Impl = (SupportIncidentDetailsPresenter$Factory$Impl) ((InstanceFactory) provider12).value;
                    SupportPhoneStatusPresenter$Factory$Impl supportPhoneStatusPresenter$Factory$Impl = (SupportPhoneStatusPresenter$Factory$Impl) ((InstanceFactory) provider11).value;
                    UnauthenticatedArticlePresenter$Factory$Impl unauthenticatedArticlePresenter$Factory$Impl = (UnauthenticatedArticlePresenter$Factory$Impl) ((InstanceFactory) provider10).value;
                    SupportFlowCheckConnectionPresenter$Factory$Impl supportFlowCheckConnectionPresenter$Factory$Impl = (SupportFlowCheckConnectionPresenter$Factory$Impl) ((InstanceFactory) provider9).value;
                    SupportLoadClientScenarioPresenter$Factory$Impl supportLoadClientScenarioPresenter$Factory$Impl = (SupportLoadClientScenarioPresenter$Factory$Impl) ((InstanceFactory) provider8).value;
                    SupportDisputeTrackerPresenter$Factory$Impl supportDisputeTrackerPresenter$Factory$Impl = (SupportDisputeTrackerPresenter$Factory$Impl) ((InstanceFactory) provider7).value;
                    SupportArticleIncidentsSheetPresenter$Factory$Impl supportArticleIncidentsSheetPresenter$Factory$Impl = (SupportArticleIncidentsSheetPresenter$Factory$Impl) ((InstanceFactory) provider6).value;
                    ScreenshotConfirmPresenter$Factory$Impl screenshotConfirmPresenter$Factory$Impl = (ScreenshotConfirmPresenter$Factory$Impl) ((InstanceFactory) provider5).value;
                    ScreenshotReviewPresenter$Factory$Impl screenshotReviewPresenter$Factory$Impl = (ScreenshotReviewPresenter$Factory$Impl) ((InstanceFactory) provider4).value;
                    SupportActivityPickerPresenter$Factory$Impl supportActivityPickerPresenter$Factory$Impl = (SupportActivityPickerPresenter$Factory$Impl) ((InstanceFactory) provider3).value;
                    SupportTransactionConfirmationPresenter$Factory$Impl supportTransactionConfirmationPresenter$Factory$Impl = (SupportTransactionConfirmationPresenter$Factory$Impl) ((InstanceFactory) provider2).value;
                    SupportHomeContactOptionsSheetPresenter$Factory$Impl supportHomeContactOptionsSheetPresenter$Factory$Impl = (SupportHomeContactOptionsSheetPresenter$Factory$Impl) ((InstanceFactory) provider).value;
                    articlePresenter$Factory$Impl.getClass();
                    contactSupportEmailInputPresenter$Factory$Impl.getClass();
                    contactSupportEmailMessagePresenter$Factory$Impl.getClass();
                    supportHomePresenter$Factory$Impl.getClass();
                    phoneVerificationPresenter$Factory$Impl.getClass();
                    supportSearchPresenter$Factory$Impl.getClass();
                    supportIncidentDetailsPresenter$Factory$Impl.getClass();
                    supportPhoneStatusPresenter$Factory$Impl.getClass();
                    unauthenticatedArticlePresenter$Factory$Impl.getClass();
                    supportFlowCheckConnectionPresenter$Factory$Impl.getClass();
                    supportLoadClientScenarioPresenter$Factory$Impl.getClass();
                    supportDisputeTrackerPresenter$Factory$Impl.getClass();
                    supportArticleIncidentsSheetPresenter$Factory$Impl.getClass();
                    screenshotConfirmPresenter$Factory$Impl.getClass();
                    screenshotReviewPresenter$Factory$Impl.getClass();
                    supportActivityPickerPresenter$Factory$Impl.getClass();
                    supportTransactionConfirmationPresenter$Factory$Impl.getClass();
                    supportHomeContactOptionsSheetPresenter$Factory$Impl.getClass();
                    return new WorkPresenterFactory(articlePresenter$Factory$Impl, contactSupportEmailInputPresenter$Factory$Impl, contactSupportEmailMessagePresenter$Factory$Impl, supportHomePresenter$Factory$Impl, phoneVerificationPresenter$Factory$Impl, supportSearchPresenter$Factory$Impl, supportIncidentDetailsPresenter$Factory$Impl, supportPhoneStatusPresenter$Factory$Impl, unauthenticatedArticlePresenter$Factory$Impl, supportFlowCheckConnectionPresenter$Factory$Impl, supportLoadClientScenarioPresenter$Factory$Impl, supportDisputeTrackerPresenter$Factory$Impl, supportArticleIncidentsSheetPresenter$Factory$Impl, screenshotConfirmPresenter$Factory$Impl, screenshotReviewPresenter$Factory$Impl, supportActivityPickerPresenter$Factory$Impl, supportTransactionConfirmationPresenter$Factory$Impl, supportHomeContactOptionsSheetPresenter$Factory$Impl);
            }
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, InstanceFactory instanceFactory2, DoubleCheck doubleCheck4, RealBadger2.MetroFactory metroFactory, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck5, RealGlobalConfigManager.MetroFactory metroFactory2, InstanceFactory instanceFactory3, LambdaProvider lambdaProvider4, LambdaProvider lambdaProvider5, DoubleCheck doubleCheck6, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory, LambdaProvider lambdaProvider6) {
            this.$r8$classId = 0;
            this.analytics = doubleCheck;
            this.errorReporter = lambdaProvider;
            this.flowStarter = doubleCheck2;
            this.sessionManager = lambdaProvider2;
            this.cashDatabase = doubleCheck3;
            this.activity = instanceFactory;
            this.routerFactory = instanceFactory2;
            this.featureFlagManager = doubleCheck4;
            this.supportNavigator = metroFactory;
            this.uuidGenerator = lambdaProvider3;
            this.deepLinkParser = doubleCheck5;
            this.cryptoInvoiceParser = metroFactory2;
            this.bitcoinInboundNavigatorFactory = instanceFactory3;
            this.userJourneyTracker = lambdaProvider4;
            this.applicationId = lambdaProvider5;
            this.appsFlyerClient = doubleCheck6;
            this.googlePaymentAuthInitiator = musicViewFactory$MetroFactory;
            this.packageManager = lambdaProvider6;
        }

        public MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, InstanceFactory instanceFactory11, InstanceFactory instanceFactory12, InstanceFactory instanceFactory13, InstanceFactory instanceFactory14, InstanceFactory instanceFactory15, InstanceFactory instanceFactory16, InstanceFactory instanceFactory17, InstanceFactory instanceFactory18) {
            this.$r8$classId = 3;
            this.activity = instanceFactory;
            this.analytics = instanceFactory2;
            this.errorReporter = instanceFactory3;
            this.flowStarter = instanceFactory4;
            this.sessionManager = instanceFactory5;
            this.cashDatabase = instanceFactory6;
            this.routerFactory = instanceFactory7;
            this.featureFlagManager = instanceFactory8;
            this.supportNavigator = instanceFactory9;
            this.uuidGenerator = instanceFactory10;
            this.deepLinkParser = instanceFactory11;
            this.bitcoinInboundNavigatorFactory = instanceFactory12;
            this.userJourneyTracker = instanceFactory13;
            this.applicationId = instanceFactory14;
            this.appsFlyerClient = instanceFactory15;
            this.packageManager = instanceFactory16;
            this.cryptoInvoiceParser = instanceFactory17;
            this.googlePaymentAuthInitiator = instanceFactory18;
        }
    }
}
