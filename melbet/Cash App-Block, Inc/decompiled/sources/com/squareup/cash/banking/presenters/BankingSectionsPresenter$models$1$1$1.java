package com.squareup.cash.banking.presenters;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import app.cash.broadway.screen.Screen;
import com.squareup.cash.banking.screens.BankingDialogScreen;
import com.squareup.cash.banking.viewmodels.BankingSectionsViewEvent;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.bankingoption.BankingOptionBrowseTapItem;
import com.squareup.cash.cdf.bankingoption.EntryScreen;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.unicorn.BankingTab;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.ChannelResult;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes5.dex */
public final class BankingSectionsPresenter$models$1$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ BankingSectionsViewEvent $event;
    public final /* synthetic */ BankingSectionsPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BankingSectionsPresenter$models$1$1$1(BankingSectionsPresenter bankingSectionsPresenter, BankingSectionsViewEvent bankingSectionsViewEvent, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bankingSectionsPresenter;
        this.$event = bankingSectionsViewEvent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BankingSectionsPresenter$models$1$1$1(this.this$0, this.$event, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((BankingSectionsPresenter$models$1$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        BankingTab.ClientScenarioAction clientScenarioAction;
        BankingTab.ClientRouteAction clientRouteAction;
        BankingTab.Dialog dialog;
        BankingTab.Dialog dialog2;
        BankingTab.ClientScenarioAction clientScenarioAction2;
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        BankingTab.BankingOption bankingOption = ((BankingSectionsViewEvent.BankingRowClicked) this.$event).bankingOption;
        BankingSectionsPresenter bankingSectionsPresenter = this.this$0;
        r4 = null;
        BankingTab.ClientRouteAction clientRouteAction2 = null;
        bankingSectionsPresenter.analytics.track(new BankingOptionBrowseTapItem(bankingOption.id, EntryScreen.BalanceHome), null);
        if (Intrinsics.areEqual(bankingOption.is_badged, Boolean.TRUE) && (str = bankingOption.id) != null) {
            ChannelResult.m4192getOrThrowimpl(bankingSectionsPresenter.bankingOptionBadgeUpdater.optionIds.mo1159trySendJP2dKIU(str));
        }
        BankingTab.BankingOption.NavigationAction_ navigationAction_ = bankingOption.NavigationAction;
        if (navigationAction_ != null) {
            BankingTab.BankingOption.NavigationAction_.ClientScenarioAction clientScenarioAction3 = navigationAction_ instanceof BankingTab.BankingOption.NavigationAction_.ClientScenarioAction ? (BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) navigationAction_ : null;
            if (clientScenarioAction3 != null) {
                clientScenarioAction = clientScenarioAction3.getValue();
                BankingTab.BankingOption.NavigationAction_ navigationAction_2 = bankingOption.NavigationAction;
                if (clientScenarioAction == null) {
                    if (navigationAction_2 != null) {
                        BankingTab.BankingOption.NavigationAction_.ClientScenarioAction clientScenarioAction4 = navigationAction_2 instanceof BankingTab.BankingOption.NavigationAction_.ClientScenarioAction ? (BankingTab.BankingOption.NavigationAction_.ClientScenarioAction) navigationAction_2 : null;
                        if (clientScenarioAction4 != null) {
                            clientScenarioAction2 = clientScenarioAction4.getValue();
                            clientScenarioAction2.getClass();
                            ClientScenario clientScenario = clientScenarioAction2.client_scenario;
                            clientScenario.getClass();
                            BlockersHelper.launchClientScenario$default(bankingSectionsPresenter.blockersHelper, BlockersData.Flow.PROFILE_BLOCKERS, clientScenario, bankingSectionsPresenter.screen, null, null, null, false, new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.BALANCE_HOME, (String) null, 6), null, false, 3528);
                        }
                    }
                    clientScenarioAction2 = null;
                    clientScenarioAction2.getClass();
                    ClientScenario clientScenario2 = clientScenarioAction2.client_scenario;
                    clientScenario2.getClass();
                    BlockersHelper.launchClientScenario$default(bankingSectionsPresenter.blockersHelper, BlockersData.Flow.PROFILE_BLOCKERS, clientScenario2, bankingSectionsPresenter.screen, null, null, null, false, new BlockersData.AnalyticsData(BlockersData.AnalyticsData.Source.BALANCE_HOME, (String) null, 6), null, false, 3528);
                } else {
                    if (navigationAction_2 != null) {
                        BankingTab.BankingOption.NavigationAction_.ClientRouteAction clientRouteAction3 = navigationAction_2 instanceof BankingTab.BankingOption.NavigationAction_.ClientRouteAction ? (BankingTab.BankingOption.NavigationAction_.ClientRouteAction) navigationAction_2 : null;
                        if (clientRouteAction3 != null) {
                            clientRouteAction = clientRouteAction3.getValue();
                            if (clientRouteAction == null) {
                                Screen screen = bankingSectionsPresenter.screen;
                                RoutingParams routingParams = new RoutingParams(screen, "BALANCE_HOME", screen, null, null, null, 500);
                                BankingTab.BankingOption.NavigationAction_ navigationAction_3 = bankingOption.NavigationAction;
                                if (navigationAction_3 != null) {
                                    BankingTab.BankingOption.NavigationAction_.ClientRouteAction clientRouteAction4 = navigationAction_3 instanceof BankingTab.BankingOption.NavigationAction_.ClientRouteAction ? (BankingTab.BankingOption.NavigationAction_.ClientRouteAction) navigationAction_3 : null;
                                    if (clientRouteAction4 != null) {
                                        clientRouteAction2 = clientRouteAction4.getValue();
                                    }
                                }
                                clientRouteAction2.getClass();
                                String str2 = clientRouteAction2.url;
                                if (!bankingSectionsPresenter.router.route(routingParams, str2)) {
                                    Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Unsupported or malformed URL: ", str2), new Object[0]);
                                }
                            } else {
                                BankingTab.BankingOption.NavigationAction_ navigationAction_4 = bankingOption.NavigationAction;
                                if (navigationAction_4 != null) {
                                    BankingTab.BankingOption.NavigationAction_.Dialog dialog3 = navigationAction_4 instanceof BankingTab.BankingOption.NavigationAction_.Dialog ? (BankingTab.BankingOption.NavigationAction_.Dialog) navigationAction_4 : null;
                                    if (dialog3 != null) {
                                        dialog = dialog3.getValue();
                                        if (dialog != null) {
                                            BetterNavigator.ScreenNavigator screenNavigator = bankingSectionsPresenter.navigator;
                                            BankingTab.BankingOption.NavigationAction_ navigationAction_5 = bankingOption.NavigationAction;
                                            if (navigationAction_5 != null) {
                                                BankingTab.BankingOption.NavigationAction_.Dialog dialog4 = navigationAction_5 instanceof BankingTab.BankingOption.NavigationAction_.Dialog ? (BankingTab.BankingOption.NavigationAction_.Dialog) navigationAction_5 : null;
                                                if (dialog4 != null) {
                                                    dialog2 = dialog4.getValue();
                                                    dialog2.getClass();
                                                    String str3 = dialog2.title;
                                                    str3.getClass();
                                                    String str4 = dialog2.main_text;
                                                    BankingTab.Dialog.Button button = dialog2.primary_button;
                                                    button.getClass();
                                                    BankingDialogScreen.Dialog.Button bankingButton = BankingSectionsPresenter.toBankingButton(button);
                                                    BankingTab.Dialog.Button button2 = dialog2.secondary_button;
                                                    screenNavigator.goTo(new BankingDialogScreen(new BankingDialogScreen.Dialog(str3, str4, bankingButton, button2 != null ? BankingSectionsPresenter.toBankingButton(button2) : null), bankingSectionsPresenter.screen));
                                                }
                                            }
                                            dialog2 = null;
                                            dialog2.getClass();
                                            String str32 = dialog2.title;
                                            str32.getClass();
                                            String str42 = dialog2.main_text;
                                            BankingTab.Dialog.Button button3 = dialog2.primary_button;
                                            button3.getClass();
                                            BankingDialogScreen.Dialog.Button bankingButton2 = BankingSectionsPresenter.toBankingButton(button3);
                                            BankingTab.Dialog.Button button22 = dialog2.secondary_button;
                                            screenNavigator.goTo(new BankingDialogScreen(new BankingDialogScreen.Dialog(str32, str42, bankingButton2, button22 != null ? BankingSectionsPresenter.toBankingButton(button22) : null), bankingSectionsPresenter.screen));
                                        }
                                    }
                                }
                                dialog = null;
                                if (dialog != null) {
                                }
                            }
                        }
                    }
                    clientRouteAction = null;
                    if (clientRouteAction == null) {
                    }
                }
                return Unit.INSTANCE;
            }
        }
        clientScenarioAction = null;
        BankingTab.BankingOption.NavigationAction_ navigationAction_22 = bankingOption.NavigationAction;
        if (clientScenarioAction == null) {
        }
        return Unit.INSTANCE;
    }
}
