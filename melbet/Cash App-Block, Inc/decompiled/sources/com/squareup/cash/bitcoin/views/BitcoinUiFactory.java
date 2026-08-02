package com.squareup.cash.bitcoin.views;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.ViewGroup;
import androidx.camera.viewfinder.core.impl.Transformations;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.CanvasUtils;
import androidx.compose.ui.node.BackwardsCompatNodeKt;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.bitcoin.screens.BitcoinAmountPickerScreen;
import com.squareup.cash.bitcoin.screens.BitcoinAutoWithdrawUpsellScreen;
import com.squareup.cash.bitcoin.screens.BitcoinDepositsScreen;
import com.squareup.cash.bitcoin.screens.BitcoinExchangeFullScreen;
import com.squareup.cash.bitcoin.screens.BitcoinFeatureUnavailableScreen;
import com.squareup.cash.bitcoin.screens.BitcoinInstrumentRecommendationScreen;
import com.squareup.cash.bitcoin.screens.BitcoinLocationScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapOnboardingScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapScreen;
import com.squareup.cash.bitcoin.screens.BitcoinPayInUsdSettingsScreen;
import com.squareup.cash.bitcoin.screens.BitcoinPeriodSelectionScreen;
import com.squareup.cash.bitcoin.screens.BitcoinQrCodeScannerScreen;
import com.squareup.cash.bitcoin.screens.BitcoinRoundUpsCardUpsellScreen;
import com.squareup.cash.bitcoin.screens.BitcoinSendRestrictionScreen;
import com.squareup.cash.bitcoin.screens.MoveBitcoinScreen;
import com.squareup.cash.bitcoin.screens.ReceiveStablecoinScreen;
import com.squareup.cash.bitcoin.screens.SendStablecoinScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositOptionsScreen;
import com.squareup.cash.bitcoin.screens.StablecoinDepositScreen;
import com.squareup.cash.bitcoin.screens.StablecoinOnboardingScreen;
import com.squareup.cash.bitcoin.viewmodels.BitcoinAmountViewModel;
import com.squareup.cash.bitcoin.viewmodels.BitcoinDepositsViewModel;
import com.squareup.cash.bitcoin.viewmodels.MoveBitcoinModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinLocationViewModel;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.SendStablecoinModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositOptionsViewModel;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositViewModel$Loaded;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.family.familyhub.screens.ControlDisablingConfirmationScreen;
import com.squareup.cash.family.familyhub.screens.ControlErrorScreen;
import com.squareup.cash.family.familyhub.screens.DependentActivityScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlScreen;
import com.squareup.cash.family.familyhub.screens.DependentControlsAndLimitsScreen;
import com.squareup.cash.family.familyhub.screens.DependentDetailIntroductionDialog;
import com.squareup.cash.family.familyhub.screens.DependentDetailScreen;
import com.squareup.cash.family.familyhub.screens.DependentGeneralSavingsScreen;
import com.squareup.cash.family.familyhub.screens.DependentTeenQrCodeShareSheetScreen;
import com.squareup.cash.family.familyhub.screens.FamilyHome;
import com.squareup.cash.family.familyhub.screens.FamilyPendingRequestsScreen;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferLoadingScreen;
import com.squareup.cash.family.familyhub.screens.ManagedAccountTransferScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitErrorScreen;
import com.squareup.cash.family.familyhub.screens.SetDependentCustomLimitScreen;
import com.squareup.cash.family.familyhub.screens.SponsorDetailScreen;
import com.squareup.cash.family.familyhub.screens.SponsorLedInviteScreen;
import com.squareup.cash.family.familyhub.screens.SponsorResourcesScreen;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailIntroductionViewModel;
import com.squareup.cash.family.familyhub.viewmodels.DependentDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyHomeViewModel;
import com.squareup.cash.family.familyhub.viewmodels.FamilyPendingRequestsViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorDetailViewModel;
import com.squareup.cash.family.familyhub.viewmodels.SponsorLedInviteViewModel;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.family.familyhub.views.FamilyAmountSelectionBottomSheet;
import com.squareup.cash.featureflags.AmplitudeExperiments$CashBitcoinSymbolDisplaySetting;
import com.squareup.cash.featureflags.AmplitudeExperiments$MoneybotTopControlsTransition;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.featureflags.RealSessionFlags;
import com.squareup.cash.filepicker.RealFilePicker$Factory$Impl;
import com.squareup.cash.maps.engine.providers.GoogleMapEngineProvider;
import com.squareup.cash.maps.engine.providers.MapEngineProviderKt;
import com.squareup.cash.money.views.MoneyUiFactory$$ExternalSyntheticLambda0;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.screens.MoneybotAmountInputScreen;
import com.squareup.cash.moneybot.screens.MoneybotAutomationsScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatHistoryScreen;
import com.squareup.cash.moneybot.screens.MoneybotChatScreen;
import com.squareup.cash.moneybot.screens.MoneybotDebugOverlayScreen;
import com.squareup.cash.moneybot.screens.MoneybotFeedbackScreen;
import com.squareup.cash.moneybot.screens.MoneybotHomeScreen;
import com.squareup.cash.moneybot.screens.MoneybotOverflowMenuScreen;
import com.squareup.cash.moneybot.screens.MoneybotPreambleEditorScreen;
import com.squareup.cash.moneybot.screens.MoneybotScreen;
import com.squareup.cash.moneybot.screens.MoneybotStaticPickerScreen;
import com.squareup.cash.moneybot.screens.MoneybotTextInputScreen;
import com.squareup.cash.moneybot.screens.RawMessagesScreen;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.viewmodels.feedback.MoneybotFeedbackViewModel;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.moneybot.views.inject.ComposableSingletons$MoneybotUiFactoryKt;
import com.squareup.cash.moneybot.views.inject.MoneybotUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.observability.backend.real.RealObservabilityManager;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.paymentpad.screens.LitePaymentPadSheetScreen;
import com.squareup.cash.paymentpad.screens.LowDiskSpaceAlertDialogScreen;
import com.squareup.cash.paymentpad.views.LowDiskSpaceAlertDialog;
import com.squareup.cash.paymentpad.views.PaymentPadUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$PaymentPad;
import com.squareup.cash.profile.views.ProfileUiView;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.recurringpayments.screens.CreateOrEditRecurringPaymentScreen;
import com.squareup.cash.recurringpayments.screens.SelectCadenceScreen;
import com.squareup.cash.recurringpayments.screens.SelectDayOfCadenceScreen;
import com.squareup.cash.recurringpayments.views.SelectCadenceView;
import com.squareup.cash.recurringpayments.views.SelectDayOfCadenceView;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.chat.screens.SupportChatScreens;
import com.squareup.cash.support.chat.views.ChatErrorDialogView;
import com.squareup.cash.support.chat.views.ChatExitPromptSheetView;
import com.squareup.cash.support.chat.views.ChatExitPromptView;
import com.squareup.cash.support.chat.views.ChatFailedDeliverySheetView;
import com.squareup.cash.support.chat.views.ChatLoadingView;
import com.squareup.cash.support.chat.views.ChatView;
import com.squareup.cash.support.chat.views.survey.ChatSurveyUnavailableView;
import com.squareup.cash.support.chat.views.survey.ChatSurveyView;
import com.squareup.cash.transfers.views.AddMoneyView;
import com.squareup.cash.transfers.views.WithdrawView;
import com.squareup.cash.ui.SplashScreenAnimationObserver;
import com.squareup.cash.ui.util.RealCashScreenBrightness;
import com.squareup.cash.ui.util.RealCashVibrator;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.StateFlow;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes.dex */
public final class BitcoinUiFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object cashScreenBrightness;
    public final Object featureFlagManager;
    public final RealImageLoader imageLoader;
    public final Object mapEngineProvider;
    public final Object vibrator;

    public BitcoinUiFactory(RealCashVibrator realCashVibrator, RealImageLoader realImageLoader, ElementBoundsRegistry elementBoundsRegistry, SplashScreenAnimationObserver splashScreenAnimationObserver, FeatureFlagManager featureFlagManager) {
        this.$r8$classId = 3;
        this.vibrator = realCashVibrator;
        this.imageLoader = realImageLoader;
        this.cashScreenBrightness = elementBoundsRegistry;
        this.mapEngineProvider = splashScreenAnimationObserver;
        this.featureFlagManager = featureFlagManager;
    }

    public static UiFactory.ComposeUi themedComposeUi(ComposableLambdaImpl composableLambdaImpl, boolean z) {
        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneybotUiFactory$$ExternalSyntheticLambda3(composableLambdaImpl, z), true, -1283779349));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11, types: [com.squareup.cash.support.chat.views.ChatView] */
    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        ComposeUiView familyAmountSelectionBottomSheet;
        int i = this.$r8$classId;
        final int i2 = 4;
        final int i3 = 3;
        Object obj = this.mapEngineProvider;
        Object obj2 = this.cashScreenBrightness;
        Object obj3 = this.vibrator;
        final int i4 = 5;
        final int i5 = 2;
        Object obj4 = this.featureFlagManager;
        final int i6 = 0;
        UiFactory.ComposeUi composeUi = null;
        final int i7 = 1;
        switch (i) {
            case 0:
                context.getClass();
                final boolean enabled = ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj4)).peekCurrentValue(AmplitudeExperiments$CashBitcoinSymbolDisplaySetting.INSTANCE)).enabled();
                if (screen instanceof BitcoinRoundUpsCardUpsellScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.lambda$1068675998);
                }
                if (screen instanceof BitcoinAutoWithdrawUpsellScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.f250lambda$1702294378);
                }
                if (screen instanceof BitcoinExchangeFullScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i8 = i6;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i8) {
                                case 0:
                                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinTransferViewModel.getClass();
                                    function1.getClass();
                                    BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi(bitcoinTransferViewModel, function1, bitcoinUiFactory.imageLoader, null, (Composer) obj7, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinMapViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) bitcoinUiFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-440479512, new BitcoinUiFactory$$ExternalSyntheticLambda12(0, (Object) bitcoinMapViewModel, (Object) function12), composer), composer, 56);
                                    break;
                                case 2:
                                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj5;
                                    Function1 function13 = (Function1) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinLocationViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2030024856, new BitcoinUiFactory$$ExternalSyntheticLambda11(bitcoinLocationViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj5;
                                    Function1 function14 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    qrAddressScannerViewModel.getClass();
                                    function14.getClass();
                                    CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel, function14, (RealCashVibrator) bitcoinUiFactory.vibrator, null, null, (Composer) obj7, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 56);
                                    break;
                                case 4:
                                    BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj5;
                                    Function1 function15 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    bitcoinDepositsViewModel.getClass();
                                    function15.getClass();
                                    BitcoinDepositsViewKt.BitcoinDepositsView(bitcoinDepositsViewModel, function15, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 5:
                                    SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj5;
                                    Function1 function16 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    sendStablecoinModel.getClass();
                                    function16.getClass();
                                    SendStablecoinViewKt.SendStablecoinView(sendStablecoinModel, function16, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function17 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded.getClass();
                                    function17.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded, function17, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded2 = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function18 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded2.getClass();
                                    function18.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded2, function18, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj5;
                                    Function1 function19 = (Function1) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    stablecoinDepositOptionsViewModel.getClass();
                                    function19.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(169806036, new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function19), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1691199374));
                }
                if ((screen instanceof BlockersScreens.BitcoinAmountScreen) || (screen instanceof BitcoinAmountPickerScreen)) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i8;
                            int i9 = i6;
                            BitcoinUiFactory bitcoinUiFactory = this;
                            switch (i9) {
                                case 0:
                                    BitcoinAmountViewModel bitcoinAmountViewModel = (BitcoinAmountViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinAmountViewModel.getClass();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i8 = (((GapComposer) composer).changed(bitcoinAmountViewModel) ? 4 : 2) | intValue;
                                    } else {
                                        i8 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i8 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i8 & 1, (i8 & 147) != 146)) {
                                        CanvasUtils.BitcoinAmountPickerView(bitcoinAmountViewModel, enabled, function1, (RealCashVibrator) bitcoinUiFactory.vibrator, gapComposer, (i8 & 14) | ((i8 << 3) & 896));
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    MoveBitcoinModel moveBitcoinModel = (MoveBitcoinModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    moveBitcoinModel.getClass();
                                    function12.getClass();
                                    MoveBitcoinViewKt.MoveBitcoinView(moveBitcoinModel, enabled, function12, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, (intValue2 & 14) | ((intValue2 << 3) & 896));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -114974170));
                }
                if (screen instanceof BitcoinQrCodeScannerScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i8 = i3;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i8) {
                                case 0:
                                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinTransferViewModel.getClass();
                                    function1.getClass();
                                    BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi(bitcoinTransferViewModel, function1, bitcoinUiFactory.imageLoader, null, (Composer) obj7, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinMapViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) bitcoinUiFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-440479512, new BitcoinUiFactory$$ExternalSyntheticLambda12(0, (Object) bitcoinMapViewModel, (Object) function12), composer), composer, 56);
                                    break;
                                case 2:
                                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj5;
                                    Function1 function13 = (Function1) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinLocationViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2030024856, new BitcoinUiFactory$$ExternalSyntheticLambda11(bitcoinLocationViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj5;
                                    Function1 function14 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    qrAddressScannerViewModel.getClass();
                                    function14.getClass();
                                    CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel, function14, (RealCashVibrator) bitcoinUiFactory.vibrator, null, null, (Composer) obj7, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 56);
                                    break;
                                case 4:
                                    BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj5;
                                    Function1 function15 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    bitcoinDepositsViewModel.getClass();
                                    function15.getClass();
                                    BitcoinDepositsViewKt.BitcoinDepositsView(bitcoinDepositsViewModel, function15, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 5:
                                    SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj5;
                                    Function1 function16 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    sendStablecoinModel.getClass();
                                    function16.getClass();
                                    SendStablecoinViewKt.SendStablecoinView(sendStablecoinModel, function16, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function17 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded.getClass();
                                    function17.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded, function17, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded2 = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function18 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded2.getClass();
                                    function18.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded2, function18, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj5;
                                    Function1 function19 = (Function1) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    stablecoinDepositOptionsViewModel.getClass();
                                    function19.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(169806036, new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function19), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1567526364));
                }
                if (screen instanceof BitcoinFeatureUnavailableScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.f249lambda$1685368762);
                }
                if (screen instanceof MoveBitcoinScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i8;
                            int i9 = i7;
                            BitcoinUiFactory bitcoinUiFactory = this;
                            switch (i9) {
                                case 0:
                                    BitcoinAmountViewModel bitcoinAmountViewModel = (BitcoinAmountViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinAmountViewModel.getClass();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i8 = (((GapComposer) composer).changed(bitcoinAmountViewModel) ? 4 : 2) | intValue;
                                    } else {
                                        i8 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i8 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i8 & 1, (i8 & 147) != 146)) {
                                        CanvasUtils.BitcoinAmountPickerView(bitcoinAmountViewModel, enabled, function1, (RealCashVibrator) bitcoinUiFactory.vibrator, gapComposer, (i8 & 14) | ((i8 << 3) & 896));
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                default:
                                    MoveBitcoinModel moveBitcoinModel = (MoveBitcoinModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    moveBitcoinModel.getClass();
                                    function12.getClass();
                                    MoveBitcoinViewKt.MoveBitcoinView(moveBitcoinModel, enabled, function12, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, (intValue2 & 14) | ((intValue2 << 3) & 896));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -856024585));
                }
                if (screen instanceof BitcoinDepositsScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i8 = i2;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i8) {
                                case 0:
                                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinTransferViewModel.getClass();
                                    function1.getClass();
                                    BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi(bitcoinTransferViewModel, function1, bitcoinUiFactory.imageLoader, null, (Composer) obj7, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinMapViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) bitcoinUiFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-440479512, new BitcoinUiFactory$$ExternalSyntheticLambda12(0, (Object) bitcoinMapViewModel, (Object) function12), composer), composer, 56);
                                    break;
                                case 2:
                                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj5;
                                    Function1 function13 = (Function1) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinLocationViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2030024856, new BitcoinUiFactory$$ExternalSyntheticLambda11(bitcoinLocationViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj5;
                                    Function1 function14 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    qrAddressScannerViewModel.getClass();
                                    function14.getClass();
                                    CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel, function14, (RealCashVibrator) bitcoinUiFactory.vibrator, null, null, (Composer) obj7, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 56);
                                    break;
                                case 4:
                                    BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj5;
                                    Function1 function15 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    bitcoinDepositsViewModel.getClass();
                                    function15.getClass();
                                    BitcoinDepositsViewKt.BitcoinDepositsView(bitcoinDepositsViewModel, function15, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 5:
                                    SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj5;
                                    Function1 function16 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    sendStablecoinModel.getClass();
                                    function16.getClass();
                                    SendStablecoinViewKt.SendStablecoinView(sendStablecoinModel, function16, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function17 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded.getClass();
                                    function17.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded, function17, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded2 = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function18 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded2.getClass();
                                    function18.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded2, function18, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj5;
                                    Function1 function19 = (Function1) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    stablecoinDepositOptionsViewModel.getClass();
                                    function19.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(169806036, new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function19), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1026997133));
                }
                if (screen instanceof SendStablecoinScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i8 = i4;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i8) {
                                case 0:
                                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinTransferViewModel.getClass();
                                    function1.getClass();
                                    BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi(bitcoinTransferViewModel, function1, bitcoinUiFactory.imageLoader, null, (Composer) obj7, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinMapViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) bitcoinUiFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-440479512, new BitcoinUiFactory$$ExternalSyntheticLambda12(0, (Object) bitcoinMapViewModel, (Object) function12), composer), composer, 56);
                                    break;
                                case 2:
                                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj5;
                                    Function1 function13 = (Function1) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinLocationViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2030024856, new BitcoinUiFactory$$ExternalSyntheticLambda11(bitcoinLocationViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj5;
                                    Function1 function14 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    qrAddressScannerViewModel.getClass();
                                    function14.getClass();
                                    CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel, function14, (RealCashVibrator) bitcoinUiFactory.vibrator, null, null, (Composer) obj7, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 56);
                                    break;
                                case 4:
                                    BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj5;
                                    Function1 function15 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    bitcoinDepositsViewModel.getClass();
                                    function15.getClass();
                                    BitcoinDepositsViewKt.BitcoinDepositsView(bitcoinDepositsViewModel, function15, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 5:
                                    SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj5;
                                    Function1 function16 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    sendStablecoinModel.getClass();
                                    function16.getClass();
                                    SendStablecoinViewKt.SendStablecoinView(sendStablecoinModel, function16, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function17 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded.getClass();
                                    function17.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded, function17, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded2 = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function18 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded2.getClass();
                                    function18.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded2, function18, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj5;
                                    Function1 function19 = (Function1) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    stablecoinDepositOptionsViewModel.getClass();
                                    function19.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(169806036, new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function19), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 2099203164));
                }
                if (screen instanceof ReceiveStablecoinScreen) {
                    final int i8 = 6;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i82 = i8;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i82) {
                                case 0:
                                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinTransferViewModel.getClass();
                                    function1.getClass();
                                    BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi(bitcoinTransferViewModel, function1, bitcoinUiFactory.imageLoader, null, (Composer) obj7, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinMapViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) bitcoinUiFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-440479512, new BitcoinUiFactory$$ExternalSyntheticLambda12(0, (Object) bitcoinMapViewModel, (Object) function12), composer), composer, 56);
                                    break;
                                case 2:
                                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj5;
                                    Function1 function13 = (Function1) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinLocationViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2030024856, new BitcoinUiFactory$$ExternalSyntheticLambda11(bitcoinLocationViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj5;
                                    Function1 function14 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    qrAddressScannerViewModel.getClass();
                                    function14.getClass();
                                    CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel, function14, (RealCashVibrator) bitcoinUiFactory.vibrator, null, null, (Composer) obj7, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 56);
                                    break;
                                case 4:
                                    BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj5;
                                    Function1 function15 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    bitcoinDepositsViewModel.getClass();
                                    function15.getClass();
                                    BitcoinDepositsViewKt.BitcoinDepositsView(bitcoinDepositsViewModel, function15, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 5:
                                    SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj5;
                                    Function1 function16 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    sendStablecoinModel.getClass();
                                    function16.getClass();
                                    SendStablecoinViewKt.SendStablecoinView(sendStablecoinModel, function16, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function17 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded.getClass();
                                    function17.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded, function17, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded2 = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function18 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded2.getClass();
                                    function18.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded2, function18, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj5;
                                    Function1 function19 = (Function1) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    stablecoinDepositOptionsViewModel.getClass();
                                    function19.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(169806036, new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function19), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1350401136));
                }
                if (screen instanceof StablecoinOnboardingScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.lambda$134384781);
                }
                if (screen instanceof StablecoinDepositScreen) {
                    final int i9 = 7;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i82 = i9;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i82) {
                                case 0:
                                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinTransferViewModel.getClass();
                                    function1.getClass();
                                    BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi(bitcoinTransferViewModel, function1, bitcoinUiFactory.imageLoader, null, (Composer) obj7, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinMapViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) bitcoinUiFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-440479512, new BitcoinUiFactory$$ExternalSyntheticLambda12(0, (Object) bitcoinMapViewModel, (Object) function12), composer), composer, 56);
                                    break;
                                case 2:
                                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj5;
                                    Function1 function13 = (Function1) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinLocationViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2030024856, new BitcoinUiFactory$$ExternalSyntheticLambda11(bitcoinLocationViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj5;
                                    Function1 function14 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    qrAddressScannerViewModel.getClass();
                                    function14.getClass();
                                    CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel, function14, (RealCashVibrator) bitcoinUiFactory.vibrator, null, null, (Composer) obj7, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 56);
                                    break;
                                case 4:
                                    BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj5;
                                    Function1 function15 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    bitcoinDepositsViewModel.getClass();
                                    function15.getClass();
                                    BitcoinDepositsViewKt.BitcoinDepositsView(bitcoinDepositsViewModel, function15, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 5:
                                    SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj5;
                                    Function1 function16 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    sendStablecoinModel.getClass();
                                    function16.getClass();
                                    SendStablecoinViewKt.SendStablecoinView(sendStablecoinModel, function16, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function17 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded.getClass();
                                    function17.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded, function17, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded2 = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function18 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded2.getClass();
                                    function18.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded2, function18, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj5;
                                    Function1 function19 = (Function1) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    stablecoinDepositOptionsViewModel.getClass();
                                    function19.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(169806036, new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function19), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1149613405));
                }
                if (screen instanceof StablecoinDepositOptionsScreen) {
                    final int i10 = 8;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i82 = i10;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i82) {
                                case 0:
                                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinTransferViewModel.getClass();
                                    function1.getClass();
                                    BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi(bitcoinTransferViewModel, function1, bitcoinUiFactory.imageLoader, null, (Composer) obj7, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinMapViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) bitcoinUiFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-440479512, new BitcoinUiFactory$$ExternalSyntheticLambda12(0, (Object) bitcoinMapViewModel, (Object) function12), composer), composer, 56);
                                    break;
                                case 2:
                                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj5;
                                    Function1 function13 = (Function1) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinLocationViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2030024856, new BitcoinUiFactory$$ExternalSyntheticLambda11(bitcoinLocationViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj5;
                                    Function1 function14 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    qrAddressScannerViewModel.getClass();
                                    function14.getClass();
                                    CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel, function14, (RealCashVibrator) bitcoinUiFactory.vibrator, null, null, (Composer) obj7, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 56);
                                    break;
                                case 4:
                                    BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj5;
                                    Function1 function15 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    bitcoinDepositsViewModel.getClass();
                                    function15.getClass();
                                    BitcoinDepositsViewKt.BitcoinDepositsView(bitcoinDepositsViewModel, function15, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 5:
                                    SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj5;
                                    Function1 function16 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    sendStablecoinModel.getClass();
                                    function16.getClass();
                                    SendStablecoinViewKt.SendStablecoinView(sendStablecoinModel, function16, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function17 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded.getClass();
                                    function17.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded, function17, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded2 = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function18 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded2.getClass();
                                    function18.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded2, function18, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj5;
                                    Function1 function19 = (Function1) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    stablecoinDepositOptionsViewModel.getClass();
                                    function19.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(169806036, new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function19), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -2050263660));
                }
                if (screen instanceof BitcoinPeriodSelectionScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.f248lambda$1595125122);
                }
                if (screen instanceof BitcoinMapScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i82 = i7;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i82) {
                                case 0:
                                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinTransferViewModel.getClass();
                                    function1.getClass();
                                    BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi(bitcoinTransferViewModel, function1, bitcoinUiFactory.imageLoader, null, (Composer) obj7, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinMapViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) bitcoinUiFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-440479512, new BitcoinUiFactory$$ExternalSyntheticLambda12(0, (Object) bitcoinMapViewModel, (Object) function12), composer), composer, 56);
                                    break;
                                case 2:
                                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj5;
                                    Function1 function13 = (Function1) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinLocationViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2030024856, new BitcoinUiFactory$$ExternalSyntheticLambda11(bitcoinLocationViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj5;
                                    Function1 function14 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    qrAddressScannerViewModel.getClass();
                                    function14.getClass();
                                    CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel, function14, (RealCashVibrator) bitcoinUiFactory.vibrator, null, null, (Composer) obj7, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 56);
                                    break;
                                case 4:
                                    BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj5;
                                    Function1 function15 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    bitcoinDepositsViewModel.getClass();
                                    function15.getClass();
                                    BitcoinDepositsViewKt.BitcoinDepositsView(bitcoinDepositsViewModel, function15, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 5:
                                    SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj5;
                                    Function1 function16 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    sendStablecoinModel.getClass();
                                    function16.getClass();
                                    SendStablecoinViewKt.SendStablecoinView(sendStablecoinModel, function16, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function17 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded.getClass();
                                    function17.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded, function17, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded2 = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function18 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded2.getClass();
                                    function18.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded2, function18, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj5;
                                    Function1 function19 = (Function1) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    stablecoinDepositOptionsViewModel.getClass();
                                    function19.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(169806036, new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function19), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 865373608));
                }
                if (screen instanceof BitcoinLocationScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i82 = i5;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i82) {
                                case 0:
                                    BitcoinTransferViewModel bitcoinTransferViewModel = (BitcoinTransferViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    bitcoinTransferViewModel.getClass();
                                    function1.getClass();
                                    BackwardsCompatNodeKt.BitcoinExchangeFullScreenUi(bitcoinTransferViewModel, function1, bitcoinUiFactory.imageLoader, null, (Composer) obj7, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    BitcoinMapViewModel bitcoinMapViewModel = (BitcoinMapViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinMapViewModel.getClass();
                                    function12.getClass();
                                    Updater.CompositionLocalProvider(MapEngineProviderKt.getLocalMapEngineProvider().defaultProvidedValue$runtime((GoogleMapEngineProvider) bitcoinUiFactory.mapEngineProvider), Expect_jvmKt.rememberComposableLambda(-440479512, new BitcoinUiFactory$$ExternalSyntheticLambda12(0, (Object) bitcoinMapViewModel, (Object) function12), composer), composer, 56);
                                    break;
                                case 2:
                                    BitcoinLocationViewModel bitcoinLocationViewModel = (BitcoinLocationViewModel) obj5;
                                    Function1 function13 = (Function1) obj6;
                                    Composer composer2 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    bitcoinLocationViewModel.getClass();
                                    function13.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-2030024856, new BitcoinUiFactory$$ExternalSyntheticLambda11(bitcoinLocationViewModel, function13), composer2), composer2, 56);
                                    break;
                                case 3:
                                    QrAddressScannerViewModel qrAddressScannerViewModel = (QrAddressScannerViewModel) obj5;
                                    Function1 function14 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    qrAddressScannerViewModel.getClass();
                                    function14.getClass();
                                    CameraXPreviewKt.QrAddressScannerView(qrAddressScannerViewModel, function14, (RealCashVibrator) bitcoinUiFactory.vibrator, null, null, (Composer) obj7, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 56);
                                    break;
                                case 4:
                                    BitcoinDepositsViewModel bitcoinDepositsViewModel = (BitcoinDepositsViewModel) obj5;
                                    Function1 function15 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    bitcoinDepositsViewModel.getClass();
                                    function15.getClass();
                                    BitcoinDepositsViewKt.BitcoinDepositsView(bitcoinDepositsViewModel, function15, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue3 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 5:
                                    SendStablecoinModel sendStablecoinModel = (SendStablecoinModel) obj5;
                                    Function1 function16 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    sendStablecoinModel.getClass();
                                    function16.getClass();
                                    SendStablecoinViewKt.SendStablecoinView(sendStablecoinModel, function16, (RealCashVibrator) bitcoinUiFactory.vibrator, null, (Composer) obj7, intValue4 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function17 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded.getClass();
                                    function17.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded, function17, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue5 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    StablecoinDepositViewModel$Loaded stablecoinDepositViewModel$Loaded2 = (StablecoinDepositViewModel$Loaded) obj5;
                                    Function1 function18 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    stablecoinDepositViewModel$Loaded2.getClass();
                                    function18.getClass();
                                    SendStablecoinViewKt.StablecoinDepositView(stablecoinDepositViewModel$Loaded2, function18, (RealCashScreenBrightness) bitcoinUiFactory.cashScreenBrightness, null, (Composer) obj7, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                default:
                                    StablecoinDepositOptionsViewModel stablecoinDepositOptionsViewModel = (StablecoinDepositOptionsViewModel) obj5;
                                    Function1 function19 = (Function1) obj6;
                                    Composer composer3 = (Composer) obj7;
                                    ((Integer) obj8).getClass();
                                    stablecoinDepositOptionsViewModel.getClass();
                                    function19.getClass();
                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(bitcoinUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(169806036, new BitcoinUiFactory$$ExternalSyntheticLambda13(stablecoinDepositOptionsViewModel, function19), composer3), composer3, 56);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1392344408));
                }
                if (screen instanceof BitcoinMapErrorScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.lambda$1775473536);
                }
                if (screen instanceof BitcoinMapOnboardingScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.lambda$1545670438);
                }
                if (screen instanceof BitcoinPayInUsdSettingsScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.f246lambda$1293106670);
                }
                if (screen instanceof BitcoinInstrumentRecommendationScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.lambda$769318391);
                }
                if (screen instanceof BitcoinSendRestrictionScreen) {
                    return new UiFactory.ComposeUi(BitcoinInvoiceEntryViewKt.lambda$1692230923);
                }
                return null;
            case 1:
                LocalizedMoneyFormatter.Factory factory = (LocalizedMoneyFormatter.Factory) obj;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj3;
                context.getClass();
                boolean z = screen instanceof DependentActivityScreen;
                RealImageLoader realImageLoader = this.imageLoader;
                if (z) {
                    familyAmountSelectionBottomSheet = new ProfileUiView(context, realImageLoader, realCashVibrator, 1);
                } else if (screen instanceof DependentGeneralSavingsScreen) {
                    familyAmountSelectionBottomSheet = new P2PListView(context, realImageLoader, 28);
                } else if ((screen instanceof CreateOrEditRecurringPaymentScreen) || (screen instanceof SetDependentCustomLimitScreen)) {
                    familyAmountSelectionBottomSheet = new FamilyAmountSelectionBottomSheet(context);
                } else if (screen instanceof SelectCadenceScreen) {
                    familyAmountSelectionBottomSheet = new SelectCadenceView(context, realImageLoader);
                } else if (screen instanceof SelectDayOfCadenceScreen) {
                    familyAmountSelectionBottomSheet = new SelectDayOfCadenceView(context, realImageLoader);
                } else if (screen instanceof ManagedAccountTransferScreen) {
                    int ordinal = ((ManagedAccountTransferScreen) screen).transferType.ordinal();
                    if (ordinal == 0) {
                        familyAmountSelectionBottomSheet = new AddMoneyView(context, factory, realImageLoader, realCashVibrator);
                    } else {
                        if (ordinal != 1) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        familyAmountSelectionBottomSheet = new WithdrawView(context, factory, realCashVibrator, (FeatureFlagManager) obj4, realImageLoader);
                    }
                } else {
                    familyAmountSelectionBottomSheet = null;
                }
                if (screen instanceof DependentControlScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.f417lambda$888804365);
                } else if (screen instanceof ControlErrorScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.lambda$107369277);
                } else if (screen instanceof DependentDetailScreen) {
                    composeUi = new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.family.familyhub.views.FamilyHubViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i11;
                            int i12 = i6;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i11 = (((GapComposer) composer).changed(dependentDetailViewModel) ? 4 : 2) | intValue;
                                    } else {
                                        i11 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i11 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        DependentDetailViewKt.DependentDetailView(bitcoinUiFactory.imageLoader, (RealObservabilityManager) bitcoinUiFactory.cashScreenBrightness, dependentDetailViewModel, function1, null, gapComposer, (i11 << 6) & 8064);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    function12.getClass();
                                    FamilyHomeViewKt.FamilyHomeView(bitcoinUiFactory.imageLoader, (FamilyHomeViewModel) obj5, function12, (Composer) obj7, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 2:
                                    Function1 function13 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    function13.getClass();
                                    SponsorDetailViewKt.SponsorLedInviteView(bitcoinUiFactory.imageLoader, (SponsorLedInviteViewModel) obj5, function13, (Composer) obj7, (intValue3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 3:
                                    Function1 function14 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    function14.getClass();
                                    SponsorDetailViewKt.FamilyPendingRequestsView(bitcoinUiFactory.imageLoader, (FamilyPendingRequestsViewModel) obj5, function14, (Composer) obj7, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    Function1 function15 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    function15.getClass();
                                    AllowanceViewKt.DependentDetailIntroductionDialogScreen(bitcoinUiFactory.imageLoader, (DependentDetailIntroductionViewModel) obj5, function15, (Composer) obj7, (intValue5 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    Function1 function16 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    function16.getClass();
                                    SponsorDetailViewKt.SponsorDetailView(bitcoinUiFactory.imageLoader, (SponsorDetailViewModel) obj5, function16, (Composer) obj7, (intValue6 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 205706799));
                } else if (screen instanceof FamilyHome) {
                    composeUi = new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.family.familyhub.views.FamilyHubViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i11;
                            int i12 = i7;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i11 = (((GapComposer) composer).changed(dependentDetailViewModel) ? 4 : 2) | intValue;
                                    } else {
                                        i11 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i11 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        DependentDetailViewKt.DependentDetailView(bitcoinUiFactory.imageLoader, (RealObservabilityManager) bitcoinUiFactory.cashScreenBrightness, dependentDetailViewModel, function1, null, gapComposer, (i11 << 6) & 8064);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    function12.getClass();
                                    FamilyHomeViewKt.FamilyHomeView(bitcoinUiFactory.imageLoader, (FamilyHomeViewModel) obj5, function12, (Composer) obj7, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 2:
                                    Function1 function13 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    function13.getClass();
                                    SponsorDetailViewKt.SponsorLedInviteView(bitcoinUiFactory.imageLoader, (SponsorLedInviteViewModel) obj5, function13, (Composer) obj7, (intValue3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 3:
                                    Function1 function14 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    function14.getClass();
                                    SponsorDetailViewKt.FamilyPendingRequestsView(bitcoinUiFactory.imageLoader, (FamilyPendingRequestsViewModel) obj5, function14, (Composer) obj7, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    Function1 function15 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    function15.getClass();
                                    AllowanceViewKt.DependentDetailIntroductionDialogScreen(bitcoinUiFactory.imageLoader, (DependentDetailIntroductionViewModel) obj5, function15, (Composer) obj7, (intValue5 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    Function1 function16 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    function16.getClass();
                                    SponsorDetailViewKt.SponsorDetailView(bitcoinUiFactory.imageLoader, (SponsorDetailViewModel) obj5, function16, (Composer) obj7, (intValue6 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1540694599));
                } else if (screen instanceof SponsorLedInviteScreen) {
                    composeUi = new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.family.familyhub.views.FamilyHubViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i11;
                            int i12 = i5;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i11 = (((GapComposer) composer).changed(dependentDetailViewModel) ? 4 : 2) | intValue;
                                    } else {
                                        i11 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i11 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        DependentDetailViewKt.DependentDetailView(bitcoinUiFactory.imageLoader, (RealObservabilityManager) bitcoinUiFactory.cashScreenBrightness, dependentDetailViewModel, function1, null, gapComposer, (i11 << 6) & 8064);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    function12.getClass();
                                    FamilyHomeViewKt.FamilyHomeView(bitcoinUiFactory.imageLoader, (FamilyHomeViewModel) obj5, function12, (Composer) obj7, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 2:
                                    Function1 function13 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    function13.getClass();
                                    SponsorDetailViewKt.SponsorLedInviteView(bitcoinUiFactory.imageLoader, (SponsorLedInviteViewModel) obj5, function13, (Composer) obj7, (intValue3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 3:
                                    Function1 function14 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    function14.getClass();
                                    SponsorDetailViewKt.FamilyPendingRequestsView(bitcoinUiFactory.imageLoader, (FamilyPendingRequestsViewModel) obj5, function14, (Composer) obj7, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    Function1 function15 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    function15.getClass();
                                    AllowanceViewKt.DependentDetailIntroductionDialogScreen(bitcoinUiFactory.imageLoader, (DependentDetailIntroductionViewModel) obj5, function15, (Composer) obj7, (intValue5 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    Function1 function16 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    function16.getClass();
                                    SponsorDetailViewKt.SponsorDetailView(bitcoinUiFactory.imageLoader, (SponsorDetailViewModel) obj5, function16, (Composer) obj7, (intValue6 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1561221393));
                } else if (screen instanceof SponsorResourcesScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.f414lambda$366285759);
                } else if (screen instanceof FamilyPendingRequestsScreen) {
                    composeUi = new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.family.familyhub.views.FamilyHubViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i11;
                            int i12 = i3;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i11 = (((GapComposer) composer).changed(dependentDetailViewModel) ? 4 : 2) | intValue;
                                    } else {
                                        i11 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i11 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        DependentDetailViewKt.DependentDetailView(bitcoinUiFactory.imageLoader, (RealObservabilityManager) bitcoinUiFactory.cashScreenBrightness, dependentDetailViewModel, function1, null, gapComposer, (i11 << 6) & 8064);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    function12.getClass();
                                    FamilyHomeViewKt.FamilyHomeView(bitcoinUiFactory.imageLoader, (FamilyHomeViewModel) obj5, function12, (Composer) obj7, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 2:
                                    Function1 function13 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    function13.getClass();
                                    SponsorDetailViewKt.SponsorLedInviteView(bitcoinUiFactory.imageLoader, (SponsorLedInviteViewModel) obj5, function13, (Composer) obj7, (intValue3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 3:
                                    Function1 function14 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    function14.getClass();
                                    SponsorDetailViewKt.FamilyPendingRequestsView(bitcoinUiFactory.imageLoader, (FamilyPendingRequestsViewModel) obj5, function14, (Composer) obj7, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    Function1 function15 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    function15.getClass();
                                    AllowanceViewKt.DependentDetailIntroductionDialogScreen(bitcoinUiFactory.imageLoader, (DependentDetailIntroductionViewModel) obj5, function15, (Composer) obj7, (intValue5 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    Function1 function16 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    function16.getClass();
                                    SponsorDetailViewKt.SponsorDetailView(bitcoinUiFactory.imageLoader, (SponsorDetailViewModel) obj5, function16, (Composer) obj7, (intValue6 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1293686412));
                } else if (screen instanceof DependentControlsAndLimitsScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.lambda$122518036);
                } else if (screen instanceof DependentDetailIntroductionDialog) {
                    composeUi = new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.family.familyhub.views.FamilyHubViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i11;
                            int i12 = i2;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i11 = (((GapComposer) composer).changed(dependentDetailViewModel) ? 4 : 2) | intValue;
                                    } else {
                                        i11 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i11 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        DependentDetailViewKt.DependentDetailView(bitcoinUiFactory.imageLoader, (RealObservabilityManager) bitcoinUiFactory.cashScreenBrightness, dependentDetailViewModel, function1, null, gapComposer, (i11 << 6) & 8064);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    function12.getClass();
                                    FamilyHomeViewKt.FamilyHomeView(bitcoinUiFactory.imageLoader, (FamilyHomeViewModel) obj5, function12, (Composer) obj7, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 2:
                                    Function1 function13 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    function13.getClass();
                                    SponsorDetailViewKt.SponsorLedInviteView(bitcoinUiFactory.imageLoader, (SponsorLedInviteViewModel) obj5, function13, (Composer) obj7, (intValue3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 3:
                                    Function1 function14 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    function14.getClass();
                                    SponsorDetailViewKt.FamilyPendingRequestsView(bitcoinUiFactory.imageLoader, (FamilyPendingRequestsViewModel) obj5, function14, (Composer) obj7, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    Function1 function15 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    function15.getClass();
                                    AllowanceViewKt.DependentDetailIntroductionDialogScreen(bitcoinUiFactory.imageLoader, (DependentDetailIntroductionViewModel) obj5, function15, (Composer) obj7, (intValue5 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    Function1 function16 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    function16.getClass();
                                    SponsorDetailViewKt.SponsorDetailView(bitcoinUiFactory.imageLoader, (SponsorDetailViewModel) obj5, function16, (Composer) obj7, (intValue6 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 783901243));
                } else if (screen instanceof ControlDisablingConfirmationScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.lambda$1068030227);
                } else if (screen instanceof SponsorDetailScreen) {
                    composeUi = new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.family.familyhub.views.FamilyHubViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i11;
                            int i12 = i4;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i12) {
                                case 0:
                                    DependentDetailViewModel dependentDetailViewModel = (DependentDetailViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    Composer composer = (Composer) obj7;
                                    int intValue = ((Integer) obj8).intValue();
                                    function1.getClass();
                                    if ((intValue & 6) == 0) {
                                        i11 = (((GapComposer) composer).changed(dependentDetailViewModel) ? 4 : 2) | intValue;
                                    } else {
                                        i11 = intValue;
                                    }
                                    if ((intValue & 48) == 0) {
                                        i11 |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                                    }
                                    GapComposer gapComposer = (GapComposer) composer;
                                    if (gapComposer.shouldExecute(i11 & 1, (i11 & 147) != 146)) {
                                        DependentDetailViewKt.DependentDetailView(bitcoinUiFactory.imageLoader, (RealObservabilityManager) bitcoinUiFactory.cashScreenBrightness, dependentDetailViewModel, function1, null, gapComposer, (i11 << 6) & 8064);
                                    } else {
                                        gapComposer.skipToGroupEnd();
                                    }
                                    break;
                                case 1:
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    function12.getClass();
                                    FamilyHomeViewKt.FamilyHomeView(bitcoinUiFactory.imageLoader, (FamilyHomeViewModel) obj5, function12, (Composer) obj7, (intValue2 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 2:
                                    Function1 function13 = (Function1) obj6;
                                    int intValue3 = ((Integer) obj8).intValue();
                                    function13.getClass();
                                    SponsorDetailViewKt.SponsorLedInviteView(bitcoinUiFactory.imageLoader, (SponsorLedInviteViewModel) obj5, function13, (Composer) obj7, (intValue3 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 3:
                                    Function1 function14 = (Function1) obj6;
                                    int intValue4 = ((Integer) obj8).intValue();
                                    function14.getClass();
                                    SponsorDetailViewKt.FamilyPendingRequestsView(bitcoinUiFactory.imageLoader, (FamilyPendingRequestsViewModel) obj5, function14, (Composer) obj7, (intValue4 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                case 4:
                                    Function1 function15 = (Function1) obj6;
                                    int intValue5 = ((Integer) obj8).intValue();
                                    function15.getClass();
                                    AllowanceViewKt.DependentDetailIntroductionDialogScreen(bitcoinUiFactory.imageLoader, (DependentDetailIntroductionViewModel) obj5, function15, (Composer) obj7, (intValue5 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                                default:
                                    Function1 function16 = (Function1) obj6;
                                    int intValue6 = ((Integer) obj8).intValue();
                                    function16.getClass();
                                    SponsorDetailViewKt.SponsorDetailView(bitcoinUiFactory.imageLoader, (SponsorDetailViewModel) obj5, function16, (Composer) obj7, (intValue6 << 3) & IptcConstants.IMAGE_RESOURCE_BLOCK_PSTRING_CAPTION);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -758827745));
                } else if (screen instanceof SetDependentCustomLimitErrorScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.lambda$597407782);
                } else if (screen instanceof ManagedAccountTransferLoadingScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.lambda$1014272118);
                } else if (screen instanceof BlockersScreens.ManagedAccountLoginQrCodeProviderBlockerScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.f413lambda$352657231);
                } else if (screen instanceof BlockersScreens.U13CelebrationBlockerScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.lambda$1464660993);
                } else if (screen instanceof DependentTeenQrCodeShareSheetScreen) {
                    composeUi = new UiFactory.ComposeUi(AllowanceViewKt.f410lambda$1911139793);
                }
                return familyAmountSelectionBottomSheet != null ? new UiFactory.ViewUi(familyAmountSelectionBottomSheet, familyAmountSelectionBottomSheet) : composeUi;
            case 2:
                context.getClass();
                RealSessionFlags realSessionFlags = (RealSessionFlags) obj2;
                final boolean z2 = ((Boolean) realSessionFlags.moneybotHome.getValue()).booleanValue() && !((Boolean) realSessionFlags.moneybotRespectSystemAppearance.getValue()).booleanValue();
                MoneybotScreen moneybotScreen = screen instanceof MoneybotScreen ? (MoneybotScreen) screen : null;
                if (moneybotScreen instanceof MoneybotChatScreen) {
                    return themedComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.moneybot.views.inject.MoneybotUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i11 = i6;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i11) {
                                case 0:
                                    MoneybotChatViewModel moneybotChatViewModel = (MoneybotChatViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    moneybotChatViewModel.getClass();
                                    function1.getClass();
                                    Transformations.MoneybotChatView(moneybotChatViewModel, bitcoinUiFactory.imageLoader, (RealCashVibrator) bitcoinUiFactory.vibrator, function1, false, (ClientRenderablePluginRegistry) bitcoinUiFactory.mapEngineProvider, (Composer) obj7, (intValue & 14) | ((intValue << 6) & 7168) | PKIFailureInfo.transactionIdInUse, 16);
                                    break;
                                default:
                                    MoneybotHomeViewModel moneybotHomeViewModel = (MoneybotHomeViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    moneybotHomeViewModel.getClass();
                                    function12.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj7);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = Trace.valuesState((FeatureFlagManager) bitcoinUiFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    MoneybotHomeViewKt.MoneybotHomeView(moneybotHomeViewModel, bitcoinUiFactory.imageLoader, function12, (ClientRenderablePluginRegistry) bitcoinUiFactory.mapEngineProvider, null, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1).getValue()).enabled(), gapComposer, (intValue2 & 14) | ((intValue2 << 3) & 896) | 4096);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 88294298), z2);
                }
                if (Intrinsics.areEqual(moneybotScreen, MoneybotChatHistoryScreen.INSTANCE)) {
                    return themedComposeUi(ComposableSingletons$MoneybotUiFactoryKt.lambda$279605777, z2);
                }
                if (moneybotScreen instanceof MoneybotFeedbackScreen) {
                    return themedComposeUi(new ComposableLambdaImpl(new Function4() { // from class: com.squareup.cash.moneybot.views.inject.MoneybotUiFactory$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            MoneybotFeedbackViewModel moneybotFeedbackViewModel = (MoneybotFeedbackViewModel) obj5;
                            Function1 function1 = (Function1) obj6;
                            int intValue = ((Integer) obj8).intValue();
                            moneybotFeedbackViewModel.getClass();
                            function1.getClass();
                            int i11 = intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE;
                            zzacn.MoneybotFeedbackView(moneybotFeedbackViewModel, function1, z2, (Composer) obj7, i11);
                            return Unit.INSTANCE;
                        }
                    }, true, -2075024513), z2);
                }
                if (moneybotScreen instanceof RawMessagesScreen) {
                    return themedComposeUi(ComposableSingletons$MoneybotUiFactoryKt.f489lambda$57831598, z2);
                }
                if (Intrinsics.areEqual(moneybotScreen, MoneybotPreambleEditorScreen.INSTANCE)) {
                    return themedComposeUi(ComposableSingletons$MoneybotUiFactoryKt.f488lambda$412546955, z2);
                }
                if (Intrinsics.areEqual(moneybotScreen, MoneybotHomeScreen.INSTANCE)) {
                    return themedComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.moneybot.views.inject.MoneybotUiFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ BitcoinUiFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj5, Object obj6, Object obj7, Object obj8) {
                            int i11 = i7;
                            BitcoinUiFactory bitcoinUiFactory = this.f$0;
                            switch (i11) {
                                case 0:
                                    MoneybotChatViewModel moneybotChatViewModel = (MoneybotChatViewModel) obj5;
                                    Function1 function1 = (Function1) obj6;
                                    int intValue = ((Integer) obj8).intValue();
                                    moneybotChatViewModel.getClass();
                                    function1.getClass();
                                    Transformations.MoneybotChatView(moneybotChatViewModel, bitcoinUiFactory.imageLoader, (RealCashVibrator) bitcoinUiFactory.vibrator, function1, false, (ClientRenderablePluginRegistry) bitcoinUiFactory.mapEngineProvider, (Composer) obj7, (intValue & 14) | ((intValue << 6) & 7168) | PKIFailureInfo.transactionIdInUse, 16);
                                    break;
                                default:
                                    MoneybotHomeViewModel moneybotHomeViewModel = (MoneybotHomeViewModel) obj5;
                                    Function1 function12 = (Function1) obj6;
                                    int intValue2 = ((Integer) obj8).intValue();
                                    moneybotHomeViewModel.getClass();
                                    function12.getClass();
                                    GapComposer gapComposer = (GapComposer) ((Composer) obj7);
                                    Object rememberedValue = gapComposer.rememberedValue();
                                    if (rememberedValue == Composer.Companion.Empty) {
                                        rememberedValue = Trace.valuesState((FeatureFlagManager) bitcoinUiFactory.featureFlagManager, AmplitudeExperiments$MoneybotTopControlsTransition.INSTANCE);
                                        gapComposer.updateRememberedValue(rememberedValue);
                                    }
                                    MoneybotHomeViewKt.MoneybotHomeView(moneybotHomeViewModel, bitcoinUiFactory.imageLoader, function12, (ClientRenderablePluginRegistry) bitcoinUiFactory.mapEngineProvider, null, ((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) Updater.collectAsState((StateFlow) rememberedValue, null, gapComposer, 1).getValue()).enabled(), gapComposer, (intValue2 & 14) | ((intValue2 << 3) & 896) | 4096);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1777152612), z2);
                }
                if (moneybotScreen instanceof MoneybotOverflowMenuScreen) {
                    return themedComposeUi(ComposableSingletons$MoneybotUiFactoryKt.f486lambda$1877810817, z2);
                }
                if (Intrinsics.areEqual(moneybotScreen, MoneybotAutomationsScreen.INSTANCE)) {
                    return themedComposeUi(ComposableSingletons$MoneybotUiFactoryKt.f485lambda$1332527945, z2);
                }
                if (moneybotScreen instanceof MoneybotDebugOverlayScreen) {
                    return themedComposeUi(ComposableSingletons$MoneybotUiFactoryKt.lambda$207905277, z2);
                }
                if (moneybotScreen instanceof MoneybotAmountInputScreen) {
                    return themedComposeUi(ComposableSingletons$MoneybotUiFactoryKt.lambda$614330831, z2);
                }
                if (moneybotScreen instanceof MoneybotStaticPickerScreen) {
                    return themedComposeUi(ComposableSingletons$MoneybotUiFactoryKt.lambda$204693633, z2);
                }
                if (moneybotScreen instanceof MoneybotTextInputScreen) {
                    return themedComposeUi(ComposableSingletons$MoneybotUiFactoryKt.f487lambda$306657499, z2);
                }
                return null;
            case 3:
                context.getClass();
                if (screen.equals(PaymentScreens$HomeScreens$PaymentPad.INSTANCE)) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new MoneyUiFactory$$ExternalSyntheticLambda0(this, 18), true, -580201711));
                }
                if (screen instanceof LitePaymentPadSheetScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new PaymentPadUiFactory$$ExternalSyntheticLambda1(0, screen), true, -822572970));
                }
                if (!(screen instanceof LowDiskSpaceAlertDialogScreen)) {
                    return null;
                }
                LowDiskSpaceAlertDialog lowDiskSpaceAlertDialog = new LowDiskSpaceAlertDialog(context);
                return new UiFactory.ViewUi(lowDiskSpaceAlertDialog, lowDiskSpaceAlertDialog);
            default:
                RealImageLoader realImageLoader2 = (RealImageLoader) obj4;
                context.getClass();
                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_Cash_Default_Accent);
                boolean z3 = screen instanceof SupportChatScreens.FlowScreen.ChatScreen;
                RealImageLoader realImageLoader3 = this.imageLoader;
                ComposeUiView chatView = z3 ? new ChatView(contextThemeWrapper, (RealFilePicker$Factory$Impl) obj3, (AndroidStringManager) obj2, realImageLoader3, realImageLoader2, ((SupportChatScreens.FlowScreen.ChatScreen) screen).autoKeyboard, (SupportActivityItemLoader) obj) : screen instanceof SupportChatScreens.FlowScreen.ChatLoading ? new ChatLoadingView(contextThemeWrapper) : screen instanceof SupportChatScreens.SupportChatDialogs.ChatErrorDialog ? new ChatErrorDialogView(contextThemeWrapper) : screen instanceof SupportChatScreens.FlowScreen.ChatImageDetail ? new ProductSearchView(contextThemeWrapper, realImageLoader2, 2) : screen instanceof SupportChatScreens.SupportChatSheets.ChatFailedDeliverySheet ? new ChatFailedDeliverySheetView(contextThemeWrapper) : screen instanceof SupportChatScreens.FlowScreen.ChatTransactionPicker ? new ProductSearchView(context, realImageLoader3, 5) : screen instanceof SupportChatScreens.FlowScreen.ChatSurveyScreen ? new ChatSurveyView(context) : screen instanceof SupportChatScreens.SupportChatDialogs.ChatSurveyUnavailable ? new ChatSurveyUnavailableView(context) : screen instanceof SupportChatScreens.SupportChatDialogs.ChatExitPrompt ? new ChatExitPromptView(context) : screen instanceof SupportChatScreens.SupportChatSheets.ChatExitPromptSheet ? new ChatExitPromptSheetView(context) : null;
                if (chatView != null) {
                    return new UiFactory.ViewUi(chatView, chatView);
                }
                return null;
        }
    }

    public /* synthetic */ BitcoinUiFactory(Object obj, Object obj2, RealImageLoader realImageLoader, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.vibrator = obj;
        this.cashScreenBrightness = obj2;
        this.imageLoader = realImageLoader;
        this.featureFlagManager = obj3;
        this.mapEngineProvider = obj4;
    }

    public BitcoinUiFactory(RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, RealSessionFlags realSessionFlags, ClientRenderablePluginRegistry clientRenderablePluginRegistry, FeatureFlagManager featureFlagManager) {
        this.$r8$classId = 2;
        this.imageLoader = realImageLoader;
        this.vibrator = realCashVibrator;
        this.cashScreenBrightness = realSessionFlags;
        this.mapEngineProvider = clientRenderablePluginRegistry;
        this.featureFlagManager = featureFlagManager;
    }

    public BitcoinUiFactory(RealObservabilityManager realObservabilityManager, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, LocalizedMoneyFormatter.Factory factory, FeatureFlagManager featureFlagManager) {
        this.$r8$classId = 1;
        this.cashScreenBrightness = realObservabilityManager;
        this.imageLoader = realImageLoader;
        this.vibrator = realCashVibrator;
        this.mapEngineProvider = factory;
        this.featureFlagManager = featureFlagManager;
    }
}
