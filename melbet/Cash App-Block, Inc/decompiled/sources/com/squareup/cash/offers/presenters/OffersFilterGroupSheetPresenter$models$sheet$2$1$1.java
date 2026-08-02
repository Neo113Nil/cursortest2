package com.squareup.cash.offers.presenters;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.emoji2.text.MetadataRepo;
import app.cash.api.ApiResult;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzabw;
import com.google.zxing.BinaryBitmap;
import com.squareup.cash.R;
import com.squareup.cash.cdf.Event;
import com.squareup.cash.cdf.asset.AssetRequestLoadingManuallyCancelled;
import com.squareup.cash.cdf.asset.AssetSendLoadingManuallyCancelled;
import com.squareup.cash.cdf.asset.AssetSendPersonalizationTransformed;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.nearbypayment.NearbyPaymentDiscoverEntryButtonClick;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionEditDistributionStart;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionGetStarted;
import com.squareup.cash.cdf.paychecks.PaychecksSetUpDirectDepositAlreadySetUp;
import com.squareup.cash.cdf.paychecks.PaychecksSetUpDirectDepositStart;
import com.squareup.cash.cdf.paychecks.PaychecksShowBenefitsHub;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.viewmodels.LoadingAnimationAssets;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.earnings.backend.real.RealEarningsSyncStateRepository;
import com.squareup.cash.earnings.screens.home.EarningsHomeScreen;
import com.squareup.cash.featureflags.AmplitudeExperiments$EarningsApplet;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.api.data.SearchResult;
import com.squareup.cash.investing.db.Investing_news_article;
import com.squareup.cash.investing.presenters.navigation.RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.roundups.RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1;
import com.squareup.cash.investing.presenters.settings.InvestingSettingsPresenter;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.primitives.InvestmentEntityToken;
import com.squareup.cash.investing.viewmodels.StockContentModel;
import com.squareup.cash.investing.viewmodels.search.SearchResult;
import com.squareup.cash.investing.viewmodels.settings.InvestingSettingsViewEvent;
import com.squareup.cash.investingcrypto.presenters.news.InvestingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$ImageWithBackground;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.marketcapabilities.MarketCapability;
import com.squareup.cash.marketcapabilities.MarketCapabilityName;
import com.squareup.cash.marketcapabilities.RealMarketCapabilitiesManager$availability$$inlined$map$1$2$1;
import com.squareup.cash.merchant.presenters.SquareLoyaltySheetPresenter$State;
import com.squareup.cash.merchant.viewmodels.SquareLoyaltySheetViewEvent;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.PromotedAppletTile;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider;
import com.squareup.cash.money.applets.sections.RealAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1;
import com.squareup.cash.money.booklet.MoneyTabBookletViewEvent;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.money.presenters.RealMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.money.viewmodels.api.SectionAvailabilityState;
import com.squareup.cash.money.viewmodels.api.SectionProvider;
import com.squareup.cash.moneybot.backend.api.managers.ChatResult;
import com.squareup.cash.moneybot.backend.api.managers.ChatSession;
import com.squareup.cash.moneybot.backend.api.managers.ChatSessionError;
import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import com.squareup.cash.moneybot.backend.api.model.chat.Message;
import com.squareup.cash.moneybot.backend.api.model.chat.MessageList;
import com.squareup.cash.moneybot.backend.real.managers.RealChatSessionManager;
import com.squareup.cash.moneybot.presenters.MoneybotChatContentFactory;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1;
import com.squareup.cash.moneybot.presenters.MoneybotHomePresenter;
import com.squareup.cash.moneybot.presenters.MoneybotPreambleEditorPresenter$models$1$1;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerAnswer;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerOption;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerQuestion;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerScreen;
import com.squareup.cash.moneybot.viewmodels.MoneybotPreambleEditorViewEvent;
import com.squareup.cash.moneybot.viewmodels.RecentChatHistoryViewModel$Loaded;
import com.squareup.cash.moneybot.viewmodels.chat.ProcessingIndicator;
import com.squareup.cash.moneybot.viewmodels.staticpicker.MoneybotStaticPickerViewEvent;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mosaic.resources.api.v2.Music;
import com.squareup.cash.music.backend.real.RealMusicRepository$searchMusic$2;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$3$1;
import com.squareup.cash.music.viewmodels.Track;
import com.squareup.cash.notifications.NotificationToggleState;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker;
import com.squareup.cash.notifications.RealAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.offers.backend.real.RealOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1;
import com.squareup.cash.offers.db.OffersSheet;
import com.squareup.cash.offers.screens.OffersFilterGroupSheetResult;
import com.squareup.cash.offers.screens.OffersScreen$OffersFilterGroupSheetScreen;
import com.squareup.cash.offers.viewmodels.viewevents.OffersFilterGroupSheetViewEvent;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileEvent$PaychecksAppletOnClickTile;
import com.squareup.cash.paychecks.applets.viewmodels.PaychecksAppletTileModel;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiConfiguration;
import com.squareup.cash.paychecks.backend.api.model.PaychecksUiState;
import com.squareup.cash.paychecks.screens.HelpSheetScreen;
import com.squareup.cash.paychecks.viewmodels.HelpSheetViewEvent;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewEvent;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter;
import com.squareup.cash.paymentpad.presenters.HomeViewPresenter$models$8$2;
import com.squareup.cash.paymentpad.viewmodels.HomeViewEvent;
import com.squareup.cash.payments.presenters.MainPaymentPresenter;
import com.squareup.cash.payments.presenters.MainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1;
import com.squareup.cash.payments.presenters.PaymentLoadingPresenter;
import com.squareup.cash.payments.presenters.StickerSelectedResult;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.viewmodels.PaymentLoadingViewEvent;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewEvent;
import com.squareup.cash.payments.viewmodels.Sticker;
import com.squareup.cash.phoneplans.PhonePlansEsimCheckViewEvent;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.CategoryListType;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.wallet.roundups.CardsRoundUpsItemViewModel;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.cashsuggest.api.OfferSheetKey;
import com.squareup.protos.cash.genericelements.ui.AnalyticsEvent;
import com.squareup.protos.cash.kgoose.api.v3.ChatSessionStatus;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.common.RoundUpsElement;
import com.squareup.util.cash.ColorsKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NotImplementedError;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlowImpl;
import nl.dionsegijn.konfetti.compose.KonfettiViewKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class OffersFilterGroupSheetPresenter$models$sheet$2$1$1 implements FlowCollector {
    public final /* synthetic */ Object $$this$produceState;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public OffersFilterGroupSheetPresenter$models$sheet$2$1$1(CoroutineScope coroutineScope, TaxReturnsPresenter taxReturnsPresenter, MutableState mutableState) {
        this.$r8$classId = 21;
        this.this$0 = taxReturnsPresenter;
        this.$$this$produceState = mutableState;
    }

    private final Object emit$com$squareup$cash$paychecks$presenters$PaychecksHomePresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        PaychecksSetUpDirectDepositStart.Source source;
        State state = (State) this.this$0;
        TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) this.$$this$produceState;
        Analytics analytics = (Analytics) tapToPayPresenter.sessionManager;
        PaychecksHomeViewEvent paychecksHomeViewEvent = (PaychecksHomeViewEvent) obj;
        if (Intrinsics.areEqual(paychecksHomeViewEvent, PaychecksHomeViewEvent.Exit.INSTANCE)) {
            ((BetterNavigator.ScreenNavigator) tapToPayPresenter.navigator).goTo(Back.INSTANCE);
        } else if (paychecksHomeViewEvent instanceof PaychecksHomeViewEvent.CallToAction) {
            analytics.track(new PaychecksManageDistributionGetStarted(), null);
            tapToPayPresenter.handleRoute$1(((PaychecksHomeViewEvent.CallToAction) paychecksHomeViewEvent).clientRoute);
        } else if (paychecksHomeViewEvent instanceof PaychecksHomeViewEvent.EditDistribution) {
            analytics.track(new PaychecksManageDistributionEditDistributionStart(), null);
            tapToPayPresenter.handleRoute$1(((PaychecksHomeViewEvent.EditDistribution) paychecksHomeViewEvent).clientRoute);
        } else if (Intrinsics.areEqual(paychecksHomeViewEvent, PaychecksHomeViewEvent.AlreadySetUpDirectDepositClick.INSTANCE)) {
            analytics.track(new PaychecksSetUpDirectDepositAlreadySetUp(), null);
        } else if (paychecksHomeViewEvent instanceof PaychecksHomeViewEvent.SetUpDirectDeposit) {
            PaychecksHomeViewEvent.SetUpDirectDeposit setUpDirectDeposit = (PaychecksHomeViewEvent.SetUpDirectDeposit) paychecksHomeViewEvent;
            int ordinal = setUpDirectDeposit.origin.ordinal();
            if (ordinal == 0) {
                source = PaychecksSetUpDirectDepositStart.Source.TIMELINE;
            } else {
                if (ordinal != 1) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                source = PaychecksSetUpDirectDepositStart.Source.FOOTER;
            }
            analytics.track(new PaychecksSetUpDirectDepositStart(Boolean.valueOf(setUpDirectDeposit.hasDistribution), source), null);
            tapToPayPresenter.handleRoute$1(setUpDirectDeposit.clientRoute);
        } else if (paychecksHomeViewEvent instanceof PaychecksHomeViewEvent.DisclosureUrlClicked) {
            tapToPayPresenter.handleRoute$1(((PaychecksHomeViewEvent.DisclosureUrlClicked) paychecksHomeViewEvent).url);
        } else if (paychecksHomeViewEvent instanceof PaychecksHomeViewEvent.SeeAllBenefits) {
            PaychecksUiState paychecksUiState = (PaychecksUiState) state.getValue();
            paychecksUiState.getClass();
            PaychecksUiState.PaychecksBenefitsStatusSection paychecksBenefitsStatusSection = paychecksUiState.benefitsStatusSection;
            paychecksBenefitsStatusSection.getClass();
            analytics.track(new PaychecksShowBenefitsHub(PrimitiveResources_androidKt.access$toCdfBenefitsStatus(paychecksBenefitsStatusSection.state)), null);
            tapToPayPresenter.handleRoute$1(((PaychecksHomeViewEvent.SeeAllBenefits) paychecksHomeViewEvent).clientRoute);
        } else {
            if (!(paychecksHomeViewEvent instanceof PaychecksHomeViewEvent.ViewPaycheckBenefits)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            PaychecksUiState paychecksUiState2 = (PaychecksUiState) state.getValue();
            paychecksUiState2.getClass();
            PaychecksUiState.PaychecksBenefitsStatusSection paychecksBenefitsStatusSection2 = paychecksUiState2.benefitsStatusSection;
            paychecksBenefitsStatusSection2.getClass();
            analytics.track(new PaychecksShowBenefitsHub(PrimitiveResources_androidKt.access$toCdfBenefitsStatus(paychecksBenefitsStatusSection2.state)), null);
            tapToPayPresenter.handleRoute$1(((PaychecksHomeViewEvent.ViewPaycheckBenefits) paychecksHomeViewEvent).clientRoute);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$paymentpad$presenters$HomeViewPresenter$models$$inlined$CollectEffect$2$1(Object obj, Continuation continuation) {
        HomeViewPresenter homeViewPresenter = (HomeViewPresenter) this.this$0;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$produceState;
        HomeViewEvent homeViewEvent = (HomeViewEvent) obj;
        int i = 0;
        if (homeViewEvent instanceof HomeViewEvent.QrCode) {
            homeViewPresenter.paymentPadOutboundNavigator.goToCashQrCodeScanner(false);
        } else {
            Continuation continuation2 = null;
            if (homeViewEvent instanceof HomeViewEvent.PayRequestNearby) {
                String m = re$$ExternalSyntheticOutline0.m();
                homeViewPresenter.analytics.track(new NearbyPaymentDiscoverEntryButtonClick(m), null);
                JobKt.launch$default(coroutineScope, null, null, new OverlayKt$Overlay$1$1$1$1$1(homeViewPresenter, m, continuation2, 12), 3);
            } else if (homeViewEvent instanceof HomeViewEvent.MainPaymentPadEvent) {
                JobKt.launch$default(coroutineScope, null, null, new HomeViewPresenter$models$8$2(homeViewPresenter, homeViewEvent, continuation2, i), 3);
            } else if (homeViewEvent instanceof HomeViewEvent.TabToolbarEvent) {
                JobKt.launch$default(coroutineScope, null, null, new HomeViewPresenter$models$8$2(homeViewPresenter, homeViewEvent, continuation2, 1), 3);
            } else if (!Intrinsics.areEqual(homeViewEvent, HomeViewEvent.SuspensionsBannerClicked.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object emit$com$squareup$cash$payments$presenters$MainPaymentPresenter$models$lambda$57$$inlined$map$1$2(Object obj, Continuation continuation) {
        MainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1 mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1) {
            mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1 = (MainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1) continuation;
            int i2 = mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    FlowCollector flowCollector = (FlowCollector) this.$$this$produceState;
                    Boolean valueOf = Boolean.valueOf((((Boolean) obj).booleanValue() || ((MainPaymentPresenter) this.this$0).askedContactsPaymentPreference.get()) ? false : true);
                    mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1.label = 1;
                    if (flowCollector.emit(valueOf, mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                }
                return Unit.INSTANCE;
            }
        }
        mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1 = new MainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1(this, continuation);
        Object obj22 = mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mainPaymentPresenter$models$lambda$57$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$payments$presenters$PaymentLoadingPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        PaymentLoadingPresenter paymentLoadingPresenter = (PaymentLoadingPresenter) this.this$0;
        CoroutineScope coroutineScope = (CoroutineScope) this.$$this$produceState;
        PaymentLoadingViewEvent paymentLoadingViewEvent = (PaymentLoadingViewEvent) obj;
        Continuation continuation2 = null;
        if (paymentLoadingViewEvent instanceof PaymentLoadingViewEvent.InitiatePayment) {
            JobKt.launch$default(coroutineScope, null, null, new OverlayKt$Overlay$1$1$1$1$1(paymentLoadingPresenter, continuation2, 20), 3);
        } else {
            if (!Intrinsics.areEqual(paymentLoadingViewEvent, PaymentLoadingViewEvent.Back.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            String str = (String) paymentLoadingPresenter.flowToken;
            String str2 = (String) paymentLoadingPresenter.paymentToken;
            boolean z = paymentLoadingPresenter.isRequest;
            Analytics analytics = (Analytics) paymentLoadingPresenter.analytics;
            if (z) {
                analytics.track(new AssetRequestLoadingManuallyCancelled(str2, str), null);
            } else {
                analytics.track(new AssetSendLoadingManuallyCancelled(str2, str), null);
            }
            paymentLoadingPresenter.navigator.goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    private final Object emit$com$squareup$cash$payments$presenters$PersonalizePaymentStickersPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) this.$$this$produceState;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator;
        PersonalizePaymentStickersViewEvent personalizePaymentStickersViewEvent = (PersonalizePaymentStickersViewEvent) obj;
        if (personalizePaymentStickersViewEvent instanceof PersonalizePaymentStickersViewEvent.StickerSelected) {
            ImmutableList immutableList = (ImmutableList) ((State) this.this$0).getValue();
            int i = ((PersonalizePaymentStickersViewEvent.StickerSelected) personalizePaymentStickersViewEvent).index;
            Sticker sticker = (Sticker) immutableList.get(i);
            ((Analytics) taxReturnsPresenter.args).track(new AssetSendPersonalizationTransformed(null, ((PaymentScreens.PersonalizePaymentStickers) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider).flowToken, null, null, null, sticker.remoteId, null, null, new Integer(i), null, 5821), null);
            screenNavigator.goTo(new Finish(new StickerSelectedResult(sticker)));
        } else {
            if (!Intrinsics.areEqual(personalizePaymentStickersViewEvent, PersonalizePaymentStickersViewEvent.Back.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            screenNavigator.goTo(Back.INSTANCE);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:147:0x0334, code lost:
    
        if (r3.emit(r4, r2) != r1) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x02c5, code lost:
    
        if (r0 == r1) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0301, code lost:
    
        if (r0 == r1) goto L152;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x0594, code lost:
    
        if (r0 == null) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:634:0x0ae2, code lost:
    
        if (r3.emit(r0, r2) != r1) goto L570;
     */
    /* JADX WARN: Code restructure failed: missing block: B:636:?, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:640:0x0ad3, code lost:
    
        if (r0 == r1) goto L569;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0629  */
    /* JADX WARN: Removed duplicated region for block: B:341:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:361:0x064a  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x06c6  */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:448:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0854  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x085e  */
    /* JADX WARN: Removed duplicated region for block: B:522:0x08b4  */
    /* JADX WARN: Removed duplicated region for block: B:528:0x08be  */
    /* JADX WARN: Removed duplicated region for block: B:573:0x0978  */
    /* JADX WARN: Removed duplicated region for block: B:579:0x0984  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x0a5c  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x0a66  */
    /* JADX WARN: Removed duplicated region for block: B:625:0x0aa1  */
    /* JADX WARN: Removed duplicated region for block: B:637:0x0ab5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01f1  */
    /* JADX WARN: Type inference failed for: r15v13, types: [com.squareup.cash.marketcapabilities.MarketCapabilityAvailability] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1 realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        FlowCollector flowCollector;
        RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1 realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1;
        int i2;
        InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1 investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1;
        int i3;
        Object categoryResult;
        InvestingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1 investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1;
        int i4;
        RealMarketCapabilitiesManager$availability$$inlined$map$1$2$1 realMarketCapabilitiesManager$availability$$inlined$map$1$2$1;
        int i5;
        Object obj2;
        PromotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1 promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1;
        int i6;
        Object obj3;
        RealAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1 realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1;
        int i7;
        RealMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1 realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1;
        int i8;
        ChatSession.Error error;
        Object obj4;
        MoneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1 moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1;
        int i9;
        Object obj5;
        LoadingAnimationAssets loadingAnimationAssets;
        Object obj6;
        MusicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1;
        int i10;
        FlowCollector flowCollector2;
        ArrayList arrayList;
        RealAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1 realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1;
        int i11;
        RealOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1 realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1;
        int i12;
        Map map;
        MoneyTabScreen moneyTabScreen;
        int i13 = this.$r8$classId;
        int i14 = 27;
        Back back = Back.INSTANCE;
        int i15 = 1;
        Object obj7 = this.$$this$produceState;
        Object obj8 = this.this$0;
        String str = null;
        r15 = null;
        ProcessingIndicator processingIndicator = null;
        switch (i13) {
            case 0:
                FilterGroupSection filterGroupSection = (FilterGroupSection) obj;
                if (Intrinsics.areEqual(filterGroupSection, new FilterGroupSection((List) null, 3))) {
                    a$$ExternalSyntheticBUOutline0.m$1("No FilterGroupSection instance stored in the database");
                    return null;
                }
                ProduceStateScope produceStateScope = (ProduceStateScope) obj7;
                FilterGroupSection.FilterGroupItem.Sheet sheet = ((FilterGroupSection.FilterGroupItem) filterGroupSection.filter_group_items.get(((OffersScreen$OffersFilterGroupSheetScreen) ((TaxReturnsPresenter) obj8).taxesDocumentsTaxReturnsDataProvider).filterGroupIndex)).sheet;
                if (sheet != null) {
                    produceStateScope.setValue(sheet);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$3("Data validation: FilterGroupItem.sheet == null");
                return null;
            case 1:
                if (continuation instanceof RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1) {
                    realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1 = (RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i16 = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                        realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.label = i16 - PKIFailureInfo.systemUnavail;
                        Object obj9 = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i != 0) {
                            SafeTrace.throwOnFailure(obj9);
                            flowCollector = (FlowCollector) obj7;
                            if (((InvestingState.Content.DividendState) obj) == InvestingState.Content.DividendState.SAVE_BALANCE) {
                                KeyValue keyValue = (KeyValue) ((MetadataRepo) obj8).mRootNode;
                                realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.L$4 = flowCollector;
                                realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                                realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                obj9 = keyValue.get(realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1);
                                break;
                            } else {
                                obj9 = Boolean.TRUE;
                            }
                        } else {
                            if (i != 1) {
                                if (i == 2) {
                                    SafeTrace.throwOnFailure(obj9);
                                    return Unit.INSTANCE;
                                }
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            r8 = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.I$0;
                            flowCollector = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj9);
                        }
                        realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                        realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.I$0 = r8;
                        realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                        break;
                    }
                }
                realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1 = new RealInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj92 = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                }
                realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.I$0 = r8;
                realInvestingInboundNavigator$showDripSetting$knowsDrip$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
            case 2:
                if (continuation instanceof RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1) {
                    realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1 = (RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1) continuation;
                    int i17 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1.label;
                    if ((i17 & PKIFailureInfo.systemUnavail) != 0) {
                        realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1.label = i17 - PKIFailureInfo.systemUnavail;
                        Object obj10 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1.result;
                        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i2 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1.label;
                        if (i2 != 0) {
                            SafeTrace.throwOnFailure(obj10);
                            CardsRoundUpsItemViewModel cardsRoundUpsItemViewModel = new CardsRoundUpsItemViewModel((RoundUpsElement) obj8, (CardsRoundUpsItemViewModel.DestinationAvatar) obj);
                            realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1.label = 1;
                            if (((FlowCollector) obj7).emit(cardsRoundUpsItemViewModel, realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1) == coroutineSingletons3) {
                                return coroutineSingletons3;
                            }
                        } else {
                            if (i2 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj10);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1 = new RealCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1(this, continuation);
                Object obj102 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons32 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = realCardsRoundUpsItemPresenter$toViewModels$$inlined$map$2$2$1.label;
                if (i2 != 0) {
                }
                return Unit.INSTANCE;
            case 3:
                if (continuation instanceof InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1) {
                    investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1 = (InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1) continuation;
                    int i18 = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1.label;
                    if ((i18 & PKIFailureInfo.systemUnavail) != 0) {
                        investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1.label = i18 - PKIFailureInfo.systemUnavail;
                        Object obj11 = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i3 = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1.label;
                        if (i3 != 0) {
                            SafeTrace.throwOnFailure(obj11);
                            FlowCollector flowCollector3 = (FlowCollector) obj7;
                            List<SearchResult> list = (List) obj;
                            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            for (SearchResult searchResult : list) {
                                InvestingSearchPresenter investingSearchPresenter = (InvestingSearchPresenter) obj8;
                                AndroidStringManager androidStringManager = investingSearchPresenter.stringManager;
                                MoneyFormatter moneyFormatter = investingSearchPresenter.moneyFormatter;
                                searchResult.getClass();
                                moneyFormatter.getClass();
                                if (searchResult instanceof SearchResult.InvestmentEntitySearchResult) {
                                    InvestmentEntityWithPrice investmentEntityWithPrice = ((SearchResult.InvestmentEntitySearchResult) searchResult).entity;
                                    categoryResult = new SearchResult.StockResult(KonfettiViewKt.asContentModel(investmentEntityWithPrice, null, true, false, false, androidStringManager, moneyFormatter), investmentEntityWithPrice.getSymbol());
                                } else {
                                    if (!(searchResult instanceof SearchResult.CategorySearchResult)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    Category category = ((SearchResult.CategorySearchResult) searchResult).category;
                                    String str2 = category.imageUrl;
                                    str2.getClass();
                                    Image image = new Image(str2, str2, 4);
                                    Color color = category.color;
                                    color.getClass();
                                    categoryResult = new SearchResult.CategoryResult(new StockContentModel(new InvestingCryptoAvatarContentModel$ImageWithBackground(image, color, ColorsKt.toColor(-1)), category.name, androidStringManager.get(R.string.category_subtitle), null, new InvestmentEntityToken(category.token.value), false, null, null));
                                }
                                arrayList2.add(categoryResult);
                            }
                            investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector3.emit(arrayList2, investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1) == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        } else {
                            if (i3 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj11);
                        }
                        return Unit.INSTANCE;
                    }
                }
                investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1 = new InvestingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1(this, continuation);
                Object obj112 = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons42 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = investingSearchPresenter$models$4$1$1$invokeSuspend$lambda$1$0$$inlined$map$1$2$1.label;
                if (i3 != 0) {
                }
                return Unit.INSTANCE;
            case 4:
                InvestingSettingsPresenter investingSettingsPresenter = (InvestingSettingsPresenter) obj8;
                BetterNavigator.ScreenNavigator screenNavigator = investingSettingsPresenter.navigator;
                CoroutineScope coroutineScope = (CoroutineScope) obj7;
                InvestingSettingsViewEvent investingSettingsViewEvent = (InvestingSettingsViewEvent) obj;
                if (Intrinsics.areEqual(investingSettingsViewEvent, InvestingSettingsViewEvent.BackClicked.INSTANCE)) {
                    screenNavigator.goTo(back);
                } else {
                    if (!(investingSettingsViewEvent instanceof InvestingSettingsViewEvent.EntryClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    int ordinal = ((InvestingSettingsViewEvent.EntryClicked) investingSettingsViewEvent).f1166type.ordinal();
                    if (ordinal == 0) {
                        screenNavigator.goTo(new ProfileScreens.CategoryListScreen(investingSettingsPresenter.stringManager.get(R.string.notifications_settings_title), CategoryListType.INVESTING, PlatformKt.activeAccountToken(investingSettingsPresenter.sessionManager)));
                    } else {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                throw new NotImplementedError("An operation is not implemented: Not implemented yet");
                            }
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        JobKt.launch$default(coroutineScope, null, null, new RealKeyStoreProvider$load$2(investingSettingsPresenter, r15, 21), 3);
                    }
                }
                return Unit.INSTANCE;
            case 5:
                if (continuation instanceof InvestingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1) {
                    investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1 = (InvestingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1) continuation;
                    int i19 = investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1.label;
                    if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                        investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1.label = i19 - PKIFailureInfo.systemUnavail;
                        Object obj12 = investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i4 = investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1.label;
                        if (i4 != 0) {
                            SafeTrace.throwOnFailure(obj12);
                            FlowCollector flowCollector4 = (FlowCollector) obj7;
                            List list2 = (List) obj;
                            if (((MoneybotHomePresenter) obj8).shouldAnimateHomeEntrance) {
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj13 : list2) {
                                    if (((Investing_news_article) obj13).display_in_carousel) {
                                        arrayList3.add(obj13);
                                    }
                                }
                                list2 = arrayList3;
                            }
                            investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1.label = 1;
                            if (flowCollector4.emit(list2, investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1) == coroutineSingletons5) {
                                return coroutineSingletons5;
                            }
                        } else {
                            if (i4 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj12);
                        }
                        return Unit.INSTANCE;
                    }
                }
                investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1 = new InvestingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1(this, continuation);
                Object obj122 = investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons52 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i4 = investingCryptoNewsPresenter$contentModel$$inlined$map$1$2$1.label;
                if (i4 != 0) {
                }
                return Unit.INSTANCE;
            case 6:
                if (continuation instanceof RealMarketCapabilitiesManager$availability$$inlined$map$1$2$1) {
                    realMarketCapabilitiesManager$availability$$inlined$map$1$2$1 = (RealMarketCapabilitiesManager$availability$$inlined$map$1$2$1) continuation;
                    int i20 = realMarketCapabilitiesManager$availability$$inlined$map$1$2$1.label;
                    if ((i20 & PKIFailureInfo.systemUnavail) != 0) {
                        realMarketCapabilitiesManager$availability$$inlined$map$1$2$1.label = i20 - PKIFailureInfo.systemUnavail;
                        Object obj14 = realMarketCapabilitiesManager$availability$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i5 = realMarketCapabilitiesManager$availability$$inlined$map$1$2$1.label;
                        if (i5 != 0) {
                            SafeTrace.throwOnFailure(obj14);
                            FlowCollector flowCollector5 = (FlowCollector) obj7;
                            Iterator it = ((List) obj).iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    obj2 = it.next();
                                    if (((MarketCapability) obj2).capabilityName == ((MarketCapabilityName) obj8)) {
                                    }
                                } else {
                                    obj2 = null;
                                }
                            }
                            MarketCapability marketCapability = (MarketCapability) obj2;
                            r15 = marketCapability != null ? marketCapability.capabilityAvailability : null;
                            realMarketCapabilitiesManager$availability$$inlined$map$1$2$1.label = 1;
                            if (flowCollector5.emit(r15, realMarketCapabilitiesManager$availability$$inlined$map$1$2$1) == coroutineSingletons6) {
                                return coroutineSingletons6;
                            }
                        } else {
                            if (i5 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj14);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realMarketCapabilitiesManager$availability$$inlined$map$1$2$1 = new RealMarketCapabilitiesManager$availability$$inlined$map$1$2$1(this, continuation);
                Object obj142 = realMarketCapabilitiesManager$availability$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons62 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = realMarketCapabilitiesManager$availability$$inlined$map$1$2$1.label;
                if (i5 != 0) {
                }
                return Unit.INSTANCE;
            case 7:
                WorkHomePresenter workHomePresenter = (WorkHomePresenter) obj7;
                SquareLoyaltySheetViewEvent squareLoyaltySheetViewEvent = (SquareLoyaltySheetViewEvent) obj;
                if (!(squareLoyaltySheetViewEvent instanceof SquareLoyaltySheetViewEvent.LoyaltyGenericTreeElementsViewEvent)) {
                    if (!(squareLoyaltySheetViewEvent instanceof SquareLoyaltySheetViewEvent.Close)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    final AnalyticsEvent analyticsEvent = ((SquareLoyaltySheetPresenter$State) ((MutableState) obj8).getValue()).dismissEvent;
                    if (analyticsEvent != null) {
                        ((Analytics) workHomePresenter.shiftsAnalytics).track(new Event() { // from class: com.squareup.cash.merchant.presenters.SquareLoyaltySheetPresenter$toCdfEvent$1
                            @Override // com.squareup.cash.cdf.Event
                            public final String getName() {
                                String str3 = AnalyticsEvent.this.name;
                                return str3 == null ? "" : str3;
                            }

                            @Override // com.squareup.cash.cdf.Event
                            public final Map getParameters() {
                                return AnalyticsEvent.this.parameters;
                            }
                        }, null);
                    }
                    ((BetterNavigator.ScreenNavigator) workHomePresenter.shiftSection2Presenter).goTo(back);
                }
                return Unit.INSTANCE;
            case 8:
                if (continuation instanceof PromotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1) {
                    promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1 = (PromotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1) continuation;
                    int i21 = promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                    if ((i21 & PKIFailureInfo.systemUnavail) != 0) {
                        promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1.label = i21 - PKIFailureInfo.systemUnavail;
                        Object obj15 = promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i6 = promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                        if (i6 != 0) {
                            SafeTrace.throwOnFailure(obj15);
                            FlowCollector flowCollector6 = (FlowCollector) obj7;
                            Iterator it2 = ((List) obj).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj3 = it2.next();
                                    if (((PromotedAppletTile) obj3).appletId == ((AppletId) ((VerifyCheckDialogPresenter) obj8).navigator)) {
                                    }
                                } else {
                                    obj3 = null;
                                }
                            }
                            PromotedAppletTile promotedAppletTile = (PromotedAppletTile) obj3;
                            String str3 = promotedAppletTile != null ? promotedAppletTile.title : null;
                            String str4 = promotedAppletTile != null ? promotedAppletTile.subtitle : null;
                            Object loaded = (str3 == null || str4 == null) ? PromotedAppletTileViewModel.Failed.INSTANCE : new PromotedAppletTileViewModel.Loaded(str3, str4, null, promotedAppletTile.image);
                            promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector6.emit(loaded, promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1) == coroutineSingletons7) {
                                return coroutineSingletons7;
                            }
                        } else {
                            if (i6 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj15);
                        }
                        return Unit.INSTANCE;
                    }
                }
                promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1 = new PromotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj152 = promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons72 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i6 = promotedAppletTilePresenter$models$lambda$0$$inlined$map$1$2$1.label;
                if (i6 != 0) {
                }
                return Unit.INSTANCE;
            case 9:
                if (continuation instanceof RealAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1) {
                    realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1 = (RealAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1) continuation;
                    int i22 = realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1.label;
                    if ((i22 & PKIFailureInfo.systemUnavail) != 0) {
                        realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1.label = i22 - PKIFailureInfo.systemUnavail;
                        Object obj16 = realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i7 = realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1.label;
                        if (i7 != 0) {
                            SafeTrace.throwOnFailure(obj16);
                            FlowCollector flowCollector7 = (FlowCollector) obj7;
                            List list3 = (List) obj;
                            RealAppletTileServerRecommendationProvider realAppletTileServerRecommendationProvider = (RealAppletTileServerRecommendationProvider) obj8;
                            AtomicReference atomicReference = realAppletTileServerRecommendationProvider.lastReportedResponseAppletIds;
                            Set set = (Set) realAppletTileServerRecommendationProvider.lastResponseAppletIds.get();
                            if (set != null && !Intrinsics.areEqual(atomicReference.get(), set)) {
                                ArrayList arrayList4 = realAppletTileServerRecommendationProvider.expectedAppletIds;
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it3 = arrayList4.iterator();
                                while (it3.hasNext()) {
                                    Object next = it3.next();
                                    if (!set.contains((AppletId) next)) {
                                        arrayList5.add(next);
                                    }
                                }
                                if (!arrayList5.isEmpty()) {
                                    realAppletTileServerRecommendationProvider.errorReporter.report(new RealAppletTileServerRecommendationProvider.AppletsServiceError("server is missing expected applets in response for " + arrayList5), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                }
                                atomicReference.set(set);
                            }
                            List list4 = list3;
                            ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                            for (Object obj17 : list4) {
                                int i23 = r8 + 1;
                                if (r8 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    throw null;
                                }
                                arrayList6.add(new Pair(((PromotedAppletTile) obj17).appletId, new Integer(r8)));
                                r8 = i23;
                            }
                            Map map2 = MapsKt__MapsKt.toMap(arrayList6);
                            Map map3 = map2.isEmpty() ? null : map2;
                            realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                            if (flowCollector7.emit(map3, realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons8) {
                                return coroutineSingletons8;
                            }
                        } else {
                            if (i7 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj16);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1 = new RealAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
                Object obj162 = realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons82 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i7 = realAppletTileServerRecommendationProvider$cachedUninstalledSectionSortValues_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i7 != 0) {
                }
                return Unit.INSTANCE;
            case 10:
                MusicPresenter musicPresenter = (MusicPresenter) obj8;
                CoroutineScope coroutineScope2 = (CoroutineScope) obj7;
                MoneyTabBookletViewEvent moneyTabBookletViewEvent = (MoneyTabBookletViewEvent) obj;
                if (moneyTabBookletViewEvent instanceof MoneyTabBookletViewEvent.Close) {
                    ((BetterNavigator.ScreenNavigator) musicPresenter.navigator).goTo(back);
                } else if (moneyTabBookletViewEvent instanceof MoneyTabBookletViewEvent.CtaClicked) {
                    JobKt.launch$default(coroutineScope2, null, null, new RealKeyStoreProvider$load$2(musicPresenter, r15, i14), 3);
                } else {
                    if (!(moneyTabBookletViewEvent instanceof MoneyTabBookletViewEvent.LinkClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((RealRouter) musicPresenter.args).route(new RoutingParams(null, null, null, null, null, null, 511), ((MoneyTabBookletViewEvent.LinkClicked) moneyTabBookletViewEvent).url);
                }
                return Unit.INSTANCE;
            case 11:
                if (continuation instanceof RealMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1) {
                    realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1 = (RealMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1) continuation;
                    int i24 = realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1.label;
                    if ((i24 & PKIFailureInfo.systemUnavail) != 0) {
                        realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1.label = i24 - PKIFailureInfo.systemUnavail;
                        Object obj18 = realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i8 = realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1.label;
                        if (i8 != 0) {
                            SafeTrace.throwOnFailure(obj18);
                            Pair pair = new Pair((SectionProvider) obj8, (SectionAvailabilityState) obj);
                            realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj7).emit(pair, realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1) == coroutineSingletons9) {
                                return coroutineSingletons9;
                            }
                        } else {
                            if (i8 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj18);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1 = new RealMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1(this, continuation);
                Object obj182 = realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons92 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i8 = realMoneyProfileManager$observeAvailableSections$lambda$2$$inlined$map$1$2$1.label;
                if (i8 != 0) {
                }
                return Unit.INSTANCE;
            case 12:
                ApiResult apiResult = (ApiResult) obj;
                RealChatSessionManager realChatSessionManager = (RealChatSessionManager) obj7;
                String str5 = (String) realChatSessionManager.sessionId.getValue();
                SharedFlowImpl sharedFlowImpl = realChatSessionManager.chatSession;
                ChatSession chatSession = (ChatSession) CollectionsKt.firstOrNull(sharedFlowImpl.getReplayCache());
                boolean z = apiResult instanceof ApiResult.Failure.HttpFailure;
                ChatSessionError chatSessionError = ChatSessionError.StreamingInterrupted.INSTANCE;
                if (z || (apiResult instanceof ApiResult.Failure.NetworkFailure)) {
                    Chat chat = chatSession != null ? chatSession.getChat() : null;
                    if (!((Ref$BooleanRef) obj8).element) {
                        chatSessionError = ChatSessionError.RequestFailed.INSTANCE;
                    }
                    error = new ChatSession.Error(chat, str5, chatSessionError);
                } else {
                    if ((apiResult instanceof ApiResult.Success) && str5 != null) {
                        obj4 = new ChatSession.Ok(((ChatResult) ((ApiResult.Success) apiResult).response).chat, str5, false);
                        Object emit = sharedFlowImpl.emit(obj4, continuation);
                        return emit != CoroutineSingletons.COROUTINE_SUSPENDED ? emit : Unit.INSTANCE;
                    }
                    error = new ChatSession.Error(chatSession != null ? chatSession.getChat() : null, str5, chatSessionError);
                }
                obj4 = error;
                Object emit2 = sharedFlowImpl.emit(obj4, continuation);
                if (emit2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                }
                break;
            case 13:
                ((ProduceStateScope) obj7).setValue(((MoneybotChatPresenter) obj8).chatSessionManagerFactory.create$1(null));
                return Unit.INSTANCE;
            case 14:
                if (continuation instanceof MoneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1) {
                    moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1 = (MoneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1) continuation;
                    int i25 = moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1.label;
                    if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                        moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1.label = i25 - PKIFailureInfo.systemUnavail;
                        Object obj19 = moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i9 = moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1.label;
                        if (i9 != 0) {
                            SafeTrace.throwOnFailure(obj19);
                            FlowCollector flowCollector8 = (FlowCollector) obj7;
                            MoneybotChatPresenter.IndicatorCapturedState indicatorCapturedState = (MoneybotChatPresenter.IndicatorCapturedState) obj;
                            MoneybotChatPresenter.TokenStreamingState tokenStreamingState = indicatorCapturedState.tokenStreamingState;
                            boolean z2 = indicatorCapturedState.sendMessageAnimating;
                            MoneybotChatPresenter.ToolRequestState toolRequestState = indicatorCapturedState.toolRequestInProgress;
                            Set set2 = indicatorCapturedState.streamingKickoffTexts;
                            List list5 = indicatorCapturedState.pendingMessages;
                            Chat chat2 = indicatorCapturedState.chat;
                            boolean z3 = tokenStreamingState != null || z2 || toolRequestState == MoneybotChatPresenter.ToolRequestState.Complete || !set2.isEmpty();
                            r8 = ((chat2 != null ? chat2.status : null) == ChatSessionStatus.CHAT_SESSION_STATUS_PROCESSING || !list5.isEmpty() || toolRequestState == MoneybotChatPresenter.ToolRequestState.InProgress) ? 1 : 0;
                            if (!z3 && r8 != 0) {
                                MoneybotChatContentFactory moneybotChatContentFactory = ((MoneybotChatPresenter) obj8).contentFactory;
                                moneybotChatContentFactory.getClass();
                                List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(R.string.moneybot_thinking_text_1), Integer.valueOf(R.string.moneybot_thinking_text_2), Integer.valueOf(R.string.moneybot_thinking_text_3), Integer.valueOf(R.string.moneybot_thinking_text_4), Integer.valueOf(R.string.moneybot_thinking_text_5)});
                                String str6 = moneybotChatContentFactory.stringManager.get(((Number) listOf.get(moneybotChatContentFactory.thinkingTextIndex)).intValue());
                                moneybotChatContentFactory.thinkingTextIndex = (moneybotChatContentFactory.thinkingTextIndex + 1) % listOf.size();
                                if (chat2 != null) {
                                    List list6 = chat2.messages;
                                    ArrayList arrayList7 = new ArrayList();
                                    Iterator it4 = list6.iterator();
                                    while (it4.hasNext()) {
                                        CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt.toList((MessageList) it4.next()), arrayList7);
                                    }
                                    ArrayList arrayList8 = new ArrayList();
                                    Iterator it5 = arrayList7.iterator();
                                    while (it5.hasNext()) {
                                        Object next2 = it5.next();
                                        if (next2 instanceof Message.ToolRequest) {
                                            arrayList8.add(next2);
                                        }
                                    }
                                    ListIterator listIterator = arrayList8.listIterator(arrayList8.size());
                                    while (true) {
                                        if (listIterator.hasPrevious()) {
                                            obj5 = listIterator.previous();
                                            if (((Message.ToolRequest) obj5).tooltipCategory != null) {
                                            }
                                        } else {
                                            obj5 = null;
                                        }
                                    }
                                    Message.ToolRequest toolRequest = (Message.ToolRequest) obj5;
                                    String str7 = toolRequest != null ? toolRequest.tooltip : null;
                                    Message.ToolRequest.TooltipCategory tooltipCategory = toolRequest != null ? toolRequest.tooltipCategory : null;
                                    if (str7 != null) {
                                        str6 = str7;
                                    }
                                    if (tooltipCategory != null) {
                                        switch (tooltipCategory.ordinal()) {
                                            case 0:
                                            case 4:
                                            case 5:
                                            case 9:
                                            case 11:
                                            case 12:
                                                loadingAnimationAssets = LoadingAnimationAssets.FallbacksSmall;
                                                break;
                                            case 1:
                                            case 3:
                                                loadingAnimationAssets = LoadingAnimationAssets.InsightsSmall;
                                                break;
                                            case 2:
                                            case 7:
                                                loadingAnimationAssets = LoadingAnimationAssets.ActionsSmall;
                                                break;
                                            case 6:
                                            case 8:
                                            case 10:
                                                loadingAnimationAssets = LoadingAnimationAssets.BitcoinStocksSmall;
                                                break;
                                            default:
                                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                                return null;
                                        }
                                    }
                                    loadingAnimationAssets = LoadingAnimationAssets.FallbacksSmall;
                                    processingIndicator = new ProcessingIndicator(str6, loadingAnimationAssets, 4);
                                } else {
                                    processingIndicator = new ProcessingIndicator(str6, null, 6);
                                }
                            }
                            moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1.label = 1;
                            if (flowCollector8.emit(processingIndicator, moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1) == coroutineSingletons10) {
                                return coroutineSingletons10;
                            }
                        } else {
                            if (i9 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj19);
                        }
                        return Unit.INSTANCE;
                    }
                }
                moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1 = new MoneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1(this, continuation);
                Object obj192 = moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons102 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i9 = moneybotChatPresenter$models$lambda$32$$inlined$map$1$2$1.label;
                if (i9 != 0) {
                }
                return Unit.INSTANCE;
            case 15:
                MusicPresenter musicPresenter2 = (MusicPresenter) obj8;
                CoroutineScope coroutineScope3 = (CoroutineScope) obj7;
                MoneybotPreambleEditorViewEvent moneybotPreambleEditorViewEvent = (MoneybotPreambleEditorViewEvent) obj;
                if (moneybotPreambleEditorViewEvent instanceof MoneybotPreambleEditorViewEvent.Close) {
                    ((BetterNavigator.ScreenNavigator) musicPresenter2.navigator).goTo(back);
                } else if (moneybotPreambleEditorViewEvent instanceof MoneybotPreambleEditorViewEvent.FetchLatest) {
                    JobKt.launch$default(coroutineScope3, null, null, new MoneybotPreambleEditorPresenter$models$1$1(musicPresenter2, null, 1), 3);
                } else if (moneybotPreambleEditorViewEvent instanceof MoneybotPreambleEditorViewEvent.ClearOverride) {
                    JobKt.launch$default(coroutineScope3, null, null, new MusicPresenter$models$3$1(musicPresenter2, r15, i15), 3);
                } else {
                    if (!(moneybotPreambleEditorViewEvent instanceof MoneybotPreambleEditorViewEvent.Save)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope3, null, null, new MusicPresenter$models$2$1(musicPresenter2, moneybotPreambleEditorViewEvent, r15, 18), 3);
                }
                return Unit.INSTANCE;
            case 16:
                MutableState mutableState = (MutableState) obj8;
                WorkHomePresenter workHomePresenter2 = (WorkHomePresenter) obj7;
                MoneybotStaticPickerScreen moneybotStaticPickerScreen = (MoneybotStaticPickerScreen) workHomePresenter2.shiftSection2Presenter;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) workHomePresenter2.payPresenter;
                ErrorReporter errorReporter = (ErrorReporter) workHomePresenter2.titleBarPresenter;
                MoneybotStaticPickerQuestion moneybotStaticPickerQuestion = (MoneybotStaticPickerQuestion) workHomePresenter2.youPresenter;
                MoneybotStaticPickerViewEvent moneybotStaticPickerViewEvent = (MoneybotStaticPickerViewEvent) obj;
                if (Intrinsics.areEqual(moneybotStaticPickerViewEvent, MoneybotStaticPickerViewEvent.ContinueTapped.INSTANCE)) {
                    Iterator it6 = moneybotStaticPickerQuestion.options.iterator();
                    while (true) {
                        if (it6.hasNext()) {
                            obj6 = it6.next();
                            if (Intrinsics.areEqual(((MoneybotStaticPickerOption) obj6).value, (String) mutableState.getValue())) {
                            }
                        } else {
                            obj6 = null;
                        }
                    }
                    MoneybotStaticPickerOption moneybotStaticPickerOption = (MoneybotStaticPickerOption) obj6;
                    if (moneybotStaticPickerOption != null) {
                        MoneybotStaticPickerOption moneybotStaticPickerOption2 = zzabw.access$isEnabled(moneybotStaticPickerOption, moneybotStaticPickerQuestion.linkedAmount, errorReporter) ? moneybotStaticPickerOption : null;
                        if (moneybotStaticPickerOption2 != null) {
                            screenNavigator2.giveAnswer(moneybotStaticPickerScreen.askedQuestion, new MoneybotStaticPickerAnswer.Selected(moneybotStaticPickerOption2));
                        }
                    }
                } else if (Intrinsics.areEqual(moneybotStaticPickerViewEvent, MoneybotStaticPickerViewEvent.Dismissed.INSTANCE)) {
                    screenNavigator2.giveAnswer(moneybotStaticPickerScreen.askedQuestion, MoneybotStaticPickerAnswer.Dismissed.INSTANCE);
                } else {
                    if (!(moneybotStaticPickerViewEvent instanceof MoneybotStaticPickerViewEvent.OptionTapped)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ArrayList arrayList9 = moneybotStaticPickerQuestion.options;
                    if (!arrayList9.isEmpty()) {
                        Iterator it7 = arrayList9.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                MoneybotStaticPickerOption moneybotStaticPickerOption3 = (MoneybotStaticPickerOption) it7.next();
                                String str8 = moneybotStaticPickerOption3.value;
                                String str9 = ((MoneybotStaticPickerViewEvent.OptionTapped) moneybotStaticPickerViewEvent).value;
                                if (Intrinsics.areEqual(str8, str9) && zzabw.access$isEnabled(moneybotStaticPickerOption3, moneybotStaticPickerQuestion.linkedAmount, errorReporter)) {
                                    mutableState.setValue(str9);
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
            case 17:
                Pair pair2 = (Pair) obj;
                Integer num = (Integer) pair2.first;
                int intValue = ((Number) pair2.second).intValue();
                if (num != null && num.intValue() >= intValue - 10) {
                    ((MutableState) obj8).setValue(Boolean.TRUE);
                    ((RecentChatHistoryViewModel$Loaded) obj7).onLoadMore.invoke();
                }
                return Unit.INSTANCE;
            case 18:
                MusicPresenter musicPresenter3 = (MusicPresenter) obj8;
                if (continuation instanceof MusicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) {
                    musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = (MusicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1) continuation;
                    int i26 = musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                    if ((i26 & PKIFailureInfo.systemUnavail) != 0) {
                        musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = i26 - PKIFailureInfo.systemUnavail;
                        Object obj20 = musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i10 = musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                        if (i10 != 0) {
                            SafeTrace.throwOnFailure(obj20);
                            flowCollector2 = (FlowCollector) obj7;
                            String str10 = (String) obj;
                            int length = str10.length();
                            ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) musicPresenter3.musicRepository;
                            if (length == 0) {
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = flowCollector2;
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                                obj20 = JobKt.withContext((CoroutineContext) toolbarTuckTargets.endCornerCenterX$delegate, new MusicPresenter$models$3$1(toolbarTuckTargets, r15, 5), musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1);
                                break;
                            } else {
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = flowCollector2;
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = 0;
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
                                obj20 = JobKt.withContext((CoroutineContext) toolbarTuckTargets.endCornerCenterX$delegate, new RealMusicRepository$searchMusic$2(toolbarTuckTargets, str10, r15, r8), musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1);
                                break;
                            }
                            return coroutineSingletons11;
                        }
                        if (i10 == 1) {
                            r8 = musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.I$0;
                            flowCollector2 = musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj20);
                            List list7 = (List) obj20;
                            if (list7 != null) {
                                arrayList = new ArrayList();
                                Iterator it8 = list7.iterator();
                                while (it8.hasNext()) {
                                    Track access$toTrack = MusicPresenter.access$toTrack(musicPresenter3, (Music) it8.next());
                                    if (access$toTrack != null) {
                                        arrayList.add(access$toTrack);
                                    }
                                }
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = r8;
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 3;
                            }
                            arrayList = null;
                            musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                            musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = r8;
                            musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 3;
                        } else if (i10 == 2) {
                            r8 = musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.I$0;
                            flowCollector2 = musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                            SafeTrace.throwOnFailure(obj20);
                            List list8 = (List) obj20;
                            if (list8 != null) {
                                arrayList = new ArrayList();
                                Iterator it9 = list8.iterator();
                                while (it9.hasNext()) {
                                    Track access$toTrack2 = MusicPresenter.access$toTrack(musicPresenter3, (Music) it9.next());
                                    if (access$toTrack2 != null) {
                                        arrayList.add(access$toTrack2);
                                    }
                                }
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = r8;
                                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 3;
                                break;
                            }
                            arrayList = null;
                            musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                            musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.I$0 = r8;
                            musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label = 3;
                        } else {
                            if (i10 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj20);
                        }
                        return Unit.INSTANCE;
                    }
                }
                musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1 = new MusicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
                Object obj202 = musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons112 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i10 = musicPresenter$models$1$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i10 != 0) {
                }
                return Unit.INSTANCE;
            case 19:
                if (continuation instanceof RealAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1) {
                    realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1 = (RealAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1) continuation;
                    int i27 = realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1.label;
                    if ((i27 & PKIFailureInfo.systemUnavail) != 0) {
                        realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1.label = i27 - PKIFailureInfo.systemUnavail;
                        Object obj21 = realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i11 = realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1.label;
                        if (i11 != 0) {
                            SafeTrace.throwOnFailure(obj21);
                            FlowCollector flowCollector9 = (FlowCollector) obj7;
                            NotificationToggleState notificationToggleState = ((RealAndroidNotificationSettingsChecker) obj8).notificationManager.notificationManagerCompat.areNotificationsEnabled() ? NotificationToggleState.Enabled : NotificationToggleState.Disabled;
                            realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1.label = 1;
                            if (flowCollector9.emit(notificationToggleState, realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1) == coroutineSingletons12) {
                                return coroutineSingletons12;
                            }
                        } else {
                            if (i11 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj21);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1 = new RealAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1(this, continuation);
                Object obj212 = realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons122 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i11 = realAndroidNotificationSettingsChecker$special$$inlined$map$1$2$1.label;
                if (i11 != 0) {
                }
                return Unit.INSTANCE;
            case 20:
                if (continuation instanceof RealOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1) {
                    realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1 = (RealOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1) continuation;
                    int i28 = realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1.label;
                    if ((i28 & PKIFailureInfo.systemUnavail) != 0) {
                        realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1.label = i28 - PKIFailureInfo.systemUnavail;
                        Object obj22 = realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1.result;
                        CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                        i12 = realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1.label;
                        if (i12 != 0) {
                            SafeTrace.throwOnFailure(obj22);
                            Pair pair3 = new Pair((OfferSheetKey) obj8, (OffersSheet) obj);
                            realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1.label = 1;
                            if (((FlowCollector) obj7).emit(pair3, realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1) == coroutineSingletons13) {
                                return coroutineSingletons13;
                            }
                        } else {
                            if (i12 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj22);
                        }
                        return Unit.INSTANCE;
                    }
                }
                realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1 = new RealOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1(this, continuation);
                Object obj222 = realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons132 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i12 = realOffersSheetRepository$getSheetResponseFromCache$$inlined$map$1$2$1.label;
                if (i12 != 0) {
                }
                return Unit.INSTANCE;
            case 21:
                TaxReturnsPresenter taxReturnsPresenter = (TaxReturnsPresenter) obj8;
                OffersScreen$OffersFilterGroupSheetScreen offersScreen$OffersFilterGroupSheetScreen = (OffersScreen$OffersFilterGroupSheetScreen) taxReturnsPresenter.taxesDocumentsTaxReturnsDataProvider;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) taxReturnsPresenter.navigator;
                RealOffersAnalytics realOffersAnalytics = (RealOffersAnalytics) taxReturnsPresenter.router;
                MutableState mutableState2 = (MutableState) obj7;
                OffersFilterGroupSheetViewEvent offersFilterGroupSheetViewEvent = (OffersFilterGroupSheetViewEvent) obj;
                if (offersFilterGroupSheetViewEvent instanceof OffersFilterGroupSheetViewEvent.FilterApplied) {
                    String str11 = (String) mutableState2.getValue();
                    if (str11 == null || (map = MapsKt__MapsJVMKt.mapOf(new Pair(AnalyticsEvent.ParamType.FILTERS_SELECTED, str11))) == null) {
                        map = EmptyMap.INSTANCE;
                        map.getClass();
                    }
                    realOffersAnalytics.trackGenericAnalyticsEvents(((OffersFilterGroupSheetViewEvent.FilterApplied) offersFilterGroupSheetViewEvent).analyticsActionEventSpecs, map);
                    screenNavigator3.goTo(new Finish(new OffersFilterGroupSheetResult(offersScreen$OffersFilterGroupSheetScreen.filterGroupIndex, (String) mutableState2.getValue())));
                } else if (Intrinsics.areEqual(offersFilterGroupSheetViewEvent, OffersFilterGroupSheetViewEvent.FilterGroupCleared.INSTANCE)) {
                    mutableState2.setValue(null);
                    screenNavigator3.goTo(new Finish(new OffersFilterGroupSheetResult(offersScreen$OffersFilterGroupSheetScreen.filterGroupIndex, null)));
                } else {
                    if (!(offersFilterGroupSheetViewEvent instanceof OffersFilterGroupSheetViewEvent.FilterSelected)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    String str12 = (String) mutableState2.getValue();
                    OffersFilterGroupSheetViewEvent.FilterSelected filterSelected = (OffersFilterGroupSheetViewEvent.FilterSelected) offersFilterGroupSheetViewEvent;
                    String str13 = filterSelected.filterToken;
                    if (!Intrinsics.areEqual(str12, str13)) {
                        RealOffersAnalytics.trackGenericAnalyticsEvents$default(realOffersAnalytics, filterSelected.analyticsActionEventSpecs);
                        str = str13;
                    }
                    mutableState2.setValue(str);
                }
                return Unit.INSTANCE;
            case 22:
                if (!Intrinsics.areEqual((PaychecksAppletTileEvent$PaychecksAppletOnClickTile) obj, PaychecksAppletTileEvent$PaychecksAppletOnClickTile.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                PoolsListPresenter poolsListPresenter = (PoolsListPresenter) obj7;
                PaychecksAppletTileModel paychecksAppletTileModel = (PaychecksAppletTileModel) ((MutableState) obj8).getValue();
                ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) poolsListPresenter.sessionManager)).submitSelectItemEvent(ItemId.PAYCHECKS.INSTANCE, null, MoneySelectAction.TAP);
                BinaryBitmap binaryBitmap = (BinaryBitmap) poolsListPresenter.repository;
                if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) binaryBitmap.binarizer)).peekCurrentValue(AmplitudeExperiments$EarningsApplet.INSTANCE)).enabled() && ((Function0) ((RealEarningsSyncStateRepository) binaryBitmap.matrix).appletAvailabilityState.getValue).invoke() == AppletAvailabilityState.AVAILABLE) {
                    ((Navigator) poolsListPresenter.analytics).goTo(new EarningsHomeScreen(EarningsHomeScreen.Origin.MONEY_TAB_APPLET));
                } else {
                    MoneyTabScreen moneyTabScreen2 = new MoneyTabScreen(null);
                    if ((paychecksAppletTileModel instanceof PaychecksAppletTileModel.Installed) || (paychecksAppletTileModel instanceof PaychecksAppletTileModel.Loading)) {
                        moneyTabScreen = null;
                    } else {
                        if (!(paychecksAppletTileModel instanceof PaychecksAppletTileModel.Uninstalled)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        moneyTabScreen = new MoneyTabScreen(null);
                    }
                    ((RealRouter) poolsListPresenter.moneyFormatter).route(new RoutingParams(moneyTabScreen2, null, moneyTabScreen, null, null, null, HttpStatusCode.BAD_GATEWAY_502), paychecksAppletTileModel.getClientRoute());
                }
                return Unit.INSTANCE;
            case 23:
                WorkHomePresenter workHomePresenter3 = (WorkHomePresenter) obj7;
                HelpSheetViewEvent helpSheetViewEvent = (HelpSheetViewEvent) obj;
                if (Intrinsics.areEqual(helpSheetViewEvent, HelpSheetViewEvent.AdditionalHelp.INSTANCE)) {
                    RealRouter realRouter = (RealRouter) workHomePresenter3.youPresenter;
                    PaychecksUiConfiguration.PaychecksHelpSheetUi paychecksHelpSheetUi = (PaychecksUiConfiguration.PaychecksHelpSheetUi) ((State) obj8).getValue();
                    paychecksHelpSheetUi.getClass();
                    realRouter.route(new RoutingParams(HelpSheetScreen.INSTANCE, null, null, null, null, null, 510), paychecksHelpSheetUi.helpButtonClientRoute);
                } else {
                    if (!Intrinsics.areEqual(helpSheetViewEvent, HelpSheetViewEvent.Dismiss.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((BetterNavigator.ScreenNavigator) workHomePresenter3.titleBarPresenter).goTo(back);
                }
                return Unit.INSTANCE;
            case 24:
                return emit$com$squareup$cash$paychecks$presenters$PaychecksHomePresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 25:
                return emit$com$squareup$cash$paymentpad$presenters$HomeViewPresenter$models$$inlined$CollectEffect$2$1(obj, continuation);
            case 26:
                return emit$com$squareup$cash$payments$presenters$MainPaymentPresenter$models$lambda$57$$inlined$map$1$2(obj, continuation);
            case 27:
                return emit$com$squareup$cash$payments$presenters$PaymentLoadingPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 28:
                return emit$com$squareup$cash$payments$presenters$PersonalizePaymentStickersPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            default:
                WorkHomePresenter workHomePresenter4 = (WorkHomePresenter) obj8;
                CoroutineScope coroutineScope4 = (CoroutineScope) obj7;
                PhonePlansEsimCheckViewEvent phonePlansEsimCheckViewEvent = (PhonePlansEsimCheckViewEvent) obj;
                if (phonePlansEsimCheckViewEvent instanceof PhonePlansEsimCheckViewEvent.ToolbarButtonClicked) {
                    JobKt.launch$default(coroutineScope4, null, null, new MusicPresenter$models$3$1(workHomePresenter4, r15, 23), 3);
                } else {
                    if (!(phonePlansEsimCheckViewEvent instanceof PhonePlansEsimCheckViewEvent.CtaClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    JobKt.launch$default(coroutineScope4, null, null, new OverlayKt$Overlay$1$1$1$1$1(workHomePresenter4, phonePlansEsimCheckViewEvent, r15, i14), 3);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ OffersFilterGroupSheetPresenter$models$sheet$2$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, State state, int i) {
        this.$r8$classId = i;
        this.$$this$produceState = moleculePresenter;
        this.this$0 = state;
    }

    public /* synthetic */ OffersFilterGroupSheetPresenter$models$sheet$2$1$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$$this$produceState = obj;
        this.this$0 = obj2;
    }
}
