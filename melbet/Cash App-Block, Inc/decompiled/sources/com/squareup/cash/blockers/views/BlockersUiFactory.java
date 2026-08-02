package com.squareup.cash.blockers.views;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.SingletonPresenterlessUi;
import app.cash.broadway.ui.Ui;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.XmlFactory;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.real.PlacesAddressSearcher;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.FilesetUploadViewModel;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SetAddressViewModel;
import com.squareup.cash.blockers.views.FileBlockerView;
import com.squareup.cash.blockers.views.components.ContactsPermissionExplanationSheetView;
import com.squareup.cash.blockers.views.components.InviteFriendsView;
import com.squareup.cash.blockers.views.components.VerifyAliasView;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.moneyformatter.real.LocalizedMoneyFormatter;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.plaid.real.RealPlaidLinkActivityLauncher;
import com.squareup.cash.qrcodes.views.CashQrCameraXScannerView;
import com.squareup.cash.stripe.real.RealStripeLinkActivityLauncher;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.franklin.api.ClientScenario;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class BlockersUiFactory implements UiFactory {
    public final PlacesAddressSearcher addressSearcher;
    public final ConfirmPaymentView$Factory$Impl confirmPaymentView;
    public final FileBlockerView$Factory$Impl fileBlockerView;
    public final FormBlockerView$Factory$Impl formBlockerView;
    public final RealImageLoader imageLoader;
    public final LocalizedMoneyFormatter.Factory moneyFormatterFactory;
    public final AndroidPermissionManager permissionManager;
    public final RealPlaidLinkActivityLauncher plaidLinkActivityLauncher;
    public final RealStripeLinkActivityLauncher stripeLinkActivityLauncher;
    public final Set uiFactories;
    public final RealCashVibrator vibrator;

    public BlockersUiFactory(Set set, RealCashVibrator realCashVibrator, LocalizedMoneyFormatter.Factory factory, AndroidPermissionManager androidPermissionManager, RealImageLoader realImageLoader, RealPlaidLinkActivityLauncher realPlaidLinkActivityLauncher, RealStripeLinkActivityLauncher realStripeLinkActivityLauncher, ConfirmExitOnboardingFlowView$Factory$Impl confirmExitOnboardingFlowView$Factory$Impl, ConfirmPaymentView$Factory$Impl confirmPaymentView$Factory$Impl, FileBlockerView$Factory$Impl fileBlockerView$Factory$Impl, FormBlockerView$Factory$Impl formBlockerView$Factory$Impl, ReadContactsPermissionView$Factory$Impl readContactsPermissionView$Factory$Impl, RemoteSkipView$Factory$Impl remoteSkipView$Factory$Impl, PlacesAddressSearcher placesAddressSearcher) {
        this.uiFactories = set;
        this.vibrator = realCashVibrator;
        this.moneyFormatterFactory = factory;
        this.permissionManager = androidPermissionManager;
        this.imageLoader = realImageLoader;
        this.plaidLinkActivityLauncher = realPlaidLinkActivityLauncher;
        this.stripeLinkActivityLauncher = realStripeLinkActivityLauncher;
        this.confirmPaymentView = confirmPaymentView$Factory$Impl;
        this.fileBlockerView = fileBlockerView$Factory$Impl;
        this.formBlockerView = formBlockerView$Factory$Impl;
        this.addressSearcher = placesAddressSearcher;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0523 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /* JADX WARN: Type inference failed for: r0v103, types: [app.cash.broadway.ui.UiFactory$ScreenUi] */
    /* JADX WARN: Type inference failed for: r3v83 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    @Override // app.cash.broadway.ui.UiFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        int i;
        BlockersScreens.BlockerContainerScreen blockerContainerScreen;
        boolean z;
        View view;
        Ui ui;
        UiFactory.ViewUi viewUi;
        context.getClass();
        BlockersData blockersData = screen instanceof BlockersScreens ? ((BlockersScreens) screen).getBlockersData() : null;
        if (blockersData != null) {
            ClientScenario clientScenario = blockersData.clientScenario;
            switch (clientScenario == null ? -1 : BlockersData.WhenMappings.$EnumSwitchMapping$0[clientScenario.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                    i = R.style.Theme_Cash_Default_Accent_Bitcoin;
                    break;
            }
            blockerContainerScreen = !(screen instanceof BlockersScreens.BlockerContainerScreen) ? (BlockersScreens.BlockerContainerScreen) screen : null;
            if (blockerContainerScreen != null) {
                screen = ((BlockersScreens.BlockerContainerScreen) screen).getScreen();
            }
            z = screen instanceof BlockersScreens.BankAccountLinkingScreen;
            RealCashVibrator realCashVibrator = this.vibrator;
            ?? r5 = 1;
            if (z) {
                final int i2 = 0;
                if (screen instanceof BlockersScreens.AmountScreen) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new BlockersUiFactory$$ExternalSyntheticLambda1(0, this, (BlockersScreens.AmountScreen) screen), true, 440356624));
                }
                if (screen instanceof BlockersScreens.BalanceTransferLoading) {
                    return new UiFactory.ComposeUi(AmountBlockerViewKt.lambda$1542495501);
                }
                if (screen instanceof BlockersScreens.BirthdayScreen) {
                    view = new BirthdayView(context);
                } else if (screen instanceof BlockersScreens.BusinessBackConfirmationScreen) {
                    view = new BusinessDetailsBackConfirmationView(context);
                } else if (screen instanceof BlockersScreens.CardActivationScreen) {
                    view = new CardActivationView(context);
                } else if (screen instanceof BlockersScreens.CardActivationQrScreen) {
                    view = new CashQrCameraXScannerView(context, this.permissionManager);
                } else if (screen instanceof BlockersScreens.CameraError) {
                    view = new CameraErrorView(context);
                } else if (screen instanceof BlockersScreens.CameraPermissionScreen) {
                    view = new CameraPermissionView(context);
                } else if (screen instanceof BlockersScreens.CashtagConfirmationScreen) {
                    view = new CashtagConfirmationView(context);
                } else if (screen instanceof BlockersScreens.CashtagErrorScreen) {
                    view = new CashtagErrorView(context);
                } else {
                    if (screen instanceof BlockersScreens.CashtagScreen) {
                        return new UiFactory.ComposeUi(AmountBlockerViewKt.lambda$782992106);
                    }
                    if (screen instanceof BlockersScreens.CheckmarkScreen) {
                        view = new CheckmarkView(context);
                    } else if (screen instanceof BlockersScreens.ConfirmCvvScreen) {
                        view = new ConfirmCvvView(context);
                    } else if (screen instanceof BlockersScreens.ConfirmExitOnboardingFlowScreen) {
                        view = new ConfirmExitOnboardingFlowView(context);
                    } else {
                        if (!(screen instanceof BlockersScreens.ConfirmHelp)) {
                            if (screen instanceof BlockersScreens.ConfirmPaymentScreen) {
                                BlockersDataNavigator blockersDataNavigator = (BlockersDataNavigator) this.confirmPaymentView.delegateFactory.sandboxer.invoke();
                                blockersDataNavigator.getClass();
                                ConfirmPaymentView confirmPaymentView = new ConfirmPaymentView(blockersDataNavigator, context, (BlockersScreens.ConfirmPaymentScreen) screen);
                                ui = null;
                                view = confirmPaymentView;
                            } else if (screen instanceof BlockersScreens.ContactVerificationScreen) {
                                view = new VerifyContactsView(context);
                            } else if (screen instanceof BlockersScreens.Error) {
                                view = new ErrorView(context);
                            } else if (screen instanceof BlockersScreens.FileBlockerExplanation) {
                                view = new FileBlockerExplanationView(context);
                            } else if (screen instanceof BlockersScreens.FileBlockerScreen) {
                                ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, R.style.Theme_Cash_Default);
                                FileBlockerView.MetroFactory metroFactory = this.fileBlockerView.delegateFactory;
                                Flow flow = (Flow) metroFactory.activityEvents.value;
                                RealCashVibrator realCashVibrator2 = (RealCashVibrator) metroFactory.vibrator.invoke();
                                AndroidPermissionManager androidPermissionManager = (AndroidPermissionManager) metroFactory.permissionManager.invoke();
                                flow.getClass();
                                realCashVibrator2.getClass();
                                androidPermissionManager.getClass();
                                FileBlockerView fileBlockerView = new FileBlockerView(contextThemeWrapper, flow, realCashVibrator2, androidPermissionManager);
                                ui = null;
                                view = fileBlockerView;
                            } else if (screen instanceof BlockersScreens.FormScreen) {
                                view = this.formBlockerView.create(context);
                            } else if (screen instanceof BlockersScreens.FormMenuActionSheet) {
                                view = new FormMenuActionView(context);
                            } else if (screen instanceof BlockersScreens.GpsLocationConsentBlockerScreen) {
                                view = new GpsLocationConsentBlockerView(context);
                            } else if (screen instanceof BlockersScreens.GpsExplainerSheetScreen) {
                                view = new GpsExplainerSheet(context);
                            } else if (screen instanceof BlockersScreens.HelpItemMessage) {
                                view = new HelpItemMessageView(context);
                            } else if (screen instanceof BlockersScreens.HelpOptions) {
                                view = screen instanceof BlockersScreens.VerifyHelpScreen ? new VerifyHelpSheetView(context) : new HelpOptionsSheet(context);
                            } else if (screen instanceof BlockersScreens.IneligibleMergeScreen) {
                                view = new IneligibleMergeView(context);
                            } else if (screen instanceof BlockersScreens.InvalidInputScreen) {
                                view = new InvalidInputDialog(context);
                            } else if (screen instanceof BlockersScreens.InstrumentSelectionDetailsDialogScreen) {
                                view = new InstrumentSelectionDetailsDialog(context);
                            } else {
                                boolean z2 = screen instanceof BlockersScreens.InstrumentSelectionDetailsScreen;
                                RealImageLoader realImageLoader = this.imageLoader;
                                if (z2) {
                                    view = new InstrumentSelectionDetailsSheet(context, realImageLoader);
                                } else if (screen instanceof BlockersScreens.InstrumentSelectionListScreen) {
                                    view = new InstrumentSelectionListSheet(context, realImageLoader);
                                } else if (screen instanceof BlockersScreens.InstrumentSelectionScreen) {
                                    view = new InstrumentSelectionView(context, realImageLoader);
                                } else if (screen instanceof BlockersScreens.InviteFriendsScreen) {
                                    view = new InviteFriendsView(context);
                                } else if (screen instanceof BlockersScreens.UnselectableOptionDialog) {
                                    view = new UnselectableOptionView(context);
                                } else if (screen instanceof BlockersScreens.ConfirmableOptionDialog) {
                                    view = new ConfirmableOptionView(context);
                                } else {
                                    if (screen instanceof BlockersScreens.FilesetUploadScreen) {
                                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.blockers.views.BlockersUiFactory$$ExternalSyntheticLambda2
                                            public final /* synthetic */ BlockersUiFactory f$0;

                                            {
                                                this.f$0 = this;
                                            }

                                            @Override // kotlin.jvm.functions.Function4
                                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                int i3 = i2;
                                                BlockersUiFactory blockersUiFactory = this.f$0;
                                                switch (i3) {
                                                    case 0:
                                                        FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj;
                                                        Function1 function1 = (Function1) obj2;
                                                        int intValue = ((Integer) obj4).intValue();
                                                        filesetUploadViewModel.getClass();
                                                        function1.getClass();
                                                        AmountBlockerViewKt.FilesetUploadScreen(filesetUploadViewModel, function1, blockersUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                        break;
                                                    case 1:
                                                        AddMoneyViewModel.Keypad keypad = (AddMoneyViewModel.Keypad) obj;
                                                        Function1 function12 = (Function1) obj2;
                                                        int intValue2 = ((Integer) obj4).intValue();
                                                        keypad.getClass();
                                                        function12.getClass();
                                                        AmountBlockerViewKt.AddMoneyBlockerView(keypad, function12, blockersUiFactory.moneyFormatterFactory, blockersUiFactory.vibrator, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                        break;
                                                    case 2:
                                                        ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) obj;
                                                        Function1 function13 = (Function1) obj2;
                                                        Composer composer = (Composer) obj3;
                                                        int intValue3 = ((Integer) obj4).intValue();
                                                        function13.getClass();
                                                        if (referralCodeViewModel != null) {
                                                            SsnViewKt.ReferralCode(null, referralCodeViewModel, function13, blockersUiFactory.imageLoader, blockersUiFactory.vibrator, composer, (intValue3 << 3) & 896);
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                    case 3:
                                                        SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj;
                                                        Function1 function14 = (Function1) obj2;
                                                        Composer composer2 = (Composer) obj3;
                                                        int intValue4 = ((Integer) obj4).intValue();
                                                        function14.getClass();
                                                        if (setAddressViewModel != null) {
                                                            SetAddressViewKt.SetAddress(setAddressViewModel, function14, blockersUiFactory.addressSearcher, composer2, intValue4 & 112);
                                                            break;
                                                        } else {
                                                            break;
                                                        }
                                                    case 4:
                                                        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) obj;
                                                        Function1 function15 = (Function1) obj2;
                                                        Composer composer3 = (Composer) obj3;
                                                        ((Integer) obj4).getClass();
                                                        savingsTransferOptionSelectionViewModel.getClass();
                                                        function15.getClass();
                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1495247959, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function15, 1), composer3), composer3, 56);
                                                        break;
                                                    default:
                                                        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel2 = (SavingsTransferOptionSelectionViewModel) obj;
                                                        Function1 function16 = (Function1) obj2;
                                                        Composer composer4 = (Composer) obj3;
                                                        ((Integer) obj4).getClass();
                                                        savingsTransferOptionSelectionViewModel2.getClass();
                                                        function16.getClass();
                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-210185430, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel2, function16, 0), composer4), composer4, 56);
                                                        break;
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }, true, 1734895981));
                                    }
                                    if (screen instanceof BlockersScreens.FilesetUploadLoadingDialog) {
                                        view = new ArcadeFilesetUploadLoadingDialogView(context);
                                    } else if (screen instanceof BlockersScreens.FilesetUploadErrorDialog) {
                                        view = new ArcadeFilesetUploadErrorDialogView(context);
                                    } else if (screen instanceof BlockersScreens.FilesetUploadOptionsBottomSheet) {
                                        view = new FilesetUploadOptionsSheet(context);
                                    } else if (screen instanceof BlockersScreens.OnboardingInternalRouteScreen) {
                                        view = new OnboardingInternalRouteView(context);
                                    } else if (screen instanceof BlockersScreens.PlaidLinkScreen) {
                                        view = new PlaidLinkView(context, this.plaidLinkActivityLauncher);
                                    } else if (screen instanceof BlockersScreens.PasscodeHelpScreen) {
                                        view = new PasscodeHelpSheet(context);
                                    } else {
                                        if (screen instanceof BlockersScreens.PasscodeScreen) {
                                            return new UiFactory.ComposeUi(AmountBlockerViewKt.lambda$452613526);
                                        }
                                        final int i3 = 2;
                                        if (screen instanceof BlockersScreens.ReferralCodeScreen) {
                                            return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.blockers.views.BlockersUiFactory$$ExternalSyntheticLambda2
                                                public final /* synthetic */ BlockersUiFactory f$0;

                                                {
                                                    this.f$0 = this;
                                                }

                                                @Override // kotlin.jvm.functions.Function4
                                                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                    int i32 = i3;
                                                    BlockersUiFactory blockersUiFactory = this.f$0;
                                                    switch (i32) {
                                                        case 0:
                                                            FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj;
                                                            Function1 function1 = (Function1) obj2;
                                                            int intValue = ((Integer) obj4).intValue();
                                                            filesetUploadViewModel.getClass();
                                                            function1.getClass();
                                                            AmountBlockerViewKt.FilesetUploadScreen(filesetUploadViewModel, function1, blockersUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                            break;
                                                        case 1:
                                                            AddMoneyViewModel.Keypad keypad = (AddMoneyViewModel.Keypad) obj;
                                                            Function1 function12 = (Function1) obj2;
                                                            int intValue2 = ((Integer) obj4).intValue();
                                                            keypad.getClass();
                                                            function12.getClass();
                                                            AmountBlockerViewKt.AddMoneyBlockerView(keypad, function12, blockersUiFactory.moneyFormatterFactory, blockersUiFactory.vibrator, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                            break;
                                                        case 2:
                                                            ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) obj;
                                                            Function1 function13 = (Function1) obj2;
                                                            Composer composer = (Composer) obj3;
                                                            int intValue3 = ((Integer) obj4).intValue();
                                                            function13.getClass();
                                                            if (referralCodeViewModel != null) {
                                                                SsnViewKt.ReferralCode(null, referralCodeViewModel, function13, blockersUiFactory.imageLoader, blockersUiFactory.vibrator, composer, (intValue3 << 3) & 896);
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                        case 3:
                                                            SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj;
                                                            Function1 function14 = (Function1) obj2;
                                                            Composer composer2 = (Composer) obj3;
                                                            int intValue4 = ((Integer) obj4).intValue();
                                                            function14.getClass();
                                                            if (setAddressViewModel != null) {
                                                                SetAddressViewKt.SetAddress(setAddressViewModel, function14, blockersUiFactory.addressSearcher, composer2, intValue4 & 112);
                                                                break;
                                                            } else {
                                                                break;
                                                            }
                                                        case 4:
                                                            SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) obj;
                                                            Function1 function15 = (Function1) obj2;
                                                            Composer composer3 = (Composer) obj3;
                                                            ((Integer) obj4).getClass();
                                                            savingsTransferOptionSelectionViewModel.getClass();
                                                            function15.getClass();
                                                            Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1495247959, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function15, 1), composer3), composer3, 56);
                                                            break;
                                                        default:
                                                            SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel2 = (SavingsTransferOptionSelectionViewModel) obj;
                                                            Function1 function16 = (Function1) obj2;
                                                            Composer composer4 = (Composer) obj3;
                                                            ((Integer) obj4).getClass();
                                                            savingsTransferOptionSelectionViewModel2.getClass();
                                                            function16.getClass();
                                                            Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-210185430, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel2, function16, 0), composer4), composer4, 56);
                                                            break;
                                                    }
                                                    return Unit.INSTANCE;
                                                }
                                            }, true, 662294851));
                                        }
                                        if (screen instanceof BlockersScreens.RegisterAliasScreen) {
                                            view = new RegisterAliasView(context, realCashVibrator);
                                        } else if (screen instanceof BlockersScreens.RegisterErrorScreen) {
                                            view = new RegisterErrorView(context);
                                        } else if (screen instanceof BlockersScreens.RemoteSkipScreen) {
                                            view = new RemoteSkipView(context);
                                        } else if (screen instanceof BlockersScreens.RemoteSkipErrorScreen) {
                                            view = new RemoteSkipErrorDialog(context);
                                        } else if (screen instanceof BlockersScreens.SelectionFullScreen) {
                                            view = new SelectionView(context);
                                        } else {
                                            if (screen instanceof BlockersScreens.SetNameScreen) {
                                                return new UiFactory.ComposeUi(AmountBlockerViewKt.f286lambda$193527189);
                                            }
                                            if (screen instanceof BlockersScreens.SetPinMessageScreen) {
                                                view = new SetPinMessageView(context);
                                            } else {
                                                if (screen instanceof BlockersScreens.SetPinScreen) {
                                                    return new UiFactory.ComposeUi(AmountBlockerViewKt.lambda$1092003529);
                                                }
                                                if (screen instanceof BlockersScreens.SignatureScreen) {
                                                    view = new SignatureView(context);
                                                } else if (screen instanceof BlockersScreens.SkipVerifyScreen) {
                                                    view = new SkipVerifyView(context);
                                                } else {
                                                    if (screen instanceof BlockersScreens.ClientScenarioLauncher) {
                                                        return new UiFactory.ComposeUi(AmountBlockerViewKt.lambda$1544419907);
                                                    }
                                                    if (screen instanceof BlockersScreens.Spinner) {
                                                        view = XmlFactory.inflate(context, R.layout.spinner_view, viewGroup, Integer.valueOf(i));
                                                        ui = SingletonPresenterlessUi.INSTANCE;
                                                    } else {
                                                        if (screen instanceof BlockersScreens.SsnScreen) {
                                                            return new UiFactory.ComposeUi(AmountBlockerViewKt.f306lambda$756629901);
                                                        }
                                                        if (screen instanceof BlockersScreens.StartFlowEntryPointSheet) {
                                                            return new UiFactory.LegacySheetComposeUi(new UiFactory.LegacySheetComposeUi.Config(11), AmountBlockerViewKt.lambda$792315763);
                                                        }
                                                        if (screen instanceof BlockersScreens.StartFlowEntryPointScreen) {
                                                            return new UiFactory.ComposeUi(AmountBlockerViewKt.f285lambda$1905264569);
                                                        }
                                                        if (screen instanceof BlockersScreens.StatusResultDialog) {
                                                            view = new StatusResultDialogView(context);
                                                        } else if (screen instanceof BlockersScreens.StatusResultFullScreen) {
                                                            view = new P2PListView(realImageLoader, context, 7);
                                                        } else {
                                                            final int i4 = 3;
                                                            if (screen instanceof BlockersScreens.StreetAddressScreen) {
                                                                return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.blockers.views.BlockersUiFactory$$ExternalSyntheticLambda2
                                                                    public final /* synthetic */ BlockersUiFactory f$0;

                                                                    {
                                                                        this.f$0 = this;
                                                                    }

                                                                    @Override // kotlin.jvm.functions.Function4
                                                                    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                        int i32 = i4;
                                                                        BlockersUiFactory blockersUiFactory = this.f$0;
                                                                        switch (i32) {
                                                                            case 0:
                                                                                FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj;
                                                                                Function1 function1 = (Function1) obj2;
                                                                                int intValue = ((Integer) obj4).intValue();
                                                                                filesetUploadViewModel.getClass();
                                                                                function1.getClass();
                                                                                AmountBlockerViewKt.FilesetUploadScreen(filesetUploadViewModel, function1, blockersUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                                                break;
                                                                            case 1:
                                                                                AddMoneyViewModel.Keypad keypad = (AddMoneyViewModel.Keypad) obj;
                                                                                Function1 function12 = (Function1) obj2;
                                                                                int intValue2 = ((Integer) obj4).intValue();
                                                                                keypad.getClass();
                                                                                function12.getClass();
                                                                                AmountBlockerViewKt.AddMoneyBlockerView(keypad, function12, blockersUiFactory.moneyFormatterFactory, blockersUiFactory.vibrator, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                                                break;
                                                                            case 2:
                                                                                ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) obj;
                                                                                Function1 function13 = (Function1) obj2;
                                                                                Composer composer = (Composer) obj3;
                                                                                int intValue3 = ((Integer) obj4).intValue();
                                                                                function13.getClass();
                                                                                if (referralCodeViewModel != null) {
                                                                                    SsnViewKt.ReferralCode(null, referralCodeViewModel, function13, blockersUiFactory.imageLoader, blockersUiFactory.vibrator, composer, (intValue3 << 3) & 896);
                                                                                    break;
                                                                                } else {
                                                                                    break;
                                                                                }
                                                                            case 3:
                                                                                SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj;
                                                                                Function1 function14 = (Function1) obj2;
                                                                                Composer composer2 = (Composer) obj3;
                                                                                int intValue4 = ((Integer) obj4).intValue();
                                                                                function14.getClass();
                                                                                if (setAddressViewModel != null) {
                                                                                    SetAddressViewKt.SetAddress(setAddressViewModel, function14, blockersUiFactory.addressSearcher, composer2, intValue4 & 112);
                                                                                    break;
                                                                                } else {
                                                                                    break;
                                                                                }
                                                                            case 4:
                                                                                SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) obj;
                                                                                Function1 function15 = (Function1) obj2;
                                                                                Composer composer3 = (Composer) obj3;
                                                                                ((Integer) obj4).getClass();
                                                                                savingsTransferOptionSelectionViewModel.getClass();
                                                                                function15.getClass();
                                                                                Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1495247959, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function15, 1), composer3), composer3, 56);
                                                                                break;
                                                                            default:
                                                                                SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel2 = (SavingsTransferOptionSelectionViewModel) obj;
                                                                                Function1 function16 = (Function1) obj2;
                                                                                Composer composer4 = (Composer) obj3;
                                                                                ((Integer) obj4).getClass();
                                                                                savingsTransferOptionSelectionViewModel2.getClass();
                                                                                function16.getClass();
                                                                                Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-210185430, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel2, function16, 0), composer4), composer4, 56);
                                                                                break;
                                                                        }
                                                                        return Unit.INSTANCE;
                                                                    }
                                                                }, true, 836136007));
                                                            }
                                                            if (screen instanceof BlockersScreens.StripeLinkScreen) {
                                                                view = new StripeLinkView(context, this.stripeLinkActivityLauncher);
                                                            } else if (screen instanceof BlockersScreens.SuccessMessageScreen) {
                                                                view = new SuccessMessageView(context, (BlockersScreens.SuccessMessageScreen) screen);
                                                            } else if (screen instanceof BlockersScreens.UpgradeConfirmationScreen) {
                                                                view = new UpgradeConfirmationView(context);
                                                            } else if (screen instanceof BlockersScreens.VerifyAliasScreen) {
                                                                view = new VerifyAliasView(context);
                                                            } else if (screen instanceof BlockersScreens.InputCardInfoScreen) {
                                                                view = new InputCardInfoView(context);
                                                            } else if (screen instanceof BlockersScreens.VerifyCardScreen) {
                                                                view = new VerifyCardView(context);
                                                            } else if (screen instanceof BlockersScreens.VerifyErrorScreen) {
                                                                view = new VerifyErrorView(context);
                                                            } else if (screen instanceof BlockersScreens.VerifyMagic) {
                                                                view = new VerifyMagicView(context);
                                                            } else {
                                                                if (screen instanceof BlockersScreens.WelcomeScreen) {
                                                                    return new UiFactory.ComposeUi(AmountBlockerViewKt.lambda$116971903);
                                                                }
                                                                if (screen instanceof BlockersScreens.ReadContactsPermissionScreen) {
                                                                    view = new ReadContactsPermissionView(context);
                                                                } else if (screen instanceof BlockersScreens.ContactsPermissionExplanationSheet) {
                                                                    view = new ContactsPermissionExplanationSheetView(context);
                                                                } else {
                                                                    if (screen instanceof BlockersScreens.SavingsTransferOptionSelectionFullScreen) {
                                                                        final int i5 = 4;
                                                                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.blockers.views.BlockersUiFactory$$ExternalSyntheticLambda2
                                                                            public final /* synthetic */ BlockersUiFactory f$0;

                                                                            {
                                                                                this.f$0 = this;
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function4
                                                                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                int i32 = i5;
                                                                                BlockersUiFactory blockersUiFactory = this.f$0;
                                                                                switch (i32) {
                                                                                    case 0:
                                                                                        FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj;
                                                                                        Function1 function1 = (Function1) obj2;
                                                                                        int intValue = ((Integer) obj4).intValue();
                                                                                        filesetUploadViewModel.getClass();
                                                                                        function1.getClass();
                                                                                        AmountBlockerViewKt.FilesetUploadScreen(filesetUploadViewModel, function1, blockersUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                                                        break;
                                                                                    case 1:
                                                                                        AddMoneyViewModel.Keypad keypad = (AddMoneyViewModel.Keypad) obj;
                                                                                        Function1 function12 = (Function1) obj2;
                                                                                        int intValue2 = ((Integer) obj4).intValue();
                                                                                        keypad.getClass();
                                                                                        function12.getClass();
                                                                                        AmountBlockerViewKt.AddMoneyBlockerView(keypad, function12, blockersUiFactory.moneyFormatterFactory, blockersUiFactory.vibrator, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                                                        break;
                                                                                    case 2:
                                                                                        ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) obj;
                                                                                        Function1 function13 = (Function1) obj2;
                                                                                        Composer composer = (Composer) obj3;
                                                                                        int intValue3 = ((Integer) obj4).intValue();
                                                                                        function13.getClass();
                                                                                        if (referralCodeViewModel != null) {
                                                                                            SsnViewKt.ReferralCode(null, referralCodeViewModel, function13, blockersUiFactory.imageLoader, blockersUiFactory.vibrator, composer, (intValue3 << 3) & 896);
                                                                                            break;
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                    case 3:
                                                                                        SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj;
                                                                                        Function1 function14 = (Function1) obj2;
                                                                                        Composer composer2 = (Composer) obj3;
                                                                                        int intValue4 = ((Integer) obj4).intValue();
                                                                                        function14.getClass();
                                                                                        if (setAddressViewModel != null) {
                                                                                            SetAddressViewKt.SetAddress(setAddressViewModel, function14, blockersUiFactory.addressSearcher, composer2, intValue4 & 112);
                                                                                            break;
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                    case 4:
                                                                                        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) obj;
                                                                                        Function1 function15 = (Function1) obj2;
                                                                                        Composer composer3 = (Composer) obj3;
                                                                                        ((Integer) obj4).getClass();
                                                                                        savingsTransferOptionSelectionViewModel.getClass();
                                                                                        function15.getClass();
                                                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1495247959, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function15, 1), composer3), composer3, 56);
                                                                                        break;
                                                                                    default:
                                                                                        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel2 = (SavingsTransferOptionSelectionViewModel) obj;
                                                                                        Function1 function16 = (Function1) obj2;
                                                                                        Composer composer4 = (Composer) obj3;
                                                                                        ((Integer) obj4).getClass();
                                                                                        savingsTransferOptionSelectionViewModel2.getClass();
                                                                                        function16.getClass();
                                                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-210185430, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel2, function16, 0), composer4), composer4, 56);
                                                                                        break;
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        }, true, -119631767));
                                                                    }
                                                                    if (screen instanceof BlockersScreens.SavingsTransferOptionSelectionSheet) {
                                                                        final int i6 = 5;
                                                                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.blockers.views.BlockersUiFactory$$ExternalSyntheticLambda2
                                                                            public final /* synthetic */ BlockersUiFactory f$0;

                                                                            {
                                                                                this.f$0 = this;
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function4
                                                                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                int i32 = i6;
                                                                                BlockersUiFactory blockersUiFactory = this.f$0;
                                                                                switch (i32) {
                                                                                    case 0:
                                                                                        FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj;
                                                                                        Function1 function1 = (Function1) obj2;
                                                                                        int intValue = ((Integer) obj4).intValue();
                                                                                        filesetUploadViewModel.getClass();
                                                                                        function1.getClass();
                                                                                        AmountBlockerViewKt.FilesetUploadScreen(filesetUploadViewModel, function1, blockersUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                                                        break;
                                                                                    case 1:
                                                                                        AddMoneyViewModel.Keypad keypad = (AddMoneyViewModel.Keypad) obj;
                                                                                        Function1 function12 = (Function1) obj2;
                                                                                        int intValue2 = ((Integer) obj4).intValue();
                                                                                        keypad.getClass();
                                                                                        function12.getClass();
                                                                                        AmountBlockerViewKt.AddMoneyBlockerView(keypad, function12, blockersUiFactory.moneyFormatterFactory, blockersUiFactory.vibrator, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                                                        break;
                                                                                    case 2:
                                                                                        ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) obj;
                                                                                        Function1 function13 = (Function1) obj2;
                                                                                        Composer composer = (Composer) obj3;
                                                                                        int intValue3 = ((Integer) obj4).intValue();
                                                                                        function13.getClass();
                                                                                        if (referralCodeViewModel != null) {
                                                                                            SsnViewKt.ReferralCode(null, referralCodeViewModel, function13, blockersUiFactory.imageLoader, blockersUiFactory.vibrator, composer, (intValue3 << 3) & 896);
                                                                                            break;
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                    case 3:
                                                                                        SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj;
                                                                                        Function1 function14 = (Function1) obj2;
                                                                                        Composer composer2 = (Composer) obj3;
                                                                                        int intValue4 = ((Integer) obj4).intValue();
                                                                                        function14.getClass();
                                                                                        if (setAddressViewModel != null) {
                                                                                            SetAddressViewKt.SetAddress(setAddressViewModel, function14, blockersUiFactory.addressSearcher, composer2, intValue4 & 112);
                                                                                            break;
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                    case 4:
                                                                                        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) obj;
                                                                                        Function1 function15 = (Function1) obj2;
                                                                                        Composer composer3 = (Composer) obj3;
                                                                                        ((Integer) obj4).getClass();
                                                                                        savingsTransferOptionSelectionViewModel.getClass();
                                                                                        function15.getClass();
                                                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1495247959, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function15, 1), composer3), composer3, 56);
                                                                                        break;
                                                                                    default:
                                                                                        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel2 = (SavingsTransferOptionSelectionViewModel) obj;
                                                                                        Function1 function16 = (Function1) obj2;
                                                                                        Composer composer4 = (Composer) obj3;
                                                                                        ((Integer) obj4).getClass();
                                                                                        savingsTransferOptionSelectionViewModel2.getClass();
                                                                                        function16.getClass();
                                                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-210185430, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel2, function16, 0), composer4), composer4, 56);
                                                                                        break;
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        }, true, 1165430762));
                                                                    }
                                                                    if (screen instanceof BlockersScreens.AtmPickerAmountBlockerScreen) {
                                                                        return new UiFactory.ComposeUi(AmountBlockerViewKt.lambda$1878529234);
                                                                    }
                                                                    if (screen instanceof BlockersScreens.CalendarBlockerScreen) {
                                                                        return new UiFactory.ComposeUi(AmountBlockerViewKt.f290lambda$225288961);
                                                                    }
                                                                    if (screen instanceof BlockersScreens.AuthorizeGooglePayScreen) {
                                                                        return new UiFactory.ComposeUi(AmountBlockerViewKt.f291lambda$263663744);
                                                                    }
                                                                    if (screen instanceof BlockersScreens.RequestPushNotificationsBlockerScreen) {
                                                                        return new UiFactory.ComposeUi(AmountBlockerViewKt.lambda$308346880);
                                                                    }
                                                                    if (screen instanceof BlockersScreens.EarnerEnrollmentBlockerScreenArgs) {
                                                                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new BlockersUiFactory$$ExternalSyntheticLambda1(1, this, (BlockersScreens.EarnerEnrollmentBlockerScreenArgs) screen), true, -1999057268));
                                                                    }
                                                                    if (screen instanceof BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs) {
                                                                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new BlockersUiFactory$$ExternalSyntheticLambda1(2, this, (BlockersScreens.EarnerEnrollmentSuccessBlockerScreenArgs) screen), true, -713994739));
                                                                    }
                                                                    if (screen instanceof BlockersScreens.EarnerUpsellBlockerScreenArgs) {
                                                                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new BlockersUiFactory$$ExternalSyntheticLambda1(3, this, (BlockersScreens.EarnerUpsellBlockerScreenArgs) screen), true, -586688763));
                                                                    }
                                                                    if (screen instanceof BlockersScreens.AddMoneyBlockerScreen) {
                                                                        final ?? r52 = r5 == true ? 1 : 0;
                                                                        return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.blockers.views.BlockersUiFactory$$ExternalSyntheticLambda2
                                                                            public final /* synthetic */ BlockersUiFactory f$0;

                                                                            {
                                                                                this.f$0 = this;
                                                                            }

                                                                            @Override // kotlin.jvm.functions.Function4
                                                                            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                                                                int i32 = r52;
                                                                                BlockersUiFactory blockersUiFactory = this.f$0;
                                                                                switch (i32) {
                                                                                    case 0:
                                                                                        FilesetUploadViewModel filesetUploadViewModel = (FilesetUploadViewModel) obj;
                                                                                        Function1 function1 = (Function1) obj2;
                                                                                        int intValue = ((Integer) obj4).intValue();
                                                                                        filesetUploadViewModel.getClass();
                                                                                        function1.getClass();
                                                                                        AmountBlockerViewKt.FilesetUploadScreen(filesetUploadViewModel, function1, blockersUiFactory.imageLoader, (Composer) obj3, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                                                        break;
                                                                                    case 1:
                                                                                        AddMoneyViewModel.Keypad keypad = (AddMoneyViewModel.Keypad) obj;
                                                                                        Function1 function12 = (Function1) obj2;
                                                                                        int intValue2 = ((Integer) obj4).intValue();
                                                                                        keypad.getClass();
                                                                                        function12.getClass();
                                                                                        AmountBlockerViewKt.AddMoneyBlockerView(keypad, function12, blockersUiFactory.moneyFormatterFactory, blockersUiFactory.vibrator, (Composer) obj3, intValue2 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                                                                        break;
                                                                                    case 2:
                                                                                        ReferralCodeViewModel referralCodeViewModel = (ReferralCodeViewModel) obj;
                                                                                        Function1 function13 = (Function1) obj2;
                                                                                        Composer composer = (Composer) obj3;
                                                                                        int intValue3 = ((Integer) obj4).intValue();
                                                                                        function13.getClass();
                                                                                        if (referralCodeViewModel != null) {
                                                                                            SsnViewKt.ReferralCode(null, referralCodeViewModel, function13, blockersUiFactory.imageLoader, blockersUiFactory.vibrator, composer, (intValue3 << 3) & 896);
                                                                                            break;
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                    case 3:
                                                                                        SetAddressViewModel setAddressViewModel = (SetAddressViewModel) obj;
                                                                                        Function1 function14 = (Function1) obj2;
                                                                                        Composer composer2 = (Composer) obj3;
                                                                                        int intValue4 = ((Integer) obj4).intValue();
                                                                                        function14.getClass();
                                                                                        if (setAddressViewModel != null) {
                                                                                            SetAddressViewKt.SetAddress(setAddressViewModel, function14, blockersUiFactory.addressSearcher, composer2, intValue4 & 112);
                                                                                            break;
                                                                                        } else {
                                                                                            break;
                                                                                        }
                                                                                    case 4:
                                                                                        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel = (SavingsTransferOptionSelectionViewModel) obj;
                                                                                        Function1 function15 = (Function1) obj2;
                                                                                        Composer composer3 = (Composer) obj3;
                                                                                        ((Integer) obj4).getClass();
                                                                                        savingsTransferOptionSelectionViewModel.getClass();
                                                                                        function15.getClass();
                                                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-1495247959, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function15, 1), composer3), composer3, 56);
                                                                                        break;
                                                                                    default:
                                                                                        SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel2 = (SavingsTransferOptionSelectionViewModel) obj;
                                                                                        Function1 function16 = (Function1) obj2;
                                                                                        Composer composer4 = (Composer) obj3;
                                                                                        ((Integer) obj4).getClass();
                                                                                        savingsTransferOptionSelectionViewModel2.getClass();
                                                                                        function16.getClass();
                                                                                        Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime(blockersUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(-210185430, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel2, function16, 0), composer4), composer4, 56);
                                                                                        break;
                                                                                }
                                                                                return Unit.INSTANCE;
                                                                            }
                                                                        }, true, 2028500366));
                                                                    }
                                                                    view = null;
                                                                    ui = null;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            if (view != null) {
                                if (ui == null) {
                                    ui = view instanceof Ui ? (Ui) view : null;
                                }
                                viewUi = new UiFactory.ViewUi(view, ui);
                            } else {
                                Iterator it = this.uiFactories.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        ?? createUi = ((BlockerUiFactory) it.next()).createUi(screen, context, viewGroup);
                                        if (createUi != 0) {
                                            viewUi = createUi;
                                        }
                                    } else {
                                        viewUi = null;
                                    }
                                }
                            }
                            if (blockerContainerScreen == null) {
                                return viewUi;
                            }
                            if (!(viewUi != null ? viewUi instanceof UiFactory.ViewUi : true)) {
                                OptionalProvider$$ExternalSyntheticLambda0.m((Object) screen, (Object) " cannot be wrapped in a blockers container because it is not a ViewUi.");
                                return null;
                            }
                            UiFactory.ViewUi viewUi2 = viewUi;
                            if (viewUi2 == null) {
                                return null;
                            }
                            BlockerContainerView blockerContainerView = new BlockerContainerView(context, viewUi2, blockerContainerScreen instanceof BlockersScreens.BlockerContainerScreen.BlockerContainerBottomSheet);
                            return new UiFactory.ViewUi(blockerContainerView, blockerContainerView);
                        }
                        view = new ConfirmHelpDialog(context);
                    }
                }
            } else {
                view = new BankAccountLinkingView(context, realCashVibrator);
            }
            ui = null;
            if (view != null) {
            }
            if (blockerContainerScreen == null) {
            }
        }
        i = R.style.Theme_Cash_Default_Accent;
        if (!(screen instanceof BlockersScreens.BlockerContainerScreen)) {
        }
        if (blockerContainerScreen != null) {
        }
        z = screen instanceof BlockersScreens.BankAccountLinkingScreen;
        RealCashVibrator realCashVibrator3 = this.vibrator;
        ?? r53 = 1;
        if (z) {
        }
        ui = null;
        if (view != null) {
        }
        if (blockerContainerScreen == null) {
        }
    }
}
