package app.cash.local.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import android.os.Build;
import android.os.Parcelable;
import androidx.biometric.CryptoObjectUtils;
import androidx.camera.core.impl.QuirkSettingsLoader;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.semantics.SemanticsSortKt$special$$inlined$thenBy$1;
import androidx.core.os.BundleKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$clear$2;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.RenavigationKt;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.db.LocalCashDetailContentQueries$$ExternalSyntheticLambda0;
import app.cash.local.db.LocalCashDetailContentQueries$selectContent$2;
import app.cash.local.db.LocalCashDetailContentQueries$selectHowItWorks$2;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.local.navigation.LocalInstalledStore;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.presenters.internal.DateTimesKt;
import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.LocalCurrencyCode;
import app.cash.local.screens.app.LocalCashBalanceScreen;
import app.cash.local.service.LocalService;
import app.cash.local.store.real.RealLocalInstalledStore;
import app.cash.local.store.real.RealLocalInstalledStore$hideBrands$$inlined$map$1;
import app.cash.local.viewmodels.CardManagementSheetModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.molecule.PlatformKt;
import app.cash.passcode.flows.RealPasscodeFlowStarter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.n$$ExternalSyntheticLambda1;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import coil3.size.DimensionKt;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzjr;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.miteksystems.misnap.camera.a.b;
import com.squareup.cash.R;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.account.settings.viewmodels.AliasesSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.ContactInfoSectionViewModel;
import com.squareup.cash.account.settings.viewmodels.PersonalScreenViewModel;
import com.squareup.cash.account.settings.viewmodels.RatePlanButtonTreatment;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.db.SheetMessage;
import com.squareup.cash.appmessages.presenters.ProfileInlineAppMessagePresenter$Factory$Impl;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPerformer$Factory$Impl;
import com.squareup.cash.appmessages.sheet.SheetAppMessageModel;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.benefits.presenters.BenefitsHubPresenter$models$1$1;
import com.squareup.cash.biometrics.AndroidSecureStore$read$2;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.boost.db.Slots;
import com.squareup.cash.borrow.ui.util.ArcadeThemeKt;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.cdf.paychecks.PaychecksManageDistributionSetAllocationAmountWarnForOverallocation;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager$cashLiteConfig$$inlined$map$1;
import com.squareup.cash.data.profile.RealAddressManager;
import com.squareup.cash.data.profile.RealContactAliasFetcher;
import com.squareup.cash.data.profile.RealProfileAliasRepository;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.earnings.presenters.home.EarningsHeaderPresenter;
import com.squareup.cash.eligibility.backend.api.AccountSettingType$PersonalSettings;
import com.squareup.cash.eligibility.backend.real.RealSettingsEligibilityManager;
import com.squareup.cash.family.familyhub.backend.api.DependentPortfolio;
import com.squareup.cash.family.familyhub.backend.real.RealDependentPortfolioStore;
import com.squareup.cash.family.familyhub.backend.real.RealFamilyAccountsManager;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_2C;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.gps.db.GpsConfigQueries;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.graphics.views.effect.LightSourceKt$produceLightSource$1$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.instruments.backend.real.RealBalanceSnapshotManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentLinkingOptionManager;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.screens.SelectPaymentInstrumentArgs;
import com.squareup.cash.instruments.viewmodels.SelectPaymentInstrumentViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.api.DiscoveryHeader;
import com.squareup.cash.investing.backend.api.PolledData;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.api.data.InvestmentEntityWithPrice;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities;
import com.squareup.cash.investing.backend.real.RealInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.backend.real.families.RealDependentInvestmentEntities;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries$selectDiscoveries$2;
import com.squareup.cash.investing.db.InvestingDiscoveryQueries.SelectDiscoveriesQuery;
import com.squareup.cash.investing.db.Investing_settings;
import com.squareup.cash.investing.presenters.FollowingHeadersKt$WhenMappings;
import com.squareup.cash.investing.presenters.PercentChange;
import com.squareup.cash.investing.presenters.StockMetricFactory;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.FollowingStockMetricType;
import com.squareup.cash.investing.viewmodels.InvestingHomeViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryTileContentModel;
import com.squareup.cash.investing.viewmodels.drip.DividendReinvestmentSettingViewModel;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.invitations.InviteErrorPresenter$models$1$1;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.loadable.Loadable;
import com.squareup.cash.localization.RealLocaleManager;
import com.squareup.cash.localization.db.LocalizationConfigQueries$select$2;
import com.squareup.cash.localization.presenters.LanguageDisclosurePresenter$handleAccept$1;
import com.squareup.cash.localization.screens.LanguageDisclosureScreen;
import com.squareup.cash.localization.viewmodels.LanguageDisclosureViewModel;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.marketing.components.TooltipBoxKt$$ExternalSyntheticLambda2;
import com.squareup.cash.merchant.backend.api.BlockedBusinessesUiConfig;
import com.squareup.cash.merchant.presenters.MerchantBlockingPresenter$getBlockedBusinessesConfig$1;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantBlockingScreen;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewEvent;
import com.squareup.cash.merchant.viewmodels.MerchantBlockingViewModel;
import com.squareup.cash.money.presenters.MoneyTabPresenter$models$lambda$31$$inlined$map$1;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda5;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter$models$1$1;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.notifications.Op;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.backend.api.OffersCollectionTrackingAction;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsHelper;
import com.squareup.cash.offers.backend.real.RealOffersTabRefresher;
import com.squareup.cash.offers.backend.real.RealOffersTabRepository;
import com.squareup.cash.offers.db.OffersCollectionDetailQueries$forToken$2;
import com.squareup.cash.offers.db.OffersSheetQueries$ForSheetKeyQuery;
import com.squareup.cash.offers.presenters.OffersFullscreenCollectionPresenter$models$2$1;
import com.squareup.cash.offers.presenters.OffersTabMapperKt;
import com.squareup.cash.offers.presenters.RealOffersAnalytics$Factory$Impl;
import com.squareup.cash.offers.screens.OffersScreen$OffersFullscreenCollectionScreen;
import com.squareup.cash.offers.viewmodels.FormattedDetailViewModel;
import com.squareup.cash.offers.viewmodels.OffersCollectionHeaderViewModel;
import com.squareup.cash.offers.viewmodels.OffersCollectionListingViewModel;
import com.squareup.cash.offers.viewmodels.OffersFullscreenCollectionViewModel;
import com.squareup.cash.overlays.Overlay$$ExternalSyntheticLambda0;
import com.squareup.cash.overlays.OverlayKt$Overlay$1$1$1$1$1;
import com.squareup.cash.p2pblocking.presenters.AllowListController$Factory$Impl;
import com.squareup.cash.p2pblocking.presenters.BlockListController$Factory$Impl;
import com.squareup.cash.p2pblocking.presenters.P2PListController;
import com.squareup.cash.p2pblocking.screens.P2PListData;
import com.squareup.cash.p2pblocking.screens.P2PListScreen;
import com.squareup.cash.p2pblocking.screens.P2PScreenMode;
import com.squareup.cash.p2pblocking.viewmodels.P2PFailureDialogModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListEmptyState;
import com.squareup.cash.p2pblocking.viewmodels.P2PListViewModel;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.backend.api.mapper.CommonMappersKt;
import com.squareup.cash.paychecks.backend.api.model.AllocationDestination;
import com.squareup.cash.paychecks.backend.api.model.BottomSheet;
import com.squareup.cash.paychecks.backend.api.model.EditDistributionConfiguration;
import com.squareup.cash.paychecks.presenters.EditDistributionPresenter$submitAllocationUpdates$1;
import com.squareup.cash.paychecks.presenters.util.UtilsKt;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.paychecks.screens.OverallocationAlertDialogScreen;
import com.squareup.cash.paychecks.viewmodels.DistributionWheelViewModel;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewEvent;
import com.squareup.cash.paychecks.viewmodels.EditDistributionViewModel;
import com.squareup.cash.paychecks.viewmodels.common.ColorTheme;
import com.squareup.cash.paychecks.views.HelpSheetView$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.backend.real.RealStatusAndLimitsManager;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.profile.presenters.identityverification.RealIdentityVerificationPresenter$Factory$Impl;
import com.squareup.cash.profile.presenters.personal.AliasesSectionPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.profile.presenters.personal.PersonalInfoSectionPresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.profile.presenters.personal.ProfilePersonalPresenter$toRatePlanButtonTreatment$1;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.views.RingtoneView;
import com.squareup.cash.qrcodes.presenters.CashQrScannerPresenter$special$$inlined$filter$1;
import com.squareup.cash.qrcodes.presenters.RealQrCodesPresenter$models$1$1;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.presenters.SelectPaymentPlanBlockerPresenter$models$1$2;
import com.squareup.cash.screens.Back;
import com.squareup.cash.session.backend.DbSessionManager$updateDb$2;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.timestampformatter.api.TimestampFormatter$DisplayContext;
import com.squareup.cash.timestampformatter.impl.RealTimestampFormatter$Factory$Impl;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.upsell.presenters.NullStateSwipeConfigProvider;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.preferences.EnumPreference;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.GetCardBlockedBusinessesUIConfigRequest;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.GetCardBlockedBusinessesUIConfigResponse;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.MerchantBlockingClientService;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.CustomerProfileClientService;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.DisclosureAction;
import com.squareup.protos.cash.cashcustomerprofile.api.v1.UpdateDisclosureAcceptanceRequest;
import com.squareup.protos.cash.cashsuggest.api.OffersTabCollectionResponse;
import com.squareup.protos.cash.discover.api.app.v1.model.DetailsPage;
import com.squareup.protos.cash.investcustomer.api.v1.drip.InvestCustomerDripService;
import com.squareup.protos.cash.local.client.app.v1.cashbalance.LocalCashBalance;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalButton;
import com.squareup.protos.cash.local.client.v1.LocalCashActivity;
import com.squareup.protos.cash.local.client.v1.LocalCashInformationalContent;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageAction;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage$SecondaryNavigationAction$SecondaryButton;
import com.squareup.protos.cash.messagingplatformcommon.app.HalfSheetMessage$VisualAsset$Image;
import com.squareup.protos.cash.messagingplatformcommon.app.ShareSheet;
import com.squareup.protos.cash.paychecks.api.blockers.v1.SetPaycheckAllocationAmountInputs;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckAllocationAmountRequest;
import com.squareup.protos.cash.paychecks.api.v1.SubmitSetPaycheckAllocationAmountResponse;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.CollectionSection;
import com.squareup.protos.cash.shop.rendering.api.CollectionSection$Content$RowSection;
import com.squareup.protos.cash.shop.rendering.api.FormattedDetail;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$OfferRow;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.common.LocalizationConfig;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.util.android.AndroidActivityFinisher;
import com.squareup.util.coroutines.TickerKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.io.Serializable;
import java.text.NumberFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import nl.dionsegijn.konfetti.compose.KonfettiViewKt;
import nl.dionsegijn.konfetti.core.Position;
import okhttp3.internal.publicsuffix.AssetPublicSuffixList;
import okio.ByteString;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.Handlers$$ExternalSyntheticBUOutline0;
import papa.SafeTrace;
import retrofit2.Retrofit;
import squareup.cash.paychecks.AllocationDestination;
import squareup.cash.paychecks.AllocationDistribution;

/* loaded from: classes3.dex */
public final class LocalCashBalancePresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId = 0;
    public final Object analytics;
    public final Object clock;
    public final Object launcher;
    public final Object navigator;
    public final Object screen;
    public final Object service;
    public final Object sessionManager;
    public final Object store;
    public final Object stringManager;
    public final Object syncer;
    public final Object timestampFormatter;

    public LocalCashBalancePresenter(FlowStarter flowStarter, Analytics analytics, AndroidStringManager androidStringManager, RealAccountRatePlanManager realAccountRatePlanManager, RealSettingsEligibilityManager realSettingsEligibilityManager, SyncValueReader syncValueReader, AliasesSectionPresenter$AssistedInjectionFactory$Impl aliasesSectionPresenter$AssistedInjectionFactory$Impl, PersonalInfoSectionPresenter$AssistedInjectionFactory$Impl personalInfoSectionPresenter$AssistedInjectionFactory$Impl, ProfileInlineAppMessagePresenter$Factory$Impl profileInlineAppMessagePresenter$Factory$Impl, ProfileScreens.AccountInfoScreen accountInfoScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        accountInfoScreen.getClass();
        this.syncer = flowStarter;
        this.analytics = analytics;
        this.stringManager = androidStringManager;
        this.launcher = realAccountRatePlanManager;
        this.sessionManager = realSettingsEligibilityManager;
        this.store = syncValueReader;
        this.service = accountInfoScreen;
        this.navigator = screenNavigator;
        this.screen = profileInlineAppMessagePresenter$Factory$Impl.create(screenNavigator);
        zzlj zzljVar = personalInfoSectionPresenter$AssistedInjectionFactory$Impl.delegateFactory;
        SyncValueReader syncValueReader2 = (SyncValueReader) ((DoubleCheck) zzljVar.zza).getValue();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) ((Provider) zzljVar.zzb).invoke();
        FlowStarter flowStarter2 = (FlowStarter) ((DoubleCheck) zzljVar.zzc).getValue();
        RealAddressManager realAddressManager = (RealAddressManager) ((Provider) zzljVar.zze).invoke();
        Analytics analytics2 = (Analytics) ((DoubleCheck) zzljVar.zzd).getValue();
        RealIdentityVerificationPresenter$Factory$Impl realIdentityVerificationPresenter$Factory$Impl = (RealIdentityVerificationPresenter$Factory$Impl) ((InstanceFactory) zzljVar.zzf).value;
        syncValueReader2.getClass();
        realRouter$Factory$Impl.getClass();
        flowStarter2.getClass();
        realAddressManager.getClass();
        analytics2.getClass();
        realIdentityVerificationPresenter$Factory$Impl.getClass();
        this.clock = new EarningsHeaderPresenter(syncValueReader2, realRouter$Factory$Impl, flowStarter2, realAddressManager, analytics2, accountInfoScreen, screenNavigator, realIdentityVerificationPresenter$Factory$Impl);
        Retrofit.Builder builder = aliasesSectionPresenter$AssistedInjectionFactory$Impl.delegateFactory;
        AndroidStringManager androidStringManager2 = (AndroidStringManager) ((LambdaProvider) builder.callFactory).lambda.invoke();
        RealProfileAliasRepository realProfileAliasRepository = (RealProfileAliasRepository) ((Provider) builder.baseUrl).invoke();
        FlowStarter flowStarter3 = (FlowStarter) ((DoubleCheck) builder.converterFactories).getValue();
        RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) builder.callAdapterFactories).invoke();
        RealContactAliasFetcher realContactAliasFetcher = (RealContactAliasFetcher) ((Provider) builder.callbackExecutor).invoke();
        androidStringManager2.getClass();
        realProfileAliasRepository.getClass();
        flowStarter3.getClass();
        realProfileManager.getClass();
        realContactAliasFetcher.getClass();
        this.timestampFormatter = new PdfPreviewPresenter(androidStringManager2, realProfileAliasRepository, flowStarter3, realProfileManager, realContactAliasFetcher, accountInfoScreen, screenNavigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable access$getBlockedBusinessesConfig(LocalCashBalancePresenter localCashBalancePresenter, MerchantBlockingClientService merchantBlockingClientService, TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2, ContinuationImpl continuationImpl) {
        MerchantBlockingPresenter$getBlockedBusinessesConfig$1 merchantBlockingPresenter$getBlockedBusinessesConfig$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof MerchantBlockingPresenter$getBlockedBusinessesConfig$1) {
            merchantBlockingPresenter$getBlockedBusinessesConfig$1 = (MerchantBlockingPresenter$getBlockedBusinessesConfig$1) continuationImpl;
            int i2 = merchantBlockingPresenter$getBlockedBusinessesConfig$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                merchantBlockingPresenter$getBlockedBusinessesConfig$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = merchantBlockingPresenter$getBlockedBusinessesConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantBlockingPresenter$getBlockedBusinessesConfig$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetCardBlockedBusinessesUIConfigRequest getCardBlockedBusinessesUIConfigRequest = new GetCardBlockedBusinessesUIConfigRequest(PlatformKt.activeAccountToken((SessionManager) localCashBalancePresenter.sessionManager), null, null, null, null, ByteString.EMPTY);
                    merchantBlockingPresenter$getBlockedBusinessesConfig$1.L$1 = tooltipBoxKt$$ExternalSyntheticLambda2;
                    merchantBlockingPresenter$getBlockedBusinessesConfig$1.label = 1;
                    obj = merchantBlockingClientService.getCardBlockedBusinessesUIConfig(getCardBlockedBusinessesUIConfigRequest, merchantBlockingPresenter$getBlockedBusinessesConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tooltipBoxKt$$ExternalSyntheticLambda2 = merchantBlockingPresenter$getBlockedBusinessesConfig$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    return (GetCardBlockedBusinessesUIConfigResponse) ((ApiResult.Success) apiResult).response;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    tooltipBoxKt$$ExternalSyntheticLambda2.invoke(apiResult);
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        merchantBlockingPresenter$getBlockedBusinessesConfig$1 = new MerchantBlockingPresenter$getBlockedBusinessesConfig$1(localCashBalancePresenter, continuationImpl);
        Object obj2 = merchantBlockingPresenter$getBlockedBusinessesConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantBlockingPresenter$getBlockedBusinessesConfig$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleAccept(LocalCashBalancePresenter localCashBalancePresenter, LocalizationConfig.LanguageDisclosure languageDisclosure, ContinuationImpl continuationImpl) {
        LanguageDisclosurePresenter$handleAccept$1 languageDisclosurePresenter$handleAccept$1;
        int i;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator;
        if (continuationImpl instanceof LanguageDisclosurePresenter$handleAccept$1) {
            languageDisclosurePresenter$handleAccept$1 = (LanguageDisclosurePresenter$handleAccept$1) continuationImpl;
            int i2 = languageDisclosurePresenter$handleAccept$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                languageDisclosurePresenter$handleAccept$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = languageDisclosurePresenter$handleAccept$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = languageDisclosurePresenter$handleAccept$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String languageTag = ((Locale) ((RealLocaleManager) localCashBalancePresenter.screen).resolvedLocale.$$delegate_0.getValue()).toLanguageTag();
                    CustomerProfileClientService customerProfileClientService = (CustomerProfileClientService) localCashBalancePresenter.sessionManager;
                    Op.Companion companion = DisclosureAction.Companion;
                    UpdateDisclosureAcceptanceRequest updateDisclosureAcceptanceRequest = new UpdateDisclosureAcceptanceRequest(languageTag, languageDisclosure != null ? languageDisclosure.version : null, 8);
                    languageDisclosurePresenter$handleAccept$1.label = 1;
                    obj = customerProfileClientService.updateDisclosureAcceptance(updateDisclosureAcceptanceRequest, languageDisclosurePresenter$handleAccept$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    screenNavigator.goTo(Back.INSTANCE);
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    screenNavigator.goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, (LanguageDisclosureScreen) localCashBalancePresenter.timestampFormatter, (AndroidStringManager) localCashBalancePresenter.stringManager));
                }
                return Unit.INSTANCE;
            }
        }
        languageDisclosurePresenter$handleAccept$1 = new LanguageDisclosurePresenter$handleAccept$1(localCashBalancePresenter, continuationImpl);
        Object obj2 = languageDisclosurePresenter$handleAccept$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = languageDisclosurePresenter$handleAccept$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$submitAllocationUpdates(LocalCashBalancePresenter localCashBalancePresenter, EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration, AllocationDistribution allocationDistribution, SetPaycheckAllocationAmountInputs.SubmissionInteraction submissionInteraction, ContinuationImpl continuationImpl) {
        EditDistributionPresenter$submitAllocationUpdates$1 editDistributionPresenter$submitAllocationUpdates$1;
        int i;
        ApiResult apiResult;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) localCashBalancePresenter.navigator;
        BlockersData blockersData = (BlockersData) localCashBalancePresenter.store;
        if (continuationImpl instanceof EditDistributionPresenter$submitAllocationUpdates$1) {
            editDistributionPresenter$submitAllocationUpdates$1 = (EditDistributionPresenter$submitAllocationUpdates$1) continuationImpl;
            int i2 = editDistributionPresenter$submitAllocationUpdates$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                editDistributionPresenter$submitAllocationUpdates$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = editDistributionPresenter$submitAllocationUpdates$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = editDistributionPresenter$submitAllocationUpdates$1.label;
                boolean z = true;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RequestContext requestContext = blockersData.requestContext;
                    AllocationDestination allocationDestinationProto = CommonMappersKt.toAllocationDestinationProto(destinationUiConfiguration.destination);
                    ByteString byteString = ByteString.EMPTY;
                    SubmitSetPaycheckAllocationAmountRequest submitSetPaycheckAllocationAmountRequest = new SubmitSetPaycheckAllocationAmountRequest(requestContext, new SetPaycheckAllocationAmountInputs(submissionInteraction, allocationDistribution, allocationDestinationProto, byteString), byteString);
                    PaychecksAppService paychecksAppService = (PaychecksAppService) localCashBalancePresenter.launcher;
                    String str2 = blockersData.flowToken;
                    editDistributionPresenter$submitAllocationUpdates$1.L$2 = submissionInteraction;
                    editDistributionPresenter$submitAllocationUpdates$1.label = 1;
                    obj = paychecksAppService.submitSetPaycheckAllocationAmount(str2, submitSetPaycheckAllocationAmountRequest, editDistributionPresenter$submitAllocationUpdates$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    submissionInteraction = editDistributionPresenter$submitAllocationUpdates$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    if (submissionInteraction == SetPaycheckAllocationAmountInputs.SubmissionInteraction.SUBMISSION_INTERACTION_CANCEL) {
                        EditDistributionConfiguration editDistributionConfiguration = (EditDistributionConfiguration) localCashBalancePresenter.service;
                        EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements selectedStateUiElements = ((EditDistributionConfiguration.DestinationUiConfiguration) editDistributionConfiguration.initialDestinationStates.get(editDistributionConfiguration.initiallySelectedDestinationIndex)).selectedStateUiElements;
                        if ((selectedStateUiElements != null ? selectedStateUiElements.backButtonBehavior : null) == EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.BackButtonBehavior.DISMISS_ON_ERROR) {
                            screenNavigator.goTo(Back.INSTANCE);
                        }
                    }
                    screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, str, str, 6));
                    z = false;
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) localCashBalancePresenter.sessionManager;
                    EditDistributionScreen editDistributionScreen = (EditDistributionScreen) localCashBalancePresenter.syncer;
                    ResponseContext responseContext = ((SubmitSetPaycheckAllocationAmountResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(blockersDataNavigator.getNext(editDistributionScreen, blockersData.updateFromResponseContext(responseContext, false)));
                }
                return Boolean.valueOf(z);
            }
        }
        editDistributionPresenter$submitAllocationUpdates$1 = new EditDistributionPresenter$submitAllocationUpdates$1(localCashBalancePresenter, continuationImpl);
        Object obj2 = editDistributionPresenter$submitAllocationUpdates$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = editDistributionPresenter$submitAllocationUpdates$1.label;
        boolean z2 = true;
        String str3 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Boolean.valueOf(z2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r6 == r8) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0046, code lost:
    
        if (r6 == r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$toRatePlanButtonTreatment(LocalCashBalancePresenter localCashBalancePresenter, RealAccountRatePlanManager realAccountRatePlanManager, ContinuationImpl continuationImpl) {
        ProfilePersonalPresenter$toRatePlanButtonTreatment$1 profilePersonalPresenter$toRatePlanButtonTreatment$1;
        Object obj;
        int i;
        AndroidStringManager androidStringManager = (AndroidStringManager) localCashBalancePresenter.stringManager;
        if (continuationImpl instanceof ProfilePersonalPresenter$toRatePlanButtonTreatment$1) {
            profilePersonalPresenter$toRatePlanButtonTreatment$1 = (ProfilePersonalPresenter$toRatePlanButtonTreatment$1) continuationImpl;
            int i2 = profilePersonalPresenter$toRatePlanButtonTreatment$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                profilePersonalPresenter$toRatePlanButtonTreatment$1.label = i2 - PKIFailureInfo.systemUnavail;
                obj = profilePersonalPresenter$toRatePlanButtonTreatment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = profilePersonalPresenter$toRatePlanButtonTreatment$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    profilePersonalPresenter$toRatePlanButtonTreatment$1.L$0 = realAccountRatePlanManager;
                    profilePersonalPresenter$toRatePlanButtonTreatment$1.label = 1;
                    obj = realAccountRatePlanManager.canDowngrade(profilePersonalPresenter$toRatePlanButtonTreatment$1);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return ((Boolean) obj).booleanValue() ? new RatePlanButtonTreatment.Upgrade(androidStringManager.get(R.string.profile_pro_upgrade)) : RatePlanButtonTreatment.Omit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    realAccountRatePlanManager = profilePersonalPresenter$toRatePlanButtonTreatment$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return new RatePlanButtonTreatment.Downgrade(androidStringManager.get(R.string.profile_pro_downgrade));
                }
                profilePersonalPresenter$toRatePlanButtonTreatment$1.L$0 = null;
                profilePersonalPresenter$toRatePlanButtonTreatment$1.label = 2;
                obj = realAccountRatePlanManager.canUpgrade(profilePersonalPresenter$toRatePlanButtonTreatment$1);
            }
        }
        profilePersonalPresenter$toRatePlanButtonTreatment$1 = new ProfilePersonalPresenter$toRatePlanButtonTreatment$1(localCashBalancePresenter, continuationImpl);
        obj = profilePersonalPresenter$toRatePlanButtonTreatment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = profilePersonalPresenter$toRatePlanButtonTreatment$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    public static SheetAppMessageModel.CtaButton asViewModel(AppMessageAction appMessageAction) {
        String str = appMessageAction.text;
        if (str == null) {
            Handlers$$ExternalSyntheticBUOutline0.m(appMessageAction, "missing action text in ");
            return null;
        }
        Color color = appMessageAction.text_color;
        if (color == null) {
            Handlers$$ExternalSyntheticBUOutline0.m(appMessageAction, "missing action color in ");
            return null;
        }
        String str2 = appMessageAction.url_to_open;
        if (str2 != null) {
            return new SheetAppMessageModel.CtaButton(color, str, str2);
        }
        Handlers$$ExternalSyntheticBUOutline0.m(appMessageAction, "missing url_to_open in ");
        return null;
    }

    private final Object models$com$squareup$cash$p2pblocking$presenters$P2PListPresenter(Flow flow, Composer composer, int i) {
        Object obj = this.timestampFormatter;
        P2PListController p2PListController = (P2PListController) obj;
        P2PListScreen p2PListScreen = (P2PListScreen) this.service;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1163386850);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new InviteErrorPresenter$models$1$1(this, continuation, 13);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            MoneyTabPresenter$models$lambda$31$$inlined$map$1 moneyTabPresenter$models$lambda$31$$inlined$map$1 = new MoneyTabPresenter$models$lambda$31$$inlined$map$1(((RealCustomerStore) this.syncer).getCustomerForId(p2PListScreen.forCustomerToken), 20);
            gapComposer.updateRememberedValue(moneyTabPresenter$models$lambda$31$$inlined$map$1);
            rememberedValue2 = moneyTabPresenter$models$lambda$31$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, null, null, gapComposer, 48, 2);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = p2PListController.getListData();
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue3, null, null, gapComposer, 48, 2);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue4;
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState mutableState = (MutableState) rememberedValue5;
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = ((RealFamilyAccountsManager) this.launcher).isSponsored();
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState3 = Updater.collectAsState((StateFlow) rememberedValue6, Boolean.FALSE, null, gapComposer, 48, 2);
        Object rememberedValue7 = gapComposer.rememberedValue();
        if (rememberedValue7 == neverEqualPolicy) {
            rememberedValue7 = ((RealFamilyProfileManager) this.sessionManager).familyProfile;
            gapComposer.updateRememberedValue(rememberedValue7);
        }
        MutableState collectAsState4 = Updater.collectAsState((StateFlow) rememberedValue7, null, gapComposer, 1);
        boolean changed = gapComposer.changed((FamilyProfile) collectAsState4.getValue());
        Object rememberedValue8 = gapComposer.rememberedValue();
        if (changed || rememberedValue8 == neverEqualPolicy) {
            rememberedValue8 = Boolean.valueOf(((FamilyProfile) collectAsState4.getValue()) instanceof FamilyProfile.ManagedAccount);
            gapComposer.updateRememberedValue(rememberedValue8);
        }
        boolean booleanValue = ((Boolean) rememberedValue8).booleanValue();
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue9 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue9 == neverEqualPolicy) {
            rememberedValue9 = new OverlayKt$Overlay$1$1$1$1$1(this, continuation, 8);
            gapComposer.updateRememberedValue(rememberedValue9);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue9);
        Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, this, mutableState, coroutineScope, collectAsState, collectAsState2, 15));
        P2PScreenMode p2PScreenMode = p2PListScreen.screenMode;
        P2PScreenMode.AllowList allowList = p2PScreenMode instanceof P2PScreenMode.AllowList ? (P2PScreenMode.AllowList) p2PScreenMode : null;
        Integer num = allowList != null ? allowList.limit : null;
        String toolbarTitle = p2PListController.getToolbarTitle();
        P2PListData p2PListData = (P2PListData) collectAsState2.getValue();
        ArrayList transformToRowModels = p2PListData != null ? ((P2PListController) obj).transformToRowModels(p2PListData, p2PListScreen.forCustomerToken, (String) this.clock, (String) collectAsState.getValue(), ((Boolean) collectAsState3.getValue()).booleanValue(), booleanValue, num, p2PListScreen.context) : null;
        Integer num2 = num;
        P2PListEmptyState emptyState = p2PListController.getEmptyState((String) collectAsState.getValue(), ((Boolean) collectAsState3.getValue()).booleanValue(), (FamilyProfile) collectAsState4.getValue(), p2PListScreen.context);
        P2PListData p2PListData2 = (P2PListData) collectAsState2.getValue();
        P2PListData.BlockListData blockListData = p2PListData2 instanceof P2PListData.BlockListData ? (P2PListData.BlockListData) p2PListData2 : null;
        P2PListViewModel p2PListViewModel = new P2PListViewModel(toolbarTitle, transformToRowModels, emptyState, blockListData != null ? blockListData.supportPageUrl : null, ((AndroidStringManager) this.stringManager).get(R.string.block_list_help_button_accessibility_label), (P2PFailureDialogModel) mutableState.getValue(), p2PListController.getButtonValues(((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) this.store)).peekCurrentValue(LaunchDarklyFeatureFlags$SponsorDrivenBlockingPhase_2C.INSTANCE)).enabled(), ((Boolean) collectAsState3.getValue()).booleanValue(), booleanValue, num2), p2PListController.getFooter((String) collectAsState.getValue(), ((Boolean) collectAsState3.getValue()).booleanValue(), booleanValue, num2));
        gapComposer.end(false);
        return p2PListViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x02c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0278  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$paychecks$presenters$EditDistributionPresenter(Flow flow, Composer composer, int i) {
        ColorTheme colorTheme;
        boolean z;
        EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.ConfigurationRow configurationRow;
        EditDistributionViewModel.Content.Configuration configuration;
        EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button button;
        EditDistributionViewModel.Content.Action action;
        BottomSheet bottomSheet;
        boolean changedInstance;
        Object rememberedValue;
        EditDistributionViewModel content;
        boolean z2;
        Object obj;
        Lazy lazy = (Lazy) this.clock;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-308420154);
        EditDistributionConfiguration editDistributionConfiguration = (EditDistributionConfiguration) this.service;
        ArrayList arrayList = editDistributionConfiguration.initialDestinationStates;
        int i2 = editDistributionConfiguration.initiallySelectedDestinationIndex;
        Object obj2 = (EditDistributionConfiguration.DestinationUiConfiguration) arrayList.get(i2);
        Object[] objArr = new Object[0];
        boolean changedInstance2 = gapComposer.changedInstance(obj2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Object obj3 = Composer.Companion.Empty;
        if (changedInstance2 || rememberedValue2 == obj3) {
            rememberedValue2 = new MoneyTabUIKt$$ExternalSyntheticLambda5(obj2, 20);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Object obj4 = (MutableFloatState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 0);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == obj3) {
            rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState = (MutableState) rememberedValue3;
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == obj3) {
            rememberedValue4 = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        MutableState mutableState2 = (MutableState) rememberedValue4;
        boolean changedInstance3 = gapComposer.changedInstance(this) | gapComposer.changedInstance(obj2) | gapComposer.changed(obj4);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (changedInstance3 || rememberedValue5 == obj3) {
            rememberedValue5 = new HelpSheetView$$ExternalSyntheticLambda0(14, this, obj2, obj4);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Function2 function2 = (Function2) rememberedValue5;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (changed || rememberedValue6 == obj3) {
            rememberedValue6 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, 8);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue6, gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new DbSessionManager$updateDb$2(flow, null, this, obj2, obj4, mutableState, mutableState2, 17));
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            gapComposer.startReplaceGroup(-1204286169);
            gapComposer.end(false);
            content = EditDistributionViewModel.Loading.INSTANCE;
            z2 = false;
        } else {
            gapComposer.startReplaceGroup(-1204258114);
            float floatValue = ((ParcelableSnapshotMutableFloatState) obj4).getFloatValue();
            boolean booleanValue = ((Boolean) mutableState2.getValue()).booleanValue();
            EditDistributionScreen editDistributionScreen = (EditDistributionScreen) this.syncer;
            boolean z3 = floatValue == RecyclerView.DECELERATION_RATE;
            gapComposer.startReplaceGroup(-589943631);
            EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration = (EditDistributionConfiguration.DestinationUiConfiguration) editDistributionConfiguration.initialDestinationStates.get(i2);
            EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements requireSelectedStateUiElements = ArcadeThemeKt.requireSelectedStateUiElements(destinationUiConfiguration);
            com.squareup.cash.paychecks.backend.api.model.AllocationDestination allocationDestination = destinationUiConfiguration.destination;
            allocationDestination.getClass();
            if (allocationDestination instanceof AllocationDestination.BitcoinDestination) {
                colorTheme = ColorTheme.BITCOIN;
            } else if (allocationDestination instanceof AllocationDestination.InvestingDestination) {
                colorTheme = ColorTheme.INVESTING;
            } else {
                if (!(allocationDestination instanceof AllocationDestination.CashBalanceDestination) && !(allocationDestination instanceof AllocationDestination.SavingsDestination)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                colorTheme = ColorTheme.DEFAULT;
            }
            ColorTheme colorTheme2 = colorTheme;
            String str = requireSelectedStateUiElements.header;
            BottomSheet bottomSheet2 = requireSelectedStateUiElements.explanation;
            EditDistributionViewModel.Content.NavigationButton navigationButton = editDistributionScreen.question != null ? EditDistributionViewModel.Content.NavigationButton.BACK : EditDistributionViewModel.Content.NavigationButton.CLOSE;
            List access$allocationsSortedForWheel = ImageResources_androidKt.access$allocationsSortedForWheel(editDistributionConfiguration);
            Money money = editDistributionConfiguration.averageMonthlyPaycheck;
            NumberFormat numberFormat = (NumberFormat) lazy.getValue();
            numberFormat.getClass();
            DistributionWheelViewModel access$toDistributionWheelViewModel = ImageResources_androidKt.access$toDistributionWheelViewModel(access$allocationsSortedForWheel, destinationUiConfiguration, floatValue, true, money, androidStringManager, numberFormat, (MoneyFormatter) this.screen);
            List list = requireSelectedStateUiElements.atmPickerOptionsInBasisPoints;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                float longValue = ((Number) it.next()).longValue() / 10000.0f;
                String format2 = ((NumberFormat) lazy.getValue()).format(Float.valueOf(longValue));
                format2.getClass();
                boolean z4 = longValue == floatValue;
                String str2 = requireSelectedStateUiElements.atmOptionAccessibilityHintTemplate;
                arrayList2.add(new EditDistributionViewModel.Content.AtmPickerOption.Percentage(longValue, format2, format2, str2 != null ? String.format(str2, Arrays.copyOf(new Object[]{((NumberFormat) ((Lazy) this.timestampFormatter).getValue()).format(Float.valueOf(100.0f * longValue))}, 1)) : null, z4));
            }
            if (floatValue != RecyclerView.DECELERATION_RATE) {
                Iterator it2 = arrayList2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    if (((EditDistributionViewModel.Content.AtmPickerOption) obj).isSelected()) {
                        break;
                    }
                }
                if (obj == null) {
                    z = true;
                    ArrayList plus = CollectionsKt.plus((Collection) arrayList2, (Object) new EditDistributionViewModel.Content.AtmPickerOption.CustomValue(androidStringManager.get(R.string.edit_distribution_custom_value_button_accessibility_label), requireSelectedStateUiElements.customAmountAccessibilityHint, z));
                    configurationRow = requireSelectedStateUiElements.configurationRow;
                    if (configurationRow == null) {
                        String str3 = configurationRow.accessibilityLabel;
                        String str4 = configurationRow.actionLabel;
                        String concat = str3 != null ? str3.concat(" ") : null;
                        String m = Recorder$$ExternalSyntheticOutline2.m(configurationRow.title, " ", configurationRow.subtitle);
                        Image image = configurationRow.image;
                        String str5 = configurationRow.title;
                        String str6 = configurationRow.subtitle;
                        EditDistributionViewModel.Content.Action action2 = new EditDistributionViewModel.Content.Action(str4, EditDistributionViewEvent.EditConfiguration.INSTANCE, true);
                        if (concat == null) {
                            concat = "";
                        }
                        String str7 = configurationRow.accessibilityValue;
                        if (str7 != null) {
                            m = str7;
                        }
                        String concat2 = concat.concat(m);
                        String str8 = configurationRow.accessibilityHint;
                        configuration = new EditDistributionViewModel.Content.Configuration(image, str5, str6, action2, concat2, str8 == null ? str4 : str8);
                    } else {
                        configuration = null;
                    }
                    button = requireSelectedStateUiElements.secondaryButton;
                    if (button != null) {
                        if (!z3) {
                            button = null;
                        }
                        if (button != null) {
                            action = toAction(button, true);
                            EditDistributionViewModel.Content.Action action3 = action;
                            EditDistributionViewModel.Content.InfoButton infoButton = bottomSheet2 != null ? new EditDistributionViewModel.Content.InfoButton() : null;
                            if (booleanValue) {
                                bottomSheet2.getClass();
                                bottomSheet = bottomSheet2;
                            } else {
                                bottomSheet = null;
                            }
                            changedInstance = gapComposer.changedInstance(editDistributionConfiguration) | gapComposer.changedInstance(this);
                            rememberedValue = gapComposer.rememberedValue();
                            if (!changedInstance || rememberedValue == obj3) {
                                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda11(29, editDistributionConfiguration, this);
                                gapComposer.updateRememberedValue(rememberedValue);
                            }
                            content = new EditDistributionViewModel.Content(str, navigationButton, access$toDistributionWheelViewModel, plus, configuration, action3, colorTheme2, infoButton, bottomSheet, (Function3) rememberedValue);
                            z2 = false;
                            gapComposer.end(false);
                            gapComposer.end(false);
                        }
                    }
                    action = toAction(requireSelectedStateUiElements.primaryButton, editDistributionScreen.shouldDisableCtaOnZeroAllocation || !z3);
                    EditDistributionViewModel.Content.Action action32 = action;
                    if (bottomSheet2 != null) {
                    }
                    if (booleanValue) {
                    }
                    changedInstance = gapComposer.changedInstance(editDistributionConfiguration) | gapComposer.changedInstance(this);
                    rememberedValue = gapComposer.rememberedValue();
                    if (!changedInstance) {
                    }
                    rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda11(29, editDistributionConfiguration, this);
                    gapComposer.updateRememberedValue(rememberedValue);
                    content = new EditDistributionViewModel.Content(str, navigationButton, access$toDistributionWheelViewModel, plus, configuration, action32, colorTheme2, infoButton, bottomSheet, (Function3) rememberedValue);
                    z2 = false;
                    gapComposer.end(false);
                    gapComposer.end(false);
                }
            }
            z = false;
            ArrayList plus2 = CollectionsKt.plus((Collection) arrayList2, (Object) new EditDistributionViewModel.Content.AtmPickerOption.CustomValue(androidStringManager.get(R.string.edit_distribution_custom_value_button_accessibility_label), requireSelectedStateUiElements.customAmountAccessibilityHint, z));
            configurationRow = requireSelectedStateUiElements.configurationRow;
            if (configurationRow == null) {
            }
            button = requireSelectedStateUiElements.secondaryButton;
            if (button != null) {
            }
            action = toAction(requireSelectedStateUiElements.primaryButton, editDistributionScreen.shouldDisableCtaOnZeroAllocation || !z3);
            EditDistributionViewModel.Content.Action action322 = action;
            if (bottomSheet2 != null) {
            }
            if (booleanValue) {
            }
            changedInstance = gapComposer.changedInstance(editDistributionConfiguration) | gapComposer.changedInstance(this);
            rememberedValue = gapComposer.rememberedValue();
            if (!changedInstance) {
            }
            rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda11(29, editDistributionConfiguration, this);
            gapComposer.updateRememberedValue(rememberedValue);
            content = new EditDistributionViewModel.Content(str, navigationButton, access$toDistributionWheelViewModel, plus2, configuration, action322, colorTheme2, infoButton, bottomSheet, (Function3) rememberedValue);
            z2 = false;
            gapComposer.end(false);
            gapComposer.end(false);
        }
        gapComposer.end(z2);
        return content;
    }

    public void confirmValidAllocation(EditDistributionConfiguration.DestinationUiConfiguration destinationUiConfiguration, float f, Function1 function1) {
        float forceToWholePercentage = UtilsKt.forceToWholePercentage(f);
        EditDistributionConfiguration editDistributionConfiguration = (EditDistributionConfiguration) this.service;
        if (forceToWholePercentage <= ImageResources_androidKt.maxAllocationFor(destinationUiConfiguration, editDistributionConfiguration.initialDestinationStates)) {
            function1.invoke(Float.valueOf(forceToWholePercentage));
            return;
        }
        Analytics analytics = (Analytics) this.analytics;
        int basisPoints = (int) UtilsKt.getBasisPoints(forceToWholePercentage);
        analytics.track(new PaychecksManageDistributionSetAllocationAmountWarnForOverallocation(((BlockersData) this.store).flowToken, Integer.valueOf(basisPoints), UtilsKt.toDestinationType(destinationUiConfiguration.destination)), null);
        ((BetterNavigator.ScreenNavigator) this.navigator).goTo(new OverallocationAlertDialogScreen(editDistributionConfiguration.exceededMaxDistributionAlertUi));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.screen;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.clock;
    }

    /* JADX WARN: Code restructure failed: missing block: B:281:0x072c, code lost:
    
        if (((com.squareup.cash.investing.primitives.InvestingState.Content) r0).dividendState == com.squareup.cash.investing.primitives.InvestingState.Content.DividendState.AUTO_REINVEST) goto L252;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0348 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:325:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:352:0x093e  */
    /* JADX WARN: Removed duplicated region for block: B:452:0x0c7a  */
    /* JADX WARN: Removed duplicated region for block: B:455:0x0c8f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x032c  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        String str;
        Object obj;
        Continuation continuation;
        Object obj2;
        String str2;
        LocalCashBalanceViewModel.Activity activity;
        char c;
        String str3;
        String str4;
        LocalButton localButton;
        SheetAppMessageModel sheetAppMessageModel;
        SheetAppMessageModel.CtaButton ctaButton;
        AppMessageAction appMessageAction;
        SheetAppMessageModel.ShareSheet shareSheet;
        DetailsPage access$getDetailsPage;
        Continuation continuation2;
        Investing_settings investing_settings;
        Investing_settings investing_settings2;
        String str5;
        String str6;
        Object obj3;
        Object obj4;
        Object obj5;
        GapComposer gapComposer;
        Loadable loadable;
        MutableState mutableState;
        Continuation continuation3;
        OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel;
        OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel2;
        FormattedDetailViewModel.Text text;
        String str7;
        StyledText styledText;
        RowSection rowSection;
        RowSection.OfferRow offerRow;
        Object obj6;
        int i2 = this.$r8$classId;
        int i3 = 9;
        int i4 = 25;
        Object obj7 = this.syncer;
        Object obj8 = this.sessionManager;
        Object obj9 = this.timestampFormatter;
        int i5 = 27;
        str = "";
        Object obj10 = this.screen;
        Object obj11 = this.clock;
        Object obj12 = this.store;
        Object obj13 = this.stringManager;
        Object obj14 = Composer.Companion.Empty;
        int i6 = 1;
        switch (i2) {
            case 0:
                AssetPublicSuffixList assetPublicSuffixList = (AssetPublicSuffixList) obj9;
                AndroidClock androidClock = (AndroidClock) obj11;
                LocalInstalledStore localInstalledStore = (LocalInstalledStore) obj12;
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(982708924);
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer2.changedInstance(this);
                Object rememberedValue = gapComposer2.rememberedValue();
                Object obj15 = rememberedValue;
                if (changedInstance || rememberedValue == obj14) {
                    Object realBadger2$clear$2 = new RealBadger2$clear$2(this, null, 26);
                    gapComposer2.updateRememberedValue(realBadger2$clear$2);
                    obj15 = realBadger2$clear$2;
                }
                Updater.LaunchedEffect(gapComposer2, unit, (Function2) obj15);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                Object obj16 = rememberedValue2;
                if (rememberedValue2 == obj14) {
                    Object mutableStateOf$default = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer2.updateRememberedValue(mutableStateOf$default);
                    obj16 = mutableStateOf$default;
                }
                MutableState mutableState2 = (MutableState) obj16;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == obj14) {
                    RealLocalInstalledStore realLocalInstalledStore = (RealLocalInstalledStore) localInstalledStore;
                    LocalTabContentQueries localTabContentQueries = realLocalInstalledStore.cashDetailContentQueries;
                    localTabContentQueries.getClass();
                    int i7 = LocalCashDetailContentQueries$selectContent$2.$r8$clinit;
                    SqlDriver sqlDriver = localTabContentQueries.driver;
                    LocalCashDetailContentQueries$$ExternalSyntheticLambda0 localCashDetailContentQueries$$ExternalSyntheticLambda0 = new LocalCashDetailContentQueries$$ExternalSyntheticLambda0(localTabContentQueries, i6);
                    sqlDriver.getClass();
                    Object realCustomerStore$getCustomerForId$$inlined$map$1 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(961574810, new String[]{"local_cash_detail_content"}, sqlDriver, "localCashDetailContent.sq", "selectContent", "SELECT content\nFROM local_cash_detail_content", localCashDetailContentQueries$$ExternalSyntheticLambda0)), realLocalInstalledStore.ioDispatcher), 3);
                    gapComposer2.updateRememberedValue(realCustomerStore$getCustomerForId$$inlined$map$1);
                    rememberedValue3 = realCustomerStore$getCustomerForId$$inlined$map$1;
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer2, 48, 2);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                Object obj17 = rememberedValue4;
                if (rememberedValue4 == obj14) {
                    Object selectLocalCashActivity = ((RealLocalInstalledStore) localInstalledStore).selectLocalCashActivity();
                    gapComposer2.updateRememberedValue(selectLocalCashActivity);
                    obj17 = selectLocalCashActivity;
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) obj17, null, null, gapComposer2, 48, 2);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Object obj18 = rememberedValue5;
                if (rememberedValue5 == obj14) {
                    Object allValues = ((RealLocalInstalledStore) localInstalledStore).syncValueReader.getAllValues(AndroidSyncValueSpecs.LocalEarningCard);
                    gapComposer2.updateRememberedValue(allValues);
                    obj18 = allValues;
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) obj18, EmptyList.INSTANCE, null, gapComposer2, 48, 2);
                Object rememberedValue6 = gapComposer2.rememberedValue();
                Object obj19 = rememberedValue6;
                if (rememberedValue6 == obj14) {
                    obj19 = Recorder$$ExternalSyntheticOutline1.m(((LocalCashBalanceScreen) obj10).openCardManagementSheet, gapComposer2);
                }
                MutableState mutableState3 = (MutableState) obj19;
                boolean changedInstance2 = gapComposer2.changedInstance(this);
                Object rememberedValue7 = gapComposer2.rememberedValue();
                int i8 = 6;
                Object obj20 = rememberedValue7;
                if (changedInstance2 || rememberedValue7 == obj14) {
                    Object statusRunnable$$ExternalSyntheticLambda1 = new StatusRunnable$$ExternalSyntheticLambda1(i8, this, mutableState3);
                    gapComposer2.updateRememberedValue(statusRunnable$$ExternalSyntheticLambda1);
                    obj20 = statusRunnable$$ExternalSyntheticLambda1;
                }
                RenavigationKt.RenavigationHandler(this, (Function0) obj20, gapComposer2, (i >> 3) & 14);
                Object rememberedValue8 = gapComposer2.rememberedValue();
                if (rememberedValue8 == obj14) {
                    Object derivedStateOf = Updater.derivedStateOf(new n$$ExternalSyntheticLambda1(10, this, collectAsState3, mutableState2));
                    gapComposer2.updateRememberedValue(derivedStateOf);
                    obj = derivedStateOf;
                } else {
                    obj = rememberedValue8;
                }
                State state = (State) obj;
                Object rememberedValue9 = gapComposer2.rememberedValue();
                Object obj21 = rememberedValue9;
                if (rememberedValue9 == obj14) {
                    RealLocalInstalledStore realLocalInstalledStore2 = (RealLocalInstalledStore) localInstalledStore;
                    LocalTabContentQueries localTabContentQueries2 = realLocalInstalledStore2.cashDetailContentQueries;
                    localTabContentQueries2.getClass();
                    int i9 = LocalCashDetailContentQueries$selectHowItWorks$2.$r8$clinit;
                    SqlDriver sqlDriver2 = localTabContentQueries2.driver;
                    LocalCashDetailContentQueries$$ExternalSyntheticLambda0 localCashDetailContentQueries$$ExternalSyntheticLambda02 = new LocalCashDetailContentQueries$$ExternalSyntheticLambda0(localTabContentQueries2, 2);
                    sqlDriver2.getClass();
                    Object realCustomerStore$getCustomerForId$$inlined$map$12 = new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new SimpleQuery(1561331686, new String[]{"local_cash_detail_content"}, sqlDriver2, "localCashDetailContent.sq", "selectHowItWorks", "SELECT how_it_works\nFROM local_cash_detail_content", localCashDetailContentQueries$$ExternalSyntheticLambda02)), realLocalInstalledStore2.ioDispatcher), 2);
                    gapComposer2.updateRememberedValue(realCustomerStore$getCustomerForId$$inlined$map$12);
                    obj21 = realCustomerStore$getCustomerForId$$inlined$map$12;
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) obj21, null, null, gapComposer2, 48, 2);
                Object rememberedValue10 = gapComposer2.rememberedValue();
                if (rememberedValue10 == obj14) {
                    Object realLocalInstalledStore$hideBrands$$inlined$map$1 = new RealLocalInstalledStore$hideBrands$$inlined$map$1(((RealLocalInstalledStore) localInstalledStore).syncValueReader.getSingleValue(AndroidSyncValueSpecs.LocalCashBalance), 6);
                    gapComposer2.updateRememberedValue(realLocalInstalledStore$hideBrands$$inlined$map$1);
                    rememberedValue10 = realLocalInstalledStore$hideBrands$$inlined$map$1;
                }
                MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue10, null, null, gapComposer2, 48, 2);
                LocalCashBalance localCashBalance = (LocalCashBalance) collectAsState5.getValue();
                boolean changed = gapComposer2.changed(collectAsState5) | gapComposer2.changedInstance(this);
                Object rememberedValue11 = gapComposer2.rememberedValue();
                if (changed || rememberedValue11 == obj14) {
                    continuation = null;
                    Object realBadger2$clear$22 = new RealBadger2$clear$2(this, collectAsState5, continuation, 27);
                    gapComposer2.updateRememberedValue(realBadger2$clear$22);
                    obj2 = realBadger2$clear$22;
                } else {
                    continuation = null;
                    obj2 = rememberedValue11;
                }
                Updater.LaunchedEffect(gapComposer2, localCashBalance, (Function2) obj2);
                Object obj22 = continuation;
                Updater.LaunchedEffect(gapComposer2, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, this, collectAsState, mutableState3, mutableState2, 6));
                LocalCashBalance localCashBalance2 = (LocalCashBalance) collectAsState5.getValue();
                if (localCashBalance2 != null) {
                    LocalCurrencyCode localCurrencyCode = LocalCurrencyCode.USD;
                    str2 = LocalsKt.format(localCashBalance2);
                } else {
                    str2 = obj22;
                }
                LocalCashInformationalContent localCashInformationalContent = (LocalCashInformationalContent) collectAsState.getValue();
                String str8 = localCashInformationalContent != null ? localCashInformationalContent.header : obj22;
                LocalCashInformationalContent localCashInformationalContent2 = (LocalCashInformationalContent) collectAsState.getValue();
                String str9 = (localCashInformationalContent2 == null || (localButton = localCashInformationalContent2.button) == null) ? obj22 : localButton.text;
                GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks) collectAsState4.getValue();
                CardManagementSheetModel cardManagementSheetModel = ((Boolean) mutableState3.getValue()).booleanValue() ? (CardManagementSheetModel) state.getValue() : obj22;
                LocalCashActivity localCashActivity = (LocalCashActivity) collectAsState2.getValue();
                if (localCashActivity != null) {
                    List list = localCashActivity.rows;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj23 : list) {
                        if (((LocalCashActivity.Row) obj23).label != null) {
                            arrayList.add(obj23);
                        }
                    }
                    String str10 = localCashActivity.header;
                    str = str10 != null ? str10 : "";
                    boolean z = ((CardManagementSheetModel) state.getValue()) != null;
                    boolean z2 = arrayList.size() > 4;
                    List take = CollectionsKt.take(arrayList, 4);
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(take, 10));
                    Iterator it = take.iterator();
                    while (it.hasNext()) {
                        LocalCashActivity.Row row = (LocalCashActivity.Row) it.next();
                        Long l = row.transacted_at;
                        Object ofEpochMilli = l != null ? Instant.ofEpochMilli(l.longValue()) : obj22;
                        Long l2 = row.expires_at;
                        Instant ofEpochMilli2 = l2 != null ? Instant.ofEpochMilli(l2.longValue()) : obj22;
                        ZoneId zoneId = androidClock.timeZone().toZoneId();
                        Instant now = DimensionKt.now(androidClock);
                        boolean isBefore = ofEpochMilli2 != 0 ? ofEpochMilli2.isBefore(now) : false;
                        LocalImage localImage = row.image;
                        LocalColor localColor = row.background_color;
                        Iterator it2 = it;
                        String str11 = row.label;
                        str11.getClass();
                        String str12 = row.description;
                        Instant instant = ofEpochMilli;
                        if (ofEpochMilli != null) {
                            if (isBefore) {
                                instant = obj22;
                            }
                            if (instant != 0) {
                                c = '\n';
                                str3 = AssetPublicSuffixList.formatDate$default(assetPublicSuffixList, instant, 10);
                                if (ofEpochMilli2 == 0) {
                                    zoneId.getClass();
                                    ZonedDateTime atZone = now.atZone(zoneId);
                                    atZone.getClass();
                                    str4 = DateTimesKt.formatExpirationDate(ofEpochMilli2, (AndroidStringManager) obj13, assetPublicSuffixList, zoneId, atZone);
                                } else {
                                    str4 = obj22;
                                }
                                arrayList2.add(new LocalCashBalanceViewModel.Activity.Row(localImage, str11, str12, str3, str4, row.value, localColor, row.client_route));
                                it = it2;
                            }
                        }
                        c = '\n';
                        str3 = obj22;
                        if (ofEpochMilli2 == 0) {
                        }
                        arrayList2.add(new LocalCashBalanceViewModel.Activity.Row(localImage, str11, str12, str3, str4, row.value, localColor, row.client_route));
                        it = it2;
                    }
                    activity = new LocalCashBalanceViewModel.Activity(str, arrayList2, z, z2);
                } else {
                    activity = obj22;
                }
                LocalCashBalanceViewModel localCashBalanceViewModel = new LocalCashBalanceViewModel(str2, str8, str9, howItWorks, activity, cardManagementSheetModel);
                gapComposer2.end(false);
                return localCashBalanceViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(592298507);
                Object rememberedValue12 = gapComposer3.rememberedValue();
                Continuation continuation4 = null;
                if (rememberedValue12 == obj14) {
                    rememberedValue12 = Updater.mutableStateOf$default(null);
                    gapComposer3.updateRememberedValue(rememberedValue12);
                }
                MutableState mutableState4 = (MutableState) rememberedValue12;
                Object rememberedValue13 = gapComposer3.rememberedValue();
                if (rememberedValue13 == obj14) {
                    rememberedValue13 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer3);
                    gapComposer3.updateRememberedValue(rememberedValue13);
                }
                CoroutineScope coroutineScope = (CoroutineScope) rememberedValue13;
                boolean changedInstance3 = gapComposer3.changedInstance(this);
                Object rememberedValue14 = gapComposer3.rememberedValue();
                if (changedInstance3 || rememberedValue14 == obj14) {
                    rememberedValue14 = new ToastKt$Toast$9$1(this, mutableState4, null);
                    gapComposer3.updateRememberedValue(rememberedValue14);
                }
                Updater.LaunchedEffect(gapComposer3, this, (Function2) rememberedValue14);
                Flow flow2 = (Flow) obj13;
                Updater.LaunchedEffect(gapComposer3, flow2, new BenefitsHubPresenter$models$1$1(9, mutableState4, flow2, this, continuation4));
                Updater.LaunchedEffect(gapComposer3, flow, new AndroidSecureStore$read$2(flow, (Continuation) null, coroutineScope, this, mutableState4, 2));
                SheetMessage sheetMessage = (SheetMessage) mutableState4.getValue();
                if (sheetMessage != null) {
                    HalfSheetMessage halfSheetMessage = sheetMessage.message_format;
                    HalfSheetMessage$VisualAsset$Image halfSheetMessage$VisualAsset$Image = halfSheetMessage.visualAsset;
                    zzjr zzjrVar = halfSheetMessage.secondaryNavigationAction;
                    com.squareup.protos.cash.messagingplatformcommon.app.Image image = halfSheetMessage$VisualAsset$Image != null ? halfSheetMessage$VisualAsset$Image.value : null;
                    if (image != null) {
                        String str13 = halfSheetMessage.message_title;
                        if (str13 != null) {
                            String str14 = halfSheetMessage.message_subtitle;
                            Color color = halfSheetMessage.gradient_color;
                            if (color != null) {
                                if (zzjrVar != null) {
                                    HalfSheetMessage$SecondaryNavigationAction$SecondaryButton halfSheetMessage$SecondaryNavigationAction$SecondaryButton = zzjrVar instanceof HalfSheetMessage$SecondaryNavigationAction$SecondaryButton ? (HalfSheetMessage$SecondaryNavigationAction$SecondaryButton) zzjrVar : null;
                                    AppMessageAction appMessageAction2 = halfSheetMessage$SecondaryNavigationAction$SecondaryButton != null ? halfSheetMessage$SecondaryNavigationAction$SecondaryButton.value : null;
                                    if (appMessageAction2 != null) {
                                        ctaButton = asViewModel(appMessageAction2);
                                        appMessageAction = halfSheetMessage.primary_navigation_action;
                                        if (appMessageAction == null) {
                                            SheetAppMessageModel.CtaButton asViewModel = asViewModel(appMessageAction);
                                            String str15 = (zzjrVar == null || (access$getDetailsPage = QuirkSettingsLoader.access$getDetailsPage(zzjrVar)) == null) ? null : access$getDetailsPage.treehouse_path;
                                            ShareSheet shareSheet2 = halfSheetMessage.share_sheet;
                                            if (shareSheet2 != null) {
                                                String str16 = shareSheet2.url;
                                                String str17 = shareSheet2.message;
                                                StringBuilder sb = new StringBuilder();
                                                if (str17 != null && !StringsKt.isBlank(str17)) {
                                                    sb.append(str17);
                                                }
                                                if (str16 != null && !StringsKt.isBlank(str16)) {
                                                    sb.append("\n\n");
                                                    sb.append(str16);
                                                }
                                                shareSheet = new SheetAppMessageModel.ShareSheet(sb.toString());
                                            } else {
                                                shareSheet = null;
                                            }
                                            sheetAppMessageModel = new SheetAppMessageModel.Loaded(image, str13, str14, color, asViewModel, ctaButton, str15, shareSheet, halfSheetMessage.overlay_color_treatment == HalfSheetMessage.OverlayColorTreatment.SOLID, (BetterNavigator.ScreenNavigator) this.navigator);
                                        } else {
                                            Handlers$$ExternalSyntheticBUOutline0.m(halfSheetMessage, "missing primary_navigation_action in ");
                                        }
                                    }
                                }
                                ctaButton = null;
                                appMessageAction = halfSheetMessage.primary_navigation_action;
                                if (appMessageAction == null) {
                                }
                            } else {
                                Handlers$$ExternalSyntheticBUOutline0.m(halfSheetMessage, "missing color in ");
                            }
                        } else {
                            Path$$ExternalSyntheticBUOutline0.m$1(halfSheetMessage, "missing title in ");
                        }
                    } else {
                        Handlers$$ExternalSyntheticBUOutline0.m(halfSheetMessage, "missing image in ");
                    }
                    return null;
                }
                sheetAppMessageModel = SheetAppMessageModel.Loading.INSTANCE;
                gapComposer3.end(false);
                return sheetAppMessageModel;
            case 2:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(-599210900);
                Object rememberedValue15 = gapComposer4.rememberedValue();
                if (rememberedValue15 == obj14) {
                    rememberedValue15 = Updater.mutableStateOf$default(new SelectPaymentInstrumentViewModel(null, EmptyList.INSTANCE, -1));
                    gapComposer4.updateRememberedValue(rememberedValue15);
                }
                MutableState mutableState5 = (MutableState) rememberedValue15;
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance4 = gapComposer4.changedInstance(this);
                Object rememberedValue16 = gapComposer4.rememberedValue();
                if (changedInstance4 || rememberedValue16 == obj14) {
                    continuation2 = null;
                    rememberedValue16 = new CheckStatusPresenter.AnonymousClass1(this, mutableState5, continuation2, 7);
                    gapComposer4.updateRememberedValue(rememberedValue16);
                } else {
                    continuation2 = null;
                }
                Updater.LaunchedEffect(gapComposer4, unit2, (Function2) rememberedValue16);
                Updater.LaunchedEffect(gapComposer4, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation2, this, i4));
                SelectPaymentInstrumentViewModel selectPaymentInstrumentViewModel = (SelectPaymentInstrumentViewModel) mutableState5.getValue();
                gapComposer4.end(false);
                return selectPaymentInstrumentViewModel;
            case 3:
                return models(flow, composer, i);
            case 4:
                boolean z3 = true;
                AndroidStringManager androidStringManager = (AndroidStringManager) obj13;
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(339447766);
                Object rememberedValue17 = gapComposer5.rememberedValue();
                if (rememberedValue17 == obj14) {
                    rememberedValue17 = DBUtil.mapToOneOrNull(DBUtil.toFlow(((CashAccountDatabaseImpl) obj7).investingSettingsQueries.select$2()), (CoroutineContext) obj10);
                    gapComposer5.updateRememberedValue(rememberedValue17);
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue17, null, null, gapComposer5, 48, 2);
                Object rememberedValue18 = gapComposer5.rememberedValue();
                Continuation continuation5 = null;
                if (rememberedValue18 == obj14) {
                    rememberedValue18 = Updater.mutableStateOf$default(null);
                    gapComposer5.updateRememberedValue(rememberedValue18);
                }
                MutableState mutableState6 = (MutableState) rememberedValue18;
                InvestingState investingStates = ((RealInvestingStateManager) obj8).investingStates(gapComposer5);
                if (!investingStates.equals(InvestingState.Loading.INSTANCE)) {
                    if (!(investingStates instanceof InvestingState.Content)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    Boolean bool = (Boolean) mutableState6.getValue();
                    if (bool == null) {
                        break;
                    } else {
                        z3 = bool.booleanValue();
                    }
                    Updater.LaunchedEffect(gapComposer5, flow, new GLThread$start$2(flow, continuation5, this, mutableState6, 20));
                    String str18 = androidStringManager.get(R.string.investing_drip_setting_title);
                    String str19 = androidStringManager.get(R.string.investing_drip_setting_message);
                    String str20 = androidStringManager.get(R.string.investing_drip_setting_cta_label);
                    List listOf = CollectionsKt__CollectionsJVMKt.listOf(new DividendReinvestmentSettingViewModel.Section(CollectionsKt__CollectionsJVMKt.listOf(new DividendReinvestmentSettingViewModel.Entry(androidStringManager.get(R.string.investing_drip_setting_switch_label), androidStringManager.get(R.string.investing_drip_setting_switch_sublabel), z3))));
                    boolean enabled = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj12)).peekCurrentValue(LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText.INSTANCE)).enabled();
                    investing_settings = (Investing_settings) collectAsState6.getValue();
                    if (investing_settings != null && (str6 = investing_settings.disclosures_web_url) != null) {
                        str = str6;
                    }
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.investing_drip_setting_disclosure)).format(new Object[]{str});
                    format2.getClass();
                    DividendReinvestmentSettingViewModel dividendReinvestmentSettingViewModel = new DividendReinvestmentSettingViewModel(str18, str19, str20, (enabled || (investing_settings2 = (Investing_settings) collectAsState6.getValue()) == null || (str5 = investing_settings2.drip_disclosure_text) == null) ? format2 : str5, listOf);
                    gapComposer5.end(false);
                    return dividendReinvestmentSettingViewModel;
                }
                z3 = false;
                Updater.LaunchedEffect(gapComposer5, flow, new GLThread$start$2(flow, continuation5, this, mutableState6, 20));
                String str182 = androidStringManager.get(R.string.investing_drip_setting_title);
                String str192 = androidStringManager.get(R.string.investing_drip_setting_message);
                String str202 = androidStringManager.get(R.string.investing_drip_setting_cta_label);
                List listOf2 = CollectionsKt__CollectionsJVMKt.listOf(new DividendReinvestmentSettingViewModel.Section(CollectionsKt__CollectionsJVMKt.listOf(new DividendReinvestmentSettingViewModel.Entry(androidStringManager.get(R.string.investing_drip_setting_switch_label), androidStringManager.get(R.string.investing_drip_setting_switch_sublabel), z3))));
                boolean enabled2 = ((FeatureFlag$EnabledDisabledUnassignedFeatureFlag$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj12)).peekCurrentValue(LaunchDarklyFeatureFlags$InvestingServerDrivenDisclosureText.INSTANCE)).enabled();
                investing_settings = (Investing_settings) collectAsState6.getValue();
                if (investing_settings != null) {
                    str = str6;
                }
                Resources resources2 = androidStringManager.resources;
                resources2.getClass();
                String format22 = new MessageFormat(resources2.getString(R.string.investing_drip_setting_disclosure)).format(new Object[]{str});
                format22.getClass();
                DividendReinvestmentSettingViewModel dividendReinvestmentSettingViewModel2 = new DividendReinvestmentSettingViewModel(str182, str192, str202, (enabled2 || (investing_settings2 = (Investing_settings) collectAsState6.getValue()) == null || (str5 = investing_settings2.drip_disclosure_text) == null) ? format22 : str5, listOf2);
                gapComposer5.end(false);
                return dividendReinvestmentSettingViewModel2;
            case 5:
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(223454183);
                Object rememberedValue19 = gapComposer6.rememberedValue();
                Object obj24 = rememberedValue19;
                if (rememberedValue19 == obj14) {
                    Object mutableStateOf$default2 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer6.updateRememberedValue(mutableStateOf$default2);
                    obj24 = mutableStateOf$default2;
                }
                MutableState mutableState7 = (MutableState) obj24;
                Object rememberedValue20 = gapComposer6.rememberedValue();
                if (rememberedValue20 == obj14) {
                    GpsConfigQueries gpsConfigQueries = ((CashAccountDatabaseImpl) obj11).localizationConfigQueries;
                    gpsConfigQueries.getClass();
                    int i10 = LocalizationConfigQueries$select$2.$r8$clinit;
                    SqlDriver sqlDriver3 = gpsConfigQueries.driver;
                    TooltipBoxKt$$ExternalSyntheticLambda2 tooltipBoxKt$$ExternalSyntheticLambda2 = new TooltipBoxKt$$ExternalSyntheticLambda2(gpsConfigQueries, (short) 0);
                    sqlDriver3.getClass();
                    Object flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(FlowKt.distinctUntilChanged(new RealAppConfigManager$cashLiteConfig$$inlined$map$1(new FinishSetupTileBadgeCounter(4, DBUtil.toFlow(new SimpleQuery(2092935262, new String[]{"localizationConfig"}, sqlDriver3, "LocalizationConfig.sq", "select", "SELECT config FROM localizationConfig", tooltipBoxKt$$ExternalSyntheticLambda2)), (CoroutineContext) obj12), 10)), new MusicPresenter$models$2$1(this, null, i3), 3);
                    gapComposer6.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
                    rememberedValue20 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
                }
                MutableState collectAsState7 = Updater.collectAsState((Flow) rememberedValue20, null, null, gapComposer6, 48, 2);
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance5 = gapComposer6.changedInstance(this);
                Object rememberedValue21 = gapComposer6.rememberedValue();
                Object obj25 = rememberedValue21;
                if (changedInstance5 || rememberedValue21 == obj14) {
                    Object inviteErrorPresenter$models$1$1 = new InviteErrorPresenter$models$1$1(this, null, 2);
                    gapComposer6.updateRememberedValue(inviteErrorPresenter$models$1$1);
                    obj25 = inviteErrorPresenter$models$1$1;
                }
                Updater.LaunchedEffect(gapComposer6, unit3, (Function2) obj25);
                boolean changed2 = gapComposer6.changed(collectAsState7) | gapComposer6.changedInstance(this);
                Object rememberedValue22 = gapComposer6.rememberedValue();
                Object obj26 = rememberedValue22;
                if (changed2 || rememberedValue22 == obj14) {
                    Object musicPresenter$models$2$1 = new MusicPresenter$models$2$1(this, collectAsState7, null, 8);
                    gapComposer6.updateRememberedValue(musicPresenter$models$2$1);
                    obj26 = musicPresenter$models$2$1;
                }
                Updater.LaunchedEffect(gapComposer6, unit3, (Function2) obj26);
                Updater.LaunchedEffect(gapComposer6, flow, new AnimationsKt$takeUntil$1$1(flow, (Continuation) null, this, mutableState7, collectAsState7, 18));
                if (((Boolean) mutableState7.getValue()).booleanValue() || ((LocalizationConfig.LanguageDisclosure) collectAsState7.getValue()) == null) {
                    obj3 = LanguageDisclosureViewModel.Loading.INSTANCE;
                } else {
                    LocalizationConfig.LanguageDisclosure languageDisclosure = (LocalizationConfig.LanguageDisclosure) collectAsState7.getValue();
                    languageDisclosure.getClass();
                    List list2 = languageDisclosure.localized_disclosure_copy;
                    Iterator it3 = list2.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            obj4 = it3.next();
                            String str21 = ((LocalizationConfig.LocalizedDisclosureCopy) obj4).locale;
                            if (str21 == null) {
                                str21 = "";
                            }
                            Locale forLanguageTag = Locale.forLanguageTag(str21);
                            forLanguageTag.getClass();
                            if (Intrinsics.areEqual(forLanguageTag.getLanguage(), "en")) {
                            }
                        } else {
                            obj4 = null;
                        }
                    }
                    LanguageDisclosureViewModel.Content.Copy viewModel = CryptoObjectUtils.toViewModel((LocalizationConfig.LocalizedDisclosureCopy) obj4);
                    Iterator it4 = list2.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            Object next = it4.next();
                            String str22 = ((LocalizationConfig.LocalizedDisclosureCopy) next).locale;
                            if (str22 == null) {
                                str22 = "";
                            }
                            Locale forLanguageTag2 = Locale.forLanguageTag(str22);
                            forLanguageTag2.getClass();
                            if (BundleKt.isSpanish(forLanguageTag2)) {
                                obj5 = next;
                            }
                        } else {
                            obj5 = null;
                        }
                    }
                    obj3 = new LanguageDisclosureViewModel.Content(viewModel, CryptoObjectUtils.toViewModel((LocalizationConfig.LocalizedDisclosureCopy) obj5), Build.VERSION.SDK_INT >= 33);
                }
                gapComposer6.end(false);
                return obj3;
            case 6:
                Continuation continuation6 = null;
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(872409824);
                Object rememberedValue23 = gapComposer7.rememberedValue();
                if (rememberedValue23 == obj14) {
                    rememberedValue23 = Updater.mutableStateOf$default(null);
                    gapComposer7.updateRememberedValue(rememberedValue23);
                }
                MutableState mutableState8 = (MutableState) rememberedValue23;
                Updater.LaunchedEffect(gapComposer7, flow, new CashMapPresenter$models$3$1(flow, continuation6, this, 11));
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance6 = gapComposer7.changedInstance(this);
                Object rememberedValue24 = gapComposer7.rememberedValue();
                if (changedInstance6 || rememberedValue24 == obj14) {
                    rememberedValue24 = new MusicPresenter$models$2$1(this, mutableState8, continuation6, 10);
                    gapComposer7.updateRememberedValue(rememberedValue24);
                }
                Updater.LaunchedEffect(gapComposer7, unit4, (Function2) rememberedValue24);
                BlockedBusinessesUiConfig blockedBusinessesUiConfig = (BlockedBusinessesUiConfig) mutableState8.getValue();
                BlockedBusinessesUiConfig.ErrorMessage errorMessage = blockedBusinessesUiConfig != null ? blockedBusinessesUiConfig.errorMessage : null;
                boolean changedInstance7 = gapComposer7.changedInstance(this);
                Object rememberedValue25 = gapComposer7.rememberedValue();
                if (changedInstance7 || rememberedValue25 == obj14) {
                    rememberedValue25 = new GenieViewKt$GenieView$1$1(mutableState8, this, null, i3);
                    gapComposer7.updateRememberedValue(rememberedValue25);
                }
                Updater.LaunchedEffect(gapComposer7, errorMessage, (Function2) rememberedValue25);
                BlockedBusinessesUiConfig blockedBusinessesUiConfig2 = (BlockedBusinessesUiConfig) mutableState8.getValue();
                String str23 = ((AndroidStringManager) obj13).get(R.string.merchant_blocking_header);
                if (blockedBusinessesUiConfig2 != null) {
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = blockedBusinessesUiConfig2.sections;
                    BlockedBusinessesUiConfig.HelpButton helpButton = blockedBusinessesUiConfig2.helpButton;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        BlockedBusinessesUiConfig.SectionConfig sectionConfig = (BlockedBusinessesUiConfig.SectionConfig) it5.next();
                        if (!sectionConfig.merchants.isEmpty()) {
                            arrayList3.add(new MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionTitle(sectionConfig.title));
                        }
                        ArrayList arrayList6 = sectionConfig.merchants;
                        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList6, 10));
                        Iterator it6 = arrayList6.iterator();
                        while (it6.hasNext()) {
                            BlockedBusinessesUiConfig.SectionConfig.MerchantRow merchantRow = (BlockedBusinessesUiConfig.SectionConfig.MerchantRow) it6.next();
                            arrayList7.add(new MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.SectionRow(StackedAvatarViewModelKt.toStackedAvatarViewModel(merchantRow.avatar), merchantRow.name, new MerchantBlockingViewEvent.RouterClicked(merchantRow.clientRoute, null), new MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList.SectionLoaded.Button(merchantRow.buttonTitle, merchantRow.buttonTitleColor, new MerchantBlockingViewEvent.RouterClicked(merchantRow.buttonClientRoute, merchantRow.buttonEvent))));
                            it5 = it5;
                            it6 = it6;
                            gapComposer7 = gapComposer7;
                        }
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList7, arrayList3);
                        CollectionsKt__MutableCollectionsKt.addAll(arrayList3, arrayList5);
                    }
                    gapComposer = gapComposer7;
                    loadable = new Loadable.Loaded(new MerchantBlockingViewModel.MerchantBlockingContentViewModel(new MerchantBlockingViewModel.HelpButton(new MerchantBlockingViewEvent.RouterClicked(helpButton.clientRoute, helpButton.event), helpButton.accessibilityText), arrayList3.isEmpty() ? MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionEmpty.INSTANCE : new MerchantBlockingViewModel.MerchantBlockingSectionViewModel.SectionList(arrayList3)));
                } else {
                    gapComposer = gapComposer7;
                    loadable = Loadable.Loading.INSTANCE;
                }
                MerchantBlockingViewModel merchantBlockingViewModel = new MerchantBlockingViewModel(str23, loadable);
                gapComposer.end(false);
                return merchantBlockingViewModel;
            case 7:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj13;
                RealOffersAnalyticsHelper realOffersAnalyticsHelper = (RealOffersAnalyticsHelper) obj8;
                ToolbarTuckTargets toolbarTuckTargets = (ToolbarTuckTargets) this.service;
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(1367904094);
                Object rememberedValue26 = gapComposer8.rememberedValue();
                Object obj27 = rememberedValue26;
                if (rememberedValue26 == obj14) {
                    Object boostSlots = ((RealBoostRepository) this.analytics).boostProvider.getBoostSlots(false);
                    gapComposer8.updateRememberedValue(boostSlots);
                    obj27 = boostSlots;
                }
                MutableState collectAsState8 = Updater.collectAsState((Flow) obj27, EmptyList.INSTANCE, null, gapComposer8, 48, 2);
                Object rememberedValue27 = gapComposer8.rememberedValue();
                Object obj28 = rememberedValue27;
                if (rememberedValue27 == obj14) {
                    Object flowTokenUpdates = realOffersAnalyticsHelper.flowTokenUpdates(OffersAnalyticsHelper$Flow.BROWSE);
                    gapComposer8.updateRememberedValue(flowTokenUpdates);
                    obj28 = flowTokenUpdates;
                }
                MutableState collectAsState9 = Updater.collectAsState((Flow) obj28, realOffersAnalyticsHelper.getFlowToken(OffersAnalyticsHelper$Flow.BROWSE), null, gapComposer8, 0, 2);
                Object rememberedValue28 = gapComposer8.rememberedValue();
                Continuation continuation7 = null;
                if (rememberedValue28 == obj14) {
                    RealOffersTabRepository realOffersTabRepository = (RealOffersTabRepository) this.launcher;
                    String str24 = ((OffersScreen$OffersFullscreenCollectionScreen) obj7).collectionToken;
                    Overlay$$ExternalSyntheticLambda0 overlay$$ExternalSyntheticLambda0 = new Overlay$$ExternalSyntheticLambda0(this, i4);
                    str24.getClass();
                    GpsConfigQueries gpsConfigQueries2 = realOffersTabRepository.cashDatabase.offersCollectionDetailQueries;
                    gpsConfigQueries2.getClass();
                    OffersCollectionDetailQueries$forToken$2 offersCollectionDetailQueries$forToken$2 = OffersCollectionDetailQueries$forToken$2.INSTANCE;
                    MusicPresenter$models$1$1 musicPresenter$models$1$1 = new MusicPresenter$models$1$1(new InviteContactsPresenter$special$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new OffersSheetQueries$ForSheetKeyQuery(gpsConfigQueries2, str24, new Overlay$$ExternalSyntheticLambda0(gpsConfigQueries2))), realOffersTabRepository.ioDispatcher), str24, 23), realOffersTabRepository, overlay$$ExternalSyntheticLambda0, continuation7, 22);
                    mutableState = collectAsState8;
                    continuation3 = null;
                    Object flowKt__MergeKt$flatMapConcat$$inlined$map$12 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new SafeFlow(musicPresenter$models$1$1), new OffersFullscreenCollectionPresenter$models$2$1.AnonymousClass1(this, continuation3, i6), 3);
                    gapComposer8.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$12);
                    rememberedValue28 = flowKt__MergeKt$flatMapConcat$$inlined$map$12;
                } else {
                    mutableState = collectAsState8;
                    continuation3 = null;
                }
                MutableState collectAsState10 = Updater.collectAsState((Flow) rememberedValue28, null, null, gapComposer8, 48, 2);
                ApiResult apiResult = (ApiResult) collectAsState10.getValue();
                boolean changed3 = gapComposer8.changed(collectAsState10) | gapComposer8.changedInstance(this);
                Object rememberedValue29 = gapComposer8.rememberedValue();
                Object obj29 = rememberedValue29;
                if (changed3 || rememberedValue29 == obj14) {
                    Object genieViewKt$GenieView$1$1 = new GenieViewKt$GenieView$1$1(collectAsState10, this, continuation3, 29);
                    gapComposer8.updateRememberedValue(genieViewKt$GenieView$1$1);
                    obj29 = genieViewKt$GenieView$1$1;
                }
                Updater.LaunchedEffect(gapComposer8, apiResult, (Function2) obj29);
                Unit unit5 = Unit.INSTANCE;
                boolean changedInstance8 = gapComposer8.changedInstance(this);
                Object rememberedValue30 = gapComposer8.rememberedValue();
                Object obj30 = rememberedValue30;
                if (changedInstance8 || rememberedValue30 == obj14) {
                    Object offersFullscreenCollectionPresenter$models$2$1 = new OffersFullscreenCollectionPresenter$models$2$1(this, continuation3, 0);
                    gapComposer8.updateRememberedValue(offersFullscreenCollectionPresenter$models$2$1);
                    obj30 = offersFullscreenCollectionPresenter$models$2$1;
                }
                Updater.LaunchedEffect(gapComposer8, unit5, (Function2) obj30);
                boolean changedInstance9 = gapComposer8.changedInstance(this);
                Object rememberedValue31 = gapComposer8.rememberedValue();
                Object obj31 = rememberedValue31;
                if (changedInstance9 || rememberedValue31 == obj14) {
                    Object offersFullscreenCollectionPresenter$models$2$12 = new OffersFullscreenCollectionPresenter$models$2$1(this, continuation3, i6);
                    gapComposer8.updateRememberedValue(offersFullscreenCollectionPresenter$models$2$12);
                    obj31 = offersFullscreenCollectionPresenter$models$2$12;
                }
                Updater.LaunchedEffect(gapComposer8, unit5, (Function2) obj31);
                Updater.LaunchedEffect(gapComposer8, flow, new MusicPresenter$models$1$1(flow, continuation3, (MoleculePresenter) this, (State) mutableState, 25));
                ApiResult apiResult2 = (ApiResult) collectAsState10.getValue();
                boolean z4 = apiResult2 instanceof ApiResult.Success;
                OffersCollectionTrackingAction.EndCollectionTracking endCollectionTracking = OffersCollectionTrackingAction.EndCollectionTracking.INSTANCE;
                OffersCollectionTrackingAction.EndLoading endLoading = OffersCollectionTrackingAction.EndLoading.INSTANCE;
                if (!z4) {
                    if (apiResult2 instanceof ApiResult.Failure.NetworkFailure) {
                        offersFullscreenCollectionViewModel = new OffersFullscreenCollectionViewModel(new OffersCollectionListingViewModel.Error(androidStringManager2.get(R.string.offers_tab_network_error_title)));
                        toolbarTuckTargets.onAction(endLoading);
                        toolbarTuckTargets.onAction(endCollectionTracking);
                    } else if (apiResult2 instanceof ApiResult.Failure.HttpFailure) {
                        offersFullscreenCollectionViewModel = new OffersFullscreenCollectionViewModel(new OffersCollectionListingViewModel.Error(androidStringManager2.get(R.string.offers_tab_generic_error_title)));
                        toolbarTuckTargets.onAction(endLoading);
                        toolbarTuckTargets.onAction(endCollectionTracking);
                    } else {
                        if (apiResult2 != null) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        offersFullscreenCollectionViewModel = new OffersFullscreenCollectionViewModel(OffersCollectionListingViewModel.Loading.INSTANCE);
                    }
                    offersFullscreenCollectionViewModel2 = offersFullscreenCollectionViewModel;
                    gapComposer8.end(false);
                    return offersFullscreenCollectionViewModel2;
                }
                OffersTabCollectionResponse offersTabCollectionResponse = (OffersTabCollectionResponse) ((ApiResult.Success) apiResult2).response;
                Long l3 = offersTabCollectionResponse.expire_at_ms;
                boolean z5 = (l3 != null ? l3.longValue() : 0L) < ((AndroidClock) obj11).millis();
                if (z5) {
                    toolbarTuckTargets.onAction(new OffersCollectionTrackingAction.StartLoading(false));
                }
                Slots slots = (Slots) CollectionsKt.firstOrNull((List) mutableState.getValue());
                Object obj32 = slots != null ? slots.token : continuation3;
                String str25 = (String) collectAsState9.getValue();
                List<CollectionSection> list3 = offersTabCollectionResponse.sections;
                list3.getClass();
                ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
                for (CollectionSection collectionSection : list3) {
                    String str26 = collectionSection.section_id;
                    if (str26 != null) {
                        AnalyticsEvent analyticsEvent = collectionSection.analytics_view_event;
                        if (analyticsEvent != null) {
                            OffersAnalyticsEventSpec offersAnalyticsEventSpec = ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent);
                            CollectionSection$Content$RowSection collectionSection$Content$RowSection = collectionSection.content;
                            if (collectionSection$Content$RowSection != null && (rowSection = collectionSection$Content$RowSection.value) != null) {
                                List list4 = rowSection.rows;
                                ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                Iterator it7 = list4.iterator();
                                while (it7.hasNext()) {
                                    zzlc zzlcVar = ((RowSection.Row) it7.next()).f1337type;
                                    if (zzlcVar != null) {
                                        RowSection$Row$Type$OfferRow rowSection$Row$Type$OfferRow = zzlcVar instanceof RowSection$Row$Type$OfferRow ? (RowSection$Row$Type$OfferRow) zzlcVar : null;
                                        if (rowSection$Row$Type$OfferRow != null) {
                                            offerRow = rowSection$Row$Type$OfferRow.value;
                                            if (offerRow == null) {
                                                String str27 = offerRow.boost_token;
                                                arrayList8.add(OffersTabMapperKt.toOfferRowViewModel(offerRow, str26, (str27 == null || StringsKt.isBlank(str27) || !str27.equals(obj32)) ? false : true, offersAnalyticsEventSpec));
                                            } else {
                                                a$$ExternalSyntheticBUOutline0.m$1("Data validation: Unsupported row type. offer_row must not be null");
                                            }
                                        }
                                    }
                                    offerRow = null;
                                    if (offerRow == null) {
                                    }
                                }
                                createListBuilder.addAll(arrayList8);
                            }
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: collection section analytics_view_event is null");
                        }
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$3("Data validation: section id == null");
                    }
                    return null;
                    break;
                }
                ListBuilder build = CollectionsKt__CollectionsJVMKt.build(createListBuilder);
                String str28 = offersTabCollectionResponse.screen_title;
                str28.getClass();
                String str29 = offersTabCollectionResponse.screen_subtitle;
                FormattedDetail formattedDetail = offersTabCollectionResponse.formatted_subtitle;
                if (((formattedDetail == null || (styledText = formattedDetail.styled_text) == null) ? null : styledText.text) == null) {
                    if (str29 != null) {
                        text = new FormattedDetailViewModel.Text(null, str29);
                        OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel3 = new OffersFullscreenCollectionViewModel(new OffersCollectionHeaderViewModel(str28, text), new OffersCollectionListingViewModel.Loaded(str25, build));
                        if (!z5) {
                        }
                        offersFullscreenCollectionViewModel2 = offersFullscreenCollectionViewModel3;
                        gapComposer8.end(false);
                        return offersFullscreenCollectionViewModel2;
                    }
                    text = null;
                    OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel32 = new OffersFullscreenCollectionViewModel(new OffersCollectionHeaderViewModel(str28, text), new OffersCollectionListingViewModel.Loaded(str25, build));
                    if (!z5) {
                    }
                    offersFullscreenCollectionViewModel2 = offersFullscreenCollectionViewModel32;
                    gapComposer8.end(false);
                    return offersFullscreenCollectionViewModel2;
                }
                StyledText styledText2 = formattedDetail.styled_text;
                if (styledText2 != null && (str7 = styledText2.text) != null) {
                    text = new FormattedDetailViewModel.Text(styledText2.text_color, str7);
                    OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel322 = new OffersFullscreenCollectionViewModel(new OffersCollectionHeaderViewModel(str28, text), new OffersCollectionListingViewModel.Loaded(str25, build));
                    if (!z5) {
                        toolbarTuckTargets.onAction(endLoading);
                        toolbarTuckTargets.onAction(endCollectionTracking);
                    }
                    offersFullscreenCollectionViewModel2 = offersFullscreenCollectionViewModel322;
                    gapComposer8.end(false);
                    return offersFullscreenCollectionViewModel2;
                }
                text = null;
                OffersFullscreenCollectionViewModel offersFullscreenCollectionViewModel3222 = new OffersFullscreenCollectionViewModel(new OffersCollectionHeaderViewModel(str28, text), new OffersCollectionListingViewModel.Loaded(str25, build));
                if (!z5) {
                }
                offersFullscreenCollectionViewModel2 = offersFullscreenCollectionViewModel3222;
                gapComposer8.end(false);
                return offersFullscreenCollectionViewModel2;
            case 8:
                return models$com$squareup$cash$p2pblocking$presenters$P2PListPresenter(flow, composer, i);
            case 9:
                return models$com$squareup$cash$paychecks$presenters$EditDistributionPresenter(flow, composer, i);
            default:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(230027780);
                Object rememberedValue32 = gapComposer9.rememberedValue();
                if (rememberedValue32 == obj14) {
                    Object nullStateSwipeConfigProvider = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, i5), 18);
                    gapComposer9.updateRememberedValue(nullStateSwipeConfigProvider);
                    rememberedValue32 = nullStateSwipeConfigProvider;
                }
                Flow flow3 = (Flow) rememberedValue32;
                Object rememberedValue33 = gapComposer9.rememberedValue();
                if (rememberedValue33 == obj14) {
                    Object nullStateSwipeConfigProvider2 = new NullStateSwipeConfigProvider(new CashQrScannerPresenter$special$$inlined$filter$1(flow, 28), 19);
                    gapComposer9.updateRememberedValue(nullStateSwipeConfigProvider2);
                    rememberedValue33 = nullStateSwipeConfigProvider2;
                }
                AliasesSectionViewModel aliasesSectionViewModel = (AliasesSectionViewModel) ((PdfPreviewPresenter) obj9).models((Flow) rememberedValue33, gapComposer9, 0);
                Object rememberedValue34 = gapComposer9.rememberedValue();
                Object obj33 = rememberedValue34;
                if (rememberedValue34 == obj14) {
                    Object singleValue = ((SyncValueReader) obj12).getSingleValue(AndroidSyncValueSpecs.PersonalInfoCtaBanner);
                    gapComposer9.updateRememberedValue(singleValue);
                    obj33 = singleValue;
                }
                StateFlow stateFlow = (StateFlow) obj33;
                boolean z6 = false;
                boolean z7 = false;
                boolean z8 = false;
                boolean z9 = false;
                MutableState collectAsState11 = Updater.collectAsState(stateFlow, null, gapComposer9, 1);
                boolean changedInstance10 = gapComposer9.changedInstance(stateFlow) | gapComposer9.changedInstance(this);
                Object rememberedValue35 = gapComposer9.rememberedValue();
                Object obj34 = rememberedValue35;
                if (changedInstance10 || rememberedValue35 == obj14) {
                    Object anonymousClass1 = new RingtoneView.AnonymousClass1(stateFlow, this, z6 ? 1 : 0, 20);
                    gapComposer9.updateRememberedValue(anonymousClass1);
                    obj34 = anonymousClass1;
                }
                Updater.LaunchedEffect(gapComposer9, stateFlow, (Function2) obj34);
                boolean changedInstance11 = gapComposer9.changedInstance(this);
                Object rememberedValue36 = gapComposer9.rememberedValue();
                Object obj35 = rememberedValue36;
                if (changedInstance11 || rememberedValue36 == obj14) {
                    Object selectPaymentPlanBlockerPresenter$models$1$2 = new SelectPaymentPlanBlockerPresenter$models$1$2((MoleculePresenter) this, (Continuation) (z7 ? 1 : 0), 15);
                    gapComposer9.updateRememberedValue(selectPaymentPlanBlockerPresenter$models$1$2);
                    obj35 = selectPaymentPlanBlockerPresenter$models$1$2;
                }
                MutableState produceState = Updater.produceState(gapComposer9, RatePlanButtonTreatment.Omit.INSTANCE, (Function2) obj35);
                boolean changedInstance12 = gapComposer9.changedInstance(this);
                Object rememberedValue37 = gapComposer9.rememberedValue();
                Object obj36 = rememberedValue37;
                if (changedInstance12 || rememberedValue37 == obj14) {
                    Object anonymousClass12 = new RingtoneView.AnonymousClass1(this, z8 ? 1 : 0, 21);
                    gapComposer9.updateRememberedValue(anonymousClass12);
                    obj36 = anonymousClass12;
                }
                MutableState produceState2 = Updater.produceState(gapComposer9, null, (Function2) obj36);
                Updater.LaunchedEffect(gapComposer9, flow, new RealQrCodesPresenter$models$1$1(flow, (Continuation) (z9 ? 1 : 0), (Object) this, (Object) collectAsState11, 6));
                InlineAppMessageViewModel inlineAppMessageViewModel = (InlineAppMessageViewModel) ((MoleculePresenter) obj10).models(flow3, gapComposer9, 0);
                UiCallbackModel models = ((EarningsHeaderPresenter) obj11).models(gapComposer9);
                AccountSettingType$PersonalSettings accountSettingType$PersonalSettings = (AccountSettingType$PersonalSettings) produceState2.getValue();
                RatePlanButtonTreatment ratePlanButtonTreatment = (RatePlanButtonTreatment) produceState.getValue();
                if (accountSettingType$PersonalSettings == null) {
                    obj6 = PersonalScreenViewModel.LoadingState.INSTANCE;
                } else {
                    Map map = accountSettingType$PersonalSettings.cache;
                    if (map.get(AccountSettingType$PersonalSettings.PersonalSubSetting.YOUR_INFO) == null) {
                        models = null;
                    }
                    obj6 = new PersonalScreenViewModel.Default(inlineAppMessageViewModel, models, map.get(AccountSettingType$PersonalSettings.PersonalSubSetting.ADDRESS) != null ? new ContactInfoSectionViewModel(aliasesSectionViewModel) : null, ratePlanButtonTreatment);
                }
                gapComposer9.end(false);
                return obj6;
        }
    }

    public EditDistributionViewModel.Content.Action toAction(EditDistributionConfiguration.DestinationUiConfiguration.SelectedStateUiElements.Button button, boolean z) {
        EditDistributionViewEvent editDistributionViewEvent;
        String str = button.label;
        int ordinal = button.action.ordinal();
        if (ordinal == 0) {
            editDistributionViewEvent = ((EditDistributionScreen) this.syncer).question == null ? EditDistributionViewEvent.Confirm.INSTANCE : EditDistributionViewEvent.SubmitUpdatedAllocationAnswer.INSTANCE;
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            editDistributionViewEvent = EditDistributionViewEvent.Disable.INSTANCE;
        }
        return new EditDistributionViewModel.Content.Action(str, editDistributionViewEvent, z);
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final LambdaProvider clock;
        public final Provider launcher;
        public final DoubleCheck service;
        public final LambdaProvider sessionManager;
        public final Provider store;
        public final LambdaProvider stringManager;
        public final DoubleCheck syncer;
        public final Provider timestampFormatterFactory;

        public MetroFactory(LambdaProvider lambdaProvider, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, DoubleCheck doubleCheck2, RealPasscodeFlowStarter.MetroFactory metroFactory2, RealSessionFlags.MetroFactory metroFactory3, LambdaProvider lambdaProvider3, DoubleCheck doubleCheck3) {
            this.sessionManager = lambdaProvider;
            this.stringManager = lambdaProvider2;
            this.syncer = doubleCheck;
            this.launcher = metroFactory;
            this.analytics = doubleCheck2;
            this.timestampFormatterFactory = metroFactory2;
            this.store = metroFactory3;
            this.clock = lambdaProvider3;
            this.service = doubleCheck3;
        }

        public MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider2, DoubleCheck doubleCheck3, InstanceFactory instanceFactory, LambdaProvider lambdaProvider3, MusicViewFactory$MetroFactory musicViewFactory$MetroFactory) {
            this.sessionManager = lambdaProvider;
            this.syncer = doubleCheck;
            this.analytics = doubleCheck2;
            this.launcher = metroFactory;
            this.stringManager = lambdaProvider2;
            this.service = doubleCheck3;
            this.timestampFormatterFactory = instanceFactory;
            this.clock = lambdaProvider3;
            this.store = musicViewFactory$MetroFactory;
        }

        public MetroFactory(DoubleCheck doubleCheck, IntentLauncher.MetroFactory metroFactory, InstanceFactory instanceFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, RealSessionFlags.MetroFactory metroFactory2, DoubleCheck doubleCheck3, LambdaProvider lambdaProvider2, LambdaProvider lambdaProvider3) {
            this.syncer = doubleCheck;
            this.launcher = metroFactory;
            this.timestampFormatterFactory = instanceFactory;
            this.analytics = doubleCheck2;
            this.sessionManager = lambdaProvider;
            this.store = metroFactory2;
            this.service = doubleCheck3;
            this.stringManager = lambdaProvider2;
            this.clock = lambdaProvider3;
        }
    }

    public LocalCashBalancePresenter(SheetAppMessage sheetAppMessage, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext, CashAccountDatabaseImpl cashAccountDatabaseImpl, AppMessageClientService appMessageClientService, Analytics analytics, AndroidClock androidClock, IntentLauncher intentLauncher, Flow flow, RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl, RealUuidGenerator realUuidGenerator) {
        sheetAppMessage.getClass();
        this.syncer = sheetAppMessage;
        this.navigator = screenNavigator;
        this.launcher = coroutineContext;
        this.sessionManager = cashAccountDatabaseImpl;
        this.store = appMessageClientService;
        this.analytics = analytics;
        this.clock = androidClock;
        this.service = intentLauncher;
        this.stringManager = flow;
        this.screen = re$$ExternalSyntheticOutline0.m();
        this.timestampFormatter = realAppMessageActionPerformer$Factory$Impl.create$1(screenNavigator);
    }

    public LocalCashBalancePresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, CashAccountDatabaseImpl cashAccountDatabaseImpl, InvestCustomerDripService investCustomerDripService, RealInvestingStateManager realInvestingStateManager, AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, KeyValue keyValue, CoroutineContext coroutineContext, InvestingScreens.DividendReinvestmentSettingScreen dividendReinvestmentSettingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        dividendReinvestmentSettingScreen.getClass();
        this.analytics = analytics;
        this.syncer = cashAccountDatabaseImpl;
        this.launcher = investCustomerDripService;
        this.sessionManager = realInvestingStateManager;
        this.stringManager = androidStringManager;
        this.store = featureFlagManager;
        this.service = keyValue;
        this.screen = coroutineContext;
        this.clock = dividendReinvestmentSettingScreen;
        this.navigator = screenNavigator;
        this.timestampFormatter = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalCashBalancePresenter(AndroidStringManager androidStringManager, MerchantBlockingClientService merchantBlockingClientService, FlowStarter flowStarter, BlockersDataNavigator blockersDataNavigator, SessionManager sessionManager, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, MerchantScreen$MerchantBlockingScreen merchantScreen$MerchantBlockingScreen, BetterNavigator.ScreenNavigator screenNavigator, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        merchantScreen$MerchantBlockingScreen.getClass();
        this.stringManager = androidStringManager;
        this.syncer = merchantBlockingClientService;
        this.launcher = flowStarter;
        this.store = blockersDataNavigator;
        this.sessionManager = sessionManager;
        this.analytics = analytics;
        this.service = merchantScreen$MerchantBlockingScreen;
        this.navigator = screenNavigator;
        this.screen = errorReporter;
        this.clock = sampleStrategy;
        this.timestampFormatter = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public LocalCashBalancePresenter(SessionManager sessionManager, Analytics analytics, RealCustomerStore realCustomerStore, AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, RealFamilyAccountsManager realFamilyAccountsManager, RealFamilyProfileManager realFamilyProfileManager, FeatureFlagManager featureFlagManager, RealUuidGenerator realUuidGenerator, AllowListController$Factory$Impl allowListController$Factory$Impl, BlockListController$Factory$Impl blockListController$Factory$Impl, P2PListScreen p2PListScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        Object create;
        p2PListScreen.getClass();
        this.analytics = analytics;
        this.syncer = realCustomerStore;
        this.stringManager = androidStringManager;
        this.launcher = realFamilyAccountsManager;
        this.sessionManager = realFamilyProfileManager;
        this.store = featureFlagManager;
        this.service = p2PListScreen;
        this.navigator = screenNavigator;
        this.screen = realRouter$Factory$Impl.create$1(screenNavigator);
        this.clock = PlatformKt.activeAccountToken(sessionManager);
        P2PScreenMode p2PScreenMode = p2PListScreen.screenMode;
        if (p2PScreenMode instanceof P2PScreenMode.AllowList) {
            create = allowListController$Factory$Impl.create();
        } else {
            if (!Intrinsics.areEqual(p2PScreenMode, P2PScreenMode.BlockList.INSTANCE)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            create = blockListController$Factory$Impl.create(P2PListScreen.copy$default(p2PListScreen), screenNavigator);
        }
        this.timestampFormatter = create;
    }

    public LocalCashBalancePresenter(AppConfigManager appConfigManager, AndroidStringManager androidStringManager, RealBalanceSnapshotManager realBalanceSnapshotManager, RealInstrumentManager realInstrumentManager, RealInstrumentLinkingOptionManager realInstrumentLinkingOptionManager, RealProfileManager realProfileManager, RealStatusAndLimitsManager realStatusAndLimitsManager, LocalizedMoneyFormatter.Factory factory, SelectPaymentInstrumentArgs selectPaymentInstrumentArgs, BetterNavigator.ScreenNavigator screenNavigator) {
        selectPaymentInstrumentArgs.getClass();
        this.syncer = appConfigManager;
        this.stringManager = androidStringManager;
        this.launcher = realBalanceSnapshotManager;
        this.analytics = realInstrumentManager;
        this.sessionManager = realInstrumentLinkingOptionManager;
        this.store = realProfileManager;
        this.service = realStatusAndLimitsManager;
        this.screen = factory;
        this.clock = selectPaymentInstrumentArgs;
        this.navigator = screenNavigator;
        this.timestampFormatter = factory.create(MoneyFormatterConfig.COMPACT);
    }

    public LocalCashBalancePresenter(AndroidActivityFinisher androidActivityFinisher, Analytics analytics, AppConfigManager appConfigManager, CustomerProfileClientService customerProfileClientService, CoroutineContext coroutineContext, IntentLauncher intentLauncher, RealLocaleManager realLocaleManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, AndroidStringManager androidStringManager, LanguageDisclosureScreen languageDisclosureScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        languageDisclosureScreen.getClass();
        this.syncer = androidActivityFinisher;
        this.analytics = analytics;
        this.launcher = appConfigManager;
        this.sessionManager = customerProfileClientService;
        this.store = coroutineContext;
        this.service = intentLauncher;
        this.screen = realLocaleManager;
        this.clock = cashAccountDatabaseImpl;
        this.stringManager = androidStringManager;
        this.timestampFormatter = languageDisclosureScreen;
        this.navigator = screenNavigator;
    }

    public LocalCashBalancePresenter(RealLocalBrandSyncer realLocalBrandSyncer, RealLocalLauncher realLocalLauncher, RealTimestampFormatter$Factory$Impl realTimestampFormatter$Factory$Impl, Analytics analytics, SessionManager sessionManager, LocalInstalledStore localInstalledStore, LocalService localService, AndroidStringManager androidStringManager, LocalCashBalanceScreen localCashBalanceScreen, BetterNavigator.ScreenNavigator screenNavigator, AndroidClock androidClock) {
        localCashBalanceScreen.getClass();
        this.syncer = realLocalBrandSyncer;
        this.launcher = realLocalLauncher;
        this.analytics = analytics;
        this.sessionManager = sessionManager;
        this.store = localInstalledStore;
        this.service = localService;
        this.stringManager = androidStringManager;
        this.screen = localCashBalanceScreen;
        this.navigator = screenNavigator;
        this.clock = androidClock;
        Locale locale = Locale.getDefault();
        locale.getClass();
        this.timestampFormatter = realTimestampFormatter$Factory$Impl.create$1(locale, TimestampFormatter$DisplayContext.STANDALONE);
    }

    public LocalCashBalancePresenter(OffersScreen$OffersFullscreenCollectionScreen offersScreen$OffersFullscreenCollectionScreen, BetterNavigator.ScreenNavigator screenNavigator, RealOffersTabRepository realOffersTabRepository, RealBoostRepository realBoostRepository, RealOffersAnalyticsHelper realOffersAnalyticsHelper, AndroidStringManager androidStringManager, RealOffersTabRefresher realOffersTabRefresher, ToolbarTuckTargets toolbarTuckTargets, AndroidClock androidClock, RealRouter$Factory$Impl realRouter$Factory$Impl, RealOffersAnalytics$Factory$Impl realOffersAnalytics$Factory$Impl) {
        offersScreen$OffersFullscreenCollectionScreen.getClass();
        this.syncer = offersScreen$OffersFullscreenCollectionScreen;
        this.navigator = screenNavigator;
        this.launcher = realOffersTabRepository;
        this.analytics = realBoostRepository;
        this.sessionManager = realOffersAnalyticsHelper;
        this.stringManager = androidStringManager;
        this.store = realOffersTabRefresher;
        this.service = toolbarTuckTargets;
        this.clock = androidClock;
        this.screen = realRouter$Factory$Impl.create$1(screenNavigator);
        this.timestampFormatter = realOffersAnalytics$Factory$Impl.create(offersScreen$OffersFullscreenCollectionScreen);
        toolbarTuckTargets.onAction(OffersCollectionTrackingAction.StartCollectionTracking.INSTANCE);
    }

    public LocalCashBalancePresenter(RealInvestmentEntities realInvestmentEntities, RealDependentInvestmentEntities realDependentInvestmentEntities, AndroidStringManager androidStringManager, CashAccountDatabaseImpl cashAccountDatabaseImpl, RealCategoryBackend realCategoryBackend, EnumPreference enumPreference, StockMetricFactory stockMetricFactory, RealDependentPortfolioStore realDependentPortfolioStore, LocalizedMoneyFormatter.Factory factory, CoroutineContext coroutineContext, String str) {
        this.syncer = realInvestmentEntities;
        this.launcher = realDependentInvestmentEntities;
        this.stringManager = androidStringManager;
        this.analytics = cashAccountDatabaseImpl;
        this.sessionManager = realCategoryBackend;
        this.store = enumPreference;
        this.service = stockMetricFactory;
        this.screen = realDependentPortfolioStore;
        this.navigator = coroutineContext;
        this.clock = str;
        this.timestampFormatter = factory.create(MoneyFormatterConfig.STANDARD);
    }

    public LocalCashBalancePresenter(EditDistributionScreen editDistributionScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, PaychecksAppService paychecksAppService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory) {
        this.syncer = editDistributionScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.launcher = paychecksAppService;
        this.sessionManager = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.store = editDistributionScreen.blockersData;
        this.service = editDistributionScreen.config;
        this.screen = factory.create(MoneyFormatterConfig.STANDARD);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.clock = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new P2PListViewKt$$ExternalSyntheticLambda2(27));
        this.timestampFormatter = LazyKt.lazy(lazyThreadSafetyMode, (Function0) new P2PListViewKt$$ExternalSyntheticLambda2(28));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r3v57, types: [com.squareup.cash.investing.viewmodels.StockMetric] */
    /* JADX WARN: Type inference failed for: r3v59 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v39, types: [java.lang.Boolean] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public List models(Flow flow, Composer composer, int i) {
        boolean z;
        NeverEqualPolicy neverEqualPolicy;
        String str;
        List plus;
        Iterable listOf;
        boolean z2;
        Comparable createDailyPercentChange;
        ?? r3;
        Object followingStocks;
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.timestampFormatter;
        StockMetricFactory stockMetricFactory = (StockMetricFactory) this.service;
        RealInvestmentEntities realInvestmentEntities = (RealInvestmentEntities) this.syncer;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        String str2 = (String) this.clock;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1187772108);
        Continuation continuation = null;
        int i2 = 1;
        Updater.LaunchedEffect(gapComposer, flow, new LightSourceKt$produceLightSource$1$1(flow, continuation, i2));
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy2) {
            InvestingDiscoveryQueries investingDiscoveryQueries = realInvestmentEntities.cashDatabase.investingDiscoveryQueries;
            investingDiscoveryQueries.getClass();
            InvestingDiscoveryQueries$selectDiscoveries$2 investingDiscoveryQueries$selectDiscoveries$2 = InvestingDiscoveryQueries$selectDiscoveries$2.INSTANCE;
            rememberedValue = FlowKt.transformLatest(DBUtil.mapToList(DBUtil.toFlow(investingDiscoveryQueries.new SelectDiscoveriesQuery(false, new TooltipBoxKt$$ExternalSyntheticLambda2(investingDiscoveryQueries))), realInvestmentEntities.ioDispatcher), new RealInvestmentEntities$discoveryStocks$$inlined$flatMapLatest$1(null, false, realInvestmentEntities));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy2) {
            rememberedValue2 = FlowKt.MutableStateFlow(new PolledData(EmptyList.INSTANCE, false));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        ref$ObjectRef.element = (MutableStateFlow) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy2) {
            if (str2 != null) {
                followingStocks = (Flow) ref$ObjectRef.element;
            } else {
                followingStocks = realInvestmentEntities.followingStocks();
            }
            rememberedValue3 = followingStocks;
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue3, null, null, gapComposer, 48, 2);
        if (str2 == null) {
            gapComposer.startReplaceGroup(1317710587);
            gapComposer.end(false);
            z = false;
            str = null;
            neverEqualPolicy = neverEqualPolicy2;
        } else {
            gapComposer.startReplaceGroup(1317710588);
            DependentPortfolio stockPortfolio = ((RealDependentPortfolioStore) this.screen).stockPortfolio(str2, gapComposer);
            z = false;
            neverEqualPolicy = neverEqualPolicy2;
            InvestingHomeView$onScrollFlow$1 investingHomeView$onScrollFlow$1 = new InvestingHomeView$onScrollFlow$1(stockPortfolio, this, ref$ObjectRef, continuation, 6);
            str = null;
            Updater.LaunchedEffect(gapComposer, stockPortfolio, investingHomeView$onScrollFlow$1);
            gapComposer.end(false);
        }
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = ((RealCategoryBackend) this.sessionManager).rootCategories();
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        NeverEqualPolicy neverEqualPolicy3 = neverEqualPolicy;
        boolean z3 = z;
        MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue4, null, null, gapComposer, 48, 2);
        Object rememberedValue5 = gapComposer.rememberedValue();
        if (rememberedValue5 == neverEqualPolicy3) {
            rememberedValue5 = ((EnumPreference) this.store).asFlow();
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue5, null, null, gapComposer, 48, 2);
        Object rememberedValue6 = gapComposer.rememberedValue();
        if (rememberedValue6 == neverEqualPolicy3) {
            rememberedValue6 = DBUtil.mapToOneOrNull(DBUtil.toFlow(((CashAccountDatabaseImpl) this.analytics).investingSettingsQueries.select$2()), (CoroutineContext) this.navigator);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        MutableState collectAsState5 = Updater.collectAsState((Flow) rememberedValue6, null, null, gapComposer, 48, 2);
        if (((PolledData) collectAsState.getValue()) != null && ((PolledData) collectAsState2.getValue()) != null && ((List) collectAsState3.getValue()) != null && ((FollowingStockMetricType) collectAsState4.getValue()) != null) {
            FollowingStockMetricType followingStockMetricType = (FollowingStockMetricType) collectAsState4.getValue();
            followingStockMetricType.getClass();
            Investing_settings investing_settings = (Investing_settings) collectAsState5.getValue();
            String str3 = investing_settings != null ? investing_settings.my_watchlist_description : str;
            if (FollowingHeadersKt$WhenMappings.$EnumSwitchMapping$0[followingStockMetricType.ordinal()] != 1) {
                str3 = androidStringManager.get(Position.getDisplayLabelResId(followingStockMetricType));
            } else if (str3 == null) {
                str3 = androidStringManager.get(R.string.my_followings_description);
            }
            String str4 = str3;
            String str5 = androidStringManager.get(R.string.my_followings_title);
            InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction headerAction = InvestingHomeViewModel.InvestingHomeRow.Header.HeaderAction.CHANGE_SORTING_ORDER;
            str5.getClass();
            InvestingHomeViewModel.InvestingHomeRow.Header header = new InvestingHomeViewModel.InvestingHomeRow.Header(16, str5, str4, -3L);
            PolledData polledData = (PolledData) collectAsState2.getValue();
            Object obj = polledData != null ? (List) polledData.value : str;
            obj.getClass();
            Iterable<InvestmentEntityWithPrice.Following> iterable = (Iterable) obj;
            int i3 = 10;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (InvestmentEntityWithPrice.Following following : iterable) {
                FollowingStockMetricType followingStockMetricType2 = (FollowingStockMetricType) collectAsState4.getValue();
                followingStockMetricType2.getClass();
                following.getClass();
                if (following.delisted) {
                    r3 = str;
                } else {
                    int ordinal = followingStockMetricType2.ordinal();
                    if (ordinal == 0 || ordinal == i2) {
                        createDailyPercentChange = StockMetricFactory.createDailyPercentChange(following);
                    } else if (ordinal == 2) {
                        createDailyPercentChange = stockMetricFactory.createSharePrice(following);
                    } else if (ordinal == 3) {
                        createDailyPercentChange = stockMetricFactory.createMarketCap(following);
                    } else {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    r3 = createDailyPercentChange;
                }
                PolledData polledData2 = (PolledData) collectAsState2.getValue();
                ?? valueOf = polledData2 != null ? Boolean.valueOf(polledData2.isStale) : str;
                valueOf.getClass();
                boolean booleanValue = valueOf.booleanValue();
                moneyFormatter.getClass();
                arrayList.add(new InvestingHomeViewModel.InvestingHomeRow.Stock.Following(KonfettiViewKt.asContentModel(following, r3, false, booleanValue, true, androidStringManager, moneyFormatter), following.id));
                i2 = i2;
            }
            List sortedWith = CollectionsKt.sortedWith(arrayList, new SemanticsSortKt$special$$inlined$thenBy$1(new SemanticsSortKt$special$$inlined$thenBy$1(new b.C0008b(17), 8), 7));
            if (sortedWith.isEmpty()) {
                plus = EmptyList.INSTANCE;
            } else {
                plus = CollectionsKt.plus((Iterable) sortedWith, (Collection) CollectionsKt__CollectionsJVMKt.listOf(header));
            }
            List list = (List) collectAsState3.getValue();
            list.getClass();
            if (list.isEmpty()) {
                listOf = EmptyList.INSTANCE;
            } else {
                List list2 = (List) collectAsState3.getValue();
                list2.getClass();
                List<Category> list3 = list2;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                for (Category category : list3) {
                    category.getClass();
                    String str6 = category.imageUrl;
                    str6.getClass();
                    String str7 = category.name;
                    Color color = category.color;
                    color.getClass();
                    arrayList2.add(new InvestingCategoryTileContentModel(str6, str7, color, category.token));
                }
                listOf = CollectionsKt__CollectionsJVMKt.listOf(new InvestingHomeViewModel.InvestingHomeRow.CategoryCarousel(arrayList2));
            }
            if (str2 != null) {
                z2 = z3;
            } else {
                ArrayList plus2 = CollectionsKt.plus(listOf, (Collection) plus);
                PolledData polledData3 = (PolledData) collectAsState.getValue();
                polledData3.getClass();
                Map map = (Map) polledData3.value;
                ArrayList arrayList3 = new ArrayList();
                Iterator it = map.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    DiscoveryHeader discoveryHeader = (DiscoveryHeader) entry.getKey();
                    List list4 = (List) entry.getValue();
                    InvestingHomeViewModel.InvestingHomeRow.Header header2 = new InvestingHomeViewModel.InvestingHomeRow.Header(20, discoveryHeader.text, discoveryHeader.description, discoveryHeader.id);
                    List<InvestmentEntityWithPrice.Unowned> list5 = list4;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list5, i3));
                    for (InvestmentEntityWithPrice.Unowned unowned : list5) {
                        unowned.getClass();
                        ArrayList arrayList5 = arrayList4;
                        PercentChange createDailyPercentChange2 = StockMetricFactory.createDailyPercentChange(unowned);
                        PolledData polledData4 = (PolledData) collectAsState.getValue();
                        polledData4.getClass();
                        boolean z4 = polledData4.isStale;
                        String str8 = discoveryHeader.text;
                        moneyFormatter.getClass();
                        str8.getClass();
                        arrayList5.add(new InvestingHomeViewModel.InvestingHomeRow.Stock.Discovery(KonfettiViewKt.asContentModel(unowned, createDailyPercentChange2, false, z4, false, androidStringManager, moneyFormatter), unowned.id, str8));
                        it = it;
                        arrayList4 = arrayList5;
                    }
                    Iterator it2 = it;
                    ArrayList windowed = CollectionsKt.windowed(arrayList4, 3, 3, true);
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(windowed, 10));
                    Iterator it3 = windowed.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(new InvestingHomeViewModel.InvestingHomeRow.StockCarousel.Page((List) it3.next()));
                    }
                    CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt.plus((Collection) CollectionsKt__CollectionsJVMKt.listOf(header2), (Object) new InvestingHomeViewModel.InvestingHomeRow.StockCarousel(arrayList6, header2.id)), arrayList3);
                    i3 = 10;
                    it = it2;
                }
                plus = CollectionsKt.plus((Iterable) arrayList3, (Collection) plus2);
                z2 = false;
            }
            gapComposer.end(z2);
            return plus;
        }
        EmptyList emptyList = EmptyList.INSTANCE;
        gapComposer.end(z3);
        return emptyList;
    }
}
