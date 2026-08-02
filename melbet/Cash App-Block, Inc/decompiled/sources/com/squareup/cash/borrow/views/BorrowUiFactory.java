package com.squareup.cash.borrow.views;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.room.Room;
import app.cash.badging.api.Badger2;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.broadway.screen.BottomSheetScreen;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import app.cash.cdp.integration.CashCdpConfigProvider;
import app.cash.cdp.integration.CdpConfigUpdateSetupTeardown;
import app.cash.local.backend.ClearMarketingBadgesIfNeeded;
import app.cash.local.backend.RefreshMarketingMessages;
import app.cash.local.backend.real.RealMarketingMessageRepository;
import app.cash.local.presenters.cart.LocalOpenTabCartMapper;
import app.cash.local.presenters.internal.FulfillmentTimeUtils;
import app.cash.local.service.LocalService;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda4;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.braze.enums.DataStoreKey$$ExternalSyntheticLambda0;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.mikepenz.markdown.annotator.AnnotatedStringKtxKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.account.backend.PrincipalAccountTokenModule$$ExternalSyntheticLambda0;
import com.squareup.cash.account.backend.PrincipalAccountTokenSomeJson;
import com.squareup.cash.account.presenters.settings.LimitsSetting;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.viewmodels.FullScreenActivityViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.advertising.views.AdUiFactory;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.android.AndroidBuildConfigService;
import com.squareup.cash.appmessages.overlay.RealOverlayAppMessageReader;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.bitcoin.capability.RealBitcoinCapabilityProvider;
import com.squareup.cash.bitcoin.graph.real.BitcoinGraphPrefetch;
import com.squareup.cash.bitcoin.graph.real.RealBitcoinGraphModelProvider;
import com.squareup.cash.bitcoin.navigation.RealBitcoinInboundNavigator$Factory$Impl;
import com.squareup.cash.bitcoin.presenters.buy.BuyBitcoinNavigator;
import com.squareup.cash.bitcoin.presenters.payinusd.RealBitcoinPayInUsdPreferenceManager;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.views.BlockersUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.boost.backend.BoostBackendModule$Companion$bindBoostSignOutAction$1;
import com.squareup.cash.boost.backend.BoostConfigManager;
import com.squareup.cash.boost.backend.BoostSyncer;
import com.squareup.cash.boost.backend.RealBoostAnalyticsHelper;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.borrow.screens.BorrowHomeAmountPickerSheet;
import com.squareup.cash.borrow.screens.BorrowHomeOverlay;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.cash.borrow.screens.ExpandedLoanHistory;
import com.squareup.cash.borrow.screens.LoanAmountPicker;
import com.squareup.cash.borrow.screens.RepayCustomAmountPicker;
import com.squareup.cash.borrow.views.BorrowUiFactory;
import com.squareup.cash.card.spendinginsights.views.inject.SpendingInsightsViewFactory;
import com.squareup.cash.cashapplite.screens.LiteActivityScreen;
import com.squareup.cash.cashapplite.screens.LiteAddMoneyScreen;
import com.squareup.cash.cashapplite.screens.LiteBalanceHomeScreen;
import com.squareup.cash.cashapplite.screens.LiteCashInScreen;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.crypto.backend.capability.RealBitcoinActivityProvider;
import com.squareup.cash.crypto.backend.disclosures.RealCryptoDisclosuresRepo$Factory$Impl;
import com.squareup.cash.crypto.backend.profile.RealBitcoinProfileRepo;
import com.squareup.cash.crypto.service.CryptoService;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.education.stories.backend.real.RealEducationStoryRepository;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.family.familyhub.backend.real.RealDependentCustomerTokenRepository;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.filepicker.RealFilePicker$Factory$Impl;
import com.squareup.cash.globalsearch.screens.GlobalSearchScreen;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.investing.components.categories.InvestingCategoryDetailKt;
import com.squareup.cash.investing.components.holding.InvestingEtfHoldingDetailsKt;
import com.squareup.cash.investing.components.inject.ComposableSingletons$InvestingUiFactoryKt;
import com.squareup.cash.investing.components.news.InvestingNewsKt$$ExternalSyntheticLambda2;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.activity.InvestingActivityHistoryViewModel;
import com.squareup.cash.investing.viewmodels.categories.InvestingCategoryDetailViewModel;
import com.squareup.cash.investing.viewmodels.holdings.InvestingEtfHoldingDetailsViewModel;
import com.squareup.cash.investing.viewmodels.ordertype.autoinvest.InvestingRecurringPurchaseReceiptViewModel;
import com.squareup.cash.investingcrypto.viewmodels.news.InvestingCryptoNewsViewModel;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.pools.screens.PoolContributeScreen;
import com.squareup.cash.pools.screens.PoolDetailsScreen;
import com.squareup.cash.pools.screens.PoolInvitePeopleListScreen;
import com.squareup.cash.pools.screens.PoolMemberListScreen;
import com.squareup.cash.pools.screens.PoolMoreOptionsBottomSheet;
import com.squareup.cash.pools.screens.PoolsListScreen;
import com.squareup.cash.pools.screens.StartPoolScreen;
import com.squareup.cash.pools.viewmodels.PoolContributeWithNoteViewModel;
import com.squareup.cash.pools.viewmodels.PoolDetailsViewModel;
import com.squareup.cash.pools.viewmodels.PoolInvitePeopleListViewModel;
import com.squareup.cash.pools.viewmodels.PoolMemberListViewModel;
import com.squareup.cash.pools.viewmodels.PoolsListViewModel;
import com.squareup.cash.pools.viewmodels.StartPoolViewModel;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.retro.views.RetroUiFactory;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.savings.screens.SavingsCardSheet;
import com.squareup.cash.savings.screens.SavingsFullActivityScreen;
import com.squareup.cash.savings.screens.SavingsRouteInterstitialScreen;
import com.squareup.cash.savings.screens.SavingsScreen;
import com.squareup.cash.savings.screens.TransferInScreen;
import com.squareup.cash.savings.screens.TransferOutScreen$Full;
import com.squareup.cash.savings.screens.TransferProcessingScreen;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel;
import com.squareup.cash.savings.views.FullTransferInViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.savings.views.SavingsScreenViewKt;
import com.squareup.cash.savings.views.inject.ComposableSingletons$SavingsUiFactoryKt;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.stablecoin.capability.real.RealStablecoinCapabilityHelper;
import com.squareup.cash.support.backend.real.RealSearchPlaceholderProvider;
import com.squareup.cash.ui.OutsideTapCloses;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.internal.Util;
import com.squareup.preferences.KeyValue;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.Factory;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Reflection;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes.dex */
public final class BorrowUiFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId;
    public final RealImageLoader imageLoader;
    public final RealCashVibrator vibrator;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final Provider imageLoader;
        public final Provider vibrator;

        public /* synthetic */ MetroFactory(Provider provider, Provider provider2, int i) {
            this.$r8$classId = i;
            this.imageLoader = provider;
            this.vibrator = provider2;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            int i2 = 19;
            int i3 = 1;
            int i4 = 0;
            Provider provider = this.vibrator;
            Provider provider2 = this.imageLoader;
            switch (i) {
                case 0:
                    RealImageLoader realImageLoader = (RealImageLoader) provider2.invoke();
                    RealCashVibrator realCashVibrator = (RealCashVibrator) provider.invoke();
                    realImageLoader.getClass();
                    realCashVibrator.getClass();
                    return new BorrowUiFactory(realImageLoader, realCashVibrator, i4);
                case 1:
                    SyncValueReader syncValueReader = (SyncValueReader) provider2.invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) provider.invoke();
                    syncValueReader.getClass();
                    featureFlagManager.getClass();
                    return new FinishSetupTileBadgeCounter(i4, syncValueReader, featureFlagManager);
                case 2:
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) provider2.invoke();
                    CashCdpConfigProvider cashCdpConfigProvider = (CashCdpConfigProvider) provider.invoke();
                    featureFlagManager2.getClass();
                    cashCdpConfigProvider.getClass();
                    return new CdpConfigUpdateSetupTeardown(i4, featureFlagManager2, cashCdpConfigProvider);
                case 3:
                    RealMarketingMessageRepository realMarketingMessageRepository = (RealMarketingMessageRepository) provider2.invoke();
                    Badger2 badger2 = (Badger2) provider.invoke();
                    realMarketingMessageRepository.getClass();
                    badger2.getClass();
                    return new ClearMarketingBadgesIfNeeded(realMarketingMessageRepository, badger2);
                case 4:
                    RealMarketingMessageRepository realMarketingMessageRepository2 = (RealMarketingMessageRepository) provider2.invoke();
                    Badger2 badger22 = (Badger2) provider.invoke();
                    realMarketingMessageRepository2.getClass();
                    badger22.getClass();
                    return new RefreshMarketingMessages(realMarketingMessageRepository2, badger22);
                case 5:
                    LocalService localService = (LocalService) provider2.invoke();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) provider.invoke();
                    localService.getClass();
                    featureFlagManager3.getClass();
                    return new RealMarketingMessageRepository(localService, featureFlagManager3);
                case 6:
                    AndroidStringManager androidStringManager = (AndroidStringManager) provider2.invoke();
                    AndroidClock androidClock = (AndroidClock) provider.invoke();
                    androidStringManager.getClass();
                    androidClock.getClass();
                    return new LocalOpenTabCartMapper(androidStringManager, androidClock);
                case 7:
                    AndroidClock androidClock2 = (AndroidClock) provider2.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) provider.invoke();
                    androidClock2.getClass();
                    androidStringManager2.getClass();
                    return new FulfillmentTimeUtils(androidStringManager2, androidClock2);
                case 8:
                    SharedPreferences sharedPreferences = (SharedPreferences) provider2.invoke();
                    Moshi moshi = (Moshi) provider.invoke();
                    sharedPreferences.getClass();
                    moshi.getClass();
                    JsonAdapter adapter = moshi.adapter(PrincipalAccountTokenSomeJson.class, Util.NO_ANNOTATIONS, null);
                    KeyValue.OnDeserializationFailure onDeserializationFailure = KeyValue.OnDeserializationFailure.Delete;
                    return Room.SerDeKeyValue$default(sharedPreferences, "principal_account_token", new PrincipalAccountTokenModule$$ExternalSyntheticLambda0(adapter, 0), new PrincipalAccountTokenModule$$ExternalSyntheticLambda0(adapter, 1), new DataStoreKey$$ExternalSyntheticLambda0(17), 64);
                case 9:
                    RealImageLoader realImageLoader2 = (RealImageLoader) provider2.invoke();
                    ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) provider.invoke();
                    realImageLoader2.getClass();
                    elementBoundsRegistry.getClass();
                    return new AdUiFactory(realImageLoader2, elementBoundsRegistry, i3);
                case 10:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider = (RealBitcoinCapabilityProvider) provider2.invoke();
                    RealStablecoinCapabilityHelper realStablecoinCapabilityHelper = (RealStablecoinCapabilityHelper) provider.invoke();
                    realBitcoinCapabilityProvider.getClass();
                    realStablecoinCapabilityHelper.getClass();
                    return new LimitsSetting(realBitcoinCapabilityProvider, realStablecoinCapabilityHelper);
                case 11:
                    ActivitiesManager activitiesManager = (ActivitiesManager) provider2.invoke();
                    SessionManager sessionManager = (SessionManager) provider.invoke();
                    activitiesManager.getClass();
                    sessionManager.getClass();
                    return new BitcoinGraphPrefetch(i3, activitiesManager, sessionManager);
                case 12:
                    RealImageLoader realImageLoader3 = (RealImageLoader) provider2.invoke();
                    FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) provider.invoke();
                    realImageLoader3.getClass();
                    featureFlagManager4.getClass();
                    return new RetroUiFactory(realImageLoader3, featureFlagManager4, i3);
                case 13:
                    String str = (String) provider2.invoke();
                    boolean booleanValue = ((Boolean) provider.invoke()).booleanValue();
                    str.getClass();
                    return new AndroidBuildConfigService(str, booleanValue);
                case 14:
                    CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) provider2.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) provider.invoke();
                    cashAccountDatabaseImpl.getClass();
                    coroutineContext.getClass();
                    return new RealOverlayAppMessageReader(cashAccountDatabaseImpl, coroutineContext);
                case 15:
                    Context context = (Context) provider2.invoke();
                    RealImageLoader realImageLoader4 = (RealImageLoader) provider.invoke();
                    context.getClass();
                    realImageLoader4.getClass();
                    return new RealAppMessageImageLoader(context, realImageLoader4);
                case 16:
                    RealImageLoader realImageLoader5 = (RealImageLoader) provider2.invoke();
                    FeatureFlagManager featureFlagManager5 = (FeatureFlagManager) provider.invoke();
                    realImageLoader5.getClass();
                    featureFlagManager5.getClass();
                    return new RetroUiFactory(realImageLoader5, featureFlagManager5, 2);
                case 17:
                    RealImageLoader realImageLoader6 = (RealImageLoader) provider2.invoke();
                    RealCashVibrator realCashVibrator2 = (RealCashVibrator) provider.invoke();
                    realImageLoader6.getClass();
                    realCashVibrator2.getClass();
                    return new ScoreUiFactory(realImageLoader6, realCashVibrator2);
                case 18:
                    RealBitcoinActivityProvider realBitcoinActivityProvider = (RealBitcoinActivityProvider) provider2.invoke();
                    RealBitcoinGraphModelProvider realBitcoinGraphModelProvider = (RealBitcoinGraphModelProvider) provider.invoke();
                    realBitcoinActivityProvider.getClass();
                    realBitcoinGraphModelProvider.getClass();
                    return new BitcoinGraphPrefetch(i4, realBitcoinActivityProvider, realBitcoinGraphModelProvider);
                case 19:
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) provider2.invoke();
                    RealDependentCustomerTokenRepository realDependentCustomerTokenRepository = (RealDependentCustomerTokenRepository) provider.invoke();
                    androidStringManager3.getClass();
                    realDependentCustomerTokenRepository.getClass();
                    return new Result(i2, androidStringManager3, realDependentCustomerTokenRepository);
                case 20:
                    RealCryptoDisclosuresRepo$Factory$Impl realCryptoDisclosuresRepo$Factory$Impl = (RealCryptoDisclosuresRepo$Factory$Impl) provider2.invoke();
                    IntentLauncher intentLauncher = (IntentLauncher) provider.invoke();
                    realCryptoDisclosuresRepo$Factory$Impl.getClass();
                    intentLauncher.getClass();
                    return new BinaryBitmap(15, realCryptoDisclosuresRepo$Factory$Impl, intentLauncher);
                case 21:
                    FeatureFlagManager featureFlagManager6 = (FeatureFlagManager) provider2.invoke();
                    RealEducationStoryRepository realEducationStoryRepository = (RealEducationStoryRepository) provider.invoke();
                    featureFlagManager6.getClass();
                    realEducationStoryRepository.getClass();
                    return new Result(20, featureFlagManager6, realEducationStoryRepository);
                case 22:
                    RealBitcoinCapabilityProvider realBitcoinCapabilityProvider2 = (RealBitcoinCapabilityProvider) provider2.invoke();
                    AndroidStringManager androidStringManager4 = (AndroidStringManager) provider.invoke();
                    realBitcoinCapabilityProvider2.getClass();
                    androidStringManager4.getClass();
                    return new RealSearchPlaceholderProvider(realBitcoinCapabilityProvider2, androidStringManager4);
                case 23:
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) provider2.invoke();
                    RealBitcoinInboundNavigator$Factory$Impl realBitcoinInboundNavigator$Factory$Impl = (RealBitcoinInboundNavigator$Factory$Impl) provider.invoke();
                    androidStringManager5.getClass();
                    realBitcoinInboundNavigator$Factory$Impl.getClass();
                    return new BuyBitcoinNavigator(androidStringManager5, realBitcoinInboundNavigator$Factory$Impl);
                case 24:
                    CryptoService cryptoService = (CryptoService) provider2.invoke();
                    RealBitcoinProfileRepo realBitcoinProfileRepo = (RealBitcoinProfileRepo) provider.invoke();
                    cryptoService.getClass();
                    realBitcoinProfileRepo.getClass();
                    return new RealBitcoinPayInUsdPreferenceManager(cryptoService, realBitcoinProfileRepo);
                case 25:
                    BoostSyncer boostSyncer = (BoostSyncer) provider2.invoke();
                    BoostConfigManager boostConfigManager = (BoostConfigManager) provider.invoke();
                    boostSyncer.getClass();
                    boostConfigManager.getClass();
                    return new BoostBackendModule$Companion$bindBoostSignOutAction$1(i4, boostSyncer, boostConfigManager);
                case 26:
                    SharedPreferences sharedPreferences2 = (SharedPreferences) provider2.invoke();
                    RealUuidGenerator realUuidGenerator = (RealUuidGenerator) provider.invoke();
                    sharedPreferences2.getClass();
                    realUuidGenerator.getClass();
                    return new RealBoostAnalyticsHelper(sharedPreferences2, realUuidGenerator);
                case 27:
                    RealImageLoader realImageLoader7 = (RealImageLoader) provider2.invoke();
                    RealFilePicker$Factory$Impl realFilePicker$Factory$Impl = (RealFilePicker$Factory$Impl) provider.invoke();
                    realImageLoader7.getClass();
                    realFilePicker$Factory$Impl.getClass();
                    return new AdUiFactory(realImageLoader7, realFilePicker$Factory$Impl, 3);
                case 28:
                    RealP2pSettingsManager realP2pSettingsManager = (RealP2pSettingsManager) provider2.invoke();
                    SyncValueReader syncValueReader2 = (SyncValueReader) provider.invoke();
                    realP2pSettingsManager.getClass();
                    syncValueReader2.getClass();
                    return new BinaryBitmap(i2, realP2pSettingsManager, syncValueReader2);
                default:
                    RealImageLoader realImageLoader8 = (RealImageLoader) provider2.invoke();
                    RealCashVibrator realCashVibrator3 = (RealCashVibrator) provider.invoke();
                    realImageLoader8.getClass();
                    realCashVibrator3.getClass();
                    return new SpendingInsightsViewFactory(realImageLoader8, realCashVibrator3, i4);
            }
        }
    }

    public /* synthetic */ BorrowUiFactory(RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, int i) {
        this.$r8$classId = i;
        this.imageLoader = realImageLoader;
        this.vibrator = realCashVibrator;
    }

    public UiFactory.ComposeUi BorrowComposeUi(ComposableLambdaImpl composableLambdaImpl) {
        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new LocalViewFactory$$ExternalSyntheticLambda4(18, this, composableLambdaImpl), true, -554410116));
    }

    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        UiFactory.ScreenUi BorrowComposeUi;
        int i = this.$r8$classId;
        int i2 = 6;
        final int i3 = 5;
        final int i4 = 4;
        final int i5 = 3;
        final int i6 = 2;
        final int i7 = 0;
        final int i8 = 1;
        context.getClass();
        switch (i) {
            case 0:
                if (screen instanceof BorrowHome) {
                    BorrowComposeUi = BorrowComposeUi(BorrowHomeKt.lambda$1632125313);
                } else if (screen instanceof BorrowHomeAmountPickerSheet) {
                    BorrowComposeUi = BorrowComposeUi(BorrowHomeKt.lambda$28741279);
                } else if (screen instanceof BorrowHomeOverlay) {
                    BorrowComposeUi = BorrowComposeUi(BorrowHomeKt.lambda$2032801643);
                } else if (screen instanceof BorrowLimitHub) {
                    BorrowComposeUi = BorrowComposeUi(BorrowHomeKt.lambda$34124885);
                } else if (screen instanceof ExpandedLoanHistory) {
                    BorrowComposeUi = BorrowComposeUi(BorrowHomeKt.f323lambda$518348043);
                } else if (screen instanceof BlockersScreens.CreditFirstTimeBorrowBlockerScreen) {
                    BorrowComposeUi = BorrowComposeUi(BorrowHomeKt.f324lambda$530316380);
                } else if (screen instanceof BlockersScreens.CreditMultiStepLoadingBlockerScreen) {
                    BorrowComposeUi = BorrowComposeUi(BorrowHomeKt.lambda$966918517);
                } else if ((screen instanceof LoanAmountPicker.LoanAmountPickerFull) || (screen instanceof RepayCustomAmountPicker)) {
                    BorrowComposeUi = BorrowComposeUi(BorrowHomeKt.f321lambda$1408505072);
                } else {
                    if (!(screen instanceof LoanAmountPicker.LoanAmountPickerSheet)) {
                        return null;
                    }
                    LoanAmountPickerCondensedView loanAmountPickerCondensedView = new LoanAmountPickerCondensedView(context);
                    BorrowComposeUi = new UiFactory.ViewUi(loanAmountPickerCondensedView, loanAmountPickerCondensedView);
                }
                if ((BorrowComposeUi instanceof UiFactory.ViewUi) && (screen instanceof BottomSheetScreen)) {
                    View view = ((UiFactory.ViewUi) BorrowComposeUi).view;
                    if (!(view instanceof OutsideTapCloses)) {
                        Path$$ExternalSyntheticBUOutline0.m((Object) Recorder$$ExternalSyntheticOutline2.m$1(Reflection.factory.getOrCreateKotlinClass(view.getClass()).getSimpleName(), " doesn't implement OutsideTapCloses"));
                        return null;
                    }
                }
                return BorrowComposeUi;
            case 1:
                if (screen instanceof LiteAddMoneyScreen) {
                    return new UiFactory.ComposeUi(KycAppletTileKt.f346lambda$1135631618);
                }
                if (screen instanceof LiteCashInScreen) {
                    return new UiFactory.ComposeUi(KycAppletTileKt.f347lambda$1889655684);
                }
                if (screen instanceof LiteActivityScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, i2), true, -175465863));
                }
                if (screen instanceof LiteBalanceHomeScreen) {
                    return new UiFactory.ComposeUi(KycAppletTileKt.f349lambda$313940691);
                }
                return null;
            case 2:
                if (screen instanceof GlobalSearchScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 11), true, -512161513));
                }
                return null;
            case 3:
                InvestingScreens investingScreens = screen instanceof InvestingScreens ? (InvestingScreens) screen : null;
                if (investingScreens instanceof InvestingScreens.NewsScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.investing.components.inject.InvestingUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13 = i7;
                            int i14 = 4;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i13) {
                                case 0:
                                    InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    investingCryptoNewsViewModel.getClass();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i9 = intValue | (((GapComposer) composer).changed(investingCryptoNewsViewModel) ? 4 : 2);
                                    } else {
                                        i9 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i9 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1726091594, new InvestingNewsKt$$ExternalSyntheticLambda2(investingCryptoNewsViewModel, function1), gapComposer), gapComposer, 56);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    investingCategoryDetailViewModel.getClass();
                                    function12.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        i10 = intValue2 | ((intValue2 & 8) == 0 ? ((GapComposer) composer2).changed(investingCategoryDetailViewModel) : ((GapComposer) composer2).changedInstance(investingCategoryDetailViewModel) ? 4 : 2);
                                    } else {
                                        i10 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        i10 |= ((GapComposer) composer2).changedInstance(function12) ? 32 : 16;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(i10 & 1, (i10 & 147) != 146)) {
                                        InvestingCategoryDetailKt.InvestingCategoryDetail(investingCategoryDetailViewModel, function12, borrowUiFactory.imageLoader, gapComposer2, i10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    InvestingActivityHistoryViewModel investingActivityHistoryViewModel = (InvestingActivityHistoryViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    investingActivityHistoryViewModel.getClass();
                                    function13.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        i11 = intValue3 | (((GapComposer) composer3).changed(investingActivityHistoryViewModel) ? 4 : 2);
                                    } else {
                                        i11 = intValue3;
                                    }
                                    if ((intValue3 & 48) == 0) {
                                        i11 |= ((GapComposer) composer3).changedInstance(function13) ? 32 : 16;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        AnnotatedStringKtxKt.InvestingActivityHistory(borrowUiFactory.imageLoader, investingActivityHistoryViewModel, function13, null, gapComposer3, (i11 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel = (InvestingEtfHoldingDetailsViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    investingEtfHoldingDetailsViewModel.getClass();
                                    function14.getClass();
                                    InvestingEtfHoldingDetailsKt.InvestmentEtfHoldingDetails(borrowUiFactory.imageLoader, investingEtfHoldingDetailsViewModel, function14, null, (Composer) obj3, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    Composer composer4 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    amountPickerViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalCashVibratorKt.getLocalCashVibrator().defaultProvidedValue$runtime(borrowUiFactory.vibrator), Expect_jvmKt.rememberComposableLambda(655982296, new FullTransferInViewKt$$ExternalSyntheticLambda1(amountPickerViewModel, function15, i14, r7 ? (byte) 1 : (byte) 0), composer4), composer4, 56);
                                    break;
                                default:
                                    InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel = (InvestingRecurringPurchaseReceiptViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    Composer composer5 = (Composer) obj3;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    investingRecurringPurchaseReceiptViewModel.getClass();
                                    function16.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        i12 = intValue5 | ((intValue5 & 8) == 0 ? ((GapComposer) composer5).changed(investingRecurringPurchaseReceiptViewModel) : ((GapComposer) composer5).changedInstance(investingRecurringPurchaseReceiptViewModel) ? 4 : 2);
                                    } else {
                                        i12 = intValue5;
                                    }
                                    if ((intValue5 & 48) == 0) {
                                        i12 |= ((GapComposer) composer5).changedInstance(function16) ? 32 : 16;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                    if (gapComposer4.shouldExecute(i12 & 1, (i12 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1324785964, new InvestingUiFactory$$ExternalSyntheticLambda10(investingRecurringPurchaseReceiptViewModel, function16), gapComposer4), gapComposer4, 56);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1799787658));
                }
                if ((investingScreens instanceof InvestingScreens.PerformanceScreens.PortfolioPerformanceScreen) || (investingScreens instanceof InvestingScreens.PerformanceScreens.StockPerformanceScreen)) {
                    return new UiFactory.ComposeUi(ComposableSingletons$InvestingUiFactoryKt.lambda$792714430);
                }
                if (investingScreens instanceof InvestingScreens.CategoryDetailScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.investing.components.inject.InvestingUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13 = i8;
                            int i14 = 4;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i13) {
                                case 0:
                                    InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    investingCryptoNewsViewModel.getClass();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i9 = intValue | (((GapComposer) composer).changed(investingCryptoNewsViewModel) ? 4 : 2);
                                    } else {
                                        i9 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i9 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1726091594, new InvestingNewsKt$$ExternalSyntheticLambda2(investingCryptoNewsViewModel, function1), gapComposer), gapComposer, 56);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    investingCategoryDetailViewModel.getClass();
                                    function12.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        i10 = intValue2 | ((intValue2 & 8) == 0 ? ((GapComposer) composer2).changed(investingCategoryDetailViewModel) : ((GapComposer) composer2).changedInstance(investingCategoryDetailViewModel) ? 4 : 2);
                                    } else {
                                        i10 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        i10 |= ((GapComposer) composer2).changedInstance(function12) ? 32 : 16;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(i10 & 1, (i10 & 147) != 146)) {
                                        InvestingCategoryDetailKt.InvestingCategoryDetail(investingCategoryDetailViewModel, function12, borrowUiFactory.imageLoader, gapComposer2, i10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    InvestingActivityHistoryViewModel investingActivityHistoryViewModel = (InvestingActivityHistoryViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    investingActivityHistoryViewModel.getClass();
                                    function13.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        i11 = intValue3 | (((GapComposer) composer3).changed(investingActivityHistoryViewModel) ? 4 : 2);
                                    } else {
                                        i11 = intValue3;
                                    }
                                    if ((intValue3 & 48) == 0) {
                                        i11 |= ((GapComposer) composer3).changedInstance(function13) ? 32 : 16;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        AnnotatedStringKtxKt.InvestingActivityHistory(borrowUiFactory.imageLoader, investingActivityHistoryViewModel, function13, null, gapComposer3, (i11 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel = (InvestingEtfHoldingDetailsViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    investingEtfHoldingDetailsViewModel.getClass();
                                    function14.getClass();
                                    InvestingEtfHoldingDetailsKt.InvestmentEtfHoldingDetails(borrowUiFactory.imageLoader, investingEtfHoldingDetailsViewModel, function14, null, (Composer) obj3, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    Composer composer4 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    amountPickerViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalCashVibratorKt.getLocalCashVibrator().defaultProvidedValue$runtime(borrowUiFactory.vibrator), Expect_jvmKt.rememberComposableLambda(655982296, new FullTransferInViewKt$$ExternalSyntheticLambda1(amountPickerViewModel, function15, i14, r7 ? (byte) 1 : (byte) 0), composer4), composer4, 56);
                                    break;
                                default:
                                    InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel = (InvestingRecurringPurchaseReceiptViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    Composer composer5 = (Composer) obj3;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    investingRecurringPurchaseReceiptViewModel.getClass();
                                    function16.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        i12 = intValue5 | ((intValue5 & 8) == 0 ? ((GapComposer) composer5).changed(investingRecurringPurchaseReceiptViewModel) : ((GapComposer) composer5).changedInstance(investingRecurringPurchaseReceiptViewModel) ? 4 : 2);
                                    } else {
                                        i12 = intValue5;
                                    }
                                    if ((intValue5 & 48) == 0) {
                                        i12 |= ((GapComposer) composer5).changedInstance(function16) ? 32 : 16;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                    if (gapComposer4.shouldExecute(i12 & 1, (i12 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1324785964, new InvestingUiFactory$$ExternalSyntheticLambda10(investingRecurringPurchaseReceiptViewModel, function16), gapComposer4), gapComposer4, 56);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1533777773));
                }
                if (investingScreens instanceof InvestingScreens.InvestingActivityHistoryScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.investing.components.inject.InvestingUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13 = i6;
                            int i14 = 4;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i13) {
                                case 0:
                                    InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    investingCryptoNewsViewModel.getClass();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i9 = intValue | (((GapComposer) composer).changed(investingCryptoNewsViewModel) ? 4 : 2);
                                    } else {
                                        i9 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i9 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1726091594, new InvestingNewsKt$$ExternalSyntheticLambda2(investingCryptoNewsViewModel, function1), gapComposer), gapComposer, 56);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    investingCategoryDetailViewModel.getClass();
                                    function12.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        i10 = intValue2 | ((intValue2 & 8) == 0 ? ((GapComposer) composer2).changed(investingCategoryDetailViewModel) : ((GapComposer) composer2).changedInstance(investingCategoryDetailViewModel) ? 4 : 2);
                                    } else {
                                        i10 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        i10 |= ((GapComposer) composer2).changedInstance(function12) ? 32 : 16;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(i10 & 1, (i10 & 147) != 146)) {
                                        InvestingCategoryDetailKt.InvestingCategoryDetail(investingCategoryDetailViewModel, function12, borrowUiFactory.imageLoader, gapComposer2, i10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    InvestingActivityHistoryViewModel investingActivityHistoryViewModel = (InvestingActivityHistoryViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    investingActivityHistoryViewModel.getClass();
                                    function13.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        i11 = intValue3 | (((GapComposer) composer3).changed(investingActivityHistoryViewModel) ? 4 : 2);
                                    } else {
                                        i11 = intValue3;
                                    }
                                    if ((intValue3 & 48) == 0) {
                                        i11 |= ((GapComposer) composer3).changedInstance(function13) ? 32 : 16;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        AnnotatedStringKtxKt.InvestingActivityHistory(borrowUiFactory.imageLoader, investingActivityHistoryViewModel, function13, null, gapComposer3, (i11 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel = (InvestingEtfHoldingDetailsViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    investingEtfHoldingDetailsViewModel.getClass();
                                    function14.getClass();
                                    InvestingEtfHoldingDetailsKt.InvestmentEtfHoldingDetails(borrowUiFactory.imageLoader, investingEtfHoldingDetailsViewModel, function14, null, (Composer) obj3, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    Composer composer4 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    amountPickerViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalCashVibratorKt.getLocalCashVibrator().defaultProvidedValue$runtime(borrowUiFactory.vibrator), Expect_jvmKt.rememberComposableLambda(655982296, new FullTransferInViewKt$$ExternalSyntheticLambda1(amountPickerViewModel, function15, i14, r7 ? (byte) 1 : (byte) 0), composer4), composer4, 56);
                                    break;
                                default:
                                    InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel = (InvestingRecurringPurchaseReceiptViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    Composer composer5 = (Composer) obj3;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    investingRecurringPurchaseReceiptViewModel.getClass();
                                    function16.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        i12 = intValue5 | ((intValue5 & 8) == 0 ? ((GapComposer) composer5).changed(investingRecurringPurchaseReceiptViewModel) : ((GapComposer) composer5).changedInstance(investingRecurringPurchaseReceiptViewModel) ? 4 : 2);
                                    } else {
                                        i12 = intValue5;
                                    }
                                    if ((intValue5 & 48) == 0) {
                                        i12 |= ((GapComposer) composer5).changedInstance(function16) ? 32 : 16;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                    if (gapComposer4.shouldExecute(i12 & 1, (i12 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1324785964, new InvestingUiFactory$$ExternalSyntheticLambda10(investingRecurringPurchaseReceiptViewModel, function16), gapComposer4), gapComposer4, 56);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1553683230));
                }
                if (investingScreens instanceof InvestingScreens.EtfHoldingsDetailsScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.investing.components.inject.InvestingUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13 = i5;
                            int i14 = 4;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i13) {
                                case 0:
                                    InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    investingCryptoNewsViewModel.getClass();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i9 = intValue | (((GapComposer) composer).changed(investingCryptoNewsViewModel) ? 4 : 2);
                                    } else {
                                        i9 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i9 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1726091594, new InvestingNewsKt$$ExternalSyntheticLambda2(investingCryptoNewsViewModel, function1), gapComposer), gapComposer, 56);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    investingCategoryDetailViewModel.getClass();
                                    function12.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        i10 = intValue2 | ((intValue2 & 8) == 0 ? ((GapComposer) composer2).changed(investingCategoryDetailViewModel) : ((GapComposer) composer2).changedInstance(investingCategoryDetailViewModel) ? 4 : 2);
                                    } else {
                                        i10 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        i10 |= ((GapComposer) composer2).changedInstance(function12) ? 32 : 16;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(i10 & 1, (i10 & 147) != 146)) {
                                        InvestingCategoryDetailKt.InvestingCategoryDetail(investingCategoryDetailViewModel, function12, borrowUiFactory.imageLoader, gapComposer2, i10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    InvestingActivityHistoryViewModel investingActivityHistoryViewModel = (InvestingActivityHistoryViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    investingActivityHistoryViewModel.getClass();
                                    function13.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        i11 = intValue3 | (((GapComposer) composer3).changed(investingActivityHistoryViewModel) ? 4 : 2);
                                    } else {
                                        i11 = intValue3;
                                    }
                                    if ((intValue3 & 48) == 0) {
                                        i11 |= ((GapComposer) composer3).changedInstance(function13) ? 32 : 16;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        AnnotatedStringKtxKt.InvestingActivityHistory(borrowUiFactory.imageLoader, investingActivityHistoryViewModel, function13, null, gapComposer3, (i11 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel = (InvestingEtfHoldingDetailsViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    investingEtfHoldingDetailsViewModel.getClass();
                                    function14.getClass();
                                    InvestingEtfHoldingDetailsKt.InvestmentEtfHoldingDetails(borrowUiFactory.imageLoader, investingEtfHoldingDetailsViewModel, function14, null, (Composer) obj3, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    Composer composer4 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    amountPickerViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalCashVibratorKt.getLocalCashVibrator().defaultProvidedValue$runtime(borrowUiFactory.vibrator), Expect_jvmKt.rememberComposableLambda(655982296, new FullTransferInViewKt$$ExternalSyntheticLambda1(amountPickerViewModel, function15, i14, r7 ? (byte) 1 : (byte) 0), composer4), composer4, 56);
                                    break;
                                default:
                                    InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel = (InvestingRecurringPurchaseReceiptViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    Composer composer5 = (Composer) obj3;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    investingRecurringPurchaseReceiptViewModel.getClass();
                                    function16.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        i12 = intValue5 | ((intValue5 & 8) == 0 ? ((GapComposer) composer5).changed(investingRecurringPurchaseReceiptViewModel) : ((GapComposer) composer5).changedInstance(investingRecurringPurchaseReceiptViewModel) ? 4 : 2);
                                    } else {
                                        i12 = intValue5;
                                    }
                                    if ((intValue5 & 48) == 0) {
                                        i12 |= ((GapComposer) composer5).changedInstance(function16) ? 32 : 16;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                    if (gapComposer4.shouldExecute(i12 & 1, (i12 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1324785964, new InvestingUiFactory$$ExternalSyntheticLambda10(investingRecurringPurchaseReceiptViewModel, function16), gapComposer4), gapComposer4, 56);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -781008942));
                }
                if (investingScreens instanceof InvestingScreens.KeyStatsDetailsScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$InvestingUiFactoryKt.f451lambda$1223571609);
                }
                if (investingScreens instanceof InvestingScreens.InvestingCategoryFilterScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$InvestingUiFactoryKt.lambda$1775204304);
                }
                if (investingScreens instanceof InvestingScreens.CustomSharePriceScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.investing.components.inject.InvestingUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13 = i4;
                            int i14 = 4;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i13) {
                                case 0:
                                    InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    investingCryptoNewsViewModel.getClass();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i9 = intValue | (((GapComposer) composer).changed(investingCryptoNewsViewModel) ? 4 : 2);
                                    } else {
                                        i9 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i9 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1726091594, new InvestingNewsKt$$ExternalSyntheticLambda2(investingCryptoNewsViewModel, function1), gapComposer), gapComposer, 56);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    investingCategoryDetailViewModel.getClass();
                                    function12.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        i10 = intValue2 | ((intValue2 & 8) == 0 ? ((GapComposer) composer2).changed(investingCategoryDetailViewModel) : ((GapComposer) composer2).changedInstance(investingCategoryDetailViewModel) ? 4 : 2);
                                    } else {
                                        i10 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        i10 |= ((GapComposer) composer2).changedInstance(function12) ? 32 : 16;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(i10 & 1, (i10 & 147) != 146)) {
                                        InvestingCategoryDetailKt.InvestingCategoryDetail(investingCategoryDetailViewModel, function12, borrowUiFactory.imageLoader, gapComposer2, i10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    InvestingActivityHistoryViewModel investingActivityHistoryViewModel = (InvestingActivityHistoryViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    investingActivityHistoryViewModel.getClass();
                                    function13.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        i11 = intValue3 | (((GapComposer) composer3).changed(investingActivityHistoryViewModel) ? 4 : 2);
                                    } else {
                                        i11 = intValue3;
                                    }
                                    if ((intValue3 & 48) == 0) {
                                        i11 |= ((GapComposer) composer3).changedInstance(function13) ? 32 : 16;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        AnnotatedStringKtxKt.InvestingActivityHistory(borrowUiFactory.imageLoader, investingActivityHistoryViewModel, function13, null, gapComposer3, (i11 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel = (InvestingEtfHoldingDetailsViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    investingEtfHoldingDetailsViewModel.getClass();
                                    function14.getClass();
                                    InvestingEtfHoldingDetailsKt.InvestmentEtfHoldingDetails(borrowUiFactory.imageLoader, investingEtfHoldingDetailsViewModel, function14, null, (Composer) obj3, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    Composer composer4 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    amountPickerViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalCashVibratorKt.getLocalCashVibrator().defaultProvidedValue$runtime(borrowUiFactory.vibrator), Expect_jvmKt.rememberComposableLambda(655982296, new FullTransferInViewKt$$ExternalSyntheticLambda1(amountPickerViewModel, function15, i14, r7 ? (byte) 1 : (byte) 0), composer4), composer4, 56);
                                    break;
                                default:
                                    InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel = (InvestingRecurringPurchaseReceiptViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    Composer composer5 = (Composer) obj3;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    investingRecurringPurchaseReceiptViewModel.getClass();
                                    function16.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        i12 = intValue5 | ((intValue5 & 8) == 0 ? ((GapComposer) composer5).changed(investingRecurringPurchaseReceiptViewModel) : ((GapComposer) composer5).changedInstance(investingRecurringPurchaseReceiptViewModel) ? 4 : 2);
                                    } else {
                                        i12 = intValue5;
                                    }
                                    if ((intValue5 & 48) == 0) {
                                        i12 |= ((GapComposer) composer5).changedInstance(function16) ? 32 : 16;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                    if (gapComposer4.shouldExecute(i12 & 1, (i12 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1324785964, new InvestingUiFactory$$ExternalSyntheticLambda10(investingRecurringPurchaseReceiptViewModel, function16), gapComposer4), gapComposer4, 56);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1443689960));
                }
                if (investingScreens instanceof InvestingScreens.CustomOrderScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new BlockersUiFactory$$ExternalSyntheticLambda1(i2, this, (InvestingScreens.CustomOrderScreen) investingScreens), true, 1127961841));
                }
                if (investingScreens instanceof InvestingScreens.MoreInfoSheet) {
                    return new UiFactory.ComposeUi(ComposableSingletons$InvestingUiFactoryKt.lambda$94056654);
                }
                if (investingScreens instanceof InvestingScreens.InvestingPeriodSelectionScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$InvestingUiFactoryKt.f454lambda$758391185);
                }
                if (investingScreens instanceof InvestingScreens.RecurringPurchaseReceipt) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.investing.components.inject.InvestingUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9;
                            int i10;
                            int i11;
                            int i12;
                            int i13 = i3;
                            int i14 = 4;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i13) {
                                case 0:
                                    InvestingCryptoNewsViewModel investingCryptoNewsViewModel = (InvestingCryptoNewsViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    Composer composer = (Composer) obj3;
                                    int intValue = ((Integer) obj4).intValue();
                                    investingCryptoNewsViewModel.getClass();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i9 = intValue | (((GapComposer) composer).changed(investingCryptoNewsViewModel) ? 4 : 2);
                                    } else {
                                        i9 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i9 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i9 & 1, (i9 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1726091594, new InvestingNewsKt$$ExternalSyntheticLambda2(investingCryptoNewsViewModel, function1), gapComposer), gapComposer, 56);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    InvestingCategoryDetailViewModel investingCategoryDetailViewModel = (InvestingCategoryDetailViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    Composer composer2 = (Composer) obj3;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    investingCategoryDetailViewModel.getClass();
                                    function12.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        i10 = intValue2 | ((intValue2 & 8) == 0 ? ((GapComposer) composer2).changed(investingCategoryDetailViewModel) : ((GapComposer) composer2).changedInstance(investingCategoryDetailViewModel) ? 4 : 2);
                                    } else {
                                        i10 = intValue2;
                                    }
                                    if ((intValue2 & 48) == 0) {
                                        i10 |= ((GapComposer) composer2).changedInstance(function12) ? 32 : 16;
                                    }
                                    GapComposer gapComposer2 = (GapComposer) composer2;
                                    if (gapComposer2.shouldExecute(i10 & 1, (i10 & 147) != 146)) {
                                        InvestingCategoryDetailKt.InvestingCategoryDetail(investingCategoryDetailViewModel, function12, borrowUiFactory.imageLoader, gapComposer2, i10 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    } else {
                                        gapComposer2.skipToGroupEnd();
                                    }
                                    break;
                                case 2:
                                    InvestingActivityHistoryViewModel investingActivityHistoryViewModel = (InvestingActivityHistoryViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    Composer composer3 = (Composer) obj3;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    investingActivityHistoryViewModel.getClass();
                                    function13.getClass();
                                    if ((intValue3 & 6) == 0) {
                                        i11 = intValue3 | (((GapComposer) composer3).changed(investingActivityHistoryViewModel) ? 4 : 2);
                                    } else {
                                        i11 = intValue3;
                                    }
                                    if ((intValue3 & 48) == 0) {
                                        i11 |= ((GapComposer) composer3).changedInstance(function13) ? 32 : 16;
                                    }
                                    GapComposer gapComposer3 = (GapComposer) composer3;
                                    if (gapComposer3.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        AnnotatedStringKtxKt.InvestingActivityHistory(borrowUiFactory.imageLoader, investingActivityHistoryViewModel, function13, null, gapComposer3, (i11 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    } else {
                                        gapComposer3.skipToGroupEnd();
                                    }
                                    break;
                                case 3:
                                    InvestingEtfHoldingDetailsViewModel investingEtfHoldingDetailsViewModel = (InvestingEtfHoldingDetailsViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    investingEtfHoldingDetailsViewModel.getClass();
                                    function14.getClass();
                                    InvestingEtfHoldingDetailsKt.InvestmentEtfHoldingDetails(borrowUiFactory.imageLoader, investingEtfHoldingDetailsViewModel, function14, null, (Composer) obj3, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    Composer composer4 = (Composer) obj3;
                                    ((Integer) obj4).getClass();
                                    amountPickerViewModel.getClass();
                                    function15.getClass();
                                    Updater.CompositionLocalProvider(LocalCashVibratorKt.getLocalCashVibrator().defaultProvidedValue$runtime(borrowUiFactory.vibrator), Expect_jvmKt.rememberComposableLambda(655982296, new FullTransferInViewKt$$ExternalSyntheticLambda1(amountPickerViewModel, function15, i14, r7 ? (byte) 1 : (byte) 0), composer4), composer4, 56);
                                    break;
                                default:
                                    InvestingRecurringPurchaseReceiptViewModel investingRecurringPurchaseReceiptViewModel = (InvestingRecurringPurchaseReceiptViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    Composer composer5 = (Composer) obj3;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    investingRecurringPurchaseReceiptViewModel.getClass();
                                    function16.getClass();
                                    if ((intValue5 & 6) == 0) {
                                        i12 = intValue5 | ((intValue5 & 8) == 0 ? ((GapComposer) composer5).changed(investingRecurringPurchaseReceiptViewModel) : ((GapComposer) composer5).changedInstance(investingRecurringPurchaseReceiptViewModel) ? 4 : 2);
                                    } else {
                                        i12 = intValue5;
                                    }
                                    if ((intValue5 & 48) == 0) {
                                        i12 |= ((GapComposer) composer5).changedInstance(function16) ? 32 : 16;
                                    }
                                    GapComposer gapComposer4 = (GapComposer) composer5;
                                    if (gapComposer4.shouldExecute(i12 & 1, (i12 & 147) != 146)) {
                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(borrowUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1324785964, new InvestingUiFactory$$ExternalSyntheticLambda10(investingRecurringPurchaseReceiptViewModel, function16), gapComposer4), gapComposer4, 56);
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1280557972));
                }
                if (investingScreens instanceof InvestingScreens.OrderTypeSelectionScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$InvestingUiFactoryKt.f452lambda$1544071529);
                }
                if (investingScreens instanceof InvestingScreens.RecurringFrequencyPickerFullScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$InvestingUiFactoryKt.f453lambda$1655764031);
                }
                return null;
            case 4:
                if (screen instanceof PoolsListScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.pools.views.PoolsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9 = i7;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    PoolsListViewModel poolsListViewModel = (PoolsListViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    poolsListViewModel.getClass();
                                    function1.getClass();
                                    PoolToastKt.PoolsListView(poolsListViewModel, function1, borrowUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    StartPoolViewModel startPoolViewModel = (StartPoolViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    startPoolViewModel.getClass();
                                    function12.getClass();
                                    StartPoolAmountKt.StartPoolComposer(startPoolViewModel, function12, borrowUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    PoolDetailsViewModel poolDetailsViewModel = (PoolDetailsViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    poolDetailsViewModel.getClass();
                                    function13.getClass();
                                    PoolToastKt.PoolDetailsView(function13, poolDetailsViewModel, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, (Composer) obj3, ((intValue3 >> 3) & 14) | ((intValue3 << 3) & 112));
                                    break;
                                case 3:
                                    PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    poolContributeWithNoteViewModel.getClass();
                                    function14.getClass();
                                    PoolToastKt.PoolContributeComposer(poolContributeWithNoteViewModel, function14, borrowUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 4:
                                    PoolInvitePeopleListViewModel poolInvitePeopleListViewModel = (PoolInvitePeopleListViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    poolInvitePeopleListViewModel.getClass();
                                    function15.getClass();
                                    PoolToastKt.PoolInvitePeopleListView(function15, null, poolInvitePeopleListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue5 >> 3) & 14) | ((intValue5 << 6) & 896));
                                    break;
                                default:
                                    PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    int intValue6 = ((Integer) obj4).intValue();
                                    poolMemberListViewModel.getClass();
                                    function16.getClass();
                                    PoolToastKt.PoolMemberListView(function16, poolMemberListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue6 << 3) & 112) | ((intValue6 >> 3) & 14));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1435414327));
                }
                if (screen instanceof StartPoolScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.pools.views.PoolsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9 = i8;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    PoolsListViewModel poolsListViewModel = (PoolsListViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    poolsListViewModel.getClass();
                                    function1.getClass();
                                    PoolToastKt.PoolsListView(poolsListViewModel, function1, borrowUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    StartPoolViewModel startPoolViewModel = (StartPoolViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    startPoolViewModel.getClass();
                                    function12.getClass();
                                    StartPoolAmountKt.StartPoolComposer(startPoolViewModel, function12, borrowUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    PoolDetailsViewModel poolDetailsViewModel = (PoolDetailsViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    poolDetailsViewModel.getClass();
                                    function13.getClass();
                                    PoolToastKt.PoolDetailsView(function13, poolDetailsViewModel, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, (Composer) obj3, ((intValue3 >> 3) & 14) | ((intValue3 << 3) & 112));
                                    break;
                                case 3:
                                    PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    poolContributeWithNoteViewModel.getClass();
                                    function14.getClass();
                                    PoolToastKt.PoolContributeComposer(poolContributeWithNoteViewModel, function14, borrowUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 4:
                                    PoolInvitePeopleListViewModel poolInvitePeopleListViewModel = (PoolInvitePeopleListViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    poolInvitePeopleListViewModel.getClass();
                                    function15.getClass();
                                    PoolToastKt.PoolInvitePeopleListView(function15, null, poolInvitePeopleListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue5 >> 3) & 14) | ((intValue5 << 6) & 896));
                                    break;
                                default:
                                    PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    int intValue6 = ((Integer) obj4).intValue();
                                    poolMemberListViewModel.getClass();
                                    function16.getClass();
                                    PoolToastKt.PoolMemberListView(function16, poolMemberListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue6 << 3) & 112) | ((intValue6 >> 3) & 14));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -692952041));
                }
                if (screen instanceof PoolDetailsScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.pools.views.PoolsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9 = i6;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    PoolsListViewModel poolsListViewModel = (PoolsListViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    poolsListViewModel.getClass();
                                    function1.getClass();
                                    PoolToastKt.PoolsListView(poolsListViewModel, function1, borrowUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    StartPoolViewModel startPoolViewModel = (StartPoolViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    startPoolViewModel.getClass();
                                    function12.getClass();
                                    StartPoolAmountKt.StartPoolComposer(startPoolViewModel, function12, borrowUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    PoolDetailsViewModel poolDetailsViewModel = (PoolDetailsViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    poolDetailsViewModel.getClass();
                                    function13.getClass();
                                    PoolToastKt.PoolDetailsView(function13, poolDetailsViewModel, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, (Composer) obj3, ((intValue3 >> 3) & 14) | ((intValue3 << 3) & 112));
                                    break;
                                case 3:
                                    PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    poolContributeWithNoteViewModel.getClass();
                                    function14.getClass();
                                    PoolToastKt.PoolContributeComposer(poolContributeWithNoteViewModel, function14, borrowUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 4:
                                    PoolInvitePeopleListViewModel poolInvitePeopleListViewModel = (PoolInvitePeopleListViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    poolInvitePeopleListViewModel.getClass();
                                    function15.getClass();
                                    PoolToastKt.PoolInvitePeopleListView(function15, null, poolInvitePeopleListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue5 >> 3) & 14) | ((intValue5 << 6) & 896));
                                    break;
                                default:
                                    PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    int intValue6 = ((Integer) obj4).intValue();
                                    poolMemberListViewModel.getClass();
                                    function16.getClass();
                                    PoolToastKt.PoolMemberListView(function16, poolMemberListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue6 << 3) & 112) | ((intValue6 >> 3) & 14));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -158030160));
                }
                if (screen instanceof PoolContributeScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.pools.views.PoolsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9 = i5;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    PoolsListViewModel poolsListViewModel = (PoolsListViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    poolsListViewModel.getClass();
                                    function1.getClass();
                                    PoolToastKt.PoolsListView(poolsListViewModel, function1, borrowUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    StartPoolViewModel startPoolViewModel = (StartPoolViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    startPoolViewModel.getClass();
                                    function12.getClass();
                                    StartPoolAmountKt.StartPoolComposer(startPoolViewModel, function12, borrowUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    PoolDetailsViewModel poolDetailsViewModel = (PoolDetailsViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    poolDetailsViewModel.getClass();
                                    function13.getClass();
                                    PoolToastKt.PoolDetailsView(function13, poolDetailsViewModel, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, (Composer) obj3, ((intValue3 >> 3) & 14) | ((intValue3 << 3) & 112));
                                    break;
                                case 3:
                                    PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    poolContributeWithNoteViewModel.getClass();
                                    function14.getClass();
                                    PoolToastKt.PoolContributeComposer(poolContributeWithNoteViewModel, function14, borrowUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 4:
                                    PoolInvitePeopleListViewModel poolInvitePeopleListViewModel = (PoolInvitePeopleListViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    poolInvitePeopleListViewModel.getClass();
                                    function15.getClass();
                                    PoolToastKt.PoolInvitePeopleListView(function15, null, poolInvitePeopleListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue5 >> 3) & 14) | ((intValue5 << 6) & 896));
                                    break;
                                default:
                                    PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    int intValue6 = ((Integer) obj4).intValue();
                                    poolMemberListViewModel.getClass();
                                    function16.getClass();
                                    PoolToastKt.PoolMemberListView(function16, poolMemberListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue6 << 3) & 112) | ((intValue6 >> 3) & 14));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 2070232800));
                }
                if (screen instanceof PoolInvitePeopleListScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.pools.views.PoolsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9 = i4;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    PoolsListViewModel poolsListViewModel = (PoolsListViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    poolsListViewModel.getClass();
                                    function1.getClass();
                                    PoolToastKt.PoolsListView(poolsListViewModel, function1, borrowUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    StartPoolViewModel startPoolViewModel = (StartPoolViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    startPoolViewModel.getClass();
                                    function12.getClass();
                                    StartPoolAmountKt.StartPoolComposer(startPoolViewModel, function12, borrowUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    PoolDetailsViewModel poolDetailsViewModel = (PoolDetailsViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    poolDetailsViewModel.getClass();
                                    function13.getClass();
                                    PoolToastKt.PoolDetailsView(function13, poolDetailsViewModel, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, (Composer) obj3, ((intValue3 >> 3) & 14) | ((intValue3 << 3) & 112));
                                    break;
                                case 3:
                                    PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    poolContributeWithNoteViewModel.getClass();
                                    function14.getClass();
                                    PoolToastKt.PoolContributeComposer(poolContributeWithNoteViewModel, function14, borrowUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 4:
                                    PoolInvitePeopleListViewModel poolInvitePeopleListViewModel = (PoolInvitePeopleListViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    poolInvitePeopleListViewModel.getClass();
                                    function15.getClass();
                                    PoolToastKt.PoolInvitePeopleListView(function15, null, poolInvitePeopleListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue5 >> 3) & 14) | ((intValue5 << 6) & 896));
                                    break;
                                default:
                                    PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    int intValue6 = ((Integer) obj4).intValue();
                                    poolMemberListViewModel.getClass();
                                    function16.getClass();
                                    PoolToastKt.PoolMemberListView(function16, poolMemberListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue6 << 3) & 112) | ((intValue6 >> 3) & 14));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -831238864));
                }
                if (screen instanceof PoolMoreOptionsBottomSheet) {
                    return new UiFactory.ComposeUi(PoolToastKt.lambda$1447243356);
                }
                if (screen instanceof PoolMemberListScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.pools.views.PoolsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9 = i3;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    PoolsListViewModel poolsListViewModel = (PoolsListViewModel) obj;
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    poolsListViewModel.getClass();
                                    function1.getClass();
                                    PoolToastKt.PoolsListView(poolsListViewModel, function1, borrowUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    StartPoolViewModel startPoolViewModel = (StartPoolViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    startPoolViewModel.getClass();
                                    function12.getClass();
                                    StartPoolAmountKt.StartPoolComposer(startPoolViewModel, function12, borrowUiFactory.imageLoader, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 2:
                                    PoolDetailsViewModel poolDetailsViewModel = (PoolDetailsViewModel) obj;
                                    Function1 function13 = (Function1) obj2;
                                    int intValue3 = ((Integer) obj4).intValue();
                                    poolDetailsViewModel.getClass();
                                    function13.getClass();
                                    PoolToastKt.PoolDetailsView(function13, poolDetailsViewModel, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, (Composer) obj3, ((intValue3 >> 3) & 14) | ((intValue3 << 3) & 112));
                                    break;
                                case 3:
                                    PoolContributeWithNoteViewModel poolContributeWithNoteViewModel = (PoolContributeWithNoteViewModel) obj;
                                    Function1 function14 = (Function1) obj2;
                                    int intValue4 = ((Integer) obj4).intValue();
                                    poolContributeWithNoteViewModel.getClass();
                                    function14.getClass();
                                    PoolToastKt.PoolContributeComposer(poolContributeWithNoteViewModel, function14, borrowUiFactory.imageLoader, (Composer) obj3, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 4:
                                    PoolInvitePeopleListViewModel poolInvitePeopleListViewModel = (PoolInvitePeopleListViewModel) obj;
                                    Function1 function15 = (Function1) obj2;
                                    int intValue5 = ((Integer) obj4).intValue();
                                    poolInvitePeopleListViewModel.getClass();
                                    function15.getClass();
                                    PoolToastKt.PoolInvitePeopleListView(function15, null, poolInvitePeopleListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue5 >> 3) & 14) | ((intValue5 << 6) & 896));
                                    break;
                                default:
                                    PoolMemberListViewModel poolMemberListViewModel = (PoolMemberListViewModel) obj;
                                    Function1 function16 = (Function1) obj2;
                                    int intValue6 = ((Integer) obj4).intValue();
                                    poolMemberListViewModel.getClass();
                                    function16.getClass();
                                    PoolToastKt.PoolMemberListView(function16, poolMemberListViewModel, borrowUiFactory.imageLoader, (Composer) obj3, ((intValue6 << 3) & 112) | ((intValue6 >> 3) & 14));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1265458672));
                }
                return null;
            default:
                SavingsScreen savingsScreen = screen instanceof SavingsScreen ? (SavingsScreen) screen : null;
                if (savingsScreen instanceof GeneralSavingsScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.savings.views.inject.SavingsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9 = i7;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    function1.getClass();
                                    SavingsScreenViewKt.SavingsScreenView((SavingsScreenViewModel) obj, function1, borrowUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    FullScreenActivityViewModel fullScreenActivityViewModel = (FullScreenActivityViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    fullScreenActivityViewModel.getClass();
                                    function12.getClass();
                                    AvatarsKt.FullScreenActivityView(fullScreenActivityViewModel, function12, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1641776680));
                }
                if (savingsScreen instanceof TransferInScreen.Condensed) {
                    return new UiFactory.ComposeUi(ComposableSingletons$SavingsUiFactoryKt.f650lambda$173359656);
                }
                if (savingsScreen instanceof SavingsFullActivityScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.savings.views.inject.SavingsUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BorrowUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                            int i9 = i8;
                            BorrowUiFactory borrowUiFactory = this.f$0;
                            switch (i9) {
                                case 0:
                                    Function1 function1 = (Function1) obj2;
                                    int intValue = ((Integer) obj4).intValue();
                                    function1.getClass();
                                    SavingsScreenViewKt.SavingsScreenView((SavingsScreenViewModel) obj, function1, borrowUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    FullScreenActivityViewModel fullScreenActivityViewModel = (FullScreenActivityViewModel) obj;
                                    Function1 function12 = (Function1) obj2;
                                    int intValue2 = ((Integer) obj4).intValue();
                                    fullScreenActivityViewModel.getClass();
                                    function12.getClass();
                                    AvatarsKt.FullScreenActivityView(fullScreenActivityViewModel, function12, borrowUiFactory.imageLoader, borrowUiFactory.vibrator, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 457630587));
                }
                if (savingsScreen instanceof TransferProcessingScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$SavingsUiFactoryKt.f651lambda$769875477);
                }
                if (savingsScreen instanceof SavingsCardSheet) {
                    return new UiFactory.ComposeUi(ComposableSingletons$SavingsUiFactoryKt.f652lambda$863017337);
                }
                if (savingsScreen instanceof SavingsRouteInterstitialScreen) {
                    return new UiFactory.ComposeUi(ComposableSingletons$SavingsUiFactoryKt.lambda$1462395654);
                }
                if (savingsScreen instanceof TransferInScreen.Full) {
                    return new UiFactory.ComposeUi(ComposableSingletons$SavingsUiFactoryKt.lambda$672359219);
                }
                if (savingsScreen instanceof TransferOutScreen$Full) {
                    return new UiFactory.ComposeUi(ComposableSingletons$SavingsUiFactoryKt.lambda$841502994);
                }
                if (savingsScreen == null) {
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
        }
    }
}
