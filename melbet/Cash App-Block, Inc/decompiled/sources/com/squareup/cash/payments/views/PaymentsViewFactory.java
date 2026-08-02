package com.squareup.cash.payments.views;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.emoji2.text.EmojiExclusions;
import androidx.exifinterface.media.ExifInterfaceUtils;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.UiFactory;
import app.cash.broadway.ui.compose.ComposeUiView;
import app.cash.redwood.treehouse.RealTreehouseApp;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.crypto.tink.KeysetHandle;
import com.google.zxing.BinaryBitmap;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.appmessages.ActivityTabPopupAppMessage;
import com.squareup.cash.appmessages.BalanceTabPopupAppMessage;
import com.squareup.cash.appmessages.CardTabPopupAppMessage;
import com.squareup.cash.appmessages.InvestingTabPopupAppMessage;
import com.squareup.cash.appmessages.OffersTabPopupAppMessage;
import com.squareup.cash.appmessages.PaymentPadTabPopupAppMessage;
import com.squareup.cash.appmessages.SheetAppMessage;
import com.squareup.cash.appmessages.views.AppMessageErrorDialog;
import com.squareup.cash.appmessages.views.PopupAppMessageView;
import com.squareup.cash.appmessages.views.PopupAppMessageView$Factory$Impl;
import com.squareup.cash.appmessages.views.RealAppMessageImageLoader;
import com.squareup.cash.appmessages.views.sheet.RealEmbeddedTreehouseContent$Factory$Impl;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView$Factory$Impl;
import com.squareup.cash.blockers.views.BlockersUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda2;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardStudioExitDialogView;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogView;
import com.squareup.cash.card.onboarding.CardStudioView;
import com.squareup.cash.card.onboarding.ConfirmExitDisclosureView;
import com.squareup.cash.card.onboarding.DisclosureView;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioExitDialogScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioMoreSheetScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.card.onboarding.screens.CardStudioUndoDialogScreen;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.card.onboarding.screens.DisclosureExitConfirmationScreen;
import com.squareup.cash.card.onboarding.screens.DisclosureScreen;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStamps;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStampsV2;
import com.squareup.cash.card.onboarding.screens.PaymentDeviceCustomizationScreen;
import com.squareup.cash.card.onboarding.screens.TagOrderConfirmationScreen;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.featureflags.AmplitudeExperiments$CardStudioPortraitMode;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.FeatureFlagManager;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.p2pblocking.views.P2PListView;
import com.squareup.cash.payments.screens.PaymentScreens;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$AppMessageErrorScreen;
import com.squareup.cash.payments.viewmodels.ConfirmRecipientDialogViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayRequestViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPayersSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentKeypadViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPaymentsInfoViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPeopleOverflowSheetViewModel;
import com.squareup.cash.payments.viewmodels.NearbyPermissionsPromptSheetViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentRecipientViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentStickersViewModel;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentViewModel;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.views.PaymentsViewFactory;
import com.squareup.cash.payments.views.nearby.NearbyPayRequestViewKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$IncentivePromptSheetScreen;
import com.squareup.cash.shopping.screens.CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$BrandsSearchScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$ProductSearchScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$RestrictedItemWarningSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentCancelPlanDialog;
import com.squareup.cash.shopping.views.CashAppPayIncentiveAuthErrorDialogView;
import com.squareup.cash.shopping.views.CashAppPayIncentivePromptSheetView;
import com.squareup.cash.shopping.views.ProductSearchView;
import com.squareup.cash.shopping.views.RestrictedItemWarningSheetView;
import com.squareup.cash.shopping.views.ShoppingViewFactory$createUi$view$1;
import com.squareup.cash.shopping.views.ShoppingWebContainerView;
import com.squareup.cash.shopping.web.ShoppingWebBridge$Factory$Impl;
import com.squareup.cash.treehouse.android.RegisteredTreehouseApp;
import com.squareup.cash.treehouse.android.platform.CashTreehouseLayout;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.protos.cash.cashsuggest.api.InAppBrowserMetadata;
import dev.zacsweers.metro.Provider;
import dev.zacsweers.metro.internal.MapProviderFactory;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes.dex */
public final class PaymentsViewFactory implements UiFactory {
    public final /* synthetic */ int $r8$classId;
    public final Object elementBoundsRegistry;
    public final Object imageLoader;
    public final Object vibrator;

    public PaymentsViewFactory(ShoppingWebBridge$Factory$Impl shoppingWebBridge$Factory$Impl, RealImageLoader realImageLoader, WebViewProvider webViewProvider) {
        this.$r8$classId = 4;
        this.vibrator = shoppingWebBridge$Factory$Impl;
        this.imageLoader = realImageLoader;
        this.elementBoundsRegistry = webViewProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [android.view.View, app.cash.broadway.ui.Ui] */
    /* JADX WARN: Type inference failed for: r0v49, types: [com.squareup.cash.appmessages.views.AppMessageErrorDialog] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    @Override // app.cash.broadway.ui.UiFactory
    public final UiFactory.ScreenUi createUi(Screen screen, Context context, ViewGroup viewGroup) {
        ViewParent viewParent;
        ?? r0;
        ComposeUiView disclosureView;
        RegisteredTreehouseApp registeredTreehouseApp;
        ?? merchantToken;
        InAppBrowserMetadata.EntityInformation entityInformation;
        String str;
        int i = this.$r8$classId;
        final int i2 = 4;
        final int i3 = 0;
        final int i4 = 3;
        Object obj = this.imageLoader;
        Object obj2 = this.vibrator;
        final int i5 = 1;
        Object obj3 = this.elementBoundsRegistry;
        switch (i) {
            case 0:
                context.getClass();
                if (screen instanceof PaymentScreens.ContactSyncPermissionScreen) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.lambda$69267869);
                }
                if (screen instanceof PaymentScreens.ConfirmDuplicate) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.lambda$1977644486);
                }
                if (screen instanceof PaymentScreens.NoteRequired) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.lambda$1706255337);
                }
                if (screen instanceof PaymentScreens.ConfirmRecipient) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i6 = i3;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i6) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -78964614));
                }
                if (screen instanceof PaymentScreens.RecipientSelectionWarningScreen) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.lambda$1210963529);
                }
                if (screen instanceof PaymentScreens.MainPayment) {
                    MainPaymentView mainPaymentView = new MainPaymentView(context, (RealImageLoader) obj, (ElementBoundsRegistry) obj3);
                    return new UiFactory.ViewUi(mainPaymentView, mainPaymentView);
                }
                if (screen instanceof PaymentScreens.PaymentClaim) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.f552lambda$182580568);
                }
                if (screen instanceof PaymentScreens.PaymentLoading) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.lambda$644732905);
                }
                if (screen instanceof PaymentScreens.PersonalizePayment) {
                    final int i6 = 5;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i6;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -151176978));
                }
                if (screen instanceof PaymentScreens.PersonalizePaymentRecipient) {
                    final int i7 = 6;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i7;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 650270864));
                }
                if (screen instanceof PaymentScreens.WarningDialog) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.f551lambda$1805435511);
                }
                if (screen instanceof PaymentScreens.QuickPay) {
                    final int i8 = 7;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i8;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -411973353));
                }
                if (screen instanceof PaymentScreens.QuickPayExitRouterScreen) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.f550lambda$1783637337);
                }
                if (screen instanceof PaymentScreens.QuickPayDetails) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.f547lambda$1352818417);
                }
                if (screen instanceof PaymentScreens.PersonalizePaymentStickers) {
                    final int i9 = 8;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i9;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -1095809625));
                }
                if (screen instanceof PaymentScreens.PaymentConfiguration) {
                    final int i10 = 9;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i10;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 2111375920));
                }
                if (screen instanceof PaymentScreens.DuplicatePayment) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.lambda$133900828);
                }
                if (screen instanceof PaymentScreens.NearbyPayRequest) {
                    final int i11 = 10;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i11;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 967027912));
                }
                if (screen instanceof PaymentScreens.NearbyPaymentKeypad) {
                    final int i12 = 11;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i12;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 766881416));
                }
                if (screen instanceof PaymentScreens.NearbyPayersSheet) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i5;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, -720569520));
                }
                if (screen instanceof PaymentScreens.NearbyPermissionsPromptSheet) {
                    final int i13 = 2;
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i13;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 686138448));
                }
                if (screen instanceof PaymentScreens.NearbyPayRequestHelp) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.lambda$1371106114);
                }
                if (screen instanceof PaymentScreens.NearbyPaymentsInfo) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i4;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1048399638));
                }
                if (screen instanceof PaymentScreens.NearbyPeopleOverflowSheet) {
                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.payments.views.PaymentsViewFactory$$ExternalSyntheticLambda0
                        public final /* synthetic */ PaymentsViewFactory f$0;

                        {
                            this.f$0 = this;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                            int i62 = i2;
                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                            switch (i62) {
                                case 0:
                                    ConfirmRecipientDialogViewModel confirmRecipientDialogViewModel = (ConfirmRecipientDialogViewModel) obj4;
                                    Function1 function1 = (Function1) obj5;
                                    int intValue = ((Integer) obj7).intValue();
                                    confirmRecipientDialogViewModel.getClass();
                                    function1.getClass();
                                    QuickPayViewKt.ConfirmRecipient(confirmRecipientDialogViewModel, function1, (RealImageLoader) paymentsViewFactory.imageLoader, null, (Composer) obj6, intValue & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 1:
                                    NearbyPayersSheetViewModel nearbyPayersSheetViewModel = (NearbyPayersSheetViewModel) obj4;
                                    Function1 function12 = (Function1) obj5;
                                    int intValue2 = ((Integer) obj7).intValue();
                                    nearbyPayersSheetViewModel.getClass();
                                    function12.getClass();
                                    NearbyPayRequestViewKt.NearbyPayersSheetView(function12, nearbyPayersSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue2 << 3) & 112) | ((intValue2 >> 3) & 14));
                                    break;
                                case 2:
                                    NearbyPermissionsPromptSheetViewModel nearbyPermissionsPromptSheetViewModel = (NearbyPermissionsPromptSheetViewModel) obj4;
                                    Function1 function13 = (Function1) obj5;
                                    int intValue3 = ((Integer) obj7).intValue();
                                    nearbyPermissionsPromptSheetViewModel.getClass();
                                    function13.getClass();
                                    NearbyPayRequestViewKt.NearbyPermissionsPromptSheetView(function13, nearbyPermissionsPromptSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue3 << 3) & 112) | ((intValue3 >> 3) & 14));
                                    break;
                                case 3:
                                    NearbyPaymentsInfoViewModel nearbyPaymentsInfoViewModel = (NearbyPaymentsInfoViewModel) obj4;
                                    Function1 function14 = (Function1) obj5;
                                    int intValue4 = ((Integer) obj7).intValue();
                                    nearbyPaymentsInfoViewModel.getClass();
                                    function14.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentsInfoView(function14, nearbyPaymentsInfoViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue4 << 3) & 112) | ((intValue4 >> 3) & 14));
                                    break;
                                case 4:
                                    NearbyPeopleOverflowSheetViewModel nearbyPeopleOverflowSheetViewModel = (NearbyPeopleOverflowSheetViewModel) obj4;
                                    Function1 function15 = (Function1) obj5;
                                    int intValue5 = ((Integer) obj7).intValue();
                                    nearbyPeopleOverflowSheetViewModel.getClass();
                                    function15.getClass();
                                    NearbyPayRequestViewKt.NearbyPeopleOverflowSheetView(function15, nearbyPeopleOverflowSheetViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue5 << 3) & 112) | ((intValue5 >> 3) & 14));
                                    break;
                                case 5:
                                    PersonalizePaymentViewModel personalizePaymentViewModel = (PersonalizePaymentViewModel) obj4;
                                    Function1 function16 = (Function1) obj5;
                                    int intValue6 = ((Integer) obj7).intValue();
                                    personalizePaymentViewModel.getClass();
                                    function16.getClass();
                                    AlphaKt.PersonalizePaymentView(personalizePaymentViewModel, function16, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue6 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 6:
                                    PersonalizePaymentRecipientViewModel personalizePaymentRecipientViewModel = (PersonalizePaymentRecipientViewModel) obj4;
                                    Function1 function17 = (Function1) obj5;
                                    int intValue7 = ((Integer) obj7).intValue();
                                    personalizePaymentRecipientViewModel.getClass();
                                    function17.getClass();
                                    AlphaKt.PersonalizePaymentRecipientView(personalizePaymentRecipientViewModel, function17, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue7 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 7:
                                    QuickPayViewModel quickPayViewModel = (QuickPayViewModel) obj4;
                                    Function1 function18 = (Function1) obj5;
                                    int intValue8 = ((Integer) obj7).intValue();
                                    quickPayViewModel.getClass();
                                    function18.getClass();
                                    QuickPayViewKt.QuickPayView(quickPayViewModel, function18, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (ElementBoundsRegistry) paymentsViewFactory.elementBoundsRegistry, (Composer) obj6, intValue8 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                                case 8:
                                    PersonalizePaymentStickersViewModel personalizePaymentStickersViewModel = (PersonalizePaymentStickersViewModel) obj4;
                                    Function1 function19 = (Function1) obj5;
                                    int intValue9 = ((Integer) obj7).intValue();
                                    personalizePaymentStickersViewModel.getClass();
                                    function19.getClass();
                                    AlphaKt.PersonalizePaymentStickers(function19, personalizePaymentStickersViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue9 << 3) & 112) | ((intValue9 >> 3) & 14));
                                    break;
                                case 9:
                                    PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj4;
                                    Function1 function110 = (Function1) obj5;
                                    int intValue10 = ((Integer) obj7).intValue();
                                    paymentConfigurationViewModel.getClass();
                                    function110.getClass();
                                    QuickPayViewKt.PaymentConfigurationView(function110, paymentConfigurationViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, ((intValue10 << 3) & 112) | ((intValue10 >> 3) & 14));
                                    break;
                                case 10:
                                    NearbyPayRequestViewModel nearbyPayRequestViewModel = (NearbyPayRequestViewModel) obj4;
                                    Function1 function111 = (Function1) obj5;
                                    int intValue11 = ((Integer) obj7).intValue();
                                    nearbyPayRequestViewModel.getClass();
                                    function111.getClass();
                                    NearbyPayRequestViewKt.NearbyPayRequestView(function111, nearbyPayRequestViewModel, (RealImageLoader) paymentsViewFactory.imageLoader, (RealCashVibrator) paymentsViewFactory.vibrator, (Composer) obj6, ((intValue11 >> 3) & 14) | ((intValue11 << 3) & 112));
                                    break;
                                default:
                                    NearbyPaymentKeypadViewModel nearbyPaymentKeypadViewModel = (NearbyPaymentKeypadViewModel) obj4;
                                    Function1 function112 = (Function1) obj5;
                                    int intValue12 = ((Integer) obj7).intValue();
                                    nearbyPaymentKeypadViewModel.getClass();
                                    function112.getClass();
                                    NearbyPayRequestViewKt.NearbyPaymentKeypadView(nearbyPaymentKeypadViewModel, function112, (RealImageLoader) paymentsViewFactory.imageLoader, (Composer) obj6, intValue12 & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    }, true, 1661936342));
                }
                if (screen instanceof PaymentScreens.SchedulePayment) {
                    return new UiFactory.ComposeUi(QuickPayViewKt.lambda$661580375);
                }
                return null;
            case 1:
                context.getClass();
                if ((screen instanceof PaymentPadTabPopupAppMessage) || (screen instanceof ActivityTabPopupAppMessage) || (screen instanceof InvestingTabPopupAppMessage) || (screen instanceof BalanceTabPopupAppMessage) || (screen instanceof CardTabPopupAppMessage) || (screen instanceof OffersTabPopupAppMessage)) {
                    RealAppMessageImageLoader realAppMessageImageLoader = (RealAppMessageImageLoader) ((PopupAppMessageView$Factory$Impl) obj).delegateFactory.sandboxer.invoke();
                    realAppMessageImageLoader.getClass();
                    viewParent = new PopupAppMessageView(context, realAppMessageImageLoader);
                } else {
                    if (screen instanceof PaymentScreens$HomeScreens$AppMessageErrorScreen) {
                        r0 = new AppMessageErrorDialog(context);
                        return new UiFactory.ViewUi(r0, r0);
                    }
                    if (!(screen instanceof SheetAppMessage)) {
                        return null;
                    }
                    KeysetHandle keysetHandle = ((RealEmbeddedTreehouseContent$Factory$Impl) obj3).delegateFactory;
                    CashTreehouseLayout.Factory factory = (CashTreehouseLayout.Factory) ((Provider) keysetHandle.entries).invoke();
                    Map map = ((MapProviderFactory) keysetHandle.annotationsMap).contributingMap;
                    factory.getClass();
                    map.getClass();
                    BinaryBitmap binaryBitmap = new BinaryBitmap(13, factory, map);
                    RealImageLoader realImageLoader = (RealImageLoader) ((SheetAppMessageView$Factory$Impl) obj2).delegateFactory.staticImageLoader.invoke();
                    realImageLoader.getClass();
                    viewParent = new SheetAppMessageView(context, binaryBitmap, realImageLoader);
                }
                r0 = viewParent;
                return new UiFactory.ViewUi(r0, r0);
            case 2:
                context.getClass();
                if (screen instanceof CardStudioScreen) {
                    if (((FeatureFlag$EnabledDisabledAmplitudeExperiment$Options) ((RealFeatureFlagManager) ((FeatureFlagManager) obj3)).currentValue(AmplitudeExperiments$CardStudioPortraitMode.INSTANCE)).enabled()) {
                        return new UiFactory.ComposeUi(CanvasKt.f342lambda$839200437);
                    }
                    disclosureView = new CardStudioView(context, (ErrorReporter) obj2);
                } else {
                    if (screen instanceof PatternSignatureStamps) {
                        return new UiFactory.LegacySheetComposeUi(new UiFactory.LegacySheetComposeUi.Config(30), CanvasKt.f343lambda$919429024);
                    }
                    if (screen instanceof PatternSignatureStampsV2) {
                        return new UiFactory.ComposeUi(CanvasKt.f336lambda$1768267606);
                    }
                    if (screen instanceof CardStudioMoreSheetScreen) {
                        return new UiFactory.ComposeUi(CanvasKt.f339lambda$718247557);
                    }
                    if (screen instanceof CardStudioExitDialogScreen) {
                        disclosureView = new CardStudioExitDialogView(context);
                    } else if (screen instanceof CardStudioUndoDialogScreen) {
                        disclosureView = new CardStudioUndoDialogView(context);
                    } else {
                        if (screen instanceof CardPreviewScreen) {
                            return new UiFactory.ComposeUi(CanvasKt.f340lambda$747125044);
                        }
                        if (screen instanceof DisclosureExitConfirmationScreen) {
                            disclosureView = new ConfirmExitDisclosureView(context);
                        } else {
                            if (screen instanceof CardStyleScreen) {
                                return new UiFactory.ComposeUi(CanvasKt.lambda$380991713);
                            }
                            if (!(screen instanceof DisclosureScreen)) {
                                if (screen instanceof TagOrderConfirmationScreen) {
                                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.card.onboarding.CardOnboardingUiFactory$$ExternalSyntheticLambda0
                                        public final /* synthetic */ PaymentsViewFactory f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                            int i14 = i3;
                                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                                            switch (i14) {
                                                case 0:
                                                    TagOrderConfirmationViewModel tagOrderConfirmationViewModel = (TagOrderConfirmationViewModel) obj4;
                                                    Function1 function1 = (Function1) obj5;
                                                    Composer composer = (Composer) obj6;
                                                    ((Integer) obj7).getClass();
                                                    tagOrderConfirmationViewModel.getClass();
                                                    function1.getClass();
                                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime((RealImageLoader) paymentsViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1914308996, new CardOnboardingUiFactory$$ExternalSyntheticLambda3(tagOrderConfirmationViewModel, function1), composer), composer, 56);
                                                    break;
                                                default:
                                                    PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel = (PaymentDeviceCustomizationViewModel) obj4;
                                                    Function1 function12 = (Function1) obj5;
                                                    Composer composer2 = (Composer) obj6;
                                                    ((Integer) obj7).getClass();
                                                    paymentDeviceCustomizationViewModel.getClass();
                                                    function12.getClass();
                                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime((RealImageLoader) paymentsViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(302865301, new BulletinTileKt$$ExternalSyntheticLambda2(19, paymentDeviceCustomizationViewModel, function12), composer2), composer2, 56);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, true, -1997204284));
                                }
                                if (screen instanceof PaymentDeviceCustomizationScreen) {
                                    return new UiFactory.ComposeUi(new ComposableLambdaImpl(new Function4(this) { // from class: com.squareup.cash.card.onboarding.CardOnboardingUiFactory$$ExternalSyntheticLambda0
                                        public final /* synthetic */ PaymentsViewFactory f$0;

                                        {
                                            this.f$0 = this;
                                        }

                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                                            int i14 = i5;
                                            PaymentsViewFactory paymentsViewFactory = this.f$0;
                                            switch (i14) {
                                                case 0:
                                                    TagOrderConfirmationViewModel tagOrderConfirmationViewModel = (TagOrderConfirmationViewModel) obj4;
                                                    Function1 function1 = (Function1) obj5;
                                                    Composer composer = (Composer) obj6;
                                                    ((Integer) obj7).getClass();
                                                    tagOrderConfirmationViewModel.getClass();
                                                    function1.getClass();
                                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime((RealImageLoader) paymentsViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(1914308996, new CardOnboardingUiFactory$$ExternalSyntheticLambda3(tagOrderConfirmationViewModel, function1), composer), composer, 56);
                                                    break;
                                                default:
                                                    PaymentDeviceCustomizationViewModel paymentDeviceCustomizationViewModel = (PaymentDeviceCustomizationViewModel) obj4;
                                                    Function1 function12 = (Function1) obj5;
                                                    Composer composer2 = (Composer) obj6;
                                                    ((Integer) obj7).getClass();
                                                    paymentDeviceCustomizationViewModel.getClass();
                                                    function12.getClass();
                                                    Updater.CompositionLocalProvider(LocalImageLoaderKt.getLocalImageLoader().defaultProvidedValue$runtime((RealImageLoader) paymentsViewFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(302865301, new BulletinTileKt$$ExternalSyntheticLambda2(19, paymentDeviceCustomizationViewModel, function12), composer2), composer2, 56);
                                                    break;
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, true, 1992488661));
                                }
                                return null;
                            }
                            disclosureView = new DisclosureView(context);
                        }
                    }
                }
                return new UiFactory.ViewUi(disclosureView, disclosureView);
            case 3:
                context.getClass();
                if (!(screen instanceof PromotionDetails)) {
                    return null;
                }
                OnBackPressedDispatcherOwner onBackPressedDispatcherOwner = Trace.get(viewGroup);
                onBackPressedDispatcherOwner.getClass();
                OnBackPressedDispatcher onBackPressedDispatcher = onBackPressedDispatcherOwner.getOnBackPressedDispatcher();
                Provider provider = (Provider) ((Map) obj2).get("discover");
                RealTreehouseApp treehouseApp = (provider == null || (registeredTreehouseApp = (RegisteredTreehouseApp) provider.invoke()) == null) ? null : registeredTreehouseApp.getTreehouseApp();
                return new UiFactory.ComposeUi(new ComposableLambdaImpl(new BlockersUiFactory$$ExternalSyntheticLambda1(i2, this, treehouseApp != null ? CashTreehouseLayout.Factory.create$default((CashTreehouseLayout.Factory) obj3, context, treehouseApp, onBackPressedDispatcher) : null), true, 797680512));
            default:
                RealImageLoader realImageLoader2 = (RealImageLoader) obj;
                context.getClass();
                if (screen instanceof ShoppingWebScreen) {
                    ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2 = screen instanceof ShoppingWebScreen.ShoppingWebScreenV2 ? (ShoppingWebScreen.ShoppingWebScreenV2) screen : null;
                    if (shoppingWebScreenV2 == null || (entityInformation = shoppingWebScreenV2.getEntityInformation()) == null || (str = entityInformation.business_token) == null) {
                        ShoppingScreenContext screenContext = ((ShoppingWebScreen) screen).getScreenContext();
                        merchantToken = screenContext != null ? EmojiExclusions.getMerchantToken(screenContext) : null;
                    } else {
                        merchantToken = str;
                    }
                    ShoppingWebScreen shoppingWebScreen = (ShoppingWebScreen) screen;
                    ShoppingWebContainerView shoppingWebContainerView = new ShoppingWebContainerView(new ShoppingViewFactory$createUi$view$1((ShoppingWebBridge$Factory$Impl) obj2), shoppingWebScreen.getUserAgent(), merchantToken, ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen, WebViewUseCase.AFTERPAY), (WebViewProvider) obj3, context);
                    return new UiFactory.ViewUi(shoppingWebContainerView, shoppingWebContainerView);
                }
                if (screen instanceof ShoppingInfoSheetScreen.AfterPayInfoSheetScreen) {
                    SquareLoyaltyDetailsView squareLoyaltyDetailsView = new SquareLoyaltyDetailsView(context, realImageLoader2, 3);
                    return new UiFactory.ViewUi(squareLoyaltyDetailsView, squareLoyaltyDetailsView);
                }
                if (screen instanceof ShoppingInfoSheetScreen.CashAppPayIncentiveInfoSheetScreen) {
                    SquareLoyaltyDetailsView squareLoyaltyDetailsView2 = new SquareLoyaltyDetailsView(context, realImageLoader2, 3);
                    return new UiFactory.ViewUi(squareLoyaltyDetailsView2, squareLoyaltyDetailsView2);
                }
                if (screen instanceof ShoppingScreen$BrandsSearchScreen) {
                    P2PListView p2PListView = new P2PListView(context, realImageLoader2, 29);
                    return new UiFactory.ViewUi(p2PListView, p2PListView);
                }
                if (screen instanceof ShoppingScreen$ProductSearchScreen) {
                    ProductSearchView productSearchView = new ProductSearchView(context, realImageLoader2, 0);
                    return new UiFactory.ViewUi(productSearchView, productSearchView);
                }
                if (screen instanceof CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog) {
                    CashAppPayIncentiveAuthErrorDialogView cashAppPayIncentiveAuthErrorDialogView = new CashAppPayIncentiveAuthErrorDialogView(context, (CashAppPayIncentiveScreen$SilentAuthorizationErrorDialog) screen);
                    return new UiFactory.ViewUi(cashAppPayIncentiveAuthErrorDialogView, cashAppPayIncentiveAuthErrorDialogView);
                }
                if (screen instanceof CashAppPayIncentiveScreen$IncentivePromptSheetScreen) {
                    CashAppPayIncentivePromptSheetView cashAppPayIncentivePromptSheetView = new CashAppPayIncentivePromptSheetView(context);
                    return new UiFactory.ViewUi(cashAppPayIncentivePromptSheetView, cashAppPayIncentivePromptSheetView);
                }
                if (screen instanceof ShoppingScreen$RestrictedItemWarningSheetScreen) {
                    RestrictedItemWarningSheetView restrictedItemWarningSheetView = new RestrictedItemWarningSheetView(context);
                    return new UiFactory.ViewUi(restrictedItemWarningSheetView, restrictedItemWarningSheetView);
                }
                if (!(screen instanceof SingleUsePaymentScreen$SingleUsePaymentCancelPlanDialogScreen)) {
                    return null;
                }
                SingleUsePaymentCancelPlanDialog singleUsePaymentCancelPlanDialog = new SingleUsePaymentCancelPlanDialog(context);
                return new UiFactory.ViewUi(singleUsePaymentCancelPlanDialog, singleUsePaymentCancelPlanDialog);
        }
    }

    public /* synthetic */ PaymentsViewFactory(int i, Object obj, Object obj2, Object obj3) {
        this.$r8$classId = i;
        this.imageLoader = obj;
        this.vibrator = obj2;
        this.elementBoundsRegistry = obj3;
    }
}
