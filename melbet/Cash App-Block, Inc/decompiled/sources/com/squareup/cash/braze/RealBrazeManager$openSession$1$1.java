package com.squareup.cash.braze;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.collection.ArrayMap;
import androidx.compose.runtime.Latch$await$2$2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.Braze;
import com.google.android.gms.internal.mlkit_vision_face.zzjg;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.presenters.CameraPermissionPresenter;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.presenters.InstrumentSelectionListSheetPresenter;
import com.squareup.cash.blockers.presenters.PlaidLinkPresenter;
import com.squareup.cash.blockers.presenters.SelectionPresenter;
import com.squareup.cash.blockers.presenters.SsnPresenter;
import com.squareup.cash.blockers.presenters.StatusResultPresenter;
import com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter;
import com.squareup.cash.blockers.scenarioplan.presenters.ScenarioPlanErrorPresenter;
import com.squareup.cash.blockers.scenarioplan.viewmodels.ScenarioPlanErrorViewEvent$Close;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.screens.InstrumentSelectionData;
import com.squareup.cash.blockers.screens.PasscodeHelpResult;
import com.squareup.cash.blockers.treehouse.viewmodels.TreehouseBlockerEvent;
import com.squareup.cash.blockers.viewmodels.InstrumentSelectionListSheetViewEvent;
import com.squareup.cash.blockers.viewmodels.InvalidInputViewEvent$Confirm;
import com.squareup.cash.blockers.viewmodels.PasscodeHelpViewEvent;
import com.squareup.cash.blockers.viewmodels.ReadContactsPermissionResult$Negative;
import com.squareup.cash.blockers.viewmodels.ReadContactsPermissionResult$Positive;
import com.squareup.cash.blockers.viewmodels.ReadContactsPermissionViewEvent;
import com.squareup.cash.blockers.viewmodels.RegisterErrorViewEvent$Confirm;
import com.squareup.cash.blockers.viewmodels.RemoteSkipErrorViewEvent$Confirm;
import com.squareup.cash.blockers.viewmodels.SetPinMessageViewEvent$PositiveClick;
import com.squareup.cash.blockers.viewmodels.SkipVerifyResult$Negative;
import com.squareup.cash.blockers.viewmodels.SkipVerifyResult$Positive;
import com.squareup.cash.blockers.viewmodels.SkipVerifyViewEvent;
import com.squareup.cash.blockers.viewmodels.SuccessMessageViewEvent$Close;
import com.squareup.cash.blockers.viewmodels.UnselectableOptionViewEvent$GoBack;
import com.squareup.cash.blockers.viewmodels.UpgradeConfirmationResult$Negative;
import com.squareup.cash.blockers.viewmodels.UpgradeConfirmationResult$Positive;
import com.squareup.cash.blockers.viewmodels.UpgradeConfirmationViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyErrorViewEvent$Confirm;
import com.squareup.cash.blockers.viewmodels.VerifyHelpViewEvent;
import com.squareup.cash.blockers.viewmodels.WelcomeViewEvent$Back;
import com.squareup.cash.borrow.presenters.BorrowHomePresenter;
import com.squareup.cash.borrow.presenters.BorrowHomePresenter$displayBulletin$1;
import com.squareup.cash.borrow.presenters.CreditMultiStepLoadingBlockerPresenter;
import com.squareup.cash.borrow.screens.BorrowHome;
import com.squareup.cash.borrow.screens.BorrowHomeAmountPickerSheet;
import com.squareup.cash.borrow.screens.BorrowHomeOverlay;
import com.squareup.cash.borrow.screens.BorrowLimitHub;
import com.squareup.cash.borrow.screens.ExpandedLoanHistory;
import com.squareup.cash.borrow.viewmodels.BorrowHomeViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowLimitHubViewEvent;
import com.squareup.cash.borrow.viewmodels.BorrowMultiStepLoadingViewEvent$Close;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListEvent;
import com.squareup.cash.borrow.viewmodels.SheetButtonAction;
import com.squareup.cash.buynowpaylater.screens.AfterPayOrderDetailsScreen;
import com.squareup.cash.buynowpaylater.screens.OrderDetailsOverflowActionSheetScreen;
import com.squareup.cash.buynowpaylater.viewmodels.InfoSheetViewEvents;
import com.squareup.cash.buynowpaylater.viewmodels.OrderDetailsOverFlowSheetViewEvent;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractTapBorrowButton;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractTapBulletin;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractTapExpandLoansList;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractTapLoan;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractTapPayment;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractTapPaymentTilePrimaryButton;
import com.squareup.cash.cdf.borrowapplet.BorrowAppletInteractTapUpsellCard;
import com.squareup.cash.cdf.borrowlimithub.BorrowLimitHubInteractTapCtaBullet;
import com.squareup.cash.cdf.instrument.InstrumentLinkAuthenticateInstitution;
import com.squareup.cash.cdf.instrument.InstrumentSelectTapOption;
import com.squareup.cash.cdf.personalprofile.PersonalProfileManageUpgradeToBusinessSubmit;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.common.messaging.screens.FailureMessageScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.mooncake.screens.AlertDialogResult;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.plaid.api.PlaidLinkEvent;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Finish;
import com.squareup.cash.session.backend.AuthenticatedState;
import com.squareup.cash.session.backend.SessionState;
import com.squareup.cash.stripe.api.StripeLinkEvent$GenericEvent;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import com.squareup.protos.franklin.common.RequestContext;
import com.squareup.protos.franklin.common.scenarios.BlockerDescriptor;
import com.squareup.protos.franklin.common.scenarios.ScenarioPlan;
import com.squareup.protos.lending.InitiateLoanData;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlowImpl;

/* loaded from: classes4.dex */
public final class RealBrazeManager$openSession$1$1 implements FlowCollector {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object this$0;

    public /* synthetic */ RealBrazeManager$openSession$1$1(Object obj, int i) {
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b2  */
    /* JADX WARN: Type inference failed for: r0v115, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r0v90, types: [app.cash.broadway.screen.Screen] */
    /* JADX WARN: Type inference failed for: r16v1, types: [com.squareup.cash.blockers.screens.BlockersScreens$TreehouseBlockerScreen] */
    /* JADX WARN: Type inference failed for: r1v72, types: [com.squareup.cash.data.blockers.BlockersDataNavigator] */
    /* JADX WARN: Type inference failed for: r5v9, types: [app.cash.broadway.screen.Screen, com.squareup.cash.blockers.screens.BlockersScreens$TreehouseBlockerScreen] */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        Unit unit;
        String str;
        String str2;
        BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet infoSheet;
        String str3;
        int i = this.$r8$classId;
        Back back = Back.INSTANCE;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                ((Braze) ((RealBrazeManager) obj2).braze$delegate.getValue()).changeUser(((AuthenticatedState) ((SessionState.Authenticated) obj)).accountToken);
                break;
            case 1:
                InstrumentSelectionListSheetPresenter instrumentSelectionListSheetPresenter = (InstrumentSelectionListSheetPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator = instrumentSelectionListSheetPresenter.navigator;
                InstrumentSelectionListSheetViewEvent instrumentSelectionListSheetViewEvent = (InstrumentSelectionListSheetViewEvent) obj;
                if (Intrinsics.areEqual(instrumentSelectionListSheetViewEvent, InstrumentSelectionListSheetViewEvent.Close.INSTANCE)) {
                    screenNavigator.goTo(back);
                } else if (instrumentSelectionListSheetViewEvent instanceof InstrumentSelectionListSheetViewEvent.SelectInstrument) {
                    Analytics analytics = instrumentSelectionListSheetPresenter.analytics;
                    int i2 = ((InstrumentSelectionListSheetViewEvent.SelectInstrument) instrumentSelectionListSheetViewEvent).id;
                    BlockersScreens.InstrumentSelectionListScreen instrumentSelectionListScreen = instrumentSelectionListSheetPresenter.args;
                    for (InstrumentSelectionData.InstrumentOption instrumentOption : instrumentSelectionListScreen.options) {
                        if ((instrumentOption instanceof InstrumentSelectionData.InstrumentOption.Enabled) && instrumentOption.getId() == i2) {
                            InstrumentSelectTapOption.Action analyticsAction = InstrumentSelectionListSheetPresenter.toAnalyticsAction(instrumentOption);
                            BlockersData blockersData = instrumentSelectionListScreen.blockersData;
                            String str4 = blockersData.flowToken;
                            ClientScenario clientScenario = blockersData.clientScenario;
                            analytics.track(new InstrumentSelectTapOption(clientScenario != null ? clientScenario.name() : null, str4, analyticsAction, null, 24), null);
                            screenNavigator.goTo(new Finish(new BlockersScreens.InstrumentSelectionListScreen.InstrumentResult(i2)));
                        }
                    }
                    OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
                break;
            case 2:
                if (Intrinsics.areEqual((InvalidInputViewEvent$Confirm) obj, InvalidInputViewEvent$Confirm.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 3:
                BetterNavigator.ScreenNavigator screenNavigator2 = ((AddAliasPresenter) obj2).navigator;
                PasscodeHelpViewEvent passcodeHelpViewEvent = (PasscodeHelpViewEvent) obj;
                if (Intrinsics.areEqual(passcodeHelpViewEvent, PasscodeHelpViewEvent.Cancel.INSTANCE)) {
                    screenNavigator2.goTo(back);
                } else if (!Intrinsics.areEqual(passcodeHelpViewEvent, PasscodeHelpViewEvent.Forgot.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    screenNavigator2.goTo(new Finish(PasscodeHelpResult.Forgot));
                }
                break;
            case 4:
                PlaidLinkEvent plaidLinkEvent = (PlaidLinkEvent) obj;
                PlaidLinkPresenter plaidLinkPresenter = (PlaidLinkPresenter) obj2;
                PlaidLinkPresenter.trackInstrumentLink$default(plaidLinkPresenter, InstrumentLinkAuthenticateInstitution.Status.APPLY, plaidLinkEvent.getEventName(), plaidLinkEvent.getInstitution().id, plaidLinkEvent.getInstitution().name, null, null, 48);
                if (plaidLinkEvent instanceof PlaidLinkEvent.SearchEvent) {
                    plaidLinkPresenter.hasSearched = true;
                }
                break;
            case 5:
                CameraPermissionPresenter cameraPermissionPresenter = (CameraPermissionPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator3 = cameraPermissionPresenter.navigator;
                ReadContactsPermissionViewEvent readContactsPermissionViewEvent = (ReadContactsPermissionViewEvent) obj;
                if (Intrinsics.areEqual(readContactsPermissionViewEvent, ReadContactsPermissionViewEvent.NegativeClick.INSTANCE)) {
                    screenNavigator3.goTo(new Finish(ReadContactsPermissionResult$Negative.INSTANCE));
                } else if (!Intrinsics.areEqual(readContactsPermissionViewEvent, ReadContactsPermissionViewEvent.PositiveClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    cameraPermissionPresenter.intentLauncher.launchSettings();
                    screenNavigator3.goTo(new Finish(ReadContactsPermissionResult$Positive.INSTANCE));
                }
                break;
            case 6:
                if (Intrinsics.areEqual((RegisterErrorViewEvent$Confirm) obj, RegisterErrorViewEvent$Confirm.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 7:
                if (Intrinsics.areEqual((RemoteSkipErrorViewEvent$Confirm) obj, RemoteSkipErrorViewEvent$Confirm.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 8:
                BlockersHelper.BlockersAction blockersAction = (BlockersHelper.BlockersAction) obj;
                SelectionPresenter selectionPresenter = (SelectionPresenter) obj2;
                if (blockersAction instanceof BlockersHelper.BlockersAction.ShowError) {
                    unit = selectionPresenter.handleError((BlockersHelper.BlockersAction.ShowError) blockersAction);
                    if (unit != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        unit = Unit.INSTANCE;
                    }
                } else if (blockersAction instanceof BlockersHelper.BlockersAction.ToggleSpinner) {
                    StateFlowImpl stateFlowImpl = selectionPresenter.loading;
                    Boolean valueOf = Boolean.valueOf(((BlockersHelper.BlockersAction.ToggleSpinner) blockersAction).show);
                    stateFlowImpl.getClass();
                    stateFlowImpl.updateState(null, valueOf);
                    unit = Unit.INSTANCE;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                } else if (!(blockersAction instanceof BlockersHelper.BlockersAction.ShowScreen)) {
                    OptionalProvider$$ExternalSyntheticLambda0.m((Object) blockersAction, "Unexpected action: ");
                    break;
                } else {
                    selectionPresenter.navigator.goTo(((BlockersHelper.BlockersAction.ShowScreen) blockersAction).screen);
                    unit = Unit.INSTANCE;
                }
                Unit unit2 = unit;
                if (unit2 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    break;
                }
                break;
            case 9:
                ((CardLockPresenter) obj2).navigator.goTo((Screen) obj);
                break;
            case 10:
                EndAppLockPresenter endAppLockPresenter = (EndAppLockPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator4 = (BetterNavigator.ScreenNavigator) endAppLockPresenter.accountOutboundNavigator;
                if (Intrinsics.areEqual((SetPinMessageViewEvent$PositiveClick) obj, SetPinMessageViewEvent$PositiveClick.INSTANCE)) {
                    screenNavigator4.goTo(back);
                    screenNavigator4.goTo(((BlockersScreens.SetPinMessageScreen) endAppLockPresenter.appLockState).nextScreen);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 11:
                BetterNavigator.ScreenNavigator screenNavigator5 = (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator;
                SkipVerifyViewEvent skipVerifyViewEvent = (SkipVerifyViewEvent) obj;
                if (Intrinsics.areEqual(skipVerifyViewEvent, SkipVerifyViewEvent.Cancel.INSTANCE)) {
                    screenNavigator5.goTo(new Finish(SkipVerifyResult$Negative.INSTANCE));
                } else if (!Intrinsics.areEqual(skipVerifyViewEvent, SkipVerifyViewEvent.Confirm.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    screenNavigator5.goTo(new Finish(SkipVerifyResult$Positive.INSTANCE));
                }
                break;
            case 12:
                ((SsnPresenter) obj2).navigator.goTo((Screen) obj);
                break;
            case 13:
                ((StatusResultPresenter) obj2).navigator.goTo((Screen) obj);
                break;
            case 14:
                StripeLinkEvent$GenericEvent stripeLinkEvent$GenericEvent = (StripeLinkEvent$GenericEvent) obj;
                DisclosurePresenter.trackInstrumentLink$default((DisclosurePresenter) obj2, InstrumentLinkAuthenticateInstitution.Status.APPLY, stripeLinkEvent$GenericEvent.eventName, stripeLinkEvent$GenericEvent.institution.name, null, stripeLinkEvent$GenericEvent.failureReason, 8);
                break;
            case 15:
                EndAppLockPresenter endAppLockPresenter2 = (EndAppLockPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator6 = (BetterNavigator.ScreenNavigator) endAppLockPresenter2.accountOutboundNavigator;
                if (Intrinsics.areEqual((SuccessMessageViewEvent$Close) obj, SuccessMessageViewEvent$Close.INSTANCE)) {
                    screenNavigator6.goTo(new Finish(AlertDialogResult.POSITIVE));
                    BlockersScreens.SuccessMessageScreen successMessageScreen = (BlockersScreens.SuccessMessageScreen) endAppLockPresenter2.appLockState;
                    Screen screen = successMessageScreen.next;
                    if (screen == null) {
                        screen = ((BlockersDataNavigator) endAppLockPresenter2.navigatorSwitcher).getNext(successMessageScreen, successMessageScreen.blockersData);
                    }
                    screenNavigator6.goTo(screen);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 16:
                if (Intrinsics.areEqual((UnselectableOptionViewEvent$GoBack) obj, UnselectableOptionViewEvent$GoBack.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator).goTo(back);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 17:
                EndAppLockPresenter endAppLockPresenter3 = (EndAppLockPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator7 = (BetterNavigator.ScreenNavigator) endAppLockPresenter3.accountOutboundNavigator;
                UpgradeConfirmationViewEvent upgradeConfirmationViewEvent = (UpgradeConfirmationViewEvent) obj;
                if (Intrinsics.areEqual(upgradeConfirmationViewEvent, UpgradeConfirmationViewEvent.NegativeClick.INSTANCE)) {
                    screenNavigator7.goTo(new Finish(UpgradeConfirmationResult$Negative.INSTANCE));
                } else if (!Intrinsics.areEqual(upgradeConfirmationViewEvent, UpgradeConfirmationViewEvent.PositiveClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((Analytics) endAppLockPresenter3.navigatorSwitcher).track(new PersonalProfileManageUpgradeToBusinessSubmit(((BlockersScreens.UpgradeConfirmationScreen) endAppLockPresenter3.appLockState).blockersData.flowToken), null);
                    screenNavigator7.goTo(new Finish(UpgradeConfirmationResult$Positive.INSTANCE));
                }
                break;
            case 18:
                if (Intrinsics.areEqual((VerifyErrorViewEvent$Confirm) obj, VerifyErrorViewEvent$Confirm.INSTANCE)) {
                    NavAction$$ExternalSyntheticOutline0.m((Object) null, (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 19:
                BetterNavigator.ScreenNavigator screenNavigator8 = (BetterNavigator.ScreenNavigator) ((ErrorPresenter) obj2).navigator;
                VerifyHelpViewEvent verifyHelpViewEvent = (VerifyHelpViewEvent) obj;
                if (verifyHelpViewEvent instanceof VerifyHelpViewEvent.HelpItemSelected) {
                    screenNavigator8.goTo(new Finish(((VerifyHelpViewEvent.HelpItemSelected) verifyHelpViewEvent).result));
                } else if (verifyHelpViewEvent instanceof VerifyHelpViewEvent.VerifyHelpItemSelected) {
                    screenNavigator8.goTo(new Finish(((VerifyHelpViewEvent.VerifyHelpItemSelected) verifyHelpViewEvent).result));
                } else if (!Intrinsics.areEqual(verifyHelpViewEvent, VerifyHelpViewEvent.CancelClick.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    screenNavigator8.goTo(back);
                }
                break;
            case 20:
                WelcomePresenter welcomePresenter = (WelcomePresenter) obj2;
                if (((WelcomeViewEvent$Back) obj) != null) {
                    BlockersDataNavigator blockersDataNavigator = welcomePresenter.blockersNavigator;
                    BlockersScreens.WelcomeScreen welcomeScreen = welcomePresenter.args;
                    Screen back2 = blockersDataNavigator.getBack(welcomeScreen, welcomeScreen.blockersData);
                    if (back2 != null) {
                        welcomePresenter.navigator.goTo(back2);
                    }
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 21:
                if (Intrinsics.areEqual((ScenarioPlanErrorViewEvent$Close) obj, ScenarioPlanErrorViewEvent$Close.INSTANCE)) {
                    ((ScenarioPlanErrorPresenter) obj2).navigator.goTo(back);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 22:
                EndAppLockPresenter endAppLockPresenter4 = (EndAppLockPresenter) obj2;
                ?? r1 = (BlockersDataNavigator) endAppLockPresenter4.navigatorSwitcher;
                BetterNavigator.ScreenNavigator screenNavigator9 = (BetterNavigator.ScreenNavigator) endAppLockPresenter4.accountOutboundNavigator;
                ?? r5 = (BlockersScreens.TreehouseBlockerScreen) endAppLockPresenter4.appLockState;
                TreehouseBlockerEvent treehouseBlockerEvent = (TreehouseBlockerEvent) obj;
                if (Intrinsics.areEqual(treehouseBlockerEvent, TreehouseBlockerEvent.Advance.INSTANCE)) {
                    screenNavigator9.goTo(r1.getNext(r5, r5.blockersData));
                } else if (treehouseBlockerEvent instanceof TreehouseBlockerEvent.AdvanceToBlocker) {
                    ScenarioPlan scenarioPlan = r5.blockersData.scenarioPlan;
                    if (scenarioPlan == null) {
                        scenarioPlan = new ScenarioPlan(511);
                    }
                    ScenarioPlan scenarioPlan2 = scenarioPlan;
                    BlockersData blockersData2 = r5.blockersData;
                    RequestContext requestContext = blockersData2.requestContext;
                    TreehouseBlockerEvent.AdvanceToBlocker advanceToBlocker = (TreehouseBlockerEvent.AdvanceToBlocker) treehouseBlockerEvent;
                    BlockerDescriptor blockerDescriptor = advanceToBlocker.nextBlockerDescriptor;
                    screenNavigator9.askQuestion(new BlockersScreens.TreehouseBlockerQuestion(r5.stackSize), new Latch$await$2$2(26, endAppLockPresenter4, BlockersData.copy$default(blockersData2, null, null, null, null, null, null, null, advanceToBlocker.replaceCurrent ? r5 : null, false, false, null, null, null, false, null, null, ScenarioPlan.copy$default(scenarioPlan2, null, null, CollectionsKt__CollectionsJVMKt.listOf(blockerDescriptor), null, null, 503), null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, false, RequestContext.copy$default(requestContext, null, null, null, null, null, null, blockerDescriptor.id, null, null, null, null, null, 8127), null, null, -262401, 57343)));
                } else if (Intrinsics.areEqual(treehouseBlockerEvent, TreehouseBlockerEvent.Dismiss.INSTANCE)) {
                    screenNavigator9.goTo(r5.blockersData.exitScreen);
                } else if (!Intrinsics.areEqual(treehouseBlockerEvent, TreehouseBlockerEvent.Retreat.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ?? back3 = r1.getBack(r5, r5.blockersData);
                    if (back3 != 0) {
                        back = back3;
                    }
                    screenNavigator9.goTo(back);
                }
                break;
            case 23:
                BorrowHomeViewEvent borrowHomeViewEvent = (BorrowHomeViewEvent) obj;
                BorrowHomePresenter borrowHomePresenter = (BorrowHomePresenter) obj2;
                CoroutineScope coroutineScope = borrowHomePresenter.activityScope;
                BorrowHome borrowHome = borrowHomePresenter.argsAsOrigin;
                BetterNavigator.ScreenNavigator screenNavigator10 = borrowHomePresenter.navigator;
                Analytics analytics2 = borrowHomePresenter.analytics;
                if (borrowHomeViewEvent instanceof BorrowHomeViewEvent.Close) {
                    screenNavigator10.goTo(back);
                } else if (borrowHomeViewEvent instanceof BorrowHomeViewEvent.TapBulletinRow) {
                    BorrowAppletBulletinsTile.Data.Bulletin bulletin = ((BorrowHomeViewEvent.TapBulletinRow) borrowHomeViewEvent).bulletin;
                    String str5 = bulletin.identifier;
                    zzjg zzjgVar = bulletin.routing;
                    if (zzjgVar != null) {
                        BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl = zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl ? (BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) zzjgVar : null;
                        if (borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl != null) {
                            str = borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl.value;
                            analytics2.track(new BorrowAppletInteractTapBulletin(str5, str), null);
                            if (zzjgVar != null) {
                                BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl2 = zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl ? (BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) zzjgVar : null;
                                if (borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl2 != null) {
                                    str2 = borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl2.value;
                                    if (str2 != null) {
                                        if (zzjgVar != null) {
                                            BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl3 = zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl ? (BorrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl) zzjgVar : null;
                                            if (borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl3 != null) {
                                                str3 = borrowAppletBulletinsTile$Data$Bulletin$Routing$ActionUrl3.value;
                                                str3.getClass();
                                                if (str5 != null) {
                                                    JobKt.launch$default(coroutineScope, null, null, new BorrowHomePresenter$displayBulletin$1(borrowHomePresenter, str5, null, 0), 3);
                                                }
                                                BorrowHomePresenter.access$routeActionUrl(borrowHomePresenter, str3);
                                            }
                                        }
                                        str3 = null;
                                        str3.getClass();
                                        if (str5 != null) {
                                        }
                                        BorrowHomePresenter.access$routeActionUrl(borrowHomePresenter, str3);
                                    } else {
                                        if (zzjgVar != null) {
                                            BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet = zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet ? (BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) zzjgVar : null;
                                            if (borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet != null) {
                                                infoSheet = borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet.value;
                                                if (infoSheet != null) {
                                                    a$$ExternalSyntheticBUOutline0.m$1("invalid bulletin action");
                                                    break;
                                                } else {
                                                    str5.getClass();
                                                    JobKt.launch$default(coroutineScope, null, null, new BorrowHomePresenter$displayBulletin$1(borrowHomePresenter, str5, null, 1), 3);
                                                    if (zzjgVar != null) {
                                                        BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet2 = zzjgVar instanceof BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet ? (BorrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet) zzjgVar : null;
                                                        if (borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet2 != null) {
                                                            r4 = borrowAppletBulletinsTile$Data$Bulletin$Routing$InfoSheet2.value;
                                                        }
                                                    }
                                                    r4.getClass();
                                                    screenNavigator10.goTo(new BorrowHomeOverlay.BulletinInfo(r4, borrowHome));
                                                }
                                            }
                                        }
                                        infoSheet = null;
                                        if (infoSheet != null) {
                                        }
                                    }
                                }
                            }
                            str2 = null;
                            if (str2 != null) {
                            }
                        }
                    }
                    str = null;
                    analytics2.track(new BorrowAppletInteractTapBulletin(str5, str), null);
                    if (zzjgVar != null) {
                    }
                    str2 = null;
                    if (str2 != null) {
                    }
                } else if (borrowHomeViewEvent instanceof BorrowHomeViewEvent.TapUpsellCard) {
                    BorrowAppletBulletinsTile.Data.UpsellCard upsellCard = ((BorrowHomeViewEvent.TapUpsellCard) borrowHomeViewEvent).upsellCard;
                    analytics2.track(new BorrowAppletInteractTapUpsellCard(upsellCard.action_url, upsellCard.identifier), null);
                    String str6 = upsellCard.action_url;
                    if (str6 != null) {
                        BorrowHomePresenter.access$routeActionUrl(borrowHomePresenter, str6);
                    }
                } else if (borrowHomeViewEvent instanceof BorrowHomeViewEvent.TapCreditLimitAndBorrowPrimaryButton) {
                    analytics2.track(new BorrowAppletInteractTapBorrowButton(), null);
                    BorrowHomeViewEvent.TapCreditLimitAndBorrowPrimaryButton tapCreditLimitAndBorrowPrimaryButton = (BorrowHomeViewEvent.TapCreditLimitAndBorrowPrimaryButton) borrowHomeViewEvent;
                    InitiateLoanData initiateLoanData = tapCreditLimitAndBorrowPrimaryButton.pickerData;
                    Money money = initiateLoanData.minimum_loan_amount;
                    Money money2 = tapCreditLimitAndBorrowPrimaryButton.availableCreditAmount;
                    if (money != null) {
                        Long l = money2.amount;
                        l.getClass();
                        long longValue = l.longValue();
                        Long l2 = money.amount;
                        l2.getClass();
                        if (longValue < l2.longValue()) {
                            String format2 = borrowHomePresenter.moneyFormatter.format(money);
                            AndroidStringManager androidStringManager = borrowHomePresenter.stringManager;
                            ArrayMap m = SVG$Unit$EnumUnboxingLocalUtility.m(1, format2, "amount", format2);
                            Resources resources = androidStringManager.resources;
                            resources.getClass();
                            String format3 = new MessageFormat(resources.getString(R.string.borrow_pres_minimum_borrow_amount)).format(m);
                            format3.getClass();
                            screenNavigator10.goTo(new FailureMessageScreen(null, format3, null, borrowHomePresenter.argsAsOrigin, null, 21));
                        }
                    }
                    screenNavigator10.goTo(new BorrowHomeAmountPickerSheet(initiateLoanData, borrowHome));
                } else if (borrowHomeViewEvent instanceof BorrowHomeViewEvent.TapPaymentTimelineRow) {
                    String str7 = ((BorrowHomeViewEvent.TapPaymentTimelineRow) borrowHomeViewEvent).route;
                    analytics2.track(new BorrowAppletInteractTapPayment(str7), null);
                    BorrowHomePresenter.access$routeActionUrl(borrowHomePresenter, str7);
                } else if (borrowHomeViewEvent instanceof BorrowHomeViewEvent.TapPaymentTimelinePrimaryButton) {
                    SheetButtonAction sheetButtonAction = ((BorrowHomeViewEvent.TapPaymentTimelinePrimaryButton) borrowHomeViewEvent).buttonAction;
                    boolean z = sheetButtonAction instanceof SheetButtonAction.ActionUrl;
                    SheetButtonAction.ActionUrl actionUrl = z ? (SheetButtonAction.ActionUrl) sheetButtonAction : null;
                    analytics2.track(new BorrowAppletInteractTapPaymentTilePrimaryButton(actionUrl != null ? actionUrl.url : null), null);
                    if (z) {
                        BorrowHomePresenter.access$routeActionUrl(borrowHomePresenter, ((SheetButtonAction.ActionUrl) sheetButtonAction).url);
                    } else if (!(sheetButtonAction instanceof SheetButtonAction.RepaymentSelection)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        break;
                    } else {
                        screenNavigator10.goTo(new BorrowHomeOverlay.RepaymentSelection(((SheetButtonAction.RepaymentSelection) sheetButtonAction).data, borrowHome));
                    }
                } else if (borrowHomeViewEvent instanceof BorrowHomeViewEvent.TapLoanHistoryRow) {
                    BorrowHomeViewEvent.TapLoanHistoryRow tapLoanHistoryRow = (BorrowHomeViewEvent.TapLoanHistoryRow) borrowHomeViewEvent;
                    BorrowAppletLoanHistoryTile.Data.Loan.Details details = tapLoanHistoryRow.loanDetails;
                    LocalizedString localizedString = details.primary_text;
                    localizedString.getClass();
                    String str8 = localizedString.translated_value;
                    str8.getClass();
                    analytics2.track(new BorrowAppletInteractTapLoan(str8), null);
                    screenNavigator10.goTo(new BorrowHomeOverlay.LoanDetails(details, tapLoanHistoryRow.loanToken, borrowHome));
                } else if (!(borrowHomeViewEvent instanceof BorrowHomeViewEvent.TapViewAllLoanHistory)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    analytics2.track(new BorrowAppletInteractTapExpandLoansList(), null);
                    BorrowHomeViewEvent.TapViewAllLoanHistory tapViewAllLoanHistory = (BorrowHomeViewEvent.TapViewAllLoanHistory) borrowHomeViewEvent;
                    screenNavigator10.goTo(new ExpandedLoanHistory(tapViewAllLoanHistory.expandedLoanListViewData, tapViewAllLoanHistory.loans));
                }
                break;
            case 24:
                LocalEditorialPresenter localEditorialPresenter = (LocalEditorialPresenter) obj2;
                BorrowLimitHubViewEvent borrowLimitHubViewEvent = (BorrowLimitHubViewEvent) obj;
                if (Intrinsics.areEqual(borrowLimitHubViewEvent, BorrowLimitHubViewEvent.Close.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) localEditorialPresenter.navigator).goTo(back);
                } else if (borrowLimitHubViewEvent instanceof BorrowLimitHubViewEvent.TapIncreaseLimitActionRow) {
                    Analytics analytics3 = (Analytics) localEditorialPresenter.installedStore;
                    BorrowLimitHubViewEvent.TapIncreaseLimitActionRow tapIncreaseLimitActionRow = (BorrowLimitHubViewEvent.TapIncreaseLimitActionRow) borrowLimitHubViewEvent;
                    String str9 = tapIncreaseLimitActionRow.actionUrl;
                    analytics3.track(new BorrowLimitHubInteractTapCtaBullet(tapIncreaseLimitActionRow.analyticsId, str9), null);
                    RealRouter realRouter = (RealRouter) localEditorialPresenter.responseContextHandler;
                    BorrowLimitHub borrowLimitHub = (BorrowLimitHub) localEditorialPresenter.screen;
                    realRouter.route(new RoutingParams(borrowLimitHub, null, borrowLimitHub, null, null, null, HttpStatusCode.BAD_GATEWAY_502), str9);
                } else if (!(borrowLimitHubViewEvent instanceof BorrowLimitHubViewEvent.OpenUrl)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((IntentLauncher) localEditorialPresenter.service).launchUrlInInternalBrowser(((BorrowLimitHubViewEvent.OpenUrl) borrowLimitHubViewEvent).url);
                }
                break;
            case 25:
                if (((BorrowMultiStepLoadingViewEvent$Close) obj) != null) {
                    CreditMultiStepLoadingBlockerPresenter creditMultiStepLoadingBlockerPresenter = (CreditMultiStepLoadingBlockerPresenter) obj2;
                    BetterNavigator.ScreenNavigator screenNavigator11 = creditMultiStepLoadingBlockerPresenter.navigator;
                    BlockersDataNavigator blockersDataNavigator2 = creditMultiStepLoadingBlockerPresenter.blockersDataNavigator;
                    BlockersScreens.CreditMultiStepLoadingBlockerScreen creditMultiStepLoadingBlockerScreen = creditMultiStepLoadingBlockerPresenter.args;
                    ?? back4 = blockersDataNavigator2.getBack(creditMultiStepLoadingBlockerScreen, creditMultiStepLoadingBlockerScreen.blockersData);
                    if (back4 != 0) {
                        back = back4;
                    }
                    screenNavigator11.goTo(back);
                    break;
                } else {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                }
            case 26:
                MusicPresenter musicPresenter = (MusicPresenter) obj2;
                BetterNavigator.ScreenNavigator screenNavigator12 = (BetterNavigator.ScreenNavigator) musicPresenter.navigator;
                ExpandedLoanHistoryListEvent expandedLoanHistoryListEvent = (ExpandedLoanHistoryListEvent) obj;
                if (expandedLoanHistoryListEvent instanceof ExpandedLoanHistoryListEvent.Close) {
                    screenNavigator12.goTo(back);
                } else if (!(expandedLoanHistoryListEvent instanceof ExpandedLoanHistoryListEvent.DisplayLoanDetails)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ExpandedLoanHistoryListEvent.DisplayLoanDetails displayLoanDetails = (ExpandedLoanHistoryListEvent.DisplayLoanDetails) expandedLoanHistoryListEvent;
                    screenNavigator12.goTo(new BorrowHomeOverlay.LoanDetails(displayLoanDetails.loanDetails, displayLoanDetails.loanToken, (ExpandedLoanHistory) musicPresenter.args));
                }
                break;
            case 27:
                ((Braze) ((RealBrazeManager) ((BrazeSetupTeardownActivityWorker) obj2).brazeManager).braze$delegate.getValue()).setRegisteredPushToken(null);
                break;
            case 28:
                MusicPresenter musicPresenter2 = (MusicPresenter) obj2;
                InfoSheetViewEvents infoSheetViewEvents = (InfoSheetViewEvents) obj;
                if (Intrinsics.areEqual(infoSheetViewEvents, InfoSheetViewEvents.CloseSheet.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) musicPresenter2.navigator).goTo(back);
                } else if (!(infoSheetViewEvents instanceof InfoSheetViewEvents.OpenUrl)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((RealRouter) musicPresenter2.args).route(new RoutingParams(null, null, null, null, null, null, 511), ((InfoSheetViewEvents.OpenUrl) infoSheetViewEvents).url);
                }
                break;
            default:
                MusicPresenter musicPresenter3 = (MusicPresenter) obj2;
                OrderDetailsOverFlowSheetViewEvent orderDetailsOverFlowSheetViewEvent = (OrderDetailsOverFlowSheetViewEvent) obj;
                if (Intrinsics.areEqual(orderDetailsOverFlowSheetViewEvent, OrderDetailsOverFlowSheetViewEvent.OverflowCloseButtonClicked.INSTANCE)) {
                    ((BetterNavigator.ScreenNavigator) musicPresenter3.navigator).goTo(back);
                } else if (!(orderDetailsOverFlowSheetViewEvent instanceof OrderDetailsOverFlowSheetViewEvent.OverflowItemClicked)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ((RealRouter) musicPresenter3.args).route(new RoutingParams(AfterPayOrderDetailsScreen.copy$default(((OrderDetailsOverflowActionSheetScreen) musicPresenter3.musicPlayer).originScreen), null, null, null, null, null, 510), ((OrderDetailsOverFlowSheetViewEvent.OverflowItemClicked) orderDetailsOverFlowSheetViewEvent).route);
                }
                break;
        }
        return null;
    }

    public /* synthetic */ RealBrazeManager$openSession$1$1(CoroutineScope coroutineScope, MoleculePresenter moleculePresenter, int i) {
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
    }
}
