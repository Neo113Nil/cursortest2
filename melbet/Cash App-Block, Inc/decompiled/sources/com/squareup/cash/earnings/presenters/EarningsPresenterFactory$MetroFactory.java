package com.squareup.cash.earnings.presenters;

import app.cash.broadway.presenter.Presenter;
import app.cash.broadway.presenter.PresenterFactory;
import app.cash.broadway.presenter.molecule.MoleculePresenterKt;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalCashBalancePresenter;
import com.squareup.cash.blockers.presenters.GetFlowLoadingPresenter$MetroFactory;
import com.squareup.cash.boost.backend.RealBoostRepository;
import com.squareup.cash.buynowpaylater.presenters.AfterPayInfoSheetPresenter$Factory$Impl;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDetailsOverflowActionSheetPresenter$Factory$Impl;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDetailsPresenter$Factory$Impl;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderDocumentPresenter$Factory$Impl;
import com.squareup.cash.buynowpaylater.presenters.AfterPayOrderHubPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.LiteAddMoneyPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.LiteBalanceHomePresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.LiteCashInPresenter$Factory$Impl;
import com.squareup.cash.cashapplite.presenters.LiteCashOutPresenter$Factory$Impl;
import com.squareup.cash.checks.CheckDepositsPresenterFactory;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$Factory$Impl;
import com.squareup.cash.earnings.presenters.payers.AddPayerCustomersPresenter$Factory$Impl;
import com.squareup.cash.earnings.presenters.payers.PayerTaggingPromptPresenter$Factory$Impl;
import com.squareup.cash.earnings.presenters.streamdetail.EarningsStreamDetailPresenter$Factory$Impl;
import com.squareup.cash.genericelements.backend.RealGenericTreeElementsRepo;
import com.squareup.cash.genericelements.presenters.RealGenericTreeElementsPresenter$Factory$Impl;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.growtools.presenters.manager.autoinvest.GrowToolsAutoInvestManager$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.bitcoinautowithdraw.GrowToolsBitcoinAutoWithdrawManager$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.directdeposit.GrowToolsDirectDepositManager$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.receivep2pasbtc.GrowToolsReceiveP2PAsBitcoinManager$Factory$Impl;
import com.squareup.cash.growtools.presenters.manager.roundups.GrowToolsRoundUpsManager$Factory$Impl;
import com.squareup.cash.history.payments.presenters.ProfilePaymentHistoryPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.InstrumentSelectionBlockerPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.InstrumentSelectionLoadingPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.InstrumentSelectionPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.SelectPaymentInstrumentPresenter$Factory$Impl;
import com.squareup.cash.instruments.presenters.TransferOptionPickerPresenter$Factory$Impl;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.limits.presenters.LimitsInlineMessagePresenter$MetroFactory;
import com.squareup.cash.merchant.backend.real.RealMerchantProfileRepo$MetroFactory;
import com.squareup.cash.merchant.presenters.MerchantBlockingPresenter$Factory$Impl;
import com.squareup.cash.merchant.presenters.MerchantInfoFeedbackPresenter$Factory$Impl;
import com.squareup.cash.merchant.presenters.MerchantProfilePresenter$Factory$Impl;
import com.squareup.cash.merchant.presenters.SquareLoyaltyDetailsPresenter$Factory$Impl;
import com.squareup.cash.merchant.presenters.SquareLoyaltySheetPresenter$Factory$Impl;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantBlockingScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantInfoFeedbackBottomSheetScreen;
import com.squareup.cash.merchant.screens.MerchantScreen$MerchantProfileScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltyDetailsScreen;
import com.squareup.cash.merchant.screens.SquareLoyaltySheetScreen;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.observability.types.SampleStrategy;
import com.squareup.cash.profile.devicemanager.presenters.ConfirmRemoveDevicesPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerDeviceDetailsPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerListPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.presenters.DeviceManagerRemovedSuccessPresenter$Factory$Impl;
import com.squareup.cash.profile.devicemanager.presenters.DeviceRemovalFailedPresenter$Factory$Impl;
import com.squareup.cash.recipients.data.RealCustomerStore;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.session.backend.SessionManager;
import com.squareup.cash.sharesheet.ShareSheetPresenter;
import com.squareup.cash.tax.presenters.TaxPresenterFactory;
import com.squareup.cash.work.presenters.WorkHomePresenter;
import com.squareup.protos.cash.blocksmith.actions.merchant_blocking.v1.MerchantBlockingClientService;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.DoubleCheck;
import dev.zacsweers.metro.internal.Factory;
import dev.zacsweers.metro.internal.InstanceFactory;
import io.noties.markwon.MarkwonConfiguration;
import okio.internal.DefaultSocket;

/* loaded from: classes.dex */
public final class EarningsPresenterFactory$MetroFactory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final InstanceFactory addPayerCustomersPresenterFactory;
    public final InstanceFactory earningsActivityListPresenterFactory;
    public final InstanceFactory earningsHomePresenterFactory;
    public final InstanceFactory earningsStreamDetailPresenterFactory;
    public final InstanceFactory payerTaggingPromptPresenterFactory;

    public /* synthetic */ EarningsPresenterFactory$MetroFactory(InstanceFactory instanceFactory, InstanceFactory instanceFactory2, InstanceFactory instanceFactory3, InstanceFactory instanceFactory4, InstanceFactory instanceFactory5, int i) {
        this.$r8$classId = i;
        this.earningsActivityListPresenterFactory = instanceFactory;
        this.earningsHomePresenterFactory = instanceFactory2;
        this.addPayerCustomersPresenterFactory = instanceFactory3;
        this.payerTaggingPromptPresenterFactory = instanceFactory4;
        this.earningsStreamDetailPresenterFactory = instanceFactory5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.$r8$classId;
        InstanceFactory instanceFactory = this.earningsStreamDetailPresenterFactory;
        InstanceFactory instanceFactory2 = this.payerTaggingPromptPresenterFactory;
        InstanceFactory instanceFactory3 = this.addPayerCustomersPresenterFactory;
        InstanceFactory instanceFactory4 = this.earningsHomePresenterFactory;
        InstanceFactory instanceFactory5 = this.earningsActivityListPresenterFactory;
        switch (i) {
            case 0:
                EarningsActivityListPresenter$Factory$Impl earningsActivityListPresenter$Factory$Impl = (EarningsActivityListPresenter$Factory$Impl) instanceFactory5.value;
                EarningsHomePresenter$Factory$Impl earningsHomePresenter$Factory$Impl = (EarningsHomePresenter$Factory$Impl) instanceFactory4.value;
                AddPayerCustomersPresenter$Factory$Impl addPayerCustomersPresenter$Factory$Impl = (AddPayerCustomersPresenter$Factory$Impl) instanceFactory3.value;
                PayerTaggingPromptPresenter$Factory$Impl payerTaggingPromptPresenter$Factory$Impl = (PayerTaggingPromptPresenter$Factory$Impl) instanceFactory2.value;
                EarningsStreamDetailPresenter$Factory$Impl earningsStreamDetailPresenter$Factory$Impl = (EarningsStreamDetailPresenter$Factory$Impl) instanceFactory.value;
                earningsActivityListPresenter$Factory$Impl.getClass();
                earningsHomePresenter$Factory$Impl.getClass();
                addPayerCustomersPresenter$Factory$Impl.getClass();
                payerTaggingPromptPresenter$Factory$Impl.getClass();
                earningsStreamDetailPresenter$Factory$Impl.getClass();
                return new CheckDepositsPresenterFactory(earningsActivityListPresenter$Factory$Impl, earningsHomePresenter$Factory$Impl, addPayerCustomersPresenter$Factory$Impl, payerTaggingPromptPresenter$Factory$Impl, earningsStreamDetailPresenter$Factory$Impl, 2);
            case 1:
                AfterPayOrderDetailsPresenter$Factory$Impl afterPayOrderDetailsPresenter$Factory$Impl = (AfterPayOrderDetailsPresenter$Factory$Impl) instanceFactory5.value;
                AfterPayOrderHubPresenter$Factory$Impl afterPayOrderHubPresenter$Factory$Impl = (AfterPayOrderHubPresenter$Factory$Impl) instanceFactory4.value;
                AfterPayInfoSheetPresenter$Factory$Impl afterPayInfoSheetPresenter$Factory$Impl = (AfterPayInfoSheetPresenter$Factory$Impl) instanceFactory3.value;
                AfterPayOrderDetailsOverflowActionSheetPresenter$Factory$Impl afterPayOrderDetailsOverflowActionSheetPresenter$Factory$Impl = (AfterPayOrderDetailsOverflowActionSheetPresenter$Factory$Impl) instanceFactory2.value;
                AfterPayOrderDocumentPresenter$Factory$Impl afterPayOrderDocumentPresenter$Factory$Impl = (AfterPayOrderDocumentPresenter$Factory$Impl) instanceFactory.value;
                afterPayOrderDetailsPresenter$Factory$Impl.getClass();
                afterPayOrderHubPresenter$Factory$Impl.getClass();
                afterPayInfoSheetPresenter$Factory$Impl.getClass();
                afterPayOrderDetailsOverflowActionSheetPresenter$Factory$Impl.getClass();
                afterPayOrderDocumentPresenter$Factory$Impl.getClass();
                return new CheckDepositsPresenterFactory(afterPayOrderDetailsPresenter$Factory$Impl, afterPayOrderHubPresenter$Factory$Impl, afterPayInfoSheetPresenter$Factory$Impl, afterPayOrderDetailsOverflowActionSheetPresenter$Factory$Impl, afterPayOrderDocumentPresenter$Factory$Impl, 1);
            case 2:
                LiteCashInPresenter$Factory$Impl liteCashInPresenter$Factory$Impl = (LiteCashInPresenter$Factory$Impl) instanceFactory5.value;
                LiteAddMoneyPresenter$Factory$Impl liteAddMoneyPresenter$Factory$Impl = (LiteAddMoneyPresenter$Factory$Impl) instanceFactory4.value;
                LiteCashOutPresenter$Factory$Impl liteCashOutPresenter$Factory$Impl = (LiteCashOutPresenter$Factory$Impl) instanceFactory3.value;
                LiteActivityPresenter$Factory$Impl liteActivityPresenter$Factory$Impl = (LiteActivityPresenter$Factory$Impl) instanceFactory2.value;
                LiteBalanceHomePresenter$Factory$Impl liteBalanceHomePresenter$Factory$Impl = (LiteBalanceHomePresenter$Factory$Impl) instanceFactory.value;
                liteCashInPresenter$Factory$Impl.getClass();
                liteAddMoneyPresenter$Factory$Impl.getClass();
                liteCashOutPresenter$Factory$Impl.getClass();
                liteActivityPresenter$Factory$Impl.getClass();
                liteBalanceHomePresenter$Factory$Impl.getClass();
                return new TaxPresenterFactory(liteCashInPresenter$Factory$Impl, liteAddMoneyPresenter$Factory$Impl, liteCashOutPresenter$Factory$Impl, liteActivityPresenter$Factory$Impl, liteBalanceHomePresenter$Factory$Impl);
            case 3:
                GrowToolsRoundUpsManager$Factory$Impl growToolsRoundUpsManager$Factory$Impl = (GrowToolsRoundUpsManager$Factory$Impl) instanceFactory5.value;
                GrowToolsAutoInvestManager$Factory$Impl growToolsAutoInvestManager$Factory$Impl = (GrowToolsAutoInvestManager$Factory$Impl) instanceFactory4.value;
                GrowToolsDirectDepositManager$Factory$Impl growToolsDirectDepositManager$Factory$Impl = (GrowToolsDirectDepositManager$Factory$Impl) instanceFactory3.value;
                GrowToolsReceiveP2PAsBitcoinManager$Factory$Impl growToolsReceiveP2PAsBitcoinManager$Factory$Impl = (GrowToolsReceiveP2PAsBitcoinManager$Factory$Impl) instanceFactory2.value;
                GrowToolsBitcoinAutoWithdrawManager$Factory$Impl growToolsBitcoinAutoWithdrawManager$Factory$Impl = (GrowToolsBitcoinAutoWithdrawManager$Factory$Impl) instanceFactory.value;
                growToolsRoundUpsManager$Factory$Impl.getClass();
                growToolsAutoInvestManager$Factory$Impl.getClass();
                growToolsDirectDepositManager$Factory$Impl.getClass();
                growToolsReceiveP2PAsBitcoinManager$Factory$Impl.getClass();
                growToolsBitcoinAutoWithdrawManager$Factory$Impl.getClass();
                return new MarkwonConfiguration(growToolsRoundUpsManager$Factory$Impl, growToolsAutoInvestManager$Factory$Impl, growToolsDirectDepositManager$Factory$Impl, growToolsReceiveP2PAsBitcoinManager$Factory$Impl, growToolsBitcoinAutoWithdrawManager$Factory$Impl);
            case 4:
                InstrumentSelectionPresenter$Factory$Impl instrumentSelectionPresenter$Factory$Impl = (InstrumentSelectionPresenter$Factory$Impl) instanceFactory5.value;
                InstrumentSelectionBlockerPresenter$Factory$Impl instrumentSelectionBlockerPresenter$Factory$Impl = (InstrumentSelectionBlockerPresenter$Factory$Impl) instanceFactory4.value;
                InstrumentSelectionLoadingPresenter$Factory$Impl instrumentSelectionLoadingPresenter$Factory$Impl = (InstrumentSelectionLoadingPresenter$Factory$Impl) instanceFactory3.value;
                SelectPaymentInstrumentPresenter$Factory$Impl selectPaymentInstrumentPresenter$Factory$Impl = (SelectPaymentInstrumentPresenter$Factory$Impl) instanceFactory2.value;
                TransferOptionPickerPresenter$Factory$Impl transferOptionPickerPresenter$Factory$Impl = (TransferOptionPickerPresenter$Factory$Impl) instanceFactory.value;
                instrumentSelectionPresenter$Factory$Impl.getClass();
                instrumentSelectionBlockerPresenter$Factory$Impl.getClass();
                instrumentSelectionLoadingPresenter$Factory$Impl.getClass();
                selectPaymentInstrumentPresenter$Factory$Impl.getClass();
                transferOptionPickerPresenter$Factory$Impl.getClass();
                return new CheckDepositsPresenterFactory(instrumentSelectionPresenter$Factory$Impl, instrumentSelectionBlockerPresenter$Factory$Impl, instrumentSelectionLoadingPresenter$Factory$Impl, selectPaymentInstrumentPresenter$Factory$Impl, transferOptionPickerPresenter$Factory$Impl, 3);
            case 5:
                final MerchantProfilePresenter$Factory$Impl merchantProfilePresenter$Factory$Impl = (MerchantProfilePresenter$Factory$Impl) instanceFactory5.value;
                final SquareLoyaltySheetPresenter$Factory$Impl squareLoyaltySheetPresenter$Factory$Impl = (SquareLoyaltySheetPresenter$Factory$Impl) instanceFactory4.value;
                final SquareLoyaltyDetailsPresenter$Factory$Impl squareLoyaltyDetailsPresenter$Factory$Impl = (SquareLoyaltyDetailsPresenter$Factory$Impl) instanceFactory3.value;
                final MerchantBlockingPresenter$Factory$Impl merchantBlockingPresenter$Factory$Impl = (MerchantBlockingPresenter$Factory$Impl) instanceFactory2.value;
                final MerchantInfoFeedbackPresenter$Factory$Impl merchantInfoFeedbackPresenter$Factory$Impl = (MerchantInfoFeedbackPresenter$Factory$Impl) instanceFactory.value;
                merchantProfilePresenter$Factory$Impl.getClass();
                squareLoyaltySheetPresenter$Factory$Impl.getClass();
                squareLoyaltyDetailsPresenter$Factory$Impl.getClass();
                merchantBlockingPresenter$Factory$Impl.getClass();
                merchantInfoFeedbackPresenter$Factory$Impl.getClass();
                return new PresenterFactory() { // from class: com.squareup.cash.merchant.presenters.MerchantPresenterModule$Companion$$ExternalSyntheticLambda0
                    @Override // app.cash.broadway.presenter.PresenterFactory
                    public final Presenter create(Screen screen, BetterNavigator.ScreenNavigator screenNavigator) {
                        screen.getClass();
                        if (screen instanceof MerchantScreen$MerchantProfileScreen) {
                            MerchantScreen$MerchantProfileScreen merchantScreen$MerchantProfileScreen = (MerchantScreen$MerchantProfileScreen) screen;
                            DefaultSocket defaultSocket = MerchantProfilePresenter$Factory$Impl.this.delegateFactory;
                            ProfilePaymentHistoryPresenter$Factory$Impl profilePaymentHistoryPresenter$Factory$Impl = (ProfilePaymentHistoryPresenter$Factory$Impl) ((Provider) defaultSocket.socket).invoke();
                            EglCore eglCore = (EglCore) ((RealMerchantProfileRepo$MetroFactory) defaultSocket.closeBits).invoke();
                            RealGenericTreeElementsPresenter$Factory$Impl realGenericTreeElementsPresenter$Factory$Impl = (RealGenericTreeElementsPresenter$Factory$Impl) ((Provider) defaultSocket.source).invoke();
                            RealBoostRepository realBoostRepository = (RealBoostRepository) ((DoubleCheck) defaultSocket.sink).getValue();
                            profilePaymentHistoryPresenter$Factory$Impl.getClass();
                            realGenericTreeElementsPresenter$Factory$Impl.getClass();
                            realBoostRepository.getClass();
                            return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(merchantScreen$MerchantProfileScreen, screenNavigator, profilePaymentHistoryPresenter$Factory$Impl, eglCore, realGenericTreeElementsPresenter$Factory$Impl, realBoostRepository));
                        }
                        if (screen instanceof SquareLoyaltySheetScreen) {
                            SquareLoyaltySheetScreen squareLoyaltySheetScreen = (SquareLoyaltySheetScreen) screen;
                            GetFlowLoadingPresenter$MetroFactory getFlowLoadingPresenter$MetroFactory = squareLoyaltySheetPresenter$Factory$Impl.delegateFactory;
                            Analytics analytics = (Analytics) getFlowLoadingPresenter$MetroFactory.appService.getValue();
                            RealGenericTreeElementsRepo realGenericTreeElementsRepo = (RealGenericTreeElementsRepo) getFlowLoadingPresenter$MetroFactory.flowNavigationHelper.invoke();
                            RealGenericTreeElementsPresenter$Factory$Impl realGenericTreeElementsPresenter$Factory$Impl2 = (RealGenericTreeElementsPresenter$Factory$Impl) getFlowLoadingPresenter$MetroFactory.activityFinisher.invoke();
                            analytics.getClass();
                            realGenericTreeElementsRepo.getClass();
                            realGenericTreeElementsPresenter$Factory$Impl2.getClass();
                            return MoleculePresenterKt.asPresenter$default(new WorkHomePresenter(analytics, realGenericTreeElementsRepo, realGenericTreeElementsPresenter$Factory$Impl2, screenNavigator, squareLoyaltySheetScreen));
                        }
                        if (screen instanceof SquareLoyaltyDetailsScreen) {
                            SquareLoyaltyDetailsScreen squareLoyaltyDetailsScreen = (SquareLoyaltyDetailsScreen) screen;
                            LimitsInlineMessagePresenter$MetroFactory limitsInlineMessagePresenter$MetroFactory = squareLoyaltyDetailsPresenter$Factory$Impl.delegateFactory;
                            Analytics analytics2 = (Analytics) limitsInlineMessagePresenter$MetroFactory.appService.getValue();
                            RealRouter$Factory$Impl realRouter$Factory$Impl = (RealRouter$Factory$Impl) limitsInlineMessagePresenter$MetroFactory.limitsPageletStore.invoke();
                            RealGenericTreeElementsRepo realGenericTreeElementsRepo2 = (RealGenericTreeElementsRepo) limitsInlineMessagePresenter$MetroFactory.routerFactory.invoke();
                            RealGenericTreeElementsPresenter$Factory$Impl realGenericTreeElementsPresenter$Factory$Impl3 = (RealGenericTreeElementsPresenter$Factory$Impl) limitsInlineMessagePresenter$MetroFactory.lastSeenPageletVersion.invoke();
                            analytics2.getClass();
                            realRouter$Factory$Impl.getClass();
                            realGenericTreeElementsRepo2.getClass();
                            realGenericTreeElementsPresenter$Factory$Impl3.getClass();
                            return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(analytics2, realRouter$Factory$Impl, realGenericTreeElementsRepo2, realGenericTreeElementsPresenter$Factory$Impl3, screenNavigator, squareLoyaltyDetailsScreen));
                        }
                        if (!(screen instanceof MerchantScreen$MerchantBlockingScreen)) {
                            if (!(screen instanceof MerchantScreen$MerchantInfoFeedbackBottomSheetScreen)) {
                                return null;
                            }
                            MerchantScreen$MerchantInfoFeedbackBottomSheetScreen merchantScreen$MerchantInfoFeedbackBottomSheetScreen = (MerchantScreen$MerchantInfoFeedbackBottomSheetScreen) screen;
                            MerchantInfoFeedbackPresenter$MetroFactory merchantInfoFeedbackPresenter$MetroFactory = merchantInfoFeedbackPresenter$Factory$Impl.delegateFactory;
                            RealCustomerStore realCustomerStore = (RealCustomerStore) merchantInfoFeedbackPresenter$MetroFactory.customerStore.invoke();
                            AndroidStringManager androidStringManager = (AndroidStringManager) merchantInfoFeedbackPresenter$MetroFactory.stringManager.lambda.invoke();
                            Analytics analytics3 = (Analytics) merchantInfoFeedbackPresenter$MetroFactory.analytics.getValue();
                            SessionManager sessionManager = (SessionManager) merchantInfoFeedbackPresenter$MetroFactory.sessionManager.lambda.invoke();
                            realCustomerStore.getClass();
                            androidStringManager.getClass();
                            analytics3.getClass();
                            sessionManager.getClass();
                            return MoleculePresenterKt.asPresenter$default(new ShareSheetPresenter(realCustomerStore, androidStringManager, analytics3, sessionManager, merchantScreen$MerchantInfoFeedbackBottomSheetScreen, screenNavigator));
                        }
                        MerchantScreen$MerchantBlockingScreen merchantScreen$MerchantBlockingScreen = (MerchantScreen$MerchantBlockingScreen) screen;
                        LocalCashBalancePresenter.MetroFactory metroFactory = merchantBlockingPresenter$Factory$Impl.delegateFactory;
                        AndroidStringManager androidStringManager2 = (AndroidStringManager) metroFactory.sessionManager.lambda.invoke();
                        MerchantBlockingClientService merchantBlockingClientService = (MerchantBlockingClientService) metroFactory.syncer.getValue();
                        FlowStarter flowStarter = (FlowStarter) metroFactory.analytics.getValue();
                        BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) metroFactory.launcher.invoke();
                        SessionManager sessionManager2 = (SessionManager) metroFactory.stringManager.lambda.invoke();
                        Analytics analytics4 = (Analytics) metroFactory.service.getValue();
                        RealRouter$Factory$Impl realRouter$Factory$Impl2 = (RealRouter$Factory$Impl) metroFactory.timestampFormatterFactory.invoke();
                        ErrorReporter errorReporter = (ErrorReporter) metroFactory.clock.lambda.invoke();
                        SampleStrategy sampleStrategy = (SampleStrategy) metroFactory.store.invoke();
                        androidStringManager2.getClass();
                        merchantBlockingClientService.getClass();
                        flowStarter.getClass();
                        blockersDataNavigator.getClass();
                        sessionManager2.getClass();
                        analytics4.getClass();
                        realRouter$Factory$Impl2.getClass();
                        errorReporter.getClass();
                        sampleStrategy.getClass();
                        return MoleculePresenterKt.asPresenter$default(new LocalCashBalancePresenter(androidStringManager2, merchantBlockingClientService, flowStarter, blockersDataNavigator, sessionManager2, analytics4, realRouter$Factory$Impl2, merchantScreen$MerchantBlockingScreen, screenNavigator, errorReporter, sampleStrategy));
                    }
                };
            default:
                DeviceManagerListPresenter$Factory$Impl deviceManagerListPresenter$Factory$Impl = (DeviceManagerListPresenter$Factory$Impl) instanceFactory5.value;
                DeviceManagerDeviceDetailsPresenter$Factory$Impl deviceManagerDeviceDetailsPresenter$Factory$Impl = (DeviceManagerDeviceDetailsPresenter$Factory$Impl) instanceFactory4.value;
                DeviceManagerRemovedSuccessPresenter$Factory$Impl deviceManagerRemovedSuccessPresenter$Factory$Impl = (DeviceManagerRemovedSuccessPresenter$Factory$Impl) instanceFactory3.value;
                DeviceRemovalFailedPresenter$Factory$Impl deviceRemovalFailedPresenter$Factory$Impl = (DeviceRemovalFailedPresenter$Factory$Impl) instanceFactory2.value;
                ConfirmRemoveDevicesPresenter$Factory$Impl confirmRemoveDevicesPresenter$Factory$Impl = (ConfirmRemoveDevicesPresenter$Factory$Impl) instanceFactory.value;
                deviceManagerListPresenter$Factory$Impl.getClass();
                deviceManagerDeviceDetailsPresenter$Factory$Impl.getClass();
                deviceManagerRemovedSuccessPresenter$Factory$Impl.getClass();
                deviceRemovalFailedPresenter$Factory$Impl.getClass();
                confirmRemoveDevicesPresenter$Factory$Impl.getClass();
                return new TaxPresenterFactory(deviceManagerListPresenter$Factory$Impl, deviceManagerDeviceDetailsPresenter$Factory$Impl, deviceManagerRemovedSuccessPresenter$Factory$Impl, deviceRemovalFailedPresenter$Factory$Impl, confirmRemoveDevicesPresenter$Factory$Impl);
        }
    }
}
