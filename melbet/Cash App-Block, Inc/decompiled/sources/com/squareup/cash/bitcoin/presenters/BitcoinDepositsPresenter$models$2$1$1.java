package com.squareup.cash.bitcoin.presenters;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.datastore.core.DataStoreImpl$data$1;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.room.TransactorKt;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.AskedQuestion;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.backend.RealAppLockState;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.ComponentRegistry;
import com.fillr.n;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.Result;
import com.squareup.cash.R;
import com.squareup.cash.appintro.screens.AlternativeNewSponsorAliasScreen;
import com.squareup.cash.appintro.viewmodels.AlternativeNewSponsorAliasViewEvent;
import com.squareup.cash.appmessages.AppMessageErrorViewEvent$Close;
import com.squareup.cash.appupdate.viewmodels.AppUpdateDialogViewEvent;
import com.squareup.cash.attribution.deeplink.DeepLink;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigator;
import com.squareup.cash.attribution.deeplink.DeepLinkCompletableNavigatorKt$DeepLinkCompletableNavigator$1;
import com.squareup.cash.attribution.deeplink.RealDeepLinkAttributionWorker;
import com.squareup.cash.attribution.deeplink.RealDeepLinkAttributionWorker$handleDeepLinks$2$emit$1;
import com.squareup.cash.attribution.deeplink.RealDeferredDeepLinkNavigator$NavigationResult;
import com.squareup.cash.banking.screens.BankingDialogScreen;
import com.squareup.cash.banking.screens.BenefitsLeafletSheetScreen;
import com.squareup.cash.banking.screens.DemandDepositDialogScreen;
import com.squareup.cash.banking.screens.RecurringDepositsFirstTimeUserScreen;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.banking.sections.MoreWaysToAddMoneySectionPresenterKt;
import com.squareup.cash.banking.sections.NavigationAction;
import com.squareup.cash.banking.sections.RealMoreWaysToAddMoneySectionPresenter;
import com.squareup.cash.banking.viewmodels.BankingDialogViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitDetailsViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitsExplanationViewEvent;
import com.squareup.cash.banking.viewmodels.BenefitsLeafletViewEvent;
import com.squareup.cash.banking.viewmodels.DemandDepositDialogViewEvent;
import com.squareup.cash.banking.viewmodels.RecurringDepositsFirstTimeUserViewEvent;
import com.squareup.cash.benefits.screens.GreenEligibleTransactionsScreen;
import com.squareup.cash.benefits.viewmodels.GreenEligibleTransactionsViewEvent;
import com.squareup.cash.billssubscriptions.viewmodels.BillsSubscriptionsMerchantListViewEvent;
import com.squareup.cash.bitcoin.applets.viewmodels.BitcoinAppletTileEvent$BitcoinAppletOnClickTile;
import com.squareup.cash.bitcoin.presenters.applet.BitcoinHomePresenter;
import com.squareup.cash.bitcoin.screens.BitcoinDependentWelcomeScreen;
import com.squareup.cash.bitcoin.screens.BitcoinDepositNoteScreen;
import com.squareup.cash.bitcoin.screens.BitcoinHome;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorScreen;
import com.squareup.cash.bitcoin.screens.BitcoinMapErrorSelectedAction;
import com.squareup.cash.bitcoin.screens.BitcoinNoteQuestion;
import com.squareup.cash.bitcoin.screens.StablecoinDepositCopyScreen;
import com.squareup.cash.bitcoin.viewmodels.SatoshisLearnMoreViewEvent$DoneClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.BitcoinHomeViewEvent;
import com.squareup.cash.bitcoin.viewmodels.applet.autoinvest.BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.boost.BitcoinBoostWidgetViewEvent$BoostLinkClicked;
import com.squareup.cash.bitcoin.viewmodels.applet.disclosure.BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure;
import com.squareup.cash.bitcoin.viewmodels.applet.scroll.BitcoinHomeScrollViewEvent;
import com.squareup.cash.bitcoin.viewmodels.autowithdraw.BitcoinAutoWithdrawUpsellViewEvent;
import com.squareup.cash.bitcoin.viewmodels.dependents.BitcoinDependentWelcomeViewEvent;
import com.squareup.cash.bitcoin.viewmodels.deposits.note.BitcoinDepositNoteViewEvent;
import com.squareup.cash.bitcoin.viewmodels.map.BitcoinMapErrorEvent;
import com.squareup.cash.bitcoin.viewmodels.roundups.BitcoinRoundUpsCardUpsellViewEvent;
import com.squareup.cash.bitcoin.viewmodels.stablecoin.StablecoinDepositCopyViewEvent;
import com.squareup.cash.bitcoin.viewmodels.unavailable.BitcoinFeatureUnavailableViewEvent$DoneClicked;
import com.squareup.cash.blockers.actions.presenters.BlockerActionDialogActionPresenter;
import com.squareup.cash.blockers.actions.presenters.BlockerActionUtilKt;
import com.squareup.cash.blockers.actions.viewevents.BlockerActionDialogActionViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter$models$2$2;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.CardStudioUndoDialogPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.app.AppNavigateOpenSpace;
import com.squareup.cash.cdf.appsflyerdeeplink.AppsFlyerDeepLinkNavigationOutcomeComplete;
import com.squareup.cash.cdf.bankingbenefitseligibletransactions.BankingBenefitsEligibleTransactionsTapSupportLink;
import com.squareup.cash.cdf.bankingoption.BankingOptionBrowseTapItem;
import com.squareup.cash.cdf.bankingoption.EntryScreen;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletClickClickDone;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletClickClickLink;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletClickClickPrimary;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletClickClickSecondary;
import com.squareup.cash.cdf.benefitleaflet.BenefitLeafletDismissDismissLeaflet;
import com.squareup.cash.cdf.money.MoneySelectAction;
import com.squareup.cash.cdf.outofnetworksponsor.OutOfNetworkSponsorShownWelcomeScreenExit;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.fallback.RealSelectiveUnrecognizedURLNavigator;
import com.squareup.cash.clipboard.RealClipboardManager;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.earningstracker.presenters.NetEarningsInfoSheetPresenter;
import com.squareup.cash.growtools.screens.GrowToolsManagerScreen;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.intent.RealDeepLinking;
import com.squareup.cash.intent.Source;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.lifecycle.ActivityEvent;
import com.squareup.cash.money.analytics.MoneyAnalyticsService;
import com.squareup.cash.money.analytics.RealMoneyAnalyticsService;
import com.squareup.cash.money.core.ids.ItemId;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.offers.presenters.OffersDetailsPresenter;
import com.squareup.cash.performance.ScrollPerformanceAnalyzer;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.support.navigation.RealSupportNavigator;
import com.squareup.cash.support.navigation.SupportNavigator$Source;
import com.squareup.cash.taptopay.presenters.TapToPayPresenter;
import com.squareup.cash.util.clock.AndroidClock;
import com.squareup.protos.cash.plasma.flows.Flow$Type;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.BalanceData;
import com.squareup.protos.unicorn.BankingTab;
import com.squareup.scannerview.SizeMap;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class BitcoinDepositsPresenter$models$2$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public BitcoinDepositsPresenter$models$2$1$1(CoroutineScope coroutineScope, n nVar, BetterNavigator.ScreenNavigator screenNavigator) {
        this.$r8$classId = 19;
        this.this$0 = screenNavigator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0060  */
    /* JADX WARN: Type inference failed for: r1v23, types: [app.cash.broadway.screen.Screen] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BlockerAction blockerAction;
        String str;
        BlockerAction.Action action;
        int i = this.$r8$classId;
        SatoshisLearnMoreViewEvent$DoneClicked satoshisLearnMoreViewEvent$DoneClicked = SatoshisLearnMoreViewEvent$DoneClicked.INSTANCE;
        Screen screen = Back.INSTANCE;
        Object obj2 = this.this$0;
        Continuation continuation2 = null;
        switch (i) {
            case 0:
                ActivityEvent activityEvent = (ActivityEvent) obj;
                TapToPayPresenter tapToPayPresenter = (TapToPayPresenter) obj2;
                Result result = (Result) tapToPayPresenter.tapToPayRepository;
                AndroidClock androidClock = (AndroidClock) result.text;
                activityEvent.getClass();
                int ordinal = activityEvent.ordinal();
                if (ordinal == 1) {
                    Long l = (Long) result.resultMetadata;
                    if (l != null) {
                        if (androidClock.millis() - l.longValue() >= 300000) {
                            ((BetterNavigator.ScreenNavigator) tapToPayPresenter.navigator).goTo(screen);
                        }
                        result.resultMetadata = null;
                    }
                } else if (ordinal == 4) {
                    result.resultMetadata = Long.valueOf(androidClock.millis());
                }
                break;
            case 1:
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) musicPresenter.navigator;
                AlternativeNewSponsorAliasViewEvent alternativeNewSponsorAliasViewEvent = (AlternativeNewSponsorAliasViewEvent) obj;
                if (!Intrinsics.areEqual(alternativeNewSponsorAliasViewEvent, AlternativeNewSponsorAliasViewEvent.Continue.INSTANCE)) {
                    if (!Intrinsics.areEqual(alternativeNewSponsorAliasViewEvent, AlternativeNewSponsorAliasViewEvent.Cancel.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        NavAction$$ExternalSyntheticOutline0.m((Object) null, screenNavigator);
                    }
                } else {
                    Analytics analytics = (Analytics) musicPresenter.musicPlayer;
                    AlternativeNewSponsorAliasScreen alternativeNewSponsorAliasScreen = (AlternativeNewSponsorAliasScreen) musicPresenter.args;
                    analytics.track(new OutOfNetworkSponsorShownWelcomeScreenExit(alternativeNewSponsorAliasScreen.deepLinkPayload, alternativeNewSponsorAliasScreen.inviter), null);
                    screenNavigator.goTo(FlowStarter.startOnboardingFlow$default((FlowStarter) musicPresenter.musicRepository));
                }
                break;
            case 2:
                if (!Intrinsics.areEqual((AppMessageErrorViewEvent$Close) obj, AppMessageErrorViewEvent$Close.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator);
                    break;
                }
            case 3:
                if (!((Boolean) obj).booleanValue()) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((CardStudioPresenter) obj2).navigator);
                }
                break;
            case 4:
                MusicPresenter musicPresenter2 = (MusicPresenter) obj2;
                AppUpdateDialogViewEvent appUpdateDialogViewEvent = (AppUpdateDialogViewEvent) obj;
                if (!Intrinsics.areEqual(appUpdateDialogViewEvent, AppUpdateDialogViewEvent.Dismiss.INSTANCE)) {
                    if (!Intrinsics.areEqual(appUpdateDialogViewEvent, AppUpdateDialogViewEvent.Update.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        ((IntentLauncher) musicPresenter2.args).launchPlayStore((String) musicPresenter2.musicRepository);
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) musicPresenter2.navigator).goTo(screen);
                }
                break;
            case 5:
                break;
            case 6:
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator2 = (BetterNavigator.ScreenNavigator) endAppLockPresenter.appLockState;
                BankingDialogViewEvent bankingDialogViewEvent = (BankingDialogViewEvent) obj;
                if (!(bankingDialogViewEvent instanceof BankingDialogViewEvent.ButtonClicked)) {
                    if (!Intrinsics.areEqual(bankingDialogViewEvent, BankingDialogViewEvent.Dismissed.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator2.goTo(screen);
                    }
                } else {
                    ClientScenario clientScenario = ((BankingDialogViewEvent.ButtonClicked) bankingDialogViewEvent).clientScenario;
                    if (clientScenario != null) {
                        RealBlockersHelper realBlockersHelper = (RealBlockersHelper) endAppLockPresenter.accountOutboundNavigator;
                        BlockersData.Flow flow = BlockersData.Flow.CLIENT_SCENARIO;
                        BankingDialogScreen bankingDialogScreen = (BankingDialogScreen) endAppLockPresenter.navigatorSwitcher;
                        ?? r1 = bankingDialogScreen.originScreen;
                        BlockersHelper.launchClientScenario$default(realBlockersHelper, flow, clientScenario, r1 == 0 ? bankingDialogScreen : r1, null, null, null, false, null, null, false, 4072);
                    } else {
                        screenNavigator2.goTo(screen);
                    }
                }
                break;
            case 7:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj2;
                RealRouter realRouter = (RealRouter) localPosCheckInPresenter.cameraPermissions;
                BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator;
                BenefitsLeafletSheetScreen benefitsLeafletSheetScreen = (BenefitsLeafletSheetScreen) localPosCheckInPresenter.store;
                Analytics analytics2 = (Analytics) localPosCheckInPresenter.launcher;
                BenefitsLeafletViewEvent benefitsLeafletViewEvent = (BenefitsLeafletViewEvent) obj;
                if (!Intrinsics.areEqual(benefitsLeafletViewEvent, BenefitsLeafletViewEvent.DoneButtonClicked.INSTANCE)) {
                    if (!(benefitsLeafletViewEvent instanceof BenefitsLeafletViewEvent.Dismissed)) {
                        if (!(benefitsLeafletViewEvent instanceof BenefitsLeafletViewEvent.CallToActionButtonClicked)) {
                            if (!(benefitsLeafletViewEvent instanceof BenefitsLeafletViewEvent.UrlClicked)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                analytics2.track(new BenefitLeafletClickClickLink(LocalPosCheckInPresenter.toAnalyticsType(benefitsLeafletSheetScreen.benefit)), null);
                                realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), ((BenefitsLeafletViewEvent.UrlClicked) benefitsLeafletViewEvent).url);
                            }
                        } else {
                            BenefitsLeafletViewEvent.CallToActionButtonClicked callToActionButtonClicked = (BenefitsLeafletViewEvent.CallToActionButtonClicked) benefitsLeafletViewEvent;
                            int ordinal2 = callToActionButtonClicked.level.ordinal();
                            if (ordinal2 == 0) {
                                analytics2.track(new BenefitLeafletClickClickPrimary(LocalPosCheckInPresenter.toAnalyticsType(benefitsLeafletSheetScreen.benefit)), null);
                            } else if (ordinal2 != 1) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                analytics2.track(new BenefitLeafletClickClickSecondary(LocalPosCheckInPresenter.toAnalyticsType(benefitsLeafletSheetScreen.benefit)), null);
                            }
                            realRouter.route(new RoutingParams(null, null, null, null, null, null, 511), callToActionButtonClicked.clientRoute);
                        }
                    } else {
                        analytics2.track(new BenefitLeafletDismissDismissLeaflet(LocalPosCheckInPresenter.toAnalyticsType(benefitsLeafletSheetScreen.benefit)), null);
                        screenNavigator3.goTo(screen);
                    }
                } else {
                    analytics2.track(new BenefitLeafletClickClickDone(LocalPosCheckInPresenter.toAnalyticsType(benefitsLeafletSheetScreen.benefit)), null);
                    screenNavigator3.goTo(screen);
                }
                break;
            case 8:
                ErrorPresenter errorPresenter = (ErrorPresenter) obj2;
                DemandDepositDialogScreen demandDepositDialogScreen = (DemandDepositDialogScreen) errorPresenter.args;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) errorPresenter.navigator;
                DemandDepositDialogViewEvent demandDepositDialogViewEvent = (DemandDepositDialogViewEvent) obj;
                if (!Intrinsics.areEqual(demandDepositDialogViewEvent, DemandDepositDialogViewEvent.TapPrimaryButton.INSTANCE)) {
                    if (!Intrinsics.areEqual(demandDepositDialogViewEvent, DemandDepositDialogViewEvent.TapSecondaryButton.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        BalanceData.Dialog.Button button = demandDepositDialogScreen.dialog.secondary_button;
                        if (button != null) {
                            screenNavigator4.goTo(new Finish(ErrorPresenter.access$toPossibleClientScenario(errorPresenter, button)));
                        }
                    }
                } else {
                    BalanceData.Dialog.Button button2 = demandDepositDialogScreen.dialog.primary_button;
                    button2.getClass();
                    screenNavigator4.goTo(new Finish(ErrorPresenter.access$toPossibleClientScenario(errorPresenter, button2)));
                }
                break;
            case 9:
                LocalPosCheckInPresenter localPosCheckInPresenter2 = (LocalPosCheckInPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) localPosCheckInPresenter2.navigator;
                RecurringDepositsFirstTimeUserScreen recurringDepositsFirstTimeUserScreen = (RecurringDepositsFirstTimeUserScreen) localPosCheckInPresenter2.store;
                RecurringDepositsFirstTimeUserViewEvent recurringDepositsFirstTimeUserViewEvent = (RecurringDepositsFirstTimeUserViewEvent) obj;
                if (!(recurringDepositsFirstTimeUserViewEvent instanceof RecurringDepositsFirstTimeUserViewEvent.CloseClick)) {
                    if (!(recurringDepositsFirstTimeUserViewEvent instanceof RecurringDepositsFirstTimeUserViewEvent.ContinueButtonClick)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator5.goTo(new RecurringDepositsScreen(recurringDepositsFirstTimeUserScreen.origin));
                    }
                } else {
                    Screen screen2 = recurringDepositsFirstTimeUserScreen.exitScreen;
                    if (screen2 != null) {
                        screenNavigator5.goTo(screen2);
                    } else {
                        ((Navigator) ((SizeMap) localPosCheckInPresenter2.cameraPermissions).mRatios).goTo(new MoneyTabScreen(null));
                    }
                }
                break;
            case 10:
                NavigationAction navigationAction = (NavigationAction) obj;
                RealMoreWaysToAddMoneySectionPresenter realMoreWaysToAddMoneySectionPresenter = (RealMoreWaysToAddMoneySectionPresenter) obj2;
                realMoreWaysToAddMoneySectionPresenter.analytics.track(new BankingOptionBrowseTapItem(navigationAction.getOptionId(), EntryScreen.MoneyTab), null);
                ((RealMoneyAnalyticsService) realMoreWaysToAddMoneySectionPresenter.moneyAnalyticsService).submitSelectItemEvent(new ItemId.DEPOSIT(navigationAction.getOptionId()), null, MoneySelectAction.TAP);
                if (!(navigationAction instanceof NavigationAction.ShowUrl)) {
                    if (!(navigationAction instanceof NavigationAction.ShowDialog)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        BetterNavigator.ScreenNavigator screenNavigator6 = realMoreWaysToAddMoneySectionPresenter.navigator;
                        BankingTab.Dialog dialog = ((NavigationAction.ShowDialog) navigationAction).dialog;
                        String str2 = dialog.title;
                        if (str2 == null) {
                            str2 = "";
                        }
                        String str3 = dialog.main_text;
                        String str4 = str3 != null ? str3 : "";
                        BankingTab.Dialog.Button button3 = dialog.primary_button;
                        button3.getClass();
                        BankingDialogScreen.Dialog.Button screenButton = MoreWaysToAddMoneySectionPresenterKt.toScreenButton(button3);
                        BankingTab.Dialog.Button button4 = dialog.secondary_button;
                        screenNavigator6.goTo(new BankingDialogScreen(new BankingDialogScreen.Dialog(str2, str4, screenButton, button4 != null ? MoreWaysToAddMoneySectionPresenterKt.toScreenButton(button4) : null), new MoneyTabScreen(null)));
                    }
                } else {
                    String str5 = ((NavigationAction.ShowUrl) navigationAction).url;
                    if (str5 != null) {
                        ClientRoute parse = realMoreWaysToAddMoneySectionPresenter.clientRouteParser.parse(str5);
                        RealRouter realRouter2 = realMoreWaysToAddMoneySectionPresenter.router;
                        parse.getClass();
                        RoutingParams routingParams = new RoutingParams(new MoneyTabScreen(null), null, null, null, null, null, 510);
                        realRouter2.getClass();
                        realRouter2.clientRouteRouter.route(parse, routingParams);
                    }
                }
                break;
            case 11:
                EndAppLockPresenter endAppLockPresenter2 = (EndAppLockPresenter) obj2;
                BenefitDetailsViewEvent benefitDetailsViewEvent = (BenefitDetailsViewEvent) obj;
                if (!(benefitDetailsViewEvent instanceof BenefitDetailsViewEvent.Back)) {
                    if (!(benefitDetailsViewEvent instanceof BenefitDetailsViewEvent.UrlClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        ((RealRouter) endAppLockPresenter2.accountOutboundNavigator).route(new RoutingParams(null, null, null, null, null, null, 511), ((BenefitDetailsViewEvent.UrlClicked) benefitDetailsViewEvent).url);
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) endAppLockPresenter2.appLockState).goTo(screen);
                }
                break;
            case 12:
                EndAppLockPresenter endAppLockPresenter3 = (EndAppLockPresenter) obj2;
                BenefitsExplanationViewEvent benefitsExplanationViewEvent = (BenefitsExplanationViewEvent) obj;
                if (!(benefitsExplanationViewEvent instanceof BenefitsExplanationViewEvent.Back)) {
                    if (!(benefitsExplanationViewEvent instanceof BenefitsExplanationViewEvent.UrlClicked)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        ((RealRouter) endAppLockPresenter3.accountOutboundNavigator).route(new RoutingParams(null, null, null, null, null, null, 511), ((BenefitsExplanationViewEvent.UrlClicked) benefitsExplanationViewEvent).url);
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) endAppLockPresenter3.appLockState).goTo(screen);
                }
                break;
            case 13:
                OffersDetailsPresenter offersDetailsPresenter = (OffersDetailsPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator7 = offersDetailsPresenter.navigator;
                GreenEligibleTransactionsViewEvent greenEligibleTransactionsViewEvent = (GreenEligibleTransactionsViewEvent) obj;
                if (!Intrinsics.areEqual(greenEligibleTransactionsViewEvent, GreenEligibleTransactionsViewEvent.Back.INSTANCE)) {
                    if (!Intrinsics.areEqual(greenEligibleTransactionsViewEvent, GreenEligibleTransactionsViewEvent.LearnMore.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        ((Analytics) offersDetailsPresenter.analyticsHelper).track(new BankingBenefitsEligibleTransactionsTapSupportLink(), null);
                        screenNavigator7.goTo(RealSupportNavigator.startSupportFlow$default((RealSupportNavigator) offersDetailsPresenter.spanManager, "SH_GREEN_STATUS_SPENDING", null, (GreenEligibleTransactionsScreen) offersDetailsPresenter.flowStarter, SupportNavigator$Source.BENEFITS, null, null, 102));
                    }
                } else {
                    screenNavigator7.goTo(screen);
                }
                break;
            case 14:
                BillsSubscriptionsMerchantListViewEvent billsSubscriptionsMerchantListViewEvent = (BillsSubscriptionsMerchantListViewEvent) obj;
                if (!Intrinsics.areEqual(billsSubscriptionsMerchantListViewEvent, BillsSubscriptionsMerchantListViewEvent.BackClicked.INSTANCE)) {
                    if (!(billsSubscriptionsMerchantListViewEvent instanceof BillsSubscriptionsMerchantListViewEvent.MerchantTapped) && !(billsSubscriptionsMerchantListViewEvent instanceof BillsSubscriptionsMerchantListViewEvent.SearchChanged) && !(billsSubscriptionsMerchantListViewEvent instanceof BillsSubscriptionsMerchantListViewEvent.CategoryToggled) && !Intrinsics.areEqual(billsSubscriptionsMerchantListViewEvent, BillsSubscriptionsMerchantListViewEvent.ToastDismissed.INSTANCE) && !Intrinsics.areEqual(billsSubscriptionsMerchantListViewEvent, BillsSubscriptionsMerchantListViewEvent.DoneClicked.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    }
                } else {
                    ((BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator).goTo(screen);
                }
                break;
            case 15:
                if (!Intrinsics.areEqual((BitcoinAppletTileEvent$BitcoinAppletOnClickTile) obj, BitcoinAppletTileEvent$BitcoinAppletOnClickTile.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                    ((RealMoneyAnalyticsService) ((MoneyAnalyticsService) cardStudioPresenter.ioContext)).submitSelectItemEvent(ItemId.BITCOIN.INSTANCE, null, MoneySelectAction.TAP);
                    ((Navigator) cardStudioPresenter.analytics).goTo(new BitcoinHome(AppNavigateOpenSpace.SourceTab.BANKING, AppNavigateOpenSpace.Source.APPLET_TILE, null, null, 12));
                    break;
                }
            case 16:
                if (!Intrinsics.areEqual((SatoshisLearnMoreViewEvent$DoneClicked) obj, satoshisLearnMoreViewEvent$DoneClicked)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((AddAliasPresenter) obj2).navigator.goTo(screen);
                    break;
                }
            case 17:
                if (!Intrinsics.areEqual((SatoshisLearnMoreViewEvent$DoneClicked) obj, satoshisLearnMoreViewEvent$DoneClicked)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((AddAliasPresenter) obj2).navigator.goTo(screen);
                    break;
                }
            case 18:
                ScrollPerformanceAnalyzer scrollPerformanceAnalyzer = ((BitcoinHomePresenter) obj2).performanceAnalyzer;
                BitcoinHomeScrollViewEvent bitcoinHomeScrollViewEvent = (BitcoinHomeScrollViewEvent) obj;
                if (!Intrinsics.areEqual(bitcoinHomeScrollViewEvent, BitcoinHomeScrollViewEvent.ScrollStarted.INSTANCE)) {
                    if (!Intrinsics.areEqual(bitcoinHomeScrollViewEvent, BitcoinHomeScrollViewEvent.ScrollStopped.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        scrollPerformanceAnalyzer.stop();
                    }
                } else {
                    scrollPerformanceAnalyzer.start();
                }
                break;
            case 19:
                BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked bitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked = (BitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked) obj;
                if (bitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((BetterNavigator.ScreenNavigator) obj2).goTo(new InvestingScreens.RecurringPurchaseReceipt(bitcoinHomeAutoInvestWidgetViewEvent$RecurringPurchaseClicked.recurringId, ColorModel.Bitcoin.INSTANCE, InvestingScreens.RecurringPurchaseReceipt.Type.Bitcoin.INSTANCE));
                    break;
                }
            case 20:
                BitcoinHomeViewEvent bitcoinHomeViewEvent = (BitcoinHomeViewEvent) obj;
                if (bitcoinHomeViewEvent instanceof BitcoinBoostWidgetViewEvent$BoostLinkClicked) {
                    if (!((RealRouter) obj2).route(new RoutingParams(null, null, new BitcoinHome(null, null, null, null, 15), null, null, null, 503), ((BitcoinBoostWidgetViewEvent$BoostLinkClicked) bitcoinHomeViewEvent).url)) {
                        a$$ExternalSyntheticBUOutline0.m$1("Unexpected route");
                        break;
                    }
                }
                break;
            case 21:
                BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure bitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure = (BitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure) obj;
                if (bitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure == null) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((IntentLauncher) ((BinaryBitmap) obj2).matrix).launchUrlInInternalBrowser(bitcoinHomeDisclosureWidgetViewEvent$ViewDisclosure.url);
                    break;
                }
            case 22:
                CardStudioPresenter cardStudioPresenter2 = (CardStudioPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator8 = (BetterNavigator.ScreenNavigator) cardStudioPresenter2.navigator;
                BitcoinAutoWithdrawUpsellViewEvent bitcoinAutoWithdrawUpsellViewEvent = (BitcoinAutoWithdrawUpsellViewEvent) obj;
                if (!Intrinsics.areEqual(bitcoinAutoWithdrawUpsellViewEvent, BitcoinAutoWithdrawUpsellViewEvent.Close.INSTANCE)) {
                    if (!Intrinsics.areEqual(bitcoinAutoWithdrawUpsellViewEvent, BitcoinAutoWithdrawUpsellViewEvent.GetBitkeyClicked.INSTANCE)) {
                        if (!Intrinsics.areEqual(bitcoinAutoWithdrawUpsellViewEvent, BitcoinAutoWithdrawUpsellViewEvent.GetStartedClicked.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            screenNavigator8.goTo(FlowStarter.startPlasmaFlow$default((FlowStarter) cardStudioPresenter2.args, Flow$Type.AUTO_WITHDRAWAL_BITCOIN, new GrowToolsManagerScreen.ManageBitcoinAutoWithdrawScreen(GrowToolsManagerScreen.Origin.BITCOIN), null, null, 12));
                        }
                    } else {
                        ((IntentLauncher) cardStudioPresenter2.ioContext).launchUrlInInternalBrowser("https://bitkey.world");
                    }
                } else {
                    screenNavigator8.goTo(screen);
                }
                break;
            case 23:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator9 = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                BitcoinDependentWelcomeViewEvent bitcoinDependentWelcomeViewEvent = (BitcoinDependentWelcomeViewEvent) obj;
                if (!Intrinsics.areEqual(bitcoinDependentWelcomeViewEvent, BitcoinDependentWelcomeViewEvent.CtaTapped.INSTANCE)) {
                    if (!Intrinsics.areEqual(bitcoinDependentWelcomeViewEvent, BitcoinDependentWelcomeViewEvent.Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator9.goTo(screen);
                    }
                } else {
                    screenNavigator9.goTo(FlowStarter.startPlasmaFlow$default((FlowStarter) disclosurePresenter.analytics, Flow$Type.INVEST_TEEN_REQUEST_AUTHORIZATION, new BitcoinDependentWelcomeScreen(true), null, null, 12));
                }
                break;
            case 24:
                ErrorPresenter errorPresenter2 = (ErrorPresenter) obj2;
                BitcoinDepositNoteScreen bitcoinDepositNoteScreen = (BitcoinDepositNoteScreen) errorPresenter2.args;
                BetterNavigator.ScreenNavigator screenNavigator10 = (BetterNavigator.ScreenNavigator) errorPresenter2.navigator;
                BitcoinDepositNoteViewEvent bitcoinDepositNoteViewEvent = (BitcoinDepositNoteViewEvent) obj;
                if (!Intrinsics.areEqual(bitcoinDepositNoteViewEvent, BitcoinDepositNoteViewEvent.Close.INSTANCE)) {
                    if (!(bitcoinDepositNoteViewEvent instanceof BitcoinDepositNoteViewEvent.Done)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator10.giveAnswer(bitcoinDepositNoteScreen.askedQuestion, ((BitcoinDepositNoteViewEvent.Done) bitcoinDepositNoteViewEvent).note);
                    }
                } else {
                    AskedQuestion askedQuestion = bitcoinDepositNoteScreen.askedQuestion;
                    String str6 = ((BitcoinNoteQuestion) askedQuestion.question).currentNote;
                    screenNavigator10.giveAnswer(askedQuestion, str6 != null ? str6 : "");
                }
                break;
            case 25:
                ErrorPresenter errorPresenter3 = (ErrorPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator11 = (BetterNavigator.ScreenNavigator) errorPresenter3.navigator;
                BitcoinMapErrorScreen bitcoinMapErrorScreen = (BitcoinMapErrorScreen) errorPresenter3.args;
                BitcoinMapErrorEvent bitcoinMapErrorEvent = (BitcoinMapErrorEvent) obj;
                if (!Intrinsics.areEqual(bitcoinMapErrorEvent, BitcoinMapErrorEvent.PositiveActionSelected.INSTANCE)) {
                    if (!Intrinsics.areEqual(bitcoinMapErrorEvent, BitcoinMapErrorEvent.NegativeActionSelected.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        BitcoinMapErrorSelectedAction bitcoinMapErrorSelectedAction = BitcoinMapErrorSelectedAction.NEGATIVE;
                        AskedQuestion askedQuestion2 = bitcoinMapErrorScreen.askedQuestion;
                        if (askedQuestion2 != null) {
                            screenNavigator11.giveAnswer(askedQuestion2, bitcoinMapErrorSelectedAction);
                        } else {
                            screenNavigator11.goTo(screen);
                        }
                    }
                } else {
                    BitcoinMapErrorSelectedAction bitcoinMapErrorSelectedAction2 = BitcoinMapErrorSelectedAction.POSITIVE;
                    AskedQuestion askedQuestion3 = bitcoinMapErrorScreen.askedQuestion;
                    if (askedQuestion3 != null) {
                        screenNavigator11.giveAnswer(askedQuestion3, bitcoinMapErrorSelectedAction2);
                    } else {
                        screenNavigator11.goTo(screen);
                    }
                }
                break;
            case 26:
                NetEarningsInfoSheetPresenter netEarningsInfoSheetPresenter = (NetEarningsInfoSheetPresenter) obj2;
                BitcoinRoundUpsCardUpsellViewEvent bitcoinRoundUpsCardUpsellViewEvent = (BitcoinRoundUpsCardUpsellViewEvent) obj;
                if (!Intrinsics.areEqual(bitcoinRoundUpsCardUpsellViewEvent, BitcoinRoundUpsCardUpsellViewEvent.CardAction.INSTANCE)) {
                    if (!Intrinsics.areEqual(bitcoinRoundUpsCardUpsellViewEvent, BitcoinRoundUpsCardUpsellViewEvent.Close.INSTANCE)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        netEarningsInfoSheetPresenter.navigator.goTo(screen);
                    }
                } else {
                    RealRouter.route$default(netEarningsInfoSheetPresenter.router, new ClientRoute.ViewCard());
                }
                break;
            case 27:
                MusicPresenter musicPresenter3 = (MusicPresenter) obj2;
                StablecoinDepositCopyViewEvent stablecoinDepositCopyViewEvent = (StablecoinDepositCopyViewEvent) obj;
                if (Intrinsics.areEqual(stablecoinDepositCopyViewEvent, StablecoinDepositCopyViewEvent.Copy.INSTANCE)) {
                    RealClipboardManager realClipboardManager = (RealClipboardManager) musicPresenter3.musicRepository;
                    Resources resources = ((AndroidStringManager) musicPresenter3.musicPlayer).resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.stablecoin_deposit_address_copy_label)).format(new Object[]{"Solana"});
                    format2.getClass();
                    realClipboardManager.copy(format2, ((StablecoinDepositCopyScreen) musicPresenter3.args).address);
                } else if (Intrinsics.areEqual(stablecoinDepositCopyViewEvent, StablecoinDepositCopyViewEvent.Back.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) musicPresenter3.navigator).goTo(screen);
                }
                break;
            case 28:
                if (!Intrinsics.areEqual((BitcoinFeatureUnavailableViewEvent$DoneClicked) obj, BitcoinFeatureUnavailableViewEvent$DoneClicked.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((CardStudioUndoDialogPresenter) obj2).navigator.goTo(new BitcoinHome(null, null, null, null, 15));
                    break;
                }
            default:
                BlockerActionDialogActionPresenter blockerActionDialogActionPresenter = (BlockerActionDialogActionPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator12 = blockerActionDialogActionPresenter.navigator;
                BlockersScreens.BlockerActionDialogActionScreen blockerActionDialogActionScreen = blockerActionDialogActionPresenter.args;
                BlockerActionDialogActionViewEvent blockerActionDialogActionViewEvent = (BlockerActionDialogActionViewEvent) obj;
                BlockerActionDialogActionViewEvent.Back back = BlockerActionDialogActionViewEvent.Back.INSTANCE;
                if (!Intrinsics.areEqual(blockerActionDialogActionViewEvent, back)) {
                    BlockerActionDialogActionViewEvent.PrimaryButton primaryButton = BlockerActionDialogActionViewEvent.PrimaryButton.INSTANCE;
                    boolean areEqual = Intrinsics.areEqual(blockerActionDialogActionViewEvent, primaryButton);
                    BlockerActionDialogActionViewEvent.SecondaryButton secondaryButton = BlockerActionDialogActionViewEvent.SecondaryButton.INSTANCE;
                    if (!areEqual) {
                        if (!Intrinsics.areEqual(blockerActionDialogActionViewEvent, secondaryButton)) {
                            if (!Intrinsics.areEqual(blockerActionDialogActionViewEvent, back)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m("This shouldn't happen");
                                break;
                            }
                        } else {
                            BlockerAction.DialogAction.Button button5 = blockerActionDialogActionScreen.dialogAction.secondary_button;
                            if (button5 != null) {
                                blockerAction = button5.action;
                                if (!Intrinsics.areEqual(blockerActionDialogActionViewEvent, primaryButton)) {
                                }
                            }
                            blockerAction = null;
                            if (!Intrinsics.areEqual(blockerActionDialogActionViewEvent, primaryButton)) {
                            }
                        }
                    } else {
                        BlockerAction.DialogAction.Button button6 = blockerActionDialogActionScreen.dialogAction.primary_button;
                        if (button6 != null) {
                            blockerAction = button6.action;
                            if (!Intrinsics.areEqual(blockerActionDialogActionViewEvent, primaryButton)) {
                                BlockerAction.DialogAction.Button button7 = blockerActionDialogActionScreen.dialogAction.primary_button;
                                if (button7 != null) {
                                    str = button7.text;
                                    if (blockerAction == null) {
                                        BlockerActionDialogActionPresenter.access$logCancelAction(blockerActionDialogActionPresenter, str);
                                    }
                                    action = blockerAction == null ? blockerAction.action : null;
                                    if (action instanceof BlockerAction.Action.EndFlowAction) {
                                        if (blockerAction != null) {
                                            screen = new Finish(blockerAction);
                                        }
                                        screenNavigator12.goTo(screen);
                                    } else {
                                        BlockerAction.EndFlowAction value = ((BlockerAction.Action.EndFlowAction) action).getValue();
                                        String str7 = value.notify_end_flow_id;
                                        if (str7 != null) {
                                            JobKt.launch$default(blockerActionDialogActionPresenter.scope, null, null, new SsnPresenter$models$2$2(blockerActionDialogActionPresenter, str7, continuation2, 5), 3);
                                        }
                                        BlockerFlowListener blockerFlowListener = blockerActionDialogActionPresenter.blockerFlowAnalytics;
                                        BlockerAction.EndFlowAction.Result result2 = value.result;
                                        blockerActionDialogActionScreen.getClass();
                                        BlockersData blockersData = blockerActionDialogActionScreen.blockersData;
                                        if (result2 == null) {
                                            result2 = BlockerAction.EndFlowAction.Result.COMPLETE;
                                        }
                                        int i2 = BlockerActionUtilKt.WhenMappings.$EnumSwitchMapping$0[result2.ordinal()];
                                        if (i2 == 1) {
                                            blockerFlowListener.onFlowCompleted(blockersData);
                                        } else if (i2 != 2) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            break;
                                        } else {
                                            blockerFlowListener.onFlowCancelled(blockersData);
                                        }
                                        screenNavigator12.goTo(blockerActionDialogActionScreen.blockersData.exitScreen);
                                    }
                                }
                                str = null;
                                if (blockerAction == null) {
                                }
                                if (blockerAction == null) {
                                }
                                if (action instanceof BlockerAction.Action.EndFlowAction) {
                                }
                            } else if (!Intrinsics.areEqual(blockerActionDialogActionViewEvent, secondaryButton)) {
                                if (!Intrinsics.areEqual(blockerActionDialogActionViewEvent, back)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                } else {
                                    a$$ExternalSyntheticBUOutline0.m("This shouldn't happen");
                                    break;
                                }
                            } else {
                                BlockerAction.DialogAction.Button button8 = blockerActionDialogActionScreen.dialogAction.secondary_button;
                                if (button8 != null) {
                                    str = button8.text;
                                    if (blockerAction == null) {
                                    }
                                    if (blockerAction == null) {
                                    }
                                    if (action instanceof BlockerAction.Action.EndFlowAction) {
                                    }
                                }
                                str = null;
                                if (blockerAction == null) {
                                }
                                if (blockerAction == null) {
                                }
                                if (action instanceof BlockerAction.Action.EndFlowAction) {
                                }
                            }
                        }
                        blockerAction = null;
                        if (!Intrinsics.areEqual(blockerActionDialogActionViewEvent, primaryButton)) {
                        }
                    }
                } else {
                    BlockerActionDialogActionPresenter.access$logCancelAction(blockerActionDialogActionPresenter, "onBack");
                }
                break;
        }
        return null;
    }

    public /* synthetic */ BitcoinDepositsPresenter$models$2$1$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    public /* synthetic */ BitcoinDepositsPresenter$models$2$1$1(CoroutineScope coroutineScope, Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x004e, code lost:
    
        if (r8 == r10) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object emit(DeepLink deepLink, Continuation continuation) {
        RealDeepLinkAttributionWorker$handleDeepLinks$2$emit$1 realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        Object first;
        DeepLink deepLink2;
        Navigator navigator;
        ComponentRegistry.Builder builder;
        String str;
        boolean route;
        RealDeferredDeepLinkNavigator$NavigationResult realDeferredDeepLinkNavigator$NavigationResult;
        boolean z;
        RealDeepLinkAttributionWorker realDeepLinkAttributionWorker = (RealDeepLinkAttributionWorker) this.this$0;
        if (continuation instanceof RealDeepLinkAttributionWorker$handleDeepLinks$2$emit$1) {
            realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1 = (RealDeepLinkAttributionWorker$handleDeepLinks$2$emit$1) continuation;
            int i2 = realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    DeepLinkCompletableNavigator deepLinkCompletableNavigator = realDeepLinkAttributionWorker.navigator;
                    realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.L$0 = deepLink;
                    realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.label = 1;
                    obj = ((DeepLinkCompletableNavigatorKt$DeepLinkCompletableNavigator$1) deepLinkCompletableNavigator).await(realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        navigator = realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.L$1;
                        deepLink2 = realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.L$0;
                        SafeTrace.throwOnFailure(obj);
                        builder = realDeepLinkAttributionWorker.deferredDeepLinkNavigator;
                        navigator.getClass();
                        deepLink2.getClass();
                        str = deepLink2.deepLink;
                        if (((RealDeepLinking) builder.interceptors).handleDeeplink(navigator, str, Source.DEFERRED_DEEP_LINK)) {
                            route = ((RealRouter$Factory$Impl) builder.keyers).create$1(navigator).route(new RoutingParams(null, null, null, null, null, null, 511), str);
                            if (route) {
                                realDeferredDeepLinkNavigator$NavigationResult = new RealDeferredDeepLinkNavigator$NavigationResult(true, AppsFlyerDeepLinkNavigationOutcomeComplete.Handler.CLIENT_ROUTER);
                            } else if (((RealSelectiveUnrecognizedURLNavigator) builder.lazyFetcherFactories).navigateSelectiveUnrecognizedPath(navigator, (IntentLauncher) builder.mappers, str)) {
                                realDeferredDeepLinkNavigator$NavigationResult = new RealDeferredDeepLinkNavigator$NavigationResult(true, AppsFlyerDeepLinkNavigationOutcomeComplete.Handler.EXTERNAL_BROWSER_FALLBACK);
                            } else {
                                realDeferredDeepLinkNavigator$NavigationResult = new RealDeferredDeepLinkNavigator$NavigationResult(false, null);
                            }
                        } else {
                            realDeferredDeepLinkNavigator$NavigationResult = new RealDeferredDeepLinkNavigator$NavigationResult(true, AppsFlyerDeepLinkNavigationOutcomeComplete.Handler.DEEP_LINKING);
                        }
                        Analytics analytics = (Analytics) builder.lazyDecoderFactories;
                        String redactUrl = TransactorKt.redactUrl(str);
                        z = realDeferredDeepLinkNavigator$NavigationResult.isSuccessful;
                        analytics.track(new AppsFlyerDeepLinkNavigationOutcomeComplete(redactUrl, Boolean.valueOf(z), realDeferredDeepLinkNavigator$NavigationResult.handler, deepLink2.appsFlyerId), null);
                        if (!z) {
                            Timber.Forest.i("Couldn't open deferred deep link: " + deepLink2, new Object[0]);
                        }
                        realDeepLinkAttributionWorker.deferredDeepLinkEmitter.defer(null);
                        return Unit.INSTANCE;
                    }
                    deepLink = realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                Navigator navigator2 = (Navigator) obj;
                RealAppLockState realAppLockState = realDeepLinkAttributionWorker.appLockState;
                realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.L$0 = deepLink;
                realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.L$1 = navigator2;
                realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.label = 2;
                first = FlowKt.first(realAppLockState.stateFlow, new DataStoreImpl$data$1.AnonymousClass2(7), realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1);
                if (first != coroutineSingletons) {
                    first = Unit.INSTANCE;
                }
                if (first != coroutineSingletons) {
                    deepLink2 = deepLink;
                    navigator = navigator2;
                    builder = realDeepLinkAttributionWorker.deferredDeepLinkNavigator;
                    navigator.getClass();
                    deepLink2.getClass();
                    str = deepLink2.deepLink;
                    if (((RealDeepLinking) builder.interceptors).handleDeeplink(navigator, str, Source.DEFERRED_DEEP_LINK)) {
                    }
                    Analytics analytics2 = (Analytics) builder.lazyDecoderFactories;
                    String redactUrl2 = TransactorKt.redactUrl(str);
                    z = realDeferredDeepLinkNavigator$NavigationResult.isSuccessful;
                    analytics2.track(new AppsFlyerDeepLinkNavigationOutcomeComplete(redactUrl2, Boolean.valueOf(z), realDeferredDeepLinkNavigator$NavigationResult.handler, deepLink2.appsFlyerId), null);
                    if (!z) {
                    }
                    realDeepLinkAttributionWorker.deferredDeepLinkEmitter.defer(null);
                    return Unit.INSTANCE;
                }
                return coroutineSingletons;
            }
        }
        realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1 = new RealDeepLinkAttributionWorker$handleDeepLinks$2$emit$1(this, continuation);
        Object obj2 = realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.label;
        if (i != 0) {
        }
        Navigator navigator22 = (Navigator) obj2;
        RealAppLockState realAppLockState2 = realDeepLinkAttributionWorker.appLockState;
        realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.L$0 = deepLink;
        realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.L$1 = navigator22;
        realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1.label = 2;
        first = FlowKt.first(realAppLockState2.stateFlow, new DataStoreImpl$data$1.AnonymousClass2(7), realDeepLinkAttributionWorker$handleDeepLinks$2$emit$1);
        if (first != coroutineSingletons) {
        }
        if (first != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
