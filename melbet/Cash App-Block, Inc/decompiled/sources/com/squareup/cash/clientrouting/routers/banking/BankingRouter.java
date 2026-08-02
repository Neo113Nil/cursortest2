package com.squareup.cash.clientrouting.routers.banking;

import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_face.zzko;
import com.squareup.cash.banking.screens.BalanceHomeScreen;
import com.squareup.cash.banking.screens.BenefitsLeafletSheetScreen;
import com.squareup.cash.banking.screens.OverdraftCoverageSheetScreen;
import com.squareup.cash.banking.screens.RecurringDepositsFirstTimeUserScreen;
import com.squareup.cash.banking.screens.RecurringDepositsScreen;
import com.squareup.cash.banking.screens.TransfersScreen;
import com.squareup.cash.benefits.screens.BenefitsHubScreen;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.clientrouting.RealClientRouteRouter$route$1;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.discover.promotiondetails.screens.PromotionDetails;
import com.squareup.cash.limits.screens.LimitsScreen;
import com.squareup.cash.money.navigation.real.RealMoneyNavigatorHelper;
import com.squareup.cash.transfers.navigation.real.RealTransfersInboundNavigator$Factory$Impl;
import com.squareup.kotterknife.Lazy;
import com.squareup.preferences.KeyValue;
import com.squareup.protos.cash.unicorn.balance_home_ui.BalanceHomeUi$FocusArea;
import com.squareup.protos.franklin.api.CashInstrumentType;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class BankingRouter {
    public final FlowStarter flowStarter;
    public final Navigator navigator;
    public final KeyValue recurringDepositsHasSeenFirstTimeUserExperiencePreference;
    public final Lazy transfersInboundNavigator;

    public BankingRouter(FlowStarter flowStarter, RealMoneyNavigatorHelper realMoneyNavigatorHelper, RealTransfersInboundNavigator$Factory$Impl realTransfersInboundNavigator$Factory$Impl, KeyValue keyValue, Navigator navigator) {
        navigator.getClass();
        this.flowStarter = flowStarter;
        this.recurringDepositsHasSeenFirstTimeUserExperiencePreference = keyValue;
        this.navigator = navigator;
        this.transfersInboundNavigator = realTransfersInboundNavigator$Factory$Impl.create$1(navigator);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object route(RoutingParams routingParams, ContinuationImpl continuationImpl) {
        BankingRouter$route$1 bankingRouter$route$1;
        int i;
        RoutingParams routingParams2;
        RecurringDepositsScreen recurringDepositsScreen;
        boolean booleanValue;
        if (continuationImpl instanceof BankingRouter$route$1) {
            bankingRouter$route$1 = (BankingRouter$route$1) continuationImpl;
            int i2 = bankingRouter$route$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                bankingRouter$route$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = bankingRouter$route$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bankingRouter$route$1.label;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    RecurringDepositsScreen recurringDepositsScreen2 = new RecurringDepositsScreen(routingParams.origin);
                    bankingRouter$route$1.L$1 = routingParams;
                    bankingRouter$route$1.L$2 = recurringDepositsScreen2;
                    bankingRouter$route$1.label = 1;
                    Object obj2 = this.recurringDepositsHasSeenFirstTimeUserExperiencePreference.get(bankingRouter$route$1);
                    if (obj2 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    routingParams2 = routingParams;
                    recurringDepositsScreen = recurringDepositsScreen2;
                    obj = obj2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    recurringDepositsScreen = bankingRouter$route$1.L$2;
                    routingParams2 = bankingRouter$route$1.L$1;
                    SafeTrace.throwOnFailure(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                Navigator navigator = this.navigator;
                if (booleanValue) {
                    navigator.goTo(recurringDepositsScreen);
                    navigator.goTo(new RecurringDepositsFirstTimeUserScreen(routingParams2.exitScreen, routingParams2.origin));
                } else {
                    navigator.goTo(recurringDepositsScreen);
                }
                return Unit.INSTANCE;
            }
        }
        bankingRouter$route$1 = new BankingRouter$route$1(this, continuationImpl);
        Object obj3 = bankingRouter$route$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bankingRouter$route$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj3).booleanValue();
        Navigator navigator2 = this.navigator;
        if (booleanValue) {
        }
        return Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewLinkBankAccount viewLinkBankAccount, RoutingParams routingParams) {
        BlockersScreens.StartFlowEntryPoint startProfileLinkingFlow;
        viewLinkBankAccount.getClass();
        routingParams.getClass();
        Screen screen = routingParams.exitScreen;
        if (screen == null) {
            screen = RealMoneyNavigatorHelper.moneyTabScreen();
        }
        startProfileLinkingFlow = ((RealFlowStarter) this.flowStarter).startProfileLinkingFlow(screen, CashInstrumentType.DEBIT_CARD, (String) null);
        this.navigator.goTo(startProfileLinkingFlow);
    }

    public final void route(ClientRoute.ViewBalance viewBalance) {
        viewBalance.getClass();
        this.navigator.goTo(RealMoneyNavigatorHelper.moneyTabScreen());
    }

    public final Object route(RealClientRouteRouter$route$1 realClientRouteRouter$route$1) {
        Object goToLinkedAccountsScreen = this.transfersInboundNavigator.goToLinkedAccountsScreen(realClientRouteRouter$route$1);
        return goToLinkedAccountsScreen == CoroutineSingletons.COROUTINE_SUSPENDED ? goToLinkedAccountsScreen : Unit.INSTANCE;
    }

    public final void route(ClientRoute.ViewTransfersSetup viewTransfersSetup) {
        viewTransfersSetup.getClass();
        this.navigator.goTo(new TransfersScreen(TransfersScreen.TransfersScreenTab.BANK));
    }

    public final void route(ClientRoute.ViewLimits viewLimits) {
        viewLimits.getClass();
        this.navigator.goTo(LimitsScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewOverdraftCoverage viewOverdraftCoverage) {
        viewOverdraftCoverage.getClass();
        BalanceHomeScreen balanceHomeScreen = new BalanceHomeScreen(null);
        Navigator navigator = this.navigator;
        navigator.goTo(balanceHomeScreen);
        navigator.goTo(new OverdraftCoverageSheetScreen(new BalanceHomeScreen(null)));
    }

    public final void route(ClientRoute.ViewBenefitsHub viewBenefitsHub) {
        viewBenefitsHub.getClass();
        this.navigator.goTo(BenefitsHubScreen.INSTANCE);
    }

    public final void route(ClientRoute.ViewBenefitsLeaflet viewBenefitsLeaflet) {
        viewBenefitsLeaflet.getClass();
        this.navigator.goTo(new BenefitsLeafletSheetScreen(zzko.toPdsaBenefitType(viewBenefitsLeaflet.benefit)));
    }

    public final void route(ClientRoute.ViewBankTransferSetup viewBankTransferSetup) {
        viewBankTransferSetup.getClass();
        this.navigator.goTo(new TransfersScreen(TransfersScreen.TransfersScreenTab.BANK));
    }

    public final void route(ClientRoute.ViewWireTransferSetup viewWireTransferSetup) {
        viewWireTransferSetup.getClass();
        this.navigator.goTo(new TransfersScreen(TransfersScreen.TransfersScreenTab.WIRE));
    }

    public final void route(ClientRoute.ViewBalanceHome viewBalanceHome) {
        viewBalanceHome.getClass();
        this.navigator.goTo(new BalanceHomeScreen(viewBalanceHome.focus.equals("ACCOUNT_AND_ROUTING") ? BalanceHomeUi$FocusArea.ACCOUNT_AND_ROUTING : null));
    }

    public final void route(ClientRoute.ViewMoneyBooklet viewMoneyBooklet) {
        viewMoneyBooklet.getClass();
        String str = viewMoneyBooklet.bookletToken;
        if (str.equals("paychecks")) {
            this.navigator.goTo(new PromotionDetails(new PromotionDetails.Identifier.TreehousePath("PaychecksBooklet", "paychecks"), null, 30));
        } else {
            a$$ExternalSyntheticBUOutline0.m$3("Unknown booklet token: ".concat(str));
        }
    }
}
