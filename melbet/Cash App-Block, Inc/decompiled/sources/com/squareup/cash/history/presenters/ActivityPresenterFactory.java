package com.squareup.cash.history.presenters;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.history.screens.HistoryScreens;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import com.google.android.gms.internal.measurement.zzlj;
import com.squareup.cash.activity.backend.RealActivityUpdatesNotifier;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletActivityListEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletHomePresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletInfoPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletMerchantSheetPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletNotificationPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletPurchasesEmbeddedPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletRetroOrderSelectionPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpayAppletUpsellSheetPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.AfterpaySearchPresenter$Factory$Impl;
import com.squareup.cash.afterpayapplet.presenters.SelectAfterpayPromptPresenter$Factory$Impl;
import com.squareup.cash.boost.db.Reward$Adapter;
import com.squareup.cash.borrow.presenters.BorrowPresenterFactory;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenterV2$MetroFactory;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientsync.syncer.RealClientSyncer;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.activity.PaymentNavigator;
import com.squareup.cash.data.contacts.RealContactRepository;
import com.squareup.cash.db.db.CashAccountDatabaseImpl;
import com.squareup.cash.family.profileselection.real.RealFamilyProfileManager;
import com.squareup.cash.favorites.data.RealFavoritesManager;
import com.squareup.cash.history.backend.real.RealLegacyActivityEntityManager;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.paychecks.presenters.CustomAllocationPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.DistributePaycheckPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.EditDistributionPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.HelpSheetPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.MultipleAllocationPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaycheckAggregationReceiptPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaycheckAlertDialogPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaycheckReceiptPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaychecksActivityListPresenter$Factory$Impl;
import com.squareup.cash.paychecks.presenters.PaychecksHomePresenter$Factory$Impl;
import com.squareup.cash.payments.backend.api.OfflineManager;
import com.squareup.cash.payments.backend.api.PaymentManager;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.tax.presenters.TaxAuthorizationPresenter;
import com.squareup.protos.cash.blockly.api.BlocklyService;
import com.squareup.protos.cash.sup.api.v1.CheckoutService;
import dev.zacsweers.metro.LambdaProvider;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DelegateFactory;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes.dex */
public final class ActivityPresenterFactory implements PresenterFactory {
    public final CancelPaymentPresenter$Factory$Impl cancelPaymentPresenter;
    public final CancelPendingSupPaymentPresenter$Factory$Impl cancelPendingSupPaymentPresenterFactory;
    public final CheckStatusPresenter$Factory$Impl checkStatusPresenterFactory;
    public final PasscodeDialogPresenter$Factory$Impl passcodeDialogPresenter;
    public final RefundPaymentPresenter$Factory$Impl refundPayment;
    public final ReportAbusePresenter$Factory$Impl reportAbuse;
    public final ReportAbuseDialogPresenter$Factory$Impl reportAbuseDialogPresenter;
    public final SkipPaymentPresenter$Factory$Impl skipPayment;

    public final class MetroFactory implements Factory {
        public final /* synthetic */ int $r8$classId;
        public final InstanceFactory cancelPaymentPresenter;
        public final InstanceFactory cancelPendingSupPaymentPresenterFactory;
        public final InstanceFactory checkStatusPresenterFactory;
        public final InstanceFactory errorPresenter;
        public final InstanceFactory passcodeDialogPresenter;
        public final InstanceFactory refundPayment;
        public final InstanceFactory reportAbuse;
        public final InstanceFactory reportAbuseDialogPresenter;
        public final InstanceFactory skipPayment;
        public final InstanceFactory treehouseReceipt;

        public /* synthetic */ MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, InstanceFactory instanceFactory6, InstanceFactory instanceFactory7, InstanceFactory instanceFactory8, InstanceFactory instanceFactory9, InstanceFactory instanceFactory10, int i) {
            this.$r8$classId = i;
            this.cancelPendingSupPaymentPresenterFactory = instanceFactory;
            this.skipPayment = instanceFactory2;
            this.treehouseReceipt = instanceFactory3;
            this.reportAbuse = instanceFactory4;
            this.reportAbuseDialogPresenter = instanceFactory5;
            this.refundPayment = instanceFactory6;
            this.passcodeDialogPresenter = instanceFactory7;
            this.checkStatusPresenterFactory = instanceFactory8;
            this.cancelPaymentPresenter = instanceFactory9;
            this.errorPresenter = instanceFactory10;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            int i = this.$r8$classId;
            InstanceFactory instanceFactory = this.errorPresenter;
            InstanceFactory instanceFactory2 = this.cancelPaymentPresenter;
            InstanceFactory instanceFactory3 = this.checkStatusPresenterFactory;
            InstanceFactory instanceFactory4 = this.passcodeDialogPresenter;
            InstanceFactory instanceFactory5 = this.refundPayment;
            InstanceFactory instanceFactory6 = this.reportAbuseDialogPresenter;
            InstanceFactory instanceFactory7 = this.reportAbuse;
            InstanceFactory instanceFactory8 = this.treehouseReceipt;
            InstanceFactory instanceFactory9 = this.skipPayment;
            InstanceFactory instanceFactory10 = this.cancelPendingSupPaymentPresenterFactory;
            switch (i) {
                case 0:
                    CancelPendingSupPaymentPresenter$Factory$Impl cancelPendingSupPaymentPresenter$Factory$Impl = (CancelPendingSupPaymentPresenter$Factory$Impl) instanceFactory10.value;
                    SkipPaymentPresenter$Factory$Impl skipPaymentPresenter$Factory$Impl = (SkipPaymentPresenter$Factory$Impl) instanceFactory9.value;
                    TreehouseReceiptPresenter$Factory$Impl treehouseReceiptPresenter$Factory$Impl = (TreehouseReceiptPresenter$Factory$Impl) instanceFactory8.value;
                    ReportAbusePresenter$Factory$Impl reportAbusePresenter$Factory$Impl = (ReportAbusePresenter$Factory$Impl) instanceFactory7.value;
                    ReportAbuseDialogPresenter$Factory$Impl reportAbuseDialogPresenter$Factory$Impl = (ReportAbuseDialogPresenter$Factory$Impl) instanceFactory6.value;
                    RefundPaymentPresenter$Factory$Impl refundPaymentPresenter$Factory$Impl = (RefundPaymentPresenter$Factory$Impl) instanceFactory5.value;
                    PasscodeDialogPresenter$Factory$Impl passcodeDialogPresenter$Factory$Impl = (PasscodeDialogPresenter$Factory$Impl) instanceFactory4.value;
                    CheckStatusPresenter$Factory$Impl checkStatusPresenter$Factory$Impl = (CheckStatusPresenter$Factory$Impl) instanceFactory3.value;
                    CancelPaymentPresenter$Factory$Impl cancelPaymentPresenter$Factory$Impl = (CancelPaymentPresenter$Factory$Impl) instanceFactory2.value;
                    ErrorPresenter$Factory$Impl errorPresenter$Factory$Impl = (ErrorPresenter$Factory$Impl) instanceFactory.value;
                    cancelPendingSupPaymentPresenter$Factory$Impl.getClass();
                    skipPaymentPresenter$Factory$Impl.getClass();
                    treehouseReceiptPresenter$Factory$Impl.getClass();
                    reportAbusePresenter$Factory$Impl.getClass();
                    reportAbuseDialogPresenter$Factory$Impl.getClass();
                    refundPaymentPresenter$Factory$Impl.getClass();
                    passcodeDialogPresenter$Factory$Impl.getClass();
                    checkStatusPresenter$Factory$Impl.getClass();
                    cancelPaymentPresenter$Factory$Impl.getClass();
                    errorPresenter$Factory$Impl.getClass();
                    return new ActivityPresenterFactory(cancelPendingSupPaymentPresenter$Factory$Impl, skipPaymentPresenter$Factory$Impl, treehouseReceiptPresenter$Factory$Impl, reportAbusePresenter$Factory$Impl, reportAbuseDialogPresenter$Factory$Impl, refundPaymentPresenter$Factory$Impl, passcodeDialogPresenter$Factory$Impl, checkStatusPresenter$Factory$Impl, cancelPaymentPresenter$Factory$Impl, errorPresenter$Factory$Impl);
                case 1:
                    AfterpayAppletHomePresenter$Factory$Impl afterpayAppletHomePresenter$Factory$Impl = (AfterpayAppletHomePresenter$Factory$Impl) instanceFactory10.value;
                    AfterpayAppletInfoPresenter$Factory$Impl afterpayAppletInfoPresenter$Factory$Impl = (AfterpayAppletInfoPresenter$Factory$Impl) instanceFactory9.value;
                    AfterpayAppletMerchantSheetPresenter$Factory$Impl afterpayAppletMerchantSheetPresenter$Factory$Impl = (AfterpayAppletMerchantSheetPresenter$Factory$Impl) instanceFactory8.value;
                    AfterpayAppletPurchasesEmbeddedPresenter$Factory$Impl afterpayAppletPurchasesEmbeddedPresenter$Factory$Impl = (AfterpayAppletPurchasesEmbeddedPresenter$Factory$Impl) instanceFactory7.value;
                    AfterpayAppletActivityListEmbeddedPresenter$Factory$Impl afterpayAppletActivityListEmbeddedPresenter$Factory$Impl = (AfterpayAppletActivityListEmbeddedPresenter$Factory$Impl) instanceFactory6.value;
                    AfterpaySearchPresenter$Factory$Impl afterpaySearchPresenter$Factory$Impl = (AfterpaySearchPresenter$Factory$Impl) instanceFactory5.value;
                    SelectAfterpayPromptPresenter$Factory$Impl selectAfterpayPromptPresenter$Factory$Impl = (SelectAfterpayPromptPresenter$Factory$Impl) instanceFactory4.value;
                    AfterpayAppletNotificationPresenter$Factory$Impl afterpayAppletNotificationPresenter$Factory$Impl = (AfterpayAppletNotificationPresenter$Factory$Impl) instanceFactory3.value;
                    AfterpayAppletRetroOrderSelectionPresenter$Factory$Impl afterpayAppletRetroOrderSelectionPresenter$Factory$Impl = (AfterpayAppletRetroOrderSelectionPresenter$Factory$Impl) instanceFactory2.value;
                    AfterpayAppletUpsellSheetPresenter$Factory$Impl afterpayAppletUpsellSheetPresenter$Factory$Impl = (AfterpayAppletUpsellSheetPresenter$Factory$Impl) instanceFactory.value;
                    afterpayAppletHomePresenter$Factory$Impl.getClass();
                    afterpayAppletInfoPresenter$Factory$Impl.getClass();
                    afterpayAppletMerchantSheetPresenter$Factory$Impl.getClass();
                    afterpayAppletPurchasesEmbeddedPresenter$Factory$Impl.getClass();
                    afterpayAppletActivityListEmbeddedPresenter$Factory$Impl.getClass();
                    afterpaySearchPresenter$Factory$Impl.getClass();
                    selectAfterpayPromptPresenter$Factory$Impl.getClass();
                    afterpayAppletNotificationPresenter$Factory$Impl.getClass();
                    afterpayAppletRetroOrderSelectionPresenter$Factory$Impl.getClass();
                    afterpayAppletUpsellSheetPresenter$Factory$Impl.getClass();
                    return new BorrowPresenterFactory(afterpayAppletHomePresenter$Factory$Impl, afterpayAppletInfoPresenter$Factory$Impl, afterpayAppletMerchantSheetPresenter$Factory$Impl, afterpayAppletPurchasesEmbeddedPresenter$Factory$Impl, afterpayAppletActivityListEmbeddedPresenter$Factory$Impl, afterpaySearchPresenter$Factory$Impl, selectAfterpayPromptPresenter$Factory$Impl, afterpayAppletNotificationPresenter$Factory$Impl, afterpayAppletRetroOrderSelectionPresenter$Factory$Impl, afterpayAppletUpsellSheetPresenter$Factory$Impl);
                default:
                    PaychecksHomePresenter$Factory$Impl paychecksHomePresenter$Factory$Impl = (PaychecksHomePresenter$Factory$Impl) instanceFactory10.value;
                    DistributePaycheckPresenter$Factory$Impl distributePaycheckPresenter$Factory$Impl = (DistributePaycheckPresenter$Factory$Impl) instanceFactory9.value;
                    EditDistributionPresenter$Factory$Impl editDistributionPresenter$Factory$Impl = (EditDistributionPresenter$Factory$Impl) instanceFactory8.value;
                    MultipleAllocationPresenter$Factory$Impl multipleAllocationPresenter$Factory$Impl = (MultipleAllocationPresenter$Factory$Impl) instanceFactory7.value;
                    CustomAllocationPresenter$Factory$Impl customAllocationPresenter$Factory$Impl = (CustomAllocationPresenter$Factory$Impl) instanceFactory6.value;
                    PaycheckAlertDialogPresenter$Factory$Impl paycheckAlertDialogPresenter$Factory$Impl = (PaycheckAlertDialogPresenter$Factory$Impl) instanceFactory5.value;
                    PaycheckReceiptPresenter$Factory$Impl paycheckReceiptPresenter$Factory$Impl = (PaycheckReceiptPresenter$Factory$Impl) instanceFactory4.value;
                    PaycheckAggregationReceiptPresenter$Factory$Impl paycheckAggregationReceiptPresenter$Factory$Impl = (PaycheckAggregationReceiptPresenter$Factory$Impl) instanceFactory3.value;
                    PaychecksActivityListPresenter$Factory$Impl paychecksActivityListPresenter$Factory$Impl = (PaychecksActivityListPresenter$Factory$Impl) instanceFactory2.value;
                    HelpSheetPresenter$Factory$Impl helpSheetPresenter$Factory$Impl = (HelpSheetPresenter$Factory$Impl) instanceFactory.value;
                    paychecksHomePresenter$Factory$Impl.getClass();
                    distributePaycheckPresenter$Factory$Impl.getClass();
                    editDistributionPresenter$Factory$Impl.getClass();
                    multipleAllocationPresenter$Factory$Impl.getClass();
                    customAllocationPresenter$Factory$Impl.getClass();
                    paycheckAlertDialogPresenter$Factory$Impl.getClass();
                    paycheckReceiptPresenter$Factory$Impl.getClass();
                    paycheckAggregationReceiptPresenter$Factory$Impl.getClass();
                    paychecksActivityListPresenter$Factory$Impl.getClass();
                    helpSheetPresenter$Factory$Impl.getClass();
                    return new BorrowPresenterFactory(paychecksHomePresenter$Factory$Impl, distributePaycheckPresenter$Factory$Impl, editDistributionPresenter$Factory$Impl, multipleAllocationPresenter$Factory$Impl, customAllocationPresenter$Factory$Impl, paycheckAlertDialogPresenter$Factory$Impl, paycheckReceiptPresenter$Factory$Impl, paycheckAggregationReceiptPresenter$Factory$Impl, paychecksActivityListPresenter$Factory$Impl, helpSheetPresenter$Factory$Impl);
            }
        }
    }

    public ActivityPresenterFactory(CancelPendingSupPaymentPresenter$Factory$Impl cancelPendingSupPaymentPresenter$Factory$Impl, SkipPaymentPresenter$Factory$Impl skipPaymentPresenter$Factory$Impl, TreehouseReceiptPresenter$Factory$Impl treehouseReceiptPresenter$Factory$Impl, ReportAbusePresenter$Factory$Impl reportAbusePresenter$Factory$Impl, ReportAbuseDialogPresenter$Factory$Impl reportAbuseDialogPresenter$Factory$Impl, RefundPaymentPresenter$Factory$Impl refundPaymentPresenter$Factory$Impl, PasscodeDialogPresenter$Factory$Impl passcodeDialogPresenter$Factory$Impl, CheckStatusPresenter$Factory$Impl checkStatusPresenter$Factory$Impl, CancelPaymentPresenter$Factory$Impl cancelPaymentPresenter$Factory$Impl, ErrorPresenter$Factory$Impl errorPresenter$Factory$Impl) {
        this.cancelPendingSupPaymentPresenterFactory = cancelPendingSupPaymentPresenter$Factory$Impl;
        this.skipPayment = skipPaymentPresenter$Factory$Impl;
        this.reportAbuse = reportAbusePresenter$Factory$Impl;
        this.reportAbuseDialogPresenter = reportAbuseDialogPresenter$Factory$Impl;
        this.refundPayment = refundPaymentPresenter$Factory$Impl;
        this.passcodeDialogPresenter = passcodeDialogPresenter$Factory$Impl;
        this.checkStatusPresenterFactory = checkStatusPresenter$Factory$Impl;
        this.cancelPaymentPresenter = cancelPaymentPresenter$Factory$Impl;
    }

    @Override // app.cash.broadway.presenter.PresenterFactory
    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
        screen.getClass();
        if (screen instanceof HistoryScreens.CancelPendingSupPaymentScreen) {
            HistoryScreens.CancelPendingSupPaymentScreen cancelPendingSupPaymentScreen = (HistoryScreens.CancelPendingSupPaymentScreen) screen;
            TaxAuthorizationPresenter.MetroFactory metroFactory = this.cancelPendingSupPaymentPresenterFactory.delegateFactory;
            CheckoutService checkoutService = (CheckoutService) metroFactory.taxService.getValue();
            AndroidStringManager androidStringManager = (AndroidStringManager) metroFactory.stringManager.lambda.invoke();
            Analytics analytics = (Analytics) metroFactory.flowStarter.getValue();
            RealActivityUpdatesNotifier realActivityUpdatesNotifier = (RealActivityUpdatesNotifier) metroFactory.appService.getValue();
            RealClientSyncer realClientSyncer = (RealClientSyncer) metroFactory.blockersDataNavigator.invoke();
            checkoutService.getClass();
            androidStringManager.getClass();
            analytics.getClass();
            realActivityUpdatesNotifier.getClass();
            realClientSyncer.getClass();
            return MoleculePresenterKt.asPresenter$default(new DisclosurePresenter(checkoutService, androidStringManager, analytics, realActivityUpdatesNotifier, realClientSyncer, cancelPendingSupPaymentScreen, screenNavigator));
        }
        if (screen instanceof HistoryScreens.PaymentReceiptDialogScreen) {
            return MoleculePresenterKt.asPresenter$default(new PaymentReceiptDialogPresenter(((HistoryScreens.PaymentReceiptDialogScreen) screen).dialog, screenNavigator));
        }
        if (screen instanceof HistoryScreens.SkipPayment) {
            HistoryScreens.SkipPayment skipPayment = (HistoryScreens.SkipPayment) screen;
            SkipPaymentPresenter$MetroFactory skipPaymentPresenter$MetroFactory = this.skipPayment.delegateFactory;
            RealLegacyActivityEntityManager realLegacyActivityEntityManager = (RealLegacyActivityEntityManager) skipPaymentPresenter$MetroFactory.activityEntityManager.getValue();
            PaymentManager paymentManager = (PaymentManager) skipPaymentPresenter$MetroFactory.paymentManager.getValue();
            AndroidStringManager androidStringManager2 = (AndroidStringManager) skipPaymentPresenter$MetroFactory.stringManager.lambda.invoke();
            realLegacyActivityEntityManager.getClass();
            paymentManager.getClass();
            androidStringManager2.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalPosCheckInPresenter(realLegacyActivityEntityManager, paymentManager, androidStringManager2, skipPayment, screenNavigator));
        }
        if (screen instanceof HistoryScreens.PaymentReceipt) {
            return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((HistoryScreens.PaymentReceipt) screen, screenNavigator));
        }
        if (screen instanceof HistoryScreens.ReportAbuse) {
            HistoryScreens.ReportAbuse reportAbuse = (HistoryScreens.ReportAbuse) screen;
            ReportAbusePresenter$MetroFactory reportAbusePresenter$MetroFactory = this.reportAbuse.delegateFactory;
            RealContactRepository realContactRepository = (RealContactRepository) reportAbusePresenter$MetroFactory.contactRepository.invoke();
            PaymentManager paymentManager2 = (PaymentManager) reportAbusePresenter$MetroFactory.paymentManager.getValue();
            AndroidStringManager androidStringManager3 = (AndroidStringManager) reportAbusePresenter$MetroFactory.stringManager.lambda.invoke();
            BlocklyService blocklyService = (BlocklyService) reportAbusePresenter$MetroFactory.appService.getValue();
            RealFavoritesManager realFavoritesManager = (RealFavoritesManager) reportAbusePresenter$MetroFactory.favoritesManager.invoke();
            RealFamilyProfileManager realFamilyProfileManager = (RealFamilyProfileManager) reportAbusePresenter$MetroFactory.familyProfileManager.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) reportAbusePresenter$MetroFactory.routerFactory.invoke();
            realContactRepository.getClass();
            paymentManager2.getClass();
            androidStringManager3.getClass();
            blocklyService.getClass();
            realFavoritesManager.getClass();
            realFamilyProfileManager.getClass();
            realRouter$Factory$Impl.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(realContactRepository, paymentManager2, androidStringManager3, blocklyService, realFavoritesManager, realFamilyProfileManager, realRouter$Factory$Impl, reportAbuse, screenNavigator));
        }
        if (screen instanceof HistoryScreens.ReportAbuseDialogScreen) {
            HistoryScreens.ReportAbuseDialogScreen reportAbuseDialogScreen = (HistoryScreens.ReportAbuseDialogScreen) screen;
            ReportAbusePresenter$MetroFactory reportAbusePresenter$MetroFactory2 = this.reportAbuseDialogPresenter.delegateFactory;
            RealContactRepository realContactRepository2 = (RealContactRepository) reportAbusePresenter$MetroFactory2.contactRepository.invoke();
            PaymentManager paymentManager3 = (PaymentManager) reportAbusePresenter$MetroFactory2.paymentManager.getValue();
            AndroidStringManager androidStringManager4 = (AndroidStringManager) reportAbusePresenter$MetroFactory2.stringManager.lambda.invoke();
            BlocklyService blocklyService2 = (BlocklyService) reportAbusePresenter$MetroFactory2.appService.getValue();
            RealFavoritesManager realFavoritesManager2 = (RealFavoritesManager) reportAbusePresenter$MetroFactory2.favoritesManager.invoke();
            RealFamilyProfileManager realFamilyProfileManager2 = (RealFamilyProfileManager) reportAbusePresenter$MetroFactory2.familyProfileManager.invoke();
            RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) reportAbusePresenter$MetroFactory2.routerFactory.invoke();
            realContactRepository2.getClass();
            paymentManager3.getClass();
            androidStringManager4.getClass();
            blocklyService2.getClass();
            realFavoritesManager2.getClass();
            realFamilyProfileManager2.getClass();
            realRouter$Factory$Impl2.getClass();
            return MoleculePresenterKt.asPresenter$default(new LocalHomePresenter(realContactRepository2, paymentManager3, androidStringManager4, blocklyService2, realFavoritesManager2, realFamilyProfileManager2, realRouter$Factory$Impl2, reportAbuseDialogScreen, screenNavigator));
        }
        if (screen instanceof HistoryScreens.RefundPayment) {
            HistoryScreens.RefundPayment refundPayment = (HistoryScreens.RefundPayment) screen;
            CardStudioPresenterV2$MetroFactory cardStudioPresenterV2$MetroFactory = this.refundPayment.delegateFactory;
            RealLegacyActivityEntityManager realLegacyActivityEntityManager2 = (RealLegacyActivityEntityManager) cardStudioPresenterV2$MetroFactory.cashDatabase.getValue();
            PaymentManager paymentManager4 = (PaymentManager) cardStudioPresenterV2$MetroFactory.appConfig.getValue();
            AndroidStringManager androidStringManager5 = (AndroidStringManager) cardStudioPresenterV2$MetroFactory.ioContext.lambda.invoke();
            LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) cardStudioPresenterV2$MetroFactory.deviceOrientationProvider.invoke();
            realLegacyActivityEntityManager2.getClass();
            paymentManager4.getClass();
            androidStringManager5.getClass();
            factory.getClass();
            return MoleculePresenterKt.asPresenter$default(new CardStudioPresenter(realLegacyActivityEntityManager2, paymentManager4, androidStringManager5, factory, refundPayment, screenNavigator));
        }
        if (screen instanceof HistoryScreens.PaymentPasscodeDialog) {
            return MoleculePresenterKt.asPresenter$default(this.passcodeDialogPresenter.create((HistoryScreens.PaymentPasscodeDialog) screen, screenNavigator));
        }
        if (screen instanceof HistoryScreens.CheckPaymentStatus) {
            HistoryScreens.CheckPaymentStatus checkPaymentStatus = (HistoryScreens.CheckPaymentStatus) screen;
            Reward$Adapter reward$Adapter = this.checkStatusPresenterFactory.delegateFactory;
            Analytics analytics2 = (Analytics) ((DoubleCheck) reward$Adapter.avatarsAdapter).getValue();
            CashAccountDatabaseImpl cashAccountDatabaseImpl = (CashAccountDatabaseImpl) ((DoubleCheck) reward$Adapter.reward_selection_stateAdapter).getValue();
            OfflineManager offlineManager = (OfflineManager) ((DelegateFactory) reward$Adapter.boost_detail_bottom_upsellAdapter).invoke();
            AndroidStringManager androidStringManager6 = (AndroidStringManager) ((LambdaProvider) reward$Adapter.app_linksAdapter).lambda.invoke();
            PaymentNavigator paymentNavigator = (PaymentNavigator) ((Provider) reward$Adapter.program_detail_rowsAdapter).invoke();
            CoroutineContext coroutineContext = (CoroutineContext) ((LambdaProvider) reward$Adapter.boost_detail_rowsAdapter).lambda.invoke();
            CoroutineScope coroutineScope = (CoroutineScope) ((InstanceFactory) reward$Adapter.boost_attributesAdapter).value;
            analytics2.getClass();
            cashAccountDatabaseImpl.getClass();
            offlineManager.getClass();
            androidStringManager6.getClass();
            paymentNavigator.getClass();
            coroutineContext.getClass();
            coroutineScope.getClass();
            return MoleculePresenterKt.asPresenter$default(new CheckStatusPresenter(analytics2, cashAccountDatabaseImpl, offlineManager, androidStringManager6, paymentNavigator, coroutineContext, coroutineScope, checkPaymentStatus, screenNavigator));
        }
        if (!(screen instanceof HistoryScreens.CancelPayment)) {
            if (screen instanceof HistoryScreens.Error) {
                return MoleculePresenterKt.asPresenter$default(new VerifyCheckDialogPresenter((HistoryScreens.Error) screen, screenNavigator));
            }
            return null;
        }
        HistoryScreens.CancelPayment cancelPayment = (HistoryScreens.CancelPayment) screen;
        zzlj zzljVar = this.cancelPaymentPresenter.delegateFactory;
        Analytics analytics3 = (Analytics) ((DoubleCheck) zzljVar.zza).getValue();
        RealLegacyActivityEntityManager realLegacyActivityEntityManager3 = (RealLegacyActivityEntityManager) ((DoubleCheck) zzljVar.zzb).getValue();
        PaymentNavigator paymentNavigator2 = (PaymentNavigator) ((Provider) zzljVar.zzc).invoke();
        CashAccountDatabaseImpl cashAccountDatabaseImpl2 = (CashAccountDatabaseImpl) ((DoubleCheck) zzljVar.zze).getValue();
        AndroidStringManager androidStringManager7 = (AndroidStringManager) ((LambdaProvider) zzljVar.zzd).lambda.invoke();
        CoroutineScope coroutineScope2 = (CoroutineScope) ((InstanceFactory) zzljVar.zzf).value;
        analytics3.getClass();
        realLegacyActivityEntityManager3.getClass();
        paymentNavigator2.getClass();
        cashAccountDatabaseImpl2.getClass();
        androidStringManager7.getClass();
        coroutineScope2.getClass();
        return MoleculePresenterKt.asPresenter$default(new LocalEditorialPresenter(analytics3, realLegacyActivityEntityManager3, paymentNavigator2, cashAccountDatabaseImpl2, androidStringManager7, coroutineScope2, screenNavigator, cancelPayment));
    }
}
