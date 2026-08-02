package com.squareup.cash.music.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.material.TextKt$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.paging.FlowExtKt;
import androidx.paging.PageEvent;
import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.navigation.api.RealCashLocalShortlinkHandler;
import app.cash.local.presenters.sheet.EducationalSheetPresenter;
import app.cash.local.presenters.sheet.EducationalSheetPresenter$Factory$Impl;
import app.cash.local.screens.app.LocalEducationalSheet;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import app.cash.local.screens.app.LocalShortlinkSheet;
import app.cash.local.viewmodels.LocalExplanatoryDialogViewModel;
import app.cash.local.viewmodels.sheet.EducationalSheetModelList;
import app.cash.local.viewmodels.sheet.LocalShortlinkViewModel;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.network.NetworkFetcher$doFetch$fetchResult$1;
import com.fillr.e0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmh;
import com.google.android.gms.internal.mlkit_genai_prompt.zzmo;
import com.google.android.gms.maps.zzai;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.account.navigation.RealAccountOutboundNavigator;
import com.squareup.cash.amountslider.AmountPickerCondensedView;
import com.squareup.cash.appintro.screens.AlternativeNewSponsorAliasScreen;
import com.squareup.cash.appintro.viewmodels.AlternativeNewSponsorAliasViewModel;
import com.squareup.cash.appupdate.viewmodels.AppUpdateDialogViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Illustrations;
import com.squareup.cash.arcade.components.ToastKt$Toast$7$1;
import com.squareup.cash.arcade.components.ToastKt$Toast$9$1;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.backend.bitcoinautowithdraw.RealBitcoinAutoWithdrawRepo;
import com.squareup.cash.bitcoin.formatter.RealBitcoinFormatter;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.PaidInBitcoinState;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.RealPaidInBitcoinStateManager;
import com.squareup.cash.bitcoin.presenters.paidinbitcoin.navigation.RealPaidInBitcoinNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.screens.BitcoinInvoiceEntryScreen;
import com.squareup.cash.bitcoin.screens.BitcoinPeriodSelectionScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositCopyScreen;
import com.squareup.cash.bitcoin.viewmodels.paidinbitcoin.PaidInBitcoinCardUpsellViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositCopyViewModel;
import com.squareup.cash.blockers.presenters.AmountBlockerPresenter$models$1$2;
import com.squareup.cash.blockers.presenters.CashtagPresenter$models$2$1;
import com.squareup.cash.blockers.presenters.FormBlockerPresenter;
import com.squareup.cash.blockers.presenters.SetNamePresenter$models$1$1$1;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewModel;
import com.squareup.cash.blockers.views.FileBlockerView$6$2$2;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.boost.db.RewardSlotQueries;
import com.squareup.cash.borrow.screens.ExpandedLoanHistory;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.buynowpaylater.screens.AfterPayInfoSheetScreen;
import com.squareup.cash.buynowpaylater.screens.OrderDetailsOverflowActionSheetScreen;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewModel;
import com.squareup.cash.card.onboarding.CardStudioPresenter$models$1$1;
import com.squareup.cash.card.onboarding.StampSheetViewModel;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStamps;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStampsV2;
import com.squareup.cash.card.spendinginsights.backend.api.GeneralSpendingInsightsError;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsightsConfig;
import com.squareup.cash.card.spendinginsights.viewmodels.RecurringPaymentInfoViewModel;
import com.squareup.cash.cashapppay.settings.screens.UnlinkResultScreen;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.UnlinkResultViewModel;
import com.squareup.cash.cdf.limits.LimitsBrowseScreen;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.VerifyCheckDepositPresenter$models$3$1;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.moneyformatter.MoneyFormatterConfig;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.crypto.backend.autoinvest.CryptoAutoInvestRepo;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.backend.receiveasbitcoin.RealReceiveP2PAsBitcoinRepo;
import com.squareup.cash.crypto.backend.roundups.RealBitcoinRoundUpsRepo;
import com.squareup.cash.crypto.backend.settings.RealBitcoinConfigRepo;
import com.squareup.cash.crypto.backend.value.RealCryptoValueRepo;
import com.squareup.cash.crypto.navigation.BitcoinExchangeType;
import com.squareup.cash.crypto.navigation.CryptoFlowStarter;
import com.squareup.cash.data.TemporaryStorage$getDir$2;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.data.profile.RealProfileManager$setPhoto$2;
import com.squareup.cash.db2.OfflineConfig;
import com.squareup.cash.db2.contacts.CustomerQueries$$ExternalSyntheticLambda7;
import com.squareup.cash.db2.contacts.CustomerQueries$merchantsWithBusinessGrants$2;
import com.squareup.cash.deposits.physical.screens.AtmPmdExplainerScreen;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmPmdExplainerViewModel;
import com.squareup.cash.dialog.ArcadeModal$$ExternalSyntheticLambda2;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter;
import com.squareup.cash.education.stories.presenters.EducationStoryPresenter$Factory$Impl;
import com.squareup.cash.education.stories.screens.EducationStoryViewPagerScreen;
import com.squareup.cash.education.stories.viewmodels.EducationStoryViewPagerViewModel;
import com.squareup.cash.family.familyhub.screens.SponsorResourcesScreen;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesRowViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesSectionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorResourcesViewModel;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.formview.components.FormCashtag$8$invokeSuspend$$inlined$map$1;
import com.squareup.cash.google.pay.RealGooglePayer$createWallet$$inlined$map$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.swampgl.GLThread$start$2;
import com.squareup.cash.graphics.swampgl.components.Transform$special$$inlined$map$1;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.growtools.presenters.manager.GrowToolsManagerDelegate;
import com.squareup.cash.growtools.presenters.manager.activity.RealGrowToolsActivityPresenterFactory;
import com.squareup.cash.growtools.presenters.manager.autoinvest.GrowToolsAutoInvestManager;
import com.squareup.cash.growtools.presenters.manager.autoinvest.GrowToolsAutoInvestManager$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.bitcoinautowithdraw.GrowToolsBitcoinAutoWithdrawManager$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.directdeposit.GrowToolsDirectDepositManager$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.receivep2pasbtc.GrowToolsReceiveP2PAsBitcoinManager$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.roundups.GrowToolsRoundUpsManager$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.state.RealGrowToolsManagerViewAppearanceTracker;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.incentives.finishsetup.applets.presenters.RealFinishSetupAppletTileRepository;
import com.squareup.cash.incentives.finishsetup.applets.viewmodels.FinishSetupAppletTileViewModel;
import com.squareup.cash.instruments.backend.real.RealInstrumentManager;
import com.squareup.cash.instruments.common.Instrument;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.investing.backend.real.analytics.RealInvestingAnalytics;
import com.squareup.cash.investing.backend.real.autoinvest.RealAutoInvestRepo$Factory$Impl;
import com.squareup.cash.investing.components.InvestingHomeView$onScrollFlow$1;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.SectionMoreInfoViewModel;
import com.squareup.cash.investing.viewmodels.custom.order.CancelOrderViewModel;
import com.squareup.cash.investingcrypto.viewmodels.common.orders.PeriodSelectionViewModel;
import com.squareup.cash.keystore.RealKeyStoreProvider$load$2;
import com.squareup.cash.keystore.RealKeyStoreProvider$setEntry$2;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.limits.backend.api.CustomerLimitsModel;
import com.squareup.cash.limits.backend.api.LimitsPageletStore$VersionedLimitsPagelet;
import com.squareup.cash.limits.backend.real.RealLimitsPageletStore;
import com.squareup.cash.limits.backend.real.RealLimitsStore;
import com.squareup.cash.limits.presenters.LimitsInlineMessagePresenter$AssistedInjectionFactory$Impl;
import com.squareup.cash.limits.presenters.LimitsInlineMessagePresenter$MetroFactory;
import com.squareup.cash.limits.presenters.LimitsPresenter$WhenMappings;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.limits.viewmodels.LimitsMessageViewModel;
import com.squareup.cash.limits.viewmodels.LimitsType;
import com.squareup.cash.limits.viewmodels.LimitsViewEvent;
import com.squareup.cash.limits.viewmodels.LimitsViewModel;
import com.squareup.cash.limits.viewmodels.UnifiedInlineMessageButton$Network;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$$inlined$CollectEffect$1;
import com.squareup.cash.maps.presenter.CashMapPresenter$models$3$1;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.booklet.CardSection;
import com.squareup.cash.money.booklet.CollapsibleDetailsSection;
import com.squareup.cash.money.booklet.DisclosureSection;
import com.squareup.cash.money.booklet.HeaderSection;
import com.squareup.cash.money.booklet.HeroSection;
import com.squareup.cash.money.booklet.ListUnorderedCardSection;
import com.squareup.cash.money.booklet.ListUnorderedSection;
import com.squareup.cash.money.booklet.MoneyTabBookletScreen;
import com.squareup.cash.money.booklet.MoneyTabBookletSection;
import com.squareup.cash.money.booklet.MoneyTabBookletViewModel;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.moneybot.backend.api.managers.ChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealChatManager;
import com.squareup.cash.moneybot.backend.real.managers.RealMoneybotPreambleManager;
import com.squareup.cash.moneybot.genie.GenieViewKt$GenieView$1$1;
import com.squareup.cash.moneybot.presenters.MoneybotChatPresenter$models$6$1;
import com.squareup.cash.moneybot.presenters.MoneybotPreambleEditorPresenter$fetchMoneybotPreamble$1;
import com.squareup.cash.moneybot.presenters.MoneybotPreambleEditorPresenter$models$1$1;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackOption;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackQuestion;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackScreen;
import com.squareup.cash.moneybot.screens.ThumbDirection;
import com.squareup.cash.moneybot.viewmodels.MoneybotPreambleEditorViewModel;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.mosaic.resources.api.v2.Music;
import com.squareup.cash.music.backend.real.RealMusicPlayer;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.screens.MusicScreen;
import com.squareup.cash.music.viewmodels.MusicViewModel;
import com.squareup.cash.music.viewmodels.Track;
import com.squareup.cash.observability.protovalidation.HasObservability;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$MetroFactory;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.securityhub.presenters.RecoveryGuidePresenter$MetroFactory;
import com.squareup.cash.storage.AndroidFileSaver;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.LongPreference;
import com.squareup.protos.cash.cashlimitsxp.api.v1.GetInlineMessageResponse;
import com.squareup.protos.cash.cashsourceoffunds.api.v1.CashSourceOfFundsClientService;
import com.squareup.protos.cash.investautomator.model.api.flows.InvestAutomatorFlowService;
import com.squareup.protos.cash.kgoose.api.v3.GetRuntimeMetadataResponse;
import com.squareup.protos.cash.local.client.v1.EducationalSheet;
import com.squareup.protos.cash.local.client.v1.ShortlinkAction;
import com.squareup.protos.cash.money.content.FinishSetupTileV1;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.cash.usher.api.GetPreSignInDataResponse;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.MoneyTabBookletBlocker;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.protos.franklin.investing.resources.CustomOrderConfiguration;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.protos.invest.ui.Section;
import com.squareup.util.Strings;
import com.squareup.util.coroutines.CoroutinesKt$until$2;
import com.squareup.util.coroutines.StateFlowKt;
import com.squareup.workflow1.ui.ViewShowRenderingKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.InstanceFactory;
import io.noties.markwon.MarkwonConfiguration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import squareup.cash.scheduledreloader.api.external.v1.ScheduledReloaderAppService;

/* loaded from: classes6.dex */
public final class MusicPresenter implements MoleculePresenter, HasObservability {
    public final /* synthetic */ int $r8$classId;
    public final Object args;
    public final Object musicPlayer;
    public final Object musicRepository;
    public final Object navigator;

    public MusicPresenter(MarkwonConfiguration markwonConfiguration, Analytics analytics, RealGrowToolsManagerViewAppearanceTracker realGrowToolsManagerViewAppearanceTracker, GrowToolsManagerScreen growToolsManagerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        Object obj;
        this.$r8$classId = 21;
        growToolsManagerScreen.getClass();
        this.musicRepository = analytics;
        this.musicPlayer = realGrowToolsManagerViewAppearanceTracker;
        this.args = growToolsManagerScreen;
        if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageRoundUpsScreen) {
            OfflineConfig.Adapter adapter = ((GrowToolsRoundUpsManager$Factory$Impl) markwonConfiguration.theme).delegateFactory;
            SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) adapter.attempted_payment_status_resultAdapter).getValue();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) ((Provider) adapter.offline_payment_status_resultAdapter).invoke();
            RealGrowToolsActivityPresenterFactory realGrowToolsActivityPresenterFactory = (RealGrowToolsActivityPresenterFactory) ((Provider) adapter.attempted_bill_status_resultAdapter).invoke();
            AndroidStringManager androidStringManager = (AndroidStringManager) ((LambdaProvider) adapter.offline_bill_status_resultAdapter).lambda.invoke();
            Lazy lazy = (Lazy) ((AndroidFileSaver.MetroFactory) adapter.attempted_cash_out_status_resultAdapter).invoke();
            InvestAutomatorFlowService investAutomatorFlowService = (InvestAutomatorFlowService) ((DoubleCheck) adapter.offline_cash_out_status_resultAdapter).getValue();
            FlowStarter flowStarter = (FlowStarter) ((DoubleCheck) adapter.attempted_add_cash_status_resultAdapter).getValue();
            RealBitcoinRoundUpsRepo realBitcoinRoundUpsRepo = (RealBitcoinRoundUpsRepo) ((Provider) adapter.offline_add_cash_status_resultAdapter).invoke();
            Analytics analytics2 = (Analytics) ((DoubleCheck) adapter.error_cash_out_status_resultAdapter).getValue();
            RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) ((Provider) adapter.error_add_cash_status_resultAdapter).invoke();
            CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) adapter.offline_transfer_scenario_planAdapter).value;
            ErrorReporter errorReporter = (ErrorReporter) ((LambdaProvider) adapter.error_transfer_scenario_planAdapter).lambda.invoke();
            SampleStrategy sampleStrategy = (SampleStrategy) ((Provider) adapter.retry_intervalsAdapter).invoke();
            syncValueReader.getClass();
            factory.getClass();
            realGrowToolsActivityPresenterFactory.getClass();
            androidStringManager.getClass();
            investAutomatorFlowService.getClass();
            flowStarter.getClass();
            realBitcoinRoundUpsRepo.getClass();
            analytics2.getClass();
            realFamilyProfileManager.getClass();
            coroutineScope.getClass();
            errorReporter.getClass();
            sampleStrategy.getClass();
            obj = new RealAccountOutboundNavigator(syncValueReader, factory, realGrowToolsActivityPresenterFactory, androidStringManager, lazy, investAutomatorFlowService, flowStarter, realBitcoinRoundUpsRepo, analytics2, realFamilyProfileManager, coroutineScope, (GrowToolsManagerScreen.ManageRoundUpsScreen) growToolsManagerScreen, screenNavigator, errorReporter, sampleStrategy);
        } else if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageAutoInvestScreen) {
            FormBlockerPresenter.MetroFactory metroFactory = ((GrowToolsAutoInvestManager$Factory$Impl) markwonConfiguration.syntaxHighlight).delegateFactory;
            AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
            RealGrowToolsActivityPresenterFactory realGrowToolsActivityPresenterFactory2 = (RealGrowToolsActivityPresenterFactory) metroFactory.blockersNavigator.invoke();
            CryptoAutoInvestRepo cryptoAutoInvestRepo = (CryptoAutoInvestRepo) metroFactory.formAnalytics.invoke();
            RealAutoInvestRepo$Factory$Impl realAutoInvestRepo$Factory$Impl = (RealAutoInvestRepo$Factory$Impl) metroFactory.multiBlockerFacilitator.invoke();
            AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) metroFactory.clock.lambda.invoke();
            ScheduledReloaderAppService scheduledReloaderAppService = (ScheduledReloaderAppService) metroFactory.signOut.getValue();
            Analytics analytics3 = (Analytics) metroFactory.signedInStateManager.getValue();
            CoroutineScope coroutineScope2 = (CoroutineScope) metroFactory.formPresenterFactory.value;
            FeatureFlagManager featureFlagManager = (FeatureFlagManager) metroFactory.analytics.getValue();
            LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) metroFactory.blockersHelperFactory.invoke();
            androidStringManager2.getClass();
            realGrowToolsActivityPresenterFactory2.getClass();
            cryptoAutoInvestRepo.getClass();
            realAutoInvestRepo$Factory$Impl.getClass();
            androidDateFormatManager.getClass();
            scheduledReloaderAppService.getClass();
            analytics3.getClass();
            coroutineScope2.getClass();
            featureFlagManager.getClass();
            factory2.getClass();
            obj = new GrowToolsAutoInvestManager(androidStringManager2, realGrowToolsActivityPresenterFactory2, cryptoAutoInvestRepo, realAutoInvestRepo$Factory$Impl, androidDateFormatManager, scheduledReloaderAppService, analytics3, coroutineScope2, featureFlagManager, factory2, (GrowToolsManagerScreen.ManageAutoInvestScreen) growToolsManagerScreen, screenNavigator);
        } else if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageDirectDepositScreen) {
            GrowToolsManagerScreen.ManageDirectDepositScreen manageDirectDepositScreen = (GrowToolsManagerScreen.ManageDirectDepositScreen) growToolsManagerScreen;
            RecoveryGuidePresenter$MetroFactory recoveryGuidePresenter$MetroFactory = ((GrowToolsDirectDepositManager$Factory$Impl) markwonConfiguration.linkResolver).delegateFactory;
            RealGrowToolsActivityPresenterFactory realGrowToolsActivityPresenterFactory3 = (RealGrowToolsActivityPresenterFactory) recoveryGuidePresenter$MetroFactory.supportNavigator.invoke();
            PaychecksAppService paychecksAppService = (PaychecksAppService) recoveryGuidePresenter$MetroFactory.intentFactory.getValue();
            AndroidStringManager androidStringManager3 = (AndroidStringManager) recoveryGuidePresenter$MetroFactory.stringManager.lambda.invoke();
            RealPaidInBitcoinStateManager realPaidInBitcoinStateManager = (RealPaidInBitcoinStateManager) recoveryGuidePresenter$MetroFactory.passcodeFlowStarter.invoke();
            RealPaidInBitcoinNavigator$Factory$Impl realPaidInBitcoinNavigator$Factory$Impl = (RealPaidInBitcoinNavigator$Factory$Impl) recoveryGuidePresenter$MetroFactory.deviceManagerInboundNavigatorFactory.invoke();
            Analytics analytics4 = (Analytics) recoveryGuidePresenter$MetroFactory.analytics.getValue();
            CoroutineScope coroutineScope3 = (CoroutineScope) recoveryGuidePresenter$MetroFactory.activity.value;
            realGrowToolsActivityPresenterFactory3.getClass();
            paychecksAppService.getClass();
            androidStringManager3.getClass();
            realPaidInBitcoinStateManager.getClass();
            realPaidInBitcoinNavigator$Factory$Impl.getClass();
            analytics4.getClass();
            coroutineScope3.getClass();
            manageDirectDepositScreen.getClass();
            zzai zzaiVar = new zzai();
            zzaiVar.zaa = paychecksAppService;
            zzaiVar.zab = androidStringManager3;
            zzaiVar.zac = realPaidInBitcoinStateManager;
            zzaiVar.zad = analytics4;
            zzaiVar.zza = coroutineScope3;
            zzaiVar.zzb = manageDirectDepositScreen;
            zzaiVar.zzc = screenNavigator;
            zzaiVar.zzd = realGrowToolsActivityPresenterFactory3.create(manageDirectDepositScreen, screenNavigator, null);
            zzaiVar.zze = realPaidInBitcoinNavigator$Factory$Impl.create(screenNavigator);
            obj = zzaiVar;
        } else if (growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen) {
            HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory = ((GrowToolsReceiveP2PAsBitcoinManager$Factory$Impl) markwonConfiguration.imageDestinationProcessor).delegateFactory;
            RealGrowToolsActivityPresenterFactory realGrowToolsActivityPresenterFactory4 = (RealGrowToolsActivityPresenterFactory) helpSheetPresenter$MetroFactory.routerFactory.invoke();
            RealReceiveP2PAsBitcoinRepo realReceiveP2PAsBitcoinRepo = (RealReceiveP2PAsBitcoinRepo) helpSheetPresenter$MetroFactory.syncValueReader.getValue();
            CryptoFlowStarter cryptoFlowStarter = (CryptoFlowStarter) helpSheetPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
            AndroidStringManager androidStringManager4 = (AndroidStringManager) helpSheetPresenter$MetroFactory.errorReporter.lambda.invoke();
            realGrowToolsActivityPresenterFactory4.getClass();
            realReceiveP2PAsBitcoinRepo.getClass();
            cryptoFlowStarter.getClass();
            androidStringManager4.getClass();
            obj = new e0(realGrowToolsActivityPresenterFactory4, realReceiveP2PAsBitcoinRepo, cryptoFlowStarter, androidStringManager4, (GrowToolsManagerScreen.ManageReceiveP2PAsBitcoinScreen) growToolsManagerScreen, screenNavigator);
        } else {
            if (!(growToolsManagerScreen instanceof GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                throw null;
            }
            GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen manageBitcoinAutoWithdrawScreen = (GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen) growToolsManagerScreen;
            ChannelListPresenter.MetroFactory metroFactory2 = ((GrowToolsBitcoinAutoWithdrawManager$Factory$Impl) markwonConfiguration.spansFactory).delegateFactory;
            SyncValueReader syncValueReader2 = (SyncValueReader) metroFactory2.blockersNavigator.getValue();
            RealGrowToolsActivityPresenterFactory realGrowToolsActivityPresenterFactory5 = (RealGrowToolsActivityPresenterFactory) metroFactory2.repository.invoke();
            AndroidStringManager androidStringManager5 = (AndroidStringManager) metroFactory2.stringManager.lambda.invoke();
            FlowStarter flowStarter2 = (FlowStarter) metroFactory2.analytics.getValue();
            RealBitcoinFormatter realBitcoinFormatter = (RealBitcoinFormatter) metroFactory2.customerStore.invoke();
            RealBitcoinAutoWithdrawRepo realBitcoinAutoWithdrawRepo = (RealBitcoinAutoWithdrawRepo) metroFactory2.featureFlagManager.getValue();
            LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) metroFactory2.permissionManager.invoke();
            RealBitcoinProfileRepo realBitcoinProfileRepo = (RealBitcoinProfileRepo) metroFactory2.launcher.invoke();
            RealCryptoValueRepo realCryptoValueRepo = (RealCryptoValueRepo) metroFactory2.settingsChecker.invoke();
            syncValueReader2.getClass();
            realGrowToolsActivityPresenterFactory5.getClass();
            androidStringManager5.getClass();
            flowStarter2.getClass();
            realBitcoinFormatter.getClass();
            realBitcoinAutoWithdrawRepo.getClass();
            factory3.getClass();
            realBitcoinProfileRepo.getClass();
            realCryptoValueRepo.getClass();
            manageBitcoinAutoWithdrawScreen.getClass();
            RealBugReportSenderFactory realBugReportSenderFactory = new RealBugReportSenderFactory();
            realBugReportSenderFactory.bugReportService = syncValueReader2;
            realBugReportSenderFactory.sessionManager = androidStringManager5;
            realBugReportSenderFactory.tempStorage = flowStarter2;
            realBugReportSenderFactory.preferences = realBitcoinFormatter;
            realBugReportSenderFactory.endpoint = realBitcoinAutoWithdrawRepo;
            realBugReportSenderFactory.backStackDumper = manageBitcoinAutoWithdrawScreen;
            realBugReportSenderFactory.featureEligibilityDumper = screenNavigator;
            realBugReportSenderFactory.cashDatabase = realGrowToolsActivityPresenterFactory5.create(manageBitcoinAutoWithdrawScreen, screenNavigator, null);
            realBugReportSenderFactory.endpointContext = factory3.create(MoneyFormatterConfig.STANDARD);
            realBugReportSenderFactory.scope = syncValueReader2.getSingleValue(AndroidSyncValueSpecs.AutoBtcWithdrawThreshold);
            realBugReportSenderFactory.bugsnagClient = ViewShowRenderingKt.displayUnitProto(realBitcoinProfileRepo);
            realBugReportSenderFactory.recentMoneybotSession = realCryptoValueRepo.valuePerBitcoin(null);
            obj = realBugReportSenderFactory;
        }
        this.navigator = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$fetchMoneybotPreamble(MusicPresenter musicPresenter, ContinuationImpl continuationImpl) {
        MoneybotPreambleEditorPresenter$fetchMoneybotPreamble$1 moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1;
        int i;
        ApiResult apiResult;
        if (continuationImpl instanceof MoneybotPreambleEditorPresenter$fetchMoneybotPreamble$1) {
            moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1 = (MoneybotPreambleEditorPresenter$fetchMoneybotPreamble$1) continuationImpl;
            int i2 = moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    ChatManager chatManager = (ChatManager) musicPresenter.musicRepository;
                    moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1.label = 1;
                    obj = ((RealChatManager) chatManager).getRuntimeMetadata(moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1);
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
                    return ((GetRuntimeMetadataResponse) ((ApiResult.Success) apiResult).response).system_preamble;
                }
                if (apiResult instanceof ApiResult.Failure) {
                    return "";
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
        }
        moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1 = new MoneybotPreambleEditorPresenter$fetchMoneybotPreamble$1(musicPresenter, continuationImpl);
        Object obj2 = moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = moneybotPreambleEditorPresenter$fetchMoneybotPreamble$1.label;
        if (i != 0) {
        }
        apiResult = (ApiResult) obj2;
        if (!(apiResult instanceof ApiResult.Success)) {
        }
    }

    public static final Track access$toTrack(MusicPresenter musicPresenter, Music music) {
        String str = music.music_id;
        if (str == null) {
            return null;
        }
        String str2 = music.title;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = music.artist;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = music.album_art_url;
        return new Track(str2, str3, new Image(str4, str4, 4), false, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object models$com$squareup$cash$limits$presenters$LimitsPresenter(Flow flow, Composer composer, int i) {
        Iterable iterable;
        LimitsType limitsType;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(171794581);
        Object rememberedValue = gapComposer.rememberedValue();
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = new SafeFlow(new CashMapPresenter$models$3$1((RealLimitsStore) this.musicRepository, null));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue, CustomerLimitsModel.Loading.INSTANCE, null, gapComposer, 0, 2);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new FormCashtag$8$invokeSuspend$$inlined$map$1(new FinishSetupTileBadgeCounter(23, flow, Reflection.factory.getOrCreateKotlinClass(LimitsViewEvent.LimitsInlineMessageEvent.class)), 27);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Flow flow2 = (Flow) rememberedValue2;
        CustomerLimitsModel customerLimitsModel = (CustomerLimitsModel) collectAsState.getValue();
        CustomerLimitsModel.Loaded loaded = customerLimitsModel instanceof CustomerLimitsModel.Loaded ? (CustomerLimitsModel.Loaded) customerLimitsModel : null;
        LimitsType limitsType2 = loaded != null ? loaded.limitsType : null;
        int i2 = limitsType2 == null ? -1 : LimitsPresenter$WhenMappings.$EnumSwitchMapping$0[limitsType2.ordinal()];
        LimitsBrowseScreen.ScreenType screenType = i2 != 1 ? i2 != 2 ? null : LimitsBrowseScreen.ScreenType.GROUPED_LIMITS : LimitsBrowseScreen.ScreenType.LIMITS;
        boolean changed = gapComposer.changed(screenType != null ? screenType.ordinal() : -1) | gapComposer.changedInstance(this);
        Object rememberedValue3 = gapComposer.rememberedValue();
        if (changed || rememberedValue3 == neverEqualPolicy) {
            rememberedValue3 = new GenieViewKt$GenieView$1$1(screenType, this, objArr == true ? 1 : 0, 8);
            gapComposer.updateRememberedValue(rememberedValue3);
        }
        Updater.LaunchedEffect(gapComposer, screenType, (Function2) rememberedValue3);
        Updater.LaunchedEffect(gapComposer, flow, new CashMapPresenter$models$3$1(flow, (Continuation) (objArr2 == true ? 1 : 0), (MoleculePresenter) this, 4));
        CustomerLimitsModel customerLimitsModel2 = (CustomerLimitsModel) collectAsState.getValue();
        LimitsMessageViewModel limitsMessageViewModel = (LimitsMessageViewModel) ((MusicPresenter) this.args).models(flow2, (Composer) gapComposer, 0);
        boolean z = customerLimitsModel2 instanceof CustomerLimitsModel.Loaded;
        CustomerLimitsModel.Loaded loaded2 = z ? (CustomerLimitsModel.Loaded) customerLimitsModel2 : null;
        if (loaded2 == null || (iterable = loaded2.limits) == null) {
            iterable = EmptyList.INSTANCE;
        }
        CustomerLimitsModel.Loaded loaded3 = z ? (CustomerLimitsModel.Loaded) customerLimitsModel2 : null;
        if (loaded3 == null || (limitsType = loaded3.limitsType) == null) {
            limitsType = LimitsType.GROUPED;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!((LimitViewModel) obj).categories.isEmpty()) {
                arrayList.add(obj);
            }
        }
        boolean z2 = customerLimitsModel2 instanceof CustomerLimitsModel.Loading;
        List list = z2 ? null : arrayList;
        if (list == null) {
            list = EmptyList.INSTANCE;
        }
        LimitsViewModel limitsViewModel = new LimitsViewModel(list, limitsMessageViewModel, z2, limitsType);
        gapComposer.end(false);
        return limitsViewModel;
    }

    private final Object models$com$squareup$cash$money$booklet$MoneyTabBookletPresenter(Flow flow, Composer composer, int i) {
        MoneyTabBookletSection moneyTabBookletSection;
        MoneyTabBookletSection listUnorderedCardSection;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(439781515);
        Updater.LaunchedEffect(gapComposer, flow, new CashMapPresenter$models$3$1(flow, (Continuation) null, this, 16));
        MoneyTabBookletBlocker moneyTabBookletBlocker = ((MoneyTabBookletScreen) this.musicRepository).blocker;
        moneyTabBookletBlocker.getClass();
        List<MoneyTabBookletBlocker.MoneyTabBookletSection> list = moneyTabBookletBlocker.sections;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                BlockerAction blockerAction = moneyTabBookletBlocker.cta_action;
                blockerAction.getClass();
                String str = blockerAction.text;
                str.getClass();
                MoneyTabBookletViewModel moneyTabBookletViewModel = new MoneyTabBookletViewModel(str, arrayList);
                gapComposer.end(false);
                return moneyTabBookletViewModel;
            }
            MoneyTabBookletBlocker.MoneyTabBookletSection.Type type2 = ((MoneyTabBookletBlocker.MoneyTabBookletSection) it.next()).type;
            if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero) {
                MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero hero = (MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Hero) type2;
                Image image = hero.getValue().image;
                image.getClass();
                Float f = hero.getValue().image_aspect_ratio;
                moneyTabBookletSection = new HeroSection(image, f != null ? f.floatValue() : 0.7f);
            } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header) {
                MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header header = (MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Header) type2;
                String str2 = header.getValue().label;
                str2.getClass();
                moneyTabBookletSection = new HeaderSection(str2, header.getValue().size == MoneyTabBookletBlocker.HeaderSection.Size.LARGE);
            } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card) {
                MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card card = (MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Card) type2;
                Image image2 = card.getValue().image;
                image2.getClass();
                Float f2 = card.getValue().image_aspect_ratio;
                float floatValue = f2 != null ? f2.floatValue() : 2.0f;
                String str3 = card.getValue().title;
                str3.getClass();
                String str4 = card.getValue().content;
                str4.getClass();
                moneyTabBookletSection = new CardSection(image2, floatValue, str3, str4);
            } else {
                if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.CollapsibleDetails) {
                    List<MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail> list2 = ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.CollapsibleDetails) type2).getValue().collapsible_details;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    for (MoneyTabBookletBlocker.CollapsibleDetailsSection.CollapsibleDetail collapsibleDetail : list2) {
                        String str5 = collapsibleDetail.title;
                        str5.getClass();
                        String str6 = collapsibleDetail.content;
                        str6.getClass();
                        arrayList2.add(new CollapsibleDetailsSection.CollapsibleDetail(str5, str6));
                    }
                    listUnorderedCardSection = new CollapsibleDetailsSection(arrayList2);
                } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnordered) {
                    List<MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem> list3 = ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnordered) type2).getValue().list_unordered_items;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                    for (MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem listUnorderedItem : list3) {
                        String str7 = listUnorderedItem.icon_id;
                        str7.getClass();
                        String str8 = listUnorderedItem.label;
                        str8.getClass();
                        arrayList3.add(new ListUnorderedSection.ListUnorderedItem(str7, str8));
                    }
                    listUnorderedCardSection = new ListUnorderedSection(arrayList3);
                } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard) {
                    MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard listUnorderedCard = (MoneyTabBookletBlocker.MoneyTabBookletSection.Type.ListUnorderedCard) type2;
                    String str9 = listUnorderedCard.getValue().title;
                    str9.getClass();
                    List<MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem> list4 = listUnorderedCard.getValue().list_unordered_items;
                    ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                    for (MoneyTabBookletBlocker.ListUnorderedSection.ListUnorderedItem listUnorderedItem2 : list4) {
                        String str10 = listUnorderedItem2.icon_id;
                        str10.getClass();
                        String str11 = listUnorderedItem2.label;
                        str11.getClass();
                        arrayList4.add(new ListUnorderedSection.ListUnorderedItem(str10, str11));
                    }
                    listUnorderedCardSection = new ListUnorderedCardSection(str9, arrayList4);
                } else if (type2 instanceof MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Disclosure) {
                    String str12 = ((MoneyTabBookletBlocker.MoneyTabBookletSection.Type.Disclosure) type2).getValue().content;
                    str12.getClass();
                    moneyTabBookletSection = new DisclosureSection(str12);
                } else {
                    if (type2 != null) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    moneyTabBookletSection = null;
                }
                moneyTabBookletSection = listUnorderedCardSection;
            }
            if (moneyTabBookletSection != null) {
                arrayList.add(moneyTabBookletSection);
            }
        }
    }

    private final Object models$com$squareup$cash$moneybot$presenters$MoneybotFeedbackPresenter(Flow flow, Composer composer, int i) {
        String str;
        String str2;
        Object obj;
        List listOf;
        String str3;
        AndroidStringManager androidStringManager = (AndroidStringManager) this.musicRepository;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(165538482);
        MoneybotFeedbackQuestion moneybotFeedbackQuestion = (MoneybotFeedbackQuestion) ((MoneybotFeedbackScreen) this.musicPlayer).askedQuestion.question;
        ThumbDirection thumbDirection = moneybotFeedbackQuestion.direction;
        boolean changed = gapComposer.changed(thumbDirection.ordinal());
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (changed || rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(null);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = Updater.mutableStateOf$default("");
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        MutableState mutableState2 = (MutableState) rememberedValue2;
        Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (Object) this, (Object) moneybotFeedbackQuestion, mutableState, mutableState2, 16));
        String str4 = androidStringManager.get(R.string.moneybot_feedback_title);
        int ordinal = thumbDirection.ordinal();
        if (ordinal == 0) {
            str = androidStringManager.get(R.string.moneybot_feedback_dropdown_label_positive);
        } else {
            if (ordinal != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str = androidStringManager.get(R.string.moneybot_feedback_dropdown_label_negative);
        }
        String str5 = str;
        int ordinal2 = thumbDirection.ordinal();
        if (ordinal2 == 0) {
            str2 = androidStringManager.get(R.string.moneybot_feedback_dropdown_placeholder_positive);
        } else {
            if (ordinal2 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            str2 = androidStringManager.get(R.string.moneybot_feedback_dropdown_placeholder_negative);
        }
        String str6 = str2;
        int ordinal3 = thumbDirection.ordinal();
        if (ordinal3 == 0) {
            obj = null;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MoneybotFeedbackViewModel.ReasonOption[]{new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Positive.ACCURATE, androidStringManager.get(R.string.moneybot_feedback_option_positive_accurate)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Positive.CLEAR, androidStringManager.get(R.string.moneybot_feedback_option_positive_clear)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Positive.FAST, androidStringManager.get(R.string.moneybot_feedback_option_positive_fast)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Positive.HELPFUL, androidStringManager.get(R.string.moneybot_feedback_option_positive_helpful)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Positive.OTHER, androidStringManager.get(R.string.moneybot_feedback_option_positive_other))});
        } else {
            if (ordinal3 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            obj = null;
            listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new MoneybotFeedbackViewModel.ReasonOption[]{new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Negative.INACCURATE, androidStringManager.get(R.string.moneybot_feedback_option_negative_inaccurate)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Negative.CONFUSING, androidStringManager.get(R.string.moneybot_feedback_option_negative_confusing)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Negative.TOOK_TOO_LONG, androidStringManager.get(R.string.moneybot_feedback_option_negative_took_too_long)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Negative.INAPPROPRIATE, androidStringManager.get(R.string.moneybot_feedback_option_negative_inappropriate)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Negative.UNHELPFUL, androidStringManager.get(R.string.moneybot_feedback_option_negative_unhelpful)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Negative.FEATURE_REQUEST, androidStringManager.get(R.string.moneybot_feedback_option_negative_feature_request)), new MoneybotFeedbackViewModel.ReasonOption(MoneybotFeedbackOption.Negative.OTHER, androidStringManager.get(R.string.moneybot_feedback_option_negative_other))});
        }
        List list = listOf;
        MoneybotFeedbackOption moneybotFeedbackOption = (MoneybotFeedbackOption) mutableState.getValue();
        String str7 = (String) mutableState2.getValue();
        int ordinal4 = thumbDirection.ordinal();
        if (ordinal4 == 0) {
            str3 = androidStringManager.get(R.string.moneybot_feedback_comment_placeholder_positive);
        } else {
            if (ordinal4 != 1) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return obj;
            }
            str3 = androidStringManager.get(R.string.moneybot_feedback_comment_placeholder_negative);
        }
        String str8 = str3;
        String str9 = androidStringManager.get(R.string.moneybot_feedback_learn_more_url);
        str9.getClass();
        Resources resources = androidStringManager.resources;
        resources.getClass();
        String format2 = new MessageFormat(resources.getString(R.string.moneybot_feedback_disclaimer)).format(new Object[]{str9});
        format2.getClass();
        MoneybotFeedbackViewModel moneybotFeedbackViewModel = new MoneybotFeedbackViewModel(thumbDirection, str4, str5, str6, list, moneybotFeedbackOption, str7, str8, format2, androidStringManager.get(R.string.moneybot_feedback_submit_cta));
        gapComposer.end(false);
        return moneybotFeedbackViewModel;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public ErrorReporter getErrorReporter() {
        return (ErrorReporter) this.musicPlayer;
    }

    @Override // com.squareup.cash.observability.protovalidation.HasObservability
    public SampleStrategy getOneErrorPerAppSessionStrategy() {
        return (SampleStrategy) this.args;
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x02eb, code lost:
    
        if (r2 == 0) goto L129;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Type inference failed for: r10v3, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r12v12, types: [app.cash.local.presenters.sheet.EducationalSheetPresenter, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v105 */
    /* JADX WARN: Type inference failed for: r2v76, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v77, types: [com.squareup.protos.cash.ui.Image] */
    /* JADX WARN: Type inference failed for: r2v78 */
    /* JADX WARN: Type inference failed for: r2v79 */
    /* JADX WARN: Type inference failed for: r2v80 */
    /* JADX WARN: Type inference failed for: r8v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r8v2, types: [app.cash.local.viewmodels.sheet.EducationalSheetModelList] */
    /* JADX WARN: Type inference failed for: r8v30 */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        NeverEqualPolicy neverEqualPolicy;
        LocalExplanatoryDialogViewModel.PositiveButtonType positiveButtonType;
        MutableState mutableState;
        LocalShortlinkViewModel models;
        Object contentModel;
        PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel;
        MutableState mutableState2;
        MutableState mutableState3;
        MutableState mutableState4;
        MutableState mutableState5;
        SpendingInsightsConfig.RecurringPaymentInfo recurringPaymentInfo;
        Object obj;
        String str;
        Object installed;
        Image image;
        Integer num;
        Integer num2;
        LimitsMessageViewModel limitsMessageViewModel;
        CardUpsellIllustration cardUpsellIllustration;
        String str2;
        MutableState mutableState6;
        Object error;
        final MusicPresenter musicPresenter = this;
        int i2 = musicPresenter.$r8$classId;
        int i3 = 28;
        Object obj2 = musicPresenter.navigator;
        int i4 = 17;
        int i5 = 29;
        int i6 = 2;
        int i7 = 14;
        Object obj3 = musicPresenter.musicRepository;
        Object obj4 = musicPresenter.musicPlayer;
        Object obj5 = musicPresenter.args;
        NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
        ?? r8 = 0;
        r8 = null;
        PaidInBitcoinCardUpsellViewModel paidInBitcoinCardUpsellViewModel2 = null;
        int i8 = 0;
        switch (i2) {
            case 0:
                flow.getClass();
                GapComposer gapComposer = (GapComposer) composer;
                gapComposer.startReplaceGroup(-651056743);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == neverEqualPolicy2) {
                    rememberedValue = Updater.mutableStateOf$default(MusicViewModel.Loading.INSTANCE);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                MutableState mutableState7 = (MutableState) rememberedValue;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (rememberedValue2 == neverEqualPolicy2) {
                    rememberedValue2 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                MutableState mutableState8 = (MutableState) rememberedValue2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy2) {
                    rememberedValue3 = FlowKt.MutableStateFlow("");
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                MutableStateFlow mutableStateFlow = (MutableStateFlow) rememberedValue3;
                Unit unit = Unit.INSTANCE;
                boolean changedInstance = gapComposer.changedInstance(mutableStateFlow) | gapComposer.changedInstance(musicPresenter);
                Object rememberedValue4 = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue4 == neverEqualPolicy2) {
                    neverEqualPolicy = neverEqualPolicy2;
                    MusicPresenter$models$1$1 musicPresenter$models$1$1 = new MusicPresenter$models$1$1(mutableStateFlow, this, mutableState8, mutableState7, null, 0);
                    mutableState8 = mutableState8;
                    musicPresenter = this;
                    gapComposer.updateRememberedValue(musicPresenter$models$1$1);
                    rememberedValue4 = musicPresenter$models$1$1;
                } else {
                    neverEqualPolicy = neverEqualPolicy2;
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue4);
                boolean changedInstance2 = gapComposer.changedInstance(musicPresenter);
                Object rememberedValue5 = gapComposer.rememberedValue();
                if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                    rememberedValue5 = new MusicPresenter$models$2$1(musicPresenter, mutableState7, r8, i8);
                    gapComposer.updateRememberedValue(rememberedValue5);
                }
                Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue5);
                Updater.LaunchedEffect(gapComposer, flow, new MoneybotChatPresenter$models$6$1(flow, (Continuation) null, (Object) musicPresenter, (Object) mutableStateFlow, mutableState8, mutableState7, 18));
                MusicViewModel musicViewModel = (MusicViewModel) mutableState7.getValue();
                gapComposer.end(false);
                return musicViewModel;
            case 1:
                flow.getClass();
                GapComposer gapComposer2 = (GapComposer) composer;
                gapComposer2.startReplaceGroup(-1345613878);
                Updater.LaunchedEffect(gapComposer2, flow, new RealImageLoader$execute$2(flow, (Continuation) r8, musicPresenter, 4));
                LocalExplanatoryDialog localExplanatoryDialog = (LocalExplanatoryDialog) obj5;
                String joinToString$default = CollectionsKt.joinToString$default(localExplanatoryDialog.messages, "\n", null, null, 0, null, null, 62);
                if (StringsKt.isBlank(joinToString$default)) {
                    joinToString$default = ((AndroidStringManager) obj3).get(R.string.local_presenters_something_went_wrong);
                }
                LocalExplanatoryDialog.PositiveAction positiveAction = localExplanatoryDialog.positiveAction;
                if (positiveAction instanceof LocalExplanatoryDialog.PositiveAction.Ok) {
                    positiveButtonType = LocalExplanatoryDialogViewModel.PositiveButtonType.OK;
                } else {
                    if (!(positiveAction instanceof LocalExplanatoryDialog.PositiveAction.OpenSettings)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    positiveButtonType = LocalExplanatoryDialogViewModel.PositiveButtonType.OPEN_SETTINGS;
                }
                LocalExplanatoryDialogViewModel localExplanatoryDialogViewModel = new LocalExplanatoryDialogViewModel(joinToString$default, positiveButtonType);
                gapComposer2.end(false);
                return localExplanatoryDialogViewModel;
            case 2:
                flow.getClass();
                ?? r10 = (GapComposer) composer;
                r10.startReplaceGroup(2047681952);
                Object rememberedValue6 = r10.rememberedValue();
                Object obj6 = rememberedValue6;
                if (rememberedValue6 == neverEqualPolicy2) {
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
                    r10.updateRememberedValue(mutableStateOf$default);
                    obj6 = mutableStateOf$default;
                }
                final MutableState mutableState9 = (MutableState) obj6;
                Object rememberedValue7 = r10.rememberedValue();
                Object obj7 = rememberedValue7;
                if (rememberedValue7 == neverEqualPolicy2) {
                    ParcelableSnapshotMutableState mutableStateOf$default2 = Updater.mutableStateOf$default(null);
                    r10.updateRememberedValue(mutableStateOf$default2);
                    obj7 = mutableStateOf$default2;
                }
                final MutableState mutableState10 = (MutableState) obj7;
                Object rememberedValue8 = r10.rememberedValue();
                Object obj8 = rememberedValue8;
                if (rememberedValue8 == neverEqualPolicy2) {
                    ParcelableSnapshotMutableState mutableStateOf$default3 = Updater.mutableStateOf$default((ShortlinkAction) obj5);
                    r10.updateRememberedValue(mutableStateOf$default3);
                    obj8 = mutableStateOf$default3;
                }
                final MutableState mutableState11 = (MutableState) obj8;
                Object rememberedValue9 = r10.rememberedValue();
                Object obj9 = rememberedValue9;
                if (rememberedValue9 == neverEqualPolicy2) {
                    ParcelableSnapshotMutableState mutableStateOf$default4 = Updater.mutableStateOf$default(Boolean.FALSE);
                    r10.updateRememberedValue(mutableStateOf$default4);
                    obj9 = mutableStateOf$default4;
                }
                MutableState mutableState12 = (MutableState) obj9;
                Object rememberedValue10 = r10.rememberedValue();
                Object obj10 = rememberedValue10;
                if (rememberedValue10 == neverEqualPolicy2) {
                    Navigator navigator = new Navigator() { // from class: app.cash.local.presenters.sheet.LocalShortlinkPresenter$$ExternalSyntheticLambda0
                        @Override // app.cash.broadway.navigation.Navigator
                        public final void goTo(Screen screen) {
                            screen.getClass();
                            if (screen instanceof LocalEducationalSheet) {
                                LocalEducationalSheet localEducationalSheet = (LocalEducationalSheet) screen;
                                mutableState10.setValue(localEducationalSheet.educationalSheet);
                                mutableState9.setValue(localEducationalSheet.flowToken);
                                return;
                            }
                            if (!(screen instanceof LocalShortlinkSheet)) {
                                ((BetterNavigator.ScreenNavigator) MusicPresenter.this.navigator).goTo(screen);
                                return;
                            }
                            LocalShortlinkSheet localShortlinkSheet = (LocalShortlinkSheet) screen;
                            mutableState11.setValue(new ShortlinkAction(localShortlinkSheet.shortlinkKey, localShortlinkSheet.nextShortlinkFlowState));
                        }
                    };
                    r10.updateRememberedValue(navigator);
                    obj10 = navigator;
                }
                Navigator navigator2 = (Navigator) obj10;
                boolean changed = r10.changed((EducationalSheet) mutableState10.getValue()) | r10.changed((ShortlinkAction) mutableState11.getValue());
                Object rememberedValue11 = r10.rememberedValue();
                if (changed || rememberedValue11 == neverEqualPolicy2) {
                    if (((EducationalSheet) mutableState10.getValue()) == null) {
                        rememberedValue11 = null;
                    } else {
                        EducationalSheet educationalSheet = (EducationalSheet) mutableState10.getValue();
                        educationalSheet.getClass();
                        String str3 = ((ShortlinkAction) mutableState11.getValue()).shortlink_key;
                        str3.getClass();
                        rememberedValue11 = ((EducationalSheetPresenter$Factory$Impl) obj3).create(new LocalEducationalSheet(educationalSheet, str3, ((ShortlinkAction) mutableState11.getValue()).next_shortlink_flow_state, (String) mutableState9.getValue()), navigator2);
                    }
                    r10.updateRememberedValue(rememberedValue11);
                }
                ?? r12 = (EducationalSheetPresenter) rememberedValue11;
                ShortlinkAction shortlinkAction = (ShortlinkAction) mutableState11.getValue();
                boolean changedInstance3 = r10.changedInstance(musicPresenter) | r10.changedInstance(navigator2);
                Object rememberedValue12 = r10.rememberedValue();
                if (changedInstance3 || rememberedValue12 == neverEqualPolicy2) {
                    mutableState = mutableState12;
                    zzmo zzmoVar = new zzmo(this, navigator2, mutableState, mutableState11, null, 11);
                    r10.updateRememberedValue(zzmoVar);
                    rememberedValue12 = zzmoVar;
                } else {
                    mutableState = mutableState12;
                }
                Updater.LaunchedEffect((Composer) r10, shortlinkAction, (Function2) rememberedValue12);
                r10.startMovableGroup(727412652, r12);
                if (r12 == 0) {
                    r10.startReplaceGroup(1075013331);
                    r10.end(false);
                    models = null;
                } else {
                    r10.startReplaceGroup(727414510);
                    models = r12.models(flow, r10, i & 14);
                    r10.end(false);
                }
                r10.end(false);
                if (((Boolean) mutableState.getValue()).booleanValue() && models != null) {
                    EducationalSheetModelList educationalSheetModelList = models.educationalSheetModelList;
                    if (educationalSheetModelList != null) {
                        List list = educationalSheetModelList.sheets;
                        boolean z = educationalSheetModelList.showProgressBar;
                        list.getClass();
                        r8 = new EducationalSheetModelList(list, z, true);
                    }
                    models = new LocalShortlinkViewModel(r8);
                } else if (models == null) {
                    models = new LocalShortlinkViewModel(null);
                }
                r10.end(false);
                return models;
            case 3:
                flow.getClass();
                GapComposer gapComposer3 = (GapComposer) composer;
                gapComposer3.startReplaceGroup(198946193);
                Updater.LaunchedEffect(gapComposer3, flow, new ToastKt$Toast$9$1(flow, (Continuation) r8, musicPresenter, 3));
                GetPreSignInDataResponse.InvitationIntroData.CloseScreenDialog closeScreenDialog = ((AlternativeNewSponsorAliasScreen) obj5).dialogData;
                String str4 = closeScreenDialog.title;
                str4.getClass();
                String str5 = closeScreenDialog.message;
                str5.getClass();
                String str6 = closeScreenDialog.continue_button_text;
                str6.getClass();
                String str7 = closeScreenDialog.dismiss_button_text;
                str7.getClass();
                AlternativeNewSponsorAliasViewModel alternativeNewSponsorAliasViewModel = new AlternativeNewSponsorAliasViewModel(str4, str5, str6, str7);
                gapComposer3.end(false);
                return alternativeNewSponsorAliasViewModel;
            case 4:
                flow.getClass();
                GapComposer gapComposer4 = (GapComposer) composer;
                gapComposer4.startReplaceGroup(1349648331);
                Updater.LaunchedEffect(gapComposer4, flow, new ToastKt$Toast$9$1(flow, (Continuation) r8, musicPresenter, 10));
                AndroidStringManager androidStringManager = (AndroidStringManager) obj4;
                AppUpdateDialogViewModel appUpdateDialogViewModel = new AppUpdateDialogViewModel(androidStringManager.get(R.string.app_update_dialog_title), androidStringManager.get(R.string.app_update_dialog_description), androidStringManager.get(R.string.app_update_dialog_positive_button), androidStringManager.get(R.string.app_update_dialog_negative_button));
                gapComposer4.end(false);
                return appUpdateDialogViewModel;
            case 5:
                m3665models(flow, composer, i);
                return Unit.INSTANCE;
            case 6:
                AndroidStringManager androidStringManager2 = (AndroidStringManager) obj3;
                flow.getClass();
                GapComposer gapComposer5 = (GapComposer) composer;
                gapComposer5.startReplaceGroup(499279483);
                Object rememberedValue13 = gapComposer5.rememberedValue();
                if (rememberedValue13 == neverEqualPolicy2) {
                    rememberedValue13 = ((RealBitcoinConfigRepo) obj4).customOrderConfiguration;
                    gapComposer5.updateRememberedValue(rememberedValue13);
                }
                MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue13, null, null, gapComposer5, 48, 2);
                Object rememberedValue14 = gapComposer5.rememberedValue();
                if (rememberedValue14 == neverEqualPolicy2) {
                    rememberedValue14 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer5.updateRememberedValue(rememberedValue14);
                }
                MutableState mutableState13 = (MutableState) rememberedValue14;
                boolean changed2 = gapComposer5.changed(((Boolean) mutableState13.getValue()).booleanValue()) | gapComposer5.changed((CustomOrderConfiguration) collectAsState.getValue());
                Object rememberedValue15 = gapComposer5.rememberedValue();
                if (changed2 || rememberedValue15 == neverEqualPolicy2) {
                    rememberedValue15 = Boolean.valueOf(((Boolean) mutableState13.getValue()).booleanValue() || ((CustomOrderConfiguration) collectAsState.getValue()) == null);
                    gapComposer5.updateRememberedValue(rememberedValue15);
                }
                boolean booleanValue = ((Boolean) rememberedValue15).booleanValue();
                Object rememberedValue16 = gapComposer5.rememberedValue();
                if (rememberedValue16 == neverEqualPolicy2) {
                    rememberedValue16 = Updater.mutableStateOf$default(null);
                    gapComposer5.updateRememberedValue(rememberedValue16);
                }
                MutableState mutableState14 = (MutableState) rememberedValue16;
                Object rememberedValue17 = gapComposer5.rememberedValue();
                if (rememberedValue17 == neverEqualPolicy2) {
                    rememberedValue17 = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer5);
                    gapComposer5.updateRememberedValue(rememberedValue17);
                }
                Updater.LaunchedEffect(gapComposer5, flow, new NetworkFetcher$doFetch$fetchResult$1(flow, (Continuation) null, this, (CoroutineScope) rememberedValue17, mutableState14, mutableState13, 25));
                if (booleanValue) {
                    contentModel = PeriodSelectionViewModel.InFlight.INSTANCE;
                } else {
                    String str8 = androidStringManager2.get(R.string.period_selection_title);
                    String str9 = androidStringManager2.get(((BitcoinPeriodSelectionScreen) obj5).exchangeType instanceof BitcoinExchangeType.BuyBitcoin ? R.string.period_selection_description_buy_btc : R.string.period_selection_description_sell_btc);
                    String str10 = androidStringManager2.get(R.string.next);
                    boolean z2 = ((String) mutableState14.getValue()) != null;
                    CustomOrderConfiguration customOrderConfiguration = (CustomOrderConfiguration) collectAsState.getValue();
                    customOrderConfiguration.getClass();
                    contentModel = new PeriodSelectionViewModel.ContentModel(str8, str9, str10, (String) mutableState14.getValue(), customOrderConfiguration.periods, z2);
                }
                gapComposer5.end(false);
                return contentModel;
            case 7:
                AndroidStringManager androidStringManager3 = (AndroidStringManager) obj3;
                flow.getClass();
                GapComposer gapComposer6 = (GapComposer) composer;
                gapComposer6.startReplaceGroup(-545334312);
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(((RealPaidInBitcoinStateManager) obj4).states(gapComposer6), gapComposer6);
                Updater.LaunchedEffect(gapComposer6, flow, new SetNamePresenter$models$1$1$1(4, rememberUpdatedState, musicPresenter, flow, (Continuation) null));
                int ordinal = ((PaidInBitcoinState) rememberUpdatedState.getValue()).cardState.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    paidInBitcoinCardUpsellViewModel = new PaidInBitcoinCardUpsellViewModel(androidStringManager3.get(R.string.get_a_cash_card_header), androidStringManager3.get(R.string.automatically_invest_body), androidStringManager3.get(R.string.get_your_cash_card), CollectionsKt__CollectionsKt.listOf((Object[]) new PaidInBitcoinCardUpsellViewModel.SubItem[]{new PaidInBitcoinCardUpsellViewModel.SubItem(androidStringManager3.get(R.string.auto_invest_from_deposits), androidStringManager3.get(R.string.convert_a_percentage_body), R.drawable.ic_paid_in_bitcoin_deposit), new PaidInBitcoinCardUpsellViewModel.SubItem(androidStringManager3.get(R.string.adjust_at_any_time), androidStringManager3.get(R.string.start_with_little_body), R.drawable.ic_percent)}));
                } else {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal != 4) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                        } else {
                            a$$ExternalSyntheticBUOutline0.m$1("User with activated card should not see PIB upsell.");
                        }
                        return paidInBitcoinCardUpsellViewModel2;
                    }
                    paidInBitcoinCardUpsellViewModel = new PaidInBitcoinCardUpsellViewModel(androidStringManager3.get(R.string.activate_your_cash_card_title), androidStringManager3.get(R.string.automatically_invest_body), androidStringManager3.get(R.string.activate_cash_card), EmptyList.INSTANCE);
                }
                paidInBitcoinCardUpsellViewModel2 = paidInBitcoinCardUpsellViewModel;
                gapComposer6.end(false);
                return paidInBitcoinCardUpsellViewModel2;
            case 8:
                flow.getClass();
                GapComposer gapComposer7 = (GapComposer) composer;
                gapComposer7.startReplaceGroup(834637178);
                Updater.LaunchedEffect(gapComposer7, flow, new AmountBlockerPresenter$models$1$2(flow, (Continuation) r8, musicPresenter, i4));
                StablecoinDepositCopyViewModel stablecoinDepositCopyViewModel = new StablecoinDepositCopyViewModel(((StablecoinDepositCopyScreen) obj5).truncatedAddress);
                gapComposer7.end(false);
                return stablecoinDepositCopyViewModel;
            case 9:
                flow.getClass();
                GapComposer gapComposer8 = (GapComposer) composer;
                gapComposer8.startReplaceGroup(-1574846935);
                Object rememberedValue18 = gapComposer8.rememberedValue();
                if (rememberedValue18 == neverEqualPolicy2) {
                    rememberedValue18 = (Flow) obj5;
                    gapComposer8.updateRememberedValue(rememberedValue18);
                }
                MutableState collectAsState2 = Updater.collectAsState((Flow) rememberedValue18, null, null, gapComposer8, 48, 2);
                Object rememberedValue19 = gapComposer8.rememberedValue();
                if (rememberedValue19 == neverEqualPolicy2) {
                    rememberedValue19 = Updater.mutableStateOf$default(new ConfirmCvvViewModel(0, ""));
                    gapComposer8.updateRememberedValue(rememberedValue19);
                }
                MutableState mutableState15 = (MutableState) rememberedValue19;
                Continuation continuation = null;
                Updater.LaunchedEffect(gapComposer8, flow, new CashtagPresenter$models$2$1(flow, continuation, musicPresenter, i7));
                Instrument instrument = (Instrument) collectAsState2.getValue();
                if (instrument != null) {
                    gapComposer8.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer8, instrument, new zzmh(instrument, continuation, musicPresenter, mutableState15, 26));
                    gapComposer8.end(false);
                } else {
                    gapComposer8.startReplaceGroup(-1106436997);
                    gapComposer8.end(false);
                }
                ConfirmCvvViewModel confirmCvvViewModel = (ConfirmCvvViewModel) mutableState15.getValue();
                gapComposer8.end(false);
                return confirmCvvViewModel;
            case 10:
                flow.getClass();
                GapComposer gapComposer9 = (GapComposer) composer;
                gapComposer9.startReplaceGroup(-1007707300);
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                Object rememberedValue20 = gapComposer9.rememberedValue();
                if (rememberedValue20 == neverEqualPolicy2) {
                    gapComposer9.updateRememberedValue(null);
                    rememberedValue20 = null;
                }
                ref$ObjectRef.element = (String) rememberedValue20;
                Object rememberedValue21 = gapComposer9.rememberedValue();
                if (rememberedValue21 == neverEqualPolicy2) {
                    rememberedValue21 = new Pager(new PagingConfig(-1, 52), new BulletinTileKt$$ExternalSyntheticLambda12(27, musicPresenter, ref$ObjectRef));
                    gapComposer9.updateRememberedValue(rememberedValue21);
                }
                Pager pager = (Pager) rememberedValue21;
                Object rememberedValue22 = gapComposer9.rememberedValue();
                if (rememberedValue22 == neverEqualPolicy2) {
                    rememberedValue22 = FlowExtKt.cachedIn(pager.flow, (CoroutineScope) obj4);
                    gapComposer9.updateRememberedValue(rememberedValue22);
                }
                MutableState collectAsState3 = Updater.collectAsState((Flow) rememberedValue22, new PagingData(new AppLockMonitor$special$$inlined$map$2(new PageEvent.StaticList(EmptyList.INSTANCE), 19), PagingData.NOOP_UI_RECEIVER, PagingData.NOOP_HINT_RECEIVER, new TextKt$$ExternalSyntheticLambda0(i5)), null, gapComposer9, 0, 2);
                Updater.LaunchedEffect(gapComposer9, flow, new FileBlockerView$6$2$2(flow, (Continuation) r8, musicPresenter, i3));
                ExpandedLoanHistory expandedLoanHistory = (ExpandedLoanHistory) obj5;
                ExpandedLoanHistoryListModel expandedLoanHistoryListModel = new ExpandedLoanHistoryListModel(expandedLoanHistory.expandedViewData, expandedLoanHistory.loans, (PagingData) collectAsState3.getValue());
                gapComposer9.end(false);
                return expandedLoanHistoryListModel;
            case 11:
                flow.getClass();
                GapComposer gapComposer10 = (GapComposer) composer;
                gapComposer10.startReplaceGroup(625758822);
                Unit unit2 = Unit.INSTANCE;
                boolean changedInstance4 = gapComposer10.changedInstance(musicPresenter);
                Object rememberedValue23 = gapComposer10.rememberedValue();
                if (changedInstance4 || rememberedValue23 == neverEqualPolicy2) {
                    rememberedValue23 = new TemporaryStorage$getDir$2(musicPresenter, r8, 8);
                    gapComposer10.updateRememberedValue(rememberedValue23);
                }
                Updater.LaunchedEffect(gapComposer10, unit2, (Function2) rememberedValue23);
                Updater.LaunchedEffect(gapComposer10, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) r8, musicPresenter, r15));
                InfoSheetViewModel infoSheetViewModel = ((AfterPayInfoSheetScreen) obj4).infoSheetViewModel;
                gapComposer10.end(false);
                return infoSheetViewModel;
            case 12:
                flow.getClass();
                GapComposer gapComposer11 = (GapComposer) composer;
                gapComposer11.startReplaceGroup(967444309);
                Unit unit3 = Unit.INSTANCE;
                boolean changedInstance5 = gapComposer11.changedInstance(musicPresenter);
                Object rememberedValue24 = gapComposer11.rememberedValue();
                if (changedInstance5 || rememberedValue24 == neverEqualPolicy2) {
                    rememberedValue24 = new TemporaryStorage$getDir$2(musicPresenter, r8, 9);
                    gapComposer11.updateRememberedValue(rememberedValue24);
                }
                Updater.LaunchedEffect(gapComposer11, unit3, (Function2) rememberedValue24);
                Updater.LaunchedEffect(gapComposer11, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) r8, musicPresenter, i6));
                List list2 = ((OrderDetailsOverflowActionSheetScreen) obj4).actions;
                gapComposer11.end(false);
                return list2;
            case 13:
                flow.getClass();
                GapComposer gapComposer12 = (GapComposer) composer;
                gapComposer12.startReplaceGroup(-179433623);
                Object rememberedValue25 = gapComposer12.rememberedValue();
                if (rememberedValue25 == neverEqualPolicy2) {
                    rememberedValue25 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                    gapComposer12.updateRememberedValue(rememberedValue25);
                }
                MutableState mutableState16 = (MutableState) rememberedValue25;
                Object rememberedValue26 = gapComposer12.rememberedValue();
                if (rememberedValue26 == neverEqualPolicy2) {
                    rememberedValue26 = Updater.mutableStateOf$default(new StampSheetViewModel(EmptyList.INSTANCE, (List) mutableState16.getValue(), false));
                    gapComposer12.updateRememberedValue(rememberedValue26);
                }
                MutableState mutableState17 = (MutableState) rememberedValue26;
                Unit unit4 = Unit.INSTANCE;
                boolean changedInstance6 = gapComposer12.changedInstance(musicPresenter);
                Object rememberedValue27 = gapComposer12.rememberedValue();
                if (changedInstance6 || rememberedValue27 == neverEqualPolicy2) {
                    mutableState2 = mutableState17;
                    mutableState3 = mutableState16;
                    RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$1 = new RealBoostSelector$removeBoost$1(27, mutableState2, mutableState3, musicPresenter, (Continuation) null);
                    gapComposer12.updateRememberedValue(realBoostSelector$removeBoost$1);
                    rememberedValue27 = realBoostSelector$removeBoost$1;
                } else {
                    mutableState3 = mutableState16;
                    mutableState2 = mutableState17;
                }
                Updater.LaunchedEffect(gapComposer12, unit4, (Function2) rememberedValue27);
                MutableState mutableState18 = mutableState2;
                Updater.LaunchedEffect(gapComposer12, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, this, mutableState3, mutableState18, 8));
                StampSheetViewModel stampSheetViewModel = (StampSheetViewModel) mutableState18.getValue();
                gapComposer12.end(false);
                return stampSheetViewModel;
            case 14:
                flow.getClass();
                GapComposer gapComposer13 = (GapComposer) composer;
                gapComposer13.startReplaceGroup(-247586263);
                Object rememberedValue28 = gapComposer13.rememberedValue();
                if (rememberedValue28 == neverEqualPolicy2) {
                    rememberedValue28 = Updater.mutableStateOf$default(EmptyList.INSTANCE);
                    gapComposer13.updateRememberedValue(rememberedValue28);
                }
                MutableState mutableState19 = (MutableState) rememberedValue28;
                Object rememberedValue29 = gapComposer13.rememberedValue();
                if (rememberedValue29 == neverEqualPolicy2) {
                    rememberedValue29 = Updater.mutableStateOf$default(new StampSheetViewModel(EmptyList.INSTANCE, (List) mutableState19.getValue(), false));
                    gapComposer13.updateRememberedValue(rememberedValue29);
                }
                MutableState mutableState20 = (MutableState) rememberedValue29;
                Unit unit5 = Unit.INSTANCE;
                boolean changedInstance7 = gapComposer13.changedInstance(musicPresenter);
                Object rememberedValue30 = gapComposer13.rememberedValue();
                if (changedInstance7 || rememberedValue30 == neverEqualPolicy2) {
                    mutableState4 = mutableState20;
                    mutableState5 = mutableState19;
                    RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$12 = new RealBoostSelector$removeBoost$1(28, mutableState4, mutableState5, musicPresenter, (Continuation) null);
                    gapComposer13.updateRememberedValue(realBoostSelector$removeBoost$12);
                    rememberedValue30 = realBoostSelector$removeBoost$12;
                } else {
                    mutableState5 = mutableState19;
                    mutableState4 = mutableState20;
                }
                Updater.LaunchedEffect(gapComposer13, unit5, (Function2) rememberedValue30);
                MutableState mutableState21 = mutableState4;
                Updater.LaunchedEffect(gapComposer13, flow, new RealBlockersHelper$skipBlocker$1(flow, (Continuation) null, this, mutableState5, mutableState21, 9));
                StampSheetViewModel stampSheetViewModel2 = (StampSheetViewModel) mutableState21.getValue();
                gapComposer13.end(false);
                return stampSheetViewModel2;
            case 15:
                flow.getClass();
                GapComposer gapComposer14 = (GapComposer) composer;
                gapComposer14.startReplaceGroup(-1939029351);
                Object rememberedValue31 = gapComposer14.rememberedValue();
                if (rememberedValue31 == neverEqualPolicy2) {
                    rememberedValue31 = ((SyncValueReader) obj3).getSingleValueOrDefault(AndroidSyncValueSpecs.CardSpendingInsightsConfig, null, new CaptureCheckFaceKt$$ExternalSyntheticLambda12(musicPresenter, 10));
                    gapComposer14.updateRememberedValue(rememberedValue31);
                }
                MutableState receiveValueAsState = Strings.receiveValueAsState((StateFlow) rememberedValue31, gapComposer14);
                Updater.LaunchedEffect(gapComposer14, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) r8, musicPresenter, 16));
                SpendingInsightsConfig spendingInsightsConfig = (SpendingInsightsConfig) receiveValueAsState.getValue();
                if ((spendingInsightsConfig != null ? spendingInsightsConfig.recurringPaymentInfo : null) == null) {
                    ((BetterNavigator.ScreenNavigator) obj2).goTo(Back.INSTANCE);
                    ((ErrorReporter) obj4).report(new GeneralSpendingInsightsError("RecurringPaymentInfo is null on load of RecurringPaymentInfoSheetPresenter"), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                }
                SpendingInsightsConfig spendingInsightsConfig2 = (SpendingInsightsConfig) receiveValueAsState.getValue();
                Object content = (spendingInsightsConfig2 == null || (recurringPaymentInfo = spendingInsightsConfig2.recurringPaymentInfo) == null) ? RecurringPaymentInfoViewModel.Empty.INSTANCE : new RecurringPaymentInfoViewModel.Content(recurringPaymentInfo.title, recurringPaymentInfo.body);
                gapComposer14.end(false);
                return content;
            case 16:
                flow.getClass();
                GapComposer gapComposer15 = (GapComposer) composer;
                gapComposer15.startReplaceGroup(1303065519);
                Object rememberedValue32 = gapComposer15.rememberedValue();
                if (rememberedValue32 == neverEqualPolicy2) {
                    rememberedValue32 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer15.updateRememberedValue(rememberedValue32);
                }
                MutableState mutableState22 = (MutableState) rememberedValue32;
                Object rememberedValue33 = gapComposer15.rememberedValue();
                Continuation continuation2 = null;
                if (rememberedValue33 == neverEqualPolicy2) {
                    EglCore eglCore = (EglCore) obj4;
                    RewardSlotQueries rewardSlotQueries = (RewardSlotQueries) eglCore.eglConfig;
                    rewardSlotQueries.getClass();
                    CustomerQueries$merchantsWithBusinessGrants$2 customerQueries$merchantsWithBusinessGrants$2 = CustomerQueries$merchantsWithBusinessGrants$2.INSTANCE;
                    SqlDriver sqlDriver = rewardSlotQueries.driver;
                    CustomerQueries$$ExternalSyntheticLambda7 customerQueries$$ExternalSyntheticLambda7 = new CustomerQueries$$ExternalSyntheticLambda7(rewardSlotQueries, i6);
                    sqlDriver.getClass();
                    rememberedValue33 = new RealGooglePayer$createWallet$$inlined$map$1(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(DBUtil.mapToList(DBUtil.toFlow(new SimpleQuery(1869385089, new String[]{"customer", "businessGrants"}, sqlDriver, "Customer.sq", "merchantsWithBusinessGrants", "SELECT customer.customer_id, customer.cashtag, customer.customer_display_name, customer.can_accept_payments, customer.is_square, customer.is_cash_customer, customer.is_business, customer.is_verified, customer.credit_card_fee, customer.render_data, customer.blocked, customer.threaded_customer_id, customer.merchant_data, customer.category, customer.investment_entity_token, customer.region, customer.joined_on, customer.photo, customer.themed_accent_color, customer.is_special_customer,\nbusinessGrants.id AS business_grant_id,\nbusinessGrants.client_id,\nbusinessGrants.action_type,\nbusinessGrants.account_reference_id,\nbusinessGrants.rendering_behavior\nFROM customer\nINNER JOIN businessGrants\nON customer.customer_id = businessGrants.merchant_id", customerQueries$$ExternalSyntheticLambda7)), (CoroutineContext) eglCore.eglContext), new ToastKt$Toast$7$1(mutableState22, continuation2, 8), 3), 4);
                    gapComposer15.updateRememberedValue(rememberedValue33);
                }
                MutableState collectAsState4 = Updater.collectAsState((Flow) rememberedValue33, null, null, gapComposer15, 48, 2);
                Updater.LaunchedEffect(gapComposer15, flow, new VerifyCheckDepositPresenter$models$3$1(flow, continuation2, (MoleculePresenter) musicPresenter, mutableState22, 9));
                if (((Boolean) mutableState22.getValue()).booleanValue() || ((List) collectAsState4.getValue()) == null) {
                    obj = CashAppPaySettingsViewModel.Loading.INSTANCE;
                } else {
                    List list3 = (List) collectAsState4.getValue();
                    list3.getClass();
                    obj = new CashAppPaySettingsViewModel.Loaded(list3);
                }
                gapComposer15.end(false);
                return obj;
            case 17:
                flow.getClass();
                GapComposer gapComposer16 = (GapComposer) composer;
                gapComposer16.startReplaceGroup(326174216);
                Updater.LaunchedEffect(gapComposer16, flow, new CardStudioPresenter$models$1$1(flow, (Continuation) r8, musicPresenter, i5));
                Object obj11 = ((UnlinkResultScreen) obj3).success ? (UnlinkResultViewModel.Success) obj4 : (UnlinkResultViewModel.Failure) obj5;
                gapComposer16.end(false);
                return obj11;
            case 18:
                flow.getClass();
                GapComposer gapComposer17 = (GapComposer) composer;
                gapComposer17.startReplaceGroup(1487474079);
                Updater.LaunchedEffect(gapComposer17, flow, new RealProfileManager$setPhoto$2(flow, (Continuation) r8, musicPresenter, 20));
                AtmPmdExplainerScreen atmPmdExplainerScreen = (AtmPmdExplainerScreen) obj3;
                AtmPmdExplainerViewModel atmPmdExplainerViewModel = new AtmPmdExplainerViewModel(atmPmdExplainerScreen.elements, atmPmdExplainerScreen.footerElements);
                gapComposer17.end(false);
                return atmPmdExplainerViewModel;
            case 19:
                flow.getClass();
                GapComposer gapComposer18 = (GapComposer) composer;
                gapComposer18.startReplaceGroup(826909645);
                List list4 = (List) ((kotlin.Lazy) obj5).getValue();
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    arrayList.add(((EducationStoryPresenter) it.next()).models(gapComposer18));
                }
                EducationStoryViewPagerViewModel educationStoryViewPagerViewModel = new EducationStoryViewPagerViewModel(arrayList);
                gapComposer18.end(false);
                return educationStoryViewPagerViewModel;
            case 20:
                flow.getClass();
                GapComposer gapComposer19 = (GapComposer) composer;
                gapComposer19.startReplaceGroup(2030907251);
                Updater.LaunchedEffect(gapComposer19, flow, new EarningsHomePresenter$models$3$1(flow, (Continuation) r8, musicPresenter, i3));
                AndroidStringManager androidStringManager4 = (AndroidStringManager) obj3;
                String str11 = androidStringManager4.get(R.string.family_sponsor_resources_toolbar_title);
                String str12 = androidStringManager4.get(R.string.family_sponsor_resources_section_title);
                String str13 = androidStringManager4.get(R.string.family_sponsor_resources_features_and_limits_title);
                zzd zzdVar = Icons.Companion;
                SponsorResourcesViewModel sponsorResourcesViewModel = new SponsorResourcesViewModel(str11, new SponsorResourcesSectionViewModel(str12, CollectionsKt__CollectionsKt.listOf((Object[]) new SponsorResourcesRowViewModel[]{new SponsorResourcesRowViewModel(new Icon("ePNbIF"), str13, "https://internal.cash.app/dl/view/support/FAMILIES_LIMITS"), new SponsorResourcesRowViewModel(new Icon("ePNbIF"), androidStringManager4.get(R.string.family_sponsor_resources_merchant_restrictions_title), "https://internal.cash.app/dl/view/support/FAMILIES_BLOCKED_MCCS"), new SponsorResourcesRowViewModel(new Icon("ePNbIF"), androidStringManager4.get(R.string.family_sponsor_resources_set_up_allowances_title), "https://internal.cash.app/dl/view/support/FAMILIES_ALLOWANCES")})));
                gapComposer19.end(false);
                return sponsorResourcesViewModel;
            case 21:
                flow.getClass();
                GapComposer gapComposer20 = (GapComposer) composer;
                gapComposer20.startReplaceGroup(893260373);
                int i9 = i & 14;
                Updater.LaunchedEffect(gapComposer20, flow, new AnimationsKt$takeUntil$1$1.AnonymousClass1(flow, (Continuation) r8, musicPresenter, 26));
                Unit unit6 = Unit.INSTANCE;
                boolean changedInstance8 = gapComposer20.changedInstance(musicPresenter);
                Object rememberedValue34 = gapComposer20.rememberedValue();
                if (changedInstance8 || rememberedValue34 == neverEqualPolicy2) {
                    rememberedValue34 = new RealProfileManager$profileOrNull$2(musicPresenter, r8, 21);
                    gapComposer20.updateRememberedValue(rememberedValue34);
                }
                Updater.LaunchedEffect(gapComposer20, unit6, (Function2) rememberedValue34);
                boolean changedInstance9 = gapComposer20.changedInstance(musicPresenter);
                Object rememberedValue35 = gapComposer20.rememberedValue();
                if (changedInstance9 || rememberedValue35 == neverEqualPolicy2) {
                    rememberedValue35 = new RealKeyStoreProvider$load$2(musicPresenter, r8, i6);
                    gapComposer20.updateRememberedValue(rememberedValue35);
                }
                Updater.LaunchedEffect(gapComposer20, unit6, (Function2) rememberedValue35);
                GrowToolsManagerViewModel models2 = ((GrowToolsManagerDelegate) obj2).models(flow, gapComposer20, i9);
                gapComposer20.end(false);
                return models2;
            case 22:
                AndroidStringManager androidStringManager5 = (AndroidStringManager) obj4;
                flow.getClass();
                GapComposer gapComposer21 = (GapComposer) composer;
                gapComposer21.startReplaceGroup(-1744127174);
                Object rememberedValue36 = gapComposer21.rememberedValue();
                if (rememberedValue36 == neverEqualPolicy2) {
                    rememberedValue36 = ((RealFinishSetupAppletTileRepository) obj3).tile;
                    gapComposer21.updateRememberedValue(rememberedValue36);
                }
                Image image2 = 0;
                image2 = 0;
                MutableState collectAsState5 = Updater.collectAsState((StateFlow) rememberedValue36, null, gapComposer21, 1);
                Updater.LaunchedEffect(gapComposer21, flow, new GLThread$start$2(flow, (Continuation) image2, musicPresenter, collectAsState5, 12));
                if (((FinishSetupTileV1) collectAsState5.getValue()) == null) {
                    installed = new FinishSetupAppletTileViewModel.Loading(androidStringManager5.get(R.string.finish_setup_tile_title));
                } else {
                    FinishSetupTileV1 finishSetupTileV1 = (FinishSetupTileV1) collectAsState5.getValue();
                    int intValue = (finishSetupTileV1 == null || (num2 = finishSetupTileV1.tasks_completed) == null) ? 0 : num2.intValue();
                    FinishSetupTileV1 finishSetupTileV12 = (FinishSetupTileV1) collectAsState5.getValue();
                    int intValue2 = (finishSetupTileV12 == null || (num = finishSetupTileV12.tasks_total) == null) ? 0 : num.intValue();
                    String str14 = androidStringManager5.get(intValue2 > 0 && intValue >= intValue2 ? R.string.finish_setup_tile_section_label_complete : R.string.finish_setup_tile_section_label);
                    FinishSetupTileV1 finishSetupTileV13 = (FinishSetupTileV1) collectAsState5.getValue();
                    if (finishSetupTileV13 == null || (str = finishSetupTileV13.title) == null) {
                        str = androidStringManager5.get(R.string.finish_setup_tile_title);
                    }
                    String str15 = str;
                    float f = intValue / (intValue2 >= 1 ? intValue2 : 1);
                    String str16 = intValue + "/" + intValue2;
                    FinishSetupTileV1 finishSetupTileV14 = (FinishSetupTileV1) collectAsState5.getValue();
                    if (finishSetupTileV14 != null && (image = finishSetupTileV14.image) != null) {
                        String str17 = image.light_url;
                        if (str17 != null && !StringsKt.isBlank(str17)) {
                            image2 = image;
                            break;
                        }
                    }
                    image2 = new Image("https://cash-f.squarecdn.com/static/no_icentive_hero_3x.png", "https://cash-f.squarecdn.com/static/no_icentive_hero_3x.png", 4);
                    installed = new FinishSetupAppletTileViewModel.Installed(str14, str15, f, str16, image2);
                }
                gapComposer21.end(false);
                return installed;
            case 23:
                flow.getClass();
                GapComposer gapComposer22 = (GapComposer) composer;
                gapComposer22.startReplaceGroup(93975076);
                Updater.LaunchedEffect(gapComposer22, flow, new InvestingHomeView$onScrollFlow$1(flow, (Continuation) r8, musicPresenter, 12));
                InvestingScreens.MoreInfoSheet moreInfoSheet = (InvestingScreens.MoreInfoSheet) obj5;
                String str18 = moreInfoSheet.moreInfo.title;
                str18.getClass();
                Section.Row.MoreInfo moreInfo = moreInfoSheet.moreInfo;
                String str19 = moreInfo.text;
                str19.getClass();
                SectionMoreInfoViewModel sectionMoreInfoViewModel = new SectionMoreInfoViewModel(str18, str19, moreInfo.url_text, ((AndroidStringManager) obj4).get(R.string.section_more_info_close));
                gapComposer22.end(false);
                return sectionMoreInfoViewModel;
            case 24:
                flow.getClass();
                GapComposer gapComposer23 = (GapComposer) composer;
                gapComposer23.startReplaceGroup(267168275);
                Updater.LaunchedEffect(gapComposer23, flow, new InvestingHomeView$onScrollFlow$1(flow, (Continuation) r8, musicPresenter, i4));
                InvestingScreens.CancelScheduledOrderScreen cancelScheduledOrderScreen = (InvestingScreens.CancelScheduledOrderScreen) obj5;
                CancelOrderViewModel cancelOrderViewModel = new CancelOrderViewModel(cancelScheduledOrderScreen.flowToken, cancelScheduledOrderScreen.paymentToken, cancelScheduledOrderScreen.message, cancelScheduledOrderScreen.accentColor);
                gapComposer23.end(false);
                return cancelOrderViewModel;
            case 25:
                flow.getClass();
                GapComposer gapComposer24 = (GapComposer) composer;
                gapComposer24.startReplaceGroup(742658158);
                Object rememberedValue37 = gapComposer24.rememberedValue();
                Continuation continuation3 = null;
                if (rememberedValue37 == neverEqualPolicy2) {
                    rememberedValue37 = Updater.mutableStateOf$default(null);
                    gapComposer24.updateRememberedValue(rememberedValue37);
                }
                MutableState mutableState23 = (MutableState) rememberedValue37;
                Object rememberedValue38 = gapComposer24.rememberedValue();
                if (rememberedValue38 == neverEqualPolicy2) {
                    rememberedValue38 = Updater.mutableStateOf$default(Boolean.FALSE);
                    gapComposer24.updateRememberedValue(rememberedValue38);
                }
                MutableState mutableState24 = (MutableState) rememberedValue38;
                Object rememberedValue39 = gapComposer24.rememberedValue();
                if (rememberedValue39 == neverEqualPolicy2) {
                    RealLimitsPageletStore realLimitsPageletStore = (RealLimitsPageletStore) obj3;
                    rememberedValue39 = FlowKt.flowOn(new SafeFlow(new CoroutinesKt$until$2(realLimitsPageletStore, continuation3, i6)), realLimitsPageletStore.ioDispatcher);
                    gapComposer24.updateRememberedValue(rememberedValue39);
                }
                MutableState collectAsState6 = Updater.collectAsState((Flow) rememberedValue39, null, null, gapComposer24, 48, 2);
                boolean changed3 = gapComposer24.changed((LimitsPageletStore$VersionedLimitsPagelet) collectAsState6.getValue());
                Object rememberedValue40 = gapComposer24.rememberedValue();
                LimitsMessageViewModel limitsMessageViewModel2 = LimitsMessageViewModel.None.INSTANCE;
                if (changed3 || rememberedValue40 == neverEqualPolicy2) {
                    LimitsPageletStore$VersionedLimitsPagelet limitsPageletStore$VersionedLimitsPagelet = (LimitsPageletStore$VersionedLimitsPagelet) collectAsState6.getValue();
                    if (limitsPageletStore$VersionedLimitsPagelet != null) {
                        GetInlineMessageResponse.LimitsHubInlineMessage limitsHubInlineMessage = limitsPageletStore$VersionedLimitsPagelet.inlineMessageSource.message;
                        String str20 = limitsHubInlineMessage.title_text;
                        if (str20 == null || str20.length() == 0) {
                            limitsMessageViewModel = limitsMessageViewModel2;
                        } else {
                            String str21 = limitsHubInlineMessage.description_text;
                            GetInlineMessageResponse.LimitsHubInlineMessage.Illustration illustration = limitsHubInlineMessage.illustration;
                            if (illustration != null && (str2 = illustration.android_illustration_id) != null) {
                                Illustrations.Companion.getClass();
                                Illustrations illustrations = (Illustrations) Illustrations.illustrationMap.get(str2);
                                if (illustrations != null) {
                                    cardUpsellIllustration = CardUpsellKt.toCardUpsellIllustration(illustrations);
                                    GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton = limitsHubInlineMessage.primary_button;
                                    String str22 = limitsHubInlineMessageButton == null ? limitsHubInlineMessageButton.text : null;
                                    limitsMessageViewModel = new LimitsMessageViewModel.CardUpsell(str20, str21, cardUpsellIllustration, str22 != null ? str22 : "");
                                }
                            }
                            cardUpsellIllustration = null;
                            GetInlineMessageResponse.LimitsHubInlineMessageButton limitsHubInlineMessageButton2 = limitsHubInlineMessage.primary_button;
                            if (limitsHubInlineMessageButton2 == null) {
                            }
                            limitsMessageViewModel = new LimitsMessageViewModel.CardUpsell(str20, str21, cardUpsellIllustration, str22 != null ? str22 : "");
                        }
                        rememberedValue40 = limitsMessageViewModel;
                    } else {
                        rememberedValue40 = limitsMessageViewModel2;
                    }
                    gapComposer24.updateRememberedValue(rememberedValue40);
                }
                LimitsMessageViewModel limitsMessageViewModel3 = (LimitsMessageViewModel) rememberedValue40;
                Updater.LaunchedEffect(gapComposer24, flow, new CashMapPresenter$models$$inlined$CollectEffect$1(flow, continuation3, collectAsState6, mutableState23, 2));
                LimitsPageletStore$VersionedLimitsPagelet limitsPageletStore$VersionedLimitsPagelet2 = (LimitsPageletStore$VersionedLimitsPagelet) collectAsState6.getValue();
                if (limitsPageletStore$VersionedLimitsPagelet2 != null) {
                    gapComposer24.startReplaceGroup(-1106477359);
                    Updater.LaunchedEffect(gapComposer24, limitsPageletStore$VersionedLimitsPagelet2, new RealKeyStoreProvider$setEntry$2(limitsPageletStore$VersionedLimitsPagelet2, continuation3, musicPresenter, 5));
                    gapComposer24.end(false);
                } else {
                    gapComposer24.startReplaceGroup(-1106436997);
                    gapComposer24.end(false);
                }
                UnifiedInlineMessageButton$Network unifiedInlineMessageButton$Network = (UnifiedInlineMessageButton$Network) mutableState23.getValue();
                if (unifiedInlineMessageButton$Network != null) {
                    gapComposer24.startReplaceGroup(-1106477359);
                    mutableState6 = mutableState24;
                    Updater.LaunchedEffect(gapComposer24, unifiedInlineMessageButton$Network, new AnimationsKt$takeUntil$1$1(unifiedInlineMessageButton$Network, (Continuation) null, musicPresenter, mutableState6, mutableState23, 17));
                    gapComposer24.end(false);
                } else {
                    mutableState6 = mutableState24;
                    gapComposer24.startReplaceGroup(-1106436997);
                    gapComposer24.end(false);
                }
                if (!((Boolean) mutableState6.getValue()).booleanValue()) {
                    limitsMessageViewModel2 = limitsMessageViewModel3;
                }
                gapComposer24.end(false);
                return limitsMessageViewModel2;
            case 26:
                return models$com$squareup$cash$limits$presenters$LimitsPresenter(flow, composer, i);
            case 27:
                return models$com$squareup$cash$money$booklet$MoneyTabBookletPresenter(flow, composer, i);
            case 28:
                return models$com$squareup$cash$moneybot$presenters$MoneybotFeedbackPresenter(flow, composer, i);
            default:
                ParcelableSnapshotMutableState parcelableSnapshotMutableState = (ParcelableSnapshotMutableState) obj5;
                flow.getClass();
                GapComposer gapComposer25 = (GapComposer) composer;
                gapComposer25.startReplaceGroup(870234686);
                Unit unit7 = Unit.INSTANCE;
                boolean changedInstance10 = gapComposer25.changedInstance(musicPresenter);
                Object rememberedValue41 = gapComposer25.rememberedValue();
                if (changedInstance10 || rememberedValue41 == neverEqualPolicy2) {
                    rememberedValue41 = new MoneybotPreambleEditorPresenter$models$1$1(musicPresenter, r8, i8);
                    gapComposer25.updateRememberedValue(rememberedValue41);
                }
                Updater.LaunchedEffect(gapComposer25, unit7, (Function2) rememberedValue41);
                Updater.LaunchedEffect(gapComposer25, flow, new CashMapPresenter$models$3$1(flow, (Continuation) r8, musicPresenter, i5));
                if (((String) parcelableSnapshotMutableState.getValue()) == null) {
                    error = MoneybotPreambleEditorViewModel.Loading.INSTANCE;
                } else {
                    String str23 = (String) parcelableSnapshotMutableState.getValue();
                    str23.getClass();
                    if (StringsKt.isBlank(str23)) {
                        error = new MoneybotPreambleEditorViewModel.Error("Failed to load preamble");
                    } else {
                        String str24 = (String) parcelableSnapshotMutableState.getValue();
                        str24.getClass();
                        error = new MoneybotPreambleEditorViewModel.Loaded(str24);
                    }
                }
                gapComposer25.end(false);
                return error;
        }
    }

    public MusicPresenter(EducationStoryPresenter$Factory$Impl educationStoryPresenter$Factory$Impl, EducationStoryViewPagerScreen educationStoryViewPagerScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 19;
        educationStoryViewPagerScreen.getClass();
        this.musicRepository = educationStoryPresenter$Factory$Impl;
        this.musicPlayer = educationStoryViewPagerScreen;
        this.navigator = screenNavigator;
        this.args = LazyKt.lazy(new ArcadeModal$$ExternalSyntheticLambda2(this, 15));
    }

    public MusicPresenter(String str, AndroidStringManager androidStringManager, IntentLauncher intentLauncher, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 4;
        this.musicRepository = str;
        this.musicPlayer = androidStringManager;
        this.args = intentLauncher;
        this.navigator = screenNavigator;
    }

    public MusicPresenter(RealClipboardManager realClipboardManager, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, StablecoinDepositCopyScreen stablecoinDepositCopyScreen) {
        this.$r8$classId = 8;
        stablecoinDepositCopyScreen.getClass();
        this.musicRepository = realClipboardManager;
        this.musicPlayer = androidStringManager;
        this.navigator = screenNavigator;
        this.args = stablecoinDepositCopyScreen;
    }

    public MusicPresenter(RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, MoneyTabBookletScreen moneyTabBookletScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 27;
        moneyTabBookletScreen.getClass();
        this.musicRepository = moneyTabBookletScreen;
        this.navigator = screenNavigator;
        this.musicPlayer = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public MusicPresenter(IntentLauncher intentLauncher, AndroidStringManager androidStringManager, BetterNavigator.ScreenNavigator screenNavigator, InvestingScreens.MoreInfoSheet moreInfoSheet) {
        this.$r8$classId = 23;
        moreInfoSheet.getClass();
        this.musicRepository = intentLauncher;
        this.musicPlayer = androidStringManager;
        this.navigator = screenNavigator;
        this.args = moreInfoSheet;
    }

    public MusicPresenter(AndroidStringManager androidStringManager, UnlinkResultScreen unlinkResultScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 17;
        unlinkResultScreen.getClass();
        this.musicRepository = unlinkResultScreen;
        this.navigator = screenNavigator;
        SyncBusinessGrant.ActionType actionType = unlinkResultScreen.actionType;
        this.musicPlayer = new UnlinkResultViewModel.Success(androidStringManager.get((actionType == SyncBusinessGrant.ActionType.LINK_ACCOUNT || actionType == SyncBusinessGrant.ActionType.RECURRING_DEPOSITS) ? R.string.account_unlink_success_title : R.string.business_unlink_success_title), androidStringManager.get(R.string.unlink_result_cta_text));
        this.args = new UnlinkResultViewModel.Failure(androidStringManager.get(R.string.unlink_failure_title), androidStringManager.get(R.string.unlink_result_cta_text), androidStringManager.get(R.string.unlink_failure_description));
    }

    public /* synthetic */ MusicPresenter(BetterNavigator.ScreenNavigator screenNavigator, Object obj, Object obj2, Object obj3, int i) {
        this.$r8$classId = i;
        this.navigator = screenNavigator;
        this.musicRepository = obj;
        this.musicPlayer = obj2;
        this.args = obj3;
    }

    public MusicPresenter(FlowStarter flowStarter, Analytics analytics, AlternativeNewSponsorAliasScreen alternativeNewSponsorAliasScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 3;
        alternativeNewSponsorAliasScreen.getClass();
        this.musicRepository = flowStarter;
        this.musicPlayer = analytics;
        this.args = alternativeNewSponsorAliasScreen;
        this.navigator = screenNavigator;
    }

    public MusicPresenter(Analytics analytics, CryptoFlowStarter cryptoFlowStarter, BetterNavigator.ScreenNavigator screenNavigator, BitcoinInvoiceEntryScreen bitcoinInvoiceEntryScreen) {
        this.$r8$classId = 5;
        bitcoinInvoiceEntryScreen.getClass();
        this.musicRepository = analytics;
        this.musicPlayer = cryptoFlowStarter;
        this.navigator = screenNavigator;
        this.args = bitcoinInvoiceEntryScreen;
    }

    public MusicPresenter(PaymentManager paymentManager, RealInvestingAnalytics realInvestingAnalytics, InvestingScreens.CancelScheduledOrderScreen cancelScheduledOrderScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 24;
        cancelScheduledOrderScreen.getClass();
        this.musicRepository = paymentManager;
        this.musicPlayer = realInvestingAnalytics;
        this.args = cancelScheduledOrderScreen;
        this.navigator = screenNavigator;
    }

    public MusicPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, OrderDetailsOverflowActionSheetScreen orderDetailsOverflowActionSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 12;
        orderDetailsOverflowActionSheetScreen.getClass();
        this.musicRepository = analytics;
        this.musicPlayer = orderDetailsOverflowActionSheetScreen;
        this.navigator = screenNavigator;
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public MusicPresenter(ChatManager chatManager, RealMoneybotPreambleManager realMoneybotPreambleManager, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 29;
        this.musicRepository = chatManager;
        this.musicPlayer = realMoneybotPreambleManager;
        this.navigator = screenNavigator;
        this.args = Updater.mutableStateOf$default(null);
    }

    public MusicPresenter(AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, SponsorResourcesScreen sponsorResourcesScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 20;
        sponsorResourcesScreen.getClass();
        this.musicRepository = androidStringManager;
        this.musicPlayer = sponsorResourcesScreen;
        this.navigator = screenNavigator;
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public MusicPresenter(AtmPmdExplainerScreen atmPmdExplainerScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealRouter$Factory$Impl realRouter$Factory$Impl) {
        this.$r8$classId = 18;
        atmPmdExplainerScreen.getClass();
        this.musicRepository = atmPmdExplainerScreen;
        this.navigator = screenNavigator;
        this.musicPlayer = analytics;
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public MusicPresenter(AndroidStringManager androidStringManager, RealPaidInBitcoinStateManager realPaidInBitcoinStateManager, RealPaidInBitcoinNavigator$Factory$Impl realPaidInBitcoinNavigator$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 7;
        this.musicRepository = androidStringManager;
        this.musicPlayer = realPaidInBitcoinStateManager;
        this.navigator = screenNavigator;
        this.args = realPaidInBitcoinNavigator$Factory$Impl.create(screenNavigator);
    }

    public MusicPresenter(AndroidStringManager androidStringManager, RealRouter$Factory$Impl realRouter$Factory$Impl, MoneybotFeedbackScreen moneybotFeedbackScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 28;
        this.musicRepository = androidStringManager;
        this.musicPlayer = moneybotFeedbackScreen;
        this.navigator = screenNavigator;
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public MusicPresenter(RealFinishSetupAppletTileRepository realFinishSetupAppletTileRepository, AndroidStringManager androidStringManager, MoneyAnalyticsService moneyAnalyticsService, RealMoneyNavigatorHelper realMoneyNavigatorHelper, RealRouter$Factory$Impl realRouter$Factory$Impl, Navigator navigator) {
        this.$r8$classId = 22;
        navigator.getClass();
        this.musicRepository = realFinishSetupAppletTileRepository;
        this.musicPlayer = androidStringManager;
        this.args = moneyAnalyticsService;
        this.navigator = realRouter$Factory$Impl.create$1(navigator);
    }

    public MusicPresenter(AndroidStringManager androidStringManager, IntentLauncher intentLauncher, LocalExplanatoryDialog localExplanatoryDialog, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 1;
        localExplanatoryDialog.getClass();
        this.musicRepository = androidStringManager;
        this.musicPlayer = intentLauncher;
        this.args = localExplanatoryDialog;
        this.navigator = screenNavigator;
    }

    public MusicPresenter(EducationalSheetPresenter$Factory$Impl educationalSheetPresenter$Factory$Impl, RealCashLocalShortlinkHandler realCashLocalShortlinkHandler, LocalShortlinkSheet localShortlinkSheet, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 2;
        localShortlinkSheet.getClass();
        this.musicRepository = educationalSheetPresenter$Factory$Impl;
        this.musicPlayer = realCashLocalShortlinkHandler;
        this.navigator = screenNavigator;
        this.args = new ShortlinkAction(localShortlinkSheet.shortlinkKey, localShortlinkSheet.nextShortlinkFlowState);
    }

    public MusicPresenter(AppConfigManager appConfigManager, PatternSignatureStampsV2 patternSignatureStampsV2, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext) {
        this.$r8$classId = 14;
        patternSignatureStampsV2.getClass();
        this.musicRepository = appConfigManager;
        this.musicPlayer = patternSignatureStampsV2;
        this.navigator = screenNavigator;
        this.args = coroutineContext;
    }

    public MusicPresenter(AppConfigManager appConfigManager, PatternSignatureStamps patternSignatureStamps, BetterNavigator.ScreenNavigator screenNavigator, CoroutineContext coroutineContext) {
        this.$r8$classId = 13;
        patternSignatureStamps.getClass();
        this.musicRepository = appConfigManager;
        this.musicPlayer = patternSignatureStamps;
        this.navigator = screenNavigator;
        this.args = coroutineContext;
    }

    public MusicPresenter(AndroidStringManager androidStringManager, RealInstrumentManager realInstrumentManager, BlockersScreens.ConfirmCvvScreen confirmCvvScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 9;
        this.musicRepository = androidStringManager;
        this.musicPlayer = confirmCvvScreen;
        this.navigator = screenNavigator;
        String str = confirmCvvScreen.instrumentToken;
        str.getClass();
        this.args = StateFlowKt.runUntil(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new Transform$special$$inlined$map$1(RealInstrumentManager.syncValueBased$default(realInstrumentManager), str, 20), 24), realInstrumentManager.signOut);
    }

    public MusicPresenter(AndroidStringManager androidStringManager, CryptoFlowStarter cryptoFlowStarter, RealBitcoinConfigRepo realBitcoinConfigRepo, BitcoinPeriodSelectionScreen bitcoinPeriodSelectionScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 6;
        bitcoinPeriodSelectionScreen.getClass();
        this.musicRepository = androidStringManager;
        this.musicPlayer = realBitcoinConfigRepo;
        this.args = bitcoinPeriodSelectionScreen;
        this.navigator = screenNavigator;
    }

    public MusicPresenter(RealLimitsStore realLimitsStore, Analytics analytics, LimitsInlineMessagePresenter$AssistedInjectionFactory$Impl limitsInlineMessagePresenter$AssistedInjectionFactory$Impl, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 26;
        this.musicRepository = realLimitsStore;
        this.musicPlayer = analytics;
        this.navigator = screenNavigator;
        LimitsInlineMessagePresenter$MetroFactory limitsInlineMessagePresenter$MetroFactory = limitsInlineMessagePresenter$AssistedInjectionFactory$Impl.delegateFactory;
        RealLimitsPageletStore realLimitsPageletStore = (RealLimitsPageletStore) limitsInlineMessagePresenter$MetroFactory.limitsPageletStore.invoke();
        RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) limitsInlineMessagePresenter$MetroFactory.routerFactory.invoke();
        LongPreference longPreference = (LongPreference) limitsInlineMessagePresenter$MetroFactory.lastSeenPageletVersion.invoke();
        CashSourceOfFundsClientService cashSourceOfFundsClientService = (CashSourceOfFundsClientService) limitsInlineMessagePresenter$MetroFactory.appService.getValue();
        realLimitsPageletStore.getClass();
        realRouter$Factory$Impl.getClass();
        longPreference.getClass();
        cashSourceOfFundsClientService.getClass();
        this.args = new MusicPresenter(realLimitsPageletStore, realRouter$Factory$Impl, longPreference, cashSourceOfFundsClientService, screenNavigator);
    }

    public MusicPresenter(ToolbarTuckTargets toolbarTuckTargets, RealMusicPlayer realMusicPlayer, MusicScreen musicScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 0;
        musicScreen.getClass();
        this.musicRepository = toolbarTuckTargets;
        this.musicPlayer = realMusicPlayer;
        this.args = musicScreen;
        this.navigator = screenNavigator;
    }

    public MusicPresenter(RealLimitsPageletStore realLimitsPageletStore, RealRouter$Factory$Impl realRouter$Factory$Impl, LongPreference longPreference, CashSourceOfFundsClientService cashSourceOfFundsClientService, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 25;
        this.musicRepository = realLimitsPageletStore;
        this.musicPlayer = longPreference;
        this.args = cashSourceOfFundsClientService;
        this.navigator = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    public MusicPresenter(LendingAppService lendingAppService, CoroutineScope coroutineScope, ExpandedLoanHistory expandedLoanHistory, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 10;
        expandedLoanHistory.getClass();
        this.musicRepository = lendingAppService;
        this.musicPlayer = coroutineScope;
        this.args = expandedLoanHistory;
        this.navigator = screenNavigator;
    }

    public MusicPresenter(RealRouter$Factory$Impl realRouter$Factory$Impl, Analytics analytics, AfterPayInfoSheetScreen afterPayInfoSheetScreen, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 11;
        afterPayInfoSheetScreen.getClass();
        this.musicRepository = analytics;
        this.musicPlayer = afterPayInfoSheetScreen;
        this.navigator = screenNavigator;
        this.args = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* renamed from: models, reason: collision with other method in class */
    public void m3665models(Flow flow, Composer composer, int i) {
        int i2;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1745274611);
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 = (gapComposer.changedInstance(this) ? 32 : 16) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 17) != 16)) {
            Unit unit = Unit.INSTANCE;
            boolean changedInstance = gapComposer.changedInstance(this);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new AmountPickerCondensedView.AnonymousClass14(this, null, i3);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BalanceHomeViewKt$$ExternalSyntheticLambda11(this, flow, i, 25);
        }
    }
}
