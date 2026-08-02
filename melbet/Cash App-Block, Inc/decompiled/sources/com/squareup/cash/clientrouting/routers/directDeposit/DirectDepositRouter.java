package com.squareup.cash.clientrouting.routers.directDeposit;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.navigation.api.RealCashLocalNavigator;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.BankingDialogScreen;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.benefits.screens.BenefitsHubScreen;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda15;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.directdeposit.navigation.real.RealDirectDepositInboundNavigator$Factory$Impl;
import com.squareup.cash.directdeposit.screens.DirectDepositEditCompanyNameScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupOrigin;
import com.squareup.cash.directdeposit.screens.DirectDepositSetupScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormScreen;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.integration.analytics.RealUuidGenerator;
import com.squareup.cash.money.navigation.real.RealMoneyInboundNavigator$Factory$Impl;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.paychecks.screens.PaychecksHomeScreen;
import com.squareup.cash.payments.screens.PaymentScreens$HomeScreens$Home;
import com.squareup.cash.savings.screens.GeneralSavingsScreen;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.scannerview.SizeMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.text.StringsKt;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class DirectDepositRouter {
    public final RealBlockersHelper blockersHelper;
    public final RealCashLocalNavigator directDepositInboundNavigator;
    public final SizeMap moneyInboundNavigator;
    public final Navigator navigator;
    public final Lazy router$delegate;
    public final SyncValueReader syncValueReader;

    public DirectDepositRouter(RealMoneyInboundNavigator$Factory$Impl realMoneyInboundNavigator$Factory$Impl, RealDirectDepositInboundNavigator$Factory$Impl realDirectDepositInboundNavigator$Factory$Impl, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, SyncValueReader syncValueReader, RealUuidGenerator realUuidGenerator, Navigator navigator) {
        navigator.getClass();
        this.syncValueReader = syncValueReader;
        this.navigator = navigator;
        this.router$delegate = LazyKt.lazy(new CaptureCheckFaceKt$$ExternalSyntheticLambda15(29, realRouter$Factory$Impl, this));
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(navigator);
        this.moneyInboundNavigator = new SizeMap(navigator);
        this.directDepositInboundNavigator = new RealCashLocalNavigator(navigator, 1);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    public static DirectDepositSetupOrigin getOrigin(RoutingParams routingParams, String str) {
        RoutingParams.DeepLinkMetadata deepLinkMetadata = routingParams.deepLinkMetadata;
        DirectDepositSetupOrigin directDepositSetupOrigin = null;
        String str2 = deepLinkMetadata != null ? deepLinkMetadata.originalUrl : null;
        boolean z = str2 == null || StringsKt.isBlank(str2);
        if (str != null) {
            switch (str.hashCode()) {
                case -1808176842:
                    if (str.equals("sms_campaign")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.SMS_CAMPAIGN;
                        break;
                    }
                    break;
                case -1383290379:
                    if (str.equals("borrow")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.BORROW;
                        break;
                    }
                    break;
                case -1301203373:
                    if (str.equals("email_campaign")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.EMAIL_CAMPAIGN;
                        break;
                    }
                    break;
                case -1276279839:
                    if (str.equals("savingsYieldUpsell")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.SAVINGS_YIELD_UPSELL;
                        break;
                    }
                    break;
                case -957351605:
                    if (str.equals("cardOnboarding")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.CARD_ONBOARDING;
                        break;
                    }
                    break;
                case -762633907:
                    if (str.equals("overdraft")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.OVERDRAFT;
                        break;
                    }
                    break;
                case -591367415:
                    if (str.equals("marketing_campaign")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.MARKETING_CAMPAIGN;
                        break;
                    }
                    break;
                case -549129063:
                    if (str.equals("benefitsHub")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.BENEFITS_HUB;
                        break;
                    }
                    break;
                case -370323693:
                    if (str.equals("paychecks")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.PAYCHECKS;
                        break;
                    }
                    break;
                case -200735025:
                    if (str.equals("ATMWithdrawal")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.ATM_WITHDRAWAL;
                        break;
                    }
                    break;
                case -81534827:
                    if (str.equals("push_campaign")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.PUSH_CAMPAIGN;
                        break;
                    }
                    break;
                case 21116443:
                    if (str.equals("onboarding")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.CARD_ONBOARDING;
                        break;
                    }
                    break;
                case 197318587:
                    if (str.equals("paychecks_benefits_booklet")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.PAYCHECKS_BENEFITS_BOOKLET;
                        break;
                    }
                    break;
                case 712144271:
                    if (str.equals("bankingTab")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.BANKING_TAB;
                        break;
                    }
                    break;
                case 1450716744:
                    if (str.equals("in_app_campaign")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.IN_APP_CAMPAIGN;
                        break;
                    }
                    break;
                case 1960305554:
                    if (str.equals("recurringDeposits")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.RECURRING_DEPOSITS;
                        break;
                    }
                    break;
                case 2141645130:
                    if (str.equals("PaperMoneyDeposit")) {
                        directDepositSetupOrigin = DirectDepositSetupOrigin.PAPER_MONEY_DEPOSIT;
                        break;
                    }
                    break;
            }
        }
        if (directDepositSetupOrigin != null) {
            return directDepositSetupOrigin;
        }
        Screen screen = routingParams.origin;
        return screen instanceof MoneyTabScreen ? DirectDepositSetupOrigin.BANKING_TAB : screen instanceof BalanceHomeScreen ? DirectDepositSetupOrigin.BALANCE_HOME : screen instanceof RecurringDepositsScreen ? DirectDepositSetupOrigin.RECURRING_DEPOSITS : screen instanceof PaychecksHomeScreen ? DirectDepositSetupOrigin.PAYCHECKS : screen instanceof BenefitsHubScreen ? DirectDepositSetupOrigin.BENEFITS_HUB : screen instanceof GeneralSavingsScreen ? DirectDepositSetupOrigin.SAVINGS_YIELD_UPSELL : screen instanceof PromotionDetails ? DirectDepositSetupOrigin.PAYCHECKS_BENEFITS_BOOKLET : !z ? DirectDepositSetupOrigin.DEEPLINK : DirectDepositSetupOrigin.UNDETERMINED;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void route(ClientRoute.ViewDirectDepositSetupWithStatusRedirect viewDirectDepositSetupWithStatusRedirect, RoutingParams routingParams) {
        BankingTab.ClientScenarioAction clientScenarioAction;
        BankingTab.ClientRouteAction clientRouteAction;
        BankingTab.Dialog dialog;
        ClientScenario clientScenario;
        BankingTab.Dialog.Button button;
        BankingTab.Dialog.Button.Action_ action_;
        viewDirectDepositSetupWithStatusRedirect.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        BankingTab bankingTab = (BankingTab) this.syncValueReader.getSingleValue(AndroidSyncValueSpecs.BankingTab).getValue();
        BankingDialogScreen.Dialog.Button button2 = null;
        r4 = null;
        ClientScenario clientScenario2 = null;
        BankingTab.DirectDepositAction directDepositAction = bankingTab != null ? bankingTab.direct_deposit_action : null;
        BankingTab.DirectDepositAction.NavigationAction_ navigationAction_ = directDepositAction != null ? directDepositAction.NavigationAction : null;
        if (navigationAction_ != null) {
            BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction clientScenarioAction2 = navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction ? (BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction) navigationAction_ : null;
            if (clientScenarioAction2 != null) {
                clientScenarioAction = clientScenarioAction2.getValue();
                PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home = PaymentScreens$HomeScreens$Home.INSTANCE;
                if (clientScenarioAction == null) {
                    BlockersData.Flow flow = BlockersData.Flow.PROFILE_BLOCKERS;
                    BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction clientScenarioAction3 = navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction ? (BankingTab.DirectDepositAction.NavigationAction_.ClientScenarioAction) navigationAction_ : null;
                    BankingTab.ClientScenarioAction value = clientScenarioAction3 != null ? clientScenarioAction3.getValue() : null;
                    value.getClass();
                    ClientScenario clientScenario3 = value.client_scenario;
                    clientScenario3.getClass();
                    BlockersHelper.launchClientScenario$default(this.blockersHelper, flow, clientScenario3, screen == null ? paymentScreens$HomeScreens$Home : screen, null, null, null, false, new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.BALANCE_HOME, (String) null, 6), null, false, 3560);
                    return;
                }
                if (navigationAction_ != null) {
                    BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction clientRouteAction2 = navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction ? (BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction) navigationAction_ : null;
                    if (clientRouteAction2 != null) {
                        clientRouteAction = clientRouteAction2.getValue();
                        if (clientRouteAction == null) {
                            BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction clientRouteAction3 = navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction ? (BankingTab.DirectDepositAction.NavigationAction_.ClientRouteAction) navigationAction_ : null;
                            BankingTab.ClientRouteAction value2 = clientRouteAction3 != null ? clientRouteAction3.getValue() : null;
                            value2.getClass();
                            String str = value2.url;
                            if (str == null) {
                                str = "";
                            }
                            if (StringsKt.contains((CharSequence) str, (CharSequence) viewDirectDepositSetupWithStatusRedirect.spec$1.pathFormat, false)) {
                                if (screen == null) {
                                    screen = paymentScreens$HomeScreens$Home;
                                }
                                this.directDepositInboundNavigator.navigator.goTo(new DirectDepositSetupScreen(screen, DirectDepositSetupOrigin.UNDETERMINED, null));
                                return;
                            } else {
                                if (((RealRouter) this.router$delegate.getValue()).route(routingParams, value2.url)) {
                                    return;
                                }
                                Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Unsupported or malformed URL: ", value2.url), new Object[0]);
                                return;
                            }
                        }
                        if (navigationAction_ != null) {
                            BankingTab.DirectDepositAction.NavigationAction_.Dialog dialog2 = navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.Dialog ? (BankingTab.DirectDepositAction.NavigationAction_.Dialog) navigationAction_ : null;
                            if (dialog2 != null) {
                                dialog = dialog2.getValue();
                                if (dialog != null) {
                                    Timber.Forest.e("Attempted to navigate to direct deposit setup screen without a valid action.", new Object[0]);
                                    return;
                                }
                                BankingTab.DirectDepositAction.NavigationAction_.Dialog dialog3 = navigationAction_ instanceof BankingTab.DirectDepositAction.NavigationAction_.Dialog ? (BankingTab.DirectDepositAction.NavigationAction_.Dialog) navigationAction_ : null;
                                BankingTab.Dialog value3 = dialog3 != null ? dialog3.getValue() : null;
                                value3.getClass();
                                String str2 = value3.title;
                                str2.getClass();
                                String str3 = value3.main_text;
                                BankingTab.Dialog.Button button3 = value3.primary_button;
                                String str4 = button3 != null ? button3.text : null;
                                str4.getClass();
                                BankingTab.Dialog.Button button4 = value3.primary_button;
                                if (button4 != null && (action_ = button4.Action) != null) {
                                    BankingTab.Dialog.Button.Action_.ClientScenarioAction clientScenarioAction4 = action_ instanceof BankingTab.Dialog.Button.Action_.ClientScenarioAction ? (BankingTab.Dialog.Button.Action_.ClientScenarioAction) action_ : null;
                                    BankingTab.ClientScenarioAction value4 = clientScenarioAction4 != null ? clientScenarioAction4.getValue() : null;
                                    if (value4 != null) {
                                        clientScenario = value4.client_scenario;
                                        BankingDialogScreen.Dialog.Button button5 = new BankingDialogScreen.Dialog.Button(clientScenario, str4);
                                        button = value3.secondary_button;
                                        if (button != null) {
                                            String str5 = button.text;
                                            str5.getClass();
                                            BankingTab.Dialog.Button.Action_ action_2 = button.Action;
                                            if (action_2 != null) {
                                                BankingTab.Dialog.Button.Action_.ClientScenarioAction clientScenarioAction5 = action_2 instanceof BankingTab.Dialog.Button.Action_.ClientScenarioAction ? (BankingTab.Dialog.Button.Action_.ClientScenarioAction) action_2 : null;
                                                BankingTab.ClientScenarioAction value5 = clientScenarioAction5 != null ? clientScenarioAction5.getValue() : null;
                                                if (value5 != null) {
                                                    clientScenario2 = value5.client_scenario;
                                                }
                                            }
                                            button2 = new BankingDialogScreen.Dialog.Button(clientScenario2, str5);
                                        }
                                        this.navigator.goTo(new BankingDialogScreen(new BankingDialogScreen.Dialog(str2, str3, button5, button2), routingParams.origin));
                                        return;
                                    }
                                }
                                clientScenario = null;
                                BankingDialogScreen.Dialog.Button button52 = new BankingDialogScreen.Dialog.Button(clientScenario, str4);
                                button = value3.secondary_button;
                                if (button != null) {
                                }
                                this.navigator.goTo(new BankingDialogScreen(new BankingDialogScreen.Dialog(str2, str3, button52, button2), routingParams.origin));
                                return;
                            }
                        }
                        dialog = null;
                        if (dialog != null) {
                        }
                    }
                }
                clientRouteAction = null;
                if (clientRouteAction == null) {
                }
            }
        }
        clientScenarioAction = null;
        PaymentScreens$HomeScreens$Home paymentScreens$HomeScreens$Home2 = PaymentScreens$HomeScreens$Home.INSTANCE;
        if (clientScenarioAction == null) {
        }
    }

    public final void route(ClientRoute.ViewDirectDepositNuxDeprecated viewDirectDepositNuxDeprecated, RoutingParams routingParams) {
        viewDirectDepositNuxDeprecated.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = routingParams.origin;
        }
        this.directDepositInboundNavigator.navigator.goTo(new DirectDepositSetupScreen(screen, getOrigin(routingParams, null), null));
    }

    public final void route(ClientRoute.ViewDirectDepositSetup viewDirectDepositSetup, RoutingParams routingParams) {
        viewDirectDepositSetup.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = routingParams.origin;
        }
        this.directDepositInboundNavigator.navigator.goTo(new DirectDepositSetupScreen(screen, getOrigin(routingParams, null), null));
    }

    public final void route(ClientRoute.ViewDirectDepositSetupWithoutNuxDeprecated viewDirectDepositSetupWithoutNuxDeprecated, RoutingParams routingParams) {
        viewDirectDepositSetupWithoutNuxDeprecated.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = routingParams.origin;
        }
        this.directDepositInboundNavigator.navigator.goTo(new DirectDepositSetupScreen(screen, getOrigin(routingParams, viewDirectDepositSetupWithoutNuxDeprecated.origin), null));
    }

    public final void route(ClientRoute.InitiateDirectDepositManualForm initiateDirectDepositManualForm, RoutingParams routingParams) {
        initiateDirectDepositManualForm.getClass();
        routingParams.getClass();
        Screen screen = routingParams.origin;
        RealCashLocalNavigator realCashLocalNavigator = this.directDepositInboundNavigator;
        if (screen == null) {
            ((Navigator) this.moneyInboundNavigator.mRatios).goTo(new MoneyTabScreen(null));
            realCashLocalNavigator.navigator.goTo(new DirectDepositSetupScreen(routingParams.exitScreen, getOrigin(routingParams, null), null));
        }
        String uuid = RealUuidGenerator.generate().toString();
        uuid.getClass();
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new DirectDepositEditCompanyNameScreen(uuid, new RedactedString(""), (AskedQuestion) null));
    }

    public final void route(ClientRoute.ViewDirectDepositForm viewDirectDepositForm) {
        viewDirectDepositForm.getClass();
        String str = viewDirectDepositForm.documentToken;
        RealCashLocalNavigator realCashLocalNavigator = this.directDepositInboundNavigator;
        realCashLocalNavigator.getClass();
        realCashLocalNavigator.navigator.goTo(new DirectDepositUpdateManualFormScreen(str));
    }
}
