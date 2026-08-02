package com.squareup.cash.borrow.presenters;

import android.os.Build;
import androidx.emoji2.text.MetadataRepo;
import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.cdp.persistence.repository.PersistedEventRepository;
import app.cash.inputfieldtext.saver.RealInputFieldTextSaver;
import app.cash.local.presenters.LocalCashBalancePresenter;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import coil3.ComponentRegistry;
import coil3.ImageLoader$Builder;
import com.bugsnag.android.DeviceBuildInfo;
import com.google.android.gms.internal.measurement.zzlj;
import com.google.mlkit.vision.common.zzb;
import com.google.zxing.Result;
import com.nimbusds.jose.JWECryptoParts;
import com.squareup.cash.account.presenters.settings.PersonalSetting;
import com.squareup.cash.activity.backend.loader.ActivitiesManager;
import com.squareup.cash.activity.presenters.RealActivityEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.backend.AfterpayEligibleRetroTransactionsProvider;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletAnalytics;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletMerchantSheetRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayAppletRepository;
import com.squareup.cash.afterpayapplet.backend.real.RealAfterpayMerchantRepo;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletActivityListEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomeMapper;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletInfoPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletMerchantSheetPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletNotificationPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPageRequestHandler$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletRetroOrderSelectionPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletUpsellSheetPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$MetroFactory;
import com.squareup.cash.afterpayapplet.presenters.OrderItemEventHandler$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.SelectAfterpayPromptPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletHomeScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletInfoSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletNotificationScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletPurchasesScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen;
import com.squareup.cash.afterpayapplet.screens.AfterpayAppletScreen$AfterpaySearchScreen;
import com.squareup.cash.banking.real.RealDisclosureProvider;
import com.squareup.cash.blockers.presenters.BlockerImageUploader$MetroFactory;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.GetFlowLoadingPresenter$MetroFactory;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.borrow.backend.RealBorrowDataManager;
import com.squareup.cash.borrow.presenters.BorrowHomePresenter;
import com.squareup.cash.borrow.presenters.LoanAmountPickerPresenter;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.borrow.screens.BorrowHomeAmountPickerSheet;
import com.squareup.cash.borrow.screens.BorrowHomeOverlay;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.cash.borrow.screens.ExpandedLoanHistory;
import com.squareup.cash.borrow.screens.LoanAmountPicker;
import com.squareup.cash.borrow.screens.RepayCustomAmountPicker;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.checks.CaptureCheckFacePresenter;
import com.squareup.cash.checks.CheckDepositAmountPresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.accessibility.AndroidAccessibilityManager;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.profile.RealProfileManager;
import com.squareup.cash.db2.OfflineConfig;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditCompanyNamePresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditFullNamePresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditPaycheckAllocationPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositEditPaycheckPercentagePresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositManualFormCompletionPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositManualFormDetailsPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositSetupPresenter$Factory$Impl;
import com.squareup.cash.directdeposit.presenters.DirectDepositUpdateManualFormDetailsPresenter$Factory$Impl;
import com.squareup.cash.earnings.backend.real.RealEarningsChartRepository$MetroFactory;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.fileupload.real.RealFileValidator$Factory$Impl;
import com.squareup.cash.fileupload.real.RealImageFormatConverter$Factory$Impl;
import com.squareup.cash.google.pay.RealGooglePayer;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.invitations.InviteErrorPresenter;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.views.MusicViewFactory$MetroFactory;
import com.squareup.cash.notifications.AndroidNotificationManager;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.paychecks.presenters.CustomAllocationPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.DistributePaycheckPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.EditDistributionPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$MetroFactory;
import com.squareup.cash.paychecks.presenters.MultipleAllocationPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaycheckAggregationReceiptPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaycheckAlertDialogPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaycheckReceiptPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaychecksActivityFeedProducer;
import com.squareup.cash.paychecks.presenters.PaychecksActivityListPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaychecksHomePresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.util.RealPaycheckSettlementDateFormatter;
import com.squareup.cash.paychecks.screens.CustomAllocationScreen;
import com.squareup.cash.paychecks.screens.DistributePaycheckScreen;
import com.squareup.cash.paychecks.screens.EditDistributionScreen;
import com.squareup.cash.paychecks.screens.HelpSheetScreen;
import com.squareup.cash.paychecks.screens.PaycheckActivityListScreen;
import com.squareup.cash.paychecks.screens.PaycheckAggregationReceiptScreen;
import com.squareup.cash.paychecks.screens.PaycheckAlertDialogScreen;
import com.squareup.cash.paychecks.screens.PaycheckReceiptScreen;
import com.squareup.cash.paychecks.screens.PaychecksHomeScreen;
import com.squareup.cash.paychecks.screens.PaychecksScreen;
import com.squareup.cash.paychecks.screens.SetPaycheckMultipleAllocationScreen;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.pools.presenters.PoolDetailsPresenter$MetroFactory;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.prepurchasecashcard.backend.RealPrepurchaseToggleManager;
import com.squareup.cash.resource.AndroidDateFormatManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.presenters.TransferInPresenter$MetroFactory;
import com.squareup.cash.savings.presenters.TransferringPresenter$MetroFactory;
import com.squareup.cash.securityhub.presenters.SecurityHubPresenter$MetroFactory;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.shopping.presenters.ShoppingPresenterFactory;
import com.squareup.cash.storage.RealFileDownloader;
import com.squareup.cash.support.chat.backend.real.RealChatManager;
import com.squareup.cash.support.chat.backend.real.RealChatNotificationSuppressor;
import com.squareup.cash.support.chat.backend.real.RealChatSurveyService;
import com.squareup.cash.support.chat.backend.real.RealConversationService;
import com.squareup.cash.support.chat.backend.real.SupportConversationPersistence;
import com.squareup.cash.support.chat.presenters.ChatExitPromptPresenter$Factory$Impl;
import com.squareup.cash.support.chat.presenters.ChatExitPromptSheetPresenter$Factory$Impl;
import com.squareup.cash.support.chat.presenters.ChatFailedDeliverySheetPresenter$Factory$Impl;
import com.squareup.cash.support.chat.presenters.ChatImageDetailPresenter$Factory$Impl;
import com.squareup.cash.support.chat.presenters.ChatImageDetailPresenter$MetroFactory;
import com.squareup.cash.support.chat.presenters.ChatLoadingPresenter$Factory$Impl;
import com.squareup.cash.support.chat.presenters.ChatPresenter;
import com.squareup.cash.support.chat.presenters.ChatPresenter$Factory$Impl;
import com.squareup.cash.support.chat.presenters.ChatStateMapper;
import com.squareup.cash.support.chat.presenters.ChatSurveyPresenter$Factory$Impl;
import com.squareup.cash.support.chat.presenters.ChatSurveyUnavailablePresenter$Factory$Impl;
import com.squareup.cash.support.chat.presenters.ChatTransactionPickerPresenter$Factory$Impl;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.tabs.presenters.TabToolbarPresenter;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.tax.presenters.TaxReturnsPresenter;
import com.squareup.cash.treehouse.activity.ActivityDataBridge;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.wallet.data.IssuedCardManager;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.wallet.presenters.RealCardCustomizationRepository;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.cash.work.session.RealCurrentUserSetter;
import com.squareup.protos.cash.activity.api.v1.ActivityClientService;
import com.squareup.protos.cash.api.Error;
import com.squareup.protos.cash.paychecks.api.v1.PaychecksAppService;
import com.squareup.protos.cash.supportal.app.SupportalAppService;
import com.squareup.protos.franklin.app.AppService;
import com.squareup.protos.franklin.lending.LendingAppService;
import com.squareup.scannerview.TextSetter;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import io.noties.markwon.MarkwonConfiguration;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes.dex */
public final class BorrowPresenterFactory implements PresenterFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object borrowAppletHome;
    public final Object borrowAppletHomeAmountPicker;
    public final Object borrowAppletOverlay;
    public final Object borrowLimitHub;
    public final Object expandedLoanHistoryList;
    public final Object firstTimeBorrow;
    public final Object loanAmountPicker;
    public final Object multiStepLoading;
    public final Object repayCustomAmountPicker;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory borrowAppletHome;
        public final InstanceFactory borrowAppletHomeAmountPicker;
        public final InstanceFactory borrowAppletOverlay;
        public final InstanceFactory borrowLimitHub;
        public final InstanceFactory expandedLoanHistoryList;
        public final InstanceFactory firstTimeBorrow;
        public final InstanceFactory loanAmountPicker;
        public final InstanceFactory multiStepLoading;
        public final InstanceFactory repayCustomAmountPicker;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, int i) {
            this.$r8$classId = i;
            this.borrowAppletHome = instanceFactory;
            this.borrowAppletHomeAmountPicker = instanceFactory2;
            this.borrowAppletOverlay = instanceFactory3;
            this.borrowLimitHub = instanceFactory4;
            this.expandedLoanHistoryList = instanceFactory5;
            this.firstTimeBorrow = instanceFactory6;
            this.multiStepLoading = instanceFactory7;
            this.loanAmountPicker = instanceFactory8;
            this.repayCustomAmountPicker = instanceFactory9;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            InstanceFactory instanceFactory = this.repayCustomAmountPicker;
            InstanceFactory instanceFactory2 = this.loanAmountPicker;
            InstanceFactory instanceFactory3 = this.multiStepLoading;
            InstanceFactory instanceFactory4 = this.firstTimeBorrow;
            InstanceFactory instanceFactory5 = this.expandedLoanHistoryList;
            InstanceFactory instanceFactory6 = this.borrowLimitHub;
            InstanceFactory instanceFactory7 = this.borrowAppletOverlay;
            InstanceFactory instanceFactory8 = this.borrowAppletHomeAmountPicker;
            InstanceFactory instanceFactory9 = this.borrowAppletHome;
            switch (i) {
                case 0:
                    BorrowHomePresenter$Factory$Impl borrowHomePresenter$Factory$Impl = (BorrowHomePresenter$Factory$Impl) instanceFactory9.value;
                    BorrowHomeAmountPickerPresenter$Factory$Impl borrowHomeAmountPickerPresenter$Factory$Impl = (BorrowHomeAmountPickerPresenter$Factory$Impl) instanceFactory8.value;
                    BorrowHomeOverlayPresenter$Factory$Impl borrowHomeOverlayPresenter$Factory$Impl = (BorrowHomeOverlayPresenter$Factory$Impl) instanceFactory7.value;
                    BorrowLimitHubPresenter$Factory$Impl borrowLimitHubPresenter$Factory$Impl = (BorrowLimitHubPresenter$Factory$Impl) instanceFactory6.value;
                    ExpandedLoanHistoryListPresenter$Factory$Impl expandedLoanHistoryListPresenter$Factory$Impl = (ExpandedLoanHistoryListPresenter$Factory$Impl) instanceFactory5.value;
                    CreditFirstTimeBorrowBlockerPresenter$Factory$Impl creditFirstTimeBorrowBlockerPresenter$Factory$Impl = (CreditFirstTimeBorrowBlockerPresenter$Factory$Impl) instanceFactory4.value;
                    CreditMultiStepLoadingBlockerPresenter$Factory$Impl creditMultiStepLoadingBlockerPresenter$Factory$Impl = (CreditMultiStepLoadingBlockerPresenter$Factory$Impl) instanceFactory3.value;
                    LoanAmountPickerPresenter$Factory$Impl loanAmountPickerPresenter$Factory$Impl = (LoanAmountPickerPresenter$Factory$Impl) instanceFactory2.value;
                    RepayCustomAmountPickerPresenter$Factory$Impl repayCustomAmountPickerPresenter$Factory$Impl = (RepayCustomAmountPickerPresenter$Factory$Impl) instanceFactory.value;
                    borrowHomePresenter$Factory$Impl.getClass();
                    borrowHomeAmountPickerPresenter$Factory$Impl.getClass();
                    borrowHomeOverlayPresenter$Factory$Impl.getClass();
                    borrowLimitHubPresenter$Factory$Impl.getClass();
                    expandedLoanHistoryListPresenter$Factory$Impl.getClass();
                    creditFirstTimeBorrowBlockerPresenter$Factory$Impl.getClass();
                    creditMultiStepLoadingBlockerPresenter$Factory$Impl.getClass();
                    loanAmountPickerPresenter$Factory$Impl.getClass();
                    repayCustomAmountPickerPresenter$Factory$Impl.getClass();
                    return new BorrowPresenterFactory(borrowHomePresenter$Factory$Impl, borrowHomeAmountPickerPresenter$Factory$Impl, borrowHomeOverlayPresenter$Factory$Impl, borrowLimitHubPresenter$Factory$Impl, expandedLoanHistoryListPresenter$Factory$Impl, creditFirstTimeBorrowBlockerPresenter$Factory$Impl, creditMultiStepLoadingBlockerPresenter$Factory$Impl, loanAmountPickerPresenter$Factory$Impl, repayCustomAmountPickerPresenter$Factory$Impl, 0);
                case 1:
                    DirectDepositSetupPresenter$Factory$Impl directDepositSetupPresenter$Factory$Impl = (DirectDepositSetupPresenter$Factory$Impl) instanceFactory9.value;
                    DirectDepositEditCompanyNamePresenter$Factory$Impl directDepositEditCompanyNamePresenter$Factory$Impl = (DirectDepositEditCompanyNamePresenter$Factory$Impl) instanceFactory8.value;
                    DirectDepositManualFormDetailsPresenter$Factory$Impl directDepositManualFormDetailsPresenter$Factory$Impl = (DirectDepositManualFormDetailsPresenter$Factory$Impl) instanceFactory7.value;
                    DirectDepositUpdateManualFormDetailsPresenter$Factory$Impl directDepositUpdateManualFormDetailsPresenter$Factory$Impl = (DirectDepositUpdateManualFormDetailsPresenter$Factory$Impl) instanceFactory6.value;
                    DirectDepositEditPaycheckAllocationPresenter$Factory$Impl directDepositEditPaycheckAllocationPresenter$Factory$Impl = (DirectDepositEditPaycheckAllocationPresenter$Factory$Impl) instanceFactory5.value;
                    DirectDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl directDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl = (DirectDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl) instanceFactory4.value;
                    DirectDepositEditPaycheckPercentagePresenter$Factory$Impl directDepositEditPaycheckPercentagePresenter$Factory$Impl = (DirectDepositEditPaycheckPercentagePresenter$Factory$Impl) instanceFactory3.value;
                    DirectDepositEditFullNamePresenter$Factory$Impl directDepositEditFullNamePresenter$Factory$Impl = (DirectDepositEditFullNamePresenter$Factory$Impl) instanceFactory2.value;
                    DirectDepositManualFormCompletionPresenter$Factory$Impl directDepositManualFormCompletionPresenter$Factory$Impl = (DirectDepositManualFormCompletionPresenter$Factory$Impl) instanceFactory.value;
                    directDepositSetupPresenter$Factory$Impl.getClass();
                    directDepositEditCompanyNamePresenter$Factory$Impl.getClass();
                    directDepositManualFormDetailsPresenter$Factory$Impl.getClass();
                    directDepositUpdateManualFormDetailsPresenter$Factory$Impl.getClass();
                    directDepositEditPaycheckAllocationPresenter$Factory$Impl.getClass();
                    directDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl.getClass();
                    directDepositEditPaycheckPercentagePresenter$Factory$Impl.getClass();
                    directDepositEditFullNamePresenter$Factory$Impl.getClass();
                    directDepositManualFormCompletionPresenter$Factory$Impl.getClass();
                    return new ShoppingPresenterFactory(directDepositSetupPresenter$Factory$Impl, directDepositEditCompanyNamePresenter$Factory$Impl, directDepositManualFormDetailsPresenter$Factory$Impl, directDepositUpdateManualFormDetailsPresenter$Factory$Impl, directDepositEditPaycheckAllocationPresenter$Factory$Impl, directDepositEditPaycheckCurrencyAllocationPresenter$Factory$Impl, directDepositEditPaycheckPercentagePresenter$Factory$Impl, directDepositEditFullNamePresenter$Factory$Impl, directDepositManualFormCompletionPresenter$Factory$Impl);
                default:
                    ChatPresenter$Factory$Impl chatPresenter$Factory$Impl = (ChatPresenter$Factory$Impl) instanceFactory9.value;
                    ChatLoadingPresenter$Factory$Impl chatLoadingPresenter$Factory$Impl = (ChatLoadingPresenter$Factory$Impl) instanceFactory8.value;
                    ChatFailedDeliverySheetPresenter$Factory$Impl chatFailedDeliverySheetPresenter$Factory$Impl = (ChatFailedDeliverySheetPresenter$Factory$Impl) instanceFactory7.value;
                    ChatTransactionPickerPresenter$Factory$Impl chatTransactionPickerPresenter$Factory$Impl = (ChatTransactionPickerPresenter$Factory$Impl) instanceFactory6.value;
                    ChatImageDetailPresenter$Factory$Impl chatImageDetailPresenter$Factory$Impl = (ChatImageDetailPresenter$Factory$Impl) instanceFactory5.value;
                    ChatSurveyUnavailablePresenter$Factory$Impl chatSurveyUnavailablePresenter$Factory$Impl = (ChatSurveyUnavailablePresenter$Factory$Impl) instanceFactory4.value;
                    ChatExitPromptPresenter$Factory$Impl chatExitPromptPresenter$Factory$Impl = (ChatExitPromptPresenter$Factory$Impl) instanceFactory3.value;
                    ChatExitPromptSheetPresenter$Factory$Impl chatExitPromptSheetPresenter$Factory$Impl = (ChatExitPromptSheetPresenter$Factory$Impl) instanceFactory2.value;
                    ChatSurveyPresenter$Factory$Impl chatSurveyPresenter$Factory$Impl = (ChatSurveyPresenter$Factory$Impl) instanceFactory.value;
                    chatPresenter$Factory$Impl.getClass();
                    chatLoadingPresenter$Factory$Impl.getClass();
                    chatFailedDeliverySheetPresenter$Factory$Impl.getClass();
                    chatTransactionPickerPresenter$Factory$Impl.getClass();
                    chatImageDetailPresenter$Factory$Impl.getClass();
                    chatSurveyUnavailablePresenter$Factory$Impl.getClass();
                    chatExitPromptPresenter$Factory$Impl.getClass();
                    chatExitPromptSheetPresenter$Factory$Impl.getClass();
                    chatSurveyPresenter$Factory$Impl.getClass();
                    return new BorrowPresenterFactory(chatPresenter$Factory$Impl, chatLoadingPresenter$Factory$Impl, chatFailedDeliverySheetPresenter$Factory$Impl, chatTransactionPickerPresenter$Factory$Impl, chatImageDetailPresenter$Factory$Impl, chatSurveyUnavailablePresenter$Factory$Impl, chatExitPromptPresenter$Factory$Impl, chatExitPromptSheetPresenter$Factory$Impl, chatSurveyPresenter$Factory$Impl, 3);
            }
        }
    }

    public BorrowPresenterFactory(AfterpayAppletHomePresenter$Factory$Impl afterpayAppletHomePresenter$Factory$Impl, AfterpayAppletInfoPresenter$Factory$Impl afterpayAppletInfoPresenter$Factory$Impl, AfterpayAppletMerchantSheetPresenter$Factory$Impl afterpayAppletMerchantSheetPresenter$Factory$Impl, AfterpayAppletPurchasesEmbeddedPresenter$Factory$Impl afterpayAppletPurchasesEmbeddedPresenter$Factory$Impl, AfterpayAppletActivityListEmbeddedPresenter$Factory$Impl afterpayAppletActivityListEmbeddedPresenter$Factory$Impl, AfterpaySearchPresenter$Factory$Impl afterpaySearchPresenter$Factory$Impl, SelectAfterpayPromptPresenter$Factory$Impl selectAfterpayPromptPresenter$Factory$Impl, AfterpayAppletNotificationPresenter$Factory$Impl afterpayAppletNotificationPresenter$Factory$Impl, AfterpayAppletRetroOrderSelectionPresenter$Factory$Impl afterpayAppletRetroOrderSelectionPresenter$Factory$Impl, AfterpayAppletUpsellSheetPresenter$Factory$Impl afterpayAppletUpsellSheetPresenter$Factory$Impl) {
        this.$r8$classId = 1;
        this.borrowAppletHome = afterpayAppletHomePresenter$Factory$Impl;
        this.borrowAppletHomeAmountPicker = afterpayAppletInfoPresenter$Factory$Impl;
        this.borrowAppletOverlay = afterpayAppletMerchantSheetPresenter$Factory$Impl;
        this.borrowLimitHub = afterpayAppletPurchasesEmbeddedPresenter$Factory$Impl;
        this.expandedLoanHistoryList = afterpayAppletActivityListEmbeddedPresenter$Factory$Impl;
        this.firstTimeBorrow = afterpaySearchPresenter$Factory$Impl;
        this.multiStepLoading = selectAfterpayPromptPresenter$Factory$Impl;
        this.loanAmountPicker = afterpayAppletRetroOrderSelectionPresenter$Factory$Impl;
        this.repayCustomAmountPicker = afterpayAppletUpsellSheetPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        int i = this.$r8$classId;
        Object obj = this.loanAmountPicker;
        Object obj2 = this.multiStepLoading;
        Object obj3 = this.firstTimeBorrow;
        Object obj4 = this.repayCustomAmountPicker;
        Object obj5 = this.expandedLoanHistoryList;
        Object obj6 = this.borrowLimitHub;
        Object obj7 = this.borrowAppletOverlay;
        Object obj8 = this.borrowAppletHomeAmountPicker;
        Object obj9 = this.borrowAppletHome;
        switch (i) {
            case 0:
                LoanAmountPickerPresenter$Factory$Impl loanAmountPickerPresenter$Factory$Impl = (LoanAmountPickerPresenter$Factory$Impl) obj;
                screen.getClass();
                if (screen instanceof BorrowHome) {
                    BorrowHomePresenter.MetroFactory metroFactory = ((BorrowHomePresenter$Factory$Impl) obj9).delegateFactory;
                    RealBorrowDataManager realBorrowDataManager = (RealBorrowDataManager) metroFactory.borrowDataManager.invoke();
                    LendingAppService lendingAppService = (LendingAppService) metroFactory.lendingAppService.getValue();
                    CoroutineScope coroutineScope = (CoroutineScope) metroFactory.activityScope.value;
                    LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) metroFactory.moneyFormatterFactory.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) metroFactory.routerFactory.invoke();
                    Analytics analytics = (Analytics) metroFactory.analytics.getValue();
                    ErrorReporter errorReporter = (ErrorReporter) metroFactory.errorReporter.lambda.invoke();
                    AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
                    realBorrowDataManager.getClass();
                    lendingAppService.getClass();
                    coroutineScope.getClass();
                    factory.getClass();
                    realRouter$Factory$Impl.getClass();
                    analytics.getClass();
                    errorReporter.getClass();
                    androidStringManager.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BorrowHomePresenter(realBorrowDataManager, lendingAppService, coroutineScope, factory, realRouter$Factory$Impl, analytics, errorReporter, androidStringManager, (BorrowHome) screen, screenNavigator));
                }
                if (screen instanceof BorrowHomeAmountPickerSheet) {
                    GetFlowLoadingPresenter$MetroFactory getFlowLoadingPresenter$MetroFactory = ((BorrowHomeAmountPickerPresenter$Factory$Impl) obj8).delegateFactory;
                    LocalizedMoneyFormatter.Factory factory2 = (LocalizedMoneyFormatter.Factory) getFlowLoadingPresenter$MetroFactory.flowNavigationHelper.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) getFlowLoadingPresenter$MetroFactory.activityFinisher.invoke();
                    Analytics analytics2 = (Analytics) getFlowLoadingPresenter$MetroFactory.appService.getValue();
                    factory2.getClass();
                    realRouter$Factory$Impl2.getClass();
                    analytics2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new BorrowHomeAmountPickerPresenter(factory2, realRouter$Factory$Impl2, analytics2, (BorrowHomeAmountPickerSheet) screen, screenNavigator));
                }
                if (screen instanceof BorrowHomeOverlay) {
                    BlockerImageUploader$MetroFactory blockerImageUploader$MetroFactory = ((BorrowHomeOverlayPresenter$Factory$Impl) obj7).delegateFactory;
                    Analytics analytics3 = (Analytics) blockerImageUploader$MetroFactory.analytics.getValue();
                    IntentLauncher intentLauncher = (IntentLauncher) blockerImageUploader$MetroFactory.blockersNavigator.invoke();
                    AndroidDateFormatManager androidDateFormatManager = (AndroidDateFormatManager) blockerImageUploader$MetroFactory.stringManager.lambda.invoke();
                    AndroidClock androidClock = (AndroidClock) blockerImageUploader$MetroFactory.ioDispatcher.lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl3 = (RealRouter$Factory$Impl) blockerImageUploader$MetroFactory.multiBlockerFacilitator.invoke();
                    analytics3.getClass();
                    intentLauncher.getClass();
                    androidDateFormatManager.getClass();
                    androidClock.getClass();
                    realRouter$Factory$Impl3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(analytics3, intentLauncher, androidDateFormatManager, androidClock, realRouter$Factory$Impl3, (BorrowHomeOverlay) screen, screenNavigator));
                }
                if (screen instanceof BorrowLimitHub) {
                    LocalEditorialPresenter.MetroFactory metroFactory2 = ((BorrowLimitHubPresenter$Factory$Impl) obj6).delegateFactory;
                    RealBorrowDataManager realBorrowDataManager2 = (RealBorrowDataManager) metroFactory2.launcher.invoke();
                    IntentLauncher intentLauncher2 = (IntentLauncher) metroFactory2.installedStore.invoke();
                    AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory2.clock.lambda.invoke();
                    Analytics analytics4 = (Analytics) metroFactory2.service.getValue();
                    ErrorReporter errorReporter2 = (ErrorReporter) metroFactory2.stringManager.lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl4 = (RealRouter$Factory$Impl) metroFactory2.responseContextHandlerFactory.invoke();
                    realBorrowDataManager2.getClass();
                    intentLauncher2.getClass();
                    androidStringManager2.getClass();
                    analytics4.getClass();
                    errorReporter2.getClass();
                    realRouter$Factory$Impl4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(realBorrowDataManager2, intentLauncher2, androidStringManager2, analytics4, errorReporter2, realRouter$Factory$Impl4, (BorrowLimitHub) screen, screenNavigator));
                }
                if (screen instanceof ExpandedLoanHistory) {
                    SecurityHubPresenter$MetroFactory securityHubPresenter$MetroFactory = ((ExpandedLoanHistoryListPresenter$Factory$Impl) obj5).delegateFactory;
                    LendingAppService lendingAppService2 = (LendingAppService) securityHubPresenter$MetroFactory.analytics.getValue();
                    CoroutineScope coroutineScope2 = (CoroutineScope) securityHubPresenter$MetroFactory.protectionsSectionPresenterFactory.value;
                    lendingAppService2.getClass();
                    coroutineScope2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new MusicPresenter(lendingAppService2, coroutineScope2, (ExpandedLoanHistory) screen, screenNavigator));
                }
                if (!(screen instanceof BlockersScreens.CreditFirstTimeBorrowBlockerScreen)) {
                    if (!(screen instanceof BlockersScreens.CreditMultiStepLoadingBlockerScreen)) {
                        if (screen instanceof LoanAmountPicker.LoanAmountPickerFull) {
                            return MoleculePresenterKt.asPresenter$default(loanAmountPickerPresenter$Factory$Impl.create(LoanAmountPickerPresenter.Mode.FULL, (LoanAmountPicker) screen, screenNavigator));
                        }
                        if (screen instanceof LoanAmountPicker.LoanAmountPickerSheet) {
                            return MoleculePresenterKt.asPresenter$default(loanAmountPickerPresenter$Factory$Impl.create(LoanAmountPickerPresenter.Mode.CONDENSED, (LoanAmountPicker) screen, screenNavigator));
                        }
                        if (screen instanceof RepayCustomAmountPicker) {
                            return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter((MetadataRepo) ((RealFileDownloader.MetroFactory) ((RepayCustomAmountPickerPresenter$Factory$Impl) obj4).delegateFactory.adapter).invoke(), (RepayCustomAmountPicker) screen, screenNavigator));
                        }
                        return null;
                    }
                    TransferInPresenter$MetroFactory transferInPresenter$MetroFactory = ((CreditMultiStepLoadingBlockerPresenter$Factory$Impl) obj2).delegateFactory;
                    AppService appService = (AppService) transferInPresenter$MetroFactory.analytics.getValue();
                    BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) transferInPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    AndroidStringManager androidStringManager3 = (AndroidStringManager) transferInPresenter$MetroFactory.stringManager.lambda.invoke();
                    appService.getClass();
                    blockersDataNavigator.getClass();
                    androidStringManager3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CreditMultiStepLoadingBlockerPresenter(appService, blockersDataNavigator, androidStringManager3, (BlockersScreens.CreditMultiStepLoadingBlockerScreen) screen, screenNavigator));
                }
                ImageLoader$Builder imageLoader$Builder = ((CreditFirstTimeBorrowBlockerPresenter$Factory$Impl) obj3).delegateFactory;
                AppService appService2 = (AppService) ((DoubleCheck) imageLoader$Builder.application).getValue();
                BlockersDataNavigator blockersDataNavigator2 = (BlockersDataNavigator) ((Provider) imageLoader$Builder.defaults).invoke();
                IntentLauncher intentLauncher3 = (IntentLauncher) ((Provider) imageLoader$Builder.mainCoroutineContextLazy).invoke();
                LocalizedMoneyFormatter.Factory factory3 = (LocalizedMoneyFormatter.Factory) ((Provider) imageLoader$Builder.memoryCacheLazy).invoke();
                zzb zzbVar = (zzb) ((MusicViewFactory$MetroFactory) imageLoader$Builder.diskCacheLazy).invoke();
                AndroidStringManager androidStringManager4 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder.eventListenerFactory).lambda.invoke();
                ErrorReporter errorReporter3 = (ErrorReporter) ((LambdaProvider) imageLoader$Builder.componentRegistry).lambda.invoke();
                Analytics analytics5 = (Analytics) ((DoubleCheck) imageLoader$Builder.extras).getValue();
                appService2.getClass();
                blockersDataNavigator2.getClass();
                intentLauncher3.getClass();
                factory3.getClass();
                androidStringManager4.getClass();
                errorReporter3.getClass();
                analytics5.getClass();
                return MoleculePresenterKt.asPresenter$default(new CreditFirstTimeBorrowBlockerPresenter(appService2, blockersDataNavigator2, intentLauncher3, factory3, zzbVar, androidStringManager4, errorReporter3, analytics5, (BlockersScreens.CreditFirstTimeBorrowBlockerScreen) screen, screenNavigator));
            case 1:
                screen.getClass();
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletHomeScreen) {
                    TabToolbarPresenter.MetroFactory metroFactory3 = ((AfterpayAppletHomePresenter$Factory$Impl) obj9).delegateFactory;
                    RealAfterpayAppletRepository realAfterpayAppletRepository = (RealAfterpayAppletRepository) metroFactory3.sessionManager.invoke();
                    AndroidStringManager androidStringManager5 = (AndroidStringManager) ((LambdaProvider) metroFactory3.featureFlagManager).lambda.invoke();
                    RealAfterpayMerchantRepo realAfterpayMerchantRepo = (RealAfterpayMerchantRepo) ((DoubleCheck) metroFactory3.bitcoinCapabilityProvider).getValue();
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics = (RealAfterpayAppletAnalytics) ((DoubleCheck) metroFactory3.badgingStateAccessibilityHelper).getValue();
                    AndroidClock androidClock2 = (AndroidClock) ((LambdaProvider) metroFactory3.moneybotFlagsHelper).lambda.invoke();
                    ErrorReporter errorReporter4 = (ErrorReporter) ((LambdaProvider) metroFactory3.moneybotAnalyticsService).lambda.invoke();
                    SampleStrategy sampleStrategy = (SampleStrategy) metroFactory3.profileManager.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl5 = (RealRouter$Factory$Impl) metroFactory3.badges.invoke();
                    RealObservabilityManager realObservabilityManager = (RealObservabilityManager) ((LambdaProvider) metroFactory3.sessionFlags).lambda.invoke();
                    AfterpayAppletHomeMapper afterpayAppletHomeMapper = (AfterpayAppletHomeMapper) ((RealEarningsChartRepository$MetroFactory) metroFactory3.syncValueReader).invoke();
                    JWECryptoParts jWECryptoParts = (JWECryptoParts) ((RealBrazeManager.MetroFactory) metroFactory3.p2pSettingsManager).invoke();
                    IssuedCardManager issuedCardManager = (IssuedCardManager) ((DoubleCheck) metroFactory3.familyNavigatorFactory).getValue();
                    RealCardCustomizationRepository realCardCustomizationRepository = (RealCardCustomizationRepository) metroFactory3.badger2.invoke();
                    RealProfileManager realProfileManager = (RealProfileManager) ((DelegateFactory) metroFactory3.familyProfileManager).invoke();
                    FeatureFlagManager featureFlagManager = (FeatureFlagManager) ((DoubleCheck) metroFactory3.balanceSnapshotManager).getValue();
                    RealPrepurchaseToggleManager realPrepurchaseToggleManager = (RealPrepurchaseToggleManager) ((DoubleCheck) metroFactory3.moneyFormatterFactory).getValue();
                    Analytics analytics6 = (Analytics) ((DoubleCheck) metroFactory3.tabToolbarOutboundNavigatorFactory).getValue();
                    realAfterpayAppletRepository.getClass();
                    androidStringManager5.getClass();
                    realAfterpayMerchantRepo.getClass();
                    realAfterpayAppletAnalytics.getClass();
                    androidClock2.getClass();
                    errorReporter4.getClass();
                    sampleStrategy.getClass();
                    realRouter$Factory$Impl5.getClass();
                    realObservabilityManager.getClass();
                    issuedCardManager.getClass();
                    realCardCustomizationRepository.getClass();
                    realProfileManager.getClass();
                    featureFlagManager.getClass();
                    realPrepurchaseToggleManager.getClass();
                    analytics6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new AfterpayAppletHomePresenter(screenNavigator, (AfterpayAppletScreen$AfterpayAppletHomeScreen) screen, realAfterpayAppletRepository, androidStringManager5, realAfterpayMerchantRepo, realAfterpayAppletAnalytics, androidClock2, errorReporter4, sampleStrategy, realRouter$Factory$Impl5, realObservabilityManager, afterpayAppletHomeMapper, jWECryptoParts, issuedCardManager, realCardCustomizationRepository, realProfileManager, featureFlagManager, realPrepurchaseToggleManager, analytics6));
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletPurchasesScreen) {
                    OfflineConfig.Adapter adapter = ((AfterpayAppletPurchasesEmbeddedPresenter$Factory$Impl) obj6).delegateFactory;
                    AndroidStringManager androidStringManager6 = (AndroidStringManager) ((LambdaProvider) adapter.attempted_payment_status_resultAdapter).lambda.invoke();
                    RealObservabilityManager realObservabilityManager2 = (RealObservabilityManager) ((LambdaProvider) adapter.offline_payment_status_resultAdapter).lambda.invoke();
                    RealAfterpayAppletRepository realAfterpayAppletRepository2 = (RealAfterpayAppletRepository) ((Provider) adapter.attempted_bill_status_resultAdapter).invoke();
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics2 = (RealAfterpayAppletAnalytics) ((DoubleCheck) adapter.offline_bill_status_resultAdapter).getValue();
                    ErrorReporter errorReporter5 = (ErrorReporter) ((LambdaProvider) adapter.attempted_cash_out_status_resultAdapter).lambda.invoke();
                    SampleStrategy sampleStrategy2 = (SampleStrategy) ((Provider) adapter.offline_cash_out_status_resultAdapter).invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl6 = (RealRouter$Factory$Impl) ((Provider) adapter.attempted_add_cash_status_resultAdapter).invoke();
                    SessionManager sessionManager = (SessionManager) ((LambdaProvider) adapter.offline_add_cash_status_resultAdapter).lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory4 = (LocalizedMoneyFormatter.Factory) ((Provider) adapter.error_cash_out_status_resultAdapter).invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) adapter.error_add_cash_status_resultAdapter).invoke();
                    OrderItemEventHandler$Factory$Impl orderItemEventHandler$Factory$Impl = (OrderItemEventHandler$Factory$Impl) ((Provider) adapter.offline_transfer_scenario_planAdapter).invoke();
                    AfterpayAppletPageRequestHandler$Factory$Impl afterpayAppletPageRequestHandler$Factory$Impl = (AfterpayAppletPageRequestHandler$Factory$Impl) ((Provider) adapter.error_transfer_scenario_planAdapter).invoke();
                    ActivitiesManager.Factory factory5 = (ActivitiesManager.Factory) ((Provider) adapter.retry_intervalsAdapter).invoke();
                    androidStringManager6.getClass();
                    realObservabilityManager2.getClass();
                    realAfterpayAppletRepository2.getClass();
                    realAfterpayAppletAnalytics2.getClass();
                    errorReporter5.getClass();
                    sampleStrategy2.getClass();
                    realRouter$Factory$Impl6.getClass();
                    sessionManager.getClass();
                    factory4.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl.getClass();
                    orderItemEventHandler$Factory$Impl.getClass();
                    afterpayAppletPageRequestHandler$Factory$Impl.getClass();
                    factory5.getClass();
                    return MoleculePresenterKt.asPresenter$default(new AfterpayAppletPurchasesEmbeddedPresenter(screenNavigator, (AfterpayAppletScreen$AfterpayAppletPurchasesScreen) screen, androidStringManager6, realObservabilityManager2, realAfterpayAppletRepository2, realAfterpayAppletAnalytics2, errorReporter5, sampleStrategy2, realRouter$Factory$Impl6, sessionManager, factory4, realActivityEmbeddedPresenter$Factory$Impl, orderItemEventHandler$Factory$Impl, afterpayAppletPageRequestHandler$Factory$Impl, factory5));
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen) {
                    DeviceBuildInfo deviceBuildInfo = ((AfterpayAppletActivityListEmbeddedPresenter$Factory$Impl) obj5).delegateFactory;
                    AndroidStringManager androidStringManager7 = (AndroidStringManager) ((LambdaProvider) deviceBuildInfo.manufacturer).lambda.invoke();
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics3 = (RealAfterpayAppletAnalytics) ((DoubleCheck) deviceBuildInfo.model).getValue();
                    RealAfterpayAppletRepository realAfterpayAppletRepository3 = (RealAfterpayAppletRepository) ((Provider) deviceBuildInfo.osVersion).invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl7 = (RealRouter$Factory$Impl) ((Provider) deviceBuildInfo.osBuild).invoke();
                    SessionManager sessionManager2 = (SessionManager) ((LambdaProvider) deviceBuildInfo.fingerprint).lambda.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl2 = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) deviceBuildInfo.tags).invoke();
                    OrderItemEventHandler$Factory$Impl orderItemEventHandler$Factory$Impl2 = (OrderItemEventHandler$Factory$Impl) ((Provider) deviceBuildInfo.brand).invoke();
                    AfterpayAppletPageRequestHandler$Factory$Impl afterpayAppletPageRequestHandler$Factory$Impl2 = (AfterpayAppletPageRequestHandler$Factory$Impl) ((Provider) deviceBuildInfo.apiLevel).invoke();
                    ActivitiesManager.Factory factory6 = (ActivitiesManager.Factory) ((Provider) deviceBuildInfo.cpuAbis).invoke();
                    androidStringManager7.getClass();
                    realAfterpayAppletAnalytics3.getClass();
                    realAfterpayAppletRepository3.getClass();
                    realRouter$Factory$Impl7.getClass();
                    sessionManager2.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl2.getClass();
                    orderItemEventHandler$Factory$Impl2.getClass();
                    afterpayAppletPageRequestHandler$Factory$Impl2.getClass();
                    factory6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(screenNavigator, (AfterpayAppletScreen$AfterpayAppletActivityListEmbeddedScreen) screen, androidStringManager7, realAfterpayAppletAnalytics3, realAfterpayAppletRepository3, realRouter$Factory$Impl7, sessionManager2, realActivityEmbeddedPresenter$Factory$Impl2, orderItemEventHandler$Factory$Impl2, afterpayAppletPageRequestHandler$Factory$Impl2, factory6));
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen) {
                    AfterpaySearchPresenter$MetroFactory afterpaySearchPresenter$MetroFactory = ((AfterpayAppletMerchantSheetPresenter$Factory$Impl) obj7).delegateFactory;
                    SampleStrategy sampleStrategy3 = (SampleStrategy) afterpaySearchPresenter$MetroFactory.routerFactory.invoke();
                    ErrorReporter errorReporter6 = (ErrorReporter) afterpaySearchPresenter$MetroFactory.stringManager.lambda.invoke();
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics4 = (RealAfterpayAppletAnalytics) afterpaySearchPresenter$MetroFactory.afterpayMerchantRepo.getValue();
                    RealClipboardManager realClipboardManager = (RealClipboardManager) afterpaySearchPresenter$MetroFactory.inputFieldTextSaver.lambda.invoke();
                    IntentLauncher intentLauncher4 = (IntentLauncher) afterpaySearchPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
                    RealAfterpayAppletMerchantSheetRepository realAfterpayAppletMerchantSheetRepository = (RealAfterpayAppletMerchantSheetRepository) afterpaySearchPresenter$MetroFactory.afterpayAnalytics.getValue();
                    AndroidStringManager androidStringManager8 = (AndroidStringManager) afterpaySearchPresenter$MetroFactory.errorReporter.lambda.invoke();
                    sampleStrategy3.getClass();
                    errorReporter6.getClass();
                    realAfterpayAppletAnalytics4.getClass();
                    realClipboardManager.getClass();
                    intentLauncher4.getClass();
                    realAfterpayAppletMerchantSheetRepository.getClass();
                    androidStringManager8.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(screenNavigator, (AfterpayAppletScreen$AfterpayAppletMerchantSheetScreen) screen, sampleStrategy3, errorReporter6, realAfterpayAppletAnalytics4, realClipboardManager, intentLauncher4, realAfterpayAppletMerchantSheetRepository, androidStringManager8));
                }
                if (screen instanceof AfterpayAppletScreen$AfterpaySearchScreen) {
                    AfterpaySearchPresenter$MetroFactory afterpaySearchPresenter$MetroFactory2 = ((AfterpaySearchPresenter$Factory$Impl) obj3).delegateFactory;
                    RealAfterpayMerchantRepo realAfterpayMerchantRepo2 = (RealAfterpayMerchantRepo) afterpaySearchPresenter$MetroFactory2.afterpayMerchantRepo.getValue();
                    AndroidStringManager androidStringManager9 = (AndroidStringManager) afterpaySearchPresenter$MetroFactory2.stringManager.lambda.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl8 = (RealRouter$Factory$Impl) afterpaySearchPresenter$MetroFactory2.routerFactory.invoke();
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics5 = (RealAfterpayAppletAnalytics) afterpaySearchPresenter$MetroFactory2.afterpayAnalytics.getValue();
                    RealInputFieldTextSaver realInputFieldTextSaver = (RealInputFieldTextSaver) afterpaySearchPresenter$MetroFactory2.inputFieldTextSaver.lambda.invoke();
                    ErrorReporter errorReporter7 = (ErrorReporter) afterpaySearchPresenter$MetroFactory2.errorReporter.lambda.invoke();
                    SampleStrategy sampleStrategy4 = (SampleStrategy) afterpaySearchPresenter$MetroFactory2.oneErrorPerAppSessionStrategy.invoke();
                    realAfterpayMerchantRepo2.getClass();
                    androidStringManager9.getClass();
                    realRouter$Factory$Impl8.getClass();
                    realAfterpayAppletAnalytics5.getClass();
                    realInputFieldTextSaver.getClass();
                    errorReporter7.getClass();
                    sampleStrategy4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(realAfterpayMerchantRepo2, androidStringManager9, realRouter$Factory$Impl8, realAfterpayAppletAnalytics5, realInputFieldTextSaver, errorReporter7, sampleStrategy4, (AfterpayAppletScreen$AfterpaySearchScreen) screen, screenNavigator));
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletInfoSheet) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory4 = ((AfterpayAppletInfoPresenter$Factory$Impl) obj8).delegateFactory;
                    RealRouter$Factory$Impl realRouter$Factory$Impl9 = (RealRouter$Factory$Impl) metroFactory4.blockerFlowAnalytics.invoke();
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics6 = (RealAfterpayAppletAnalytics) metroFactory4.analytics.getValue();
                    realRouter$Factory$Impl9.getClass();
                    realAfterpayAppletAnalytics6.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter((AfterpayAppletScreen$AfterpayAppletInfoSheet) screen, screenNavigator, realRouter$Factory$Impl9, realAfterpayAppletAnalytics6));
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet) {
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics7 = (RealAfterpayAppletAnalytics) ((SelectAfterpayPromptPresenter$Factory$Impl) obj2).delegateFactory.analytics.getValue();
                    realAfterpayAppletAnalytics7.getClass();
                    return MoleculePresenterKt.asPresenter$default(new EndAppLockPresenter((AfterpayAppletScreen$AfterpayAppletSelectAfterpayPromptSheet) screen, screenNavigator, realAfterpayAppletAnalytics7));
                }
                if (screen instanceof AfterpayAppletScreen$AfterpayAppletNotificationScreen) {
                    return MoleculePresenterKt.asPresenter$default(new ErrorPresenter(screenNavigator, (AfterpayAppletScreen$AfterpayAppletNotificationScreen) screen));
                }
                if (!(screen instanceof AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen)) {
                    if (!(screen instanceof AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen)) {
                        return null;
                    }
                    ComponentRegistry.Builder builder = ((AfterpayAppletUpsellSheetPresenter$Factory$Impl) obj4).delegateFactory;
                    RealAfterpayAppletAnalytics realAfterpayAppletAnalytics8 = (RealAfterpayAppletAnalytics) ((DoubleCheck) builder.interceptors).getValue();
                    ErrorReporter errorReporter8 = (ErrorReporter) ((LambdaProvider) builder.mappers).lambda.invoke();
                    SampleStrategy sampleStrategy5 = (SampleStrategy) ((Provider) builder.keyers).invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl10 = (RealRouter$Factory$Impl) ((Provider) builder.lazyFetcherFactories).invoke();
                    Result result = (Result) ((PersonalSetting.MetroFactory) builder.lazyDecoderFactories).invoke();
                    realAfterpayAppletAnalytics8.getClass();
                    errorReporter8.getClass();
                    sampleStrategy5.getClass();
                    realRouter$Factory$Impl10.getClass();
                    return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(screenNavigator, (AfterpayAppletScreen$AfterpayAppletUpsellSheetScreen) screen, realAfterpayAppletAnalytics8, errorReporter8, sampleStrategy5, realRouter$Factory$Impl10, result));
                }
                Reward$Adapter reward$Adapter = ((AfterpayAppletRetroOrderSelectionPresenter$Factory$Impl) obj).delegateFactory;
                AndroidStringManager androidStringManager10 = (AndroidStringManager) ((LambdaProvider) reward$Adapter.avatarsAdapter).lambda.invoke();
                AfterpayEligibleRetroTransactionsProvider afterpayEligibleRetroTransactionsProvider = (AfterpayEligibleRetroTransactionsProvider) ((Provider) reward$Adapter.reward_selection_stateAdapter).invoke();
                RealAfterpayAppletRepository realAfterpayAppletRepository4 = (RealAfterpayAppletRepository) ((Provider) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
                RealAfterpayAppletAnalytics realAfterpayAppletAnalytics9 = (RealAfterpayAppletAnalytics) ((DoubleCheck) reward$Adapter.app_linksAdapter).getValue();
                ErrorReporter errorReporter9 = (ErrorReporter) ((LambdaProvider) reward$Adapter.program_detail_rowsAdapter).lambda.invoke();
                SampleStrategy sampleStrategy6 = (SampleStrategy) ((Provider) reward$Adapter.boost_detail_rowsAdapter).invoke();
                RealRouter$Factory$Impl realRouter$Factory$Impl11 = (RealRouter$Factory$Impl) ((Provider) reward$Adapter.boost_attributesAdapter).invoke();
                androidStringManager10.getClass();
                afterpayEligibleRetroTransactionsProvider.getClass();
                realAfterpayAppletRepository4.getClass();
                realAfterpayAppletAnalytics9.getClass();
                errorReporter9.getClass();
                sampleStrategy6.getClass();
                realRouter$Factory$Impl11.getClass();
                return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(screenNavigator, (AfterpayAppletScreen$AfterpayRetroOrderSelectionScreen) screen, androidStringManager10, afterpayEligibleRetroTransactionsProvider, realAfterpayAppletRepository4, realAfterpayAppletAnalytics9, errorReporter9, sampleStrategy6, realRouter$Factory$Impl11));
            case 2:
                screen.getClass();
                PaychecksScreen paychecksScreen = screen instanceof PaychecksScreen ? (PaychecksScreen) screen : null;
                if (paychecksScreen instanceof PaychecksHomeScreen) {
                    PaychecksHomeScreen paychecksHomeScreen = (PaychecksHomeScreen) paychecksScreen;
                    PoolDetailsPresenter$MetroFactory poolDetailsPresenter$MetroFactory = ((PaychecksHomePresenter$Factory$Impl) obj9).delegateFactory;
                    RealRouter$Factory$Impl realRouter$Factory$Impl12 = (RealRouter$Factory$Impl) poolDetailsPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    ActivitiesManager.Factory factory7 = (ActivitiesManager.Factory) poolDetailsPresenter$MetroFactory.poolsRepository.invoke();
                    SessionManager sessionManager3 = (SessionManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.stringManager).lambda.invoke();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl3 = (RealActivityEmbeddedPresenter$Factory$Impl) poolDetailsPresenter$MetroFactory.launcher.invoke();
                    SyncValueReader syncValueReader = (SyncValueReader) ((DoubleCheck) poolDetailsPresenter$MetroFactory.blockersNavigator).getValue();
                    AndroidStringManager androidStringManager11 = (AndroidStringManager) ((LambdaProvider) poolDetailsPresenter$MetroFactory.sessionManager).lambda.invoke();
                    PaychecksAppService paychecksAppService = (PaychecksAppService) ((DoubleCheck) poolDetailsPresenter$MetroFactory.analytics).getValue();
                    Error.Code.Companion companion = (Error.Code.Companion) ((RealCurrentUserSetter.MetroFactory) poolDetailsPresenter$MetroFactory.uuidGenerator).invoke();
                    Analytics analytics7 = (Analytics) ((DoubleCheck) poolDetailsPresenter$MetroFactory.featureFlagManager).getValue();
                    RealDisclosureProvider realDisclosureProvider = (RealDisclosureProvider) poolDetailsPresenter$MetroFactory.activityEmbeddedPresenterFactory.invoke();
                    RealClientSyncer realClientSyncer = (RealClientSyncer) poolDetailsPresenter$MetroFactory.defaultActivityItemEventHandlerFactory.invoke();
                    ErrorReporter errorReporter10 = (ErrorReporter) ((LambdaProvider) poolDetailsPresenter$MetroFactory.dateFormatManager).lambda.invoke();
                    SampleStrategy sampleStrategy7 = (SampleStrategy) poolDetailsPresenter$MetroFactory.activitiesCacheManager.invoke();
                    CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) poolDetailsPresenter$MetroFactory.clock).lambda.invoke();
                    realRouter$Factory$Impl12.getClass();
                    factory7.getClass();
                    sessionManager3.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl3.getClass();
                    syncValueReader.getClass();
                    androidStringManager11.getClass();
                    paychecksAppService.getClass();
                    analytics7.getClass();
                    realDisclosureProvider.getClass();
                    realClientSyncer.getClass();
                    errorReporter10.getClass();
                    sampleStrategy7.getClass();
                    coroutineContext.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TapToPayPresenter(realRouter$Factory$Impl12, factory7, sessionManager3, realActivityEmbeddedPresenter$Factory$Impl3, syncValueReader, androidStringManager11, paychecksAppService, companion, analytics7, realDisclosureProvider, realClientSyncer, errorReporter10, sampleStrategy7, coroutineContext, paychecksHomeScreen, screenNavigator));
                }
                if (paychecksScreen instanceof DistributePaycheckScreen) {
                    ImageLoader$Builder imageLoader$Builder2 = ((DistributePaycheckPresenter$Factory$Impl) obj8).delegateFactory;
                    SyncValueReader syncValueReader2 = (SyncValueReader) ((DoubleCheck) imageLoader$Builder2.application).getValue();
                    PaychecksAppService paychecksAppService2 = (PaychecksAppService) ((DoubleCheck) imageLoader$Builder2.defaults).getValue();
                    FlowStarter flowStarter = (FlowStarter) ((DoubleCheck) imageLoader$Builder2.mainCoroutineContextLazy).getValue();
                    AndroidStringManager androidStringManager12 = (AndroidStringManager) ((LambdaProvider) imageLoader$Builder2.memoryCacheLazy).lambda.invoke();
                    Analytics analytics8 = (Analytics) ((DoubleCheck) imageLoader$Builder2.diskCacheLazy).getValue();
                    ErrorReporter errorReporter11 = (ErrorReporter) ((LambdaProvider) imageLoader$Builder2.eventListenerFactory).lambda.invoke();
                    SampleStrategy sampleStrategy8 = (SampleStrategy) ((Provider) imageLoader$Builder2.componentRegistry).invoke();
                    CoroutineScope coroutineScope3 = (CoroutineScope) ((InstanceFactory) imageLoader$Builder2.extras).value;
                    syncValueReader2.getClass();
                    paychecksAppService2.getClass();
                    flowStarter.getClass();
                    androidStringManager12.getClass();
                    analytics8.getClass();
                    errorReporter11.getClass();
                    sampleStrategy8.getClass();
                    coroutineScope3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(screenNavigator, syncValueReader2, paychecksAppService2, flowStarter, androidStringManager12, analytics8, errorReporter11, sampleStrategy8, coroutineScope3));
                }
                if (paychecksScreen instanceof EditDistributionScreen) {
                    DisclosurePresenter.MetroFactory metroFactory5 = ((EditDistributionPresenter$Factory$Impl) obj7).delegateFactory;
                    Analytics analytics9 = (Analytics) metroFactory5.analytics.getValue();
                    PaychecksAppService paychecksAppService3 = (PaychecksAppService) metroFactory5.appService.getValue();
                    BlockersDataNavigator blockersDataNavigator3 = (BlockersDataNavigator) metroFactory5.blockersNavigator.invoke();
                    AndroidStringManager androidStringManager13 = (AndroidStringManager) metroFactory5.stringManager.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory8 = (LocalizedMoneyFormatter.Factory) metroFactory5.launcher.invoke();
                    analytics9.getClass();
                    paychecksAppService3.getClass();
                    blockersDataNavigator3.getClass();
                    androidStringManager13.getClass();
                    factory8.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter((EditDistributionScreen) paychecksScreen, screenNavigator, analytics9, paychecksAppService3, blockersDataNavigator3, androidStringManager13, factory8));
                }
                if (paychecksScreen instanceof SetPaycheckMultipleAllocationScreen) {
                    BorrowHomePresenter.MetroFactory metroFactory6 = ((MultipleAllocationPresenter$Factory$Impl) obj6).delegateFactory;
                    CoroutineScope coroutineScope4 = (CoroutineScope) metroFactory6.activityScope.value;
                    BlockersDataNavigator blockersDataNavigator4 = (BlockersDataNavigator) metroFactory6.borrowDataManager.invoke();
                    PaychecksAppService paychecksAppService4 = (PaychecksAppService) metroFactory6.lendingAppService.getValue();
                    Analytics analytics10 = (Analytics) metroFactory6.analytics.getValue();
                    ErrorReporter errorReporter12 = (ErrorReporter) metroFactory6.errorReporter.lambda.invoke();
                    SampleStrategy sampleStrategy9 = (SampleStrategy) metroFactory6.moneyFormatterFactory.invoke();
                    AndroidStringManager androidStringManager14 = (AndroidStringManager) metroFactory6.stringManager.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory9 = (LocalizedMoneyFormatter.Factory) metroFactory6.routerFactory.invoke();
                    coroutineScope4.getClass();
                    blockersDataNavigator4.getClass();
                    paychecksAppService4.getClass();
                    analytics10.getClass();
                    errorReporter12.getClass();
                    sampleStrategy9.getClass();
                    androidStringManager14.getClass();
                    factory9.getClass();
                    return MoleculePresenterKt.asPresenter$default(new CardLockPresenter((SetPaycheckMultipleAllocationScreen) paychecksScreen, screenNavigator, coroutineScope4, blockersDataNavigator4, paychecksAppService4, analytics10, errorReporter12, sampleStrategy9, androidStringManager14, factory9));
                }
                if (paychecksScreen instanceof CustomAllocationScreen) {
                    AndroidStringManager androidStringManager15 = (AndroidStringManager) ((CustomAllocationPresenter$Factory$Impl) obj5).delegateFactory.stringManager.lambda.invoke();
                    androidStringManager15.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter((CustomAllocationScreen) paychecksScreen, screenNavigator, androidStringManager15));
                }
                if (paychecksScreen instanceof PaycheckAlertDialogScreen) {
                    return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter(29, (PaycheckAlertDialogScreen) paychecksScreen, screenNavigator));
                }
                if (paychecksScreen instanceof PaycheckReceiptScreen) {
                    TransferringPresenter$MetroFactory transferringPresenter$MetroFactory = ((PaycheckReceiptPresenter$Factory$Impl) obj3).delegateFactory;
                    SyncValueReader syncValueReader3 = (SyncValueReader) transferringPresenter$MetroFactory.appService.getValue();
                    AndroidStringManager androidStringManager16 = (AndroidStringManager) transferringPresenter$MetroFactory.stringManager.lambda.invoke();
                    RealPaycheckSettlementDateFormatter realPaycheckSettlementDateFormatter = (RealPaycheckSettlementDateFormatter) transferringPresenter$MetroFactory.blockersDataNavigator.invoke();
                    LocalizedMoneyFormatter.Factory factory10 = (LocalizedMoneyFormatter.Factory) transferringPresenter$MetroFactory.balanceSnapshotManager.invoke();
                    Analytics analytics11 = (Analytics) transferringPresenter$MetroFactory.flowStarter.getValue();
                    ErrorReporter errorReporter13 = (ErrorReporter) transferringPresenter$MetroFactory.uuidGenerator.lambda.invoke();
                    SampleStrategy sampleStrategy10 = (SampleStrategy) transferringPresenter$MetroFactory.moneyFormatterFactory.invoke();
                    syncValueReader3.getClass();
                    androidStringManager16.getClass();
                    realPaycheckSettlementDateFormatter.getClass();
                    factory10.getClass();
                    analytics11.getClass();
                    errorReporter13.getClass();
                    sampleStrategy10.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(syncValueReader3, androidStringManager16, realPaycheckSettlementDateFormatter, factory10, (PaycheckReceiptScreen) paychecksScreen, screenNavigator, analytics11, errorReporter13, sampleStrategy10));
                }
                if (paychecksScreen instanceof PaycheckAggregationReceiptScreen) {
                    PaycheckAggregationReceiptScreen paycheckAggregationReceiptScreen = (PaycheckAggregationReceiptScreen) paychecksScreen;
                    AfterpaySearchPresenter$MetroFactory afterpaySearchPresenter$MetroFactory3 = ((PaycheckAggregationReceiptPresenter$Factory$Impl) obj2).delegateFactory;
                    SyncValueReader syncValueReader4 = (SyncValueReader) afterpaySearchPresenter$MetroFactory3.afterpayMerchantRepo.getValue();
                    AndroidDateFormatManager androidDateFormatManager2 = (AndroidDateFormatManager) afterpaySearchPresenter$MetroFactory3.stringManager.lambda.invoke();
                    AndroidStringManager androidStringManager17 = (AndroidStringManager) afterpaySearchPresenter$MetroFactory3.inputFieldTextSaver.lambda.invoke();
                    LocalizedMoneyFormatter.Factory factory11 = (LocalizedMoneyFormatter.Factory) afterpaySearchPresenter$MetroFactory3.routerFactory.invoke();
                    Analytics analytics12 = (Analytics) afterpaySearchPresenter$MetroFactory3.afterpayAnalytics.getValue();
                    ErrorReporter errorReporter14 = (ErrorReporter) afterpaySearchPresenter$MetroFactory3.errorReporter.lambda.invoke();
                    SampleStrategy sampleStrategy11 = (SampleStrategy) afterpaySearchPresenter$MetroFactory3.oneErrorPerAppSessionStrategy.invoke();
                    syncValueReader4.getClass();
                    androidDateFormatManager2.getClass();
                    androidStringManager17.getClass();
                    factory11.getClass();
                    analytics12.getClass();
                    errorReporter14.getClass();
                    sampleStrategy11.getClass();
                    return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(syncValueReader4, androidDateFormatManager2, androidStringManager17, factory11, paycheckAggregationReceiptScreen, screenNavigator, analytics12, errorReporter14, sampleStrategy11));
                }
                if (paychecksScreen instanceof PaycheckActivityListScreen) {
                    zzlj zzljVar = ((PaychecksActivityListPresenter$Factory$Impl) obj).delegateFactory;
                    SessionManager sessionManager4 = (SessionManager) ((LambdaProvider) zzljVar.zza).lambda.invoke();
                    PaychecksAppService paychecksAppService5 = (PaychecksAppService) ((DoubleCheck) zzljVar.zzb).getValue();
                    ActivityClientService activityClientService = (ActivityClientService) ((DoubleCheck) zzljVar.zzc).getValue();
                    Analytics analytics13 = (Analytics) ((DoubleCheck) zzljVar.zze).getValue();
                    RealActivityEmbeddedPresenter$Factory$Impl realActivityEmbeddedPresenter$Factory$Impl4 = (RealActivityEmbeddedPresenter$Factory$Impl) ((Provider) zzljVar.zzd).invoke();
                    PaychecksActivityFeedProducer paychecksActivityFeedProducer = (PaychecksActivityFeedProducer) ((PersistedEventRepository.MetroFactory) zzljVar.zzf).invoke();
                    sessionManager4.getClass();
                    paychecksAppService5.getClass();
                    activityClientService.getClass();
                    analytics13.getClass();
                    realActivityEmbeddedPresenter$Factory$Impl4.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(sessionManager4, paychecksAppService5, activityClientService, screenNavigator, analytics13, realActivityEmbeddedPresenter$Factory$Impl4, paychecksActivityFeedProducer));
                }
                if (!(paychecksScreen instanceof HelpSheetScreen)) {
                    if (paychecksScreen == null) {
                        return null;
                    }
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                HelpSheetPresenter$MetroFactory helpSheetPresenter$MetroFactory = ((HelpSheetPresenter$Factory$Impl) obj4).delegateFactory;
                SyncValueReader syncValueReader5 = (SyncValueReader) helpSheetPresenter$MetroFactory.syncValueReader.getValue();
                RealRouter$Factory$Impl realRouter$Factory$Impl13 = (RealRouter$Factory$Impl) helpSheetPresenter$MetroFactory.routerFactory.invoke();
                ErrorReporter errorReporter15 = (ErrorReporter) helpSheetPresenter$MetroFactory.errorReporter.lambda.invoke();
                SampleStrategy sampleStrategy12 = (SampleStrategy) helpSheetPresenter$MetroFactory.oneErrorPerAppSessionStrategy.invoke();
                syncValueReader5.getClass();
                realRouter$Factory$Impl13.getClass();
                errorReporter15.getClass();
                sampleStrategy12.getClass();
                return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(syncValueReader5, screenNavigator, realRouter$Factory$Impl13, errorReporter15, sampleStrategy12));
            default:
                screen.getClass();
                if (screen instanceof SupportChatScreens.FlowScreen.ChatScreen) {
                    ChatPresenter$Factory$Impl chatPresenter$Factory$Impl = (ChatPresenter$Factory$Impl) obj9;
                    SupportChatScreens.FlowScreen.ChatScreen chatScreen = (SupportChatScreens.FlowScreen.ChatScreen) screen;
                    boolean z = Build.VERSION.SDK_INT >= 33;
                    ChatPresenter.MetroFactory metroFactory7 = chatPresenter$Factory$Impl.delegateFactory;
                    AndroidStringManager androidStringManager18 = (AndroidStringManager) metroFactory7.stringManager.invoke();
                    IntentLauncher intentLauncher5 = (IntentLauncher) metroFactory7.launcher.invoke();
                    RealConversationService realConversationService = (RealConversationService) metroFactory7.conversationService.invoke();
                    FeatureFlagManager featureFlagManager2 = (FeatureFlagManager) metroFactory7.featureFlagManager.invoke();
                    AndroidClock androidClock3 = (AndroidClock) metroFactory7.clock.invoke();
                    Analytics analytics14 = (Analytics) metroFactory7.analytics.invoke();
                    RealObservabilityManager realObservabilityManager3 = (RealObservabilityManager) metroFactory7.observabilityManager.invoke();
                    SupportalAppService supportalAppService = (SupportalAppService) metroFactory7.appService.invoke();
                    RealFileValidator$Factory$Impl realFileValidator$Factory$Impl = (RealFileValidator$Factory$Impl) metroFactory7.fileValidatorFactory.invoke();
                    RealImageFormatConverter$Factory$Impl realImageFormatConverter$Factory$Impl = (RealImageFormatConverter$Factory$Impl) metroFactory7.imageFormatConverterFactory.invoke();
                    TextSetter textSetter = (TextSetter) metroFactory7.chatAccessibilityManager.invoke();
                    StateFlow stateFlow = (StateFlow) metroFactory7.activityLifecycleStates.invoke();
                    String str = (String) metroFactory7.applicationId.invoke();
                    RealRouter$Factory$Impl realRouter$Factory$Impl14 = (RealRouter$Factory$Impl) metroFactory7.routerFactory.invoke();
                    RealClientRouteParser realClientRouteParser = (RealClientRouteParser) metroFactory7.clientRouteParser.invoke();
                    SupportConversationPersistence supportConversationPersistence = (SupportConversationPersistence) metroFactory7.conversationPersistence.invoke();
                    AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) metroFactory7.permissionManager.invoke();
                    ChatStateMapper chatStateMapper = (ChatStateMapper) metroFactory7.chatStateMapper.invoke();
                    ErrorReporter errorReporter16 = (ErrorReporter) metroFactory7.errorReporter.invoke();
                    ActivityDataBridge activityDataBridge = (ActivityDataBridge) metroFactory7.activityDataBridge.invoke();
                    AndroidAccessibilityManager androidAccessibilityManager = (AndroidAccessibilityManager) metroFactory7.accessibilityManager.invoke();
                    androidStringManager18.getClass();
                    intentLauncher5.getClass();
                    realConversationService.getClass();
                    featureFlagManager2.getClass();
                    androidClock3.getClass();
                    analytics14.getClass();
                    realObservabilityManager3.getClass();
                    supportalAppService.getClass();
                    realFileValidator$Factory$Impl.getClass();
                    realImageFormatConverter$Factory$Impl.getClass();
                    stateFlow.getClass();
                    str.getClass();
                    realRouter$Factory$Impl14.getClass();
                    realClientRouteParser.getClass();
                    supportConversationPersistence.getClass();
                    androidPermissionManager.getClass();
                    errorReporter16.getClass();
                    activityDataBridge.getClass();
                    androidAccessibilityManager.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ChatPresenter(androidStringManager18, intentLauncher5, realConversationService, featureFlagManager2, androidClock3, analytics14, realObservabilityManager3, supportalAppService, realFileValidator$Factory$Impl, realImageFormatConverter$Factory$Impl, textSetter, stateFlow, str, realRouter$Factory$Impl14, realClientRouteParser, supportConversationPersistence, androidPermissionManager, chatStateMapper, errorReporter16, activityDataBridge, androidAccessibilityManager, chatScreen, screenNavigator, z));
                }
                if (screen instanceof SupportChatScreens.FlowScreen.ChatLoading) {
                    CaptureCheckFacePresenter.MetroFactory metroFactory8 = ((ChatLoadingPresenter$Factory$Impl) obj8).delegateFactory;
                    RealChatManager realChatManager = (RealChatManager) metroFactory8.intentLauncher.invoke();
                    AndroidStringManager androidStringManager19 = (AndroidStringManager) metroFactory8.errorReporter.lambda.invoke();
                    AndroidNotificationManager androidNotificationManager = (AndroidNotificationManager) metroFactory8.stringManager.lambda.invoke();
                    RealConversationService realConversationService2 = (RealConversationService) metroFactory8.permissionManager.invoke();
                    realChatManager.getClass();
                    androidStringManager19.getClass();
                    androidNotificationManager.getClass();
                    realConversationService2.getClass();
                    return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(realChatManager, androidStringManager19, androidNotificationManager, realConversationService2, (SupportChatScreens.FlowScreen.ChatLoading) screen, screenNavigator));
                }
                if (screen instanceof SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet) {
                    LiteActivityPresenter.MetroFactory metroFactory9 = ((ChatFailedDeliverySheetPresenter$Factory$Impl) obj7).delegateFactory;
                    RealConversationService realConversationService3 = (RealConversationService) metroFactory9.activityEmbeddedPresenterFactory.invoke();
                    AndroidAccessibilityManager androidAccessibilityManager2 = (AndroidAccessibilityManager) metroFactory9.sessionManager.lambda.invoke();
                    AndroidStringManager androidStringManager20 = (AndroidStringManager) metroFactory9.stringManager.lambda.invoke();
                    realConversationService3.getClass();
                    androidAccessibilityManager2.getClass();
                    androidStringManager20.getClass();
                    return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(realConversationService3, androidAccessibilityManager2, androidStringManager20, (SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet) screen, screenNavigator));
                }
                if (screen instanceof SupportChatScreens.FlowScreen.ChatTransactionPicker) {
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter((MarkwonConfiguration) ((RealGooglePayer.MetroFactory) ((ChatTransactionPickerPresenter$Factory$Impl) obj6).delegateFactory.adapter).invoke(), (SupportChatScreens.FlowScreen.ChatTransactionPicker) screen, screenNavigator));
                }
                if (screen instanceof SupportChatScreens.FlowScreen.ChatImageDetail) {
                    ChatImageDetailPresenter$MetroFactory chatImageDetailPresenter$MetroFactory = ((ChatImageDetailPresenter$Factory$Impl) obj5).delegateFactory;
                    AndroidAccessibilityManager androidAccessibilityManager3 = (AndroidAccessibilityManager) chatImageDetailPresenter$MetroFactory.accessibilityManager.lambda.invoke();
                    AndroidStringManager androidStringManager21 = (AndroidStringManager) chatImageDetailPresenter$MetroFactory.stringManager.lambda.invoke();
                    androidAccessibilityManager3.getClass();
                    androidStringManager21.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(androidAccessibilityManager3, androidStringManager21, (SupportChatScreens.FlowScreen.ChatImageDetail) screen, screenNavigator));
                }
                if (screen instanceof SupportChatScreens.FlowScreen.ChatSurveyScreen) {
                    CardStudioPresenter.MetroFactory metroFactory10 = ((ChatSurveyPresenter$Factory$Impl) obj4).delegateFactory;
                    RealChatSurveyService realChatSurveyService = (RealChatSurveyService) metroFactory10.analytics.getValue();
                    AndroidStringManager androidStringManager22 = (AndroidStringManager) metroFactory10.ioContext.lambda.invoke();
                    Analytics analytics15 = (Analytics) metroFactory10.appConfig.getValue();
                    FeatureFlagManager featureFlagManager3 = (FeatureFlagManager) metroFactory10.cashDatabase.getValue();
                    realChatSurveyService.getClass();
                    androidStringManager22.getClass();
                    analytics15.getClass();
                    featureFlagManager3.getClass();
                    return MoleculePresenterKt.asPresenter$default(new PdfPreviewPresenter(realChatSurveyService, androidStringManager22, analytics15, featureFlagManager3, (SupportChatScreens.FlowScreen.ChatSurveyScreen) screen, screenNavigator));
                }
                if (screen instanceof SupportChatScreens.SupportChatDialogs.ChatSurveyUnavailable) {
                    RealSupportNavigator realSupportNavigator = (RealSupportNavigator) ((ChatSurveyUnavailablePresenter$Factory$Impl) obj3).delegateFactory.sandboxer.invoke();
                    realSupportNavigator.getClass();
                    return MoleculePresenterKt.asPresenter$default(new InviteErrorPresenter(realSupportNavigator, (SupportChatScreens.SupportChatDialogs.ChatSurveyUnavailable) screen, screenNavigator));
                }
                if (screen instanceof SupportChatScreens.SupportChatDialogs.ChatErrorDialog) {
                    return MoleculePresenterKt.asPresenter$default(new com.squareup.cash.profile.presenters.ErrorPresenter((SupportChatScreens.SupportChatDialogs.ChatErrorDialog) screen, screenNavigator));
                }
                if (screen instanceof SupportChatScreens.SupportChatDialogs.ChatExitPrompt) {
                    CheckDepositAmountPresenter.MetroFactory metroFactory11 = ((ChatExitPromptPresenter$Factory$Impl) obj2).delegateFactory;
                    RealChatManager realChatManager2 = (RealChatManager) metroFactory11.blockerFlowAnalytics.invoke();
                    Analytics analytics16 = (Analytics) metroFactory11.analytics.getValue();
                    realChatManager2.getClass();
                    analytics16.getClass();
                    return MoleculePresenterKt.asPresenter$default(new TaxReturnsPresenter(realChatManager2, analytics16, (SupportChatScreens.SupportChatDialogs.ChatExitPrompt) screen, screenNavigator));
                }
                if (!(screen instanceof SupportChatScreens.SupportChatSheets.ChatExitPromptSheet)) {
                    return null;
                }
                zzlj zzljVar2 = ((ChatExitPromptSheetPresenter$Factory$Impl) obj).delegateFactory;
                RealChatManager realChatManager3 = (RealChatManager) ((Provider) zzljVar2.zza).invoke();
                RealChatSurveyService realChatSurveyService2 = (RealChatSurveyService) ((DoubleCheck) zzljVar2.zzb).getValue();
                RealChatNotificationSuppressor realChatNotificationSuppressor = (RealChatNotificationSuppressor) ((DoubleCheck) zzljVar2.zzc).getValue();
                AndroidStringManager androidStringManager23 = (AndroidStringManager) ((LambdaProvider) zzljVar2.zze).lambda.invoke();
                Analytics analytics17 = (Analytics) ((DoubleCheck) zzljVar2.zzd).getValue();
                FeatureFlagManager featureFlagManager4 = (FeatureFlagManager) ((DoubleCheck) zzljVar2.zzf).getValue();
                realChatManager3.getClass();
                realChatSurveyService2.getClass();
                realChatNotificationSuppressor.getClass();
                androidStringManager23.getClass();
                analytics17.getClass();
                featureFlagManager4.getClass();
                return MoleculePresenterKt.asPresenter$default(new PoolsListPresenter(realChatManager3, realChatSurveyService2, realChatNotificationSuppressor, androidStringManager23, analytics17, featureFlagManager4, (SupportChatScreens.SupportChatSheets.ChatExitPromptSheet) screen, screenNavigator));
        }
    }

    public /* synthetic */ BorrowPresenterFactory(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.$r8$classId = i;
        this.borrowAppletHome = obj;
        this.borrowAppletHomeAmountPicker = obj2;
        this.borrowAppletOverlay = obj3;
        this.borrowLimitHub = obj4;
        this.expandedLoanHistoryList = obj5;
        this.firstTimeBorrow = obj6;
        this.multiStepLoading = obj7;
        this.loanAmountPicker = obj8;
        this.repayCustomAmountPicker = obj9;
    }

    public BorrowPresenterFactory(PaychecksHomePresenter$Factory$Impl paychecksHomePresenter$Factory$Impl, DistributePaycheckPresenter$Factory$Impl distributePaycheckPresenter$Factory$Impl, EditDistributionPresenter$Factory$Impl editDistributionPresenter$Factory$Impl, MultipleAllocationPresenter$Factory$Impl multipleAllocationPresenter$Factory$Impl, CustomAllocationPresenter$Factory$Impl customAllocationPresenter$Factory$Impl, PaycheckAlertDialogPresenter$Factory$Impl paycheckAlertDialogPresenter$Factory$Impl, PaycheckReceiptPresenter$Factory$Impl paycheckReceiptPresenter$Factory$Impl, PaycheckAggregationReceiptPresenter$Factory$Impl paycheckAggregationReceiptPresenter$Factory$Impl, PaychecksActivityListPresenter$Factory$Impl paychecksActivityListPresenter$Factory$Impl, HelpSheetPresenter$Factory$Impl helpSheetPresenter$Factory$Impl) {
        this.$r8$classId = 2;
        this.borrowAppletHome = paychecksHomePresenter$Factory$Impl;
        this.borrowAppletHomeAmountPicker = distributePaycheckPresenter$Factory$Impl;
        this.borrowAppletOverlay = editDistributionPresenter$Factory$Impl;
        this.borrowLimitHub = multipleAllocationPresenter$Factory$Impl;
        this.expandedLoanHistoryList = customAllocationPresenter$Factory$Impl;
        this.firstTimeBorrow = paycheckReceiptPresenter$Factory$Impl;
        this.multiStepLoading = paycheckAggregationReceiptPresenter$Factory$Impl;
        this.loanAmountPicker = paychecksActivityListPresenter$Factory$Impl;
        this.repayCustomAmountPicker = helpSheetPresenter$Factory$Impl;
    }
}
