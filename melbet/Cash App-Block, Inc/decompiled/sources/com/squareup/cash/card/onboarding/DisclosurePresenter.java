package com.squareup.cash.card.onboarding;

import android.net.Uri;
import android.os.Parcelable;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.AndroidShader_androidKt;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.compose.ui.platform.WindowInfoImpl;
import androidx.core.text.TextUtilsCompat;
import androidx.datastore.core.DataStoreImpl$data$1$invokeSuspend$$inlined$map$1;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2;
import app.cash.badging.backend.RealBadger2$scheduleBadgeClearingWork$$inlined$map$1;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.AnswerDispatcher;
import app.cash.broadway.presenter.molecule.AnswersKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.backend.ClearMarketingBadgesIfNeeded;
import app.cash.local.backend.RefreshMarketingMessages;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.screens.app.LocalMarketingMessagesScreen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.fillr.featuretoggle.UnleashContext;
import com.google.android.gms.internal.mlkit_genai_prompt.zzafe;
import com.google.mlkit.vision.text.zza;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.account.manager.backend.real.RealAccountRatePlanManager;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloaderPresenter$FileMetadata;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloaderPresenter$accountStatementFileData$1;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloaderPresenter$downloadFile$3;
import com.squareup.cash.account.presenters.documents.AccountDocumentsDownloaderPresenter$getFileDataAndDownload$1;
import com.squareup.cash.account.screens.BusinessInfoScreen;
import com.squareup.cash.activity.analytics.ActivityAnalyticsService;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.activity.backend.contacts.RealQuickAccessBarStore;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.backend.loader.RealActivitiesCacheManager;
import com.squareup.cash.activity.backend.loader.RealActivityTokenFactory;
import com.squareup.cash.activity.presenters.ActivityEmbeddedPresenter$Companion;
import com.squareup.cash.activity.presenters.ActivityInviteItemPresenter$Factory$Impl;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.appmessages.InlineAppMessageViewModel;
import com.squareup.cash.appmessages.presenters.InlineAppMessagePresenterHelper$models$1$1;
import com.squareup.cash.appmessages.presenters.InlineAppMessageV2PresenterHelper$models$1$1;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPerformer$Factory$Impl;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPresenterHelper;
import com.squareup.cash.appmessages.treehouse.AndroidAppMessagingService;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.treehouse.SearchBarBinding$Content$1$1;
import com.squareup.cash.attribution.ProductionAttributionEventEmitter;
import com.squareup.cash.bitcoin.presenters.BitcoinDepositsPresenter$special$$inlined$filter$1;
import com.squareup.cash.bitcoin.presenters.deposits.RealLightningInvoiceGenerator;
import com.squareup.cash.bitcoin.presenters.deposits.copy.BitcoinDepositCopyPresenter$loadLightningInvoice$1;
import com.squareup.cash.bitcoin.presenters.stablecoin.StablecoinOnboardingPresenter$models$1$1;
import com.squareup.cash.bitcoin.screens.BitcoinDependentWelcomeScreen;
import com.squareup.cash.bitcoin.screens.BitcoinDepositCopyScreen;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingScreen;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingType;
import com.squareup.cash.bitcoin.viewmodels.dependents.BitcoinDependentWelcomeViewModel;
import com.squareup.cash.bitcoin.viewmodels.deposits.copy.BitcoinDepositCopyViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinOnboardingViewModel;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.presenters.CheckmarkPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.blockers.presenters.InstrumentSelectionBlockerPresenter$SubmissionData;
import com.squareup.cash.blockers.presenters.InstrumentSelectionBlockerPresenter$submitOptionV2$1;
import com.squareup.cash.blockers.presenters.RealIdvPresenter$models$1$1;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.presenters.StripeLinkPresenter$completeLink$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.viewmodels.InstrumentDetailModel$InstrumentDetailListModel;
import com.squareup.cash.blockers.viewmodels.InstrumentDetailModel$InstrumentDetailTextModel;
import com.squareup.cash.blockers.viewmodels.InstrumentDetailRowModel;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SelectedInstrumentModel;
import com.squareup.cash.blockers.viewmodels.StripeLinkViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.borrow.screens.BorrowHomeOverlay;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.borrow.viewmodels.SheetButtonAction;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.businessaccount.backend.real.RealBusinessProfileManager;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.onboarding.screens.DisclosureScreen;
import com.squareup.cash.card.spendinginsights.backend.api.model.ColoredText;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsight;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightDetailScreen;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewEvent;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.StackedBarChartViewEvent$BarTapped;
import com.squareup.cash.card.spendinginsights.viewmodels.StackedBarChartViewModel;
import com.squareup.cash.card.spendinginsights.viewmodels.StackedBarChartViewModel$Bar$BarImage$Avatar;
import com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentRequest;
import com.squareup.cash.cashlynxflow.api.v2.SelectInstrumentResponse;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.crypto.CryptoDepositCreateInvoice;
import com.squareup.cash.cdf.crypto.CryptoDepositStart;
import com.squareup.cash.cdf.instrument.InstrumentLinkAuthenticateInstitution;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.EntitySyncerKt$hasSyncedFlow$1;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.ClientSyncer$Result;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.common.moneyformatter.RoundingMode;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.amount.CryptoAmount;
import com.squareup.cash.crypto.amount.CryptoCurrency;
import com.squareup.cash.crypto.backend.performance.RealBitcoinPerformanceDataRepo;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealClientScenarioCompleter;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.discover.promotiondetails.backend.real.RealPromotionDetailsAnalyticsService;
import com.squareup.cash.discover.promotiondetails.backend.real.RealPromotionDetailsAnalyticsService$Factory$Impl;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetailsTransitionFactory$AnimationData;
import com.squareup.cash.discover.promotiondetails.viewmodels.PromotionDetailsViewModel;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.family.applets.data.RealAllowanceAppletTileRepository;
import com.squareup.cash.family.applets.data.RealFamilyAppletTileRepository;
import com.squareup.cash.family.applets.viewmodels.Allowance;
import com.squareup.cash.family.applets.viewmodels.AllowanceAppletTileViewModel;
import com.squareup.cash.family.applets.viewmodels.FamilyAppletTileViewModel;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.gcl.data.RealGlobalConfigDataSource;
import com.squareup.cash.google.pay.GooglePayPresenter$$ExternalSyntheticLambda0;
import com.squareup.cash.google.pay.GooglePayPresenter$models$1$1;
import com.squareup.cash.google.pay.GooglePayService;
import com.squareup.cash.google.pay.payments.real.RealGooglePayPaymentsClient;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.graphics.views.GLSceneScopeProvider$SceneScope$2$1$1;
import com.squareup.cash.growtools.presenters.manager.activity.GrowToolsActivitySearchRequestHandler;
import com.squareup.cash.growtools.presenters.manager.activity.GrowToolsActivitySearchRequestHandler$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.activity.GrowToolsProductClassifierUtilsKt$WhenMappings;
import com.squareup.cash.growtools.presenters.manager.roundups.OriginSpecificData;
import com.squareup.cash.growtools.presenters.manager.roundups.RoundUpsOriginSpecificDataUtilsKt$WhenMappings;
import com.squareup.cash.growtools.screens.GrowToolsCompleteActivityScreen;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsActivityViewModel;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.history.presenters.PasscodeDialogPresenter$models$1$1;
import com.squareup.cash.history.viewmodels.CancelPendingSupPaymentViewModel;
import com.squareup.cash.history.views.ActivityItemLayout$$ExternalSyntheticLambda4;
import com.squareup.cash.instruments.presenters.InstrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1;
import com.squareup.cash.instruments.presenters.InstrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1;
import com.squareup.cash.instruments.presenters.InstrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1;
import com.squareup.cash.instruments.screens.InstrumentSelectionLoadingScreen;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.backend.api.data.Category;
import com.squareup.cash.investing.backend.api.data.CategoryDetails;
import com.squareup.cash.investing.backend.real.RealInvestingStateManager;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.backend.real.categories.RealCategoryBackend;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.presenters.FilterConfigurationCacheMap;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter;
import com.squareup.cash.investing.presenters.search.InvestingSearchPresenter$Factory$Impl;
import com.squareup.cash.investing.primitives.CategoryToken;
import com.squareup.cash.investing.primitives.InvestingState;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.investing.viewmodels.dependent.DependentWelcomeViewModel;
import com.squareup.cash.investing.viewmodels.search.InvestingSearchViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$ImageWithBackground;
import com.squareup.cash.invitations.InviteContactsPresenter$special$$inlined$map$1;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.moneta.api.v1_0.InitiateInstrumentSelectionRequest;
import com.squareup.cash.moneta.api.v1_0.InitiateInstrumentSelectionResponse;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.applets.common.presenters.PromotedAppletTilePresenter$Factory$Impl;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.applets.sections.RealPromotedAppletTileStore;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.money.views.MoneyTabSectionUIKt$$ExternalSyntheticLambda6;
import com.squareup.cash.moneybot.backend.api.CachedChat;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.api.managers.MoneybotDebugSettingsManager;
import com.squareup.cash.moneybot.backend.api.model.chat.Chat;
import com.squareup.cash.moneybot.backend.api.model.chat.TokenInfo;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.presenters.MoneybotDebugOverlayState;
import com.squareup.cash.moneybot.screens.ChatSourceContext;
import com.squareup.cash.moneybot.screens.MoneybotDebugOverlayScreen;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewEvent;
import com.squareup.cash.moneybot.viewmodels.MoneybotDebugOverlayViewModel;
import com.squareup.cash.moneybot.viewmodels.TokenUsageViewModel;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinAddress;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayment;
import com.squareup.cash.multiplatform.bitcoin.parsers.BitcoinPayments;
import com.squareup.cash.multiplatform.bitcoin.parsers.LightningInvoice;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.offers.backend.real.RealOffersAnalyticsV2;
import com.squareup.cash.offers.presenters.OffersAnalyticsKt;
import com.squareup.cash.offers.screens.OffersScreen$OffersGreenStatusScreen;
import com.squareup.cash.p2pblocking.presenters.RealAllowlistRepository;
import com.squareup.cash.pdf.screen.PdfScreen;
import com.squareup.cash.profile.screens.DocumentDownloaderScreen;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.recurringpayments.backend.OptimisticRecurringPaymentDisplay;
import com.squareup.cash.recurringpayments.backend.RealRecurringPaymentsManager;
import com.squareup.cash.recurringpayments.backend.RecurringPayment;
import com.squareup.cash.recurringpayments.backend.RecurringPayments;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.securitysignals.api.SecuritySignalsAggregator;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.support.presenters.ArticlePresenter$models$$inlined$AnswerHandler$1;
import com.squareup.cash.tabprovider.real.RealTabProvider$setup$1$5;
import com.squareup.cash.ui.widget.StackedAvatarViewModelKt;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.workers.CardAppletWorker;
import com.squareup.cash.work.analytics.ShiftsAnalytics;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.activity.api.v1.ActivityScope;
import com.squareup.protos.cash.activity.api.v1.ActivityToken;
import com.squareup.protos.cash.activity.api.v1.ActivityTokenType;
import com.squareup.protos.cash.aegis.service.AegisService;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.cryptoinvestflow.service.CryptoInvestFlowService;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Request;
import com.squareup.protos.cash.cryptosparky.api.deposits.GenerateLightningInvoice$Response;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.lynx.api.v1_0.CompleteStripeLinkRequest;
import com.squareup.protos.cash.lynx.api.v1_0.StripeBankLinkingService;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.protos.cash.registrar.api.GetStatementDescriptorRequest;
import com.squareup.protos.cash.registrar.api.GetStatementDescriptorResponse;
import com.squareup.protos.cash.spendinginsights.appapi.SpendingInsightsAppService;
import com.squareup.protos.cash.sup.api.v1.CheckoutService;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.api.DepositPreference;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.ui.Timeline;
import com.squareup.protos.franklin.ui.UiInvestingAutomation;
import com.squareup.protos.lending.LoanRepaymentSelectionData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.util.Strings;
import com.squareup.util.android.AndroidToaster;
import com.squareup.util.cash.ColorsKt;
import com.squareup.util.coroutines.DerivedStateFlow;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.util.coroutines.TickerKt;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import kotlin.LazyKt;
import kotlin.NotImplementedError;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.KotlinGenericDeclarationKt;
import kotlin.ranges.ClosedRange;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.CallbackFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import okio.ByteString;
import operations.ComparingOperation;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.PapaEvent;
import papa.SafeTrace;
import squareup.cash.moneta.api.v1_0.MonetaService;
import squareup.cash.out.api.v1_0.CashOutService;
import squareup.cash.registrar.api.RegistrarClientService;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class DisclosurePresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId;
    public final Object analytics;
    public final Object appService;
    public Object args;
    public final Object blockersNavigator;
    public final Object launcher;
    public Object navigator;
    public final Object stringManager;

    public DisclosurePresenter(SyncValueReader syncValueReader, GrowToolsActivitySearchRequestHandler$Factory$Impl growToolsActivitySearchRequestHandler$Factory$Impl, RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl, LocalizedMoneyFormatter.Factory factory, RealActivityTokenFactory realActivityTokenFactory, RealActivitiesCacheManager realActivitiesCacheManager, AndroidStringManager androidStringManager, RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo, GrowToolsCompleteActivityScreen growToolsCompleteActivityScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 23;
        growToolsCompleteActivityScreen.getClass();
        this.stringManager = androidStringManager;
        this.analytics = realBitcoinRoundUpsRepo;
        this.appService = growToolsCompleteActivityScreen;
        this.navigator = screenNavigator;
        RoundingMode roundingMode = RoundingMode.DOWN;
        this.blockersNavigator = factory.createAbbreviatedExactlyTwoFractionDigits();
        ListBuilder activityClassifiers = KotlinGenericDeclarationKt.getActivityClassifiers(growToolsCompleteActivityScreen.managerScreen);
        ActivityToken create$default = RealActivityTokenFactory.create$default(realActivityTokenFactory, ActivityTokenType.CUSTOMER_TOKEN);
        ActivityScope activityScope = ActivityScope.GROW_TOOLS;
        activityClassifiers.getClass();
        ActivityClientService activityClientService = (ActivityClientService) growToolsActivitySearchRequestHandler$Factory$Impl.delegateFactory.sandboxer.invoke();
        activityClientService.getClass();
        this.launcher = realActivityEmbeddedPresenter$Factory$Impl.create(screenNavigator, ActivityEmbeddedPresenter$Companion.FilteredFeedConfiguration$default(new ActivitiesManager.ActivityContext(create$default, activityScope, new GrowToolsActivitySearchRequestHandler(activityClientService, activityClassifiers), 8), RealActivitiesCacheManager.take$default(realActivitiesCacheManager, activityClassifiers), growToolsCompleteActivityScreen, false, null, null, null, null, null, 16296));
        this.args = StateFlowKt.mapState(syncValueReader.getAllValues(AndroidSyncValueSpecs.InvestingAutomation), new ActivityItemLayout$$ExternalSyntheticLambda4(4));
    }

    public static final InstrumentSelectionBlockerPresenter$SubmissionData access$buildSubmissionData(DisclosurePresenter disclosurePresenter, InstrumentSelectionData.InstrumentOption instrumentOption, boolean z, InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption, InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption2) {
        InstrumentSelectionData.InstrumentOption instrumentOption2 = preselectableOption;
        if (!z) {
            instrumentOption2 = instrumentOption;
        }
        InstrumentSelectionData.InstrumentOption.Enabled enabled = instrumentOption2 instanceof InstrumentSelectionData.InstrumentOption.Enabled ? (InstrumentSelectionData.InstrumentOption.Enabled) instrumentOption2 : null;
        if (!z) {
            instrumentOption = preselectableOption2;
        }
        InstrumentSelectionData.InstrumentOption.Enabled enabled2 = instrumentOption instanceof InstrumentSelectionData.InstrumentOption.Enabled ? (InstrumentSelectionData.InstrumentOption.Enabled) instrumentOption : null;
        if (enabled != null) {
            return new InstrumentSelectionBlockerPresenter$SubmissionData(enabled.getEncodedSelectedOption(), enabled2 != null ? enabled2.getEncodedSelectedOption() : null);
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
    
        if (r8.downloadPdf(r0, r9, r1) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006f, code lost:
    
        if (r8.downloadPdf(r0, null, r1) == r2) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0056, code lost:
    
        if (r9 == r2) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$getFileDataAndDownload(DisclosurePresenter disclosurePresenter, ContinuationImpl continuationImpl) {
        AccountDocumentsDownloaderPresenter$getFileDataAndDownload$1 accountDocumentsDownloaderPresenter$getFileDataAndDownload$1;
        int i;
        AccountDocumentsDownloaderPresenter$FileMetadata accountDocumentsDownloaderPresenter$FileMetadata;
        DocumentDownloaderScreen documentDownloaderScreen = (DocumentDownloaderScreen) disclosurePresenter.args;
        if (continuationImpl instanceof AccountDocumentsDownloaderPresenter$getFileDataAndDownload$1) {
            accountDocumentsDownloaderPresenter$getFileDataAndDownload$1 = (AccountDocumentsDownloaderPresenter$getFileDataAndDownload$1) continuationImpl;
            int i2 = accountDocumentsDownloaderPresenter$getFileDataAndDownload$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountDocumentsDownloaderPresenter$getFileDataAndDownload$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = accountDocumentsDownloaderPresenter$getFileDataAndDownload$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDocumentsDownloaderPresenter$getFileDataAndDownload$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    accountDocumentsDownloaderPresenter$getFileDataAndDownload$1.label = 1;
                    if (documentDownloaderScreen instanceof DocumentDownloaderScreen.AccountStatementDownloaderScreen) {
                        obj = disclosurePresenter.accountStatementFileData((DocumentDownloaderScreen.AccountStatementDownloaderScreen) documentDownloaderScreen, accountDocumentsDownloaderPresenter$getFileDataAndDownload$1);
                    } else {
                        if (!(documentDownloaderScreen instanceof DocumentDownloaderScreen.DefaultDownloaderScreen)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        obj = null;
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
                    SafeTrace.throwOnFailure(obj);
                }
                accountDocumentsDownloaderPresenter$FileMetadata = (AccountDocumentsDownloaderPresenter$FileMetadata) obj;
                if (accountDocumentsDownloaderPresenter$FileMetadata == null) {
                    accountDocumentsDownloaderPresenter$getFileDataAndDownload$1.label = 2;
                } else {
                    accountDocumentsDownloaderPresenter$getFileDataAndDownload$1.label = 3;
                }
                return obj2;
            }
        }
        accountDocumentsDownloaderPresenter$getFileDataAndDownload$1 = new AccountDocumentsDownloaderPresenter$getFileDataAndDownload$1(disclosurePresenter, continuationImpl);
        Object obj3 = accountDocumentsDownloaderPresenter$getFileDataAndDownload$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDocumentsDownloaderPresenter$getFileDataAndDownload$1.label;
        if (i != 0) {
        }
        accountDocumentsDownloaderPresenter$FileMetadata = (AccountDocumentsDownloaderPresenter$FileMetadata) obj3;
        if (accountDocumentsDownloaderPresenter$FileMetadata == null) {
        }
        return obj22;
    }

    public static final InstrumentSelectionData.InstrumentOption access$getInstrumentById(DisclosurePresenter disclosurePresenter, int i, boolean z) {
        InstrumentSelectionData.InstrumentOption instrumentOption;
        Object obj;
        InstrumentSelectionData instrumentSelectionData = ((BlockersScreens.InstrumentSelectionScreen) disclosurePresenter.appService).data;
        Iterable iterable = z ? instrumentSelectionData.secondaryOptions : instrumentSelectionData.options;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((InstrumentSelectionData.InstrumentOption) obj).getId() == i) {
                    break;
                }
            }
            instrumentOption = (InstrumentSelectionData.InstrumentOption) obj;
        } else {
            instrumentOption = null;
        }
        if (instrumentOption != null) {
            return instrumentOption;
        }
        a$$ExternalSyntheticBUOutline0.m$3("Selected instrument not found");
        return null;
    }

    public static final void access$goToInstrumentListScreen(DisclosurePresenter disclosurePresenter, boolean z) {
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
        BlockersScreens.InstrumentSelectionScreen instrumentSelectionScreen = (BlockersScreens.InstrumentSelectionScreen) disclosurePresenter.appService;
        BlockersData blockersData = instrumentSelectionScreen.blockersData;
        InstrumentSelectionData instrumentSelectionData = instrumentSelectionScreen.data;
        String str = z ? instrumentSelectionData.secondaryListHeaderTitle : instrumentSelectionData.listHeaderTitle;
        List list = z ? instrumentSelectionData.secondaryOptions : instrumentSelectionData.options;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        screenNavigator.goTo(new BlockersScreens.InstrumentSelectionListScreen(blockersData, str, list, instrumentSelectionData.listDismissButtonText, z));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$loadLightningInvoice(DisclosurePresenter disclosurePresenter, Function1 function1, Function1 function12, ContinuationImpl continuationImpl) {
        BitcoinDepositCopyPresenter$loadLightningInvoice$1 bitcoinDepositCopyPresenter$loadLightningInvoice$1;
        int i;
        ApiResult apiResult;
        Analytics analytics = (Analytics) disclosurePresenter.analytics;
        if (continuationImpl instanceof BitcoinDepositCopyPresenter$loadLightningInvoice$1) {
            bitcoinDepositCopyPresenter$loadLightningInvoice$1 = (BitcoinDepositCopyPresenter$loadLightningInvoice$1) continuationImpl;
            int i2 = bitcoinDepositCopyPresenter$loadLightningInvoice$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bitcoinDepositCopyPresenter$loadLightningInvoice$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bitcoinDepositCopyPresenter$loadLightningInvoice$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bitcoinDepositCopyPresenter$loadLightningInvoice$1.label;
                long j = 0;
                String str = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    function12.invoke(BitcoinDepositCopyViewModel.Loading.INSTANCE);
                    analytics.track(new CryptoDepositStart(CryptoDepositStart.CryptoDepositStartSource.BITCOIN_APPLET_WALLET_WIDGET), null);
                    RealLightningInvoiceGenerator realLightningInvoiceGenerator = (RealLightningInvoiceGenerator) disclosurePresenter.launcher;
                    zza zzaVar = CryptoCurrency.Companion;
                    GenerateLightningInvoice$Request generateLightningInvoice$Request = new GenerateLightningInvoice$Request(new CryptoAmount(j), str);
                    bitcoinDepositCopyPresenter$loadLightningInvoice$1.L$0 = function1;
                    bitcoinDepositCopyPresenter$loadLightningInvoice$1.L$1 = function12;
                    bitcoinDepositCopyPresenter$loadLightningInvoice$1.label = 1;
                    obj = realLightningInvoiceGenerator.generateLightningInvoice(generateLightningInvoice$Request, bitcoinDepositCopyPresenter$loadLightningInvoice$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    function12 = bitcoinDepositCopyPresenter$loadLightningInvoice$1.L$1;
                    function1 = bitcoinDepositCopyPresenter$loadLightningInvoice$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    AndroidStringManager androidStringManager = (AndroidStringManager) disclosurePresenter.stringManager;
                    function12.invoke(new BitcoinDepositCopyViewModel.Error(androidStringManager.get(R.string.bitcoin_deposit_copy_error_title), androidStringManager.get(R.string.bitcoin_deposit_copy_error_message), androidStringManager.get(R.string.bitcoin_deposit_copy_retry_button_text)));
                } else {
                    BitcoinPayments bitcoinInvoice = OffersAnalyticsKt.toBitcoinInvoice((GenerateLightningInvoice$Response) ((ApiResult.Success) apiResult).response);
                    function1.invoke(bitcoinInvoice);
                    analytics.track(new CryptoDepositCreateInvoice(Boolean.FALSE, new Long(0L)), null);
                    function12.invoke(viewModelFromInvoice(bitcoinInvoice));
                }
                return Unit.INSTANCE;
            }
        }
        bitcoinDepositCopyPresenter$loadLightningInvoice$1 = new BitcoinDepositCopyPresenter$loadLightningInvoice$1(disclosurePresenter, continuationImpl);
        Object obj2 = bitcoinDepositCopyPresenter$loadLightningInvoice$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bitcoinDepositCopyPresenter$loadLightningInvoice$1.label;
        long j2 = 0;
        String str2 = null;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$navigateToAddMoneyInstrumentSelection(DisclosurePresenter disclosurePresenter, Money money, String str, boolean z, ContinuationImpl continuationImpl) {
        InstrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1 instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1;
        int i;
        ApiResult apiResult;
        InstrumentSelectionLoadingScreen instrumentSelectionLoadingScreen = (InstrumentSelectionLoadingScreen) disclosurePresenter.args;
        if (continuationImpl instanceof InstrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1) {
            instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1 = (InstrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1) continuationImpl;
            int i2 = instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    MonetaService monetaService = (MonetaService) disclosurePresenter.appService;
                    BlockersData blockersData = instrumentSelectionLoadingScreen.blockersData;
                    String str2 = blockersData.flowToken;
                    InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = new InitiateInstrumentSelectionRequest(str, money != null ? money.amount : null, blockersData.requestContext, Boolean.valueOf(z), ByteString.EMPTY);
                    instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1.label = 1;
                    obj = monetaService.initiateInstrumentSelection(str2, initiateInstrumentSelectionRequest, instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1);
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
                if (!(apiResult instanceof ApiResult.Failure)) {
                    ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, instrumentSelectionLoadingScreen, (AndroidStringManager) disclosurePresenter.stringManager));
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ResponseContext responseContext = ((InitiateInstrumentSelectionResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    disclosurePresenter.navigateToNextScreen(responseContext);
                }
                return Unit.INSTANCE;
            }
        }
        instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1 = new InstrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1(disclosurePresenter, continuationImpl);
        Object obj2 = instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = instrumentSelectionLoadingPresenter$navigateToAddMoneyInstrumentSelection$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$navigateToBitcoinBuyInstrumentSelection(DisclosurePresenter disclosurePresenter, InstrumentSelectionLoadingScreen.InstrumentSelectionParams.BitcoinBuy bitcoinBuy, ContinuationImpl continuationImpl) {
        InstrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1 instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1;
        int i;
        Object obj;
        Long l;
        ApiResult apiResult;
        InstrumentSelectionLoadingScreen instrumentSelectionLoadingScreen = (InstrumentSelectionLoadingScreen) disclosurePresenter.args;
        if (continuationImpl instanceof InstrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1) {
            instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1 = (InstrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1) continuationImpl;
            int i2 = instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj2 = instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj2);
                    CryptoInvestFlowService cryptoInvestFlowService = (CryptoInvestFlowService) disclosurePresenter.launcher;
                    String str = instrumentSelectionLoadingScreen.blockersData.flowToken;
                    RequestContext requestContext = new RequestContext(null, null, null, null, null, null, null, null, 8191);
                    String str2 = bitcoinBuy.instrumentToken;
                    Money money = bitcoinBuy.instrumentAmount;
                    Long l2 = money != null ? money.amount : null;
                    String str3 = bitcoinBuy.balanceToken;
                    Money money2 = bitcoinBuy.balanceAmount;
                    Long l3 = money2 != null ? money2.amount : null;
                    String str4 = bitcoinBuy.restrictedBalanceToken;
                    Money money3 = bitcoinBuy.restrictedBalanceAmount;
                    if (money3 != null) {
                        l = money3.amount;
                        obj = null;
                    } else {
                        obj = null;
                        l = null;
                    }
                    Money money4 = bitcoinBuy.amount;
                    money4.getClass();
                    com.squareup.protos.cash.cryptoinvestflow.service.InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = new com.squareup.protos.cash.cryptoinvestflow.service.InitiateInstrumentSelectionRequest(str2, l2, str3, l3, str4, l, money4.amount, requestContext, Boolean.valueOf(bitcoinBuy.allowBankAccounts), ByteString.EMPTY);
                    instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1.label = 1;
                    obj2 = cryptoInvestFlowService.initiateInstrumentSelection(str, initiateInstrumentSelectionRequest, instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj2);
                    obj = null;
                }
                apiResult = (ApiResult) obj2;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, instrumentSelectionLoadingScreen, (AndroidStringManager) disclosurePresenter.stringManager));
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return obj;
                    }
                    ResponseContext responseContext = ((com.squareup.protos.cash.cryptoinvestflow.service.InitiateInstrumentSelectionResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    disclosurePresenter.navigateToNextScreen(responseContext);
                }
                return Unit.INSTANCE;
            }
        }
        instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1 = new InstrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1(disclosurePresenter, continuationImpl);
        Object obj22 = instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = instrumentSelectionLoadingPresenter$navigateToBitcoinBuyInstrumentSelection$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj22;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$navigateToWithdrawInstrumentSelection(DisclosurePresenter disclosurePresenter, Money money, String str, DepositPreference depositPreference, ContinuationImpl continuationImpl) {
        InstrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1 instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1;
        int i;
        ApiResult apiResult;
        InstrumentSelectionLoadingScreen instrumentSelectionLoadingScreen = (InstrumentSelectionLoadingScreen) disclosurePresenter.args;
        if (continuationImpl instanceof InstrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1) {
            instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1 = (InstrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1) continuationImpl;
            int i2 = instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CashOutService cashOutService = (CashOutService) disclosurePresenter.analytics;
                    String str2 = instrumentSelectionLoadingScreen.blockersData.flowToken;
                    com.squareup.cash.out.api.v1_0.InitiateInstrumentSelectionRequest initiateInstrumentSelectionRequest = new com.squareup.cash.out.api.v1_0.InitiateInstrumentSelectionRequest(str, depositPreference, new RequestContext(null, null, null, null, null, null, null, null, 8191), money, ByteString.EMPTY);
                    instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1.label = 1;
                    obj = cashOutService.initiateInstrumentSelection(str2, initiateInstrumentSelectionRequest, instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1);
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
                if (!(apiResult instanceof ApiResult.Failure)) {
                    ((BetterNavigator.ScreenNavigator) disclosurePresenter.navigator).goTo(TickerKt.toMessageScreen$default((ApiResult.Failure) apiResult, instrumentSelectionLoadingScreen, (AndroidStringManager) disclosurePresenter.stringManager));
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ResponseContext responseContext = ((com.squareup.cash.out.api.v1_0.InitiateInstrumentSelectionResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    disclosurePresenter.navigateToNextScreen(responseContext);
                }
                return Unit.INSTANCE;
            }
        }
        instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1 = new InstrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1(disclosurePresenter, continuationImpl);
        Object obj2 = instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = instrumentSelectionLoadingPresenter$navigateToWithdrawInstrumentSelection$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Unit.INSTANCE;
    }

    public static final void access$routeActionUrl(DisclosurePresenter disclosurePresenter, String str) {
        RealRouter realRouter = (RealRouter) disclosurePresenter.args;
        BorrowHomeOverlay borrowHomeOverlay = (BorrowHomeOverlay) disclosurePresenter.stringManager;
        realRouter.route(new RoutingParams(borrowHomeOverlay, null, borrowHomeOverlay.getParentScreen(), null, null, null, HttpStatusCode.BAD_GATEWAY_502), str);
    }

    public static String getLightningInvoice(BitcoinPayments bitcoinPayments) {
        String invoice;
        if (bitcoinPayments instanceof BitcoinPayments.Bitcoin) {
            LightningInvoice lightningInvoice = ((BitcoinPayments.Bitcoin) bitcoinPayments).bitcoinPayment.lightningInvoice;
            return (lightningInvoice == null || (invoice = lightningInvoice.getInvoice()) == null) ? "" : invoice;
        }
        if (bitcoinPayments instanceof BitcoinPayments.Ethereum) {
            return "";
        }
        if (bitcoinPayments instanceof BitcoinPayments.Lightning) {
            return ((BitcoinPayments.Lightning) bitcoinPayments).invoice.getInvoice();
        }
        if (bitcoinPayments instanceof BitcoinPayments.Stablecoin) {
            return "";
        }
        Drop$$ExternalSyntheticBUOutline0.m1m();
        return null;
    }

    private final Object models$com$squareup$cash$bitcoin$presenters$stablecoin$StablecoinOnboardingPresenter(Flow flow, Composer composer, int i) {
        Triple triple;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(4654724);
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new AmountBlockerPresenter$models$1$2(flow, continuation, this, 19));
        StablecoinOnboardingScreen stablecoinOnboardingScreen = (StablecoinOnboardingScreen) this.args;
        int ordinal = stablecoinOnboardingScreen.onboardingType.ordinal();
        int i2 = 1;
        if (ordinal == 0) {
            triple = new Triple(Integer.valueOf(R.string.stablecoin_onboarding_title), Integer.valueOf(R.string.stablecoin_onboarding_body_markdown), Integer.valueOf(R.string.stablecoin_onboarding_button_label));
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            triple = new Triple(Integer.valueOf(R.string.stablecoin_withdrawal_onboarding_title), Integer.valueOf(R.string.stablecoin_withdrawal_onboarding_body_markdown), Integer.valueOf(R.string.stablecoin_withdrawal_onboarding_button_label));
        }
        int intValue = ((Number) triple.first).intValue();
        int intValue2 = ((Number) triple.second).intValue();
        int intValue3 = ((Number) triple.third).intValue();
        StablecoinOnboardingType stablecoinOnboardingType = stablecoinOnboardingScreen.onboardingType;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new StablecoinOnboardingPresenter$models$1$1(this, continuation, i2);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, stablecoinOnboardingType, (Function2) rememberedValue);
        StablecoinOnboardingViewModel stablecoinOnboardingViewModel = new StablecoinOnboardingViewModel(androidStringManager.get(intValue), androidStringManager.get(intValue2), androidStringManager.get(intValue3));
        gapComposer.end(false);
        return stablecoinOnboardingViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v3, types: [com.google.android.gms.internal.mlkit_genai_prompt.zzage] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.squareup.cash.blockers.viewmodels.InstrumentSelectionViewEvent$Next] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [com.squareup.cash.blockers.viewmodels.SelectedInstrumentModel] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [com.squareup.cash.blockers.screens.InstrumentSelectionData$InstrumentOption$Enabled$SelectOption] */
    /* JADX WARN: Type inference failed for: r1v9, types: [com.squareup.cash.blockers.screens.InstrumentSelectionData$InstrumentOption$Enabled$SelectOption] */
    /* JADX WARN: Type inference failed for: r5v4, types: [kotlin.coroutines.Continuation] */
    private final Object models$com$squareup$cash$blockers$presenters$InstrumentSelectionBlockerPresenter(Flow flow, Composer composer, int i) {
        String str;
        ?? r14;
        ?? r16;
        Object selecting;
        InstrumentSelectionData instrumentSelectionData = ((BlockersScreens.InstrumentSelectionScreen) this.appService).data;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1306759491);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(instrumentSelectionData.initialSelectedOption);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default(instrumentSelectionData.initialSecondarySelectedOption);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        MutableState mutableState3 = (MutableState) rememberedValue3;
        Updater.LaunchedEffect(gapComposer, flow, new RealIdvPresenter$models$1$1((Object) flow, (Continuation) null, (MoleculePresenter) this, mutableState2, (Object) mutableState, (State) mutableState3, 4));
        InstrumentSelectionBlockerPresenter$SubmissionData instrumentSelectionBlockerPresenter$SubmissionData = (InstrumentSelectionBlockerPresenter$SubmissionData) mutableState3.getValue();
        if (instrumentSelectionBlockerPresenter$SubmissionData != null) {
            gapComposer.startReplaceGroup(-1106477359);
            ?? r5 = 0;
            Updater.LaunchedEffect(gapComposer, instrumentSelectionBlockerPresenter$SubmissionData, new SetNamePresenter$models$1$1$1(19, mutableState3, this, instrumentSelectionBlockerPresenter$SubmissionData, (Continuation) r5));
            gapComposer.end(false);
            str = r5;
        } else {
            str = null;
            gapComposer.startReplaceGroup(-1106436997);
            gapComposer.end(false);
        }
        if (((InstrumentSelectionBlockerPresenter$SubmissionData) mutableState3.getValue()) != null) {
            selecting = InstrumentSelectionViewModel.Submitting.INSTANCE;
        } else {
            boolean z = (((InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState.getValue()) instanceof InstrumentSelectionData.InstrumentOption.Enabled.SelectOption) && (((InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState2.getValue()) == null || (((InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState2.getValue()) instanceof InstrumentSelectionData.InstrumentOption.Enabled.SelectOption));
            InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption = instrumentSelectionData.useSecondaryOptionDetails ? (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState2.getValue() : (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState.getValue();
            Object detail = preselectableOption != null ? preselectableOption.getDetail() : str;
            String headerText = ((InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState.getValue()).getHeaderText();
            if (headerText == null) {
                headerText = instrumentSelectionData.headerText;
            }
            String str2 = headerText;
            if (detail instanceof InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailText) {
                InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailText detailText = (InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailText) detail;
                String str3 = detailText.text;
                if (str3 == null) {
                    str3 = "";
                }
                r14 = new InstrumentDetailModel$InstrumentDetailTextModel(str3, detailText.dialog != null);
            } else if (detail instanceof InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList) {
                ArrayList<InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList.DetailRow> arrayList = ((InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList) detail).detailRows;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                for (InstrumentSelectionData.InstrumentOption.PreselectableOption.Detail.DetailList.DetailRow detailRow : arrayList) {
                    arrayList2.add(new InstrumentDetailRowModel(detailRow.label, detailRow.value, detailRow.dialog != null));
                }
                r14 = new InstrumentDetailModel$InstrumentDetailListModel(arrayList2);
            } else {
                r14 = str;
            }
            String str4 = instrumentSelectionData.submitButtonText;
            if (z) {
                InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption2 = (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState.getValue();
                preselectableOption2.getClass();
                InstrumentSelectionData.InstrumentOption.Enabled.SelectOption selectOption = (InstrumentSelectionData.InstrumentOption.Enabled.SelectOption) preselectableOption2;
                InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption3 = (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState2.getValue();
                r16 = new InstrumentSelectionViewEvent.Next(selectOption, preselectableOption3 instanceof InstrumentSelectionData.InstrumentOption.Enabled.SelectOption ? (InstrumentSelectionData.InstrumentOption.Enabled.SelectOption) preselectableOption3 : str);
            } else {
                r16 = str;
            }
            SelectedInstrumentModel model = toModel((InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState.getValue(), instrumentSelectionData.selectedInstrumentLabel, instrumentSelectionData.preselectedOptionAction);
            InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption4 = (InstrumentSelectionData.InstrumentOption.PreselectableOption) mutableState2.getValue();
            selecting = new InstrumentSelectionViewModel.Selecting(str2, r14, str4, r16, model, preselectableOption4 != null ? toModel(preselectableOption4, str, instrumentSelectionData.preselectedSecondaryOptionAction) : str);
        }
        gapComposer.end(false);
        return selecting;
    }

    private final Object models$com$squareup$cash$blockers$presenters$StripeLinkPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-411301435);
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = Updater.mutableStateOf$default(StripeLinkViewModel.Loading.INSTANCE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Continuation continuation = null;
        CallbackFlowBuilder callbackFlow = FlowKt.callbackFlow(new RealTabProvider$setup$1$5(2, continuation, 8));
        Updater.LaunchedEffect(gapComposer, callbackFlow, new FileBlockerView$6$2$2(callbackFlow, continuation, this, 4));
        Updater.LaunchedEffect(gapComposer, flow, new RealBoostSelector$removeBoost$1(flow, continuation, this, mutableState, 5));
        StripeLinkViewModel stripeLinkViewModel = (StripeLinkViewModel) mutableState.getValue();
        gapComposer.end(false);
        return stripeLinkViewModel;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object models$com$squareup$cash$borrow$presenters$BorrowHomeOverlayPresenter(Flow flow, Composer composer, int i) {
        Object sheet;
        BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset infoSheetAsset;
        BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset iconAsset;
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment textAlignment;
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment textAlignment2;
        LoanRepaymentSelectionData loanRepaymentSelectionData;
        BorrowHomeOverlayViewModel.SheetButton sheetButton;
        SheetButtonAction actionUrl;
        BorrowHomeOverlay borrowHomeOverlay = (BorrowHomeOverlay) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(181801866);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            if (borrowHomeOverlay instanceof BorrowHomeOverlay.BulletinInfo) {
                BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet = ((BorrowHomeOverlay.BulletinInfo) borrowHomeOverlay).infoSheet;
                infoSheet.getClass();
                Boolean bool = infoSheet.render_as_modal;
                LocalizedString localizedString = infoSheet.primary_button_text;
                LocalizedString localizedString2 = infoSheet.detail_text;
                LocalizedString localizedString3 = infoSheet.primary_text;
                LocalizedString localizedString4 = infoSheet.footer_text;
                if (Intrinsics.areEqual(bool, Boolean.TRUE)) {
                    boolean isEmpty = infoSheet.bullets.isEmpty();
                    boolean z = localizedString4 != null;
                    if (!isEmpty || z) {
                        Timber.Forest.w("BulletinInfoModal dropped unsupported Bulletin.InfoSheet %s", (isEmpty || !z) ? !isEmpty ? "bullets" : "footer_text" : "bullets and footer_text");
                    }
                    Image image = infoSheet.image;
                    localizedString3.getClass();
                    String str = localizedString3.translated_value;
                    str.getClass();
                    String str2 = localizedString2 != null ? localizedString2.translated_value : null;
                    localizedString.getClass();
                    String str3 = localizedString.translated_value;
                    str3.getClass();
                    String str4 = infoSheet.primary_action_url;
                    LocalizedString localizedString5 = infoSheet.dismiss_button_text;
                    sheet = new BorrowHomeOverlayViewModel.InfoModal(image, str, str2, str3, str4, localizedString5 != null ? localizedString5.translated_value : null);
                } else {
                    Color color = infoSheet.tint_color;
                    Image image2 = infoSheet.image;
                    if (image2 != null) {
                        iconAsset = new BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset.ImageAsset(image2);
                    } else {
                        BorrowAppletBulletinsTile.Data.Bulletin.Icon icon = infoSheet.icon;
                        if (icon != null) {
                            iconAsset = new BorrowHomeOverlayViewModel.InfoSheet.InfoSheetAsset.IconAsset(icon);
                        } else {
                            infoSheetAsset = null;
                            localizedString3.getClass();
                            String str5 = localizedString3.translated_value;
                            str5.getClass();
                            textAlignment = infoSheet.primary_text_alignment;
                            if (textAlignment == null) {
                                textAlignment = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment.LEADING;
                            }
                            BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment textAlignment3 = textAlignment;
                            String str6 = localizedString2 == null ? localizedString2.translated_value : null;
                            textAlignment2 = infoSheet.detail_text_alignment;
                            if (textAlignment2 == null) {
                                textAlignment2 = BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment.LEADING;
                            }
                            BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment textAlignment4 = textAlignment2;
                            List list = infoSheet.bullets;
                            Timeline timeline = infoSheet.timeline;
                            String str7 = localizedString4 == null ? localizedString4.translated_value : null;
                            loanRepaymentSelectionData = infoSheet.primary_repayment_selection;
                            if (loanRepaymentSelectionData == null) {
                                actionUrl = new SheetButtonAction.RepaymentSelection(loanRepaymentSelectionData);
                            } else {
                                String str8 = infoSheet.primary_action_url;
                                if (str8 != null) {
                                    actionUrl = new SheetButtonAction.ActionUrl(str8);
                                } else {
                                    sheetButton = null;
                                    sheet = new BorrowHomeOverlayViewModel.InfoSheet(color, infoSheetAsset, str5, textAlignment3, str6, textAlignment4, list, timeline, str7, sheetButton);
                                }
                            }
                            localizedString.getClass();
                            String str9 = localizedString.translated_value;
                            str9.getClass();
                            sheetButton = new BorrowHomeOverlayViewModel.SheetButton(actionUrl, str9);
                            sheet = new BorrowHomeOverlayViewModel.InfoSheet(color, infoSheetAsset, str5, textAlignment3, str6, textAlignment4, list, timeline, str7, sheetButton);
                        }
                    }
                    infoSheetAsset = iconAsset;
                    localizedString3.getClass();
                    String str52 = localizedString3.translated_value;
                    str52.getClass();
                    textAlignment = infoSheet.primary_text_alignment;
                    if (textAlignment == null) {
                    }
                    BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment textAlignment32 = textAlignment;
                    if (localizedString2 == null) {
                    }
                    textAlignment2 = infoSheet.detail_text_alignment;
                    if (textAlignment2 == null) {
                    }
                    BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.TextAlignment textAlignment42 = textAlignment2;
                    List list2 = infoSheet.bullets;
                    Timeline timeline2 = infoSheet.timeline;
                    if (localizedString4 == null) {
                    }
                    loanRepaymentSelectionData = infoSheet.primary_repayment_selection;
                    if (loanRepaymentSelectionData == null) {
                    }
                    localizedString.getClass();
                    String str92 = localizedString.translated_value;
                    str92.getClass();
                    sheetButton = new BorrowHomeOverlayViewModel.SheetButton(actionUrl, str92);
                    sheet = new BorrowHomeOverlayViewModel.InfoSheet(color, infoSheetAsset, str52, textAlignment32, str6, textAlignment42, list2, timeline2, str7, sheetButton);
                }
            } else if (borrowHomeOverlay instanceof BorrowHomeOverlay.LoanDetails) {
                BorrowHomeOverlay.LoanDetails loanDetails = (BorrowHomeOverlay.LoanDetails) borrowHomeOverlay;
                sheet = WindowInfoImpl.Companion.toSheet(loanDetails.details, loanDetails.token);
            } else {
                if (!(borrowHomeOverlay instanceof BorrowHomeOverlay.RepaymentSelection)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                TimeZone timeZone = ((AndroidClock) this.blockersNavigator).timeZone();
                sheet = WindowInfoImpl.Companion.toSheet(((BorrowHomeOverlay.RepaymentSelection) borrowHomeOverlay).data, timeZone, iconDateFormatter(timeZone), subtitleDateFormatter(timeZone));
            }
            rememberedValue = Updater.mutableStateOf$default(sheet);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Updater.LaunchedEffect(gapComposer, flow, new RealBoostSelector$removeBoost$1(flow, continuation, this, mutableState, 12));
        BorrowHomeOverlayViewModel borrowHomeOverlayViewModel = (BorrowHomeOverlayViewModel) mutableState.getValue();
        boolean changedInstance = gapComposer.changedInstance(borrowHomeOverlayViewModel) | gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new InteractiveCardView$flingTo$1.AnonymousClass2(borrowHomeOverlayViewModel, this, continuation, 19);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, borrowHomeOverlayViewModel, (Function2) rememberedValue2);
        BorrowHomeOverlayViewModel borrowHomeOverlayViewModel2 = (BorrowHomeOverlayViewModel) mutableState.getValue();
        gapComposer.end(false);
        return borrowHomeOverlayViewModel2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel$Content$Button] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20, types: [com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel$Content$Button] */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    private final Object models$com$squareup$cash$card$spendinginsights$presenters$SpendingInsightDetailPresenter(Flow flow, Composer composer, int i) {
        Object obj;
        Long valueOf;
        Continuation continuation;
        StackedBarChartViewModel stackedBarChartViewModel;
        ?? r10;
        SpendingInsightDetailViewModel.Content.SpendingAnalysis card;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1033100111);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation2 = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new CardStudioPresenter$models$1$1(this, mutableState, continuation2, 18);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new CardStudioPresenter$models$1$1(flow, continuation2, this, 17));
        SpendingInsight spendingInsight = (SpendingInsight) mutableState.getValue();
        if (spendingInsight != null) {
            ArrayList<ColoredText> arrayList = spendingInsight.title;
            ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            for (ColoredText coloredText : arrayList) {
                arrayList2.add(new SpendingInsightDetailViewModel.Content.ColoredString(coloredText.color, coloredText.text));
            }
            SpendingInsight.TitleSize titleSize = spendingInsight.titleSize;
            String str = spendingInsight.subtitle;
            SpendingInsight.HorizontalBarGraph horizontalBarGraph = spendingInsight.graph;
            ArrayList<SpendingInsight.HorizontalBarGraph.Bar> arrayList3 = horizontalBarGraph.bars;
            Iterator it = arrayList3.iterator();
            if (it.hasNext()) {
                valueOf = Long.valueOf(((SpendingInsight.HorizontalBarGraph.Bar) it.next()).value);
                while (it.hasNext()) {
                    Long valueOf2 = Long.valueOf(((SpendingInsight.HorizontalBarGraph.Bar) it.next()).value);
                    if (valueOf.compareTo(valueOf2) < 0) {
                        valueOf = valueOf2;
                    }
                }
            } else {
                valueOf = null;
            }
            if (valueOf != null) {
                long longValue = valueOf.longValue();
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList3, 10));
                for (SpendingInsight.HorizontalBarGraph.Bar bar : arrayList3) {
                    long j = bar.value;
                    String str2 = bar.valueText;
                    Continuation continuation3 = continuation2;
                    String str3 = bar.label;
                    float f = j / longValue;
                    StackedBarChartViewModel$Bar$BarImage$Avatar stackedBarChartViewModel$Bar$BarImage$Avatar = new StackedBarChartViewModel$Bar$BarImage$Avatar(StackedAvatarViewModelKt.toStackedAvatarViewModel(bar.avatar));
                    if (Float.isNaN(f)) {
                        f = RecyclerView.DECELERATION_RATE;
                    }
                    arrayList4.add(new StackedBarChartViewModel.Bar(stackedBarChartViewModel$Bar$BarImage$Avatar, str3, str2, f, new StackedBarChartViewEvent$BarTapped(bar.clientRoute), Recorder$$ExternalSyntheticOutline2.m(str3, " ", str2)));
                    continuation2 = continuation3;
                }
                continuation = continuation2;
                SpendingInsight.HorizontalBarGraph.BarColors barColors = horizontalBarGraph.barColors;
                stackedBarChartViewModel = new StackedBarChartViewModel(arrayList4, barColors.bar, barColors.text);
            } else {
                continuation = null;
                stackedBarChartViewModel = null;
            }
            SpendingInsight.SpendingAnalysis spendingAnalysis = spendingInsight.spendingAnalysis;
            if (spendingAnalysis != null) {
                ArrayList<SpendingInsight.SpendingAnalysis.AnalysisCategory> arrayList5 = spendingAnalysis.categories;
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList5, 10));
                for (SpendingInsight.SpendingAnalysis.AnalysisCategory analysisCategory : arrayList5) {
                    int ordinal = spendingAnalysis.displayType.ordinal();
                    if (ordinal == 0) {
                        String str4 = analysisCategory.title;
                        String str5 = analysisCategory.text;
                        SpendingInsight.Button button = analysisCategory.button;
                        card = new SpendingInsightDetailViewModel.Content.SpendingAnalysis.Card(str4, str5, button != null ? toButton(button) : continuation);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return continuation;
                        }
                        String str6 = analysisCategory.title;
                        String str7 = analysisCategory.text;
                        Image image = analysisCategory.icon;
                        SpendingInsight.Button button2 = analysisCategory.button;
                        card = new SpendingInsightDetailViewModel.Content.SpendingAnalysis.Inline(str6, image, str7, button2 != null ? toButton(button2) : continuation);
                    }
                    arrayList6.add(card);
                }
                r10 = arrayList6;
            } else {
                r10 = continuation;
            }
            obj = new SpendingInsightDetailViewModel.Content(arrayList2, titleSize, str, stackedBarChartViewModel, r10, toButton(spendingInsight.button));
        } else {
            obj = SpendingInsightDetailViewModel.Loading.INSTANCE;
        }
        gapComposer.end(false);
        return obj;
    }

    private final Object models$com$squareup$cash$discover$promotiondetails$presenters$PromotionDetailsPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1384750888);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new RealProfileManager$profileOrNull$2(this, continuation, 7);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        PromotionDetails promotionDetails = (PromotionDetails) this.analytics;
        PromotionDetailsTransitionFactory$AnimationData promotionDetailsTransitionFactory$AnimationData = promotionDetails.animationData;
        PromotionDetailsViewModel.Loading loading = new PromotionDetailsViewModel.Loading(promotionDetailsTransitionFactory$AnimationData != null ? promotionDetailsTransitionFactory$AnimationData.id : null);
        PromotionDetails.Identifier identifier = promotionDetails.identifier;
        boolean changedInstance2 = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new EntitySyncerKt$hasSyncedFlow$1(this, continuation, 26);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState produceState = Updater.produceState(loading, identifier, (Function2) rememberedValue2, gapComposer, 0);
        Flow flow2 = (Flow) this.appService;
        Updater.LaunchedEffect(gapComposer, flow2, new EarningsHomePresenter$models$3$1(flow2, continuation, this, 2));
        Updater.LaunchedEffect(gapComposer, flow, new VerifyCheckDepositPresenter$models$3$1(flow, continuation, (MoleculePresenter) this, (State) produceState, 29));
        PromotionDetailsViewModel promotionDetailsViewModel = (PromotionDetailsViewModel) produceState.getValue();
        gapComposer.end(false);
        return promotionDetailsViewModel;
    }

    private final Object models$com$squareup$cash$family$applets$presenters$AllowanceAppletTilePresenter(Flow flow, Composer composer, int i) {
        Object failure;
        Object obj;
        Object obj2;
        MoneyFormatter moneyFormatter = (MoneyFormatter) this.launcher;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        String str = (String) this.navigator;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-937334840);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealAllowanceAppletTileRepository) this.analytics).allowancePayments;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = ((RealRecurringPaymentsManager) this.appService).optimisticPaymentDisplay;
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState2 = Updater.collectAsState((StateFlow) rememberedValue2, null, gapComposer, 1);
        Updater.LaunchedEffect(gapComposer, flow, new EarningsHomePresenter$models$3$1(flow, continuation, this, 11));
        RecurringPayments recurringPayments = (RecurringPayments) collectAsState.getValue();
        if (recurringPayments instanceof RecurringPayments.Loading) {
            failure = new AllowanceAppletTileViewModel.Loading(str, androidStringManager.get(R.string.allowance_tile_loading_content_description));
        } else if (recurringPayments instanceof RecurringPayments.Loaded) {
            RecurringPayments.Loaded loaded = (RecurringPayments.Loaded) recurringPayments;
            String str2 = loaded.initializationUrl;
            ArrayList arrayList = loaded.recurringPayments;
            if (arrayList.isEmpty() && str2 != null && ((OptimisticRecurringPaymentDisplay) collectAsState2.getValue()) == null) {
                failure = new AllowanceAppletTileViewModel.Uninstalled(str, androidStringManager.get(R.string.allowance_applet_nux_subtitle), str2);
            } else {
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (!((RecurringPayment) obj).isCanceled) {
                        break;
                    }
                }
                if (obj != null) {
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it2.next();
                        if (!((RecurringPayment) obj2).isCanceled) {
                            break;
                        }
                    }
                    if (obj2 == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    RecurringPayment recurringPayment = (RecurringPayment) obj2;
                    failure = new AllowanceAppletTileViewModel.Installed(str, new Allowance.Current(moneyFormatter.format(recurringPayment.amount), recurringPayment.scheduleDescription, recurringPayment.editUrl));
                } else if (((OptimisticRecurringPaymentDisplay) collectAsState2.getValue()) != null) {
                    OptimisticRecurringPaymentDisplay optimisticRecurringPaymentDisplay = (OptimisticRecurringPaymentDisplay) collectAsState2.getValue();
                    if (optimisticRecurringPaymentDisplay == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                        return null;
                    }
                    failure = new AllowanceAppletTileViewModel.Installed(str, new Allowance.Current(moneyFormatter.format(optimisticRecurringPaymentDisplay.amount), optimisticRecurringPaymentDisplay.scheduleDescription, null));
                } else {
                    failure = new AllowanceAppletTileViewModel.Installed(str, new Allowance.None(androidStringManager.get(R.string.allowance_tile_installed_subtitle_no_current_allowance), str2));
                }
            }
        } else {
            if (!(recurringPayments instanceof RecurringPayments.NotLoaded) && !(recurringPayments instanceof RecurringPayments.Error)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            failure = new AllowanceAppletTileViewModel.Failure(str);
        }
        gapComposer.end(false);
        return failure;
    }

    private final Object models$com$squareup$cash$family$applets$presenters$FamilyAppletTilePresenter(Flow flow, Composer composer, int i) {
        Object obj;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2003195050);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealFamilyAppletTileRepository) this.appService).familyAppletTileViewModel;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Continuation continuation = null;
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        VerifyCheckDialogPresenter verifyCheckDialogPresenter = (VerifyCheckDialogPresenter) this.navigator;
        verifyCheckDialogPresenter.getClass();
        gapComposer.startReplaceGroup(-1613152821);
        boolean changed = gapComposer.changed(((AppletId) verifyCheckDialogPresenter.navigator).ordinal());
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new InviteContactsPresenter$special$$inlined$map$1(((RealPromotedAppletTileStore) verifyCheckDialogPresenter.args).getPromotedAppletTiles(), verifyCheckDialogPresenter, 17);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        PromotedAppletTileViewModel promotedAppletTileViewModel = (PromotedAppletTileViewModel) Updater.collectAsState((Flow) rememberedValue2, PromotedAppletTileViewModel.Loading.INSTANCE, null, gapComposer, 0, 2).getValue();
        gapComposer.end(false);
        PromotedAppletTileViewModel.Loaded loaded = promotedAppletTileViewModel instanceof PromotedAppletTileViewModel.Loaded ? (PromotedAppletTileViewModel.Loaded) promotedAppletTileViewModel : null;
        Updater.LaunchedEffect(gapComposer, flow, new EarningsHomePresenter$models$3$1(flow, continuation, this, 14));
        FamilyAppletTileViewModel familyAppletTileViewModel = (FamilyAppletTileViewModel) collectAsState.getValue();
        if (familyAppletTileViewModel instanceof FamilyAppletTileViewModel.Uninstalled) {
            FamilyAppletTileViewModel.Uninstalled uninstalled = (FamilyAppletTileViewModel.Uninstalled) familyAppletTileViewModel;
            String str = uninstalled.title;
            String str2 = uninstalled.subtitle;
            str.getClass();
            str2.getClass();
            obj = new FamilyAppletTileViewModel.Uninstalled(str, str2, loaded);
        } else {
            obj = (FamilyAppletTileViewModel) collectAsState.getValue();
        }
        gapComposer.end(false);
        return obj;
    }

    private final Object models$com$squareup$cash$growtools$presenters$manager$activity$GrowToolsCompleteActivityPresenter(Flow flow, Composer composer, int i) {
        OriginSpecificData.TotalStats totalStats;
        String str;
        Money money;
        Integer num;
        GrowToolsCompleteActivityScreen growToolsCompleteActivityScreen = (GrowToolsCompleteActivityScreen) this.appService;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-2017428818);
        Continuation continuation = null;
        Updater.LaunchedEffect(gapComposer, flow, new AnimationsKt$takeUntil$1$1.AnonymousClass1(flow, continuation, this, 27));
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = (DerivedStateFlow) this.args;
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1);
        GrowToolsManagerScreen growToolsManagerScreen = growToolsCompleteActivityScreen.managerScreen;
        if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageRoundUpsScreen) {
            gapComposer.startReplaceGroup(-1744090082);
            GrowToolsManagerScreen.Origin origin = ((GrowToolsManagerScreen.ManageRoundUpsScreen) growToolsManagerScreen).origin;
            RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo = (RealBitcoinRoundUpsRepo) this.analytics;
            UiInvestingAutomation uiInvestingAutomation = (UiInvestingAutomation) collectAsState.getValue();
            origin.getClass();
            if (RoundUpsOriginSpecificDataUtilsKt$WhenMappings.$EnumSwitchMapping$0[origin.ordinal()] == 1) {
                gapComposer.startReplaceGroup(244488713);
                totalStats = ClosedRange.DefaultImpls.bitcoinStats(realBitcoinRoundUpsRepo, gapComposer);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1010729090);
                if (uiInvestingAutomation == null) {
                    gapComposer.startReplaceGroup(-1010729091);
                    gapComposer.end(false);
                    totalStats = null;
                } else {
                    gapComposer.startReplaceGroup(-1010729090);
                    UiInvestingAutomation.UiAutomationStatistics uiAutomationStatistics = uiInvestingAutomation.statistics;
                    uiAutomationStatistics.getClass();
                    Integer num2 = uiAutomationStatistics.number_of_executions;
                    num2.getClass();
                    Money money2 = uiAutomationStatistics.total_amount_invested;
                    money2.getClass();
                    OriginSpecificData.TotalStats totalStats2 = new OriginSpecificData.TotalStats(num2, money2);
                    gapComposer.end(false);
                    totalStats = totalStats2;
                }
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1743988465);
            gapComposer.end(false);
            totalStats = null;
        }
        MutableState rememberUpdatedState = Updater.rememberUpdatedState(totalStats, gapComposer);
        ArrayList arrayList = new ArrayList();
        OriginSpecificData.TotalStats totalStats3 = (OriginSpecificData.TotalStats) rememberUpdatedState.getValue();
        if (totalStats3 != null && (num = totalStats3.count) != null) {
            arrayList.add(new GrowToolsActivityViewModel.TotalStat(androidStringManager.get(R.string.grow_tools_roundups_count_label), String.valueOf(num.intValue())));
        }
        OriginSpecificData.TotalStats totalStats4 = (OriginSpecificData.TotalStats) rememberUpdatedState.getValue();
        if (totalStats4 != null && (money = totalStats4.amount) != null) {
            arrayList.add(new GrowToolsActivityViewModel.TotalStat(androidStringManager.get(R.string.grow_tools_complete_activity_amount_label), ((MoneyFormatter) this.blockersNavigator).format(money)));
        }
        MutableState rememberUpdatedState2 = Updater.rememberUpdatedState(((RealActivityEmbeddedPresenter) this.launcher).models(gapComposer, 0), gapComposer);
        gapComposer.startReplaceGroup(-1106477359);
        Updater.LaunchedEffect(gapComposer, arrayList, new GLSceneScopeProvider$SceneScope$2$1$1(arrayList, continuation, rememberUpdatedState2, 21));
        gapComposer.end(false);
        GrowToolsManagerScreen growToolsManagerScreen2 = growToolsCompleteActivityScreen.managerScreen;
        growToolsManagerScreen2.getClass();
        if (growToolsManagerScreen2 instanceof GrowToolsManagerScreen.ManageAutoInvestScreen) {
            if (GrowToolsProductClassifierUtilsKt$WhenMappings.$EnumSwitchMapping$0[((GrowToolsManagerScreen.ManageAutoInvestScreen) growToolsManagerScreen2).origin.ordinal()] != 1) {
                throw new NotImplementedError("An operation is not implemented: Not supported yet");
            }
            str = androidStringManager.get(R.string.grow_tools_auto_invest_bitcoin_title);
        } else if (growToolsManagerScreen2 instanceof GrowToolsManagerScreen.ManageDirectDepositScreen) {
            if (GrowToolsProductClassifierUtilsKt$WhenMappings.$EnumSwitchMapping$0[((GrowToolsManagerScreen.ManageDirectDepositScreen) growToolsManagerScreen2).origin.ordinal()] != 1) {
                throw new NotImplementedError("An operation is not implemented: Not supported yet");
            }
            str = androidStringManager.get(R.string.grow_tools_direct_deposit_bitcoin_title);
        } else if (growToolsManagerScreen2 instanceof GrowToolsManagerScreen.ManageRoundUpsScreen) {
            str = GrowToolsProductClassifierUtilsKt$WhenMappings.$EnumSwitchMapping$0[((GrowToolsManagerScreen.ManageRoundUpsScreen) growToolsManagerScreen2).origin.ordinal()] == 1 ? androidStringManager.get(R.string.grow_tools_roundups_bitcoin_title) : androidStringManager.get(R.string.grow_tools_roundups_complete_activity_title);
        } else if (growToolsManagerScreen2 instanceof GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen) {
            str = androidStringManager.get(R.string.grow_tools_receive_p2p_as_bitcoin_title);
        } else {
            if (!(growToolsManagerScreen2 instanceof GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = androidStringManager.get(R.string.grow_tools_bitcoin_auto_withdraw_title);
        }
        GrowToolsActivityViewModel growToolsActivityViewModel = new GrowToolsActivityViewModel(str, arrayList, (UiCallbackModel) rememberUpdatedState2.getValue());
        gapComposer.end(false);
        return growToolsActivityViewModel;
    }

    private final Object models$com$squareup$cash$history$presenters$CancelPendingSupPaymentPresenter(Flow flow, Composer composer, int i) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1253434392);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new RealProfileManager$profileOrNull$2(this, continuation, 25);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2(flow, continuation, this, mutableState, 7));
        CancelPendingSupPaymentViewModel cancelPendingSupPaymentViewModel = new CancelPendingSupPaymentViewModel(androidStringManager.get(R.string.cancel_pending_sup_payment_title), androidStringManager.get(R.string.cancel_pending_sup_payment_body), androidStringManager.get(R.string.cancel), androidStringManager.get(R.string.go_back), ((Boolean) mutableState.getValue()).booleanValue());
        gapComposer.end(false);
        return cancelPendingSupPaymentViewModel;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object models$com$squareup$cash$investing$presenters$DependentWelcomePresenter(Flow flow, Composer composer, int i) {
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.navigator;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1482562197);
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Updater.LaunchedEffect(gapComposer, flow, new InvestingHomeView$onScrollFlow$1(flow, (Continuation) null, this, 4));
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        boolean z = false;
        if (((InvestingScreens.DependentWelcomeScreen) this.launcher).checkDependentStatus) {
            gapComposer.startReplaceGroup(-1861116468);
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CheckStatusPresenter.AnonymousClass1(this, mutableState, objArr == true ? 1 : 0, 17);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1860952137);
            gapComposer.end(false);
        }
        if (((ClientSyncer$Result) mutableState.getValue()) != null) {
            gapComposer.startReplaceGroup(-1860911434);
            InvestingState investingStates = ((RealInvestingStateManager) this.blockersNavigator).investingStates(gapComposer);
            InvestingState.Content content = investingStates instanceof InvestingState.Content ? (InvestingState.Content) investingStates : null;
            if (Intrinsics.areEqual(content != null ? Boolean.valueOf(ComparingOperation.DefaultImpls.getNeedsApprovalToAccessInvestingFeatures(content)) : null, Boolean.FALSE)) {
                screenNavigator.goTo(Back.INSTANCE);
                AppNavigateOpenSpace.SourceTab sourceTab = AppNavigateOpenSpace.SourceTab.BANKING;
                AppNavigateOpenSpace.Source source = AppNavigateOpenSpace.Source.TOP_NAV_BAR_BUTTON;
                screenNavigator.goTo(new InvestingScreens.InvestingHome(objArr3 == true ? 1 : 0, objArr2 == true ? 1 : 0, 57, z));
            }
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(-1860572201);
            gapComposer.end(false);
        }
        DependentWelcomeViewModel dependentWelcomeViewModel = (DependentWelcomeViewModel) this.args;
        gapComposer.end(false);
        return dependentWelcomeViewModel;
    }

    private final Object models$com$squareup$cash$investing$presenters$categories$InvestingCategoryDetailPresenter(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(773321424);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = ((RealCategoryBackend) this.appService).categoryDetails((CategoryToken) this.launcher);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, null, null, gapComposer, 48, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        Continuation continuation = null;
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) rememberedValue2;
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        CoroutineScope coroutineScope = (CoroutineScope) rememberedValue3;
        boolean changedInstance = gapComposer.changedInstance(coroutineScope) | gapComposer.changedInstance(this) | gapComposer.changedInstance(mutableSharedFlow);
        Object rememberedValue4 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue4 == neverEqualPolicy) {
            rememberedValue4 = new MoneyTabSectionUIKt$$ExternalSyntheticLambda6(14, coroutineScope, this, mutableSharedFlow);
            gapComposer.updateRememberedValue(rememberedValue4);
        }
        Function2 function2 = (Function2) rememberedValue4;
        AnswerDispatcher answerDispatcher = (AnswerDispatcher) gapComposer.consume(AnswersKt.LocalAnswerDispatcher);
        boolean changed = gapComposer.changed(function2) | gapComposer.changedInstance(answerDispatcher);
        Object rememberedValue5 = gapComposer.rememberedValue();
        int i2 = 2;
        if (changed || rememberedValue5 == neverEqualPolicy) {
            rememberedValue5 = new ArticlePresenter$models$$inlined$AnswerHandler$1(function2, answerDispatcher, i2);
            gapComposer.updateRememberedValue(rememberedValue5);
        }
        Updater.DisposableEffect(answerDispatcher, (Function1) rememberedValue5, gapComposer);
        Updater.LaunchedEffect(gapComposer, flow, new GLThread$start$2(flow, continuation, this, collectAsState, 17));
        if (((CategoryDetails) collectAsState.getValue()) == null) {
            gapComposer.end(false);
            return InvestingCategoryDetailViewModel.Loading.INSTANCE;
        }
        CategoryDetails categoryDetails = (CategoryDetails) collectAsState.getValue();
        categoryDetails.getClass();
        Category category = categoryDetails.category;
        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changedInstance(category);
        Object rememberedValue6 = gapComposer.rememberedValue();
        int i3 = 1;
        if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
            rememberedValue6 = new GenieViewKt$GenieView$1$1(this, category, continuation, i3);
            gapComposer.updateRememberedValue(rememberedValue6);
        }
        Updater.LaunchedEffect(gapComposer, this, (Function2) rememberedValue6);
        InvestingSearchViewModel models = ((InvestingSearchPresenter) this.args).models((Flow) FlowKt.merge(flow, mutableSharedFlow), (Composer) gapComposer, 0);
        String str = category.imageUrl;
        str.getClass();
        Image image = new Image(str, str, 4);
        Color color = category.color;
        color.getClass();
        InvestingCryptoAvatarContentModel$ImageWithBackground investingCryptoAvatarContentModel$ImageWithBackground = new InvestingCryptoAvatarContentModel$ImageWithBackground(image, color, ColorsKt.toColor(-1));
        String str2 = category.name;
        String str3 = category.description;
        str3.getClass();
        InvestingCategoryDetailViewModel.Content content = new InvestingCategoryDetailViewModel.Content(investingCryptoAvatarContentModel$ImageWithBackground, str2, str3, models.filterGroupCarousel, models.results);
        gapComposer.end(false);
        return content;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v8 */
    private final Object models$com$squareup$cash$moneybot$presenters$MoneybotDebugOverlayPresenter(Flow flow, Composer composer, int i) {
        MoneybotDebugOverlayViewModel.Sheet.Main main;
        Object obj;
        String str;
        String valueOf;
        Chat chat;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-662441286);
        TokenUsageViewModel tokenUsageViewModel = 0;
        tokenUsageViewModel = 0;
        MutableState collectAsState = Updater.collectAsState(((MoneybotDebugSettingsManager) this.blockersNavigator).showRawMarkdown, null, gapComposer, 1);
        ChatSourceContext chatSourceContext = ((MoneybotDebugOverlayScreen) this.analytics).chatSourceContext;
        String str2 = chatSourceContext != null ? chatSourceContext.loadableSessionId : null;
        Updater.LaunchedEffect(gapComposer, flow, new CashMapPresenter$models$3$1(flow, (Continuation) tokenUsageViewModel, this, 25));
        int ordinal = ((MoneybotDebugOverlayState) ((ParcelableSnapshotMutableState) this.args).getValue()).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                if (str2 != null) {
                    CachedChat cachedChat = ((RealChatManager) ((ChatManager) this.appService)).getCachedChat(str2);
                    TokenInfo tokenInfo = (cachedChat == null || (chat = cachedChat.chat) == null) ? null : chat.tokenInfo;
                    if (tokenInfo != null) {
                        String str3 = ((AndroidStringManager) this.stringManager).get(R.string.moneybot_token_usage_unavailable);
                        Integer num = tokenInfo.tokenUsage;
                        Integer num2 = tokenInfo.tokenLimit;
                        float intValue = (num == null || num2 == null || num2.intValue() <= 0) ? RecyclerView.DECELERATION_RATE : num.intValue() / num2.intValue();
                        String str4 = tokenInfo.modelName;
                        if (str4 == null) {
                            str4 = str3;
                        }
                        if (num == null || (str = String.valueOf(num.intValue())) == null) {
                            str = str3;
                        }
                        if (num2 != null && (valueOf = String.valueOf(num2.intValue())) != null) {
                            str3 = valueOf;
                        }
                        tokenUsageViewModel = new TokenUsageViewModel(str4, str, str3, intValue);
                    }
                }
                if (tokenUsageViewModel != 0) {
                    obj = new MoneybotDebugOverlayViewModel.Sheet.TokenUsage(tokenUsageViewModel);
                } else {
                    main = new MoneybotDebugOverlayViewModel.Sheet.Main(buildDebugItemRows(str2, ((Boolean) collectAsState.getValue()).booleanValue()));
                }
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                obj = MoneybotDebugOverlayViewModel.OpenChatSessionDialog.INSTANCE;
            }
            gapComposer.end(false);
            return obj;
        }
        main = new MoneybotDebugOverlayViewModel.Sheet.Main(buildDebugItemRows(str2, ((Boolean) collectAsState.getValue()).booleanValue()));
        obj = main;
        gapComposer.end(false);
        return obj;
    }

    public static SpendingInsightDetailViewModel.Content.Button toButton(SpendingInsight.Button button) {
        SpendingInsightDetailViewEvent clientRoute;
        String str = button.text;
        Color color = button.textColor;
        Color color2 = button.buttonColor;
        SpendingInsight.Button.Action action = button.action;
        if (action instanceof SpendingInsight.Button.Action.Exit) {
            clientRoute = SpendingInsightDetailViewEvent.Exit.INSTANCE;
        } else {
            if (!(action instanceof SpendingInsight.Button.Action.ClientRoute)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            clientRoute = new SpendingInsightDetailViewEvent.ClientRoute(((SpendingInsight.Button.Action.ClientRoute) action).route);
        }
        return new SpendingInsightDetailViewModel.Content.Button(str, color, color2, clientRoute);
    }

    public static SelectedInstrumentModel toModel(InstrumentSelectionData.InstrumentOption.PreselectableOption preselectableOption, String str, InstrumentSelectionData.PreselectedOptionAction preselectedOptionAction) {
        String concat = str != null ? str.concat(" ") : "";
        int id = preselectableOption.getId();
        Image image = preselectableOption.getData().avatar;
        InstrumentAvatarViewModel instrumentAvatarViewModel = new InstrumentAvatarViewModel(image != null ? zzafe.toAvatarImage(image) : null, zzafe.toFallbackIcon(preselectableOption.getData().iconStyle), true);
        Redacted title = preselectableOption.getTitle();
        title.getClass();
        String str2 = (String) title.getValue();
        Redacted subtitlePrimary = preselectableOption.getSubtitlePrimary();
        String str3 = subtitlePrimary != null ? (String) subtitlePrimary.getValue() : null;
        String concat2 = concat.concat(str3 != null ? str3 : "");
        String str4 = concat2.length() == 0 ? null : concat2;
        Redacted subtitleSuffix = preselectableOption.getSubtitleSuffix();
        return new SelectedInstrumentModel(id, instrumentAvatarViewModel, str2, str4, subtitleSuffix != null ? (String) subtitleSuffix.getValue() : null, preselectedOptionAction instanceof InstrumentSelectionData.PreselectedOptionAction.PreselectedShowOptionsAction, preselectedOptionAction instanceof InstrumentSelectionData.PreselectedOptionAction.PreselectedShowDialogAction);
    }

    public static void trackInstrumentLink$default(DisclosurePresenter disclosurePresenter, InstrumentLinkAuthenticateInstitution.Status status, String str, String str2, ApiResult.Failure failure, String str3, int i) {
        BlockersData.AnalyticsData.Source source;
        String str4 = (i & 2) != 0 ? null : str;
        String str5 = (i & 4) != 0 ? null : str2;
        ApiResult.Failure failure2 = (i & 8) != 0 ? null : failure;
        String str6 = (i & 16) != 0 ? null : str3;
        Analytics analytics = (Analytics) disclosurePresenter.analytics;
        BlockersData blockersData = ((BlockersScreens.StripeLinkScreen) disclosurePresenter.args).blockersData;
        ClientScenario clientScenario = blockersData.clientScenario;
        String name = clientScenario != null ? clientScenario.name() : null;
        String str7 = blockersData.flowToken;
        InstrumentLinkAuthenticateInstitution.FlowType flowType = InstrumentLinkAuthenticateInstitution.FlowType.STRIPE_AUTH;
        String name2 = blockersData.ratePlan.name();
        ApiResult.Failure.HttpFailure httpFailure = failure2 instanceof ApiResult.Failure.HttpFailure ? (ApiResult.Failure.HttpFailure) failure2 : null;
        Integer valueOf = httpFailure != null ? Integer.valueOf(httpFailure.code) : null;
        Boolean valueOf2 = failure2 != null ? Boolean.valueOf(failure2 instanceof ApiResult.Failure.NetworkFailure) : null;
        BlockersData.AnalyticsData analyticsData = blockersData.analyticsData;
        analytics.track(new InstrumentLinkAuthenticateInstitution(name, str6, str7, flowType, null, str5, str4, valueOf2, name2, valueOf, (analyticsData == null || (source = analyticsData.source) == null) ? null : source.getAnalyticsName(), status), null);
    }

    public static BitcoinDepositCopyViewModel viewModelFromInvoice(BitcoinPayments bitcoinPayments) {
        String str;
        BitcoinPayment bitcoinPayment;
        BitcoinAddress bitcoinAddress;
        boolean z = bitcoinPayments instanceof BitcoinPayments.Bitcoin;
        if (!z && !(bitcoinPayments instanceof BitcoinPayments.Ethereum) && !(bitcoinPayments instanceof BitcoinPayments.Lightning) && !(bitcoinPayments instanceof BitcoinPayments.Stablecoin)) {
            if (bitcoinPayments == null) {
                return BitcoinDepositCopyViewModel.Loading.INSTANCE;
            }
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        BitcoinPayments.Bitcoin bitcoin = z ? (BitcoinPayments.Bitcoin) bitcoinPayments : null;
        if (bitcoin == null || (bitcoinPayment = bitcoin.bitcoinPayment) == null || (bitcoinAddress = bitcoinPayment.address) == null || (str = bitcoinAddress.getAddress()) == null) {
            str = "";
        }
        return new BitcoinDepositCopyViewModel.Loaded(Strings.emptyAsNull(AndroidShader_androidKt.truncateAtMiddle$default(str)), Strings.emptyAsNull(AndroidShader_androidKt.truncateAtMiddle$default(getLightningInvoice(bitcoinPayments))));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object accountStatementFileData(DocumentDownloaderScreen.AccountStatementDownloaderScreen accountStatementDownloaderScreen, ContinuationImpl continuationImpl) {
        AccountDocumentsDownloaderPresenter$accountStatementFileData$1 accountDocumentsDownloaderPresenter$accountStatementFileData$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof AccountDocumentsDownloaderPresenter$accountStatementFileData$1) {
            accountDocumentsDownloaderPresenter$accountStatementFileData$1 = (AccountDocumentsDownloaderPresenter$accountStatementFileData$1) continuationImpl;
            int i2 = accountDocumentsDownloaderPresenter$accountStatementFileData$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountDocumentsDownloaderPresenter$accountStatementFileData$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = accountDocumentsDownloaderPresenter$accountStatementFileData$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDocumentsDownloaderPresenter$accountStatementFileData$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RegistrarClientService registrarClientService = (RegistrarClientService) this.appService;
                    GetStatementDescriptorRequest getStatementDescriptorRequest = new GetStatementDescriptorRequest(accountStatementDownloaderScreen.statementToken, ByteString.EMPTY);
                    accountDocumentsDownloaderPresenter$accountStatementFileData$1.L$0 = accountStatementDownloaderScreen;
                    accountDocumentsDownloaderPresenter$accountStatementFileData$1.label = 1;
                    obj = registrarClientService.getStatementDescriptor(getStatementDescriptorRequest, accountDocumentsDownloaderPresenter$accountStatementFileData$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    accountStatementDownloaderScreen = accountDocumentsDownloaderPresenter$accountStatementFileData$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                apiResult = (ApiResult) obj;
                if (apiResult instanceof ApiResult.Success) {
                    return null;
                }
                String str = accountStatementDownloaderScreen.statementToken;
                GetStatementDescriptorResponse getStatementDescriptorResponse = (GetStatementDescriptorResponse) ((ApiResult.Success) apiResult).response;
                String str2 = getStatementDescriptorResponse.file_name;
                str2.getClass();
                String str3 = str2 + "_" + str;
                String str4 = getStatementDescriptorResponse.display_name;
                str4.getClass();
                return new AccountDocumentsDownloaderPresenter$FileMetadata(str3, str4, Recorder$$ExternalSyntheticOutline2.m((String) this.blockersNavigator, "/cash-app/banking-statements/monthly-statement?token=", str));
            }
        }
        accountDocumentsDownloaderPresenter$accountStatementFileData$1 = new AccountDocumentsDownloaderPresenter$accountStatementFileData$1(this, continuationImpl);
        Object obj2 = accountDocumentsDownloaderPresenter$accountStatementFileData$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDocumentsDownloaderPresenter$accountStatementFileData$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (apiResult instanceof ApiResult.Success) {
        }
    }

    public ListBuilder buildDebugItemRows(String str, boolean z) {
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        if (str != null) {
            createListBuilder.add(new MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow(Icons.Copy24, androidStringManager.get(R.string.moneybot_chat_overflow_item_copy_chat_session_id), new MoneybotDebugOverlayViewEvent.CopySessionId(str)));
            createListBuilder.add(new MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow(Icons.InformationOutline24, androidStringManager.get(R.string.moneybot_chat_overflow_item_chat_token_usage), MoneybotDebugOverlayViewEvent.OpenTokenUsageOverlay.INSTANCE));
        }
        createListBuilder.add(new MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow(Icons.Edit24, androidStringManager.get(R.string.moneybot_chat_overflow_item_system_preamble), MoneybotDebugOverlayViewEvent.OpenMoneybotPreambleEditor.INSTANCE));
        createListBuilder.add(new MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow(Icons.Search24, androidStringManager.get(R.string.moneybot_chat_overflow_item_open_chat_session_by_id), MoneybotDebugOverlayViewEvent.ShowOpenSessionByIdDialog.INSTANCE));
        if (str != null) {
            createListBuilder.add(new MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow(Icons.SensitiveVisible24, androidStringManager.get(R.string.moneybot_debug_show_raw_messages), new MoneybotDebugOverlayViewEvent.ShowRawMessages(str)));
        }
        createListBuilder.add(new MoneybotDebugOverlayViewModel.Sheet.Main.DebugItemRow(Icons.Document24, androidStringManager.get(z ? R.string.moneybot_chat_overflow_item_hide_raw_markdown : R.string.moneybot_chat_overflow_item_toggle_raw_markdown), MoneybotDebugOverlayViewEvent.ToggleRawMarkdown.INSTANCE));
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }

    public DisclosureViewModel buildDisclosureViewModel(boolean z, boolean z2) {
        DisclosureScreen disclosureScreen = (DisclosureScreen) this.args;
        return new DisclosureViewModel((String) disclosureScreen.headlineText.getValue(), disclosureScreen.lineItems, disclosureScreen.descriptionText, disclosureScreen.moreInfoPanelLineItems, disclosureScreen.footerText, disclosureScreen.scrollButtonText, z2, disclosureScreen.acceptButtonText, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object completeLink(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        StripeLinkPresenter$completeLink$1 stripeLinkPresenter$completeLink$1;
        int i;
        String str4;
        ApiResult apiResult;
        BlockersScreens.StripeLinkScreen stripeLinkScreen = (BlockersScreens.StripeLinkScreen) this.args;
        BlockersData blockersData = stripeLinkScreen.blockersData;
        if (continuationImpl instanceof StripeLinkPresenter$completeLink$1) {
            stripeLinkPresenter$completeLink$1 = (StripeLinkPresenter$completeLink$1) continuationImpl;
            int i2 = stripeLinkPresenter$completeLink$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                stripeLinkPresenter$completeLink$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = stripeLinkPresenter$completeLink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = stripeLinkPresenter$completeLink$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    CompleteStripeLinkRequest completeStripeLinkRequest = new CompleteStripeLinkRequest(str, str2, null, null, null, ByteString.EMPTY);
                    StripeBankLinkingService stripeBankLinkingService = (StripeBankLinkingService) this.appService;
                    String str5 = blockersData.flowToken;
                    stripeLinkPresenter$completeLink$1.L$2 = str3;
                    stripeLinkPresenter$completeLink$1.label = 1;
                    obj = stripeBankLinkingService.completeStripeLink(str5, completeStripeLinkRequest, stripeLinkPresenter$completeLink$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str4 = str3;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str6 = stripeLinkPresenter$completeLink$1.L$2;
                    SafeTrace.throwOnFailure(obj);
                    str4 = str6;
                }
                apiResult = (ApiResult) obj;
                if (!(apiResult instanceof ApiResult.Success)) {
                    trackInstrumentLink$default(this, InstrumentLinkAuthenticateInstitution.Status.RESOLVED, null, str4, null, null, 26);
                    ((BetterNavigator.ScreenNavigator) this.navigator).goTo(((BlockersDataNavigator) this.blockersNavigator).getNext(stripeLinkScreen, blockersData));
                } else {
                    if (!(apiResult instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    trackInstrumentLink$default(this, InstrumentLinkAuthenticateInstitution.Status.FAILURE, null, str4, failure, "Failed to complete Stripe link", 2);
                    exitWithError(failure);
                }
                return Unit.INSTANCE;
            }
        }
        stripeLinkPresenter$completeLink$1 = new StripeLinkPresenter$completeLink$1(this, continuationImpl);
        Object obj2 = stripeLinkPresenter$completeLink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = stripeLinkPresenter$completeLink$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:0|1|(2:3|(9:5|6|7|8|(1:(3:11|12|13)(2:21|22))(3:23|24|(1:26))|14|(1:16)(1:20)|17|18))|28|6|7|8|(0)(0)|14|(0)(0)|17|18) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        r7.goTo(new com.squareup.cash.profile.screens.ProfileScreens.ErrorScreen(r6.get(com.squareup.cash.R.string.profile_documents_downloader_error), 0 == true ? 1 : 0, r10));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007a A[Catch: Exception -> 0x0095, TryCatch #0 {Exception -> 0x0095, blocks: (B:12:0x0039, B:14:0x0076, B:16:0x007a, B:20:0x0088, B:24:0x005d), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0088 A[Catch: Exception -> 0x0095, TRY_LEAVE, TryCatch #0 {Exception -> 0x0095, blocks: (B:12:0x0039, B:14:0x0076, B:16:0x007a, B:20:0x0088, B:24:0x005d), top: B:8:0x0033 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object downloadFile(String str, String str2, String str3, ContinuationImpl continuationImpl) {
        AccountDocumentsDownloaderPresenter$downloadFile$3 accountDocumentsDownloaderPresenter$downloadFile$3;
        int i;
        String str4;
        Uri uri;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.navigator;
        if (continuationImpl instanceof AccountDocumentsDownloaderPresenter$downloadFile$3) {
            accountDocumentsDownloaderPresenter$downloadFile$3 = (AccountDocumentsDownloaderPresenter$downloadFile$3) continuationImpl;
            int i2 = accountDocumentsDownloaderPresenter$downloadFile$3.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                accountDocumentsDownloaderPresenter$downloadFile$3.label = i2 - PKIFailureInfo.systemUnavail;
                AccountDocumentsDownloaderPresenter$downloadFile$3 accountDocumentsDownloaderPresenter$downloadFile$32 = accountDocumentsDownloaderPresenter$downloadFile$3;
                Object obj = accountDocumentsDownloaderPresenter$downloadFile$32.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = accountDocumentsDownloaderPresenter$downloadFile$32.label;
                int i3 = 14;
                String str5 = null;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    String str6 = str2 + ".pdf";
                    str4 = str3;
                    accountDocumentsDownloaderPresenter$downloadFile$32.L$2 = str4;
                    accountDocumentsDownloaderPresenter$downloadFile$32.label = 1;
                    obj = JobKt.withContext((CoroutineContext) this.launcher, new AnimatedImageDecoder$wrapDrawable$2(this, str6, str, objArr == true ? 1 : 0, 29), accountDocumentsDownloaderPresenter$downloadFile$32);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str7 = accountDocumentsDownloaderPresenter$downloadFile$32.L$2;
                    SafeTrace.throwOnFailure(obj);
                    str4 = str7;
                }
                uri = (Uri) obj;
                if (uri == null) {
                    screenNavigator.goTo(Back.INSTANCE);
                    screenNavigator.goTo(new PdfScreen(uri, str4));
                } else {
                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(androidStringManager.get(R.string.profile_documents_downloader_error), str5, i3));
                }
                return Unit.INSTANCE;
            }
        }
        accountDocumentsDownloaderPresenter$downloadFile$3 = new AccountDocumentsDownloaderPresenter$downloadFile$3(this, continuationImpl);
        AccountDocumentsDownloaderPresenter$downloadFile$3 accountDocumentsDownloaderPresenter$downloadFile$322 = accountDocumentsDownloaderPresenter$downloadFile$3;
        Object obj2 = accountDocumentsDownloaderPresenter$downloadFile$322.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = accountDocumentsDownloaderPresenter$downloadFile$322.label;
        int i32 = 14;
        String str52 = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        uri = (Uri) obj2;
        if (uri == null) {
        }
        return Unit.INSTANCE;
    }

    public Object downloadPdf(DocumentDownloaderScreen documentDownloaderScreen, AccountDocumentsDownloaderPresenter$FileMetadata accountDocumentsDownloaderPresenter$FileMetadata, AccountDocumentsDownloaderPresenter$getFileDataAndDownload$1 accountDocumentsDownloaderPresenter$getFileDataAndDownload$1) {
        DocumentDownloaderScreen.DocumentData documentData = documentDownloaderScreen.getDocumentData();
        if (accountDocumentsDownloaderPresenter$FileMetadata != null) {
            Object downloadFile = downloadFile(accountDocumentsDownloaderPresenter$FileMetadata.url, accountDocumentsDownloaderPresenter$FileMetadata.fileName, accountDocumentsDownloaderPresenter$FileMetadata.displayName, accountDocumentsDownloaderPresenter$getFileDataAndDownload$1);
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (downloadFile != coroutineSingletons) {
                downloadFile = Unit.INSTANCE;
            }
            return downloadFile == coroutineSingletons ? downloadFile : Unit.INSTANCE;
        }
        if (documentData == null) {
            ((BetterNavigator.ScreenNavigator) this.navigator).goTo(new ProfileScreens.ErrorScreen(((AndroidStringManager) this.stringManager).get(R.string.profile_documents_downloader_error), null, 14));
            return Unit.INSTANCE;
        }
        Object downloadFile2 = downloadFile(documentData.url, documentData.fileName, documentData.displayName, accountDocumentsDownloaderPresenter$getFileDataAndDownload$1);
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (downloadFile2 != coroutineSingletons2) {
            downloadFile2 = Unit.INSTANCE;
        }
        return downloadFile2 == coroutineSingletons2 ? downloadFile2 : Unit.INSTANCE;
    }

    public void exitWithError(ApiResult.Failure failure) {
        String str = null;
        String str2 = failure != null ? TextUtilsCompat.errorMessaging((AndroidStringManager) this.stringManager, failure, null).message : null;
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.navigator;
        BlockersData blockersData = ((BlockersScreens.StripeLinkScreen) this.args).blockersData;
        screenNavigator.goTo(blockersData.exitScreen);
        screenNavigator.goTo(new FailureMessageBlockerScreen(blockersData, str2, str, 4));
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        int i = this.$r8$classId;
        Object obj = this.blockersNavigator;
        switch (i) {
        }
        return (ErrorReporter) obj;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        switch (this.$r8$classId) {
            case 5:
                return (SampleStrategy) this.stringManager;
            default:
                return (SampleStrategy) this.launcher;
        }
    }

    public DateTimeFormatter iconDateFormatter(TimeZone timeZone) {
        AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) this.appService;
        timeZone.getClass();
        return androidDateFormatManager.getDateFormat("MMM d", timeZone).formatter;
    }

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final java.lang.Object models(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r34v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException
        */

    public void navigateToNextScreen(ResponseContext responseContext) {
        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.navigator;
        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) this.blockersNavigator;
        InstrumentSelectionLoadingScreen instrumentSelectionLoadingScreen = (InstrumentSelectionLoadingScreen) this.args;
        BlockersData blockersData = instrumentSelectionLoadingScreen.blockersData;
        Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
        screenNavigator.goTo(blockersDataNavigator.getNext(instrumentSelectionLoadingScreen, blockersData.updateFromResponseContext(responseContext, false)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object submitOptionV2(InstrumentSelectionBlockerPresenter$SubmissionData instrumentSelectionBlockerPresenter$SubmissionData, ContinuationImpl continuationImpl) {
        InstrumentSelectionBlockerPresenter$submitOptionV2$1 instrumentSelectionBlockerPresenter$submitOptionV2$1;
        int i;
        ApiResult apiResult;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.stringManager;
        BlockersScreens.InstrumentSelectionScreen instrumentSelectionScreen = (BlockersScreens.InstrumentSelectionScreen) this.appService;
        BlockersData blockersData = instrumentSelectionScreen.blockersData;
        if (continuationImpl instanceof InstrumentSelectionBlockerPresenter$submitOptionV2$1) {
            instrumentSelectionBlockerPresenter$submitOptionV2$1 = (InstrumentSelectionBlockerPresenter$submitOptionV2$1) continuationImpl;
            int i2 = instrumentSelectionBlockerPresenter$submitOptionV2$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                instrumentSelectionBlockerPresenter$submitOptionV2$1.label = i2 - PKIFailureInfo.systemUnavail;
                InstrumentSelectionBlockerPresenter$submitOptionV2$1 instrumentSelectionBlockerPresenter$submitOptionV2$12 = instrumentSelectionBlockerPresenter$submitOptionV2$1;
                Object obj = instrumentSelectionBlockerPresenter$submitOptionV2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = instrumentSelectionBlockerPresenter$submitOptionV2$12.label;
                boolean z = true;
                String str = null;
                Object[] objArr = 0;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    SelectInstrumentRequest selectInstrumentRequest = new SelectInstrumentRequest(blockersData.requestContext, instrumentSelectionBlockerPresenter$SubmissionData.encodedSelectedOption, instrumentSelectionBlockerPresenter$SubmissionData.encodedSecondarySelectedOption, 8);
                    Analytics analytics = (Analytics) this.analytics;
                    BlockersData blockersData2 = instrumentSelectionScreen.blockersData;
                    PagingDataPresenter$collectFrom$2 pagingDataPresenter$collectFrom$2 = new PagingDataPresenter$collectFrom$2(this, selectInstrumentRequest, objArr == true ? 1 : 0, 20);
                    instrumentSelectionBlockerPresenter$submitOptionV2$12.label = 1;
                    obj = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData2, analytics, androidStringManager, instrumentSelectionBlockerPresenter$submitOptionV2$12, null, pagingDataPresenter$collectFrom$2);
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
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) this.navigator;
                if (!(apiResult instanceof ApiResult.Failure)) {
                    screenNavigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging(androidStringManager, (ApiResult.Failure) apiResult, null).message, str, 14));
                    z = false;
                } else {
                    if (!(apiResult instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    SelectInstrumentResponse selectInstrumentResponse = (SelectInstrumentResponse) ((ApiResult.Success) apiResult).response;
                    selectInstrumentResponse.getClass();
                    ResponseContext responseContext = selectInstrumentResponse.response_context;
                    responseContext.getClass();
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    screenNavigator.goTo(((BlockersDataNavigator) this.blockersNavigator).getNext(instrumentSelectionScreen, blockersData.updateFromResponseContext(responseContext, false)));
                }
                return Boolean.valueOf(z);
            }
        }
        instrumentSelectionBlockerPresenter$submitOptionV2$1 = new InstrumentSelectionBlockerPresenter$submitOptionV2$1(this, continuationImpl);
        InstrumentSelectionBlockerPresenter$submitOptionV2$1 instrumentSelectionBlockerPresenter$submitOptionV2$122 = instrumentSelectionBlockerPresenter$submitOptionV2$1;
        Object obj2 = instrumentSelectionBlockerPresenter$submitOptionV2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = instrumentSelectionBlockerPresenter$submitOptionV2$122.label;
        boolean z2 = true;
        String str2 = null;
        Object[] objArr2 = 0;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) this.navigator;
        if (!(apiResult instanceof ApiResult.Failure)) {
        }
        return Boolean.valueOf(z2);
    }

    public DateTimeFormatter subtitleDateFormatter(TimeZone timeZone) {
        return ((AndroidDateFormatManager) this.appService).getDateFormat("E, MMM d", timeZone).formatter;
    }

    /* loaded from: classes.dex */
    public final class MetroFactory {
        public final DoubleCheck analytics;
        public final DoubleCheck appService;
        public final Provider blockersNavigator;
        public final Provider launcher;
        public final LambdaProvider stringManager;

        public MetroFactory(RealBadger2.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, CardAppletWorker.MetroFactory metroFactory2, DoubleCheck doubleCheck2) {
            this.blockersNavigator = metroFactory;
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck;
            this.launcher = metroFactory2;
            this.appService = doubleCheck2;
        }

        public MetroFactory(BorrowUiFactory.MetroFactory metroFactory, DoubleCheck doubleCheck, BorrowUiFactory.MetroFactory metroFactory2, LambdaProvider lambdaProvider, DoubleCheck doubleCheck2) {
            this.blockersNavigator = metroFactory;
            this.analytics = doubleCheck;
            this.launcher = metroFactory2;
            this.stringManager = lambdaProvider;
            this.appService = doubleCheck2;
        }

        public MetroFactory(RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealGooglePayPaymentsClient.MetroFactory metroFactory2) {
            this.blockersNavigator = metroFactory;
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck;
            this.appService = doubleCheck2;
            this.launcher = metroFactory2;
        }

        public /* synthetic */ MetroFactory(LambdaProvider lambdaProvider, DoubleCheck doubleCheck, Provider provider, DoubleCheck doubleCheck2, Factory factory) {
            this.stringManager = lambdaProvider;
            this.analytics = doubleCheck;
            this.blockersNavigator = provider;
            this.appService = doubleCheck2;
            this.launcher = factory;
        }

        public MetroFactory(DoubleCheck doubleCheck, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck2, RealGlobalConfigDataSource.MetroFactory metroFactory2, LambdaProvider lambdaProvider) {
            this.analytics = doubleCheck;
            this.blockersNavigator = metroFactory;
            this.appService = doubleCheck2;
            this.launcher = metroFactory2;
            this.stringManager = lambdaProvider;
        }

        public MetroFactory(DoubleCheck doubleCheck, ShiftsAnalytics.MetroFactory metroFactory, DoubleCheck doubleCheck2, LambdaProvider lambdaProvider, ShiftsAnalytics.MetroFactory metroFactory2) {
            this.analytics = doubleCheck;
            this.blockersNavigator = metroFactory;
            this.appService = doubleCheck2;
            this.stringManager = lambdaProvider;
            this.launcher = metroFactory2;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory, RealGlobalConfigDataSource.MetroFactory metroFactory2, DoubleCheck doubleCheck2) {
            this.analytics = doubleCheck;
            this.stringManager = lambdaProvider;
            this.blockersNavigator = metroFactory;
            this.launcher = metroFactory2;
            this.appService = doubleCheck2;
        }

        public MetroFactory(DoubleCheck doubleCheck, LambdaProvider lambdaProvider, RealBrazeManager.MetroFactory metroFactory, DoubleCheck doubleCheck2, InstanceFactory instanceFactory) {
            this.analytics = doubleCheck;
            this.stringManager = lambdaProvider;
            this.blockersNavigator = metroFactory;
            this.appService = doubleCheck2;
            this.launcher = instanceFactory;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, RealBrazeManager.MetroFactory metroFactory, LambdaProvider lambdaProvider, Factory factory) {
            this.analytics = doubleCheck;
            this.appService = doubleCheck2;
            this.blockersNavigator = metroFactory;
            this.stringManager = lambdaProvider;
            this.launcher = factory;
        }

        public /* synthetic */ MetroFactory(DoubleCheck doubleCheck, DoubleCheck doubleCheck2, Factory factory, Factory factory2, LambdaProvider lambdaProvider) {
            this.analytics = doubleCheck;
            this.appService = doubleCheck2;
            this.blockersNavigator = factory;
            this.launcher = factory2;
            this.stringManager = lambdaProvider;
        }
    }

    public DisclosurePresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, RealAllowanceAppletTileRepository realAllowanceAppletTileRepository, AndroidStringManager androidStringManager, LocalizedMoneyFormatter.Factory factory, RealRecurringPaymentsManager realRecurringPaymentsManager, CoroutineScope coroutineScope, Navigator navigator) {
        this.$r8$classId = 20;
        navigator.getClass();
        this.analytics = realAllowanceAppletTileRepository;
        this.stringManager = androidStringManager;
        this.appService = realRecurringPaymentsManager;
        this.blockersNavigator = coroutineScope;
        this.launcher = factory.create(MoneyFormatterConfig.COMPACT);
        this.args = realRouter$Factory$Impl.create$1(navigator);
        this.navigator = androidStringManager.get(R.string.allowance_applet_nux_title);
    }

    public DisclosurePresenter(GooglePayService googlePayService, BlockersDataNavigator blockersDataNavigator, Analytics analytics, BlockerFlowListener blockerFlowListener, AndroidStringManager androidStringManager, BlockersScreens.GooglePayCompleteProvisioningScreen googlePayCompleteProvisioningScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 22;
        googlePayCompleteProvisioningScreen.getClass();
        this.appService = googlePayService;
        this.blockersNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.launcher = blockerFlowListener;
        this.stringManager = androidStringManager;
        this.args = googlePayCompleteProvisioningScreen;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, IntentLauncher intentLauncher, KeyValue keyValue, KeyValue keyValue2, StablecoinOnboardingScreen stablecoinOnboardingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 11;
        stablecoinOnboardingScreen.getClass();
        this.stringManager = androidStringManager;
        this.analytics = featureFlagManager;
        this.launcher = intentLauncher;
        this.appService = keyValue;
        this.blockersNavigator = keyValue2;
        this.args = stablecoinOnboardingScreen;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(CashOutService cashOutService, MonetaService monetaService, CryptoInvestFlowService cryptoInvestFlowService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, InstrumentSelectionLoadingScreen instrumentSelectionLoadingScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 25;
        instrumentSelectionLoadingScreen.getClass();
        this.analytics = cashOutService;
        this.appService = monetaService;
        this.launcher = cryptoInvestFlowService;
        this.blockersNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.args = instrumentSelectionLoadingScreen;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(PromotionDetails promotionDetails, BetterNavigator.ScreenNavigator screenNavigator, Flow flow, IntentLauncher intentLauncher, UnleashContext unleashContext, RealRouter$Factory$Impl realRouter$Factory$Impl, RealPromotionDetailsAnalyticsService$Factory$Impl realPromotionDetailsAnalyticsService$Factory$Impl) {
        this.$r8$classId = 19;
        promotionDetails.getClass();
        this.analytics = promotionDetails;
        this.navigator = screenNavigator;
        this.appService = flow;
        this.launcher = intentLauncher;
        this.blockersNavigator = unleashContext;
        this.stringManager = realRouter$Factory$Impl.create$1(screenNavigator);
        StampSheetPresenter$MetroFactory stampSheetPresenter$MetroFactory = realPromotionDetailsAnalyticsService$Factory$Impl.delegateFactory;
        RealUuidGenerator realUuidGenerator = (RealUuidGenerator) stampSheetPresenter$MetroFactory.ioContext.lambda.invoke();
        Analytics analytics = (Analytics) stampSheetPresenter$MetroFactory.appConfig.getValue();
        realUuidGenerator.getClass();
        analytics.getClass();
        this.args = new RealPromotionDetailsAnalyticsService(promotionDetails, realUuidGenerator, analytics);
    }

    public DisclosurePresenter(AndroidStringManager androidStringManager, FeatureFlagManager featureFlagManager, RealOffersAnalyticsV2 realOffersAnalyticsV2, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl, OffersScreen$OffersGreenStatusScreen offersScreen$OffersGreenStatusScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 29;
        offersScreen$OffersGreenStatusScreen.getClass();
        this.stringManager = androidStringManager;
        this.appService = featureFlagManager;
        this.blockersNavigator = realOffersAnalyticsV2;
        this.analytics = analytics;
        this.launcher = offersScreen$OffersGreenStatusScreen;
        this.navigator = screenNavigator;
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public DisclosurePresenter(BetterNavigator.ScreenNavigator screenNavigator, AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen afterpayAppletScreen$AfterpayAppletUpsellSheetScreen, RealAfterpayAppletAnalytics realAfterpayAppletAnalytics, ErrorReporter errorReporter, SampleStrategy sampleStrategy, RealRouter$Factory$Impl realRouter$Factory$Impl, Result result) {
        this.$r8$classId = 5;
        afterpayAppletScreen$AfterpayAppletUpsellSheetScreen.getClass();
        this.navigator = screenNavigator;
        this.analytics = afterpayAppletScreen$AfterpayAppletUpsellSheetScreen;
        this.appService = realAfterpayAppletAnalytics;
        this.blockersNavigator = errorReporter;
        this.stringManager = sampleStrategy;
        this.launcher = result;
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public DisclosurePresenter(BetterNavigator.ScreenNavigator screenNavigator, MoneybotDebugOverlayScreen moneybotDebugOverlayScreen, ChatManager chatManager, MoneybotDebugSettingsManager moneybotDebugSettingsManager, AndroidStringManager androidStringManager, RealClipboardManager realClipboardManager) {
        this.$r8$classId = 28;
        this.navigator = screenNavigator;
        this.analytics = moneybotDebugOverlayScreen;
        this.appService = chatManager;
        this.blockersNavigator = moneybotDebugSettingsManager;
        this.stringManager = androidStringManager;
        this.launcher = realClipboardManager;
        this.args = Updater.mutableStateOf$default(MoneybotDebugOverlayState.Main);
    }

    public DisclosurePresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, AppMessageClientService appMessageClientService, RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl, CoroutineContext coroutineContext, Flow flow, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        this.analytics = appMessageClientService;
        this.appService = coroutineContext;
        this.blockersNavigator = flow;
        this.stringManager = realAppMessageActionPerformer$Factory$Impl.create$1(screenNavigator);
        this.launcher = cashAccountDatabaseImpl.inlineMessageV2Queries;
    }

    public DisclosurePresenter(AndroidStringManager androidStringManager, RealFileDownloader realFileDownloader, RegistrarClientService registrarClientService, String str, CoroutineContext coroutineContext, DocumentDownloaderScreen documentDownloaderScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        documentDownloaderScreen.getClass();
        this.stringManager = androidStringManager;
        this.analytics = realFileDownloader;
        this.appService = registrarClientService;
        this.blockersNavigator = str;
        this.launcher = coroutineContext;
        this.args = documentDownloaderScreen;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(CashAccountDatabaseImpl cashAccountDatabaseImpl, AppMessageClientService appMessageClientService, RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl, RealAppMessageActionPresenterHelper realAppMessageActionPresenterHelper, AndroidAppMessagingService androidAppMessagingService, CoroutineContext coroutineContext, Flow flow, Navigator navigator) {
        this.$r8$classId = 6;
        navigator.getClass();
        this.analytics = appMessageClientService;
        this.appService = androidAppMessagingService;
        this.blockersNavigator = coroutineContext;
        this.stringManager = flow;
        this.launcher = realAppMessageActionPerformer$Factory$Impl.create$1(navigator);
        this.args = cashAccountDatabaseImpl.inlineMessageQueries;
    }

    public DisclosurePresenter(AndroidStringManager androidStringManager, FlowStarter flowStarter, RealClientSyncer realClientSyncer, RealInvestingStateManager realInvestingStateManager, CoroutineContext coroutineContext, InvestingScreens.DependentWelcomeScreen dependentWelcomeScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 26;
        dependentWelcomeScreen.getClass();
        this.analytics = flowStarter;
        this.appService = realClientSyncer;
        this.blockersNavigator = realInvestingStateManager;
        this.stringManager = coroutineContext;
        this.launcher = dependentWelcomeScreen;
        this.navigator = screenNavigator;
        this.args = new DependentWelcomeViewModel(androidStringManager.get(R.string.investing_tab_title), androidStringManager.get(R.string.dependent_welcome_title), androidStringManager.get(R.string.dependent_welcome_subtitle), androidStringManager.get(R.string.dependent_welcome_cta_label));
    }

    public DisclosurePresenter(AndroidStringManager androidStringManager, FlowStarter flowStarter, RealClientSyncer realClientSyncer, RealInvestingStateManager realInvestingStateManager, CoroutineContext coroutineContext, BetterNavigator.ScreenNavigator screenNavigator, BitcoinDependentWelcomeScreen bitcoinDependentWelcomeScreen) {
        this.$r8$classId = 8;
        bitcoinDependentWelcomeScreen.getClass();
        this.analytics = flowStarter;
        this.appService = realClientSyncer;
        this.blockersNavigator = realInvestingStateManager;
        this.stringManager = coroutineContext;
        this.navigator = screenNavigator;
        this.launcher = bitcoinDependentWelcomeScreen;
        this.args = new BitcoinDependentWelcomeViewModel(androidStringManager.get(R.string.bitcoin_welcome_dependent_toolbar_title), androidStringManager.get(R.string.bitcoin_welcome_dependent_title), androidStringManager.get(R.string.bitcoin_welcome_dependent_subtitle), androidStringManager.get(R.string.bitcoin_presenters_continue_cta));
    }

    public DisclosurePresenter(ClearMarketingBadgesIfNeeded clearMarketingBadgesIfNeeded, RealMarketingMessageRepository realMarketingMessageRepository, RefreshMarketingMessages refreshMarketingMessages, AndroidStringManager androidStringManager, Analytics analytics, BetterNavigator.ScreenNavigator screenNavigator, LocalMarketingMessagesScreen localMarketingMessagesScreen) {
        this.$r8$classId = 1;
        localMarketingMessagesScreen.getClass();
        this.appService = clearMarketingBadgesIfNeeded;
        this.blockersNavigator = realMarketingMessageRepository;
        this.launcher = refreshMarketingMessages;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.navigator = screenNavigator;
        this.args = localMarketingMessagesScreen;
    }

    public DisclosurePresenter(CheckoutService checkoutService, AndroidStringManager androidStringManager, Analytics analytics, RealActivityUpdatesNotifier realActivityUpdatesNotifier, RealClientSyncer realClientSyncer, HistoryScreens.CancelPendingSupPaymentScreen cancelPendingSupPaymentScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 24;
        cancelPendingSupPaymentScreen.getClass();
        this.appService = checkoutService;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.blockersNavigator = realActivityUpdatesNotifier;
        this.launcher = realClientSyncer;
        this.args = cancelPendingSupPaymentScreen;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(RealClientScenarioCompleter realClientScenarioCompleter, BlockerFlowListener blockerFlowListener, AndroidToaster androidToaster, AndroidStringManager androidStringManager, CoroutineContext coroutineContext, BlockersScreens.ClientScenarioLauncher clientScenarioLauncher, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 12;
        this.analytics = realClientScenarioCompleter;
        this.appService = blockerFlowListener;
        this.blockersNavigator = androidToaster;
        this.stringManager = androidStringManager;
        this.launcher = coroutineContext;
        this.args = clientScenarioLauncher;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(Analytics analytics, AppService appService, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, IntentLauncher intentLauncher, DisclosureScreen disclosureScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        disclosureScreen.getClass();
        this.analytics = analytics;
        this.appService = appService;
        this.blockersNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.launcher = intentLauncher;
        this.args = disclosureScreen;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(Analytics analytics, IntentLauncher intentLauncher, AndroidDateFormatManager androidDateFormatManager, AndroidClock androidClock, RealRouter$Factory$Impl realRouter$Factory$Impl, BorrowHomeOverlay borrowHomeOverlay, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 17;
        borrowHomeOverlay.getClass();
        this.analytics = analytics;
        this.launcher = intentLauncher;
        this.appService = androidDateFormatManager;
        this.blockersNavigator = androidClock;
        this.stringManager = borrowHomeOverlay;
        this.navigator = screenNavigator;
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public DisclosurePresenter(MoneyAnalyticsService moneyAnalyticsService, PromotedAppletTilePresenter$Factory$Impl promotedAppletTilePresenter$Factory$Impl, RealFamilyAppletTileRepository realFamilyAppletTileRepository, AegisService aegisService, RealRouter$Factory$Impl realRouter$Factory$Impl, CoroutineScope coroutineScope, Navigator navigator) {
        this.$r8$classId = 21;
        navigator.getClass();
        this.analytics = moneyAnalyticsService;
        this.appService = realFamilyAppletTileRepository;
        this.blockersNavigator = aegisService;
        this.stringManager = coroutineScope;
        this.launcher = navigator;
        this.args = realRouter$Factory$Impl.create$1(navigator);
        this.navigator = promotedAppletTilePresenter$Factory$Impl.create(AppletId.FAMILY);
    }

    public DisclosurePresenter(RealBusinessProfileManager realBusinessProfileManager, FlowStarter flowStarter, Analytics analytics, FeatureFlagManager featureFlagManager, RealAccountRatePlanManager realAccountRatePlanManager, BusinessInfoScreen businessInfoScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        businessInfoScreen.getClass();
        this.appService = realBusinessProfileManager;
        this.blockersNavigator = flowStarter;
        this.analytics = analytics;
        this.stringManager = featureFlagManager;
        this.launcher = realAccountRatePlanManager;
        this.args = businessInfoScreen;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(InvestingSearchPresenter$Factory$Impl investingSearchPresenter$Factory$Impl, RealCategoryBackend realCategoryBackend, FilterConfigurationCacheMap filterConfigurationCacheMap, RealInvestingAnalytics realInvestingAnalytics, Analytics analytics, CategoryToken categoryToken, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 27;
        categoryToken.getClass();
        this.appService = realCategoryBackend;
        this.blockersNavigator = filterConfigurationCacheMap;
        this.stringManager = realInvestingAnalytics;
        this.analytics = analytics;
        this.launcher = categoryToken;
        this.navigator = screenNavigator;
        this.args = investingSearchPresenter$Factory$Impl.create(categoryToken, screenNavigator, false);
    }

    public DisclosurePresenter(Analytics analytics, AppService appService, ProductionAttributionEventEmitter productionAttributionEventEmitter, BlockersDataNavigator blockersDataNavigator, AndroidStringManager androidStringManager, BlockersScreens.ConfirmPaymentScreen confirmPaymentScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 13;
        this.analytics = analytics;
        this.appService = appService;
        this.launcher = productionAttributionEventEmitter;
        this.blockersNavigator = blockersDataNavigator;
        this.stringManager = androidStringManager;
        this.args = confirmPaymentScreen;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(AndroidStringManager androidStringManager, Analytics analytics, BlockersDataNavigator blockersDataNavigator, AppService appService, SecuritySignalsAggregator securitySignalsAggregator, BlockersScreens blockersScreens) {
        this.$r8$classId = 15;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.blockersNavigator = blockersDataNavigator;
        this.appService = appService;
        this.launcher = securitySignalsAggregator;
        this.args = blockersScreens;
        this.navigator = PapaEvent.Channel$default(0, null, null, 7);
    }

    public DisclosurePresenter(RealClipboardManager realClipboardManager, AndroidStringManager androidStringManager, Analytics analytics, AndroidAccessibilityManager androidAccessibilityManager, RealLightningInvoiceGenerator realLightningInvoiceGenerator, BetterNavigator.ScreenNavigator screenNavigator, BitcoinDepositCopyScreen bitcoinDepositCopyScreen) {
        this.$r8$classId = 9;
        bitcoinDepositCopyScreen.getClass();
        this.appService = realClipboardManager;
        this.stringManager = androidStringManager;
        this.analytics = analytics;
        this.blockersNavigator = androidAccessibilityManager;
        this.launcher = realLightningInvoiceGenerator;
        this.navigator = screenNavigator;
        this.args = bitcoinDepositCopyScreen;
    }

    public DisclosurePresenter(StripeBankLinkingService stripeBankLinkingService, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, BlockerFlowListener blockerFlowListener, Analytics analytics, Error.Code.Companion companion, BlockersScreens.StripeLinkScreen stripeLinkScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 16;
        this.appService = stripeBankLinkingService;
        this.stringManager = androidStringManager;
        this.blockersNavigator = blockersDataNavigator;
        this.launcher = blockerFlowListener;
        this.analytics = analytics;
        this.args = stripeLinkScreen;
        this.navigator = screenNavigator;
    }

    public DisclosurePresenter(BetterNavigator.ScreenNavigator screenNavigator, SpendingInsightDetailScreen spendingInsightDetailScreen, SpendingInsightsAppService spendingInsightsAppService, AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, ErrorReporter errorReporter, SampleStrategy sampleStrategy) {
        this.$r8$classId = 18;
        this.navigator = screenNavigator;
        this.analytics = spendingInsightDetailScreen;
        this.appService = spendingInsightsAppService;
        this.stringManager = androidStringManager;
        this.blockersNavigator = errorReporter;
        this.launcher = sampleStrategy;
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public DisclosurePresenter(RealBitcoinPerformanceDataRepo realBitcoinPerformanceDataRepo, IntentLauncher intentLauncher, Analytics analytics, LocalizedMoneyFormatter.Factory factory, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        this.appService = realBitcoinPerformanceDataRepo;
        this.launcher = intentLauncher;
        this.analytics = analytics;
        this.navigator = screenNavigator;
        this.blockersNavigator = factory.createAlwaysSigned();
        this.stringManager = factory.create(MoneyFormatterConfig.STANDARD);
        NumberFormat percentInstance = NumberFormat.getPercentInstance();
        percentInstance.setMinimumFractionDigits(0);
        percentInstance.setMaximumFractionDigits(2);
        this.args = percentInstance;
    }

    public DisclosurePresenter(RealUuidGenerator realUuidGenerator, Analytics analytics, ActivityInviteItemPresenter$Factory$Impl activityInviteItemPresenter$Factory$Impl, RealQuickAccessBarStore realQuickAccessBarStore, ActivityAnalyticsService activityAnalyticsService, RealFavoritesManager realFavoritesManager, RealAllowlistRepository realAllowlistRepository, BetterNavigator.ScreenNavigator screenNavigator, Screen screen) {
        this.$r8$classId = 4;
        screen.getClass();
        this.analytics = realQuickAccessBarStore;
        this.appService = activityAnalyticsService;
        this.blockersNavigator = realFavoritesManager;
        this.stringManager = realAllowlistRepository;
        this.navigator = screenNavigator;
        this.launcher = screen;
        this.args = LazyKt.lazy(new BalanceFeedKt$$ExternalSyntheticLambda5(9, activityInviteItemPresenter$Factory$Impl, this));
    }

    public DisclosurePresenter(BlockersScreens.InstrumentSelectionScreen instrumentSelectionScreen, BetterNavigator.ScreenNavigator screenNavigator, com.squareup.cash.cashlynxflow.service.v2.AppService appService, AndroidStringManager androidStringManager, BlockersDataNavigator blockersDataNavigator, Analytics analytics, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl) {
        this.$r8$classId = 14;
        this.appService = instrumentSelectionScreen;
        this.navigator = screenNavigator;
        this.launcher = appService;
        this.stringManager = androidStringManager;
        this.blockersNavigator = blockersDataNavigator;
        this.analytics = analytics;
        this.args = realBlockersHelper$Factory$Impl.create(screenNavigator);
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3435models(Flow flow, Composer composer, int i) {
        int i2;
        int i3;
        int i4;
        int i5 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        flow.getClass();
        switch (i5) {
            case 12:
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startRestartGroup(282352994);
                if ((i & 48) == 0) {
                    i2 = (gapComposer.changed(this) ? 32 : 16) | i;
                } else {
                    i2 = i;
                }
                if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
                    BlockersScreens.ClientScenarioLauncher clientScenarioLauncher = (BlockersScreens.ClientScenarioLauncher) this.args;
                    boolean z = (i2 & 112) == 32;
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (z || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new AmountPickerCondensedView.AnonymousClass14(this, continuation, 29);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Updater.LaunchedEffect(gapComposer, clientScenarioLauncher, (Function2) rememberedValue);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new CheckmarkPresenter$$ExternalSyntheticLambda0(this, flow, i, 21);
                    break;
                }
                break;
            case 22:
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startRestartGroup(2075562357);
                if ((i & 48) == 0) {
                    i3 = i | (gapComposer2.changedInstance(this) ? 32 : 16);
                } else {
                    i3 = i;
                }
                if (gapComposer2.shouldExecute(i3 & 1, (i3 & 17) != 16)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changedInstance = gapComposer2.changedInstance(this);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new GooglePayPresenter$models$1$1(this, continuation, 28);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue2);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup2 = gapComposer2.endRestartGroup();
                if (endRestartGroup2 != null) {
                    endRestartGroup2.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, 5);
                    break;
                }
                break;
            default:
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startRestartGroup(2099962587);
                if ((i & 6) == 0) {
                    i4 = (gapComposer3.changedInstance(flow) ? 4 : 2) | i;
                } else {
                    i4 = i;
                }
                if ((i & 48) == 0) {
                    i4 |= gapComposer3.changedInstance(this) ? 32 : 16;
                }
                if (gapComposer3.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
                    Updater.LaunchedEffect(gapComposer3, flow, new PasscodeDialogPresenter$models$1$1(flow, continuation, this, 23));
                    Unit unit2 = Unit.INSTANCE;
                    boolean changedInstance2 = gapComposer3.changedInstance(this);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new RealKeyStoreProvider$load$2(this, continuation, 13);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    Updater.LaunchedEffect(gapComposer3, unit2, (Function2) rememberedValue3);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                RecomposeScopeImpl endRestartGroup3 = gapComposer3.endRestartGroup();
                if (endRestartGroup3 != null) {
                    endRestartGroup3.block = new GooglePayPresenter$$ExternalSyntheticLambda0(this, flow, i, 17);
                    break;
                }
                break;
        }
    }

    public InlineAppMessageV2ViewModel models(Flow flow, Composer composer) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1889470583);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(flow);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new InlineAppMessageV2PresenterHelper$models$1$1(this, flow, null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            Flow flow2 = (Flow) this.blockersNavigator;
            rememberedValue2 = FlowKt.merge(new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(flow2, this, 25), 13), new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(flow2, 24), this, 26), this, 27));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        InlineAppMessageV2ViewModel inlineAppMessageV2ViewModel = (InlineAppMessageV2ViewModel) Updater.collectAsState((Flow) rememberedValue2, InlineAppMessageV2ViewModel.NotAvailable.INSTANCE, null, gapComposer, 0, 2).getValue();
        gapComposer.end(false);
        return inlineAppMessageV2ViewModel;
    }

    /* renamed from: models, reason: collision with other method in class */
    public InlineAppMessageViewModel m3434models(Flow flow, Composer composer) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(-1324355101);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this) | gapComposer.changedInstance(flow);
        Object rememberedValue = gapComposer.rememberedValue();
        Continuation continuation = null;
        Object obj = Composer.Companion.Empty;
        if (changedInstance || rememberedValue == obj) {
            rememberedValue = new InlineAppMessagePresenterHelper$models$1$1(this, flow, null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == obj) {
            Flow flow2 = (Flow) this.stringManager;
            int i = 12;
            DataStoreImpl$data$1$invokeSuspend$$inlined$map$1 dataStoreImpl$data$1$invokeSuspend$$inlined$map$1 = new DataStoreImpl$data$1$invokeSuspend$$inlined$map$1(new BitcoinDepositsPresenter$special$$inlined$filter$1(flow2, i), i);
            int i2 = 24;
            rememberedValue2 = FlowKt.merge(dataStoreImpl$data$1$invokeSuspend$$inlined$map$1, new RealBadger2$scheduleBadgeClearingWork$$inlined$map$1(FlowKt.take(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(flow2, i2), 1), this, i2));
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, InlineAppMessageViewModel.NotAvailable.INSTANCE, null, gapComposer, 0, 2);
        InlineAppMessageViewModel inlineAppMessageViewModel = (InlineAppMessageViewModel) collectAsState.getValue();
        boolean changedInstance2 = gapComposer.changedInstance(this) | gapComposer.changed(collectAsState);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changedInstance2 || rememberedValue3 == obj) {
            rememberedValue3 = new SearchBarBinding$Content$1$1(this, collectAsState, continuation, 22);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, inlineAppMessageViewModel, (Function2) rememberedValue3);
        InlineAppMessageViewModel inlineAppMessageViewModel2 = (InlineAppMessageViewModel) collectAsState.getValue();
        gapComposer.end(false);
        return inlineAppMessageViewModel2;
    }
}
