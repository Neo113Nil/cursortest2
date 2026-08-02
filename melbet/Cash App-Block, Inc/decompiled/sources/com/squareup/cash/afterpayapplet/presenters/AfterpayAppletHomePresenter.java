package com.squareup.cash.afterpayapplet.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.views.sheet.LocalShortlinkSheetKt$$ExternalSyntheticLambda8;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda4;
import com.bugsnag.android.Thread$State$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.afterpayapplet.backend.AfterpayAppletAnalyticsEventsSpec;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletInfoSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.Error;
import com.squareup.cash.afterpayapplet.viewmodels.Loading;
import com.squareup.cash.afterpayapplet.viewmodels.Tap;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAnalyticsAppletTappedEvent;
import com.squareup.cash.afterpayapplet.viewmodels.viewevents.AfterpayAppletHomeViewEvent;
import com.squareup.cash.app.api.ContextKt$$ExternalSyntheticLambda1;
import com.squareup.cash.arcade.treehouse.ButtonBinding$$ExternalSyntheticLambda2;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.blockers.views.SetNameViewKt$SetName$2$1;
import com.squareup.cash.card.onboarding.CardModelView$cardHeat$$inlined$map$1;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.cdf.BlockerFlowReferrerType;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.analytics.AnalyticsParams;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.data.profile.RealJurisdictionConfigManager;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobilePrepurchaseCashCardPilot;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseToggleManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.data.RealIssuedCardManager;
import com.squareup.cash.wallet.db.IssuedCardFactory;
import com.squareup.cash.wallet.presenters.RealCardCustomizationRepository;
import com.squareup.lending.sync_values.ToggleEntryPointData;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.InfoSheet;
import com.squareup.protos.cash.shop.rendering.api.UpsellSheet;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.util.cash.StringsKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.implementations.immutableList.AbstractPersistentList;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;
import okhttp3.internal.Tags;

/* loaded from: classes5.dex */
public final class AfterpayAppletHomePresenter implements MoleculePresenter, HasObservability {
    public static final Map refreshAttributeHome = Thread$State$EnumUnboxingLocalUtility.m("source_screen", "HOME");
    public final AfterpayAppletHomeMapper afterpayAppletHomeMapper;
    public final RealAfterpayAppletRepository afterpayAppletRepository;
    public final RealAfterpayMerchantRepo afterpayMerchantRepo;
    public final RealAfterpayAppletAnalytics analytics;
    public final AfterpayAppletScreen$AfterpayAppletHomeScreen args;
    public final JWECryptoParts calendarProvider;
    public final ParcelableSnapshotMutableState calendarProviderInput$delegate;
    public final RealCardCustomizationRepository cardCustomizationRepository;
    public final Analytics cdfAnalytics;
    public final AndroidClock clock;
    public final ParcelableSnapshotMutableIntState currentDateIndex$delegate;
    public final ErrorReporter errorReporter;
    public final FeatureFlagManager featureFlagManager;
    public final ParcelableSnapshotMutableState hasMarkedAppletAsViewedThisSession$delegate;
    public final ParcelableSnapshotMutableState hasShownDisplayMessageThisSession$delegate;
    public final ParcelableSnapshotMutableState homeState$delegate;
    public final IssuedCardManager issuedCardManager;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealObservabilityManager observabilityManager;
    public final SampleStrategy oneErrorPerAppSessionStrategy;
    public final RealPrepurchaseToggleManager prepurchaseToggleManager;
    public final RealProfileManager profileManager;
    public final RealRouter router;
    public final AndroidStringManager stringManager;
    public final ParcelableSnapshotMutableState styledCardViewModel$delegate;

    public AfterpayAppletHomePresenter(BetterNavigator.ScreenNavigator screenNavigator, AfterpayAppletScreen$AfterpayAppletHomeScreen afterpayAppletScreen$AfterpayAppletHomeScreen, RealAfterpayAppletRepository realAfterpayAppletRepository, AndroidStringManager androidStringManager, RealAfterpayMerchantRepo realAfterpayMerchantRepo, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, AndroidClock androidClock, ErrorReporter errorReporter, SampleStrategy sampleStrategy, RealRouter$Factory$Impl realRouter$Factory$Impl, RealObservabilityManager realObservabilityManager, AfterpayAppletHomeMapper afterpayAppletHomeMapper, JWECryptoParts jWECryptoParts, IssuedCardManager issuedCardManager, RealCardCustomizationRepository realCardCustomizationRepository, RealProfileManager realProfileManager, FeatureFlagManager featureFlagManager, RealPrepurchaseToggleManager realPrepurchaseToggleManager, Analytics analytics) {
        afterpayAppletScreen$AfterpayAppletHomeScreen.getClass();
        this.navigator = screenNavigator;
        this.args = afterpayAppletScreen$AfterpayAppletHomeScreen;
        this.afterpayAppletRepository = realAfterpayAppletRepository;
        this.stringManager = androidStringManager;
        this.afterpayMerchantRepo = realAfterpayMerchantRepo;
        this.analytics = realAfterpayAppletAnalytics;
        this.clock = androidClock;
        this.errorReporter = errorReporter;
        this.oneErrorPerAppSessionStrategy = sampleStrategy;
        this.observabilityManager = realObservabilityManager;
        this.afterpayAppletHomeMapper = afterpayAppletHomeMapper;
        this.calendarProvider = jWECryptoParts;
        this.issuedCardManager = issuedCardManager;
        this.cardCustomizationRepository = realCardCustomizationRepository;
        this.profileManager = realProfileManager;
        this.featureFlagManager = featureFlagManager;
        this.prepurchaseToggleManager = realPrepurchaseToggleManager;
        this.cdfAnalytics = analytics;
        realAfterpayAppletAnalytics.shopFlowToken = null;
        String str = afterpayAppletScreen$AfterpayAppletHomeScreen.referrerFlowToken;
        str.getClass();
        realAfterpayAppletAnalytics.afterpayAppletFlowToken = str;
        realAfterpayAppletAnalytics.shopFlowToken = Boxes$$ExternalSyntheticOutline1.m();
        this.homeState$delegate = Updater.mutableStateOf$default(new Loading(androidStringManager.get(R.string.afterpay_applet_home_toolbar_title)));
        this.currentDateIndex$delegate = new ParcelableSnapshotMutableIntState(0);
        this.calendarProviderInput$delegate = Updater.mutableStateOf$default(null);
        Boolean bool = Boolean.FALSE;
        this.hasMarkedAppletAsViewedThisSession$delegate = Updater.mutableStateOf$default(bool);
        this.hasShownDisplayMessageThisSession$delegate = Updater.mutableStateOf$default(bool);
        this.styledCardViewModel$delegate = Updater.mutableStateOf$default(null);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public static final void access$handleTapEvent(AfterpayAppletHomePresenter afterpayAppletHomePresenter, Tap tap, AfterpayAppletHomeViewEvent afterpayAppletHomeViewEvent) {
        AfterpayAppletScreen$AfterpayAppletHomeScreen afterpayAppletScreen$AfterpayAppletHomeScreen = afterpayAppletHomePresenter.args;
        BetterNavigator.ScreenNavigator screenNavigator = afterpayAppletHomePresenter.navigator;
        if (tap instanceof Tap.Url) {
            routeAction$default(afterpayAppletHomePresenter, ((Tap.Url) tap).actionUrl, afterpayAppletScreen$AfterpayAppletHomeScreen, getSectionIdForEvent(afterpayAppletHomeViewEvent), 24);
            return;
        }
        if (!(tap instanceof Tap.Info)) {
            if (tap instanceof Tap.Dismiss) {
                screenNavigator.goTo(Back.INSTANCE);
                return;
            } else {
                if (tap instanceof Tap.ScrollTo) {
                    return;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return;
            }
        }
        String str = afterpayAppletScreen$AfterpayAppletHomeScreen.referrerFlowToken;
        InfoSheet infoSheet = ((Tap.Info) tap).info;
        LocalizedString localizedString = infoSheet.title;
        String translated = localizedString != null ? StringsKt.translated(localizedString) : "";
        LocalizedString localizedString2 = infoSheet.subtitle;
        String translated2 = localizedString2 != null ? StringsKt.translated(localizedString2) : null;
        List list = infoSheet.text_content;
        screenNavigator.goTo(new AfterpayAppletScreen$AfterpayAppletInfoSheet(str, translated, translated2, !list.isEmpty() ? list : null, infoSheet.cta_button, infoSheet.analytic_view_event, infoSheet.analytic_dismiss_event, infoSheet.avatar));
    }

    public static String getSectionIdForEvent(AfterpayAppletHomeViewEvent afterpayAppletHomeViewEvent) {
        List analyticsAppletTappedEvent;
        AfterpayAppletAnalyticsEventsSpec afterpayAppletAnalyticsEventsSpec;
        Map map;
        AfterpayAnalyticsAppletTappedEvent afterpayAnalyticsAppletTappedEvent = afterpayAppletHomeViewEvent instanceof AfterpayAnalyticsAppletTappedEvent ? (AfterpayAnalyticsAppletTappedEvent) afterpayAppletHomeViewEvent : null;
        if (afterpayAnalyticsAppletTappedEvent == null || (analyticsAppletTappedEvent = afterpayAnalyticsAppletTappedEvent.getAnalyticsAppletTappedEvent()) == null || (afterpayAppletAnalyticsEventsSpec = (AfterpayAppletAnalyticsEventsSpec) CollectionsKt.firstOrNull(analyticsAppletTappedEvent)) == null || (map = afterpayAppletAnalyticsEventsSpec.serverParameters) == null) {
            return null;
        }
        return (String) map.get("section_id");
    }

    public static /* synthetic */ void routeAction$default(AfterpayAppletHomePresenter afterpayAppletHomePresenter, String str, Screen screen, String str2, int i) {
        if ((i & 2) != 0) {
            screen = Back.INSTANCE;
        }
        afterpayAppletHomePresenter.routeAction(str, screen, str2, null, null);
    }

    public final void CheckAndShowDisplayMessages(Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(286122623);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            AfterpayAppletHomeViewModel homeState = getHomeState();
            if (homeState instanceof AfterpayAppletHomeContentViewModel) {
                gapComposer.startReplaceGroup(-1630856217);
                AfterpayAppletHomeContentViewModel.DisplayMessage displayMessage = ((AfterpayAppletHomeContentViewModel) homeState).onDisplayMessage;
                if (displayMessage != null) {
                    UpsellSheet upsellSheet = displayMessage.upsellSheet;
                    String str = displayMessage.clientRouteUrl;
                    if (!((Boolean) this.hasShownDisplayMessageThisSession$delegate.getValue()).booleanValue()) {
                        gapComposer.startReplaceGroup(-1630659398);
                        String str2 = displayMessage.messageId;
                        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                        if (str2 == null) {
                            gapComposer.startReplaceGroup(-1630645232);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1630645231);
                            boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changed(str2);
                            Object rememberedValue = gapComposer.rememberedValue();
                            if (changedInstance || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new AfterpayAppletHomePresenter$models$8$5$1(this, str2, null, i3);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            Updater.LaunchedEffect(gapComposer, str2, (Function2) rememberedValue);
                            gapComposer.end(false);
                        }
                        if (str != null) {
                            gapComposer.startReplaceGroup(-1630308726);
                            gapComposer.end(false);
                            AfterpayAppletScreen$AfterpayAppletHomeScreen afterpayAppletScreen$AfterpayAppletHomeScreen = this.args;
                            this.router.route(new RoutingParams(afterpayAppletScreen$AfterpayAppletHomeScreen, null, afterpayAppletScreen$AfterpayAppletHomeScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
                        } else if (upsellSheet != null) {
                            gapComposer.startReplaceGroup(85965691);
                            gapComposer.startReplaceGroup(-1630030873);
                            String base64 = UpsellSheet.ADAPTER.encodeByteString(upsellSheet).base64();
                            boolean changed = gapComposer.changed(base64);
                            Object rememberedValue2 = gapComposer.rememberedValue();
                            if (changed || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda4(base64, 16);
                                gapComposer.updateRememberedValue(rememberedValue2);
                            }
                            this.navigator.askQuestion(AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen.ProductUpsellScrollQuestion.INSTANCE, (Function1) rememberedValue2);
                            gapComposer.end(false);
                            gapComposer.end(false);
                        } else {
                            gapComposer.startReplaceGroup(-1629736125);
                            gapComposer.end(false);
                        }
                        gapComposer.end(false);
                        gapComposer.end(false);
                    }
                }
                gapComposer.startReplaceGroup(-1629728189);
                gapComposer.end(false);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1629722237);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalShortlinkSheetKt$$ExternalSyntheticLambda8(this, i, 5);
        }
    }

    public final Map getDefaultHomeAnalyticsParams() {
        return MapsKt__MapsKt.mapOf(new Pair(AnalyticsEvent.ParamType.ORIGIN, "AFTERPAY_APPLET"), new Pair(AnalyticsEvent.ParamType.FROM_SCREEN, "HOME"), new Pair(AnalyticsEvent.ParamType.REFERRER_FLOW_TOKEN, this.args.referrerFlowToken));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final ErrorReporter getErrorReporter() {
        return this.errorReporter;
    }

    public final AfterpayAppletHomeViewModel getHomeState() {
        return (AfterpayAppletHomeViewModel) this.homeState$delegate.getValue();
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public final SampleStrategy getOneErrorPerAppSessionStrategy() {
        return this.oneErrorPerAppSessionStrategy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v33, types: [com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel] */
    /* JADX WARN: Type inference failed for: r1v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r31v0, types: [app.cash.broadway.presenter.molecule.MoleculePresenter, com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v21, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r5v22, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v25, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel] */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeViewModel] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        Object zzmhVar;
        String str;
        byte[] bArr;
        IssuedCardFactory.IssuedCard issuedCard;
        Object setNameViewKt$SetName$2$1;
        Continuation continuation;
        MutableState mutableState;
        boolean z;
        GapComposer gapComposer;
        ?? r5;
        ?? r1;
        CalendarProviderInput calendarProviderInput;
        int i2;
        AfterpayAppletHomeContentViewModel.HomeSection homeSection;
        List list;
        CurrencyCode currencyCode;
        Money money;
        Money money2;
        GapComposer gapComposer2;
        boolean z2;
        flow.getClass();
        GapComposer gapComposer3 = (GapComposer) composer;
        gapComposer3.startReplaceGroup(-1839904102);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer3.changedInstance(this);
        Object rememberedValue = gapComposer3.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 0;
        Continuation continuation2 = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new AfterpayAppletHomePresenter$models$1$1(this, continuation2, i3);
            gapComposer3.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer3, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer3.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((RealIssuedCardManager) this.issuedCardManager).getIssuedCardOrNull();
            gapComposer3.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer3, 48, 2);
        Object rememberedValue3 = gapComposer3.rememberedValue();
        int i4 = 4;
        if (rememberedValue3 == neverEqualPolicy) {
            CardModelView$cardHeat$$inlined$map$1 cardModelView$cardHeat$$inlined$map$1 = new CardModelView$cardHeat$$inlined$map$1(this.profileManager.publicProfile(), i4);
            gapComposer3.updateRememberedValue(cardModelView$cardHeat$$inlined$map$1);
            rememberedValue3 = cardModelView$cardHeat$$inlined$map$1;
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, "", null, gapComposer3, 48, 2);
        Object rememberedValue4 = gapComposer3.rememberedValue();
        RealPrepurchaseToggleManager realPrepurchaseToggleManager = this.prepurchaseToggleManager;
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) this.featureFlagManager).currentValue(AmplitudeExperiments$MobilePrepurchaseCashCardPilot.INSTANCE)).enabled() ? realPrepurchaseToggleManager.prepurchaseToggleEntryPointData : new AppLockMonitor$special$$inlined$map$2(null, 19);
            gapComposer3.updateRememberedValue(rememberedValue4);
        }
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer3, 48, 2);
        Object rememberedValue5 = gapComposer3.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = realPrepurchaseToggleManager.isRequestInProgress;
            gapComposer3.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue5, null, gapComposer3, 1);
        Object rememberedValue6 = gapComposer3.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = this.cardCustomizationRepository.getCustomizationImage();
            gapComposer3.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer3, 48, 2);
        GapComposer gapComposer4 = gapComposer3;
        IssuedCardFactory.IssuedCard issuedCard2 = (IssuedCardFactory.IssuedCard) collectAsState.getValue();
        String str2 = (String) collectAsState2.getValue();
        byte[] bArr2 = (byte[]) collectAsState5.getValue();
        boolean changedInstance2 = gapComposer4.changedInstance(this) | gapComposer4.changed(collectAsState) | gapComposer4.changed(collectAsState2) | gapComposer4.changed(collectAsState5);
        Object rememberedValue7 = gapComposer4.rememberedValue();
        if (changedInstance2 || rememberedValue7 == neverEqualPolicy) {
            str = str2;
            bArr = bArr2;
            issuedCard = issuedCard2;
            zzmhVar = new zzmh(this, collectAsState, collectAsState2, collectAsState5, null, 14);
            gapComposer4.updateRememberedValue(zzmhVar);
        } else {
            str = str2;
            bArr = bArr2;
            zzmhVar = rememberedValue7;
            issuedCard = issuedCard2;
        }
        Updater.LaunchedEffect(issuedCard, str, bArr, (Function2) zzmhVar, gapComposer4);
        AfterpayAppletHomeViewModel homeState = getHomeState();
        StyledCardViewModel styledCardViewModel = (StyledCardViewModel) this.styledCardViewModel$delegate.getValue();
        boolean changedInstance3 = gapComposer4.changedInstance(this);
        Object rememberedValue8 = gapComposer4.rememberedValue();
        if (changedInstance3 || rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = new AfterpayAppletHomePresenter$models$3$1(this, continuation2, i3);
            gapComposer4.updateRememberedValue(rememberedValue8);
        }
        Updater.LaunchedEffect(homeState, styledCardViewModel, (Function2) rememberedValue8, gapComposer4);
        AfterpayAppletHomeViewModel homeState2 = getHomeState();
        ToggleEntryPointData toggleEntryPointData = (ToggleEntryPointData) collectAsState3.getValue();
        Boolean bool = (Boolean) collectAsState4.getValue();
        bool.booleanValue();
        boolean changedInstance4 = gapComposer4.changedInstance(this) | gapComposer4.changed(collectAsState3) | gapComposer4.changed(collectAsState4);
        Object rememberedValue9 = gapComposer4.rememberedValue();
        if (changedInstance4 || rememberedValue9 == neverEqualPolicy) {
            continuation = null;
            mutableState = collectAsState3;
            setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1((MoleculePresenter) this, mutableState, collectAsState4, continuation, 4);
            gapComposer4.updateRememberedValue(setNameViewKt$SetName$2$1);
        } else {
            setNameViewKt$SetName$2$1 = rememberedValue9;
            continuation = null;
            mutableState = collectAsState3;
        }
        Updater.LaunchedEffect(homeState2, toggleEntryPointData, bool, (Function2) setNameViewKt$SetName$2$1, gapComposer4);
        int i5 = 3;
        CheckAndShowDisplayMessages(gapComposer4, (i >> 3) & 14);
        boolean changedInstance5 = gapComposer4.changedInstance(this);
        Object rememberedValue10 = gapComposer4.rememberedValue();
        if (changedInstance5 || rememberedValue10 == neverEqualPolicy) {
            rememberedValue10 = new AfterpayAppletHomePresenter$models$1$1(this, continuation, 1);
            gapComposer4.updateRememberedValue(rememberedValue10);
        }
        Updater.LaunchedEffect(gapComposer4, unit, (Function2) rememberedValue10);
        boolean changedInstance6 = gapComposer4.changedInstance(this);
        Object rememberedValue11 = gapComposer4.rememberedValue();
        if (changedInstance6 || rememberedValue11 == neverEqualPolicy) {
            rememberedValue11 = new ContextKt$$ExternalSyntheticLambda1((Object) this, 5);
            gapComposer4.updateRememberedValue(rememberedValue11);
        }
        Updater.DisposableEffect(unit, (Function1) rememberedValue11, gapComposer4);
        boolean changedInstance7 = gapComposer4.changedInstance(this);
        Object rememberedValue12 = gapComposer4.rememberedValue();
        if (changedInstance7 || rememberedValue12 == neverEqualPolicy) {
            rememberedValue12 = new ButtonBinding$$ExternalSyntheticLambda2((Object) this, i5);
            gapComposer4.updateRememberedValue(rememberedValue12);
        }
        Function2 function2 = (Function2) rememberedValue12;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer4.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed = gapComposer4.changed(function2) | gapComposer4.changedInstance(answerDispatcher);
        Object rememberedValue13 = gapComposer4.rememberedValue();
        if (changed || rememberedValue13 == neverEqualPolicy) {
            rememberedValue13 = new VerifyCheckDepositPresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 11);
            gapComposer4.updateRememberedValue(rememberedValue13);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue13, gapComposer4);
        Continuation continuation3 = continuation;
        Continuation continuation4 = continuation3;
        Updater.LaunchedEffect(gapComposer4, flow, new BenefitsHubPresenter$models$1$1(2, mutableState, flow, (Object) this, continuation3));
        AfterpayAppletHomeViewModel homeState3 = getHomeState();
        boolean changedInstance8 = gapComposer4.changedInstance(this);
        Object rememberedValue14 = gapComposer4.rememberedValue();
        if (changedInstance8 || rememberedValue14 == neverEqualPolicy) {
            rememberedValue14 = new AfterpayAppletHomePresenter$models$3$1(this, continuation4, 1);
            gapComposer4.updateRememberedValue(rememberedValue14);
        }
        Updater.LaunchedEffect(gapComposer4, homeState3, (Function2) rememberedValue14);
        ?? homeState4 = getHomeState();
        CalendarProviderInput calendarProviderInput2 = (CalendarProviderInput) this.calendarProviderInput$delegate.getValue();
        int intValue = this.currentDateIndex$delegate.getIntValue();
        if (calendarProviderInput2 == null) {
            gapComposer4.startReplaceGroup(-683642144);
            gapComposer4.end(false);
            gapComposer2 = gapComposer4;
            z2 = false;
        } else {
            gapComposer4.startReplaceGroup(-683642143);
            if (homeState4 instanceof AfterpayAppletHomeContentViewModel) {
                gapComposer4.startReplaceGroup(-2097354795);
                AfterpayAppletHomeContentViewModel afterpayAppletHomeContentViewModel = (AfterpayAppletHomeContentViewModel) homeState4;
                AbstractPersistentList abstractPersistentList = afterpayAppletHomeContentViewModel.homeSections;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(abstractPersistentList, 10));
                ListIterator listIterator = abstractPersistentList.listIterator(0);
                while (listIterator.hasNext()) {
                    AfterpayAppletHomeContentViewModel.HomeSection homeSection2 = (AfterpayAppletHomeContentViewModel.HomeSection) listIterator.next();
                    if (homeSection2.content instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection) {
                        gapComposer4.startReplaceGroup(-527131816);
                        gapComposer4.startReplaceGroup(1021437680);
                        boolean changed2 = gapComposer4.changed(calendarProviderInput2);
                        Object rememberedValue15 = gapComposer4.rememberedValue();
                        if (changed2 || rememberedValue15 == neverEqualPolicy) {
                            rememberedValue15 = new ArrayList();
                            gapComposer4.updateRememberedValue(rememberedValue15);
                        }
                        List list2 = (List) rememberedValue15;
                        Object rememberedValue16 = gapComposer4.rememberedValue();
                        JWECryptoParts jWECryptoParts = this.calendarProvider;
                        if (rememberedValue16 == neverEqualPolicy) {
                            rememberedValue16 = ((RealJurisdictionConfigManager) jWECryptoParts.cipherText).select();
                            gapComposer4.updateRememberedValue(rememberedValue16);
                        }
                        GapComposer gapComposer5 = gapComposer4;
                        MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue16, null, null, gapComposer5, 48, 2);
                        r5 = gapComposer5;
                        Integer valueOf = Integer.valueOf(intValue);
                        boolean changedInstance9 = r5.changedInstance(jWECryptoParts) | r5.changedInstance(list2) | r5.changedInstance(calendarProviderInput2) | r5.changed(intValue);
                        Object rememberedValue17 = r5.rememberedValue();
                        if (changedInstance9 || rememberedValue17 == neverEqualPolicy) {
                            list = list2;
                            CalendarProviderInput calendarProviderInput3 = calendarProviderInput2;
                            i2 = intValue;
                            rememberedValue17 = new EditProfilePresenter$models$2$1(jWECryptoParts, list, calendarProviderInput3, i2, (Continuation) null);
                            calendarProviderInput = calendarProviderInput3;
                            r5.updateRememberedValue(rememberedValue17);
                        } else {
                            list = list2;
                            calendarProviderInput = calendarProviderInput2;
                            i2 = intValue;
                        }
                        Updater.LaunchedEffect(valueOf, calendarProviderInput, (Function2) rememberedValue17, r5);
                        OverdueInfo overdueInfo = calendarProviderInput.overdue;
                        if (overdueInfo == null || (money2 = overdueInfo.amount) == null || (currencyCode = money2.currency_code) == null) {
                            PaymentInfo paymentInfo = (PaymentInfo) CollectionsKt.firstOrNull((List) calendarProviderInput.payments);
                            CurrencyCode currencyCode2 = (paymentInfo == null || (money = paymentInfo.amount) == null) ? null : money.currency_code;
                            if (currencyCode2 == null) {
                                JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) collectAsState6.getValue();
                                currencyCode2 = jurisdictionConfigManager$JurisdictionConfig != null ? jurisdictionConfigManager$JurisdictionConfig.defaultCurrency : null;
                                if (currencyCode2 == null) {
                                    currencyCode = CurrencyCode.USD;
                                }
                            }
                            currencyCode = currencyCode2;
                        }
                        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar paymentCalendar = new AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar(list, false, calendarProviderInput.primaryButton, calendarProviderInput.secondaryButtonText, calendarProviderInput.secondaryButtonTapAction, ((MoneyFormatter) jWECryptoParts.authenticationTag).format(new Money((Long) 0L, currencyCode, 4)));
                        r1 = 0;
                        r5.end(false);
                        homeSection = AfterpayAppletHomeContentViewModel.HomeSection.copy$default(homeSection2, paymentCalendar);
                        r5.end(false);
                    } else {
                        r5 = gapComposer4;
                        r1 = i3;
                        calendarProviderInput = calendarProviderInput2;
                        i2 = intValue;
                        r5.startReplaceGroup(-526710402);
                        r5.end(r1);
                        homeSection = homeSection2;
                    }
                    arrayList.add(homeSection);
                    i3 = r1;
                    calendarProviderInput2 = calendarProviderInput;
                    gapComposer4 = r5;
                    intValue = i2;
                }
                ?? r52 = gapComposer4;
                ?? r12 = i3;
                ?? copy$default = AfterpayAppletHomeContentViewModel.copy$default(afterpayAppletHomeContentViewModel, r12, Tags.toPersistentList(arrayList), null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
                r52.end(r12);
                continuation4 = copy$default;
                z = r12;
                gapComposer = r52;
            } else {
                GapComposer gapComposer6 = gapComposer4;
                z = false;
                gapComposer6.startReplaceGroup(-760370363);
                gapComposer6.end(false);
                continuation4 = homeState4;
                gapComposer = gapComposer6;
            }
            gapComposer.end(z);
            z2 = z;
            gapComposer2 = gapComposer;
        }
        if (continuation4 != null) {
            homeState4 = continuation4;
        }
        setHomeState(homeState4);
        AfterpayAppletHomeViewModel homeState5 = getHomeState();
        gapComposer2.end(z2);
        return homeState5;
    }

    public final void routeAction(String str, Screen screen, String str2, String str3, BlockerFlowReferrerType blockerFlowReferrerType) {
        AfterpayAppletScreen$AfterpayAppletHomeScreen afterpayAppletScreen$AfterpayAppletHomeScreen = this.args;
        this.router.route(new RoutingParams(afterpayAppletScreen$AfterpayAppletHomeScreen, str3, screen, null, new AnalyticsParams.GenericAnalyticsParams(afterpayAppletScreen$AfterpayAppletHomeScreen.referrerFlowToken, blockerFlowReferrerType, "APAppletHome", str2), null, 468), str);
    }

    public final void setHomeState(AfterpayAppletHomeViewModel afterpayAppletHomeViewModel) {
        this.homeState$delegate.setValue(afterpayAppletHomeViewModel);
    }

    public final Error toErrorState() {
        AndroidStringManager androidStringManager = this.stringManager;
        return new Error(androidStringManager.get(R.string.afterpay_applet_home_toolbar_title), androidStringManager.get(R.string.afterpay_error_title), androidStringManager.get(R.string.afterpay_error_message), androidStringManager.get(R.string.afterpay_error_button));
    }
}
