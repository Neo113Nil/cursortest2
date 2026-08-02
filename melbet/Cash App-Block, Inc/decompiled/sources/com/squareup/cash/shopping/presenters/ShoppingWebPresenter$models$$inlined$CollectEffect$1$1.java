package com.squareup.cash.shopping.presenters;

import android.app.Activity;
import android.content.Intent;
import androidx.camera.core.CameraX$$ExternalSyntheticLambda0;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.emoji2.text.EmojiExclusions;
import androidx.exifinterface.media.ExifInterfaceUtils;
import androidx.glance.session.SessionWorker$doWork$2$2;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.zipline.loader.ZiplineLoader$load$2;
import bo.app.re$$ExternalSyntheticOutline0;
import com.datadog.android.core.internal.persistence.AsyncEventWriteScope;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartInformation;
import com.fillr.browsersdk.model.FillrCartInformationExtraction$FillrCartProduct;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaky;
import com.squareup.cash.R;
import com.squareup.cash.RealBugReportSenderFactory;
import com.squareup.cash.autofillweb.api.AutofillWebInfo;
import com.squareup.cash.blockers.presenters.RegisterAliasPresenter$register$result$1;
import com.squareup.cash.card.onboarding.CardModelView$1$3$4$2;
import com.squareup.cash.cdf.BrowserOrigin;
import com.squareup.cash.cdf.browser.AutofillPillType;
import com.squareup.cash.cdf.browser.BrowserCheckoutCancelPaymentPlan;
import com.squareup.cash.cdf.browser.BrowserCheckoutSingleUsePaymentDismiss;
import com.squareup.cash.cdf.browser.BrowserCheckoutTapAutofillPill;
import com.squareup.cash.cdf.browser.BrowserCheckoutViewAutofillPill;
import com.squareup.cash.cdf.browser.BrowserNavigateNavigationFailed;
import com.squareup.cash.cdf.browser.BrowserNavigateNavigationFinished;
import com.squareup.cash.cdf.browser.BrowserNavigateNavigationStarted;
import com.squareup.cash.cdf.browser.BrowserNavigateRefreshButtonClicked;
import com.squareup.cash.cdf.browser.BrowserViewCloseScreen;
import com.squareup.cash.cdf.browser.BrowserViewOpenInformationSheet;
import com.squareup.cash.cdf.browser.CheckoutError;
import com.squareup.cash.cdf.browser.EntityType;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsAddAlias;
import com.squareup.cash.cdf.notificationssettings.NotificationsSettingsViewPushDisabledAlert;
import com.squareup.cash.cdf.system.SystemNotificationSettingsOrigin;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.notifications.NotificationChannelToggleState;
import com.squareup.cash.notifications.channels.NotificationChannelId;
import com.squareup.cash.offers.backend.api.OffersAnalyticsHelper$Flow;
import com.squareup.cash.offers.screens.OffersScreen$OffersRedemptionScreen;
import com.squareup.cash.offers.screens.SheetStyle;
import com.squareup.cash.payments.views.QuickPayViewKt$QuickPay$1$1$1$2$1$3$1;
import com.squareup.cash.permissions.AndroidPermissionManager;
import com.squareup.cash.permissions.ReadOnlyPermissions;
import com.squareup.cash.profile.presenters.notifications.ChannelListPresenter;
import com.squareup.cash.profile.presenters.notifications.ProfileNotificationsHelperKt;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.profile.viewmodels.Category;
import com.squareup.cash.profile.viewmodels.ChannelListViewEvent;
import com.squareup.cash.profile.viewmodels.ChannelType;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.BoostDetailsScreen;
import com.squareup.cash.screens.BoostScreenContext$WebBrowserScreenContext;
import com.squareup.cash.screens.RedactedString;
import com.squareup.cash.shopping.backend.analytics.ShopHubAnalyticsHelper$Flow;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.presenters.ShoppingWebPresenter;
import com.squareup.cash.shopping.screens.IabMetadata;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreen$RestrictedItemWarningSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.screens.ShoppingWebScreen;
import com.squareup.cash.shopping.sup.screens.CheckoutScreenType;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentAnalyticsParam;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen;
import com.squareup.cash.shopping.sup.screens.SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen;
import com.squareup.cash.shopping.viewmodels.AutofillFooterViewModel;
import com.squareup.cash.shopping.viewmodels.CashFillStatus;
import com.squareup.cash.shopping.viewmodels.FillrStatus;
import com.squareup.cash.shopping.viewmodels.FooterButtonStyle;
import com.squareup.cash.shopping.viewmodels.PillStage;
import com.squareup.cash.shopping.viewmodels.ShoppingWebViewEvent;
import com.squareup.cash.shopping.viewmodels.WebNavigationFooterViewModel;
import com.squareup.cash.shopping.viewmodels.WebNavigationHeaderModel;
import com.squareup.cash.shopping.web.ShoppingWebBridge$loadUrl$1;
import com.squareup.cash.ui.gcm.NotificationActionService$onHandleIntent$1;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.cash.util.money.Moneys;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.webview.android.WebViewUseCase;
import com.squareup.cash.work.data.api.ClockInEssentials;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.presenters.shift.ClockInOverlayPresenter$handleClockIn$1;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewEvent;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.SellerCardViewModel;
import com.squareup.protos.cash.grantly.api.FullName;
import com.squareup.protos.cash.grantly.api.ShippingAddress;
import com.squareup.protos.cash.grantly.app.RetrieveDefaultShippingAddressResponse;
import com.squareup.protos.cash.sup.plasma.SupCreateCardFlowEndResult;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.common.location.GlobalAddress;
import com.squareup.protos.common.location.Phone;
import com.squareup.util.android.Intents;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.KClassImpl$Data$$Lambda$23;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import timber.log.Timber;

/* loaded from: classes7.dex */
public final class ShoppingWebPresenter$models$$inlined$CollectEffect$1$1 implements FlowCollector {
    public final /* synthetic */ CoroutineScope $$this$LaunchedEffect;
    public final /* synthetic */ MutableState $browserStartTime$delegate$inlined;
    public final /* synthetic */ MutableState $defaultShippingAddressResponse$delegate$inlined;
    public final /* synthetic */ Object $hasSentNavigationProgressAnalyticsEvent$delegate$inlined;
    public final /* synthetic */ Object $isInitialNavigation$delegate$inlined;
    public final /* synthetic */ Object $isPageLoaded$delegate$inlined;
    public final /* synthetic */ MutableState $lastDetectedCartInfo$delegate$inlined;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ MutableState $state$delegate$inlined;
    public final /* synthetic */ MutableState $supCreditLimit$delegate$inlined;
    public final /* synthetic */ MoleculePresenter this$0;

    public ShoppingWebPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, ChannelListPresenter channelListPresenter, MutableState mutableState, String str, NotificationChannelId notificationChannelId, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, State state) {
        this.this$0 = channelListPresenter;
        this.$state$delegate$inlined = mutableState;
        this.$isInitialNavigation$delegate$inlined = str;
        this.$hasSentNavigationProgressAnalyticsEvent$delegate$inlined = notificationChannelId;
        this.$defaultShippingAddressResponse$delegate$inlined = mutableState2;
        this.$lastDetectedCartInfo$delegate$inlined = mutableState3;
        this.$supCreditLimit$delegate$inlined = mutableState4;
        this.$browserStartTime$delegate$inlined = mutableState5;
        this.$isPageLoaded$delegate$inlined = state;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    private final Object emit$com$squareup$cash$shopping$presenters$ShoppingWebPresenter$models$$inlined$CollectEffect$1$1(Object obj, Continuation continuation) {
        RealBugReportSenderFactory realBugReportSenderFactory;
        Analytics analytics;
        RealBugReportSenderFactory realBugReportSenderFactory2;
        Analytics analytics2;
        RealBugReportSenderFactory realBugReportSenderFactory3;
        Analytics analytics3;
        RealBugReportSenderFactory realBugReportSenderFactory4;
        Analytics analytics4;
        RealBugReportSenderFactory realBugReportSenderFactory5;
        Analytics analytics5;
        RealBugReportSenderFactory realBugReportSenderFactory6;
        Analytics analytics6;
        RealBugReportSenderFactory realBugReportSenderFactory7;
        Analytics analytics7;
        RealBugReportSenderFactory realBugReportSenderFactory8;
        Analytics analytics8;
        RealBugReportSenderFactory realBugReportSenderFactory9;
        Analytics analytics9;
        RealBugReportSenderFactory realBugReportSenderFactory10;
        Analytics analytics10;
        RealBugReportSenderFactory realBugReportSenderFactory11;
        Analytics analytics11;
        RealBugReportSenderFactory realBugReportSenderFactory12;
        ShoppingWebScreen shoppingWebScreen;
        ShoppingWebScreen shoppingWebScreen2;
        ShoppingWebScreen shoppingWebScreen3;
        Analytics analytics12;
        RealBugReportSenderFactory realBugReportSenderFactory13;
        RealBugReportSenderFactory realBugReportSenderFactory14;
        RealBugReportSenderFactory realBugReportSenderFactory15;
        Analytics analytics13;
        RealBugReportSenderFactory realBugReportSenderFactory16;
        RealBugReportSenderFactory realBugReportSenderFactory17;
        RealBugReportSenderFactory realBugReportSenderFactory18;
        RealBugReportSenderFactory realBugReportSenderFactory19;
        Analytics analytics14;
        RealBugReportSenderFactory realBugReportSenderFactory20;
        RealBugReportSenderFactory realBugReportSenderFactory21;
        RealBugReportSenderFactory realBugReportSenderFactory22;
        SheetStyle sheetStyle;
        ShippingAddress shippingAddress;
        MutableState mutableState = (MutableState) this.$isInitialNavigation$delegate$inlined;
        ShoppingWebPresenter shoppingWebPresenter = (ShoppingWebPresenter) this.this$0;
        AndroidClock androidClock = shoppingWebPresenter.clock;
        Analytics analytics15 = shoppingWebPresenter.analytics;
        RealBugReportSenderFactory realBugReportSenderFactory23 = shoppingWebPresenter.shoppingWebAnalytics;
        BetterNavigator.ScreenNavigator screenNavigator = shoppingWebPresenter.navigator;
        ShoppingWebScreen shoppingWebScreen4 = shoppingWebPresenter.args;
        ShoppingWebViewEvent shoppingWebViewEvent = (ShoppingWebViewEvent) obj;
        boolean areEqual = Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.Close.INSTANCE);
        MutableState mutableState2 = this.$state$delegate$inlined;
        if (areEqual) {
            Set set = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
            shoppingWebPresenter.shoppingJsPresenter.sendPerformanceToCDF(((ShoppingWebPresenter.State) mutableState2.getValue()).monitoringScriptVersion, new FillrStatus(((ShoppingWebPresenter.State) mutableState2.getValue()).fillrEnabled, ((ShoppingWebPresenter.State) mutableState2.getValue()).fillrVersions), new CashFillStatus(((ShoppingWebPresenter.State) mutableState2.getValue()).cashFillEnabled, ((ShoppingWebPresenter.State) mutableState2.getValue()).cashFillVersion));
            RealShopHubAnalyticsHelper realShopHubAnalyticsHelper = shoppingWebPresenter.shopHubAnalyticsHelper;
            ShopHubAnalyticsHelper$Flow shopHubAnalyticsHelper$Flow = ShopHubAnalyticsHelper$Flow.SHOP;
            realShopHubAnalyticsHelper.preferences.edit().putString("SHOP_FLOW_TOKEN", re$$ExternalSyntheticOutline0.m()).apply();
            shoppingWebPresenter.offersAnalyticsHelper.refreshFlowToken(OffersAnalyticsHelper$Flow.SHOP);
            analytics15.track(new BrowserViewCloseScreen((BrowserOrigin) realBugReportSenderFactory23.sessionManager, (InfoContext) realBugReportSenderFactory23.featureEligibilityDumper, (String) realBugReportSenderFactory23.tempStorage, (String) realBugReportSenderFactory23.preferences, (String) realBugReportSenderFactory23.cashDatabase, (String) realBugReportSenderFactory23.backStackDumper), null);
            screenNavigator.goTo(Back.INSTANCE);
        } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.CustomerDataAutofillPressed.INSTANCE)) {
            Set set2 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
            RetrieveDefaultShippingAddressResponse retrieveDefaultShippingAddressResponse = (RetrieveDefaultShippingAddressResponse) this.$defaultShippingAddressResponse$delegate$inlined.getValue();
            if (retrieveDefaultShippingAddressResponse != null && (shippingAddress = retrieveDefaultShippingAddressResponse.shipping_address) != null) {
                Phone phone = shippingAddress.phone;
                String str = phone != null ? phone.number : null;
                String str2 = shippingAddress.email;
                FullName fullName = shippingAddress.full_name;
                String str3 = fullName != null ? fullName.given_name : null;
                String str4 = fullName != null ? fullName.family_name : null;
                GlobalAddress globalAddress = shippingAddress.global_address;
                AutofillWebInfo autofillWebInfo = new AutofillWebInfo(null, null, null, null, null, str2, null, str3, str4, str, globalAddress != null ? globalAddress.address_line_1 : null, null, globalAddress != null ? globalAddress.postal_code : null, globalAddress != null ? globalAddress.locality : null, globalAddress != null ? globalAddress.administrative_district_level_1 : null, 2143);
                analytics15.track(new BrowserCheckoutTapAutofillPill((InfoContext) realBugReportSenderFactory23.featureEligibilityDumper, (BrowserOrigin) realBugReportSenderFactory23.sessionManager, (String) realBugReportSenderFactory23.tempStorage, (String) realBugReportSenderFactory23.recentMoneybotSession, (String) realBugReportSenderFactory23.bugsnagClient, AutofillPillType.DeliveryAddress), null);
                shoppingWebPresenter.performAutofill(autofillWebInfo, ShoppingWebPresenter$Companion$FillType.ADDRESS);
                mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, true, null, 503316479));
            }
        } else {
            boolean areEqual2 = Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.CardAutofillPressed.INSTANCE);
            MutableState mutableState3 = this.$lastDetectedCartInfo$delegate$inlined;
            if (areEqual2) {
                Set set3 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation = (FillrCartInformationExtraction$FillrCartInformation) mutableState3.getValue();
                ShoppingWebPresenter.RestrictedItemState restrictedItemState = ((ShoppingWebPresenter.State) mutableState2.getValue()).restrictedItemState;
                CardModelView$1$3$4$2 cardModelView$1$3$4$2 = new CardModelView$1$3$4$2(21, shoppingWebPresenter, mutableState2);
                FillrCartInformationExtraction$FillrCartProduct firstRestrictedItemOrNull = ShoppingWebPresenter.getFirstRestrictedItemOrNull(fillrCartInformationExtraction$FillrCartInformation, restrictedItemState);
                if (firstRestrictedItemOrNull != null) {
                    String str5 = firstRestrictedItemOrNull.name;
                    if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen4, WebViewUseCase.SUP)) {
                        analytics15.track(realBugReportSenderFactory23.trackBrowserCheckoutError(CheckoutError.RestrictedItem), null);
                    } else {
                        analytics15.track(realBugReportSenderFactory23.trackBrowserViewOpenRestrictedItemWarning(str5), null);
                    }
                    screenNavigator.goTo(new ShoppingScreen$RestrictedItemWarningSheetScreen(shoppingWebScreen4.getScreenContext(), str5 != null ? str5 : "gift card"));
                } else {
                    cardModelView$1$3$4$2.invoke();
                }
            } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.ScrollingUp.INSTANCE)) {
                Set set4 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, WebNavigationHeaderModel.copy$default(((ShoppingWebPresenter.State) mutableState2.getValue()).headerViewModel, null, null, false, 11), null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870907));
            } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.ScrollingDown.INSTANCE)) {
                Set set5 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, WebNavigationHeaderModel.copy$default(((ShoppingWebPresenter.State) mutableState2.getValue()).headerViewModel, null, null, true, 11), null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870907));
            } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.ActionButtonPressed.INSTANCE)) {
                if (shoppingWebScreen4 instanceof ShoppingWebScreen.AffiliateShoppingScreen) {
                    analytics15.track(new BrowserViewOpenInformationSheet((InfoContext) realBugReportSenderFactory23.featureEligibilityDumper, (String) realBugReportSenderFactory23.tempStorage, shoppingWebPresenter.boostAnalyticsHelper.getFlowToken(), (BrowserOrigin) realBugReportSenderFactory23.sessionManager, (String) realBugReportSenderFactory23.cashDatabase, 4), null);
                    String str6 = ((ShoppingWebScreen.AffiliateShoppingScreen) shoppingWebScreen4).rewardToken;
                    ShoppingScreenContext shoppingScreenContext = ((ShoppingWebScreen.AffiliateShoppingScreen) shoppingWebScreen4).screenContext;
                    screenNavigator.goTo(new BoostDetailsScreen(str6, BoostDetailsScreen.PresentationContext.BOOST_PICKER, new BoostScreenContext$WebBrowserScreenContext(shoppingScreenContext != null ? EmojiExclusions.toOrigin(shoppingScreenContext) : null, EmojiExclusions.getInfoContext(shoppingWebScreen4), shoppingWebPresenter.entityToken, shoppingWebPresenter.flowToken)));
                } else if (shoppingWebScreen4 instanceof ShoppingWebScreen.AfterPayShoppingScreen) {
                    screenNavigator.goTo(new ShoppingInfoSheetScreen.AfterPayInfoSheetScreen(((ShoppingWebScreen.AfterPayShoppingScreen) shoppingWebScreen4).screenContext));
                } else if (!(shoppingWebScreen4 instanceof ShoppingWebScreen.IncentiveShoppingScreen) && !(shoppingWebScreen4 instanceof ShoppingWebScreen.ShoppingWebScreenV2) && !(shoppingWebScreen4 instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
            } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.InfoButtonPressed.INSTANCE)) {
                if (shoppingWebScreen4 instanceof ShoppingWebScreen.AfterPayShoppingScreen) {
                    screenNavigator.goTo(new ShoppingInfoSheetScreen.AfterPayInfoSheetScreen(((ShoppingWebScreen.AfterPayShoppingScreen) shoppingWebScreen4).screenContext));
                } else if (!(shoppingWebScreen4 instanceof ShoppingWebScreen.SingleUsePaymentShoppingScreen)) {
                    if (shoppingWebScreen4 instanceof ShoppingWebScreen.IncentiveShoppingScreen) {
                        screenNavigator.goTo(new ShoppingInfoSheetScreen.CashAppPayIncentiveInfoSheetScreen(((ShoppingWebScreen.IncentiveShoppingScreen) shoppingWebScreen4).screenContext));
                    } else if (!(shoppingWebScreen4 instanceof ShoppingWebScreen.AffiliateShoppingScreen) && !(shoppingWebScreen4 instanceof ShoppingWebScreen.ShoppingWebScreenV2)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                }
            } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.FooterPillPressed.INSTANCE)) {
                if ((shoppingWebScreen4 instanceof ShoppingWebScreen.ShoppingWebScreenV2) && (((ShoppingWebPresenter.State) mutableState2.getValue()).footerViewModel.buttonStyle instanceof FooterButtonStyle.FooterButtonStyleV2)) {
                    FooterButtonStyle.FooterButtonStyleV2 footerButtonStyleV2 = (FooterButtonStyle.FooterButtonStyleV2) ((ShoppingWebPresenter.State) mutableState2.getValue()).footerViewModel.buttonStyle;
                    PillStage pillStage = footerButtonStyleV2.getPillStage();
                    if (pillStage instanceof PillStage.Initial) {
                        if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen4, WebViewUseCase.SUP)) {
                            ShoppingWebPresenter.access$showSupInitialHalfSheet(shoppingWebPresenter, ((ShoppingWebPresenter.State) mutableState2.getValue()).merchantConfig, false, (Money) this.$supCreditLimit$delegate$inlined.getValue());
                        } else if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen4, WebViewUseCase.AFTERPAY)) {
                            ShoppingWebPresenter.access$showAfterpayDetailsSheet(shoppingWebPresenter);
                        } else {
                            screenNavigator.goTo(shoppingWebPresenter.getTimelineSheetScreenForArgs((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen4));
                        }
                    } else if (pillStage instanceof PillStage.Confirmed) {
                        IabMetadata iabMetadata = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen4).metadata;
                        if (iabMetadata instanceof IabMetadata.CashPayMetadata) {
                            sheetStyle = new SheetStyle.IncentiveSheet(shoppingWebPresenter.formatMoney(((IabMetadata.CashPayMetadata) iabMetadata).rewardAmount));
                        } else if (iabMetadata instanceof IabMetadata.AffiliateBoostMetadata) {
                            sheetStyle = new SheetStyle.AffiliateSheet(shoppingWebPresenter.formatMoney(((IabMetadata.AffiliateBoostMetadata) iabMetadata).rewardAmount));
                        } else if (iabMetadata instanceof IabMetadata.AfterpayMetadata) {
                            sheetStyle = SheetStyle.AfterPaySheet.INSTANCE;
                        } else {
                            if (!(iabMetadata instanceof IabMetadata.SUPMetadata)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            sheetStyle = SheetStyle.SUPSheet.INSTANCE;
                        }
                        SheetStyle sheetStyle2 = sheetStyle;
                        InfoContext infoContext = EmojiExclusions.getInfoContext(shoppingWebScreen4);
                        ShoppingScreenContext shoppingScreenContext2 = ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen4).screenContext;
                        screenNavigator.goTo(new OffersScreen$OffersRedemptionScreen(sheetStyle2, infoContext, shoppingScreenContext2 != null ? EmojiExclusions.toOrigin(shoppingScreenContext2) : null, shoppingWebPresenter.flowToken, shoppingWebPresenter.entityToken, ((ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen4).url));
                    } else if (pillStage instanceof PillStage.Error) {
                        FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation2 = (FillrCartInformationExtraction$FillrCartInformation) mutableState3.getValue();
                        ShoppingWebPresenter.State state = (ShoppingWebPresenter.State) mutableState2.getValue();
                        KClassImpl$Data$$Lambda$23 kClassImpl$Data$$Lambda$23 = new KClassImpl$Data$$Lambda$23(11, shoppingWebPresenter, mutableState3, mutableState2);
                        MoneyFormatter moneyFormatter = shoppingWebPresenter.initialMoneyFormatter;
                        ShoppingWebPresenter.CartError cartError = state.cartError;
                        ShoppingWebPresenter.MerchantConfig merchantConfig = state.merchantConfig;
                        int i = cartError == null ? -1 : ShoppingWebPresenter.WhenMappings.$EnumSwitchMapping$1[cartError.ordinal()];
                        CheckoutScreenType.NonEmptyCartWarning nonEmptyCartWarning = CheckoutScreenType.NonEmptyCartWarning.INSTANCE;
                        switch (i) {
                            case -1:
                                kClassImpl$Data$$Lambda$23.invoke();
                                break;
                            case 0:
                            default:
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            case 1:
                                analytics15.track(realBugReportSenderFactory23.trackBrowserCheckoutError(CheckoutError.CartAboveLimit), null);
                                Money money = merchantConfig.availableLimit;
                                money.getClass();
                                screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(new CheckoutScreenType.CreditLimitExceededWarning(moneyFormatter.format(money), ShoppingWebPresenter.formattedCardTotal(fillrCartInformationExtraction$FillrCartInformation2 != null ? fillrCartInformationExtraction$FillrCartInformation2.total : null)), null, null, null));
                                break;
                            case 2:
                                analytics15.track(realBugReportSenderFactory23.trackBrowserCheckoutError(CheckoutError.CartBelowMinimum), null);
                                Money money2 = merchantConfig.cartMinimum;
                                money2.getClass();
                                screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(new CheckoutScreenType.MinimumSpendRestrictedWarning(moneyFormatter.format(money2), ShoppingWebPresenter.formattedCardTotal(fillrCartInformationExtraction$FillrCartInformation2 != null ? fillrCartInformationExtraction$FillrCartInformation2.total : null)), null, null, null));
                                break;
                            case 3:
                                analytics15.track(realBugReportSenderFactory23.trackBrowserCheckoutError(CheckoutError.EmptyCart), null);
                                screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(nonEmptyCartWarning, null, null, null));
                                break;
                            case 4:
                                analytics15.track(realBugReportSenderFactory23.trackBrowserCheckoutError(CheckoutError.CartNotDetected), null);
                                screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(nonEmptyCartWarning, null, null, null));
                                break;
                            case 5:
                                FillrCartInformationExtraction$FillrCartProduct firstRestrictedItemOrNull2 = ShoppingWebPresenter.getFirstRestrictedItemOrNull(fillrCartInformationExtraction$FillrCartInformation2, state.restrictedItemState);
                                if (firstRestrictedItemOrNull2 == null) {
                                    kClassImpl$Data$$Lambda$23.invoke();
                                    break;
                                } else {
                                    String str7 = firstRestrictedItemOrNull2.name;
                                    if (ExifInterfaceUtils.isVersion2WithCorrectMetadata(shoppingWebScreen4, WebViewUseCase.SUP)) {
                                        analytics15.track(realBugReportSenderFactory23.trackBrowserCheckoutError(CheckoutError.RestrictedItem), null);
                                    } else {
                                        analytics15.track(realBugReportSenderFactory23.trackBrowserViewOpenRestrictedItemWarning(str7), null);
                                    }
                                    screenNavigator.goTo(new ShoppingScreen$RestrictedItemWarningSheetScreen(shoppingWebScreen4.getScreenContext(), str7 != null ? str7 : "gift card"));
                                    break;
                                }
                            case 6:
                                analytics15.track(realBugReportSenderFactory23.trackBrowserCheckoutError(CheckoutError.ConnectionFailed), null);
                                screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(CheckoutScreenType.ConnectionFailedWarning.INSTANCE, null, null, null));
                                break;
                            case 7:
                                analytics15.track(realBugReportSenderFactory23.trackBrowserCheckoutError(CheckoutError.LoanLimitReached), null);
                                screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(new CheckoutScreenType.LoanLimitReachedError(state.supCreditLimit), null, null, null));
                                break;
                            case 8:
                                analytics15.track(realBugReportSenderFactory23.trackBrowserCheckoutError(CheckoutError.SpendingLimitReached), null);
                                screenNavigator.goTo(new SingleUsePaymentScreen$SingleUsePaymentCheckoutSheetScreen(CheckoutScreenType.SpendingLimitReachedError.INSTANCE, null, null, null));
                                break;
                        }
                    } else {
                        if (!(pillStage instanceof PillStage.SUPPillStage)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        PillStage pillStage2 = footerButtonStyleV2.getPillStage();
                        pillStage2.getClass();
                        PillStage.SUPPillStage sUPPillStage = (PillStage.SUPPillStage) pillStage2;
                        if (sUPPillStage instanceof PillStage.SUPPillStage.SetUpPlan) {
                            FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation3 = (FillrCartInformationExtraction$FillrCartInformation) mutableState3.getValue();
                            String str8 = fillrCartInformationExtraction$FillrCartInformation3 != null ? fillrCartInformationExtraction$FillrCartInformation3.json : null;
                            ShoppingWebPresenter.State state2 = (ShoppingWebPresenter.State) mutableState2.getValue();
                            ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV2 = (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen4;
                            String str9 = ((ShoppingWebPresenter.State) mutableState2.getValue()).currUrl;
                            if (str9 == null) {
                                str9 = "";
                            }
                            ShoppingWebPresenter.access$openSupHalfSheet(shoppingWebPresenter, str8, state2, ShoppingWebScreen.ShoppingWebScreenV2.copy$default(shoppingWebScreenV2, str9, null, 30));
                        } else {
                            if (!(sUPPillStage instanceof PillStage.SUPPillStage.PlanDetails)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            FillrCartInformationExtraction$FillrCartInformation fillrCartInformationExtraction$FillrCartInformation4 = (FillrCartInformationExtraction$FillrCartInformation) mutableState3.getValue();
                            String str10 = fillrCartInformationExtraction$FillrCartInformation4 != null ? fillrCartInformationExtraction$FillrCartInformation4.json : null;
                            ShoppingWebPresenter.State state3 = (ShoppingWebPresenter.State) mutableState2.getValue();
                            ShoppingWebScreen.ShoppingWebScreenV2 shoppingWebScreenV22 = (ShoppingWebScreen.ShoppingWebScreenV2) shoppingWebScreen4;
                            String str11 = ((ShoppingWebPresenter.State) mutableState2.getValue()).currUrl;
                            if (str11 == null) {
                                str11 = "";
                            }
                            ShoppingWebPresenter.access$openSupHalfSheet(shoppingWebPresenter, str10, state3, ShoppingWebScreen.ShoppingWebScreenV2.copy$default(shoppingWebScreenV22, str11, null, 30));
                        }
                    }
                }
            } else if (shoppingWebViewEvent instanceof ShoppingWebViewEvent.InfoSheetViewed) {
                if (((ShoppingWebViewEvent.InfoSheetViewed) shoppingWebViewEvent).screen instanceof ShoppingInfoSheetScreen.AfterPayInfoSheetScreen) {
                    shoppingWebPresenter.afterpayInfoSheetViewed.set(true);
                    mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, null, WebNavigationFooterViewModel.copy$default(((ShoppingWebPresenter.State) mutableState2.getValue()).footerViewModel, false, false, new FooterButtonStyle.AfterPayButton(false), 11), null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870903));
                }
            } else if (shoppingWebViewEvent instanceof ShoppingWebViewEvent.TitleUpdated) {
                Set set6 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, WebNavigationHeaderModel.copy$default(((ShoppingWebPresenter.State) mutableState2.getValue()).headerViewModel, ((ShoppingWebViewEvent.TitleUpdated) shoppingWebViewEvent).title, null, false, 14), null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870907));
            } else {
                boolean z = shoppingWebViewEvent instanceof ShoppingWebViewEvent.UrlUpdated;
                MutableState mutableState4 = this.$browserStartTime$delegate$inlined;
                if (z) {
                    Set set7 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    if (((Long) mutableState4.getValue()) == null) {
                        mutableState4.setValue(new Long(androidClock.millis()));
                    }
                    realBugReportSenderFactory23.preferences = ((ShoppingWebViewEvent.UrlUpdated) shoppingWebViewEvent).url;
                    realBugReportSenderFactory23.endpoint = RealUuidGenerator.generate().toString();
                    Boolean bool = (Boolean) mutableState.getValue();
                    bool.getClass();
                    String str12 = (String) realBugReportSenderFactory23.preferences;
                    String str13 = (String) realBugReportSenderFactory23.tempStorage;
                    analytics15.track(new BrowserNavigateNavigationStarted((String) realBugReportSenderFactory23.cashDatabase, (String) realBugReportSenderFactory23.endpointContext, (EntityType) realBugReportSenderFactory23.scope, bool, str13, str13, str12, (String) realBugReportSenderFactory23.recentMoneybotSession, (String) realBugReportSenderFactory23.bugsnagClient, (InfoContext) realBugReportSenderFactory23.featureEligibilityDumper, (BrowserOrigin) realBugReportSenderFactory23.sessionManager, (String) realBugReportSenderFactory23.endpoint), null);
                    try {
                        mutableState2.setValue(ShoppingWebPresenter.State.copy$default((ShoppingWebPresenter.State) mutableState2.getValue(), false, null, WebNavigationHeaderModel.copy$default(((ShoppingWebPresenter.State) mutableState2.getValue()).headerViewModel, null, new URL(((ShoppingWebViewEvent.UrlUpdated) shoppingWebViewEvent).url).getHost(), false, 13), null, ((ShoppingWebViewEvent.UrlUpdated) shoppingWebViewEvent).url, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870875));
                    } catch (MalformedURLException e) {
                        Timber.Forest.e(e);
                    }
                } else if (shoppingWebViewEvent instanceof ShoppingWebViewEvent.NavigationStateUpdated) {
                    Set set8 = ShoppingWebPresenter.RESTRICTED_KEYWORDS;
                    ShoppingWebPresenter.State state4 = (ShoppingWebPresenter.State) mutableState2.getValue();
                    WebNavigationFooterViewModel webNavigationFooterViewModel = ((ShoppingWebPresenter.State) mutableState2.getValue()).footerViewModel;
                    ShoppingWebViewEvent.NavigationStateUpdated navigationStateUpdated = (ShoppingWebViewEvent.NavigationStateUpdated) shoppingWebViewEvent;
                    boolean z2 = navigationStateUpdated.isPageFinished;
                    mutableState2.setValue(ShoppingWebPresenter.State.copy$default(state4, false, null, null, WebNavigationFooterViewModel.copy$default(webNavigationFooterViewModel, navigationStateUpdated.canGoBack, navigationStateUpdated.canGoForward, null, 12), null, null, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870903));
                    if (z2 && !Intrinsics.areEqual(((ShoppingWebPresenter.State) mutableState2.getValue()).currUrl, ((ShoppingWebPresenter.State) mutableState2.getValue()).prevUrl)) {
                        Long l = (Long) mutableState4.getValue();
                        long millis = l != null ? androidClock.millis() - l.longValue() : 0L;
                        realBugReportSenderFactory19 = shoppingWebPresenter.shoppingWebAnalytics;
                        if (((String) realBugReportSenderFactory19.endpoint) == null) {
                            realBugReportSenderFactory22 = shoppingWebPresenter.shoppingWebAnalytics;
                            realBugReportSenderFactory22.endpoint = RealUuidGenerator.generate().toString();
                        }
                        analytics14 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory20 = shoppingWebPresenter.shoppingWebAnalytics;
                        boolean booleanValue = ((Boolean) mutableState.getValue()).booleanValue();
                        String str14 = (String) realBugReportSenderFactory20.preferences;
                        String str15 = (String) realBugReportSenderFactory20.tempStorage;
                        analytics14.track(new BrowserNavigateNavigationFinished((String) realBugReportSenderFactory20.cashDatabase, (String) realBugReportSenderFactory20.endpointContext, (EntityType) realBugReportSenderFactory20.scope, Boolean.valueOf(booleanValue), str15, str15, str14, (String) realBugReportSenderFactory20.recentMoneybotSession, (String) realBugReportSenderFactory20.bugsnagClient, Long.valueOf(millis), (InfoContext) realBugReportSenderFactory20.featureEligibilityDumper, (BrowserOrigin) realBugReportSenderFactory20.sessionManager, (String) realBugReportSenderFactory20.endpoint), null);
                        if (((Boolean) mutableState.getValue()).booleanValue()) {
                            mutableState.setValue(Boolean.FALSE);
                        }
                        realBugReportSenderFactory21 = shoppingWebPresenter.shoppingWebAnalytics;
                        realBugReportSenderFactory21.endpoint = null;
                        mutableState4.setValue(null);
                        ((MutableState) this.$hasSentNavigationProgressAnalyticsEvent$delegate$inlined).setValue(Boolean.FALSE);
                        mutableState2.setValue(ShoppingWebPresenter.State.copy$default(ShoppingWebPresenter.access$models$lambda$13(mutableState2), false, null, null, null, null, navigationStateUpdated.url, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870847));
                    }
                    if (z2) {
                        ((MutableState) this.$isPageLoaded$delegate$inlined).setValue(Boolean.TRUE);
                    }
                } else if (!(shoppingWebViewEvent instanceof ShoppingWebViewEvent.AfterpayWebCheckoutFlowJsonEvents) && !(shoppingWebViewEvent instanceof ShoppingWebViewEvent.PayKitShopViewEvent) && !(shoppingWebViewEvent instanceof ShoppingWebViewEvent.WebMonitoringJsonEvents)) {
                    if (shoppingWebViewEvent instanceof ShoppingWebViewEvent.NavigationFailed) {
                        ShoppingWebViewEvent.NavigationFailed navigationFailed = (ShoppingWebViewEvent.NavigationFailed) shoppingWebViewEvent;
                        Integer num = navigationFailed.statusCode;
                        if (num != null && !Intrinsics.areEqual(ShoppingWebPresenter.access$models$lambda$13(mutableState2).currUrl, ShoppingWebPresenter.access$models$lambda$13(mutableState2).prevUrl)) {
                            realBugReportSenderFactory15 = shoppingWebPresenter.shoppingWebAnalytics;
                            if (((String) realBugReportSenderFactory15.endpoint) == null) {
                                realBugReportSenderFactory18 = shoppingWebPresenter.shoppingWebAnalytics;
                                realBugReportSenderFactory18.endpoint = RealUuidGenerator.generate().toString();
                            }
                            analytics13 = shoppingWebPresenter.analytics;
                            realBugReportSenderFactory16 = shoppingWebPresenter.shoppingWebAnalytics;
                            analytics13.track(new BrowserNavigateNavigationFailed((String) realBugReportSenderFactory16.cashDatabase, (String) realBugReportSenderFactory16.endpointContext, (EntityType) realBugReportSenderFactory16.scope, Boolean.valueOf(((Boolean) mutableState.getValue()).booleanValue()), (String) realBugReportSenderFactory16.tempStorage, (String) realBugReportSenderFactory16.preferences, (String) realBugReportSenderFactory16.recentMoneybotSession, (String) realBugReportSenderFactory16.bugsnagClient, navigationFailed.error, num, (InfoContext) realBugReportSenderFactory16.featureEligibilityDumper, (BrowserOrigin) realBugReportSenderFactory16.sessionManager, (String) realBugReportSenderFactory16.endpoint, Boolean.valueOf(navigationFailed.isForMainFrame)), null);
                            mutableState2.setValue(ShoppingWebPresenter.State.copy$default(ShoppingWebPresenter.access$models$lambda$13(mutableState2), false, null, null, null, null, ShoppingWebPresenter.access$models$lambda$13(mutableState2).currUrl, null, null, null, null, null, null, false, null, null, null, null, false, null, 536870847));
                            realBugReportSenderFactory17 = shoppingWebPresenter.shoppingWebAnalytics;
                            realBugReportSenderFactory17.endpoint = null;
                        }
                    } else if (shoppingWebViewEvent instanceof ShoppingWebViewEvent.ProgressUpdated) {
                        realBugReportSenderFactory14 = shoppingWebPresenter.shoppingWebAnalytics;
                        realBugReportSenderFactory14.preferences = ((ShoppingWebViewEvent.ProgressUpdated) shoppingWebViewEvent).url;
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.SingleUsePaymentCancelDialogConfirmed.INSTANCE)) {
                        SupCreateCardFlowEndResult supCreateCardFlowEndResult = ShoppingWebPresenter.access$models$lambda$13(mutableState2).supCheckoutEndResult;
                        String str16 = supCreateCardFlowEndResult != null ? supCreateCardFlowEndResult.sup_checkout_id : null;
                        mutableState2.setValue(ShoppingWebPresenter.State.copy$default(ShoppingWebPresenter.access$models$lambda$13(mutableState2), false, ShoppingWebPresenter.CardState.copy$default(ShoppingWebPresenter.access$models$lambda$13(mutableState2).cardState, null, null, null, null, null, false, 383), null, WebNavigationFooterViewModel.copy$default(ShoppingWebPresenter.access$models$lambda$13(mutableState2).footerViewModel, false, false, new FooterButtonStyle.FooterButtonStyleV2.SingleUsePaymentButton(PillStage.SUPPillStage.SetUpPlan.INSTANCE), 11), null, null, null, null, null, null, null, null, false, new ShoppingWebPresenter.PlanDetailsState(null, null), null, null, null, false, null, 536608629));
                        analytics12 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory13 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics12.track(new BrowserCheckoutCancelPaymentPlan((BrowserOrigin) realBugReportSenderFactory13.sessionManager, (InfoContext) realBugReportSenderFactory13.featureEligibilityDumper, (String) realBugReportSenderFactory13.tempStorage, (String) realBugReportSenderFactory13.backStackDumper, (String) realBugReportSenderFactory13.cashDatabase), null);
                        JobKt.launch$default(this.$$this$LaunchedEffect, null, null, new ShoppingWebBridge$loadUrl$1(str16, shoppingWebPresenter, (Continuation) null), 3);
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.SingleUsePaymentCancelDialogDismissed.INSTANCE)) {
                        BetterNavigator.ScreenNavigator screenNavigator2 = shoppingWebPresenter.navigator;
                        String str17 = ShoppingWebPresenter.access$models$lambda$13(mutableState2).planDetails.downPayment;
                        if (str17 == null) {
                            str17 = "";
                        }
                        String str18 = ShoppingWebPresenter.access$models$lambda$13(mutableState2).planDetails.estimatedTotal;
                        if (str18 == null) {
                            str18 = "";
                        }
                        String str19 = shoppingWebPresenter.flowToken;
                        shoppingWebScreen = shoppingWebPresenter.args;
                        InfoContext infoContext2 = EmojiExclusions.getInfoContext(shoppingWebScreen);
                        shoppingWebScreen2 = shoppingWebPresenter.args;
                        ShoppingScreenContext screenContext = shoppingWebScreen2.getScreenContext();
                        BrowserOrigin origin = screenContext != null ? EmojiExclusions.toOrigin(screenContext) : null;
                        shoppingWebScreen3 = shoppingWebPresenter.args;
                        screenNavigator2.goTo(new SingleUsePaymentScreen$SingleUsePaymentPlanDetailsSheetScreen(str17, str18, new SingleUsePaymentAnalyticsParam(origin, infoContext2, str19, shoppingWebScreen3.getUrl(), shoppingWebPresenter.entityToken)));
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.SingleUsePaymentReviewPlanDismissed.INSTANCE)) {
                        analytics11 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory12 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics11.track(new BrowserCheckoutSingleUsePaymentDismiss((BrowserOrigin) realBugReportSenderFactory12.sessionManager, (InfoContext) realBugReportSenderFactory12.featureEligibilityDumper, (String) realBugReportSenderFactory12.tempStorage, (String) realBugReportSenderFactory12.backStackDumper, (String) realBugReportSenderFactory12.cashDatabase), null);
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.SingleUsePaymentCreditLimitWarningExceededDismissed.INSTANCE)) {
                        analytics10 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory11 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics10.track(realBugReportSenderFactory11.trackBrowserCheckoutDismissError(CheckoutError.CartAboveLimit), null);
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.SingleUsePaymentNonEmptyCartWarningDismissed.INSTANCE)) {
                        analytics9 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory10 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics9.track(realBugReportSenderFactory10.trackBrowserCheckoutDismissError(CheckoutError.CartNotDetected), null);
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.SingleUsePaymentMinimumSpendWarningDismissed.INSTANCE)) {
                        analytics8 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory9 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics8.track(realBugReportSenderFactory9.trackBrowserCheckoutDismissError(CheckoutError.CartBelowMinimum), null);
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.SingleUsePaymentConnectionFailedWarningDismissed.INSTANCE)) {
                        analytics7 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory8 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics7.track(realBugReportSenderFactory8.trackBrowserCheckoutDismissError(CheckoutError.ConnectionFailed), null);
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.SingleUsePaymentSpendingLimitReachedWarningDismissed.INSTANCE)) {
                        analytics6 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory7 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics6.track(realBugReportSenderFactory7.trackBrowserCheckoutDismissError(CheckoutError.SpendingLimitReached), null);
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.SingleUsePaymentLoanLimitReachedWarningDismissed.INSTANCE)) {
                        analytics5 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory6 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics5.track(realBugReportSenderFactory6.trackBrowserCheckoutDismissError(CheckoutError.LoanLimitReached), null);
                    } else if (Intrinsics.areEqual(shoppingWebViewEvent, ShoppingWebViewEvent.RestrictedItemWarningDismissed.INSTANCE)) {
                        analytics4 = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory5 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics4.track(realBugReportSenderFactory5.trackBrowserCheckoutDismissError(CheckoutError.RestrictedItem), null);
                    } else if (shoppingWebViewEvent instanceof ShoppingWebViewEvent.AutofillPillShown) {
                        AutofillFooterViewModel autofillFooterViewModel = ShoppingWebPresenter.access$models$lambda$13(mutableState2).autofillFooterViewModel;
                        if (autofillFooterViewModel != null) {
                            if (autofillFooterViewModel.address != null) {
                                analytics3 = shoppingWebPresenter.analytics;
                                realBugReportSenderFactory4 = shoppingWebPresenter.shoppingWebAnalytics;
                                analytics3.track(new BrowserCheckoutViewAutofillPill((InfoContext) realBugReportSenderFactory4.featureEligibilityDumper, (BrowserOrigin) realBugReportSenderFactory4.sessionManager, (String) realBugReportSenderFactory4.tempStorage, (String) realBugReportSenderFactory4.recentMoneybotSession, (String) realBugReportSenderFactory4.bugsnagClient, AutofillPillType.DeliveryAddress), null);
                            }
                            if (autofillFooterViewModel.cardText != null) {
                                analytics2 = shoppingWebPresenter.analytics;
                                realBugReportSenderFactory3 = shoppingWebPresenter.shoppingWebAnalytics;
                                analytics2.track(new BrowserCheckoutViewAutofillPill((InfoContext) realBugReportSenderFactory3.featureEligibilityDumper, (BrowserOrigin) realBugReportSenderFactory3.sessionManager, (String) realBugReportSenderFactory3.tempStorage, (String) realBugReportSenderFactory3.recentMoneybotSession, (String) realBugReportSenderFactory3.bugsnagClient, AutofillPillType.Payment), null);
                            }
                        }
                    } else {
                        if (!(shoppingWebViewEvent instanceof ShoppingWebViewEvent.RefreshButtonPressed)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        realBugReportSenderFactory = shoppingWebPresenter.shoppingWebAnalytics;
                        realBugReportSenderFactory.preferences = ((ShoppingWebViewEvent.RefreshButtonPressed) shoppingWebViewEvent).url;
                        analytics = shoppingWebPresenter.analytics;
                        realBugReportSenderFactory2 = shoppingWebPresenter.shoppingWebAnalytics;
                        analytics.track(new BrowserNavigateRefreshButtonClicked((BrowserOrigin) realBugReportSenderFactory2.sessionManager, (InfoContext) realBugReportSenderFactory2.featureEligibilityDumper, (String) realBugReportSenderFactory2.preferences, (String) realBugReportSenderFactory2.tempStorage, (String) realBugReportSenderFactory2.cashDatabase, (String) realBugReportSenderFactory2.backStackDumper), null);
                    }
                }
            }
        }
        return Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object obj2;
        Money money;
        CurrencyCode currencyCode;
        ClockInEssentials.BasicInfo basicInfo;
        Object obj3;
        Object obj4;
        LocationIdentifier locationIdentifier;
        Object obj5;
        JobIdentifier jobIdentifier;
        int i = this.$r8$classId;
        MoleculePresenter moleculePresenter = this.this$0;
        MutableState mutableState = this.$supCreditLimit$delegate$inlined;
        CoroutineScope coroutineScope = this.$$this$LaunchedEffect;
        MutableState mutableState2 = this.$defaultShippingAddressResponse$delegate$inlined;
        Back back = Back.INSTANCE;
        Object obj6 = this.$isPageLoaded$delegate$inlined;
        Object obj7 = this.$hasSentNavigationProgressAnalyticsEvent$delegate$inlined;
        Object obj8 = this.$isInitialNavigation$delegate$inlined;
        switch (i) {
            case 0:
                return emit$com$squareup$cash$shopping$presenters$ShoppingWebPresenter$models$$inlined$CollectEffect$1$1(obj, continuation);
            case 1:
                NotificationChannelId notificationChannelId = (NotificationChannelId) obj7;
                String str = (String) obj8;
                ChannelListPresenter channelListPresenter = (ChannelListPresenter) moleculePresenter;
                AndroidStringManager androidStringManager = channelListPresenter.stringManager;
                FlowStarter flowStarter = channelListPresenter.blockersNavigator;
                AndroidPermissionManager androidPermissionManager = channelListPresenter.permissionManager;
                IntentLauncher intentLauncher = channelListPresenter.launcher;
                Analytics analytics = channelListPresenter.analytics;
                ProfileScreens.ChannelListScreen channelListScreen = channelListPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator = channelListPresenter.navigator;
                ChannelListViewEvent channelListViewEvent = (ChannelListViewEvent) obj;
                if (channelListViewEvent instanceof ChannelListViewEvent.GoBack) {
                    screenNavigator.goTo(back);
                } else {
                    boolean z = channelListViewEvent instanceof ChannelListViewEvent.ToggleClicked;
                    MutableState mutableState3 = this.$lastDetectedCartInfo$delegate$inlined;
                    MutableState mutableState4 = this.$state$delegate$inlined;
                    if (z) {
                        ChannelListViewEvent.ToggleClicked toggleClicked = (ChannelListViewEvent.ToggleClicked) channelListViewEvent;
                        NotificationChannelToggleState notificationChannelToggleState = (NotificationChannelToggleState) mutableState4.getValue();
                        if (toggleClicked.channelType == ChannelType.PUSH && channelListPresenter.canRequestNotificationPermission && toggleClicked.toggledValue) {
                            ReadOnlyPermissions readOnlyPermissions = androidPermissionManager.create("android.permission.POST_NOTIFICATIONS").$readonly;
                            if (readOnlyPermissions.check() && (notificationChannelToggleState == NotificationChannelToggleState.DisabledByChannel || notificationChannelToggleState == NotificationChannelToggleState.DisabledByGroup)) {
                                analytics.track(new NotificationsSettingsViewPushDisabledAlert(str, zzaky.getChannelListSettingsPage(channelListScreen.categoryType)), null);
                            } else if (!readOnlyPermissions.check()) {
                                analytics.track(new NotificationsSettingsViewPushDisabledAlert(str, zzaky.getChannelListSettingsPage(channelListScreen.categoryType)), null);
                            }
                            mutableState2.setValue(Boolean.TRUE);
                        }
                        JobKt.launch$default(coroutineScope, null, null, new NotificationActionService$onHandleIntent$1(channelListPresenter, channelListViewEvent, (String) obj8, mutableState3, this.$supCreditLimit$delegate$inlined, this.$browserStartTime$delegate$inlined, null, 5), 3);
                    } else if (channelListViewEvent instanceof ChannelListViewEvent.SponsoredAccountClicked) {
                        Category category = (Category) mutableState3.getValue();
                        Category.CategoryType categoryType = category != null ? category.categoryType : null;
                        JobKt.launch$default(coroutineScope, null, null, new ZiplineLoader$load$2(categoryType instanceof Category.CategoryType.ChannelList ? (Category.CategoryType.ChannelList) categoryType : null, channelListPresenter, (String) obj8, channelListViewEvent, this.$browserStartTime$delegate$inlined, (State) obj6, this.$supCreditLimit$delegate$inlined, (Continuation) null, 29), 3);
                    } else if (channelListViewEvent instanceof ChannelListViewEvent.AdjustableThresholdClicked) {
                        ChannelListViewEvent.AdjustableThresholdClicked adjustableThresholdClicked = (ChannelListViewEvent.AdjustableThresholdClicked) channelListViewEvent;
                        screenNavigator.goTo(new ProfileScreens.AdjustableThresholdScreen((Integer) mutableState.getValue(), adjustableThresholdClicked.notificationCategory, adjustableThresholdClicked.currentValue, adjustableThresholdClicked.minValue, adjustableThresholdClicked.maxValue, new RedactedString(ProfileNotificationsHelperKt.ACCOUNT_BASED_CATEGORIES.contains(channelListScreen.categoryType) ? str : null)));
                    } else if (channelListViewEvent instanceof ChannelListViewEvent.AddAlias) {
                        ChannelType channelType = ((ChannelListViewEvent.AddAlias) channelListViewEvent).channelType;
                        obj2 = null;
                        analytics.track(new NotificationsSettingsAddAlias(zzaky.toAnalyticsAliasType(channelType)), null);
                        int ordinal = channelType.ordinal();
                        if (ordinal == 0) {
                            screenNavigator.goTo(FlowStarter.startRegisterEmailFlow$default(flowStarter, channelListScreen, androidStringManager.get(R.string.notifications_enter_email_address_title), 12));
                        } else if (ordinal == 1) {
                            screenNavigator.goTo(FlowStarter.startRegisterSmsFlow$default(flowStarter, channelListScreen, androidStringManager.get(R.string.notifications_enter_phone_number_title), 12));
                        } else if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return obj2;
                        }
                    } else {
                        obj2 = null;
                        if (Intrinsics.areEqual(channelListViewEvent, ChannelListViewEvent.DialogDismissed.INSTANCE)) {
                            mutableState2.setValue(Boolean.FALSE);
                        } else {
                            if (!Intrinsics.areEqual(channelListViewEvent, ChannelListViewEvent.OpenNotificationSettingsClick.INSTANCE)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return obj2;
                            }
                            if (!androidPermissionManager.create("android.permission.POST_NOTIFICATIONS").$readonly.check() || notificationChannelId == null) {
                                intentLauncher.launchNotificationSettings();
                            } else {
                                int ordinal2 = ((NotificationChannelToggleState) mutableState4.getValue()).ordinal();
                                if (ordinal2 == 1) {
                                    String str2 = notificationChannelId.id;
                                    Activity activity = intentLauncher.activity;
                                    String packageName = activity.getPackageName();
                                    packageName.getClass();
                                    Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
                                    intent.addFlags(268435456);
                                    intent.putExtra("android.provider.extra.APP_PACKAGE", packageName);
                                    intent.putExtra("android.provider.extra.CHANNEL_ID", str2);
                                    Intents.maybeStartActivity(activity, intent, new CameraX$$ExternalSyntheticLambda0(activity, 12));
                                } else if (ordinal2 == 2) {
                                    intentLauncher.launchNotificationSettings();
                                }
                            }
                            mutableState2.setValue(Boolean.FALSE);
                            zzaky.trackSystemOpenNotificationSettings(analytics, SystemNotificationSettingsOrigin.NOTIFICATION_SETTINGS_CHANNEL);
                        }
                    }
                }
                return Unit.INSTANCE;
            default:
                MutableState mutableState5 = (MutableState) obj8;
                CardLockPresenter cardLockPresenter = (CardLockPresenter) moleculePresenter;
                BetterNavigator.ScreenNavigator screenNavigator2 = cardLockPresenter.navigator;
                ClockInOverlayViewEvent clockInOverlayViewEvent = (ClockInOverlayViewEvent) obj;
                boolean areEqual = Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.Dismiss.INSTANCE);
                MutableState mutableState6 = this.$state$delegate$inlined;
                if (areEqual) {
                    mutableState6.setValue(null);
                    mutableState2.setValue(null);
                    screenNavigator2.goTo(back);
                } else {
                    boolean areEqual2 = Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.ClockInClicked.INSTANCE);
                    MutableState mutableState7 = this.$lastDetectedCartInfo$delegate$inlined;
                    MutableState mutableState8 = this.$browserStartTime$delegate$inlined;
                    if (areEqual2) {
                        ClockInOverlayViewModel clockInOverlayViewModel = (ClockInOverlayViewModel) mutableState7.getValue();
                        ClockInEssentials clockInEssentials = (ClockInEssentials) mutableState.getValue();
                        QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$1 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(10, mutableState8);
                        QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$12 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(11, mutableState6);
                        ClockInOverlayViewModel.Loaded.ClockedOut clockedOut = clockInOverlayViewModel instanceof ClockInOverlayViewModel.Loaded.ClockedOut ? (ClockInOverlayViewModel.Loaded.ClockedOut) clockInOverlayViewModel : null;
                        if (clockedOut == null) {
                            quickPayViewKt$QuickPay$1$1$1$2$1$3$1.invoke();
                        } else {
                            List list = clockedOut.locations;
                            ClockInEssentials.ClockedOutEssentials clockedOutEssentials = clockInEssentials instanceof ClockInEssentials.ClockedOutEssentials ? (ClockInEssentials.ClockedOutEssentials) clockInEssentials : null;
                            if (clockedOutEssentials == null) {
                                quickPayViewKt$QuickPay$1$1$1$2$1$3$1.invoke();
                            } else {
                                Iterator it = list.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        obj3 = it.next();
                                        if (((ClockInOverlayViewModel.PickerItem) obj3).isSelected) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                ClockInOverlayViewModel.PickerItem pickerItem = (ClockInOverlayViewModel.PickerItem) obj3;
                                if (pickerItem == null || !pickerItem.isEnabled || clockedOut.getSelectedJobTitle() == null || !clockedOut.isGeofenceAllowed) {
                                    quickPayViewKt$QuickPay$1$1$1$2$1$3$1.invoke();
                                } else {
                                    Iterator it2 = list.iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj4 = it2.next();
                                            if (((ClockInOverlayViewModel.PickerItem) obj4).isSelected) {
                                            }
                                        } else {
                                            obj4 = null;
                                        }
                                    }
                                    ClockInOverlayViewModel.PickerItem pickerItem2 = (ClockInOverlayViewModel.PickerItem) obj4;
                                    if (pickerItem2 == null || (locationIdentifier = (LocationIdentifier) pickerItem2.identifier) == null) {
                                        quickPayViewKt$QuickPay$1$1$1$2$1$3$1.invoke();
                                    } else {
                                        Iterator it3 = clockedOut.jobs.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                Object next = it3.next();
                                                if (((ClockInOverlayViewModel.PickerItem) next).isSelected) {
                                                    obj5 = next;
                                                }
                                            } else {
                                                obj5 = null;
                                            }
                                        }
                                        ClockInOverlayViewModel.PickerItem pickerItem3 = (ClockInOverlayViewModel.PickerItem) obj5;
                                        if (pickerItem3 == null || (jobIdentifier = (JobIdentifier) pickerItem3.identifier) == null) {
                                            quickPayViewKt$QuickPay$1$1$1$2$1$3$1.invoke();
                                        } else {
                                            CardLockPresenter.launchWithErrorHandling(coroutineScope, "Failed to clock in", quickPayViewKt$QuickPay$1$1$1$2$1$3$1, new ClockInOverlayPresenter$handleClockIn$1(clockedOut, cardLockPresenter, clockedOutEssentials, jobIdentifier, locationIdentifier, quickPayViewKt$QuickPay$1$1$1$2$1$3$12, null));
                                        }
                                    }
                                }
                            }
                        }
                    } else if (!Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.TakeBreakClicked.INSTANCE)) {
                        if (clockInOverlayViewEvent instanceof ClockInOverlayViewEvent.StartBreakClicked) {
                            ClockInEssentials clockInEssentials2 = (ClockInEssentials) mutableState.getValue();
                            ClockInOverlayViewModel.BreakIdentifier breakIdentifier = ((ClockInOverlayViewEvent.StartBreakClicked) clockInOverlayViewEvent).identifier;
                            QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$13 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(12, mutableState8);
                            CardModelView$1$3$4$2 cardModelView$1$3$4$2 = new CardModelView$1$3$4$2(28, cardLockPresenter, mutableState2);
                            ClockInEssentials.ClockedInEssentials clockedInEssentials = clockInEssentials2 instanceof ClockInEssentials.ClockedInEssentials ? (ClockInEssentials.ClockedInEssentials) clockInEssentials2 : null;
                            if (clockedInEssentials == null) {
                                quickPayViewKt$QuickPay$1$1$1$2$1$3$13.invoke();
                            } else {
                                String str3 = clockedInEssentials.timecard.token;
                                if (str3 == null) {
                                    quickPayViewKt$QuickPay$1$1$1$2$1$3$13.invoke();
                                } else {
                                    CardLockPresenter.launchWithErrorHandling(coroutineScope, "Failed to start break", quickPayViewKt$QuickPay$1$1$1$2$1$3$13, new RegisterAliasPresenter$register$result$1(cardLockPresenter, str3, clockedInEssentials.basicInfo.merchantIdentifier.token, breakIdentifier, cardModelView$1$3$4$2, null));
                                }
                            }
                        } else if (Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.EndBreakClicked.INSTANCE)) {
                            ClockInEssentials clockInEssentials3 = (ClockInEssentials) mutableState.getValue();
                            QuickPayViewKt$QuickPay$1$1$1$2$1$3$1 quickPayViewKt$QuickPay$1$1$1$2$1$3$14 = new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(13, mutableState8);
                            ClockInEssentials.OnBreakEssentials onBreakEssentials = clockInEssentials3 instanceof ClockInEssentials.OnBreakEssentials ? (ClockInEssentials.OnBreakEssentials) clockInEssentials3 : null;
                            if (onBreakEssentials == null) {
                                quickPayViewKt$QuickPay$1$1$1$2$1$3$14.invoke();
                            } else {
                                String str4 = onBreakEssentials.timecardBreak.token;
                                if (str4 == null) {
                                    quickPayViewKt$QuickPay$1$1$1$2$1$3$14.invoke();
                                } else {
                                    CardLockPresenter.launchWithErrorHandling(coroutineScope, "Failed to end break", quickPayViewKt$QuickPay$1$1$1$2$1$3$14, new SessionWorker$doWork$2$2(cardLockPresenter, str4, onBreakEssentials.basicInfo.merchantIdentifier.token, null, 23));
                                }
                            }
                        } else if (!Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.ClockOutClicked.INSTANCE)) {
                            if (Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.ClockOutConfirmContinueClicked.INSTANCE)) {
                                CardLockPresenter.access$handleClockOutConfirm(cardLockPresenter, (ClockInEssentials) mutableState.getValue(), (SellerCardViewModel) obj6, null, this.$$this$LaunchedEffect, new AsyncEventWriteScope(cardLockPresenter, mutableState6, mutableState5, (MutableState) obj7, this.$defaultShippingAddressResponse$delegate$inlined, 1), new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(14, mutableState8));
                            } else if (clockInOverlayViewEvent instanceof ClockInOverlayViewEvent.DeclareCashTipClockOutClicked) {
                                ClockInEssentials clockInEssentials4 = (ClockInEssentials) mutableState.getValue();
                                SellerCardViewModel sellerCardViewModel = (SellerCardViewModel) obj6;
                                String str5 = ((ClockInOverlayViewEvent.DeclareCashTipClockOutClicked) clockInOverlayViewEvent).amountText;
                                ClockInEssentials clockInEssentials5 = (ClockInEssentials) mutableState.getValue();
                                if (str5.length() == 0 || str5.equals(".")) {
                                    money = null;
                                } else {
                                    if (clockInEssentials5 == null || (basicInfo = clockInEssentials5.getBasicInfo()) == null || (currencyCode = basicInfo.merchantLocale.currency_code) == null) {
                                        currencyCode = CurrencyCode.USD;
                                    }
                                    money = Moneys.parseMoneyFromString$default(str5, currencyCode);
                                }
                                CardLockPresenter.access$handleClockOutConfirm(cardLockPresenter, clockInEssentials4, sellerCardViewModel, money, this.$$this$LaunchedEffect, new AsyncEventWriteScope(cardLockPresenter, mutableState6, mutableState5, (MutableState) obj7, this.$defaultShippingAddressResponse$delegate$inlined, 2), new QuickPayViewKt$QuickPay$1$1$1$2$1$3$1(15, mutableState8));
                            } else if (!Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.LocationClicked.INSTANCE) && !Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.JobClicked.INSTANCE)) {
                                if (clockInOverlayViewEvent instanceof ClockInOverlayViewEvent.LocationSelected) {
                                    mutableState5.setValue(((ClockInOverlayViewEvent.LocationSelected) clockInOverlayViewEvent).locationIdentifier);
                                } else if (clockInOverlayViewEvent instanceof ClockInOverlayViewEvent.JobSelected) {
                                    ((MutableState) obj7).setValue(((ClockInOverlayViewEvent.JobSelected) clockInOverlayViewEvent).jobIdentifier);
                                } else if (Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.ErrorDialogDismissed.INSTANCE)) {
                                    if (((ClockInOverlayViewModel) mutableState7.getValue()) instanceof ClockInOverlayViewModel.Error) {
                                        screenNavigator2.goTo(back);
                                    } else {
                                        mutableState8.setValue(Boolean.valueOf(false));
                                    }
                                } else {
                                    if (!Intrinsics.areEqual(clockInOverlayViewEvent, ClockInOverlayViewEvent.OpenAppSettingsClicked.INSTANCE)) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    ((IntentLauncher) cardLockPresenter.deviceLockAnimationBus).launchSettings();
                                }
                            }
                        }
                    }
                }
                return Unit.INSTANCE;
        }
    }

    public ShoppingWebPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, ShoppingWebPresenter shoppingWebPresenter, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7, MutableState mutableState8) {
        this.this$0 = shoppingWebPresenter;
        this.$state$delegate$inlined = mutableState;
        this.$defaultShippingAddressResponse$delegate$inlined = mutableState2;
        this.$lastDetectedCartInfo$delegate$inlined = mutableState3;
        this.$supCreditLimit$delegate$inlined = mutableState4;
        this.$browserStartTime$delegate$inlined = mutableState5;
        this.$isInitialNavigation$delegate$inlined = mutableState6;
        this.$hasSentNavigationProgressAnalyticsEvent$delegate$inlined = mutableState7;
        this.$isPageLoaded$delegate$inlined = mutableState8;
        this.$$this$LaunchedEffect = coroutineScope;
    }

    public ShoppingWebPresenter$models$$inlined$CollectEffect$1$1(CoroutineScope coroutineScope, CardLockPresenter cardLockPresenter, CoroutineScope coroutineScope2, SellerCardViewModel sellerCardViewModel, MutableState mutableState, MutableState mutableState2, MutableState mutableState3, MutableState mutableState4, MutableState mutableState5, MutableState mutableState6, MutableState mutableState7) {
        this.this$0 = cardLockPresenter;
        this.$$this$LaunchedEffect = coroutineScope2;
        this.$isPageLoaded$delegate$inlined = sellerCardViewModel;
        this.$state$delegate$inlined = mutableState;
        this.$defaultShippingAddressResponse$delegate$inlined = mutableState2;
        this.$lastDetectedCartInfo$delegate$inlined = mutableState3;
        this.$supCreditLimit$delegate$inlined = mutableState4;
        this.$browserStartTime$delegate$inlined = mutableState5;
        this.$isInitialNavigation$delegate$inlined = mutableState6;
        this.$hasSentNavigationProgressAnalyticsEvent$delegate$inlined = mutableState7;
    }
}
