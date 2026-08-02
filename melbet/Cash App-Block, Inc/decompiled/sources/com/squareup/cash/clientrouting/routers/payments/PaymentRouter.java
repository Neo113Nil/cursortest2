package com.squareup.cash.clientrouting.routers.payments;

import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.sqldelight.coroutines.FlowQuery$mapToList$$inlined$map$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahi;
import com.google.mlkit.vision.text.zza;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.asset.Origin;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.analytics.RouteAnalyticsParams$ViewPayCashtagAnalyticsParams;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.fallback.CashtagBrandNavigator$Companion;
import com.squareup.cash.clientrouting.fallback.RealCashtagBrandNavigator$Factory$Impl;
import com.squareup.cash.clientsync.models.SyncTrigger;
import com.squareup.cash.clientsync.pipeline.SyncScope;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.data.profile.RealReferralManager;
import com.squareup.cash.db.InstrumentLinkingConfig;
import com.squareup.cash.db.contacts.Recipient;
import com.squareup.cash.featureflags.AmplitudeExperiments$CoreP2pFlowRedesign;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$P2pCoreFlowPersonFirst;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PayLinksRecipient;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ViewRequestSmsEmailAnonymousClientRoutes;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.intent.Source;
import com.squareup.cash.mosaic.personalization.api.v1.Entity;
import com.squareup.cash.payments.navigation.real.RealPaymentsInboundNavigator$Factory$Impl;
import com.squareup.cash.payments.screens.PaymentConfigurationFlow;
import com.squareup.cash.payments.screens.PaymentFlowData;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.recipients.backend.api.SuggestionStrategy;
import com.squareup.cash.recipients.backend.real.RealRecipientFinder;
import com.squareup.cash.screens.RedactedParcelable;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.work.service.real.WorkCookieJar;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.app.AppCreationActivity;
import com.squareup.protos.franklin.common.Orientation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.text.StringsKt;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class PaymentRouter {
    public final RealActivityUpdatesNotifier activityUpdatesNotifier;
    public final AppConfigManager appConfigManager;
    public final EglCore cashtagBrandNavigator;
    public final RealClientSyncer clientSyncer;
    public final FeatureFlagManager featureFlagManager;
    public final CoroutineContext ioDispatcher;
    public final RealJurisdictionConfigManager jurisdictionConfigManager;
    public final Navigator navigator;
    public final WorkCookieJar paymentsInboundNavigator;
    public final RealProfileManager profileManager;
    public final RealRecipientFinder recipientFinder;
    public final RealReferralManager referralManager;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Source.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                Source source = Source.IN_APP_SCANNER;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                Source source2 = Source.IN_APP_SCANNER;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[AppCreationActivity.values().length];
            try {
                iArr2[AppCreationActivity.DEEPLINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public PaymentRouter(RealCashtagBrandNavigator$Factory$Impl realCashtagBrandNavigator$Factory$Impl, FeatureFlagManager featureFlagManager, CoroutineContext coroutineContext, Navigator navigator, RealPaymentsInboundNavigator$Factory$Impl realPaymentsInboundNavigator$Factory$Impl, RealProfileManager realProfileManager, RealRecipientFinder realRecipientFinder, RealUuidGenerator realUuidGenerator, RealClientSyncer realClientSyncer, RealReferralManager realReferralManager, RealJurisdictionConfigManager realJurisdictionConfigManager, RealActivityUpdatesNotifier realActivityUpdatesNotifier, AppConfigManager appConfigManager) {
        navigator.getClass();
        this.featureFlagManager = featureFlagManager;
        this.ioDispatcher = coroutineContext;
        this.navigator = navigator;
        this.profileManager = realProfileManager;
        this.recipientFinder = realRecipientFinder;
        this.clientSyncer = realClientSyncer;
        this.referralManager = realReferralManager;
        this.jurisdictionConfigManager = realJurisdictionConfigManager;
        this.activityUpdatesNotifier = realActivityUpdatesNotifier;
        this.appConfigManager = appConfigManager;
        this.cashtagBrandNavigator = realCashtagBrandNavigator$Factory$Impl.create(navigator);
        this.paymentsInboundNavigator = new WorkCookieJar(navigator);
    }

    public static AppCreationActivity appCreationActivity(RoutingParams routingParams) {
        String str;
        AppCreationActivity appCreationActivity;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (deepLinkMetadata != null && (str = deepLinkMetadata.deepLinkSource) != null) {
            int ordinal = Source.valueOf(str).ordinal();
            if (ordinal == 0) {
                appCreationActivity = AppCreationActivity.IN_APP_SCANNER;
            } else {
                if (ordinal != 1 && ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                appCreationActivity = AppCreationActivity.DEEPLINK;
            }
            if (appCreationActivity != null) {
                return appCreationActivity;
            }
        }
        return AppCreationActivity.DEEPLINK;
    }

    public static /* synthetic */ Object routeCashtag$default(PaymentRouter paymentRouter, String str, String str2, String str3, String str4, RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1, int i) {
        return paymentRouter.routeCashtag(str, str2, str3, str4, routingParams, (i & 32) == 0, (i & 64) == 0, realClientRouteRouter$route$1);
    }

    public static /* synthetic */ Object routePaymentRequest$default(PaymentRouter paymentRouter, RoutingParams routingParams, Recipient recipient, String str, ContinuationImpl continuationImpl, int i) {
        if ((i & 4) != 0) {
            str = "";
        }
        return paymentRouter.routePaymentRequest(routingParams, recipient, str, null, continuationImpl);
    }

    public final PaymentScreens.PaymentConfiguration buildPaymentConfigurationScreen(Orientation orientation, Money money, PaymentConfigurationFlow paymentConfigurationFlow, RoutingParams routingParams) {
        Screen screen = routingParams.exitScreen;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (screen == null) {
            screen = routingParams.origin;
        }
        Screen screen2 = screen;
        FeatureContext featureContext = routingParams.featureContext;
        FeatureContext.MoneybotChatContext moneybotChatContext = featureContext instanceof FeatureContext.MoneybotChatContext ? (FeatureContext.MoneybotChatContext) featureContext : null;
        return new PaymentScreens.PaymentConfiguration(RealUuidGenerator.generate(), money, orientation, screen2, appCreationActivity(routingParams), (WhenMappings.$EnumSwitchMapping$1[appCreationActivity(routingParams).ordinal()] != 1 || deepLinkMetadata == null) ? null : deepLinkMetadata.referrer, deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null, (String) null, paymentConfigurationFlow, moneybotChatContext != null ? new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId) : null, EnumC0170g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
    }

    public final PaymentScreens.QuickPay buildQuickPayScreen(Orientation orientation, Recipient recipient, CurrencyCode currencyCode, RouteAnalyticsParams$ViewPayCashtagAnalyticsParams routeAnalyticsParams$ViewPayCashtagAnalyticsParams, RoutingParams routingParams, String str, String str2) {
        AppCreationActivity appCreationActivity;
        UUID generate;
        Screen screen = routingParams.exitScreen;
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        if (screen == null) {
            screen = routingParams.origin;
        }
        Screen screen2 = screen;
        FeatureContext featureContext = routingParams.featureContext;
        FeatureContext.MoneybotChatContext moneybotChatContext = featureContext instanceof FeatureContext.MoneybotChatContext ? (FeatureContext.MoneybotChatContext) featureContext : null;
        BlockersData.MoneybotContext moneybotContext = moneybotChatContext != null ? new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId) : null;
        Screen screen3 = routingParams.origin;
        List listOf = CollectionsKt__CollectionsJVMKt.listOf(zzahi.forPayment(recipient));
        Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(str, currencyCode);
        String str3 = (WhenMappings.$EnumSwitchMapping$1[appCreationActivity(routingParams).ordinal()] != 1 || deepLinkMetadata == null) ? null : deepLinkMetadata.referrer;
        String str4 = deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null;
        if (routeAnalyticsParams$ViewPayCashtagAnalyticsParams == null || (appCreationActivity = routeAnalyticsParams$ViewPayCashtagAnalyticsParams.appCreationActivity) == null) {
            appCreationActivity = appCreationActivity(routingParams);
        }
        AppCreationActivity appCreationActivity2 = appCreationActivity;
        String str5 = str2 == null ? "" : str2;
        Origin origin = routeAnalyticsParams$ViewPayCashtagAnalyticsParams != null ? Origin.PROFILE_DIRECTORY : Origin.APP_LINK;
        if (routeAnalyticsParams$ViewPayCashtagAnalyticsParams == null || (generate = routeAnalyticsParams$ViewPayCashtagAnalyticsParams.externalId) == null) {
            generate = RealUuidGenerator.generate();
        }
        return WorkCookieJar.buildQuickPay$default(this.paymentsInboundNavigator, screen2, screen3, orientation, currencyCode, listOf, appCreationActivity2, str3, str4, parseMoneyFromString$default, str5, new PaymentScreens.QuickPay.QuickPayAnalytics(generate, origin, (SuggestionStrategy) null, (String) null, (String) null, (Integer) null, (Integer) null, (Integer) null, (String) null, (Integer) null, (String) null, (Integer) null, 2), moneybotContext, 3072);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0146, code lost:
    
        if (route(r1, r8, r3) == r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
    
        if (r5 == r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        if (route(r5, r1, r3) == r4) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewPayEmail viewPayEmail, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$9 paymentRouter$route$9;
        int i;
        String utf8;
        Object findByAlias;
        Recipient recipient;
        String str;
        Object firstOrNull;
        RoutingParams routingParams2;
        CurrencyCode currencyCode;
        RoutingParams routingParams3 = routingParams;
        if (continuationImpl instanceof PaymentRouter$route$9) {
            paymentRouter$route$9 = (PaymentRouter$route$9) continuationImpl;
            int i2 = paymentRouter$route$9.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$9.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentRouter$route$9.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$9.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewPayEmail.base64EncodedEmail);
                    decodeBase64.getClass();
                    utf8 = decodeBase64.utf8();
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ViewRequestSmsEmailAnonymousClientRoutes.INSTANCE)).enabled()) {
                        paymentRouter$route$9.L$1 = routingParams3;
                        paymentRouter$route$9.L$2 = utf8;
                        paymentRouter$route$9.L$3 = null;
                        paymentRouter$route$9.label = 1;
                        findByAlias = this.recipientFinder.findByAlias(utf8, paymentRouter$route$9);
                    } else {
                        ClientRoute.DeprecatedViewPayEmail deprecatedViewPayEmail = new ClientRoute.DeprecatedViewPayEmail(utf8);
                        paymentRouter$route$9.L$1 = null;
                        paymentRouter$route$9.L$2 = null;
                        paymentRouter$route$9.label = 5;
                    }
                    return obj2;
                }
                if (i == 1) {
                    String str2 = paymentRouter$route$9.L$2;
                    RoutingParams routingParams4 = paymentRouter$route$9.L$1;
                    SafeTrace.throwOnFailure(obj);
                    utf8 = str2;
                    routingParams3 = routingParams4;
                    findByAlias = obj;
                    recipient = (Recipient) findByAlias;
                    ChannelFlowTransformLatest select = this.jurisdictionConfigManager.select();
                    paymentRouter$route$9.L$1 = routingParams3;
                    paymentRouter$route$9.L$2 = utf8;
                    paymentRouter$route$9.L$3 = recipient;
                    paymentRouter$route$9.label = 2;
                    Object firstOrNull2 = FlowKt.firstOrNull(select, paymentRouter$route$9);
                    if (firstOrNull2 != obj2) {
                        str = utf8;
                        obj = firstOrNull2;
                        JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                        if (jurisdictionConfigManager$JurisdictionConfig == null) {
                        }
                        FinishSetupTileBadgeCounter instrumentLinkingConfig = ((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig();
                        paymentRouter$route$9.L$1 = routingParams3;
                        paymentRouter$route$9.L$2 = str;
                        paymentRouter$route$9.L$3 = recipient;
                        paymentRouter$route$9.L$4 = r2;
                        paymentRouter$route$9.label = 3;
                        firstOrNull = FlowKt.firstOrNull(instrumentLinkingConfig, paymentRouter$route$9);
                        if (firstOrNull != obj2) {
                        }
                    }
                    return obj2;
                }
                if (i == 2) {
                    Recipient recipient2 = paymentRouter$route$9.L$3;
                    String str3 = paymentRouter$route$9.L$2;
                    RoutingParams routingParams5 = paymentRouter$route$9.L$1;
                    SafeTrace.throwOnFailure(obj);
                    recipient = recipient2;
                    routingParams3 = routingParams5;
                    str = str3;
                    JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig2 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                    CurrencyCode currencyCode2 = jurisdictionConfigManager$JurisdictionConfig2 == null ? jurisdictionConfigManager$JurisdictionConfig2.defaultCurrency : null;
                    FinishSetupTileBadgeCounter instrumentLinkingConfig2 = ((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig();
                    paymentRouter$route$9.L$1 = routingParams3;
                    paymentRouter$route$9.L$2 = str;
                    paymentRouter$route$9.L$3 = recipient;
                    paymentRouter$route$9.L$4 = currencyCode2;
                    paymentRouter$route$9.label = 3;
                    firstOrNull = FlowKt.firstOrNull(instrumentLinkingConfig2, paymentRouter$route$9);
                    if (firstOrNull != obj2) {
                        routingParams2 = routingParams3;
                        currencyCode = currencyCode2;
                        obj = firstOrNull;
                        InstrumentLinkingConfig instrumentLinkingConfig3 = (InstrumentLinkingConfig) obj;
                        if (instrumentLinkingConfig3 == null) {
                        }
                        AnalyticsParams analyticsParams = routingParams2.analyticsParams;
                        if (!(analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams)) {
                        }
                        if (currencyCode == null) {
                        }
                    }
                    return obj2;
                }
                if (i == 3) {
                    currencyCode = paymentRouter$route$9.L$4;
                    recipient = paymentRouter$route$9.L$3;
                    str = paymentRouter$route$9.L$2;
                    routingParams2 = paymentRouter$route$9.L$1;
                    SafeTrace.throwOnFailure(obj);
                    InstrumentLinkingConfig instrumentLinkingConfig32 = (InstrumentLinkingConfig) obj;
                    long j = instrumentLinkingConfig32 == null ? instrumentLinkingConfig32.credit_card_fee_bps : 0L;
                    AnalyticsParams analyticsParams2 = routingParams2.analyticsParams;
                    RouteAnalyticsParams$ViewPayCashtagAnalyticsParams viewPayCashtagAnalyticsParams = !(analyticsParams2 instanceof AnalyticsParams.GlobalSearchAnalyticsParams) ? ((AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams2).toViewPayCashtagAnalyticsParams() : null;
                    if (currencyCode == null) {
                        Navigator navigator = this.navigator;
                        if (recipient == null) {
                            CurrencyCode currencyCode3 = currencyCode;
                            Orientation orientation = Orientation.CASH;
                            Parcelable.Creator<Recipient> creator = Recipient.CREATOR;
                            navigator.goTo(buildQuickPayScreen(orientation, zza.createEmailRecipient(j, str, str), currencyCode3, viewPayCashtagAnalyticsParams, routingParams2, "0", ""));
                        } else {
                            Orientation orientation2 = Orientation.CASH;
                            navigator.goTo(buildQuickPayScreen(orientation2, recipient, currencyCode, viewPayCashtagAnalyticsParams, routingParams2, "0", ""));
                        }
                        return Unit.INSTANCE;
                    }
                    ClientRoute.DeprecatedViewPayEmail deprecatedViewPayEmail2 = new ClientRoute.DeprecatedViewPayEmail(str);
                    paymentRouter$route$9.L$1 = null;
                    paymentRouter$route$9.L$2 = null;
                    paymentRouter$route$9.L$3 = null;
                    paymentRouter$route$9.L$4 = null;
                    paymentRouter$route$9.label = 4;
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        paymentRouter$route$9 = new PaymentRouter$route$9(this, continuationImpl);
        Object obj3 = paymentRouter$route$9.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$9.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object routeAlias(String str, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$routeAlias$1 paymentRouter$routeAlias$1;
        Object obj;
        int i;
        Object findByAlias;
        RoutingParams routingParams2;
        Object firstOrNull;
        RoutingParams routingParams3;
        Object obj2;
        Recipient recipient;
        CurrencyCode currencyCode;
        if (continuationImpl instanceof PaymentRouter$routeAlias$1) {
            paymentRouter$routeAlias$1 = (PaymentRouter$routeAlias$1) continuationImpl;
            int i2 = paymentRouter$routeAlias$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$routeAlias$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj3 = paymentRouter$routeAlias$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$routeAlias$1.label;
                Screen screen = null;
                screen = null;
                screen = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj3);
                    paymentRouter$routeAlias$1.L$1 = routingParams;
                    paymentRouter$routeAlias$1.label = 1;
                    findByAlias = this.recipientFinder.findByAlias(str, paymentRouter$routeAlias$1);
                    if (findByAlias != obj) {
                        routingParams2 = routingParams;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Recipient recipient2 = paymentRouter$routeAlias$1.L$2;
                    RoutingParams routingParams4 = paymentRouter$routeAlias$1.L$1;
                    SafeTrace.throwOnFailure(obj3);
                    routingParams3 = routingParams4;
                    recipient = recipient2;
                    obj2 = obj3;
                    currencyCode = (CurrencyCode) obj2;
                    if (recipient != null && currencyCode != null && recipient.hasValidAlias) {
                        AnalyticsParams analyticsParams = routingParams3.analyticsParams;
                        screen = buildQuickPayScreen(Orientation.CASH, recipient, currencyCode, analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams ? ((AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams).toViewPayCashtagAnalyticsParams() : null, routingParams3, "0", "");
                    }
                    if (screen == null && (screen = routingParams3.origin) == null) {
                        screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                    }
                    this.navigator.goTo(screen);
                    return Unit.INSTANCE;
                }
                RoutingParams routingParams5 = paymentRouter$routeAlias$1.L$1;
                SafeTrace.throwOnFailure(obj3);
                findByAlias = obj3;
                routingParams2 = routingParams5;
                Recipient recipient3 = (Recipient) findByAlias;
                FlowQuery$mapToList$$inlined$map$1 currencyCode2 = this.profileManager.currencyCode();
                paymentRouter$routeAlias$1.L$1 = routingParams2;
                paymentRouter$routeAlias$1.L$2 = recipient3;
                paymentRouter$routeAlias$1.label = 2;
                firstOrNull = FlowKt.firstOrNull(currencyCode2, paymentRouter$routeAlias$1);
                if (firstOrNull != obj) {
                    routingParams3 = routingParams2;
                    obj2 = firstOrNull;
                    recipient = recipient3;
                    currencyCode = (CurrencyCode) obj2;
                    if (recipient != null) {
                        AnalyticsParams analyticsParams2 = routingParams3.analyticsParams;
                        screen = buildQuickPayScreen(Orientation.CASH, recipient, currencyCode, analyticsParams2 instanceof AnalyticsParams.GlobalSearchAnalyticsParams ? ((AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams2).toViewPayCashtagAnalyticsParams() : null, routingParams3, "0", "");
                    }
                    if (screen == null) {
                        screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                    }
                    this.navigator.goTo(screen);
                    return Unit.INSTANCE;
                }
                return obj;
            }
        }
        paymentRouter$routeAlias$1 = new PaymentRouter$routeAlias$1(this, continuationImpl);
        Object obj32 = paymentRouter$routeAlias$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$routeAlias$1.label;
        Screen screen2 = null;
        screen2 = null;
        screen2 = null;
        if (i != 0) {
        }
        Recipient recipient32 = (Recipient) findByAlias;
        FlowQuery$mapToList$$inlined$map$1 currencyCode22 = this.profileManager.currencyCode();
        paymentRouter$routeAlias$1.L$1 = routingParams2;
        paymentRouter$routeAlias$1.L$2 = recipient32;
        paymentRouter$routeAlias$1.label = 2;
        firstOrNull = FlowKt.firstOrNull(currencyCode22, paymentRouter$routeAlias$1);
        if (firstOrNull != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0143 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object routeCashtag(String str, String str2, String str3, String str4, RoutingParams routingParams, boolean z, boolean z2, ContinuationImpl continuationImpl) {
        PaymentRouter$routeCashtag$1 paymentRouter$routeCashtag$1;
        Object obj;
        int i;
        RouteAnalyticsParams$ViewPayCashtagAnalyticsParams viewPayCashtagAnalyticsParams;
        String str5;
        String str6;
        boolean z3;
        String str7;
        boolean z4;
        String str8;
        Object obj2;
        Object firstOrNull;
        RouteAnalyticsParams$ViewPayCashtagAnalyticsParams routeAnalyticsParams$ViewPayCashtagAnalyticsParams;
        Object obj3;
        RoutingParams routingParams2;
        Recipient recipient;
        boolean z5;
        CurrencyCode currencyCode;
        Object obj4;
        CurrencyCode currencyCode2;
        String str9;
        RouteAnalyticsParams$ViewPayCashtagAnalyticsParams routeAnalyticsParams$ViewPayCashtagAnalyticsParams2;
        RoutingParams routingParams3;
        String str10;
        RoutingParams routingParams4;
        RoutingParams routingParams5 = routingParams;
        if (continuationImpl instanceof PaymentRouter$routeCashtag$1) {
            paymentRouter$routeCashtag$1 = (PaymentRouter$routeCashtag$1) continuationImpl;
            int i2 = paymentRouter$routeCashtag$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$routeCashtag$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj5 = paymentRouter$routeCashtag$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$routeCashtag$1.label;
                Screen screen = null;
                screen = null;
                screen = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj5);
                    AnalyticsParams analyticsParams = routingParams5.analyticsParams;
                    viewPayCashtagAnalyticsParams = analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams ? ((AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams).toViewPayCashtagAnalyticsParams() : null;
                    paymentRouter$routeCashtag$1.L$0 = str;
                    paymentRouter$routeCashtag$1.L$1 = str2;
                    str5 = str3;
                    paymentRouter$routeCashtag$1.L$2 = str5;
                    str6 = str4;
                    paymentRouter$routeCashtag$1.L$3 = str6;
                    paymentRouter$routeCashtag$1.L$4 = routingParams5;
                    paymentRouter$routeCashtag$1.L$5 = viewPayCashtagAnalyticsParams;
                    z3 = z;
                    paymentRouter$routeCashtag$1.Z$0 = z3;
                    paymentRouter$routeCashtag$1.Z$1 = z2;
                    paymentRouter$routeCashtag$1.label = 1;
                    Object findByCashtag = this.recipientFinder.findByCashtag(str, str2, paymentRouter$routeCashtag$1);
                    if (findByCashtag != obj) {
                        str7 = str;
                        z4 = z2;
                        str8 = str2;
                        obj2 = findByCashtag;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z4 = paymentRouter$routeCashtag$1.Z$1;
                        currencyCode2 = paymentRouter$routeCashtag$1.L$7;
                        recipient = paymentRouter$routeCashtag$1.L$6;
                        routeAnalyticsParams$ViewPayCashtagAnalyticsParams2 = paymentRouter$routeCashtag$1.L$5;
                        routingParams3 = paymentRouter$routeCashtag$1.L$4;
                        str10 = paymentRouter$routeCashtag$1.L$3;
                        str9 = paymentRouter$routeCashtag$1.L$2;
                        SafeTrace.throwOnFailure(obj5);
                        obj4 = obj5;
                        if (!((Boolean) obj4).booleanValue()) {
                            return Unit.INSTANCE;
                        }
                        currencyCode = currencyCode2;
                        routeAnalyticsParams$ViewPayCashtagAnalyticsParams = routeAnalyticsParams$ViewPayCashtagAnalyticsParams2;
                        routingParams2 = routingParams3;
                        str6 = str10;
                        str5 = str9;
                        if (recipient != null && currencyCode != null && recipient.hasValidAlias) {
                            if (z4) {
                                AmplitudeExperiments$CoreP2pFlowRedesign amplitudeExperiments$CoreP2pFlowRedesign = AmplitudeExperiments$CoreP2pFlowRedesign.INSTANCE;
                                RealFeatureFlagManager realFeatureFlagManager = (RealFeatureFlagManager) this.featureFlagManager;
                                if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) realFeatureFlagManager.currentValue(amplitudeExperiments$CoreP2pFlowRedesign)).enabled() && ((FeatureFlag$EnabledDisabledFeatureFlag$Options) realFeatureFlagManager.peekCurrentValue(LaunchDarklyFeatureFlags$P2pCoreFlowPersonFirst.INSTANCE)).enabled()) {
                                    screen = buildPaymentConfigurationScreen(Orientation.CASH, Moneys.parseMoneyFromString$default(str5, currencyCode), new PaymentConfigurationFlow.PersonFirst(new PaymentFlowData.StandardFlowData(str6 != null ? new RedactedString(str6) : null, new RedactedParcelable(zzahi.forPayment(recipient))), true), routingParams2);
                                }
                            }
                            RoutingParams routingParams6 = routingParams2;
                            screen = buildQuickPayScreen(Orientation.CASH, recipient, currencyCode, routeAnalyticsParams$ViewPayCashtagAnalyticsParams, routingParams6, str5, str6);
                            routingParams4 = routingParams6;
                            if (screen == null && (screen = routingParams4.origin) == null) {
                                screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                            }
                            this.navigator.goTo(screen);
                            return Unit.INSTANCE;
                        }
                        routingParams4 = routingParams2;
                        if (screen == null) {
                            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                        }
                        this.navigator.goTo(screen);
                        return Unit.INSTANCE;
                    }
                    z4 = paymentRouter$routeCashtag$1.Z$1;
                    z5 = paymentRouter$routeCashtag$1.Z$0;
                    recipient = paymentRouter$routeCashtag$1.L$6;
                    RouteAnalyticsParams$ViewPayCashtagAnalyticsParams routeAnalyticsParams$ViewPayCashtagAnalyticsParams3 = paymentRouter$routeCashtag$1.L$5;
                    routingParams2 = paymentRouter$routeCashtag$1.L$4;
                    str6 = paymentRouter$routeCashtag$1.L$3;
                    String str11 = paymentRouter$routeCashtag$1.L$2;
                    str8 = paymentRouter$routeCashtag$1.L$1;
                    str7 = paymentRouter$routeCashtag$1.L$0;
                    SafeTrace.throwOnFailure(obj5);
                    routeAnalyticsParams$ViewPayCashtagAnalyticsParams = routeAnalyticsParams$ViewPayCashtagAnalyticsParams3;
                    str5 = str11;
                    obj3 = obj5;
                    currencyCode = (CurrencyCode) obj3;
                    if (z5) {
                        String m$1 = Recorder$$ExternalSyntheticOutline2.m$1(str7, str8);
                        String extractAttributionKey = CashtagBrandNavigator$Companion.extractAttributionKey(routingParams2);
                        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams2.deepLinkMetadata;
                        String str12 = deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null;
                        String extractCouponCode = CashtagBrandNavigator$Companion.extractCouponCode(routingParams2);
                        paymentRouter$routeCashtag$1.L$0 = null;
                        paymentRouter$routeCashtag$1.L$1 = null;
                        paymentRouter$routeCashtag$1.L$2 = str5;
                        paymentRouter$routeCashtag$1.L$3 = str6;
                        paymentRouter$routeCashtag$1.L$4 = routingParams2;
                        paymentRouter$routeCashtag$1.L$5 = routeAnalyticsParams$ViewPayCashtagAnalyticsParams;
                        paymentRouter$routeCashtag$1.L$6 = recipient;
                        paymentRouter$routeCashtag$1.L$7 = currencyCode;
                        paymentRouter$routeCashtag$1.Z$0 = z5;
                        paymentRouter$routeCashtag$1.Z$1 = z4;
                        paymentRouter$routeCashtag$1.label = 3;
                        Object navigateToBrandProfile = this.cashtagBrandNavigator.navigateToBrandProfile(m$1, recipient, extractAttributionKey, str12, extractCouponCode);
                        if (navigateToBrandProfile != obj) {
                            obj4 = navigateToBrandProfile;
                            currencyCode2 = currencyCode;
                            str9 = str5;
                            routeAnalyticsParams$ViewPayCashtagAnalyticsParams2 = routeAnalyticsParams$ViewPayCashtagAnalyticsParams;
                            routingParams3 = routingParams2;
                            str10 = str6;
                            if (!((Boolean) obj4).booleanValue()) {
                            }
                        }
                        return obj;
                    }
                    if (recipient != null) {
                        if (z4) {
                        }
                        RoutingParams routingParams62 = routingParams2;
                        screen = buildQuickPayScreen(Orientation.CASH, recipient, currencyCode, routeAnalyticsParams$ViewPayCashtagAnalyticsParams, routingParams62, str5, str6);
                        routingParams4 = routingParams62;
                        if (screen == null) {
                        }
                        this.navigator.goTo(screen);
                        return Unit.INSTANCE;
                    }
                    routingParams4 = routingParams2;
                    if (screen == null) {
                    }
                    this.navigator.goTo(screen);
                    return Unit.INSTANCE;
                }
                z4 = paymentRouter$routeCashtag$1.Z$1;
                boolean z6 = paymentRouter$routeCashtag$1.Z$0;
                RouteAnalyticsParams$ViewPayCashtagAnalyticsParams routeAnalyticsParams$ViewPayCashtagAnalyticsParams4 = paymentRouter$routeCashtag$1.L$5;
                RoutingParams routingParams7 = paymentRouter$routeCashtag$1.L$4;
                str6 = paymentRouter$routeCashtag$1.L$3;
                String str13 = paymentRouter$routeCashtag$1.L$2;
                str8 = paymentRouter$routeCashtag$1.L$1;
                str7 = paymentRouter$routeCashtag$1.L$0;
                SafeTrace.throwOnFailure(obj5);
                z3 = z6;
                obj2 = obj5;
                viewPayCashtagAnalyticsParams = routeAnalyticsParams$ViewPayCashtagAnalyticsParams4;
                routingParams5 = routingParams7;
                str5 = str13;
                Recipient recipient2 = (Recipient) obj2;
                FlowQuery$mapToList$$inlined$map$1 currencyCode3 = this.profileManager.currencyCode();
                paymentRouter$routeCashtag$1.L$0 = str7;
                paymentRouter$routeCashtag$1.L$1 = str8;
                paymentRouter$routeCashtag$1.L$2 = str5;
                paymentRouter$routeCashtag$1.L$3 = str6;
                paymentRouter$routeCashtag$1.L$4 = routingParams5;
                paymentRouter$routeCashtag$1.L$5 = viewPayCashtagAnalyticsParams;
                paymentRouter$routeCashtag$1.L$6 = recipient2;
                paymentRouter$routeCashtag$1.Z$0 = z3;
                paymentRouter$routeCashtag$1.Z$1 = z4;
                paymentRouter$routeCashtag$1.label = 2;
                firstOrNull = FlowKt.firstOrNull(currencyCode3, paymentRouter$routeCashtag$1);
                if (firstOrNull != obj) {
                    routeAnalyticsParams$ViewPayCashtagAnalyticsParams = viewPayCashtagAnalyticsParams;
                    obj3 = firstOrNull;
                    routingParams2 = routingParams5;
                    recipient = recipient2;
                    z5 = z3;
                    currencyCode = (CurrencyCode) obj3;
                    if (z5) {
                    }
                    if (recipient != null) {
                    }
                    routingParams4 = routingParams2;
                    if (screen == null) {
                    }
                    this.navigator.goTo(screen);
                    return Unit.INSTANCE;
                }
                return obj;
            }
        }
        paymentRouter$routeCashtag$1 = new PaymentRouter$routeCashtag$1(this, continuationImpl);
        Object obj52 = paymentRouter$routeCashtag$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$routeCashtag$1.label;
        Screen screen2 = null;
        screen2 = null;
        screen2 = null;
        if (i != 0) {
        }
        Recipient recipient22 = (Recipient) obj2;
        FlowQuery$mapToList$$inlined$map$1 currencyCode32 = this.profileManager.currencyCode();
        paymentRouter$routeCashtag$1.L$0 = str7;
        paymentRouter$routeCashtag$1.L$1 = str8;
        paymentRouter$routeCashtag$1.L$2 = str5;
        paymentRouter$routeCashtag$1.L$3 = str6;
        paymentRouter$routeCashtag$1.L$4 = routingParams5;
        paymentRouter$routeCashtag$1.L$5 = viewPayCashtagAnalyticsParams;
        paymentRouter$routeCashtag$1.L$6 = recipient22;
        paymentRouter$routeCashtag$1.Z$0 = z3;
        paymentRouter$routeCashtag$1.Z$1 = z4;
        paymentRouter$routeCashtag$1.label = 2;
        firstOrNull = FlowKt.firstOrNull(currencyCode32, paymentRouter$routeCashtag$1);
        if (firstOrNull != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object routePaymentRequest(RoutingParams routingParams, Recipient recipient, String str, String str2, ContinuationImpl continuationImpl) {
        PaymentRouter$routePaymentRequest$1 paymentRouter$routePaymentRequest$1;
        int i;
        Object firstOrNull;
        RoutingParams routingParams2;
        String str3;
        RouteAnalyticsParams$ViewPayCashtagAnalyticsParams routeAnalyticsParams$ViewPayCashtagAnalyticsParams;
        Screen screen;
        String str4;
        Recipient recipient2;
        Screen buildQuickPayScreen;
        if (continuationImpl instanceof PaymentRouter$routePaymentRequest$1) {
            paymentRouter$routePaymentRequest$1 = (PaymentRouter$routePaymentRequest$1) continuationImpl;
            int i2 = paymentRouter$routePaymentRequest$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$routePaymentRequest$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentRouter$routePaymentRequest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$routePaymentRequest$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnalyticsParams analyticsParams = routingParams.analyticsParams;
                    AnalyticsParams.GlobalSearchAnalyticsParams globalSearchAnalyticsParams = analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams ? (AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams : null;
                    RouteAnalyticsParams$ViewPayCashtagAnalyticsParams viewPayCashtagAnalyticsParams = globalSearchAnalyticsParams != null ? globalSearchAnalyticsParams.toViewPayCashtagAnalyticsParams() : null;
                    FlowQuery$mapToList$$inlined$map$1 currencyCode = this.profileManager.currencyCode();
                    paymentRouter$routePaymentRequest$1.L$0 = routingParams;
                    paymentRouter$routePaymentRequest$1.L$1 = recipient;
                    paymentRouter$routePaymentRequest$1.L$2 = str;
                    paymentRouter$routePaymentRequest$1.L$3 = str2;
                    paymentRouter$routePaymentRequest$1.L$4 = viewPayCashtagAnalyticsParams;
                    paymentRouter$routePaymentRequest$1.label = 1;
                    firstOrNull = FlowKt.firstOrNull(currencyCode, paymentRouter$routePaymentRequest$1);
                    if (firstOrNull == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    routingParams2 = routingParams;
                    str3 = str;
                    routeAnalyticsParams$ViewPayCashtagAnalyticsParams = viewPayCashtagAnalyticsParams;
                    screen = null;
                    str4 = str2;
                    recipient2 = recipient;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    RouteAnalyticsParams$ViewPayCashtagAnalyticsParams routeAnalyticsParams$ViewPayCashtagAnalyticsParams2 = paymentRouter$routePaymentRequest$1.L$4;
                    String str5 = paymentRouter$routePaymentRequest$1.L$3;
                    String str6 = paymentRouter$routePaymentRequest$1.L$2;
                    Recipient recipient3 = paymentRouter$routePaymentRequest$1.L$1;
                    RoutingParams routingParams3 = paymentRouter$routePaymentRequest$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    routeAnalyticsParams$ViewPayCashtagAnalyticsParams = routeAnalyticsParams$ViewPayCashtagAnalyticsParams2;
                    screen = null;
                    str4 = str5;
                    firstOrNull = obj;
                    recipient2 = recipient3;
                    str3 = str6;
                    routingParams2 = routingParams3;
                }
                CurrencyCode currencyCode2 = (CurrencyCode) firstOrNull;
                buildQuickPayScreen = (recipient2 == null && currencyCode2 != null && recipient2.hasValidAlias) ? buildQuickPayScreen(Orientation.BILL, recipient2, currencyCode2, routeAnalyticsParams$ViewPayCashtagAnalyticsParams, routingParams2, str3, str4) : screen;
                if (buildQuickPayScreen == null && (buildQuickPayScreen = routingParams2.origin) == null) {
                    buildQuickPayScreen = PaymentScreens$HomeScreens$Home.INSTANCE;
                }
                this.navigator.goTo(buildQuickPayScreen);
                return Unit.INSTANCE;
            }
        }
        paymentRouter$routePaymentRequest$1 = new PaymentRouter$routePaymentRequest$1(this, continuationImpl);
        Object obj2 = paymentRouter$routePaymentRequest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$routePaymentRequest$1.label;
        if (i != 0) {
        }
        CurrencyCode currencyCode22 = (CurrencyCode) firstOrNull;
        if (recipient2 == null) {
        }
        if (buildQuickPayScreen == null) {
            buildQuickPayScreen = PaymentScreens$HomeScreens$Home.INSTANCE;
        }
        this.navigator.goTo(buildQuickPayScreen);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewPayProfile viewPayProfile, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$6 paymentRouter$route$6;
        Object obj;
        int i;
        RoutingParams routingParams2;
        Object obj2;
        Object firstOrNull;
        Recipient recipient;
        Object obj3;
        RoutingParams routingParams3;
        CurrencyCode currencyCode;
        if (continuationImpl instanceof PaymentRouter$route$6) {
            paymentRouter$route$6 = (PaymentRouter$route$6) continuationImpl;
            int i2 = paymentRouter$route$6.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$6.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj4 = paymentRouter$route$6.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$6.label;
                Screen screen = null;
                screen = null;
                screen = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj4);
                    String str = viewPayProfile.customerToken;
                    paymentRouter$route$6.L$1 = routingParams;
                    paymentRouter$route$6.label = 1;
                    Object firstOrNull2 = FlowKt.firstOrNull(this.recipientFinder.contactRepository.contactById(str), paymentRouter$route$6);
                    if (firstOrNull2 != obj) {
                        routingParams2 = routingParams;
                        obj2 = firstOrNull2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Recipient recipient2 = paymentRouter$route$6.L$2;
                    RoutingParams routingParams4 = paymentRouter$route$6.L$1;
                    SafeTrace.throwOnFailure(obj4);
                    routingParams3 = routingParams4;
                    recipient = recipient2;
                    obj3 = obj4;
                    currencyCode = (CurrencyCode) obj3;
                    if (recipient != null && currencyCode != null && recipient.hasValidAlias) {
                        AnalyticsParams analyticsParams = routingParams3.analyticsParams;
                        screen = buildQuickPayScreen(Orientation.CASH, recipient, currencyCode, analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams ? ((AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams).toViewPayCashtagAnalyticsParams() : null, routingParams3, "0", "");
                    }
                    if (screen == null && (screen = routingParams3.origin) == null) {
                        screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                    }
                    this.navigator.goTo(screen);
                    return Unit.INSTANCE;
                }
                routingParams2 = paymentRouter$route$6.L$1;
                SafeTrace.throwOnFailure(obj4);
                obj2 = obj4;
                Recipient recipient3 = (Recipient) obj2;
                FlowQuery$mapToList$$inlined$map$1 currencyCode2 = this.profileManager.currencyCode();
                paymentRouter$route$6.L$1 = routingParams2;
                paymentRouter$route$6.L$2 = recipient3;
                paymentRouter$route$6.label = 2;
                firstOrNull = FlowKt.firstOrNull(currencyCode2, paymentRouter$route$6);
                if (firstOrNull != obj) {
                    recipient = recipient3;
                    obj3 = firstOrNull;
                    routingParams3 = routingParams2;
                    currencyCode = (CurrencyCode) obj3;
                    if (recipient != null) {
                        AnalyticsParams analyticsParams2 = routingParams3.analyticsParams;
                        screen = buildQuickPayScreen(Orientation.CASH, recipient, currencyCode, analyticsParams2 instanceof AnalyticsParams.GlobalSearchAnalyticsParams ? ((AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams2).toViewPayCashtagAnalyticsParams() : null, routingParams3, "0", "");
                    }
                    if (screen == null) {
                        screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                    }
                    this.navigator.goTo(screen);
                    return Unit.INSTANCE;
                }
                return obj;
            }
        }
        paymentRouter$route$6 = new PaymentRouter$route$6(this, continuationImpl);
        Object obj42 = paymentRouter$route$6.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$6.label;
        Screen screen2 = null;
        screen2 = null;
        screen2 = null;
        if (i != 0) {
        }
        Recipient recipient32 = (Recipient) obj2;
        FlowQuery$mapToList$$inlined$map$1 currencyCode22 = this.profileManager.currencyCode();
        paymentRouter$route$6.L$1 = routingParams2;
        paymentRouter$route$6.L$2 = recipient32;
        paymentRouter$route$6.label = 2;
        firstOrNull = FlowKt.firstOrNull(currencyCode22, paymentRouter$route$6);
        if (firstOrNull != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0146, code lost:
    
        if (route(r1, r8, r3) == r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00a1, code lost:
    
        if (r5 == r4) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x015b, code lost:
    
        if (route(r5, r1, r3) == r4) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewPaySms viewPaySms, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$10 paymentRouter$route$10;
        int i;
        String utf8;
        Object findByAlias;
        Recipient recipient;
        String str;
        Object firstOrNull;
        RoutingParams routingParams2;
        CurrencyCode currencyCode;
        RoutingParams routingParams3 = routingParams;
        if (continuationImpl instanceof PaymentRouter$route$10) {
            paymentRouter$route$10 = (PaymentRouter$route$10) continuationImpl;
            int i2 = paymentRouter$route$10.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$10.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentRouter$route$10.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$10.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewPaySms.base64EncodedSms);
                    decodeBase64.getClass();
                    utf8 = decodeBase64.utf8();
                    if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ViewRequestSmsEmailAnonymousClientRoutes.INSTANCE)).enabled()) {
                        paymentRouter$route$10.L$1 = routingParams3;
                        paymentRouter$route$10.L$2 = utf8;
                        paymentRouter$route$10.L$3 = null;
                        paymentRouter$route$10.label = 1;
                        findByAlias = this.recipientFinder.findByAlias(utf8, paymentRouter$route$10);
                    } else {
                        ClientRoute.DeprecatedViewPaySms deprecatedViewPaySms = new ClientRoute.DeprecatedViewPaySms(utf8);
                        paymentRouter$route$10.L$1 = null;
                        paymentRouter$route$10.L$2 = null;
                        paymentRouter$route$10.label = 5;
                    }
                    return obj2;
                }
                if (i == 1) {
                    String str2 = paymentRouter$route$10.L$2;
                    RoutingParams routingParams4 = paymentRouter$route$10.L$1;
                    SafeTrace.throwOnFailure(obj);
                    utf8 = str2;
                    routingParams3 = routingParams4;
                    findByAlias = obj;
                    recipient = (Recipient) findByAlias;
                    ChannelFlowTransformLatest select = this.jurisdictionConfigManager.select();
                    paymentRouter$route$10.L$1 = routingParams3;
                    paymentRouter$route$10.L$2 = utf8;
                    paymentRouter$route$10.L$3 = recipient;
                    paymentRouter$route$10.label = 2;
                    Object firstOrNull2 = FlowKt.firstOrNull(select, paymentRouter$route$10);
                    if (firstOrNull2 != obj2) {
                        str = utf8;
                        obj = firstOrNull2;
                        JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                        if (jurisdictionConfigManager$JurisdictionConfig == null) {
                        }
                        FinishSetupTileBadgeCounter instrumentLinkingConfig = ((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig();
                        paymentRouter$route$10.L$1 = routingParams3;
                        paymentRouter$route$10.L$2 = str;
                        paymentRouter$route$10.L$3 = recipient;
                        paymentRouter$route$10.L$4 = r2;
                        paymentRouter$route$10.label = 3;
                        firstOrNull = FlowKt.firstOrNull(instrumentLinkingConfig, paymentRouter$route$10);
                        if (firstOrNull != obj2) {
                        }
                    }
                    return obj2;
                }
                if (i == 2) {
                    Recipient recipient2 = paymentRouter$route$10.L$3;
                    String str3 = paymentRouter$route$10.L$2;
                    RoutingParams routingParams5 = paymentRouter$route$10.L$1;
                    SafeTrace.throwOnFailure(obj);
                    recipient = recipient2;
                    routingParams3 = routingParams5;
                    str = str3;
                    JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig2 = (JurisdictionConfigManager$JurisdictionConfig) obj;
                    CurrencyCode currencyCode2 = jurisdictionConfigManager$JurisdictionConfig2 == null ? jurisdictionConfigManager$JurisdictionConfig2.defaultCurrency : null;
                    FinishSetupTileBadgeCounter instrumentLinkingConfig2 = ((RealAppConfigManager) this.appConfigManager).instrumentLinkingConfig();
                    paymentRouter$route$10.L$1 = routingParams3;
                    paymentRouter$route$10.L$2 = str;
                    paymentRouter$route$10.L$3 = recipient;
                    paymentRouter$route$10.L$4 = currencyCode2;
                    paymentRouter$route$10.label = 3;
                    firstOrNull = FlowKt.firstOrNull(instrumentLinkingConfig2, paymentRouter$route$10);
                    if (firstOrNull != obj2) {
                        routingParams2 = routingParams3;
                        currencyCode = currencyCode2;
                        obj = firstOrNull;
                        InstrumentLinkingConfig instrumentLinkingConfig3 = (InstrumentLinkingConfig) obj;
                        if (instrumentLinkingConfig3 == null) {
                        }
                        AnalyticsParams analyticsParams = routingParams2.analyticsParams;
                        if (!(analyticsParams instanceof AnalyticsParams.GlobalSearchAnalyticsParams)) {
                        }
                        if (currencyCode == null) {
                        }
                    }
                    return obj2;
                }
                if (i == 3) {
                    currencyCode = paymentRouter$route$10.L$4;
                    recipient = paymentRouter$route$10.L$3;
                    str = paymentRouter$route$10.L$2;
                    routingParams2 = paymentRouter$route$10.L$1;
                    SafeTrace.throwOnFailure(obj);
                    InstrumentLinkingConfig instrumentLinkingConfig32 = (InstrumentLinkingConfig) obj;
                    long j = instrumentLinkingConfig32 == null ? instrumentLinkingConfig32.credit_card_fee_bps : 0L;
                    AnalyticsParams analyticsParams2 = routingParams2.analyticsParams;
                    RouteAnalyticsParams$ViewPayCashtagAnalyticsParams viewPayCashtagAnalyticsParams = !(analyticsParams2 instanceof AnalyticsParams.GlobalSearchAnalyticsParams) ? ((AnalyticsParams.GlobalSearchAnalyticsParams) analyticsParams2).toViewPayCashtagAnalyticsParams() : null;
                    if (currencyCode == null) {
                        Navigator navigator = this.navigator;
                        if (recipient == null) {
                            CurrencyCode currencyCode3 = currencyCode;
                            Orientation orientation = Orientation.CASH;
                            Parcelable.Creator<Recipient> creator = Recipient.CREATOR;
                            navigator.goTo(buildQuickPayScreen(orientation, zza.createPhoneRecipient(j, str, str), currencyCode3, viewPayCashtagAnalyticsParams, routingParams2, "0", ""));
                        } else {
                            Orientation orientation2 = Orientation.CASH;
                            navigator.goTo(buildQuickPayScreen(orientation2, recipient, currencyCode, viewPayCashtagAnalyticsParams, routingParams2, "0", ""));
                        }
                        return Unit.INSTANCE;
                    }
                    ClientRoute.DeprecatedViewPaySms deprecatedViewPaySms2 = new ClientRoute.DeprecatedViewPaySms(str);
                    paymentRouter$route$10.L$1 = null;
                    paymentRouter$route$10.L$2 = null;
                    paymentRouter$route$10.L$3 = null;
                    paymentRouter$route$10.L$4 = null;
                    paymentRouter$route$10.label = 4;
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            }
        }
        paymentRouter$route$10 = new PaymentRouter$route$10(this, continuationImpl);
        Object obj3 = paymentRouter$route$10.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$10.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0083, code lost:
    
        if (r2 == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewPayWithOptions viewPayWithOptions, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$22 paymentRouter$route$22;
        CoroutineSingletons coroutineSingletons;
        int i;
        String utf8;
        Object findByCashtag;
        Object firstOrNull;
        RoutingParams routingParams2;
        String str;
        ClientRoute.ViewPayWithOptions viewPayWithOptions2;
        Recipient recipient;
        JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig;
        if (continuationImpl instanceof PaymentRouter$route$22) {
            paymentRouter$route$22 = (PaymentRouter$route$22) continuationImpl;
            int i2 = paymentRouter$route$22.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$22.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentRouter$route$22.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$22.label;
                Navigator navigator = this.navigator;
                RedactedParcelable redactedParcelable = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringsKt.isBlank(viewPayWithOptions.amount)) {
                        Screen screen = routingParams.origin;
                        if (screen == null) {
                            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                        }
                        navigator.goTo(screen);
                        return Unit.INSTANCE;
                    }
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewPayWithOptions.base64initiatornote);
                    utf8 = decodeBase64 != null ? decodeBase64.utf8() : null;
                    String str2 = viewPayWithOptions.currency;
                    String str3 = viewPayWithOptions.name;
                    paymentRouter$route$22.L$0 = viewPayWithOptions;
                    paymentRouter$route$22.L$1 = routingParams;
                    paymentRouter$route$22.L$2 = utf8;
                    paymentRouter$route$22.label = 1;
                    findByCashtag = this.recipientFinder.findByCashtag(str2, str3, paymentRouter$route$22);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        recipient = paymentRouter$route$22.L$3;
                        str = paymentRouter$route$22.L$2;
                        routingParams2 = paymentRouter$route$22.L$1;
                        viewPayWithOptions2 = paymentRouter$route$22.L$0;
                        SafeTrace.throwOnFailure(obj);
                        jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                        if (jurisdictionConfigManager$JurisdictionConfig != null || (r13 = jurisdictionConfigManager$JurisdictionConfig.defaultCurrency) == null) {
                            CurrencyCode currencyCode = CurrencyCode.USD;
                        }
                        boolean parseBoolean = StringsKt.isBlank(viewPayWithOptions2.personalization) ? true : Boolean.parseBoolean(viewPayWithOptions2.personalization);
                        Orientation orientation = Orientation.CASH;
                        Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(viewPayWithOptions2.amount, currencyCode);
                        RedactedString redactedString = str == null ? new RedactedString(str) : null;
                        if (recipient != null) {
                            if (!recipient.hasValidAlias) {
                                recipient = null;
                            }
                            if (recipient != null) {
                                redactedParcelable = new RedactedParcelable(zzahi.forPayment(recipient));
                            }
                        }
                        navigator.goTo(buildPaymentConfigurationScreen(orientation, parseMoneyFromString$default, new PaymentConfigurationFlow.Default(new PaymentFlowData.StandardFlowData(redactedString, redactedParcelable), parseBoolean), routingParams2));
                        return Unit.INSTANCE;
                    }
                    String str4 = paymentRouter$route$22.L$2;
                    routingParams = paymentRouter$route$22.L$1;
                    ClientRoute.ViewPayWithOptions viewPayWithOptions3 = paymentRouter$route$22.L$0;
                    SafeTrace.throwOnFailure(obj);
                    utf8 = str4;
                    viewPayWithOptions = viewPayWithOptions3;
                    findByCashtag = obj;
                }
                Recipient recipient2 = (Recipient) findByCashtag;
                ChannelFlowTransformLatest select = this.jurisdictionConfigManager.select();
                paymentRouter$route$22.L$0 = viewPayWithOptions;
                paymentRouter$route$22.L$1 = routingParams;
                paymentRouter$route$22.L$2 = utf8;
                paymentRouter$route$22.L$3 = recipient2;
                paymentRouter$route$22.label = 2;
                firstOrNull = FlowKt.firstOrNull(select, paymentRouter$route$22);
                if (firstOrNull != coroutineSingletons) {
                    routingParams2 = routingParams;
                    str = utf8;
                    obj = firstOrNull;
                    viewPayWithOptions2 = viewPayWithOptions;
                    recipient = recipient2;
                    jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                    if (jurisdictionConfigManager$JurisdictionConfig != null) {
                    }
                    CurrencyCode currencyCode2 = CurrencyCode.USD;
                    if (StringsKt.isBlank(viewPayWithOptions2.personalization)) {
                    }
                    Orientation orientation2 = Orientation.CASH;
                    Money parseMoneyFromString$default2 = Moneys.parseMoneyFromString$default(viewPayWithOptions2.amount, currencyCode2);
                    if (str == null) {
                    }
                    if (recipient != null) {
                    }
                    navigator.goTo(buildPaymentConfigurationScreen(orientation2, parseMoneyFromString$default2, new PaymentConfigurationFlow.Default(new PaymentFlowData.StandardFlowData(redactedString, redactedParcelable), parseBoolean), routingParams2));
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        paymentRouter$route$22 = new PaymentRouter$route$22(this, continuationImpl);
        Object obj2 = paymentRouter$route$22.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$22.label;
        Navigator navigator2 = this.navigator;
        RedactedParcelable redactedParcelable2 = null;
        if (i != 0) {
        }
        Recipient recipient22 = (Recipient) findByCashtag;
        ChannelFlowTransformLatest select2 = this.jurisdictionConfigManager.select();
        paymentRouter$route$22.L$0 = viewPayWithOptions;
        paymentRouter$route$22.L$1 = routingParams;
        paymentRouter$route$22.L$2 = utf8;
        paymentRouter$route$22.L$3 = recipient22;
        paymentRouter$route$22.label = 2;
        firstOrNull = FlowKt.firstOrNull(select2, paymentRouter$route$22);
        if (firstOrNull != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0047, code lost:
    
        if (((com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options) ((com.squareup.cash.featureflags.RealFeatureFlagManager) r7.featureFlagManager).peekCurrentValue(com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$PaymentDeepLinks.INSTANCE)).enabled() != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewPaymentDetails viewPaymentDetails, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$1 paymentRouter$route$1;
        int i;
        if (continuationImpl instanceof PaymentRouter$route$1) {
            paymentRouter$route$1 = (PaymentRouter$route$1) continuationImpl;
            int i2 = paymentRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (routingParams.deepLinkMetadata != null) {
                    }
                    this.clientSyncer.sync(SyncTrigger.PUSH_NOTIFICATION, SyncScope.Global.INSTANCE);
                    paymentRouter$route$1.L$0 = viewPaymentDetails;
                    paymentRouter$route$1.label = 1;
                    if (this.referralManager.refresh(true, paymentRouter$route$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    viewPaymentDetails = paymentRouter$route$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                this.activityUpdatesNotifier.notifyItemUpdated(viewPaymentDetails.paymentToken);
                this.navigator.goTo(new HistoryScreens.PaymentReceipt(viewPaymentDetails.paymentToken, null, null, null, null, 62));
                return Unit.INSTANCE;
            }
        }
        paymentRouter$route$1 = new PaymentRouter$route$1(this, continuationImpl);
        Object obj2 = paymentRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$1.label;
        if (i != 0) {
        }
        this.activityUpdatesNotifier.notifyItemUpdated(viewPaymentDetails.paymentToken);
        this.navigator.goTo(new HistoryScreens.PaymentReceipt(viewPaymentDetails.paymentToken, null, null, null, null, 62));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (routePaymentRequest$default(r7, r9, (com.squareup.cash.db.contacts.Recipient) r10, null, r5, 12) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004a, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewRequestCashtag viewRequestCashtag, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$17 paymentRouter$route$17;
        int i;
        if (continuationImpl instanceof PaymentRouter$route$17) {
            paymentRouter$route$17 = (PaymentRouter$route$17) continuationImpl;
            int i2 = paymentRouter$route$17.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$17.label = i2 - PKIFailureInfo.systemUnavail;
                PaymentRouter$route$17 paymentRouter$route$172 = paymentRouter$route$17;
                Object obj = paymentRouter$route$172.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$172.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = viewRequestCashtag.currency;
                    String str2 = viewRequestCashtag.name;
                    paymentRouter$route$172.L$1 = routingParams;
                    paymentRouter$route$172.label = 1;
                    obj = this.recipientFinder.findByCashtag(str, str2, paymentRouter$route$172);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = paymentRouter$route$172.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                paymentRouter$route$172.L$1 = null;
                paymentRouter$route$172.label = 2;
            }
        }
        paymentRouter$route$17 = new PaymentRouter$route$17(this, continuationImpl);
        PaymentRouter$route$17 paymentRouter$route$1722 = paymentRouter$route$17;
        Object obj2 = paymentRouter$route$1722.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$1722.label;
        if (i != 0) {
        }
        paymentRouter$route$1722.L$1 = null;
        paymentRouter$route$1722.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
    
        if (routePaymentRequest$default(r7, r9, (com.squareup.cash.db.contacts.Recipient) r10, r8, r5, 8) != r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004e, code lost:
    
        if (r10 == r0) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewRequestCashtagAmount viewRequestCashtagAmount, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$11 paymentRouter$route$11;
        int i;
        if (continuationImpl instanceof PaymentRouter$route$11) {
            paymentRouter$route$11 = (PaymentRouter$route$11) continuationImpl;
            int i2 = paymentRouter$route$11.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$11.label = i2 - PKIFailureInfo.systemUnavail;
                PaymentRouter$route$11 paymentRouter$route$112 = paymentRouter$route$11;
                Object obj = paymentRouter$route$112.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$112.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = viewRequestCashtagAmount.currency;
                    String str2 = viewRequestCashtagAmount.name;
                    paymentRouter$route$112.L$0 = viewRequestCashtagAmount;
                    paymentRouter$route$112.L$1 = routingParams;
                    paymentRouter$route$112.label = 1;
                    obj = this.recipientFinder.findByCashtag(str, str2, paymentRouter$route$112);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = paymentRouter$route$112.L$1;
                    viewRequestCashtagAmount = paymentRouter$route$112.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                String str3 = viewRequestCashtagAmount.amount;
                paymentRouter$route$112.L$0 = null;
                paymentRouter$route$112.L$1 = null;
                paymentRouter$route$112.label = 2;
            }
        }
        paymentRouter$route$11 = new PaymentRouter$route$11(this, continuationImpl);
        PaymentRouter$route$11 paymentRouter$route$1122 = paymentRouter$route$11;
        Object obj2 = paymentRouter$route$1122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$1122.label;
        if (i != 0) {
        }
        String str32 = viewRequestCashtagAmount.amount;
        paymentRouter$route$1122.L$0 = null;
        paymentRouter$route$1122.L$1 = null;
        paymentRouter$route$1122.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (routePaymentRequest(r9, r3, r8, r5, r6) != r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0076, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004e, code lost:
    
        if (r10 == r0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewRequestCashtagAmountNote viewRequestCashtagAmountNote, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$12 paymentRouter$route$12;
        int i;
        if (continuationImpl instanceof PaymentRouter$route$12) {
            paymentRouter$route$12 = (PaymentRouter$route$12) continuationImpl;
            int i2 = paymentRouter$route$12.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$12.label = i2 - PKIFailureInfo.systemUnavail;
                PaymentRouter$route$12 paymentRouter$route$122 = paymentRouter$route$12;
                Object obj = paymentRouter$route$122.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$122.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str = viewRequestCashtagAmountNote.currency;
                    String str2 = viewRequestCashtagAmountNote.name;
                    paymentRouter$route$122.L$0 = viewRequestCashtagAmountNote;
                    paymentRouter$route$122.L$1 = routingParams;
                    paymentRouter$route$122.label = 1;
                    obj = this.recipientFinder.findByCashtag(str, str2, paymentRouter$route$122);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    routingParams = paymentRouter$route$122.L$1;
                    viewRequestCashtagAmountNote = paymentRouter$route$122.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Recipient recipient = (Recipient) obj;
                ByteString.Companion companion = ByteString.Companion;
                ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewRequestCashtagAmountNote.base64initiatornote);
                String utf8 = decodeBase64 == null ? decodeBase64.utf8() : null;
                String str3 = viewRequestCashtagAmountNote.amount;
                paymentRouter$route$122.L$0 = null;
                paymentRouter$route$122.L$1 = null;
                paymentRouter$route$122.label = 2;
            }
        }
        paymentRouter$route$12 = new PaymentRouter$route$12(this, continuationImpl);
        PaymentRouter$route$12 paymentRouter$route$1222 = paymentRouter$route$12;
        Object obj3 = paymentRouter$route$1222.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$1222.label;
        if (i != 0) {
        }
        Recipient recipient2 = (Recipient) obj3;
        ByteString.Companion companion2 = ByteString.Companion;
        ByteString decodeBase642 = ByteString.Companion.decodeBase64(viewRequestCashtagAmountNote.base64initiatornote);
        if (decodeBase642 == null) {
        }
        String str32 = viewRequestCashtagAmountNote.amount;
        paymentRouter$route$1222.L$0 = null;
        paymentRouter$route$1222.L$1 = null;
        paymentRouter$route$1222.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (routePaymentRequest$default(r7, r9, r8, null, r5, 12) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (routePaymentRequest$default(r7, r9, r10, null, r5, 12) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        if (r10 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewRequestEmail viewRequestEmail, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$15 paymentRouter$route$15;
        int i;
        String utf8;
        Recipient recipient;
        if (continuationImpl instanceof PaymentRouter$route$15) {
            paymentRouter$route$15 = (PaymentRouter$route$15) continuationImpl;
            int i2 = paymentRouter$route$15.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$15.label = i2 - PKIFailureInfo.systemUnavail;
                PaymentRouter$route$15 paymentRouter$route$152 = paymentRouter$route$15;
                Object obj = paymentRouter$route$152.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$152.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewRequestEmail.base64EncodedEmail);
                    utf8 = decodeBase64 != null ? decodeBase64.utf8() : null;
                    if (utf8 != null) {
                        paymentRouter$route$152.L$1 = routingParams;
                        paymentRouter$route$152.L$2 = utf8;
                        paymentRouter$route$152.label = 1;
                        obj = this.recipientFinder.findByAlias(utf8, paymentRouter$route$152);
                    } else {
                        recipient = null;
                        if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ViewRequestSmsEmailAnonymousClientRoutes.INSTANCE)).enabled() && recipient == null) {
                            if (utf8 != null) {
                                Parcelable.Creator<Recipient> creator = Recipient.CREATOR;
                                Recipient createEmailRecipient = zza.createEmailRecipient(0L, utf8, utf8);
                                paymentRouter$route$152.L$1 = null;
                                paymentRouter$route$152.L$2 = null;
                                paymentRouter$route$152.label = 2;
                            }
                            return Unit.INSTANCE;
                        }
                        paymentRouter$route$152.L$1 = null;
                        paymentRouter$route$152.L$2 = null;
                        paymentRouter$route$152.label = 3;
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    utf8 = paymentRouter$route$152.L$2;
                    routingParams = paymentRouter$route$152.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                recipient = (Recipient) obj;
                if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ViewRequestSmsEmailAnonymousClientRoutes.INSTANCE)).enabled()) {
                }
                paymentRouter$route$152.L$1 = null;
                paymentRouter$route$152.L$2 = null;
                paymentRouter$route$152.label = 3;
            }
        }
        paymentRouter$route$15 = new PaymentRouter$route$15(this, continuationImpl);
        PaymentRouter$route$15 paymentRouter$route$1522 = paymentRouter$route$15;
        Object obj2 = paymentRouter$route$1522.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$1522.label;
        if (i != 0) {
        }
        recipient = (Recipient) obj2;
        if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ViewRequestSmsEmailAnonymousClientRoutes.INSTANCE)).enabled()) {
        }
        paymentRouter$route$1522.L$1 = null;
        paymentRouter$route$1522.L$2 = null;
        paymentRouter$route$1522.label = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0099, code lost:
    
        if (routePaymentRequest$default(r7, r9, r8, null, r5, 12) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (routePaymentRequest$default(r7, r9, r10, null, r5, 12) == r0) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0064, code lost:
    
        if (r10 == r0) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewRequestSms viewRequestSms, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$13 paymentRouter$route$13;
        int i;
        String utf8;
        Recipient recipient;
        if (continuationImpl instanceof PaymentRouter$route$13) {
            paymentRouter$route$13 = (PaymentRouter$route$13) continuationImpl;
            int i2 = paymentRouter$route$13.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$13.label = i2 - PKIFailureInfo.systemUnavail;
                PaymentRouter$route$13 paymentRouter$route$132 = paymentRouter$route$13;
                Object obj = paymentRouter$route$132.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$132.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ByteString.Companion companion = ByteString.Companion;
                    ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewRequestSms.base64EncodedSms);
                    utf8 = decodeBase64 != null ? decodeBase64.utf8() : null;
                    if (utf8 != null) {
                        paymentRouter$route$132.L$1 = routingParams;
                        paymentRouter$route$132.L$2 = utf8;
                        paymentRouter$route$132.label = 1;
                        obj = this.recipientFinder.findByAlias(utf8, paymentRouter$route$132);
                    } else {
                        recipient = null;
                        if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ViewRequestSmsEmailAnonymousClientRoutes.INSTANCE)).enabled() && recipient == null) {
                            if (utf8 != null) {
                                Parcelable.Creator<Recipient> creator = Recipient.CREATOR;
                                Recipient createPhoneRecipient = zza.createPhoneRecipient(0L, utf8, utf8);
                                paymentRouter$route$132.L$1 = null;
                                paymentRouter$route$132.L$2 = null;
                                paymentRouter$route$132.label = 2;
                            }
                            return Unit.INSTANCE;
                        }
                        paymentRouter$route$132.L$1 = null;
                        paymentRouter$route$132.L$2 = null;
                        paymentRouter$route$132.label = 3;
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        if (i == 3) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    utf8 = paymentRouter$route$132.L$2;
                    routingParams = paymentRouter$route$132.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                recipient = (Recipient) obj;
                if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ViewRequestSmsEmailAnonymousClientRoutes.INSTANCE)).enabled()) {
                }
                paymentRouter$route$132.L$1 = null;
                paymentRouter$route$132.L$2 = null;
                paymentRouter$route$132.label = 3;
            }
        }
        paymentRouter$route$13 = new PaymentRouter$route$13(this, continuationImpl);
        PaymentRouter$route$13 paymentRouter$route$1322 = paymentRouter$route$13;
        Object obj2 = paymentRouter$route$1322.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$1322.label;
        if (i != 0) {
        }
        recipient = (Recipient) obj2;
        if (!((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ViewRequestSmsEmailAnonymousClientRoutes.INSTANCE)).enabled()) {
        }
        paymentRouter$route$1322.L$1 = null;
        paymentRouter$route$1322.L$2 = null;
        paymentRouter$route$1322.label = 3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0071, code lost:
    
        if (r13 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(ClientRoute.ViewRequestWithOptions viewRequestWithOptions, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        PaymentRouter$route$21 paymentRouter$route$21;
        CoroutineSingletons coroutineSingletons;
        int i;
        JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig;
        RedactedString redactedString;
        Object findByCashtag;
        ClientRoute.ViewRequestWithOptions viewRequestWithOptions2;
        Money money;
        RoutingParams routingParams2;
        Orientation orientation;
        Recipient recipient;
        if (continuationImpl instanceof PaymentRouter$route$21) {
            paymentRouter$route$21 = (PaymentRouter$route$21) continuationImpl;
            int i2 = paymentRouter$route$21.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                paymentRouter$route$21.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = paymentRouter$route$21.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentRouter$route$21.label;
                Navigator navigator = this.navigator;
                RedactedParcelable redactedParcelable = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (StringsKt.isBlank(viewRequestWithOptions.amount)) {
                        Screen screen = routingParams.origin;
                        if (screen == null) {
                            screen = PaymentScreens$HomeScreens$Home.INSTANCE;
                        }
                        navigator.goTo(screen);
                        return Unit.INSTANCE;
                    }
                    ChannelFlowTransformLatest select = this.jurisdictionConfigManager.select();
                    paymentRouter$route$21.L$0 = viewRequestWithOptions;
                    paymentRouter$route$21.L$1 = routingParams;
                    paymentRouter$route$21.label = 1;
                    obj = FlowKt.firstOrNull(select, paymentRouter$route$21);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        RedactedString redactedString2 = paymentRouter$route$21.L$6;
                        money = paymentRouter$route$21.L$5;
                        orientation = paymentRouter$route$21.L$4;
                        PaymentRouter paymentRouter = paymentRouter$route$21.L$3;
                        routingParams2 = paymentRouter$route$21.L$1;
                        viewRequestWithOptions2 = paymentRouter$route$21.L$0;
                        SafeTrace.throwOnFailure(obj);
                        redactedString = redactedString2;
                        this = paymentRouter;
                        recipient = (Recipient) obj;
                        if (recipient != null) {
                            if (!recipient.hasValidAlias) {
                                recipient = null;
                            }
                            if (recipient != null) {
                                redactedParcelable = new RedactedParcelable(zzahi.forPayment(recipient));
                            }
                        }
                        navigator.goTo(this.buildPaymentConfigurationScreen(orientation, money, new PaymentConfigurationFlow.PayLink(new PaymentFlowData.StandardFlowData(redactedString, redactedParcelable), viewRequestWithOptions2.link), routingParams2));
                        return Unit.INSTANCE;
                    }
                    routingParams = paymentRouter$route$21.L$1;
                    viewRequestWithOptions = paymentRouter$route$21.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj;
                if (jurisdictionConfigManager$JurisdictionConfig != null || (r13 = jurisdictionConfigManager$JurisdictionConfig.defaultCurrency) == null) {
                    CurrencyCode currencyCode = CurrencyCode.USD;
                }
                Orientation orientation2 = Orientation.BILL;
                Money parseMoneyFromString$default = Moneys.parseMoneyFromString$default(viewRequestWithOptions.amount, currencyCode);
                ByteString.Companion companion = ByteString.Companion;
                ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewRequestWithOptions.base64initiatornote);
                redactedString = decodeBase64 == null ? new RedactedString(decodeBase64.utf8()) : null;
                String str = viewRequestWithOptions.currency;
                String str2 = viewRequestWithOptions.name;
                paymentRouter$route$21.L$0 = viewRequestWithOptions;
                paymentRouter$route$21.L$1 = routingParams;
                paymentRouter$route$21.L$3 = this;
                paymentRouter$route$21.L$4 = orientation2;
                paymentRouter$route$21.L$5 = parseMoneyFromString$default;
                paymentRouter$route$21.L$6 = redactedString;
                paymentRouter$route$21.label = 2;
                findByCashtag = this.recipientFinder.findByCashtag(str, str2, paymentRouter$route$21);
                if (findByCashtag != coroutineSingletons) {
                    viewRequestWithOptions2 = viewRequestWithOptions;
                    money = parseMoneyFromString$default;
                    obj = findByCashtag;
                    routingParams2 = routingParams;
                    orientation = orientation2;
                    recipient = (Recipient) obj;
                    if (recipient != null) {
                    }
                    navigator.goTo(this.buildPaymentConfigurationScreen(orientation, money, new PaymentConfigurationFlow.PayLink(new PaymentFlowData.StandardFlowData(redactedString, redactedParcelable), viewRequestWithOptions2.link), routingParams2));
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        paymentRouter$route$21 = new PaymentRouter$route$21(this, continuationImpl);
        Object obj2 = paymentRouter$route$21.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentRouter$route$21.label;
        Navigator navigator2 = this.navigator;
        RedactedParcelable redactedParcelable2 = null;
        if (i != 0) {
        }
        jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) obj2;
        if (jurisdictionConfigManager$JurisdictionConfig != null) {
        }
        CurrencyCode currencyCode2 = CurrencyCode.USD;
        Orientation orientation22 = Orientation.BILL;
        Money parseMoneyFromString$default2 = Moneys.parseMoneyFromString$default(viewRequestWithOptions.amount, currencyCode2);
        ByteString.Companion companion2 = ByteString.Companion;
        ByteString decodeBase642 = ByteString.Companion.decodeBase64(viewRequestWithOptions.base64initiatornote);
        if (decodeBase642 == null) {
        }
        String str3 = viewRequestWithOptions.currency;
        String str22 = viewRequestWithOptions.name;
        paymentRouter$route$21.L$0 = viewRequestWithOptions;
        paymentRouter$route$21.L$1 = routingParams;
        paymentRouter$route$21.L$3 = this;
        paymentRouter$route$21.L$4 = orientation22;
        paymentRouter$route$21.L$5 = parseMoneyFromString$default2;
        paymentRouter$route$21.L$6 = redactedString;
        paymentRouter$route$21.label = 2;
        findByCashtag = this.recipientFinder.findByCashtag(str3, str22, paymentRouter$route$21);
        if (findByCashtag != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final void route(ClientRoute.ViewPaymentPad viewPaymentPad) {
        viewPaymentPad.getClass();
        this.navigator.goTo(PaymentScreens$HomeScreens$Home.INSTANCE);
    }

    public final void route(ClientRoute.ViewNearbyPayment viewNearbyPayment) {
        viewNearbyPayment.getClass();
        this.navigator.goTo(new PaymentScreens.NearbyPayRequest(null));
    }

    public final Object route(ClientRoute.ViewPayCashtagAmountNote viewPayCashtagAmountNote, RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        ByteString.Companion companion = ByteString.Companion;
        ByteString decodeBase64 = ByteString.Companion.decodeBase64(viewPayCashtagAmountNote.base64initiatornote);
        Object routeCashtag$default = routeCashtag$default(this, viewPayCashtagAmountNote.currency, viewPayCashtagAmountNote.name, viewPayCashtagAmountNote.amount, decodeBase64 != null ? decodeBase64.utf8() : null, routingParams, realClientRouteRouter$route$1, 32);
        return routeCashtag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeCashtag$default : Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewConfirmDeposit viewConfirmDeposit) {
        viewConfirmDeposit.getClass();
        this.navigator.goTo(new PaymentScreens.PaymentClaim(viewConfirmDeposit.token));
    }

    public final void route(ClientRoute.ViewPaymentPersonalization viewPaymentPersonalization) {
        viewPaymentPersonalization.getClass();
        String str = viewPaymentPersonalization.entityToken;
        Integer intOrNull = StringsKt.toIntOrNull(viewPaymentPersonalization.entityType);
        this.navigator.goTo(new PaymentScreens.PersonalizePaymentRecipient(new Entity(str, (intOrNull != null && intOrNull.intValue() == 1) ? Entity.Type.TYPE_PAYMENT : Entity.Type.TYPE_UNSPECIFIED), viewPaymentPersonalization.source, Boolean.parseBoolean(viewPaymentPersonalization.showReceiptAction)));
    }

    public final Object route(ClientRoute.ViewDependentPayWithParams viewDependentPayWithParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object withContext = JobKt.withContext(this.ioDispatcher, new RealBlockersHelper$skipBlocker$1(viewDependentPayWithParams, this, (Continuation) null, 13), realClientRouteRouter$route$1);
        return withContext == CoroutineSingletons.COROUTINE_SUSPENDED ? withContext : Unit.INSTANCE;
    }

    public final Object route(ClientRoute.ViewNewPaymentSendToCustomerid viewNewPaymentSendToCustomerid, RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object route = route(new ClientRoute.ViewPayProfile(viewNewPaymentSendToCustomerid.customerToken, 3), routingParams, realClientRouteRouter$route$1);
        return route == CoroutineSingletons.COROUTINE_SUSPENDED ? route : Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewPayLink viewPayLink, RoutingParams routingParams) {
        viewPayLink.getClass();
        routingParams.getClass();
        FeatureFlag$EnabledDisabledFeatureFlag$Options featureFlag$EnabledDisabledFeatureFlag$Options = (FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$PayLinksRecipient.INSTANCE);
        featureFlag$EnabledDisabledFeatureFlag$Options.getClass();
        if (featureFlag$EnabledDisabledFeatureFlag$Options == FeatureFlag$EnabledDisabledFeatureFlag$Options.Disabled) {
            return;
        }
        this.navigator.goTo(buildPaymentConfigurationScreen(Orientation.CASH, new Money((Long) 0L, (CurrencyCode) null, 6), new PaymentConfigurationFlow.PayLinkReview(new PaymentFlowData.PayLinkFlowData(viewPayLink.token)), routingParams));
    }

    public final Object route(ClientRoute.DeprecatedViewPayEmail deprecatedViewPayEmail, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        Object routeAlias = routeAlias(deprecatedViewPayEmail.email, routingParams, continuationImpl);
        return routeAlias == CoroutineSingletons.COROUTINE_SUSPENDED ? routeAlias : Unit.INSTANCE;
    }

    public final Object route(ClientRoute.DeprecatedViewPaySms deprecatedViewPaySms, RoutingParams routingParams, ContinuationImpl continuationImpl) {
        Object routeAlias = routeAlias(deprecatedViewPaySms.sms, routingParams, continuationImpl);
        return routeAlias == CoroutineSingletons.COROUTINE_SUSPENDED ? routeAlias : Unit.INSTANCE;
    }

    public final Object route(ClientRoute.ViewCustomerProfileCashtag viewCustomerProfileCashtag, RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeCashtag$default = routeCashtag$default(this, viewCustomerProfileCashtag.currency, viewCustomerProfileCashtag.name, "", null, routingParams, realClientRouteRouter$route$1, 64);
        return routeCashtag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeCashtag$default : Unit.INSTANCE;
    }

    public final Object route(ClientRoute.ViewPayCashtag viewPayCashtag, RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeCashtag$default = routeCashtag$default(this, viewPayCashtag.currency, viewPayCashtag.name, "", null, routingParams, realClientRouteRouter$route$1, 32);
        return routeCashtag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeCashtag$default : Unit.INSTANCE;
    }

    public final Object route(ClientRoute.ViewPayCashtagAmount viewPayCashtagAmount, RoutingParams routingParams, RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object routeCashtag$default = routeCashtag$default(this, viewPayCashtagAmount.currency, viewPayCashtagAmount.name, viewPayCashtagAmount.amount, null, routingParams, realClientRouteRouter$route$1, 32);
        return routeCashtag$default == CoroutineSingletons.COROUTINE_SUSPENDED ? routeCashtag$default : Unit.INSTANCE;
    }
}
